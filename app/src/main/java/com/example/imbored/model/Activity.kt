package com.example.imbored.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Activity(
    @StringRes val nameRes: Int,
    @StringRes val descRes: Int,
    @DrawableRes val imageRes: Int?
)
