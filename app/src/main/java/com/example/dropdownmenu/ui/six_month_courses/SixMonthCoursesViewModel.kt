package com.example.dropdownmenu.ui.six_week_courses

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SixMonthCoursesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is the Six Month Courses Fragment"
    }
    val text: LiveData<String> = _text
}
