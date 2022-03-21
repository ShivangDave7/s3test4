package com.isapplication.app.modules.addpayment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.addpayment.`data`.model.AddPaymentModel

public class AddPaymentVM : ViewModel() {
  public val addPaymentModel: MutableLiveData<AddPaymentModel> = MutableLiveData(AddPaymentModel())

  public var navArguments: Bundle? = null
}
