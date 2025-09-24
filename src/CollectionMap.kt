fun main() {

    val studentMarks = mapOf(1 to 85, 2 to 90 , 3 to 95)

    println("Student Marks : $studentMarks")

    // Access value by key
    println("Marks of roll number 2 : ${studentMarks[2]}")
    println()



    val number = listOf<Int>(2,4,6,8)
    val square = number.map { it * it }
    println("Squares : $square")

    val names = listOf<String>("alice","rohan","charlie")
    val capitalized =names.map { it.replaceFirstChar { c -> c.uppercase()} }
    println("Capitalized : $capitalized")

}