package com.koovs.businesslib;

import org.openqa.selenium.By;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;

public class OrderSuccessSocialFooter {
	
	MultipleWindowHandles mhandle = new MultipleWindowHandles();
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	
			public void orderSuccessSocialFooter() throws InterruptedException
			{
				Driver.driver.findElement(By.xpath("//div[@id='bodyContent']/div/div[1]/div[1]/div[3]/div/a[1]")).click();
				mhandle.windowsforfooters();
				wlib.ThreadWait();
				Driver.driver.findElement(By.xpath("//div[@id='bodyContent']/div/div[1]/div[1]/div[3]/div/a[2]")).click();
				mhandle.windowsforfooters();
				wlib.ThreadWait();
				Driver.driver.findElement(By.xpath("//div[@id='bodyContent']/div/div[1]/div[1]/div[3]/div/a[3]")).click();
				mhandle.windowsforfooters();
				wlib.ThreadWait();
				
			}

}
