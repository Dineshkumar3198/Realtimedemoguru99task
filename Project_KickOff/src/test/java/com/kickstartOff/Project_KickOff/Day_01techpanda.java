package com.kickstartOff.Project_KickOff;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_01techpanda {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Project_KickOff\\driver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://live.techpanda.org/index.php/");

		WebElement pagetitle = driver.findElement(By.xpath("//div[@class='page-title']"));
		String title = pagetitle.getText();
		
		System.out.println(title);
		
		String Expected="THIS IS DEMO SITE FOR";
		
		if (title.contains(Expected)) {
			System.out.println("Title Verified");
		}
		else {
			System.out.println("Title not verified");
		}
		
		WebElement mobile=driver.findElement(By.xpath("(//a[@class='level0 '])[1]"));
		mobile.click();
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		String Expectedtitle1="Mobile";
		
		if(title1.contains(Expectedtitle1)) {
			System.out.println("Title1 verified");
		}
		else {
			System.out.println("Title1 not verified");
		}
		
		WebElement sortby=driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
		
		Select select=new Select(sortby);
		
		select.selectByIndex(1);
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File s1=ts.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\Dell\\eclipse-workspace\\Project_KickOff\\Screenshot\\techpanda1.png");
		FileUtils.copyFile(s1, d1);
		
		System.out.println("Test case verified");
		
		}
		}

	

