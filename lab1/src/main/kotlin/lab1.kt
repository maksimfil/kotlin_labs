import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Привіт, мене звати DICT_Bot.")
    println("Нагадай мені своє ім'я")
    val name = scanner.nextLine()
    println("О, маєш класне ім'я $name!")

    println("Давай я вгадаю твій вік")
    println("Напиши залишки від ділення твого віку на 3, 5 та 7")
    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Тобі $age років!")

    println("Напиши мені число до якого ти хочеш шоб я порахував")
    val countTo = scanner.nextInt()
    for (i in 0..countTo) {
        println("$i!")
    }

    println("Давай перевіримо твої знання географії")
    println("Як назвивається столиця Франції")
    println("1. Лондон.")
    println("2. Париж.")
    println("3. Берлін.")
    println("4. Рим.")
    var answer: Int
    do {
        answer = scanner.nextInt()
        if (answer != 2) {
            println("Неправильно :(. Спробуй ще раз")
        }
    } while (answer != 2)
    println("Вірно! Париж - столиця Франції")
    println("Мої вітання, гарного дня ")
}
