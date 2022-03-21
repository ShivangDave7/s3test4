package com.isapplication.app.modules.paymentmethod.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class PaymentMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreditCardOr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaypal: String? = MyApp.getInstance().resources.getString(R.string.lbl_paypal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBankTransfer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bank_transfer)

)
