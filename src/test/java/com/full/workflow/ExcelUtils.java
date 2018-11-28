package com.full.workflow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils {
	static HSSFWorkbook ExcelWBook;
	static HSSFSheet ExcelWSheet;
	static String path = "C:\\Users\\BASKARKUMAR\\Desktop\\login.xls";
	static HSSFCell Cell;
	
	public static String username;
	public static String pwd;
	public static String addstaffname;
	public static String staffemail;
	public static String staffpassword;
	public static String staffreconfirmpassword;
	public static String addcustomername;

	
	
	public void readExcel() throws Exception {
		FileInputStream ExcelFile = new FileInputStream(path);

		// Access the required test data sheet

		ExcelWBook = new HSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet("TestData");
		
		//Login username
		Cell = ExcelWSheet.getRow(1).getCell(0);
		username = Cell.getStringCellValue();
		
		//Login Password
		Cell = ExcelWSheet.getRow(1).getCell(1);
		 pwd = Cell.getStringCellValue();
			  
		//Add Staff Title
		 Cell = ExcelWSheet.getRow(1).getCell(2);
		addstaffname = Cell.getStringCellValue();
	
		//Add Staff
		Cell = ExcelWSheet.getRow(1).getCell(3);
		staffemail = Cell.getStringCellValue();	  
		
		//Add Staff Passwrod
		Cell = ExcelWSheet.getRow(1).getCell(4);
		staffpassword = Cell.getStringCellValue();	  
		
		//Add Reconfirm Password
		Cell = ExcelWSheet.getRow(1).getCell(5);
		staffreconfirmpassword = Cell.getStringCellValue();	  
		
		
		//Add Customer Email
		Cell = ExcelWSheet.getRow(1).getCell(6);
		addcustomername = Cell.getStringCellValue();	  
		
		
		
		
		
	}
	
}
