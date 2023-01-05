package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.MasterAccountsPage;
import com.focus.base.BaseEngine;

public class MasterAccountsTest extends BaseEngine 
{
	MasterAccountsPage map;

	  @Test(priority=232)
	  public void verifyOpenAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOpenAccountsMenu(), true);
	   
	  }
  	
	  @Test(priority=233)
	  public void verifyMainOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMainOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=234)
	  public void verifyToolsOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkToolsOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=235)
	  public void verifyToolsOtherOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOtherToolsOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=236)
	  public void verifyTreeViewOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkTreeViewOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=237)
	  public void verifyGroupOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkGroupOptionsAccountsMenu(), true);
	   
	  }
	 
	 
	  @Test(priority=238)
	  public void verifyCreateTreeToggleOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateTreeToggleOptionsAccountsMenu(), true);
	   
	  }


	  @Test(priority=239)
	  public void verifyCreateViewToggleOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateViewToggleOptionsAccountsMenu(), true);
	   
	  }

	 
	  @Test(priority=240)
	  public void verifyHideAccountGroupsDisplayOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkHideAccountGroupsOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=241)
	  public void verifyUnHideAccountGroupsDisplayOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUnHideAccountGroupsOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=242)
	  public void checkValidationHideAccountGroupsOptionsAccountsMenuBySelectingNewBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkValidationHideAccountGroupsOptionsAccountsMenuBySelectingNewBtn(), true);
	   
	  }
	 
	  
	 
	  @Test(priority=243)
	  public void verifyMainPageHeaderFieldsOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMainPageHeaderFieldsOptionsAccountsMenu(), true);
	   
	  }
	 
	// @Test(priority=243)
	  /*public void verifySearchOptionsInMainPageHeaderFieldsOptionsAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSearchOptionsInMainPageHeaderFieldsOptionsAccountsMenu(), true);
	   
	  }
	 */
	 
	  @Test(priority=244)
	  public void verifyAccountMasterDisplayInMainPageGridAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAccountsMasterDisplayInMainPageGridAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=245)
	  public void verifyNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNewButtonBeforeCustomization(), true);
	   
	  }
	 
	  @Test(priority=246)
	  public void verifyGenralTabOnClickOnNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkGenralTabOnClickOnNewButtonBeforeCustomization(), true);
	   
	  }
	  
	  @Test(priority=247)
	  public void verifySettingsTabOnClickOnNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSettingsTabOnClickOnNewButtonBeforeCustomization(), true);
	   
	  }
	  
	  
	  @Test(priority=248)
	  public void verifyDetailsTabOnClickOnNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDetailsTabOnClickOnNewButtonBeforeCustomization(), true);
	   
	  }
	  
	  @Test(priority=249)
	  public void verifyPrintlayoutTabOnClickOnNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPrintlayoutTabOnClickOnNewButtonBeforeCustomization(), true);
	   
	  }
	  
	  
	  @Test(priority=250)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization(), true);
	   
	  }
	  
	  
	  @Test(priority=251)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization(), true);
	   
	  }
	  
	  @Test(priority=252)
	  public void checkSaveButtonWithInputingMandatoryFieldsBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithInputingMandatoryFieldsBeforeCustomization(), true);
	   
	  }
	  
	  @Test(priority=253)
	  public void verifyAccountsCreationScreenAfterSavingBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAccountsCreationScreenAfterSavingBeforeCustomization(), true);
	   
	  }
	  
	  @Test(priority=254)
	  public void verifyAccountDisplayInAccountGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAccountDisplayInAccountGridBeforeCustomization(), true);
	   
	  }
	  
	  @Test(priority=255)
	  public void verifyEditOptionForNewlyCreateAccountBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkEditOptionForNewlyCreateAccountBeforeCustomization(), true);
	   
	  }
	  
	  @Test(priority=256)
	  public void verifyUpateForNewlyCreateAccountBeforeCustomiztaion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUpateForNewlyCreateAccountBeforeCustomiztaion(), true);
	   
	  }
	  

	  @Test(priority=257)
	  public void verifyUpdatedAccountDisplayInAccountGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUpdatedAccountDisplayInAccountGridBeforeCustomization(), true);
	   
	  }
	  
	  
	  @Test(priority=258)
	  public void verifyDeleteAccountBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDeleteAccountBeforeCustomization(), true);
	   
	  }
	  
	  @Test(priority=259)
	  public void verifyDeleteAccountDisplayBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDeleteAccountDisplayBeforeCustomization(), true);
	   
	  }
	  
	  
	  
     //Customize Master
  
	  @Test(priority=260)
	  public void verifyLogoutInAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkLogoutAfterClosingAccountMaster(), true);
	   
	  }
	  
	  @Test(priority=261)
	  public void verifySignToCustomizeMasterInAccounts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSignToCustomizeMasterInAccounts(), true);
	   
	  }
	  
	  
	  @Test(priority=262)
	  public void verifyOpenAccountsMasterAfterLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOpenAccountsMasterAfterLogout(), true);
	   
	  }
	  
	
	  @Test(priority=263)
	  public void verifyCustomizeMasterTabOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCustomizeMasterTabOption(), true);
	   
	  }
	
	 @Test(priority=264)
	  public void verifyCustomizeMasterTabMasterFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCustomizeMasterTabMasterFieldsOption(), true);
	   
	  }
	  
	  
	  @Test(priority=265)
	  public void verifyGeneralTabsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkGeneralTabOptionInCustomizeMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=266)
	  public void verifyGeneralTabMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkGeneralTabOptionMainTabInCustomizeMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=267)
	  public void verifyGeneralTabHeaderTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster(), true);
	   
	  }
	  
	  @Test(priority=268)
	  public void verifySettingsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSettingsTabInCustomizeMaster(), true);
	   
	  }


	  @Test(priority=270)
	  public void verifySettingsTabBodyDetailsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSettingsTabBodyFieldsInCustomizeMaster(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=271)
	  public void verifyDetailsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDetailsTabInCustomizeMaster(), true);
	   
	  }


	  @Test(priority=272)
	  public void verifyDetailsTabHeaderFieldsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDetailsTabHeaderFieldsInCustomizeMaster(), true);
	   
	  }
	  
	  @Test(priority=273)
	  public void verifyDetailsTabBodyDetailsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDetailsTabBodyFieldsInCustomizeMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=274)
	  public void verifyPrintLayoutTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPrintLayoutTabInCustomizeMaster(), true);
	   
	  }


	  @Test(priority=275)
	  public void verifyPrintLayoutTabHeaderFieldsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPrintLayoutTabHeaderFieldsInCustomizeMaster(), true);
	   
	  }
	  
	  @Test(priority=276)
	  public void verifyPrintlayoutTabBodyDetailsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPrintLayoutTabBodyFieldsInCustomizeMaster(), true);
	   
	  }
	 
	  
	  @Test(priority=277)
	  public void verifyUniqueContraintsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUniqueContraintCustomizeMaster(), true);
	   
	  }
	  
	  @Test(priority=278)
	  public void verifyUniqueContraintsOfHeaderFieldsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkHeaderFieldsUniqueContraintCustomizeMaster(), true);
	   
	  }
	  
	  @Test(priority=279)
	  public void verifyRulesInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkRulesInCustomizeMaster(), true);
	   
	  }
	
	  
	  @Test(priority=280)
	  public void verifyExternalModulesInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkExternalModulesInCustomizeMaster(), true);
	   
	  }
	   
	  
	  @Test(priority=281)
	  public void verifyInfoPanelInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkInfoPanelInCustomizeMaster(), true);
	   
	  }
	  
	  @Test(priority=282)
	  public void verifyReportsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkReportsInCustomizeMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=283)
	  public void verifyCreateTabsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateTabsInCustomizeMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=284)
	  public void verifyCreateTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateTabsOptionsInCustomizeMaster(), true);
	   
	  }
	    
	  @Test(priority=285)
	  public void verifyCreateTreeTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateTreeTabOptionsInCustomizeMaster(), true);
	   
	  }
	  
	  @Test(priority=286)
	  public void verifyMandatoryCheckForCreateTreeTabWithAllInputsAreBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMandatoryCheckForCreateTreeTabWithAllInputsAreBlank(), true);
	   
	  }
	  
	
	  @Test(priority=287)
	  public void verifyMandatoryCheckForCreateTreeTabWithCaptionAsBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMandatoryCheckForCreateTreeTabWithCaptionAsBlank(), true);
	   
	  }
	  
	  @Test(priority=288)
	  public void verifyMandatoryCheckForCreateTreeTabNewMasterAsBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMandatoryCheckForCreateTreeTabNewMasterAsBlank(), true);
	   
	  }
	  	 
	  @Test(priority=289)
	  public void verifyMandatoryCheckForCreateTreeTabFieldCaptionAsBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMandatoryCheckForCreateTreeTabFieldCaptionAsBlank(), true);
	   
	  }
	  
	  @Test(priority=290)
	  public void verifyOkCheckForCreateTreeTabWithInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOkCheckForCreateTreeTabWithInput(), true);
	   
	  }
	  
	  @Test(priority=291)
	  public void verifyNewCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNewCreateTreeTabDisplayInTabs(), true);
	   
	  }
	    
	  @Test(priority=292)
	  public void verifyEditPopUpForNewCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkEditPopUpForNewCreateTreeTabDisplayInTabs(), true);
	   
	  }
	  
	  @Test(priority=293)
	  public void verifyCancelEditPopUpForNewCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCancelEditPopUpForNewCreateTreeTabDisplayInTabs(), true);
	   
	  }
	
	  @Test(priority=294)
	  public void verifyOkEditPopUpForNewCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 map=new MasterAccountsPage(getDriver());
		 Assert.assertEquals(MasterAccountsPage.checkOkEditPopUpForNewCreateTreeTabDisplayInTabs(), true);
	  }
	 
	  @Test(priority=295)
	  public void verifyHeaderDetailsTabWithBlankForCreateTreeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkHeaderDetailsTabWithBlankForCreateTreeTab(), true);
	  }
	  
	  @Test(priority=296)
	  public void verifyBodyDetailsTabWithBlankForCreateTreeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkBodyDetailsTabWithBlankForCreateTreeTab(), true);
	  }
	  
	  @Test(priority=297)
	  public void verifyConfirmmationMessageOnDeleteTabOptionForCreateTreeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs(), true);
	  }
	  
	  
	  @Test(priority=298)
	  public void verifyNoConfirmmationMessageOnDeleteTabOptionForCreateTreeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNoConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs(), true);
	  }
	  
	  
	  @Test(priority=299)
	  public void verifyYesConfirmmationMessageOnDeleteTabOptionForCreateTreeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkYesConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs(), true);
	  }
	  
	  @Test(priority=300)
	  public void verifyCreateDocumentTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateDocumentTabOptionsInCustomizeMaster(), true);
	  }
	  
	  @Test(priority=301)
	  public void verifyMandatoryCheckInDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMandatoryCheckInDocumentTab(), true);
	  }
	  
	  @Test(priority=302)
	  public void verifyOKWithInputCheckInDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOKWithInputCheckInDocumentTab(), true);
	  }
	 
	  
	  @Test(priority=303)
	  public void verifyHeaderDetailsTabWithBlankForCreateDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkHeaderDetailsTabWithBlankForCreateDocumentTab(), true);
	  }
	  
	  @Test(priority=304)
	  public void verifyBodyDetailsTabWithBlankForCreateDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkBodyDetailsTabWithBlankForCreateDocumentTab(), true);
	  }
	  
	  @Test(priority=305)
	  public void verifyCreateDocumentTabCreationWithExistingDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateDocumentTabCreationWithExistingDocumentTab(), true);
	  }
	  
	
	  @Test(priority=306)
	  public void verifyCreateCreateTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateCreateTabOptionsInCustomizeMaster(), true);
	  }
	  
      @Test(priority=307)
	  public void verifyMandatoryCheckInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMandatoryCheckInCreateCreateTab(), true);
	  }
	  
	  @Test(priority=308)
	  public void verifyOkButtonWithAllInputInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOkButtonWithAllInputInCreateCreateTab(), true);
	  }
	 
	  
	  @Test(priority=309)
	  public void verifyCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateCreateTabDisplayInCustomizeTab(), true);
	  }

	  
	  @Test(priority=310)
	  public void verifyHeaderDetailsTabInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkHeaderDetailsTabInCreateCreateTab(), true);
	  }

	  
	  @Test(priority=311)
	  public void verifyBodyDetailsTabInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkBodyDetailsTabInCreateCreateTab(), true);
	  }

	  @Test(priority=312)
	  public void verifyAddOptionInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAddOptionInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  @Test(priority=314)
	  public void verifyFieldsDetailsTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkFieldsDetailsTabInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  @Test(priority=315)
	  public void verifyPropertiesTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPropertiesTabInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  
	  @Test(priority=316)
	  public void verifyFormattingTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkFormattingTabInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  @Test(priority=317)
	  public void verifyRulesTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkRulesTabInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  
	  @Test(priority=318)
	  public void verifyRulesOptionsTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkRulesOptionsTabInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  
	  @Test(priority=319)
	  public void verifyExternalModulesTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkExternalModulesTabInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  
	  @Test(priority=320)
	  public void verifyMandatoryFieldsByClickOnOkButtonCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMandatoryFieldsByClickOnOkButtonCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  
	  
	  @Test(priority=321)
	  public void verifyCloseButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCloseButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	
	  @Test(priority=322)
	  public void verifyOkButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOkButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  
	  @Test(priority=323)
	  public void verifyCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	 
	  
	  @Test(priority=324)
	  public void verifyEditCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkEditCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  
	  @Test(priority=325)
	  public void verifyUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  
	  @Test(priority=326)
	  public void verifyUpdateFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUpdateFieldInCreateCreateTabDisplayInCustomizeTab(), true);
	  }
	  
	  @Test(priority=327)
	  public void verifyCreateExtraFieldAfterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateExtraFieldAfterCreation(), true);
	  }	  
	  

	  @Test(priority=328)
	  public void verifyMoveExtraFieldAfterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMoveExtraFieldAfterCreation(), true);
	  }	  
	  
	  
	 @Test(priority=329)
	  public void verifyTabsAvailableInTabsOfMoveField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkTabsAvailableInTabsOfMoveField(), true);
	  }	  
	  
	  
	  @Test(priority=330)
	  public void verifyCancelButtonInMoveField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCancelButtonInMoveField(), true);
	  }
	  
	  @Test(priority=331)
	  public void verifyOkButtonInMoveField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOkButtonInMoveField(), true);
	  }
	 
	
	  @Test(priority=332)//issue
	  public void verifyMoveFieldMovedToSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMoveFieldMovedToSettingsTab(), true);
	  }
	  
	  
	  @Test(priority=333)
	  public void verifyDefaultFieldMoveInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDefaultFieldMoveInSettingsTab(), true);
	  }
	  
	  @Test(priority=334)
	  public void verifyDefaultDeleteInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDefaultDeleteInSettingsTab(), true);
	  }
	  
	  
	  @Test(priority=335)
	  public void verifyMoveDeleteInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMoveDeleteInSettingsTab(), true);
	  }
	  
	  
	  @Test(priority=336)
	  public void verifyNoOptionMoveDeleteInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNoOptionMoveDeleteInSettingsTab(), true);
	  }
	  
	  
	  @Test(priority=337)
	  public void verifyYesOptionMoveDeleteInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkYesOptionMoveDeleteInSettingsTab(), true);
	  }
	  
	  
	  @Test(priority=338)
	  public void verifyPreviewButtonBeforeLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPreviewButtonBeforeLogout(), true);
	  }
	  
	  
	  @Test(priority=339)
	  public void verifyCloseBtnPreviewOptionBeforeLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCloseBtnPreviewButtonBeforeLogout(), true);
	  }
	  
	  //Here we need to logouut the company and 
	  
	  
	  
	  @Test(priority=340)
	  public void verifyLogoutAfterAddingTabsInCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkLogoutAfterCustomization(), true);
	  }
	  
	  
	  @Test(priority=341)
	  public void verifySignToCheckTabsInCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSignToCheckTabsInCustomization(), true);
	  }
	 
	  @Test(priority=342)
	  public void verifyOpenAccountsMasterAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOpenAccountsMasterAfterCustomization(), true);
	  }
	 
	  
	  @Test(priority=343)
	  public void verifyCustomizeMasterTabOptionAfterAddingTabsWithLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCustomizeMasterTabOptionAfterAddingTabsWithLogout(), true);
	  }
	  
	  @Test(priority=344)
	  public void verifyCustomizeMasterTabMasterFieldsOptionAfterAddingTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCustomizeMasterTabMasterFieldsOptionAfterAddingTabs(), true);
	  }
	  
	  
	  @Test(priority=345)
	  public void checkPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPreviewOption(), true);
	  }
	  
	  
	  
	  @Test(priority=346)
	  public void verifyGeneralTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkGeneralTabInPreviewOption(), true);
	  }
	  
	  
	  
	  @Test(priority=347)
	  public void verifySettingsTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSettingsTabInPreviewOption(), true);
	  }
	  
	  
	  @Test(priority=348)
	  public void verifyDetailsTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDetailsTabInPreviewOption(), true);
	  }
	  
	  
	  @Test(priority=349)
	  public void verifyPrintLayoutsTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPrintLayoutTabInPreviewOption(), true);
	  }
	  
	  @Test(priority=350)
	  public void verifyTreeTabUpdateInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkTreeTabUpdateInPreviewOption(), true);
	  }
	  
	  @Test(priority=351)
	  public void verifyDocumentTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDocumentTabInPreviewOption(), true);
	  }
	  
	  @Test(priority=352)
	  public void verifyCreateTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCreateTabInPreviewOption(), true);
	  }
	  
	  @Test(priority=353)
	  public void verifyCloseBtnPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCloseBtnPreviewOption(), true);
	  }
	  

	  @Test(priority=354)
	  public void verifyCloseBtnCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCloseBtnCustomizeMaster(), true);
	  }
	  

  
	  
	  @Test(priority=355)
	  public void verifyMasterCmbMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkMasterCmbMasters(), true);
	  }

  

	  @Test(priority=356)
	  public void verifySelectAccountGroupAccountMasterDisplayInMainPageGridAccountsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSelectAccountGroupSelectionAccountsMasterDisplayInMainPageGridAccountsMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=357)
	  public void verifyNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNewButton(), true);
	   
	  }
	  
	  @Test(priority=358)
	  public void verifyGeneralTabOptionsButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkGenralTabOnClickOnNewButton(), true);
	   
	  }
	  
	  @Test(priority=359)
	  public void verifySettingsTabOptionsButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSettingsTabOnClickOnNewButton(), true);
	   
	  }
	  
	  @Test(priority=360)
	  public void verifyDetailsTabOptionsButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDetailsTabOnClickOnNewButton(), true);
	   
	  }
	  
	  @Test(priority=361)
	  public void verifyPrintLayoutTabOptionsButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPrintlayoutTabOnClickOnNewButton(), true);
	   
	  }
	  
	  
	  @Test(priority=362)
	  public void verifyNewTreeTabUpdateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNewTreeTabUpdateTab(), true);
	   
	  }
	  
	  
	  @Test(priority=363)
	  public void verifyNewDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNewDocumentTab(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=364)
	  public void verifyNewInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNewInCreateTab(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=365)
	  public void verifySaveButtonWithoutInputingNameMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithoutInputNameMandatoryFieldsInNewOption(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=366)
	  public void verifySaveButtonWithoutInputingCodeMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOption(), true);
	   
	  }
	  
	  @Test(priority=367)
	  public void verifySaveButtonWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithInputingMandatoryFields(), true);
	   
	  }
	  

	  
	 
	  
	  @Test(priority=368)
	  public void verifyAccountCreateDisplayInAccountsGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAccountDisplayInAccountGrid(), true);
	   
	  }
	  
	  
	  @Test(priority=370)
	  public void verifyAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAddGroupButton(), true);
	   
	  }
	  
	  @Test(priority=371)
	  public void verifyGenralTabOnClickOnAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkGenralTabOnClickOnAddGroupButton(), true);
	   
	  }
	  
	  
	  @Test(priority=372)
	  public void verifySettingsTabOnClickOnAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSettingsTabOnClickOnAddGroupButton(), true);
	   
	  }
	  
	  @Test(priority=373)
	  public void verifyDetailsTabOnClickOnAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDetailsTabOnClickOnAddGroupButton(), true);
	   
	  }
	  
	  @Test(priority=374)
	  public void verifyPrintlayoutTabOnClickOnAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPrintlayoutTabOnClickOnAddGroupButton(), true);
	   
	  }
	  
	  @Test(priority=375)
	  public void verifyNewTreeTabUpdateTabGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNewTreeTabUpdateTabGroup(), true);
	   
	  }
	  
	  @Test(priority=376)
	  public void verifyNewDocumentTabGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNewDocumentTabGroup(), true);
	   
	  }
	  
	  @Test(priority=377)
	  public void verifyNewInCreateTabGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkNewInCreateTabGroup(), true);
	   
	  }
	  
	  @Test(priority=378)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption(), true);
	   
	  }
	  
	  @Test(priority=379)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=380)
	  public void verifySaveButtonInAddGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonInAddGroupWithInputingMandatoryFields(), true);
		  
	   
	  }
	  
	  
	 @Test(priority=381)
	  public void verifyAccountAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAccountAddGroupCreationScreenAfterSaving(), true);
	   
	  }
	  
	
	
	  @Test(priority=382)
	  public void verifyAccountNewlyAddGroupDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAccountAddGroupNewCreateDisplayInAccountGrid(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=383)
	  public void verifyEditOptionForNewlyCreateAddGroupAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkEditOptionForNewlyCreateAddGroupAccount(), true);
	   
	  }
	  
	  @Test(priority=384)
	  public void verifyUpateForNewlyCreateAddGroupAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUpateForNewlyCreateAddGroupAccount(), true);
	   
	  }
	  
	  
	  @Test(priority=385)
	  public void verifyUpdatedAccountAddGroupDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUpdatedAccountGroupDisplayInAccountGrid(), true);
	   
	  }
	  
	  @Test(priority=386)
	  public void verifyEditOptionForNewlyCreateAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkEditOptionForNewlyCreateAccount(), true);
	   
	  }
	  
	   
	  @Test(priority=387)
	  public void verifyUpateForNewlyCreateAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUpateForNewlyCreateAccount(), true);
	   
	  }
	  
	  @Test(priority=388)
	  public void verifyUpdatedAccountDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkUpdatedAccountDisplayInAccountGrid(), true);
	   
	  }
	  
	  
	  @Test(priority=389)
	  public void verifyClickOnGroupToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkClickOnGroupToDisplayEmpty(), true);
	   
	  }
	  

	  @Test(priority=390)
	  public void verifyCloseAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCloseAccountMaster(), true);
	   
	  }
	  
	 
	  @Test(priority=391)
	  public void verifyCloneOptionWithoutRowSelectToOpenAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCloneOptionWithoutRowSelectToOpenAccountsMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=392)
	  public void verifyAccountOneCreationWithPropertyAsCDForEachUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAccountOneCreationWithPropertyAsCDForEachUnderGroup(), true);
	   
	  }
	 	 
	  
      @Test(priority=393)
	  public void verifyByCloneOptionAccountInformation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkByCloneOptionAccountInformation(), true);
	   
	  }
	  
	
	  @Test(priority=394)
	  public void verifySaveAccountByUsingCloneOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveAccountByUsingCloneOption(), true);
	   
	  }
	  
	  @Test(priority=395)
	  public void verifyAccountDisplayCreationOfAccountThroughMainClone() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkAccountDisplayCreationOfAccountThroughMainClone(), true);
	   
	  }
	  
	 
	  
	  
	  @Test(priority=396)
	  public void verifyCloneOptionInEditAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCloneOptionInEditAccount(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=397)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInCloneOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithoutInputNameMandatoryFieldsInCloneOption(), true);
	   
	  }
	  
	  
	  @Test(priority=398)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInCloneOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveButtonWithoutInputCodeMandatoryFieldsInCloneOption(), true);
	   
	  }
	  
	  @Test(priority=399)
	  public void verifySaveAccountByUsingEditCloneInMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveAccountByUsingEditCloneInMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=400)
	  public void verifyCloneByEditCreationOfAccountDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCloneByEditCreationOfAccountDisplay(), true);
	   
	  }  
	  
	  @Test(priority=401)
	  public void verifyCopyOptionByEditAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCopyOptionByEditAccount(), true);
	   
	  }
	  
	  @Test(priority=404)
	  public void verifyPasteOptionAndClickOnSaveForDuplicateName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPasteOptionAndClickOnSaveForDuplicateName(), true);
	   
	  }
	  
	  
	  @Test(priority=405)
	  public void verifySaveUsingCopyAndPasteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveUsingCopyAndPasteOption(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=406)
	  public void verifyCopyAndPasteCreationOfAccountDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCopyAndPasteCreationOfAccountDisplay(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=407)
	  public void verifyCopyPasteAccountInformationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCopyPasteAccountInformationOption(), true);
	   
	  }
	  
	  
	  @Test(priority=408)
	  public void verifyPropertiesOptionForAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPropertiesOptionForAccount(), true);
	   
	  }
	  
	  
	  @Test(priority=409)
	  public void verifyCancelButtonInPropertiesOptionForAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCancelButtonInPropertiesOptionForAccount(), true);
	   
	  }
	  
	  @Test(priority=410)
	  public void verifyDeleteOptionWithoutSelectAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDeleteOptionWithoutSelectAccount(), true);
	   
	  }
	  
	  
	  @Test(priority=411)
	  public void verifyDeleteOptionWithSelectAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDeleteOptionWithSelectAccount(), true);
	   
	  }
	  
	  
	  @Test(priority=412)
	  public void verifyCancelButtonInDeleteAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCancelButtonInDeleteAccount(), true);
	   
	  }
	  
	  
	  @Test(priority=413)
	  public void verifyYesDeleteAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkYesDeleteAccount(), true);
	   
	  }
	  
	  
	  @Test(priority=414)
	  public void verifyDeleteAccountDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkDeleteAccountDisplay(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=415)
	  public void verifyPropertiesOptionForAccountGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkPropertiesOptionForAccountGroup(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=416)
	  public void verifyOkButtonInPropertiesOptionForAccountGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkOkButtonInPropertiesOptionForAccountGroup(), true);
	   
	  }
	  
	  @Test(priority=417)
	  public void checkSaveCOGSAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveCOGSAccount(), true);
	   
	  }
	  
	  @Test(priority=418)
	  public void checkSaveAccountsByCreatingVATAccounts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkSaveAccountsByCreatingVATAccounts(), true);
	   
	  }
	  
	  
	  @Test(priority=419)
	  public void verifyCloseAccountMasterForAccountTestingStop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(MasterAccountsPage.checkCloseAccountMasterForAccountTestingStop(), true);
	   
	  }
}
	 
	/*	  
	  // This below Code is not use	  
		  
	  @Test(priority=395)
	  public void verifyClickOnAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkClickOnAddGroup(), true);
	  }
	  
	  
	  @Test(priority=396)
	  public void verifyAddGroupGeneralTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkAddGroupGeneralTab(), true);
	  }
	  
	  @Test(priority=397)
	  public void verifyAddGroupSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkAddGroupSettingsTab(), true);
	  }
	  
	  @Test(priority=398)
	  public void verifyAddGroupDetailsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkAddGroupDetailsTab(), true);
	  }
	  
	  @Test(priority=399)
	  public void verifyAddGroupPrintLayoutTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkAddGroupPrintLayoutTab(), true);
	  }
	  
	  
	  @Test(priority=400)
	  public void verifyAddGroupTreeTabUpdateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkAddGroupTreeTabUpdateTab(), true);
	  }
	  
	  
	  @Test(priority=401)
	  public void verifyAddGroupDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkAddGroupDocumentTab(), true);
	  }
	  
	  
	  @Test(priority=402)
	  public void verifyAddGroupCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkAddGroupCreateTab(), true);
	  }
	  
	  
	  @Test(priority=403)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroup(), true);
	  }
	  
	  
	  @Test(priority=404)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroup(), true);
	  }
	  
	  
	  
	  
	  
	  
	  
	  @Test(priority=405)
	  public void verifySaveButtonWithInputingMandatoryFieldsInAdGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkSaveButtonWithInputingMandatoryFieldsInAdGroup(), true);
	  }
	  
	  @Test(priority=406)
	  public void verifyAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkAddGroupCreationScreenAfterSaving(), true);
	  }
	  
	  
	  @Test(priority=407)
	  public void verifyAccountGroupDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkAccountGroupDisplayInAccountGrid(), true);
	  }
	  
	  
	  @Test(priority=408)
	  public void verifyCreateAcountInAccountGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkCreateAcountInAccountGroup(), true);
	  }
	  
	  

	  @Test(priority=409)
	  public void verifyNewButtonInAddGroupToCreateAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkNewButtonInAddGroupToCreateAccount(), true);
	  }
	  
	  
	  @Test(priority=410)
	  public void verifykGenralTabOnClickOnNewUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGenralTabOnClickOnNewUnderAddGroup(), true);
	  }
	  
	  
	  @Test(priority=357)
	  public void verifySettingsTabOnClickOnNewUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkSettingsTabOnClickOnNewUnderAddGroup(), true);
	  }
	  
	  
	  
	  @Test(priority=358)
	  public void verifyDetailsTabOnClickOnNewUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkDetailsTabOnClickOnNewUnderAddGroup(), true);
	  }
	  
	  
	  
	  @Test(priority=359)
	  public void verifyPrintlayoutTabOnClickOnNewAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkPrintlayoutTabOnClickOnNewAddGroup(), true);
	  }
	  
	  
	 
	  @Test(priority=360)
	  public void verifyNewAccountUnderAddGroupTreeTabUpdateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkNewAccountUnderAddGroupTreeTabUpdateTab(), true);
	  }
	  
	  @Test(priority=361)
	  public void verifyNewUnderAddGroupDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkNewUnderAddGroupDocumentTab(), true);
	  }
	  
	  @Test(priority=362)
	  public void verifyNewUnderAddGroupCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkNewUnderAddGroupCreateTab(), true);
	  }
	  
	  @Test(priority=363)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInCreateAccountUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkSaveButtonWithoutInputNameMandatoryFieldsInCreateAccountUnderAddGroup(), true);
	  }
	  
	  @Test(priority=364)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInCreateAccountUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkSaveButtonWithoutInputCodeMandatoryFieldsInCreateAccountUnderAddGroup(), true);
	  }
	  
	  
	  @Test(priority=365)
	  public void verifySaveButtonWithInputingMandatoryFieldsInCreateAccountUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkSaveButtonWithInputingMandatoryFieldsInCreateAccountUnderAddGroup(), true);
	  }
	  
	  
	  @Test(priority=366)
	  public void verifyCreationScreenAfterSavingInCreateAccountUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkCreationScreenAfterSavingInCreateAccountUnderAddGroup(), true);
	  }
	  
	  
	    
	  //@Test(priority=367)
	  public void verifyGroupOptionToCreateAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupOptionToCreateAccount(), true);
	  }
	  
	  //@Test(priority=368)
	  public void verifyCloseOptionAccountDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkCloseOptionAccountDisplayInAccountGrid(), true);
	  }
	  
	  //@Test(priority=369)
	  public void verifyValidationMessageToClickOnGroupWithoutSelectingAccountToSelectAboveAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkValidationMessageToClickOnGroupWithoutSelectingAccountToSelectAboveAccount(), true);
	  }
	  
	  
	  //@Test(priority=370)
	  public void verifyClickOnGroupWithSelectingAccountToSelectAboveAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkClickOnGroupWithSelectingAccountToSelectAboveAccount(), true);
	  }
	  

	  //@Test(priority=371)
	  public void verifyGroupGeneralTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupGeneralTab(), true);
	  }
	  
	  //@Test(priority=372)
	  public void verifyGroupSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupSettingsTab(), true);
	  }
	  
	  
	  //@Test(priority=373)
	  public void verifyGroupDetailsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupDetailsTab(), true);
	  }
	  
	  //@Test(priority=374)
	  public void verifyGroupPrintLayoutTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupPrintLayoutTab(), true);
	  }
	  
	  
	  //@Test(priority=375)
	  public void verifyGroupTreeTabUpdateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupTreeTabUpdateTab(), true);
	  }
	  
	  
	  //@Test(priority=376)
	  public void verifyGroupDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupDocumentTab(), true);
	  }
	  
	  
	  //@Test(priority=377)
	  public void verifyGroupCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupCreateTab(), true);
	  }
	  
	  
	  
	  //@Test(priority=378)
	  public void verifyInGroupsSaveButtonWithoutInputNameMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkInGroupsSaveButtonWithoutInputNameMandatoryFields(), true);
	  }
	  
	  
	  //@Test(priority=379)
	  public void verifyGroupsSaveButtonWithoutInputCodeMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupsSaveButtonWithoutInputCodeMandatoryFields(), true);
	  }
	  
	  
	  //@Test(priority=380)
	  public void verifyGroupsSaveButtonWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkGroupsSaveButtonWithInputingMandatoryFields(), true);
	  }
	  
	  //@Test(priority=381)
	  public void verifyEditGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkEditGroupOption(), true);
	  }
	  
	  
	 // @Test(priority=382)
	  public void verifyUpdateGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkUpdateGroupOption(), true);
	  }
	  
	 // @Test(priority=383)
	  public void verifyDeleteAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkDeleteAddGroupByCreatingAccountGroupOption(), true);
	  }
	  
	  //@Test(priority=384)
	  public void verifyDeleteAddGroupByCreatingAccountInAccountGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkDeleteAddGroupByCreatingAccountInAccountGroupOption(), true);
	  }
	  
	  //@Test(priority=385)
	  public void verifyDeleteAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkDeleteAddGroup(), true);
	  }
	  
	  //@Test(priority=386)
	  public void verifyCancelButtonInDeleteAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkCancelButtonInDeleteAddGroup(), true);
	  }
	  

	  //@Test(priority=387)
	  public void checkYesDeleteAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  map=new MasterAccountsPage(getDriver());
		  Assert.assertEquals(map.checkYesDeleteAddGroup(), true);
	  }
	  
	  */