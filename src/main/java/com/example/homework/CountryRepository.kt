package com.example.homework

object CountryRepository {
    val countries = listOf(
        Country(1, "Russia", "https://bel.cultreg.ru/uploads/3818e98b179614b3855f41352d6488cf.jpeg", "Europe/Asia", "Russia, the largest country in the world, spans Eastern Europe and northern Asia, covering an area of 17.1 million square kilometers."),
        Country(2, "China", "https://inteligenes.com/wp-content/uploads/2022/02/digital-marketing-course-17.jpg", "Asia", "China, officially the People's Republic of China, is the most populous country in the world, with a population of over 1.4 billion people."),
        Country(3, "USA", "https://www.rxwallpaper.site/wp-content/uploads/usa-flag-wallpaper-24.jpg", "North America", "The United States of America is a country composed of 50 states, a federal district, and several territories."),
        Country(4, "Canada", "https://ak.picdn.net/shutterstock/videos/1022449132/thumb/1.jpg", "North America", "Canada is a country in North America consisting of ten provinces and three territories."),
        Country(5, "Germany", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/1600px-Flag_of_Germany.svg.png", "Europe", "Germany is a country in Central and Western Europe, covering an area of 357,022 square kilometers."),
        Country(6, "Japan", "https://images.pond5.com/high-quality-realistic-flag-japan-footage-078514252_prevstill.jpeg", "Asia", "Japan is an island country in East Asia, located in the Pacific Ocean."),
        Country(7, "Brazil", "https://klev.club/uploads/posts/2023-11/1699150273_klev-club-p-trafareti-flag-brazilii-28.jpg", "South America", "Brazil is the largest country in both South America and Latin America.")
    )

    fun findById(id: Int): Country? {
        return countries.find { it.id == id }
    }
}