package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.SmokeVouchersInitialPage;
import com.focus.base.BaseEngine;

public class SmokeVouchersInitialTest extends BaseEngine
{
	
   static SmokeVouchersInitialPage svp;

    @Test(priority=60000)
  	public void checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage(), true);
  	}
      
   /* @Test(priority=60001)
	public void checkInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkInventoryMenu(), true);
	}
    
    @Test(priority=60002)
  	public void checkTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkTransactionMenuInInventoryMenu(), true);
  	}
  	
    
    @Test(priority=60003)
  	public void checkStocksMenuInTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkStocksMenuInTransactionMenuInInventoryMenu(), true);
  	}
    
    @Test(priority=60004)
  	public void checkOpeningStocksNewVoucherDisplayHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherDisplayHomePage(), true);
  	}
   

    //Checking View in Home Page, Create Edit and Delete Option Starts
    
    @Test(priority=60005)
  	public void checkOpeningStocksNewVoucherCreateViewOptionInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherCreateViewOptionInHomePage(), true);
  	}
    
    
    @Test(priority=60006)
  	public void checkSaveInCreateViewOfHomePageOfOpeningStocksNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkSaveInCreateViewOfHomePageOfOpeningStocksNew(), true);
  	}
    
    @Test(priority=60007)
  	public void checkDeleteCreateViewOfHomePageOfOpeningStocksNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkDeleteCreateViewOfHomePageOfOpeningStocksNew(), true);
  	}
    
    @Test(priority=60008)
  	public void checkEditCreateViewOfHomePageOfOpeningStocksNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditCreateViewOfHomePageOfOpeningStocksNew(), true);
  	}
       
    
   //Checking View in Home Page, Create Edit and Delete Option Stops
    
  
   
    
    
    @Test(priority=60009)
  	public void checkOpeningStocksNewVoucherHomePageNewOptionOnClickDisplayEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningStocksNewVoucherHomePageNewOptionOnClickDisplayEntryPage(), true);
 	}
    
    //Checking Entry Page Ribbon Control, Header, Body and Footer Fields Starts
    
    @Test(priority=60010)
  	public void checkOpeningStocksNewVoucherEntryPageRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherEntryPageRibbonControl(), true);
  	}

    @Test(priority=60011)
  	public void checkOpeningStocksNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewEntryPageHeaderFields(), true);
  	}
    
   @Test(priority=60012)
  	public void checkOpeningStocksNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewEntryPageBodyFields(), true);
  	}
    
    @Test(priority=60013)
  	public void checkOpeningStocksNewEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewEntryPageFooterFields(), true);
  	}
  	
   //Checking Entry Page Ribbon Control, Header, Body and Footer Fields Stops
 
   
    @Test(priority=60014)
  	public void checkOpeningStocksNewVoucherDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherDocumentNumber(), true);
  	}
   
    
   //Checking Adding Warehouse Customization and Deleting the fields Starts
    
    @Test(priority=60015)
  	public void checkOpeningStocksNewVoucherDateIsDisable() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherDateIsDisable(), true);
  	}
    
    @Test(priority=60016)
  	public void checkOpeningStocksNewSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewSaveWithoutMandatoryFields(), true);
  	}
    
    @Test(priority=60017)
  	public void checkOpeningStocksNewWareHouseOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewWareHouseOptions(), true);
  	}
    
    @Test(priority=60018)
  	public void checkOpeningStocksNewWarehouseCustomize() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewWarehouseCustomize(), true);
  	}
    
    @Test(priority=60019)
  	public void checkOpeningStocksNewWarehouseCustomizeStandardFieldOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewWarehouseCustomizeStandardFieldOptions(), true);
  	}
    
    @Test(priority=60020)
  	public void checkOpeningStocksNewWarehouseCustomizeOnSelectingCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewWarehouseCustomizeOnSelectingCode(), true);
  	}
    
    
    @Test(priority=60021)
  	public void checkOpeningStocksNewWarehouseCustomizeDeleteColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewWarehouseCustomizeDeleteColumn(), true);
  	}
    
    @Test(priority=60022)
  	public void checkOpeningStocksNewWarehouseCustomizationCancel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewWarehouseCustomizationCancel(), true);
  	}
    
    
    
  
    @Test(priority=60023)
  	public void checkOpeningStocksNewSaveWithoutInputOfBodyRowsColumns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewSaveWithoutInputOfBodyRowsColumns(), true);
  	}
    
    @Test(priority=60024)
  	public void checkOpeningStocksNewItemCustomize() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewItemCustomize(), true);
  	}
    
    @Test(priority=60025)
  	public void checkOpeningStocksNewItemCustomizationStandardFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewItemCustomizationStandardFields(), true);
  	}
    
    @Test(priority=60026)
  	public void checkOpeningStocksNewItemCustomizationAddBalanceColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewItemCustomizationAddBalanceColumn(), true);
  	}
    
    @Test(priority=60027)
  	public void checkOpeningStocksNewVouchersEntryPageNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVouchersEntryPageNew(), true);
  	}
    
   
    
    @Test(priority=60028)
  	public void checkOpeningStocksNewBodyRowsItemColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewBodyRowsItemColumn(), true);
  	}
    
    @Test(priority=60029)
  	public void checkOpeningStocksNewVoucherBodyRowUnitsColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherBodyRowUnitsColumn(), true);
  	}
    
    @Test(priority=60030)
  	public void checkOpeningStocksNewSaveVoucherWithoutBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewSaveVoucherWithoutBatch(), true);
  	}
    
    @Test(priority=60031)
  	public void checkOpeningStocksNewSaveDataWithoutExpiryDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewSaveDataWithoutExpiryDate(), true);
  	}
    
    @Test(priority=60032)
  	public void checkOpeningStocksNewVoucherBRItemInputBodyDataInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherBRItemInputBodyDataInFirstRow(), true);
  	}
    
    
    @Test(priority=60033)
  	public void checkOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow(), true);
  	}
    
    @Test(priority=60034)
  	public void checkOpeningStocksNewVoucherInputBinFifoBinPopupOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherInputBinFifoBinPopupOptions(), true);
  	}
    
  
    
 
    @Test(priority=60035)
  	public void checkSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk(), true);
  	}
    
    @Test(priority=60036)
  	public void checkOpeningStocksAddingDataInThirdRowForBinCheking() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksAddingDataInThirdRowForBinCheking(), true);
  	}
    
    @Test(priority=60037)
  	public void checkOpeningStocksAddingBinInThridRowAutoAllocateInBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksAddingBinInThridRowAutoAllocateInBin(), true);
  	}
    
    @Test(priority=60038)
  	public void checkOpeningStocksNewAddingDataInFourthRowForBinCheking() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewAddingDataInFourthRowForBinCheking(), true);
  	}
    
    @Test(priority=60039)
  	public void checkOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen(), true);
  	}
    
    @Test(priority=60040)
  	public void checkOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow(), true);
  	}
        
    @Test(priority=60041)
  	public void checkOpeningStocksNewDeleteRowBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewDeleteRowBin(), true);
  	}
    
    @Test(priority=60042)
  	public void checkOpeningStocksNewBinQuantityAfterAlocatingAndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewBinQuantityAfterAlocatingAndDeleting(), true);
  	}
   
    @Test(priority=60043)
  	public void checkOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty(), true);
  	}
    
    @Test(priority=60044)
  	public void checkOpeningStocksNewVoucherWithInputingThroughAllocateQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherWithInputingThroughAllocateQty(), true);
  	}
   
    
    @Test(priority=60045)
  	public void checkOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow(), true);
  	}
    
    @Test(priority=60046)
  	public void checkOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow(), true);
  	}
    
    @Test(priority=60047)
  	public void checkOpeningStocksNewVoucherConsumeFullCapacityInFifthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherConsumeFullCapacityInFifthRow(), true);
  	}
    
    @Test(priority=60048)
  	public void checkOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows(), true);
  	}
    
    
    @Test(priority=60049)
  	public void checkOpeningStocksNewVoucherWithRMAUnitsAndMandatoryMessageInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherWithRMAUnitsAndMandatoryMessageInThirdRow(), true);
  	}
    
    @Test(priority=60050)
  	public void checkOpeningStocksNewVoucherRmaWithZeroQuantity() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherRmaWithZeroQuantity(), true);
  	}
    
    @Test(priority=60051)
  	public void checkRMAPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkRMAPopupScreen(), true);
  	}
    
    @Test(priority=60052)
  	public void checkAddButtonInRmaPageWithSelectingSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkAddButtonInRmaPageWithSelectingSerialNumbers(), true);
  	}
       
    @Test(priority=60053)
  	public void checkOKButtonInRmaPageWithoutSelectingSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOKButtonInRmaPageWithoutSelectingSerialNumbers(), true);
  	}
    
    @Test(priority=60054)
  	public void checkCancelButtonInRmaPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkCancelButtonInRmaPage(), true);
  	}
    
    @Test(priority=60055)
  	public void checkRmaPageWithSelectingPartialSerialNumberLessThanInputedQtyInVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkRmaPageWithSelectingPartialSerialNumberLessThanInputedQtyInVoucher(), true);
  	}
    
    @Test(priority=60056)
  	public void checkOkButtonInRmaPageWithSelectionOfPartialSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRmaPageWithSelectionOfPartialSerialNumbers(), true);
  	}
    
    @Test(priority=60057)
  	public void checkClearButtonInRmaRowSerialNumberRmaPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkClearButtonInRmaRowSerialNumberRmaPage(), true);
  	}
    
    @Test(priority=60058)
  	public void checkClearButtonInRmaPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkClearButtonInRmaPage(), true);
  	}

    @Test(priority=60059)
  	public void checkInputTheDuplicateSerialNumbersIsAllowingInRmaPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkInputTheDuplicateSerialNumbersIsAllowingInRmaPage(), true);
  	}

    @Test(priority=60060)
  	public void checkInputSerialNumbersIsAllowingGreaterThanInputVoucherQuantity() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkInputSerialNumbersIsAllowingGreaterThanInputVoucherQuantity(), true);
  	}
    
    @Test(priority=600561)
  	public void checkInputingDifferentSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkInputingDifferentSerialNumbers(), true);
  	}
    
    @Test(priority=600562)
  	public void checkNewItemWithSameSerialNos() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkNewItemWithSameSerialNos(), true);
  	}
    
    @Test(priority=600563)
  	public void checkSavingVoucherByChangingVoucherQuantitySerialNumbersSame() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkSavingVoucherByChangingVoucherQuantitySerialNumbersSame(), true);
  	}
    
    @Test(priority=600564)
  	public void checkInputingSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkInputingSerialNumbers(), true);
  	}
    
    @Test(priority=600565)
  	public void checkOpeningStocksNewAddingStockItemInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewAddingStockItemInFourthRow(), true);
  	}

    @Test(priority=600566)
  	public void checkOpeningStocksNewVoucherSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherSave(), true);
  	}
  
   
   
    @Test(priority=600567)
  	public void checkOpeningStocksNewSavedVoucherOnClickPreviousInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewSavedVoucherOnClickPreviousInEntryPage(), true);
  	}
     
    @Test(priority=600568)
  	public void checkOpeningStocksNewVoucherOnClickCloseBtnInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherOnClickCloseBtnInEntryPage(), true);
  	}
    
   
   
    @Test(priority=600569)
  	public void checkOpeningStocksNewVoucherOnClickEditButtonInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherOnClickEditButtonInHomePage(), true);
  	}
     
    @Test(priority=600570)
  	public void checkEditOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow(), true);
  	}
    
    @Test(priority=600571)
  	public void checkEditOpeningStocksNewVoucherInputBinFifoBinPopupOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherInputBinFifoBinPopupOptions(), true);
  	}
    
    
    @Test(priority=600572)
  	public void checkEditVoucherSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditVoucherSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk(), true);
  	}
    
    
    @Test(priority=600573)
  	public void checkEditOpeningStocksAddingDataInThirdRowForBinCheking() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksAddingDataInThirdRowForBinCheking(), true);
  	}
    
    
    @Test(priority=600574)
  	public void checkEditOpeningStocksAddingBinInThridRowAutoAllocateInBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksAddingBinInThridRowAutoAllocateInBin(), true);
  	}
    
   
    @Test(priority=600575)
  	public void checkEditOpeningStocksNewAddingDataInFourthRowForBinCheking() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewAddingDataInFourthRowForBinCheking(), true);
  	}
    
    @Test(priority=600576)
  	public void checkEditOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen(), true);
  	}
    
    
    @Test(priority=600577)
  	public void checkEditOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow(), true);
  	}
    
    @Test(priority=600578)
  	public void checkEditOpeningStocksNewDeleteRowBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewDeleteRowBin(), true);
  	}
    
    @Test(priority=600579)
  	public void checkEditOpeningStocksNewBinQuantityAfterAlocatingAndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewBinQuantityAfterAlocatingAndDeleting(), true);
  	}
    
   
    @Test(priority=600580)
  	public void checkEditOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty(), true);
  	}
    
    @Test(priority=600581)
  	public void checkEditOpeningStocksNewVoucherWithInputingThroughAllocateQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherWithInputingThroughAllocateQty(), true);
  	}
    
    @Test(priority=600582)
  	public void checkEditOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow(), true);
  	}
    
    @Test(priority=600583)
  	public void checkEditOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow(), true);
  	}
    
    @Test(priority=600584)
  	public void checkEditOpeningStocksNewVoucherConsumeFullCapacityInFifthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherConsumeFullCapacityInFifthRow(), true);
  	}
    
   
    @Test(priority=600585)
  	public void checkEditOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows(), true);
  	}
    
    
    
    @Test(priority=600586)
  	public void checkOpeningStocksNewVoucherAlertAndOKButtonInRevertChanges() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherAlertAndOKButtonInRevertChanges(), true);
  	}
    
    @Test(priority=600587)
  	public void checkOpeningStocksNewVoucherOnClickOnRevertChanges() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherOnClickOnRevertChanges(), true);
  	}
    
  
    @Test(priority=600588)
  	public void checkOpeningStocksNewVoucherEditByUpdatingBRCOGSAndNoBatchInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherEditByUpdatingBRCOGSAndNoBatchInFirstRow(), true);
  	}
    
    @Test(priority=600589)
  	public void checkOpeningStocksNewEditAndUpdateBatchNoWithoutExpiryDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewEditAndUpdateBatchNoWithoutExpiryDate(), true);
  	}
   
    @Test(priority=600590)
  	public void checkOpeningStocksNewVoucherEditByUpdateExpiryDateInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherEditByUpdateExpiryDateInFirstRow(), true);
  	}
    
    @Test(priority=600591)
  	public void checkEditAndUpdateBinBySelectingOtherBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditAndUpdateBinBySelectingOtherBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk(), true);
  	}
    
    
    @Test(priority=600592)
  	public void checkEditOpeningStocksNewVoucherRMAItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherRMAItemQtyUpdate(), true);
  	}
    
    @Test(priority=600593)
  	public void checkEditOpeningStocksNewVoucherRMAPopUpOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherRMAPopUpOnRmaItemQtyUpdate(), true);
  	}
    
    @Test(priority=600594)
  	public void checkEditOpeningStocksNewVoucherRMAAddButtonOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherRMAAddButtonOnRmaItemQtyUpdate(), true);
  	}
    
    @Test(priority=600595)
  	public void checkEditOpeningStocksNewVoucherRMAOkButtonOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherRMAOkButtonOnRmaItemQtyUpdate(), true);
  	}
    
    @Test(priority=600596)
  	public void checkEditOpeningStocksNewVoucherRMAClearButtonOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherRMAClearButtonOnRmaItemQtyUpdate(), true);
  	}
    
    @Test(priority=600597)
  	public void checkEditOpeningStocksNewVoucherAddingNewSerialNumbersOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewVoucherAddingNewSerialNumbersOnRmaItemQtyUpdate(), true);
  	}
    
    @Test(priority=600598)
  	public void checkEditOpeningStocksNewStockItemInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditOpeningStocksNewStockItemInFourthRow(), true);
  	}
    
    
    
   
    @Test(priority=600599)
  	public void checkOpeningStocksNewUpdateVoucherOnClickPreviousInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewUpdateVoucherOnClickPreviousInEntryPage(), true);
  	}
    
    
    @Test(priority=600600)
  	public void checkOpeningStocksNewVoucherCopyAndPasteFromClipBoardOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherCopyAndPasteFromClipBoardOptions(), true);
  	}
    
    @Test(priority=600601)
  	public void checkOpeningStocksNewVoucherInputBatchAndBinPopupOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherInputBatchAndBinPopupOptions(), true);
  	}
    
    @Test(priority=600602)
  	public void checkOpeningStocksNewVoucherCopyAndPasteThroughAllocateQtyInBinPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherCopyAndPasteThroughAllocateQtyInBinPage(), true);
  	}
    
    @Test(priority=600603)
  	public void checkOpeningStocksNewSaveInputRMAPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewSaveInputRMAPopupScreen(), true);
  	}
    
    
    @Test(priority=600604)
  	public void checkOpeningStocksNewOkButtonRMAPopupScreenBatchBinAndRmaColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewOkButtonRMAPopupScreenBatchBinAndRmaColumn(), true);
  	}
    
    @Test(priority=600605)
  	public void checkOpeningStocksNewVoucherSaveThroughCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherSaveThroughCopyDocument(), true);
  	}
  	
  	
    
    //COPY DOCUMENT
    
    @Test(priority=600606)
  	public void checkOpeningStocksNewSaveVoucherThroughCopyAndPasteFromVClipboardOnClickPreviousInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewSaveVoucherThroughCopyAndPasteFromVClipboardOnClickPreviousInEntryPage(), true);
  	}
    
    
    @Test(priority=600607)
  	public void checkOpeningStocksNewVoucherToDeleteOnClickOkButtonInAlertMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherToDeleteOnClickOkButtonInAlertMessage(), true);
  	}
       
    
    @Test(priority=600608)
  	public void checkOpeningStocksNewCopyDocumentOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewCopyDocumentOption(), true);
  	}
    
    @Test(priority=600609)
  	public void checkOpeningStocksNewCopyDocumentScreenOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewCopyDocumentScreenOptions(), true);
  	}
    
    @Test(priority=600610)
  	public void checkOpeningStocksNewFirstRowCheckboxInCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewFirstRowCheckboxInCopyDocument(), true);
  	}
    
    
    @Test(priority=600611)
  	public void checkLoadingVoucherInformationFromCopyDocumentOnClickOnOk() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkLoadingVoucherInformationFromCopyDocumentOnClickOnOk(), true);
  	}
   
    
    @Test(priority=600612)
  	public void checkSavingVoucherByCopyDocumentWithMandatoryCheck() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkSavingVoucherByCopyDocumentWithMandatoryCheck(), true);
  	}
    
    @Test(priority=600613)
  	public void checkOpeningStocksNewVoucherRevertChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherRevertChangeOption(), true);
  	}
    
    @Test(priority=600614)
  	public void checkOKButtonOnRevertChanges() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOKButtonOnRevertChanges(), true);
  	}
    
    @Test(priority=600615)
  	public void checkSuspendOptionInOpeningStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkSuspendOptionInOpeningStocks(), true);
  	}
    
    @Test(priority=600616)
  	public void checkOpeningStocksNewVoucherClickOnSuspendView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherClickOnSuspendView(), true);
  	}
    
    @Test(priority=600617)
  	public void checkOpeningStocksNewVoucherCloseButtonInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkOpeningStocksNewVoucherCloseButtonInHomePage(), true);
  	}
   
   
   
   */
   
    
    
    


    
    
    

 
    //Opening Balance Voucher
    
    @Test(priority=600700)
 	public void checkFinancialsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkFinancialsMenu(), true);
 	}
   
   @Test(priority=600701)
 	public void checkTransactionsMenuInFinanceMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkTransactionsMenuInFinanceMenu(), true);
 	}
   
   
   @Test(priority=600702)
 	public void checkFinancialsMenuTransactionsMenuJournalsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkFinancialsMenuTransactionsMenuJournalsMenu(), true);
 	}
   
   @Test(priority=600703)
 	public void checkOpeningBalanceVoucherDisplayHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherDisplayHomePage(), true);
 	}
     
   @Test(priority=600704)
 	public void checkSaveInCreateViewOfHomePageOfOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkSaveInCreateViewOfHomePageOfOpeningBalance(), true);
 	}
   
   @Test(priority=600705)
 	public void checkDeleteCreateViewOfHomePageOfOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkDeleteCreateViewOfHomePageOfOpeningBalance(), true);
 	}
   
  @Test(priority=600706)
 	public void checkEditCreateViewOfHomePageOfOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkEditCreateViewOfHomePageOfOpeningBalance(), true);
 	}    
     

   @Test(priority=600707)
 	public void checkOpeningBalanceVoucherHomePageNewOptionOnClickDisplayEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherHomePageNewOptionOnClickDisplayEntryPage(), true);
 	}
  
   @Test(priority=600708)
 	public void checkOpeningBalanceVoucherEntryPageRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherEntryPageRibbonControl(), true);
 	}
   
   
   @Test(priority=600709)
 	public void checkOpeningBalanceEntryPageOptionsUnderToggleBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceEntryPageOptionsUnderToggleBtn(), true);
 	}
     
    @Test(priority=600710)
 	public void checkCustomizationOptionInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkCustomizationOptionInOpeningBalance(), true);
 	}
   
    @Test(priority=600711)
 	public void checkOpeningBalanceVoucherEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherEntryPageHeaderFields(), true);
 	}
    
    @Test(priority=600712)
 	public void checkOpeningBalanceVoucherEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherEntryPageBodyFields(), true);
 	}
   
    @Test(priority=600713)
 	public void checkOpeningBalanceVoucherEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherEntryPageFooterFields(), true);
 	}
   
   @Test(priority=600714)
 	public void checkOpeningBalanceVoucherDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherDocumentNumber(), true);
 	}
   
    @Test(priority=600715)
 	public void checkOpeningBalanceVoucherDateIsDisable() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherDateIsDisable(), true);
 	}
   
    @Test(priority=600716)
 	public void checkOpeningBalanceVoucherSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherSaveWithoutMandatoryFields(), true);
 	}
   

    @Test(priority=600717)
 	public void checkCurrencyInOpeningBalanceVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkCurrencyInOpeningBalanceVoucher(), true);
 	}
  
    @Test(priority=600718)
 	public void checkExchangeRateWithCurrencyAEDInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkExchangeRateWithCurrencyAEDInOpeningBalance(), true);
 	}
   
    @Test(priority=600719)
 	public void checkExchangeRateAndLocalExchangeReateWithCurrencyAEDInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkExchangeRateAndLocalExchangeReateWithCurrencyAEDInOpeningBalance(), true);
 	}
   
    @Test(priority=600720)
 	public void checkExchangeRateAndLocalExchangeReateWithCurrencyUSDInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkExchangeRateAndLocalExchangeReateWithCurrencyUSDInOpeningBalance(), true);
 	}
   
    @Test(priority=600721)
 	public void checkExchangeRateAndLocalExchangeRateWithCurrencyINRInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkExchangeRateAndLocalExchangeRateWithCurrencyINRInOpeningBalance(), true);
 	}

    @Test(priority=600722)
 	public void checkSavingVoucherWithCustomerACurrencyINRDepartmentINDIALessThanAccountinDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkSavingVoucherWithCustomerACurrencyINRDepartmentINDIALessThanAccountinDate(), true);
 	}
   
   
    @Test(priority=600723)
 	public void checkPreviousButtonInOpeningBalanceSavedVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPreviousButtonInOpeningBalanceSavedVoucher(), true);
 	}
   
    @Test(priority=600724)
 	public void checkOpeningBalanceVoucherEditPreviousToDeleteRowBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherEditPreviousToDeleteRowBin(), true);
 	}
  
    @Test(priority=600725)
 	public void checkOpeningBalanceVoucherEditPreviousUpdateRowAndSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherEditPreviousUpdateRowAndSave(), true);
 	}
   
    @Test(priority=600726)
 	public void checkCopyandPasteToClipboardInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkCopyandPasteToClipboardInOpeningBalance(), true);
 	}
   
  
    @Test(priority=600727)
 	public void checkSavingOpeningBalanceVoucherAfterCopyToClipBoard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkSavingOpeningBalanceVoucherAfterCopyToClipBoard(), true);
 	}
   
    @Test(priority=600728)
 	public void checkDeleteOptionFromEntryPageinOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkDeleteOptionFromEntryPageinOpeningBalance(), true);
 	}
   
    @Test(priority=600729)
 	public void checkOpeningBalanceNewCopyDocumentOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceNewCopyDocumentOption(), true);
 	}
   
   @Test(priority=600730)
 	public void checkOpeningBalanceNewCopyDocumentScreenOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceNewCopyDocumentScreenOptions(), true);
 	}
   
    @Test(priority=600731)//Expected Fail
 	public void checkOpeningBalanceFirstRowCheckboxInCopyDocumentInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceFirstRowCheckboxInCopyDocumentInOpeningBalance(), true);
 	}
   
    @Test(priority=600732)
 	public void checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInOpeningBalance(), true);
 	}
   
    @Test(priority=600733)
 	public void checkSavingOpeningBalanceVoucherAfterCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkSavingOpeningBalanceVoucherAfterCopyDocument(), true);
 	}
   
    @Test(priority=600734)
 	public void checksuspendedOptionInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checksuspendedOptionInOpeningBalance(), true);
 	}
   

 	
   
    //@Test(priority=600735)//Excepted Fail	
 	public void checkOpeningBalanceNewVoucherClickOnSuspendView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceNewVoucherClickOnSuspendView(), true);
 	}
 	
    @Test(priority=600736)
 	public void checkOpeningBalanceVoucherCustomizationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceVoucherCustomizationOption(), true);
 	}
   
    @Test(priority=600737)
 	public void checkOpeningBalanceCustomizeLeftPannelElementsDisplayed() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkOpeningBalanceCustomizeLeftPannelElementsDisplayed(), true);
 	}
   
    @Test(priority=600738)
 	public void checkCustomizeLeftPannelInnerFieldsInOpeningBalance() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkCustomizeLeftPannelInnerFieldsInOpeningBalance(), true);
 	}
   
    @Test(priority=600739)
 	public void checkHidingFieldCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkHidingFieldCustomization(), true);
 	}
   
    @Test(priority=600740)
 	public void checkAddingExtraFieldInCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkAddingExtraFieldInCustomization(), true);
 	}
   
    @Test(priority=600741)
 	public void checkDeleteExtraFieldFromHomePageBodyHeader() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkDeleteExtraFieldFromHomePageBodyHeader(), true);
 	}

    @Test(priority=600742)
	public void checkOpeningBalanceVoucherCloseButtonInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkOpeningBalanceVoucherCloseButtonInHomePage(), true);
	}

    
    
 
   
      // Purchase Vocuher N
    
      //Starting Of PurchaseVoucher Transaction Authorization and Master Authorization
  
	  @Test(priority=600799)
	  public void checkFinancialsMenuTransactionsMenuPurchasesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	  	svp=new SmokeVouchersInitialPage(getDriver());
	  	Assert.assertEquals(svp.checkFinancialsMenuTransactionsMenuPurchasesMenu(), true);
	  }
	
   
      @Test(priority=600800)
 	  public void checkPurchaseVoucherNewHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPurchaseVoucherNewHomePage(), true);
 	  }
     
      
      @Test(priority=600802)
 	  public void checkPurchasesVoucherPendingLinksOptionsInHomePageOnAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPurchasesVoucherPendingLinksOptionsInHomePageOnAuthorization(), true);
 	  }
    
      
      @Test(priority=600803)
 	  public void checkPurchasesVoucherOpenEntryByConvertOpyionInHomePageOnLinksView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPurchasesVoucherOpenEntryByConvertOpyionInHomePageOnLinksView(), true);
 	  }
      
        
      @Test(priority=600804)
 	  public void checkEditVendorAccountToUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkEditVendorAccountToUpdate(), true);
 	  }
          
      @Test(priority=600805)
 	  public void checkCreateVendorAccountMasterAuthorization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkCreateVendorAccountMasterAuthorization(), true);
 	  }
       
      @Test(priority=600807)
 	  public void checkPurchaseVoucherNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageHeaderFields(), true);
 	  }
     
      @Test(priority=600808)
 	  public void checkPurchaseVoucherNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageBodyFields(), true);
 	  }
     
      @Test(priority=600809)
 	  public void checkPurhaseVoucherNewEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageFooterFields(), true);
 	  }
         
      @Test(priority=600810)
 	  public void checkPurchaseVoucherNewEntryPageDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageDocumentNumber(), true);
 	  }
     
      @Test(priority=600815)
 	  public void checkPurchaseVoucherNewDueDateOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPurchaseVoucherNewDueDateOption(), true);
 	  }
    
      @Test(priority=600816)
 	  public void checkPurchaseVoucherNewCurrencyHasNotDefinedOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkPurchaseVoucherNewCurrencyHasNotDefinedOptions(), true);
 	  }
     
      @Test(priority=600823)
 	  public void checkCurrencyWithAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkCurrencyWithAED(), true);
 	  }
      
      @Test(priority=600824)
 	  public void checkCurrencyWithUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkCurrencyWithUSD(), true);
 	  }
    
    
      @Test(priority=600825)
 	  public void checkDepartmentEditExchangeRateAndLocalExchangeReateWithCurrencyAEDInPV() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkDepartmentEditExchangeRateAndLocalExchangeReateWithCurrencyAEDInPV(), true);
 	  }
     
      @Test(priority=600826)
 	  public void checkExchangeRateAndLocalExchangeReateWithCurrencyUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkExchangeRateAndLocalExchangeReateWithCurrencyUSD(), true);
 	  }
    
      @Test(priority=600827)
 	  public void checkJursidicationValueOnChangeDepartmentAndLocalExchangeRateWithCurrencyINR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	  {
 		svp=new SmokeVouchersInitialPage(getDriver());
 		Assert.assertEquals(svp.checkJursidicationValueOnChangeDepartmentAndLocalExchangeRateWithCurrencyINR(), true);
 	  }
          
	  
	
	  @Test(priority=600831)
	  public  static void checkINVTagTaxCodeBySelectingStandardRateItemInPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkINVTagTaxCodeBySelectingStandardRateItemInPurchaseVoucherBody(),true);  
	  }

	  @Test(priority=600840)
	  public  static void checkPurchaseVoucherNewBillwise() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewBillwise(),true);
	  }  
	  
	  @Test(priority=600841)
	  public  static void checkPurchaseVoucherNewBillwiseScreenClickOnPick() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
	  	Assert.assertEquals(svp.checkPurchaseVoucherNewBillwiseScreenClickOnPick(),true);
      }
	
	  @Test(priority=600842)
	  public  static void checkSavingOfPurchaseVoucherNewOnClickOkButtonInBillwisePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkSavingOfPurchaseVoucherNewOnClickOkButtonInBillwisePage(),true);
	  }

	  @Test(priority=600843)
	  public  static void checkStandardRateOptionByVoucherEdit() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkStandardRateOptionByVoucherEdit(),true);
	  }
	
	  @Test(priority=600844)
	  public  static void checkCloseBtnInEntryPageAndCheckLinksDisplayInHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkCloseBtnInEntryPageAndCheckLinksDisplayInHomePage(),true);
	  }
     
      
	  @Test(priority=600843)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBar() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageInfoSideBar(),true);
	  }
	
	  @Test(priority=600844)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarCustomizeBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageInfoSideBarCustomizeBtn(),true);
	  }
	
	  @Test(priority=600845)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarGraphOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageInfoSideBarGraphOption(),true);
	   }

	  @Test(priority=600846)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarReportOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageInfoSideBarReportOption(),true);
	  }
	
	  @Test(priority=600847)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarInfoPanelOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageInfoSideBarInfoPanelOption(),true);
	  }
	
	  @Test(priority=600848)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarWorkFlowOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageInfoSideBarWorkFlowOption(),true);
	  }	
	
	  @Test(priority=600849)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarOtherDashletsOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageInfoSideBarOtherDashletsOption(),true);
	  }
	
	  @Test(priority=600850)
	  public  static void checkPurchaseVoucherNewEntryPageInfoSideBarSearch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewEntryPageInfoSideBarSearch(),true);
	  }
	
	  @Test(priority=600851)
	  public  static void checkPurchaseVoucherNewInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewInfoPanelDashlet(),true);
	  }
	
	  @Test(priority=600852)
	  public  static void checkPurchaseVoucherNewSaveInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	  {
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewSaveInfoPanelDashlet(),true);
	  }
	
	
	// 830,31,32 are commented as update stock is unchecking
	
	@Test(priority=600853)
	public  static void checkVendorAccountBlankNarrationToDisplayCaptionItem() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
	  svp=new SmokeVouchersInitialPage(getDriver());
	  Assert.assertEquals(svp.checkVendorAccountBlankNarrationToDisplayCaptionItem(),true);	  
	}
	
	/*@Test(priority=600854)
	public  static void checkSavingVoucherWithoutExpiryDatePurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkSavingVoucherWithoutExpiryDatePurchaseVoucher(),true);	  
	}*/
	
	/*
	@Test(priority=600853)
	public  static void checkVoucherStatusInInfoPanelOnClickPreviousButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkVoucherStatusInInfoPanelOnClickPreviousButton(),true);
	}
	
	@Test(priority=600854)
	public  static void checkPurchaseVoucherNewAuthorizationStatusInHomePageInAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPurchaseVoucherNewAuthorizationStatusInHomePageInAuthorizeUser(),true);
	}
	
	@Test(priority=600855)
	public  static void checkPendingAuthorizationPurchaseInHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPendingAuthorizationPurchaseInHomePage(),true);
	}
	
	@Test(priority=600856)
	public  static void checkPendingPurchaseOrdersInHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPendingPurchaseOrdersInHomePage(),true);
	}
	
	
	// Copied method from prebious
	//@Test(priority=600832)
	public  static void checkInputExpiryDateOfBatchInPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkInputExpiryDateOfBatchInPurchaseVoucher(),true);  
	}
	
	
	//@Test(priority=600833)
	//public  static void checkEnteringDataInSecondRowOfPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	//{

		//svp=new SmokeVouchersInitialPage(getDriver());
		//Assert.assertEquals(svp.checkEnteringDataInSecondRowOfPurchaseVoucher(),true);
		  
	//}
	
	//@Test(priority=600834)
	//public  static void checkPurchaseVoucherNewSelectingBin4ThroughDoubleClick() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	//{

		//svp=new SmokeVouchersInitialPage(getDriver());
		//Assert.assertEquals(svp.checkPurchaseVoucherNewSelectingBin4ThroughDoubleClick(),true);
		  
	//}
	
	//@Test(priority=600835)
	//public  static void checkEnteringDatainThirdRowAndSaveForRmaValidation() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	//{

		//svp=new SmokeVouchersInitialPage(getDriver());
		//Assert.assertEquals(svp.checkEnteringDatainThirdRowAndSaveForRmaValidation(),true);
		  
	//}
	
	//@Test(priority=600836)
	//public  static void checkPurchaseVoucherEnteringDataRmaWithZeroQuantity() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	//{
		//svp=new SmokeVouchersInitialPage(getDriver());
		//Assert.assertEquals(svp.checkPurchaseVoucherEnteringDataRmaWithZeroQuantity(),true);
	//}
	
	//@Test(priority=600837)
	//public  static void checkPurchaseVoucherNewRMAPopupScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	//{
		//svp=new SmokeVouchersInitialPage(getDriver());
		//Assert.assertEquals(svp.checkPurchaseVoucherNewRMAPopupScreen(),true);
	//}
	
	//@Test(priority=600838)
	//public  static void checkPurchaseVoucherNewInputingSerialNumbers() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	//{
		//svp=new SmokeVouchersInitialPage(getDriver());
		//Assert.assertEquals(svp.checkPurchaseVoucherNewInputingSerialNumbers(),true);
	//}
	
	//@Test(priority=600839)
	//public  static void checkPurchaseVoucherNewAddingStockItemInFourthRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	//{
		//svp=new SmokeVouchersInitialPage(getDriver());
		//Assert.assertEquals(svp.checkPurchaseVoucherNewAddingStockItemInFourthRow(),true);
	//}
	
	 
	
	
	/*@Test(priority=600857)
	public  static void checkCloseOptionInPurchaseVoucherNewHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkCloseOptionInPurchaseVoucherNewHomePage(),true);
	}*/

	/*@Test(priority=600858)
	public  static void checkSignOutBeforeVoucherAuthorization() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkSignOutBeforeVoucherAuthorization(),true);
	}
   	
	@Test(priority=600859)
	public  static void checkAlertsInWrapperLayoutAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkAlertsInWrapperLayoutAuthorizeUser(),true);
	}
	
	@Test(priority=600860)
	public  static void checkClickOnAlertsInWrapperLayoutAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkClickOnAlertsInWrapperLayoutAuthorizeUser(),true);
	}
	
	
	@Test(priority=600861)
	public  static void checkClickOnTransactionAlertsInAlertsPopUpAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkClickOnTransactionAlertsInAlertsPopUpAuthorizeUser(),true);
	}
	
	@Test(priority=600862)
	public  static void checkClickOnVoucherAlertsFromTransactionsOfAlertPopupAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkClickOnVoucherAlertsFromTransactionsOfAlertPopupAuthorizeUser(),true);
	}
	
	@Test(priority=600863)
	public  static void checkClickOnDocumentNumberAlertsInAlertsPopUpAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkClickOnDocumentNumberAlertsInAlertsPopUpAuthorizeUser(),true);
	}
	
	@Test(priority=600864)
	public  static void checkAuthorizeOptionAndAuthorizationStatusInHomePageInAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkAuthorizeOptionAndAuthorizationStatusInHomePageInAuthorizeUser(),true);
	}
	
	
	@Test(priority=600865)
	public  static void checkVoucherInformationAfterAuthorizationInAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkVoucherInformationAfterAuthorizationInAuthorizeUser(),true);
	}
	
	@Test(priority=600866)
	public  static void checkPendingAuthorizationsInAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPendingAuthorizationsInAuthorizeUser(),true);
	}
	
	@Test(priority=600867)
	public  static void checkPendingPurchaseOrdersInHomePageAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkPendingPurchaseOrdersInHomePageAuthorizeUser(),true);
	}
	
	@Test(priority=600868)
	public  static void checkCloseOptionInPurchaseVoucherNewHomePageAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkCloseOptionInPurchaseVoucherNewHomePageAuthorizeUser(),true);
	}
	
	@Test(priority=600869)
	public  static void checkSignOutInAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkSignOutInAuthorizeUser(),true);
	}
	
	@Test(priority=600870)
	public  static void checkSignInForSU() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkSignInForSU(),true);
	}
	
	@Test(priority=600871)
	public  static void checkAuthorizationStatusInPurchaseVoucherNewSULogin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkAuthorizationStatusInPurchaseVoucherNewSULogin(),true);
	}
	
	@Test(priority=600872)
	public  static void checkAuthorizeVoucherInPurchaseVoucherNewEditOptionFromHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkAuthorizeVoucherInPurchaseVoucherNewEditOptionFromHomePage(),true);
	}
	
	// Saving  Vendor Account in PVN
	@Test(priority=600873)
    public void checkAccountPageOnClickOnAccountsInVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkAccountPageOnClickOnAccountsInVoucher(), true);
	}
	 
	     
	 //@Test(priority=600874)
	 //public void checkSaveButtonWithoutInputNameMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 //{
	 //	 svp=new SmokeVouchersInitialPage(getDriver());
	 //	 Assert.assertEquals(svp.checkSaveButtonWithoutInputNameMandatoryFields(), true);
	 //}
	 
	 @Test(priority=600875)
	 public void checkSavingAccountInVoucherEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 svp=new SmokeVouchersInitialPage(getDriver());
		 Assert.assertEquals(svp.checkSavingAccountInVoucherEntryPage(), true);
	 }
	     
	 @Test(priority=600876)
	 public void checkCloseBtnInAccountCreationPageInVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 svp=new SmokeVouchersInitialPage(getDriver());
		 Assert.assertEquals(svp.checkCloseBtnInAccountCreationPageInVoucher(), true);
	 }
	     
	// Masters Authorization Starts
	@Test(priority=600877)
	public  static void checkAccountsMastersPageOnClickOnAccountsMenuFromMastersMenu() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkAccountsMastersPageOnClickOnAccountsMenuFromMastersMenu(),true);
	}
	
	
	@Test(priority=600878)
	public  static void checkShowAllUnAuthorizeOptionInAccountsMasterPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkShowAllUnAuthorizeOptionInAccountsMasterPage(),true);
	}
	
	@Test(priority=600879)
	public  static void checkClickOnCloseButtonInAccountMasterInSuLogin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkClickOnCloseButtonInAccountMasterInSuLogin(),true);
	}
	
	@Test(priority=600880)
	public  static void checkSignOutBeforeMasterAuthorization() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkSignOutBeforeMasterAuthorization(),true);
	}
	
	@Test(priority=600881)
	public  static void checkMasterAuthoizationToLoginAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkMasterAuthoizationToLoginAuthorizeUser(),true);
	}
	
	@Test(priority=600882)
	public  static void checkOpenAccountsMastersPageFromAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkOpenAccountsMastersPageFromAuthorizeUser(),true);
	}
	
	@Test(priority=600883)
	public  static void checkShowAllUnAuthorizeOptionInAccountsMasterPageFromAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkShowAllUnAuthorizeOptionInAccountsMasterPageFromAuthorizeUser(),true);
	}
	
	@Test(priority=600884)
	public  static void checkSelectNonAuthorizeAndClickOnAuthorizeButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkSelectNonAuthorizeAndClickOnAuthorizeButton(),true);
	}
	
	@Test(priority=600885)
	public  static void checkAUthorizePageWithRemarksClickOnSaveBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkAUthorizePageWithRemarksClickOnSaveBtn(),true);
	}
	
	@Test(priority=600886)
	public  static void checkClickOnCloseButtonInAccountMasterInAuthorizeLogin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkClickOnCloseButtonInAccountMasterInAuthorizeLogin(),true);
	}
	
	@Test(priority=600887)
	public  static void checkSignOutAuthorizationOfMasterByAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkSignOutAuthorizationOfMasterByAuthorizeUser(),true);
	}
	
	@Test(priority=600888)
	public  static void checkSignInWithUserNameAsSu() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkSignInWithUserNameAsSu(),true);
	}
	
	@Test(priority=600889)
	public  static void checkCopyandPasteFromClipBoardinPurchaseVoucherNew() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkCopyandPasteFromClipBoardinPurchaseVoucherNew(),true);
	}

   


	// Purchase Voucher VAT

		/*@Test(priority=600900)
		public  static void checkPurchaseVoucherVATHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATHomePage(),true);
		}
		
		//@Test(priority=600901)
		public  static void checkPurchaseVoucherVATSettingOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATSettingOptions(),true);
		}
		
		@Test(priority=600902)
		public  static void checkPurchaseVoucherVATNewEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATNewEntryPage(),true);
		}
		
		@Test(priority=600903)
		public  static void checkPurchaseVoucherVATEntryPageHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATEntryPageHeaderFields(),true);
		}

		@Test(priority=600904)
		public  static void checkPurchaseVoucherVATEntryPageBodyFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATEntryPageBodyFields(),true);
		}
		
		
		@Test(priority=600905)
		public  static void checkPurchaseVoucherVATEntryPageFooterFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATEntryPageFooterFields(),true);
		}

		@Test(priority=600906)
		public  static void checkPurchaseVoucherVATEntryPageDocumentNumber() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATEntryPageDocumentNumber(),true);
		}
		
		
		@Test(priority=600907)
		public  static void checkPurchaseVoucherVATSaveWithOutInput() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATSaveWithOutInput(),true);
		}
		
		@Test(priority=600908)
		public  static void checkPurchaseVoucherVATVendorOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATVendorOptions(),true);
		}

		@Test(priority=600909)
		public  static void checkPurchaseVoucherVATSaveWithVendorInput() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATSaveWithVendorInput(),true);
		}
		
		@Test(priority=600910)
		public  static void checkDueDateOptioninPurchaseVoucherVATEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkDueDateOptioninPurchaseVoucherVATEntryPage(),true);
		}
		
		@Test(priority=600911)
		public  static void checkCurrencyOptioninPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkCurrencyOptioninPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600912)
		public  static void checkPurchaseVoucherVATVouchersEntryPageNew() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATVouchersEntryPageNew(),true);
		}

		@Test(priority=600913)
		public  static void checkPurchaseVoucherVATWithCurrencyInputAndExcgRate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATWithCurrencyInputAndExcgRate(),true);
		}
		
		
		@Test(priority=600914)
		public  static void checkPurchaseVoucherVATDepartment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATDepartment(),true);
		}
		
		@Test(priority=600915)
		public  static void checkExchangeRateAndLocalExchangeRateWithCurrencyINRInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkExchangeRateAndLocalExchangeRateWithCurrencyINRInPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600916)
		public  static void checkSettingPlaceofSupplyForvendorAInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkSettingPlaceofSupplyForvendorAInPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=600917)
		public  static void checkDepartmentMasterCreationPageOnClickOnEditMasterInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkDepartmentMasterCreationPageOnClickOnEditMasterInPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600918)
		public  static void checkDepartmentMasterUpdateByClickOnSaveInPurchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkDepartmentMasterUpdateByClickOnSaveInPurchaseVoucher(),true);
		}
		*/
	
		@Test(priority=600919)
		public  static void checkTaxCodeBySelectingStandardRateItemInPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingStandardRateItemInPurchaseVoucherBody(),true);
		}
		
		
		@Test(priority=600920)
		public  static void checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600921)
		public  static void checkGrossBySelectingStandardRateIteminPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingStandardRateIteminPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600922)
		public  static void checkVATValueBySelectingStandardRateIteminPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingStandardRateIteminPurchaseVoucherBody(),true);
		}
		
		
		@Test(priority=600923)
		public  static void checkTaxableValueBySelectingStandardRateItemAndClickonSaveWithoutBatch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingStandardRateItemAndClickonSaveWithoutBatch(),true);
		}
		
		@Test(priority=600924)
		public  static void checkBatchValueandExpireyDateInPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBatchValueandExpireyDateInPurchaseVoucherBody(),true);
		}
		
		

		@Test(priority=600925)
		public  static void checkTaxCodeBySelectingStandardRateItemInSecondRowOfPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingStandardRateItemInSecondRowOfPurchaseVoucherBody(),true);
		}
		
		
		@Test(priority=600926)
		public  static void checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInSecondRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600927)
		public  static void checkGrossBySelectingStandardRateItemInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingStandardRateItemInSecondRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600928)
		public  static void checkVATValueBySelectingStandardRateItemInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingStandardRateItemInSecondRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600929)
		public  static void checkTaxableValueBySelectingStandardRateItemInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingStandardRateItemInSecondRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600930)
		public  static void checkBatchValueInSecondRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBatchValueInSecondRowPurchaseVoucherBody(),true);
		}
		
		
		
		@Test(priority=600931)
		public  static void checkTaxCodeBySelectingStandardRateItemInThirdRowOfPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingStandardRateItemInThirdRowOfPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600932)
		public  static void checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingStandardRateBatchItemInThirdRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600933)
		public  static void checkGrossBySelectingStandardRateItemInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingStandardRateItemInThirdRowPurchaseVoucherBody(),true);
		}
		
		
		@Test(priority=600934)
		public  static void checkVATValueBySelectingStandardRateItemInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingStandardRateItemInThirdRowPurchaseVoucherBody(),true);
		}
		
		
		@Test(priority=600935)
		public  static void checkTaxableValueBySelectingStandardRateItemInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingStandardRateItemInThirdRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600936)
		public  static void checkBatchValueInThirdRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBatchValueInThirdRowPurchaseVoucherBody(),true);
		}
		

		@Test(priority=600937)
		public  static void checkUpdateItemSettingsAsZeroInFourthRowOfPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkUpdateItemSettingsAsZeroInFourthRowOfPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600938)
		public  static void checkPurchaseVoucherVATRowDelete() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATRowDelete(),true);
		}
		
		
		@Test(priority=600938)
		public  static void checkTaxCodeBySelectingStandardRateItemInFourthRowOfPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingStandardRateItemInFourthRowOfPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600939)
		public  static void checkAvGRateAndAVGRateOBySelectingBinItemInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingBinItemInFourthRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600940)
		public  static void checkGrossBySelectingStandardRateItemInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingStandardRateItemInFourthRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600941)
		public  static void checkVATValueBySelectingStandardRateItemInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingStandardRateItemInFourthRowPurchaseVoucherBody(),true);
		}
		
		
		@Test(priority=600942)
		public  static void checkTaxableValueBySelectingStandardRateItemInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingStandardRateItemInFourthRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600943)
		public  static void checkBinPopUpPageInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBinPopUpPageInFourthRowPurchaseVoucherBody(),true);
		}
		
		
		@Test(priority=600944)
		public  static void checkAutoAllocateOptionInBinPopupPageInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAutoAllocateOptionInBinPopupPageInFourthRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600945)
		public  static void checkCancelOptionInBinPopUpPageInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkCancelOptionInBinPopUpPageInFourthRowPurchaseVoucherBody(),true);
		}

		@Test(priority=600946)
		public  static void checkBinPopUpPageAfterClickOnCancelAndClickOnBinInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBinPopUpPageAfterClickOnCancelAndClickOnBinInFourthRowPurchaseVoucherBody(),true);
		}
		
		@Test(priority=600947)
		public  static void checkPickOptionInBinPopupPageInFourthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPickOptionInBinPopupPageInFourthRowOfPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600948)
		public  static void checkBinPopUpPagePickQtyAfterClickOnOkButtonAndClickOnBinInFourthRowPurchaseVoucherBody() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBinPopUpPagePickQtyAfterClickOnOkButtonAndClickOnBinInFourthRowPurchaseVoucherBody(),true);
		}

		
		
		@Test(priority=600949)
		public  static void checkTaxCodeBySelectingFIFOBinItemInFifthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingFIFOBinItemInFifthRowOfPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600950)
		public  static void checkAvGRateAndAVGRateOBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=600951)
		public  static void checkGrossBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600952)
		public  static void checkVATValueBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600953)
		public  static void checkTaxableValueBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingFIFOBinItemInFifthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600954)
		public  static void checkBinPopUpPageInputManualInputInAllocateQtyInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBinPopUpPageInputManualInputInAllocateQtyInPurchaseVoucherVAT(),true);
		}

		
		@Test(priority=600955)
		public  static void checkTaxCodeBySelectingFIFOBinItemInSixthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingFIFOBinItemInSixthRowOfPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600956)
		public  static void checkGrossBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600957)
		public  static void checkVATValueBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600958)
		public  static void checkTaxableValueBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600959)
		public  static void checkAvGRateAndAVGRateOBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingFIFOBinItemInSixthRowPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=600960)
		public  static void checkBinPopUpPageSelectBinAllocateQtyThroughDoubleClickInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBinPopUpPageSelectBinAllocateQtyThroughDoubleClickInPurchaseVoucherVAT(),true);
		}
	
		
		@Test(priority=600961)
		public  static void checkTaxCodeBySelectingWACOGSRMAItemInSeventhRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingWACOGSRMAItemInSeventhRowOfPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600962)
		public  static void checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600963)
		public  static void checkGrossBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600964)
		public  static void checkVATValueBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600965)
		public  static void checkTaxableValueBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingWACOGSRMAItemInSeventhRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600966)
		public  static void checkAddAndOkButtonInRmaPageOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAddAndOkButtonInRmaPageOfPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=600967)
		public  static void checkTaxCodeBySelectingWACOGSRMAItemInEightRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingWACOGSRMAItemInEightRowOfPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600968)
		public  static void checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInEigthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInEigthRowPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=600969)
		public  static void checkGrossBySelectingWACOGSRMAItemIEigthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingWACOGSRMAItemIEigthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600970)
		public  static void checkVATValueBySelectingWACOGSRMAItemInEightRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingWACOGSRMAItemInEightRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600971)
		public  static void checkTaxableValueBySelectingWACOGSRMAItemInEigthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingWACOGSRMAItemInEigthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600972)
		public  static void checkAddAndOkButtonInRmaPageEigthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAddAndOkButtonInRmaPageEigthRowOfPurchaseVoucherVAT(),true);
		}

		
		@Test(priority=600973)
		public  static void checkTaxCodeBySelectingWACOGSRMAItemInNinethRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingWACOGSRMAItemInNinethRowOfPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600974)
		public  static void checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600975)
		public  static void checkGrossBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600976)
		public  static void checkVATValueBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT(),true);
		}
		

		@Test(priority=600977)
		public  static void checkTaxableValueBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingWACOGSRMAItemInNinethRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600978)
		public  static void checkAddAndOkButtonInRmaPageNinethRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAddAndOkButtonInRmaPageNinethRowOfPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=600979)
		public  static void checkTaxCodeBySelectingStdCOGSItemInTenthRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingStdCOGSItemInTenthRowOfPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600980)
		public  static void checkAvGRateAndAVGRateOBySelectingStdCOGSItemInTenthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingStdCOGSItemInTenthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600981)
		public  static void checkGrossBySelectingStdCOGSItemInTenthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingStdCOGSItemInTenthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600982)
		public  static void checkVATValueBySelectingStdCOGSInTenthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingStdCOGSInTenthRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600983)
		public  static void checkTaxableValueBySelectingStdCOGSInTenthRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingStdCOGSInTenthRowPurchaseVoucherVAT(),true);
		}
		


		@Test(priority=600984)
		public  static void checkTaxCodeBySelectingStdCOGSInEleventhRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingStdCOGSInEleventhRowOfPurchaseVoucherVAT(),true);
		}
		;
		@Test(priority=600985)
		public  static void checkAvGRateAndAVGRateBySelectingStdCOGSInEleventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateBySelectingStdCOGSInEleventhRowPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=600986)
		public  static void checkGrossBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600987)
		public  static void checkVATValueBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600988)
		public  static void checkTaxableValueBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingStdCOGSItemInEleventhRowPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=600989)
		public  static void checkTaxCodeBySelectingStdCOGSInTwelevethRowOfPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxCodeBySelectingStdCOGSInTwelevethRowOfPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600990)
		public  static void checkAvGRateAndAVGRateOBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkAvGRateAndAVGRateOBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600991)
		public  static void checkGrossBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkGrossBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600992)
		public  static void checkVATValueBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkVATValueBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600993)
		public  static void checkTaxableValueBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTaxableValueBySelectingStdCOGSInTwelevethRowPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=600994)
		public  static void checkPurchaseVoucherVATBillwisePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATBillwisePage(),true);
		}
		
		@Test(priority=600995)
		public  static void checkPurchaseVoucherVATBillwiseScreenClickOnPick() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATBillwiseScreenClickOnPick(),true);
		}
		
		@Test(priority=600996)
		public  static void checkSavingOfPurchaseVoucherVATOnClickOkButtonInBillwisePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkSavingOfPurchaseVoucherVATOnClickOkButtonInBillwisePage(),true);
		}
		
		@Test(priority=600997)
		public  static void checkBatchValidationInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBatchValidationInPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600998)
		public  static void checkBinValidationInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkBinValidationInPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=600999)
		public  static void checkTotalConsumedBinValidationInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkTotalConsumedBinValidationInPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=601000)
		public  static void checkRowDeleteInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkRowDeleteInPurchaseVoucherVAT(),true);
		}
		
		

		@Test(priority=601001)
		public  static void checkChangingWareHouseAfterBinAllocatedinPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkChangingWareHouseAfterBinAllocatedinPurchaseVoucherVAT(),true);
		}
		
		
		
		@Test(priority=601002)
		public  static void checkRMAValidationInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkRMAValidationInPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=601003)
		public  static void checkRMAValidationWithDuplicateSerialNumberInPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkRMAValidationWithDuplicateSerialNumberInPurchaseVoucherVAT(),true);
		}
		
		
		@Test(priority=601004)
		public  static void checkPurchaseVoucherVATCopyDocumentOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPurchaseVoucherVATCopyDocumentOption(),true);
		}
		
		
		@Test(priority=601005)
		public  static void checkCopyDocumentOptioninPurchaseVoucherVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkCopyDocumentOptioninPurchaseVoucherVAT(),true);
		}
		
		@Test(priority=601006)
		public  static void checkSavingVocuherWithAllInputsThroughCopyDocument() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkSavingVocuherWithAllInputsThroughCopyDocument(),true);
		}
		
		
		@Test(priority=601007)
		public  static void checkSuspedingPurchaseVoucherVatVoucherOnPreviousButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkSuspedingPurchaseVoucherVatVoucherOnPreviousButton(),true);
		}

	   
	    /*@Test(priority=601008)
		public  static void checkPostingDetailsOnInputingRateRateSameAsStandardRateDefined() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		{
			svp=new SmokeVouchersInitialPage(getDriver());
			Assert.assertEquals(svp.checkPostingDetailsOnInputingRateRateSameAsStandardRateDefined(),true);
		}
	    
	    
	    @Test(priority=601009)
	   	public  static void checkEdtingVocuherAsRateGreaterThanStandardRateAndCheckPostingDetails() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	   	{
	   		svp=new SmokeVouchersInitialPage(getDriver());
	   		Assert.assertEquals(svp.checkEdtingVocuherAsRateGreaterThanStandardRateAndCheckPostingDetails(),true);
	   	}
	       
	    
	    @Test(priority=601009)
	   	public  static void checkEdtingVocuherAsRateLessThanStandardRateAndCheckPostingDetailsAndDeleteVocuher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	   	{
	   		svp=new SmokeVouchersInitialPage(getDriver());
	   		Assert.assertEquals(svp.checkEdtingVocuherAsRateLessThanStandardRateAndCheckPostingDetailsAndDeleteVocuher(),true);
	   	}
	    
	    @Test(priority=601010)
	   	public  static void checkPostingDetailsForSavedPuchaseVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	   	{
	   		svp=new SmokeVouchersInitialPage(getDriver());
	   		Assert.assertEquals(svp.checkPostingDetailsForSavedPuchaseVoucher(),true);
	   	}*/
	 
		
		
		// Job Order Check
		
		 @Test(priority=601011)
		 public  static void checkSavedVoucherInJobOrderAfterSavingVoucherInPVVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		 {
			 svp=new SmokeVouchersInitialPage(getDriver());
			 Assert.assertEquals(svp.checkSavedVoucherInJobOrderAfterSavingVoucherInPVVAT(),true);
		 }
		    
		    
		 @Test(priority=601012)
		 public  static void checkSavedVoucherInJobOrder() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
		 {
			 svp=new SmokeVouchersInitialPage(getDriver());
			 Assert.assertEquals(svp.checkSavedVoucherInJobOrder(),true);
		 }
			
		
		
		
    
    
