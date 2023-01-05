package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.Pages.LoginPage;

import com.focus.utilities.POJOUtility;

public class LoginPageCompanyCreationPage extends BaseEngine 
{
	
	
	
	private static Alert alert;
	
	private static LoginPage lp;
	private static ExcelReader excelReader;
	private static String url;
	private static String lgnTitle;
	private static String getCompanyInfo;
	
	private static String xlfile;
	private static String resPass="Pass";
	private static String resFail="Fail";
	private static final DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	
	private static WebElement loginTitle;
	private static int cSize;
	private static String userN;
	private static String xlSheetName = "LoginPage";
	
	 public static boolean checkCreateCompanyInLoginPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		System.out.println("***************************************************  checkCreateCompanyInLoginPage ******************************************************");
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(companyCreateBtn));
		
    	companyCreateBtn.click();
    	
    	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(adminName));
    	
    	boolean actAvbOfLoginCredentials = adminName.isDisplayed() && adminPassword.isDisplayed() && okButton.isDisplayed() && cancelButton.isDisplayed();
    	
        System.out.println("actAvbOfLoginCredentials"+actAvbOfLoginCredentials);
		String actDisplayingResult       = Boolean.toString(actAvbOfLoginCredentials);
		String actElementsIsDisplay      = actDisplayingResult.toUpperCase()+" ";
		excelReader.setCellData(xlfile, xlSheetName, 18, 8, actElementsIsDisplay);
					
		String expElementsIsDisplay					         = excelReader.getCellData(xlSheetName, 18, 7);
		
		System.out.println("Login Crednentials on Create Company Display Value Actual   : " + actElementsIsDisplay +  " Value Expected : " + expElementsIsDisplay);		    
	   
		if(actElementsIsDisplay.equalsIgnoreCase(expElementsIsDisplay))
	    {
		   excelReader.setCellData(xlfile, "LoginPage", 18, 9, resPass);
		   return true;
	    }
	    else
	    {
		   excelReader.setCellData(xlfile, "LoginPage", 18, 9, resFail);
		   return false;
	    }   	       
	    		
	 }
	 
	
	
	
	 public static boolean checkCompanyCreatePageFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		System.out.println("**********************************************  Company Creation Page *************************************************");
		
	    getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(adminPassword));
	    String getInputPassword  = excelReader.getCellData(xlSheetName, 19, 6);
		adminPassword.sendKeys(getInputPassword);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(okButton));
		okButton.click();
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(CompanyName));
		boolean actCompanyFields = CompanyName.isDisplayed() &&  calendarType.isDisplayed() && accountingDate.isDisplayed() &&  securityNormal.isDisplayed()
					&& securityLow.isDisplayed() && securityHigh.isDisplayed() && passwordSU.isDisplayed() && rememberLoginCredentials.isDisplayed()
					&& unAuthorizeUsers.isDisplayed() && globalCurrency.isDisplayed() && country.isDisplayed() && defaultLanguage.isDisplayed() 
					&& companyLogoImg.isDisplayed() && languagesEnglish.isDisplayed() && languagesEnglishSelected.isSelected()==true && languagesArabic.isDisplayed()
					&& languagesArabic.isEnabled() && languagesArabicSelected.isSelected()==false && languagesPersian.isDisplayed() && languagesPersianSelected.isSelected()==false
	                && languagesChinese.isDisplayed() && languagesChinese.isEnabled() && languagesChineseSelected.isSelected()==false 
	                && languagesSpanish.isDisplayed() && languagesSpanish.isEnabled() && languagesSpanishSelected.isSelected()==false
	                && languagesPortuguese.isDisplayed() && languagesPortuguese.isEnabled() && languagesPortugueseSelected.isSelected()==false
	                && languagesIndonesian.isDisplayed() && languagesIndonesian.isEnabled() && languagesIndonesianSelected.isSelected()==false
	                && okButtonInCreateCompany.isDisplayed() && okButtonInCreateCompany.isEnabled() && cancelButtonInCreateCompany.isDisplayed()
	                && companyMinimizeAndMaximize.isDisplayed() && companyMinimizeAndMaximize.isEnabled();
		
		
		
		 System.out.println("actCompanyFields"+ actCompanyFields);
		
		 String actDisplayingResult       = Boolean.toString(actCompanyFields);
		 String actElementsIsDisplay      = actDisplayingResult.toUpperCase()+" ";
		 excelReader.setCellData(xlfile, xlSheetName, 19, 8, actElementsIsDisplay);
		 String expElementsIsDisplay					         = excelReader.getCellData(xlSheetName, 19, 7);
			
		
		 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + actElementsIsDisplay +  " Value Expected : " + expElementsIsDisplay);		    
	       	
		 if(actElementsIsDisplay.equalsIgnoreCase(expElementsIsDisplay))
	     {
		   excelReader.setCellData(xlfile, "LoginPage", 19, 9, resPass);
		   return true;
	     }
	     else
	     {
		   excelReader.setCellData(xlfile, "LoginPage", 19, 9, resFail);
		   return false;
	     }																						 
      }
	 
	 
	 public static boolean checkOKButtonCompanyNameBlankInCreateCompany() throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 
		     String actCompanyNameMsgWithBlank					         = excelReader.getCellData(xlSheetName, 20, 7);
		 
		 
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(okButtonInCreateCompany));
			okButtonInCreateCompany.click();
		       
			String expCompanyNameMsgWithBlank=getCompanyNameError.getText();
			
			 excelReader.setCellData(xlfile, xlSheetName, 20, 8, expCompanyNameMsgWithBlank);
			
			
			 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + actCompanyNameMsgWithBlank +  " Value Expected : " + expCompanyNameMsgWithBlank);
			
			if(actCompanyNameMsgWithBlank.equalsIgnoreCase(expCompanyNameMsgWithBlank))
			{
				excelReader.setCellData(xlfile, xlSheetName, 20, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 20, 9, resFail);
				return false;
			}
			
			

	 }
	 
	
	 public static boolean checkOKButtonPasswordBlankInCreateCompany() throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 String mandatoryMessage= excelReader.getCellData(xlSheetName, 21, 7);
		
		 
		 String inputCompName=excelReader.getCellData(xlSheetName, 21, 6);
				 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(CompanyName));
		 CompanyName.sendKeys(inputCompName);
		 
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(okButtonInCreateCompany));
			okButtonInCreateCompany.click();
		       
		
			String erc=getPasswordErrorMsg.getText();
			 excelReader.setCellData(xlfile, xlSheetName, 21, 8, erc);
			
			 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + erc +  " Value Expected : " + mandatoryMessage);
			
			if(erc.equalsIgnoreCase(mandatoryMessage))
			{
				excelReader.setCellData(xlfile, xlSheetName, 21, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 21, 9, resFail);
				return false;
			}
		
	 }
	 
	 

		public static boolean checkCalenderTypeCountWithDisplayDefaultValue() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
			 String inputPassword=excelReader.getCellData(xlSheetName, 22, 6); 
			 
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(passwordSU));
			 passwordSU.sendKeys(inputPassword);
			 
			 //Finding the Count of the C2alender Type
			 Select oSelect = new Select(calendarType);
			 List <WebElement> elementCount = oSelect.getOptions();
			
			 int iSize = elementCount.size();
			 System.out.println("Calender Count :"+iSize);
			 
			 //Finding the Georgian in the Calender Type
			 String Strq= calendarType.getText();
				
			 boolean getCalenderValue=false;
			 String[] str= Strq.split("\n");     
		     
			 for(String st1 : str)
		     {
		    	  st1.equals("Georgian");
		    	  getCalenderValue=true;
		    	  break;
		     }		
			 
			 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + iSize +  " Value Expected : " + 4);
			 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + getCalenderValue +  " Value Expected : " + true);
	
			 if(iSize==4 && getCalenderValue==true)
			 {
				 excelReader.setCellData(xlfile, xlSheetName, 22, 9, resPass);
				 return true;
			 }
			 else
			 {
				 excelReader.setCellData(xlfile, xlSheetName, 22, 9, resFail);
				 return false;
			 }
		      
		}
		
		
		
		public static boolean checkCalenderTypeValues() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
			 String getExpCalenderValues=excelReader.getCellData(xlSheetName, 23, 6);
				
		     String getActualCalenderValues=calendarType.getText();
		     
		     System.out.println("Login Crednentials on Create Company Display Value Actual   : " + getActualCalenderValues +  " Value Expected : " + getExpCalenderValues);
		     
		     if(getExpCalenderValues.equalsIgnoreCase(getActualCalenderValues))
		     {
				 excelReader.setCellData(xlfile, xlSheetName, 23, 9, resPass);
				 return true;
			 }
			 else
			 {
				 
				 
				 excelReader.setCellData(xlfile, xlSheetName, 23, 9, resFail);
				 return false;
		     }
			
			
		}
		
		
		
		public static boolean checkAccountingDateFormat() throws EncryptedDocumentException, InvalidFormatException, IOException
		{

			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
			 
			datePicker.click();
			
			String getCalenderPopupDate=getDate.getText();

			String ConPopupDate=getCalenderPopupDate.replace("/", "-");
			
			Date date=new Date();
			
			String sysDate=sdf.format(date);
			
		    System.out.println("Login Crednentials on Create Company Display Value Actual   : " + ConPopupDate +  " Value Expected : " + sysDate);
			
			if(ConPopupDate.equalsIgnoreCase(sysDate))
			{
				excelReader.setCellData(xlfile, xlSheetName, 24, 9, resPass);
				 return true;
			}
			else
				
			{
				excelReader.setCellData(xlfile, xlSheetName, 24, 9, resFail);
				return false;
			}	
			
		}
		
		public static boolean checkCountry() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			//String getExpectedCountryValues=excelReader.getCellData(xlSheetName, 19, 6);
			
			String getActualCountryValues=country.getText();
			
			System.out.println("Country Combo box Values are : "+ getActualCountryValues);
			
			 boolean getCountryValue=false;
			 
			 String[] str= getActualCountryValues.split("\n");     
		      
			 for(String st1 : str)
		     {
		    	
		    	  st1.equals("India");
		    	  getCountryValue=true;
		    	  break;
		     }
			 
			 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + getCountryValue +  " Value Expected : " + true);
		      
		        if(getCountryValue=true)
		        {
		        	excelReader.setCellData(xlfile, xlSheetName, 25, 9, resPass);
					return true;
		        }
		        else
		        {
		        	excelReader.setCellData(xlfile, xlSheetName, 25, 9, resFail);
					return false;
		        }
		}
			
		
	 
	public static boolean checkCountOfCountryValues() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 Select oSelect = new Select(country);
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int iSize = elementCount.size();
		 System.out.println("Country Count :"+iSize);
		 
		 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + iSize +  " Value Expected : " + 290);
		 
		 if(iSize==290)
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 26, 9, resPass);
				return true;
		 }
		 else
	        {
	        	excelReader.setCellData(xlfile, xlSheetName, 26, 9, resFail);
				return false;
	        }
	}
		
		
	
	
	public static boolean checkGlobalCurrencyDefaultDisplayValue() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		String getActualGlobalCurrencyValues=globalCurrency.getText();
		
		System.out.println("Global Currency Combo box Values are : "+ getActualGlobalCurrencyValues);
		
		 boolean getGlobalCurrencyValue=false;
		 String[] str= getActualGlobalCurrencyValues.split("\n");    
	      
		 for(String st1 : str)
	      {
	    	
	    	  st1.equals("Indian Rupees, Rupees");
	    	  getGlobalCurrencyValue=true;
	    	  break;
	      }
	      
		 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + getGlobalCurrencyValue +  " Value Expected : " + true);
	      
	      if(getGlobalCurrencyValue=true)
	      {
	         excelReader.setCellData(xlfile, xlSheetName, 21, 9, resPass);
			 return true;
	      }
	      else
	      {
	         excelReader.setCellData(xlfile, xlSheetName, 21, 9, resFail);
			 return false;
	      }
	}
	
	
	
	
	public static boolean checkCountOfGlobalCurrencyValues() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 Select oSelect = new Select(globalCurrency);
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int iSize = elementCount.size();
		 System.out.println("Global Currency Count :"+iSize);
		 	     
		 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + iSize +  " Value Expected : " + 183);
		 
	     if( iSize==170)
	     {
			 excelReader.setCellData(xlfile, xlSheetName, 22, 9, resPass);
			 return true;
		 }
		 else
		 {
			 
			 
			 excelReader.setCellData(xlfile, xlSheetName, 22, 9, resFail);
			 return false;
	     }
		

	}
	
	
	
	
	
	
	
	public static boolean checkLanguagesOptionDefaultEnglishIsCheck() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		 boolean getDefaultLanguage=false;
		
		 Select oSelect = new Select(defaultLanguage);
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int glSize = elementCount.size();
		 System.out.println("Currency Count :"+glSize);

     	 String getDefaultLanguageValues=defaultLanguage.getText();

		 
		 String[] str= getDefaultLanguageValues.split("\n");    
		 
	      for(String st1 : str)
	      {
	    	
	    	  st1.equals("English");
	    	  getDefaultLanguage=true;
	    	  break;
	      }
	      
	      boolean actvalue=languagesEnglishSelected.isSelected() && glSize==1 && getDefaultLanguage==true;
	      boolean expvalue=true;
	     
	      System.out.println("Login Crednentials on Create Company Display Value Actual   : " + actvalue +  " Value Expected : " + expvalue);
	      
		if(actvalue==expvalue)
		{
			 excelReader.setCellData(xlfile, xlSheetName, 23, 9, resPass);
			 return true;
		 }
		 else
		 {
		
			 excelReader.setCellData(xlfile, xlSheetName, 23, 9, resFail);
			 return false;
         }
	
		
		
	}
	
	
	
	public static boolean checkDefaultLanguageBySelectingOtherLanguages() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 languagesArabic.click();
		 
		 languagesPersian.click();
		 
		 Select oSelect = new Select(defaultLanguage);
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int glSize = elementCount.size();
		 System.out.println("Default Language Count when Arabic and Persian is selected :"+glSize);

		 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + glSize +  " Value Expected : " + 3);
		 
			if(glSize==3 )
			{
				excelReader.setCellData(xlfile, xlSheetName, 24, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 24, 9, resFail);
				return false;
			}
	}
	
	
	public static boolean checkDefaultLanguageByUnSelectingOtherLanguages() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		


		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 
		 languagesPersian.click();
		 
		 Select oSelect = new Select(defaultLanguage);
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int glSize = elementCount.size();
		 System.out.println("Default Language Count when Arabic and Persian is selected :"+glSize);
		 
		 System.out.println("Login Crednentials on Create Company Display Value Actual   : " + glSize +  " Value Expected : " + 2);
		 
	      if(glSize==2 )
		  {
				excelReader.setCellData(xlfile, xlSheetName, 25, 9, resPass);
				return true;
		  }
		  else
		  {
				excelReader.setCellData(xlfile, xlSheetName, 25, 9, resFail);
				return false;
		  }
	
	
	}
	
	
	public static boolean checkClickOkButtonToDisplayCompanyCreationAlert() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		 String getExpectedCompanyCreationSucessfullyMsg="Company Created Successfully";
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companylgo));
	           
		 companylgo.click();
	     
	     Thread.sleep(3000);
	     
	     Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\FocusCompanyLogo.exe");
	     
	     Thread.sleep(3000);
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okButtonInCreateCompany));
	     
	     okButtonInCreateCompany.click();
	         
	     Thread.sleep(180000);
	     
	   
	     String actCompanySaveMsg=LoginPageCompanyCreationPage.getAlert().getText();
	     
	     System.out.println("Company message is displaying as "+ actCompanySaveMsg);
	     
	     if(getExpectedCompanyCreationSucessfullyMsg.equalsIgnoreCase(actCompanySaveMsg))
	     {	
	    	 LoginPageCompanyCreationPage.getAlert().accept();
	    	 excelReader.setCellData(xlfile, xlSheetName, 26, 9, resPass);
	    	 return true;
	     }
	     else
	     {
	    	 excelReader.setCellData(xlfile, xlSheetName, 26, 9, resFail);
	    	 return false;
	     }
	     
	}
	
	//Edit Company Fields check
	public boolean verifyAvailablityOfCreateCompanyFieldsInEditCompany() throws InterruptedException
	{
		System.out.println("****Begin check in the createcompanyfields");
		
		//boolean verifyFiledsStatus=true;
		
	    getWebDriverWait().until(ExpectedConditions.visibilityOf(CompanyName));
		
		//Thread.sleep(20000);
		
	     System.out.println("****Begin check in the after wait q"+CompanyName);
	     
			if(CompanyName.isDisplayed()&&CompanyName.isEnabled())
			{
				System.out.println("****Begin check in the CompanyName");
				
				System.out.println("Company Name is displayed and enabled ");
	
				
				 //getWebDriverWait().until(ExpectedConditions.visibilityOf(calendarType));
				
			/*	if(calendarType.isDisplayed() && calendarType.isEnabled())
				{
					System.out.println(calendarType.isDisplayed());
					System.out.println(calendarType.isEnabled());
					
					System.out.println("Calendar is displayed and enabled ");
					
					 getWebDriverWait().until(ExpectedConditions.visibilityOf(accountingDate));
				*/	
					if(accountingDate.isDisplayed() && accountingDate.isEnabled())
					{
						System.out.println("Accounting Date is displayed and enabled ");
					
						if(securityNormal.isDisplayed() && securityNormal.isEnabled())
						{
							System.out.println("Security Normal is displayed and enabled ");
					
							if(securityLow.isDisplayed() && securityLow.isEnabled())
							{
								System.out.println("Security Low is displayed and enabled ");
							
								if(securityHigh.isDisplayed() && securityLow.isEnabled())
								{
									System.out.println("Security High is displayed and enabled ");
												
									if(passwordSU.isDisplayed() && passwordSU.isEnabled())
									{
										System.out.println("Password is displayed and enabled ");
									
										if(rememberLoginCredentials.isDisplayed() && rememberLoginCredentials.isEnabled()&&rememberLoginCredentials.isSelected()==false)
										{
											System.out.println("Remember Login Credentials is displayed and enabled and Check box is uncheck by default ");
							
											if(unAuthorizeUsers.isDisplayed() && unAuthorizeUsers.isEnabled()&& unAuthorizeUsers.isSelected()==false)
											{
												System.out.println("Un Authorize Users is displayed and enabled and Check box is uncheck by default ");
													
												if(globalCurrency.isDisplayed() && globalCurrency.isEnabled())
												{
													System.out.println("Global Currency is displayed and enabled ");
																
													 if(country.isDisplayed() && country.isEnabled())
													 {
														System.out.println("Country is displayed and enabled ");
														
														/*if(defaultLanguage.isDisplayed()&&defaultLanguage.isEnabled())
														 {
															System.out.println("Default Language English is displayed and enabled and Selected");
														*/	
															if(companyLogo.isDisplayed() && companyLogo.isEnabled())
															 {
																System.out.println("Company Logo is displayed and enabled ");
																
/*																if(languagesEnglish.isDisplayed()&&languagesEnglish.isEnabled()&&languagesEnglish.isSelected()==true)
																 {
																	System.out.println("Languages Option English is displayed and enabled ");
																	*/	
																	/*if(languagesArabic.isDisplayed()&&languagesArabic.isEnabled()&&languagesArabic.isSelected()==false)
																	 {
																		System.out.println("Language Option Arabic is displayed and enabled ");
																	*/	
																		if(languagesPersian.isDisplayed() && languagesPersian.isEnabled()&&languagesPersianSelected.isSelected()==false)
																		 {
																			System.out.println("Language Option Persian is displayed and enabled ");
																			
																			if(languagesChinese.isDisplayed() && languagesChinese.isEnabled()&&languagesChineseSelected.isSelected()==false)
																			 {
																				System.out.println("Language Option Chinese is displayed and enabled ");
																			
																				if(languagesSpanish.isDisplayed() && languagesSpanish.isEnabled()&&languagesSpanishSelected.isSelected()==false)
																				 {
																					System.out.println("Language Option Spanish is displayed and enabled ");
																				
																					if(languagesPortuguese.isDisplayed() && languagesPortuguese.isEnabled()&&languagesPortugueseSelected.isSelected()==false)
																					 {
																						System.out.println("Language Option Portuguese is displayed and enabled ");
																						
																						if(languagesIndonesian.isDisplayed()&&languagesIndonesian.isEnabled()&&languagesIndonesianSelected.isSelected()==false)
																						 {
																							System.out.println("Language Option Indonesian is displayed and enabled ");
																							
																							if(okButtonInCreateCompany.isDisplayed()&&okButtonInCreateCompany.isEnabled())
																							 {
																								System.out.println("Ok Button is displayed and enabled ");
																								
																								if(cancelButtonInCreateCompany.isDisplayed()&&cancelButtonInCreateCompany.isEnabled())
																								 {
																									System.out.println("Cancel Button is displayed and enabled ");
																									
																									if(companyMinimizeAndMaximize.isDisplayed()&&companyMinimizeAndMaximize.isEnabled())
																									 {
																										System.out.println("Company Maxmize And Minimizs is displayed and enabled ");
																										return true;
																								     }
																									else 
																									{
																										System.out.println("Fail : Company Maxmize And Minimizs is displayed and enabled ");
																										return false;
																										
																							        }
																								 }
																								else 
																								{
																									System.out.println("Fail : Cancel Button is displayed and enabled ");
																									return false;
																									
																								}
																						     }
																						else 
																						{
																							System.out.println("Fail : Ok Button is displayed and enabled ");
																							return false;
																							//
																						}
																				     }
																				else 
																				{
																					
																					System.out.println("Fail : Language Option Indonesian is displayed and enabled ");
																					return false;
																					
																				}
																		     }
																			else 
																			{
																				System.out.println("Fail : Language Option Portuguese is displayed and enabled ");
																				return false;
																			
																			}
																	     }
																		else 
																		{
																			System.out.println("Fail : Language Option Spanish is displayed and enabled ");
																			return false;
																		}
																     }
																	else 
																	{
																		System.out.println("Fail : Language Option Chinese is displayed and enabled ");
																		return false;
																	}
															     }
																else 
																{
																	System.out.println("Fail : Language Option Persian is displayed and enabled ");
																	return false;
																}
														     }
															/*else 
															{
																System.out.println("Fail : Language Option Arabic is displayed and enabled ");
																return false;
															}
															
													     }*/
/*														else 
														{
															System.out.println("Fail : Languages Option English is displayed and enabled ");
															return false;
														}
												     }*/
													else 
													{
														System.out.println("Fail : Company Logo is displayed and enabled ");
														return false;
													}
												 }
/*												else 
												{
													System.out.println("Fail : Default Language English is displayed and enabled and Selected");
													return false;
												}
											 }*/
											else 
											{
												System.out.println("Fail : Country is displayed and enabled ");
												return false;
											}
											 
										}
										else 
										{
											System.out.println("Fail : Global Currency is displayed and enabled ");
											return false;
										}
									}
									else 
									{
										System.out.println("Fail : Un Authorize Users is displayed and enabled and Check box is uncheck by default ");
										return false;
									}
								}
								else 
								{
									System.out.println("Fail : Remember Login Credentials is displayed and enabled and Check box is uncheck by default ");
									return false;
								}
						     }
							else 
							{
								System.out.println("Fail : Password is displayed and enabled ");
								return false;
							}
					      }
						else 
						{
							System.out.println("Fail Security High is displayed and enabled ");
							return false;
						}
				      }
					else 
					{
						System.out.println("Fail : Security Low is displayed and enabled ");
						return false;
					}
				   }
				else 
				{
					System.out.println("Fail : Security Normal is displayed and enabled ");
					return false;
				}
			}
		 else 
		 {
			 System.out.println("Fail : Accounting Date is displayed and enabled ");
			 return false;
			}
		}		
/*		else 
		{
			System.out.println("Fail : Calendar is displayed and enabled ");
			return false;
		}
	 }*/
	else 
	{
		System.out.println("****stop check in the CompanyName");
		System.out.println("Fail : Company Name is displayed and enabled ");
		return false;
	}


  
			
  }
	
	
	public static void waitForAlert()
	{
		new WebDriverWait(getDriver(), 800).ignoring(NoAlertPresentException.class).until(ExpectedConditions.alertIsPresent());
	}
	
	
   public static Alert getAlert()
   {
		alert=getDriver().switchTo().alert();
		return alert;
   }
	
	
	
	 
	
    public LoginPageCompanyCreationPage(WebDriver driver)
    {
    	
    	PageFactory.initElements(driver, this);
    	
    }
	   
	
}
