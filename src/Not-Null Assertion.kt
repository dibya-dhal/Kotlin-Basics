fun main() {

    val name : String? = "Amit"

    val length = name!!.length
    println("Length of name : $length")

    // if value is null, it will throw NullPointerException

    val nickname: String? = null
    // println(nickname!!.length)// This will crash the program

}