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

public class HPInventoryMenuPage extends BaseEngine {

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

	@FindBy(xpath="//*[@id='135']/div/span")
	private static WebElement  inventoryMenu; 
	
		@FindBy(xpath="//a[@id='137']//span[contains(text(),'Transactions')]")
		private static WebElement  invTransactionsMenu; 
			
			@FindBy(xpath="//*[@id='139']/span")
			private static WebElement  invTransPurchasesMenu; 
		
				@FindBy(xpath="//*[@id='2010']/span")
				private static WebElement  requestForQuoteVoucher;
				
				@FindBy(xpath="//*[@id='2011']/span")
				private static WebElement  purchasesQuotationsVoucher;
					
				@FindBy(xpath="//*[@id='2012']/span")
				private static WebElement  purchasesOrdersVoucher;
			
				@FindBy(xpath="//*[@id='2013']/span")
				private static WebElement  materialReceiptNotesVoucher;
			
			@FindBy(xpath="//*[@id='140']/span")
			private static WebElement  invTransSalesMenu; 
		
				@FindBy(xpath="//*[@id='2018']/span")
				private static WebElement  salesQuotationsVoucher;
				
				@FindBy(xpath="//*[@id='2019']/span")
				private static WebElement  deliveryNotesVoucher;
				
				@FindBy(xpath="//*[@id='2022']/span")
				private static WebElement  posSalesVoucher;
				
				@FindBy(xpath="//*[@id='2045']/span")
				private static WebElement  productionOrdersVoucher;
				
				@FindBy(xpath="//*[@id='2017']/span")
				private static WebElement  salesOrdersVoucher;
					
			@FindBy(xpath="//*[@id='2033']/span")
			private static WebElement  invTransStocksMenu; 
				
				@FindBy(xpath="//*[@id='2034']/span")
				private static WebElement  shortagesInStockVoucher;
				
				@FindBy(xpath="//*[@id='2035']/span")
				private static WebElement  excessesInStocksVoucher;
					
				@FindBy(xpath="//*[@id='2036']/span")
				private static WebElement  stockTransfersVoucher;
				
				@FindBy(xpath="//*[@id='2037']/span")
				private static WebElement  openingStocksVoucher;
				
				@FindBy(xpath="//*[@id='2038']/span")
				private static WebElement  materialRequisitionVoucher;
						
				@FindBy(xpath="//*[@id='2049']/span")
				private static WebElement  stockAdjustmentVoucher;
			
			@FindBy(xpath="//*[@id='164']/span")
			private static WebElement  holdAndUnholdStockVoucher;
			
			@FindBy(xpath="//*[@id='93']/span")
			private static WebElement  stockReconciliation;
			
			@FindBy(xpath="//*[@id='99']/span")
			private static WebElement  stockAllocation;
			
		@FindBy(xpath="//a[@id='200']//span[contains(text(),'Reports')]")
		private static WebElement  inventoryReportsMenu; 
		
			@FindBy(xpath="//*[@id='202']/span")
			private static WebElement itemQuery;
			
			@FindBy(xpath="//*[@id='551']/span")
			private static WebElement  stockLedger;
			
			@FindBy(xpath="//*[@id='552']/span")
			private static WebElement  openingStocksRegister;
			
			@FindBy(xpath="//*[@id='557']/span")
			private static WebElement  stockStatement;
					
			@FindBy(xpath="//*[@id='575']/span")
			private static WebElement  stockMovement;
			
			@FindBy(xpath="//*[@id='576']/span")
			private static WebElement  multiLevelStockMovement;
			
			@FindBy(xpath="//*[@id='577']/span")
			private static WebElement  virtualStockAnalysis;
			
			@FindBy(xpath="//*[@id='578']/span")
			private static WebElement  stockValuation;
			
			@FindBy(xpath="//*[@id='656']/span")
			private static WebElement  stockReportByTag;
			
			@FindBy(xpath="//*[@id='579']/span")
			private static WebElement  abcAnalysis;
			
			@FindBy(xpath="//*[@id='580']/span")
			private static WebElement  stockAnalysisByBatch;
			
			@FindBy(xpath="//*[@id=581]/span")
			private static WebElement  stockAnalysisByRMA;
			
			@FindBy(xpath="//*[@id='540']/span")
			private static WebElement  binsReportMenu;
			
				@FindBy(xpath="//*[@id='587']/span")
				private static WebElement  stockDetailsByBins;
			
				@FindBy(xpath="//*[@id='588']/span")
				private static WebElement  stockBalancesByBins;
				
				@FindBy(xpath="//*[@id='589']/span")
				private static WebElement  stockBalancesByItemByBins;
				
				@FindBy(xpath="//*[@id='590']/span")
				private static WebElement  expiredStockByBins;		
			
			@FindBy(xpath="//*[@id='645']/span")
			private static WebElement  stockBalanceByWarehouse;
			
			@FindBy(xpath="//*[@id='621']/span")
			private static WebElement  stockAgeingAnalysisMenu;
				
