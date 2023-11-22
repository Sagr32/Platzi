package com.compose.platzi.presentation.login


/**
 * UI State that represents LoginScreen
 **/
data class LoginState(
    val isLoggedIn: Boolean = false,
    val isLoading: Boolean = false
)

/**
 * Login Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class LoginActions(
    val onClick: () -> Unit = {},
    val login: (name: String, password: String) -> Unit = { _: String, _: String -> }
)