open class shapee{
   open fun area(){
        println("Area")
    }
}
class ciircle:shapee(){
    override fun area(){
        println("Area of a circle ")
    }
}
class Triangle:shapee(){
    override fun area(){
        println("Area of a triangle ")
    }
}
class recctangle:shapee(){
    override fun area(){
        println("Area of a rectangle ")
    }
}
fun main(){
    var c = ciircle()
    c.area()

    var t = Triangle()
    t.area()

    var r = recctangle()
    r.area()
}