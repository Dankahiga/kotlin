import java.util.Scanner
fun  main(){
    var read = Scanner(System.`in`)
    var operator: Char
    var result: Double

    print("Enter the first number: ")
    var num1:Double
    num1 = read.nextDouble()

    print("Enter an operator (+, -, *, /): ")
    operator = readLine()!!.single()

    print("Enter the second number: ")
    var num2: Double
    num2 = read.nextDouble()

    result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> throw IllegalArgumentException("Invalid operator")
    }

    println("Answer is $result")
}