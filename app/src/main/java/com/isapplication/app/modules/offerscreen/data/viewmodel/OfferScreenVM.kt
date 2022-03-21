package com.isapplication.app.modules.offerscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.offerscreen.`data`.model.OfferScreen1RowModel
import com.isapplication.app.modules.offerscreen.`data`.model.OfferScreenModel
import kotlin.collections.MutableList

public class OfferScreenVM : ViewModel() {
  public val offerScreenModel: MutableLiveData<OfferScreenModel> =
      MutableLiveData(OfferScreenModel())

  public var navArguments: Bundle? = null

  public val recyclerOfferScreenList: MutableLiveData<MutableList<OfferScreen1RowModel>> =
      MutableLiveData(mutableListOf())
}
