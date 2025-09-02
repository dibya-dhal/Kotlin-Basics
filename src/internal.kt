internal class Employee(private val name: String, private val salary: Double) {
    // internal function
    internal fun show() {
        println("Employee Name : $name, Salary : $salary")
    }

}

//another internal class
internal class Department(private val deptName: String){
    internal fun showDept(){
        println("Department: $deptName")
    }
}

fun main() {

    val emp = Employee("John",50000.0)
    emp.show()

    val dept = Department("Android Developer")
    dept.showDept()

}


