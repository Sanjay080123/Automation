package com.koovs.businesslib;

import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;
import com.koovs.projectobjectrepositoryLib.SortByPriceMenu;
import com.koovs.projectobjectrepositoryLib.WomenHeaderSubmenu;

public class MasterCategoryClicks {
	
	WomenHeaderSubmenu mastercategory = new WomenHeaderSubmenu();
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	HomePageheadersAndSearch head = new HomePageheadersAndSearch();
	SortByPriceMenu categorysorting = new SortByPriceMenu();
	
	
	
	
	public void mastercategories(){
		head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
		wlib.Actions(head.getWomenheader());
		mastercategory = PageFactory.initElements(Driver.driver, WomenHeaderSubmenu.class);
		mastercategory.getDressesmastercat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getTopsmastercat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getJumpsuitscat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getSkirtscat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getJeanscat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getTrouserscat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getShortscat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getPullovercat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getCoatscat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getInnnerwearcat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getSwimsuitcat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getShoescat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getBagscat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getAccessoriescat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getSunglasscat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getJewellerycat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getWatchescat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		mastercategory.getBeautycat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		
	}
	
	public void categorysorting(){
		categorysorting = PageFactory.initElements(Driver.driver, SortByPriceMenu.class);
		
	}

}
