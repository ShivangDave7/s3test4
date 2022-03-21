package com.isapplication.app.modules.address.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityAddressBinding
import com.isapplication.app.modules.address.`data`.model.Address1RowModel
import com.isapplication.app.modules.address.`data`.viewmodel.AddressVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AddressActivity : BaseActivity<ActivityAddressBinding>(R.layout.activity_address) {
  private val viewModel: AddressVM by viewModels<AddressVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerAddressAdapter =
    RecyclerAddressAdapter(viewModel.recyclerAddressList.value?:mutableListOf())
    binding.recyclerAddress.adapter = recyclerAddressAdapter
    recyclerAddressAdapter.setOnItemClickListener(
    object : RecyclerAddressAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Address1RowModel) {
        onClickRecyclerAddress(view, position, item)
      }
    }
    )
    viewModel.recyclerAddressList.observe(this) {
      recyclerAddressAdapter.updateData(it)
    }
    binding.addressVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerAddress(
    view: View,
    position: Int,
    item: Address1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "ADDRESS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddressActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
