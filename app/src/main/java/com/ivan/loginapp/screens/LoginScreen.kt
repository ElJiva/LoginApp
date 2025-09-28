package com.ivan.loginapp.screens



import android.R.attr.text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .padding(top = 70.dp)
                    .background(Color.White)
                ) {
                    TextField(
                        value = text,
                        onValueChange = {newText ->
                            text = newText
                        },
                        label = {Text("Email")},
                        placeholder = {Text("Enter your Email")}


                    )

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