enum class Direction{
    NORTH,
    SOUTH,
    EAST,WEST
}

fun move(direction: Direction){
    when(direction){
        Direction.NORTH ->
            println("Moving North..")
        Direction.SOUTH ->
            println("Going South..")
        Direction.EAST ->
            println("Moving EAST..")
        Direction.WEST ->
            println("Moving left..")



    }
}

fun main() {

    val currentDirection  = Direction.NORTH
    println("Current Direction : $currentDirection")
    move(currentDirection)
    move(Direction.WEST)

}