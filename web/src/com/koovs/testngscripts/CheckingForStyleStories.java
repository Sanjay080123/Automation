package com.koovs.testngscripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.koovs.businesslib.CartDetails;
import com.koovs.businesslib.DynamicBannerHandling;
import com.koovs.businesslib.DynamicMenuListForMen;
import com.koovs.businesslib.DynamicMenuListForWomen;
import com.koovs.businesslib.HomePageDetailsTexttest;
import com.koovs.businesslib.LoginData;
import com.koovs.businesslib.MasterCategoryClicks;
import com.koovs.businesslib.MultipleWindowHandles;
import com.koovs.businesslib.PaymentFromCards;
import com.koovs.businesslib.ProductDetailPage;
import com.koovs.businesslib.ProductSelectionForCheckOut;
import com.koovs.businesslib.ScreenShot;
import com.koovs.businesslib.SignUpDetails;
import com.koovs.businesslib.WomenStyleStoriesPagesLink;
import com.koovs.genericLib.Constants;
import com.koovs.genericLib.Driver;
import com.koovs.genericLib.ExcelLib;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.AddressDetailsForMyAccount;
import com.koovs.projectobjectrepositoryLib.BagToCheckOutDetails;
import com.koovs.projectobjectrepositoryLib.CouponsAndPromoCode;
import com.koovs.projectobjectrepositoryLib.HomePageFooters;
import com.koovs.projectobjectrepositoryLib.HomePageLinks;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;
import com.koovs.projectobjectrepositoryLib.Login;
import com.koovs.projectobjectrepositoryLib.ProductDetailPageButtonForCard;
import com.koovs.projectobjectrepositoryLib.SignUp;
import com.koovs.projectobjectrepositoryLib.Signout;
import com.koovs.projectobjectrepositoryLib.StyleStoriesMenu;
import com.koovs.projectobjectrepositoryLib.TransactionDetails;
import com.koovs.projectobjectrepositoryLib.WomenHeaderSubmenu;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CheckingForStyleStories {
	
	ExtentReports report;
	ExtentTest logger;
	WebDriverCommonLib wlib; 
	ExcelLib lib ;
	WebDriver driver; 
	boolean flag ;
	Logger log ;
	SignUp signup ;
	Signout logout;
	TransactionDetails tdetail;
	SignUpDetails sdetail;
	Login login;
	HomePageDetailsTexttest homepagedetails;
	HomePageheadersAndSearch homepageheaders;
	LoginData logindata;
	MultipleWindowHandles mhandle;
	HomePageFooters homepagefooters;
	HomePageLinks homepagelinks;
	MasterCategoryClicks mastercatcheck;
	WomenHeaderSubmenu womenheadersubmenu;
	DynamicBannerHandling dynamicbanner;
	ProductSelectionForCheckOut productselect;
	DynamicMenuListForWomen menulistcheckwomen;
	DynamicMenuListForMen menulistcheckmen;
	ProductDetailPageButtonForCard productdetailaddbutton;
	BagToCheckOutDetails bagforCheckOut;
	CouponsAndPromoCode promocode;
	AddressDetailsForMyAccount newaddress;
	StyleStoriesMenu styleStories;
	ProductDetailPage productDetail;
	CartDetails cartdetail;
	TransactionDetails transDetails;
	PaymentFromCards payment;
	WomenStyleStoriesPagesLink womenStyleStories;
	
	
			
	
	
	
			@BeforeClass
			public void OneTimeConfig(){
				
				 report = new ExtentReports("D:\\koovs-automation\\web\\TestReport.html");
				 tdetail = new TransactionDetails(); 
				 wlib = new WebDriverCommonLib();
				 lib = new ExcelLib();
				 driver = Driver.getDriver();
				 flag = false;
				 sdetail = new SignUpDetails();
				 login = new Login();
				 homepagedetails = new HomePageDetailsTexttest();
				 homepageheaders = new HomePageheadersAndSearch();
				 logindata = new LoginData();
				 mhandle = new MultipleWindowHandles();
				 homepagefooters = new HomePageFooters();
				 homepagelinks = new HomePageLinks();
				 mastercatcheck = new MasterCategoryClicks();
				 dynamicbanner = new DynamicBannerHandling();
				 productselect = new ProductSelectionForCheckOut();
				 menulistcheckwomen = new DynamicMenuListForWomen();
				 menulistcheckmen = new DynamicMenuListForMen();
				 productdetailaddbutton = new ProductDetailPageButtonForCard();
				 bagforCheckOut = new BagToCheckOutDetails();
				 promocode			= new CouponsAndPromoCode();
				 newaddress = new AddressDetailsForMyAccount();
				 womenheadersubmenu = new WomenHeaderSubmenu();
				 styleStories = new StyleStoriesMenu();
				 productDetail = new ProductDetailPage();
				 cartdetail = new CartDetails();
				 transDetails = new TransactionDetails();
				 payment = new PaymentFromCards();
				 womenStyleStories = new WomenStyleStoriesPagesLink();
				 
			}
	
	
	
			@BeforeMethod
			public void config()
			{
				
				logger = report.startTest("Regression");
				driver.get(Constants.url);
				logger.log(LogStatus.INFO, "Browser started");
				driver.manage().window().maximize();
				login = PageFactory.initElements(driver, Login.class);
				signup = PageFactory.initElements(driver, SignUp.class);
				tdetail = PageFactory.initElements(driver, TransactionDetails.class);
				homepageheaders = PageFactory.initElements(driver, HomePageheadersAndSearch.class);
				homepagefooters = PageFactory.initElements(driver, HomePageFooters.class);
				homepagelinks = PageFactory.initElements(driver, HomePageLinks.class);
				productdetailaddbutton = PageFactory.initElements(driver, ProductDetailPageButtonForCard.class);
				bagforCheckOut = PageFactory.initElements(driver, BagToCheckOutDetails.class);
				promocode = PageFactory.initElements(driver, CouponsAndPromoCode.class);
				newaddress = PageFactory.initElements(driver, AddressDetailsForMyAccount.class);
				womenheadersubmenu = PageFactory.initElements(driver, WomenHeaderSubmenu.class);
				styleStories = PageFactory.initElements(driver, StyleStoriesMenu.class);
				transDetails = PageFactory.initElements(driver, TransactionDetails.class);
			}
			
			@Test
			public void CheckingStyleStories() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				if(login.getNewUserPopUp().isDisplayed())
				{
					wlib.ActionEsc();
					
				}
				login.getLoginLink().click();
				logindata.login();
				login.getLoginButton().click();
				wlib.ThreadWait();
			homepageheaders.getStyleheader().click();
			String title = driver.getTitle();
			System.out.println(title);
			logger.log(LogStatus.INFO, "Into style stories");
			styleStories.getAllMenu().click();
			wlib.scrollDownToElement(styleStories.getStyleStoriesHomePageShowMeMore());
			wlib.WaitForPageToLoad();
			styleStories.getWomenMenuStyleStories().click();
			wlib.ThreadWait();
			wlib.scrollDownToElement(styleStories.getSHOWmeMORWelement());
			wlib.ThreadWait();
			logger.log(LogStatus.INFO, "Cursor move till show me more");
			styleStories.getSHOWmeMORWelement().click();
			wlib.ThreadWait();
			logger.log(LogStatus.INFO, "Show me more is working fine");
			styleStories.getStyleSpyDataFilter().click();
			wlib.ThreadWait();
			wlib.Actions(styleStories.getStyleSpyimage());
			styleStories.getReadmoreSTYLEspy().click();
			womenStyleStories.womenStyleSpyDetailsPageLinks();
			wlib.WaitForPageToLoad();
			driver.navigate().back();
			styleStories.getTrendsDataFilter().click();
			wlib.ThreadWait();
			wlib.Actions(styleStories.getTrendsImage());
			styleStories.getReadmoreTrends().click();
			wlib.ThreadWait();
			styleStories.getTheHotListFilter().click();
			wlib.ThreadWait();
			wlib.Actions(styleStories.getHOTLISTImage());
			wlib.ThreadWait();
			styleStories.getReadmoreHotList().click();
			wlib.WaitForPageToLoad();
			womenStyleStories.theHotList();
			wlib.WaitForPageToLoad();
			styleStories.getHowToWearDataFilter().click();
			wlib.ThreadWait();
			wlib.Actions(styleStories.getHowToWearImage());
			wlib.ThreadWait();
			styleStories.getReadmoreHotToWear().click();
			wlib.ThreadWait();
			womenStyleStories.howToWear();
			wlib.ThreadWait();
			logindata.logout();
			logger.log(LogStatus.INFO, "successfully logged out");
			wlib.ThreadWait();
			
			}
			
			
			@AfterMethod
			public void aftertest(ITestResult result){
				if(ITestResult.FAILURE==result.getStatus())
				{
					String screenShot_Path = ScreenShot.captureScreenShot(Driver.driver, result.getName());
					String image = logger.addScreenCapture(screenShot_Path);
					logger.log(LogStatus.FAIL, "Headers", image);
				}
				report.endTest(logger);
				report.flush();
			}
			
			@AfterClass
			public void browserEnd()
			{
				driver.close();
			}
		


}
