import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
println("Main starts : ${Thread.currentThread().name}")

    val job1 = async {
        delay(1000)
        println("Fetching user data..")
        "User : Rohan"
    }

    val job2 = async {
        delay(1500)
        println("Fetching user score..")
        95
    }


    val user = job1.await()




}