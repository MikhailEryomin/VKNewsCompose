package com.example.vknewscompose.ui.theme

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = {
            NavigationBar() {
                val selectedItemPosition = remember {
                    mutableStateOf(0)
                }
                val items = listOf(
                    NavigationItem.Home,
                    NavigationItem.Favourite,
                    NavigationItem.Profile
                )
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItemPosition.value == index,
                        onClick = {selectedItemPosition.value = index},
                        icon = {
                            Icon(imageVector = item.icon, contentDescription = null)
                        },
                        label = {
                            Text(text = item.title)
                        }
                    )
                }
            }
        }
    ) {

    }
}