package com.koovs.businesslib;

import com.koovs.genericLib.Driver;
import com.koovs.genericLib.WebDriverCommonLib;

public class CurrentUrlOfPages {
	
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	
		public void ulrs() throws InterruptedException
		{
			String currentUrl = Driver.driver.getCurrentUrl();
			System.out.println(currentUrl);
			if(currentUrl.contains("http://www"))
			{
				String replaced = currentUrl.replace("http://www", "http://neo");
				System.out.println(replaced);
				Driver.driver.get(replaced);
				wlib.Action();
				wlib.ThreadWait();
			}
		}

}
