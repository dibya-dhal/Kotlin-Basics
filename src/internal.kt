internal class Library {
    internal fun message() {
        println("This is internal message")
    }

}

fun main() {
    val lib = Library()
    lib.message()

}