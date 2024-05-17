package com.ighorosipov.cryptocurrencyapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ighorosipov.cryptocurrencyapp.presentation.ui.theme.CryptocurrencyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptocurrencyAppTheme {

            }
        }
    }
}