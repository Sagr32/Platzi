package com.compose.platzi.presentation.productdetails

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

@Composable
fun ProductDetailsRoute(
    coordinator: ProductDetailsCoordinator = rememberProductDetailsCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState(ProductDetailsState())

    // UI Actions
    val actions = rememberProductDetailsActions(coordinator)

    // UI Rendering
    ProductDetailsScreen(uiState, actions)
}


@Composable
fun rememberProductDetailsActions(coordinator: ProductDetailsCoordinator): ProductDetailsActions {
    return remember(coordinator) {
        ProductDetailsActions(
            onClick = coordinator::doStuff
        )
    }
}