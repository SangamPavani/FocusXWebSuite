package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.MasterUnitPage;
import com.focus.base.BaseEngine;

public class MasterUnitTest extends BaseEngine
{

	MasterUnitPage mup;
	
	  @Test(priority=455)
	  public void checkOpenUnitsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkOpenUnitsMenu(), true);
	   
	  }
	 
	  @Test(priority=456)
	  public void verifyMainOptionsUnitsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkMainOptionsUnitsMenu(), true);
	   
	  }
	
	  @Test(priority=457)
	  public void verifyToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkToolsOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=458)
	  public void verifyOtherToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkOtherToolsOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=459)
	  public void verifyTreeViewOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkTreeViewOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=460)
	  public void verifyCreateTreeToggleOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkCreateTreeToggleOptionsAccountsMenu(), true);
	   
	  }

	 
	 
	  @Test(priority=461)
	  public void verifyCreateViewToggleOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkCreateViewToggleOptionsAccountsMenu(), true);
	   
	  }
	 
	  @Test(priority=462)
	  public void verifyHideAccountGroupsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkHideAccountGroupsOptionsAccountsMenu(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=463)
	  public void verifyMainPageHeaderFieldsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkMainPageHeaderFieldsOptionsAccountsMenu(), true);
	   
	  }
	  
	 /* @Test(priority=464)
	  public void verifySearchOptionsInMainPageHeaderFieldsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkSearchOptionsInMainPageHeaderFieldsOptionsAccountsMenu(), true);
	   
	  }*/
	  
	  @Test(priority=465)
	  public void verifyNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkNewButtonBeforeCustomization(), true);
	   
	  }
	  
	  @Test(priority=466)
	  public void verifySaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkSaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization(), true);
	   
	  }

	  @Test(priority=467)
	  public void verifySaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization(), true);
	   
	  }

	  
	  @Test(priority=468)
	  public void verifySaveButtonWithoutInputDecimalsFieldMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkSaveButtonWithoutInputDecimalsFieldMandatoryFieldsInNewOptionBeforeCustomization(), true);
	   
	  }

	  
	  
	  @Test(priority=469)
	  public void verifySaveButtonWithInputingMandatoryFieldsBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkSaveButtonWithInputingMandatoryFieldsBeforeCustomization(), true);
	   
	  }

	  
	  @Test(priority=470)
	  public void verifyUnitsCreationScreenAfterSavingBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUnitsCreationScreenAfterSavingBeforeCustomization(), true);
	   
	  }

	  @Test(priority=471)
	  public void veriyUnitDisplayInUnitsGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUnitDisplayInUnitsGridBeforeCustomization(), true);
	   
	  }

	  @Test(priority=472)
	  public void verifyEditOptionForNewlyCreatedUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkEditOptionForNewlyCreatedUnit(), true);
	   
	  }
	  
	  @Test(priority=473)
	  public void verifyUpateForNewlyCreateAccountBeforeCustomiztaion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUpateForNewlyCreateAccountBeforeCustomiztaion(), true);
	   
	  }
	  
	  
	  @Test(priority=474)
	  public void verifyUpdatedAccountDisplayInAccountGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUpdatedAccountDisplayInAccountGridBeforeCustomization(), true);
	   
	  }
	  
	  
	  @Test(priority=475)
	  public void verifyCloneButtonAndSaveInUnitsMasterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkCloneButtonAndSaveInUnitsMasterCreation(), true);
	   
	  }
	  
	  
	  @Test(priority=476)
	  public void verifyUnitDisplayInUnitsSavingWithCloneMasterCreationOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUnitDisplayInUnitsSavingWithCloneMasterCreationOptions(), true);
	   
	  }
	  
	  @Test(priority=477)
	  public void verifyCloneButtonAndSaveInUnitsMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkCloneButtonAndSaveInUnitsMasterOptions(), true);
	   
	  }
	  
	  @Test(priority=478)
	  public void verifyUnitDisplayInUnitsSavingWithCloneMasterOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUnitDisplayInUnitsSavingWithCloneMasterOptions(), true);
	   
	  }
	  
	  
	  @Test(priority=479)
	  public void verifyCopyOptionByPasteOptionWithNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkCopyOptionByPasteOptionWithNewButton(), true);
	   
	  }
	  
	  
	  @Test(priority=480)
	  public void verifyUnitDisplayInUnitsSavingWithCopyAndPaste() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUnitDisplayInUnitsSavingWithCopyAndPaste(), true);
	   
	  }
	  
	  
	  @Test(priority=481)
	  public void verifyCreateNewUnitForProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkCreateNewUnitForProperties(), true);
	   
	  }
	  
	  
	  @Test(priority=482)
	  public void verifyInActiveBySelectingOkButtonInPropertiesOptionForAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkInActiveBySelectingOkButtonInPropertiesOptionForAccount(), true);
	   
	  }
	  
	  
	  @Test(priority=483)
	  public void verifyCreateNewUnitForDeleteOptionValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkCreateNewUnitForDeleteOptionValidationMessage(), true);
	   
	  }

	  
	  @Test(priority=484)
	  public void verifyOkInDeleteValidationMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkOkInDeleteValidationMessage(), true);
	   
	  }
	  
	  
	  @Test(priority=485)
	  public void verifyDeleteAccountDisplayBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkDeleteAccountDisplayBeforeCustomization(), true);
	   
	  }
	  
	  
	  @Test(priority=487)
	  public void verifyCloseUnitsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkCloseUnitsMaster(), true);
	   
	  }
	  
	  
	  
	  //Units Conversion
	  
	  
	  @Test(priority=488)
	  public void verifyUnitsConversionTitle() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUnitsConversionTitle(), true);
	   
	  }
	  
	  @Test(priority=489)
	  public void verifyUnitsConversionFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUnitsConversionFields(), true);
	   
	  }
	  
	  
	  @Test(priority=490)
	  public void verifySaveButtonWithoutInputBaseUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkSaveButtonWithoutInputBaseUnit(), true);
	   
	  }
	  
	  
	  @Test(priority=491)
	  public void verifySaveButtonWithoutInputUnit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkSaveButtonWithoutInputUnit(), true);
	   
	  }
	  
	  
	  @Test(priority=492)
	  public void verifySaveButtonWithoutInputXFactor() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkSaveButtonWithoutInputXFactor(), true);
	   
	  }
	  
	  
	  @Test(priority=493)
	  public void verifyClearButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkClearButton(), true);
	   
	  }
	  
	  
	  @Test(priority=494)
	  public void verifySaveButtonWithAllInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkSaveButtonWithAllInputs(), true);
	   
	  }
	  
	  @Test(priority=495)
	  public void verifyUpdateButtonWithAllInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkUpdateButtonWithAllInputs(), true);
	   
	  }
	  
	  
	  @Test(priority=496)//no delete row option
	  public void verifyRowDeleteFieldInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkRowDeleteFieldInExchangeRate(), true);
	   
	  }
	  
	  
	  @Test(priority=497)//no delete row option
	  public void verifyRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkRowDeleteOptionInExchangeRate(), true);
	   
	  }
	  
	  @Test(priority=498)//no delete row option
	  public void verifyYesRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mup=new MasterUnitPage(getDriver());
		  Assert.assertEquals(MasterUnitPage.checkYesRowDeleteOptionInExchangeRate(), true);
	   
	  }
	  
	  
	  
	  
	 
	  
}
