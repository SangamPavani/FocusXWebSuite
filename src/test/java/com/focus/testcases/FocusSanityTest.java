package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.FocusSanityPage;
import com.focus.base.BaseEngine;

public class FocusSanityTest extends BaseEngine
{

	FocusSanityPage AUP;
	
	 @Test(priority=101)
	 public void checkLoginAndOpenAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkLoginAndOpenAccountsMenu(), true);
	 }
	 
	 /*
	 @Test(priority=101)
	 public void checkLoginAndRestoreOptionsCompanyAndLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkLoginAndRestoreOptionsCompanyAndLogin(), true);
	 }
	 */
	 
/*
	
	 @Test(priority=102)
	 public void checkMastersSubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkMastersSubMenus(), true);
	 }
	
	 @Test(priority=103)
	 public void checkMainOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkMainOptionsAccountsMenu(), true);
	 }
	
	// @Test(priority=104)
	 public void checkToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkToolsOptionsAccountsMenu(), true);
	 }
	
	 //@Test(priority=105)
	 public void checkOtherToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkOtherToolsOptionsAccountsMenu(), true);
	 }
	
	 //@Test(priority=106)
	 public void checkTreeViewOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkTreeViewOptionsAccountsMenu(), true);
	 }
	
	// @Test(priority=107)
	 public void checkGroupOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkGroupOptionsAccountsMenu(), true);
	 }
	
	// @Test(priority=108)
	 public void checkCreateTreeToggleOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkCreateTreeToggleOptionsAccountsMenu(), true);
	 }
	
	// @Test(priority=109)
	 public void checkCreateViewToggleOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkCreateViewToggleOptionsAccountsMenu(), true);
	 }
	
	// @Test(priority=110)
	 public void checkHideAccountGroupsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkHideAccountGroupsOptionsAccountsMenu(), true);
	 }
	
	// @Test(priority=111)
	 public void checkUnHideAccountGroupsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUnHideAccountGroupsOptionsAccountsMenu(), true);
	 }
	
	// @Test(priority=112)
	 public void checkMainPageHeaderFieldsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkMainPageHeaderFieldsOptionsAccountsMenu(), true);
	 }
	
	// @Test(priority=113)
	 public void checkSearchOptionsInMainPageHeaderFieldsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSearchOptionsInMainPageHeaderFieldsOptionsAccountsMenu(), true);
	 }

	// @Test(priority=114)
	 public void checkAccountsMasterDisplayInMainPageGridAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkAccountsMasterDisplayInMainPageGridAccountsMenu(), true);
	 }

	 @Test(priority=117)
	 public void checkSavingAccountINAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingAccountINAccountMaster(), true);
	 }
	
	 @Test(priority=118)
	 public void checkEditingInSavedAccountINAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingInSavedAccountINAccountMaster(), true);
	 }
	
	 @Test(priority=119)
	 public void checkUpdatedAccountDisplayInAccountGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatedAccountDisplayInAccountGridBeforeCustomization(), true);
	 }
	 
	 @Test(priority=120)
	 public void checkDeleteAccountInAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteAccountInAccountMaster(), true);
	 }
	 
	
	
	
	
	
	
	 
	 @Test(priority=122)
	 public void checkItemMasterInMasterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkItemMasterInMasterMenu(), true);
	 }
	
	 @Test(priority=123)
	 public void checkSavingItemInItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingItemInItemMaster(), true);
	 }
	
	 @Test(priority=124)
	 public void checkEditingInSavedItemINItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingInSavedItemINItemMaster(), true);
	 }
	
	 @Test(priority=125)
	 public void checkUpdatedItemMasterDisplayInItemGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatedItemMasterDisplayInItemGridBeforeCustomization(), true);
	 }
	
	 @Test(priority=126)
	 public void checkDeleteItemInItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteItemInItemMaster(), true);
	 }
	 
	 
	
	
	 
	 
	 
	 
	 
	 @Test(priority=128)
	 public void checkUnitMasterInMAsterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUnitMasterInMAsterMenu(), true);
	 }
	
	 @Test(priority=129)
	 public void checkSavingUnitsInUnitsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingUnitsInUnitsMaster(), true);
	 }
	
	 @Test(priority=130)
	 public void checkEditingInSavedUnitsINUnitsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingInSavedUnitsINUnitsMaster(), true);
	 }
	
	 @Test(priority=131)
	 public void checkUpdatedUnitsMasterDisplayInUnits() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatedUnitsMasterDisplayInUnits(), true);
	 }
	
	 @Test(priority=132)
	 public void checkDeleteUnitsInUnitsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteUnitsInUnitsMaster(), true);
	 }
	 
	
	 
	 
	 
	 
	 
	 
	 
	  
	 @Test(priority=134)
	 public void checkOpenCurrencyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkOpenCurrencyMenu(), true);
	 }
	 
	 @Test(priority=135)
	 public void checkUpdatingISOCurrencyCodeSLLCoinName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatingISOCurrencyCodeSLLCoinName(), true);
	 }
	 
	 @Test(priority=136)
	 public void checkUpdatingAgainISOCurrencyCodeSLLCoinName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatingAgainISOCurrencyCodeSLLCoinName(), true);
	 }
	 

	 
	 
	 
	 
	 
	 //@Test(priority=137)
	 public void checkExchangeRateTitleOnClickOnExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkExchangeRateTitleOnClickOnExchangeRateOptionInCurrencyMaster(), true);
	 }
	 
	 //@Test(priority=138)
	 public void checkUpdateExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdateExchangeRateOfCurrencyMaster(), true);
	 }
	 
	 //@Test(priority=139)
	 public void checkClearOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkClearOptionInCurrencyMaster(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=140)
	 public void checkOpenExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkOpenExchangeRate(), true);
	 }
	 
	 @Test(priority=141)
	 public void checkDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteOptionInExchangeRate(), true);
	 }
	 
	 @Test(priority=142)
	 public void checkSavingCurrencyExchnageRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingCurrencyExchnageRate(), true);
	 }
	 
	 @Test(priority=143)
	 public void checkOpenExchangeRateHistory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkOpenExchangeRateHistory(), true);
	 }
	 
	 @Test(priority=144)
	 public void checkExchangeRateHistoryLoadButtonWithBaseCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkExchangeRateHistoryLoadButtonWithBaseCurrency(), true);
	 }
	 
	 @Test(priority=145)
	 public void checkUpdateExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdateExchangeRate(), true);
	 }
	 
	 @Test(priority=146)
	 public void checkExchangeRateHistoryAfterUpdating() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkExchangeRateHistoryAfterUpdating(), true);
	 }
	 
	 
	 
	
	 
	 
	
	 
	 
	
	
	 @Test(priority=148)
	 public void checkDepartmentMasterInMAsterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDepartmentMasterInMAsterMenu(), true);
	 }
	
	 @Test(priority=149)
	 public void checkSavingDepartmentInDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingDepartmentInDepartmentMaster(), true);
	 }
	
	 @Test(priority=150)
	 public void checkEditingInSavedDepartmentINDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingInSavedDepartmentINDepartmentMaster(), true);
	 }
	
	 @Test(priority=151)
	 public void checkUpdatedDepartmentMasterDisplayInDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatedDepartmentMasterDisplayInDepartment(), true);
	 }
	
	 @Test(priority=152)
	 public void checkDeleteInDepaermentInDepaermentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteInDepaermentInDepaermentMaster(), true);
	 }
	 
	
	
	 
	 
	 
	
	
	
	 @Test(priority=154)
	 public void checkWarehouseMasterInMAsterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkWarehouseMasterInMAsterMenu(), true);
	 }
	
	 @Test(priority=155)
	 public void checkSavingWarehouseInWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingWarehouseInWarehouseMaster(), true);
	 }
	
	 @Test(priority=156)
	 public void checkEditingInSavedWarehouseINWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingInSavedWarehouseINWarehouseMaster(), true);
	 }
	
	 @Test(priority=157)
	 public void checkUpdatedWarehouseMasterDisplayInWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatedWarehouseMasterDisplayInWarehouse(), true);
	 }
	
	 @Test(priority=158)
	 public void checkDeleteInWarehouseInWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteInWarehouseInWarehouseMaster(), true);
	 }
	
	
	
	 
	 
	 
	 
	 
	
	 @Test(priority=160)
	 public void checkBinsMasterInMasterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkBinsMasterInMasterMenu(), true);
	 }
	
	 @Test(priority=161)
	 public void checkSavingBinsInBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingBinsInBinsMaster(), true);
	 }
	
	 @Test(priority=162)
	 public void checkEditingInSavedBinsINBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingInSavedBinsINBinsMaster(), true);
	 }
	
	 @Test(priority=163)
	 public void checkUpdatedBinsMasterDisplayInBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatedBinsMasterDisplayInBins(), true);
	 }
	
	 @Test(priority=164)
	 public void checkDeleteInBinsInBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteInBinsInBinsMaster(), true);
	 }
	 

	 
	 

	
	
	
	 
	 @Test(priority=166)
	 public void checkDeletingUnitConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingUnitConversion(), true);
	 }
	
	 @Test(priority=167)
	 public void checkSavingUnitConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingUnitConversion(), true);
	 }

	 @Test(priority=168)
	 public void checkUpdatingUnitConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatingUnitConversion(), true);
	 }
	 
	
	
	
	
	
	 
	  
	 @Test(priority=169)
	 public void checkSavingSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSellerPriceBook(), true);
	 }
	
	 @Test(priority=170)
	 public void checkUpdatingSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatingSellerPriceBook(), true);
	 }
	
	 @Test(priority=171)
	 public void checkCopyPasteAndSavingSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkCopyPasteAndSavingSellerPriceBook(), true);
	 }
	
	 @Test(priority=172)
	 public void checkDeletingSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingSellerPriceBook(), true);
	 }
	 
	
	
	
	
	 
	 
	 
     @Test(priority=173)
	 public void checkSavingBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingBuyerPriceBook(), true);
	 }
	
	 @Test(priority=174)
	 public void checkUpdatingBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatingBuyerPriceBook(), true);
	 }
	
	 @Test(priority=175)
	 public void checkCopyPasteAndSavingBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkCopyPasteAndSavingBuyerPriceBook(), true);
	 }
	
	 @Test(priority=176)
	 public void checkDeletingBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingBuyerPriceBook(), true);
	 }
	
	
	 
	 
	 
	 // Document Customization
	 
	 @Test(priority=177)
	 public void checkSavingDocumentCustomizationPurchaseVoucherDocumentsTabAndVerify() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingDocumentCustomizationPurchaseVoucherDocumentsTabAndVerify(), true);
	 }
	 
	 @Test(priority=178)
	 public void checkEditingPurchaseVoucherDocumentAndUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingPurchaseVoucherDocumentAndUpdate(), true);
	 }
	 
	 @Test(priority=179)
	 public void checkUpdatingMiscellaneousTabInPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatingMiscellaneousTabInPurchaseVoucher(), true);
	 }
	
	 @Test(priority=180)
	 public void checkEditingMiscellaneousTabInPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingMiscellaneousTabInPurchaseVoucher(), true);
	 }
	 
	
	 
	 @Test(priority=181)
	 public void checkAddFieldInEditScreenBodyInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkAddFieldInEditScreenBodyInTrialPurchaseUpdate(), true);
	 }
	 
	 @Test(priority=182)
	 public void checkEditFieldInEditScreenBodyInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditFieldInEditScreenBodyInTrialPurchaseUpdate(), true);
	 }
	 
	 @Test(priority=183)
	 public void checkDeleteFieldInEditScreenBodyInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteFieldInEditScreenBodyInTrialPurchaseUpdate(), true);
	 }
	 
	
	 
	 @Test(priority=184)
	 public void checkAddFieldInEditScreenFooterInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkAddFieldInEditScreenFooterInTrialPurchaseUpdate(), true);
	 }
	 
	 @Test(priority=185)
	 public void checkEditFieldInEditScreenFooterInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditFieldInEditScreenFooterInTrialPurchaseUpdate(), true);
	 }
	 
	 @Test(priority=186)
	 public void checkDeleteFieldInEditScreenFooterInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteFieldInEditScreenFooterInTrialPurchaseUpdate(), true);
	 }
	 
	 
	 
	 @Test(priority=187)
	 public void checkSelectingApplyRateSchemesInInventoryOptionsTabInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSelectingApplyRateSchemesInInventoryOptionsTabInTrialPurchaseUpdate(), true);
	 }
	 
	 @Test(priority=188)
	 public void checkUnSelectingApplyRateSchemesInInventoryOptionsTabInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUnSelectingApplyRateSchemesInInventoryOptionsTabInTrialPurchaseUpdate(), true);
	 }
	 
	 
	 
	 @Test(priority=189)
	 public void checkAddFieldInEditLayoutHeaderInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkAddFieldInEditLayoutHeaderInTrialPurchaseUpdate(), true);
	 }
	 
	 @Test(priority=190)
	 public void checkEditFieldInEditLayoutHeaderInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditFieldInEditLayoutHeaderInTrialPurchaseUpdate(), true);
	 }
	 
	 @Test(priority=191)
	 public void checkDeleteFieldInEditLayoutHeaderInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteFieldInEditLayoutHeaderInTrialPurchaseUpdate(), true);
	 }
	 
	 
	 
	 @Test(priority=192)
	 public void checkAddFieldInEditLayoutBodyInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkAddFieldInEditLayoutBodyInTrialPurchaseUpdate(), true);
	 }
	 
	 @Test(priority=193)
	 public void checkEditFieldInEditLayoutBodyInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditFieldInEditLayoutBodyInTrialPurchaseUpdate(), true);
	 }
	 
	 @Test(priority=194)
	 public void checkDeleteFieldInEditLayoutBodyInTrialPurchaseUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteFieldInEditLayoutBodyInTrialPurchaseUpdate(), true);
	 }
	 
	 
	 
	 @Test(priority=195)
	 public void checkSavingViewInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingViewInTrialVoucherUpdate(), true);
	 }
	 
	 @Test(priority=196)
	 public void checkEditingViewInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingViewInTrialVoucherUpdate(), true);
	 }
	 
	 @Test(priority=197)
	 public void checkDeletingViewInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingViewInTrialVoucherUpdate(), true);
	 }
	 
	 
	 
	 
	 
	 @Test(priority=198)
	 public void checkSavingTriggerInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingTriggerInTrialVoucherUpdate(), true);
	 }
	 
	 @Test(priority=199)
	 public void checkEditingTriggerInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingTriggerInTrialVoucherUpdate(), true);
	 }
	 
	 @Test(priority=200)
	 public void checkDeletingTriggerInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingTriggerInTrialVoucherUpdate(), true);
	 }
	 
	 
	 
	 
	 
	 @Test(priority=201)
	 public void checkSavingDocumentNumberingInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingDocumentNumberingInTrialVoucherUpdate(), true);
	 }
	 
	 @Test(priority=202)
	 public void checkEditingDocumentNumberingInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingDocumentNumberingInTrialVoucherUpdate(), true);
	 }
	 
	 @Test(priority=203)
	 public void checkDeletingDocumentNumberingInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingDocumentNumberingInTrialVoucherUpdate(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=204)
	 public void checkSavingRuleInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingRuleInTrialVoucherUpdate(), true);
	 }
	 
	 @Test(priority=205)
	 public void checkEditingRuleInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingRuleInTrialVoucherUpdate(), true);
	 }
	 
	 @Test(priority=206)
	 public void checkDeletingRuleInTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingRuleInTrialVoucherUpdate(), true);
	 }
	  
	 @Test(priority=207)
	 public void checkDeletingTrialVoucherUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingTrialVoucherUpdate(), true);
	 }
	
	 
	 
	 
	 @Test(priority=208)
	 public void checkSavingTransactionAuthorizationInPurchaseReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingTransactionAuthorizationInPurchaseReturns(), true);
	 }
	 
	 @Test(priority=209)
	 public void checkEditingTransactionAuthorizationInPurchaseReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingTransactionAuthorizationInPurchaseReturns(), true);
	 }
	 
	 @Test(priority=210)
	 public void checkDeletingTransactionAuthorizationInPurchaseReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingTransactionAuthorizationInPurchaseReturns(), true);
	 } 
	 
	 
	 
	 
	 @Test(priority=211)
	 public void checkSavingMasterAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingMasterAuthorization(), true);
	 }
	 
	 @Test(priority=212)
	 public void checkEditingMasterAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingMasterAuthorization(), true);
	 }
	 
	 @Test(priority=213)
	 public void checkDeletingMasterAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingMasterAuthorization(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=214)
	 public void checkSavingTestWorkFlow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingTestWorkFlow(), true);
	 }
	 
	 @Test(priority=215)
	 public void checkEditingSavedTestWorkFlow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingSavedTestWorkFlow(), true);
	 }
	 
	 @Test(priority=216)
	 public void checkDeletingTestWorkFlow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingTestWorkFlow(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=217)
	 public void checkStandardRateDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkStandardRateDeleteOption(), true);
	 }
	 
	 @Test(priority=218)
	 public void checkSavingStandardRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingStandardRate(), true);
	 }
	 
	 @Test(priority=219)
	 public void checkEditingStandardRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingStandardRate(), true);
	 }
	  
	 
	 
	 
	 
	 
	 @Test(priority=220)
	 public void checkSavingOpeningStockVoucher1WithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningStockVoucher1WithBatchItem(), true);
	 }
	 
	 @Test(priority=221)
	 public void checkEditingAndVerifingDataOfSavedOpeningStocksVoucher1AddingRow2WithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingAndVerifingDataOfSavedOpeningStocksVoucher1AddingRow2WithBatchItem(), true);
	 }
	 
	 @Test(priority=222)
	 public void checkEditingAndVerifingDataOfSavedOpeningStocksVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingAndVerifingDataOfSavedOpeningStocksVoucher1(), true);
	 }
	 
	 @Test(priority=223)
	 public void checkSavingOpeningStockVoucher2WithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningStockVoucher2WithBatchItem(), true);
	 }
	 
	 @Test(priority=224)
	 public void checkVerifingDataOfSavedOpeningStocksVoucher2AndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifingDataOfSavedOpeningStocksVoucher2AndDeleting(), true);
	 }
	 
	 



	 
	 @Test(priority=225)
	 public void checkSavingOpeningStockVoucher2WithStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningStockVoucher2WithStockItem(), true);
	 }
	 
	 @Test(priority=226)
	 public void checkEditingAndVerifingDataOfSavedOpeningStocksVoucher2AddingRow2WithStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingAndVerifingDataOfSavedOpeningStocksVoucher2AddingRow2WithStockItem(), true);
	 }
	 
	 @Test(priority=227)
	 public void checkEditingAndVerifingDataOfSavedOpeningStocksVoucher2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingAndVerifingDataOfSavedOpeningStocksVoucher2(), true);
	 }
	 
	 @Test(priority=228)
	 public void checkSavingOpeningStockVoucher3WithStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningStockVoucher3WithStockItem(), true);
	 }
	 
	 @Test(priority=229)
	 public void checkVerifingDataOfSavedOpeningStocksVoucher3AndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifingDataOfSavedOpeningStocksVoucher3AndDeleting(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=230)
	 public void checkOpeningStockVoucher3Row1WithBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkOpeningStockVoucher3Row1WithBinItem(), true);
	 }
	 
	 @Test(priority=231)
	 public void checkSavingOpeningStockVoucher3With2RowsAndBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningStockVoucher3With2RowsAndBinItem(), true);
	 }
	 
	 @Test(priority=232)
	 public void checkEditingAndVerifingDataOfSavedOpeningStocksVoucher3AddingRow3WithBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingAndVerifingDataOfSavedOpeningStocksVoucher3AddingRow3WithBinItem(), true);
	 }
	 
	 @Test(priority=233)
	 public void checkVerifingDataOfSavedOpeningStocksVoucher3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifingDataOfSavedOpeningStocksVoucher3(), true);
	 }
	 
	 @Test(priority=234)
	 public void checkSavingOpeningStockVoucher4WithBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningStockVoucher4WithBinItem(), true);
	 }
	 
	 @Test(priority=235)
	 public void checkVerifingDataOfSavedOpeningStocksVoucher4AndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifingDataOfSavedOpeningStocksVoucher4AndDeleting(), true);
	 }
	 
	
	 
	 
	 
	 
	 
	 @Test(priority=236)
	 public void checkSavingOpeningStockVoucher4WithRMAItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningStockVoucher4WithRMAItem(), true);
	 }
	 
	 @Test(priority=237)
	 public void checkEditingAndVerifingDataOfSavedOpeningStocksVoucher4AddingRow2WithRMAItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingAndVerifingDataOfSavedOpeningStocksVoucher4AddingRow2WithRMAItem(), true);
	 }
	 
	 @Test(priority=238)
	 public void checkEditingAndVerifingDataOfSavedOpeningStocksVoucher4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingAndVerifingDataOfSavedOpeningStocksVoucher4(), true);
	 }
	 
	 @Test(priority=239)
	 public void checkSavingOpeningStockVoucher5WithRMAItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningStockVoucher5WithRMAItem(), true);
	 }
	 
	 @Test(priority=240)
	 public void checkVerifingDataOfSavedOpeningStocksVoucher5AndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifingDataOfSavedOpeningStocksVoucher5AndDeleting(), true);
	 }
	 
	 
	 
	 
	 
	 
	 @Test(priority=241)
	 public void checkSavingOpeningBalanceVoucher1WithCurrencyAsINR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningBalanceVoucher1WithCurrencyAsINR(), true);
	 }
	 
	 @Test(priority=242)
	 public void checkVerifyAndDeleteOpeningBalanceVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyAndDeleteOpeningBalanceVoucher1(), true);
	 }
	 
	 @Test(priority=243)
	 public void checkSavingOpeningBalanceVoucher1WithCurrencyAsAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingOpeningBalanceVoucher1WithCurrencyAsAED(), true);
	 }
	 
	 @Test(priority=244)
	 public void checkVerifyAndEditOpeningBalanceVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyAndEditOpeningBalanceVoucher1(), true);
	 }
	
	 
	 
	  
	 
	 
	 
	 
	 
	 @Test(priority=245)
	 public void checkSavingMaterialRequisitionVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingMaterialRequisitionVoucher1(), true);
	 }
	 
	 @Test(priority=246)
	 public void checkVerifyingAndDeletingMaterialRequisitionVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingAndDeletingMaterialRequisitionVoucher1(), true);
	 }
	 
	 @Test(priority=247)
	 public void checkReSavingMaterialRequisitionVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkReSavingMaterialRequisitionVoucher1(), true);
	 }
	 
	 @Test(priority=248)
	 public void checkVerifyingAndUpdatingMaterialRequisitionVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingAndUpdatingMaterialRequisitionVoucher1(), true);
	 }
	 
	 @Test(priority=249)
	 public void checkVerifyingMaterialRequisitionVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingMaterialRequisitionVoucher1(), true);
	 }
	 
	 @Test(priority=250)
	 public void checkPurchasesOrderVoucherToDisplayLinksWithoutAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkPurchasesOrderVoucherToDisplayLinksWithoutAuthorization(), true);
	 }
	 
	 
	 
	 
	 
	 
	 @Test(priority=251)
	 public void checkLogoutAndLoginWithUserAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkLogoutAndLoginWithUserAllOptions(), true);
	 }
	 
	 @Test(priority=252)
	 public void checkAuthorizationInMaterialRequisitionWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkAuthorizationInMaterialRequisitionWithUserAllOptionsST(), true);
	 }
	 
	 @Test(priority=253)
	 public void checkLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkLogoutAndLoginWithSU(), true);
	 }
	 
	 @Test(priority=254)
	 public void checkPurchasesOrderVoucherToDisplayLinksAfterAuthorizationAndSavePurchaseOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkPurchasesOrderVoucherToDisplayLinksAfterAuthorizationAndSavePurchaseOrder(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=255)
	 public void checkLogoutAndLoginWithUserAllOptionsSTToAuthorizePurchaseOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkLogoutAndLoginWithUserAllOptionsSTToAuthorizePurchaseOrder(), true);
	 }
	 
	 @Test(priority=256)
	 public void checkAuthorizationInPurchaseOrderWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkAuthorizationInPurchaseOrderWithUserAllOptionsST(), true);
	 }
	
	 @Test(priority=257)
	 public void checkLogoutAndLoginWithSUForPurchasesVoucherVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkLogoutAndLoginWithSUForPurchasesVoucherVAT(), true);
	 }
	
	 
	 @Test(priority=258)
	 public void checkSavingPurchaseVoucherVATVoucher1WithPurchaseOrderLink() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingPurchaseVoucherVATVoucher1WithPurchaseOrderLink(), true);
	 }
	   
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=259)
	 public void checkSavingPurchaseVoucherVATVoucher2WithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingPurchaseVoucherVATVoucher2WithBatchItem(), true);
	 }
	 
	 @Test(priority=260)
	 public void checkEditingPurchaseVoucherVATVoucher2AddRow2AndUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingPurchaseVoucherVATVoucher2AddRow2AndUpdate(), true);
	 }
	 
	 @Test(priority=261)
	 public void checkVerifyingPurchaseVoucherVATVoucher2SavingVoucher3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingPurchaseVoucherVATVoucher2SavingVoucher3(), true);
	 }
	 
	 @Test(priority=262)
	 public void checkVerifyingAndDeletingPurchaseVoucherVATVoucher3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingAndDeletingPurchaseVoucherVATVoucher3(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=263)
	 public void checkSavingPurchaseVoucherVATVoucher3WithStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingPurchaseVoucherVATVoucher3WithStockItem(), true);
	 }
	 
	 @Test(priority=264)
	 public void checkEditingPurchaseVoucherVATVoucher3AddRow2AndUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingPurchaseVoucherVATVoucher3AddRow2AndUpdate(), true);
	 }
	 
	 @Test(priority=265)
	 public void checkVerifyingPurchaseVoucherVATVoucher3SavingVoucher4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingPurchaseVoucherVATVoucher3SavingVoucher4(), true);
	 }
	 
	 @Test(priority=266)
	 public void checkVerifyingAndDeletingPurchaseVoucherVATVoucher4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingAndDeletingPurchaseVoucherVATVoucher4(), true);
	 }	 
	 
	 
	 
	 
	 
	 
	 
	 @Test(priority=267)
	 public void checkSavingPurchaseVoucherVATVoucher4WithBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingPurchaseVoucherVATVoucher4WithBinItem(), true);
	 }	
	 
	 @Test(priority=268)
	 public void checkSavingPurchaseVoucherVATVoucher4With2RowsAndBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingPurchaseVoucherVATVoucher4With2RowsAndBinItem(), true);
	 }
	 
	 @Test(priority=269)
	 public void checkEditingPurchaseVoucherVATVoucher4AddRow3AndUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingPurchaseVoucherVATVoucher4AddRow3AndUpdate(), true);
	 }
	 
	 @Test(priority=270)
	 public void checkVerifyingPurchaseVoucherVATVoucher4SavingVoucher5() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingPurchaseVoucherVATVoucher4SavingVoucher5(), true);
	 }
	 
	 @Test(priority=271)
	 public void checkVerifyingAndDeletingPurchaseVoucherVATVoucher5() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingAndDeletingPurchaseVoucherVATVoucher5(), true);
	 }
	 
	 
	 
	 
	 
	 @Test(priority=272)
	 public void checkSavingPurchaseVoucherVATVoucher5WithRMAItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingPurchaseVoucherVATVoucher5WithRMAItem(), true);
	 }
	 
	 @Test(priority=273)
	 public void checkEditingPurchaseVoucherVATVoucher5AddRow2AndUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingPurchaseVoucherVATVoucher5AddRow2AndUpdate(), true);
	 }
	 
	 @Test(priority=274)
	 public void checkVerifyingPurchaseVoucherVATVoucher5SavingVoucher6() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingPurchaseVoucherVATVoucher5SavingVoucher6(), true);
	 }
	 
	 @Test(priority=275)
	 public void checkVerifyingAndDeletingPurchaseVoucherVATVoucher6() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingAndDeletingPurchaseVoucherVATVoucher6(), true);
	 }
	 
	 
	 
	 @Test(priority=276)
	 public void checkSavingPaymentVATVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingPaymentVATVoucher1(), true);
	 }
	 
	 @Test(priority=277)
	 public void checkEditingPaymentVATVoucher1AndAdding2ndRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingPaymentVATVoucher1AndAdding2ndRow(), true);
	 }
	 
	 @Test(priority=278)
	 public void checkSavingPaymentVATVoucher2() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingPaymentVATVoucher2(), true);
	 }
	 
	 @Test(priority=279)
	 public void checkVerifyingSavedPaymentVATVoucher2AndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingSavedPaymentVATVoucher2AndDeleting(), true);
	 }
	 
	 
	 
	 @Test(priority=280)
	 public void checkSavingexcessInStocksVoucherWithAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingexcessInStocksVoucherWithAllItems(), true);
	 }
	 
	 @Test(priority=281)
	 public void checkCopyDocumentOptionAndSavingInExcessInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkCopyDocumentOptionAndSavingInExcessInStocks(), true);
	 }
	 
	 @Test(priority=282)
	 public void checkUpdatingSavedVoucherInExcessInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatingSavedVoucherInExcessInStocks(), true);
	 }
	 
	 @Test(priority=283)
	 public void checkDeletingVoucherInExcessInStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingVoucherInExcessInStocks(), true);
	 }
	 
	 
	 
	 @Test(priority=284)
	 public void checkSavingStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingStockTransferVoucher(), true);
	 }
	 
	 @Test(priority=285)
	 public void checkSuspendOptionInSalesOrdersVoucherWithTransferedStock() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSuspendOptionInSalesOrdersVoucherWithTransferedStock(), true);
	 }
	 
	 @Test(priority=286)
	 public void checkSavingVoucherUsingCopyDocumentInStockTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingVoucherUsingCopyDocumentInStockTransfer(), true);
	 }
	 
	 @Test(priority=287)
	 public void checkUpdatingStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkUpdatingStockTransferVoucher(), true);
	 }
	 
	 @Test(priority=288)
	 public void checkDeletingVoucherInStockTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeletingVoucherInStockTransfer(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=289)
	 public void checkSalesOrderVoucherCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesOrderVoucherCustomization(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=290)
	 public void checkSavingSalesOrderVoucher1WithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesOrderVoucher1WithBatchItem(), true);
	 }
	 
	 @Test(priority=291)
	 public void checkEditingSalesOrderVoucher1AndAdding2ndRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingSalesOrderVoucher1AndAdding2ndRow(), true);
	 }
	 
	 @Test(priority=292)
	 public void checkSavingSalesOrderVoucher2WithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesOrderVoucher2WithBatchItem(), true);
	 }
	 
	 @Test(priority=293)
	 public void checkVerifyingSalesOrderVoucher2AndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingSalesOrderVoucher2AndDeleting(), true);
	 }
	 
	 
	 
	 @Test(priority=294)
	 public void checkSavingSalesOrderVoucher2WithStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesOrderVoucher2WithStockItem(), true);
	 }
	 
	 @Test(priority=295)
	 public void checkEditingSalesOrderVoucher2AndAdding2ndRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingSalesOrderVoucher2AndAdding2ndRow(), true);
	 }
	 
	 @Test(priority=296)
	 public void checkSavingSalesOrderVoucher3WithStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesOrderVoucher3WithStockItem(), true);
	 }
	 
	 @Test(priority=297)
	 public void checkVerifyingSalesOrderVoucher3AndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingSalesOrderVoucher3AndDeleting(), true);
	 }
	 
	 
	 @Test(priority=298)
	 public void checkSavingSalesOrderVoucherWithBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesOrderVoucherWithBinItem(), true);
	 }
	 
	 
	 @Test(priority=299)
	 public void checkEditingSalesOrderVoucher3AndAdding2ndRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingSalesOrderVoucher3AndAdding2ndRow(), true);
	 }
	 
	 
	 @Test(priority=300)
	 public void checkSavingSalesOrderVoucher4WithBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesOrderVoucher4WithBinItem(), true);
	 }
	 
	 @Test(priority=301)
	 public void checkVerifyingSalesOrderVoucher4AndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingSalesOrderVoucher4AndDeleting(), true);
	 }
	 
	 
	 
	 @Test(priority=302)
	 public void checkSavingSalesOrderVoucherWithRmaItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesOrderVoucherWithRmaItem(), true);
	 }
	 
	 
	 @Test(priority=303)
	 public void checkEditingSalesOrderVoucher4AndAdding2ndRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkEditingSalesOrderVoucher4AndAdding2ndRow(), true);
	 }
	 
	 @Test(priority=304)
	 public void checkSavingSalesOrderVoucher5WithRmaItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesOrderVoucher5WithRmaItem(), true);
	 }
	 
	 @Test(priority=305)
	 public void checkVerifyingSalesOrderVoucher5AndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkVerifyingSalesOrderVoucher5AndDeleting(), true);
	 }
	 
	 
	 
	 @Test(priority=306)
	 public void checkLinkMappingInDesignWorkFlowForSales() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkLinkMappingInDesignWorkFlowForSales(), true);
	 }
	 
	 @Test(priority=307)
	 public void checkSalesInvoiceVoucherToCheckLinkPopUpScreenWithCRTlPlusL() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherToCheckLinkPopUpScreenWithCRTlPlusL(), true);
	 }
	 
	 
	 @Test(priority=308)
	 public void checkSalesInvoiceVoucherSearchInLinkPopupScreenAndSaveWithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherSearchInLinkPopupScreenAndSaveWithBatchItem(), true);
	 }
	 
	 @Test(priority=309)
	 public void checkSalesInvoiceVoucherLinewiseConsumingForBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherLinewiseConsumingForBatchItem(), true);
	 }
	 
	 @Test(priority=310)
	 public void checkSuspendOptionInSalesInvoiceEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSuspendOptionInSalesInvoiceEntryPage(), true);
	 }
	 
	 @Test(priority=311)
	 public void checkSalesInvoiceVoucherToCheckBinItemLinkPopUpScreenWithCRTlPlusL() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherToCheckBinItemLinkPopUpScreenWithCRTlPlusL(), true);
	 }
	 
	 @Test(priority=312)
	 public void checkSalesInvoiceVoucherLinewiseConsumingForBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherLinewiseConsumingForBinItem(), true);
	 }
	 
	 @Test(priority=313)
	 public void checkSuspendOptionInSalesInvoiceHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSuspendOptionInSalesInvoiceHomePage(), true);
	 }
	 
	 @Test(priority=314)
	 public void checkSalesInvoiceVoucherToCheckRMAItemLinkPopUpScreenWithCRTlPlusL() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherToCheckRMAItemLinkPopUpScreenWithCRTlPlusL(), true);
	 }
	 
	 @Test(priority=315) // Issue
	 public void checkSalesInvoiceVoucherLinewiseConsumingForRmaItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherLinewiseConsumingForRmaItem(), true);
	 }
	 
	 @Test(priority=316)
	 public void checkDeleteOptionInSalesInvoiceEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteOptionInSalesInvoiceEntryPage(), true);
	 }
	 
	 @Test(priority=317)
	 public void checkSalesInvoiceVoucherToCheckStockItemLinkPopUpScreenWithCRTlPlusL() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherToCheckStockItemLinkPopUpScreenWithCRTlPlusL(), true);
	 }
	 
	 @Test(priority=318) // ISSUE
	 public void checkSalesInvoiceVoucherLinewiseConsumingForStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherLinewiseConsumingForStockItem(), true);
	 }
	 
	 @Test(priority=319)
	 public void checkDeleteOptionInSalesInvoiceHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkDeleteOptionInSalesInvoiceHomePage(), true);
	 }
	
	 @Test(priority=320)
	 public void checkSalesInvoiceVoucherSavingSuspenigAndDeletingThroughConvertOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSalesInvoiceVoucherSavingSuspenigAndDeletingThroughConvertOption(), true);
	 }
	 
	 @Test(priority=321)
	 public void checkSavingSalesInvoiceWithhAllItemsOfTransferedStockInSingleVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesInvoiceWithhAllItemsOfTransferedStockInSingleVoucher(), true);
	 }
	 
	 @Test(priority=322)
	 public void checkSavingSalesReturnsVoucherWithConvertOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingSalesReturnsVoucherWithConvertOptions(), true);
	 }
	 */
	 
	 @Test(priority=323)
	 public void checkSavingRecepitsVATVocher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 AUP=new FocusSanityPage(getDriver());
		 Assert.assertEquals(AUP.checkSavingRecepitsVATVocher(), true);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
