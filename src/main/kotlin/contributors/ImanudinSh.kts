package contributors

fun main(){
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
        ResultA $resultA
        ResultB $resultB
    """.trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1
    val newValueC = if(valueC==null)  100 else valueC
    val result = valueA + (valueB - newValueC)
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = "is $result"
