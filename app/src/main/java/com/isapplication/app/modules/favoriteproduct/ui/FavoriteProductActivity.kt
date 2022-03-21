package com.isapplication.app.modules.favoriteproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityFavoriteProductBinding
import com.isapplication.app.modules.favoriteproduct.`data`.model.FavoriteProduct1RowModel
import com.isapplication.app.modules.favoriteproduct.`data`.viewmodel.FavoriteProductVM
import com.isapplication.app.modules.productdetail.ui.ProductDetailActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class FavoriteProductActivity :
    BaseActivity<ActivityFavoriteProductBinding>(R.layout.activity_favorite_product) {
  private val viewModel: FavoriteProductVM by viewModels<FavoriteProductVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerFavoriteProductAdapter =
    RecyclerFavoriteProductAdapter(viewModel.recyclerFavoriteProductList.value?:mutableListOf())
    binding.recyclerFavoriteProduct.adapter = recyclerFavoriteProductAdapter
    recyclerFavoriteProductAdapter.setOnItemClickListener(
    object : RecyclerFavoriteProductAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FavoriteProduct1RowModel) {
        onClickRecyclerFavoriteProduct(view, position, item)
      }
    }
    )
    viewModel.recyclerFavoriteProductList.observe(this) {
      recyclerFavoriteProductAdapter.updateData(it)
    }
    binding.favoriteProductVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerFavoriteProduct(
    view: View,
    position: Int,
    item: FavoriteProduct1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearProduct -> {
        val destIntent = ProductDetailActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public companion object {
    public const val TAG: String = "FAVORITE_PRODUCT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoriteProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
