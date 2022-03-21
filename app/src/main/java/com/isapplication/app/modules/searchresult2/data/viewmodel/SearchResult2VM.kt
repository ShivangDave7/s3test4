package com.isapplication.app.modules.searchresult2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.searchresult2.`data`.model.SearchResult2Model

public class SearchResult2VM : ViewModel() {
  public val searchResult2Model: MutableLiveData<SearchResult2Model> =
      MutableLiveData(SearchResult2Model())

  public var navArguments: Bundle? = null
}
