package com.koovs.businesslib;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.BagToCheckOutDetails;

public class WishListProductsToCart {
	
	
	BagToCheckOutDetails bagcheckout = new BagToCheckOutDetails();
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	
		public void wishlistProducts() throws InterruptedException
		{
			bagcheckout = PageFactory.initElements(Driver.driver, BagToCheckOutDetails.class);
			WebElement hover = Driver.driver.findElement(By.xpath("//div[@class='overview']/div[1]/div/div[1]/div[@class='item_image_container']/a/img[2]"));
			wlib.Actions(hover);
			wlib.WaitForPageToLoad();
			Driver.driver.findElement(By.xpath("//div[@class='overview']/div[1]/div/div[1]/div[1]/form/a"));
			wlib.ThreadWait();
			bagcheckout.getBackToBag().click();
			wlib.WaitForPageToLoad();
			bagcheckout.getContinueShopping().click();
			wlib.WaitForPageToLoad();
			Driver.driver.navigate().back();
			Driver.driver.findElement(By.xpath("//table[@class='cart-data-table']/tbody/tr[1]/td[1]/div[1]")).click();
			wlib.ThreadWait();
			Driver.driver.navigate().back();
			
		}

}
