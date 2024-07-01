package com.example.summerpractice24

class CarBuilder(val brand: String) {
    private var model: String = ""
    private var year: Int = 0
    private var speed: Int = 0
    private var driveType: String = ""
    private var enginePower: Int = 0

    fun setModel(model: String) = apply { this.model = model }
    fun setYear(year: Int) = apply { this.year = year }
    fun setSpeed(speed: Int) = apply { this.speed = speed }
    fun setDriveType(driveType: String) = apply { this.driveType = driveType }
    fun setEnginePower(enginePower: Int) = apply { this.enginePower = enginePower }
    fun build() = Car(brand, model, year, speed, driveType, enginePower)
}