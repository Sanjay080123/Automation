package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount {
	
	
		@FindBy(xpath="//div[@id='myaccount']//p[@class='myacc_headingText']")
		private WebElement myAccountHomePage;
		
		@FindBy(xpath="//a[text()='view']")
		private WebElement myProfileView;
		
		@FindBy(id="addressdetail_editbutton")
		private WebElement myaccountAddressDetailsEdit;
		
		@FindBy(xpath="//div[@class='addressdetail_box']/div[3]//a[text()='view all']")
		private WebElement myaccountAddressDetailsViewAll;
		
		@FindBy(xpath="//div[@class='addressdetail_box']/div[3]//a[text()='+add new']")
		private WebElement myaccountAddressDetailsAddNew;
		
		@FindBy(xpath="//div[@class='recentorders_box']/div[2]/div/div[2]/div[2]/div/a")
		private WebElement myAccountRecentOrdersViewDetails;
		
		@FindBy(xpath="//div[@class='recentordersbox']//div[@class='recentorderviewall_area']/a[text()='view all']")
		private WebElement myaccountRecentOrdersViewAll;
		
		@FindBy(xpath="//div[@class='coupons_box']//a[text()='view all']")
		private WebElement myaccountCouponsViewAll;
		
		/*
		 * My Account address details links webelements
		 */
		@FindBy(xpath="//div[@class='overview']/div[2]/div[@class='removeBtnwrapper']/div[1]")
		private WebElement AddressDetailsEditAddress;
		
		@FindBy(xpath="//a[@id='myAcc_address_cancel']")
		private WebElement AddressDetailsCancel;
		
		@FindBy(xpath="//div[@class='overview']/div[2]/div[@class='removeBtnwrapper']/div[2]")
		private WebElement AddressDetailsDeleteAddress;
		
		@FindBy(xpath="//div[@class='add_new_address']/p")
		private WebElement AddressDetailsAddNewAddress;
		
		/*
		 * Coupons
		 */
		
		
		@FindBy(xpath="//h3[@id='myacc_active_coupons']/b")
		private WebElement activeCoupons;
		
		@FindBy(xpath="//h3[@id='myacc_used_coupons']/b")
		private WebElement usedCoupons;
		
		@FindBy(xpath="//h3[@id='myacc_expired_coupons']/b")
		private WebElement expiredCouppons;

		
		
		
		/**
		 * @return the addressDetailsCancel
		 */
		public WebElement getAddressDetailsCancel() {
			return AddressDetailsCancel;
		}

		/**
		 * @return the myAccountHomePage
		 */
		public WebElement getMyAccountHomePage() {
			return myAccountHomePage;
		}

		/**
		 * @return the myProfileView
		 */
		public WebElement getMyProfileView() {
			return myProfileView;
		}

		/**
		 * @return the myaccountAddressDetailsEdit
		 */
		public WebElement getMyaccountAddressDetailsEdit() {
			return myaccountAddressDetailsEdit;
		}

		/**
		 * @return the myaccountAddressDetailsViewAll
		 */
		public WebElement getMyaccountAddressDetailsViewAll() {
			return myaccountAddressDetailsViewAll;
		}

		/**
		 * @return the myaccountAddressDetailsAddNew
		 */
		public WebElement getMyaccountAddressDetailsAddNew() {
			return myaccountAddressDetailsAddNew;
		}

		/**
		 * @return the myAccountRecentOrdersViewDetails
		 */
		public WebElement getMyAccountRecentOrdersViewDetails() {
			return myAccountRecentOrdersViewDetails;
		}

		/**
		 * @return the myaccountRecentOrdersViewAll
		 */
		public WebElement getMyaccountRecentOrdersViewAll() {
			return myaccountRecentOrdersViewAll;
		}

		/**
		 * @return the myaccountCouponsViewAll
		 */
		public WebElement getMyaccountCouponsViewAll() {
			return myaccountCouponsViewAll;
		}

		/**
		 * @return the addressDetailsEditAddress
		 */
		public WebElement getAddressDetailsEditAddress() {
			return AddressDetailsEditAddress;
		}

		/**
		 * @return the addressDetailsDeleteAddress
		 */
		public WebElement getAddressDetailsDeleteAddress() {
			return AddressDetailsDeleteAddress;
		}

		/**
		 * @return the addressDetailsAddNewAddress
		 */
		public WebElement getAddressDetailsAddNewAddress() {
			return AddressDetailsAddNewAddress;
		}

		/**
		 * @return the activeCoupons
		 */
		public WebElement getActiveCoupons() {
			return activeCoupons;
		}

		/**
		 * @return the usedCoupons
		 */
		public WebElement getUsedCoupons() {
			return usedCoupons;
		}

		/**
		 * @return the expiredCouppons
		 */
		public WebElement getExpiredCouppons() {
			return expiredCouppons;
		}
		
		

}
