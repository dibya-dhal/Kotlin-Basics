class Database {
    val connection: String by lazy {
        println("Connecting to Database")
        "DB connection Established"
    }

}

fun main() {

    val db = Database()

    println("Program started..")

    println(db.connection)

}