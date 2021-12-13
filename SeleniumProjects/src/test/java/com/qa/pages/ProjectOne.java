package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ProjectOne {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\\\selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("http://iamneo.ai");
		String str = driver.getTitle();
		String str1 = "We are Hiring!";
		
		try {
			Assert.assertEquals(str1, str);
			System.out.println("PASS");
		}
		catch(Throwable e) {
			System.out.println("FAIL");
		}
		
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();  
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().forward();  
		driver.navigate().refresh();  
	    Thread.sleep(3000);
	    
		driver.close();
	}

}
