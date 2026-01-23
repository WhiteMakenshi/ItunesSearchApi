package com.kmpcourse.itunessearchapi

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.kmpcourse.itunessearchapi.navigation.NavManager

@Composable
fun App() {
    MaterialTheme(colorScheme = lightColorScheme(primary = Color.Black)) {
        NavManager()
    }
}