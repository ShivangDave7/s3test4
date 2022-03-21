package com.isapplication.app.modules.order.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityOrderBinding
import com.isapplication.app.modules.order.`data`.model.Order1RowModel
import com.isapplication.app.modules.order.`data`.viewmodel.OrderVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OrderActivity : BaseActivity<ActivityOrderBinding>(R.layout.activity_order) {
  private val viewModel: OrderVM by viewModels<OrderVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerOrderAdapter =
    RecyclerOrderAdapter(viewModel.recyclerOrderList.value?:mutableListOf())
    binding.recyclerOrder.adapter = recyclerOrderAdapter
    recyclerOrderAdapter.setOnItemClickListener(
    object : RecyclerOrderAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Order1RowModel) {
        onClickRecyclerOrder(view, position, item)
      }
    }
    )
    viewModel.recyclerOrderList.observe(this) {
      recyclerOrderAdapter.updateData(it)
    }
    binding.orderVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerOrder(
    view: View,
    position: Int,
    item: Order1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "ORDER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
