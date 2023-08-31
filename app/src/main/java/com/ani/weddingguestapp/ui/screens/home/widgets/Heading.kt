package com.ani.weddingguestapp.ui.screens.home.widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ani.weddingguestapp.R
import com.ani.weddingguestapp.ui.theme.Typography

@Composable
fun HeadingText(text:String){
    Text(
        text = "$text: ",
        modifier = Modifier.padding(bottom = 2.dp),
        style = Typography.h6.copy(fontSize = 16.sp)
    )
}