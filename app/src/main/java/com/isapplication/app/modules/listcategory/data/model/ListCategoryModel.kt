package com.isapplication.app.modules.listcategory.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBikini: String? = MyApp.getInstance().resources.getString(R.string.lbl_bikini)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDress: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWorkEquipment: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_work_equipment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManPants: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_pants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManShoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManUnderwear: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_man_underwear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtManTShirt: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_man_t_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWomanBag: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWomanPants: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_woman_pants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHighHeels: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_high_heels)

)
