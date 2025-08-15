package com.peter.swaggy.ui.screens.dashboard

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.peter.swaggy.R
import com.peter.swaggy.navigation.ROUT_CATEGORY
import com.peter.swaggy.navigation.ROUT_HOME
import com.peter.swaggy.navigation.ROUT_ITEM

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

   //Scaffold

   var selectedIndex by remember { mutableStateOf(0) }

   Scaffold(
      //TopBar
      topBar = {

      },

      //BottomBar
      bottomBar = {
         NavigationBar(
            containerColor = Color.Blue
         ){
            NavigationBarItem(
               icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
               label = { Text("Home") },
               selected = selectedIndex == 0,
               onClick = { selectedIndex = 0
                  //navController.navigate(ROUT_HOME)
               }
            )
            NavigationBarItem(
               icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
               label = { Text("Favorites") },
               selected = selectedIndex == 1,
               onClick = { selectedIndex = 1
                  // navController.navigate(ROUT_HOME)
               }
            )

            NavigationBarItem(
               icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
               label = { Text("Profile") },
               selected = selectedIndex == 2,
               onClick = { selectedIndex = 2
                  navController.navigate(ROUT_CATEGORY)
               }
            )

         }
      },

      //FloatingActionButton
      floatingActionButton = {
         FloatingActionButton(
            onClick = { /* Add action */ },
            containerColor = Color.LightGray,
            modifier = Modifier.offset(y = 40.dp)
         ) {
            Icon(Icons.Default.Add, contentDescription = "Add")
         }
      },
      floatingActionButtonPosition = FabPosition.Center,
      //Content
      content = { paddingValues ->
         Column(
            modifier = Modifier
               .padding(paddingValues)
               .fillMaxSize()
         ) {
            Spacer(modifier = Modifier.height(20.dp))


            Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.SpaceBetween,
               verticalAlignment = Alignment.CenterVertically
            ) {
               Column {
                  Text(
                     text = "Hi Samantha",
                     fontSize = 20.sp,
                     fontWeight = FontWeight.Bold,
                     modifier = Modifier.padding(start = 10.dp)
                  )
                  Spacer(modifier = Modifier.height(8.dp))
                  Text("Here are your projects.")


               }


               Image(
                  painter = painterResource(id = R.drawable.img_12),
                  contentDescription = "Profile Icon",
                  modifier = Modifier.size(150.dp)
               )
            }

            Spacer(modifier = Modifier.height(16.dp))

            //Row
            Row(
               modifier = Modifier
                  .padding(start = 16.dp)
                  .horizontalScroll(rememberScrollState())
                  .verticalScroll(rememberScrollState())
            ) {
               //Card
               Card(onClick = {navController.navigate(ROUT_HOME)},

               ) {
                  Column (){
                     Image(
                        painter = painterResource(R.drawable.img_13),
                        contentDescription = "crypto",
                        modifier = Modifier.fillMaxWidth().height(250.dp).width(200.dp),
                        contentScale = ContentScale.Crop
                     )


                  }

               }
               //End Of Card
               Spacer(modifier = Modifier.width(10.dp))

               //Card
               Card(onClick = {},

               ) {
                  Column (){
                     Image(
                        painter = painterResource(R.drawable.img_15),
                        contentDescription = "Cloth",
                        modifier = Modifier.fillMaxWidth().height(250.dp).width(200.dp),
                        contentScale = ContentScale.Crop
                     )
                     Spacer(modifier = Modifier.height(10.dp))


                  }

               }
               //End Of Card
               Spacer(modifier = Modifier.width(10.dp))

               //Card
               Card(onClick = {},
                  modifier = Modifier.width(200.dp).height(250.dp),
                  elevation = CardDefaults.elevatedCardElevation(5.dp),
                  colors = CardDefaults.cardColors(Color.LightGray)
               ) {
                  Column (){
                     Image(
                        painter = painterResource(R.drawable.img_7),
                        contentDescription = "Cloth",
                        modifier = Modifier.fillMaxWidth().height(150.dp),
                        contentScale = ContentScale.Crop
                     )
                     Spacer(modifier = Modifier.height(10.dp))
                     Text(
                        text = "Stylish Sneakers",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,

                        )
                     Spacer(modifier = Modifier.height(10.dp))
                     Text(
                        text = "KES.3400",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,

                        )

                  }

               }
               //End Of Card



            }
            //End Of Row

            Spacer(modifier = Modifier.height(16.dp))
          


            Text(
               text = "Personal Tasks",
               fontSize = 20.sp,
               fontWeight = FontWeight.Bold,
               modifier = Modifier.fillMaxWidth().padding(start = 16.dp)

            )

            TaskItem(
               icon = painterResource(id = R.drawable.img_16),
               title = "NDA Review for website project",
               time = "Today · 10pm"
            )

            Spacer(modifier = Modifier.height(12.dp))


            TaskItem(
               icon = painterResource(id = R.drawable.img_17),
               title = "Email reply for Green  project",
               time = "Today · 10pm"
            )


            Spacer(modifier = Modifier.height(16.dp))




         }
      }
   )

   //End of scaffold





}


@Composable
fun TaskItem(icon: Painter, title: String, time: String) {
   Row(
      modifier = Modifier
         .fillMaxWidth()
         .clip(RoundedCornerShape(12.dp))
         .background(Color.White)
         .padding(12.dp),
      verticalAlignment = Alignment.CenterVertically
   ) {
      Image(
         painter = icon,
         contentDescription = null,
         modifier = Modifier.size(28.dp)
      )
      Spacer(modifier = Modifier.width(12.dp))
      Column {
         Text(text = title, fontSize = 20.sp, fontWeight =FontWeight.Bold)
         Text(text = time, fontSize = 15.sp, color = Color.Gray)
      }
   }
}



@Preview
@Composable
fun  DashboardScreenPreview(){
   DashboardScreen(rememberNavController())
}