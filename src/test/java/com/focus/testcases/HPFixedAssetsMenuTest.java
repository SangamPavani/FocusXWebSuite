package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.HPFixedAssetsMenuPage;
import com.focus.base.BaseEngine;


public class HPFixedAssetsMenuTest extends BaseEngine
{
	HPFixedAssetsMenuPage HPFASP;
	
	  @Test(priority=116)
	  public void verifyFixedAssetsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 HPFASP=new HPFixedAssetsMenuPage(getDriver());
		 Assert.assertEquals(HPFixedAssetsMenuPage.checkFixedAssetsMenu(), true);
	  }
	 
	  
	  @Test(priority=117)
	  public void verifyTransactionMenuInFixedAssetsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 HPFASP=new HPFixedAssetsMenuPage(getDriver());
		 Assert.assertEquals(HPFixedAssetsMenuPage.checkTransactionMenuInFixedAssetsMenu(), true);
	  }
	  
	  
	  @Test(priority=118)
	  public void verifyReportsMenuInTransactionMenuInFixedAssetsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 HPFASP=new HPFixedAssetsMenuPage(getDriver());
		 Assert.assertEquals(HPFixedAssetsMenuPage.checkReportsMenuInTransactionsMenuInFixedAssetsMenu(), true);
	  }
	  
	 
	 
	 
	
}
