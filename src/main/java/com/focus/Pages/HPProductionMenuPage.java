package com.focus.Pages;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class HPProductionMenuPage extends BaseEngine 
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
	

	@FindBy(xpath="//*[@id='3000']/div/div")
	private static WebElement  productionMenu; 
	
		@FindBy(xpath="//*[@id='3001']/span")
		private static WebElement  productionTransactionsMenu; 

			@FindBy(xpath="//*[@id='206']/span")
			private static WebElement  billofMaterial; 
		
			@FindBy(xpath="//*[@id='2040']/span")
			private static WebElement  issuestoProduction; 
			
			@FindBy(xpath="//*[@id='2047']/span")
			private static WebElement  jobOrder; 
			
			@FindBy(xpath="//*[@id='2041']/span")
			private static WebElement  receiptsFromProduction; 
			
			@FindBy(xpath="//*[@id='3003']/span")
			private static WebElement  plannedIndependentRequirement; 
			
			@FindBy(xpath="//*[@id='2042']/span")
			private static WebElement  productionProcess; 
			
			@FindBy(xpath="//*[@id='3004']/span")
			private static WebElement  pendingProductionOrder; 
			
			@FindBy(xpath="//*[@id='2043']/span")
			private static WebElement  jobWorkIssues; 
			
			@FindBy(xpath="//*[@id='3002']/span")
			private static WebElement  productionOrders; 
			
			@FindBy(xpath="//*[@id='2044']/span")
			private static WebElement  jobWorkReceipts; 
			
			@FindBy(xpath="//*[@id='2048']/span")
			private static WebElement  returnsFromShopFloor; 
			
			@FindBy(xpath="//*[@id='3037']/span")
			private static WebElement  refreshRates; 
			
		@FindBy(xpath="//*[@id='625']/span")
		private static WebElement  productionReportsMenu; 
		
			@FindBy(xpath="//*[@id='626']/span")
			private static WebElement  consumptionRegister; 
			
			@FindBy(xpath="//*[@id='627']/span")
			private static WebElement  productionRegister; 
			
			@FindBy(xpath="//*[@id='650']/span")
			private static WebElement  bomDetailReport; 
			
			@FindBy(xpath="//*[@id='643']/span")
			private static WebElement  consumptionSummary; 
			
			@FindBy(xpath="//*[@id='633']/span")
			private static WebElement  productionSummary; 
			
			@FindBy(xpath="//*[@id='635']/span")
			private static WebElement  replenishmentReport;
			
			@FindBy(xpath="//*[@id='636']/span")
			private static WebElement  workInProcessReport;
			
			@FindBy(xpath="//*[@id='637']/span")
			private static WebElement  workInProcessSummary;
			
			@FindBy(xpath="//*[@id='638']/span")
			private static WebElement  itemWiseWorkInProcess;
			
			@FindBy(xpath="//*[@id='639']/span")
			private static WebElement  standardProductionCost;
			
			@FindBy(xpath="//*[@id='640']/span")
			private static WebElement  productionAnalysisByProductionBatch;
			
			@FindBy(xpath="//*[@id='641']/span")
			private static WebElement  productionCostingAndVarianceAnalysis;
			
			@FindBy(xpath="//*[@id='642']/span")
			private static WebElement  productionForecastingPlan;
		
			@FindBy(xpath="//*[@id='651']/span")
			private static WebElement  productionOrderStatusReport;
			
		@FindBy(xpath="//*[@id='3006']/span")
		private static WebElement  ProductionMRPSettingsMenu; 
		
			@FindBy(xpath="//*[@id='3013']/span")
			private static WebElement  productionOrderSeries;
			
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
	
		public static boolean checkProductionMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
			
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionMenu));
			
			 productionMenu.click();
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionTransactionsMenu));
			
			if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
		    		getDashboard.equalsIgnoreCase("Dashboard") && productionTransactionsMenu.isDisplayed() && productionReportsMenu.isDisplayed() && 
					ProductionMRPSettingsMenu.isDisplayed())
			{
				excelReader.setCellData(xlfile, "Sheet1", 136, 9, resPass);
				return true;
    		}
    		else
    		{
    			excelReader.setCellData(xlfile, "Sheet1", 136, 9, resFail);
    			return false;
    		}
		}
		
		public static boolean checkTransactionMenuInProductionMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionTransactionsMenu));
			
			 productionTransactionsMenu.click();
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(billofMaterial));
			
			if(billofMaterial.isDisplayed() && issuestoProduction.isDisplayed() && jobOrder.isDisplayed() &&
					receiptsFromProduction.isDisplayed() && plannedIndependentRequirement.isDisplayed() &&
					productionProcess.isDisplayed() && pendingProductionOrder.isDisplayed() && 
					jobWorkIssues.isDisplayed() && productionOrders.isDisplayed() &&
					jobWorkReceipts.isDisplayed() && returnsFromShopFloor.isDisplayed() &&
					refreshRates.isDisplayed())
			{
				excelReader.setCellData(xlfile, "Sheet1", 137, 9, resPass);
				return true;
    		}
    		else
    		{
    			excelReader.setCellData(xlfile, "Sheet1", 137, 9, resFail);
    			return false;
    		}
		}
		
	
		
			
		
		
		
		public static boolean checkReportsMenuInProductionsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionReportsMenu));
			
			 productionReportsMenu.click();
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(consumptionRegister));
			
			if(consumptionRegister.isDisplayed() && productionRegister.isDisplayed() && bomDetailReport.isDisplayed() &&
					consumptionSummary.isDisplayed() && productionSummary.isDisplayed() &&
					replenishmentReport.isDisplayed() && workInProcessReport.isDisplayed() && 
					workInProcessSummary.isDisplayed() && itemWiseWorkInProcess.isDisplayed() &&
					standardProductionCost.isDisplayed() && productionAnalysisByProductionBatch.isDisplayed() &&
					productionCostingAndVarianceAnalysis.isDisplayed() && productionForecastingPlan.isDisplayed() &&
					productionOrderStatusReport.isDisplayed())
			{
				excelReader.setCellData(xlfile, "Sheet1", 138, 9, resPass);
				return true;
    		}
    		else
    		{
    			excelReader.setCellData(xlfile, "Sheet1", 138, 9, resFail);
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

			
			public static boolean checkMRPSettingMenuInProductionsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ProductionMRPSettingsMenu));
				
				 ProductionMRPSettingsMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionOrderSeries));
				
				if(productionOrderSeries.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 139, 9, resPass);
					   
					  //here loging out
	    			  getWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
	    			  userNameDisplay.click();
	    			  
	    			  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	    			  logoutOption.click();
	    			 
	    			  boolean verifyFiledsStatus=true;
	    				
	    			  getWebDriverWait().until(ExpectedConditions.visibilityOf(username));
	    				
	    			  if(username.isDisplayed() && password.isDisplayed()&& companyDropDownList.isDisplayed() && signIn.isDisplayed())
	    			  {	
						excelReader.setCellData(xlfile, "Sheet1", 139, 9, resPass);
						return true;
	    			  }
	    			  else
	  	    		{
	  	    			excelReader.setCellData(xlfile, "Sheet1", 139, 9, resFail);
	  	    			return false;
	  	    		}
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 139, 9, resFail);
	    			return false;
	    		}
			}
			
			
			
			
			
			
	
			public HPProductionMenuPage(WebDriver driver)
		    {	
		    	PageFactory.initElements(driver, this);
		    	
		    }
			

	
}
