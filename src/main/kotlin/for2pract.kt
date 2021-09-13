fun sum(n: Int): Int {
    var s = 0
    var nn = n
    while (nn>0) {
        s+= nn % 10
        nn/=10
    }
    return s
}

fun main() {
    val s = readLine()!!
    println (sum(s.toInt()))
}