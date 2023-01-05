package com.focus.testcases;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.pdcVoucherPage;
import com.focus.base.BaseEngine;

public class pdcVoucherTest extends BaseEngine
{

	static pdcVoucherPage pdcvp;
	
	
	  @Test(priority=700399)
	  public void checkLoginToFinancialVouchers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkLoginToFinancialVouchers(),true);
	  }
	
	
	
	 @Test(priority=700400)
	  public void checkNavigationToConvertMaturedPDC() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkNavigationToConvertMaturedPDC(),true);
	  }
	  
	  
	  @Test(priority=700401)
	  public void checkConvertMaturedPDCHomePageHeaderOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkConvertMaturedPDCHomePageHeaderOptions(),true);
	  }
	
	  
	  @Test(priority=700402)
	  public void checkokButtonWithoutSelectingRowINGridOFConvertMaturedPDCScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkokButtonWithoutSelectingRowINGridOFConvertMaturedPDCScreen(),true);
	  }
	  
	  @Test(priority=700403)
	  public void checkPDCVoucherScreenBodyOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPDCVoucherScreenBodyOptions(),true);
	  }
	 
	  
	  @Test(priority=700404)
	  public void checkNavigationToPostDatedReceipts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkNavigationToPostDatedReceipts(),true);
	  }
	  
	  @Test(priority=700405)
	  public void checkpostDatedRecepitsNewHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkpostDatedRecepitsNewHomePage(),true);
	  }
	  
	  @Test(priority=700406)
	  public void checkpostDatedRecepitsNewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkpostDatedRecepitsNewOption(),true);
	  }
	  
	  
	  @Test(priority=700407)
	  public void checkpostDatedRecepitsNewEntryPageRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkpostDatedRecepitsNewEntryPageRibbonControl(),true);
	  }
	  
	  @Test(priority=700408)
	  public void checkpostDatedRecepitsCustomizationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkpostDatedRecepitsCustomizationOption(),true);
	  }
	  
	  @Test(priority=700409)  
	  public void checkPostDatedReceiptsNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPostDatedReceiptsNewEntryPageHeaderFields(),true);
	  }
	  
	  @Test(priority=700410)
	  public void checkPostDatedReceiptsNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPostDatedReceiptsNewEntryPageBodyFields(),true);
	  }
	  
	  @Test(priority=700411)
	  public void checkPostDatedReceiptsNewEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPostDatedReceiptsNewEntryPageFooterFields(),true);
	  }
	  
	 @Test(priority=700412)
	  public void checkSavingNewVoucherInPDRVATOnCurrentDateWithCurrencyINR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavingNewVoucherInPDRVATOnCurrentDateWithCurrencyINR(),true);
	  }
	  
	  @Test(priority=700413)
	  public void checkSavingNewVoucherInPDRVATOnFutureDateWithCurrencyINRAndDepartmentDUBAI() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavingNewVoucherInPDRVATOnFutureDateWithCurrencyINRAndDepartmentDUBAI(),true);
	  }
	 
	  @Test(priority=700414)
	  public void checkSavedVoucherInPDRVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavedVoucherInPDRVAT(),true);
	  }
	
	  @Test(priority=700415)
	  public void checkEditingVoucherAndSavingInPDRVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkEditingVoucherAndSavingInPDRVAT(),true);
	  }
	
	  @Test(priority=700416)
	  public void checkSavedVouchersInPDCVoucherScreenWithOutPostOnDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavedVouchersInPDCVoucherScreenWithOutPostOnDate(),true);
	  }
	  
	  @Test(priority=700417)
	  public void checkConvertingVouchersInPDCVoucherScreenWithOutPostOnDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkConvertingVouchersInPDCVoucherScreenWithOutPostOnDate(),true);
	  }
	
	  @Test(priority=700418)
	  public void checkAddExtraFieldPDCInHeaderFieldOFReceipts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkAddExtraFieldPDCInHeaderFieldOFReceipts(),true);
	  }
	    
	  @Test(priority=700419)
	  public void checkFilterOptionInPDCVoucherScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkFilterOptionInPDCVoucherScreen(),true);
	  }
	  
	  
	  @Test(priority=700420)
	  public void checkOkButtonInCovertedInPDCVouchersWithOutSelectingVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkOkButtonInCovertedInPDCVouchersWithOutSelectingVoucher(),true);
	  }
	  
	  @Test(priority=700421)
	  public void checkMaturityDateIsGreaterThanPostonDateForSelectedVouchers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkOkButtonInCovertedInPDCVouchersWithOutSelectingVoucher(),true);
	  }
	  
	  @Test(priority=700422)
	  public void checkConvertingVoucherInPDCScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkConvertingVoucherInPDCScreen(),true);
	  }
	  
	  
	  @Test(priority=700423)
	  public void checkPDCVouchersScreenAfterConvertingVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPDCVouchersScreenAfterConvertingVoucher(),true);
	  }
	 
	  @Test(priority=700424)
	  public void checkConvertedPDCVoucherInReceipts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkConvertedPDCVoucherInReceipts(),true);
	  }
	  
	  @Test(priority=700425)
	  public void checkDeleteOfConvertedVoucherinRecepits() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkDeleteOfConvertedVoucherinRecepits(),true);
	  }
	   
	  @Test(priority=700426)
	  public void checkClickOnConvertedPDCVouchersAfterDeletionOfConvertedVoucherInRecepits() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkClickOnConvertedPDCVouchersAfterDeletionOfConvertedVoucherInRecepits(),true);
	  }
	  
	  @Test(priority=700427)
	  public void checkUpdateinPDCUnderSettingMenuForEnableReversePostingInRecepits() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkUpdateinPDCUnderSettingMenuForEnableReversePostingInRecepits(),true);
	  }
	  
	
	  
	  @Test(priority=700428)
	  public void checkCreationOfNewCashAndBankAccountType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkCreationOfNewCashAndBankAccountType(),true);
	  }
	  
	  @Test(priority=700429)
	  public void checkSavingVoucherInPostDatedReceiptsWithCustomerB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavingVoucherInPostDatedReceiptsWithCustomerB(),true);
	  }
	  
	  
	  @Test(priority=700430)
	  public void checkSavingVoucherInPostDatedReceiptsWithCustomerC() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavingVoucherInPostDatedReceiptsWithCustomerC(),true);
	  }
	  
	  @Test(priority=700431)
	  public void checkChangeInAsOnDateOPtionAndPDPVoucherFilterDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkChangeInAsOnDateOPtionAndPDPVoucherFilterDate(),true);
	  }
	  
	  @Test(priority=700432)
	  public void checkFilterOptionWithStartDateInPDCWtihPDR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkFilterOptionWithStartDateInPDCWtihPDR(),true);
	  }
	  
	  @Test(priority=700433)
	  public void checkFilterOptionWithChequeNumberPVRV4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkFilterOptionWithChequeNumberPVRV4(),true);
	  }
	  
	  
	  @Test(priority=700434)
	  public void checkConditionAndCompareFiledsSameInPDCWithPDR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkConditionAndCompareFiledsSameInPDCWithPDR(),true);
	  }
	  
	  @Test(priority=700435)
	  public void checkCovertingVoucherInPDCWithReversePosting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkCovertingVoucherInPDCWithReversePosting(),true);
	  }
	  
	  @Test(priority=700436)
	  public void checkSavedCovertedVoucherInReceiptsAfterReversePosting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavedCovertedVoucherInReceiptsAfterReversePosting(),true);
	  }
	 
	  @Test(priority=700437)
	  public void checkUpdateinPDCUnderSettingMenuForDisableEnableReversePostingInRecepits() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkUpdateinPDCUnderSettingMenuForDisableEnableReversePostingInRecepits(),true);
	  }
	   
	  
	
	
	//PDP VAT
	  
	  @Test(priority=700500)
	  public void checkNavigationToConvertMaturedPDCForPDPVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkNavigationToConvertMaturedPDCForPDPVAT(),true);
	  }
	 
	  
	  @Test(priority=700501)
	  public void checkConvertMaturedPDCHomePageHeaderOptionsWithPDPVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkConvertMaturedPDCHomePageHeaderOptionsWithPDPVAT(),true);
	  }
	
	  
	  @Test(priority=700502)
	  public void checkokButtonWithoutSelectingRowINGridOFConvertMaturedPDCScreenWithoutSelction() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkokButtonWithoutSelectingRowINGridOFConvertMaturedPDCScreenWithoutSelction(),true);
	  }
	  
	  @Test(priority=700503)
	  public void checkPDPVoucherScreenBodyOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPDPVoucherScreenBodyOptions(),true);
	  }
	 
	 
	  @Test(priority=700504)
	  public void checkNavigationToPostDatedPaymentsVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkNavigationToPostDatedPaymentsVAT(),true);
	  }
	  
	  @Test(priority=700505)
	  public void checkpostDatedPaymentsNewHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkpostDatedPaymentsNewHomePage(),true);
	  }
	  
	  @Test(priority=700506)
	  public void checkpostDatedPaymentsVATNewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkpostDatedPaymentsVATNewOption(),true);
	  }
	  
	  
	  @Test(priority=700507)
	  public void checkpostDatedPaymenstNewEntryPageRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkpostDatedPaymenstNewEntryPageRibbonControl(),true);
	  }
	  
	  @Test(priority=700508)
	  public void checkpostDatedPaymentsVATCustomizationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkpostDatedPaymentsVATCustomizationOption(),true);
	  }
	  
	  @Test(priority=700509)
	  public void checkPostDatedPaymentsVATNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPostDatedPaymentsVATNewEntryPageHeaderFields(),true);
	  }
	  
	  @Test(priority=700510)
	  public void checkPostDatedPaymenstVATEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPostDatedPaymenstVATEntryPageBodyFields(),true);
	  }
	  
	  @Test(priority=700511)
	  public void checkPostDatedPaymenstVATEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPostDatedPaymenstVATEntryPageFooterFields(),true);
	  }
	 
	  @Test(priority=700512)
	  public void checkSavingNewVoucherInPDPVATOnCurrentDateWithCurrencyINR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavingNewVoucherInPDPVATOnCurrentDateWithCurrencyINR(),true);
	  }
	  
	  @Test(priority=700513)
	  public void checkSavingNewVoucherInPDPVATOnFutureDateWithCurrencyAEDAndDepartmentDUBAI() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavingNewVoucherInPDPVATOnFutureDateWithCurrencyAEDAndDepartmentDUBAI(),true);
	  }
	
	  
	  @Test(priority=700514)
	  public void checkSavedVoucherInPDPVATWithAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavedVoucherInPDPVATWithAED(),true);
	  }
	  
	  
	   
	  @Test(priority=700515)
	  public void checkSavedVouchersInPDPVoucherScreenWithOutPostOnDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavedVouchersInPDPVoucherScreenWithOutPostOnDate(),true);
	  }
	  
	  @Test(priority=700516)
	  public void checkConvertingVouchersPDPInPDCVoucherScreenWithOutPostOnDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkConvertingVouchersPDPInPDCVoucherScreenWithOutPostOnDate(),true);
	  }
	  
	  @Test(priority=700517)
	  public void checkAddExtraFieldPDCInHeaderFieldOFPayments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkAddExtraFieldPDCInHeaderFieldOFPayments(),true);
	  }
	  
	  @Test(priority=700518)
	  public void checkFilterOptionInPDCVoucherScreenWithPDPVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkFilterOptionInPDCVoucherScreenWithPDPVoucher(),true);
	  }
	  
	  @Test(priority=700519)
	  public void checkOkButtonInCovertedInPDCVouchersWithOutSelectingPDPVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkOkButtonInCovertedInPDCVouchersWithOutSelectingPDPVoucher(),true);
	  }
	  
	  @Test(priority=700520)
	  public void checkMaturityDateIsGreaterThanPostonDateForSelectedPDPVouchers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkMaturityDateIsGreaterThanPostonDateForSelectedPDPVouchers(),true);
	  }
	 
	  
	  @Test(priority=700521)
	  public void checkConvertingPDPVoucherInPDCScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkConvertingPDPVoucherInPDCScreen(),true);
	  }
	  
	  @Test(priority=700522)
	  public void checkPDCVouchersScreenAfterConvertingPDPVATVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkPDCVouchersScreenAfterConvertingPDPVATVoucher(),true);
	  }
	   
	  
	  @Test(priority=700523) //
	  public void checkConvertedPDCVoucherInPayments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkConvertedPDCVoucherInPayments(),true);
	  }
	  
	  
	  @Test(priority=700524)
	  public void checkUpdateinPDCUnderSettingMenuForEnableReversePostingInPayments() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkUpdateinPDCUnderSettingMenuForEnableReversePostingInPayments(),true);
	  }
	  
	  @Test(priority=700525)
	  public void checkSavingVoucherInPostDatedPaymentsWithVendorB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavingVoucherInPostDatedPaymentsWithVendorB(),true);
	  }
	
	
	  @Test(priority=700526)
	  public void checkChangeInAsOnDateOPtionInPDCVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkChangeInAsOnDateOPtionInPDCVoucher(),true);
	  }
	  
	   
	  @Test(priority=700527)
	  public void checkFilterOptionWithStartDateInPDCWtihPDPVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkFilterOptionWithStartDateInPDCWtihPDPVAT(),true);
	  }
	  
	  
	  @Test(priority=700528)
	  public void checkCovertingPDPVoucherInPDCWithReversePosting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkCovertingPDPVoucherInPDCWithReversePosting(),true);
	  }
	   
	  
	  @Test(priority=700529)
	  public void checkSavedCovertedVoucherInPaymentsAfterReversePosting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pdcvp=new pdcVoucherPage(getDriver());
		  Assert.assertEquals(pdcvp.checkSavedCovertedVoucherInPaymentsAfterReversePosting(),true);
	  }
	  
	
	
	
	
}
