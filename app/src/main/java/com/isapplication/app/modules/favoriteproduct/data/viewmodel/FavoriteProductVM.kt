package com.isapplication.app.modules.favoriteproduct.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.favoriteproduct.`data`.model.FavoriteProduct1RowModel
import com.isapplication.app.modules.favoriteproduct.`data`.model.FavoriteProductModel
import kotlin.collections.MutableList

public class FavoriteProductVM : ViewModel() {
  public val favoriteProductModel: MutableLiveData<FavoriteProductModel> =
      MutableLiveData(FavoriteProductModel())

  public var navArguments: Bundle? = null

  public val recyclerFavoriteProductList: MutableLiveData<MutableList<FavoriteProduct1RowModel>> =
      MutableLiveData(mutableListOf())
}
