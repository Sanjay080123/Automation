package com.koovs.businesslib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenShot  {
	
		public static String captureScreenShot(WebDriver driver, String screenshotName){
							
				try
					{
						TakesScreenshot ts = (TakesScreenshot)driver;
						File source = ts.getScreenshotAs(OutputType.FILE);
						String destination = "D:\\koovs-automation\\ScreenShots\\"+screenshotName+".png";
						File dest = new File(destination);
						FileUtils.copyFile(source, dest);
						System.out.println("Screenshot Taken");
						return destination;
						
					}
				catch(Exception e)
				{
					System.out.println("Exception while taking screeshot "+e.getMessage());
					return e.getMessage();
				}
				
			}

}
