package com.org.oracle;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleRegistration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		  try
          {
            System.out.println("Start of delay: "+ new Date());
            // Delay for 7 seconds
            Thread.sleep(7000);   
            System.out.println("End of delay: "+ new Date());
          }
          catch(InterruptedException ex)
          {
              ex.printStackTrace();
          }
		WebElement email=driver.findElement(By.id("sView1:r1:0:email::content"));
		email.sendKeys("anurag.pal7023@gmail.com");
		
		WebElement password=driver.findElement(By.id("sView1:r1:0:password::content"));
		password.sendKeys("Password@123");
		
		WebElement repassword=driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		repassword.sendKeys("Password@123");
		
		WebElement fname=driver.findElement(By.id("sView1:r1:0:firstName::content"));
		fname.sendKeys("Anurag");
		
		WebElement lname=driver.findElement(By.id("sView1:r1:0:lastName::content"));
		lname.sendKeys("Pal");
		
		WebElement jobtitle=driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		jobtitle.sendKeys("DevOps");
		
		WebElement phone=driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		phone.sendKeys("9876543210");
		
		WebElement cname=driver.findElement(By.id("sView1:r1:0:companyName::content"));
		cname.sendKeys("Org");
		
		WebElement addr=driver.findElement(By.id("sView1:r1:0:address1::content"));
		addr.sendKeys("41/5 SBG Lane");
		
		WebElement addr2=driver.findElement(By.id("sView1:r1:0:address2::content"));
		addr2.sendKeys("Mahesh");
		
		WebElement city=driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Serampore");
		
		WebElement state=driver.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("West Bengal");
		
		WebElement zip=driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		zip.sendKeys("712202");
		
		WebElement link= driver.findElement(By.linkText("Create Account"));
		link.click();
		
	}
	
}
