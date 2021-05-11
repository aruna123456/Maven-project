package com.baseclass;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Base_Class {
		
		public static WebDriver driver;//null driver
		
		//webdriver
		
		public static WebDriver BrowserLaunch(String browser) {
			
			if (browser.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Kumar\\eclipse-workspace\\Project_First\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
				
				}
			
			
			else {
				System.out.println("invalid");
			}
			
			
			driver.manage().window().maximize();
			
			return driver;
			
		}
		
		//get
		
		public static void Launchurl(String url) {
		driver.get(url);
			}
		//click
		
		public static void ClickOnElement(WebElement element) {
		element.click();
			
			}
		//sendkeys
		
		public static void inputValues(WebElement element,String str) {
		element.sendKeys(str);
			}
		
		//drop down
		
		public static void dropdown(WebElement element,String value) {
			
			Select s=new Select(element);
			s.selectByVisibleText(value);
			
			}
			
			
			//screenshot
		
			public static void screenshot()throws Exception{
				TakesScreenshot ts=(TakesScreenshot)driver;
				File ScreenshotAs=ts.getScreenshotAs(OutputType.FILE);
				File saveFile=new File("C:\\\\Users\\\\Ajith Kumar\\\\eclipse-workspace\\\\Selenium90_Task\\\\screenshot\\\\image1.png");
				Files.copy(ScreenshotAs, saveFile);
				
				
				
			}
			
			//iframe
			
			public static void iframe(WebElement element) {
				driver.switchTo().frame(element);
				
				
			}
			
			//action click
			
			public static void actionclick(WebElement element) {
				Actions ac=new Actions(driver);
				ac.click(element).build().perform();
			}
			
			//rightclick
			
			public static void contextclick(WebElement element) {
				Actions ac1=new Actions(driver);
				ac1.contextClick(element).build().perform();
				}
			
			//mouse hover(move to element)
			public static void mouseHover(WebElement element) {
				Actions ac2=new Actions(driver);
				ac2.moveToElement(element).build().perform();
				

			}
			
			
			
}
			
			
			
			


