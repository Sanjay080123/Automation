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
import org.testng.annotations.AfterTest;
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
import com.koovs.genericLib.Constants;
import com.koovs.genericLib.Driver;
import com.koovs.genericLib.EmailSending;
import com.koovs.genericLib.ExcelLib;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.AddressDetailsForMyAccount;
import com.koovs.projectobjectrepositoryLib.BagToCheckOutDetails;
import com.koovs.projectobjectrepositoryLib.CouponsAndPromoCode;
import com.koovs.projectobjectrepositoryLib.HomePageFooters;
import com.koovs.projectobjectrepositoryLib.HomePageLinks;
import com.koovs.projectobjectrepositoryLib.HomePageheadersAndSearch;
import com.koovs.projectobjectrepositoryLib.Login;
import com.koovs.projectobjectrepositoryLib.MyAccountDetails;
import com.koovs.projectobjectrepositoryLib.NewHomePage;
import com.koovs.projectobjectrepositoryLib.ProductDetailPageButtonForCard;
import com.koovs.projectobjectrepositoryLib.SignUp;
import com.koovs.projectobjectrepositoryLib.Signout;
import com.koovs.projectobjectrepositoryLib.StyleStoriesMenu;
import com.koovs.projectobjectrepositoryLib.TransactionDetails;
import com.koovs.projectobjectrepositoryLib.WomenHeaderSubmenu;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


/**
 * 
 * @author Automation
 *
 */

public class HomePageTestScenerios {
	
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
			NewHomePage newhomepage;
			MyAccountDetails accountDetails;
			EmailSending email ;
			
		
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
		 newhomepage = new NewHomePage();
		 accountDetails = new MyAccountDetails();
		 email = new EmailSending();
		 
	}
	
	@BeforeMethod
	public void Config() throws EncryptedDocumentException, InvalidFormatException, IOException{

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
		newhomepage = PageFactory.initElements(driver, NewHomePage.class);
		accountDetails = PageFactory.initElements(driver, MyAccountDetails.class);
		
	}
	
	@Test(priority=1)
	public void Scenerio1() throws InvalidFormatException, IOException, InterruptedException{
		wlib.WaitForPageToLoad();
		if(login.getNewUserPopUp().isDisplayed())
		{
			wlib.ActionEsc();
			
		}
		login.getLoginLink().click();
		logindata.login();
		logger.log(LogStatus.PASS, "login link is working fine");
		wlib.WaitForPageToLoad();
		login.getLoginButton().click();
		wlib.ThreadWait();
		Driver.driver.navigate().refresh();
		wlib.WaitForPageToLoad();
		logger.log(LogStatus.INFO, "Login To the Webpage");
		homepagedetails.titleCompare();
		logger.log(LogStatus.PASS, "Title compare");
		wlib.WaitForPageToLoad();
		homepagedetails.headerscompare("WOMEN", "MEN", "KOOVSXYOU", "STYLE STORIES");
		logger.log(LogStatus.PASS, "Headers comapre");
		wlib.WaitForPageToLoad();
		homepageheaders.getWomenheader().click();
		logger.log(LogStatus.INFO, "Navigate to the women landing page");
		homepageheaders.getMenheader().click();
		logger.log(LogStatus.INFO, "Navigate to the men landing page");
		homepageheaders.getKoovsxyou().click();
		logger.log(LogStatus.INFO, "Navigate to the KoovsXyou landing page");
		wlib.WaitForPageToLoad();
		homepageheaders.getStyleheader().click();
		logger.log(LogStatus.INFO, "Navigate to the style stories landing page");
		wlib.WaitForPageToLoad();
		homepageheaders.getSearchbox().sendKeys("denim shirts");
		logger.log(LogStatus.INFO, "search function working fine");
		wlib.Action();
		wlib.WaitForPageToLoad();
		logindata.logout();
		logger.log(LogStatus.INFO, "successfully logged out");
		wlib.ThreadWait();
		
				
	}
	
	@Test(priority=2)
	public void newHomePageTest() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
