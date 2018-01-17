package com.koovs.businesslib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.ExcelLib;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.AddressDetailsForMyAccount;
import com.koovs.projectobjectrepositoryLib.CouponsAndPromoCode;
import com.koovs.projectobjectrepositoryLib.NoTLogginOrderIDemaiL;
import com.koovs.projectobjectrepositoryLib.SignUp;


public class SignUpDetails extends SignUp {
		 SignUp signup = new SignUp();
		 ExcelLib lib = new ExcelLib();  
		 AddressDetailsForMyAccount add = new AddressDetailsForMyAccount();
		 CouponsAndPromoCode code = new CouponsAndPromoCode();
		 NoTLogginOrderIDemaiL notlogin = new NoTLogginOrderIDemaiL();
		 WebDriverCommonLib wlib = new WebDriverCommonLib();
		 
	
		/**
		 * 
		 * @throws EncryptedDocumentException
		 * @throws InvalidFormatException
		 * @throws IOException
		 */
		
	public void signup() throws EncryptedDocumentException, InvalidFormatException, IOException{	
		    signup = PageFactory.initElements(Driver.driver, SignUp.class);
			signup.getName().sendKeys(lib.GetExcelData("SignUp Details", 2, 1));
			signup.getEmailid().sendKeys(lib.GetExcelData("SignUp Details", 2, 3));
			signup.getPassword().sendKeys(lib.GetExcelData("SignUp Details", 2, 2));
			signup.getPhoneNum().sendKeys(lib.GetExcelData("SignUp Details", 2, 4));

	}
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public void billingadd() throws EncryptedDocumentException, InvalidFormatException, IOException{
		add = PageFactory.initElements(Driver.driver, AddressDetailsForMyAccount.class);
		add.getNameForNewAddress().sendKeys(lib.GetExcelData("Billing Address", 3, 1));
		add.getZipCodeForNewAddress().sendKeys(lib.GetExcelData("Billing Address", 3, 2));
		add.getAddressForNewAddress().sendKeys(lib.GetExcelData("Billing Address", 3, 3));
		add.getEmailIdForNewAddress().sendKeys(lib.GetExcelData("Billing Address", 3, 4));
		add.getMobileNumberForNewAddress().sendKeys(lib.GetExcelData("Billing Address", 3, 5));
		
	}
	
	public void promoCode() throws EncryptedDocumentException, InvalidFormatException, IOException{
		code = PageFactory.initElements(Driver.driver, CouponsAndPromoCode.class);
		code.getPromoCodeTextBox().sendKeys(lib.GetExcelData("Sheet1", 1, 0));
	}
	
	public void TrackId() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		notlogin = PageFactory.initElements(Driver.driver, NoTLogginOrderIDemaiL.class);
		notlogin.getOrderid().sendKeys(lib.GetExcelData("Track Order ID", 1, 1));
		notlogin.getEmailId().sendKeys(lib.GetExcelData("Track Order ID", 2, 1));
		notlogin.getTrackorderButtonForProd().click();
		wlib.ThreadWait();
		
	}
	

}
