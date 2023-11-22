package com.compose.platzi.presentation.search.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.platzi.R

@Composable
fun HorizontalProductCard() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFFE8EDFA),
        modifier = Modifier.height(200.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(2f),
                verticalArrangement = Arrangement.Center
            ) {
                Surface(
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier.wrapContentSize(),
                    color = Color(0xFFD1D5E1)
                ) {
                    Text(
                        text = "New release",
                        style = TextStyle(fontSize = 12.sp),
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "D Shoes Sports",
                    style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
                )

                Spacer(modifier = Modifier.height(2.dp))

                Text(text = "Price : 300$")

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "3.0",
                        style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_star),
                        tint = Color(0xFFF6B266),
                        contentDescription = null
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.ic_star),
                        tint = Color(0xFFF6B266),
                        contentDescription = null
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.ic_star),
                        tint = Color(0xFFF6B266),
                        contentDescription = null
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                OutlinedButton(
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.White
                    ),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "See details",
                        style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                    )
                }
            }

            Surface(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.size(width = 100.dp, height = 140.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.shoes),
                    contentScale = ContentScale.Fit,
                    contentDescription = null
                )
            }
        }
    }
}

