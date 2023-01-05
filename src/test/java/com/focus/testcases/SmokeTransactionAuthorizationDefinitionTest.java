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
import com.focus.Pages.SmokeTransactionAuthorizationDefinitionPage;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;



public class SmokeTransactionAuthorizationDefinitionTest extends BaseEngine
{

	 static SmokeTransactionAuthorizationDefinitionPage tadp; 
	 //Series of Priority Starts with 2000
	 
	 @Test(priority=2001)
	 public void checkLoginToCheckTransactionAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkLoginToCheckTransactionAuthorization(), true);		
	 }
	
	 @Test(priority=2002)
	 public void checkTransactionAuthorizationOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkTransactionAuthorizationOptions(), true);
	 }

	 @Test(priority=2003)
	 public void checkVoucherTypeDocumentOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkVoucherTypeDocumentOptions(), true);
	 }
	 
	 @Test(priority=2004)
	 public void checkSaveWithoutInputOfMandatoryDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveWithoutInputOfMandatoryDocument(), true);	
	 }
	 	 
	 @Test(priority=2005)
	 public void checkUserCreatedVoucherTypeDocumentOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkUserCreatedVoucherTypeDocumentOptions(), true);	
	 }
	 	 
	 @Test(priority=2006)
	 public void checkSelectingVoucherInDocumentDropdown() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSelectingVoucherInDocumentDropdown(), true);		
	 } 
	 
	 @Test(priority=2007)
	 public void checkSaveWithoutInputOfMandatoryName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveWithoutInputOfMandatoryName(), true);		
	 }
	  
	 @Test(priority=2008)
	 public void checkBannerTextInNameTextBox() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkBannerTextInNameTextBox(), true);
	 }
	 
	 
	 @Test(priority=2009)
	 public void checkActiveCheckBox() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkActiveCheckBox(), true);		
	 }
	 
	 
	 @Test(priority=2010)
	 public void checkInputNameAndClickOnSaveWithoutAuthorizationSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkInputNameAndClickOnSaveWithoutAuthorizationSettings(), true);	
	 }
	 
	 
	 @Test(priority=2011)
	 public void checkStartPoint() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkStartPoint(), true);
			
	 }
	 
	 
	 
	 @Test(priority=2012)
	 public void checkConditionTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkConditionTabOptions(), true);
			
	 }
	 
	 

	 @Test(priority=2012)
	 public void checkUserSelectionTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkUserSelectionTabOptions(), true);
			
	 }
	 
	 @Test(priority=2013)
	 public void checkUserDropdownOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkUserDropdownOptions(), true);
			
	 }
	 
	 @Test(priority=2014)
	 public void checkAlertsTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkAlertsTabOptions(), true);
			
	 }
	 
	 
	 @Test(priority=2015)
	 public void checkEscalationTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkEscalationTabOptions(), true);
			
	 }
	 
	 
	 @Test(priority=2016)
	 public void checkEscalationTabOptionsAfterClickingAddBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkEscalationTabOptionsAfterClickingAddBtn(), true);
			
	 }	 
	 
	 
	 @Test(priority=2017)
	 public void checkCancelButtonInDefinitionScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCancelButtonInDefinitionScreen(), true);
			
	 }
	 
	 
	 @Test(priority=2018)
	 public void checkDescriptionAsMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkDescriptionAsMandatory(), true);
			
	 }
	 
	 
	 @Test(priority=2019) // Error Message
	 public void checkConditionAsMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkConditionAsMandatory(), true);
			
	 }
	 
	 
	 
	 @Test(priority=2020)
	 public void checkUserSelectionIsManadatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkUserSelectionIsManadatory(), true);
			
	 }
	 
	 
	 
	 @Test(priority=2021)
	 public void checkOkButtonOnSelectingUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkOkButtonOnSelectingUser(), true);
			
	 }
	 
	 
	 
	 @Test(priority=2022)
	 public void checkSavingTransactionAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSavingTransactionAuthorization(), true);
			
	 }
	 
	 @Test(priority=2023)
	 public void checkCancelButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCancelButton(), true);
			
	 }
	 
   
	 
	 
	 @Test(priority=2024)
	 public void checkDisplayingAuthorizationName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkDisplayingAuthorizationName(), true);
			
	 }
	 

	 @Test(priority=2025)
	 public void checkEditAuthorizationSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkEditAuthorizationSettings(), true);
			
	 }
	 
	 
	 @Test(priority=2026)
	 public void checkEditOnSelectAlertsTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkEditOnSelectAlertsTabOptions(), true);
			
	 }
	 
      
     @Test(priority=2027)
	 public void checkEmailTemplateHeaderOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkEmailTemplateHeaderOption(), true);
			
	 }
	 
	 
	 @Test(priority=2028)
	 public void checkSaveButtonWithoutTemplateName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveButtonWithoutTemplateName(), true);
			
	 }

	 
	 @Test(priority=2029)//
	 public void checkTemplateNameWithoutTemplateText() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkTemplateNameWithoutTemplateText(), true);
			
	 }

	 @Test(priority=2030)
	 public void checkSaveWithAllMandatoryInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveWithAllMandatoryInputs(), true);
			
	 }
	 
	 @Test(priority=2031)
	 public void checkEditCreateEmailTemplateHeader() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkEditCreateEmailTemplateHeader(), true);
			
	 }
	 
	 @Test(priority=2032)
	 public void checkPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkPreviewOption(), true);
			
	 }
	 
	 @Test(priority=2033)
	 public void checkNewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkNewOption(), true);
			
	 }
	 
	 @Test(priority=2034)
	 public void checkCloseOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCloseOption(), true);
			
	 }
	 
	 @Test(priority=2035)
	 public void checkCreatedEmailInEmailHedaerTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCreatedEmailInEmailHedaerTemplate(), true);
			
	 }
	 
	 @Test(priority=2036)
	 public void checkOkButtonOnSelectionEmailHeaderTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkOkButtonOnSelectionEmailHeaderTemplate(), true);
			
	 }
	 
	 
	 @Test(priority=2037)
	 public void checkSavingTransactionAuthorizationOnSelctingEmailHeaderTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSavingTransactionAuthorizationOnSelctingEmailHeaderTemplate(), true);
			
	 }
	 
	 
	@Test(priority=2038)
	 public void checkEditClickOnEmailTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkEditClickOnEmailTemplate(), true);
			
	 }
	 
	 


	 @Test(priority=2039)
	 public void checkFieldsTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkFieldsTabOptions(), true);
			
	 }
	 
	 
	 
	 @Test(priority=2040)
	 public void checkCompanyExpandInFieldsTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCompanyExpandInFieldsTabOptions(), true);
			
	 }
	 

	 @Test(priority=2041)
	 public void checkHeaderOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkHeaderOptions(), true);
			
	 }
	 


	 @Test(priority=2042)
	 public void checkBodyOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkBodyOptions(), true);
			
	 }
	 


	 @Test(priority=2043)
	 public void checkUserDetailsOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkUserDetailsOptions(), true);
			
	 }
	 

	 @Test(priority=2044)
	 public void checkMiscellaneousOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkMiscellaneousOptions(), true);
			
	 }
	
	 
	 
	 
	 @Test(priority=2045)//Auto It 
	 public void checkFieldsDragInHeaderOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkFieldsDragInHeaderOptions(), true);
			
	 }
	 

	 @Test(priority=2046)//Auto It
	 public void checkBodyControlLayout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkBodyControlLayout(), true);
			
	 }
	
	 @Test(priority=2047)
	 public void checkBodyPropertiesControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkBodyPropertiesControl(), true);
			
	 }
	
	 
	 @Test(priority=2048)
	 public void checkSaveOptionInEmailTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveOptionInEmailTemplate(), true);
			
	 }
	 
	 @Test(priority=2049)
	 public void checkSaveOptionWithoutLayoutName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveOptionWithoutLayoutName(), true);
			
	 }
	 
	 
	 @Test(priority=2050)
	 public void checkSaveOptionWithLayoutName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveOptionWithLayoutName(), true);	
	 }
	 
	 
	 @Test(priority=2051)
	 public void checkExitOptionInLayout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkExitOptionInLayout(), true);
			
	 }
	 
	 
	 @Test(priority=2052)
	 public void checkSavedEmailTemplateInEmailTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSavedEmailTemplateInEmailTemplate(), true);
			
	 }
	 
	 @Test(priority=2053)
	 public void checkSMSTemplateOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSMSTemplateOption(), true);
			
	 }
	 
	 @Test(priority=2054)
	 public void checkSaveButtonWithoutSMSTemplateName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveButtonWithoutSMSTemplateName(), true);
			
	 }
	 
	 @Test(priority=2055)
	 public void checkSaveSMSTemplateWithMandatoryInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveSMSTemplateWithMandatoryInputs(), true);
			
	 }
	 
	 
	 @Test(priority=2056)
	 public void checkCloseOptionInSMSTemplateWithMandatoryInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCloseOptionInSMSTemplateWithMandatoryInputs(), true);
			
	 }
	 
	 
	 
	 
	 @Test(priority=2057)
	 public void checkSavedSMSTemplateInTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSavedSMSTemplateInTemplate(), true);
			
	 }
	 
	 
	 
 
	 @Test(priority=2058)
	 public void checkAlertsTemplateOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkAlertsTemplateOption(), true);
			
	 }
	 
	 @Test(priority=2059)
	 public void checkSaveButtonWithoutAlertsTemplateName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveButtonWithoutAlertsTemplateName(), true);
			
	 }
	 
	 
	 @Test(priority=2060)
	 public void checkSaveAlertsTemplateWithMandatoryInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveAlertsTemplateWithMandatoryInputs(), true);
			
	 }
	 
	 

	 @Test(priority=2061)
	 public void checkCloseOptionInAlertsTemplateWithMandatoryInputs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCloseOptionInAlertsTemplateWithMandatoryInputs(), true);
			
	 }
	 
	 
	 @Test(priority=2062)
	 public void checkSavedAlertTemplateInTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSavedAlertTemplateInTemplate(), true);
			
	 }

	 


	 @Test(priority=2063)
	 public void checkOkBtnInEscalationTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkOkBtnInEscalationTabOptions(), true);
			
	 }
	 
	 
	 @Test(priority=2064)
	 public void checkSaveAuthorizationWithAlertsAndEsclations() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkSaveAuthorizationWithAlertsAndEsclations(), true);
			
	 }
	 
	 
	 
	 
	 @Test(priority=2065)
	 public void checkClearButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkClearButton(), true);
			
	 }
	 
	 @Test(priority=2066)
	 public void checkAlertMessageOnDeleteAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkAlertMessageOnDeleteAuthorization(), true);
			
	 }
	 
	 
	 @Test(priority=2067)
	 public void checkCancelInAlertDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCancelInAlertDeleteOption(), true);
	 }
	 
	 
	 @Test(priority=2068)
	 public void checkOkInAlertDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkOkInAlertDeleteOption(), true);
	 }
	 
	 @Test(priority=2069)
	 public void checkCreateAuthorizationInPurchasesOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCreateAuthorizationInPurchasesOrder(), true);
	 }
	 
	 
	 
	 @Test(priority=2070)
	 public void checkCreateAuthorizationInMaterialRequistion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCreateAuthorizationInMaterialRequistion(), true);
	 }
	 
	 
	 @Test(priority=2071)
	 public void checkCloseAndLogoutTheCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 tadp=new SmokeTransactionAuthorizationDefinitionPage(getDriver());
		 Assert.assertEquals(tadp.checkCloseAndLogoutTheCompany(), true);
	 }
	 
	 
}
