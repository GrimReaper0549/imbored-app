package com.example.imbored

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import com.example.imbored.ui.theme.ImBoredTheme
import com.example.imbored.ui.BoredApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImBoredTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BoredApp()
                }
            }
        }
    }
}


// Light Theme Prev
@PreviewScreenSizes
@Composable
fun BoredAppPreview() {
    ImBoredTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            BoredApp()
        }
    }
}

// Dark Theme Preview
//@PreviewScreenSizes
//@Composable
//fun BoredAppDarkPreview() {
//    ImBoredTheme(darkTheme = true) {
//        Surface(modifier = Modifier.fillMaxSize()) {
//            BoredApp()
//        }
//    }
//}