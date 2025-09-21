data class Bike(var brand : String , var price: Int)

fun main() {

val bike = Bike("Unknown",0).also {
    it.brand= "Royal Enfield"
    it.price= 200000
    println("Inside also : $it")
}

    println("Outside also: $bike")

}