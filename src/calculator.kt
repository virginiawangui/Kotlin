import java.util.*

fun main() {

    val input = Scanner(System.`in`)
    print("Enter first Number: ")
    val firstNumber = input.nextInt()
    print("Enter second Number: ")
    val secondNumber = input.nextInt()
    print("Enter Action (+, -, *, /, %): ")
    val choice = input.next()[0]
    val result = when (choice) {
        '+' -> firstNumber + secondNumber
        '-' -> firstNumber - secondNumber
        '*' -> firstNumber * secondNumber
        '/' -> firstNumber / secondNumber
        '%' -> firstNumber % secondNumber
        else -> "Not a valid operation"

    }
    println(result)
}