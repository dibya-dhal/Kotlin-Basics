class Database {
    val connection: String by lazy {
        println("Connecting to Database")
        "DB connection Established"
    }

}