package com.example.git_demo.data

interface ApiService {

    suspend fun getDetails()
    suspend fun getname()
    suspend fun getbankdetails()
}