package com.isapplication.app.modules.registerform.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class RegisterFormModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLetsGetStart: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_get_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateannewa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_new_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup7Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup8Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup9Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup10Value: String? = null
)
