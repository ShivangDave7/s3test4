package com.isapplication.app.modules.reviewproduct.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.reviewproduct.`data`.model.ReviewProduct1RowModel
import com.isapplication.app.modules.reviewproduct.`data`.model.ReviewProductModel
import kotlin.collections.MutableList

public class ReviewProductVM : ViewModel() {
  public val reviewProductModel: MutableLiveData<ReviewProductModel> =
      MutableLiveData(ReviewProductModel())

  public var navArguments: Bundle? = null

  public val recyclerReviewProductList: MutableLiveData<MutableList<ReviewProduct1RowModel>> =
      MutableLiveData(mutableListOf())
}
