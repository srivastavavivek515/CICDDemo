package com.example.practicekotlin.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CounterViewModel : ViewModel(){

    private val _count  =   MutableStateFlow(6)

    val count: StateFlow<Int> = _count.asStateFlow()

    fun increamentCounter(){
       _count.value = _count.value+1

        _count.update {
         it+1
        }
    }

    fun decreamentCounter(){
        _count.update {
            it-1
        }
    }
}
