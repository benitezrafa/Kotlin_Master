package com.benitezrafa.androidmaster.sintaxis

fun main() {
    mutableList()
}

fun mutableList() {
    val weekDay: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDay.add(0, "BenitezDay")
    println(weekDay)

    if (weekDay.isEmpty()) {
        //No voy a pintar nada porque no hay
    } else {
        weekDay.forEach { println(it) }
    }

    if (weekDay.isNotEmpty()) {
        weekDay.forEach { println(it) }
    }

    weekDay.last()

}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())


    //Filtrar
    val example = readOnly.filter { it.contains("e") }
    println(example)


    //Iterar
    readOnly.forEach { weekDay -> println(weekDay) }

}