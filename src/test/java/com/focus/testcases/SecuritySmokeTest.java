package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SecuritySmokePage;
import com.focus.base.BaseEngine;

public class SecuritySmokeTest extends BaseEngine
{
	 static SecuritySmokePage ssp;
	 
	 @Test(priority=1)
	 public void checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkLoginCompanyWithValidCredentials(), true);
	 }
	
	
	 @Test(priority=989)
	 public void verifyOpenNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkOpenNetworkPolicy(), true);			
	 }

		 		
	 
	 @Test(priority=990)
	 public void verifyInputValidStartIpAndEndIpInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkInputValidStartIpAndEndIpInNetworkPolicy(), true);
	 }
	 
	 
	 @Test(priority=991)
	 public void verifyClickOnSaveBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkClickOnSaveBtn(), true);
	 }
	 
   
	 @Test(priority=992)
	 public void verifyUpdateBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkUpdateBtn(), true);
	 }
	 
	 
	 @Test(priority=993)
	 public void verifyClearBtnWhileUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkClearBtnWhileUpdate(), true);
	 }
		 
	 
	 @Test(priority=994)
	 public void checkCloseAlertInAlertClickOnOkBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkCloseAlertInAlertClickOnOkBtn(), true);
	 }
	 
	 
	 @Test(priority=995)
	 public void checkOptionDeleteToCickCloseImageInIpTextBoxOnMove() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkOptionDeleteToCickCloseImageInIpTextBoxOnMove(), true);
	 }

	 
	 @Test(priority=996)
	 public void checkSavedIpIsdisplayingUserCloseReOpenTheNetworkpolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkSavedIpIsdisplayingUserCloseReOpenTheNetworkpolicy(), true);
	 }
	 
	 
	 @Test(priority=997)
	 public void checkSaveIP() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkSaveIP(), true);	
	 }

	 @Test(priority=998)
	 public void checkCloseBtnInNetworkPolicyPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkCloseBtnInNetworkPolicyPage(), true);
	 }
	 
	 
	 @Test(priority=999)
	 public void checkSavedAllowIpInNetworkPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkSavedAllowIpInNetworkPolicy(), true);
	 }
 
	 // PassWord Policy
	 @Test(priority=1008)
	 public void verifyPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkPasswordPolicy(), true);
	 }
	 
	 @Test(priority=1013)
	 public void verifyPasswordPolicySimpleSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkPasswordPolicySimpleSave(), true);		
	 }
	
	 @Test(priority=1014)
	 public void verifyPasswordPolicyLists() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkPasswordPolicyLists(), true);
	 }
	 
	 @Test(priority=1015)
	 public void verifyGetTheSimplePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkGetTheSimplePasswordPolicy(), true);
	 }
	 
	 @Test(priority=1016)
	 public void verifyUpdateSimplePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkUpdateSimplePasswordPolicy(), true);		
	 }
	 
	 @Test(priority=1017)
	 public void verifyGetTheUpdatedPasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkGetTheUpdatedPasswordPolicy(), true);
	 }
	 
	 @Test(priority=1018)
	 public void verifyAlertOnDeletePasswordPolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 ssp=new SecuritySmokePage(getDriver());
		 Assert.assertEquals(ssp.checkAlertOnDeletePasswordPolicy(), true);
	 }
	 
	 @Test(priority=1021)
	 public void CheckSavingPassWordPolicyOfNumericTypeandSimplePolicy() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.CheckSavingPassWordPolicyOfNumericTypeandSimplePolicy(), true);
	 }
	 
	

	 // Create Profile
	
	 @Test(priority=1030)
	 public void checkCreateProfilePageWithAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfilePageWithAllOptions(), true);
	 }
	 
	 @Test(priority=1031)
	 public void checkCreateProfileSubMenus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileSubMenus(), true);
	 }
	 
	 @Test(priority=1032) //
	 public void checkCreateProfileHomeMastersAccountRestrictionsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileHomeMastersAccountRestrictionsTab(), true);
	 }

	 @Test(priority=1033)
	 public void checkCreateProfileHomeMastersAccountSelectingAllCheckBox() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileHomeMastersAccountSelectingAllCheckBox(), true);
	 }
	 
	 @Test(priority=1036) //
	 public void checkCreateProfileFinancialsTransactionsSalesSalesInvoiceRestrictionsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileFinancialsTransactionsSalesSalesInvoiceRestrictionsTab(), true);
	 }
	  
	 @Test(priority=1037)
	 public void checkCreateProfileFinancialsTransactionsSalesSalesInvoiceSelectingAllCheckBoxes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileFinancialsTransactionsSalesSalesInvoiceSelectingAllCheckBoxes(), true);
	 }
	 
	 @Test(priority=1040)
	 public void checkCreateProfileSavingProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileSavingProfile(), true);
	 }
	 
	 @Test(priority=1045)
	 public void checkCreateProfileValidatingSalesInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileValidatingSalesInvoice(), true);
	 }
	 
	 @Test(priority=1046)
	 public void checkCreateProfileSalesInvoiceSelectingSuspendOnSavingAndHideMenuCheckBoxes() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileSalesInvoiceSelectingSuspendOnSavingAndHideMenuCheckBoxes(), true);
	 }
	 
	 @Test(priority=1049)
	 public void checkCreateProfileSavingAfterEditingProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileSavingAfterEditingProfile(), true);
	 }
	 
	 @Test(priority=1052)
	 public void checkCreateProfileValidatingSalesInvoiceAfterSavingEditedProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileValidatingSalesInvoiceAfterSavingEditedProfile(), true);
	 }
	 
	 @Test(priority=1055)
	 public void CheckSavingAllProfileSTwithAlloptionsEnabled() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	 	ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.CheckSavingAllProfileSTwithAlloptionsEnabled(), true);
  	 }
	 
	 @Test(priority=1056)
	 public void checkCreateProfileLoadFromAllProfileAndValidatePurchasesVouchers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileLoadFromAllProfileAndValidatePurchasesVouchers(), true);
	 }
	 
	 @Test(priority=1057)
	 public void checkCreateProfileSavingValidatingAndDeletingLoadedProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateProfileSavingValidatingAndDeletingLoadedProfile(), true);
	 }
	 
	
	
	// Create Role
	
	 @Test(priority=1070)
	 public void checkCreateRolePageWithAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateRolePageWithAllOptions(), true);
	 }
	 
	 @Test(priority=1072)
	 public void report_Filter_RefreshConditionBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkPasswordPolicyintheAssignedProfileTab(), true);
	 }
	 
	 @Test(priority=1075)
	 public void checkClickOnRightArrowIconWitSelectProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkClickOnRightArrowIconWitSelectProfile(), true);
	 }
	 
	 @Test(priority=1076)
	 public void checkClickOnLeftArrowIconWitSelectProfile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkClickOnLeftArrowIconWitSelectProfile(), true);
	 }
	 
	 
	 @Test(priority=1079)//purchase voucher
	 public void checkSaveingRoleWithAllfieldsInAllTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkSaveingRoleWithAllfieldsInAllTabs(), true);
	 }
	 
	 
	 @Test(priority=1081)
	 public void checkEditAndUpdateSavedRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkEditAndUpdateSavedRole(), true);
	 }
	 
	 @Test(priority=1082)
	 public void checkCompareAndDeleteUpdatedRole() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCompareAndDeleteUpdatedRole(), true);
	 }
	  
	
	 @Test(priority=1083)
	 public void checkSavingRoleWithAllProfileST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkSavingRoleWithAllProfileST(), true);
		
	 }
	 
	 
	
	 
	 // Create User
	
	 @Test(priority=1100)
	 public void checkCreateUsersPageWithAllOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkCreateUsersPageWithAllOptions(), true);
	 }
	  
	 @Test(priority=1112)
	 public void checInputMandatoryFieldsInCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checInputMandatoryFieldsInCreateUser(), true);
	 } 
	 
	 @Test(priority=1120)
	 public void checkUserDataInSavedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkUserDataInSavedUser(), true);
	 }
	 
	 @Test(priority=1121)
	 public void checkLogoutAndLoginWithNewlySavedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkLogoutAndLoginWithNewlySavedUser(), true);
	 }
	 
	 @Test(priority=1122)
	 public void checkLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkLogoutAndLoginWithSU(), true);
	 }
	 
	 @Test(priority=1123)
	 public void checkEditingAndUpdatingSavedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkEditingAndUpdatingSavedUser(), true);
	 }
	 
	 @Test(priority=1124)
	 public void checkUserDataInUpdatedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkUserDataInUpdatedUser(), true);
	 }
	 
	 @Test(priority=1125)
	 public void checkLogoutAndLoginWithUpdatedUserWithPreviousPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkLogoutAndLoginWithUpdatedUserWithPreviousPassword(), true);
	 }
	 
	 @Test(priority=1126)
	 public void checkLoginWithUpdatedPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkLoginWithUpdatedPassword(), true);
	 }
	 
	 @Test(priority=1127)
	 public void checkLogoutAndLoginWithSUToUpdatedUserDeleteUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkLogoutAndLoginWithSUToUpdatedUserDeleteUser(), true);
	 }
	 
	 @Test(priority=1128)
	 public void checkDeletingUpdatedUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkDeletingUpdatedUser(), true);
	 }
	 
	
	 @Test(priority=1129)
	 public void checkSavingUserWithRoleST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkSavingUserWithRoleST(), true);
	 }
	 
	 @Test(priority=1130)
	 public void checkSavingUserWithRoleSTRestriction() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkSavingUserWithRoleSTRestriction(), true);
	 }
	   
	 @Test(priority=1131)
	 public void checkSavingUserWithExclusion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkSavingUserWithExclusion(), true);
	 }
	 
	
	
	 @Test(priority=1134)
	 public void checkLogoutUserSecurityPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
	    ssp=new SecuritySmokePage(getDriver());
		Assert.assertEquals(ssp.checkLogoutUserSecurityPage(), true);
	 }
	 
	
	 
	 	 
}
