package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.HPHomeMenuSecurityPage;


import com.focus.Pages.SmokeMasterAuthorizationDefinitionPage;
import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class SmokeMasterAuthorizationDefinitionTest extends BaseEngine
{
	
	
static SmokeMasterAuthorizationDefinitionPage map;
	
    //Series of Priority Starts with 2401

	@Test(priority=2401)
	public void checkLoginWithValidUserNameAndPasswordToCheckMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());
		Assert.assertEquals(map.checkLoginWithValidUserNameAndPasswordToCheckMasterAuthorization(), true);	
	}
	
	
	@Test(priority=2402)
	public void checkOpenMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkOpenMasterAuthorization(), true);	
	}
	
	
	
	@Test(priority=2403)
	public void checkMasterDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());	
		Assert.assertEquals(map.checkMasterDropdownOptions(), true);
	}
	
	
	
	@Test(priority=2404)
	public void checkSaveWithoutSelectionOfMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkSaveWithoutSelectionOfMaster(), true);
	}
	

	@Test(priority=2405)
	public void checkSelectingAccountinMasterDropdown() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkSelectingAccountinMasterDropdown(), true);
	}
	

	@Test(priority=2406)
	public void checkSaveWithoutName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkSaveWithoutName(), true);
	}
	
	@Test(priority=2407)
	public void checkActiveCheckBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkActiveCheckBox(), true);
	}
	
	
	@Test(priority=2408)
	public void checkInputNameAndClickOnSaveWithoutAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkInputNameAndClickOnSaveWithoutAuthorizationSettings(), true);
	}
	
	
	@Test(priority=2409)
	public void checkStartPoint() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkStartPoint(), true);
	}
	
	
	@Test(priority=2410)
	public void checkConditionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkConditionTabOptions(), true);
	}
	
	
	@Test(priority=2411)
	public void checkUserSelectionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkUserSelectionTabOptions(), true);
	}
	
	
	@Test(priority=2412)
	public void checkUserDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkUserDropdownOptions(), true);
	}
	
	
	@Test(priority=2413)
	public void checkAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkAlertsTabOptions(), true);
	}
	
	
	@Test(priority=2414)
	public void checkEscalationTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkEscalationTabOptions(), true);
	}
	
	
	@Test(priority=2415)
	public void checkEscalationTabOptionsAfterClickingAddBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkEscalationTabOptionsAfterClickingAddBtn(), true);
	}
	
	
	@Test(priority=2416)
	public void checkEscalationTypeDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkEscalationTypeDropdownOptions(), true);
	}
	
	@Test(priority=2417)
	public void checkCancelButtonInDefinitionScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkCancelButtonInDefinitionScreen(), true);
	}
	
	
	@Test(priority=2418)
	public void checkDescriptionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkDescriptionAsMandatory(), true);
	}
	
	
	
	@Test(priority=2419) // Reported one
	public void checkConditionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkConditionAsMandatory(), true);
	}
	
	
	@Test(priority=2420)
	public void checkUserSelectionIsManadatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkUserSelectionIsManadatory(), true);
	}
	
	
	@Test(priority=2421)
	public void checkOkButtonOnSelectingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkOkButtonOnSelectingUser(), true);
	}
	
	
	@Test(priority=2422)
	public void checkSavingMasterAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkSavingMasterAuthorization(), true);
	}
	
	
	@Test(priority=2423)
	public void checkCancelButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkCancelButton(), true);
	}
	
	

	
	@Test(priority=2424)
	public void checkDisplayingMastersNameInListOfMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkDisplayingMastersNameInListOfMasters(), true);
	}
	
	
	@Test(priority=2425)
	public void checkSavedNameDisplayInNameTextBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkSavedNameDisplayInNameTextBox(), true);
	}

	
	@Test(priority=2426)
	public void checkEditMasterAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkEditMasterAuthorizationSettings(), true);
	}
	
	@Test(priority=2427)
	public void checkConditionCheckbox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkConditionCheckbox(), true);
	}
	
	
	@Test(priority=2428)
	public void checkEditOnSelectAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkEditOnSelectAlertsTabOptions(), true);
	}
	
	
	@Test(priority=2429)
	public void checkSaveWithAllMandatoryInputs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkSaveWithAllMandatoryInputs(), true);
	}
	
	
	@Test(priority=2430)
	public void checkCreatedEmailInEmailHedaerTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkCreatedEmailInEmailHedaerTemplate(), true);
	}
	
	
	@Test(priority=2431)
	public void checkEmailTemplateCompanyExpandInFieldsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkEmailTemplateCompanyExpandInFieldsTabOptions(), true);
	}
	

	@Test(priority=2432)
	public void checkFieldsTabMasterFieldsOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkFieldsTabMasterFieldsOptions(), true);
	}
	
	@Test(priority=2433)
	public void checkFieldsTabUserDetailsOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkFieldsTabUserDetailsOptions(), true);
	}
	
	
	@Test(priority=2434)
	public void checkFieldsTabMiscellaneousOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkFieldsTabMiscellaneousOptions(), true);
	} 	
	
	
	@Test(priority=2435)
	public void checkDesignAreaPrintScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkDesignAreaPrintScreen(), true);
	}
	
	
	@Test(priority=2436)
	public void checkFieldsDragInHeaderOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkFieldsDragInHeaderOptions(), true);
	}
	
	
	@Test(priority=2437)
	public void checkExitOptionInLayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkExitOptionInLayout(), true);
	}
	
	
	@Test(priority=2438)
	public void checkSavedEmailTemplateInEmailTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
		Assert.assertEquals(map.checkSavedEmailTemplateInEmailTemplate(), true);
	}
	
	
	
	
	
	 @Test(priority=2439)
	 public void checkSavedSMSTemplateInTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
			Assert.assertEquals(map.checkSavedSMSTemplateInTemplate(), true);
			
	 }
	
	 
	
	 
	 @Test(priority=2440)
	 public void checkSavedAlertTemplateInTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
			Assert.assertEquals(map.checkSavedAlertTemplateInTemplate(), true);
			
	 }
	
	 
	@Test(priority=2441)
	 public void checkSaveButtonWithCondition() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
			Assert.assertEquals(map.checkSaveButtonWithCondition(), true);
			
	 }
	 
	 
	 @Test(priority=2442)
	 public void checkSaveAuthorizationWithConditionAndAlerts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
			Assert.assertEquals(map.checkSaveAuthorizationWithConditionAndAlerts(), true);
			
	 }
	 
	 
	@Test(priority=2443)
	 public void checkClearButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
			Assert.assertEquals(map.checkClearButton(), true);
			
	 }
	 
	 
	 @Test(priority=2444)
	 public void checkAlertMessageOnDeleteAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
			Assert.assertEquals(map.checkAlertMessageOnDeleteAuthorization(), true);
			
	 }
	 
	 
	 @Test(priority=2445)
	 public void checkCancelInAlertDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
			Assert.assertEquals(map.checkCancelInAlertDeleteOption(), true);
			
	 }
	 
	 
	 @Test(priority=2446)
	 public void checkOkInAlertDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
			Assert.assertEquals(map.checkOkInAlertDeleteOption(), true);
			
	 }
	 
	 
	 @Test(priority=2447)
	 public void checkCloseAndLogoutTheCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
			map=new SmokeMasterAuthorizationDefinitionPage(getDriver());		
			Assert.assertEquals(map.checkCloseAndLogoutTheCompany(), true);
			
	 }
	 
}
