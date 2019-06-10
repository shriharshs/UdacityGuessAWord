package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created on 2019-06-10.
 * apple
 */

class ScoreViewModel(val finalScore: Int) : ViewModel() {


    private val _playEventAgain = MutableLiveData<Boolean>()
    val playEventAgain: LiveData<Boolean>
        get() = _playEventAgain

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    init {
        _score.value = finalScore
    }

    fun onPlayAgain() {
        _playEventAgain.value = true
    }

    fun onPlayAgainComplete() {
        _playEventAgain.value = false
    }

}