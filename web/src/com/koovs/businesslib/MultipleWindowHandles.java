package com.koovs.businesslib;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;




import org.openqa.selenium.By;

import com.koovs.genericLib.Driver;





public class MultipleWindowHandles {
	
				
	public void windowsforfooters(){
		String parent = Driver.driver.getWindowHandle();
		Set<String> set = Driver.driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String childwindow = it.next();
		if(!parent.equals(childwindow)){
			Driver.driver.switchTo().window(childwindow);
			System.out.println(Driver.driver.switchTo().window(childwindow).getTitle());
			Driver.driver.close();
			}
			}
		Driver.driver.switchTo().window(parent);
		}
	public void facebookwindow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		Set<String> set = Driver.driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String parent = Driver.driver.getWindowHandle();
		while(it.hasNext()){
			String childwindow = it.next();
		if(!parent.equals(childwindow)){
			Driver.driver.switchTo().window(childwindow);
			System.out.println(Driver.driver.switchTo().window(childwindow).getTitle());
			Driver.driver.findElement(By.id("email")).sendKeys("tosikkumar@gmail.com");
			Driver.driver.findElement(By.id("pass")).sendKeys("0801231075");
			Driver.driver.findElement(By.id("loginbutton")).click();
			}
			Driver.driver.switchTo().window(parent);
		}
		
	}
}
