package com.example.to_do_list_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_do_list_app.ui.theme.To_Do_List_AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            To_Do_List_AppTheme {


            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    To_Do_List_AppTheme {

    }
}