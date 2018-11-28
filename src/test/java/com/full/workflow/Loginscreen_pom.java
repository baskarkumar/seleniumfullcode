package com.full.workflow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginscreen_pom {
	static WebDriver driver = WebConsole.driver;
	public static WebElement Login =  driver.findElement(By.id("logonIdentifier"));
	static WebElement pwd =  driver.findElement(By.id("password"));
	static WebElement singinBTn = driver.findElement(By.id("next"));
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
}