//		wlib.WaitForPageToLoad();
//		if(login.getNewUserPopUp().isDisplayed())
//		{
//			wlib.ActionEsc();
//			
//		}
		login.getLoginLink().click();
		logindata.login();
		logger.log(LogStatus.PASS, "login link is working fine");
		wlib.WaitForPageToLoad();
		login.getLoginButton().click();
		wlib.ThreadWait();
		Driver.driver.navigate().refresh();
		wlib.WaitForPageToLoad();
		homepagelinks.getKoovslogo().click();
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "Login To the Webpage");
		newhomepage.getKoovsbrandWomen().click();
		wlib.WaitForPageToLoad();
		logger.log(LogStatus.INFO, "Banner sale page is working fine for Women");
		Driver.driver.navigate().back();
		newhomepage.getKoovsbrandMen().click();
		logger.log(LogStatus.INFO, "Banner sale page is working fine for Men");
		wlib.WaitForPageToLoad();
		Driver.driver.navigate().back();
		newhomepage.getBrandEditWomen().click();
		logger.log(LogStatus.INFO, "Banner Under 999 sale page is working fine for Women");
		wlib.WaitForPageToLoad();
		Driver.driver.navigate().back();
		newhomepage.getBrandEditMen().click();
		logger.log(LogStatus.INFO, "Banner Under 999 sale page is working fine for Men");
		wlib.WaitForPageToLoad();
		Driver.driver.navigate().back();
		newhomepage.getStyleStoriesShowMeMore().click();
		logger.log(LogStatus.INFO, "Banner brand sale page is working fine for Women");
		wlib.WaitForPageToLoad();
		Driver.driver.navigate().back();
		newhomepage.getKOOVSXYOUshowMeMore().click();
		logger.log(LogStatus.INFO, "Banner brand sale page is working fine for Men");
		wlib.WaitForPageToLoad();
		Driver.driver.navigate().back();
		newhomepage.getCelebrityStyleWomen().click();
		logger.log(LogStatus.INFO, "Banner trending sale page is working fine for Women");
		wlib.WaitForPageToLoad();
		Driver.driver.navigate().back();
		newhomepage.getCelebrityStyleMen().click();
		logger.log(LogStatus.INFO, "Banner trending sale page is working fine for Men");
		wlib.WaitForPageToLoad();
		Driver.driver.navigate().back();
		wlib.ThreadWait();
		logindata.logout();
		logger.log(LogStatus.INFO, "successfully logged out");
		wlib.ThreadWait();
		
		
		
	}
	
	@Test(priority=3)
	public void Scenerio2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
//		if(login.getNewUserPopUp().isDisplayed())
//		{
//			wlib.ActionEsc();
//			
//		}
		login.getLoginLink().click();
		logindata.login();
		logger.log(LogStatus.PASS, "login link is working fine");
		login.getLoginButton().click();
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "Login To the Webpage");
		Driver.driver.navigate().refresh();
		wlib.WaitForPageToLoad();
		homepagefooters.getFacebookfooter().click();
		logger.log(LogStatus.PASS, "Facebook social footer is working fine");
		mhandle.windowsforfooters();
		wlib.WaitForPageToLoad();
		homepagefooters.getTwitterfooter().click();
		logger.log(LogStatus.PASS, "twitter social footer is working fine");
		mhandle.windowsforfooters();
		wlib.WaitForPageToLoad();
		homepagefooters.getGoogleplusfooter().click();
		logger.log(LogStatus.PASS, "Googleplus social footer is working fine");
		mhandle.windowsforfooters();
		wlib.WaitForPageToLoad();
		homepagefooters.getInstagramfooter().click();
		logger.log(LogStatus.PASS, "Insta social footer is working fine");
		mhandle.windowsforfooters();
		wlib.WaitForPageToLoad();
		homepagefooters.getYoutubefooter().click();
		logger.log(LogStatus.PASS, "YouTube social footer is working fine");
		mhandle.windowsforfooters();
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "All social footers checked");
		homepagedetails.headermenulistcontainslinks();
		logger.log(LogStatus.INFO, "MenuLinks Checked");
		wlib.ThreadWait();
		logindata.logout();
		logger.log(LogStatus.INFO, "successfully logged out");
		wlib.ThreadWait();
		
	}
	
	@Test(priority=4)
	public void Scenerio3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
