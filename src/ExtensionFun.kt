fun String.addExclamation() : String {
    return this + "!"
}

fun Int.square() : Int{
    return this * this
}

fun main() {
    val text = "Hello".addExclamation()
    println("Text : $text")

    val number = 7.square()
    println("Square of 7 : $number")

}