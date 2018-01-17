package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFooters {
	
	@FindBy(css=".footerSprites.fbFollow.trackEvent")
	private WebElement facebookfooter;
	
	@FindBy(css=".footerSprites.twitterFollow.trackEvent")
	private WebElement twitterfooter;
	
	@FindBy(css=".instaFollow.footerSprites.trackEvent")
	private WebElement instagramfooter;
	
	@FindBy(css=".footerSprites.gPlus.trackEvent")
	private WebElement googleplusfooter;
	
	@FindBy(css=".footerSprites.YouTube.trackEvent")
	private WebElement youtubefooter;
	
	@FindBy(xpath="//a[1][@href='http://www.koovs.com/koovs-app']/img[1]")
	private WebElement iphoneappfooter;
	
	@FindBy(xpath="//a[2][@href='http://www.koovs.com/koovs-app']/img[1]")
	private WebElement androidphonefooter;
	
	@FindBy(css="a[href='http://www.koovs.com/corporate']")
	private WebElement corporatesitelink;
	
	@FindBy(css="a[href='http://www.koovs.com/info/careers']")
	private WebElement careerslink;
	
	@FindBy(css="a[href='http://www.koovs.com/info/contact']")
	private WebElement contactusfooter;
	
	@FindBy(xpath="//a[@href='https://www.koovs.com/myaccount/view/my_orders' and text()='Track Order']")
	private WebElement trackorder;
	
	@FindBy(css="a[href='http://www.koovs.com/info/returns']")
	private WebElement returnpolicy;
	
	@FindBy(css="a[href='http://www.koovs.com/info/shipping#cp']")
	private WebElement cancelproduct;
	
	@FindBy(css="a[href='http://www.koovs.com/info/shipping#sp']")
	private WebElement shippingdetails;
	
	@FindBy(css="a[href='http://www.koovs.com/info/faq']")
	private WebElement questions;

	/**
	 * @return the facebookfooter
	 */
	public WebElement getFacebookfooter() {
		return facebookfooter;
	}

	/**
	 * @return the twitterfooter
	 */
	public WebElement getTwitterfooter() {
		return twitterfooter;
	}

	/**
	 * @return the instagramfooter
	 */
	public WebElement getInstagramfooter() {
		return instagramfooter;
	}

	/**
	 * @return the googleplusfooter
	 */
	public WebElement getGoogleplusfooter() {
		return googleplusfooter;
	}

	/**
	 * @return the youtubefooter
	 */
	public WebElement getYoutubefooter() {
		return youtubefooter;
	}

	/**
	 * @return the iphoneappfooter
	 */
	public WebElement getIphoneappfooter() {
		return iphoneappfooter;
	}

	/**
	 * @return the androidphonefooter
	 */
	public WebElement getAndroidphonefooter() {
		return androidphonefooter;
	}

	/**
	 * @return the corporatesitelink
	 */
	public WebElement getCorporatesitelink() {
		return corporatesitelink;
	}

	/**
	 * @return the careerslink
	 */
	public WebElement getCareerslink() {
		return careerslink;
	}

	/**
	 * @return the contactusfooter
	 */
	public WebElement getContactusfooter() {
		return contactusfooter;
	}

	/**
	 * @return the trackorder
	 */
	public WebElement getTrackorder() {
		return trackorder;
	}

	/**
	 * @return the returnpolicy
	 */
	public WebElement getReturnpolicy() {
		return returnpolicy;
	}

	/**
	 * @return the cancelproduct
	 */
	public WebElement getCancelproduct() {
		return cancelproduct;
	}

	/**
	 * @return the shippingdetails
	 */
	public WebElement getShippingdetails() {
		return shippingdetails;
	}

	/**
	 * @return the questions
	 */
	public WebElement getQuestions() {
		return questions;
	}

}
