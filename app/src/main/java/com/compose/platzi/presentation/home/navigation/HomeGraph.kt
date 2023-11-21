package com.compose.platzi.presentation.home.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.compose.platzi.presentation.home.HomeActions
import com.compose.platzi.presentation.home.HomeRoute
import com.compose.platzi.presentation.home.HomeScreen
import com.compose.platzi.presentation.home.HomeState
import com.compose.platzi.presentation.productdetails.ProductDetailsRoute

@Composable
fun HomeGraph(
    navController: NavHostController,
//    startDestination: String = HomeScreens.HomeScreen.route,
) {
    NavHost(navController = navController, startDestination = Graph.HOME) {

        // region Button Navigation
        composable(
            route = Graph.HOME,
        ) {
            HomeRoute()
        }
        composable(
            route = Graph.PRODUCT_DETAILS,
        ) {
            ProductDetailsRoute()
        }

//        profileNavGraph(navController)
//        orderNavGraph()
    }

}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val PROFILE = "profile_graph"
    const val ORDER = "order"
    const val HOME = "home"
    const val PRODUCT_DETAILS = "product_details"
}