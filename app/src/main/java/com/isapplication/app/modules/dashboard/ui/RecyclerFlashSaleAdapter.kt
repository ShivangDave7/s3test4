package com.isapplication.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isapplication.app.R
import com.isapplication.app.databinding.RowDashboard2Binding
import com.isapplication.app.modules.dashboard.`data`.model.Dashboard2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerFlashSaleAdapter(
  public var list: List<Dashboard2RowModel>
) : RecyclerView.Adapter<RecyclerFlashSaleAdapter.RowDashboard2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDashboard2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dashboard2,parent,false)
    return RowDashboard2VH(view)
  }

  public override fun onBindViewHolder(holder: RowDashboard2VH, position: Int): Unit {
    val dashboard2RowModel = Dashboard2RowModel()
    // TODO uncomment following line after integration with data source
    // val dashboard2RowModel = list[position]
    holder.binding.dashboard2RowModel = dashboard2RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Dashboard2RowModel>): Unit {
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
      item: Dashboard2RowModel
    ): Unit {
    }
  }

  public inner class RowDashboard2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDashboard2Binding = RowDashboard2Binding.bind(itemView)
    init {
      binding.linearProduct.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Dashboard2RowModel())
      }
    }
  }
}
