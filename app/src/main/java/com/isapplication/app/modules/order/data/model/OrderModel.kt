package com.isapplication.app.modules.order.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class OrderModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)

)
