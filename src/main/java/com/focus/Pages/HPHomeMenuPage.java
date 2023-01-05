package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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


public class HPHomeMenuPage extends BaseEngine
{

	private static String getPatchDateTime;
	private static LoginPage lp;
	private static LoginPageCompanyCreationPage lpcc;
	private static ExcelReader excelReader;
	private static String url;
	private static String lgnTitle;
	private static String getCompanyInfo;

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;
	
	@FindBy(xpath="//*[@id='mainHeader_MainLayout']/a/img")
	private static WebElement focusLogo;
	
	@FindBy(xpath="//*[@id='id_focus8_wrapper_default']/aside/section")
	private static WebElement menuBar;
	
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboardName;
	
	@FindBy(xpath="//*[@id='dashIcons']")
	private static WebElement dashboardIcons;
	
	@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;

    
   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
	private static WebElement userNameDisplay;*/
	
	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;
	
	@FindBy(xpath="//*[@id='ddlCompanyLangualges_MainLayout']")
	private static WebElement languageDropdownInLogout;
	
	@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	private static WebElement logoutOption;
	
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;
	
	@FindBy(xpath="//ul[@id='ulCompanyDetails_HomePage']")
	private static WebElement companydetails;
	
	//Home Menu
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;

	//Financial Menu
	@FindBy (xpath="//span[@class='icon-financial icon-font1']")
    private static WebElement financialMenu;
	
	//Inventory Menu
	@FindBy (xpath="//span[@class='icon-inventory icon-font1']")
    private static WebElement inventoryMenu;
	
	//Fixed Assets Menu
	@FindBy (xpath="//span[@class='icon-assets icon-font1']")
    private static WebElement fixedAssetsMenu;
	
	//Production Menu
	@FindBy (xpath="//span[@class='icon-production icon-font1']")
    private static WebElement productionMenu;
	
	//Point Of Sale Menu
	@FindBy (xpath="//div[contains(text(),'Point of Sale')]")
    private static WebElement pointOfSaleMenu;
	
	//Quality Of Control Menu
	@FindBy (xpath="//span[@class='icon-quotationanalysis icon-font1']")
    private static WebElement qualityControlMenu;
	
	//Settings Menu
	@FindBy (xpath="//span[@class='icon-settings icon-font1']")
	private static WebElement SettingsMenu;
	
	    //Company Menu
		@FindBy (xpath="//*[@id='2']/span")
	    private static WebElement companyMenu;
		
			@FindBy (xpath="//*[@id='129']/span")
		    private static WebElement openCompany;
			  
			   @FindBy (xpath="//*[@id='id_login_div']/div[5]/button[1]")
			   private static WebElement cancelInLoginScreenOfOpenCompany;
			   
			   @FindBy (xpath="//*[@id='login_div']/div[1]/div[2]/ul/li[1]/a/i")
			   private static WebElement createCompanyScreenOfOpenCompany;	    
			   
			@FindBy (xpath="//*[@id='3']/span")
		    private static WebElement newCompanyMenu;
		
			   @FindBy (xpath="//*[@id='130']/span")
			   private static WebElement createCompany;
			   
			      @FindBy (xpath="//*[@id='page_Content']/form/div/div[1]/nav/div/div[1]/a/div/span[2]")
			      private static WebElement CreateCompanyTitle;
			      
			      @FindBy (xpath="//*[@id='btn_common_header']/div[2]/div[1]/span")
			      private static WebElement cancelButtonInCreateCompany;
			      
			      @FindBy (xpath="//*[@id='company_Languages']/div[3]/label")
			      private static WebElement chkBoxPersianLanguage;			      
			      
			      @FindBy (xpath="//*[@id='btnUpdateLanguage']/div[1]/span")
			      private static WebElement btnUpdateLanguage;
			      
			@FindBy (xpath="//*[@id='107']/span")
			private static WebElement editCompany;
			  
				 @FindBy (xpath="//*[@id='CompanyName']")
				 private static WebElement getCompanyNameTextInEditScreen;
				 
				 @FindBy (xpath="//*[@id='CreatedDate']")
				 private static WebElement companyDateInEditCompany;
				 
