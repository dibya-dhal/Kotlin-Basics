fun main() {

    println("Main Thread starts : ${Thread.currentThread().name}")

    // Creating a new thread using Thread class

    val task = Runnable{
        for (i in 1..5){
            println("Running task on  :${Thread.currentThread().name} -> $i")

            Thread.sleep(500) // pause for 0.5 sec
        }
    }

    val thread = Thread(task)
    thread.start() // start the thread
    thread.join() // wait for it to finish

    println("Main thread ends : ${Thread.currentThread().name}")

}