package com.example.imbored.ui

import com.example.imbored.model.Activity
import com.example.imbored.data.welcomeActivity

data class GameUiState(
    val activity: Activity = welcomeActivity
)
