import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
val handler = CoroutineExceptionHandler { _,
    exception ->
    println("Caught exception : ${exception.message}")
}


}