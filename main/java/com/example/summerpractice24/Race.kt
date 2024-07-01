package com.example.summerpractice24

import kotlin.random.Random

class Race(private val cars: List<Car>, private val raceResults: StringBuilder) {

    fun startRace() {
        val winners = mutableListOf<Car>()
        val carPairs = cars.shuffled().chunked(2)

        for (pair in carPairs) {
            if (pair.size == 2) {
                val winner = raceBetween(pair[0], pair[1])
                winners.add(winner)
                val result = "Race between ${pair[0].brand} and ${pair[1].brand}, Winner: ${winner.brand}\n"
                println(result)
                raceResults.append(result)
            } else {
                winners.add(pair[0])
                val result = "${pair[0].brand} has no opponent and automatically goes to the next round.\n"
                println(result)
                raceResults.append(result)
            }
        }

        if (winners.size > 1) {
            val nextRace = Race(winners, raceResults)
            nextRace.startRace()
        } else {
            val result = "Winner of the race is: ${winners[0].brand}\n"
            println(result)
            raceResults.append(result)
        }
    }

    private fun raceBetween(car1: Car, car2: Car): Car {
        return if (Random.nextInt(car1.speed) > Random.nextInt(car2.speed)) car1 else car2
    }
}
