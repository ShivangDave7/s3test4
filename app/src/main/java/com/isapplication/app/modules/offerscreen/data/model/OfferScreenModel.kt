package com.isapplication.app.modules.offerscreen.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class OfferScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSuperFlashSal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_flash_sal2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOffer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_flash_sal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
