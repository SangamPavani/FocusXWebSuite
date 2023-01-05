package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.OpeningBalancePage;
import com.focus.Pages.OpeningBalancePage;
import com.focus.base.BaseEngine;

public class OpeningBalanceTest extends BaseEngine
{
	
   static OpeningBalancePage obp;

    @Test(priority=60000)
  	public void checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		obp=new OpeningBalancePage(getDriver());
  		Assert.assertEquals(obp.checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage(), true);
  	}
      

 
    //Opening Balance Voucher
    
    @Test(priority=600700)
 	public void checkFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkFinancialsMenu(), true);
 	}
   
   @Test(priority=600701)
 	public void checkTransactionsMenuInFinanceMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkTransactionsMenuInFinanceMenu(), true);
 	}
   
   
   @Test(priority=600702)
 	public void checkFinancialsMenuTransactionsMenuJournalsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkFinancialsMenuTransactionsMenuJournalsMenu(), true);
 	}
   
   @Test(priority=600703) //link status
 	public void checkOpeningBalanceVoucherDisplayHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherDisplayHomePage(), true);
 	}
     
   @Test(priority=600704)
 	public void checkSaveInCreateViewOfHomePageOfOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkSaveInCreateViewOfHomePageOfOpeningBalance(), true);
 	}
   
   @Test(priority=600705)
 	public void checkDeleteCreateViewOfHomePageOfOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkDeleteCreateViewOfHomePageOfOpeningBalance(), true);
 	}
   
  @Test(priority=600706) // Link Status
 	public void checkEditCreateViewOfHomePageOfOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkEditCreateViewOfHomePageOfOpeningBalance(), true);
 	}    
     

   @Test(priority=600707)
 	public void checkOpeningBalanceVoucherHomePageNewOptionOnClickDisplayEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherHomePageNewOptionOnClickDisplayEntryPage(), true);
 	}
  
   @Test(priority=600708)
 	public void checkOpeningBalanceVoucherEntryPageRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherEntryPageRibbonControl(), true);
 	}
   
   
   @Test(priority=600709)
 	public void checkOpeningBalanceEntryPageOptionsUnderToggleBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceEntryPageOptionsUnderToggleBtn(), true);
 	}
     
    @Test(priority=600710)
 	public void checkCustomizationOptionInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkCustomizationOptionInOpeningBalance(), true);
 	}
   
    @Test(priority=600711)
 	public void checkOpeningBalanceVoucherEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherEntryPageHeaderFields(), true);
 	}
    
    @Test(priority=600712)
 	public void checkOpeningBalanceVoucherEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherEntryPageBodyFields(), true);
 	}
   
    @Test(priority=600713)
 	public void checkOpeningBalanceVoucherEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherEntryPageFooterFields(), true);
 	}
   
   @Test(priority=600714)
 	public void checkOpeningBalanceVoucherDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherDocumentNumber(), true);
 	}
   
    @Test(priority=600715)
 	public void checkOpeningBalanceVoucherDateIsDisable() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherDateIsDisable(), true);
 	}
   
    @Test(priority=600716)
 	public void checkOpeningBalanceVoucherSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherSaveWithoutMandatoryFields(), true);
 	}
   

    @Test(priority=600717)
 	public void checkCurrencyInOpeningBalanceVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkCurrencyInOpeningBalanceVoucher(), true);
 	}
  
    @Test(priority=600718)
 	public void checkExchangeRateWithCurrencyAEDInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkExchangeRateWithCurrencyAEDInOpeningBalance(), true);
 	}
   
    @Test(priority=600719)
 	public void checkExchangeRateAndLocalExchangeReateWithCurrencyAEDInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkExchangeRateAndLocalExchangeReateWithCurrencyAEDInOpeningBalance(), true);
 	}
   
    @Test(priority=600720)
 	public void checkExchangeRateAndLocalExchangeReateWithCurrencyUSDInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkExchangeRateAndLocalExchangeReateWithCurrencyUSDInOpeningBalance(), true);
 	}
   
    @Test(priority=600721)
 	public void checkExchangeRateAndLocalExchangeRateWithCurrencyINRInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkExchangeRateAndLocalExchangeRateWithCurrencyINRInOpeningBalance(), true);
 	}

    @Test(priority=600722)
 	public void checkSavingVoucherWithCustomerACurrencyINRDepartmentINDIALessThanAccountinDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkSavingVoucherWithCustomerACurrencyINRDepartmentINDIALessThanAccountinDate(), true);
 	}
   
   
    @Test(priority=600723)
 	public void checkPreviousButtonInOpeningBalanceSavedVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkPreviousButtonInOpeningBalanceSavedVoucher(), true);
 	}
   
    @Test(priority=600724)
 	public void checkOpeningBalanceVoucherEditPreviousToDeleteRowBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherEditPreviousToDeleteRowBin(), true);
 	}
  
    @Test(priority=600725)
 	public void checkOpeningBalanceVoucherEditPreviousUpdateRowAndSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherEditPreviousUpdateRowAndSave(), true);
 	}
   
    @Test(priority=600726)
 	public void checkCopyandPasteToClipboardInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkCopyandPasteToClipboardInOpeningBalance(), true);
 	}
   
  
    @Test(priority=600727)
 	public void checkSavingOpeningBalanceVoucherAfterCopyToClipBoard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkSavingOpeningBalanceVoucherAfterCopyToClipBoard(), true);
 	}
   
    @Test(priority=600728)
 	public void checkDeleteOptionFromEntryPageinOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkDeleteOptionFromEntryPageinOpeningBalance(), true);
 	}
   
    @Test(priority=600729)
 	public void checkOpeningBalanceNewCopyDocumentOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceNewCopyDocumentOption(), true);
 	}
   
   @Test(priority=600730)
 	public void checkOpeningBalanceNewCopyDocumentScreenOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceNewCopyDocumentScreenOptions(), true);
 	}
   
    @Test(priority=600731)//Expected Fail
 	public void checkOpeningBalanceFirstRowCheckboxInCopyDocumentInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceFirstRowCheckboxInCopyDocumentInOpeningBalance(), true);
 	}
   
    @Test(priority=600732)
 	public void checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInOpeningBalance(), true);
 	}
   
    @Test(priority=600733)
 	public void checkSavingOpeningBalanceVoucherAfterCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkSavingOpeningBalanceVoucherAfterCopyDocument(), true);
 	}
   
    @Test(priority=600734)
 	public void checksuspendedOptionInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checksuspendedOptionInOpeningBalance(), true);
 	}
   

 	
   
    //@Test(priority=600735)//Excepted Fail	
 	public void checkOpeningBalanceNewVoucherClickOnSuspendView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceNewVoucherClickOnSuspendView(), true);
 	}
 	
    @Test(priority=600736) // link Status
 	public void checkOpeningBalanceVoucherCustomizationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceVoucherCustomizationOption(), true);
 	}
   
    @Test(priority=600737)
 	public void checkOpeningBalanceCustomizeLeftPannelElementsDisplayed() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkOpeningBalanceCustomizeLeftPannelElementsDisplayed(), true);
 	}
   
    @Test(priority=600738) //
 	public void checkCustomizeLeftPannelInnerFieldsInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkCustomizeLeftPannelInnerFieldsInOpeningBalance(), true);
 	}
   
    @Test(priority=600739) //
 	public void checkHidingFieldCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkHidingFieldCustomization(), true);
 	}
   
    @Test(priority=600740) //
 	public void checkAddingExtraFieldInCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkAddingExtraFieldInCustomization(), true);
 	}
   
    @Test(priority=600741)
 	public void checkDeleteExtraFieldFromHomePageBodyHeader() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		obp=new OpeningBalancePage(getDriver());
 		Assert.assertEquals(obp.checkDeleteExtraFieldFromHomePageBodyHeader(), true);
 	}

    @Test(priority=600742)
	public void checkOpeningBalanceVoucherCloseButtonInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		obp=new OpeningBalancePage(getDriver());
		Assert.assertEquals(obp.checkOpeningBalanceVoucherCloseButtonInHomePage(), true);
	}

   
      
}
