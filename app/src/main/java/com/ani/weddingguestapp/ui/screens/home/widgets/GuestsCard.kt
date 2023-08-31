package com.ani.weddingguestapp.ui.screens.home.widgets

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ani.weddingguestapp.R
import com.ani.weddingguestapp.data.models.Guests
import com.ani.weddingguestapp.ui.theme.Typography

@Composable
fun GuestsCard(guests: Guests) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(all = 16.dp)
        ) {
            Row {
                HeadingText(text = stringResource(id = R.string.name))
                Text(text = guests.guestName)
            }
            Row() {
                HeadingText(text = stringResource(id = R.string.seat_number))
                Text(text = guests.seatNumber)

            }
        }
    }
}