package com.isapplication.app.modules.profile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isapplication.app.R
import com.isapplication.app.databinding.RowProfile1Binding
import com.isapplication.app.modules.profile.`data`.model.Profile1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerProfileAdapter(
  public var list: List<Profile1RowModel>
) : RecyclerView.Adapter<RecyclerProfileAdapter.RowProfile1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfile1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile1,parent,false)
    return RowProfile1VH(view)
  }

  public override fun onBindViewHolder(holder: RowProfile1VH, position: Int): Unit {
    val profile1RowModel = Profile1RowModel()
    // TODO uncomment following line after integration with data source
    // val profile1RowModel = list[position]
    holder.binding.profile1RowModel = profile1RowModel
  }

  public override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Profile1RowModel>): Unit {
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
      item: Profile1RowModel
    ): Unit {
    }
  }

  public inner class RowProfile1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfile1Binding = RowProfile1Binding.bind(itemView)
    init {
      binding.linearGroup.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Profile1RowModel())
      }
    }
  }
}
