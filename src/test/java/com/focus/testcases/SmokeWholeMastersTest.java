package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokeDocCustViewPage;
import com.focus.Pages.SmokeWholeMastersPage;

import com.focus.base.BaseEngine;


 public class SmokeWholeMastersTest extends BaseEngine
 {
	 private static SmokeWholeMastersPage stcmp;
	 
	 @Test(priority=500000)
	 public void checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 stcmp=new SmokeWholeMastersPage(getDriver());		  
		 Assert.assertEquals(stcmp.checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage(), true);
	 }	  

	 @Test(priority=500001)
	 public void checkHomeMenuSubMenuOnClickHomeMenuToDisplaySubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 stcmp=new SmokeWholeMastersPage(getDriver());		  
		 Assert.assertEquals(stcmp.checkHomeMenuSubMenuOnClickHomeMenuToDisplaySubMenus(), true);
	 }
	 
	
	 @Test(priority=500002)
	 public void checkMastersMenuSubMenuOnClickMasterMenuToDisplaySubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkMastersMenuSubMenuOnClickMasterMenuToDisplaySubMenus(), true);
	 }
	 
	 @Test(priority=500003)
	 public void checkAccountsMastersPageOnClickOnAccountsMenuFromMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkAccountsMastersPageOnClickOnAccountsMenuFromMastersMenu(), true);
	 }
	 
	 @Test(priority=500004)
	 public void checkMainOptionsAvailabilityInAccountMastersPageOnClickOnAccountsFromMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkMainOptionsAvailabilityInAccountMastersPageOnClickOnAccountsFromMastersMenu(), true);
	 }
	 
	 @Test(priority=500005)
	 public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500006)
	 public void checkOtherToolsOptionsAvailabilityInAccountMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkOtherToolsOptionsAvailabilityInAccountMastersPageOnClickRibbonControlNextButton(), true);
	 }
	 
	 @Test(priority=500007)
	 public void checkTreeViewOptionsAvailableInAccountMastersPageOnClickOnAccountsFromMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkTreeViewOptionsAvailableInAccountMastersPageOnClickOnAccountsFromMastersMenu(), true);
	 }
	 
	 @Test(priority=500008)
	 public void checkDisplayOfGroupAvailableTreeStructureLeftPaneInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkDisplayOfGroupAvailableTreeStructureLeftPaneInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500009)
	 public void checkCreateTreeToggleOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkCreateTreeToggleOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500010)
	 public void checkCreateViewToggleOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkCreateViewToggleOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500011)
	 public void checkHideAccountGroupOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkHideAccountGroupOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500012)
	 public void checkUnHideAccountGroupOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkUnHideAccountGroupOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 
	 @Test(priority=500013)
	 public void checkHeaderFieldsOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkHeaderFieldsOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500014)
	 public void checkSearchOptionAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSearchOptionAvailableInAccountMastersPage(), true);
	 }
	 
	 
	 @Test(priority=500015)
	 public void checkAccountsDisplayTableColumnNamesAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkAccountsDisplayTableColumnNamesAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500016)
	 public void checkAccountsDisplayTableColumnValuesAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkAccountsDisplayTableColumnValuesAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500017)
	 public void checkAccountsCreationPageAndGeneralTabFieldsAvailabilityOnClickOnNewButtonInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkAccountsCreationPageAndGeneralTabFieldsAvailabilityOnClickOnNewButtonInAccountsMasterPage(), true);
	 }
	 	
	 @Test(priority=500018)
	 public void checkSettingTabFieldsAvailabilityOnClickOnSettingsTabInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSettingTabFieldsAvailabilityOnClickOnSettingsTabInAccountsMasterCreationPage(), true);
	 }
	 
	 @Test(priority=500019)
	 public void checkDetailsTabFieldsAvailabilityOnClickOnDetailsTabInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkDetailsTabFieldsAvailabilityOnClickOnDetailsTabInAccountsMasterCreationPage(), true);
	 }
	 
	 @Test(priority=500020)
	 public void checkPrintLayoutTabFieldsAvailabilityOnClickOnPrintLayoutTabInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkPrintLayoutTabFieldsAvailabilityOnClickOnPrintLayoutTabInAccountsMasterCreationPage(), true);
	 }
	 
	
	 @Test(priority=500024)
	 public void checkAccountSaveOnInputAndClickOnSaveButtonInMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkAccountSaveOnInputAndClickOnSaveButtonInMasterCreationPage(), true);
	 }
	 
	 @Test(priority=500025)
	 public void checkCloseAccountsCreationPageOnClickOnCloseButtonInAccountsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkCloseAccountsCreationPageOnClickOnCloseButtonInAccountsCreationPage(), true);
	 }

	 @Test(priority=500026)
	 public void checkClickOnAccountSavedCheckBoxToCheckInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnAccountSavedCheckBoxToCheckInAccountsMasterPage(), true);
	 }
	 
	 @Test(priority=500027)
	 public void checkAccountMasterSavedInfomationDetailsOnClickOnEditInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkAccountMasterSavedInfomationDetailsOnClickOnEditInAccountsMasterPage(), true);
	 }
	 
	 @Test(priority=500028)
	 public void checkUpdatingAccountInformationOnClickSaveButtonInAccountsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkUpdatingAccountInformationOnClickSaveButtonInAccountsCreationPage(), true);
	 }
	 
	 @Test(priority=500029)
	 public void checkAccountUpdatedInformationDisplayInMasterDisplayTableOfMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkAccountUpdatedInformationDisplayInMasterDisplayTableOfMastersPage(), true);
	 }
	 
	 @Test(priority=500030)
	 public void checkClickOnSavedAccountCheckBoxToUnCheckInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnSavedAccountCheckBoxToUnCheckInAccountsMasterPage(), true);
	 }
	 
	 @Test(priority=500031)
	 public void checkUpdateAcountInformationForUpdateAccountInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkUpdateAcountInformationForUpdateAccountInAccountsMasterPage(), true);
	 }
	 
	 @Test(priority=500032)
	 public void checkSeclectAccountAndDeleteOptionInMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSeclectAccountAndDeleteOptionInMasterPage(), true);
	 }
	 
	 
	 @Test(priority=500033)
	 public void checkDeleteAccountMasterNotDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkDeleteAccountMasterNotDisplayInAccountGrid(), true);
	 }
	 	
	 
	 @Test(priority=500036)
	 public void checkClickOnCloseButtonInAccountMasterToCloseAccountsPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnCloseButtonInAccountMasterToCloseAccountsPage(), true);
	 }
	 
	 
	 //CURRENCY MATER PAGE STARTS
	 
     @Test(priority=500037) 
	 public void checkCurrencyMenuSubMenuBySelectingMastersFromHomeMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkCurrencyMenuSubMenuBySelectingMastersFromHomeMenu(), true);
	 }
	 
	 @Test(priority=500038)
	 public void checkClickOnCurrencyMasterMenuToDisplayCurrencyPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnCurrencyMasterMenuToDisplayCurrencyPage(), true);
	 }
	 
	 @Test(priority=500039)
	 public void checkSaveOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSaveOptionInCurrencyMaster(), true);
	 }
	 
	 @Test(priority=500040)
	 public void checkCurrencyUpdateInformationInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkCurrencyUpdateInformationInCurrencyMaster(), true);
	 }
	 
	 @Test(priority=500041)
	 public void checkClickOnExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnExchangeRateOptionInCurrencyMaster(), true);
	 }
	 
	 @Test(priority=500042)
	 public void checkSaveExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSaveExchangeRateOfCurrencyMaster(), true);
	 }
	
	 @Test(priority=500043)
	 public void checkValuesInSavedExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkValuesInSavedExchangeRateOptionInCurrencyMaster(), true);
	 }
	

	 
	 @Test(priority=500044)
	 public void checkValuesInUpdatedExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkValuesInUpdatedExchangeRateOptionInCurrencyMaster(), true);
	 }
	 
	 
	 @Test(priority=500045)
	 public void checkClickOnClearToClearValuesInExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnClearToClearValuesInExchangeRateOptionInCurrencyMaster(), true);
	 }
	 
	 @Test(priority=500046)
	 public void checkCancelOptionSaveExchangeRateInExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkCancelOptionSaveExchangeRateInExchangeRateOptionInCurrencyMaster(), true);
	 }
	 

	 @Test(priority=500047)
	 public void checkClickOnCancelButtonInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnCancelButtonInCurrencyMaster(), true);
	 } 
    

	 
	  //Exchange Rate Page Starts
	  
	  @Test(priority=500053)
	  public void checkClickOnExchangeRateFromCurrecnyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnExchangeRateFromCurrecnyMenu(), true);
	  }
	 
	  @Test(priority=500054)
	  public void checkValuesInSavedExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkValuesInSavedExchangeRate(), true);
	  }
	  
	  @Test(priority=500055)
	  public void checkClickOnClearToClearValuesInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnClearToClearValuesInExchangeRate(), true);
	  }
	  
	  @Test(priority=500056)
	  public void checkSaveExchangeRateBaseCurrencyUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSaveExchangeRateBaseCurrencyUSD(), true);
	  }
	  
	  @Test(priority=500057)
	  public void checkUSDValuesInSavedExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkUSDValuesInSavedExchangeRate(), true);
	  }
	  
	  @Test(priority=500058)
	  public void checkDeleteRowInUSDExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkDeleteRowInUSDExchangeRate(), true);
	  }
	 
	  
	  @Test(priority=500059)
	  public void checkUSDUpdatedWithRowDeleteValuesInSavedExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkUSDUpdatedWithRowDeleteValuesInSavedExchangeRate(), true);
	  }
	  
	  @Test(priority=500060)
	  public void checkDeleteOptionWithYesInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkDeleteOptionWithYesInExchangeRate(), true);
	  }
	  
	  
	  
	  @Test(priority=500061)
	  public void checkDeletedCurrencyValuesIsDisplayInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkDeletedCurrencyValuesIsDisplayInExchangeRate(), true);
	  }
	  
	  
	  @Test(priority=500062)
	  public void checkSaveAEDExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSaveAEDExchangeRate(), true);
	  }
	 
	  @Test(priority=500063)
	  public void checkSavedCurrencyValuesAfterDeleteAndInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSavedCurrencyValuesAfterDeleteAndInput(), true);
	  }
	
	  
	  @Test(priority=500064)
	  public void checkClickOnImportFromExcelToDisplayImportScreenInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnImportFromExcelToDisplayImportScreenInExchangeRate(), true);
	  }
	  
	  @Test(priority=500065)
	  public void checkClickOnImportDataInImportFromExcelPageOfExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkClickOnImportDataInImportFromExcelPageOfExchangeRate(), true);
	  }
	  
	  @Test(priority=500066)
	  public void checkSelectColumnsMappingInImportScreenOfExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSelectColumnsMappingInImportScreenOfExchangeRate(), true);
	  }
	 
	  @Test(priority=500067)
	  public void checkSelectSheetAndClickOnOkButtonInSelectSheetScreenOfExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkSelectSheetAndClickOnOkButtonInSelectSheetScreenOfExchangeRate(), true);
	  }
	  
	  @Test(priority=500068)
	  public void checkImportedValuesFirstInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkImportedValuesFirstInExchangeRate(), true);
	  }
	    
	  //Check Row Delete for Two Rows, Input Data and Save
	  @Test(priority=500069)
	  public void checkImportedValuesSecondInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkImportedValuesSecondInExchangeRate(), true);
	  }
	  
	  @Test(priority=500070)
	  public void checkCancelOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkCancelOptionInExchangeRate(), true);
	  }
	  
	
	  
	 
   //Exchange Rate History Page
  
   @Test(priority=500071)
   public void checkClickOnExchangeRateHistoryMenuFromCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	 stcmp=new SmokeWholeMastersPage(getDriver());		  
	  Assert.assertEquals(stcmp.checkClickOnExchangeRateHistoryMenuFromCurrency(), true);
   }
	  
   @Test(priority=500072)
   public void checkExchangeRateHistoryClearButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());		   
	  Assert.assertEquals(stcmp.checkExchangeRateHistoryClearButton(), true);
   }
	  
   @Test(priority=500073)
   public void checkExchangeRateHistorySelectAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());		   
	  Assert.assertEquals(stcmp.checkExchangeRateHistorySelectAED(), true);
   }
	  
   @Test(priority=500074)
   public void checkCancelOptionInExchangeRateHistory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCancelOptionInExchangeRateHistory(), true);
   }
	
   

  // UNITS MASTER PAGE
	 
   @Test(priority=500075)
   public void checkUnitsMasterPageIsDisplayByClickOnUnitsMenuFromItemMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnitsMasterPageIsDisplayByClickOnUnitsMenuFromItemMenu(), true);
   } 
   
   
   @Test(priority=500076)
   public void checkMainOptionsAvailabilityInUnitsMastersPageOnClickOnUnitsFromItemMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkMainOptionsAvailabilityInUnitsMastersPageOnClickOnUnitsFromItemMastersMenu(), true);
   } 
   
   @Test(priority=500077)
   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInUnitsMastersPage(), true);
   } 
  
   
   @Test(priority=500078)
   public void checkOtherToolsOptionsAvailabilityInUnitsMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkOtherToolsOptionsAvailabilityInUnitsMastersPageOnClickRibbonControlNextButton(), true);
   } 
   
   
   @Test(priority=500079)
   public void checkTreeViewOptionsAvailableInUnitsMastersPageOnClickOnUnitsFromMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkTreeViewOptionsAvailableInUnitsMastersPageOnClickOnUnitsFromMastersMenu(), true);
   } 
   
   @Test(priority=500080)
   public void checkDisplayOfGroupAvailableTreeStructureLeftPaneInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDisplayOfGroupAvailableTreeStructureLeftPaneInUnitsMastersPage(), true);
   } 
   
   @Test(priority=500081)
   public void checkCreateTreeToggleOptionsAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateTreeToggleOptionsAvailableInUnitsMastersPage(), true);
   } 
   
   
   @Test(priority=500082)
   public void checkCreateViewToggleOptionsAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateViewToggleOptionsAvailableInUnitsMastersPage(), true);
   } 
   
   @Test(priority=500083)
   public void checkHideUnitGroupOptionsAvailableInUnitMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHideUnitGroupOptionsAvailableInUnitMastersPage(), true);
   } 
   
   @Test(priority=500084)
   public void checkUnHideUnitsGroupOptionsAvailableInUnitMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnHideUnitsGroupOptionsAvailableInUnitMastersPage(), true);
   } 
	 
   @Test(priority=500085)
   public void checkHeaderFieldsOptionsAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHeaderFieldsOptionsAvailableInUnitsMastersPage(), true);
   } 
   
   
   @Test(priority=500086)
   public void checkSearchOptionAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSearchOptionAvailableInUnitsMastersPage(), true);
   } 
   
   @Test(priority=500087)
   public void checkUnitsDisplayTableColumnNamesAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnitsDisplayTableColumnNamesAvailableInUnitsMastersPage(), true);
   } 
   
   
   @Test(priority=500088)
   public void checkUnitsDisplayTableColumnValuesAvailableInUnitMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnitsDisplayTableColumnValuesAvailableInUnitMastersPage(), true);
   } 
   
   @Test(priority=500089)
   public void checkClickOnNewButtonInUnitsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnNewButtonInUnitsMasterPage(), true);
   } 
   
   @Test(priority=500090)
   public void checkInputNameCodeNoOfDecimalsAndClickOnSaveButtonInUnitsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkInputNameCodeNoOfDecimalsAndClickOnSaveButtonInUnitsCreationPage(), true);
   } 
   
   @Test(priority=500091)
   public void checkUnitsCreationAndClickOnCloseButtonToDisplayCreatedUnitsInDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnitsCreationAndClickOnCloseButtonToDisplayCreatedUnitsInDisplayGrid(), true);
   } 
   
   @Test(priority=500092)
   public void checkSearchUnitsAndClickOnEditToDisplayUnitsSavedInformation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSearchUnitsAndClickOnEditToDisplayUnitsSavedInformation(), true);
   } 
   
   @Test(priority=500093)
   public void checkUpdateUnitsOnInputNameCodeAndClickOnSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpdateUnitsOnInputNameCodeAndClickOnSaveButton(), true);
   } 
   
   @Test(priority=500094)
   public void checkUpdateUnitNameInUnitDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpdateUnitNameInUnitDisplayGrid(), true);
   } 
   
   @Test(priority=500095)
   public void checkDeleteUnitsWhichAreDefinedInProductsOnSelectUnitAndClickOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDeleteUnitsWhichAreDefinedInProductsOnSelectUnitAndClickOnDelete(), true);
   } 
   
   @Test(priority=500096)
   public void checkDeletedUnitDisplayInUnitsMainGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDeletedUnitDisplayInUnitsMainGrid(), true);
   } 
   
   
   @Test(priority=500097)
   public void checkDeleteUnitsOnSelectUnitAndClickOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDeleteUnitsOnSelectUnitAndClickOnDelete(), true);
   }
   
   @Test(priority=500098)
   public void checkClicOnCloseButtonToCloseUnitsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClicOnCloseButtonToCloseUnitsMaster(), true);
   }
   
   
   // UNITS CONVERSION PAGE
   
    @Test(priority=500099)
   public void checkClickOnUnitsConversionMenuFromItemMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnUnitsConversionMenuFromItemMenu(), true);
   } 
   
   
   @Test(priority=500100)
   public void checkClickOnSaveWithAllInputsInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnSaveWithAllInputsInUnitsConversion(), true);
   } 
   
   @Test(priority=500101)
   public void checkUnitConversionSaveInformationAndUpdateButtonWithAllInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnitConversionSaveInformationAndUpdateButtonWithAllInputs(), true);
   } 
   
  @Test(priority=500102)
   public void checkUpdatedConversionValueDisplayUserModifyAndSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpdatedConversionValueDisplayUserModifyAndSave(), true);
   } 
   
 
   @Test(priority=500103)
   public void checkClickOnClearButtonToClearTheFiledsInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnClearButtonToClearTheFiledsInUnitsConversion(), true);
   }

   
   @Test(priority=500105)
   public void checkPreviousConversionIsDeletingOnClickOnDeleteOptionInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkPreviousConversionIsDeletingOnClickOnDeleteOptionInUnitsConversion(), true);
   } 
   
   @Test(priority=500106)
   public void checkTheConversionValuesDeletedIsDisplayingInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkTheConversionValuesDeletedIsDisplayingInUnitsConversion(), true);
   } 
   
   @Test(priority=500107)
   public void checkClickOnClearButtonToClearOnFirstTheFiledsInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnClearButtonToClearOnFirstTheFiledsInUnitsConversion(), true);
   } 
  
   @Test(priority=500108)
   public void checkSaveUnitsConversionOfOtherBaseUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveUnitsConversionOfOtherBaseUnit(), true);
   }
   
   @Test(priority=500109)
   public void checkClickOnCancelToCloseUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnCancelToCloseUnitsConversion(), true);
   }
  
 
   

	 
	 //ITEM MASTER PAGE
   
   @Test(priority=500110)
   public void checkClickOnItemFromItemMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnItemFromItemMenu(), true);
   } 
   
 
   @Test(priority=500111)
   public void checkToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu(), true);
   } 
   
   @Test(priority=500112)
   public void checkOtherToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkOtherToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu(), true);
   } 
	   
   @Test(priority=500113)
   public void checkTreeViewOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkTreeViewOptionsAvailableInItemMastersPage(), true);
   } 
   
   @Test(priority=500114)
   public void checkDisplayOfGroupAvailableTreeStructureLeftPaneInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDisplayOfGroupAvailableTreeStructureLeftPaneInItemMastersPage(), true);
   } 
   
   @Test(priority=500115)
   public void checkCreateTreeToggleOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateTreeToggleOptionsAvailableInItemMastersPage(), true);
   } 
  
   @Test(priority=500116)
   public void checkCreateViewToggleOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateViewToggleOptionsAvailableInItemMastersPage(), true);
   } 
	   
   @Test(priority=500117)
   public void checkHideUnitGroupOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHideUnitGroupOptionsAvailableInItemMastersPage(), true);
   } 
   
   @Test(priority=500118)
   public void checkUnHideUnitsGroupOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnHideUnitsGroupOptionsAvailableInItemMastersPage(), true);
   } 
   
   @Test(priority=500119)
   public void checkHeaderFieldsOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHeaderFieldsOptionsAvailableInItemMastersPage(), true);
   } 
   
   @Test(priority=500120)
   public void checkSearchOptionAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSearchOptionAvailableInItemMastersPage(), true);
   } 
	   
  
   @Test(priority=500121)
   public void checkItemDisplayTableColumnNamesAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkItemDisplayTableColumnNamesAvailableInItemMastersPage(), true);
   } 
  
   @Test(priority=500122)
   public void checkItemDisplayTableColumnValuesAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkItemDisplayTableColumnValuesAvailableInItemMastersPage(), true);
   } 
	   
   @Test(priority=500123)
   public void checkNewButtonOnClickToDisplayItemCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkNewButtonOnClickToDisplayItemCreationPage(), true);
   } 
   
   @Test(priority=500124)
   public void checkGeneralTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkGeneralTabInItemMasterCreationPage(), true);
   } 
  
   @Test(priority=500125)
   public void checkUnitsTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnitsTabInItemMasterCreationPage(), true);
   } 
  
   @Test(priority=500126)
   public void checkSettingTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSettingTabInItemMasterCreationPage(), true);
   } 
	   
   @Test(priority=500127)
   public void checkClassificationTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClassificationTabInItemMasterCreationPage(), true);
   } 
 
   @Test(priority=500128)
   public void checkOtherDeailsTabInMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkOtherDeailsTabInMasterCreationPage(), true);
   } 
  
   @Test(priority=500129)
   public void checkReplenishmentTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkReplenishmentTabInItemMasterCreationPage(), true);
   } 
   
   @Test(priority=500130)
   public void checkOutletTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkOutletTabInItemMasterCreationPage(), true);
   } 
	  
   
   @Test(priority=500132)
   public void checkSaveButtonByInputInProductCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveButtonByInputInProductCreationPage(), true);
   } 
   
   @Test(priority=500133)
   public void checkClickOnCloseAndCreatedMasterItemDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnCloseAndCreatedMasterItemDisplayInGrid(), true);
   } 
  
   @Test(priority=500134)
   public void checkCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster(), true);
   }
   
   @Test(priority=500135)
   public void checkEditOptionForNewlyCreatedItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkEditOptionForNewlyCreatedItem(), true);
   }
   
   @Test(priority=500136)
   public void checkUnCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster(), true);
   }
  
   @Test(priority=500137)
   public void checkUpdatedItemInformation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpdatedItemInformation(), true);
   }
  
   @Test(priority=500138)
   public void checkDeleteItemFromItemMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDeleteItemFromItemMasterPage(), true);
   }
  
   @Test(priority=500139)
   public void checkDeleteItemDisplayInMasterDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDeleteItemDisplayInMasterDisplay(), true);
   }
  
   @Test(priority=500140)
   public void checkItemsAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkItemsAddGroupButton(), true);
   }
   
   @Test(priority=500141)
   public void checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption(), true);
   }
   
   @Test(priority=500142)
   public void checkItemAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkItemAddGroupCreationScreenAfterSaving(), true);
   }
   
   @Test(priority=500143)
   public void checkEditOptionForItemGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkEditOptionForItemGroup(), true);
   }
   
   @Test(priority=500144)
   public void checkUpateForGroupItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpateForGroupItem(), true);
   }
  
   @Test(priority=500145)
   public void checkSaveOnUpdateItemGroupDisplayInItemGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveOnUpdateItemGroupDisplayInItemGrid(), true);
   }
  
   @Test(priority=500146)
   public void checkClickOnGroupItemToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnGroupItemToDisplayEmpty(), true);
   }
  
   
   @Test(priority=500147)
   public void checkSaveItemInItemGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveItemInItemGroup(), true);
   }
   
   @Test(priority=500148)
   public void checkCloseOptionInItemCreationInItemCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCloseOptionInItemCreationInItemCreation(), true);
   }  
   
   @Test(priority=500149)
   public void checkItemFirstLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkItemFirstLevel(), true);
   }
 
   @Test(priority=500150)
   public void checkCloseItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCloseItemMaster(), true);
   }
 
 
	 
	 
	 
	 
	 
	 
	  //BIN MASTER PAGE
	 
	   @Test(priority=500186)
	   public void checkBinsMasterPageIsDisplayByClickOnBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkBinsMasterPageIsDisplayByClickOnBinsMenu(), true);
	   }
	   
	   @Test(priority=500187)
	   public void checkMainOptionsAvailabilityInBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkMainOptionsAvailabilityInBinsMasterPage(), true);
	   }
	   
	   @Test(priority=500188)
	   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInBinsMastersPage(), true);
	   }
	    
	   @Test(priority=500189)
	   public void checkOtherToolsOptionsAvailabilityInBinsMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   { 
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkOtherToolsOptionsAvailabilityInBinsMastersPageOnClickRibbonControlNextButton(), true);
	   }
	   
	   @Test(priority=500190)
	   public void checkTreeViewOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkTreeViewOptionsAvailableInBinsMastersPage(), true);
	   }
	  
	   @Test(priority=500191)
	   public void checkDisplayOfGroupAvailableTreeStructureLeftPageBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDisplayOfGroupAvailableTreeStructureLeftPageBinsMasterPage(), true);
	   }
	  
	  
	   @Test(priority=500192)
	   public void checkCreateTreeToggleOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCreateTreeToggleOptionsAvailableInBinsMastersPage(), true);
	   }
	   
	   @Test(priority=500193)
	   public void checkCreateViewToggleOptionsAvailableBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCreateViewToggleOptionsAvailableBinsMastersPage(), true);
	   }
	   
	   
	   @Test(priority=500194)
	   public void checkHideUnitGroupOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkHideUnitGroupOptionsAvailableInBinsMastersPage(), true);
	   }
	   
	   
	   @Test(priority=500195)
	   public void checkUnHideUnitsGroupOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkUnHideUnitsGroupOptionsAvailableInBinsMastersPage(), true);
	   }
	   
	   @Test(priority=500196)
	   public void checkHeaderFieldsOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkHeaderFieldsOptionsAvailableInBinsMastersPage(), true);
	   }
	   
	   @Test(priority=500197)
	   public void checkSearchOptionAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSearchOptionAvailableInBinsMastersPage(), true);
	   }

	   @Test(priority=500198)
	   public void checkBinsMastersDisplayTableColumnNamesAvailableInBinstMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkBinsMastersDisplayTableColumnNamesAvailableInBinstMastersPage(), true);
	   }
	  
	   @Test(priority=500200)
	   public void checkClickOnNewButtonInBinGroups() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkClickOnNewButtonInBinGroups(), true);
	   }
	  
	   @Test(priority=500201)
	   public void checkSaveBinCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSaveBinCreation(), true);
	   }
	  
	   @Test(priority=500202)
	   public void checkCloseButtonBinsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCloseButtonBinsCreationPage(), true);
	   }
	  
	   
	   @Test(priority=500203)
	   public void checkEditOptionForNewlyCreateBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkEditOptionForNewlyCreateBins(), true);
	   }
	   
	   
	   @Test(priority=500204)
	   public void checkSaveByUpdatingNameCodeTypeInBinsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSaveByUpdatingNameCodeTypeInBinsCreationPage(), true);
	   }
	   
	   @Test(priority=500205)
	   public void checkEditOptionForNewlyUpdateBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkEditOptionForNewlyUpdateBins(), true);
	   }
	   
	   @Test(priority=500206)
	   public void checkCloseButtonBinsUpdateCheck() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCloseButtonBinsUpdateCheck(), true);
	   }
	   
	   @Test(priority=500207)
	   public void checkUnCheckingSelectBinsAndCheckUnSelectBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkUnCheckingSelectBinsAndCheckUnSelectBins(), true);
	   }
	   
	   @Test(priority=500208)
	   public void checkDeleteBinsOptionForBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDeleteBinsOptionForBinsMasterPage(), true);
	   }
	   
	   
	   @Test(priority=500209)
	   public void checkSaveBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSaveBin(), true);
	   }
	   
	   
	   @Test(priority=500210)
	   public void checkCloseBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCloseBinsMaster(), true);
	   }

	 

	   
	  
	   //WAREHOUSE MASTER PAGE
	   
	   @Test(priority=500211)
	   public void checkWarehouseMasterPageIsDisplayByClickOnWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkWarehouseMasterPageIsDisplayByClickOnWarehouseMenu(), true);
	   }
	   
	   @Test(priority=500212)
	   public void checkMainOptionsAvailabilityInWarhouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkMainOptionsAvailabilityInWarhouseMasterPage(), true);
	   }
	  
	   @Test(priority=500213)
	   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500214)
	   public void checkOtherToolsOptionsAvailabilityInWarehouseMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkOtherToolsOptionsAvailabilityInWarehouseMastersPageOnClickRibbonControlNextButton(), true);
	   }
	   
	   @Test(priority=500215)
	   public void checkTreeViewOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkTreeViewOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500216)
	   public void checkDisplayOfGroupAvailableTreeStructureLeftPageWarehouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDisplayOfGroupAvailableTreeStructureLeftPageWarehouseMasterPage(), true);
	   }
	   
	   @Test(priority=500217)
	   public void checkCreateTreeToggleOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCreateTreeToggleOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   
	   @Test(priority=500218)
	   public void checkCreateViewToggleOptionsAvailableWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCreateViewToggleOptionsAvailableWarehouseMastersPage(), true);
	   }
	   
	 
	   @Test(priority=500219)
	   public void checkHideUnitGroupOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkHideUnitGroupOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500220)
	   public void checkUnHideUnitsGroupOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkUnHideUnitsGroupOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500221)
	   public void checkHeaderFieldsOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkHeaderFieldsOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500222)
	   public void checkSearchOptionAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSearchOptionAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500223)
	   public void checkWarehouseMastersDisplayTableColumnNamesAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkWarehouseMastersDisplayTableColumnNamesAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500224)
	   public void checkWarehouseMastersDisplayTableColumnValuesAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkWarehouseMastersDisplayTableColumnValuesAvailableInWarehouseMastersPage(), true);
	   }
	   
	   //modified script
	   
	   @Test(priority=500225)
	   public void checkCustomizeMasterTabOptionInWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCustomizeMasterTabOptionInWarehouseMaster(), true);
	   }
	   
	   @Test(priority=500226)
	   public void checkCustomizeMasterTabMasterFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCustomizeMasterTabMasterFieldsOption(), true);
	   }
	   
	   
	   @Test(priority=500227)
	   public void checkGeneralTabOptionMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkGeneralTabOptionMainTabInCustomizeMaster(), true);
	   }
	   
	   
	   @Test(priority=500228)
	   public void checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster(), true);
	   }
	   
	   
	   @Test(priority=500229)
	   public void checkEditBinInMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkEditBinInMainTabInCustomizeMaster(), true);
	   }
	   
	   
	   @Test(priority=500230)
	   public void checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
	   }
	   
	   @Test(priority=500231)
	   public void checkCloseBtnOpenWarehouseMasterUpdateWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCloseBtnOpenWarehouseMasterUpdateWarehouse(), true);
	   }
	   
	
	   //modified script
	  
	   @Test(priority=500232)
	   public void checkNewButtonInWarehouseMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkNewButtonInWarehouseMasterOptions(), true);
	   }
	   
	   @Test(priority=500233)
	   public void checkSaveButtonInWarehouseMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSaveButtonInWarehouseMasterCreationPage(), true);
	   }
	   
	   @Test(priority=500234)
	   public void checkCloseButtonInWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCloseButtonInWarehouseGroupCreationPage(), true);
	   }
	   
	   @Test(priority=500235)
	   public void checkEditOptionForNewlyCreateAddGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkEditOptionForNewlyCreateAddGroupWarehouse(), true);
	   }
	   
	   @Test(priority=500236)
	   public void checkSaveByUpdatingNameAndCodeInWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSaveByUpdatingNameAndCodeInWarehouseGroupCreationPage(), true);
	   }
	   
	   @Test(priority=500237)
	   public void checkEditOptionForUpdatedGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkEditOptionForUpdatedGroupWarehouse(), true);
	   }
	   
	   @Test(priority=500238)
	   public void checkCloseButtonOnEditWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCloseButtonOnEditWarehouseGroupCreationPage(), true);
	   }
	   
	   @Test(priority=500239)
	   public void chekDeleteWarehouseOptionForWarhouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.chekDeleteWarehouseOptionForWarhouseMasterPage(), true);
	   }
	   
	   
	    @Test(priority=500240)
	   public void checkSaveWarhouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSaveWarhouse(), true);
	   }
	   
	   @Test(priority=500241)
	   public void checkCloseWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCloseWarehouseMaster(), true);
	   }
	   
	   
	   
	   // DEPARTMENT MASTER PAGE

	   @Test(priority=500242)
	   public void checkDepartmentsMasterPageIsDisplayByClickOnDepartmentsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDepartmentsMasterPageIsDisplayByClickOnDepartmentsMenu(), true);
	   }
	   
	   @Test(priority=500243)
	   public void checkMainOptionsAvailabilityInDepartmentsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkMainOptionsAvailabilityInDepartmentsMasterPage(), true);
	   }
	   
	   @Test(priority=500244)
	   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInDepartmentMastersPage(), true);
	   }
	  
	   @Test(priority=500245)
	   public void checkOtherToolsOptionsAvailabilityInDepartmentMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkOtherToolsOptionsAvailabilityInDepartmentMastersPageOnClickRibbonControlNextButton(), true);
	   }
	  
	  
	   @Test(priority=500246)
	   public void checkTreeViewOptionsAvailableInDepartmentsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkTreeViewOptionsAvailableInDepartmentsMastersPage(), true);
	   }
	 
	   @Test(priority=500247)
	   public void checkDisplayOfGroupAvailableTreeStructureLeftPageDepartmentsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDisplayOfGroupAvailableTreeStructureLeftPageDepartmentsMasterPage(), true);
	   }
	  
	   @Test(priority=500248)
	   public void checkCreateTreeToggleOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCreateTreeToggleOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	   @Test(priority=500249)
	   public void checkCreateViewToggleOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCreateViewToggleOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	  
	   @Test(priority=500250)
	   public void checkHideUnitGroupOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkHideUnitGroupOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	   
	   @Test(priority=500251)
	   public void checkUnHideUnitsGroupOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkUnHideUnitsGroupOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	   @Test(priority=500252)
	   public void checkHeaderFieldsOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkHeaderFieldsOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	   @Test(priority=500253)
	   public void checkSearchOptionAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSearchOptionAvailableInDepartmentMastersPage(), true);
	   }

	   @Test(priority=500254)
	   public void checkDepartmentMastersDisplayTableColumnNamesAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDepartmentMastersDisplayTableColumnNamesAvailableInDepartmentMastersPage(), true);
	   }
	 
	   @Test(priority=500255)
	   public void checkDepartmentMastersDisplayTableColumnValuesAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDepartmentMastersDisplayTableColumnValuesAvailableInDepartmentMastersPage(), true);
	   }

	   @Test(priority=500256)
	   public void checkClickOnNewButtonInDepartmentMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkClickOnNewButtonInDepartmentMasterPage(), true);
	   }

	   @Test(priority=500257)
	   public void checkInputNameCodeLocalCurrencyFieldsInDepartmentCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkInputNameCodeLocalCurrencyFieldsInDepartmentCreationPage(), true);
	   }
	   
	   @Test(priority=500258)
	   public void checkClickOnSaveButtonInDepartmentCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkClickOnSaveButtonInDepartmentCreationPage(), true);
	   }
	   
	   @Test(priority=500259)
	   public void checkDepartmentCreationAndClickOnCloseButtonToDisplayCreatedDepartmentInDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDepartmentCreationAndClickOnCloseButtonToDisplayCreatedDepartmentInDisplayGrid(), true);
	   }
	   
	   @Test(priority=500260)
	   public void checkClickOnEditForNewlyCreatedDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkClickOnEditForNewlyCreatedDepartment(), true);
	   }
	   
	  
	   @Test(priority=500261)
	   public void checkNameCodeAndCurrencyOptionForNewlyCreatedDepartmentThroughEdit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkNameCodeAndCurrencyOptionForNewlyCreatedDepartmentThroughEdit(), true);
	   }
	   
	   @Test(priority=500262)
	   public void checkUpatingNameCodeCurrencyForNewlyCreateDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkUpatingNameCodeCurrencyForNewlyCreateDepartment(), true);
	   }
	   
	   @Test(priority=500263)
	   public void checkClickOnSaveByUpdatingMasterAndDisplayDepartmentDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkClickOnSaveByUpdatingMasterAndDisplayDepartmentDisplayInGrid(), true);
	   }
	   
	   @Test(priority=500264)
	   public void checkDeleteDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDeleteDepartmentMaster(), true);
	   }
	   
	   
	   @Test(priority=500265)
	   public void checkDeleteMasterDisplayInGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkDeleteMasterDisplayInGroup(), true);
	   }
	   
	   
	   @Test(priority=500266)
	   public void checkSaveDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkSaveDepartment(), true);
	   }

	   
	   
	   @Test(priority=500267)
	   public void checkCloseDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  stcmp=new SmokeWholeMastersPage(getDriver());	
		  Assert.assertEquals(stcmp.checkCloseDepartmentMaster(), true);
	   }
	 
	 
	 
	 
	 
   // BUYER PRICE BOOK PAGE
 
   @Test(priority=500268)
   public void checkClickOnBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnBuyerPriceBook(), true);
   }
   
   @Test(priority=500269)
   public void checkClickOnCustomizationSettingsOptionInBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnCustomizationSettingsOptionInBuyerPriceBook(), true);
   }
   
   @Test(priority=500270)
   public void checkCustomizeColumnsInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCustomizeColumnsInGrid(), true);
   }
   
   @Test(priority=500271)
   public void checkSaveBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveBuyerPriceBook(), true);
   }
   
   @Test(priority=500272)
   public void checkEditBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkEditBuyerPriceBook(), true);
   }
   
   @Test(priority=500273)
   public void checkUpdateBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpdateBuyerPriceBook(), true);
   }
   
   @Test(priority=500274)
   public void checkUpdatePricebookInEditPricebook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpdatePricebookInEditPricebook(), true);
   }
  
   @Test(priority=500275)
   public void checkClickOnYesOptionInDeleteSavedCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnYesOptionInDeleteSavedCopyAndPaste(), true);
   }
   
   
   
   @Test(priority=500276)
   public void checkSaveOptionBuyerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveOptionBuyerPriceBook(), true);
   }
  
   
 
   @Test(priority=500277)
   public void checkClickOnCloseButtonInBuyingRates() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnCloseButtonInBuyingRates(), true);
   }

   
   //SELLER PRICE BOOK PAGE

   @Test(priority=500278)
   public void checkClickOnSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnSellerPriceBook(), true);
   }
   
   @Test(priority=500279)
   public void checkClickOnCustomizationSettingsOptionInSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnCustomizationSettingsOptionInSellerPriceBook(), true);
   }
   
   @Test(priority=500280)
   public void checkSellerPriceBookCustomizeColumnsInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSellerPriceBookCustomizeColumnsInGrid(), true);
   }
  
   @Test(priority=500281)
   public void checkSaveSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveSellerPriceBook(), true);
   }
 
   @Test(priority=500282)
   public void checkEditSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkEditSellerPriceBook(), true);
   }
  
   @Test(priority=500283)
   public void checkUpdateSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpdateSellerPriceBook(), true);
   }
   
   @Test(priority=500284)
   public void checkUpdateSellerPricebookInEditPricebook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpdateSellerPricebookInEditPricebook(), true);
   }
  
   @Test(priority=500285)
   public void checkClickOnYesOptionInDeleteSavedCopyAndPasteInSellerPriceBookPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnYesOptionInDeleteSavedCopyAndPasteInSellerPriceBookPage(), true);
   }
  
   @Test(priority=500286)
   public void checkSaveOptionSellerPriceBook() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveOptionSellerPriceBook(), true);
   }
   
   
   @Test(priority=500287)
   public void checkClickOnCloseButtonInSellingRates() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	   stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnCloseButtonInSellingRates(), true);
   }

  
   
      //Importing The Masters Starts From Here
      @Test(priority=500300)
	  public void checkAdvanceImportExportOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
     	  stcmp=new SmokeWholeMastersPage(getDriver());		  
		  Assert.assertEquals(stcmp.checkAdvanceImportExportOption(), true);
	  }
	  
	  @Test(priority=500301)
	  public void checkExportOptionInAdvanceImportExport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkExportOptionInAdvanceImportExport(), true);
	  }
	  
	  @Test(priority=500302)
	  public void checkSelectAllOptionInAdvanceImportExport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkSelectAllOptionInAdvanceImportExport(), true);
	  }
	  
	  
	  @Test(priority=500304)
	  public void checkFileDownloadInExportScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkFileDownloadInExportScreen(), true);
	  }
	  
	  
	  @Test(priority=500305)
	  public void checkReadingImportFileOnClickBrowseFileImportInImportExport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkReadingImportFileOnClickBrowseFileImportInImportExport(), true);
	  }
	  
	  
	  @Test(priority=500306)
	  public void checkSaveMappingImportFileInImportExport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkSaveMappingImportFileInImportExport(), true);
	  }
	  
	  @Test(priority=500307)
	  public void checkClickOnTemplateNameDropdown() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkClickOnTemplateNameDropdown(), true);
	  }
	 	  
	  @Test(priority=500308)
	  public void checkCloseImportExportScreenAndImport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkCloseImportExportScreenAndImport(), true);
	  }
	  
	  @Test(priority=500309)
	  public void checkImportedAccountsDisplayInAccountsDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkImportedAccountsDisplayInAccountsDisplayGrid(), true);
	  }
   
	  @Test(priority=500310)
	  public void checkAdvanceImportExportOptionInItemMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkAdvanceImportExportOptionInItemMasterPage(), true);
	  }
	  
	  @Test(priority=500311)
	  public void checkExportOptionInAdvanceImportExportOfItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  	  
		  Assert.assertEquals(stcmp.checkExportOptionInAdvanceImportExportOfItemMaster(), true);
	  }
	  
	  @Test(priority=500312)
	  public void checkItemMasterSelectAllOptionInAdvanceImportExport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	    
		  Assert.assertEquals(stcmp.checkItemMasterSelectAllOptionInAdvanceImportExport(), true);
	  }
	  
	 
	  @Test(priority=500313)
	  public void checkFileDownloadInExportScreenOfItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  	  
		  Assert.assertEquals(stcmp.checkFileDownloadInExportScreenOfItemMaster(), true);
	  }
	
	 
	  @Test(priority=500314)
	  public void checkImportDataOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  	  
		  Assert.assertEquals(stcmp.checkImportDataOption(), true);
	  }
	  
	 
	  @Test(priority=500315)
	  public void checkImportedItemsDisplayInItemGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkImportedItemsDisplayInItemGrid(), true);
	  }  
	  
	  
	  @Test(priority=500316)
	  public void checkPropertiesOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkPropertiesOption(), true);
	  }  
	  
	  @Test(priority=500317)
	  public void checkPropertiesForWACOGSRMAItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkPropertiesForWACOGSRMAItems(), true);
	  }  
	  
	  @Test(priority=500318)
	  public void checkPropertiesForFIFOCOGSBINSItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkPropertiesForFIFOCOGSBINSItems(), true);
	  }  
	  
	  
	  @Test(priority=500319)
	  public void checkPropertiesForBRCOGSBatchItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkPropertiesForBRCOGSBatchItems(), true);
	  }  
	  
	  
	  @Test(priority=500320)
	  public void checkPropertiesForSTDRATECOGSStockItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkPropertiesForSTDRATECOGSStockItems(), true);
	  }
	    
	  
	  
	  
	  

	  
	
	  @Test(priority=500321)
	  public void checkBinsMasterImportingBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkBinsMasterImportingBins(), true);
	  }  
	  
	  @Test(priority=500322)
	  public void checkBinsImportDataOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkBinsImportDataOption(), true);
	  }  
	  
	  @Test(priority=500323)
	  public void checkBinsImportedDisplayInItemGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkBinsImportedDisplayInItemGrid(), true);
	  }
  
	  
	  
	  
	  @Test(priority=500324)
	  public void checkWarehouseMasterImportingWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkWarehouseMasterImportingWarehouse(), true);
	  }  
	  
	  @Test(priority=500325)
	  public void checkWarehouseImportDataOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkWarehouseImportDataOption(), true);
	  }  
	  
	  @Test(priority=500326)
	  public void checkWarehouseImportedDisplayInWarehouseGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkWarehouseImportedDisplayInWarehouseGrid(), true);
	  }
	  
	  @Test(priority=500327)
	  public void checkWarehouseSettingThePropertAsInactive() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkWarehouseSettingThePropertAsInactive(), true);
	  }

	  
	  
	  
	  @Test(priority=500328)
	  public void checkDepartmentMasterImportingDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkDepartmentMasterImportingDepartment(), true);
	  }  
	  
	  @Test(priority=500329)
	  public void checkDepartmentImportDataOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkDepartmentImportDataOption(), true);
	  }  
	  
	  @Test(priority=500330)
	  public void checkDepartmentImportedDisplayInDepartmentGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkDepartmentImportedDisplayInDepartmentGrid(), true);
	  } 
	  
	  @Test(priority=500331)
	  public void checkLogoutUserSecurityPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  stcmp=new SmokeWholeMastersPage(getDriver());	  
		  Assert.assertEquals(stcmp.checkLogoutUserSecurityPage(), true);
	  } 

	
   
   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   /*
   //Below Script is not Used
   // DEPARTMENT MASTER PAGE
   
   @Test(priority=500161)
   public void checkDepartmentsMasterPageIsDisplayByClickOnDepartmentsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDepartmentsMasterPageIsDisplayByClickOnDepartmentsMenu(), true);
   }
   
   @Test(priority=500162)
   public void checkMainOptionsAvailabilityInDepartmentsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkMainOptionsAvailabilityInDepartmentsMasterPage(), true);
   }
   
   @Test(priority=500163)
   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInDepartmentMastersPage(), true);
   }
  
   @Test(priority=500164)
   public void checkOtherToolsOptionsAvailabilityInDepartmentMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkOtherToolsOptionsAvailabilityInDepartmentMastersPageOnClickRibbonControlNextButton(), true);
   }
  
  
   @Test(priority=500165)
   public void checkTreeViewOptionsAvailableInDepartmentsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkTreeViewOptionsAvailableInDepartmentsMastersPage(), true);
   }
 
   @Test(priority=500166)
   public void checkDisplayOfGroupAvailableTreeStructureLeftPageDepartmentsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDisplayOfGroupAvailableTreeStructureLeftPageDepartmentsMasterPage(), true);
   }
  
   @Test(priority=500167)
   public void checkCreateTreeToggleOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateTreeToggleOptionsAvailableInDepartmentMastersPage(), true);
   }
   
   @Test(priority=500168)
   public void checkCreateViewToggleOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateViewToggleOptionsAvailableInDepartmentMastersPage(), true);
   }
   
  
   @Test(priority=500169)
   public void checkHideUnitGroupOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHideUnitGroupOptionsAvailableInDepartmentMastersPage(), true);
   }
   
   
   @Test(priority=500170)
   public void checkUnHideUnitsGroupOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnHideUnitsGroupOptionsAvailableInDepartmentMastersPage(), true);
   }
   
   @Test(priority=500171)
   public void checkHeaderFieldsOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHeaderFieldsOptionsAvailableInDepartmentMastersPage(), true);
   }
   
   @Test(priority=500172)
   public void checkSearchOptionAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSearchOptionAvailableInDepartmentMastersPage(), true);
   }

   @Test(priority=500173)
   public void checkDepartmentMastersDisplayTableColumnNamesAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDepartmentMastersDisplayTableColumnNamesAvailableInDepartmentMastersPage(), true);
   }
 
   @Test(priority=500174)
   public void checkDepartmentMastersDisplayTableColumnValuesAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDepartmentMastersDisplayTableColumnValuesAvailableInDepartmentMastersPage(), true);
   }

   @Test(priority=500175)
   public void checkClickOnNewButtonInDepartmentMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnNewButtonInDepartmentMasterPage(), true);
   }

   @Test(priority=500176)
   public void checkInputNameCodeLocalCurrencyFieldsInDepartmentCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkInputNameCodeLocalCurrencyFieldsInDepartmentCreationPage(), true);
   }
   
   @Test(priority=500177)
   public void checkClickOnSaveButtonInDepartmentCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnSaveButtonInDepartmentCreationPage(), true);
   }
   
   @Test(priority=500178)
   public void checkDepartmentCreationAndClickOnCloseButtonToDisplayCreatedDepartmentInDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDepartmentCreationAndClickOnCloseButtonToDisplayCreatedDepartmentInDisplayGrid(), true);
   }
   
   @Test(priority=500179)
   public void checkClickOnEditForNewlyCreatedDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnEditForNewlyCreatedDepartment(), true);
   }
   
  
   @Test(priority=500180)
   public void checkNameCodeAndCurrencyOptionForNewlyCreatedDepartmentThroughEdit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkNameCodeAndCurrencyOptionForNewlyCreatedDepartmentThroughEdit(), true);
   }
   
   @Test(priority=500181)
   public void checkUpatingNameCodeCurrencyForNewlyCreateDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUpatingNameCodeCurrencyForNewlyCreateDepartment(), true);
   }
   
   @Test(priority=500182)
   public void checkClickOnSaveByUpdatingMasterAndDisplayDepartmentDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnSaveByUpdatingMasterAndDisplayDepartmentDisplayInGrid(), true);
   }
   
   @Test(priority=500183)
   public void checkDeleteDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDeleteDepartmentMaster(), true);
   }
   
   
   @Test(priority=500184)
   public void checkDeleteMasterDisplayInGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDeleteMasterDisplayInGroup(), true);
   }
   
   
   @Test(priority=500185)
   public void checkCloseDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCloseDepartmentMaster(), true);
   }
   
   
   //BIN MASTER PAGE
	 
   @Test(priority=500186)
   public void checkBinsMasterPageIsDisplayByClickOnBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkBinsMasterPageIsDisplayByClickOnBinsMenu(), true);
   }
   
   @Test(priority=500187)
   public void checkMainOptionsAvailabilityInBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkMainOptionsAvailabilityInBinsMasterPage(), true);
   }
   
   @Test(priority=500188)
   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInBinsMastersPage(), true);
   }
    
   @Test(priority=500189)
   public void checkOtherToolsOptionsAvailabilityInBinsMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkOtherToolsOptionsAvailabilityInBinsMastersPageOnClickRibbonControlNextButton(), true);
   }
   
   @Test(priority=500190)
   public void checkTreeViewOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkTreeViewOptionsAvailableInBinsMastersPage(), true);
   }
  
   @Test(priority=500191)
   public void checkDisplayOfGroupAvailableTreeStructureLeftPageBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDisplayOfGroupAvailableTreeStructureLeftPageBinsMasterPage(), true);
   }
  
  
   @Test(priority=500192)
   public void checkCreateTreeToggleOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateTreeToggleOptionsAvailableInBinsMastersPage(), true);
   }
   
   @Test(priority=500193)
   public void checkCreateViewToggleOptionsAvailableBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateViewToggleOptionsAvailableBinsMastersPage(), true);
   }
   
   
   @Test(priority=500194)
   public void checkHideUnitGroupOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHideUnitGroupOptionsAvailableInBinsMastersPage(), true);
   }
   
   
   @Test(priority=500195)
   public void checkUnHideUnitsGroupOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnHideUnitsGroupOptionsAvailableInBinsMastersPage(), true);
   }
   
   @Test(priority=500196)
   public void checkHeaderFieldsOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHeaderFieldsOptionsAvailableInBinsMastersPage(), true);
   }
   
   @Test(priority=500197)
   public void checkSearchOptionAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSearchOptionAvailableInBinsMastersPage(), true);
   }

   @Test(priority=500198)
   public void checkBinsMastersDisplayTableColumnNamesAvailableInBinstMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkBinsMastersDisplayTableColumnNamesAvailableInBinstMastersPage(), true);
   }
  
   @Test(priority=500199)
   public void checkBinsMastersDisplayTableColumnValuesAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkBinsMastersDisplayTableColumnValuesAvailableInBinsMastersPage(), true);
   }

   @Test(priority=500200)
   public void checkClickOnNewButtonInBinGroups() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkClickOnNewButtonInBinGroups(), true);
   }
  
   @Test(priority=500201)
   public void checkSaveBinCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveBinCreation(), true);
   }
  
   @Test(priority=500202)
   public void checkCloseButtonBinsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCloseButtonBinsCreationPage(), true);
   }
  
   
   @Test(priority=500203)
   public void checkEditOptionForNewlyCreateBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkEditOptionForNewlyCreateBins(), true);
   }
   
   
   @Test(priority=500204)
   public void checkSaveByUpdatingNameCodeTypeInBinsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveByUpdatingNameCodeTypeInBinsCreationPage(), true);
   }
   
   @Test(priority=500205)
   public void checkEditOptionForNewlyUpdateBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkEditOptionForNewlyUpdateBins(), true);
   }
   
   @Test(priority=500206)
   public void checkCloseButtonBinsUpdateCheck() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCloseButtonBinsUpdateCheck(), true);
   }
   
   @Test(priority=500207)
   public void checkUnCheckingSelectBinsAndCheckUnSelectBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnCheckingSelectBinsAndCheckUnSelectBins(), true);
   }
   
   @Test(priority=500208)
   public void checkDeleteBinsOptionForBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDeleteBinsOptionForBinsMasterPage(), true);
   }
   
   @Test(priority=500209)
   public void checkCloseBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCloseBinsMaster(), true);
   }
   
  
   //WAREHOUSE MASTER PAGE
   
   @Test(priority=500210)
   public void checkWarehouseMasterPageIsDisplayByClickOnWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkWarehouseMasterPageIsDisplayByClickOnWarehouseMenu(), true);
   }
   
   @Test(priority=500211)
   public void checkMainOptionsAvailabilityInWarhouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkMainOptionsAvailabilityInWarhouseMasterPage(), true);
   }
  
   @Test(priority=500212)
   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInWarehouseMastersPage(), true);
   }
   
   @Test(priority=500213)
   public void checkOtherToolsOptionsAvailabilityInWarehouseMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkOtherToolsOptionsAvailabilityInWarehouseMastersPageOnClickRibbonControlNextButton(), true);
   }
   
   @Test(priority=500214)
   public void checkTreeViewOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkTreeViewOptionsAvailableInWarehouseMastersPage(), true);
   }
   
   @Test(priority=500215)
   public void checkDisplayOfGroupAvailableTreeStructureLeftPageWarehouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkDisplayOfGroupAvailableTreeStructureLeftPageWarehouseMasterPage(), true);
   }
   
   
   @Test(priority=500216)
   public void checkCreateTreeToggleOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateTreeToggleOptionsAvailableInWarehouseMastersPage(), true);
   }
   
   
   @Test(priority=500217)
   public void checkCreateViewToggleOptionsAvailableWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCreateViewToggleOptionsAvailableWarehouseMastersPage(), true);
   }
   
 
   @Test(priority=500218)
   public void checkHideUnitGroupOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHideUnitGroupOptionsAvailableInWarehouseMastersPage(), true);
   }
   
   @Test(priority=500219)
   public void checkUnHideUnitsGroupOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnHideUnitsGroupOptionsAvailableInWarehouseMastersPage(), true);
   }
   
   @Test(priority=500220)
   public void checkHeaderFieldsOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkHeaderFieldsOptionsAvailableInWarehouseMastersPage(), true);
   }
   
   @Test(priority=500221)
   public void checkSearchOptionAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSearchOptionAvailableInWarehouseMastersPage(), true);
   }
   
   @Test(priority=500222)
   public void checkWarehouseMastersDisplayTableColumnNamesAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkWarehouseMastersDisplayTableColumnNamesAvailableInWarehouseMastersPage(), true);
   }
   
   @Test(priority=500223)
   public void checkWarehouseMastersDisplayTableColumnValuesAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkWarehouseMastersDisplayTableColumnValuesAvailableInWarehouseMastersPage(), true);
   }
  
   @Test(priority=500224)
   public void checkNewButtonInWarehouseMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkNewButtonInWarehouseMasterOptions(), true);
   }
   
   @Test(priority=500225)
   public void checkSaveButtonInWarehouseMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveButtonInWarehouseMasterCreationPage(), true);
   }
   
   @Test(priority=500226)
   public void checkCloseButtonInWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCloseButtonInWarehouseGroupCreationPage(), true);
   }
   
   @Test(priority=500227)
   public void checkEditOptionForNewlyCreateAddGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkEditOptionForNewlyCreateAddGroupWarehouse(), true);
   }
   
   @Test(priority=500228)
   public void checkSaveByUpdatingNameAndCodeInWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkSaveByUpdatingNameAndCodeInWarehouseGroupCreationPage(), true);
   }
   
   @Test(priority=500229)
   public void checkEditOptionForUpdatedGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkEditOptionForUpdatedGroupWarehouse(), true);
   }
   
   @Test(priority=500230)
   public void checkCloseButtonOnEditWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCloseButtonOnEditWarehouseGroupCreationPage(), true);
   }
   
   @Test(priority=500231)
   public void checkUnCheckingSelectWarehouseAndCheckUnSelectWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkUnCheckingSelectWarehouseAndCheckUnSelectWarehouse(), true);
   }
   
   @Test(priority=500232)
   public void chekDeleteWarehouseOptionForWarhouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.chekDeleteWarehouseOptionForWarhouseMasterPage(), true);
   }
   
   @Test(priority=500233)
   public void checkCloseWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	  stcmp=new SmokeWholeMastersPage(getDriver());	
	  Assert.assertEquals(stcmp.checkCloseWarehouseMaster(), true);
   }
   
   
   */
   
   
   
	
	
   
	
	
	
	
	
	
   
 }
