class Cinema(val rows: Int, val seatsPerRow: Int) {
    private val cinemaLayout: Array<Array<Char>> = Array(rows) { Array(seatsPerRow) { 'S' } }
    private var totalIncome: Int = 0
    private var currentIncome: Int = 0
    private var ticketsSold: Int = 0

    init {
        totalIncome = if (rows * seatsPerRow <= 60) {
            rows * seatsPerRow * 10
        } else {
            val frontHalf = rows / 2
            val backHalf = rows - frontHalf
            (frontHalf * seatsPerRow * 10) + (backHalf * seatsPerRow * 8)
        }
    }

    fun showSeats() {
        println("Cinema:")
        print(" ")
        for (i in 1..seatsPerRow) {
            print(" $i")
        }
        println()
        for (i in cinemaLayout.indices) {
            print("${i + 1} ")
            for (j in cinemaLayout[i].indices) {
                print("${cinemaLayout[i][j]} ")
            }
            println()
        }
    }

    fun buyTicket(row: Int, seat: Int) {
        if (row !in 1..rows || seat !in 1..seatsPerRow) {
            println("Wrong input!")
            return
        }
        if (cinemaLayout[row - 1][seat - 1] == 'B') {
            println("That ticket has already been purchased!")
            return
        }
        val price = calculateTicketPrice(row)
        println("Ticket price: \$$price")
        cinemaLayout[row - 1][seat - 1] = 'B'
        currentIncome += price
        ticketsSold++
    }

    private fun calculateTicketPrice(row: Int): Int {
        return if (rows * seatsPerRow <= 60) {
            10
        } else {
            if (row <= rows / 2) {
                10
            } else {
                8
            }
        }
    }

    fun showStatistics() {
        val percentage = ticketsSold.toDouble() / (rows * seatsPerRow) * 100
        val formattedPercentage = "%.2f".format(percentage)
        println("Number of purchased tickets: $ticketsSold")
        println("Percentage: $formattedPercentage%")
        println("Current income: \$$currentIncome")
        println("Total income: \$$totalIncome")
    }
}