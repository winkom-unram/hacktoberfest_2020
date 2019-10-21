package com.winkom.kotlin

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

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO 1
    val result = 0
    return generateResult(result)
}

    // TODO 2
fun generateResult(result: Int) = 0