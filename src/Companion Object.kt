class User private constructor(val name : String) {

    companion object {
        fun createGuest() : User{
            return User("Guest")
        }

        fun createWithName(name : String) : User {
            return User(name)
        }
    }
}

fun main() {

    val guest = User.createGuest()
    println("User : ${guest.name}")

    val Rohan = User.createWithName("Rohan")
    println("User : ${Rohan.name}")

}