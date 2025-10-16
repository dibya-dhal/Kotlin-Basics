import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
val handler = CoroutineExceptionHandler { _,
    exception ->
    println("Caught exception : ${exception.message}")
}

    val job = launch(handler){
        println("Coroutine started")
        delay(500L)
        throw ArithmeticException("Something went wrong!")
    }
    job.join()
    println("Main program continues..")



}