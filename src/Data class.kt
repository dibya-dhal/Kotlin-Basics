data class Student1(val name: String, val age : Int,val course : String)

fun main() {
    val student1 = Student1("John Snow",20,"Computer Science")
    val student2 = Student("Rohit",21,"Mathematics")
    println(student1)
    println(student2)
}