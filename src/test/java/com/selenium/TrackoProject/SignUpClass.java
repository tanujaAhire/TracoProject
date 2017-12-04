package com.selenium.TrackoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpClass 

{

	WebDriver driver;
	
	
	public SignUpClass(WebDriver driver2) 
	{
      driver=driver2;

	}

	public void signup() throws InterruptedException
	{
		WebElement signup_button=driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
		signup_button.click();
		
		WebElement loginUsername_textbox=driver.findElement(By.id("name"));
		loginUsername_textbox.sendKeys("Tanuja");
		
		WebElement loginEmail_textbox=driver.findElement(By.id("email"));
		loginEmail_textbox.sendKeys("acc123@gamil.com");
		
		WebElement loginMobile_textbox=driver.findElement(By.id("mobile"));
		 loginMobile_textbox.sendKeys("7567980907");
		 
		WebElement loginSignUpbtn_textbox=driver.findElement(By.id("sub_btn_signup"));
		loginSignUpbtn_textbox.click();
		
		WebElement otp_textbox=driver.findElement(By.id("otp"));
		otp_textbox.sendKeys("123456");
		
		WebElement verifybtn_textbox=driver.findElement(By.id("sub_btn_verify"));
		verifybtn_textbox.click();
		
		Thread.sleep(5000);
		
		WebElement OK_button=driver.findElement(By.xpath("//button[text()='OK']"));
	    OK_button.click();
	    
	    WebElement passwodbtn_textbox=driver.findElement(By.id("password"));
		passwodbtn_textbox.sendKeys("bbbb@123");
	    
		 WebElement repasswodbtn_textbox=driver.findElement(By.id("repassword"));
		repasswodbtn_textbox.sendKeys("bbbb@123");
		
		Thread.sleep(5000);
		WebElement setpassbtn_textbox=driver.findElement(By.id("sub_btn_setpass"));
		setpassbtn_textbox.click();
	    
	
		
		
	}

}
