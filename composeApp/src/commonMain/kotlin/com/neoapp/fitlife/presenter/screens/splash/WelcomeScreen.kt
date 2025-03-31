package com.neoapp.fitlife.presenter.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import fitlife.composeapp.generated.resources.Res
import fitlife.composeapp.generated.resources.beautiful_young_sporty_woman_training_workout_gym
import fitlife.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

@Composable
fun WelcomeScreen() {
    Surface(modifier = Modifier.fillMaxSize(),
        color = Color.Transparent
    ) {
        Image(
            painter = painterResource(Res.drawable.beautiful_young_sporty_woman_training_workout_gym),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Welcome to")

        }
    }
}