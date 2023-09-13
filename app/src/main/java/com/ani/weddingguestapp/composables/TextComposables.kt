import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ani.weddingguestapp.ui.theme.Typography


@Composable
fun Heading3Text(text: String, textAlign: TextAlign = TextAlign.Start, padding: Int? = 0, modifier: Modifier) {
    Text(
        textAlign = textAlign,
        text = text,
        style = Typography.h3.copy(fontWeight = FontWeight.Bold),
        modifier = modifier,
    )
}

//@Composable
//fun Heading4Text(text: String, modifier: Modifier) {
//    Text(
//        text = text,
//        style = Typography.h6.copy(fontSize = 18.sp),
//        modifier = modifier,
//    )
//}
//
//@Composable
//fun BodyText(
//    text: String,
//    textAlign: TextAlign,
//    fontWeight: FontWeight,
//    modifier: Modifier = Modifier.padding()
//) {
//    Text(
//        modifier = modifier,
//        textAlign = textAlign,
//        text = text,
//        style = Typography.body1.copy(fontWeight = fontWeight, fontSize = 16.sp),
//    )
//}