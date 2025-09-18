fun String.addExclamation() : String {
    return this + "!"
}

fun Int.square() : Int{
    return this * this
}

fun main() {
    val text = "Hello".addExclamation()
    println(text)

}