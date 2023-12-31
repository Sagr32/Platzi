package com.compose.platzi.presentation.search

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

@Composable
fun SearchRoute(
    coordinator: SearchCoordinator = rememberSearchCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState(SearchState())

    // UI Actions
    val actions = rememberSearchActions(coordinator)

    // UI Rendering
    SearchScreen(uiState, actions)
}


@Composable
fun rememberSearchActions(coordinator: SearchCoordinator): SearchActions {
    return remember(coordinator) {
        SearchActions(
            onClick = coordinator::doStuff
        )
    }
}