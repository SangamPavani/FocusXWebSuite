package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.BillWisePage;
import com.focus.Pages.ReportDesignerPage;
import com.focus.base.BaseEngine;

public class ReportDesignerTest extends BaseEngine 
{
	  ReportDesignerPage RDP ;
	  

	  @Test(priority=90)
		public void checkLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		  RDP=new ReportDesignerPage(getDriver());
			Assert.assertEquals(RDP.checkLogin(), true);	
		}
	  
	 /* 
	  @Test(priority=91)
	  public void checkSavingReportDesignerOfAllTransactionsOfDocumentClass() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingReportDesignerOfAllTransactionsOfDocumentClass(), true);
	  }
	  
	  @Test(priority=92)
	  public void checkUpdatingTheSavedReportInreportDesinger() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkUpdatingTheSavedReportInreportDesinger(), true);
	  }
	  
	  @Test(priority=94)
	  public void checkPreviewTabInReportDesiging() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkPreviewTabInReportDesiging(), true);
	  }
	  
	  
	  // Report Validation
	  @Test(priority=95)
	  public void checkReportAllTransactionsOfDocumentClassOfPurchaseType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkReportAllTransactionsOfDocumentClassOfPurchaseType(), true);
	  }
	  
	 
	  
	  @Test(priority=96)
	  public void checkSavingAllTransactionsOfDocumentTypeOfPurchaseTypeToCubes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingAllTransactionsOfDocumentTypeOfPurchaseTypeToCubes(), true);
	  }
	  
	  
	  
	  @Test(priority=97)
	  public void checkReportAllTransactionsOfDocumentTypeOfRecepitsVATType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkReportAllTransactionsOfDocumentTypeOfRecepitsVATType(), true);
	  }                   
	  
	  
	  @Test(priority=98)
	  public void checkSavingAccountingTransactionsOfAnAccountDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingAccountingTransactionsOfAnAccountDetails(), true);
	  } 
	   
	  
	  @Test(priority=99)
	  public void checkReportAccountingTransactionsOfAnAccountDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkReportAccountingTransactionsOfAnAccountDetails(), true);
	  } 
	  
	 
	  
	  @Test(priority=100)
	  public void checkSavingAccountingTransactionsOfAccountingTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingAccountingTransactionsOfAccountingTagDetails(), true);
	  } 
	   
	  @Test(priority=101)
	  public void checkReportAccountingTransactionsOfAnAccountingTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkReportAccountingTransactionsOfAnAccountingTagDetails(), true);
	  } 
	  
	  
	  @Test(priority=102)
	  public void checkSavingAccountingTrasactionsOfInventoryTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingAccountingTrasactionsOfInventoryTagDetails(), true);
	  } 
	 
	  
	  @Test(priority=103)
	  public void checkReportAccountingTrasactionsofInventoryTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkReportAccountingTrasactionsofInventoryTagDetails(), true);
	  } 
	  
	  
	  @Test(priority=104)
	  public void checkSavingAccountingTransactionsoFTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingAccountingTransactionsoFTagDetails(), true);
	  } 
	 
	  @Test(priority=105)
	  public void checkReportAccountingTransactionsofTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkReportAccountingTransactionsofTagDetails(), true);
	  } 
	   
	   
	  @Test(priority=106)
	  public void checkSavingAllAccountsByTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingAllAccountsByTagDetails(), true);
	  } 
	  
	  
	  @Test(priority=107)
	  public void checkReportAllAccountsByTagDetails() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkReportAllAccountsByTagDetails(), true);
	  } 
	  
	  */
	  
	  
	 /* @Test(priority=200)
	  public void checkSavingAccountingTransactionsCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingAccountingTransactionsCube(), true);
	  } 
	  
	  @Test(priority=201)
	  public void checkReportAccountingTransactionsCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkReportAccountingTransactionsCube(), true);
	  } 
	  
	  
	  
	  @Test(priority=202)
	  public void checkSavingAccountingTransactionsOfAnAccountCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingAccountingTransactionsOfAnAccountCube(), true);
	  } 
	  
	  
	  @Test(priority=203)
	  public void checkReportAccountingtransactionOfAnAccountCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkReportAccountingtransactionOfAnAccountCube(), true);
	  } 
	  */
	  
	  
	  @Test(priority=204)
	  public void checkSavingAccountingTransactionsOfAnAccountingTagCube() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingAccountingTransactionsOfAnAccountingTagCube(), true);
	  }
	  
}