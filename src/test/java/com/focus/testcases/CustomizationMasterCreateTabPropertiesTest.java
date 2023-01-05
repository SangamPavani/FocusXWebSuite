package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.CustomizationMasterCreateTabPropertiesPage;
import com.focus.Pages.MasterAccountsPage;
import com.focus.base.BaseEngine;

public class CustomizationMasterCreateTabPropertiesTest extends BaseEngine 
{
	CustomizationMasterCreateTabPropertiesPage cmctp;

	  @Test(priority=2000)
	  public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkLogin(), true);
	  }

	  /*
	  @Test(priority=2001)
	  public void checkOpenCustomizeMasterInAccounts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkOpenCustomizeMasterInAccounts(), true);
	  }
	  
	  @Test(priority=2002)
	  public void checkAddFieldWithoutDefaultValueInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithoutDefaultValueInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2003)
	  public void checkEditFieldUpdateWithDefaultValueInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkEditFieldUpdateWithDefaultValueInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2004)
	  public void checkAddFieldWithDataTypeAsNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsNumberInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2005)
	  public void checkAddFieldWithDataTypeAsBooleanInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsBooleanInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2006)
	  public void checkAddFieldWithDataTypeAsDateTimeInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsDateTimeInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2007)
	  public void checkAddFieldWithDataTypeAsDateInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsDateInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2008)
	  public void checkAddFieldWithDataTypeAsTimeInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsTimeInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2009)
	  public void checkAddFieldWithDataTypeAsFractionInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsFractionInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2010)
	  public void checkAddFieldWithDataTypeAsPictureInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsPictureInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2011)
	  public void checkAddFieldWithDataTypeAsStringListInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsStringListInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2012)
	  public void checkAddFieldWithDataTypeAsNumberListInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsNumberListInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2013)
	  public void checkAddFieldWithDataTypeAsDocumentViewerInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsDocumentViewerInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2014)
	  public void checkAddFieldWithDataTypeAsMasterInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsMasterInCreateTabCustomizeMaster(), true);
	  } 
	  
	  @Test(priority=2015)
	  public void checkAddFieldWithDataTypeAsBigNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsBigNumberInCreateTabCustomizeMaster(), true);
	  }
	 
	  
	  @Test(priority=2016)
	  public void checkAddFieldWithDataTypeAsExternalTableInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsExternalTableInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2017)
	  public void checkAddFieldWithDataTypeAsSmallNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsSmallNumberInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2018)
	  public void checkAddFieldWithDataTypeAsTinyNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsTinyNumberInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2019)
	  public void checkAddFieldWithDataTypeAsGregorianInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsGregorianInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2020)
	  public void checkAddFieldWithDataTypeAsHijriInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsHijriInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2020)
	  public void checkAddFieldWithDataTypeAsShamsiInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldWithDataTypeAsShamsiInCreateTabCustomizeMaster(), true);
	  }
	  
	  @Test(priority=2021)
	  public void checkOpenAccountsAndValidateFieldCreatedInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkOpenAccountsAndValidateFieldCreatedInCreateTab(), true);
	  }
	  
	 
	  @Test(priority=2022)
	  public void checkEnableHiddenCheckboxInAllFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkEnableHiddenCheckboxInAllFieldsProperties(), true);
	  }
	  
	  //Log out and Login
	  @Test(priority=2023)
	  public void checkLogoutAndLoginAfterEnablingHiddenCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkLogoutAndLoginAfterEnablingHiddenCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=2024)
	  public void checkHiddenFieldsAreDisplayingInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkHiddenFieldsAreDisplayingInCreateTab(), true);
	  }
	  
	  
	  @Test(priority=2025)
	  public void checkCreateTabEnableHiddenCheckboxInShasmiFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkCreateTabEnableHiddenCheckboxInShasmiFieldProperties(), true);
	  }
	  
	  //Log out and Login
	  @Test(priority=2026)
	  public void checkLogoutAndLoginAfterEnablingHiddenCheckboxInShasmiFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkLogoutAndLoginAfterEnablingHiddenCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=2027)
	  public void checkCreateTabIsHiddenInAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkCreateTabIsHiddenInAccount(), true);
	  }
	  
	  
	  @Test(priority=2028)
	  public void checkEnableHiddenInGroupCheckboxInAllFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkEnableHiddenInGroupCheckboxInAllFieldsProperties(), true);
	  }
	  
	  @Test(priority=2029)
	  public void checkLogoutAndLoginAfterEnablingHiddenInGroupCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkLogoutAndLoginAfterEnablingHiddenInGroupCheckboxInFieldsProperties(), true);
	  }
	  
	  @Test(priority=2030)
	  public void checkHiddenFieldsAreDisplayingInCreateTabInGroupAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkHiddenFieldsAreDisplayingInCreateTabInGroupAccount(), true);
	  }
	  
	  @Test(priority=2031)
	  public void checkEnableSpellCheckBoxInAllFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkEnableSpellCheckBoxInAllFieldProperties(), true);
	  }
	  
	  @Test(priority=2032)
	  public void CheckSpellCheckForTextField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.CheckSpellCheckForTextField(), true);
	  }
	  
	  
	  @Test(priority=2033)
	  public void checkAddFieldAsCannotImportInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldAsCannotImportInCreateTabCustomizeMaster(), true);
	  }
	  

	  @Test(priority=2034)
	  public void checkEnableCannotImportCheckboxInCannotImportField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkEnableCannotImportCheckboxInCannotImportField(), true);
	  }
	  
	  @Test(priority=2035)
	  public void checkAddFieldAsCannotExportInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAddFieldAsCannotExportInCreateTabCustomizeMaster(), true);
	  }*/
	  
	   @Test(priority=2036)
	  public void checkCannotExportFieldCheckboxExistsInExportPopup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkCannotExportFieldCheckboxExistsInExportPopup(), true);
	  }

/*	  @Test(priority=2037)
	  public void checkEnableCannotExportCheckboxInCannotExportField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkEnableCannotExportCheckboxInCannotExportField(), true);
	  }
	  
	  
	  @Test(priority=2037)
	  public void checkAdvancedImportOrExportAfterEnablingExportCheckBoxesInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAdvancedImportOrExportAfterEnablingExportChcekBoxesInCreateTab(), true);
	  }
	  
	  @Test(priority=2038)
	  public void checkAdvancedImportOrExportAfterEnablingImportCheckBoxesInCreateTab1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkAdvancedImportOrExportAfterEnablingImportCheckBoxesInCreateTab1(), true);
	  }
	  
	  @Test(priority=2038)
	  public void checkImportedAccountInAccountsAndVerifyCannotImportFied() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  cmctp=new CustomizationMasterCreateTabPropertiesPage(getDriver());
		  Assert.assertEquals(CustomizationMasterCreateTabPropertiesPage.checkImportedAccountInAccountsAndVerifyCannotImportFied(), true);
	  }
	  
	  */
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}