package com.example.yun.jetpack.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()

    val data: MutableLiveData<String>
        get() = _data

    init {
        _data.value = "LiveData test"
    }
}
