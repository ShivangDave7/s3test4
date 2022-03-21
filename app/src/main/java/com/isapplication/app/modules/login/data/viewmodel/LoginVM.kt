package com.isapplication.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.login.`data`.model.LoginModel

public class LoginVM : ViewModel() {
  public val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())

  public var navArguments: Bundle? = null
}
