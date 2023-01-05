package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.SmokeBinsPage;
import com.focus.Pages.SmokeBinsPage;
import com.focus.base.BaseEngine;

public class SmokeBinsTest extends BaseEngine
{
	
	SmokeBinsPage sbp;
	
	  //BIN MASTER PAGE
	 
	   @Test(priority=500185)
	   public void checkSignToCheckBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkSignToCheckBinsMastersPage(), true);
	   }
	
	   @Test(priority=500186)
	   public void checkBinsMasterPageIsDisplayByClickOnBinsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkBinsMasterPageIsDisplayByClickOnBinsMenu(), true);
	   }
	   
	   @Test(priority=500187)
	   public void checkMainOptionsAvailabilityInBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkMainOptionsAvailabilityInBinsMasterPage(), true);
	   }
	   
	   @Test(priority=500188)
	   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInBinsMastersPage(), true);
	   }
	    
	   @Test(priority=500189)
	   public void checkOtherToolsOptionsAvailabilityInBinsMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   { 
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkOtherToolsOptionsAvailabilityInBinsMastersPageOnClickRibbonControlNextButton(), true);
	   }
	   
	   @Test(priority=500190)
	   public void checkTreeViewOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkTreeViewOptionsAvailableInBinsMastersPage(), true);
	   }
	  
	   @Test(priority=500191)
	   public void checkDisplayOfGroupAvailableTreeStructureLeftPageBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkDisplayOfGroupAvailableTreeStructureLeftPageBinsMasterPage(), true);
	   }
	  
	  
	   @Test(priority=500192)
	   public void checkCreateTreeToggleOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkCreateTreeToggleOptionsAvailableInBinsMastersPage(), true);
	   }
	   
	   @Test(priority=500193)
	   public void checkCreateViewToggleOptionsAvailableBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkCreateViewToggleOptionsAvailableBinsMastersPage(), true);
	   }
	   
	   
	   @Test(priority=500194)
	   public void checkHideUnitGroupOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkHideUnitGroupOptionsAvailableInBinsMastersPage(), true);
	   }
	   
	   
	   @Test(priority=500195)
	   public void checkUnHideUnitsGroupOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkUnHideUnitsGroupOptionsAvailableInBinsMastersPage(), true);
	   }
	   
	   @Test(priority=500196)
	   public void checkHeaderFieldsOptionsAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkHeaderFieldsOptionsAvailableInBinsMastersPage(), true);
	   }
	   
	   @Test(priority=500197)
	   public void checkSearchOptionAvailableInBinsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkSearchOptionAvailableInBinsMastersPage(), true);
	   }

	   @Test(priority=500198)
	   public void checkBinsMastersDisplayTableColumnNamesAvailableInBinstMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkBinsMastersDisplayTableColumnNamesAvailableInBinstMastersPage(), true);
	   }
	  
	   @Test(priority=500200)
	   public void checkClickOnNewButtonInBinGroups() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkClickOnNewButtonInBinGroups(), true);
	   }
	  
	   @Test(priority=500201)
	   public void checkSaveBinCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkSaveBinCreation(), true);
	   }
	  
	   @Test(priority=500202)
	   public void checkCloseButtonBinsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkCloseButtonBinsCreationPage(), true);
	   }
	  
	   
	   @Test(priority=500203)
	   public void checkEditOptionForNewlyCreateBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkEditOptionForNewlyCreateBins(), true);
	   }
	   
	   
	   @Test(priority=500204)
	   public void checkSaveByUpdatingNameCodeTypeInBinsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkSaveByUpdatingNameCodeTypeInBinsCreationPage(), true);
	   }
	   
	   @Test(priority=500205)
	   public void checkEditOptionForNewlyUpdateBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkEditOptionForNewlyUpdateBins(), true);
	   }
	   
	   @Test(priority=500206)
	   public void checkCloseButtonBinsUpdateCheck() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkCloseButtonBinsUpdateCheck(), true);
	   }
	   
	   @Test(priority=500207)
	   public void checkUnCheckingSelectBinsAndCheckUnSelectBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkUnCheckingSelectBinsAndCheckUnSelectBins(), true);
	   }
	   
	   @Test(priority=500208)
	   public void checkDeleteBinsOptionForBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkDeleteBinsOptionForBinsMasterPage(), true);
	   }
	   
	   
	   @Test(priority=500209)
	   public void checkSaveBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkSaveBin(), true);
	   }
	   
	   
	   @Test(priority=500210)
	   public void checkCloseBinsMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkCloseBinsMaster(), true);
	   }	  
	  
	   @Test(priority=500211)
	   public void checkLogoutInBinsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sbp=new SmokeBinsPage(getDriver());	
		  Assert.assertEquals(sbp.checkLogoutInBinsMasterPage(), true);
	   }	
	   
}
