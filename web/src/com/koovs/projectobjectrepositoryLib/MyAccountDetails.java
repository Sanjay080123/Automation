package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountDetails {
	
	@FindBy(id="myacc_text")
	private WebElement MyAccountText;
	
	@FindBy(id="goto_my_account")
	private WebElement gotoaccountlink;
	
	@FindBy(css="a[href='https://www.koovs.com/myaccount/view/profile']")
	private WebElement profiledetailslink;
	
	@FindBy(xpath="//div[@class='profileHeader']/a[text()='edit']")
	private WebElement profiledetailsLinkEdit;
	
	@FindBy(css="a[href='https://www.koovs.com/myaccount/view/address']")
	private WebElement addressdetailslink;
	
	@FindBy(xpath="//div[@id='profile']/div[1]/div/div/div/div[1]/ul/li[3]/a")
	private WebElement recentorderslink;
	
	@FindBy(xpath="//div[@id='myaccount_homear']/div[1]/div/div/div[1]/ul/li[3]/a")
	private WebElement recentOrderLinkAfterOrder;
	
	@FindBy(xpath="//div[@id='my_orders']/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/a/p")
	private WebElement recentOrderViewDetails;
	
	@FindBy(css=".cancl_ordr_Btn>p")
	private WebElement cancelRecentOrder;
	
	@FindBy(xpath="//div[@class='cacnelreason_Box']/div/form/textarea")
	private WebElement textAreaforReason;
	
	@FindBy(xpath="//a[@id='cancel_ordr_btn']")
	private WebElement cancelOrderButton;
	
	@FindBy(xpath="//div[@id='change_addrButton']/p")
	private WebElement changeAddress;
	
	@FindBy(xpath="//a[@id='order_address_cancel']")
	private WebElement changeAddressCancel;
	
	@FindBy(xpath="//div[@class='myaccount_tabLeft']//div[@class='myAccount_navTop']/ul/li[4]/a")
	private WebElement couponMyAccountLeftMenu;
	
	
	
	
	/**
	 * @return the couponMyAccountLeftMenu
	 */
	public WebElement getCouponMyAccountLeftMenu() {
		return couponMyAccountLeftMenu;
	}

	/**
	 * @return the changeAddressCancel
	 */
	public WebElement getChangeAddressCancel() {
		return changeAddressCancel;
	}

	/**
	 * @return the changeAddress
	 */
	public WebElement getChangeAddress() {
		return changeAddress;
	}

	/**
	 * @return the profiledetailsLinkEdit
	 */
	public WebElement getProfiledetailsLinkEdit() {
		return profiledetailsLinkEdit;
	}

	public WebElement getRecentOrderLinkAfterOrder() {
		return recentOrderLinkAfterOrder;
	}

	/**
	 * @return the textAreaforReason
	 */
	public WebElement getTextAreaforReason() {
		return textAreaforReason;
	}

	/**
	 * @param textAreaforReason the textAreaforReason to set
	 */
	public void setTextAreaforReason(WebElement textAreaforReason) {
		this.textAreaforReason = textAreaforReason;
	}

	/**
	 * @return the cancelOrderButton
	 */
	public WebElement getCancelOrderButton() {
		return cancelOrderButton;
	}

	@FindBy(xpath="//div[@id='profile']/div[1]//div[1]/ul/li[4]/a")
	private WebElement couponslink;

	
	
	/**
	 * @return the cancelRecentOrder
	 */
	public WebElement getCancelRecentOrder() {
		return cancelRecentOrder;
	}

	/**
	 * @return the recentOrderViewDetails
	 */
	public WebElement getRecentOrderViewDetails() {
		return recentOrderViewDetails;
	}

	/**
	 * @return the myAccountText
	 */
	public WebElement getMyAccountText() {
		return MyAccountText;
	}

	/**
	 * @return the gotoaccountlink
	 */
	public WebElement getGotoaccountlink() {
		return gotoaccountlink;
	}

	/**
	 * @return the profiledetailslink
	 */
	public WebElement getProfiledetailslink() {
		return profiledetailslink;
	}

	/**
	 * @return the addressdetailslink
	 */
	public WebElement getAddressdetailslink() {
		return addressdetailslink;
	}

	/**
	 * @return the recentorderslink
	 */
	public WebElement getRecentorderslink() {
		return recentorderslink;
	}

	/**
	 * @return the couponslink
	 */
	public WebElement getCouponslink() {
		return couponslink;
	}

}
