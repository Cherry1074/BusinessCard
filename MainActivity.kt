package com.example.businesscard

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.Illuminant.C
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.onBackground
                ){
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Box {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            val image = painterResource(id = R.drawable.android)
            Image(
                painter = image,
                contentDescription = "Android Logo",
                modifier = Modifier
                    .padding(10.dp)
                    .height(150.dp)
                    .width(150.dp)
            )
            Text(
                text = stringResource(id = R.string.full_name),
                color = Color.Black,
                fontSize = 32.sp
            )
            Text(
                text = stringResource(id = R.string.title),
                color = Color.Black,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(50.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 2.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(modifier = Modifier.height(90.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 75.dp, top = 50.dp)
                ) {
                    val phone = painterResource(id = R.drawable.call_logo)
                    Image(
                        painter = phone,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(8.dp)
                            .height(25.dp)
                            .width(25.dp)
                    )
                    Text(
                        text = "+11(234) 999 123 456",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.height(1.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 75.dp),
                ) {
                    val share = painterResource(id = R.drawable.share)
                    Image(
                        painter = share,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(8.dp)
                            .height(25.dp)
                            .width(25.dp)
                    )
                    Text(
                        text = "@Android_development",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.height(1.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 75.dp),
                ) {
                    val mail = painterResource(id = R.drawable.mail_logo)
                    Image(
                        painter = mail,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(8.dp)
                            .height(25.dp)
                            .width(25.dp)
                    )
                    Text(
                        text = "charishma.adangi@android.com",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}