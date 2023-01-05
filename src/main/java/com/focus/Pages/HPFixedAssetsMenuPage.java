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



public class HPFixedAssetsMenuPage extends BaseEngine
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

		
		@FindBy(xpath="//*[@id='136']/div/span")
		private static WebElement  FixedAssetMenu;   
	
			@FindBy(xpath="//*[@id='138']/span")
			private static WebElement  FixedAssetTransactionMenu;  
		
				@FindBy(xpath="//*[@id='50002']/span")
				private static WebElement  assetUsage; 
				
				@FindBy(xpath="//*[@id='50006']/span")
				private static WebElement addAssetValue; 
				
				@FindBy(xpath="//*[@id='50007']/span")
				private static WebElement  reduceAssetValue; 
				
				@FindBy(xpath="//*[@id='50005']/span")
				private static WebElement  disposalOfAssets; 
				
				@FindBy(xpath="//*[@id='50009']/span")
				private static WebElement  postDepreciationEntries; 
				
				@FindBy(xpath="//*[@id='50008']/span")
				private static WebElement  capitalizationofAsset; 
					
				@FindBy(xpath="//*[@id='50003']/span")
				private static WebElement  multipleAssetUsage; 
				
				@FindBy(xpath="//*[@id='50011']/span")
				private static WebElement  addDepreciationYears; 
				
				@FindBy(xpath="//*[@id='50012']/span")
				private static WebElement  transferOfAssetRequest; 
				
				@FindBy(xpath="//*[@id='50004']/span")
				private static WebElement  transferOfAsset;
				
				@FindBy(xpath="//*[@id='50010']/span")
				private static WebElement  fixedAssetReportsMenu;
				
					@FindBy(xpath="//*[@id='614']/span")
					private static WebElement  transferofAsset;
				
					@FindBy(xpath="//*[@id='615']/span")
					private static WebElement  assetsUsage;
					
					@FindBy(xpath="//*[@id='616']/span")
					private static WebElement  addAssetsValue;
					
					@FindBy(xpath="//*[@id='618']/span")
					private static WebElement  componentAdded;
					
					@FindBy(xpath="//*[@id='617']/span")
					private static WebElement  reduceAssetsValue;
					
					@FindBy(xpath="//*[@id='619']/span")
					private static WebElement  componentReduced;
				
					@FindBy(xpath="//*[@id='620']/span")
					private static WebElement  disposalofAsset;
					
					@FindBy(xpath="//*[@id='612']/span")
					private static WebElement  fixedAssetReport;
					
					@FindBy(xpath="//*[@id='613']/span")
					private static WebElement  depreciationSchedule;
				
				@FindBy(xpath="//*[@id='50013']/span")
				private static WebElement disposalOfAssetRequest;
				
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
				
				public static boolean checkFixedAssetsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FixedAssetMenu));
					
					 FixedAssetMenu.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FixedAssetTransactionMenu));
					
					if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
				    		getDashboard.equalsIgnoreCase("Dashboard") && FixedAssetTransactionMenu.isDisplayed())
					{
						excelReader.setCellData(xlfile, "Sheet1", 133, 9, resPass);
						return true;
		    		}
		    		else
		    		{
		    			excelReader.setCellData(xlfile, "Sheet1", 133, 9, resFail);
		    			return false;
		    		}
				}
				
				
				
				public static boolean checkTransactionMenuInFixedAssetsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(FixedAssetTransactionMenu));
					
					 FixedAssetTransactionMenu.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(assetUsage));
					
					if(assetUsage.isDisplayed() && addAssetValue.isDisplayed() && reduceAssetValue.isDisplayed() &&
							disposalOfAssets.isDisplayed() && postDepreciationEntries.isDisplayed() &&
							capitalizationofAsset.isDisplayed() && multipleAssetUsage.isDisplayed() && 
							addDepreciationYears.isDisplayed() && addDepreciationYears.isDisplayed() &&
							transferOfAsset.isDisplayed() && fixedAssetReportsMenu.isDisplayed() &&
							disposalOfAssetRequest.isDisplayed())
					{
						excelReader.setCellData(xlfile, "Sheet1", 134, 9, resPass);
						return true;
		    		}
		    		else
		    		{
		    			excelReader.setCellData(xlfile, "Sheet1", 134, 9, resFail);
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
				
				
				public static boolean checkReportsMenuInTransactionsMenuInFixedAssetsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetReportsMenu));
					
					 fixedAssetReportsMenu.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(transferofAsset));
					
					if(transferofAsset.isDisplayed() && assetsUsage.isDisplayed() && addAssetsValue.isDisplayed() &&
							componentAdded.isDisplayed() && reduceAssetsValue.isDisplayed() &&
							componentReduced.isDisplayed() && disposalofAsset.isDisplayed() && 
							addDepreciationYears.isDisplayed() && addDepreciationYears.isDisplayed() &&
							fixedAssetReport.isDisplayed() && depreciationSchedule.isDisplayed())
					{
						excelReader.setCellData(xlfile, "Sheet1", 135, 9, resPass);
						
						  //here loging out
		    			  getWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		    			  userNameDisplay.click();
		    			  
		    			  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		    			  logoutOption.click();
		    			 
		    			  boolean verifyFiledsStatus=true;
		    				
		    			  getWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		    				
		    			  if(username.isDisplayed() && password.isDisplayed()&& companyDropDownList.isDisplayed() && signIn.isDisplayed())
		    			  {	
							excelReader.setCellData(xlfile, "Sheet1", 132, 9, resPass);
							return true;
		    			  }
		    			  else
		  	    		{
		  	    			excelReader.setCellData(xlfile, "Sheet1", 132, 9, resFail);
		  	    			return false;
		  	    		}
		    		}
		    		else
		    		{
		    			excelReader.setCellData(xlfile, "Sheet1", 135, 9, resFail);
		    			return false;
		    		}
				}
				
				
				
				
				
				
				
				
				
		
				public HPFixedAssetsMenuPage(WebDriver driver)
			    {	
			    	PageFactory.initElements(driver, this);
			    	
			    }
				

}
