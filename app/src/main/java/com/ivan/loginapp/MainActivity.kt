package com.ivan.loginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ivan.loginapp.ui.theme.LoginAppTheme
import com.ivan.loginapp.screens.LoginScreen
import com.ivan.loginapp.screens.RegisterScreen
import com.ivan.loginapp.ui.theme.LoginScreenRoute
import com.ivan.loginapp.ui.theme.RegisterScreenRoute


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginAppTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = LoginScreenRoute
                    ) {
                        composable<LoginScreenRoute> { LoginScreen(navController) }
                        composable<RegisterScreenRoute> { RegisterScreen(navController) }
                    }
                }
            }
        }

    }
}