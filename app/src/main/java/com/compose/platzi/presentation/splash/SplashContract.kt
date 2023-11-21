package com.compose.platzi.presentation.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf


/**
 * UI State that represents SplashScreen
 **/
class SplashState

/**
 * Splash Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class SplashActions(
    val onClick: () -> Unit = {}
)