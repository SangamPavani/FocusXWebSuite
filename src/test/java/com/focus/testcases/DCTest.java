package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.DCPage;
import com.focus.Pages.MasterDepartmentPage;
import com.focus.Pages.SmokePreferencesPage;
import com.focus.base.BaseEngine;

public class DCTest extends BaseEngine
{
	
	//1034---Before Security
	
	//1035---1082 (Create View)
	
	DCPage dcp;
	
	
	@Test(priority=1000)
	  public void checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		dcp=new DCPage(getDriver());
		  Assert.assertEquals(dcp.checkLoginCompanyWithValidCredentials(), true);
	   
	  }

    @Test(priority=1001)
	public void verifyDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 dcp=new DCPage(getDriver());
		 Assert.assertEquals(dcp.checkDocumentCustomization(), true);
	}
	
	
	@Test(priority=1002)
	public void verifyDocumentCustomizationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());	
		Assert.assertEquals(dcp.checkDocumentCustomizationOptions(), true);

	}

	@Test(priority=1003)
	public void verifyUpdatebuttonwithoutselectinganyVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());		
		Assert.assertEquals(dcp.checkUpdatebuttonwithoutselectinganyVoucher(), true);
		
	}
	
	@Test(priority=1004)
	public void checkTagsCurrencyAndDueDateOfReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());		
		Assert.assertEquals(dcp.checkTagsCurrencyAndDueDateOfReceipts(), true);
		
	}
	
	
	@Test(priority=1005)
	public void checkCreatingNewVoucherInReceipts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());		
		Assert.assertEquals(dcp.checkCreatingNewVoucherInReceipts(), true);
		
	}

	@Test(priority=1006)
	public void checkTagsCurrencyAndDueDateOfPayment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());		
		Assert.assertEquals(dcp.checkTagsCurrencyAndDueDateOfPayment(), true);	
	}
	
	@Test(priority=1007)
	public void checkCreatingNewVoucherInPayments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());		
		Assert.assertEquals(dcp.checkCreatingNewVoucherInPayments(), true);
		
	}
	
	@Test(priority=1008)
	public void checkTagsCurrencyAndDueDateOfPostDatedRecepits() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());		
		Assert.assertEquals(dcp.checkTagsCurrencyAndDueDateOfPostDatedRecepits(), true);
		
	}
	
	@Test(priority=1009)
	public void checkCreatingNewVoucherInPostDatedRecepits() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());		
		Assert.assertEquals(dcp.checkCreatingNewVoucherInPostDatedRecepits(), true);
		
	}
	
	
	@Test(priority=1010)
	public void checkTagsCurrencyAndDueDateOfPostDatedPayments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());		
		Assert.assertEquals(dcp.checkTagsCurrencyAndDueDateOfPostDatedPayments(), true);		
	}
	
	@Test(priority=1011)
	public void checkCreatingNewVoucherInPostDatedPayments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());		
		Assert.assertEquals(dcp.checkCreatingNewVoucherInPostDatedPayments(), true);	
	}
	
	@Test(priority=1012)
	public void checkTagsCurrencyAndDueDateOfPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkTagsCurrencyAndDueDateOfPurchaseVoucher(), true);
	}
	
	
	@Test(priority=1013)
	public void checkRDBodyaddingFieldinPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkRDBodyaddingFieldinPurchaseVoucher(), true);
	}
	
	@Test(priority=1014)
	public void checkSavingFieldsinFooterTabEditScreenPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkSavingFieldsinFooterTabEditScreenPurchaseVoucher(), true);
	}
		
	@Test(priority=1015)
	public void checkTagsCurrencyAndDueDateOfSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkTagsCurrencyAndDueDateOfSalesInvoice(), true);
	}
	
	
	
	@Test(priority=1016)
	public void checkCreatingNewVoucherPurchaseVoucherNew() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherPurchaseVoucherNew(), true);
	}
	
	@Test(priority=1017)
	public void checkCreatingNewVoucherPurchaseVoucheVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherPurchaseVoucheVAT(), true);
	}
	
	
	@Test(priority=1018)
	public void checkCreatingNewVoucherPVVATView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherPVVATView(), true);
	}
	
	@Test(priority=1019)
	public void checkCreatingNewVoucherSalesInvoiceNew() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherSalesInvoiceNew(), true);
	}
	
	@Test(priority=1020)
	public void checkCreatingNewVoucherSalesInvoicVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherSalesInvoicVAT(), true);
	}
	
	@Test(priority=1021)
	public void checkCreatingNewVoucherDebitNotesVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherDebitNotesVAT(), true);
	}
	
	@Test(priority=1022)
	public void checkCreatingNewVoucherCreditNotesVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherCreditNotesVAT(), true);
	}
	
	@Test(priority=1023)
	public void checkOpeningBalanceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkOpeningBalanceVoucher(), true);
	}
	
	
	@Test(priority=1024)
	public void checkCreatingNewVoucherOpeningBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherOpeningBalance(), true);
	}
	
	@Test(priority=1025)
	public void checkopeningStocksVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkopeningStocksVoucher(), true);
	}
	
	@Test(priority=1026)
	public void checkCreatingNewVoucherOpeningStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherOpeningStock(), true);
	}
	
	
	@Test(priority=1027)
	public void checkopeningStocksTransfer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkopeningStocksTransfer(), true);
	}
	
	
	@Test(priority=1028)
	public void checkCreatingNewVoucherStockTransfer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherStockTransfer(), true);
	}
	
	@Test(priority=1029)
	public void checkShortageStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkShortageStock(), true);
	}
	
	@Test(priority=1030)
	public void checkCreatingNewVoucherShortageInStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherShortageInStock(), true);
	}
	
	@Test(priority=1031)
	public void checkExcessInStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkExcessInStock(), true);
	}
	
	
	@Test(priority=1032)
	public void checkCreatingNewVoucherExcessInStock() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherExcessInStock(), true);
	}
	
	
	@Test(priority=1033)
	public void checkJournalEnteries() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkJournalEnteries(), true);
	}
	
	@Test(priority=1034)
	public void checkCreatingNewVoucherjournalEntries() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreatingNewVoucherjournalEntries(), true);
	}
		
	@Test(priority=1035)
	public void checkSalesReturnInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkSalesReturnInDocumentCustomization(), true);
	}
	
	
	@Test(priority=1036)
	public void checkPurchaseReturnInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkPurchaseReturnInDocumentCustomization(), true);
	}
	
	
	
	
	@Test(priority=1037)
	public void checkSalesOrderVoucherInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkSalesOrderVoucherInDocumentCustomization(), true);
	}
	
	@Test(priority=1038)
	public void checkEditingTagsMasterSalesOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkEditingTagsMasterSalesOrders(), true);
	}
	
	@Test(priority=1039)
	public void checkCreateNewDocumentintheSalesOrderVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreateNewDocumentintheSalesOrderVoucher(), true);
	}

	
	@Test(priority=1040)
	public void checkCreateDocumentintheSalesInvoiceVoucherASAutoSalesInvoice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCreateDocumentintheSalesInvoiceVoucherASAutoSalesInvoice(), true);
	}
	
	
	@Test(priority=1041)
	public void checkDeleteDocumentintheSalesInvoiceVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkDeleteDocumentintheSalesInvoiceVoucher(), true);
	}
	
	
	@Test(priority=1042)
	public void checkEditingTagsMasterPurchaseOrders() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkEditingTagsMasterPurchaseOrders(), true);
	}
	
	@Test(priority=1043)
	public void checkCloseAndLogoutTheCompany() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new DCPage(getDriver());
		Assert.assertEquals(dcp.checkCloseAndLogoutTheCompany(), true);
	}
	
	
	
	
}
