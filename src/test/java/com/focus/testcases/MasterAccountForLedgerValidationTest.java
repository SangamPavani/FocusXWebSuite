package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.MasterAccountForLedgerValidationPage;
import com.focus.Pages. MasterAccountForLedgerValidationPage;
import com.focus.base.BaseEngine;

public class MasterAccountForLedgerValidationTest extends BaseEngine {
	
	 MasterAccountForLedgerValidationPage mal;
	
	
	@Test(priority=500)
	  public void checkLoginToCheckAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLoginToCheckAccount(), true);
	   
	  }
	 /*
	 @Test(priority=501)
	  public void checkToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkToolsOptionsAccountsMenu(), true);
	   
	  }
	
	 @Test(priority=502)
	  public void checkOtherToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkOtherToolsOptionsAccountsMenu(), true);
	   
	  }
	 
	 
	  @Test(priority=503)
	  public void checkSearchAccountClickOnLedgerInMasterRibbon() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkSearchAccountClickOnLedgerInMasterRibbon(), true);
	   
	  }
	 
	  /*@Test(priority=504)
	  public void checkLedgerReportGeneratedAfterClickingOnLedgerButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerReportGeneratedAfterClickingOnLedgerButton(), true);
	   
	  }
	 
	   @Test(priority=505)
	  public void checkReportDetailsInLedgerReportPageForVendorB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkReportDetailsInLedgerReportPage(), true);
	   
	  }
	   
	   @Test(priority=506)
		  public void checkLedgerIsEmptyForVendorB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		  {
			  mal=new  MasterAccountForLedgerValidationPage(getDriver());
			  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerIsEmptyForVendorB(), true);
		   
		  }
	   
	 @Test(priority=507)
	  public void checkLedgerReportForAccountVendorA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerReportForAccountVendorA(), true);
	   
	  }
	   

	 @Test(priority=508)
	  public void checkReportDetailsInLedgerReportPageForVendorA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkReportDetailsInLedgerReportPageForVendorA(), true);
	   
	  }
	
	@Test(priority=508)
	  public void checkReportsInCustomizationMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkReportsInCustomizationMaster(), true);
	   
	  }
	
	@Test(priority=509)
	  public void checkAllReportsDisplayingInReportsTabInCustomizationMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkAllReportsDisplayingInReportsTabInCustomizationMaster(), true);
	   
	  }
	
	@Test(priority=509)
	  public void checkLedgerdetailcheckBoxInReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerdetailcheckBoxInReports(), true);
	   
	  }
	
	@Test(priority=510)
	  public void checkLogoutAndLoginAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLogoutAndLoginAfterCustomization(), true);
	   
	  }
	
	
	
	@Test(priority=511)
	  public void checkLedgerInDetailIsDisplayingInMasterRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerInDetailIsDisplayingInMasterRibbonControl(), true);
	   
	  }
	
	@Test(priority=512)
	  public void checkLedgerDetailReportForVendorB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerDetailReportForVendorB(), true);
	   
	  }
	
	
	
	@Test(priority=513)
	  public void CheckLedgerDetailReportDetailsForVendorB() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.CheckLedgerDetailReportDetailsForVendorB(), true);
	   
	  }
	
	//Account Properties   display CreditOrDebitTotlasForEachMonth
	@Test(priority=514)
	  public void checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachMonth() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachMonth(), true);
	   
	  }
	
	@Test(priority=515)
	  public void checkSavedAccountInTheAccountsList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkSavedAccountInTheAccountsList(), true);
	   
	  }
	
	@Test(priority=516)
	  public void checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachMonth() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachMonth(), true);
	   
	  }
	
	@Test(priority=516)
	  public void checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth(), true);
	   
	  }
	@Test(priority=516)
	  public void checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachMonth2(), true);
	   
	  }
	
	@Test(priority=518)
	  public void checkLedgerReportForCreatedCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerReportForCreatedCustomer(), true);
	   
	  }
	@Test(priority=519)
	  public void checkLedgerReportDetailsForCreatedCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerReportDetailsForCreatedCustomer(), true);
	   
	  }
	
	@Test(priority=519)
	  public void checkCustomerStatementsReportForCreatedCustomerAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportForCreatedCustomerAccount(), true);
	   
	  }
	
	@Test(priority=520)
	  public void checkCustomerStatementsReportDetailsForCreatedCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportDetailsForCreatedCustomer(), true);
	   
	  }
	
	//Account Properties   display CreditOrDebitTotlasForEachDay
	
	@Test(priority=521)
	  public void checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachDay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkAccouncreatedWithPropertyAsCreditOrDebitTotlasForEachDay(), true);
	   
	  }
	

	@Test(priority=522)
	  public void checkSavedAccountInTheAccountsList1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkSavedAccountInTheAccountsList1(), true);
	   
	  }
	
	@Test(priority=523)
	  public void checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachDay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkPropertiesForCreatedAccountAsDebitOrCreditTotalsForEachDay(), true);
	   
	  }
	
	@Test(priority=524)
	  public void checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay(), true);
	   
	  }
	
	@Test(priority=525)
	  public void checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesInvoivesVATForCustomerDislayDrOrCrTotalsForEachDay2(), true);
	   
	  }
	

	@Test(priority=526)
	  public void checkLedgerReportForCreatedCustomer2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerReportForCreatedCustomer2(), true);
	   
	  }
	
	

	@Test(priority=527)
	  public void checkLedgerReportDetailsForCreatedCustomer2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerReportDetailsForCreatedCustomer2(), true);
	   
	  }
	
	@Test(priority=528)
	  public void checkCustomerStatementsReportForCreatedCustomerAccount2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportForCreatedCustomerAccount2(), true);
	   
	  }
	

	@Test(priority=529)
	  public void checkCustomerStatementsReportDetailsForCreatedCustomerAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportDetailsForCreatedCustomerAccount(), true);
	   
	  }
	*/
	//Account Properties   display LEDGER by CURRENCY
	
	/*@Test(priority=530)
	  public void checkAccouncreatedWithPropertyAsDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkAccouncreatedWithPropertyAsDisplayLedgerByCurrency(), true);
	   
	  }
	
	@Test(priority=531)
	  public void checkSavedAccountInTheAccountsList2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkSavedAccountInTheAccountsList2(), true);
	   
	  }
	
	@Test(priority=532)
	  public void checkPropertiesForCreatedAccountAsDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkPropertiesForCreatedAccountAsDisplayLedgerByCurrency(), true);
	   
	  }*/
	
	/*@Test(priority=533)
	  public void checkRaiseSalesInvoivesVATForCustomerDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesInvoivesVATForCustomerDisplayLedgerByCurrency(), true);
	   
	  }
	
	
	@Test(priority=534)
	  public void checkLedgerReportForCreatedCustomer3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerReportForCreatedCustomer3(), true);
	   
	  }
	
	@Test(priority=535)
	  public void checkLedgerDetailsForCustomerDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerDetailsForCustomerDisplayLedgerByCurrency(), true);
	   
	  }
	

	@Test(priority=536)
	  public void checkCustomerStatementsReportForCreatedCustomerAccountDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportForCreatedCustomerAccountDisplayLedgerByCurrency(), true);
	   
	  }
	
	
	@Test(priority=537)
	  public void checkCustomerStatementsReportDetailsForCreatedCustomerDisplayLedgerByCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportDetailsForCreatedCustomerDisplayLedgerByCurrency(), true);
	   
	  }*/
	//Group account property club the transactions of each account under group 
	
	/*@Test(priority=538)
	  public void checkGroupAccountCreateAndSelectPropertyASClubAllTransactionsOfEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkGroupAccountCreateAndSelectPropertyASClubAllTransactionsOfEachAccountUnderGroup(), true);
	   
	  }
	
	@Test(priority=539)
	  public void checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsClubAllTransactionsOfEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsClubAllTransactionsOfEachAccountUnderGroup(), true);
	   
	  }
	
	
	@Test(priority=540)
	  public void checkRaiseSalesInvoivesVATForCustomerAccountOneInGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesInvoivesVATForCustomerAccountOneInGroup(), true);
	   
	  }
	
	@Test(priority=541)
	  public void checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroup(), true);
	   
	  }
	

	@Test(priority=542)
	  public void checkCustomerStatementsReportForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup(), true);
	   
	  }
	
	@Test(priority=543)
	  public void checkCustomerStatementsReportDetailsForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportDetailsForGroupAccountCustCulbTransactionsOfAllAccountsUnderGroup(), true);
	   
	  }
	*/
	//Group account property Display Debit/Credit totals for each Account under group
	
	@Test(priority=544)
	  public void checkGroupAccountCreateAndSelectPropertyASDisplayDrOrCrTotalForEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkGroupAccountCreateAndSelectPropertyASDisplayDrOrCrTotalForEachAccountUnderGroup(), true);
	   
	  }
	
	@Test(priority=545)
	  public void checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsDisplayDrOrCrTotalForEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkSavedGroupAccountInTheAccountsListAndSelectProprtyAsDisplayDrOrCrTotalForEachAccountUnderGroup(), true);
	   
	  }
	
	
	/*@Test(priority=546)
	  public void checkRaiseSalesInvoivesVATForCustomerAccountOneInGroupForDrOrCrTotlas() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesInvoivesVATForCustomerAccountOneInGroupForDrOrCrTotlas(), true);
	   
	  }
	
	@Test(priority=547)
	  public void checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroupForDrOrCrTotlas() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesInvoivesVATForCustomerAccountTwoInGroupForDrOrCrTotlas(), true);
	   
	  }
	

	@Test(priority=548)
	  public void checkCustomerStatementsReportForGroupAccountDisplayDrOrCrTotalsForEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportForGroupAccountDisplayDrOrCrTotalsForEachAccountUnderGroup(), true);
	   
	  }
	
	@Test(priority=549)
	  public void checkCustomerStatementsReportDetailsForGroupAccountDisplayDrOrCrTotalsForEachAccountUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportDetailsForGroupAccountDisplayDrOrCrTotalsForEachAccountUnderGroup(), true);
	   
	  }
	*/
	
	/*
	//accountProperty as display as active 
	@Test(priority=550)
	  public void checkAccouncreatedWithPropertAsStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkAccouncreatedWithPropertAsStatusIsActive(), true);
	   
	  }
	
	@Test(priority=551)
	  public void checkSavedAccountInTheAccountsListCustStatusActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkSavedAccountInTheAccountsListCustStatusActive(), true);
	   
	  }
	
	@Test(priority=552)
	  public void checkPropertiesForCreatedAccountAsDisplayWhenStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkPropertiesForCreatedAccountAsDisplayWhenStatusIsActive(), true);
	   
	  }
	
	@Test(priority=553)
	  public void checkRaiseSalesIvoiceForCustomerAccountCustDisplayWhenStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkRaiseSalesIvoiceForCustomerAccountCustDisplayWhenStatusIsActive(), true);
	   
	  }
	
	
	
	@Test(priority=554)
	  public void checkCustomerStatementsReportForCustDisplayWhenStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportForCustDisplayWhenStatusIsActive(), true);
	   
	  }
	
	
	@Test(priority=555)
	  public void checkCustomerStatementsReportDeatilsForCustDisplayWhenStatusIsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportDeatilsForCustDisplayWhenStatusIsActive(), true);
	   
	  }
	*/
	