				@FindBy(xpath="//*[@id='582']/span")
				private static WebElement  ageingAnalysis;
				
				@FindBy(xpath="//*[@id='622']/span")
				private static WebElement  ageingAnalysisByBatch;
				
				@FindBy(xpath="//*[@id='623']/span")
				private static WebElement  ageingAnalysisByRMA;		
				
				@FindBy(xpath="//*[@id='591']/span")
				private static WebElement  ageingStockByBins;
						
				@FindBy(xpath="//*[@id='646']/span")
				private static WebElement  ageingByItemByBins;		

			@FindBy(xpath="//*[@id='583']/span")
			private static WebElement reorderReport;
			
			@FindBy(xpath="//*[@id='584']/span")
			private static WebElement  fastMovingItem;
					
			@FindBy(xpath="//*[@id='585']/span")
			private static WebElement  slowMovingItem;
			
			@FindBy(xpath="//*[@id='586']/span")
			private static WebElement  peakORLowBalances;
			
			@FindBy(xpath="//*[@id='631']/span")
			private static WebElement  bestSellingItem;
		
			@FindBy(xpath="//*[@id='203']/span")
			private static WebElement  raiseIndentItemWithLowStock;
			
			@FindBy(xpath="//*[@id='649']/span")
			private static WebElement  stockTransferReport;
			
			@FindBy(xpath="//*[@id='260']/span")
			private static WebElement  raiseRequestForQuote;
			
			@FindBy(xpath="//*[@id='665']/span")
			private static WebElement  stockReservationReport;
			
			@FindBy(xpath="//*[@id='670']/span")
			private static WebElement  transactionTypeWiseStockReport;
		
		@FindBy(xpath="//span[contains(text(),'Order Management')]")
		private static WebElement  orderManagementMenu; 
	
			@FindBy(xpath="//*[@id='600']/span")
			private static WebElement  analysisOfLinkedORUnlinkedDocumentsMenu;
					
				@FindBy(xpath="//*[@id='601']/span")
				private static WebElement  listingOfDocuments;
				
				@FindBy(xpath="//*[@id='602']/span")
				private static WebElement listingOfDocumentsByDueDate;
						
				@FindBy(xpath="//*[@id='603']/span")
				private static WebElement  ageingOfPendingDocuments;
				
				@FindBy(xpath="//*[@id='604']/span")
				private static WebElement  ageingofPendingDocumentsByDueDate;
				
				@FindBy(xpath="//*[@id='624']/span")
				private static WebElement  linkChainAnalysis;
				
				@FindBy(xpath="//*[@id='657']/span")
				private static WebElement  pendingVoucherReport;
			
			@FindBy(xpath="//*[@id='201']/span")
			private static WebElement  quotationAnalysis;
			
			@FindBy(xpath="//*[@id='555']/span")
			private static WebElement  purchasesQuotation;
			
			@FindBy(xpath="//*[@id='556']/span")
			private static WebElement  salesQuotation;
			
			@FindBy(xpath="//*[@id='574']/span")
			private static WebElement  lowestQuotation;
			
			@FindBy(xpath="//*[@id='553']/span")
			private static WebElement  purchasesOrders;		
			
			@FindBy(xpath="//*[@id='554']/span")
			private static WebElement  salesOrders;
		
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
			
			public static boolean checkInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
		    	
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
				inventoryMenu.click();
				
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
				
