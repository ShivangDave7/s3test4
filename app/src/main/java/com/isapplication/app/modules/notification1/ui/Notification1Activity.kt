package com.isapplication.app.modules.notification1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityNotification1Binding
import com.isapplication.app.modules.notification1.`data`.model.Notification2RowModel
import com.isapplication.app.modules.notification1.`data`.viewmodel.Notification1VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Notification1Activity :
    BaseActivity<ActivityNotification1Binding>(R.layout.activity_notification1) {
  private val viewModel: Notification1VM by viewModels<Notification1VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerNotificationAdapter =
    RecyclerNotificationAdapter(viewModel.recyclerNotificationList.value?:mutableListOf())
    binding.recyclerNotification.adapter = recyclerNotificationAdapter
    recyclerNotificationAdapter.setOnItemClickListener(
    object : RecyclerNotificationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Notification2RowModel) {
        onClickRecyclerNotification(view, position, item)
      }
    }
    )
    viewModel.recyclerNotificationList.observe(this) {
      recyclerNotificationAdapter.updateData(it)
    }
    binding.notification1VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerNotification(
    view: View,
    position: Int,
    item: Notification2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Notification1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
