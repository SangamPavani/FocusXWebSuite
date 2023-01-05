package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.OpeningStockPage;
import com.focus.Pages.OpeningStockPage;
import com.focus.base.BaseEngine;

public class OpeningStockTest  extends BaseEngine
{
	
	   static OpeningStockPage osp;

	    @Test(priority=60000)
	  	public void checkSignInToCheckOpeningStocksVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	    	osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkSignInToCheckOpeningStocksVoucher(), true);
	  	}
	    
	    @Test(priority=60001)
		public void checkInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			osp=new OpeningStockPage(getDriver());
			Assert.assertEquals(osp.checkInventoryMenu(), true);
		}
	    
	    @Test(priority=60002)
	  	public void checkTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkTransactionMenuInInventoryMenu(), true);
	  	}
	  	
	    
	    @Test(priority=60003)
	  	public void checkStocksMenuInTransactionMenuInInventoryMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkStocksMenuInTransactionMenuInInventoryMenu(), true);
	  	}
	    
	    @Test(priority=60004) // Link Status
	  	public void checkOpeningStocksNewVoucherDisplayHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherDisplayHomePage(), true);
	  	}
	   
	    
	    //Checking View in Home Page, Create Edit and Delete Option Starts
	    
	    @Test(priority=60005)
	  	public void checkOpeningStocksNewVoucherCreateViewOptionInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherCreateViewOptionInHomePage(), true);
	  	}
	    
	    
	    @Test(priority=60006)
	  	public void checkSaveInCreateViewOfHomePageOfOpeningStocksNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkSaveInCreateViewOfHomePageOfOpeningStocksNew(), true);
	  	}
	    
	    @Test(priority=60007)
	  	public void checkDeleteCreateViewOfHomePageOfOpeningStocksNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkDeleteCreateViewOfHomePageOfOpeningStocksNew(), true);
	  	}
	    
	    @Test(priority=60008) // Link Status
	  	public void checkEditCreateViewOfHomePageOfOpeningStocksNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditCreateViewOfHomePageOfOpeningStocksNew(), true);
	  	}
	       
	    
	   //Checking View in Home Page, Create Edit and Delete Option Stops
	    
	  
	   
	    
	    
	    @Test(priority=60009)
	  	public void checkOpeningStocksNewVoucherHomePageNewOptionOnClickDisplayEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	 		osp=new OpeningStockPage(getDriver());
	 		Assert.assertEquals(osp.checkOpeningStocksNewVoucherHomePageNewOptionOnClickDisplayEntryPage(), true);
	 	}
	    
	    
	    
	    //Checking Entry Page Ribbon Control, Header, Body and Footer Fields Starts
	    
	    @Test(priority=60010)
	  	public void checkOpeningStocksNewVoucherEntryPageRibbonControl() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherEntryPageRibbonControl(), true);
	  	}

	    @Test(priority=60011)
	  	public void checkOpeningStocksNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewEntryPageHeaderFields(), true);
	  	}
	    
	   @Test(priority=60012)
	  	public void checkOpeningStocksNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewEntryPageBodyFields(), true);
	  	}
	    
	    @Test(priority=60013)
	  	public void checkOpeningStocksNewEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewEntryPageFooterFields(), true);
	  	}
	  	
	   //Checking Entry Page Ribbon Control, Header, Body and Footer Fields Stops
	 
	   
	    @Test(priority=60014)
	  	public void checkOpeningStocksNewVoucherDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherDocumentNumber(), true);
	  	}
	   
	    
	   //Checking Adding Warehouse Customization and Deleting the fields Starts
	    
	    @Test(priority=60015)
	  	public void checkOpeningStocksNewVoucherDateIsDisable() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherDateIsDisable(), true);
	  	}
	    
	    @Test(priority=60016)
	  	public void checkOpeningStocksNewSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewSaveWithoutMandatoryFields(), true);
	  	}
	    
	    @Test(priority=60017)
	  	public void checkOpeningStocksNewWareHouseOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewWareHouseOptions(), true);
	  	}
	    
	    /*
	    @Test(priority=60018)
	  	public void checkOpeningStocksNewWarehouseCustomize() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewWarehouseCustomize(), true);
	  	}
	    
	    @Test(priority=60019)
	  	public void checkOpeningStocksNewWarehouseCustomizeStandardFieldOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewWarehouseCustomizeStandardFieldOptions(), true);
	  	}
	    
	    @Test(priority=60020)
	  	public void checkOpeningStocksNewWarehouseCustomizeOnSelectingCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewWarehouseCustomizeOnSelectingCode(), true);
	  	}
	    
	    
	    @Test(priority=60021)
	  	public void checkOpeningStocksNewWarehouseCustomizeDeleteColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewWarehouseCustomizeDeleteColumn(), true);
	  	}
	    
	    @Test(priority=60022)
	  	public void checkOpeningStocksNewWarehouseCustomizationCancel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewWarehouseCustomizationCancel(), true);
	  	}
	    
	    
	    
	  
	    @Test(priority=60023)
	  	public void checkOpeningStocksNewSaveWithoutInputOfBodyRowsColumns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewSaveWithoutInputOfBodyRowsColumns(), true);
	  	}
	    
	    @Test(priority=60024)
	  	public void checkOpeningStocksNewItemCustomize() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewItemCustomize(), true);
	  	}
	    
	    @Test(priority=60025)
	  	public void checkOpeningStocksNewItemCustomizationStandardFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewItemCustomizationStandardFields(), true);
	  	}
	    
	    @Test(priority=60026)
	  	public void checkOpeningStocksNewItemCustomizationAddBalanceColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewItemCustomizationAddBalanceColumn(), true);
	  	}
	    */
	    @Test(priority=60027)
	  	public void checkOpeningStocksNewVouchersEntryPageNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVouchersEntryPageNew(), true);
	  	}
	    
	   
	    
	    @Test(priority=60028)
	  	public void checkOpeningStocksNewBodyRowsItemColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewBodyRowsItemColumn(), true);
	  	}
	    
	    @Test(priority=60029)
	  	public void checkOpeningStocksNewVoucherBodyRowUnitsColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherBodyRowUnitsColumn(), true);
	  	}
	    
	    @Test(priority=60030)
	  	public void checkOpeningStocksNewSaveVoucherWithoutBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewSaveVoucherWithoutBatch(), true);
	  	}
	    
	    @Test(priority=60031)
	  	public void checkOpeningStocksNewSaveDataWithoutExpiryDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewSaveDataWithoutExpiryDate(), true);
	  	}
	    
	    @Test(priority=60032)
	  	public void checkOpeningStocksNewVoucherBRItemInputBodyDataInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherBRItemInputBodyDataInFirstRow(), true);
	  	}
	    
	    
	    @Test(priority=60033)
	  	public void checkOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow(), true);
	  	}
	    
	    @Test(priority=60034)
	  	public void checkOpeningStocksNewVoucherInputBinFifoBinPopupOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherInputBinFifoBinPopupOptions(), true);
	  	}
	    
	  
	    
	 
	    @Test(priority=60035)
	  	public void checkSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk(), true);
	  	}
	    
	    @Test(priority=60036)
	  	public void checkOpeningStocksAddingDataInThirdRowForBinCheking() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksAddingDataInThirdRowForBinCheking(), true);
	  	}
	    
	    @Test(priority=60037)
	  	public void checkOpeningStocksAddingBinInThridRowAutoAllocateInBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksAddingBinInThridRowAutoAllocateInBin(), true);
	  	}
	    
	    @Test(priority=60038)
	  	public void checkOpeningStocksNewAddingDataInFourthRowForBinCheking() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewAddingDataInFourthRowForBinCheking(), true);
	  	}
	    
	    @Test(priority=60039)
	  	public void checkOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen(), true);
	  	}
	    
	    @Test(priority=60040)//
	  	public void checkOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow(), true);
	  	}
	        
	    @Test(priority=60041)
	  	public void checkOpeningStocksNewDeleteRowBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewDeleteRowBin(), true);
	  	}
	    
	    @Test(priority=60042)
	  	public void checkOpeningStocksNewBinQuantityAfterAlocatingAndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewBinQuantityAfterAlocatingAndDeleting(), true);
	  	}
	   
	    @Test(priority=60043)
	  	public void checkOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty(), true);
	  	}
	    
	    @Test(priority=60044)
	  	public void checkOpeningStocksNewVoucherWithInputingThroughAllocateQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherWithInputingThroughAllocateQty(), true);
	  	}
	   
	    
	    @Test(priority=60045)
	  	public void checkOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow(), true);
	  	}
	    
	    @Test(priority=60046)
	  	public void checkOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow(), true);
	  	}
	    
	    @Test(priority=60047)
	  	public void checkOpeningStocksNewVoucherConsumeFullCapacityInFifthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherConsumeFullCapacityInFifthRow(), true);
	  	}
	    
	    @Test(priority=60048)
	  	public void checkOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows(), true);
	  	}
	    
	    
	    @Test(priority=60049)
	  	public void checkOpeningStocksNewVoucherWithRMAUnitsAndMandatoryMessageInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherWithRMAUnitsAndMandatoryMessageInThirdRow(), true);
	  	}
	    
	    @Test(priority=60050)
	  	public void checkOpeningStocksNewVoucherRmaWithZeroQuantity() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherRmaWithZeroQuantity(), true);
	  	}
	    
	    @Test(priority=60051)
	  	public void checkRMAPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkRMAPopupScreen(), true);
	  	}
	    
	    @Test(priority=60052)
	  	public void checkAddButtonInRmaPageWithSelectingSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkAddButtonInRmaPageWithSelectingSerialNumbers(), true);
	  	}
	       
	    @Test(priority=60053)
	  	public void checkOKButtonInRmaPageWithoutSelectingSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOKButtonInRmaPageWithoutSelectingSerialNumbers(), true);
	  	}
	    
	    @Test(priority=60054)
	  	public void checkCancelButtonInRmaPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkCancelButtonInRmaPage(), true);
	  	}
	    
	    @Test(priority=60055)// only two rma rows are displaying 
	  	public void checkRmaPageWithSelectingPartialSerialNumberLessThanInputedQtyInVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkRmaPageWithSelectingPartialSerialNumberLessThanInputedQtyInVoucher(), true);
	  	}
	    
	    @Test(priority=60056)//
	  	public void checkOkButtonInRmaPageWithSelectionOfPartialSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOkButtonInRmaPageWithSelectionOfPartialSerialNumbers(), true);
	  	}
	    
	    @Test(priority=60057)
	  	public void checkClearButtonInRmaRowSerialNumberRmaPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkClearButtonInRmaRowSerialNumberRmaPage(), true);
	  	}
	    
	    @Test(priority=60058)
	  	public void checkClearButtonInRmaPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkClearButtonInRmaPage(), true);
	  	}

	    @Test(priority=60059)
	  	public void checkInputTheDuplicateSerialNumbersIsAllowingInRmaPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkInputTheDuplicateSerialNumbersIsAllowingInRmaPage(), true);
	  	}

	    @Test(priority=60060)
	  	public void checkInputSerialNumbersIsAllowingGreaterThanInputVoucherQuantity() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkInputSerialNumbersIsAllowingGreaterThanInputVoucherQuantity(), true);
	  	}
	    
	    @Test(priority=600561)
	  	public void checkInputingDifferentSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkInputingDifferentSerialNumbers(), true);
	  	}
	    
	    @Test(priority=600562)
	  	public void checkNewItemWithSameSerialNos() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkNewItemWithSameSerialNos(), true);
	  	}
	    
	    @Test(priority=600563)
	  	public void checkSavingVoucherByChangingVoucherQuantitySerialNumbersSame() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkSavingVoucherByChangingVoucherQuantitySerialNumbersSame(), true);
	  	}
	    
	    @Test(priority=600564)
	  	public void checkInputingSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkInputingSerialNumbers(), true);
	  	}
	    
	    @Test(priority=600565)
	  	public void checkOpeningStocksNewAddingStockItemInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewAddingStockItemInFourthRow(), true);
	  	}

	    @Test(priority=600566)
	  	public void checkOpeningStocksNewVoucherSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherSave(), true);
	  	}
	  
	   
	   
	    @Test(priority=600567)
	  	public void checkOpeningStocksNewSavedVoucherOnClickPreviousInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewSavedVoucherOnClickPreviousInEntryPage(), true);
	  	}
	     
	    @Test(priority=600568)
	  	public void checkOpeningStocksNewVoucherOnClickCloseBtnInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherOnClickCloseBtnInEntryPage(), true);
	  	}
	    
	   
	   
	    @Test(priority=600569)
	  	public void checkOpeningStocksNewVoucherOnClickEditButtonInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherOnClickEditButtonInHomePage(), true);
	  	}
	     
	    @Test(priority=600570)
	  	public void checkEditOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherBinsFifoInputWithoutBinSecondRow(), true);
	  	}
	    
	    @Test(priority=600571)
	  	public void checkEditOpeningStocksNewVoucherInputBinFifoBinPopupOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherInputBinFifoBinPopupOptions(), true);
	  	}
	    
	    
	    @Test(priority=600572)
	  	public void checkEditVoucherSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditVoucherSelectingBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk(), true);
	  	}
	    
	    
	    @Test(priority=600573)//
	  	public void checkEditOpeningStocksAddingDataInThirdRowForBinCheking() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksAddingDataInThirdRowForBinCheking(), true);
	  	}
	    
	    
	    @Test(priority=600574)//
	  	public void checkEditOpeningStocksAddingBinInThridRowAutoAllocateInBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksAddingBinInThridRowAutoAllocateInBin(), true);
	  	}
	    
	   
	    @Test(priority=600575)//
	  	public void checkEditOpeningStocksNewAddingDataInFourthRowForBinCheking() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewAddingDataInFourthRowForBinCheking(), true);
	  	}
	    
	    @Test(priority=600576)//
	  	public void checkEditOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherByInputBinColumnManuallyInBinScreen(), true);
	  	}
	    
	    
	    @Test(priority=600577)//
	  	public void checkEditOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewBinValuesForPreviousRowBinAfterAllocatingCurrentBinRow(), true);
	  	}
	    
	    @Test(priority=600578)
	  	public void checkEditOpeningStocksNewDeleteRowBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewDeleteRowBin(), true);
	  	}
	    
	    @Test(priority=600579)//
	  	public void checkEditOpeningStocksNewBinQuantityAfterAlocatingAndDeleting() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewBinQuantityAfterAlocatingAndDeleting(), true);
	  	}
	    
	   
	    @Test(priority=600580)
	  	public void checkEditOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherWithInputingAllocateQtyMoreThanAvailableQty(), true);
	  	}
	    
	    @Test(priority=600581)//
	  	public void checkEditOpeningStocksNewVoucherWithInputingThroughAllocateQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherWithInputingThroughAllocateQty(), true);
	  	}
	    
	    @Test(priority=600582)
	  	public void checkEditOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherBinAutoAllocationForBinSplittingInThirdRow(), true);
	  	}
	    
	    @Test(priority=600583)
	  	public void checkEditOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherBinWithManualInputQtyInBinPopForBinSplittingInThirdRow(), true);
	  	}
	    
	    @Test(priority=600584)//
	  	public void checkEditOpeningStocksNewVoucherConsumeFullCapacityInFifthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherConsumeFullCapacityInFifthRow(), true);
	  	}
	    
	   
	    @Test(priority=600585)
	  	public void checkEditOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherBinPopUpValuesAfterFullQtyConsumeinPreviousRows(), true);
	  	}
	    
	    
	    
	    @Test(priority=600586)
	  	public void checkOpeningStocksNewVoucherAlertAndOKButtonInRevertChanges() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherAlertAndOKButtonInRevertChanges(), true);
	  	}
	    
	    @Test(priority=600587)
	  	public void checkOpeningStocksNewVoucherOnClickOnRevertChanges() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherOnClickOnRevertChanges(), true);
	  	}
	    
	  
	    @Test(priority=600588)
	  	public void checkOpeningStocksNewVoucherEditByUpdatingBRCOGSAndNoBatchInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherEditByUpdatingBRCOGSAndNoBatchInFirstRow(), true);
	  	}
	    
	    @Test(priority=600589)
	  	public void checkOpeningStocksNewEditAndUpdateBatchNoWithoutExpiryDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewEditAndUpdateBatchNoWithoutExpiryDate(), true);
	  	}
	   
	    @Test(priority=600590)//
	  	public void checkOpeningStocksNewVoucherEditByUpdateExpiryDateInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherEditByUpdateExpiryDateInFirstRow(), true);
	  	}
	    
	    @Test(priority=600591)//
	  	public void checkEditAndUpdateBinBySelectingOtherBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditAndUpdateBinBySelectingOtherBinThroughDoubleClickAndCheckBinColumnInVoucherOnClickOnOk(), true);
	  	}
	    
	    
	    @Test(priority=600592)
	  	public void checkEditOpeningStocksNewVoucherRMAItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherRMAItemQtyUpdate(), true);
	  	}
	    
	    @Test(priority=600593)
	  	public void checkEditOpeningStocksNewVoucherRMAPopUpOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherRMAPopUpOnRmaItemQtyUpdate(), true);
	  	}
	    
	    @Test(priority=600594)
	  	public void checkEditOpeningStocksNewVoucherRMAAddButtonOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherRMAAddButtonOnRmaItemQtyUpdate(), true);
	  	}
	    
	    @Test(priority=600595)
	  	public void checkEditOpeningStocksNewVoucherRMAOkButtonOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherRMAOkButtonOnRmaItemQtyUpdate(), true);
	  	}
	    
	    @Test(priority=600596)
	  	public void checkEditOpeningStocksNewVoucherRMAClearButtonOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherRMAClearButtonOnRmaItemQtyUpdate(), true);
	  	}
	    
	    @Test(priority=600597)
	  	public void checkEditOpeningStocksNewVoucherAddingNewSerialNumbersOnRmaItemQtyUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewVoucherAddingNewSerialNumbersOnRmaItemQtyUpdate(), true);
	  	}
	    
	    @Test(priority=600598)
	  	public void checkEditOpeningStocksNewStockItemInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkEditOpeningStocksNewStockItemInFourthRow(), true);
	  	}
	    
	    
	    
	   
	    @Test(priority=600599)
	  	public void checkOpeningStocksNewUpdateVoucherOnClickPreviousInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewUpdateVoucherOnClickPreviousInEntryPage(), true);
	  	}
	    
	    
	    @Test(priority=600600)
	  	public void checkOpeningStocksNewVoucherCopyAndPasteFromClipBoardOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherCopyAndPasteFromClipBoardOptions(), true);
	  	}
	    
	    @Test(priority=600601)//
	  	public void checkOpeningStocksNewVoucherInputBatchAndBinPopupOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherInputBatchAndBinPopupOptions(), true);
	  	}
	    
	    @Test(priority=600602)
	  	public void checkOpeningStocksNewVoucherCopyAndPasteThroughAllocateQtyInBinPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherCopyAndPasteThroughAllocateQtyInBinPage(), true);
	  	}
	    
	    @Test(priority=600603)
	  	public void checkOpeningStocksNewSaveInputRMAPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewSaveInputRMAPopupScreen(), true);
	  	}
	    
	    
	    @Test(priority=600604)
	  	public void checkOpeningStocksNewOkButtonRMAPopupScreenBatchBinAndRmaColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewOkButtonRMAPopupScreenBatchBinAndRmaColumn(), true);
	  	}
	    
	    @Test(priority=600605)
	  	public void checkOpeningStocksNewVoucherSaveThroughCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherSaveThroughCopyDocument(), true);
	  	}
	  	
	  	
	    
	    //COPY DOCUMENT
	    
	    @Test(priority=600606)
	  	public void checkOpeningStocksNewSaveVoucherThroughCopyAndPasteFromVClipboardOnClickPreviousInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewSaveVoucherThroughCopyAndPasteFromVClipboardOnClickPreviousInEntryPage(), true);
	  	}
	    
	    
	    @Test(priority=600607)
	  	public void checkOpeningStocksNewVoucherToDeleteOnClickOkButtonInAlertMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherToDeleteOnClickOkButtonInAlertMessage(), true);
	  	}
	       
	    
	    @Test(priority=600608)
	  	public void checkOpeningStocksNewCopyDocumentOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewCopyDocumentOption(), true);
	  	}
	    
	    @Test(priority=600609)
	  	public void checkOpeningStocksNewCopyDocumentScreenOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewCopyDocumentScreenOptions(), true);
	  	}
	    
	    @Test(priority=600610) // Newly Checkbox Displying on POP up of CD
	  	public void checkOpeningStocksNewFirstRowCheckboxInCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewFirstRowCheckboxInCopyDocument(), true);
	  	}
	    
	    
	    @Test(priority=600611)
	  	public void checkLoadingVoucherInformationFromCopyDocumentOnClickOnOk() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkLoadingVoucherInformationFromCopyDocumentOnClickOnOk(), true);
	  	}
	   
	    
	    @Test(priority=600612)
	  	public void checkSavingVoucherByCopyDocumentWithMandatoryCheck() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkSavingVoucherByCopyDocumentWithMandatoryCheck(), true);
	  	}
	    
	    @Test(priority=600613)
	  	public void checkOpeningStocksNewVoucherRevertChangeOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherRevertChangeOption(), true);
	  	}
	    
	    @Test(priority=600614)
	  	public void checkOKButtonOnRevertChanges() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOKButtonOnRevertChanges(), true);
	  	}
	    
	    @Test(priority=600615)
	  	public void checkSuspendOptionInOpeningStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkSuspendOptionInOpeningStocks(), true);
	  	}
	    
	    @Test(priority=600616)
	  	public void checkOpeningStocksNewVoucherClickOnSuspendView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherClickOnSuspendView(), true);
	  	}
	    
	    @Test(priority=600617)
	  	public void checkOpeningStocksNewVoucherCloseButtonInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  	{
	  		osp=new OpeningStockPage(getDriver());
	  		Assert.assertEquals(osp.checkOpeningStocksNewVoucherCloseButtonInHomePage(), true);
	  	}
	   
	   
	   
	   
	    
	    
	    
}
