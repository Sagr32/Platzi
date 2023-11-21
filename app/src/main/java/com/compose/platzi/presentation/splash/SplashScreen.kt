package com.compose.platzi.presentation.splash

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen(
    state: SplashState,
    actions: SplashActions,
) {
    // TODO UI Rendering
}

@Composable
@Preview(name = "Splash")
private fun SplashScreenPreview() {
    SplashScreen(
        state = SplashState(),
        actions = SplashActions()
    )
}

