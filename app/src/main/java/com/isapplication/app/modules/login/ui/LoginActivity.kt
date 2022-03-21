package com.isapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityLoginBinding
import com.isapplication.app.extensions.NoInternetConnection
import com.isapplication.app.extensions.hideKeyboard
import com.isapplication.app.extensions.showProgressDialog
import com.isapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.isapplication.app.network.models.createlogin.CreateLoginResponse
import com.isapplication.app.network.resources.ErrorResponse
import com.isapplication.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import kotlin.Unit

public class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.loginVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnSignIn.setOnClickListener {
      this@LoginActivity.hideKeyboard()
      viewModel.onClickBtnSignIn()
    }
  }

  public override fun addObservers(): Unit {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@LoginActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@LoginActivity.showProgressDialog()
      } else  {
        progressDialog?.dismiss()
      }
    }
    viewModel.createLoginLiveData.observe(this@LoginActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreateLogin(it)
      } else if(it is ErrorResponse)  {
        onErrorCreateLogin(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>): Unit {
    viewModel.bindCreateLoginResponse(response.data)
  }

  private fun onErrorCreateLogin(exception: Exception): Unit {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
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
