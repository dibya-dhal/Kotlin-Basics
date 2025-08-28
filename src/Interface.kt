interface Vehicle{
    fun start()
    fun stop() {
        println("Stopping vehicle...")
    }
}

class Car : Vehicle {
    override fun start() {
        println("Car is starting..")
    }
}

fun main() {

    val car = Car()
    car.start()
    car.stop()
}