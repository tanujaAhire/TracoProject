package com.selenium.TrackoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TrackoMain 
 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		
		 System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		 driver = new ChromeDriver();
	     driver.get("https://tracko.co.in/"); 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  
	}
	
	@Test
	public void signup() throws InterruptedException 

	{
		SignUpClass sign=new SignUpClass(driver);
	    sign.signup();
		
		
		
	}
	
	@Test(enabled=false)
	public void login()
	{
		WebElement login_button=driver.findElement(By.xpath("//a[text()=' Log in']"));
		login_button.click();
		
		WebElement loginmobile_textbox=driver.findElement(By.id("login-mobile"));
		loginmobile_textbox.sendKeys("xyz@123");
		
		WebElement loginPassword_textbox=driver.findElement(By.id("login-password"));
		loginPassword_textbox.sendKeys("ab@123");
		
	}
	
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
