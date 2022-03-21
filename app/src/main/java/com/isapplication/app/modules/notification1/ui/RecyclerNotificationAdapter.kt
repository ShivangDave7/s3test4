package com.isapplication.app.modules.notification1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isapplication.app.R
import com.isapplication.app.databinding.RowNotification2Binding
import com.isapplication.app.modules.notification1.`data`.model.Notification2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerNotificationAdapter(
  public var list: List<Notification2RowModel>
) : RecyclerView.Adapter<RecyclerNotificationAdapter.RowNotification2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotification2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification2,parent,false)
    return RowNotification2VH(view)
  }

  public override fun onBindViewHolder(holder: RowNotification2VH, position: Int): Unit {
    val notification2RowModel = Notification2RowModel()
    // TODO uncomment following line after integration with data source
    // val notification2RowModel = list[position]
    holder.binding.notification2RowModel = notification2RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Notification2RowModel>): Unit {
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
      item: Notification2RowModel
    ): Unit {
    }
  }

  public inner class RowNotification2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotification2Binding = RowNotification2Binding.bind(itemView)
  }
}
