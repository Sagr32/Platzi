package com.compose.platzi.presentation.register

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RegisterScreen(
    state: RegisterState,
    actions: RegisterActions,
) {
    // TODO UI Rendering
}

@Composable
@Preview(name = "Register")
private fun RegisterScreenPreview() {
    RegisterScreen(
        state = RegisterState(),
        actions = RegisterActions()
    )
}

