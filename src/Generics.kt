class Box<T> (val content : T){
    fun displayContent() : T = content
}

fun main() {
    val intBox = Box(123)
    val stringBox = Box("Hello Kotlin")


    println(intBox.displayContent())
    println(stringBox.displayContent())
}