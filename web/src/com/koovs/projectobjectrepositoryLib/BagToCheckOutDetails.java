package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BagToCheckOutDetails {
	
	
		@FindBy(id="cart_total_items")
		private WebElement bagiconwithTotalItems;
		
		@FindBy(css=".bagItems>a")
		private WebElement bagicon;
		
		@FindBy(css="div.cartRightBox>div>a>p.proceed_to_checkout_text")
		private WebElement checkoutbutton;
		
		@FindBy(id="continue_to_payment")
		private WebElement paymentcheckout;
		
		@FindBy(xpath="//div[@class='cartRightBox']/div[5]/div/div[9]/p[2]/span")
		private WebElement TotalamountInCart;
		
		@FindBy(xpath="//div[@id='cart-list-panel']/div[3]/div/a/div")
		private WebElement addMoreFromWishList;
		
		@FindBy(xpath="//a[@class='backToCart right']/span")
		private WebElement backToBag;
		
		@FindBy(xpath="//div[@id='cart-list-panel']/div[4]/a/span")
		private WebElement continueShopping;
		
		
		/**
		 * @return the backToBag
		 */
		public WebElement getBackToBag() {
			return backToBag;
		}

		/**
		 * @return the addMoreFromWishList
		 */
		public WebElement getAddMoreFromWishList() {
			return addMoreFromWishList;
		}

		/**
		 * @return the continueShopping
		 */
		public WebElement getContinueShopping() {
			return continueShopping;
		}

		/**
		 * @return the totalamountInCart
		 */
		public WebElement getTotalamountInCart() {
			return TotalamountInCart;
		}

		/**
		 * @return the bagiconwithTotalItems
		 */
		public WebElement getBagiconwithTotalItems() {
			return bagiconwithTotalItems;
		}

		/**
		 * @return the bagicon
		 */
		public WebElement getBagicon() {
			return bagiconwithTotalItems;
		}

		/**
		 * @return the checkoutbutton
		 */
		public WebElement getCheckoutbutton() {
			return checkoutbutton;
		}

		/**
		 * @return the paymentcheckout
		 */
		public WebElement getPaymentcheckout() {
			return paymentcheckout;
		}
		
		

}
