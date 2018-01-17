package com.koovs.businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.ProductDetailPageButtonForCard;
import com.koovs.projectobjectrepositoryLib.ProductDetailPageSocialFooters;

public class ProductDetailFooter {
	
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	ProductDetailPageSocialFooters pdetail = new ProductDetailPageSocialFooters();
	MultipleWindowHandles mwindow = new MultipleWindowHandles();
	boolean flag = false;
	ProductDetailPageButtonForCard productdetailPageButton = new ProductDetailPageButtonForCard();
	
	
	public void productFooters() throws InterruptedException{
				
				wlib.scrollDown();
				pdetail = PageFactory.initElements(Driver.driver, ProductDetailPageSocialFooters.class);
				productdetailPageButton = PageFactory.initElements(Driver.driver, ProductDetailPageButtonForCard.class);
			/*
			 * For faceBook Frame	
			 */
				WebElement faceBookFrame=Driver.driver.findElement(By.xpath("//iframe[@title='fb:like Facebook Social Plugin']"));
				Driver.driver.switchTo().frame(faceBookFrame);
				wlib.ThreadWait();
				pdetail.getFaceBookFrame().click();
				wlib.ThreadWait();
				mwindow.windowsforfooters();
//				wlib.WaitForPageToLoad();
//				pdetail.getFaceBookFrameClose().click();
				wlib.WaitForPageToLoad();
				Driver.driver.switchTo().defaultContent();
				
			/*
			 * For Twitter frame	
			 */
				WebElement twitterFrame = Driver.driver.findElement(By.xpath("//iframe[@title='Twitter Tweet Button']"));
				Driver.driver.switchTo().frame(twitterFrame);
				pdetail.getTwitterFrame().click();
				mwindow.windowsforfooters();
				Driver.driver.switchTo().defaultContent();
			/*
			 * For Google plus frame	
			 */
				WebElement googleFrame = Driver.driver.findElement(By.xpath("//iframe[@title='+1']"));
				Driver.driver.switchTo().frame(googleFrame);
				pdetail.getGooglePlusFrame().click();
				mwindow.windowsforfooters();
				Driver.driver.switchTo().defaultContent();
				wlib.ThreadWait();
			/*
			 * For pin interest window	
			 */
				Driver.driver.navigate().refresh();
				wlib.WaitForPageToLoad();
				wlib.scrollDown();
				pdetail.getPinInterest().click();
				mwindow.windowsforfooters();
				wlib.ThreadWait();
				wlib.pageUp();
				wlib.ThreadWait();
				
				if(Driver.driver.findElements(By.xpath("//div[@class='select-size']/a/span[text()='Size Guide']")).size() > 0)
				{
				wlib.selectSizeDropDown();
				productdetailPageButton.getAddToBagButton().click();
				wlib.ThreadWait();
				productdetailPageButton.getAddToWishlistButton().click();
				wlib.ThreadWait();
				}
			else
				{
					
					productdetailPageButton.getAddToBagButton().click();
					wlib.ThreadWait();
					productdetailPageButton.getAddToWishlistButton().click();

				}
				wlib.ThreadWait();
				
			}

}
