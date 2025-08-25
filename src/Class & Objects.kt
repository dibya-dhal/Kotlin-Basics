

    class Person(val name : String, var age : Int){
        fun show() {
            println("Hello, my name is $name and I am $age years old")
        }
    }


    fun main() {

        val p1 = Person("John",19)
        p1.show()
        val p2 = Person("Amit",20)
        p2.show()
    }