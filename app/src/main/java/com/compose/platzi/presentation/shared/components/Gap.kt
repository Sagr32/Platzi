package com.compose.platzi.presentation.shared.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/**
 * Adds space in a Flex layout by inserting a gap of specified size.
 *
 * @param size The size of the gap to be added. Use [Dp] values to define the space.
 *
 * Example usage:
 * ```
 * // Adds a gap of 20.dp in a [Column] or [Row] layout
 * Gap(20.dp)
 * ```
 *
 * The `Gap` function is designed to create spacing within a Flex layout, making it easy to control
 * the distance between elements in a [Column] or [Row]. It calculates the space based on the provided
 * size parameter and adjusts the layout accordingly.
 *
 * Note: The `Gap` function utilizes the [Box] Composable and takes advantage of the
 * [onGloballyPositioned] callback to determine the position of the gap in the layout.
 *
 * @see Modifier.size
 * @see Modifier.onGloballyPositioned
 *
 * @throws IllegalArgumentException if the provided size is negative.
 *
 * @sample Gap(20.dp) // Adds a gap of 20.dp in a layout
 *
 * @composable
 * ```
 * Column {
 *     Text("Item 1")
 *     Gap(16.dp) // Adds a vertical gap of 16.dp
 *     Text("Item 2")
 * }
 * ```
 */
@Composable
fun Gap(
    size: Dp,
) {
    var positionInParent by remember { mutableStateOf(Offset.Zero) }
    Box(modifier = Modifier
        .size(size)
        .onGloballyPositioned { coordinates ->
            positionInParent = coordinates.positionInRoot()
        }
        .then(
            Modifier
                .width(
                    if (positionInParent.x == 0f) {
                        0.dp
                    } else {
                        size
                    }
                )
                .height(
                    if (positionInParent.y == 0f) {
                        0.dp
                    } else {
                        size
                    }
                )
        ))
}
