package com.isapplication.app.modules.orderdetails.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class OrderDetails1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNikeAirZoomP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)

)
