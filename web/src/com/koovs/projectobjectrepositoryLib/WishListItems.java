package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListItems {
	
		
			@FindBy(css="a[href='https://www.koovs.com/checkout/wishlist']>img")
			private WebElement wishListIconInHomepage;
			
			@FindBy(xpath="//div[@class='overview']/div[1]")
			private WebElement firstProductInWishList;
			
			@FindBy(xpath="//div[@class='overview']/div[1]//form[@class='save_cart_form']/a")
			private WebElement addToBagFromWishList;
			
			@FindBy(xpath="//div[@class='overview']/div[1]//span[@id='save_for_later_remove_1']")
			private WebElement deleteItemFromWishList;
			
			@FindBy(xpath="//div[@class='wishlist_items']/div[2]/a/span")
			private WebElement backToBagLinkFromWishList;
			
			@FindBy(xpath="//div[@class='overview']/div")
			private WebElement wishListCount;

			/**
			 * @return the wishListIconInHomepage
			 */
			public WebElement getWishListIconInHomepage() {
				return wishListIconInHomepage;
			}

			/**
			 * @return the firstProductInWishList
			 */
			public WebElement getFirstProductInWishList() {
				return firstProductInWishList;
			}

			/**
			 * @return the addToBagFromWishList
			 */
			public WebElement getAddToBagFromWishList() {
				return addToBagFromWishList;
			}

			/**
			 * @return the deleteItemFromWishList
			 */
			public WebElement getDeleteItemFromWishList() {
				return deleteItemFromWishList;
			}

			/**
			 * @return the backToBagLinkFromWishList
			 */
			public WebElement getBackToBagLinkFromWishList() {
				return backToBagLinkFromWishList;
			}

			/**
			 * @return the wishListCount
			 */
			public WebElement getWishListCount() {
				return wishListCount;
			}
			
			

}
