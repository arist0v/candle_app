package io.badwolf.candleapp.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.badwolf.candleapp.ui.NavRoutes


@Composable
fun NavigationHost(
    navController: NavController,
    viewModel: MainViewModel){
    NavHost(
        navController = navController as NavHostController,
        startDestination = NavRoutes.DrawerItems.ThingsScreen.route){
        composable(NavRoutes.DrawerItems.ThingsScreen.route){ /* TODO */}
    }

}