package com.example.vknewscompose.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.vknewscompose.R

sealed class NavigationItem(
    val title: String,
    val icon: ImageVector
) {
    object Home: NavigationItem(
        title = "Главная",
        icon = Icons.Outlined.Home
    )
    object Favourite: NavigationItem(
        title = "Избранное",
        icon = Icons.Outlined.Favorite
    )
    object Profile: NavigationItem(
        title = "Профиль",
        icon = Icons.Outlined.Person
    )
}