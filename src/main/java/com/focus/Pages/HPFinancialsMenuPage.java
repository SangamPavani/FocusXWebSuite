package com.focus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HPFinancialsMenuPage extends BaseEngine {

	
	private static String getPatchDateTime;
	private static LoginPage lp;
	private static LoginPageCompanyCreationPage lpcc;
	private static ExcelReader excelReader;
	private static String url;
	private static String lgnTitle;
	private static String getCompanyInfo;
	private static String xlfile;
	private static String resPass ="Pass";
	private static String resFail="Fail";
	
	
	
		@FindBy(xpath="//*[@id='60']/div")
		private static WebElement  financialsMenu; 
		
			@FindBy(xpath="//*[@id='61']/span")
			private static WebElement  financialsTransactionMenu; 		

				@FindBy(xpath="//*[@id='2001']/span")
				private static WebElement  cashAndBankMenu; 
				
		     		@FindBy(xpath="//*[@id='2002']/span")
					private static WebElement  receiptsVoucher;
					
					@FindBy(xpath="//*[@id='2003']/span")
					private static WebElement  paymentsVoucher;
					
					@FindBy(xpath="//*[@id='2004']/span")
					private static WebElement  pettyVoucher;
					
					@FindBy(xpath="//*[@id='2005']/span")
					private static WebElement  postDatedReceiptsVoucher;
								
					@FindBy(xpath="//*[@id='2006']/span")
					private static WebElement  postDatedPaymentsVoucher;
					
					@FindBy(xpath="//*[@id='108']/span")
					private static WebElement  defineChequeSeries;
					
					@FindBy(xpath="//*[@id='109']/span")
					private static WebElement  cancelCheque;
				
	
				@FindBy(xpath="//*[@id='2007']/span")
				private static WebElement  financialsTransactionsPurchaseMenu; 
				
					@FindBy(xpath="//*[@id='2008']/span")
					private static WebElement  purchaseVoucher;
					
					@FindBy(xpath="//*[@id='2009']/span")
					private static WebElement  purchaseReturnsVoucher;
					
							
				@FindBy(xpath="//*[@id='2014']/span")
				private static WebElement  financialsTransactionsSalesMenu;
					
					@FindBy(xpath="//*[@id='2015']/span")
					private static WebElement  salesInvoicesVoucher;
					
					@FindBy(xpath="//*[@id='2016']/span")
					private static WebElement  salesReturnsVoucher;
					
					@FindBy(xpath="//*[@id='2020']/span")
					private static WebElement  cashSales;
							
					@FindBy(xpath="//*[@id='2021']/span")
					private static WebElement  hirePurchaseSales;
				
				@FindBy(xpath="//*[@id='2023']/span")
				private static WebElement  financialsTransactionsJournalsMenu;
				
				    @FindBy(xpath="//*[@id='2032']/span")
					private static WebElement  journalsEntriesVoucher;
					
					@FindBy(xpath="//*[@id='2025']/span")
					private static WebElement  forexJVVoucher;
					
					@FindBy(xpath="//*[@id='2029']/span")
					private static WebElement  interdepartmentaljvVoucher;
					
					@FindBy(xpath="//*[@id='2024']/span")
					private static WebElement  oldJouranlEntriesVoucher;
					
					@FindBy(xpath="//*[@id='2026']/span")
					private static WebElement  debitNotesVoucher;
					
					@FindBy(xpath="//*[@id='2030']/span")
					private static WebElement  debitNotesLinewiseVoucher;
					
					@FindBy(xpath="//*[@id='2027']/span")
					private static WebElement  creditNotesVoucher;
					
					@FindBy(xpath="//*[@id='2031']/span")
					private static WebElement  creditNotesLinewiseVoucher;

					@FindBy(xpath="//*[@id='2066']/span")
					private static WebElement  jvVatVoucher;

					@FindBy(xpath="//*[@id='2067']/span")
					private static WebElement  nonjvVatVoucher;
					
					@FindBy(xpath="//*[@id='2068']/span")
					private static WebElement  debitNotesVatVoucher;
					
					@FindBy(xpath="//*[@id='2069']/span")
					private static WebElement  creditNotesVatVoucher;
					
					@FindBy(xpath="//*[@id='2028']/span")
					private static WebElement  openingBalancesVoucher;
					
					@FindBy(xpath="//*[@id='2046']/span")
					private static WebElement  fixedAssetsDepreciationVoucher;
				
				@FindBy(xpath="//*[@id='219']/span")
				private static WebElement  financialsTransactionsAutoPostingsMenu;
				
					@FindBy(xpath="//*[@id='77']/span")
					private static WebElement  recurringJournalVoucher;
					
					@FindBy(xpath="//*[@id='79']/span")
					private static WebElement  postRecurringJournal;
					
					@FindBy(xpath="//*[@id='92']/span")
					private static WebElement  recurringJournalTemplate;
					
					@FindBy(xpath="//*[@id='91']/span")
					private static WebElement  postInterest;
					
					@FindBy(xpath="//*[@id='90']/span")
					private static WebElement  convertMaturedPDCs;
					
					@FindBy(xpath="//*[@id='161']/span")
					private static WebElement assignPDCLimit;
					
					@FindBy(xpath="//*[@id='166']/span")
					private static WebElement  stockReplenishment;

			@FindBy(xpath="//*[@id='62']/span")
			private static WebElement  financialsCreditManagementMenu; 
			
				@FindBy(xpath="//*[@id='63']/span")
				private static WebElement  paymentTerms;
				
				@FindBy(xpath="//*[@id='64']/span")
				private static WebElement  financeTerms;
				
				@FindBy(xpath="//*[@id='65']/span")
				private static WebElement  reminderTerms;		
				
				@FindBy(xpath="//*[@id='89']/span")
				private static WebElement  sendReminder;
				
				@FindBy(xpath="//*[@id='217']/span")
				private static WebElement  delinquency;
				
					@FindBy(xpath="//*[@id='73']/span")
					private static WebElement  questionnarie;
					
					@FindBy(xpath="//*[@id='218']/span")
					private static WebElement  delinquencyMgmt;
					
				@FindBy(xpath="//*[@id='35']/span")
				private static WebElement  creidtApproval;
				
		    @FindBy(xpath="//*[@id='81']/span")
		    private static WebElement  financialsReportsMenu; 
		    
			    @FindBy(xpath="//*[@id='500']/span")
				private static WebElement  ledger;
	
				@FindBy(xpath="//*[@id='658']/span")
				private static WebElement  ledgerDetail;
	
				@FindBy(xpath="//*[@id='501']/span")
				private static WebElement  subLedger;
				
				@FindBy(xpath="//*[@id='82']/span")
				private static WebElement  cashAndBankBooksMenu;
				
					@FindBy(xpath="//*[@id='510']/span")
					private static WebElement  cashBookReport;
					
					@FindBy(xpath="//*[@id='511']/span")
					private static WebElement  bankBookReport;
					
					@FindBy(xpath="//*[@id='512']/span")
					private static WebElement  pettyCashBokReport;
					
					@FindBy(xpath="//*[@id='513']/span")
					private static WebElement  dayBookReport;
					
					@FindBy(xpath="//*[@id='83']/span")
					private static WebElement  bankReconciliationReport;
					
					@FindBy(xpath="//*[@id='84']/span")
					private static WebElement  bankReconciliationImport;
					
					@FindBy(xpath="//*[@id='85']/span")
					private static WebElement  customerVendorReconciliation;
				
					@FindBy(xpath="//*[@id='537']/span")
					private static WebElement  bankReconciliationStatement;
						
					@FindBy(xpath="//*[@id='162']/span")
					private static WebElement chequeDiscountingMenu;
				
				@FindBy(xpath="//*[@id='502']/span")
				private static WebElement  salesReportsMenu;
				
					@FindBy(xpath="//*[@id='503']/span")
					private static WebElement  salesRegisterReport;
	
					@FindBy(xpath="//*[@id='504']/span")
					private static WebElement  salesReturnRegisterReport;
					
					@FindBy(xpath="//*[@id='505']/span")
					private static WebElement summarySalesBookReport;
					
					@FindBy(xpath="//*[@id='628']/span")
					private static WebElement monthlySalesBookReport;
					
					@FindBy(xpath="//*[@id='629']/span")
					private static WebElement  topCustomersListReport;
				
				@FindBy(xpath="//*[@id='506']/span")
				private static WebElement  purchaseReportsMenu;
				
					@FindBy(xpath="//*[@id='507']/span")
					private static WebElement  purchaseRegisterReport;
					
					@FindBy(xpath="//*[@id='508']/span")
					private static WebElement  purchaseReturnRegisteReport;
					
					@FindBy(xpath="//*[@id='509']/span")
					private static WebElement  summaryPurchaseBookReport;
							
				@FindBy(xpath="//*[@id='514']/span")
				private static WebElement  registersReportMenu;
				
					@FindBy(xpath="//*[@id='516']/span")
					private static WebElement  openingBalanceRegisterReport;
					
					@FindBy(xpath="//*[@id='515']/span")
					private static WebElement journalEntriesRegisterReport;
					
					@FindBy(xpath="//span[contains(text(),'Credit Note Register')]")
					private static WebElement creditNoteRegisterReport;
					
					@FindBy(xpath="//*[@id='610']/span")
					private static WebElement  debitNoteRegisterReport;
					
					@FindBy(xpath="//*[@id='598']/span")
					private static WebElement  receiptsRegisterReport;
					
					@FindBy(xpath="//*[@id='599']/span")
					private static WebElement  paymentRegisterReport;
					
					@FindBy(xpath="//*[@id='518']/span")
					private static WebElement  pdcReceiptsRegisterReport;
					
					@FindBy(xpath="//*[@id='519']/span")
					private static WebElement pdcPaymentsRegisterReport;
					
					@FindBy(xpath="//*[@id='517']/span")
					private static WebElement  entryJournalRegisterMenu;
							
				@FindBy(xpath="//*[@id='523']/span")
				private static WebElement  salesAndPurchasesReportMenu;
				
					@FindBy(xpath="//*[@id='524']/span")
					private static WebElement  salesGroupedByCustomerReport;
					
					@FindBy(xpath="//*[@id='525']/span")
					private static WebElement  salesGroupedByProductReport;
					
					@FindBy(xpath="//*[@id='526']/span")
					private static WebElement  salesGroupedByDepartmentReport;
					
					@FindBy(xpath="//*[@id='527']/span")
					private static WebElement  purchasesGroupedByVendorReport;
					
					@FindBy(xpath="//*[@id='528']/span")
					private static WebElement  purchasesGroupedByProductReport;
					
					@FindBy(xpath="//*[@id='529']/span")
					private static WebElement  purchasesGroupedByDepartmentReport;		
				
				@FindBy(xpath="//*[@id='568']/span")
				private static WebElement  MiscellaneousAnalysisReportMenu;
				
					@FindBy(xpath="//*[@id='569']/span")
					private static WebElement  peakAndLowBalancesReport;
					
					@FindBy(xpath="//*[@id='570']/span")
					private static WebElement  comprativeAnalysisReport;
					
					@FindBy(xpath="//*[@id='571']/span")
					private static WebElement  transactionsTypeAnalysisReport;
					
					@FindBy(xpath="//*[@id='572']/span")
					private static WebElement  abcAnalysisReport;
					
					@FindBy(xpath="//*[@id='597']/span")
					private static WebElement  interestCalculationReport;
	
				@FindBy(xpath="//*[@id='536']/span")
				private static WebElement  mastersInformationMenu;
				
			     	@FindBy(xpath="//*[@id='538']/span")
					private static WebElement  masterInfoMenu;
					
					@FindBy(xpath="//*[@id='144']/span")
					private static WebElement  productLabelMenu;
					
					@FindBy(xpath="//*[@id='573']/span")
					private static WebElement  unitConversionMenu;
						
					@FindBy(xpath="//*[@id='147']/span")
					private static WebElement  skidDefinitionMenu;
									
				@FindBy(xpath="//*[@id='520']/span")
				private static WebElement  auditTrailMenu;
				
					@FindBy(xpath="//*[@id='521']/span")
					private static WebElement  auditTrailtransactionsReport;
					
					@FindBy(xpath="//*[@id='522']/span")
					private static WebElement  aAuditTrailloginsReport;
				
				@FindBy(xpath="//*[@id='204']/span")
				private static WebElement  accountQuery;
				
		    @FindBy(xpath="//*[@id='530']/span")
		    private static WebElement  financialsFinalAccountsMenu; 
		    
			    @FindBy(xpath="//*[@id='531']/span")
				private static WebElement trialBalanceReport;
						
				@FindBy(xpath="//*[@id='532']/span")
				private static WebElement profitandLossReport;
				
				@FindBy(xpath="//*[@id='533']/span")
				private static WebElement  tradingAccountReport;
				
				@FindBy(xpath="//*[@id='534']/span")
				private static WebElement  tradingandProfitAndLossReport;
				
				@FindBy(xpath="//*[@id='535']/span")
				private static WebElement  balanceSheetReport;				
				
				@FindBy(xpath="//*[@id='592']/span")
				private static WebElement  finalAccountSchedulesReport;
				
				@FindBy(xpath="//*[@id='593']/span")
				private static WebElement  fundFlowReport;
				
				@FindBy(xpath="//*[@id='594']/span")
				private static WebElement  cashFlowReport;
				
				@FindBy(xpath="//*[@id='252']/span")
				private static WebElement  cashFlowCalendarReport;
				
				@FindBy(xpath="//*[@id='595']/span")
				private static WebElement  cashFlowAnalysisReport;
				
				@FindBy(xpath="//*[@id='632']/span")
				private static WebElement  advanceCashFlowReport;
				
				@FindBy(xpath="//*[@id='630']/span")
				private static WebElement  incomeExpenseTrendsReport;
				
				@FindBy(xpath="//*[@id='655']/span")
				private static WebElement  receivablePayableReport;
			
			@FindBy(xpath="//*[@id='558']/span")
			private static WebElement  financialsReceivableAndPayableAnalysisMenu; 
			
				@FindBy(xpath="//*[@id='605']/span")
				private static WebElement customerDetailMenu;
				
					@FindBy(xpath="//*[@id='559']/span")
					private static WebElement  customerListingOfOutstandingBillsReport;
					
					@FindBy(xpath="//*[@id='560']/span")
					private static WebElement  customerStatementsReport;
					
					@FindBy(xpath="//*[@id='560']/span")
					private static WebElement  customerDueDateAnalysisReport;
					
					@FindBy(xpath="//*[@id='563']/span")
					private static WebElement  customerAgeingDetailsReport;
					
					@FindBy(xpath="//*[@id='564']/span")
					private static WebElement  customerDetailAgeingbyDueDateReport;
					
					@FindBy(xpath="//*[@id='566']/span")
					private static WebElement  customerOverdueAnalysisReport;
				
				@FindBy(xpath="//*[@id='607']/span")
				private static WebElement  customerSummaryMenu;
						
					@FindBy(xpath="//*[@id='562']/span")
					private static WebElement  customerAgeingSummaryMenu;
					
					@FindBy(xpath="//*[@id='565']/span")
					private static WebElement  customerSummaryAgeingByDueDateMenu;
					
					@FindBy(xpath="//*[@id='567']/span")
					private static WebElement  customerOverdueSummaryMenu;
					
					@FindBy(xpath="//*[@id='539']/span")
					private static WebElement  customerbillwiseSummaryMenu;	
				
				@FindBy(xpath="//*[@id='606']/span")
				private static WebElement  vendorDetailMenu;
				
					@FindBy(xpath="//*[@id='541']/span")
					private static WebElement  vendorListingoFOutstandingBillsReport;
						
					@FindBy(xpath="//*[@id='542']/span")
					private static WebElement  vendorStatementsReport;
					
					@FindBy(xpath="//*[@id='543']/span")
					private static WebElement  vendorDueDateAnalysisReport;
					
					@FindBy(xpath="//*[@id='545']/span")
					private static WebElement  vendorAgeingDetailsReport;
						
					@FindBy(xpath="//*[@id='546']/span")
					private static WebElement  vendorDetailVendorDetailAgeingByDueDateMenu;
				
					@FindBy(xpath="//*[@id='548']/span")
					private static WebElement  vendorOverdueAnalysisMenu;
					
				@FindBy(xpath="//*[@id='608']/span")
				private static WebElement  vendorSummaryMenu;
				
					@FindBy(xpath="//*[@id='544']/span")
					private static WebElement  vendorAgeingSummaryReport;
					
					@FindBy(xpath="//*[@id='547']/span")
					private static WebElement  vendorSummaryAgeingByDueDateReport;
					
					@FindBy(xpath="//*[@id='549']/span")
					private static WebElement  vendorOverdueSummaryReport;
					
					@FindBy(xpath="//*[@id='634']/span")
					private static WebElement  vendorbillWiseSummaryReport;
				
				@FindBy(xpath="//*[@id='75']/span")
				private static WebElement  letterofCredit;
				
				@FindBy(xpath="//*[@id='165']/span")
				private static WebElement  releaseLetterofCredit;
		
			@FindBy(xpath="//*[@id='3301']/span")
			private static WebElement  financialsBudgetMenu; 
			
				@FindBy(xpath="//*[@id='3302']/span")
				private static WebElement  defineBudgetReport;
				
				@FindBy(xpath="//*[@id='3303']/span")
				private static WebElement  confirmBudgetReport;
				
				@FindBy(xpath="//*[@id='3304']/span")
				private static WebElement  reviseBudgetMenu;
				
					@FindBy(xpath="//*[@id='3305']/span")
					private static WebElement  appendBudget;
					
					@FindBy(xpath="//*[@id='3306']/span")
					private static WebElement  addORReduceBudget;
					
					@FindBy(xpath="//*[@id='3307']/span")
					private static WebElement  transferBudget;
				
				@FindBy(xpath="//*[@id='3309']/span")
				private static WebElement  approveBudgetReport;
				
				@FindBy(xpath="//*[@id='3310']/span")
				private static WebElement  rejectedBudgetReport;
				
				@FindBy(xpath="//*[@id='3321']/span")
				private static WebElement  budgetReportsMenu;
				
					@FindBy(xpath="//*[@id='666']/span")
					private static WebElement  advancedBudgetReportMenu;
					
					@FindBy(xpath="//*[@id='669']/span")
					private static WebElement  revisedBudgetReportMenu;
			
					
			@FindBy(xpath="//*[@id='3311']/span")
			private static WebElement  financialsOnlinePaymentsMenu;   
			
				@FindBy(xpath="//*[@id='3312']/span")
				private static WebElement  onlineBankRegistrationMenu;
				
				@FindBy(xpath="/html/body/section/div[2]/aside/section/ul/li[2]/ul/li[7]/ul/li[2]/a/span")
				private static WebElement  issuePaymentToBankMenu;
				
				@FindBy(xpath="/html/body/section/div[2]/aside/section/ul/li[2]/ul/li[7]/ul/li[3]/a/span")
				private static WebElement  reconcilePaymentsMenu;
				
				@FindBy(xpath="//*[@id='3315']/span")
				private static WebElement  onlineBankReconcilationMenu;
				
				@FindBy(xpath="//*[@id='3317']/span")
				private static WebElement  bankStatementMenu;	
				
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
			
			public static boolean checkFianancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
	
			     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
				 
			     financialsMenu.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
				
				 if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
			    		getDashboard.equalsIgnoreCase("Dashboard") && financialsTransactionMenu.isDisplayed() && 
			    		financialsCreditManagementMenu.isDisplayed() && financialsReportsMenu.isDisplayed() && 
			    		financialsFinalAccountsMenu.isDisplayed() && financialsReceivableAndPayableAnalysisMenu.isDisplayed() && 
						financialsBudgetMenu.isDisplayed() && financialsBudgetMenu.isDisplayed())
				 {
					excelReader.setCellData(xlfile, "Sheet1", 95, 9, resPass);
					return true;
	    		 }
	    		 else
	    		 {
	    			excelReader.setCellData(xlfile, "Sheet1", 95, 9, resFail);
	    			return false;
	    		 }
			
			  }

		
			public static boolean checkTransactionsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
			     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
				 
			     financialsTransactionMenu.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
				
				 if(cashAndBankMenu.isDisplayed() && financialsTransactionsPurchaseMenu.isDisplayed() && 
						 financialsTransactionsSalesMenu.isDisplayed() && financialsTransactionsJournalsMenu.isDisplayed() && 
						 financialsTransactionsAutoPostingsMenu.isDisplayed())
				 {
					excelReader.setCellData(xlfile, "Sheet1", 96, 9, resPass);
					return true;
	    		 }
	    		 else
	    		 {
	    			excelReader.setCellData(xlfile, "Sheet1", 96, 9, resFail);
	    			return false;
	    		 }
			
			  }

     		
			
			public static boolean checkFinancialsCashAndBankMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
			     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
				 
			     cashAndBankMenu.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(receiptsVoucher));
				
				 if(receiptsVoucher.isDisplayed() && paymentsVoucher.isDisplayed() && pettyVoucher.isDisplayed() && 
						 postDatedReceiptsVoucher.isDisplayed() && postDatedPaymentsVoucher.isDisplayed() &&  
						 defineChequeSeries.isDisplayed() && cancelCheque.isDisplayed())
				 {
					excelReader.setCellData(xlfile, "Sheet1", 97, 9, resPass);
					return true;
	    		 }
	    		 else
	    		 {
	    			excelReader.setCellData(xlfile, "Sheet1", 97, 9, resFail);
	    			return false;
	    		 }
			
			  }
			

			
			
			public static boolean checkFinancialsPurchasesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
			     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
				 
			     financialsTransactionsPurchaseMenu.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucher));
				
				 if(purchaseVoucher.isDisplayed() && purchaseReturnsVoucher.isDisplayed())
				 {
					excelReader.setCellData(xlfile, "Sheet1", 98, 9, resPass);
					return true;
	    		 }
	    		 else
	    		 {
	    			excelReader.setCellData(xlfile, "Sheet1", 98, 9, resFail);
	    			return false;
	    		 }
			
			  }
			
		
			
			
			
			
			public static boolean checkFinancialsSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
			{
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
			     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsSalesMenu));
				 
			     financialsTransactionsSalesMenu.click();
				 
				 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoicesVoucher));
				
				 if(salesInvoicesVoucher.isDisplayed() && salesReturnsVoucher.isDisplayed() && cashSales.isDisplayed() && 
						 hirePurchaseSales.isDisplayed())
				 {
					excelReader.setCellData(xlfile, "Sheet1", 99, 9, resPass);
					return true;
	    		 }
	    		 else
	    		 {
	    			excelReader.setCellData(xlfile, "Sheet1", 99, 9, resFail);
	    			return false;
	    		 }
			
			  }
			
		
			
				/*public static boolean checkFinancialsJournalEntriesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
				{
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
				     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsJournalsMenu));
					 
				     financialsTransactionsJournalsMenu.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(journalsEntriesVoucher));
					
					 if(journalsEntriesVoucher.isDisplayed() && forexJVVoucher.isDisplayed() && interdepartmentaljvVoucher.isDisplayed() && 
							 oldJouranlEntriesVoucher.isDisplayed() && debitNotesVoucher.isDisplayed() && 
							 debitNotesLinewiseVoucher.isDisplayed() && creditNotesVoucher.isDisplayed() &&
							 creditNotesLinewiseVoucher.isDisplayed()&& openingBalancesVoucher.isDisplayed() && 
							 fixedAssetsDepreciationVoucher.isDisplayed())
					 {
						excelReader.setCellData(xlfile, "Sheet1", 100, 9, resPass);
						return true;
		    		 }
		    		 else
		    		 {
		    			excelReader.setCellData(xlfile, "Sheet1", 100, 9, resFail);
		    			return false;
		    		 }
				
				  }
				
				
			*/
				
				
				public static boolean checkFinancialsJournalsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
				{
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
				     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsJournalsMenu));
					 
				     financialsTransactionsJournalsMenu.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(journalsEntriesVoucher));
					
					 if(journalsEntriesVoucher.isDisplayed() && forexJVVoucher.isDisplayed() && interdepartmentaljvVoucher.isDisplayed() && 
							 oldJouranlEntriesVoucher.isDisplayed() && debitNotesVoucher.isDisplayed() && 
							 creditNotesVoucher.isDisplayed() && openingBalancesVoucher.isDisplayed() &&
							 fixedAssetsDepreciationVoucher.isDisplayed())
					 {
						excelReader.setCellData(xlfile, "Sheet1", 100, 9, resPass);
						return true;
		    		 }
		    		 else
		    		 {
		    			excelReader.setCellData(xlfile, "Sheet1", 100, 9, resFail);
		    			return false;
		    		 }
				
				  }
				
			
				
				public static boolean checkFinancialsAutoPostingsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
				{
					excelReader=new ExcelReader(POJOUtility.getExcelPath());
					xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
				     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsAutoPostingsMenu));
					 
				     financialsTransactionsAutoPostingsMenu.click();
					 
					 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(recurringJournalVoucher));
					
					 if(recurringJournalVoucher.isDisplayed() && postRecurringJournal.isDisplayed() && recurringJournalTemplate.isDisplayed() && 
							 postInterest.isDisplayed() && convertMaturedPDCs.isDisplayed() && 
							 assignPDCLimit.isDisplayed() && stockReplenishment.isDisplayed())
					 {
						excelReader.setCellData(xlfile, "Sheet1", 101, 9, resPass);
						return true;
		    		 }
		    		 else
		    		 {
		    			excelReader.setCellData(xlfile, "Sheet1", 101, 9, resFail);
		    			return false;
		    		 }
				
				  }
				
			
	
				
				
					public static boolean checkFinancialsCreditManagmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
					{
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
							
					     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsCreditManagementMenu));
						 
					     financialsCreditManagementMenu.click();
						 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentTerms));
						
						 if(paymentTerms.isDisplayed() && financeTerms.isDisplayed() && reminderTerms.isDisplayed() && 
								 sendReminder.isDisplayed() && delinquency.isDisplayed() && 
								 creidtApproval.isDisplayed())
						 {
							excelReader.setCellData(xlfile, "Sheet1", 102, 9, resPass);
							return true;
			    		 }
			    		 else
			    		 {
			    			excelReader.setCellData(xlfile, "Sheet1", 102, 9, resFail);
			    			return false;
			    		 }
					
					  }
					
				
						
					public static boolean checkFinancialsDeliquencySubMenuInCreditManagmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
					{
						excelReader=new ExcelReader(POJOUtility.getExcelPath());
						xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
							
					     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(delinquency));
						 
					     delinquency.click();
						 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(questionnarie));
						
						 if(questionnarie.isDisplayed() && delinquencyMgmt.isDisplayed())
						 {
							excelReader.setCellData(xlfile, "Sheet1", 103, 9, resPass);
							return true;
			    		 }
			    		 else
			    		 {
			    			excelReader.setCellData(xlfile, "Sheet1", 103, 9, resFail);
			    			return false;
			    		 }
					
					  }
				
					
					
						public static boolean checkFinancialsReportsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
						{
							excelReader=new ExcelReader(POJOUtility.getExcelPath());
							xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
								
						     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReportsMenu));
							 
						     financialsReportsMenu.click();
							 
							 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ledger));
							
							 if(ledger.isDisplayed() && ledgerDetail.isDisplayed() && subLedger.isDisplayed() &&
									 cashAndBankBooksMenu.isDisplayed() && salesReportsMenu.isDisplayed() && 
									 purchaseReportsMenu.isDisplayed() && registersReportMenu.isDisplayed() &&
									 salesAndPurchasesReportMenu.isDisplayed() && MiscellaneousAnalysisReportMenu.isDisplayed() &&
									 mastersInformationMenu.isDisplayed() && auditTrailMenu.isDisplayed() &&
									 accountQuery.isDisplayed())
							 {
								excelReader.setCellData(xlfile, "Sheet1", 104, 9, resPass);
								return true;
				    		 }
				    		 else
				    		 {
				    			excelReader.setCellData(xlfile, "Sheet1", 104, 9, resFail);
				    			return false;
				    		 }
						
						  }
					
						
							public static boolean checkCashAndBankMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
							{
								excelReader=new ExcelReader(POJOUtility.getExcelPath());
								xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
									
							     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankBooksMenu));
								 
							     cashAndBankBooksMenu.click();
								 
								 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashBookReport));
								
								 if(cashBookReport.isDisplayed() && bankBookReport.isDisplayed() && pettyCashBokReport.isDisplayed() &&
										 dayBookReport.isDisplayed() && bankReconciliationReport.isDisplayed() && 
										 bankReconciliationImport.isDisplayed() && customerVendorReconciliation.isDisplayed() &&
										 bankReconciliationStatement.isDisplayed() && chequeDiscountingMenu.isDisplayed())
								 {
									excelReader.setCellData(xlfile, "Sheet1", 105, 9, resPass);
									return true;
					    		 }
					    		 else
					    		 {
					    			excelReader.setCellData(xlfile, "Sheet1", 105, 9, resFail);
					    			return false;
					    		 }
							
							  }
							
							
						
						
			
								public static boolean checkSalesReportsMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
								{
									excelReader=new ExcelReader(POJOUtility.getExcelPath());
									xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
										
								     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
									 
								     salesReportsMenu.click();
									 
									 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesRegisterReport));
									
									 if(salesRegisterReport.isDisplayed() && salesReturnRegisterReport.isDisplayed() && 
											 summarySalesBookReport.isDisplayed() && monthlySalesBookReport.isDisplayed() &&
											 topCustomersListReport.isDisplayed())
									 {
										excelReader.setCellData(xlfile, "Sheet1", 106, 9, resPass);
										return true;
						    		 }
						    		 else
						    		 {
						    			excelReader.setCellData(xlfile, "Sheet1", 106, 9, resFail);
						    			return false;
						    		 }
								
								  }
									
								
								
								
									public static boolean checkPurchaseReportsMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
									{
										excelReader=new ExcelReader(POJOUtility.getExcelPath());
										xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
											
									     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReportsMenu));
										 
									     purchaseReportsMenu.click();
										 
										 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseRegisterReport));
										
										 if(purchaseRegisterReport.isDisplayed() && purchaseReturnRegisteReport.isDisplayed() && 
												 summaryPurchaseBookReport.isDisplayed() )
										 {
											excelReader.setCellData(xlfile, "Sheet1", 107, 9, resPass);
											return true;
							    		 }
							    		 else
							    		 {
							    			excelReader.setCellData(xlfile, "Sheet1", 107, 9, resFail);
							    			return false;
							    		 }
									
									  }
										
								
								
							
							 public static boolean checkRegisterReportsMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
							 {
									 excelReader=new ExcelReader(POJOUtility.getExcelPath());
									 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
												
									 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(registersReportMenu));
											 
									 registersReportMenu.click();
											 
									 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(openingBalanceRegisterReport));
											
									 if(openingBalanceRegisterReport.isDisplayed() && journalEntriesRegisterReport.isDisplayed() && 
											 creditNoteRegisterReport.isDisplayed() && debitNoteRegisterReport.isDisplayed() && receiptsRegisterReport.isDisplayed() &&
											 paymentRegisterReport.isDisplayed()   && pdcReceiptsRegisterReport.isDisplayed() &&
											 entryJournalRegisterMenu.isDisplayed())
								     {
										excelReader.setCellData(xlfile, "Sheet1", 108, 9, resPass);
									    return true;
								     }
								     else
								     {
								    	excelReader.setCellData(xlfile, "Sheet1", 108, 9, resFail);
								    	return false;
								     }
										
								}									
										
										
													
										
										
									 public static boolean checkSalesAndPurchaseAnalysisReportsMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
									 {
											 excelReader=new ExcelReader(POJOUtility.getExcelPath());
											 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
														
											 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesAndPurchasesReportMenu));
													 
											 salesAndPurchasesReportMenu.click();
													 
											 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesGroupedByCustomerReport));
													
											 if(salesGroupedByCustomerReport.isDisplayed() && salesGroupedByProductReport.isDisplayed() && 
													 salesGroupedByDepartmentReport.isDisplayed() && purchasesGroupedByVendorReport.isDisplayed() 
													 && purchasesGroupedByProductReport.isDisplayed() && purchasesGroupedByDepartmentReport.isDisplayed())
										     {
												excelReader.setCellData(xlfile, "Sheet1", 109, 9, resPass);
											    return true;
										     }
										     else
										     {
										    	excelReader.setCellData(xlfile, "Sheet1", 109, 9, resFail);
										    	return false;
										     }
											
										}	
									 
								
								public static boolean checkMicellaneousAnalysisReportsMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
								 {
										 excelReader=new ExcelReader(POJOUtility.getExcelPath());
										 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
													
										 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousAnalysisReportMenu));
												 
										 MiscellaneousAnalysisReportMenu.click();
												 
										 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(peakAndLowBalancesReport));
												
										 if(peakAndLowBalancesReport.isDisplayed() && comprativeAnalysisReport.isDisplayed() && 
												 transactionsTypeAnalysisReport.isDisplayed() && abcAnalysisReport.isDisplayed() 
												 && interestCalculationReport.isDisplayed())
									     {
											excelReader.setCellData(xlfile, "Sheet1", 110, 9, resPass);
										    return true;
									     }
									     else
									     {
									    	excelReader.setCellData(xlfile, "Sheet1", 110, 9, resFail);
									    	return false;
									     }
										
									}	
							
								
											
											
									
						
									public static boolean checkMastersInformationReportsMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
									 {
											 excelReader=new ExcelReader(POJOUtility.getExcelPath());
											 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
														
											 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersInformationMenu));
													 
											 mastersInformationMenu.click();
													 
											 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterInfoMenu));
													
											 if(masterInfoMenu.isDisplayed() && productLabelMenu.isDisplayed() && 
													 unitConversionMenu.isDisplayed() && skidDefinitionMenu.isDisplayed())
										     {
												excelReader.setCellData(xlfile, "Sheet1", 111, 9, resPass);
											    return true;
										     }
										     else
										     {
										    	excelReader.setCellData(xlfile, "Sheet1", 111, 9, resFail);
										    	return false;
										     }
											
										}	
								
	
										

										public static boolean checkAuditTrailReportsMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
										{
												 excelReader=new ExcelReader(POJOUtility.getExcelPath());
												 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
															
												 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailMenu));
														 
												 auditTrailMenu.click();
														 
												 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailtransactionsReport));
														
												 if(auditTrailtransactionsReport.isDisplayed() && aAuditTrailloginsReport.isDisplayed())
											     {
													excelReader.setCellData(xlfile, "Sheet1", 112, 9, resPass);
												    return true;
											     }
											     else
											     {
											    	excelReader.setCellData(xlfile, "Sheet1", 112, 9, resFail);
											    	return false;
											     }
												
										 }	
										
										
										
									 
											
							
											public static boolean checkFinalAccountsReportsMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
											{
													 excelReader=new ExcelReader(POJOUtility.getExcelPath());
													 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
																
													 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsFinalAccountsMenu));
															 
													 financialsFinalAccountsMenu.click();
															 
													 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(trialBalanceReport));
															
													 if(trialBalanceReport.isDisplayed() && profitandLossReport.isDisplayed() && tradingAccountReport.isDisplayed() &&
															 tradingandProfitAndLossReport.isDisplayed() && balanceSheetReport.isDisplayed() &&
															 finalAccountSchedulesReport.isDisplayed() && fundFlowReport.isDisplayed() && 
															 cashFlowReport.isDisplayed() && cashFlowCalendarReport.isDisplayed() &&
															 cashFlowAnalysisReport.isDisplayed() && advanceCashFlowReport.isDisplayed() &&
															 incomeExpenseTrendsReport.isDisplayed() && receivablePayableReport.isDisplayed())
												     {
														excelReader.setCellData(xlfile, "Sheet1", 113, 9, resPass);
													    return true;
												     }
												     else
												     {
												    	excelReader.setCellData(xlfile, "Sheet1", 113, 9, resFail);
												    	return false;
												     }
													
											 }	
									
											
										
												
												
												public static boolean checkReceivableAndPayableAnalysisMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
												{
														 excelReader=new ExcelReader(POJOUtility.getExcelPath());
														 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
																	
														 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsReceivableAndPayableAnalysisMenu));
																 
														 financialsReceivableAndPayableAnalysisMenu.click();
																 
														 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
																
														 if(customerDetailMenu.isDisplayed() && customerSummaryMenu.isDisplayed() && vendorDetailMenu.isDisplayed() &&
																 vendorSummaryMenu.isDisplayed() && letterofCredit.isDisplayed() &&
																 releaseLetterofCredit.isDisplayed())
													     {
															excelReader.setCellData(xlfile, "Sheet1", 114, 9, resPass);
														    return true;
													     }
													     else
													     {
													    	excelReader.setCellData(xlfile, "Sheet1", 114, 9, resFail);
													    	return false;
													     }
														
												 }				
												
												
												
		
													public static boolean checkCustomerDetailMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
													{
															 excelReader=new ExcelReader(POJOUtility.getExcelPath());
															 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
																		
															 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
																	 
															 customerDetailMenu.click();
																	 
															 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerListingOfOutstandingBillsReport));
																	
															 if(customerListingOfOutstandingBillsReport.isDisplayed() && customerStatementsReport.isDisplayed() && 
																	 customerDueDateAnalysisReport.isDisplayed() && customerAgeingDetailsReport.isDisplayed() && 
																	 customerDetailAgeingbyDueDateReport.isDisplayed() && customerOverdueAnalysisReport.isDisplayed())
														     {
																excelReader.setCellData(xlfile, "Sheet1", 115, 9, resPass);
															    return true;
														     }
														     else
														     {
														    	excelReader.setCellData(xlfile, "Sheet1", 115, 9, resFail);
														    	return false;
														     }
															
													 }					
												
													
													
						

														
														public static boolean checkCustomerSummaryMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
														{
																 excelReader=new ExcelReader(POJOUtility.getExcelPath());
																 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
																			
																 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
																		 
																 customerSummaryMenu.click();
																		 
																 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAgeingSummaryMenu));
																		
																 if(customerAgeingSummaryMenu.isDisplayed() && customerSummaryAgeingByDueDateMenu.isDisplayed() && 
																		 customerOverdueSummaryMenu.isDisplayed() && customerbillwiseSummaryMenu.isDisplayed() )
															     {
																	excelReader.setCellData(xlfile, "Sheet1", 116, 9, resPass);
																    return true;
															     }
															     else
															     {
															    	excelReader.setCellData(xlfile, "Sheet1", 116, 9, resFail);
															    	return false;
															     }
																
														 }	
														
														
					
							

																						
															public static boolean checkVendorDetailMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
															{
																	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
																	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
																				
																	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
																			 
																	 vendorDetailMenu.click();
																			 
																	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorListingoFOutstandingBillsReport));
																			
																	 if(vendorListingoFOutstandingBillsReport.isDisplayed() && vendorStatementsReport.isDisplayed() && 
																			 vendorDueDateAnalysisReport.isDisplayed() && vendorAgeingDetailsReport.isDisplayed()  &&
																			 vendorDetailVendorDetailAgeingByDueDateMenu.isDisplayed() && 
																			 vendorOverdueAnalysisMenu.isDisplayed())
																     {
																		excelReader.setCellData(xlfile, "Sheet1", 117, 9, resPass);
																	    return true;
																     }
																     else
																     {
																    	excelReader.setCellData(xlfile, "Sheet1", 117, 9, resFail);
																    	return false;
																     }
																	
															 }	
															
															public static boolean checkVendorSumaryMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
															{
																	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
																	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
																				
																	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
																			 
																	 vendorSummaryMenu.click();
																			 
																	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAgeingSummaryReport));
																			
																	 if(vendorAgeingSummaryReport.isDisplayed() && vendorSummaryAgeingByDueDateReport.isDisplayed() && 
																			 vendorOverdueSummaryReport.isDisplayed() && vendorbillWiseSummaryReport.isDisplayed())
																     {
																		excelReader.setCellData(xlfile, "Sheet1", 118, 9, resPass);
																	    return true;
																     }
																     else
																     {
																    	excelReader.setCellData(xlfile, "Sheet1", 118, 9, resFail);
																    	return false;
																     }
																	
															 }	
																		
															
															
										
											
																
																
													
 
				
				public static boolean checkBudgetMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
				{
						 excelReader=new ExcelReader(POJOUtility.getExcelPath());
						 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
									
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsBudgetMenu));
								 
						 financialsBudgetMenu.click();
								 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(defineBudgetReport));
								
						 if(defineBudgetReport.isDisplayed() && confirmBudgetReport.isDisplayed() && 
								 reviseBudgetMenu.isDisplayed() && approveBudgetReport.isDisplayed() && rejectedBudgetReport.isDisplayed() &&
								 budgetReportsMenu.isDisplayed())
					     {
							excelReader.setCellData(xlfile, "Sheet1", 119, 9, resPass);
						    return true;
					     }
					     else
					     {
					    	excelReader.setCellData(xlfile, "Sheet1", 119, 9, resFail);
					    	return false;
					     }
						
				 }	
				
				public static boolean checkReviseBudgetMenuReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
				{
						 excelReader=new ExcelReader(POJOUtility.getExcelPath());
						 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
									
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(reviseBudgetMenu));
								 
						 reviseBudgetMenu.click();
								 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(appendBudget));
								
						 if(appendBudget.isDisplayed() && addORReduceBudget.isDisplayed() && 
								 transferBudget.isDisplayed())
					     {
							excelReader.setCellData(xlfile, "Sheet1", 120, 9, resPass);
						    return true;
					     }
					     else
					     {
					    	excelReader.setCellData(xlfile, "Sheet1", 120, 9, resFail);
					    	return false;
					     }
						
				 }	

														
				
				public static boolean checkBudgetReportsInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException
				{
						 excelReader=new ExcelReader(POJOUtility.getExcelPath());
						 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
									
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetReportsMenu));
								 
						 budgetReportsMenu.click();
								 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(advancedBudgetReportMenu));
								
						 if(advancedBudgetReportMenu.isDisplayed() && revisedBudgetReportMenu.isDisplayed())
					     {
							excelReader.setCellData(xlfile, "Sheet1", 121, 9, resPass);
						    return true;
					     }
					     else
					     {
					    	excelReader.setCellData(xlfile, "Sheet1", 121, 9, resFail);
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
		
			
				
				public static boolean checkOnlinePaymentInFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
				{
						 excelReader=new ExcelReader(POJOUtility.getExcelPath());
						 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
									
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsOnlinePaymentsMenu));
								 
						 financialsOnlinePaymentsMenu.click();
								 
						 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(onlineBankRegistrationMenu));
								
						 if(onlineBankRegistrationMenu.isDisplayed() && issuePaymentToBankMenu.isDisplayed() &&
								 /*reconcilePaymentsMenu.isDisplayed() &&*/ onlineBankReconcilationMenu.isDisplayed() &&
								 bankStatementMenu.isDisplayed())
					     {
							excelReader.setCellData(xlfile, "Sheet1", 122, 9, resPass);
						
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
	    						excelReader.setCellData(xlfile, "Sheet1", 122, 9, resPass);
	    						return true;
			    			  }
			    			  else
			    			  {
	    						excelReader.setCellData(xlfile, "Sheet1", 122, 9, resFail);
	    						return false;
			    			  }
					     }
					     else
					     {
					    	excelReader.setCellData(xlfile, "Sheet1", 122, 9, resFail);
					    	return false;
					     }
						
				 }	
	
					
				
				
				
				 public HPFinancialsMenuPage(WebDriver driver) 
				 {
				 	PageFactory.initElements(driver, this);	
				 }

}
