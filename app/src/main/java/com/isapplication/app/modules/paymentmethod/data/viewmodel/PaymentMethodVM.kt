package com.isapplication.app.modules.paymentmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.paymentmethod.`data`.model.PaymentMethodModel

public class PaymentMethodVM : ViewModel() {
  public val paymentMethodModel: MutableLiveData<PaymentMethodModel> =
      MutableLiveData(PaymentMethodModel())

  public var navArguments: Bundle? = null
}
