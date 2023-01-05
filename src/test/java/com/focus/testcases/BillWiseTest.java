package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.BillWisePage;
import com.focus.base.BaseEngine;



public class BillWiseTest extends BaseEngine 
{

	static BillWisePage bp;
	
	
	@Test(priority=90)
	public void checkLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkLogin(), true);	
	}
	
	//OPening Balance 
	
	@Test(priority=91)
	public void checkSavingOpeningBalanceWithCreditAmount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingOpeningBalanceWithCreditAmount(), true);	
	}
	
	@Test(priority=92)
	public void checkSavingOpeningBalanceWithDebitAmount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingOpeningBalanceWithDebitAmount(), true);	
	}
	
	
	@Test(priority=93)
	public void checkPreviousButtonInOpeningBalanceSavedVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPreviousButtonInOpeningBalanceSavedVoucher(), true);	
	}
	
	
	
	 
	
	//Payments
	@Test(priority=102)
	public void checkPaymentsVATPendingBills() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPaymentsVATPendingBills(), true);	
	}
	
	@Test(priority=103)
	public void checkSavingVoucherPaymentsVATWithVendorNewRefrence() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherPaymentsVATWithVendorNewRefrence(), true);	
	}
	
	
	@Test(priority=104)
	public void checkSavingVoucherWithVendorSemiAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherWithVendorSemiAdjustment(), true);	
	}
	
	@Test(priority=105)
	public void checkSavingVoucherInPaymentsVATWithVendorFullAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInPaymentsVATWithVendorFullAdjustment(), true);	
	}
	
	@Test(priority=106)
	public void checkSavingVoucherInPaymentsVATWithCustomerSemiAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInPaymentsVATWithCustomerSemiAdjustment(), true);	
	}
	

	
	//Purchase Voucher VAT
	
	@Test(priority=110)
	public void checkPendingBillsInPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPendingBillsInPurchaseVoucherVAT(), true);	
	}
	
	@Test(priority=111)
	public void checkSavingVoucherInPaymentsVATWithNewRefrence() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInPaymentsVATWithNewRefrence(), true);	
	}
	

	@Test(priority=112)
	public void checkSavingVoucherWithSemiVendorTypeInPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherWithSemiVendorTypeInPurchaseVoucherVAT(), true);	
	}
	
	
	@Test(priority=113)
	public void checkSavingVoucherWithFullAdjustmentVendorTypeInPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherWithFullAdjustmentVendorTypeInPurchaseVoucherVAT(), true);	
	}
	
	
	//Sales Invoice VAT
	
	@Test(priority=120)
	public void checkPendingBillsInSalesINvoiceVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPendingBillsInSalesINvoiceVAT(), true);	
	}
	
	@Test(priority=121)
	public void checkSavingSalesINvoiceVoucherWithCustomrNewRefrence() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingSalesINvoiceVoucherWithCustomrNewRefrence(), true);	
	}
	
	@Test(priority=122)
	public void checkSavingSalesINvoiceVoucherWithCustomerSemiAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingSalesINvoiceVoucherWithCustomerSemiAdjustment(), true);	
	}
	
	@Test(priority=123)
	public void checkSavingSalesINvoiceVoucherWithCustomrFullAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingSalesINvoiceVoucherWithCustomrFullAdjustment(), true);	
	}
	
	
	
	//Recepits 
	
	
	@Test(priority=130)
	public void checkSavingRecepitsVATVocherWithCustomerNewReference() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingRecepitsVATVocherWithCustomerNewReference(), true);	
	}
	
	@Test(priority=131)
	public void checkSavingRecepitsVATVocherWithCustomerSemiAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingRecepitsVATVocherWithCustomerSemiAdjustment(), true);	
	}
	
	@Test(priority=132)
	public void checkSavingRecepitsVATVocherWithCustomerFullAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingRecepitsVATVocherWithCustomerFullAdjustment(), true);	
	}
	
	
	@Test(priority=133)
	public void checkBillWsieScreenAfterTotalConsumeInRecepitsVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkBillWsieScreenAfterTotalConsumeInRecepitsVAT(), true);	
	}
	
	
	@Test(priority=134)
	public void checkSavedVoucherInRecepitsVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavedVoucherInRecepitsVAT(), true);	
	}
	
	
	
	@Test(priority=140)
	public void checkSalesRetunsBillWiseScreenWithCovertingOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSalesRetunsBillWiseScreenWithCovertingOption(), true);	
	}
	

	@Test(priority=141)
	public void checkSavingVoucherInJVVATViewWithVendorNewReference() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInJVVATViewWithVendorNewReference(), true);	
	}
	
	@Test(priority=142)
	public void checkSavingVoucherInJVVATViewWithVendorSemiAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInJVVATViewWithVendorSemiAdjustment(), true);	
	}
	
	
	@Test(priority=143)
	public void checkSavingVoucherInJVVATViewWithVendorFullAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInJVVATViewWithVendorFullAdjustment(), true);	
	}
	
	
	
	@Test(priority=144)
	public void checkSavingJVVATViewVoucherWithCustomersInOneVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingJVVATViewVoucherWithCustomersInOneVoucher(), true);	
	}
	
	
	
	@Test(priority=146)
	public void checkSavingPaymentsAfterSavingJVVATView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingPaymentsAfterSavingJVVATView(), true);	
	}
	
	
	@Test(priority=147)
	public void checkSavingPaymentsAfterSavingJVVATViewWithVendorSemi() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingPaymentsAfterSavingJVVATViewWithVendorSemi(), true);	
	}
	
	
	@Test(priority=148)
	public void checkSavingPaymentsAfterSavingJVVATViewWithCustomerSemi() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingPaymentsAfterSavingJVVATViewWithCustomerSemi(), true);	
	}
	
	@Test(priority=150)
	public void checkSavingVoucherInCreditVATWithCustomerFullAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInCreditVATWithCustomerFullAdjustment(), true);	
	}
	
	@Test(priority=151)
	public void checkSavingVoucherInCreditVATWithCustomerSemiAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		
		Assert.assertEquals(bp.checkSavingVoucherInCreditVATWithCustomerSemiAdjustment(), true);	
	}
	
	@Test(priority=152)
	public void checkSavingVoucherInCreditVATWithCustomerNewRefernce() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInCreditVATWithCustomerNewRefernce(), true);	
	}
	
	
	
	
	
	
	@Test(priority=160)
	public void checkSavingVoucherInDebitNotesVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInDebitNotesVAT(), true);	
	}
	
	@Test(priority=161)
	public void checkSavingVoucherInDebitNotesVATWithVendorSemiAdjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInDebitNotesVATWithVendorSemiAdjustment(), true);	
	}
	
	
	@Test(priority=162)
	public void checkSavingVoucherInDebitNotesVATWithCustomerNewReference() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInDebitNotesVATWithCustomerNewReference(), true);	
	}
	
	
	
	
	@Test(priority=163)
	public void checkSavingPaymentsAfterSavingCreditNotes() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingPaymentsAfterSavingCreditNotes(), true);	
	}
	
	
	//PDC VOUCHERS
	
	@Test(priority=211)
	public void checkPDCOptionsUnderSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPDCOptionsUnderSettings(), true);	
	}
	
	
	@Test(priority=212)
	public void checkConvertedMaturePDCScreenWithNoPDCExists() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkConvertedMaturePDCScreenWithNoPDCExists(), true);	
	}
	
	

	@Test(priority=213)
	public void checkSavingVoucherToPostDatedReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherToPostDatedReceipts(), true);	
	}
	
	
	@Test(priority=214)
	public void checkSavingVoucherToPostDatedReceiptsWithNewRefrence() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherToPostDatedReceiptsWithNewRefrence(), true);	
	}
	
	
	@Test(priority=215)
	public void checkSavedVouchersInPDCVoucherScreenWithOutPostOnDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavedVouchersInPDCVoucherScreenWithOutPostOnDate(), true);	
	}
	
	
	@Test(priority=216)
	public void checkConvertingVouchersInPDCVoucherScreenWithOutPostOnDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkConvertingVouchersInPDCVoucherScreenWithOutPostOnDate(), true);	
	}
	
	@Test(priority=217)
	public void checkConvertedPDCVoucherInReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkConvertedPDCVoucherInReceipts(), true);	
	}
	
	@Test(priority=218)
	public void checkSavingVoucherInPDRWithFutureMaturityDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInPDRWithFutureMaturityDate(), true);	
	}
	
	
	@Test(priority=219)
	public void checkConvertingPDRVoucherWithFutureMaturityDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkConvertingPDRVoucherWithFutureMaturityDate(), true);	
	}
	
	
	@Test(priority=220)
	public void checkConvertedPDCVoucherInReceiptsWithFutureMaturityDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkConvertedPDCVoucherInReceiptsWithFutureMaturityDate(), true);	
	}
	
	
	
	//reverse Posting In PDR 
	
	@Test(priority=221)
	public void checkUpdateinPDCUnderSettingMenuForEnableReversePostingInRecepits() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkUpdateinPDCUnderSettingMenuForEnableReversePostingInRecepits(), true);	
	}
	

	@Test(priority=222)
	public void checkSavingVoucherInPostDatedReceiptsWithCashANdBankAccountHDFC() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInPostDatedReceiptsWithCashANdBankAccountHDFC(), true);	
	}
	

	
	@Test(priority=223)
	public void checkReversingPoistingInPDCWithPDRVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkReversingPoistingInPDCWithPDRVoucher(), true);	
	}
	
	
	@Test(priority=224)
	public void checkConvertedPDCVoucherInReceiptsReversePosting() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkConvertedPDCVoucherInReceiptsReversePosting(), true);	
	}
	
	
	
	
	//PDP VAT 
	

	@Test(priority=231)
	public void checkUpdateinPDCUnderSettingMenuForDisableEnableReversePostingInRecepits() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkUpdateinPDCUnderSettingMenuForDisableEnableReversePostingInRecepits(), true);	
	}
	
	
	@Test(priority=232)
	public void checkSavingVoucherINPDPVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherINPDPVAT(), true);	
	}
	
	@Test(priority=233)
	public void checkSavedVouchersInPDPVoucherScreenWithOutPostOnDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavedVouchersInPDPVoucherScreenWithOutPostOnDate(), true);	
	}
	
	@Test(priority=234)
	public void checkAddExtraFieldPDCInHeaderFieldOFPayments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkAddExtraFieldPDCInHeaderFieldOFPayments(), true);	
	}
	
	
	@Test(priority=235)
	public void checkCovertingVoucherInPDCAfetrCreatingExtraFieldInPayments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkCovertingVoucherInPDCAfetrCreatingExtraField(), true);	
	}
	
	@Test(priority=236)
	public void checkConvertedVoucherINPayments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkConvertedVoucherINPayments(), true);	
	}
	
	
	
	@Test(priority=237)
	public void checkSavingVoucherInPDPVatWithHDFCAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSavingVoucherInPDPVatWithHDFCAccount(), true);	
	}
	
	
	@Test(priority=238)
	public void checkReversingPositingInPDCWithPDPVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkReversingPositingInPDCWithPDPVoucher(), true);	
	}
	
	
	@Test(priority=239)
	public void checkPostedVoucherInPaymentsWithReversePosting() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPostedVoucherInPaymentsWithReversePosting(), true);	
	}
	
	
	
	
	//reports
	
	
	@Test(priority=1150)
	public void checkFinanacialLedgerReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkFinanacialLedgerReport(), true);	
	}
	
	@Test(priority=1151)
	public void checkLedgerDetailsreport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkLedgerDetailsreport(), true);	
	}
	
	@Test(priority=1152)
	public void checkVatPurchaseAccountReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVatPurchaseAccountReport(), true);	
	}
	
	@Test(priority=1153)
	public void checkSalesAccountReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSalesAccountReport(), true);	
	}
	
	
	@Test(priority=1154)
	public void checkSalesByCustomerReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkSalesByCustomerReport(), true);	
	}
	
	@Test(priority=1155)
	public void checkBankBookReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkBankBookReport(), true);	
	}
	
	@Test(priority=1156)
	public void checkDayBookReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkDayBookReport(), true);	
	}
	
	@Test(priority=1157)
	public void checkVirtualBankLedgerReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVirtualBankLedgerReport(), true);	
	}
	
	
	@Test(priority=1158)
	public void checkBankReconciliationReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkBankReconciliationReport(), true);	
	}
	
	@Test(priority=1159)
	public void checkCustomerVendorReconciliationReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkCustomerVendorReconciliationReport(), true);	
	}
	
	@Test(priority=1160)
	public void checkBankReconciliationStatementReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkBankReconciliationStatementReport(), true);	
	}
	
	
	@Test(priority=1161)
	public void checkBankReconciliationStatementReportWithOutPDC() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkBankReconciliationStatementReportWithOutPDC(), true);	
	}
	
	@Test(priority=1162)
	public void checkChequeDiscountingReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkChequeDiscountingReport(), true);	
	}
	
	
	
	@Test(priority=1170)
	public void checkOpeningBalanceRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkOpeningBalanceRegisterReport(), true);	
	}
	
	@Test(priority=1171)
	public void checkJournalEntriesRegisterOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkJournalEntriesRegisterOptions(), true);	
	}
	
	@Test(priority=1172)
	public void checkCreditNoteRegisterOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkCreditNoteRegisterOptions(), true);	
	}
	
	@Test(priority=1173)
	public void checkDebitNoteRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkDebitNoteRegisterReport(), true);	
	}
	
	
	@Test(priority=1174)
	public void checkReceiptRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkReceiptRegisterReport(), true);	
	}
	
	
	@Test(priority=1175)
	public void checkPaymentRegisterOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPaymentRegisterOptions(), true);	
	}
	
	@Test(priority=1176)
	public void checkPdcReceiptsRegisterReportWithConsolidatedAmountsOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPdcReceiptsRegisterReportWithConsolidatedAmountsOptions(), true);	
	}
	
	
	@Test(priority=1177)
	public void checkPdcReceiptsRegisterReportWithOutConsolidatedAmountsOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPdcReceiptsRegisterReportWithOutConsolidatedAmountsOptions(), true);	
	}
	
	
	@Test(priority=1178)
	public void checkPdcPaymentsRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkPdcPaymentsRegisterReport(), true);	
	}
	
	
	
	@Test(priority=1179)//
	public void checkEntryJournalRegisterReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkEntryJournalRegisterReport(), true);	
	}
	
	
	

	@Test(priority=1180)// On Click on Last Page in report Grand Total Dislay as Empty 
	public void checkEntryJournalDetailReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkEntryJournalDetailReport(), true);	
	}
	
	
	
	
	
	
	
	@Test(priority=1175)
	public void checkTrailBalanceReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkTrailBalanceReport(), true);	
	}
	
	
	@Test(priority=1176)
	public void checkProfitAndLossReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkProfitAndLossReport(), true);	
	}
	
	
	@Test(priority=1177)// Display in (Values )
	public void checkTradingAccountOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkTradingAccountOptions(), true);	
	}
	
	
	@Test(priority=1178)//
	public void checkTradingAndProfitAndLossReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkTradingAndProfitAndLossReport(), true);	
	}
	
	
	
	@Test(priority=1179)
	public void checkBalanceSheetOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkBalanceSheetOptions(), true);	
	}
	
	
	@Test(priority=1180)
	public void checkFinalAccountsSchedulesReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkFinalAccountsSchedulesReport(), true);	
	}
	
	
	@Test(priority=1181)
	public void checkFundFlowReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkFundFlowReport(), true);	
	}
	
	
	
	
	// Recevible Accounts 
	
	@Test(priority=1190)
	public void checkCustomerListingOfOutstandingBillsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkCustomerListingOfOutstandingBillsReport(), true);	
	}
	
	@Test(priority=1191)
	public void checkCustomerStatementReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkCustomerStatementReport(), true);	
	}
	
	
	@Test(priority=1192)
	public void checkCustomerDueDateAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkCustomerDueDateAnalysisReport(), true);	
	}
	
	
	@Test(priority=1193)
	public void checkCustomerAgeingDetailsAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkCustomerAgeingDetailsAnalysisReport(), true);	
	}
	
	
	@Test(priority=1194)
	public void checkCustomerAgeingDetailsByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkCustomerAgeingDetailsByDueDateReport(), true);	
	}
	
	@Test(priority=1195)
	public void checkCustomerOverDueAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkCustomerOverDueAnalysisReport(), true);	
	}
	
	@Test(priority=1196)
	public void checkcustomerSummaryCustomerAgeingSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkcustomerSummaryCustomerAgeingSummaryReport(), true);	
	}
	
	@Test(priority=1197)
	public void checkcustomerSummaryAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkcustomerSummaryAgeingByDueDateReport(), true);	
	}
	
	
	@Test(priority=1198)
	public void checkcustomerSummaryCustomerOverDueSummeryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkcustomerSummaryCustomerOverDueSummeryReport(), true);	
	}
	
	
	@Test(priority=1199)
	public void checkcustomerSummaryCustomerBillWiseSummeryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkcustomerSummaryCustomerBillWiseSummeryReport(), true);	
	}
	
	
	@Test(priority=1200)
	public void checkVendorListingOfOutstandingBillsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVendorListingOfOutstandingBillsReport(), true);	
	}
	
	@Test(priority=1201)
	public void checkvendorDetailsVendorStatementsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkvendorDetailsVendorStatementsReport(), true);	
	}
	

	@Test(priority=1202)
	public void checkvendorDetailsVendorDueDateAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkvendorDetailsVendorDueDateAnalysisReport(), true);	
	}
	
	@Test(priority=1203)
	public void checkVendorDetailsVendorAgeingDetailsReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVendorDetailsVendorAgeingDetailsReport(), true);	
	}
	
	
	@Test(priority=1204)
	public void checkVendorDetailsVendorDetailsAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVendorDetailsVendorDetailsAgeingByDueDateReport(), true);	
	}
	
	
	@Test(priority=1205)
	public void checkVendorDetailsVendorOverdueAnalysisReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, ParseException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVendorDetailsVendorOverdueAnalysisReport(), true);	
	}
	
	@Test(priority=1206)
	public void checkVendorSummeryVendorAgeingSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVendorSummeryVendorAgeingSummaryReport(), true);	
	}
	
	
	@Test(priority=1207)
	public void checkVendorSummeryVendorSummaryAgeingByDueDateReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVendorSummeryVendorSummaryAgeingByDueDateReport(), true);	
	}
	
	
	@Test(priority=1208)
	public void checkVendorSummeryVendorOverdueSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVendorSummeryVendorOverdueSummaryReport(), true);	
	}
	
	
	@Test(priority=1209)
	public void checkVendorSummeryVendorBillWiseSummaryReport() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		bp=new BillWisePage(getDriver());
		Assert.assertEquals(bp.checkVendorSummeryVendorBillWiseSummaryReport(), true);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
