package com.org;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {

WebDriver driver=null;
	
	@Test(groups = "Amazon")
	public void launchAmazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}
	@Test(groups = "Amazon", dependsOnMethods = {"launchAmazon"})
	public void login() {
		
		driver.findElement(By.id("ap_email")).sendKeys("8013396022");
		driver.findElement(By.id("continue")).submit();
		
	}
	@Test(groups = "Amazon", dependsOnMethods = {"login"})
	public void login2() {
		
		driver.findElement(By.id("ap_password")).sendKeys("valleyforge!!!!");;
		driver.findElement(By.id("signInSubmit")).submit();
	}
	@Test(groups = "Amazon", dependsOnMethods = {"login2"})
	public void search() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");
		driver.findElement(By.id("nav-search-submit-button")).submit();
	}
	@Test(groups = "Amazon", dependsOnMethods = {"search"})
	public void select() {
		
		driver.findElement(By.partialLinkText("Apple iPhone XR")).click();
	}
	@Test(groups = "Amazon", dependsOnMethods = {"select"})
	public void addtocart() {
		
		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("add-to-cart-button")).submit();
		
	}
	
}
