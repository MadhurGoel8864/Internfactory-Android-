package com.example.internfactory.server

import com.example.internfactory.modules.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitApi {
    @POST("/api")
    fun sendUserData(@Body userSend: User) : Call<User>
}