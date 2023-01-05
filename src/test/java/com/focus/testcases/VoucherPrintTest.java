package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.VoucherPrintPage;
import com.focus.base.BaseEngine;

public class VoucherPrintTest extends BaseEngine {

VoucherPrintPage vpp;
	




	  @Test(priority=1000)
	  public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  vpp=new VoucherPrintPage(getDriver());
	  Assert.assertEquals(vpp.checkLogin(), true);
 
	  }
	  
	  /*
	  @Test(priority=1001)
	  public void checkPrintOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkPrintOption(), true);
	   
	  }
	
	
	  @Test(priority=1002)
	  public void checkPrintScreenOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkPrintScreenOptions(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=1003)
	  public void checkLayoutOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkLayoutOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=1004)
	  public void checkInvoiceDesignOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkInvoiceDesignOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=1005)
	  public void checkFieldsTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkFieldsTabOptions(), true);
	   
	  }
	  
	  
	  
	/*  @Test(priority=6)
	  public void checkHeaderOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkHeaderOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=7)
	  public void checkBodyOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkBodyOptions(), true);
	   
	  }
	  
	
	  
	  @Test(priority=8)
	  public void checkUserDetailsOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkUserDetailsOptions(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=9)
	  public void checkMiscellaneousOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkMiscellaneousOptions(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=10)
	  public void checkCompanyOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkCompanyOptions(), true);
	   
	  }*/
	  
	   
	  /*@Test(priority=1011)
	  public void checkDraggingFieldsToDesignArea() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkDraggingFieldsToDesignArea(), true);
	   
	  }*/
	  
	 /*
	  @Test(priority=1012)
	  public void checkDragandDropHeaderFiledsIntoLayout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkDragandDropHeaderFiledsIntoLayout(), true);
	   
	  }
	  
	  
	  @Test(priority=1013)
	  public void checkDragandDropBodyFiledsIntoLayout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkDragandDropBodyFiledsIntoLayout(), true);
	   
	  }
	  
	 
	  @Test(priority=1014)
	  public void checkChangeFieldPropertiesInLyout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkChangeFieldPropertiesInLyout(), true);
	   
	  }
	  
	  
	  @Test(priority=1015)
	  public void checkPrintPdfOfPurchaseVoucherVAT() throws AWTException, Exception
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkPrintPdfOfPurchaseVoucherVAT(), true);
	   
	  }
	  */
	  
	  
	 @Test(priority=1016)
	  public void checkSavingPurchasesVatDesignLayout() throws AWTException, Exception
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkSavingPurchasesVatDesignLayout(), true);
	   
	  }
	  
	  @Test(priority=1017)
	  public void checkEditingLayoutByAddingFields() throws AWTException, Exception
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkEditingLayoutByAddingFields(), true);
	   
	  }
	  
	  
	  @Test(priority=1018)
	  public void checkUpdatedLayoutAndDeleteTheLayout() throws AWTException, Exception
	  {
		  vpp=new VoucherPrintPage(getDriver());
		  Assert.assertEquals(vpp.checkUpdatedLayoutAndDeleteTheLayout(), true);
	   
	  }
	   
}
