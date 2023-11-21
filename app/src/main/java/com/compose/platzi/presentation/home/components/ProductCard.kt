package com.compose.platzi.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.compose.platzi.data.model.Product
import com.compose.platzi.presentation.shared.components.Gap


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductCard(
    productModel: Product,
    onTap: () -> Unit,
) {
    Card(

        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        modifier = Modifier
            .padding(8.dp)
            .clickable {
                onTap()
            }
    ) {
        Column(modifier = Modifier.width(170.dp).wrapContentHeight()) {
            Box {
                AsyncImage(
                    productModel.images[0],
                    productModel.description,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxWidth().height(200.dp)
                )
                Box(modifier = Modifier.padding(8.dp)) {
                    Text(
                        "20%",
                        modifier = Modifier
                            .background(Color.Red, shape = RoundedCornerShape(30.dp))
                            .padding(vertical = 8.dp, horizontal = 12.dp),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                }
            }
            Box(
                modifier = Modifier
                    .align(Alignment.End)
                    .offset(y = -24.dp)
                    .padding(8.dp)
                    .size(36.dp)
                    .clip(CircleShape)
                    .clickable {
                    }
                    .background(color = Color.White),
                content = {
                    Icon(
                        modifier = Modifier
                            .padding(8.dp)
                            .size(40.dp),
                        imageVector = Icons.Outlined.Favorite,
                        tint = Color.Red,
                        contentDescription = "avatar",
                    )
                })


            Column(
                modifier = Modifier
                    .offset(y = -36.dp)
                    .padding(8.dp)
            ) {
//                Row(
//                    horizontalArrangement = Arrangement.SpaceBetween,
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    RatingBarView(
//                        productModel.rating?.rate?.toInt() ?: 0,
//                        title = ("(${productModel.rating?.count})"),
//                        textStyle = TextStyle(
//                            color = Color(0xFF9B9B9B)
//                        )
//                    )
//                }
                Text(
                    productModel.category.name, style = TextStyle(
                        fontSize = 11.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF9B9B9B),

                        )
                )
                Gap(5.dp)
                Text(
                    productModel.title, style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF222222),
                    ),
                    maxLines = 2
                )
                Gap(5.dp)
                Text(
                    "${productModel.price} $",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF222222),
                    )
                )
            }
        }

    }
}