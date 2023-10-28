package com.example.layoutweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutweek2.ui.theme.LayoutWeek2Theme
import com.example.layoutweek2.ui.theme.darkRed
import com.example.layoutweek2.ui.theme.lightGray
import com.example.layoutweek2.ui.theme.white


class DetailProduk : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    MainView()
                }
            }
        }
    }
}


@Composable
fun MainView() {
    val poppinsFamily = FontFamily(
        Font(R.font.poppins_bold, FontWeight.Bold),
        Font(R.font.poppins_light, FontWeight.Light),
        Font(R.font.poppins_medium, FontWeight.Medium),
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_semibold, FontWeight.Bold),
    )
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back),
                    contentDescription = "back",
                    modifier = Modifier.fillMaxSize()

                )
            }

            Text(
                text = "KFC",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier.padding(top = 8.dp),
                color = darkRed
            )

            IconButton(
                onClick = {},
                modifier = Modifier
                    .size(30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "menu",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

        Image(
            painter = painterResource(id = R.drawable.kfc),
            contentDescription = "Product Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(top = 16.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp)
                .background(color = darkRed, shape = RoundedCornerShape(32.dp, 32.dp))
        ) {
            Text(
                text = "KFC PAKET SUPER BESAR PANAS 2",
                fontFamily = poppinsFamily,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = white,
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp)
                    .padding(horizontal = 24.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 12.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "star",
                )
                Text(
                    text = "5.0",
                    fontFamily = poppinsFamily,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light,
                    color = white,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 1.dp)
                )

                Text(
                    text = "(48129 Reviews)",
                    fontFamily = poppinsFamily,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light,
                    color = lightGray,
                    modifier = Modifier.padding(vertical = 1.dp)
                )
            }

            Text(
                text = "7 Pcs Chicken Wings Crispy + French Fries Medium With Wheat Flakes + Pepsi Coke With Ice",
                fontFamily = poppinsFamily,
                fontSize = 21.sp,
                fontWeight = FontWeight.Medium,
                color = white,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "Read More",
                fontFamily = poppinsFamily,
                fontSize = 21.sp,
                fontWeight = FontWeight.Medium,
                color = white,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(top = 6.dp),
                textDecoration = TextDecoration.Underline
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    fontFamily = poppinsFamily,
                    text = "RP. 79,999",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = white,
                )

                Button(
                    onClick = { },
                    modifier = Modifier
                        .height(64.dp)
                        .width(180.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = darkRed, containerColor = white
                    )
                ) {
                    Text(
                        text = "Add to Cart",
                        fontFamily = poppinsFamily,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetailProdukPreview() {
    LayoutWeek2Theme {
        MainView()
    }
}