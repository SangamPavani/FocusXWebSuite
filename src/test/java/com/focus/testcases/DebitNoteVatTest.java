package com.focus.testcases;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.DebitNotesVatPage;
import com.focus.base.BaseEngine;

public class DebitNoteVatTest extends BaseEngine
{

	static DebitNotesVatPage dnvp;
	
	//Debit Notes 
	
	
	
	@Test(priority=700199)
	public  static void checkLoginToFinancialVouchers() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dnvp=new DebitNotesVatPage(getDriver());
		Assert.assertEquals(dnvp.checkLoginToFinancialVouchers(),true);
	}
	
	
		@Test(priority=700200)
		public  static void checkNavigationToDebitNotesVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkNavigationToDebitNotesVAT(),true);
		}
		
		@Test(priority=700201)
		public  static void checkDebitNotesVATVoucherHomeScreenOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkDebitNotesVATVoucherHomeScreenOptions(),true);
		}
		
		@Test(priority=700202)
		public  static void checkDebitNotesNewHomePageNewOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkDebitNotesNewHomePageNewOption(),true);
		}

	    @Test(priority=700203)
		public  static void checkDebitnotesNewEntryPageRibbonControl() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkDebitnotesNewEntryPageRibbonControl(),true);
		}
		
		@Test(priority=700204)
		public  static void checkOptionsUndertoggleBtnInDebitNotesVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkOptionsUndertoggleBtnInDebitNotesVAT(),true);
		}
		
		@Test(priority=700205)
		public  static void checkCustomizationOptionInDebitNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkCustomizationOptionInDebitNotes(),true);
		}
		
		@Test(priority=700206)
		public  static void checkDebitNotesEntryPageHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkDebitNotesEntryPageHeaderFields(),true);
		}
		
		@Test(priority=700207)
		public  static void checkDebitNotesEntryPageBodyFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkDebitNotesEntryPageBodyFields(),true);
		}
		

		@Test(priority=700208)
		public  static void checkDebitNotesEntryPageFooterFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkDebitNotesEntryPageFooterFields(),true);
		}
		
		
		@Test(priority=700209)
		public  static void checkDebitNotesNewDateFieldLessThanCompanyAccountingDate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkDebitNotesNewDateFieldLessThanCompanyAccountingDate(),true);
		}
		
		@Test(priority=700210)
		public  static void checkDebitNotesNewDateFieldMoreThanCompanyAccountingDate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkDebitNotesNewDateFieldMoreThanCompanyAccountingDate(),true);
		}
		
		
		@Test(priority=700211)
		public  static void checkSavingVoucherWithoutAnyMandatoryInputsInDebitNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkSavingVoucherWithoutAnyMandatoryInputsInDebitNotes(),true);
		}

		@Test(priority=700212)
		public  static void checkNewOptioninEntryPageinDebitnotesVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkNewOptioninEntryPageinDebitnotesVAT(),true);
		}
		
	
		@Test(priority=700213)
		public  static void checkSavingVoucherWithInputAccountInDebitNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkSavingVoucherWithInputAccountInDebitNotes(),true);
		}
		
		@Test(priority=700214)
		public  static void checkInputCustmerAccountAndVendorAccountSameInDebitNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkInputCustmerAccountAndVendorAccountSameInDebitNotes(),true);
		}
		
		
		@Test(priority=700215)
		public  static void checkSavingVoucherWithoutAmountInVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkSavingVoucherWithoutAmountInVoucherBody(),true);
		}
		
		@Test(priority=700216)
		public  static void checkInputCustmerAccountAndVendorAccountSamePartyInDebitNotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkInputCustmerAccountAndVendorAccountSamePartyInDebitNotes(),true);
		}
		
		@Test(priority=700217)
		public  static void checkSavingVoucherWithCustomerInDebitnotes() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkSavingVoucherWithCustomerInDebitnotes(),true);
		}
		
		@Test(priority=700218)
		public  static void checkSavingVoucherInDebitNotesWithNewReferencethroughCopyToCLipboard() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkSavingVoucherInDebitNotesWithNewReferencethroughCopyToCLipboard(),true);
		}
		

		@Test(priority=700219)
		public  static void checkSuspendingVoucherInDebitNotesVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkSuspendingVoucherInDebitNotesVAT(),true);
		}
		

		@Test(priority=700220)
		public  static void checkCopyDocumentAndSavingInCreditNoteVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkCopyDocumentAndSavingInCreditNoteVAT(),true);
		}
		
		
		@Test(priority=700221)
		public  static void checkDeleteOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkDeleteOption(),true);
		}
		
		//@Test(priority=700222)
		public  static void checkSignOut() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			dnvp=new DebitNotesVatPage(getDriver());
			Assert.assertEquals(dnvp.checkSignOut(),true);
		}
		
		
		
		
		
		///Completed of Debit notes 

	
	
	
	
}
