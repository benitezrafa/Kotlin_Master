package com.benitezrafa.androidmaster.exercises


/**
 * Las entradas de cine suelen tener un precio diferente según la edad de los espectadores.
En el código inicial que se proporciona en el siguiente frasmento de código, esccibe un programa que calcule los precios de estas entradas basados en
Un precio de entrada infantil de USD 15 para personas de 12 años o menos.
Un precio de entrada estándar de USD 30 para personas de entre 13 y 60 años Los Lunes, un precie estándar con descuento de USD 25 para el mismo acuRe
Un precio para adultos mayores de USD 20 para personas de 61 gños o más (asumimos que la edad máxima de un espectador es de 100 gños)
Un valor de -1 para indicar que el precio no es válido cuando un usuacio ingresa una edad fuera de las especificaciones
RESULTADO:
- The movie ticket price for a person aged 5 is $15.
-The movie ticket price for a person aged 28 is $25.
-The movie ticket price for a person aged 87 is $20.
A **/


fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println(
        "The movie ticket price for a person aged $senior is \$${
            ticketPrice(
                senior,
                isMonday
            )
        }."
    )

}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}