package com.isapplication.app.modules.dashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.dashboard.`data`.model.Dashboard2RowModel
import com.isapplication.app.modules.dashboard.`data`.model.Dashboard3RowModel
import com.isapplication.app.modules.dashboard.`data`.model.Dashboard4RowModel
import com.isapplication.app.modules.dashboard.`data`.model.DashboardModel
import kotlin.collections.MutableList

public class DashboardVM : ViewModel() {
  public val dashboardModel: MutableLiveData<DashboardModel> = MutableLiveData(DashboardModel())

  public var navArguments: Bundle? = null

  public val recyclerFlashSaleList: MutableLiveData<MutableList<Dashboard2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerMegaSaleList: MutableLiveData<MutableList<Dashboard3RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerDashboardList: MutableLiveData<MutableList<Dashboard4RowModel>> =
      MutableLiveData(mutableListOf())
}
