package oop

import functions.sum

class calculator(num1:Int, num2:Int){

        var num1:Int
        var num2:Int


    init {
        this.num1 = num1
        this.num2 = num2

    }

    fun sum_of_two(){
        println("The sum of $num1 and $num2 is ${num1 + num2}")
    }
    fun sub_of_two(){
        println("The subtraction of $num1 and $num2 is ${num1 - num2}")
    }
    fun mult_of_two(){
        println("The multiplication of $num1 and $num2 is ${num1 * num2}")
    }
    fun div_of_two(){
        println("The division of $num1 and $num2 is ${num1 / num2}")
    }
    fun mod_of_two(){
        println("The modulo of $num1 and $num2 is ${num1 % num2}")
    }


}



fun main(){
    val v1 = calculator(23,25)
    val v2 = calculator(54,45)
    val v3 = calculator(67,88)

    v1.sum_of_two()
    v2.sub_of_two()
    v3.div_of_two()


}