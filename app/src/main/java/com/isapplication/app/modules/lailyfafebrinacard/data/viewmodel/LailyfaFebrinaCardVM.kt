package com.isapplication.app.modules.lailyfafebrinacard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.lailyfafebrinacard.`data`.model.LailyfaFebrinaCardModel

public class LailyfaFebrinaCardVM : ViewModel() {
  public val lailyfaFebrinaCardModel: MutableLiveData<LailyfaFebrinaCardModel> =
      MutableLiveData(LailyfaFebrinaCardModel())

  public var navArguments: Bundle? = null
}
