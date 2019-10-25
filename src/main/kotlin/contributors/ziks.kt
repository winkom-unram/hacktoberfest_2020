package contributors

fun main(){
    val valueA = 200
    val valueB = 79
    val valueC = 90

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
        ResultA $resultA
        ResultB $resultB
    """.trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO 1
    var c = if (valueC == null) 100 else valueC
    val result = valueA + (valueB - c)
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = result
