package ua.sviatkuzbyt.holidayapp.ui.elements.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ua.sviatkuzbyt.holidayapp.ui.screen.control.ListState
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme

@Composable
fun MainList(listState: ListState) {
    var detailPosition by rememberSaveable { mutableIntStateOf(-1) }
    LazyColumn(
        modifier = Modifier
            .background(color = AppTheme.colors.background, shape = AppTheme.shapes.list)
            .padding(top = 20.dp)
            .fillMaxSize()
    ) {
        when(listState){
            is ListState.Holidays -> {
                itemsIndexed(listState.list){ index, holiday ->
                    val isOpen = detailPosition == index
                    HolidayItem(
                        item = holiday,
                        isDetail = isOpen,
                        onItemClick = { detailPosition = if (isOpen) -1 else index }
                    )
                }
            }
            is ListState.Error -> item {
                ErrorItem(listState.message, {})
            }
            ListState.Loading -> item {
                LoadingItem()
            }
        }
    }
}