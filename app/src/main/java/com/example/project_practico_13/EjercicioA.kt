package com.example.project_practico_13

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

class EjercicioA {
}

fun main(){
    var resultadoSuma = suma(5.19, 2.7F)
    println(resultadoSuma)

    var resultadoRedondeo = redondeo(4.43)
    println(resultadoRedondeo)

    var resultadoMuestra = muestraResultado(9.4)
    println(resultadoMuestra)
}

//fun main(param1: Double, param2: Float): Double = param1 + param2

fun suma (param1: Double, param2: Float): Double{
    return param1 + param2
}

//ceil redondea hacia arriba
//floor redondea hacia abajo
//roundToInt redondea de 0.5 hacia arriba(1) y 0.4 hacia abajo (0)
fun redondeo(param1: Double)= ceil(param1)

fun muestraResultado(numero: Double): String{
    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("CLP"))
    //println(format.format(numero))
    return format.format(numero)

}