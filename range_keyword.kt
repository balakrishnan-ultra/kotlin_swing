fun main()
{
    /*for(chars in 'a'..'x')
    {
        println(chars)
    }*/

    val nums = arrayOf(2,3,6,7,8,9,123)
    if(1234 in nums)
    {
        println("ok")
    }
    else{
        println("no")
    }




    for (nums in 5..15) 
    {
        if (nums == 10) 
        {
          break
        }
        println("forloop nums:$nums"+ addressOf(nums))
    }

      //address findout code
      println("address findout")
      println("nums array $nums")
}