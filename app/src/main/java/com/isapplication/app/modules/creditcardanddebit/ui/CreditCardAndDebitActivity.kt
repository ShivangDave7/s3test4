package com.isapplication.app.modules.creditcardanddebit.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityCreditCardAndDebitBinding
import com.isapplication.app.modules.addcard.ui.AddCardActivity
import com.isapplication.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebit1RowModel
import com.isapplication.app.modules.creditcardanddebit.`data`.viewmodel.CreditCardAndDebitVM
import com.isapplication.app.modules.lailyfafebrinacard.ui.LailyfaFebrinaCardActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CreditCardAndDebitActivity :
    BaseActivity<ActivityCreditCardAndDebitBinding>(R.layout.activity_credit_card_and_debit) {
  private val viewModel: CreditCardAndDebitVM by viewModels<CreditCardAndDebitVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerCreditCardAndDebitAdapter =
    RecyclerCreditCardAndDebitAdapter(viewModel.recyclerCreditCardAndDebitList.value?:mutableListOf())
    binding.recyclerCreditCardAndDebit.adapter = recyclerCreditCardAndDebitAdapter
    recyclerCreditCardAndDebitAdapter.setOnItemClickListener(
    object : RecyclerCreditCardAndDebitAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CreditCardAndDebit1RowModel) {
        onClickRecyclerCreditCardAndDebit(view, position, item)
      }
    }
    )
    viewModel.recyclerCreditCardAndDebitList.observe(this) {
      recyclerCreditCardAndDebitAdapter.updateData(it)
    }
    binding.creditCardAndDebitVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnAddCard.setOnClickListener {
      val destIntent = AddCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerCreditCardAndDebit(
    view: View,
    position: Int,
    item: CreditCardAndDebit1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearCreditCarddet -> {
        val destIntent = LailyfaFebrinaCardActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public companion object {
    public const val TAG: String = "CREDIT_CARD_AND_DEBIT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreditCardAndDebitActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
