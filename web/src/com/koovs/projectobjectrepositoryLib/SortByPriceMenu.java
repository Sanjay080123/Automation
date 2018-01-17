package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortByPriceMenu {

	@FindBy(id="curr_sort_option")
	private WebElement sortlinkbutton;
	
	@FindBy(xpath="//div[@class='productsCount']")
	private WebElement productsCount;
	
	@FindBy(xpath="//div[@id='selectFilterBox']/span[2]/a[text()='clear filter']")
	private WebElement clearFilter;
	
	@FindBy(id="go_to_top")
	private WebElement gotoTopButton;
	
	@FindBy(xpath="//div[@id='show_more_product_div']/a")
	private WebElement showMoreProductInListPage;
	
	/**
	 * Menulist for sorting
	 */
	
	@FindBy(css="a[href='http://www.koovs.com/women/dresses/sortby-popular/']")
	private WebElement sortbyhot;
	
	@FindBy(css="a[href='http://www.koovs.com/women/dresses/sortby-latest/']")
	private WebElement sortbynew;
	
	@FindBy(css="a[href='http://www.koovs.com/women/dresses/sortby-price-low/']")
	private WebElement sortonpricelowtohigh;
	
	@FindBy(css="a[href='http://www.koovs.com/women/dresses/sortby-price-high/']")
	private WebElement sortonpricehightolow;

	
	/**
	 * @return the showMoreProductInListPage
	 */
	public WebElement getShowMoreProductInListPage() {
		return showMoreProductInListPage;
	}

	/**
	 * @return the gotoTopButton
	 */
	public WebElement getGotoTopButton() {
		return gotoTopButton;
	}

	/**
	 * @return the clearFilter
	 */
	public WebElement getClearFilter() {
		return clearFilter;
	}

	/**
	 * @return the productsCount
	 */
	public WebElement getProductsCount() {
		return productsCount;
	}

	/**
	 * @return the sortlinkbutton
	 */
	public WebElement getSortlinkbutton() {
		return sortlinkbutton;
	}

	/**
	 * @return the sortbyhot
	 */
	public WebElement getSortbyhot() {
		return sortbyhot;
	}

	/**
	 * @return the sortbynew
	 */
	public WebElement getSortbynew() {
		return sortbynew;
	}

	/**
	 * @return the sortonpricelowtohigh
	 */
	public WebElement getSortonpricelowtohigh() {
		return sortonpricelowtohigh;
	}

	/**
	 * @return the sortonpricehightolow
	 */
	public WebElement getSortonpricehightolow() {
		return sortonpricehightolow;
	}
	
	
}
