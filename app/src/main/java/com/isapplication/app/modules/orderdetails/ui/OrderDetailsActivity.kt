package com.isapplication.app.modules.orderdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityOrderDetailsBinding
import com.isapplication.app.modules.orderdetails.`data`.model.OrderDetails1RowModel
import com.isapplication.app.modules.orderdetails.`data`.viewmodel.OrderDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OrderDetailsActivity :
    BaseActivity<ActivityOrderDetailsBinding>(R.layout.activity_order_details) {
  private val viewModel: OrderDetailsVM by viewModels<OrderDetailsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerOrderDetailsAdapter =
    RecyclerOrderDetailsAdapter(viewModel.recyclerOrderDetailsList.value?:mutableListOf())
    binding.recyclerOrderDetails.adapter = recyclerOrderDetailsAdapter
    recyclerOrderDetailsAdapter.setOnItemClickListener(
    object : RecyclerOrderDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OrderDetails1RowModel) {
        onClickRecyclerOrderDetails(view, position, item)
      }
    }
    )
    viewModel.recyclerOrderDetailsList.observe(this) {
      recyclerOrderDetailsAdapter.updateData(it)
    }
    binding.orderDetailsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerOrderDetails(
    view: View,
    position: Int,
    item: OrderDetails1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "ORDER_DETAILS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
