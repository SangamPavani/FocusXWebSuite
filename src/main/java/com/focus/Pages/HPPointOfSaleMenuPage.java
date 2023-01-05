package com.focus.Pages;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;



public class HPPointOfSaleMenuPage extends BaseEngine 
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
	
	
	@FindBy(xpath="//*[@id='8000']/div/div")
	private static WebElement  pointOfSaleMenu; 

		@FindBy(xpath="//*[@id='8004']/span")
		private static WebElement  pointOfSaleMainScreenMenu; 
		
		    @FindBy(xpath="//*[@id='8031']/span")
			private static WebElement  pointOfSale; 
			
		    @FindBy(xpath="//*[@id='8032']/span")
			private static WebElement  pointOfSaleCustomization; 
			
		    @FindBy(xpath="//*[@id='8910']/span")
			private static WebElement  posMainScreenCustomization; 
		
		@FindBy(xpath="//*[@id='8500']/span")
		private static WebElement  pointOfSalePOSReportsMenu; 
		
		    @FindBy(xpath="//*[@id='8501']/span")
			private static WebElement  posReportsRetailSalesReportsMenu; 
		   
			    @FindBy(xpath="//*[@id='8502']/span")
			   	private static WebElement  posReportsRetailSalesAnalysis; 
				
			    @FindBy(xpath="//*[@id='8503']/span")
			   	private static WebElement  posReportsRetailSalesByOutlet; 
				
			    @FindBy(xpath="//*[@id='8504']/span")
			   	private static WebElement  posReportsRetailSalesByCounter; 
				
			    @FindBy(xpath="//*[@id='8505']/span")
			   	private static WebElement  posReportsRetailSalesByItem; 	
				
			    @FindBy(xpath="//*[@id='8506']/span")
			   	private static WebElement  posReportsRetailSalesTransactionAnalysis; 
			
		    @FindBy(xpath="//*[@id='8507']/span")
			private static WebElement  posReportsSummarySalesReportMenu; 
				    
			    @FindBy(xpath="//*[@id='8508']/span")
			   	private static WebElement  posReportsSummarySalesReportSalesByDate; 
				
			    @FindBy(xpath="//*[@id='8567']/span")
			   	private static WebElement  posReportsSummarySalesReportSalesByOutlet; 
				
			    @FindBy(xpath="//*[@id='8509']/span")
			   	private static WebElement  posReportsSummarySalesReportSalesByItem; 
				
			    @FindBy(xpath="//*[@id='8510']/span")
			   	private static WebElement  posReportsSummarySalesReportSalesByQuantity; 
						
			    @FindBy(xpath="//*[@id='8511']/span")
			   	private static WebElement  posReportsSummarySalesReportSalesByAmount; 
							
			    @FindBy(xpath="//*[@id='8512']/span")
			   	private static WebElement  posReportsSummarySalesReportSalesByQuantityByAmount; 
				
			    @FindBy(xpath="//*[@id='8539']/span")
			   	private static WebElement  posReportsSummarySalesReportSalesWalkinORPreorderBySales; 			
				
			    @FindBy(xpath="//*[@id='8541']/span")
			   	private static WebElement  posReportsSummarySalesReportPaymentByModeSales; 
				
			    @FindBy(xpath="//*[@id='8579']/span")
			   	private static WebElement  posReportsSummarySalesReportPaymentByModeSummary; 				
		    
		    @FindBy(xpath="//*[@id='8513']/span")
			private static WebElement  posReportsPreorderReportsMenu; 
		   
			    @FindBy(xpath="//*[@id='8514']/span")
			   	private static WebElement  posReportsPreOrderReportsSalesDetailReports; 
			    
			    @FindBy(xpath="//*[@id='8515']/span")
			   	private static WebElement  posReportsPreOrderReportsSalesDetailByOrder; 
			    
			    @FindBy(xpath="//*[@id='8516']/span")
			   	private static WebElement  posReportsPreOrderReportsRefundOrderReport; 
			    
			    @FindBy(xpath="//*[@id='8517']/span")
			   	private static WebElement  posReportsPreOrderReportsSalesSummaryReportByQuantity; 
			    
			    @FindBy(xpath="//*[@id='8518']/span")
			   	private static WebElement  posReportsPreOrderReportsSalesSummaryReportByAmount; 
			    
			
		    @FindBy(xpath="//*[@id='8519']/span")
			private static WebElement posReportsPreorderPaymentReportsMenu; 
		   
			    @FindBy(xpath="//*[@id='8520']/span")
			   	private static WebElement  posReportsPreorderPaymentReportsPaymentCollectionReport; 
			    
			    @FindBy(xpath="//*[@id='8521']/span")
			   	private static WebElement  posReportsPreorderPaymentReportsPaymentCollectionByPaymentMode; 
			    
			    @FindBy(xpath="//*[@id='8522']/span")
			   	private static WebElement  posReportsPreorderPaymentReportsPaymentCollectionByPaymentNo; 
			   
		    @FindBy(xpath="//*[@id='8523']/span")
			private static WebElement  posReportsMemberReportsMenu; 
		    
			    @FindBy(xpath="//a[@id='8525']//span[contains(text(),'Membership Recruitment')]")
			   	private static WebElement  posReportsMemberReportsMembershipRecruitment; 
			    
			    @FindBy(xpath="//span[contains(text(),'Membership Recruitment by Date')]")
			   	private static WebElement  posReportsMemberReportsMembershipRecruitmentByDate; 
			    
			    @FindBy(xpath="//span[contains(text(),'Member Frequency Visit')]")
			   	private static WebElement  posReportsMemberReportsMemberFrequencyVisit; 
			    
			    @FindBy(xpath="//span[contains(text(),'Member Birthday Report')]")
			   	private static WebElement  posReportsMemberReportsMemberBirthdayReport; 
			    
			    @FindBy(xpath="//span[contains(text(),'Sales Info by Member')]")
			   	private static WebElement  posReportsMemberReportsSalesInfoByMember; 
			    
		    @FindBy(xpath="//*[@id='8530']/span")
			private static WebElement  posReportsMemberPointsReportsMenu;
		    
			    @FindBy(xpath="//*[@id='8531']/span")
			   	private static WebElement  posReportsMemberPointsReportsPointsReport; 
			    
			    @FindBy(xpath="//*[@id='8532']/span")
			   	private static WebElement  posReportsMemberPointsReportsPointsExpiryReport; 
			    
			    @FindBy(xpath="//*[@id='8533']/span")
			   	private static WebElement  posReportsMemberPointsReportsMaximumPointsReport; 
			    
			    @FindBy(xpath="//*[@id='8534']/span")
			   	private static WebElement  posReportsMemberPointsReportsMinimumPointsReport; 
			    			
		    @FindBy(xpath="//*[@id='8535']/span")
			private static WebElement  posReportsItemReportsMenu; 

			    @FindBy(xpath="//*[@id='8536']/span")
			   	private static WebElement  posReportsItemReportsFastMovingItems; 
			    
			    @FindBy(xpath="//*[@id='8537']/span")
			   	private static WebElement  posReportsItemReportsSlowMovingItems; 
			    
			    @FindBy(xpath="//*[@id='8538']/span")
			   	private static WebElement  posReportsItemReportsNonMovingItems; 
			    
			    @FindBy(xpath="//*[@id='8568']/span")
			   	private static WebElement  posReportsItemReportsFastMovingItemsByOutlet; 
			    
			    @FindBy(xpath="//*[@id='8569']/span")
			   	private static WebElement  posReportsItemReportsSlowMovingItemsByOutlet; 
			    
			    @FindBy(xpath="//*[@id='8570']/span")
			   	private static WebElement  posReportsItemReportsNonMovingItemsByOutlet; 
			   
		    @FindBy(xpath="//*[@id='8540']/span")
			private static WebElement  posReportsCashReportsMenu; 
		    
			    @FindBy(xpath="//*[@id='8542']/span")
			   	private static WebElement  posReportsCashReportsCashCollectionsMenu; 
			    
			    @FindBy(xpath="//*[@id='8544']/span")
			   	private static WebElement  posReportsCashReportsCashDiscrepancyMenu; 
		    
		    @FindBy(xpath="//*[@id='8545']/span")
			private static WebElement  posReportsStockReportsMenu; 
		    
			    @FindBy(xpath="//*[@id='8546']/span")
			   	private static WebElement  posReportsStockReportsStockInAndOutMenu; 
			    
			    @FindBy(xpath="//*[@id='8549']/span")
			   	private static WebElement  posReportsStockReportsStockStatusByUutletMenu; 

		    @FindBy(xpath="//*[@id='8550']/span")
			private static WebElement  posReportsPeriodicSalesReportsMenu; 
		    
			    @FindBy(xpath="//*[@id='8551']/span")
			   	private static WebElement  posReportsPeriodicSalesReportsHourlySalesByOutlet;
			    
			    @FindBy(xpath="//*[@id='8552']/span")
			   	private static WebElement  posSReportsPeriodicSalesReportsDailySalesByOutlet;
			    
			    @FindBy(xpath="//*[@id='8553']/span")
			   	private static WebElement  posReportsPeriodicSalesReportsDailySalesByBankByOutlet;
			    
			    @FindBy(xpath="//*[@id='8555']/span")
			   	private static WebElement  posReportsPeriodicSalesReportsMonthlySalesByOutlet;
			    
		    @FindBy(xpath="//*[@id='8556']/span")
		   	private static WebElement  posReportsLastYearComparisonReportsMenu; 
		    
			    @FindBy(xpath="//*[@id='8557']/span")
			   	private static WebElement  posReportsLastYearComparisonReportsSalesInfoByQuantityMenu;
			     
			    @FindBy(xpath="//*[@id='8558']/span")
			   	private static WebElement  posReportsLastYearComparisonReportsSalesInfoByAmountMenu;
			    
			    @FindBy(xpath="//*[@id='8559']/span")
			   	private static WebElement  posReportsLastYearComparisonReportsSalesInfoByQuantityAndAmountMenu;
			    
			    @FindBy(xpath="//*[@id='8560']/span")
			   	private static WebElement  posReportsLastYearComparisonReportsBestOutletsPerformanceMenu;
			    
			    @FindBy(xpath="//*[@id='8561']/span")
			   	private static WebElement  posReportsLastYearComparisonReportsWorstOutletsPerformanceMenu;
			    
		    @FindBy(xpath="//*[@id='8562']/span")
		   	private static WebElement  posReportsMiscellaneousReportsMenu; 
		    
			    @FindBy(xpath="//*[@id='8563']/span")
			   	private static WebElement  posReportsMiscelsReportsXReadingMenu;
			   
			    @FindBy(xpath="//*[@id='8564']/span")
			   	private static WebElement  posReportsMiscelsReportsOutletStatusMenu;
			    
			    @FindBy(xpath="//*[@id='8566']/span")
			   	private static WebElement  posReportsMiscelsReportsEODkSummaryReportMenu;
			    
		    @FindBy(xpath="//*[@id='8571']/span")
		   	private static WebElement  posReportsRestaurantReportsMenu; 
		        
			    @FindBy(xpath="//*[@id='8572']/span")
			   	private static WebElement  posReportsRestaurantReportsDailySalesMenu;
			    
			    @FindBy(xpath="//*[@id='8573']/span")
			   	private static WebElement  posReportsRestaurantReportsSalesByMenuCategoryMenu;
			    
			    @FindBy(xpath="//*[@id='8574']/span")
			   	private static WebElement  posReportsRestaurantReportsDiscountByWaiterMenu;
			    
			    @FindBy(xpath="//*[@id='8577']/span")
			   	private static WebElement  posReportsRestaurantReportsClerkWiseSalesMenu;
				    
		@FindBy(xpath="//*[@id='8003']/span")
		private static WebElement  pointOfSaleUtilitiesMenu; 

		    @FindBy(xpath="//*[@id='8019']/span")
		   	private static WebElement  posUtilitiesPreferencesMenu;
		    
		    @FindBy(xpath="//*[@id='8021']/span")
		   	private static WebElement  posUtilitiesGiftVoucherSaleMenu;
		    
		    @FindBy(xpath="//*[@id='8036']/span")
		   	private static WebElement  posUtilitiesGiftVoucherTransferMenu;
		    
		    @FindBy(xpath="//*[@id='8037']/span")
		   	private static WebElement  posUtilitiesDiscountVoucherTransferMenu;
		    
		    @FindBy(xpath="//*[@id='8022']/span")
		   	private static WebElement  posUtilitiesCreditNoteMenu;
		    
		    @FindBy(xpath="//*[@id='8026']/span")
		   	private static WebElement  posUtilitiesMessageBroadcastingMenu;
		    
		    @FindBy(xpath=" //*[@id='8038']/span ")
		   	private static WebElement posUtilitiesDayEndMenu;
		   
		    @FindBy(xpath="//*[@id='8040']/span")
		   	private static WebElement  posUtilitiesReprintDayEndMenu;
	    
		    
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
    
    
		public static boolean checkPointOfSaleMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleMenu));
			
			 if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
	    		getDashboard.equalsIgnoreCase("Dashboard") && pointOfSaleMenu.isDisplayed())
			 
			 {
				  
				 pointOfSaleMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleMainScreenMenu));
				
				if(pointOfSaleMainScreenMenu.isDisplayed() && pointOfSalePOSReportsMenu.isDisplayed() && 
						pointOfSaleUtilitiesMenu.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 140, 9, resPass);
					return true;
				}
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 140, 9, resFail);
					return false;
				}
			 }
			 else
				{
					excelReader.setCellData(xlfile, "Sheet1", 140, 9, resFail);
					return false;
				}
		}
		
		

		
		public static boolean checkMainScreenMenuInPointOfSaleMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleMainScreenMenu));
			
			 pointOfSaleMainScreenMenu.click();
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSale));
			
			if(pointOfSale.isDisplayed() && pointOfSaleCustomization.isDisplayed()
					&& posMainScreenCustomization.isDisplayed())
			{
				excelReader.setCellData(xlfile, "Sheet1", 141, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 141, 9, resFail);
				return false;
			}
		}
		

	
		public static boolean checkPOSReportsMenuInPointOfSaleMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSalePOSReportsMenu));
			
			 pointOfSalePOSReportsMenu.click();
			 
			 
			 
			 
			 JavascriptExecutor js = (JavascriptExecutor) getDriver();
			 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			 
			 
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsRetailSalesReportsMenu));
			
			if(posReportsRetailSalesReportsMenu.isDisplayed() && posReportsSummarySalesReportMenu.isDisplayed() && 
					posReportsPreorderReportsMenu.isDisplayed() && posReportsPreorderPaymentReportsMenu.isDisplayed() && 
					posReportsMemberReportsMenu.isDisplayed() &&posReportsMemberPointsReportsMenu.isDisplayed() &&
					posReportsItemReportsMenu.isDisplayed() && posReportsCashReportsMenu.isDisplayed() && 
					posReportsStockReportsMenu.isDisplayed() && posReportsPeriodicSalesReportsMenu.isDisplayed() &&
					posReportsLastYearComparisonReportsMenu.isDisplayed() &&posReportsMiscellaneousReportsMenu.isDisplayed() &&
					posReportsRestaurantReportsMenu.isDisplayed())
			{
				excelReader.setCellData(xlfile, "Sheet1", 142, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 142, 9, resFail);
				return false;
			}
		}
	
	
	

	
		public static boolean checkRetailSalesReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsRetailSalesReportsMenu));
			
			 posReportsRetailSalesReportsMenu.click();
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsRetailSalesAnalysis));
			
			if(posReportsRetailSalesAnalysis.isDisplayed() && posReportsRetailSalesByOutlet.isDisplayed() && 
					posReportsRetailSalesByCounter.isDisplayed() && posReportsRetailSalesByItem.isDisplayed() &&
					posReportsRetailSalesTransactionAnalysis.isDisplayed())
			{
				excelReader.setCellData(xlfile, "Sheet1", 143, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 143, 9, resFail);
				return false;
			}
		}
			
	
	    public static boolean checkSummarySalesReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsSummarySalesReportMenu));
			
			 posReportsSummarySalesReportMenu.click();
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsSummarySalesReportSalesByDate));
			
			if(posReportsSummarySalesReportSalesByDate.isDisplayed() && 
					posReportsSummarySalesReportSalesByOutlet.isDisplayed() && 
					posReportsSummarySalesReportSalesByItem.isDisplayed() && 
					posReportsSummarySalesReportSalesByQuantity.isDisplayed() &&
					posReportsSummarySalesReportSalesByAmount.isDisplayed() && 
					posReportsSummarySalesReportSalesByQuantityByAmount.isDisplayed() &&
					posReportsSummarySalesReportSalesWalkinORPreorderBySales.isDisplayed() &&
					posReportsSummarySalesReportPaymentByModeSales.isDisplayed() && 
					posReportsSummarySalesReportPaymentByModeSummary.isDisplayed())
			{
				excelReader.setCellData(xlfile, "Sheet1", 144, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 144, 9, resFail);
				return false;
			}
		}
	
	   
	    
	    
	    
	    public static boolean checkPreOrderReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsPreorderReportsMenu));
			
			 posReportsPreorderReportsMenu.click();
			
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsPreOrderReportsSalesDetailReports));
			
			if(posReportsPreOrderReportsSalesDetailReports.isDisplayed() && 
					posReportsPreOrderReportsSalesDetailByOrder.isDisplayed() && 
					posReportsPreOrderReportsRefundOrderReport.isDisplayed() && 
					posReportsPreOrderReportsSalesSummaryReportByQuantity.isDisplayed() &&
					posReportsPreOrderReportsSalesSummaryReportByAmount.isDisplayed())
			{
				excelReader.setCellData(xlfile, "Sheet1", 145, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, "Sheet1", 145, 9, resFail);
				return false;
			}
		}
	    
		

	    

		    public static boolean checkPreOrderPaymentReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsPreorderPaymentReportsMenu));
				
				 posReportsPreorderPaymentReportsMenu.click();
				
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsPreorderPaymentReportsPaymentCollectionReport));
				
				if(posReportsPreorderPaymentReportsPaymentCollectionReport.isDisplayed() && 
						posReportsPreorderPaymentReportsPaymentCollectionByPaymentMode.isDisplayed() && 
						posReportsPreorderPaymentReportsPaymentCollectionByPaymentNo.isDisplayed())
				{
					excelReader.setCellData(xlfile, "Sheet1", 146, 9, resPass);
					return true;
				}
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 146, 9, resFail);
					return false;
				}
			}
		    
		    
		    
		
			    
			    
			    public static boolean checkMemberReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				{
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsMemberReportsMenu));
					
					 posReportsMemberReportsMenu.click();
					
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsMemberReportsMembershipRecruitment));
					
					if(posReportsMemberReportsMembershipRecruitment.isDisplayed() && 
							posReportsMemberReportsMembershipRecruitmentByDate.isDisplayed() && 
							posReportsMemberReportsMemberFrequencyVisit.isDisplayed() &&
							posReportsMemberReportsMemberBirthdayReport.isDisplayed() &&
							posReportsMemberReportsSalesInfoByMember.isDisplayed())
					{
						excelReader.setCellData(xlfile, "Sheet1", 147, 9, resPass);
						return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 147, 9, resFail);
						return false;
					}
				}
			    


				    
		    
				    public static boolean checkMemberPointsReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
					{
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsMemberPointsReportsMenu));
						
						 posReportsMemberPointsReportsMenu.click();
						
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsMemberPointsReportsPointsReport));
						
						if(posReportsMemberPointsReportsPointsReport.isDisplayed() && 
								posReportsMemberPointsReportsPointsExpiryReport.isDisplayed() && 
								posReportsMemberPointsReportsMaximumPointsReport.isDisplayed() &&
								posReportsMemberPointsReportsMinimumPointsReport.isDisplayed())
						{
							excelReader.setCellData(xlfile, "Sheet1", 148, 9, resPass);
							return true;
						}
						else
						{
							excelReader.setCellData(xlfile, "Sheet1", 148, 9, resFail);
							return false;
						}
					}
				    
				    
				    
				    
			
				    
				    
				    
				    public static boolean checkItemReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
					{
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsItemReportsMenu));
						
						 posReportsItemReportsMenu.click();
						
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsItemReportsFastMovingItems));
						
						if(posReportsItemReportsFastMovingItems.isDisplayed() && 
								posReportsItemReportsSlowMovingItems.isDisplayed() && 
								posReportsItemReportsNonMovingItems.isDisplayed() &&
								posReportsItemReportsFastMovingItemsByOutlet.isDisplayed() &&
								posReportsItemReportsSlowMovingItemsByOutlet.isDisplayed() &&
								posReportsItemReportsNonMovingItemsByOutlet.isDisplayed())
						{
							excelReader.setCellData(xlfile, "Sheet1", 149, 9, resPass);
							return true;
						}
						else
						{
							excelReader.setCellData(xlfile, "Sheet1", 149, 9, resFail);
							return false;
						}
					}
				    

				    
					public static boolean checkCashReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				    {
					   excelReader=new ExcelReader(POJOUtility.getExcelPath());
					   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

					   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsCashReportsMenu));
							
					   posReportsCashReportsMenu.click();
							
					   getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsCashReportsCashCollectionsMenu));
							
						if(posReportsCashReportsCashCollectionsMenu.isDisplayed() && 
							posReportsCashReportsCashDiscrepancyMenu.isDisplayed() )
					    {
							excelReader.setCellData(xlfile, "Sheet1", 150, 9, resPass);
							return true;
						}
						else
						{
							excelReader.setCellData(xlfile, "Sheet1", 150, 9, resFail);
							return false;
						}
					}
				    
				    
					    

						    
				    public static boolean checkStockReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
				    {
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsStockReportsMenu));
								
						posReportsStockReportsMenu.click();
								
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsStockReportsStockInAndOutMenu));
								
						if(posReportsStockReportsStockInAndOutMenu.isDisplayed() && 
							posReportsStockReportsStockStatusByUutletMenu.isDisplayed() )
						{
							excelReader.setCellData(xlfile, "Sheet1", 151, 9, resPass);
							return true;
						}
						else
						{
							excelReader.setCellData(xlfile, "Sheet1", 151, 9, resFail);
							return false;
						}
					}
						    
						    

					    
					public static boolean checkPreodicSalesReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
					{
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsPeriodicSalesReportsMenu));
									
						posReportsPeriodicSalesReportsMenu.click();
						

						
									
						getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsPeriodicSalesReportsHourlySalesByOutlet));
									
						if(posReportsPeriodicSalesReportsHourlySalesByOutlet.isDisplayed() && 
							posSReportsPeriodicSalesReportsDailySalesByOutlet.isDisplayed() &&
							posReportsPeriodicSalesReportsDailySalesByBankByOutlet.isDisplayed() &&
							posReportsPeriodicSalesReportsMonthlySalesByOutlet.isDisplayed())
						{
							excelReader.setCellData(xlfile, "Sheet1", 152, 9, resPass);
							return true;
						}
						else
						{
							excelReader.setCellData(xlfile, "Sheet1", 152, 9, resFail);
							return false;
						}
					  }	
					 
					 
					 
					  
						    			 
			 public static boolean checkLastYearCompraisonReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsLastYearComparisonReportsMenu));
											
					posReportsLastYearComparisonReportsMenu.click();
					

											
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsLastYearComparisonReportsSalesInfoByQuantityMenu));
											
					if(posReportsLastYearComparisonReportsSalesInfoByQuantityMenu.isDisplayed() && 
							posReportsLastYearComparisonReportsSalesInfoByAmountMenu.isDisplayed() &&
							posReportsLastYearComparisonReportsSalesInfoByQuantityAndAmountMenu.isDisplayed() &&
							posReportsLastYearComparisonReportsBestOutletsPerformanceMenu.isDisplayed() &&
							posReportsLastYearComparisonReportsWorstOutletsPerformanceMenu.isDisplayed())
					{
					    excelReader.setCellData(xlfile, "Sheet1", 153, 9, resPass);
					    return true;
					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 153, 9, resFail);
						return false;
					}
				}	
			 
			 

				    		 
				    
			 public static boolean checkMiscellaneousReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
				  excelReader=new ExcelReader(POJOUtility.getExcelPath());
				  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsMiscellaneousReportsMenu));
													
				  posReportsMiscellaneousReportsMenu.click();
				  
			
													
				  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsMiscelsReportsXReadingMenu));
													
				  if(posReportsMiscelsReportsXReadingMenu.isDisplayed() && 
						posReportsMiscelsReportsOutletStatusMenu.isDisplayed() &&
						posReportsMiscelsReportsEODkSummaryReportMenu.isDisplayed())
				  {
					 excelReader.setCellData(xlfile, "Sheet1", 154, 9, resPass);
				     return true;
				  }
				  else
				  {
					 excelReader.setCellData(xlfile, "Sheet1", 154, 9, resFail);
					 return false;
				  }
			 }	    
				    


					    
	    public static boolean checkResturantReportsMenuInPosReReportsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsRestaurantReportsMenu));
										
				posReportsRestaurantReportsMenu.click();
										
				getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posReportsRestaurantReportsDailySalesMenu));
										
				if(posReportsRestaurantReportsDailySalesMenu.isDisplayed() && 
						posReportsRestaurantReportsSalesByMenuCategoryMenu.isDisplayed() &&
						posReportsRestaurantReportsDiscountByWaiterMenu.isDisplayed() &&
						posReportsRestaurantReportsClerkWiseSalesMenu.isDisplayed())
				{
				    excelReader.setCellData(xlfile, "Sheet1", 155, 9, resPass);
				    return true;
				}
				else
				{
					excelReader.setCellData(xlfile, "Sheet1", 155, 9, resFail);
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
					
						    
		    public static boolean checkUtilitiesMenuInPointOfSaleMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleUtilitiesMenu));
											
					pointOfSaleUtilitiesMenu.click();
											
					getWebDriverWait().until(ExpectedConditions.elementToBeClickable(posUtilitiesPreferencesMenu));
											
					if(posUtilitiesPreferencesMenu.isDisplayed() && 
							posUtilitiesGiftVoucherSaleMenu.isDisplayed() &&
							posUtilitiesGiftVoucherTransferMenu.isDisplayed() &&
							posUtilitiesDiscountVoucherTransferMenu.isDisplayed() &&
							posUtilitiesCreditNoteMenu.isDisplayed() &&
							posUtilitiesMessageBroadcastingMenu.isDisplayed() &&
							posUtilitiesDayEndMenu.isDisplayed() && 
							posUtilitiesReprintDayEndMenu.isDisplayed())
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
							excelReader.setCellData(xlfile, "Sheet1", 156, 9, resPass);
							return true;
		    			  }
		    			  else
		  	    		{
		  	    			excelReader.setCellData(xlfile, "Sheet1", 156, 9, resFail);
		  	    			return false;
		  	    		}

					}
					else
					{
						excelReader.setCellData(xlfile, "Sheet1", 156, 9, resFail);
						return false;
					}
				}	        
					    
					    
					    
	public HPPointOfSaleMenuPage(WebDriver driver)
    {	
    	PageFactory.initElements(driver, this);
    	
    }
	
	
	
	
}
