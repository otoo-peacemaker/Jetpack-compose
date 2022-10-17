package com.peacecodetech.basicstatecodelab.ui.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {//main screen
    StatefulCounter(modifier)//display the water counter
}