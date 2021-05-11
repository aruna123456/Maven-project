package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login {
	
	public WebDriver driver;
	
	public Pom_Login(WebDriver driver) {
	this.driver=driver;
		
		//pagefactory
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	//@findby
	
	//@FindBy
	@FindBy(id="email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(id="passwd")
	private WebElement pwd;
	public WebElement getPwd() {
		return pwd;
	}
	
	@FindBy(name="SubmitLogin")
	private WebElement log;
	public WebElement getLog() {
		return log;
	}



	
	
	

	
}
	


