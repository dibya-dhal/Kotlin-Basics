inline fun calculateNormal (a : Int, b: Int,operation: (Int, Int)-> Int): Int {
    return operation(a,b)
}
fun main() {


    val sumNormal = calculateNormal(10,5) {x , y -> x + y}
    println("Normal sum : $sumNormal")

    val productNormal = calculateNormal(10,5){x,y -> x * y}
    println("Normal product : $productNormal")

}