package com.isapplication.app.modules.searchresult.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isapplication.app.R
import com.isapplication.app.databinding.RowSearchResult1Binding
import com.isapplication.app.modules.searchresult.`data`.model.SearchResult1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerSearchResultAdapter(
  public var list: List<SearchResult1RowModel>
) : RecyclerView.Adapter<RecyclerSearchResultAdapter.RowSearchResult1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearchResult1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_result1,parent,false)
    return RowSearchResult1VH(view)
  }

  public override fun onBindViewHolder(holder: RowSearchResult1VH, position: Int): Unit {
    val searchResult1RowModel = SearchResult1RowModel()
    // TODO uncomment following line after integration with data source
    // val searchResult1RowModel = list[position]
    holder.binding.searchResult1RowModel = searchResult1RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SearchResult1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: SearchResult1RowModel
    ): Unit {
    }
  }

  public inner class RowSearchResult1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearchResult1Binding = RowSearchResult1Binding.bind(itemView)
  }
}
