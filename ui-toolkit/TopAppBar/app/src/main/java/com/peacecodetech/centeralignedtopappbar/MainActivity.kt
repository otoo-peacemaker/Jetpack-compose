package com.peacecodetech.centeralignedtopappbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.peacecodetech.centeralignedtopappbar.ui.theme.CenterAlignedTopAppBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIKitApp()
        }
    }
}

@Composable
fun UIKitApp() {
    CenterAlignedTopAppBarTheme {
        Scaffold(
            topBar = { TopAppBar() }) {
            HomeScreen(Modifier.padding(it))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewUIKitApp() {
    CenterAlignedTopAppBarTheme {
        UIKitApp()
    }
}