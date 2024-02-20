package ru.earn1ll.gamecubes

class Dice(val numSizes:Int) {
    fun roll():Int {
        return (1..numSizes).random()
    }
}