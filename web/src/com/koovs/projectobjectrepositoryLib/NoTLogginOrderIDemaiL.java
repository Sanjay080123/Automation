package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NoTLogginOrderIDemaiL {
	
	@FindBy(xpath="//input[@id='order_num']")
	private WebElement orderid;
	
	@FindBy(xpath="//input[@id='email_addr']")
	private WebElement emailId;
	
	@FindBy(xpath="//tbody/tr/td[1]/div/form/div[5]/p")
	private WebElement trackorderButton;
	
	@FindBy(xpath="//div[@id='bodyContent']//td[@class='tracking_form_td']/div/form/div[6]/p")
	private WebElement trackorderButtonForProd;

	
	
	/**
	 * @return the trackorderButtonForProd
	 */
	public WebElement getTrackorderButtonForProd() {
		return trackorderButtonForProd;
	}

	/**
	 * @return the orderid
	 */
	public WebElement getOrderid() {
		return orderid;
	}

	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() {
		return emailId;
	}

	/**
	 * @return the trackorderButton
	 */
	public WebElement getTrackorderButton() {
		return trackorderButton;
	}
	
	

}
