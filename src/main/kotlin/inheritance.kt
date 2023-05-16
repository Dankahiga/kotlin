//Parent class
 open class Animal{
    var age:Int = 21
    var gender:String ="Male"

    fun isMammal(){
        println("Animal is a mammal")
    }

}
//Child classes
class Duck:Animal(){
    var color:String = "White"

    fun swim(){
        println("swimming")
    }

}
class Fish:Animal(){
   var canEat:Boolean=true

    fun swim(){
        println("Swimming")
    }

}
class Horse:Animal() {
    var isWild:Boolean=false

    fun run(){
        println("Running")
    }
}
 fun main(){
     var d = Duck()
     println(d.gender)

     var f = Fish()
     println(f.age)

     var h = Horse()
     h.isMammal()
 }