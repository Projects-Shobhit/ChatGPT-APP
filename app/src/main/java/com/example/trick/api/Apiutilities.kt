package com.example.trick.api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Apiutilities {

    fun getApiInterface() : Apiinterface{
            return Retrofit.Builder()
                .baseUrl("https://api.openai.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Apiinterface::class.java)

    }
}