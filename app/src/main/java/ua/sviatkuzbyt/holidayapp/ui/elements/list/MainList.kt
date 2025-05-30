package ua.sviatkuzbyt.holidayapp.ui.elements.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ua.sviatkuzbyt.holidayapp.ui.screen.control.ListState
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme

@Composable
fun MainList(listState: ListState) {
    LazyColumn(
        modifier = Modifier
            .background(color = AppTheme.colors.background, shape = AppTheme.shapes.list)
            .fillMaxSize()
    ) {
        when(listState){
            is ListState.Dates -> {}
            is ListState.Error -> item {
                ErrorItem(listState.message, {})
            }
            ListState.Loading -> item {
                LoadingItem()
            }
        }
    }
}