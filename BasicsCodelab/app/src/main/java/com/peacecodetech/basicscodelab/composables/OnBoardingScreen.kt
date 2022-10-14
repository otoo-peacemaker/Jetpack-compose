package com.peacecodetech.basicscodelab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.peacecodetech.basicscodelab.ui.theme.BasicsCodelabTheme

/**
 * Callbacks are functions that are passed as arguments to other functions and get executed when the event occurs.
 * Try to add a function parameter to the on boarding screen defined as
 * onContinueClicked: () -> Unit so you can mutate the state from MyApp.
 * */

@Composable
fun OnBoardingScreen(onContinueClicked: () -> Unit) {
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome to the Basics Codelab!")
            Button(
                modifier = Modifier.padding(vertical = 24.dp),
                onClick = onContinueClicked
            ) {
                Text("Continue")
            }
        }
    }
}


@Preview(showBackground = true, widthDp = 320, heightDp = 520)
@Composable
fun OnBoardingPreview() {
    BasicsCodelabTheme {
        OnBoardingScreen(onContinueClicked = {})//Assigning onContinueClicked to an empty lambda expression means "do nothing", which is perfect for a preview.
    }
}