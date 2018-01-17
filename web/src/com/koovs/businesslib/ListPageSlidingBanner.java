package com.koovs.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;
import com.koovs.projectobjectrepositoryLib.MenHeaderSubmenu;
import com.koovs.projectobjectrepositoryLib.WomenHeaderSubmenu;

public class ListPageSlidingBanner {
				
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		HomePageheadersAndSearch homepageheaders = new HomePageheadersAndSearch();
		WomenHeaderSubmenu womenheadersubmenu = new WomenHeaderSubmenu();
		MenHeaderSubmenu menheadersubmenu = new MenHeaderSubmenu();
		
	public void CheckingOfSlidingBannerWomen() throws InterruptedException
	{
		homepageheaders = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
		womenheadersubmenu = PageFactory.initElements(Driver.driver, WomenHeaderSubmenu.class);
		wlib.Actions(homepageheaders.getWomenheader());
		wlib.ThreadWait();
		womenheadersubmenu.getNewlook().click();
		wlib.WaitForPageToLoad();
		wlib.Actions(Driver.driver.findElement(By.xpath("//div[@id='list_multi_slider']/ul/li[3]/a/img")));
		wlib.WaitForPageToLoad();
		/**
		 * for Left preview
		 */
		Driver.driver.findElement(By.xpath("//div[@class='listPageSlider']/span[1]")).click();
		wlib.ThreadWait();
		/*
		 * For right preview
		 */
		Driver.driver.findElement(By.xpath("//div[@class='listPageSlider']/span[2]")).click();
		wlib.ThreadWait();
		
	}
	
	public void CheckingOfSlidingBannerMen() throws InterruptedException
	{
		homepageheaders = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
		menheadersubmenu = PageFactory.initElements(Driver.driver, MenHeaderSubmenu.class);
		wlib.Actions(homepageheaders.getMenheader());
		menheadersubmenu.getNewLookBrand().click();
		wlib.WaitForPageToLoad();
		wlib.Actions(Driver.driver.findElement(By.xpath("//div[@id='list_multi_slider']/ul/li[2]/a/img")));
		wlib.WaitForPageToLoad();
		/*
		 * For left preview
		 */
		Driver.driver.findElement(By.xpath("//div[@class='listPageSlider']/span[1]")).click();
		wlib.ThreadWait();
		/*
		 * For right preview
		 */
		Driver.driver.findElement(By.xpath("//div[@class='listPageSlider']/span[2]")).click();
		wlib.ThreadWait();
		
	}

}
