data class Person2(var name : String, var age : Int )

fun main() {

    val person = Person2("Unknown",0).apply {
        name = "Alice"
        age = 21

    }

    println("Person Details : $person")

}