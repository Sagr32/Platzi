package com.compose.platzi.presentation.shared

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SharedScreen(
    state: SharedState,
    actions: SharedActions,
) {
    // TODO UI Rendering
}

@Composable
@Preview(name = "Shared")
private fun SharedScreenPreview() {
    SharedScreen(
        state = SharedState(),
        actions = SharedActions()
    )
}

