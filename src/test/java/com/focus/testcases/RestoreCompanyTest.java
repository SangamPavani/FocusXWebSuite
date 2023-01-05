package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.RestoreCompanyPage;
import com.focus.base.BaseEngine;

public class RestoreCompanyTest extends BaseEngine
{
	
	private static RestoreCompanyPage rcp; 


      //Click on Restore
	  @Test(priority=300001)
	  public void checkAdminCredentialsScreenOnClickOnRestoreOptionInLoginPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(rcp.checkAdminCredentialsScreenOnClickOnRestoreOptionInLoginPage(), true);
	  }
	
	   //Click on Login on Input of user name and password
	  @Test(priority=300002)
	  public void checkLoginButtonInAdminCredentialsByInputUserNameAndPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkLoginButtonInAdminCredentialsByInputUserNameAndPassword(), true);

	  }
	  
	  //Click on Restore Company without Path
	  @Test(priority=300003)
	  public void checkClickOnRestoreCompanyWithoutPath() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkClickOnRestoreCompanyWithoutPath(), true);

	  }
	  
	  
	  //Click on Browse Button the Restore Company
	  @Test(priority=300004)
	  public void checkClickOnBrowseBtnAndSelectBackupInRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkClickOnBrowseBtnAndSelectBackupInRestoreCompany(), true);

	  }


	  @Test(priority=300005)
	  public void checkClickOnRestoreCompanyOnSelectingPath() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkClickOnRestoreCompanyOnSelectingPath(), true);

	  }

	  @Test(priority=300006)
	  public void checkClickOnCancelButtonInRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(rcp.checkClickOnCancelButtonInRestoreCompany(), true);

	  }

	  
	  
	  @Test(priority=300007)
	  public void checkClickOnNoButtonInRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(rcp.checkClickOnNoButtonInRestoreCompany(), true);

	  }

	  
	  
	  @Test(priority=300008)
	  public void checkCompanyRestoreCompanyCodeIsDisplayInCompanyList() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(rcp.checkCompanyRestoreCompanyCodeIsDisplayInCompanyList(), true);

	  }
	  
	  
	  @Test(priority=300009)
	  public void checkClickOnYesButtonInRestoreCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(rcp.checkClickOnYesButtonInRestoreCompany(), true);

	  }
	  
	  
	  @Test(priority=300010)
	  public void checkSignInBtToCheckRestoreYesWithValidUserNameAndValidPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkSignInBtToCheckRestoreYesWithValidUserNameAndValidPassword(), true);
	  }
	  
	  
	  @Test(priority=300011)
	  public void checkDatatStatisticsInCompanyBackupRestoreWithYesOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkDatatStatisticsInCompanyBackupRestoreWithYesOption(), true);
	  }
	  
	  
	  
	  @Test(priority=300012)
	  public void checkCloseBtnInDataStatistics() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkCloseBtnInDataStatistics(), true);
	  }
	  
	  @Test(priority=300013)
	  public void checkSignOutLoginCompanyWithYesOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(rcp.checkSignOutLoginCompanyWithYesOption(), true);
	  }
	  
	  @Test(priority=300014)
	  public void checkSignInBtToCheckRestoreNoWithValidUserNameAndValidPassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkSignInBtToCheckRestoreNoWithValidUserNameAndValidPassword(), true);
	  }
	  
	  @Test(priority=300015)
	  public void checkDatatStatisticsInCompanyBackupRestoreWithNoOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkDatatStatisticsInCompanyBackupRestoreWithNoOption(), true);
	  }
	  
	  @Test(priority=300016)
	  public void checkCloseBtnInDataStatisticsCompanyWithNoOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(RestoreCompanyPage.checkCloseBtnInDataStatisticsCompanyWithNoOption(), true);
	  }
	  
	  @Test(priority=300017)
	  public void checkSignOutLoginCompanyWithNoOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  rcp=new RestoreCompanyPage(getDriver());		  
		  Assert.assertEquals(rcp.checkSignOutLoginCompanyWithNoOption(), true);
	  }
	  
	  
	  
}
