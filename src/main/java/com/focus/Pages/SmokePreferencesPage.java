package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.focus.base.BaseEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.focus.base.BaseEngine;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;

public class SmokePreferencesPage extends BaseEngine
{

	 public static String xlfile;
	 public static String resPass="Pass";
	 public static String resFail="Fail";
	 public static ExcelReader excelReader;
	

	
	@FindBy(xpath="//input[@id='txtVoucherWizard']")
	public static WebElement  SearchTxt;
	

    
    
	 
/*public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	 //Thread.sleep(5000);
       
       try 
       {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
			doNotShowCheckbox.click();
			
			//Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtnInDemoPopupScreen));
			CustCloseBtnInDemoPopupScreen.click(); 
			
			System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");
			
		} 
       catch (Exception e)
       {
       	System.err.println("NO POP UP DISPLAYED");
		}

   	
   	//Thread.sleep(4000);
}*/
		 
		

public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
        try
        {
                getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
                String actErrorMessage=errorMessage.getText();
                String expErrorMessage=ExpMessage;

                try
                {
                
	                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
	                errorMessageCloseBtn.click();

	                System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
	                
	                return actErrorMessage;
                }
                catch(Exception ee)
                {
                	
                	System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
                	
                	return actErrorMessage;
                }
        }
        catch(Exception e)
        {
                System.err.println("Error Message NOT Found or NOT Clickable");
                System.err.println(e.getMessage());
                
                String Exception=e.getMessage();
            
                return Exception;
        }
}



	@FindBy(xpath="//button[contains(text(),'Ok')]")
	public static WebElement loginRefreshOkBtn;
	
	
	public static void checkRefershPopOnlogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	
	try 
	{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginRefreshOkBtn));
	loginRefreshOkBtn.click();
	
	
	} 
	catch (Exception e)
	{
	System.err.println("NO ALERT POP UP DISPLAYED");
	}
	
	
	//Thread.sleep(4000);
	}

	
	
	

	
	public static boolean methodReturnStatus;
	public static String xlSheetName = "Preferences";
	
				
	
	
	
	// Accounts Creation Page

		// Header tab Fields
		@FindBy(xpath = "//*[@id='divBtnGroup0']")
		public static WebElement headerGeneralTab;
		
		@FindBy(xpath = "//*[@id='divBtnGroup1']")
		public static WebElement headerAccountSettingTab;

		@FindBy(xpath = "//*[@id='divBtnGroup2']")
		public static WebElement headerDetailsTab;

		@FindBy(xpath = "//*[@id='divBtnGroup3']")
		public static WebElement headerPrintLayoutTab;

		@FindBy(xpath = "//*[@id='divBtnGroup1']/div/a")
		public static WebElement headerUnitsTab;

		@FindBy(xpath = "//*[@id='divBtnGroup2']/div/a")
		public static WebElement headerItemSettingsTab;

		@FindBy(xpath = "//*[@id='divBtnGroup3']/div/a")
		public static WebElement headerClassificationTab;

		@FindBy(xpath = "//*[@id='divBtnGroup4']/div/a")
		public static WebElement headerOtherDetailsTab;

		@FindBy(xpath = "//*[@id='divBtnGroup5']/div/a")
		public static WebElement headerReplenishmentTab;

		@FindBy(xpath = "//*[@id='divBtnGroup6']/div/a")
		public static WebElement headerOutletTab;

		// Header Section Fields
		@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
		public static WebElement saveBtn;

		
		@FindBy(xpath="//i[@class='icon-close icon-font6']")
		public static WebElement  CustCloseBtnInDocumentCustmization;
		
		// Edit option Fields
		@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
		public static WebElement editCustCloseBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-paste-clipboard']")
		public static WebElement pasteBtn;

		@FindBy(xpath = "//button[@id='btnMasterClone']")
		public static WebElement editcloneBtn;

		@FindBy(xpath = "//*[@id='btnMasterCopy']")
		public static WebElement copyBtn;

		// New General Elements
		
		// Setting Elements

		// DebitCreditProposal
		@FindBy(xpath = "//select[@id='iDebitCreditProposal']")
		public static WebElement debitCreditProposalDropdown;

		// DebitCreditRequired
		@FindBy(xpath = "//select[@id='iDebitCreditRequired']")
		public static WebElement debitCreditRequiredDropdown;

		// ExchangeAdjustmentGainAC
		@FindBy(xpath = "//input[@id='iExchangeAdjustmentGainAC']")
		public static WebElement exchangeAdjustmentGainACTxt;

		@FindBy(xpath = "//*[@id='iExchangeAdjustmentGainAC_input_image']/span")
		public static WebElement exchangeAdjustmentGainAC_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iExchangeAdjustmentGainAC_input_settings']/span")
		public static WebElement exchangeAdjustmentGainAC_SettingBtn;

		// ExchangeAdjustmentLossAC
		@FindBy(xpath = "//input[@id='iExchangeAdjustmentLossAC']")
		public static WebElement exchangeAdjustmentLossACTxt;

		@FindBy(xpath = "//*[@id='iExchangeAdjustmentLossAC_input_image']/span")
		public static WebElement exchangeAdjustmentLossAC_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iExchangeAdjustmentLossAC_input_settings']/span")
		public static WebElement exchangeAdjustmentLossAC_SettingBtn;

		// PrimaryAccount
		@FindBy(xpath = "//input[@id='iPrimaryAccount']")
		public static WebElement primaryAccountTxt;

		@FindBy(xpath = "//*[@id='iPrimaryAccount_input_image']/span")
		public static WebElement primaryAccount_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iPrimaryAccount_input_settings']/span")
		public static WebElement primaryAccount_SettingBtn;

		// DefaultCurrency
		@FindBy(xpath = "//*[@id='optCurrency']")
		public static WebElement defaultCurrencyTxt;

		@FindBy(xpath = "//*[@id='iDefaultCurrency_input_image']/span")
		public static WebElement defaultCurrency_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iDefaultCurrency_input_settings']/span")
		public static WebElement defaultCurrency_SettingBtn;

		// ConsolidationMethod
		@FindBy(xpath = "//select[@id='iConsolidationMethod']")
		public static WebElement consolidationMethodDropdown;

		// PaymentTerms
		@FindBy(xpath = "//input[@id='iPaymentTerms']")
		public static WebElement paymentTermstxt;

		@FindBy(xpath = "//*[@id='iPaymentTerms_input_image']/span")
		public static WebElement paymentTerms_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iPaymentTerms_input_settings']/span")
		public static WebElement paymentTerms_SettingBtn;

		// ReminderTerms
		@FindBy(xpath = "//*[@id='iReminderTerms']")
		public static WebElement reminderTermsTxt;

		@FindBy(xpath = "//*[@id='iReminderTerms_input_image']/span")
		public static WebElement reminderTerms_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iReminderTerms_input_settings']/span")
		public static WebElement reminderTerms_SettingBtn;

		// FinanceChargeTerms
		@FindBy(xpath = "//*[@id='iFinanceChargeTerms']")
		public static WebElement financeChargeTermsTxt;

		@FindBy(xpath = "//*[@id='iFinanceChargeTerms_input_image']/span")
		public static WebElement financeChargeTerms_Expansion;

		@FindBy(xpath = "//*[@id='iFinanceChargeTerms_input_settings']/span")
		public static WebElement financeChargeTerms_SettingBtn;

		// Details Elements

		// Address
		@FindBy(xpath = "//textarea[@id='sAddress']")
		public static WebElement addressTxt;

		// City
		@FindBy(xpath = "//input[@id='iCity']")
		public static WebElement cityTxt;

		@FindBy(xpath = "//*[@id='iCity_input_image']/span")
		public static WebElement city_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iCity_input_settings']/span")
		public static WebElement city_SettingBtn;

		// DeliveryAddress
		@FindBy(xpath = "//textarea[@id='sDeliveryAddress']")
		public static WebElement deliveryAddressTxt;

		// Pin
		@FindBy(xpath = "//input[@id='sPin']")
		public static WebElement pinTxt;

		// City2 DeliveryCity (City As Second TextBox)
		@FindBy(xpath = "//input[@id='iDeliveryCity']")
		public static WebElement city2Text;

		@FindBy(xpath = "//*[@id='iDeliveryCity_input_image']/span")
		public static WebElement city2_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iDeliveryCity_input_settings']/span")
		public static WebElement city2_SettingBtn;

		//// Pin Delivery pin Second Pin TxtBox
		@FindBy(xpath = "//input[@id='sDeliveryPin']")
		public static WebElement pin2Txt;

		// Send Email
		@FindBy(xpath = "//input[@id='bSendEmailtocustomer']")
		public static WebElement sendEmailCheckBox;

		// AllowCustomerPortal
		@FindBy(xpath = "//input[@id='bAllowCustomerPortal']")
		public static WebElement allowCustomerPortalCheckBox;

		// SendEmail
		@FindBy(xpath = "//input[@id='sEMail']")
		public static WebElement sendEmailTxt;

		// Password
		@FindBy(xpath = "//input[@id='sPassword']")
		public static WebElement passwordTxt;

		// TelphoneNumber
		@FindBy(xpath = "//input[@id='sTelNo']")
		public static WebElement telphoneNumberTxt;

		// FaxNo
		@FindBy(xpath = "//input[@id='sFaxNo']")
		public static WebElement faxNoTxt;

		// PortalEmail
		@FindBy(xpath = "//input[@id='sPortalEmail']")
		public static WebElement portalEmailTxt;

		// Print Layout Elements
		// Voucher Type
		@FindBy(xpath = "//label[contains(text(),'Voucher Type')]")
		public static WebElement gridVoucherTypeTxt;

		@FindBy(xpath = "//*[@id='iVoucherType_input_image']/span")
		public static WebElement gridVoucher_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iVoucherType_input_settings']/span")
		public static WebElement gridVoucher_SettingBtn;

		// Print layout
		@FindBy(xpath = "//label[contains(text(),'Print Layout')]")
		public static WebElement gridPrintLayoutTxt;

		@FindBy(xpath = "//*[@id='iPrintLayout_input_image']/span")
		public static WebElement gridPrintLayout_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iPrintLayout_input_settings']/span")
		public static WebElement gridPrintLayout_SettingBtn;

		// Item
		@FindBy(xpath = "//*[@id='spnHeaderText']")
		public static WebElement itemLabel;

		@FindBy(xpath = "//*[@id='btnNew']")
		public static WebElement itemNewBtn;

		// Item General Tab
		@FindBy(xpath = "//*[@id='divBtnGroup0']/div/a")
		public static WebElement ItemNewnewGeneralBtn;

		@FindBy(xpath = "//input[@id='sName']")
		public static WebElement newGeneralName;

		@FindBy(xpath = "//input[@id='sCode']")
		public static WebElement newGeneralCode;

		@FindBy(xpath = "//select[@id='iProductType']")
		public static WebElement newGeneralItemTypeDropDown;

		@FindBy(xpath = "//input[@id='fReorderLevel']")
		public static WebElement newGeneralReorderLevel;

		@FindBy(xpath = "//input[@id='iBinCapacity']")
		public static WebElement newGeneralBinCapacity;

		@FindBy(xpath = "//select[@id='iValuationMethod']")
		public static WebElement newGeneralValuationMethodDropDown;

		@FindBy(xpath = "//input[@id='iCategory']")
		public static WebElement newGeneralCategoryDropDown;

		@FindBy(xpath = "//td[@id='iCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement newGeneralCategorySettingBtn;

		@FindBy(xpath = "//select[@id='iProductMake']")
		public static WebElement newGeneralItemMakeDropDown;

		@FindBy(xpath = "//input[@id='Printer']")
		public static WebElement newGeneralPrint;

		@FindBy(xpath = "//input[@id='iAlternateCategory']")
		public static WebElement newGeneralAlternativeCategoryDropdown;

		@FindBy(xpath = "//td[@id='iAlternateCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement newGeneralAlternativeCategoryDropdownSettingBtn;

		@FindBy(xpath = "//textarea[@id='sDescription']")
		public static WebElement newGeneralDescription;

		@FindBy(xpath = "//input[@id='bPerishableItem']")
		public static WebElement newGeneralPerishableItemCheckBox;

		@FindBy(xpath = "//input[@id='iBin']")
		public static WebElement newGeneralBinDropdown;

		@FindBy(xpath = "//td[@id='iBin_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement newGeneralBinDropdownSettingBtn;

		@FindBy(xpath = "//input[@id='pImage']")
		public static WebElement newGeneralUploadImageOrFileBtn;

		@FindBy(xpath = "//*[@id='btnMasterSaveClick']/i")
		public static WebElement newGeneralSaveBtn;

		@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement newGeneralCustCloseBtn;

		// Item Units Tab
		@FindBy(xpath = "//*[@id='divBtnGroup1']/div/a")
		public static WebElement ItemNewUnitsBtn;

		@FindBy(xpath = "//input[@id='iDefaultBaseUnit']")
		public static WebElement itemUnitsDefaultBaseUnitDropdown;

		@FindBy(xpath = "//*[@id='iDefaultBaseUnit_table_body']/tr/td[2]")
		public static List<WebElement> itemUnitsDefaultBaseUnitDropdownList;
		
		
		@FindBy(xpath = "//td[@id='iDefaultBaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement itemUnitsDefaultBaseUnitSetting;

		@FindBy(xpath = "//input[@id='iDefaultSalesUnit']")
		public static WebElement itemUnitsDefaultSalesUnitDropdown;
		
		
		@FindBy(xpath = "//*[@id='iDefaultSalesUnit_table_body']/tr/td[2]")
		public static List<WebElement> itemUnitsDefaultSalesUnitDropdownList;

		@FindBy(xpath = "//td[@id='iDefaultSalesUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement itemUnitsDefaultSalesUnitSettingsBtn;

		@FindBy(xpath = "//input[@id='iDefaultPurchaseUnit']")
		public static WebElement itemUnitsDefaultPurchaseUnitDropDown;

		@FindBy(xpath = "//*[@id='iDefaultPurchaseUnit_table_body']/tr/td[2]")
		public static List<WebElement> itemUnitsDefaultPurchaseUnitDropDownList;
		
		
		@FindBy(xpath = "//td[@id='iDefaultPurchaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement itemUnitsDefaultPurchaseUnitSettingsBtn;

		@FindBy(xpath = "//input[@id='fLength']")
		public static WebElement itemUnitsLength;

		@FindBy(xpath = "//input[@id='fWidth']")
		public static WebElement itemUnitswidth;

		@FindBy(xpath = "//input[@id='fHeight']")
		public static WebElement itemUnitsHeight;

		@FindBy(xpath = "//*[@id='fCBM']")
		public static WebElement itemUnitsCBM;

		@FindBy(xpath = "//input[@id='fWeight']")
		public static WebElement itemUnitsWeight;

		@FindBy(xpath = "//input[@id='iPalletUnit']")
		public static WebElement itemUnitsPalletUnitTxt;

		@FindBy(xpath = "//input[@id='fPalletQty']")
		public static WebElement itemUnitsPalletQtyTxt;

		@FindBy(xpath = "//input[@id='fPalletLength']")
		public static WebElement itemUnitsPalletLengthTXt;

		@FindBy(xpath = "//input[@id='fPalletWidth']")
		public static WebElement itemUnitsPalletWidthTxt;

		@FindBy(xpath = "//input[@id='fPalletHeight']")
		public static WebElement itemUnitsPalletHeightTxt;

		// Master Item Settings
		@FindBy(xpath = "//*[@id='divBtnGroup2']/div/a")
		public static WebElement ItemNewSettingsBtn;

		@FindBy(xpath = "//*[@id='fStandardCost']")
		public static WebElement NewSettingsStandardCost;

		@FindBy(xpath = "//*[@id='fOverheadCost']")
		public static WebElement NewSettingsOverheadCost;

		@FindBy(xpath = "//*[@id='fIndirectCost']")
		public static WebElement NewSettingsIndirectCost;

		@FindBy(xpath = "//*[@id='fProfit']")
		public static WebElement NewSettingsProfit;

		@FindBy(xpath = "//*[@id='iDontshowproductexpireddays']")
		public static WebElement NewSettingsDontshowproductexpireddays;

		@FindBy(xpath = "//*[@id='iTaxCode']")
		public static WebElement NewSettingsTaxCode;

		@FindBy(xpath = "//*[@id='iTaxCode_input_settings']/span")
		public static WebElement NewSettingsTaxCodeSttingsBtn;

		@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
		public static WebElement NewSettingsSaveBtn;

		@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement NewSettingsCustCloseBtn;

		// Master Item Classification
		@FindBy(xpath = "//*[@id='divBtnGroup3']/div/a")
		public static WebElement ItemNewClassificationBtn;

		@FindBy(xpath = "//*[@id='iABCCodeValue']")
		public static WebElement newItemClassificationABC_CodeValueDropdown;

		@FindBy(xpath = "//*[@id='iABCCodeMargin']")
		public static WebElement newItemClassificationABC_CodeMarginDropdOwn;

		@FindBy(xpath = "//*[@id='iABCCodeRevenue']")
		public static WebElement newItemClassificationABCCodeRevenueDropdown;

		@FindBy(xpath = "//*[@id='iABCCodeCarryingCost']")
		public static WebElement newItemClassificationABCCodeCarryingCostDropdown;

		@FindBy(xpath = "//*[@id='sBarcode1']")
		public static WebElement newItemClassificationBarcode1;

		@FindBy(xpath = "//*[@id='sBarcode2']")
		public static WebElement newItemClassificationBarcode2;

		@FindBy(xpath = "//*[@id='sBarcode3']")
		public static WebElement newItemClassificationBarcode3;

		@FindBy(xpath = "//*[@id='iUnit1']")
		public static WebElement newItemgridFirstrowUnit;

		@FindBy(xpath = "//*[@id='sBarcode1']")
		public static WebElement newItemgridFirstrowBarcode;

		// Grid element
		@FindBy(xpath = "//*[@id='sBatch1']")
		public static WebElement newItemClassificationgridFirstrowBatch;

		@FindBy(xpath = "//*[@id='iUnit2']")
		public static WebElement newItemClassificationgridSecondrowUnit;

		@FindBy(xpath = "//*[@id='sBarcode2']")
		public static WebElement newItemClassificationgridSecondrowBarcode;

		@FindBy(xpath = "//*[@id='sBatch2']")
		public static WebElement newItemClassificationgridSecondrowBatch;

		@FindBy(xpath = "//*[@id='iUnit3']")
		public static WebElement newItemClassificationgridThridrowUnit;

		@FindBy(xpath = "//*[@id='sBarcode3']")
		public static WebElement newItemClassificationgridThridrowBarcode;

		@FindBy(xpath = "//*[@id='sBatch3']")
		public static WebElement newItemClassificationgridThridrowBatch;

		@FindBy(xpath = "//*[@id='iUnit_input_settings']")
		public static WebElement newItemClassificationgridUnitSettings;

		@FindBy(xpath = "//div[@id='divTreeMenu']")
		public static WebElement treeUnitsDisplay;

		// Master Item Other Details
		@FindBy(xpath = "//*[@id='divBtnGroup4']/div/a")
		public static WebElement ItemNewOtherDetailsBtn;

		@FindBy(xpath = "//input[@id='iCostOfIssueAccount']")
		public static WebElement newOtherDetailsCostOfIssueitem;

		@FindBy(xpath = "//*[@id='iCostOfIssueAccount_table_body']/tr/td[2]")
		public static List<WebElement> newOtherDetailsCostOfIssueitemList;
		
		
		@FindBy(xpath = "//td[@id='iCostOfIssueAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement newOtherDetailsCostOfIssueitemsettingsBtn;

		@FindBy(xpath = "//input[@id='iStocksAccount']")
		public static WebElement newOtherDetailsStocksitem;

		@FindBy(xpath = "//*[@id='iStocksAccount_table_body']/tr/td[2]")
		public static List<WebElement> newOtherDetailsStocksitemList;
		
		
		@FindBy(xpath = "//td[@id='iStocksAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement newOtherDetailsiStocksitemsettingsBtn;

		@FindBy(xpath = "//input[@id='iSalesAccount']")
		public static WebElement newOtherDetailsSalesAccount;

		@FindBy(xpath = "//*[@id='iSalesAccount_table_body']/tr/td[2]")
		public static List<WebElement> newOtherDetailsSalesAccountList;
		
		
		
		@FindBy(xpath = "//td[@id='iSalesAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement newOtherDetailsSalesitemsettingsBtn;

		@FindBy(xpath = "//input[@id='iWIPAccount']")
		public static WebElement newOtherDetailsWIPitem;

		@FindBy(xpath = "//td[@id='iWIPAccount_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
		public static WebElement newOtherDetailsWIPitemsettingsBtn;

		@FindBy(xpath = "//input[@id='iCostofShortageStockAC']")
		public static WebElement newOtherDetailsCostofShortageStockAC;

		@FindBy(xpath = "//*[@id='iCostofShortageStockAC_table_body']/tr/td[2]")
		public static List<WebElement> newOtherDetailsCostofShortageStockACList;
		
		
		@FindBy(xpath = "//td[@id='iCostofShortageStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
		public static WebElement newOtherDetailsCostofShortageStockACsettingsBtn;

		@FindBy(xpath = "//input[@id='iCostofExcessStockAC']")
		public static WebElement newOtherDetailsCostofExcessStockAC;

		@FindBy(xpath = "//*[@id='iCostofExcessStockAC_table_body']/tr/td[2]")
		public static List<WebElement> newOtherDetailsCostofExcessStockACList;
		
		@FindBy(xpath = "//td[@id='iCostofExcessStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
		public static WebElement OtherDetailsCostofExcessStockACsettingsBtn;

		@FindBy(xpath = "//input[@id='iCostofSaleReturnAC']")
		public static WebElement OtherDetailsCostofSaleReturnAC;

		
		@FindBy(xpath = "//*[@id='iCostofSaleReturnAC_table_body']/tr/td[2]")
		public static List<WebElement> OtherDetailsCostofSaleReturnACList;
		
		
		@FindBy(xpath = "//td[@id='iCostofSaleReturnAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
		public static WebElement OtherDetailsCostofSaleReturnACsettingsBtn;

		@FindBy(xpath = "//input[@id='iPurchaseVarianceAC']")
		public static WebElement OtherDetailsPurchaseVarianceAC;

		@FindBy(xpath = "//td[@id='iPurchaseVarianceAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
		public static WebElement OtherDetailsPurchaseVarianceACsettingsBtn;

		@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
		public static WebElement newOtherDetailsSaveBtn;

		@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement newOtherDetailsCustCloseBtn;

		// Grid Elements
		@FindBy(xpath = "//*[@id='ioWarehouse1']")
		public static WebElement newOtherDetailsgridFirstrowWareHouse;

		@FindBy(xpath = "//*[@id='ioWarehouse_input_settings']/span")
		public static WebElement newGridWarehouseSettingBtn;

		@FindBy(xpath = "//*[@id='1']")
		public static WebElement newOtherDetailsgridFirstrowSupplier;

		@FindBy(xpath = "//*[@id='iSupplier_input_settings']/span")
		public static WebElement newGridSupplierSettingBtn;

		@FindBy(xpath = "//*[@id='sSupCode1']")
		public static WebElement newOtherDetailsgridFirstrowCode;

		@FindBy(xpath = "//*[@id='iStartDate1']")
		public static WebElement newOtherDetailsgridFirstrowStartDate;

		@FindBy(xpath = "//*[@id='iEndDate1']")
		public static WebElement newOtherDetailsgridFirstrowEnddate;

		@FindBy(xpath = "//*[@id='fRate1']")
		public static WebElement newOtherDetailsgridFirstrowRate;

		@FindBy(xpath = "//*[@id='iTolerance1']")
		public static WebElement newOtherDetailsgridFirstTolerance;

		@FindBy(xpath = "//*[@id='iLeadTime1']")
		public static WebElement newOtherDetailsgridFirstrowLeadTime;

		@FindBy(xpath = "//*[@id='iCreditDays1']")
		public static WebElement newOtherDetailsgridFirstrowUnitCreditDays;

		@FindBy(xpath = "//*[@id='iCreditLimit1']")
		public static WebElement newOtherDetailsgridFirstrowCreditLimit;

		@FindBy(xpath = "//*[@id='LeastDeliveryDate1']")
		public static WebElement newOtherDetailsgridFirstrowLastDeliveryDate;

		// Master Item Replenishment
		@FindBy(xpath = "//*[@id='divBtnGroup5']/div/a")
		public static WebElement ItemNewReplenishmentBtn;

		@FindBy(xpath = "//*[@id='iDefaultReplenishment']")
		public static WebElement newreplenishmentDefaultReplenishment;

		@FindBy(xpath = "//*[@id='iManufacturePolicy']")
		public static WebElement newreplenishmentManufacturePolicy;

		@FindBy(xpath = "//*[@id='iPackingBOM']")
		public static WebElement newreplenishmentPackingBOM;

		@FindBy(xpath = "//*[@id='iPackingBOM_input_settings']/span")
		public static WebElement newreplenishmentPackingBOMsettingsBtn;

		@FindBy(xpath = "//*[@id='iBOM']")
		public static WebElement newreplenishmentBOM;

		@FindBy(xpath = "//*[@id='iFlushing']")
		public static WebElement newreplenishmentFlushing;

		@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
		public static WebElement newreplenishmentSaveBtn;

		@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement newreplenishmentCustCloseBtn;

		// Grid
		@FindBy(xpath = "//*[@id='irWarehouse1']")
		public static WebElement newreplenishmentGridFirstRowWarehouse;

		@FindBy(xpath = "//*[@id='irStartdate1']")
		public static WebElement newreplenishmentGridFirstRowStartDate;

		@FindBy(xpath = "//*[@id='irEnddate1']")
		public static WebElement newreplenishmentGridFirstRowEndDate;

		@FindBy(xpath = "//*[@id='iReplenishqty1']")
		public static WebElement newreplenishmentGridFirstRowReplenishqty;

		@FindBy(xpath = "//*[@id='iReorderPolicy1']")
		public static WebElement newreplenishmentGridFirstRowReorderPolicy;

		@FindBy(xpath = "//*[@id='fSafetyStock1']")
		public static WebElement newreplenishmentGridFirstRowSafetyStock;

		@FindBy(xpath = "//*[@id='iSafetyLeadTime1']")
		public static WebElement newreplenishmentFirstRowSafetyLeadTime;

		@FindBy(xpath = "//*[@id='fReordercycle1']")
		public static WebElement newreplenishmentFirstRowReordercycle;

		@FindBy(xpath = "//*[@id='fReorderPoint1']")
		public static WebElement newreplenishmentFirstRowReorderPoint;

		@FindBy(xpath = "//*[@id='fReorderQuantity1']")
		public static WebElement newreplenishmentFirstRowReorderQuantity;

		@FindBy(xpath = "//*[@id='fMaxInventoryLevel1']")
		public static WebElement newreplenishmentFirstRowMaxInventoryLevel;

		@FindBy(xpath = "//*[@id='iDefaultVendor1']")
		public static WebElement newreplenishmentFirstRowDefaultVendor;

		@FindBy(xpath = "//*[@id='fMinOrderQuantity1']")
		public static WebElement newreplenishmentFirstRowMinOrderQuantity;

		@FindBy(xpath = "//*[@id='fMaxOrderQuantity1']")
		public static WebElement newreplenishmentFirstRowMaxOrderQuantity1;

		@FindBy(xpath = "//*[@id='fOrderMultiple1']")
		public static WebElement newreplenishmentFirstRowOrderMultiple;

		// OutLet Elements
		@FindBy(xpath = "//*[@id='divBtnGroup7']/div/a")
		public static WebElement ItemNewOutletBtn;

		@FindBy(xpath = "//*[@id='txtsrch-term0']")
		public static WebElement newOutletSearchOutlet;

		@FindBy(xpath = "//*[@id='cmbUserTypeMaster']")
		public static WebElement newOutletAdvanceSearch;

		@FindBy(xpath = "//*[@id='chkResizeGrid0']/span")
		public static WebElement newOutletResizeBtn;

		@FindBy(xpath = "//*[@id='chkRetainSelection']")
		public static WebElement newOutletRetainSelctionCheckBox;

		@FindBy(xpath = "//a[contains(text(),'Tariff')]")
		public static WebElement tariffTab;

		@FindBy(xpath = "//input[@id='iTariffCode1']")
		public static WebElement tariffGridTariffCode;

		@FindBy(xpath = "//input[@id='iAffectedDate1']")
		public static WebElement tariffGridAffecteddate;

		@FindBy(xpath = "//*[@id='btnMasterSaveClick']/i")
		public static WebElement itemCreationScreenSaveBtn;

		@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement itemCreationScreenCustCloseBtn;

		@FindBy(xpath = "//*[@id='doc_Searchbox']")
		public static WebElement searchBoxInDocumentCustomization;

		@FindBy(xpath = "//*[@id='liSearchOn']/a")
		public static WebElement search_SearchOnBtn;

		@FindBy(xpath = "//*[@id='liAdvanceSearch']/a")
		public static WebElement search_AdvanceSearch;

		@FindBy(xpath = "//input[@id='cmbUserTypeMaster']")
		public static WebElement cmbSearchTxt;

		@FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_image']/span")
		public static WebElement cmbSearchExpansionBtn;

		@FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_settings']/span")
		public static WebElement cmbSearchSettingBtn;

		@FindBy(xpath = "//a[@id='chkResizeGrid0']")
		public static WebElement resizeGridBtn;

		@FindBy(xpath = "//input[@id='chkRetainSelection']")
		public static WebElement retainSelectionCheckbox;

		@FindBy(xpath = "//label[@id='oncheckaccorderan0']")
		public static WebElement checkAccorderanBtn;

		@FindBy(xpath = "//*[@id='iTreeId0']")
		public static WebElement treeIdDropdown;

		@FindBy(xpath = "//*[@id='iTreeViewId0']")
		public static WebElement treeViewIdDropdown;

		// WareHouse Master

		@FindBy(xpath = "//input[@id='iBins']")
		public static WebElement binsText;

		@FindBy(xpath = "//*[@id='iBins_input_image']/span")
		public static WebElement bins_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iBins_input_settings']/span")
		public static WebElement bins_SettingBtn;

		@FindBy(xpath = "//input[@id='iPhysInventoryCountingFrequency']")
		public static WebElement physInventoryCountingFrequencyTxt;

		@FindBy(xpath = "//select[@id='iWarehouseType']")
		public static WebElement warehouseTypeDropdown;

		@FindBy(xpath = "//input[@id='bDontMaintainBin']")
		public static WebElement dontMaintainBinCheckBox;

		// State Master

		@FindBy(xpath = "//input[@id='iCountry']")
		public static WebElement countryTxt;

		@FindBy(xpath = "//*[@id='iCountry_input_image']/span")
		public static WebElement country_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iCountry_input_settings']/span")
		public static WebElement country_SettingBtn;

		// City Master

		@FindBy(xpath = "//input[@id='iState']")
		public static WebElement stateTxt;

		@FindBy(xpath = "//*[@id='iState_input_image']/span")
		public static WebElement state_ExpansionBtn;

		@FindBy(xpath = "//*[@id='iState_input_settings']/span")
		public static WebElement state_SettingBtn;

		// Master Delete Field

		@FindBy(xpath = "//*[@id='btnDelete']/i")
		public static WebElement deleteBtn;

		@FindBy(xpath = "//*[@id='LandingGridBody']/tr[1]/td[11]")
		public static WebElement accountNewCreationNameOfLane1;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
		public static WebElement accountNewCreationNameOfLane2;

		@FindBy(xpath = "//*[@id='LandingGridBody']/tr[1]/td[11]")
		public static WebElement masterCreationNameOfLane1;

		@FindBy(xpath = "//*[@id='LandingGridBody']/tr[2]/td[11]")
		public static WebElement masterCreationNameOfLane2;

		@FindBy(xpath = "//*[@id='LandingGridBody']/tr[1]/td[12]")
		public static WebElement masterCreationCodeOfLane1;

		@FindBy(xpath = "//*[@id='LandingGridBody']/tr[2]/td[12]")
		public static WebElement masterCreationCodeOfLane2;

		@FindBy(xpath = "//*[@id='LandingGridBody']/tr[1]/td[13]")
		public static WebElement masterCreationTypeOfLane1;

		@FindBy(xpath = "//*[@id='LandingGridBody']/tr[2]/td[13]")
		public static WebElement masterCreationTypeOfLane2;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement accountFirstCheckBoxToSelection;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[5]/span[1]")
		public static WebElement accountGroupTitleDisplay;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[2]/span[1]")
		public static WebElement productGroupTitleDisplay;

		// Master Customization

		@FindBy(xpath = "//i[@class='icon-expand']")
		public static WebElement plusBtn;

		@FindBy(xpath = "//i[@class='icon-collepse']")
		public static WebElement minusBtn;

		@FindBy(xpath = "//span[contains(text(),'Master Fields')]")
		public static WebElement masterFieldsOption;

		@FindBy(xpath = "//*[@id='masterFields_list']/li[1]/span")
		public static WebElement generalTab;

		@FindBy(xpath = "//span[@class='font-5'][contains(text(),'Main')]")
		public static WebElement generalMainTab;

		@FindBy(xpath = "//div[@id='mainTab_0']//tbody//tr[1]//td[4]")
		public static WebElement accountCustomizeName;

		@FindBy(xpath = "//div[@id='mainTab_0']//tr[2]//td[4]")
		public static WebElement accountCustomizeCode;

		@FindBy(xpath = "//div[@id='mainTab_0']//tr[3]//td[4]")
		public static WebElement accountCustomizeAccountType;

		@FindBy(xpath = "//div[@id='mainTab_0']//tr[4]//td[4]")
		public static WebElement accountCustomizeCreditLimit;

		@FindBy(xpath = "//div[@id='mainTab_0']//tr[5]//td[4]")
		public static WebElement accountCustomizeCreditDays;

		@FindBy(xpath = "//div[@id='tabId_1']//span[@class='font-5'][contains(text(),'Header Details')]")
		public static WebElement generalHeaderDetailsTab;

		@FindBy(xpath = "//div[@id='tabId_1']//tbody[contains(@class,'ui-sortable')]//tr[1]//td[4]")
		public static WebElement accountCustomizeChequeDiscountLimit;

		@FindBy(xpath = "//div[@id='HeaderDetails_0']//tr[2]//td[4]")
		public static WebElement accountCustomizeRateOfInterest;

		@FindBy(xpath = "//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[3]/td[4]")
		public static WebElement accountCustomizeBankAc;

		@FindBy(xpath = "//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[4]/td[4]")
		public static WebElement accountCustomizePDCDiscountedAccount;

		@FindBy(xpath = "//*[@id='btnMove_Field_MasterCust']/div[1]/span")
		public static WebElement accountHeaderMoveFiledBtn;

		@FindBy(xpath = "//div[contains(text(),'Preview')]")
		public static WebElement accountHeaderPreview;

		@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
		public static WebElement accountSaveBtn;

		@FindBy(xpath = "//*[@id='btnAdd_Field_MasterCust']/div[1]/span")
		public static WebElement accountAddBtn;

		@FindBy(xpath = "//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[1]/span")
		public static WebElement accountCustCloseBtn;

		@FindBy(xpath = "//span[@class='Flabel theme_icon-color'][contains(text(),'Settings')]")
		public static WebElement settingOption;

		@FindBy(xpath = "//div[@id='tabId_68']//span[@class='font-5'][contains(text(),'Header Details')]")
		public static WebElement settingsHeaderDetailsTab;

		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[1]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditFirstRowBtn;

		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[2]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditSecondRowBtn;

		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[3]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditThirdRowBtn;

		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[4]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditFourthRowBtn;

		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[5]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditFifthRowBtn;

		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[6]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditSixthRowBtn;

		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[7]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditSeventhRowBtn;

		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[8]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditEighthRowBtn;

		@FindBy(xpath = "//div[contains(text(),'Move Field')]")
		public static WebElement accountSettingsHeaderMoveFiledBtn;

		@FindBy(xpath = "//div[contains(text(),'Preview')]")
		public static WebElement accountSettingsHeaderPreview;

		@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
		public static WebElement accountSettingsSaveBtn;

		@FindBy(xpath = "//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
		public static WebElement accountSettingsAddBtn;

		@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		public static WebElement accountSettingsCustCloseBtn;

		@FindBy(xpath = "//div[@id='tabId_68']//span[@class='font-5'][contains(text(),'Body Details')]")
		public static WebElement settingsBodyDetailsTab;

		@FindBy(xpath = "//div[@id='BodyDetails_1']//div[@class='scrollable tbl-emptyfields-mastercust']")
		public static WebElement settingsBodyDetailsEmptyTab;

		@FindBy(xpath = "//span[@class='Flabel theme_icon-color'][contains(text(),'Details')]")
		public static WebElement accountMasterFieldDetailsOption;

		@FindBy(xpath = "//div[@id='tabId_69']//span[@class='font-5'][contains(text(),'Header Details')]")
		public static WebElement detailsHeaderDetailsTab;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[1]/td[4]")
		public static WebElement detailsHeaderAddress;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[2]/td[4]")
		public static WebElement detailsHeaderCity;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[3]/td[4]")
		public static WebElement detailsHeaderPin;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[4]/td[4]")
		public static WebElement detailsHeaderDeliveryAddress;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[5]/td[4]")
		public static WebElement detailsHeaderCityOne;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[6]/td[4]")
		public static WebElement detailsHeaderPinOne;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[7]/td[4]")
		public static WebElement detailsHeaderSendEmailToCustomer;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[8]/td[4]")
		public static WebElement detailsHeaderAllowCustomerPortal;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[9]/td[4]")
		public static WebElement detailsHeaderEmail;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[10]/td[4]")
		public static WebElement detailsHeaderPassword;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[11]/td[4]")
		public static WebElement detailsHeaderTelNo;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[12]/td[4]")
		public static WebElement detailsHeaderFaxNo;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[13]/td[4]")
		public static WebElement detailsHeaderBankAccountName;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[14]/td[4]")
		public static WebElement detailsHeaderBankAccountNumber;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[15]/td[4]")
		public static WebElement detailsHeaderIFSCCode;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[16]/td[4]")
		public static WebElement detailsHeaderPaymentType;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[17]/td[4]")
		public static WebElement detailsHeaderFinanceEmail;

		@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[18]/td[4]")
		public static WebElement detailsHeaderPortalEmail;

		@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
		public static WebElement detailsHeaderBankSaveBtn;

		@FindBy(xpath = "//div[contains(text(),'Move Field')]")
		public static WebElement detailsHeaderMoveFieldBtn;

		@FindBy(xpath = "//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
		public static WebElement detailsHeaderAddBtn;

		@FindBy(xpath = "//div[contains(text(),'Preview')]")
		public static WebElement detailsHeaderPreviewBtn;

		@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		public static WebElement detailsHeaderCustCloseBtn;

		@FindBy(xpath = "//div[@id='tabId_69']//span[@class='font-5'][contains(text(),'Body Details')]")
		public static WebElement detailsBodyDetailsTab;

		@FindBy(xpath = "//div[@id='BodyDetails_2']//div[@class='scrollable tbl-emptyfields-mastercust']")
		public static WebElement detailsBodyDetailsEmptyTab;

		@FindBy(xpath = "//*[@id='masterFields_list']/li[4]/span")
		public static WebElement accountMasterFieldPrintLayoutOption;

		@FindBy(xpath = "//div[@id='tabId_70']//span[@class='font-5'][contains(text(),'Header Details')]")
		public static WebElement printlayoutHeaderDetailsTab;

		@FindBy(xpath = "//div[@id='HeaderDetails_3']//div[@class='scrollable tbl-emptyfields-mastercust']")
		public static WebElement printLayoutHeaderDetailsEmpty;

		@FindBy(xpath = "//div[@id='tabId_70']//li[2]//a[1]")
		public static WebElement printLayouBodyDetailsTab;

		@FindBy(xpath = "//*[@id='BodyDetails_3']/div/div/table/tbody/tr[1]/td[4]")
		public static WebElement printlayoutBodyVoucherType;

		@FindBy(xpath = "//*[@id='BodyDetails_3']/div/div/table/tbody/tr[2]/td[4]")
		public static WebElement printLayoutBodyPrintlayout;

		@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
		public static WebElement printLayoutSaveBtn;

		@FindBy(xpath = "//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
		public static WebElement printLayoutAddBtn;

		@FindBy(xpath = "//div[contains(text(),'Preview')]")
		public static WebElement printLayoutPreviewBtn;

		@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		public static WebElement printLayoutCustCloseBtn;

		@FindBy(xpath = "//span[contains(text(),'Unique Constraints')]")
		public static WebElement accountMasterFieldsUniqueConstraintsOption;

		@FindBy(xpath = "//div[@id='tabContent_UConstraints_MasterCust']//div[@id='btnAddOrEdit_UniqueConstraints']")
		public static WebElement UniqueConstraintsAddBtn;

		@FindBy(xpath = "//div[@id='tabContent_UConstraints_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
		public static WebElement UniqueConstraintsDeleteBtn;

		@FindBy(xpath = "//div[@id='tabContent_UConstraints_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		public static WebElement UniqueConstraintsCustCloseBtn;

		@FindBy(xpath = "//input[@id='txtConstraintName']")
		public static WebElement ConstraintNameTxt;

		@FindBy(xpath = "//select[@id='ddlConstraintTabList']")
		public static WebElement UniqueConstraints_TabsDropdown;

		@FindBy(xpath = "//*[@id='tab_Main_UcFields']/i")
		public static WebElement UniqueConstraints_MainExpansionBtn;

		@FindBy(xpath = "//*[@id='chkList_MainFields_1']/div[1]")
		public static WebElement accountUniqueConstraints_Main_NameChekbox;

		@FindBy(xpath = "//div[@id='chkList_MainFields_1']//div[2]")
		public static WebElement accountUniqueConstraints_Main_CodeChekbox;

		@FindBy(xpath = "//div[@id='chkList_MainFields_1']//div[3]")
		public static WebElement accountUniqueConstraints_Main_AccountTypeCheckbox;

		@FindBy(xpath = "//div[@id='chkList_MainFields_1']//div[4]")
		public static WebElement accountUniqueConstraints_Main_CreditLimitCheckBox;

		@FindBy(xpath = "//div[@id='chkList_MainFields_1']//div[5]")
		public static WebElement accountUniqueConstraints_Main_CreditDays;

		@FindBy(xpath = "//div[@id='tab_Header_UcFields']//i[@class='pull-right icon-expand theme_icon-color']")
		public static WebElement UniqueConstraints_HeaderExpansionBtn;

		@FindBy(xpath = "//*[@id='chkList_HeaderFields_1']/div[1]")
		public static WebElement UniqueConstraints_Header_ChequeDiscountLimitChekbox;

		@FindBy(xpath = "//*[@id='chkList_HeaderFields_1']/div[2]")
		public static WebElement UniqueConstraints_Header_RateOfInterestChekbox;

		@FindBy(xpath = "//*[@id='chkList_HeaderFields_1']/div[3]")
		public static WebElement UniqueConstraints_Header_BankAcChekbox;

		@FindBy(xpath = "//*[@id='chkList_HeaderFields_1']/div[4]")
		public static WebElement UniqueConstraints_Header_PDCDiscountedChekbox;

		@FindBy(xpath = "//*[@id='tab_Body_UcFields']/i")
		public static WebElement UniqueConstraints_BodyExpansionBtn;

		@FindBy(xpath = "//span[contains(text(),'Rules')]")
		public static WebElement RulesOption;

		@FindBy(xpath = "//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[1]/div[1]")
		public static WebElement accountRules_SaveBtn;

		@FindBy(xpath = "//div[contains(text(),'New')]")
		public static WebElement accountRules_NewBtn;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]")
		public static WebElement accountRules_DeleteBtn;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]")
		public static WebElement accountRules_CustCloseBtn;

		@FindBy(xpath = "//*[@id='txtMasterRuleName_MasterRules']")
		public static WebElement Rules_RuleNameText;

		@FindBy(xpath = "//*[@id='chkCreatingGroup_Rule_MasterRules']")
		public static WebElement Rules_CreatingGroupChekbox;

		@FindBy(xpath = "//*[@id='chkNewRecord_Rule_MasterRules']")
		public static WebElement Rules_NewRecordChekbox;

		@FindBy(xpath = "//*[@id='chkEdit_Rule_MasterRules']")
		public static WebElement Rules_EditChekbox;

		@FindBy(xpath = "//*[@id='chkLoad_Rule_MasterRules']")
		public static WebElement Rules_LoadChekbox;

		@FindBy(xpath = "//*[@id='chkBeforeSave_Rule_MasterRules']")
		public static WebElement Rules_BeforeSaveChekbox;

		@FindBy(xpath = "//*[@id='chkOnLeave_Rule_MasterRules']")
		public static WebElement Rules_OnLeaveChekbox;

		@FindBy(xpath = "//*[@id='chkBeforeDelete_Rule_MasterRules']")
		public static WebElement Rules_BeforeDeleteChekbox;

		@FindBy(xpath = "//*[@id='chkOnEnter_Rule_MasterRules']")
		public static WebElement Rules_OnEnterChekbox;

		@FindBy(xpath = "//label[contains(text(),'Active')]")
		public static WebElement Rules_ActiveChekbox;

		@FindBy(xpath = "//*[@id='Conditions-Context_Menu']/li[3]")
		public static WebElement Rules_NoConditionChekbox;

		@FindBy(xpath = "//*[@id='allMasterCustTabs']/li[4]/span")
		public static WebElement rules_ExternalModules;

		@FindBy(xpath = "//select[@id='ddlOnEvent_MasterExternalModule']")
		public static WebElement rules_ExternalModulesOnEventDropdown;

		@FindBy(xpath = "//input[@id='txtbuttonCaption_MasterExternalModule']")
		public static WebElement rules_ExternalModulesButtonCaption;

		@FindBy(xpath = "//select[@id='ddlModuleType_MasterExternalModule']")
		public static WebElement rules_ExternalModules_ModuleTypeBtn;

		@FindBy(xpath = "//select[@id='ddlAllDllFiles_MasterExternalModule']")
		public static WebElement rules_ExternalModules_ModuleNameDropdown;

		@FindBy(xpath = "//select[@id='ddlClassNames_MasterExternalModule']")
		public static WebElement rules_ExternalModulesClassNameDropdown;

		@FindBy(xpath = "//select[@id='ddlClassMethods_MasterExternalModule']")
		public static WebElement rules_ExternalModulesFuctionalNameDropdown;

		@FindBy(xpath = "//div[contains(text(),'Update')]")
		public static WebElement rules_ExternalModulesUpdateBtn;

		@FindBy(xpath = "//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
		public static WebElement rules_ExternalModulesSaveBtn;

		@FindBy(xpath = "//div[contains(text(),'Edit')]")
		public static WebElement rules_ExternalModulesEditBtn;

		@FindBy(xpath = "//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
		public static WebElement rules_ExternalModulesDeleteBtn;

		@FindBy(xpath = "//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		public static WebElement rules_ExternalModulesCustCloseBtn;

		@FindBy(xpath = "//span[contains(text(),'Info Panel Customization')]")
		public static WebElement itemInfoPanelCustomizationTab;

		@FindBy(xpath = "//body[@class='custom_scrollbar']/section[@id='mainDiv']/div[@id='id_focus8_wrapper_default']/div[@class='content-wrapper']/section[@id='page_Content']/div[@class='container']/div[@id='mainLandingDiv']/div[@id='masterFirstDiv']/div[@class='tab-content']/div[@id='divLanding']/div[@id='divSecondsub']/div/div[@class='col-xs-12 col-sm-8 col-md-9 col-lg-9 padding-left-right5 mainDivCustomWidth']/div[@id='tabContent_IPCust_MasterCust']/div[@class='col-xs-12 col-sm-12 padding0']/div[@class='pull-right']/div[1]")
		public static WebElement iteminfoPanelCust_AddBtn;

		@FindBy(xpath = "//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
		public static WebElement infoPanelCust_DeleteBtn;

		@FindBy(xpath = "//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		public static WebElement infoPanelCust_CustCloseBtn;

		@FindBy(xpath = "//strong[contains(text(),'Credit History')]")
		public static WebElement infoPanelCustCreditHistory;

		@FindBy(xpath = "//div[@id='divPanel_2']//strong[contains(text(),'Ageing Analysis')]")
		public static WebElement infoPanelCustAgeingAnalysis;

		@FindBy(xpath = "//strong[contains(text(),'Ageing Analysis Base')]")
		public static WebElement infoPanelCustAgeingAnalysisBase;

		@FindBy(xpath = "//strong[contains(text(),'Ageing Analysis Local')]")
		public static WebElement infoPanelCustAgeingAnalysisLocal;

		@FindBy(xpath = "//strong[contains(text(),'Authorization')]")
		public static WebElement infoPanelAuthorization;

		@FindBy(xpath = "//span[@class='Flabel'][contains(text(),'Reports')]")
		public static WebElement accountReportsTab;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
		public static WebElement accountReports_SaveBtn;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		public static WebElement accountReports_CustCloseBtn;

		@FindBy(xpath = "//*[@id='AllReportsDiv_MasterCust']/div[1]/label/input")
		public static WebElement reports_AdvancedbudgetReportChkBox;

		@FindBy(xpath = "//div[@id='AllReportsDiv_MasterCust']//div[1]//label[1]")
		public static WebElement reports_MasterInfoChkBox;

		@FindBy(xpath = "//div[@class='col-xs-12 col-sm-8 col-md-8 col-lg-9 padding0']//div[2]//label[1]")
		public static WebElement reports_ABCAnalysisAmountChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[3]//label[1]")
		public static WebElement reports_BankBookChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[4]//label[1]")
		public static WebElement reports_BankreconciliationstatementChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[5]//label[1]")
		public static WebElement reports_CashBookChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[6]//label[1]")
		public static WebElement reports_ComparativeAnalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[7]//label[1]")
		public static WebElement reports_CustomerAgeingDetailsAnalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[8]//label[1]")
		public static WebElement reports_CustomerageingdetailbyduedateChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[9]//label[1]")
		public static WebElement reports_CustomerageingsummaryanalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[10]//label[1]")
		public static WebElement reports_CustomerbillwisesummaryChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[11]//label[1]")
		public static WebElement reports_CustomerduedateanalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[12]//label[1]")
		public static WebElement reports_CustomerlistingofoutstandingbillsChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[13]//label[1]")
		public static WebElement reports_CustomeroverdueanalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[14]//label[1]")
		public static WebElement reports_CustomeroverduesummaryChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[15]//label[1]")
		public static WebElement reports_CustomerstatementsChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[16]//label[1]")
		public static WebElement reports_CustomersummaryageingbyduedateChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[17]//label[1]")
		public static WebElement reports_IncomeExpenseTrendChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[18]//label[1]")
		public static WebElement reports_InterestcalculationChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[19]//label[1]")
		public static WebElement reports_LedgerChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[20]//label[1]")
		public static WebElement reports_LedgerdetailChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[21]//label[1]")
		public static WebElement reports_MonthlySalesChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[22]//label[1]")
		public static WebElement reports_PeakandlowbalanceamountChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[23]//label[1]")
		public static WebElement reports_PettycashbookChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[24]//label[1]")
		public static WebElement reports_PurchaseregisterChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[25]//label[1]")
		public static WebElement reports_PurchasereturnregisterChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[26]//label[1]")
		public static WebElement reports_PurchasesgroupedbydepartmentChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[27]//label[1]")
		public static WebElement reports_PurchasesgroupedbyItemChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[28]//label[1]")
		public static WebElement reports_PurchasesgroupedbyvendorChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[29]//label[1]")
		public static WebElement reports_SalesdaybookChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[30]//label[1]")
		public static WebElement reports_SalesgroupedbycustomerChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[31]//label[1]")
		public static WebElement reports_salesgroupedbydepartmentrChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[32]//label[1]")
		public static WebElement reports_SalesgroupedbyItemChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[33]//label[1]")
		public static WebElement reports_SalesreturnregisterChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[34]//label[1]")
		public static WebElement reports_SchedulesChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[35]//label[1]")
		public static WebElement reports_SubledgerChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[36]//label[1]")
		public static WebElement reports_SummarypurchaseregisterChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[37]//label[1]")
		public static WebElement reports_SummarysalesregisterChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[38]//label[1]")
		public static WebElement reports_TopCustomersChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[39]//label[1]")
		public static WebElement reports_TradingaccountrChkBox;

		@FindBy(xpath = "//div[40]//label[1]")
		public static WebElement reports_TransactionstypeanalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[41]//label[1]")
		public static WebElement reports_VendorageingdetailanalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[42]//label[1]")
		public static WebElement reports_VendorageingdetailbyduedateChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[43]//label[1]")
		public static WebElement reports_VendorageingsummaryanalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[44]//label[1]")
		public static WebElement reports_VendorbillwisesummaryChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[45]//label[1]")
		public static WebElement reports_VendorduedateanalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[46]//label[1]")
		public static WebElement reports_VendorlistingofoutstandingbillsChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[47]//label[1]")
		public static WebElement reports_VendoroverdueanalysisChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[48]//label[1]")
		public static WebElement reports_VendoroverduesummaryChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[49]//label[1]")
		public static WebElement reports_VendorstatementsChkBox;

		@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[50]//label[1]")
		public static WebElement reports_VendorsummaryageingbyduedateChkBox;

		// Create Tabs
		@FindBy(xpath = "//button[@id='btnCreateTab_MCust']")
		public static WebElement createTab;

		@FindBy(xpath = "//a[contains(text(),'Tree Tab')]")
		public static WebElement createTabTreeTab;

		@FindBy(xpath = "//input[@id='txtNewTreeTabCaption']")
		public static WebElement treeTabCaptionTxt;

		@FindBy(xpath = "//input[@id='txtNewTreeTabName']")
		public static WebElement treeTabTabNameTxt;

		@FindBy(xpath = "//input[@id='fOption_tab_masterName']")
		public static WebElement treeTabNewMastertxt;

		@FindBy(xpath = "//*[@id='fOption_tab_masterName_input_image']/span")
		public static WebElement treeTabNewMasterdropdown;

		@FindBy(xpath = "//*[@id='fOption_tab_masterName_input_settings']/span")
		public static WebElement treeTab_NewMasterSettingsBtn;

		@FindBy(xpath = "//input[@id='txtNewTreeTabFieldCaption']")
		public static WebElement treeTab_FieldCaptiontxt;

		@FindBy(xpath = "//input[@id='txtNewTreeTabFieldName']")
		public static WebElement treeTab_FieldNameTxt;

		@FindBy(xpath = "//input[@id='bIsTreeHiddenTab']")
		public static WebElement treeTab_HiddenChkBox;

		@FindBy(xpath = "//div[@id='fOption_tab_masterName_customize_popup_container']")
		public static WebElement treeTab_NewMaster_ContainerTxt;

		@FindBy(xpath = "//div[@id='fOption_tab_masterName_customize_popup_footer']//input[1]")
		public static WebElement treeTab_NewMaster_StanadrdfieldsBtn;

		@FindBy(xpath = "//select[@id='fOption_tab_masterName_customize_popup_standardfields_list']")
		public static WebElement treeTab_NewMaster_Stanadrdfields_Fielddropdown;

		@FindBy(xpath = "//input[@id='fOption_tab_masterName_customize_popup_standardfields_header']")
		public static WebElement treeTab_NewMaster_Stanadrdfields_headerTxt;

		@FindBy(xpath = "//select[@id='fOption_tab_masterName_customize_popup_standardfields_alignment']")
		public static WebElement treeTab_NewMaster_Stanadrdfields_Allignmentdropdown;

		@FindBy(xpath = "//input[@id='fOption_tab_masterName_customize_popup_standardfields_width']")
		public static WebElement treeTab_NewMaster_Stanadrdfields_WidthTxt;

		@FindBy(xpath = "//div[@id='divSecondsub']//input[3]")
		public static WebElement treeTab_NewMaster_Stanadrdfields_OkBtn;

		@FindBy(xpath = "//div[@id='divSecondsub']//input[4]")
		public static WebElement treeTab_NewMaster_Stanadrdfields_CancelBtn;

		@FindBy(xpath = "//div[@id='fOption_tab_masterName_search_container']//input[2]")
		public static WebElement treeTab_NewMaster_deleteColumnBtn;

		@FindBy(xpath = "//div[@id='divSecondsub']//input[3]")
		public static WebElement treeTab_NewMaster_OkBtn;

		@FindBy(xpath = "//div[@id='divSecondsub']//input[4]")
		public static WebElement treeTab_NewMaster_CancelBtn;

		@FindBy(xpath = "//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[1]")
		public static WebElement treeTab_OkBtn;

		@FindBy(xpath = "//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
		public static WebElement treeTab_UpdateOkBtn;

		@FindBy(xpath = "//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[2]")
		public static WebElement treeTab_CancelBtn;

		@FindBy(xpath = "//a[contains(text(),'Document Tab')]")
		public static WebElement createTab_DocumentTab;

		@FindBy(xpath = "//input[@id='txtNewDocTabCaption']")
		public static WebElement documentTab_TabCaption;

		@FindBy(xpath = "//input[@id='txtNewDocTabName']")
		public static WebElement documentTab_TabName;

		@FindBy(xpath = "//input[@id='bIsDocHiddenTab']")
		public static WebElement documentTab_HiddenChkbox;

		@FindBy(xpath = "//div[@id='MCustomize_CreateDocTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
		public static WebElement documentTab_OkBtn;

		@FindBy(xpath = "//div[@id='MCustomize_CreateDocTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Cancel')]")
		public static WebElement documentTab_CancelBtn;

		@FindBy(xpath = "//label[@id='lblNameError_DocTab']")
		public static WebElement customizeMasterCreateTabDocumentTabMessage;

		@FindBy(xpath = "//span[contains(text(),'Document Tab')]")
		public static WebElement customizeMasterCreateDocumentTabNewlyCreate;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]/span[1]")
		public static WebElement customizeMasterCreateDocumentTabNewlyHeaderDetails;

		@FindBy(xpath = "//div[@id='HeaderDetails_5']//div[@class='scrollable tbl-emptyfields-mastercust']")
		public static WebElement customizeMasterCreateDocumentTabNewlyBlankInHeaderDetails;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]/span[1]")
		public static WebElement customizeMasterCreateDocumentTabNewlyBodyDetails;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
		public static WebElement customizeMasterCreateDocumentTabFieldName;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")
		public static WebElement customizeMasterCreateDocumentTabDocument;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")
		public static WebElement customizeMasterCreateDocumentTabCreatedDate;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]")
		public static WebElement customizeMasterCreateDocumentTabLastModified;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[4]")
		public static WebElement customizeMasterCreateDocumentFileSize;

		@FindBy(xpath = "//a[contains(text(),'Create Tab')]")
		public static WebElement createTab_CreateTab;

		@FindBy(xpath = "//div[@id='MCustomize_CreateDocTab_Modal']//h4[@class='modal-title'][contains(text(),'Tab Details')]")
		public static WebElement createTab_TabDetailsLabel;

		@FindBy(xpath = "//input[@id='txtNewTabCaption']")
		public static WebElement createTab_TabCaptionTxt;

		@FindBy(xpath = "//input[@id='txtNewTabName']")
		public static WebElement createTab_TabNameTxt;

		@FindBy(xpath = "//input[@id='bIsHiddenTab']")
		public static WebElement createTab_PopHiddenChkbox;

		@FindBy(xpath = "//*[@id='MCustomize_CreateTab_Modal']/div/div/div[3]/button[1]")
		public static WebElement createTab_PopOkBtn;

		@FindBy(xpath = "//*[@id='MCustomize_CreateTab_Modal']/div/div/div[3]/button[2]")
		public static WebElement createTab_PopCancelBtn;

		@FindBy(xpath = "//label[@id='lblNameError_NewTab']")
		public static WebElement customizeMasterCreateTabCreateTabMessage;

		// Newly Created Create Tab
		@FindBy(xpath = "//span[contains(text(),'Create Tab')]")
		public static WebElement customizeMasterCreateCreateTabNewlyCreateTabCaption;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/ul[1]/li[1]/a[1]/span[1]")
		public static WebElement customizeMasterCreateCreateTabHeaderDetails;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]")
		public static WebElement customizeMasterCreateCreateTabBlankHeaderDetails;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/ul[1]/li[2]/a[1]/span[1]")
		public static WebElement customizeMasterCreateCreateTabBodyDetails;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]")
		public static WebElement customizeMasterCreateCreateTabBlankBodyDetails;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[2]")
		public static WebElement customizeMasterCreateCreateTabNewlyCreateTabSaveButton;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[3]/div[2]")
		public static WebElement customizeMasterCreateCreateTabAddButton;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[4]/div[2]")
		public static WebElement customizeMasterCreateCreateTabPreviewButton;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[5]/div[2]")
		public static WebElement customizeMasterCreateCreateTabCloseButton;

		@FindBy(xpath = "//button[@id='btnDeleteTab_MCust']")
		public static WebElement tabs_DeleteBtn;

		@FindBy(xpath = "//label[@id='lblNameError_TreeTab']")
		public static WebElement customizeMasterCreateTabsMessage;

		@FindBy(xpath = "//label[@id='lblMasterNameError_TreeTab']")
		public static WebElement customizeMasterCreateTabsMasterNameMessage;

		@FindBy(xpath = "//span[contains(text(),'Tree Tab')]")
		public static WebElement customizeMasterCreateTreeTabNewlyCreate;

		@FindBy(xpath = "//input[@id='txtEditTabCaption']")
		public static WebElement customizeMasterCreateTreeTabNewlyCreateTabCaption;

		@FindBy(xpath = "//div[@id='MCustomize_EditTab_Modal']//label[@class='col-sm-12 col-xs-12 col-md-5 col-lg-5 form-control-static Flabel'][contains(text(),'Hidden')]")
		public static WebElement customizeMasterCreateTreeTabNewlyCreateHidden;

		@FindBy(xpath = "//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
		public static WebElement customizeMasterCreateTreeTabNewlyCreateOkButton;

		@FindBy(xpath = "//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Cancel')]")
		public static WebElement customizeMasterCreateTreeTabNewlyCreateCancelButton;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[1]/a[1]/span[1]")
		public static WebElement customizeMasterCreateTreeTabNewlyHeaderDetails;

		@FindBy(xpath = "//div[@id='HeaderDetails_4']//div[@class='scrollable tbl-emptyfields-mastercust']")
		public static WebElement customizeMasterCreateTreeTabNewlyBlankInHeaderDetails;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[2]/a[1]/span[1]")
		public static WebElement customizeMasterCreateTreeTabNewlyBodyDetails;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
		public static WebElement customizeMasterCreateTreeTabNewlyFieldInBodyDetails;

		@FindBy(xpath = "//span[contains(text(),'Tree Tab Delete')]")
		public static WebElement CustomizeCreateTreeTab;

		@FindBy(xpath = "//*[@id='lblWarnMessage_TabModal']")
		public static WebElement CustomizeDeleteTabMessage;

		@FindBy(xpath = "//div[@id='MCustomize_DeleteTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Yes')]")
		public static WebElement CustomizeDeleteTabMessageYesBtn;

		@FindBy(xpath = "//div[@id='MCustomize_DeleteTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'No')]")
		public static WebElement CustomizeDeleteTabMessageNoBtn;

		// Master Customization Extra Fields Creation On Click Add button
		@FindBy(xpath = "//input[@id='ExtraField_FieldCaption']")
		public static WebElement extraFields_FieldDetailsTab;

		@FindBy(xpath = "//span[contains(text(),'Field Details')]")
		public static WebElement extraFields_ClickOnFieldDetailsTab;

		@FindBy(xpath = "//*[@id='ExtraField_FieldCaption']")
		public static WebElement extraFields_FieldDetailsCaption;

		@FindBy(xpath = "//div[@id='tab_FieldDetails_ExtraField']//div[1]//div[2]//div[1]//input[1]")
		public static WebElement extraFields_FieldDetailsName;

		@FindBy(xpath = "//*[@id='ddlDatatype_ExtraField']")
		public static WebElement extraFields_FieldDetailsDatTypeDropdown;

		@FindBy(xpath = "//*[@id='ExtraField_DefaultValue']")
		public static WebElement extraFields_FieldDetailsDefaultValue;

		@FindBy(xpath = "//*[@id='ExtraField_BannerText']")
		public static WebElement extraFields_FieldDetailsBannerText;

		@FindBy(xpath = "//*[@id='ExtraField_MaxSize']")
		public static WebElement extraFields_FieldDetails_MaxSize;

		@FindBy(xpath = "//*[@id='ExtraField_ControlType']")
		public static WebElement extraFields_FieldDetailsControlTypeDropdown;

		@FindBy(xpath = "//*[@id='ExtraField_ToolTipText']")
		public static WebElement extraFields_FieldDetailsToolTipText;

		@FindBy(xpath = "//*[@id='ExtraField_RegularExpression']")
		public static WebElement extraFields_FieldDetailsRegularExpressionText;

		@FindBy(xpath = " //*[@id='btnLoad_RExp']")
		public static WebElement extraFields_RegularExperssionLoadExpansionBtn;

		@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
		public static WebElement extraFields_PropertiesTab;

		@FindBy(xpath = "//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
		public static WebElement extraFields_PropertiesTabPartOfDeliveryAddressChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_PartOfBillingAddress']")
		public static WebElement extraFields_PropertiesPartOfBillingAddressChekbox;

		@FindBy(xpath = "//input[@id='FieldsDetails_IsMandatory']")
		public static WebElement extraFields_PropertiesMandatoryChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_AllowAsParameter']")
		public static WebElement extraFields_PropertiesAllowAsParameterChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_IsHidden']")
		public static WebElement extraFields_PropertiesHiddenChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_HiddenInGroup']")
		public static WebElement extraFields_PropertiesHiddenInGroupChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_SpellCheck']")
		public static WebElement extraFields_PropertiesSpellCheckChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_MandatoryInGroup']")
		public static WebElement extraFields_PropertiesMandatoryInGroupChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_AuditTrial']")
		public static WebElement extraFields_PropertiesAuditTrialChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_NotAvailableForReports']")
		public static WebElement extraFields_PropertiesNotAvailableForReportsChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_MergeField']")
		public static WebElement extraFields_PropertiesMergeFieldChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_MassUpdate']")
		public static WebElement extraFields_PropertiesMassUpdateChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_IncludeInQuickCreate']")
		public static WebElement extraFields_PropertiesIncludeInQuickCreateChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_CannotBeExported']")
		public static WebElement extraFields_PropertiesCannotBeExportedChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_CannotBeImported']")
		public static WebElement extraFields_PropertiesCannotBeImportedChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_CopyFromParent']")
		public static WebElement extraFields_PropertiesCopyFromParentChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_ReadOnly']")
		public static WebElement extraFields_PropertiesReadOnlyChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_InformationField']")
		public static WebElement extraFields_PropertiesInformationFieldChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_IsMandatoryInRevision']")
		public static WebElement extraFields_PropertiesIsMandatoryInRevisionChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_AvailableinCustomerPortal']")
		public static WebElement extraFields_PropertiesAvailableinCustomerPortalChekbox;

		@FindBy(xpath = "//*[@id='FieldsDetails_EditableinCustomerPortal']")
		public static WebElement extraFields_PropertiesEditableinCustomerPortalChekbox;

		@FindBy(xpath = "//*[@id='Behaviour']")
		public static WebElement extraFields_PropertiesBehaviourDropdown;

		@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
		public static WebElement extraFields_FormattingTab;

		@FindBy(xpath = "//*[@id='FieldsDetails_ColumnSpan']")
		public static WebElement extraFields_FormattingColumnSpan;

		@FindBy(xpath = "//*[@id='FieldsDetails_RowSpan']")
		public static WebElement extraFields_FormattingRowSpan;

		@FindBy(xpath = "//*[@id='CharacterCasing']")
		public static WebElement extraFields_FormattingCharacterCasingDropdown;

		@FindBy(xpath = "//*[@id='TextAlign']")
		public static WebElement extraFields_FormattingTextAlignDropdown;

		@FindBy(xpath = "//*[@id='FieldsDetails_Font']")
		public static WebElement extraFields_FormattingFieldsDetailsFont;

		@FindBy(xpath = "//*[@id='FieldsDetails_BackColor']")
		public static WebElement extraFields_FormattingBackColor;

		@FindBy(xpath = "//*[@id='FieldsDetails_Font_Button']")
		public static WebElement extraFields_FormattingFieldsDetailsFont_Btn;

		// Elements are used for font edit option pop in field details and rules
		@FindBy(xpath = "//*[@id='fontFamily_ExtraField_FontCtrl']")
		public static WebElement FontAreialDropdown;

		@FindBy(xpath = "//*[@id='fontStyle_ExtraField_FontCtrl']")
		public static WebElement fontStyleDropdown;

		@FindBy(xpath = "//*[@id='fontWeight_ExtraField_FontCtrl']")
		public static WebElement fontWeightDropdown;

		@FindBy(xpath = "//*[@id='fontSizes_ExtraField_FontCtrl']")
		public static WebElement fontSizeDropdown;

		@FindBy(xpath = "//*[@id='fontForeColor_ExtraField_FontCtrl']")
		public static WebElement foreColourDropdown;

		@FindBy(xpath = "//*[@id='fontBackColor_ExtraField_FontCtrl']")
		public static WebElement backColorDropdown;

		@FindBy(xpath = "//*[@id='chkBaseline_ExtraField_FontCtrl']")
		public static WebElement baselineChekbox;

		@FindBy(xpath = "//*[@id='chkOverLine_ExtraField_FontCtrl']")
		public static WebElement overLineChekbox;

		@FindBy(xpath = "//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
		public static WebElement strikeThroughChekbox;

		@FindBy(xpath = "//*[@id='chkUnderline_ExtraField_FontCtrl']")
		public static WebElement underlineChekbox;

		@FindBy(xpath = "//*[@id='chkEnableFont_ExtraField_FontCtrl']")
		public static WebElement enableFontChekbox;

		@FindBy(xpath = "//*[@id='previewfont_ExtraField_FontCtrl']")
		public static WebElement frontPriveiw;

		@FindBy(xpath = "//*[@id='myFontControl_IF_Save']/i")
		public static WebElement frontSaveBtn;

		@FindBy(xpath = "//*[@id='myFontControl_IF_Close']")
		public static WebElement frontCustCloseBtn;

		@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
		public static WebElement extraFields_RulesTab;

		@FindBy(xpath = "//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
		public static WebElement extraFields_RulesSaveBtn;

		@FindBy(xpath = "//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
		public static WebElement extraFields_RulesNewBtn;

		@FindBy(xpath = "//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
		public static WebElement extraFields_RulesDeleteBtn;

		@FindBy(xpath = "//div[@id='newRuleTab_div_FieldRules']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		public static WebElement extraFields_RulesCustCloseBtn;

		@FindBy(xpath = "//*[@id='lnkRule_div_FieldRules']/input")
		public static WebElement extraFields_RulesClickHereAddRuleButtonBtn;

		@FindBy(xpath = "//*[@id='txtMasterRuleName_FieldRules']")
		public static WebElement extraFields_RuleNameDropdown;

		@FindBy(xpath = "//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
		public static WebElement extraFields_RuleNameSetingBtn;

		@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[5]/a/span")
		public static WebElement extraFields_ExternalModulesTab;

		@FindBy(xpath = "//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
		public static WebElement extraFields_ExternalModulesOnEventDropdown;

		@FindBy(xpath = "//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
		public static WebElement extraFields_ExternalModulesButtonCaption;

		@FindBy(xpath = "//*[@id='ddlModuleType_mExtraFieldExternalModule']")
		public static WebElement extraFields_ExternalModules_ModuleTypeBtn;

		@FindBy(xpath = "//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
		public static WebElement extraFields_ExternalModules_ModuleNameDropdown;

		@FindBy(xpath = "//*[@id='ddlClassNames_mExtraFieldExternalModule']")
		public static WebElement extraFields_ExternalModulesClassNameDropdown;

		@FindBy(xpath = "//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
		public static WebElement extraFields_ExternalModulesFuctionalNameDropdown;

		@FindBy(xpath = "//*[@id='ddlAvailability_mExtraFieldExternalModule']")
		public static WebElement extraFields_ExternalModulesAvabileInDropdown;

		@FindBy(xpath = "//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
		public static WebElement extraFields_ExternalModulesForMatFieldDeatailsOkBtn;

		@FindBy(xpath = "//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
		public static WebElement extraFields_externalModulesForMatFieldDeatailsCanceBtn;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
		public static WebElement extraFields_OkBtn;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]")
		public static WebElement extraFields_CustCloseBtn;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
		public static WebElement extraFields_CreatedByUserInHeaderDetailsTab;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[1]")
		public static WebElement extraFields_EditOptionInHeaderDetailsTab;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[2]")
		public static WebElement extraFields_DeleteOptionInHeaderDetailsTab;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")
		public static WebElement extraFields_SecondFieldInHeaderDetailsTab;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[2]/div[2]")
		public static WebElement extraFields_MoveFieldOption;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
		public static WebElement extraFields_MoveFieldTabName;

		@FindBy(xpath = "//div[@id='tableType_div']//div[1]//label[1]")
		public static WebElement extraFields_MoveFieldHeader;

		@FindBy(xpath = "//div[@id='rdbBodyDiv_MoveField_Modal']//label[1]")
		public static WebElement extraFields_MoveFieldBody;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[3]/button[1]")
		public static WebElement extraFields_MoveFieldOkButton;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[3]/button[2]")
		public static WebElement extraFields_MoveFieldCancelButton;

		// Settings Tab Move Field
		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/i[1]")
		public static WebElement extraFields_SettingsTab_MoveField;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
		public static WebElement extraFields_SettingsTab_First;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[2]")
		public static WebElement extraFields_SettingsTab_FirstDelete;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/i[2]")
		public static WebElement extraFields_SettingsTab_MoveFieldOptsDelete;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")
		public static WebElement extraFields_SettingsTab_DeleteMessage;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/button[2]")
		public static WebElement extraFields_SettingsTab_DeleteMessageNoOption;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/button[1]")
		public static WebElement extraFields_SettingsTab_DeleteMessageYesOption;

		@FindBy(xpath = "//a[@class='icon-font7 theme_color-inverse']")
		public static WebElement extraFields_GeneralTab;

		@FindBy(xpath = "//a[contains(text(),'Settings')]")
		public static WebElement extraFields_SettingsTab;

		@FindBy(xpath = "//a[contains(text(),'Details')]")
		public static WebElement extraFields_DetailsTab;

		@FindBy(xpath = "//a[contains(text(),'Print Layout')]")
		public static WebElement extraFields_PrintLayout;

		@FindBy(xpath = "//li[5]/div/div/a")
		public static WebElement extraFields_TreeTabUpdate;

		@FindBy(xpath = "//a[@class='icon-font7 theme_color'][contains(text(),'Document Tab')]")
		public static WebElement extraFields_DocumentTab;

		@FindBy(xpath = "//a[@class='icon-font7 theme_color'][contains(text(),'Create Tab')]")
		public static WebElement extraFields_CreateTab;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[4]/div[2]")
		public static WebElement extraFields_PreviewTab;

		@FindBy(xpath = "//input[@id='sFileName1']")
		public static WebElement extraFields_PreviewTab_DocumentTab_FileName;

		@FindBy(xpath = "//input[@id='biDocument1']")
		public static WebElement extraFields_PreviewTab_DocumentTab_Document;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[1]")
		public static WebElement extraFields_PreviewTab_DocumentTab_UploadDocument;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[2]")
		public static WebElement extraFields_PreviewTab_DocumentTab_SaveDocument;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[3]")
		public static WebElement extraFields_PreviewTab_DocumentTab_DeleteDocument;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
		public static WebElement extraFields_PreviewTab_DocumentTab_CreateDate;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/input[1]")
		public static WebElement extraFields_PreviewTab_DocumentTab_FileSize;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
		public static WebElement extraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[2]/button[2]/i[1]")
		public static WebElement extraFields_PreviewTab_SaveBtn;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[2]/button[5]")
		public static WebElement extraFields_PreviewTab_CustCloseBtn;

		@FindBy(xpath = "/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[8]/div[1]/label/input")
		public static WebElement selectVendorB;

		@FindBy(xpath = "//input[@id='iPDCDiscountedAC']")
		public static WebElement pdcDicountAccount;

		@FindBy(xpath = "//input[@id='uploadBtnbiDocument1']")
		public static WebElement addGroupDocumentTab_UploadDocument;

		@FindBy(xpath = "//tr[1]//td[5]//div[1]//div[1]//div[2]")
		public static WebElement addGroupDocumentTab_SaveDocument;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[3]/i[1]")
		public static WebElement addGroupDocumentTab_DeleteDocument;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
		public static WebElement addGroupCreateCreateTab_ExtraFieldUpdate;

		@FindBy(xpath = "//td[contains(@class,'tdName padding0')][contains(text(),'Vendor Group')]")
		public static WebElement accountGroupCreation;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement accSelect;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
		public static WebElement accSelectBySingleClick;

		@FindBy(xpath = "//span[contains(text(),'Vendor Group')]")
		public static WebElement clickOnAccountGroupToDisplayTitle;

		@FindBy(xpath = "//span[contains(text(),'VG')]")
		public static WebElement checkAccountGroupTitle;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[4]/span[1]")
		public static WebElement clickOnAccountGroup;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
		public static WebElement getCpationOfGroup;

		@FindBy(xpath = "//label[@class='msgInfo']")
		public static WebElement clickOnEmptyGroup;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/ul[6]/li[1]/ul[3]/li[1]/ul[1]/li[1]/a[2]")
		public static WebElement selectVendorGroupCheckbox;

		@FindBy(xpath = "/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[8]/div[1]/label/input")
		public static WebElement selectVendorGroup;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")
		public static WebElement getMsgOnDelete;

		@FindBy(xpath = "//button[@id='btnOkForDelete']")
		public static WebElement clickOnOkInDelete;

		@FindBy(xpath = "//button[@id='btnCancelForDelete']")
		public static WebElement clickOnCancelInDelete;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[4]/span[1]")
		public static WebElement clickOnVendorGroup;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
		public static WebElement getVendorGroupName;

		@FindBy(xpath = "//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']//i[@class='icon-font6 icon-close']")
		public static WebElement closeAccountCreationScreen;

		@FindBy(xpath = "//input[@id='chkRetainSelection']")
		public static WebElement accountMasterRetain;

		@FindBy(xpath = "//input[@id='liSelectAllMasters']")
		public static WebElement accountMasterSelect;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement accountFirstCheckBox;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement accountSecondCheckBox;

		@FindBy(xpath = "//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']")
		public static WebElement closeAccMasterCreationScreen;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/button[5]/i[1]")
		public static WebElement closeMaster;

	

		// Properties Page
		@FindBy(xpath = "//span[contains(text(),'Account Properties')]")
		public static WebElement accountPropertiesLabel;

		@FindBy(xpath = "//input[@id='rbnNormal']")
		public static WebElement normalRadioBtn;

		@FindBy(xpath = "//input[@id='rbnDisplayDebitCreditTotalForEachAccountUnderGroup']")
		public static WebElement displayDebitCreditTotalForEachAccountUnderGroup;

		@FindBy(xpath = "//input[@id='rbnClubTranOfAllAcctsUnderGrpWhenDispInLedger']")
		public static WebElement ClubTheTransactionsofAllTheAccountsUnderGroup;

		@FindBy(xpath = "//input[@id='rbnShowSummaryOfAccount']")
		public static WebElement showSummaryOfTheAccountRadioBtn;

		@FindBy(xpath = "//input[@id='chkSuspendCreditLimit']")
		public static WebElement suspendCreditLimitChkbox;

		@FindBy(xpath = "//input[@id='rbnDisplayDebitCreditTotalForEachMonth']")
		public static WebElement displayDebitCreditTotalForEachMonthRadioBtn;

		@FindBy(xpath = "//input[@id='rbnrbnDisplayDebitCreditTotalForEachDay']")
		public static WebElement displayDebitCreditTotalForEachDayRadioBtn;

		@FindBy(xpath = "//input[@id='rbnNone']")
		public static WebElement noneRadioBtn;

		@FindBy(xpath = "//input[@id='rbnConsolidateWhenBothAccountsAreSame']")
		public static WebElement consolidateWhenBothAccountsAreSameRadioBtn;

		@FindBy(xpath = "//input[@id='rbnConsolidateAlways']")
		public static WebElement consolidateAlwaysRadioBtn;

		@FindBy(xpath = "//select[@id='ddlStatus']")
		public static WebElement statusDropdown;

		@FindBy(xpath = "//input[@id='chkDoNotRestrictSelectionEvenIfRightsNotAllotted']")
		public static WebElement doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox;

		@FindBy(xpath = "//input[@id='chkAllowOtherCompaniesToViewRecords']")
		public static WebElement allowOtherCompaniesToViewRecordsCheckbox;

		@FindBy(xpath = "//input[@id='chkGenerateLedgerByCurrency']")
		public static WebElement generateLedgerByCurrencyCheckbox;

		@FindBy(xpath = "//input[@id='chkSendSmsEmailWhereverAcDebitedCredited']")
		public static WebElement sendSmsEmailWhereverAcDebitedCreditedCheckbox;

		@FindBy(xpath = "//span[@id='btnPropOk']")
		public static WebElement properties_okBtn;

		@FindBy(xpath = "//*[@id='divMasterProperty']/ul/li/span[2]")
		public static WebElement properties_cancelBtn;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[5]/span[1]")
		public static WebElement customizeTabWithTreeTabUpdate;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[6]/span[1]")
		public static WebElement customizeTabWithDocumentTab;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[7]/span[1]")
		public static WebElement customizeTabWithCreateTreeTab;

		@FindBy(xpath = "//div[@id='Layout_Popup']//input[2]")
		public static WebElement noIn;

		@FindBy(xpath = "//*[@id='dashName']")
		public static WebElement dashboard;

		@FindBy(xpath = "//div[@id='chartdiv0']")
		public static WebElement dashboardGraph;

		@FindBy(xpath = "//span[@id='btnPropOk']")
		public static WebElement dashboardLedger;

		@FindBy(xpath = "//span[@id='btnPropOk']")
		public static WebElement dashboardInfoPanel;

		// General tab
		@FindBy(xpath = "//tbody[@id='iBankAc_table_body']/tr/td[2]")
		public static List<WebElement> bankAccountListCount;

		@FindBy(xpath = "//tbody[@id='iPDCDiscountedAC_table_body']/tr/td[2]")
		public static List<WebElement> pdcAccountListCount;

		// Settings Tab
		@FindBy(xpath = "//tbody[@id='iExchangeAdjustmentGainAC_table_body']/tr/td[2]")
		public static List<WebElement> exgGainListCount;

		@FindBy(xpath = "//tbody[@id='iExchangeAdjustmentLossAC_table_body']/tr/td[2]")
		public static List<WebElement> exgLossListCount;

		@FindBy(xpath = "//tbody[@id='iPrimaryAccount_table_body']/tr/td[2]")
		public static List<WebElement> primaryAccountListCount;

		@FindBy(xpath = "//tbody[@id='iReminderTerms_table_data_body']")
		public static WebElement reminderTermsEmptyList;

		@FindBy(xpath = "//tbody[@id='iDefaultCurrency_table_body']/tr/td[2]")
		public static List<WebElement> defaultCurrencyListCount;

		@FindBy(xpath = "//tbody[@id='iFinanceChargeTerms_table_data_body']")
		public static WebElement financeChargeTermsEmptyList;

		@FindBy(xpath = "//tbody[@id='iPaymentTerms_table_data_body']")
		public static WebElement paymentTermsEmptyList;

		// Detail tab
		@FindBy(xpath = "//tbody[@id='iCity_table_data_body']")
		public static WebElement city1EmptyList;

		@FindBy(xpath = "//tbody[@id='iDeliveryCity_table_data_body']")
		public static WebElement city2EmptyList;

		// Tree tab
		@FindBy(xpath = "//tbody[@id='cmbUserTypeMaster_table_body']/tr/td[2]")
		public static List<WebElement> mastercmbMasterListCount;

		// Currency Page
		@FindBy(xpath = "//span[@class='navText']//span[contains(text(),'Currency Master')]")
		public static WebElement currencyMasterlabel;

		@FindBy(xpath = "//*[@id='ISOCurrencyCode']")
		public static WebElement ISOCurrencyCodeTxt;

		@FindBy(xpath = "//td[@id='ISOCurrencyCode_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement ISOCurrencyCodeSettingsBtn;

		@FindBy(xpath = "//h4[@id='ISOCurrencyCode_customize_popup_heading']")
		public static WebElement ISOCurrencyCode_CustomizeDisplayColumnsLabel;

		@FindBy(xpath = "//div[@id='ISOCurrencyCode_customize_popup_container']")
		public static WebElement ISOCurrencysCodeContainerTxt;

		@FindBy(xpath = "//div[@id='ISOCurrencyCode_customize_popup_footer']//input[1]")
		public static WebElement ISOCurrencyCodeStanadrdfieldsBtn;

		@FindBy(xpath = "//select[@id='ISOCurrencyCode_customize_popup_standardfields_list']")
		public static WebElement ISOCurrencyCodeStanadrdfields_Fielddropdown;

		@FindBy(xpath = "//input[@id='ISOCurrencyCode_customize_popup_standardfields_header']")
		public static WebElement ISOCurrencyCodeStanadrdfields_headerTxt;

		@FindBy(xpath = "//select[@id='ISOCurrencyCode_customize_popup_standardfields_alignment']")
		public static WebElement ISOCurrencyCodeStanadrdfields_Allignmentdropdown;

		@FindBy(xpath = "//input[@id='ISOCurrencyCode_customize_popup_standardfields_width']")
		public static WebElement ISOCurrencyCodeStanadrdfields_WidthTxt;

		@FindBy(xpath = "//div[@id='currencyMasterWidth']//input[3]")
		public static WebElement ISOCurrencyCodeStanadrdfields_OkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement ISOCurrencyCodeStanadrdfields_CancelBtn;

		@FindBy(xpath = "//div[@id='ISOCurrencyCode_search_container']//input[2]")
		public static WebElement ISOCurrencyCodedeleteColumnBtn;

		@FindBy(xpath = "//div[@id='currencyMasterWidth']//input[3]")
		public static WebElement ISOCurrencyCodeOkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement ISOCurrencyCodeCancelBtn;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[2]/input[1]")
		public static WebElement coinsNameTxt;

		@FindBy(xpath = "//input[@id='currencyName']")
		public static WebElement currencyNameTxt;

		@FindBy(xpath = "//input[@id='GeneralRoundOff']")
		public static WebElement generalRoundOffTxt;

		@FindBy(xpath = "//select[@id='RoundingType']")
		public static WebElement roundingTypeDropdown;
		
		@FindBy(xpath = "//input[@id='CurrencyUnit']")
		public static WebElement currencyUnitTxt;

		@FindBy(xpath = "//input[@id='CurrencySubUnit']")
		public static WebElement currencySubUnitTxt;

		@FindBy(xpath = "//input[@id='connector']")
		public static WebElement connectorTxt;

		@FindBy(xpath = "//input[@id='controlSymbol']")
		public static WebElement controlSymbolDropdown;

		// Control SymbolPop Up
		@FindBy(xpath = "//td[@id='controlSymbol_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement symbolSettingsBtn;

		@FindBy(xpath = "//h4[@id='controlSymbol_customize_popup_heading']")
		public static WebElement symbol_CustomizeDisplayColumnsLabel;

		@FindBy(xpath = "//div[@id='controlSymbol_customize_popup_container']")
		public static WebElement ISOCurrencysSymbolContainerTxt;

		@FindBy(xpath = "//div[@id='controlSymbol_customize_popup_footer']//input[1]")
		public static WebElement symbolStanadrdfieldsBtn;

		@FindBy(xpath = "//select[@id='controlSymbol_customize_popup_standardfields_list']")
		public static WebElement symbolStanadrdfields_Fielddropdown;

		@FindBy(xpath = "//input[@id='controlSymbol_customize_popup_standardfields_header']")
		public static WebElement symbolStanadrdfields_headerTxt;

		@FindBy(xpath = "//select[@id='controlSymbol_customize_popup_standardfields_alignment']")
		public static WebElement symbolStanadrdfields_Allignmentdropdown;

		@FindBy(xpath = "//input[@id='controlSymbol_customize_popup_standardfields_width']")
		public static WebElement symbolStanadrdfields_WidthTxt;

		@FindBy(xpath = "//div[@id='currencyMasterWidth']//input[3]")
		public static WebElement symbolStanadrdfields_OkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement symbolStanadrdfields_CancelBtn;

		@FindBy(xpath = "//div[@id='controlSymbol_search_container']//input[2]")
		public static WebElement symboldeleteColumnBtn;

		@FindBy(xpath = "//div[@id='currencyMasterWidth']//input[3]")
		public static WebElement symbolOkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement symbolCancelBtn;

		@FindBy(xpath = "//input[@id='iNoOfDecimals']")
		public static WebElement noOfDecimalsTxt;

		@FindBy(xpath = "//input[@id='NoOfDesimals']")
		public static WebElement noOfDecimalsTxtInCurrency;
		
		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]")
		public static WebElement tableRow;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[1]")
		public static WebElement tableCol;

		// Grid Fields in Denomination Details
		@FindBy(xpath = "//td[@id='CurrencyMasterGrid_col_1-1']")
		public static WebElement denominationCode1;

		@FindBy(xpath = "//input[@id='CurrencyMasterGrid_control_heading_ctrl_2']")
		public static WebElement denominationValue1;

		@FindBy(xpath = "//td[@id='CurrencyMasterGrid_col_2-1']")
		public static WebElement denominationCode2;

		@FindBy(xpath = "//td[@id='CurrencyMasterGrid_col_2-2']")
		public static WebElement denominationValue2;

		// Pop Up Field
		@FindBy(xpath = "//span[contains(text(),'Exchange Rate Definition')]")
		public static WebElement exchangeRateDefinitionLabel;

		@FindBy(xpath = "//i[@class='icon-font7 icon-import-from-excel']")
		public static WebElement importFromExcelIcon;

		@FindBy(xpath = "//i[@class='icon-font7 icon-clear']")
		public static WebElement exchangeRateDefinitionClearIcon;

		@FindBy(xpath = "//i[@class='icon-font7 icon-save']")
		public static WebElement exchangeRateDefinitionSaveIcon;

		@FindBy(xpath = "//span[@id='btnCurrencyMasterCancel']//i[@class='icon-font7 icon-close']")
		public static WebElement exchangeRateDefinitionPopCloseIcon;

		@FindBy(xpath = "//span[@id='closeExchangeRate']")
		public static WebElement exchangeRateDefinitionPageCloseIcon;

		@FindBy(xpath = "//input[@id='id_option']")
		public static WebElement baseCurrencyTxt;

		@FindBy(xpath = "//td[@id='id_option_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement baseCurrencySettingsBtn;
		
		@FindBy(xpath = "//h4[@id='id_option_customize_popup_heading']")
		public static WebElement baseCurrency_CustomizeDisplayColumnsLabel;

		@FindBy(xpath = "//div[@id='id_option_customize_popup_container']")
		public static WebElement baseCurrencyscodeContainerTxt;

		@FindBy(xpath = "//div[@id='id_option_customize_popup_footer']//input[1]")
		public static WebElement baseCurrencyStanadrdfieldsBtn;

		@FindBy(xpath = "//select[@id='id_option_customize_popup_standardfields_list']")
		public static WebElement baseCurrencyStanadrdfields_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_option_customize_popup_standardfields_header']")
		public static WebElement baseCurrencyStanadrdfields_headerTxt;

		@FindBy(xpath = "//select[@id='id_option_customize_popup_standardfields_alignment']")
		public static WebElement baseCurrencyStanadrdfields_Allignmentdropdown;

		@FindBy(xpath = "//input[@id='id_option_customize_popup_standardfields_width']")
		public static WebElement baseCurrencyStanadrdfields_WidthTxt;

		@FindBy(xpath = "//div[@class='row']//input[3]")
		public static WebElement baseCurrencyStanadrdfields_OkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement baseCurrencyStanadrdfields_CancelBtn;

		@FindBy(xpath = "//div[@id='id_option_search_container']//input[2]")
		public static WebElement baseCurrencydeleteColumnBtn;

		@FindBy(xpath = "//div[@class='row']//input[3]")
		public static WebElement baseCurrencyOkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement baseCurrencyCancelBtn;

		// Grid Fields
		@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName']")
		public static WebElement gridcurrencyName1Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_CurrencyName_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement currencyNameSettingsBtn;

		// Pop Up
		@FindBy(xpath = "//h4[@id='ExchangeTable_CurrencyName_customize_popup_heading']")
		public static WebElement currencyName_CustomizeDisplayColumnsLabel;

		@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_customize_popup_container']")
		public static WebElement currencyNameContainerTxt;

		@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_customize_popup_footer']//input[1]")
		public static WebElement currencyNameStanadrdfieldsBtn;

		@FindBy(xpath = "//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_list']")
		public static WebElement currencyNameStanadrdfields_Fielddropdown;

		@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_header']")
		public static WebElement currencyNameStanadrdfields_headerTxt;

		@FindBy(xpath = "//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_alignment']")
		public static WebElement currencyNameStanadrdfields_Allignmentdropdown;

		@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_width']")
		public static WebElement currencyNameStanadrdfields_WidthTxt;

		@FindBy(xpath = "//table[@id='ExchangeTable']//input[3]")
		public static WebElement currencyNameStanadrdfields_OkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement currencyNameStanadrdfields_CancelBtn;

		@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_search_container']//input[2]")
		public static WebElement currencyNamedeleteColumnBtn;

		@FindBy(xpath = "//table[@id='ExchangeTable']//input[3]")
		public static WebElement currencyNameOkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement currencyNameCancelBtn;

		@FindBy(xpath = "//input[@id='EffectiveDate']")
		public static WebElement withEffectiveDateTxt;

		@FindBy(xpath = "//*[@id='EffectiveDate_input_image']/span")
		public static WebElement dOne;

		@FindBy(xpath = "//*[@id='EffectiveDate_day_today']/td/span[1]")
		public static WebElement dTwo;

		@FindBy(xpath = "//input[@id='ExchangeTable_DefinedAs']")
		public static WebElement gridDefineAsTxt;

		@FindBy(xpath = "//input[@id='ExchangeTable_Rate']")
		public static WebElement gridRateTxt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_1-2']")
		public static WebElement gridDefineAs1Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
		public static WebElement gridRate1Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_1-4']")
		public static WebElement gridDescription1Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_2-1']")
		public static WebElement gridcurrencyName2Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_2-2']")
		public static WebElement gridDefineAs2Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_2-3']")
		public static WebElement gridRate2Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_2-4']")
		public static WebElement gridDescription2Txt;
		
		@FindBy(xpath = "//td[@id='ExchangeTable_col_3-1']")
		public static WebElement gridcurrencyName3Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_3-2']")
		public static WebElement gridDefineAs3Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_3-3']")
		public static WebElement gridRate3Txt;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_3-4']")
		public static WebElement gridDescription3Txt;

		@FindBy(xpath = "//span[@id='exchange_currency']")
		public static WebElement exchangeRateIcon;

		@FindBy(xpath = "//div[contains(text(),'Clear')]")
		public static WebElement clearIcon;

		@FindBy(xpath = "//span[@id='btnSave']")
		public static WebElement saveIcon;

		@FindBy(xpath = "//span[@id='btnClose']")
		public static WebElement cancelIcon;

		// Exchange Rate Page

		// Header Fields
		@FindBy(xpath = "//i[@class='icon-font7 icon-delete']")
		public static WebElement exchangeRateDefinitionDeleteIcon;

		@FindBy(xpath = " //span[@id='closeExchangeRate']//i[@class='icon-font7 icon-close']")
		public static WebElement exchangeRateDefinitionCloseIcon;

		// Exchange Rate History
		@FindBy(xpath = "//div[@class='navText']//span[contains(text(),'Exchange Rate History')]")
		public static WebElement exchangeRateHistoryLabel;

		@FindBy(xpath = "//input[@id='id_option']")
		public static WebElement baseCurrencyInExchangeRateHistory;

		@FindBy(xpath = "//*[@id='DateOption']")
		public static WebElement dateOptionDropdown;

		@FindBy(xpath = "//*[@id='FromDate']")
		public static WebElement fromDateTxt;

		@FindBy(xpath = "//*[@id='ToDate']")
		public static WebElement toDateTxt;

		@FindBy(xpath = "//i[@class='icon-font7 icon-refresh']")
		public static WebElement loadIcon;

		@FindBy(xpath = "//i[@class='icon-font7 icon-clear']")
		public static WebElement exchangeRateHistoryclearIcon;

		// Grid
		@FindBy(xpath = "//input[@id='chkSelectAll']")
		public static WebElement toSelectAllChkBox;

		@FindBy(xpath = "//input[@id='ExchangeTable_chk0']")
		public static WebElement row1Chkbox;

		@FindBy(xpath = "//input[@id='//td[@id='ExchangeTable_col_1-2']")
		public static WebElement selectCurrency1;

		// PopUp
		@FindBy(xpath = "//td[@id='ExchangeTable_CurrencyName_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement selectCurrencySettingsBtn;

		@FindBy(xpath = "//h4[@id='ExchangeTable_CurrencyName_customize_popup_heading']")
		public static WebElement selectCurrency_CustomizeDisplayColumnsLabel;

		@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_customize_popup_container']")
		public static WebElement isoCurrencysselectCurrencysCodeContainerTxt;

		@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_customize_popup_footer']//input[1]")
		public static WebElement selectCurrencyStanadrdfieldsBtn;

		@FindBy(xpath = "//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_list']")
		public static WebElement selectCurrencyStanadrdfields_Fielddropdown;

		@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_header']")
		public static WebElement selectCurrencyStanadrdfields_headerTxt;

		@FindBy(xpath = "//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_alignment']")
		public static WebElement selectCurrencyStanadrdfields_Allignmentdropdown;

		@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_width']")
		public static WebElement selectCurrencyStanadrdfields_WidthTxt;

		@FindBy(xpath = "//section[@id='page_Content']//input[3]")
		public static WebElement selectCurrencyStanadrdfields_OkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement selectCurrencyStanadrdfields_CancelBtn;

		@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_search_container']//input[2]")
		public static WebElement selectCurrencydeleteColumnBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[3]")
		public static WebElement selectCurrencyOkBtn;

		@FindBy(xpath = "//section[@id='page_Content']//input[4]")
		public static WebElement selectCurrencyCancelBtn;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
		public static WebElement DefineAs1Txt;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")
		public static WebElement valueUSD;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")
		public static WebElement valueAED;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_1-2']")
		public static WebElement selCurrencyOne;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_2-2']")
		public static WebElement selCurrecnyTwo;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
		public static WebElement defCurrecnyOne;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_2-3']")
		public static WebElement defCurrecnyTwo;

		// Grid Second Row
		@FindBy(xpath = "//input[@id='ExchangeTable_chk1']")
		public static WebElement Row2Chkbox;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_2-2']")
		public static WebElement SelectCurrency2;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
		public static WebElement DefineAs2Txt;

		@FindBy(xpath = "//i[@class='icon-font6 icon-close']")
		public static WebElement exchangeRateHistoryCloseIcon;

		@FindBy(xpath = "//span[contains(text(),'Graph')]")
		public static WebElement graphTab;

		@FindBy(xpath = "//span[@class='font-5'][contains(text(),'Table')]")
		public static WebElement tableTab;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_1-0']")
		public static WebElement selectFirstRowIndex;

		@FindBy(xpath = "//td[@id='ExchangeTable_col_2-0']")
		public static WebElement selectSecondRowIndex;

		@FindBy(xpath = "//div[contains(text(),'Delete Row')]")
		public static WebElement selectDeleteOption;

		@FindBy(xpath = "//span[@id='DeleteData']")
		public static WebElement exchnageRateDeleteOption;

		// Vouchers Home Page Ribbon Control

		@FindBy(xpath = "//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
		public static WebElement newBtn;

		@FindBy(xpath = "//div[@id='id_transaction_homescreen_edit']//span[@class='icon-edit icon-font6 ImagesinArabic']")
		public static WebElement editBtn;

		@FindBy(xpath = "//span[@class='icon-print icon-font6']")
		public static WebElement printBtn;

		@FindBy(xpath = "//div[@id='id_transaction_homescreen_Delete']//span[@class='icon-delete icon-font6']")
		public static WebElement transHomePageDeleteBtn;

		@FindBy(xpath = "//span[@class='icon-authorize icon-font6']")
		public static WebElement authorizeBtn;

		@FindBy(xpath = "//span[@class='icon-suspend icon-font6']")
		public static WebElement suspendBtn;

		@FindBy(xpath = "//span[@class='icon-reject2 icon-font6']")
		public static WebElement rejectBtn;

		@FindBy(xpath = "//span[@class='icon-cheque icon-font6']")
		public static WebElement chequeReturnBtn;

		@FindBy(xpath = "//span[@class='icon-printbarcode icon-font6']")
		public static WebElement printBarCodeBtn;

		@FindBy(xpath = "//span[@class='icon-convert icon-font6']")
		public static WebElement convertBtn;

		@FindBy(xpath = "//span[@class='icon-export icon-font6']")
		public static WebElement exportToXMLBtn;

		@FindBy(xpath = "//div[@id='myNavbar']//span[@class='icon-settings icon-font6']")
		public static WebElement settingsBtn;

		@FindBy(xpath = "//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")
		public static WebElement homeCustCloseBtn;

		// Vouchers Home Page Options
		@FindBy(xpath = "//a[@class='transaction_viewname_anchor theme_color-inverse font-5']")
		public static WebElement allVouchersOption;

		@FindBy(xpath = "//a[@class='transaction_viewname_anchor font-5']")
		public static WebElement pendingBillsOption;

		@FindBy(xpath = "//input[@id='SelectDefaultView']")
		public static WebElement selectDefaultViewChkBox;

		@FindBy(xpath = "//span[@class='icon-sorting icon-font6 toolbar_button_image theme_button_color dropdown-toggle']")
		public static WebElement sortingBtn;

		@FindBy(xpath = "//div[@id='btnCreateView']//span[@class='icon-new icon-font6']")
		public static WebElement createViewBtn;

		@FindBy(xpath = "//div[@id='btnCustomize']//span[@class='icon-settings icon-font6']")
		public static WebElement customizeBtn;

		@FindBy(xpath = "//span[@class='icon-filter icon-font6']")
		public static WebElement filterBtn;

		@FindBy(xpath = "//span[@id='reportRefresh']")
		public static WebElement refreshBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-export']")
		public static WebElement exportBtn;

		// Options Button (Display Option)
		@FindBy(xpath = "//span[@id='transOptions']")
		public static WebElement optionsBtn;

		@FindBy(xpath = "//a[contains(text(),'Auto Adjust Width')]")
		public static WebElement autoAdjustWidthBtn;

		@FindBy(xpath = "//a[contains(text(),'Fit To Screen')]")
		public static WebElement fitToScreenBtn;

		@FindBy(xpath = "//a[contains(text(),'Normal')]")
		public static WebElement normalBtn;

		// Voucher Home Page Grid Header Columns
		@FindBy(xpath = "//input[@id='HeaderChkBox']")
		public static WebElement grid_HeaderChkBox;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[3]")
		public static WebElement grid_Header_Date;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[4]")
		public static WebElement grid_Header_VoucherNumber;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[5]")
		public static WebElement grid_Header_CreatedBy;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[6]")
		public static WebElement grid_Header_ModifiedBy;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[7]")
		public static WebElement grid_Header_CreatedDate;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[8]")
		public static WebElement grid_Header_ModifiedDate;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[9]")
		public static WebElement grid_Header_CreatedTime;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[10]")
		public static WebElement grid_Header_ModifiedTime;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[11]")
		public static WebElement grid_Header_Suspended;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[12]")
		public static WebElement grid_Header_Cancelled;

		@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[13]")
		public static WebElement grid_Header_AuthorizationStatus;

		// Grid Voucher DetailsBtn
		@FindBy(xpath = "//tr[@id='trRender_1']//i[@class='icon-info icon-font7']")
		public static WebElement grid_VoucherDetailsBtn1;

		@FindBy(xpath = "//tr[@id='trRender_2']//i[@class='icon-info icon-font7']")
		public static WebElement grid_VoucherDetailsBtn2;

		// Grid CheckBox 1 And 2

		@FindBy(xpath = "//tr[@id='trRender_1']//td//input")
		public static WebElement grid_ChkBox1;

		@FindBy(xpath = "//tr[@id='trRender_2']//td//input")
		public static WebElement grid_ChkBox2;

		@FindBy(xpath = "//tr[@id='trRender_3']//td//input")
		public static WebElement grid_ChkBox3;

		@FindBy(xpath = "//tr[@id='trRender_4']//td//input")
		public static WebElement grid_ChkBox4;

		// Vouchers Home Page Footer
		@FindBy(xpath = "//div[@id='tblFooterReportRender']//input[@id='txtSearch']")
		public static WebElement searchField;

		@FindBy(xpath = "//button[@id='frstPage']")
		public static WebElement firstPageBtn;

		@FindBy(xpath = "//button[@id='id_previousPage']")
		public static WebElement previousPageBtn;

		@FindBy(xpath = "//button[@id='id_pagenumber']")
		public static WebElement currentPageNo;

		@FindBy(xpath = "//button[@id='id_nextPage']")
		public static WebElement nextPageBtn;

		@FindBy(xpath = "//button[@id='lstPage']")
		public static WebElement lastPageBtn;

		// Vouchers Entry Page Ribbon Control Options
		@FindBy(xpath = "//span[@class='icon-scroll icon-font6']")
		public static WebElement freeFlowBtn;

		@FindBy(xpath = "//span[@class='icon-header icon-font6']")
		public static WebElement jumpToHeaderSectionBtn;

		@FindBy(xpath = "//span[@class='icon-panel icon-font6']")
		public static WebElement jumpToBodySectionBtn;

		@FindBy(xpath = "//span[@class='icon-footer icon-font6']")
		public static WebElement jumpToFooterBtn;

		@FindBy(xpath = "//*[@id='id_transactionentry_new']")
		public static WebElement new_newBtn;

		@FindBy(xpath = "//*[@id='id_transactionentry_save']")
		public static WebElement transSaveBtn;

		@FindBy(xpath = "//*[@id='id_transactionentry_previous']")
		public static WebElement previousBtn;

		@FindBy(xpath = "//*[@id='id_transactionentry_next']")
		public static WebElement nextBtn;

		@FindBy(xpath = "//*[@id='id_transactionentry_print']")
		public static WebElement new_PrintBtn;

		@FindBy(xpath = "//*[@id='id_transactionentry_suspend']")
		public static WebElement new_SuspendBtn;

		@FindBy(xpath = "//*[@id='id_transactionentry_close']")
		public static WebElement new_CustCloseBtn;

		@FindBy(xpath = "//div[@id='id_transactionentry_delete']//span[contains(@class,'icon-delete icon-font6')]")
		public static WebElement new_DeleteBtn;

		@FindBy(xpath = "//span[@class='icon-menu icon-font4']")
		public static WebElement toggleBtn;

		@FindBy(xpath = "//*[@id='id_transactionentry_copydocument']")
		public static WebElement copyDocumentOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_copytoclipboard']")
		public static WebElement copyToClipBoardOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_pastefromclipboard']")
		public static WebElement pasteFromClipBoardOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_raisechequereturn']")
		public static WebElement raiseCheckReturnOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_addtostock']")
		public static WebElement addToStockOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_markconvert']")
		public static WebElement markConvertedOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_bominput']")
		public static WebElement bOMinputOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_autoallocate']")
		public static WebElement autoAllocateOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_reverseentry']")
		public static WebElement reverseEntryOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_printbarcode']")
		public static WebElement printBarCodeOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_postingdetails']")
		public static WebElement postingDetailsOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_exporttoxml']")
		public static WebElement exportToXMLOption;

		@FindBy(xpath = "//*[@id='id_transactionentry_settings']")
		public static WebElement settingsOption;

		// Voucher Entry Page Header Fields
		@FindBy(xpath = "//input[@id='id_header_1']")
		public static WebElement documentNumberTxt;

		@FindBy(xpath = "//*[@id='id_header_1_input_image']/span")
		public static WebElement documentNumberdropdown_ExpansionBtn;

		@FindBy(xpath = "//input[@id='id_header_2']")
		public static WebElement dateTxt;

		@FindBy(xpath = "//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
		public static WebElement dateTxt_CalenderBtn;

		@FindBy(xpath = "//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
		public static WebElement calender_TodayBtn;

		@FindBy(xpath = "//input[@id='id_header_4']")
		public static WebElement caskBankAccountTxt;

		@FindBy(xpath = "//*[@id='id_header_4_input_image']/span")
		public static WebElement caskBankAccount_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
		public static WebElement cashBankAccount_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
		public static WebElement cashBankAccount_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
		public static WebElement cashBankAccount_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
		public static WebElement cashBankAccount_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
		public static WebElement cashBankAccount_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
		public static WebElement cashBankAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
		public static WebElement cashBankAccount_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement cashBankAccount_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement cashBankAccount_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
		public static WebElement cashBankAccount_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement cashBankAccount_Settings_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement cashBankAccount_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_header_268435459']")
		public static WebElement departmentTxt;

		@FindBy(xpath = "//*[@id='id_header_268435459_input_image']/span")
		public static WebElement department_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_header_268435459_input_settings']/span")
		public static WebElement department_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_268435459_customize_popup_container']")
		public static WebElement department_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_268435459_customize_popup_footer']//input[1]")
		public static WebElement department_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_268435459_customize_popup_standardfields_list']")
		public static WebElement department_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_268435459_customize_popup_standardfields_header']")
		public static WebElement department_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_268435459_customize_popup_standardfields_alignment']")
		public static WebElement department_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_268435459_customize_popup_standardfields_width']")
		public static WebElement department_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement department_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement department_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_268435459_search_container']//input[2]")
		public static WebElement department_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement department_Settings_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement department_Settings_CancelBtn;

		@FindBy(xpath = "//*[@id='id_header_6']")
		public static WebElement maturityDateTxt;

		@FindBy(xpath = "//*[@id='id_header_6_input_image']/span']")
		public static WebElement maturityDateTxt_CalenderBtn;

		@FindBy(xpath = "//input[@id='id_header_3']")
		public static WebElement purchaseAccountTxt;

		@FindBy(xpath = "//*[@id='id_header_3_input_image']/span")
		public static WebElement purchaseAccount_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_header_3_input_settings']/span")
		public static WebElement purchaseAccount_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_3_customize_popup_container']")
		public static WebElement purchaseAccount_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_3_customize_popup_footer']//input[1]")
		public static WebElement purchaseAccount_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_list']")
		public static WebElement purchaseAccount_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_header']")
		public static WebElement purchaseAccount_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_alignment']")
		public static WebElement purchaseAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_width']")
		public static WebElement purchaseAccount_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement purchaseAccount_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement purchaseAccount_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_3_search_container']//input[2]")
		public static WebElement purchaseAccount_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement purchaseAccount_Settings_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement purchaseAccount_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_header_4']")
		public static WebElement vendorAccountTxt;

		@FindBy(xpath = "//*[@id='id_header_4_input_image']/span")
		public static WebElement vendorAccount_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
		public static WebElement vendorAccount_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
		public static WebElement vendorAccount_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
		public static WebElement vendorAccount_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
		public static WebElement vendorAccount_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
		public static WebElement vendorAccount_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
		public static WebElement vendorAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
		public static WebElement vendorAccount_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement vendorAccount_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement vendorAccount_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
		public static WebElement vendorAccount_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement vendorAccount_Settings_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement vendorAccount_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_header_3']")
		public static WebElement salesAccountTxt;

		@FindBy(xpath = "//*[@id='id_header_3_input_image']/span")
		public static WebElement salesAccountExpansionBtn;

		@FindBy(xpath = "//*[@id='id_header_3_input_settings']/span")
		public static WebElement salesAccount_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_3_customize_popup_container']")
		public static WebElement salesAccount_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_3_customize_popup_footer']//input[1]")
		public static WebElement salesAccount_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_list']")
		public static WebElement salesAccount_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_header']")
		public static WebElement salesAccount_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_alignment']")
		public static WebElement salesAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_width']")
		public static WebElement salesAccount_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement salesAccount_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement salesAccount_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_3_search_container']//input[2]")
		public static WebElement salesAccount_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement salesAccount_Settings_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement salesAccount_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_header_4']")
		public static WebElement customerAccountTxt;

		@FindBy(xpath = "//*[@id='id_header_4_input_image']/span")
		public static WebElement customerAccount_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
		public static WebElement customerAccount_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
		public static WebElement customerAccount_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
		public static WebElement customerAccount_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
		public static WebElement customerAccount_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
		public static WebElement customerAccount_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
		public static WebElement customerAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
		public static WebElement customerAccount_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement customerAccount_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement customerAccount_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
		public static WebElement customerAccount_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement customerAccount_Settings_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement customerAccount_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_header_12']")
		public static WebElement accountTxt;

		@FindBy(xpath = "//*[@id='id_header_12_input_image']/span")
		public static WebElement account_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
		public static WebElement account_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
		public static WebElement account_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
		public static WebElement account_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
		public static WebElement account_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
		public static WebElement account_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
		public static WebElement account_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
		public static WebElement account_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement account_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement account_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
		public static WebElement account_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement account_Settings_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement account_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_header_31']")
		public static WebElement issuesReceiptsTxt;

		@FindBy(xpath = "//input[@id='id_header_268435460']")
		public static WebElement wareHouseTxt;

		@FindBy(xpath = "//*[@id='id_header_268435460_input_image']/span")
		public static WebElement wareHouse_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_header_268435460_input_settings']/span")
		public static WebElement wareHouse_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_268435460_customize_popup_container']")
		public static WebElement wareHouse_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_268435460_customize_popup_footer']//input[1]")
		public static WebElement wareHouse_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_268435460_customize_popup_standardfields_list']")
		public static WebElement wareHouse_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_268435460_customize_popup_standardfields_header']")
		public static WebElement wareHouse_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_268435460_customize_popup_standardfields_alignment']")
		public static WebElement wareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_268435460_customize_popup_standardfields_width']")
		public static WebElement wareHouse_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement wareHouse_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement wareHouse_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_268435460_search_container']//input[2]")
		public static WebElement wareHouse_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement wareHouse_Settings_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement wareHouse_Settings_CancelBtn;

		@FindBy(xpath = "//span[contains(text(),'sName')]")
		public static WebElement customize_sName;

		@FindBy(xpath = "//span[@class='vcenter'][contains(text(),'Code')]")
		public static WebElement customize_sCode;

		@FindBy(xpath = "//span[contains(text(),'Alias')]")
		public static WebElement customize_Alias;

		@FindBy(xpath = "//span[@class='vcenter'][contains(text(),'Group')]")
		public static WebElement customize_bGroup;

		@FindBy(xpath = "//span[contains(@class,'vcenter')][contains(text(),'Balance')]")
		public static WebElement customize_Balance;

		@FindBy(xpath = "//input[@id='id_header_67108920']")
		public static WebElement appropriateBasedOndropdown;

		@FindBy(xpath = "//input[@id='id_header_67108921']")
		public static WebElement additionalValueTxt;

		@FindBy(xpath = "//input[@id='id_header_21']")
		public static WebElement raiseReceiptsChkBox;

		@FindBy(xpath = "//input[@id='id_header_67108865']")
		public static WebElement receipts_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108868']")
		public static WebElement payments_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108871']")
		public static WebElement pettyCash_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108874']")
		public static WebElement postDatedReceipts_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108865']")
		public static WebElement postDatedPayments_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108880']")
		public static WebElement purchaseVouchers_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108881']")
		public static WebElement purchaseReturns_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108884']")
		public static WebElement salesInvoice_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108886']")
		public static WebElement salesOrder_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108928']")
		public static WebElement salesInvoiceNewNarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108885']")
		public static WebElement salesReturns_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108913']")
		public static WebElement cashSales_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108914']")
		public static WebElement hirePurchaseSales_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108890']")
		public static WebElement journalEntries_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108916']")
		public static WebElement forexJV_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108910']")
		public static WebElement interDepartmentalJV_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108888']")
		public static WebElement nonStandardJournalEntries_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108892']")
		public static WebElement debitNotes_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108911']")
		public static WebElement debitNotesLineWise_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108893']")
		public static WebElement creditNotes_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108912']")
		public static WebElement creditNotesLineWisePayroll_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108894']")
		public static WebElement openingBalance_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108891']")
		public static WebElement fixedAssetDepreciationVoucher_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108909']")
		public static WebElement requestForQuote_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108903']")
		public static WebElement purchasesQuotations_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108882']")
		public static WebElement purchasesOrders_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108882']")
		public static WebElement materialReceiptsNotes_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108904']")
		public static WebElement salesQuotationss_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108887']")
		public static WebElement deliveryNotes_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108917']")
		public static WebElement posSales_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108918']")
		public static WebElement productionOrder_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108886']")
		public static WebElement salesOrders_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108895']")
		public static WebElement shortagesinStock_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108896']")
		public static WebElement excessesinStocks_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108897']")
		public static WebElement stockTransfers_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108898']")
		public static WebElement openingStocks_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108923']")
		public static WebElement openingStocksNEW_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108908']")
		public static WebElement materialRequisition_NarrationTxt;

		@FindBy(xpath = "//input[@id='id_header_67108866']")
		public static WebElement receipts_ChequeNoTxt;

		@FindBy(xpath = "//input[@id='id_header_67108869']")
		public static WebElement payments_ChequeNoTxt;

		@FindBy(xpath = "//input[@id='id_header_67108872']")
		public static WebElement pettyCash_ChequeNoTxt;

		@FindBy(xpath = "//input[@id='id_header_67108875']")
		public static WebElement postDatedReceipts_ChequeNoTxt;

		@FindBy(xpath = "//input[@id='id_header_67108878']")
		public static WebElement postDatedPayments_ChequeNoTxt;

		// Voucher Entry Page Body Fields

		@FindBy(xpath = "//input[@id='id_body_536870916']")
		public static WebElement pvWareHouseTxt;

		@FindBy(xpath = "//td[@id='id_body_536870916_input_image']//span[@class='icon-down-arrow optioncontrol_arrow_margin']")
		public static WebElement pvWareHouse_ExpansionBtn;

		@FindBy(xpath = "//td[@id='id_body_536870916_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
		public static WebElement pvWareHouse_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_body_536870916_customize_popup_container']")
		public static WebElement pvWareHouse_Settings_Container;

		@FindBy(xpath = "//div[@id='id_body_536870916_customize_popup_footer']//input[1]")
		public static WebElement pvWareHouse_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_body_536870916_customize_popup_standardfields_list']")
		public static WebElement pvWareHouse_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_body_536870916_customize_popup_standardfields_header']")
		public static WebElement pvWareHouse_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_body_536870916_customize_popup_standardfields_alignment']")
		public static WebElement pvWareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_body_536870916_customize_popup_standardfields_width']")
		public static WebElement pvWareHouse_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement pvWareHouse_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement pvWareHouse_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_body_536870916_search_container']//input[2]")
		public static WebElement pvWareHouse_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[@class='panel']//input[3]")
		public static WebElement pvWareHouse_Settings_OkBtn;

		@FindBy(xpath = "//div[@class='panel']//input[4]")
		public static WebElement pvWareHouse_Settings_CancelBtn;

		// Grid Elements
		@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_1']")
		public static WebElement grid_Header_Account;

		@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_1']")
		public static WebElement grid_Header_Item;

		@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_1']")
		public static WebElement grid_Header_DebitAC;

		@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_2']")
		public static WebElement grid_Header_CreditAC;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]")
		public static WebElement firstRowIndex;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]")
		public static WebElement secondRowIndex;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[1]")
		public static WebElement thirdRowIndex;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[1]")
		public static WebElement fourthRowIndex;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[1]")
		public static WebElement fifthRowIndex;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[1]")
		public static WebElement sixthRowIndex;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[1]")
		public static WebElement seventhRowIndex;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[1]")
		public static WebElement eigthRowIndex;

		@FindBy(xpath = "//span[@class='icon-delete icon-font8']")
		public static WebElement deleteRowBtn;

		@FindBy(xpath = "//span[@class='icon-insertrow icon-font8']")
		public static WebElement insertRowBtn;

		@FindBy(xpath = "//span[@class='icon-selectall icon-font8']")
		public static WebElement selectRowBtn;

		@FindBy(xpath = "//span[@class='icon-unselectall1 icon-font8']")
		public static WebElement unSelectRowBtn;

		@FindBy(xpath = "//span[@class='icon-clone icon-font8']")
		public static WebElement duplicateRowBtn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
		public static WebElement select1stRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
		public static WebElement select1stRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
		public static WebElement select1stRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
		public static WebElement select1stRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
		public static WebElement select1stRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
		public static WebElement select1stRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
		public static WebElement select1stRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
		public static WebElement select1stRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
		public static WebElement select1stRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
		public static WebElement select1stRow_10thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
		public static WebElement select1stRow_11thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
		public static WebElement select1stRow_12thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
		public static WebElement select1stRow_13thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
		public static WebElement select1stRow_14thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
		public static WebElement select1stRow_15thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
		public static WebElement select1stRow_16thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
		public static WebElement select2ndRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
		public static WebElement select2ndRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
		public static WebElement select2ndRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
		public static WebElement select2ndRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
		public static WebElement select2ndRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
		public static WebElement select2ndRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
		public static WebElement select2ndRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
		public static WebElement select2ndRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
		public static WebElement select2ndRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
		public static WebElement select2ndRow_11thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
		public static WebElement select2ndRow_12thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
		public static WebElement select2ndRow_10thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]")
		public static WebElement select2ndRow_14thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
		public static WebElement select2ndRow_15thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
		public static WebElement select2ndRow_16thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
		public static WebElement select3rdRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
		public static WebElement select3rdRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
		public static WebElement select3rdRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]")
		public static WebElement select3rdRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
		public static WebElement select3rdRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]")
		public static WebElement select3rdRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
		public static WebElement select3rdRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
		public static WebElement select3rdRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
		public static WebElement select3rdRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]")
		public static WebElement select3rdRow_10thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]")
		public static WebElement select3rdRow_11thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]")
		public static WebElement select3rdRow_12thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]")
		public static WebElement select3rdRow_13thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]")
		public static WebElement select3rdRow_14thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]")
		public static WebElement select3rdRow_15thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]")
		public static WebElement select3rdRow_16thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]")
		public static WebElement select4thRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[3]")
		public static WebElement select4thRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[4]")
		public static WebElement select4thRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[5]")
		public static WebElement select4thRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]")
		public static WebElement select4thRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[7]")
		public static WebElement select4thRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
		public static WebElement select4thRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]")
		public static WebElement select4thRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[10]")
		public static WebElement select4thRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[11]")
		public static WebElement select4thRow_10thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[12]")
		public static WebElement select4thRow_11thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[13]")
		public static WebElement select4thRow_12thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[14]")
		public static WebElement select4thRow_13thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[15]")
		public static WebElement select4thRow_14thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[16]")
		public static WebElement select4thRow_15thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[17]")
		public static WebElement select4thRow_16thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]")
		public static WebElement select5thRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[3]")
		public static WebElement select5thRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[4]")
		public static WebElement select5thRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[5]")
		public static WebElement select5thRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[6]")
		public static WebElement select5thRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[7]")
		public static WebElement select5thRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
		public static WebElement select5thRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
		public static WebElement select5thRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[10]")
		public static WebElement select5thRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[11]")
		public static WebElement select5thRow_10thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[12]")
		public static WebElement select5thRow_11thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[13]")
		public static WebElement select5thRow_12thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[14]")
		public static WebElement select5thRow_13thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[15]")
		public static WebElement select5thRow_14thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[16]")
		public static WebElement select5thRow_15thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[17]")
		public static WebElement select5thRow_16thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[2]")
		public static WebElement select6thRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[3]")
		public static WebElement select6thRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[4]")
		public static WebElement select6thRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[5]")
		public static WebElement select6thRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[6]")
		public static WebElement select6thRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[7]")
		public static WebElement select6thRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
		public static WebElement select6thRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
		public static WebElement select6thRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[10]")
		public static WebElement select6thRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[11]")
		public static WebElement select6thRow_10thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[12]")
		public static WebElement select6thRow_11thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[13]")
		public static WebElement select6thRow_12thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[14]")
		public static WebElement select6thRow_13thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[15]")
		public static WebElement select6thRow_14thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[16]")
		public static WebElement select6thRow_15thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[17]")
		public static WebElement select6thRow_16thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[2]")
		public static WebElement select7thRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[3]")
		public static WebElement select7thRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[4]")
		public static WebElement select7thRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[5]")
		public static WebElement select7thRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[6]")
		public static WebElement select7thRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[7]")
		public static WebElement select7thRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[8]")
		public static WebElement select7thRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[9]")
		public static WebElement select7thRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[10]")
		public static WebElement select7thRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[2]")
		public static WebElement select8thRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[3]")
		public static WebElement select8thRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[4]")
		public static WebElement select8thRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[5]")
		public static WebElement select8thRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[6]")
		public static WebElement select8thRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[7]")
		public static WebElement select8thRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[8]")
		public static WebElement select8thRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[9]")
		public static WebElement select8thRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[10]")
		public static WebElement select8thRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[2]")
		public static WebElement select9thRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[3]")
		public static WebElement select9thRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[4]")
		public static WebElement select9thRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[5]")
		public static WebElement select9thRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[6]")
		public static WebElement select9thRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[7]")
		public static WebElement select9thRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[8]")
		public static WebElement select9thRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[9]")
		public static WebElement select9thRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[10]")
		public static WebElement select9thRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[2]")
		public static WebElement select10thRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[3]")
		public static WebElement select10thRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[4]")
		public static WebElement select10thRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[5]")
		public static WebElement select10thRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[6]")
		public static WebElement select10thRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[7]")
		public static WebElement select10thRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[8]")
		public static WebElement select10thRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[9]")
		public static WebElement select10thRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[10]")
		public static WebElement select10thRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[2]")
		public static WebElement select11thRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[3]")
		public static WebElement select11thRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[4]")
		public static WebElement select11thRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[5]")
		public static WebElement select11thRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[6]")
		public static WebElement select11thRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[7]")
		public static WebElement select11thRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[8]")
		public static WebElement select11thRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[9]")
		public static WebElement select11thRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[10]")
		public static WebElement select11thRow_9thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[2]")
		public static WebElement select12thRow_1stColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[3]")
		public static WebElement select12thRow_2ndColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[4]")
		public static WebElement select12thRow_3rdColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[5]")
		public static WebElement select12thRow_4thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[6]")
		public static WebElement select12thRow_5thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[7]")
		public static WebElement select12thRow_6thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[8]")
		public static WebElement select12thRow_7thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[9]")
		public static WebElement select12thRow_8thColumn;

		@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[10]")
		public static WebElement select12thRow_9thColumn;

		@FindBy(xpath = "//input[@id='id_body_12']")
		public static WebElement enter_AccountTxt;

		@FindBy(xpath = "//*[@id='id_body_12_input_image']/span")
		public static WebElement enter_Account_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_body_12_input_settings']/span")
		public static WebElement enter_Account_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_12_customize_popup_container']")
		public static WebElement enter_Account_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_12_customize_popup_footer']//input[1]")
		public static WebElement enter_Account_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_list']")
		public static WebElement enter_Account_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_header']")
		public static WebElement enter_Account_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_alignment']")
		public static WebElement enter_Account_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_width']")
		public static WebElement enter_Account_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement enter_Account_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement enter_Account_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_12_search_container']//input[2]")
		public static WebElement enter_Account_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement enter_Account_Settings_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement enter_Account_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_body_16']")
		public static WebElement enter_Amount;

		@FindBy(xpath = "//textarea[@id='id_body_16777219']")
		public static WebElement enter_Receipts_Remarks;

		@FindBy(xpath = "//textarea[@id='id_body_16777222']")
		public static WebElement enter_Payments_Remarks;

		@FindBy(xpath = "//textarea[@id='id_body_16777225']")
		public static WebElement enter_PettyCash_Remarks;

		@FindBy(xpath = "//textarea[@id='id_body_16777228']")
		public static WebElement enter_PostDatedReceipts_Remarks;

		@FindBy(xpath = "//textarea[@id='id_body_16777231']")
		public static WebElement enter_PostDatedPaymentss_Remarks;

		@FindBy(xpath = "//input[@id='id_body_23']")
		public static WebElement enter_ItemTxt;

		@FindBy(xpath = "//*[@id='id_body_23_input_image']/span")
		public static WebElement item_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_body_23_input_settings']/span")
		public static WebElement item_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_body_23_customize_popup_container']")
		public static WebElement item_Settings_Container;

		@FindBy(xpath = "//div[@id='id_body_23_customize_popup_footer']//input[1]")
		public static WebElement item_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_body_23_customize_popup_standardfields_list']")
		public static WebElement item_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_body_23_customize_popup_standardfields_header']")
		public static WebElement item_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_body_23_customize_popup_standardfields_alignment']")
		public static WebElement item_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_body_23_customize_popup_standardfields_width']")
		public static WebElement item_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement item_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement item_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_body_23_search_container']//input[2]")
		public static WebElement item_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement item_Settings_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement item_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_body_24']")
		public static WebElement enter_UnitTxt;

		@FindBy(xpath = "//*[@id='id_body_24_input_image']/span")
		public static WebElement unit_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_body_24_input_settings']/span")
		public static WebElement unit_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_body_24_customize_popup_container']")
		public static WebElement unit_Settings_Container;

		@FindBy(xpath = "//div[@id='id_body_24_customize_popup_footer']//input[1]")
		public static WebElement unit_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_body_24_customize_popup_standardfields_list']")
		public static WebElement unit_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_body_24_customize_popup_standardfields_header']")
		public static WebElement unit_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_body_24_customize_popup_standardfields_alignment']")
		public static WebElement unit_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_body_24_customize_popup_standardfields_width']")
		public static WebElement unit_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement unit_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement unit_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_body_24_search_container']//input[2]")
		public static WebElement unit_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement unit_Settings_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement unit_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_body_26']")
		public static WebElement enter_Quantity;

		@FindBy(xpath = "//input[@id='id_body_27']")
		public static WebElement enter_Rate;

		@FindBy(xpath = "//input[@id='id_body_28']")
		public static WebElement enter_Gross;

		@FindBy(xpath = "//input[@id='id_body_13']")
		public static WebElement enter_Batch;

		@FindBy(xpath = "//input[@id='id_body_12']")
		public static WebElement enter_DebitACTxt;

		@FindBy(xpath = "//*[@id='id_body_12_input_image']/span")
		public static WebElement enter_DebitAC_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_body_12_input_settings']/span")
		public static WebElement enter_DebitAC_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_12_customize_popup_container']")
		public static WebElement enter_DebitAC_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_12_customize_popup_footer']//input[1]")
		public static WebElement enter_DebitAC_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_list']")
		public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_header']")
		public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_alignment']")
		public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_width']")
		public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement enter_DebitAC_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_12_search_container']//input[2]")
		public static WebElement enter_DebitAC_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement enter_DebitAC_Settings_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement enter_DebitAC_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_body_39']")
		public static WebElement enter_CreditACTxt;

		@FindBy(xpath = "//*[@id='id_body_39_input_image']/span")
		public static WebElement enter_CreditAC_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_body_39_input_settings']/span")
		public static WebElement enter_CreditAC_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_39_customize_popup_container']")
		public static WebElement enter_CreditAC_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_39_customize_popup_footer']//input[1]")
		public static WebElement enter_CreditAC_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_39_customize_popup_standardfields_list']")
		public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_39_customize_popup_standardfields_header']")
		public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_39_customize_popup_standardfields_alignment']")
		public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_39_customize_popup_standardfields_width']")
		public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement enter_CreditAC_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_39_search_container']//input[2]")
		public static WebElement enter_CreditAC_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement enter_CreditAC_Settings_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement enter_CreditAC_Settings_CancelBtn;

		@FindBy(xpath = "//input[@id='id_body_18']")
		public static WebElement enter_DebitTxt;

		@FindBy(xpath = "//input[@id='id_body_19']")
		public static WebElement enter_CreditTxt;

		@FindBy(xpath = "//textarea[@id='id_body_16777241']")
		public static WebElement enter_NonStandardJournalEntries_RemarksTxt;

		@FindBy(xpath = "//input[@id='id_body_87']")
		public static WebElement enter_Warehouse2Txt;

		@FindBy(xpath = "//*[@id='id_body_87_input_image']/span")
		public static WebElement enter_Warehouse2_ExpansionBtn;

		@FindBy(xpath = "//*[@id='id_body_87_input_settings']/span")
		public static WebElement enter_Warehouse2_SettingsBtn;

		@FindBy(xpath = "//div[@id='id_header_87_customize_popup_container']")
		public static WebElement enter_WareHouse2_Settings_Container;

		@FindBy(xpath = "//div[@id='id_header_87_customize_popup_footer']//input[1]")
		public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn;

		@FindBy(xpath = "//select[@id='id_header_87_customize_popup_standardfields_list']")
		public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_Fielddropdown;

		@FindBy(xpath = "//input[@id='id_header_87_customize_popup_standardfields_header']")
		public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_HeaderTxt;

		@FindBy(xpath = "//select[@id='id_header_87_customize_popup_standardfields_alignment']")
		public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_Alignmentdropdown;

		@FindBy(xpath = "//input[@id='id_header_87_customize_popup_standardfields_width']")
		public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_WidthTxt;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_CancelBtn;

		@FindBy(xpath = "//div[@id='id_header_87_search_container']//input[2]")
		public static WebElement enter_WareHouse2_Settings_DeleteColumnBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
		public static WebElement enter_WareHouse2_Settings_OkBtn;

		@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
		public static WebElement enter_WareHouse2_Settings_CancelBtn;

		@FindBy(xpath = "//*[@id='ISOCurrencyCode_input_image']/span")
		public static WebElement isoCurrencyCodeComboboxButton;
		
		@FindBy(xpath = "//input[@id='sFileName1']")
		public static WebElement extraFields_DocumentTab_FileName;

		@FindBy(xpath = "//input[@id='biDocument1']")
		public static WebElement extraFields_DocumentTab_Document;

		@FindBy(xpath = "//tr[1]//td[5]//div[1]//div[1]//div[1]")
		public static WebElement extraFields_DocumentTab_UploadDocument;

		@FindBy(xpath = "//a[@id='SaveImg']")
		public static WebElement extraFields_DocumentTab_SaveDocument;

		@FindBy(xpath = "//i[@class='fa fa-eraser RemoveImg']")
		public static WebElement extraFields_DocumentTab_DeleteDocument;

		@FindBy(xpath = "//input[@id='iFileSize1']")
		public static WebElement extraFields_DocumentTab_FileSize;

		// Right Panel InfoSide Bar
		@FindBy(xpath = "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
		public static WebElement infoSideBarCustomizeBtn;

		@FindBy(xpath = "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
		public static WebElement customizeCustCloseBtn;

		@FindBy(xpath = "//div[@id='id_transactionentry_infopanel_customize_container']//li[@id='Dash_Save']")
		public static WebElement customizeSaveBtn;

		@FindBy(xpath = "//div[@id='id_transactionentry_infopanel_customize_container']//li[@id='Dash_Close']")
		public static WebElement customizeCancelBtn;

		@FindBy(xpath = "//input[@id='searchBoxTrans']")
		public static WebElement customizeSearchTxt;

		@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@class='icon-search searchicon']")
		public static WebElement customizeSearchBtn;

		@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='g']")
		public static WebElement graphBtn;

		@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='Newgraph']")
		public static WebElement newGraphOption;

		@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='r']")
		public static WebElement reportBtn;

		@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewReport']")
		public static WebElement newReportOption;

		@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='i']")
		public static WebElement infoPanelBtn;

		@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewInfopanel']")
		public static WebElement newInfoPanelOption;

		@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='w']")
		public static WebElement workFlowBtn;

		@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewWorkflow']")
		public static WebElement newWorkFlowOption;

		@FindBy(xpath = "//a[@id='DocumentInfoOption']")
		public static WebElement otherDashlets;

		@FindBy(xpath = "//*[@id='id_Dashlet0']")
		public static WebElement documentInfo;

		@FindBy(xpath = "//span[contains(@class,'icon-left-and-right-panel-icon icon-font6 no_padding_left_right')]")
		public static WebElement infoSideBarMinimizeExpandBtn;

		@FindBy(xpath = "//span[@class='icon-left-and-right-panel-icon icon-font6 no_padding_left_right']")
		public static WebElement infoSideBarExpandBtn;

		// Footer Section
		@FindBy(xpath = "//label[@id='id_transactionentry_footer_panel_summary_value_net']")
		public static WebElement netLabel;

		@FindBy(xpath = "//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
		public static WebElement netAmount;

	

	    
	   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
		public static WebElement userNameDisplay;*/


		    
		// Server Error Elements
		@FindBy(xpath = "//div[@id='id_focus_msgbox_main']")
		public static WebElement serverErrorPopup;

		@FindBy(xpath = "//div[@id='id_focus_msgbox_main']/div[2]/button")
		public static WebElement serverErrorClose;


		 public static boolean checkErrorMessageIsDisplayingOrNotDisplaying() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
		   {     
			   
			 System.out.println("************************   checkErrorMessageIsDisplayingOrNotDisplaying Method Executes.............    ******************************");
			   
			 try 
			 { 
				boolean actValidationMessageIsEmptyDisplay      = validationConfirmationMessage.getText().isEmpty();
		        boolean expValidationMessageIsEmptyDisplay      = true;   
				
		        System.out.println("Error Message Is Displaying Or Not Displaying Value Actual : " + actValidationMessageIsEmptyDisplay + " Value Expected : " + expValidationMessageIsEmptyDisplay);
		        
				if (actValidationMessageIsEmptyDisplay == expValidationMessageIsEmptyDisplay)
				{
					//System.out.println("No Error Message Is Displaying On Opening Page,Click On Add, Edit, Delete Etc...... In Method : " + validationConfirmationMessage.getText());
					return true;
				} 
				else 
				{
					//System.err.println("Error Message Is Displaying On Opening Page, Click, Add, Edit, Delete Etc..... In Method : " + validationConfirmationMessage.getText());
					errorMessageCloseBtn.click();
					return false;
				}
				
			 } 
			 catch (NoSuchElementException nse)
			 {
				System.err.println("CATCH BLOCK : NO SUCH ELEMENT MESSAGE IS DISPLAY  :   "+ nse.getMessage());
				return false;
			 }
		  }



		
		
		
		// Customize Master In Accounts Master Page
		@FindBy(xpath = "//a[@href='#HeaderDetails_0']")
		public static WebElement accountsCustomizeGeneralHeaderDetailsTab;

		@FindBy(xpath = "//a[@href='#HeaderDetails_1']")
		public static WebElement accountsCustomizeSettingsHeaderDetailsTab;

		@FindBy(xpath = "//a[@href='#BodyDetails_1']")
		public static WebElement accountsCustomizeSettingsBodyDetailsTab;

		@FindBy(xpath = "//a[@href='#HeaderDetails_2']")
		public static WebElement accountsCustomizeDetailsHeaderDetailsTab;

		@FindBy(xpath = "//a[@href='#BodyDetails_2']")
		public static WebElement accountsCustomizeDetailsBodyDetailsTab;

		@FindBy(xpath = "//a[@href='#HeaderDetails_3']")
		public static WebElement accountsCustomizePrintLayoutHeaderDetailsTab;

		@FindBy(xpath = "//a[@href='#BodyDetails_3']")
		public static WebElement accountsCustomizePrintLayoutBodyDetailsTab;

		@FindBy(xpath = "//a[@href='#HeaderDetails_4']")
		public static WebElement accountsCustomizeTreeTabHeaderDetailsTab;

		@FindBy(xpath = "//a[@href='#BodyDetails_4']")
		public static WebElement accountsCustomizeTreeTabBodyDetailsTab;

		@FindBy(xpath = "//a[@href='#HeaderDetails_5']")
		public static WebElement accountCustomizeDocumetTabHeaderDetailsTab;

		@FindBy(xpath = "//a[@href='#BodyDetails_5']")
		public static WebElement accountCustomizeDocumetTabBodyDetailsTab;

		@FindBy(xpath = "//a[@href='#HeaderDetails_6']")
		public static WebElement accountCustomizeCreateTabHeaderDetailsTab;

		@FindBy(xpath = "//a[@href='#BodyDetails_6']")
		public static WebElement accountCustomizeCreateTabBodyDetailsTab;

		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[9]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditNinethRowBtn;
		
		@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[10]/td[1]/i[1]")
		public static WebElement accountSettingsHeaderEditTenthRowBtn;
		
		@FindBy(xpath="//*[@id='navigation_menu']/li/a/div/div")
		public static List<WebElement> menusList;
		
		@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li/a/span")
		public static List<WebElement> homeMenuList;
		
		@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li/a/span")
		public static List<WebElement> mastersMenuList;
		
		@FindBy(xpath="//*[@id='ulCommonlyUsedRibbon']/li/span")
		public static List<WebElement> mastersRibbonControlList;
		
		@FindBy(xpath ="//*[@id='ulRibbonControl']/li/span")
		public static List<WebElement> ribbonControlExpandList;
		
		@FindBy(xpath = "//span[@id='updateButton']")
		public static WebElement updateBtn;
		
		// Home Menu
		@FindBy(xpath = "//*[@id='1']/div/span")
		public static WebElement homeMenu;

		//Financial Menu
		@FindBy (xpath="//span[@class='icon-financial icon-font1']")
	    public static WebElement financialMenu;
		
		//Inventory Menu
		@FindBy (xpath="//span[@class='icon-inventory icon-font1']")
	    public static WebElement inventoryMenu;
		
		//Fixed Assets Menu
		@FindBy (xpath="//span[@class='icon-assets icon-font1']")
	    public static WebElement fixedAssetsMenu;
		
		//Production Menu
		@FindBy (xpath="//span[@class='icon-production icon-font1']")
	    public static WebElement productionMenu;
		
		//Point Of Sale Menu
		@FindBy (xpath="//div[contains(text(),'Point of Sale')]")
	    public static WebElement pointOfSaleMenu;
		
		//Quality Of Control Menu
		@FindBy (xpath="//span[@class='icon-quotationanalysis icon-font1']")
	    public static WebElement qualityControlMenu;
		
		//Settings Menu
		@FindBy (xpath="//span[@class='icon-settings icon-font1']")
		public static WebElement SettingsMenu;
		
		  //Company Menu
				@FindBy (xpath="//*[@id='2']/span")
			    public static WebElement companyMenu;

			    //Security Menu	
				@FindBy (xpath="//*[@id='6']/span")
			    public static WebElement securityMenu;

		        //Masters Menu	
				@FindBy (xpath="//*[@id='1000']/span")
			    public static WebElement mastersMenu;

		        //DataManagement menu
				@FindBy (xpath="//*[@id='25']/span")
			    public static WebElement dataMangementMenu;

		        //Utilities Menu		
				@FindBy (xpath="//*[@id='20']/span")
			    public static WebElement utilities;
			
			
				//In Masters Menu
				
				// Accounts
				@FindBy(xpath = "//a[@id='1104']//span[contains(text(),'Account')]")
				public static WebElement accounts;

		        @FindBy (xpath="//*[@id='220']/span")
				public static WebElement currency;

		        @FindBy (xpath="//*[@id='221']/span")
				public static WebElement products;

		        @FindBy (xpath="//*[@id='224']/span")
				public static WebElement mrp;

		        @FindBy (xpath="//a[@id='225']//span[contains(text(),'QC')]")
				public static WebElement qc;

		        @FindBy (xpath="//*[@id='251']/span")
				public static WebElement maintainance;

		        @FindBy (xpath="//*[@id='8001']/span")
				public static WebElement pointOfSale;

		        @FindBy (xpath="//*[@id='1106']/span")
				public static WebElement departments;

				@FindBy (xpath="//*[@id='1107']/span")
				public static WebElement warehouse;

				@FindBy (xpath="//*[@id='1108']/span")
				public static WebElement costcenter;

				@FindBy (xpath="//*[@id='1109']/span")
				public static WebElement location;

				@FindBy (xpath="//*[@id='1110']/span")
				public static WebElement region;

				@FindBy (xpath="//*[@id='1111']/span")
				public static WebElement country;

				@FindBy (xpath="//*[@id='1112']/span")
				public static WebElement state;

				@FindBy (xpath="//*[@id='1113']/span")
				public static WebElement city;

				@FindBy (xpath="//*[@id='1115']/span")
				public static WebElement bins;

				@FindBy (xpath="//*[@id='1126']/span")
				public static WebElement insurance;

				@FindBy (xpath="//*[@id='1127']/span")
				public static WebElement fixedassets;
				
				@FindBy (xpath="//*[@id='1161']/span")
				public static WebElement taxCode;
				
		        @FindBy (xpath="//*[@id='1103']/span")
				public static WebElement payroll;
			
		        @FindBy (xpath="//*[@id='8002']/span")
		  		public static WebElement schemes;
		        
		        public static int cSize;
				
		
		      public static boolean checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		   	  {
		   		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		   		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		   			
		   		 
		   		 getDriver().navigate().refresh();
				 Thread.sleep(3000);
				 
				 getDriver().navigate().refresh();
				 Thread.sleep(3000);
		   		
		   		 
		   			LoginPage lp=new LoginPage(getDriver()); 
		   			
		   	        String unamelt="su";
		   	      
		   	        String pawslt="su";
		   	      
		   	        lp.enterUserName(unamelt);
		   	
		   	        lp.enterPassword(pawslt);
		   	        
		   	     String compname="Automation Company";
				 	
				 Select oSelect = new Select(companyDropDownList);
				 
				 List <WebElement> elementCount = oSelect.getOptions();
				
				 int cqSize = elementCount.size();
				 
				 int zqSize=cSize+1;
				 
				 System.out.println("CompanyDropdownList Count :"+cqSize);
				 
				 System.out.println("Company dropdown is :"+ zqSize);
			 
			 
			 //Select dropdown= new Select(lp.companyDropDownList);
			  int i;
			  
			  //List<WebElement> list = dropdown.getOptions();

				//List<String> text = new ArrayList<>();
				for(i=0; i<elementCount.size(); i++) 
				{
				
				  elementCount.get(i).getText();
		    	  String optionName = elementCount.get(i).getText();
		    	  if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
		    	  {
		    		  System.out.println("q"+elementCount.get(i).getText());
		    		  elementCount.get(i).click();
		    		  
		    	  }
		      
		      }
		   	  
		   	        lp.clickOnSignInBtn();
		   	        
		   	        //checkPopUpWindow();
		   	        
		   	        Thread.sleep(5000);
		   	           	
		   	    	String userInfo=userNameTxt.getText();
		   	    	
		   	    	System.out.println("User Info : "+userInfo);
		   	    	
		   	    	System.out.println("User Info Capture Text :"+userNameTxt.getText());
		   	    	
		   	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogoImg));
		   	    	
		   	    	companyLogoImg.click();
		   	    	
		   	    	String getCompanyTxt=companyName.getText();
		   	    	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		   	    	System.out.println("company name :"+ getLoginCompanyName);
		   	    	companyLogoImg.click();
		   	    	
		   	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
		   	    	
		   	    	String getDashboard=dashboardName.getText();
		   	    	
		   	    	System.out.println(getDashboard);

		   			  if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
		   			    		getDashboard.equalsIgnoreCase("Dashboard"))
		   			  {
		   					excelReader.setCellData(xlfile, "Sheet1", 7, 9, resPass);
		   					return true;
		   			  }
		   			  else
		   			  {
		   					excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
		   					return true;
		   			  }

		   	 }
		   	 


		        
		        
		        
		        
	
	  public boolean checkAvailableOptionsInSettingsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
			
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		System.out.println("********************* checkAvailableOptionsInSettingsMenu Method Executes.............   *****************************");
		
		
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			
			ArrayList<String>actsettingMenuList=new ArrayList<String>();
			
			int SettingMenuCount=settingMenuList.size();
			
			System.out.println(" SettingMenuCount  :  "+SettingMenuCount);
			
			for (int i = 0; i < SettingMenuCount; i++)
			{
				String data=settingMenuList.get(i).getText();
				actsettingMenuList.add(data);
			}
			
			String actsettingMenu=actsettingMenuList.toString();
			String expsettingMenu="[Configure Transactions, Transaction Authorization, Pricebook Authorization, Configure Masters, Master Authorization, Credit Limit Authorization, Design Workflow, Settings Wizard, Export/Import Settings, Batch Code Generation, Map Credit Limit, VAT Tax Code, Customer Portal Admin, Budget Authorization, Payment Gateway Integration, AI Setup, Fixed Asset Authorization, Configure Forms, Form Authorization]";
					/*excelReader.getCellData(xlSheetName, 9, 7);*/
			
			System.err.println("  Actual settingMenu    : "+actsettingMenu);
			System.err.println("  Expected  settingMenu : "+expsettingMenu);
			
			excelReader.setCellData(xlfile, xlSheetName, 9, 8, actsettingMenu);
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureTransactions));
				
			boolean actConfigureTransactionsMenu     = settingsConfigureTransactions.isDisplayed(); 
			boolean actTransactionAuthorizationMenu  = settingsTransactionAuthorization.isDisplayed();
			boolean actPriceBookAuthorizationMenu    = settingsPricebookAuthorization.isDisplayed();
			boolean actConfigureMastersMenu          = settingsConfigureMasters.isDisplayed(); 
			boolean actMasterAuthorizationMenu       = settingsMasterAuthorization.isDisplayed();
			boolean actCreditLimitAuthorizationMenu  = settingsCreditLimitAuthorization.isDisplayed(); 
			boolean actDesignWorkFlowMenu            = settingsDesignWorkflow.isDisplayed();
			boolean actSettingsWizardMenu            = settingsSettingsWizard.isDisplayed(); 
		    boolean actBatchCodeGenerationMenu       = settingsBatchCodeGeneration.isDisplayed(); 
			boolean actMapCreditLimitMenu            = settingsMapCreditLimit.isDisplayed(); 
			boolean actVATTaxCodeMenu                = settingsVATTaxCode.isDisplayed();
			boolean actCustomerPortalAdminMenu       = settingsCustomerPortalAdmin.isDisplayed(); 
		    boolean actPaymentGatewayIntegrationMenu = settingsPaymentGatewayIntegration.isDisplayed();
	        boolean actFixedAssetsAuthorization      = settingsFixedAssetsAuthorization.isDisplayed();
	        boolean actsettingsAISetup               = settingsAISetup.isDisplayed();
	        boolean actConfigureForms                = ConfigureForms.isDisplayed();
	        
	        boolean expConfigureTransactionsMenu     = true;
	        boolean expTransactionAuthorizationMenu  = true;
	        boolean expPriceBookAuthorizationMenu    = true;
	        boolean expConfigureMastersMenu          = true;
	        boolean expMasterAuthorizationMenu       = true;
	        boolean expCreditLimitAuthorizationMenu  = true;
	        boolean expDesignWorkFlowMenu            = true;
	        boolean expSettingsWizardMenu            = true;
	        boolean expBatchCodeGenerationMenu       = true;
	        boolean expMapCreditLimitMenu            = true;
	        boolean expVATTaxCodeMenu                = true;
	        boolean expCustomerPortalAdminMenu       = true;
	        boolean expPaymentGatewayIntegrationMenu = true;
	        boolean expsettingsAISetup               = true;
	        boolean expFixedAssetsAuthorization      = true;
	        boolean expConfigureForms                = true;
	        
	        
	        System.out.println("Configure Transactions Menu Value Actual      : " + actConfigureTransactionsMenu +     " Value Expected : " + expConfigureTransactionsMenu);
	        System.out.println("Transaction Authorization Menu Value Actual   : " + actTransactionAuthorizationMenu +  " Value Expected : " + expTransactionAuthorizationMenu);
	        System.out.println("Pricebook Authorization Menu Value Actual     : " + actPriceBookAuthorizationMenu +    " Value Expected : " + expPriceBookAuthorizationMenu);
	        System.out.println("Configure Masters Menu Value Actual           : " + actConfigureMastersMenu +          " Value Expected : " + expConfigureMastersMenu);
	        System.out.println("Master Authorization Menu Value Actual        : " + actMasterAuthorizationMenu +       " Value Expected : " + expMasterAuthorizationMenu);
	        System.out.println("Credit Limit Authoization Menu Value Actual   : " + actCreditLimitAuthorizationMenu +  " Value Expected : " + expCreditLimitAuthorizationMenu);
	        System.out.println("Design Workflow Menu Value Actual             : " + actDesignWorkFlowMenu +            " Value Expected : " + actDesignWorkFlowMenu);
	        System.out.println("Settings Wizard Menu Value Actual             : " + actSettingsWizardMenu +            " Value Expected : " + actSettingsWizardMenu);
	        System.out.println("Batch Code Generation Menu Value Actual       : " + expBatchCodeGenerationMenu +       " Value Expected : " + expBatchCodeGenerationMenu);
	        System.out.println("Map Credit Limit Menu Value Actual            : " + expMapCreditLimitMenu +            " Value Expected : " + expMapCreditLimitMenu);
	        System.out.println("VAT Tax Code Menu Value Actual                : " + expVATTaxCodeMenu +                " Value Expected : " + expVATTaxCodeMenu);
	        System.out.println("Customer Portal Menu Value Actual             : " + expCustomerPortalAdminMenu +       " Value Expected : " + expCustomerPortalAdminMenu);
	        System.out.println("Payment Gateway Integration Menu Value Actual : " + expPaymentGatewayIntegrationMenu + " Value Expected : " + expPaymentGatewayIntegrationMenu);
	        System.out.println("Fixed Assets Authorization Menu Value Actual  : " + expFixedAssetsAuthorization +      " Value Expected : " + expFixedAssetsAuthorization);
	        
	        
	        
	        
	        boolean displayResult=actConfigureTransactionsMenu==expConfigureTransactionsMenu && actTransactionAuthorizationMenu==expTransactionAuthorizationMenu
									&& actPriceBookAuthorizationMenu==expPriceBookAuthorizationMenu && actConfigureMastersMenu==expConfigureMastersMenu
									&& actMasterAuthorizationMenu==expMasterAuthorizationMenu && actCreditLimitAuthorizationMenu==expCreditLimitAuthorizationMenu
									&& actDesignWorkFlowMenu==expDesignWorkFlowMenu && actSettingsWizardMenu==expSettingsWizardMenu
									&& actBatchCodeGenerationMenu==expBatchCodeGenerationMenu && actMapCreditLimitMenu==expMapCreditLimitMenu
									&& actVATTaxCodeMenu==expVATTaxCodeMenu && actCustomerPortalAdminMenu==expCustomerPortalAdminMenu
									&& actPaymentGatewayIntegrationMenu==expPaymentGatewayIntegrationMenu && actFixedAssetsAuthorization==expFixedAssetsAuthorization && actConfigureForms==expConfigureForms;
					        
	        
	        String actDisplayResult=Boolean.toString(displayResult);
	        String expDisplayResult=excelReader.getCellData(xlSheetName, 10, 7);
	        
	        excelReader.setCellData(xlfile, xlSheetName, 10, 8, actDisplayResult.toUpperCase());
	        		
	        System.out.println("actDisplayResult  : "+actDisplayResult +" Value Expected : "+expDisplayResult);
	        System.out.println("actsettingMenu  : "+actsettingMenu +" Value Expected : "+expsettingMenu);
	        
	        
			if (actDisplayResult.equalsIgnoreCase(expDisplayResult)&& 
					actsettingMenu.equalsIgnoreCase(expsettingMenu))
			{	
				System.out.println("Test Pass : VerifyPreferencesOptions Elements Are Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 8, 9, resPass);
				return true;
			} 	
			else 
			{
				System.out.println("Test Fail :VerifyPreferencesOptions Elements Are Not Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 8, 9, resFail);
				return false;
			}
		
	  }
		
		
		
	  
		
	
	
		
		
		
		  public boolean checkConfigureTransactionsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		  {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			System.out.println("********************* checkConfigureTransactionsMenu Method Executes.............   *****************************");
			
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
				ConfigureTransactionBtn.click();
							
		         ArrayList<String>actconfigureTransactionPageList=new ArrayList<String>();
				
				int configureTransactionPageCount=configureTransactionPageList.size();
				
				System.out.println(" configureTransactionPageCount  :  "+configureTransactionPageCount);
				
				for (int i = 0; i < configureTransactionPageCount; i++)
				{
					String data=configureTransactionPageList.get(i).getText();
					actconfigureTransactionPageList.add(data);
				}
				
				String actconfigureTransactionPage=actconfigureTransactionPageList.toString();
				String expconfigureTransactionPage=excelReader.getCellData(xlSheetName, 12, 7);
				
				System.err.println("  Actual configureTransactionPageList    : "+actconfigureTransactionPage);
				System.err.println("  Expected  configureTransactionPageList : "+expconfigureTransactionPage);
				
				excelReader.setCellData(xlfile, xlSheetName, 12, 8, actconfigureTransactionPage);
				
				
				boolean actPreferencesOption             = PreferencesBtn.isDisplayed(); 
				boolean actDocumentCustomizationOption   = DocumentCustomizationBtn.isDisplayed();
				
				boolean expPreferencesOption             = true;
			    boolean expDocumentCustomizationOption   = true;
				
			    System.out.println("Preferences Option Value Actual            : " + actPreferencesOption           +  " Value Expected : " + expPreferencesOption);
			    System.out.println("Document Customization Option Value Actual : " + actDocumentCustomizationOption +  " Value Expected : " + expDocumentCustomizationOption);
			     
			    
			    boolean displayResult=actPreferencesOption==expPreferencesOption && actDocumentCustomizationOption==expDocumentCustomizationOption;
			    
			    String actDisplayResult=Boolean.toString(displayResult);
			    String expDisplayResult=excelReader.getCellData(xlSheetName, 13, 7);
			    
			    excelReader.setCellData(xlfile, xlSheetName, 13, 8, actDisplayResult);
			    
				if (actDisplayResult.equalsIgnoreCase(expDisplayResult)&& actconfigureTransactionPage.equalsIgnoreCase(expconfigureTransactionPage))
				{	
					System.out.println("Test Pass : VerifyPreferencesOptions Elements Are Displayed As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 11, 9, resPass);
					return true;
				} 	
				else 
				{
					System.out.println("Test Fail :VerifyPreferencesOptions Elements Are Not Displayed As Expected");
					excelReader.setCellData(xlfile, xlSheetName, 11, 9, resFail);
					return false;
				}
			}
			
		  
		 
			
			

			@FindBy(xpath="//ul[@id='salesnav']//li")
			public static List<WebElement>  preferenceList;
			
			

			
			 public boolean checkPreferencesOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
						
				System.out.println("********************* checkPreferencesOption Method Executes.............   *****************************");
				
				
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(QuotationAnalysisBtn));
				
					boolean actTags                           = TagsBtn.isDisplayed();
					boolean actAccounts                       = AccountsBtn.isDisplayed();
					boolean actBudget                         = BudgetBtn.isDisplayed(); 
					boolean actARAP                           = ARAPBtn.isDisplayed(); 
					boolean actMiscelleanous                  = MiselleanousBtn.isDisplayed(); 
					boolean actPDC                            = PDCBtn.isDisplayed();
					boolean actInventory                      = InventoryBtn.isDisplayed();
					boolean actBatch                          = BatchBtn.isDisplayed();
					boolean actRMA                            = RMABtn.isDisplayed();    
					boolean actBins                           = BinsBtn.isDisplayed(); 
					boolean actPurchase                       = HirePurchaseBtn.isDisplayed();
					boolean actQuotationAnalysis              = QuotationAnalysisBtn.isDisplayed(); 
					boolean actRFID                           = RFIDBtn.isDisplayed(); 
					boolean actAutoIndent                     = AutoIndentBtn.isDisplayed(); 
					
					boolean actABCAnalysis                    = ABCAnalysisBtn.isDisplayed(); 
					boolean actReport                         = ReportBtn.isDisplayed(); 
					boolean actInternet                       = InternetBtn.isDisplayed();	
					boolean actMiscellaneous                  = MailSettingsBtn.isDisplayed();  
					boolean actMasters                        = MastersBtn.isDisplayed();       
					boolean actExternalModules                = ExternalModulesBtn.isDisplayed();  
					boolean actInfo                           = InfoBtn.isDisplayed();  
					boolean actProduction                     = ProductionBtn.isDisplayed();  
					
					boolean actMRP                            = MrpBtn.isDisplayed(); 
					boolean actFixedAssets                    = FixedAssetsBtn.isDisplayed(); 
					boolean actVAT                            = VatBtn.isDisplayed(); 
					boolean actPOS                            = PosBtn.isDisplayed(); 
					boolean actWarehouseManagement            = WareHouseManagementBtn.isDisplayed();  
					boolean actLetterForCredit                = LetterForCreditBtn.isDisplayed(); 
					boolean actPronghorn                      = PronghornBnt.isDisplayed();
					boolean actAISettingsBtn				  = AISettingsBtn.isDisplayed();
					boolean actWhatsAppBtn                    = WhatsAppBtn.isDisplayed();
				
					
					boolean expTags                           = true;
					boolean expAccounts                       = true;
					boolean expBudget                         = true; 
					boolean expARAP                           = true;  
					boolean expMiscelleanous                  = true;  
					boolean expPDC                            = true; 
					boolean expInventory                      = true; 
					boolean expBatch                          = true; 
					boolean expRMA                            = true;     
					boolean expBins                           = true;  
					boolean expPurchase                       = true; 
					boolean expQuotationAnalysis              = true;  
					boolean expRFID                           = true;  
					boolean expAutoIndent                     = true;  
					
					boolean expABCAnalysis                    = true;  
					boolean expReport                         = true;  
					boolean expInternet                       = true; 	
					boolean expMiscellaneous                  = true;   
					boolean expMasters                        = true;        
					boolean expExternalModules                = true;   
					boolean expInfo                           = true;   
					boolean expProduction                     = true;   
					
					boolean expMRP                            = true;   
					boolean expFixedAssets                    = true;  
					boolean expVAT                            = true;  
					boolean expPOS                            = true;  
					boolean expWarehouseManagement            = true;   
					boolean expLetterForCredit                = true;  
					boolean expPronghorn                      = true; 
					boolean expAISettingsBtn				  = true;
					boolean expWhatsAppBtn                    = true;
					
					
					 ArrayList<String>actpreferenceList=new ArrayList<String>();
						
						int preferenceListCount=preferenceList.size();
						
						System.out.println(" preferenceListCount  :  "+preferenceListCount);
						
						for (int i = 0; i < preferenceListCount; i++)
						{
							String data=preferenceList.get(i).getText();
							actpreferenceList.add(data);
						}
						
						String actpreferenceOptions=actpreferenceList.toString();
						String exppreferenceOptions=excelReader.getCellData(xlSheetName, 15, 7);
						
						System.err.println("  Actual preferenceList : "+actpreferenceOptions);
						System.err.println("  Expected  preferenceList : "+exppreferenceOptions);
						
						excelReader.setCellData(xlfile, xlSheetName, 15, 8, actpreferenceOptions);
					
				    System.out.println("Tags Value Actual                : " + actTags +                " Value Expected : " + expTags);
			        System.out.println("Accounts Value Actual            : " + actAccounts +            " Value Expected : " + expAccounts);
			        System.out.println("Budget Value Actual              : " + actBudget +              " Value Expected : " + expBudget);
			        System.out.println("AR AP Value Actual               : " + actARAP +                " Value Expected : " + expARAP);
			        System.out.println("Miscellaneous Value Actual       : " + actMiscelleanous +       " Value Expected : " + expMiscelleanous);
			        System.out.println("PDC Value Actual                 : " + actPDC +                 " Value Expected : " + expPDC);
			        System.out.println("Inventory Value Actual           : " + actInventory +           " Value Expected : " + expInventory);
			        System.out.println("Batch Value Actual               : " + actBatch +               " Value Expected : " + expBatch);
			        System.out.println("RMA Value Actual                 : " + actRMA +                 " Value Expected : " + expRMA);
			        System.out.println("Bins Value Actual                : " + actBins +                " Value Expected : " + expBins);
			        System.out.println("Purchase Value Actual            : " + actPurchase +            " Value Expected : " + expPurchase);
			        System.out.println("Quotation Analysis Value Actual  : " + actQuotationAnalysis +   " Value Expected : " + expQuotationAnalysis);
			        System.out.println("RFID Menu Value Actual           : " + actRFID +                " Value Expected : " + expRFID);
			        System.out.println("Auto Indent Value Actual         : " + actAutoIndent +          " Value Expected : " + expAutoIndent);
			        
			        
			        System.out.println("ABC Analysis Value Actual        : " + actABCAnalysis +         " Value Expected : " + expABCAnalysis);
			        System.out.println("Report Value Actual              : " + actReport +              " Value Expected : " + expReport);
			        System.out.println("Internet Value Actual            : " + actInternet +            " Value Expected : " + expInternet);
			        System.out.println("Miscellaneous Value Actual       : " + actMiscellaneous +       " Value Expected : " + expMiscellaneous);
			        System.out.println("Masters Value Actual             : " + actMasters +             " Value Expected : " + expMasters);
			        System.out.println("External Modules Value Actual    : " + actExternalModules +     " Value Expected : " + expExternalModules);
			        System.out.println("Info Value Actual                : " + actInfo +                " Value Expected : " + expInfo);
			        System.out.println("Production Value Actual          : " + actProduction +          " Value Expected : " + expProduction);
			        
			        System.out.println("MRP Value Actual                 : " + actMRP +                 " Value Expected : " + expMRP);
			        System.out.println("Fixed Assets Value Actual        : " + actFixedAssets +         " Value Expected : " + expFixedAssets);
			        System.out.println("VAT Value Actual                 : " + actVAT +                 " Value Expected : " + expVAT);
			        System.out.println("POS Value Actual                 : " + actPOS +                 " Value Expected : " + expPOS);
			        System.out.println("Warehouse Mangement Value Actual : " + actWarehouseManagement + " Value Expected : " + expWarehouseManagement);
			        System.out.println("Letter For Credit Value Actual   : " + actLetterForCredit +     " Value Expected : " + expLetterForCredit);
			        System.out.println("Pronghorn Value Actual           : " + actPronghorn +           " Value Expected : " + expPronghorn);
			        System.out.println("AI SETTINGS Actual               : " + actAISettingsBtn +     	" Value Expected : " + expAISettingsBtn);
			        System.out.println("WHATSAPP Actual                  : " + actWhatsAppBtn +         " Value Expected : " +expWhatsAppBtn);
				            
			        
			        boolean displayResult=actTags==expTags && actAccounts==expAccounts
											&& actBudget==expBudget && actARAP==expARAP
											&& actMiscelleanous==expMiscelleanous && actPDC==expPDC
											&& actInventory==expInventory && actBatch==expBatch
											&& actRMA==expRMA && actBins==expBins
											&& actPurchase==expPurchase && actQuotationAnalysis==expQuotationAnalysis
											&& actRFID==actRFID && actAutoIndent==actAutoIndent
											&& actABCAnalysis==expABCAnalysis && actReport==expReport
											&& actInternet==expInternet && actInternet==expInternet
											&& actMiscellaneous==expMiscellaneous && actMasters==expMasters
											&& actExternalModules==expExternalModules && actInfo==expInfo
							                && actProduction==expProduction && actMRP==expMRP
							                && actFixedAssets==expFixedAssets && actVAT==expVAT
							                && actPOS==expPOS && actWarehouseManagement==expWarehouseManagement
							                && actLetterForCredit==expLetterForCredit && actPronghorn==expPronghorn && actAISettingsBtn == expAISettingsBtn && actWhatsAppBtn == expWhatsAppBtn;
			        
			        String actDisplayResult=Boolean.toString(displayResult);
			        String expDisplayResult=excelReader.getCellData(xlSheetName, 16, 7);
			        
			        excelReader.setCellData(xlfile, xlSheetName, 16, 8, actDisplayResult);
			        
					if (actDisplayResult.equalsIgnoreCase(expDisplayResult)/*&& 
							actpreferenceOptions.equalsIgnoreCase(exppreferenceOptions)*/)
					{	
						System.out.println("Test Pass : VerifyPreferencesOptions Elements Are Displayed As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 14, 9, resPass);
						return true;
					} 	
					else 
					{
						System.out.println("Test Fail :VerifyPreferencesOptions Elements Are Not Displayed As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 14, 9, resFail);
						return false;
					}
				}
				
				
				
			 public boolean checkTagsDefaultTagSettingsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			 {
				excelReader=new ExcelReader(POJOUtility.getExcelPath());
				xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
				System.out.println("********************* checkTagsDefaultTagSettingsOption Method Executes.............   *****************************");
				
				try
				{
			        ArrayList<String>actconfigureTransactionPageList=new ArrayList<String>();
					
					int configureTransactionPageCount=configureTransactionPageList.size();
					
					System.out.println(" configureTransactionPageCount  :  "+configureTransactionPageCount);
					
					for (int i = 0; i < configureTransactionPageCount; i++)
					{
						String data=configureTransactionPageList.get(i).getText();
						actconfigureTransactionPageList.add(data);
					}
					
					String actconfigureTransactionPage=actconfigureTransactionPageList.toString();
					String expconfigureTransactionPage=excelReader.getCellData(xlSheetName, 18, 7);
					
					System.err.println("  Actual configureTransactionPageList : "+actconfigureTransactionPage);
					System.err.println("  Expected  configureTransactionPageList : "+expconfigureTransactionPage);
					
					excelReader.setCellData(xlfile, xlSheetName, 18, 8, actconfigureTransactionPage);
					
					boolean actAccountingDropdown             = AccountingDropdown.isDisplayed(); 
					boolean actInventoryDropdown              = InventoryDropdown.isDisplayed();  
					boolean actPayrollCostcenterDropdown      = PayRollCostCenterDropdown.isDisplayed();
					boolean actSellingRatesDropdown           = SellingsRateDropdown.isDisplayed(); 
					boolean actBuyingRatesDropdown            = BuyingRatesdropdown.isDisplayed();
					boolean actPayrollDepartmentDropdown      = PayRollDepartmentDropdown.isDisplayed(); 
					boolean actPayrollSiteDropdown            = PayRollSiteDropdown.isDisplayed(); 
					boolean actFinancialAppropriationDropdown = FinancialAppropriationByDropdown.isDisplayed(); 
					boolean actVATDropdown                    = VatDropdown.isDisplayed(); 
					boolean actSchemeDropdown                 = SchemesDropdown.isDisplayed(); 
					boolean actInventoryAllocationTagDropdown = InventoryAloocationTagDropdown.isDisplayed(); 
					/*boolean actSearchTxt                      = SearchTxt.isDisplayed(); */
					boolean actUpdateBtn                      = UpdateBtn.isDisplayed(); 
					boolean actCustCloseBtn                       = CustCloseBtn.isDisplayed();
					
					boolean expAccountingDropdown             = true;
					boolean expInventoryDropdown              = true;  
					boolean expPayrollCostcenterDropdown      = true;
					boolean expSellingRatesDropdown           = true; 
					boolean expBuyingRatesDropdown            = true;
					boolean expPayrollDepartmentDropdown      = true; 
					boolean expPayrollSiteDropdown            = true; 
					boolean expFinancialAppropriationDropdown = true; 
					boolean expVATDropdown                    = true; 
					boolean expSchemeDropdown                 = true; 
					boolean expInventoryAllocationTagDropdown = true; 
					/*boolean expSearchTxt                      = true; */
					boolean expUpdateBtn                      = true; 
					boolean expCustCloseBtn                       = true;
					
				    System.out.println("Configure Transactions Menu Value Actual      : " + actAccountingDropdown +              " Value Expected : " + expAccountingDropdown);
			        System.out.println("Transaction Authorization Menu Value Actual   : " + actInventoryDropdown +               " Value Expected : " + expInventoryDropdown);
			        System.out.println("Pricebook Authorization Menu Value Actual     : " + actPayrollCostcenterDropdown +       " Value Expected : " + expPayrollCostcenterDropdown);
			        System.out.println("Configure Masters Menu Value Actual           : " + actSellingRatesDropdown +            " Value Expected : " + expSellingRatesDropdown);
			        System.out.println("Master Authorization Menu Value Actual        : " + actBuyingRatesDropdown +             " Value Expected : " + expBuyingRatesDropdown);
			        System.out.println("Credit Limit Authoization Menu Value Actual   : " + actPayrollDepartmentDropdown +       " Value Expected : " + expPayrollDepartmentDropdown);
			        System.out.println("Design Workflow Menu Value Actual             : " + actPayrollSiteDropdown +             " Value Expected : " + expPayrollSiteDropdown);
			        System.out.println("Settings Wizard Menu Value Actual             : " + actFinancialAppropriationDropdown +  " Value Expected : " + expFinancialAppropriationDropdown);
			        System.out.println("Batch Code Generation Menu Value Actual       : " + actVATDropdown +                     " Value Expected : " + expVATDropdown);
			        System.out.println("Map Credit Limit Menu Value Actual            : " + actSchemeDropdown +                  " Value Expected : " + expSchemeDropdown);
			        System.out.println("VAT Tax Code Menu Value Actual                : " + actInventoryAllocationTagDropdown +  " Value Expected : " + expInventoryAllocationTagDropdown);
			        /*System.out.println("Customer Portal Menu Value Actual             : " + actSearchTxt +  1                     " Value Expected : " + expSearchTxt);*/
			        System.out.println("Payment Gateway Integration Menu Value Actual : " + actUpdateBtn +                       " Value Expected : " + expUpdateBtn);
			        System.out.println("Fixed Assets Authorization Menu Value Actual  : " + actCustCloseBtn +                        " Value Expected : " + expCustCloseBtn);
			        
			        
			        boolean displayResult=actAccountingDropdown==expAccountingDropdown && actInventoryDropdown==expInventoryDropdown
												&& actPayrollCostcenterDropdown==expPayrollCostcenterDropdown && actSellingRatesDropdown==expSellingRatesDropdown
												&& actBuyingRatesDropdown==expBuyingRatesDropdown && actPayrollDepartmentDropdown==expPayrollDepartmentDropdown
												&& actPayrollSiteDropdown==expPayrollSiteDropdown && actFinancialAppropriationDropdown==expFinancialAppropriationDropdown
												&& actVATDropdown==expVATDropdown && actSchemeDropdown==expSchemeDropdown
												&& actInventoryAllocationTagDropdown==expInventoryAllocationTagDropdown /*&& actSearchTxt==expSearchTxt*/
												&& actUpdateBtn==expUpdateBtn && actCustCloseBtn==expCustCloseBtn;
								        
			        String actDisplayresult=Boolean.toString(displayResult);
			        String expDisplayResult=excelReader.getCellData(xlSheetName, 19, 7);
			        
			        excelReader.setCellData(xlfile, xlSheetName, 19, 8, actDisplayresult.toUpperCase());
			        
			       
					if (actDisplayresult.equalsIgnoreCase(expDisplayResult) && 
							actconfigureTransactionPage.equalsIgnoreCase(expconfigureTransactionPage))
					{	
						System.out.println("Test Pass : VerifyPreferencesOptions Elements Are Displayed As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 17, 9, resPass);
						return true;
					} 	
					else 
					{
						System.out.println("Test Fail :VerifyPreferencesOptions Elements Are Not Displayed As Expected");
						excelReader.setCellData(xlfile, xlSheetName, 17, 9, resFail);
						return false;
					}
				}

				catch (Exception e) 
				  {
					  String exception =e.getMessage();
					  excelReader.setExceptionInExcel(xlfile, xlSheetName, 17, 10, exception);
					  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
					  return false;
				  }
			}
					
	
			
	public boolean checkEnableAccountingTag() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountingDropdown));
		AccountingDropdown.click();
		
		Select s=new Select(AccountingDropdown);
		int DropdownCount=s.getOptions().size();
		
		ArrayList<String> AccountingDropdownArray = new ArrayList<String>();
		
		for(int i=0;i<DropdownCount;i++)
		{
			String data = s.getOptions().get(i).getText();
			AccountingDropdownArray.add(data);
		}
		
		String actAccountingDropdown = AccountingDropdownArray.toString();
		String expAccountingDropdown = "[, Department, Warehouse, Cost Center, Location, Region, Country, State, City, Units, Bins, Tax Code, Portal Rights, Plant, Supply Area, Maintenance Parameter, Safety Instructions, Capacity, Work Center, Holiday, Process, Qc failure reason, QC Parameters, Insurance, Fixed Asset, Break down standard reason, Employee, Designation, Position, Qualification, Specialization, Nationality, Skill Type, Skill, SourceType, Source, RoundType, Grade, Scale, Course Type, Course, Trainer, Airline Sector, Venue, Request Types, Expense Claims, Employee Bank, Travel Agent, Job Grade, Outlet, Counter, Member Type, Gift Voucher Definition, Category, Bank Card Type, Member, Discount Voucher Definition, Floor, Section, Table, Guest, Void Remarks, Member Card Definition, Return Remarks, Kitchen Display System, Delivery Time Interval, E- Payment, Order Type, Order Source]";
		
		System.out.println(" Actual    AccountingDropdown   : " + actAccountingDropdown );
		System.out.println(" Expected  AccountingDropdown   : " + expAccountingDropdown );
		
		
		String actDropdownCount=Integer.toString(DropdownCount);	
		
		/*String  expDropdownCount=excelReader.getCellData(xlSheetName, 21, 7);*/
		String  expDropdownCount="69";
        
        excelReader.setCellData(xlfile, xlSheetName, 21, 8, actDropdownCount);
		
		
		System.out.println("actDropdownCount  : "+actDropdownCount +" Value Expected : "+expDropdownCount);
		
		
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 22, 6));
		
		String actSelectdata=s.getFirstSelectedOption().getText();
		String expSelectdata=excelReader.getCellData(xlSheetName, 22, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 22, 8, actSelectdata);
		
		
		System.out.println("***********************************checkDefaultTagSettings****************************");
		
		System.out.println("AccountingDropdown Count      : "+actDropdownCount   +" Value Expected : "+expDropdownCount);
		System.out.println("AccountingDropdown Select     : "+actSelectdata      +" Value Expected : "+expSelectdata);
		
		if(actDropdownCount.equalsIgnoreCase(expDropdownCount) && actSelectdata.equalsIgnoreCase(expSelectdata))
		{
			System.out.println("Test Pass :VerifyEnablingtheAccountingTag Elements Are Displayed As Expected");
			System.out.println("Test Pass : Warehouse is Selected in Accounting Tag ");
			excelReader.setCellData(xlfile, xlSheetName, 20, 9, resPass);
			return true;
			
		}else
		{
			System.out.println("Test Fail :VerifyEnablingtheAccountingTag Elements Are Not Displayed As Expected");
			System.out.println("Test Pass : Warehouse is Not Selected in Accounting Tag ");
			excelReader.setCellData(xlfile, xlSheetName, 20, 9, resFail);
			return false;
		}
	}
	
	
	public boolean checkEnableInventoryTag() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryDropdown));
		InventoryDropdown.click();
		
		Select s1=new Select(InventoryDropdown);
		
        int DropdownCount=s1.getOptions().size();
		
		String actDropdownCount=Integer.toString(DropdownCount);
		String  expDropdownCount="69";
		
		/*String  expDropdownCount=excelReader.getCellData(xlSheetName, 24, 7);*/
        
        excelReader.setCellData(xlfile, xlSheetName, 24, 8, actDropdownCount);
		
		
		System.out.println("actDropdownCount  : "+actDropdownCount +" Value Expected : "+expDropdownCount);
		
		s1.selectByVisibleText(excelReader.getCellData(xlSheetName, 25, 6));
		
		String actSelectdata=s1.getFirstSelectedOption().getText();
		String expSelectdata=excelReader.getCellData(xlSheetName, 25, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 25, 8, actSelectdata);

		System.out.println("***********************************checkEnableInventoryTag****************************");
		
		System.out.println("InventoryDropdown Count      : "+actDropdownCount   +" Value Expected : "+expDropdownCount);
		System.out.println("InventoryDropdown Select     : "+actSelectdata      +" Value Expected : "+expSelectdata);
		
		if(actDropdownCount.equalsIgnoreCase(expDropdownCount) && actSelectdata.equalsIgnoreCase(expSelectdata))
		{
			System.out.println("Test Pass : VerifyEnablingtheInventoryTag Elements Are Displayed As Expected");
			System.out.println("Test Pass : City is Selected in Inventory Tag ");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail : VerifyEnablingtheInventoryTag Elements Are Not Displayed As Expected");
			System.out.println("Test Fail : City is Not Selected in Inventory Tag ");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resFail);
			return false;
		}
	}

	
	
	
	public boolean checkEnableSellingRateBuyingRateTag() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SellingsRateDropdown));
		SellingsRateDropdown.click();
		
		Select s2=new Select(SellingsRateDropdown);
		int DropdownCount=s2.getOptions().size();
        String actDropdownCount=Integer.toString(DropdownCount);
        String  expDropdownCount="69";
		
		
		/*String  expDropdownCount=excelReader.getCellData(xlSheetName, 27, 7);*/
        excelReader.setCellData(xlfile, xlSheetName, 27, 8, actDropdownCount);
		
        
        s2.selectByVisibleText(excelReader.getCellData(xlSheetName, 28, 6));
		
		String actSelectdata=s2.getFirstSelectedOption().getText();
		String expSelectdata=excelReader.getCellData(xlSheetName, 28, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 28, 8, actSelectdata);

		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BuyingRatesdropdown));
		BuyingRatesdropdown.click();
		
		Select s3=new Select(BuyingRatesdropdown);
		int DropdownCount1=s3.getOptions().size();
		
        String actDropdownCount1=Integer.toString(DropdownCount);
        String  expDropdownCount1="69";
		
		
		/*String  expDropdownCount1=excelReader.getCellData(xlSheetName, 29, 7);*/
        excelReader.setCellData(xlfile, xlSheetName, 29, 8, actDropdownCount1);
		
        s3.selectByVisibleText(excelReader.getCellData(xlSheetName, 30, 6));
		
		String actSelectdata1=s3.getFirstSelectedOption().getText();
		String expSelectdata1=excelReader.getCellData(xlSheetName, 30, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 30, 8, actSelectdata1);
		
		
		System.out.println("***********************************checkEnableSellingRateBuyingRateTag****************************");
		
		System.out.println("SellingsRateDropdown Count      : "+actDropdownCount    +" Value Expected : "+expDropdownCount);
		System.out.println("SellingsRateDropdown Select     : "+actSelectdata       +" Value Expected : "+expSelectdata);
		System.out.println("BuyingRatesdropdown Count       : "+actDropdownCount1   +" Value Expected : "+expDropdownCount1);
		System.out.println("BuyingRatesdropdown Select      : "+actSelectdata1      +" Value Expected : "+expSelectdata1);
		
		if(actDropdownCount.equalsIgnoreCase(expDropdownCount) && actSelectdata.equalsIgnoreCase(expSelectdata)
				&& actDropdownCount1.equalsIgnoreCase(expDropdownCount1) && actSelectdata1.equalsIgnoreCase(expSelectdata1))
		{
			System.out.println("Test Pass :VerifyEnablingtheInventoryTag Elements Are Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 26, 9, resPass);
			System.out.println("Test Pass : Warehouse is Selected in SellingRates Tag ");
			System.out.println("Test Pass : Units is Selected in BuyingRates Tag ");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyEnablingtheInventoryTag Elements Are Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 26, 9, resPass);
			System.out.println("Test Fail : Warehouse is Not Selected in SellingRates Tag ");
			System.out.println("Test Fail : Units is Not Selected in BuyingRates Tag ");
			return false;
		}
		
	}
	
	

	public boolean checkUpdateButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 32, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 32, 8, actAlertMgs);
		
		
		System.out.println("***********************************checkUpdateButton****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 31, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 31, 9, resPass);
			return false;
		}
	}


	
		
	public boolean checkUpdateOkButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 34, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		 excelReader.setCellData(xlfile, xlSheetName, 34, 8, actMessage);
		
		System.out.println("********************************checkUpdateOkButton***************************");
		
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			
			System.out.println("Test Pass : Clicking On Ok Btn And Error Message Is as Expected");
			excelReader.setCellData(xlfile, xlSheetName, 33, 9, resPass);
			return true;
			
		}
		else
		{
		
			System.out.println("Test Pass : Clicking On Ok Btn And Error Message Is Not as Expected");
			excelReader.setCellData(xlfile, xlSheetName, 33, 9, resPass);
			return false;
		}
	
	}
	
		
	
	
	public boolean checkCloseButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
		CustCloseBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
		
		boolean actlabelDashboard                  =dashboardName.isDisplayed();
		/*boolean actselectDashboard                 =selectDashboard.isDisplayed();*/
		boolean actnewAddDashBoard                 =newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings  =dashboardCustomizationSettings.isDisplayed();
		
		boolean explabelDashboard                  =true;
		boolean expselectDashboard                 =true;
		boolean expnewAddDashBoard                 =true;
		boolean expdashboardCustomizationSettings  =true;
		
		System.out.println("******************************checkCloseButton************************");
		
		System.out.println("labelDashboard                  : "+actlabelDashboard                 +" Value Expected : "+explabelDashboard);
		/*System.out.println("selectDashboard                 : "+actselectDashboard                +" Value Expected : "+expselectDashboard);*/
		System.out.println("newAddDashBoard                 : "+actnewAddDashBoard                +" Value Expected : "+expnewAddDashBoard);
		System.out.println("dashboardCustomizationSettings  : "+actdashboardCustomizationSettings +" Value Expected : "+expdashboardCustomizationSettings);
		
		
		boolean actMethod=actlabelDashboard==explabelDashboard/* && actselectDashboard==expselectDashboard */&& 
				actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 36, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 36, 8, actResult);
		
		
		if(actResult.equalsIgnoreCase(expResult))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 35, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 35, 9, resFail);
			 return false;
		 }
	
	}
	
	
	public boolean checkTagsAfterSaveTags() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountingDropdown));

		Select s1=new Select(AccountingDropdown);
		Select s2=new Select(InventoryDropdown);
		Select s3=new Select(SellingsRateDropdown);
		Select s4=new Select(BuyingRatesdropdown);
		
		String actAccountingDropdown=s1.getFirstSelectedOption().getText();
		String expAccountingDropdown=excelReader.getCellData(xlSheetName, 38, 7);
        excelReader.setCellData(xlfile, xlSheetName, 38, 8, actAccountingDropdown);
		
		String actInventoryDropdown=s2.getFirstSelectedOption().getText();
		String expInventoryDropdown=excelReader.getCellData(xlSheetName, 39, 7);
        excelReader.setCellData(xlfile, xlSheetName, 39, 8, actInventoryDropdown);
		
		String actSellingsRateDropdown=s3.getFirstSelectedOption().getText();
		String expSellingsRateDropdown=excelReader.getCellData(xlSheetName, 40, 7);
        excelReader.setCellData(xlfile, xlSheetName, 40, 8, actSellingsRateDropdown);
		
		String actBuyingRatesdropdown=s4.getFirstSelectedOption().getText();
		String expBuyingRatesdropdown=excelReader.getCellData(xlSheetName, 41, 7);
        excelReader.setCellData(xlfile, xlSheetName, 41, 8, actBuyingRatesdropdown);
		
		System.out.println("******************************checkTagsAfterSaveTags************************");
		
		System.out.println("AccountingDropdown          : "+actAccountingDropdown         +" Value Expected : "+expAccountingDropdown);
		System.out.println("InventoryDropdown           : "+actInventoryDropdown          +" Value Expected : "+expInventoryDropdown);
		System.out.println("SellingsRateDropdown        : "+actSellingsRateDropdown       +" Value Expected : "+expSellingsRateDropdown);
		System.out.println("BuyingRatesdropdown         : "+actBuyingRatesdropdown        +" Value Expected : "+expBuyingRatesdropdown);
		
		if(actAccountingDropdown.equalsIgnoreCase(expAccountingDropdown) && actInventoryDropdown.equalsIgnoreCase(expInventoryDropdown)
				&& actSellingsRateDropdown.equalsIgnoreCase(expSellingsRateDropdown) && actBuyingRatesdropdown.equalsIgnoreCase(expBuyingRatesdropdown))
		{
			System.out.println("Test Pass :VerifyInputedTagsaredisplayingaresavingornot data Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 37, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyInputedTagsaredisplayingaresavingornot data Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 37, 9, resFail);
			return false;
		}
    }
	
	
	

	public boolean checkEditTagsByUpdateButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountingDropdown));
		AccountingDropdown.click();
		
		Select s1=new Select(AccountingDropdown);
		s1.selectByVisibleText(excelReader.getCellData(xlSheetName, 43, 6));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryDropdown));
		InventoryDropdown.click();
		
		Select s2=new Select(InventoryDropdown);
		s2.selectByVisibleText(excelReader.getCellData(xlSheetName, 44, 6));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SellingsRateDropdown));
		SellingsRateDropdown.click();;
		Select s3=new Select(SellingsRateDropdown);
		s3.selectByVisibleText(excelReader.getCellData(xlSheetName, 45, 6));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BuyingRatesdropdown));
		BuyingRatesdropdown.click();
		
		Select s4=new Select(BuyingRatesdropdown);
		s4.selectByVisibleText(excelReader.getCellData(xlSheetName, 46, 6));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 47, 7);
        excelReader.setCellData(xlfile, xlSheetName, 47, 8, actAlertMgs);
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyEditOptionbyUpdatebutton Working As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 42, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyEditOptionbyUpdatebutton Not Working As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 42, 9, resFail);
			return false;
		}
     }

		
		
		
		 
	public boolean checkEditTagsByUpdateOkButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 49, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 49, 8, actMessage);
		
		
		System.out.println("********************************checkEditTagsByUpdateOkButton***************************");
		
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			
			System.out.println("Test Pass : Clicking On Ok Btn And Error Message Is as Expected");
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
			CustCloseBtn.click();*/
			excelReader.setCellData(xlfile, xlSheetName, 48, 9, resPass);
			return true;
			
		}
		else
		{
		
			System.out.println("Test Pass : Clicking On Ok Btn And Error Message Is Not as Expected");
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
			CustCloseBtn.click();*/
			excelReader.setCellData(xlfile, xlSheetName, 48, 9, resPass);
			return false;
		}
	}

		
		
		
		
	public boolean checkUpdatedTagsAfterUpdate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountingDropdown));

		Select s1=new Select(AccountingDropdown);
		Select s2=new Select(InventoryDropdown);
		Select s3=new Select(SellingsRateDropdown);
		Select s4=new Select(BuyingRatesdropdown);
		
		String actAccountingDropdown=s1.getFirstSelectedOption().getText();
		String expAccountingDropdown=excelReader.getCellData(xlSheetName, 51, 7);
        excelReader.setCellData(xlfile, xlSheetName, 51, 8, actAccountingDropdown);
		
		
		String actInventoryDropdown=s2.getFirstSelectedOption().getText();
		String expInventoryDropdown=excelReader.getCellData(xlSheetName, 52, 7);
        excelReader.setCellData(xlfile, xlSheetName, 52, 8, actInventoryDropdown);
		
		String actSellingsRateDropdown=s3.getFirstSelectedOption().getText();
		String expSellingsRateDropdown=excelReader.getCellData(xlSheetName, 53, 7);
        excelReader.setCellData(xlfile, xlSheetName, 53, 8, actSellingsRateDropdown);
		
		String actBuyingRatesdropdown=s4.getFirstSelectedOption().getText();
		String expBuyingRatesdropdown=excelReader.getCellData(xlSheetName, 54, 7);
        excelReader.setCellData(xlfile, xlSheetName, 54, 8, actBuyingRatesdropdown);
		
		System.out.println("******************************checkUpdatedTagsAfterUpdate************************");
		
		System.out.println("AccountingDropdown          : "+actAccountingDropdown         +" Value Expected : "+expAccountingDropdown);
		System.out.println("InventoryDropdown           : "+actInventoryDropdown          +" Value Expected : "+expInventoryDropdown);
		System.out.println("SellingsRateDropdown        : "+actSellingsRateDropdown       +" Value Expected : "+expSellingsRateDropdown);
		System.out.println("BuyingRatesdropdown         : "+actBuyingRatesdropdown        +" Value Expected : "+expBuyingRatesdropdown);
		
		if(actAccountingDropdown.equalsIgnoreCase(expAccountingDropdown) && actInventoryDropdown.equalsIgnoreCase(expInventoryDropdown)
				&& actSellingsRateDropdown.equalsIgnoreCase(expSellingsRateDropdown) && actBuyingRatesdropdown.equalsIgnoreCase(expBuyingRatesdropdown))
		{
			System.out.println("Test Pass :VerifyUpdatedTagsaredisplaying data Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 50, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatedTagsaredisplaying data Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 50, 9, resPass);
			return false;
		}
     }
		

	
	
	
	public boolean checkAccountsinPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		System.out.println("********************* checkAccountsinPreferences Method Executes.............   *****************************");
		
		
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(AccountsBtn));
			AccountsBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(acc_AssertGroupDrpdwn));
			
			
	        ArrayList<String>actconfigureTransactionPageList=new ArrayList<String>();
			
			int configureTransactionPageCount=accountsPageList.size();
			
			System.out.println(" configureTransactionPageCount  :  "+configureTransactionPageCount);
			
			for (int i = 0; i < configureTransactionPageCount; i++)
			{
				String data=accountsPageList.get(i).getText();
				actconfigureTransactionPageList.add(data);
			}
			
			String actAccountsPage=actconfigureTransactionPageList.toString();
			String expAccountsPage=excelReader.getCellData(xlSheetName, 57, 7);
			
			System.err.println("  Actual configureTransactionPageList    : "+actAccountsPage);
			System.err.println("  Expected  configureTransactionPageList : "+expAccountsPage);
			
			excelReader.setCellData(xlfile, xlSheetName, 57, 8, actAccountsPage);
			
			
			/*boolean actRestrictAccBasedOnDepartChkbox   = acc_RestrictAccBasedOnDepartChkbox.isDisplayed();*/
			boolean actCashAndBankDrpdwn                = acc_CashAndBankDrpdwn.isDisplayed(); 
			boolean actControlAC                        = acc_ControlAC.isDisplayed();
			boolean actdepAndAmor      					= acc_DepreciationAndAmortizationDrpdwn.isDisplayed(); 
			boolean actExpencesGroup            		= acc_ExpencesGroupDrpdwn.isDisplayed(); 
			boolean actAccForeignExchangeGain 			= acc_ForginExchangeGainAccDrpDwn.isDisplayed(); 
			boolean actACCForginExchangeLoss            = acc_ForginExchangeLossAccDrpDwn.isDisplayed(); 
			boolean actGeneralAdminExpen                = acc_GeneralAdminExpenDrpdwn.isDisplayed(); 
			boolean actIncomeTaxes 						= acc_IncomeTaxesDrpdwn.isDisplayed(); 
			boolean actIncomes                      	= acc_IncomesDrpdwn.isDisplayed(); 
			boolean actLiabilites                       = acc_LiabilitesDrpdwn.isDisplayed(); 
			boolean actCustCloseBtn                       	= CustCloseBtn.isDisplayed();
			
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(AccountsSettingsExpandBtn));
			AccountsSettingsExpandBtn.click();
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(negativeCashSettingsExpandBtn));
			negativeCashSettingsExpandBtn.click();
			
			Thread.sleep(3000);
			/*JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("arguments[0].scrollIntoView();", acc_NegCashBankChkbox);
			
			Thread.sleep(2000);*/
			
			getAction().moveToElement(acc_NegCashBankChkbox).build().perform();
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(acc_NegCashBankChkbox));
			boolean actNegCashBankChkbox                = acc_NegCashBankChkboxSelected.isDisplayed(); 
			boolean actDoNotBalChkbox                   = acc_DoNotBalChkbox.isDisplayed();  
			
			 
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc_NegCashBankChkbox));
			
			boolean actacc_NegCashBankChkbox  =acc_NegCashBankChkboxSelected.isDisplayed();
			boolean expacc_NegCashBankChkbox  =true;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc_NegCashBankChkbox));
			
			if(acc_NegCashBankChkboxSelected.isSelected()==false)
			{
			
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc_NegCashBankChkbox));
			acc_NegCashBankChkbox.click();
			}
			
			Thread.sleep(2000);

	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkNegativeCashByTagChkBox));
			checkNegativeCashByTagChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkNegativeCashBalance_WarnAndAllowRadio));
			
			boolean actcheckNegativeCashBalance_WarnAndAllowRadio  =checkNegativeCashBalance_WarnAndAllowRadio.isDisplayed();
			boolean actcheckNegativeCashBalance_StopRadio          =checkNegativeCashBalance_StopRadio.isDisplayed(); 
			boolean actcheckNegativeCashByTagChkBox                =checkNegativeCashByTagChkBoxSelected.isDisplayed();
			boolean actcheckNegativeCashByTag_WarnAndAllowRadio    =checkNegativeCashByTag_WarnAndAllowRadio.isDisplayed();
			boolean actcheckNegativeCashByTag_StopRadio            =checkNegativeCashByTag_StopRadio.isDisplayed();
			
			boolean expcheckNegativeCashBalance_WarnAndAllowRadio  =true;
			boolean expcheckNegativeCashBalance_StopRadio          =true; 
			boolean expcheckNegativeCashByTagChkBox                =true;
			boolean expcheckNegativeCashByTag_WarnAndAllowRadio    =true;
			boolean expcheckNegativeCashByTag_StopRadio            =true; 
			
			boolean expNegCashBankChkbox             	= true;
			boolean expDoNotBalChkbox              	    = true;  
			boolean expRestrictAccBasedOnDepartChkbox   = true;
			boolean expCashAndBankDrpdwn           		= true; 
			boolean expControlAC            			= true;
			boolean expdepAndAmor      					= true; 
			boolean expExpencesGroup            		= true; 
			boolean expAccForeignExchangeGain 			= true; 
			boolean expAccForginExchangeLoss          	= true; 
			boolean expGeneralAdminExpen                = true; 
			boolean expIncomeTaxes 						= true; 
			boolean expIncomes                      	= true; 
			boolean expLiabilites                      	= true; 
		
			
		    System.out.println("NegCashBankChkbox Value Actual       : " + actNegCashBankChkbox     +" Value Expected : " + expNegCashBankChkbox);
	        System.out.println("DoNotBalChkboxValue Actual           : " + actDoNotBalChkbox        +" Value Expected : " + expDoNotBalChkbox);
	       /* System.out.println("RestrictAccBasedOnDepartChkbox Value Actual : " + actRestrictAccBasedOnDepartChkbox +" Value Expected : " + expRestrictAccBasedOnDepartChkbox);*/
	        System.out.println("CashAndBankDrpdwn Value Actual       : " + actCashAndBankDrpdwn     +" Value Expected : " + expCashAndBankDrpdwn);
	        System.out.println("ControlACValue Actual        		 : " + actControlAC             +" Value Expected : " + expControlAC);
	        System.out.println("depAndAmor Value Actual   			 : " + actdepAndAmor 			+" Value Expected : " + expdepAndAmor);
	        System.out.println("ExpencesGroup Value Actual           : " + actExpencesGroup 		+" Value Expected : " + expExpencesGroup);
	        System.out.println("AccForeignExchangeGain Value Actual  : " + actAccForeignExchangeGain+  " Value Expected : " + expAccForeignExchangeGain);
	        System.out.println("ACCForginExchangeLoss Value Actual   : " + actACCForginExchangeLoss +" Value Expected : " + expAccForginExchangeLoss);
	        System.out.println("GeneralAdminExpen Value Actual       : " + actGeneralAdminExpen     +" Value Expected : " + expGeneralAdminExpen);
	        System.out.println("IncomeTaxes  Value Actual            : " + actIncomeTaxes           +" Value Expected : " + expIncomeTaxes );
	        System.out.println("Incomes Value Actual                 : " + actIncomes               +" Value Expected : " + expIncomes);
	        System.out.println("Liabilites  Value Actual             : " + actLiabilites            +" Value Expected : " + expLiabilites );

			System.out.println("checkNegativeCashBalance_WarnAndAllowRadio   : "+actcheckNegativeCashBalance_WarnAndAllowRadio  +" Value Expected : "+expcheckNegativeCashBalance_WarnAndAllowRadio);
			System.out.println("checkNegativeCashBalance_StopRadio           : "+actcheckNegativeCashBalance_StopRadio          +" Value Expected : "+expcheckNegativeCashBalance_StopRadio);
			System.out.println("checkNegativeCashByTagChkBox                 : "+actcheckNegativeCashByTagChkBox                +" Value Expected : "+expcheckNegativeCashByTagChkBox);
			System.out.println("checkNegativeCashByTag_WarnAndAllowRadio     : "+actcheckNegativeCashByTag_WarnAndAllowRadio    +" Value Expected : "+expcheckNegativeCashByTag_WarnAndAllowRadio);
			System.out.println("checkNegativeCashByTag_StopRadio             : "+actcheckNegativeCashByTag_StopRadio            +" Value Expected : "+expcheckNegativeCashByTag_StopRadio);
		
	        
	        boolean displayMethod=  actNegCashBankChkbox==expNegCashBankChkbox
										&& actDoNotBalChkbox==expDoNotBalChkbox 
										&& actCashAndBankDrpdwn==expCashAndBankDrpdwn && actControlAC==expControlAC
										&& actdepAndAmor==expdepAndAmor && actExpencesGroup==expExpencesGroup
										&& actAccForeignExchangeGain==expAccForeignExchangeGain && actACCForginExchangeLoss==expAccForginExchangeLoss
										&& actGeneralAdminExpen==expGeneralAdminExpen && actIncomeTaxes==expIncomeTaxes
										&& actLiabilites==expLiabilites && actcheckNegativeCashBalance_WarnAndAllowRadio==expcheckNegativeCashBalance_WarnAndAllowRadio && actcheckNegativeCashBalance_StopRadio==expcheckNegativeCashBalance_StopRadio
										&& actcheckNegativeCashByTagChkBox==expcheckNegativeCashByTagChkBox && 
										actcheckNegativeCashByTag_WarnAndAllowRadio==expcheckNegativeCashByTag_WarnAndAllowRadio && 
										actcheckNegativeCashByTag_StopRadio==expcheckNegativeCashByTag_StopRadio;
						        
	        String actDisplayresult=Boolean.toString(displayMethod);
	        String expDisplayResult=excelReader.getCellData(xlSheetName, 58, 7);
	        
	        excelReader.setCellData(xlfile, xlSheetName, 58, 8, actDisplayresult);
	        
	        System.err.println("actDisplayresult   : "+actDisplayresult+" VALUE EXPECTED : "+expDisplayResult);
	        
	       
			if (actDisplayresult.equalsIgnoreCase(expDisplayResult) && 
					actAccountsPage.equalsIgnoreCase(expAccountsPage))
			{	
				System.out.println("Test Pass : Account Screen  Elements Are Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 56, 9, resPass);
				return true;
			} 	
			else 
			{
				System.out.println("Test Fail : Account Screen Elements Are Not Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 56, 9, resFail);
				return false;
			}
		}

		
	
	

	
	public boolean checkBudgetScreenUnderPreference() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(BudgetBtn));
		BudgetBtn.click();
		
		Thread.sleep(5000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(budgetbyAccountRadioBtn));
		budgetbyAccountRadioBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(budgetChekBudgetInDataEntryChkbox));
		budgetChekBudgetInDataEntryChkbox.click();
		
		boolean actNARadioBtn                = budgetNARadioBtn.isDisplayed(); 
		boolean actAccountRadioBtn           = budgetbyAccountRadioBtn.isDisplayed();  
		boolean actAccByTagRadioBtn          = budgetbyAccByTagRadioBtn.isDisplayed();
		boolean actAccByItemByTagRadioBtn    = budgetByAccByItemByTagRadioBtn.isDisplayed(); 
		boolean actChekBudgetInDataEntry     = budgetChekBudgetInDataEntryChkbox.isDisplayed();
		boolean actAnnualRadio      		 = budgetAnnualRadioBtn.isDisplayed(); 
		boolean actmonthlyRadio            	 = budgetmonthlyRadioBtn.isDisplayed(); 
		boolean actQuaterly 			     = budgetQuaterlyRadioBtn.isDisplayed(); 
		boolean actWarnAndAllow              = budgetWarnAndAllowRadioBtn.isDisplayed(); 
		boolean actStopRadio                 = budgetStopRadioBtn.isDisplayed(); 
		
		boolean expNARadioBtn             	 = true;
		boolean expAccountRadioBtn           = true;  
		boolean expAccByTagRadioBtn          = true;
		boolean expAccByItemByTagRadioBtn    = true; 
		boolean expChekBudgetInDataEntry     = true;
		boolean expAnnualRadio      		 = true; 
		boolean expmonthlyRadio            	 = true; 
		boolean expQuaterly 			     = true; 
		boolean expWarnAndAllow          	 = true; 
		boolean expStopRadio                 = true; 
		
		
	    System.out.println("NARadioBtn Value Actual             : " + actNARadioBtn             +" Value Expected : " + expNARadioBtn);
        System.out.println("AccountRadioBtn Actual              : " + actAccountRadioBtn        +" Value Expected : " + expAccountRadioBtn);
        System.out.println("AccByTagRadioBtn Value Actual       : " + actAccByTagRadioBtn       +" Value Expected : " + expAccByTagRadioBtn);
        System.out.println("AccByItemByTagRadioBtn Value Actual : " + actAccByItemByTagRadioBtn +" Value Expected : " + expAccByItemByTagRadioBtn);
        System.out.println("ChekBudgetInDataEntry Actual        : " + actChekBudgetInDataEntry  +" Value Expected : " + expChekBudgetInDataEntry);
        System.out.println("AnnualRadio  Value Actual   		: " + actAnnualRadio  			+" Value Expected : " + expAnnualRadio );
        System.out.println("monthlyRadio Value Actual           : " + actmonthlyRadio 		    +" Value Expected : " + expmonthlyRadio);
        System.out.println("Quaterly Value Actual               : " + actQuaterly               +" Value Expected : " + expQuaterly);
        System.out.println("WarnAndAllow Value Actual           : " + actWarnAndAllow           +" Value Expected : " + expWarnAndAllow);
        System.out.println("StopRadio Value Actual              : " + actStopRadio              +" Value Expected : " + expStopRadio);
        
        
        boolean displayMethod=actNARadioBtn==expNARadioBtn
									&& actAccountRadioBtn==expAccountRadioBtn && actAccByTagRadioBtn==expAccByTagRadioBtn
									&& actAccByItemByTagRadioBtn==expAccByItemByTagRadioBtn && actChekBudgetInDataEntry==expChekBudgetInDataEntry
									&& actAnnualRadio ==expAnnualRadio  && actmonthlyRadio==expmonthlyRadio
									&& actQuaterly==expQuaterly && actWarnAndAllow==expWarnAndAllow
									&& actStopRadio==expStopRadio;
					        
        String actDisplayresult=Boolean.toString(displayMethod);
        String expDisplayResult=excelReader.getCellData(xlSheetName, 60, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 60, 8, actDisplayresult);
        
        System.err.println("actDisplayresult   : "+actDisplayresult+" VALUE EXPECTED : "+expDisplayResult);
        
        Thread.sleep(3000);
        getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(budgetNARadioBtn));
        budgetNARadioBtn.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(budgetByAccByItemByTagRadioBtn));
        budgetByAccByItemByTagRadioBtn.click();
        
        budgetPlanningTagSelection.click();
        budgetPlanningTagSelection.sendKeys("Department");
        budgetPlanningTagSelection.sendKeys(Keys.TAB);
        
        budgetChekBudgetInDataEntryChkbox.click();
        budgetmonthlyRadioBtn.click();
        
        budgetStopRadioBtn.click();
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 47, 7);
        excelReader.setCellData(xlfile, xlSheetName, 47, 8, actAlertMgs);
		
		System.out.println("Budget Save     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
        
		getAlert().accept();
		
        String expMessage=excelReader.getCellData(xlSheetName, 49, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		
        if (actDisplayresult.equalsIgnoreCase(expDisplayResult) && actAlertMgs.equalsIgnoreCase(expAlertMgs)
        		&& actMessage.equalsIgnoreCase(expMessage))		
		{	
			System.out.println("Test Pass : Budget Screen  Elements Are Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 59, 9, resPass);
			return true;
		} 	
		else 
		{
			System.out.println("Test Fail : Budget Screen Elements Are Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 59, 9, resFail);
			return false;
		}
	}
		

	

	public boolean checkARAPinPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ARAPBtn));
		
		boolean ARAP  =ARAPBtn.isDisplayed();
		
		String actARAPBtn=Boolean.toString(ARAP);
		
		String expARAPBtn=excelReader.getCellData(xlSheetName, 62, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 62, 8, actARAPBtn);
        
		
		System.out.println("**********************************checkARAPinPreferences**************************");
		
		System.out.println("ARAPBtn   : "+actARAPBtn+" Value Expected : "+expARAPBtn);
		
		if(actARAPBtn.equalsIgnoreCase(expARAPBtn))
		{
			System.out.println("Test Pass : ARAP Option is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 61, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : ARAP Option is NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 61, 9, resFail);
			return false;
		}
	
	}




	public boolean checkARAPoptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ARAPBtn));
		ARAPBtn.click();
		
		Thread.sleep(3000);
		
		getAction().moveToElement(arTagExpandBtn).build().perform();
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(arTagExpandBtn));
		arTagExpandBtn.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(arTagChkBox));
		
		boolean actarTagChkBox                             =arTagChkBox.isDisplayed();
		boolean actsalesAccountChkBox                      =salesAccountChkBox.isDisplayed();
		boolean actarItemChkBox                            =arItemChkBox.isDisplayed();
		
		Thread.sleep(3000);
		
		
		boolean actapTagChkBox                             =apTagChkBox.isDisplayed();
		boolean actpurchaseAccountChkBox                   =purchaseAccountChkBox.isDisplayed();
		boolean actapItemChkBox                            =apItemChkBox.isDisplayed();
		boolean actdependsOnMaintainBillWiseForARAPChkBox  =dependsOnMaintainBillWiseForARAPChkBox.isDisplayed();
		boolean actinputNarrationInReferenceChkBox         =inputNarrationInReferenceChkBox.isDisplayed();
		boolean actenableOverDueCheckChkBox                =enableOverDueCheckChkBox.isDisplayed();
		
		boolean exparTagChkBox                             =true;
		boolean expsalesAccountChkBox                      =true;
		boolean exparItemChkBox                            =true;
		boolean expenableCreditLimitCheckChkBox            =true;
		boolean exppickCreditDayFromChkBox                 =true;
		boolean expapTagChkBox                             =true;
		boolean exppurchaseAccountChkBox                   =true;
		boolean expapItemChkBox                            =true;
		boolean expdependsOnMaintainBillWiseForARAPChkBox  =true;
		boolean expinputNarrationInReferenceChkBox         =true;
		boolean expenableOverDueCheckChkBox                =true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(arTagExpandBtn));
		arTagExpandBtn.click();
		
		getAction().moveToElement(creditLimitExpandBtn).build().perform();
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitExpandBtn));
		creditLimitExpandBtn.click();
		Thread.sleep(2000);
		
		boolean actenableCreditLimitCheckChkBox            =enableCreditLimitCheckChkBox.isDisplayed();
		boolean actpickCreditDayFromChkBox                 =pickCreditDayFromChkBox.isDisplayed();
		
		System.out.println("**********************************checkARAPoptions**************************");
		
		System.out.println("arTagChkBox                             : "+actarTagChkBox                            +" Value Expected : "+exparTagChkBox);
		System.out.println("salesAccountChkBox                      : "+actsalesAccountChkBox                     +" Value Expected : "+expsalesAccountChkBox);
		System.out.println("arItemChkBox                            : "+actarItemChkBox                           +" Value Expected : "+exparItemChkBox);
		System.out.println("enableCreditLimitCheckChkBox            : "+actenableCreditLimitCheckChkBox           +" Value Expected : "+expenableCreditLimitCheckChkBox);
		System.out.println("pickCreditDayFromChkBox                 : "+actpickCreditDayFromChkBox                +" Value Expected : "+exppickCreditDayFromChkBox);
		System.out.println("apTagChkBox                             : "+actapTagChkBox                            +" Value Expected : "+expapTagChkBox);
		System.out.println("purchaseAccountChkBox                   : "+actpurchaseAccountChkBox                  +" Value Expected : "+exppurchaseAccountChkBox);
		System.out.println("apItemChkBox                            : "+actapItemChkBox                           +" Value Expected : "+expapItemChkBox);
		System.out.println("dependsOnMaintainBillWiseForARAPChkBox  : "+actdependsOnMaintainBillWiseForARAPChkBox +" Value Expected : "+expdependsOnMaintainBillWiseForARAPChkBox);
		System.out.println("inputNarrationInReferenceChkBox         : "+actinputNarrationInReferenceChkBox        +" Value Expected : "+expinputNarrationInReferenceChkBox);
		System.out.println("enableOverDueCheckChkBox                : "+actenableOverDueCheckChkBox               +" Value Expected : "+expenableOverDueCheckChkBox);
		
		
		
		boolean actMethod=actarTagChkBox==exparTagChkBox && actsalesAccountChkBox==expsalesAccountChkBox && actarItemChkBox==exparItemChkBox
				&& actenableCreditLimitCheckChkBox==expenableCreditLimitCheckChkBox && actpickCreditDayFromChkBox==exppickCreditDayFromChkBox
				&& actapTagChkBox==expapTagChkBox && actpurchaseAccountChkBox==exppurchaseAccountChkBox && actapItemChkBox==expapItemChkBox
				&& actdependsOnMaintainBillWiseForARAPChkBox==expdependsOnMaintainBillWiseForARAPChkBox
				&& actinputNarrationInReferenceChkBox==expinputNarrationInReferenceChkBox
				&& actenableOverDueCheckChkBox==expenableOverDueCheckChkBox;
				
				
				
				
		String actREsult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 64, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 64, 8, actREsult);
		
		
		if(actREsult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : ARAP Options are As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 63, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : ARAP Options are NOT As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 63, 9, resFail);
			return false;
		}
	}
	
	
		

	public boolean checkEnableCreditLimitCheckOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		//getAction().moveToElement(creditLimitExpandBtn).build().perform();
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitExpandBtn));
		creditLimitExpandBtn.click();
		Thread.sleep(2000);
		
		if(enableCreditLimitCheckChkBoxSelected.isSelected()==false)
		{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableCreditLimitCheckChkBox));
		enableCreditLimitCheckChkBox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(includePendingSalesOrderChkBox));
		
		boolean actincludePendingSalesOrderChkBox          		=includePendingSalesOrderChkBoxSelected.isDisplayed();
		boolean actcheckCreditLimitInOrdersChkBox          		=checkCreditLimitInOrdersChkBoxSelected.isDisplayed();
		boolean actdefineCreditLimitByDepartmentChkBox     		=defineCreditLimitByDepartmentChkBoxSelected.isDisplayed();
		boolean actallowCreditLimitAuthorizationmappingChkBox   =allowCreditLimitAuthorizationmappingChkBoxSelected.isDisplayed();
		boolean actwhenCreditLimitexceeded_WarnAndAllowRadio    =whenCreditLimitexceeded_WarnAndAllowRadio.isDisplayed();
		boolean actwhenCreditLimitexceeded_StopRadio    		=whenCreditLimitexceeded_StopRadio.isDisplayed();
		boolean actRequestCreditLimitIncreaseRadio     			=RequestCreditLimitIncreaseRadio.isDisplayed();
		
		boolean expincludePendingSalesOrderChkBox          		=true;
		boolean expcheckCreditLimitInOrdersChkBox          		=true;
		boolean expdefineCreditLimitByDepartmentChkBox     		=true;
		boolean expallowCreditLimitAuthorizationmappingChkBox   =true;
		boolean expwhenCreditLimitexceeded_WarnAndAllowRadio    =true;
		boolean expwhenCreditLimitexceeded_StopRadio    		=true;
		boolean expRequestCreditLimitIncreaseRadio     			=true;
		
		System.out.println("************************************checkEnableCreditLimitCheckOptions*********************************");
		
		System.out.println("includePendingSalesOrderChkBox              :"+actincludePendingSalesOrderChkBox             +" Value Expected : "+expincludePendingSalesOrderChkBox);
		System.out.println("checkCreditLimitInOrdersChkBox              :"+actcheckCreditLimitInOrdersChkBox             +" Value Expected : "+expcheckCreditLimitInOrdersChkBox);
		System.out.println("defineCreditLimitByDepartmentChkBox         :"+actdefineCreditLimitByDepartmentChkBox        +" Value Expected : "+expdefineCreditLimitByDepartmentChkBox);
		System.out.println("allowCreditLimitAuthorizationmappingChkBox  :"+actallowCreditLimitAuthorizationmappingChkBox +" Value Expected : "+expallowCreditLimitAuthorizationmappingChkBox);
		System.out.println("whenCreditLimitexceeded_WarnAndAllowRadio   :"+actwhenCreditLimitexceeded_WarnAndAllowRadio  +" Value Expected : "+expwhenCreditLimitexceeded_WarnAndAllowRadio);
		System.out.println("whenCreditLimitexceeded_StopRadio           :"+actwhenCreditLimitexceeded_StopRadio          +" Value Expected : "+expwhenCreditLimitexceeded_StopRadio);
		System.out.println("RequestCreditLimitIncreaseRadio             :"+actRequestCreditLimitIncreaseRadio            +" Value Expected : "+expRequestCreditLimitIncreaseRadio);
		
		
		boolean actMethod=actincludePendingSalesOrderChkBox==expincludePendingSalesOrderChkBox && actcheckCreditLimitInOrdersChkBox==expcheckCreditLimitInOrdersChkBox
				&& actdefineCreditLimitByDepartmentChkBox==expdefineCreditLimitByDepartmentChkBox
				&& actallowCreditLimitAuthorizationmappingChkBox==expallowCreditLimitAuthorizationmappingChkBox
				&& actwhenCreditLimitexceeded_WarnAndAllowRadio==expwhenCreditLimitexceeded_WarnAndAllowRadio 
				&& actwhenCreditLimitexceeded_StopRadio==expwhenCreditLimitexceeded_StopRadio
				&& actRequestCreditLimitIncreaseRadio==expRequestCreditLimitIncreaseRadio;
				
				
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 66, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 66, 8, actResult);
		
		
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : EnableCreditLimitCheckOptions Are As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 65, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : EnableCreditLimitCheckOptions Are NOT As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 65, 9, resFail);
			return false;
		}
	}
		
	
	
	public boolean checkPickCreditDayFromOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getAction().moveToElement(creditLimitExpandBtn).build().perform();
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitExpandBtn));
		creditLimitExpandBtn.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickCreditDayFromChkBox));
		pickCreditDayFromChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerVendorACRadio));
		
		boolean actpickCreditDayFromChkBox=pickCreditDayFromChkBox.isSelected();
		boolean actcustomerVendorACRadio   =customerVendorACRadio.isDisplayed();
		boolean actpaymentsTermsRadio      =paymentsTermsRadio.isDisplayed();
		boolean actsalesACRadio            =salesACRadio.isDisplayed();
		
		boolean exppickCreditDayFromChkBox=true;
		boolean expcustomerVendorACRadio   =true;
		boolean exppaymentsTermsRadio      =true;
		boolean expsalesACRadio            =true;
		
		System.out.println("***********************************checkPickCreditDayFromOptions*******************************");
		
		System.out.println("pickCreditDayFromChkBox  : "+actpickCreditDayFromChkBox+" Value Expected : "+exppickCreditDayFromChkBox);
		System.out.println("customerVendorACRadio    : "+actcustomerVendorACRadio  +" Value Expected : "+expcustomerVendorACRadio);
		System.out.println("paymentsTermsRadio       : "+actpaymentsTermsRadio     +" Value Expected : "+exppaymentsTermsRadio);
		System.out.println("salesACRadio             : "+actsalesACRadio           +" Value Expected : "+expsalesACRadio);
		
		
		boolean actMethod=actcustomerVendorACRadio==expcustomerVendorACRadio && actpaymentsTermsRadio==exppaymentsTermsRadio
				&& actsalesACRadio==expsalesACRadio && actpickCreditDayFromChkBox==exppickCreditDayFromChkBox;
				
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 68, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 68, 8, actResult);
		
		
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : PickCreditDayFromOptions Are As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : PickCreditDayFromOptions Are NOT As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resFail);
			return false;
		}
	}
	
		
	
	public boolean checkDependOnMaintainBillWiseFroARAPOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dependsOnMaintainBillWiseForARAPChkBox));
		dependsOnMaintainBillWiseForARAPChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maintainARTransactionCurrenciesChkBox));
		
		boolean actmaintainARTransactionCurrenciesChkBox    =maintainARTransactionCurrenciesChkBox.isDisplayed();
		boolean actmaintainAPTransactionCurrenciesChkBox    =maintainAPTransactionCurrenciesChkBox.isDisplayed();
		
		boolean expmaintainARTransactionCurrenciesChkBox    =true;
		boolean expmaintainAPTransactionCurrenciesChkBox    =true;
		
		System.out.println("*************************************checkDependOnMaintainBillWiseFroARAPOptions***************************");
		
		System.out.println("maintainARTransactionCurrenciesChkBox    : "+actmaintainARTransactionCurrenciesChkBox+" Value Expected : "+expmaintainARTransactionCurrenciesChkBox);
		System.out.println("maintainAPTransactionCurrenciesChkBox    : "+actmaintainAPTransactionCurrenciesChkBox+" Value Expected : "+expmaintainAPTransactionCurrenciesChkBox);
		
		boolean actMethod=actmaintainARTransactionCurrenciesChkBox==expmaintainARTransactionCurrenciesChkBox && 
				actmaintainAPTransactionCurrenciesChkBox==expmaintainAPTransactionCurrenciesChkBox;
				
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 70, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 70, 8, actResult);
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Options Are As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 69, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Options Are NOT As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 69, 9, resFail);
			return false;
		}
	}
	

	
	public boolean checkSavingDependOnMaintainBillWiseFroARAPOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maintainARTransactionCurrenciesChkBox));
		maintainARTransactionCurrenciesChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maintainAPTransactionCurrenciesChkBox));
		maintainAPTransactionCurrenciesChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputNarrationInReferenceChkBox));
		inputNarrationInReferenceChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maintainARTransactionCurrenciesChkBox));
		
		boolean actmaintainARTransactionCurrenciesChkBox   =maintainARTransactionCurrenciesChkBoxSelected.isSelected();
		boolean actmaintainAPTransactionCurrenciesChkBox   =maintainAPTransactionCurrenciesChkBoxSelected.isSelected();
		boolean actinputNarrationInReferenceChkBox         =inputNarrationInReferenceChkBoxSelected.isSelected();
		
		boolean expmaintainARTransactionCurrenciesChkBox   =true;
		boolean expmaintainAPTransactionCurrenciesChkBox   =true;
		boolean expinputNarrationInReferenceChkBox         =true;
		
		System.out.println("**************************************checkSavingDependOnMaintainBillWiseFroARAPOptions****************************");
		
		System.out.println("maintainARTransactionCurrenciesChkBox    : "+actmaintainARTransactionCurrenciesChkBox+" Value Expected : "+expmaintainARTransactionCurrenciesChkBox);
		System.out.println("maintainAPTransactionCurrenciesChkBox    : "+actmaintainAPTransactionCurrenciesChkBox+" Value Expected : "+expmaintainAPTransactionCurrenciesChkBox);
		System.out.println("inputNarrationInReferenceChkBox          : "+actinputNarrationInReferenceChkBox      +" Value Expected : "+expinputNarrationInReferenceChkBox);
		
		
		boolean actMethod=actmaintainARTransactionCurrenciesChkBox==expmaintainARTransactionCurrenciesChkBox && actmaintainAPTransactionCurrenciesChkBox==expmaintainAPTransactionCurrenciesChkBox
				&& actinputNarrationInReferenceChkBox==expinputNarrationInReferenceChkBox;
				
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 72, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 72, 8, actResult);
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Options Are As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 71, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Options Are NOT As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 71, 9, resFail);
			return false;
		}
	}
	

	
	public boolean checkEnableOverDueCheckOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableOverDueCheckChkBox));
		enableOverDueCheckChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(useCreditDaysInsteadOfDueDateChkBox));
		
		boolean actuseCreditDaysInsteadOfDueDateChkBox            =useCreditDaysInsteadOfDueDateChkBox.isDisplayed();
		boolean actwhenCreditDaysLimitexceeded_WarnAndAllowRadio  =whenCreditDaysLimitexceeded_WarnAndAllowRadio.isDisplayed();
		boolean actwhenCreditDaysLimitexceeded_StopRadio          =whenCreditDaysLimitexceeded_StopRadio.isDisplayed();
		
		boolean expuseCreditDaysInsteadOfDueDateChkBox            =true;
		boolean expwhenCreditDaysLimitexceeded_WarnAndAllowRadio  =true;
		boolean expwhenCreditDaysLimitexceeded_StopRadio          =true;
		
		System.out.println("*******************************checkEnableOverDueCheckOptions****************************");
		
		System.out.println("useCreditDaysInsteadOfDueDateChkBox              : "+actuseCreditDaysInsteadOfDueDateChkBox           +" Value Expected : "+expuseCreditDaysInsteadOfDueDateChkBox);
		System.out.println("whenCreditDaysLimitexceeded_WarnAndAllowRadio    : "+actwhenCreditDaysLimitexceeded_WarnAndAllowRadio +" Value Expected : "+expwhenCreditDaysLimitexceeded_WarnAndAllowRadio);
		System.out.println("whenCreditDaysLimitexceeded_StopRadio            : "+actwhenCreditDaysLimitexceeded_StopRadio         +" Value Expected : "+expwhenCreditDaysLimitexceeded_StopRadio);
		
		
		boolean actMethod=actuseCreditDaysInsteadOfDueDateChkBox==expuseCreditDaysInsteadOfDueDateChkBox 
				&& actwhenCreditDaysLimitexceeded_WarnAndAllowRadio==expwhenCreditDaysLimitexceeded_WarnAndAllowRadio 
				&& actwhenCreditDaysLimitexceeded_StopRadio==expwhenCreditDaysLimitexceeded_StopRadio;
				
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 74, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 74, 8, actResult);
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : EnableOverDueCheckOptions Are As Expected ");
			excelReader.setCellData(xlfile, xlSheetName, 73, 9, resPass);
			enableOverDueCheckChkBox.click();
			return true;
		}else
		{
			System.out.println("Test fail : EnableOverDueCheckOptions Are NOT As Expected ");
			excelReader.setCellData(xlfile, xlSheetName, 73, 9, resFail);
			enableOverDueCheckChkBox.click();
			return false;
		}
	}
	
	@FindBy(xpath="//*[@id='ARAccountsSettings']/button")	
	public static WebElement arAccountSettingsTab;

	public boolean checkSelectingARTagAsDeparment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(arAccountSettingsTab));
		arAccountSettingsTab.click();
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(arTagChkBox));
		arTagChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(arTagTxt));
		arTagTxt.click();
		
		arTagTxt.sendKeys(excelReader.getCellData(xlSheetName, 75, 6));
		
		
		String actarTagTxt  =arTagTxt.getAttribute("value");
		String exparTagTxt  =excelReader.getCellData(xlSheetName, 75, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 75, 8, actarTagTxt);
		
		System.out.println("*****************************checkSelectingAPTagAsDeparment**********************");
		
		System.out.println("arTagTxt   : "+actarTagTxt+" Value Expected : "+exparTagTxt);
	
		if(actarTagTxt.equalsIgnoreCase(exparTagTxt))
		{
			System.out.println("Test Pass : Selecting Department As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 75, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : NOT  Selecting Department As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
			return false;
		}
	}

	
	
	
	
	
	public boolean checkSelectingAPTagAsDeparment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(apTagChkBox));
		apTagChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(apTagTxt));
		apTagTxt.click();
		
		apTagTxt.sendKeys(excelReader.getCellData(xlSheetName, 76, 6));
		
		
		String actapTagTxt  =apTagTxt.getAttribute("value");
		String expapTagTxt  =excelReader.getCellData(xlSheetName, 76, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 76, 8, actapTagTxt);
		
		System.out.println("*****************************checkSelectingAPTagAsDeparment**********************");
		
		System.out.println("apTagTxt   : "+actapTagTxt+" Value Expected : "+expapTagTxt);
	
		if(actapTagTxt.equalsIgnoreCase(expapTagTxt))
		{
			System.out.println("Test Pass : Selecting Department As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 76, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : NOT  Selecting Department As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 76, 9, resFail);
			return false;
		}
	}
		

	public boolean checkUpdatebuttonARAP() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 78, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 78, 8, actAlertMgs);
		
		
		
        Thread.sleep(2000);
        
        getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 79, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 79, 8, actMessage);
		
		
		System.out.println("***********************************checkUpdatebuttonARAP****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 77, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail : VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 77, 9, resFail);
			return false;
		}
	}
	

	
	
	
	public boolean checkMiscellaneousInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiselleanousBtn));
		
		boolean Miselleanous  =MiselleanousBtn.isDisplayed();
		
		String actMiselleanous=Boolean.toString(Miselleanous);
		String expMiselleanousBtn  = excelReader.getCellData(xlSheetName, 81, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 81, 8, actMiselleanous);
		
		
		System.out.println("*********************************checkMiscellaneousInPreferences**************************");
		
		System.out.println("MiselleanousBtn  : "+actMiselleanous+" Value Expected : "+expMiselleanousBtn);
		
		if(actMiselleanous.equalsIgnoreCase(expMiselleanousBtn))
		{
			System.out.println("Test Pass : Miscellaneous is Displayed In Preferences");
			excelReader.setCellData(xlfile, xlSheetName, 80, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Miscellaneous is NOT Displayed In Preferences");
			excelReader.setCellData(xlfile, xlSheetName, 80, 9, resFail);
			return false;
		}
	}
	

	
	public boolean checkMiscellaneousOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiselleanousBtn));
		MiselleanousBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addfreeItemsonaNewLineChkBox));
		
		boolean actaddfreeItemsonaNewLineChkBox   				=addfreeItemsonaNewLineChkBox.isDisplayed();
		boolean actcalculatedueDateFromLRDateChkBox   			=calculatedueDateFromLRDateChkBox.isDisplayed();
		boolean actcreateCustomerProfileFieldsChkBox   			=createCustomerProfileFieldsChkBox.isDisplayed();
		boolean actdialogbasedentryinvouchersChkBox   			=dialogbasedentryinvouchersChkBox.isDisplayed();
		boolean actdontRefreshDescACProdDocChkBox   			=dontRefreshDescACProdDocChkBox.isDisplayed();
		boolean actincludeUnCommitedTransactionChkBox   		=includeUnCommitedTransactionChkBox.isDisplayed();
		boolean actmaintainLinksforOnlyOneSideChkBox   			=maintainLinksforOnlyOneSideChkBox.isDisplayed();
		boolean actshowStatusMessageInPopUphkox   				=showStatusMessageInPopUphkox.isDisplayed();
		boolean actprefixLocationCodeWhileImportingChkBox   	=prefixLocationCodeWhileImportingChkBox.isDisplayed();
		boolean actshowTransactionDateInFifo   					=showTransactionDateInFifo.isDisplayed();
		boolean actenableLocalCurrencyChkBox   					=enableLocalCurrencyChkBox.isDisplayed();
		boolean actdontShowOpeningBalLedgerChkBox   			=dontShowOpeningBalLedgerChkBox.isDisplayed();
		boolean actdontStoreDatesEntriesChkBox   				=dontStoreDatesEntriesChkBox.isDisplayed();
		boolean actshowexchangeratedifferenceinledgerChkBox   	=showexchangeratedifferenceinledgerChkBox.isDisplayed();
		boolean actenableHijriDateChkBox   						=enableHijriDateChkBox.isDisplayed();
		boolean actenableprofitabilitycheckbyproductChkBox   	=enableprofitabilitycheckbyproductChkBox.isDisplayed();
		boolean actdonotLoadDocInExlusivemodeChkBox   			=donotLoadDocInExlusivemodeChkBox.isDisplayed();
		boolean actcreateMasterinTransactionEntryChkBox   		=createMasterinTransactionEntryChkBox.isDisplayed();
		boolean actstayOnSameVoucherNumberAfterDeleteingChkBox  =stayOnSameVoucherNumberAfterDeleteingChkBox.isDisplayed();
		boolean actopenSearchIfMasterNotFoundChkBox   			=openSearchIfMasterNotFoundChkBox.isDisplayed();
		boolean actloadDateBasesonLastSavedVoucherChkBox   		=loadDateBasesonLastSavedVoucherChkBox.isDisplayed();
		boolean actfiltercurrencyBasedondepartmentChkBox   		=filtercurrencyBasedondepartmentChkBox.isDisplayed();
		
		Thread.sleep(5000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(calendarSettingsExpandBtn));
		calendarSettingsExpandBtn.click();
		Thread.sleep(2000);
		
		boolean actdefaultCalanderTxt   						=defaultCalanderTxt.isDisplayed();
		boolean actdefaultCurrencyTxt   						=defaultCurrencyTxt.isDisplayed();
		boolean actimageFormatDropdown   						=imageFormatDropdown.isDisplayed();
		boolean actnumericSeperatorDropdown1   					=numericSeperatorDropdown1.isDisplayed();
		boolean actnumericSeperatorDropdown2   					=numericSeperatorDropdown2.isDisplayed();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExcludevoucherduringRepostExpandBtn));
		ExcludevoucherduringRepostExpandBtn.click();
		Thread.sleep(2000);
	
		boolean actdocTypeRadio   								=docTypeRadio.isDisplayed();
		boolean actdocClassRadio   								=docClassRadio.isDisplayed();
		boolean actgridFirstRowIndexBtn  	 					=gridFirstRowIndexBtn.isDisplayed();
		boolean actgridSecondRowIndexBtn   						=gridSecondRowIndexBtn.isDisplayed();
		boolean actgridVoucherFirstRow   						=gridVoucherFirstRow.isDisplayed();
		boolean actgridVoucherSecondRow   						=gridVoucherSecondRow.isDisplayed();
		
		Thread.sleep(3000);
		getAction().moveToElement(InvoiceEmailSettingsExpandBtn).build().perform();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InvoiceEmailSettingsExpandBtn));
		InvoiceEmailSettingsExpandBtn.click();
		
		boolean actsendAsAttachmentRadio  						=sendAsAttachmentRadio.isDisplayed();
		boolean actsendASBodyRadio          					=sendASBodyRadio.isDisplayed();
		
		
		boolean expaddfreeItemsonaNewLineChkBox   				=true;
		boolean expcalculatedueDateFromLRDateChkBox   			=true;
		boolean expcreateCustomerProfileFieldsChkBox   			=true;
		boolean expdialogbasedentryinvouchersChkBox   			=true;
		boolean expdontRefreshDescACProdDocChkBox   			=true;
		boolean expincludeUnCommitedTransactionChkBox   		=true;
		boolean expmaintainLinksforOnlyOneSideChkBox   			=true;
		boolean expshowStatusMessageInPopUphkox   				=true;
		boolean expprefixLocationCodeWhileImportingChkBox   	=true;
		boolean expshowTransactionDateInFifo   					=true;
		boolean expenableLocalCurrencyChkBox   					=true;
		boolean expdontShowOpeningBalLedgerChkBox   			=true;
		boolean expdontStoreDatesEntriesChkBox   				=true;
		boolean expshowexchangeratedifferenceinledgerChkBox   	=true;
		boolean expenableHijriDateChkBox   						=true;
		boolean expenableprofitabilitycheckbyproductChkBox   	=true;
		boolean expdonotLoadDocInExlusivemodeChkBox   			=true;
		boolean expcreateMasterinTransactionEntryChkBox   		=true;
		boolean expstayOnSameVoucherNumberAfterDeleteingChkBox  =true;
		boolean expopenSearchIfMasterNotFoundChkBox   			=true;
		boolean exploadDateBasesonLastSavedVoucherChkBox   		=true;
		boolean expfiltercurrencyBasedondepartmentChkBox   		=true;
		boolean expdefaultCalanderTxt   						=true;
		boolean expdefaultCurrencyTxt   						=true;
		boolean expimageFormatDropdown   						=true;
		boolean expnumericSeperatorDropdown1   					=true;
		boolean expnumericSeperatorDropdown2   					=true;
		boolean expdocTypeRadio   								=true;
		boolean expdocClassRadio   								=true;
		boolean expgridFirstRowIndexBtn  	 					=true;
		boolean expgridSecondRowIndexBtn   						=true;
		boolean expgridVoucherFirstRow   						=true;
		boolean expgridVoucherSecondRow   						=true;
		boolean expsendAsAttachmentRadio  						=true;
		boolean expsendASBodyRadio          					=true;
		
		
		System.out.println("addfreeItemsonaNewLineChkBox                  : "+actaddfreeItemsonaNewLineChkBox                 +" Value Expected : "+expaddfreeItemsonaNewLineChkBox);
		System.out.println("calculatedueDateFromLRDateChkBox              : "+actcalculatedueDateFromLRDateChkBox             +" Value Expected : "+expcalculatedueDateFromLRDateChkBox);
		System.out.println("createCustomerProfileFieldsChkBox             : "+actcreateCustomerProfileFieldsChkBox            +" Value Expected : "+expcreateCustomerProfileFieldsChkBox);
		System.out.println("dialogbasedentryinvouchersChkBox              : "+actdialogbasedentryinvouchersChkBox             +" Value Expected : "+expdialogbasedentryinvouchersChkBox);
		System.out.println("dontRefreshDescACProdDocChkBox                : "+actdontRefreshDescACProdDocChkBox               +" Value Expected : "+expdontRefreshDescACProdDocChkBox);
		System.out.println("includeUnCommitedTransactionChkBox            : "+actincludeUnCommitedTransactionChkBox           +" Value Expected : "+expincludeUnCommitedTransactionChkBox);
		System.out.println("maintainLinksforOnlyOneSideChkBox             : "+actmaintainLinksforOnlyOneSideChkBox            +" Value Expected : "+expmaintainLinksforOnlyOneSideChkBox);
		System.out.println("showStatusMessageInPopUphkox                  : "+actshowStatusMessageInPopUphkox                 +" Value Expected : "+expshowStatusMessageInPopUphkox);
		System.out.println("prefixLocationCodeWhileImportingChkBox        : "+actprefixLocationCodeWhileImportingChkBox       +" Value Expected : "+expprefixLocationCodeWhileImportingChkBox);
		System.out.println("showTransactionDateInFifo                     : "+actshowTransactionDateInFifo                    +" Value Expected : "+expshowTransactionDateInFifo);
		System.out.println("enableLocalCurrencyChkBox                     : "+actenableLocalCurrencyChkBox                    +" Value Expected : "+expenableLocalCurrencyChkBox);
		System.out.println("dontShowOpeningBalLedgerChkBox                : "+actdontShowOpeningBalLedgerChkBox               +" Value Expected : "+expdontShowOpeningBalLedgerChkBox);
		System.out.println("dontStoreDatesEntriesChkBox                   : "+actdontStoreDatesEntriesChkBox                  +" Value Expected : "+expdontStoreDatesEntriesChkBox);
		System.out.println("showexchangeratedifferenceinledgerChkBox      : "+actshowexchangeratedifferenceinledgerChkBox     +" Value Expected : "+expshowexchangeratedifferenceinledgerChkBox);
		System.out.println("enableHijriDateChkBox                         : "+actenableHijriDateChkBox                        +" Value Expected : "+expenableHijriDateChkBox);
		System.out.println("enableprofitabilitycheckbyproductChkBox       : "+actenableprofitabilitycheckbyproductChkBox      +" Value Expected : "+expenableprofitabilitycheckbyproductChkBox);
		System.out.println("donotLoadDocInExlusivemodeChkBox              : "+actdonotLoadDocInExlusivemodeChkBox             +" Value Expected : "+expdonotLoadDocInExlusivemodeChkBox);
		System.out.println("createMasterinTransactionEntryChkBox          : "+actcreateMasterinTransactionEntryChkBox         +" Value Expected : "+expcreateMasterinTransactionEntryChkBox);
		System.out.println("stayOnSameVoucherNumberAfterDeleteingChkBox   : "+actstayOnSameVoucherNumberAfterDeleteingChkBox  +" Value Expected : "+expstayOnSameVoucherNumberAfterDeleteingChkBox);
		System.out.println("openSearchIfMasterNotFoundChkBox              : "+actopenSearchIfMasterNotFoundChkBox             +" Value Expected : "+expopenSearchIfMasterNotFoundChkBox);
		System.out.println("loadDateBasesonLastSavedVoucherChkBox         : "+actloadDateBasesonLastSavedVoucherChkBox        +" Value Expected : "+exploadDateBasesonLastSavedVoucherChkBox);
		System.out.println("filtercurrencyBasedondepartmentChkBox         : "+actfiltercurrencyBasedondepartmentChkBox        +" Value Expected : "+expfiltercurrencyBasedondepartmentChkBox);
		System.out.println("defaultCalanderTxt                            : "+actdefaultCalanderTxt                           +" Value Expected : "+expdefaultCalanderTxt);
		System.out.println("defaultCurrencyTxt                            : "+actdefaultCurrencyTxt                           +" Value Expected : "+expdefaultCurrencyTxt);
		System.out.println("imageFormatDropdown                           : "+actimageFormatDropdown                          +" Value Expected : "+expimageFormatDropdown);
		System.out.println("numericSeperatorDropdown1                     : "+actnumericSeperatorDropdown1                    +" Value Expected : "+expnumericSeperatorDropdown1);
		System.out.println("numericSeperatorDropdown2                     : "+actnumericSeperatorDropdown2                    +" Value Expected : "+expnumericSeperatorDropdown2);
		System.out.println("docTypeRadio                                  : "+actdocTypeRadio                                 +" Value Expected : "+expdocTypeRadio);
		System.out.println("docClassRadio                                 : "+actdocClassRadio                                +" Value Expected : "+expdocClassRadio);
		System.out.println("gridFirstRowIndexBtn                          : "+actgridFirstRowIndexBtn                         +" Value Expected : "+expgridFirstRowIndexBtn);
		System.out.println("gridSecondRowIndexBtn                         : "+actgridSecondRowIndexBtn                        +" Value Expected : "+expgridSecondRowIndexBtn);
		System.out.println("gridVoucherFirstRow                           : "+actgridVoucherFirstRow                          +" Value Expected : "+expgridVoucherFirstRow);
		System.out.println("gridVoucherSecondRow                          : "+actgridVoucherSecondRow                         +" Value Expected : "+expgridVoucherSecondRow);
		System.out.println("sendAsAttachmentRadio                         : "+actsendAsAttachmentRadio                        +" Value Expected : "+expsendAsAttachmentRadio);
		System.out.println("sendASBodyRadio                               : "+actsendASBodyRadio                              +" Value Expected : "+expsendASBodyRadio);
		
		
		boolean actMethod=actaddfreeItemsonaNewLineChkBox==expaddfreeItemsonaNewLineChkBox && actcalculatedueDateFromLRDateChkBox==expcalculatedueDateFromLRDateChkBox
				&& actcreateCustomerProfileFieldsChkBox==expcreateCustomerProfileFieldsChkBox && actdialogbasedentryinvouchersChkBox==expdialogbasedentryinvouchersChkBox
				&& actdontRefreshDescACProdDocChkBox==expdontRefreshDescACProdDocChkBox && actincludeUnCommitedTransactionChkBox==expincludeUnCommitedTransactionChkBox
				&& actmaintainLinksforOnlyOneSideChkBox==expmaintainLinksforOnlyOneSideChkBox && actshowStatusMessageInPopUphkox==expshowStatusMessageInPopUphkox 
				&& actprefixLocationCodeWhileImportingChkBox==expprefixLocationCodeWhileImportingChkBox && actshowTransactionDateInFifo==expshowTransactionDateInFifo
				&& actenableLocalCurrencyChkBox==expenableLocalCurrencyChkBox && actdontShowOpeningBalLedgerChkBox==expdontShowOpeningBalLedgerChkBox
				&& actdontStoreDatesEntriesChkBox==expdontStoreDatesEntriesChkBox && actshowexchangeratedifferenceinledgerChkBox==expshowexchangeratedifferenceinledgerChkBox
				&& actenableHijriDateChkBox==expenableHijriDateChkBox && actenableprofitabilitycheckbyproductChkBox==expenableprofitabilitycheckbyproductChkBox 
				&& actdonotLoadDocInExlusivemodeChkBox==expdonotLoadDocInExlusivemodeChkBox && actcreateMasterinTransactionEntryChkBox==expcreateMasterinTransactionEntryChkBox 
				&& actstayOnSameVoucherNumberAfterDeleteingChkBox==expstayOnSameVoucherNumberAfterDeleteingChkBox 
				&& actopenSearchIfMasterNotFoundChkBox==expopenSearchIfMasterNotFoundChkBox && actloadDateBasesonLastSavedVoucherChkBox==exploadDateBasesonLastSavedVoucherChkBox
				&& actfiltercurrencyBasedondepartmentChkBox==expfiltercurrencyBasedondepartmentChkBox && actdefaultCalanderTxt==expdefaultCalanderTxt
				&& actdefaultCurrencyTxt==expdefaultCurrencyTxt && actimageFormatDropdown==expimageFormatDropdown && actnumericSeperatorDropdown1==expnumericSeperatorDropdown1
				&& actnumericSeperatorDropdown2==expnumericSeperatorDropdown2 && actdocTypeRadio==expdocTypeRadio && actdocClassRadio==expdocClassRadio
				&& actgridFirstRowIndexBtn==expgridFirstRowIndexBtn && actgridSecondRowIndexBtn==expgridSecondRowIndexBtn && actgridVoucherFirstRow==expgridVoucherFirstRow
				&& actgridVoucherSecondRow==expgridVoucherSecondRow && actsendAsAttachmentRadio==expsendAsAttachmentRadio && actsendASBodyRadio==expsendASBodyRadio;
				
				
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 83, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 83, 8, actResult);
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Miscellaneous Options Are As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 82, 9, resPass);
			return true;
			
			
		}else
		{
			System.out.println("Test Fail : Miscellaneous Options Are NOT As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 82, 9, resFail);
			return false;
		}
	}
		
		
	
	
	public boolean checkLocalCurrencyOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableLocalCurrencyChkBox));
		enableLocalCurrencyChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(localCurrencyTxt));
		
		boolean localCurrency   =localCurrencyTxt.isDisplayed();
		
		String actlocalCurrencyTxt   =Boolean.toString(localCurrency);
		String explocalCurrencyTxt   =excelReader.getCellData(xlSheetName, 85, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 85, 8, actlocalCurrencyTxt);
		
		System.out.println("*********************************checkLocalCurrencyOption****************************");
		
		System.out.println("localCurrencyTxt   : "+actlocalCurrencyTxt+" Value Expected : "+explocalCurrencyTxt);
		
		if(actlocalCurrencyTxt.equalsIgnoreCase(explocalCurrencyTxt))
		{
			System.out.println("Test Pass : Local Currency Option Is Dis[played");
			excelReader.setCellData(xlfile, xlSheetName, 84, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Local Currency Option Is NOT Dis[played");
			excelReader.setCellData(xlfile, xlSheetName, 84, 9, resFail);
			return false;
		}
	}


	
	
	public boolean checkInputingLocalCurrencyOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(localCurrencyTxt));
		localCurrencyTxt.click();
		localCurrencyTxt.sendKeys("U");
		
		int count = localCurrencyCombo.size();
		
		for (int i = 0; i < count; i++) 
		{
			String data = localCurrencyCombo.get(i).getText();
			if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 87, 6))) 
			{
				localCurrencyCombo.get(i).click();
				break;
			}
		}
		//Thread.sleep(3000);
		
		localCurrencyTxt.sendKeys(Keys.TAB);

		String actlocalCurrencyTxt  =localCurrencyTxt.getAttribute("value");
		String explocalCurrencyTxt  =excelReader.getCellData(xlSheetName, 87, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 87, 8, actlocalCurrencyTxt);	
		
		System.out.println("***********************************checkInputingLocalCurrencyOption******************************");
		
		System.out.println("localCurrencyTxt   : "+actlocalCurrencyTxt+" Value Expected : "+explocalCurrencyTxt);
		
		if(actlocalCurrencyTxt.equalsIgnoreCase(explocalCurrencyTxt))
		{
			System.out.println("Test Pass : Accepting Data Succesfully");
			excelReader.setCellData(xlfile, xlSheetName, 86, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : NOT Accepting Data Succesfully");
			excelReader.setCellData(xlfile, xlSheetName, 86, 9, resFail);
			return false;
		}
	}
	
		
	
	public boolean checkUpdateOkbuttonMiscelleanous() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		
		Thread.sleep(3000);
	    getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 89, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 89, 8, actAlertMgs);
		
		
		
        getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 90, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 90, 8, actMessage);
		
		
		System.out.println("***********************************checkUpdateOkbuttonMiscelleanous****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);
		System.out.println("Message          : "+actMessage    +" Value Expected : "+expMessage);
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actMessage.equalsIgnoreCase(expMessage))	
		{
			System.out.println("Test Pass : Clicking On Ok Btn And Error Message Is as Expected");
			excelReader.setCellData(xlfile, xlSheetName, 88, 9, resPass);
			return true;
			
		}
		else
		{
		
			System.out.println("Test Pass : Clicking On Ok Btn And Error Message Is Not as Expected");
			excelReader.setCellData(xlfile, xlSheetName, 88, 9, resFail);
			return false;
		}
	
	}
	

	
	

	public boolean checkAvailbilityofPDCandPDCOptionsinPreference() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(PDCBtn));
		
		boolean DCBtn=PDCBtn.isDisplayed();
		
		String actPDCBtn=Boolean.toString(DCBtn);
		
		String  expPDCBtn=excelReader.getCellData(xlSheetName, 92, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 92, 8, actPDCBtn);
		
        Thread.sleep(3000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDCBtn));
        PDCBtn.click();
        
        Thread.sleep(3000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(postDatedChequeChkbox));
        postDatedChequeChkbox.click();
        
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AutoCheckMaturedPDCChkbox));
        
       boolean actAutoCheckMaturedPDCChkbox=AutoCheckMaturedPDCChkbox.isDisplayed();
       boolean actdisplayLedgerAndBalanceChkbox=displayLedgerAndBalanceChkbox.isDisplayed();
       boolean actmatureDatesinLedgerChkbox=matureDatesinLedgerChkbox.isDisplayed();
       boolean actreversePostingConversionChkbox=reversePostingConversionChkbox.isDisplayed();
       boolean actchequeDiscountingACDrpdwn=chequeDiscountingACDrpdwn.isDisplayed();
       boolean actdiscountedVoucherDepdwn=discountedVoucherDepdwn.isDisplayed();
       
       boolean expAutoCheckMaturedPDCChkbox=true;
       boolean excpdisplayLedgerAndBalanceChkbox=true;
       boolean expmatureDatesinLedgerChkbox=true;
       boolean expreversePostingConversionChkbox=true;
       boolean expchequeDiscountingACDrpdwn=true;
       boolean expdiscountedVoucherDepdwn=true;
       
       
       
       System.out.println("AutoCheckMaturedPDCChkbox      "+actAutoCheckMaturedPDCChkbox      +" Value Expected "+expAutoCheckMaturedPDCChkbox);
       System.out.println("displayLedgerAndBalanceChkbox  "+actdisplayLedgerAndBalanceChkbox  +" Value Expected "+expAutoCheckMaturedPDCChkbox);
       System.out.println("matureDatesinLedgerChkbox      "+actmatureDatesinLedgerChkbox      +" Value Expected "+expmatureDatesinLedgerChkbox);
       System.out.println("reversePostingConversionChkbox "+actreversePostingConversionChkbox +" Value Expected "+expreversePostingConversionChkbox);
       System.out.println("chequeDiscountingACDrpdwn      "+actchequeDiscountingACDrpdwn      +" Value Expected "+expchequeDiscountingACDrpdwn);
       System.out.println("discountedVoucherDepdwn        "+actdiscountedVoucherDepdwn        +" Value Expected "+expdiscountedVoucherDepdwn);
      
        
       
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayLedgerAndBalanceChkbox));
       displayLedgerAndBalanceChkbox.click();
       
       boolean actMethod=actAutoCheckMaturedPDCChkbox==expAutoCheckMaturedPDCChkbox && actdisplayLedgerAndBalanceChkbox==expAutoCheckMaturedPDCChkbox && 
    		              actmatureDatesinLedgerChkbox==expmatureDatesinLedgerChkbox && actreversePostingConversionChkbox==expreversePostingConversionChkbox && 
    		              actchequeDiscountingACDrpdwn==expchequeDiscountingACDrpdwn && actdiscountedVoucherDepdwn==expdiscountedVoucherDepdwn;
       
       /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
			    
		getAlert().accept();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		errorMessageCustCloseBtn.click();
		*/
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 93, 7);
       
       excelReader.setCellData(xlfile, xlSheetName, 93, 8, actResult);
       
		System.out.println("****************************checkAvailbilityofBatch***********************");
		
		System.out.println("PDCBtn  : "+actPDCBtn+" Value Expected : "+expPDCBtn);
		
		if(actPDCBtn.equalsIgnoreCase(expPDCBtn) && actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : PDC SCreen And PDC Options  is Displayed");
			
			excelReader.setCellData(xlfile, xlSheetName, 91, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : PDC SCreen And PDC Options  is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 91, 9, resFail);
			return false;
		}
		
	}

	

	

	public boolean checkAvailbilityofInventory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(InventoryBtn));
		
		boolean Inventory  =InventoryBtn.isDisplayed();
		
		String actInventoryBtn=Boolean.toString(Inventory);
		
		String  expInventoryBtn  =excelReader.getCellData(xlSheetName, 95, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 95, 8, actInventoryBtn);
		
		System.out.println("************************checkAvailbilityofInventory************************************");
		
		System.out.println("InventoryBtn   : "+actInventoryBtn+" Value Expected : "+expInventoryBtn);
		
		if(actInventoryBtn.equalsIgnoreCase(expInventoryBtn	))
		{
			System.out.println(" Test Pas : VerifyAvailbilityofInventory Inventory Option Is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 94, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pas : VerifyAvailbilityofInventory Inventory Option Is Not Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 94, 9, resFail);
			return false;
		}
		
	}
		
	
	
	public boolean checkInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryBtn));
		InventoryBtn.click();
		
		Thread.sleep(3000);
		
	
		
		boolean actIncludeReserveStockInStockLedgerChkBox               =IncludeReserveStockInStockLedgerChkBox.isDisplayed();
		boolean actInputUnitInTransactionsChkBox                        =InputUnitInTransactionsChkBox.isDisplayed();
		boolean actMaintainInventoryInAlternateUnitChkBox               =MaintainInventoryInAlternateUnitChkBox.isDisplayed();
		boolean actRestrictProductSelectionDependingOnTypeChkBox        =RestrictProductSelectionDependingOnTypeChkBox.isDisplayed();
		boolean actUpdateMRNValueStockThroughPurchaseChkBox             =UpdateMRNValueStockThroughPurchaseChkBox.isDisplayed();
		boolean actDisplayProductAliasChkBox                            =DisplayProductAliasChkBox.isDisplayed();
		boolean actReorderLevelsByWarehouseChkBox                       =ReorderLevelsByWarehouseChkBox.isDisplayed();
		boolean actDonotUseRealTimeRateChkBox                           =DonotUseRealTimeRateChkBox.isDisplayed();
		boolean actInventoryAllocationByDropdown                        =InventoryAllocationByDropdown.isDisplayed();
		
		Thread.sleep(3000);
		
		getAction().moveToElement(StockSettingsExpandBtn).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(StockSettingsExpandBtn));
		StockSettingsExpandBtn.click();
		
		Thread.sleep(5000);
		getAction().moveToElement(cogsExpandBtn).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cogsExpandBtn));
		cogsExpandBtn.click();
		
		Thread.sleep(2000);
		boolean actIntegrateInventoryWithAccountsChkBox                 =IntegrateInventoryWithAccountsChkBox.isDisplayed();
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IntegrateInventoryWithAccountsChkBox));
		IntegrateInventoryWithAccountsChkBox.click();
		
		
		
		Thread.sleep(5000);
		getAction().moveToElement(ReservationExpandBtn).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ReservationExpandBtn));
		ReservationExpandBtn.click();
		
		Thread.sleep(5000);
	/*	getAction().moveToElement(ExcludevoucherduringRepostExpandBtn).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExcludevoucherduringRepostExpandBtn));
		ExcludevoucherduringRepostExpandBtn.click();
		
		Thread.sleep(3000);*/
		
		getAction().moveToElement(StockSettingsExpandBtn).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(CheckNegativeStockChkBox));
		
		boolean actCheckNegativeStockChkBox                             =CheckNegativeStockChkBox.isDisplayed();
		boolean actCheckNegativeStockWarnandAllowRadio                  =CheckNegativeStockWarnandAllowRadio.isDisplayed();
		boolean actCheckNegativeStockStopRadio                          =CheckNegativeStockStopRadio.isDisplayed();
		boolean actIncludePendingPOToCheckNegativeStockChkBox           =IncludePendingPOToCheckNegativeStockChkBox.isDisplayed();
		boolean actCheckStockInOrdersChkBox                             =CheckStockInOrdersChkBox.isDisplayed();
		boolean actIncludePendingSOQuantityInnegativeStockCheckChkBox   =IncludePendingSOQuantityInnegativeStockCheckChkBox.isDisplayed();
		boolean actIncludeReserveStockInStockCheckChkBox                =IncludeReserveStockInStockCheckChkBox.isDisplayed();
		boolean actCheckReorderLevelChkBox                              =CheckReorderLevelChkBox.isDisplayed();
		boolean actMaintainQtyAndValuebyWareHouseRadio                  =MaintainQtyAndValuebyWareHouseRadio.isDisplayed();
		boolean actMaintainQtyByWareHouseandVlueOverAllRadio            =MaintainQtyByWareHouseandVlueOverAllRadio.isDisplayed();
		boolean actMaintainQtyOverAllAndValueOverAllRadio               =MaintainQtyOverAllAndValueOverAllRadio.isDisplayed();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CheckStockInOrdersChkBox));
		CheckStockInOrdersChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IncludePendingSOQuantityInnegativeStockCheckChkBox));
		IncludePendingSOQuantityInnegativeStockCheckChkBox.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IncludeReserveStockInStockCheckChkBox));
		IncludeReserveStockInStockCheckChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MaintainQtyByWareHouseandVlueOverAllRadio));
		MaintainQtyByWareHouseandVlueOverAllRadio.click();
	
		Thread.sleep(3000);
		getAction().moveToElement(ReservationExpandBtn).build().perform();
		
		Thread.sleep(3000);
		boolean actReservation_NoneRadio                                =Reservation_NoneRadio.isDisplayed();
		boolean actReservation_QuantitiesRadio                          =Reservation_QuantitiesRadio.isDisplayed();
		boolean actReservation_ReserveByRadio                           =Reservation_ReserveByRadio.isDisplayed();
	
		
		
		boolean expCheckNegativeStockChkBox                             =true;
		boolean expCheckNegativeStockWarnandAllowRadio                  =true;
		boolean expCheckNegativeStockStopRadio                          =true;
		boolean expIncludePendingPOToCheckNegativeStockChkBox           =true;
		boolean expCheckStockInOrdersChkBox                             =true;
		boolean expIncludePendingSOQuantityInnegativeStockCheckChkBox   =true;
		boolean expIncludeReserveStockInStockCheckChkBox                =true;
		boolean expCheckReorderLevelChkBox                              =true;
		boolean expMaintainQtyAndValuebyWareHouseRadio                  =true;
		boolean expMaintainQtyByWareHouseandVlueOverAllRadio            =true;
		boolean expMaintainQtyOverAllAndValueOverAllRadio               =true;
		boolean expIntegrateInventoryWithAccountsChkBox                 =true;
		boolean expIncludeReserveStockInStockLedgerChkBox               =true;
		boolean expInputUnitInTransactionsChkBox                        =true;
		boolean expMaintainInventoryInAlternateUnitChkBox               =true;
		boolean expRestrictProductSelectionDependingOnTypeChkBox        =true;
		boolean expUpdateMRNValueStockThroughPurchaseChkBox             =true;
		boolean expDisplayProductAliasChkBox                            =true;
		boolean expReorderLevelsByWarehouseChkBox                       =true;
		boolean expDonotUseRealTimeRateChkBox                           =true;
		boolean expReservation_NoneRadio                                =true;
		boolean expReservation_QuantitiesRadio                          =true;
		boolean expReservation_ReserveByRadio                           =true;
		boolean expInventoryAllocationByDropdown                        =true;
		
		System.out.println("******************************************checkInventoryOptions*********************************");
		
		System.out.println("CheckNegativeStockChkBox                             : "+actCheckNegativeStockChkBox                             +" Value Expected : "+expCheckNegativeStockChkBox);
		System.out.println("CheckNegativeStockWarnandAllowRadio                  : "+actCheckNegativeStockWarnandAllowRadio                  +" Value Expected : "+expCheckNegativeStockWarnandAllowRadio);
		System.out.println("CheckNegativeStockStopRadio                          : "+actCheckNegativeStockStopRadio                          +" Value Expected : "+expCheckNegativeStockStopRadio);
		System.out.println("IncludePendingPOToCheckNegativeStockChkBox           : "+actIncludePendingPOToCheckNegativeStockChkBox           +" Value Expected : "+expIncludePendingPOToCheckNegativeStockChkBox);
		System.out.println("CheckStockInOrdersChkBox                             : "+actCheckStockInOrdersChkBox                             +" Value Expected : "+expCheckStockInOrdersChkBox);
		System.out.println("IncludePendingSOQuantityInnegativeStockCheckChkBox   : "+actIncludePendingSOQuantityInnegativeStockCheckChkBox   +" Value Expected : "+expIncludePendingSOQuantityInnegativeStockCheckChkBox);
		System.out.println("IncludeReserveStockInStockCheckChkBox                : "+actIncludeReserveStockInStockCheckChkBox                +" Value Expected : "+expIncludeReserveStockInStockCheckChkBox);
		System.out.println("CheckReorderLevelChkBox                              : "+actCheckReorderLevelChkBox                              +" Value Expected : "+expCheckReorderLevelChkBox);
		System.out.println("MaintainQtyAndValuebyWareHouseRadio                  : "+actMaintainQtyAndValuebyWareHouseRadio                  +" Value Expected : "+expMaintainQtyAndValuebyWareHouseRadio);
		System.out.println("MaintainQtyByWareHouseandVlueOverAllRadio            : "+actMaintainQtyByWareHouseandVlueOverAllRadio            +" Value Expected : "+expMaintainQtyByWareHouseandVlueOverAllRadio);
		System.out.println("MaintainQtyOverAllAndValueOverAllRadio               : "+actMaintainQtyOverAllAndValueOverAllRadio               +" Value Expected : "+expMaintainQtyOverAllAndValueOverAllRadio);
		System.out.println("IntegrateInventoryWithAccountsChkBox                 : "+actIntegrateInventoryWithAccountsChkBox                 +" Value Expected : "+expIntegrateInventoryWithAccountsChkBox);
		System.out.println("IncludeReserveStockInStockLedgerChkBox               : "+actIncludeReserveStockInStockLedgerChkBox               +" Value Expected : "+expIncludeReserveStockInStockLedgerChkBox);
		System.out.println("InputUnitInTransactionsChkBox                        : "+actInputUnitInTransactionsChkBox                        +" Value Expected : "+expInputUnitInTransactionsChkBox);
		System.out.println("MaintainInventoryInAlternateUnitChkBox               : "+actMaintainInventoryInAlternateUnitChkBox               +" Value Expected : "+expMaintainInventoryInAlternateUnitChkBox);
		System.out.println("RestrictProductSelectionDependingOnTypeChkBox        : "+actRestrictProductSelectionDependingOnTypeChkBox        +" Value Expected : "+expRestrictProductSelectionDependingOnTypeChkBox);
		System.out.println("UpdateMRNValueStockThroughPurchaseChkBox             : "+actUpdateMRNValueStockThroughPurchaseChkBox             +" Value Expected : "+expUpdateMRNValueStockThroughPurchaseChkBox);
		System.out.println("DisplayProductAliasChkBox                            : "+actDisplayProductAliasChkBox                            +" Value Expected : "+expDisplayProductAliasChkBox);
		System.out.println("ReorderLevelsByWarehouseChkBox                       : "+actReorderLevelsByWarehouseChkBox                       +" Value Expected : "+expReorderLevelsByWarehouseChkBox);
		System.out.println("DonotUseRealTimeRateChkBox                           : "+actDonotUseRealTimeRateChkBox                           +" Value Expected : "+expDonotUseRealTimeRateChkBox);
		System.out.println("Reservation_NoneRadio                                : "+actReservation_NoneRadio                                +" Value Expected : "+expReservation_NoneRadio);
		System.out.println("Reservation_QuantitiesRadio                          : "+actReservation_QuantitiesRadio                          +" Value Expected : "+expReservation_QuantitiesRadio);
		System.out.println("Reservation_ReserveByRadio                           : "+actReservation_ReserveByRadio                           +" Value Expected : "+expReservation_ReserveByRadio);
		System.out.println("InventoryAllocationByDropdown                        : "+actInventoryAllocationByDropdown                        +" Value Expected : "+expInventoryAllocationByDropdown);
		
		
		boolean actMethod=actCheckNegativeStockChkBox==expCheckNegativeStockChkBox && actCheckNegativeStockWarnandAllowRadio==expCheckNegativeStockWarnandAllowRadio 
				&& actCheckNegativeStockStopRadio==expCheckNegativeStockStopRadio && actIncludePendingPOToCheckNegativeStockChkBox==expIncludePendingPOToCheckNegativeStockChkBox
				&& actCheckStockInOrdersChkBox==expCheckStockInOrdersChkBox && actIncludePendingSOQuantityInnegativeStockCheckChkBox==expIncludePendingSOQuantityInnegativeStockCheckChkBox
				&& actIncludeReserveStockInStockCheckChkBox==expIncludeReserveStockInStockCheckChkBox && actCheckReorderLevelChkBox==expCheckReorderLevelChkBox
				&& actMaintainQtyAndValuebyWareHouseRadio==expMaintainQtyAndValuebyWareHouseRadio && actMaintainQtyByWareHouseandVlueOverAllRadio==expMaintainQtyByWareHouseandVlueOverAllRadio
				&& actMaintainQtyOverAllAndValueOverAllRadio==expMaintainQtyOverAllAndValueOverAllRadio && actIntegrateInventoryWithAccountsChkBox==expIntegrateInventoryWithAccountsChkBox
				&& actIncludeReserveStockInStockLedgerChkBox==expIncludeReserveStockInStockLedgerChkBox && actInputUnitInTransactionsChkBox==expInputUnitInTransactionsChkBox
				&& actMaintainInventoryInAlternateUnitChkBox==expMaintainInventoryInAlternateUnitChkBox && actRestrictProductSelectionDependingOnTypeChkBox==expRestrictProductSelectionDependingOnTypeChkBox
				&& actUpdateMRNValueStockThroughPurchaseChkBox==expUpdateMRNValueStockThroughPurchaseChkBox && actDisplayProductAliasChkBox==expDisplayProductAliasChkBox
				&& actReorderLevelsByWarehouseChkBox==expReorderLevelsByWarehouseChkBox && actDonotUseRealTimeRateChkBox==expDonotUseRealTimeRateChkBox
				&& actReservation_NoneRadio==expReservation_NoneRadio && actReservation_QuantitiesRadio==expReservation_QuantitiesRadio
				&& actReservation_ReserveByRadio==expReservation_ReserveByRadio && actInventoryAllocationByDropdown==expInventoryAllocationByDropdown;
				
				
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 97, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 97, 8, actResult);
		
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println(" Test Pass : VerifyCheckNegativeStocks Inventory Options are Displayed as Expected");	
			excelReader.setCellData(xlfile, xlSheetName, 96, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pass : VerifyCheckNegativeStocks Inventory Options are Not Displayed as Expected");	
			excelReader.setCellData(xlfile, xlSheetName, 96, 9, resFail);
			return false;	
			
		}
	}
	
		
		

	
	public boolean checkIncludeReservestockinStockLedgerOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		getAction().moveToElement(IncludeReserveStockInStockLedgerChkBox).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IncludeReserveStockInStockLedgerChkBox));
		IncludeReserveStockInStockLedgerChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IncludeReserveStockInStockLedgerChkBox));
		
		boolean IncludeReserveStockInStock  =IncludeReserveStockInStockLedgerChkBoxSelected.isSelected();
		
		String actIncludeReserveStockInStockCheckChkBox=Boolean.toString(IncludeReserveStockInStock);
		String  expIncludeReserveStockInStockCheckChkBox  =excelReader.getCellData(xlSheetName, 99, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 99, 8, actIncludeReserveStockInStockCheckChkBox);
		
		System.out.println("***********************************checkIncludeReservestockinStockLedgerOption**************************");
		
		System.out.println("IncludeReserveStockInStockCheckChkBox   : "+actIncludeReserveStockInStockCheckChkBox+" Value Expected : "+expIncludeReserveStockInStockCheckChkBox);
		
		if(actIncludeReserveStockInStockCheckChkBox.equalsIgnoreCase(expIncludeReserveStockInStockCheckChkBox))
		{
			System.out.println(" Test Pass : IncludeReserveStockInStockLedgerChkBox Allows Selecting CheckBox");
			excelReader.setCellData(xlfile, xlSheetName, 98, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pass : IncludeReserveStockInStockLedgerChkBox Doesnot Allow Selecting CheckBox");
			excelReader.setCellData(xlfile, xlSheetName, 98, 9, resFail);
			return false;
		}
	}
	

	
	public boolean checkInputUnitsinTransactionsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InputUnitInTransactionsChkBox));
		InputUnitInTransactionsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InputUnitInTransactionsChkBox));;
		
		boolean InputUnitInTransactions  =InputUnitInTransactionsChkBoxSelected.isSelected();
		
		String actInputUnitInTransactionsChkBox=Boolean.toString(InputUnitInTransactions);
		
		String expInputUnitInTransactionsChkBox  = excelReader.getCellData(xlSheetName, 101, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 101, 8, actInputUnitInTransactionsChkBox);
		
		System.out.println("***********************************checkInputUnitsinTransactionsOption**************************");
		
		System.out.println("InputUnitInTransactionsChkBox   : "+actInputUnitInTransactionsChkBox+" Value Expected : "+expInputUnitInTransactionsChkBox);
		
		if(actInputUnitInTransactionsChkBox.equalsIgnoreCase(expInputUnitInTransactionsChkBox))
		{
			System.out.println(" Test Pass : InputUnitInTransactionsChkBox Allows Selecting CheckBox");
			excelReader.setCellData(xlfile, xlSheetName, 100, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pass : InputUnitInTransactionsChkBox Doesnot Allow Selecting CheckBox");
			excelReader.setCellData(xlfile, xlSheetName, 100, 9, resFail);
			return false;
		}
		
		
	}
		
	
	
	
	public boolean checkUpdateMRNstockvaluethroughPurchaseOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateMRNValueStockThroughPurchaseChkBox));
		UpdateMRNValueStockThroughPurchaseChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateMRNValueStockThroughPurchaseChkBox));
		
		boolean UpdateMRNValueStockThroughPurchase  =UpdateMRNValueStockThroughPurchaseChkBoxSelected.isSelected();
		
		String actUpdateMRNValueStockThroughPurchaseChkBox=Boolean.toString(UpdateMRNValueStockThroughPurchase);
		
		String expUpdateMRNValueStockThroughPurchaseChkBox  =excelReader.getCellData(xlSheetName, 103, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 103, 8, actUpdateMRNValueStockThroughPurchaseChkBox);
		
		
		System.out.println("***********************************checkUpdateMRNstockvaluethroughPurchaseOption**************************");
		
		System.out.println("UpdateMRNValueStockThroughPurchaseChkBox   : "+actUpdateMRNValueStockThroughPurchaseChkBox+" Value Expected : "+expUpdateMRNValueStockThroughPurchaseChkBox);
		
		if(actUpdateMRNValueStockThroughPurchaseChkBox.equalsIgnoreCase(expUpdateMRNValueStockThroughPurchaseChkBox))
		{
			System.out.println(" Test Pass : UpdateMRNValueStockThroughPurchaseChkBox Allows Selecting CheckBox");
			excelReader.setCellData(xlfile, xlSheetName, 102, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pass : UpdateMRNValueStockThroughPurchaseChkBox Doesnot Allow Selecting CheckBox");
			excelReader.setCellData(xlfile, xlSheetName, 102, 9, resFail);
			return false;
		}
	}
		

	
	
	public boolean checkReservation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		Thread.sleep(3000);
		getAction().moveToElement(ReservationExpandBtn).build().perform();
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Reservation_ReserveByRadio));
		Reservation_ReserveByRadio.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(Reservation_NoneRadio));
		
		boolean actReservation_NoneRadio        =Reservation_NoneRadio.isDisplayed();
		boolean actReservation_QuantitiesRadio  =Reservation_QuantitiesRadio.isDisplayed();
		boolean actReservation_ReserveByRadio   =Reservation_ReserveByRadio.isDisplayed();
		boolean actReservationByBatchChkBox     =ReservationByBatchChkBox.isDisplayed();
		boolean actReservationByBinChkBox       =ReservationByBinChkBox.isDisplayed();
		boolean actReservationByRMAChkBox       =ReservationByRMAChkBox.isDisplayed();
		
		boolean expReservation_NoneRadio        =true;
		boolean expReservation_QuantitiesRadio  =true;
		boolean expReservation_ReserveByRadio   =true;
		boolean expReservationByBatchChkBox     =true;
		boolean expReservationByBinChkBox       =true;
		boolean expReservationByRMAChkBox       =true;
		
		System.out.println("***********************************checkReservation**************************");
		
		System.out.println("Reservation_NoneRadio        : "+actReservation_NoneRadio        +" Value Expected : "+expReservation_NoneRadio);
		System.out.println("Reservation_QuantitiesRadio  : "+actReservation_QuantitiesRadio  +" Value Expected : "+expReservation_QuantitiesRadio);
		System.out.println("Reservation_ReserveByRadio   : "+actReservation_ReserveByRadio   +" Value Expected : "+expReservation_ReserveByRadio);
		System.out.println("ReservationByBatchChkBox     : "+actReservationByBatchChkBox     +" Value Expected : "+expReservationByBatchChkBox);
		System.out.println("ReservationByBinChkBox       : "+actReservationByBinChkBox       +" Value Expected : "+expReservationByBinChkBox);
		System.out.println("ReservationByRMAChkBox       : "+actReservationByRMAChkBox       +" Value Expected : "+expReservationByRMAChkBox);
		
		boolean actMethod=actReservation_NoneRadio==expReservation_NoneRadio && actReservation_QuantitiesRadio==expReservation_QuantitiesRadio 
				&& actReservation_ReserveByRadio==expReservation_ReserveByRadio && actReservationByBatchChkBox==expReservationByBatchChkBox
				&& actReservationByBinChkBox==expReservationByBinChkBox && actReservationByRMAChkBox==expReservationByRMAChkBox;
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 105, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 105, 8, actResult);
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : VerifyReservation Contains all Expected Options");
			excelReader.setCellData(xlfile, xlSheetName, 104, 9, resPass);
			return true;
			
		}else
		{
			System.out.println("Test Pass : VerifyReservation DoesNot Contains all Expected Options");
			excelReader.setCellData(xlfile, xlSheetName, 104, 9, resFail);
			return false;
		}
	}
		
		
	
		

	
	public boolean checkUpdateInventoryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Reservation_ReserveByRadio));
		Reservation_ReserveByRadio.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(Reservation_NoneRadio));
		ReservationByBinChkBox.click();
		ReservationByRMAChkBox.click();
	
		
		return true;
		
		/*Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 107, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 107, 8, actAlertMgs);
		
        getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 108, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 108, 8, actMessage);
		
		
		System.out.println("***********************************checkUpdateOkbuttonMiscelleanous****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);
		System.out.println("Message          : "+actMessage    +" Value Expected : "+expMessage);
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 106, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 106, 9, resFail);
			return false;
		}
*/	}


	
	
	
	
	public boolean checkAvailbilityofBatch() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(BatchBtn));
		
		boolean Batch=BatchBtn.isDisplayed();
		
		String actBatchBtn=Boolean.toString(Batch);
		
		String expBatchBtn=excelReader.getCellData(xlSheetName, 110, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 110, 8, actBatchBtn);
		
		System.out.println("****************************checkAvailbilityofBatch***********************");
		
		System.out.println("BatchBtn  : "+actBatchBtn+" Value Expected : "+expBatchBtn);
		
		if(actBatchBtn.equalsIgnoreCase(expBatchBtn))
		{
			System.out.println("Test Pass : VerifyAvailbilityofBatch Batch is Displayed");
			
			excelReader.setCellData(xlfile, xlSheetName, 109, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Pass : VerifyAvailbilityofBatch Batch is Not Displayed/Available ");
			excelReader.setCellData(xlfile, xlSheetName, 109, 9, resFail);
			return false;
		}
		
	}
		
		
	public boolean checkEnableBatchNumbersOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		Thread.sleep(2000);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BatchBtn));
		BatchBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EnableBatchesNoChkBox));
		EnableBatchesNoChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AllowNegativeBatchesQtyChkBox));
		
		boolean actAllowNegativeBatchesQtyChkBox                            	=AllowNegativeBatchesQtyChkBox.isDisplayed();
		boolean actDontAcceptDuplicateBatchesChkBox								=DontAcceptDuplicateBatchesChkBox.isDisplayed();
		boolean actExpiryDatesOfBatchesChkBox									=ExpiryDatesOfBatchesChkBox.isDisplayed();
		boolean actInputBatchMrpChkBox											=InputBatchMrpChkBox.isDisplayed();
		boolean actInputBatch_Value1Txt											=InputBatch_Value1Txt.isDisplayed();
		boolean actInputBatch_Value2Txt											=InputBatch_Value2Txt.isDisplayed();
		boolean actLoadAllDtlsBatchChkBox										=LoadAllDtlsBatchChkBox.isDisplayed();
		boolean actManufacturingDateByBatchesChkBox								=ManufacturingDateByBatchesChkBox.isDisplayed();
		boolean actSuggestNextBatchNoDocChkBox									=SuggestNextBatchNoDocChkBox.isDisplayed();
		boolean actConsolidateBatchesByBatchNoChkBox							=ConsolidateBatchesByBatchNoChkBox.isDisplayed();
		boolean actHideRatesOptionChkBox										=HideRatesOptionChkBox.isDisplayed();
		boolean actdonotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox =donotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox.isDisplayed();
		
		boolean expAllowNegativeBatchesQtyChkBox                            	=true;
		boolean expDontAcceptDuplicateBatchesChkBox								=true;
		boolean expExpiryDatesOfBatchesChkBox									=true;
		boolean expInputBatchMrpChkBox											=true;
		boolean expInputBatch_Value1Txt											=true;
		boolean expInputBatch_Value2Txt											=true;
		boolean expLoadAllDtlsBatchChkBox										=true;
		boolean expManufacturingDateByBatchesChkBox								=true;
		boolean expSuggestNextBatchNoDocChkBox									=true;
		boolean expConsolidateBatchesByBatchNoChkBox							=true;
		boolean expHideRatesOptionChkBox										=true;
		boolean expdonotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox =true;
		
	
		System.out.println("*******************************************checkEnableBatchOptions********************************");
		
		
		System.out.println("AllowNegativeBatchesQtyChkBox                                  : "+actAllowNegativeBatchesQtyChkBox                                +" Value Expected : "+expAllowNegativeBatchesQtyChkBox);
		System.out.println("DontAcceptDuplicateBatchesChkBox                               : "+actDontAcceptDuplicateBatchesChkBox                             +" Value Expected : "+expDontAcceptDuplicateBatchesChkBox);
		System.out.println("ExpiryDatesOfBatchesChkBox                                     : "+actExpiryDatesOfBatchesChkBox                                   +" Value Expected : "+expExpiryDatesOfBatchesChkBox);
		System.out.println("InputBatchMrpChkBox                                            : "+actInputBatchMrpChkBox                                          +" Value Expected : "+expInputBatchMrpChkBox);
		System.out.println("InputBatch_Value1Txt                                           : "+actInputBatch_Value1Txt                                         +" Value Expected : "+expInputBatch_Value1Txt);
		System.out.println("InputBatch_Value2Txt                                           : "+actInputBatch_Value2Txt                                         +" Value Expected : "+expInputBatch_Value2Txt);
		System.out.println("LoadAllDtlsBatchChkBox                                         : "+actLoadAllDtlsBatchChkBox                                       +" Value Expected : "+expLoadAllDtlsBatchChkBox);
		System.out.println("ManufacturingDateByBatchesChkBox                               : "+actManufacturingDateByBatchesChkBox                             +" Value Expected : "+expManufacturingDateByBatchesChkBox);
		System.out.println("SuggestNextBatchNoDocChkBox                                    : "+actSuggestNextBatchNoDocChkBox                                  +" Value Expected : "+expSuggestNextBatchNoDocChkBox);
		System.out.println("ConsolidateBatchesByBatchNoChkBox                              : "+actConsolidateBatchesByBatchNoChkBox                            +" Value Expected : "+expConsolidateBatchesByBatchNoChkBox);
		System.out.println("HideRatesOptionChkBox                                          : "+actHideRatesOptionChkBox                                        +" Value Expected : "+expHideRatesOptionChkBox);
		System.out.println("donotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox   : "+actdonotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox +" Value Expected : "+expdonotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox);
		
		
		
		boolean actMethod=actAllowNegativeBatchesQtyChkBox==expAllowNegativeBatchesQtyChkBox && actDontAcceptDuplicateBatchesChkBox==expDontAcceptDuplicateBatchesChkBox
				&& actExpiryDatesOfBatchesChkBox==expExpiryDatesOfBatchesChkBox && actInputBatchMrpChkBox==expInputBatchMrpChkBox
				&& actInputBatch_Value1Txt==expInputBatch_Value1Txt && actInputBatch_Value2Txt==expInputBatch_Value2Txt
				&& actLoadAllDtlsBatchChkBox==expLoadAllDtlsBatchChkBox && actManufacturingDateByBatchesChkBox==expManufacturingDateByBatchesChkBox
				&& actSuggestNextBatchNoDocChkBox==expSuggestNextBatchNoDocChkBox && actConsolidateBatchesByBatchNoChkBox==expConsolidateBatchesByBatchNoChkBox
				&& actHideRatesOptionChkBox==expHideRatesOptionChkBox
				&& actdonotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox==expdonotshowbatchesconsumedinsuspendedandpendingdocumentsChkBox;
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 112, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 112, 8, actResult);
		
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : VerifyEnableBatchOptionandOtherBatchOptions Displaying All Options");
			excelReader.setCellData(xlfile, xlSheetName, 111, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Pass : VerifyEnableBatchOptionandOtherBatchOptions Not Displaying All Options ");
			excelReader.setCellData(xlfile, xlSheetName, 111, 9, resFail);
			return false;
		}
    }
		
		
		
	
	public boolean checkEnableBatchExpiryOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExpiryDatesOfBatchesChkBox));
		ExpiryDatesOfBatchesChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExpiryDateOptionalChkBox));
		
		boolean actExpiryDateOptionalChkBox           =ExpiryDateOptionalChkBox.isDisplayed();
		boolean actIgnoringDayInExpiryChkBox		  =IgnoringDayInExpiryChkBox.isDisplayed();
		boolean actCalculateExpiryDateFromItemChkBox  =CalculateExpiryDateFromItemChkBox.isDisplayed();
		boolean actCantSellBatchesNxtChkBox			  =CantSellBatchesNxtChkBox.isDisplayed();
		boolean actCantSellBatches_Txt                =CantSellBatches_Txt.isDisplayed();
		boolean actCantSellBatches_Dropdown			  =CantSellBatches_Dropdown.isDisplayed();
		boolean actDontClubBatchesMfDtChkBox		  =DontClubBatchesMfDtChkBox.isDisplayed();
		boolean actSortBatchesExpDateChkBox			  =SortBatchesExpDateChkBox.isDisplayed();
		
		boolean expExpiryDateOptionalChkBox           =true;
		boolean expIgnoringDayInExpiryChkBox		  =true;
		boolean expCalculateExpiryDateFromItemChkBox  =true;
		boolean expCantSellBatchesNxtChkBox			  =true;
		boolean expCantSellBatches_Txt                =true;
		boolean expCantSellBatches_Dropdown			  =true;
		boolean expDontClubBatchesMfDtChkBox		  =true;
		boolean expSortBatchesExpDateChkBox			  =true;
		
		System.out.println("************************************checkEnableBatchExpiryOptions*******************************");
		
		System.out.println("ExpiryDateOptionalChkBox            : "+actExpiryDateOptionalChkBox          +" Value Expected : "+expExpiryDateOptionalChkBox);
		System.out.println("IgnoringDayInExpiryChkBox           : "+actIgnoringDayInExpiryChkBox         +" Value Expected : "+expIgnoringDayInExpiryChkBox);
		System.out.println("CalculateExpiryDateFromItemChkBox   : "+actCalculateExpiryDateFromItemChkBox +" Value Expected : "+expCalculateExpiryDateFromItemChkBox);
		System.out.println("CantSellBatchesNxtChkBox            : "+actCantSellBatchesNxtChkBox          +" Value Expected : "+expCantSellBatchesNxtChkBox);
		System.out.println("CantSellBatches_Txt                 : "+actCantSellBatches_Txt               +" Value Expected : "+expCantSellBatches_Txt);
		System.out.println("CantSellBatches_Dropdown            : "+actCantSellBatches_Dropdown          +" Value Expected : "+expCantSellBatches_Dropdown);
		System.out.println("DontClubBatchesMfDtChkBox           : "+actDontClubBatchesMfDtChkBox         +" Value Expected : "+expDontClubBatchesMfDtChkBox);
		System.out.println("SortBatchesExpDateChkBox            : "+actSortBatchesExpDateChkBox          +" Value Expected : "+expSortBatchesExpDateChkBox);
	
		
		boolean actMethod=actExpiryDateOptionalChkBox==expExpiryDateOptionalChkBox && actIgnoringDayInExpiryChkBox==expIgnoringDayInExpiryChkBox
				&& actCalculateExpiryDateFromItemChkBox==expCalculateExpiryDateFromItemChkBox && actCantSellBatchesNxtChkBox==expCantSellBatchesNxtChkBox
				&& actCantSellBatches_Txt==expCantSellBatches_Txt && actCantSellBatches_Dropdown==expCantSellBatches_Dropdown 
				&& actDontClubBatchesMfDtChkBox==expDontClubBatchesMfDtChkBox && actSortBatchesExpDateChkBox==expSortBatchesExpDateChkBox;
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 114, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 114, 8, actResult);
		
		
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass :VerifyEnableBatchnumbers Enables Below Options" );
			excelReader.setCellData(xlfile, xlSheetName, 113, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Pass :VerifyEnableBatchnumbers  Not Enables Below Options" );
			excelReader.setCellData(xlfile, xlSheetName, 113, 9, resFail);
			return false;
		}
	  }


	
	
	
	
	public boolean checkUpdateButtonInBatches() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 116, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 116, 8, actAlertMgs);
		
        getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 117, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		 excelReader.setCellData(xlfile, xlSheetName, 117, 8, actMessage);
		
		
		System.out.println("***********************************checkUpdateButtonInBatches****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);
		System.out.println("Message          : "+actMessage    +" Value Expected : "+expMessage);
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 115, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 115, 9, resPass);
			return false;
		}
	}


		
		
	public boolean checkAvailbilityofRMA() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
	    ConfigureTransactionBtn.click();
		*/
	    
	    getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(RMABtn));
	    
	    boolean RMA  =RMABtn.isDisplayed();
	    
	    String actRMABtn  = Boolean.toString(RMA);
	    String  expRMABtn  = excelReader.getCellData(xlSheetName, 119, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 119, 8, actRMABtn);
	    
	    
	    
	    System.out.println("**********************checkAvailbilityofRMA********************");
	    
	    System.out.println("RMABtn   : "+actRMABtn+" Value Expected : "+expRMABtn);
		
		if(actRMABtn.equalsIgnoreCase(expRMABtn))
		{
			 System.out.println(" Test Pas : VerifyAvailbilityofRMA RMA Option Is Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 118, 9, resPass);
			 return true;
		}
		else
		{
			 System.out.println(" Test Pas : VerifyAvailbilityofRMA RMA Option Is Not Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 118, 9, resFail);
			 return false;
		}
		
	}
	
		
	
	public boolean checkEnableRMASupportOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMABtn));
		RMABtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RmaSupportChkBox));
		
		boolean RmaSupport  =RmaSupportChkBox.isDisplayed();
		
		
		String actRmaSupportChkBox=Boolean.toString(RmaSupport);
	    String  expRmaSupportChkBox  =excelReader.getCellData(xlSheetName, 121, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 121, 8, actRmaSupportChkBox);
	    
	    System.out.println("**********************checkEnableRMASupportOption********************");
	    
	    System.out.println("RmaSupportChkBox   : "+actRmaSupportChkBox+" Value Expected : "+expRmaSupportChkBox);
		
		if(actRmaSupportChkBox.equalsIgnoreCase(expRmaSupportChkBox))
		{
		   System.out.println(" Test Pass : VerifyEnableRMAOptionandOtherRMAOptions Rma Options are Displayed as Expected");	
		   excelReader.setCellData(xlfile, xlSheetName, 120, 9, resPass);
		   return true;
		}
		else
		{
			System.out.println(" Test Pass : VerifyEnableRMAOptionandOtherRMAOptions Rma Options are Not Displayed as Expected");	
			excelReader.setCellData(xlfile, xlSheetName, 120, 9, resFail);
			return false;	
			
		}
	}
	
	
		
	
	
	public boolean checkRMAOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RmaSupportChkBox));
		RmaSupportChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RmaSupportChkBox));
		
		boolean actRmaSupportChkBox                     =RmaSupportChkBox.isDisplayed();
		boolean actRMAbasedalternateQuantityChkBox      =RMAbasedalternateQuantityChkBox.isDisplayed();
		boolean actRMANumberAlwaysnumericChkBox         =RMANumberAlwaysnumericChkBox.isDisplayed();
		boolean actRMANumberCantBeUsedChkBox            =RMANumberCantBeUsedChkBox.isDisplayed();
		boolean actRMANumberUniqueAcrossAllItemsChkBox  =RMANumberUniqueAcrossAllItemsChkBox.isDisplayed();
		boolean actInputRMANoChkBox                     =InputRMANoChkBox.isDisplayed();
		boolean actPrefixVoucherNoChkBox                =PrefixVoucherNoChkBox.isDisplayed();
		
		boolean expRmaSupportChkBox                     =true;
		boolean expRMAbasedalternateQuantityChkBox      =true;
		boolean expRMANumberAlwaysnumericChkBox         =true;
		boolean expRMANumberCantBeUsedChkBox            =true;
		boolean expRMANumberUniqueAcrossAllItemsChkBox  =true;
		boolean expInputRMANoChkBox                     =true;
		boolean expPrefixVoucherNoChkBox                =true;
		
		System.out.println("**********************checkRMAOptions********************");
		    
		System.out.println("RmaSupportChkBox                      : "+actRmaSupportChkBox                     +" Value Expected : "+expRmaSupportChkBox);
		System.out.println("RMAbasedalternateQuantityChkBox       : "+actRMAbasedalternateQuantityChkBox      +" Value Expected : "+expRMAbasedalternateQuantityChkBox);
		System.out.println("RMANumberAlwaysnumericChkBox          : "+actRMANumberAlwaysnumericChkBox         +" Value Expected : "+expRMANumberAlwaysnumericChkBox);
		System.out.println("RMANumberCantBeUsedChkBox             : "+actRMANumberCantBeUsedChkBox            +" Value Expected : "+expRMANumberCantBeUsedChkBox);
		System.out.println("RMANumberUniqueAcrossAllItemsChkBox   : "+actRMANumberUniqueAcrossAllItemsChkBox  +" Value Expected : "+expRMANumberUniqueAcrossAllItemsChkBox);
		System.out.println("InputRMANoChkBox                      : "+actInputRMANoChkBox                     +" Value Expected : "+expInputRMANoChkBox);
		System.out.println("PrefixVoucherNoChkBox                 : "+actPrefixVoucherNoChkBox                +" Value Expected : "+expPrefixVoucherNoChkBox);
		
		
		
		boolean actMethod=actRmaSupportChkBox==expRmaSupportChkBox && actRMAbasedalternateQuantityChkBox==expRMAbasedalternateQuantityChkBox 
				&& actRMANumberAlwaysnumericChkBox==expRMANumberAlwaysnumericChkBox && actRMANumberCantBeUsedChkBox==expRMANumberCantBeUsedChkBox 
				&& actRMANumberUniqueAcrossAllItemsChkBox==expRMANumberUniqueAcrossAllItemsChkBox && actInputRMANoChkBox==expInputRMANoChkBox
				&& actPrefixVoucherNoChkBox==expPrefixVoucherNoChkBox;
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 123, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 123, 8, actResult);
		
		
		
		if(actResult.equalsIgnoreCase(expResult))
		{
		System.out.println(" Test Pass : VerifyEnableRMAOptionandOtherRMAOptions Rma Options are Displayed as Expected");	
		 excelReader.setCellData(xlfile, xlSheetName, 122, 9, resPass);
		return true;
		}
		else
		{
			System.out.println(" Test Pass : VerifyEnableRMAOptionandOtherRMAOptions Rma Options are Not Displayed as Expected");	
			 excelReader.setCellData(xlfile, xlSheetName, 122, 9, resFail);
			return false;	
			
		}
	}


	public boolean checkUpdateButtonInRMA() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();

		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 125, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 125, 8, actAlertMgs);
		
        getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 126, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		excelReader.setCellData(xlfile, xlSheetName, 126, 8, actMessage);
		
		
		System.out.println("***********************************checkUpdateButtonInRMA****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);
		System.out.println("Message          : "+actMessage    +" Value Expected : "+expMessage);
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actMessage.equalsIgnoreCase(expMessage))
		
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 124, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 124, 9, resPass);
			return false;
		}
	}



	
	
	
	
	@FindBy(xpath="//*[@id='chkEnableBins']/following-sibling::span")
	public static WebElement  EnableBinsChkBox;
	
	@FindBy(xpath="//input[@id='chkEnableBins']")
	public static WebElement  EnableBinsChkBoxSelected;
	
	@FindBy(xpath="//*[@id='chkBinsCat']/following-sibling::span")
	public static WebElement  ItemsArePlacedinTheBinsChkBox;
	
	@FindBy(xpath="//input[@id='chkBinsCat']")
	public static WebElement  ItemsArePlacedinTheBinsChkBoxSelected;
	
	@FindBy(xpath="//*[@id='chkSameBin']/following-sibling::span")
	public static WebElement  TwoDifferentItemsCannotBePlacedInSameBinChkBox;
	
	@FindBy(xpath="//input[@id='chkSameBin']")
	public static WebElement  TwoDifferentItemsCannotBePlacedInSameBinChkBoxSelected;
	
	@FindBy(xpath="//*[@id='ckhConsiderUnits']/following-sibling::span")
	public static WebElement  ConsiderUnitsChkBox;
	
	@FindBy(xpath="//input[@id='ckhConsiderUnits']")
	public static WebElement  ConsiderUnitsChkBoxSelected;
	
	@FindBy(xpath="//*[@id='ckhSameBatch']/following-sibling::span")
	public static WebElement  TwoDifferentBatchesCannotBePlacedInSameBinChkbox;
	
	@FindBy(xpath="//input[@id='ckhSameBatch']")
	public static WebElement  TwoDifferentBatchesCannotBePlacedInSameBinChkboxSelected;
	
	@FindBy(xpath="//*[@id='chkDiffAttribute']/following-sibling::span")
	public static WebElement  ItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox;
	
	@FindBy(xpath="//input[@id='chkDiffAttribute']")
	public static WebElement  ItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBoxSelected;
	
	
	@FindBy(xpath="//*[@id='Issueoftheitemsfrombins']/button")
	public static WebElement  IssueoftheitemsfrombinsExpandBtn;
	
	@FindBy(xpath="//*[@id='grpSkidAloc']/button")
	public static WebElement  skidAllocationExpandBtn;
	
	
	
	@FindBy(xpath="//select[@id='cmbPlaceItemfirst1']")
	public static WebElement  PlaceTheItemfirstDropdown;
	
	@FindBy(xpath="//*[@id='BinsItmRec']/label[2]/span")
	public static WebElement  AllocateIntoPartiallyChkBox;
	
	@FindBy(xpath="//*[@id='BinsItmRec']/label[2]/input")
	public static WebElement  AllocateIntoPartiallyChkBoxelected;
	
	@FindBy(xpath="//select[@id='cmbPlaceItemfirst1']")
	public static WebElement  PickTheItemFirstdropdown;
	
	@FindBy(xpath="//*[@id='ckhPickPartBins']")
	public static WebElement  PickfromPartiallychkbox;
	
	@FindBy(xpath="//*[@id='ckhPickPartBins']/following-sibling::span")
	public static WebElement  PickfromPartiallychkboxSelected;
	
	@FindBy(xpath="//*[@id='ckhPickItmExpMF']")
	public static WebElement  PickItmExpMFChkBox;
	
	@FindBy(xpath="//input[@id='ckhPickItmExpMF']/following-sibling::span")
	public static WebElement  PickItmExpMFChkBoxSelected;
	
	@FindBy(xpath="//*[@id='chkIssueFIFO']")
	public static WebElement  IssueFromBinChkBox;
	
	@FindBy(xpath="//input[@id='chkIssueFIFO']/following-sibling::span")
	public static WebElement  IssueFromBinChkBoxSelected;
	
	@FindBy(xpath="//input[@id='rdoPickItems_0']")
	public static WebElement  PickItembasedOnExpiryRadio;
	
	@FindBy(xpath="//input[@id='rdoPickItems_1']")
	public static WebElement  PickItemsBasedOnManufactureRadio;
	
	@FindBy(xpath="//input[@id='txtDntShowExpireWithIn']")
	public static WebElement  DontShowExpireWithInTxt;
	
	@FindBy(xpath="//*[@id='chkSkidCat']")
	public static WebElement  ItemsArePlacedintheSkidsChkBox;
	
	@FindBy(xpath="//*[@id='chkSameSkidItems']")
	public static WebElement  TwoDifferentItemsCannotBePlacedInSameSkidChkBox;
	
	@FindBy(xpath="//*[@id='ckhSameSkidBatch']")
	public static WebElement  TwoDifferentBatchesCannotBePlacedInSameSkidChkBox;
	
	@FindBy(xpath="//input[@id='chkDiffSkidAttribute']")
	public static WebElement  ItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox;
	
	
	public boolean checkAvailbilityofBins() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(BinsBtn));
		
		boolean Bins  =BinsBtn.isDisplayed();
		
		
		
		String actBinsBtn=Boolean.toString(Bins);
		
		
		String  expBinsBtn   =excelReader.getCellData(xlSheetName, 128, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 128, 8, actBinsBtn);
		
		
		System.out.println("******************************checkAvailbilityofBins****************");
		
		System.out.println("BinsBtn    : "+actBinsBtn+" Value Expected : "+expBinsBtn);
		
		if(actBinsBtn.equalsIgnoreCase(expBinsBtn))
		{
			System.out.println(" Test Pas : VerifyAvailbilityofBins Bins Option Is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 127, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pas : VerifyAvailbilityofBins Bins Option Is Not Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 127, 9, resFail);
			return false;
		}
	}
	
		
	
	public boolean checkEnableBins() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
		BinsBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EnableBinsChkBox));
		
		boolean EnableBins   =EnableBinsChkBox.isDisplayed();
		
		String actEnableBinsChkBox=Boolean.toString(EnableBins);
		
		
		String  expEnableBinsChkBox   =excelReader.getCellData(xlSheetName, 130, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 130, 8, actEnableBinsChkBox);
		
		
		System.out.println("******************************checkEnableBins****************");
		
		System.out.println("EnableBinsChkBox    : "+actEnableBinsChkBox+" Value Expected : "+expEnableBinsChkBox);
		
		if(actEnableBinsChkBox.equalsIgnoreCase(expEnableBinsChkBox))
		{
			System.out.println(" Test Pass : VerifyEnableBinsOptionandOtherBinsOptions BIN Options are Displayed as Expected");	
			excelReader.setCellData(xlfile, xlSheetName, 129, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pass : VerifyEnableBinsOptionandOtherBinsOptions BIN Options are Not Displayed as Expected");	
			excelReader.setCellData(xlfile, xlSheetName, 129, 9, resFail);
			return false;	
			
		}
	}
	
	
	
	public boolean checkEnableBinsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EnableBinsChkBox));
		EnableBinsChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemsArePlacedinTheBinsChkBox));
		
		boolean actItemsArePlacedinTheBinsChkBox                               =ItemsArePlacedinTheBinsChkBox.isDisplayed();
		boolean actTwoDifferentItemsCannotBePlacedInSameBinChkBox              =TwoDifferentItemsCannotBePlacedInSameBinChkBox.isDisplayed();
		boolean actConsiderUnitsChkBox                                         =ConsiderUnitsChkBox.isDisplayed();
		boolean actTwoDifferentBatchesCannotBePlacedInSameBinChkbox            =TwoDifferentBatchesCannotBePlacedInSameBinChkbox.isDisplayed();
		boolean actItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox  =ItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox.isDisplayed();
		
		/*boolean actItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox   =ItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox.isDisplayed();*/
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IssueoftheitemsfrombinsExpandBtn));
		IssueoftheitemsfrombinsExpandBtn.click();
		Thread.sleep(2000);
		
		boolean actPlaceTheItemfirstDropdown                                   =PlaceTheItemfirstDropdown.isDisplayed();
	/*	boolean actAllocateIntoPartiallyChkBox                                 =AllocateIntoPartiallyChkBox.isDisplayed();*/
		boolean actPickTheItemFirstdropdown                                    =PickTheItemFirstdropdown.isDisplayed();
		boolean actPickfromPartiallychkbox                                     =PickfromPartiallychkbox.isDisplayed();
		boolean actPickItmExpMFChkBox                                          =PickItmExpMFChkBox.isDisplayed();
		boolean actIssueFromBinChkBox                                          =IssueFromBinChkBox.isDisplayed();
		boolean actPickItembasedOnExpiryRadio                                  =PickItembasedOnExpiryRadio.isDisplayed();
		boolean actPickItemsBasedOnManufactureRadio                            =PickItemsBasedOnManufactureRadio.isDisplayed();
		boolean actDontShowExpireWithInTxt                                     =DontShowExpireWithInTxt.isDisplayed();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(skidAllocationExpandBtn));
		skidAllocationExpandBtn.click();
		Thread.sleep(2000);
		boolean actItemsArePlacedintheSkidsChkBox                              =ItemsArePlacedintheSkidsChkBox.isDisplayed();
		boolean actTwoDifferentItemsCannotBePlacedInSameSkidChkBox             =TwoDifferentItemsCannotBePlacedInSameSkidChkBox.isDisplayed();
		boolean actTwoDifferentBatchesCannotBePlacedInSameSkidChkBox           =TwoDifferentBatchesCannotBePlacedInSameSkidChkBox.isDisplayed();
		
		boolean expItemsArePlacedinTheBinsChkBox                               =true;
		boolean expTwoDifferentItemsCannotBePlacedInSameBinChkBox              =true;
		boolean expConsiderUnitsChkBox                                         =true;
		boolean expTwoDifferentBatchesCannotBePlacedInSameBinChkbox            =true;
		boolean expItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox  =true;
		boolean expItemsArePlacedintheSkidsChkBox                              =true;
		boolean expTwoDifferentItemsCannotBePlacedInSameSkidChkBox             =true;
		boolean expTwoDifferentBatchesCannotBePlacedInSameSkidChkBox           =true;
		boolean expItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox   =true;
		boolean expPlaceTheItemfirstDropdown                                   =true;
		/*boolean expAllocateIntoPartiallyChkBox                                 =true;*/
		boolean expPickTheItemFirstdropdown                                    =true;
		boolean expPickfromPartiallychkbox                                     =true;
		boolean expPickItmExpMFChkBox                                          =true;
		boolean expIssueFromBinChkBox                                          =true;
		boolean expPickItembasedOnExpiryRadio                                  =true;
		boolean expPickItemsBasedOnManufactureRadio                            =true;
		boolean expDontShowExpireWithInTxt                                     =true;
		
		System.out.println("******************************checkEnableBinsOption****************************");
		
		System.out.println("ItemsArePlacedinTheBinsChkBox                               : "+actItemsArePlacedinTheBinsChkBox                              +" Value Expected : "+expItemsArePlacedinTheBinsChkBox);
		System.out.println("TwoDifferentItemsCannotBePlacedInSameBinChkBox              : "+actTwoDifferentItemsCannotBePlacedInSameBinChkBox             +" Value Expected : "+expTwoDifferentItemsCannotBePlacedInSameBinChkBox);
		System.out.println("ConsiderUnitsChkBox                                         : "+actConsiderUnitsChkBox                                        +" Value Expected : "+expConsiderUnitsChkBox);
		System.out.println("TwoDifferentBatchesCannotBePlacedInSameBinChkbox            : "+actTwoDifferentBatchesCannotBePlacedInSameBinChkbox           +" Value Expected : "+expTwoDifferentBatchesCannotBePlacedInSameBinChkbox);
		System.out.println("ItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox  : "+actItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox +" Value Expected : "+expItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox);
		System.out.println("ItemsArePlacedintheSkidsChkBox                              : "+actItemsArePlacedintheSkidsChkBox                             +" Value Expected : "+expItemsArePlacedintheSkidsChkBox);
		System.out.println("TwoDifferentItemsCannotBePlacedInSameSkidChkBox             : "+actTwoDifferentItemsCannotBePlacedInSameSkidChkBox            +" Value Expected : "+expTwoDifferentItemsCannotBePlacedInSameSkidChkBox);
		System.out.println("TwoDifferentBatchesCannotBePlacedInSameSkidChkBox           : "+actTwoDifferentBatchesCannotBePlacedInSameSkidChkBox          +" Value Expected : "+expTwoDifferentBatchesCannotBePlacedInSameSkidChkBox);
	/*	System.out.println("ItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox   : "+actItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox  +" Value Expected : "+expItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox);*/
		System.out.println("PlaceTheItemfirstDropdown                                   : "+actPlaceTheItemfirstDropdown                                  +" Value Expected : "+expPlaceTheItemfirstDropdown);
	/*	System.out.println("AllocateIntoPartiallyChkBox                                 : "+actAllocateIntoPartiallyChkBox                                +" Value Expected : "+expAllocateIntoPartiallyChkBox);*/
		System.out.println("PickTheItemFirstdropdown                                    : "+actPickTheItemFirstdropdown                                   +" Value Expected : "+expPickTheItemFirstdropdown);
		System.out.println("PickfromPartiallychkbox                                     : "+actPickfromPartiallychkbox                                    +" Value Expected : "+expPickfromPartiallychkbox);
		System.out.println("PickItmExpMFChkBox                                          : "+actPickItmExpMFChkBox                                         +" Value Expected : "+expPickItmExpMFChkBox);
		System.out.println("IssueFromBinChkBox                                          : "+actIssueFromBinChkBox                                         +" Value Expected : "+expIssueFromBinChkBox);
		System.out.println("PickItembasedOnExpiryRadio                                  : "+actPickItembasedOnExpiryRadio                                 +" Value Expected : "+expPickItembasedOnExpiryRadio);
		System.out.println("PickItemsBasedOnManufactureRadio                            : "+actPickItemsBasedOnManufactureRadio                           +" Value Expected : "+expPickItemsBasedOnManufactureRadio);
		System.out.println("DontShowExpireWithInTxt                                     : "+actDontShowExpireWithInTxt                                    +" Value Expected : "+expDontShowExpireWithInTxt);
		
		
		boolean actMethod=actItemsArePlacedinTheBinsChkBox==expItemsArePlacedinTheBinsChkBox 
				&& actTwoDifferentItemsCannotBePlacedInSameBinChkBox==expTwoDifferentItemsCannotBePlacedInSameBinChkBox	&& actConsiderUnitsChkBox==expConsiderUnitsChkBox 
				&& actTwoDifferentBatchesCannotBePlacedInSameBinChkbox==expTwoDifferentBatchesCannotBePlacedInSameBinChkbox
				&& actItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox==expItemWithTwoDifferentAttributeCannotBEPlacedInSameBinChkBox
				&& actItemsArePlacedintheSkidsChkBox==expItemsArePlacedintheSkidsChkBox 
				&& actTwoDifferentItemsCannotBePlacedInSameSkidChkBox==expTwoDifferentItemsCannotBePlacedInSameSkidChkBox
				&& actTwoDifferentBatchesCannotBePlacedInSameSkidChkBox==expTwoDifferentBatchesCannotBePlacedInSameSkidChkBox
				/*&& actItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox*/==expItemWithTwoDifferentBatchesCannotBePlacedInSameSkidChkBox 
				&& actPlaceTheItemfirstDropdown==expPlaceTheItemfirstDropdown/* && actAllocateIntoPartiallyChkBox==expAllocateIntoPartiallyChkBox*/
				&& actPickTheItemFirstdropdown==expPickTheItemFirstdropdown && actPickfromPartiallychkbox==expPickfromPartiallychkbox
				&& actPickItmExpMFChkBox==expPickItmExpMFChkBox && actIssueFromBinChkBox==expIssueFromBinChkBox && actPickItembasedOnExpiryRadio==expPickItembasedOnExpiryRadio
				&& actPickItemsBasedOnManufactureRadio==expPickItemsBasedOnManufactureRadio && actDontShowExpireWithInTxt==expDontShowExpireWithInTxt;
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 132, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 132, 8, actResult);
		
		
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println(" Test Pass : VerifyEnableBinsOptionandOtherBinsOptions BIN Options are Displayed as Expected");	
			excelReader.setCellData(xlfile, xlSheetName, 131, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pass : VerifyEnableBinsOptionandOtherBinsOptions BIN Options are Not Displayed as Expected");	
			excelReader.setCellData(xlfile, xlSheetName, 131, 9, resFail);
			return false;	
			
		}
	}
	
		
	
	
	public boolean checkUpdateButtonInBins() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 134, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 134, 8, actAlertMgs);
		
        getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 135, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		excelReader.setCellData(xlfile, xlSheetName, 135, 8, actMessage);
		
		
		System.out.println("***********************************checkUpdateButtonInBins****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);
		System.out.println("Message          : "+actMessage    +" Value Expected : "+expMessage);
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actMessage.equalsIgnoreCase(expMessage))
		
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 133, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 133, 9, resPass);
			return false;
		}
	}



		
			
		
		
	@FindBy(xpath="//input[@id='DecimalQuantity']")
	public static WebElement  DecimalsinQuantityDropdown;
	
	
	@FindBy(xpath="//select[@id='ddlInventoryAllocationBy']")
	public static WebElement  InventoryAllocationByDropdown;
	
	// Grid Elements not Done
	@FindBy(xpath="//*[@id='rightPanel']/div/div//label")
	public static List<WebElement> hirePurchaseScreenList;
	
	
	
	
	

	public boolean checkHirePurchase() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(MailSettingsBtn));
		
		boolean HirePurchase   =HirePurchaseBtn.isDisplayed();
		
		String actHirePurchaseBtn=Boolean.toString(HirePurchase);
		String expHirePurchaseBtn   =excelReader.getCellData(xlSheetName, 137, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 137, 8, actHirePurchaseBtn);
		
        Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(HirePurchaseBtn));
		HirePurchaseBtn.click();


		Thread.sleep(2000);
		
		
		ArrayList<String>acthirePurchaseScreenList=new ArrayList<String>();
		
		int actHirePurchaseScreenListCount=hirePurchaseScreenList.size();
		int expirePurchaseScreenListCount = 11;
		
		
		System.out.println(" hirePurchaseScreenList  :  "+hirePurchaseScreenList);
		
		for (int i = 0; i < actHirePurchaseScreenListCount; i++)
		{
			String data=hirePurchaseScreenList.get(i).getText();
			acthirePurchaseScreenList.add(data);
		}
		
		String acthirePurchaseScreen=acthirePurchaseScreenList.toString();
		String exphirePurchaseScreen=excelReader.getCellData(xlSheetName, 138, 7);
		
		System.err.println("  Actual hirePurchaseScreenList    : "+acthirePurchaseScreen);
		System.err.println("  Expected  hirePurchaseScreenList : "+exphirePurchaseScreen);
		
		excelReader.setCellData(xlfile, xlSheetName, 138, 8, acthirePurchaseScreen);
		
		System.out.println("**********************************checkHirePurchase************************************");
		
		System.out.println("actHirePurchaseBtn       : "+actHirePurchaseBtn   +" Value Expected : "+expHirePurchaseBtn);
		System.out.println("acthirePurchaseScreen    : "+acthirePurchaseScreen+" Value Expected : "+exphirePurchaseScreen);
		
		if(actHirePurchaseBtn.equalsIgnoreCase(expHirePurchaseBtn) && 
				actHirePurchaseScreenListCount == expirePurchaseScreenListCount)
		{
			System.out.println(" Test Pas : VerifyMailSettings MailSettings Option Is Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 136, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pas : VerifyMailSettings MailSettings Option Is Not Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 136, 9, resFail);
			 
			return false;
		}
    }
		

	
	public boolean checkQuotationAnalysis() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(MailSettingsBtn));
		
		boolean QuotationAnalysis   =QuotationAnalysisBtn.isDisplayed();
		
		String actQuotationAnalysisBtn=Boolean.toString(QuotationAnalysis);
		String expQuotationAnalysisBtn   =excelReader.getCellData(xlSheetName, 140, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 140, 8, actQuotationAnalysisBtn);
		
       Thread.sleep(3000);
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(QuotationAnalysisBtn));
		QuotationAnalysisBtn.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(QATagToUSeDrpdwn));
		
		boolean actQATagToUSeDrpdwn                        = QATagToUSeDrpdwn.isDisplayed();
		boolean actQASalesQuatationsChkBox                 = QASalesQuatationsChkBox.isDisplayed();
		boolean actQAPurchaseQuatationsChkbox              = QAPurchaseQuatationsChkbox.isDisplayed();
		boolean actQAMinmumNoOFQutationsTXtR1              = QAMinmumNoOFQutationsTXtR1.isDisplayed();
		boolean actQAMinmumNoOFQutationsTXtR2  			   = QAMinmumNoOFQutationsTXtR2.isDisplayed();
		boolean actQAWhenValueLessThanTxt                  = QAWhenValueLessThanTxt.isDisplayed();
		boolean actQAWhenValueGreaterThanTxt               = QAWhenValueGreaterThanTxt.isDisplayed();
		boolean actQADataHistoryChkBox                     = QADataHistoryChkBox.isDisplayed();
		boolean actQABaseCurrencyRadioBtn   			   = QABaseCurrencyRadioBtn.isDisplayed();
		boolean actQATransCurrencyRadioBtn                 = QATransCurrencyRadioBtn.isDisplayed();
		
		boolean expQATagToUSeDrpdwn                        = true;
		boolean expQASalesQuatationsChkBox                 = true;
		boolean expQAPurchaseQuatationsChkbox              = true;
		boolean expQAMinmumNoOFQutationsTXtR1              = true;
		boolean expQAMinmumNoOFQutationsTXtR2              = true;
		boolean expQAWhenValueLessThanTxt                  = true;
		boolean expQAWhenValueGreaterThanTxt               = true;
		boolean expQADataHistoryChkBox           		   = true;
		boolean expQABaseCurrencyRadioBtn   			   = true;
		boolean expQATransCurrencyRadioBtn   			   = true;
		
		System.out.println("******************************checkQuotationAnalysis****************************");
		
		System.out.println("QATagToUSeDrpdwn                     : "+actQATagToUSeDrpdwn                    +" Value Expected : "+expQATagToUSeDrpdwn);
		System.out.println("QASalesQuatationsChkBox              : "+actQASalesQuatationsChkBox             +" Value Expected : "+expQASalesQuatationsChkBox);
		System.out.println("QAPurchaseQuatationsChkbox           : "+actQAPurchaseQuatationsChkbox          +" Value Expected : "+expQAPurchaseQuatationsChkbox);
		System.out.println("QAMinmumNoOFQutationsTXtR1           : "+actQAMinmumNoOFQutationsTXtR1          +" Value Expected : "+expQAMinmumNoOFQutationsTXtR1);
		System.out.println("QAMinmumNoOFQutationsTXtR2           : "+actQAMinmumNoOFQutationsTXtR2          +" Value Expected : "+expQAMinmumNoOFQutationsTXtR2);
		System.out.println("QAWhenValueLessThanTxt               : "+actQAWhenValueLessThanTxt              +" Value Expected : "+expQAWhenValueLessThanTxt);
		System.out.println("QAWhenValueGreaterThanTxt            : "+actQAWhenValueGreaterThanTxt           +" Value Expected : "+expQAWhenValueGreaterThanTxt);
		System.out.println("QADataHistoryChkBox                  : "+actQADataHistoryChkBox                 +" Value Expected : "+expQADataHistoryChkBox);
		System.out.println("QABaseCurrencyRadioBtn               : "+actQABaseCurrencyRadioBtn              +" Value Expected : "+expQABaseCurrencyRadioBtn);
		System.out.println("QATransCurrencyRadioBtn              : "+actQATransCurrencyRadioBtn             +" Value Expected : "+expQATransCurrencyRadioBtn);
		
		
		boolean actMethod=actQATagToUSeDrpdwn==expQATagToUSeDrpdwn 
				&& actQASalesQuatationsChkBox==expQASalesQuatationsChkBox	
				&& actQAPurchaseQuatationsChkbox==expQAPurchaseQuatationsChkbox 
				&& actQAMinmumNoOFQutationsTXtR1==expQAMinmumNoOFQutationsTXtR1
				&& actQAMinmumNoOFQutationsTXtR2==expQAMinmumNoOFQutationsTXtR2
				&& actQAWhenValueLessThanTxt==expQAWhenValueLessThanTxt 
				&& actQAWhenValueGreaterThanTxt==expQAWhenValueGreaterThanTxt
				&& actQADataHistoryChkBox==expQADataHistoryChkBox
				&& actQABaseCurrencyRadioBtn==expQABaseCurrencyRadioBtn 
				&& actQATransCurrencyRadioBtn==expQATransCurrencyRadioBtn;
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 141, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 141, 8, actResult);
		
		
		System.out.println("**********************************checkHirePurchase************************************");
		
		System.out.println("actQuotationAnalysisBtn       : "+actQuotationAnalysisBtn   +" Value Expected : "+expQuotationAnalysisBtn);
		System.out.println("acthirePurchaseScreen         : "+actResult+" Value Expected : "+expResult);
		
		if(actQuotationAnalysisBtn.equalsIgnoreCase(expQuotationAnalysisBtn) && 
				actResult.equalsIgnoreCase(expResult))
		{
			System.out.println(" Test Pass : Quatations Analysis Option Is Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 139, 9, resPass);
			return true;
	   	}
		else
		{
			System.out.println(" Test Fail :  Quatations Analysis Option Is Not Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 139, 9, resFail);
			 
			return false;
		}
    }
		
	
	
	
    public boolean checkRFID() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(RFIDBtn));
		
		boolean RFID   =RFIDBtn.isDisplayed();
		
		String actRFIDBtn=Boolean.toString(RFID);
		String expRFIDBtn   =excelReader.getCellData(xlSheetName, 143, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 143, 8, actRFIDBtn);
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RFIDBtn));
		RFIDBtn.click();
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RFIDProductIDChkbox));
		
		boolean actRFIDProductIDChkbox                = RFIDProductIDChkbox.isDisplayed();
		boolean actRFIDQuantityChkbox                 = RFIDQuantityChkbox.isDisplayed();
		boolean actRFIDAlternativeQTYChkbox           = RFIDAlternativeQTYChkbox.isDisplayed();
		boolean actRFIDUnitsChkbox                    = RFIDUnitsChkbox.isDisplayed();
		boolean actRFIDBatchChkbox  			      = RFIDBatchChkbox.isDisplayed();
		boolean actRFIDRMAChkbox                      = RFIDRMAChkbox.isDisplayed();
		
		boolean expRFIDProductIDChkbox                = true;
		boolean expRFIDQuantityChkbox                 = true;
		boolean expRFIDAlternativeQTYChkbox           = true;
		boolean expRFIDUnitsChkbox                    = true;
		boolean expRFIDBatchChkbox                    = true;
		boolean expRFIDRMAChkbox                      = true;
		
		System.out.println("******************************checkRFID****************************");
		
		System.out.println("RFIDProductIDChkbox             : "+actRFIDProductIDChkbox           +" Value Expected : "+expRFIDProductIDChkbox);
		System.out.println("RFIDQuantityChkbox              : "+actRFIDQuantityChkbox            +" Value Expected : "+expRFIDQuantityChkbox);
		System.out.println("RFIDAlternativeQTYChkbox        : "+actRFIDAlternativeQTYChkbox      +" Value Expected : "+expRFIDAlternativeQTYChkbox);
		System.out.println("RFIDUnitsChkbox                 : "+actRFIDUnitsChkbox               +" Value Expected : "+expRFIDUnitsChkbox);
		System.out.println("RFIDBatchChkbox                 : "+actRFIDBatchChkbox               +" Value Expected : "+expRFIDBatchChkbox);
		System.out.println("RFIDRMAChkbox                   : "+actRFIDRMAChkbox                 +" Value Expected : "+expRFIDRMAChkbox);
		
		
		boolean actMethod=actRFIDProductIDChkbox==expRFIDProductIDChkbox 
				&& actRFIDQuantityChkbox==expRFIDQuantityChkbox	
				&& actRFIDAlternativeQTYChkbox==expRFIDAlternativeQTYChkbox 
				&& actRFIDUnitsChkbox==expRFIDUnitsChkbox
				&& actRFIDBatchChkbox==expRFIDBatchChkbox
				&& actRFIDRMAChkbox==expRFIDRMAChkbox;
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 144, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 144, 8, actResult);
		
		
		System.out.println("**********************************checkHirePurchase************************************");
		
		System.out.println("actRFIDBtn             : "+actRFIDBtn   +" Value Expected : "+expRFIDBtn);
		System.out.println("Dsipaly Result         : "+actResult+" Value Expected : "+expResult);
		
		if(actRFIDBtn.equalsIgnoreCase(expRFIDBtn) && 
				actResult.equalsIgnoreCase(expResult))
		{
			System.out.println(" Test Pass : Quatations Analysis Option Is Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 142, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Fail :  Quatations Analysis Option Is Not Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 142, 9, resFail);
			 
			return false;
		}
    }
	

    @FindBy(xpath = "//select[@id='CheckForItemsBelowReorder']")
	public static WebElement AI_autoIndentDrpdwn;
    
    @FindBy(xpath = "//select[@id='ExRecurrencePattern']")
	public static WebElement AI_recurrencePatternTimeDrpdwn;
    
    @FindBy(xpath = "//input[@id='ExDaily']")
	public static WebElement AI_DailyTxt;
    
    @FindBy(xpath = "//input[@id='id_starting_date']")
	public static WebElement AI_RangeOfRecurrenceStartingDate;
    
    @FindBy(xpath = "//input[@id='HRecStartTime']")
	public static WebElement AI_RangeOfRecurrenceStartTime;
    
    @FindBy(xpath = "//select[@id='RangeOfRecurrence']")
	public static WebElement AI_RangeOfRecurenceDrpDwn;
    
    @FindBy(xpath = "//input[@id='txtEndAfter']")
	public static WebElement AI_RangeOfRecurrenceEndTxt;
    
    @FindBy(xpath = "//input[@id='CutOffTimeForIndenTautoApproval']")
	public static WebElement AI_CutOFFTimeTxt;
    
    @FindBy(xpath = "//input[@id='IgnoreItemBalanceWhileRaising']")
	public static WebElement AI_IgnoreItemBalanceWhileRaisingChkBox;
    
    @FindBy(xpath = "//input[@id='RaiseAutoIndentForInventoryTag0']")
	public static WebElement AI_wareHouseDrpdwn;
    
    @FindBy(xpath = "//input[@id='SendAlertOnceIndentIsRaised']")
	public static WebElement AI_SendAlertOnceIndentIsRaisedChkbox;
    
    
    
    public boolean checkAutoIndent() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(AutoIndentBtn));
		
		boolean AutoIndent   =AutoIndentBtn.isDisplayed();
		
		String actAutoIndentBtn=Boolean.toString(AutoIndent);
		String expAutoIndentBtn   =excelReader.getCellData(xlSheetName, 146, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 146, 8, actAutoIndentBtn);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AutoIndentBtn));
		AutoIndentBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AI_autoIndentDrpdwn));
		AI_autoIndentDrpdwn.click();
		
		AI_autoIndentDrpdwn.sendKeys(Keys.ARROW_DOWN);
		
		AI_autoIndentDrpdwn.sendKeys(Keys.TAB);
				
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AI_recurrencePatternTimeDrpdwn));
		
		boolean actAI_recurrencePatternDrpdwn                = AI_recurrencePatternTimeDrpdwn.isDisplayed();
		boolean actAI_DailyTxt                 = AI_DailyTxt.isDisplayed();
		boolean actAI_RangeOfRecurrenceStartingDate           = AI_RangeOfRecurrenceStartingDate.isDisplayed();
		boolean actAI_RangeOfRecurrenceStartTime                    = AI_RangeOfRecurrenceStartTime.isDisplayed();
		boolean actAI_RangeOfRecurenceDrpDwn  			      = AI_RangeOfRecurenceDrpDwn.isDisplayed();
		boolean actAI_RangeOfRecurrenceEndTxt                      = AI_RangeOfRecurrenceEndTxt.isDisplayed();
		boolean actAI_CutOFFTimeTxt           = AI_CutOFFTimeTxt.isDisplayed();
		boolean actAI_IgnoreItemBalanceWhileRaisingChkBox                    = AI_IgnoreItemBalanceWhileRaisingChkBox.isDisplayed();
		boolean actAI_wareHouseDrpdwn 			      = AI_wareHouseDrpdwn.isDisplayed();
		boolean actAI_SendAlertOnceIndentIsRaisedChkbox                      = AI_SendAlertOnceIndentIsRaisedChkbox.isDisplayed();
		
		
		boolean expAI_recurrencePatternDrpdwn                = true;
		boolean expAI_DailyTxt                 = true;
		boolean expAI_RangeOfRecurrenceStartingDate           = true;
		boolean expAI_RangeOfRecurrenceStartTime                    = true;
		boolean expAI_RangeOfRecurenceDrpDwn                    = true;
		boolean expAI_RangeOfRecurrenceEndTxt                      = true;
		boolean expAI_CutOFFTimeTxt           = true;
		boolean expAI_IgnoreItemBalanceWhileRaisingChkBox                    = true;
		boolean expAI_wareHouseDrpdwn                    = true;
		boolean expAI_SendAlertOnceIndentIsRaisedChkbox                      = true;
		
		System.out.println("******************************checkAutoIndent****************************");
		
		System.out.println("AI_recurrencePatternDrpdwn      : "+actAI_recurrencePatternDrpdwn           +" Value Expected : "+expAI_recurrencePatternDrpdwn);
		System.out.println("AI_DailyTxt                     : "+actAI_DailyTxt            +" Value Expected : "+expAI_DailyTxt);
		System.out.println("AI_RangeOfRecurrenceStartingDate        : "+actAI_RangeOfRecurrenceStartingDate      +" Value Expected : "+expAI_RangeOfRecurrenceStartingDate);
		System.out.println("AI_RangeOfRecurrenceStartTime                 : "+actAI_RangeOfRecurrenceStartTime               +" Value Expected : "+expAI_RangeOfRecurrenceStartTime);
		System.out.println("AI_RangeOfRecurenceDrpDwn                 : "+actAI_RangeOfRecurenceDrpDwn               +" Value Expected : "+expAI_RangeOfRecurenceDrpDwn);
		System.out.println("AI_RangeOfRecurrenceEndTxt                   : "+actAI_RangeOfRecurrenceEndTxt                 +" Value Expected : "+expAI_RangeOfRecurrenceEndTxt);
		System.out.println("AI_CutOFFTimeTxt        : "+actAI_CutOFFTimeTxt      +" Value Expected : "+expAI_CutOFFTimeTxt);
		System.out.println("AI_IgnoreItemBalanceWhileRaisingChkBox                 : "+actAI_IgnoreItemBalanceWhileRaisingChkBox               +" Value Expected : "+expAI_IgnoreItemBalanceWhileRaisingChkBox);
		System.out.println("AI_wareHouseDrpdwn                 : "+actAI_wareHouseDrpdwn               +" Value Expected : "+expAI_wareHouseDrpdwn);
		System.out.println("AI_SendAlertOnceIndentIsRaisedChkbox                   : "+actAI_SendAlertOnceIndentIsRaisedChkbox                 +" Value Expected : "+expAI_SendAlertOnceIndentIsRaisedChkbox);
		
		
		boolean actMethod=actAI_recurrencePatternDrpdwn==expAI_recurrencePatternDrpdwn 
				&& actAI_DailyTxt==expAI_DailyTxt	
				&& actAI_RangeOfRecurrenceStartingDate==expAI_RangeOfRecurrenceStartingDate 
				&& actAI_RangeOfRecurrenceStartTime==expAI_RangeOfRecurrenceStartTime
				&& actAI_RangeOfRecurenceDrpDwn==expAI_RangeOfRecurenceDrpDwn
				&& actAI_RangeOfRecurrenceEndTxt==expAI_RangeOfRecurrenceEndTxt
				&& actAI_CutOFFTimeTxt==expAI_CutOFFTimeTxt 
				&& actAI_IgnoreItemBalanceWhileRaisingChkBox==expAI_IgnoreItemBalanceWhileRaisingChkBox
				&& actAI_wareHouseDrpdwn==expAI_wareHouseDrpdwn
				&& actAI_RangeOfRecurrenceEndTxt==expAI_RangeOfRecurrenceEndTxt;
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 147, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 147, 8, actResult);
		
		
		System.out.println("**********************************checkHirePurchase************************************");
		
		System.out.println("AutoIndentBtn             : "+actAutoIndentBtn   +" Value Expected : "+expAutoIndentBtn);
		System.out.println("Dsipaly Result            : "+actResult+" Value Expected : "+expResult);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AI_autoIndentDrpdwn));
		AI_autoIndentDrpdwn.click();
		
		AI_autoIndentDrpdwn.sendKeys(Keys.ARROW_UP);
		
		AI_autoIndentDrpdwn.sendKeys(Keys.ARROW_UP);
		
		AI_autoIndentDrpdwn.sendKeys(Keys.TAB);
		
		
		if(actAutoIndentBtn.equalsIgnoreCase(expAutoIndentBtn) && 
				actResult.equalsIgnoreCase(expResult))
		{
			System.out.println(" Test Pass : Quatations Analysis Option Is Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 145, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Fail :  Quatations Analysis Option Is Not Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 145, 9, resFail);
			 
			return false;
		}
    }
	
    
    
    @FindBy(xpath = "//input[@id='ProductClassification_0']")
	public static WebElement ABC_withoutitemClassificationRadioBtn;
    
    @FindBy(xpath = "//input[@id='ProductClassification_1']")
   	public static WebElement ABC_byItemClassification;

    
	public boolean checkABCAnalysis() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ABCAnalysisBtn));
		
		boolean ABCAnalysis   =ABCAnalysisBtn.isDisplayed();
		
		String actABCAnalysisBtn=Boolean.toString(ABCAnalysis);
		String expABCAnalysisBtn   =excelReader.getCellData(xlSheetName, 149, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 149, 8, actABCAnalysisBtn);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ABCAnalysisBtn));
		ABCAnalysisBtn.click();
		
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ABC_withoutitemClassificationRadioBtn));
		
		boolean actABC_withoutitemClassificationRadioBtn    = ABC_withoutitemClassificationRadioBtn.isDisplayed();
		boolean actABC_byItemClassification                 = ABC_byItemClassification.isDisplayed();
		
		
		boolean expABC_withoutitemClassificationRadioBtn       = true;
		boolean expABC_byItemClassification                    = true;
		
		
		boolean actMethod=actABC_withoutitemClassificationRadioBtn==expABC_withoutitemClassificationRadioBtn 
				&& actABC_byItemClassification==expABC_byItemClassification;
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 150, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 150, 8, actResult);
		
		
		System.out.println("**********************************checkABCAnalysis************************************");
		
		System.out.println("ABCAnalysisBtn            : "+actABCAnalysisBtn   +" Value Expected : "+expABCAnalysisBtn);
		System.out.println("Dsipaly Result            : "+actResult+" Value Expected : "+expResult);
		System.out.println("ABC_withoutitemClassificationRadioBtn      : "+actABC_withoutitemClassificationRadioBtn           +" Value Expected : "+expABC_withoutitemClassificationRadioBtn);
		System.out.println("ABC_byItemClassification                   : "+actABC_byItemClassification            +" Value Expected : "+expABC_byItemClassification);
		
		if(actABCAnalysisBtn.equalsIgnoreCase(expABCAnalysisBtn) && 
				actResult.equalsIgnoreCase(expResult))
		{
			System.out.println(" Test Pass : ABC Analysis Option Is Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 148, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Fail :  ABC Analysis Option Is Not Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 148, 9, resFail);
			 
			return false;
		}
    }
		
    
    
	@FindBy(xpath = "//input[@id='PrintDarkLinesInGrid']")
	public static WebElement reportsPrintDarkLineinGridChkbox;

	@FindBy(xpath = "//input[@id='PrintLineSeparator']")
	public static WebElement reportsPrintLineSeperatorChkbox;

	@FindBy(xpath = "//input[@id='PrintZeroValueAsNumeric']")
	public static WebElement printZeroValueChkbox;

	@FindBy(xpath = "//input[@id='VerticalLinesInPrint']")
	public static WebElement reportsVerticalLinePrintsChkbox;

	@FindBy(xpath = "//input[@id='PageTotalsInAllReports']")
	public static WebElement reportsPageTotalsInAllReportsChkbox;

	@FindBy(xpath = "//input[@id='DontShowHeaderFooterLine']")
	public static WebElement reportsDontShowHeaderFooterLineChkbox;

	@FindBy(xpath = "//input[@id='InsertBlankLineForTheGroup']")
	public static WebElement reportsInsertBlankLineForTheGroupChkbox;

	@FindBy(xpath = "//select[@id='PrintBooleanAs']")
	public static WebElement reportsPrintBooleanAsDrpdwn;

	@FindBy(xpath = "//input[@id='CSVExportCharacter']")
	public static WebElement reportsCSVExportCharacterTxt;

	@FindBy(xpath = "//input[@id='LineSpacingSettings_0']")
	public static WebElement reportsNormalRadioBtn;

	@FindBy(xpath = "//input[@id='LineSpacingSettings_1']")
	public static WebElement reportsOneandHalfnormalRadioBtn;

	@FindBy(xpath = "//input[@id='LineSpacingSettings_2']")
	public static WebElement reportsDoubleRadioBtn;

	@FindBy(xpath = "//input[@id='UseDefaultHeaderForStandardReports']")
	public static WebElement reportsUseDefaultHeaderForStandardReportsChkbox;

	@FindBy(xpath = "//td[@id='Originalduplicate_col_1-1']")
	public static WebElement reportsOrginalDuplicateGridRow1;

	@FindBy(xpath = "//input[@id='Rowlimit']")
	public static WebElement reportsRowLImitTXT;

	@FindBy(xpath = "//input[@id='DataForNoofDays']")
	public static WebElement reportsDataForNoofDaysTxt;

	@FindBy(xpath = "//input[@id='DoNotFetchOnLoad']")
	public static WebElement reportsDoNotFetchOnLoadChkbox;

	@FindBy(xpath = "//td[@id='FinanceAgeingslab_col_1-1']")
	public static WebElement reportsFinanceAgeingslabGridRow1;

	@FindBy(xpath = "//td[@id='InventoryAgeingslab_col_1-1']")
	public static WebElement reportsInventoryAgeingslabGridRow1;

	@FindBy(xpath = "//input[@id='PickPrintLayoutFrom_0']")
	public static WebElement reportsNeverRadioBtn;

	@FindBy(xpath = "//input[@id='PickPrintLayoutFrom_1']")
	public static WebElement reportsAccountRadioBtn;

	@FindBy(xpath = "//input[@id='PickPrintLayoutFrom_2']")
	public static WebElement reportsFromTagRadioBtn;

	@FindBy(xpath = "//input[@id='DonotApplySecurityRestriction']")
	public static WebElement reportsDonotApplySecurityRestrictionChkbox;

	@FindBy(xpath = "//input[@id='pdfPassword']")
	public static WebElement reportsPAsswordEmailAttachemntTxt;

	@FindBy(xpath = "//input[@id='donotUseRelatimeValuationInReport']")
	public static WebElement reportsdonotUseRelatimeValuationInReportChkbox;

	@FindBy(xpath = "//input[@id='doNotOpenPrintFileInBrowser']")
	public static WebElement reportsdoNotOpenPrintFileInBrowserChkbox;

	
	
	
	
	
	

	 public boolean checkReportsOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
		System.out.println("********************* checkReportsOption Method Executes.............   *****************************");
		
		try
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ABCAnalysisBtn));
			
			boolean Report   =ReportBtn.isDisplayed();
			
			String actReportBtn=Boolean.toString(Report);
			String expReportBtn   =excelReader.getCellData(xlSheetName, 152, 7);
		    
		    excelReader.setCellData(xlfile, xlSheetName, 152, 8, actReportBtn);
					
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ReportBtn));
			ReportBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsPrintDarkLineinGridChkbox));
		
			boolean actreportsPrintDarkLineinGridChkbox                = reportsPrintDarkLineinGridChkbox.isDisplayed();
			boolean actreportsPrintLineSeperatorChkbox                 = reportsPrintLineSeperatorChkbox.isDisplayed();
			boolean actprintZeroValueChkbox                            = printZeroValueChkbox.isDisplayed(); 
			boolean actreportsVerticalLinePrintsChkbox                 = reportsVerticalLinePrintsChkbox.isDisplayed(); 
			boolean actreportsPageTotalsInAllReportsChkbox             = reportsPageTotalsInAllReportsChkbox.isDisplayed(); 
			boolean actreportsDontShowHeaderFooterLineChkbox           = reportsDontShowHeaderFooterLineChkbox.isDisplayed();
			boolean actreportsInsertBlankLineForTheGroupChkbox         = reportsInsertBlankLineForTheGroupChkbox.isDisplayed();
			boolean actreportsPrintBooleanAsDrpdwn                     = reportsPrintBooleanAsDrpdwn.isDisplayed();
			boolean actreportsCSVExportCharacterTxt                    = reportsCSVExportCharacterTxt.isDisplayed();    
			boolean actreportsNormalRadioBtn                           = reportsNormalRadioBtn.isDisplayed(); 
			boolean actreportsOneandHalfnormalRadioBtn                 = reportsOneandHalfnormalRadioBtn.isDisplayed();
			boolean actreportsDoubleRadioBtn                           = reportsDoubleRadioBtn.isDisplayed(); 
			boolean actreportsUseDefaultHeaderChkbox                   = reportsUseDefaultHeaderForStandardReportsChkbox.isDisplayed(); 
			boolean actreportsNeverRadioBtn                            = reportsNeverRadioBtn.isDisplayed(); 
			boolean actreportsAccountRadioBtn                          = reportsAccountRadioBtn.isDisplayed(); 
			boolean actreportsFromTagRadioBtn                          = reportsFromTagRadioBtn.isDisplayed(); 
			boolean actreportsDonotApplySecurityRestriChkbox           = reportsDonotApplySecurityRestrictionChkbox.isDisplayed();	
			boolean actreportsPAsswordEmailAttachemntTxt               = reportsPAsswordEmailAttachemntTxt.isDisplayed();  
			boolean actreportsdonotUseRelValuaChkbox                   = reportsdonotUseRelatimeValuationInReportChkbox.isDisplayed();       
			boolean actreportsdoNotOpenPrintFileInBrowserChkbox        = reportsdoNotOpenPrintFileInBrowserChkbox.isDisplayed();  
			boolean actreportsOrginalDuplicateGridRow1                 = reportsOrginalDuplicateGridRow1.isDisplayed();  
			boolean actreportsRowLImitTXT                              = reportsRowLImitTXT.isDisplayed();  
			boolean actreportsDataForNoofDaysTxt                       = reportsDataForNoofDaysTxt.isDisplayed(); 
			boolean actreportsDoNotFetchOnLoadChkbox                   = reportsDoNotFetchOnLoadChkbox.isDisplayed(); 
			boolean actreportsFinanceAgeingslabGridRow1                = reportsFinanceAgeingslabGridRow1.isDisplayed(); 
			boolean actreportsInventoryAgeingslabGridRow1              = reportsInventoryAgeingslabGridRow1.isDisplayed(); 
				
			boolean expreportsPrintDarkLineinGridChkbox                = true;
			boolean expreportsPrintLineSeperatorChkbox                 = true;
			boolean expprintZeroValueChkbox                            = true; 
			boolean expreportsVerticalLinePrintsChkbox                 = true;  
			boolean expreportsPageTotalsInAllReportsChkbox             = true;  
			boolean expreportsDontShowHeaderFooterLineChkbox           = true; 
			boolean expreportsInsertBlankLineForTheGroupChkbox         = true; 
			boolean expreportsPrintBooleanAsDrpdwn                     = true; 
			boolean expreportsCSVExportCharacter                       = true;     
			boolean expreportsNormalRadioBtn                           = true;  
			boolean expreportsOneandHalfnormalRadioBtn                 = true; 
			boolean expreportsDoubleRadioBtn                           = true;  
			boolean expreportsUseDefaultHeaderChkbox                   = true;  
			boolean expreportsNeverRadioBtn                    		   = true;  
			boolean expreportsAccountRadioBtn                          = true;  
			boolean expreportsFromTagRadioBtn                          = true;  
			boolean expreportsDonotApplySecurityRestriChkbox           = true; 	
			boolean expreportsPAsswordEmailAttachemntTxt               = true;   
			boolean expreportsdonotUseRelValuaChkbox                   = true;        
			boolean expreportsdoNotOpenPrintFileInBrowserChkbox        = true;   
			boolean expreportsOrginalDuplicateGridRow1                 = true;   
			boolean expreportsRowLImitTXT                              = true;   
			boolean expreportsDataForNoofDaysTxt                       = true;   
			boolean expreportsDoNotFetchOnLoadChkbox                   = true;  
			boolean expreportsFinanceAgeingslabGridRow1                = true;  
			boolean expreportsInventoryAgeingslabGridRow1              = true;  
			
		    System.out.println("reportsPrintDarkLineinGridChkbox         : " + actreportsPrintDarkLineinGridChkbox        +" Value Expected : " + expreportsPrintDarkLineinGridChkbox);
	        System.out.println("reportsPrintLineSeperatorChkbox          : " + actreportsPrintLineSeperatorChkbox         +" Value Expected : " + expreportsPrintLineSeperatorChkbox);
	        System.out.println("printZeroValueChkbox                     : " + actprintZeroValueChkbox                    +" Value Expected : " + expprintZeroValueChkbox);
	        System.out.println("reportsVerticalLinePrintsChkbox          : " + actreportsVerticalLinePrintsChkbox         +" Value Expected : " + expreportsVerticalLinePrintsChkbox);
	        System.out.println("reportsPageTotalsInAllReportsChkbox      : " + actreportsPageTotalsInAllReportsChkbox     +" Value Expected : " + expreportsPageTotalsInAllReportsChkbox);
	        System.out.println("reportsDontShowHeaderFooterLineChkbox    : " + actreportsDontShowHeaderFooterLineChkbox   +" Value Expected : " + expreportsDontShowHeaderFooterLineChkbox);
	        System.out.println("reportsInsertBlankLineForTheGroupChkbox  : " + actreportsInsertBlankLineForTheGroupChkbox +" Value Expected : " + expreportsInsertBlankLineForTheGroupChkbox);
	        System.out.println("reportsPrintBooleanAsDrpdwn              : " + actreportsPrintBooleanAsDrpdwn             +" Value Expected : " + expreportsPrintBooleanAsDrpdwn);
	        System.out.println("reportsCSVExportCharacterTxt             : " + actreportsCSVExportCharacterTxt 			  +" Value Expected : " + expreportsCSVExportCharacter);
	        System.out.println("reportsNormalRadioBtn                    : " + actreportsNormalRadioBtn                   +" Value Expected : " + expreportsNormalRadioBtn);
	        System.out.println("reportsOneandHalfnormalRadioBtn          : " + actreportsOneandHalfnormalRadioBtn         +" Value Expected : " + expreportsOneandHalfnormalRadioBtn);
	        System.out.println("reportsDoubleRadioBtn                    : " + actreportsDoubleRadioBtn                   +" Value Expected : " + expreportsDoubleRadioBtn);
	        System.out.println("reportsUseDefaultHeaderChkbox            : " + actreportsUseDefaultHeaderChkbox           +" Value Expected : " + expreportsUseDefaultHeaderChkbox);
	        System.out.println("reportsNeverRadioBtn                     : " + actreportsNeverRadioBtn                    +" Value Expected : " + expreportsNeverRadioBtn);
	        System.out.println("reportsAccountRadioBtn                   : " + actreportsAccountRadioBtn                  +" Value Expected : " + expreportsAccountRadioBtn);
	        System.out.println("reportsFromTagRadioBtn                   : " + actreportsFromTagRadioBtn                  +" Value Expected : " + expreportsFromTagRadioBtn);
	        System.out.println("reportsDonotApplySecurityRestriChkbox    : " + actreportsDonotApplySecurityRestriChkbox   +" Value Expected : " + expreportsDonotApplySecurityRestriChkbox);
	        System.out.println("reportsPAsswordEmailAttachemntTxt        : " + actreportsPAsswordEmailAttachemntTxt       +" Value Expected : " + expreportsPAsswordEmailAttachemntTxt);
	        System.out.println("reportsdonotUseRelValuaChkbox            : " + actreportsdonotUseRelValuaChkbox           +" Value Expected : " + expreportsdonotUseRelValuaChkbox);
	        System.out.println("reportsdoNotOpenPrintFileInBrowserChkbox : " + actreportsdoNotOpenPrintFileInBrowserChkbox+" Value Expected : " + expreportsdoNotOpenPrintFileInBrowserChkbox);
	        System.out.println("reportsOrginalDuplicateGridRow1          : " + actreportsOrginalDuplicateGridRow1         +" Value Expected : " + expreportsOrginalDuplicateGridRow1);
	        System.out.println("reportsRowLImitTXT                       : " + actreportsRowLImitTXT                      +" Value Expected : " + expreportsRowLImitTXT);
	        System.out.println("reportsDataForNoofDaysTxt                : " + actreportsDataForNoofDaysTxt               +" Value Expected : " + expreportsDataForNoofDaysTxt);
	        System.out.println("reportsDoNotFetchOnLoadChkbox            : " + actreportsDoNotFetchOnLoadChkbox           +" Value Expected : " + expreportsDoNotFetchOnLoadChkbox);
	        System.out.println("reportsFinanceAgeingslabGridRow1         : " + actreportsFinanceAgeingslabGridRow1        +" Value Expected : " + expreportsFinanceAgeingslabGridRow1);
	        System.out.println("reportsInventoryAgeingslabGridRow1       : " + actreportsInventoryAgeingslabGridRow1      +" Value Expected : " + expreportsInventoryAgeingslabGridRow1);
	                
	        
	        boolean displayResult=actreportsPrintDarkLineinGridChkbox==expreportsPrintDarkLineinGridChkbox
	        		&& actreportsPrintLineSeperatorChkbox==expreportsPrintLineSeperatorChkbox
									&& actprintZeroValueChkbox==expprintZeroValueChkbox
									&& actreportsVerticalLinePrintsChkbox==expreportsVerticalLinePrintsChkbox
									&& actreportsPageTotalsInAllReportsChkbox==expreportsPageTotalsInAllReportsChkbox
									&& actreportsDontShowHeaderFooterLineChkbox==expreportsDontShowHeaderFooterLineChkbox
									&& actreportsInsertBlankLineForTheGroupChkbox==expreportsInsertBlankLineForTheGroupChkbox
									&& actreportsPrintBooleanAsDrpdwn==expreportsPrintBooleanAsDrpdwn
									&& actreportsCSVExportCharacterTxt==expreportsCSVExportCharacter
									&& actreportsNormalRadioBtn==expreportsNormalRadioBtn
									&& actreportsOneandHalfnormalRadioBtn==expreportsOneandHalfnormalRadioBtn
									&& actreportsDoubleRadioBtn==expreportsDoubleRadioBtn
									&& actreportsUseDefaultHeaderChkbox==expreportsUseDefaultHeaderChkbox
									&& actreportsNeverRadioBtn==expreportsNeverRadioBtn
									&& actreportsAccountRadioBtn==expreportsAccountRadioBtn 
									&& actreportsFromTagRadioBtn==expreportsFromTagRadioBtn
									&& actreportsDonotApplySecurityRestriChkbox==expreportsDonotApplySecurityRestriChkbox
									&& actreportsPAsswordEmailAttachemntTxt==expreportsPAsswordEmailAttachemntTxt
									&& actreportsdonotUseRelValuaChkbox==expreportsdonotUseRelValuaChkbox
									&& actreportsdoNotOpenPrintFileInBrowserChkbox==expreportsdoNotOpenPrintFileInBrowserChkbox
									&& actreportsOrginalDuplicateGridRow1==expreportsOrginalDuplicateGridRow1
					                && actreportsRowLImitTXT==expreportsRowLImitTXT 
					                && actreportsDataForNoofDaysTxt==expreportsDataForNoofDaysTxt
					                && actreportsDoNotFetchOnLoadChkbox==expreportsDoNotFetchOnLoadChkbox
					                && actreportsFinanceAgeingslabGridRow1==expreportsFinanceAgeingslabGridRow1
					                && actreportsInventoryAgeingslabGridRow1==expreportsInventoryAgeingslabGridRow1;
					              
	        
	        String actDisplayResult=Boolean.toString(displayResult);
	        String expDisplayResult=excelReader.getCellData(xlSheetName, 153, 7);
	        
	        excelReader.setCellData(xlfile, xlSheetName, 153, 8, actDisplayResult);
	        
			if (actDisplayResult.equalsIgnoreCase(expDisplayResult) && 
					actReportBtn.equalsIgnoreCase(expReportBtn))
					
			{	
				System.out.println("Test Pass : VerifyReportsOptions Elements Are Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 151, 9, resPass);
				return true;
			} 	
			else 
			{
				System.out.println("Test Fail :VerifyreportsOptions Elements Are Not Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 151, 9, resFail);
				return false;
			}
		}
		
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 151, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	
	
    
	 @FindBy(xpath = "//input[@id='FTPServer']")
	 public static WebElement internetFTPServerTxt;

	 @FindBy(xpath = "//input[@id='FTPLogin']")
	 public static WebElement internetFTPLoginIDTxt;

	 @FindBy(xpath = "//input[@id='FTPPassword']")
	 public static WebElement internetFTPPasswordTXT;

	 @FindBy(xpath = "//input[@id='SMSURL']")
	 public static WebElement internetFTPSMSURLTXT;

    
    
	 public boolean checkInterentOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
		System.out.println("********************* checkInterentOption Method Executes.............   *****************************");
		
		try
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(ABCAnalysisBtn));
			
			boolean Internet   =InternetBtn.isDisplayed();
			
			String actInternetBtn=Boolean.toString(Internet);
			String expInternetBtn   =excelReader.getCellData(xlSheetName, 155, 7);
		    
		    excelReader.setCellData(xlfile, xlSheetName, 155, 8, actInternetBtn);
					
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InternetBtn));
			InternetBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(internetFTPServerTxt));
		
			boolean actinternetFTPServerTxt                = internetFTPServerTxt.isDisplayed();
			boolean actinternetFTPLoginIDTxt               = internetFTPLoginIDTxt.isDisplayed();
			boolean actinternetFTPPasswordTXT              = internetFTPPasswordTXT.isDisplayed(); 
			boolean actinternetFTPSMSURLTXT                = internetFTPSMSURLTXT.isDisplayed(); 
			
			boolean expinternetFTPServerTxt                = true;
			boolean expinternetFTPLoginIDTxt               = true;
			boolean expinternetFTPPasswordTXT              = true; 
			boolean expinternetFTPSMSURLTXT                = true;  
			     
			
		    System.out.println("internetFTPServerTxt       : " + actinternetFTPServerTxt      +" Value Expected : " + expinternetFTPServerTxt);
	        System.out.println("internetFTPLoginIDTxt      : " + actinternetFTPLoginIDTxt     +" Value Expected : " + expinternetFTPLoginIDTxt);
	        System.out.println("internetFTPPasswordTXT     : " + actinternetFTPPasswordTXT    +" Value Expected : " + expinternetFTPPasswordTXT);
	        System.out.println("internetFTPSMSURLTXT       : " + actinternetFTPSMSURLTXT      +" Value Expected : " + expinternetFTPSMSURLTXT);
	       
	        
	        boolean displayResult=actinternetFTPServerTxt==expinternetFTPServerTxt
	        		&& actinternetFTPLoginIDTxt==expinternetFTPLoginIDTxt
									&& actinternetFTPPasswordTXT==expinternetFTPPasswordTXT
									&& actinternetFTPSMSURLTXT==expinternetFTPSMSURLTXT;
											              
	        
	        String actDisplayResult=Boolean.toString(displayResult);
	        String expDisplayResult=excelReader.getCellData(xlSheetName, 156, 7);
	        
	        excelReader.setCellData(xlfile, xlSheetName, 156, 8, actDisplayResult);
	        
			if (actDisplayResult.equalsIgnoreCase(expDisplayResult) && 
					actInternetBtn.equalsIgnoreCase(expInternetBtn))
					
			{	
				System.out.println("Test Pass : VerifyReportsOptions Elements Are Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 154, 9, resPass);
				return true;
			} 	
			else 
			{
				System.out.println("Test Fail :VerifyreportsOptions Elements Are Not Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 154, 9, resFail);
				return false;
			}
		}
		
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 154, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	 
	 
    
	
	public boolean checkMailSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(MailSettingsBtn));
		
		boolean MailSetting   =MailSettingsBtn.isDisplayed();
		
		String actMailSettingsBtn=Boolean.toString(MailSetting);
		
		
		String expMailSettingsBtn   =excelReader.getCellData(xlSheetName, 158, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 158, 8, actMailSettingsBtn);
				
		
		System.out.println("**********************************checkMailSettings************************************");
		
		System.out.println("MailSettingsBtn    : "+actMailSettingsBtn+" Value Expected : "+expMailSettingsBtn);
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MailSettingsBtn));
		MailSettingsBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(SMTPSettingsDropdown));
		
		
		boolean actSMTPSettingsDropdown                     =SMTPSettingsDropdown.isDisplayed();
		boolean actSMTPAddressTxt                           =SMTPAddressTxt.isDisplayed();
		boolean actOutgoingPortNoTxt                        =OutgoingPortNoTxt.isDisplayed();
		boolean actAuthenticationTypeDropdown               =AuthenticationTypeDropdown.isDisplayed();
		boolean actUserSecureConnectionChkBox               =UserSecureConnectionChkBox.isDisplayed();
		boolean actSecurePasswordAutenticationChkBox        =SecurePasswordAutenticationChkBox.isDisplayed();
		boolean actFullEmailIdChkBox                        =FullEmailIdChkBox.isDisplayed();
		boolean actMailServerRequiresAuthenticationChkBox   =MailServerRequiresAuthenticationChkBox.isDisplayed();
		boolean actEmailIdTxt                               =EmailIdTxt.isDisplayed();
		boolean actPasswordTxt                              =PasswordTxt.isDisplayed();
		
		boolean expSMTPSettingsDropdown                     =true;
		boolean expSMTPAddressTxt                           =true;
		boolean expOutgoingPortNoTxt                        =true;
		boolean expAuthenticationTypeDropdown               =true;
		boolean expUserSecureConnectionChkBox               =true;
		boolean expSecurePasswordAutenticationChkBox        =true;
		boolean expFullEmailIdChkBox                        =true;
		boolean expMailServerRequiresAuthenticationChkBox   =true;
		boolean expEmailIdTxt                               =true;
		boolean expPasswordTxt                              =true;
		
		System.out.println("***********************************checkSMTPSettingsOptions****************************");
		
		System.out.println("SMTPSettingsDropdown                    : "+actSMTPSettingsDropdown                    +" Value Expected : "+expSMTPSettingsDropdown);
		System.out.println("SMTPAddressTxt                          : "+actSMTPAddressTxt                          +" Value Expected : "+expSMTPAddressTxt);
		System.out.println("OutgoingPortNoTxt                       : "+actOutgoingPortNoTxt                       +" Value Expected : "+expOutgoingPortNoTxt);
		System.out.println("AuthenticationTypeDropdown              : "+actAuthenticationTypeDropdown              +" Value Expected : "+expAuthenticationTypeDropdown);
		System.out.println("UserSecureConnectionChkBox              : "+actUserSecureConnectionChkBox              +" Value Expected : "+expUserSecureConnectionChkBox);
		System.out.println("SecurePasswordAutenticationChkBox       : "+actSecurePasswordAutenticationChkBox       +" Value Expected : "+expSecurePasswordAutenticationChkBox);
		System.out.println("FullEmailIdChkBox                       : "+actFullEmailIdChkBox                       +" Value Expected : "+expFullEmailIdChkBox);
		System.out.println("MailServerRequiresAuthenticationChkBox  : "+actMailServerRequiresAuthenticationChkBox  +" Value Expected : "+expMailServerRequiresAuthenticationChkBox);
		System.out.println("EmailIdTxt                              : "+actEmailIdTxt                              +" Value Expected : "+expEmailIdTxt);
		System.out.println("PasswordTxt                             : "+actPasswordTxt                             +" Value Expected : "+expPasswordTxt);
		
		
		
		boolean actMethod=actSMTPSettingsDropdown==expSMTPSettingsDropdown && actSMTPAddressTxt==expSMTPAddressTxt && actOutgoingPortNoTxt==expOutgoingPortNoTxt
				&& actAuthenticationTypeDropdown==expAuthenticationTypeDropdown && actUserSecureConnectionChkBox==expUserSecureConnectionChkBox 
				&& actSecurePasswordAutenticationChkBox==expSecurePasswordAutenticationChkBox && actFullEmailIdChkBox==expFullEmailIdChkBox
				&& actMailServerRequiresAuthenticationChkBox==expMailServerRequiresAuthenticationChkBox && actEmailIdTxt==expEmailIdTxt
				&& actPasswordTxt==expPasswordTxt;
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 159, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 159, 8, actResult);
		
		
		if(actResult.equalsIgnoreCase(expResult) && actMailSettingsBtn.equalsIgnoreCase(expMailSettingsBtn))
		{
			System.out.println(" Test Pas : SMTPSettingsOption and Other MailSettingsOptions Are Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 157, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pas :SMTPSettingsOptio nand Othe rMailSettingsOptions Are Not Displayed");
			 excelReader.setCellData(xlfile, xlSheetName, 157, 9, resFail);
			return false;
		}
		
	}
		

	
	public boolean checkUserSecureConnection() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UserSecureConnectionChkBox));
		UserSecureConnectionChkBox.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(NeverRadio));
		
		boolean actNeverRadio  =NeverRadio.isDisplayed();
		boolean actTLSRadio    =TLSRadio.isDisplayed();
		boolean actSSLRadio    =SSLRadio.isDisplayed();
		boolean actSSLPortTxt  =SSLPortTxt.isDisplayed();
		
		boolean expNeverRadio  =true;
		boolean expTLSRadio    =true;
		boolean expSSLRadio    =true;
		boolean expSSLPortTxt  =true;
		
		System.out.println("******************************checkUserSecureConnection**************************");
		
		System.out.println("NeverRadio   : "+actNeverRadio  +" Value Expected : "+expNeverRadio);
		System.out.println("TLSRadio     : "+actTLSRadio    +" Value Expected : "+expTLSRadio);
		System.out.println("SSLRadio     : "+actSSLRadio    +" Value Expected : "+expSSLRadio);
		System.out.println("SSLPortTxt   : "+actSSLPortTxt  +" Value Expected : "+expSSLPortTxt);
			
		
		boolean actMethod=actNeverRadio==expNeverRadio && actTLSRadio==expTLSRadio && actSSLRadio==expSSLRadio && actSSLPortTxt==expSSLPortTxt;
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 161, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 161, 8, actResult);
		
		
		
		if(actResult.equalsIgnoreCase(expResult))
	
		{	
			System.out.println(" Test Pas : SMTPSettingsOption and Other MailSettingsOptions Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 160, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" Test Pas :SMTPSettingsOptio nand Othe rMailSettingsOptions Are Not Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 160, 9, resFail);
			return false;
		}
	}
	
		
	
	
	public boolean checkSMTPsettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SMTPSettingsDropdown));
		SMTPSettingsDropdown.click();
			
		Select s=new Select(SMTPSettingsDropdown);
		int actDropdownCount=s.getOptions().size();
		int expDropdownCount=2;
		
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 163, 6));
		
		String actSelectdata=s.getFirstSelectedOption().getText();
		String expSelectdata=excelReader.getCellData(xlSheetName, 163, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 163, 8, actSelectdata);
		
		
		
		System.out.println("***********************************checkSMTPsettings****************************");
		
		System.out.println("AccountingDropdown Count      : "+actDropdownCount   +" Value Expected : "+expDropdownCount);
		System.out.println("AccountingDropdown Select     : "+actSelectdata      +" Value Expected : "+expSelectdata);
		
		if(actDropdownCount==expDropdownCount && actSelectdata.equalsIgnoreCase(expSelectdata))
		{
			System.out.println(" Test Pass : SMTP Settings Accepting Smtp option As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 162, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println(" Test Pass : SMTP Settings  Not Accepting Smtp option As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 162, 9, resFail);
			return false;
			
		}			
	}
	
	

	
	
	
	public boolean checkSMTPAddress() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SMTPAddressTxt));
		SMTPAddressTxt.click();
		SMTPAddressTxt.clear();
		
		SMTPAddressTxt.sendKeys(excelReader.getCellData(xlSheetName, 165, 6));
		
		String actdata=SMTPAddressTxt.getAttribute("value");
		
        String expdata=excelReader.getCellData(xlSheetName, 165, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 165, 8, actdata);
        
		
		
		System.out.println("***********************************checkSMTPAddress****************************");
		
		System.out.println("SMTPAddressTxt       : "+actdata   +" Value Expected : "+expdata);
		
		
		if(actdata.equalsIgnoreCase(expdata))
		{
			System.out.println(" Test Pass : SMTP Address Accepting Data As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 164, 9, resPass);
			return true;
			
		}else
		{
			System.out.println(" Test Pass : SMTP Address  Not Accepting Data As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 164, 9, resFail);
			return false;
			
		}			
	}
	
		
	
	
	public boolean checkOutgoingPort() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OutgoingPortNoTxt));
		/*OutgoingPortNoTxt.click();
		OutgoingPortNoTxt.clear();
		*/
		String actOutgoingPortNoTxtdata=OutgoingPortNoTxt.getAttribute("value");
		
		String expOutgoingPortNoTxtdata=excelReader.getCellData(xlSheetName, 166, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 166, 8, actOutgoingPortNoTxtdata);
		
		
		System.out.println(expOutgoingPortNoTxtdata);
		
		OutgoingPortNoTxt.clear();
		
		
		OutgoingPortNoTxt.sendKeys(excelReader.getCellData(xlSheetName, 167, 6));
		
		String actOutgoingPortNoTxtdata1=OutgoingPortNoTxt.getAttribute("value");
		String expOutgoingPortNoTxtdata1=excelReader.getCellData(xlSheetName, 167, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 167, 8, actOutgoingPortNoTxtdata1);
		
		
		System.out.println("*******************************checkOutgoingPort**********************************");
		
		System.out.println("OutgoingPortNoTxt data   : "+actOutgoingPortNoTxtdata  +" Value Expected : "+expOutgoingPortNoTxtdata);
		System.out.println("OutgoingPortNoTxt data 1 : "+actOutgoingPortNoTxtdata1 +" Value Expected : "+expOutgoingPortNoTxtdata1);
		
		if(actOutgoingPortNoTxtdata.equalsIgnoreCase(expOutgoingPortNoTxtdata) && actOutgoingPortNoTxtdata1.equalsIgnoreCase(expOutgoingPortNoTxtdata1))
		{
			System.out.println(" Test Pass : OutgoingPort Accepting Data As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 166, 9, resPass);
			return true;
			
		}else
		{
			System.out.println(" Test Pass : OutgoingPort  Not Accepting Data As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 166, 9, resFail);
			return false;
			
		}			
	}
		
		
	
	
	public boolean checkAuthenticationType() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AuthenticationTypeDropdown));
		AuthenticationTypeDropdown.click();
		
		Select s=new Select(AuthenticationTypeDropdown);
		
		int DropdownCount=s.getOptions().size();
		
		String actDropdownCount=Integer.toString(DropdownCount);
		
		String expDropdownCount=excelReader.getCellData(xlSheetName, 168, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 168, 8, actDropdownCount);
		
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 169, 6));
		
		String actSelectdata=s.getFirstSelectedOption().getText();
		String expSelectdata=excelReader.getCellData(xlSheetName, 169, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 169, 8, actSelectdata);
				
		System.out.println("***********************************checkAuthenticationType****************************");
		
		System.out.println("AccountingDropdown Count      : "+actDropdownCount   +" Value Expected : "+expDropdownCount);
		System.out.println("AccountingDropdown Select     : "+actSelectdata      +" Value Expected : "+expSelectdata);
		
		if(actDropdownCount.equalsIgnoreCase(expDropdownCount) && actSelectdata.equalsIgnoreCase(expSelectdata))
		{
			System.out.println("Test Pass : Authentication Type Selected Binary Option");
			excelReader.setCellData(xlfile, xlSheetName, 168, 9, resPass);
			return true;
	    }
		else
		{
			System.out.println("Test Pass : Authentication Type Not Selected Binary Option");
			excelReader.setCellData(xlfile, xlSheetName, 168, 9, resFail);
			return false;
		}
				
	}
		
		

	


	public boolean checkEMail() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EmailIdTxt));
		EmailIdTxt.click();
		
		EmailIdTxt.clear();
		
		EmailIdTxt.sendKeys(excelReader.getCellData(xlSheetName, 171, 6));
		Thread.sleep(2000);
		EmailIdTxt.sendKeys(Keys.TAB);
		
		
		String actdata=EmailIdTxt.getAttribute("value");
		String expdata=excelReader.getCellData(xlSheetName, 171, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 171, 8, actdata);
		
		
		System.out.println("***********************************checkEMail****************************");
		
		System.out.println("EmailIdTxt   : "+actdata+" Value Expected : "+expdata);
		
		if(actdata.equalsIgnoreCase(expdata))
		{
			System.out.println("Test Pass : Email Field Accepting Data");
			excelReader.setCellData(xlfile, xlSheetName, 170, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Pass : Email Field Not Accepting Data");
			excelReader.setCellData(xlfile, xlSheetName, 170, 9, resFail);
			return false;
		}	
	}		
		
		
	
	
	
	
	public boolean checkPassword() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PasswordTxt));
		PasswordTxt.click();
		PasswordTxt.clear();
		
		
		PasswordTxt.sendKeys(excelReader.getCellData(xlSheetName, 173, 6));
		
		String actdata=PasswordTxt.getAttribute("value");
		
		String expdata=excelReader.getCellData(xlSheetName, 173, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 173, 8, actdata);
		
		System.out.println("***********************************checkPassword****************************");
		
		System.out.println("checkPassword   : "+actdata+" Value Expected : "+expdata);
		
		if(actdata.equalsIgnoreCase(expdata))
		{
			System.out.println("Test Pass : Password Field Accepting Data And Changes to Encrypted Form");
			excelReader.setCellData(xlfile, xlSheetName, 172, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Pass : Password Field Not Accepting Data Or Doesnot Changes to Encrypted Form");
			excelReader.setCellData(xlfile, xlSheetName, 172, 9, resFail);
			
			return false;
		}	
	}		
		
	
	
	public boolean checkUpdateButtonInMailSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SSLRadio));
		SSLRadio.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SSLPortTxt));
		SSLPortTxt.sendKeys(excelReader.getCellData(xlSheetName, 175, 6));
		

		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();

		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 176, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 176, 8, actAlertMgs);
		
        getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 177, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		excelReader.setCellData(xlfile, xlSheetName, 177, 8, actMessage);
		
		
		System.out.println("***********************************checkUpdateButtonInBins****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);
		System.out.println("Message          : "+actMessage    +" Value Expected : "+expMessage);
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 174, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 174, 9, resPass);
			return false;
		}
	}



		
	public boolean checkCloseButtonInMailSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
		CustCloseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
		
		boolean actlabelDashboard                  =dashboardName.isDisplayed();
	
		boolean actnewAddDashBoard                 =newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings  =dashboardCustomizationSettings.isDisplayed();
		
		boolean explabelDashboard                  =true;
		
		boolean expnewAddDashBoard                 =true;
		boolean expdashboardCustomizationSettings  =true;
		
		System.out.println("******************************checkCloseButtonInMailSettings************************");
		
		System.out.println("labelDashboard                  : "+actlabelDashboard                 +" Value Expected : "+explabelDashboard);
		
		System.out.println("newAddDashBoard                 : "+actnewAddDashBoard                +" Value Expected : "+expnewAddDashBoard);
		System.out.println("dashboardCustomizationSettings  : "+actdashboardCustomizationSettings +" Value Expected : "+expdashboardCustomizationSettings);
		
		
		boolean actMethod=actlabelDashboard==explabelDashboard && 
				actnewAddDashBoard==expnewAddDashBoard && actdashboardCustomizationSettings==expdashboardCustomizationSettings;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 179, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 179, 8, actResult);
		
		
		if(actResult.equalsIgnoreCase(expResult))
		
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 178, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 178, 9, resFail);
			 return false;
		 }
	}

		
	// Update And UpdateOk Are Reused	
		
		
	public boolean checkUpdatedFieldsinMailSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
	/*	
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", PronghornBnt);*/
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MailSettingsBtn));
		MailSettingsBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(SMTPAddressTxt));
		
		String actSMTPAddressTxt             =SMTPAddressTxt.getAttribute("value");
		String actOutgoingPortNoTxt          =OutgoingPortNoTxt.getAttribute("value");
		String actAuthenticationTypeDropdown =AuthenticationTypeDropdown.getAttribute("value");
		String actEmailIdTxt                 =EmailIdTxt.getAttribute("value");
		String actPasswordTxt                =PasswordTxt.getAttribute("value");
		
		excelReader.setCellData(xlfile, xlSheetName, 181, 8, actSMTPAddressTxt);
		excelReader.setCellData(xlfile, xlSheetName, 182, 8, actOutgoingPortNoTxt);
		excelReader.setCellData(xlfile, xlSheetName, 183, 8, actAuthenticationTypeDropdown);
		excelReader.setCellData(xlfile, xlSheetName, 184, 8, actEmailIdTxt);
		excelReader.setCellData(xlfile, xlSheetName, 185, 8, actPasswordTxt);
		
		String expSMTPAddressTxt             =excelReader.getCellData(xlSheetName, 181, 7);
		String expOutgoingPortNoTxt          =excelReader.getCellData(xlSheetName, 182, 7);
		String expAuthenticationTypeDropdown =excelReader.getCellData(xlSheetName, 183, 7);
		String expEmailIdTxt                 =excelReader.getCellData(xlSheetName, 184, 7);
		String expPasswordTxt                =excelReader.getCellData(xlSheetName, 185, 7);
		
		System.out.println("**********************************checkUpdatedFieldsinMailSettings*************************");
		
		
		System.out.println("SMTPAddressTxt               : "+actSMTPAddressTxt             +" Value Expected : "+expSMTPAddressTxt);
		System.out.println("OutgoingPortNoTxt            : "+actOutgoingPortNoTxt          +" Value Expected : "+expOutgoingPortNoTxt);
		System.out.println("AuthenticationTypeDropdown   : "+actAuthenticationTypeDropdown +" Value Expected : "+expAuthenticationTypeDropdown);
		System.out.println("EmailIdTxt                   : "+actEmailIdTxt                 +" Value Expected : "+expEmailIdTxt);
		System.out.println("PasswordTxt                  : "+actPasswordTxt                +" Value Expected : "+expPasswordTxt);
		
		if(actSMTPAddressTxt.equalsIgnoreCase(expSMTPAddressTxt) && actOutgoingPortNoTxt.equalsIgnoreCase(expOutgoingPortNoTxt)
				&& actAuthenticationTypeDropdown.equalsIgnoreCase(expAuthenticationTypeDropdown) && actEmailIdTxt.equalsIgnoreCase(expEmailIdTxt)
				&& actPasswordTxt.equalsIgnoreCase(expPasswordTxt))
		{
			System.out.println("Test Pass : Fields Updated Successflly in MailSettings");
			excelReader.setCellData(xlfile, xlSheetName, 180, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Pass : Fields Not Updated in MailSettings");
			excelReader.setCellData(xlfile, xlSheetName, 180, 9, resFail);
			return false;
		}	
			
	}
		
	 
	
	public boolean checkUpdatingtheMailSettingsbyUpdatingEmailid() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EmailIdTxt));
		EmailIdTxt.click();
		EmailIdTxt.clear();
		
		EmailIdTxt.sendKeys(excelReader.getCellData(xlSheetName, 187, 6));
		
		String actdata=EmailIdTxt.getAttribute("value");
		String data=excelReader.getCellData(xlSheetName, 187, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 187, 8, actdata);
		
        Thread.sleep(1000);
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		

		getWaitForAlert();

		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 188, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 188, 8, actAlertMgs);
		
        getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 189, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		excelReader.setCellData(xlfile, xlSheetName, 189, 8, actMessage);
		
		
		System.out.println("***********************************checkUpdatingtheMailSettingsbyUpdatingEmailid****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);
		System.out.println("Message          : "+actMessage    +" Value Expected : "+expMessage);
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actMessage.equalsIgnoreCase(expMessage))
  {
			System.out.println("Test Pass : Email Field Updating Data Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 186, 9, resPass);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
			CustCloseBtn.click();
			return true;
		}
		else
		{
			System.out.println("Test Pass : Email Field Not Updating Data");
			excelReader.setCellData(xlfile, xlSheetName, 186, 9, resFail);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
			CustCloseBtn.click();
			return false;
		}	
	}		
	

	
	
	public boolean checkUpdatedEmailid() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", PronghornBnt);
		
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MailSettingsBtn));
		MailSettingsBtn.click();
	
		
		String actEmailIdTxt  =EmailIdTxt.getAttribute("value");
		String expEmailIdTxt  =excelReader.getCellData(xlSheetName, 191, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 191, 8, actEmailIdTxt);
		
		System.out.println("**************************checkUpdatedEmailid*************************");
		
		System.out.println("EmailIdTxt   : "+actEmailIdTxt+" Value Expected : "+expEmailIdTxt);
		
		if(actEmailIdTxt.equalsIgnoreCase(expEmailIdTxt))
		{
			System.out.println("Test Pass : Email Field Updated New Data Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 190, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Pass : Email Field Not Updating New Data");
			excelReader.setCellData(xlfile, xlSheetName, 190, 9, resFail);
			return false;
		}	
	}	
	


	public boolean checkMastersOptioninthePreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(MastersBtn));
		
		boolean Master  =MastersBtn.isDisplayed();
		
		String actMastersBtn=Boolean.toString(Master);
		
		String  expMastersBtn  =excelReader.getCellData(xlSheetName, 193, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 193, 8, actMastersBtn);
		
        Thread.sleep(3000);
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MastersBtn));
		MastersBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DontApplyLoginRestrictionToExtraFieldsChkBox));
		
		boolean actDontApplyLoginRestrictionToExtraFieldsChkBox     =DontApplyLoginRestrictionToExtraFieldsChkBox.isDisplayed();
		boolean actItemAttributesValuesDropdown                     =ItemAttributesValuesDropdown.isDisplayed();
		boolean actGridHeaderSales                                  =GridHeaderSales.isDisplayed();
		boolean actGridHeaderPurchases                              =GridHeaderPurchases.isDisplayed();
		boolean actGridHeaderAttribute                              =GridHeaderAttribute.isDisplayed();
		boolean actGridHeaderName                                   =GridHeaderName.isDisplayed();
		boolean actAllowAttributesNameEditingInProductMasterChkBox  =AllowAttributesNameEditingInProductMasterChkBox.isDisplayed();
		
		boolean expDontApplyLoginRestrictionToExtraFieldsChkBox     =true;
		boolean expItemAttributesValuesDropdown                     =true;
		boolean expGridHeaderSales                                  =true;
		boolean expGridHeaderPurchases                              =true;
		boolean expGridHeaderAttribute                              =true;
		boolean expGridHeaderName                                   =true;
		boolean expAllowAttributesNameEditingInProductMasterChkBox  =true;
		
		System.out.println("****************************************checkMasterOptions************************************");
		
		System.out.println("DontApplyLoginRestrictionToExtraFieldsChkBox      : "+actDontApplyLoginRestrictionToExtraFieldsChkBox   +" Value Expected : "+expDontApplyLoginRestrictionToExtraFieldsChkBox);
		System.out.println("ItemAttributesValuesDropdown                      : "+actItemAttributesValuesDropdown                   +" Value Expected : "+expItemAttributesValuesDropdown);
		System.out.println("GridHeaderSales                                   : "+actGridHeaderSales                                +" Value Expected : "+expGridHeaderSales);
		System.out.println("GridHeaderPurchases                               : "+actGridHeaderPurchases                            +" Value Expected : "+expGridHeaderPurchases);
		System.out.println("GridHeaderAttribute                               : "+actGridHeaderAttribute                            +" Value Expected : "+expGridHeaderAttribute);
		System.out.println("GridHeaderName                                    : "+actGridHeaderName                                 +" Value Expected : "+expGridHeaderName);
		System.out.println("AllowAttributesNameEditingInProductMasterChkBox   : "+actAllowAttributesNameEditingInProductMasterChkBox+" Value Expected : "+expAllowAttributesNameEditingInProductMasterChkBox);
		
		
		
		boolean actMethod=actDontApplyLoginRestrictionToExtraFieldsChkBox==expDontApplyLoginRestrictionToExtraFieldsChkBox
				&& actItemAttributesValuesDropdown==expItemAttributesValuesDropdown && actGridHeaderSales==expGridHeaderSales
				&& actGridHeaderPurchases==expGridHeaderPurchases && actGridHeaderAttribute==expGridHeaderAttribute && actGridHeaderName==expGridHeaderName
				&& actAllowAttributesNameEditingInProductMasterChkBox==expAllowAttributesNameEditingInProductMasterChkBox;
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 194, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 194, 8, actResult);
		
		
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			 System.out.println("Test Pass : Fileds Are Available In Masters As Expected");
			 excelReader.setCellData(xlfile, xlSheetName, 192, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Pass : Fileds Are Not Available In Masters As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 192, 9, resFail);
			return false;
		}

	}
	
	
	
	
	@FindBy(xpath="//*[@id='DontApplyLoginRestrictionToExtraFields']/following-sibling::span")
	public static WebElement DontApplyLoginRestrictionToExtraFieldsChkBox; 
	
	@FindBy(xpath="//input[@id='DontApplyLoginRestrictionToExtraFields']")
	public static WebElement DontApplyLoginRestrictionToExtraFieldsChkBoxSelected; 
	
	@FindBy(xpath="//select[@id='ProductAttributesValues']")
	public static WebElement ItemAttributesValuesDropdown; 
	
	@FindBy(xpath="//td[@id='grdRestrictItemsInPurchaseBasedOnTheVendor_col_1-1']")
	public static WebElement GridSalesRow1; 
	
	@FindBy(xpath="//td[@id='grdRestrictItemsInPurchaseBasedOnTheVendor_col_1-2']")
	public static WebElement GridPurchasesRow1; 
	
	@FindBy(xpath="//td[@id='grdRestrictItemsInPurchaseBasedOnTheVendor_col_2-1']")
	public static WebElement GridSalesRow2; 
	
	@FindBy(xpath="//td[@id='grdRestrictItemsInPurchaseBasedOnTheVendor_col_2-2']")
	public static WebElement GridPurchasesRow2; 
	
	@FindBy(xpath="//td[@id='grdRestrictItemsInPurchaseBasedOnTheVendor_col_3-1']")
	public static WebElement GridSalesRow3; 
	
	@FindBy(xpath="//td[@id='grdRestrictItemsInPurchaseBasedOnTheVendor_col_3-2']")
	public static WebElement GridPurchasesRow3;
	
	@FindBy(xpath="//div[contains(text(),'Sales')]")
	public static WebElement GridHeaderSales; 
	
	@FindBy(xpath="//div[contains(text(),'Purchases')]")
	public static WebElement GridHeaderPurchases; 
	
	@FindBy(xpath="//div[contains(text(),'Attribute')]")
	public static WebElement GridHeaderAttribute; 
	
	@FindBy(xpath="//div[contains(text(),'Names')]")
	public static WebElement GridHeaderName; 
	
	@FindBy(xpath="//td[contains(text(),'Attribute0')]")
	public static WebElement GridAttributeRow1; 
	
	@FindBy(xpath="//div[contains(text(),'Attribute1')]")
	public static WebElement GridAttributeRow2; 
	
	@FindBy(xpath="//div[@id='dvProductAttributesValues']//tr[1]//td[3]")
	public static WebElement GridnamesRow1; 
	
	@FindBy(xpath="//div[@id='dvProductAttributesValues']//tr[2]//td[3]")
	public static WebElement GridnamesRow2;
	
	@FindBy(xpath="//input[@id='txtSales']")
	public static WebElement Salestxt;
	
	@FindBy(xpath="//input[@id='txtPurchases']")
	public static WebElement PurchasesTxt;
	
	@FindBy(xpath="//input[@id='txtProductName']")
	public static WebElement NameTxt;
	
	@FindBy(xpath="//*[@id='dvAllowAttrNameEditInProdtMaster']/label/span")
	public static WebElement AllowAttributesNameEditingInProductMasterChkBox;
	
	@FindBy(xpath="//*[@id='dvAllowAttrNameEditInProdtMaster']/label/input")
	public static WebElement AllowAttributesNameEditingInProductMasterChkBoxSelected;
	
	
	public boolean checkSavingtheSaleandPurchaseRates() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GridSalesRow1));
		GridSalesRow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Salestxt));
		Salestxt.click();
		
		
		
		Salestxt.sendKeys(excelReader.getCellData(xlSheetName, 196, 6));
					
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GridPurchasesRow1));
		GridPurchasesRow1.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PurchasesTxt));
		PurchasesTxt.click();
		
		
		PurchasesTxt.sendKeys(excelReader.getCellData(xlSheetName, 197, 6));
		
		GridPurchasesRow2.click();
	
		String actSalestxt=GridSalesRow1.getText();
		String expSalestxt=excelReader.getCellData(xlSheetName, 196, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 196, 8, actSalestxt);
		
		String actPurchasesTxt=GridPurchasesRow1.getText();
		String expPurchasesTxt=excelReader.getCellData(xlSheetName, 197, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 197, 8, actPurchasesTxt);
		
	
        Thread.sleep(1000);
        
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		//Change Excel From Here 
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 198, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 198, 8, actPurchasesTxt);
		
         getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 199, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		 excelReader.setCellData(xlfile, xlSheetName, 199, 8, actPurchasesTxt);
        
		
		System.out.println("***********************************checkSavingtheSaleandPurchaseRates****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		System.out.println("Salestxt         : "+actSalestxt    +" Value Expected : "+expSalestxt);
		System.out.println("PurchasesTxt     : "+actPurchasesTxt+" Value Expected : "+expPurchasesTxt);
		
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Saving data in Sales And Purchases Rates Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 195, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Pass : Not Saving data in Sales And Purchases Rates Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 195, 9, resFail);
			return false;
		}
	}
	
	
		
		

	public boolean checkCloseButtonInMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
		CustCloseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
		
		boolean actlabelDashboard                  =labelDashboard.isDisplayed();
		boolean actselectDashboard                 =selectDashboard.isDisplayed();
		boolean actnewAddDashBoard                 =newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings  =dashboardCustomizationSettings.isDisplayed();
		
		boolean explabelDashboard                  =true;
		boolean expselectDashboard                 =true;
		boolean expnewAddDashBoard                 =true;
		boolean expdashboardCustomizationSettings  =true;
		
		System.out.println("******************************checkCloseButtonInMasters************************");
		
		System.out.println("labelDashboard                  : "+actlabelDashboard                 +" Value Expected : "+explabelDashboard);
		System.out.println("selectDashboard                 : "+actselectDashboard                +" Value Expected : "+expselectDashboard);
		System.out.println("newAddDashBoard                 : "+actnewAddDashBoard                +" Value Expected : "+expnewAddDashBoard);
		System.out.println("dashboardCustomizationSettings  : "+actdashboardCustomizationSettings +" Value Expected : "+expdashboardCustomizationSettings);
		
		
		
		boolean actMethod=labelDashboard.isDisplayed() && selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() && dashboardCustomizationSettings.isDisplayed();
				
				
				
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 201, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 201, 8, actResult);
		
		if(actResult.equalsIgnoreCase(expResult))
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 200, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, xlSheetName, 200, 9, resFail);
			 return false;
		 }

	}

	
	
	public boolean checkEditAndSavingRateValues() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GridSalesRow1));
		GridSalesRow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Salestxt));
		Salestxt.click();
		Salestxt.sendKeys(Keys.HOME);
		Salestxt.sendKeys(Keys.SHIFT,Keys.END);
		
		Salestxt.sendKeys(excelReader.getCellData(xlSheetName, 203, 6));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GridPurchasesRow1));
		GridPurchasesRow1.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PurchasesTxt));
		PurchasesTxt.click();
		PurchasesTxt.sendKeys(Keys.HOME);
		PurchasesTxt.sendKeys(Keys.SHIFT,Keys.END);
		
		PurchasesTxt.sendKeys(excelReader.getCellData(xlSheetName, 204, 6));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GridSalesRow2));
		GridSalesRow2.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Salestxt));
		Salestxt.click();
		Salestxt.sendKeys(Keys.HOME);
		Salestxt.sendKeys(Keys.SHIFT,Keys.END);
		
		Salestxt.sendKeys(excelReader.getCellData(xlSheetName, 205, 6));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GridPurchasesRow2));
		GridPurchasesRow2.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PurchasesTxt));
		PurchasesTxt.click();
		PurchasesTxt.sendKeys(Keys.HOME);
		PurchasesTxt.sendKeys(Keys.SHIFT,Keys.END);
		PurchasesTxt.sendKeys(excelReader.getCellData(xlSheetName, 206, 6));
		
		GridPurchasesRow3.click();
		
		
		
		String actSalestxt      =GridSalesRow1.getText();
		String actPurchasesTxt  =GridPurchasesRow1.getText();
		
		String actSalestxt1     =GridSalesRow2.getText();
		String actPurchasesTxt1 =GridPurchasesRow2.getText();
		
		excelReader.setCellData(xlfile, xlSheetName, 203, 8, actSalestxt);
		excelReader.setCellData(xlfile, xlSheetName, 204, 8, actPurchasesTxt);
		excelReader.setCellData(xlfile, xlSheetName, 205, 8, actSalestxt1);
		excelReader.setCellData(xlfile, xlSheetName, 206, 8, actPurchasesTxt1);
		
		
		String expSalestxt       = excelReader.getCellData(xlSheetName, 203, 7);
		String expPurchasesTxt   = excelReader.getCellData(xlSheetName, 204, 7);
		String expSalestxt1      = excelReader.getCellData(xlSheetName, 205, 7);
		String expPurchasesTxt1  = excelReader.getCellData(xlSheetName, 206, 7);
		

		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();

		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  =excelReader.getCellData(xlSheetName, 207, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 207, 8, actPurchasesTxt);
		
         getAlert().accept();
		
		String expMessage=excelReader.getCellData(xlSheetName, 208, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		 excelReader.setCellData(xlfile, xlSheetName, 208, 8, actPurchasesTxt);
        
		System.out.println("***********************************checkSavedRateValues****************************");
		
		//System.out.println("AlertMessage     : "+actAlertMgs     +" Value Expected : "+expAlertMgs);	
		System.out.println("Salestxt         : "+actSalestxt     +" Value Expected : "+expSalestxt);
		System.out.println("PurchasesTxt     : "+actPurchasesTxt +" Value Expected : "+expPurchasesTxt);
		System.out.println("Salestxt1        : "+actSalestxt1    +" Value Expected : "+expSalestxt1);
		System.out.println("PurchasesTxt1    : "+actPurchasesTxt1+" Value Expected : "+expPurchasesTxt1);
		//System.out.println("Message          : "+actMessage      +" Value Expected : "+expMessage);
		
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs) && actSalestxt.equalsIgnoreCase(expSalestxt) && actPurchasesTxt.equalsIgnoreCase(expPurchasesTxt)
				&& actSalestxt1.equalsIgnoreCase(expSalestxt1) && actPurchasesTxt1.equalsIgnoreCase(expPurchasesTxt1)
				&& actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Updating data in Sales And Purchases Rates Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 202, 9,resPass);
			
			
			return true;
		}
		else
		{
			System.out.println("Test Pass : Not Updating data in Sales And Purchases Rates Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 202, 9, resFail);
			
			return false;
		}
	}
		
		
		

	
	
	
	

	public boolean checkExternalModulesInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();	
		
		Thread.sleep(4000);
		/*
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", PronghornBnt);
		Thread.sleep(3000);*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExternalModulesBtn));
		
		boolean ExternalModules  =ExternalModulesBtn.isDisplayed();
		
		String actExternalModulesBtn=Boolean.toString(ExternalModules);
		
		
		String expExternalModulesBtn  =excelReader.getCellData(xlSheetName, 210, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 210, 8, actExternalModulesBtn);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExternalModulesBtn));
	    ExternalModulesBtn.click();	
		
	    
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extMOD_OnEventDrpdwn));
	 	
		boolean actextMOD_OnEventDrpdwn            = extMOD_OnEventDrpdwn.isDisplayed();
		boolean actextMOD_ModuleTypeDrpdwn         = extMOD_ModuleTypeDrpdwn.isDisplayed();
		boolean actextMOD_CLassNameDrpdwn          = extMOD_CLassNameDrpdwn.isDisplayed();
		boolean actextMOD_ModuleNAmeTXt            = extMOD_ModuleNAmeTXt.isDisplayed();
		boolean actextMOD_FunctionNAmeDrpdwn       = extMOD_FunctionNAmeDrpdwn.isDisplayed();
		
		boolean expextMOD_OnEventDrpdwn           = true;
		boolean expextMOD_ModuleTypeDrpdwn        = true;
		boolean expextMOD_CLassNameDrpdwn         = true;
		boolean expextMOD_ModuleNAmeTXt           = true;
		boolean expextMOD_FunctionNAmeDrpdwn      = true;
		
		
			
		Thread.sleep(2000);
		
		
        ArrayList<String>actextMOD_BodyGridList=new ArrayList<String>();
		
		int extMOD_BodyGridListCount=extMOD_BodyGridList.size();
		
		System.out.println(" extMOD_BodyGridList  :  "+extMOD_BodyGridListCount);
		
		for (int i = 0; i < extMOD_BodyGridListCount; i++)
		{
			String data=extMOD_BodyGridList.get(i).getText();
			actextMOD_BodyGridList.add(data);
		}
		
		String actextMOD_BodyGrid=actextMOD_BodyGridList.toString();
		String expextMOD_BodyGrid=excelReader.getCellData(xlSheetName, 211, 7);
		
		System.err.println("  Actual Extermodule    : "+actextMOD_BodyGrid);
		System.err.println("  Expected  Extermodule : "+expextMOD_BodyGrid);
		
		excelReader.setCellData(xlfile, xlSheetName, 211, 8, actextMOD_BodyGrid);
		
		
		
		System.out.println("******************************checkExternalModulesInPreferences************************");
		
		System.out.println("extMOD_OnEventDrpdwn               : "+actextMOD_OnEventDrpdwn      +" Value Expected : "+expextMOD_OnEventDrpdwn);
		System.out.println("extMOD_ModuleTypeDrpdwn            : "+actextMOD_ModuleTypeDrpdwn   +" Value Expected : "+expextMOD_ModuleTypeDrpdwn);
		System.out.println("extMOD_CLassNameDrpdwn             : "+actextMOD_CLassNameDrpdwn    +" Value Expected : "+expextMOD_CLassNameDrpdwn);
		System.out.println("extMOD_ModuleNAmeTXt               : "+actextMOD_ModuleNAmeTXt      +" Value Expected : "+expextMOD_ModuleNAmeTXt);
		System.out.println("extMOD_FunctionNAmeDrpdwn          : "+actextMOD_FunctionNAmeDrpdwn +" Value Expected : "+expextMOD_FunctionNAmeDrpdwn);
		System.out.println("extMOD_FunctionNAmeDrpdwn          : "+actextMOD_BodyGrid            +" Value Expected : "+expextMOD_BodyGrid);
		
		boolean actMethod= actextMOD_OnEventDrpdwn==expextMOD_OnEventDrpdwn && actextMOD_ModuleTypeDrpdwn==expextMOD_ModuleTypeDrpdwn && 
				           actextMOD_CLassNameDrpdwn==expextMOD_CLassNameDrpdwn && actextMOD_ModuleNAmeTXt==expextMOD_ModuleNAmeTXt && 
				           actextMOD_FunctionNAmeDrpdwn==expextMOD_FunctionNAmeDrpdwn;
			
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 212, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 212, 8, actResult);
		
	    
		System.out.println("********************************checkExternalModulesInPreferences**************************");
		
		System.out.println("ExternalModulesBtn    : "+actExternalModulesBtn+" Value Expected : "+expExternalModulesBtn);
		System.out.println("Display Result        : "+actResult            +" Value Expected : "+expResult);
		
		
		if(actExternalModulesBtn.equalsIgnoreCase(expExternalModulesBtn) && actResult.equalsIgnoreCase(expResult) )
		{
			System.out.println("Test Pass : ExternalModulesBtn Is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 209, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : ExternalModulesBtn is Not Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 209, 9, resFail);
			return false;
		}
	 }
	
	
	
	
	
	
	public boolean checkINFOInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InfoBtn));
		
		boolean Info  =InfoBtn.isDisplayed();
		
		String actInfoBtn=Boolean.toString(Info);
		
		
		String expInfoBtn  =excelReader.getCellData(xlSheetName, 215, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 215, 8, actInfoBtn);
		
	    	
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InfoBtn));
	    InfoBtn.click();
		
	    
	    Thread.sleep(2000);
	    
        ArrayList<String>actinfoList=new ArrayList<String>();
		
		int infoListCount=infoList.size();
		
		System.out.println(" infoListCount  :  "+infoListCount);
		
		for (int i = 0; i < infoListCount; i++)
		{
			String data=infoList.get(i).getText();
			actinfoList.add(data);
		}
		
		String actInfo=actinfoList.toString();
		String expInfo=excelReader.getCellData(xlSheetName, 214, 7);
			
		System.err.println("  Actual Extermodule    : "+actInfo);
		System.err.println("  Expected  Extermodule : "+expInfo);
		
		excelReader.setCellData(xlfile, xlSheetName, 214, 8, actInfo);
		
		
		
		System.out.println("extMOD_FunctionNAmeDrpdwn          : "+actInfo            +" Value Expected : "+expInfo);
		
		System.out.println("********************************checkExternalModulesInPreferences**************************");
		
		System.out.println("ExternalModulesBtn    : "+actInfoBtn+" Value Expected : "+expInfoBtn);
		System.out.println("ExternalModulesBtn    : "+actInfo+" Value Expected : "+expInfo);
		
		
		if(actInfoBtn.equalsIgnoreCase(expInfoBtn) && actInfo.equalsIgnoreCase(expInfo))
		{
			System.out.println("Test Pass : ExternalModulesBtn Is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 213, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : ExternalModulesBtn is Not Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 213, 9, resFail);
			return false;
		}
	 }
	
	

	public boolean checkProductionInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ProductionBtn));
		
		boolean Production  =ProductionBtn.isDisplayed();
		
		String actProductionBtn=Boolean.toString(Production);
		
		
		String expProductionBtn  =excelReader.getCellData(xlSheetName, 217, 7);
	    
	    excelReader.setCellData(xlfile, xlSheetName, 217, 8, actProductionBtn);
		
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ProductionBtn));
	    ProductionBtn.click();	
		
	    
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionRaiseIssueAndReceiptVoucherChkbox));
	 	
		boolean actproductionRaiseIssueAndReceiptVoucherChkbox               = productionRaiseIssueAndReceiptVoucherChkbox.isDisplayed();
		boolean actproductionRaiseProductionorderonPIRChkbox                 = productionRaiseProductionorderonPIRChkbox.isDisplayed();
		boolean actproductionRaiseIssuetoproductionandReceiptChkbox          = productionRaiseIssuetoproductionandReceiptChkbox.isDisplayed();
		boolean actproductionPrefixVoucherNoWhileRaisingQCRequisitionChkbox  = productionPrefixVoucherNoWhileRaisingQCRequisitionChkbox.isDisplayed();
		
		
		boolean expproductionRaiseIssueAndReceiptVoucherChkbox               = true;
		boolean expproductionRaiseProductionorderonPIRChkbox                 = true;
		boolean expproductionRaiseIssuetoproductionandReceiptChkbox          = true;
		boolean expproductionPrefixVoucherNoWhileRaisingQCRequisitionChkbox  = true;
		
		
		
		System.out.println("******************************checkProductionInPreferences************************");
		
		System.out.println("productionRaiseIssueAndReceiptVoucherChkbox               : "+actproductionRaiseIssueAndReceiptVoucherChkbox      +" Value Expected : "+expproductionRaiseIssueAndReceiptVoucherChkbox);
		System.out.println("productionRaiseProductionorderonPIRChkbox                 : "+actproductionRaiseProductionorderonPIRChkbox   +" Value Expected : "+expproductionRaiseProductionorderonPIRChkbox);
		System.out.println("productionRaiseIssuetoproductionandReceiptChkbox          : "+actproductionRaiseIssuetoproductionandReceiptChkbox    +" Value Expected : "+expproductionRaiseIssuetoproductionandReceiptChkbox);
		System.out.println("productionPrefixVoucherNoWhileRaisingQCRequisitionChkbox  : "+actproductionPrefixVoucherNoWhileRaisingQCRequisitionChkbox      +" Value Expected : "+expproductionPrefixVoucherNoWhileRaisingQCRequisitionChkbox);
	
		
		
		
		boolean actMethod= actproductionRaiseIssueAndReceiptVoucherChkbox==expproductionRaiseIssueAndReceiptVoucherChkbox
				&& actproductionRaiseProductionorderonPIRChkbox==expproductionRaiseProductionorderonPIRChkbox && 
				actproductionRaiseIssuetoproductionandReceiptChkbox==expproductionRaiseIssuetoproductionandReceiptChkbox
				&& actproductionPrefixVoucherNoWhileRaisingQCRequisitionChkbox==expproductionPrefixVoucherNoWhileRaisingQCRequisitionChkbox;
			
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 218, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 218, 8, actResult);
		
	    
		System.out.println("********************************checkProductionInPreferences**************************");
		
		
		System.out.println("Display Result        : "+actResult            +" Value Expected : "+expResult);
		
		
		if (actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Production Is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 216, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Production is Not Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 216, 9, resFail);
			return false;
		}
	 }
	
	

	
	
	public boolean checkMRPInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MrpBtn));
		
		boolean MRP  =MrpBtn.isDisplayed();
		
		String actMrpBtn=Boolean.toString(MRP);
		String expMrpBtn  =excelReader.getCellData(xlSheetName, 220, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 220, 8, actMrpBtn);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MrpBtn));
        MrpBtn.click();
        
        
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mrpProcurementVoucherDrpdwn));
		
		boolean actmrpProcurementVoucherDrpdwn                           		= mrpProcurementVoucherDrpdwn.isDisplayed();
		boolean actmrpProcurementInchargeDrpdwn                          		= mrpProcurementInchargeDrpdwn.isDisplayed();
		boolean actmrpProductionInchargeDrpdwn                           		= mrpProductionInchargeDrpdwn.isDisplayed(); 
		boolean actmrp_MRPDrpdwn                           				 		= mrp_MRPDrpdwn.isDisplayed(); 
		boolean actmrpPurchasePlanningVoucherDrpdwn                 	 		= mrpPurchasePlanningVoucherDrpdwn.isDisplayed(); 
		boolean actmrpRaiseMaterialrequestonReleaseDrpdwn                		= mrpRaiseMaterialrequestonReleaseDrpdwn.isDisplayed();
		boolean actmrpAskForVendorWhileRaisingPurchaseVoucherChkbox      		= mrpAskForVendorWhileRaisingPurchaseVoucherChkbox.isDisplayed();
		boolean actmrpDontAllowToDoMROIfStockIsAvailableChkbox           		= mrpDontAllowToDoMROIfStockIsAvailableChkbox.isDisplayed();
		boolean actmrpDontAllowToIssueMoreThanPlannedQuantityChkbox      		= mrpDontAllowToIssueMoreThanPlannedQuantityChkbox.isDisplayed();    
		boolean actmrpDontAllowToReceiveMoreQuantityThanRequiredChkbox   		= mrpDontAllowToReceiveMoreQuantityThanRequiredChkbox.isDisplayed(); 
		boolean actmrpTrackBasedOnOrderChkbox                            		= mrpTrackBasedOnOrderChkbox.isDisplayed();
		boolean actmrpAllowUserToIssuesAndReceiptProcessWiseChkbox       		= mrpAllowUserToIssuesAndReceiptProcessWiseChkbox.isDisplayed(); 
		boolean actmrpRestrictReleasePOBasedOnProductionHierarchyChkbox  		= mrpRestrictReleasePOBasedOnProductionHierarchyChkbox.isDisplayed(); 
		boolean actmrpAllowToChangeCostingPeratReceiptFromProductionChkbox		= mrpAllowToChangeCostingPeratReceiptFromProductionChkbox.isDisplayed(); 
		boolean actmrpAllowtoissuepartialquantityinIssuestoproductionChkbox		= mrpAllowtoissuepartialquantityinIssuestoproductionChkbox.isDisplayed(); 
		boolean actmrpDoNotAllowToReleasePOIfStockNotavailableChkbox       		= mrpDoNotAllowToReleasePOIfStockNotavailableChkbox.isDisplayed(); 
		boolean actmrpDisplayBothBOMQuantityandAlternateQuantityinPlanningChkbox= mrpDisplayBothBOMQuantityandAlternateQuantityinPlanningChkbox.isDisplayed();	
		boolean actmrpPlanningBasedonAlternateQuantityChkbox                    = mrpPlanningBasedonAlternateQuantityChkbox.isDisplayed();  
		boolean actmrpCalculateAlternateQuantityBasedonChkbox                   = mrpCalculateAlternateQuantityBasedonChkbox.isDisplayed();       
		  
		
		
		boolean expmrpProcurementVoucherDrpdwn                           		= true;
		boolean expmrpProcurementInchargeDrpdwn                       			= true;
		boolean expmrpProductionInchargeDrpdwn                         			= true; 
		boolean expmrp_MRPDrpdwn                         						= true;  
		boolean expmrpPurchasePlanningVoucherDrpdwn                  			= true;  
		boolean expmrpRaiseMaterialrequestonReleaseDrpdwn                       = true; 
		boolean expmrpAskForVendorWhileRaisingPurchaseVoucherChkbox             = true; 
		boolean expmrpDontAllowToDoMROIfStockIsAvailableChkbox                  = true; 
		boolean expmrpDontAllowToIssueMoreThanPlannedQuantityChkbox             = true;     
		boolean expmrpDontAllowToReceiveMoreQuantityThanRequiredChkbox          = true;  
		boolean expmrpTrackBasedOnOrderChkbox                                   = true; 
		boolean expmrpAllowUserToIssuesAndReceiptProcessWiseChkbox              = true;  
		boolean expmrpRestrictReleasePOBasedOnProductionHierarchyChkbox         = true;  
		boolean expmrpAllowToChangeCostingPeratReceiptFromProductionChkbox      = true;  
		boolean expmrpAllowtoissuepartialquantityinIssuestoproductionChkbox     = true;  
		boolean expmrpDoNotAllowToReleasePOIfStockNotavailableChkbox            = true;  
		boolean expmrpDisplayBothBOMQuantityandAlternateQuantityinPlanningChkbox= true; 	
		boolean expmrpPlanningBasedonAlternateQuantityChkbox                    = true;   
		boolean expmrpCalculateAlternateQuantityBasedonChkbox                   = true;        
		
	    System.out.println("mrpProcurementVoucherDrpdwn                              : " + actmrpProcurementVoucherDrpdwn +                " Value Expected : " + expmrpProcurementVoucherDrpdwn);
        System.out.println("mrpProcurementInchargeDrpdwn                       		 : " + actmrpProcurementInchargeDrpdwn +            " Value Expected : " + expmrpProcurementInchargeDrpdwn);
        System.out.println("mrpProductionInchargeDrpdwn             				 : " + actmrpProductionInchargeDrpdwn +              " Value Expected : " + expmrpProductionInchargeDrpdwn);
        System.out.println("mrp_MRPDrpdwn             								 : " + actmrp_MRPDrpdwn +                " Value Expected : " + expmrp_MRPDrpdwn);
        System.out.println("mrpPurchasePlanningVoucherDrpdwn      					 : " + actmrpPurchasePlanningVoucherDrpdwn +       " Value Expected : " + expmrpPurchasePlanningVoucherDrpdwn);
        System.out.println("mrpRaiseMaterialrequestonReleaseDrpdwn                   : " + actmrpRaiseMaterialrequestonReleaseDrpdwn +                 " Value Expected : " + expmrpRaiseMaterialrequestonReleaseDrpdwn);
        System.out.println("mrpAskForVendorWhileRaisingPurchaseVoucherChkbox         : " + actmrpAskForVendorWhileRaisingPurchaseVoucherChkbox +           " Value Expected : " + expmrpAskForVendorWhileRaisingPurchaseVoucherChkbox);
        System.out.println("mrpDontAllowToDoMROIfStockIsAvailableChkbox              : " + actmrpDontAllowToDoMROIfStockIsAvailableChkbox +               " Value Expected : " + expmrpDontAllowToDoMROIfStockIsAvailableChkbox);
        System.out.println("mrpDontAllowToIssueMoreThanPlannedQuantityChkbox         : " + actmrpDontAllowToIssueMoreThanPlannedQuantityChkbox +                 " Value Expected : " + expmrpDontAllowToIssueMoreThanPlannedQuantityChkbox);
        System.out.println("mrpDontAllowToReceiveMoreQuantityThanRequiredChkbox      : " + actmrpDontAllowToReceiveMoreQuantityThanRequiredChkbox +                " Value Expected : " + expmrpDontAllowToReceiveMoreQuantityThanRequiredChkbox);
        System.out.println("mrpTrackBasedOnOrderChkbox                				 : " + actmrpTrackBasedOnOrderChkbox +            " Value Expected : " + expmrpTrackBasedOnOrderChkbox);
        System.out.println("mrpAllowUserToIssuesAndReceiptProcessWiseChkbox          : " + actmrpAllowUserToIssuesAndReceiptProcessWiseChkbox +   " Value Expected : " + expmrpAllowUserToIssuesAndReceiptProcessWiseChkbox);
        System.out.println("mrpRestrictReleasePOBasedOnProductionHierarchyChkbox     : " + actmrpRestrictReleasePOBasedOnProductionHierarchyChkbox +                " Value Expected : " + expmrpRestrictReleasePOBasedOnProductionHierarchyChkbox);
        System.out.println("mrpAllowToChangeCostingPeratReceiptFromProductionChkbox  : " + actmrpAllowToChangeCostingPeratReceiptFromProductionChkbox +          " Value Expected : " + expmrpAllowToChangeCostingPeratReceiptFromProductionChkbox);
        System.out.println("mrpAllowtoissuepartialquantityinIssuestoproductionChkbox : " + actmrpAllowtoissuepartialquantityinIssuestoproductionChkbox +         " Value Expected : " + expmrpAllowtoissuepartialquantityinIssuestoproductionChkbox);
        System.out.println("mrpDoNotAllowToReleasePOIfStockNotavailableChkbox        : " + actmrpDoNotAllowToReleasePOIfStockNotavailableChkbox +              " Value Expected : " + expmrpDoNotAllowToReleasePOIfStockNotavailableChkbox);
        System.out.println("mrpDisplayBothBOMQuantityandAlternateQuantityinPlanning  : " + actmrpDisplayBothBOMQuantityandAlternateQuantityinPlanningChkbox +            " Value Expected : " + expmrpDisplayBothBOMQuantityandAlternateQuantityinPlanningChkbox);
        System.out.println("mrpPlanningBasedonAlternateQuantityChkbox                : " + actmrpPlanningBasedonAlternateQuantityChkbox +       " Value Expected : " + expmrpPlanningBasedonAlternateQuantityChkbox);
        System.out.println("mrpCalculateAlternateQuantityBasedonChkbox               : " + actmrpCalculateAlternateQuantityBasedonChkbox +             " Value Expected : " + expmrpCalculateAlternateQuantityBasedonChkbox);
                
        
        boolean displayResult=actmrpProcurementVoucherDrpdwn==expmrpProcurementVoucherDrpdwn
        		&& actmrpProcurementInchargeDrpdwn==expmrpProcurementInchargeDrpdwn
								&& actmrpProductionInchargeDrpdwn==expmrpProductionInchargeDrpdwn
								&& actmrp_MRPDrpdwn==expmrp_MRPDrpdwn
								&& actmrpPurchasePlanningVoucherDrpdwn==expmrpPurchasePlanningVoucherDrpdwn
								&& actmrpRaiseMaterialrequestonReleaseDrpdwn==expmrpRaiseMaterialrequestonReleaseDrpdwn
								&& actmrpAskForVendorWhileRaisingPurchaseVoucherChkbox==expmrpAskForVendorWhileRaisingPurchaseVoucherChkbox
								&& actmrpDontAllowToDoMROIfStockIsAvailableChkbox==expmrpDontAllowToDoMROIfStockIsAvailableChkbox
								&& actmrpDontAllowToIssueMoreThanPlannedQuantityChkbox==expmrpDontAllowToIssueMoreThanPlannedQuantityChkbox
								&& actmrpDontAllowToReceiveMoreQuantityThanRequiredChkbox==expmrpDontAllowToReceiveMoreQuantityThanRequiredChkbox
								&& actmrpTrackBasedOnOrderChkbox==expmrpTrackBasedOnOrderChkbox
								&& actmrpAllowUserToIssuesAndReceiptProcessWiseChkbox==expmrpAllowUserToIssuesAndReceiptProcessWiseChkbox
								&& actmrpRestrictReleasePOBasedOnProductionHierarchyChkbox==expmrpRestrictReleasePOBasedOnProductionHierarchyChkbox
								&& actmrpAllowToChangeCostingPeratReceiptFromProductionChkbox==expmrpAllowToChangeCostingPeratReceiptFromProductionChkbox
								&& actmrpAllowtoissuepartialquantityinIssuestoproductionChkbox==expmrpAllowtoissuepartialquantityinIssuestoproductionChkbox
								&& actmrpDoNotAllowToReleasePOIfStockNotavailableChkbox==expmrpDoNotAllowToReleasePOIfStockNotavailableChkbox
								&& actmrpDisplayBothBOMQuantityandAlternateQuantityinPlanningChkbox==expmrpDisplayBothBOMQuantityandAlternateQuantityinPlanningChkbox
								&& actmrpPlanningBasedonAlternateQuantityChkbox==expmrpPlanningBasedonAlternateQuantityChkbox
								&& actmrpCalculateAlternateQuantityBasedonChkbox==expmrpCalculateAlternateQuantityBasedonChkbox;
        
        String actDisplayResult=Boolean.toString(displayResult);
        String expDisplayResult=excelReader.getCellData(xlSheetName, 221, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 221, 8, actDisplayResult);
    
        
		System.out.println("********************************checkmrPInPreferences**************************");
		
		System.out.println("MrpBtn    : "+actMrpBtn+" Value Expected : "+expMrpBtn);
		
		if(actMrpBtn.equalsIgnoreCase(expMrpBtn))
		{
			System.out.println("Test Pass : MrpBtn Is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 219, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : MrpBtn is Not Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 219, 9, resFail);
			return false;
		}
	 }
	

	
	
	
	

	
	public boolean checkQualityControlInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(QualityControlBtn));
		
		boolean actQualityControlBtn  =QualityControlBtn.isDisplayed();
		boolean expQualityControlBtn  =true;
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(QualityControlBtn));
		QualityControlBtn.click();

		boolean actQualityControl_QualityControlDrpdwn  =QualityControl_QualityControlDrpdwn.isDisplayed();
		boolean expQualityControl_QualityControlDrpdwn  =true;
		
		boolean actQualityControl_QCStockTransferVoucherDrpdwn  =QualityControl_QCStockTransferVoucherDrpdwn.isDisplayed();
		boolean expQualityControl_QCStockTransferVoucherDrpdwn  =true;
		
		
		boolean actMethod=actQualityControl_QualityControlDrpdwn==expQualityControl_QualityControlDrpdwn && 
				actQualityControlBtn==expQualityControlBtn && 
				actQualityControl_QCStockTransferVoucherDrpdwn==expQualityControl_QCStockTransferVoucherDrpdwn;
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 223, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 223, 8, actResult);
				
		
		System.out.println("********************************checkQualityControlINPreferences**************************");
		
		System.out.println("QualityControlBtn    : "+actQualityControlBtn+" Value Expected : "+expQualityControlBtn);
		System.out.println("QualityControl_QualityControlDrpdwn    : "+actQualityControl_QualityControlDrpdwn+" Value Expected : "+expQualityControl_QualityControlDrpdwn);
		System.out.println("QualityControl_QCStockTransferVoucherDrpdwn    : "+actQualityControl_QCStockTransferVoucherDrpdwn+" Value Expected : "+expQualityControl_QCStockTransferVoucherDrpdwn);
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Accounts Is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 222, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Account is Not Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 222, 9, resFail);
			return false;
		}
	 }
	
	
	
	
	
	@FindBy(xpath = "//select[@id='FixedAssetsLocation']")
	public static WebElement FixedAssets_FixedAssetsLocationDrrpdwn;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/div[2]/div/label/span")
	public static WebElement FixedAssets_FixesAssetsTagChkbox1;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/div[2]/div/label/input")
	public static WebElement FixedAssets_FixesAssetsTagChkbox1Selected;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/div[3]/div/label/span")
	public static WebElement FixedAssets_FixesAssetsTagChkbox2;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/div[3]/div/label/span")
	public static WebElement FixedAssets_FixesAssetsTagChkbox2Selected;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[1]/span")
	public static WebElement FixedAssets_CreationOfFixedAssetInMandatoryFromPurchaseChkbox;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[1]/input")
	public static WebElement FixedAssets_CreationOfFixedAssetInMandatoryFromPurchaseChkboxSelected;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[2]/span")
	public static WebElement FixedAssets_AlwaysDefineDepreciationRateAsPercentageChkbox;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[2]/input")
	public static WebElement FixedAssets_AlwaysDefineDepreciationRateAsPercentageChkboxSelected;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[3]/span")
	public static WebElement FixedAssets_IncludeAssetsInPurchaseAccountSelectionChkbox;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[3]/input")
	public static WebElement FixedAssets_IncludeAssetsInPurchaseAccountSelectionChkboxSelected;
	
	@FindBy(xpath = "//*[@id='PostDepreciation_heading']/button")
	public static WebElement PostDepreciationExpandBtn;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettings']/button")
	public static WebElement FixedAssetsSettingsExpandBtn;
	
	
	
	
	@FindBy(xpath = "//input[@id='PostDepreciation_0']")
	public static WebElement FixedAssetsPostDepreciationDefaultRadioBtn;
	
	@FindBy(xpath = "//input[@id='PostDepreciation_1']")
	public static WebElement PostDepreciationByMOnthRadioBtn;
	
	@FindBy(xpath = "//input[@id='PostDepreciation_2']")
	public static WebElement postFixedMonthlyDepresionRadioBtn;
	
	@FindBy(xpath = "//input[@id='PostDepreciation_3']")
	public static WebElement PostDepreciationByYearRadioBtn;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[4]/span")
	public static WebElement FixedAssetsConsolidatingPostingChkbox;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[4]/input")
	public static WebElement FixedAssetsConsolidatingPostingChkboxSelected;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/div[5]/div/label/span")
	public static WebElement PostentryduringTransferChkbox;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/div[5]/div/label/input")
	public static WebElement PostentryduringTransferChkboxSelected;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/div[6]/div/label/span")
	public static WebElement PostentryduringDisposalChkbox;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/div[6]/div/label/input")
	public static WebElement PostentryduringDisposalChkboxSelected;
	
	@FindBy(xpath = "//input[@id='Additionextends']")
	public static WebElement FixedAssets_AdditionExtendsChkbox;
	
	@FindBy(xpath = "//input[@id='AccelerateDepreciation']")
	public static WebElement AccelerateDepreciationChkbox;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[7]/span")
	public static WebElement AutoCalculatesRateOfDepreciationChkbox;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[7]/input")
	public static WebElement AutoCalculatesRateOfDepreciationChkboxSelected;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[8]/span")
	public static WebElement calculateDepresionBasedOnAccountingYearChkbox;
	
	@FindBy(xpath = "//*[@id='FixedAssetsSettingsContent']/div/label[8]/input")
	public static WebElement calculateDepresionBasedOnAccountingYearChkboxSelected;
	
		
	public boolean checkFixedAssetsInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getDriver().navigate().refresh();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MrpBtn));
		
		Thread.sleep(3000);
		boolean FixedAssets  =FixedAssetsBtn.isDisplayed();
		
		String actFixedAssetsBtn=Boolean.toString(FixedAssets);
		String expFixedAssetsBtn  =excelReader.getCellData(xlSheetName, 225, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 225, 8, actFixedAssetsBtn);
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FixedAssetsBtn));
        FixedAssetsBtn.click();
        
        Thread.sleep(1000);
     /*   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FixedAssetsSettingsExpandBtn));
        FixedAssetsSettingsExpandBtn.click();*/
      
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FixedAssets_FixedAssetsLocationDrrpdwn));
		
		boolean actFixedAssets_FixedAssetsLocationDrrpdwn                     = FixedAssets_FixedAssetsLocationDrrpdwn.isDisplayed();
		boolean actFixedAssets_FixesAssetsTagChkbox1                          = FixedAssets_FixesAssetsTagChkbox1.isDisplayed();
		boolean actFixedAssets_FixesAssetsTagChkbox2                          = FixedAssets_FixesAssetsTagChkbox2.isDisplayed(); 
		boolean actFixedAssets_CreationOfFixedAssetInMandatory                = FixedAssets_CreationOfFixedAssetInMandatoryFromPurchaseChkbox.isDisplayed(); 
		boolean actAlwaysDefineDepreciationRateAsPercentageChkbox             = FixedAssets_AlwaysDefineDepreciationRateAsPercentageChkbox.isDisplayed(); 
		boolean actIncludeAssetsInPurchaseAccountSelectionChkbox              = FixedAssets_IncludeAssetsInPurchaseAccountSelectionChkbox.isDisplayed();
		boolean actFixedAssetsConsolidatingPostingChkbox 					  = FixedAssetsConsolidatingPostingChkbox.isDisplayed();
		boolean actPostentryduringTransferChkbox       		                  = PostentryduringTransferChkbox.isDisplayed(); 
		boolean actPostentryduringDisposalChkbox  							  = PostentryduringDisposalChkbox.isDisplayed(); 
		
		boolean actAutoCalculatesRateOfDepreciationChkbox       			  = AutoCalculatesRateOfDepreciationChkbox.isDisplayed(); 
		boolean actcalculateDepresionBasedOnAccountingYearChkbox			  = calculateDepresionBasedOnAccountingYearChkbox.isDisplayed();	
		  
		Thread.sleep(2000);
		

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FixedAssetsSettingsExpandBtn));
        FixedAssetsSettingsExpandBtn.click();
		
        Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PostDepreciationExpandBtn));
		 PostDepreciationExpandBtn.click();
		 Thread.sleep(2000);
		 
		boolean actFixedAssetsPostDepreciationDefaultRadioBtn      		      = FixedAssetsPostDepreciationDefaultRadioBtn.isDisplayed();
		boolean actPostDepreciationByMOnthRadioBtn           				  = PostDepreciationByMOnthRadioBtn.isDisplayed();
		boolean actpostFixedMonthlyDepresionRadioBtn      					  = postFixedMonthlyDepresionRadioBtn.isDisplayed();    
		boolean actPostDepreciationByYearRadioBtn   						  = PostDepreciationByYearRadioBtn.isDisplayed(); 
		
	
		
		boolean expFixedAssets_FixedAssetsLocationDrrpdwn                     = true;
		boolean expFixedAssets_FixesAssetsTagChkbox1                       	  = true;
		boolean expFixedAssets_FixesAssetsTagChkbox2                          = true; 
		boolean expFixedAssets_CreationOfFixedAssetInMandatory                = true;  
		boolean expAlwaysDefineDepreciationRateAsPercentageChkbox             = true;  
		boolean expIncludeAssetsInPurchaseAccountSelectionChkbox              = true; 
		boolean expFixedAssetsPostDepreciationDefaultRadioBtn                 = true; 
		boolean expPostDepreciationByMOnthRadioBtn                  		  = true; 
		boolean exppostFixedMonthlyDepresionRadioBtn            			  = true;     
		boolean expPostDepreciationByYearRadioBtn          					  = true;  
		boolean expFixedAssetsConsolidatingPostingChkbox                      = true; 
		boolean expPostentryduringTransferChkbox              				  = true;  
		boolean expPostentryduringDisposalChkbox         					  = true;  
		
		boolean expAutoCalculatesRateOfDepreciationChkbox            		  = true;  
		boolean expcalculateDepresionBasedOnAccountingYearChkbox			  = true; 	 
		
	    System.out.println("FixedAssets_FixedAssetsLocationDrrpdwn            : " + actFixedAssets_FixedAssetsLocationDrrpdwn         +" Value Expected : " + expFixedAssets_FixedAssetsLocationDrrpdwn);
        System.out.println("FixedAssets_FixesAssetsTagChkbox1                 : " + actFixedAssets_FixesAssetsTagChkbox1              +" Value Expected : " + expFixedAssets_FixesAssetsTagChkbox1);
        System.out.println("FixedAssets_FixesAssetsTagChkbox2             	  : " + actFixedAssets_FixesAssetsTagChkbox2              +" Value Expected : " + expFixedAssets_FixesAssetsTagChkbox2);
        System.out.println("FixedAssets_CreationOfFixedAssetInMandatory       : " + actFixedAssets_CreationOfFixedAssetInMandatory    +" Value Expected : " + expFixedAssets_CreationOfFixedAssetInMandatory);
        System.out.println("AlwaysDefineDepreciationRateAsPercentageChkbox    : " + actAlwaysDefineDepreciationRateAsPercentageChkbox +" Value Expected : " + expAlwaysDefineDepreciationRateAsPercentageChkbox);
        System.out.println("IncludeAssetsInPurchaseAccountSelectionChkbox     : " + actIncludeAssetsInPurchaseAccountSelectionChkbox  +" Value Expected : " + expIncludeAssetsInPurchaseAccountSelectionChkbox);
        System.out.println("FixedAssetsPostDepreciationDefaultRadioBtn        : " + actFixedAssetsPostDepreciationDefaultRadioBtn     +" Value Expected : " + expFixedAssetsPostDepreciationDefaultRadioBtn);
        System.out.println("PostDepreciationByMOnthRadioBtn                   : " + actPostDepreciationByMOnthRadioBtn                +" Value Expected : " + expPostDepreciationByMOnthRadioBtn);
        System.out.println("postFixedMonthlyDepresionRadioBtn                 : " + actpostFixedMonthlyDepresionRadioBtn              +" Value Expected : " + exppostFixedMonthlyDepresionRadioBtn);
        System.out.println("PostDepreciationByYearRadioBtn                    : " + actPostDepreciationByYearRadioBtn                 +" Value Expected : " + expPostDepreciationByYearRadioBtn);
        System.out.println("FixedAssetsConsolidatingPostingChkbox             : " + actFixedAssetsConsolidatingPostingChkbox          +" Value Expected : " + expFixedAssetsConsolidatingPostingChkbox);
        System.out.println("PostentryduringTransferChkbox                     : " + actPostentryduringTransferChkbox                  +" Value Expected : " + expPostentryduringTransferChkbox);
        System.out.println("PostentryduringDisposalChkbox                     : " + actPostentryduringDisposalChkbox                  +" Value Expected : " + expPostentryduringDisposalChkbox);
       
        System.out.println("AutoCalculatesRateOfDepreciationChkbox            : " + actAutoCalculatesRateOfDepreciationChkbox         +" Value Expected : " + expAutoCalculatesRateOfDepreciationChkbox);
        System.out.println("calculateDepresionBasedOnAccountingYearChkbox     : " + actcalculateDepresionBasedOnAccountingYearChkbox  +" Value Expected : " + expcalculateDepresionBasedOnAccountingYearChkbox);
        
        
        boolean displayResult=actFixedAssets_FixedAssetsLocationDrrpdwn==expFixedAssets_FixedAssetsLocationDrrpdwn
        		&& actFixedAssets_FixesAssetsTagChkbox1==expFixedAssets_FixesAssetsTagChkbox1
								&& actFixedAssets_FixesAssetsTagChkbox2==expFixedAssets_FixesAssetsTagChkbox2
								&& actFixedAssets_CreationOfFixedAssetInMandatory==expFixedAssets_CreationOfFixedAssetInMandatory
								&& actAlwaysDefineDepreciationRateAsPercentageChkbox==expAlwaysDefineDepreciationRateAsPercentageChkbox
								&& actIncludeAssetsInPurchaseAccountSelectionChkbox==expIncludeAssetsInPurchaseAccountSelectionChkbox
								&& actFixedAssetsPostDepreciationDefaultRadioBtn==expFixedAssetsPostDepreciationDefaultRadioBtn
								&& actPostDepreciationByMOnthRadioBtn==expPostDepreciationByMOnthRadioBtn
								&& actpostFixedMonthlyDepresionRadioBtn==exppostFixedMonthlyDepresionRadioBtn
								&& actPostDepreciationByYearRadioBtn==expPostDepreciationByYearRadioBtn
								&& actFixedAssetsConsolidatingPostingChkbox==expFixedAssetsConsolidatingPostingChkbox
								&& actPostentryduringTransferChkbox==expPostentryduringTransferChkbox
								&& actPostentryduringDisposalChkbox==expPostentryduringDisposalChkbox
								
								&& actAutoCalculatesRateOfDepreciationChkbox==expAutoCalculatesRateOfDepreciationChkbox
								&& actcalculateDepresionBasedOnAccountingYearChkbox==expcalculateDepresionBasedOnAccountingYearChkbox;
        
        String actDisplayResult=Boolean.toString(displayResult);
        String expDisplayResult=excelReader.getCellData(xlSheetName, 226, 7);
        
        excelReader.setCellData(xlfile, xlSheetName, 226, 8, actDisplayResult);
    
        
		System.out.println("********************************checkmrPInPreferences**************************");
		
		System.out.println("Fixed Assets    : "+actFixedAssetsBtn+" Value Expected : "+expFixedAssetsBtn);
		
		if(actFixedAssetsBtn.equalsIgnoreCase(expFixedAssetsBtn) && 
				actDisplayResult.equalsIgnoreCase(expDisplayResult))
		{
			System.out.println("Test Pass : Fixed Assets Is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 224, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Fixed Assets is Not Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 224, 9, resFail);
			return false;
		}
	 }
	
	
	  
	  @FindBy(xpath="//*[@id='VATContent']/div[1]/div/div[2]/div[5]/label")
	  public static WebElement  vatInputLabel;
	  
	 /* @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[2]/div[3]/div[2]/div/ul/li[2]/button[2]")
	  public static WebElement  vatCreationPageSaveBtn;
	  
	  @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[2]/div[3]/div[2]/div/ul/li[2]/button[5]/i")
	  public static WebElement  vatCreationPageCustCloseBtn;*/
	  
	 
	  
	  @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/div/ul/li[2]/button[5]")
	  public static WebElement  vatCreationPageCustCloseBtn;
	  
	  
	  @FindBy(xpath="//*[@id='dvVAT']/div")
	  public static List<WebElement>  vatCreationPageList;


	  public boolean checkVATInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		System.out.println("********************* checkVATInPreferences Method Executes.............   *****************************");
		
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VatBtn));
		
		boolean actWareHouseManagementBtn  =VatBtn.isDisplayed();
		boolean expWareHouseManagementBtn  =true;
		
		System.out.println("actVatBtnBtn   : "+actWareHouseManagementBtn +" Value Expected : "+expWareHouseManagementBtn);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VatBtn));
		VatBtn.click();
		
			
			
			Thread.sleep(3000);
			getAction().moveToElement(vatMainExpandBtn).build().perform();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatMainExpandBtn));
			vatMainExpandBtn.click();
			
			
			Thread.sleep(3000);
			getAction().moveToElement(vatTaxablePersonDetailsExpandBtn).build().perform();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTaxablePersonDetailsExpandBtn));
			vatTaxablePersonDetailsExpandBtn.click();
			
			Thread.sleep(3000);
			
			Thread.sleep(3000);
			getAction().moveToElement(VatExpandBtn).build().perform();
			Thread.sleep(2000);
			
			boolean actVATBranchSalesTxt					=VATBranchSalesTxt.isDisplayed();
			boolean actVATAdvancePurchaseACTxt				=VATAdvancePurchaseACTxt.isDisplayed();
			boolean actVATCapitalPurchasesACTxt				=VATCapitalPurchasesACTxt.isDisplayed();
			boolean actVATSatSalesTxt						=VATSatSalesTxt.isDisplayed();
			boolean actVATCashAccountTxt					=VATCashAccountTxt.isDisplayed();
			boolean actVATServiceTaxACTxt					=VATServiceTaxACTxt.isDisplayed();
			boolean actVATConsignmentPurchaseACTxt			=VATConsignmentPurchaseACTxt.isDisplayed();
			boolean actVATConsignmentSalesACTxt				=VATConsignmentSalesACTxt.isDisplayed();
			boolean actVATFuelACTxt							=VATFuelACTxt.isDisplayed();
			boolean actVATSalesToEOUTxt						=VATSalesToEOUTxt.isDisplayed();
			boolean actVATInterStatePurchasesACTxt			=VATInterStatePurchasesACTxt.isDisplayed();
			boolean actVATOutputTxt							=VATOutputTxt.isDisplayed();
			boolean actVATInputTxt							=VATInputTxt.isDisplayed();
			boolean actVATSATACTxt							=VATSATACTxt.isDisplayed();
			boolean actVATSatPurchasesTxt					=VATSatPurchasesTxt.isDisplayed();
			boolean actVATAdvanceAccountTxt					=VATAdvanceAccountTxt.isDisplayed();
			boolean actVATInterStateSalesACTxt				=VATInterStateSalesACTxt.isDisplayed();
			boolean actVATExportSalesACTxt					=VATExportSalesACTxt.isDisplayed();
			boolean actVATSalesToDealerTxt					=VATSalesToDealerTxt.isDisplayed();
			
			

			Thread.sleep(3000);
			getAction().moveToElement(vatMainExpandBtn).build().perform();
			Thread.sleep(2000);

			
			boolean actVATFormTypeTxt						=VATFormTypeTxt.isDisplayed();
			boolean actVATDocumentLocationTxt				=VATDocumentLocationTxt.isDisplayed();
			boolean actVATTaxFormFilingTypeTxt				=VATTaxFormFilingTypeTxt.isDisplayed();
			
			
			

			Thread.sleep(3000);
			getAction().moveToElement(vatTaxablePersonDetailsExpandBtn).build().perform();
			Thread.sleep(2000);
		
			boolean actVATTRNTxt							=VATTRNTxt.isDisplayed();
			boolean actVATTaxablePersonNameEngTxt			=VATTaxablePersonNameEngTxt.isDisplayed();
			boolean actVATTaxablePersonNameArbTxt			=VATTaxablePersonNameArbTxt.isDisplayed();
			boolean actVATTaxablePersonAddressTxt			=VATTaxablePersonAddressTxt.isDisplayed();
			boolean actVATTaxAgencyNameTxt					=VATTaxAgencyNameTxt.isDisplayed();
			boolean actVATTANTxt							=VATTANTxt.isDisplayed();
			boolean actVATTaxAgentNameTxt					=VATTaxAgentNameTxt.isDisplayed();
			boolean actVATTAANameTxt						=VATTAANameTxt.isDisplayed();
		
			((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", VATEnableMultiEntryChkBox);
			
			boolean actVATEnableMultiEntryChkBox			=VATEnableMultiEntryChkBox.isDisplayed();
			boolean actVATPercentageTable					=VATPercentageTable.isDisplayed();
			
			
			boolean expVATBranchSalesTxt					=true;
			boolean expVATAdvancePurchaseACTxt				=true;
			boolean expVATCapitalPurchasesACTxt				=true;
			boolean expVATSatSalesTxt						=true;
			boolean expVATCashAccountTxt					=true;
			boolean expVATServiceTaxACTxt					=true;
			boolean expVATConsignmentPurchaseACTxt			=true;
			boolean expVATConsignmentSalesACTxt				=true;
			boolean expVATFormTypeTxt						=true;
			boolean expVATDocumentLocationTxt				=true;
			boolean expVATTaxFormFilingTypeTxt				=true;
			boolean expVATInterStateSalesACTxt				=true;
			boolean expVATSalesToDealerTxt					=true;
			boolean expVATExportSalesACTxt					=true;
			boolean expVATTRNTxt							=true;
			boolean expVATTaxablePersonNameEngTxt			=true;
			boolean expVATTaxablePersonNameArbTxt			=true;
			boolean expVATTaxablePersonAddressTxt			=true;
			boolean expVATTaxAgencyNameTxt					=true;
			boolean expVATTANTxt							=true;
			boolean expVATTaxAgentNameTxt					=true;
			boolean expVATTAANameTxt						=true;
			boolean expVATFuelACTxt							=true;
			boolean expVATSalesToEOUTxt						=true;
			boolean expVATInterStatePurchasesACTxt			=true;
			boolean expVATOutputTxt							=true;
			boolean expVATInputTxt							=true;
			boolean expVATSATACTxt							=true;
			boolean expVATSatPurchasesTxt					=true;
			boolean expVATAdvanceAccountTxt					=true;
			boolean expVATEnableMultiEntryChkBox			=true;
			boolean expVATPercentageTable					=true;
			
			
			System.out.println("*********************************************checkPreferencesVATOptions***********************************************");
			
			System.out.println("VATBranchSalesTxt             : "+actVATBranchSalesTxt             +"  value expected  "+expVATBranchSalesTxt);
			System.out.println("VATAdvancePurchaseACTxt       : "+actVATAdvancePurchaseACTxt       +"  value expected  "+expVATAdvancePurchaseACTxt);
			System.out.println("VATCapitalPurchasesACTxt      : "+actVATCapitalPurchasesACTxt      +"  value expected  "+expVATCapitalPurchasesACTxt);
			System.out.println("VATSatSalesTxt                : "+actVATSatSalesTxt                +"  value expected  "+expVATSatSalesTxt);
			System.out.println("VATCashAccountTxt             : "+actVATCashAccountTxt             +"  value expected  "+expVATCashAccountTxt);
			System.out.println("VATServiceTaxACTxt            : "+actVATServiceTaxACTxt            +"  value expected  "+expVATServiceTaxACTxt);
			System.out.println("VATConsignmentPurchaseACTxt   : "+actVATConsignmentPurchaseACTxt   +"  value expected  "+expVATConsignmentPurchaseACTxt);
			System.out.println("VATConsignmentSalesACTxt      : "+actVATConsignmentSalesACTxt      +"  value expected  "+expVATConsignmentSalesACTxt);
			System.out.println("VATFormTypeTxt                : "+actVATFormTypeTxt                +"  value expected  "+expVATFormTypeTxt);
			System.out.println("VATDocumentLocationTxt        : "+actVATDocumentLocationTxt        +"  value expected  "+expVATDocumentLocationTxt);
			System.out.println("VATTaxFormFilingTypeTxt       : "+actVATTaxFormFilingTypeTxt       +"  value expected  "+expVATTaxFormFilingTypeTxt);
			System.out.println("VATInterStateSalesACTxt       : "+actVATInterStateSalesACTxt       +"  value expected  "+expVATInterStateSalesACTxt);
			System.out.println("VATSalesToDealerTxt           : "+actVATSalesToDealerTxt           +"  value expected  "+expVATSalesToDealerTxt);
			System.out.println("VATExportSalesACTxt           : "+actVATExportSalesACTxt           +"  value expected  "+expVATExportSalesACTxt);
			System.out.println("VATTRNTxt                     : "+actVATTRNTxt                     +"  value expected  "+expVATTRNTxt);
			System.out.println("VATTaxablePersonNameEngTxt    : "+actVATTaxablePersonNameEngTxt    +"  value expected  "+expVATTaxablePersonNameEngTxt);
			System.out.println("VATTaxablePersonNameArbTxt    : "+actVATTaxablePersonNameArbTxt    +"  value expected  "+expVATTaxablePersonNameArbTxt);
			System.out.println("VATTaxablePersonAddressTxt    : "+actVATTaxablePersonAddressTxt    +"  value expected  "+expVATTaxablePersonAddressTxt);
			System.out.println("VATTaxAgencyNameTxt           : "+actVATTaxAgencyNameTxt           +"  value expected  "+expVATTaxAgencyNameTxt);
			System.out.println("VATTANTxt                     : "+actVATTANTxt                     +"  value expected  "+expVATTANTxt);
			System.out.println("VATTaxAgentNameTxt            : "+actVATTaxAgentNameTxt            +"  value expected  "+expVATTaxAgentNameTxt);
			System.out.println("VATTAANameTxt                 : "+actVATTAANameTxt                 +"  value expected  "+expVATTAANameTxt);
			System.out.println("VATFuelACTxt                  : "+actVATFuelACTxt                  +"  value expected  "+expVATFuelACTxt);
			System.out.println("VATSalesToEOUTxt              : "+actVATSalesToEOUTxt              +"  value expected  "+expVATSalesToEOUTxt);
			System.out.println("VATInterStatePurchasesACTxt   : "+actVATInterStatePurchasesACTxt   +"  value expected  "+expVATInterStatePurchasesACTxt);
			System.out.println("VATOutputTxt                  : "+actVATOutputTxt                  +"  value expected  "+expVATOutputTxt);
			System.out.println("VATInputTxt                   : "+actVATInputTxt                   +"  value expected  "+expVATInputTxt);
			System.out.println("VATSATACTxt                   : "+actVATSATACTxt                   +"  value expected  "+expVATSATACTxt);
			System.out.println("VATSatPurchasesTxt            : "+actVATSatPurchasesTxt            +"  value expected  "+expVATSatPurchasesTxt);
			System.out.println("VATAdvanceAccountTxt          : "+actVATAdvanceAccountTxt          +"  value expected  "+expVATAdvanceAccountTxt);
			System.out.println("VATEnableMultiEntryChkBox     : "+actVATEnableMultiEntryChkBox     +"  value expected  "+expVATEnableMultiEntryChkBox);
			System.out.println("VATPercentageTable            : "+actVATPercentageTable            +"  value expected  "+expVATPercentageTable);
			
			boolean diplayResult=actVATBranchSalesTxt==expVATBranchSalesTxt && actVATAdvancePurchaseACTxt==expVATAdvancePurchaseACTxt && actVATCapitalPurchasesACTxt==expVATCapitalPurchasesACTxt &&
									 actVATSatSalesTxt==expVATSatSalesTxt && actVATCashAccountTxt==expVATCashAccountTxt && actVATServiceTaxACTxt==expVATServiceTaxACTxt &&
									 actVATConsignmentPurchaseACTxt==expVATConsignmentPurchaseACTxt && actVATConsignmentSalesACTxt==expVATConsignmentSalesACTxt && 
									 actVATFormTypeTxt==expVATFormTypeTxt && actVATDocumentLocationTxt==expVATDocumentLocationTxt && actVATTaxFormFilingTypeTxt==expVATTaxFormFilingTypeTxt &&
									 actVATInterStateSalesACTxt==expVATInterStateSalesACTxt && actVATSalesToDealerTxt==expVATSalesToDealerTxt && actVATExportSalesACTxt==expVATExportSalesACTxt &&
									 actVATTRNTxt==expVATTRNTxt && actVATTaxablePersonNameEngTxt==expVATTaxablePersonNameEngTxt && actVATTaxablePersonNameArbTxt==expVATTaxablePersonNameArbTxt &&
									 actVATTaxablePersonAddressTxt==expVATTaxablePersonAddressTxt && actVATTaxAgencyNameTxt==expVATTaxAgencyNameTxt && actVATTANTxt==expVATTANTxt &&
									 actVATTaxAgentNameTxt==expVATTaxAgentNameTxt && actVATTAANameTxt==expVATTAANameTxt && actVATFuelACTxt==expVATFuelACTxt && 
									 actVATSalesToEOUTxt==expVATSalesToEOUTxt && actVATInterStatePurchasesACTxt==expVATInterStatePurchasesACTxt && actVATOutputTxt==expVATOutputTxt &&
									 actVATInputTxt==expVATInputTxt && actVATSATACTxt==expVATSATACTxt && actVATSatPurchasesTxt==expVATSatPurchasesTxt && 
									 actVATAdvanceAccountTxt==expVATAdvanceAccountTxt && actVATEnableMultiEntryChkBox==expVATEnableMultiEntryChkBox && actVATPercentageTable==expVATPercentageTable;
			
			
			String actDisplayResult=Boolean.toString(diplayResult);
			String expDisplayResult=excelReader.getCellData(xlSheetName, 229, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 229, 8, actDisplayResult);
			
			if (actDisplayResult.equalsIgnoreCase(expDisplayResult)) 
			{
				
				excelReader.setCellData(xlfile, xlSheetName, 227, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 227, 9, resFail);
				return false;
			}
		  }
		
		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[2]/div/div/ul//li")
		public static List<WebElement> vatInputAccountHeaderList;
	  
		
	  public boolean checkCreateVATInputAccountInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		System.out.println("********************* checkCreateVATInputAccountInPreferences Method Executes.............   *****************************");
		
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatInputLabel));
			vatInputLabel.click();
		
			boolean SummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			
			String actSummaryErrorMessage=Boolean.toString(SummaryErrorMessage);
			String expSummaryErrorMessage=excelReader.getCellData(xlSheetName, 231, 7);

			
			excelReader.setCellData(xlfile, xlSheetName, 231, 8, actSummaryErrorMessage);
			
			System.out.println("Click on New Button and check Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAccountSettingTab));

			boolean actAccountMasterHeaderGeneralTab        = headerGeneralTab.isDisplayed();
			boolean actAccountMasterHeaderAccountSettingTab = headerAccountSettingTab.isDisplayed();
			boolean actAccountMasterHeaderDetailsTab        = headerDetailsTab.isDisplayed();
			boolean actAccountMasterHeaderPrintLayoutTab    = headerPrintLayoutTab.isDisplayed();
			/*boolean actAccountMasterHeaderTreeTab           = extraFields_TreeTabUpdate.isDisplayed();
			boolean actAccountMasterHeaderDocumentTab       = extraFields_DocumentTab.isDisplayed();
			boolean actAccountMasterHeaderCreateTreeTab     = extraFields_CreateTab.isDisplayed();*/

			boolean actAccountMasterHeaderSaveBtn           = vatCreationPageSaveBtn.isDisplayed();
			boolean actAccountMasterHeaderCustCloseBtn          = vatCreationPageCustCloseBtn.isDisplayed();

			boolean expAccountMasterHeaderGeneralTab        = true;
			boolean expAccountMasterHeaderAccountSettingTab = true;
			boolean expAccountMasterHeaderDetailsTab        = true;
			boolean expAccountMasterHeaderPrintLayoutTab    = true;
			/*boolean expAccountMasterHeaderTreeTab           = true;
			boolean expAccountMasterHeaderDocumentTab       = true;
			boolean expAccountMasterHeaderCreateTreeTab     = true;*/

			boolean expAccountMasterHeaderSaveBtn           = true;
			boolean expAccountMasterHeaderCustCloseBtn          = true;

			

			ArrayList<String>actvatInputAccountHeaderList=new ArrayList<String>();
				
			int vatInputAccountHeaderListCount=vatInputAccountHeaderList.size();
				
			System.out.println(" vatInputAccountHeaderListCount  :  "+vatInputAccountHeaderListCount);
				
			for (int i = 0; i < vatInputAccountHeaderListCount; i++)
			{
				String data=vatInputAccountHeaderList.get(i).getText();
				actvatInputAccountHeaderList.add(data);
			}
				
			String actvatInputAccountHeader = actvatInputAccountHeaderList.toString();
			String expvatInputAccountHeader = "[General, Settings, Details, Print Layout, , Tree Tab Update, Document Tab, Create Tab, ]";
				// [General, Settings, Details, Print Layout, Create Tab Update, ]
			System.err.println("  Actual vatInputAccountHeader    : "+actvatInputAccountHeader);
			System.err.println("  Expected  vatInputAccountHeader : "+expvatInputAccountHeader);
				
			excelReader.setCellData(xlfile, xlSheetName, 232, 8, actvatInputAccountHeader);
			
			System.out.println("General Tab Value Actual           : " + actAccountMasterHeaderGeneralTab+        " Value Expected : " + expAccountMasterHeaderGeneralTab);
			System.out.println("Settings Tab Value Actual          : " + actAccountMasterHeaderAccountSettingTab+ " Value Expected : " + expAccountMasterHeaderAccountSettingTab);
			System.out.println("Details Tab Value Actual           : " + actAccountMasterHeaderDetailsTab+        " Value Expected : " + expAccountMasterHeaderDetailsTab);
			System.out.println("Print Layout Tab Value Actual      : " + actAccountMasterHeaderPrintLayoutTab +   " Value Expected : " + expAccountMasterHeaderPrintLayoutTab);
			/*System.out.println("Tree Tab Value Actual              : " + actAccountMasterHeaderTreeTab+           " Value Expected : " + expAccountMasterHeaderTreeTab);
			System.out.println("Document Tab Value Actual          : " + actAccountMasterHeaderDocumentTab+       " Value Expected : " + expAccountMasterHeaderDocumentTab);
			System.out.println("Create Tab Tab Value Actual        : " + actAccountMasterHeaderCreateTreeTab +    " Value Expected : " + expAccountMasterHeaderCreateTreeTab);
			*/System.out.println("Save Button Value Actual           : " + actAccountMasterHeaderSaveBtn+           " Value Expected : " + expAccountMasterHeaderSaveBtn);
			System.out.println("Close Button Value Actual          : " + actAccountMasterHeaderCustCloseBtn+          " Value Expected : " + expAccountMasterHeaderCustCloseBtn);

			System.out.println("****************************************************** MasterCreationPageGenralTab **************************************************************************");

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));

			boolean actAccountMasterGeneralTabNameTxt          = nameTxt.isDisplayed();
			boolean actAccountMasterGeneralCodeTxt             = codeTxt.isDisplayed();
			boolean actAccountMasterGeneralTypeDropdown        = accountTypeDropdown.isDisplayed();
			boolean actAccountMasterGeneralCreditLimitTxt      = creditLimitTxt.isDisplayed();
			boolean actAccountMasterGeneralCreditDaysTxt       = creditdaysTxt.isDisplayed();
			boolean actAccountMasterGeneralChequeDiscountTxt   = chequeDiscountLimitTxt.isDisplayed();
			boolean actAccountMasterGeneralRateOfInterestTxt   = rateofinterestTxt.isDisplayed();
			boolean actAccountMasterGeneralBankAccountTxt      = bankAccountTxt.isDisplayed();
			boolean actAccountMasterGeneralPdcAccountTxt       = pdcDicountAccount.isDisplayed();
			
			boolean expAccountMasterGeneralTabNameTxt          = true;
			boolean expAccountMasterGeneralCodeTxt             = true;
			boolean expAccountMasterGeneralTypeDropdown        = true;
			boolean expAccountMasterGeneralCreditLimitTxt      = true;
			boolean expAccountMasterGeneralCreditDaysTxt       = true;
			boolean expAccountMasterGeneralChequeDiscountTxt   = true;
			boolean expAccountMasterGeneralRateOfInterestTxt   = true;
			boolean expAccountMasterGeneralBankAccountTxt      = true;

			Select oSelect = new Select(accountTypeDropdown);
			List<WebElement> elementCount = oSelect.getOptions();

			int accAccountTypeSize = elementCount.size();
			int expAccountTypeSize = 39;

			System.out.println("Name Value Actual              : " + actAccountMasterGeneralTabNameTxt +       " Value Expected : " + expAccountMasterGeneralTabNameTxt);
			System.out.println("Code Value Actual              : " + actAccountMasterGeneralCodeTxt+           " Value Expected : " + expAccountMasterGeneralCodeTxt);
			System.out.println("Type Value Actual              : " + actAccountMasterGeneralTypeDropdown+      " Value Expected : " + expAccountMasterGeneralTypeDropdown);
			System.out.println("Credit Limit Value Actual      : " + actAccountMasterGeneralCreditLimitTxt+    " Value Expected : " + expAccountMasterGeneralCreditLimitTxt);
			System.out.println("Credit Days Value Actual       : "+ actAccountMasterGeneralCreditDaysTxt +     " Value Expected : " + expAccountMasterGeneralCreditDaysTxt);
			System.out.println("Cheque Disocunt Value Actual   : " + expAccountMasterGeneralChequeDiscountTxt+ " Value Expected : " + expAccountMasterGeneralChequeDiscountTxt);
			System.out.println("Rate Of Interest Value Actual  : " + actAccountMasterGeneralRateOfInterestTxt+ " Value Expected : " + expAccountMasterGeneralChequeDiscountTxt);
			System.out.println("Bank Account Value Actual      : " + actAccountMasterGeneralBankAccountTxt	+  " Value Expected : " + expAccountMasterGeneralRateOfInterestTxt);
			System.out.println("Account Type Value Actual      : " + accAccountTypeSize+                       " Value Expected : " + expAccountTypeSize);
	        
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	     	nameTxt.click();
	     	nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 233, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 234, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.click(); 
			
			Select accountTypeDropdownSelect = new Select(accountTypeDropdown);
			
			accountTypeDropdownSelect.selectByValue(excelReader.getCellData(xlSheetName, 235, 6));
			
			
	     			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatCreationPageSaveBtn));
			vatCreationPageSaveBtn.click();
	     	
			boolean displayResult=  actSummaryErrorMessage.equalsIgnoreCase(expSummaryErrorMessage)
								&& actAccountMasterHeaderGeneralTab == expAccountMasterHeaderGeneralTab
								&& actAccountMasterHeaderAccountSettingTab == expAccountMasterHeaderAccountSettingTab
								&& actAccountMasterHeaderDetailsTab == expAccountMasterHeaderDetailsTab
								&& actAccountMasterHeaderPrintLayoutTab == expAccountMasterHeaderPrintLayoutTab
								/*&& actAccountMasterHeaderTreeTab == expAccountMasterHeaderPrintLayoutTab
								&& actAccountMasterHeaderTreeTab == expAccountMasterHeaderTreeTab
								&& actAccountMasterHeaderDocumentTab == expAccountMasterHeaderDocumentTab
								&& actAccountMasterHeaderCreateTreeTab == expAccountMasterHeaderCreateTreeTab*/
								&& actAccountMasterHeaderSaveBtn == expAccountMasterHeaderSaveBtn
								&& actAccountMasterHeaderCustCloseBtn == expAccountMasterHeaderCustCloseBtn
				
								&& actAccountMasterGeneralTabNameTxt == expAccountMasterGeneralTabNameTxt
								&& actAccountMasterGeneralCodeTxt == expAccountMasterGeneralCodeTxt
								&& actAccountMasterGeneralTypeDropdown == expAccountMasterGeneralTypeDropdown
								&& actAccountMasterGeneralCreditLimitTxt == expAccountMasterGeneralCreditLimitTxt
								&& actAccountMasterGeneralChequeDiscountTxt == expAccountMasterGeneralChequeDiscountTxt
								&& actAccountMasterGeneralRateOfInterestTxt == expAccountMasterGeneralRateOfInterestTxt
								&& actAccountMasterGeneralBankAccountTxt == expAccountMasterGeneralBankAccountTxt
								&& accAccountTypeSize == expAccountTypeSize;
			
			
			String actDisplayResult=Boolean.toString(displayResult);
			String expDisplayResult=excelReader.getCellData(xlSheetName, 236, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 236, 8, actDisplayResult);
			
			
			if (actDisplayResult.equalsIgnoreCase(expDisplayResult) && 
					actvatInputAccountHeader.equalsIgnoreCase(expvatInputAccountHeader))
					
			{
				excelReader.setCellData(xlfile, xlSheetName, 230, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 230, 9, resFail);
				return false;
			}
		 
	  }	
	  
	  
	  
	  
	  
	  public boolean checkSaveVATAccountsInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		System.out.println("********************* checkVATInPreferences Method Executes.............   *****************************");
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATCashAccountTxt));
			VATCashAccountTxt.click();
			VATCashAccountTxt.sendKeys(Keys.END);
			VATCashAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			Thread.sleep(3000);
			VATCashAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 238, 6));
			Thread.sleep(3000);
			VATCashAccountTxt.sendKeys(Keys.TAB);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATOutputTxt));
			VATOutputTxt.click();
			VATOutputTxt.sendKeys(excelReader.getCellData(xlSheetName, 240, 6));
			Thread.sleep(3000);
			VATOutputTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATInputTxt));
			VATInputTxt.click();
			VATInputTxt.sendKeys(excelReader.getCellData(xlSheetName, 239, 6));
			Thread.sleep(3000);
			VATInputTxt.sendKeys(Keys.TAB);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATSATACTxt));
			VATSATACTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATSatPurchasesTxt));
			VATSatPurchasesTxt.click();
			VATSatPurchasesTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATAdvanceAccountTxt));
			VATAdvanceAccountTxt.click();
			VATAdvanceAccountTxt.sendKeys(excelReader.getCellData(xlSheetName, 241, 6));
			Thread.sleep(3000);
			VATAdvanceAccountTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATAdvancePurchaseACTxt));
			VATAdvancePurchaseACTxt.click();
			VATAdvancePurchaseACTxt.sendKeys(excelReader.getCellData(xlSheetName, 242, 6));
			Thread.sleep(3000);
			VATAdvancePurchaseACTxt.sendKeys(Keys.TAB);
		
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
			UpdateBtn.click();
			
			getWaitForAlert();
			
			boolean AlertPresent = getIsAlertPresent();
			
			String actAlertPresent=Boolean.toString(AlertPresent);
			String expAlertPresent=excelReader.getCellData(xlSheetName, 243, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 243, 8, actAlertPresent);
			
			System.out.println("Select Options In Inventory Tab and Click on Update  Value Actual : " + actAlertPresent +  " Value Expected : " + expAlertPresent);
		       
			String actMessageOnUpdateInAlert = getAlert().getText();
			String expMessageOnUpdateInAlert = excelReader.getCellData(xlSheetName, 244, 7);
			
			
			excelReader.setCellData(xlfile, xlSheetName, 244, 8, actMessageOnUpdateInAlert);
			
			System.out.println("Select Options In Inventory Tab and Click on Ok  Value Actual : " + actMessageOnUpdateInAlert +  " Value Expected : " + expMessageOnUpdateInAlert);
		    
			getAlert().accept();
	        
			String expMessage = excelReader.getCellData(xlSheetName, 245, 7);
			 
			String actMessage = checkValidationMessage(expMessage);
			 
			excelReader.setCellData(xlfile, xlSheetName, 245, 8, actMessage);
			
	     	System.out.println("COGS POSTING Item Save Value Actual : " + actMessage + "  Value Expected : " + expMessage);	
	 	
			if(actAlertPresent.equalsIgnoreCase(expAlertPresent) && actMessageOnUpdateInAlert.equalsIgnoreCase(expMessageOnUpdateInAlert)
					&& actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 237, 9, resPass);
				return true;
				
			}
			else
			{
				System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 237, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 237, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
		
	  }

		@FindBy(xpath = "//*[@id='OpenPOSMainScreenOnLogin']/following-sibling::span")
		public static WebElement OpenPOSMainScreenOnLoginChkbox;
		
		@FindBy(xpath = "//*[@id='OpenPOSMainScreenOnLogin']")
		public static WebElement OpenPOSMainScreenOnLoginChkboxSelected;
		
		@FindBy(xpath = "//*[@id='AdvanceBillPrintingFormat']/following-sibling::span")
		public static WebElement AdvanceBillPrintingFormatChkbox;
		
		@FindBy(xpath = "//*[@id='AdvanceBillPrintingFormat']")
		public static WebElement AdvanceBillPrintingFormatChkboxSelected;
		
		@FindBy(xpath = "//*[@id='BindCounterToMacAddress']/following-sibling::span")
		public static WebElement BindCounterToMacAddressChkbox;
		
		@FindBy(xpath = "//*[@id='BindCounterToMacAddress']")
		public static WebElement BindCounterToMacAddressChkboxSelected;

	  
		public boolean checkPOSInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PosBtn));
			
			boolean POS  =PosBtn.isDisplayed();
			
			String actPosBtn=Boolean.toString(POS);
			
			
			String expPosBtn  =excelReader.getCellData(xlSheetName, 247, 7);
		    
		    excelReader.setCellData(xlfile, xlSheetName, 247, 8, actPosBtn);
			
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PosBtn));
		    PosBtn.click();	
			Thread.sleep(2000);
		    
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OpenPOSMainScreenOnLoginChkbox));
		 	
			boolean actOpenPOSMainScreenOnLoginChkbox               = OpenPOSMainScreenOnLoginChkboxSelected.isDisplayed();
			boolean actAdvanceBillPrintingFormatChkbox              = AdvanceBillPrintingFormatChkboxSelected.isDisplayed();
			boolean actBindCounterToMacAddressChkbox                = BindCounterToMacAddressChkboxSelected.isDisplayed();
			
			
			
			boolean expOpenPOSMainScreenOnLoginChkbox               = true;
			boolean expAdvanceBillPrintingFormatChkbox              = true;
			boolean expBindCounterToMacAddressChkbox          		= true;
		
			
			
			
			System.out.println("******************************checkPOSInPreferences************************");
			
			System.out.println("OpenPOSMainScreenOnLoginChkbox               : "+actOpenPOSMainScreenOnLoginChkbox      +" Value Expected : "+expOpenPOSMainScreenOnLoginChkbox);
			System.out.println("AdvanceBillPrintingFormatChkbox                 : "+actAdvanceBillPrintingFormatChkbox   +" Value Expected : "+expAdvanceBillPrintingFormatChkbox);
			System.out.println("BindCounterToMacAddressChkbox          : "+actBindCounterToMacAddressChkbox    +" Value Expected : "+expBindCounterToMacAddressChkbox);
			
		
			
			
			
			boolean actMethod= actOpenPOSMainScreenOnLoginChkbox==expOpenPOSMainScreenOnLoginChkbox
					&& actAdvanceBillPrintingFormatChkbox==expAdvanceBillPrintingFormatChkbox && 
					actBindCounterToMacAddressChkbox==expBindCounterToMacAddressChkbox;
				
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 248, 7);
	        
	        excelReader.setCellData(xlfile, xlSheetName, 248, 8, actResult);
			
		    
			System.out.println("********************************checkProductionInPreferences**************************");
			
			
			System.out.println("Display Result        : "+actResult            +" Value Expected : "+expResult);
			
			
			if (actResult.equalsIgnoreCase(expResult))
			{
				System.out.println("Test Pass : Production Is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 246, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Production is Not Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 246, 9, resFail);
				return false;
			}
		 }
		


		@FindBy(xpath = "//*[@id='WarehouseSettingsContent']/div/label")
		public static List<WebElement> warehouseMangementList;
		
		//*[@id="EnquiryScreenFieldsSettings"]/button
		
		@FindBy(xpath = "//*[@id='WarehouseSettings']/button")
		public static WebElement warehouseMangementSettingExpandBtn;
		
		@FindBy(xpath = "//*[@id='EnquiryScreenFieldsSettings']/button")
		public static WebElement warehouseMangementEnqireyScreenListExpandBtn;
		
		@FindBy(xpath = "//*[@id='dvEnquiryScreenFields']//label")
		public static List<WebElement>  warehouseMangementEnqireyScreenList;
		
		@FindBy(xpath = "//*[@id='dvWMS']/div[2]/div/label")
		public static List<WebElement> warehouseMangementDefaultStatusBelowCheckboxList;
		
		
		
	
		public boolean checkWarehouseMangementInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseManagementBtn));
			
			boolean actWareHouseManagementBtn  =WareHouseManagementBtn.isDisplayed();
			boolean expWareHouseManagementBtn  =true;
			
			System.out.println("actWareHouseManagementBtn   : "+actWareHouseManagementBtn +" Value Expected : "+expWareHouseManagementBtn);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(WareHouseManagementBtn));
			WareHouseManagementBtn.click();
			
			
			
			Thread.sleep(2000);
			
	        ArrayList<String>actwarehouseMangementList=new ArrayList<String>();
			
			int warehouseMangementListCount=warehouseMangementList.size();
			int expwarehouseMangementListCount=18;
			
			
			System.out.println(" warehouseMangementList  :  "+warehouseMangementListCount+"Value :"+expwarehouseMangementListCount);
			
			for (int i = 0; i < warehouseMangementListCount; i++)
			{
				String data=warehouseMangementList.get(i).getText();
				actwarehouseMangementList.add(data);
			}
			
			String actwarehouseMangement=actwarehouseMangementList.toString();
			String expwarehouseMangement="[Sales return note, Returns, Mobile app Stock check alert template, Default bin(location)for receiving, Default bin(location)for shipping, Default Status, Skid nomenclature, Auto release picklist(days) before ship date, Reservation Policy, Priority, Default Receipt Method, Status change document, Many to one move document, One to many document, Shortage of stock document, Excess of stock document, Posting Bill, Post WMS billing]";
			
			System.err.println("  Actual WarehouseManagement    : "+actwarehouseMangement);
			System.err.println("  Expected  WarehouseManagement : "+expwarehouseMangement);
			
			excelReader.setCellData(xlfile, xlSheetName, 250, 8, actwarehouseMangement);
			
			Thread.sleep(2000);
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseMangementSettingExpandBtn));
			warehouseMangementSettingExpandBtn.click();*/
			
			Thread.sleep(6000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseMangementEnqireyScreenListExpandBtn));
			warehouseMangementEnqireyScreenListExpandBtn.click();
			
			
            ArrayList<String>actwarehouseMangementEnqireyScreenList=new ArrayList<String>();
			
			int warehouseMangementEnqireyScreenListCount=warehouseMangementEnqireyScreenList.size();
			int expwarehouseMangementEnqireyScreenListCount=82;
			
			
			System.out.println(" warehouseMangementEnqireyScreenList  :  "+warehouseMangementEnqireyScreenListCount+ "Value "+expwarehouseMangementEnqireyScreenListCount);
			
			for (int i = 0; i < warehouseMangementEnqireyScreenListCount; i++)
			{
				String data=warehouseMangementEnqireyScreenList.get(i).getText();
				actwarehouseMangementEnqireyScreenList.add(data);
			}
			
			String actwarehouseMangementEnqireyScreen=actwarehouseMangementEnqireyScreenList.toString();
			String expwarehouseMangementEnqireyScreen="[Name, Code, Alias, ABC-code carrying cost, ABC-code margin, ABC-code revenue, ABC-code value, Alternate Category, Barcode 1, Barcode 2, Barcode 3, Bin, Bin Capacity, BOM, Category, Cost of Excess Stock A/C, Cost of issue account, Cost of Sale Return A/C, Cost of Shortage Stock A/C, Default Base Unit, Default Purchase Unit, Default Replenishment, Default Sales Unit, Description, Do not show the Items expire within (days), Don’t show products expiring in (Days), Extra Field Update On, Flushing, Height, Image, Indirect Cost %, Item Make, Item Type, Length, Manufacture Policy, Overhead cost, Packing BOM, Perishable Item, Printer, Profit %, Purchase Variance A/C, Reorder Level, Sales account, Standard Cost, Stocks account, Tax Code, Valuation Method, Weight, Width, WIP Account, Group Name, Group Code, Group Level 1, Group Level 1 Code, Buying Rate, Po, Pt,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , Selling Rate, So, St,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]";
			
			System.err.println("  Actual warehouseMangementEnqireyScreenList    : "+actwarehouseMangementEnqireyScreen);
			System.err.println("  Expected  warehouseMangementEnqireyScreenList : "+expwarehouseMangementEnqireyScreen);
			
			excelReader.setCellData(xlfile, xlSheetName, 251, 8, actwarehouseMangementEnqireyScreen);	
			
            ArrayList<String>actwarehouseMangementRightSidePannelList=new ArrayList<String>();
			
			int warehouseMangementRightSidePannelListCount=warehouseMangementDefaultStatusBelowCheckboxList.size();
			int expwarehouseMangementRightSidePannelListCount=82;
			
			System.out.println(" warehouseMangementRightSidePannelList  :  "+warehouseMangementRightSidePannelListCount+"value "+ expwarehouseMangementRightSidePannelListCount);
			
			for (int i = 0; i < warehouseMangementRightSidePannelListCount; i++)
			{
				String data=warehouseMangementDefaultStatusBelowCheckboxList.get(i).getText();
				actwarehouseMangementRightSidePannelList.add(data);
			}
			
			String actwarehouseMangementRightSidePannel=actwarehouseMangementRightSidePannelList.toString();
			String expwarehouseMangementRightSidePannel=excelReader.getCellData(xlSheetName, 252, 7);
			
			System.err.println("  Actual warehouseMangementEnqireyScreenPanelList    : "+actwarehouseMangementRightSidePannel);
			System.err.println("  Expected  warehouseMangementEnqireyScreenPanelList : "+expwarehouseMangementRightSidePannel);
			
			excelReader.setCellData(xlfile, xlSheetName, 252, 8, actwarehouseMangementRightSidePannel);
			
			
			
			System.out.println("********************************checkWarehouseMangementInPreferences**************************");
			
			System.out.println("WareHouseManagementBtn    : "+actWareHouseManagementBtn+" Value Expected : "+expWareHouseManagementBtn);
			
			if(actWareHouseManagementBtn==expWareHouseManagementBtn && warehouseMangementListCount==expwarehouseMangementListCount && 
					warehouseMangementEnqireyScreenListCount==expwarehouseMangementEnqireyScreenListCount && 
					warehouseMangementRightSidePannelListCount==expwarehouseMangementRightSidePannelListCount && 
					actwarehouseMangement.equalsIgnoreCase(expwarehouseMangement) && 
					actwarehouseMangementEnqireyScreen.equalsIgnoreCase(expwarehouseMangementEnqireyScreen) && 
					actwarehouseMangementRightSidePannel.equalsIgnoreCase(actwarehouseMangementRightSidePannel))
			{
				System.out.println("Test Pass : Warehouse Mangement Is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 249, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Warehouse Mangement is Not Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 249, 9, resFail);
				return false;
			}
		 }
		
		
		
			
		
		@FindBy(xpath = "//*[@id='dvLetterofCredit']//div/label")
		public static List<WebElement> letterOFCreditList;
		
		
		

		
		public boolean checkLetterForCreditInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LetterForCreditBtn));
			
			boolean LetterForCredit  =LetterForCreditBtn.isDisplayed();
			
			
			String actLetterForCreditBtn=Boolean.toString(LetterForCredit);
			String expLetterForCreditBtn=excelReader.getCellData(xlSheetName, 255, 7);
	        
	        excelReader.setCellData(xlfile, xlSheetName, 255, 8, actLetterForCreditBtn);
			
			
	        Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LetterForCreditBtn));
			LetterForCreditBtn.click();	
			
			Thread.sleep(2000);
	        
            ArrayList<String>actletterOFCreditList=new ArrayList<String>();
			
			int letterOFCreditListCount=letterOFCreditList.size();
			int expletterOFCreditListCount=12;
			
			System.out.println(" letterOFCreditListCount :  "+letterOFCreditListCount);
			
			for (int i = 0; i < letterOFCreditListCount; i++)
			{
				String data=letterOFCreditList.get(i).getText();
				actletterOFCreditList.add(data);
			}
			
			String actletterOFCredit=actletterOFCreditList.toString();
			String expletterOFCredit=/*excelReader.getCellData(xlSheetName, 254, 7)*/"[Bank Payment, TR Payments, Bank Receipts, TR Receipts, Acceptance Payment, Acceptance Receipt, Margin Posting, Acceptance PDC Payment, Acceptance PDC Receipt, Vouchertype For Interest Posting, Interest Account, Consider Margin As Deposit]";
			
			System.err.println("  Actual letterOFCreditList    : "+actletterOFCredit);
			System.err.println("  Expected  letterOFCreditList : "+expletterOFCredit);
			
			excelReader.setCellData(xlfile, xlSheetName, 254, 8, actletterOFCredit);
			
	        
	        
			System.out.println("********************************checkLetterForCreditInPreferences**************************");
			
			System.out.println("actLetterForCreditBtn    : "+actLetterForCreditBtn+" Value Expected : "+expLetterForCreditBtn);
			
			if(actLetterForCreditBtn.equalsIgnoreCase(expLetterForCreditBtn) && 
					actletterOFCredit.equalsIgnoreCase(expletterOFCredit))
			{
				System.out.println("Test Pass : LetterForCredit Is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 253, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : LetterForCredit is Not Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 253, 9, resFail);
				return false;
			}
		 }
		
		
	
		
		
		public boolean checkPronghornInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PronghornBnt));
			
			boolean Pronghorn  =PronghornBnt.isDisplayed();
			
			
			String actPronghornBnt=Boolean.toString(Pronghorn);
			String expPronghornBnt=excelReader.getCellData(xlSheetName, 257, 7);
	        
	        excelReader.setCellData(xlfile, xlSheetName, 257, 8, actPronghornBnt);
			
	      
	        
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PronghornBnt));
			PronghornBnt.click();	
			
			Thread.sleep(2000);
			
			if(enableProghornChkboxSelected.isSelected()==false)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableProghornChkbox));
				enableProghornChkbox.click();	
			}
			
			System.out.println("enableProghornChkboxSelected.isSelected():   ?"+enableProghornChkboxSelected.isSelected());
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(prog_PreferenceChkbox));
			
			boolean actprog_PreferenceChkbox                  =prog_PreferenceChkbox.isDisplayed();
			boolean actprog_LinksChkbox                       =prog_LinksChkbox.isDisplayed();
			boolean actprog_ReservationChkbox                 =prog_ReservationChkbox.isDisplayed();
			boolean actprog_VoucherWizardChkbox  			  =prog_VoucherWizardChkbox.isDisplayed();
			boolean actprog_BatchesChkbox                     =prog_BatchesChkbox.isDisplayed();
			boolean actprog_StockChkbox                       =prog_StockChkbox.isDisplayed();
			boolean actprog_MasterChkBox                      =prog_MasterChkBox.isDisplayed();
			boolean actprog_priceChkbox                       =prog_priceChkbox.isDisplayed();
			
			boolean expprog_PreferenceChkbox                  =true;
			boolean expprog_LinksChkbox                       =true;
			boolean expprog_ReservationChkbox                 =true;
			boolean expprog_VoucherWizardChkbox               =true;
			boolean expprog_BatchesChkbox                     =true;
			boolean expprog_StockChkbox                       =true;
			boolean expprog_MasterChkBox                      =true;
			boolean expprog_priceChkbox                       =true;
			
			System.out.println("******************************checkPronghornInPreferences************************");
			
			System.out.println("prog_PreferenceChkbox     : "+actprog_PreferenceChkbox       +" Value Expected : "+expprog_PreferenceChkbox);
			System.out.println("prog_LinksChkbox          : "+actprog_LinksChkbox            +" Value Expected : "+expprog_LinksChkbox);
			System.out.println("prog_ReservationChkbox    : "+actprog_ReservationChkbox      +" Value Expected : "+expprog_ReservationChkbox);
			System.out.println("prog_VoucherWizardChkbox  : "+actprog_VoucherWizardChkbox    +" Value Expected : "+expprog_VoucherWizardChkbox);
			System.out.println("prog_BatchesChkbox        : "+actprog_BatchesChkbox          +" Value Expected : "+expprog_BatchesChkbox);
			System.out.println("prog_StockChkbox          : "+actprog_StockChkbox            +" Value Expected : "+expprog_StockChkbox);
			System.out.println("prog_MasterChkBox         : "+actprog_MasterChkBox           +" Value Expected : "+expprog_MasterChkBox);
			System.out.println("prog_priceChkbox          : "+actprog_priceChkbox            +" Value Expected : "+expprog_priceChkbox);
			
			
			boolean actMethod=actprog_PreferenceChkbox==expprog_PreferenceChkbox && actprog_LinksChkbox==expprog_LinksChkbox && 
					actprog_ReservationChkbox==expprog_ReservationChkbox && actprog_VoucherWizardChkbox==expprog_VoucherWizardChkbox && 
					actprog_BatchesChkbox==expprog_BatchesChkbox && actprog_StockChkbox==expprog_StockChkbox && 
					actprog_MasterChkBox==expprog_MasterChkBox && actprog_priceChkbox==expprog_priceChkbox;
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 258, 7);
	        
	        excelReader.setCellData(xlfile, xlSheetName, 258, 8, actResult);
			
			
	        if (enableProghornChkboxSelected.isSelected()==true)
	        {
	        	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableProghornChkbox));
	 			 enableProghornChkbox.click();	
	 	        
			}
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
			UpdateBtn.click();
			
			getWaitForAlert();
				    
			getAlert().accept();
			
			
	        
			if(actPronghornBnt.equalsIgnoreCase(expPronghornBnt)  && 
					actResult.equalsIgnoreCase(expResult))
			{
				System.out.println("Test Pass : Pronghorn Is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 256, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Pronghorn is Not Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 256, 9, resFail);
				return false;
			}
		 }
		
		
		public boolean checkSavedOptionsInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
			CustCloseBtn.click();
			

			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();	
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
			ConfigureTransactionBtn.click();			
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TagsBtn));
			TagsBtn.click();
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountingDropdown));

			Select s1=new Select(AccountingDropdown);
			Select s2=new Select(InventoryDropdown);
			Select s3=new Select(SellingsRateDropdown);
			Select s4=new Select(BuyingRatesdropdown);
			
			String actAccountingDropdown=s1.getFirstSelectedOption().getText();
			String expAccountingDropdown=excelReader.getCellData(xlSheetName, 260, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 260, 8, actAccountingDropdown);
						
			String actInventoryDropdown=s2.getFirstSelectedOption().getText();
			String expInventoryDropdown=excelReader.getCellData(xlSheetName, 261, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 261, 8, actInventoryDropdown);
			
			String actSellingsRateDropdown=s3.getFirstSelectedOption().getText();
			String expSellingsRateDropdown=excelReader.getCellData(xlSheetName, 262, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 262, 8, actSellingsRateDropdown);
			
			String actBuyingRatesdropdown=s4.getFirstSelectedOption().getText();
			String expBuyingRatesdropdown=excelReader.getCellData(xlSheetName, 263, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 263, 8, actBuyingRatesdropdown);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountsBtn));
			AccountsBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc_NegCashBankChkbox));
			
			Boolean NegativeCashBalanceChkBox=acc_NegCashBankChkboxSelected.isSelected();
			
			String  actacc_NegCashBankChkbox=Boolean.toString(NegativeCashBalanceChkBox);
			String expacc_NegCashBankChkbox=excelReader.getCellData(xlSheetName, 265, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 265, 8, actacc_NegCashBankChkbox);
			
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkNegativeCashByTagChkBox));
			
			Boolean NegativeCashByTagChkBox=checkNegativeCashByTagChkBoxSelected.isSelected();
			
			String  actcheckNegativeCashByTagChkBox=Boolean.toString(NegativeCashByTagChkBox);
			String expcheckNegativeCashByTagChkBox=excelReader.getCellData(xlSheetName, 266, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 266, 8, actcheckNegativeCashByTagChkBox);
			
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BudgetBtn));
			BudgetBtn.click();
	        
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ARAPBtn));
			ARAPBtn.click();
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableCreditLimitCheckChkBox));
			
            Boolean enableCreditLimit=enableCreditLimitCheckChkBoxSelected.isSelected();
			
			String actenableCreditLimitCheckChkBox=Boolean.toString(enableCreditLimit);
			String expenableCreditLimitCheckChkBox=excelReader.getCellData(xlSheetName, 267, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 267, 8, actenableCreditLimitCheckChkBox);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickCreditDayFromChkBox));
            Boolean pickCreditDay=enableCreditLimitCheckChkBoxSelected.isSelected();
			
			String actpickCreditDayFromChkBox=Boolean.toString(enableCreditLimit);
			String exppickCreditDayFromChkBox=excelReader.getCellData(xlSheetName, 268, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 268, 8, actpickCreditDayFromChkBox);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dependsOnMaintainBillWiseForARAPChkBox));
		    Boolean dependsOnMaintainBillWiseForARAP=enableCreditLimitCheckChkBoxSelected.isSelected();
			String actdependsOnMaintainBillWiseForARAPChkBox=Boolean.toString(enableCreditLimit);
			String expdependsOnMaintainBillWiseForARAPChkBox=excelReader.getCellData(xlSheetName, 269, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 269, 8, actdependsOnMaintainBillWiseForARAPChkBox);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maintainARTransactionCurrenciesChkBox));
			Boolean maintainARTransactionCurrencies=maintainARTransactionCurrenciesChkBoxSelected.isSelected();
			String actmaintainARTransactionCurrenciesChkBox=Boolean.toString(maintainARTransactionCurrencies);
			String expmaintainARTransactionCurrenciesChkBox=excelReader.getCellData(xlSheetName, 270, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 270, 8, actmaintainARTransactionCurrenciesChkBox);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maintainAPTransactionCurrenciesChkBox));
			Boolean maintainAPTransactionCurrencies=maintainAPTransactionCurrenciesChkBoxSelected.isSelected();
			String actmaintainAPTransactionCurrenciesChkBox=Boolean.toString(maintainAPTransactionCurrencies);
			String expmaintainAPTransactionCurrenciesChkBox=excelReader.getCellData(xlSheetName, 271, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 271, 8, actmaintainAPTransactionCurrenciesChkBox);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inputNarrationInReferenceChkBox));
			Boolean inputNarrationInReference=maintainAPTransactionCurrenciesChkBoxSelected.isSelected();
			String actinputNarrationInReferenceChkBox=Boolean.toString(inputNarrationInReference);
			String expinputNarrationInReferenceChkBox=excelReader.getCellData(xlSheetName, 272, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 272, 8, actinputNarrationInReferenceChkBox);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableOverDueCheckChkBox));
			Boolean enableOverDue=maintainAPTransactionCurrenciesChkBoxSelected.isSelected();
			String actenableOverDueCheckChkBox=Boolean.toString(enableOverDue);
			String expenableOverDueCheckChkBox=excelReader.getCellData(xlSheetName, 273, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 273, 8, actenableOverDueCheckChkBox);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(apTagChkBox));
			Boolean apTag=apTagChkBoxSelected.isSelected();
			String actapTagChkBox=Boolean.toString(apTag);
			String expapTagChkBox=excelReader.getCellData(xlSheetName, 274, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 274, 8, actapTagChkBox);
			
	        

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(arTagChkBox));
			
			boolean actarTagChkBoxIsSelected=  arTagChkBoxSelected.isSelected();
			boolean exparTagChkBoxIsSelected=true;
			
			boolean actapTagChkBoxIsSelected=  apTagChkBox.isSelected();
			boolean expapTagChkBoxIsSelected=true;
			
			String actarTagTxt  =arTagTxt.getAttribute("value");
			String exparTagTxt  ="Department";
			
			String actapTagTxt  =apTagTxt.getAttribute("value");
			String expapTagTxt  ="Department";
	        
			
			
			
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiselleanousBtn));
			MiselleanousBtn.click();
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enableLocalCurrencyChkBox));
            Boolean enableLocalCurrency=enableLocalCurrencyChkBoxSelected.isSelected();
			String actenableLocalCurrencyChkBox=Boolean.toString(enableCreditLimit);
			String expenableLocalCurrencyChkBox=excelReader.getCellData(xlSheetName, 275, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 275, 8, actenableLocalCurrencyChkBox);
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(localCurrencyTxt));
		
	        String actlocalCurrencyTxt=localCurrencyTxt.getAttribute("value");
	        String explocalCurrencyTxt=excelReader.getCellData(xlSheetName, 276, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 276, 8, actlocalCurrencyTxt);
	        
			
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PDCBtn));
			PDCBtn.click();
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(postDatedChequeChkbox));
            Boolean postDatedCheque=postDatedChequeChkboxSelected.isSelected();
			String actpostDatedChequeChkbox=Boolean.toString(postDatedCheque);
			String exppostDatedChequeChkbox=excelReader.getCellData(xlSheetName, 277, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 277, 8, actpostDatedChequeChkbox);

	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(displayLedgerAndBalanceChkbox));
	        Boolean displayLedgerAndBalance=displayLedgerAndBalanceChkboxSelected.isSelected();
			String actdisplayLedgerAndBalanceChkbox=Boolean.toString(displayLedgerAndBalance);
			String expdisplayLedgerAndBalanceChkbox=excelReader.getCellData(xlSheetName, 278, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 278, 8, actdisplayLedgerAndBalanceChkbox);
	        
	    
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryBtn));
			InventoryBtn.click();
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CheckNegativeStockChkBox));
            Boolean CheckNegativeStock=CheckNegativeStockChkBoxSelected.isSelected();
			String actCheckNegativeStockChkBox=Boolean.toString(postDatedCheque);
			String expCheckNegativeStockChkBox=excelReader.getCellData(xlSheetName, 279, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 279, 8, actCheckNegativeStockChkBox);
	       
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CheckNegativeStockWarnandAllowRadio));
            Boolean CheckNegativeStockWarnandAllow=CheckNegativeStockWarnandAllowRadio.isSelected();
			String actCheckNegativeStockWarnandAllowRadio=Boolean.toString(CheckNegativeStockWarnandAllow);
			String expCheckNegativeStockWarnandAllowRadio=excelReader.getCellData(xlSheetName, 280, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 280, 8, actCheckNegativeStockWarnandAllowRadio);
	       
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MaintainQtyAndValuebyWareHouseRadio));
            Boolean MaintainQtyAndValuebyWareHouse=MaintainQtyAndValuebyWareHouseRadio.isSelected();
			String actMaintainQtyAndValuebyWareHouseRadio=Boolean.toString(MaintainQtyAndValuebyWareHouse);
			String expMaintainQtyAndValuebyWareHouseRadio=excelReader.getCellData(xlSheetName, 281, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 281, 8, actMaintainQtyAndValuebyWareHouseRadio);
	       
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(IncludeReserveStockInStockLedgerChkBox));
            Boolean IncludeReserveStockInStockLedger=IncludeReserveStockInStockLedgerChkBoxSelected.isSelected();
			String actIncludeReserveStockInStockLedgerChkBox=Boolean.toString(IncludeReserveStockInStockLedger);
			String expIncludeReserveStockInStockLedgerChkBox=excelReader.getCellData(xlSheetName, 282, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 282, 8, actIncludeReserveStockInStockLedgerChkBox);
	       
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InputUnitInTransactionsChkBox));
            Boolean InputUnitInTransactions=IncludeReserveStockInStockLedgerChkBoxSelected.isSelected();
			String actInputUnitInTransactionsChkBox=Boolean.toString(InputUnitInTransactions);
			String expInputUnitInTransactionsChkBox=excelReader.getCellData(xlSheetName, 283, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 283, 8, actInputUnitInTransactionsChkBox);
	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateMRNValueStockThroughPurchaseChkBox));
            Boolean UpdateMRNValueStockThroughPurchase=IncludeReserveStockInStockLedgerChkBoxSelected.isSelected();
			String actUpdateMRNValueStockThroughPurchaseChkBox=Boolean.toString(UpdateMRNValueStockThroughPurchase);
			String expUpdateMRNValueStockThroughPurchaseChkBox=excelReader.getCellData(xlSheetName, 284, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 284, 8, actUpdateMRNValueStockThroughPurchaseChkBox);
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ReservationByBinChkBox));
            Boolean ReservationByBin=IncludeReserveStockInStockLedgerChkBoxSelected.isSelected();
			String actReservationByBinChkBox=Boolean.toString(ReservationByBin);
			String expReservationByBinChkBox=excelReader.getCellData(xlSheetName, 285, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 285, 8, actReservationByBinChkBox);
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ReservationByRMAChkBox));
            Boolean ReservationByRMA=ReservationByRMAChkBoxSelected.isSelected();
			String actReservationByRMAChkBox=Boolean.toString(ReservationByRMA);
			String expReservationByRMAChkBox=excelReader.getCellData(xlSheetName, 286, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 286, 8, actReservationByRMAChkBox);
	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ReservationByRMAChkBox));
            boolean actIncludeReserveStockInStockCheckChkBox=IncludeReserveStockInStockCheckChkBoxSelected.isSelected();
			
			boolean expIncludeReserveStockInStockCheckChkBox=true;
	        
	        
	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BatchBtn));
			BatchBtn.click();
			
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EnableBatchesNoChkBox));
            Boolean EnableBatchesNo=EnableBatchesNoChkBoxSelected.isSelected();
			String actEnableBatchesNoChkBox=Boolean.toString(EnableBatchesNo);
			String expEnableBatchesNoChkBox=excelReader.getCellData(xlSheetName, 287, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 287, 8, actEnableBatchesNoChkBox);
	    	
			
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExpiryDatesOfBatchesChkBox));
            Boolean ExpiryDatesOfBatches=ExpiryDatesOfBatchesChkBoxSelected.isSelected();
			String actExpiryDatesOfBatchesChkBox=Boolean.toString(ExpiryDatesOfBatches);
			String expExpiryDatesOfBatchesChkBox=excelReader.getCellData(xlSheetName, 288, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 288, 8, actExpiryDatesOfBatchesChkBox);
	    	
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RMABtn));
			RMABtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RmaSupportChkBox));
            Boolean RmaSupport=RmaSupportChkBoxSelected.isSelected();
			String actRmaSupportChkBox=Boolean.toString(RmaSupport);
			String expRmaSupportChkBox=excelReader.getCellData(xlSheetName, 289, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 289, 8, actRmaSupportChkBox);
			
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BinsBtn));
			BinsBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(EnableBinsChkBox));
            Boolean EnableBins=EnableBinsChkBoxSelected.isSelected();
			String actEnableBinsChkBox=Boolean.toString(EnableBins);
			String expEnableBinsChkBox=excelReader.getCellData(xlSheetName, 290, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 290, 8, actEnableBinsChkBox);
			
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("arguments[0].scrollIntoView();", PronghornBnt);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MailSettingsBtn));
			MailSettingsBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(SMTPAddressTxt));
			
			String actSMTPAddressTxt             =SMTPAddressTxt.getAttribute("value");
			String actOutgoingPortNoTxt          =OutgoingPortNoTxt.getAttribute("value");
			String actAuthenticationTypeDropdown =AuthenticationTypeDropdown.getAttribute("value");
			String actEmailIdTxt                 =EmailIdTxt.getAttribute("value");
			String actPasswordTxt                =PasswordTxt.getAttribute("value");
			
			excelReader.setCellData(xlfile, xlSheetName, 291, 8, actSMTPAddressTxt);
			excelReader.setCellData(xlfile, xlSheetName, 292, 8, actOutgoingPortNoTxt);
			excelReader.setCellData(xlfile, xlSheetName, 293, 8, actAuthenticationTypeDropdown);
			excelReader.setCellData(xlfile, xlSheetName, 294, 8, actEmailIdTxt);
			excelReader.setCellData(xlfile, xlSheetName, 295, 8, actPasswordTxt);
			
			String expSMTPAddressTxt             =excelReader.getCellData(xlSheetName, 291, 7);
			String expOutgoingPortNoTxt          =excelReader.getCellData(xlSheetName, 292, 7);
			String expAuthenticationTypeDropdown =excelReader.getCellData(xlSheetName, 293, 7);
			String expEmailIdTxt                 =excelReader.getCellData(xlSheetName, 294, 7);
			String expPasswordTxt                =excelReader.getCellData(xlSheetName, 295, 7);
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MastersBtn));
			MastersBtn.click();
	        
	        
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GridSalesRow1));
			String actSalestxt      =GridSalesRow1.getText();
			String actPurchasesTxt  =GridPurchasesRow1.getText();
			
			String actSalestxt1     =GridSalesRow2.getText();
			String actPurchasesTxt1 =GridPurchasesRow2.getText();
			
			excelReader.setCellData(xlfile, xlSheetName, 296, 8, actSalestxt);
			excelReader.setCellData(xlfile, xlSheetName, 297, 8, actPurchasesTxt);
			excelReader.setCellData(xlfile, xlSheetName, 298, 8, actSalestxt1);
			excelReader.setCellData(xlfile, xlSheetName, 299, 8, actPurchasesTxt1);
			
			
			String expSalestxt       = excelReader.getCellData(xlSheetName, 296, 7);
			String expPurchasesTxt   = excelReader.getCellData(xlSheetName, 297, 7);
			String expSalestxt1      = excelReader.getCellData(xlSheetName, 298, 7);
			String expPurchasesTxt1  = excelReader.getCellData(xlSheetName, 299, 7);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FixedAssetsBtn));
			FixedAssetsBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FixedAssets_AlwaysDefineDepreciationRateAsPercentageChkbox));
            Boolean FixedAssets_AlwaysDefineDepreciationRateAsPercentage=FixedAssets_AlwaysDefineDepreciationRateAsPercentageChkboxSelected.isSelected();
			String actFixedAssets_AlwaysDefineDepre=Boolean.toString(FixedAssets_AlwaysDefineDepreciationRateAsPercentage);
			String expFixedAssets_AlwaysDefineDepre=excelReader.getCellData(xlSheetName, 300, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 300, 8, actFixedAssets_AlwaysDefineDepre);
			
			
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VatBtn));
			VatBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATCashAccountTxt));
			String actVATCashAccountTxt=VATCashAccountTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATOutputTxt));
			String actVATOutputTxt=VATOutputTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATInputTxt));
			String actVATInputTxt=VATInputTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATAdvanceAccountTxt));
			String actVATAdvanceAccountTxt=VATAdvanceAccountTxt.getAttribute("value");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(VATAdvancePurchaseACTxt));
			String actVATAdvancePurchaseACTxt=VATAdvancePurchaseACTxt.getAttribute("value");
			
			String expVATCashAccountTxt=excelReader.getCellData(xlSheetName, 301, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 301, 8, actVATCashAccountTxt);
			
	        String expVATOutputTxt=excelReader.getCellData(xlSheetName, 302, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 302, 8, actVATOutputTxt);
			
	        String expVATInputTxt=excelReader.getCellData(xlSheetName, 303, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 303, 8, actVATInputTxt);
			
	        String expVATAdvanceAccountTxt=excelReader.getCellData(xlSheetName, 304, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 304, 8, actVATAdvanceAccountTxt);
			
	        String expVATAdvancePurchaseACTxt=excelReader.getCellData(xlSheetName, 305, 7);
	        excelReader.setCellData(xlfile, xlSheetName, 305, 8, actVATAdvancePurchaseACTxt);
			
	        
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
			CustCloseBtn.click();
	        
			System.out.println("*****************************************************checkSavedOptionsInPreferences*******************************************");
			
			System.out.println("AccountingDropdown          			: "+actAccountingDropdown         			 +" Value Expected : "+expAccountingDropdown);
			System.out.println("InventoryDropdown          				: "+actInventoryDropdown          			 +" Value Expected : "+expInventoryDropdown);
			System.out.println("SellingsRateDropdown        			: "+actSellingsRateDropdown       			 +" Value Expected : "+expSellingsRateDropdown);
			System.out.println("BuyingRatesdropdown         			: "+actBuyingRatesdropdown        			 +" Value Expected : "+expBuyingRatesdropdown);
			
			System.out.println("checkNegativeCashBal            		: "+actacc_NegCashBankChkbox		 +" Value Expected : "+expacc_NegCashBankChkbox);
			System.out.println("checkNegativeCashByTag          		: "+actcheckNegativeCashByTagChkBox  		 +" Value Expected : "+expcheckNegativeCashByTagChkBox);
			System.out.println("enableCreditLimitCheckChkBox    		: "+actenableCreditLimitCheckChkBox  		 +" Value Expected : "+expenableCreditLimitCheckChkBox);
			System.out.println("pickCreditDayFromChkBox         		: "+actpickCreditDayFromChkBox  			 +" Value Expected : "+exppickCreditDayFromChkBox);
			System.out.println("dependsOnMainBillWiseForARAP    		: "+actdependsOnMaintainBillWiseForARAPChkBox+" Value Expected : "+expdependsOnMaintainBillWiseForARAPChkBox);
			System.out.println("maintainARTransactionCurrey     		: "+actmaintainARTransactionCurrenciesChkBox +" Value Expected : "+expmaintainARTransactionCurrenciesChkBox);
			System.out.println("maintainAPTransactionCurrey     		: "+actmaintainAPTransactionCurrenciesChkBox +" Value Expected : "+expmaintainAPTransactionCurrenciesChkBox);
			System.out.println("inputNarrationInReferenceChkBox 		: "+actinputNarrationInReferenceChkBox  	 +" Value Expected : "+expinputNarrationInReferenceChkBox);
			System.out.println("enableOverDueCheckChkBox        		: "+actenableOverDueCheckChkBox  			 +" Value Expected : "+expenableOverDueCheckChkBox);
			System.out.println("apTagChkBox                     		: "+actapTagChkBox  						 +" Value Expected : "+expapTagChkBox);
			System.out.println("enableLocalCurrencyChkBox       		: "+actenableLocalCurrencyChkBox     		 +" Value Expected : "+expenableLocalCurrencyChkBox);
			
			System.out.println("localCurrencyTxt              			: "+actlocalCurrencyTxt  				     +" Value Expected : "+explocalCurrencyTxt);
			System.out.println("Post Dated Chkbox             			: "+actpostDatedChequeChkbox  			 	 +" Value Expected : "+exppostDatedChequeChkbox);
			System.out.println("displayLedgerAndBalanceChkbox 			: "+actdisplayLedgerAndBalanceChkbox  	  	 +" Value Expected : "+expdisplayLedgerAndBalanceChkbox);
			System.out.println("CheckNegativeStockChkBox      			: "+actCheckNegativeStockChkBox  			 +" Value Expected : "+expCheckNegativeStockChkBox);
			System.out.println("CheckNegativeStockWarnandAllow			: "+actCheckNegativeStockWarnandAllowRadio   +" Value Expected : "+expCheckNegativeStockWarnandAllowRadio);
			
			
			System.out.println("IncludeReserveStockInStockLedgerChkBox   : "+actIncludeReserveStockInStockLedgerChkBox		+" Value Expected : "+expIncludeReserveStockInStockLedgerChkBox);
			System.out.println("InputUnitInTransactionsChkBox            : "+actInputUnitInTransactionsChkBox  		  		+" Value Expected : "+expInputUnitInTransactionsChkBox);
			System.out.println("UpdateMRNValueStockThroughPurchaseChkB   : "+actUpdateMRNValueStockThroughPurchaseChkBox	+" Value Expected : "+expUpdateMRNValueStockThroughPurchaseChkBox);
			System.out.println("ReservationByBinChkBox                   : "+actReservationByBinChkBox  					+" Value Expected : "+expReservationByBinChkBox);
			System.out.println("ReservationByRMAhkBox                    : "+actReservationByRMAChkBox  					+" Value Expected : "+expReservationByRMAChkBox);
			
			
			System.out.println("EnableBatchesNoChkBox                   : "+actEnableBatchesNoChkBox  				+" Value Expected : "+expEnableBatchesNoChkBox);
			System.out.println("ExpiryDatesOfBatchesChkBox              : "+actExpiryDatesOfBatchesChkBox  			+" Value Expected : "+expExpiryDatesOfBatchesChkBox);
			System.out.println("RmaSupportChkBox                   		: "+actRmaSupportChkBox 					+" Value Expected : "+expRmaSupportChkBox);
			System.out.println("EnableBinsChkBox                   		: "+actEnableBinsChkBox  					+" Value Expected : "+expEnableBinsChkBox);
			
			System.out.println("SMTPAddressTxt               			: "+actSMTPAddressTxt             			+" Value Expected : "+expSMTPAddressTxt);
			System.out.println("OutgoingPortNoTxt            			: "+actOutgoingPortNoTxt          			+" Value Expected : "+expOutgoingPortNoTxt);
			System.out.println("AuthenticationTypeDropdown   			: "+actAuthenticationTypeDropdown 			+" Value Expected : "+expAuthenticationTypeDropdown);
			System.out.println("EmailIdTxt                   			: "+actEmailIdTxt                 			+" Value Expected : "+expEmailIdTxt);
			System.out.println("PasswordTxt                  			: "+actPasswordTxt                			+" Value Expected : "+expPasswordTxt);
			
			System.out.println("PurchasesTxt     						: "+actPurchasesTxt 						+" Value Expected : "+expPurchasesTxt);
			System.out.println("Salestxt1        						: "+actSalestxt    							+" Value Expected : "+expSalestxt);
			System.out.println("PurchasesTxt1    						: "+actPurchasesTxt1						+" Value Expected : "+expPurchasesTxt1);
			System.out.println("Salestxt1        						: "+actSalestxt1    						+" Value Expected : "+expSalestxt1);
			
			System.out.println("FixedAssets_AlwaysDefineDepre  			: "+actFixedAssets_AlwaysDefineDepre  		+" Value Expected : "+expFixedAssets_AlwaysDefineDepre);
			System.out.println("VATCashAccountTxt                    	: "+actVATCashAccountTxt  					+" Value Expected : "+expVATCashAccountTxt);
			
			System.out.println("VATOutputTxt                   			: "+actVATOutputTxt  						+" Value Expected : "+expVATOutputTxt);
			System.out.println("VATAdvanceAccountTxt                    : "+actVATAdvanceAccountTxt  				+" Value Expected : "+expVATAdvanceAccountTxt);
			System.out.println("VATAdvancePurchaseACTxt                 : "+actVATAdvancePurchaseACTxt  			+" Value Expected : "+expVATAdvancePurchaseACTxt);
			
			System.out.println("arTagChkBoxIsSelected                 : "+actarTagChkBoxIsSelected  			+" Value Expected : "+exparTagChkBoxIsSelected);
			System.out.println("apTagChkBoxIsSelected                 : "+actapTagChkBoxIsSelected  			+" Value Expected : "+expapTagChkBoxIsSelected);
			System.out.println("arTagTxt                              : "+actarTagTxt  			                +" Value Expected : "+exparTagTxt);
			System.out.println("apTagTxt                              : "+actapTagTxt  			                 +" Value Expected : "+expapTagTxt);
			System.out.println("IncludeReserveStockInStockCheckChkBox : "+actIncludeReserveStockInStockCheckChkBox+" Value Expected : "+expIncludeReserveStockInStockCheckChkBox);
			
			
			
			if(actAccountingDropdown.equalsIgnoreCase(expAccountingDropdown) && actInventoryDropdown.equalsIgnoreCase(expInventoryDropdown)&&
					actSellingsRateDropdown.equalsIgnoreCase(expSellingsRateDropdown) && actBuyingRatesdropdown.equalsIgnoreCase(expBuyingRatesdropdown) && 
					actenableCreditLimitCheckChkBox.equalsIgnoreCase(expenableCreditLimitCheckChkBox) && actacc_NegCashBankChkbox.equalsIgnoreCase(expacc_NegCashBankChkbox) && 
					actcheckNegativeCashByTagChkBox.equalsIgnoreCase(expcheckNegativeCashByTagChkBox) && actpickCreditDayFromChkBox.equalsIgnoreCase(exppickCreditDayFromChkBox) && 
					actdependsOnMaintainBillWiseForARAPChkBox.equalsIgnoreCase(expdependsOnMaintainBillWiseForARAPChkBox)  && 
					actmaintainARTransactionCurrenciesChkBox.equalsIgnoreCase(expmaintainARTransactionCurrenciesChkBox) &&
					actmaintainAPTransactionCurrenciesChkBox.equalsIgnoreCase(expmaintainAPTransactionCurrenciesChkBox) &&
					actinputNarrationInReferenceChkBox.equalsIgnoreCase(expinputNarrationInReferenceChkBox) && 
					actenableOverDueCheckChkBox.equalsIgnoreCase(expenableOverDueCheckChkBox) && actapTagChkBox.equalsIgnoreCase(expapTagChkBox) && 
					actenableLocalCurrencyChkBox.equalsIgnoreCase(expenableLocalCurrencyChkBox) && actlocalCurrencyTxt.equalsIgnoreCase(explocalCurrencyTxt) && 
					actpostDatedChequeChkbox.equalsIgnoreCase(exppostDatedChequeChkbox) && actdisplayLedgerAndBalanceChkbox.equalsIgnoreCase(expdisplayLedgerAndBalanceChkbox) && 
					actCheckNegativeStockChkBox.equalsIgnoreCase(expCheckNegativeStockChkBox) && actCheckNegativeStockWarnandAllowRadio.equalsIgnoreCase(expCheckNegativeStockWarnandAllowRadio) && 
					actIncludeReserveStockInStockLedgerChkBox.equalsIgnoreCase(expIncludeReserveStockInStockLedgerChkBox) && 
					actInputUnitInTransactionsChkBox.equalsIgnoreCase(expInputUnitInTransactionsChkBox) &&
					actUpdateMRNValueStockThroughPurchaseChkBox.equalsIgnoreCase(expUpdateMRNValueStockThroughPurchaseChkBox) &&
					actReservationByBinChkBox.equalsIgnoreCase(expReservationByBinChkBox) &&actReservationByRMAChkBox.equalsIgnoreCase(expReservationByRMAChkBox) && 
					actEnableBatchesNoChkBox.equalsIgnoreCase(expEnableBatchesNoChkBox) && actExpiryDatesOfBatchesChkBox.equalsIgnoreCase(expExpiryDatesOfBatchesChkBox) && 
					actRmaSupportChkBox.equalsIgnoreCase(expRmaSupportChkBox) && actEnableBinsChkBox.equalsIgnoreCase(expEnableBinsChkBox) && 
					actSMTPAddressTxt.equalsIgnoreCase(expSMTPAddressTxt) && actOutgoingPortNoTxt.equalsIgnoreCase(expOutgoingPortNoTxt)
					&& actAuthenticationTypeDropdown.equalsIgnoreCase(expAuthenticationTypeDropdown) && actEmailIdTxt.equalsIgnoreCase(expEmailIdTxt)
					&& actPasswordTxt.equalsIgnoreCase(expPasswordTxt) /*&& actPurchasesTxt.equalsIgnoreCase(expPurchasesTxt)
					&& actSalestxt1.equalsIgnoreCase(expSalestxt1) && actPurchasesTxt1.equalsIgnoreCase(expPurchasesTxt1) && 
					actSalestxt.equalsIgnoreCase(expSalestxt)*/  && actFixedAssets_AlwaysDefineDepre.equalsIgnoreCase(expFixedAssets_AlwaysDefineDepre) && 
					actVATCashAccountTxt.equalsIgnoreCase(expVATCashAccountTxt) && actVATOutputTxt.equalsIgnoreCase(expVATOutputTxt) && 
					actVATAdvanceAccountTxt.equalsIgnoreCase(expVATAdvanceAccountTxt)  && 
					actarTagChkBoxIsSelected==exparTagChkBoxIsSelected && actapTagChkBoxIsSelected==expapTagChkBoxIsSelected && 
					actarTagTxt.equalsIgnoreCase(exparTagTxt) && actapTagTxt.equalsIgnoreCase(expapTagTxt) && 
					actIncludeReserveStockInStockCheckChkBox==expIncludeReserveStockInStockCheckChkBox)

			
			{
				System.out.println("Test Pass : Options Are Expected After Updation ");
				excelReader.setCellData(xlfile, xlSheetName, 259, 9, resPass);

				return true;
			}
			else
			{
				System.out.println("Test Fail :  Options Are Expected After Updation ");
				excelReader.setCellData(xlfile, xlSheetName, 259, 9, resFail);
				return false;
			}
		 }
		
		
		
		
		
		
		
		
		
		
		
		

	
	public boolean checkAccountsInPreferences() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigureTransactionBtn));
		ConfigureTransactionBtn.click();	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountsBtn));
		
		boolean actAccountsBtn  =AccountsBtn.isDisplayed();
		boolean expAccountsBtn  =true;
		
		System.out.println("********************************checkAccountsInPreferences**************************");
		
		System.out.println("AccountsBtn    : "+actAccountsBtn+" Value Expected : "+expAccountsBtn);
		
		if(actAccountsBtn==expAccountsBtn)
		{
			System.out.println("Test Pass : Accounts Is Displayed");
			excelReader.setCellData(xlfile, "Sheet2", 67, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Account is Not Displayed");
			excelReader.setCellData(xlfile, "Sheet2", 67, 9, resFail);
			return false;
		}
	 }
	
	
	public boolean checkCheckNegativeCashBalance() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(AccountsBtn));
		AccountsBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc_NegCashBankChkbox));
		
		boolean actacc_NegCashBankChkbox  =acc_NegCashBankChkbox.isDisplayed();
		boolean expacc_NegCashBankChkbox  =true;
		
		System.out.println("*********************************checkCheckNegativeCashBalance*************************");
		
		System.out.println("acc_NegCashBankChkbox   : "+actacc_NegCashBankChkbox+" Value Expected : "+expacc_NegCashBankChkbox);
		
		if(actacc_NegCashBankChkbox==expacc_NegCashBankChkbox)
		{
			System.out.println("Test pass : CheckNegativeCashBalanceOption is As Expected");
			excelReader.setCellData(xlfile, "Sheet2", 68, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : CheckNegativeCashBalanceOption is NOT As Expected");
			excelReader.setCellData(xlfile, "Sheet2", 68, 9, resFail);
			return false;
		}
	}
	
	
	public boolean checkCheckNegativeCashBalanceOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(acc_NegCashBankChkbox));
		acc_NegCashBankChkbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkNegativeCashBalance_WarnAndAllowRadio));
		
		boolean actcheckNegativeCashBalance_WarnAndAllowRadio  =checkNegativeCashBalance_WarnAndAllowRadio.isDisplayed();
		boolean actcheckNegativeCashBalance_StopRadio          =checkNegativeCashBalance_StopRadio.isDisplayed(); 
		boolean actcheckNegativeCashByTagChkBox                =checkNegativeCashByTagChkBox.isDisplayed();
		
		boolean expcheckNegativeCashBalance_WarnAndAllowRadio  =true;
		boolean expcheckNegativeCashBalance_StopRadio          =true; 
		boolean expcheckNegativeCashByTagChkBox                =true;
		
		System.out.println("****************************checkCheckNegativeCashBalanceOptions*******************************");
		
		System.out.println("checkNegativeCashBalance_WarnAndAllowRadio   : "+actcheckNegativeCashBalance_WarnAndAllowRadio  +" Value Expected : "+expcheckNegativeCashBalance_WarnAndAllowRadio);
		System.out.println("checkNegativeCashBalance_StopRadio           : "+actcheckNegativeCashBalance_StopRadio          +" Value Expected : "+expcheckNegativeCashBalance_StopRadio);
		System.out.println("checkNegativeCashByTagChkBox                 : "+actcheckNegativeCashByTagChkBox                +" Value Expected : "+expcheckNegativeCashByTagChkBox);
		
		if(actcheckNegativeCashBalance_WarnAndAllowRadio==expcheckNegativeCashBalance_WarnAndAllowRadio && actcheckNegativeCashBalance_StopRadio==expcheckNegativeCashBalance_StopRadio
				&& actcheckNegativeCashByTagChkBox==expcheckNegativeCashByTagChkBox)
		{
			System.out.println("Test Pass : Options Are Displaed");
			excelReader.setCellData(xlfile, "Sheet2", 69, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail : Options Are Not Displayed");
			excelReader.setCellData(xlfile, "Sheet2", 69, 9, resFail);
			return false;
		}
		
	}
	
	
	
	public boolean checkCheckNegativeCashByTagOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkNegativeCashByTagChkBox));
		checkNegativeCashByTagChkBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(checkNegativeCashByTag_WarnAndAllowRadio));
		
		boolean actcheckNegativeCashByTag_WarnAndAllowRadio  =checkNegativeCashByTag_WarnAndAllowRadio.isDisplayed();
		boolean actcheckNegativeCashByTag_StopRadio          =checkNegativeCashByTag_StopRadio.isDisplayed(); 
		
		boolean expcheckNegativeCashByTag_WarnAndAllowRadio  =true;
		boolean expcheckNegativeCashByTag_StopRadio          =true; 
		
		System.out.println("****************************checkCheckNegativeCashByTagOptions*******************************");
		
		System.out.println("checkNegativeCashByTag_WarnAndAllowRadio   : "+actcheckNegativeCashByTag_WarnAndAllowRadio  +" Value Expected : "+expcheckNegativeCashByTag_WarnAndAllowRadio);
		System.out.println("checkNegativeCashByTag_StopRadio           : "+actcheckNegativeCashByTag_StopRadio          +" Value Expected : "+expcheckNegativeCashByTag_StopRadio);
		
		if(actcheckNegativeCashByTag_WarnAndAllowRadio==expcheckNegativeCashByTag_WarnAndAllowRadio && actcheckNegativeCashByTag_StopRadio==expcheckNegativeCashByTag_StopRadio)
		{
			System.out.println("Test Pass :CheckNegativeCashByTag Options Are Displaed");
			excelReader.setCellData(xlfile, "Sheet2", 70, 9, resPass);
			return true;
		}else
		{
			System.out.println("Test Fail :CheckNegativeCashByTag Options Are Not Displayed");
			excelReader.setCellData(xlfile, "Sheet2", 70, 9, resFail);
			return false;
		}
	}
	


	public boolean checkUpdatebuttonAccounts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	    
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UpdateBtn));
		UpdateBtn.click();
		
		getWaitForAlert();
		
		String actAlertMgs  =getAlert().getText();
		String expAlertMgs  ="Do you want to save the changes?";
		
		System.out.println("***********************************checkUpdatebuttonAccounts****************************");
		
		System.out.println("AlertMessage     : "+actAlertMgs    +" Value Expected : "+expAlertMgs);	
		
		if(actAlertMgs.equalsIgnoreCase(expAlertMgs))
		{
			System.out.println("Test Pass :VerifyUpdatebutton Alert Pop_Up Displayed As Expected");
			excelReader.setCellData(xlfile, "Sheet2", 71, 9, resPass);
			return true;
			
		}else
		{
			System.out.println("Test Fail :VerifyUpdatebutton Alert Pop_Up Not Displayed As Expected");
			excelReader.setCellData(xlfile, "Sheet2", 71, 9, resFail);
			return false;
		}
	}



	
	public boolean checkUpdateOkbuttonAccounts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
			
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getAlert().accept();
		
		String expMessage="Data Saved Successfully";
		
		String actMessage=checkValidationMessage(expMessage);
		
		System.out.println("********************************checkUpdateOkbuttonAccounts***************************");
		
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			
			System.out.println("Test Pass : Clicking On Ok Btn And Error Message Is as Expected");
			excelReader.setCellData(xlfile, "Sheet2", 72, 9, resPass);
			return true;
			
		}
		else
		{
		
			System.out.println("Test Pass : Clicking On Ok Btn And Error Message Is Not as Expected");
			excelReader.setCellData(xlfile, "Sheet2", 72, 9, resPass);
			return false;
		}
	}
	
	


	public boolean checkCloseButtonInAccounts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
		CustCloseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
		
		boolean actlabelDashboard                  =labelDashboard.isDisplayed();
		boolean actselectDashboard                 =selectDashboard.isDisplayed();
		boolean actnewAddDashBoard                 =newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings  =dashboardCustomizationSettings.isDisplayed();
		
		boolean explabelDashboard                  =true;
		boolean expselectDashboard                 =true;
		boolean expnewAddDashBoard                 =true;
		boolean expdashboardCustomizationSettings  =true;
		
		System.out.println("******************************checkCloseButtonInAccounts************************");
		
		System.out.println("labelDashboard                  : "+actlabelDashboard                 +" Value Expected : "+explabelDashboard);
		System.out.println("selectDashboard                 : "+actselectDashboard                +" Value Expected : "+expselectDashboard);
		System.out.println("newAddDashBoard                 : "+actnewAddDashBoard                +" Value Expected : "+expnewAddDashBoard);
		System.out.println("dashboardCustomizationSettings  : "+actdashboardCustomizationSettings +" Value Expected : "+expdashboardCustomizationSettings);
		
		if(labelDashboard.isDisplayed() && selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() && dashboardCustomizationSettings.isDisplayed())
		 {
			 excelReader.setCellData(xlfile, "Sheet2", 73, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet2", 73, 9, resFail);
			 return false;
		 }
	}
		
		
	

	
	
	
	
	
	@FindBy(xpath="//input[@id='optMisExcludeVoucher']")
	public static WebElement  VoucherTxt;
	
	
	
	public boolean checkCloseButtonInMiscellaneous() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustCloseBtn));
		CustCloseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
		
		boolean actlabelDashboard                  =labelDashboard.isDisplayed();
		boolean actselectDashboard                 =selectDashboard.isDisplayed();
		boolean actnewAddDashBoard                 =newAddDashBoard.isDisplayed();
		boolean actdashboardCustomizationSettings  =dashboardCustomizationSettings.isDisplayed();
		
		boolean explabelDashboard                  =true;
		boolean expselectDashboard                 =true;
		boolean expnewAddDashBoard                 =true;
		boolean expdashboardCustomizationSettings  =true;
		
		System.out.println("******************************checkCloseButtonInAccounts************************");
		
		System.out.println("labelDashboard                  : "+actlabelDashboard                 +" Value Expected : "+explabelDashboard);
		System.out.println("selectDashboard                 : "+actselectDashboard                +" Value Expected : "+expselectDashboard);
		System.out.println("newAddDashBoard                 : "+actnewAddDashBoard                +" Value Expected : "+expnewAddDashBoard);
		System.out.println("dashboardCustomizationSettings  : "+actdashboardCustomizationSettings +" Value Expected : "+expdashboardCustomizationSettings);
		
		if(labelDashboard.isDisplayed() && selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() && dashboardCustomizationSettings.isDisplayed())
		 {
			 excelReader.setCellData(xlfile, "Sheet2", 92, 9, resPass);
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			 userNameDisplay.click();
			  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			 logoutOption.click();
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet2", 92, 9, resFail);
			 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			 userNameDisplay.click();
			  
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			 logoutOption.click();
			 return false;
		 }

	}

		
	public boolean checkCloseAndLogoutTheCompany() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		  Thread.sleep(3000);
		  
		  getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplayLogo));
		  userNameDisplayLogo.click();

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		  logoutOption.click();
  
			boolean verifyFiledsStatus=true;
			
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
			
			getWebDriverWait().until(ExpectedConditions.visibilityOf(username));
  			
	      	boolean actusername			      = username.isDisplayed();
	      	boolean actpassword	 	          = password.isDisplayed();
	        boolean actcompanyDropDownList    = companyDropDownList.isDisplayed();
	      	boolean actsignIn				  = signIn.isDisplayed();
	      	
	      	boolean expusername			      = true;
	      	boolean exppassword			      = true;
	      	boolean expcompanyDropDownList    = true;
	      	boolean expsignIn				  = true;
	  		 
	      	System.out.println("************************************* checkLogoutAfterCustomization  *********************************");
	      	
	      	System.out.println("Username             : "+actusername            +" Value Expected : "+expusername);
	      	System.out.println("Password             : "+actpassword            +" Value Expected : "+exppassword);
	      	System.out.println("CompanyDropDownList  : "+actcompanyDropDownList +" Value Expected : "+expcompanyDropDownList);
	      	System.out.println("SignIn               : "+actsignIn              +" Value Expected : "+expsignIn);
	      	
	      	
	      	boolean actMethod=actusername==expusername && actpassword==exppassword && 
	      			actcompanyDropDownList==expcompanyDropDownList && actsignIn==expsignIn;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult="true";
				
			
			if(actResult.equalsIgnoreCase(expResult))
			{
				
			    return true;
						 
			}
			else
			{
				
			
				return false;
		    }
	}
	
		    
		    
	
	public SmokePreferencesPage(WebDriver driver)
	{
		
		 PageFactory.initElements(driver, this);
		
	}
}
