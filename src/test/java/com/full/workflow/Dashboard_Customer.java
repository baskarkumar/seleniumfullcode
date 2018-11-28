package com.full.workflow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dashboard_Customer {
	
	
	private static WebElement element = null;
	
	
	public static WebElement ClickCustomer(WebDriver driver) 
	
	{

		element = driver.findElement(By.id("customers"));
		return element;
		
	}
	
	
	public static WebElement AddCustomerbutton(WebDriver driver)
	
	{
		element = driver.findElement(By.xpath("//*[@id='page-content-wrapper']/div/div/form/div[3]/a/i"));
		return element;
	}
	
	
	public static WebElement CustomerEmail(WebDriver driver)
	
	{
		element = driver.findElement(By.xpath("/html/body/modal-overlay/div/bs-modal-container/div/div/hub-add-edit-customer-modal/form/div/div/div[1]/hub-form-group[1]/div/input"));
		return element;
	}
	
	
	public static WebElement savebutton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/modal-overlay/div/bs-modal-container/div/div/hub-add-edit-customer-modal/form/div/hub-modal-form-footer/div/div/button[2]"));

	return element;
	}	
	
	
	
	}
