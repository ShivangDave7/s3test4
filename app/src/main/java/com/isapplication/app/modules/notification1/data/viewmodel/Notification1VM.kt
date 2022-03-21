package com.isapplication.app.modules.notification1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.notification1.`data`.model.Notification1Model
import com.isapplication.app.modules.notification1.`data`.model.Notification2RowModel
import kotlin.collections.MutableList

public class Notification1VM : ViewModel() {
  public val notification1Model: MutableLiveData<Notification1Model> =
      MutableLiveData(Notification1Model())

  public var navArguments: Bundle? = null

  public val recyclerNotificationList: MutableLiveData<MutableList<Notification2RowModel>> =
      MutableLiveData(mutableListOf())
}
