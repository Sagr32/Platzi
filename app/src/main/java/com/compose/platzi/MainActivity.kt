package com.compose.platzi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.navigation.findNavController
import com.compose.platzi.presentation.home.HomeActions
import com.compose.platzi.presentation.home.HomeScreen
import com.compose.platzi.presentation.home.HomeState
import com.compose.platzi.presentation.home.navigation.HomeGraph
import com.compose.platzi.presentation.productdetails.ProductDetailsActions
import com.compose.platzi.presentation.productdetails.ProductDetailsScreen
import com.compose.platzi.presentation.productdetails.ProductDetailsState
import com.compose.platzi.ui.theme.PlatziTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlatziTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    HomeScreen(state = HomeState(), actions = HomeActions())
                    val navController = rememberNavController()
                    HomeGraph(navController)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlatziTheme {
        Greeting("Android")
    }
}