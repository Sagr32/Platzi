package com.compose.platzi.presentation.home

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Screen's coordinator which is responsible for handling actions from the UI layer
 * and one-shot actions based on the new UI state
 */
class HomeCoordinator(
    val viewModel: HomeViewModel
) {
    val screenStateFlow = viewModel.stateFlow

    fun doStuff() {
        // TODO Handle UI Action
    }

    fun onProductClicked() {
        Log.e("TAG", "onProductClicked: HomeCoordinator")
        viewModel.onProductClicked()
    }
}

@Composable
fun rememberHomeCoordinator(
    viewModel: HomeViewModel = hiltViewModel()
): HomeCoordinator {
    return remember(viewModel) {
        HomeCoordinator(
            viewModel = viewModel
        )
    }
}