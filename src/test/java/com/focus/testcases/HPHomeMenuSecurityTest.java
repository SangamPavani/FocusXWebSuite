package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.HPHomeMenuSecurityPage;
import com.focus.base.BaseEngine;

public class HPHomeMenuSecurityTest extends BaseEngine
{
	 static HPHomeMenuSecurityPage hpmnsp;
	
	 //Home Menu Security Network Policy Page
     
	 
	 @Test(priority=988)
	 public void verifyLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(HPHomeMenuSecurityPage.checkLoginCompanyWithValidCredentials(), true);
			
	 }
		
	 /* 
	 @Test(priority=989)
	 public void verifyOpenNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkOpenNetworkPolicy(), true);
			
	 }

	 
	 @Test(priority=990)
	 public void verifyAddBtnWithAllBlankIPsInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAddBtnWithAllBlankIPsInNetworkPolicy(), true);
			
	 }

	
	 
	 @Test(priority=992)
	 public void verifyAddBtnFromIPMoreThanToIPCheckInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAddBtnFromIPMoreThanToIPCheckInNetworkPolicy(), true);
			
	 }
	 
	 
	 @Test(priority=993)
	 public void verifyAddBtnFromEndingWithZeroCheckInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAddBtnFromEndingWithZeroCheckInNetworkPolicy(), true);
			
	 }
	 
	 @Test(priority=994)
	 public void verifyClearBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClearBtn(), true);
			
	 }
	 

	 @Test(priority=995)
	 public void verifyIpStartWithZeroMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkIpStartWithZeroMessage(), true);
			
	 }
	 
	 
	 @Test(priority=996)
	 public void verifyInputValidStartIpAndEndIpInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkInputValidStartIpAndEndIpInNetworkPolicy(), true);
			
	 }
	 
	 
	 @Test(priority=997)
	 public void verifyClickOnSaveBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnSaveBtn(), true);
			
	 }
	 
   
	 @Test(priority=998)
	 public void verifyUpdateBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkUpdateBtn(), true);
			
	 }
	 
	 
	 @Test(priority=999)
	 public void verifyClearBtnWhileUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClearBtnWhileUpdate(), true);
			
	 }
	 
	 

	 
	 
	 @Test(priority=1001)
	 public void verifyCloseBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCloseBtn(), true);
			
	 }
	 

	 @Test(priority=1002)
	 public void verifyTitleAfterClickOnCancelBtnInAlertWhenUserClickOnCloseBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkTitleAfterClickOnCancelBtnInAlertWhenUserClickOnCloseBtn(), true);
			
	 }
	 
	 
	 @Test(priority=1003)
	 public void checkCloseAlertInAlertClickOnOkBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCloseAlertInAlertClickOnOkBtn(), true);
			
	 }
	 
	 
	 @Test(priority=1004)
	 public void verifyCloseImageInIpTextBoxOnMove() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCloseImageInIpTextBoxOnMove(), true);
			
	 }
	 

	 
	 
	 @Test(priority=1005)
	 public void checkSavedIpIsdisplayingUserCloseReOpenTheNetworkpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSavedIpIsdisplayingUserCloseReOpenTheNetworkpolicy(), true);
			
	 }
	 
	 
	 @Test(priority=1006)
	 public void checkSaveIP() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveIP(), true);
			
	 }

	 @Test(priority=1007)
	 public void checkSavedAllowIpInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSavedAllowIpInNetworkPolicy(), true);
			
	 }
	 */
	 
	 
	//Home Menu Security Password Policy Page Starts From Here
	 
	 
	/* @Test(priority=1008)
	 public void verifyPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPasswordPolicy(), true);
			
	 }
	 
	 
	 @Test(priority=1009)
	 public void verifyPolicyNameAsMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPolicyNameAsMandatory(), true);
			
	 }
	 
	 
	 @Test(priority=1010)
	 public void verifyMinimumPasswordLengthAsMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkMinimumPasswordLengthAsMandatory(), true);
			
	 }
	 
	 
	 @Test(priority=1011)
	 public void verifyMinimumPasswordLengthAsNumericFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkMinimumPasswordLengthAsNumericFields(), true);
			
	 }
	 
	 
	 @Test(priority=1012)
	 public void verifyComplexity() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkComplexity(), true);
			
	 }
	 
	 @Test(priority=1013)
	 public void verifyPasswordPolicySimpleSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPasswordPolicySimpleSave(), true);
			
	 }
	 
	 
	 @Test(priority=1014)
	 public void verifyPasswordPolicyLists() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPasswordPolicyLists(), true);
			
	 }
	 
	 
	 @Test(priority=1015)
	 public void verifyGetTheSimplePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkGetTheSimplePasswordPolicy(), true);
			
	 }
	 
	 @Test(priority=1016)
	 public void verifyUpdateSimplePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkUpdateSimplePasswordPolicy(), true);
			
	 }
	 


	 @Test(priority=1017)
	 public void verifyGetTheUpdatedPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkGetTheUpdatedPasswordPolicy(), true);
			
	 }
	 
	 
	 @Test(priority=1018)
	 public void verifyAlertOnDeletePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAlertOnDeletePasswordPolicy(), true);
			
	 }
	 
	 
	 @Test(priority=1019)
	 public void verifyCancelInAlertDeletePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCancelInAlertDeletePasswordPolicy(), true);
			
	 }
	 
	 @Test(priority=1020)
	 public void verifyOkInAlertDeletePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkOkInAlertDeletePasswordPolicy(), true);
			
	 }
	 
	 @Test(priority=1021)
	 public void verifySaveAlphabetsWithDoNotAllowPreviousPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveAlphabetsWithDoNotAllowPreviousPasswordpolicy(), true);
			
	 }
	 
	 
	 @Test(priority=1022)
	 public void verifySaveAlphanumericPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveAlphanumericPasswordpolicy(), true);
			
	 }
	 
	 
	 @Test(priority=1023)
	 public void verifySaveAlphanumericStarPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveAlphanumericStarPasswordpolicy(), true);
			
	 }
	 
	 
	 @Test(priority=1024)
	 public void verifySaveNumericPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveNumericPasswordpolicy(), true);
			
	 }
	 
	 
	 @Test(priority=1025)
	 public void verifySaveAlphaNumericSpecialPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveAlphaNumericSpecialPasswordPolicy(), true);
			
	 }
	 
	 @Test(priority=1026)
	 public void verifyInputAlphaNumericSpecialStarPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkInputAlphaNumericSpecialStarPasswordpolicy(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1027)
	 public void verifyMandatoyEmailAlphaNumericSpecailStarAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkMandatoyEmailAlphaNumericSpecailStarAllOptions(), true);
			
	 }
	 
	 
	 @Test(priority=1028)
	 public void checkMandatoryEmailOnLoginSuccess() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkMandatoryEmailOnLoginSuccess(), true);
			
	 }
	 
	 
	 @Test(priority=1029)
	 public void verifyMandatoryEmailOnLoginFailure() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkMandatoryEmailOnLoginFailure(), true);
			
	 }
	 
	 @Test(priority=1030)
	 public void verifyValidEmailOnSendEmailId() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkValidEmailOnSendEmailId(), true);
			
	 }
	 
	 @Test(priority=1031)
	 public void verifyValidEmailOnLoginFailure() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkValidEmailOnLoginFailure(), true);
			
	 }
	 
	 
	 @Test(priority=1032)
	 public void verifySavePasswordPolicyWithAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSavePasswordPolicyWithAllOptions(), true);
			
	 }
	 
	 @Test(priority=1033)
	 public void verifyCannotChangePasswordInPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCannotChangePasswordInPasswordPolicy(), true);
			
	 }
	 
	 @Test(priority=1034)
	 public void verifyCancelBtnInPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCancelBtnInPasswordPolicy(), true);
			
	 }
	 	
	 @Test(priority=1035)
	 public void verifyCloseBtnInPasswordpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCloseBtnInPasswordpolicy(), true);
			
	 }
     
     */
	 
	 
	//Home Menu Security Create Profile Page Starts From Here
	
	 /*
	
	 @Test(priority=1036)
	 public void verifyOpenSecurityMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkOpenSecurityMenu(), true);
			
	 }
	 
	
	 @Test(priority=1037)
	 public void verifySaveProfileWithProfileNameAsMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveProfileWithProfileNameAsMandatory(), true);
			
	 }
	 

	 @Test(priority=1038)
	 public void verifyErrorMessageDisplayInputProfileName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkErrorMessageDisplayInputProfileName(), true);
			
	 }
	 


	 @Test(priority=1039)
	 public void verifyMenuOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkMenuOptions(), true);
			
	 }
	 
	 
	 @Test(priority=1040)
	 public void verifyClickOnHomeMenus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnHomeMenus(), true);
			
	 }

	 
	 @Test(priority=1042)
	 public void verifyClickOnFinancialMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnFinancialMenu(), true);
			
	 }
	 
	 

	 
	 @Test(priority=1044)
	 public void checkClickOnInventoryOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnInventoryOptions(), true);
			
	 }
	 
	 @Test(priority=1045)
	 public void checkClickOnFixedAssetsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnFixedAssetsMenu(), true);
			
	 }
	 


	 @Test(priority=1047)
	 public void verifyClickOnProductionMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnProductionMenu(), true);
			
	 }
	 
	 
	 @Test(priority=1048)
	 public void verifyClickONPointOfSaleMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickONPointOfSaleMenu(), true);
			
	 }
	 
	 @Test(priority=1049)
	 public void verifyClickOnQualityControlMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnQualityControlMenu(), true);
			
	 }
	 
	 
	 @Test(priority=1050)
	 public void verifyClickOnSettingsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnSettingsMenu(), true);
			
	 }
	 
	 
	 
	 
	 @Test(priority=1051)
	 public void verifyclickOnSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkclickOnSave(), true);
			
	 } 

	 @Test(priority=1052)
	 public void verifyRestrictionOptionsUnderFixedAssetsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkRestrictionOptionsUnderFixedAssetsMenu(), true);
	 }
	

	 
	 
	 
	 @Test(priority=1053)
	 public void verifyPurchaseProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPurchaseProfile(), true);
	 }
	 
	 
	 @Test(priority=1054)
	 public void verifySavePurchaseProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSavePurchaseProfile(), true);
	 }
	 
	 
	 @Test(priority=1055)
	 public void verifyRestrictionsInSalesOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkRestrictionsInSalesOrder(), true);		
	 }
	 
	 
	 @Test(priority=1056)
	 public void verifySaveSalesOrderProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveSalesOrderProfile(), true);		
	 }
	 

	 @Test(priority=1057)
	 public void verifyAcessRestrictionOptionInSalesOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAcessRestrictionOptionInSalesOrder(), true);
	 }
	 
	 @Test(priority=1058)
	 public void verifySaveAccessRestrictionInSalesOrderProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveAccessRestrictionInSalesOrderProfile(), true);
			
	 }
	 
	 @Test(priority=1059)
	 public void verifyAddRestrictionOptioninSaleAddProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAddRestrictionOptioninSaleAddProfile(), true);
			
	 }
	 
	 

	 @Test(priority=1060)
	 public void checkEditRestrictionOptioninSaleOrderProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkEditRestrictionOptioninSaleOrderProfile(), true);
			
	 }
	
	 
	 @Test(priority=1061)
	 public void checkDeleteRestrictionOptioninSaleOrderProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkDeleteRestrictionOptioninSaleOrderProfile(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1062)
	 public void checkSelecttheSalesOrdervoucherfromthemenuandclickonPrintChkBox() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSelecttheSalesOrdervoucherfromthemenuandclickonPrintChkBox(), true);
			
	 }
	
	
	
	 
	 @Test(priority=1063)
	 public void checkRePrintRestrictionOptioninSaleOrderProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkRePrintRestrictionOptioninSaleOrderProfile(), true);
			
	 }
	 
	 @Test(priority=1064)
	 public void checkUnAuthorizeRestrictionOptioninSaleOrderProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkUnAuthorizeRestrictionOptioninSaleOrderProfile(), true);
			
	 }
	 
	 
	 @Test(priority=1065)
	 public void checkEditDocumentsByOtherEditDocumentsAreCheckedEditReconciledDocumentsEditDocumentsAuthorizationByHigherUps() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkEditDocumentsByOtherEditDocumentsAreCheckedEditReconciledDocumentsEditDocumentsAuthorizationByHigherUps(), true);
			
	 }
	 
	 
	 @Test(priority=1066)
	 public void checkAccessThroughAPI() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAccessThroughAPI(), true);
			
	 }
	 
	 @Test(priority=1067)
	 public void checkAlwaysSuspendingOnSavingoption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAlwaysSuspendingOnSavingoption(), true);
			
	 }
	 
	 @Test(priority=1068)
	 public void checkSalesChangePrintLayoutProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSalesChangePrintLayoutProfile(), true);
			
	 }
	 
	 
	 @Test(priority=1069)
	 public void checkAuthorizeAndRejectProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAuthorizeAndRejectProfile(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1070)
	 public void checkHomePageOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkHomePageOption(), true);
			
	 }
	 
	 
	
	 
	 @Test(priority=1071)
	 public void checkStopPageOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkStopPageOption(), true);
			
	 }
	 
	 	
	 
	 @Test(priority=1072)
	 public void checkViewDocumentsEnterByOtherCloseLinksSaveRevisionSuspendAndModifySettingsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkViewDocumentsEnterByOtherCloseLinksSaveRevisionSuspendAndModifySettingsOption(), true);
			
	 }
	 

	 
	 @Test(priority=1073)
	 public void checkFAReportsAllOptionsProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkFAReportsAllOptionsProfile(), true);
			
	 }
	 
	 @Test(priority=1074)
	 public void checkReportsSelectAllOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkReportsSelectAllOption(), true);
			
	 }
	 
	 
	 @Test(priority=1075)
	 public void checkLedgerProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkLedgerProfile(), true);
			
	 }
	 
	 @Test(priority=1076)
	 public void checkLedgerSelectAllOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkLedgerSelectAllOption(), true);
			
	 }
	 
	 @Test(priority=1077)
	 public void checkStockLedgerProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkStockLedgerProfile(), true);
			
	 }
	 
	 
	 @Test(priority=1078)
	 public void checkStockLedgerSelectAllOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkStockLedgerSelectAllOption(), true);
			
	 }
	 
	 @Test(priority=1079)
	 public void checkSLAccessProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSLAccessProfile(), true);
			
	 }
	 
	 @Test(priority=1080)
	 public void checkSLSearchProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSLSearchProfile(), true);
			
	 }
	 
	 
	 @Test(priority=1081)
	 public void checkSLPrintViewExportFilterProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSLPrintViewExportFilterProfile(), true);
			
	 }
	
	 
	 @Test(priority=1082)
	 public void checkAllMastersProfileOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAllMastersProfileOption(), true);
			
	 }

	 
	 
	 @Test(priority=1084)
	 public void checkRestrictionOptionsProductProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkRestrictionOptionsProductProfile(), true);
			
	 }
	 
	 
	 @Test(priority=1085)
	 public void checkSelectAllOptionsProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSelectAllOptionsProduct(), true);
			
	 }

	 
	 @Test(priority=1087)
	 public void checkProfileAddProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileAddProduct(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1088)
	 public void checkProfileEditProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileEditProduct(), true);
			
	 }
	 
	 @Test(priority=1089)
	 public void checkProfileCopyProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileCopyProduct(), true);
			
	 }
	

	 
	 @Test(priority=1090)
	 public void checkProfileSearchDeleteProduct() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileSearchDeleteProduct(), true);
			
	 }
	 
	 
 
	 
	 @Test(priority=1091)
	 public void checkProfileAllAcountsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileAllAcountsOption(), true);
			
	 }
	 
	 
	
	 @Test(priority=1092)
	 public void checkProfileAllAcountsOptionwithSelectAll() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileAllAcountsOptionwithSelectAll(), true);
			
	 }
	 
	 @Test(priority=1093)
	 public void checkProfileAllAcountsOptionwithSaveBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileAllAcountsOptionwithSaveBtn(), true);
			
	 }
	 
	 @Test(priority=1094)
	 public void checkProfileAllDepartmentOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileAllDepartmentOption(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1095)
	 public void checkProfileAllDepartmentOptionWithSelectAllOPtion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileAllDepartmentOptionWithSelectAllOPtion(), true);
			
	 }
	 
	 
	 @Test(priority=1096)
	 public void checkProfileDepartmentOptionwithSaveBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkProfileDepartmentOptionwithSaveBtn(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1097)
	 public void checkEditProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkEditProfile(), true);
			
	 }



	 @Test(priority=1098)
	 public void checkDeleteProfileSalesAccessAPIProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkDeleteProfileSalesAccessAPIProfile(), true);
			
	 }
	 
	 @Test(priority=1099)
	 public void checkNoOptioninDeletePopMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkNoOptioninDeletePopMessage(), true);
			
	 }
	 
	 
	 @Test(priority=1100)
	 public void SelectagainandClickonDeleteProfileButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.SelectagainandClickonDeleteProfileButton(), true);
			
	 }
	 
	 @Test(priority=1101)
	 public void checkYesOptioninDeletePopMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkYesOptioninDeletePopMessage(), true);
			
	 }
	 /*
	      
	 
	 @Test(priority=1102)
	 public void checkLoadFrom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkLoadFrom(), true);
			
	 }
	 
	 
	 @Test(priority=1103)
	 public void checkLoadFromScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkLoadFromScreen(), true);
			
	 }
	 
	 @Test(priority=1104)
	 public void checkSearchinLoadFrom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSearchinLoadFrom(), true);
			
	 }
	 
	 @Test(priority=1105)
	 public void checkCanceloptioninLoadFrom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCanceloptioninLoadFrom(), true);
			
	 }
	 
	 
	 @Test(priority=1106)
	 public void checkSaveoptioninLoadFrom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveoptioninLoadFrom(), true);
			
	 }
	 
	 
	 @Test(priority=1107)
	 public void checkSelecttheAllProductProfilefromtheLoadFromScreenandclickonOk() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSelecttheAllProductProfilefromtheLoadFromScreenandclickonOk(), true);
			
	 }


	 
	 @Test(priority=1108)
	 public void checkCLoseinCreateProfileScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCLoseinCreateProfileScreen(), true);
			
	 }
	 

	 @Test(priority=1109)
	 public void checkNewVoucherDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkNewVoucherDisplay(), true);
			
	 }
	 
	 

	 @Test(priority=1110)
	 public void checkNewVoucherSaveRestrictionWithMoreLengthsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkNewVoucherSaveRestrictionWithMoreLengthsOption(), true);
			
	 }
	 
	 @Test(priority=1111)
	 public void checkNewVoucherSaveRestrictionOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkNewVoucherSaveRestrictionOption(), true);
			
	 }

	 	 
     */
	 
	 //Create Role Starts From here
	 
	 
	/*@Test(priority=1112)
	 public void checkOpenCreateRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkOpenCreateRole(), true);
			
	 }
	
	
	 
	 @Test(priority=1113)
	 public void checkSaveButtonWithBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveButtonWithBlank(), true);
			
	 }
	 
	 
	 @Test(priority=1114)
	 public void checkCreateRoleTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateRoleTabs(), true);
			
	 }
	 
	 
	 @Test(priority=1115)
	 public void checkAssignedProfilesTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAssignedProfilesTab(), true);
			
	 }
	 
	 @Test(priority=1116)
	 public void checkPasswordPolicyintheAssignedProfileTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPasswordPolicyintheAssignedProfileTab(), true);
			
	 }
	 
	 @Test(priority=1117)
	 public void checkAvailableProfilesArea() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAvailableProfilesArea(), true);
			
	 }

	 
	 @Test(priority=1118)
	 public void checkClickOnRightArrowIconWithoutSelectProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnRightArrowIconWithoutSelectProfile(), true);
			
	 }
	 
	 @Test(priority=1119)
	 public void checkClickOnLeftArrowIconWithoutSelectProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnLeftArrowIconWithoutSelectProfile(), true);
			
	 }
	 
	 
	 @Test(priority=1120)
	 public void checkClickOnRightArrowIconWitSelectProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnRightArrowIconWitSelectProfile(), true);
			
	 }
	 
	 
	 @Test(priority=1121)
	 public void checkClickOnLeftArrowIconWitSelectProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnLeftArrowIconWitSelectProfile(), true);
			
	 }
	 
	 @Test(priority=1122)
	 public void checkSavebuttonwithoutselectingPasswordProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSavebuttonwithoutselectingPasswordProfile(), true);
			
	 }
	 
	
	 @Test(priority=1123)
	 public void checkSavebuttonwithoutselectingAssignedProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSavebuttonwithoutselectingAssignedProfile(), true);
			
	 }
	 	
	 @Test(priority=1124)
	 public void checkSavebuttonwithselectingAllabovefields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSavebuttonwithselectingAllabovefields(), true);
			
	 }
	 

	 @Test(priority=1125)
	 public void checkAdditionsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAdditionsTab(), true);
			
	 }
	 

	 @Test(priority=1126)
	 public void checkClickonPurchaseTransactionOfFinance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickonPurchaseTransactionOfFinance(), true);
			
	 }
	 
	 @Test(priority=1127)
	 public void checkPurchaseVoucherRestrictionsArea() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPurchaseVoucherRestrictionsArea(), true);
			
	 }
	 
	 
	 @Test(priority=1128)
	 public void checkAdditionTabPurchaseProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAdditionTabPurchaseProfile(), true);
			
	 }
	 
	 
	 @Test(priority=1129)
	 public void checkAdditionTabRequestForQuoteSubMenuOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAdditionTabRequestForQuoteSubMenuOptions(), true);
			
	 }
	 
	 @Test(priority=1130)
	 public void checkAdditionTabPurchaseQuationsSubMenuOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAdditionTabPurchaseQuationsSubMenuOptions(), true);
			
	 }
	 
	 @Test(priority=1131)
	 public void checkAdditionTabPurchaseOrderSubMenuOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAdditionTabPurchaseOrderSubMenuOptions(), true);
			
	 }
	 
	 @Test(priority=1132)
	 public void checkAdditionTabMaterialRecepitNotesSubMenuOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAdditionTabMaterialRecepitNotesSubMenuOptions(), true);
			
	 }
	 
	 @Test(priority=1133)
	 public void ExculsionTabInPurchaseProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.ExculsionTabInPurchaseProfile(), true);
			
	 }
	 
	 @Test(priority=1134)
	 public void checkClickonExculsionInventoryPurchaseRequestFoqQuote() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickonExculsionInventoryPurchaseRequestFoqQuote(), true);
			
	 }
	 
	 
	 @Test(priority=1135)
	 public void checkClickonExculsionInventoryPurchasePurchaseQuotation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickonExculsionInventoryPurchasePurchaseQuotation(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1136)
	 public void checkClickonExculsionInventoryPurchasePurchaseOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickonExculsionInventoryPurchasePurchaseOrder(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1137)
	 public void checkClickonExculsionInventoryPurchaseMaterialRecepitsNotes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickonExculsionInventoryPurchaseMaterialRecepitsNotes(), true);
			
	 }

	 
	 @Test(priority=1138)
	 public void checkClichOnExculsionRestrictionFiniancal() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClichOnExculsionRestrictionFiniancal(), true);
			
	 }
	 
	 @Test(priority=1139)
	 public void checkClickOnSaveAdditionAndExculsionTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnSaveAdditionAndExculsionTab(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1140)
	 public void checkAccountsCreationDisplayInRestrictionForEntryInSORestrictionRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAccountsCreationDisplayInRestrictionForEntryInSORestrictionRole(), true);
			
	 }
	 
	 
	 @Test(priority=1141)
	 public void checkItemCreationDisplayInRestrictionForEntryInSORestrictionRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkItemCreationDisplayInRestrictionForEntryInSORestrictionRole(), true);
			
	 }
	 
	 
	 @Test(priority=1142)
	 public void checkWarehouseCreationDisplayInRestrictionForEntryInSORestrictionRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkWarehouseCreationDisplayInRestrictionForEntryInSORestrictionRole(), true);
			
	 }
	 
	 @Test(priority=1143)
	 public void checkClickOnSaveRestrictionEntry() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnSaveRestrictionEntry(), true);
			
	 }
	 
	 @Test(priority=1144)
	 public void checkClickOnSaveRestrictionEntryWithExclusion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnSaveRestrictionEntryWithExclusion(), true);
			
	 }
	
	
	 @Test(priority=1145)
	 public void checkTransactionRights() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkTransactionRights(), true);
			
	 }
	 
	
	 @Test(priority=1146)
	 public void checkEditAndUpdateRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkEditAndUpdateRole(), true);
			
	 }
	  
	 
	 @Test(priority=1147)
	 public void checkUpdatedRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkUpdatedRole(), true);
			
	 }
	 
	 
	 @Test(priority=1148)
	 public void checkDeleteRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkDeleteRole(), true);
			
	 }
	 
	 
	 @Test(priority=1149)
	 public void checkNoOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkNoOption(), true);
			
	 }
	 
	 
	 @Test(priority=1150)
	 public void SelectagainandClickonDeleteRoleButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.SelectagainandClickonDeleteRoleButton(), true);
			
	 }
	 
	 
	 @Test(priority=1151)
	 public void checkYesOptioninDeleteRolePopMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkYesOptioninDeleteRolePopMessage(), true);
			
	 }
	 
	 @Test(priority=1152)
	 public void checkCloseButtonInRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCloseButtonInRole(), true);
			
	 }*/
	 
	  // Create Role Stops Here
	 
	 
	 
	  // Create User Starts Here
	 
	 @Test(priority=1153)
	 public void checkClickOnCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkClickOnCreateUser(), true);
			
	 }
	 
	
	 @Test(priority=1154)
	 public void checkSaveButtonWithoutMandatoryInputsInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveButtonWithoutMandatoryInputsInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1155)
	 public void checkRoleAsMandatoryCheckByInputUserName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkRoleAsMandatoryCheckByInputUserName(), true);
			
	 }
	 
	 
	 @Test(priority=1156)
	 public void checkERPRolesOptionInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkERPRolesOptionInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1157)
	 public void checkPasswordPolicyOnSelectingERPRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPasswordPolicyOnSelectingERPRole(), true);
			
	 }
	 
	 @Test(priority=1158)
	 public void checkPasswordPolicyInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPasswordPolicyInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1159)
	 public void checkPasswordAsMandatoryCheckInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkPasswordAsMandatoryCheckInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1160)
	 public void checkConfirmPasswordAsMandatoryCheckInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkConfirmPasswordAsMandatoryCheckInCreateUser(), true);
			
	 }
	 
	 @Test(priority=1161)
	 public void checkNameAsMandatoryCheckInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkNameAsMandatoryCheckInCreateUser(), true);
			
	 }
	 
	 @Test(priority=1162)
	 public void checkLoginAbbreviationAsMandatoryCheckInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkLoginAbbreviationAsMandatoryCheckInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1163)
	 public void checkSecurityQuestionAsMandatoryInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSecurityQuestionAsMandatoryInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1164)
	 public void checkSecurityAnswerAsMandatoryInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSecurityAnswerAsMandatoryInCreateUser(), true);
			
	 }
	 
	 @Test(priority=1165)
	 public void checkTypeAsMandatoryInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkTypeAsMandatoryInCreateUser(), true);
			
	 }
	 
	 @Test(priority=1166)
	 public void checkLanguageInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkLanguageInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1167)
	 public void checkAltLanguageInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAltLanguageInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1168)
	 public void checkEmailAsMandatoryInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkEmailAsMandatoryInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1169)
	 public void checkInvalidEmailAsMandatoryInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkInvalidEmailAsMandatoryInCreateUser(), true);
			
	 }
	 
	 @Test(priority=1170)
	 public void checkConfirmPasswordAsInvalid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkConfirmPasswordAsInvalid(), true);
			
	 }
	 
	 
	 @Test(priority=1171)
	 public void checkSaveUserWithAllMandatoryInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveUserWithAllMandatoryInCreateUser(), true);
			
	 }
	 
	 @Test(priority=1172)
	 public void checkGetSaveUserNameDisplayInTheList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkGetSaveUserNameDisplayInTheList(), true);
			
	 }	 
	 
	 
	 @Test(priority=1173)
	 public void checkCreateUserWithPurchaseINVFARole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserWithPurchaseINVFARole(), true);
			
	 }
	 
	 @Test(priority=1174)
	 public void checkRestrictionOfEntryTabInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkRestrictionOfEntryTabInCreateUser(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1175)
	 public void checkCreateUserWithAccPOTransRight() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserWithAccPOTransRight(), true);
			
	 }
	
	 
	 @Test(priority=1176)
	 public void checkDeleteRowInInResOfEntryInCreatedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkDeleteRowInInResOfEntryInCreatedUser(), true);
			
	 }
	 
	 
	 
	 @Test(priority=1177)
	 public void checkCreateUserWithItemPOTransRight() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserWithItemPOTransRight(), true);
			
	 }
	
	 
	 @Test(priority=1178)
	 public void checkAddRowInResOfEntryInCreatedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkAddRowInResOfEntryInCreatedUser(), true);
			
	 }
	 
	 @Test(priority=1179)
	 public void checUserWithExculsion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checUserWithExculsion(), true);
			
	 }
	 
	 
	 
	 
	 @Test(priority=1180)
	 public void checkCreateUserWithAccDisable() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserWithAccDisable(), true);
			
	 }
	 
	 @Test(priority=1181)
	 public void checkCreateUserWithDonotLockAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserWithDonotLockAccount(), true);
			
	 }
	 
	 @Test(priority=1182)
	 public void checkCreateUserWithAllowMultiLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserWithAllowMultiLogin(), true);
			
	 }
	 
	 @Test(priority=1183)
	 public void checkCreateUserWithSendEmailNotificationOnLognSuccess() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserWithSendEmailNotificationOnLognSuccess(), true);
			
	 }
	 
	 @Test(priority=1184)
	 public void checkCreateUserWithSendEmailNotificationonLoginFailure() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserWithSendEmailNotificationonLoginFailure(), true);
			
	 }
	 
	 @Test(priority=1185)
	 public void checkCreateUserwithBlockDateandTime() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserwithBlockDateandTime(), true);
			
	 }
	 
	 @Test(priority=1186)
	 public void checkCurrentTimewithLessThanCurrentTimeInRestrictionTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCurrentTimewithLessThanCurrentTimeInRestrictionTab(), true);
			
	 }
	 
	 @Test(priority=1187)
	 public void checkwithMoreThanCurrentTimeInRestrictionTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkwithMoreThanCurrentTimeInRestrictionTab(), true);
			
	 }
	 
	 
	 @Test(priority=1188)
	 public void checkCreateGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateGroup(), true);
			
	 }
	 
	 @Test(priority=1189)
	 public void CheckCreateGroupWithGroupName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.CheckCreateGroupWithGroupName(), true);
			
	 }
	 
	 @Test(priority=1190)
	 public void CheckCreateGroupWithMandatoryFileds() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.CheckCreateGroupWithMandatoryFileds(), true);
			
	 }
	 
	 @Test(priority=1191)
	 public void checkCreationOFUserUnderCreatedGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreationOFUserUnderCreatedGroup(), true);
			
	 }
	 
	 @Test(priority=1192)
	 public void checkDeleteInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkDeleteInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1193)
	 public void checkNoOptionInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkNoOptionInCreateUser(), true);
			
	 }
	 
	 
	 @Test(priority=1194)
	 public void SelectagainUserandClickonDeleteButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.SelectagainUserandClickonDeleteButton(), true);
			
	 }
	 
	 @Test(priority=1195)
	 public void checkYesOptioninDeleteUserPopMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkYesOptioninDeleteUserPopMessage(), true);
			
	 }
	
	 	  
	 
	 @Test(priority=1196)
	 public void checkCreateUserRestrictionForEntryAccountsReportAndView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUserRestrictionForEntryAccountsReportAndView(), true);
			
	 }


	 @Test(priority=1197)
	 public void checkCreateUseWithLoadFromUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkCreateUseWithLoadFromUser(), true);
			
	 }

	 @Test(priority=1198)
	 public void checkSelectionOfUserInLoadFromButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSelectionOfUserInLoadFromButton(), true);
			
	 }
	 
	 
	 

	 @Test(priority=1199)
	 public void checkSaveUserWithLoadFromAsNameMandatory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveUserWithLoadFromAsNameMandatory(), true);
			
	 }
	 
	 

	 @Test(priority=1200)
	 public void checkSaveUserWithLoadFromAsEmail() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveUserWithLoadFromAsEmail(), true);
			
	 }
	 
	 
	 
	 
	 @Test(priority=1201)
	 public void checkSaveUserWithLoadFrom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		 Assert.assertEquals(hpmnsp.checkSaveUserWithLoadFrom(), true);
			
	 }
	 
	
	
	 @Test(priority=1202)
	 public void CheckPasswordPolicyForSimpleinCraeteUserScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.CheckPasswordPolicyForSimpleinCraeteUserScreen(), true);
	 }
		
	 @Test(priority=1203)
	 public void checkAlphabetsWithDontallowPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkAlphabetsWithDontallowPrevious(), true);
	 }
	 
	 @Test(priority=1204)
	 public void checkAlphabetsWithNumeric() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkAlphabetsWithNumeric(), true);
	 }
	 
	 
	 @Test(priority=1205)
	 public void checkAlphabetsWithNumericStar() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkAlphabetsWithNumericStar(), true);
	 }
	 
	 
	 @Test(priority=1206)
	 public void checkNumeric() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkNumeric(), true);
	 }
	 
	 
	 @Test(priority=1207)
	 public void checkAlphaNumericSpecial() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkAlphaNumericSpecial(), true);
	 }

	 
	 @Test(priority=1208)
	 public void checkAlphaNumericSpecialStarWithAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkAlphaNumericSpecialStarWithAllOptions(), true);
	 }
	 
	 
	 @Test(priority=1209)
	 public void checkSimpleWithCannotChangePassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkSimpleWithCannotChangePassword(), true);
	 }
	 

	 @Test(priority=1210)
	 public void checkResetOptionInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkResetOptionInCreateUser(), true);
	 }
	
	
	
	 @Test(priority=1211)
	 public void checkMoveOptionWithoutSelctionOfUserInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkMoveOptionWithoutSelctionOfUserInCreateUser(), true);
	 }
	 
	 
	 @Test(priority=1212)
	 public void checkMovePageWithSelectingUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkMovePageWithSelectingUser(), true);
	 }
	 
	 @Test(priority=1213)
	 public void checkMovePageClickOnMoveWithoutSelectionOfGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkMovePageClickOnMoveWithoutSelectionOfGroup(), true);
	 }
	 
	 @Test(priority=1214)
	 public void checkMoveUserWitSelectingUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkMoveUserWitSelectingUser(), true);
	 }
	 
	 @Test(priority=1215)
	 public void checkEditUserWithAddPhoto() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkEditUserWithAddPhoto(), true);
	 }
	 
	 
	 @Test(priority=1216)
	 public void checkEditUserWithAddSignature() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkEditUserWithAddSignature(), true);
	 }
	 
	 @Test(priority=1217)
	 public void checkSaveUserWithAddPhotoAndSignature() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkSaveUserWithAddPhotoAndSignature(), true);
	 }
	 
	 @Test(priority=1218)
	 public void checkEditAndCheckUserWithAddPhotoAndAddSignature() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkEditAndCheckUserWithAddPhotoAndAddSignature(), true);
	 }
	 
	 @Test(priority=1219)
	 public void checkCloseOptionInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    hpmnsp=new HPHomeMenuSecurityPage(getDriver());
		Assert.assertEquals(hpmnsp.checkCloseOptionInCreateUser(), true);
	 }
}
