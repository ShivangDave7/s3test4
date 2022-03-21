package com.isapplication.app.modules.changepassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityChangePasswordBinding
import com.isapplication.app.modules.account.ui.AccountActivity
import com.isapplication.app.modules.changepassword.`data`.viewmodel.ChangePasswordVM
import kotlin.String
import kotlin.Unit

public class ChangePasswordActivity :
    BaseActivity<ActivityChangePasswordBinding>(R.layout.activity_change_password) {
  private val viewModel: ChangePasswordVM by viewModels<ChangePasswordVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.changePasswordVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = AccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "CHANGE_PASSWORD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChangePasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
