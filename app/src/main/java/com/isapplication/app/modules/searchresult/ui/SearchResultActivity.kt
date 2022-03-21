package com.isapplication.app.modules.searchresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivitySearchResultBinding
import com.isapplication.app.modules.filter.ui.FilterActivity
import com.isapplication.app.modules.searchresult.`data`.model.SearchResult1RowModel
import com.isapplication.app.modules.searchresult.`data`.viewmodel.SearchResultVM
import com.isapplication.app.modules.shortby.ui.ShortByActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SearchResultActivity :
    BaseActivity<ActivitySearchResultBinding>(R.layout.activity_search_result) {
  private val viewModel: SearchResultVM by viewModels<SearchResultVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerSearchResultAdapter =
    RecyclerSearchResultAdapter(viewModel.recyclerSearchResultList.value?:mutableListOf())
    binding.recyclerSearchResult.adapter = recyclerSearchResultAdapter
    recyclerSearchResultAdapter.setOnItemClickListener(
    object : RecyclerSearchResultAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SearchResult1RowModel) {
        onClickRecyclerSearchResult(view, position, item)
      }
    }
    )
    viewModel.recyclerSearchResultList.observe(this) {
      recyclerSearchResultAdapter.updateData(it)
    }
    binding.searchResultVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageShorticon.setOnClickListener {
      val destIntent = ShortByActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerSearchResult(
    view: View,
    position: Int,
    item: SearchResult1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "SEARCH_RESULT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchResultActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
