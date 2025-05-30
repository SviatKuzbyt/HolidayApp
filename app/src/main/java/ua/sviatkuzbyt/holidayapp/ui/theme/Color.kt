package ua.sviatkuzbyt.holidayapp.ui.theme

import androidx.compose.ui.graphics.Color

data class ThemeColor(
    val primary: Color,
    val secondary: Color,
    val textPrimary: Color,
    val textSecondary: Color,
    val textWhite: Color,
    val background: Color
) {
    companion object{
        fun getLightColors() = ThemeColor(
            primary = Color(0xFF088395),
            secondary = Color(0xFFEEF6F8),
            textPrimary = Color(0xFF010D0F),
            textSecondary = Color(0xFF808687),
            textWhite = Color(0xFFFFFFFF),
            background = Color(0xFFFFFFFF)
        )

        fun getDarkColors() = ThemeColor(
            primary = Color(0xFF088395),
            secondary = Color(0xFF0D1B1D),
            textPrimary = Color(0xFFE6F3F4),
            textSecondary = Color(0xFF798384),
            textWhite = Color(0xFFE6F3F4),
            background = Color(0xFF0D1314)
        )
    }
}