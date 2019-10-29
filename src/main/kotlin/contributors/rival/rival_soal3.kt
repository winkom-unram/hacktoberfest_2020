package contributors.rival

/**
 * created by Rivaldy on 10/27/2019
 */

fun main() {
    val listNumber = 1.rangeTo(30)

    for (number in listNumber) {
        // TODO 1
        if (number % 2 == 0) continue

        // TODO 2
        if (number > 10) break

        // TODO 3
        val result = number * (number + 2)
        println("result is $result")
    }
}