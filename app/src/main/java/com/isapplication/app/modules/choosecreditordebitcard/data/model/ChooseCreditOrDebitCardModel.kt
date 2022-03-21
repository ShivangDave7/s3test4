package com.isapplication.app.modules.choosecreditordebitcard.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ChooseCreditOrDebitCardModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtChooseCard: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_choose_card)

)
