package com.benitezrafa.androidmaster.sintaxis

val age: Int = 37


fun main() {
    showMyName()
    showMyAge(37)
    add(23, 76)
    val mySubtract = subtract(10, 5)
    println(mySubtract)

}

fun showMyName() {
    println("Me llamo BenitezRafa")
}

fun showMyAge(currentAge: Int = 37) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber

fun variableAlfanumerica() {

    /**
     *VARIABLES ALFANUMÉRICAS
     **/

    // Char

    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "BenitezRafa eres el mejor!!!!!r"
    val stringExample2 = "BenitesRafa"
    val stringExample3 = "154"
    val stringExample4 = "756"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    print(stringConcatenada)
    val example1234: String = age.toString()

}

fun variableBoolean() {
    /**
     *VARIABLES booleanas
     **/

    //Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
}


fun variablesNumericas() {

    /**
     *VARIABLES NUMÉRICAS
     **/

    //Int
    var age2: Int = 30
    age2 = 29


    println("Sumar")
    println(age + age2)

    println("Restar")
    println(age - age2)

    println("Multiplicar")
    println(age * age2)

    println("Dividir")
    println(age / age2)

    println("Módulo")
    println(age % age2)


    //Long
    val example: Long = 30

    //Float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 32123213.5435345
}