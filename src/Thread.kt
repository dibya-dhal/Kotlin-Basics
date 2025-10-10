fun main() {

    println("Main Thread starts : ${Thread.currentThread().name}")

    val thread = Thread{
        for (i in 1..5){
            println("Child Thread : $i")

            Thread.sleep(500)
        }
    }

    thread.start()
    thread.join()

    println("Main thread ends : ${Thread.currentThread().name}")

}