package com.isapplication.app.modules.orderdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.orderdetails.`data`.model.OrderDetails1RowModel
import com.isapplication.app.modules.orderdetails.`data`.model.OrderDetailsModel
import kotlin.collections.MutableList

public class OrderDetailsVM : ViewModel() {
  public val orderDetailsModel: MutableLiveData<OrderDetailsModel> =
      MutableLiveData(OrderDetailsModel())

  public var navArguments: Bundle? = null

  public val recyclerOrderDetailsList: MutableLiveData<MutableList<OrderDetails1RowModel>> =
      MutableLiveData(mutableListOf())
}
