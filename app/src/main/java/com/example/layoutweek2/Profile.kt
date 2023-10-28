package com.example.layoutweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutweek2.ui.theme.LayoutWeek2Theme
import com.example.layoutweek2.ui.theme.black
import com.example.layoutweek2.ui.theme.darkRed
import com.example.layoutweek2.ui.theme.lightGray
import com.example.layoutweek2.ui.theme.mediumGray
import com.example.layoutweek2.ui.theme.white

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = mediumGray
                ) {
                    MainView4()
                }
            }
        }
    }
}

@Composable
fun MainView4() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .background(darkRed)
                .height(350.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(30.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = {},
                    modifier = Modifier.size(30.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.backwhite),
                        contentDescription = "backwhite",
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Text(
                    text = "Profile",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = white
                )

                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .size(40.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.edit),
                        contentDescription = "menu",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }

            Row(
                modifier = Modifier
                    .padding(30.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column() {
                    Text(
                        text = "Willy Cahyadi",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        color = white
                    )
                    Text(
                        text = "Ciputra University",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        color = white
                    )
                }

                Box(
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.foto),
                        contentDescription = "menu",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 320.dp)
                .padding(horizontal = 18.dp)
                .shadow(4.dp, shape = RoundedCornerShape(16.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = white, shape = RoundedCornerShape(16.dp))
                    .padding(25.dp)
            ) {
                Text(
                    text = "Personal Data",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = darkRed
                )
                Divider(
                    thickness = 1.dp,
                    color = lightGray,
                    modifier = Modifier
                        .padding(top = 10.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {
                    Column() {
                        Text(
                            text = "NIDN",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            modifier = Modifier.padding(top = 20.dp),
                            color = mediumGray
                        )
                        Text(
                            text = "0706012210053",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            color = black
                        )

                        Text(
                            text = "Occupation",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            color = mediumGray,
                            modifier = Modifier.padding(top = 20.dp)
                        )
                        Text(
                            text = "Student",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            color = black
                        )
                    }
                    Column() {
                        Text(
                            text = "Date Of Birth",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            color = mediumGray,
                            modifier = Modifier.padding(top = 20.dp)
                        )
                        Text(
                            text = "25 August 2004",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            color = black
                        )

                        Text(
                            text = "Marital Status",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            color = mediumGray,
                            modifier = Modifier.padding(top = 20.dp)
                        )
                        Text(
                            text = "Single",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 18.sp,
                            color = black
                        )
                    }
                }
                Text(
                    text = "Email",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    color = mediumGray,
                    modifier = Modifier.padding(top = 20.dp)
                )
                Text(
                    text = "wcahyadi01@student.ciputra.ac.id",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    color = black
                )
            }
        }

        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 720.dp)
                .padding(horizontal = 18.dp)
                .shadow(4.dp, shape = RoundedCornerShape(16.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = white, shape = RoundedCornerShape(16.dp))
                    .padding(25.dp)
            ) {
                Text(
                    text = "Expertise",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = darkRed
                )
                Divider(
                    thickness = 1.dp,
                    color = lightGray,
                    modifier = Modifier
                        .padding(top = 10.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                )
                {

                    Image(
                        painter = painterResource(id = R.drawable.androidstudio_logo),
                        contentDescription = "androidstudio",
                        modifier = Modifier.size(50.dp)
                    )

                    Text(
                        text = "Android Development",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = black,
                        modifier = Modifier.padding(horizontal = 15.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                )
                {

                    Image(
                        painter = painterResource(id = R.drawable.oop1),
                        contentDescription = "oop",
                        modifier = Modifier.size(50.dp)
                    )

                    Text(
                        text = "Object Oriented Programming",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp,
                        color = black,
                        modifier = Modifier.padding(horizontal = 15.dp)
                    )
                }

            }
        }

        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 970.dp, bottom = 20.dp)
                .padding(horizontal = 18.dp)
                .shadow(4.dp, shape = RoundedCornerShape(16.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = white, shape = RoundedCornerShape(16.dp))
                    .padding(25.dp)
            ) {
                Text(
                    text = "Send A Message",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = darkRed
                )
                Divider(
                    thickness = 1.dp,
                    color = lightGray,
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 20.dp)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 1.dp,
                            color = mediumGray,
                            shape = RoundedCornerShape(20.dp),
                        )
                        .background(color = Color.White)
                ) {
                    Text(
                        text = "Write A Message",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(vertical = 15.dp, horizontal = 15.dp),
                        color = mediumGray
                    )
                }
                Button(
                    onClick = { },
                    modifier = Modifier
                        .height(70.dp)
                        .width(130.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 15.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = white, containerColor = darkRed
                    ),
                ) {
                    Text(
                        text = "Send",
                        fontFamily = poppinsFamily,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfilePreview() {
    LayoutWeek2Theme {
        MainView4()
    }
}