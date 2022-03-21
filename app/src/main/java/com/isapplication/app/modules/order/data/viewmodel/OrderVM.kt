package com.isapplication.app.modules.order.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.order.`data`.model.Order1RowModel
import com.isapplication.app.modules.order.`data`.model.OrderModel
import kotlin.collections.MutableList

public class OrderVM : ViewModel() {
  public val orderModel: MutableLiveData<OrderModel> = MutableLiveData(OrderModel())

  public var navArguments: Bundle? = null

  public val recyclerOrderList: MutableLiveData<MutableList<Order1RowModel>> =
      MutableLiveData(mutableListOf())
}
