package com.example.conferenceapp.feature

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ContentsListScreen() {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(2) {
            // 仮
            Text(text = "android")
        }
    }
}

@Composable
@Preview
fun PreviewContentsListScreen() {
    ContentsListScreen()
}