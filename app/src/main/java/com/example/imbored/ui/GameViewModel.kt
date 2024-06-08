package com.example.imbored.ui

import androidx.lifecycle.ViewModel
import com.example.imbored.data.activities
import com.example.imbored.model.Activity
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class GameViewModel: ViewModel(){

    private val _uiState = MutableStateFlow(GameUiState())
    var uiState: StateFlow<GameUiState> = _uiState.asStateFlow()

    private fun findActivity(): Activity{
        var newActivity = activities.random()
        while(newActivity!=_uiState.value.activity){
            newActivity = activities.random()
        }
        return newActivity
    }

    fun newActivity(){
        _uiState.update { currentState-> currentState.copy(activity = findActivity()) }
    }
}