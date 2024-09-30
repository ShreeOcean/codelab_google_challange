package com.ocean.mycodelab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ocean.mycodelab1.ui.theme.MyGoogleCodeLab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyGoogleCodeLab1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    ComposeArticleApp()
//                    AllTaskCompleteScreen()
//                    ComposeQuadrantApp()
                    BusinessCardUI()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(id = R.string.first_title),
                description = stringResource(id = R.string.first_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(id = R.string.second_title),
                description = stringResource(id = R.string.second_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(id = R.string.third_title),
                description = stringResource(id = R.string.third_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(id = R.string.fourth_title),
                description = stringResource(id = R.string.fourth_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ComposeArticleApp() {
    ArticleCard(
        title = stringResource(id = R.string.title_jetpack_compose_tutorial),
        shortDescription = stringResource(id = R.string.compose_short_desc),
        longDescription = stringResource(id = R.string.compose_long_desc),
        imagePainter = painterResource(id = R.drawable.bg_compose_background)
    )
}

@Composable
private fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortDescription,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = longDescription,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun AllTaskCompleteScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(id = R.string.all_task_complete),
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.nice_work),
            fontSize = 16.sp
        )
    }
}

/*@Composable
fun BusinessCardUI() {
    Surface(
        color = Color(0xFFD2E8D4),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            // Top Section (Logo, Name, Job Title)
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f) // Pushes the content upwards
            ) {
                //logo section
                Image(
                    painter = painterResource(id = R.drawable.ic_android_green),
                    contentDescription = "Android Logo",
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color(0xFF083D05), RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            //name section
            Text(
                text = "Pragyanshree Das",
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            )
            Spacer(modifier = Modifier.height(8.dp))

            //job title section
            Text(
                text = "Android Developer",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF005007),
                    fontFamily = FontFamily.Serif
                )
            )
            Spacer(modifier = Modifier.height(32.dp))
        }
        // Bottom Section (Contact Info)
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.fillMaxWidth()
        ) {
            //contact info section
            ContactInfo(
                icon = painterResource(id = R.drawable.contact_phone_green),
                info = "Available through email"
            )
            ContactInfo(
                icon = painterResource(id = R.drawable.share_green),
                info = "------------"
            )
            ContactInfo(
                icon = painterResource(id = R.drawable.contact_mail_green),
                info = "pragyan9423@gmail.com"
            )
        }

    }
}*/

@Composable
fun BusinessCardUI() {
    Surface(
        color = Color(0xFFE0F2E9), // Light green background color
        modifier = Modifier.fillMaxSize()
    ) {
            // Top Section (Logo, Name, Job Title)
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
                    .padding(16.dp), // Pushes the content upwards
            ) {
                // Logo section with "Android" text overlay
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color(0xFF083D05), RoundedCornerShape(13.dp)) // Dark green background
                ) {
                    // Logo Image
                    Image(
                        painter = painterResource(id = R.drawable.ic_android_green), // Replace with your logo drawable
                        contentDescription = "Android Logo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(60.dp) // Adjust size as needed
                    )
                    // "Android" Text Overlay
                    Text(
                        text = "android",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))

                // Name section
                Text(
                    text = "Pragyanshree Das",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))

                // Job title section
                Text(
                    text = "Android Developer",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF083D05), // Same dark green color
                        fontFamily = FontFamily.Serif
                    )
                )
                Spacer(modifier = Modifier.height(32.dp))
            }

            // Bottom Section (Contact Info)
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth().padding(80.dp)
            ) {
                // Contact info section
                ContactInfo(
                    icon = painterResource(id = R.drawable.contact_phone_green), // Replace with phone icon
                    info = "+11 (123) 444 555 666"
                )
                ContactInfo(
                    icon = painterResource(id = R.drawable.share_green), // Replace with share icon
                    info = "https://g.dev/das94235"
                )
                ContactInfo(
                    icon = painterResource(id = R.drawable.contact_mail_green), // Replace with mail icon
                    info = "pragyan9423@gmail.com"
                )
            }

    }
}


@Composable
private fun ContactInfo(
    icon: Painter,
    info: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth(0.9f)
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
                .padding(end = 11.dp),
            tint = Color(0xFF003004)
        )
        Text(
            text = info,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                textAlign = TextAlign.Right
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyGoogleCodeLab1Theme {
//        ComposeArticleApp()
//        AllTaskCompleteScreen()
//        ComposeQuadrantApp()
        BusinessCardUI()
    }
}