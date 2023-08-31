package com.ani.weddingguestapp.data.view_models.home_view_model

import androidx.compose.runtime.*
// for a 'val' variable
import androidx.compose.runtime.getValue

// for a `var` variable also add
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ani.weddingguestapp.data.models.Guests
import com.ani.weddingguestapp.domain.repositories.home.HomeRepository

class HomeViewModel(repository: HomeRepository) : ViewModel() {
    var guestsLists by mutableStateOf(
        mutableStateListOf(
            Guests(guestID = "1", guestName = "ani", seatNumber = "12", phoneNumber = ""),
            Guests(guestID = "2", guestName = "sam", seatNumber = "22", phoneNumber = ""),
        )
    )

}