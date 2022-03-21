package com.isapplication.app.modules.reviewproduct.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProductModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtReviewCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_5_review2)

)
