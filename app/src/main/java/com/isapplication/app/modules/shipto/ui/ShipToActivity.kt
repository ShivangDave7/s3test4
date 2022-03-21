package com.isapplication.app.modules.shipto.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityShipToBinding
import com.isapplication.app.modules.paymentmethod.ui.PaymentMethodActivity
import com.isapplication.app.modules.shipto.`data`.model.ShipTo1RowModel
import com.isapplication.app.modules.shipto.`data`.viewmodel.ShipToVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ShipToActivity : BaseActivity<ActivityShipToBinding>(R.layout.activity_ship_to) {
  private val viewModel: ShipToVM by viewModels<ShipToVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerShipToAdapter =
    RecyclerShipToAdapter(viewModel.recyclerShipToList.value?:mutableListOf())
    binding.recyclerShipTo.adapter = recyclerShipToAdapter
    recyclerShipToAdapter.setOnItemClickListener(
    object : RecyclerShipToAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ShipTo1RowModel) {
        onClickRecyclerShipTo(view, position, item)
      }
    }
    )
    viewModel.recyclerShipToList.observe(this) {
      recyclerShipToAdapter.updateData(it)
    }
    binding.shipToVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = PaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerShipTo(
    view: View,
    position: Int,
    item: ShipTo1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "SHIP_TO_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShipToActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
