import java.util.Scanner
fun  main(){
    var read = Scanner(System.`in`)


    println("Enter number 1:")
    var num1 = read.nextFloat()

    println("Enter number 2:")
    var num2 = read.nextFloat()

    println("Enter number 3:")
    var num3= read.nextFloat()



   if (num1>num2 && num1>num3) {
       println("$num1 is the greatest")
   }

    else if (num2>num1 && num2>num3) {
        println("$num2 is the greatest")
    }
    else{
        println("$num3 is the greatest")


    }





}