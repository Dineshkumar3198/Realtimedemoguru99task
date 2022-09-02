package com.demoguru_kickstartoffproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_01 {
	
	static WebDriver driver;

	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\Project_KickOff\\driver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr435286");
		
		driver.findElement(By.name("password")).sendKeys("EmesYqa");
		
		driver.findElement(By.name("btnLogin")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File s1=ts.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\Dell\\eclipse-workspace\\Project_KickOff\\Screenshot\\demoguru1.png");
		FileUtils.copyFile(s1, d1);
		
		System.out.println("Tc_1 Pass");
		
		

		
	}

}
