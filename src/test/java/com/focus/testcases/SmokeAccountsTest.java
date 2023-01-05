package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.SmokeAccountsPage;
import com.focus.base.BaseEngine;

public class SmokeAccountsTest extends BaseEngine 
{
	SmokeAccountsPage sap;

	 @Test(priority=500001)
	 public void checkSignToCheckAccountsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 sap=new SmokeAccountsPage(getDriver());		  
		 Assert.assertEquals(sap.checkSignToCheckAccountsMastersPage(), true);
	 }
	 	
	 @Test(priority=500002)
	 public void checkOpenAccountsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkOpenAccountsMastersPage(), true);
	 }
	 
	 @Test(priority=500007)
	 public void checkTreeViewOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkTreeViewOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500008)
	 public void checkDisplayOfGroupAvailableTreeStructureLeftPaneInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkDisplayOfGroupAvailableTreeStructureLeftPaneInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500009)
	 public void checkCreateTreeToggleOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkCreateTreeToggleOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500010)
	 public void checkCreateViewToggleOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkCreateViewToggleOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500011)
	 public void checkHideAccountGroupOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkHideAccountGroupOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500012)
	 public void checkUnHideAccountGroupOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkUnHideAccountGroupOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 
	 @Test(priority=500013)
	 public void checkHeaderFieldsOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkHeaderFieldsOptionsAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500014)
	 public void checkSearchOptionAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkSearchOptionAvailableInAccountMastersPage(), true);
	 }
	 
	 
	 @Test(priority=500015)
	 public void checkAccountsDisplayTableColumnNamesAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkAccountsDisplayTableColumnNamesAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500016)
	 public void checkAccountsDisplayTableColumnValuesAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkAccountsDisplayTableColumnValuesAvailableInAccountMastersPage(), true);
	 }
	 
	 @Test(priority=500017)
	 public void checkAccountsCreationPageAndGeneralTabFieldsAvailabilityOnClickOnNewButtonInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkAccountsCreationPageAndGeneralTabFieldsAvailabilityOnClickOnNewButtonInAccountsMasterPage(), true);
	 }
	 	
	 @Test(priority=500018)
	 public void checkSettingTabFieldsAvailabilityOnClickOnSettingsTabInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkSettingTabFieldsAvailabilityOnClickOnSettingsTabInAccountsMasterCreationPage(), true);
	 }
	 
	 @Test(priority=500019)
	 public void checkDetailsTabFieldsAvailabilityOnClickOnDetailsTabInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkDetailsTabFieldsAvailabilityOnClickOnDetailsTabInAccountsMasterCreationPage(), true);
	 }
	 
	 @Test(priority=500020)
	 public void checkPrintLayoutTabFieldsAvailabilityOnClickOnPrintLayoutTabInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkPrintLayoutTabFieldsAvailabilityOnClickOnPrintLayoutTabInAccountsMasterCreationPage(), true);
	 }
	 
	 
	 @Test(priority=500021)
	 public void checkCreateTabUpdateTabFieldsAvailabilityInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkCreateTabUpdateTabFieldsAvailabilityInAccountsMasterCreationPage(), true);
	 }
	
	 @Test(priority=500024)
	 public void checkAccountSaveOnInputAndClickOnSaveButtonInMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkAccountSaveOnInputAndClickOnSaveButtonInMasterCreationPage(), true);
	 }
	 
	 @Test(priority=500025)
	 public void checkCloseAccountsCreationPageOnClickOnCloseButtonInAccountsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkCloseAccountsCreationPageOnClickOnCloseButtonInAccountsCreationPage(), true);
	 }

	 @Test(priority=500026)
	 public void checkClickOnAccountSavedCheckBoxToCheckInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkClickOnAccountSavedCheckBoxToCheckInAccountsMasterPage(), true);
	 }
	 
	 @Test(priority=500027)
	 public void checkAccountMasterSavedInfomationDetailsOnClickOnEditInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkAccountMasterSavedInfomationDetailsOnClickOnEditInAccountsMasterPage(), true);
	 }
	 
	 @Test(priority=500028)
	 public void checkUpdatingAccountInformationOnClickSaveButtonInAccountsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkUpdatingAccountInformationOnClickSaveButtonInAccountsCreationPage(), true);
	 }
	 
	 @Test(priority=500029)
	 public void checkAccountUpdatedInformationDisplayInMasterDisplayTableOfMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkAccountUpdatedInformationDisplayInMasterDisplayTableOfMastersPage(), true);
	 }
	 
	 @Test(priority=500030)
	 public void checkClickOnSavedAccountCheckBoxToUnCheckInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkClickOnSavedAccountCheckBoxToUnCheckInAccountsMasterPage(), true);
	 }
	 
	 @Test(priority=500031)
	 public void checkUpdateAcountInformationForUpdateAccountInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkUpdateAcountInformationForUpdateAccountInAccountsMasterPage(), true);
	 }
	 
	 @Test(priority=500032)
	 public void checkSeclectAccountAndDeleteOptionInMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkSeclectAccountAndDeleteOptionInMasterPage(), true);
	 }
	 
	 
	 @Test(priority=500033)
	 public void checkDeleteAccountMasterNotDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkDeleteAccountMasterNotDisplayInAccountGrid(), true);
	 }
	 
	 
	 
	 
	 @Test(priority=500036)
	 public void checkClickOnCloseButtonInAccountMasterToCloseAccountsPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkClickOnCloseButtonInAccountMasterToCloseAccountsPage(), true);
	 }
	 
	  
	 @Test(priority=500037)
	 public void checkLogoutInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  sap=new SmokeAccountsPage(getDriver());		  
		  Assert.assertEquals(sap.checkLogoutInAccountsMasterPage(), true);
	 }
	 
}