package ua.sviatkuzbyt.holidayapp.ui.elements.basic

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ua.sviatkuzbyt.holidayapp.ui.other.indicationClick
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme

@Composable
fun MainButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .indicationClick(
                color = AppTheme.colors.secondary,
                onClick = onClick
            )
            .heightIn(48.dp)
            .background(
                color = AppTheme.colors.primary,
                shape = AppTheme.shapes.round
            )
    ){
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = AppTheme.types.white,
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 32.dp)
        )
    }
}