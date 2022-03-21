package com.isapplication.app.modules.notification.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNotification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeed: String? = MyApp.getInstance().resources.getString(R.string.lbl_feed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAcivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_acivity)

)
