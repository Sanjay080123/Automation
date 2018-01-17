package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUp {

	@FindBy(css="a[href='https://www.koovs.com/signup/register']")     		
	private WebElement SignupButton;

	@FindBy(css="#reg_username")
	private WebElement Name;
	
	@FindBy(id="reg_email")
	private WebElement Emailid;
	
	@FindBy(id="reg_password")
	private WebElement Password;
	
	@FindBy(id="phone")
	private WebElement PhoneNum;
	
	@FindBy(xpath="//a[@class='button black-btn new_subscription koovs-new-subscription newsletter-btn trackEvent' and text()='MEN']")
	private WebElement MenButton;
	
	@FindBy(xpath="//a[text()='log in']")
	private WebElement BackToLogin;
	
	@FindBy(xpath="//a[@class='modalCloseImg simplemodal-close ThnkUmsgClose']")
	private WebElement ClosePopUP;

	/**
	 * @return the closePopUP
	 */
	public WebElement getClosePopUP() {
		return ClosePopUP;
	}

	/**
	 * @return the backToLogin
	 */
	public WebElement getBackToLogin() {
		return BackToLogin;
	}

	/**
	 * @return the signupButton
	 */
	public WebElement getSignupButton() {
		return SignupButton;
	}

	/**
	 * @return the name
	 */
	public WebElement getName() {
		return Name;
	}

	/**
	 * @return the emailid
	 */
	public WebElement getEmailid() {
		return Emailid;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return Password;
	}

	/**
	 * @return the phoneNum
	 */
	public WebElement getPhoneNum() {
		return PhoneNum;
	}

	/**
	 * @return the menButton
	 */
	public WebElement getMenButton() {
		return MenButton;
	}

	public class SignUpForSecure {
				
		@FindBy(xpath="//a[text()='Sign Up']")
		private WebElement SignUpForSecureButton;

				/**
				 * @return the signUpForSecureButton
				 */
		public WebElement getSignUpForSecureButton() {
		return SignUpForSecureButton;
		}
	}
}

