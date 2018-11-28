package com.full.workflow;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.converter.ExcelToFoUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class WebConsole  {
	
	//Browser Configuration
	static WebDriver driver;
	String exePath = "D:\\chromedriver\\chromedriver.exe";
	String login;
	String password;
	String addstaff;
	String staffname;
	String Estimatorno;
	String staffemail;
	String StaffPassword;
	String Staffreconfirmpassword;
	String Customeremail;
	
	/*private void movToElem() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Dashboard_Staff.addStaffclick(driver));
		actions.click().build().perform();
	}*/

	  @Test
	  	public void launchBrowser() throws Exception {
	  
		  ExcelUtils utils = new ExcelUtils();
		  utils.readExcel();
		  login = utils.username;
		  password = utils.pwd;
		  System.setProperty("webdriver.chrome.driver", exePath);
		  driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.navigate().to("http://stage-console.smartscaffolder.services");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  //Calling login operations from another class
		  		Loginscreen_pom.Login.sendKeys(login);
		  		Loginscreen_pom.pwd.sendKeys(password);
		  		Loginscreen_pom.singinBTn.click();
		  
		  //Verifying the login screen
		  		Assert.assertTrue(driver.findElement(By.xpath("/html/body/hub-root/hub-main/div/div/hub-app-header/div")).isDisplayed());
		  		System.out.println("Login Successful");
	
		 // Explicit Wait
		  		WebDriverWait wait = new WebDriverWait(driver, 10);
		  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/hub-root/hub-main/div/div/hub-app-header/div")));

		  		
		//Adding Customer 
		  		
		  		// Clicking Customer from Dashboard
		  		Dashboard_Customer.ClickCustomer(driver).click();
		  		
		  		//Clicking add customer button
		  		Dashboard_Customer.AddCustomerbutton(driver).click();
	  
		  		//Addcustomer name
		  		Customeremail=utils.addcustomername;
		  		Dashboard_Customer.CustomerEmail(driver).sendKeys(Customeremail);
		  		
		  		//Save Customer
		  		Dashboard_Customer.savebutton(driver).click();
	 		
		  		
		  		
		  		
		  		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		  		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page-content-wrapper']/div")));
		  		
		  		
	  
		  //Adding Staff
		 
		 /* 		//Click dashboard staff
		  		Dashboard_Staff.staff(driver).click();
		  		
		  		//click staff
		  		Dashboard_Staff.addStaffclick(driver).click();
		  		
		  		//movToElem();
		  		
		  		
		  		
		  		//Add Staff name
		  		staffname=utils.addstaffname;
		  		Dashboard_Staff.addstaffname(driver).sendKeys(staffname);
		  		
		  		//Change Estimator
		  		//Dashboard_Staff.Estimatorasno(driver).click();
	
		  		//Add Staff Emailid
		  		staffemail=utils.staffemail;
		  		Dashboard_Staff.addstaffemail(driver).sendKeys(staffemail);
		  		
		  		
		  		//Add Staff Password
		  		StaffPassword=utils.staffpassword;
		  		Dashboard_Staff.staffpassword(driver).sendKeys(StaffPassword);
		  		
		  		
		  		//Reconfirm Staff Password
		  		Staffreconfirmpassword=utils.staffreconfirmpassword;
		  		Dashboard_Staff.staffreconfirmpassword(driver).sendKeys(Staffreconfirmpassword);		  				
		  		
		  		
		  		//Save added staff
		  		Dashboard_Staff.savestaff(driver).click();
	*/
		  		
		  		/*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  		
		  		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		  		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page-content-wrapper']/div"))); 
	*/
	  
	 
		  		
		  		//Adding Site
			  	Dashboard_Site.sites_dashboard_click(driver).click();
		  		//Dashboard_Site.sites_click(driver).click();
		  		
	  
	  }}		
	  


