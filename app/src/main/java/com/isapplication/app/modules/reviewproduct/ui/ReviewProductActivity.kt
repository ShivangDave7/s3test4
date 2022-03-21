package com.isapplication.app.modules.reviewproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityReviewProductBinding
import com.isapplication.app.modules.reviewproduct.`data`.model.ReviewProduct1RowModel
import com.isapplication.app.modules.reviewproduct.`data`.viewmodel.ReviewProductVM
import com.isapplication.app.modules.writereviewfill.ui.WriteReviewFillActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ReviewProductActivity :
    BaseActivity<ActivityReviewProductBinding>(R.layout.activity_review_product) {
  private val viewModel: ReviewProductVM by viewModels<ReviewProductVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerReviewProductAdapter =
    RecyclerReviewProductAdapter(viewModel.recyclerReviewProductList.value?:mutableListOf())
    binding.recyclerReviewProduct.adapter = recyclerReviewProductAdapter
    recyclerReviewProductAdapter.setOnItemClickListener(
    object : RecyclerReviewProductAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ReviewProduct1RowModel) {
        onClickRecyclerReviewProduct(view, position, item)
      }
    }
    )
    viewModel.recyclerReviewProductList.observe(this) {
      recyclerReviewProductAdapter.updateData(it)
    }
    binding.reviewProductVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnWriteReview.setOnClickListener {
      val destIntent = WriteReviewFillActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerReviewProduct(
    view: View,
    position: Int,
    item: ReviewProduct1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "REVIEW_PRODUCT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
