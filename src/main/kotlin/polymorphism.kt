open class Shape{
    open fun draw(){
        println("Drawing")
    }
}
class reectangle:Shape(){
   override fun draw(){
       println("Drawing a square")

   }   }

class sqquare:Shape(){
    override fun draw(){
        println("Drawing a square")
    }
}
fun main(){
    var r = reectangle()
    r.draw()

    var s=sqquare()
    s.draw()
}