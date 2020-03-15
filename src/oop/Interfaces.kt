package oop
//Interface is a contract that a class signs up for:
//a class that implements an interface , must use the methods
//and properties found in the interface
//methods in an interface have no body
//- properties in an interface have no state
interface Developer{
    var goodDev:Boolean
    fun code()
}

interface Passionate{
    val geeky:Boolean
}
//implementing the interface
class KotlinDev(val name: String, var language: String) :Developer, Passionate{
    var country:String = "Kenya"
    override var goodDev: Boolean = true
    override var geeky: Boolean = false

    override fun code() {
        println("I can code in Kotlin")
    }

}

fun main(args: Array<String>) {
    val dev = KotlinDev("John Doe", "Kotlin")
    dev code()
    println(dev.country)
    println(dev.language)
    println(dev.goodDev)
}