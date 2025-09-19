fun main() {

    val name : String? = "Kotlin"

    //using let to safely operate on nullable variable

    name?.let {
        println("Name of $it length : ${it.length}")
    }

    val num = 18
    num.let {
        val doubled = it * 2
        println("Doubled number : $doubled")
    }

}