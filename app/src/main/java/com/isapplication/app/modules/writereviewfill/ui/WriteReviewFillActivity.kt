package com.isapplication.app.modules.writereviewfill.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityWriteReviewFillBinding
import com.isapplication.app.modules.writereviewfill.`data`.viewmodel.WriteReviewFillVM
import kotlin.String
import kotlin.Unit

public class WriteReviewFillActivity :
    BaseActivity<ActivityWriteReviewFillBinding>(R.layout.activity_write_review_fill) {
  private val viewModel: WriteReviewFillVM by viewModels<WriteReviewFillVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.writeReviewFillVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "WRITE_REVIEW_FILL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WriteReviewFillActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
