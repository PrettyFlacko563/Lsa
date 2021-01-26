package com.example.androidmanifest

import androidx.annotation.DrawableRes

data class icons (
    val id: Int,
    val title: String,
    @DrawableRes
    val image:Int,
)