package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.ReceiptsVATVoucherPage;
import com.focus.Pages.ReceiptsVATVoucherPage;
import com.focus.base.BaseEngine;

public class ReceiptsVATVoucherTest extends BaseEngine
{
	ReceiptsVATVoucherPage RV;
	
	 @Test(priority=323)
	 public void checkSavingSalesInvoiceVoucher1WithCustomerAccountAsCustomerNewReference() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 RV=new ReceiptsVATVoucherPage(getDriver());
		 Assert.assertEquals(RV.checkSavingSalesInvoiceVoucher1WithCustomerAccountAsCustomerNewReference(), true);
	 }
	 
	 @Test(priority=324)
	 public void checkSavingSalesInvoiceVoucher2WithCustomerAccountAsCustomerSemiAdjustment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 RV=new ReceiptsVATVoucherPage(getDriver());
		 Assert.assertEquals(RV.checkSavingSalesInvoiceVoucher2WithCustomerAccountAsCustomerSemiAdjustment(), true);
	 }
	 
	 @Test(priority=324)
	 public void checkSavingSalesInvoiceVoucher3WithCustomerAccountAsCustomerFullAdjustment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 RV=new ReceiptsVATVoucherPage(getDriver());
		 Assert.assertEquals(RV.checkSavingSalesInvoiceVoucher3WithCustomerAccountAsCustomerFullAdjustment(), true);
	 }
	 
	 

}
