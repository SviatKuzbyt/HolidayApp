package ua.sviatkuzbyt.holidayapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import ua.sviatkuzbyt.holidayapp.ui.elements.MainList
import ua.sviatkuzbyt.holidayapp.ui.elements.MainTopBar

@Composable
fun MainScreen(){
    MainContent()
}

@Composable
fun MainContent(){
    Column {
        MainTopBar("Hello world!") {
            println("SKLT Hello world from MainTopBar")
        }

        MainList()
    }
}

