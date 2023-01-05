package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokeUnitsPage;
import com.focus.Pages.SmokeUnitsPage;
import com.focus.base.BaseEngine;

public class SmokeUnitsTest extends BaseEngine
{

	SmokeUnitsPage sup;
	
	// UNITS MASTER PAGE
	 
	   @Test(priority=500074)
	   public void checkSignToCheckUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkSignToCheckUnitsMastersPage(), true);
	   } 
	
	   @Test(priority=500075)
	   public void checkUnitsMasterPageIsDisplayByClickOnUnitsMenuFromItemMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkUnitsMasterPageIsDisplayByClickOnUnitsMenuFromItemMenu(), true);
	   } 
	   
	   
	   @Test(priority=500076)
	   public void checkMainOptionsAvailabilityInUnitsMastersPageOnClickOnUnitsFromItemMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkMainOptionsAvailabilityInUnitsMastersPageOnClickOnUnitsFromItemMastersMenu(), true);
	   } 
	   
	   @Test(priority=500077)
	   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInUnitsMastersPage(), true);
	   } 
	  
	   
	   @Test(priority=500078)
	   public void checkOtherToolsOptionsAvailabilityInUnitsMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkOtherToolsOptionsAvailabilityInUnitsMastersPageOnClickRibbonControlNextButton(), true);
	   } 
	   
	   
	   @Test(priority=500079)
	   public void checkTreeViewOptionsAvailableInUnitsMastersPageOnClickOnUnitsFromMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkTreeViewOptionsAvailableInUnitsMastersPageOnClickOnUnitsFromMastersMenu(), true);
	   } 
	   
	   @Test(priority=500080)
	   public void checkDisplayOfGroupAvailableTreeStructureLeftPaneInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkDisplayOfGroupAvailableTreeStructureLeftPaneInUnitsMastersPage(), true);
	   } 
	   
	   @Test(priority=500081)
	   public void checkCreateTreeToggleOptionsAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkCreateTreeToggleOptionsAvailableInUnitsMastersPage(), true);
	   } 
	   
	   
	   @Test(priority=500082)
	   public void checkCreateViewToggleOptionsAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkCreateViewToggleOptionsAvailableInUnitsMastersPage(), true);
	   } 
	   
	   @Test(priority=500083)
	   public void checkHideUnitGroupOptionsAvailableInUnitMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkHideUnitGroupOptionsAvailableInUnitMastersPage(), true);
	   } 
	   
	   @Test(priority=500084)
	   public void checkUnHideUnitsGroupOptionsAvailableInUnitMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkUnHideUnitsGroupOptionsAvailableInUnitMastersPage(), true);
	   } 
		 
	   @Test(priority=500085)
	   public void checkHeaderFieldsOptionsAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkHeaderFieldsOptionsAvailableInUnitsMastersPage(), true);
	   } 
	   
	   
	   @Test(priority=500086)
	   public void checkSearchOptionAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkSearchOptionAvailableInUnitsMastersPage(), true);
	   } 
	   
	   @Test(priority=500087)
	   public void checkUnitsDisplayTableColumnNamesAvailableInUnitsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkUnitsDisplayTableColumnNamesAvailableInUnitsMastersPage(), true);
	   } 
	   
	   
	   @Test(priority=500088)
	   public void checkUnitsDisplayTableColumnValuesAvailableInUnitMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkUnitsDisplayTableColumnValuesAvailableInUnitMastersPage(), true);
	   } 
	   
	   @Test(priority=500089)
	   public void checkClickOnNewButtonInUnitsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkClickOnNewButtonInUnitsMasterPage(), true);
	   } 
	   
	   @Test(priority=500090)
	   public void checkInputNameCodeNoOfDecimalsAndClickOnSaveButtonInUnitsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkInputNameCodeNoOfDecimalsAndClickOnSaveButtonInUnitsCreationPage(), true);
	   } 
	   
	   @Test(priority=500091)
	   public void checkUnitsCreationAndClickOnCloseButtonToDisplayCreatedUnitsInDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkUnitsCreationAndClickOnCloseButtonToDisplayCreatedUnitsInDisplayGrid(), true);
	   } 
	   
	   @Test(priority=500092)
	   public void checkSearchUnitsAndClickOnEditToDisplayUnitsSavedInformation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkSearchUnitsAndClickOnEditToDisplayUnitsSavedInformation(), true);
	   } 
	   
	   @Test(priority=500093)
	   public void checkUpdateUnitsOnInputNameCodeAndClickOnSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkUpdateUnitsOnInputNameCodeAndClickOnSaveButton(), true);
	   } 
	   
	   @Test(priority=500094)
	   public void checkUpdateUnitNameInUnitDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkUpdateUnitNameInUnitDisplayGrid(), true);
	   } 
	   
	   @Test(priority=500095)
	   public void checkDeleteUnitsWhichAreDefinedInProductsOnSelectUnitAndClickOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkDeleteUnitsWhichAreDefinedInProductsOnSelectUnitAndClickOnDelete(), true);
	   } 
	   
	   @Test(priority=500096)
	   public void checkDeletedUnitDisplayInUnitsMainGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkDeletedUnitDisplayInUnitsMainGrid(), true);
	   } 
	   
	   
	   @Test(priority=500097)
	   public void checkDeleteUnitsOnSelectUnitAndClickOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkDeleteUnitsOnSelectUnitAndClickOnDelete(), true);
	   }
	   
	   @Test(priority=500098)
	   public void checkClicOnCloseButtonToCloseUnitsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkClicOnCloseButtonToCloseUnitsMaster(), true);
	   }
	   
	   
	   // UNITS CONVERSION PAGE
	   
	    @Test(priority=500099)
	   public void checkClickOnUnitsConversionMenuFromItemMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkClickOnUnitsConversionMenuFromItemMenu(), true);
	   } 
	   
	   
	   @Test(priority=500100)
	   public void checkClickOnSaveWithAllInputsInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkClickOnSaveWithAllInputsInUnitsConversion(), true);
	   } 
	   
	   @Test(priority=500101)
	   public void checkUnitConversionSaveInformationAndUpdateButtonWithAllInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkUnitConversionSaveInformationAndUpdateButtonWithAllInputs(), true);
	   } 
	   
	  @Test(priority=500102)
	   public void checkUpdatedConversionValueDisplayUserModifyAndSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkUpdatedConversionValueDisplayUserModifyAndSave(), true);
	   } 
	   
	 
	   @Test(priority=500103)
	   public void checkClickOnClearButtonToClearTheFiledsInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkClickOnClearButtonToClearTheFiledsInUnitsConversion(), true);
	   }

	   
	   @Test(priority=500105)
	   public void checkPreviousConversionIsDeletingOnClickOnDeleteOptionInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkPreviousConversionIsDeletingOnClickOnDeleteOptionInUnitsConversion(), true);
	   } 
	   
	   @Test(priority=500106)
	   public void checkTheConversionValuesDeletedIsDisplayingInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkTheConversionValuesDeletedIsDisplayingInUnitsConversion(), true);
	   } 
	   
	   @Test(priority=500107)
	   public void checkClickOnClearButtonToClearOnFirstTheFiledsInUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkClickOnClearButtonToClearOnFirstTheFiledsInUnitsConversion(), true);
	   } 
	  
	   @Test(priority=500108)
	   public void checkSaveUnitsConversionOfOtherBaseUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkSaveUnitsConversionOfOtherBaseUnit(), true);
	   }
	   
	   @Test(priority=500109)
	   public void checkClickOnCancelToCloseUnitsConversion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkClickOnCancelToCloseUnitsConversion(), true);
	   }
	  
	   @Test(priority=500110)
	   public void checkLogoutInCurrencyMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sup=new SmokeUnitsPage(getDriver());	
		  Assert.assertEquals(sup.checkLogoutInCurrencyMasterPage(), true);
	   }
	   

		 

	  
}
