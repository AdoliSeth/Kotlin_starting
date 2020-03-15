package lesson1
//if statements in kt
//syntax
fun main() {
//    if(that condition is true){
//        code to execute if true
//    }else{
//        code to execute if false
//    }
    val x :Int = 10
    if (x<100){
        println("$x is less than 100")
    }else{
        println("$x is not less than")
    }
//    if as an expression
    val result = if (x<100){
        println("$x is less than 100")
    }else{
        println("$x is not less than")
    }

    println(result)

//    if...else...ladder

    val age = 17
    val restrict = if(age <= 18)
        "You are not allowed to party after party"
    else if (age > 18)
        "You can party"
    else
        "Program existing"

    println(restrict)

//    Looping in kt
    var xy=0
    while (xy<10){
        println(xy)
        xy++
    }

//    do{
//        code to execute
//    }while(condition is true)
//    var y:Int = 0
//    do{
//        println("$y HELoo world")
//        y++
//    }while (y < 10)
//}

//    In Kotlin, for loop is used to iterate through
//    ranges, arrays, maps and so on (anything that provides an iterator)
//
//    for(item in collection){
//        body of the loop
//    }

// looping using a range
//for (i in 0..10){
//        println(i)
//    }

var z:Int =0
while (z<=30){
if (z%3 == 0){
        println("$z FIZZ")
    }
    z++
}

    //looping using a range
    for(i in 0..50){
        if(i % 3 == 0 && i % 5 == 0){
            println("$i FIZZBUZZ")
        }else if (i % 3 == 0){
            println("$i FIZZ")
        }else if (i % 5 == 0){
            println ("$i BUZZ")
        }else{
            println("$i")
        }
    }





}

