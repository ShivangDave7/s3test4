package com.isapplication.app.modules.shortby.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.shortby.`data`.model.ShortByModel

public class ShortByVM : ViewModel() {
  public val shortByModel: MutableLiveData<ShortByModel> = MutableLiveData(ShortByModel())

  public var navArguments: Bundle? = null
}
