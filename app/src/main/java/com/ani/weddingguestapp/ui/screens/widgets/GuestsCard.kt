package com.ani.weddingguestapp.ui.screens.widgets

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.ani.weddingguestapp.data.models.Guests

@Composable
fun GuestsCard(guests: Guests){
    Text(text = guests.guestName)
}