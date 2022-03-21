package com.isapplication.app.modules.notificationfeed.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityNotificationFeedBinding
import com.isapplication.app.modules.notificationfeed.`data`.model.NotificationFeed1RowModel
import com.isapplication.app.modules.notificationfeed.`data`.viewmodel.NotificationFeedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationFeedActivity :
    BaseActivity<ActivityNotificationFeedBinding>(R.layout.activity_notification_feed) {
  private val viewModel: NotificationFeedVM by viewModels<NotificationFeedVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerNotificationFeedAdapter =
    RecyclerNotificationFeedAdapter(viewModel.recyclerNotificationFeedList.value?:mutableListOf())
    binding.recyclerNotificationFeed.adapter = recyclerNotificationFeedAdapter
    recyclerNotificationFeedAdapter.setOnItemClickListener(
    object : RecyclerNotificationFeedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NotificationFeed1RowModel) {
        onClickRecyclerNotificationFeed(view, position, item)
      }
    }
    )
    viewModel.recyclerNotificationFeedList.observe(this) {
      recyclerNotificationFeedAdapter.updateData(it)
    }
    binding.notificationFeedVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerNotificationFeed(
    view: View,
    position: Int,
    item: NotificationFeed1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_FEED_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationFeedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
