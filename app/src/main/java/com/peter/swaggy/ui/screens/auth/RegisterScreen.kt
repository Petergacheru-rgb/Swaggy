package com.peter.swaggy.ui.screens.auth

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.peter.swaggy.R
import com.peter.swaggy.model.User
import com.peter.swaggy.navigation.ROUT_LOGIN
import com.peter.swaggy.viewmodel.AuthViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(
    authViewModel: AuthViewModel,
    navController: NavController,
    onRegisterSuccess: () -> Unit
) {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    val context = LocalContext.current
    val animatedAlpha by animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(durationMillis = 1500, easing = LinearEasing),
        label = "Animated Alpha"
    )

    var role by remember { mutableStateOf("Buyer") }
    val roleOptions = listOf("Admin", "Customers")
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E1E1E))
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .width(360.dp) // Set a specific width for the card
                .background(Color(0xFF2D2D2D), shape = RoundedCornerShape(16.dp))
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sign up",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.align(Alignment.Start)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // First Name (mapping to username)
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("First name", color = Color(0xFF8D8D8D)) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF3A3A3A),
                    unfocusedBorderColor = Color(0xFF3A3A3A),
                    unfocusedContainerColor = Color(0xFF3A3A3A),
                    focusedContainerColor = Color(0xFF3A3A3A),
                    cursorColor = Color.White,
                    focusedLabelColor = Color(0xFF8D8D8D),
                    unfocusedLabelColor = Color(0xFF8D8D8D),
                ),
                textStyle = MaterialTheme.typography.bodyLarge.copy(color = Color.White)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Last Name (placeholder, not used in logic)
            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = { Text("Last name", color = Color(0xFF8D8D8D)) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF3A3A3A),
                    unfocusedBorderColor = Color(0xFF3A3A3A),
                    unfocusedContainerColor = Color(0xFF3A3A3A),
                    focusedContainerColor = Color(0xFF3A3A3A),
                    cursorColor = Color.White,
                    focusedLabelColor = Color(0xFF8D8D8D),
                    unfocusedLabelColor = Color(0xFF8D8D8D),
                ),
                textStyle = MaterialTheme.typography.bodyLarge.copy(color = Color.White)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Email
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email", color = Color(0xFF8D8D8D)) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF3A3A3A),
                    unfocusedBorderColor = Color(0xFF3A3A3A),
                    unfocusedContainerColor = Color(0xFF3A3A3A),
                    focusedContainerColor = Color(0xFF3A3A3A),
                    cursorColor = Color.White,
                    focusedLabelColor = Color(0xFF8D8D8D),
                    unfocusedLabelColor = Color(0xFF8D8D8D),
                ),
                textStyle = MaterialTheme.typography.bodyLarge.copy(color = Color.White)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Password
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password", color = Color(0xFF8D8D8D)) },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                textStyle = MaterialTheme.typography.bodyLarge.copy(color = Color.White),
                trailingIcon = {
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(
                            painter = if (passwordVisible) painterResource(R.drawable.passwordshow) else painterResource(R.drawable.passwordhide),
                            contentDescription = if (passwordVisible) "Hide Password" else "Show Password",
                            tint = Color(0xFF8D8D8D)
                        )
                    }
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF3A3A3A),
                    unfocusedBorderColor = Color(0xFF3A3A3A),
                    unfocusedContainerColor = Color(0xFF3A3A3A),
                    focusedContainerColor = Color(0xFF3A3A3A),
                    cursorColor = Color.White,
                    focusedLabelColor = Color(0xFF8D8D8D),
                    unfocusedLabelColor = Color(0xFF8D8D8D),
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Sign Up Button
            Button(
                onClick = {
                    if (username.isBlank() || email.isBlank() || password.isBlank() || password != confirmPassword) {
                        Toast.makeText(context, "Please fill all fields and ensure passwords match", Toast.LENGTH_SHORT).show()
                    } else {
                        authViewModel.registerUser(User(username = username, email = email, role = role, password = password))
                        onRegisterSuccess()
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Sign Up", color = Color.Black, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Password Requirements (Text)
            Text(
                text = "Password Requirements\n8 characters, 1 uppercase letter, 1 lowercase letter, at least one digit, at least one special character.",
                color = Color(0xFF8D8D8D),
                fontSize = 12.sp,
                modifier = Modifier.align(Alignment.Start)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Login Navigation Button
            TextButton(onClick = { navController.navigate(ROUT_LOGIN) }) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Login instead", color = Color.White)
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        Icons.Filled.ArrowForward,
                        contentDescription = "Login",
                        tint = Color.White,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
    }
}