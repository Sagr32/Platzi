package com.compose.platzi.presentation.search

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SearchScreen(
    state: SearchState,
    actions: SearchActions,
) {
    // TODO UI Rendering
}

@Composable
@Preview(name = "Search")
private fun SearchScreenPreview() {
    SearchScreen(
        state = SearchState(),
        actions = SearchActions()
    )
}

