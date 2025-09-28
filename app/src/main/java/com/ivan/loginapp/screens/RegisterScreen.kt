package com.ivan.loginapp.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ivan.loginapp.ui.theme.BlackBackground
import com.ivan.loginapp.ui.theme.LoginAppTheme

@Composable
fun RegisterScreen(navController: NavController){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(BlackBackground)
    ){
        //Text Sign Up
        Box(
            modifier = Modifier
                .fillMaxSize()
        ){
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null
            )
        }



        //Parte Blanca Fondo
        Box(
            modifier = Modifier
                .padding(top = 170.dp)
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 75.dp))
                .background(Color.White)
        )
    }

}

@Preview
@Composable
fun RegisterScreenPreview(){
    LoginAppTheme {
        RegisterScreen(navController = rememberNavController())
    }
}