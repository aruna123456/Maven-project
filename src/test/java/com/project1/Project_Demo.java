package com.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//Chromedriver.exe//");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("aruna123@gmail.com");
		WebElement newac = driver.findElement(By.id("SubmitCreate"));
		newac.click();
		
		Thread.sleep(5000);
		WebElement gender = driver.findElement(By.id("id_gender2"));
		gender.click();
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		fname.sendKeys("Arunajothi");
		WebElement lname = driver.findElement(By.id("customer_lastname"));
		lname.sendKeys("G");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("shreeyuvan");
		
		WebElement day = driver.findElement(By.id("days"));
		Select s=new Select(day);
		s.selectByValue("22");
		
		Thread.sleep(5000);
		
		WebElement month = driver.findElement(By.name("months"));
		Select s1=new Select(month);
		s1.selectByVisibleText("October ");
		WebElement year = driver.findElement(By.id("years"));
		Select s2=new Select(year);
		s2.selectByIndex(21);
		
		WebElement radio = driver.findElement(By.name("optin"));
		radio.click();
		WebElement fname1 = driver.findElement(By.name("firstname"));
		fname1.sendKeys("aruna");
		WebElement lname1 = driver.findElement(By.name("lastname"));
		lname1.sendKeys("jothi");
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("CTS");
		WebElement addr = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		addr.sendKeys("Ramaswamy street");
		WebElement addr1 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		addr1.sendKeys("arcot");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("chennai");
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3=new Select(state);
		s3.selectByVisibleText("Washington");
		WebElement code = driver.findElement(By.name("postcode"));
		code.sendKeys("00000");
		WebElement country = driver.findElement(By.name("id_country"));
		Select s4=new Select(country);
		s4.selectByVisibleText("United States");
		WebElement add = driver.findElement(By.id("other"));
		add.sendKeys("automation practice is very useful");
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("9952792308");
		WebElement mob = driver.findElement(By.id("phone_mobile"));
		mob.sendKeys("9790282840");
		WebElement alteraddr = driver.findElement(By.name("alias"));
		alteraddr.sendKeys("porur");
		WebElement reg = driver.findElement(By.xpath("//span[text()='Register']"));
		reg.click();
		
		
		
		
	
						
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
