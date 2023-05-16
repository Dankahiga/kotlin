import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter your name:")
    var name  = readln()
    println("My name is $name")

    println("Enter an integer:")
    var num = read.nextInt()
    println("Entered $num")

    println("Enter your float:")
    var number = read.nextFloat()
    println("Entered $number")

    println("Enter length:")
    var length = read.nextFloat()
    println("Entered $length")

    println("Enter width:")
    var width = read.nextFloat()
    println("Entered $width")

    var area = length*width
    println("The area is:$area ")
}