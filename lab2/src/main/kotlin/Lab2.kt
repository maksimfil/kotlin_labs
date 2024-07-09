import java.util.*

fun main() {
    println("Task 1. " + evenOrOdd(5))
    println("Task 2. " +multiplyByFourOrFive(7))
    println("Task 3. " +makeNegative(20))
    println("Task 4. " +calculateAge(2022))
    println("Task 5. " +findMinimum(listOf(34, 15, 88, 2)))
    println("Task 6. " +findTwoLargest(listOf(2, 15, 47, 45, 14, 7)))
    println("Task 7. " +positiveNegativeCount(listOf(1, 2, 3, 5, 7, 9, 10, -12, -13, -15)))
    println("Task 8. " +countVowels("My name Maks"))
    println("Task 9. " +findMiddleCharacter("mother"))
    println("Task 10. " +multiplicationTable(5))
}

fun evenOrOdd(num: Int): String {
    return if (num % 2 == 0){
        "Even"
    }else{
        "Odd"
    }
}

fun multiplyByFourOrFive(num: Int): Int {
    return if (num % 2 == 0) {
        num * 4
    } else{
        num * 5
    }
}

fun makeNegative(num: Int): Int {
    return -num
}

fun calculateAge(year: Int): Int {
    return (year - 1) / 100 + 1
}

fun findMinimum(numbers: List<Int>): Int {
    return numbers.minOrNull() ?: throw Exception("Список  пустий!")
}

fun findTwoLargest(numbers: List<Int>): List<Int> {
    val sortedNumbers = numbers.sortedDescending()
    return listOf(sortedNumbers[0], sortedNumbers[1])
}

fun positiveNegativeCount(numbers: List<Int>): List<Int> {
    if (numbers.isEmpty()) {
        return emptyList()
    }
    var positiveCount = 0
    var negativeSum = 0
    for (number in numbers) {
        if (number > 0) {
            positiveCount++
        } else if (number < 0) {
            negativeSum += number
        }
    }

    return listOf(positiveCount, negativeSum)
}

fun countVowels(str: String): Int {
    var count = 0
    for (char in str.lowercase(Locale.getDefault())) {
        if (char in "aeiouy") {
            count++
        }
    }
    return count
}

fun findMiddleCharacter(str: String): String {
    val middleIndex = str.length / 2
    return if (str.length % 2 == 0) {
        str.substring(middleIndex - 1, middleIndex + 1)
    } else {
        str[middleIndex].toString()
    }
}

fun multiplicationTable(n: Int): List<List<Int>> {
    val table = mutableListOf<List<Int>>()
    for (i in 1..n) {
        val row = mutableListOf<Int>()
        for (j in 1..n) {
            row.add(i * j)
        }
        table.add(row)
    }
    return table
}
