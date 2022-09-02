package com.kickstartOff.Project_KickOff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_02techpanda {
	
	private WebDriver driver;
	private String baseurl;
	
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
	public  void testcase2() {

		driver.get(baseurl);
		
		driver.findElement(By.xpath("(//a[@class='level0 '])[1]")).click();
		
		WebElement xperia=driver.findElement(By.xpath("(//span[@class='price'])[4]"));
		
		String sonyxperia = xperia.getText();
		System.out.println(sonyxperia);
		
		driver.findElement(By.id("product-collection-image-1")).click();
		
		String detailprize=driver.findElement(By.xpath("//span[@class='price']")).getText();
		System.out.println(detailprize);
		if(sonyxperia.equals(detailprize)) {
			System.out.println("Both the  prize same");
		}
		else {
			System.out.println("Both the prize not same");
		}	
		System.out.println("Test case passed 02");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
