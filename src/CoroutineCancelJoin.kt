import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
println("Main starts : ${Thread.currentThread().name}")

    val job = launch {
        repeat(5){
            i ->
            println("Coroutine working... step ${i + 1}")
            delay(500L)
        }
        println("Coroutine Completed..")

    }
    delay(1200L)
    println("Main : Cancelling coroutine after 1..2 seconds")
    job.cancel()
    job.join()


}