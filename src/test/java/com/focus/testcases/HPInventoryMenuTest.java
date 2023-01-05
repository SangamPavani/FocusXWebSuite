package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.HPInventoryMenuPage;
import com.focus.base.BaseEngine;

public class HPInventoryMenuTest extends BaseEngine{

	HPInventoryMenuPage HPIP;
	
	
	  @Test(priority=106)
	  public void verifyInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkInventoryMenu(), true);
	   
	  }
	 
	 
	  @Test(priority=107)
	  public void verifyTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkTransactionMenuInInventoryMenu(), true);
	   
	  }
	 
	 
	  @Test(priority=108)
	  public void verifyPurchasesMenuInTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkPurchasesMenuInTransactionMenuInInventoryMenu(), true);
	   
	  }
	 
	  @Test(priority=109)
	  public void verifySalesMenuInTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkSalesMenuInTransactionMenuInInventoryMenu(), true);
	   
	  }
	 
	  @Test(priority=110)
	  public void verifyStocksMenuInTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkStocksMenuInTransactionMenuInInventoryMenu(), true);
	   
	  }
	 
	  @Test(priority=111)
	  public void verifyReportsMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkReportsMenuInInventoryMenu(), true);
	   
	  }
	  
	  @Test(priority=112)
	  public void verifyBinReportsInReportsMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkBinReportsMenuInReportsMenuInInventoryMenu(), true);
	   
	  }  
	  
	  @Test(priority=113)
	  public void verifyAgeingAnalysisReportsInReportsMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkAgeingAnalysisMenuReportsMenuInReportsMenuInInventoryMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=114)
	  public void verifyOrderManagementMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkOrderManagementMenuInInventoryMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=115)
	  public void verifyAnalysiOfLinkedAndUnlinkedMenuInOrderManagementMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPIP=new HPInventoryMenuPage(getDriver());
		  Assert.assertEquals(HPInventoryMenuPage.checkAnalysisOfLinkedAndUnlinkedMenuInOrderManagementMenuInInventoryMenu(), true);
	   
	  }
	  
	  
	  
	 
}
