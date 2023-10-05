package com.example.cardapp

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cardapp.ui.theme.CardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardAppTheme {

                Card()
            }
        }
    }
}


@Composable
fun Card() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFF9EBDAC)),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacer(modifier = Modifier.height(120.dp))

            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                Modifier
                    .background(Color(0xFF073042))
                    .width(150.dp)
            )

            Text(
                text = "Jennifier Doe",
                style = MaterialTheme.typography.displayLarge,
                fontStyle = FontStyle.Normal

            )
            Text(
                text = "Android Developer Extraordinaire",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = Color(0xE4197240),

                )

        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.width(52.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp),

                ) {

                Icon(
                    painter = painterResource(
                        R.drawable.baseline_call_24
                    ),
                    contentDescription = null,
                    tint = Color(0xE4197240)
                )
                Icon(
                    painter = painterResource(
                        R.drawable.baseline_share_24
                    ),
                    contentDescription = null,
                    tint = Color(0xE4197240)
                )
                Icon(
                    painter = painterResource(
                        R.drawable.baseline_email_24
                    ),
                    contentDescription = null,
                    tint = Color(0xE4197240)
                )
            }
            Spacer(modifier = Modifier.width(16.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    textAlign = TextAlign.Start,
                    text = "+11 (123) 444 555 666 ",
                    color = Color.Black,
                    fontStyle = FontStyle.Normal, style = MaterialTheme.typography.headlineSmall


                )
                Text(
                    textAlign = TextAlign.Start,
                    text = "@AndroidDev",
                    color = Color.Black,
                    fontStyle = FontStyle.Normal, style = MaterialTheme.typography.headlineSmall


                )
                Text(
                    textAlign = TextAlign.Start,
                    text = "jen.doe@android.com",
                    color = Color.Black,
                    fontStyle = FontStyle.Normal, style = MaterialTheme.typography.headlineSmall

                )
                Spacer(modifier = Modifier.height(16.dp))

            }
        }
    }
}

@Preview
@Composable
fun GreetingPreview() {
    CardAppTheme {
        Card()
    }
}