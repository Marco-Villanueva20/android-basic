package pe.dev.android_basic.unidad_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.dev.android_basic.R
import pe.dev.android_basic.unidad_1.ui.theme.AndroidbasicTheme

class TaskManagerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidbasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskCompletedApp()
                }
            }
        }
    }
}


@Composable
fun TaskCompletedApp(){
    TaskCompletedScreen(imagePainter = painterResource(id = R.drawable.ic_task_completed),
        title = stringResource(R.string.all_task_completed),
        shortDescription = stringResource(R.string.nice_work))
}

@Composable
fun TaskCompletedScreen(imagePainter: Painter,
                       title: String,
                       shortDescription: String,
                       modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = imagePainter,
            contentDescription = null
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top=24.dp, bottom = 8.dp)
        )
        Text(
            text = shortDescription,
            fontSize = 16.sp,
        )
    }

}

@Preview(
    showSystemUi = true,
    showBackground = true)
@Composable
fun TaskCompletedPreview() {
    AndroidbasicTheme {
        TaskCompletedApp()
    }
}