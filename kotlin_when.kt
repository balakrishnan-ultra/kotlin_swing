fun main()
{
        val day:Int = readLine()
        val findoutday = when(day)
        {
                1 -> "monday"
                2 -> "tuesday"
                3 -> "wensday"
                4-> "thesday"
                5-> "friday"
                6-> "saterday"
                7-> "sunday"

                else -> "invalid input"
        }
        println(findoutday)
}