package com.example.dropdownmenu.ui.signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Contact Us Fragment"
    }
    val text: LiveData<String> = _text
}
