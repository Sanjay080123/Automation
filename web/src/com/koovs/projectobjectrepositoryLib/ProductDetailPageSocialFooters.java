package com.koovs.projectobjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPageSocialFooters {
			
			@FindBy(xpath="//div[@class='pluginConnectButton']/div[1]/div/div/span")
			private WebElement faceBookFrame;
			
			@FindBy(xpath="//form[@id='u_0_5']/div/div[2]/button[1]")
			private WebElement faceBookFrameClose;
			
			@FindBy(xpath="//span[@id='l']")
			private WebElement twitterFrame;
			
			@FindBy(xpath="//div[@id='button']/div[1]/div")
			private WebElement googlePlusFrame;
			
			@FindBy(css="div[id='pinit']>div>a")
			private WebElement pinInterest;

			
			/**
			 * @return the faceBookFrameClose
			 */
			public WebElement getFaceBookFrameClose() {
				return faceBookFrameClose;
			}

			/**
			 * @return the faceBookFrame
			 */
			public WebElement getFaceBookFrame() {
				return faceBookFrame;
			}

			/**
			 * @return the twitterFrame
			 */
			public WebElement getTwitterFrame() {
				return twitterFrame;
			}

			/**
			 * @return the googlePlusFrame
			 */
			public WebElement getGooglePlusFrame() {
				return googlePlusFrame;
			}

			/**
			 * @return the pinInterest
			 */
			public WebElement getPinInterest() {
				return pinInterest;
			}
			
			
			
}
