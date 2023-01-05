package com.focus.Pages;

import com.focus.base.BaseEngine;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;



public class HPQualityControlMenuPage extends BaseEngine 
{

	private static String getPatchDateTime;
	private static LoginPage lp;
	private static LoginPageCompanyCreationPage lpcc;
	private static ExcelReader excelReader;
	private static String url;
	private static String lgnTitle;
	private static String getCompanyInfo;
	private static String xlfile;
	private static String resPass="Pass";
	private static String resFail="Fail";
	
	
    @FindBy(xpath="//span[@class='icon-quotationanalysis icon-font1']")
	private static WebElement  qualityControlMenu;  
    
	    @FindBy(xpath="//*[@id='151']/span")
		private static WebElement  qualityControlTransactionMenu;  
		
			@FindBy(xpath="//*[@id='4001']/span")
			private static WebElement  qualityControlTransTestDefinition;  
			
			@FindBy(xpath="//*[@id='4002']/span")
			private static WebElement  qualityControlTransMapTestToProducts;  
			
			@FindBy(xpath="//*[@id='4003']/span")
			private static WebElement  qualityControlTransRequisition;  
		
			@FindBy(xpath="//*[@id='4004']/span")
			private static WebElement  qualityControlTransSampleCheck;
		
		    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
			private static WebElement noIn;	
			
		    @FindBy(xpath="//span[@class='hidden-xs']")
			private static WebElement userNameDisplay;

		    
		   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
			private static WebElement userNameDisplay;*/

			@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
			private static WebElement companyName;

			@FindBy(xpath="//*[@id='companyLogo']")
			private static WebElement companyLogo;
		    
			@FindBy(xpath="//*[@id='dashName']")
			private static WebElement dashboard;
	
			public static boolean checkQualityConrolMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
                LoginPage lp=new LoginPage(getDriver()); 
				
		        String unamelt="su";
		      
		        String pawslt="su";
		      
		        LoginPage.enterUserName(unamelt);
		
		        LoginPage.enterPassword(pawslt);
		  
		        LoginPage.clickOnSignInBtn();
		        
		        Thread.sleep(9000);
		        

		        if(noIn.isDisplayed())
				{

					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(noIn));
					noIn.click();
					Thread.sleep(5000);
					
				}
		           	
		    	String userInfo=userNameDisplay.getText();
		    	
		    	System.out.println("User Info : "+userInfo);
		    	
		    	System.out.println("User Info Capture Text :"+userNameDisplay.getText());
		    	
		    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		    	
		    	companyLogo.click();
		    	
		    	String getCompanyTxt=companyName.getText();
		    	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		    	System.out.println("company name :"+ getLoginCompanyName);
		    	companyLogo.click();
		    	
		    	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
		    	
		    	String getDashboard=dashboard.getText();
		    	
		    	System.out.println(getDashboard);
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(qualityControlMenu));
				
				 
				
				if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
			    		getDashboard.equalsIgnoreCase("Dashboard") && qualityControlMenu.isDisplayed())
					 
			   {
				 
				qualityControlMenu.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(qualityControlTransactionMenu));
				
				if(qualityControlTransactionMenu.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 157, 9, resPass);
					return true;
				}
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 157, 9, resFail);
					return false;
				}
			   }
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 157, 9, resFail);
					return false;
				}
			}
	

			
			
			
			


			@FindBy(xpath="//*[@id='txtUsername']")
			private static WebElement username;

			@FindBy(id="txtPassword")
			private static WebElement password;
			
		    @FindBy(id="ddlCompany")
		    private static WebElement companyDropDownList;

			@FindBy(id="btnSignin")
			private static WebElement signIn;
			
			@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
			private static WebElement logoutOption;
			
			
			
			public static boolean checkTransactioMenuInQualityConrolMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(qualityControlTransactionMenu));
				
				qualityControlTransactionMenu.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(qualityControlTransTestDefinition));
				
				if(qualityControlTransTestDefinition.isDisplayed() && qualityControlTransMapTestToProducts.isDisplayed() &&
						qualityControlTransRequisition.isDisplayed() && qualityControlTransSampleCheck.isDisplayed())
				{
					
					  //here loging out
	    			  getWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
	    			  userNameDisplay.click();
	    			  
	    			  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	    			  logoutOption.click();
	    			 
	    			  boolean verifyFiledsStatus=true;
	    				
	    			  getWebDriverWait().until(ExpectedConditions.visibilityOf(username));
	    				
	    			  if(username.isDisplayed() && password.isDisplayed()&& companyDropDownList.isDisplayed() && signIn.isDisplayed())
	    			  {	
						excelReader.setCellData(xlfile, "Sheet1", 158, 9, resPass);
						return true;
	    			  }
	    			  else
	  	    		{
	  	    			excelReader.setCellData(xlfile, "Sheet1", 158, 9, resFail);
	  	    			return false;
	  	    		}
				}
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 158, 9, resFail);
					return false;
				}
			}
	
	
	
			
			
			
			
			
	
	
	
		    
			public HPQualityControlMenuPage(WebDriver driver)
			{	
			PageFactory.initElements(driver, this);
			
			}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
