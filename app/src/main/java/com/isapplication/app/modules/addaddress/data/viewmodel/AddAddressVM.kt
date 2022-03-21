package com.isapplication.app.modules.addaddress.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.addaddress.`data`.model.AddAddressModel

public class AddAddressVM : ViewModel() {
  public val addAddressModel: MutableLiveData<AddAddressModel> = MutableLiveData(AddAddressModel())

  public var navArguments: Bundle? = null
}
