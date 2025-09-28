package com.ivan.loginapp.screens



import android.R.attr.text
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ivan.loginapp.ui.theme.BlackBackground
import com.ivan.loginapp.ui.theme.DarkWhiteBackground
import com.ivan.loginapp.ui.theme.LoginAppTheme
import com.ivan.loginapp.ui.theme.RegisterScreenRoute




@Composable
fun LoginScreen(navController: NavController){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box  (
        modifier = Modifier
            .fillMaxSize()
            .background(BlackBackground)
    ){

        // Logo
        Box(
            modifier = Modifier
                .padding(top = 80.dp)
                .size(100.dp)
                .align(Alignment.TopCenter)
                .clip(RoundedCornerShape(30.dp)),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(bottomStart = 18.dp, topStart = 18.dp, bottomEnd = 18.dp))
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                // Ícono principal
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Logo",
                    modifier = Modifier.size(38.dp),
                    tint = Color.Black
                )
            }
        }
        //Parte inferior del login
        Box(
            modifier = Modifier
                .padding(top = 250.dp)
                .fillMaxHeight()
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 75.dp))
                .background(DarkWhiteBackground)
        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.padding(top = 48.dp),
                    text = "Login",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize =30.sp,
                    textAlign = TextAlign.Center
                )

                //Column  for Email and Password
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(top = 70.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email") },
                        placeholder = { Text("Enter your Email") },
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(vertical = 8.dp)
                            .fillMaxWidth(0.85f)
                            .clip(RoundedCornerShape(15.dp))
                            .background(Color.White)
                    )

                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        placeholder = { Text("Enter your Password") },
                        visualTransformation = PasswordVisualTransformation(),
                        shape = RoundedCornerShape(8.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(vertical = 8.dp)
                            .fillMaxWidth(0.85f)
                            .clip(RoundedCornerShape(15.dp))
                            .background(Color.White)
                    )

                    Box(
                        modifier = Modifier
                            .padding(top = 24.dp)
                            .fillMaxWidth(0.85f)
                            .height(50.dp)
                            .clip(RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp))
                            .background(Color.Black),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Login",
                            color = Color.White
                        )
                    }
                }

                //Nav for Resgiter Screen
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(bottom = 32.dp),
                    contentAlignment = Alignment.BottomCenter

                ) {
                        Text(
                            modifier = Modifier
                                .clickable{
                                    navController.navigate(RegisterScreenRoute)
                                },
                            text =  "Don't have any account? Sign Up",
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Black
                        )




                }



            }


        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginAppTheme {
        LoginScreen(navController = rememberNavController())
    }
}