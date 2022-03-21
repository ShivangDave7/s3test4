package com.isapplication.app.modules.productdetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityProductDetailBinding
import com.isapplication.app.modules.cart.ui.CartActivity
import com.isapplication.app.modules.productdetail.`data`.model.ImageSliderGroup29Model
import com.isapplication.app.modules.productdetail.`data`.model.ProductDetail2RowModel
import com.isapplication.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import com.isapplication.app.modules.reviewproduct.ui.ReviewProductActivity
import com.isapplication.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class ProductDetailActivity :
    BaseActivity<ActivityProductDetailBinding>(R.layout.activity_product_detail) {
  private val imageSliderGroup29Items: ArrayList<ImageSliderGroup29Model> = arrayListOf()

  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup29Adapter = ImageSliderGroup29Adapter(imageSliderGroup29Items,true)
    binding.imageSliderGroup29.adapter = imageSliderGroup29Adapter
    binding.imageSliderGroup29.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup27.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup27.updateIndicatorCounts(binding.imageSliderGroup29.indicatorCount)
    val recyclerRecomendedAdapter =
    RecyclerRecomendedAdapter(viewModel.recyclerRecomendedList.value?:mutableListOf())
    binding.recyclerRecomended.adapter = recyclerRecomendedAdapter
    recyclerRecomendedAdapter.setOnItemClickListener(
    object : RecyclerRecomendedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductDetail2RowModel) {
        onClickRecyclerRecomended(view, position, item)
      }
    }
    )
    viewModel.recyclerRecomendedList.observe(this) {
      recyclerRecomendedAdapter.updateData(it)
    }
    binding.productDetailVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup29.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup29.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
    binding.txtSeeMoreLink.setOnClickListener {
      val destIntent = ReviewProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAddToCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSearchicon.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerRecomended(
    view: View,
    position: Int,
    item: ProductDetail2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
