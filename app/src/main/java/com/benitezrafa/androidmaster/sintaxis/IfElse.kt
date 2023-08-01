package com.benitezrafa.androidmaster.sintaxis

fun main() {
    ifMultiple()

}

fun ifMultipleOR() {
    var pet = "dog"
    var isHappy = true

    if (pet == "dog" || (pet == "cat" && isHappy)) {
        println("É um gato o un perro?")
    }
}


fun ifMultiple() {
    var age = 18
    var parentPermission = false
    var imHappy = true

    if (age >= 18 && parentPermission && imHappy) {
        println("Puedo beber cerveza")
    }
}


fun ifInt() {
    var age = 37

    if (age >= 18) {
        println("Beber cerveza")
    } else {
        println("Beber zumo")
    }
}


fun ifBoolean() {
    var soyFeliz: Boolean = false

    //sin nada es == true
    //con ! es == false

    if (!soyFeliz) {
        println("Estoy triste :(")
    }
}

fun ifAnidado() {
    val animal = "bird"
    if (animal == "dog") {
        println("Es un perrito!")
    } else if (animal == "cat") {
        println("Es un gato!")
    } else if (animal == "bird") {
        println("Es un pajaro!")
    } else {
        println("No es uno de los animales esperados!")
    }
}

fun ifBasico() {
    val name = "Fofi"

    if (name == "Rafa") {
        println("Oye, la variable name es Rafa")
    } else {
        println("Este no es Rafa")
    }
}