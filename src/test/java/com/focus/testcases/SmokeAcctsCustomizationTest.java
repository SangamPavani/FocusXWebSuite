package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokeAcctsCustomizationPage;
import com.focus.Pages.SmokeVouchersInitialPage;
import com.focus.base.BaseEngine;

public class SmokeAcctsCustomizationTest extends BaseEngine
{

	static SmokeAcctsCustomizationPage sacp;
	
	    @Test(priority=60000)
	  	public void checkSignToCheckAccountsMasterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkSignToCheckAccountsMasterCustomization(), true);
	  	}
	    
	    	    
	    @Test(priority=60001)
	  	public void checkClickOnHomeMenuToDisplaySubMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkClickOnHomeMenuToDisplaySubMenu(), true);
	  	}
	    
	  
	    @Test(priority=60002)
	  	public void checkClickOnMastersMenuToDisplaySubMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkClickOnMastersMenuToDisplaySubMenu(), true);
	  	}
	  
	    @Test(priority=60003)
	  	public void checkClickOnAccountsFromMastersSubMeu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkClickOnAccountsFromMastersSubMeu(), true);
	  	}
	    
	    
	    @Test(priority=60004)
	  	public void checkMainOptionsAvailabilityInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkMainOptionsAvailabilityInAccountMastersPage(), true);
	  	}
	    
	    @Test(priority=60005)
	  	public void checkToolsOptionsAvailabilityInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkToolsOptionsAvailabilityInAccountMastersPage(), true);
	  	}
	    
	    @Test(priority=60006)
	  	public void checkOtherToolsOptionsAvailabilityInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkOtherToolsOptionsAvailabilityInAccountMastersPage(), true);
	  	}
	    
	       
	    @Test(priority=60007)
	  	public void checkCustomizeMasterOptionInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkCustomizeMasterOptionInAccountsMasterPage(), true);
	  	}
	
	    @Test(priority=60008)
	  	public void checkGeneralTabOptionMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  	Assert.assertEquals(sacp.checkGeneralTabOptionMainTabInCustomizeMaster(), true);
	  	}
	
	    @Test(priority=60009)
	  	public void checkSettingsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkSettingsTabInCustomizeMaster(), true);
	  	}
	    
	    @Test(priority=60010)
	  	public void checkDetailsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkDetailsTabInCustomizeMaster(), true);
	  	}
	    
	    
	    @Test(priority=60011)
	  	public void checkPrintLayoutTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkPrintLayoutTabInCustomizeMaster(), true);
	  	}
	    
	    
	    @Test(priority=60012)
	  	public void checkUniqueContraintCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkUniqueContraintCustomizeMaster(), true);
	  	}
	    
	    
	    @Test(priority=60013)
	  	public void checkRulesInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkRulesInCustomizeMaster(), true);
	  	}
	    
	    @Test(priority=60014)
	  	public void checkExternalModulesInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkExternalModulesInCustomizeMaster(), true);
	  	}
	    
	    @Test(priority=60015)
	  	public void checkInfoPanelInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkInfoPanelInCustomizeMaster(), true);
	  	}
	    
	    @Test(priority=60016)
	  	public void checkReportsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkReportsInCustomizeMaster(), true);
	  	}
	    
	    
	    @Test(priority=60017)
	  	public void checkCreateTabAndDeleteOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkCreateTabAndDeleteOptionsInCustomizeMaster(), true);
	  	}
	    
	    
	    @Test(priority=60018)
	  	public void checkCreateTabsOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkCreateTabsOptionsInCustomizeMaster(), true);
	  	}
	    
	    
	    @Test(priority=60019)
	  	public void checkCreateCreateTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkCreateCreateTabOptionsInCustomizeMaster(), true);
	  	}
	    
	    @Test(priority=60020)
	  	public void checkOkButtonWithAllInputInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkOkButtonWithAllInputInCreateCreateTab(), true);
	  	}
	    
	    @Test(priority=60021)
	  	public void checkHeaderBodyDetailsTabInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkHeaderBodyDetailsTabInCreateCreateTab(), true);
	  	}
	    
	    @Test(priority=60022)
	  	public void checkAddOptionInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkAddOptionInCreateCreateTabDisplayInCustomizeTab(), true);
	  	}
	    
	    @Test(priority=60023)
	  	public void checkCloseOptionInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkCloseOptionInCreateTab(), true);
	  	}
	    
	    @Test(priority=60024)
	  	public void checkAddOptionToCreateExtraFieldInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkAddOptionToCreateExtraFieldInCreateTab(), true);
	  	}
	    
	    @Test(priority=60025)
	  	public void checkEditToUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkEditToUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab(), true);
	  	}
	    
	    
	    @Test(priority=60026)
	  	public void checkCreateExtraFieldToDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkCreateExtraFieldToDelete(), true);
	  	}
	    
	    @Test(priority=60027)
	  	public void checkCreateTabEditOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkCreateTabEditOption(), true);
	  	}
	    
	    @Test(priority=60028)
	  	public void checkConfirmmationMessageOnDeleteTabOptionForCreateTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkConfirmmationMessageOnDeleteTabOptionForCreateTabDisplayInTabs(), true);
	  	}
	    
	    @Test(priority=60029)
	  	public void checkCloseBtnCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkCloseBtnCustomizeMaster(), true);
	  	}
	        
	    @Test(priority=60030)
	  	public void checkClickOnCloseButtonInAccountMasterToCloseAccountsPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkClickOnCloseButtonInAccountMasterToCloseAccountsPage(), true);
	  	}
	    
	    @Test(priority=60031)
	  	public void checkCloseAndLogoutTheCompanyInAcctsCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		sacp=new SmokeAcctsCustomizationPage(getDriver());
	  		Assert.assertEquals(sacp.checkCloseAndLogoutTheCompanyInAcctsCustomization(), true);
	  	}
	      
	   
	   
}








