package com.example.imbored.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.imbored.R

val Cabin= FontFamily(Font(R.font.cabin_regular))
val CabinCondensed= FontFamily(Font(R.font.cabin_condensed_regular))


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle.Default.copy(
        fontFamily = CabinCondensed,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    headlineMedium = TextStyle.Default.copy(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
        color = onPrimaryContainerLight,
    ),
    headlineLarge = TextStyle.Default.copy(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 56.sp,
        color = onPrimaryContainerLight,
    ),
    titleLarge = TextStyle.Default.copy(
        fontFamily = Cabin,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp
    )
)

val backNumber = TextStyle.Default.copy(
    fontFamily = FontFamily.Default,
    fontSize = 240.sp,
    color = Color.Gray
)