import java.awt.Color

fun main() {
    val human = Human("Maureen",21,56.0)
    human.eat(7)
    human.speak("I love you so much")
    human.birthday(20)
    human.weight
val User=user("Gatweri","Mwendwa","mwendwa@gmail.com","0708844038",".lojht")
    println(User.firstName)
    println(User.email)
    println(User.password)

    val nissan = Car("Impreza","Subaru", "white",7)
    nissan.identity()
    nissan.calculateParkingFees(5)
    println(nissan.calculateParkingFees(5))
}
class Human(var name:String,var age:Int,var weight:Double){

    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(age:Int){
        println(age+1)
    }
}
data class user(
    var firstName:String,
    var lastName:String,
    var email:String,
    var phoneNumber:String,
    var password:String,

)
class Car(var make:String, var model:String, var color:String, var capacity:Int) {
    fun carry(people: Int) {
        var y = people - capacity
        if (people < capacity) {
            println("Carrying $people passengers")
        }
        else{
            println("over capacity by $y people")
        }

    }
    fun identity(){
        println("I am a $color $make $model")
    }
    fun calculateParkingFees(hours:Int):Int{
        return hours*20
    }
}
