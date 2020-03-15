package oop

import functions.sum

class Player(wealth:Long, goat:Boolean, club:String){
    var mali :Long
    var mbuzi:Boolean
    var klabu:String

    //    init assigns values to variables that are inside a class
//    this means that this object that we are creating..i.e. p1.mali is wealth, p1 .mbuzi is goat

    init {
//        used to assign values to variables
//        this code will be called as soon as the object is created
        this.mali = wealth
        this.mbuzi = goat
        this.klabu = club
    }

//    val p1 = Player(2000_000, false, "Aston villa")
//    val p2 = Player(2000_000_000, true, "MANU")

    var gender:String = "male"
    var color:String = "black"

    fun printDtails(){
        println(this.mali)
        println(this.mbuzi)
        println(this.klabu)
    }

    fun printDetails(){
        println("This player is worth ${this.mali}")
        println("Is he a ${this.mbuzi} ?")
        println("He plays for ${this.klabu}")
    }






}

fun main(args: Array<String>){
    val p1 = Player(2000_000, false, "Aston villa")
    val p2 = Player(2000_000_000, true, "MANU")
    val p3 = Player(8000_000, true, "Liverpool")

    println(p1.color)
    println(p2.mali)
    println(p3.mbuzi)
    p1.printDtails()
    p2.printDtails()
    p3.printDtails()
    p1.printDetails()
    p2.printDetails()
    p3.printDetails()



}