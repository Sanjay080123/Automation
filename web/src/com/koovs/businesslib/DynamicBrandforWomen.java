package com.koovs.businesslib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;

public class DynamicBrandforWomen {
	
			WebDriverCommonLib wlib = new WebDriverCommonLib();
			HomePageheadersAndSearch head = new HomePageheadersAndSearch();
				
			public void woomenBrandsforA(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='A']/ul/li/a"));
				 for(int i=0;i<=lst.size()-1;i++)
				 {
					 lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='A']/ul/li/a"));
					 
				 }
			}
			
			public void womenBrandsforB(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='B']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='B']/ul/li/a"));
				}
			}
			
			public void womenBrandforC(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='C']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='C']/ul/li/a"));
				}
			}
			
			public void womenBrandforD(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='D']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='D']/ul/li/a"));
				}
				
			}
			public void womenBrandforE(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='E']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='E']/ul/li/a"));
				}
				
			}
			
			public void womenBrandforF(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='F']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='F']/ul/li/a"));
				}
			}
			
			public void womenBrandforG(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='G']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='G']/ul/li/a"));
				}
			}
			
			public void womenBrandforH(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='H']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='H']/ul/li/a"));
				}
			}
			
			public void womenBrandforI(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='I']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='I']/ul/li/a"));
				}
			}
			
			public void womenBrandforJ(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='J']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='J']/ul/li/a"));
				}
			}
			
			public void womenBrandforK(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='K']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='K']/ul/li/a"));
				}
			}
			
				public void womenBrandforL(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='L']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='L']/ul/li/a"));
				}
			}
			
			public void womenBrandforM(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='M']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='M']/ul/li/a"));
				}
			}
			
			public void womenBrandforN(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='N']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='N']/ul/li/a"));
				}
			}
			
			public void womenBrandforO(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='O']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='O']/ul/li/a"));
				} 	
			}
			
			public void womenBrandforP(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='P']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='P']/ul/li/a"));
				}
			}
			
			public void womenBrandforQ(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='Q']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='Q']/ul/li/a"));
				}
			}
			
			public void womenforBrandforR(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='R']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='R']/ul/li/a"));
				}
			}
			
			public void womenforBrandforS(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='S']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='S']/ul/li/a"));
				}
			}
			
			public void womenforBrandforT(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='T']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='T']/ul/li/a"));
				}
			}
			
			public void womenforBrandforU(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='U']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='U']/ul/li/a"));
				}
			}
			
			public void womenforBrandforV(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='V']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='V']/ul/li/a"));
				}
			}
			
			public void womenforBrandforW(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='W']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='W']/ul/li/a"));
				}
			}
			
			public void womenforBrandforY(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='Y']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='Y']/ul/li/a"));
				}
			}
				
			public void womenforBrandforZ(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='Z']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='Z']/ul/li/a"));
				}
			}
			
			public void womenBrandfor09(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='0-9']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getWomenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='women-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='0-9']/ul/li/a"));
				}
			}

}
