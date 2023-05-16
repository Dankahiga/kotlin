//Arithmetic Operators
 fun main(){
     var num:Int = 25
     var num1:Int = 6

    println(num+num1)
    println(num-num1)
    println(num/num1)
    println(num*num1)
    println(num%num1) //Modulus

 //Assignment Operator
    var x=5
    println(x)

    var y=35
    y%=7
    println(y)

    var a=78
    a-=5
    println(a)

 //Comparison Operators
    var number:Int = 100
    println(number<20)
    println(number>10)
    println(number==30)
    println(number<=30)
    println(number>=30)
    println(number!=30)

 //Logical Operators
    var myNumber = 90
    println(myNumber<100 && myNumber==30)//AND
    println(myNumber<100 || myNumber==30)//OR
    println(!(myNumber<100 || myNumber==30))//NOT
    println(myNumber.toFloat())

 }