fun main() {

    println("Main Thread starts : ${Thread.currentThread().name}")

    val task = Runnable{
        for (i in 1..5){
            println("Child Thread : $i")

            Thread.sleep(500)
        }
    }


}