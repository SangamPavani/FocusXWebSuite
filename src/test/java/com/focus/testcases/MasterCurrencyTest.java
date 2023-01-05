package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.MasterCurrencyPage;
import com.focus.base.BaseEngine;


public class MasterCurrencyTest extends BaseEngine
{
	MasterCurrencyPage mcp;

	  @Test(priority=417)
	  public void checkLoginToCheckCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(mcp.checkLoginToCheckCurrency(), true);
	  }
	
	
	  @Test(priority=418)
	  public void verifyOpenCurrencyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkOpenCurrencyMenu(), true);
	  }
	  
	  
	  @Test(priority=419)
	  public void verifyFieldsInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkFieldsInCurrencyMaster(), true);
	  }
	  
	  @Test(priority=420)
	  public void verifySaveWithBlankInputInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkSaveWithBlankInputInCurrencyMaster(), true);
	   
	  }
	  
	  @Test(priority=421)
	  public void verifySaveISOCurrencyCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkSaveISOCurrencyCode(), true);
	   
	  }
	  
	  	 
	  @Test(priority=422)
	  public void verifyExchangeRateTitleOnClickOnExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkExchangeRateTitleOnClickOnExchangeRateOptionInCurrencyMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=423)
	  public void verifyExchangeRateFieldsOnClickOnExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkExchangeRateFieldsOnClickOnExchangeRateOptionInCurrencyMaster(), true);
	   
	  }
	  
	  @Test(priority=424)
	  public void verifySaveWithBlankInputInExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkSaveWithBlankInputInExchangeRateOptionInCurrencyMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=425)
	  public void checkSaveInExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkSaveInExchangeRateOptionInCurrencyMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=426)
	  public void verifyUpdateExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkUpdateExchangeRateOfCurrencyMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=427)
	  public void verifyClearOptionInExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkClearOptionInExchangeRateOfCurrencyMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=428)
	  public void verifyCancelButtonInExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkCancelButtonInExchangeRateOfCurrencyMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=429)
	  public void verifyClearOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkClearOptionInCurrencyMaster(), true);
	   
	  }
	  
	  
	  @Test(priority=430)
	  public void verifyCancelOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkCancelOptionInCurrencyMaster(), true);
	   
	  }
	  
	  
	  
	  //Exchange Rate Definition
	  
	  @Test(priority=431)
	  public void verifyOpenExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkOpenExchangeRate(), true);
	   
	  }
	  
	  @Test(priority=432)
	  public void verifyExchangeRateMenuFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkExchangeRateMenuFields(), true);
	   
	  }
	  
	  @Test(priority=433)
	  public void verifySaveButtonWithoutInputMandatoryFieldsInCurrencyExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkSaveButtonWithoutInputMandatoryFieldsInCurrencyExchangeRate(), true);
	   
	  }
	  
	  @Test(priority=434)
	  public void verifyCurrencyExchnageRateSavedInformationDisplayExchnageRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkCurrencyExchnageRateSavedInformationDisplayExchnageRate(), true);
	   
	  }
	  
	  @Test(priority=435)
	  public void verifySaveExchangeRateUSDCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkSaveExchangeRateUSDCurrency(), true);
	   
	  }
	  
	  
	  @Test(priority=436)
	  public void verifyUpdateExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkUpdateExchangeRate(), true);
	   
	  }
	  
	  
	  @Test(priority=437)
	  public void verifySaveAEDExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkSaveAEDExchangeRate(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=438)
	  public void verifyClearOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkClearOptionInExchangeRate(), true);
	   
	  }
	  

	  @Test(priority=439)
	  public void verifyRowDeleteFieldInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkRowDeleteFieldInExchangeRate(), true);
	   
	  }
	  
	  
	  @Test(priority=440)
	  public void verifyRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkRowDeleteOptionInExchangeRate(), true);
	   
	  }
	  
	 
	  @Test(priority=441)
	  public void verifyNoRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkNoRowDeleteOptionInExchangeRate(), true);
	   
	  }
	  

	  @Test(priority=442)
	  public void verifyYesRowDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkYesRowDeleteOptionInExchangeRate(), true);
	   
	  }
	  
	  

	
	  @Test(priority=443)
	  public void verifyDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkDeleteOptionInExchangeRate(), true);
	   
	  }
	  
	  
	  @Test(priority=444)
	  public void verifyNoOptionForDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkNoOptionForDeleteOptionInExchangeRate(), true);
	   
	  }
	  
	  
	  
	  @Test(priority=445)
	  public void verifyYesOptionForDeleteOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkYesOptionForDeleteOptionInExchangeRate(), true);
	   
	  }
	  
	  
	  @Test(priority=446)
	  public void verifyCancelOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkCancelOptionInExchangeRate(), true);
	   
	  }
	  
	  
	  
	  
	  //Exchange Rate History
	  
	  @Test(priority=447)
	  public void verifyOpenExchangeRateHistory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkOpenExchangeRateHistory(), true);
	   
	  }
	  
	  
	  @Test(priority=448)
	  public void verifyExchangeRateHistoryMenuFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkExchangeRateHistoryMenuFields(), true);
	   
	  }
	  
	  
	  @Test(priority=449)
	  public void verifyExchangeRateHistoryLoadButtonWithoutBaseCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkExchangeRateHistoryLoadButtonWithoutBaseCurrency(), true);
	   
	  }
	  
	  
	  @Test(priority=450)
	  public void verifyExchangeRateHistorySelectINR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkExchangeRateHistorySelectINR(), true);
	   
	  }
	
	  
	  @Test(priority=451)
	  public void verifyExchangeRateHistoryClearButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkExchangeRateHistoryClearButton(), true);
	   
	  }
	
	  
	  
	  @Test(priority=452)
	  public void verifyExchangeRateHistorySelectAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkExchangeRateHistorySelectAED(), true);
	   
	  }
	  
	  @Test(priority=453)
	  public void verifyExchangeRateHistorySelectUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkExchangeRateHistorySelectUSD(), true);
	   
	  }
	  
	
	  
	  @Test(priority=454)
	  public void verifyCancelOptionInExchangeRateHistory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  mcp=new MasterCurrencyPage(getDriver());
		  Assert.assertEquals(MasterCurrencyPage.checkCancelOptionInExchangeRateHistory(), true);
	   
	  }
	  
	  
}

