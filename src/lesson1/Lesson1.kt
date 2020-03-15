package lesson1

fun main(){
//    print("Hello world :)")
    print("Hello world")
    println()
    println("hello again")

//    variables in kotlin
//    You can declare a variable in Kotlin using var and val keywords
//    Implicit type inference
    val name = "John Doe"
    var language = "Kotlin"
//    reassign
    language = "Php"
    println(name)
    println(language)

//    Explicit type inference
    val age:Int = 23
    val country:String = "China"

    println(age)
    println(country)

//    age = 24 won't work
    println("I come from " + country + " and I am " + age + " years old.")
    println("I come from $country and  I am $age years old.")
    println("I come from $country and  I am $age years old and I will be ${age + 10} in ten years.")
    println(100 * 100)





//2. Short 16 bits
//3. Int 32 bits
//4. long 64 bits
//5. float 32 bits
//6. Double 64 bits

    val myByte:Byte = 10
    val myshort:Short = 150
    val myInt:Int = 242
    val myLong:Long = 230000000012012L
    val myFloat:Float = 12.343f
    val myDouble:Double = 12323.32324

    println(myByte)
    println(myshort)
    println(myInt)
    println(myLong)
    println(myFloat)
    println(myDouble)


//Type conversation
    println(myByte.toInt())
    println(myInt.toString())
    myshort.toByte()

    val isLoggedin:Boolean = true;
    val isGenius:Boolean = false;

    println(isLoggedin)
    println(isGenius)

//Strings
    val nam :String = "John Doe";
    println(nam.length)
    println(name[0])//prints j
    println(name[7])//prints e
    println(name.last())//prints e
}