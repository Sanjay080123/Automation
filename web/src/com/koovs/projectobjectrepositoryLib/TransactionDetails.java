package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransactionDetails {
	
	/**
	 * Pay via credit card
	 */
		@FindBy(xpath="//div[@id='paymentMode']/ul/li[3]/a")
		private WebElement creditcardpayment;
		
		@FindBy(xpath="//div[@id='CreditCardForm']/div[2]/div/input")
		private WebElement creditCardNumber;
		
		@FindBy(xpath="//div[@id='CreditCardForm']/div[3]/div/input")
		private WebElement creditCardName;
		
		@FindBy(xpath="//div[@id='CreditCardForm']/div[5]/input")
		private WebElement creditCardCvvNumber;
		
		@FindBy(xpath="//div[@id='CreditCardForm']/div[8]/div/div/input")
		private WebElement creditCardPay;
	
	/**
	 * Pay via Debit card	
	 */
		@FindBy(xpath="//div[@id='paymentMode']/ul/li[4]/a")
		private WebElement debitcardpayment;
		
	/**
	 * Pay via Net banking	
	 */
		@FindBy(xpath="//div[@id='paymentMode']/ul/li[5]/a")
		private WebElement netbankingpayment;
		
		@FindBy(xpath="//div[@id='NetBankingForm']/div[2]/div/div/input")
		private WebElement netBankingProceedToPayment;
		
		
	/**
	 * Pay via COD	
	 */
		@FindBy(xpath="//div[@id='paymentMode']/ul/li[6]/a")
		private WebElement CODpayment;
		
		@FindBy(xpath="//a[@id='change_mobile']")
		private WebElement clickButtonForExistPhone;
		
		@FindBy(xpath="//a[@id='send_otp']")
		private WebElement sendOTP;
		
		@FindBy(xpath="//p[@id='proceed_to_checkout_text_btn']")
		private WebElement confirmYourOrder;
		
	/**	
	 * Pay via Paypal
	 */
		
		@FindBy(xpath="//div[@id='paymentMode']/ul/li[7]/a")
		private WebElement paypalpayment;

	/**
	 * @return the creditcardpayment
	 */
	public WebElement getCreditcardpayment() {
		return creditcardpayment;
	}
	
	

	/**
	 * @return the clickButtonForExistPhone
	 */
	public WebElement getClickButtonForExistPhone() {
		return clickButtonForExistPhone;
	}



	/**
	 * @return the creditCardPay
	 */
	public WebElement getCreditCardPay() {
		return creditCardPay;
	}



	/**
	 * @return the creditCardNumber
	 */
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}



	/**
	 * @return the creditCardName
	 */
	public WebElement getCreditCardName() {
		return creditCardName;
	}



	/**
	 * @return the creditCardCvvNumber
	 */
	public WebElement getCreditCardCvvNumber() {
		return creditCardCvvNumber;
	}



	/**
	 * @return the sendOTP
	 */
	public WebElement getSendOTP() {
		return sendOTP;
	}



	/**
	 * @return the confirmYourOrder
	 */
	public WebElement getConfirmYourOrder() {
		return confirmYourOrder;
	}



	/**
	 * @return the debitcardpayment
	 */
	public WebElement getDebitcardpayment() {
		return debitcardpayment;
	}

	/**
	 * @return the netbankingpayment
	 */
	public WebElement getNetbankingpayment() {
		return netbankingpayment;
	}
	
	

	/**
	 * @return the netBankingProceedToPayment
	 */
	public WebElement getNetBankingProceedToPayment() {
		return netBankingProceedToPayment;
	}



	/**
	 * @return the cODpayment
	 */
	public WebElement getCODpayment() {
		return CODpayment;
	}

	/**
	 * @return the paypalpayment
	 */
	public WebElement getPaypalpayment() {
		return paypalpayment;
	}
		
				
}
