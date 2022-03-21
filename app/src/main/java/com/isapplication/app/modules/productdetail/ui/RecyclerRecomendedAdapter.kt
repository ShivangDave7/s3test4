package com.isapplication.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isapplication.app.R
import com.isapplication.app.databinding.RowProductDetail2Binding
import com.isapplication.app.modules.productdetail.`data`.model.ProductDetail2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerRecomendedAdapter(
  public var list: List<ProductDetail2RowModel>
) : RecyclerView.Adapter<RecyclerRecomendedAdapter.RowProductDetail2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductDetail2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_product_detail2,parent,false)
    return RowProductDetail2VH(view)
  }

  public override fun onBindViewHolder(holder: RowProductDetail2VH, position: Int): Unit {
    val productDetail2RowModel = ProductDetail2RowModel()
    // TODO uncomment following line after integration with data source
    // val productDetail2RowModel = list[position]
    holder.binding.productDetail2RowModel = productDetail2RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProductDetail2RowModel>): Unit {
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
      item: ProductDetail2RowModel
    ): Unit {
    }
  }

  public inner class RowProductDetail2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProductDetail2Binding = RowProductDetail2Binding.bind(itemView)
  }
}