				 @FindBy(xpath="//*[@id='btn_common_header']/div[2]/div[1]/span")
				 private static WebElement okButtonInEditCompanyScreen;
				 
				 @FindBy(xpath="//*[@id='btn_common_header']/div[3]/div[1]")
				 private static WebElement cancelButtonInEditCompanyScreen;
				 
			@FindBy (xpath="//*[@id='131']/span")
			private static WebElement yearEndProcess;

			   @FindBy (xpath="//*[@id='87']/span")
			   private static WebElement closeCompany;
			   			   
			   @FindBy (xpath="//span[contains(text(),'Transfer Balances to P&L')]")
			   private static WebElement transferBalanceToPAndL;
			   
			   @FindBy (xpath="//*[@id='146']/span")
			   private static WebElement updateCogs;
			
			
			@FindBy (xpath="//*[@id='125']/span")
			private static WebElement ineterCompanyTransactions;
			
			   @FindBy (xpath="//*[@id='103']/span")
			   private static WebElement interCompanySettings;

			   @FindBy (xpath="//*[@id='29']/span")
			   private static WebElement mappings;
			   
			   @FindBy (xpath="//*[@id='30']/span")
			   private static WebElement inboxAndOutbox;

			   @FindBy (xpath="//*[@id='126']/span")
			   private static WebElement oflineImport;
			   
		//Security Menu	
		@FindBy (xpath="//*[@id='6']/span")
	    private static WebElement securityMenu;
		
			@FindBy (xpath="//*[@id='7']/span")
			private static WebElement networkPolicy;
			
			@FindBy (xpath="//*[@id='8']/span")
			private static WebElement passwordPolicy;
			
			@FindBy (xpath="//*[@id='9']/span")
			private static WebElement createProfile;
			
			@FindBy (xpath="//*[@id='10']/span")
			private static WebElement createRole;
			
			@FindBy (xpath="//*[@id='11']/span")
			private static WebElement createUser;
			
			@FindBy (xpath="//*[@id='12']/span")
			private static WebElement changePassword;
			
			@FindBy (xpath="//*[@id='13']/span")
			private static WebElement updatePersonalInfo;
			
			@FindBy (xpath="//*[@id='14']/span")
			private static WebElement usageLog;
			
			@FindBy (xpath="//*[@id='644']/span")
			private static WebElement userRightsReport;
			
			@FindBy (xpath="//*[@id='652']/span")
			private static WebElement roleRightsReport;
			
			@FindBy (xpath="//*[@id='653']/span")
			private static WebElement profileRightsReport;
		
		//Masters Menu	
		@FindBy (xpath="//*[@id='1000']/span")
	    private static WebElement mastersMenu;
		
			@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
			private static WebElement accounts;
	
			@FindBy (xpath="//*[@id='220']/span")
			private static WebElement currency;
	
				@FindBy (xpath="//*[@id='70']/span")
				private static WebElement currencyMaster;
		
				@FindBy (xpath="//*[@id='71']/span")
				private static WebElement exchangeRate;
		
				@FindBy (xpath="//*[@id='233']/span")
				private static WebElement exchangeRateHistory;
	
			@FindBy (xpath="//*[@id='221']/span")
			private static WebElement products;
	
				@FindBy (xpath="//*[@id='1105']/span")
				private static WebElement productsMaster;
		
				@FindBy (xpath="//*[@id='1114']/span")
				private static WebElement units;
		
				@FindBy (xpath="//*[@id='72']/span")
				private static WebElement unitsConversion;
		
				@FindBy (xpath="//*[@id='76']/span")
				private static WebElement sellerPriceBook;
		
				@FindBy (xpath="//*[@id='80']/span")
				private static WebElement buyerPriceBook;
		
				@FindBy (xpath="//*[@id='18']/span")
				private static WebElement barcodeDefinition;
	
			@FindBy (xpath="//*[@id='224']/span")
			private static WebElement mrp;
			
				@FindBy (xpath="//*[@id='1116']/span")
				private static WebElement plant;
		
				@FindBy (xpath="//*[@id='1117']/span")
				private static WebElement supplyArea;
		
