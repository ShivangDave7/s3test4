package com.isapplication.app.modules.creditcardanddebit.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebit1RowModel
import com.isapplication.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebitModel
import kotlin.collections.MutableList

public class CreditCardAndDebitVM : ViewModel() {
  public val creditCardAndDebitModel: MutableLiveData<CreditCardAndDebitModel> =
      MutableLiveData(CreditCardAndDebitModel())

  public var navArguments: Bundle? = null

  public val recyclerCreditCardAndDebitList:
      MutableLiveData<MutableList<CreditCardAndDebit1RowModel>> = MutableLiveData(mutableListOf())
}
