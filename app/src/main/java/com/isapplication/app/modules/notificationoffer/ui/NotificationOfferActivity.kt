package com.isapplication.app.modules.notificationoffer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityNotificationOfferBinding
import com.isapplication.app.modules.notificationoffer.`data`.model.NotificationOffer1RowModel
import com.isapplication.app.modules.notificationoffer.`data`.viewmodel.NotificationOfferVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationOfferActivity :
    BaseActivity<ActivityNotificationOfferBinding>(R.layout.activity_notification_offer) {
  private val viewModel: NotificationOfferVM by viewModels<NotificationOfferVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerNotificationOfferAdapter =
    RecyclerNotificationOfferAdapter(viewModel.recyclerNotificationOfferList.value?:mutableListOf())
    binding.recyclerNotificationOffer.adapter = recyclerNotificationOfferAdapter
    recyclerNotificationOfferAdapter.setOnItemClickListener(
    object : RecyclerNotificationOfferAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NotificationOffer1RowModel) {
        onClickRecyclerNotificationOffer(view, position, item)
      }
    }
    )
    viewModel.recyclerNotificationOfferList.observe(this) {
      recyclerNotificationOfferAdapter.updateData(it)
    }
    binding.notificationOfferVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerNotificationOffer(
    view: View,
    position: Int,
    item: NotificationOffer1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_OFFER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationOfferActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
