import java.util.Scanner
fun  main() {
    var read = Scanner(System.`in`)

    println("Enter length:")
    var length = read.nextFloat()
    println("Length is: $length")

    println("Enter width:")
    var width = read.nextFloat()
    println("Width is: $width")

    println("Enter height:")
    var height = read.nextFloat()
    println("Height is: $height")

    var volume = (length * width * height)
    println("The volume is: $volume ")
}
