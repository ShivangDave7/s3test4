package com.isapplication.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.isapplication.app.databinding.SlideritemDashboard1Binding
import com.isapplication.app.modules.dashboard.`data`.model.ImageSliderGroup18Model
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

public class ImageSliderGroup18Adapter(
  public val dataList: ArrayList<ImageSliderGroup18Model>,
  public val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderGroup18Model>(dataList, mIsInfinite) {
  public override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ): Unit {
    if (binding is SlideritemDashboard1Binding) {
      binding.imageSliderGroup18Model = dataList[listPosition]
    }
  }

  public override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemDashboard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
