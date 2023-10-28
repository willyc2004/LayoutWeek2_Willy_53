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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutweek2.ui.theme.LayoutWeek2Theme
import com.example.layoutweek2.ui.theme.brightRed
import com.example.layoutweek2.ui.theme.darkRed
import com.example.layoutweek2.ui.theme.lightGray
import com.example.layoutweek2.ui.theme.mediumGray
import com.example.layoutweek2.ui.theme.white

class Register : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = mediumGray
                ) {
                    MainView3()
                }
            }
        }
    }
}


@Composable
fun MainView3() {
    Column(
        modifier = Modifier
            .background(brightRed)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Row(modifier = Modifier.padding(20.dp)) {
            IconButton(
                onClick = {},
                modifier = Modifier.size(30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back),
                    contentDescription = "back",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

        Image(
            painter = painterResource(id = R.drawable.registerlogo),
            contentDescription = "registerlogo",
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 30.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp)
                .background(color = darkRed, shape = RoundedCornerShape(32.dp, 32.dp))
        ) {
            Text(
                text = "Create New Account",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(vertical = 15.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                color = Color.White
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = Color.White, shape = RoundedCornerShape(32.dp, 32.dp),
                    )
            )
            {
                Row(
                    modifier = Modifier
                        .padding(20.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    IconButton(
                        onClick = {},
                        modifier = Modifier.size(30.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.facebook_icon),
                            contentDescription = "fb",
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))
                    IconButton(
                        onClick = {},
                        modifier = Modifier.size(30.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = "x",
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))
                    IconButton(
                        onClick = {},
                        modifier = Modifier.size(30.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.google_icon),
                            contentDescription = "google",
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
                Text(
                    text = "or use your email account",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 1.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                    color = mediumGray
                )


                //name dll

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 25.dp)
                )
                {
                    Text(
                        text = "Name",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(top = 20.dp, bottom = 5.dp),
                        color = darkRed
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
                            text = "Ex : Jane Doe",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(vertical = 15.dp, horizontal = 15.dp),
                            color = mediumGray
                        )
                    }


                    Text(
                        text = "Email",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(top = 8.dp, bottom = 5.dp),
                        color = darkRed
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
                            text = "Ex : janedoe@example.com",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 15.sp,
                            modifier = Modifier
                                .padding(vertical = 15.dp, horizontal = 15.dp),
                            color = mediumGray
                        )
                    }

                    Text(
                        text = "Password",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(top = 8.dp, bottom = 5.dp),
                        color = darkRed
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

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 15.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Enter Password",
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(vertical = 15.dp),
                                color = mediumGray
                            )
                            IconButton(
                                onClick = {},
                                modifier = Modifier.size(22.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.invisible),
                                    contentDescription = "invisible",
                                    modifier = Modifier.fillMaxSize()
                                )
                            }
                        }
                    }
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .height(80.dp)
                            .width(150.dp)
                            .align(alignment = Alignment.CenterHorizontally)
                            .padding(top = 30.dp),
                        colors = ButtonDefaults.buttonColors(
                            contentColor = white, containerColor = darkRed
                        ),
                    ) {
                        Text(
                            text = "Register",
                            fontFamily = poppinsFamily,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }

                    Text(
                        text = "Already have an account?",
                        fontFamily = poppinsFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(top = 12.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "Login Here",
                        fontFamily = poppinsFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = darkRed,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 2.dp, bottom = 20.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterPreview() {
    LayoutWeek2Theme {
        MainView3()
    }
}


