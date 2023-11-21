package com.compose.platzi.presentation.shared

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf


/**
 * UI State that represents SharedScreen
 **/
class SharedState

/**
 * Shared Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class SharedActions(
    val onClick: () -> Unit = {}
)