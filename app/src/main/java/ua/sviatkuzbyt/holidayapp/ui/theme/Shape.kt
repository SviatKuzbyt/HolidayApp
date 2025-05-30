package ua.sviatkuzbyt.holidayapp.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

data class ThemeShape(
    val container: Shape = RoundedCornerShape(20.dp),
    val round: Shape = RoundedCornerShape(24.dp),
    val list: Shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
)