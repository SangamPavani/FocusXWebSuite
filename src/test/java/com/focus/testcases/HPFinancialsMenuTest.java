package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPFinancialsMenuPage;
import com.focus.base.BaseEngine;

public class HPFinancialsMenuTest extends BaseEngine{

      HPFinancialsMenuPage HPFP;
	
	  @Test(priority=78)
	  public void verifyFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFianancialsMenu(), true);
	   
	  }
	  
	  @Test(priority=79)
	  public void verifyTransactionssMenuInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkTransactionsMenu(), true);
	   
	  }
	  
	  @Test(priority=80)
	  public void verifyCashAndBanksMenuInTransFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFinancialsCashAndBankMenu(), true);
	   
	  }
	
	  @Test(priority=81)
	  public void verifyPurchasesMenuInTransFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFinancialsPurchasesMenu(), true);
	   
	  }
	  
	  
	   @Test(priority=82)
	  public void verifySalesMenuInTransFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFinancialsSalesMenu(), true);
	   
	  }
	  
	   @Test(priority=83)
	  public void verifyJournalsMenuInTransFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFinancialsJournalsMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=84)
	  public void verifyAutoPostingMenuInTransFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFinancialsAutoPostingsMenu(), true);
	   
	  }
	  
	  @Test(priority=85)
	  public void verifyCreditManagementInTransFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFinancialsCreditManagmentMenu(), true);
	   
	  }
	  
	  @Test(priority=86)
	  public void verifyFinancialDeliquencyInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFinancialsDeliquencySubMenuInCreditManagmentMenu(), true);
	   
	  }
	  
	  @Test(priority=87)
	  public void verifyReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFinancialsReportsMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=88)
	  public void verifyCashAndBankMenuInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkCashAndBankMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  @Test(priority=89)
	  public void verifySalesReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkSalesReportsMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	 
	  @Test(priority=90)
	  public void verifyPurchasesReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkPurchaseReportsMenuReportsInFinancialsMenu(), true);
	   
	  }
	 
	  
	  @Test(priority=91)
	  public void verifyRegistersReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkRegisterReportsMenuReportsInFinancialsMenu(), true);
	   
	  }
	 
	  
	  @Test(priority=92)
	  public void verifySalesAndPurchaseAnalysisReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkSalesAndPurchaseAnalysisReportsMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=93)
	  public void verifyMiscellanousReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkMicellaneousAnalysisReportsMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=94)
	  public void verifyMasterInformationReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkMastersInformationReportsMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=95)
	  public void verifyAuditTrailReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkAuditTrailReportsMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=96)
	  public void verifyFinalAccountsReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkFinalAccountsReportsMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  @Test(priority=97)
	  public void verifyReceivableAndPayablesReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkReceivableAndPayableAnalysisMenuReportsInFinancialsMenu(), true);
	   
	  }
	
	  
	  @Test(priority=98)
	  public void verifyCustomerDetailReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkCustomerDetailMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  @Test(priority=99)
	  public void verifyCustomerSummaryReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkCustomerSummaryMenuReportsInFinancialsMenu(), true);
	   
	  }

	  @Test(priority=100)
	  public void verifyVendorDetailReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkVendorDetailMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=101)
	  public void verifyVendorSummaryReportsInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkVendorSumaryMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  @Test(priority=102)
	  public void verifyBudgetMenuInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkBudgetMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  @Test(priority=103)
	  public void verifyReviseBudgetMenuInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkReviseBudgetMenuReportsInFinancialsMenu(), true);
	   
	  }
	  
	  @Test(priority=104)
	  public void verifyBudgetReportsMenuInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkBudgetReportsInFinancialsMenu(), true);
	   
	  }
	  
	  @Test(priority=105)
	  public void verifyOnlinePaymentsMenuInFinancailsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  HPFP=new HPFinancialsMenuPage(getDriver());
		  Assert.assertEquals(HPFinancialsMenuPage.checkOnlinePaymentInFinancialsMenu(), true);
	   
	  }


}
