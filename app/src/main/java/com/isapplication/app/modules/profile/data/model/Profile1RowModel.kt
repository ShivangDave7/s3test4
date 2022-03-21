package com.isapplication.app.modules.profile.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Profile1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGender1: String? = MyApp.getInstance().resources.getString(R.string.lbl_male)

)
