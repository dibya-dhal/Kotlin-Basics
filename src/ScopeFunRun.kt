data class Laptop(var brand : String, var price : Int)

fun main() {

val laptop = Laptop("Unknown",0).run {
    brand = "acer"
    price = 50000
    this
}

    println("Laptop details : $laptop")


}