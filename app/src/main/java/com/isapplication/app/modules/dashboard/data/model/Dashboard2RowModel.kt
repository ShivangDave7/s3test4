package com.isapplication.app.modules.dashboard.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Dashboard2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFSNikeAirM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fs_nike_air_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice3: String? = MyApp.getInstance().resources.getString(R.string.lbl_534_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_off)

)