//		if(login.getNewUserPopUp().isDisplayed())
//		{
//			wlib.ActionEsc();
//			
//		}
		login.getLoginLink().click();
		logindata.login();
		logger.log(LogStatus.PASS, "login link is working fine");
		login.getLoginButton().click();
		wlib.ThreadWait();
		Driver.driver.navigate().refresh();
		wlib.WaitForPageToLoad();
		logger.log(LogStatus.INFO, "Login To the Webpage");
		logger.log(LogStatus.INFO, "Checking for NEED HELP block quote");
		homepagedetails.blockquotetest();
		wlib.ThreadWait();
		
		
		
	}

	@Test(priority=5)
	public void Scenerio4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		homepagedetails.capturewebelementsofWomenHeader();
		wlib.WaitForPageToLoad();
		logger.log(LogStatus.INFO, "Captured MenuList of Women header");
		homepagedetails.capturewebelementofMenHeader();
		wlib.WaitForPageToLoad();
		logger.log(LogStatus.INFO, "Captured MenuList of men header");
		homepagedetails.collaborationlinks();
		wlib.WaitForPageToLoad();
		logger.log(LogStatus.INFO, "Checked links for Collaboration");
		dynamicbanner.dynamicbanner();
		logger.log(LogStatus.PASS, "Checked for Dynamic banner sliding");
		logindata.logout();
		logger.log(LogStatus.INFO, "successfully logged out");
		wlib.ThreadWait();
		
		
		
	}
	
	@Test(priority=6)
	public void CheckingForMyAccountDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
//		if(login.getNewUserPopUp().isDisplayed())
//		{
//			wlib.ActionEsc();
//			
//		}
		login.getLoginLink().click();
		logger.log(LogStatus.PASS, "login link is working fine");
		logindata.login();
		login.getLoginButton().click();
		logger.log(LogStatus.INFO, "login to the webpage");
		wlib.ThreadWait();
		driver.navigate().refresh();
		logger.log(LogStatus.INFO, "Hover to Myaccount details");
		wlib.Actions(accountDetails.getMyAccountText());
		wlib.ThreadWait();
		accountDetails.getGotoaccountlink().click();
		logger.log(LogStatus.INFO, "Into My Account page");
		wlib.WaitForPageToLoad();
		accountDetails.getProfiledetailslink().click();
		logger.log(LogStatus.INFO, "Profile detail link is working fine");
		wlib.WaitForPageToLoad();
		accountDetails.getAddressdetailslink().click();
		logger.log(LogStatus.INFO, "Addresses link is working fine");
		wlib.WaitForPageToLoad();
		accountDetails.getRecentorderslink().click();
		logger.log(LogStatus.INFO, "Recent orders link is working fine");
		wlib.ThreadWait();
		accountDetails.getCouponMyAccountLeftMenu().click();
		logger.log(LogStatus.INFO, "Coupon link is working fine");
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "Navigating to the Home page");
		homepagelinks.getKoovslogo().click();
		logindata.logout();
		logger.log(LogStatus.INFO, "successfully logged out");
		wlib.ThreadWait();
		
		
	}
	
	@Test(priority=7)
	public void TrackOrderWishlistandCart() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		logger.log(LogStatus.INFO, "navigating to home page without Login");
		wlib.ActionEsc();
		wlib.WaitForPageToLoad();
		homepageheaders.getTrackOrderNotLogin().click();
		logger.log(LogStatus.INFO, "Without login Track order link is working fine");
		wlib.WaitForPageToLoad();
		wlib.ActionEsc();
		sdetail.TrackId();
		logger.log(LogStatus.INFO, "Track id text box and email Id text is working fine");
		wlib.ThreadWait();
		homepagelinks.getKoovslogo().click();
		logger.log(LogStatus.INFO, "KOOVS logo is working fine");
		login.getLoginLink().click();
		logger.log(LogStatus.PASS, "login link is working fine");
		logindata.login();
		login.getLoginButton().click();
		logger.log(LogStatus.INFO, "login to the webpage");
		wlib.ThreadWait();
		driver.navigate().refresh();
		logger.log(LogStatus.INFO, "Page refresh");
		homepagelinks.getBagicon().click();
		logger.log(LogStatus.INFO, "Home page Bag icon is working fine");
		wlib.ThreadWait();
		Driver.driver.navigate().back();
		wlib.WaitForPageToLoad();
		homepagelinks.getWishlistIcon().click();
		logger.log(LogStatus.INFO, "WishList icon is working fine");
		Driver.driver.navigate().back();
		wlib.ThreadWait();
		logindata.logout();
		logger.log(LogStatus.INFO, "successfully logged out and Logout link is working fine");
		wlib.ThreadWait();
		
		
		
	}
	
	@Test(priority=8)
	public void checkOutAddressPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
