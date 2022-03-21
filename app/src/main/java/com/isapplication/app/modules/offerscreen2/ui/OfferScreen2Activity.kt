package com.isapplication.app.modules.offerscreen2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityOfferScreen2Binding
import com.isapplication.app.modules.notification.ui.NotificationActivity
import com.isapplication.app.modules.offerscreen2.`data`.viewmodel.OfferScreen2VM
import kotlin.String
import kotlin.Unit

public class OfferScreen2Activity :
    BaseActivity<ActivityOfferScreen2Binding>(R.layout.activity_offer_screen2) {
  private val viewModel: OfferScreen2VM by viewModels<OfferScreen2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.offerScreen2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageNotificationic.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "OFFER_SCREEN2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OfferScreen2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
