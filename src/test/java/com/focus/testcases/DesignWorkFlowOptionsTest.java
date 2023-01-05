package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.DesignWorkFLowOptionsPage;
import com.focus.base.BaseEngine;

public class DesignWorkFlowOptionsTest extends BaseEngine 
{

	static DesignWorkFLowOptionsPage dp ;
	
	@Test(priority=1001)
	public  static void checkCD() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCD(),true);
	}
	
	

	//@Test(priority=1002)
	public  static void checkCopyAndPasteFromClipBoard() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCopyAndPasteFromClipBoard(),true);
	}
	
	
	
	
	//@Test(priority=1001)
	public  static void checkLoginAndRestoreOptionsCompanyAndLogin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLoginAndRestoreOptionsCompanyAndLogin(),true);
	}
	
	/*
	
	@Test(priority=1002)
	public  static void checkInputingWorkflowNameAsPurchasesFlow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkInputingWorkflowNameAsPurchasesFlow(),true);
	}
	
	
	@Test(priority=1003)
	public  static void checkLinkBetweenPurchaseOrderAndPVN() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLinkBetweenPurchaseOrderAndPVN(),true);
	}
	
	@Test(priority=1004)
	public  static void CheckLinkValueDropDownOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.CheckLinkValueDropDownOptions(),true);
	}
	
	@Test(priority=1005)
	public  static void checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrderAndPvn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSelectingQuantityinLinkValueOptionBetweenPurchaseOrderAndPvn(),true);
	}
	
	@Test(priority=1006)
	public  static void checkSelectingItemOptionBetweenPurchaseOrderAndPvn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSelectingItemOptionBetweenPurchaseOrderAndPvn(),true);
	}
	
	@Test(priority=1007)
	public  static void checkMapOptionAndMappedFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkMapOptionAndMappedFields(),true);
	}
	
	
	@Test(priority=1008)
	public  static void checkSavingPurchaseOrders() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrders(),true);
	}
	
	
	@Test(priority=1009)
	public  static void checkPendingPurchaseOrdersPurchaseVoucherNHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkPendingPurchaseOrdersPurchaseVoucherNHomePage(),true);
	}
	
	@Test(priority=1010)
	public  static void checkPendingLinksThroughConvertOptionWithSelectingRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkPendingLinksThroughConvertOptionWithSelectingRow(),true);
	}
	
	@Test(priority=1011) 
	public  static void checkSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseVoucherWithCovertOptionWithAllMandatoryFields(),true);
	}
	
	
	@Test(priority=1012)
	public  static void checkEraseAllTransactionsAfterIntialCheck() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkEraseAllTransactionsAfterIntialCheck(),true);
	}
	
	
	
	@Test(priority=1013)
	public  static void checkUpdatingMapFieldsInBetweenPurchaseOrdersAndPvn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkUpdatingMapFieldsInBetweenPurchaseOrdersAndPvn(),true);
	}
	
	
	
	@Test(priority=1014)
	public  static void checkSavingPurchaseOrdersAfterUpdatingMapFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrdersAfterUpdatingMapFields(),true);
	}
	
	@Test(priority=1015) //
	public  static void checkPendingLinksThroughConvertOptionAfterMapFieldsUpdating() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkPendingLinksThroughConvertOptionAfterMapFieldsUpdating(),true);
	}
	
	@Test(priority=1016)
	public  static void CheckSavingAndDeleteAllTransactions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.CheckSavingAndDeleteAllTransactions(),true);
	}
	
	
	
	@Test(priority=1017)
	public  static void checkRaiseLinkDocumentWhenBaseIsSavedOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkRaiseLinkDocumentWhenBaseIsSavedOption(),true);
	}
	
	
	@Test(priority=1018)
	public  static void checkAutoCLoseInDaysOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAutoCLoseInDaysOption(),true);
	}
	
	
	
	@Test(priority=1019) //
	public  static void checkConsolidateOnDocumentWhenDisplayingInSelection() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkConsolidateOnDocumentWhenDisplayingInSelection(),true);
	}
	
	
	@Test(priority=1020) // Error Message
	public  static void checkCheckStockWhileLinkingOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCheckStockWhileLinkingOption(),true);
	}
	
	
	@Test(priority=1021) 
	public  static void checkCannotExceedTheBaseValueOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCannotExceedTheBaseValueOption(),true);
	}
	
	
	@Test(priority=1022)
	public  static void checkBaseDocumentCannotBeEditiedAfterItIsLinkedOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkBaseDocumentCannotBeEditiedAfterItIsLinkedOption(),true);
	}
	
	
	@Test(priority=1023)
	public  static void checkCloseLinkAfterDueDateElapses() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkAfterDueDateElapses(),true);
	}
	
	
	@Test(priority=1024)
	public  static void checkLinkIsMandatoryOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLinkIsMandatoryOption(),true);
	}
	
	
	@Test(priority=1025)
	public  static void checkDoNotClubWithCommonBaseOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkDoNotClubWithCommonBaseOption(),true);
	}
	
	
	
	@Test(priority=1026)
	public  static void checkDoNotAllowSelectionIfLinksFieldsAreNotSelectedOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkDoNotAllowSelectionIfLinksFieldsAreNotSelectedOption(),true);
	}
	
	
	
	@Test(priority=1027)
	public  static void checkAllowBackDatedLinkingOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAllowBackDatedLinkingOption(),true);
	}
	
	
	
	@Test(priority=1028)
	public  static void checkRecheckBeforeTheSavingIfLinkIsConsumedElseWhereOnTheNetWorkOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkRecheckBeforeTheSavingIfLinkIsConsumedElseWhereOnTheNetWorkOption(),true);
	}
	
	
	
	@Test(priority=1029)
	public  static void checkUseThisLinkOnlyForLoadingOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkUseThisLinkOnlyForLoadingOption(),true);
	}
	
	
	@Test(priority=1030)
	public  static void checkLoadTheBaseDocumentDetailsAtTheTimeOfLinkingOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLoadTheBaseDocumentDetailsAtTheTimeOfLinkingOption(),true);
	}
	
	
	
	@Test(priority=1031)
	public  static void checkLinkIsOptionalIfTheDocumentIsLinkedToOtherBaseDocumentOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLinkIsOptionalIfTheDocumentIsLinkedToOtherBaseDocumentOption(),true);
	}
	
	
	
	@Test(priority=1032)
	public  static void checkRaiseLinkDocumentWhenBaseIsSaved() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkRaiseLinkDocumentWhenBaseIsSaved(),true);
	}
	
	        
	
	@Test(priority=1033)
	public  static void checkLoadPendingDocumentsAndBasedOnFieldOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLoadPendingDocumentsAndBasedOnFieldOption(),true);
	}
	
	
	
	@Test(priority=1034)
	public  static void checkLoadPendingDocumentsAndBasedOnFieldOptionWithExtraField() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLoadPendingDocumentsAndBasedOnFieldOptionWithExtraField(),true);
	}
	  
	
	@Test(priority=1035)
	public  static void CheckToleranceValueAndUseItemWiseToleranceWhenAvailableOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.CheckToleranceValueAndUseItemWiseToleranceWhenAvailableOption(),true);
	}
	
	
	
	@Test(priority=1036) //
	public  static void checkCustomizeOptionAndHideThisColumnInControlPlusL() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCustomizeOptionAndHideThisColumnInControlPlusL(),true);
	}
	
	@Test(priority=1037)
	public  static void checkCustomizeOptionAndAddingExtraFieldsInControlPlusL() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCustomizeOptionAndAddingExtraFieldsInControlPlusL(),true);
	}
	
	
	@Test(priority=1038) //
	public  static void checkCustomizeOptionAndHideThisColumnInLineWise() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCustomizeOptionAndHideThisColumnInLineWise(),true);
	}
	
	@Test(priority=1039)  // 5 6 7 
	public  static void checkCustomizeOptionAndAddingExtraFieldsInLineWise() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCustomizeOptionAndAddingExtraFieldsInLineWise(),true);
	}
	
	
	*/
	
	// Links

	@Test(priority=1040)
	public  static void checkCloseLinkAndPartialOptionInPurchaseOrderHavingTwoLinkDocuments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkAndPartialOptionInPurchaseOrderHavingTwoLinkDocuments(),true);
	}
	

	@Test(priority=1041)
	public  static void checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingTwoLinkDocuments() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingTwoLinkDocuments(),true);
	}
	
	
	@Test(priority=1042)
	public  static void checkDeletingPurchaseFlowAndSavingNewFlowWithOneBaseAndOneLinkDocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkDeletingPurchaseFlowAndSavingNewFlowWithOneBaseAndOneLinkDocument(),true);
	}
	
	
	
	@Test(priority=1043)
	public  static void checkCloseLinkAndPartialOptionInPurchaseOrderHavingOneLinkDocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkAndPartialOptionInPurchaseOrderHavingOneLinkDocument(),true);
	}
	
	
	@Test(priority=1044)
	public  static void checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingOneLinkDocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkCloseLinkOptionOnPartialRowSelectionInPurchaseOrderHavingOneLinkDocument(),true);
	}
	
	
	// Transactions For Order management
	
	
	@Test(priority=1045)
	public  static void checkSavingPurchaseOrderAndPurchaseVoucherNPartialConsumeCloseLink() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrderAndPurchaseVoucherNPartialConsumeCloseLink(),true);
	}
	
	
	@Test(priority=1046)
	public  static void checkSavingPurchaseOrderAndPurchaseVoucherNRowWisePartialConsumeCloseLink() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrderAndPurchaseVoucherNRowWisePartialConsumeCloseLink(),true);
	}
	
	
	
	@Test(priority=1047)
	public  static void checkSavingPurchaseOrderVoucherForCloseLinkAndEditingLinkOptionAndSlabChangeVoucherSave() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkSavingPurchaseOrderVoucherForCloseLinkAndEditingLinkOptionAndSlabChangeVoucherSave(),true);
	}
	
	
	
	@Test(priority=1048)
	public  static void checkAuthorizingPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAuthorizingPurchaseVoucher(),true);
	}
	


	
	// Order ManageMent Report
	
	@Test(priority=1049)
	public  static void checkListingOfDocumentsReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkListingOfDocumentsReport(),true);
	}
	
	
	@Test(priority=1050)
	public  static void checkListingOfDocumentsByDueDateReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkListingOfDocumentsByDueDateReport(),true);
	}
	

	@Test(priority=1051)
	public  static void checkAgeingOfPendingDocumentsReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAgeingOfPendingDocumentsReport(),true);
	}
	
	
	@Test(priority=1052)
	public  static void checkAgeingOfPendingDocumentsByDueDateReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkAgeingOfPendingDocumentsByDueDateReport(),true);
	}
	
	@Test(priority=1053)
	public  static void checkLinkChainAnalysisReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkLinkChainAnalysisReport(),true);
	}
	

	
	@Test(priority=1054)
	public  static void checkPendingVoucherReport() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException, AWTException 
	{
		dp=new DesignWorkFLowOptionsPage(getDriver());
		Assert.assertEquals(dp.checkPendingVoucherReport(),true);
	}


	
}
