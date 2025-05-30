package ua.sviatkuzbyt.holidayapp.ui.screen.control

import androidx.annotation.StringRes

data class MainState(
    val filterTexts: FilterTexts? = null,
    val listState: ListState = ListState.Loading
)

data class FilterTexts(
    val country: String = "",
    val year: String = ""
)

sealed class ListState{
    data object Loading: ListState()
    data class Dates(val list: List<String>): ListState()
    data class Error(@StringRes val message: Int): ListState()
}