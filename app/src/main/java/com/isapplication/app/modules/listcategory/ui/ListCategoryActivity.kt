package com.isapplication.app.modules.listcategory.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityListCategoryBinding
import com.isapplication.app.modules.listcategory.`data`.viewmodel.ListCategoryVM
import kotlin.String
import kotlin.Unit

public class ListCategoryActivity :
    BaseActivity<ActivityListCategoryBinding>(R.layout.activity_list_category) {
  private val viewModel: ListCategoryVM by viewModels<ListCategoryVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.listCategoryVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LIST_CATEGORY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ListCategoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
