data class Student1(val name: String, val age : Int,val course : String)

fun main() {
    val student1 = Student1("John Snow",20,"Computer Science")
    val student2 = Student1("Rohit",21,"Mathematics")
    val student3 = Student1("John Snow",20,"Computer Science")

    // toString() auto-generated
    println("Student1 : $student1")
    println("Student2 : $student2")

    // equals()
    println("Is student1 equal to student3 : ${student1 == student3}")
}