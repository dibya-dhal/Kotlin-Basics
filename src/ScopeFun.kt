fun main() {

    val name : String? = "Kotlin"

    name?.let {
        println("Name of $it length : ${it.length}")
    }

}