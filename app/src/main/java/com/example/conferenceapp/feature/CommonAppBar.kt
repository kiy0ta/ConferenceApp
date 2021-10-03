package com.example.conferenceapp.feature

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.conferenceapp.R

@Composable
fun CommonAppBar() {
    TopAppBar(modifier = Modifier.fillMaxWidth()) {
        Box(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /* TODO : open side menu */ }) {}
                Icon(
                    painter = painterResource(id = R.drawable.ic_menu),
                    contentDescription = "icon image",
                    tint = colorResource(id = R.color.white),
                    modifier = Modifier.height(20.dp)
                )
            }
            CompositionLocalProvider {
                Box(modifier = Modifier.align(Alignment.Center)) {
                    Text(text = stringResource(id = R.string.title))
                }
            }
        }
    }
}

@Composable
@Preview
fun PreviewCommonAppBar() {
    CommonAppBar()
}