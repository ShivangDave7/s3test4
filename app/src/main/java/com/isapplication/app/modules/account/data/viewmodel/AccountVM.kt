package com.isapplication.app.modules.account.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.account.`data`.model.AccountModel

public class AccountVM : ViewModel() {
  public val accountModel: MutableLiveData<AccountModel> = MutableLiveData(AccountModel())

  public var navArguments: Bundle? = null
}
