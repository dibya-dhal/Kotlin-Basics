fun main() {

    val a = 20
    val b = 6

    println("\n===== Arithmetic Operators ====")
    println("a + b : ${a + b }") // Addition
    println("a - b : ${a - b}") // substraction
    println("a * b : ${a * b}") // Multiplication
    println("a / b : ${a / b}") // Division (integer division)
    println("a % b : ${a % b}") // Modulus (remainder)

    val x = 15
    val y = 10

    println("\n=== Relational Operator ===")
    println("$x > $y : ${true}") //  true if X Greater than Y either false
    println("$x < $y : ${false}") // true if X less than Y either false
    println("$x >= $y: ${true}") // true if X Greater or equal Y
    println("$x <= $y :${false}") //true if X Less or equal Y either false
    println("$x == $y :${false}") //true if X Equal to Y either false
    println("$x != $y :${true}") // true if X Not equal to Y either false

    val num =15
    println("/\n=== Logical Operator ===")
    val result = (num > 10) && (num < 20) // AND
    println("Is $num between 10 and 20? : $result")
    val testOr = (num < 10) || (num > 20)//OR
    println("IS $num outside 10-20? : $testOr")

    println("NOT result : ${! result}")


    var n = 5
    println("\n=== Assignment Operator ===")

    n += 3 // same as n = n + 3
    println("After n += 3 -> $n")

    n -= 2 // same as n = n - 2
    println("After n -= 2 -> $n")

    n *= 4 // same as n = n * 4
    println("After n *= 4 -> $n")

    n /= 2 // same as n = n / 2
    println("After n /= 2 -> $n")


    var d = 10
    var p = 5

    println("\n=== Increment & Decrement ===")

// Pre increment : value increases first, then used
    println("Pre-increment of d (++d) : ${++d}") // d becomes 11

   //Post increment : value used first , then increases
   println("post-increment of p (p++) : ${p++} -> $p")

    // Pre decrement : value decreases first , then used
    println("pre-decrement of d (--d) : ${--d}")

    //Post decrement : value used first , then decreases
    print("post-decrement of p (p--) : ${p--} -> $p" )



}