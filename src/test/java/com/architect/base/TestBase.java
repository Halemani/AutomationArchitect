package com.architect.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	/*
	 * WebDriver *DB *Properties *ExtentReports *Excel *Mail *Logs
	 */

	public static WebDriver driver;

	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;

	@BeforeSuite
	public void setUp() throws IOException {
		if (driver == null) {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//test//resources//properties//Config.properties");
			config.load(fis);

			fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//test//resources//properties//OR.properties");
			OR.load(fis);
		}

	}

	@AfterSuite
	public void tearDown() {

	}
}
