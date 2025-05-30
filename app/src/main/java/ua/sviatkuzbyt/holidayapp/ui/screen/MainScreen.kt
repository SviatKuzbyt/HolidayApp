package ua.sviatkuzbyt.holidayapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
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
}

