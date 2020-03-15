package oop
//open class - is a class that can be inherited from

//open-argument means argument can be overridden
//abstract class means it can be inherited from but cannot create an object
//a normal class can create objects but cannot be inherited from
//class names start with capital

class Animal(var name: String, var origin:String){
//   declare empty variables that will be initialized in init{}
    val animal_name:String //property/variables
    val animal_origin:String
    //define init {} to assign values to class properties(variables)
    init {
//  assigning values to variables
        this.animal_name = name
        this.animal_origin = origin
    }

//  define methods
//    fun sound() :String = "Animal sound" // this is the same as the method below
    fun sound(){
    println("Animal sound")
}
    fun printDetails(){
        println("Animal name: ${this.animal_name}")
        println("Origin name: ${this.animal_origin}")

    }


}

open class Food(open val name:String, open val calories:Int){
    val food_name:String
    val food_calories:Int

    init {
        this.food_name = name
        this.food_calories = calories
    }

    fun printDetails(){
        println("${this.food_name} is made up of calories ${this.food_calories}")
    }



}

class AfricanFood(override val name: String, override val calories: Int):Food(name, calories){
 
}

class IndianFood(override val name: String, override val calories: Int):Food(name, calories){

}

abstract class Student(open val school:String, open val studentID:Int){
    fun intelligent():Boolean{
        return true
    } // same as below
//    fun intelligent():Boolean = true
    abstract fun get_grade()//it can have a different implementation in a sub class

}
class HighSchoolStudent(override val school: String, override val studentID: Int):Student(school,studentID){
    override fun get_grade() {
        println("Scored an A")
    }
    fun studentDetails(){
        println("Student come from $school")
        println("Student id: $studentID")
    }
}




abstract class GeneralPlayer(open val name:String,open var jerseyNumber:Int){
//    init is an object constructor and is executed the moment an object is created
    init {
        println("I am a sportsman")
    }

    fun run(){
        println("I can run fast")
    }

    abstract fun speak()

}

class PingPongPlayer(override val name:String, override var jerseyNumber: Int, age:Int): GeneralPlayer(name,jerseyNumber){
    var age:Int
    init {
        this.age = age
    }
    override fun speak(){
        println("Hello ping pong fans!!! I am $name")
    }

    fun birthday(){
        println("Year of birth is: ${2020 - age}")
    }
}

class SoccerPlayer(override val name:String, override var jerseyNumber: Int): GeneralPlayer(name,jerseyNumber){
    override fun speak() {
        println("Hello football fans!!! I am $name")
    }
}

fun main(args: Array<String>) {
    //val p1 = GeneralPlayer("Player 1",23)

    val soccerp = SoccerPlayer("Ronaldo",7)
    val ping = PingPongPlayer("Xi Pi Cheng",4,34)

    val generalAnimal = Animal("Mammal", "all over the world")

    ping.speak()
    soccerp.run()
    ping.birthday()
    generalAnimal.printDetails()
    generalAnimal.sound()

    val x = Food("Ugali", 100)
    x.printDetails()



}