				@FindBy (xpath="//*[@id='1118']/span")
				private static WebElement maintainanceParameter;
		
				@FindBy (xpath="//*[@id='1119']/span")
				private static WebElement safetyInstructions;
		
				@FindBy (xpath="//*[@id='1120']/span")
				private static WebElement capacity;
		
				@FindBy (xpath="//*[@id='1121']/span")
				private static WebElement workCenter;
		
				@FindBy (xpath="//*[@id='1122']/span")
				private static WebElement holiday;
		
				@FindBy (xpath="//*[@id='1162']/span")
				private static WebElement process;
				
				
			@FindBy (xpath="//a[@id='225']//span[contains(text(),'QC')]")
			private static WebElement qc;
	
				@FindBy (xpath="//*[@id='1123']/span")
				private static WebElement qzFailureReason;
		
				@FindBy (xpath="//*[@id='1163']/span")
				private static WebElement qcParameters;
	
			@FindBy (xpath="//*[@id='251']/span")
			private static WebElement maintainance;
	
				@FindBy (xpath="//*[@id='1164']/span")
				private static WebElement breakDownStandardReason;
		
			@FindBy (xpath="//*[@id='8001']/span")
			private static WebElement pointOfSale;
	
				@FindBy (xpath="//*[@id='8005']/span")
				private static WebElement member;
		
					@FindBy (xpath="//*[@id='8009']/span")
					private static WebElement memberCardRegistration;
			
					@FindBy (xpath="//*[@id='1148']/span")
					private static WebElement memberType;
			
					@FindBy (xpath="//*[@id='1152']/span")
					private static WebElement memberMaster;
			
					@FindBy (xpath="//*[@id='1159']/span")
					private static WebElement memberCardDefinition;
	
	
				@FindBy (xpath="//*[@id='8006']/span")
				private static WebElement giftVoucher;
		
					@FindBy (xpath="//*[@id='8011']/span")
					private static WebElement giftVoucherRegistration;
			
					@FindBy (xpath="//*[@id='1149']/span")
					private static WebElement giftVoucherDefinition;
		
				
				@FindBy (xpath="//*[@id='8035']/span")
				private static WebElement discountVoucher;
		
					@FindBy (xpath="//*[@id='8034']/span")
					private static WebElement discountVoucherRegistration;
			
					@FindBy (xpath="//*[@id='1153']/span")
					private static WebElement discountVoucherDefinition;
		
	
				@FindBy (xpath="//*[@id='1025']/span")
				private static WebElement tableManagement;
		
					@FindBy (xpath="//*[@id='1154']/span")
					private static WebElement floor;
			
					@FindBy (xpath="//*[@id='1155']/span")
					private static WebElement section;
			
					@FindBy (xpath="//*[@id='1156']/span")
					private static WebElement table;
			
					@FindBy (xpath="//*[@id='1157']/span")
					private static WebElement guest;
			
					@FindBy (xpath="//*[@id='1158']/span")
					private static WebElement voidRemarks;

				@FindBy (xpath="//*[@id='1146']/span")
				private static WebElement outlet;
					
				@FindBy (xpath="//*[@id='1147']/span")
				private static WebElement counter;
			
				@FindBy (xpath="//*[@id='1150']/span")
				private static WebElement category;
			
				@FindBy (xpath="//*[@id='1151']/span")
				private static WebElement bankCardType;
					
				@FindBy (xpath="//*[@id='1160']/span")
				private static WebElement returnRemarks;
				
				@FindBy (xpath="//span[contains(text(),'Kitchen Display System')]")
				private static WebElement kitchenDisplaySystem;
			
				@FindBy (xpath="//span[contains(text(),'Delivery Time Interval')]")
				private static WebElement deliveryTimeInterval;
					
				@FindBy (xpath="//span[contains(text(),'E- Payment')]")
				private static WebElement epayment;
			
			
			@FindBy (xpath="//*[@id='1103']/span")
			private static WebElement payroll;
	
				@FindBy (xpath="//*[@id='1128']/span")
				private static WebElement employeeMaster;
		
				@FindBy (xpath="//*[@id='1130']/span")
				private static WebElement postionMaster;
		
