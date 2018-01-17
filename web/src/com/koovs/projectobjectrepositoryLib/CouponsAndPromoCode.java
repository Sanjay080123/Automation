package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CouponsAndPromoCode {
				
	
			@FindBy(css="#login_apply_giftCoupon_code")
			private WebElement applyGiftCouponButton;
			
			@FindBy(css="#success_promo_code_popup_chk")
			private WebElement promocodeButton;
			
			@FindBy(id="promo_code")
			private WebElement CouponTextBox;
			
			@FindBy(xpath="//a[@class='button black-btn discount-btn appyPromo_text']")
			private WebElement CouponApplyButton;
			
			@FindBy(xpath="//a[@class='appyPromo_text']")
			private WebElement CouponCancelButton;
			
			@FindBy(xpath="//input[@id='promo_code' and @placeholder='Enter Promo Code']")
			private WebElement PromoCodeTextBox;
			
			@FindBy(xpath="//a[text()='APPLY']")
			private WebElement promoCodeApplyButton;
			
			@FindBy(xpath="//a[text()='CANCEL']")
			private WebElement promocodeCancelButton;

			/**
			 * @return the applyGiftCouponButton
			 */
			public WebElement getApplyGiftCouponButton() {
				return applyGiftCouponButton;
			}

			/**
			 * @return the promocodeButton
			 */
			public WebElement getPromocodeButton() {
				return promocodeButton;
			}

			/**
			 * @return the couponTextBox
			 */
			public WebElement getCouponTextBox() {
				return CouponTextBox;
			}

			/**
			 * @return the couponApplyButton
			 */
			public WebElement getCouponApplyButton() {
				return CouponApplyButton;
			}

			/**
			 * @return the couponCancelButton
			 */
			public WebElement getCouponCancelButton() {
				return CouponCancelButton;
			}

			/**
			 * @return the promoCodeTextBox
			 */
			public WebElement getPromoCodeTextBox() {
				return PromoCodeTextBox;
			}

			/**
			 * @return the promoCodeApplyButton
			 */
			public WebElement getPromoCodeApplyButton() {
				return promoCodeApplyButton;
			}

			/**
			 * @return the promocodeCancelButton
			 */
			public WebElement getPromocodeCancelButton() {
				return promocodeCancelButton;
			}
			
			
}
