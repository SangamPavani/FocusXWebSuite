package com.focus.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.focus.base.BaseEngine;

public class Demo extends BaseEngine
{

	
	
	@FindBy(xpath="//tbody[@id='optSalesAcc_table_data_body']")
	private static WebElement salesAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optCustDefAcc_table_data_body']")
	private static WebElement customerDefaultAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optPreOrderAcc_table_data_body']")
	private static WebElement preOrderSalesAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optPreOrderCustomerAccnt_table_data_body']")
	private static WebElement preOrderCustomerDefaultAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optSalesReturnAcc_table_data_body']")
	private static WebElement salesReturnAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optCashAcc_table_data_body']")
	private static WebElement cashAccountBody;
	
	@FindBy(xpath="//tbody[@id='optCreditCardAcc_table_data_body']")
	private static WebElement cardAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optCouponAcc_table_data_body']")
	private static WebElement couponAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optDebitAccOrCreditSales_table_data_body']")
	private static WebElement creditNoteAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optPointsAcc_table_data_body']")
	private static WebElement pointsAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optEPaymentAccount_table_data_body']")
	private static WebElement ePaymentAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optCreditSaleDefaultAccount_table_data_body']")
	private static WebElement creditSalesDefaultAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optDiscountAcc_table_data_body']")
	private static WebElement discountAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optGoodsExchangeAccnt_table_data_body']")
	private static WebElement goodsExchangeAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optItemExchangeDiffAccnt_table_data_body']")
	private static WebElement itemExchangeDifferenceAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optSpoilageAccnt_table_data_body']")
	private static WebElement spoilageAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optCashOpenBalanceAccnt_table_data_body']")
	private static WebElement cashOpeningBalanceAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optCashInDefaultAccount_table_data_body']")
	private static WebElement cashInDefaultAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optCashOutDefaultAccount_table_data_body']")
	private static WebElement cashOutDefaultAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optCashCollAccount_table_data_body']")
	private static WebElement cashCollectionDefaultAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optEODDiffAcc_table_data_body']")
	private static WebElement dayEndDifferenceAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optEODStockAccnt_table_data_body']")
	private static WebElement dayEndStockAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optEODWastageAccnt_table_data_body']")
	private static WebElement dayEndWastageAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optRoundOffAcc_table_data_body']")
	private static WebElement roundOffAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optWastageCredit_table_data_body']")
	private static WebElement wastageCreditAccountBody;
	
	
	@FindBy(xpath="//tbody[@id='optAccountTag_table_data_body']")
	private static WebElement accountingTagBody;
	
	
	/*pointOfSaleVoucherDropDown
	journalPostingVouhcerDropDown
	preOrderVoucherDropDown
	preOrderCancelVoucherDropDown
	salesReturnsVoucherDropDown
	homeDeliveryVoucherDropDown
	giftVoucherSaleVoucherDropDown
	cashInVoucherDropDown
	cashOutVouhcerDropDown
	cashCollectionVouhcerDropDown
	voucherTypeOfKittingDropDown
	voucherTypeOfDeKittingDropDown
	voidAdjustmentVoucherDropDown
	dayEndVoucherDropDown
	wastageVoucherDropDown
	issueProcessVoucherDropDown
	receiveFromProductionVoucherDropDown
	shortageOfStockVoucherDropDown*/
	
	
	
	
}
