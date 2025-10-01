class User1 {

    lateinit var name1 : String

    fun setName(newName : String){
        name1 = newName
    }

    fun printName() {
        if (::name1.isInitialized){
            println("User name is : $name1")
        }else {
            println("Name is not initialized yet")
        }
    }

}

fun main() {

    val user = User1()
    user.printName()

    user.setName("Rohan")
    user.printName()
}