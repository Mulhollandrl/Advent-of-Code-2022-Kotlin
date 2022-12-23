package Day3

import java.io.File

fun readInput(name: String) = File(name).readLines()

fun findRepeatLetterPart1(line: String): String {
    val stringSize = line.split("").size
    val stringHalves = line.split("").chunked(stringSize/2)

    return stringHalves[0].intersect(stringHalves[1].toSet()).toList()[1]
}

fun findRepeatLetterPart2(lines: List<String>): String {
    return lines[0].split("").intersect(lines[1].split("").intersect(lines[2].split(""))).toList()[1]
}

fun findRepeatValue(repeatLetter: String): Int {
    var repeatValue = when (repeatLetter.lowercase()) {
        "a" -> 1
        "b" -> 2
        "c" -> 3
        "d" -> 4
        "e" -> 5
        "f" -> 6
        "g" -> 7
        "h" -> 8
        "i" -> 9
        "j" -> 10
        "k" -> 11
        "l" -> 12
        "m" -> 13
        "n" -> 14
        "o" -> 15
        "p" -> 16
        "q" -> 17
        "r" -> 18
        "s" -> 19
        "t" -> 20
        "u" -> 21
        "v" -> 22
        "w" -> 23
        "x" -> 24
        "y" -> 25
        "z" -> 26
        else -> 10000
    }

    if (repeatLetter.toCharArray()[0].isUpperCase()) {
        repeatValue += 26
    }

    return repeatValue
}

fun main() {
    val fileName = "src/Day3/data/input.txt"
    val input = readInput(fileName)
    val trios = input.chunked(3)

    println("The Priority Sum For Part 1 Is: ${input.sumOf { findRepeatValue(findRepeatLetterPart1(it)) }}")
    println("The Priority Sum For Part 2 Is: ${trios.sumOf { findRepeatValue(findRepeatLetterPart2(it)) }}")

}