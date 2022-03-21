package com.isapplication.app.modules.creditcardanddebit.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isapplication.app.R
import com.isapplication.app.databinding.RowCreditCardAndDebit1Binding
import com.isapplication.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebit1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerCreditCardAndDebitAdapter(
  public var list: List<CreditCardAndDebit1RowModel>
) : RecyclerView.Adapter<RecyclerCreditCardAndDebitAdapter.RowCreditCardAndDebit1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowCreditCardAndDebit1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_credit_card_and_debit1,parent,false)
    return RowCreditCardAndDebit1VH(view)
  }

  public override fun onBindViewHolder(holder: RowCreditCardAndDebit1VH, position: Int): Unit {
    val creditCardAndDebit1RowModel = CreditCardAndDebit1RowModel()
    // TODO uncomment following line after integration with data source
    // val creditCardAndDebit1RowModel = list[position]
    holder.binding.creditCardAndDebit1RowModel = creditCardAndDebit1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CreditCardAndDebit1RowModel>): Unit {
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
      item: CreditCardAndDebit1RowModel
    ): Unit {
    }
  }

  public inner class RowCreditCardAndDebit1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCreditCardAndDebit1Binding = RowCreditCardAndDebit1Binding.bind(itemView)
    init {
      binding.linearCreditCarddet.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CreditCardAndDebit1RowModel())
      }
    }
  }
}
