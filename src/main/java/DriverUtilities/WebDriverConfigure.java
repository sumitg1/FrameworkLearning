package DriverUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfigure {
	
	public WebDriver getDriver(){
		WebDriver driver=new FirefoxDriver();
		return driver;
	}

}
