package com.example.internfactory.modules

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("firstName") val firstName : String?,
    @SerializedName("lastName") val lastName : String?,
    @SerializedName("email") val email : String?,
    @SerializedName("password") val password : String?
    )
