package contributors.rival

/**
 * created by Rivaldy on 10/27/2019
 */

import kotlinx.coroutines.*

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L)
    return valueA+valueB
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000L)
    return valueA*valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3
    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")
}