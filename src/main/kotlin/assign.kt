import java.util.Scanner
fun main(){
    var read = Scanner(System.`in`)

    println("Enter Number:")
    var num:Float
    num = read.nextFloat()

   if(num>0){
       println("Positive")
        }
    else if (num<0) {
       println("Negative")
   }
    else{
        println("Neutral")
    }



}