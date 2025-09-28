fun main() {

    val name : String = "Rohan"
    println("Name non-nullable : $name")

    var nickname : String? = null
    println("Nickname nullable : $nickname")

    val name1 : String? = null


    println("Length of name : ${name1?.length}")


}