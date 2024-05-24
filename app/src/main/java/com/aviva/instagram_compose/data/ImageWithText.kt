package com.aviva.instagram_compose.data

import androidx.compose.ui.graphics.painter.Painter

data class ImageWithText(
    val image: Painter,
    val text : String
)