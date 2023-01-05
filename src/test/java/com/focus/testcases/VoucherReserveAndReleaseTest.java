package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.VoucherReserveAndReleasePage;
import com.focus.base.BaseEngine;

public class VoucherReserveAndReleaseTest extends BaseEngine
{
	
   static VoucherReserveAndReleasePage svp;

    @Test(priority=60000)
  	public void checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage(), true);
  	}
    
    
    //Sales Order Voucher Starts
    //Reservations
   
    @Test(priority=601450)
 	public void checkSalesOrderVoucherNewHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherNewHomePage(), true);
  	}
     
    
   
    @Test(priority=601451)
  	public void checkSalesOrderVoucherNewEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPage(), true);
  	}
    
  
    @Test(priority=601452)
  	public void checkSalesOrderVoucherCUstomizationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherCUstomizationOption(), true);
  	}
    
  	
   
    @Test(priority=601453)
  	public void checkSalesOrderVoucherNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageHeaderFields(), true);
  	}
      
    @Test(priority=601454)
 	public void checkSalesOrderVoucherNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageBodyFields(), true);
 	}

    @Test(priority=601455)
 	public void checkSalesOrderVoucherNewEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageFooterFields(), true);
 	}

    @Test(priority=601456)
 	public void checkSalesOrderVoucherNewEntryPageDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageDocumentNumber(), true);
 	}
  
   //Sales Order Info Panel Starts from here
   
    
    //@Test(priority=601457)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBar() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageInfoSideBar(), true);
 	}
  
    //@Test(priority=601458)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarCustomizeBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageInfoSideBarCustomizeBtn(), true);
 	}
  
    //@Test(priority=601459)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarGraphOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageInfoSideBarGraphOption(), true);
 	}
  
    //@Test(priority=601460)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarReportOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageInfoSideBarReportOption(), true);
 	}
  
    //@Test(priority=601461)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarInfoPanelOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageInfoSideBarInfoPanelOption(), true);
 	}
  
    //@Test(priority=601462)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarWorkFlowOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageInfoSideBarWorkFlowOption(), true);
 	}
  

    //@Test(priority=601463)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarOtherDashletsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageInfoSideBarOtherDashletsOption(), true);
 	}
  
   //@Test(priority=601464)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewEntryPageInfoSideBarSearch(), true);
 	}
  
    //@Test(priority=601465)
 	public void checkSalesOrderVoucherNewInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewInfoPanelDashlet(), true);
 	}

  
    //@Test(priority=601466)
 	public void checkSalesOrderVoucherNewSaveInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
    	svp=new VoucherReserveAndReleasePage(getDriver());
 		Assert.assertEquals(svp.checkSalesOrderVoucherNewSaveInfoPanelDashlet(), true);
 	}
   

   //Sales Order Info Panel

   
	@Test(priority=601467)
  	public void checkSalesOrderVoucherNewDateFieldLessThanCompanyAccountingDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherNewDateFieldLessThanCompanyAccountingDate(), true);
  	   
  	}    
  
  	@Test(priority=601468)
  	public void checkSalesOrderVoucherNewSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherNewSaveWithoutMandatoryFields(), true);
  	   
  	}    

    
  	@Test(priority=601469)
  	public void checkSalesOrderVoucherNewCustomerOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherNewCustomerOptions(), true);
  	   
  	} 
    
  	
	@Test(priority=601470)
  	public void checkSalesOrderVoucherNewVouchersEntryPageNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherNewVouchersEntryPageNew(), true);
  	   
  	} 
  	
	@Test(priority=601471)
  	public void checkSavingSalesOrderVoucherNewWithEmptyRows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesOrderVoucherNewWithEmptyRows(), true);
  	   
  	} 
	

	@Test(priority=601473)
  	public void checkSaveSalesOrderVoucherToCheckQtyPreload() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSaveSalesOrderVoucherToCheckQtyPreload(), true);
  	   
  	} 
	
	
	@Test(priority=601474)
  	public void checkSavingSalesOrderVoucherAndCheckReservationScreenWithItemNoStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesOrderVoucherAndCheckReservationScreenWithItemNoStocks(), true);
  	   
  	} 
	
	@Test(priority=601475)
  	public void checkReservationForFifoCogsItemWithQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkReservationForFifoCogsItemWithQty(), true);
  	   
  	} 
	
	@Test(priority=601476)
  	public void checkSalesOrderVoucherWithNoReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherWithNoReservation(), true);
  	   
  	} 

	@Test(priority=601477)
  	public void checkSalesOrderVoucherAfterSavingOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherAfterSavingOnPreviousOption(), true);
  	   
  	} 
	
	@Test(priority=601478)
  	public void checkStockReservationForFifoCogsItemWithQtySecondRowForConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForFifoCogsItemWithQtySecondRowForConsuming(), true);
  	   
  	} 
	
	
	@Test(priority=601479)
  	public void checkAllocatingStockOnFifoCogsItemThroughPickOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkAllocatingStockOnFifoCogsItemThroughPickOption(), true);
  	   
  	} 
	
	
	@Test(priority=601480)
  	public void checkStockReservationForFifoCogsItemWithQtyThirdRowForConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForFifoCogsItemWithQtyThirdRowForConsuming(), true);
  	   
  	} 
	
	

	@Test(priority=601481)
  	public void checkAllocatingStockOnFifoCogsItemThroughManualInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkAllocatingStockOnFifoCogsItemThroughManualInput(), true);
  	   
  	} 
	
	@Test(priority=601482)
  	public void checkStockReservationForFifoCogsItemAfterConsumingInNextRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForFifoCogsItemAfterConsumingInNextRow(), true);
  	   
  	} 
	
	@Test(priority=601483)
  	public void checkStockReservationForFifoCogsItemInFourthRowForFullConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForFifoCogsItemInFourthRowForFullConsuming(), true);
  	   
  	} 
	
	
	@Test(priority=601484)
  	public void checkStockReservationForFifoCogsItemAfterFullComsumingInConsumedRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForFifoCogsItemAfterFullComsumingInConsumedRow(), true);
  	   
  	} 
	
	@Test(priority=601485)
  	public void checkDeleteRowAndSavingSalesOrderVoucherWithReservationBinItemInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkDeleteRowAndSavingSalesOrderVoucherWithReservationBinItemInFirstRow(), true);
  	   
  	} 

	
	// Batch Reservation
	
	@Test(priority=601490)
  	public void checkSavingSalesOrderVoucherAndCheckReservationScreenWithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesOrderVoucherAndCheckReservationScreenWithBatchItem(), true);
  	   
  	} 
	
	@Test(priority=601491)
  	public void checkAllocatingStockOnBatchItemThroughPickOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkAllocatingStockOnBatchItemThroughPickOption(), true);
  	   
  	} 
	
	@Test(priority=601492)
  	public void checkStockReservationForBatchItemWithQtySecondRowForConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForBatchItemWithQtySecondRowForConsuming(), true);
  	   
  	} 
	
	@Test(priority=601493)
  	public void checkAllocatingStockOnBatchBrItemThroughManualInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkAllocatingStockOnBatchBrItemThroughManualInput(), true);
  	   
  	} 
	
	@Test(priority=601494)
  	public void checkStockReservationForBrCogsItemConsumedInThePreviousRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForBrCogsItemConsumedInThePreviousRow(), true);
  	   
  	}
	
	@Test(priority=601495)
  	public void checkSavingSalesOrderVoucherWithReservationBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesOrderVoucherWithReservationBatchItem(), true);
  	   
  	}
	
	
	@Test(priority=601496)
  	public void checkSalesOrderPreviousOptionBySavingVoucherWithBatchReservationAndClickOnPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderPreviousOptionBySavingVoucherWithBatchReservationAndClickOnPrevious(), true);
  	   
  	}
	
	
	@Test(priority=601497)
  	public void checkSalesOrderVoucherBatchReservationByEditingVoucherToVerifyToDisplayBalanceQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherBatchReservationByEditingVoucherToVerifyToDisplayBalanceQty(), true);
  	   
  	}
	
	@Test(priority=601498)
  	public void checkBatchReservationToVerifyPickAndChangeTheQtyToReserveColumnManualyByInputGreaterThanPick() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchReservationToVerifyPickAndChangeTheQtyToReserveColumnManualyByInputGreaterThanPick(), true);
  	   
  	}
	
	@Test(priority=601499) // Updated Value  is not Selecting in Reserve popup
  	public void checkBatchReservationByEditingSameRowByUpdatingQtyToReserveToLessThanDisplayQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchReservationByEditingSameRowByUpdatingQtyToReserveToLessThanDisplayQty(), true);
  	   
  	}
	
	@Test(priority=601500)
  	public void checkBatchReservationForBatchItemWithQtyForFullConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchReservationForBatchItemWithQtyForFullConsuming(), true);
  	   
  	}
	
	@Test(priority=601501) // Fail on Above
  	public void checkBatchReservationForBatchItemWithQtyThirdRowAfterFullConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchReservationForBatchItemWithQtyThirdRowAfterFullConsuming(), true);
  	   
  	}
	
	
	@Test(priority=601502) // Fails on Above
  	public void checkSavingVoucherAndCheckBatchReservationAsEmptyInNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavingVoucherAndCheckBatchReservationAsEmptyInNewVoucher(), true);
  	   
  	}
  	
  	@Test(priority=601503)
  	public void checkUpdatingSalesOrderVoucherByDeleteRowWithBatchReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkUpdatingSalesOrderVoucherByDeleteRowWithBatchReservation(), true);
  	   
  	}
	

	
	// Rma Reservation
	

	@Test(priority=601530) //
  	public void checkSalesOrderVoucherCheckRMAReservationPopUpScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherCheckRMAReservationPopUpScreen(), true);
  	   
  	} 
	
	
	@Test(priority=601531) //
  	public void checkOkButtonInRMAReservationPopupScreenByInput2QtyInVoucherAndSelectOnly1SerialNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRMAReservationPopupScreenByInput2QtyInVoucherAndSelectOnly1SerialNumber(), true);
  	   
  	}
	
	@Test(priority=601532) //
  	public void checkSalesOrderVoucherFourthRowToCheckRMAReservationPopUpScreenAndBalanceRMANumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherFourthRowToCheckRMAReservationPopUpScreenAndBalanceRMANumbers(), true);
  	   
  	}
	
	
	@Test(priority=601533)
  	public void checkOkButtonInRMAReservationPopupScreenByInput4QtyInVoucherAndSelectAllSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRMAReservationPopupScreenByInput4QtyInVoucherAndSelectAllSerialNumbers(), true);
  	   
  	}
	
	@Test(priority=601534) //
  	public void checkSalesOrderVoucherFifthRowToCheckRMAReservationPopUpScreenAndBalanceRMANumbersAfterFullSelectionInPreviousRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherFifthRowToCheckRMAReservationPopUpScreenAndBalanceRMANumbersAfterFullSelectionInPreviousRow(), true);
  	   
  	}
	
	
	@Test(priority=601535)
  	public void checkSaveSalesOrderVoucherWithRMAReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSaveSalesOrderVoucherWithRMAReservation(), true);
  	   
  	}
	

	@Test(priority=601536) //
  	public void checkRmaReservationSerialNumbersInNewVoucherAfterFullConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRmaReservationSerialNumbersInNewVoucherAfterFullConsuming(), true);
  	   
  	}
	
	@Test(priority=601537) //
  	public void checkRmaReservationOnEditVoucherByDecreasingQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRmaReservationOnEditVoucherByDecreasingQty(), true);
  	   
  	}
	
	@Test(priority=601538)
  	public void checkOkButtonInRMAReservationPopupScreenBySelecting2SerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRMAReservationPopupScreenBySelecting2SerialNumbers(), true);
  	   
  	}
	
	
	@Test(priority=601539) //
  	public void checkRmaReservationOnEditVoucherByIncreasingQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRmaReservationOnEditVoucherByIncreasingQty(), true);
  	   
  	}
	
	
	@Test(priority=601540)
  	public void checkSelectSerialNumberAndClickOnOkButtonEditingSalesOrderVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSelectSerialNumberAndClickOnOkButtonEditingSalesOrderVoucher(), true);
  	   
  	}
	
	@Test(priority=601541) //
  	public void checkRmaSerialNumbersInNewSalesOrderVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRmaSerialNumbersInNewSalesOrderVoucher(), true);
  	   
  	}
	
	@Test(priority=601542) //
  	public void checkUpdatingRmaReservationAndSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkUpdatingRmaReservationAndSaving(), true);
  	   
  	}


   
    
	// Stock Reservation
	
	@Test(priority=601550)
  	public void checkReservationForStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkReservationForStockItem(), true);
  	}
	
	@Test(priority=601551)
  	public void checkAllocatingStockOnStockItemThroughPickOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkAllocatingStockOnStockItemThroughPickOption(), true);
  	}
	
	@Test(priority=601552)
  	public void checkStockReservationForStockItemWithQtyFifthRowForFullConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForStockItemWithQtyFifthRowForFullConsuming(), true);
  	}
	
	@Test(priority=601553)
  	public void checkAllocatingStockOnStockItemThroughManualInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkAllocatingStockOnStockItemThroughManualInput(), true);
  	}
	
	
	@Test(priority=601554)
  	public void checkStockReservationForStockItemAfterConsumingInNextRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForStockItemAfterConsumingInNextRow(), true);
  	}
	
	@Test(priority=601555)
  	public void checkStockReservationForStockItemAsEmptyInNextRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationForStockItemAsEmptyInNextRow(), true);
  	}
	
	@Test(priority=601556)
  	public void checkSavingSalesOrderVoucherWithReservationStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesOrderVoucherWithReservationStockItem(), true);
  	}
	
	
	
	@Test(priority=601557)
  	public void checkStockItemReservationInNewVoucherAfterConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockItemReservationInNewVoucherAfterConsuming(), true);
  	}
	
	@Test(priority=601558)
  	public void checkEditingSalesOrderVoucherByStockReservationDecreasingQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkEditingSalesOrderVoucherByStockReservationDecreasingQty(), true);
  	}
	
	@Test(priority=601559)
  	public void checkEditingAndUpdatingSalesOrderVoucherWithStockReservationIncreasingQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkEditingAndUpdatingSalesOrderVoucherWithStockReservationIncreasingQty(), true);
  	}
	
	@Test(priority=601560)
  	public void checkStockItemReservationInNewVoucherAfterUpdatingInPreviousVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockItemReservationInNewVoucherAfterUpdatingInPreviousVoucher(), true);
  	}
	
	@Test(priority=601561)
  	public void checkStockReservationToVerifyPickAndChangeTheQtyToReserveColumnManualyByInputGreaterThanPick() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockReservationToVerifyPickAndChangeTheQtyToReserveColumnManualyByInputGreaterThanPick(), true);
  	}
	

	@Test(priority=601562)
  	public void checkDeleteRowandSaveVouhcerWithStockItemInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkDeleteRowandSaveVouhcerWithStockItemInFourthRow(), true);
  	}

	
	@Test(priority=601563)
  	public void checkSavedSalesOrderVoucherOnPreviousButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavedSalesOrderVoucherOnPreviousButton(), true);
  	}
	
	@Test(priority=601564)
  	public void checkCopyAndPasteFromClipboardOptionsAndVoucherDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkCopyAndPasteFromClipboardOptionsAndVoucherDisplay(), true);
  	}

	
	@Test(priority=601565)
  	public void checkReservationWithAllItemInSingleVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkReservationWithAllItemInSingleVoucher(), true);
  	}
	
	@Test(priority=601566)
  	public void checkEntryPageSuspendOptionInSalesOrdersVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkEntryPageSuspendOptionInSalesOrdersVoucher(), true);
  	}
	
	@Test(priority=601567)
  	public void checkSuspendStatusInEntryPageAndHomePageOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSuspendStatusInEntryPageAndHomePageOnPreviousOption(), true);
  	}
	
	@Test(priority=601568)
  	public void checkSavingSalesOrderVoucherOnCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesOrderVoucherOnCopyDocument(), true);
  	}
	
	
	@Test(priority=601569)
  	public void checkSalesOrderEntryPageDeleteOptionOnPreviousButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderEntryPageDeleteOptionOnPreviousButton(), true);
  	}
	
	
	@Test(priority=601570)
  	public void checkSalesOrderVoucherToCheckBatchExpiryDateValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesOrderVoucherToCheckBatchExpiryDateValidation(), true);
  	}
	
	
	
	// Sales Invoice Vat Release    
  
	

    @Test(priority=601600) //
  	public void checkLinkMappingInDesignWorkFlowForSales() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkLinkMappingInDesignWorkFlowForSales(), true);
  	}
    
    
    @Test(priority=601601)
  	public void checkSalesInvoiceVoucherToCheckLinkPopUpScreenWithCRTlPlusLForBatchExpired() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesInvoiceVoucherToCheckLinkPopUpScreenWithCRTlPlusLForBatchExpired(), true);
  	}
	
	
	
    @Test(priority=601602)
  	public void checkSalesInvoiceVoucherSearchInLinkPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesInvoiceVoucherSearchInLinkPopupScreen(), true);
  	}
    
    
    
    @Test(priority=601603)
  	public void checkSalesInvoiceVoucherInformationDisplayAfterSelectLinksThroughSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesInvoiceVoucherInformationDisplayAfterSelectLinksThroughSearch(), true);
  	}
	
    
    @Test(priority=601604) //
  	public void checkSalesInvoiceVoucherBatchPopUpScreenForBatchExpired() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesInvoiceVoucherBatchPopUpScreenForBatchExpired(), true);
  	}
    
    @Test(priority=601605)
  	public void checkSalesInvoiceVoucherBatchPopUpScreenByChangeTheVoucherDateForExpiredBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesInvoiceVoucherBatchPopUpScreenByChangeTheVoucherDateForExpiredBatch(), true);
  	}
    
    
    @Test(priority=601606)
  	public void checkSalesInvoiceVoucherByInputingCustomerCLinkCRTLPlusPendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesInvoiceVoucherByInputingCustomerCLinkCRTLPlusPendingLinks(), true);
  	}
    
    
    @Test(priority=601607)
  	public void checkLoadingAllLiknksAvailableThroughCTRlPlus() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkLoadingAllLiknksAvailableThroughCTRlPlus(), true);
  	}
    
    
    
    @Test(priority=601608)
  	public void checkSaveOnBlankTaxCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSaveOnBlankTaxCode(), true);
  	}
    
    
    @Test(priority=601609)
  	public void CheckVoucherGridOnInputingTaxCodeAndSaveWithoutBatchSelection() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.CheckVoucherGridOnInputingTaxCodeAndSaveWithoutBatchSelection(), true);
  	}
    
    @Test(priority=601610)
  	public void checkSelectingBatchFromBatchPopUpAndSaveWithoutRma() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSelectingBatchFromBatchPopUpAndSaveWithoutRma(), true);
  	}
    
    @Test(priority=601611)
  	public void checkSelectingRmaAndSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSelectingRmaAndSave(), true);
  	}
    
    
    
    @Test(priority=601612)
  	public void checkSavedVoucherWithFullConsumeOfLinksCrtlPlusL() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavedVoucherWithFullConsumeOfLinksCrtlPlusL(), true);
  	}
    
    
    @Test(priority=601613)
  	public void checkSalesInvoicePendingLinksThroughCRTLAfterFullComsumed() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesInvoicePendingLinksThroughCRTLAfterFullComsumed(), true);
  	}
    
    
    @Test(priority=601614)
  	public void checkSuspendOptionInSalesInvoiceVatHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSuspendOptionInSalesInvoiceVatHomePage(), true);
  	}
    
    
    
    // Line Wise Release
    
   
    
    @Test(priority=601615)
  	public void checkSalesInvoiceVoucherByInputingCustomerAWarhouseHderabadLinewisePendingLinksForBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSalesInvoiceVoucherByInputingCustomerAWarhouseHderabadLinewisePendingLinksForBatchItem(), true);
  	}
    
    @Test(priority=601616) // Issue
  	public void checkOkOnSlectingRowInPendingLinksPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkOnSlectingRowInPendingLinksPopupScreen(), true);
  	}
    
    @Test(priority=601617)
  	public void checkBatchScreenPopupUsingReservationLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchScreenPopupUsingReservationLinks(), true);
  	}
    
    @Test(priority=601618)
  	public void checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinks(), true);
  	}
    
    @Test(priority=601619)
  	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinks(), true);
  	}
    
    @Test(priority=601620)
  	public void checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInFirstRow(), true);
  	}
    
    @Test(priority=601621) // Issue
  	public void checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreen(), true);
  	}
    
    @Test(priority=601622)
  	public void checkBatchScreenPopupUsingReservationLinksInSecondRowVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchScreenPopupUsingReservationLinksInSecondRowVoucher(), true);
  	}
    
    @Test(priority=601623)
  	public void checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksInSecondRow(), true);
  	}
    
    
    @Test(priority=601624)
  	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInSecondRow(), true);
  	}
    
    @Test(priority=601625)
  	public void checkBalanceQtyInPendingLinksPopupScreenInThirdRowAfterFullConsumeInPreviousRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBalanceQtyInPendingLinksPopupScreenInThirdRowAfterFullConsumeInPreviousRow(), true);
  	}
    
    @Test(priority=601626)
  	public void checkDeleteRowAndConsumeFullQtyOfReserveLinksInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkDeleteRowAndConsumeFullQtyOfReserveLinksInFirstRow(), true);
  	}
    
    @Test(priority=601627)
  	public void checkOkOnSlectingRowInPendingLinksPopupScreenWithFullConsume() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkOnSlectingRowInPendingLinksPopupScreenWithFullConsume(), true);
  	}
    
    @Test(priority=601628)
  	public void checkBatchScreenPopupUsingReservationLinksOnEditing() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchScreenPopupUsingReservationLinksOnEditing(), true);
  	}
    
    
    @Test(priority=601629)
  	public void checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksForFullConsume() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksForFullConsume(), true);
  	}
    
    @Test(priority=601630)
  	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyFullConsumeUsingReservationLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyFullConsumeUsingReservationLinks(), true);
  	}
    
    // Bin 
    
    @Test(priority=601631) // ROW count 2 instead 1
  	public void checkBinItemPendingLinksThroughLineWise() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBinItemPendingLinksThroughLineWise(), true);
  	}
    
    @Test(priority=601632) // Issue
  	public void checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreenForBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreenForBinItem(), true);
  	}
    
    @Test(priority=601633)
  	public void checkBinPopupUsingReservationLinksInSecondRowVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBinPopupUsingReservationLinksInSecondRowVoucher(), true);
  	}
    
    @Test(priority=601634)
  	public void checkAutoAllocateOptionInBinPopupToConsumeLinkPartially() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkAutoAllocateOptionInBinPopupToConsumeLinkPartially(), true);
  	}
    
    
    @Test(priority=601635) // Row Count
  	public void checkBinItemPendingLinksThroughLineWiseAfterConsumingPartiallyinPreviousRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBinItemPendingLinksThroughLineWiseAfterConsumingPartiallyinPreviousRow(), true);
  	}
    
    @Test(priority=601636) // Issue
  	public void checkOkToConsumeFullQtyInThirdRowOfPendingLinksPopupScreenForBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkToConsumeFullQtyInThirdRowOfPendingLinksPopupScreenForBinItem(), true);
  	}
    
    @Test(priority=601637)
  	public void checkBinPopupUsingReservationLinksInThirdRowVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBinPopupUsingReservationLinksInThirdRowVoucher(), true);
  	}
    
    
    @Test(priority=601638)
  	public void checkAutoAllocateOptionInBinPopupToFullConsumeLink() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkAutoAllocateOptionInBinPopupToFullConsumeLink(), true);
  	}
    
    @Test(priority=601640)
  	public void checkBalanceQtyInPendingLinksPopupScreenInFourthRowAfterFullConsumeInPreviousRowForBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBalanceQtyInPendingLinksPopupScreenInFourthRowAfterFullConsumeInPreviousRowForBinItem(), true);
  	}
    
    
    
    @Test(priority=601641) // Row Count
  	public void checkDeleteRowAndConsumeFullQtyOfReserveLinksInSecondRowForBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkDeleteRowAndConsumeFullQtyOfReserveLinksInSecondRowForBinItem(), true);
  	}
    
    @Test(priority=601642)
  	public void checkOkOnSlectingRowInPendingLinksPopupScreenWithFullConsumeForBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkOnSlectingRowInPendingLinksPopupScreenWithFullConsumeForBinItem(), true);
  	}
    
    @Test(priority=601643)
  	public void checkBinPopupUsingReservationLinksInSecondRowVoucherForFullConsume() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBinPopupUsingReservationLinksInSecondRowVoucherForFullConsume(), true);
  	}
    
    
    @Test(priority=601644)
  	public void checkAutoAllocateOptionInBinPopupToFullConsumeLinkInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkAutoAllocateOptionInBinPopupToFullConsumeLinkInSecondRow(), true);
  	}
    
    // Rma
    
    @Test(priority=601645) // Row Count
  	public void checkRmaItemPendingLinksThroughLineWise() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRmaItemPendingLinksThroughLineWise(), true);
  	}
    
    @Test(priority=601646) // Issue
  	public void checkOkToConsumePartialQtyInThirdRowOfPendingLinksPopupScreenForRmaItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkToConsumePartialQtyInThirdRowOfPendingLinksPopupScreenForRmaItem(), true);
  	}
    
    @Test(priority=601647)
  	public void checkRmaPopupUsingReservationLinksInThiirdRowVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRmaPopupUsingReservationLinksInThiirdRowVoucher(), true);
  	}
    
    @Test(priority=601648)
  	public void checkSelectTheRMANumbersThroughCheckBoxInVoucherFourThirdow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSelectTheRMANumbersThroughCheckBoxInVoucherFourThirdow(), true);
  	}
    
    @Test(priority=601649)
  	public void checkOkButtonInRMAPopupScreenInVoucherFourThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRMAPopupScreenInVoucherFourThirdRow(), true);
  	}
    
    
    @Test(priority=6016450)
  	public void checkRMAColumnRMANumbersInVoucherFourThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRMAColumnRMANumbersInVoucherFourThirdRow(), true);
  	}
    
    @Test(priority=6016451) // Row Count
  	public void checkRmaItemPendingLinksThroughLineWiseInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRmaItemPendingLinksThroughLineWiseInFourthRow(), true);
  	}
    
    @Test(priority=6016452) // Issue
  	public void checkOkToConsumePartialQtyInFourthRowOfPendingLinksPopupScreenForRmaItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkToConsumePartialQtyInFourthRowOfPendingLinksPopupScreenForRmaItem(), true);
  	}
    
    @Test(priority=6016453)
  	public void checkRmaPopupUsingReservationLinksInFourthRowVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRmaPopupUsingReservationLinksInFourthRowVoucher(), true);
  	}
    
    @Test(priority=6016454)
  	public void checkSelectTheRMANumbersThroughCheckBoxInVoucherFourFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSelectTheRMANumbersThroughCheckBoxInVoucherFourFourthRow(), true);
  	}
    
    @Test(priority=6016455)
  	public void checkOkButtonInRMAPopupScreenInVoucherFourFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRMAPopupScreenInVoucherFourFourthRow(), true);
  	}
    
    @Test(priority=6016456)
  	public void checkRMAColumnRMANumbersInVoucherFourFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRMAColumnRMANumbersInVoucherFourFourthRow(), true);
  	}
    
    
    @Test(priority=6016457)
  	public void checkBalanceQtyInPendingLinksPopupScreenInFifthRowAfterFullConsumeInPreviousRowForRmaItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBalanceQtyInPendingLinksPopupScreenInFifthRowAfterFullConsumeInPreviousRowForRmaItem(), true);
  	}
    
    @Test(priority=6016458) // Row Count
  	public void checkDeleteRowAndConsumeFullQtyOfReserveLinksInThirdRowForRmaItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkDeleteRowAndConsumeFullQtyOfReserveLinksInThirdRowForRmaItem(), true);
  	}
    
    @Test(priority=6016459)
  	public void checkOkOnSlectingRowInPendingLinksPopupScreenWithFullConsumeForRmaItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkOnSlectingRowInPendingLinksPopupScreenWithFullConsumeForRmaItem(), true);
  	}
    
    
    @Test(priority=6016460)
  	public void checkRmaPopupUsingReservationLinksInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRmaPopupUsingReservationLinksInThirdRow(), true);
  	}
    
    
    @Test(priority=6016461)
  	public void checkSelectTheRMANumbersThroughCheckBoxInVoucherFourThirdRowForFullComsume() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSelectTheRMANumbersThroughCheckBoxInVoucherFourThirdRowForFullComsume(), true);
  	}
    
    @Test(priority=6016462)
  	public void checkOkButtonInRMAPopupScreenInVoucherFourThirdRowForFullConsume() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRMAPopupScreenInVoucherFourThirdRowForFullConsume(), true);
  	}
    
    
    @Test(priority=6016463)
  	public void checkRMAColumnRMANumbersInVoucherFourThirdRowFullConsume() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkRMAColumnRMANumbersInVoucherFourThirdRowFullConsume(), true);
  	}
    
    // Stock
    
    @Test(priority=6016464) // Row Count
  	public void checkStockItemPendingLinksThroughLineWise() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockItemPendingLinksThroughLineWise(), true);
  	}
    
    
    @Test(priority=6016465)
  	public void checkOkToConsumePartialQtyInFourthRowOfPendingLinksPopupScreenForStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkToConsumePartialQtyInFourthRowOfPendingLinksPopupScreenForStockItem(), true);
  	}
    
    
    @Test(priority=6016466)
  	public void checkStockItemPendingLinksThroughLineWiseFullConsume() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkStockItemPendingLinksThroughLineWiseFullConsume(), true);
  	}
    
    @Test(priority=6016467) // Issue
  	public void checkOkToConsumeFullQtyInFifthRowOfPendingLinksPopupScreenForStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkToConsumeFullQtyInFifthRowOfPendingLinksPopupScreenForStockItem(), true);
  	}
    
    
    @Test(priority=6016468)
  	public void checkBalanceQtyInPendingLinksPopupScreenInSixthRowAfterFullConsumeInPreviousRowForStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkBalanceQtyInPendingLinksPopupScreenInSixthRowAfterFullConsumeInPreviousRowForStockItem(), true);
  	}
    
    @Test(priority=6016469)
  	public void checkDeleteRowAndConsumeFullQtyOfReserveLinksInFourthRowForStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkDeleteRowAndConsumeFullQtyOfReserveLinksInFourthRowForStockItem(), true);
  	}
    
    
    @Test(priority=6016470)
  	public void checkOkOnSlectingRowInPendingLinksPopupScreenWithFullConsumeForStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkOkOnSlectingRowInPendingLinksPopupScreenWithFullConsumeForStockItem(), true);
  	}
    
    @Test(priority=6016471)
  	public void checkSavingVoucherWithAllItemsReserveLineWise() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
		svp=new VoucherReserveAndReleasePage(getDriver());
  		Assert.assertEquals(svp.checkSavingVoucherWithAllItemsReserveLineWise(), true);
  	}
  	
  
    
}
