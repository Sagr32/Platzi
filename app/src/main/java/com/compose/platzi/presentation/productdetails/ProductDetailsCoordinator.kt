package com.compose.platzi.presentation.productdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Screen's coordinator which is responsible for handling actions from the UI layer
 * and one-shot actions based on the new UI state
 */
class ProductDetailsCoordinator(
    val viewModel: ProductDetailsViewModel
) {
    val screenStateFlow = viewModel.stateFlow

    fun doStuff() {
        // TODO Handle UI Action
    }
}

@Composable
fun rememberProductDetailsCoordinator(
    viewModel: ProductDetailsViewModel = hiltViewModel()
): ProductDetailsCoordinator {
    return remember(viewModel) {
        ProductDetailsCoordinator(
            viewModel = viewModel
        )
    }
}