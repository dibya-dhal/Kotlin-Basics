import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    println("Main starts : ${Thread.currentThread().name}")


    launch {
        for (i in 1..5){
            println("Coroutine running : $i")
            delay(500L)
        }
    }

    println("Main coroutine on : ${Thread.currentThread().name}")
    delay(3000)

    println("Main ends : ${Thread.currentThread().name}")

}