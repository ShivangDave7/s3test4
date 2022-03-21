package com.isapplication.app.modules.changepassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.changepassword.`data`.model.ChangePasswordModel

public class ChangePasswordVM : ViewModel() {
  public val changePasswordModel: MutableLiveData<ChangePasswordModel> =
      MutableLiveData(ChangePasswordModel())

  public var navArguments: Bundle? = null
}
