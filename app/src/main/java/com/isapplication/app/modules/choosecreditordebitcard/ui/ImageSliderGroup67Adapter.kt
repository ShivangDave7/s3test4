package com.isapplication.app.modules.choosecreditordebitcard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.isapplication.app.databinding.SlideritemChooseCreditOrDebitCard1Binding
import com.isapplication.app.modules.choosecreditordebitcard.`data`.model.ImageSliderGroup67Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup67Adapter(
  public val dataList: ArrayList<ImageSliderGroup67Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup67Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemChooseCreditOrDebitCard1Binding) {
      binding.imageSliderGroup67Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemChooseCreditOrDebitCard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
