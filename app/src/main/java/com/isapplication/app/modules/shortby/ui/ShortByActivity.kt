package com.isapplication.app.modules.shortby.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityShortByBinding
import com.isapplication.app.modules.shortby.`data`.viewmodel.ShortByVM
import kotlin.String
import kotlin.Unit

public class ShortByActivity : BaseActivity<ActivityShortByBinding>(R.layout.activity_short_by) {
  private val viewModel: ShortByVM by viewModels<ShortByVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.shortByVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SHORT_BY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShortByActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
