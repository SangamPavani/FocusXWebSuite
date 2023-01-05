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
import com.focus.base.BaseEngine;

public class MasterDepartmentTest extends BaseEngine
{

	MasterDepartmentPage mdp;
	
	  @Test(priority=559)
	  public void verifyOpenDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkOpenDepartmentMenu(), true);
	   
	  }

	  @Test(priority=560)
	  public void checkMainOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkMainOptionsDepartmentMenu(), true);
	   
	  }
	
	 @Test(priority=561)
	  public void checkToolsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkToolsOptionsDepartmentMenu(), true);
	   
	  }
	 
	 
	  @Test(priority=562)
	  public void checkOtherToolsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkOtherToolsOptionsDepartmentMenu(), true);
	   

	   
	  }
	 
	  @Test(priority=563)
	  public void checkTreeViewOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkTreeViewOptionsDepartmentMenu(), true);
	   

	  }
	 
	  @Test(priority=564)
	  public void checkCreateTreeToggleOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkCreateTreeToggleOptionsDepartmentMenu(), true);

	   
	  }

	 
	 
	  @Test(priority=565)
	  public void checkCreateViewToggleOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkCreateViewToggleOptionsDepartmentMenu(), true);

	   
	  }
	  
	  
	 
	  @Test(priority=566)
	  public void checkHideAccountGroupsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkHideAccountGroupsOptionsDepartmentMenu(), true);
	   

	   
	  }
	   
	  
	  @Test(priority=567)
	  public void checkMainPageHeaderFieldsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkMainPageHeaderFieldsOptionsDepartmentMenu(), true);
	   

	   
	  }
	  
	/*  @Test(priority=568)
	  public void checkSearchOptionsInMainPageHeaderFieldsOptionsDepartmentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkSearchOptionsInMainPageHeaderFieldsOptionsDepartmentMenu(), true);

	   
	  }*/
	
	  
	  @Test(priority=569)
	  public void verifyNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkNewButton(), true);
	   
	  }

	  
	  
	  @Test(priority=570)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkSaveButtonWithoutInputNameMandatoryFieldsInNew(), true);
	   
	  }
	  
	  
	  @Test(priority=571)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkSaveButtonWithoutInputCodeMandatoryFieldsInNew(), true);
	   
	  }
	  
	  
	  @Test(priority=572)
	  public void verifySaveButtonWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkSaveButtonWithInputingMandatoryFields(), true);
	   
	  }
	  
	  
	  @Test(priority=573)
	  public void verifyDepartmentCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkDepartmentCreationScreenAfterSaving(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=574)
	  public void verifyNewlyCreatedDepartmentDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkNewlyCreatedDepartmentDisplayInGrid(), true);
	   
	  }
	  
	  
	  @Test(priority=575)
	  public void verifyEditOptionForNewlyCreatedDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkEditOptionForNewlyCreatedDepartment(), true);
	   
	  }
	  
	  
	  @Test(priority=576)
	  public void verifyUpateForNewlyCreateDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkUpateForNewlyCreateDepartment(), true);
	   
	  }
	  
	  
	  
	  
	  @Test(priority=577)
	  public void verifyCloneButtonAndSaveInDepartmentMasterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkCloneButtonAndSaveInDepartmentMasterCreation(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=578)
	  public void verifykDepartmentDisplayInUnitsSavingWithCloneMasterCreationOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkDepartmentDisplayInUnitsSavingWithCloneMasterCreationOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=579)
	  public void verifyCloneButtonAndSaveInUnitsMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkCloneButtonAndSaveInUnitsMasterOptions(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=580)
	  public void verifyUnitDisplayInUnitsSavingWithCloneMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkUnitDisplayInUnitsSavingWithCloneMasterOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=581)
	  public void verifyCopyOptionByPasteOptionWithNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkCopyOptionByPasteOptionWithNewButton(), true);
	   
	  }
	  
	  @Test(priority=582)
	  public void verifySaveDepartmentUsingCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkSaveDepartmentUsingCopyAndPaste(), true);
	   
	  }
	  
	  
	  @Test(priority=583)
	  public void verifyDepartmentDisplaySavingWithCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkDepartmentDisplaySavingWithCopyAndPaste(), true);
	   
	  }
	  
	  @Test(priority=584)
	  public void verifyDepartmentMasterProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkDepartmentMasterProperties(), true);
	   
	  }
		  
	  @Test(priority=585)
	  public void verifyInActiveBySelectingOkButtonInPropertiesOptionForDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkInActiveBySelectingOkButtonInPropertiesOptionForDepartment(), true);
	   
	  }
	 	  
	  @Test(priority=586)
	  public void verifyCreateNewDepartmentForDeleteOptionValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkCreateNewDepartmentForDeleteOptionValidationMessage(), true);
	   
	  }
	  
	  @Test(priority=587)
	  public void verifyOkInDeleteValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkOkInDeleteValidationMessage(), true);
	   
	  }
	  
	  @Test(priority=588)
	  public void verifyDeleteDepartmentDisplayBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkDeleteDepartmentDisplayBeforeCustomization(), true);
	   
	  }
	  
	 
	  @Test(priority=589)
	  public void verifyAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkAddGroupButton(), true);
	   
	  }
	  
	  @Test(priority=590)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption(), true);
	   
	  }
	  
	  @Test(priority=591)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption(), true);
	   
	  }
	  
	  @Test(priority=592)
	  public void verifySaveButtonInAddGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkSaveButtonInAddGroupWithInputingMandatoryFields(), true);
	   
	  }
	  
	  @Test(priority=593)
	  public void verifyBinsAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkBinsAddGroupCreationScreenAfterSaving(), true);
	   
	  }
	  
	  @Test(priority=594)
	  public void verifyBinsAddGroupNewCreateDisplayInBinsGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkBinsAddGroupNewCreateDisplayInBinsGrid(), true);
	   
	  }
	  
	  @Test(priority=595)
	  public void verifyEditOptionForNewlyCreateAddGroupBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkEditOptionForNewlyCreateAddGroupBins(), true);
	   
	  }
	  
	  @Test(priority=596)
	  public void checkUpateForNewlyCreateAddGroupDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkUpateForNewlyCreateAddGroupDepartment(), true);
	   
	  }
	  
	  @Test(priority=597)
	  public void verifyUpdatedBinGroupDisplayInBinGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkUpdatedBinGroupDisplayInBinGrid(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=598)
	  public void verifyClickOnGroupToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkClickOnGroupToDisplayEmpty(), true);
	   
	  }
	  
	  
	  @Test(priority=599)
	  public void verifySaveDepartmentInDepartmentGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkSaveDepartmentInDepartmentGroup(), true);
	   
	  }
	  
	  
	  @Test(priority=600)
	  public void verifyCloseOptionInBinsCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkCloseOptionInBinsCreation(), true);
	   
	  }
	  
	  
	  @Test(priority=601)
	  public void verifyBinFirstLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkBinFirstLevel(), true);
	   
	  }
	  
	  
	
	  
	  @Test(priority=602)
	  public void verifyCloseBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {

		  mdp=new MasterDepartmentPage(getDriver());
		  Assert.assertEquals(mdp.checkCloseBinsMaster(), true);
	   
	  }
	  
	  
	 
	  
}
