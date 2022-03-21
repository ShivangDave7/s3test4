package com.isapplication.app.modules.address.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isapplication.app.R
import com.isapplication.app.databinding.RowAddress1Binding
import com.isapplication.app.modules.address.`data`.model.Address1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerAddressAdapter(
  public var list: List<Address1RowModel>
) : RecyclerView.Adapter<RecyclerAddressAdapter.RowAddress1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAddress1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_address1,parent,false)
    return RowAddress1VH(view)
  }

  public override fun onBindViewHolder(holder: RowAddress1VH, position: Int): Unit {
    val address1RowModel = Address1RowModel()
    // TODO uncomment following line after integration with data source
    // val address1RowModel = list[position]
    holder.binding.address1RowModel = address1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Address1RowModel>): Unit {
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
      item: Address1RowModel
    ): Unit {
    }
  }

  public inner class RowAddress1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAddress1Binding = RowAddress1Binding.bind(itemView)
  }
}
