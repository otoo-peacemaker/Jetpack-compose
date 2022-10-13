package com.peacecodetech.basicscodelab
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.peacecodetech.basicscodelab.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                // A surface container using the 'background' color from the theme
                MyApp()
            }
        }
    }
}


@Composable
private fun MyApp() {//HOISTING ONLY THE ON BOARDING IN MYAPP
    /*Instead of somehow sharing the value of the state with its parent,
    we hoist the state–we simply move it to the common ancestor that needs to access it.*/

    var shouldShowOnBoarding by remember { mutableStateOf(true) }//This is a property delegate that saves you from typing .value every time.

    if (shouldShowOnBoarding) {
        OnBoardingScreen(onContinueClicked = { shouldShowOnBoarding = false })//When the button is clicked, shouldShowOnboarding is set to false
    } else {
        Greetings()
    }
}


@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    BasicsCodelabTheme {
        MyApp()
    }
}