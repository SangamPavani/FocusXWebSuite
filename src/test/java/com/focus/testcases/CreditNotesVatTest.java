package com.focus.testcases;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.CreditNotesVATPage;
import com.focus.base.BaseEngine;

public class CreditNotesVatTest extends BaseEngine
{

	static CreditNotesVATPage cnvp;

	//Credit Note VAT
	
	
	@Test(priority=700299)
	public  static void checkLoginToFinancialVouchers() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkLoginToFinancialVouchers(),true);
	}
	
	
	
	@Test(priority=700300)
	public  static void checkNavigationToCreditNotesNotesVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkNavigationToCreditNotesNotesVAT(),true);
	}
	
	@Test(priority=700301)
	public  static void checkcreditNotesVATVoucherHomeScreenOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkcreditNotesVATVoucherHomeScreenOptions(),true);
	}
	
	@Test(priority=700302)
	public  static void checkcreditNotesNewHomePageNewOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkcreditNotesNewHomePageNewOption(),true);
	}

	@Test(priority=700303)
	public  static void checkCreditnotesNewEntryPageRibbonControl() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkCreditnotesNewEntryPageRibbonControl(),true);
	}
	
	@Test(priority=700304)
	public  static void checkOptionsUndertoggleBtnInCreditNotesVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkOptionsUndertoggleBtnInCreditNotesVAT(),true);
	}
	
	@Test(priority=700305)
	public  static void checkCustomizationOptionInCreditNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkCustomizationOptionInCreditNotes(),true);
	}
	
	@Test(priority=700306)
	public  static void checkCreditNotesEntryPageHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkCreditNotesEntryPageHeaderFields(),true);
	}
	
	@Test(priority=700307)
	public  static void checkCreditNotesEntryPageBodyFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkCreditNotesEntryPageBodyFields(),true);
	}
	

	@Test(priority=700308)
	public  static void checkCreditNotesEntryPageFooterFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkCreditNotesEntryPageFooterFields(),true);
	}
	
	
	@Test(priority=700309)
	public  static void checkCreditNotesNewDateFieldLessThanCompanyAccountingDate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkCreditNotesNewDateFieldLessThanCompanyAccountingDate(),true);
	}
	
	@Test(priority=700310)
	public  static void checkCreditNotesNewDateFieldMoreThanCompanyAccountingDate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkCreditNotesNewDateFieldMoreThanCompanyAccountingDate(),true);
	}
	
	
	@Test(priority=700311)
	public  static void checkSavingVoucherWithoutAnyMandatoryInputsInCreditNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkSavingVoucherWithoutAnyMandatoryInputsInCreditNotes(),true);
	}
	
	@Test(priority=700312)
	public  static void checkNewOptioninEntryPageinCreditnotesVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkNewOptioninEntryPageinCreditnotesVAT(),true);
	}
	
	@Test(priority=700313)
	public  static void checkSavingVoucherWithInputAccountIncreditNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkSavingVoucherWithInputAccountIncreditNotes(),true);
	}
	
	@Test(priority=700314)
	public  static void checkInputCustmerAccountAndVendorAccountSameInCreditNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkInputCustmerAccountAndVendorAccountSameInCreditNotes(),true);
	}
	
	
	@Test(priority=700315)
	public  static void checkSavingVoucherWithoutAmountInVoucherBodyinCreditNotesVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkSavingVoucherWithoutAmountInVoucherBodyinCreditNotesVAT(),true);
	}
	
	@Test(priority=700316)
	public  static void checkInputCustmerAccountAndVendorAccountSamePartyInCreditNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkInputCustmerAccountAndVendorAccountSamePartyInCreditNotes(),true);
	}
	
	@Test(priority=700317)
	public  static void checkSavingVoucherWithVendorInCreditNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkSavingVoucherWithVendorInCreditNotes(),true);
	}
	

	@Test(priority=700318)
	public  static void checkSavingVoucherthroughCopyToClipboard() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkSavingVoucherthroughCopyToClipboard(),true);
	}
	
	@Test(priority=700319)
	public  static void checkSuspendingVoucherInCreditNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkSuspendingVoucherInCreditNotes(),true);
	}
	
	@Test(priority=700320)
	public  static void checkCopyDocumentAndSavingInCreditNoteVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkCopyDocumentAndSavingInCreditNoteVAT(),true);
	}
	
	@Test(priority=700321)
	public  static void checkDeleteOptionInCreditNoteVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkDeleteOptionInCreditNoteVAT(),true);
	}
	
	@Test(priority=700322)
	public  static void checkSignOutCreditNoteVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		cnvp=new CreditNotesVATPage(getDriver());
		Assert.assertEquals(cnvp.checkSignOutCreditNoteVoucher(),true);
	}
	
	
	
	
	
	
}
