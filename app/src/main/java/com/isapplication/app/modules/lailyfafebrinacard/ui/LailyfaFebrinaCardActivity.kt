package com.isapplication.app.modules.lailyfafebrinacard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityLailyfaFebrinaCardBinding
import com.isapplication.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import com.isapplication.app.modules.lailyfafebrinacard.`data`.viewmodel.LailyfaFebrinaCardVM
import kotlin.String
import kotlin.Unit

public class LailyfaFebrinaCardActivity :
    BaseActivity<ActivityLailyfaFebrinaCardBinding>(R.layout.activity_lailyfa_febrina_card) {
  private val viewModel: LailyfaFebrinaCardVM by viewModels<LailyfaFebrinaCardVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.lailyfaFebrinaCardVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "LAILYFA_FEBRINA_CARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LailyfaFebrinaCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
