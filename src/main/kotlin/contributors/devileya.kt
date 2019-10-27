package contributors

fun main(){
    // TODO 1
    val user = mapOf<String, String>(
        "name" to "Winkom",
        "age" to "29",
        "address" to "Unram"
    )

    // TODO 2
    val name = user.getValue("name")
    val age = user.getValue("age")
    val address = user.getValue("address")

    // TODO 3
    println("User")
    println("Name: $name")
    println("Age: $age")
    println("Address: $address")
}
