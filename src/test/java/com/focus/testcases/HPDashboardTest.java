package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPDashboardPage;
import com.focus.base.BaseEngine;

public class HPDashboardTest extends BaseEngine{
	
	HPDashboardPage HPDP;

	 @Test(priority=143)
	 public void verifyDashBboardOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDashboard(), true);
		
	 }
	 

     @Test(priority=144)
	 public void verifyDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkNewDashboardOption(), true);
		
	 }
	 
	 @Test(priority=145)
	 public void verifySettingCustomizeDashBboardInNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkSettingsCustomizeScreenInDashboardNameOption(), true);
		
	 }
	 
	 @Test(priority=146)
	 public void verifyStandardFieldsInCustomizeDashBboardInNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkStandardFieldsColumnInCustomizeScreenInDashboardNameOption(), true);
		
	 }
	 
	 
	 @Test(priority=147)
	 public void verifyHeaderFieldsOptionsInDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkHeaderOptionsInNewDashboardOption(), true);
		
	 }
	 
	 @Test(priority=148)
	 public void verifyBodyFieldsOptionsInDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkBodyOptionsInNewDashboardOption(), true);
		
	 }
	 
	 @Test(priority=149)
	 public void verifyFooterFieldsOptionsInDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkFooterOptionsInNewDashboardOption(), true);
		
	 }
	 
	 @Test(priority=150)
	 public void verifySecurityOptionsInDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkRolesAndUsersOptionsWithSecurity(), true);
		
	 }
	 
	 
	 @Test(priority=151)
	 public void verifyRolesOptionsInDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkRolesOption(), true);
		
	 }
	 

	 @Test(priority=152)
	 public void verifySharedUsersOptionsInDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkSharedUsersonClickOnUsersRadioBtnOption(), true);
		
	 }
	 
	 @Test(priority=153)
	 public void verifySaveWithoutInputMandatoryFieldssInDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkSaveBtnWithoutInputDashboardNameMandatoryFields(), true);
		
	 }

	 @Test(priority=154)
	 public void verifySaveInDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkSaveBtnWithInputDashboardName(), true);
		
	 }
	 
	 @Test(priority=155)
	 public void verifyCancelInDashBboardNewOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkCancelBtnWithInputDashboardName(), true);
		
	 }
	 
	 @Test(priority=156)
	 public void verifyCustomizationOptionWithoutSelectingDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkCustomizationsOptionWithoutSelectingDashboard(), true);
	 }
	 
	 
	 @Test(priority=157)
	 public void verifySaveDashboardInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkSavedDashboardFromSelectDashboard(), true);
	 }	 
	 
	 
	 
	 @Test(priority=158)
	 public void verifyEditDashboardInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkEditDashboardOptionInSelectDashboard(), true);
		
	 }
	 
	 @Test(priority=159)
	 public void verifyDashboardNameInEditAfterDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDashboardNameInEditDashboard(), true);
		
	 }	
	 
	 @Test(priority=160)
	 public void verifyEditDescriptionInEditDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkUpdateDashboardByClickOnSaveBtnInDashboard(), true);
		
	 }	
	 
	 

	 @Test(priority=161)
	 public void verifyUpadtedDescriptionInEditAfterUpdatinhDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkUpdatedDashboardDescriptionInEditDashboard(), true);
	 }	
	 
	 
	 @Test(priority=162)
	 public void verifyAlertOnCreationOfDashboardWithSetAsDefaultOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkAlertOnCreationOfDashbordWithSetAsDefault(), true);	
	 }	
	 
	 @Test(priority=163)
	 public void verifyCancelInAlertOnCreationDashboardWithSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkCancelButtonInAlertOnCreationOfDashboardWithSetAsDefault(), true);	
	 }	
	 
	 @Test(priority=164)
	 public void verifyAlertAfterClickOnCancelAndClickOnSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkAlertAfterClickonCancelAndClickSaveBtnOnCreationOfDashboardWithSetAsDefault(), true);	
	 }	
	 
	 @Test(priority=165)
	 public void verifyOkInAlertOnCreationDashboardWithSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkOkButtonInAlertOnCreationOfDashboardWithSetAsDefault(), true);
	 }	
	 
	 
	 @Test(priority=166)
	 public void verifyCreateDashboardWithSetAsDefaultAndActiveOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkCreateDashboardWithActiveAndSetAsDefault(), true);
	 }	
	 
	 
	 @Test(priority=167)
	 public void verifyAlertForCreateDashboardWithNoSetActiveSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkAlertForCreateDashboardWithNoActiveAndNoSetAsDefault(), true);
	 }	
	 
	 @Test(priority=168)
	 public void verifyOkInAlertForCreateDashboardWithNoSetActiveSetAsDefault() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkOkButtonInAlertForSavingNoActiveAndNoSetAsDefault(), true);
		
	 }	
	 
	 @Test(priority=169)
	 public void verifyCancelAfterCreatingAllDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkCancelBtnAfterCreatingDashboards(), true);
		
	 }
	 
	 @Test(priority=170)
	 public void verifyRefreshDashboardCreatingAllDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkRefreshDashboardToDisplayDefaultDashboard(), true);
		
	 }
	 
	 
	 @Test(priority=171)
	 public void verifyActiveDashboardsDisplayInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkActiveDashboardsDisplayInSelectDashboard(), true);
		
	 }
	 
	 
	 @Test(priority=172)
	 public void verifyAlertDisplayInDeleteDashboardInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDeleteOptionDashboardInSelectDashboard(), true);
		
	 }

	 @Test(priority=173)
	 public void verifyAlertCancelInDeleteDashboardInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkCancelInAlertDeleteDashboardInSelectDashboard(), true);
		
	 }
	 
	
	 @Test(priority=174)
	 public void verifyAlertInDeleteAfterCancelButtonInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDeleteAfterClickOnCancelInAlertSelectDashboard(), true);
		
	 }
	 
	 @Test(priority=175)
	 public void verifyAlertClickOnOkBtnInDeleteAfterCancelButtonInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkOkBtnInAlertDeleteAfterClickOnCancelInAlertSelectDashboard(), true);
		
	 }
	 
	 
	 
	 @Test(priority=176)
	 public void verifyDeleteDashboardInSelectDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDeleteDashboardInSelectDashboard(), true);
		
	 }
	 
	 
	 @Test(priority=177)
	 public void verifyInActiveDashboardInNewDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkInActiveDashboardsInNewDashboardComboBox(), true);
		
	 } 
	 

	
	 @Test(priority=178)
	 public void verifyCustomizationOptionsOfDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkCustomizationWithSelectingDashboard(), true);
		
	 } 
	
	 @Test(priority=179)
	 public void verifyGraphCustomizationOptionsOfDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkGraphOptionsInCustomizeDashboard(), true);
		
	 } 
	 
	 
	 @Test(priority=180)
	 public void verifyReportCustomizationOptionsOfDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkReportOptionsinCustomizeDashboards(), true);
	 } 
	 
	 @Test(priority=181)
	 public void verifyInfoPanelCustomizationOptionsOfDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkInfoPanelOptionsinCustomizeDashboards(), true);
	 } 
	 
	 
	 @Test(priority=182)
	 public void verifyWorkFlowCustomizationOptionsOfDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkWorkFlowOptionsinCustomizeDashboards(), true);
	 } 
	 
	 
	 @Test(priority=183)
	 public void verifyNewGraphDefinitionCustomizationOptionsOfDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDefineGraphDefinitionOptionsinCustomizeDashboards(), true);
	 } 
	 
	 @Test(priority=184)
	 public void verifyNewGraphPropertiesCustomizationOptionsOfDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDefineGraphPropertiesOptionsinCustomizeDashboards(), true);
	 } 
	 
	 @Test(priority=185)
	 public void verifyNewGraphMaxmizedViewCustomizationOptionsOfDashboards() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDefineMaximizedOptionsinCustomizeDashboards(), true);
	 } 
	 
	 
	 @Test(priority=186)
	 public void verifyMandatoryFieldsCheckForNameInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkMandatoryFieldsCheckForNameInDefineGraph(), true);
	 } 
	 
	 @Test(priority=187)
	 public void verifyMandatoryFieldsCheckForSeriesInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkMandatoryFieldsCheckForSeriesInDefineGraph(), true);
	 } 
	
	 @Test(priority=188)
	 public void verifySaveWithMandatoryFieldsInDefineGraph() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkSaveInTheDefineGraphInDefineGraph(), true);
	 } 
	 
	 
	 @Test(priority=189)
	 public void verifyNewGraphCreatedIsDisplayedInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkGraphCreatedInDashletsInDefineGraph(), true);
	 } 
	 
	 
	 
	 @Test(priority=190)
	 public void verifyEditGraphCreatedIsDisplayedInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkEditGraphCreatedInDashletsInDefineGraph(), true);
	 } 
	 
	 
	 @Test(priority=191)
	 public void verifyUpdateGraphCreatedIsMessageDisplayedInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkUpdateGraphCreatedInDashletsInDefineGraph(), true);
	 } 
	 
	 @Test(priority=192)
	 public void verifyUpdatedGraphIsDisplayedInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkUpdatedGraphDisplayInDashletsInDefineGraph(), true);
	 } 
	 
	 
	 @Test(priority=193)
	 public void verifyDeleteGraphInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDeleteGraphCreatedInDashletsInDefineGraph(), true);
	 }
	 
	 
	 @Test(priority=194)
	 public void verifyNoBtnInDeleteGraphInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkNoBtnInDeleteConfirmationMessagGraphCreatedInDashletsInDefineGraph(), true);
	 }
	 
	
	 @Test(priority=195)
	 public void verifyDeleteAfterClickOnNoGraphInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkDeleteAfterClickOnNoGraphCreatedInDashletsInDefineGraph(), true);
	 }
	 
	 @Test(priority=196)
	 public void verifyYesBtnInDeleteAfterClickOnNoGraphInDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkYesBtnInDeleteConfirmationMessagGraphCreatedInDashletsInDefineGraph(), true);
	 }
	 
	 
	 @Test(priority=197)
	 public void verifyCreateNewGraphOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkCreateNewGraphCustomizeDashboards(), true);
	 }
	 
	 @Test(priority=198)
	 public void verifySaveNewGraphAfterDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkSaveNewGraphAffterDelete(), true);
	 }
	
	 @Test(priority=199)
	 public void verifyDisplayNewGraphAfterDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 Assert.assertEquals(HPDashboardPage.checkNewGraphAfterDeletingInCreatedashlet(), true);
	 }
    
     @Test(priority=200)
	 public void verifyDragAndDropGraphNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkDragAndDropGraphAfterDeletingInCreatedashlet(), true);
	 }
	 
	 
	 @Test(priority=201)
	 public void verifyDashletGraphCreatedInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkDashletGraphCreatedInDashboard(), true);
	 }
	 
	 
	 @Test(priority=202)
	 public void verifyDashletNewReportInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkNewReportOptionsOptionsinCustomizeDashboards(), true);
	 }
	 
	 
	 @Test(priority=203)
	 public void verifyListOfReportNameComboboxInNewReportInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkListofReportsForReportNameInNewReport(), true);
	 }
	 
	 @Test(priority=204)
	 public void verifyMandatoryFieldsInNewReportInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkMandatoryFieldsInNewReport(), true);
	 }
	 
	 @Test(priority=205)
	 public void verifySelectedReportNameInReportNameOptionIsSelected() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkSelectedReportNameInReportNameOptionIsSelected(), true);
	 }
	 
	 
	 
	 @Test(priority=206)
	 public void verifySearchMasterInReportNameOptionIsSelected() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkSearchMasterInReportNameOptionIsSelected(), true);
	 }
	 
	 
	 @Test(priority=207)
	 public void verifySaveWithoutSelectingMasterInReportNameInReportNameOptionIsSelected() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkSaveNewReportWithoutSelectingMaster(), true);
	 }
	 
	 
	
	 @Test(priority=208)
	 public void verifyInputMasterInReportNameOptionIsSelected() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkInputMasterInReportNameOptionIsSelected(), true);
	 }
	 
	 
	 @Test(priority=209)
	 public void verifySaveNewReport() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkSaveReportName(), true);
	 }
	 
	 
	 @Test(priority=210)
	 public void verifySaveNewReportInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkCreatNewReportNameInDashlet(), true);
	 }
	 
	 @Test(priority=211)
	 public void verifyDragAndDropSaveNewReportInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkDragAndDropReportAfterDeletingInCreatedashlet(), true);
	 }
	 
	 
	 @Test(priority=212)
	 public void verifyReportDashletInDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkDashletNewReportCreatedInDashboard(), true);
	 }
 
	@Test(priority=213)
	public void verifyInfoPanelAndTheDefinitionInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkNewInfoPanelOptionsOptionsinCustomizeDashboards(), true);
	}
	
	 
	 
	@Test(priority=214)
	public void verifyInfoPanelAndThePropertiesTabInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkPropertiesTabOptionsOptionsinCustomizeDashboards(), true);
	}
	
	
	@Test(priority=215)
	public void verifyInfoPanelAndTheMaxmizedViewInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkMaximizedTabOptionsOptionsinCustomizeDashboards(), true);
	}

	
	@Test(priority=216)
	public void verifyMandatoryCheckInInfoPanelInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkMandatoryFieldsInNewInfoPanel(), true);
	}
	 
	@Test(priority=217)
	public void verifyMandatoryCheckVariableInInfoPanelInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkMandatoryFieldsVariableInNewInfoPanel(), true);
	}
	
	@Test(priority=218)
	public void verifyInfoTypeInInfoPanelInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkInfoTypeComboBoxValues(), true);
	}
	
	
	@Test(priority=219)
	public void verifyInfoTypeOptionAsDefine() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkInfoTypeOptionAsDefine(), true);
	}
	
	@Test(priority=220)
	public void verifyInfoTypeOptionAsQuery() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkInfoTypeOptionAsQuery(), true);
	}
	
	

	@Test(priority=221)
	public void verifyInfoTypeOptionVariableInStandardValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkInfoTypeOptionWithVariableInStandardValue(), true);
	}
	
	
	

	@Test(priority=222)
	public void verifySaveInfoPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkSaveInfoPanel(), true);
	}
	
	@Test(priority=223)
	public void verifyInfoPanelSavInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkCreatNewInfoPanelNameInDashlet(), true);
	}
	
	
	
	@Test(priority=224)
	public void verifyDragAndPanelInfoPanelSavInCreateDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkDragAndDropInfoPanel(), true);
	}
	
	
	

    @Test(priority=225)
	public void verifyInfoPanelInCreatedDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkInfoPanelCreatedInDashboard(), true);
	}
	
	
	@Test(priority=226)
	public void verifyDeleteOptionToCreateNewInfoPanel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkDeleteDashboardInfoPanelToAddTestInfoPanelOptions(), true);
	}
	
	
	
	@Test(priority=227)
	public void verifyDeleteOptionDisplayInDeleteDashletInCreatedDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkDeleteOptionIsDisplayInDashboard(), true);
	}
	
	@Test(priority=228)
	public void verifyMessageDeleteOptionInfoPanelDashletInCreatedDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkMessageDisplayDeleteDashletInDashboard(), true);
	}
	
	@Test(priority=229)
	public void verifyCancelBtnInMessageDeleteOptionInfoPanelDashletInCreatedDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkCancelBtnInMessageForDeleteDashletInDashboard(), true);
	}
	
	
	@Test(priority=230)
	public void verifyOkBtnInMessageDeleteOptionInfoPanelDashletInCreatedDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkOkBtnInMessageForDeleteDashletInDashboard(), true);
	}
	
	
	@Test(priority=231)
	public void verifySaveDashboardAfterDeleteDashletAddToDashboard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 HPDP=new HPDashboardPage(getDriver());
		 
		 Assert.assertEquals(HPDashboardPage.checkSaveDashboardAfterDeleteDashletAddToDashboard(), true);
	}
	
	
	
	
	
	
}
	 
	 
	 

