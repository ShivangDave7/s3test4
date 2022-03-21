package com.isapplication.app.modules.notificationoffer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.notificationoffer.`data`.model.NotificationOffer1RowModel
import com.isapplication.app.modules.notificationoffer.`data`.model.NotificationOfferModel
import kotlin.collections.MutableList

public class NotificationOfferVM : ViewModel() {
  public val notificationOfferModel: MutableLiveData<NotificationOfferModel> =
      MutableLiveData(NotificationOfferModel())

  public var navArguments: Bundle? = null

  public val recyclerNotificationOfferList: MutableLiveData<MutableList<NotificationOffer1RowModel>>
      = MutableLiveData(mutableListOf())
}
