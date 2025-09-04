sealed class Result

data class Success(val data : String) : Result()
data class Error(val message : String): Result()

fun handleResult(result: Result) {
    when(result) {
        is Success -> println("Success : ${result.data}")
        is Error -> println("Error : ${result.message}")
    }
}
fun main() {

    val r1 : Result = Success("Data Loaded..")
    val r2 : Result = Error("Network Error")

    handleResult(r1)
    handleResult(r2)
}