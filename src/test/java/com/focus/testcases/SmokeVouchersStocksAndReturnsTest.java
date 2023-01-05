package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.SmokeVouchersStocksAndReturnsPage;
import com.focus.Pages.VouchersInwardPage;
import com.focus.base.BaseEngine;

public class SmokeVouchersStocksAndReturnsTest extends BaseEngine
{
	
	SmokeVouchersStocksAndReturnsPage vsrp;

    // Stock Transfer Starts From Here
	
	@Test(priority=628)
	public void checkLoginToStockTransferAndReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	   vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
		Assert.assertEquals(vsrp.checkLoginToStockTransferAndReturns(), true);
	   
	}

	@Test(priority=629)
	public void checkSettingBinandWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	   vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
		Assert.assertEquals(vsrp.checkSettingBinandWarehouse(), true);
	   
	}
	
	
   
    @Test(priority=630)
   	public void checkStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucher(), true);
   	}
   
    @Test(priority=631)
   	public void checkStockTransferHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferHomePage(), true);
   	}
    
    @Test(priority=632)
   	public void checkStockTransferEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferEntryPage(), true);
   	}
    
 
    @Test(priority=633)
   	public void checkStockTransferEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferEntryPageHeaderFields(), true);
   	}
    
    @Test(priority=634)
   	public void checkStockTransferIssueReceiptDropdownHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferIssueReceiptDropdownHeaderFields(), true);
   	   
   	}
    
    @Test(priority=635)
   	public void checkStockTransferNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferNewEntryPageBodyFields(), true);
   	   
   	}
    
    @Test(priority=636)
   	public void checkStockTransferEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferEntryPageFooterFields(), true);
   	   
   	}
    
    //Stock Transfer Voucher Info Panel Starts from here
    
    
  
    @Test(priority=638)
    public void checkStockTransferVoucherEntryPageInfoSideBarCustomizeBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherEntryPageInfoSideBarCustomizeBtn(), true);
   	}
    
    @Test(priority=639)
   	public void checkStockTransferVoucherEntryPageInfoSideBarGraphOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherEntryPageInfoSideBarGraphOption(), true);
   	}
    
    @Test(priority=640)
   	public void checkStockTransferVoucherEntryPageInfoSideBarReportOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherEntryPageInfoSideBarReportOption(), true);
   	}
    
    @Test(priority=641)
   	public void checkStockTransferVoucherEntryPageInfoSideBarInfoPanelOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherEntryPageInfoSideBarInfoPanelOption(), true);
   	}
    
    @Test(priority=642)
   	public void checkStockTransferVoucherEntryPageInfoSideBarWorkFlowOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherEntryPageInfoSideBarWorkFlowOption(), true);
   	}
    

    @Test(priority=643)
   	public void checkStockTransferVoucherEntryPageInfoSideBarOtherDashletsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherEntryPageInfoSideBarOtherDashletsOption(), true);
   	}
    
    @Test(priority=644)
   	public void checkStockTransferVoucherEntryPageInfoSideBarSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherEntryPageInfoSideBarSearch(), true);
   	}
    
   
    @Test(priority=646)
   	public void checkStockTransferVoucherSaveInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherSaveInfoPanelDashlet(), true);
   	}
    
   
    //Stock Transfer Voucher Info Panel

    @Test(priority=647)
   	public void checkStockTransferSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferSaveWithoutMandatoryFields(), true);
   	}
    
    
    @Test(priority=648)
   	public void checkStockTransferVoucherDateLessThanAccountingDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherDateLessThanAccountingDate(), true);
   	   
   	}
    
   
    
    @Test(priority=650)
   	public void checkStockTransferVoucherHeaderWarehouseOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherHeaderWarehouseOptions(), true);
   	   
   	}
   
    @Test(priority=651)
   	public void checkStockTransferVoucherSavingWithEmptyRows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherSavingWithEmptyRows(), true);
   	   
   	}
    
    
    @Test(priority=652)//Issue Error Message is Not Displaying 
   	public void checkStockTransferVoucherBodyWarehouse2OptionsAndInputHeaderAndBodyWithSameWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherBodyWarehouse2OptionsAndInputHeaderAndBodyWithSameWarehouse(), true);
   	   
   	}
    
    @Test(priority=653)
   	public void checkStockTransferVoucherBodyItemOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherBodyItemOptions(), true);
   	   
   	}
    
    @Test(priority=654)
   	public void checkStockTransferVoucherSelectingHYDInHeaderWarehouseandSTWHWarehouseFromBodyWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferVoucherSelectingHYDInHeaderWarehouseandSTWHWarehouseFromBodyWarehouse(), true);
   	   
   	}
  
    @Test(priority=656)
   	public void checkSavingStockTransferWithStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingStockTransferWithStockItem(), true);
   	   
   	}
    
   
  
    @Test(priority=657) 
   	public void checkSavedStockTransferVoucherOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavedStockTransferVoucherOnPreviousOption(), true);
   	   
   	}
    
    @Test(priority=658)
   	public void checkChangingQtyOfStockItemGreaterThanAvailableQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkChangingQtyOfStockItemGreaterThanAvailableQty(), true);
   	   
   	}
    
    @Test(priority=659)
   	public void checkSavingStockTransferWithStockItemWithDecreasingQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingStockTransferWithStockItemWithDecreasingQty(), true);
   	   
   	}
    
    @Test(priority=660) 
   	public void checkSavedStockTransferVoucherAfterEditingOnPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavedStockTransferVoucherAfterEditingOnPrevious(), true);
   	   
   	}

   
 
    @Test(priority=662)
   	public void checkSavedVoucherAndEntryPageSuspendOptionAndSuspendStatusInHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavedVoucherAndEntryPageSuspendOptionAndSuspendStatusInHomePage(), true);
   	   
   	}
    
    @Test(priority=663)
   	public void checkSavingSuspendStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSuspendStockTransferVoucher(), true);
   	   
   	}
   
    
    @Test(priority=667)
   	public void checkStockTransferAfterChangingInventorySettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferAfterChangingInventorySettings(), true);
   	   
   	}
  
    @Test(priority=668)
   	public void checkSuspendStockTransferVoucherFromHomePageAndDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSuspendStockTransferVoucherFromHomePageAndDeleteOption(), true);
   	   
   	}
    
      

    @Test(priority=669) //
   	public void checkSavingStockTransferVoucherWithBRCOGSItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingStockTransferVoucherWithBRCOGSItem(), true);
   	   
   	}
    

    @Test(priority=670)
   	public void checkBatchPopupAfterVoucherTotalConsumed() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkBatchPopupAfterVoucherTotalConsumed(), true);
   	   
   	}
    
    
    @Test(priority=671) // sum
   	public void checkFIFoCogsItemWithBinOutwardPopUpinStocktransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkFIFoCogsItemWithBinOutwardPopUpinStocktransfer(), true);
   	   
   	}
    
    @Test(priority=672) // sum
   	public void checkFIFoCogsItemWithBinInwardPopUpinStocktransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkFIFoCogsItemWithBinInwardPopUpinStocktransfer(), true);
   	   
   	}
    
    
    @Test(priority=673)
   	public void checkFIFoCogsItemAfterTotalConsumed() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkFIFoCogsItemAfterTotalConsumed(), true);
   	   
   	}
    
    @Test(priority=674)
   	public void checkEditingFIFoCogsItemAfterTotalConsumed() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkEditingFIFoCogsItemAfterTotalConsumed(), true);
   	   
   	}
    
    @Test(priority=675)
   	public void checkWACogsItemInStocktransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkWACogsItemInStocktransfer(), true);
   	   
   	}
    
    @Test(priority=676)
   	public void checkWACogsItemAfterTotalConsumedInStocktransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkWACogsItemAfterTotalConsumedInStocktransfer(), true);
   	   
   	}
    
    @Test(priority=677)
   	public void checkSavingVoucherWithAllItemsInStockTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingVoucherWithAllItemsInStockTransfer(), true);
   	   
   	}
    
    
    @Test(priority=678)
   	public void checkSavedStockTransferVoucherWithAllItemsOnPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavedStockTransferVoucherWithAllItemsOnPrevious(), true);
   	   
   	}
    

    @Test(priority=679)//Issue
   	public void checkStockTransferEntryPageCopyAndPasteFromClipBoardOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockTransferEntryPageCopyAndPasteFromClipBoardOption(), true);
   	   
   	}
    

    @Test(priority=680)
   	public void checkSelectingWarehouseFromBodyInStockTransferAndClickOnSaveAlongWithSuspendCheck() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSelectingWarehouseFromBodyInStockTransferAndClickOnSaveAlongWithSuspendCheck(), true);
   	   
   	}
    

    @Test(priority=681)
   	public void checkCopyDocumentScreenOptionsInStockTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkCopyDocumentScreenOptionsInStockTransfer(), true);
   	   
   	}
    
    @Test(priority=682)
   	public void checkFirstRowCheckboxInCopyDocumentInStockTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkFirstRowCheckboxInCopyDocumentInStockTransfer(), true);
   	   
   	}
    
    
    @Test(priority=683)//Issue
   	public void checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInstockTransfer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInstockTransfer(), true);
   	   
   	}
    
    
    
    @Test(priority=684)
   	public void checkSavingStockTransferVoucherAfterCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingStockTransferVoucherAfterCopyDocument(), true);
   	   
   	}
    
    
    
    //Complete Of Stock Transfer 
    
    //Sales Order
    
    @Test(priority=685)
   	public void checkStockItemInSTWHToReserveInSalesOrders() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockItemInSTWHToReserveInSalesOrders(), true);
   	   
   	}
    
    @Test(priority=686)
   	public void checkStockReservationToVerifyPickForSTWHStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockReservationToVerifyPickForSTWHStockItem(), true);
   	   
   	}
    
    @Test(priority=687)
   	public void checkStockItemInSTWHAfterConsumingInPreviousRowAndFullConsumeInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkStockItemInSTWHAfterConsumingInPreviousRowAndFullConsumeInSecondRow(), true);
   	   
   	}
    
    @Test(priority=688)
   	public void checkSavingSalesOrderVoucherWithReservationBATCHItemSTWH() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSalesOrderVoucherWithReservationBATCHItemSTWH(), true);
   	   
   	}
    
  @Test(priority=689)
   	public void checkSavingSalesOrderVoucherWithReservationWithFIFOCOGSITEM() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSalesOrderVoucherWithReservationWithFIFOCOGSITEM(), true);
   	}
  
    @Test(priority=690)
   	public void checkSavingSalesOrderVoucherWithReservationWithWACOGSITEM() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSalesOrderVoucherWithReservationWithWACOGSITEM(), true);
   	}
    
    @Test(priority=691)
   	public void checkSavingSalesOrderWithAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSalesOrderWithAllItems(), true);
   	}
    
    @Test(priority=692)
   	public void checkSuspendOptionInSalesOrdersVoucherWithTransferedStock() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSuspendOptionInSalesOrdersVoucherWithTransferedStock(), true);
   	}
    
    @Test(priority=693)
   	public void checkSavingSuspendedVoucherInSalesOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSuspendedVoucherInSalesOrder(), true);
   	}
    
	

	
	// Sales Order Releasing in SAles Invoice VAT 

    @Test(priority=694)
   	public void checkReleasingItemInSAlesInvoiceVatThoughSalesOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkReleasingItemInSAlesInvoiceVatThoughSalesOrder(), true);
   	}
    
    @Test(priority=695)
   	public void checkSalesInvoiceVATVoucherInformationDisplayAfterSelectLinksThroughSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesInvoiceVATVoucherInformationDisplayAfterSelectLinksThroughSearch(), true);
   	}
    
    @Test(priority=696)
   	public void checkSuspendVoucherInSalesInvoiceVATWhichSavedWithLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSuspendVoucherInSalesInvoiceVATWhichSavedWithLinks(), true);
   	}
    
    
    
	@Test(priority=697)
   	public void checkSalesOrderLinksInSalesInvoiceVATAfterSuspendingConsumedVoucherWitkLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesOrderLinksInSalesInvoiceVATAfterSuspendingConsumedVoucherWitkLinks(), true);
   	}
    
	@Test(priority=698)
   	public void checkSavingSuspendedVoucherInSalesInvoiceVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSuspendedVoucherInSalesInvoiceVAT(), true);
   	}
	
	@Test(priority=699)
   	public void checkSalesOrderLinksInSalesInvoiceVATAfterReSavingSuspendingConsumedVoucherWitkLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesOrderLinksInSalesInvoiceVATAfterReSavingSuspendingConsumedVoucherWitkLinks(), true);
   	}
   	
   	
    
    
 // Sales return Starts from Here
    
	
    @Test(priority=760) 
   	public void checkSalesReturnsVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsVoucher(), true);
   	   
   	}
    
    
    @Test(priority=761) 
   	public void checkSalesReturnsHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsHomePage(), true);
   	   
   	}

    @Test(priority=762) 
   	public void checkSalesReturnsEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsEntryPage(), true);
   	   
   	}


    @Test(priority=763) 
   	public void checkSalesReturnsEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsEntryPageHeaderFields(), true);
   	   
   	}
    
    
    @Test(priority=764) 
   	public void checkSalesReturnsEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsEntryPageBodyFields(), true);
   	   
   	}
    
    @Test(priority=765) 
   	public void checkSalesReturnsEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsEntryPageFooterFields(), true);
   	   
   	}
    
    
    //Sales Returns Voucher Info Panel Starts from here
    

    @Test(priority=766)
    public void checkSalesReturnsVoucherEntryPageInfoSideBar() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherEntryPageInfoSideBar(), true);
    }
      
    @Test(priority=767)
    public void checkSalesReturnsVoucherEntryPageInfoSideBarCustomizeBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherEntryPageInfoSideBarCustomizeBtn(), true);
    }
      
    @Test(priority=768)
    public void checkSalesReturnsVoucherEntryPageInfoSideBarGraphOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherEntryPageInfoSideBarGraphOption(), true);
    }
      
    @Test(priority=769)
    public void checkSalesReturnsVoucherEntryPageInfoSideBarReportOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherEntryPageInfoSideBarReportOption(), true);
    }
      
    @Test(priority=770)
    public void checkSalesReturnsVoucherEntryPageInfoSideBarInfoPanelOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherEntryPageInfoSideBarInfoPanelOption(), true);
    }
      
    @Test(priority=771)
    public void checkSalesReturnsVoucherEntryPageInfoSideBarWorkFlowOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherEntryPageInfoSideBarWorkFlowOption(), true);
    }
      

    @Test(priority=772)
    public void checkSalesReturnsVoucherEntryPageInfoSideBarOtherDashletsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherEntryPageInfoSideBarOtherDashletsOption(), true);
    }
    
    @Test(priority=773)
    public void checkSalesReturnsVoucherEntryPageInfoSideBarSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherEntryPageInfoSideBarSearch(), true);
    }
      
    @Test(priority=774)
    public void checkSalesReturnsVoucherInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherInfoPanelDashlet(), true);
    }

      
    @Test(priority=775)
    public void checkSalesReturnsVoucherSaveInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherSaveInfoPanelDashlet(), true);
    }
      
    //Sales returns Voucher Info Panel
    
    
  
    
    @Test(priority=776)
    public void checkSalesReturnsSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsSaveWithoutMandatoryFields(), true);
    }
    
    
    @Test(priority=779)
    public void checkSalesReturnsCustomerOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsCustomerOptions(), true);
    }
    
    @Test(priority=780)
    public void checkSalesReturnsSaveWithCustomerInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsSaveWithCustomerInput(), true);
    }
    
    @Test(priority=781)
    public void checkSalesReturnsDepartmentValues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsDepartmentValues(), true);
    }
    
    @Test(priority=782)
    public void checkSalesReturnsSaveWithDepartmentInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsSaveWithDepartmentInput(), true);
    }
    
    @Test(priority=783)
    public void checkSalesReturnsBodyWarehouseOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsBodyWarehouseOptions(), true);
    }
    
    @Test(priority=784)
    public void checkSalesReturnsVoucherBodyItemOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVoucherBodyItemOptions(), true);
    }
    
    @Test(priority=785)
    public void checkSalesReturnsVouchersEntryPageNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsVouchersEntryPageNew(), true);
    }
   

    @Test(priority=786)
    public void checkSalesReturnsEntryBatchItemInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsEntryBatchItemInFirstRow(), true);
    }
    
    @Test(priority=787)
    public void checkSalesReturnsEntryBinItemInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsEntryBinItemInSecondRow(), true);
    }
    
    @Test(priority=788)
    public void checkSalesReturnsEntryRmaItemInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsEntryRmaItemInThirdRow(), true);
    }
    
    @Test(priority=789)
    public void checkSalesReturnsEntryStockItemInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsEntryStockItemInFourthRow(), true);
    }
    
    
    
    
    
    @Test(priority=791)
    public void checkSavingSalesReturnsWithAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSavingSalesReturnsWithAllItems(), true);
    }
    
    @Test(priority=792)
    public void checkSalesReturnsSavedVoucherWithAllItemsOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSalesReturnsSavedVoucherWithAllItemsOnPreviousOption(), true);
    }
    
    @Test(priority=793)
    public void checkEntryPageSuspendOptionInSalesReturnsVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkEntryPageSuspendOptionInSalesReturnsVoucher(), true);
    }
    
    @Test(priority=794)
    public void checkSuspendStatusInEntryPageAndHomePageOnPreviousOptionSalesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSuspendStatusInEntryPageAndHomePageOnPreviousOptionSalesReturns(), true);
    }
    

    
    @Test(priority=795)
    public void checkCopyDocumentScreenOptionsInSalesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkCopyDocumentScreenOptionsInSalesReturns(), true);
    }
    
    @Test(priority=796)//
    public void checkFirstRowCheckboxInCopyDocumentInSalesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkFirstRowCheckboxInCopyDocumentInSalesReturns(), true);
    }
    
    
    @Test(priority=797) //
    public void checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInSalesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInSalesReturns(), true);
    }
    
    @Test(priority=798)
    public void checkSavingSalesReturnsWithAllItemsThroughCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSavingSalesReturnsWithAllItemsThroughCopyDocument(), true);
    }
    
    @Test(priority=799) 
   	public void checkSalesReturnsVoucherEntryPageDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsVoucherEntryPageDeleteOption(), true);
   	   
   	}
    
    
    @Test(priority=800) 
   	public void checkSalesReturnsVoucherCancelButtonInAlertOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsVoucherCancelButtonInAlertOnDelete(), true);
   	   
   	}
    
    
    @Test(priority=801) 
   	public void checkSalesReturnsVoucherOkButtonInAlertOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsVoucherOkButtonInAlertOnDelete(), true);
   	   
   	}
   	
   

    @Test(priority=802) //
   	public void checkSalesReturnsVoucherCopyAndPasteFromClipBoardOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsVoucherCopyAndPasteFromClipBoardOptions(), true);
   	   
   	}
    
    
    @Test(priority=803) 
   	public void checkSavingSalesReturnsWithAllItemsThroughCopyAndPasteFromClipBoard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSalesReturnsWithAllItemsThroughCopyAndPasteFromClipBoard(), true);
   	   
   	}
    
    @Test(priority=804) 
   	public void checkSalesReturnsSavedVoucherThroughCopyAndPasteFromClipBoardWithAllItemsOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSalesReturnsSavedVoucherThroughCopyAndPasteFromClipBoardWithAllItemsOnPreviousOption(), true);
   	   
   	}
    
    @Test(priority=805) //
   	public void checkEditingSalesReturnsVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkEditingSalesReturnsVoucher(), true);
   	   
   	}
    
    
    @Test(priority=806) 
   	public void checkUpdatingSavedSalesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkUpdatingSavedSalesReturns(), true);
   	   
   	}
    
    @Test(priority=807) 
   	public void checkUpdatedSalesReturnVoucherOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkUpdatedSalesReturnVoucherOnPreviousOption(), true);
   	   
   	}
    
    
  
    
    // Sales Orders After Sales Returns
    
  
   
    @Test(priority=808) 
   	public void checkSavingSalesOrderVoucherAfterSalesReturnsWithAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSalesOrderVoucherAfterSalesReturnsWithAllItems(), true);
   	   
   	}
    
   
    
    @Test(priority=809) 
   	public void checkSuspendingSalesOrderVoucherAfterSalesReturnOnPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSuspendingSalesOrderVoucherAfterSalesReturnOnPrevious(), true);
   	   
   	}
    
    @Test(priority=810) 
   	public void checkSavingSalesOrderVoucherAfterSuspendPreviousvoucherAfterSalesReturn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingSalesOrderVoucherAfterSuspendPreviousvoucherAfterSalesReturn(), true);
   	   
   	}
    
    
    // Sales Invoice After Sales Returns
    
    
    
    @Test(priority=811) 
   	public void checkReleaseAfterSalesReturnsThroughReserveLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkReleaseAfterSalesReturnsThroughReserveLinks(), true);
   	   
   	}
    
    
    @Test(priority=812) 
   	public void checkSuspendingSalesInvoiceVoucherAfterSalesReturnOnPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSuspendingSalesInvoiceVoucherAfterSalesReturnOnPrevious(), true);
   	   
   	}
    
    
    
    @Test(priority=813) 
   	public void checkReleaseOnSupendingPreviousVoucherAfterSalesReturnsThroughReserveLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkReleaseOnSupendingPreviousVoucherAfterSalesReturnsThroughReserveLinks(), true);
   	   
   	}
    
   
   
    
    // Purchase Returns Starts From Here
    
    
    @Test(priority=820) 
   	public void checkLinkMappingInDesignWorkFlowForPurchases() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkLinkMappingInDesignWorkFlowForPurchases(), true);
   	   
   	} 
    
   
    @Test(priority=821) 
   	public void checkPurchasesReturnsVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsVoucher(), true);
   	   
   	}
    
    @Test(priority=822) 
   	public void checkPurchasesReturnsHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsHomePage(), true);
   	   
   	}

    @Test(priority=823) 
   	public void checkPurchasesReturnsEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsEntryPage(), true);
   	   
   	}
    


    @Test(priority=824) 
   	public void checkPurchasesReturnsEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsEntryPageHeaderFields(), true);
   	   
   	}
    
    
    @Test(priority=825) 
   	public void checkPurchasesReturnsEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsEntryPageBodyFields(), true);
   	   
   	}
    
    @Test(priority=826) 
   	public void checkPurchasesReturnsEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsEntryPageFooterFields(), true);
   	   
   	}
    
   
    //Purchases Returns Voucher Info Side Bar Starts from here
 

    @Test(priority=827)
    public void checkPurchasesReturnsVoucherEntryPageInfoSideBar() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherEntryPageInfoSideBar(), true);
    }
      
    @Test(priority=828)
    public void checkPurchasesReturnsVoucherEntryPageInfoSideBarCustomizeBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherEntryPageInfoSideBarCustomizeBtn(), true);
    }
      
    @Test(priority=829)
    public void checkPurchasesReturnsVoucherEntryPageInfoSideBarGraphOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherEntryPageInfoSideBarGraphOption(), true);
    }
      
    @Test(priority=830)
    public void checkPurchasesReturnsVoucherEntryPageInfoSideBarReportOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherEntryPageInfoSideBarReportOption(), true);
    }
      
    @Test(priority=831)
    public void checkPurchasesReturnsVoucherEntryPageInfoSideBarInfoPanelOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherEntryPageInfoSideBarInfoPanelOption(), true);
    }
      
    @Test(priority=832)
    public void checkPurchasesReturnsVoucherEntryPageInfoSideBarWorkFlowOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherEntryPageInfoSideBarWorkFlowOption(), true);
    }
      

    @Test(priority=833)
    public void checkPurchasesReturnsVoucherEntryPageInfoSideBarOtherDashletsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherEntryPageInfoSideBarOtherDashletsOption(), true);
    }
    
    @Test(priority=834)
    public void checkPurchasesReturnsVoucherEntryPageInfoSideBarSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherEntryPageInfoSideBarSearch(), true);
    }
      
    @Test(priority=835)
    public void checkPurchasesReturnsVoucherInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherInfoPanelDashlet(), true);
    }

      
    @Test(priority=836)
    public void checkPurchasesReturnsVoucherSaveInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherSaveInfoPanelDashlet(), true);
    }
      
    //Purchases returns Voucher Info Side Bar Ends
    
    
   
   
    @Test(priority=837)
    public void checkPurchasesReturnsSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsSaveWithoutMandatoryFields(), true);
    }
    
    
    @Test(priority=838)
    public void checkPurchasesReturnsVendorOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVendorOptions(), true);
    }
    
    @Test(priority=839)
    public void checkPurchasesReturnsSaveWithVendorInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsSaveWithVendorInput(), true);
    }
    
    
    
    @Test(priority=840)
    public void checkPurchasesReturnsBodyWarehouseOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsBodyWarehouseOptions(), true);
    }
    
    
    @Test(priority=841)
    public void checkPurchasesReturnsVoucherBodyItemOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherBodyItemOptions(), true);
    }
    
    @Test(priority=842)
    public void checkPurchasesReturnsVouchersEntryPageNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsVouchersEntryPageNew(), true);
    }
    
  

  
    @Test(priority=843)
    public void checkPurchasesReturnsEntryBatchItemInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsEntryBatchItemInFirstRow(), true);
    }
    
    
    @Test(priority=844)
    public void checkPurchasesReturnsEntryBinItemInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsEntryBinItemInSecondRow(), true);
    }
    
    
    @Test(priority=845)
    public void checkPurchasesReturnsEntryRmaItemInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsEntryRmaItemInThirdRow(), true);
    }
    
    
    @Test(priority=846)
    public void checkPurchasesReturnsEntryStockItemInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsEntryStockItemInFourthRow(), true);
    }
    
    
    
   
    @Test(priority=847)
    public void checkSavingPurchasesReturnsWithAllItems() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSavingPurchasesReturnsWithAllItems(), true);
    }
    
    
 
    @Test(priority=848)
    public void checkPurchasesReturnsSavedVoucherWithAllItemsOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkPurchasesReturnsSavedVoucherWithAllItemsOnPreviousOption(), true);
    }
    
    
    @Test(priority=849)
    public void checkEntryPageSuspendOptionInPurchasesReturnsVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkEntryPageSuspendOptionInPurchasesReturnsVoucher(), true);
    }
    
    
    @Test(priority=850)
    public void checkSuspendStatusInEntryPageAndHomePageOnPreviousOptionPurchasesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSuspendStatusInEntryPageAndHomePageOnPreviousOptionPurchasesReturns(), true);
    }
    
    
 
 
    @Test(priority=851)
    public void checkCopyDocumentScreenOptionsInPurchasesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkCopyDocumentScreenOptionsInPurchasesReturns(), true);
    }
    
    
    @Test(priority=852)
    public void checkFirstRowCheckboxInCopyDocumentInPurchasesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkFirstRowCheckboxInCopyDocumentInPurchasesReturns(), true);
    }
    
    @Test(priority=853) // Issue
    public void checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInPurchasesReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkLoadingVoucherInformationFromCopyDocumentOnClickOnOkInPurchasesReturns(), true);
    }
    
    
    @Test(priority=854)
    public void checkSavingPurchasesReturnsWithAllItemsThroughCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
    	vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
    	Assert.assertEquals(vsrp.checkSavingPurchasesReturnsWithAllItemsThroughCopyDocument(), true);
    }
    
    
    
    
    @Test(priority=855) 
   	public void checkPurchasesReturnsVoucherEntryPageDeleteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherEntryPageDeleteOption(), true);
   	   
   	}
    
    
    @Test(priority=856) 
   	public void checkPurchasesReturnsVoucherCancelButtonInAlertOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherCancelButtonInAlertOnDelete(), true);
   	   
   	}
    
    
    @Test(priority=857) 
   	public void checkPurchasesReturnsVoucherOkButtonInAlertOnDelete() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherOkButtonInAlertOnDelete(), true);
   	   
   	}

    
    @Test(priority=858) 
   	public void checkPurchasesReturnsVoucherCopyAndPasteFromClipBoardOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkPurchasesReturnsVoucherCopyAndPasteFromClipBoardOptions(), true);
   	   
   	}
    
    
    @Test(priority=859) 
   	public void checkSavingPurchasesReturnsWithAllItemsThroughCopyAndPasteFromClipBoard() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vsrp=new SmokeVouchersStocksAndReturnsPage(getDriver());
   		Assert.assertEquals(vsrp.checkSavingPurchasesReturnsWithAllItemsThroughCopyAndPasteFromClipBoard(), true);
   	   
   	}
   
    
}
