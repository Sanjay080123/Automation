package com.koovs.businesslib;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.HomePageFooters;
import com.koovs.projectobjectrepositoryLib.HomePageLinks;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;
import com.koovs.projectobjectrepositoryLib.Login;
import com.koovs.projectobjectrepositoryLib.WomenHeaderSubmenu;


public class HomePageDetailsTexttest   {
		
		Login login = new Login();
		CurrentUrlOfPages currentUrl = new CurrentUrlOfPages();
		HomePageFooters homepagefooters = new HomePageFooters();
		HomePageLinks homepagelinks = new HomePageLinks();
		WomenHeaderSubmenu womenheadersubmenu = new WomenHeaderSubmenu();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		HomePageheadersAndSearch head = new HomePageheadersAndSearch();
		String signoutcurrentuser = "Sign Out";
		String signinanotheruser = "Sign In as another user";
		String womenheader = "WOMEN";
		String menheader = "MEN";
		String stylestories = "STYLE STORIES";
		String koovsxyou = "KOOVSXYOU";
		String title = "Online Shopping in India: Shop Fashion Apparel, Clothes, Dresses for Men & Women";	

	
	public void titleCompare()
	{
		String Exp = Driver.driver.getTitle();
		Assert.assertEquals(title, Exp);
	}
	public void headerscompare(String womentest, String mentest , String koovsxyoutest , String styletest)
	{
		Assert.assertEquals(womenheader, womentest);
		Assert.assertEquals(menheader, mentest);
		Assert.assertEquals(koovsxyou, koovsxyoutest);
		Assert.assertEquals(stylestories, styletest);
		
	}
	public void signoutlinkcompare(WebElement currentusertest, WebElement anotherusertest)
	{
		Assert.assertEquals(signoutcurrentuser, currentusertest);
		Assert.assertEquals(signinanotheruser, anotherusertest);
	}
	
	public void headermenulistcontainslinks() throws InterruptedException
	{
		head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
		wlib.Actions(head.getWomenheader());
		womenheadersubmenu = PageFactory.initElements(Driver.driver, WomenHeaderSubmenu.class);
		womenheadersubmenu.getNewweek().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		womenheadersubmenu.getDressesmastercat().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
//		womenheadersubmenu.getSalecat().click();
//		Driver.driver.navigate().back();
//		wlib.Actions(head.getWomenheader());
		womenheadersubmenu.getWorktag().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		womenheadersubmenu.getPartytag().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		womenheadersubmenu.getKoovsbrand().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		womenheadersubmenu.getPankajandnidhiatkoovs().click();
		Driver.driver.navigate().back();
		wlib.Actions(head.getWomenheader());
		womenheadersubmenu.getShopScarlettJohanssonslook().click();
		login = PageFactory.initElements(Driver.driver, Login.class);
//		if(login.getNewUserPopUp().isDisplayed())
//		{
//			wlib.ActionEsc();
//			
//		}
//		currentUrl.ulrs();
//		
		homepagelinks = PageFactory.initElements(Driver.driver, HomePageLinks.class);
		homepagelinks.getKoovslogo().click();
		Driver.driver.navigate().refresh();
		wlib.ThreadWait();
//		homepagelinks.getWomennavigatetobrandpage().click();
//		Driver.driver.navigate().back();
//		wlib.WaitForPageToLoad();
//		homepagelinks.getMennavigatetobrandpage().click();
//		wlib.WaitForPageToLoad();
//		Driver.driver.navigate().back();
//		homepagelinks.getStylestoriesbannerformen().click();
//		wlib.WaitForPageToLoad();
//		Driver.driver.navigate().back();
//		homepagelinks.getStylestoriesbannerforwomen().click();
//		Driver.driver.navigate().back();
		
		
		
	}
	
	public void blockquotetest(){
		
		/*
		 * For NEED HELP block quote.
		 */
		homepagefooters = PageFactory.initElements(Driver.driver, HomePageFooters.class);
		homepagefooters.getContactusfooter().click();
		Driver.driver.navigate().back();
		homepagefooters.getTrackorder().click();
		Driver.driver.navigate().back();
		homepagefooters.getReturnpolicy().click();
		Driver.driver.navigate().back();
		homepagefooters.getCancelproduct().click();
		Driver.driver.navigate().back();
		homepagefooters.getShippingdetails().click();
		Driver.driver.navigate().back();
		homepagefooters.getQuestions().click();
		Driver.driver.navigate().back();
	/*
	 * For KOOVS.com block quote	
	 */
		homepagefooters.getCareerslink().click();
		Driver.driver.navigate().back();
		homepagefooters.getCorporatesitelink().click();
		Driver.driver.navigate().back();
		
	}
	
