package com.compose.platzi.data.network


import com.compose.platzi.data.model.Product
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query


interface ApiService {
    @GET("products")
    suspend fun getAllProducts(
    ): Response<List<Product>>

    @GET("products/{productId}")
    suspend fun getProductDetails(
        @Path("productId") productId: Int,
    ): Response<Product>

    @GET("categories")
    suspend fun getAllCategories(
    ): Response<List<Product>>

    @GET("categories/{categoryId}")
    suspend fun getCategoryDetails(
        @Path("categoryId") categoryId: Int,
    ): Response<Product>

    @POST("auth/login")
    suspend fun login(

    )
}