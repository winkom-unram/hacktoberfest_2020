import kotlinx.coroutines.*

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L)
    var rSult = valueA + valueB
    return rSult
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000L)
    var kSult = valueA + valueB
    return kSult
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(200, 200) }

    // TODO 3
    println("Result sum: ${resultSum.await()}")
    println("Result multiple: ${resultMultiple.await()}")
}
