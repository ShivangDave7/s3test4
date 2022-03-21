package com.isapplication.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.isapplication.app.modules.login.`data`.model.LoginModel
import com.isapplication.app.network.models.createlogin.CreateLoginRequest
import com.isapplication.app.network.models.createlogin.CreateLoginResponse
import com.isapplication.app.network.repository.NetworkRepository
import com.isapplication.app.network.resources.Response
import kotlin.Boolean
import kotlin.Unit
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

public class LoginVM : ViewModel(), KoinComponent {
  public val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())

  public var navArguments: Bundle? = null

  public val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  public val createLoginLiveData: MutableLiveData<Response<CreateLoginResponse>> =
      MutableLiveData<Response<CreateLoginResponse>>()

  public fun onClickBtnSignIn(): Unit {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createLoginLiveData.postValue(
      networkRepository.createLogin(
      contentType = """application/json""",
          createLoginRequest = CreateLoginRequest(
          password = loginModel.value?.etGroup4Value,
          username = loginModel.value?.etGroup3Value)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  public fun bindCreateLoginResponse(response: CreateLoginResponse): Unit {
    val loginModelValue = loginModel.value ?:LoginModel()
    loginModel.value = loginModelValue
  }
}
