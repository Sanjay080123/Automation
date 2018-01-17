package com.koovs.businesslib;

import org.openqa.selenium.By;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;

public class WomenMenEditorialPages {
	
	WebDriverCommonLib wlib = new WebDriverCommonLib();	
	CurrentUrlOfPages currentUrl = new CurrentUrlOfPages();
	MultipleWindowHandles multiWindow = new MultipleWindowHandles();
	
	
	public void womenEditorialPage() throws InterruptedException
	{
		wlib.scrollDownToElement(Driver.driver.findElement(By.xpath("//div[@id='sale']/div[1]/div[2]/img")));
		Driver.driver.navigate().refresh();
		for(int i=2;i<=6;i++)
		{
			wlib.scrollDownToElement(Driver.driver.findElement(By.xpath("//div[@id='sale']/div[1]/div[2]/img")));
			Driver.driver.findElement(By.xpath("//div[@id='bodyContent']/div/div[1]/div[2]/div[@class='wPN_bigSlider']//ul[@id='sistertrend_slideimgs']/li["+i+"]/span[1]/img")).click();
			wlib.ActionEsc();
			Driver.driver.findElement(By.xpath("//div[@id='sale']/div[1]/div[2]/div/div/div/ul/li[2]/a")).click();
			wlib.ThreadWait();
		}
	}
	
	public void menEditorialPage() throws InterruptedException
	{
		
		wlib.scrollDownToElement(Driver.driver.findElement(By.xpath("//div[@id='bodyContent']")));
		Driver.driver.navigate().refresh();
		for(int i = 2;i<=4;i++)
		{
			wlib.scrollDownToElement(Driver.driver.findElement(By.xpath("//div[@id='bodyContent']")));
			Driver.driver.findElement(By.xpath("//ul[@id='sistertrend_slideimgs']/li["+i+"]/span[1]/img")).click();
			wlib.ActionEsc();
			Driver.driver.findElement(By.xpath("//div[@id='sale']/div[1]/div[1]/div/ul/li[2]/a")).click();
			wlib.ThreadWait();
		}
	}

}
