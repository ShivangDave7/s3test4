package com.isapplication.app.modules.orderdetails.`data`.model

import com.isapplication.app.R
import com.isapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class OrderDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrderDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_order_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPacking: String? = MyApp.getInstance().resources.getString(R.string.lbl_packing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtArriving: String? = MyApp.getInstance().resources.getString(R.string.lbl_arriving)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtProduct: String? = MyApp.getInstance().resources.getString(R.string.lbl_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtShippingDetail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shipping_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDateShipping: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_date_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMonth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_january_16_202)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtShipping1: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPOSReggular: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pos_reggular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNoResi: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_resi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtResinumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_000192848573)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2727_new_owerr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaymentDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_items_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_598_86)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtShipping2: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtImportcharges: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_import_charges)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.lbl_128_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTotalPrice: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_total_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice3: String? = MyApp.getInstance().resources.getString(R.string.lbl_766_86)

)
