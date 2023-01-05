package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.MasterBinsPage;
import com.focus.base.BaseEngine;

public class MasterBinsTest extends BaseEngine
{
	
	MasterBinsPage mbp;
	
	 @Test(priority=505)
	  public void verifyOpenBinssMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkOpenBinsMenu(), true);
	   
	  }
	 
	 @Test(priority=506)
	  public void verifyMainOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkMainOptionsBinsMenu(), true);
	   
	  }
	
	 @Test(priority=507)
	  public void verifyToolsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkToolsOptionsBinsMenu(), true);
	   
	  }
	 
	 
	  @Test(priority=508)
	  public void verifyOtherToolsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkOtherToolsOptionsBinsMenu(), true);
	   
	  }
	 
	  @Test(priority=509)
	  public void verifyTreeViewOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkTreeViewOptionsBinsMenu(), true);
	   
	  }
	 
	  @Test(priority=510)
	  public void verifyCreateTreeToggleOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCreateTreeToggleOptionsBinsMenu(), true);
	   
	  }

	  @Test(priority=511)
	  public void verifyCreateViewToggleOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCreateViewToggleOptionsBinsMenu(), true);
	   
	  }
	 
	  @Test(priority=512)
	  public void verifyHideAccountGroupsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkHideAccountGroupsOptionsBinsMenu(), true);
	   
	  }
	   	  
	  @Test(priority=513)
	  public void verifyMainPageHeaderFieldsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkMainPageHeaderFieldsOptionsBinsMenu(), true);
	   
	  }
	  
	 /* @Test(priority=514) //no need
	  public void verifySearchOptionsInMainPageHeaderFieldsOptionsBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSearchOptionsInMainPageHeaderFieldsOptionsBinsMenu(), true);
	   
	  }*/
	  
	  @Test(priority=515)
	  public void verifyNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkNewButton(), true);
	   
	  }

	  @Test(priority=516)
	  public void verifyGeneralTabFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(mbp.checkGeneralTabFields(), true);
	   
	  }
	  
	//  @Test(priority=517)//no need
	  public void verifyTaskManagerTabFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(mbp.checkTaskManagerTabFields(), true);
	   
	  }
	  
	//  @Test(priority=518)
	  public void verifyDimensionTabFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(mbp.checkDimensionTabFields(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=519)
	  public void verifySaveButtonWithoutInputName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveButtonWithoutInputName(), true);
	   
	  }
	  
	  @Test(priority=520)
	  public void verifySaveButtonWithoutInputCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveButtonWithoutInputCode(), true);
	   
	  }
	 
	  @Test(priority=521)
	  public void verifySaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveButton(), true);
	   
	  }
	  
	  
	  @Test(priority=522)
	  public void verifyBinsCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkBinsCreationScreenAfterSaving(), true);
	   
	  }
	  
	  
	  @Test(priority=523)
	  public void verifyBinsDisplayBinsGridDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkBinsDisplayBinsGridDisplay(), true);
	   
	  }
	  
	  
	  @Test(priority=524)
	  public void verifyEditOptionForNewlyCreatedUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkEditOptionForNewlyCreatedUnit(), true);
	   
	  }
	  
	  
	  @Test(priority=525)
	  public void verifyUpateForNewlyCreateBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkUpateForNewlyCreateBin(), true);
	   
	  }
	  

	  
	  
	  @Test(priority=526)
	  public void verifyUpdatedBinsDisplayInBinMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkUpdatedBinsDisplayInBinMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=527)
	  public void verifyCloneButtonAndSaveInBinsMasterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCloneButtonAndSaveInBinsMasterCreation(), true);
	   
	  }
	  
	  
	  @Test(priority=528)
	  public void verifyBinsDisplayInUnitsSavingWithCloneMasterCreationOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkBinsDisplayInUnitsSavingWithCloneMasterCreationOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=529)//clone issue
	  public void veriyCloneButtonAndSaveInUnitsMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCloneButtonAndSaveInUnitsMasterOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=530)
	  public void verifyBinDisplayInBinSavingWithCloneMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkBinDisplayInBinSavingWithCloneMasterOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=531)//paste depends on clone
	  public void verifyCopyOptionByPasteOptionWithNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCopyOptionByPasteOptionWithNewButton(), true);
	   
	  }
	  
	  @Test(priority=532)
	  public void verifyBinDisplayInBinsSavingWithCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkBinDisplayInBinsSavingWithCopyAndPaste(), true);
	   
	  }
	  
	  @Test(priority=533)
	  public void verifyCreateNewBinForProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCreateNewBinForProperties(), true);
	   
	  }
	  
	  @Test(priority=534)
	  public void verifyInActiveBySelectingOkButtonInPropertiesOptionForBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkInActiveBySelectingOkButtonInPropertiesOptionForBin(), true);
	   
	  }
	  
	  
	  @Test(priority=535)
	  public void verifyCreateNewBinForDeleteOptionValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCreateNewBinForDeleteOptionValidationMessage(), true);
	   
	  }
	  
	  
	  @Test(priority=536)
	  public void verifyOkInDeleteValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkOkInDeleteValidationMessage(), true);
	   
	  }
	  
	  
	  @Test(priority=537)
	  public void verifyDeleteBinDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkDeleteBinDisplay(), true);
	   
	  }
	  
	  
	  @Test(priority=538)
	  public void checkAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkAddGroupButton(), true);
	   
	  }
	  
	  
	  @Test(priority=539)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption(), true);
	   
	  }
	  
	  @Test(priority=540)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption(), true);
	   
	  }
	  
	  @Test(priority=541)
	  public void verifySaveButtonInAddGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveButtonInAddGroupWithInputingMandatoryFields(), true);
	   
	  }
	  
	 
	  @Test(priority=542)
	  public void verifyBinsAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkBinsAddGroupCreationScreenAfterSaving(), true);
	   
	  }
	 
	  @Test(priority=543)
	  public void verifyBinsAddGroupNewCreateDisplayInBinsGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkBinsAddGroupNewCreateDisplayInBinsGrid(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=544)
	  public void verifyEditOptionForNewlyCreateAddGroupBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkEditOptionForNewlyCreateAddGroupBins(), true);
	   
	  }
	  
	  @Test(priority=545)
	  public void verifyUpateForNewlyCreateAddGroupBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkUpateForNewlyCreateAddGroupBin(), true);
	   
	  }
	  
	  
	  @Test(priority=546)
	  public void verifyUpdatedBinGroupDisplayInBinGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkUpdatedBinGroupDisplayInBinGrid(), true);
	   
	  }
	  
	  @Test(priority=547)
	  public void verifyClickOnGroupToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkClickOnGroupToDisplayEmpty(), true);
	   
	  }
	 
	  
	  @Test(priority=548)
	  public void verifySaveBinInBinGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveBinInBinGroup(), true);
	   
	  }
	  
	  
	  @Test(priority=549)
	  public void verifySaveMultipleBinsInBinGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveMultipleBinsInBinGroup(), true);
	   
	  }
	  
	  
	  @Test(priority=550)
	  public void verifyCloseOptionInBinsCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCloseOptionInBinsCreation(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=551)
	  public void verifyBinFirstLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkBinFirstLevel(), true);
	   
	  }
	  
	  
	  
	  
	  
	  @Test(priority=552)
	  public void verifyCloseBinsMasterBeforeGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCloseBinsMasterBeforeGroup(), true);
	   
	  }
	  
	  
	  /*//@Test(priority=553)
	  public void verifySaveBinGroupByOptionGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveBinGroupByOptionGroup(), true);
	   
	  }*/
	  
	  
	  @Test(priority=554)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveButtonWithoutInputNameMandatoryFieldsInGroupOption(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=555)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveButtonWithoutInputCodeMandatoryFieldsInGroupOption(), true);
	   
	  }
	  
	  
	  @Test(priority=556)
	  public void checkSaveButtonInGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkSaveButtonInGroupWithInputingMandatoryFields(), true);
	   
	  }
	  
	  @Test(priority=557)
	  public void verifyBinsGroupNewCreateDisplayInBinsGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkBinsGroupNewCreateDisplayInBinsGrid(), true);
	   
	  }
	  
	  
	  @Test(priority=558)
	  public void verifyCloseBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mbp=new MasterBinsPage(getDriver());
		  Assert.assertEquals(MasterBinsPage.checkCloseBinsMaster(), true);
	   
	  }
	  
	  
}
