import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    println("Enter temperature:")
    var temp = read.nextFloat()


    if (temp<37){
        println("It is too cold")
    }
    else if (temp>37){
        println("It is too hot")
    }
    else {
        println("Normal Temperature")
    }

}