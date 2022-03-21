package com.isapplication.app.modules.registerform.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.registerform.`data`.model.RegisterFormModel

public class RegisterFormVM : ViewModel() {
  public val registerFormModel: MutableLiveData<RegisterFormModel> =
      MutableLiveData(RegisterFormModel())

  public var navArguments: Bundle? = null
}