//		if(login.getNewUserPopUp().isDisplayed())
//		{
//			wlib.ActionEsc();
//			
//		}
		login.getLoginLink().click();
		logger.log(LogStatus.PASS, "login link is working fine");
		logindata.login();
		login.getLoginButton().click();
		logger.log(LogStatus.INFO, "login to the webpage");
		wlib.ThreadWait();
		driver.navigate().refresh();
		homepagelinks.getBagicon().click();
		logger.log(LogStatus.INFO, "Home page Bag icon is working fine");
		wlib.ThreadWait();
		bagforCheckOut.getCheckoutbutton().click();
		logger.log(LogStatus.INFO, "CheckOut button is working fine");
		wlib.ThreadWait();
		newaddress.getEditExistingAddress().click();
		logger.log(LogStatus.INFO, "Edit Address Button is working fine");
		wlib.ThreadWait();
		newaddress.getCancelExcitingaddress().click();
		logger.log(LogStatus.INFO, "Cancel of Address Edit is working fine");
		wlib.ThreadWait();
		newaddress.getEditExistingAddress().click();
		wlib.ThreadWait();
		newaddress.getCheckBoxForShipToDifferentAddress().click();
		logger.log(LogStatus.INFO, "Ship to Different Address checkBox is working fine");
		wlib.WaitForPageToLoad();
		newaddress.getCheckBoxForShipToThisAddress().click();
		logger.log(LogStatus.INFO, "Ship to save Address checkBox is working fine");
		wlib.WaitForPageToLoad();
		newaddress.getSaveButtonForNewAddress().click();
		logger.log(LogStatus.INFO, "Save address is working fine");
		wlib.ThreadWait();
		Driver.driver.navigate().back();
		newaddress.getAddNewAddress().click();
		logger.log(LogStatus.INFO, "Add new Button is working fine");
		wlib.ThreadWait();
		newaddress.getCancelExcitingaddress().click();
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "Cancel Exciting address is working fine");
		newaddress.getEditaddressRightSide().click();
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "Edit existing Address is working fine");
		newaddress.getCancelExcitingaddress().click();
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "Cancel existing Address is working fine");
		newaddress.getEditOrdersummeryRightSide().click();
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "Edit link from right side is working fine");
		bagforCheckOut.getCheckoutbutton().click();
		wlib.ThreadWait();
		bagforCheckOut.getPaymentcheckout().click();
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "CheckOut button to payment page is working fine");
		homepagelinks.getCheckoutKoovsLogo().click();
		wlib.ThreadWait();
		logger.log(LogStatus.INFO, "Koovs Logo is working fine");
		logindata.logout();
		logger.log(LogStatus.INFO, "successfully logged out");
		wlib.ThreadWait();
		
	}
	
	@Test(priority=9)
	public void KoovSXYOUCheck() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
//		if(login.getNewUserPopUp().isDisplayed())
//		{
//			wlib.ActionEsc();
//			
//		}
		login.getLoginLink().click();
		logger.log(LogStatus.PASS, "login link is working fine");
		logindata.login();
		login.getLoginButton().click();
		logger.log(LogStatus.INFO, "login to the webpage");
		wlib.ThreadWait();
		driver.navigate().refresh();
		homepageheaders.getKoovsxyou().click();
		logger.log(LogStatus.INFO, "Navigating to KoovsXYOU ");
		wlib.WaitForPageToLoad();
		homepageheaders.getKOOVSXYOUkoovsfashion().click();
		logger.log(LogStatus.INFO, "Navigating to KoovsXyou Koovsfashion Insta");
		mhandle.windowsforfooters();
		homepageheaders.getKOOVSXYOUkoovsMan().click();
		logger.log(LogStatus.INFO, "Navigating to KoovsXyou Koovs Man Insta");
		mhandle.windowsforfooters();
		wlib.scrollDownToElement(homepageheaders.getLoadMoreKoovsXyou());
		homepageheaders.getLoadMoreKoovsXyou().click();
		logger.log(LogStatus.INFO, "KOOVS XYOU load more is working fine");
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
	
	@AfterTest
	public void ReportSend(){
		email.ReportSending();
	}
	

}
