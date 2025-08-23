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

    // Do-While loop
    println("\nDo-While loop :")
    var x = 1
    do {
        println("x = $x")
        x++
    }while (x <= 5)

    // Break and Continue
    println("\nBreak & Continue Example :")
    for (i in 1..10){
        if (i == 6){
            println("Breaking at $i")
            break
        }
        if (i % 2 == 0){
            println("Skipping $i")
            continue
        }
    }

}