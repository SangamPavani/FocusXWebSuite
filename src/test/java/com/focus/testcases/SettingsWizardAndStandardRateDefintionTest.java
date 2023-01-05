package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SettingsWizardAndStandardRateDefintionPage;
import com.focus.base.BaseEngine;

public class SettingsWizardAndStandardRateDefintionTest extends BaseEngine
{
	
   static SettingsWizardAndStandardRateDefintionPage ssp;

       @Test(priority=500250)
	   public void checkLoginToCheckMasterSettingWizardVATAndStandardRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		 ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkLoginToCheckMasterSettingWizardVATAndStandardRate(), true);
	   }
	   
       @Test(priority=500251)
	   public void checkOpenSettingWizardPageIsOpen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		 ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkOpenSettingWizardPageIsOpen(), true);
	   }
	  
	
	   @Test(priority=500252)//
	   public void checkSaveVatOptionsInSettingsWizard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		   ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkSaveVatOptionsInSettingsWizard(), true);
	   }
	   
	   @Test(priority=500253)///
	   public void checkVATMastersTaxCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		   ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkVATMastersTaxCode(), true);
	   }
	  
	   @Test(priority=500254)
	   public void checkVATMastersPlaceOfSupply() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		   ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkVATMastersPlaceOfSupply(), true);
	   }
	   
	   @Test(priority=500255)
	   public void checkVATMastersJurisdiction() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkVATMastersJurisdiction(), true);
	   }
	
	 
	   @Test(priority=500256) //
	   public void checkUtilitiesSubMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkUtilitiesSubMenu(), true);
	   }
	   
	   
	   @Test(priority=500257)
	   public void checkOpenStandardRatePageSaveRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkOpenStandardRatePageSaveRate(), true);
	   }
   
	   
	   @Test(priority=500258)
	   public void checkEditOptionInStandardRateUpdateValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkEditOptionInStandardRateUpdateValue(), true);
	   }
	   
    
	   @Test(priority=500259)
	   public void checkUpdateStandardRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkUpdateStandardRate(), true);
	   }
	  
	   
	   @Test(priority=500260)
	   public void checkEditOptionInStandardOptionRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkEditOptionInStandardOptionRate(), true);
	   }
	   
	 
	   @Test(priority=500261)
	   public void checkOptionDeleteRowInStandardRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkOptionDeleteRowInStandardRate(), true);
	   }
	   
	   @Test(priority=500262)
	   public void checkSaveStandardRatePageOnDeleteExistingRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkSaveStandardRatePageOnDeleteExistingRate(), true);
	   }
   
	   
	   @Test(priority=500263)
	   public void checkVatTaxCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkVatTaxCode(), true);
	   }
	   
	   @Test(priority=500264) //Error msg not found
	   public void checkVatTaxCodeImporting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkVatTaxCodeImporting(), true);
	   }
	   
	   @Test(priority=500265) // Imported but saving on Accounting Date.
	   public void checkImportedVatTaxCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkImportedVatTaxCode(), true);
	   }
	   
	     
	   @Test(priority=500266)
	   public void checkVatTaxCodeExporting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkVatTaxCodeExporting(), true);
	   }
	   
	   
	   @Test(priority=500267)
	   public void checkLogoutSettingWizardOptionnVATAndStandardRatePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  ssp=new SettingsWizardAndStandardRateDefintionPage(getDriver());	
		  Assert.assertEquals(ssp.checkLogoutSettingWizardOptionnVATAndStandardRatePage(), true);
	   }
    
}
