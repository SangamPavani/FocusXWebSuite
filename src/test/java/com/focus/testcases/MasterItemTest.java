package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.MasterItemPage;
import com.focus.base.BaseEngine;



public class MasterItemTest extends BaseEngine
{

   MasterItemPage mip;
   
  @Test(priority=656)
   public void checkLoginToCheckItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	 mip=new MasterItemPage(getDriver());
	 Assert.assertEquals(mip.checkLoginToCheckItem(), true);
   }
   
  @Test(priority=657)
   public void verifyTheAvailabilityofOptionsInItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	 mip=new MasterItemPage(getDriver());
	 Assert.assertEquals(mip.checkTheAvailabilityofOptionsInItem(), true);
   }
	
  @Test(priority=658)
   public void verifyMainOptionsItemsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	 mip=new MasterItemPage(getDriver());
	 Assert.assertEquals(mip.checkMainOptionsItemsMenu(), true);
   }
	
	
   @Test(priority=659)
   public void verifyToolsOptionsItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	 mip=new MasterItemPage(getDriver());
	 Assert.assertEquals(mip.checkToolsOptionsItemMenu(), true);  
    }

	
 
	
	
   @Test(priority=661)
   public void verifyTreeIdToggleViewIdToggleOptionsItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	 mip=new MasterItemPage(getDriver());
	 Assert.assertEquals(mip.checkTreeIdToggleViewIdToggleOptionsItemMenu(), true);
    }

   @Test(priority=662)
   public void verifyCreateTreeToggleOptionsItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
   	 mip=new MasterItemPage(getDriver());
   	 Assert.assertEquals(mip.checkCreateTreeToggleOptionsItemMenu(), true);
   }
   
   @Test(priority=662)
   public void verifyCreateViewToggleOptionsItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
   	 mip=new MasterItemPage(getDriver());
   	 Assert.assertEquals(mip.checkCreateViewToggleOptionsItemMenu(), true);
   }
   
   @Test(priority=663)
   public void verifyHideItemGroupsOptionsItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
   	 mip=new MasterItemPage(getDriver());
   	 Assert.assertEquals(mip.checkHideItemGroupsOptionsItemMenu(), true);
   }
   
   
   @Test(priority=664)
   public void veriyUnHideItemGroupsOptionsItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
   	 mip=new MasterItemPage(getDriver());
   	 Assert.assertEquals(mip.checkUnHideItemGroupsOptionsItemMenu(), true);
   }
   
   @Test(priority=665)
   public void verifyItemMasterDisplayInMainPageGridItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
   	 mip=new MasterItemPage(getDriver());
   	 Assert.assertEquals(mip.checkItemMasterDisplayInMainPageGridItemMenu(), true);
   }
   
   
 
 	
   @Test(priority=667)
   public void verifyNewButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	 mip=new MasterItemPage(getDriver());
	 Assert.assertEquals(mip.checkNewButton(), true);
   }
	

   @Test(priority=668)
   public void verifyGeneralTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	  mip=new MasterItemPage(getDriver());
	  Assert.assertEquals(mip.checkGeneralTab(), true);
	  
   }
	
   @Test(priority=669)
   public void verifyUnitsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	  mip=new MasterItemPage(getDriver());
      Assert.assertEquals(mip.checkUnitsTab(), true);
   }
	
   @Test(priority=700)
   public void verifySettingTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSettingTab(), true);
   }
	
   @Test(priority=701)
   public void verifyClassificationTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   { 
	  mip=new MasterItemPage(getDriver());
      Assert.assertEquals(mip.checkClassificationTab(), true);
   }
	
	 
   @Test(priority=702)
   public void verifyOtherDeailsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	  mip=new MasterItemPage(getDriver());
      Assert.assertEquals(mip.checkOtherDeailsTab(), true);
   }
	

   @Test(priority=703)
   public void verifyReplenishmentTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkReplenishmentTab(), true);
   }
	 
   @Test(priority=704)
   public void verifyOutletTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkOutletTab(), true);
   }
	
	 
   @Test(priority=705)
   public void verifySaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization(), true);
   }
	 
   @Test(priority=706)
   public void verifySaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization(), true);
   }
	 
   @Test(priority=707)
   public void verifySaveButtonWithInputingMandatoryFieldsBeforeCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveButtonWithInputingMandatoryFieldsBeforeCustomization(), true);
   }
	 
   @Test(priority=708)
   public void verifyItemCreationScreenAfterSavingBeforeCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkItemCreationScreenAfterSavingBeforeCustomization(), true);
   }
	 
   @Test(priority=709)
   public void verifyItemDisplayInItemGridBeforeCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkItemDisplayInItemGridBeforeCustomization(), true);
   }
	 
   @Test(priority=710)
   public void verifyEditOptionForNewlyCreatedItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkEditOptionForNewlyCreatedItem(), true);
   }

   
   @Test(priority=711)
   public void verifyUpateForNewlyCreateItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkUpateForNewlyCreateItem(), true);
   }

   
   
   @Test(priority=712)
   public void verifykUpdatedMasterItemDisplayInGrid() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkUpdatedMasterItemDisplayInGrid(), true);
   }

   
   @Test(priority=713)
   public void verifyCloneButtonAndSaveInItemMasterCreation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCloneButtonAndSaveInItemMasterCreation(), true);
   }
   
   
    @Test(priority=714)
   public void verifyItemDisplayInItemSavingWithCloneMasterCreationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkItemDisplayInItemSavingWithCloneMasterCreationOptions(), true);
   }
   
   
   @Test(priority=715)
   public void verifyCloneButtonAndSaveInItemMasterOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCloneButtonAndSaveInItemMasterOptions(), true);
   }
   
   
   @Test(priority=716)
   public void verifyItemDisplayInItemSavingWithCloneMasterOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkItemDisplayInItemSavingWithCloneMasterOptions(), true);
   }
   
   
   @Test(priority=717)
   public void verifyCopyOptionByPasteOptionWithNewButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCopyOptionByPasteOptionWithNewButton(), true);
   }
   
   
   @Test(priority=718)
   public void verifySaveItemeUsingCopyAndPaste() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveItemeUsingCopyAndPaste(), true);
   }
   
   @Test(priority=719)
   public void verifyItemDisplaySavingWithCopyAndPaste() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkItemDisplaySavingWithCopyAndPaste(), true);
   }
	

   @Test(priority=720)
   public void verifySaveFinishedItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveFinishedItem(), true);
   }
   
   
   @Test(priority=721)
   public void verifyFinishedItemDisplayMasterGrid() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkFinishedItemDisplayMasterGrid(), true);
   }
   

   @Test(priority=722)
   public void verifykPropertiesOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesOption(), true);
   }
  
   @Test(priority=723)
   public void verifyPropertiesForBatchItems() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesForBatchItems(), true);
   }
   

   
   @Test(priority=724)
   public void verifyPropertiesForBatchItemSecondRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesForBatchItemSecondRow(), true);
   }
   
   
   @Test(priority=725)
   public void verifyPropertiesForBatchItemThirdRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesForBatchItemThirdRow(), true);
   }
      
   
   @Test(priority=726)
   public void verifyPropertiesForBatchItemFourthRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesForBatchItemFourthRow(), true);
   }
   
   
   @Test(priority=727)
   public void verifyPropertiesForStockItemFifthRow() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesForStockItemFifthRow(), true);
   }
   
   @Test(priority=728)
   public void verifySaveBinRawMaterialItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveBinRawMaterialItem(), true);
   }
   
   @Test(priority=729)
   public void verifySaveBinFinishedGoodsItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveBinFinishedGoodsItem(), true);
   }
   
   @Test(priority=730)
   public void verifyPropertiesForBinItems() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesForBinItems(), true);
   }
   
   
   @Test(priority=731)
   public void verifySaveBatchBinFinishedGoodsItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveBatchBinFinishedGoodsItem(), true);
   }
   
   
   
   @Test(priority=732)
   public void verifyPropertiesForBatchBinItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesForBatchBinItem(), true);
   }
   
   
   @Test(priority=733)
   public void verifySaveBatchBinNoStocksUpdateItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveBatchBinNoStocksUpdateItem(), true);
   }
   
   
   @Test(priority=734)
   public void verifyPropertiesForBatchBinNoStockUpdateItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesForBatchBinNoStockUpdateItem(), true);
   }
   
   
   @Test(priority=735)
   public void verifySaveBatchBinNoReservation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveBatchBinNoReservation(), true);
   }
   
   
   @Test(priority=736)
   public void verifyPropertiesForBatchBinNoReservationItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesForBatchBinNoReservationItem(), true);
   }
   

   
   
   @Test(priority=737)
   public void verifyCreateNewWarehouseForDeleteOptionValidationMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCreateNewWarehouseForDeleteOptionValidationMessage(), true);
   }
   
   
   @Test(priority=738)
   public void verifyOkInDeleteValidationMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkOkInDeleteValidationMessage(), true);
   }
   
   
   @Test(priority=739)
   public void verifyDeleteItemDisplayBeforeCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkDeleteItemDisplayBeforeCustomization(), true);
   }
   
   @Test(priority=740)
   public void verifyAddGroupButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkAddGroupButton(), true);
   }
   
   @Test(priority=741)
   public void verifySaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption(), true);
   }
   
   
   @Test(priority=742)
   public void verifySaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption(), true);
   }
   
   
   @Test(priority=743)
   public void verifySaveButtonInAddGroupWithInputingMandatoryFields() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveButtonInAddGroupWithInputingMandatoryFields(), true);
   }
   
   
   @Test(priority=744)
   public void verifyWarehouseAddGroupCreationScreenAfterSaving() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkWarehouseAddGroupCreationScreenAfterSaving(), true);
   }
   
   
   @Test(priority=745)
   public void verifyWarehouseAddGroupNewCreateDisplayInWarehouseGrid() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkWarehouseAddGroupNewCreateDisplayInWarehouseGrid(), true);
   }
   
   
   @Test(priority=746)
   public void verifyEditOptionForNewlyCreateAddGroupWarehouse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkEditOptionForNewlyCreateAddGroupWarehouse(), true);
   }
   
   
   @Test(priority=747)
   public void verifyUpateForNewlyCreateAddGroupItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkUpateForNewlyCreateAddGroupWarehouse(), true);
   }
   
   @Test(priority=748)
   public void verifyUpdatedItemGroupDisplayInItemGrid() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkUpdatedWarehouseGroupDisplayInWarehouseGrid(), true);
   }
   
   @Test(priority=749)
   public void verifyClickOnGroupToDisplayEmpty() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkClickOnGroupToDisplayEmpty(), true);
   }
   
   @Test(priority=750)
   public void verifySaveItemInItemGroup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSaveItemInItemGroup(), true);
   }
   
   
   @Test(priority=751)
   public void verifyCloseOptionInItemCreation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCloseOptionInItemCreation(), true);
   }
   
   
   @Test(priority=752)
   public void verifyWarehouseFirstLevel() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkItemFirstLevel(), true);
   }
   
   
   
   
  @Test(priority=753)
   public void verifyCloseWarehouseMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCloseItemMaster(), true);
   }
   

   
   @Test(priority=754)
   public void verifyOpenItemsMasterForCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkOpenItemsMasterForCustomization(), true);
   }
   
   @Test(priority=755)
   public void verifyCustomizeMasterTabOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCustomizeMasterTabOption(), true);
   }
   
   
   @Test(priority=756)
   public void verifyCreateTabsInCustomizeMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCreateTabsInCustomizeMaster(), true);
   }
   
   
   @Test(priority=757)
   public void verifyCreateTabsOptionsInCustomizeMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCreateTabsOptionsInCustomizeMaster(), true);
   }
   
   
   @Test(priority=758)
   public void verifyCreateCreateTabOptionsInCustomizeMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCreateCreateTabOptionsInCustomizeMaster(), true);
   }
   
   
   @Test(priority=759)
   public void verifykMandatoryCheckInCreateCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkMandatoryCheckInCreateCreateTab(), true);
   }
   
   
   @Test(priority=760)
   public void verifyOkButtonWithAllInputInCreateCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkOkButtonWithAllInputInCreateCreateTab(), true);
   }
   
   @Test(priority=761)
   public void verifyCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   @Test(priority=762)
   public void verifyHeaderDetailsTabInCreateCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkHeaderDetailsTabInCreateCreateTab(), true);
   }
   
   
   @Test(priority=763)
   public void verifyBodyDetailsTabInCreateCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkBodyDetailsTabInCreateCreateTab(), true);
   }
   
   
   
   @Test(priority=764)
   public void verifyAddOptionInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkAddOptionInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   
   
   @Test(priority=765)
   public void verifyFieldsDetailsTabInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkFieldsDetailsTabInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   
   @Test(priority=766)
   public void verifyPropertiesTabInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkPropertiesTabInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   
   @Test(priority=767)
   public void verifyFormattingTabInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkFormattingTabInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   
   @Test(priority=768)
   public void verifyRulesTabInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkRulesTabInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   
 
   
   
   @Test(priority=770)
   public void verifyExternalModulesTabInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkExternalModulesTabInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   @Test(priority=771)
   public void verifyMandatoryFieldsByClickOnOkButtonCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkMandatoryFieldsByClickOnOkButtonCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   @Test(priority=772)
   public void verifyCloseButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCloseButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   

   @Test(priority=773)
   public void verifyOkButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkOkButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   
   @Test(priority=774)
   public void verifyCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   @Test(priority=775)
   public void verifyEditCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkEditCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   @Test(priority=776)
   public void verifyUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   
   @Test(priority=777)//issuse of customization
   public void verifyUpdateFieldInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkUpdateFieldInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   
   @Test(priority=778)
   public void checkLogoutAfterCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkLogoutAfterCustomization(), true);
   }
   
   
   @Test(priority=779)
   public void checkSignToCheckTabsInCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkSignToCheckTabsInCustomization(), true);
   }

   @Test(priority=780)
   public void checkOpenItemsMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkOpenItemsMaster(), true);
   }
   
   
   @Test(priority=781)
   public void checkNewButtonForExtraInput() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkNewButtonForExtraInput(), true);
   }
   
   
   @Test(priority=782)
   public void checkCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCreateTab(), true);
   }
   
 
   @Test(priority=783)
   public void checkSaveCOGSItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	   mip=new MasterItemPage(getDriver());	
	  Assert.assertEquals(mip.checkSaveCOGSItems(), true);
   }
   
   @Test(priority=784)
   public void checkSavePropertiesForCOGSItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	   mip=new MasterItemPage(getDriver());	
	  Assert.assertEquals(mip.checkSavePropertiesForCOGSItems(), true);
   }
   
   @Test(priority=785)
   public void checkCloseItemMasterExtraField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCloseItemMasterExtraField(), true);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   //below code is not in use
   
   
   
   
   
   
    /*
     
	 @Test(priority=670)
	 public void verifyNewScreenCrestionTraiffttab() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkNewScreenCrestionTraiffttab(), true);
      }
	

	 @Test(priority=671)
	 public void verifyCreationofProductofTypeBin() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkCreationofProductofTypeBin(), true);
     }
	
	 
	 @Test(priority=672)
	 public void verifyClickonNewbutton() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.ClickonNewbutton(), true);
     }


	 @Test(priority=673)
	 public void verifyInBATChProductwithValidationasWeaightedAvg() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkInBATChProductwithValidationasWeaightedAvg(), true);
      }
	
	 

	 @Test(priority=674)
	 public void verifyBySelecttheBatchWAandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkBySelecttheBatchWAandclickonPropertiesoptionfromtheMainTab(), true);
     }
	
	 

	 @Test(priority=675)
	 public void verifybySelectDonotMaintainBinandDonotMaintainRMAcheckboxes() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxes(), true);
     }
	
	 

	 @Test(priority=676)
	 public void verifyClickonNewbuttonAfterSavingBinAccount() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.ClickonNewbuttonAfterSavingBinAccount(), true);
     }


	 @Test(priority=677)
	 public void verifyBATChProductwithValidationasLIFO() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.CheckBATChProductwithValidationasLIFO(), true);
     }
	
	 
	 @Test(priority=678)
	 public void verifyBySelecttheBatchLIFOandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkBySelecttheBatchLIFOandclickonPropertiesoptionfromtheMainTab(), true);
     }
	

	 @Test(priority=679)
	 public void verifybySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchLIFO() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchLIFO(), true);
     }
	

	 @Test(priority=680)
	 public void verifyonNewbuttonAfterSavingBatchLIFO() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.ClickonNewbuttonAfterSavingBatchLIFO(), true);
     }
	

	 @Test(priority=681)
	 public void verifyInBATChProductwithValidationasFIFO() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkInBATChProductwithValidationasFIFO(), true);
     }
	
	 
	 @Test(priority=682)
	 public void verifyBySelectthBatchFIFOandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkBySelectthBatchFIFOandclickonPropertiesoptionfromtheMainTab(), true);
     }


	 @Test(priority=683)
	 public void verifybySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchFIFO() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchFIFO(), true);
     }
	

	 @Test(priority=684)
	 public void verifyNewbuttonAfterSavingBatchFIFO() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.ClickonNewbuttonAfterSavingBatchFIFO(), true);
     }


	 @Test(priority=685)
	 public void verifyBATChProductwithValidationasBatchRate() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkInBATChProductwithValidationasBatchRate(), true);
     }

	 @Test(priority=686)
	 public void verifyBySelectthBatchRateandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	 {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkBySelectthBatchRateandclickonPropertiesoptionfromtheMainTab(), true);
     }
	
	
	@Test(priority=687)
	public void verifybySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchRate() throws InterruptedException
	{
	   mip=new MasterItemPage(getDriver());
       Assert.assertEquals(mip.checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchRate(), true);
    }
	

	@Test(priority=688)
	public void verifyonNewbuttonAfterSavingBatch() throws InterruptedException
	{
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.ClickonNewbuttonAfterSavingBatch(), true);
    }


	@Test(priority=689)
	public void checkInBInProductwithValidationasBatchBinWA() throws InterruptedException
	{
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkInBInProductwithValidationasBatchBinWA(), true);
    }
	
	
	@Test(priority=690)
	public void checkBySelectthBatchBinWAandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	{
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkBySelectthBatchBinWAandclickonPropertiesoptionfromtheMainTab(), true);
    }
	

	@Test(priority=691)
	public void verifybySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchBinWA() throws InterruptedException
	{
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchBinWA(), true);
    }
	

	@Test(priority=692)
	public void verifyClickonNewbuttonAfterSavingBatchBinWA() throws InterruptedException
	{
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.ClickonNewbuttonAfterSavingBatchBinWA(), true);
    }
	

	@Test(priority=693)
	public void verifyInBInProductwithValidationasLIFO() throws InterruptedException
	{
	   mip=new MasterItemPage(getDriver());
	   Assert.assertEquals(mip.checkInBInProductwithValidationasLIFO(), true);
    }
	
	
	@Test(priority=694)
	public void verifyBySelectthBatchBinLIFOandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	{
	   mip=new MasterItemPage(getDriver());
	   Assert.assertEquals(mip.checkBySelectthBatchBinLIFOandclickonPropertiesoptionfromtheMainTab(), true);
    }
	
	
	@Test(priority=695)
	public void verifybySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchBinLIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
		 Assert.assertEquals(mip.checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchBinLIFO(), true);
    }
	

	@Test(priority=696)
	public void ClickonNewbuttonAfterSavingBatchBinLIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.ClickonNewbuttonAfterSavingBatchBinLIFO(), true);
    }
	
	

	@Test(priority=697)
	public void checkInBInProductwithValidationasBinFIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkInBInProductwithValidationasBinFIFO(), true);
    }
	


	@Test(priority=698)
	public void checkBySelectthBatchBinFIFOandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkBySelectthBatchBinFIFOandclickonPropertiesoptionfromtheMainTab(), true);
    }
	


	@Test(priority=699)
	public void checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchBinFIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchBinFIFO(), true);
    }
	


	@Test(priority=700)
	public void ClickonNewbuttonAfterSavingBatchBinFIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.ClickonNewbuttonAfterSavingBatchBinFIFO(), true);
    }
	


	@Test(priority=701)
	public void checkInBInProductwithValidationasBinBR() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkInBInProductwithValidationasBinBR(), true);
    }
		

	@Test(priority=702)
	public void checkBySelectthBatchBinBrandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkBySelectthBatchBinBrandclickonPropertiesoptionfromtheMainTab(), true);
    }
	

	
	@Test(priority=703)
	public void checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchBinBR() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkbySelectDonotMaintainBinandDonotMaintainRMAcheckboxesinBatchBinBR(), true);
    }
	


	@Test(priority=704)
	public void ClickonNewbuttonAfterSavingBatchBinBR() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.ClickonNewbuttonAfterSavingBatchBinBR(), true);
    }
	

	@Test(priority=705)
	public void checkInRMAProductwithValidationasWeaightedAvg() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkInRMAProductwithValidationasWeaightedAvg(), true);
    }
	


	@Test(priority=706)
	public void checkBySelectthRMAWAandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkBySelectthRMAWAandclickonPropertiesoptionfromtheMainTab(), true);
    }
	
	
	@Test(priority=707)
	public void checkbySelectDonotMaintainBatchandDonotMaintainBincheckboxesinRMAWA() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkbySelectDonotMaintainBatchandDonotMaintainBincheckboxesinRMAWA(), true);
    }
	


	@Test(priority=708)
	public void ClickonNewbuttonAfterSavingRMAWA() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.ClickonNewbuttonAfterSavingRMAWA(), true);
    }
	

	@Test(priority=709)
	public void checkInRMAProductwithValidationasLIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkInRMAProductwithValidationasLIFO(), true);
    }
	

	@Test(priority=710)
	public void checkBySelectthRMALIFOandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkBySelectthRMALIFOandclickonPropertiesoptionfromtheMainTab(), true);
    }
	

	@Test(priority=711)
	public void checkbySelectDonotMaintainBatchandDonotMaintainBincheckboxesinRMALIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkbySelectDonotMaintainBatchandDonotMaintainBincheckboxesinRMALIFO(), true);
    }
	


	@Test(priority=712)
	public void ClickonNewbuttonAfterSavingRMALIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.ClickonNewbuttonAfterSavingRMALIFO(), true);
    }
	
	

	@Test(priority=713)
	public void checkInRMAProductwithValidationasFIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkInRMAProductwithValidationasFIFO(), true);
    }
	
	

	@Test(priority=714)
	public void checkBySelectthRMAFIFOandclickonPropertiesoptionfromtheMainTab() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkBySelectthRMAFIFOandclickonPropertiesoptionfromtheMainTab(), true);
    }
	


	@Test(priority=715)
	public void checkbySelectDonotMaintainBatchandDonotMaintainBincheckboxesinRMAFIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkbySelectDonotMaintainBatchandDonotMaintainBincheckboxesinRMAFIFO(), true);
    }


	@Test(priority=716)
	public void ClickonNewbuttonAfterSavingRMAFIFO() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.ClickonNewbuttonAfterSavingRMAFIFO(), true);
    }
	
	
	@Test(priority=717)
	public void checkGroupingRMA() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkGroupingRMA(), true);
    }
	

	@Test(priority=718)
	public void checkProductCreationofTypeOFAddGroup() throws InterruptedException
	{
		 mip=new MasterItemPage(getDriver());
         Assert.assertEquals(mip.checkProductCreationofTypeOFAddGroup(), true);
    }

	//  @Test(priority=769)//no need
   public void verifyRulesOptionsTabInCreateCreateTabDisplayInCustomizeTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
		mip=new MasterItemPage(getDriver());
        Assert.assertEquals(mip.checkRulesOptionsTabInCreateCreateTabDisplayInCustomizeTab(), true);
   }
   */
   
   /*//@Test(priority=666)//no need
   public void verifySearchOptionsInMainPageHeaderFieldsOptionsItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
   	 mip=new MasterItemPage(getDriver());
   	 Assert.assertEquals(mip.checkSearchOptionsInMainPageHeaderFieldsOptionsItemMenu(), true);
   }
   */
   
   /* //@Test(priority=660)//no need
   public void verifyOtherToolsOptionsItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
     mip=new MasterItemPage(getDriver());
     Assert.assertEquals(mip.checkOtherToolsOptionsItemMenu(), true);
   }*/
	
  }

