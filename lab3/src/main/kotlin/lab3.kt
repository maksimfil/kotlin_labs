import java.util.*

fun main() {
    val options = arrayOf("камінь", "ножиці", "папір")
    val scanner = Scanner(System.`in`)
    val random = Random()

    while (true) {
        val computerIndex = random.nextInt(options.size)
        val computerChoice = options[computerIndex]

        println("Комп'ютер зробив свій вибір")
        println("Виберіть свій варіант: камінь, ножиці або папір")
        val userInput = scanner.nextLine().lowercase(Locale.getDefault())

        if (userInput !in options) {
            println("Неправильний ввід! Будь ласка, виберіть камінь, ножиці або папір.")
            continue
        }

        println("Ваш вибір: $userInput")

        if (userInput == computerChoice) {
            println("Комп'ютер також вибрав $computerChoice . Отже нічия!")
        } else if ((userInput == "камінь" && computerChoice == "ножиці") ||
            (userInput == "ножиці" && computerChoice == "папір") ||
            (userInput == "папір" && computerChoice == "камінь")
        ) {
            println("Комп'ютер вибрав $computerChoice тому Ви перемогли!")
        } else {
            println("Комп'ютер вибрав $computerChoice та переміг!")
        }
        break
    }

    println("Дякуємо за гру!")
}
