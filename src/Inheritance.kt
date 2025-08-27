// Parent class -open to allow inheritance

open class Animal{

    fun eat(){
        println("Animal is eating")
    }
}
// Child class inherit from Animal
class Dog: Animal(){
    fun bark(){
        println("Dog is barking..")
    }
}

fun main() {
    val dog = Dog()
    dog.eat()
    dog.bark()

}