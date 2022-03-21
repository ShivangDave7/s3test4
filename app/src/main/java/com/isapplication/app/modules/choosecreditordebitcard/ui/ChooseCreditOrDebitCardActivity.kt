package com.isapplication.app.modules.choosecreditordebitcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityChooseCreditOrDebitCardBinding
import com.isapplication.app.modules.choosecreditordebitcard.`data`.model.ImageSliderGroup67Model
import com.isapplication.app.modules.choosecreditordebitcard.`data`.viewmodel.ChooseCreditOrDebitCardVM
import com.isapplication.app.modules.successscreen.ui.SuccessScreenActivity
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

public class ChooseCreditOrDebitCardActivity :
    BaseActivity<ActivityChooseCreditOrDebitCardBinding>(R.layout.activity_choose_credit_or_debit_card)
    {
  private val imageSliderGroup67Items: ArrayList<ImageSliderGroup67Model> = arrayListOf()

  private val viewModel: ChooseCreditOrDebitCardVM by viewModels<ChooseCreditOrDebitCardVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val imageSliderGroup67Adapter = ImageSliderGroup67Adapter(imageSliderGroup67Items,true)
    binding.imageSliderGroup67.adapter = imageSliderGroup67Adapter
    binding.imageSliderGroup67.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup65.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup65.updateIndicatorCounts(binding.imageSliderGroup67.indicatorCount)
    binding.chooseCreditOrDebitCardVM = viewModel
  }

  public override fun onPause(): Unit {
    binding.imageSliderGroup67.pauseAutoScroll()
    super.onPause()
  }

  public override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderGroup67.resumeAutoScroll()
  }

  public override fun setUpClicks(): Unit {
    binding.btnPay76686.setOnClickListener {
      val destIntent = SuccessScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "CHOOSE_CREDIT_OR_DEBIT_CARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChooseCreditOrDebitCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
