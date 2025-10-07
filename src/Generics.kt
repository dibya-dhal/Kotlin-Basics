class Box<T> (val content : T){
    fun displayContent() {
        println("The content is : $content")
    }
}

fun <T> printTwice(value : T){
    println(value)
    println(value)
}

fun main() {
    val intBox = Box(123)
    intBox.displayContent()
    val stringBox = Box("Hello Kotlin")
stringBox.displayContent()

    println(intBox.displayContent())
    println(stringBox.displayContent())
}