fun main() {


    val numbers = setOf(1,2,3,2,4,5,5,6) // duplicate are ignored

    println("Numbers Set : $numbers")
    println("Contains 3? ${numbers.contains(3)}")

    println("Total unique numbers : ${numbers.size}")

    //Loop through set
    for (num  in numbers){
        println(num)
    }

}