package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.HPProductionMenuPage;
import com.focus.base.BaseEngine;


public class HPProductionMenuTest extends BaseEngine {

	
	HPProductionMenuPage HPPMP;
	
	  @Test(priority=119)
	  public void verifyProductionsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 HPPMP=new HPProductionMenuPage(getDriver());
		 Assert.assertEquals(HPProductionMenuPage.checkProductionMenu(), true);
	  }
	 
	  @Test(priority=120)
	  public void verifyTransactionMenuInProductionMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 HPPMP=new HPProductionMenuPage(getDriver());
		 Assert.assertEquals(HPProductionMenuPage.checkTransactionMenuInProductionMenu(), true);
	  }
	 
	  @Test(priority=121)
	  public void verifyReportsMenuInProductionMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 HPPMP=new HPProductionMenuPage(getDriver());
		 Assert.assertEquals(HPProductionMenuPage.checkReportsMenuInProductionsMenu(), true);
	  }
	 
	  @Test(priority=122)
	  public void verifyMRPSettingsMenuInProductionMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		 HPPMP=new HPProductionMenuPage(getDriver());
		 Assert.assertEquals(HPProductionMenuPage.checkMRPSettingMenuInProductionsMenu(), true);
	  }
	 
	 
	 
	 
	
}
