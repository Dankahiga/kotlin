fun main(){
    var name:String
    name = "Hello World"
    println(name)

    println(name[1])

    var fname:String
    fname = "Daniel"

    var lname:String
    lname = "Kahiga"
    println(fname+' '+lname)

    println(fname.plus(lname))
    println(name.toUpperCase())

    println(lname.length)
    println(name.indexOf("World"))

    println("Hello there, my name is $fname") //String Interpolation
}