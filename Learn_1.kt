fun sayhello(greeting:String, vararg itemsToGreet:String)
{
    itemsToGreet.forEach{itemToGreet ->
        println("$greeting $itemToGreet")
    }
    //This code is working, But it's throw the WARNING message
    /*
        Learn_1.kt:10:46: warning: redundant spread (*) operator.
    sayhello(greeting = "Hi", itemsToGreet = *interestingThings)

    */
}
fun main()
{
    val interestingThings = arrayOf("Kotlin","cpp","C")
    sayhello(greeting = "Hi", itemsToGreet = *interestingThings)

}
