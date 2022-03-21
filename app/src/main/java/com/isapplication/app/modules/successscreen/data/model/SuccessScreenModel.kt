package com.isapplication.app.modules.successscreen.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SuccessScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThankyoufors: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_s)

)
