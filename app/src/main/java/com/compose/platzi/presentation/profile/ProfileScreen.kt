package com.compose.platzi.presentation.profile

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileScreen(
    state: ProfileState,
    actions: ProfileActions,
) {
    // TODO UI Rendering
}

@Composable
@Preview(name = "Profile")
private fun ProfileScreenPreview() {
    ProfileScreen(
        state = ProfileState(),
        actions = ProfileActions()
    )
}

