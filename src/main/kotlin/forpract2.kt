fun main() {
   val s = readLine()!!
    for (element in s)  {//Простой перебор символов в строке
        println (element.code-48) // Перевод символа в код символа
    }
} //127 - нужен массив из 128 элементов где каждому символу будет что-то соответсвовать