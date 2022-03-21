package com.isapplication.app.modules.lailyfafebrinacard.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class LailyfaFebrinaCardModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLailyfaFebrina: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lailyfa_febrina)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_6326_9124)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCARDHOLDER: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_card_holder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCARDSAVE: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_save)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLailyfaFebrina1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lailyfa_febrina)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDebitcardexpi: String? = MyApp.getInstance().resources.getString(R.string.lbl_06_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCardNumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExpirationDate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_expiration_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSecurityCode: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_security_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCardHolder: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_card_holder3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup109Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup110Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etZipcodeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup112Value: String? = null
)