				@FindBy (xpath="//*[@id='1131']/span")
				private static WebElement qualification;
		
				@FindBy (xpath="//*[@id='1132']/span")
				private static WebElement specialization;
		
				@FindBy (xpath="//*[@id='1133']/span")
				private static WebElement nationality;
		
				@FindBy (xpath="//*[@id='1134']/span")
				private static WebElement skillType;
		
				@FindBy (xpath="//*[@id='1135']/span")
				private static WebElement skill;
		
				@FindBy (xpath="//*[@id='1136']/span")
				private static WebElement sourceType;
		
				@FindBy (xpath="//*[@id='1137']/span")
				private static WebElement sourceMaster;
		
				@FindBy (xpath="//*[@id='1138']/span")
				private static WebElement roundTypeMaster;
		
				@FindBy (xpath="//*[@id='1139']/span")
				private static WebElement gradeMaster;
				
				@FindBy (xpath="//*[@id='1140']/span")
				private static WebElement scaleMaster;
				
				@FindBy (xpath="//*[@id='1141']/span")
				private static WebElement courseType;
				
				@FindBy (xpath="//*[@id='1165']/span")
				private static WebElement Trainer;
				
				@FindBy (xpath="//*[@id='1166']/span")
				private static WebElement airlineSector;

			@FindBy (xpath="//*[@id='1106']/span")
			private static WebElement departments;
	
			@FindBy (xpath="//*[@id='1107']/span")
			private static WebElement warehouse;
	
			@FindBy (xpath="//*[@id='1108']/span")
			private static WebElement costcenter;
	
			@FindBy (xpath="//*[@id='1109']/span")
			private static WebElement location;
	
			@FindBy (xpath="//*[@id='1110']/span")
			private static WebElement region;
	
			@FindBy (xpath="//*[@id='1111']/span")
			private static WebElement country;
	
			@FindBy (xpath="//*[@id='1112']/span")
			private static WebElement state;
	
			@FindBy (xpath="//*[@id='1113']/span")
			private static WebElement city;
	
			@FindBy (xpath="//*[@id='1115']/span")
			private static WebElement bins;
	
			@FindBy (xpath="//*[@id='1126']/span")
			private static WebElement insurance;
	
			@FindBy (xpath="//*[@id='1127']/span")
			private static WebElement fixedassets;
			
			@FindBy (xpath="//*[@id='1161']/span")
			private static WebElement taxCode;
		
	    //DataManagement menu
		@FindBy (xpath="//*[@id='25']/span")
	    private static WebElement dataMangementMenu;
		
			@FindBy (xpath="//*[@id='26']/span")
			private static WebElement backup;
				
			@FindBy (xpath="//*[@id='27']/span")
			private static WebElement restore;
			
			@FindBy (xpath="//*[@id='111']/span")
			private static WebElement reindex;
			
			@FindBy (xpath="//*[@id='115']/span")
			private static WebElement eraseAll;
			
			@FindBy (xpath="//*[@id='216']/span")
			private static WebElement lockAndUnlock;
		
	    //Utilities Menu		
		@FindBy (xpath="//*[@id='20']/span")
	    private static WebElement utilities;
		
			@FindBy (xpath="//*[@id='21']/span")
		    private static WebElement calendar;
			
			@FindBy (xpath="//*[@id='22']/span")
		    private static WebElement reportDesigner;
		
			@FindBy (xpath="//*[@id='23']/span")
		    private static WebElement scheduleReport;
			
			@FindBy (xpath="//*[@id='112']/span")
		    private static WebElement renumberVouchers;
			
			@FindBy (xpath="//*[@id='114']/span")
		    private static WebElement repostVouchers;

			@FindBy (xpath="//*[@id='122']/span")
		    private static WebElement adjustForeginExchange;
			
			@FindBy (xpath="//*[@id='128']/span")
		    private static WebElement transactionImport;
			
			@FindBy (xpath="//*[@id='106']/span")
		    private static WebElement dataStatistics;
					
			@FindBy (xpath="//*[@id='149']/span")
		    private static WebElement ediGeneration;
			
			@FindBy (xpath="//*[@id='160']/span")
		    private static WebElement standardRate;
			
