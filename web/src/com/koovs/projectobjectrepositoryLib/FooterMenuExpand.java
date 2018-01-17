package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterMenuExpand {
	
	@FindBy(xpath="//span[text()='Top categories']")
	private WebElement categoriesexpand;
	
	@FindBy(xpath="//span[text()='Top brands']")
	private WebElement brandsexpand;
	
	@FindBy(xpath="//span[text()='about koovs.com']")
	private WebElement koovsinformation;

	/**
	 * @return the categoriesexpand
	 */
	public WebElement getCategoriesexpand() {
		return categoriesexpand;
	}

	/**
	 * @return the brandsexpand
	 */
	public WebElement getBrandsexpand() {
		return brandsexpand;
	}

	/**
	 * @return the koovsinformation
	 */
	public WebElement getKoovsinformation() {
		return koovsinformation;
	}
	
	
	
	

}
