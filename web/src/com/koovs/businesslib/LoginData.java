package com.koovs.businesslib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.ExcelLib;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.Login;
import com.koovs.projectobjectrepositoryLib.Signout;

public class LoginData  {
	
	Login login = new Login();
	ExcelLib lib = new ExcelLib();
	Signout signout = new Signout();
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	MultipleWindowHandles windowhandle = new MultipleWindowHandles();
	
		public void login() throws EncryptedDocumentException, InvalidFormatException, IOException{
				login = PageFactory.initElements(Driver.driver, Login.class);
				login.getUsernameTextBox().sendKeys(lib.GetExcelData("Login Details", 2, 1));
				login.getPasswordTextBox().sendKeys(lib.GetExcelData("Login Details", 2, 2));
		
			}
		public void logout() throws InterruptedException{
			signout = PageFactory.initElements(Driver.driver, Signout.class);
			wlib.Actions(signout.getSignOutLink());
			wlib.ThreadWait();
			signout.getLogoutCurrentUser().click();
		}
		
		public void loginFacebook() throws EncryptedDocumentException, InvalidFormatException, IOException{
			login = PageFactory.initElements(Driver.driver, Login.class);
			login.getUsernamefacebook().sendKeys(lib.GetExcelData("LoginFacebook", 2, 2));
			login.getPasswordfacebook().sendKeys(lib.GetExcelData("LoginFacebook", 2, 3));
			login.getFacebookloginbutton().click();
		}
	
	

}
