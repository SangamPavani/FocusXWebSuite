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

public class HPSettingsMenuPage extends BaseEngine 
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
	
	
	
	@FindBy(xpath="//*[@id='16']/div/div")
	private static WebElement  settingsMenu;   

		@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
		private static WebElement  settingsConfigureTransactions;   
		
		@FindBy(xpath="//*[@id='68']/span")
		private static WebElement  settingsTransactionAuthorization;
		
		@FindBy(xpath="//*[@id='235']/span")
		private static WebElement  settingsPricebookAuthorization;
		
		@FindBy(xpath="//*[@id='19']/span")
		private static WebElement  settingsConfigureMasters;
		
		@FindBy(xpath="//*[@id='67']/span")
		private static WebElement  settingsMasterAuthorization;
	
		@FindBy(xpath="//*[@id='69']/span")
		private static WebElement  settingsCreditLimitAuthorization;
		
		@FindBy(xpath="//*[@id='74']/span")
		private static WebElement  settingsDesignWorkflow;
		
		@FindBy(xpath="//*[@id='105']/span")
		private static WebElement  settingsSettingsWizard;
		
		@FindBy(xpath="//*[@id='232']/span")
		private static WebElement  settingsBatchCodeGeneration;
		
		@FindBy(xpath="//*[@id='34']/span")
		private static WebElement  settingsMapCreditLimit;
		
		@FindBy(xpath="//*[@id='257']/span")
		private static WebElement  settingsVATTaxCode;
		
		@FindBy(xpath="//*[@id='258']/span")
		private static WebElement  settingsCustomerPortalAdmin;
		
		@FindBy(xpath="//*[@id='3308']/span")
		private static WebElement  settingsBudgetAuthorization;
		
		@FindBy(xpath="//*[@id='3320']/span")
		private static WebElement  settingsPaymentGatewayIntegration;
		
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
		
	    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
		private static WebElement noIn;	
	
	public static boolean checkSettingsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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

		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		 
    	if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
	    		getDashboard.equalsIgnoreCase("Dashboard") && settingsMenu.isDisplayed())
			 
	   {
		
		 settingsMenu.click();
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureTransactions));
		
		 if(settingsConfigureTransactions.isDisplayed() && settingsTransactionAuthorization.isDisplayed() && 
				 settingsPricebookAuthorization.isDisplayed() && settingsConfigureMasters.isDisplayed() && 
				 settingsMasterAuthorization.isDisplayed() && settingsCreditLimitAuthorization.isDisplayed() && 
				 settingsDesignWorkflow.isDisplayed() && settingsSettingsWizard.isDisplayed() && 
				 settingsBatchCodeGeneration.isDisplayed() && settingsMapCreditLimit.isDisplayed() && 
				 settingsVATTaxCode.isDisplayed() && settingsCustomerPortalAdmin.isDisplayed() && 
				 settingsPaymentGatewayIntegration.isDisplayed())

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
				excelReader.setCellData(xlfile, "Sheet1", 159, 9, resPass);
				return true;
			  }
			  else
			  {
				 excelReader.setCellData(xlfile, "Sheet1", 159, 9, resFail);
				 return false;
			  }
			
		   }
		   else
		   {
				excelReader.setCellData(xlfile, "Sheet1", 159, 9, resFail);
				return false;
			}
		   }
	      else
		 {
				excelReader.setCellData(xlfile, "Sheet1", 159, 9, resFail);
				return false;
		  }

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	public HPSettingsMenuPage(WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	
	}
		

	
	
	
	
	
	
}