/*	
	@Test(priority=556)
	  public void checkSearchAccountCustomerStausAsActiveClickOnLedgerInMasterRibbon() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkSearchAccountCustomerStausAsActiveClickOnLedgerInMasterRibbon(), true);
	   
	  }
	
	
	@Test(priority=557)
	  public void checkReportDetailsInLedgerReportPageForCustomerAccountStatusAsActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkReportDetailsInLedgerReportPageForCustomerAccountStatusAsActive(), true);
	   
	  }
	
	
	@Test(priority=558)
	  public void checkChangeAccountPropertyFromActiveToInActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkChangeAccountPropertyFromActiveToInActive(), true);
	   
	  }
	
	
	@Test(priority=559)
	  public void checkLogoutAndLoginToCheckCustomerStatementsReports() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLogoutAndLoginToCheckCustomerStatementsReports(), true);
	   
	  }
	
	@Test(priority=560)
	  public void checkCustomerStatementsReportisEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkCustomerStatementsReportisEmpty(), true);
	   
	  }
	
	
	@Test(priority=561)
	  public void checkLedgerIsEmptyForCustomerAccountStatusAsInActive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mal=new  MasterAccountForLedgerValidationPage(getDriver());
		  Assert.assertEquals( MasterAccountForLedgerValidationPage.checkLedgerIsEmptyForCustomerAccountStatusAsInActive(), true);
	   
	  }*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   
	
	

}
