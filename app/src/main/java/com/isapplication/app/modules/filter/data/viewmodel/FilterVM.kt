package com.isapplication.app.modules.filter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.filter.`data`.model.FilterModel

public class FilterVM : ViewModel() {
  public val filterModel: MutableLiveData<FilterModel> = MutableLiveData(FilterModel())

  public var navArguments: Bundle? = null
}
