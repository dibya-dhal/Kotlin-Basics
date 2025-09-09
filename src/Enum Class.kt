enum class Direction{
    NORTH,
    SOUTH,
    EAST,WEST
}

fun move(direction: Direction){
    when(direction){
        Direction.NORTH ->
            println("Moving up..")
        Direction.SOUTH ->
            println("Moving down..")
        Direction.EAST ->
            println("Moving right..")
        Direction.WEST ->
            println("Moving left..")
        //


    }
}

fun main() {

    val currentDirection  = Direction.NORTH
    println("Current Direction : $currentDirection")
    move(currentDirection)
    move(Direction.WEST)

}