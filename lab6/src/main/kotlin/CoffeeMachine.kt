import java.util.Scanner

class CoffeeMachine {
    private var water = 400
    private var milk = 540
    private var beans = 120
    private var cups = 9
    private var money = 550

    fun fill() {
        val scanner = Scanner(System.`in`)
        println("\nWrite how many ml of water you want to add:")
        water += scanner.nextInt()
        println("Write how many ml of milk you want to add:")
        milk += scanner.nextInt()
        println("Write how many grams of coffee beans you want to add:")
        beans += scanner.nextInt()
        println("Write how many disposable coffee cups you want to add:")
        cups += scanner.nextInt()
    }

    fun printStatus() {
        println("\nThe coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$money of money\n")
    }

    fun take() {
        println("I gave you $money\n")
        money = 0
    }

    fun buyingCoffee(userCoffee: String) {
        when (userCoffee) {
            "1" -> makingCoffee(Coffee.ESPRESSO)
            "2" -> makingCoffee(Coffee.LATTE)
            "3" -> makingCoffee(Coffee.CAPPUCCINO)
        }
    }

    private fun makingCoffee(coffee: Coffee) {
        if (checkingCoffee(coffee)) {
            doCoffee(coffee)
            println("I have enough resources, making you a coffee!\n")
        } else {
            println("Sorry, not enough ${notEnoughComp(coffee)}!\n")
        }
    }

    private fun notEnoughComp(coffee: Coffee): String {
        return when {
            water < coffee.water -> "water"
            milk < coffee.milk -> "milk"
            beans < coffee.beans -> "beans"
            else -> "cups"
        }
    }

    private fun checkingCoffee(coffee: Coffee): Boolean {
        return water >= coffee.water &&
                milk >= coffee.milk &&
                beans >= coffee.beans &&
                cups >= coffee.cups
    }

    private fun doCoffee(coffee: Coffee) {
        water -= coffee.water
        milk -= coffee.milk
        beans -= coffee.beans
        cups -= coffee.cups
        money += coffee.money
    }
}