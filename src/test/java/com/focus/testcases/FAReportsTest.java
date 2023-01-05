package com.focus.testcases;

import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.FAReportsPage;

import com.focus.base.BaseEngine;

public class FAReportsTest extends BaseEngine

{

	FAReportsPage srp;
	
	@Test(priority=101)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkLogin(), true);
	}
	/*
	@Test(priority=102)
	public void checkFinanacialLedgerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinanacialLedgerReport(), true);
	}
	
	
	@Test(priority=104)
	public void checkLedgerDetailsreport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkLedgerDetailsreport(), true);
	}

	
	@Test(priority=107)
	public void checkSubledgerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSubledgerReport(), true);
	}
	
	
	
	
	@Test(priority=109)
	public void checkCashAndBankReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCashAndBankReport(), true);
	}
	
	
	@Test(priority=110)//
	public void checkBankBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBankBookReport(), true);
	}
	

	
	@Test(priority=112)
	public void checkPettyCashBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPettyCashBookReport(), true);
	}
	
	
	
	@Test(priority=113)
	public void checkDayBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkDayBookReport(), true);
	}
	
	@Test(priority=114)
	public void checkBankReconciliationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBankReconciliationReport(), true);
	}

	
	@Test(priority=116)
	public void checkCustomerVendorReconciliationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerVendorReconciliationReport(), true);
	}
	

	@Test(priority=117)
	public void checkBankReconciliationStatementReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBankReconciliationStatementReport(), true);
	}

	
	@Test(priority=119)
	public void checkChequeDiscountingReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkChequeDiscountingReport(), true);
	}
	

	@Test(priority=120)
	public void checkSalesRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesRegisterReport(), true);
	}

	
	@Test(priority=122)
	public void checkSalesReturnRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesReturnRegisterReport(), true);
	}
	
	
	
	@Test(priority=123)
	public void checkSummarySalesBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSummarySalesBookReport(), true);
	}
	
	
	
	
	@Test(priority=125)
	public void checkMonthlySalesBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkMonthlySalesBookReport(), true);
	}
	
	@Test(priority=126)
	public void checkTopCustomerListReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTopCustomerListReport(), true);
	}
	
	
	
	
	@Test(priority=128)
	public void checkPurchaseRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchaseRegisterReport(), true);
	}
	
	
	@Test(priority=130)
	public void checkPurchaseReturnRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchaseReturnRegisterReport(), true);
	}
	
	
	@Test(priority=131)
	public void checkSummaryPurchaseBookReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSummaryPurchaseBookReport(), true);
	}
	
	
	
	@Test(priority=133)
	public void checkVatPurchaseAccountReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatPurchaseAccountReport(), true);
	}
	
	
	
	@Test(priority=135)
	public void checkVatDetailedReportReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatDetailedReportReport(), true);
	}

	@Test(priority=136)
	public void checkSalesAccountReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesAccountReport(), true);
	}
	
	@Test(priority=137)
	public void checkSalesByCustomerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesByCustomerReport(), true);
	}

	@Test(priority=138)
	public void checkVatSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatSummaryReport(), true);
	}
	
	@Test(priority=139)
	public void checkVatAuditFileReportOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatAuditFileReportOptions(), true);
	}
	
	@Test(priority=140)
	public void checkVatReturnReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVatReturnReport(), true);
	}
	
	
	@Test(priority=141)
	public void checkSalesAdvanceVatReportOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesAdvanceVatReportOptions(), true);
	}
	
	@Test(priority=142)
	public void checkOpeningBalanceRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkOpeningBalanceRegisterReport(), true);
	}
	
	@Test(priority=143)
	public void checkJournalEntriesRegisterOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkJournalEntriesRegisterOptions(), true);
	}
	
	@Test(priority=144)
	public void checkCreditNoteRegisterOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCreditNoteRegisterOptions(), true);
	}
	
	
	@Test(priority=145)
	public void checkDebitNoteRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkDebitNoteRegisterReport(), true);
	}
	
	@Test(priority=146)
	public void checkReceiptRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkReceiptRegisterReport(), true);
	}
	
	@Test(priority=147)
	public void checkPaymentRegisterOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPaymentRegisterOptions(), true);
	}
	
	@Test(priority=148)
	public void checkPdcReceiptsRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPdcReceiptsRegisterReport(), true);
	}
	
	@Test(priority=149)
	public void checkPdcPaymentsRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPdcPaymentsRegisterReport(), true);
	}
	
	
	@Test(priority=150)
	public void checkEntryJournalRegisterReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkEntryJournalRegisterReport(), true);
	}
	
	
	@Test(priority=151)
	public void checkEntryJournalDetailReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkEntryJournalDetailReport(), true);
	}
	
	
	@Test(priority=152)
	public void checksalesGroupedByCustomerReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checksalesGroupedByCustomerReport(), true);
	}
	
	@Test(priority=153)
	public void checkSalesGroupedByProductReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesGroupedByProductReport(), true);
	}
	
	
	@Test(priority=154)
	public void checkSalesGroupedByDepartmentReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSalesGroupedByDepartmentReport(), true);
	}
	
	@Test(priority=155)
	public void checkPurchasesGroupedByVendorOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchasesGroupedByVendorOptions(), true);
	}
	
	@Test(priority=156)
	public void checkPurchasesGroupedByProductReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchasesGroupedByProductReport(), true);
	}
	
	
	@Test(priority=157)
	public void checkPurchasesGroupedByDepartmentReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkPurchasesGroupedByDepartmentReport(), true);
	}
	
	
	@Test(priority=159)
	public void checkMiscellaneousAnalysispeakAndLowBalancesReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkMiscellaneousAnalysispeakAndLowBalancesReport(), true);
	}
	
	
	@Test(priority=160)
	public void checkComprativeAnalysisOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkComprativeAnalysisOptions(), true);
	}
	
	@Test(priority=161)
	public void checkTransactionsTypeAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTransactionsTypeAnalysisReport(), true);
	}
	
	@Test(priority=162)
	public void checkAbcAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAbcAnalysisReport(), true);
	}
	
	
	@Test(priority=164)
	public void checkInterestCalculationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkInterestCalculationReport(), true);
	}
	
	
	@Test(priority=165)
	public void checkMastersInformationMenuReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkMastersInformationMenuReport(), true);
	}
	
	@Test(priority=166)
	public void checkProductLabelReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProductLabelReport(), true);
	}
	
	
	@Test(priority=167)
	public void checkUnitConversionReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkUnitConversionReport(), true);
	}
	
	
	@Test(priority=168)
	public void checkSkidDefinitionReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkSkidDefinitionReport(), true);
	}
	
	
	@Test(priority=169)
	public void checkAuditTrailTransactionsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAuditTrailTransactionsReport(), true);
	}
	
	
	@Test(priority=170)
	public void checkAuditTrailLoginsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAuditTrailLoginsReport(), true);
	}
	
	
	@Test(priority=171)
	public void checkAccountQueryOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAccountQueryOptions(), true);
	}
	
	@Test(priority=172)
	public void checkTransactionAuthorizationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTransactionAuthorizationReport(), true);
	}
	
	@Test(priority=173)
	public void checkMasterAuthorizationReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkMasterAuthorizationReport(), true);
	}
	
	
	@Test(priority=174)
	public void checkTrailBalanceReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTrailBalanceReport(), true);
	}
	
	
	
	@Test(priority=176)
	public void checkProfitAndLossReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkProfitAndLossReport(), true);
	}
	
	
	@Test(priority=178)
	public void checkTradingAccountOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTradingAccountOptions(), true);
	}
	
	
	@Test(priority=180)
	public void checkTradingAndProfitAndLossReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkTradingAndProfitAndLossReport(), true);
	}
	
	
	
	@Test(priority=182)
	public void checkBalanceSheetOptions() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBalanceSheetOptions(), true);
	}
	
	
	
	
	@Test(priority=184)//Expected 
	public void checkFinalAccountsSchedulesReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFinalAccountsSchedulesReport(), true);
	}
	
	
	
	@Test(priority=186)
	public void checkFundFlowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkFundFlowReport(), true);
	}
	
	

	@Test(priority=188)
	public void checkCashFlowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCashFlowReport(), true);
	}
	

	
	@Test(priority=190)
	public void checkCashFLowAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCashFLowAnalysisReport(), true);
	}
	
	
	
	@Test(priority=192)
	public void checkAdvanceCashFLowReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkAdvanceCashFLowReport(), true);
	}
	

	@Test(priority=193)
	public void checkBudgetPlanningReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkBudgetPlanningReport(), true);
	}
	
	@Test(priority=194)
	public void checkIncomeExpenseTrendReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkIncomeExpenseTrendReport(), true);
	}
	
	@Test(priority=195)
	public void checkReceavibleAndPayableReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkReceavibleAndPayableReport(), true);
	}
	
	
	
	// Receivable and Payable Analysis Reports Starts from Here
	
	
	@Test(priority=201)
	public void checkCustomerListingOfOutstandingBillsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerListingOfOutstandingBillsReport(), true);
	}
	

	
	
	@Test(priority=203)
	public void checkCustomerStatementReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerStatementReport(), true);
	}
	
	
	@Test(priority=205)
	public void checkCustomerDueDateAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerDueDateAnalysisReport(), true);
	}
	
	
	
	@Test(priority=207)
	public void checkCustomerAgeingDetailsAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerAgeingDetailsAnalysisReport(), true);
	}
	

	
	@Test(priority=209)
	public void checkCustomerAgeingDetailsByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerAgeingDetailsByDueDateReport(), true);
	}
	
	
	
	@Test(priority=211)
	public void checkCustomerOverDueAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkCustomerOverDueAnalysisReport(), true);
	}
	
	
	
	@Test(priority=213)
	public void checkcustomerSummaryCustomerAgeingSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkcustomerSummaryCustomerAgeingSummaryReport(), true);
	}
	
	
	
	@Test(priority=215)
	public void checkcustomerSummaryAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkcustomerSummaryAgeingByDueDateReport(), true);
	}
	

	
	@Test(priority=217)
	public void checkcustomerSummaryCustomerOverDueSummeryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkcustomerSummaryCustomerOverDueSummeryReport(), true);
	}
	
	
	
	
	@Test(priority=219)
	public void checkcustomerSummaryCustomerBillWiseSummeryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkcustomerSummaryCustomerBillWiseSummeryReport(), true);
	}
	
	
	@Test(priority=221)
	public void checkVendorListingOfOutstandingBillsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorListingOfOutstandingBillsReport(), true);
	}
	
	
	
	@Test(priority=224)
	public void checkvendorDetailsVendorStatementsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkvendorDetailsVendorStatementsReport(), true);
	}

	
	
	@Test(priority=226)
	public void checkvendorDetailsVendorDueDateAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkvendorDetailsVendorDueDateAnalysisReport(), true);
	}
	
	
	
	@Test(priority=228)
	public void checkVendorDetailsVendorAgeingDetailsReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsVendorAgeingDetailsReport(), true);
	}
	
	*/
	@Test(priority=230)
	public void checkVendorDetailsVendorDetailsAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsVendorDetailsAgeingByDueDateReport(), true);
	}
	
	/*
	
	@Test(priority=232)
	public void checkVendorDetailsVendorOverdueAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException, ParseException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorDetailsVendorOverdueAnalysisReport(), true);
	}
	
	
	@Test(priority=233)
	public void CheckPrintAndCustomiseOptionnInVendorDetailsVendorOverdueAnalysisReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorDetailsVendorOverdueAnalysisReport(), true);
	}
	
	
	@Test(priority=234)
	public void checkVendorSummeryVendorAgeingSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorAgeingSummaryReport(), true);
	}
	
	@Test(priority=235)
	public void CheckPrintAndCustomiseOptionnInVendorSummeryVendorAgeingSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorSummeryVendorAgeingSummaryReport(), true);
	}
	
	@Test(priority=236)
	public void checkVendorSummeryVendorSummaryAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorSummaryAgeingByDueDateReport(), true);
	}
	
	@Test(priority=237)
	public void CheckPrintAndCustomiseOptionnInVendorSummeryVendorSummaryAgeingByDueDateReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorSummeryVendorSummaryAgeingByDueDateReport(), true);
	}
	
	
	@Test(priority=238)
	public void checkVendorSummeryVendorOverdueSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorOverdueSummaryReport(), true);
	}
	
	@Test(priority=239)
	public void CheckPrintAndCustomiseOptionnInVendorSummeryVendorOverdueSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorSummeryVendorOverdueSummaryReport(), true);
	}
	
	
	@Test(priority=240)
	public void checkVendorSummeryVendorBillWiseSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.checkVendorSummeryVendorBillWiseSummaryReport(), true);
	}
	
	@Test(priority=241)
	public void CheckPrintAndCustomiseOptionnInVendorSummeryVendorBillwiseSummaryReport() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		srp=new FAReportsPage(getDriver());
		Assert.assertEquals(srp.CheckPrintAndCustomiseOptionnInVendorSummeryVendorBillwiseSummaryReport(), true);
	}
	
	
	*/
	
	
	
	
	
	
	
	
	
}
