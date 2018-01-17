package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPageButtonForCard {
				
		@FindBy(xpath="//form[@id='addToCartForm']/div/div[3]/a[1]")
		private WebElement addToBagButton;
		
		@FindBy(xpath="//form[@id='addToCartForm']/div/div[3]/a[2]")
		private WebElement addToWishlistButton;

		/**
		 * @return the addToBagButton
		 */
		public WebElement getAddToBagButton() {
			return addToBagButton;
		}

		/**
		 * @return the addToWishlistButton
		 */
		public WebElement getAddToWishlistButton() {
			return addToWishlistButton;
		}
		
		
		
		

}
