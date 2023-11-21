package com.compose.platzi.presentation.productdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf


/**
 * UI State that represents ProductDetailsScreen
 **/
class ProductDetailsState

/**
 * ProductDetails Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class ProductDetailsActions(
    val onClick: () -> Unit = {}
)