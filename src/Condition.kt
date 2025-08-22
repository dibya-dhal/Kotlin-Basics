fun main() {

   val number = 15

   // simple if Condition
    if (number > 10) {
        println("$number is greater than 10")
    }

    // if-else Condition
    if(number % 2 == 0){
        println("$number is Even")
    }else {
        println("$number is Odd")
    }

// if else if ladder
    if (number < 0) {
        println("Number is Negative")
    }else if (number == 0){
        println("Number is Zero")
    }else {
        println("Number is Positive")
    }

 // when statement
    val day = 5
    when(day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }



}