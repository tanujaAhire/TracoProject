package com.selenium.TrackoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TrackoClass
{
	WebDriver driver;
	
	@Parameters("browserParameter")
	@BeforeTest
	public void setup(String Value)
	{
		String browser=Value;
		if(browser.equals("chrome"))
		{ System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver = new ChromeDriver();
		}

		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
			driver = new FirefoxDriver();
		}



		else{
			System.out.println("No browser specified");
		}
	  driver.get("https://tracko.co.in/"); 
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
			
	}
	
	
	@Test
	public void signup()
	{
		WebElement signup_button=driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
		signup_button.click();
		
		WebElement loginUsername_textbox=driver.findElement(By.id("name"));
		loginUsername_textbox.sendKeys("Tanuja");
		
		WebElement loginEmail_textbox=driver.findElement(By.id("email"));
		loginEmail_textbox.sendKeys("tanu@gamil.com");
		
		WebElement loginMobile_textbox=driver.findElement(By.id("mobile"));
		 loginMobile_textbox.sendKeys("8989898989");
		 
		WebElement loginSignUpbtn_textbox=driver.findElement(By.id("sub_btn_signup"));
		loginSignUpbtn_textbox.click();
		
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
