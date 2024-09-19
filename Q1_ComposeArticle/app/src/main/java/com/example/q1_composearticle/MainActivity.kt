package com.example.q1_composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.q1_composearticle.ui.theme.Q1_ComposeArticleTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Q1_ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            modifier = Modifier.padding(top = 40.dp)
        )
        Text(
            text = "Jetpack Compose Tutorial",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)

        )
        Text(
            text = stringResource(R.string.text_2),
            fontSize = 16.sp,
            modifier = Modifier.padding(16.dp)

        )

        Text(
            text = stringResource(R.string.text_3),
            fontSize = 16.sp,
            modifier = Modifier.padding(16.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Q1_ComposeArticleTheme {
        Greeting("Android")
    }
}