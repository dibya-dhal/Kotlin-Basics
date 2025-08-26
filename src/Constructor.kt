//Primary constructor
class Student(val name: String, val rollNo: Int) {
    var course: String = "Unknown"

    // init block - runs when object is created

    init {
        println("Student object created : Name : $name , Roll = $rollNo")
    }

    //Secondary constructor
    constructor(name: String, rollNo: Int, course: String) : this(name, rollNo) {
        this.course = course
    }

    fun showDetails() {
       println("Name : $name, Roll No: $rollNo, Course : $course")
    }

}

fun main() {

    val s1 = Student("Rahul",101,)
    val s2 = Student("Anita",101,"Bsc CS")

    s1.showDetails()
    s2.showDetails()
}
