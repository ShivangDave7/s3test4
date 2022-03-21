package com.isapplication.app.modules.notificationoffer.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationOffer1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheBestTitle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_best_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_april_30_2014)

)
