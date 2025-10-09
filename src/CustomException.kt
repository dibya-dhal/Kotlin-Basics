class InvalidAgeException(message: String) : Exception(message)
fun checkAge(age: Int){
    if (age < 18){
        throw InvalidAgeException("Age must be 18 or above")
    }else {
        println("Access granted : Age: $age")
    }
}

fun main() {

    try {
        checkAge(15)
    }catch (e: InvalidAgeException){
        println("Custom Exception Caught : ${e.message}")
    }finally {
        println("Check completed")
    }

}