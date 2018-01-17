package com.koovs.businesslib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.ExcelLib;
import com.koovs.genericLib.WebDriverCommonLib;
import com.koovs.projectobjectrepositoryLib.TransactionDetails;

public class PaymentFromCards {
	
	TransactionDetails transDetails = new TransactionDetails();
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	ExcelLib lib = new ExcelLib();
	
	public void paymentFromCreditCard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		transDetails = PageFactory.initElements(Driver.driver, TransactionDetails.class);
		transDetails.getCreditcardpayment().click();
		WebElement CreditCardFrame=Driver.driver.findElement(By.xpath("//iframe[@id='creditcard_payu_iframe']"));
		Driver.driver.switchTo().frame(CreditCardFrame);
		wlib.ThreadWait();
		transDetails.getCreditCardNumber().sendKeys(lib.GetExcelData("Sheet2", 2, 0));
		transDetails.getCreditCardName().sendKeys(lib.GetExcelData("Sheet2", 2, 1));
		WebElement DateElement = Driver.driver.findElement(By.xpath("//div[@id='CreditCardForm']/div[4]/div[1]/select[@class='ExpiryMonth textbox validate']"));
		Select expiredate = new Select(DateElement);
		expiredate.selectByIndex(2);
		WebElement YearElement = Driver.driver.findElement(By.xpath("//div[@id='CreditCardForm']/div[4]/div[1]/select[@class='ExpiryYear textbox validate']"));
		Select expireYear = new Select(YearElement);
		expireYear.selectByIndex(2);
		transDetails.getCreditCardCvvNumber().sendKeys(lib.GetExcelData("Sheet2", 2, 2));
		transDetails.getCreditCardPay().click();
		Driver.driver.switchTo().defaultContent();
	}
	
	public void paymentFromNetBanking() throws InterruptedException
	{
		transDetails = PageFactory.initElements(Driver.driver, TransactionDetails.class);
		transDetails.getNetbankingpayment().click();
		WebElement NetBankingFrame=Driver.driver.findElement(By.xpath("//iframe[@id='netbanking_payu_iframe']"));
		Driver.driver.switchTo().frame(NetBankingFrame);
		wlib.ThreadWait();
		WebElement netbanking = Driver.driver.findElement(By.xpath("//select[@id='NetBankingSelectBox']"));
		Select netBankingDropDown = new Select(netbanking);
		netBankingDropDown.selectByIndex(5);
		transDetails.getNetBankingProceedToPayment().click();
		
	}

}
