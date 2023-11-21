package com.compose.innova.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CircularIcon(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    @DrawableRes drawableId: Int,
    iconColor: Color = Color.White,
    shape: Shape = CircleShape,
    onTap: () -> Unit
) {
    Box(
        modifier = modifier
            .padding(8.dp)
            .size(32.dp)
            .clip(shape)
            .background(color = backgroundColor)
            .clickable {
                onTap()
            },
        content = {
            Image(
                modifier = Modifier
                    .padding(4.dp)
                    .size(32.dp),
                painter = painterResource(id = drawableId),
                colorFilter = ColorFilter.tint(
                    color = iconColor
                ),
                contentDescription = drawableId.toString(),
                contentScale = ContentScale.Crop,
            )
        })

}