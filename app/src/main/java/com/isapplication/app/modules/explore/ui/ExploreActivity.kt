package com.isapplication.app.modules.explore.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityExploreBinding
import com.isapplication.app.modules.explore.`data`.model.Explore1RowModel
import com.isapplication.app.modules.explore.`data`.model.Explore2RowModel
import com.isapplication.app.modules.explore.`data`.viewmodel.ExploreVM
import com.isapplication.app.modules.notification.ui.NotificationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ExploreActivity : BaseActivity<ActivityExploreBinding>(R.layout.activity_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup255Adapter =
    RecyclerGroup255Adapter(viewModel.recyclerGroup255List.value?:mutableListOf())
    binding.recyclerGroup255.adapter = recyclerGroup255Adapter
    recyclerGroup255Adapter.setOnItemClickListener(
    object : RecyclerGroup255Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore1RowModel) {
        onClickRecyclerGroup255(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup255List.observe(this) {
      recyclerGroup255Adapter.updateData(it)
    }
    val recyclerGroup256Adapter =
    RecyclerGroup256Adapter(viewModel.recyclerGroup256List.value?:mutableListOf())
    binding.recyclerGroup256.adapter = recyclerGroup256Adapter
    recyclerGroup256Adapter.setOnItemClickListener(
    object : RecyclerGroup256Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore2RowModel) {
        onClickRecyclerGroup256(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup256List.observe(this) {
      recyclerGroup256Adapter.updateData(it)
    }
    binding.exploreVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageNotificationic.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerGroup255(
    view: View,
    position: Int,
    item: Explore1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup256(
    view: View,
    position: Int,
    item: Explore2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "EXPLORE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExploreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
