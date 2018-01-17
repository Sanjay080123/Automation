package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(id="koovs_login_popup")
	private WebElement loginLink;
	
	@FindBy(xpath="//a[text()='Log In']")
	private WebElement chromeloginlink;

	@FindBy(id="login_username_p")
	private WebElement UsernameTextBox;
	
	@FindBy(id="login_password_p")
	private WebElement PasswordTextBox;
	
	@FindBy(id="rememberme")
	private WebElement CheckBox;
	
	
	@FindBy(xpath="//div[@id='user_login']/p")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@id='subscribenewsletter']/div[1]/div")
	private WebElement newUserPopUp;
	
	
	
	/**
	 * @return the newUserPopUp
	 */
	public WebElement getNewUserPopUp() {
		return newUserPopUp;
	}

	/**
	 * @return the chromeloginlink
	 */
	public WebElement getChromeloginlink() {
		return chromeloginlink;
	}

	/*
	 * Login Through facebook
	 */
	@FindBy(css="a.fb-login>img")
	private WebElement loginfromfacebook;
	
	/*
	 * Facebook Username and Password Login and Click.
	 */
	
	@FindBy(id="email")
	private WebElement usernamefacebook;
	
	@FindBy(id="pass")
	private WebElement passwordfacebook;
	
	/*
	 * Login button for facebook
	 */
	
	@FindBy(id="u_0_2")
	private WebElement facebookloginbutton;
	
	/*
	 * Login from Google Plus
	 */
	
	@FindBy(css="a.g-signin>img")
	private WebElement loginfromGoogleplus;
	
	
	

	/**
	 * @return the loginfromfacebook
	 */
	public WebElement getLoginfromfacebook() {
		return loginfromfacebook;
	}

	/**
	 * @return the usernamefacebook
	 */
	public WebElement getUsernamefacebook() {
		return usernamefacebook;
	}

	/**
	 * @return the passwordfacebook
	 */
	public WebElement getPasswordfacebook() {
		return passwordfacebook;
	}

	/**
	 * @return the facebookloginbutton
	 */
	public WebElement getFacebookloginbutton() {
		return facebookloginbutton;
	}

	/**
	 * @return the loginfromGoogleplus
	 */
	public WebElement getLoginfromGoogleplus() {
		return loginfromGoogleplus;
	}

	/**
	 * @return the loginLink
	 */
	public WebElement getLoginLink() {
		return loginLink;
	}

	/**
	 * @return the usernameTextBox
	 */
	public WebElement getUsernameTextBox() {
		return UsernameTextBox;
	}

	/**
	 * @return the passwordTextBox
	 */
	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}

	/**
	 * @return the checkBox
	 */
	public WebElement getCheckBox() {
		return CheckBox;
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	


}