	public void capturewebelementsofWomenHeader(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				wlib.Actions(head.getWomenheader());
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//li[@class='women-menu men_women']//div[@class='subMenuList prodBlock']/ul/li"));
				System.out.println(lst.size());
				for(int i=0;i<=lst.size()-1;i++)
				{
					String str =lst.get(i).getText();
					System.out.println(str);
				}
				List<WebElement> lst1 = Driver.driver.findElements(By.xpath("//li[@class='women-menu men_women']//div[@class='subMenuList brandList']/ul/li"));
				System.out.println(lst1.size());
				for(int i=0;i<=lst1.size()-1;i++)
				{
					String str =lst1.get(i).getText();
					System.out.println(str);
				}
				List<WebElement> lst2 = Driver.driver.findElements(By.xpath("//li[@class='women-menu men_women']//div[@class='subMenuList subList']/ul/li"));
				System.out.println(lst2.size());
				for(int i=0;i<=lst2.size()-1;i++)
				{
					String str =lst2.get(i).getText();
					System.out.println(str);
				}
				List<WebElement> lst3 = Driver.driver.findElements(By.xpath("//li[@class='women-menu men_women']//div[@class='flyoutBanner']/ul/li"));
				System.out.println(lst3.size());
				for(int i=0;i<=lst3.size()-1;i++)
				{
					String str =lst3.get(i).getText();
					System.out.println(str);
				}
			}
	
	public void capturewebelementofMenHeader(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				wlib.Actions(head.getMenheader());
				List<WebElement> lst = Driver.driver.findElements(By.xpath("//li[@class='men-menu men_women']//div[@class='subMenuList prodBlock']/ul/li"));
				System.out.println(lst.size());
				for(int i=0;i<=lst.size()-1;i++)
				{
					String str =lst.get(i).getText();
					System.out.println(str);
				}
				List<WebElement> lst1 = Driver.driver.findElements(By.xpath("//li[@class='men-menu men_women']//div[@class='subMenuList brandList']/ul/li"));
				System.out.println(lst1.size());
				for(int i=0;i<=lst1.size()-1;i++)
				{
					String str =lst1.get(i).getText();
					System.out.println(str);
				}
				List<WebElement> lst2 = Driver.driver.findElements(By.xpath("//li[@class='men-menu men_women']//div[@class='subMenuList subList']/ul/li"));
				System.out.println(lst2.size());
				for(int i=0;i<=lst2.size()-1;i++)
				{
					String str =lst2.get(i).getText();
					System.out.println(str);
				}
				List<WebElement> lst3 = Driver.driver.findElements(By.xpath("//li[@class='men-menu men_women']//div[@class='flyoutBanner']/ul/li"));
				System.out.println(lst3.size());
				for(int i=0;i<=lst3.size()-1;i++)
				{
					String str =lst3.get(i).getText();
					System.out.println(str);
				}
			}
		
	public void collaborationlinks(){
				head = PageFactory.initElements(Driver.driver, HomePageheadersAndSearch.class);
				wlib.Actions(head.getWomenheader());
				womenheadersubmenu = PageFactory.initElements(Driver.driver, WomenHeaderSubmenu.class);
				womenheadersubmenu.getPankajandnidhiatkoovs().click();
				Driver.driver.navigate().back();
				wlib.Actions(head.getWomenheader());
				womenheadersubmenu.getGilesatkoovs().click();
				Driver.driver.navigate().back();
				wlib.Actions(head.getWomenheader());
				womenheadersubmenu.getMAWIXKOOVS().click();
				Driver.driver.navigate().back();
				wlib.Actions(head.getWomenheader());
				womenheadersubmenu.getHenryHollandforKOOVS().click();
				Driver.driver.navigate().back();
				
			}
	
	
	
	
}
