package com.purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Purchase {
	
	public static WebDriver driver;
	
	public Pom_Purchase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//@FindBy
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;

	public WebElement getWomen() {
	return women;
	}
	
	@FindBy(xpath="(//img[@title='Printed Summer Dress'])[1]")
	private WebElement quick;
	
	
	public WebElement getQuick() {
		return quick;
	}

	@FindBy(xpath="(//a[@title='Summer Dresses'])[1]")
	private WebElement image;
	
	public WebElement getImage() {
		return image;
	}
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement sframe;

	public WebElement getSframe() {
		return sframe;
	}
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plus;

	public WebElement getPlus() {
		return plus;
	}
	
	@FindBy(name="group_1")
	private WebElement size1;
	
	public WebElement getSize1() {
	return size1;
	}

	@FindBy(xpath="//a[@title='Blue']")
	private WebElement color;
	
	public WebElement getColor() {
		return color;
	}
	
	@FindBy(name="Submit")
	private WebElement cart;
	
	public WebElement getCart() {
		return cart;
	}
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement cont;

	public WebElement getCont() {
		return cont;
	}
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed1;

	public WebElement getProceed1() {
		return proceed1;
	}
	
	@FindBy(name="processAddress")
	private WebElement addr;

	public WebElement getAddr() {
		return addr;
	}
	
	@FindBy(id="cgv")
	private WebElement check1;

	public WebElement getCheck1() {
		return check1;
	}
	
	@FindBy(name="processCarrier")
	private WebElement process;

	public WebElement getProcess() {
		return process;
	}
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement pay;

	public WebElement getPay() {
		return pay;
	}
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement conform;

	public WebElement getConform() {
		return conform;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
}
