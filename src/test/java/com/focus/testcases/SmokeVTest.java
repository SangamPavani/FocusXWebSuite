package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokeVPage;

import com.focus.base.BaseEngine;

public class SmokeVTest extends BaseEngine
{
	
   static SmokeVPage svp;

    @Test(priority=60000)
  	public void checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage(), true);
  	}
    
    // Opening Stocks New Voucher
    /*
    @Test(priority=60001)
	public void checkInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		svp=new SmokeVPage(getDriver());
		Assert.assertEquals(svp.checkInventoryMenu(), true);
	}
    
    @Test(priority=60002)
  	public void checkTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkTransactionMenuInInventoryMenu(), true);
  	}
    
    @Test(priority=60003)
  	public void checkStocksMenuInTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkStocksMenuInTransactionMenuInInventoryMenu(), true);
  	}
    
    @Test(priority=60004)
  	public void checkOpeningStocksNewVoucherDisplayHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherDisplayHomePage(), true);
  	}
   

    //Checking View in Home Page, Create Edit and Delete Option Starts
    
    @Test(priority=60005)
  	public void checkOpeningStocksNewVoucherCreateViewOptionInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherCreateViewOptionInHomePage(), true);
  	}
    
    
    @Test(priority=60006)
  	public void checkSaveInCreateViewOfHomePageOfOpeningStocksNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkSaveInCreateViewOfHomePageOfOpeningStocksNew(), true);
  	}
    
    @Test(priority=60007)
  	public void checkDeleteCreateViewOfHomePageOfOpeningStocksNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkDeleteCreateViewOfHomePageOfOpeningStocksNew(), true);
  	}
    
    @Test(priority=60008)
  	public void checkEditCreateViewOfHomePageOfOpeningStocksNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkEditCreateViewOfHomePageOfOpeningStocksNew(), true);
  	}
      
      
       
   //Checking View in Home Page, Create Edit and Delete Option Stops
    
  
    @Test(priority=60009)
  	public void checkOpeningStocksNewVoucherHomePageNewOptionOnClickDisplayEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningStocksNewVoucherHomePageNewOptionOnClickDisplayEntryPage(), true);
 	}
    
    //Checking Entry Page Ribbon Control, Header, Body and Footer Fields Starts
    
    @Test(priority=60010)
  	public void checkOpeningStocksNewVoucherEntryPageRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherEntryPageRibbonControl(), true);
  	}

    @Test(priority=60011)
  	public void checkOpeningStocksNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewEntryPageHeaderFields(), true);
  	}
    
    @Test(priority=60012)
  	public void checkOpeningStocksNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewEntryPageBodyFields(), true);
  	}
    
    @Test(priority=60013)
  	public void checkOpeningStocksNewEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewEntryPageFooterFields(), true);
  	}
  	
   //Checking Entry Page Ribbon Control, Header, Body and Footer Fields Stops
 
   
    @Test(priority=60014)
  	public void checkBatchItemRowQtyRateGrossBatchInOpeningStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkBatchItemRowQtyRateGrossBatchInOpeningStocks(), true);
  	}

    @Test(priority=60015)
  	public void checkBinItemQtyRateGrossBinInOpeningStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkBinItemQtyRateGrossBinInOpeningStocks(), true);
  	}
  
    @Test(priority=60016)
  	public void checkSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOkInOSVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOkInOSVoucher(), true);
  	} 
   
    
    @Test(priority=60017)
  	public void checkRMAPopUpScreenbyInputRMAItemInThirdRowInOSVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkRMAPopUpScreenbyInputRMAItemInThirdRowInOSVoucher(), true);
  	} 
  
    @Test(priority=60018)
  	public void checkOpeningStocksNewAddingStockItemInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewAddingStockItemInFourthRow(), true);
  	} 
  
    
    @Test(priority=60019)
  	public void checkOpeningStocksNewVoucherSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherSave(), true);
  	} 
    
    
    @Test(priority=60020)
  	public void checkOpeningStocksNewSavedVoucherOnClickPreviousInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewSavedVoucherOnClickPreviousInEntryPage(), true);
  	} 
    
    
    @Test(priority=60021)
  	public void checkOpeningStocksNewVoucherOnClickCloseBtnInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherOnClickCloseBtnInEntryPage(), true);
  	}
    
    
    @Test(priority=60022)
  	public void checkOpeningStocksNewVoucherOnClickEditButtonInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherOnClickEditButtonInHomePage(), true);
  	}
    
  
    @Test(priority=60023)
  	public void checkEditOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow(), true);
  	}
    
    @Test(priority=60024)
  	public void checkEditOpeningStocksNewVoucherInputBinFifoBinPopupOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherInputBinFifoBinPopupOptions(), true);
  	}
    
    @Test(priority=60025)
  	public void checkEditRMAItemToDisplayRMAScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkEditRMAItemToDisplayRMAScreen(), true);
  	}
    
    
    @Test(priority=60026)
  	public void checkEditingTheItemWithStockTypeItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkEditingTheItemWithStockTypeItem(), true);
  	}
    
    @Test(priority=60027)
  	public void checkSaveButtonWithUpdatingBatchBinRMAAndStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkSaveButtonWithUpdatingBatchBinRMAAndStockItem(), true);
  	}
    
    @Test(priority=60028)
  	public void checkOpeningStocksSaveByUpdateValues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksSaveByUpdateValues(), true);
  	}
    
    
    
    @Test(priority=60029)
   	public void checkOpeningStocksEntryPageOptionsUnderToggleBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkOpeningStocksEntryPageOptionsUnderToggleBtn(), true);
   	}
     
     
    @Test(priority=60030)
   	public void checVoucherInfoByPasteFromOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checVoucherInfoByPasteFromOption(), true);
   	}
    
    @Test(priority=60031)
   	public void checkUpdateValueOfBatchBinRmaStockInCopyAndPasteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkUpdateValueOfBatchBinRmaStockInCopyAndPasteOption(), true);
   	}
    
    
    @Test(priority=60032)
   	public void checkDeleteOptionFromEntryPageinOpeningStocksNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkDeleteOptionFromEntryPageinOpeningStocksNewVoucher(), true);
   	}
   
    
    @Test(priority=60033)
   	public void checkDeleteOptionFromEntryPageinOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkDeleteOptionFromEntryPageinOpeningBalance(), true);
   	}
   
    @Test(priority=60034)
   	public void checkSuspendVoucherInfoByPasteFromOptionI() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkSuspendVoucherInfoByPasteFromOptionI(), true);
   	}
   
    
    @Test(priority=60035)
   	public void checkSuspendOptionInOpeningStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkSuspendOptionInOpeningStocks(), true);
   	}
   
    
    @Test(priority=60036)
   	public void checkOpeningStocksNewVoucherClickOnSuspendView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkOpeningStocksNewVoucherClickOnSuspendView(), true);
   	}
   
    
    @Test(priority=60037)
   	public void checkOpeningStocksNewVoucherCloseButtonInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkOpeningStocksNewVoucherCloseButtonInHomePage(), true);
   	}*/
    
    
    
    
    
    
    //Opening Balance Voucher
    
    @Test(priority=600700)
 	public void checkFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkFinancialsMenu(), true);
 	}

    
    @Test(priority=600701)
 	public void checkTransactionsMenuInFinanceMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkTransactionsMenuInFinanceMenu(), true);
 	}
    
 
    @Test(priority=600702)
  	public void checkFinancialsMenuTransactionsMenuJournalsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkFinancialsMenuTransactionsMenuJournalsMenu(), true);
  	}
    
    @Test(priority=600703)
  	public void checkOpeningBalanceVoucherDisplayHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningBalanceVoucherDisplayHomePage(), true);
  	}
      
    @Test(priority=600704)
  	public void checkSaveInCreateViewOfHomePageOfOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkSaveInCreateViewOfHomePageOfOpeningBalance(), true);
  	}
    
    @Test(priority=600705)
  	public void checkDeleteCreateViewOfHomePageOfOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkDeleteCreateViewOfHomePageOfOpeningBalance(), true);
  	}
    
   @Test(priority=600706)
  	public void checkEditCreateViewOfHomePageOfOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkEditCreateViewOfHomePageOfOpeningBalance(), true);
  	}    
      

    @Test(priority=600707)
  	public void checkOpeningBalanceVoucherHomePageNewOptionOnClickDisplayEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningBalanceVoucherHomePageNewOptionOnClickDisplayEntryPage(), true);
  	}
   
    @Test(priority=600708)
  	public void checkOpeningBalanceVoucherEntryPageRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningBalanceVoucherEntryPageRibbonControl(), true);
  	}
    
    
    @Test(priority=600709)
  	public void checkOpeningBalanceEntryPageOptionsUnderToggleBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningBalanceEntryPageOptionsUnderToggleBtn(), true);
  	}
    
    
    @Test(priority=600710)
  	public void checkOpeningBalanceVoucherEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningBalanceVoucherEntryPageHeaderFields(), true);
  	}
    
    
    @Test(priority=600711)
  	public void checkOpeningBalanceVoucherEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningBalanceVoucherEntryPageBodyFields(), true);
  	}
    
    @Test(priority=600712)
  	public void checkOpeningBalanceVoucherEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningBalanceVoucherEntryPageFooterFields(), true);
  	}
    
    
    @Test(priority=600713)
  	public void checkOpeningBalanceVoucherDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningBalanceVoucherDocumentNumber(), true);
  	}
    
    @Test(priority=600714)
  	public void checkCurrencyInOpeningBalanceVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkCurrencyInOpeningBalanceVoucher(), true);
  	}
   
    @Test(priority=600715)
  	public void checkExchangeRateWithCurrencyAEDInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkExchangeRateWithCurrencyAEDInOpeningBalance(), true);
  	
  	}    
    
    @Test(priority=600716)
  	public void checkExchangeRateAndLocalExchangeReateWithCurrencyAEDInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkExchangeRateAndLocalExchangeReateWithCurrencyAEDInOpeningBalance(), true);
  	
  	}    
    
    @Test(priority=600717)
  	public void checkExchangeRateAndLocalExchangeReateWithCurrencyUSDInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkExchangeRateAndLocalExchangeReateWithCurrencyUSDInOpeningBalance(), true);
  	
  	}    
    


    
    @Test(priority=600718)
   	public void checkExchangeRateAndLocalExchangeRateWithCurrencyINRInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkExchangeRateAndLocalExchangeRateWithCurrencyINRInOpeningBalance(), true);
   	
   	}   
    
    @Test(priority=600719)
   	public void checkSavingVoucherWithCustomerACurrencyINRDepartmentINDIALessThanAccountinDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		svp=new SmokeVPage(getDriver());
   		Assert.assertEquals(svp.checkSavingVoucherWithCustomerACurrencyINRDepartmentINDIALessThanAccountinDate(), true);
   	
   	}   
    
    
   
    @Test(priority=600720)
 	public void checkPreviousButtonInOpeningBalanceSavedVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkPreviousButtonInOpeningBalanceSavedVoucher(), true);
 	}
   
   @Test(priority=600721)
 	public void checkOpeningBalanceVoucherEditPreviousToDeleteRowBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherEditPreviousToDeleteRowBin(), true);
 	}
  
   @Test(priority=600722)
 	public void checkOpeningBalanceVoucherEditPreviousUpdateRowAndSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherEditPreviousUpdateRowAndSave(), true);
 	}
   
   @Test(priority=600723)
 	public void checkCopyandPasteToClipboardInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkCopyandPasteToClipboardInOpeningBalance(), true);
 	}
   
  
   @Test(priority=600724)
 	public void checkSavingOpeningBalanceVoucherAfterCopyToClipBoard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkSavingOpeningBalanceVoucherAfterCopyToClipBoard(), true);
 	}
   
   @Test(priority=600725)
 	public void checkDeleteOptionFromEntryPageinOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkDeleteOptionFromEntryPageinOpeningBalance(), true);
 	}
   
   @Test(priority=600726)
 	public void checkOpeningBalanceNewCopyDocumentOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceNewCopyDocumentOption(), true);
 	}
   
   @Test(priority=600727)
 	public void checkOpeningBalanceNewCopyDocumentScreenOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceNewCopyDocumentScreenOptions(), true);
 	}
   
   @Test(priority=600728)//Expected Fail
 	public void checkOpeningBalanceFirstRowCheckboxInCopyDocumentInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceFirstRowCheckboxInCopyDocumentInOpeningBalance(), true);
 	}
   
   @Test(priority=600729)
 	public void checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInOpeningBalance(), true);
 	}
   
   @Test(priority=600730)
 	public void checkSavingOpeningBalanceVoucherAfterCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkSavingOpeningBalanceVoucherAfterCopyDocument(), true);
 	}
   
   @Test(priority=600731)
 	public void checksuspendedOptionInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checksuspendedOptionInOpeningBalance(), true);
 	}
   

 	@Test(priority=600732)//Excepted Fail	
 	public void checkOpeningBalanceNewVoucherClickOnSuspendView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceNewVoucherClickOnSuspendView(), true);
 	}

    
 	@Test(priority=600733)
 	public void checkOpeningBalanceVoucherCustomizationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherCustomizationOption(), true);
 	}
    
 	@Test(priority=600734)
 	public void checkOpeningBalanceCustomizeLeftPannelElementsDisplayed() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceCustomizeLeftPannelElementsDisplayed(), true);
 	}
 
 	
    @Test(priority=600738)
  	public void checkCustomizeLeftPannelInnerFieldsInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkCustomizeLeftPannelInnerFieldsInOpeningBalance(), true);
  	}
    
    @Test(priority=600739)
  	public void checkHidingFieldCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkHidingFieldCustomization(), true);
  	}
    
    @Test(priority=600740)
  	public void checkAddingExtraFieldInCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkAddingExtraFieldInCustomization(), true);
  	}
    
    @Test(priority=600741)
  	public void checkDeleteExtraFieldFromHomePageBodyHeader() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkDeleteExtraFieldFromHomePageBodyHeader(), true);
  	}

    @Test(priority=600742)
  	public void checkOpeningBalanceVoucherCloseButtonInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningBalanceVoucherCloseButtonInHomePage(), true);
  	}
    
    
    
    
}
