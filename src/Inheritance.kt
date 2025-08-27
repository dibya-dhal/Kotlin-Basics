// Parent class -open to allow inheritance

class Person(val name: String, val age : Int){

  fun  showDetails() {
        println("Name: $name , Age : $age")
    }
}