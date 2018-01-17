package com.koovs.businesslib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;

public class WomenStyleStoriesPagesLink {
		WebDriverCommonLib wlib = new WebDriverCommonLib();	
		CurrentUrlOfPages currentUrl = new CurrentUrlOfPages();
		MultipleWindowHandles multiWindow = new MultipleWindowHandles();
			
	
		public void womenStyleSpyDetailsPageLinks() throws InterruptedException
		{
			wlib.scrollDownToElement(Driver.driver.findElement(By.xpath("//div[@id='ssContentWrapper_166']/div[1]/div[3]/div[2]/p[1]/a[1]")));
			wlib.ThreadWait();
			List<WebElement>links = Driver.driver.findElements(By.xpath("//div[@id='ssContentWrapper_166']/div[1]/div[3]/div[2]/p[1]/a[contains(@href,'skuid')]"));
			for(int i=0;i<=links.size()-2;i++)
			{
				links.get(i).click();
				currentUrl.ulrs();
				Driver.driver.navigate().back();
				wlib.WaitForPageToLoad();
				Driver.driver.navigate().back();
				links = Driver.driver.findElements(By.xpath("//div[@id='ssContentWrapper_166']/div[1]/div[3]/div[2]/p[1]/a[contains(@href,'skuid')]"));
				
			}
			
			/*
			 * For ADD to stories
			 */
			wlib.scrollDown();
			if(Driver.driver.findElement(By.xpath("//div[@id='ssContentWrapper_166']/div[3]/div")).isDisplayed())
			{
				wlib.WaitForXpathPresent("//div[@id='ssContentWrapper_166']/div[3]/div");
				Driver.driver.findElement(By.xpath("//div[@id='ssContentWrapper_166']/div[3]/div")).click();
				wlib.ThreadWait();
			}
		}
		
	public void theHotList()
	{
		List<WebElement> images = Driver.driver.findElements(By.xpath("//div[@id='bodyContent']/div/div[2]/div/div/div//img"));
		for(int i= 0; i<=images.size()-1;i++)
		{
			images.get(i).click();
			wlib.ActionEsc();
			multiWindow.windowsforfooters();
		}
	}
	
	public void howToWear() throws InterruptedException
	{
		wlib.scrollDown();
		wlib.ThreadWait();
		
		for(int i=1;i<=5;i++)
		{
			
			Driver.driver.navigate().refresh();
			wlib.scrollDown();
			for(int j=2;j<=5;j++)
			{
				
				wlib.ThreadWait();
				Driver.driver.findElement(By.xpath("//div[@class='ssTrendTop']/div["+i+"]//ul[@id='sistertrend_slideimgs']/li["+j+"]/span/img[contains(@src,'http://images.kooves.com/uploads/style_stories')]")).click();
				wlib.ThreadWait();
				wlib.ActionEsc();
				Driver.driver.findElement(By.xpath("//div[@class='ssTrendTop']/div["+i+"]//div[@class='sshtwProductSliderWrapper']/div/ul/li[2]/a")).click();
				
				
			}
		}
	}
}
