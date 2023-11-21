package com.compose.platzi.presentation.productdetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.compose.innova.presentation.components.CircularIcon
import com.compose.platzi.R
import com.compose.platzi.ui.theme.PrimaryColor


data class ProductDetails(
    val name: String,
    val description: String,
    val imageUrl: Int, // Replace with your image resource or URL
    val price: Double,
    val specifications: List<Pair<String, String>>,
    val userReviews: List<UserReview>
)

data class UserReview(
    val userName: String,
    val rating: Float,
    val review: String
)

@Composable
fun AdvancedProductDetailsScreen(productDetails: ProductDetails) {
    var quantity by remember { mutableStateOf(1) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Product Image Gallery
        Box {
            CircularIcon(
                backgroundColor = Color.White,
                drawableId = R.drawable.ic_cart
            ) {

            }
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                items(5) { imageUrl ->
                    AsyncImage(
                        "https://i.ibb.co/yk0dWrH/photo-1523275335684-37898b6baf30.jpg",
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(4.dp)
                            .clip(shape = MaterialTheme.shapes.medium),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            CircularIcon(backgroundColor = PrimaryColor, drawableId = R.drawable.ic_cart) {}

        }
        Spacer(modifier = Modifier.height(16.dp))

        // Product Details
        Text(
//            text = productDetails.name,
            text = "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
            style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(8.dp))
//        Text(text = productDetails.description)
        Text(text = "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Price: $${productDetails.price}")

        Spacer(modifier = Modifier.height(16.dp))

        // Specifications
        Text(
            text = "Specifications",
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
        )
        val specf = listOf<String>("1", "2", "3")
        LazyColumn(modifier = Modifier.heightIn(max = 2000.dp)) {
            items(3) { spec ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = specf.first(), modifier = Modifier.weight(1f))
                    Text(text = if (spec <= 1) "2" else "specf[spec + 1]")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // User Reviews
        Text(
            text = "User Reviews",
            style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
        )
        LazyColumn(modifier = Modifier.heightIn(max = 2000.dp)) {
            items(1) { review ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .background(MaterialTheme.colorScheme.secondary),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(imageVector = Icons.Default.Star, contentDescription = null)
                        Text(text = "Review")
                        Text(text = "Username", fontWeight = FontWeight.Bold)
                    }
                    Text(text = "Review23")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Quantity Selector
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Quantity:")
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                IconButton(
                    onClick = {
                        if (quantity > 1) {
                            quantity--
                        }
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Decrease Quantity"
                    )
                }

                BasicTextField(
                    value = quantity.toString(),
                    onValueChange = {
                        quantity = it.toIntOrNull() ?: 1
                    },
                    singleLine = true,
                    modifier = Modifier
                        .width(40.dp)
                        .background(MaterialTheme.colorScheme.background)
                        .padding(8.dp)
                        .clip(MaterialTheme.shapes.medium)
                )

                IconButton(
                    onClick = {
                        quantity++
                    }
                ) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Increase Quantity")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Add to Cart Button
        Button(
            onClick = {
                // TODO: Implement add to cart logic
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Add to Cart")
                Text(text = "Add to Cart")
            }
        }
    }
}