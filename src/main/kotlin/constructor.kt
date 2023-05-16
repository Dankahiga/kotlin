class dog( var color:String , var breed:String , var sex:String, var age:Int){

}
fun main(){
    var d = dog("white", "German Shepherd","Female",5)

    println(d.color+" "+d.breed+" "+d.sex+" "+d.age)

    var puppy = dog("brown", "Kenyan","Male", 3)
    println(puppy.color+" "+puppy.breed+" "+puppy.sex+" "+puppy.age)
}
