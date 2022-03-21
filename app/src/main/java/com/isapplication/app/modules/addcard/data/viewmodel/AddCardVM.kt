package com.isapplication.app.modules.addcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.addcard.`data`.model.AddCardModel

public class AddCardVM : ViewModel() {
  public val addCardModel: MutableLiveData<AddCardModel> = MutableLiveData(AddCardModel())

  public var navArguments: Bundle? = null
}
