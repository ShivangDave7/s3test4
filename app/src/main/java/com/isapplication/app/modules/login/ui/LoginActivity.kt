package com.isapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityLoginBinding
import com.isapplication.app.modules.dashboard.ui.DashboardActivity
import com.isapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.isapplication.app.modules.registerform.ui.RegisterFormActivity
import kotlin.String
import kotlin.Unit

public class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.loginVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.txtConfirmation.setOnClickListener {
      val destIntent = RegisterFormActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignIn.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "LOGIN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
