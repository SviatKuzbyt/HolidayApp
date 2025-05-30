package ua.sviatkuzbyt.holidayapp.core

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme
import ua.sviatkuzbyt.holidayapp.ui.theme.HolidayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolidayAppTheme {
                Text(
                    text = "Hello world!",
                    style = AppTheme.types.basic
                )
            }
        }
    }
}