package com.koovs.businesslib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.projectobjectrepositoryLib.SortByPriceMenu;

public class CheckBoxes {
	SortByPriceMenu sort = new SortByPriceMenu();
		
	public void brandCheckBox(){
		List<WebElement> selectcheck = Driver.driver.findElements(By.xpath("//label[contains(@ filter-id,'brand')]"));
		System.out.println(selectcheck.size());
		int numberofbrands = selectcheck.size();
		int count = 1;
		int j = 0;
		while(count<=numberofbrands){
		List<WebElement> selectElements = Driver.driver.findElements(By.xpath("//label[contains(@ filter-id,'brand')]"));     	
		System.out.println("value of loop variable j is " + j);
		if (!selectElements.get(j).isSelected())
		{
			
			JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
			executor1.executeScript("arguments[0].click();",selectElements.get(j));
			Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			int n=1;
			Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();
			if(Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]/a")).isEnabled())
			{
				for(n=1;n<=4;n++)
					{
						Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]")).click();
						Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();	
					}
				n++;
			}
			
		}
		count++;
		j++;
	}
		/*
		 * For uncheck
		 */
		List<WebElement> unchecked = Driver.driver.findElements(By.xpath("//label[contains(@ filter-id,'brand')]"));
		int size_checkbox = unchecked.size();
		System.out.println("Count of the checkbox  " + size_checkbox);
		int count_check = 1 ;
		int k = 0;
		while (count_check <= size_checkbox ){
			List<WebElement> uncheck = Driver.driver.findElements(By.xpath("//label[contains(@ filter-id,'brand')]"));
			if (!uncheck.get(k).isSelected()){
				System.out.println("inside select function in untick");
				JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
				executor1.executeScript("arguments[0].click();",uncheck.get(k));
				
				
			}
			count_check++;
			k++;
	}

	}
		
		public void dressLengthCheckBox(){
			List<WebElement> selectcheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'dresslength')]"));
			System.out.println(selectcheck.size());
			int numberofstyles = selectcheck.size();
			int count = 1;
			int j = 0;
			while(count<=numberofstyles){
			List<WebElement> selectElements = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'dresslength')]"));     	
			System.out.println("value of loop variable j is " + j);
			if (!selectElements.get(j).isSelected())
			{
				String str = Driver.driver.getCurrentUrl();
				System.out.println(str);
				JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
				executor1.executeScript("arguments[0].click();",selectElements.get(j));
				Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				int n=1;
				Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();
				if(Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]/a")).isEnabled())
				{
					for(n=1;n<=4;n++)
						{
							Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]")).click();
							Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();	
						}
					n++;
				}
				
			}
			count++;
			j++;
			}
			List<WebElement> unchecked = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'dresslength')]"));
			int size_checkbox = unchecked.size();
			int count_check = 1 ;
			int k = 0;
			while (count_check <= size_checkbox ){
				List<WebElement> uncheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'dresslength')]"));
				if (!uncheck.get(k).isSelected())
				{
					System.out.println("inside select function in untick");
					JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
					executor1.executeScript("arguments[0].click();",uncheck.get(k));
					Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
				}
				count_check++;
				k++;
				}
		}
		
		
			public void colorsCheckBox() throws InterruptedException{
				List<WebElement> selectcheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'main_color')]"));
				System.out.println(selectcheck.size());
				int numberofstyles = selectcheck.size();
				int count = 1;
				int j = 0;
				while(count<=numberofstyles){
				List<WebElement> selectElements = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'main_color')]"));     	
				System.out.println("value of loop variable j is " + j);
				if (!selectElements.get(j).isSelected())
				{
					JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
					executor1.executeScript("arguments[0].click();",selectElements.get(j));
					Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					int n=1;
					Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();
					if(Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]/a")).isEnabled())
					{
						for(n=1;n<=4;n++)
							{
								Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]")).click();
								Thread.sleep(2000);
								Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();	
							}
						n++;
					}
					
				}
				count++;
				j++;
			}
				List<WebElement> unchecked = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'main_color')]"));
				int size_checkbox = unchecked.size();
				int count_check = 1 ;
				int k = 0;
				while (count_check <= size_checkbox ){
					List<WebElement> uncheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'main_color')]"));
					if (!uncheck.get(k).isSelected())
					{
						System.out.println("inside select function in untick");
						JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
						executor1.executeScript("arguments[0].click();",uncheck.get(k));
						Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
					}
					count_check++;
					k++;
					}
			}
		
		public void occasionCheckBox(){
			List<WebElement> selectcheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'occasion')]"));
			System.out.println(selectcheck.size());
			int numberofstyles = selectcheck.size();
			int count = 1;
			int j = 0;
			while(count<=numberofstyles){
			List<WebElement> selectElements = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'occasion')]"));     	
			System.out.println("value of loop variable j is " + j);
			if (!selectElements.get(j).isSelected())
			{
				JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
				executor1.executeScript("arguments[0].click();",selectElements.get(j));
				Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				int n=1;
				Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();
				if(Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]/a")).isEnabled())
				{
					for(n=1;n<=4;n++)
						{
							Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]")).click();
							Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();	
						}
					n++;
				}
				
			}
			count++;
			j++;
		}
			List<WebElement> unchecked = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'occasion')]"));
			int size_checkbox = unchecked.size();
			int count_check = 1 ;
			int k = 0;
			while (count_check <= size_checkbox ){
				List<WebElement> uncheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'occasion')]"));
				if (!uncheck.get(k).isSelected())
				{
					System.out.println("inside select function in untick");
					JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
					executor1.executeScript("arguments[0].click();",uncheck.get(k));
					Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
				}
				count_check++;
				k++;
				}

		}
		
		public void priceCheckBox(){
			List<WebElement> selectcheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'price')]"));
			System.out.println(selectcheck.size());
			int numberofstyles = selectcheck.size();
			int count = 1;
			int j = 0;
			while(count<=numberofstyles){
			List<WebElement> selectElements = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'price')]"));     	
			System.out.println("value of loop variable j is " + j);
			if (!selectElements.get(j).isSelected())
			{
				JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
				executor1.executeScript("arguments[0].click();",selectElements.get(j));
				Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				int n=1;
				Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();
				if(Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]/a")).isEnabled())
				{
					for(n=1;n<=4;n++)
						{
							Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]")).click();
							Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();	
						}
					n++;
				}
				
			}
			count++;
			j++;
		}
			List<WebElement> unchecked = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'price')]"));
			int size_checkbox = unchecked.size();
			int count_check = 1 ;
			int k = 0;
			while (count_check <= size_checkbox ){
				List<WebElement> uncheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'price')]"));
				if (!uncheck.get(k).isSelected())
				{
					System.out.println("inside select function in untick");
					JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
					executor1.executeScript("arguments[0].click();",uncheck.get(k));
					Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
				}
				count_check++;
				k++;
				}

		}
		public void sizeCheckBox(){
			List<WebElement> selectcheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'size')]"));
			System.out.println(selectcheck.size());
			int numberofstyles = selectcheck.size();
			int count = 1;
			int j = 0;
			while(count<=numberofstyles){
			List<WebElement> selectElements = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'size')]"));     	
			System.out.println("value of loop variable j is " + j);
			if (!selectElements.get(j).isSelected())
			{
				
				JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
				executor1.executeScript("arguments[0].click();",selectElements.get(j));
				Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				int n=1;
				Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();
				if(Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]/a")).isEnabled())
				{
					for(n=1;n<=4;n++)
						{
							Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]")).click();
							Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();	
						}
					n++;
				}
				
			}
			count++;
			j++;
		}
			List<WebElement> unchecked = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'size')]"));
			int size_checkbox = unchecked.size();
			int count_check = 1 ;
			int k = 0;
			while (count_check <= size_checkbox ){
				List<WebElement> uncheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'size')]"));
				if (!uncheck.get(k).isSelected())
				{
					System.out.println("inside select function in untick");
					JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
					executor1.executeScript("arguments[0].click();",uncheck.get(k));
					Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
				}
				count_check++;
				k++;
				}
			
		}
		
		public void sleevelengthCheckBox(){
			List<WebElement> selectcheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'sleevelength')]"));
			System.out.println(selectcheck.size());
			int numberofstyles = selectcheck.size();
			int count = 1;
			int j = 0;
			while(count<=numberofstyles){
			List<WebElement> selectElements = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'sleevelength')]"));     	
			System.out.println("value of loop variable j is " + j);
			if (!selectElements.get(j).isSelected())
			{
				
				JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
				executor1.executeScript("arguments[0].click();",selectElements.get(j));
				Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				int n=1;
				Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();
				if(Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]/a")).isEnabled())
				{
					for(n=1;n<=4;n++)
						{
							Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]")).click();
							Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();	
						}
					n++;
				}
				
			}
			count++;
			j++;
		}
			List<WebElement> unchecked = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'sleevelength')]"));
			int size_checkbox = unchecked.size();
			int count_check = 1 ;
			int k = 0;
			while (count_check <= size_checkbox ){
				List<WebElement> uncheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'sleevelength')]"));
				if (!uncheck.get(k).isSelected())
				{
					System.out.println("inside select function in untick");
					JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
					executor1.executeScript("arguments[0].click();",uncheck.get(k));
					Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
				}
				count_check++;
				k++;
				}
		}
		
		public void styleCheckBox(){
			List<WebElement> selectcheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'category')]"));
			System.out.println(selectcheck.size());
			int numberofstyles = selectcheck.size();
			int count = 1;
			int j = 0;
			while(count<=numberofstyles){
			List<WebElement> selectElements = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'category')]"));     	
			System.out.println("value of loop variable j is " + j);
			if (!selectElements.get(j).isSelected())
			{
				
				JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
				executor1.executeScript("arguments[0].click();",selectElements.get(j));
				Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				int n=1;
				Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();
				if(Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]/a")).isEnabled())
				{
					for(n=1;n<=4;n++)
						{
							Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]")).click();
							Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();	
						}
					n++;
				}
				
			}
			count++;
			j++;
		}
			List<WebElement> unchecked = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'category')]"));
			int size_checkbox = unchecked.size();
			int count_check = 1 ;
			int k = 0;
			while (count_check <= size_checkbox ){
				List<WebElement> uncheck = Driver.driver.findElements(By.xpath("//label[contains(@filter-id,'category')]"));
				if (!uncheck.get(k).isSelected())
				{
					System.out.println("inside select function in untick");
					JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
					executor1.executeScript("arguments[0].click();",uncheck.get(k));
					Driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
				}
				count_check++;
				k++;
				}
		}
		
		public void OnlyCheckFilterAndClearFilter()
		{
			sort = PageFactory.initElements(Driver.driver, SortByPriceMenu.class);
			List<WebElement> selectcheck = Driver.driver.findElements(By.xpath("//label[contains(@ filter-id,'brand')]"));
			System.out.println(selectcheck.size());
			int numberofbrands = selectcheck.size();
			int count = 1;
			int j = 0;
			while(count<=numberofbrands){
			List<WebElement> selectElements = Driver.driver.findElements(By.xpath("//label[contains(@ filter-id,'brand')]"));     	
			System.out.println("value of loop variable j is " + j);
			if (!selectElements.get(j).isSelected())
			{
				
				JavascriptExecutor executor1 = (JavascriptExecutor) Driver.driver;
				executor1.executeScript("arguments[0].click();",selectElements.get(j));
				Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				int n=1;
				Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();
				if(Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]/a")).isEnabled())
				{
					for(n=1;n<=4;n++)
						{
							Driver.driver.findElement(By.xpath("//div[@id='product_search_top']/div[2]/div[2]/div/ul/li["+n+"]")).click();
							Driver.driver.findElement(By.xpath("//a[@id='curr_sort_option']")).click();	
						}
					n++;
				}
				
			}
			count++;
			j++;
		}
			sort.getClearFilter().click();
		}
}
