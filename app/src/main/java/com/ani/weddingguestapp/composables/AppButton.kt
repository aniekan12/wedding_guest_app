package com.ani.weddingguestapp.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ani.weddingguestapp.ui.theme.Purple200
import com.ani.weddingguestapp.ui.theme.Red
import com.ani.weddingguestapp.ui.theme.Typography

@Composable
fun AppButton(onClick: () -> Unit, enabled:Boolean, buttonText: Int, padding: Int) {
    Button(
        enabled = enabled,
        onClick = onClick, colors = ButtonDefaults.buttonColors(
            backgroundColor = Red,
        ),
        shape = RoundedCornerShape(20),
        modifier = Modifier
            .padding(top = padding.dp)
            .width(300.dp)
            .height(60.dp)
    ) {
        Text(
            text = stringResource(id = buttonText),
            style = Typography.body1.copy(
                fontSize =18.sp,
                color = com.ani.weddingguestapp.ui.theme.White,
                fontWeight = FontWeight.Bold
            )
        )
    }
}