package com.isapplication.app.modules.offerscreen2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.offerscreen2.`data`.model.OfferScreen2Model

public class OfferScreen2VM : ViewModel() {
  public val offerScreen2Model: MutableLiveData<OfferScreen2Model> =
      MutableLiveData(OfferScreen2Model())

  public var navArguments: Bundle? = null
}
