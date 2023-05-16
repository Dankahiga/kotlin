import java.util.Scanner
fun  main(){
    var read = Scanner(System.`in`)

    println("Enter A:")
    var lengthA = read.nextFloat()

    println("Enter B:")
    var lengthB = read.nextFloat()

    println("Enter height:")
    var height = read.nextFloat()
    
    var area = (0.5*(lengthA+lengthB)*height)
    println("The Area is:$area ")
}