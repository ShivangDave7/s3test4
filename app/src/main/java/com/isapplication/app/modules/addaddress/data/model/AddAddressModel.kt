package com.isapplication.app.modules.addaddress.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class AddAddressModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCountryorregi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_country_or_regi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFirstName: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStreetAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_street_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStreetAddress1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_street_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStateProvince: String? =
      MyApp.getInstance().resources.getString(R.string.msg_state_province)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtZipCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_zip_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPhoneNumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup95Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup103Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup96Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup97Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup98Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup99Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup100Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup101Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup102Value: String? = null
)
