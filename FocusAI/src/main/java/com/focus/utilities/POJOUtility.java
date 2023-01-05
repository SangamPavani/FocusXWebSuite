package com.focus.utilities;

import java.io.IOException;

import com.focus.base.BaseEngine;
import com.focus.supporters.PropertiesReusables;

public class POJOUtility {

	private static String excelFilePath=BaseEngine.getBaseDir()+"\\src\\main\\resources\\testdata\\TestData.xls";
	
	
	public static String getExcelPath()
	{
		return excelFilePath;
	}
	
	
	public void setExcelPath(String excelFilePath)
	{
		this.excelFilePath=excelFilePath;
	}
	
	public PropertiesReusables getPropertiesReusablesObj(String filePath) throws IOException
	{
		PropertiesReusables pr=new PropertiesReusables(filePath);
		return pr;
	}
	
	

}
