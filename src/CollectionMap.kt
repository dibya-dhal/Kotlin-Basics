fun main() {

    val studentMarks = mapOf(1 to 85, 2 to 90 , 3 to 95)

    println("Student Marks : $studentMarks")

    // Access value by key
    println("Marks of roll number 2 : ${studentMarks[2]}")



    val number = listOf<Int>(2,4,6,8)
    val square = number.map { it * it }
    println("Squares : $square")

}