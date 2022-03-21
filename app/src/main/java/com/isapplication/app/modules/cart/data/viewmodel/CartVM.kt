package com.isapplication.app.modules.cart.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.isapplication.app.modules.cart.`data`.model.Cart1RowModel
import com.isapplication.app.modules.cart.`data`.model.CartModel
import kotlin.collections.MutableList

public class CartVM : ViewModel() {
  public val cartModel: MutableLiveData<CartModel> = MutableLiveData(CartModel())

  public var navArguments: Bundle? = null

  public val recyclerCartList: MutableLiveData<MutableList<Cart1RowModel>> =
      MutableLiveData(mutableListOf())
}
