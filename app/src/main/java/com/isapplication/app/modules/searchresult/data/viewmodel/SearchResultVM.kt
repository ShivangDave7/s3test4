package com.isapplication.app.modules.searchresult.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.searchresult.`data`.model.SearchResult1RowModel
import com.isapplication.app.modules.searchresult.`data`.model.SearchResultModel
import kotlin.collections.MutableList

public class SearchResultVM : ViewModel() {
  public val searchResultModel: MutableLiveData<SearchResultModel> =
      MutableLiveData(SearchResultModel())

  public var navArguments: Bundle? = null

  public val recyclerSearchResultList: MutableLiveData<MutableList<SearchResult1RowModel>> =
      MutableLiveData(mutableListOf())
}
