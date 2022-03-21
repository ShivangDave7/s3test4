package com.isapplication.app.network.repository

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import com.isapplication.app.extensions.NoInternetConnection
import com.isapplication.app.extensions.isOnline
import com.isapplication.app.network.RetrofitServices
import com.isapplication.app.network.models.createlogin.CreateLoginRequest
import com.isapplication.app.network.models.createlogin.CreateLoginResponse
import com.isapplication.app.network.resources.ErrorResponse
import com.isapplication.app.network.resources.Response
import com.isapplication.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import org.koin.core.KoinComponent
import org.koin.core.inject

public class NetworkRepository : KoinComponent {
  private val retrofitServices: RetrofitServices by inject()

  private val errorMessage: String = "Something went wrong."

  public suspend fun createLogin(contentType: String?, createLoginRequest: CreateLoginRequest?):
      Response<CreateLoginResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createLogin(contentType, createLoginRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }
}
