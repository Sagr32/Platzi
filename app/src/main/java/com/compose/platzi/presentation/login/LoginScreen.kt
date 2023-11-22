package com.compose.platzi.presentation.login

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.platzi.R
import com.compose.platzi.presentation.shared.components.VerticalSpacer
import com.compose.platzi.ui.theme.PrimaryColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    state: LoginState,
    actions: LoginActions,
) {
    if (state.isLoggedIn) {
        Log.e("TAG", "LoginScreen:Logged in ")
    }
    Column {
        VerticalSpacer(height = 40)
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Logo",
            )
        }
        VerticalSpacer(height = 40)
        Text(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            text = stringResource(R.string.welcome_back),
//            style = Typography.headlineLarge.copy(fontWeight = FontWeight(700))
        )
        Text(
            text = stringResource(R.string.login_to_continue),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
//            style = Typography.bodyLarge.copy(fontStyle = FontStyle.Italic)
        )
        VerticalSpacer(height = 20)
        TextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth())


        VerticalSpacer(height = 20)
        TextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth())


        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Checkbox(
                checked = false,
                onCheckedChange = { isChecked ->
                },
                colors = CheckboxDefaults.colors(
                    checkedColor = PrimaryColor,
                    checkmarkColor = Color.White,
                )
            )
            Text(
                text = "Remember me",
//                color = GreyColor
            )
            Spacer(modifier = Modifier.weight(1.0f))
            Text(
                text = "Forget password ?",
                style = TextStyle(
                    color = PrimaryColor
                )
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            ElevatedButton(
                onClick = {
                    actions.login("name", "password")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = PrimaryColor,
                    ),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
            ) {
                if (state.isLoading) {
                    CircularProgressIndicator(
                        color = Color.White, modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                }

                Text(text = "Login")


            }
        }
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Don't have an account? Sign Up")
        }


    }
}

@Composable
@Preview(name = "Login")
private fun LoginScreenPreview() {
    LoginScreen(
        state = LoginState(),
        actions = LoginActions()
    )
}

