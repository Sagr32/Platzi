package com.compose.platzi.presentation.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

@Composable
fun SplashRoute(
    coordinator: SplashCoordinator = rememberSplashCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState(SplashState())

    // UI Actions
    val actions = rememberSplashActions(coordinator)

    // UI Rendering
    SplashScreen(uiState, actions)
}


@Composable
fun rememberSplashActions(coordinator: SplashCoordinator): SplashActions {
    return remember(coordinator) {
        SplashActions(
            onClick = coordinator::doStuff
        )
    }
}