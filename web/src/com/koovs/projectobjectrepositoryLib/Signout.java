package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signout {
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement SignOutLink;
	
	@FindBy(xpath="//a[@id='logOut' and @href='https://www.koovs.com/signup/logout']")
	private WebElement LogoutCurrentUser;

	/**
	 * @return the signOutLink
	 */
	public WebElement getSignOutLink() {
		return SignOutLink;
	}

	/**
	 * @return the logoutCurrentUser
	 */
	public WebElement getLogoutCurrentUser() {
		return LogoutCurrentUser;
	}

}
