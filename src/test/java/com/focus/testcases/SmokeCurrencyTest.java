package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.SmokeCurrencyPage;
import com.focus.Pages.SmokeCurrencyPage;
import com.focus.base.BaseEngine;

public class SmokeCurrencyTest extends BaseEngine
{
     SmokeCurrencyPage scp;

	 //CURRENCY MATER PAGE STARTS
	
	 @Test(priority=500036) 
	 public void checkSignToCheckCurrencyMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkSignToCheckCurrencyMastersPage(), true);
	 }
	
     @Test(priority=500037) 
	 public void checkCurrencyMenuUnderMastersMenuFromHomeMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkCurrencyMenuUnderMastersMenuFromHomeMenu(), true);
	 }
	 
	 @Test(priority=500038)
	 public void checkClickOnCurrencyMasterMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkClickOnCurrencyMasterMenu(), true);
	 }
	 
	 @Test(priority=500039)
	 public void checkSaveOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkSaveOptionInCurrencyMaster(), true);
	 }
	 
	 @Test(priority=500040)
	 public void checkCurrencyUpdateInformationInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkCurrencyUpdateInformationInCurrencyMaster(), true);
	 }
	 
	 @Test(priority=500041)
	 public void checkClickOnExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkClickOnExchangeRateOptionInCurrencyMaster(), true);
	 }
	 
	 @Test(priority=500042)
	 public void checkSaveExchangeRateOfCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkSaveExchangeRateOfCurrencyMaster(), true);
	 }
	
	 @Test(priority=500043)
	 public void checkValuesInSavedExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkValuesInSavedExchangeRateOptionInCurrencyMaster(), true);
	 }
	

	 
	 @Test(priority=500044)
	 public void checkValuesInUpdatedExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkValuesInUpdatedExchangeRateOptionInCurrencyMaster(), true);
	 }
	 
	 @Test(priority=500045)
	 public void checkClickOnClearToClearValuesInExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkClickOnClearToClearValuesInExchangeRateOptionInCurrencyMaster(), true);
	 }
	 
	 @Test(priority=500046)
	 public void checkCancelOptionSaveExchangeRateInExchangeRateOptionInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkCancelOptionSaveExchangeRateInExchangeRateOptionInCurrencyMaster(), true);
	 }
	 

	 @Test(priority=500047)
	 public void checkClickOnCancelButtonInCurrencyMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkClickOnCancelButtonInCurrencyMaster(), true);
	 } 
   

	 
	  //Exchange Rate Page Starts
	  
	  @Test(priority=500053)
	  public void checkClickOnExchangeRateFromCurrecnyMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkClickOnExchangeRateFromCurrecnyMenu(), true);
	  }
	 
	  @Test(priority=500054)
	  public void checkValuesInSavedExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkValuesInSavedExchangeRate(), true);
	  }
	  
	  @Test(priority=500055)
	  public void checkClickOnClearToClearValuesInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkClickOnClearToClearValuesInExchangeRate(), true);
	  }
	  
	  @Test(priority=500056)
	  public void checkSaveExchangeRateBaseCurrencyUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkSaveExchangeRateBaseCurrencyUSD(), true);
	  }
	  
	  @Test(priority=500057)
	  public void checkUSDValuesInSavedExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkUSDValuesInSavedExchangeRate(), true);
	  }
	  
	  @Test(priority=500058)//not selecting single row
	  public void checkDeleteRowInUSDExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkDeleteRowInUSDExchangeRate(), true);
	  }
	 
	  
	  @Test(priority=500059)//issue
	  public void checkUSDUpdatedWithRowDeleteValuesInSavedExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkUSDUpdatedWithRowDeleteValuesInSavedExchangeRate(), true);
	  }
	  
	  @Test(priority=500060)
	  public void checkDeleteOptionWithYesInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkDeleteOptionWithYesInExchangeRate(), true);
	  }
	  
	  
	  
	  @Test(priority=500061)
	  public void checkDeletedCurrencyValuesIsDisplayInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkDeletedCurrencyValuesIsDisplayInExchangeRate(), true);
	  }
	  
	  
	  @Test(priority=500062)
	  public void checkSaveAEDExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkSaveAEDExchangeRate(), true);
	  }
	 
	  @Test(priority=500063)
	  public void checkSavedCurrencyValuesAfterDeleteAndInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkSavedCurrencyValuesAfterDeleteAndInput(), true);
	  }
	
	  
	  @Test(priority=500064)
	  public void checkClickOnImportFromExcelToDisplayImportScreenInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkClickOnImportFromExcelToDisplayImportScreenInExchangeRate(), true);
	  }
	  
	  @Test(priority=500065)
	  public void checkClickOnImportDataInImportFromExcelPageOfExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkClickOnImportDataInImportFromExcelPageOfExchangeRate(), true);
	  }
	  
	  @Test(priority=500066)
	  public void checkSelectColumnsMappingInImportScreenOfExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkSelectColumnsMappingInImportScreenOfExchangeRate(), true);
	  }
	 
	  @Test(priority=500067)
	  public void checkSelectSheetAndClickOnOkButtonInSelectSheetScreenOfExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkSelectSheetAndClickOnOkButtonInSelectSheetScreenOfExchangeRate(), true);
	  }
	  
	  @Test(priority=500068)
	  public void checkImportedValuesFirstInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkImportedValuesFirstInExchangeRate(), true);
	  }
	    
	  //Check Row Delete for Two Rows, Input Data and Save
	  @Test(priority=500069)
	  public void checkImportedValuesSecondInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkImportedValuesSecondInExchangeRate(), true);
	  }
	  
	  @Test(priority=500070)
	  public void checkCancelOptionInExchangeRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  scp=new SmokeCurrencyPage(getDriver());		  
		  Assert.assertEquals(scp.checkCancelOptionInExchangeRate(), true);
	  }
	  
	
	  
	 
  //Exchange Rate History Page
 
  @Test(priority=500071)
  public void checkClickOnExchangeRateHistoryMenuFromCurrency() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 scp=new SmokeCurrencyPage(getDriver());		  
	  Assert.assertEquals(scp.checkClickOnExchangeRateHistoryMenuFromCurrency(), true);
  }
	  
  @Test(priority=500072)
  public void checkExchangeRateHistoryClearButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	  scp=new SmokeCurrencyPage(getDriver());		   
	  Assert.assertEquals(scp.checkExchangeRateHistoryClearButton(), true);
  }
	  
  @Test(priority=500073)
  public void checkExchangeRateHistorySelectAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	  scp=new SmokeCurrencyPage(getDriver());		   
	  Assert.assertEquals(scp.checkExchangeRateHistorySelectAED(), true);
  }
	  
  @Test(priority=500074)
  public void checkCancelOptionInExchangeRateHistory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	  scp=new SmokeCurrencyPage(getDriver());	
	  Assert.assertEquals(scp.checkCancelOptionInExchangeRateHistory(), true);
  }
	

  @Test(priority=500075)
  public void checkLogoutInCurrencyMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	  scp=new SmokeCurrencyPage(getDriver());	
	  Assert.assertEquals(scp.checkLogoutInCurrencyMasterPage(), true);
  }
	  
	  
}

