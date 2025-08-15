package com.peter.swaggy.ui.screens.category

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.peter.swaggy.navigation.ROUTE_DETAIL
import com.peter.swaggy.ui.theme.Orange
import com.peter.swaggy.ui.theme.newBlue
import java.nio.file.WatchEvent.Modifier
import java.util.Locale.Category

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavController){

    Column(
        modifier = androidx.compose.ui.Modifier.fillMaxSize()


    ) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Other Categories") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Orange,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu"
                    )
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "shoppingcart"
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Notifications"
                    )
                }

            }
        )

        //End of TopAppBar

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        Text(
            text = "Welcome to Swaggy",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = androidx.compose.ui.Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

        Text(
            text = "Discover unique styles across categories.Find something for every vibe",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = androidx.compose.ui.Modifier.padding(start = 20.dp)

        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

        Text(
            text = "Shop by Category",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = androidx.compose.ui.Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        //Card
        Card(
            onClick = {},
            modifier = androidx.compose.ui.Modifier.fillMaxWidth().height(200.dp).padding(start = 10.dp, end = 10.dp)
        ) {
           Box(
               modifier = androidx.compose.ui.Modifier.fillMaxSize(),
               contentAlignment = Alignment.Center

           ) {
               Image(
                   painter = painterResource(R.drawable.img_3),
                   contentDescription = "Cloth",
                   modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                   contentScale = ContentScale.FillBounds
               )

               Text(
                   text ="Jewellry",
                   fontSize = 24.sp,
                   fontWeight = FontWeight.Bold,
                   modifier = androidx.compose.ui.Modifier.padding(start = 20.dp),
                   color = Color.White
               )
               Icon(
                   imageVector = Icons.Default.Favorite,
                   contentDescription = "Favourite",
                   modifier = androidx.compose.ui.Modifier.align(alignment = Alignment.TopStart).padding(10.dp),
                   tint = Color.Gray
               )
           }

        }
        //End Of Card
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        //Card
        Card(
            onClick = {},
            modifier = androidx.compose.ui.Modifier.fillMaxWidth().height(200.dp).padding(start = 10.dp, end = 10.dp)
        ) {
            Box(
                modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.img_5),
                    contentDescription = "Cloth",
                    modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )

                Text(
                    text ="Sneakers",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = androidx.compose.ui.Modifier.padding(start = 20.dp),
                    color = Color.White
                )
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favourite",
                    modifier = androidx.compose.ui.Modifier.align(alignment = Alignment.TopStart).padding(10.dp),
                    tint = Color.Gray
                )
            }

        }
        //End Of Card

        Column(

        ) {
        Text(
            text ="More categories coming soon...",
            fontSize = 20.sp,
            modifier = androidx.compose.ui.Modifier.padding(start = 20.dp),
            color = Color.Gray
        )
            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
            Button(
                onClick = {
                    navController.navigate( ROUTE_DETAIL)
                },
                colors = ButtonDefaults.buttonColors(Orange),
                shape = RoundedCornerShape(10.dp),
                modifier = androidx.compose.ui.Modifier.fillMaxWidth().padding(start = 30.dp, end = 30.dp)

            ) {
                Text(text = "Explore All Products")

            }
            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

            Column(

            ) {
                Text(
                    text = "Follow us on Instagram @swaggy_ke",
                    fontSize = 14.sp,
                    color = Color.Gray
                )



                Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

                Text(
                    text = "Need help? Contact us at support@swaggy.co.ke",
                    fontSize = 14.sp,
                    color = Color.Gray
                )


                Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))


                Text(
                    text = "\"Wear the vibe. Live the vibe.\"",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
            }
        }







    }


}
@Preview(showBackground = true)
@Composable
fun  CategoryScreenPreview(){
    CategoryScreen(rememberNavController())
}