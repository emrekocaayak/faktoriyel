fun faktoriyel(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main() {
    val sayi = 7
    val faktoriyelSonucu = faktoriyel(sayi)
    println("$sayi sayısının faktöriyeli: $faktoriyelSonucu")
}