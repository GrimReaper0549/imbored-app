package com.example.imbored

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imbored.model.Activity
import com.example.imbored.ui.theme.ImBoredTheme
import com.example.imbored.data.activities
import com.example.imbored.ui.theme.backNumber

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImBoredTheme {
                BoredApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoredTopAppBar(){
    CenterAlignedTopAppBar(title = { Text(text = stringResource(id = R.string.app_name), style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(
        dimensionResource(id = R.dimen.small_padding))) }, colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primary, titleContentColor = MaterialTheme.colorScheme.onPrimary))
}

@Composable
fun BoredCard(modifier: Modifier=Modifier, activity: Activity){
    Card(modifier= modifier
        .size(dimensionResource(id = R.dimen.card_size))
        .padding(
            bottom = dimensionResource(id = R.dimen.large_padding)
        ), elevation = CardDefaults.cardElevation(defaultElevation = dimensionResource(id = R.dimen.card_elevation))) {
        Column(verticalArrangement = Arrangement.Center) {
            Box {
                Image(painter = painterResource(id = activity.imageRes), contentDescription = null, modifier= modifier
                    .fillMaxWidth()
                    .clip(RectangleShape)
                    .height(125.dp)
                    .padding(dimensionResource(id = R.dimen.small_padding)), contentScale = ContentScale.Crop, alpha = 0.5F)
                Text(text = stringResource(id = activity.nameRes), modifier=modifier.padding(start = dimensionResource(id = R.dimen.medium_padding), top = dimensionResource(id = R.dimen.small_padding), bottom = dimensionResource(id = R.dimen.medium_padding)), style = MaterialTheme.typography.headlineMedium)
            }
            Text(text = stringResource(id = activity.descRes), style = MaterialTheme.typography.bodyLarge, modifier = modifier.padding(top = dimensionResource(id = R.dimen.medium_padding), start = dimensionResource(id = R.dimen.small_padding), end = dimensionResource(id = R.dimen.small_padding), bottom = dimensionResource(id = R.dimen.small_padding)))
        }
    }
}

@Composable
fun BoredAppBackground(modifier: Modifier=Modifier){
    Text(text = "#\n2\n7", style = backNumber, modifier = modifier)
}

@Composable
fun BoredApp(){
    Scaffold(
        topBar = { BoredTopAppBar() }
    ) {
        innerPadding->
        val initActivity = activities.random()
        var curr by rememberSaveable {
            mutableStateOf(initActivity)
        }
        Box(modifier = Modifier) {
            BoredAppBackground()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                BoredCard(activity = curr)
                Button(onClick = { curr = activities.random() }, modifier = Modifier.width(dimensionResource(id = R.dimen.button_size))) {
                    Text(text = stringResource(id = R.string.skip))
                }
            }
            FloatingActionButton(onClick = {  }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = stringResource(id = R.string.add_activities))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoredAppPreview() {
    ImBoredTheme {
        BoredApp()
    }
}


@Preview(showBackground = true)
@Composable
fun BoredAppDarkPreview() {
    ImBoredTheme(darkTheme = true) {
        BoredApp()
    }
}