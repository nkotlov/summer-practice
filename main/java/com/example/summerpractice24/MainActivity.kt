package com.example.summerpractice24

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var textViewRaceResults: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNumberOfCars: EditText = findViewById(R.id.editTextNumberOfCars)
        val buttonStartRace: Button = findViewById(R.id.buttonStartRace)
        textViewRaceResults = findViewById(R.id.textViewRaceResults)

        buttonStartRace.setOnClickListener {
            val numberOfCars = editTextNumberOfCars.text.toString().toIntOrNull()
            if (numberOfCars != null && numberOfCars > 0) {
                val cars = generateCars(numberOfCars)
                val raceResults = StringBuilder()
                val race = Race(cars, raceResults)
                race.startRace()
                textViewRaceResults.text = raceResults.toString()
            } else {
                Log.d("MainActivity", "Please enter a valid number of cars")
                textViewRaceResults.text = "Please enter a valid number of cars"
            }
        }
    }

    private fun generateCars(numberOfCars: Int): List<Car> {
        val cars = mutableListOf<Car>()
        val brands = listOf("Toyota", "BMW", "Mercedes", "Ford")
        val models = listOf("Model S", "Model X", "Model 3", "Model Y")
        val driveTypes = listOf("FWD", "RWD", "AWD")

        for (i in 1..numberOfCars) {
            val car = CarBuilder(brand = brands.random())
                .setModel(models.random())
                .setYear(Random.nextInt(2000, 2022))
                .setSpeed(Random.nextInt(100, 300))
                .setDriveType(driveTypes.random())
                .setEnginePower(Random.nextInt(100, 500))
                .build()
            cars.add(car)
        }
        return cars
    }
}
