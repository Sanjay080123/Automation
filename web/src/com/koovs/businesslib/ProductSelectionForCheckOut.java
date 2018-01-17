package com.koovs.businesslib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;
import com.koovs.projectobjectrepositoryLib.MenWomenBrandNames;

public class ProductSelectionForCheckOut {
	
		MenWomenBrandNames menwomenbrand = new MenWomenBrandNames();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		HomePageheadersAndSearch head = new HomePageheadersAndSearch();
		
	
			public void productSelectforWomen(){
					
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				wlib.Actions(head.getWomenheader());
				menwomenbrand = PageFactory.initElements(Driver.driver, MenWomenBrandNames.class);
				menwomenbrand.getWomentotalbrandlist().click();
				menwomenbrand.getBasiccarebrand().click();
				wlib.WaitForPageToLoad();
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@id='pageResults']/div[@id='listWedget']/div[@id='product_search_content']/div/div[@class='prodShow prodShow_4']/a"));
				int i =0;
				int count = lst.size();
				int count1 = 1;
				//for(i =0;i<=count;i++)
				while(count1<=count)
				{
					List<WebElement> lst1 = Driver.driver.findElements(By.xpath("//div[@id='pageResults']/div[@id='listWedget']/div[@id='product_search_content']/div/div[@class='prodShow prodShow_4']/a"));
					lst1.get(i).click();
					Driver.driver.navigate().back();
					wlib.WaitForPageToLoad();
					
				}
				count1++;
				i++;
				
				
				
				
			}

}
