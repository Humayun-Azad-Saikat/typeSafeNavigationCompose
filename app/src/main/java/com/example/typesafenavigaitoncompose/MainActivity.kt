package com.example.typesafenavigaitoncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.typesafenavigaitoncompose.navigate.MainNavigation
import com.example.typesafenavigaitoncompose.ui.theme.TypeSafeNavigaitonComposeTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TypeSafeNavigaitonComposeTheme {


                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerpadding->

                    MainNavigation()

                }


            }

        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TypeSafeNavigaitonComposeTheme {

    }
}