package com.compose.platzi.presentation.shared

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

@Composable
fun SharedRoute(
    coordinator: SharedCoordinator = rememberSharedCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState(SharedState())

    // UI Actions
    val actions = rememberSharedActions(coordinator)

    // UI Rendering
    SharedScreen(uiState, actions)
}


@Composable
fun rememberSharedActions(coordinator: SharedCoordinator): SharedActions {
    return remember(coordinator) {
        SharedActions(
            onClick = coordinator::doStuff
        )
    }
}