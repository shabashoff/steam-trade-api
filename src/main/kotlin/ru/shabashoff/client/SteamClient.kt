package ru.shabashoff.client

import retrofit2.http.POST


interface SteamClient {
    @POST("/login/dologin")
    fun login(
        username: String
    )
}