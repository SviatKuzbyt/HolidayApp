package ua.sviatkuzbyt.holidayapp.ui.other

import androidx.compose.foundation.clickable
import androidx.compose.material3.ripple
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp

fun Modifier.indicationClick(
    color: Color,
    radius: Dp = Dp.Unspecified,
    enabled: Boolean = true,
    onClick: () -> Unit
) = clickable(
    onClick = onClick,
    role = Role.Button,
    enabled = enabled,
    interactionSource = null,
    indication = ripple(
        color = color,
        radius = radius
    )
)

fun Modifier.basicClick(onClick: () -> Unit) = clickable(
    onClick = onClick,
    role = Role.Button,
    interactionSource = null,
    indication = null
)