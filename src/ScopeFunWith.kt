data class Book(var title : String, var author : String )

fun main() {


    val book = Book("Unknown","Unknown")

    val description = with(book){
        title = "Kotlin for Beginners"
        author = "John Doe"
        "Book : $title by $author  "
    }


    println(description)

}