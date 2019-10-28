package contributors.rival

/**
 * created by Rivaldy on 10/27/2019
 */

fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["second"]

    // TODO 2
    fun cetak(){
        print("First letter is $firstChar and $lastChar for second letter")
    }
    cetak()
}

// TODO 1
fun String.getFirstAndLast() = mapOf(
    "first" to this[0],
    "second" to this[this.length - 1]
)