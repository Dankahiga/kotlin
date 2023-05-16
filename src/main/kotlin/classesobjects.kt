class Person{
    var name:String = "Daniel"
    var age:Int = 23
    var location:String = "Nairobi"
    var yearOfBirth:Int = 2000

    fun eat(){
        println("Eating")
    }
    fun sleep(){
        println("Sleeping")
    }

}
fun main(){
    var teacher = Person()
    println(teacher.location)

    teacher.eat()
}