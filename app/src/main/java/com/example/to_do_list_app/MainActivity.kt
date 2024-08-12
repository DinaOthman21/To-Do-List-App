package com.example.to_do_list_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.to_do_list_app.presentation.MainViewModel
import com.example.to_do_list_app.presentation.navigation.AppNavigation
import com.example.to_do_list_app.ui.theme.To_Do_List_AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            To_Do_List_AppTheme {
                AppNavigation(mainViewModel = mainViewModel)
            }
        }
    }
}

