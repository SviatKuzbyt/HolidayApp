package ua.sviatkuzbyt.holidayapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier

val LocalThemeColors = staticCompositionLocalOf<ThemeColor> { error("No colors yet") }
val LocalThemeTypes = staticCompositionLocalOf<ThemeType> { error("No types yet") }
val LocalThemeShapes = staticCompositionLocalOf<ThemeShape> { error("No shapes yet") }

@Composable
fun HolidayAppTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if(isDark)
        ThemeColor.getDarkColors()
    else
        ThemeColor.getLightColors()

    val type = ThemeType.getTypes(colors)
    val shapes = ThemeShape()

    CompositionLocalProvider(
        LocalThemeColors provides colors,
        LocalThemeTypes provides type,
        LocalThemeShapes provides shapes,
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colors.background)
                .windowInsetsPadding(WindowInsets.systemBars)
        ) {
            content()
        }
    }
}

object AppTheme {
    val colors: ThemeColor
        @Composable
        get() = LocalThemeColors.current

    val types: ThemeType
        @Composable
        get() = LocalThemeTypes.current

    val shapes: ThemeShape
        @Composable
        get() = LocalThemeShapes.current
}