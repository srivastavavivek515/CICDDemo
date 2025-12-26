package com.example.practicekotlin.nav3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import kotlinx.serialization.Serializable

@kotlinx.serialization.Serializable
data object Home: NavKey

@Serializable
data class Detail(val person: Person): NavKey

@Serializable
data class Person(val id:Int, val name:String)





@Composable
fun AppNavigation() {
    val backStack = rememberNavBackStack(Home)
    NavDisplay(
     backStack = backStack,
        entryProvider = entryProvider {
            entry<Home> {
             HomeScreen {item-> backStack.add(Detail(item))  }
            }

            entry<Detail> {it->
            DetailScreen(it.person)
            }
        },
        onBack = {backStack.removeLastOrNull()}
    )

}
