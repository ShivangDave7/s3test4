package com.isapplication.app.modules.successscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.successscreen.`data`.model.SuccessScreenModel

public class SuccessScreenVM : ViewModel() {
  public val successScreenModel: MutableLiveData<SuccessScreenModel> =
      MutableLiveData(SuccessScreenModel())

  public var navArguments: Bundle? = null
}
