package com.isapplication.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isapplication.app.R
import com.isapplication.app.databinding.RowDashboard3Binding
import com.isapplication.app.modules.dashboard.`data`.model.Dashboard3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerMegaSaleAdapter(
  public var list: List<Dashboard3RowModel>
) : RecyclerView.Adapter<RecyclerMegaSaleAdapter.RowDashboard3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDashboard3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dashboard3,parent,false)
    return RowDashboard3VH(view)
  }

  public override fun onBindViewHolder(holder: RowDashboard3VH, position: Int): Unit {
    val dashboard3RowModel = Dashboard3RowModel()
    // TODO uncomment following line after integration with data source
    // val dashboard3RowModel = list[position]
    holder.binding.dashboard3RowModel = dashboard3RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Dashboard3RowModel>): Unit {
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
      item: Dashboard3RowModel
    ): Unit {
    }
  }

  public inner class RowDashboard3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDashboard3Binding = RowDashboard3Binding.bind(itemView)
  }
}
