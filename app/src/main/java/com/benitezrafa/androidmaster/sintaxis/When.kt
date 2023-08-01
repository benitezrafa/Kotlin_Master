package com.benitezrafa.androidmaster.sintaxis

fun main() {
    getSemester(3)
}

fun result(value: Any) {
    when (value) {
        is Int -> value + value
        is String -> print(value)
        is Boolean -> if (value) print("Holiwi")
    }
}


fun getSemester(month: Int) = when (month) {
    in 1..6 -> "Primer Semestre"
    in 7..12 -> "Segundo Semestre"
    !in 1..12 -> "Semestre no valido"
    else -> "Shawarma"
}



fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> print("Primer trimestre")
        4, 5, 6 -> print("Segundo trimestre")
        7, 8, 9 -> print("Tercer trimestre")
        10, 11, 12 -> print("Cuarto trimestre")
        else -> print("Trimestre no valido")
    }
}


fun getMonth(month: Int) {
    when (month) {
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> println("No es un mes válido")
    }
}


/**
fun getMonth2(month: Int) {
if (month == 1) {
println("enero")
} else if (month == 2) {
println("febrero")
} else if (month == 3) {
println("marzo")
} else if (month == 4) {
println("abril")
} else if (month == 5) {
println("mayo")
} else if (month == 6) {
println("junio")
} else if (month == 7) {
println("julio")
} else if (month == 8) {
println("agosto")
} else if (month == 9) {
println("septiembre")
} else if (month == 10) {
println("octubre")
} else if (month == 11) {
println("noviembre")
} else if (month == 12) {
println("diciembre")
}else{
print("Este mes no ecxiste")
}
}
 **/