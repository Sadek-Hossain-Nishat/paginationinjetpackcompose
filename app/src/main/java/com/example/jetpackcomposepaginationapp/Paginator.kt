package com.example.jetpackcomposepaginationapp

interface Paginator<Item, T> {

    suspend fun loadNextItems()
    fun reset()

}