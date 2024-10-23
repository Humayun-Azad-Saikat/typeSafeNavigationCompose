package com.example.typesafenavigaitoncompose.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.typesafenavigaitoncompose.screens.Screen_A
import com.example.typesafenavigaitoncompose.screens.Screen_B

@Composable
fun MainNavigation(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenDestination.ScreenA){

        composable<ScreenDestination.ScreenA>{
            Screen_A { name,age->
                navController.navigate(ScreenDestination.ScreenB(name,age))
            }
        }

        composable<ScreenDestination.ScreenB>{
            val args = it.toRoute<ScreenDestination.ScreenB>()
            Screen_B(args.name,args.age)
        }

    }


}



