package com.qspiders.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities 
{
	public static String getCellData(String sheetName,int row,int cell)
	{
		Sheet sheet=null;
		try
		{
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Resources\\ExcelFiles\\TestData.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			sheet= wb.getSheet(sheetName);
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return sheet.getRow(row).getCell(cell).toString();
	}
	

	
}
