class car(){
    var make:String = "Subaru"
    var model:String = "Forester"
    var color:String = "White"
    var drivingSpeed:Int = 220


    fun drive(){
        println("Driving")
    }
    fun turn(){
        println("Left")
    }
    fun stop(){
        println("Stopping")
    }
}
fun main(){
    var vehicle = car()
    println(vehicle.make+" "+vehicle.model+" "+vehicle.color+" "+vehicle.drivingSpeed+"Km/h")

    vehicle.turn()
    vehicle.stop()
}