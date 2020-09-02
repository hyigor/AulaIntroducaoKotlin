package br.com.digitalhouse.exercicios

fun main() {
    println(maior(2,5,7))
}

//fun analise(num1: Int,num2: Int,num3: Int) : Int{
//    var comparar = ArrayList<Int>()
//
//    comparar.add(num1)
//    comparar.add(num2)
//    comparar.add(num3)
//    var valor = comparar.get(0)
//    for(maior in 0..comparar.size){
//        if (comparar.get(maior) > valor){
//            valor = comparar.get(maior)
//        }
//
//    }
//    return valor

fun maior(n1: Int, n2: Int, n3: Int){
    if (n1 > n2 && n1 > n3){
        println(n1)
    } else if (n2 > n1 && n2 > n3){
        println(n2)
    } else {
        println(n3)
    }
}