//PV VAt View
  
    
   /* 
    @Test(priority=601100)
	public  static void checkCreatedVoucherUnderTransationinFinancial() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{
		svp=new SmokeVouchersInitialPage(getDriver());
		Assert.assertEquals(svp.checkCreatedVoucherUnderTransationinFinancial(),true);
	}
   
    @Test(priority=601101)
   	public  static void checkPvVatViewHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkPvVatViewHomePage(),true);
   	}
      
    @Test(priority=601102)
   	public  static void checkPVVATViewNewEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkPVVATViewNewEntryPage(),true);
   	}
   
    @Test(priority=601103)
   	public  static void checkPvVATViewEntryPageHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkPvVATViewEntryPageHeaderFields(),true);
   	}
    
    @Test(priority=601104)
   	public  static void checkPVVATViewEntryPageBodyFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkPVVATViewEntryPageBodyFields(),true);
   	}
    
    
    @Test(priority=601105)
   	public  static void checkPVVATViewEntryPageFooterFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkPVVATViewEntryPageFooterFields(),true);
   	}
    
    @Test(priority=601106)
   	public  static void checkDocumnetNumberAndSNarrationinPVVATViewEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkDocumnetNumberAndSNarrationinPVVATViewEntryPage(),true);
   	}
    
   
    @Test(priority=601107)
   	public  static void checkSNarrationWithVendorAAccountinPVVATViewEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkSNarrationWithVendorAAccountinPVVATViewEntryPage(),true);
   	}
   
    @Test(priority=601108)
   	public  static void checkSNarrationWithVendorBAccountinPVVATViewEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkSNarrationWithVendorBAccountinPVVATViewEntryPage(),true);
   	}
   
    @Test(priority=601109)//Remove Comment in page for Suit Run 
   	public  static void checkSignOutFromFromSu() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkSignOutFromFromSu(),true);
   	}
    
   
    
    @Test(priority=601110)//Login to USerAllOptions 
   	public  static void checkLoginIntoAuthorizeUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkLoginIntoAuthorizeUser(),true);
   	}
    
    @Test(priority=601111)
   	public  static void checkNavigateToPvVATViewinAuthorisedUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkNavigateToPvVATViewinAuthorisedUser(),true);
   	}
    
    
    @Test(priority=601112)
   	public  static void checkEntryPagePVVATViewINAuthoriseUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkEntryPagePVVATViewINAuthoriseUser(),true);
   	}
    
    
    @Test(priority=601113)
   	public  static void checkPvVATViewEntryPageHeaderFieldsInAuthoriseUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkPvVATViewEntryPageHeaderFieldsInAuthoriseUser(),true);
   	}
    
    @Test(priority=601114)
   	public  static void checkPVVATViewEntryPageBodyFieldsInAuthoriseUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkPVVATViewEntryPageBodyFieldsInAuthoriseUser(),true);
   	}
    
    @Test(priority=601115)
   	public  static void checkPVVATViewEntryPageFooterFieldsInAuthoriseUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkPVVATViewEntryPageFooterFieldsInAuthoriseUser(),true);
   	}
    
    
    @Test(priority=601116)
   	public  static void checkDocumentNumberAndSNarrationAndDateFieldinEntryPageOfAuthoriseUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkDocumentNumberAndSNarrationAndDateFieldinEntryPageOfAuthoriseUser(),true);
   	}
    
    @Test(priority=601117)
   	public  static void checkFooterDefaultValueInEntryPageOfPVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkFooterDefaultValueInEntryPageOfPVVATView(),true);
   	}
    
    
    @Test(priority=601118)
   	public  static void checkSNarrationWithVendorAAccountinPVVATViewEntryPageInAuthoriseUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkSNarrationWithVendorAAccountinPVVATViewEntryPageInAuthoriseUser(),true);
   	}
    
    @Test(priority=601119)//Expected Fail As Snarration txt Filed is  Not Updating
   	public  static void checkSNarrationWithVendorBAccountinPVVATViewEntryPageOfAuthoriseUser() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkSNarrationWithVendorBAccountinPVVATViewEntryPageOfAuthoriseUser(),true);
   	}
    
    @Test(priority=601120)//Lpogout From USerAllOptions
   	public  static void checkSignOutFromFromAuthoriseUSer() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkSignOutFromFromAuthoriseUSer(),true);
   	}
    
    @Test(priority=601121)
   	public  static void checkLoginIntoSu() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
   	{
   		svp=new SmokeVouchersInitialPage(getDriver());
   		Assert.assertEquals(svp.checkLoginIntoSu(),true);
   	}
   
   
    @Test(priority=601122)
  	public  static void checkCreatingVoucherinPvVatView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkCreatingVoucherinPvVatView(),true);
  	}
     
    
    @Test(priority=601123)
  	public  static void checkSavedVoucherInPurchaseOrderAfterSavingVoucherInPVVATView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkSavedVoucherInPurchaseOrderAfterSavingVoucherInPVVATView(),true);
  	}
    
    
   
    @Test(priority=601124)
  	public  static void checkSavedVoucherInPurchaseOrder() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkSavedVoucherInPurchaseOrder(),true);
  	}
   
    @Test(priority=601125)
  	public  static void checkCreatingVoucherinPvVatViewWithVendorB() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkCreatingVoucherinPvVatViewWithVendorB(),true);
  	}
     
    
    @Test(priority=601126)
  	public  static void checkVoucherListInPurchaseOrderAfterSavingVoucherInPVVATViewWithVendorA() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkVoucherListInPurchaseOrderAfterSavingVoucherInPVVATViewWithVendorA(),true);
  	}
    
   
    @Test(priority=601127)
  	public  static void checkEditinginPvvAtView() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditinginPvvAtView(),true);
  	}
  	 
    
    @Test(priority=601128)
  	public  static void checkVoucherListInPurchaseOrderAfterEditinginPVVATVIEW() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkVoucherListInPurchaseOrderAfterEditinginPVVATVIEW(),true);
  	}
    
    @Test(priority=601129)
  	public  static void checkEditinginPurchaseOrderVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkEditinginPurchaseOrderVoucher(),true);
  	}
    
    
    @Test(priority=601130)
  	public  static void checkSavingPurchaseVoucherNWithPurchaseOSrderLinks() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new SmokeVouchersInitialPage(getDriver());
  		Assert.assertEquals(svp.checkSavingPurchaseVoucherNWithPurchaseOrderLinks(),true);
  	}
*/    
   
      
}
