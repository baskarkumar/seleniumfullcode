package com.full.workflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public  class Dashboard_Staff {
	
	
	private static WebElement element = null;
	
	
	
	public static WebElement staff(WebDriver driver)
		{
		 
	    element = driver.findElement(By.id("staff"));
	 
	    return element;
	 
	    }
	public static WebElement addStaffclick(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div/form/div[3]/a/i"));
	 
	    return element;
	 
	    }
	
	public static WebElement addstaffname(WebDriver driver) {
	
		element = driver.findElement(By.xpath("/html/body/modal-overlay/div/bs-modal-container/div/div/hub-add-edit-staff-modal/form/div/fieldset/hub-form-group[1]/div/input"));
		
		return element;
	}


	public static WebElement Estimatorasno(WebDriver driver)
{

		element = driver.findElement(By.xpath("/html/body/modal-overlay/div/bs-modal-container/div/div/hub-add-edit-staff-modal/form/div/fieldset/span/hub-form-group/div/div/div[2]/label/input"));

		return element;
}

	public static WebElement addstaffemail(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/modal-overlay/div/bs-modal-container/div/div/hub-add-edit-staff-modal/form/div/fieldset/hub-form-group[3]/div/input"));
	
	return element;
	
	}
	
	public static WebElement staffpassword(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/modal-overlay/div/bs-modal-container/div/div/hub-add-edit-staff-modal/form/div/fieldset/hub-form-group[5]/div/input"));
		return element;		
		
	}
	
	
	public static WebElement staffreconfirmpassword(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/modal-overlay/div/bs-modal-container/div/div/hub-add-edit-staff-modal/form/div/fieldset/hub-form-group[6]/div/input"));
		return element;		
	}
	
	
	public static WebElement savestaff(WebDriver driver)
	
	{
		element = driver.findElement(By.xpath("/html/body/modal-overlay/div/bs-modal-container/div/div/hub-add-edit-staff-modal/form/div/hub-modal-form-footer/div/div/button[2]"));
	return element;
	
	}
	
	
}
