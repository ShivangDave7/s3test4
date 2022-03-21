package com.isapplication.app.modules.login.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcometoEco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_e_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignintocont: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_to_cont)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginwithGoog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_goog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginwithface: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_face)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup3Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup4Value: String? = null
)
