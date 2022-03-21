package com.isapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.isapplication.app.R
import com.isapplication.app.appcomponents.base.BaseActivity
import com.isapplication.app.databinding.ActivityAppNavigationBinding
import com.isapplication.app.modules.account.ui.AccountActivity
import com.isapplication.app.modules.addaddress.ui.AddAddressActivity
import com.isapplication.app.modules.addcard.ui.AddCardActivity
import com.isapplication.app.modules.addpayment.ui.AddPaymentActivity
import com.isapplication.app.modules.address.ui.AddressActivity
import com.isapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.isapplication.app.modules.cart.ui.CartActivity
import com.isapplication.app.modules.changepassword.ui.ChangePasswordActivity
import com.isapplication.app.modules.choosecreditordebitcard.ui.ChooseCreditOrDebitCardActivity
import com.isapplication.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import com.isapplication.app.modules.dashboard.ui.DashboardActivity
import com.isapplication.app.modules.explore.ui.ExploreActivity
import com.isapplication.app.modules.favoriteproduct.ui.FavoriteProductActivity
import com.isapplication.app.modules.filter.ui.FilterActivity
import com.isapplication.app.modules.lailyfafebrinacard.ui.LailyfaFebrinaCardActivity
import com.isapplication.app.modules.listcategory.ui.ListCategoryActivity
import com.isapplication.app.modules.login.ui.LoginActivity
import com.isapplication.app.modules.notification.ui.NotificationActivity
import com.isapplication.app.modules.notification1.ui.Notification1Activity
import com.isapplication.app.modules.notificationfeed.ui.NotificationFeedActivity
import com.isapplication.app.modules.notificationoffer.ui.NotificationOfferActivity
import com.isapplication.app.modules.offerscreen.ui.OfferScreenActivity
import com.isapplication.app.modules.offerscreen2.ui.OfferScreen2Activity
import com.isapplication.app.modules.order.ui.OrderActivity
import com.isapplication.app.modules.orderdetails.ui.OrderDetailsActivity
import com.isapplication.app.modules.paymentmethod.ui.PaymentMethodActivity
import com.isapplication.app.modules.productdetail.ui.ProductDetailActivity
import com.isapplication.app.modules.profile.ui.ProfileActivity
import com.isapplication.app.modules.registerform.ui.RegisterFormActivity
import com.isapplication.app.modules.reviewproduct.ui.ReviewProductActivity
import com.isapplication.app.modules.search.ui.SearchActivity
import com.isapplication.app.modules.searchresult.ui.SearchResultActivity
import com.isapplication.app.modules.searchresult2.ui.SearchResult2Activity
import com.isapplication.app.modules.shipto.ui.ShipToActivity
import com.isapplication.app.modules.shortby.ui.ShortByActivity
import com.isapplication.app.modules.splashscreen.ui.SplashScreenActivity
import com.isapplication.app.modules.successscreen.ui.SuccessScreenActivity
import com.isapplication.app.modules.writereviewfill.ui.WriteReviewFillActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearLailyfaFebrinaCard.setOnClickListener {
      val destIntent = LailyfaFebrinaCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddPayment.setOnClickListener {
      val destIntent = AddPaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearWriteReviewFill.setOnClickListener {
      val destIntent = WriteReviewFillActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRegisterForm.setOnClickListener {
      val destIntent = RegisterFormActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddress.setOnClickListener {
      val destIntent = AddressActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOfferScreen1.setOnClickListener {
      val destIntent = OfferScreen2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOrder.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearchResult.setOnClickListener {
      val destIntent = SearchResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOrderDetails.setOnClickListener {
      val destIntent = OrderDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExplore.setOnClickListener {
      val destIntent = ExploreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearChooseCreditOrDebitCard.setOnClickListener {
      val destIntent = ChooseCreditOrDebitCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotification1.setOnClickListener {
      val destIntent = Notification1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearchResult1.setOnClickListener {
      val destIntent = SearchResult2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddCard.setOnClickListener {
      val destIntent = AddCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearShipTo.setOnClickListener {
      val destIntent = ShipToActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPaymentMethod.setOnClickListener {
      val destIntent = PaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearListCategory.setOnClickListener {
      val destIntent = ListCategoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCreditCardAndDebit.setOnClickListener {
      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDashboard.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotificationFeed.setOnClickListener {
      val destIntent = NotificationFeedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSuccessScreen.setOnClickListener {
      val destIntent = SuccessScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfile.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFavoriteProduct.setOnClickListener {
      val destIntent = FavoriteProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearChangePassword.setOnClickListener {
      val destIntent = ChangePasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddAddress.setOnClickListener {
      val destIntent = AddAddressActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearReviewProduct.setOnClickListener {
      val destIntent = ReviewProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotificationOffer.setOnClickListener {
      val destIntent = NotificationOfferActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAccount.setOnClickListener {
      val destIntent = AccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearShortBy.setOnClickListener {
      val destIntent = ShortByActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOfferScreen.setOnClickListener {
      val destIntent = OfferScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProductDetail.setOnClickListener {
      val destIntent = ProductDetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
