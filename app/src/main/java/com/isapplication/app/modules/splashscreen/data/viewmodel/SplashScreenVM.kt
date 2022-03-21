package com.isapplication.app.modules.splashscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.splashscreen.`data`.model.SplashScreenModel

public class SplashScreenVM : ViewModel() {
  public val splashScreenModel: MutableLiveData<SplashScreenModel> =
      MutableLiveData(SplashScreenModel())

  public var navArguments: Bundle? = null
}
