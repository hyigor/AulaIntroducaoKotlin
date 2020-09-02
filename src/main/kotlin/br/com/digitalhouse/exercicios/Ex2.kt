package br.com.digitalhouse.exercicios

fun main() {
    println(compararTxt("Igor", "Igor"))
}

fun compararTxt(txt1:String, txt2:String) : Boolean{

    return txt1.equals(txt2)

}