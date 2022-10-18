package com.pras.myhappybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.pras.myhappybirthday.ui.theme.MyHappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyHappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(
                        "Happy Birthday Pras !",
                        "- from Elsa"
                    )
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(image, null)
        BirthdayGreetingWithText(
            "Happy Birthday Pras !",
            "- from Elsa"
        )
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    Column {
        Text(
            text = message,
            fontSize = 36.sp
        )
        Text(
            text = from,
            fontSize = 24.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyHappyBirthdayTheme {
        BirthdayGreetingWithImage(
            "Happy Birthday Pras !",
            "- from Elsa"
        )
    }
}
