fun main() {

    val email: String? = "Rohan@example.com"
    val phone : String? = null

    email?.let {
        println("Email is available : $it")
    }


}