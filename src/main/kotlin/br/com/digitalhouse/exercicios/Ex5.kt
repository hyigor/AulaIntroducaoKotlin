package br.com.digitalhouse.exercicios

fun analisaNumeros(n1: Int, n2: Int, n3: Int, n4: Int): Boolean {
    return (n1 > n3 && n1 > n4) || (n2 > n3 && n2 > n4)
}

fun main() {
    println(analisaNumeros(3, 5,7 ,8))
}