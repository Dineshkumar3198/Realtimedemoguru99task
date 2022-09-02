package com.demoguru_kickstartoffproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Day_03demoguru {
	
	static WebDriver driver;
	
	public static void setUp() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\Project_KickOff\\driver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.demo.guru99.com/V4/");

	}
	
	
	public static void main(String[] args) {
		String username, password;
		String actualTitle;
		String actualtitle;
		
		setUp();
		
		driver.findElement(By.name("uid")).clear();
		
		driver.findElement(By.name("uid")).sendKeys(Day02_utils.USER_NAME);
		
		driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys(Day02_utils.PASSWD);

		driver.findElement(By.name("btnLogin")).click();
	}
	
	

}
