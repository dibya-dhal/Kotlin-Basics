fun main() {

    val studentMarks = mutableMapOf(
        1 to 85,
        2 to 85,
        3 to 78
    )

    println("Original Students Marks : $studentMarks")
    println()

    studentMarks[4] =88

    studentMarks[2] = 95

    println("Update student Marks : $studentMarks")




}
