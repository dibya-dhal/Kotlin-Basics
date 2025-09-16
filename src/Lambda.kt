fun calculate(a : Int , b : Int , operation : (Int, Int) -> Int) : Int{
    return operation(a,b)
}