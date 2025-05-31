package ua.sviatkuzbyt.holidayapp.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ua.sviatkuzbyt.holidayapp.ui.elements.MonthPicker
import ua.sviatkuzbyt.holidayapp.ui.elements.topbar.FilterSetup
import ua.sviatkuzbyt.holidayapp.ui.elements.list.MainList
import ua.sviatkuzbyt.holidayapp.ui.elements.topbar.MainTopBar
import ua.sviatkuzbyt.holidayapp.ui.screen.control.MainState

@Composable
fun MainScreen(){
    MainContent(MainState())
}

@Composable
fun MainContent(
    state: MainState
){
    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            MainTopBar("Hello world!") {
                println("SKLT Hello world from MainTopBar")
            }

            state.filterTexts?.let {
                FilterSetup(
                    countryText = "",
                    onCountryChange = {},
                    yearText = "",
                    onYearChange = {},
                    onUpdateClick = {}
                )
            }

            MainList(state.listState)
        }

        MonthPicker(
            state.month,
            onPreviousClick = { println("SKLT onPreviousClick") },
            onNextClick = { println("SKLT onNextClick") }
        )
    }

}

