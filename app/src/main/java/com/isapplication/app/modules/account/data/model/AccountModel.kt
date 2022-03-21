package com.isapplication.app.modules.account.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class AccountModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAccount1: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)

)
