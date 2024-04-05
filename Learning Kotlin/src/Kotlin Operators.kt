//Operators are used to perform operations on variables and values.
//The value is called an operand, while the operation to be performed between the two operands) is defined by an operator:

fun main(){
    var sumOfNumbers = 50+21
    println(sumOfNumbers)

    val totalSum = sumOfNumbers + 32
    println("Total Sum : $totalSum")

//Kotlin divides the operators into the following groups:
//Arithmetic Assignment  Comparison  Logical operators
    var firstValue = 5
    var secondValue = 6
    println(firstValue + secondValue)
    println(firstValue - secondValue)
    println(firstValue * secondValue)
    println(firstValue / secondValue)
    println(firstValue % secondValue)
    println(++firstValue)
    println(--secondValue)

// Comparison Operators
    val X = 3
    val Y = 6

    println(X==Y)
    println(X != Y)
    println(X >= Y)
    println(X <= Y)
    println(X > Y)
    println(X < Y)

// Logical Operators ( AND OR NOT )
    var num1 = 2
    var num2 = 4

    println(num1 > 2 && num2 < 7)
    println(num1 < 3 || num2 < 7)








}