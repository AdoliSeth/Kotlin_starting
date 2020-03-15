package functions

//syntax for function above the main function
//fun name_of_function(){
//    code to execute
//}
//function declaration/ creation
fun greetings1(){
    println ("Hello world")
}

//to call a function, you call it inside the main

//A function that takes a single  argument

fun greetings2(name : String){
    println("Hello $name")
}

//A function tht takes more than one argument
fun greetings3(name : String,age : Int){
    println("Hello $name, your age is $age")
}

fun greetings4(name : String, age: Int, country: String){
    println("Hello, I am $name, I am $age years old and I come from $country.")
}

fun greetings5(name : String, age: Int, country: String){
    println("Hello, I am $name, I will be ${age+10} in 10 years to come and I come from $country.")
}

fun sum(num1 : Int, num2 : Int){
    println("${num1 + num2}")
}

fun square(number : Int){
    println("${number*number}")
}

fun area(radius : Int){
    val p:Float = 3.142F
    println("${radius*radius*p}")
}
//functions that return values

fun sum_of_two(num1: Int, num2: Int):Int{
    val sum:Int = num1 + num2
    return sum
}

fun main(args: Array<String>){
//    a function is a block of code that is tasked to do a specific task/job
//    We use functions to wirte code that will be used repeatedly
//    A function can and can also not return a value
//    To use a function, you call it by using the name of the function followed by parenthesis
//    In Kotlin the fun keyword is used to declare a function
//
//    Syntax

greetings1()
greetings2("Seth")
greetings3("John", 23)
greetings4("John", 23, "Kenya")
greetings5("John", 23, "Kenya")
sum(1,2)
square(2)
area(3)

//    use the print function
println(sum_of_two(23,43))
//  store the returned value in a variable, then print
val s1: Int = sum_of_two(42,34)
val s2: Int = sum_of_two(45,34)
val s3: Int = sum_of_two(4342,34)
val s4: Int = sum_of_two(423,5344)
  println(s1)
  println(s2)
  println(s3)
  println(s4)
  println(s1 + s2 + s3 + s4)


}