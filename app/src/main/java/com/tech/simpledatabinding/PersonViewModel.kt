package com.tech.simpledatabinding

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
//import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel


class PersonViewModel : ViewModel() {

    private val _name = MutableLiveData<String>().apply { postValue("Mahshid") }
    private val _lastName = MutableLiveData<String>().apply { postValue("Ganjeh") }
    private val _likes = MutableLiveData<Int>().apply { postValue(0) }

    var name: LiveData<String> = _name
    val lastName: LiveData<String> = _lastName
    val likes: LiveData<Int> = _likes


    fun onLike() {
        _likes.value = (_likes.value ?: 0) + 1
    }

}