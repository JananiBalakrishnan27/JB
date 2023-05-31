package com.assignmentfb;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFb {
	
	public void FbLogin() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement name =driver.findElement(By.id("email"));
		name.sendKeys("Jananibalakrishnan27@gmail.com");
		WebElement pass =driver.findElement(By.name("pass"));
		pass.sendKeys("Logesh@1727");
		WebElement login =driver.findElement(By.name("login"));
		login.click();		
		
	}
	public static void main(String[] args) {
		LoginFb f = new LoginFb();
		f.FbLogin();
	}

}
