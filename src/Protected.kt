open class Parent2 {
    protected var secret = "family secret"
    protected fun tellSecret() {
        println("Telling secret : $secret")
    }
}
class Child: Parent2(){
    fun useSecret(){
        println(secret)
        tellSecret()
    }
}

fun main() {

    val c = Child()
    c.useSecret()

    //println(c.secret)  (it's show error)
}