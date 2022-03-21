package com.isapplication.app.modules.writereviewfill.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.writereviewfill.`data`.model.WriteReviewFillModel

public class WriteReviewFillVM : ViewModel() {
  public val writeReviewFillModel: MutableLiveData<WriteReviewFillModel> =
      MutableLiveData(WriteReviewFillModel())

  public var navArguments: Bundle? = null
}
