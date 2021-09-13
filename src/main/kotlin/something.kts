// строка в число
fun main () {
    val s = readLine() //String?
    if (s != null) {
        val i = s.toIntOrNull()
        if (i != null) {
            val s2 = readLine()
            val i2 = s2?.toIntOrNull()// .? - shield 'ot' null
            val i3 = i2!!
            println(if (i>i3) i else i3)// if - not operator, simply operations. That's max
            //ща будет как нельзя, но для примера можно
            //println (i+i2!!) // i2 - int?, !! - garant that not null
            println(i+1)
        }else println("Неправильное число")
    } else println ("Error enter")

}