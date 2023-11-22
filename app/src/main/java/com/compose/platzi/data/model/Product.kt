package com.compose.platzi.data.model



data class Product(
    val category: Category,
    val creationAt: String,
    val description: String,
    val id: Int,
    val images: List<String>,
    val price: Double,
    val title: String,
    val updatedAt: String
)