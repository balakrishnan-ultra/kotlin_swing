
/*   //it's a command line single argument
fun main(args: Array<String>)
{
    if(args.isEmpty())
    {
        println("enter the command line argument")
    }
    else{
        println("hellow,${args[0]}")//if you given the space it's look like array,
    }
}
    */


//kotlin data type
fun main()
{
    /*val mynum: Int = 5;val mydouble: Double;
    val mychar : Char ='a'
    val onevalue:Boolean = true
    val word:String = "hellow"
    val word_1:String = "second"
    val mybyte : Byte = 1006789

    println(mybyte);println(word)
    */

    //kotlin print unicode charector
    //unicode tamil charector
    val t_1 = arrayOf("\u0B83","\u0b85","\u0b9e")
    val t_2 = arrayOf("\u0BC2","\u0BC1")
    println(t_1[2] + t_2[1])


}




