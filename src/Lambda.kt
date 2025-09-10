fun operator (a : Int, b : Int , op : (Int, Int) -> Int): Int {
    return op(a,b)
}
fun main() {

    val result = operator(5,4) {}
}