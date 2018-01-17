package com.koovs.genericLib;



import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;





public class Driver {
	
	

	
	public static WebDriver driver;
	public static WebDriver getDriver()
	{
		String proxyset = "localhost:8081";
		Proxy proxy	 = new Proxy();
		proxy.setHttpProxy(proxyset).setFtpProxy(proxyset).setSslProxy(proxyset).setSocksProxy(proxyset);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		if(Constants.browser.equals("firefox"))
		{
			
			driver = new FirefoxDriver(cap);
		}else if(Constants.browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Selenium Software\\IEDriverServer_x64_2.47.0\\IEDriverServer.exe");
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			driver =new InternetExplorerDriver(caps);
		}else if(Constants.browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else
		{
			driver = new FirefoxDriver();
		}
	
		return driver;
	}
}
