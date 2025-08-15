package com.peter.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.peter.swaggy.R
import com.peter.swaggy.navigation.ROUT_HOME
import com.peter.swaggy.ui.theme.NewGreen

@Composable
fun DashboardScreen2(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        //Card
        Card(
            modifier = Modifier.fillMaxWidth().height(400.dp),
            shape = RoundedCornerShape(bottomStart = 60.dp),
            colors = CardDefaults.cardColors(NewGreen)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "",
                        tint = Color.White,
                    )

                }
                Spacer(modifier = Modifier.height(10.dp))


                Text(
                    text = "Cryptocurrency",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Landing Page",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(40.dp))

                //Row
                Row() {
                    Image(
                        painter = painterResource(R.drawable.img_18),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp).clip(shape = CircleShape),
                        contentScale = ContentScale.Crop

                    )
                    Spacer(modifier = Modifier.width(10.dp))


                    Text(
                        text = "Samantha",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )

                }
                //End of Row


                Spacer(modifier = Modifier.height(10.dp))


                //Row
                Row(
                ) {


                    Text(
                        text = "E-commerce, or electronic commerce, is the buying and selling of goods and services, or the transmission of funds or data, over an electronic network, primarily the internet. It essentially involves conducting business transactions online.",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.width(280.dp),
                    )


                }
                //End of Row

            }
        }
        Image(
            painter = painterResource(R.drawable.img_19),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .offset(
                    x = (130.dp),
                    y = (-150.dp)
                )
                .size(180.dp),
            contentScale = ContentScale.Crop
        )


        //Row
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
        ) {
            Column() {
                Image(
                    painter = painterResource(R.drawable.acrobat),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp),

                    )

                Text(
                    text = "Layout Docs",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "PDF . 15MB",
                    fontSize = 13.sp,

                    )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    painter = painterResource(R.drawable.mov),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp),

                    )

                Text(
                    text = "Presentation",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "MOV . 4GB",
                    fontSize = 13.sp,
                    textAlign = TextAlign.Right

                )

            }

            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    painter = painterResource(R.drawable.zip),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp),

                    )

                Text(
                    text = "All Assets",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "ZIP . 10MB",
                    fontSize = 13.sp,

                    )


            }


        }
        //End of 1st Row


        Spacer(modifier = Modifier.height(20.dp))



        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
        ) {
            Column() {
                Image(
                    painter = painterResource(R.drawable.wav),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp),

                    )

                Text(
                    text = "Layout Docs",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "WAV . 10MB",
                    fontSize = 13.sp,

                    )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    painter = painterResource(R.drawable.excel),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp),

                    )

                Text(
                    text = "Presentation",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "XLS . 10MB",
                    fontSize = 13.sp,
                    textAlign = TextAlign.Right

                )

            }

            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Image(
                    painter = painterResource(R.drawable.word),
                    contentDescription = "",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp),

                    )

                Text(
                    text = "All Assets",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "DOCX . 10MB",
                    fontSize = 13.sp,

                    )


            }


        }
        //End of 2nd Row

    }
}
@Preview(showBackground = true)
@Composable
fun   DashboardScreen2Preview(){
    DashboardScreen2(rememberNavController())
}