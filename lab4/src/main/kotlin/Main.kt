import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the number of rows:")
    val rows = scanner.nextInt()
    println("Enter the number of seats in each row:")
    val seatsPerRow = scanner.nextInt()

    val cinema = Cinema(rows, seatsPerRow)

    var option: Int
    do {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")
        option = scanner.nextInt()
        when (option) {
            1 -> cinema.showSeats()
            2 -> {
                println("\nEnter a row number:")
                val row = scanner.nextInt()
                println("Enter a seat number in that row:")
                val seat = scanner.nextInt()
                cinema.buyTicket(row, seat)
            }
            3 -> cinema.showStatistics()
        }
    } while (option != 0)
}