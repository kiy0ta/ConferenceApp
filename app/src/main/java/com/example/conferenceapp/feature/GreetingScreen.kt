package com.example.conferenceapp.feature

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GreetingScreen(name: String) {
    Text(text = "Hello $name!")
}

@Composable
@Preview
fun PreviewGreetingScreen() {
    GreetingScreen("jetpack compose")
}