package contributors.rival

/**
 * created by Rivaldy on 10/27/2019
 */

fun main() {

    // TODO 1
    val user = mapOf(
        "name" to "Winkom",
        "age" to 2019,
        "address" to "Unram"
    )

    // TODO 2
    val name = user.getValue("name")
    val age = user.getValue("age")
    val address = user.getValue("address")

    // TODO 3
    fun cetak(){
        println("User")
        println("Name: $name")
        println("Age: $age")
        println("Address: $address")
    }
    cetak()
}