			@FindBy (xpath="//*[@id='647']/span")
		    private static WebElement authorizationDetails;
			
			@FindBy (xpath="//*[@id='259']/span")
		    private static WebElement regroup;
			
			@FindBy (xpath="//*[@id='3319']/span")
		    private static WebElement releaseReveration;
			
		    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
			private static WebElement noIn;
			
			private static String xlfile;
			private static String resPass="Pass";
			private static String resFail="Fail";
			private static final DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			
			
			public static boolean checkHomePageMenuLoginAfterChangePassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				LoginPage lp=new LoginPage(getDriver()); 
				
		        String unamelt=excelReader.getCellData("Sheet1", 73, 6);
		      
		        String pawslt=excelReader.getCellData("Sheet1", 74, 6);
		      
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
		    	
		    		if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
		    			getDashboard.equalsIgnoreCase("Dashboard") &&
		    			homeMenu.isDisplayed() && financialMenu.isDisplayed() && inventoryMenu.isDisplayed() && 
						fixedAssetsMenu.isDisplayed() && productionMenu.isDisplayed() && pointOfSaleMenu.isDisplayed() &&
					       qualityControlMenu.isDisplayed() && SettingsMenu.isDisplayed())
		    		{

		    			
						excelReader.setCellData(xlfile, "Sheet1", 73, 9, resPass);
						return true;
		    			
		    		
		    		}
		    		else
		    		{
		    			
		    		
		    			excelReader.setCellData(xlfile, "Sheet1", 73, 9, resFail);
		    			return false;
		    		}
			}
			
			
			
			
			
			public static boolean checkHomeMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			    homeMenu.click();
				
				if(companyMenu.isDisplayed() && securityMenu.isDisplayed() && mastersMenu.isDisplayed() && utilities.isDisplayed() && dataMangementMenu.isDisplayed())
				{
					
					excelReader.setCellData(xlfile, "Sheet1", 75, 9, resPass);
					return true;
	    		
	    		 }
	    		 else
	    		 {
	    			
	    		
	    			excelReader.setCellData(xlfile, "Sheet1", 75, 9, resFail);
	    			return false;
	    		 }
			}
			
			
			public static boolean checkCompanyMenuInHomeMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
                getWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				
				homeMenu.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyMenu));
				
				companyMenu.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(openCompany));
				
				   if(openCompany.isDisplayed() && newCompanyMenu.isDisplayed() && editCompany.isDisplayed() && yearEndProcess.isDisplayed() && ineterCompanyTransactions.isDisplayed())
				   {
						
						excelReader.setCellData(xlfile, "Sheet1", 76, 9, resPass);
						return true;
		    			
		    		
		    		}
		    		else
		    		{
		    			
		    		
		    			excelReader.setCellData(xlfile, "Sheet1", 76, 9, resFail);
		    			return false;
		    		}
					
				   
				}
				
				
			
			public static boolean checkCreateCompanyInNewCompanyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException 
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCompanyMenu));
				  
				  newCompanyMenu.click();
				  
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(createCompany));
				  
				  if(createCompany.isDisplayed())
				  {
					  excelReader.setCellData(xlfile, "Sheet1", 77, 9, resPass);
					  return true;
				  }
				  else
				  {
					  excelReader.setCellData(xlfile, "Sheet1", 77, 9, resFail);
		    		  return false;
				  }
				  
				
			}
			
			
			public static boolean checkYearEndProcessInCompanyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(yearEndProcess));
					
				  yearEndProcess.click();
				
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeCompany));
				 
				  
				  if(closeCompany.isDisplayed() && transferBalanceToPAndL.isDisplayed() && updateCogs.isDisplayed())
				  {
					  excelReader.setCellData(xlfile, "Sheet1", 78, 9, resPass);
					  return true;
				  }  
				  else
				  {
					  excelReader.setCellData(	xlfile, "Sheet1", 78, 9, resFail);
		    		  return false;
		    		  
					 
				  }	 	  
			}
			
			
			
			public static boolean checkInterCompanyMenuOptions() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ineterCompanyTransactions));
					
				  ineterCompanyTransactions.click();
				
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(interCompanySettings));
				 
				  
				  if(interCompanySettings.isDisplayed() && mappings.isDisplayed() && inboxAndOutbox.isDisplayed() && oflineImport.isDisplayed())
				  {
					  excelReader.setCellData(xlfile, "Sheet1", 79, 9, resPass);
					  return true;
				  }  
				  else
				  {
					  excelReader.setCellData(	xlfile, "Sheet1", 79, 9, resFail);
		    		  return false;
		    		  
					   
				  }	 	  
			}
			
			
			
			
			
			
			
		public static boolean checkSecuritySubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		    getWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
				
		    securityMenu.click();
				
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(networkPolicy));
				
				   if(networkPolicy.isDisplayed() && passwordPolicy.isDisplayed() && createProfile.isDisplayed() && 
						   createRole.isDisplayed() && createUser.isDisplayed() && changePassword.isDisplayed() &&
						   updatePersonalInfo.isDisplayed() && usageLog.isDisplayed() && userRightsReport.isDisplayed() &&
						   roleRightsReport.isDisplayed() && profileRightsReport.isDisplayed())
				   {
						  excelReader.setCellData(xlfile, "Sheet1", 80, 9, resPass);
						  //securityMenu.click();
						  return true;
				   }  
				   else
				   {
						  excelReader.setCellData(	xlfile, "Sheet1", 80, 9, resFail);
						  //securityMenu.click();
			    		  return false;
				   }
					   	
			}
			
			
			
			public static boolean checkMastersSubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException
			{

				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
					
					mastersMenu.click();					
					  
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
					
					if(accounts.isDisplayed() && currency.isDisplayed() && products.isDisplayed() && mrp.isDisplayed() && qc.isDisplayed() &&
							maintainance.isDisplayed() && pointOfSale.isDisplayed() && payroll.isDisplayed() && costcenter.isDisplayed() &&
							location.isDisplayed() && region.isDisplayed() && country.isDisplayed() && state.isDisplayed() && city.isDisplayed() &&
							bins.isDisplayed() && insurance.isDisplayed() && fixedassets.isDisplayed()&& taxCode.isDisplayed())
					{
						  
						  excelReader.setCellData(xlfile, "Sheet1", 81, 9, resPass);
						  return true;
					}  
					else
					{
						 
						  excelReader.setCellData(	xlfile, "Sheet1", 81, 9, resFail);
			    		  return false;	   
					}
						     												     
		    }
			
			
			
			public static boolean checkCurrencyInMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(currency));
					
				  currency.click();				 
			
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMaster));
				  
				  if(currencyMaster.isDisplayed() && exchangeRate.isDisplayed() && exchangeRateHistory.isDisplayed())
				  {
					  
					  excelReader.setCellData(xlfile, "Sheet1", 82, 9, resPass);
					  return true;
				}  
				else
				{
					 
					  excelReader.setCellData(	xlfile, "Sheet1", 82, 9, resFail);
		    		  return false;	   
				}
				  
					  
			 }
			
			
			public static boolean verifyProductSubMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(products));
					
				  products.click();

				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(productsMaster));
				 
				  
				  if(productsMaster.isDisplayed() && units.isDisplayed() && unitsConversion.isDisplayed() && sellerPriceBook.isDisplayed() && buyerPriceBook.isDisplayed() && barcodeDefinition.isDisplayed())
				  {
					
					excelReader.setCellData(xlfile, "Sheet1", 83, 9, resPass);
					return true;
				  }  
				  else
				  {
					
					excelReader.setCellData(	xlfile, "Sheet1", 83, 9, resFail);
		    		return false;	   
				  }
			 }

			
			
			public static boolean verifyMRPSubMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(mrp));
					
				  mrp.click();
				  
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(plant));
				  
				  if(plant.isDisplayed() && supplyArea.isDisplayed() && maintainanceParameter.isDisplayed() && 
						  safetyInstructions.isDisplayed() && capacity.isDisplayed() && workCenter.isDisplayed() && 
						  holiday.isDisplayed() && process.isDisplayed())
				  {
					
					excelReader.setCellData(xlfile, "Sheet1", 84, 9, resPass);
					return true;
				  }  
				  else
				  {
					
					excelReader.setCellData(	xlfile, "Sheet1", 84, 9, resFail);
		    		return false;	   
				  }
			 }
			
			
			public static boolean verifyQCSubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
										
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
				
				
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(qc));
				  
				  qc.click();
				  
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(qzFailureReason));
				  
				  if(qzFailureReason.isDisplayed() && qcParameters.isDisplayed())
				  {
					   
						excelReader.setCellData(xlfile, "Sheet1", 85, 9, resPass);
						return true;
					  }  
					  else
					  {
					
						excelReader.setCellData(xlfile, "Sheet1", 85, 9, resFail);
			    		return false;	 
				  }
				  
				
			}
			
			
			public static boolean verifyMaintainanceSubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
	
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(maintainance));
				  
				  maintainance.click();
				  
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(breakDownStandardReason));
				  
				  if(breakDownStandardReason.isDisplayed())
				  {
					    
						excelReader.setCellData(xlfile, "Sheet1", 86, 9, resPass);
						return true;
					  }  
					  else
					  {
						  
						excelReader.setCellData(xlfile, "Sheet1", 86, 9, resFail);
			    		return false;	 
				  }
				  
				
			}
			
			public static boolean verifyPointOfSaleSubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				Thread.sleep(2000);
				
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSale));
					
				  pointOfSale.click();
				
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(member));
				  
				  if(member.isDisplayed() && giftVoucher.isDisplayed() && discountVoucher.isDisplayed() && 
						  tableManagement.isDisplayed() &&  outlet.isDisplayed() && counter.isDisplayed() &&
						  category.isDisplayed() && bankCardType.isDisplayed() && returnRemarks.isDisplayed() &&
						  kitchenDisplaySystem.isDisplayed() && deliveryTimeInterval.isDisplayed() && 
						  epayment.isDisplayed() )
				  {
				
						excelReader.setCellData(xlfile, "Sheet1", 87, 9, resPass);
						return true;
					  }  
					  else
					  {
						 
						excelReader.setCellData(xlfile, "Sheet1", 87, 9, resFail);
			    		return false;	 
				  }
		   }
			
			public static boolean checkMemberMasterMenuInPointOfSale() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				  
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(member));
					
				  member.click();
				  
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(memberCardRegistration));
			
				  if(memberCardRegistration.isDisplayed() && memberType.isDisplayed() && memberMaster.isDisplayed() && 
						  memberCardDefinition.isDisplayed())
				  {
					 
						excelReader.setCellData(xlfile, "Sheet1", 88, 9, resPass);
						return true;
				  }  
				  else
				  {
						 
						excelReader.setCellData(xlfile, "Sheet1", 88, 9, resFail);
			    		return false;	 
				  }
		   }
			
			

			
			
			public static boolean checkGiftVoucherMasterMenuInPointOfSale() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				  
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(giftVoucher));
					
				  giftVoucher.click();
			
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(giftVoucherRegistration));
				  
				  if(giftVoucherRegistration.isDisplayed() && giftVoucherDefinition.isDisplayed())
				  {
					   
						excelReader.setCellData(xlfile, "Sheet1", 89, 9, resPass);
						return true;
				  }  
				  else
				  {
					  
						excelReader.setCellData(xlfile, "Sheet1", 89, 9, resFail);
			    		return false;	 
				  }
		   }
			
		
			
			
			public static boolean checkDiscountVoucherMasterMenuInPointOfSale() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(discountVoucher));
					
				  discountVoucher.click();
			
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(discountVoucherRegistration));
					
				  
				  if(discountVoucherRegistration.isDisplayed() && discountVoucherDefinition.isDisplayed())
				  {
					    
						excelReader.setCellData(xlfile, "Sheet1", 90, 9, resPass);
						return true;
				  }  
			      else
			      {
			    	 
					  excelReader.setCellData(xlfile, "Sheet1", 90, 9, resFail);
			    	  return false;	 
				  }
		   }
	
	

			
			
			public static boolean checkTableManagementMasterMenuInPointOfSale() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				  
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(discountVoucher));
					
				  tableManagement.click();
			
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(floor));
				  
				  if(floor.isDisplayed() && section.isDisplayed() && table.isDisplayed() && guest.isDisplayed() && voidRemarks.isDisplayed())
				  {
					 pointOfSale.click();
					 excelReader.setCellData(xlfile, "Sheet1", 91, 9, resPass);
					 return true;
				  }  
				  else
				  {
					 pointOfSale.click();
					 excelReader.setCellData(xlfile, "Sheet1", 91, 9, resFail);
			    	 return false;	 
				  }
		   }
			
			
			
	
			
			
			public static boolean verifyPayrollSubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				   Thread.sleep(4000);
				
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(payroll));
					payroll.click();
					
					Thread.sleep(4000);
					 
					/*Actions actions = new Actions(getDriver()); 
					actions.moveToElement(sourceMaster);
					actions.perform();
					*/
					
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(employeeMaster));
					  
					if(employeeMaster.isDisplayed() && postionMaster.isDisplayed() && qualification.isDisplayed() && 
							specialization.isDisplayed() && nationality.isDisplayed() && skillType.isDisplayed() &&
							skill.isDisplayed() && sourceType.isDisplayed() && sourceMaster.isDisplayed() && 
							roundTypeMaster.isDisplayed() && gradeMaster.isDisplayed() && scaleMaster.isDisplayed() &&
							courseType.isDisplayed() && Trainer.isDisplayed() && airlineSector.isDisplayed())
					 {
						
						excelReader.setCellData(xlfile, "Sheet1", 92, 9, resPass);
						return true;
					  }  
					  else
					  {
					    
						excelReader.setCellData(xlfile, "Sheet1", 92, 9, resFail);
			    		return false;	 
				  }
									     												     
		    }
			
			

			
			
			

			public static boolean checkDataManagementSubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
				
				dataMangementMenu.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(backup));
	
				   if(backup.isDisplayed() && restore.isDisplayed() && reindex.isDisplayed() && eraseAll.isDisplayed() && lockAndUnlock.isDisplayed())
				   {
					   dataMangementMenu.click();
					   excelReader.setCellData(xlfile, "Sheet1", 93, 9, resPass);
					   return true;
					}  
					else
					{
					   dataMangementMenu.click();
					   excelReader.setCellData(	xlfile, "Sheet1", 93, 9, resFail);
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
			
			
			public static boolean checkUtilitiesSubMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
				
				utilities.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(calendar));
			
				  if(calendar.isDisplayed() && reportDesigner.isDisplayed() && scheduleReport.isDisplayed() && 
					   renumberVouchers.isDisplayed() && adjustForeginExchange.isDisplayed() && repostVouchers.isDisplayed() &&
					   transactionImport.isDisplayed() &&   dataStatistics.isDisplayed() && ediGeneration.isDisplayed() &&
					   standardRate.isDisplayed() && authorizationDetails.isDisplayed() && regroup.isDisplayed() && 
					   releaseReveration.isDisplayed())
				  {
					   utilities.click();
					   excelReader.setCellData(xlfile, "Sheet1", 94, 9, resPass);
					   
					   Thread.sleep(3000);
		    			
		    			  //here loging out
		    			  getWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		    			  userNameDisplay.click();
		    			  
		    			  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		    			  logoutOption.click();
		    			 
		    			  boolean verifyFiledsStatus=true;
		    				
		    			  getWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		    				
		    			  if(username.isDisplayed() && password.isDisplayed()&& companyDropDownList.isDisplayed() && signIn.isDisplayed())
		    			  {	
    						excelReader.setCellData(xlfile, "Sheet1", 72, 9, resPass);
    						return true;
		    			  }
		    			  else
		    			  {
    						excelReader.setCellData(xlfile, "Sheet1", 72, 9, resFail);
    						return false;
		    			  }
					}  
					else
					{
					   utilities.click();
					   excelReader.setCellData(	xlfile, "Sheet1", 94, 9, resFail);
			    	   return false;   
					}
				}


			
			
			
			
			
			
			
			

			
			
			
	
		    
			   
		    public HPHomeMenuPage(WebDriver driver)
		    {
		    	
		    	PageFactory.initElements(driver, this);
		    	
		    }
			
     }


