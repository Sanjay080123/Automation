package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageheadersAndSearch {
	
		@FindBy(xpath="//a[@id='track_order_site']")
		private WebElement trackOrderNotLogin;
	
		@FindBy(xpath="//a[@id='header_menu_women' and text()='WOMEN']")
		private WebElement womenheader;
		
		@FindBy(xpath="//a[@id='header_menu_men' and text()='MEN']")
		private WebElement menheader;
		
		@FindBy(css="a[href='http://www.koovs.com/style-stories']")
		private WebElement styleheader;
		
		@FindBy(id="header_menu_outfits")
		private WebElement koovsxyou;
		
		@FindBy(xpath="//a[@href='https://www.instagram.com/koovsfashion/']")
		private WebElement KOOVSXYOUkoovsfashion;
		
		@FindBy(xpath="//a[@href='https://www.instagram.com/koovsman/']")
		private WebElement KOOVSXYOUkoovsMan;
		
		@FindBy(xpath="//div[@id='bodyContent']/div/div[4]/span")
		private WebElement loadMoreKoovsXyou;
		
		
		@FindBy(id="search_query")
		private WebElement searchbox;

		@FindBy(id="searchImg")
		private WebElement searchbutton;
		
		/*
		 * Search product will be of MEN or WOMEN
		 */
		
		@FindBy(xpath="//label[@id='gender_filter_search_men']/input")
		private WebElement menCheckBoxInSearch;
		
		@FindBy(xpath="//label[@id='gender_filter_search_women']/input")
		private WebElement womenCheckBoxInSearch;
		
		

		
		/**
		 * @return the kOOVSXYOUkoovsfashion
		 */
		public WebElement getKOOVSXYOUkoovsfashion() {
			return KOOVSXYOUkoovsfashion;
		}

		/**
		 * @return the kOOVSXYOUkoovsMan
		 */
		public WebElement getKOOVSXYOUkoovsMan() {
			return KOOVSXYOUkoovsMan;
		}

		/**
		 * @return the trackOrderNotLogin
		 */
		public WebElement getTrackOrderNotLogin() {
			return trackOrderNotLogin;
		}

		/**
		 * @return the menCheckBoxInSearch
		 */
		public WebElement getMenCheckBoxInSearch() {
			return menCheckBoxInSearch;
		}

		/**
		 * @return the womenCheckBoxInSearch
		 */
		public WebElement getWomenCheckBoxInSearch() {
			return womenCheckBoxInSearch;
		}

		/**
		 * @return the loadMoreKoovsXyou
		 */
		public WebElement getLoadMoreKoovsXyou() {
			return loadMoreKoovsXyou;
		}

		/**
		 * @return the womenheader
		 */
		public WebElement getWomenheader() {
			return womenheader;
		}

		/**
		 * @return the menheader
		 */
		public WebElement getMenheader() {
			return menheader;
		}

		/**
		 * @return the styleheader
		 */
		public WebElement getStyleheader() {
			return styleheader;
		}

		/**
		 * @return the koovsxyou
		 */
		public WebElement getKoovsxyou() {
			return koovsxyou;
		}

		/**
		 * @return the searchbox
		 */
		public WebElement getSearchbox() {
			return searchbox;
		}

		/**
		 * @return the searchbutton
		 */
		public WebElement getSearchbutton() {
			return searchbutton;
		}

		
	
	}
	
		

	


