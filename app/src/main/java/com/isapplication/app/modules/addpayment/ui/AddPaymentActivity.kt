package com.isapplication.app.modules.addpayment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityAddPaymentBinding
import com.isapplication.app.modules.addpayment.`data`.viewmodel.AddPaymentVM
import com.isapplication.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import kotlin.String
import kotlin.Unit

public class AddPaymentActivity :
    BaseActivity<ActivityAddPaymentBinding>(R.layout.activity_add_payment) {
  private val viewModel: AddPaymentVM by viewModels<AddPaymentVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.addPaymentVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearGroup460.setOnClickListener {
      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "ADD_PAYMENT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddPaymentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
