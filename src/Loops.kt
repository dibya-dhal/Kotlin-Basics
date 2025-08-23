fun main() {

    //for loop with range
    println("for loop 1 to 5")
    for (i in 1..5){
        println("Number : $i")
    }

    // for loop with step
    println("\n for loop with step")
    for (i in 1..10 step 2){ // skip every 2 numbers
        println("Number : $i")
    }

    // for loop with array
    val array = arrayOf(10,15,20,30)
    println("\n for loop with Array:")
    for (num in array){
        println("Element : $num")
    }

}