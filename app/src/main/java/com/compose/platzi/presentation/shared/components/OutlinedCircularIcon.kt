package com.compose.innova.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.compose.platzi.ui.theme.PrimaryColor


@Composable
fun OutlinedCircularIcon(
    modifier: Modifier = Modifier,
    borderColor: Color = PrimaryColor,
    backgroundColor: Color = Color.White,
    @DrawableRes drawableId: Int,
    innerPadding: Dp = 0.dp,
    onTap: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(8.dp)
            .size(42.dp)
            .clip(CircleShape)
            .border(2.dp, borderColor, CircleShape)
            .clickable {
                onTap()
            }
            .background(color = backgroundColor),
        content = {
            Image(
                modifier = Modifier
                    .padding(8.dp)
                    .padding(innerPadding)
                    .size(64.dp),
                painter = painterResource(drawableId),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
            )
        })


}