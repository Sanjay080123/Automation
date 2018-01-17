package com.koovs.businesslib;

import java.util.List;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;

public class DynamicMenuListForWomen {
	
			WebDriverCommonLib wlib = new WebDriverCommonLib();
			HomePageheadersAndSearch head = new HomePageheadersAndSearch();
			ProductDetailPage productdetailpage = new ProductDetailPage();
			MultipleWindowHandles mhandle= new MultipleWindowHandles();
				
			public void womenMenuListforShopByProductEditandBrand() throws InterruptedException{
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				wlib.Actions(head.getWomenheader());
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//li[@class='women-menu men_women']/div//div/ul[1]/li/a"));
				int count = lst.size();
				for(int i=0;i<=count-28;i++){	
					List<WebElement> lst1 = Driver.driver.findElements(By.xpath("//li[@class='women-menu men_women']/div//div/ul[1]/li/a"));
						lst1.get(i).click();
						Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						wlib.scrollDown();
						Driver.driver.findElement(By.xpath("//div[@id='product_search_content']/div[1]/div[1]/a")).click();
						wlib.WaitForPageToLoad();
						if(Driver.driver.findElement(By.xpath("//div[@id='detail_product']//div[@id='mainProductImage']/div/img")).isDisplayed())
						{
							Driver.driver.navigate().back();
							wlib.WaitForPageToLoad();
							Driver.driver.findElement(By.xpath("//div[@id='product_search_content']/div[2]/div[1]/a/img[2]")).click();
						}
						productdetailpage.productDetails();
						wlib.ThreadWait();
						wlib.Actions(head.getWomenheader());
						Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

					}				
				wlib.Actions(head.getWomenheader());
			}
			
			public void womenMenuListforShopByProductsecondcoloum() throws InterruptedException{
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				wlib.Actions(head.getWomenheader());
				int i=0;
				while(i<=1){	
					List<WebElement> lst = Driver.driver.findElements(By.xpath("//li[@class='women-menu men_women']/div//div/ul[2]/li/a"));
					lst.get(i).click();
					Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					Driver.driver.findElement(By.xpath("//div[@id='product_search_content']/div[1]/div[1]/a")).click();
					Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					if(Driver.driver.findElement(By.xpath("//div[@id='detail_product']//div[@id='mainProductImage']/div/img")).isDisplayed())
					{
						Driver.driver.navigate().back();
						Driver.driver.findElement(By.xpath("//div[@id='product_search_content']/div[2]/div[1]/a/img[2]")).click();
					}
					productdetailpage.productDetails();
					wlib.ThreadWait();
					wlib.Actions(head.getWomenheader());
					i++;
				}
			}
			
}			
			
			
			
