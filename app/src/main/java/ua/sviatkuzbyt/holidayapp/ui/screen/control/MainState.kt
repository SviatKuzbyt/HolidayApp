package ua.sviatkuzbyt.holidayapp.ui.screen.control

data class MainState(
    val filterSetup: FilterSetup? = null
)

data class FilterSetup(
    val country: String = "",
    val year: String = ""
)