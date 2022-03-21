package com.isapplication.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityProfileBinding
import com.isapplication.app.modules.changepassword.ui.ChangePasswordActivity
import com.isapplication.app.modules.profile.`data`.model.Profile1RowModel
import com.isapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerProfileAdapter =
    RecyclerProfileAdapter(viewModel.recyclerProfileList.value?:mutableListOf())
    binding.recyclerProfile.adapter = recyclerProfileAdapter
    recyclerProfileAdapter.setOnItemClickListener(
    object : RecyclerProfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Profile1RowModel) {
        onClickRecyclerProfile(view, position, item)
      }
    }
    )
    viewModel.recyclerProfileList.observe(this) {
      recyclerProfileAdapter.updateData(it)
    }
    binding.profileVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerProfile(
    view: View,
    position: Int,
    item: Profile1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearGroup -> {
        val destIntent = ChangePasswordActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public companion object {
    public const val TAG: String = "PROFILE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
