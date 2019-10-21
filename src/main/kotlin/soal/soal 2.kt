package soal

fun main(){
    // TODO 1
    val user = mapOf<String, String>(
        "nama" to "anwar",
        "tgl" to "2020",
        "alamat" to "mataram"
    )

    // TODO 2
    val name = user.getValue("nama")
    val age = user.getValue("tgl")
    val address = user.getValue("alamat")

    // TODO 3
    println(name)
    println(age)
    println(address)

}