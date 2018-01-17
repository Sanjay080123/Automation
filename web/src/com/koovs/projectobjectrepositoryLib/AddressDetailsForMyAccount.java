package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressDetailsForMyAccount {
	
		@FindBy(css=".more_from_wishlist")
		private WebElement addNewAddress;
		
		@FindBy(css=".edit_address")
		private WebElement editExistingAddress;
		
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement deleteButtonforExistingAddress;
		
		@FindBy(xpath="//form[@id='address_form']/div/div[3]/div[3]/div[2]/p")
		private WebElement cancelExcitingaddress;
		
		@FindBy(xpath="//input[@id='card_name']")
		private WebElement nameForNewAddress;
		
		@FindBy(xpath="//input[@id='card_zip']")
		private WebElement zipCodeForNewAddress;
		
		@FindBy(xpath="//input[@id='card_city']")
		private WebElement cityNameforNewAddress;
		
		@FindBy(xpath="//input[@id='card_address']")
		private WebElement addressForNewAddress;
		
		@FindBy(xpath="//input[@id='card_email']")
		private WebElement emailIdForNewAddress;
		
		@FindBy(xpath="//input[@id='card_mobile']")
		private WebElement mobileNumberForNewAddress;
		
		@FindBy(xpath="//form[@id='address_form']/div/div[3]/div[2]/div[1]/div[2]/label[1]/b")
		private WebElement checkBoxForShipToThisAddress;
		
		@FindBy(xpath="//form[@id='address_form']/div/div[3]/div[2]/div[1]/div[2]/label[2]/b")
		private WebElement checkBoxForShipToDifferentAddress;
		
		@FindBy(css="#new_proceed_to_payment_btn")
		private WebElement saveButtonForNewAddress;
		
		@FindBy(css="#myAcc_address_cancel")
		private WebElement cancelButtonForNewAddress;
		
		@FindBy(xpath="//div[@id='address_checkout_block']/div[3]/div[2]/div[1]/div[2]/p")
		private WebElement editaddressRightSide;
		
		@FindBy(xpath="//div[@id='address_checkout_block']/div[3]/div[4]/p/span/a")
		private WebElement editOrdersummeryRightSide;

		
		/**
		 * @return the editaddressRightSide
		 */
		public WebElement getEditaddressRightSide() {
			return editaddressRightSide;
		}

		/**
		 * @return the editOrdersummeryRightSide
		 */
		public WebElement getEditOrdersummeryRightSide() {
			return editOrdersummeryRightSide;
		}

		/**
		 * @return the cancelExcitingaddress
		 */
		public WebElement getCancelExcitingaddress() {
			return cancelExcitingaddress;
		}

		/**
		 * @return the addNewAddress
		 */
		public WebElement getAddNewAddress() {
			return addNewAddress;
		}

		/**
		 * @return the editExistingAddress
		 */
		public WebElement getEditExistingAddress() {
			return editExistingAddress;
		}

		/**
		 * @return the deleteButtonforExistingAddress
		 */
		public WebElement getDeleteButtonforExistingAddress() {
			return deleteButtonforExistingAddress;
		}

		/**
		 * @return the nameForNewAddress
		 */
		public WebElement getNameForNewAddress() {
			return nameForNewAddress;
		}

		/**
		 * @return the zipCodeForNewAddress
		 */
		public WebElement getZipCodeForNewAddress() {
			return zipCodeForNewAddress;
		}

		/**
		 * @return the cityNameforNewAddress
		 */
		public WebElement getCityNameforNewAddress() {
			return cityNameforNewAddress;
		}

		/**
		 * @return the addressForNewAddress
		 */
		public WebElement getAddressForNewAddress() {
			return addressForNewAddress;
		}

		/**
		 * @return the emailIdForNewAddress
		 */
		public WebElement getEmailIdForNewAddress() {
			return emailIdForNewAddress;
		}

		/**
		 * @return the mobileNumberForNewAddress
		 */
		public WebElement getMobileNumberForNewAddress() {
			return mobileNumberForNewAddress;
		}

		/**
		 * @return the checkBoxForShipToThisAddress
		 */
		public WebElement getCheckBoxForShipToThisAddress() {
			return checkBoxForShipToThisAddress;
		}

		/**
		 * @return the checkBoxForShipToDifferentAddress
		 */
		public WebElement getCheckBoxForShipToDifferentAddress() {
			return checkBoxForShipToDifferentAddress;
		}

		/**
		 * @return the saveButtonForNewAddress
		 */
		public WebElement getSaveButtonForNewAddress() {
			return saveButtonForNewAddress;
		}

		/**
		 * @return the cancelButtonForNewAddress
		 */
		public WebElement getCancelButtonForNewAddress() {
			return cancelButtonForNewAddress;
		}
		
				

}