				if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
			    		getDashboard.equalsIgnoreCase("Dashboard") && invTransactionsMenu.isDisplayed() && inventoryReportsMenu.isDisplayed() && orderManagementMenu.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 123, 9, resPass);
					return true;
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 123, 9, resFail);
	    			return false;
	    		}
			}
			
			
	
			public static boolean checkTransactionMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
				
				 invTransactionsMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransPurchasesMenu));
				
				if(invTransPurchasesMenu.isDisplayed() && invTransSalesMenu.isDisplayed() && invTransStocksMenu.isDisplayed() &&
						holdAndUnholdStockVoucher.isDisplayed() && stockReconciliation.isDisplayed() &&
						stockAllocation.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 124, 9, resPass);
					return true;
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 124, 9, resFail);
	    			return false;
	    		}
			}
			

			
			
			
			
			public static boolean checkPurchasesMenuInTransactionMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransPurchasesMenu));
				
				 invTransPurchasesMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(requestForQuoteVoucher));
				
				if(requestForQuoteVoucher.isDisplayed() && purchasesQuotationsVoucher.isDisplayed() && purchasesOrdersVoucher.isDisplayed() &&
						materialReceiptNotesVoucher.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 125, 9, resPass);
					return true;
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 125, 9, resFail);
	    			return false;
	    		}
			}
			
			
			
			
			public static boolean checkSalesMenuInTransactionMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransSalesMenu));
				
				 invTransSalesMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesQuotationsVoucher));
				
				if(salesQuotationsVoucher.isDisplayed() && deliveryNotesVoucher.isDisplayed() && posSalesVoucher.isDisplayed() &&
						productionOrdersVoucher.isDisplayed()  && salesOrdersVoucher.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 126, 9, resPass);
					return true;
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 126, 9, resFail);
	    			return false;
	    		}
			}
			
			
			//Here Stock Adjustment Voucher is missing, creation company in web (in desktop its coming)
			
			public static boolean checkStocksMenuInTransactionMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransStocksMenu));
				
				 invTransStocksMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(shortagesInStockVoucher));
				
				if(shortagesInStockVoucher.isDisplayed() && excessesInStocksVoucher.isDisplayed() && stockTransfersVoucher.isDisplayed() &&
						openingStocksVoucher.isDisplayed()  && materialRequisitionVoucher.isDisplayed() && stockAdjustmentVoucher.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 127, 9, resPass);
					return true;
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 127, 9, resFail);
	    			return false;
	    		}
			}
			
			
			
			public static boolean checkReportsMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
				
				 inventoryReportsMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemQuery));
				
				if(itemQuery.isDisplayed() && stockLedger.isDisplayed() && openingStocksRegister.isDisplayed() &&
						stockStatement.isDisplayed()  && stockMovement.isDisplayed() && multiLevelStockMovement.isDisplayed() &&
						virtualStockAnalysis.isDisplayed() && stockValuation.isDisplayed() && stockReportByTag.isDisplayed() &&
						abcAnalysis.isDisplayed() && stockAnalysisByBatch.isDisplayed() && stockAnalysisByRMA.isDisplayed() &&
						binsReportMenu.isDisplayed() && stockBalanceByWarehouse.isDisplayed() && stockAgeingAnalysisMenu.isDisplayed() &&
						reorderReport.isDisplayed() && fastMovingItem.isDisplayed() && slowMovingItem.isDisplayed() &&
						peakORLowBalances.isDisplayed() && bestSellingItem.isDisplayed() && raiseIndentItemWithLowStock.isDisplayed() &&
						stockTransferReport.isDisplayed() && raiseRequestForQuote.isDisplayed() && stockReservationReport.isDisplayed() &&
						transactionTypeWiseStockReport.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 128, 9, resPass);
					return true;
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 128, 9, resFail);
	    			return false;
	    		}
			}
	
			
			public static boolean checkBinReportsMenuInReportsMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(binsReportMenu));
				
				 binsReportMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockDetailsByBins));
				
				if(stockDetailsByBins.isDisplayed() && stockBalancesByBins.isDisplayed() && stockBalancesByItemByBins.isDisplayed() &&
						expiredStockByBins.isDisplayed() )
				{
					excelReader.setCellData(xlfile, "Sheet1", 129, 9, resPass);
					return true;
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 129, 9, resFail);
	    			return false;
	    		}
			}
			

			
			
	
  
			public static boolean checkAgeingAnalysisMenuReportsMenuInReportsMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockAgeingAnalysisMenu));
				
				 stockAgeingAnalysisMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ageingAnalysis));
				
				if(ageingAnalysis.isDisplayed() && ageingAnalysisByBatch.isDisplayed() && ageingAnalysisByRMA.isDisplayed() &&
						ageingStockByBins.isDisplayed() && ageingByItemByBins.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 130, 9, resPass);
					return true;
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 130, 9, resFail);
	    			return false;
	    		}
			}
	
			

			public static boolean checkOrderManagementMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(orderManagementMenu));
				
				 orderManagementMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
				
				if(analysisOfLinkedORUnlinkedDocumentsMenu.isDisplayed() && quotationAnalysis.isDisplayed() && purchasesQuotation.isDisplayed() &&
						salesQuotation.isDisplayed() && lowestQuotation.isDisplayed() && purchasesOrders.isDisplayed() &&
						salesOrders.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 131, 9, resPass);
					return true;
	    		}
	    		else
	    		{
	    			excelReader.setCellData(xlfile, "Sheet1", 131, 9, resFail);
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
			
			
			public static boolean checkAnalysisOfLinkedAndUnlinkedMenuInOrderManagementMenuInInventoryMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(analysisOfLinkedORUnlinkedDocumentsMenu));
				
				 analysisOfLinkedORUnlinkedDocumentsMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(listingOfDocuments));
				
				if(listingOfDocuments.isDisplayed() && listingOfDocumentsByDueDate.isDisplayed() && 
						ageingOfPendingDocuments.isDisplayed() && ageingofPendingDocumentsByDueDate.isDisplayed() && 
						linkChainAnalysis.isDisplayed() && pendingVoucherReport.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 132, 9, resPass);
					 
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
	    			excelReader.setCellData(xlfile, "Sheet1", 132, 9, resFail);
	    			return false;
	    		}
			}
			
	   
    public HPInventoryMenuPage(WebDriver driver)
    {	
    	PageFactory.initElements(driver, this);
    	
    }
	
}
