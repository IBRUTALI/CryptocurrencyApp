package com.ighorosipov.cryptocurrencyapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ighorosipov.cryptocurrencyapp.presentation.screens.coin_detail.CoinDetailScreen
import com.ighorosipov.cryptocurrencyapp.presentation.screens.coin_list.CoinListScreen
import com.ighorosipov.cryptocurrencyapp.presentation.ui.theme.CryptocurrencyAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptocurrencyAppTheme {
                Surface {
                    val navController = rememberNavController()
                    NavHost(
                        navController,
                        startDestination = Screen.CoinListScreen.route
                    ) {
                        composable(
                            route = Screen.CoinListScreen.route
                        ) {
                            CoinListScreen(navController = navController)
                        }
                        composable(
                            route = Screen.CoinDetailScreen.route + "/{coinId}"
                        ) {
                            CoinDetailScreen(navController = navController)
                        }
                    }
                }

            }
        }
    }
}