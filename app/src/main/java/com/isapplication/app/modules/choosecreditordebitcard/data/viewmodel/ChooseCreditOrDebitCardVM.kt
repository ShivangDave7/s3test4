package com.isapplication.app.modules.choosecreditordebitcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.choosecreditordebitcard.`data`.model.ChooseCreditOrDebitCardModel

public class ChooseCreditOrDebitCardVM : ViewModel() {
  public val chooseCreditOrDebitCardModel: MutableLiveData<ChooseCreditOrDebitCardModel> =
      MutableLiveData(ChooseCreditOrDebitCardModel())

  public var navArguments: Bundle? = null
}
