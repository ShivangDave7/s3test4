package com.isapplication.app.modules.registerform.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityRegisterFormBinding
import com.isapplication.app.modules.dashboard.ui.DashboardActivity
import com.isapplication.app.modules.registerform.`data`.viewmodel.RegisterFormVM
import kotlin.String
import kotlin.Unit

public class RegisterFormActivity :
    BaseActivity<ActivityRegisterFormBinding>(R.layout.activity_register_form) {
  private val viewModel: RegisterFormVM by viewModels<RegisterFormVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.registerFormVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnSignUp.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "REGISTER_FORM_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterFormActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
