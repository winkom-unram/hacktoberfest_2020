package contributors.rival

/**
 * created by Rivaldy on 10/27/2019
 */

// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false
        get() {
            println("Fungsi getter dipanggil")
            return field
        }
        set(value) {
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() {
        if (sleep.equals(true)){
            println("$name, sleep!")
        } else{
            println("$name, let's play!")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}