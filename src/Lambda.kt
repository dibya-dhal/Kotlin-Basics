fun operator (a : Int, b : Int , op : (Int, Int) -> Int): Int {
    return op(a,b)
}