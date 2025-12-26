package com.example.practicekotlin.nav3

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp




@Composable
fun HomeScreen(onItemClick:(Person)->Unit) {
     val myitems = listOf("vivek","ankit","shivam","vikas")
    val listOfPerson = listOf<Person>(
        Person(1,"vivek"),
        Person(2,"abhishek"),
        Person(3,"shivam"),
        Person(4,"manish"),
    )
    LazyColumn(modifier = Modifier.fillMaxSize()){
       items(listOfPerson){item->
           Box(modifier = Modifier.fillMaxWidth().background(color = Color.DarkGray).clickable{
               onItemClick(item)
           }.padding(20.dp)) {
               Text(item.name)
           }

       }
    }



}

@Composable
fun DetailScreen(person: Person) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("The passed value is ${person.name}")

    }

}
