package com.compose.platzi.presentation.productdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.compose.platzi.data.model.Category
import com.compose.platzi.data.model.Product

@Composable
fun ProductDetailsScreen(
    state: ProductDetailsState,
    actions: ProductDetailsActions,
) {
    AdvancedProductDetailsScreen(
        ProductDetails(
            name = "",
            description = "",
            imageUrl = 0,
            price = 0.0,
            specifications = listOf(),
            userReviews = listOf()
        )
    )
//    var quantity by remember { mutableStateOf(1) }
//    val product by remember {
//        mutableStateOf(
//            Product(
//                category = Category(
//                    creationAt = "",
//                    id = 0,
//                    image = "",
//                    name = "",
//                    updatedAt = ""
//                ),
//                creationAt = "",
//                description = "",
//                id = 0,
//                price = 0.0,
//                title = "",
//                updatedAt = "",
//                images = arrayListOf(
//                    "https://i.ibb.co/TqJJ3gp/pngegg-12-7.png"
//                ),
//
//
//                )
//        )
//    }
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        // Product Image
//        AsyncImage(
//            product.images[0],
//            contentDescription = null,
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(200.dp)
//                .clip(shape = MaterialTheme.shapes.medium),
//            contentScale = ContentScale.Crop
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Product Details
//        Text(
//            text = product.title,
//            style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold)
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//        Text(text = product.description)
//        Spacer(modifier = Modifier.height(8.dp))
//        Text(text = "Price: $${product.price}")
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Quantity Selector
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(48.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text("Quantity:")
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.spacedBy(8.dp)
//            ) {
//                IconButton(
//                    onClick = {
//                        if (quantity > 1) {
//                            quantity--
//                        }
//                    }
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Delete,
//                        contentDescription = "Decrease Quantity"
//                    )
//                }
//
//                BasicTextField(
//                    value = quantity.toString(),
//                    onValueChange = {
//                        quantity = it.toIntOrNull() ?: 1
//                    },
//                    singleLine = true,
//                    modifier = Modifier
//                        .width(40.dp)
//                        .background(MaterialTheme.colorScheme.background)
//                        .padding(8.dp)
//                        .clip(MaterialTheme.shapes.medium)
//                )
//
//                IconButton(
//                    onClick = {
//                        quantity++
//                    }
//                ) {
//                    Icon(imageVector = Icons.Default.Add, contentDescription = "Increase Quantity")
//                }
//            }
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Add to Cart Button
//        Button(
//            onClick = {
//                // TODO: Implement add to cart logic
//            },
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(56.dp)
//        ) {
//            Row(
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Icon(
//                    imageVector = Icons.Default.ShoppingCart,
//                    contentDescription = "Add to Cart"
//                )
//                Text(text = "Add to Cart")
//            }
//        }
//    }
}

@Composable
@Preview(name = "ProductDetails")
private fun ProductDetailsScreenPreview() {
    ProductDetailsScreen(
        state = ProductDetailsState(),
        actions = ProductDetailsActions()
    )
}

