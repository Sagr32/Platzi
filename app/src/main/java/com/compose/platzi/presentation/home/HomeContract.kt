package com.compose.platzi.presentation.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.compose.platzi.data.model.Product


/**
 * UI State that represents HomeScreen
 **/
data class HomeState(
    val productList: List<Product> = emptyList()
)

/**
 * Home Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class HomeActions(
    val onClick: () -> Unit = {},
    val onProductClicked: () -> Unit,

    )