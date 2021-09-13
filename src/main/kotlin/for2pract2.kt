//tailrec fun
//tailrec - хвостовая рекурсия
//Функция для суммирования но с помощью tailrec
//n=123 s = 0
//sum2(12, 0+3)
//sum2(1, 0+3+2)
//sum2(0, 0+3+2+1)
tailrec fun sum2(n: Int, s: Int = 0): Int { // Второй агрумент накопленная сумма цифр
    return if (n == 0) s
    else sum2(n/10, s + n %10)
}

fun main (){
    val s = readLine()!!
    println(sum2(s.toInt()))
}
//tailreg - рекурсивно вызвать можно только в конце где return