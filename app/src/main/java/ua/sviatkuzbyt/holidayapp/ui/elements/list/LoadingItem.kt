package ua.sviatkuzbyt.holidayapp.ui.elements.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme

@Composable
fun LazyItemScope.LoadingItem(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillParentMaxSize()
    ){
        CircularProgressIndicator(
            modifier = Modifier.width(40.dp),
            color = AppTheme.colors.secondary,
            trackColor = AppTheme.colors.primary,
            strokeWidth = 3.dp
        )
    }
}