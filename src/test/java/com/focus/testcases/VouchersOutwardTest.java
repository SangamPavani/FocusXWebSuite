package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.VouchersInwardPage;
import com.focus.Pages.VouchersOutwardPage;
import com.focus.base.BaseEngine;


public class VouchersOutwardTest extends BaseEngine {
	
  //Sales Invoice and Sales Orders Starts 
	
	
	 VouchersOutwardPage vp;
	 
	@Test(priority=700000) 
	 public void checkSignInToLoginFocusToDisplayMenusAndHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		 vp=new VouchersOutwardPage(getDriver());
		 Assert.assertEquals(vp.checkSignInToLoginFocusToDisplayMenusAndHomePage(), true);
	 }	
	  
    @Test(priority=700001) // Authorize Button
	public void checkFinancialsSalesMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		vp=new VouchersOutwardPage(getDriver());
		Assert.assertEquals(vp.checkFinancialsSalesMenu(), true);
	}
   
    
    @Test(priority=700002)
	public void checkSalesVoucherNewHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		vp=new VouchersOutwardPage(getDriver());
		Assert.assertEquals(vp.checkSalesVoucherNewHomePage(), true);
	}
	

    @Test(priority=700003)
	public void checkSalesVoucherNewEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		vp=new VouchersOutwardPage(getDriver());
		Assert.assertEquals(vp.checkSalesVoucherNewEntryPage(), true);
	}
    
    @Test(priority=700004)
   	public void checkSalesVoucherNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageHeaderFields(), true);
   	}
       
    
    
    @Test(priority=700005)
   	public void checkSalesVoucherNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageBodyFields(), true);
   	}
	
    @Test(priority=700006)
   	public void checkSalesVoucherNewEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageFooterFields(), true);
   	}
	
    @Test(priority=700007)
   	public void checkSalesVoucherNewEntryPageDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageDocumentNumber(), true);
   	}
    
    @Test(priority=700008)
   	public void checkSalesVoucherNewEntryPageInfoSideBar() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageInfoSideBar(), true);
   	}
    
    @Test(priority=700009)
   	public void checksalesVoucherNewEntryPageInfoSideBarCustomizeBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checksalesVoucherNewEntryPageInfoSideBarCustomizeBtn(), true);
   	}
    
    @Test(priority=700010)
   	public void checkSalesVoucherNewEntryPageInfoSideBarGraphOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageInfoSideBarGraphOption(), true);
   	}
    
    @Test(priority=700011)
   	public void checkSalesVoucherNewEntryPageInfoSideBarReportOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageInfoSideBarReportOption(), true);
   	}
    
    @Test(priority=700012)
   	public void checkSalesVoucherNewEntryPageInfoSideBarInfoPanelOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageInfoSideBarInfoPanelOption(), true);
   	}
    
    @Test(priority=700013)
   	public void checkSalesVoucherNewEntryPageInfoSideBarWorkFlowOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageInfoSideBarWorkFlowOption(), true);
   	}
    

    @Test(priority=700014)
   	public void checkSalesVoucherNewEntryPageInfoSideBarOtherDashletsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageInfoSideBarOtherDashletsOption(), true);
   	}
    
    @Test(priority=700015)
   	public void checkSalesVoucherNewEntryPageInfoSideBarSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewEntryPageInfoSideBarSearch(), true);
   	}
    
    @Test(priority=700016)
    public void checkSalesVoucherNewInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewInfoPanelDashlet(), true);
    }
  
    
    @Test(priority=700017)
   	public void checkSalesVoucherNewSaveInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewSaveInfoPanelDashlet(), true);
   	}  
    
   
 
    
    /*@Test(priority=700017) // Company Accounting Date is 01/01/2019
   	public void checkSalesVoucherNewDateFieldLessThanCompanyAccountingDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewDateFieldLessThanCompanyAccountingDate(), true);
   	}
    */
   
  
    
    @Test(priority=700018) // Currency is NOT Displaying in Actual Error Message
   	public void checkSalesVoucherNewSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewSaveWithoutMandatoryFields(), true);
   	}
 
    
    /*
    @Test(priority=700018)
   	public void checkSalesVoucherNewSalesOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewSalesOptions(), true);
   	}
    
    @Test(priority=700019) // Currency is NOT Displaying in Actual Error Message
   	public void checkSalesVoucherNewSaveWithSalesInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewSaveWithSalesInput(), true);
   	}
    
    
    @Test(priority=700020)
   	public void checkSalesVoucherNewCustomerOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewCustomerOptions(), true);
   	}
    
    @Test(priority=700021) // Currency is NOT Displaying in Actual Error Message
   	public void checkSalesVoucherNewSaveWithCustomerInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewSaveWithCustomerInput(), true);
   	}
    
    
    @Test(priority=700022)
   	public void checkDueDateOptionForCustomerAccountCreditDaysAs0() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkDueDateOptionForCustomerAccountCreditDaysAs0(), true);
   	}
    
    @Test(priority=700023)
   	public void checkDueDateOptionForCustomerAccountAsCustomerDisplayCDForEachAccountThreeCreditDays4() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkDueDateOptionForCustomerAccountAsCustomerDisplayCDForEachAccountThreeCreditDays4(), true);
   	}
    
    @Test(priority=700024)
   	public void checkDueDateOptionForCustomerAccountAsCustomerUpdateCreditDays3() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkDueDateOptionForCustomerAccountAsCustomerUpdateCreditDays3(), true);
   	}
    
   
    @Test(priority=700025)
   	public void checkSalesVoucherNewCurrencyHasNotDefinedOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewCurrencyHasNotDefinedOptions(), true);
   	}
    

    @Test(priority=700026)
   	public void checkSalesVoucherNewWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewWarehouse(), true);
   	}
    

    @Test(priority=700027)
   	public void checkSalesVoucherNewSaveWithWarehouseInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewSaveWithWarehouseInput(), true);
   	}
    

    @Test(priority=700028)
   	public void checkSalesVoucherNewVouchersEntryPageNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewVouchersEntryPageNew(), true);
   	}
    

    @Test(priority=700029)
   	public void checkSalesVoucherNewSaveWithCurrencyInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewSaveWithCurrencyInput(), true);
   	}
    

    @Test(priority=700030)
   	public void checkExchangeRateWithCurrencyWithAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkExchangeRateWithCurrencyWithAED(), true);
   	}
    
    

    @Test(priority=700031)
   	public void checkExchangeRateWithCurrencyWithUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkExchangeRateWithCurrencyWithUSD(), true);
   	}
    
    @Test(priority=700032)
   	public void checkSalesVoucherNewDepartment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherNewDepartment(), true);
   	}
    
    
    @Test(priority=700033)
   	public void checkSalesExchangeRateAndLocalExchangeRatewithCurrencyAED() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesExchangeRateAndLocalExchangeRatewithCurrencyAED(), true);
   	}
    
    
    
    @Test(priority=700034) //Entry Page Exchange and Local Exchnage Rate Value Actual  : 5.0000000000 Value Expected : 1.0000000000
   	public void checkSalesExchangeRateAndLocalExchangeReatewithCurrencyUSD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesExchangeRateAndLocalExchangeReatewithCurrencyUSD(), true);
   	}
    
    
    @Test(priority=700035)
   	public void checkSalesExchangeRateAndLocalExchangeReatewithCurrencyINR() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesExchangeRateAndLocalExchangeReatewithCurrencyINR(), true);
   	}
   
    @Test(priority=700036)
   	public void checkSalesInvoiceNewCloseOptionInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceNewCloseOptionInEntryPage(), true);
   	}
   
   
 
    @Test(priority=700037)
   	public void checkSavingSalesVoucherNewWithEmptyRows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingSalesVoucherNewWithEmptyRows(), true);
   	}
   
    @Test(priority=700038)
   	public void checkQtyPreLoadByInputAQFQInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkQtyPreLoadByInputAQFQInFirstRow(), true);
   	}
    
    
    @Test(priority=700039) //Entry Page Check Qty Preload Value Actual  : 1 Value Expected : 27
   	public void checkAvgRateAndAvgRateO() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkAvgRateAndAvgRateO(), true);
   	}
*/    
    
    
    /*
    @Test(priority=306)
   	public void checkVoucherFirstRowInputValues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkVoucherFirstRowInputValues(), true);
   	}
    
    @Test(priority=307)
   	public void checkSaveButtonWithoutInputBatchInSalesVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSaveButtonWithoutInputBatchInSalesVoucher(), true);
   	}
    
   
   
    @Test(priority=308)
   	public void checkBatchPopupScreenInSalesInvoiceNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchPopupScreenInSalesInvoiceNew(), true);
   	}
    
    
    @Test(priority=309)
   	public void checkBatchScreenPopupBatchValueBeforePickOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchScreenPopupBatchValueBeforePickOption(), true);
   	}
    
    @Test(priority=310)
   	public void checkClickOnOkButtonInBatchPupupScreenWithoutInputOfQtyAdjustment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkClickOnOkButtonInBatchPupupScreenWithoutInputOfQtyAdjustment(), true);
   	}
    
    
    @Test(priority=311)
   	public void checkyInputMoreQtyInAdjustedQtyThanVoucherQtyInBatchPopUp() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkyInputMoreQtyInAdjustedQtyThanVoucherQtyInBatchPopUp(), true);
   	}
      
    @Test(priority=312)
   	public void checkClickOnOkButtonInBatchPopUpByInputMoreQtyInAdjustedQtyThanVoucherQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkClickOnOkButtonInBatchPopUpByInputMoreQtyInAdjustedQtyThanVoucherQty(), true);
   	}
   	
   	@Test(priority=313) // No Such Element for  actRow1BatchNo=batch_BatchNoRow1.getText();
   	public void checkClickOnRefreshOptionInSalesBatchPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkClickOnRefreshOptionInSalesBatchPopupScreen(), true);
   	}
    
	@Test(priority=314)
   	public void checkClickOnOkButtonInBatchPupupScreenWithoutInputOfQtyAdjustmentAfterRefresh() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkClickOnOkButtonInBatchPupupScreenWithoutInputOfQtyAdjustmentAfterRefresh(), true);
   	}
    
   	
    @Test(priority=315)
   	public void checkClickOnCancelButtonInBatchWisePopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkClickOnCancelButtonInBatchWisePopupScreen(), true);
   	}
    
    
    @Test(priority=316)
   	public void checkBatchWiseScreenPopupWithPickOnFIFO() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWiseScreenPopupWithPickOnFIFO(), true);
   	}
    
    
    @Test(priority=317)
   	public void checkFirstRowByClickOnOkButtonInBatchWisePopupScreenPickingBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkFirstRowByClickOnOkButtonInBatchWisePopupScreenPickingBatch(), true);
   	}
    
    
    @Test(priority=318) //Entry Page Qty Change Batch Column Value Actual   : false Value Expected : true
   	public void checkBatchColumnByChangingTheAQAsMinimumToCurrentAQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColumnByChangingTheAQAsMinimumToCurrentAQ(), true);
   	}
    
    
    @Test(priority=319)
   	public void checkBatchWisePopAfterChangingTheAQAsMinimumToInputQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWisePopAfterChangingTheAQAsMinimumToInputQty(), true);
   	}
    
    
    
    @Test(priority=320)
   	public void checkBatchColumnByChangingTheAQAsMaxmimumToCurrentAQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColumnByChangingTheAQAsMaxmimumToCurrentAQ(), true);
   	}
    
    
    @Test(priority=321)
   	public void checkBatchWiseScreenPopupByChangingTheQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWiseScreenPopupByChangingTheQty(), true);
   	}
    
    @Test(priority=322)
   	public void checkSecondRowQtyOnInputOfAQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSecondRowQtyOnInputOfAQ(), true);
   	}
    
    
    @Test(priority=323)
   	public void checkVoucherSecondRowInputValuesInputOnlyAQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkVoucherSecondRowInputValuesInputOnlyAQ(), true);
   	}
    
    @Test(priority=324)
   	public void checkBatchWisePopupBeforePickFIFOInSecondRowOfBatchColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWisePopupBeforePickFIFOInSecondRowOfBatchColumn(), true);
   	}
    
    @Test(priority=325)
   	public void checkBatchWisePopupAfterPickFIFOInSecondRowOfBatchColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWisePopupAfterPickFIFOInSecondRowOfBatchColumn(), true);
   	}
    
    
    
    @Test(priority=326)
   	public void checkThirdRowQtyOnInputOfFQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkThirdRowQtyOnInputOfFQ(), true);
   	}
    
    @Test(priority=327)
   	public void checkVoucherThirdRowInputValuesInputOnlyFQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkVoucherThirdRowInputValuesInputOnlyFQ(), true);
   	}
    
    
    @Test(priority=328)
   	public void checkBatchWisePopupBeforePickFIFOInThirdRowOfBatchColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWisePopupBeforePickFIFOInThirdRowOfBatchColumn(), true);
   	}
    
    
    @Test(priority=329)
   	public void checkBatchWisePopupAfterPickFIFOInThirdRowOfBatchColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWisePopupAfterPickFIFOInThirdRowOfBatchColumn(), true);
   	}
    
    
    @Test(priority=330) //
   	public void checkBatchColumUserSelectingTwoRowsInBatchScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColumUserSelectingTwoRowsInBatchScreen(), true);
   	}
    
    
    @Test(priority=331) // IF loop returns False
   	public void checkInputFQInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkInputFQInThirdRow(), true);
   	}
    
    
    @Test(priority=332) // Adjusted Qty Update Qty, Balance Qty Update, Row1 Adjusted Qty
   	public void checkBatchWisePopupBeforePickFIFOInFourthRowOfBatchColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWisePopupBeforePickFIFOInFourthRowOfBatchColumn(), true);
   	}
    
    
    @Test(priority=333) //
   	public void checkBatchWisePopupAfterPickFIFOInFourthRowOfBatchColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWisePopupAfterPickFIFOInFourthRowOfBatchColumn(), true);
   	}
    
    @Test(priority=334) //
   	public void checkFifthRowQtyOnInputOfFQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkFifthRowQtyOnInputOfFQ(), true);
   	}
    
    
    @Test(priority=335) //
   	public void checkVoucherFifthRowInputValuesInputOnlyFQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkVoucherFifthRowInputValuesInputOnlyFQ(), true);
   	}
    
    
    @Test(priority=336) //
   	public void checkBatchWisePopupAfterPickFIFOInFifthRowOfBatchColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWisePopupAfterPickFIFOInFifthRowOfBatchColumn(), true);
   	}
    
    
    @Test(priority=337) //
   	public void checkClickOnOkButtonInBatchPupupScreenInputMoreThanAvilableQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkClickOnOkButtonInBatchPupupScreenInputMoreThanAvilableQty(), true);
   	}
    
    
    @Test(priority=338) // Start
   	public void checkVoucherFifthRowInputValuesByUpdatingOnlyFQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkVoucherFifthRowInputValuesByUpdatingOnlyFQ(), true);
   	}
    
    
    @Test(priority=339)
   	public void checkBatchWisePopupAfterPickFIFOInFifthRowUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchWisePopupAfterPickFIFOInFifthRowUpdate(), true);
   	}
    
    @Test(priority=340)
   	public void checkSixthRowQtyOnInputOfFQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSixthRowQtyOnInputOfFQ(), true);
   	}
    
    @Test(priority=341)
   	public void checkVoucherSixthRowInputValuesInputOnlyFQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkVoucherSixthRowInputValuesInputOnlyFQ(), true);
   	}
    
    
    @Test(priority=342)
   	public void checkCancelButtonInTheSixRowBatchPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkCancelButtonInTheSixRowBatchPopupScreen(), true);
   	}
    
    
    @Test(priority=343)
   	public void checkSavingVoucherInSalesInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingVoucherInSalesInvoice(), true);
   	}

    
  
    @Test(priority=344)
   	public void checkNewVoucherBatchScreenToDisplayBlankAfterConsumeQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkNewVoucherBatchScreenToDisplayBlankAfterConsumeQty(), true);
   	}
    
    
    @Test(priority=345)
   	public void checkCancelButtonInTheNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkCancelButtonInTheNewVoucher(), true);
   	}
    
    

    @Test(priority=346)
   	public void checkPreviousOptionInSalesInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkPreviousOptionInSalesInvoice(), true);
   	}
    
    
    @Test(priority=347) // AVG RateO R1 Value Actual   : 1 Value Expected : 27
   	public void checkSavedVoucherSalesInvoiceOnClickOnPreviousBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavedVoucherSalesInvoiceOnClickOnPreviousBtn(), true);
   	}
    
    
    
    @Test(priority=348)
   	public void checkEditPreviousSavedVoucherInputSixthRowQtyOnInputOfFQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkEditPreviousSavedVoucherInputSixthRowQtyOnInputOfFQ(), true);
   	}
    
    
    @Test(priority=349)
   	public void checkEditPreviousSavedVoucherSixthRowInputValuesInputOnlyFQ() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkEditPreviousSavedVoucherSixthRowInputValuesInputOnlyFQ(), true);
   	}
    
 
    @Test(priority=350)
   	public void checkBatchColumnsOfSavedVoucherInEditPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColumnsOfSavedVoucherInEditPrevious(), true);
   	}

    @Test(priority=351)
   	public void CheckChangeInventoryTagInVoucherAndClickOnSave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.CheckChangeInventoryTagInVoucherAndClickOnSave(), true);
   	}
    
    
    @Test(priority=352)
   	public void checkVoucherAVGAVGOAndFirstRowInputValuesByChangingInventory() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkVoucherAVGAVGOAndFirstRowInputValuesByChangingInventory(), true);
   	}

    @Test(priority=353)
   	public void checkBatchPopupScreenWisePopupBeforePickChangeInventoryTag() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchPopupScreenWisePopupBeforePickChangeInventoryTag(), true);
   	}
    
    
    @Test(priority=354)
   	public void checkBatchPopupScreenWisePopupClickOnManualInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchPopupScreenWisePopupClickOnManualInput(), true);
   	}
    
  
    
    @Test(priority=355)
   	public void checkBatchPopupScreenAfterManualBatchConsume() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchPopupScreenAfterManualBatchConsume(), true);
   	}
    
    
    @Test(priority=356)
   	public void checkSalesVoucherWithRateOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesVoucherWithRateOption(), true);
   	}
    
    @Test(priority=357)
   	public void checkSaveButtontoDisplayBillRefereneceScreenPopupInSalesInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSaveButtontoDisplayBillRefereneceScreenPopupInSalesInvoice(), true);
   	}
    
    
    

    @Test(priority=358)
   	public void checkClickOnOkButtonWithoutPickButtonInSalesInvoiceBillwiseScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkClickOnOkButtonWithoutPickButtonInSalesInvoiceBillwiseScreen(), true);
   	}
    
    @Test(priority=359)
   	public void checkClickOnCancelButtonInBillwiseScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkClickOnCancelButtonInBillwiseScreen(), true);
   	}
    
    @Test(priority=360)
   	public void checkBillwiseScreenClickOnSaveButtonAfterCancelTheBillwiseScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBillwiseScreenClickOnSaveButtonAfterCancelTheBillwiseScreen(), true);
   	}
    
    @Test(priority=361)
   	public void checkBillwiseInformationValuesAfterClickOnPickButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBillwiseInformationValuesAfterClickOnPickButton(), true);
   	}
    
    
    @Test(priority=362)
   	public void checkClickOnSaveButtonWithBillWisePickButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkClickOnSaveButtonWithBillWisePickButton(), true);
   	}
    
   
    @Test(priority=363)
   	public void checkSecondRowBinInputAndBinPopUpScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSecondRowBinInputAndBinPopUpScreen(), true);
   	}
    
    
    @Test(priority=364)
   	public void checkBinValuesInSalesInvoiceBinPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBinValuesInSalesInvoiceBinPopupScreen(), true);
   	}
    
    @Test(priority=365)
   	public void checkOkWithoutSelectingAnyBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkWithoutSelectingAnyBin(), true);
   	}
    

    @Test(priority=366)
   	public void checkOkAfterAutoAllocatingBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkAfterAutoAllocatingBin(), true);
   	}
    
    @Test(priority=367)
   	public void checkBinColumnInVoucherAfterClickingOkInBinPopUpScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBinColumnInVoucherAfterClickingOkInBinPopUpScreen(), true);
   	}
    
    @Test(priority=368)
   	public void checkBinCapcityInNextRowAfterAllocatingBin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBinCapcityInNextRowAfterAllocatingBin(), true);
   	}
 
    @Test(priority=369)
   	public void checkCancelBinPopupScreenDeleteRowAndSaveVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkCancelBinPopupScreenDeleteRowAndSaveVoucher(), true);
   	}
    

    @Test(priority=370)
   	public void checkSaveOnBlankQtyForBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSaveOnBlankQtyForBinItem(), true);
   	}

    @Test(priority=371) 
   	public void checkBinScreenWithoutInputOfTheQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBinScreenWithoutInputOfTheQty(), true);
   	}
    
  
    
    @Test(priority=372)
   	public void checkOkButtonInBinScreenWithAllocationOfBlankQtyAndSaveVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkButtonInBinScreenWithAllocationOfBlankQtyAndSaveVoucher(), true);
   	}
    
    @Test(priority=373)
   	public void chekInputBinProductInNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.chekInputBinProductInNewVoucher(), true);
   	}
   	
    
    @Test(priority=374)
   	public void chekBinValuesInNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.chekBinValuesInNewVoucher(), true);
   	}
    
    @Test(priority=375)
   	public void checkPickOptionInBinScreenWithoutSelection() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkPickOptionInBinScreenWithoutSelection(), true);
   	}
    
    
    @Test(priority=376) // Issue
   	public void chekBinValuesClickOnPickWithSelectingInNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.chekBinValuesClickOnPickWithSelectingInNewVoucher(), true);
   	}
    
    @Test(priority=377)
   	public void checkOkButtonUsingPickOptionInBinScreenToDisplayBinInVoucherBinColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkButtonUsingPickOptionInBinScreenToDisplayBinInVoucherBinColumn(), true);
   	}
    
    
    @Test(priority=378)
   	public void checkSaveNewVoucherWithPickOptionInBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSaveNewVoucherWithPickOptionInBins(), true);
   	}
    
  
    @Test(priority=379)
   	public void checkSaveNewVoucherWithManualOptionInBins() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSaveNewVoucherWithManualOptionInBins(), true);
   	}
    
    @Test(priority=380)
   	public void checkBinOutwardToBePickedInputManualWithLessThanQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBinOutwardToBePickedInputManualWithLessThanQty(), true);
   	}
    
    @Test(priority=381)
   	public void checkBinOutwardToBePickedInputManualWithGreaterThanQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBinOutwardToBePickedInputManualWithGreaterThanQty(), true);
   	}
    
    @Test(priority=382)
   	public void checkBinOutwardToBePickedInputManualWithEqualQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBinOutwardToBePickedInputManualWithEqualQty(), true);
   	}


    @Test(priority=383)
   	public void checkRMAIsMandatoryWithoutInputTheQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMAIsMandatoryWithoutInputTheQty(), true);
   	}
    
    
    @Test(priority=384)
   	public void checkRMAPopUpScreenWithoutInputTheQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMAPopUpScreenWithoutInputTheQty(), true);
   	}
   

    @Test(priority=385)
   	public void checkAddButtonInRMAwithNoQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkAddButtonInRMAwithNoQty(), true);
   	}
   
    @Test(priority=386)
   	public void checkOkButtonInRMAwithNoQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkButtonInRMAwithNoQty(), true);
   	}
    
    
    @Test(priority=387)
   	public void checkRmaSearchPopupOnRmaExpansion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRmaSearchPopupOnRmaExpansion(), true);
   	}
    
    @Test(priority=388)
   	public void checkOkButtonInSearchRMAwithNoQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkButtonInSearchRMAwithNoQty(), true);
   	}
    
    @Test(priority=389)
   	public void checkFirstSerialNumberWithNoQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkFirstSerialNumberWithNoQty(), true);
   	}
    
    
    @Test(priority=390)
   	public void checkQtyAndNumnerOfItemOnSelectingHeaderCheckBox() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkQtyAndNumnerOfItemOnSelectingHeaderCheckBox(), true);
   	}
   
    @Test(priority=391) // Reported
   	public void checkQtyAndNumnerOfItemOnUncheckingHeaderCheckBox() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkQtyAndNumnerOfItemOnUncheckingHeaderCheckBox(), true);
   	}
    
    
    @Test(priority=392)
   	public void checkFirstSerialNumberWithNoQtyAfterCheckingAndUncheckingAllSerialNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkFirstSerialNumberWithNoQtyAfterCheckingAndUncheckingAllSerialNumber(), true);
   	}
    
    @Test(priority=393)
   	public void checkSavingWithRmaQtyAndNumbersNotEqual() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingWithRmaQtyAndNumbersNotEqual(), true);
   	}
    
    @Test(priority=394)
   	public void checkRMAAsMandatoryByInputQtyWithOutRMAAndClickOnSaveButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMAAsMandatoryByInputQtyWithOutRMAAndClickOnSaveButton(), true);
   	}
    
    @Test(priority=395)
   	public void checkRMAPopUpScreenByInputQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMAPopUpScreenByInputQty(), true);
   	}
    
    
    @Test(priority=396)
   	public void checkOkButtonInRMAPopUpScreenWithoutSelectingRMA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkButtonInRMAPopUpScreenWithoutSelectingRMA(), true);
   	}
    
    
    @Test(priority=397)
   	public void checkAddButtonInRMAWithQtyInVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkAddButtonInRMAWithQtyInVoucher(), true);
   	}
    
    
    @Test(priority=398)
   	public void checkRMASearchPopupOnRMAExpansionWithQtyInVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMASearchPopupOnRMAExpansionWithQtyInVoucher(), true);
   	}
    
    
    @Test(priority=399)
   	public void checkOkButtonInSearchRMAWithQtyInVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkButtonInSearchRMAWithQtyInVoucher(), true);
   	}
    
    
    
    @Test(priority=400)
   	public void checkSearchBoxByInputRMANumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSearchBoxByInputRMANumber(), true);
   	}
    
    
    @Test(priority=401)
   	public void checkQtyAndNumberOfItemsByInputSearchRMAInSearchPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkQtyAndNumberOfItemsByInputSearchRMAInSearchPopupScreen(), true);
   	}
    
    @Test(priority=402)
   	public void checkQtyAndNumberOfItemsInRMAPopupScreenBySelectingSearchRMA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkQtyAndNumberOfItemsInRMAPopupScreenBySelectingSearchRMA(), true);
   	}
    
    
    @Test(priority=403)
   	public void checkOKButtonInRmaPopUpScreenBySelectingLessSerialNumbersToVoucherQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOKButtonInRmaPopUpScreenBySelectingLessSerialNumbersToVoucherQty(), true);
   	}
    
    @Test(priority=404)
   	public void checkRMAPopUpScreenOnClickCancelButtonInTheAlert() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMAPopUpScreenOnClickCancelButtonInTheAlert(), true);
   	}
    
    @Test(priority=405)
   	public void checkAddButtonByInputOfInvalidRMANumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkAddButtonByInputOfInvalidRMANumber(), true);
   	}

    @Test(priority=406) // Issue
   	public void checkAddButtonByInputOfValidRMANumberWhichIsAlreadySelectedThroughSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkAddButtonByInputOfValidRMANumberWhichIsAlreadySelectedThroughSearch(), true);
   	}
    
    @Test(priority=407) // Issue
   	public void checkInputRMANumberForValidationOfRMAWhichIsAlreadySelect() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkInputRMANumberForValidationOfRMAWhichIsAlreadySelect(), true);
   	}
    
    @Test(priority=408) // Fails on above
   	public void checkOkButtonByUsingSelectionOfRMAThroughSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkButtonByUsingSelectionOfRMAThroughSearch(), true);
   	}
    
    
    @Test(priority=409)
   	public void checkRMAColumnInTheVoucherBodyonClickOnOkButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMAColumnInTheVoucherBodyonClickOnOkButton(), true);
   	}
    
    
    @Test(priority=410) // Check it
   	public void checkSaveSalesInvoiceWithEditingRMAInVoucherTwoSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSaveSalesInvoiceWithEditingRMAInVoucherTwoSecondRow(), true);
   	}
  

    
    @Test(priority=411)
   	public void checkDisplayRMASerialNumbersRemainingInVoucherOneThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkDisplayRMASerialNumbersRemainingInVoucherOneThirdRow(), true);
   	}
    
    @Test(priority=412)
   	public void checkRmaSearchPopupOnRMAExpansionInVoucherOneThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRmaSearchPopupOnRMAExpansionInVoucherOneThirdRow(), true);
   	}
    
    @Test(priority=413)
   	public void checkSelectTheRMANumbersThroughCheckBoxInVoucherOneThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSelectTheRMANumbersThroughCheckBoxInVoucherOneThirdRow(), true);
   	}
    
    @Test(priority=414)
   	public void checkOkButtonInRMAPopupScreenInVoucherOneThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkButtonInRMAPopupScreenInVoucherOneThirdRow(), true);
   	}
    
    @Test(priority=415)
   	public void checkRMAColumnRMANumbersInVoucherOneThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMAColumnRMANumbersInVoucherOneThirdRow(), true);
   	}
    
    @Test(priority=416)
   	public void checkDisplayRMASerialNumbersRemainingInVoucherOneFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkDisplayRMASerialNumbersRemainingInVoucherOneFourthRow(), true);
   	}
    
    @Test(priority=417)
   	public void checkRMASearchPopupOnRMAExpansionInVoucherOneFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMASearchPopupOnRMAExpansionInVoucherOneFourthRow(), true);
   	}
    
    
    @Test(priority=418)
   	public void checkSelectTheRMANumbersThroughCheckBoxInVoucherOneFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSelectTheRMANumbersThroughCheckBoxInVoucherOneFourthRow(), true);
   	}
    
    @Test(priority=419)
   	public void checkOkButtonInRMAPopupScreenInVoucherOneFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkButtonInRMAPopupScreenInVoucherOneFourthRow(), true);
   	}
    
    @Test(priority=420)
   	public void checkRMAColumnRMANumbersInVoucherOneFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMAColumnRMANumbersInVoucherOneFourthRow(), true);
   	}
    
   
    @Test(priority=421)
   	public void checkDisplayRMASerialNumbersRemainingInVoucherOneFifthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkDisplayRMASerialNumbersRemainingInVoucherOneFifthRow(), true);
   	}
    
    
    @Test(priority=422)
   	public void checkRMASearchInAnEmptyRowsExitsVoucherOneFifthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMASearchInAnEmptyRowsExitsVoucherOneFifthRow(), true);
   	}
    
    
    @Test(priority=423) 
   	public void checkRMASearchByEditingToLessQtyInVoucherOneFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMASearchByEditingToLessQtyInVoucherOneFourthRow(), true);
   	}
    
    
    @Test(priority=424)
   	public void checkSavingSalesInvoiceVoucherWithRMA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingSalesInvoiceVoucherWithRMA(), true);
   	}
  
  
    
    @Test(priority=425)
   	public void checkUpdateRMANumbersByDecreaseQtyInVoucherOne() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkUpdateRMANumbersByDecreaseQtyInVoucherOne(), true);
   	}
    
    
    @Test(priority=426)
   	public void checkUpdateRMANumbersByIncreasingQtyInVoucherOne() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkUpdateRMANumbersByIncreasingQtyInVoucherOne(), true);
   	}
    

    @Test(priority=427)
   	public void checkSavingSalesInvoiceVoucherWithUpadtedRMA() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingSalesInvoiceVoucherWithUpadtedRMA(), true);
   	}
    
    
    @Test(priority=428)
   	public void checkBatchAndBinColumnSalesInvoiceVoucherByChangingWareHouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchAndBinColumnSalesInvoiceVoucherByChangingWareHouse(), true);
   	}
    
    @Test(priority=429)
   	public void checkSavingSalesInvoiceVoucherTwoByInputingBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingSalesInvoiceVoucherTwoByInputingBatchItem(), true);
   	}
    
    @Test(priority=430)
   	public void checkCopyAndPasteFromClipboardOptionsAndSaveVouceThreeInSalesInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkCopyAndPasteFromClipboardOptionsAndSaveVouceThreeInSalesInvoice(), true);
   	}
    
    @Test(priority=431) // Not Deleting in User Navigating To SU
   	public void checkEntryPageDeleteOptionOnPreviousButtonInSalesInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkEntryPageDeleteOptionOnPreviousButtonInSalesInvoice(), true);
   	}
    
    
    @Test(priority=432)
   	public void checkEntryPageSuspendOptionOnPreviousButtonInSalesInvoice() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkEntryPageSuspendOptionOnPreviousButtonInSalesInvoice(), true);
   	} 
   
    
  
	
	 
	 
    //Sales Order Voucher Starts
    //Reservations
   
    @Test(priority=433)
 	public void checkSalesOrderVoucherNewHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherNewHomePage(), true);
  	}
     

    @Test(priority=434)
  	public void checkSalesOrderVoucherNewEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPage(), true);
  	}
  	
   
    @Test(priority=435)
  	public void checkSalesOrderVoucherNewEntryPageHeaderFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageHeaderFields(), true);
  	}
      
    @Test(priority=436)
 	public void checkSalesOrderVoucherNewEntryPageBodyFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageBodyFields(), true);
 	}

    @Test(priority=437)
 	public void checkSalesOrderVoucherNewEntryPageFooterFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageFooterFields(), true);
 	}

    @Test(priority=438)
 	public void checkSalesOrderVoucherNewEntryPageDocumentNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageDocumentNumber(), true);
 	}
  
   //Sales Order Info Panel Starts from here
   
    
    @Test(priority=439)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBar() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageInfoSideBar(), true);
 	}
  
    @Test(priority=440)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarCustomizeBtn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageInfoSideBarCustomizeBtn(), true);
 	}
  
    @Test(priority=441)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarGraphOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageInfoSideBarGraphOption(), true);
 	}
  
    @Test(priority=442)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarReportOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageInfoSideBarReportOption(), true);
 	}
  
    @Test(priority=443)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarInfoPanelOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageInfoSideBarInfoPanelOption(), true);
 	}
  
    @Test(priority=444)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarWorkFlowOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageInfoSideBarWorkFlowOption(), true);
 	}
  

    @Test(priority=445)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarOtherDashletsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageInfoSideBarOtherDashletsOption(), true);
 	}
  
    @Test(priority=446)
 	public void checkSalesOrderVoucherNewEntryPageInfoSideBarSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewEntryPageInfoSideBarSearch(), true);
 	}
  
    @Test(priority=447)
 	public void checkSalesOrderVoucherNewInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewInfoPanelDashlet(), true);
 	}

  
    @Test(priority=448)
 	public void checkSalesOrderVoucherNewSaveInfoPanelDashlet() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 	{
 		vp=new VouchersOutwardPage(getDriver());
 		Assert.assertEquals(vp.checkSalesOrderVoucherNewSaveInfoPanelDashlet(), true);
 	}
  
 
   //Sales Order Info Panel

   
	@Test(priority=449)
  	public void checkSalesOrderVoucherNewDateFieldLessThanCompanyAccountingDate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherNewDateFieldLessThanCompanyAccountingDate(), true);
  	   
  	}    
  
  	@Test(priority=450)
  	public void checkSalesOrderVoucherNewSaveWithoutMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherNewSaveWithoutMandatoryFields(), true);
  	   
  	}    

    
  	@Test(priority=451)
  	public void checkSalesOrderVoucherNewCustomerOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherNewCustomerOptions(), true);
  	   
  	} 
    
  	
	@Test(priority=452)
  	public void checkSalesOrderVoucherNewVouchersEntryPageNew() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherNewVouchersEntryPageNew(), true);
  	   
  	} 
  	 
  	
	@Test(priority=453)
  	public void checkSavingSalesOrderVoucherNewWithEmptyRows() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSavingSalesOrderVoucherNewWithEmptyRows(), true);
  	   
  	} 

	@Test(priority=454)
  	public void checkSavingSalesOrderVoucherWithWarehouse() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSavingSalesOrderVoucherWithWarehouse(), true);
  	   
  	} 
  	
	
	@Test(priority=455)
  	public void checkSaveSalesOrderVoucherToCheckQtyPreload() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSaveSalesOrderVoucherToCheckQtyPreload(), true);
  	   
  	} 
	
	
	@Test(priority=456)
  	public void checkSavingSalesOrderVoucherAndCheckReservationScreenWithItemNoStocks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSavingSalesOrderVoucherAndCheckReservationScreenWithItemNoStocks(), true);
  	   
  	} 
	
	@Test(priority=457)
  	public void checkReservationForBinRawMaterialWithQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkReservationForBinRawMaterialWithQty(), true);
  	   
  	} 
	
	@Test(priority=458)
  	public void checkReservationForBinFinishedGoodsWithQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkReservationForBinFinishedGoodsWithQty(), true);
  	   
  	} 
	
	
	@Test(priority=459)
  	public void checkSalesOrderVoucherWithNoReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherWithNoReservation(), true);
  	   
  	} 
	
	
    
    
    @Test(priority=460)
  	public void checkSalesOrderVoucherAfterSavingOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherAfterSavingOnPreviousOption(), true);
  	   
  	} 
    
    @Test(priority=461)
  	public void checkStockReservationForBinFoodGoodsWithQtySecondRowForConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkStockReservationForBinFoodGoodsWithQtySecondRowForConsuming(), true);
  	   
  	} 
    
    
    @Test(priority=462)
  	public void checkAllocatingStockOnBinFinishedGoodsItemThroughPickOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkAllocatingStockOnBinFinishedGoodsItemThroughPickOption(), true);
  	   
  	} 
    
    @Test(priority=463)
  	public void checkStockReservationForBinFinishedGoodsWithQtyThirdRowForConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkStockReservationForBinFinishedGoodsWithQtyThirdRowForConsuming(), true);
  	   
  	} 
    
    @Test(priority=464)
  	public void checkAllocatingStockOnBinFinishedGoodsItemThroughManualInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkAllocatingStockOnBinFinishedGoodsItemThroughManualInput(), true);
  	   
  	} 

    
    @Test(priority=465)
  	public void checkStockReservationForBinFinishedGoodsAfterConsumingInNextRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkStockReservationForBinFinishedGoodsAfterConsumingInNextRow(), true);
  	   
  	} 
    
    
    @Test(priority=466)
  	public void checkSavingSalesOrderVoucherWithReservationBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSavingSalesOrderVoucherWithReservationBinItem(), true);
  	   
  	} 
    
    
    @Test(priority=467)
  	public void checkSalesOrderVoucherAfterSavingWithReservationOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherAfterSavingWithReservationOnPreviousOption(), true);
  	   
  	} 
    
    
    @Test(priority=468)
  	public void checkSalesOrderBinItemWithGreaterQtyValidationInVoucherTwo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderBinItemWithGreaterQtyValidationInVoucherTwo(), true);
  	   
  	} 
    
    @Test(priority=469)
  	public void checkBinItemPickingAndChangingToGreaterQtyAndAllocatingStockInVoucherTwo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBinItemPickingAndChangingToGreaterQtyAndAllocatingStockInVoucherTwo(), true);
  	   
  	} 
    
    @Test(priority=470)
  	public void checkBinItemQtyForStockReservationInSalesOrderVoucherTwo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBinItemQtyForStockReservationInSalesOrderVoucherTwo(), true);
  	   
  	} 
    
    @Test(priority=471)
  	public void checkSavingSalesOrderVoucherTwoWithReservationBinItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSavingSalesOrderVoucherTwoWithReservationBinItem(), true);
  	   
  	} 
    
    
    @Test(priority=472)
  	public void checkBinItemQtySalesOrdersInVoucherThree() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBinItemQtySalesOrdersInVoucherThree(), true);
  	   
  	} 
    
    @Test(priority=473)
  	public void checkSalesOrdersCloseOptionInEntryPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrdersCloseOptionInEntryPage(), true);
  	   
  	} 
 
    
    @Test(priority=474)
  	public void checkSavingSalesOrderVoucherAndCheckReservationScreenWithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSavingSalesOrderVoucherAndCheckReservationScreenWithBatchItem(), true);
  	   
  	} 
    
    
    @Test(priority=475)
  	public void checkAllocatingStockOnBatchItemThroughPickOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkAllocatingStockOnBatchItemThroughPickOption(), true);
  	   
  	} 
    
    @Test(priority=476)
  	public void checkStockReservationForBatchItemWithQtySecondRowForConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkStockReservationForBatchItemWithQtySecondRowForConsuming(), true);
  	   
  	} 
    
    @Test(priority=477)
  	public void checkAllocatingStockOnBatchBrItemThroughManualInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkAllocatingStockOnBatchBrItemThroughManualInput(), true);
  	   
  	} 
    
    
    @Test(priority=478)
  	public void checkStockReservationForBatchBrItemAfterConsumingInNextRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkStockReservationForBatchBrItemAfterConsumingInNextRow(), true);
  	   
  	}
    
    @Test(priority=479)
  	public void checkSavingSalesOrderVoucherWithReservationBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSavingSalesOrderVoucherWithReservationBatchItem(), true);
  	   
  	}
    
    @Test(priority=480)
  	public void checkSalesOrderPreviousOptionBySavingVoucherWithBatchReservationAndClickOnPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderPreviousOptionBySavingVoucherWithBatchReservationAndClickOnPrevious(), true);
  	   
  	}
    
    @Test(priority=481)
  	public void checkSalesOrderVoucherBatchReservationByEditingVoucherToVerifyToDisplayBalanceQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherBatchReservationByEditingVoucherToVerifyToDisplayBalanceQty(), true);
  	   
  	}
    
    
    @Test(priority=482)
  	public void checkBatchReservationToVerifyPickAndChangeTheQtyToReserveColumnManualyByInputGreaterThanPick() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBatchReservationToVerifyPickAndChangeTheQtyToReserveColumnManualyByInputGreaterThanPick(), true);
  	   
  	}
    
    
    
    @Test(priority=483)
  	public void checkBatchReservationByEditingSameRowByUpdatingQtyToReserveToLessThanDisplayQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBatchReservationByEditingSameRowByUpdatingQtyToReserveToLessThanDisplayQty(), true);
  	   
  	}
    
    
    @Test(priority=484)
  	public void checkUpdatingSalesOrderVoucherByDeleteRowWithBatchReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkUpdatingSalesOrderVoucherByDeleteRowWithBatchReservation(), true);
  	   
  	}
    
    @Test(priority=485)
  	public void checkPreviousVoucherDeleteRowQtyInNewVoucherBatchReservationAndSaveVoucherWithFullReserveQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkPreviousVoucherDeleteRowQtyInNewVoucherBatchReservationAndSaveVoucherWithFullReserveQty(), true);
  	   
  	}
    
    @Test(priority=486)
  	public void checkVoucherDataInBodyAfterFullReserveAndCheckSecondRowBatchReservationColumn() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkVoucherDataInBodyAfterFullReserveAndCheckSecondRowBatchReservationColumn(), true);
  	   
  	}
    
    @Test(priority=487)
  	public void checkBatchReservationForBatchItemWithQtySecondRowAfterFullConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBatchReservationForBatchItemWithQtySecondRowAfterFullConsuming(), true);
  	   
  	}
    
    @Test(priority=488)
  	public void checkSalesOrderVoucherByDeleteRowWithBatchReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherByDeleteRowWithBatchReservation(), true);
  	   
  	}
 
    
    
   @Test(priority=489)
  	public void checkBatchResrvationAvailableQtyAfterFullConsumingInNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBatchResrvationAvailableQtyAfterFullConsumingInNewVoucher(), true);
  	   
  	}
    
    @Test(priority=490)
  	public void checkBatchReservationAvailableQtyAfterFullConsumingInNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBatchReservationAvailableQtyAfterFullConsumingInNewVoucher(), true);
  	   
  	}
    
    @Test(priority=491)
  	public void checkPickQtyFromTwoRowsOfQtyToReserveColumnInBatchReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkPickQtyFromTwoRowsOfQtyToReserveColumnInBatchReservation(), true);
  	   
  	}
    
    
    @Test(priority=492)
  	public void checkReserveQtyInSecondRowWithBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkReserveQtyInSecondRowWithBatchItem(), true);
  	   
  	}
    
    
    @Test(priority=493)
  	public void checkPickAndOkOptionAndCheckReserveColumnInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkPickAndOkOptionAndCheckReserveColumnInSecondRow(), true);
  	   
  	}
    
    @Test(priority=494)
  	public void checkSavingSalesOrderVoucherToReserveDifferentBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSavingSalesOrderVoucherToReserveDifferentBatchItem(), true);
  	   
  	}
    
    @Test(priority=495)
  	public void checkBatchReservationPopupScreenByIncreaseByEditingTheVoucherAndUpdateTheQtyInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBatchReservationPopupScreenByIncreaseByEditingTheVoucherAndUpdateTheQtyInFirstRow(), true);
  	   
  	}
    
    
    @Test(priority=496)
  	public void checkFourthRowAsBlankAndPickQtyFromSecondRowInReserveBatchPopupScreenInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkFourthRowAsBlankAndPickQtyFromSecondRowInReserveBatchPopupScreenInFirstRow(), true);
  	   
  	}
    
    @Test(priority=497)
  	public void checkBatchReservationPopupScreenByDecreaseQtyByEditingTheVoucherAndUpdateTheQtyInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkBatchReservationPopupScreenByDecreaseQtyByEditingTheVoucherAndUpdateTheQtyInSecondRow(), true);
  	   
  	}
    
    
    @Test(priority=498)
  	public void checkReserveColumnInVoucherByDecreaseTheQtyManualyInBatchReservationPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkReserveColumnInVoucherByDecreaseTheQtyManualyInBatchReservationPopupScreen(), true);
  	   
  	}
    
    
    
    @Test(priority=499)
  	public void checkSaveSalesOrderVoucherByIncreaseQtyDecreaseQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSaveSalesOrderVoucherByIncreaseQtyDecreaseQty(), true);
  	   
  	}
    
    
    @Test(priority=500)
  	public void checkIncreaseQtyAndSaveWihNormalWithoutReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkIncreaseQtyAndSaveWihNormalWithoutReservation(), true);
  	   
  	} 
  	
    

    @Test(priority=501)
  	public void checkSalesOrderVoucherFirstRowToCheckRMAReservationPopUpScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherFirstRowToCheckRMAReservationPopUpScreen(), true);
  	   
  	}
    
    @Test(priority=502)
  	public void checkOkButtonInRMAReservationPopupScreenByInput2QtyInVoucherAndSelectOnly1SerialNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkOkButtonInRMAReservationPopupScreenByInput2QtyInVoucherAndSelectOnly1SerialNumber(), true);
  	   
  	}
    
    @Test(priority=503)
  	public void checkSalesOrderVoucherSecondRowToCheckRMAReservationPopUpScreenAndBalanceRMANumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherSecondRowToCheckRMAReservationPopUpScreenAndBalanceRMANumbers(), true);
  	   
  	}
    
    @Test(priority=504)
  	public void checkOkButtonInRMAReservationPopupScreenByInput4QtyInVoucherAndSelectAllSerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkOkButtonInRMAReservationPopupScreenByInput4QtyInVoucherAndSelectAllSerialNumbers(), true);
  	   
  	}
    
    @Test(priority=505)
  	public void checkSalesOrderVoucherThirdRowToCheckRMAReservationPopUpScreenAndBalanceRMANumbersAfterFullSelectionInPreviousRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherThirdRowToCheckRMAReservationPopUpScreenAndBalanceRMANumbersAfterFullSelectionInPreviousRow(), true);
  	   
  	}
    
    @Test(priority=506)
  	public void checkSaveSalesOrderVoucherWithRMAReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSaveSalesOrderVoucherWithRMAReservation(), true);
  	   
  	}
    
    @Test(priority=507)
  	public void checkRmaReservationSerialNumbersInNewVoucherAfterFullConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkRmaReservationSerialNumbersInNewVoucherAfterFullConsuming(), true);
  	   
  	}
    
    @Test(priority=508)
  	public void checkRmaReservationOnEditVoucherByDecreasingQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkRmaReservationOnEditVoucherByDecreasingQty(), true);
  	   
  	}
    
    @Test(priority=509)
  	public void checkOkButtonInRMAReservationPopupScreenBySelecting2SerialNumbers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkOkButtonInRMAReservationPopupScreenBySelecting2SerialNumbers(), true);
  	   
  	}
    
    
    @Test(priority=510)
  	public void checkSalesOrderVoucherThirdRowAfterEditingQtyToLessInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSalesOrderVoucherThirdRowAfterEditingQtyToLessInSecondRow(), true);
  	   
  	}
    
    @Test(priority=511)
  	public void checkSelectSerialNumberAndClickOnOkButtonEditingSalesOrderVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSelectSerialNumberAndClickOnOkButtonEditingSalesOrderVoucher(), true);
  	   
  	}
    
    
    @Test(priority=512)
  	public void checkSaveSalesOrderVoucherByEditingInNewRowAndUpdate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSaveSalesOrderVoucherByEditingInNewRowAndUpdate(), true);
  	   
  	}
    
    @Test(priority=513)
  	public void checkRmaSerialNumbersInNewSalesOrderVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkRmaSerialNumbersInNewSalesOrderVoucher(), true);
  	   
  	}
    
    
    
    
    @Test(priority=514)
  	public void checkSelectSerialNumberAndClickOnOkButtonNewSalesOrderVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSelectSerialNumberAndClickOnOkButtonNewSalesOrderVoucher(), true);
  	   
  	}
    
    
    @Test(priority=515)
  	public void checkSaveSalesOrderVoucherBySelectingBalanceSerialNumberInNewVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSaveSalesOrderVoucherBySelectingBalanceSerialNumberInNewVoucher(), true);
  	   
  	}
    
    
    @Test(priority=516)
  	public void checkReservationForStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkReservationForStockItem(), true);
  	   
  	}
   
    
    
    
    //Purchase Order to check convert option to use stock item in link voucher 
   
    
    @Test(priority=520)
  	public void checkOpenPurchaseOrderVoucherToCheckCloseLinkOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkOpenPurchaseOrderVoucherToCheckCloseLinkOption(), true);
  	   
  	}
  
    
    @Test(priority=521)
  	public void checkOpenPurchaseOrderVoucherToCheckCloseLinkOptionWithoutSelectingRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkOpenPurchaseOrderVoucherToCheckCloseLinkOptionWithoutSelectingRow(), true);
  	   
  	}
  
    
    @Test(priority=522)
  	public void checkOpenPurchaseOrderVoucherToCheckCloseLinkOptionWithSelectingRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkOpenPurchaseOrderVoucherToCheckCloseLinkOptionWithSelectingRow(), true);
  	   
  	}

   
    @Test(priority=523)
  	public void checkOpenPurchaseOrderVoucherToCheckOpenLinkDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkOpenPurchaseOrderVoucherToCheckOpenLinkDisplay(), true);
  	   
  	}
   
    
    @Test(priority=524)
  	public void checkOpenPurchaseOrderVoucherToCheckDisplayConvertLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkOpenPurchaseOrderVoucherToCheckDisplayConvertLinksOption(), true);
  	   
  	}
    
    
    @Test(priority=525)
  	public void checkOpenPurchaseOrderVoucherToCheckConvertLinksOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkOpenPurchaseOrderVoucherToCheckConvertLinksOption(), true);
  	   
  	}
    
    
    @Test(priority=526)
  	public void checkSelectingPurchaseVoucherNOptionAndClickOnOkButtonInConvertLinksScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSelectingPurchaseVoucherNOptionAndClickOnOkButtonInConvertLinksScreen(), true);
  	   
  	}
    
    
    @Test(priority=527) // Will Fail
  	public void checkPurchaseVoucherNUsingConvertLinksFromPurchaseOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkPurchaseVoucherNUsingConvertLinksFromPurchaseOrder(), true);
  	   
  	}
    
    @Test(priority=528) // Will Fail
  	public void checkPreviouslySavedVoucherThroughConvertLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkPreviouslySavedVoucherThroughConvertLinks(), true);
  	   
  	}
    
    
    @Test(priority=529) //
  	public void checkSelectAgainPurchaseVoucherNOptionFullConsumeIsDoneAndClickOnOkButtonInConvertLinksScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		vp=new VouchersOutwardPage(getDriver());
  		Assert.assertEquals(vp.checkSelectAgainPurchaseVoucherNOptionFullConsumeIsDoneAndClickOnOkButtonInConvertLinksScreen(), true);
  	   
  	}

   
    @Test(priority=530)
   	public void checkSalesOrderVoucherNewToSaveStockReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesOrderVoucherNewToSaveStockReservation(), true);
   	   
   	}
    
    
    @Test(priority=531)
   	public void checkAllocatingStockOnStockItemThroughPickOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkAllocatingStockOnStockItemThroughPickOption(), true);
   	   
   	}

    @Test(priority=532)
   	public void checkStockReservationForStockItemWithQtySecondRowForConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkStockReservationForStockItemWithQtySecondRowForConsuming(), true);
   	   
   	}
    
    @Test(priority=533)
   	public void checkAllocatingStockOnStockItemThroughManualInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkAllocatingStockOnStockItemThroughManualInput(), true);
   	   
   	}
    
    @Test(priority=534)
   	public void checkStockReservationForStockItemAfterConsumingInNextRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkStockReservationForStockItemAfterConsumingInNextRow(), true);
   	   
   	}
    
    
    @Test(priority=535)
   	public void checkStockReservationForStockItemInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkStockReservationForStockItemInThirdRow(), true);
   	   
   	}
    
    
    @Test(priority=536)
   	public void checkSavingSalesOrderVoucherWithReservationStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingSalesOrderVoucherWithReservationStockItem(), true);
   	   
   	}
    
    @Test(priority=537)
   	public void checkStockItemReservationInNewVoucherAfterConsuming() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkStockItemReservationInNewVoucherAfterConsuming(), true);
   	   
   	}
    
    
    @Test(priority=538)
   	public void checkSalesOrderPreviousOptionBySavingVoucherWithStockReservationAndClickOnPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesOrderPreviousOptionBySavingVoucherWithStockReservationAndClickOnPrevious(), true);
   	   
   	}
    
    @Test(priority=539)
   	public void checkSalesOrderVoucherStockReservationByEditingVoucherToVerifyToDisplayBalanceQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesOrderVoucherStockReservationByEditingVoucherToVerifyToDisplayBalanceQty(), true);
   	   
   	}
    
    @Test(priority=540)
   	public void checkReserveStausInVoucherOnClickingOkWithoutAnyQtySelectedInReservationScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkReserveStausInVoucherOnClickingOkWithoutAnyQtySelectedInReservationScreen(), true);
   	   
   	}
    
       
    @Test(priority=541)
   	public void checkEditingSalesOrderVoucherByDeleteRowWithStockReservationDecreasingQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkEditingSalesOrderVoucherByDeleteRowWithStockReservationDecreasingQty(), true);
   	   
   	}
    
    @Test(priority=542)
   	public void checkEditingSalesOrderVoucherWithStockReservationIncreasingQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkEditingSalesOrderVoucherWithStockReservationIncreasingQty(), true);
   	   
   	}
    
    @Test(priority=543)
   	public void checkSavingSalesOrderVoucherWithReservationStockItemAfterEditing() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingSalesOrderVoucherWithReservationStockItemAfterEditing(), true);
   	   
   	}
    
    @Test(priority=544)
   	public void checkStockItemReservationInNewVoucherAfterUpdatingInPreviousVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkStockItemReservationInNewVoucherAfterUpdatingInPreviousVoucher(), true);
   	   
   	}
    
    @Test(priority=545)
   	public void checkStockReservationToVerifyPickAndChangeTheQtyToReserveColumnManualyByInputGreaterThanPick() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkStockReservationToVerifyPickAndChangeTheQtyToReserveColumnManualyByInputGreaterThanPick(), true);
   	   
   	}
    
    @Test(priority=546)
   	public void checkStockReservationByEditingSameRowByUpdatingQtyToReserveToLessThanDisplayQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkStockReservationByEditingSameRowByUpdatingQtyToReserveToLessThanDisplayQty(), true);
   	   
   	}
    
    @Test(priority=547)
   	public void checkSavingSalesOrderVoucherWithReservationStockItemWithQtyChangeCheck() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingSalesOrderVoucherWithReservationStockItemWithQtyChangeCheck(), true);
   	   
   	}
    
    
    @Test(priority=548)
   	public void checkReservationWithAllItemInSingleVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkReservationWithAllItemInSingleVoucher(), true);
   	   
   	}
    
    @Test(priority=549)
   	public void checkEntryPageSuspendOptionInSalesOrdersVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkEntryPageSuspendOptionInSalesOrdersVoucher(), true);
   	   
   	}
    
    
    @Test(priority=550)
   	public void checkSuspendStatusInEntryPageAndHomePageOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSuspendStatusInEntryPageAndHomePageOnPreviousOption(), true);
   	   
   	}
    
    
    @Test(priority=551)
   	public void checkCopyDocumentInSalesOrdersVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkCopyDocumentInSalesOrdersVoucher(), true);
   	   
   	}
    
    
    @Test(priority=552)
   	public void checkSavingSalesOrdersVoucherWithAllItemsReservation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingSalesOrdersVoucherWithAllItemsReservation(), true);
   	   
   	}
    
    @Test(priority=553)
   	public void checkSalesOrderEntryPageDeleteOptionOnPreviousButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesOrderEntryPageDeleteOptionOnPreviousButton(), true);
   	   
   	}
    

    
    @Test(priority=554)
   	public void checkSalesOrderVoucherToCheckBatchExpiryDateValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesOrderVoucherToCheckBatchExpiryDateValidation(), true);
   	   
   	}
   
   
    @Test(priority=555)
   	public void checkSalesInvoiceVoucherToCheckLinkPopUpScreenWithCRTlPlusLForBatchExpired() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherToCheckLinkPopUpScreenWithCRTlPlusLForBatchExpired(), true);
   	   
   	}
    
   
    @Test(priority=556)
   	public void checkSalesInvoiceVoucherSearchInLinkPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherSearchInLinkPopupScreen(), true);
   	   
   	}
    
   
    @Test(priority=557)
   	public void checkSalesInvoiceVoucherInformationDisplayAfterSelectLinksThroughSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherInformationDisplayAfterSelectLinksThroughSearch(), true);
   	   
   	}
   
    @Test(priority=558)
   	public void checkSalesInvoiceVoucherBatchPopUpScreenForBatchExpired() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherBatchPopUpScreenForBatchExpired(), true);
   	   
   	}
    
  
    @Test(priority=559)
   	public void checkSalesInvoiceVoucherBatchPopUpScreenByChangeTheVoucherDateForExpiredBatch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherBatchPopUpScreenByChangeTheVoucherDateForExpiredBatch(), true);
   	   
   	}
    
   
    @Test(priority=560) //
   	public void checkSalesInvoiceVoucherByInputingCustomerALinkCRTLPlusPendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherByInputingCustomerALinkCRTLPlusPendingLinks(), true);
   	   
   	}
    
    @Test(priority=561) //
   	public void checkSalesInvoiceVoucherByInputingCustomerBLinkCRTLPlusPendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherByInputingCustomerBLinkCRTLPlusPendingLinks(), true);
   	   
   	}
    
    @Test(priority=562) //
   	public void checkSalesInvoiceVoucherByInputingCustomercLinkCRTLPlusPendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherByInputingCustomerCLinkCRTLPlusPendingLinks(), true);
   	   
   	}
    
    
  
    @Test(priority=563) //
   	public void checkSalesInvoiceVoucherByInputingCustomerCAndWarhouseSecunderabadLinkCRTLPlusPendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherByInputingCustomerCAndWarhouseSecunderabadLinkCRTLPlusPendingLinks(), true);
   	   
   	}
    
    @Test(priority=564) //
   	public void checkSalesInvoiceVoucherByInputingCustomerAAndWarhouseSecunderabadLinkCRTLPlusPendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherByInputingCustomerAAndWarhouseSecunderabadLinkCRTLPlusPendingLinks(), true);
   	   
   	}
    
    
    @Test(priority=565) //
   	public void checkSalesInvoiceVoucherByInputingCustomerAAndWarhouseMumbaiLinkCRTLPlusPendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherByInputingCustomerAAndWarhouseMumbaiLinkCRTLPlusPendingLinks(), true);
   	   
   	}
    
    @Test(priority=566) //
   	public void checkSalesInvoiceVoucherByInputingCustomerAAndWarhouseWH1LinkCRTLPlusPendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherByInputingCustomerAAndWarhouseWH1LinkCRTLPlusPendingLinks(), true);
   	   
   	}
  

    @Test(priority=567) //
   	public void checkSalesInvoiceVoucherByInputingCustomerBWarhouseSecunderabadLinewisePendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherByInputingCustomerBWarhouseSecunderabadLinewisePendingLinks(), true);
   	   
   	}
    
   
    @Test(priority=568)
   	public void checkSalesInvoiceVoucherByInputingCustomerBWarhouseSecunderabadBatchWAItemLinewisePendingLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherByInputingCustomerBWarhouseSecunderabadBatchWAItemLinewisePendingLinks(), true);
   	   
   	}
    
    
    @Test(priority=569)
   	public void checkOkOnSlectingSecondRowInPendingLinksPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkOnSlectingSecondRowInPendingLinksPopupScreen(), true);
   	   
   	}
    
    @Test(priority=570)
   	public void checkBatchScreenPopupUsingReservationLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchScreenPopupUsingReservationLinks(), true);
   	   
   	}
    
    @Test(priority=571)
   	public void checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinks(), true);
   	   
   	}
    
    
    @Test(priority=572)
   	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinks(), true);
   	   
   	}
    
    @Test(priority=573)
   	public void checkBatchPopUpScreenAfterConsumingOnClickOkInBatchPopUpScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchPopUpScreenAfterConsumingOnClickOkInBatchPopUpScreen(), true);
   	   
   	}
    
    
    @Test(priority=574)
   	public void checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInFirstRow(), true);
   	   
   	}
    
    
    @Test(priority=575)
   	public void checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreen(), true);
   	   
   	}
    
    @Test(priority=576)
   	public void checkBatchScreenPopupUsingReservationLinksInSecondRowVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchScreenPopupUsingReservationLinksInSecondRowVoucher(), true);
   	   
   	}
    
    @Test(priority=577)
   	public void checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksInSecondRow(), true);
   	   
   	}
    
    @Test(priority=578)
   	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInSecondRow(), true);
   	   
   	}
    
    
    @Test(priority=579)
   	public void checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInThirdRow(), true);
   	   
   	}
    
    @Test(priority=580)
   	public void checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreenWhileInputingInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreenWhileInputingInThirdRow(), true);
   	   
   	}
    
    @Test(priority=581)
   	public void checkBatchScreenPopupUsingReservationLinksInThirdRowVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchScreenPopupUsingReservationLinksInThirdRowVoucher(), true);
   	   
   	}
    
    @Test(priority=582)
   	public void checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksInThirdRow(), true);
   	   
   	}
    
    
    @Test(priority=583)
   	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInThirdRow(), true);
   	   
   	}
    
    
    @Test(priority=584)
   	public void checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInFourthRow(), true);
   	   
   	}
    
    @Test(priority=585)
   	public void checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreenWhileInputingInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkOkToConsumeFullQtyInSecondRowOfPendingLinksPopupScreenWhileInputingInFourthRow(), true);
   	   
   	}
    
    
    @Test(priority=586)
   	public void checkBatchScreenPopupUsingReservationLinksInFourthRowVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchScreenPopupUsingReservationLinksInFourthRowVoucher(), true);
   	   
   	}
    
    @Test(priority=587)
   	public void checkBatchManualInputQtyAndOkButtonInBatchPopupUsingResevrationLinksInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchManualInputQtyAndOkButtonInBatchPopupUsingResevrationLinksInFourthRow(), true);
   	   
   	}
    
    
    @Test(priority=588)
   	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInFourthRow(), true);
   	   
   	}
    
    @Test(priority=589)
   	public void checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInFifthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBalanceQtyInPendingLinksPopupScreenInSecondRowAfterConsumeInFifthRow(), true);
   	   
   	}
 
    @Test(priority=590)
   	public void checkSavingVoucherWithBatchRelease() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingVoucherWithBatchRelease(), true);
   	   
   	}
   
   
    @Test(priority=591)
   	public void checkSalesInvoiceSavedVoucherOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceSavedVoucherOnPreviousOption(), true);
   	   
   	}
    
 
    @Test(priority=592)
   	public void checkUpdatingVoucherByInputdataInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkUpdatingVoucherByInputdataInFourthRow(), true);
   	   
   	}
    
    @Test(priority=593)
   	public void checkUpdatingVoucherToCheckBalanceInFifthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkUpdatingVoucherToCheckBalanceInFifthRow(), true);
   	   
   	}
    
    
    @Test(priority=594)
   	public void checkUpdatingVoucherByDecreasingqtyinFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkUpdatingVoucherByDecreasingqtyinFourthRow(), true);
   	   
   	}
    
    @Test(priority=595)
   	public void checkUpdatingVoucherByIncreasingqtyinThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkUpdatingVoucherByIncreasingqtyinThirdRow(), true);
   	   
   	}
    
    @Test(priority=596)
   	public void checkSavingVoucherWithBatchReleaseAfterUpdating() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingVoucherWithBatchReleaseAfterUpdating(), true);
   	   
   	}

    
    @Test(priority=597)
   	public void checkSalesInvoiceSavedVoucherAfterUpdatingOnPreviousOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceSavedVoucherAfterUpdatingOnPreviousOption(), true);
   	   
   	}
    
    
    @Test(priority=598)
   	public void checkBalanceQtyInPendingLinksPopUpAndBatchQtyInBatchPopupInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBalanceQtyInPendingLinksPopUpAndBatchQtyInBatchPopupInFirstRow(), true);
   	   
   	}
    
    
    @Test(priority=599)
   	public void checkBalanceQtyInPendingLinksPopUpAndBatchQtyInBatchPopupInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBalanceQtyInPendingLinksPopUpAndBatchQtyInBatchPopupInSecondRow(), true);
   	   
   	}
    
    
    
    
    @Test(priority=600)
   	public void checkBalanceQtyInPendingLinksPopUpAndBatchQtyInBatchPopupInThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBalanceQtyInPendingLinksPopUpAndBatchQtyInBatchPopupInThirdRow(), true);
   	   
   	}
    
    
    
    @Test(priority=601)
   	public void checkBalanceQtyInPendingLinksPopUpAndBatchQtyInBatchPopupInFourthRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBalanceQtyInPendingLinksPopUpAndBatchQtyInBatchPopupInFourthRow(), true);
   	   
   	}
    
    
    @Test(priority=602)
   	public void checkSalesInvoiceVoucherInputByCheckingBalancePendingReserveQtyInLinksPopUpScreenOfBatchItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherInputByCheckingBalancePendingReserveQtyInLinksPopUpScreenOfBatchItem(), true);
   	   
   	}
    
    @Test(priority=603)
   	public void checkBatchScreenPopupUsingReservationLinksInFirstRowVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchScreenPopupUsingReservationLinksInFirstRowVoucher(), true);
   	   
   	}
    
    
    @Test(priority=604)
   	public void checkBatchManualInputQtyAndOkButtonInBatchPopupUsingResevrationLinksInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchManualInputQtyAndOkButtonInBatchPopupUsingResevrationLinksInFirstRow(), true);
   	   
   	}
    
    
    @Test(priority=605)
   	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInFirstRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInFirstRow(), true);
   	   
   	}
    
    
    @Test(priority=606)
   	public void checkPickOnFifoAfterPikcingAdjsutedQtyManuallyInBatchPopUpScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkPickOnFifoAfterPikcingAdjsutedQtyManuallyInBatchPopUpScreen(), true);
   	   
   	}
    
    
    
    @Test(priority=607)
   	public void checkPickingQtyFromReservedBatchInBatchPopUpScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkPickingQtyFromReservedBatchInBatchPopUpScreen(), true);
   	   
   	}
    
    @Test(priority=608)
   	public void checkPendingLinksFullQtyUseInFirstRowOfTheSecondVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkPendingLinksFullQtyUseInFirstRowOfTheSecondVoucher(), true);
   	   
   	}
    
    @Test(priority=609)
   	public void checkBatchScreenPopupUsingReservationLinksInFirstRowSecondVoucherForFullQtySave() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchScreenPopupUsingReservationLinksInFirstRowSecondVoucherForFullQtySave(), true);
   	   
   	}
    
    @Test(priority=610)
   	public void checkBatchManualInputQtyAndOkButtonInBatchPopupUsingResevrationLinksInFirstRowSecondVoucherToSaveFullQty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchManualInputQtyAndOkButtonInBatchPopupUsingResevrationLinksInFirstRowSecondVoucherToSaveFullQty(), true);
   	   
   	}
    
    @Test(priority=611)
   	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInFirstRowInSecondVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksInFirstRowInSecondVoucher(), true);
   	   
   	}
    
    
    @Test(priority=612)
   	public void checkSalesInvoiceVoucherInputByBatchBrItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherInputByBatchBrItem(), true);
   	   
   	}
    
    @Test(priority=613)
   	public void checkBatchScreenPopupUsingReservationLinksInFirstRowVoucherForBrItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchScreenPopupUsingReservationLinksInFirstRowVoucherForBrItem(), true);
   	   
   	}
    
    @Test(priority=614)
   	public void checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksForBatchBrItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchPickAndOkButtonInBatchPopupUsingResevrationLinksForBatchBrItem(), true);
   	   
   	}
    
    @Test(priority=615)
   	public void checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksBatchBrItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkBatchColoumInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksBatchBrItem(), true);
   	   
   	}
    
    
    
    @Test(priority=616)
   	public void checkSalesInvoiceVoucherInputByRMARItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherInputByRMARItem(), true);
   	   
   	}
    
    
    @Test(priority=617)
   	public void checkReleasingRmaItemInSecondRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkReleasingRmaItemInSecondRow(), true);
   	   
   	}
    
    @Test(priority=618)
   	public void checkRMAColumnValueInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksRMARITEM() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkRMAColumnValueInVoucherAfterClickOnOkButtonInBatchPopUpQtyConsumeUsingReservationLinksRMARITEM(), true);
   	   
   	}
    
    
    @Test(priority=620) //ISSUE
   	public void checkSalesInvoiceVoucherInputByStockItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherInputByStockItem(), true);
   	   
   	}
    
    
    @Test(priority=621)
   	public void checkSalesInvoiceVoucherInputByBatchBrItemRemainingQtyinThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherInputByBatchBrItemRemainingQtyinThirdRow(), true);
   	   
   	}
    
    
    @Test(priority=622)
   	public void checkSalesInvoiceVoucherInputByRMARItemRemainingQtyinThirdRow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherInputByRMARItemRemainingQtyinThirdRow(), true);
   	   
   	}
    
    
    @Test(priority=623)
   	public void checkSavingVoucherWithBatchBrItemAndRMARItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSavingVoucherWithBatchBrItemAndRMARItem(), true);
   	   
   	}
    
    
  
    @Test(priority=624)
   	public void checkSalesInvoiceVoucherQtyOfBatchBrItemAfterConsumingInPreviousVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherQtyOfBatchBrItemAfterConsumingInPreviousVoucher(), true);
   	   
   	}
    
    
    @Test(priority=625)
   	public void checkSalesInvoiceVoucherQtyOfRMARItemAfterConsumingInPreviousVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherQtyOfRMARItemAfterConsumingInPreviousVoucher(), true);
   	   
   	}
    
    
    @Test(priority=626)
   	public void checkSalesInvoiceVoucherQtyOfBatchBrItemInThirdRowAfterConsumingThroughPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherQtyOfBatchBrItemInThirdRowAfterConsumingThroughPrevious(), true);
   	   
   	}
    
    @Test(priority=627)
   	public void checkSalesInvoiceVoucherQtyOfRMARItemInThirdRowAfterConsumingThroughPrevious() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkSalesInvoiceVoucherQtyOfRMARItemInThirdRowAfterConsumingThroughPrevious(), true);
   	   
   	}
      
   
    @Test(priority=628)
   	public void checkReleaseBinItemThroughLineWiseSecunderabad() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   	{
   		vp=new VouchersOutwardPage(getDriver());
   		Assert.assertEquals(vp.checkReleaseBinItemThroughLineWiseSecunderabad(), true);
   	   
   	}

   */
}
