package com.example.layoutweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.example.layoutweek2.ui.theme.mediumGray
import com.example.layoutweek2.ui.theme.white

class ListProduk : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    MainView2()
                }
            }
        }
    }
}

data class ImageResource(
    val name: String,
    val resourceId: Int
)

val poppinsFamily = FontFamily(
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_semibold, FontWeight.Bold),
)

@Composable
fun ProductRow(
    type: String,
    name: String,
    productFoto: ImageResource,
    iconFoto: ImageResource,
    spicyLevel: String,
    price: String,
    quantity: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp)
            .height(200.dp)
            .padding(top = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = productFoto.resourceId),
            contentDescription = name,
            modifier = Modifier
                .width(165.dp)
                .height(170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp)
        ) {
            Text(
                text = type,
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 2.dp),
                color = mediumGray
            )

            Text(
                text = name,
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = darkRed
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Rate-",
                    fontFamily = poppinsFamily,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium
                )

                Image(
                    painter = painterResource(id = iconFoto.resourceId),
                    contentDescription = null,
                    modifier = Modifier
                        .size(16.dp)
                )

                Text(
                    text = "Spicy Level-${spicyLevel}",
                    fontFamily = poppinsFamily,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            Text(
                text = "Rp. $price",
                fontFamily = poppinsFamily,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "+ $quantity -",
                    fontFamily = poppinsFamily,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )

                Image(
                    painter = painterResource(id = R.drawable.cancel),
                    contentDescription = "cancel",
                    modifier = Modifier
                        .size(25.dp)
                )
            }
        }
    }
}

@Composable
fun DividerSheesh() {
    Divider(
        thickness = 1.dp,
        color = lightGray,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(top = 20.dp)
    )
}

@Composable
fun MainView2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
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
                text = "Your Cart",
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
        val burger1 = ImageResource("burger1", R.drawable.burger1)
        val burger2 = ImageResource("burger2", R.drawable.burger2)
        val burger3 = ImageResource("burger3", R.drawable.burger3)

        val chef = ImageResource("chef", R.drawable.chef)
        val chili = ImageResource("chef", R.drawable.chili)
        val thumbsUp = ImageResource("chef", R.drawable.thumbs)

        ProductRow(
            type = "Krabby Patty",
            name = "Plant Based Whopper",
            productFoto = burger1,
            iconFoto = chef,
            spicyLevel = "5/10",
            price = "12.000",
            quantity = "8"
        )
        DividerSheesh()
        ProductRow(
            type = "Krabby Patty",
            name = "Extra Spicy Chicken Burger",
            productFoto = burger2,
            iconFoto = chili,
            spicyLevel = "10/10",
            price = "36.000",
            quantity = "5"
        )
        DividerSheesh()
        ProductRow(
            type = "Krabby Patty",
            name = "BBQ Beef Rasher",
            productFoto = burger3,
            iconFoto = thumbsUp,
            spicyLevel = "7/10",
            price = "30.000",
            quantity = "2"
        )
        DividerSheesh()

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp)
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Delivery Charges",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = mediumGray
            )


            Text(
                text = "Free Delivery",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = mediumGray,
                textDecoration = TextDecoration.Underline
            )
        }

        Divider(
            thickness = 1.dp,
            color = lightGray,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 6.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp)
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Total Amount",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                color = mediumGray
            )


            Text(
                text = "Rp. 78.000",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                color = mediumGray,

            )
        }
        Divider(
            thickness = 1.dp,
            color = lightGray,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 6.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp)
                .padding(top = 12.dp, bottom = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .height(64.dp)
                    .width(160.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = darkRed,
                    containerColor = white,
                ),
                border = BorderStroke(1.dp, darkRed)
            ) {
                Text(
                    text = "Rp. 78.000",
                    fontFamily = poppinsFamily,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
            Button(
                onClick = { },
                modifier = Modifier
                    .height(64.dp)
                    .width(200.dp)
                    .padding(start = 10.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = white, containerColor = darkRed
                ),
            ) {
                Text(
                    text = "Continue",
                    fontFamily = poppinsFamily,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ListProdukPreview() {
    LayoutWeek2Theme {
        MainView2()
    }
}