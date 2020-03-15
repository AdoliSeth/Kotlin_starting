package arrays

fun main(args: Array<String>) {
//    Array is a collection of similar data types either of Int,String etc.
//    Array in Kotlin mutable in nature with fixed size which means we can perform both read and write
//            operations on elements of array.

//    Kotlin array size is fixed after creation
    //    in arrays one can not add a new item in the array but one can delete an item in an array

//    implicit
    var fruits = arrayOf("Banana","Mango","Oranges","Guavas")
    var ages = arrayOf(12,4,56,9)
    var mystaff = arrayOf("keyboard",4,"Kenyan",9, true)

//    explicit
    var counties = arrayOf<String>("Nairobi","Kiambu","Machakos")
    var population = arrayOf<Int>(12000,23,54,4343,233,18)
    var bools = arrayOf<Boolean>(true,false,false,false,true,true)

//    accessing array items
//    1.use index number
    println(fruits[0])
    println(ages[0])
    println(mystaff[0])
//    2.Use get function
    println(counties.get(1))
    println(population.get(1))
    println(bools.get(1))

//    Updating array values: use set() function
//    set () function takes two args 1.Position
//                                    2. Value
    counties.set(2, "Mombasa")
    println(counties.get(2))

//    Size of an array: use size() function
    val num_counties : Int = counties.size
    println(num_counties)


//    Looping through array values:use for loop
    for(fruit in fruits) {
        println(fruit)
    }
//    looping or traversing
    for(i in 0..num_counties- 1){
//        to print name of the counties
        println(counties[i])
//        println(counties.get(i))
    }

//    HashMap is a collection which contains pairs of objects.
//    HashMap() : It is the default constructor which constructs an empty HashMap instance
//    To create a HashMap you must specify the type of data for keys and values

//    Empty HashMap
    var rows :HashMap<String,Int> = HashMap<String, Int>()
//    print an empty HashMap
    println(rows)
//    Adding items in a HashMap : use put()
    rows.put("id", 1)
    rows.put("kipande", 2)
    rows.put("huduma ", 3)
    rows.put("kitambulisho", 4)
    println(rows)


//    accessing HashMap Values
//    use keys to access values
    println(rows["id"])
    println(rows["kipande"])
    println(rows["huduma"])
    println(rows["kitambulisho"])

//    Looping through a HashMap/traversing
    for (key in rows.keys) {
        println(key)
    }
//    Lopping through both keys and values
    for(key in rows.keys){
        println("$key matches with ${rows[key]}")
    }

    for( value in rows.values){
        println(value)
    }


}