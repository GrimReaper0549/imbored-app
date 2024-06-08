package com.example.imbored.data

import androidx.compose.ui.res.stringResource
import com.example.imbored.R
import com.example.imbored.model.Activity

val activities= listOf(
    Activity(nameRes = R.string.activity1, descRes = R.string.description1, imageRes = R.drawable.activity1),
    Activity(nameRes = R.string.activity2, descRes = R.string.description2, imageRes = R.drawable.activity1),
    Activity(nameRes = R.string.activity3, descRes = R.string.description3, imageRes = R.drawable.activity1),
    Activity(nameRes = R.string.activity4, descRes = R.string.description4, imageRes = R.drawable.activity1),
    Activity(nameRes = R.string.activity5, descRes = R.string.description5, imageRes = R.drawable.activity1),
    Activity(nameRes = R.string.activity6, descRes = R.string.description6, imageRes = R.drawable.activity1),

)

val welcomeActivity = Activity(nameRes = R.string.welcome_activity, descRes = R.string.welcome_description, imageRes = null)