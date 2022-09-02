package com.demoguru_kickstartoffproject;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import okhttp3.internal.Util;

public class Day_02demoguru {
	
	static WebDriver driver;
	
	public static String baseurl;
	
	
	public static void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\Project_KickOff\\driver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.demo.guru99.com/V4/");

	}
	
	public static void main(String[] args) throws Exception {
		
		String username, password;
		String actualTitle;
		String actualtitle;
		
		setUp();
		
		driver.findElement(By.name("uid")).clear();
		
		driver.findElement(By.name("uid")).sendKeys(Day02_utils.USER_NAME);
		
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys(Day02_utils.PASSWD);

		driver.findElement(By.name("btnLogin")).click();
		
		actualtitle=driver.getTitle();
		
		if(actualtitle.contains(Day02_utils.EXPECT_TITLE)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		driver.quit();
		
	}
		

		
		
	
	
	

}
