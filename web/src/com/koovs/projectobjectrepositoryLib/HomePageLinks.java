package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLinks {
	
	@FindBy(xpath="//div[@id='headerContent']/div[1]/div[2]/div[1]/a/img")
	private WebElement koovslogo;
	
	@FindBy(xpath="//div[@id='kvheader']/div[1]/a/img")
	private WebElement checkoutKoovsLogo;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[@class='home_page_video']/div[2]/span//span[text()='SHOP WOMEN']")
	private WebElement shopwomenlink;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[@class='home_page_video']/div[2]/span//span[text()='SHOP MEN']")
	private WebElement shopmenlink;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[3]/ul/li[3]/div/a[1]/span/span/span")
	private WebElement stylestoriesbannerforwomen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[3]/ul/li[3]/div/a[2]/span/span/span")
	private WebElement stylestoriesbannerformen;
	
	/*
	 * For Wishlist and Bag
	 */
	@FindBy(css=".bagItems>a")
	private WebElement bagicon;
	
	@FindBy(xpath="//div[@id='userDetails']/ul/li[2]/span/a/img")
	private WebElement wishlistIcon;
	
	/*
	 * Links in bar after headers
	 */
	
	@FindBy(css="a[title='30% OFF SELECT WOMEN BRANDS']")
	private WebElement offForWomen;
	
	@FindBy(css="a[href='http://www.koovs.com/info/returns/']")
	private WebElement onlinereturn;
	
	@FindBy(css="a[title='30% OFF SELECT MEN BRANDS']")
	private WebElement offForMen;
	
	/*
	 * Links for info koovs mail
	 */
	
	@FindBy(css="a[href='mailto:info@koovs.com']")
	private WebElement infolink;
	
	/*
	 * Links to Men Brand page and women Brand Page.
	 */
	@FindBy(xpath="//div[@id='bodyContent']/div[3]/ul/li[2]/div/a[1]/span/span/span")
	private WebElement womennavigatetobrandpage;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[3]/ul/li[2]/div/a[2]/span/span/span")
	private WebElement mennavigatetobrandpage;
	

	
	
	/**
	 * @return the checkoutKoovsLogo
	 */
	public WebElement getCheckoutKoovsLogo() {
		return checkoutKoovsLogo;
	}

	/**
	 * @return the bagicon
	 */
	public WebElement getBagicon() {
		return bagicon;
	}

	/**
	 * @return the wishlistIcon
	 */
	public WebElement getWishlistIcon() {
		return wishlistIcon;
	}

	/**
	 * @return the koovslogo
	 */
	public WebElement getKoovslogo() {
		return koovslogo;
	}

	/**
	 * @return the stylestoriesbannerforwomen
	 */
	public WebElement getStylestoriesbannerforwomen() {
		return stylestoriesbannerforwomen;
	}

	/**
	 * @return the stylestoriesbannerformen
	 */
	public WebElement getStylestoriesbannerformen() {
		return stylestoriesbannerformen;
	}

	/**
	 * @return the womennavigatetobrandpage
	 */
	public WebElement getWomennavigatetobrandpage() {
		return womennavigatetobrandpage;
	}

	/**
	 * @return the mennavigatetobrandpage
	 */
	public WebElement getMennavigatetobrandpage() {
		return mennavigatetobrandpage;
	}

	/**
	 * @return the infolink
	 */
	public WebElement getInfolink() {
		return infolink;
	}

	/**
	 * @return the shopwomenlink
	 */
	public WebElement getShopwomenlink() {
		return shopwomenlink;
	}

	/**
	 * @return the shopmenlink
	 */
	public WebElement getShopmenlink() {
		return shopmenlink;
	}

	/**
	 * @return the offForWomen
	 */
	public WebElement getOffForWomen() {
		return offForWomen;
	}

	/**
	 * @return the onlinereturn
	 */
	public WebElement getOnlinereturn() {
		return onlinereturn;
	}

	/**
	 * @return the offForMen
	 */
	public WebElement getOffForMen() {
		return offForMen;
	}

	

}
