//Abstract class
abstract class Animal1(val name: String){
 // abstract function
    abstract fun makeSound()
    fun sleep(){
        println("$name is sleeping..")
    }
}

// Child class Dog
class Dog1(name: String) : Animal1(name){
    override fun makeSound() {
        println("$name says Woof Woof!")
    }
}
//Child class Cat
class Cat(name: String):Animal1(name){
    override fun makeSound() {
        println("$name says : Meow Meow!..")
    }
}

fun main() {
    val dog = Dog1("Tommy")
    val cat = Cat("Kitty")
    dog.makeSound()
    cat.makeSound()

}