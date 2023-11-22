package com.compose.platzi.presentation.login

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@HiltViewModel
class LoginViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _stateFlow: MutableStateFlow<LoginState> = MutableStateFlow(LoginState())

    val stateFlow: StateFlow<LoginState> = _stateFlow.asStateFlow()

    fun login(name: String, password: String) {
        viewModelScope.launch {
            _stateFlow.emit(LoginState(isLoading = true))
            delay(3000L)
            _stateFlow.emit(LoginState(isLoading = false))
            _stateFlow.emit(LoginState(true))
        }
    }
}