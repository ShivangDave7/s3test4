package com.isapplication.app.modules.profile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.profile.`data`.model.Profile1RowModel
import com.isapplication.app.modules.profile.`data`.model.ProfileModel
import kotlin.collections.MutableList

public class ProfileVM : ViewModel() {
  public val profileModel: MutableLiveData<ProfileModel> = MutableLiveData(ProfileModel())

  public var navArguments: Bundle? = null

  public val recyclerProfileList: MutableLiveData<MutableList<Profile1RowModel>> =
      MutableLiveData(mutableListOf())
}
