package analyzer

import java.io.File

fun main(args: Array<String>) {
    val list = File(args[0]).readLines()
    for (str in list) {
        if (str.contains(args[1])) {
            println(args[2])
            return
        }
    }
    println("Unknown file type")
}