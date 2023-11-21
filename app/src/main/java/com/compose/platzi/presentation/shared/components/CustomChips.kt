package com.compose.innova.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


@Composable
fun CustomChip(
    selected: Boolean,
    text: String,
    modifier: Modifier = Modifier,
    textColor: Color = Color.LightGray,
    hasIcon: Boolean = false,
    icon: String? = null,
    padding: Modifier = Modifier,
    margin: Modifier = Modifier,
) {
    // define properties to the chip
    // such as color, shape, width
    Surface(
        color = when {
            //TODO:
            selected -> Color.Red
            else -> Color.Transparent
        },
        contentColor = when {
            selected -> Color.White
            else -> textColor
        },
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(
            width = 1.dp,
            color = when {
                selected -> MaterialTheme.colorScheme.primary
                else -> Color.LightGray
            }
        ),
        modifier = margin
    ) {
        Row(modifier = modifier.padding()) {
            if (hasIcon) {
                AsyncImage(
                    model = icon, contentDescription = "",
                    modifier = Modifier.size(24.dp)
                )
            }
            // Add text to show the data that we passed
            Text(
                text = text,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(8.dp)
            )
        }


    }
}
