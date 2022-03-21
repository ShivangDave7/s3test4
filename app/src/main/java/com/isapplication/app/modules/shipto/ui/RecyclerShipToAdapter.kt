package com.isapplication.app.modules.shipto.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isapplication.app.R
import com.isapplication.app.databinding.RowShipTo1Binding
import com.isapplication.app.modules.shipto.`data`.model.ShipTo1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerShipToAdapter(
  public var list: List<ShipTo1RowModel>
) : RecyclerView.Adapter<RecyclerShipToAdapter.RowShipTo1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowShipTo1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_ship_to1,parent,false)
    return RowShipTo1VH(view)
  }

  public override fun onBindViewHolder(holder: RowShipTo1VH, position: Int): Unit {
    val shipTo1RowModel = ShipTo1RowModel()
    // TODO uncomment following line after integration with data source
    // val shipTo1RowModel = list[position]
    holder.binding.shipTo1RowModel = shipTo1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ShipTo1RowModel>): Unit {
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
      item: ShipTo1RowModel
    ): Unit {
    }
  }

  public inner class RowShipTo1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowShipTo1Binding = RowShipTo1Binding.bind(itemView)
  }
}
