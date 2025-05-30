package ua.sviatkuzbyt.holidayapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import ua.sviatkuzbyt.holidayapp.ui.elements.FilterSetupContent
import ua.sviatkuzbyt.holidayapp.ui.elements.MainList
import ua.sviatkuzbyt.holidayapp.ui.elements.MainTopBar
import ua.sviatkuzbyt.holidayapp.ui.screen.control.FilterSetup
import ua.sviatkuzbyt.holidayapp.ui.screen.control.MainState

@Composable
fun MainScreen(){
    MainContent(MainState(FilterSetup()))
}

@Composable
fun MainContent(
    state: MainState
){
    Column {
        MainTopBar("Hello world!") {
            println("SKLT Hello world from MainTopBar")
        }

        state.filterSetup?.let {
            FilterSetupContent(
                countryText = "",
                onCountryChange = {},
                yearText = "",
                onYearChange = {},
                onUpdateClick = {}
            )
        }

        MainList()
    }
}

