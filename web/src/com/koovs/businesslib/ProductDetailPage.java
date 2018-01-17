package com.koovs.businesslib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;


public class ProductDetailPage {
				
					WebDriverCommonLib wlib = new WebDriverCommonLib();
					MultipleWindowHandles mhandle= new MultipleWindowHandles();
					ProductDetailFooter productFooter = new ProductDetailFooter();
				
			public void productDetails() throws InterruptedException{
			/*
			 * Path for Products that are sold out and Present	
			 */

				String soldoutproduct = "//div[@id='detail_product']//div[@id='mainProductImage']/div/img";
				String Presentproduct ="//div[@id='detail_product']//div[@id='mainProductImage']/img[@id='finalimage']";
				
				
				if(Driver.driver.findElement(By.xpath(soldoutproduct)).isDisplayed())
				{
					Driver.driver.navigate().back();
					Driver.driver.findElement(By.xpath("//div[@id='product_search_content']/div[2]/div[1]/a/img[2]")).click();
				}
				else
					{	
						String productid = Driver.driver.findElement(By.xpath("//div[@id='style_tip_tab']/div/div[2]/div/span/strong")).getText();
						String str1 = Driver.driver.getCurrentUrl();
						System.out.println(str1);
						System.out.println(productid);
						
						if(Driver.driver.findElement(By.xpath(Presentproduct)).isDisplayed() && str1.contains(productid))
							{
									
									Driver.driver.findElement(By.xpath(Presentproduct)).click();
									wlib.ThreadWait();
									wlib.ActionsTask();
									wlib.WaitForPageToLoad();
									Driver.driver.findElement(By.xpath("//div[@id='mainProductImage']/div[5]")).click();
									wlib.ThreadWait();
									Driver.driver.findElement(By.xpath("//div[@id='mainProductImage']/div[4]")).click();
									wlib.ThreadWait();
									List<WebElement> productdetailedicalTAB = Driver.driver.findElements(By.xpath("//div[@id='prddescinfo']/div/ul/li/a"));
									for(int j=0;j<=productdetailedicalTAB.size()-1;j++)
									{
										productdetailedicalTAB.get(j).click();
										wlib.ThreadWait();
									}
									/*
									 * For breadcum verification
									 */
									String breadcrum = Driver.driver.findElement(By.xpath("//div[@id='breadcrumb']/ul")).getText();
									System.out.println(breadcrum);
										List<WebElement> infoLinks = Driver.driver.findElements(By.xpath("//div[@id='morefrom']/ul/li/a"));
										for(int k=0;k<=infoLinks.size()-1;k++)
										{
											List<WebElement> infoLinks1 = Driver.driver.findElements(By.xpath("//div[@id='morefrom']/ul/li/a"));
											infoLinks1.get(k).click();
											wlib.ThreadWait();
											Driver.driver.navigate().back();
										}
										boolean isPresent = Driver.driver.findElements(By.xpath("//a[@id='js_buyTheLook']")).size()>0;
										if(isPresent==true){
											Driver.driver.findElement(By.xpath("//a[@id='js_buyTheLook']")).click();
											wlib.ThreadWait();
											wlib.ActionsTask();
										}else
										{
											String pagesource = Driver.driver.getPageSource();
											System.out.println(pagesource);
										}
										
										boolean sizeGuide = Driver.driver.findElements(By.xpath("//form[@id='addToCartForm']/div/div[2]/div/a")).size()>0;
										if(sizeGuide==true){
											Driver.driver.findElement(By.xpath("//form[@id='addToCartForm']/div/div[2]/div/a/span")).click();
											mhandle.windowsforfooters();
										}
										else
										{
											String pagesource = Driver.driver.getPageSource();
											System.out.println(pagesource);
										}
										productFooter.productFooters();
										Driver.driver.navigate().refresh();
										
							}
						
						}
				}

	}
