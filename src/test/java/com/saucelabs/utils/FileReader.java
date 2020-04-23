package com.saucelabs.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class FileReader {

	public static Properties prop;

	public static Properties readingFile(String filepath) {

		try {
			FileInputStream input = new FileInputStream(filepath);
			prop = new Properties();
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
