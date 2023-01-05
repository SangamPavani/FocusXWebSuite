
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
import com.focus.base.BaseEngine;

public class MasterWarehouseTest  extends BaseEngine
{


	MasterWarehousePage mwp;
	
	 @Test(priority=603)
	  public void verifyOpenWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkOpenWarehouseMenu(), true);
	   
	  }
	
	
	  @Test(priority=604)
	  public void checkMainOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkMainOptionsWarehouseMenu(), true);
	   
	  }
	
	  
	  @Test(priority=605)
	  public void verifyToolsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkToolsOptionsWarehouseMenu(), true);
	   
	  }
	
	  
	  @Test(priority=606)
	  public void verifyOtherToolsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkOtherToolsOptionsWarehouseMenu(), true);
	   
	  }
	
	  @Test(priority=607)
	  public void verifyTreeViewOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkTreeViewOptionsWarehouseMenu(), true);
	   
	  }
	  
	  @Test(priority=608)
	  public void verifyCreateTreeToggleOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCreateTreeToggleOptionsWarehouseMenu(), true);
	   
	  }
	  
	  @Test(priority=609)
	  public void verifyCreateViewToggleOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCreateViewToggleOptionsWarehouseMenu(), true);
	   
	  }
	  
	  @Test(priority=610)
	  public void verifyHideAccountGroupsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkHideAccountGroupsOptionsWarehouseMenu(), true);
	   
	  }
	  
	  @Test(priority=611)
	  public void verifyMainPageHeaderFieldsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkMainPageHeaderFieldsOptionsWarehouseMenu(), true);
	   
	  }
	  
	  
	/*  @Test(priority=612)
	  public void verifySearchOptionsInMainPageHeaderFieldsOptionsWarehouseMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkSearchOptionsInMainPageHeaderFieldsOptionsWarehouseMenu(), true);
	   
	  }*/
	  
	  
	  @Test(priority=613)
	  public void verifyNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkNewButton(), true);
	   
	  }
	  
	  @Test(priority=614)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkSaveButtonWithoutInputNameMandatoryFieldsInNew(), true);
	   
	  }
	  
	  
	  @Test(priority=615)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkSaveButtonWithoutInputCodeMandatoryFieldsInNew(), true);
	   
	  }
	  
	  
	  @Test(priority=616)
	  public void verifySaveButtonWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkSaveButtonWithInputingMandatoryFields(), true);
	   
	  }
	  
	  

	  @Test(priority=617)
	  public void checkWarehouseCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkWarehouseCreationScreenAfterSaving(), true);
	   
	  }
	  
	  @Test(priority=618)
	  public void verifyNewlyCreatedWarehouseDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkNewlyCreatedWarehouseDisplayInGrid(), true);
	   
	  }

	  @Test(priority=619)
	  public void verifyEditOptionForNewlyCreatedWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkEditOptionForNewlyCreatedWarehouse(), true);
	   
	  }
	  
	  @Test(priority=620)
	  public void verifyUpateForNewlyCreateWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkUpateForNewlyCreateWarehouse(), true);
	   
	  }
	  
	  
	  @Test(priority=621)
	  public void verifyUpdatedMasterWarehouseDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkUpdatedMasterWarehouseDisplayInGrid(), true);
	   
	  }
	  
	  
	  @Test(priority=622)
	  public void verifyCloneButtonAndSaveInWarehouseMasterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCloneButtonAndSaveInWarehouseMasterCreation(), true);
	   
	  }
	  
	  @Test(priority=623)
	  public void verifyWarehouseDisplayInUnitsSavingWithCloneMasterCreationOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkWarehouseDisplayInUnitsSavingWithCloneMasterCreationOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=624)
	  public void checkCloneButtonAndSaveInWarehoueMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCloneButtonAndSaveInWarehoueMasterOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=625)
	  public void verifyUnitDisplayInUnitsSavingWithCloneMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkUnitDisplayInUnitsSavingWithCloneMasterOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=626)
	  public void verifyCopyOptionByPasteOptionWithNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCopyOptionByPasteOptionWithNewButton(), true);
	   
	  }
	  
	  @Test(priority=627)
	  public void verifySaveWarehouseUsingCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkSaveWarehouseUsingCopyAndPaste(), true);
	   
	  }
	  
	  @Test(priority=628)
	  public void verifyWarehouseDisplaySavingWithCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkWarehouseDisplaySavingWithCopyAndPaste(), true);
	   
	  }
	  
	  
	  @Test(priority=629)
	  public void verifyWarehouseMasterProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkWarehouseMasterProperties(), true);
	   
	  }
	  
	  
	  @Test(priority=630)
	  public void verifyInActiveBySelectingOkButtonInPropertiesOptionForWrehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkInActiveBySelectingOkButtonInPropertiesOptionForWrehouse(), true);
	   
	  }
	  
	  
	  @Test(priority=631)
	  public void verifyCreateNewWarehouseForDeleteOptionValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCreateNewWarehouseForDeleteOptionValidationMessage(), true);
	   
	  }
	  
	  
	  @Test(priority=632)
	  public void verifyOkInDeleteValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkOkInDeleteValidationMessage(), true);
	   
	  }
	  
	  
	  @Test(priority=633)
	  public void verifyDeleteWarehouseDisplayBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkDeleteWarehouseDisplayBeforeCustomization(), true);
	   
	  }
	  
	  
	  @Test(priority=634)
	  public void verifyAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkAddGroupButton(), true);
	   
	  }
	  
	  @Test(priority=635)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption(), true);
	   
	  }
	  
	  
	  @Test(priority=636)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption(), true);
	   
	  }
	  
	  @Test(priority=637)
	  public void verifySaveButtonInAddGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkSaveButtonInAddGroupWithInputingMandatoryFields(), true);
	   
	  }
	  
	  
	  @Test(priority=638)
	  public void verifyBinsAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkWarehouseAddGroupCreationScreenAfterSaving(), true);
	   
	  }
	  
	  
	  @Test(priority=639)
	  public void verifyWarehouseAddGroupNewCreateDisplayInWarehouseGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkWarehouseAddGroupNewCreateDisplayInWarehouseGrid(), true);
	   
	  }
	  
	  @Test(priority=640)
	  public void verifyEditOptionForNewlyCreateAddGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkEditOptionForNewlyCreateAddGroupWarehouse(), true);
	   
	  }
	  
	  
	  @Test(priority=641)
	  public void verifyUpateForNewlyCreateAddGroupWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkUpateForNewlyCreateAddGroupWarehouse(), true);
	   
	  }
	  
	  @Test(priority=642)
	  public void verifyUpdatedWarehouseGroupDisplayInWarehouseGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkUpdatedWarehouseGroupDisplayInWarehouseGrid(), true);
	   
	  }
	  
	  @Test(priority=643)
	  public void verifyClickOnGroupToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkClickOnGroupToDisplayEmpty(), true);
	   
	  }
	  
	  @Test(priority=644)
	  public void verifySaveWarehouseInWarehouseGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkSaveWarehouseInWarehouseGroup(), true);
	   
	  }
	  
	  
	  @Test(priority=645)
	  public void verifyCloseOptionInWarehouseCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCloseOptionInWarehouseCreation(), true);
	   
	  }
 
	  @Test(priority=646)
	  public void verifyWarehouseFirstLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkWarehouseFirstLevel(), true);
	   
	  }
	  
	/*  @Test(priority=647)
	  public void verifyCloseWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCloseWarehouseMaster(), true);
	   
	  }*/
	  
	  
	  
	  
	  
	  @Test(priority=648)
	  public void verifyCustomizeMasterTabOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCustomizeMasterTabOption(), true);
	   
	  }
	  
	  @Test(priority=649)
	  public void verifyCustomizeMasterTabMasterFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCustomizeMasterTabMasterFieldsOption(), true);
	   
	  }
	  
	  @Test(priority=650)
	  public void verifyGeneralTabOptionMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=651)
	  public void verifyGeneralTabOptionHeaderDetailsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster(), true);
	   
	  }
	  
	  

	  @Test(priority=652)
	  public void verifyEditBinInMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkEditBinInMainTabInCustomizeMaster(), true);
	   
	  }
	  
	  @Test(priority=653)
	  public void verifyUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
	   
	  }

	  
	  @Test(priority=654)
	  public void verifyCloseBtnOpenWarehouseMasterUpdateWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCloseBtnOpenWarehouseMasterUpdateWarehouse(), true);
	   
	  }
	  
	  
	  @Test(priority=655)
	  public void checkEditMasterUpdateWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkEditMasterUpdateWarehouse(), true);
	   
	  }
	  
	  @Test(priority=656)
	  public void checkEditMasterUpdateWarehouseWH1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkEditMasterUpdateWarehouseWH1(), true);
	   
	  }
	  
	  
	 
	  @Test(priority=657)
	  public void checkCloseBtnInWarehouseMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mwp=new MasterWarehousePage(getDriver());
		  Assert.assertEquals(mwp.checkCloseBtnInWarehouseMaster(), true);
	   
	  }
	}
