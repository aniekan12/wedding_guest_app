package com.ani.weddingguestapp.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.ani.weddingguestapp.data.view_models.home_view_model.HomeViewModel
import com.ani.weddingguestapp.data.view_models.home_view_model.factory.HomeViewModelFactory
//import com.ani.weddingguestapp.data.view_models.home_view_model.factory.HomeViewModelFactory
import com.ani.weddingguestapp.domain.repositories.home.HomeRepository
import com.ani.weddingguestapp.ui.screens.home.widgets.GuestsCard
import com.ani.weddingguestapp.ui.theme.white

@Composable
fun HomeScreen(navController: NavController) {


    val viewModel =
        viewModel<HomeViewModel>(factory = HomeViewModelFactory(repository = HomeRepository()))

    Scaffold(
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "add fab")
            }
        }
    ) {
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
            items(viewModel.guestsLists.size) { index ->
                GuestsCard(guests = viewModel.guestsLists[index])
                Divider(color = white, modifier = Modifier.padding(top = 10.dp))
            }
        }


    }


}

