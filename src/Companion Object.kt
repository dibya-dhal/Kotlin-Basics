class User private constructor(val name : String) {

    companion object {
        fun createGuest() : User{
            return User("Guest")
        }
    }
}