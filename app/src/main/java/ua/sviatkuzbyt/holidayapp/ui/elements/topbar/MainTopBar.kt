package ua.sviatkuzbyt.holidayapp.ui.elements.topbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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
            .clickable(
                onClick = onClick,
                role = Role.Button,
                interactionSource = null,
                indication = null
            )
            .padding(16.dp)
    )
}