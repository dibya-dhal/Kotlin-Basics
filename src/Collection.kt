fun main() {

    val fruits = listOf("Apple","Orange","Mango")

    println("Fruits List : $fruits")
    println("First fruit : ${fruits[0]}")
    println("Total fruits : ${fruits.size}")
    println()

    //MutableList
    val numbers = mutableListOf(1,2,3)

    println("Original List : $numbers")
    numbers.add(4)
    numbers.add(5)
    println("Updated List : $numbers")
    numbers.remove(2)
    numbers[0] = 10
    println("Updated list : $numbers")
    println()

    numbers.forEach {  println("Number : $it")}


}