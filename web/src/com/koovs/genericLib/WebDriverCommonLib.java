package com.koovs.genericLib;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverCommonLib  {
	boolean flag;
	public void ThreadWait() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	public void WaitForPageToLoad()
	{
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void WaitForLinkPresent(String linkName)
	{
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName)));
	}
	public void WaitForXpathPresent(String wbXpath)
	{
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wbXpath)));
	}
	public void Select(WebElement selwb, String value)
	{
		Select sel = new Select(selwb);
		sel.selectByVisibleText(value);
	}
	public void Select(WebElement selwb , int index)
	{
		Select sel = new Select(selwb);
		sel.selectByIndex(index);
	}
	public void ActionsTask()
	{
		Actions act = new Actions(Driver.driver);
		act.sendKeys(Keys.ESCAPE).perform();
	}
	public void Actions( WebElement MoveToOverWebElement)
	{
		Actions act = new Actions(Driver.driver);
		act.moveToElement(MoveToOverWebElement).perform();
	}
	public void Action()
	{
		Actions act = new Actions(Driver.driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	public void ActionEsc()
	{
		Actions act = new Actions(Driver.driver);
		act.sendKeys(Keys.ESCAPE).perform();
	}
	public void ActionLast()
	{
		Actions act = new Actions(Driver.driver);
		act.sendKeys(Keys.END).perform();
	}
	public void AutoItAuthonticationPopUp() throws IOException
	{
		Runtime.getRuntime().exec("C:\\Users\\Sanjay\\Desktop\\file11.exe");
	}
	public void AutoItOutlookclose() throws IOException
	{
		Runtime.getRuntime().exec("C:\\Users\\Sanjay\\Desktop\\microsoftoutlookclose3.exe");
	}
	public void scrollDown()
	{
		JavascriptExecutor jse = (JavascriptExecutor)Driver.driver;
		jse.executeScript("window.scrollBy(0,300)", "");
	}
	public void selectSizeDropDown()
	{
		WebElement dropdown = Driver.driver.findElement(By.xpath("//select[@id='type_id_1']"));
		Select sel = new Select(dropdown);
		List<WebElement> dropdown1 = sel.getOptions();
		for(WebElement option : dropdown1)
		{
			if(option.getText().equals("Not Available"))
				{
					break;
				}
			else
				{
					option.click();
				}
			
		}
	}
	
	public void selectSizeDropDownFromCart()
	{
		WebElement cartDropdown = Driver.driver.findElement(By.xpath("//select[@class='select_size']"));
		Select sel = new Select(cartDropdown);
		List<WebElement> dropdown = sel.getOptions();
		for(WebElement option : dropdown)
		{
			if(option.getText().equals("Not Available"))
			{
				break;
			}
		else
			{
				option.click();
			}
		}
	}
	public void scrollDownToElement(WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)Driver.driver;
		jse.executeScript("arguments[0].scrollIntoView();", element);
	}
	public void scrollUpForLanding()
	{
		JavascriptExecutor jse = (JavascriptExecutor)Driver.driver;
		jse.executeScript("window.scrollBy(0,-500)", "");
	}
	public void scrollToThePageEnd()
	{
		Actions actions = new Actions(Driver.driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
	}
	public void pageUp()
	{
		Actions actions = new Actions(Driver.driver);
		actions.sendKeys(Keys.PAGE_UP).perform();
	}
}
