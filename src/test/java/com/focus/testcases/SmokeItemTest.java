package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokeItemPage;
import com.focus.base.BaseEngine;



public class SmokeItemTest extends BaseEngine
{

 SmokeItemPage sip;
   
 //ITEM MASTER PAGE
 
 @Test(priority=500109)
 public void checkSignToCheckItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
    sip=new SmokeItemPage(getDriver());	
    Assert.assertEquals(sip.checkSignToCheckItemMastersPage(), true);
 }    
   
 @Test(priority=500110)
 public void checkClickOnItemFromItemMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkClickOnItemFromItemMenu(), true);
 } 
 

 @Test(priority=500111)
 public void checkToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu(), true);
 } 
 
 @Test(priority=500112)
 public void checkOtherToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkOtherToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu(), true);
 } 
	   
 @Test(priority=500113)
 public void checkTreeViewOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkTreeViewOptionsAvailableInItemMastersPage(), true);
 } 
 
 @Test(priority=500114)
 public void checkDisplayOfGroupAvailableTreeStructureLeftPaneInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkDisplayOfGroupAvailableTreeStructureLeftPaneInItemMastersPage(), true);
 } 
 
 @Test(priority=500115)
 public void checkCreateTreeToggleOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkCreateTreeToggleOptionsAvailableInItemMastersPage(), true);
 } 

 @Test(priority=500116)
 public void checkCreateViewToggleOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkCreateViewToggleOptionsAvailableInItemMastersPage(), true);
 } 
	   
 @Test(priority=500117)
 public void checkHideUnitGroupOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkHideUnitGroupOptionsAvailableInItemMastersPage(), true);
 } 
 
 @Test(priority=500118)
 public void checkUnHideUnitsGroupOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkUnHideUnitsGroupOptionsAvailableInItemMastersPage(), true);
 } 
 
 @Test(priority=500119)
 public void checkHeaderFieldsOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkHeaderFieldsOptionsAvailableInItemMastersPage(), true);
 } 
 
 @Test(priority=500120)
 public void checkSearchOptionAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkSearchOptionAvailableInItemMastersPage(), true);
 } 
	   

 @Test(priority=500121)
 public void checkItemDisplayTableColumnNamesAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkItemDisplayTableColumnNamesAvailableInItemMastersPage(), true);
 } 

 @Test(priority=500122)
 public void checkItemDisplayTableColumnValuesAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkItemDisplayTableColumnValuesAvailableInItemMastersPage(), true);
 } 
	   
 @Test(priority=500123)
 public void checkNewButtonOnClickToDisplayItemCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkNewButtonOnClickToDisplayItemCreationPage(), true);
 } 
 
 @Test(priority=500124)
 public void checkGeneralTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkGeneralTabInItemMasterCreationPage(), true);
 } 

 @Test(priority=500125)
 public void checkUnitsTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkUnitsTabInItemMasterCreationPage(), true);
 } 

 @Test(priority=500126)
 public void checkSettingTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkSettingTabInItemMasterCreationPage(), true);
 } 
	   
 @Test(priority=500127)
 public void checkClassificationTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkClassificationTabInItemMasterCreationPage(), true);
 } 

 @Test(priority=500128)
 public void checkOtherDeailsTabInMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkOtherDeailsTabInMasterCreationPage(), true);
 } 

 @Test(priority=500129)
 public void checkReplenishmentTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkReplenishmentTabInItemMasterCreationPage(), true);
 } 
 
 @Test(priority=500130)
 public void checkOutletTabInItemMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkOutletTabInItemMasterCreationPage(), true);
 } 
	  
 
 @Test(priority=500132)
 public void checkSaveButtonByInputInProductCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkSaveButtonByInputInProductCreationPage(), true);
 } 
 
 @Test(priority=500133)
 public void checkClickOnCloseAndCreatedMasterItemDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkClickOnCloseAndCreatedMasterItemDisplayInGrid(), true);
 } 

 @Test(priority=500134)
 public void checkCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster(), true);
 }
 
 @Test(priority=500135)
 public void checkEditOptionForNewlyCreatedItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkEditOptionForNewlyCreatedItem(), true);
 }
 
 @Test(priority=500136)
 public void checkUnCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkUnCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster(), true);
 }

 @Test(priority=500137)
 public void checkUpdatedItemInformation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkUpdatedItemInformation(), true);
 }

 @Test(priority=500138)
 public void checkDeleteItemFromItemMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkDeleteItemFromItemMasterPage(), true);
 }

 @Test(priority=500139)
 public void checkDeleteItemDisplayInMasterDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkDeleteItemDisplayInMasterDisplay(), true);
 }

 @Test(priority=500140)
 public void checkItemsAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkItemsAddGroupButton(), true);
 }
 
 @Test(priority=500141)
 public void checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption(), true);
 }
 
 @Test(priority=500142)
 public void checkItemAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkItemAddGroupCreationScreenAfterSaving(), true);
 }
 
 @Test(priority=500143)
 public void checkEditOptionForItemGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkEditOptionForItemGroup(), true);
 }
 
 @Test(priority=500144)
 public void checkUpateForGroupItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkUpateForGroupItem(), true);
 }

 @Test(priority=500145)
 public void checkSaveOnUpdateItemGroupDisplayInItemGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkSaveOnUpdateItemGroupDisplayInItemGrid(), true);
 }

 @Test(priority=500146)
 public void checkClickOnGroupItemToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkClickOnGroupItemToDisplayEmpty(), true);
 }

 
 @Test(priority=500147)
 public void checkSaveItemInItemGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkSaveItemInItemGroup(), true);
 }
 
 @Test(priority=500148)
 public void checkCloseOptionInItemCreationInItemCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkCloseOptionInItemCreationInItemCreation(), true);
 }  
 
 @Test(priority=500149)
 public void checkItemFirstLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkItemFirstLevel(), true);
 }

 @Test(priority=500150)
 public void checkCloseItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkCloseItemMaster(), true);
 }

 


 
 
 @Test(priority=500151)
 public void checkLogoutInCurrencyMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  sip=new SmokeItemPage(getDriver());	
	  Assert.assertEquals(sip.checkLogoutInCurrencyMasterPage(), true);
 }

	
  }



