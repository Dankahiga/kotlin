class doog(var breed:String,var size:String,var age:Int ,var color:String){

    fun Eat(food:String){
        println("The dog is eating"+food)
    }

    fun Sleep(sleep:String){
        println("The dog is "+sleep)
    }

    fun Sit(sit: String){
        println("The dog is "+sit)
    }

    fun Run(run: String){
        println("The dog is "+run)
    }
}
fun main(){
    var d1 = doog("Neapolitan Mastiff","Large",5,"Black")
    println(d1.breed)
    d1.Eat("Pizza")

    var d2 = doog("Maltese","Small",2,"White")
    println(d2.breed)
    d2.Sleep("Sleeping")

    var d3 = doog("Chow Chow","Medium",3,"Brown")
    println(d3.breed)
    d3.Sit("sitting")

}