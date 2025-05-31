package ua.sviatkuzbyt.holidayapp.data

import androidx.annotation.StringRes
import ua.sviatkuzbyt.holidayapp.R

sealed class Month(val num: Int, @StringRes val name: Int){
    data object January: Month(1, R.string.january)
    data object February: Month(1, R.string.february)
    data object March: Month(1, R.string.march)
    data object April: Month(1, R.string.april)
    data object May: Month(1, R.string.may)
    data object June: Month(1, R.string.june)
    data object July: Month(1, R.string.july)
    data object August: Month(1, R.string.august)
    data object September: Month(1, R.string.september)
    data object October: Month(1, R.string.october)
    data object November: Month(1, R.string.november)
    data object December: Month(1, R.string.december)
}