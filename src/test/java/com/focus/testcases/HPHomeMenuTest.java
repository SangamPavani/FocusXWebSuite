package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPHomeMenuPage;
import com.focus.base.BaseEngine;

public class HPHomeMenuTest extends BaseEngine {

	HPHomeMenuPage hpmp;
	
	  @Test(priority=57)
	  public void verifyHomePageMenusAfterChangePassword() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkHomePageMenuLoginAfterChangePassword(), true);
	   
	  }
	  
	  
	  @Test(priority=58)
	  public void verifyHomeMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkHomeMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=59)
	  public void verifyCompanyMenuInHomeMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkCompanyMenuInHomeMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=60)
	  public void verifyNewCompanyMenuInCompanyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkCreateCompanyInNewCompanyMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=61)
	  public void verifyYearEndProcessMenuInCompanyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkYearEndProcessInCompanyMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=62)
	  public void verifyInterCompanyMenuInCompanyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkInterCompanyMenuOptions(), true);
	   
	  }
	  
	  
	 @Test(priority=63)
	  public void verifySecurityInCompanyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkSecuritySubMenus(), true);
	   
	  }
	  
	  @Test(priority=64)
	  public void verifyMastersInCompanyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkMastersSubMenus(), true);
	   
	  }
	  
	  
	  @Test(priority=65)
	  public void verifyCurrencyMasterInMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkCurrencyInMastersMenu(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=66)
	  public void verifyProductMasterInMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.verifyProductSubMenu(), true);
	   
	  }
	  
	  @Test(priority=67)
	  public void verifyMRPMasterInMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.verifyMRPSubMenu(), true);
	   
	  }
	  
	  
	  @Test(priority=68)
	  public void verifyQCMasterInMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.verifyQCSubMenus(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=69)
	  public void verifyMaintainanceMasterInMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.verifyMaintainanceSubMenus(), true);
	   
	  }
	  
	  
	  @Test(priority=70)
	  public void verifyPointOfSaleMasterInMastersMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.verifyPointOfSaleSubMenus(), true);
	   
	  }
	  
	  
	  @Test(priority=71)
	  public void verifyMemberMasterInPointOfSaleMasterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkMemberMasterMenuInPointOfSale(), true);
	   
	  }
	  

	  @Test(priority=72)
	  public void verifyGiftVoucherInPointOfSaleMasterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkGiftVoucherMasterMenuInPointOfSale(), true);
	   
	  }

	  
	  
	  @Test(priority=73)
	  public void verifyDiscountVoucherInPointOfSaleMasterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkDiscountVoucherMasterMenuInPointOfSale(), true);
	   
	  }
	  
	  
	  @Test(priority=74)
	  public void verifyTableManagementInPointOfSaleMasterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkTableManagementMasterMenuInPointOfSale(), true);
	   
		  
	  }
	  
	  
	  
	  
	  @Test(priority=75)
	  public void verifyPayrollMenuMasterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.verifyPayrollSubMenus(), true);
	   
	  }
	  
	  
	  
	  
	  
	  @Test(priority=76)
	  public void verifyDataMangementInCompanyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkDataManagementSubMenus(), true);
	   
	  }
	  
	  
	  
	  
	  
	  
	  @Test(priority=77)
	  public void verifyUtilitiesInCompanyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  hpmp=new HPHomeMenuPage(getDriver());
		  Assert.assertEquals(HPHomeMenuPage.checkUtilitiesSubMenu(), true);
	   
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
