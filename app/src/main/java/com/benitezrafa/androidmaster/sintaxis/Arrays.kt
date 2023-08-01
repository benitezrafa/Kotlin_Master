package com.benitezrafa.androidmaster.sintaxis

fun main() {

    //Indice de 0-6
    //Tamaño 8

    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo")
    //println(weekDays.size)

    //println(weekDays[0])

    //Tamaños
    if (weekDays.size >= 8) {
        //println(weekDays[7])
    } else {
        //  println("No hay mas valores en el array")
    }

    //Modificar valores
    weekDays[0] = "Feliz Lunes"

    //println(weekDays[0])

    //Bucles para Array
    for (position in weekDays.indices) {
        //println(weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()) {
        //println("La posición $position, contiene $value")
    }

    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }

}