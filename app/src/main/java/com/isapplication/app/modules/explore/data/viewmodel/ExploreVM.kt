package com.isapplication.app.modules.explore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.explore.`data`.model.Explore1RowModel
import com.isapplication.app.modules.explore.`data`.model.Explore2RowModel
import com.isapplication.app.modules.explore.`data`.model.ExploreModel
import kotlin.collections.MutableList

public class ExploreVM : ViewModel() {
  public val exploreModel: MutableLiveData<ExploreModel> = MutableLiveData(ExploreModel())

  public var navArguments: Bundle? = null

  public val recyclerGroup255List: MutableLiveData<MutableList<Explore1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup256List: MutableLiveData<MutableList<Explore2RowModel>> =
      MutableLiveData(mutableListOf())
}
