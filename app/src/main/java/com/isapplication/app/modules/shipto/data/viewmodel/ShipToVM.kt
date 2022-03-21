package com.isapplication.app.modules.shipto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.shipto.`data`.model.ShipTo1RowModel
import com.isapplication.app.modules.shipto.`data`.model.ShipToModel
import kotlin.collections.MutableList

public class ShipToVM : ViewModel() {
  public val shipToModel: MutableLiveData<ShipToModel> = MutableLiveData(ShipToModel())

  public var navArguments: Bundle? = null

  public val recyclerShipToList: MutableLiveData<MutableList<ShipTo1RowModel>> =
      MutableLiveData(mutableListOf())
}
