import java.util.Scanner
fun  main() {
    var read = Scanner(System.`in`)

    println("Enter length:")
    var length = read.nextFloat()
    println("Length is:$length")

    println("Enter width:")
    var width = read.nextFloat()
    println("Width is: $width")

    var area = (length * width)
    println("The area is:$area ")
}
