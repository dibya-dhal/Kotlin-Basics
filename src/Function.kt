fun greet(name : String = "Guest") {
    println("Hello, $name!")
}

fun add(a: Int , b : Int): Int {
    return a + b
}

fun main() {
    greet("John")
    greet()// uses default value
    println("Sum : ${add(5,10)}")
}