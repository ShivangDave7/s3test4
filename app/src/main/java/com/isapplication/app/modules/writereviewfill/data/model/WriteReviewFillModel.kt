package com.isapplication.app.modules.writereviewfill.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class WriteReviewFillModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWriteReview: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_write_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPleasewriteOv: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_write_ov)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWriteYourRevi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_your_revi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup31Value: String? = null
)
