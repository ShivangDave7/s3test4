package com.isapplication.app.modules.searchresult2.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchResult2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtResultCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_0_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManShoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtProductNotFou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_product_not_fou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThankyoufors: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup47Value: String? = null
)
