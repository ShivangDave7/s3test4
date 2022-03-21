package com.isapplication.app.modules.notification1.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Notification2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTransactionNik: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_nik)
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
