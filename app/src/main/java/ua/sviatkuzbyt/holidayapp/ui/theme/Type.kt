package ua.sviatkuzbyt.holidayapp.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ua.sviatkuzbyt.holidayapp.R

data class ThemeType(
    val bold: TextStyle,
    val basic: TextStyle,
    val boldSmall: TextStyle,
    val blue: TextStyle,
    val white: TextStyle,
    val gray: TextStyle
){
    companion object{
        private val fontFamily = FontFamily(
            Font(R.font.inter_regular, FontWeight.Normal),
            Font(R.font.inter_medium, FontWeight.Medium),
            Font(R.font.inter_bold, FontWeight.Bold),
        )
        
        fun getTypes(colors: ThemeColor) = ThemeType(
            bold = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = colors.textPrimary
            ),
            basic = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                color = colors.textPrimary
            ),
            boldSmall = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = colors.textPrimary
            ),
            blue = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                color = colors.primary
            ),
            white = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = colors.textWhite
            ),
            gray = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                color = colors.textSecondary
            )
        )
    }
}