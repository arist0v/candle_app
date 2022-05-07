package io.badwolf.candleapp.ui.menus

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import io.badwolf.candleapp.ui.drawerMenuItems
import io.badwolf.candleapp.R

@Composable
fun Drawer(
    modifier: Modifier = Modifier.background(color= Color.Blue),
    onDestinationClicked: (route: String) -> Unit){
    Column(
        modifier.fillMaxSize()
            .padding(top = 10.dp)){
        Text(stringResource(R.string.app_name),
        modifier = Modifier
            .padding(bottom = 10.dp)
            .align(alignment = Alignment.CenterHorizontally))

        Surface(modifier = Modifier
            .background(color=Color.Red)
            .fillMaxSize()){
                  Column(){
                      drawerMenuItems.forEach { screen ->
                          Spacer(Modifier.height(24.dp))
                          Row(){
                              Icon(imageVector = screen.icon,
                              contentDescription = "",
                              modifier = Modifier.padding(start = 12.dp))
                              Text( text = screen.title,
                              modifier = Modifier
                                  .clickable {
                                      onDestinationClicked(
                                          screen.route
                                      )
                                  }.padding(start = 24.dp))
                          }
                      }
                  }
        }
    }
}