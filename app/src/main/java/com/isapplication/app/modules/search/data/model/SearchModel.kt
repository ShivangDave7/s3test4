package com.isapplication.app.modules.search.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchresult: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_vaporm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchresult1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_273)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchresult2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_vaporm2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchresult3: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_97)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup45Value: String? = null
)
