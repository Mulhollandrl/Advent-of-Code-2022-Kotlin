package Day2

import java.io.File

class Solution {
    //A-x Rock
    //B-y Paper
    //C-z Scissors

    fun readInput(name: String) = File(name).readLines()

    fun scoreLinePart1(line: String): Int {
        val score = when (line) {
            "A X" -> 4
            "A Y" -> 8
            "A Z" -> 3
            "B X" -> 1
            "B Y" -> 5
            "B Z" -> 9
            "C X" -> 7
            "C Y" -> 2
            "C Z" -> 6
            else -> 0
        }

        return score
    }

    fun scoreLinePart2(line: String): Int {
        val score = when (line) {
            "A X" -> 3
            "A Y" -> 4
            "A Z" -> 8
            "B X" -> 1
            "B Y" -> 5
            "B Z" -> 9
            "C X" -> 2
            "C Y" -> 6
            "C Z" -> 7
            else -> 0
        }

        return score
    }
}

fun main() {
    val fileName = "src/Day2/data/input.txt"

    val solution = Solution()
    val input = solution.readInput(fileName)

    println("Your Total Score Is: ${input.sumOf { solution.scoreLinePart2(it) }}")
}