package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewHomePage {
	
	@FindBy(xpath="//div[@id='no-wlp-main-slider']/ul//span[contains(text(),'SHOP SALE WOMEN')]")
	private WebElement homepagebannerSaleForWomen;
	
	@FindBy(xpath="//div[@id='no-wlp-main-slider']/ul//span[text()='SHOP SALE MEN']")
	private WebElement homepageBannerSaleForMen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[1]/div/a[1]//span[text()='SHOP WOMEN']")
	private WebElement under999ProductForWomen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[1]/div/a[2]//span[text()='SHOP MEN']")
	private WebElement under999ProductForMen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[2]/div/a[1]//span[text()='Shop Women']")
	private WebElement brandSaleProductForWomen;

	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[2]/div/a[2]//span[text()='Shop MEN']")
	private WebElement brandSaleProductForMen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[3]/div/a[1]//span[text()='Shop Women']")
	private WebElement SaleTrendingForWomen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[3]/div/a[2]//span[text()='Shop MEN']")
	private WebElement SaleTrendingForMen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[4]/div/a/span/span/span")
	private WebElement WomenSalePickOfTheDay;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[5]/div/a[2]//span[text()='Shop MEN']")
	private WebElement MenSalePickOfTheDay;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[5]/div/a[1]//span[text()='Shop Women']")
	private WebElement celebrityStyleSaleWomen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[2]/ul/li[5]/div/a[2]//span[text()='Shop MEN']")
	private WebElement celebrityStyleSaleMen;

	//OLD Homepage WebElements//
	
	@FindBy(xpath="//div[@id='bodyContent']/div[4]/ul/li[1]/div/a[1]/span/span/span")
	private WebElement KoovsbrandWomen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[4]/ul/li[1]/div/a[2]/span/span/span")
	private WebElement KoovsbrandMen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[4]/ul/li[2]/div/a[1]/span/span/span")
	private WebElement BrandEditWomen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[4]/ul/li[2]/div/a[2]/span/span/span")
	private WebElement BrandEditMen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[4]/ul/li[5]/div/a[1]/span/span/span")
	private WebElement CelebrityStyleWomen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[4]/ul/li[5]/div/a[2]/span/span/span")
	private WebElement CelebrityStyleMen;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[4]/ul/li[4]/div/a/span/span/span")
	private WebElement KOOVSXYOUshowMeMore;
	
	@FindBy(xpath="//div[@id='bodyContent']/div[4]/ul/li[3]/div/a/span/span/span")
	private WebElement StyleStoriesShowMeMore;
	
	
	
	
	/**
	 * @return the koovsbrandWomen
	 */
	public WebElement getKoovsbrandWomen() {
		return KoovsbrandWomen;
	}

	/**
	 * @return the koovsbrandMen
	 */
	public WebElement getKoovsbrandMen() {
		return KoovsbrandMen;
	}

	/**
	 * @return the brandEditWomen
	 */
	public WebElement getBrandEditWomen() {
		return BrandEditWomen;
	}

	/**
	 * @return the brandEditMen
	 */
	public WebElement getBrandEditMen() {
		return BrandEditMen;
	}

	/**
	 * @return the celebrityStyleWomen
	 */
	public WebElement getCelebrityStyleWomen() {
		return CelebrityStyleWomen;
	}

	/**
	 * @return the celebrityStyleMen
	 */
	public WebElement getCelebrityStyleMen() {
		return CelebrityStyleMen;
	}

	/**
	 * @return the kOOVSXYOUshowMeMore
	 */
	public WebElement getKOOVSXYOUshowMeMore() {
		return KOOVSXYOUshowMeMore;
	}

	/**
	 * @return the styleStoriesShowMeMore
	 */
	public WebElement getStyleStoriesShowMeMore() {
		return StyleStoriesShowMeMore;
	}

	/**
	 * @return the homepagebannerSaleForWomen
	 */
	public WebElement getHomepagebannerSaleForWomen() {
		return homepagebannerSaleForWomen;
	}

	/**
	 * @return the homepageBannerSaleForMen
	 */
	public WebElement getHomepageBannerSaleForMen() {
		return homepageBannerSaleForMen;
	}

	/**
	 * @return the under999ProductForWomen
	 */
	public WebElement getUnder999ProductForWomen() {
		return under999ProductForWomen;
	}

	/**
	 * @return the under999ProductForMen
	 */
	public WebElement getUnder999ProductForMen() {
		return under999ProductForMen;
	}

	/**
	 * @return the brandSaleProductForWomen
	 */
	public WebElement getBrandSaleProductForWomen() {
		return brandSaleProductForWomen;
	}

	/**
	 * @return the brandSaleProductForMen
	 */
	public WebElement getBrandSaleProductForMen() {
		return brandSaleProductForMen;
	}

	/**
	 * @return the saleTrendingForWomen
	 */
	public WebElement getSaleTrendingForWomen() {
		return SaleTrendingForWomen;
	}

	/**
	 * @return the saleTrendingForMen
	 */
	public WebElement getSaleTrendingForMen() {
		return SaleTrendingForMen;
	}

	/**
	 * @return the womenSalePickOfTheDay
	 */
	public WebElement getWomenSalePickOfTheDay() {
		return WomenSalePickOfTheDay;
	}

	/**
	 * @return the menSalePickOfTheDay
	 */
	public WebElement getMenSalePickOfTheDay() {
		return MenSalePickOfTheDay;
	}

	/**
	 * @return the celebrityStyleSaleWomen
	 */
	public WebElement getCelebrityStyleSaleWomen() {
		return celebrityStyleSaleWomen;
	}

	/**
	 * @return the celebrityStyleSaleMen
	 */
	public WebElement getCelebrityStyleSaleMen() {
		return celebrityStyleSaleMen;
	}
	
	

}
