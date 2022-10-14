package com.peacecodetech.basicscodelab

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.peacecodetech.basicscodelab.ui.theme.BasicsCodelabTheme


@Composable
fun Greetings(names: List<String> = List(1000) { "$it" }) {
    LazyColumn(modifier = Modifier.padding(vertical = 4.dp)) {
        //the data list
        items(items = names) { name ->
            Greeting(name = name)
        }
    }//LazyColumn and LazyRow are equivalent to RecyclerView in Android Views.
}


@Composable
private fun Greeting(name: String) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        CardContent(name)
    }
}

@Preview(showBackground = true, widthDp = 300)
@Composable
fun GreetingPreview() {
    BasicsCodelabTheme {
        Greetings()
    }
}
