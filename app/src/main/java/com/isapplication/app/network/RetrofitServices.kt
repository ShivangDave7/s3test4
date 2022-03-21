package com.isapplication.app.network

import com.isapplication.app.network.models.createlogin.CreateLoginRequest
import com.isapplication.app.network.models.createlogin.CreateLoginResponse
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

public interface RetrofitServices {
  @POST("/device/auth/login")
  public suspend fun createLogin(@Header("Content-Type") contentType: String?, @Body
      createLoginRequest: CreateLoginRequest?): CreateLoginResponse
}

public const val BASE_URL: String = "https://nodedemo.dhiwise.co"
