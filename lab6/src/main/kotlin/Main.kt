import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val machine = CoffeeMachine()

    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")
        when (scanner.nextLine()) {
            "buy" -> {
                println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino")
                val userCoffee = scanner.nextLine()
                machine.buyingCoffee(userCoffee)
            }
            "fill" -> machine.fill()
            "take" -> machine.take()
            "remaining" -> machine.printStatus()
            "exit" -> return
        }
    }
}