package com.example.typesafenavigaitoncompose.navigate

import kotlinx.serialization.Serializable

sealed class ScreenDestination {

    @Serializable
    object ScreenA: ScreenDestination()

    @Serializable
    data class ScreenB(
        val name: String,
        val age: Int
    ): ScreenDestination()

}