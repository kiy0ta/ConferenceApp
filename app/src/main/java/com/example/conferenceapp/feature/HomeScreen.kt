package com.example.conferenceapp.feature

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        CommonAppBar()
        ContentsListScreen()
    }
}

@Composable
@Preview
fun PreviewHomeScreen() {
    HomeScreen()
}