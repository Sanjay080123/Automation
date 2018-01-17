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
import com.koovs.businesslib.CheckBoxes;
import com.koovs.businesslib.DynamicBannerHandling;
import com.koovs.businesslib.DynamicMenuListForMen;
import com.koovs.businesslib.DynamicMenuListForWomen;
import com.koovs.businesslib.HomePageDetailsTexttest;
import com.koovs.businesslib.ListPageSlidingBanner;
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
import com.koovs.projectobjectrepositoryLib.MenHeaderSubmenu;
import com.koovs.projectobjectrepositoryLib.ProductDetailPageButtonForCard;
import com.koovs.projectobjectrepositoryLib.SignUp;
import com.koovs.projectobjectrepositoryLib.Signout;
import com.koovs.projectobjectrepositoryLib.SortByPriceMenu;
import com.koovs.projectobjectrepositoryLib.StyleStoriesMenu;
import com.koovs.projectobjectrepositoryLib.TransactionDetails;
import com.koovs.projectobjectrepositoryLib.WomenHeaderSubmenu;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CheckingForMenWomenMenulistWithProductDetailPage {
	
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
	CheckBoxes check;
	SortByPriceMenu sort;
	ListPageSlidingBanner listpage ;
	MenHeaderSubmenu menheadersubmenu;
	EmailSending email;
	
			
	
	
	
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
				 check = new CheckBoxes();
				 sort = new SortByPriceMenu();
				 listpage = new ListPageSlidingBanner();
				 menheadersubmenu = new MenHeaderSubmenu();
				 email = new EmailSending();
				 
				 
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
				sort = PageFactory.initElements(Driver.driver, SortByPriceMenu.class);
				menheadersubmenu = PageFactory.initElements(driver, MenHeaderSubmenu.class);
			}
			
			/*
			 * Login with facebook
			 */
			@Test(priority=1)
			public void scenerio5() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				
				 
					if(login.getNewUserPopUp().isDisplayed())
					{
						wlib.ActionEsc();
						
					}
					login.getLoginLink().click();
					login.getLoginfromfacebook().click();
					mhandle.facebookwindow();
					wlib.WaitForPageToLoad();
					menulistcheckwomen.womenMenuListforShopByProductEditandBrand();
					logger.log(LogStatus.INFO, "Checked for Shop By product and Brand");
					menulistcheckwomen.womenMenuListforShopByProductsecondcoloum();
					logger.log(LogStatus.INFO, "Checked for Shop By product 2nd coloumn");
					menulistcheckmen.menMenuListforShopByProductEditandBrand();
					logger.log(LogStatus.INFO, "Checked for men Shop By product and Brand");
					menulistcheckmen.menMenuListforShopByProductsecondcoloum();
					logger.log(LogStatus.INFO, "Checked for men Shop By product 2nd coloumn");
					logindata.logout();
					wlib.ThreadWait();
					
					
				}
			
			@Test(priority = 2)
			public void checkBoxesPaginationandSliderBannerForWomen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				login.getLoginLink().click();
				logindata.login();
				login.getLoginButton().click();
				wlib.ThreadWait();
				Driver.driver.navigate().refresh();
				wlib.WaitForPageToLoad();
				logger.log(LogStatus.INFO, "Login To the Webpage");
				wlib.Actions(homepageheaders.getWomenheader());
				womenheadersubmenu.getDressesmastercat().click();
				logger.log(LogStatus.INFO, "Navigating to product list page");
				wlib.ThreadWait();
				check.brandCheckBox();
				logger.log(LogStatus.INFO, "Checking for Brand check box");
				wlib.ThreadWait();
				check.colorsCheckBox();
				logger.log(LogStatus.INFO, "Checking for Color check box");
				wlib.ThreadWait();
				check.priceCheckBox();
				logger.log(LogStatus.INFO, "Checking for price check box");
				wlib.ThreadWait();
				sort.getClearFilter().click();
				wlib.WaitForPageToLoad();
				check.sizeCheckBox();
				logger.log(LogStatus.INFO, "Checking for size check box");
				wlib.ThreadWait();
				check.sleevelengthCheckBox();
				logger.log(LogStatus.INFO, "Checking for sleeve check box");
				wlib.ThreadWait();
				check.dressLengthCheckBox();
				logger.log(LogStatus.INFO, "Checking for dresss length check box");
				wlib.ThreadWait();
				check.occasionCheckBox();
				logger.log(LogStatus.INFO, "Checking for occasion check box");
				wlib.ThreadWait();
				check.OnlyCheckFilterAndClearFilter();
				logger.log(LogStatus.INFO, "Checking for clear filter button");
				wlib.ThreadWait();
				wlib.scrollDownToElement(sort.getShowMoreProductInListPage());
				logger.log(LogStatus.INFO, "Checking for show me more");
				sort.getShowMoreProductInListPage().click();
				wlib.ThreadWait();
				sort.getGotoTopButton().click();
				logger.log(LogStatus.INFO, "Checking for Bottom to top");
				wlib.ThreadWait();
				homepagelinks.getKoovslogo().click();
				logger.log(LogStatus.INFO, "Checking for Koovs logo");
				wlib.ThreadWait();
//				listpage.CheckingOfSlidingBannerWomen();
//				logger.log(LogStatus.INFO, "Checking for sliding banner of Landing page");
				homepagelinks.getKoovslogo().click();
				logger.log(LogStatus.INFO, "Navigating to home page");
				
				
				
			}
			
			@Test(priority = 3)
			public void checkBoxesPaginationandSliderBannerForMen() throws InterruptedException
			{
				wlib.Actions(homepageheaders.getMenheader());
				menheadersubmenu.getShirtsCat().click();
				wlib.WaitForPageToLoad();
				check.brandCheckBox();
				logger.log(LogStatus.INFO, "Checking for Brand check box");
				wlib.ThreadWait();
				check.colorsCheckBox();
				logger.log(LogStatus.INFO, "Checking for color check box");
				wlib.ThreadWait();
				check.priceCheckBox();
				sort.getClearFilter().click();
				logger.log(LogStatus.INFO, "Checking for price check box");
				wlib.ThreadWait();
				check.sizeCheckBox();
				logger.log(LogStatus.INFO, "Checking for size check box");
				wlib.ThreadWait();
				check.sleevelengthCheckBox();
				logger.log(LogStatus.INFO, "Checking for sleeve check box");
				wlib.ThreadWait();
				check.OnlyCheckFilterAndClearFilter();
				logger.log(LogStatus.INFO, "Checking for clear filter");
				wlib.ThreadWait();
				wlib.scrollDownToElement(sort.getShowMoreProductInListPage());
				sort.getShowMoreProductInListPage().click();
				logger.log(LogStatus.INFO, "Checking for show me more");
				wlib.ThreadWait();
				sort.getGotoTopButton().click();
				logger.log(LogStatus.INFO, "Checking for Bottom to top");
				wlib.ThreadWait();
				homepagelinks.getKoovslogo().click();
				wlib.WaitForPageToLoad();
//				listpage.CheckingOfSlidingBannerMen();
//				logger.log(LogStatus.INFO, "Checking for sliding banner of Landing page");
				homepagelinks.getKoovslogo().click();
				logger.log(LogStatus.INFO, "Checking for Koovs logo");
				wlib.ThreadWait();
				logindata.logout();
				logger.log(LogStatus.INFO, "Successfull log out");
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
			
			@AfterTest
			public void ReportSend(){
				email.ReportSending();
			}
	}

