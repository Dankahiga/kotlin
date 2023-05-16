open class figure{
    var start:String ="Start"

    fun Area(){
        println("Area")
    }

    fun Perimeter(){
        println("Perimeter")
    }

    fun Draw(){
     println("Figure")
    }
}
class circle:figure(){
    var Radius:Int =7

     fun area(){
        println("Area is "+3.14*Radius)
    }

    fun perimeter(){
        println("Circumference is "+3.14*Radius+Radius)
    }

    fun draw(){
        println()
    }
}
open class rectangle:figure(){
    var width:Int = 5
    var height:Int = 10

    fun area(){
        println("Area is "+width*height)
    }

    fun perimeter(){
        println("Perimeter is "+(width+height+width+height))
    }

    fun draw(){
        println("it is a rectangle")
    }
}
class square:rectangle(){

}
fun main(){
    var c = circle()
    c.area()

    var r = rectangle()
   r.perimeter()

    var s = square()
    s.Perimeter()
}