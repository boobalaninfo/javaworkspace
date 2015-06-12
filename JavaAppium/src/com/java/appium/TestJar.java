package com.java.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestJar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "8.3");
		capabilities.setCapability("deviceName", "iPhone 5");
		capabilities.setCapability("app", "/Users/boobalanmunusamy/Documents/Boobalan/Test.app");
		RemoteWebDriver wd;
		try {
			wd = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
			wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			wd.findElement(By.name("login button")).click();

			wd.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
