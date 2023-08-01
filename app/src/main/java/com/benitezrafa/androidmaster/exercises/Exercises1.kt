package com.benitezrafa.androidmaster.exercises

fun main() {
    val morningNotification = 51
    val evenNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(evenNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {

    if (numberOfMessages >= 100) {
        println("Your phone is blowing up! You have more than 99+ notifications.")
    } else {
        println("You have $numberOfMessages notifications")
    }


}