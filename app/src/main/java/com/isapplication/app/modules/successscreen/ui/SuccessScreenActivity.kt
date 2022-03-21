package com.isapplication.app.modules.successscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivitySuccessScreenBinding
import com.isapplication.app.modules.order.ui.OrderActivity
import com.isapplication.app.modules.successscreen.`data`.viewmodel.SuccessScreenVM
import kotlin.String
import kotlin.Unit

public class SuccessScreenActivity :
    BaseActivity<ActivitySuccessScreenBinding>(R.layout.activity_success_screen) {
  private val viewModel: SuccessScreenVM by viewModels<SuccessScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.successScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnBackToOrder.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SUCCESS_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SuccessScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
