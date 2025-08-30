// private example
class Person1{
    private var age = 0

    fun setAge(value : Int){
        age = value
    }
    fun showAge(){
        println("Age is $age")
    }
}

fun main() {

    val person  = Person1()
    person.setAge(20)
    person.showAge()

}
