package com.full.workflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_Site {

private static WebElement element = null;
	
	
	
	public static WebElement sites_dashboard_click(WebDriver driver)
		{
		 
	    element = driver.findElement(By.id("sites"));
	 
	    return element;
	 
	    }

	public static WebElement sites_click(WebDriver driver)
	{
	 
    element = driver.findElement(By.xpath("//*[@id='page-content-wrapper']/div/div[1]/a[2]/i"));
 
    return element;
 
    }

	

	


}
