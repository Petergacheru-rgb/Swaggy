package com.peter.swaggy.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.peter.swaggy.R
import com.peter.swaggy.ui.theme.light


@Composable
fun HomeScreen(){
    Column(
        modifier=Modifier.fillMaxSize().background(color = light),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
     Image(
        painter = painterResource(R.drawable.cloth),
         contentDescription = "cloth",
         modifier = Modifier.size(300.dp).clip(shape = CircleShape),
         contentScale = ContentScale.Crop

     )
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Swaggy",
            fontSize = 40.sp,
            color = Color.Black,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Find More Products!!!",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text ="It's time to start making your move This is moving mad this is a hustle uniform gang movinmadofficial",
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(5.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 30.dp)

        ) {
            Text(text = "Get Started !")
        }


    }


}
@Preview(showBackground = true)
@Composable
fun  HomeScreenPreview(){
    HomeScreen()
}