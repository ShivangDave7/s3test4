package com.isapplication.app.modules.notificationfeed.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationFeed1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNikeAirZoomP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_june_3_2015_5)

)
