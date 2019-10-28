package contributors.rival

/**
 * created by Rivaldy on 10/27/2019
 */

//untuk runningnya silahkan buat project baru di IJ dan copy file kt.

fun main(){
    print("mulai")
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

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO 1
    val valueCN = if (valueC != null) valueC else 100
    val result : Int = valueA + (valueB - valueCN)
    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int): Int {
    return result
}