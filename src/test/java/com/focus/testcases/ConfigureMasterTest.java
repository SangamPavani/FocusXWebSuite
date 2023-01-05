package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.AccountMasterPage;
import com.focus.Pages.ConfigureMasterPage;
import com.focus.base.BaseEngine;

public class ConfigureMasterTest extends BaseEngine
{
	
	ConfigureMasterPage cmp;
	
	@Test(priority = 100)
	public void checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkLoginCompanyWithValidCredentials(), true);
		
	}
	
	@Test(priority = 101)
	public void checkconfigureMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkconfigureMasters(), true);
		
	}
	
	@Test(priority = 102)
	public void checkSavingMasterInConfigureMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkSavingMasterInConfigureMaster(), true);
		
	}
	
	@Test(priority = 103)
	public void checkSavedMasterAndUpdatingTheMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkSavedMasterAndUpdatingTheMaster(), true);
		
	}
	

	@Test(priority = 104)
	public void checkUpdatedMasterAndDeleteThatMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkUpdatedMasterAndDeleteThatMaster(), true);
		
	}
	
	
	
	@Test(priority = 105)
	public void checkSavingMasterForRecordCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkSavingMasterForRecordCreation(), true);
		
	}
	
	@Test(priority = 106)
	public void checkSavedMaserInMastersListAndSaveRecord() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkSavedMaserInMastersListAndSaveRecord(), true);
		
	}
	
	@Test(priority = 107)
	 public void checkAddingCreatedMasterInReceiptsHeaderAndSaveVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkAddingCreatedMasterInReceiptsHeaderAndSaveVoucher(), true);
		
	}
	
	
	
	@Test(priority = 108)
	public void checkDeletigCreatedMasterWithTheRecord() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkDeletigCreatedMasterWithTheRecord(), true);
		
	}
	
	@Test(priority = 109)
	public void checkAddingGroupMasterInConfigureMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkAddingGroupMasterInConfigureMaster(), true);
		
	}
	
	@Test(priority = 110)
	public void checkAddingChildMasterInGroupMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkAddingChildMasterInGroupMaster(), true);
		
	}
	
	
	@Test(priority = 111)
	public void checkDeletingSavedGroupmasterWithChildmaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkDeletingSavedGroupmasterWithChildmaster(), true);
		
	}
	
	
	@Test(priority = 112)
	public void checkAddingGroupMasterForDeletion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkAddingGroupMasterForDeletion(), true);
		
	}
	
	@Test(priority = 113)
	public void checkSavingGroupMasterForGroupmandatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkSavingGroupMasterForGroupmandatory(), true);
		
	}
	
	
	@Test(priority = 114)
	public void checkSavingGroupUnderCreatedMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkSavingGroupUnderCreatedMaster(), true);
		
	}
	
	@Test(priority = 115)
	public void checkSavingARecordUnderMasterThroughgroupDropdown() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkSavingARecordUnderMasterThroughgroupDropdown(), true);
		
	}
	
	@Test(priority = 116)
	public void checkRecordcretedUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkRecordcretedUnderGroup(), true);
		
	}
	
	
	@Test(priority = 117)
	public void checkCustomizationAndTreeCustomizationForCreatedMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkCustomizationAndTreeCustomizationForCreatedMaster(), true);
		
	}
	
	@Test(priority = 118)
	public void checkLogouAndLoginAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkLogoutAndLoginAftercustomization(), true);
		
	}
	
	@Test(priority = 119)
	public void checkAddedTabFieldAndTreeCustomizationupdates() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkAddedTabFieldAndTreeCustomizationupdates(), true);
		
	}
	
	
	@Test(priority = 120)
	public void checkAddNewFieldIntoMasterTree() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkAddNewFieldIntoMasterTree(), true);
		
	}
	
	@Test(priority = 121)
	public void checkNewlyAddedFieldInMasterTree() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkNewlyAddedFieldInMasterTree(), true);
		
	}
	
	@Test(priority = 122)
	public void checkCustomizationandTreeCustomizationForChildMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkCustomizationandTreeCustomizationForChildMaster(), true);
		
	}
	
	@Test(priority = 123)
	public void checkLogouAndLoginAfterCustomizationInChildmaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkLogoutAndLoginAftercustomization(), true);
		
	}
	
	
	@Test(priority = 124)
	public void checkAddedCreateTabFieldAndMasterHeaderTree() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkAddedCreateTabFieldAndMasterHeaderTree(), true);
		
	}
	
	@Test(priority = 125)
	public void checkAddingRulesForChildMasterWithNoCondition() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkAddingRulesForChildMasterWithNoCondition(), true);
		
	}
	
	@Test(priority = 126)
	public void checkValidateRuleWithNoConditionInChildMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkValidateRuleWithNoConditionInChildMaster(), true);
		
	}
	
	@Test(priority = 127)
	public void checkSavingruleWithconditionForChildMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkSavingruleWithconditionForChildMaster(), true);
		
	}
	
	@Test(priority = 128)
	public void checkValidatingRuleWithIfConditionForChildMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkValidatingRuleWithIfConditionForChildMaster(), true);
		
	}
	
	@Test(priority = 129)
	public void checkValidatingRulewithElseconditionForChildMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkValidatingRulewithElseconditionForChildMaster(), true);
		
	}
	
	
	@Test(priority = 130)
	public void checkExportingChildMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkExportingChildMaster(), true);
		
	}
	
	@Test(priority = 131)
	public void checkImportingMasterInConfigureMastersAndValidateInMastersList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkImportingMasterInConfigureMastersAndValidateInMastersList(), true);
		
	}
	
	@Test(priority = 132)
	public void checkLogoutUserFromConfigureMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		 cmp=new ConfigureMasterPage(getDriver());
		  Assert.assertEquals(cmp.checkLogoutUserFromConfigureMaster(), true);
		
	}

	
}
