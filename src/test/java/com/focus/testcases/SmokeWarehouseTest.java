
package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokeBinsPage;
import com.focus.Pages.SmokeWarehousePage;
import com.focus.Pages.SmokeWarehousePage;
import com.focus.base.BaseEngine;

public class SmokeWarehouseTest  extends BaseEngine
{


	SmokeWarehousePage swp;
	
	//WAREHOUSE MASTER PAGE
	
	   @Test(priority=500210)
	   public void checkSignToCheckWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkSignToCheckWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500211)
	   public void checkWarehouseMasterPageIsDisplayByClickOnWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkWarehouseMasterPageIsDisplayByClickOnWarehouseMenu(), true);
	   }
	   
	   @Test(priority=500212)
	   public void checkMainOptionsAvailabilityInWarhouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkMainOptionsAvailabilityInWarhouseMasterPage(), true);
	   }
	  
	   @Test(priority=500213)
	   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500214)
	   public void checkOtherToolsOptionsAvailabilityInWarehouseMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkOtherToolsOptionsAvailabilityInWarehouseMastersPageOnClickRibbonControlNextButton(), true);
	   }
	   
	   @Test(priority=500215)
	   public void checkTreeViewOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkTreeViewOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500216)
	   public void checkDisplayOfGroupAvailableTreeStructureLeftPageWarehouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkDisplayOfGroupAvailableTreeStructureLeftPageWarehouseMasterPage(), true);
	   }
	   
	   @Test(priority=500217)
	   public void checkCreateTreeToggleOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkCreateTreeToggleOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   
	   @Test(priority=500218)
	   public void checkCreateViewToggleOptionsAvailableWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkCreateViewToggleOptionsAvailableWarehouseMastersPage(), true);
	   }
	   
	 
	   @Test(priority=500219)
	   public void checkHideUnitGroupOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkHideUnitGroupOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500220)
	   public void checkUnHideUnitsGroupOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkUnHideUnitsGroupOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500221)
	   public void checkHeaderFieldsOptionsAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkHeaderFieldsOptionsAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500222)
	   public void checkSearchOptionAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkSearchOptionAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500223)
	   public void checkWarehouseMastersDisplayTableColumnNamesAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkWarehouseMastersDisplayTableColumnNamesAvailableInWarehouseMastersPage(), true);
	   }
	   
	   @Test(priority=500224)
	   public void checkWarehouseMastersDisplayTableColumnValuesAvailableInWarehouseMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkWarehouseMastersDisplayTableColumnValuesAvailableInWarehouseMastersPage(), true);
	   }
	   
	   //modified script
	   
	   @Test(priority=500225)
	   public void checkCustomizeMasterTabOptionInWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkCustomizeMasterTabOptionInWarehouseMaster(), true);
	   }
	   
	   @Test(priority=500226)
	   public void checkCustomizeMasterTabMasterFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkCustomizeMasterTabMasterFieldsOption(), true);
	   }
	   
	   
	   @Test(priority=500227)
	   public void checkGeneralTabOptionMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkGeneralTabOptionMainTabInCustomizeMaster(), true);
	   }
	   
	   
	   @Test(priority=500228)
	   public void checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster(), true);
	   }
	   
	   
	   @Test(priority=500229)
	   public void checkEditBinInMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkEditBinInMainTabInCustomizeMaster(), true);
	   }
	   
	   
	   @Test(priority=500230)
	   public void checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
	   }
	   
	   @Test(priority=500231)
	   public void checkCloseBtnOpenWarehouseMasterUpdateWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkCloseBtnOpenWarehouseMasterUpdateWarehouse(), true);
	   }
	   
	
	   //modified script
	  
	   @Test(priority=500232)
	   public void checkNewButtonInWarehouseMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkNewButtonInWarehouseMasterOptions(), true);
	   }
	   
	   @Test(priority=500233)
	   public void checkSaveButtonInWarehouseMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkSaveButtonInWarehouseMasterCreationPage(), true);
	   }
	   
	   @Test(priority=500234)
	   public void checkCloseButtonInWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkCloseButtonInWarehouseGroupCreationPage(), true);
	   }
	   
	   @Test(priority=500235)
	   public void checkEditOptionForNewlyCreateAddGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkEditOptionForNewlyCreateAddGroupWarehouse(), true);
	   }
	   
	   @Test(priority=500236)
	   public void checkSaveByUpdatingNameAndCodeInWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkSaveByUpdatingNameAndCodeInWarehouseGroupCreationPage(), true);
	   }
	   
	   @Test(priority=500237)
	   public void checkEditOptionForUpdatedGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkEditOptionForUpdatedGroupWarehouse(), true);
	   }
	   
	   @Test(priority=500238)
	   public void checkCloseButtonOnEditWarehouseGroupCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkCloseButtonOnEditWarehouseGroupCreationPage(), true);
	   }
	   
	   @Test(priority=500239)
	   public void chekDeleteWarehouseOptionForWarhouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.chekDeleteWarehouseOptionForWarhouseMasterPage(), true);
	   }
	   
	   
	    @Test(priority=500240)
	   public void checkSaveWarhouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkSaveWarhouse(), true);
	   }
	   
	   @Test(priority=500241)
	   public void checkCloseWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkCloseWarehouseMaster(), true);
	   }
	   
	   @Test(priority=500242)
	   public void checkLogoutInWarehouseMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		   swp=new SmokeWarehousePage(getDriver());	
		  Assert.assertEquals(swp.checkLogoutInWarehouseMasterPage(), true);
	   }
	   
	}
