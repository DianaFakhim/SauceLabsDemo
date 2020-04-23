package com.saucelabs.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.saucelabs.base.BaseClass;
import com.saucelabs.base.PageInitializer;

public class CommonMethods extends PageInitializer {

	public static void waitforClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		waitforClick(element);
		element.click();

	}

	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static byte[] takeScreenShot(String fileName) {

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("_yyyy_MM_`dd_HHmmss");
		String timeStamp = dateFormat.format(date.getTime());

		TakesScreenshot scr = (TakesScreenshot) driver;

		byte[] picture = scr.getScreenshotAs(OutputType.BYTES);

		File file = scr.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(Constans.SCREENSHOT_PATH + fileName + timeStamp + ".png"));
		} catch (IOException e) {
			System.out.println("Cannot take screenshot");
			;
		}
		return picture;
	}

}
