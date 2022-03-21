package com.isapplication.app.modules.addcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityAddCardBinding
import com.isapplication.app.modules.addcard.`data`.viewmodel.AddCardVM
import com.isapplication.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import kotlin.String
import kotlin.Unit

public class AddCardActivity : BaseActivity<ActivityAddCardBinding>(R.layout.activity_add_card) {
  private val viewModel: AddCardVM by viewModels<AddCardVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.addCardVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnAddCard.setOnClickListener {
      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "ADD_CARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
