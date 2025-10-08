import java.lang.Exception

fun main() {

    try {
        val number = 10 / 0
        println("Result : $number")
    }catch (e: ArithmeticException){
        println("Error : Cannot be divided by zero..")
    }catch (e : Exception){
        println("Some other error occurred : ${e.message}")
    }finally {
        println("This block always executes (like closing resources). ")
    }

}