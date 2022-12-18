package Day1

import java.io.File
import kotlin.collections.ArrayList

class Solution(path: String) {
    var path: String = "src/Day1/data/input.txt"
    var elfCaloriesList: ArrayList<Int> = ArrayList<Int>()

    init {
        this.path = path
    }

    fun readFile() {
        val file = File(path)
        var elfIndex = 0

        elfCaloriesList.add(0)

        file.forEachLine {
            if (it == "") {
                elfIndex++
                elfCaloriesList.add(0)
            } else {
                var currentElf = elfCaloriesList[elfIndex]
                currentElf += it.toInt()
                elfCaloriesList[elfIndex] = currentElf
            }
        }
    }

    fun printMostCaloriesElf() {
        elfCaloriesList.sort()

        println(elfCaloriesList[elfCaloriesList.size - 1])
    }

    fun printThreeMostCaloriesElf() {
        elfCaloriesList.sort()

        println(elfCaloriesList[elfCaloriesList.size - 1] + elfCaloriesList[elfCaloriesList.size - 2] + elfCaloriesList[elfCaloriesList.size - 3])
    }
}

fun main(args: Array<String>) {
    val solution = Solution("src/Day1/data/input.txt")
    solution.readFile()

//    Part 1
    println("The Solution to part one is:")
    solution.printMostCaloriesElf()

//    Part 2
    println("The Solution to part two is:")
    solution.printThreeMostCaloriesElf()
}