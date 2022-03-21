package com.isapplication.app.modules.notificationfeed.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.notificationfeed.`data`.model.NotificationFeed1RowModel
import com.isapplication.app.modules.notificationfeed.`data`.model.NotificationFeedModel
import kotlin.collections.MutableList

public class NotificationFeedVM : ViewModel() {
  public val notificationFeedModel: MutableLiveData<NotificationFeedModel> =
      MutableLiveData(NotificationFeedModel())

  public var navArguments: Bundle? = null

  public val recyclerNotificationFeedList: MutableLiveData<MutableList<NotificationFeed1RowModel>> =
      MutableLiveData(mutableListOf())
}
