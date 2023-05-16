import java.util.Scanner
fun  main() {
    var read = Scanner(System.`in`)

    val pi =3.14
    println("Enter radius:")
    var radius = read.nextFloat()
    println("Length is: $radius")

    var circumference = pi *(radius+radius)
    println("Circumference is: $circumference")


}