package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.focus.Pages.PaymentsVoucherPage;
import com.focus.base.BaseEngine;

public class PaymentsVoucherTest extends BaseEngine
{

	static PaymentsVoucherPage pvp ;
	
	@Test(priority=2401)
	public void checkLoginToFinancialVouchers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkLoginToFinancialVouchers(), true);	
	}
	 
	//Starting of Payments 
	
	@Test(priority=700100)
	public  static void checkFinancialsMenu() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkFinancialsMenu(),true);
	}
	
	@Test(priority=700101)
	public  static void checkTransactionsMenuInFinanceMenu() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkTransactionsMenuInFinanceMenu(),true);
	}
	
	@Test(priority=700102)
	public  static void checkNavigationToPaymentVATVocher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkNavigationToPaymentVATVocher(),true);
	}
	
	@Test(priority=700103)
	public  static void checkPaymentsVoucherHomeScreenOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsVoucherHomeScreenOptions(),true);
	}
	
	@Test(priority=700104)
	public  static void checkPendingBillsInPaymentVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPendingBillsInPaymentVoucher(),true);
	}

	@Test(priority=700105)
	public  static void checkPaymentsNewHomePageNewOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsNewHomePageNewOption(),true);
	}
	
	@Test(priority=700106)
	public  static void checkPaymentsNewEntryPageRibbonControl() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsNewEntryPageRibbonControl(),true);
	}
	
	@Test(priority=700107)
	public  static void checkOptionsUndertoggleBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkOptionsUndertoggleBtn(),true);
	}
	
	
	@Test(priority=700108)
	public  static void checkCustomizationOptionInPayments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkCustomizationOptionInPayments(),true);
	}
	
	@Test(priority=700109)
	public  static void checkPaymentsNewEntryPageHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsNewEntryPageHeaderFields(),true);
	}
	
	@Test(priority=700110)
	public  static void checkPaymentsEntryPageBodyFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsEntryPageBodyFields(),true);
	}
	
	@Test(priority=700111)
	public  static void checkPaymentsEntryPageFooterFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsEntryPageFooterFields(),true);
	}
	
	@Test(priority=700112)
	public  static void checkPaymentsEntryPageDocumentNumber() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsEntryPageDocumentNumber(),true);
	}
	
	//@Test(priority=700113)
	public  static void checkPaymentsVoucherNewEntryPageInfoSideBarCustomizeBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsVoucherNewEntryPageInfoSideBarCustomizeBtn(),true);
	}
	
	//@Test(priority=700114)
	public  static void checkPayemtsVoucherEntryPageInfoSideBarGraphOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPayemtsVoucherEntryPageInfoSideBarGraphOption(),true);
	}
	
	//@Test(priority=700115)
	public  static void checkPaymentsVoucherEntryPageInfoSideBarReportOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsVoucherEntryPageInfoSideBarReportOption(),true);
	}
	
	//@Test(priority=700116)
	public  static void checkPaymentsVoucherNewEntryPageInfoSideBarInfoPanelOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsVoucherNewEntryPageInfoSideBarInfoPanelOption(),true);
	}
	
	//@Test(priority=700117)
	public  static void checkPaymentVoucherNewEntryPageInfoSideBarWorkFlowOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentVoucherNewEntryPageInfoSideBarWorkFlowOption(),true);
	}
	
	//@Test(priority=700118)
	public  static void checkPaymentVoucherNewEntryPageInfoSideBarOtherDashletsOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentVoucherNewEntryPageInfoSideBarOtherDashletsOption(),true);
	}
	
	//@Test(priority=700119)
	public  static void checkPaymentVoucherNewEntryPageInfoSideBarSearch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentVoucherNewEntryPageInfoSideBarSearch(),true);
	}
	
	//@Test(priority=700120)
	public  static void checkPaymentsVoucherNewInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsVoucherNewInfoPanelDashlet(),true);
	}
	
	//@Test(priority=700121)
	public  static void checkPaymentsVoucherNewSaveInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsVoucherNewSaveInfoPanelDashlet(),true);
	}
	
	@Test(priority=700122)
	public  static void checkPaymentsNewDateFieldLessThanCompanyAccountingDate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsNewDateFieldLessThanCompanyAccountingDate(),true);
	}
	
	
	@Test(priority=700123)
	public  static void checkPaymentsSaveWithoutMandatoryFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsSaveWithoutMandatoryFields(),true);
	}
	
	@Test(priority=700124)
	public  static void checkPaymentCashAndBankOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentCashAndBankOptions(),true);
	}
	
	@Test(priority=700125)
	public  static void checkCustomizeOptionOfDepartment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkCustomizeOptionOfDepartment(),true);
	}

	@Test(priority=700126)
	public  static void checkStandardFieldOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkStandardFieldOptions(),true);
	}
	
	@Test(priority=700127)
	public  static void checkSelectingsCodeFromFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkSelectingsCodeFromFields(),true);
	}
	
	@Test(priority=700128)
	public  static void checkDeletingColumninCustomizeOptionintheHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkDeletingColumninCustomizeOptionintheHeaderFields(),true);
	}
	
	@Test(priority=700129)
	public  static void checkCancelInCustomizeOptionintheHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkCancelInCustomizeOptionintheHeaderFields(),true);
	}
	
	
	@Test(priority=700130)
	public  static void checkCurrencyOptioninPayments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkCurrencyOptioninPayments(),true);
	}
	
	@Test(priority=700131)
	public  static void checkPaymentsVoucherVATDepartment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsVoucherVATDepartment(),true);
	}
	
	@Test(priority=700132)
	public  static void checkPaymentsWithCurrencyINRInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsWithCurrencyINRInputAndExcgRate(),true);
	}
	
	
	@Test(priority=700133)
	public  static void checkPaymentsWithCurrencyUSDInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsWithCurrencyUSDInputAndExcgRate(),true);
	}
	
	@Test(priority=700134)
	public  static void checkPaymentsWithCurrencyAEDInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsWithCurrencyAEDInputAndExcgRate(),true);
	}
	
	
	@Test(priority=700135)
	public  static void checkPaymentVoucherSaveWithHeaderFieldsInput() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentVoucherSaveWithHeaderFieldsInput(),true);
	}
	
	@Test(priority=700136)
	public  static void checkDueDateOptioninPaymentsEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkDueDateOptioninPaymentsEntryPage(),true);
	}
	
	

	@Test(priority=700137)
	public  static void checkNewOptioninEntryPageinPayments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkNewOptioninEntryPageinPayments(),true);
	}


	@Test(priority=700138)
	public  static void checkEnteringDataIntoBodyGrid() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkEnteringDataIntoBodyGrid(),true);
	}
	
	@Test(priority=700139)
	public  static void checkBillwiseScreeninPaymentsWithAdjustAmountForVendorA() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkBillwiseScreeninPaymentsWithAdjustAmountForVendorA(),true);
	}
	
	@Test(priority=700140)
	public  static void checkClickOnSecondEntryInBillwiseScreenForVendorB() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkClickOnSecondEntryInBillwiseScreenForVendorB(),true);
	}

	@Test(priority=700141)
	public  static void checkPaymentVoucherCopyDocumentOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentVoucherCopyDocumentOption(),true);
	}
	
	@Test(priority=700142)
	public  static void checkCopyDocumentPopOptionsinPaymentVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkCopyDocumentPopOptionsinPaymentVoucher(),true);
	}
	
	@Test(priority=700143)
	public  static void checkRowDeleteFromEntryPageInPayment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkRowDeleteFromEntryPageInPayment(),true);
	}
	
	@Test(priority=700144)
	public  static void chekSavingVoucherAfterRowDeletionAndCopyDocumentInPayment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.chekSavingVoucherAfterRowDeletionAndCopyDocumentInPayment(),true);
	}
	
	@Test(priority=700145)
	public  static void checkSuspendedOptioninPaymentsthroughClickOnPreviousButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkSuspendedOptioninPaymentsthroughClickOnPreviousButton(),true);
	}
	
	@Test(priority=700146)
	public  static void checkCopyToClipboardOptioninPayments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkCopyToClipboardOptioninPayments(),true);
	}
	
	@Test(priority=700147)
	public  static void chekDeleteOPtionInPayments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.chekDeleteOPtionInPayments(),true);
	}
	
	
	@Test(priority=700148)
	public  static void checkPaymentsWithAdjustAmountForCustomerB() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsWithAdjustAmountForCustomerB(),true);
	}
	
	
	
	@Test(priority=700149)
	public  static void checkSavedVoucherinPaymentsScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkSavedVoucherinPaymentsScreen(),true);
	}
	
	
	
	@Test(priority=700150) 
	public  static void checkPaymentsWithVendorinAdjustments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		pvp=new PaymentsVoucherPage(getDriver());
		Assert.assertEquals(pvp.checkPaymentsWithVendorinAdjustments(),true);
	}
	
	/////////////////////Complete Of Smoke Payments////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
		
		
}
