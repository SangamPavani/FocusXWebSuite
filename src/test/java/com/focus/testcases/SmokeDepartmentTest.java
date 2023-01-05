package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.SmokeDepartmentPage;
import com.focus.Pages.SmokeDepartmentPage;
import com.focus.base.BaseEngine;

public class SmokeDepartmentTest extends BaseEngine
{

	SmokeDepartmentPage sdp;
	
	  @Test(priority=500241)
	  public void checkSignToCheckDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  sdp=new SmokeDepartmentPage(getDriver());
		  Assert.assertEquals(SmokeDepartmentPage.checkSignToCheckDepartmentMastersPage(), true);
	   
	  }

	// DEPARTMENT MASTER PAGE

	   @Test(priority=500242)
	   public void checkDepartmentsMasterPageIsDisplayByClickOnDepartmentsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkDepartmentsMasterPageIsDisplayByClickOnDepartmentsMenu(), true);
	   }
	   
	   @Test(priority=500243)
	   public void checkMainOptionsAvailabilityInDepartmentsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkMainOptionsAvailabilityInDepartmentsMasterPage(), true);
	   }
	   
	   @Test(priority=500244)
	   public void checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkToolsOptionsAvailabilityOnClickMasterRibbonToExpandOptionsInDepartmentMastersPage(), true);
	   }
	  
	   @Test(priority=500245)
	   public void checkOtherToolsOptionsAvailabilityInDepartmentMastersPageOnClickRibbonControlNextButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkOtherToolsOptionsAvailabilityInDepartmentMastersPageOnClickRibbonControlNextButton(), true);
	   }
	  
	  
	   @Test(priority=500246)
	   public void checkTreeViewOptionsAvailableInDepartmentsMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkTreeViewOptionsAvailableInDepartmentsMastersPage(), true);
	   }
	 
	   @Test(priority=500247)
	   public void checkDisplayOfGroupAvailableTreeStructureLeftPageDepartmentsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkDisplayOfGroupAvailableTreeStructureLeftPageDepartmentsMasterPage(), true);
	   }
	  
	   @Test(priority=500248)
	   public void checkCreateTreeToggleOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkCreateTreeToggleOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	   @Test(priority=500249)
	   public void checkCreateViewToggleOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkCreateViewToggleOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	  
	   @Test(priority=500250)
	   public void checkHideUnitGroupOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkHideUnitGroupOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	   
	   @Test(priority=500251)
	   public void checkUnHideUnitsGroupOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkUnHideUnitsGroupOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	   @Test(priority=500252)
	   public void checkHeaderFieldsOptionsAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkHeaderFieldsOptionsAvailableInDepartmentMastersPage(), true);
	   }
	   
	   @Test(priority=500253)
	   public void checkSearchOptionAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkSearchOptionAvailableInDepartmentMastersPage(), true);
	   }

	   @Test(priority=500254)
	   public void checkDepartmentMastersDisplayTableColumnNamesAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkDepartmentMastersDisplayTableColumnNamesAvailableInDepartmentMastersPage(), true);
	   }
	 
	   @Test(priority=500255)
	   public void checkDepartmentMastersDisplayTableColumnValuesAvailableInDepartmentMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkDepartmentMastersDisplayTableColumnValuesAvailableInDepartmentMastersPage(), true);
	   }

	   @Test(priority=500256)
	   public void checkClickOnNewButtonInDepartmentMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkClickOnNewButtonInDepartmentMasterPage(), true);
	   }

	   @Test(priority=500257)
	   public void checkInputNameCodeLocalCurrencyFieldsInDepartmentCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkInputNameCodeLocalCurrencyFieldsInDepartmentCreationPage(), true);
	   }
	   
	   @Test(priority=500258)
	   public void checkClickOnSaveButtonInDepartmentCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkClickOnSaveButtonInDepartmentCreationPage(), true);
	   }
	   
	   @Test(priority=500259)
	   public void checkDepartmentCreationAndClickOnCloseButtonToDisplayCreatedDepartmentInDisplayGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkDepartmentCreationAndClickOnCloseButtonToDisplayCreatedDepartmentInDisplayGrid(), true);
	   }
	   
	   @Test(priority=500260)
	   public void checkClickOnEditForNewlyCreatedDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkClickOnEditForNewlyCreatedDepartment(), true);
	   }
	   
	  
	   @Test(priority=500261)
	   public void checkNameCodeAndCurrencyOptionForNewlyCreatedDepartmentThroughEdit() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkNameCodeAndCurrencyOptionForNewlyCreatedDepartmentThroughEdit(), true);
	   }
	   
	   @Test(priority=500262)
	   public void checkUpatingNameCodeCurrencyForNewlyCreateDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkUpatingNameCodeCurrencyForNewlyCreateDepartment(), true);
	   }
	   
	   @Test(priority=500263)
	   public void checkClickOnSaveByUpdatingMasterAndDisplayDepartmentDisplayInGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkClickOnSaveByUpdatingMasterAndDisplayDepartmentDisplayInGrid(), true);
	   }
	   
	   @Test(priority=500264)
	   public void checkDeleteDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkDeleteDepartmentMaster(), true);
	   }
	   
	   
	   @Test(priority=500265)
	   public void checkDeleteMasterDisplayInGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkDeleteMasterDisplayInGroup(), true);
	   }
	   
	   
	   @Test(priority=500266)
	   public void checkSaveDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkSaveDepartment(), true);
	   }

	   
	   
	   @Test(priority=500267)
	   public void checkCloseDepartmentMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkCloseDepartmentMaster(), true);
	   }
	 
	 
	   @Test(priority=500268)
	   public void checkLogoutInDepartmentMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  sdp=new SmokeDepartmentPage(getDriver());	
		  Assert.assertEquals(sdp.checkLogoutInDepartmentMasterPage(), true);
	   }
	 

	  
	 
	  
}
