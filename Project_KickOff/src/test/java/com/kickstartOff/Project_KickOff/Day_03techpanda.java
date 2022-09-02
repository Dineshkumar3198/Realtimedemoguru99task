package com.kickstartOff.Project_KickOff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_03techpanda {
	
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
		
		driver.findElement(By.xpath("(//a[@class='level0 '])[1]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Add to Cart'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1000");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[5]")).click();
		
		String text=driver.findElement(By.xpath("//span[text()='Some of the products cannot be ordered in requested quantity.']")).getText();
		
		System.out.println(text);
		
		System.out.println("Error message verified");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		String text1=driver.findElement(By.xpath("//h1[text()='Shopping Cart is Empty']")).getText();
		
		System.out.println(text1);
		
		System.out.println("Error message verified");
		}
		
		public  void tearDown() {
		driver.quit();
		}
		
}