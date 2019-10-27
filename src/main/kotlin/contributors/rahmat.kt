package contributors

fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println(stringResult)
    println(intResult)
}

// TODO 1
fun <T> getResult(args: T): Int {
    var result: Int? = null
    when(args){
        is Int -> result = args*5
        is String -> result = args.length
        else -> result = 0
    }
    return result
}
