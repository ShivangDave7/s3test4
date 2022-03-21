package com.isapplication.app.modules.cart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityCartBinding
import com.isapplication.app.modules.cart.`data`.model.Cart1RowModel
import com.isapplication.app.modules.cart.`data`.viewmodel.CartVM
import com.isapplication.app.modules.notification.ui.NotificationActivity
import com.isapplication.app.modules.shipto.ui.ShipToActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CartActivity : BaseActivity<ActivityCartBinding>(R.layout.activity_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerCartAdapter =
    RecyclerCartAdapter(viewModel.recyclerCartList.value?:mutableListOf())
    binding.recyclerCart.adapter = recyclerCartAdapter
    recyclerCartAdapter.setOnItemClickListener(
    object : RecyclerCartAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Cart1RowModel) {
        onClickRecyclerCart(view, position, item)
      }
    }
    )
    viewModel.recyclerCartList.observe(this) {
      recyclerCartAdapter.updateData(it)
    }
    binding.cartVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnCheckOut.setOnClickListener {
      val destIntent = ShipToActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageNotificationic.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerCart(
    view: View,
    position: Int,
    item: Cart1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "CART_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
