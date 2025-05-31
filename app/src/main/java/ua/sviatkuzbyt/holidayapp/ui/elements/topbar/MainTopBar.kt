package ua.sviatkuzbyt.holidayapp.ui.elements.topbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ua.sviatkuzbyt.holidayapp.ui.other.basicClick
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme

@Composable
fun MainTopBar(
    text: String,
    onClick: () -> Unit
){
    Text(
        text = text,
        textAlign = TextAlign.Center,
        style = AppTheme.types.bold,
        modifier = Modifier
            .fillMaxWidth()
            .basicClick(onClick)
            .padding(16.dp)
    )
}