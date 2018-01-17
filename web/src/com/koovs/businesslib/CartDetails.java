package com.koovs.businesslib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;

public class CartDetails {
	WebDriverCommonLib wlib = new WebDriverCommonLib();
				
		public void cartIncrementDetails() throws InterruptedException
		{	
			List<WebElement> plusSign = Driver.driver.findElements(By.xpath("//table[@class='cart-data-table']/tbody/tr/td[2]/div/div//div[@class='cartQtyBlk']//a[2]"));
			int n = plusSign.size();
			for(int i=1;i<=n;i++)
			{
				String cartQuantity = Driver.driver.findElement(By.xpath("//table[@class='cart-data-table']/tbody/tr["+i+"]/td[2]/div/div//div[@class='cartQtyBlk']/div/label[1]/span/input")).getText();
				System.out.println(cartQuantity);
				Driver.driver.findElement(By.xpath("//table[@class='cart-data-table']/tbody/tr["+i+"]/td[2]/div/div//div[@class='cartQtyBlk']//a[2]")).click();
				wlib.ThreadWait();
				WebElement element = Driver.driver.findElement(By.xpath("//table[@class='cart-data-table']/tbody/tr["+i+"]/td[1]"));
				wlib.scrollDownToElement(element);
			}
			
		}
		
		public void cartDecrementDetails() throws InterruptedException
		{
			WebElement scrollbar = Driver.driver.findElement(By.xpath("//div[@id='web-cart-lists']/div[2]/div/div[1]/div/div"));
			if(scrollbar.isDisplayed())
			{
				
			Driver.driver.findElement(By.xpath("//div[@id='web-cart-lists']/div[2]/div/div[1]/div/div")).click();
			wlib.scrollUpForLanding();
			}
			List<WebElement> minusSign = Driver.driver.findElements(By.xpath("//table[@class='cart-data-table']/tbody/tr/td[2]/div/div//div[@class='cartQtyBlk']//a[1]"));
			for(int j=1;j<=minusSign.size();j++)
			{
				Driver.driver.findElement(By.xpath("//table[@class='cart-data-table']/tbody/tr["+j+"]/td[2]/div/div//div[@class='cartQtyBlk']//a[1]")).click();
				wlib.ThreadWait();
				WebElement element = Driver.driver.findElement(By.xpath("//table[@class='cart-data-table']/tbody/tr["+j+"]/td[1]"));
				wlib.scrollDownToElement(element);
			}
		}
		
}
