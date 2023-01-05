
package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPHomeMenuPage;
import com.focus.Pages.MasterAccountsPage;
import com.focus.Pages.MasterBinsPage;
import com.focus.Pages.MasterDepartmentPage;
import com.focus.Pages.MasterUnitPage;
import com.focus.Pages.MasterWarehousePage;
import com.focus.Pages.SmokeDesignWorkFlowPage;
import com.focus.Pages.SmokePreferencesPage;

import com.focus.base.BaseEngine;


public class SmokePreferencesTest extends BaseEngine
{

	
	static SmokePreferencesPage pp;
	
	  @Test(priority=656)
	  public void checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkLoginCompanyWithValidCredentials(), true);
	   
	  }
	
      @Test(priority=657)
	  public void checkAvailableOptionsInSettingsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkAvailableOptionsInSettingsMenu(), true);
	   
	  }
	
	  @Test(priority=658)
	  public void checkConfigureTransactionsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkConfigureTransactionsMenu(), true);
	   
	  }
	  
	
	  @Test(priority=659)
	  public void checkPreferencesOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkPreferencesOption(), true);
	   
	  }
	
	 
	  @Test(priority=660)
	  public void checkTagsDefaultTagSettingsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkTagsDefaultTagSettingsOption(), true);
	   
	  }
	 
	  
	  @Test(priority=661)//
	  public void verifyEnableAccountingTag() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableAccountingTag(), true);
	   
	  }
	
	  @Test(priority=662)//
	  public void verifyEnableInventoryTag() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableInventoryTag(), true);
	   
	  }

	  
	  @Test(priority=663)//
	  public void checkEnableSellingRateBuyingRateTag() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableSellingRateBuyingRateTag(), true);
	   
	  }
	  
	  
	  @Test(priority=664)
	  public void verifyUpdateButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdateButton(), true);
	   
	  }
	  
	  
	 @Test(priority=665)
	 public void verifyUpdateOkButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdateOkButton(), true);
	   
	 }

	  
	  
	  @Test(priority=666)
	  public void verifyCloseButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkCloseButton(), true);
	   
	  }	  
	  

	  @Test(priority=667)
	  public void verifyTagsAfterSaveTags() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkTagsAfterSaveTags(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=668)
	  public void verifyEditTagsByUpdateButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEditTagsByUpdateButton(), true);
	   
	  }
	  
	  @Test(priority=669)
	  public void verifyEditTagsByUpdateOkButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEditTagsByUpdateOkButton(), true);
	   
	  }
	  
	  @Test(priority=670)
	  public void verifyUpdatedTagsAfterUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdatedTagsAfterUpdate(), true);
	   
	  }
	   
	  
	  @Test(priority=671)
	  public void checkAccountsinPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkAccountsinPreferences(), true);	   
	  }
	  
	  @Test(priority=672)
	  public void checkBudgetScreenUnderPreference() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkBudgetScreenUnderPreference(), true);	   
	  }
	  
	  
	  @Test(priority=673)
	  public void verifyARAPinPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkARAPinPreferences(), true);	   
	  }

	  @Test(priority=674)
	  public void verifyARAPoptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkARAPoptions(), true);	   
	  }
	  
	  @Test(priority=675)
	  public void verifyEnableCreditLimitCheckOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableCreditLimitCheckOptions(), true);	   
	  }
	  
	  @Test(priority=676)
	  public void verifyPickCreditDayFromOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkPickCreditDayFromOptions(), true);	   
	  }
		  
	  @Test(priority=677)
	  public void verifyDependOnMaintainBillWiseFroARAPOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkDependOnMaintainBillWiseFroARAPOptions(), true);	   
	  }
	  	  
	  @Test(priority=678)
	  public void verifySavingDependOnMaintainBillWiseFroARAPOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkSavingDependOnMaintainBillWiseFroARAPOptions(), true);   
	  }
	  
	  @Test(priority=679)
	  public void checkEnableOverDueCheckOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableOverDueCheckOptions(), true);
	  }
	  
	  
	  @Test(priority=680)
	  public void checkSelectingARTagAsDeparment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkSelectingARTagAsDeparment(), true);
	  }
	  
	  @Test(priority=681)
	  public void checkSelectingAPTagAsDeparment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkSelectingAPTagAsDeparment(), true);   
	  }
	  
	  
	  @Test(priority=682)
	  public void checkUpdatebuttonARAP() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdatebuttonARAP(), true);	   
	  }

	  @Test(priority=683)
	  public void verifyMiscellaneousInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkMiscellaneousInPreferences(), true);
	   
	  }
	  
	  @Test(priority=684)
	  public void verifyMiscellaneousOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkMiscellaneousOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=685)
	  public void verifyLocalCurrencyOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkLocalCurrencyOption(), true);
	   
	  }
	  
	  @Test(priority=686)
	  public void verifyInputingLocalCurrencyOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkInputingLocalCurrencyOption(), true);
	   
	  }
	  	  
	  @Test(priority=687)
	  public void checkUpdateOkbuttonMiscelleanous() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdateOkbuttonMiscelleanous(), true);
	   
	  }
	  
	  @Test(priority=688)
	  public void checkAvailbilityofPDCandPDCOptionsinPreference() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkAvailbilityofPDCandPDCOptionsinPreference(), true);
	   
	  }
	  
	  
	  @Test(priority=689)
	  public void verifyAvailbilityofInventory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkAvailbilityofInventory(), true);
	   
	  }
	  
	  
	  @Test(priority=690)
	  public void verifyInventoryOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkInventoryOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=691)
	  public void verifyIncludeReservestockinStockLedgerOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkIncludeReservestockinStockLedgerOption(), true);
	   
	  }
	  
	  
	  @Test(priority=692)
	  public void verifyInputUnitsinTransactionsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkInputUnitsinTransactionsOption(), true);
	   
	  }
	  
	  
	  @Test(priority=693)
	  public void verifyUpdateMRNstockvaluethroughPurchaseOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdateMRNstockvaluethroughPurchaseOption(), true);
	   
	  }
	  
	  @Test(priority=694)
	  public void verifyReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkReservation(), true);
	   
	  }
	  
	  
	  @Test(priority=695)
	  public void verifyUpdateInventoryOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdateInventoryOptions(), true);
	   
	  }
	
	 
	  @Test(priority=696)
	  public void verifyAvailbilityofBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkAvailbilityofBatch(), true);
	   
	  }
	  
	  
	  @Test(priority=697)
	  public void verifyEnableBatchNumbersOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableBatchNumbersOption(), true);
	   
	  }
	  
	  
	  @Test(priority=698)
	  public void checkEnableBatchExpiryOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableBatchExpiryOptions(), true);
	   
	  }
	  
	  @Test(priority=699)
	  public void verifyUpdateButtonInBatches() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdateButtonInBatches(), true);
	   
	  }
	 
	  @Test(priority=700)
	  public void verifyAvailbilityofRMA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkAvailbilityofRMA(), true);
	   
	  }
	  
	  
	  @Test(priority=701)
	  public void verifyEnableRMASupportOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableRMASupportOption(), true);
	   
	  }
	  
	  
	  @Test(priority=702)
	  public void verifyRMAOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkRMAOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=703)
	  public void verifyUpdateButtonInRMA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdateButtonInRMA(), true);
	   
	  }
	 
	  @Test(priority=704)
	  public void verifyAvailbilityofBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkAvailbilityofBins(), true);
	   
	  }
	  
	  
	  @Test(priority=705)
	  public void verifyEnableBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableBins(), true);
	   
	  }
	  
	  
	  @Test(priority=706)
	  public void verifyEnableBinsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEnableBinsOption(), true);
	   
	  }
	  
	  
	  @Test(priority=708)
	  public void checkUpdateButtonInBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdateButtonInBins(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=715)
	  public void checkMailSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkMailSettings(), true);
	   
	  }
	  
	  @Test(priority=716)
	  public void verifykMailSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkMailSettings(), true);
	   
	  }
	  
	 
	  
	  @Test(priority=717)
	  public void verifyUserSecureConnection() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUserSecureConnection(), true);
	   
	  }
	  
	  
	  @Test(priority=718)
	  public void verifySMTPsettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkSMTPsettings(), true);
	   
	  }
	  
	  @Test(priority=719)
	  public void verifySMTPAddress() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkSMTPAddress(), true);
	   
	  }
	  
	  @Test(priority=720)
	  public void verifyOutgoingPort() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkOutgoingPort(), true);
	   
	  }
	  
	  @Test(priority=721)
	  public void verifyAuthenticationType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkAuthenticationType(), true);
	   
	  }
	  
	  
	  @Test(priority=722)
	  public void verifyEMail() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEMail(), true);
	   
	  }
	  
	  
	  @Test(priority=723)
	  public void verifyPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkPassword(), true);
	   
	  }
	  
	  
	  @Test(priority=724)
	  public void verifyUpdateButtonInMailSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdateButtonInMailSettings(), true);
	   
	  }
	  
	  
	  @Test(priority=725)
	  public void verifyCloseButtonInMailSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkCloseButtonInMailSettings(), true);
	   
	  }
	
	  @Test(priority=726)
	  public void checkUpdatedFieldsinMailSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdatedFieldsinMailSettings(), true);
	   
	  }
	  
	  
	  @Test(priority=727)
	  public void checkUpdatingtheMailSettingsbyUpdatingEmailid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdatingtheMailSettingsbyUpdatingEmailid(), true);
	   
	  }
	  
	   
	  @Test(priority=728)
	  public void checkUpdatedEmailid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkUpdatedEmailid(), true);
	   
	  }
	 

	  
	  @Test(priority=729)
	  public void checkMastersOptioninthePreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkMastersOptioninthePreferences(), true);
	   
	  }
	  
	  
	  @Test(priority=730)
	  public void checkSavingtheSaleandPurchaseRates() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkSavingtheSaleandPurchaseRates(), true);
	   
	  }
	  
	  
	 // @Test(priority=731)
	  public void verifyCloseButtonInMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkCloseButtonInMasters(), true);
	   
	  }

	  @Test(priority=732)
	  public void checkEditAndSavingRateValues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkEditAndSavingRateValues(), true);
	   
	  }
	  
	  @Test(priority=733)
	  public void checkExternalModulesInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkExternalModulesInPreferences(), true);
	   
	  }
	  
	  @Test(priority=734)
	  public void checkINFOInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkINFOInPreferences(), true);
	   
	  }
	  
	  
	  @Test(priority=735)
	  public void checkProductionInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkProductionInPreferences(), true);
	   
	  }
	  
	  @Test(priority=736)
	  public void checkMRPInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkMRPInPreferences(), true);
	   
	  }
	  
	  @Test(priority=737)
	  public void checkQualityControlInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkQualityControlInPreferences(), true);
	   
	  }
	  
	  @Test(priority=738)
	  public void checkFixedAssetsInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkFixedAssetsInPreferences(), true);
	   
	  }
	  
	  
	  @Test(priority=739)
	  public void checkVATInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkVATInPreferences(), true);
	   
	  }
	  
	  @Test(priority=740)
	  public void checkCreateVATInputAccountInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkCreateVATInputAccountInPreferences(), true);
	   
	  }
	  
	  @Test(priority=741)
	  public void checkSaveVATAccountsInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkSaveVATAccountsInPreferences(), true);
	   
	  }
	  
	  @Test(priority=742)
	  public void checkPOSInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkPOSInPreferences(), true);
	   
	  }
	  
	
	  @Test(priority=743)//
	  public void checkWarehouseMangementInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkWarehouseMangementInPreferences(), true);
	   
	  }
	  
	  @Test(priority=744)
	  public void checkLetterForCreditInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkLetterForCreditInPreferences(), true);
	   
	  }
	  
	 // @Test(priority=745)
	  public void checkPronghornInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkPronghornInPreferences(), true);
	   
	  }
	  
	  
	  
	 // @Test(priority=746)
	  public void checkSavedOptionsInPreferences() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  pp=new SmokePreferencesPage(getDriver());
		  Assert.assertEquals(pp.checkSavedOptionsInPreferences(), true);
	   
	  }
	  
	  
	    @Test(priority=1070)
		public  static void checkCloseAndLogoutTheCompany() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException  
		{

		  pp=new SmokePreferencesPage(getDriver());
			Assert.assertEquals(pp.checkCloseAndLogoutTheCompany(),true);
			  
		}	
}
