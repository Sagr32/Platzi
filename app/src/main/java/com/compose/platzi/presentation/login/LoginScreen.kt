package com.compose.platzi.presentation.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(
    state: LoginState,
    actions: LoginActions,
) {
    // TODO UI Rendering
}

@Composable
@Preview(name = "Login")
private fun LoginScreenPreview() {
    LoginScreen(
        state = LoginState(),
        actions = LoginActions()
    )
}

