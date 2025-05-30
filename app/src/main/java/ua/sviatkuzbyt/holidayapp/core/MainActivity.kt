package ua.sviatkuzbyt.holidayapp.core

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ua.sviatkuzbyt.holidayapp.ui.screen.MainScreen
import ua.sviatkuzbyt.holidayapp.ui.theme.HolidayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolidayAppTheme {
                MainScreen()
            }
        }
    }
}