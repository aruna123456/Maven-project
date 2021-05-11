package com.project1;

import java.awt.Frame;
import java.io.File;
import java.io.IOException;

import javax.print.attribute.Size2DSyntax;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Base_Class;
import com.pom.Pom_Login;
import com.purchase.Pom_Purchase;


public class Order_Conform extends Base_Class{
	
	public static void main(String[] args) throws Exception {
		
		BrowserLaunch("chrome");
		Launchurl("http://automationpractice.com/index.php?controller=my-account");
		
		Pom_Login l=new Pom_Login(driver);
		
		inputValues(l.getEmail(), "aruna123@gmail.com");
		inputValues(l.getPwd(), "shreeyuvan");
		ClickOnElement(l.getLog());
		
		Pom_Purchase p=new Pom_Purchase(driver);
		
		mouseHover(p.getWomen());
		actionclick(p.getImage());
		
		ClickOnElement(p.getQuick());
		
		Thread.sleep(7000);
		
		iframe(p.getSframe());
		
		ClickOnElement(p.getPlus());
		
		dropdown(p.getSize1(), "M");
		
		ClickOnElement(p.getColor());
		ClickOnElement(p.getCart());
		
		Thread.sleep(3000);
		
		ClickOnElement(p.getCont());
		ClickOnElement(p.getProceed1());
		ClickOnElement(p.getAddr());
		ClickOnElement(p.getCheck1());
		ClickOnElement(p.getProcess());
		ClickOnElement(p.getPay());
		ClickOnElement(p.getConform());
		
		screenshot();
		
	
	}
}
