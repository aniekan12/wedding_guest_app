package com.ani.weddingguestapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ani.weddingguestapp.data.models.Guests
import com.ani.weddingguestapp.ui.screens.widgets.GuestsCard

@Composable
fun HomeScreen(navController: NavController) {
    var guestsLists =
        mutableListOf<Guests>(
            (Guests(
                guestID = "01",
                guestName = "anie",
                phoneNumber = "08063431549",
                seatNumber = "22"
            ))
        )



    LazyColumn(
        modifier = Modifier.fillMaxHeight(),
        contentPadding = PaddingValues(16.dp)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(vertical = 25.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = stringResource(id = com.ani.weddingguestapp.R.string.wedding_guests_string))
            }
        }
        items(guestsLists) { guests ->
            GuestsCard(guests = guests)
        }
    }
}

