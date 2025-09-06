class MathUtils {
    companion object{
        fun square(x : Int) : Int {
            return x * x
        }
    }
}

fun main() {

    println("Square : ${MathUtils.square(52)}")
}