package com.saucelabs.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.saucelabs.utils.Constans;
import com.saucelabs.utils.FileReader;



public class BaseClass {
	
	public static WebDriver driver;

	public static void setUp() {
		FileReader.readingFile(Constans.FILE_PATH);
		switch (FileReader.getProperty("browser")) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constans.CHROME_PATH);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constans.GECKO_PATH);
			driver = new FirefoxDriver();
			break;
		case "safari":
			WebDriver driver = new SafariDriver();
			driver.get("https://google.com");
			break;
		default:
			System.out.println("Browser not supported");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(FileReader.getProperty("url"));
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
