package com.isapplication.app.modules.dashboard.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMoreCategoryL: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_more_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDress: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManWorkEquipm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_man_work_equipm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWomanBag: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManShoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFlashSale: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_flash_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeMoreLink: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMegaSale: String? = MyApp.getInstance().resources.getString(R.string.lbl_mega_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSeeMoreLink1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)

)
