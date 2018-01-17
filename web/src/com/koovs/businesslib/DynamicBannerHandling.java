package com.koovs.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.HomePageFooters;
import com.koovs.projectobjectrepositoryLib.HomePageLinks;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;
import com.koovs.projectobjectrepositoryLib.WomenHeaderSubmenu;


public class DynamicBannerHandling {
	
			HomePageFooters homepagefooters = new HomePageFooters();
			HomePageLinks homepagelinks = new HomePageLinks();
			WomenHeaderSubmenu womenheadersubmenu = new WomenHeaderSubmenu();
			WebDriverCommonLib wlib = new WebDriverCommonLib();
			HomePageheadersAndSearch head = new HomePageheadersAndSearch();
			
			public void dynamicbanner(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				wlib.Actions(head.getWomenheader());
				womenheadersubmenu = PageFactory.initElements(Driver.driver, WomenHeaderSubmenu.class);
				womenheadersubmenu.getPankajandnidhiatkoovs().click();
				JavascriptExecutor jsx = (JavascriptExecutor)Driver.driver;
				jsx.executeScript("window.scrollBy(0,1500)","");
				
				WebDriverWait wait = new WebDriverWait(Driver.driver, 30);
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[2]")));
				if(Driver.driver.findElement(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[2]")).isDisplayed()){
				System.out.println("Image Displayed");
				}else{
				System.out.println("not displayed");
				}
				WebDriverWait wait1 = new WebDriverWait(Driver.driver, 30);
				wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[3]")));
				if(Driver.driver.findElement(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[3]")).isDisplayed()){
				System.out.println("Image Displayed");
				}else{
				System.out.println("not displayed");
				}
				WebDriverWait wait3 = new WebDriverWait(Driver.driver, 30);
				wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[4]")));
				if(Driver.driver.findElement(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[4]")).isDisplayed()){
				System.out.println("Image Displayed");
				}else{
				System.out.println("not displayed");
				}
				WebDriverWait wait4 = new WebDriverWait(Driver.driver, 30);
				wait4.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[5]")));
				if(Driver.driver.findElement(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[5]")).isDisplayed()){
				System.out.println("Image Displayed");
				}else{
				System.out.println("not displayed");
				}
				WebDriverWait wait5 = new WebDriverWait(Driver.driver, 30);
				wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[6]")));
				if(Driver.driver.findElement(By.xpath("//div[@class='wPankaj_NidhiVarea']/div[@class='wPN_bigSlider']//ul[1][@id='sistertrend_slideimgs']/li[6]")).isDisplayed()){
				System.out.println("Image Displayed");
				}else{
				System.out.println("not displayed");
				}
			}
			
			public void sikuliImageCompare() throws FindFailed{
				
				Screen screen = new Screen();
				Pattern image1men = new Pattern("E:\\Images\\MenProduct.PNG");
				Pattern image2arrow = new Pattern("E:\\Images\\MenProductForwardArrow.PNG");
				screen.exists(image1men);
				screen.click(image2arrow);	
			}
			public void womenCatproductSelect() throws FindFailed{
				
				Screen screen = new Screen();
				
				Pattern imager1womenProductdetailpage = new Pattern("E:\\Images\\WomenProductDetailspage.PNG");
				Pattern image2arrow = new Pattern("E:\\Images\\WomenProductForwardArrow1.PNG");
				
				screen.exists(imager1womenProductdetailpage);
				screen.click(image2arrow);
				
			}
}
