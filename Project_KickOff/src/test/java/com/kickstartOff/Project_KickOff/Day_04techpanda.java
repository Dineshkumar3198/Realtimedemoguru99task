package com.kickstartOff.Project_KickOff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_04techpanda {

	static WebDriver driver;
	static String baseurl;
	
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Project_KickOff\\driver\\geckodriver.exe");

		driver = new FirefoxDriver();
		baseurl="http://live.techpanda.org/index.php/";

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
		public  void testcase3() {
		
		driver.get(baseurl);
		
		driver .findElement(By.xpath("(//a[@class='level0 '])[1]")).click();
		
		
	}
		
}
