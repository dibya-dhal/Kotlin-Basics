fun main() {

    try {
        val number = 10 / 0
        println("Result : $number")
    }catch (e: ArithmeticException){
        println("Error : Cannot be divided by zero..")
    }

}