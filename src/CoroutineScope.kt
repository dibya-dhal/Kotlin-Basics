import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
println("Main starts : ${Thread.currentThread().name}")

    GlobalScope.launch {
        delay(1000L)
        println("GlobalScope coroutine : ${Thread.currentThread().name}")
    }

    launch {
        delay(500L)
        println("runBlocking scope : ${Thread.currentThread().name}")
    }
    println("Main waiting..")
    delay(2000L)
    println("Main ends : ${Thread.currentThread().name}")


}