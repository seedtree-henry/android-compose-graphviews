package com.henry.graph_views.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.henry.graph_views.ui.theme.GraphviewsTheme

@Composable
fun Graph2() {

    Text(
        text = "2",
        fontSize = 30.sp
    )
}

@Preview(showBackground = true)
@Composable
fun Graph2Preview() {
    GraphviewsTheme {
        Graph2()
    }
}