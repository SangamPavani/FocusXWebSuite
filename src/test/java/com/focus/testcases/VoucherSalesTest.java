package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.VoucherSalesPage;
import com.focus.base.BaseEngine;

public class VoucherSalesTest extends BaseEngine
{
	
   static VoucherSalesPage svp;

    @Test(priority=60000)
  	public void checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage(), true);
  	}
    
    
    // Sales Invoice Vat
  
    
    @Test(priority=601200)
  	public  static void checkSalesVoucherVATNewHomePage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATNewHomePage(),true);
  	}
    
  
    
    @Test(priority=601201)
  	public  static void checkSalesVoucherVATNewEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATNewEntryPage(),true);
  	}
    
    
    
    
    @Test(priority=601202)
  	public  static void checkSalesVoucherVATNewEntryPageHeaderFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATNewEntryPageHeaderFields(),true);
  	}
    
    @Test(priority=601203)
  	public  static void checkSalesVoucherVATEntryPageBodyFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageBodyFields(),true);
  	}
    
    @Test(priority=601204)
  	public  static void checkSalesVoucherVATEntryPageFooterFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageFooterFields(),true);
  	}
    
    @Test(priority=601205)
  	public  static void checkSalesVoucherVATEntryPageDocumentNumber() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageDocumentNumber(),true);
  	}
    
    // Infopanel Start
    @Test(priority=601206)
  	public  static void checkSalesVoucherVATEntryPageInfoSideBar() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageInfoSideBar(),true);
  	}
    
    @Test(priority=601207)
  	public  static void checkSalesVoucherVATEntryPageInfoSideBarCustomizeBtn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageInfoSideBarCustomizeBtn(),true);
  	}
    
    @Test(priority=601208)
  	public  static void checkSalesVoucherVATEntryPageInfoSideBarGraphOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageInfoSideBarGraphOption(),true);
  	}
    
    @Test(priority=601209)
  	public  static void checkSalesVoucherVATEntryPageInfoSideBarReportOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageInfoSideBarReportOption(),true);
  	}
    
    @Test(priority=601210)
  	public  static void checkSalesVoucherVATEntryPageInfoSideBarInfoPanelOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageInfoSideBarInfoPanelOption(),true);
  	}
    
    @Test(priority=601211)
  	public  static void checkSalesVoucherVATEntryPageInfoSideBarWorkFlowOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageInfoSideBarWorkFlowOption(),true);
  	}
    
    @Test(priority=601212)
  	public  static void checkSalesVoucherVATEntryPageInfoSideBarOtherDashletsOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageInfoSideBarOtherDashletsOption(),true);
  	}
    
    @Test(priority=601213)
  	public  static void checkSalesVoucherVATEntryPageInfoSideBarSearch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATEntryPageInfoSideBarSearch(),true);
  	}
    
    @Test(priority=601214)
  	public  static void checkSalesVoucherVATInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATInfoPanelDashlet(),true);
  	}
    
    @Test(priority=601215)
  	public  static void checkSalesVoucherVATSaveInfoPanelDashlet() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATSaveInfoPanelDashlet(),true);
  	}
  	// Infopanel Completed
  	 
  	 
    
    
    @Test(priority=601216)
  	public  static void checkSalesVoucherVATDateFieldLessThanCompanyAccountingDate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATDateFieldLessThanCompanyAccountingDate(),true);
  	}
    
    @Test(priority=601217)
  	public  static void checkSalesVoucherVATSaveWithoutMandatoryFields() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATSaveWithoutMandatoryFields(),true);
  	}
    
    @Test(priority=601218)
  	public  static void checkSalesVoucherVATCustomerOptions() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATCustomerOptions(),true);
  	}
    
    @Test(priority=601219)
  	public  static void checkSettingPlaceofSupplyForCustomerUpdateInPSalesInvoiceVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSettingPlaceofSupplyForCustomerUpdateInPSalesInvoiceVAT(),true);
  	}
    
    @Test(priority=601220)
  	public  static void checkSalesVoucherVATSaveWithCustomerInput() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATSaveWithCustomerInput(),true);
  	}
    
    @Test(priority=601221)
  	public  static void checkDueDateOptionForCustomerAccountCreditDaysAs0() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkDueDateOptionForCustomerAccountCreditDaysAs0(),true);
  	}
    
    @Test(priority=601222)
  	public  static void checkDueDateOptionForCustomerAccountAsCustomerDisplayCDForEachAccountThreeCreditDays4() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkDueDateOptionForCustomerAccountAsCustomerDisplayCDForEachAccountThreeCreditDays4(),true);
  	}
    
    
    @Test(priority=601223)
  	public  static void checkDueDateOptionForCustomerAccountAsCustomerUpdateCreditDays3() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkDueDateOptionForCustomerAccountAsCustomerUpdateCreditDays3(),true);
  	}
    
    @Test(priority=601224)
  	public  static void checkCurrencyOptioninSalesInvoiceVAT() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkCurrencyOptioninSalesInvoiceVAT(),true);
  	}
    
    @Test(priority=601225)
  	public  static void checkSalesVoucherVATVouchersEntryPageNew() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATVouchersEntryPageNew(),true);
  	}
    
    @Test(priority=601226)
  	public  static void checkSalesVoucherVATWithCurrencyInputINR() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherVATWithCurrencyInputINR(),true);
  	}
    
    @Test(priority=601227)
  	public  static void checkExchangeRateWithCurrencyWithAED() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkExchangeRateWithCurrencyWithAED(),true);
  	}
    
    @Test(priority=601228)
  	public  static void checkExchangeRateWithCurrencyWithUSD() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkExchangeRateWithCurrencyWithUSD(),true);
  	}
    
    @Test(priority=601229)
  	public  static void checkSalesVoucherNewDepartment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesVoucherNewDepartment(),true);
  	}
    
    @Test(priority=601230)
  	public  static void checkSalesExchangeRateAndLocalExchangeRatewithCurrencyAED() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesExchangeRateAndLocalExchangeRatewithCurrencyAED(),true);
  	}
    
    @Test(priority=601231)
  	public  static void checkSalesExchangeRateAndLocalExchangeReatewithCurrencyUSD() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesExchangeRateAndLocalExchangeReatewithCurrencyUSD(),true);
  	}
    
    @Test(priority=601232)
  	public  static void checkSalesExchangeRateAndLocalExchangeReatewithCurrencyINR() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesExchangeRateAndLocalExchangeReatewithCurrencyINR(),true);
  	}
    
    @Test(priority=601233)
  	public  static void checkSalesInvoiceVATCloseOptionInEntryPage() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSalesInvoiceVATCloseOptionInEntryPage(),true);
  	}
    
    
    @Test(priority=601234)
  	public  static void checkSavingSalesVoucherVATWithEmptyRows() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesVoucherVATWithEmptyRows(),true);
  	}
    
    @Test(priority=601235)
  	public  static void checkQtyPreLoadByInputAQFQInFirstRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkQtyPreLoadByInputAQFQInFirstRow(),true);
  	}
    
    @Test(priority=601236) //
  	public  static void checkVoucherFirstRowInputValues() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkVoucherFirstRowInputValues(),true);
  	}
    
    @Test(priority=601237)
  	public  static void checkSaveButtonWithoutInputBatchInSalesVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSaveButtonWithoutInputBatchInSalesVoucher(),true);
  	}
    
    @Test(priority=601238)
  	public  static void checkBatchPopupScreenInSalesInvoiceNew() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchPopupScreenInSalesInvoiceNew(),true);
  	}
    
    @Test(priority=601239)
  	public  static void checkBatchScreenPopupBatchValueBeforePickOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchScreenPopupBatchValueBeforePickOption(),true);
  	}
    
    @Test(priority=601240)
  	public  static void checkClickOnOkButtonInBatchPupupScreenWithoutInputOfQtyAdjustment() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkClickOnOkButtonInBatchPupupScreenWithoutInputOfQtyAdjustment(),true);
  	}
    
    
    @Test(priority=601241)
  	public  static void checkyInputMoreQtyInAdjustedQtyThanVoucherQtyInBatchPopUp() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkyInputMoreQtyInAdjustedQtyThanVoucherQtyInBatchPopUp(),true);
  	}
    
    
    
    @Test(priority=601242) // on refreshing button in batch pop Batch Col is not displaying
  	public  static void checkClickOnRefreshOptionInSalesBatchPopupScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkClickOnRefreshOptionInSalesBatchPopupScreen(),true);
  	}
    
    @Test(priority=601243)
  	public  static void checkClickOnOkButtonInBatchPupupScreenWithoutInputOfQtyAdjustmentAfterRefresh() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkClickOnOkButtonInBatchPupupScreenWithoutInputOfQtyAdjustmentAfterRefresh(),true);
  	}
    
    @Test(priority=601244)
  	public  static void checkClickOnCancelButtonInBatchWisePopupScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkClickOnCancelButtonInBatchWisePopupScreen(),true);
  	}
    
    @Test(priority=601245)
  	public  static void checkBatchWiseScreenPopupWithPickOnFIFO() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchWiseScreenPopupWithPickOnFIFO(),true);
  	}
    
    @Test(priority=601246) //
  	public  static void checkFirstRowByClickOnOkButtonInBatchWisePopupScreenPickingBatch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkFirstRowByClickOnOkButtonInBatchWisePopupScreenPickingBatch(),true);
  	}
    
    @Test(priority=601247)
  	public  static void CheckInputingAqAndFqForBatchSplittingInSecondandThirdRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.CheckInputingAqAndFqForBatchSplittingInSecondandThirdRow(),true);
  	}
    
    @Test(priority=601248)
  	public  static void checkBatchWisePopupBeforePickFIFOInSecondRowOfBatchColumn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchWisePopupBeforePickFIFOInSecondRowOfBatchColumn(),true);
  	}
    
    @Test(priority=601249)
  	public  static void checkBatchWisePopupAfterPickFIFOInSecondRowOfBatchColumn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchWisePopupAfterPickFIFOInSecondRowOfBatchColumn(),true);
  	}
    
    
    
    @Test(priority=601250) //
  	public  static void checkBatchSplittingAfterClickOnOKinBatchPopUpScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchSplittingAfterClickOnOKinBatchPopUpScreen(),true);
  	}
    
    @Test(priority=601251)
  	public  static void checkBatchPopUpDisplayasEmptyAfteFullConsumeOfBatch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchPopUpDisplayasEmptyAfteFullConsumeOfBatch(),true);
  	}
    
    @Test(priority=601252)
  	public  static void checkDeleteRowAndSaveSalesVoucherWithBatchItem() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkDeleteRowAndSaveSalesVoucherWithBatchItem(),true);
  	}
    
    @Test(priority=601253)
  	public  static void checkBatchPopUpDisplayasEmptyAfteFullConsumeOfBatchInPreviousVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchPopUpDisplayasEmptyAfteFullConsumeOfBatchInPreviousVoucher(),true);
  	}
    
    @Test(priority=601254)
  	public  static void checkSavedVoucherOnPreviousButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavedVoucherOnPreviousButton(),true);
  	}
    
    
    @Test(priority=601255)
  	public  static void checkBatchPopUpDisplayasEmptyInSavedVoucherAfterFullConsuming() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchPopUpDisplayasEmptyInSavedVoucherAfterFullConsuming(),true);
  	}
    
    @Test(priority=601256) // Fails but flow continues in else
  	public  static void checkBatchPopUpValuesAfterDeletingSecondAndThirdRows() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchPopUpValuesAfterDeletingSecondAndThirdRows(),true);
  	}
    
    @Test(priority=601257)
  	public  static void checkBatchConsumingOnDoubleClickInBatchPopUpScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchConsumingOnDoubleClickInBatchPopUpScreen(),true);
  	}
    
    @Test(priority=601258) //
  	public  static void checkSecondRowByClickOnOkButtonInBatchWisePopupScreenPickingBatchOnDoubleClick() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSecondRowByClickOnOkButtonInBatchWisePopupScreenPickingBatchOnDoubleClick(),true);
  	}
    
    @Test(priority=601259)
  	public  static void checkBatchPopUpScreenByInputingQtytoCheckManualBatchAllocation() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchPopUpScreenByInputingQtytoCheckManualBatchAllocation(),true);
  	}
    
    @Test(priority=601260)
  	public  static void checkManualInputingInBatchPopUpScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkManualInputingInBatchPopUpScreen(),true);
  	}
    
    @Test(priority=601261) //
  	public  static void checkVocuherGridBatchSplittingOnManualEntryInBatchPopUpScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkVocuherGridBatchSplittingOnManualEntryInBatchPopUpScreen(),true);
  	}
    
    
    @Test(priority=601262)
  	public  static void checkinputingAqFqRateAndRateAndClickSaveToDisplayBillRefernceScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkinputingAqFqRateAndRateAndClickSaveToDisplayBillRefernceScreen(),true);
  	}
    
    @Test(priority=601263)
  	public  static void checkClickOnOkButtonWithoutPickButtonInSalesInvoiceBillwiseScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkClickOnOkButtonWithoutPickButtonInSalesInvoiceBillwiseScreen(),true);
  	}
    
    @Test(priority=601264)
  	public  static void checkClickOnCancelButtonInBillwiseScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkClickOnCancelButtonInBillwiseScreen(),true);
  	}
    
    @Test(priority=601265)
  	public  static void checkSaveVoucherOnPickingInBillReferenceScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSaveVoucherOnPickingInBillReferenceScreen(),true);
  	}

    @Test(priority=601266)
  	public  static void checkBatchPopUpValuesAfterAllocatingOnPreviousButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBatchPopUpValuesAfterAllocatingOnPreviousButton(),true);
  	}
    

    // Bin Sales Starts
    
    @Test(priority=601300)
  	public  static void checkSecondRowBinInputAndClickSaveWithoutBin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSecondRowBinInputAndClickSaveWithoutBin(),true);
  	}
    
    @Test(priority=601301)
  	public  static void checkDisplayBinOutWardPopUpScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkDisplayBinOutWardPopUpScreen(),true);
  	}
    
    @Test(priority=601302)
  	public  static void checkBinValuesInSalesInvoiceBinPopupScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBinValuesInSalesInvoiceBinPopupScreen(),true);
  	}
    
    @Test(priority=601303)
  	public  static void checkOkWithoutSelectingAnyBin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOkWithoutSelectingAnyBin(),true);
  	}
    
    @Test(priority=601304) // bin pop --to be picked is showing empty but value expected as 4.00
  	public  static void checkOkAfterAutoAllocatingBin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOkAfterAutoAllocatingBin(),true);
  	}
    
    @Test(priority=601305)
  	public  static void checkBinColumnInVoucherAfterClickingOkInBinPopUpScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBinColumnInVoucherAfterClickingOkInBinPopUpScreen(),true);
  	}
    
    @Test(priority=601306)
  	public  static void checkBinCapcityInNextRowAfterAllocatingBin() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBinCapcityInNextRowAfterAllocatingBin(),true);
  	}
    
    @Test(priority=601307) // To be picked is displaying empty in bin popup
  	public  static void checkBinSplittingOnAutoAllocateButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBinSplittingOnAutoAllocateButton(),true);
  	}
    
    @Test(priority=601308)
  	public  static void checkBinColumnInVoucherAfterClickingOkInBinPopUpScreenToCheckSplitting() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBinColumnInVoucherAfterClickingOkInBinPopUpScreenToCheckSplitting(),true);
  	}
    
    @Test(priority=601309)
  	public  static void CheckBinPopUpEmptyAfterFullConsumeInPreviousRows() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.CheckBinPopUpEmptyAfterFullConsumeInPreviousRows(),true);
  	}
    
    @Test(priority=601310)
  	public  static void checkPreviousRowBinPopUpAllocated() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkPreviousRowBinPopUpAllocated(),true);
  	}
    
    @Test(priority=601311)
  	public  static void checkCancelBinPopupScreenDeleteRowAndSaveVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkCancelBinPopupScreenDeleteRowAndSaveVoucher(),true);
  	}
    
    @Test(priority=601312)
  	public  static void checkBinPopUpValuesInNewVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBinPopUpValuesInNewVoucher(),true);
  	}
    
    @Test(priority=601313)
  	public  static void checkPickOptionInBinScreenWithoutSelection() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkPickOptionInBinScreenWithoutSelection(),true);
  	}
    
    @Test(priority=601314)
  	public  static void chekBinValuesClickOnPickWithSelectingInNewVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.chekBinValuesClickOnPickWithSelectingInNewVoucher(),true);
  	}
    
    @Test(priority=601315)
  	public  static void checkOkButtonUsingPickOptionInBinScreenToDisplayBinInVoucherBinColumn() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonUsingPickOptionInBinScreenToDisplayBinInVoucherBinColumn(),true);
  	}
    
    
    @Test(priority=601316)
  	public  static void checkBalanceInBinPopUpScreenToAllocateOnManual() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBalanceInBinPopUpScreenToAllocateOnManual(),true);
  	}
    
    
    
    @Test(priority=601317)
  	public  static void checkBinOutwardToBePickedInputManualWithLessThanQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBinOutwardToBePickedInputManualWithLessThanQty(),true);
  	}
    
    @Test(priority=601318)
  	public  static void checkBinOutwardToBePickedInputManualWithGreaterThanQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBinOutwardToBePickedInputManualWithGreaterThanQty(),true);
  	}
    
    @Test(priority=601319)
  	public  static void checkBinOutwardToBePickedInputManualWithEqualQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkBinOutwardToBePickedInputManualWithEqualQty(),true);
  	}
    
    
    // RMA Starts here
    
   
    @Test(priority=601350)
  	public  static void checkRMAIsMandatoryWithoutInputTheQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRMAIsMandatoryWithoutInputTheQty(),true);
  	}
    
    
    @Test(priority=601351)
  	public  static void checkRMAPopUpScreenWithoutInputTheQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRMAPopUpScreenWithoutInputTheQty(),true);
  	}
    
    
    @Test(priority=601352)
  	public  static void checkAddButtonInRMAwithNoQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkAddButtonInRMAwithNoQty(),true);
  	}
    
    
    @Test(priority=601353)
  	public  static void checkOkButtonInRMAwithNoQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRMAwithNoQty(),true);
  	}
    
    
    @Test(priority=601354)
  	public  static void checkRmaSearchPopupOnRmaExpansion() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRmaSearchPopupOnRmaExpansion(),true);
  	}
    
    @Test(priority=601355)
  	public  static void checkOkButtonInSearchRMAwithNoQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInSearchRMAwithNoQty(),true);
  	}
    
    @Test(priority=601356)
  	public  static void checkFirstSerialNumberWithNoQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkFirstSerialNumberWithNoQty(),true);
  	}
    
    
    @Test(priority=601357)
  	public  static void checkQtyAndNumnerOfItemOnSelectingHeaderCheckBox() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkQtyAndNumnerOfItemOnSelectingHeaderCheckBox(),true);
  	}
    
    @Test(priority=601358)
  	public  static void checkQtyAndNumnerOfItemOnUncheckingHeaderCheckBox() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkQtyAndNumnerOfItemOnUncheckingHeaderCheckBox(),true);
  	}
    
    @Test(priority=601359)
  	public  static void checkFirstSerialNumberWithNoQtyAfterCheckingAndUncheckingAllSerialNumber() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkFirstSerialNumberWithNoQtyAfterCheckingAndUncheckingAllSerialNumber(),true);
  	}
    
    @Test(priority=601360)
  	public  static void checkSavingWithRmaQtyAndNumbersNotEqual() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavingWithRmaQtyAndNumbersNotEqual(),true);
  	}
    
    @Test(priority=601361)
  	public  static void checkRMAAsMandatoryByInputQtyWithOutRMAAndClickOnSaveButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRMAAsMandatoryByInputQtyWithOutRMAAndClickOnSaveButton(),true);
  	}
    
    @Test(priority=601362)
  	public  static void checkRMAPopUpScreenByInputQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRMAPopUpScreenByInputQty(),true);
  	}
    
    @Test(priority=601363)
  	public  static void checkOkButtonInRMAPopUpScreenWithoutSelectingRMA() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRMAPopUpScreenWithoutSelectingRMA(),true);
  	}
    
    @Test(priority=601364)
  	public  static void checkAddButtonInRMAWithQtyInVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkAddButtonInRMAWithQtyInVoucher(),true);
  	}
    
    @Test(priority=601365)
  	public  static void checkRMASearchPopupOnRMAExpansionWithQtyInVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRMASearchPopupOnRMAExpansionWithQtyInVoucher(),true);
  	}
    
    @Test(priority=601366)
  	public  static void checkOkButtonInSearchRMAWithQtyInVoucher() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInSearchRMAWithQtyInVoucher(),true);
  	}
    
    @Test(priority=601367)
    public  static void checkSearchBoxByInputRMANumber() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSearchBoxByInputRMANumber(),true);
  	}
    
    
    @Test(priority=601368)
    public  static void checkQtyAndNumberOfItemsByInputSearchRMAInSearchPopupScreen() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkQtyAndNumberOfItemsByInputSearchRMAInSearchPopupScreen(),true);
  	}
    
    @Test(priority=601369)
    public  static void checkQtyAndNumberOfItemsInRMAPopupScreenBySelectingSearchRMA() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkQtyAndNumberOfItemsInRMAPopupScreenBySelectingSearchRMA(),true);
  	}
    
    
    @Test(priority=601370)
    public  static void checkOKButtonInRmaPopUpScreenBySelectingLessSerialNumbersToVoucherQty() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOKButtonInRmaPopUpScreenBySelectingLessSerialNumbersToVoucherQty(),true);
  	}
    
    @Test(priority=601371)
    public  static void checkRMAPopUpScreenOnClickCancelButtonInTheAlert() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRMAPopUpScreenOnClickCancelButtonInTheAlert(),true);
  	}
    
    
    @Test(priority=601372)
    public  static void checkAddButtonByInputOfInvalidRMANumber() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkAddButtonByInputOfInvalidRMANumber(),true);
  	}
    
    @Test(priority=601373) // Issue
    public  static void checkAddButtonByInputOfValidRMANumberWhichIsAlreadySelectedThroughSearch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkAddButtonByInputOfValidRMANumberWhichIsAlreadySelectedThroughSearch(),true);
  	}
    
    @Test(priority=601374) // Issue
    public  static void checkInputRMANumberForValidationOfRMAWhichIsAlreadySelect() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkInputRMANumberForValidationOfRMAWhichIsAlreadySelect(),true);
  	}
    
    @Test(priority=601375) // Fails On Above
    public  static void checkOkButtonByUsingSelectionOfRMAThroughSearch() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonByUsingSelectionOfRMAThroughSearch(),true);
  	}
    
    
    @Test(priority=601376)
    public  static void checkRMAColumnInTheVoucherBodyonClickOnOkButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRMAColumnInTheVoucherBodyonClickOnOkButton(),true);
  	}
    
    @Test(priority=601377)
    public  static void checkSaveSalesInvoiceWithEditingRMAInVoucherTwoThirdRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSaveSalesInvoiceWithEditingRMAInVoucherTwoThirdRow(),true);
  	}
    
    @Test(priority=601378)
    public  static void checkDisplayRMASerialNumbersRemainingInVoucherOneFourthRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkDisplayRMASerialNumbersRemainingInVoucherOneFourthRow(),true);
  	}
    
    @Test(priority=601379)
    public  static void checkRmaSearchPopupOnRMAExpansionInVoucherOneFourthRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRmaSearchPopupOnRMAExpansionInVoucherOneFourthRow(),true);
  	}
    
    @Test(priority=601380)
    public  static void checkSelectTheRMANumbersThroughCheckBoxInVoucherOneFourthRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSelectTheRMANumbersThroughCheckBoxInVoucherOneFourthRow(),true);
  	}
    
    @Test(priority=601381)
    public  static void checkOkButtonInRMAPopupScreenInVoucherOneFourthRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkOkButtonInRMAPopupScreenInVoucherOneFourthRow(),true);
  	}
    
    @Test(priority=601382)
    public  static void checkRMAColumnRMANumbersInVoucherOneFourthRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRMAColumnRMANumbersInVoucherOneFourthRow(),true);
  	}
    
    @Test(priority=601383)
    public  static void checkDisplayRMASerialNumbersRemainingInVoucherOneFifthRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkDisplayRMASerialNumbersRemainingInVoucherOneFifthRow(),true);
  	}
    
    @Test(priority=601384)
    public  static void checkRMASearchInAnEmptyRowsExitsVoucherOneFifthRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkRMASearchInAnEmptyRowsExitsVoucherOneFifthRow(),true);
  	}
    
    @Test(priority=601385)
    public  static void checkDeleteRowAndRMASearchkByEditingToLessQtyInVoucherOneThirdRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkDeleteRowAndRMASearchByEditingToLessQtyInVoucherOneThirdRow(),true);
  	}
    
    @Test(priority=601386)
    public  static void checkSavingSalesInvoiceVoucherWithUpadtedRMA() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesInvoiceVoucherWithUpadtedRMA(),true);
  	}
    
    // Stock Item and Credit Limit and Discount Check
   
    @Test(priority=601400) //
    public  static void checkInputingStockItemInFourthRow() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkInputingStockItemInFourthRow(),true);
  	}
    
    @Test(priority=601401)
    public  static void checkSavingVoucherWithRateMoreThanCreditLimit() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavingVoucherWithRateMoreThanCreditLimit(),true);
  	}
    
    @Test(priority=601402)
    public  static void checkFooterFieldsBeforeInputingDiscount() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkFooterFieldsBeforeInputingDiscount(),true);
  	}
    
    @Test(priority=601403)
    public  static void checkFooterFieldsOnInputingDiscountForStockItem() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkFooterFieldsOnInputingDiscountForStockItem(),true);
  	}
    
    
    @Test(priority=601404)
    public  static void checkSavingSalesInvoiceVoucherWithStockItemAndCreditLimitFull() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesInvoiceVoucherWithStockItemAndCreditLimitFull(),true);
  	}
   
    @Test(priority=601405)
    public  static void checkSavedVoucherWithFullCreditLimitOnPreviousButton() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavedVoucherWithFullCreditLimitOnPreviousButton(),true);
  	}
    
    @Test(priority=601406)
    public  static void checkVoucherDataOnCopyAndPasteFromClipBoard() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkVoucherDataOnCopyAndPasteFromClipBoard(),true);
  	}
    
    @Test(priority=601407)
    public  static void checkSavingVocuherForCreditLimitConsumedCustomerWithInputinhMandate() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavingVocuherForCreditLimitConsumedCustomerWithInputinhMandate(),true);
  	}
    
    @Test(priority=601408)
    public  static void checkSavingSalesInvoiceVoucherWithCustomerChange() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesInvoiceVoucherWithCustomerChange(),true);
  	}
    
    @Test(priority=601409)
    public  static void checkEntryPageDeleteOptionOnPreviousButtonInSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkEntryPageDeleteOptionOnPreviousButtonInSalesInvoice(),true);
  	}
    
    @Test(priority=601410)
    public  static void checkSavingSalesInvoiceVoucherWithCopyDocumentOption() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkSavingSalesInvoiceVoucherWithCopyDocumentOption(),true);
  	}
    
    @Test(priority=601411)
    public  static void checkEntryPageSuspendOptionOnPreviousButtonInSalesInvoice() throws NullPointerException, IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
  	{
  		svp=new VoucherSalesPage(getDriver());
  		Assert.assertEquals(svp.checkEntryPageSuspendOptionOnPreviousButtonInSalesInvoice(),true);
  	}
    
    
    
    
}
