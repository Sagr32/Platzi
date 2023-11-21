package com.compose.platzi.presentation.profile

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

@Composable
fun ProfileRoute(
    coordinator: ProfileCoordinator = rememberProfileCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState(ProfileState())

    // UI Actions
    val actions = rememberProfileActions(coordinator)

    // UI Rendering
    ProfileScreen(uiState, actions)
}


@Composable
fun rememberProfileActions(coordinator: ProfileCoordinator): ProfileActions {
    return remember(coordinator) {
        ProfileActions(
            onClick = coordinator::doStuff
        )
    }
}