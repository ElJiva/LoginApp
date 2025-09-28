package com.ivan.loginapp.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
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
import com.ivan.loginapp.ui.theme.LoginScreenRoute
import com.ivan.loginapp.ui.theme.RegisterScreenRoute

@Composable
fun RegisterScreen(navController: NavController){
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(BlackBackground)
    ){
        //Text Sign Up
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, start = 16.dp, end = 16.dp)
        ){
            // Icono ArrowBack
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Color.White,
                modifier = Modifier
                    .clickable {
                        navController.navigate(LoginScreenRoute)
                    }
                    .align(Alignment.CenterStart)
            )
            Text(
                text = "Sign Up",
                color = Color.White,
                fontSize = 35.sp,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.align(Alignment.Center)
            )
        }



        //Parte Blanca Fondo
        Box(
            modifier = Modifier
                .padding(top = 170.dp)
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 75.dp))
                .background(DarkWhiteBackground)
        ){
            Column(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedTextField(
                    value = firstName,
                    onValueChange = { firstName = it },
                    label = { Text("First Name") },
                    placeholder = { Text("Enter your First Name") },
                    shape = RoundedCornerShape(10.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(vertical = 8.dp)
                        .padding(top = 20.dp)
                        .fillMaxWidth(0.85f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.White)
                )
                OutlinedTextField(
                    value = lastName,
                    onValueChange = { lastName = it },
                    label = { Text("Last Name") },
                    placeholder = { Text("Enter your Last Name") },
                    shape = RoundedCornerShape(10.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(vertical = 8.dp)
                        .padding(top = 15.dp)
                        .fillMaxWidth(0.85f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.White)
                )

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
                        .padding(top = 15.dp)
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
                        .padding(top = 15.dp)
                        .fillMaxWidth(0.85f)
                        .clip(RoundedCornerShape(15.dp))
                        .background(Color.White)
                )
                OutlinedTextField(
                    value = confirmPassword,
                    onValueChange = { confirmPassword = it },
                    label = { Text("Confirm Password") },
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
                        .padding(top = 15.dp)
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
                        text = "Sign Up",
                        color = Color.White
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp),
                    contentAlignment = Alignment.BottomCenter

                ) {
                    Text(
                        modifier = Modifier
                            .clickable{
                                navController.navigate(LoginScreenRoute)
                            },
                        text =  "Already have any account? Sign in",
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
fun RegisterScreenPreview(){
    LoginAppTheme {
        RegisterScreen(navController = rememberNavController())
    }
}