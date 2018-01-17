package com.koovs.businesslib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;

public class DynamicBrandForMen {
	
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		HomePageheadersAndSearch head = new HomePageheadersAndSearch();
			public void menBrandsforA(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='A']/ul/li/a"));
				 for(int i=0;i<=lst.size()-1;i++)
				 {
					 lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='A']/ul/li/a"));
					 
				 }
			}
			
			public void menBrandsforB(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='B']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='B']/ul/li/a"));
				}
			}
			
			public void menBrandforC(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='C']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='C']/ul/li/a"));
				}
			}
			
			public void menBrandforD(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='D']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='D']/ul/li/a"));
				}
				
			}
			public void menBrandforE(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='E']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='E']/ul/li/a"));
				}
				
			}
			
			public void menBrandforF(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='F']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='F']/ul/li/a"));
				}
			}
			
			public void menBrandforG(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='G']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='G']/ul/li/a"));
				}
			}
			
			public void menBrandforH(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='H']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='H']/ul/li/a"));
				}
			}
			
			public void menBrandforI(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='I']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='I']/ul/li/a"));
				}
			}
			
			public void menBrandforJ(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='J']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='J']/ul/li/a"));
				}
			}
			
			public void menBrandforK(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='K']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='K']/ul/li/a"));
				}
			}
			
			public void menBrandforL(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='L']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='L']/ul/li/a"));
				}
			}
			
			public void menBrandforM(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='M']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='M']/ul/li/a"));
				}
			}
			
			public void menBrandforN(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='N']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='N']/ul/li/a"));
				}
			}
			
			public void menBrandforO(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='O']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='O']/ul/li/a"));
				} 	
			}
			
			public void menBrandforP(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='P']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='P']/ul/li/a"));
				}
			}
			
			public void menBrandforQ(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='Q']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='Q']/ul/li/a"));
				}
			}
			
			public void menforBrandforR(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='R']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='R']/ul/li/a"));
				}
			}
			
			public void menforBrandforS(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='S']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='S']/ul/li/a"));
				}
			}
			
			public void menforBrandforT(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='T']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='T']/ul/li/a"));
				}
			}
			
			public void menforBrandforU(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='U']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='U']/ul/li/a"));
				}
			}
			
			public void menforBrandforV(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='V']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='V']/ul/li/a"));
				}
			}
			
			public void menforBrandforW(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='W']/ul/li/a"));
				for(int i=0;i<=lst.size()-1;i++)
				{
					lst.get(i).click();
					 Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 Driver.driver.navigate().back();
					 wlib.Actions(head.getMenheader());
					 Driver.driver.findElement(By.xpath("//li[@class='men-menu men_women']/div/div[3]/ul[1]/li[8]/a[text()='A-Z of Brands']"));
					 wlib.WaitForPageToLoad();
					 lst = Driver.driver.findElements(By.xpath("//div[@class='brandsBlockList']/div/div[@id='W']/ul/li/a"));
				}
			}
}
