package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPWrapperLayoutPage;
import com.focus.base.BaseEngine;

public class HPWrapperLayoutTest extends BaseEngine
{
	HPWrapperLayoutPage hplp;
	
	@Test(priority=38)
	public void verifyAvailabilityOptionsInWrapperLayout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkAvailibityOfOptionsInWrapperLayout(), true);
	}
    
	@Test(priority=39)
	public void verifyAvailabilityOptionsInAboutIdQuickAccessMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkAboutIdQuickAccessMenu(), true);
	   
	}
	
	@Test(priority=40)
	public void verifyClickOnAbout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.clickOnAbout(), true);
	   
	}

	@Test(priority=41)
	public void verifySearchOptionByInputingEditCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkEditCompanyOptionInSearch(), true);
	   
	}
	
	
	@Test(priority=42)
	public void verifySelectEditCompanyFromSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkSelectingEditCompanyInSearch(), true);
	   
	}
	
	@Test(priority=43)
	public void verifyAlertByUpdatingCompanyClickOnOkButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkUpdateTheCompanyAlertThroughSearch(), true);
	   
	}

	
	@Test(priority=44)
	public void verifyCloseEditCompanyPageClickOnCancelButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.clickOnCloseTheEditCompanyThroughSearch(),true);
	   
	}	

	@Test(priority=45)
	public void verifyRecentMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(hplp.checkRecentMenus(),true);
	   
	}	
	
	
	
	
	@Test(priority=47)
	public void verifyChangePassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkChangePasswordFields(),true);
	   
	}	
	
	@Test(priority=48)
	public void verifySaveWithoutInputMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkMandatoryMessageForOldPasswordOnClickSaveButtonInChangePassword(),true);
	   
	}
	
	
	@Test(priority=49)
	public void verifySaveWithoutInputNewPasswordMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkMandatoryMessageForNewPasswordOnClickSaveButtonInChangePassword(),true);
	   
	}	
	
	
	@Test(priority=50)
	public void verifySaveWithoutInputConfirmPasswordMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkMandatoryMessageForConfirmPasswordOnClickSaveButton(),true);
	   
	}	
	
	
	@Test(priority=51)
	public void verifySaveWithMissmatchInputNewPasswordConfirmPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkConfirmPasswordNewPasswordMatchOnClickSaveButton(),true);
	   
	}	
	
	

	@Test(priority=52)
	public void verifySaveWithInvalidOldPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkInvalidMessageForOldPasswordOnClickSaveButton(),true);
	   
	}	
	
	
	@Test(priority=53)
	public void verifySaveSameInputOldPasswordNewPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkMessageOldNewPasswordSameFOnClickSaveButton(),true);
	   
	}	
	
	@Test(priority=54)
	public void verifySaveWithValidInputOldNewConfirmPassowrd() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkSaveValidOldNewPasswordFOnClickSaveButton(),true);
	   
	}	
	
    @Test(priority=55)
	public void verifyCloseBtnInChangePasswordAndCheckLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	  hplp=new HPWrapperLayoutPage(getDriver());
		  Assert.assertEquals(HPWrapperLayoutPage.checkCloseBtnInChangePasswordAndCheckLogout(),true);
	   
	}	
	
	@Test(priority=56)
	public void verifyLoginAfterChangePasswordChangePasswordAndLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	     hplp=new HPWrapperLayoutPage(getDriver());
	     Assert.assertEquals(HPWrapperLayoutPage.checkLoginAfterChangePasswordChangePasswordAndLogout(),true);
		   
	}	
	
	
	
}
