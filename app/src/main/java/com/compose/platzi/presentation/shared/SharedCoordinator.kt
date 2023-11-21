package com.compose.platzi.presentation.shared

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Screen's coordinator which is responsible for handling actions from the UI layer
 * and one-shot actions based on the new UI state
 */
class SharedCoordinator(
    val viewModel: SharedViewModel
) {
    val screenStateFlow = viewModel.stateFlow

    fun doStuff() {
        // TODO Handle UI Action
    }
}

@Composable
fun rememberSharedCoordinator(
    viewModel: SharedViewModel = hiltViewModel()
): SharedCoordinator {
    return remember(viewModel) {
        SharedCoordinator(
            viewModel = viewModel
        )
    }
}