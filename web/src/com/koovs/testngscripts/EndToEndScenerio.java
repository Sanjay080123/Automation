package com.koovs.testngscripts;
			
import java.io.IOException;
			










import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
import com.koovs.businesslib.OrderSuccessSocialFooter;
import com.koovs.businesslib.PaymentFromCards;
import com.koovs.businesslib.ProductDetailPage;
import com.koovs.businesslib.ProductSelectionForCheckOut;
import com.koovs.businesslib.ScreenShot;
import com.koovs.businesslib.SignUpDetails;
import com.koovs.businesslib.WishListProductsToCart;
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
			
			public class EndToEndScenerio {
				
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
				WishListProductsToCart wish;
				OrderSuccessSocialFooter ordersuccessFooter;
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
			 newhomepage = new NewHomePage();
			 accountDetails = new MyAccountDetails();
			 wish = new WishListProductsToCart();
			 ordersuccessFooter = new OrderSuccessSocialFooter();
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
			
			@Test
			public void EndToEndScenrio() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				if(login.getNewUserPopUp().isDisplayed())
				{
					wlib.ActionEsc();
					
				}
				login.getLoginLink().click();
				logger.log(LogStatus.PASS, "login link is working fine");
				logindata.login();
				login.getLoginButton().click();
				logger.log(LogStatus.INFO, "login to the webpage");
				wlib.ThreadWait();
				wlib.Actions(homepageheaders.getWomenheader());
				logger.log(LogStatus.INFO, "Hover operation for Women header");
				wlib.ThreadWait();
				womenheadersubmenu.getJumpsuitscat().click();
				logger.log(LogStatus.INFO, "Clicking on Dresses master Category is working fine");
				String title = Driver.driver.getTitle();
				System.out.println(title);
				Driver.driver.findElement(By.xpath("//div[@id='product_search_content']/div[1]/div[1]/a/img[2]")).click();
				wlib.ThreadWait();
				logger.log(LogStatus.INFO, "Navigating to the product detail page");
				productDetail.productDetails();
				logger.log(LogStatus.INFO, "Product detail page is working fine");
				wlib.selectSizeDropDown();
				productdetailaddbutton.getAddToBagButton().click();
				wlib.ThreadWait();
				logger.log(LogStatus.INFO, "Add to bag button is working fine");
				String itemnumber = bagforCheckOut.getBagiconwithTotalItems().getText();
				System.out.println(itemnumber);
				bagforCheckOut.getBagicon().click();
				logger.log(LogStatus.INFO, "Bag icon is clickable");
				wlib.WaitForPageToLoad();
				cartdetail.cartIncrementDetails();
				logger.log(LogStatus.INFO, "Product increment is working");
				wlib.ThreadWait();
				Driver.driver.navigate().refresh();
				wlib.ThreadWait();
				cartdetail.cartDecrementDetails();
				logger.log(LogStatus.INFO, "Product decrement is working fine");
				Driver.driver.navigate().refresh();
				wlib.ThreadWait();
				wlib.Actions(driver.findElement(By.xpath("//table[@class='cart-data-table']/tbody/tr/td[2]/div/div[2]/div[@class='cartprodSize']")));
				wlib.selectSizeDropDownFromCart();
				logger.log(LogStatus.INFO, "Size change is working fine");
				wlib.WaitForPageToLoad();
				bagforCheckOut.getAddMoreFromWishList().click();
				logger.log(LogStatus.INFO, "navigating to the wishlist items");
				wish.wishlistProducts();
				logger.log(LogStatus.INFO, "Wishlist addition of Product and continue shopping and image clicking is working fine");
				String BeforeReduction = bagforCheckOut.getTotalamountInCart().getText();
				logger.log(LogStatus.INFO, "Price before using Coupon code");
				System.out.println(BeforeReduction);
				promocode.getPromocodeButton().click();
				logger.log(LogStatus.INFO, "Promo code button is working fine");
				wlib.WaitForPageToLoad();
				sdetail.promoCode();
				wlib.Action();
				wlib.ThreadWait();
				String afterReduction = bagforCheckOut.getTotalamountInCart().getText();
				logger.log(LogStatus.INFO, "Checking for Total amount after appyling promo code");
				System.out.println(afterReduction);
				if(BeforeReduction.equals(afterReduction))
				{
					System.out.println("promocodefails");
					logger.log(LogStatus.PASS, "Amount check");
				}
				else{
					bagforCheckOut.getCheckoutbutton().click();
					logger.log(LogStatus.INFO, "Checkout button is working fine");
					newaddress.getAddNewAddress().click();
					logger.log(LogStatus.INFO, "New address button is working fine");
					sdetail.billingadd();
					logger.log(LogStatus.INFO, "Filling of New billing details");
					wlib.ThreadWait();
					newaddress.getSaveButtonForNewAddress().click();
					logger.log(LogStatus.INFO, "Save button for new address is working fine");
				}
				logger.log(LogStatus.INFO, "Checking for COD");
				transDetails.getCODpayment().click();
				transDetails.getClickButtonForExistPhone().click();
				wlib.WaitForPageToLoad();
				transDetails.getConfirmYourOrder().click();
				logger.log(LogStatus.INFO, "Checked and its working fine");
				wlib.ThreadWait();
				logger.log(LogStatus.INFO, "social footer handle");
				ordersuccessFooter.orderSuccessSocialFooter();
				logger.log(LogStatus.INFO, "Hover to Myaccount details");
				wlib.Actions(accountDetails.getMyAccountText());
				wlib.ThreadWait();
				accountDetails.getGotoaccountlink().click();
				logger.log(LogStatus.INFO, "Into My Account page");
				wlib.ThreadWait();
				accountDetails.getRecentOrderLinkAfterOrder().click();
				logger.log(LogStatus.INFO, "Recent orders link is working fine");
				wlib.ThreadWait();
				accountDetails.getRecentOrderViewDetails().click();
				logger.log(LogStatus.INFO, "Navigating to recent orders page");
				wlib.ThreadWait();
				accountDetails.getChangeAddress().click();
				wlib.ThreadWait();
				logger.log(LogStatus.INFO, "Checking for address change");
				accountDetails.getChangeAddressCancel().click();
				wlib.ThreadWait();
				wlib.scrollToThePageEnd();
				logger.log(LogStatus.INFO, "Change order is working fine");
				accountDetails.getCancelRecentOrder().click();
				logger.log(LogStatus.INFO, "Cancel button is working fine");
				wlib.ThreadWait();
				accountDetails.getTextAreaforReason().sendKeys("Not up to limit");
				logger.log(LogStatus.INFO, "reason text is working fine");
				wlib.ThreadWait();
				accountDetails.getCancelOrderButton().click();
				logger.log(LogStatus.INFO, "After reason cancel button is working fine");
				wlib.ThreadWait();
				Alert alert = driver.switchTo().alert();
				alert.accept();
				logger.log(LogStatus.INFO, "Confirmation alert pop up handled");
				wlib.ThreadWait();
				homepagelinks.getKoovslogo().click();
				logger.log(LogStatus.INFO, "Navigating to the home page");
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
			
			@AfterTest
			public void ReportSend(){
				email.ReportSending();
			}
			
	}
