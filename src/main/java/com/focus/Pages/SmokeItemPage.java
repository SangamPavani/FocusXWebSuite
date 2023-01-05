   package com.focus.Pages;

		
	import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.focus.base.BaseEngine;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.supporters.ExcelReader;
	import com.focus.utilities.POJOUtility;
	
	public class SmokeItemPage extends BaseEngine 
	{
		  
		private static WebElement HomeMasterItemPageTitle;

		@FindBy(xpath="//*[@id='1']/div/div")
		private static WebElement  homeMenu;   

		@FindBy(xpath="//*[@id='1000']/span")
		private static WebElement  homeMasterMenu;

		@FindBy(xpath="//*[@id='221']/span")
		private static WebElement  homeMasterItemMenu;

		@FindBy(xpath="//*[@id='1105']/span")
		private static WebElement  homeMasterItem_ItemMenu;

		@FindBy(xpath="//*[@id='1114']/span")
		private static WebElement  ItemUnitsMenu;

		@FindBy(xpath="//*[@id='72']/span")
		private static WebElement  ItemUnitConversionMenu;
	
		@FindBy(xpath="//*[@id='76']/span")
		private static WebElement  ItemSellerPriceBookMenu;

		@FindBy(xpath="//*[@id='80']/span")
		private static WebElement  ItemBuyerPriceBookMenu;

	    @FindBy(xpath="//*[@id='18']/span")
		private static WebElement  ItemBarcodeDefinitionMenu;


	     //Item Master
	     @FindBy(xpath="//*[@id='spnHeaderText']")
	     private static WebElement item_ItemLabel;

	     @FindBy(xpath="//*[@id='btnNew']")
	     private static WebElement itemNewBtn;

		     @FindBy(xpath="//*[@id='divBtnGroup0']/div/a")
		     private static WebElement ItemNewnewGeneralBtn;
					     
			     @FindBy(xpath="//input[@id='sName']")
			     private static WebElement newGeneralName;
			     
			     @FindBy(xpath="//input[@id='sCode']")
			     private static WebElement newGeneralCode;
			     
			     @FindBy(xpath="//select[@id='iProductType']")
			     private static WebElement newGeneralItemTypeDropDown;
			     
			     @FindBy(xpath="//input[@id='fReorderLevel']")
			     private static WebElement newGeneralReorderLevel;
			     
			     @FindBy(xpath="//input[@id='iBinCapacity']")
			     private static WebElement newGeneralBinCapacity;
			     
			     @FindBy(xpath="//select[@id='iValuationMethod']")
			     private static WebElement newGeneralValuationMethodDropDown;
			     
			     @FindBy(xpath="//input[@id='iCategory']")
			     private static WebElement newGeneralCategoryDropDown;
			     
			     @FindBy(xpath="//td[@id='iCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
			     private static WebElement newGeneralCategorySettingBtn;
			     
			     @FindBy(xpath="//select[@id='iProductMake']")
			     private static WebElement newGeneralItemMakeDropDown;
			     
			     @FindBy(xpath="//input[@id='Printer']")
			     private static WebElement newGeneralPrint;
			     
			     @FindBy(xpath="//input[@id='iAlternateCategory']")
			     private static WebElement newGeneralAlternativeCategoryDropdown;
			     
			     @FindBy(xpath="//td[@id='iAlternateCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
			     private static WebElement newGeneralAlternativeCategoryDropdownSettingBtn;
			     
			     @FindBy(xpath="//textarea[@id='sDescription']")
			     private static WebElement newGeneralDescription;
			     
			     @FindBy(xpath="//input[@id='bPerishableItem']")
			     private static WebElement newGeneralPerishableItemCheckBox;
			     
			     @FindBy(xpath="//input[@id='iBin']")
			     private static WebElement newGeneralBinDropdown;
			     
			     @FindBy(xpath="//td[@id='iBin_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
			     private static WebElement newGeneralBinDropdownSettingBtn;

			     @FindBy(xpath="//input[@id='pImage']")
			     private static WebElement newGeneralUploadImageOrFileBtn;
			     
			     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
			     private static WebElement newGeneralSaveBtn;
			     
			     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			     private static WebElement newGeneralCLoseBtn;
			     		     
					     
		   @FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
		   private static WebElement ItemNewUnitsBtn;	     
			     
				 @FindBy(xpath="//input[@id='iDefaultBaseUnit']")
			     private static WebElement itemUnitsDefaultBaseUnitDropdown;
					     
				 @FindBy(xpath="//td[@id='iDefaultBaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
			     private static WebElement itemUnitsDefaultBaseUnitSetting;
				 
				 @FindBy(xpath="//input[@id='iDefaultSalesUnit']")
			     private static WebElement itemUnitsDefaultSalesUnitDropdown;
					 
				 @FindBy(xpath="//td[@id='iDefaultSalesUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
			     private static WebElement itemUnitsDefaultSalesUnitSettingsBtn;
				 
				 @FindBy(xpath="//input[@id='iDefaultPurchaseUnit']")
			     private static WebElement itemUnitsDefaultPurchaseUnitDropDown;
				 
				 @FindBy(xpath="//td[@id='iDefaultPurchaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
			     private static WebElement itemUnitsDefaultPurchaseUnitSettingsBtn;
				 
				 @FindBy(xpath="//input[@id='fLength']")
			     private static WebElement itemUnitsLength;
				 
				 @FindBy(xpath="//input[@id='fWidth']")
			     private static WebElement itemUnitswidth;
				 
				 @FindBy(xpath="//input[@id='fHeight']")
			     private static WebElement itemUnitsHeight;
				 
				 @FindBy(xpath="//*[@id='fCBM']")
			     private static WebElement itemUnitsCBM;
				 
				 @FindBy(xpath="//input[@id='fWeight']")
			     private static WebElement itemUnitsWeight;
				 
				 @FindBy(xpath="//input[@id='iPalletUnit']")
			     private static WebElement itemUnitsPalletUnitTxt;
				 
				 @FindBy(xpath="//input[@id='fPalletQty']")
			     private static WebElement itemUnitsPalletQtyTxt;
				 
				 @FindBy(xpath="//input[@id='fPalletLength']")
			     private static WebElement itemUnitsPalletLengthTXt;
				 
				 @FindBy(xpath="//input[@id='fPalletWidth']")
			     private static WebElement itemUnitsPalletWidthTxt;
				 
				 @FindBy(xpath="//input[@id='fPalletHeight']")
			     private static WebElement itemUnitsPalletHeightTxt;
					 
				
		     @FindBy(xpath="//*[@id='divBtnGroup2']/div/a")
		     private static WebElement ItemNewSettingsBtn;
		     
			     @FindBy(xpath="//*[@id='fStandardCost']")
			     private static WebElement NewSettingsStandardCost;
			     
			     @FindBy(xpath="//*[@id='fOverheadCost']")
			     private static WebElement NewSettingsOverheadCost;
			     	     
			     @FindBy(xpath="//*[@id='fIndirectCost']")
			     private static WebElement NewSettingsIndirectCost;
			     		     
			     @FindBy(xpath="//*[@id='fProfit']")
			     private static WebElement NewSettingsProfit;		     
			     
			     @FindBy(xpath="//*[@id='iDontshowproductexpireddays']")
			     private static WebElement NewSettingsDontshowproductexpireddays;
			     
			     @FindBy(xpath="//*[@id='iTaxCode']")
			     private static WebElement NewSettingsTaxCode;
			     
			     @FindBy(xpath="//*[@id='iTaxCode_input_settings']/span")
			     private static WebElement NewSettingsTaxCodeSttingsBtn;
			     
			     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
			     private static WebElement NewSettingsSaveBtn; 
			     
			     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			     private static WebElement NewSettingsCloseBtn;
			    
		    @FindBy(xpath="//*[@id='divBtnGroup3']/div/a")
		    private static WebElement ItemNewClassificationBtn;
		          
			     @FindBy(xpath="//*[@id='iABCCodeValue']")
			     private static WebElement newItemClassificationABC_CodeValueDropdown;
			     
			     @FindBy(xpath="//*[@id='iABCCodeMargin']")
			     private static WebElement newItemClassificationABC_CodeMarginDropdOwn;
			     
			     @FindBy(xpath="//*[@id='iABCCodeRevenue']")
			     private static WebElement newItemClassificationABCCodeRevenueDropdown;
			     
			     @FindBy(xpath="//*[@id='iABCCodeCarryingCost']")
			     private static WebElement newItemClassificationABCCodeCarryingCostDropdown;
			    
			     @FindBy(xpath="//*[@id='sBarcode1']")
			     private static WebElement newItemClassificationBarcode1;
			     
			     @FindBy(xpath="//*[@id='sBarcode2']")
			     private static WebElement newItemClassificationBarcode2;
			     
			     @FindBy(xpath="//*[@id='sBarcode3']")
			     private static WebElement newItemClassificationBarcode3;
			     
			     @FindBy(xpath="//*[@id='iUnit1']")
				 private static WebElement newItemgridFirstrowUnit;
				
				 @FindBy(xpath="//*[@id='sBarcode1']")
				 private static WebElement newItemgridFirstrowBarcode;
				
				 //Grid element
						 
				 @FindBy(xpath="//*[@id='sBatch1']")
				 private static WebElement newItemClassificationgridFirstrowBatch;
				
				 @FindBy(xpath="//*[@id='iUnit2']")
				 private static WebElement newItemClassificationgridSecondrowUnit;
				
				 @FindBy(xpath="//*[@id='sBarcode2']")
				 private static WebElement newItemClassificationgridSecondrowBarcode;
				
				 @FindBy(xpath="//*[@id='sBatch2']")
				 private static WebElement newItemClassificationgridSecondrowBatch;
				
				 @FindBy(xpath="//*[@id='iUnit3']")
				 private static WebElement newItemClassificationgridThridrowUnit;
				
				 @FindBy(xpath="//*[@id='sBarcode3']")
				 private static WebElement newItemClassificationgridThridrowBarcode;
				
				 @FindBy(xpath="//*[@id='sBatch3']")
				 private static WebElement newItemClassificationgridThridrowBatch;
				
				 @FindBy(xpath="//*[@id='iUnit_input_settings']")
				 private static WebElement newItemClassificationgridUnitSettings;
			     
		     @FindBy(xpath="//*[@id='divBtnGroup4']/div/a")
		     private static WebElement ItemNewOtherDetailsBtn;
	     
			     @FindBy(xpath="//input[@id='iCostOfIssueAccount']")
			     private static WebElement newOtherDetailsCostOfIssueitem;
			     
			     @FindBy(xpath="//td[@id='iCostOfIssueAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
			     private static WebElement newOtherDetailsCostOfIssueitemsettingsBtn;
			     
			     @FindBy(xpath="//input[@id='iStocksAccount']")
			     private static WebElement newOtherDetailsStocksitem;
			     
			     @FindBy(xpath="//td[@id='iStocksAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
			     private static WebElement newOtherDetailsiStocksitemsettingsBtn;
			     
			     @FindBy(xpath="//input[@id='iSalesAccount']")
			     private static WebElement newOtherDetailsSalesAccount;
			     
			     @FindBy(xpath="//td[@id='iSalesAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
			     private static WebElement newOtherDetailsSalesitemsettingsBtn;
			     
			     @FindBy(xpath="//input[@id='iWIPAccount']")
			     private static WebElement newOtherDetailsWIPitem;
			     
			     @FindBy(xpath="//td[@id='iWIPAccount_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
			     private static WebElement newOtherDetailsWIPitemsettingsBtn;
			     
			     @FindBy(xpath="//input[@id='iCostofShortageStockAC']")
			     private static WebElement newOtherDetailsCostofShortageStockAC;
			     
			     @FindBy(xpath="//td[@id='iCostofShortageStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
			     private static WebElement newOtherDetailsCostofShortageStockACsettingsBtn;
			     
			     @FindBy(xpath="//input[@id='iCostofExcessStockAC']")
			     private static WebElement newOtherDetailsCostofExcessStockAC;
			     
			     @FindBy(xpath="//td[@id='iCostofExcessStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
			     private static WebElement OtherDetailsCostofExcessStockACsettingsBtn;
			    
			     @FindBy(xpath="//input[@id='iCostofSaleReturnAC']")
			     private static WebElement OtherDetailsCostofSaleReturnAC;
			     
			     @FindBy(xpath="//td[@id='iCostofSaleReturnAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
			     private static WebElement OtherDetailsCostofSaleReturnACsettingsBtn;
			     
			     @FindBy(xpath="//input[@id='iPurchaseVarianceAC']")
			     private static WebElement OtherDetailsPurchaseVarianceAC;
			     
			     @FindBy(xpath="//td[@id='iPurchaseVarianceAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
			     private static WebElement OtherDetailsPurchaseVarianceACsettingsBtn;
			     
			     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
			     private static WebElement newOtherDetailsSaveBtn;
			     
			     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			     private static WebElement newOtherDetailsCloseBtn;
					    
		        //Grid Elements
					     
			    @FindBy(xpath="//*[@id='ioWarehouse1']")
			 	private static WebElement newOtherDetailsgridFirstrowWareHouse;
					     
		            @FindBy(xpath="//*[@id='ioWarehouse_input_settings']/span")
		            private static WebElement newGridWarehouseSettingBtn;
		 	
			 	@FindBy(xpath="//*[@id='1']")
			 	private static WebElement newOtherDetailsgridFirstrowSupplier;
					 	
		 	       @FindBy(xpath="//*[@id='iSupplier_input_settings']/span")
		           private static WebElement newGridSupplierSettingBtn;
					 	
			 	@FindBy(xpath="//*[@id='sSupCode1']")
			 	private static WebElement newOtherDetailsgridFirstrowCode;
			 	
			 	@FindBy(xpath="//*[@id='iStartDate1']")
			 	private static WebElement newOtherDetailsgridFirstrowStartDate;
			 	
			 	@FindBy(xpath="//*[@id='iEndDate1']")
			 	private static WebElement newOtherDetailsgridFirstrowEnddate;
			 	
			 	@FindBy(xpath="//*[@id='fRate1']")
			 	private static WebElement newOtherDetailsgridFirstrowRate;
	
			 	@FindBy(xpath="//*[@id='iTolerance1']")
			 	private static WebElement newOtherDetailsgridFirstTolerance;
	
			 	@FindBy(xpath="//*[@id='iLeadTime1']")
			 	private static WebElement newOtherDetailsgridFirstrowLeadTime;
	
			 	@FindBy(xpath="//*[@id='iCreditDays1']")
			 	private static WebElement newOtherDetailsgridFirstrowUnitCreditDays;
			 	
			 	@FindBy(xpath="//*[@id='iCreditLimit1']")
			 	private static WebElement newOtherDetailsgridFirstrowCreditLimit;
	
			 	@FindBy(xpath="//*[@id='LeastDeliveryDate1']")
			 	private static WebElement newOtherDetailsgridFirstrowLastDeliveryDate;

			     
		     @FindBy(xpath="//*[@id='divBtnGroup5']/div/a")
		     private static WebElement ItemNewReplenishmentBtn;
			     
			     
			     @FindBy(xpath="//*[@id='iDefaultReplenishment']")
			     private static WebElement newreplenishmentDefaultReplenishment;
			     
			     @FindBy(xpath="//*[@id='iManufacturePolicy']")
			     private static WebElement newreplenishmentManufacturePolicy;
			     
			     @FindBy(xpath="//*[@id='iPackingBOM']")
			     private static WebElement newreplenishmentPackingBOM;
			     
			     @FindBy(xpath="//*[@id='iPackingBOM_input_settings']/span")
			     private static WebElement newreplenishmentPackingBOMsettingsBtn;
			     
			     @FindBy(xpath="//*[@id='iBOM']")
			     private static WebElement newreplenishmentBOM;
			     
			     @FindBy(xpath="//*[@id='iFlushing']")
			     private static WebElement newreplenishmentFlushing;
			     
			     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
			     private static WebElement newreplenishmentSaveBtn;
			     
			     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			     private static WebElement newreplenishmentCloseBtn;
			     
			     //Grid
			     
			     @FindBy(xpath="//*[@id='irWarehouse1']")
			     private static WebElement newreplenishmentGridFirstRowWarehouse;
			     
			     @FindBy(xpath="//*[@id='irStartdate1']")
			     private static WebElement newreplenishmentGridFirstRowStartDate;
			     
			     @FindBy(xpath="//*[@id='irEnddate1']")
			     private static WebElement newreplenishmentGridFirstRowEndDate;
			     
			     @FindBy(xpath="//*[@id='iReplenishqty1']")
			     private static WebElement newreplenishmentGridFirstRowReplenishqty;
			   
			     @FindBy(xpath="//*[@id='iReorderPolicy1']")
			     private static WebElement newreplenishmentGridFirstRowReorderPolicy;
			     
			     @FindBy(xpath="//*[@id='fSafetyStock1']")
			     private static WebElement newreplenishmentGridFirstRowSafetyStock;
			     
			     @FindBy(xpath="//*[@id='iSafetyLeadTime1']")
			     private static WebElement newreplenishmentFirstRowSafetyLeadTime;
			     
			     @FindBy(xpath="//*[@id='fReordercycle1']")
			     private static WebElement newreplenishmentFirstRowReordercycle;
			     
			     @FindBy(xpath="//*[@id='fReorderPoint1']")
			     private static WebElement newreplenishmentFirstRowReorderPoint;
			     
			     @FindBy(xpath="//*[@id='fReorderQuantity1']")
			     private static WebElement newreplenishmentFirstRowReorderQuantity;
			     
			     @FindBy(xpath="//*[@id='fMaxInventoryLevel1']")
			     private static WebElement newreplenishmentFirstRowMaxInventoryLevel;
			     
			     @FindBy(xpath="//*[@id='iDefaultVendor1']")
			     private static WebElement newreplenishmentFirstRowDefaultVendor;
			     
			     
			     @FindBy(xpath="//*[@id='fMinOrderQuantity1']")
			     private static WebElement newreplenishmentFirstRowMinOrderQuantity;
			     
			     
			     @FindBy(xpath="//*[@id='fMaxOrderQuantity1']")
			     private static WebElement newreplenishmentFirstRowMaxOrderQuantity1;
			     
			     
			     @FindBy(xpath="//*[@id='fOrderMultiple1']")
			     private static WebElement newreplenishmentFirstRowOrderMultiple;
					     
					     
		     @FindBy(xpath="//*[@id='divBtnGroup7']/div/a")
		     private static WebElement ItemNewOutletBtn;
			     
			     @FindBy(xpath="//*[@id='txtsrch-term0']")
			     private static WebElement newOutletSearchOutlet;
			     
			     @FindBy(xpath="//*[@id='cmbUserTypeMaster']")
			     private static WebElement newOutletAdvanceSearch;
			     		     
			     @FindBy(xpath="//*[@id='chkResizeGrid0']/span")
			     private static WebElement newOutletResizeBtn;
			     
			     @FindBy(xpath="//*[@id='chkRetainSelection']")
			     private static WebElement newOutletRetainSelctionCheckBox;

			     @FindBy(xpath="//a[contains(text(),'Tariff')]")
			     private static WebElement tariffTab;

			     @FindBy(xpath="//input[@id='iTariffCode1']")
			     private static WebElement tariffGridTariffCode;
					     
			     @FindBy(xpath="//input[@id='iAffectedDate1']")
			     private static WebElement  tariffGridAffecteddate;
					     
		     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
		     private static WebElement itemCreationScreenSaveBtn;
		     
		     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		     private static WebElement itemCreationScreenCloseBtn;
				          
					     
	     @FindBy(xpath="//*[@id='btnNewSets']")
	     private static WebElement itemNewSetsBtn;
	     
		   
			private static boolean methodReturnStatus;
			private static String xlSheetName = "SmokeMasters";
			private static boolean statusOfValue;
		    private static Alert alert;
	     
	    //AddGroup Elements

	    /* @FindBy(xpath="//*[@id='btnAddGroup']")
	     private static WebElement itemAddGroupBtn;
	     */
	     @FindBy(xpath="//*[@id='divBtnGroup0']/div/a")
	     private static WebElement ItemAddGroupGeneralBtn;
		     
		     @FindBy(xpath="//*[@id='sName']")
		     private static WebElement AddGroupGeneralName;
		     
		     @FindBy(xpath="//*[@id='sCode']")
		     private static WebElement AddGroupGeneralCode;
		     
		     @FindBy(xpath="//*[@id='iProductType']")
		     private static WebElement AddGroupGeneralItemTypeDropDown;
		     
		     @FindBy(xpath="//*[@id='fReorderLevel']")
		     private static WebElement AddGroupGeneralReorderLevel;
		     
		     @FindBy(xpath="//*[@id='iBinCapacity']")
		     private static WebElement AddGroupGeneralBinCapacity;
		     
		     @FindBy(xpath="//*[@id='iValuationMethod']")
		     private static WebElement AddGroupGeneralValuationMethodDropDown;
		     
		     @FindBy(xpath="//*[@id='iCategory']")
		     private static WebElement AddGroupGeneralCategoryDropDown;
		     
		     @FindBy(xpath="//*[@id='iCategory_input_settings']/span")
		     private static WebElement AddGroupGeneralCategorySettingBtn;
		     
		     @FindBy(xpath="//*[@id='iProductMake']")
		     private static WebElement AddGroupGeneralItemMakeDropDown;
		     
		     @FindBy(xpath="//*[@id='Printer']")
		     private static WebElement AddGroupGeneralPrint;
		     
		     @FindBy(xpath="//*[@id='iAlternateCategory']")
		     private static WebElement AddGroupGeneralAlternativeCategoryDropdown;
		     
		     @FindBy(xpath="//*[@id='iAlternateCategory_input_settings']/span")
		     private static WebElement AddGroupGeneralAlternativeCategoryDropdownSettingBtn;
		     
		     @FindBy(xpath="//*[@id='sDescription']")
		     private static WebElement AddGroupGeneralDescription;
		     
		     @FindBy(xpath="//*[@id='bPerishableItem']")
		     private static WebElement AddGroupGeneralPerishableItemCheckBox;
		     
		     @FindBy(xpath="//*[@id='iBin']")
		     private static WebElement AddGroupGeneralBinDropdown;
		     
		     @FindBy(xpath="//*[@id='iBin_input_settings']/span")
		     private static WebElement AddGroupGeneralBinDropdownSettingBtn;
		     
		     
		     @FindBy(xpath="//*[@id='BrowsepImage']")
		     private static WebElement AddGroupGeneralUploadImageOrFileBtn;
		     
		     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
		     private static WebElement AddGroupGeneralSaveBtn;
		     
		     @FindBy(xpath="//*[@id='GenerateAddGroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		     private static WebElement AddGroupGeneralCLoseBtn;
				     
		     
		     
		@FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
		private static WebElement ItemAddGroupUnitsBtn;	     
	 
			 @FindBy(xpath="//*[@id='iDefaultBaseUnit']")
		     private static WebElement AddGroupUnitsDefaultBaseUnitDropdown;
				     
			 @FindBy(xpath="//*[@id='iDefaultBaseUnit_input_settings']/span")
		     private static WebElement AddGroupUnitsDefaultBaseUnitSetting;
			 
			 @FindBy(xpath="//*[@id='iDefaultSalesUnit']")
		     private static WebElement AddGroupUnitsDefaultSalesUnitDropdown;
			 
			 @FindBy(xpath="//*[@id='iDefaultSalesUnit_input_settings']/span")
		     private static WebElement AddGroupUnitsDefaultSalesUnitSettingsBtn;
			 
			 @FindBy(xpath="//*[@id='iDefaultPurchaseUnit']")
		     private static WebElement AddGroupUnitsDefaultPurchaseUnitDropDown;
			 
			 @FindBy(xpath="//*[@id='iDefaultPurchaseUnit_input_settings']/span")
		     private static WebElement AddGroupUnitsDefaultPurchaseUnitSettingsBtn;
			 
			 @FindBy(xpath="//*[@id='fLength']")
		     private static WebElement AddGroupUnitsLength;
			 
			 @FindBy(xpath="//*[@id='fWidth']")
		     private static WebElement AddGroupUnitswidth;
			 
			 @FindBy(xpath="//*[@id='fHeight']")
		     private static WebElement AddGroupUnitsHeight;
			 
			 @FindBy(xpath="//*[@id='fCBM']")
		     private static WebElement itemAddGroupUnitsCBM;
			 
			 @FindBy(xpath="//*[@id='fWeight']")
		     private static WebElement AddGroupUnitsWeight;
		 
		 @FindBy(xpath="//*[@id='divBtnGroup2']/div/a")
		 private static WebElement ItemAddGroupSettingsBtn;
		 
		     @FindBy(xpath="//*[@id='fStandardCost']")
		     private static WebElement AddGroupSettingsStandardCost;
		     
		     @FindBy(xpath="//*[@id='fOverheadCost']")
		     private static WebElement AddGroupSettingsOverheadCost;
		     
		     @FindBy(xpath="//*[@id='fIndirectCost']")
		     private static WebElement AddGroupSettingsIndirectCost;
		     
		     @FindBy(xpath="//*[@id='fProfit']")
		     private static WebElement AddGroupSettingsProfit;
		     
		     @FindBy(xpath="//*[@id='iDontshowproductexpireddays']")
		     private static WebElement AddGroupSettingsDontshowproductexpireddays;
		     
		     @FindBy(xpath="//*[@id='iTaxCode']")
		     private static WebElement AddGroupSettingsTaxCode;
		     
		     @FindBy(xpath="//*[@id='iTaxCode_input_settings']/span")
		     private static WebElement AddGroupSettingsTaxCodeSttingsBtn;
		     
		     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
		     private static WebElement AddGroupSettingsSaveBtn;
		     
		     @FindBy(xpath="//*[@id='GenerateAddGroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		     private static WebElement AddGroupSettingsCloseBtn;
		         		 
		  @FindBy(xpath="//*[@id='divBtnGroup3']/div/a")
		  private static WebElement ItemAddGroupClassificationBtn;
 
		     @FindBy(xpath="//*[@id='iABCCodeValue']")
		     private static WebElement AddGroupItemClassificationABC_CodeValueDropdown;
		     
		     @FindBy(xpath="//*[@id='iABCCodeMargin']")
		     private static WebElement AddGroupItemClassificationABC_CodeMarginDropdOwn;
		     
		     @FindBy(xpath="//*[@id='iABCCodeRevenue']")
		     private static WebElement AddGroupItemClassificationABCCodeRevenueDropdown;
		     
		     @FindBy(xpath="//*[@id='iABCCodeCarryingCost']")
		     private static WebElement AddGroupItemClassificationABCCodeCarryingCostDropdown;
		    
		     @FindBy(xpath="//*[@id='sBarcode1']")
		     private static WebElement AddGroupItemClassificationBarcode1;
		     
		     @FindBy(xpath="//*[@id='sBarcode2']")
		     private static WebElement AddGroupItemClassificationBarcode2;
		     
		     @FindBy(xpath="//*[@id='sBarcode3']")
		     private static WebElement AddGroupItemClassificationBarcode3;
		     
		     @FindBy(xpath="//*[@id='iUnit1']")
			 private static WebElement AddGroupItemgridFirstrowUnit;
			
			 @FindBy(xpath="//*[@id='sBarcode1']")
			 private static WebElement AddGroupItemgridFirstrowBarcode;
			
			 //Grid Elements
			 
			 @FindBy(xpath="//*[@id='sBatch1']")
			 private static WebElement AddGroupItemClassificationgridFirstrowBatch;
			
			 @FindBy(xpath="//*[@id='iUnit2']")
			 private static WebElement AddGroupItemClassificationgridSecondrowUnit;
			
			 @FindBy(xpath="//*[@id='sBarcode2']")
			 private static WebElement AddGroupItemClassificationgridSecondrowBarcode;
			
			 @FindBy(xpath="//*[@id='sBatch2']")
			 private static WebElement AddGroupItemClassificationgridSecondrowBatch;
			
			 @FindBy(xpath="//*[@id='iUnit3']")
			 private static WebElement AddGroupItemClassificationgridThridrowUnit;
			
			 @FindBy(xpath="//*[@id='sBarcode3']")
			 private static WebElement AddGroupItemClassificationgridThridrowBarcode;
			
			 @FindBy(xpath="//*[@id='sBatch3']")
			 private static WebElement AddGroupItemClassificationgridThridrowBatch;
			
			 @FindBy(xpath="//*[@id='iUnit_input_settings']")
			 private static WebElement AddGroupItemClassificationgridUnitSettings;

	 
	 
		 @FindBy(xpath="//*[@id='divBtnGroup4']/div/a")
		 private static WebElement ItemAddGroupOtherDetailsBtn;
	 
		     @FindBy(xpath="//*[@id='iCostOfIssueitem']")
		     private static WebElement AddGroupOtherDetailsCostOfIssueitem;
		     
		     @FindBy(xpath="//*[@id='iCostOfIssueitem_input_settings']/span")
		     private static WebElement AddGroupOtherDetailsCostOfIssueitemsettingsBtn;
		     
		     @FindBy(xpath="//*[@id='iStocksitem']")
		     private static WebElement AddGroupOtherDetailsStocksitem;
		     
		     @FindBy(xpath="//*[@id='iStocksitem_input_settings']/span")
		     private static WebElement AddGroupOtherDetailsiStocksitemsettingsBtn;
		     
		     @FindBy(xpath="//*[@id='iSalesitem']")
		     private static WebElement AddGroupOtherDetailsSalesitem;
		     
		     @FindBy(xpath="//*[@id='iSalesitem_input_settings']/span")
		     private static WebElement AddGroupOtherDetailsSalesitemsettingsBtn;
		     
		     @FindBy(xpath="//*[@id='iWIPitem']")
		     private static WebElement AddGroupOtherDetailsWIPitem;
		     
		     @FindBy(xpath="//*[@id='iWIPitem_input_settings']/span")
		     private static WebElement AddGroupOtherDetailsWIPitemsettingsBtn;
		     
		     @FindBy(xpath="//*[@id='iCostofShortageStockAC']")
		     private static WebElement AddGroupOtherDetailsCostofShortageStockAC;
		     
		     @FindBy(xpath="//*[@id='iCostofShortageStockAC_input_settings']/span")
		     private static WebElement AddGroupOtherDetailsCostofShortageStockACsettingsBtn;
		     
		     @FindBy(xpath="//*[@id='iCostofExcessStockAC']")
		     private static WebElement AddGroupOtherDetailsCostofExcessStockAC;
		     
		     @FindBy(xpath="//*[@id='iCostofExcessStockAC_input_settings']/span")
		     private static WebElement AddGroupOtherDetailsCostofExcessStockACsettingsBtn;
		    
		     @FindBy(xpath="//*[@id='iCostofSaleReturnAC']")
		     private static WebElement AddGroupOtherDetailsCostofSaleReturnAC;
		     
		     @FindBy(xpath="//*[@id='iCostofSaleReturnAC_input_settings']/span")
		     private static WebElement AddGroupOtherDetailsCostofSaleReturnACsettingsBtn;
		     
		     @FindBy(xpath="//*[@id='iPurchaseVarianceAC']")
		     private static WebElement AddGroupOtherDetailsPurchaseVarianceAC;
		     
		     @FindBy(xpath="//*[@id='iPurchaseVarianceAC_input_settings']/span")
		     private static WebElement AddGroupOtherDetailsPurchaseVarianceACsettingsBtn;
		     
		     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
		     private static WebElement AddGroupAddGroupOtherDetailsSaveBtn;
		     
		     @FindBy(xpath="//*[@id='GenerateAddGroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		     private static WebElement AddGroupOtherDetailsCloseBtn;
		     
		     //Grid Elements

		     @FindBy(xpath="//*[@id='ioWarehouse1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowWareHouse;
		     
		            @FindBy(xpath="//*[@id='ioWarehouse_input_settings']/span")
		            private static WebElement AddGroupGridWarehouseSettingBtn;
		 	
		 	@FindBy(xpath="//*[@id='1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowSupplier;
		 	
		 	       @FindBy(xpath="//*[@id='iSupplier_input_settings']/span")
		           private static WebElement AddGroupGridSupplierSettingBtn;
		 	
		 	@FindBy(xpath="//*[@id='sSupCode1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowCode;
		 	
		 	@FindBy(xpath="//*[@id='iStartDate1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowStartDate;
		 	
		 	@FindBy(xpath="//*[@id='iEndDate1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowEnddate;
		 	
		 	@FindBy(xpath="//*[@id='fRate1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowRate;

		 	@FindBy(xpath="//*[@id='iTolerance1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstTolerance;

		 	@FindBy(xpath="//*[@id='iLeadTime1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowLeadTime;

		 	@FindBy(xpath="//*[@id='iCreditDays1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowUnitCreditDays;
		 	
		 	@FindBy(xpath="//*[@id='iCreditLimit1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowCreditLimit;

		 	@FindBy(xpath="//*[@id='LeastDeliveryDate1']")
		 	private static WebElement AddGroupOtherDetailsgridFirstrowLastDeliveryDate;


		 @FindBy(xpath="//*[@id='divBtnGroup5']/div/a")
		 private static WebElement ItemAddGroupReplenishmentBtn;
		 
		     @FindBy(xpath="//*[@id='iDefaultReplenishment']")
		     private static WebElement AddGroupreplenishmentDefaultReplenishment;
		     
		     @FindBy(xpath="//*[@id='iManufacturePolicy']")
		     private static WebElement AddGroupreplenishmentManufacturePolicy;
		     
		     @FindBy(xpath="//*[@id='iPackingBOM']")
		     private static WebElement AddGroupreplenishmentPackingBOM;
		     
		     @FindBy(xpath="//*[@id='iPackingBOM_input_settings']/span")
		     private static WebElement AddGroupreplenishmentPackingBOMsettingsBtn;
		     
		     @FindBy(xpath="//*[@id='iBOM']")
		     private static WebElement AddGroupreplenishmentBOM;
		     
		     @FindBy(xpath="//*[@id='iFlushing']")
		     private static WebElement AddGroupreplenishmentFlushing;
		     
		     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
		     private static WebElement AddGroupreplenishmentSaveBtn;
		     
		     @FindBy(xpath="//*[@id='GenerateAddGroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		     private static WebElement AddGroupreplenishmentCloseBtn;
		     
		     ///Grid Elements
		     
		     @FindBy(xpath="//*[@id='irWarehouse1']")
		     private static WebElement AddGroupreplenishmentGridFirstRowWarehouse;
		     
		     @FindBy(xpath="//*[@id='irStartdate1']")
		     private static WebElement AddGroupreplenishmentGridFirstRowStartDate;
		     
		     @FindBy(xpath="//*[@id='irEnddate1']")
		     private static WebElement AddGroupreplenishmentGridFirstRowEndDate;
		     
		     @FindBy(xpath="//*[@id='iReplenishqty1']")
		     private static WebElement AddGroupreplenishmentGridFirstRowReplenishqty;
		   
		     @FindBy(xpath="//*[@id='iReorderPolicy1']")
		     private static WebElement AddGroupreplenishmentGridFirstRowReorderPolicy;
		     
		     @FindBy(xpath="//*[@id='fSafetyStock1']")
		     private static WebElement AddGroupreplenishmentGridFirstRowSafetyStock;
		     
		     @FindBy(xpath="//*[@id='iSafetyLeadTime1']")
		     private static WebElement AddGroupreplenishmentFirstRowSafetyLeadTime;
		     
		     @FindBy(xpath="//*[@id='fReordercycle1']")
		     private static WebElement AddGroupreplenishmentFirstRowReordercycle;
		     
		     @FindBy(xpath="//*[@id='fReorderPoint1']")
		     private static WebElement AddGroupreplenishmentFirstRowReorderPoint;
		     
		     @FindBy(xpath="//*[@id='fReorderQuantity1']")
		     private static WebElement AddGroupreplenishmentFirstRowReorderQuantity;
		     
		     @FindBy(xpath="//*[@id='fMaxInventoryLevel1']")
		     private static WebElement AddGroupreplenishmentFirstRowMaxInventoryLevel;
		     
		     @FindBy(xpath="//*[@id='iDefaultVendor1']")
		     private static WebElement AddGroupreplenishmentFirstRowDefaultVendor;
		     
		     @FindBy(xpath="//*[@id='fMinOrderQuantity1']")
		     private static WebElement AddGroupreplenishmentFirstRowMinOrderQuantity;
		     
		     @FindBy(xpath="//*[@id='fMaxOrderQuantity1']")
		     private static WebElement AddGroupreplenishmentFirstRowMaxOrderQuantity1;
		     
		     @FindBy(xpath="//*[@id='fOrderMultiple1']")
		     private static WebElement AddGroupreplenishmentFirstRowOrderMultiple;
		     
		     
		 @FindBy(xpath="//*[@id='divBtnGroup7']/div/a")
		 private static WebElement ItemAddGroupOutletBtn;
		 
		     @FindBy(xpath="//*[@id='txtsrch-term0']")
		     private static WebElement AddGroupOutletSearchOutlet;
		     
		     @FindBy(xpath="//*[@id='cmbUserTypeMaster']")
		     private static WebElement AddGroupOutletAdvanceSearch;
		     
		     @FindBy(xpath="//*[@id='chkResizeGrid0']/span")
		     private static WebElement AddGroupOutletResizeBtn;
		     
		     @FindBy(xpath="//*[@id='chkRetainSelection']")
		     private static WebElement AddGroupOutletRetainSelctionCheckBox;
		     
		     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
		     private static WebElement AddGroupOutletSaveBtn;
		     
		     @FindBy(xpath="//*[@id='GenerateAddGroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		     private static WebElement AddGroupOutletCloseBtn;
		     	     
     	 //Edit elements
		     
	     @FindBy(xpath="//*[@id='btnMasterEdit']")
	     private static WebElement itemEditBtn;
	     
		     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
		     private static WebElement itemEditSaveBtn;
		     
		     @FindBy(xpath="//*[@id='btnMasterCopy']")
		     private static WebElement itemEditCpoyBtn;
		     
		     @FindBy(xpath="//*[@id='btnMasterClone']")
		     private static WebElement itemEditCloneBtn;
		     
		     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
		     private static WebElement itemEditCloseBtn;
		     
		     @FindBy(xpath="//*[@id='divBtnGroup0']/div/a")
		     private static WebElement ItemEditGeneralBtn;
		 	     
 			     @FindBy(xpath="//*[@id='sName']")
 			     private static WebElement EditGeneralName;
 			     
 			     @FindBy(xpath="//*[@id='sCode']")
 			     private static WebElement EditGeneralCode;
 			     
 			     @FindBy(xpath="//*[@id='iProductType']")
 			     private static WebElement EditGeneralItemTypeDropDown;
 			     
 			     @FindBy(xpath="//*[@id='fReorderLevel']")
 			     private static WebElement EditGeneralReorderLevel;
 			     
 			     @FindBy(xpath="//*[@id='iBinCapacity']")
 			     private static WebElement EditGeneralBinCapacity;
 			     
 			     @FindBy(xpath="//*[@id='iValuationMethod']")
 			     private static WebElement EditGeneralValuationMethodDropDown;
 			     
 			     @FindBy(xpath="//*[@id='iCategory']")
 			     private static WebElement EditGeneralCategoryDropDown;
 			     
 			     @FindBy(xpath="//*[@id='iCategory_input_settings']/span")
 			     private static WebElement EditGeneralCategorySettingBtn;
 			     
 			     @FindBy(xpath="//*[@id='iProductMake']")
 			     private static WebElement EditGeneralItemMakeDropDown;
 			     
 			     @FindBy(xpath="//*[@id='Printer']")
 			     private static WebElement EditGeneralPrint;
 			     
 			     @FindBy(xpath="//*[@id='iAlternateCategory']")
 			     private static WebElement EditGeneralAlternativeCategoryDropdown;
 			     
 			     @FindBy(xpath="//*[@id='iAlternateCategory_input_settings']/span")
 			     private static WebElement EditGeneralAlternativeCategoryDropdownSettingBtn;
 			     
 			     @FindBy(xpath="//*[@id='sDescription']")
 			     private static WebElement EditGeneralDescription;
 			     
 			     @FindBy(xpath="//*[@id='bPerishableItem']")
 			     private static WebElement EditGeneralPerishableItemCheckBox;
 			     
 			     @FindBy(xpath="//*[@id='iBin']")
 			     private static WebElement EditGeneralBinDropdown;
 			     
 			     @FindBy(xpath="//*[@id='iBin_input_settings']/span")
 			     private static WebElement EditGeneralBinDropdownSettingBtn;
 			     		     
 			     @FindBy(xpath="//*[@id='BrowsepImage']")
 			     private static WebElement EditGeneralUploadImageOrFileBtn;
 			     
 			     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
 			     private static WebElement EditGeneralSaveBtn;
 			     
 			     @FindBy(xpath="//*[@id='GenerateEditMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
 			     private static WebElement EditGeneralCLoseBtn;
 			     
     
			 @FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
			 private static WebElement ItemEditUnitsBtn;	     

	 			 @FindBy(xpath="//*[@id='iDefaultBaseUnit']")
	 		     private static WebElement EditUnitsDefaultBaseUnitDropdown;
	 				     
	 			 @FindBy(xpath="//*[@id='iDefaultBaseUnit_input_settings']/span")
	 		     private static WebElement EditUnitsDefaultBaseUnitSetting;
	 			 
	 			 @FindBy(xpath="//*[@id='iDefaultSalesUnit']")
	 		     private static WebElement EditUnitsDefaultSalesUnitDropdown;
	 			 
	 			 @FindBy(xpath="//*[@id='iDefaultSalesUnit_input_settings']/span")
	 		     private static WebElement EditUnitsDefaultSalesUnitSettingsBtn;
	 			 
	 			 @FindBy(xpath="//*[@id='iDefaultPurchaseUnit']")
	 		     private static WebElement EditUnitsDefaultPurchaseUnitDropDown;
	 			 
	 			 @FindBy(xpath="//*[@id='iDefaultPurchaseUnit_input_settings']/span")
	 		     private static WebElement EditUnitsDefaultPurchaseUnitSettingsBtn;
	 			 
	 			 @FindBy(xpath="//*[@id='fLength']")
	 		     private static WebElement EditUnitsLength;
	 			 
	 			 @FindBy(xpath="//*[@id='fWidth']")
	 		     private static WebElement EditUnitswidth;
	 			 
	 			 @FindBy(xpath="//*[@id='fHeight']")
	 		     private static WebElement EditUnitsHeight;
	 			 
	 			 @FindBy(xpath="//*[@id='fCBM']")
	 		     private static WebElement itemEditUnitsCBM;
	 			 
	 			 @FindBy(xpath="//*[@id='fWeight']")
	 		     private static WebElement EditUnitsWeight;

			 @FindBy(xpath="//*[@id='divBtnGroup2']/div/a")
			 private static WebElement ItemEditSettingsBtn;

		 	     @FindBy(xpath="//*[@id='fStandardCost']")
		 	     private static WebElement EditSettingsStandardCost;
		 	     
		 	     @FindBy(xpath="//*[@id='fOverheadCost']")
		 	     private static WebElement EditSettingsOverheadCost;
		 	     
		 	     @FindBy(xpath="//*[@id='fIndirectCost']")
		 	     private static WebElement EditSettingsIndirectCost;
		 	     
		 	     @FindBy(xpath="//*[@id='fProfit']")
		 	     private static WebElement EditSettingsProfit;
		 	     
		 	     @FindBy(xpath="//*[@id='iDontshowproductexpireddays']")
		 	     private static WebElement EditSettingsDontshowproductexpireddays;
		 	     
		 	     @FindBy(xpath="//*[@id='iTaxCode']")
		 	     private static WebElement EditSettingsTaxCode;
		 	     
		 	     @FindBy(xpath="//*[@id='iTaxCode_input_settings']/span")
		 	     private static WebElement EditSettingsTaxCodeSttingsBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
		 	     private static WebElement EditSettingsSaveBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='GenerateEditMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		 	     private static WebElement EditSettingsCloseBtn;

			 @FindBy(xpath="//*[@id='divBtnGroup3']/div/a")
			 private static WebElement ItemEditClassificationBtn;

	 		     @FindBy(xpath="//*[@id='iABCCodeValue']")
	 		     private static WebElement EditItemClassificationABC_CodeValueDropdown;
	 		     
	 		     @FindBy(xpath="//*[@id='iABCCodeMargin']")
	 		     private static WebElement EditItemClassificationABC_CodeMarginDropdOwn;
	 		     
	 		     @FindBy(xpath="//*[@id='iABCCodeRevenue']")
	 		     private static WebElement EditItemClassificationABCCodeRevenueDropdown;
	 		     
	 		     @FindBy(xpath="//*[@id='iABCCodeCarryingCost']")
	 		     private static WebElement EditItemClassificationABCCodeCarryingCostDropdown;
	 		    
	 		     @FindBy(xpath="//*[@id='sBarcode1']")
	 		     private static WebElement EditItemClassificationBarcode1;
	 		     
	 		     @FindBy(xpath="//*[@id='sBarcode2']")
	 		     private static WebElement EditItemClassificationBarcode2;
	 		     
	 		     @FindBy(xpath="//*[@id='sBarcode3']")
	 		     private static WebElement EditItemClassificationBarcode3;
	 		     
	 		     @FindBy(xpath="//*[@id='iUnit1']")
	 			 private static WebElement EditItemgridFirstrowUnit;
	 			
	 			 @FindBy(xpath="//*[@id='sBarcode1']")
	 			 private static WebElement EditItemgridFirstrowBarcode;
	 			
	 			 ///////Grid elements***********************************
	 			 @FindBy(xpath="//*[@id='sBatch1']")
	 			 private static WebElement EditItemClassificationgridFirstrowBatch;
	 			
	 			 @FindBy(xpath="//*[@id='iUnit2']")
	 			 private static WebElement EditItemClassificationgridSecondrowUnit;
	 			
	 			 @FindBy(xpath="//*[@id='sBarcode2']")
	 			 private static WebElement EditItemClassificationgridSecondrowBarcode;
	 			
	 			 @FindBy(xpath="//*[@id='sBatch2']")
	 			 private static WebElement EditItemClassificationgridSecondrowBatch;
	 			
	 			 @FindBy(xpath="//*[@id='iUnit3']")
	 			 private static WebElement EditItemClassificationgridThridrowUnit;
	 			
	 			 @FindBy(xpath="//*[@id='sBarcode3']")
	 			 private static WebElement EditItemClassificationgridThridrowBarcode;
	 			
	 			 @FindBy(xpath="//*[@id='sBatch3']")
	 			 private static WebElement EditItemClassificationgridThridrowBatch;
	 			
	 			 @FindBy(xpath="//*[@id='iUnit_input_settings']")
	 			 private static WebElement EditItemClassificationgridUnitSettings;

			 @FindBy(xpath="//*[@id='divBtnGroup4']/div/a")
			 private static WebElement ItemEditOtherDetailsBtn;

		 	     @FindBy(xpath="//*[@id='iCostOfIssueitem']")
		 	     private static WebElement EditOtherDetailsCostOfIssueitem;
		 	     
		 	     @FindBy(xpath="//*[@id='iCostOfIssueitem_input_settings']/span")
		 	     private static WebElement EditOtherDetailsCostOfIssueitemsettingsBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='iStocksitem']")
		 	     private static WebElement EditOtherDetailsStocksitem;
		 	     
		 	     @FindBy(xpath="//*[@id='iStocksitem_input_settings']/span")
		 	     private static WebElement EditOtherDetailsiStocksitemsettingsBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='iSalesitem']")
		 	     private static WebElement EditOtherDetailsSalesitem;
		 	     
		 	     @FindBy(xpath="//*[@id='iSalesitem_input_settings']/span")
		 	     private static WebElement EditOtherDetailsSalesitemsettingsBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='iWIPitem']")
		 	     private static WebElement EditOtherDetailsWIPitem;
		 	     
		 	     @FindBy(xpath="//*[@id='iWIPitem_input_settings']/span")
		 	     private static WebElement EditOtherDetailsWIPitemsettingsBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='iCostofShortageStockAC']")
		 	     private static WebElement EditOtherDetailsCostofShortageStockAC;
		 	     
		 	     @FindBy(xpath="//*[@id='iCostofShortageStockAC_input_settings']/span")
		 	     private static WebElement EditOtherDetailsCostofShortageStockACsettingsBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='iCostofExcessStockAC']")
		 	     private static WebElement EditOtherDetailsCostofExcessStockAC;
		 	     
		 	     @FindBy(xpath="//*[@id='iCostofExcessStockAC_input_settings']/span")
		 	     private static WebElement EditOtherDetailsCostofExcessStockACsettingsBtn;
		 	    
		 	     @FindBy(xpath="//*[@id='iCostofSaleReturnAC']")
		 	     private static WebElement EditOtherDetailsCostofSaleReturnAC;
		 	     
		 	     @FindBy(xpath="//*[@id='iCostofSaleReturnAC_input_settings']/span")
		 	     private static WebElement EditOtherDetailsCostofSaleReturnACsettingsBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='iPurchaseVarianceAC']")
		 	     private static WebElement EditOtherDetailsPurchaseVarianceAC;
		 	     
		 	     @FindBy(xpath="//*[@id='iPurchaseVarianceAC_input_settings']/span")
		 	     private static WebElement EditOtherDetailsPurchaseVarianceACsettingsBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
		 	     private static WebElement EditEditOtherDetailsSaveBtn;
		 	     
		 	     @FindBy(xpath="//*[@id='GenerateEditMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		 	     private static WebElement EditOtherDetailsCloseBtn;
		 	     
		 	     //Grid

		 	     @FindBy(xpath="//*[@id='ioWarehouse1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowWareHouse;
		 	     
		 	            @FindBy(xpath="//*[@id='ioWarehouse_input_settings']/span")
		 	            private static WebElement EditGridWarehouseSettingBtn;
		 	 	
		 	 	@FindBy(xpath="//*[@id='1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowSupplier;
		 	 	
		 	 	       @FindBy(xpath="//*[@id='iSupplier_input_settings']/span")
		 	           private static WebElement EditGridSupplierSettingBtn;
		 	 	
		 	 	@FindBy(xpath="//*[@id='sSupCode1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowCode;
		 	 	
		 	 	@FindBy(xpath="//*[@id='iStartDate1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowStartDate;
		 	 	
		 	 	@FindBy(xpath="//*[@id='iEndDate1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowEnddate;
		 	 	
		 	 	@FindBy(xpath="//*[@id='fRate1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowRate;

		 	 	@FindBy(xpath="//*[@id='iTolerance1']")
		 	 	private static WebElement EditOtherDetailsgridFirstTolerance;

		 	 	@FindBy(xpath="//*[@id='iLeadTime1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowLeadTime;

		 	 	@FindBy(xpath="//*[@id='iCreditDays1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowUnitCreditDays;
		 	 	
		 	 	@FindBy(xpath="//*[@id='iCreditLimit1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowCreditLimit;

		 	 	@FindBy(xpath="//*[@id='LeastDeliveryDate1']")
		 	 	private static WebElement EditOtherDetailsgridFirstrowLastDeliveryDate;

		   @FindBy(xpath="//*[@id='divBtnGroup5']/div/a")
		   private static WebElement ItemEditReplenishmentBtn;

		 	    @FindBy(xpath="//*[@id='iDefaultReplenishment']")
		 	    private static WebElement EditreplenishmentDefaultReplenishment;
		 	     
		 	    @FindBy(xpath="//*[@id='iManufacturePolicy']")
		 	    private static WebElement EditreplenishmentManufacturePolicy;
		 	     
		 	    @FindBy(xpath="//*[@id='iPackingBOM']")
		 	    private static WebElement EditreplenishmentPackingBOM;
		 	     
		 	    @FindBy(xpath="//*[@id='iPackingBOM_input_settings']/span")
		 	    private static WebElement EditreplenishmentPackingBOMsettingsBtn;
		 	     
		 	    @FindBy(xpath="//*[@id='iBOM']")
		 	    private static WebElement EditreplenishmentBOM;
		 	     
		 	    @FindBy(xpath="//*[@id='iFlushing']")
		 	    private static WebElement EditreplenishmentFlushing;
		 	     
		 	    @FindBy(xpath="//*[@id='btnMasterSaveClick']")
		 	    private static WebElement EditreplenishmentSaveBtn;
		 	     
		 	    @FindBy(xpath="//*[@id='GenerateEditMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		 	    private static WebElement EditreplenishmentCloseBtn;
		 	     
		 	    //Grid
		 	     
		 	    @FindBy(xpath="//*[@id='irWarehouse1']")
		 	    private static WebElement EditreplenishmentGridFirstRowWarehouse;
		 	     
		 	    @FindBy(xpath="//*[@id='irStartdate1']")
		 	    private static WebElement EditreplenishmentGridFirstRowStartDate;
		 	     
		 	    @FindBy(xpath="//*[@id='irEnddate1']")
		 	    private static WebElement EditreplenishmentGridFirstRowEndDate;
		 	     
		 	    @FindBy(xpath="//*[@id='iReplenishqty1']")
		 	    private static WebElement EditreplenishmentGridFirstRowReplenishqty;
		 	   
		 	    @FindBy(xpath="//*[@id='iReorderPolicy1']")
		 	    private static WebElement EditreplenishmentGridFirstRowReorderPolicy;
		 	     
		 	    @FindBy(xpath="//*[@id='fSafetyStock1']")
		 	    private static WebElement EditreplenishmentGridFirstRowSafetyStock;
		 	     
		 	    @FindBy(xpath="//*[@id='iSafetyLeadTime1']")
		 	    private static WebElement EditreplenishmentFirstRowSafetyLeadTime;
		 	     
		 	    @FindBy(xpath="//*[@id='fReordercycle1']")
		 	    private static WebElement EditreplenishmentFirstRowReordercycle;
		 	     
		 	    @FindBy(xpath="//*[@id='fReorderPoint1']")
		 	    private static WebElement EditreplenishmentFirstRowReorderPoint;
		 	     
		 	    @FindBy(xpath="//*[@id='fReorderQuantity1']")
		 	    private static WebElement EditreplenishmentFirstRowReorderQuantity;
		 	     
		 	    @FindBy(xpath="//*[@id='fMaxInventoryLevel1']")
		 	    private static WebElement EditreplenishmentFirstRowMaxInventoryLevel;
		 	     
		 	    @FindBy(xpath="//*[@id='iDefaultVendor1']")
		 	    private static WebElement EditreplenishmentFirstRowDefaultVendor;
		 	     
		 	    @FindBy(xpath="//*[@id='fMinOrderQuantity1']")
		 	    private static WebElement EditreplenishmentFirstRowMinOrderQuantity;
		 	      
		 	    @FindBy(xpath="//*[@id='fMaxOrderQuantity1']")
		 	    private static WebElement EditreplenishmentFirstRowMaxOrderQuantity1;
		 	      
		 	    @FindBy(xpath="//*[@id='fOrderMultiple1']")
		 	    private static WebElement EditreplenishmentFirstRowOrderMultiple;
		 	      	     
			 @FindBy(xpath="//*[@id='divBtnGroup7']/div/a")
			 private static WebElement ItemEditOutletBtn;

 			     @FindBy(xpath="//*[@id='txtsrch-term0']")
 			     private static WebElement EditOutletSearchOutlet;
 			     
 			     @FindBy(xpath="//*[@id='cmbUserTypeMaster']")
 			     private static WebElement EditOutletAdvanceSearch;
 			     
 			     @FindBy(xpath="//*[@id='chkResizeGrid0']/span")
 			     private static WebElement EditOutletResizeBtn;
 			     
 			     @FindBy(xpath="//*[@id='chkRetainSelection']")
 			     private static WebElement EditOutletRetainSelctionCheckBox;
 			     
 			     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
 			     private static WebElement EditOutletSaveBtn;
 			     
 			     @FindBy(xpath="//*[@id='GenerateEditMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
 			     private static WebElement EditOutletCloseBtn;
		     
		      
		      //Clone Elements  
	
		     @FindBy(xpath="//*[@id='btnClone']")
		     private static WebElement ItemCloneBtn;
	     
			     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
			     private static WebElement ItemCloneSaveBtn;
			     
			     @FindBy(xpath="//*[@id='btnMasterCopy']/i")
			     private static WebElement ItemCloneCopyBtn;
			     
			     @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			     private static WebElement ItemClloneBtn;

	     
			     @FindBy(xpath="//*[@id='divBtnGroup0']/div/a")
			     private static WebElement ItemcloneGeneralBtn;
			   	     
	   			     @FindBy(xpath="//*[@id='sName']")
	   			     private static WebElement cloneGeneralName;
	   			     
	   			     @FindBy(xpath="//*[@id='sCode']")
	   			     private static WebElement cloneGeneralCode;
	   			     
	   			     @FindBy(xpath="//*[@id='iProductType']")
	   			     private static WebElement cloneGeneralItemTypeDropDown;
	   			     
	   			     @FindBy(xpath="//*[@id='fReorderLevel']")
	   			     private static WebElement cloneGeneralReorderLevel;
	   			     
	   			     @FindBy(xpath="//*[@id='iBinCapacity']")
	   			     private static WebElement cloneGeneralBinCapacity;
	   			     
	   			     @FindBy(xpath="//*[@id='iValuationMethod']")
	   			     private static WebElement cloneGeneralValuationMethodDropDown;
	   			     
	   			     @FindBy(xpath="//*[@id='iCategory']")
	   			     private static WebElement cloneGeneralCategoryDropDown;
	   			     
	   			     @FindBy(xpath="//*[@id='iCategory_input_settings']/span")
	   			     private static WebElement cloneGeneralCategorySettingBtn;
	   			     
	   			     @FindBy(xpath="//*[@id='iProductMake']")
	   			     private static WebElement cloneGeneralItemMakeDropDown;
	   			     
	   			     @FindBy(xpath="//*[@id='Printer']")
	   			     private static WebElement cloneGeneralPrint;
	   			     
	   			     @FindBy(xpath="//*[@id='iAlternateCategory']")
	   			     private static WebElement cloneGeneralAlternativeCategoryDropdown;
	   			     
	   			     @FindBy(xpath="//*[@id='iAlternateCategory_input_settings']/span")
	   			     private static WebElement cloneGeneralAlternativeCategoryDropdownSettingBtn;
	   			     
	   			     @FindBy(xpath="//*[@id='sDescription']")
	   			     private static WebElement cloneGeneralDescription;
	   			     
	   			     @FindBy(xpath="//*[@id='bPerishableItem']")
	   			     private static WebElement cloneGeneralPerishableItemCheckBox;
	   			     
	   			     @FindBy(xpath="//*[@id='iBin']")
	   			     private static WebElement cloneGeneralBinDropdown;
	   			     
	   			     @FindBy(xpath="//*[@id='iBin_input_settings']/span")
	   			     private static WebElement cloneGeneralBinDropdownSettingBtn;
	   			     
	   			     
	   			     @FindBy(xpath="//*[@id='BrowsepImage']")
	   			     private static WebElement cloneGeneralUploadImageOrFileBtn;
	   			     
	   			     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
	   			     private static WebElement cloneGeneralSaveBtn;
	   			     
	   			     @FindBy(xpath="//*[@id='GeneratecloneMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	   			     private static WebElement cloneGeneralCLoseBtn;
	   			        	     
			   @FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
			   private static WebElement ItemcloneUnitsBtn;	     

		   			 @FindBy(xpath="//*[@id='iDefaultBaseUnit']")
		   		     private static WebElement cloneUnitsDefaultBaseUnitDropdown;
		   				     
		   			 @FindBy(xpath="//*[@id='iDefaultBaseUnit_input_settings']/span")
		   		     private static WebElement cloneUnitsDefaultBaseUnitSetting;
		   			 
		   			 @FindBy(xpath="//*[@id='iDefaultSalesUnit']")
		   		     private static WebElement cloneUnitsDefaultSalesUnitDropdown;
		   			 
		   			 @FindBy(xpath="//*[@id='iDefaultSalesUnit_input_settings']/span")
		   		     private static WebElement cloneUnitsDefaultSalesUnitSettingsBtn;
		   			 
		   			 @FindBy(xpath="//*[@id='iDefaultPurchaseUnit']")
		   		     private static WebElement cloneUnitsDefaultPurchaseUnitDropDown;
		   			 
		   			 @FindBy(xpath="//*[@id='iDefaultPurchaseUnit_input_settings']/span")
		   		     private static WebElement cloneUnitsDefaultPurchaseUnitSettingsBtn;
		   			 
		   			 @FindBy(xpath="//*[@id='fLength']")
		   		     private static WebElement cloneUnitsLength;
		   			 
		   			 @FindBy(xpath="//*[@id='fWidth']")
		   		     private static WebElement cloneUnitswidth;
		   			 
		   			 @FindBy(xpath="//*[@id='fHeight']")
		   		     private static WebElement cloneUnitsHeight;
		   			 
		   			 @FindBy(xpath="//*[@id='fCBM']")
		   		     private static WebElement itemcloneUnitsCBM;
		   			 
		   			 @FindBy(xpath="//*[@id='fWeight']")
		   		     private static WebElement cloneUnitsWeight;

			   @FindBy(xpath="//*[@id='divBtnGroup2']/div/a")
			   private static WebElement ItemcloneSettingsBtn;

			   	     @FindBy(xpath="//*[@id='fStandardCost']")
			   	     private static WebElement cloneSettingsStandardCost;
			   	     
			   	     @FindBy(xpath="//*[@id='fOverheadCost']")
			   	     private static WebElement cloneSettingsOverheadCost;
			   	     
			   	     @FindBy(xpath="//*[@id='fIndirectCost']")
			   	     private static WebElement cloneSettingsIndirectCost;
			   	     
			   	     @FindBy(xpath="//*[@id='fProfit']")
			   	     private static WebElement cloneSettingsProfit;
			   	     
			   	     @FindBy(xpath="//*[@id='iDontshowproductexpireddays']")
			   	     private static WebElement cloneSettingsDontshowproductexpireddays;
			   	     
			   	     @FindBy(xpath="//*[@id='iTaxCode']")
			   	     private static WebElement cloneSettingsTaxCode;
			   	     
			   	     @FindBy(xpath="//*[@id='iTaxCode_input_settings']/span")
			   	     private static WebElement cloneSettingsTaxCodeSttingsBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
			   	     private static WebElement cloneSettingsSaveBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='GeneratecloneMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			   	     private static WebElement cloneSettingsCloseBtn;
			   	       	     

			   @FindBy(xpath="//*[@id='divBtnGroup3']/div/a")
			   private static WebElement ItemcloneClassificationBtn;


		   		     @FindBy(xpath="//*[@id='iABCCodeValue']")
		   		     private static WebElement cloneItemClassificationABC_CodeValueDropdown;
		   		     
		   		     @FindBy(xpath="//*[@id='iABCCodeMargin']")
		   		     private static WebElement cloneItemClassificationABC_CodeMarginDropdOwn;
		   		     
		   		     @FindBy(xpath="//*[@id='iABCCodeRevenue']")
		   		     private static WebElement cloneItemClassificationABCCodeRevenueDropdown;
		   		     
		   		     @FindBy(xpath="//*[@id='iABCCodeCarryingCost']")
		   		     private static WebElement cloneItemClassificationABCCodeCarryingCostDropdown;
		   		    
		   		     @FindBy(xpath="//*[@id='sBarcode1']")
		   		     private static WebElement cloneItemClassificationBarcode1;
		   		     
		   		     @FindBy(xpath="//*[@id='sBarcode2']")
		   		     private static WebElement cloneItemClassificationBarcode2;
		   		     
		   		     @FindBy(xpath="//*[@id='sBarcode3']")
		   		     private static WebElement cloneItemClassificationBarcode3;
		   		     
		   		     @FindBy(xpath="//*[@id='iUnit1']")
		   			 private static WebElement cloneItemgridFirstrowUnit;
		   			
		   			 @FindBy(xpath="//*[@id='sBarcode1']")
		   			 private static WebElement cloneItemgridFirstrowBarcode;
		   			
		   			 ///////Grid elements***********************************
		   			
		   			 @FindBy(xpath="//*[@id='sBatch1']")
		   			 private static WebElement cloneItemClassificationgridFirstrowBatch;
		   			
		   			 @FindBy(xpath="//*[@id='iUnit2']")
		   			 private static WebElement cloneItemClassificationgridSecondrowUnit;
		   			
		   			 @FindBy(xpath="//*[@id='sBarcode2']")
		   			 private static WebElement cloneItemClassificationgridSecondrowBarcode;
		   			
		   			 @FindBy(xpath="//*[@id='sBatch2']")
		   			 private static WebElement cloneItemClassificationgridSecondrowBatch;
		   			
		   			 @FindBy(xpath="//*[@id='iUnit3']")
		   			 private static WebElement cloneItemClassificationgridThridrowUnit;
		   			
		   			 @FindBy(xpath="//*[@id='sBarcode3']")
		   			 private static WebElement cloneItemClassificationgridThridrowBarcode;
		   			
		   			 @FindBy(xpath="//*[@id='sBatch3']")
		   			 private static WebElement cloneItemClassificationgridThridrowBatch;
		   			
		   			 @FindBy(xpath="//*[@id='iUnit_input_settings']")
		   			 private static WebElement cloneItemClassificationgridUnitSettings;

			   @FindBy(xpath="//*[@id='divBtnGroup4']/div/a")
			   private static WebElement ItemcloneOtherDetailsBtn;

			   	     @FindBy(xpath="//*[@id='iCostOfIssueitem']")
			   	     private static WebElement cloneOtherDetailsCostOfIssueitem;
			   	     
			   	     @FindBy(xpath="//*[@id='iCostOfIssueitem_input_settings']/span")
			   	     private static WebElement cloneOtherDetailsCostOfIssueitemsettingsBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='iStocksitem']")
			   	     private static WebElement cloneOtherDetailsStocksitem;
			   	     
			   	     @FindBy(xpath="//*[@id='iStocksitem_input_settings']/span")
			   	     private static WebElement cloneOtherDetailsiStocksitemsettingsBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='iSalesitem']")
			   	     private static WebElement cloneOtherDetailsSalesitem;
			   	     
			   	     @FindBy(xpath="//*[@id='iSalesitem_input_settings']/span")
			   	     private static WebElement cloneOtherDetailsSalesitemsettingsBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='iWIPitem']")
			   	     private static WebElement cloneOtherDetailsWIPitem;
			   	     
			   	     @FindBy(xpath="//*[@id='iWIPitem_input_settings']/span")
			   	     private static WebElement cloneOtherDetailsWIPitemsettingsBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='iCostofShortageStockAC']")
			   	     private static WebElement cloneOtherDetailsCostofShortageStockAC;
			   	     
			   	     @FindBy(xpath="//*[@id='iCostofShortageStockAC_input_settings']/span")
			   	     private static WebElement cloneOtherDetailsCostofShortageStockACsettingsBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='iCostofExcessStockAC']")
			   	     private static WebElement cloneOtherDetailsCostofExcessStockAC;
			   	     
			   	     @FindBy(xpath="//*[@id='iCostofExcessStockAC_input_settings']/span")
			   	     private static WebElement cloneOtherDetailsCostofExcessStockACsettingsBtn;
			   	    
			   	     @FindBy(xpath="//*[@id='iCostofSaleReturnAC']")
			   	     private static WebElement cloneOtherDetailsCostofSaleReturnAC;
			   	     
			   	     @FindBy(xpath="//*[@id='iCostofSaleReturnAC_input_settings']/span")
			   	     private static WebElement cloneOtherDetailsCostofSaleReturnACsettingsBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='iPurchaseVarianceAC']")
			   	     private static WebElement cloneOtherDetailsPurchaseVarianceAC;
			   	     
			   	     @FindBy(xpath="//*[@id='iPurchaseVarianceAC_input_settings']/span")
			   	     private static WebElement cloneOtherDetailsPurchaseVarianceACsettingsBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
			   	     private static WebElement clonecloneOtherDetailsSaveBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='GeneratecloneMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			   	     private static WebElement cloneOtherDetailsCloseBtn;
			   	     
			   	     //Grid Elements

			   	     @FindBy(xpath="//*[@id='ioWarehouse1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowWareHouse;
			   	     
			   	            @FindBy(xpath="//*[@id='ioWarehouse_input_settings']/span")
			   	            private static WebElement cloneGridWarehouseSettingBtn;
			   	 	
			   	 	@FindBy(xpath="//*[@id='1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowSupplier;
			   	 	
			   	 	       @FindBy(xpath="//*[@id='iSupplier_input_settings']/span")
			   	           private static WebElement cloneGridSupplierSettingBtn;
			   	 	
			   	 	@FindBy(xpath="//*[@id='sSupCode1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowCode;
			   	 	
			   	 	@FindBy(xpath="//*[@id='iStartDate1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowStartDate;
			   	 	
			   	 	@FindBy(xpath="//*[@id='iEndDate1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowEnddate;
			   	 	
			   	 	@FindBy(xpath="//*[@id='fRate1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowRate;

			   	 	@FindBy(xpath="//*[@id='iTolerance1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstTolerance;

			   	 	@FindBy(xpath="//*[@id='iLeadTime1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowLeadTime;

			   	 	@FindBy(xpath="//*[@id='iCrcloneDays1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowUnitCrcloneDays;
			   	 	
			   	 	@FindBy(xpath="//*[@id='iCrcloneLimit1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowCrcloneLimit;

			   	 	@FindBy(xpath="//*[@id='LeastDeliveryDate1']")
			   	 	private static WebElement cloneOtherDetailsgridFirstrowLastDeliveryDate;

			   @FindBy(xpath="//*[@id='divBtnGroup5']/div/a")
			   private static WebElement ItemcloneReplenishmentBtn;

			   	     @FindBy(xpath="//*[@id='iDefaultReplenishment']")
			   	     private static WebElement clonereplenishmentDefaultReplenishment;
			   	     
			   	     @FindBy(xpath="//*[@id='iManufacturePolicy']")
			   	     private static WebElement clonereplenishmentManufacturePolicy;
			   	     
			   	     @FindBy(xpath="//*[@id='iPackingBOM']")
			   	     private static WebElement clonereplenishmentPackingBOM;
			   	     
			   	     @FindBy(xpath="//*[@id='iPackingBOM_input_settings']/span")
			   	     private static WebElement clonereplenishmentPackingBOMsettingsBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='iBOM']")
			   	     private static WebElement clonereplenishmentBOM;
			   	     
			   	     @FindBy(xpath="//*[@id='iFlushing']")
			   	     private static WebElement clonereplenishmentFlushing;
			   	     
			   	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
			   	     private static WebElement clonereplenishmentSaveBtn;
			   	     
			   	     @FindBy(xpath="//*[@id='GeneratecloneMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			   	     private static WebElement clonereplenishmentCloseBtn;
			   	     
			   	     //Grid
			   	     
			   	     @FindBy(xpath="//*[@id='irWarehouse1']")
			   	     private static WebElement clonereplenishmentGridFirstRowWarehouse;
			   	     
			   	     @FindBy(xpath="//*[@id='irStartdate1']")
			   	     private static WebElement clonereplenishmentGridFirstRowStartDate;
			   	     
			   	     @FindBy(xpath="//*[@id='irEnddate1']")
			   	     private static WebElement clonereplenishmentGridFirstRowEndDate;
			   	     
			   	     @FindBy(xpath="//*[@id='iReplenishqty1']")
			   	     private static WebElement clonereplenishmentGridFirstRowReplenishqty;
			   	   
			   	     @FindBy(xpath="//*[@id='iReorderPolicy1']")
			   	     private static WebElement clonereplenishmentGridFirstRowReorderPolicy;
			   	     
			   	     @FindBy(xpath="//*[@id='fSafetyStock1']")
			   	     private static WebElement clonereplenishmentGridFirstRowSafetyStock;
			   	     
			   	     @FindBy(xpath="//*[@id='iSafetyLeadTime1']")
			   	     private static WebElement clonereplenishmentFirstRowSafetyLeadTime;
			   	     
			   	     @FindBy(xpath="//*[@id='fReordercycle1']")
			   	     private static WebElement clonereplenishmentFirstRowReordercycle;
			   	     
			   	     @FindBy(xpath="//*[@id='fReorderPoint1']")
			   	     private static WebElement clonereplenishmentFirstRowReorderPoint;
			   	     
			   	     @FindBy(xpath="//*[@id='fReorderQuantity1']")
			   	     private static WebElement clonereplenishmentFirstRowReorderQuantity;
			   	     
			   	     @FindBy(xpath="//*[@id='fMaxInventoryLevel1']")
			   	     private static WebElement clonereplenishmentFirstRowMaxInventoryLevel;
			   	     
			   	     @FindBy(xpath="//*[@id='iDefaultVendor1']")
			   	     private static WebElement clonereplenishmentFirstRowDefaultVendor;
			   	        	     
			   	     @FindBy(xpath="//*[@id='fMinOrderQuantity1']")
			   	     private static WebElement clonereplenishmentFirstRowMinOrderQuantity;
   	     
			   	     @FindBy(xpath="//*[@id='fMaxOrderQuantity1']")
			   	     private static WebElement clonereplenishmentFirstRowMaxOrderQuantity1;
			   	     	   	     
			   	     @FindBy(xpath="//*[@id='fOrderMultiple1']")
			   	     private static WebElement clonereplenishmentFirstRowOrderMultiple;
			   	      
				  @FindBy(xpath="//*[@id='divBtnGroup7']/div/a")
				  private static WebElement ItemcloneOutletBtn;

	   			     @FindBy(xpath="//*[@id='txtsrch-term0']")
	   			     private static WebElement cloneOutletSearchOutlet;
	   			     
	   			     @FindBy(xpath="//*[@id='cmbUserTypeMaster']")
	   			     private static WebElement cloneOutletAdvanceSearch;
	   			     
	   			     @FindBy(xpath="//*[@id='chkResizeGrid0']/span")
	   			     private static WebElement cloneOutletResizeBtn;
	   			     
	   			     @FindBy(xpath="//*[@id='chkRetainSelection']")
	   			     private static WebElement cloneOutletRetainSelctionCheckBox;
	   			     
	   			     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
	   			     private static WebElement cloneOutletSaveBtn;
	   			     
	   			     @FindBy(xpath="//*[@id='GeneratecloneMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	   			     private static WebElement cloneOutletCloseBtn;
	     
	     
			     @FindBy(xpath="//*[@id='btnProperties']")
			     private static WebElement itemPropertiesBtn;

	                 @FindBy(xpath="//*[@id='viewheading']/div/span[2]")
	                 private static WebElement ItemPropertiesLabel;
	     
				     @FindBy(xpath=" //*[@id='btnPropOk']/i")
				     private static WebElement ItemPropertiesOkBtn;
				     
				     @FindBy(xpath="//*[@id='divMasterProperty']/ul/li/span[2]")
				     private static WebElement ItemPropertiesCloseBtn;
				     
				     @FindBy(xpath="//*[@id='chkDontMaintainStockbyBatch']")
				     private static WebElement PropertiesDontMaintainStockbyBatchChekbox;
				     
				     @FindBy(xpath="//*[@id='chkDontinputBin']")
				     private static WebElement ItemPropertiesDontinputBinChekbox;
				     
				     @FindBy(xpath="//*[@id='chkDontMaintainStocksByRMA']")
				     private static WebElement ItemPropertiesDontMaintainStocksByRMAChekbox;
				     
				     @FindBy(xpath="//*[@id='chkInputBreakupofQuantitiesForEachCategories']")
				     private static WebElement ItemPropertiesInputBreakupofQuantitiesForEachCategoriesChekbox;
				     
				     @FindBy(xpath="//*[@id='chkDonotPrintBill']")
				     private static WebElement ItemPropertiesDonotPrintBillIfRateIsZeroChekbox;
				     
				     @FindBy(xpath="//*[@id='chkNotAllowedforHomeDelivery']")
				     private static WebElement ItemPropertiesNotAllowedforHomeDeliveryChekbox;
				     
				     @FindBy(xpath="//*[@id='chkStarProduct']")
				     private static WebElement ItemPropertiesStarProductChekbox;
				     
				     @FindBy(xpath="//*[@id='chkDonotUpdateStock']")
				     private static WebElement ItemPropertiesDonotUpdateStockChekbox;
				     
				     @FindBy(xpath="//*[@id='chkIgnoreExpiryforthisItem']")
				     private static WebElement ItemPropertiesIgnoreExpiryforthisItemChekbox;
				     
				     @FindBy(xpath="//*[@id='chkIgnoreFractionInQty']")
				     private static WebElement ItemPropertiesIgnoreFractionInQtyChekbox;
				     
				     @FindBy(xpath="//*[@id='rbnNone']")
				     private static WebElement ItemPropertiesNoneRadioBtn;
				     
				     @FindBy(xpath="//*[@id='rbnQualities']")
				     private static WebElement ItemPropertiesQualitesRadioBtn;
				     
				     @FindBy(xpath="//*[@id='rbnReserveBy']")
				     private static WebElement ItemPropertiesReserverByRadioBtn;
				     
				     @FindBy(xpath="//*[@id='chkBatch']")
				     private static WebElement ItemPropertiesBatchChekbox;
				     
				     @FindBy(xpath="//input[@id='chkBin']")
				     private static WebElement ItemPropertiesBinChekbox;
				     
				     @FindBy(xpath="//input[@id='chkRMA']")
				     private static WebElement ItemPropertiesRMAChekbox;
				     
				     @FindBy(xpath="//*[@id='ddlInventoryAllocation']")
				     private static WebElement ItemPropertiesInventoryAllocationDropdown;
				     
				     @FindBy(xpath="//*[@id='ddlStatus']")
				     private static WebElement ItemPropertiesActiveAndInactiveDropdown;
				
				     @FindBy(xpath="//*[@id='chkDoNotRestrictSelectionEvenIfRightsNotAllotted'] ")
				     private static WebElement ItemPropertiesDoNotRestrictSelectionEvenIfRightsNotAllottedChekbox;
				     
				     @FindBy(xpath="//*[@id='chkAllowOtherCompaniesToViewRecords']")
				     private static WebElement ItemPropertiesAllowOtherCompaniesToViewRecordsChekbox;

	     @FindBy(xpath="//*[@id='btnDelete']")
	     private static WebElement itemDeleteBtn;
	     
	     @FindBy(xpath="//*[@id='btnClose']")
	     private static WebElement itemCloseBtn;

	     @FindBy(xpath="//*[@id='toggle_ribbon']")
	     private static WebElement itemToggleRibbonBtn;

	     //Group Elements
	     
	     @FindBy(xpath="//*[@id='btnGroup']")
	     private static WebElement itemGroupBtn;

	                @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[1]/h4")
	                private static WebElement ItemGroupLabel;
	            
	            @FindBy(xpath="//*[@id='divBtnGroup0']/div/a")
	            private static WebElement ItemgroupGeneralBtn;
	          	     
      			     @FindBy(xpath="//*[@id='sName']")
      			     private static WebElement groupGeneralName;
      			     
      			     @FindBy(xpath="//*[@id='sCode']")
      			     private static WebElement groupGeneralCode;
      			     
      			     @FindBy(xpath="//*[@id='iProductType']")
      			     private static WebElement groupGeneralItemTypeDropDown;
      			     
      			     @FindBy(xpath="//*[@id='fReorderLevel']")
      			     private static WebElement groupGeneralReorderLevel;
      			     
      			     @FindBy(xpath="//*[@id='iBinCapacity']")
      			     private static WebElement groupGeneralBinCapacity;
      			     
      			     @FindBy(xpath="//*[@id='iValuationMethod']")
      			     private static WebElement groupGeneralValuationMethodDropDown;
      			     
      			     @FindBy(xpath="//*[@id='iCategory']")
      			     private static WebElement groupGeneralCategoryDropDown;
      			     
      			     @FindBy(xpath="//*[@id='iCategory_input_settings']/span")
      			     private static WebElement groupGeneralCategorySettingBtn;
      			     
      			     @FindBy(xpath="//*[@id='iProductMake']")
      			     private static WebElement groupGeneralItemMakeDropDown;
      			     
      			     @FindBy(xpath="//*[@id='Printer']")
      			     private static WebElement groupGeneralPrint;
      			     
      			     @FindBy(xpath="//*[@id='iAlternateCategory']")
      			     private static WebElement groupGeneralAlternativeCategoryDropdown;
      			     
      			     @FindBy(xpath="//*[@id='iAlternateCategory_input_settings']/span")
      			     private static WebElement groupGeneralAlternativeCategoryDropdownSettingBtn;
      			     
      			     @FindBy(xpath="//*[@id='sDescription']")
      			     private static WebElement groupGeneralDescription;
      			     
      			     @FindBy(xpath="//*[@id='bPerishableItem']")
      			     private static WebElement groupGeneralPerishableItemCheckBox;
      			     
      			     @FindBy(xpath="//*[@id='iBin']")
      			     private static WebElement groupGeneralBinDropdown;
      			     
      			     @FindBy(xpath="//*[@id='iBin_input_settings']/span")
      			     private static WebElement groupGeneralBinDropdownSettingBtn;
      			     
      			     @FindBy(xpath="//*[@id='BrowsepImage']")
      			     private static WebElement groupGeneralUploadImageOrFileBtn;
      			     
      			     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
      			     private static WebElement groupGeneralSaveBtn;
      			     
      			     @FindBy(xpath="//*[@id='GenerategroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
      			     private static WebElement groupGeneralCLoseBtn;
	     
		          @FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
		          private static WebElement ItemgroupUnitsBtn;	     

          			 @FindBy(xpath="//*[@id='iDefaultBaseUnit']")
          		     private static WebElement groupUnitsDefaultBaseUnitDropdown;
          				     
          			 @FindBy(xpath="//*[@id='iDefaultBaseUnit_input_settings']/span")
          		     private static WebElement groupUnitsDefaultBaseUnitSetting;
          			 
          			 @FindBy(xpath="//*[@id='iDefaultSalesUnit']")
          		     private static WebElement groupUnitsDefaultSalesUnitDropdown;
          			 
          			 @FindBy(xpath="//*[@id='iDefaultSalesUnit_input_settings']/span")
          		     private static WebElement groupUnitsDefaultSalesUnitSettingsBtn;
          			 
          			 @FindBy(xpath="//*[@id='iDefaultPurchaseUnit']")
          		     private static WebElement groupUnitsDefaultPurchaseUnitDropDown;
          			 
          			 @FindBy(xpath="//*[@id='iDefaultPurchaseUnit_input_settings']/span")
          		     private static WebElement groupUnitsDefaultPurchaseUnitSettingsBtn;
          			 
          			 @FindBy(xpath="//*[@id='fLength']")
          		     private static WebElement groupUnitsLength;
          			 
          			 @FindBy(xpath="//*[@id='fWidth']")
          		     private static WebElement groupUnitswidth;
          			 
          			 @FindBy(xpath="//*[@id='fHeight']")
          		     private static WebElement groupUnitsHeight;
          			 
          			 @FindBy(xpath="//*[@id='fCBM']")
          		     private static WebElement itemgroupUnitsCBM;
          			 
          			 @FindBy(xpath="//*[@id='fWeight']")
          		     private static WebElement groupUnitsWeight;

	            @FindBy(xpath="//*[@id='divBtnGroup2']/div/a")
	            private static WebElement ItemgroupSettingsBtn;

	          	     @FindBy(xpath="//*[@id='fStandardCost']")
	          	     private static WebElement groupSettingsStandardCost;
	          	     
	          	     @FindBy(xpath="//*[@id='fOverheadCost']")
	          	     private static WebElement groupSettingsOverheadCost;
	          	     
	          	     @FindBy(xpath="//*[@id='fIndirectCost']")
	          	     private static WebElement groupSettingsIndirectCost;
	          	     
	          	     @FindBy(xpath="//*[@id='fProfit']")
	          	     private static WebElement groupSettingsProfit;
	          	     
	          	     @FindBy(xpath="//*[@id='iDontshowproductexpireddays']")
	          	     private static WebElement groupSettingsDontshowproductexpireddays;
	          	     
	          	     @FindBy(xpath="//*[@id='iTaxCode']")
	          	     private static WebElement groupSettingsTaxCode;
	          	     
	          	     @FindBy(xpath="//*[@id='iTaxCode_input_settings']/span")
	          	     private static WebElement groupSettingsTaxCodeSttingsBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
	          	     private static WebElement groupSettingsSaveBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='GenerategroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	          	     private static WebElement groupSettingsCloseBtn;	     

	          @FindBy(xpath="//*[@id='divBtnGroup3']/div/a")
	          private static WebElement ItemgroupClassificationBtn;


          		     @FindBy(xpath="//*[@id='iABCCodeValue']")
          		     private static WebElement groupItemClassificationABC_CodeValueDropdown;
          		     
          		     @FindBy(xpath="//*[@id='iABCCodeMargin']")
          		     private static WebElement groupItemClassificationABC_CodeMarginDropdOwn;
          		     
          		     @FindBy(xpath="//*[@id='iABCCodeRevenue']")
          		     private static WebElement groupItemClassificationABCCodeRevenueDropdown;
          		     
          		     @FindBy(xpath="//*[@id='iABCCodeCarryingCost']")
          		     private static WebElement groupItemClassificationABCCodeCarryingCostDropdown;
          		    
          		     @FindBy(xpath="//*[@id='sBarcode1']")
          		     private static WebElement groupItemClassificationBarcode1;
          		     
          		     @FindBy(xpath="//*[@id='sBarcode2']")
          		     private static WebElement groupItemClassificationBarcode2;
          		     
          		     @FindBy(xpath="//*[@id='sBarcode3']")
          		     private static WebElement groupItemClassificationBarcode3;
          		     
          		     @FindBy(xpath="//*[@id='iUnit1']")
          			 private static WebElement groupItemgridFirstrowUnit;
          			
          			 @FindBy(xpath="//*[@id='sBarcode1']")
          			 private static WebElement groupItemgridFirstrowBarcode;
          			
          			 ///////Grid elements***********************************
          			 @FindBy(xpath="//*[@id='sBatch1']")
          			 private static WebElement groupItemClassificationgridFirstrowBatch;
          			
          			 @FindBy(xpath="//*[@id='iUnit2']")
          			 private static WebElement groupItemClassificationgridSecondrowUnit;
          			
          			 @FindBy(xpath="//*[@id='sBarcode2']")
          			 private static WebElement groupItemClassificationgridSecondrowBarcode;
          			
          			 @FindBy(xpath="//*[@id='sBatch2']")
          			 private static WebElement groupItemClassificationgridSecondrowBatch;
          			
          			 @FindBy(xpath="//*[@id='iUnit3']")
          			 private static WebElement groupItemClassificationgridThridrowUnit;
          			
          			 @FindBy(xpath="//*[@id='sBarcode3']")
          			 private static WebElement groupItemClassificationgridThridrowBarcode;
          			
          			 @FindBy(xpath="//*[@id='sBatch3']")
          			 private static WebElement groupItemClassificationgridThridrowBatch;
          			
          			 @FindBy(xpath="//*[@id='iUnit_input_settings']")
          			 private static WebElement groupItemClassificationgridUnitSettings;

	          @FindBy(xpath="//*[@id='divBtnGroup4']/div/a")
	          private static WebElement ItemgroupOtherDetailsBtn;

	          	     @FindBy(xpath="//*[@id='iCostOfIssueitem']")
	          	     private static WebElement groupOtherDetailsCostOfIssueitem;
	          	     
	          	     @FindBy(xpath="//*[@id='iCostOfIssueitem_input_settings']/span")
	          	     private static WebElement groupOtherDetailsCostOfIssueitemsettingsBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='iStocksitem']")
	          	     private static WebElement groupOtherDetailsStocksitem;
	          	     
	          	     @FindBy(xpath="//*[@id='iStocksitem_input_settings']/span")
	          	     private static WebElement groupOtherDetailsiStocksitemsettingsBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='iSalesitem']")
	          	     private static WebElement groupOtherDetailsSalesitem;
	          	     
	          	     @FindBy(xpath="//*[@id='iSalesitem_input_settings']/span")
	          	     private static WebElement groupOtherDetailsSalesitemsettingsBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='iWIPitem']")
	          	     private static WebElement groupOtherDetailsWIPitem;
	          	     
	          	     @FindBy(xpath="//*[@id='iWIPitem_input_settings']/span")
	          	     private static WebElement groupOtherDetailsWIPitemsettingsBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='iCostofShortageStockAC']")
	          	     private static WebElement groupOtherDetailsCostofShortageStockAC;
	          	     
	          	     @FindBy(xpath="//*[@id='iCostofShortageStockAC_input_settings']/span")
	          	     private static WebElement groupOtherDetailsCostofShortageStockACsettingsBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='iCostofExcessStockAC']")
	          	     private static WebElement groupOtherDetailsCostofExcessStockAC;
	          	     
	          	     @FindBy(xpath="//*[@id='iCostofExcessStockAC_input_settings']/span")
	          	     private static WebElement groupOtherDetailsCostofExcessStockACsettingsBtn;
	          	    
	          	     @FindBy(xpath="//*[@id='iCostofSaleReturnAC']")
	          	     private static WebElement groupOtherDetailsCostofSaleReturnAC;
	          	     
	          	     @FindBy(xpath="//*[@id='iCostofSaleReturnAC_input_settings']/span")
	          	     private static WebElement groupOtherDetailsCostofSaleReturnACsettingsBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='iPurchaseVarianceAC']")
	          	     private static WebElement groupOtherDetailsPurchaseVarianceAC;
	          	     
	          	     @FindBy(xpath="//*[@id='iPurchaseVarianceAC_input_settings']/span")
	          	     private static WebElement groupOtherDetailsPurchaseVarianceACsettingsBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
	          	     private static WebElement groupgroupOtherDetailsSaveBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='GenerategroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	          	     private static WebElement groupOtherDetailsCloseBtn;
	          	     
	          	     //Grid

	          	     @FindBy(xpath="//*[@id='ioWarehouse1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowWareHouse;
	          	     
	          	            @FindBy(xpath="//*[@id='ioWarehouse_input_settings']/span")
	          	            private static WebElement groupGridWarehouseSettingBtn;
	          	 	
	          	 	@FindBy(xpath="//*[@id='1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowSupplier;
	          	 	
	          	 	       @FindBy(xpath="//*[@id='iSupplier_input_settings']/span")
	          	           private static WebElement groupGridSupplierSettingBtn;
	          	 	
	          	 	@FindBy(xpath="//*[@id='sSupCode1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowCode;
	          	 	
	          	 	@FindBy(xpath="//*[@id='iStartDate1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowStartDate;
	          	 	
	          	 	@FindBy(xpath="//*[@id='iEndDate1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowEnddate;
	          	 	
	          	 	@FindBy(xpath="//*[@id='fRate1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowRate;

	          	 	@FindBy(xpath="//*[@id='iTolerance1']")
	          	 	private static WebElement groupOtherDetailsgridFirstTolerance;

	          	 	@FindBy(xpath="//*[@id='iLeadTime1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowLeadTime;

	          	 	@FindBy(xpath="//*[@id='iCrgroupDays1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowUnitCrgroupDays;
	          	 	
	          	 	@FindBy(xpath="//*[@id='iCrgroupLimit1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowCrgroupLimit;

	          	 	@FindBy(xpath="//*[@id='LeastDeliveryDate1']")
	          	 	private static WebElement groupOtherDetailsgridFirstrowLastDeliveryDate;

	          @FindBy(xpath="//*[@id='divBtnGroup5']/div/a")
	          private static WebElement ItemgroupReplenishmentBtn;

	          	     @FindBy(xpath="//*[@id='iDefaultReplenishment']")
	          	     private static WebElement groupreplenishmentDefaultReplenishment;
	          	     
	          	     @FindBy(xpath="//*[@id='iManufacturePolicy']")
	          	     private static WebElement groupreplenishmentManufacturePolicy;
	          	     
	          	     @FindBy(xpath="//*[@id='iPackingBOM']")
	          	     private static WebElement groupreplenishmentPackingBOM;
	          	     
	          	     @FindBy(xpath="//*[@id='iPackingBOM_input_settings']/span")
	          	     private static WebElement groupreplenishmentPackingBOMsettingsBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='iBOM']")
	          	     private static WebElement groupreplenishmentBOM;
	          	     
	          	     @FindBy(xpath="//*[@id='iFlushing']")
	          	     private static WebElement groupreplenishmentFlushing;
	          	     
	          	     @FindBy(xpath="//*[@id='btnMasterSaveClick']")
	          	     private static WebElement groupreplenishmentSaveBtn;
	          	     
	          	     @FindBy(xpath="//*[@id='GenerategroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	          	     private static WebElement groupreplenishmentCloseBtn;
	          	     
	          	     ///Grid
	          	     
	          	     @FindBy(xpath="//*[@id='irWarehouse1']")
	          	     private static WebElement groupreplenishmentGridFirstRowWarehouse;
	          	     
	          	     @FindBy(xpath="//*[@id='irStartdate1']")
	          	     private static WebElement groupreplenishmentGridFirstRowStartDate;
	          	     
	          	     @FindBy(xpath="//*[@id='irEnddate1']")
	          	     private static WebElement groupreplenishmentGridFirstRowEndDate;
	          	     
	          	     @FindBy(xpath="//*[@id='iReplenishqty1']")
	          	     private static WebElement groupreplenishmentGridFirstRowReplenishqty;
	          	   
	          	     @FindBy(xpath="//*[@id='iReorderPolicy1']")
	          	     private static WebElement groupreplenishmentGridFirstRowReorderPolicy;
	          	     
	          	     @FindBy(xpath="//*[@id='fSafetyStock1']")
	          	     private static WebElement groupreplenishmentGridFirstRowSafetyStock;
	          	     
	          	     @FindBy(xpath="//*[@id='iSafetyLeadTime1']")
	          	     private static WebElement groupreplenishmentFirstRowSafetyLeadTime;
	          	     
	          	     @FindBy(xpath="//*[@id='fReordercycle1']")
	          	     private static WebElement groupreplenishmentFirstRowReordercycle;
	          	     
	          	     @FindBy(xpath="//*[@id='fReorderPoint1']")
	          	     private static WebElement groupreplenishmentFirstRowReorderPoint;
	          	     
	          	     @FindBy(xpath="//*[@id='fReorderQuantity1']")
	          	     private static WebElement groupreplenishmentFirstRowReorderQuantity;
	          	     
	          	     @FindBy(xpath="//*[@id='fMaxInventoryLevel1']")
	          	     private static WebElement groupreplenishmentFirstRowMaxInventoryLevel;
	          	     
	          	     @FindBy(xpath="//*[@id='iDefaultVendor1']")
	          	     private static WebElement groupreplenishmentFirstRowDefaultVendor;
	          	     	          	     
	          	     @FindBy(xpath="//*[@id='fMinOrderQuantity1']")
	          	     private static WebElement groupreplenishmentFirstRowMinOrderQuantity;	          	     
	          	     
	          	     @FindBy(xpath="//*[@id='fMaxOrderQuantity1']")
	          	     private static WebElement groupreplenishmentFirstRowMaxOrderQuantity1;
	          	           	     
	          	     @FindBy(xpath="//*[@id='fOrderMultiple1']")
	          	     private static WebElement groupreplenishmentFirstRowOrderMultiple;
	          	              	     
		          @FindBy(xpath="//*[@id='divBtnGroup7']/div/a")
		          private static WebElement ItemgroupOutletBtn;

      			     @FindBy(xpath="//*[@id='txtsrch-term0']")
      			     private static WebElement groupOutletSearchOutlet;
      			     
      			     @FindBy(xpath="//*[@id='cmbUserTypeMaster']")
      			     private static WebElement groupOutletAdvanceSearch;
      			     
      			     @FindBy(xpath="//*[@id='chkResizeGrid0']/span")
      			     private static WebElement groupOutletResizeBtn;
      			     
      			     @FindBy(xpath="//*[@id='chkRetainSelection']")
      			     private static WebElement groupOutletRetainSelctionCheckBox;
      			     
      			     @FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
      			     private static WebElement groupOutletSaveBtn;
      			     
      			     @FindBy(xpath="//*[@id='GenerategroupMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
      			     private static WebElement groupOutletCloseBtn;
	          
			     @FindBy(xpath="//*[@id='btnModifier']")
			     private static WebElement itemModifierBtn;
			
					     @FindBy(xpath="//*[@id='btnAddSingle']")
					     private static WebElement ItemModifierAddSingleBtn;
					
					     @FindBy(xpath="//*[@id='divModifier']/ul/li/span[2]")
					     private static WebElement ItemModifierCloseBtn;
					
					     
					     @FindBy(xpath="//*[@id='btnSaveProdModifier']")
					     private static WebElement ItemModifierSaveBtn;
					     
					     @FindBy(xpath="//*[@id='btnAddMulitple']")
					     private static WebElement ItemModifierAddMultipleBtn;
					     
					     @FindBy(xpath="//*[@id='id_LoadFrom']")
					     private static WebElement ItemModifierLoadFrom;
					     
					     @FindBy(xpath="//*[@id='id_LoadFrom_input_settings']/span")
					     private static WebElement ItemModifierLoadFromSettingBtn;
			   

				     @FindBy(xpath="//*[@id='btnSetType']")
				     private static WebElement itemSettypeBtn;
			
						     @FindBy(xpath="//*[@id='btnOKsetType']/i")
						     private static WebElement ItemSettypeOkBtn;
						     
						     @FindBy(xpath="//*[@id='divMasterSetType']/ul/li/span[2]/i")
						     private static WebElement ItemSettypeCancelBtn;
				   
				     @FindBy(xpath="//*[@id='btnDeleteAll']")
				     private static WebElement itemDeleteAllBtn;
			
				     @FindBy(xpath="//i[@class='icon-font6 icon-closed-account']")
				     private static WebElement itemCloseAcountItemBtn;
			
				     @FindBy(xpath="//i[@class='icon-font6 icon-open-close-account']")
				     private static WebElement itemOpenCLoseitemItemBtn;
			
			
				     @FindBy(xpath="//i[@class='icon-font6 icon-import']")
				     private static WebElement itemAdvanceMasterImportORExportBtn;


	                 @FindBy(xpath="//*[@id='viewheading']/div/span[2]")
	                 private static WebElement MasterImporExpLabel;
	     
				     @FindBy(xpath=" //*[@id='txtAdvImportFileName']")
				     private static WebElement MasterImporExpFieldName;
				     
				     @FindBy(xpath="//*[@id='btnFile']")
				     private static WebElement MasterImporExpUploadFileInFieldNameBtn;
				     
				     @FindBy(xpath="//*[@id='id_MasterExportTemplate']")
				     private static WebElement MasterImporExpTemplateName;
				     
				     @FindBy(xpath="//*[@id='id_MasterExportTemplate_input_settings']/span")
				     private static WebElement MasterImporExpTemplateNameSettingBtn;
				     
				     @FindBy(xpath="//*[@id='ddlHeaderFieldAction']")
				     private static WebElement MasterImporExpHeaderFieldDropdown;    
				     
				     @FindBy(xpath="//*[@id='ddlImportAction']")
				     private static WebElement MasterImporExpBodyFieldDropdown;
				     
				     @FindBy(xpath="//*[@id='ddlBulkImport']")
				     private static WebElement MasterImporExpBulkImportDropdown;
				     
     
				     @FindBy(xpath="//*[@id='divAdvMasterImportExport']/ul/li[1]/div/span")
				     private static WebElement MasterImporExpBulkBtn;
				     
				     @FindBy(xpath="//*[@id='btnMappingForAdvanceMasterPopUp']")
				     private static WebElement MasterImporExpSaveMappingBtn;
				     
				     
				     @FindBy(xpath="//*[@id='btnProformaExportForAdvanceMasterPopUp']")
				     private static WebElement MasterImporExp_ExportBtn;
				     
				     @FindBy(xpath="//*[@id='btnImportDataForAdvanceMasterPopUp']")
				     private static WebElement MasterImporExp_Importdata;
				     
				     @FindBy(xpath="//*[@id='divAdvMasterImportExport']/ul/li[2]/span[4]")
				     private static WebElement MasterImporExpCloseBtn;
	     
	     
	   /*  @FindBy(xpath="//i[@class='icon-convert icon-font6']")
	     private static WebElement itemUnitConversionBtn;*/

	     @FindBy(xpath="//span[@id='btnAuthInfo']")
	     private static WebElement itemAuthInfoBtn;


	     @FindBy(xpath="//*[@id='btnMoveUp']")
	     private static WebElement itemMoveUpBtn;

	     @FindBy(xpath="//*[@id='btnMOveDown']")
	     private static WebElement itemMoveDownBtn;


	     @FindBy(xpath="//*[@id='btnSorting']")
	     private static WebElement itemSortingBtn;
	     
	     @FindBy(xpath="//*[@id='btnMassUpdate']")
	     private static WebElement itemMassUpdateBtn;
	     
	     @FindBy(xpath="//*[@id='btnXMLImport']")
	     private static WebElement itemImportXMLBtn;
	     
	     @FindBy(xpath="//span[@id='btnXMLExport']")
	     private static WebElement itemExportFormatXMLBtn;
	     
	     
	     
	   //CustomizeMaster elements*****************************************
	     
       @FindBy(xpath="//span[@id='btnCustomizeMaster']")
       private static WebElement itemCustomizeMasterBtn;
     
	      @FindBy(xpath="//*[@id='allMasterCustTabs']/li[1]/span")
		   private static WebElement MasterFieldsListBtn;
		     
				@FindBy(xpath="//*[@id='masterFields_list']/li[1]/span")
				private static WebElement MasterFieldGeneralBtn;
							     
				     //General Main Tab
					
			       @FindBy(xpath="//*[@id='tabId_2']/ul/li[1]/a/span")
			       private static WebElement MasterFieldGeneralMainTab;
							     
					     @FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[1]/span")
					     private static WebElement generalMain_SaveBtn;
					     
					     @FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
					     private static WebElement generalMain_PreviewBtn;
					     
					     @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
					     private static WebElement generalMain_CloseBtn;
					     
					     @FindBy(xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr[1]/td[1]/i")
					     private static WebElement generalMainGridFirstRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr[2]/td[1]/i")
					     private static WebElement generalMainGridSecondRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr[3]/td[1]/i")
					     private static WebElement generalMainThirdRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr[4]/td[1]/i")
					     private static WebElement generalMainGridFourthRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr[5]/td[1]/i")
					     private static WebElement generalMainGridFifthRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mainTab_0']/div/div/table/tbody/tr[6]/td[1]/i")
					     private static WebElement generalMainGridSixthRow_EditBtn;
					         
					     @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[1]/a/span")
					     private static WebElement generalMain_FieldDetailsBtn;   
					     
					     @FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
					     private static WebElement generalMainFieldDetails_Caption;   
					     
					     @FindBy(xpath="//*[@id='ExtraField_FieldName']")
					     private static WebElement generalMainFieldDetails_Name;  
					     
					     @FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
					     private static WebElement generalMainFieldDetails_DatTypeDropdown;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
					     private static WebElement generalMainFieldDetails_DefaultValue;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_BannerText']")
					     private static WebElement generalMainFieldDetails_BannerText;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_MaxSize']")
					     private static WebElement generalMainFieldDetails_MaxSize;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_ControlType']")
					     private static WebElement generalMainFieldDetails_ControlTypeDropdown;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
					     private static WebElement generalMainFieldDetails_ToolTipText;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_RegularExpression']")
					     private static WebElement generalMainFieldDetails_RegularExpressionText;  
					  
                         @FindBy(xpath=" //*[@id='btnLoad_RExp']")
					     private static WebElement generalRegularExperssionLoad_ExpansionBtn;
					     
							     
						     @FindBy(xpath="//*[@id='txtRExpression_RExp']")
						     private static WebElement generalregExper_RegularExpression; 
						     
						     @FindBy(xpath="//*[@id='btnTestRExp']")
						     private static WebElement generalregrExper_TestBtn;
						     
						     @FindBy(xpath="//*[@id='txtTestExpression_RExp']")
						     private static WebElement generalregExper_TestString;
						     
						     @FindBy(xpath="//*[@id='txtNameExpression_RExp']")
						     private static WebElement generalregExper_Name;
						     
						     @FindBy(xpath="//*[@id='txtDescriptionExpression_RExp']")
						     private static WebElement generalregExper_Description;
						     
						     @FindBy(xpath="//*[@id='btnClearREFields']")
						     private static WebElement generalregExper_ClearBtn;
						     
						     @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[3]/button[1]")
						     private static WebElement generalregExper_OkBtn;
					     
						     @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[3]/button[2]")
						     private static WebElement generalregExper_CancelBtn;
						     
						     @FindBy(xpath="//*[@id='txtGroupsAndOptions']")
						     private static WebElement generalregExper_SearchTextBox;
									     
								   @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[1]/a")
								   private static WebElement generalregExperCharactersAndRepetitionsBtn;
								    
									     @FindBy(xpath="//*[@id='chkMatchIfAbsent_Regex']")
									     private static WebElement generalCharactersAndRepetitions_MatchOnlyIfAbsentChekbox;
									     
									     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[2]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_AnyCharcterRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[3]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_AlphanumericRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[4]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_DigitRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[5]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_WhiteSpaceRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[6]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_SpecificCharcterRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[7]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_NamedClassRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[9]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_SpecifiedSetRadioBtn;
									     
									     @FindBy(xpath="//*[@id='chkRepetition_RegEx']")
									     private static WebElement generalCharactersAndRepetitions_AsFewAsPossibleChekbox;
									     
									     @FindBy(xpath="//*[@id='expRepetitions']/div[2]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_JustOnceRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expRepetitions']/div[3]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_AnyNumberRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expRepetitions']/div[4]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_ONeOrMoreRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expRepetitions']/div[4]/div/label/input")
									     private static WebElement generalCharactersAndRepetitions_ZeroOrOneRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expRepetitions_Extra']/div[1]/label/input")
									     private static WebElement generalCharactersAndRepetitions_ExactlyRadioBtn;
									     
									     @FindBy(xpath="//*[@id='expRepetitions_Extra']/div[3]/label/input")
									     private static WebElement generalCharactersAndRepetitions_AtleastnRadioBtn;
									     
									     @FindBy(xpath="//*[@id=expRepetitions_Extra']/div[5]/label/input")
									     private static WebElement generalCharactersAndRepetitions_BetweenmAndmRadioBtn;
								     
									     @FindBy(xpath=" //*[@id='CharsAndRepetitions_RExp']/div[1]/div/button")
									     private static WebElement generalCharactersAndRepetitions_InsertBtn;
									     
												     
								              @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[2]/a")
								              private static WebElement generalregExperGroupsAndOptionsBtn;
											     
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[1]/div/label/input")
									               private static WebElement generalgroupAndOption_NumberCaptureRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[2]/div/label/input")
									               private static WebElement generalgroupAndOption_NonCapturingGroupRadioBtn;
										           
										           @FindBy(xpath="//*[@id='chkMatchGroupName1']")
									               private static WebElement generalgroupAndOption_Name1RadioBtn;
										           
										           @FindBy(xpath="//*[@id='txtMatchGroupName1']")
									               private static WebElement generalgroupAndOption_Name1;
										           
										           @FindBy(xpath="//*[@id='txtMatchGroupName2']")
									               private static WebElement generalgroupAndOption_Name2;
										           
										           @FindBy(xpath="//*[@id='chkMatchGroupName2']")
									               private static WebElement generalgroupAndOption_Name2RadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[5]/div/label/input")
									               private static WebElement generalgroupAndOption_MatchSufficButExcludeItRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[6]/div/label/input")
									               private static WebElement generalgroupAndOption_LessThanRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[7]/div/label/input")
									               private static WebElement generalgroupAndOption_LessThanEqualRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[8]/div/label/input")
									               private static WebElement generalgroupAndOption_MatchIfPrefixIsNotPresentRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[9]/div/label/input")
									               private static WebElement generalgroupAndOption_GreddySubExpressionRadioBtn;
										           
										           @FindBy(xpath="//*[@id='chkMatchGroupComment']")
									               private static WebElement generalgroupAndOption_CommentRadioBtn;
										           
										           @FindBy(xpath="//*[@id='txtMatchGroupComment']")
									               private static WebElement generalgroupAndOption_Comment;
										           
										           @FindBy(xpath="//*[@id='chkNonCapturingGroup']")
									               private static WebElement generalgroupAndOption_NonCapturingGroupChekbox;
										           
										           @FindBy(xpath="//*[@id='chkEnclosingGroup']")
									               private static WebElement generalgroupAndOption_EnclosingGroupChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[1]/div/label/input")
									               private static WebElement generalgroupAndOption_IgnoreCaseiChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[2]/div/label/input")
									               private static WebElement generalgroupAndOption_MultilinemChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[3]/div/label/input")
									               private static WebElement generalgroupAndOption_SingleLineChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[4]/div/label/input")
									               private static WebElement generalgroupAndOption_ExplictCaptureChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[5]/div/label/input")
									               private static WebElement generalgroupAndOption_IgnorepatternwhitespaceChekbox;
										           
										           @FindBy(xpath="//*[@id='GroupsAndOptions_RExp']/div[1]/div/button")
									               private static WebElement generalgroupAndOption_InsertBtn;
								           
								             @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[3]/a")
								             private static WebElement generalregExperSpecialCharacters;               
								
												   @FindBy(xpath=" //*[@id='SpecialCharacters_RExp']/div[1]/div/button")
												   private static WebElement generalSpecialCharacters_InsertBtn;
												   
												   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[1]/div/label/input")
												   private static WebElement generalSpecialCharacters_BellRadioBtn;
											       
												   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[2]/div/label/input")
												   private static WebElement generalSpecialCharacters_BackSpaceRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[3]/div/label/input")
												   private static WebElement generalSpecialCharacters_TabRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[4]/div/label/input")
												   private static WebElement generalSpecialCharacters_CarriageReturnRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[5]/div/label/input")
												   private static WebElement generalSpecialCharacters_VerticalTabRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[5]/div/label/input")
												   private static WebElement generalSpecialCharacters_FormFeedRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[7]/div/label/input")
												   private static WebElement generalSpecialCharacters_NewLineRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[8]/div/label/input")
												   private static WebElement generalSpecialCharacters_EscapeRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[1]/div/label/input")
												   private static WebElement generalSpecialCharacters_BenningStringOrLineRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[2]/div/label/input")
												   private static WebElement generalSpecialCharacters_EndOfStringOrLineRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[3]/div/label/input")
												   private static WebElement generalSpecialCharacters_AlterNationRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[1]/div/label/input")
												   private static WebElement generalSpecialCharacters_BenningOfString;
												   
												   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[2]/div/label/input")
												   private static WebElement generalSpecialCharacters_EndOfStringOrBeforNewLineAtEnd;
												   
												   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[3]/div/label/input")
												   private static WebElement generalSpecialCharacters_EndOfStringRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[4]/div/label/input")
												   private static WebElement generalSpecialCharacters_BenningOfCurrentSearchRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[5]/div/label/input")
												   private static WebElement generalSpecialCharacters_FirstOrLastCharcterInWordRadioBtn;
												   
												   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[6]/div/label/input")
												   private static WebElement generalSpecialCharacters_NotFirstOrLastCharcterInWordRadioBtn;
								   
												     
				                              @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[4]/a")
								              private static WebElement generalregExperExistingRegexBtn;
														     
											  @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[5]/a")
											  private static WebElement generalregExperHelp;
											  
												  @FindBy(xpath="//*[@id='Help_SyntaxElements']")
												  private static WebElement generalHelp_SyntaxElementsRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_Characters']")
												  private static WebElement generalHelp_CharactersRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_Quantifier']")
												  private static WebElement generalHelp_QuantifierRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_Anchors']")
												  private static WebElement generalHelp_AnchorsRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_CharacterClass']")
												  private static WebElement generalHelp_CharacterClassRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_ExtendedGroups']")
												  private static WebElement generalHelp_ExtendedGroupsRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_BackReference']")
												  private static WebElement generalHelp_BackReferenceRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_SubexpCall']")
												  private static WebElement generalHelp_SubexpCallRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_CapturedGroup']")
												  private static WebElement generalHelp_CapturedGroupRadioBtn;
												  
										     
									      @FindBy(xpath="//*[@id='ExtraField_ErrorMessage']")
									      private static WebElement generalMainEditFieldDetailsErrorMessage;  
										     
								@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
								private static WebElement generalmainPropertiesBtn;		     
										     
									@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
									private static WebElement generalmainProperties_PartOfDeliveryAddressChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
									private static WebElement generalmainProperties_PartOfBillingAddressChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
									private static WebElement generalmainProperties_MandatoryChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
									private static WebElement generalmainProperties_AllowAsParameterChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
									private static WebElement generalmainProperties_HiddenChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
									private static WebElement generalmainProperties_HiddenInGroupChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
									private static WebElement generalmainProperties_SpellCheckChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
									private static WebElement generalmainProperties_MandatoryInGroupChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
									private static WebElement generalmainProperties_AuditTrialChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
									private static WebElement generalmainProperties_NotAvailableForReportsChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
									private static WebElement generalmainProperties_MergeFieldChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
									private static WebElement generalmainProperties_MassUpdateChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
									private static WebElement generalmainProperties_IncludeInQuickCreateChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
									private static WebElement generalmainProperties_CannotBeExportedChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
									private static WebElement generalmainProperties_CannotBeImportedChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
									private static WebElement generalmainProperties_CopyFromParentChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
									private static WebElement generalmainProperties_ReadOnlyChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
									private static WebElement generalmainProperties_InformationFieldChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
									private static WebElement generalmainProperties_IsMandatoryInRevisionChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
									private static WebElement generalmainProperties_AvailableinCustomerPortalChekbox;
									
									@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
									private static WebElement generalmainProperties_EditableinCustomerPortalChekbox;
									
									@FindBy(xpath="//*[@id='Behaviour']")
									private static WebElement generalmainProperties_BehaviourDropdown;
									
					        @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
							private static WebElement  customizegeneralMainFormattingBtn ;
					        
							        @FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
									private static WebElement generalmainFormattingColumnSpan ;
							        
							        @FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
									private static WebElement generalmainFormattingRowSpan ;
							        
							        @FindBy(xpath="//*[@id='CharacterCasing']")
									private static WebElement generalmainFormattingCharacterCasingDropdown ;
							        
							        @FindBy(xpath="//*[@id='TextAlign']")
									private static WebElement generalmainFormattingTextAlignDropdown ;
							        
							        @FindBy(xpath="//*[@id='FieldsDetails_Font']")
									private static WebElement generalmainFormattingFieldsDetailsFont ;
							        
							        @FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
							        private static WebElement generalmainFormattingBackColor ;
							        
							        @FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
									private static WebElement generalmainFormattingFieldsDetailsFont_Btn ;
							        
							        //Elements are used for font edit option pop in field details and rules 
							        
								        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
										private static WebElement generalmainFontAreialDropdown ;
								        
								        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
										private static WebElement generalmainFontStyleDropdown ;
								        
								        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
										private static WebElement generalmainFontWeightDropdown ;
		
								        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
										private static WebElement generalmainFontSizeDropdown ;
								        
								        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
										private static WebElement generalmainForeColourDropdown ;
								        
								        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
										private static WebElement generalmainBackColorDropdown ;
								        
								        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
										private static WebElement generalmainBaselineChekbox ;
								        
								        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
										private static WebElement generalmainOverLineChekbox ;
								        
								        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
										private static WebElement generalmainStrikeThroughChekbox ;
								        
								        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
										private static WebElement generalmainUnderlineChekbox ;
								        
								        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
										private static WebElement generalmainEnableFontChekbox ;
								        
								        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
										private static WebElement generalmainFrontPriveiw ;
								        
								        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
										private static WebElement generalmainFrontSaveBtn ;
								        
								        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
										private static WebElement generalmainFrontCloseBtn ;
								        
								    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
								    private static WebElement generalmainForMatFieldDeatailsOkBtn ;
								        
								    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
								    private static WebElement generalmainForMatFieldDeatailsCanceBtn ;
											        
			  
					 @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
					 private static WebElement generalmainrulesBtn ;
							        
			            @FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
					    private static WebElement generalMainrulesClickHereAddRuleButtonBtn ;
			        
				        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
						private static WebElement generalMainrulesRuleNameDropdown ;
				        
				        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
						private static WebElement generalMainrulesRuleNameSetingBtn ;
				        
				        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
						private static WebElement generalMainrulesSaveBtn ;
				        
				        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
						private static WebElement generalMainrulesNewBtn ;
				        
				        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
						private static WebElement generalMainrulesDeleteBtn ;
				        
				        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
						private static WebElement generalMainrulesCloseBtn ;
				        
				        @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
						private static WebElement generalMainrulesCreatingGroupChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
						private static WebElement generalMainrulesNewRecordChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
						private static WebElement generalMainrulesEditChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
						private static WebElement generalMainrulesLoadChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
						private static WebElement generalMainrulesBeforeSaveChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
						private static WebElement generalMainrulesOnLeaveChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
						private static WebElement generalMainrulesBeforeDeleteChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
						private static WebElement generalMainrulesOnEnterChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
						private static WebElement generalMainrulesActiveChekbox ;
				        
				        @FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
						private static WebElement generalMainrulesNoConditionChekbox;
				        
				        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
				        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
				        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
						private static WebElement generalMainrulesIfBtn ;
				        
				        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
				        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
				        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
						private static WebElement generalMainrulesElseBtn ;
											        
											        
											        
											        
				        // if 
				    	
				        @FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
				    	private static WebElement generalMainrulesIfSelectFieldDropdown ;
				        
				        @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
				    	private static WebElement generalMainrulesIfOPerationTypeDropdown ;
				        
				        @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
				    	private static WebElement generalMainrulesIfCompareTypeDropdown;          //Value,Field,Formula---Related
				        
				        @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
				    	private static WebElement generalMainrulesIfValueType;
				        
				        @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
				    	private static WebElement generalMainrulesIfConnterDropdown;          //Only,And,Or--RelatedDD
	
				       
				    	
				    	//IF **** Formatting
				    	
				    	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
				    	private static WebElement generalMainrulesIFFormatting ;
				        
				        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
				    	private static WebElement generalMainrulesIFFormattingGridFieldName ;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
				    	private static WebElement generalMainrulesIFFormattingGridChangeValue ;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
				    	private static WebElement generalMainrulesIFFormattingGridField ;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
				    	private static WebElement generalMainrulesIFFormattingGridValue ;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
				    	private static WebElement generalMainrulesIFFormattingGridCaption ;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
				    	private static WebElement generalMainrulesIFFormattingGridRegularExpression ;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
				    	private static WebElement generalMainrulesIFFormattingGridErrorMesage ;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
				    	private static WebElement generalMainrulesIFFormattingGridBannerText ;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
				    	private static WebElement generalMainrulesIFFormattingGridToolTip;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
				    	private static WebElement generalMainrulesIFFormattingGridMandatoryChekbox;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
				    	private static WebElement generalMainrulesIFFormattingGridHiddenChekbox;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
				    	private static WebElement generalMainrulesIFFormattingGridDisableChekbox;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
				    	private static WebElement generalMainrulesIFFormattingGridSpellCheckChekbox;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
				    	private static WebElement generalMainrulesIFFormattingGridAligementDropdown;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
				    	private static WebElement generalMainrulesIFFormattingGridCharacterCasting;
				        
				        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
				    	private static WebElement generalMainrulesIFFormattingGridSelectFont;
				        
				        
				        /// done
				      
											        
				        @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
				    	private static WebElement generalMainrulesIFMessage ;
				        
				        
				        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
				    	private static WebElement generalMainrulesIFMessagesInformationRadioBtn;
				        
				        @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
				    	private static WebElement generalMainrulesIFMessagesGeneralInformation;
				        
				        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
				    	private static WebElement generalMainrulesIFMessagesWarnAndProceddRadioBtn;
				        
				        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
				    	private static WebElement generalMainrulesIFMessagesWarnAndStopRadioBtn;
				        
				        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
				    	private static WebElement generalMainrulesIFAlertMessage;
				        
				        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
				    	private static WebElement generalMainrulesIFCustmizeTemplateDropdown;

				        ///// IF ****Alerts-----Grid Elements
				        
				        @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
				    	private static WebElement generalMainrulesIFAlert ;
				        

				        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
				    	private static WebElement generalMainrulesIfAlertMessage;
				     
				        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
				    	private static WebElement generalMainrulesIfCustmizeTemplateDropdown;
				        
				        
				        
				        
				        @FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
				    	private static WebElement generalMainrulesIFAlertsGridTypeDropdown;
				        
				        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
				    	private static WebElement generalMainrulesIFAlertsGridToWhomDropdown;
				        
				        @FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
				    	private static WebElement generalMainrulesIFAlertsGridSmsDropdown;
				        
				        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
				    	private static WebElement generalMainrulesIFAlertsGridEmail;
				        
				        @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
				    	private static WebElement generalMainrulesIFAlertsGridDashBoardDropdown;
				        
				        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
				    	private static WebElement generalMainrulesIFAlertsGridPopDropdown;
				        
				        @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
				    	private static WebElement generalMainrulesIFAlertsGridGTalkDropdown;
				        
				        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
				    	private static WebElement generalMainrulesIFAlertsGridSendSpecficMessageDropdown;
				        
				        @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
				    	private static WebElement generalMainrulesIFAlertsGridSpecificMessage;
				        
				        // alert over
				        
				        ///////Grid Elements------Formatting------Else Module
				        
				        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
				       	private static WebElement generalMainrulesElseFormatting ;
				        
				        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
				    	private static WebElement generalMainrulesElseFormattingGridFieldName ;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
				    	private static WebElement generalMainrulesElseFormattingGridChangeValue ;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
				    	private static WebElement generalMainrulesElseFormattingGridField ;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
				    	private static WebElement generalMainrulesElseFormattingGridValue ;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
				    	private static WebElement generalMainrulesElseFormattingGridCaption ;
				     
				        @FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
				    	private static WebElement generalMainrulesElseFormattingGridRegularExpression ;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
				    	private static WebElement generalMainrulesElseFormattingGridErrorMesage ;
				     
				        @FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
				    	private static WebElement generalMainrulesElseFormattingGridBannerText ;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
				    	private static WebElement generalMainrulesElseFormattingGridToolTip;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
				    	private static WebElement generalMainrulesElseFormattingGridMandatoryChekbox;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
				    	private static WebElement generalMainrulesElseFormattingGridHiddenChekbox;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
				    	private static WebElement generalMainrulesElseFormattingGridDisableChekbox;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
				    	private static WebElement generalMainrulesElseFormattingGridSpellCheckChekbox;
				     
				        @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
				    	private static WebElement generalMainrulesElseFormattingGridAligementDropdown;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
				    	private static WebElement generalMainrulesElseFormattingGridCharacterCasting;
				     
				        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
				    	private static WebElement generalMainrulesElseFormattingGridSelectFont;
				     

				     // else message
				        
				        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
				       	private static WebElement generalMainrulesElsetMessage ;
				     
				        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
				    	private static WebElement generalMainrulesElseMessagesInformationRadioBtn;
				     
				        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
				    	private static WebElement generalMainrulesElseMessagesGeneralMessage;
				     
				        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
				    	private static WebElement generalMainrulesElseMessagesWarnAndProceddRadioBtn;
				     
				        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
				    	private static WebElement generalMainrulesElseMessagesWarnAndStopRadioBtn;
				     
				        
				        
				        
				        
				        
				        /////  Else*****Alerts-----Grid Elements
				        
				        
				        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
				       	private static WebElement generalMainrulesElseAlert ;
				     
				        
				        @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
				    	private static WebElement generalMainrulesElseAlertMessage;
				     
				        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
				    	private static WebElement generalMainrulesElseCustmizeTemplateDropdown;


				     
				        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
				    	private static WebElement generalMainrulesElseAlertsGridTypeDropdown;
				     
				        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
				    	private static WebElement generalMainrulesElseAlertsGridToWhomDropdown;
				     
				        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
				    	private static WebElement generalMainrulesElseAlertsGridSmsDropdown;
				     
				        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
				    	private static WebElement generalMainrulesElseAlertsGridEmail;
				     
				        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
				     	private static WebElement generalMainrulesElseAlertsGridDashBoardDropdown;
				     
				        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
				    	private static WebElement generalMainrulesElseAlertsGridPopDropdown;
				     
				       @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
				    	private static WebElement generalMainrulesElseAlertsGridGTalkDropdown;
				     
				        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
				    	private static WebElement generalMainrulesElseAlertsGridSendSpecficMessageDropdown;
				     
				        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
				    	private static WebElement generalMainrulesElseAlertsGridSpecificMessage;
				        
				        
				        // Alert over
				     
				        
				        // Header
				        
				        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
				    	private static WebElement generalMainrulesElseAlertsSaveBtn;
				     
				        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
				    	private static WebElement generalMainrulesElseAlertsNewBtn;
				     
				        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
				    	private static WebElement generalMainrulesElseAlertsDeleteBtn;
				     
				        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
				    	private static WebElement generalMainrulesElseAlertsCloseBtn;
				     
				     
				      // General Main *** External modules
				        
				    @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
				    private static WebElement generalMainExternalModules;			     
				     
				    @FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
				    private static WebElement generalmainExternalModulesOnEventDropdown;	

				    @FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
				    private static WebElement generalmainExternalModulesButtonCaption;

				    @FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
				    private static WebElement generalmainExternalModules_ModuleTypeBtn;

				    @FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
				    private static WebElement generalMainExternalModules_ModuleNameDropdown;

				    @FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
				    private static WebElement generalmainExternalModulesClassNameDropdown;

				    @FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
				    private static WebElement generalMainExternalModulesFuctionalNameDropdown;

				    @FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
				    private static WebElement generalMainExternalModulesAvabileInDropdown;

				    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
				    private static WebElement generalMainExternalModulesUpdateBtn;

				    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
				    private static WebElement generalmainExternalModulesSaveBtn;

				    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
				    private static WebElement generalmainExternalModulesEditBtn;

				    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
				    private static WebElement generalMainExternalModulesDeleteBtn;

				    @FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
				    private static WebElement generalmainExternalModulesCloseBtn;
				  
										  
		         //Header Elements								  
										
		         @FindBy(xpath="//*[@id='tabId_2']/ul/li[2]/a/span")
			     private static WebElement masterFielditemGeneralHeaderDetailsTab;
	         
                     //header main screen related elements
									     
					  @FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
					  private static WebElement masterFielditemGeneralHeaderSaveBtn;
							     
					  @FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/div[2]")
					  private static WebElement masterFielditemGeneralHeaderMoveFiledBtn;
							     
					  @FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
					  private static WebElement masterFielditemGeneralHeaderAddBtn;
							     
					  @FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
					  private static WebElement masterFielditemGeneralHeaderPreview;
							     
					  @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
					  private static WebElement masterFielditemGeneralHeaderCloseBtn;
							     
		              //Grid Elements
			 
					  @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[1]/td[1]/i[1]")
					  private static WebElement masterFielditemGeneralHeaderFirstRowEditBtn;
							   
							     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[2]/td[1]/i[1]")
				      private static WebElement masterFielditemGeneralHeaderSecondRowEditBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[3]/td[1]/i[1]")
				      private static WebElement masterFielditemGeneralHeaderThirdRowEditBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[4]/td[1]/i[1]")
				      private static WebElement masterFielditemGeneralHeaderFourthRowEditBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[5]/td[1]/i[1]")
				      private static WebElement masterFielditemGeneralHeaderFifthRowEditBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[6]/td[1]/i[1]")
				      private static WebElement masterFielditemGeneralHeaderSixthRowEditBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[7]/td[1]/i[1]")
				      private static WebElement masterFielditemGeneralHeaderSeventhRowEditBtn;
				    
				      //Row Delete Elements------->>>>>>>General---HeaderDetails
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[1]/td[1]/i[2]")
				      private static WebElement masterFielditemGeneralHeaderFirstRowDeleteBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[2]/td[1]/i[2]")
				      private static WebElement masterFielditemGeneralHeaderSecondRowDeleteBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[3]/td[1]/i[2]")
				      private static WebElement masterFielditemGeneralHeaderThirdRowDeleteBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[4]/td[1]/i[2]")
				      private static WebElement masterFielditemGeneralHeaderFourthRowDeleteBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[5]/td[1]/i[2]")
				      private static WebElement masterFielditemGeneralHeaderFifthRowDeleteBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[6]/td[1]/i[2]")
				      private static WebElement masterFielditemGeneralHeaderSixthRowDeleteBtn;
				     
				      @FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[7]/td[1]/i[2]")
				      private static WebElement masterFielditemGeneralHeaderSeventhRowDeleteBtn;
				     

				@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[1]/a/span")
				private static WebElement itemGeneralHeaderFieldDetailsBtn;   

				@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
				private static WebElement itemGeneralHeaderEditFieldDetailsCaption;   
			
				@FindBy(xpath="//*[@id='ExtraField_FieldName']")
				private static WebElement itemGeneralHeaderEditFieldDetailsName;  
			
				@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
				private static WebElement itemGeneralHeaderEditFieldDetailsDatTypeDropdown;  
			
				@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
				private static WebElement itemGeneralHeaderEditFieldDetailsDefaultValue;  
			
				@FindBy(xpath="//*[@id='ExtraField_BannerText']")
				private static WebElement itemGeneralHeaderEditFieldDetailsBannerText;  
			
				@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
				private static WebElement itemGeneralHeaderEditFieldDetailsMaxSize;  
			
				@FindBy(xpath="//*[@id='ExtraField_ControlType']")
				private static WebElement itemGeneralHeaderEditFieldDetailsControlTypeDropdown;  
			
				@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
				private static WebElement itemGeneralHeaderEditFieldDetailsToolTipText;
			
				@FindBy(xpath="//*[@id='ExtraField_IncludeGroups']")
				private static WebElement itemGeneralHeaderInclideGroupDropdown;
			
				@FindBy(xpath="//*[@id='ExtraField_MasterToLink']")
				private static WebElement itemGeneralHeaderMasterToLinkDropdown;
			
				@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_image']/span")
				private static WebElement itemGeneralHeaderMasterToLinkExpansionBtn;
			
				@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_settings']/span")
				private static WebElement itemGeneralHeaderMasterToLinkSettingBtn;
	
		     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_container']")
		     private static WebElement itemGeneralMasterToLink_Expansion_ScaptionText;

               //Pop up
		       @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[1]")
		       private static WebElement itemGeneralMasterToLink_StandardFieldsBtn;
		
				     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_list']")
				     private static WebElement itemGeneralMasterToLink_StandardField_FieldDropdown;
				
				     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_header']")
				     private static WebElement itemGeneralMasterToLink_StandardField_HeaderText;
				
				     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_alignment']")
				     private static WebElement itemGeneralMasterToLink_StandardField_AlignmentDropdown;
				
				     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_width']")
				     private static WebElement itemGeneralMasterToLink_StandardField_WidthText;
				
				     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
				     private static WebElement itemGeneralMasterToLink_StandardField_OkBtn;
				
				     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
				     private static WebElement itemGeneralMasterToLink_StandardField_CanceBtn;
			
						     
			    @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[2]")
				private static WebElement itemGeneralMasterToLink_DeleteColoumnBtn;
			   
			    @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
				private static WebElement itemGeneralMasterToLink_OkBtn;
			   
			    @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
				private static WebElement itemGeneralMasterToLink_CancelBtn;
			
			   
		@FindBy(xpath="//*[@id='ExtraField_MandatoryFields']")
		private static WebElement itemGeneralHeaderMandatoryFieldsText;
	
			//Grid Filter Criteria-----First Row
	
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-1']/span")
		    private static WebElement itemGeneralHeaderFilterDeleteFirstColoumn;
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-2']")
		    private static WebElement itemGeneralHeaderFilterFirstOnColoumnDropdown;
	
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-3']")
		    private static WebElement itemGeneralHeaderFilterFirstOperator;
	
		    @FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_1-4;]")
		    private static WebElement itemGeneralHeaderFilterFirstCompareWith;
	
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-5']")
		    private static WebElement itemGeneralHeaderFilterFirstFilterValueAndFiled;
	
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-6']")
		    private static WebElement itemGeneralHeaderFilterFirstLinkFlied;
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-7']")
		    private static WebElement itemGeneralHeaderFilterFirstConjuction;
	
	    
	    
		    //Grid Filter Criteria-----Second Row
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-1']/span")
		    private static WebElement itemGeneralHeaderFilterDeleteSecondColoumn;
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-2']")
		    private static WebElement itemGeneralHeaderFilterSecondFilterOnColoumnDropdown;
		
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-3']")
		    private static WebElement itemGeneralHeaderFilterSecondOperator;
		
		    @FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_2-4;]")
		    private static WebElement itemGeneralHeaderFilterSecondCompareWith;
		
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-5']")
		    private static WebElement itemGeneralHeaderFilterSecondFilterValueAndFiled;
		
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-6']")
		    private static WebElement itemGeneralHeaderFilterSecondLinkFlied;
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-7']")
		    private static WebElement itemGeneralHeaderFilterSecondConjuction;

		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
		private static WebElement itemGeneralHeaderFeildDetailsOkBtn;
		    
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
		private static WebElement itemGeneralHeaderFeildDetailsCancelBtn;
		    
		  @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
		  private static WebElement itemGeneralHeaderPropertiesBtn;		     
				     
			@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
			private static WebElement itemGeneralHeaderProperties_PartOfDeliveryAddressCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
			private static WebElement itemGeneralHeaderProperties_PartOfBillingAddresCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
			private static WebElement itemGeneralHeaderProperties_MandatoryCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
			private static WebElement itemGeneralHeaderProperties_AllowAsParameterCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
			private static WebElement itemGeneralHeaderProperties_HiddenCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
			private static WebElement itemGeneralHeaderProperties_HiddenInGroupCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
			private static WebElement itemGeneralHeaderProperties_SpellCheckCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
			private static WebElement itemGeneralHeaderProperties_MandatoryInGroupCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
			private static WebElement itemGeneralHeaderProperties_AuditTrialCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
			private static WebElement itemGeneralHeaderProperties_NotAvailableForReportCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
			private static WebElement itemGeneralHeaderProperties_MergeFieldCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
			private static WebElement itemGeneralHeaderProperties_MassUpdateCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
			private static WebElement itemGeneralHeaderProperties_IncludeInQuickCreateCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
			private static WebElement itemGeneralHeaderProperties_CannotBeExportedCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
			private static WebElement itemGeneralHeaderProperties_CannotBeImportedCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
			private static WebElement itemGeneralHeaderProperties_CopyFromParentCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
			private static WebElement itemGeneralHeaderProperties_ReadOnlyCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
			private static WebElement itemGeneralHeaderProperties_InformationFieldCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
			private static WebElement itemGeneralHeaderProperties_IsMandatoryInRevisionCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
			private static WebElement itemGeneralHeaderProperties_AvailableinCustomerPortalCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
			private static WebElement itemGeneralHeaderProperties_EditableinCustomerPortalCheckbox;
			
			@FindBy(xpath="//*[@id='Behaviour']")
			private static WebElement itemGeneralHeaderProperties_BehaviourDropdown;

		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
		private static WebElement  generalcustomizeHeaderFormattingBtn ;
	
		    @FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
			private static WebElement itemGeneralHeaderFormattingColumnSpan ;
		   
		    @FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
			private static WebElement itemGeneralHeaderFormattingRowSpan ;
		   
		    @FindBy(xpath="//*[@id='CharacterCasing']")
			private static WebElement itemGeneralHeaderFormattingCharacterCasingDropdown ;
		   
		    @FindBy(xpath="//*[@id='TextAlign']")
			private static WebElement itemGeneralHeaderFormattingTextAlignDropdown;
		   
		    @FindBy(xpath="//*[@id='FieldsDetails_Font']")
			private static WebElement itemGeneralHeaderFormattingFieldsDetailsFont ;
		   
		    @FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
		    private static WebElement itemGeneralHeaderFormattingBackColor ;
		   
		    @FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
			private static WebElement itemGeneralHeaderFormattingFieldsDetailsFont_Btn ;
	   
	        //Elements are used for font edit option pop in field details and rules 
	   
	        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderFontAreialDropdown ;
	        
	        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderFontStyleDropdown;
	        
	        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderFontWeightDropdown;

	        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderFontSizeDropdown;
	        
	        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderForeColourDropdown ;
	        
	        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderBackColorDropdown ;
	        
	        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderBaselineCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderOverLineCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderStrikeThroughCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderUnderlineCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderEnableFontCheckbox;
	        
	        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
			private static WebElement itemGeneralHeaderFrontPriveiw ;
	        
	        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
			private static WebElement itemGeneralHeaderFrontSaveBtn ;
	        
	        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
			private static WebElement itemGeneralHeaderFrontCloseBtn ;
	        
	    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
	    private static WebElement itemGeneralHeaderForMatFieldDeatailsOkBtn ;
	        
	    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
	    private static WebElement itemGeneralHeaderForMatFieldDeatailsCanceBtn ;
						
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
		private static WebElement itemGeneralHeaderrulesBtn ;
	   
        @FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
		private static WebElement itemGeneralHeaderrulesClickHereAddRuleButtonBtn ;
        
	        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
			private static WebElement itemGeneralHeaderrulesRuleNameDropdown;
	        
	        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
			private static WebElement itemGeneralHeaderrulesRuleNameSetingBtn ;
	        
	        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
			private static WebElement itemGeneralHeaderrulesSaveBtn ;
	        
	        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
			private static WebElement itemGeneralHeaderrulesNewBtn ;
	        
	        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
			private static WebElement itemGeneralHeaderrulesDeleteBtn ;
	        
	        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
			private static WebElement itemGeneralHeaderrulesCloseBtn ;
	        
	        @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
			private static WebElement itemGeneralHeaderrulesCreatingGroupCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
			private static WebElement itemGeneralHeaderrulesNewRecordCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
			private static WebElement itemGeneralHeaderrulesEditCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
			private static WebElement itemGeneralHeaderrulesCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
			private static WebElement itemGeneralHeaderrulesBeforeSaveCheckbox ;
	        
	        @FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
			private static WebElement itemGeneralHeaderrulesOnLeaveCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
			private static WebElement itemGeneralHeaderrulesBeforeDeleteCheckbox ;
	        
	        @FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
			private static WebElement itemGeneralHeaderrulesOnEnterCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
			private static WebElement itemGeneralHeaderrulesActiveCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
			private static WebElement itemGeneralHeaderrulesNoConditionCheckbox;
	        
	        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
	        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
	        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
			private static WebElement itemGeneralHeaderrulesIfBtn ;
	        
	        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
	        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
	        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
			private static WebElement itemGeneralHeaderrulesElseBtn ;
	        

	        // if 
	       	
	        @FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIfSelectFieldDropdown ;
	           
	        @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIfOPerationTypeDropdown ;
	           
	        @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIfCompareTypeDropdown;          //Value,Field,Formula---Related
	           
	        @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIfValueType;
	           
	        @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIfConnterDropdown;          //Only,And,Or--RelatedDD

	          
	       	
	       	//IF **** Formatting
	       	
	       	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
	       	private static WebElement itemGeneralHeaderrulesIFFormatting ;
	           
	        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridFieldName ;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridChangeValue ;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridField ;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridValue ;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridCaption ;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridRegularExpression ;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridErrorMesage ;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridBannerText ;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridToolTip;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridMandatoryChekbox;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridHiddenChekbox;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridDisableChekbox;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridSpellCheckChekbox;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridAligementDropdown;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridCharacterCasting;
	           
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
	       	private static WebElement itemGeneralHeaderrulesIFFormattingGridSelectFont;
	        
	        @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
	       	private static WebElement itemGeneralHeaderrulesIFMessage ;
	           
	        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
	       	private static WebElement itemGeneralHeaderrulesIFMessagesInformationRadioBtn;
	           
	        @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIFMessagesGeneralInformation;
	           
	        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
	       	private static WebElement itemGeneralHeaderrulesIFMessagesWarnAndProceddRadioBtn;
	           
	        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
	       	private static WebElement itemGeneralHeaderrulesIFMessagesWarnAndStopRadioBtn;
	           
	        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertMessage;
	           
	        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIFCustmizeTemplateDropdown;

	        //IF Alerts Grid Elements
	           
	        @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
	       	private static WebElement itemGeneralHeaderrulesIFAlert ;
	          
	        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIfAlertMessage;
	        
	        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIfCustmizeTemplateDropdown;
	             
	        @FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertsGridTypeDropdown;
	           
	        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertsGridToWhomDropdown;
	           
	        @FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertsGridSmsDropdown;
	           
	        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertsGridEmail;
	           
	        @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertsGridDashBoardDropdown;
	           
	        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertsGridPopDropdown;
	           
	        @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertsGridGTalkDropdown;
	           
	        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertsGridSendSpecficMessageDropdown;
	           
	        @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesIFAlertsGridSpecificMessage;
	          
	           
	        //Grid Elements Formatting Else Module
	           
	        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
	        private static WebElement itemGeneralHeaderrulesElseFormatting ;
	           
	        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridFieldName ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridChangeValue ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridField ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridValue ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridCaption ;
	        
	        @FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridRegularExpression ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridErrorMesage ;
	        
	        @FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridBannerText ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridToolTip;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridMandatoryChekbox;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridHiddenChekbox;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridDisableChekbox;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridSpellCheckChekbox;
	        
	        @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridAligementDropdown;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridCharacterCasting;
	        
	        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
	       	private static WebElement itemGeneralHeaderrulesElseFormattingGridSelectFont;
	        

	         // else message
	           
	         @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
	         private static WebElement itemGeneralHeaderrulesElsetMessage ;
	        
	         @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
	       	 private static WebElement itemGeneralHeaderrulesElseMessagesInformationRadioBtn;
	        
	         @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
	       	 private static WebElement itemGeneralHeaderrulesElseMessagesGeneralMessage;
	        
	         @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
	       	 private static WebElement itemGeneralHeaderrulesElseMessagesWarnAndProceddRadioBtn;
	        
	         @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
	       	 private static WebElement itemGeneralHeaderrulesElseMessagesWarnAndStopRadioBtn;
	       
	           
	         //Else Alerts Grid Elements
           
            @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
          	private static WebElement itemGeneralHeaderrulesElseAlert ;
          
	        @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesElseAlertMessage;
	        
	        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
	       	private static WebElement itemGeneralHeaderrulesElseCustmizeTemplateDropdown;

	        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
	       	private static WebElement itemGeneralHeaderrulesElseAlertsGridTypeDropdown;
	        
	        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
	       	private static WebElement itemGeneralHeaderrulesElseAlertsGridToWhomDropdown;
	        
	        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
	       	private static WebElement itemGeneralHeaderrulesElseAlertsGridSmsDropdown;
	        
	        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
	       	private static WebElement itemGeneralHeaderrulesElseAlertsGridEmail;
	        
	            @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
	        	private static WebElement itemGeneralHeaderrulesElseAlertsGridDashBoardDropdown;
	        
	            @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
	       	    private static WebElement itemGeneralHeaderrulesElseAlertsGridPopDropdown;
	        
	         @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
	       	 private static WebElement itemGeneralHeaderrulesElseAlertsGridGTalkDropdown;
	        
	         @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
	       	 private static WebElement itemGeneralHeaderrulesElseAlertsGridSendSpecficMessageDropdown;
	        
	         @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
	       	 private static WebElement itemGeneralHeaderrulesElseAlertsGridSpecificMessage;
	          
	           
	         // Header
	           
	         @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
	       	 private static WebElement itemGeneralHeaderrulesElseAlertsSaveBtn;
	        
	         @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
	         private static WebElement itemGeneralHeaderrulesElseAlertsNewBtn;
	        
	         @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
	       	 private static WebElement itemGeneralHeaderrulesElseAlertsDeleteBtn;
	        
	         @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	       	 private static WebElement itemGeneralHeaderrulesElseAlertsCloseBtn;
	        
	        
	         // General Main External modules
	        
	        
    		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
    		private static WebElement itemGeneralHeaderExternalModules;			     
				    			     
				@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
				private static WebElement itemGeneralHeaderExternalModulesOnEventDropdown;	
				
				@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
				private static WebElement itemGeneralHeaderExternalModulesButtonCaption;
				
				@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
				private static WebElement itemGeneralHeaderExternalModules_ModuleTypeBtn;
				
				@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
				private static WebElement itemGeneralHeaderExternalModules_ModuleNameDropdown;
				
				@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
				private static WebElement itemGeneralHeaderExternalModulesClassNameDropdown;
				
				@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
				private static WebElement itemGeneralHeaderExternalModulesFuctionalNameDropdown;
				
				@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
				private static WebElement itemGeneralHeaderExternalModulesAvabileInDropdown;
				
				@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
				private static WebElement itemGeneralHeaderExternalModulesUpdateBtn;
				
				@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
				private static WebElement itemGeneralHeaderExternalModulesSaveBtn;
				
				@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
				private static WebElement itemGeneralHeaderExternalModulesEditBtn;
				
				@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
				private static WebElement itemGeneralHeaderExternalModulesDeleteBtn;
				
				@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
				private static WebElement itemGeneralHeaderExternalModulesCloseBtn;		  
		    						
		    //Customize View MasterField Units
			  
			  
			@FindBy(xpath="//*[@id='masterFields_list']/li[2]/span")
			private static WebElement MasterFieldUnitBtn;
		
			@FindBy(xpath="//*[@id='tabId_71']/ul/li[1]/a/span")
			private static WebElement MasterFieldUnitHeaderDetailsBtn;
									    
			@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
			private static WebElement MasterFieldUnitHeaderDetailsSaveBtn;			     
									     
			@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/div[2]")
			private static WebElement MasterFieldUnitHeaderDetailsMoveFieldBtn;
		
			@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
			private static WebElement MasterFieldUnitHeaderDetailsAddBtn;
		
			@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
			private static WebElement MasterFieldUnitHeaderDetailsPreviewBtn;
		
			@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
			private static WebElement MasterFieldUnitHeaderDetailsCloseBtn;

	        //Grid Elements
  
			 @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[1]/td[1]/i[1]")
			 private static WebElement itemUnitsHeaderFirstRowEditBtn;	   
			                   
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[2]/td[1]/i[1]")
		     private static WebElement itemUnitsHeaderSecondRowEditBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[3]/td[1]/i[1]")
		     private static WebElement itemUnitsHeaderThirdRowEditBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[4]/td[1]/i[1]")
		     private static WebElement itemUnitsHeaderFourthRowEditBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[5]/td[1]/i[1]")
		     private static WebElement itemUnitsHeaderFifthRowEditBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[6]/td[1]/i[1]")
		     private static WebElement itemUnitsHeaderSixthRowEditBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[7]/td[1]/i[1]")
		     private static WebElement itemUnitsHeaderSeventhRowEditBtn;
		    
		     //Row Delete Elements ItemUnits HeaderDetails
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[1]/td[1]/i[2]")
		     private static WebElement itemUnitsHeaderFirstRowDeleteBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[2]/td[1]/i[2]")
		     private static WebElement itemUnitsHeaderSecondRowDeleteBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[3]/td[1]/i[2]")
		     private static WebElement itemUnitsHeaderThirdRowDeleteBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[4]/td[1]/i[2]")
		     private static WebElement itemUnitsHeaderFourthRowDeleteBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[5]/td[1]/i[2]")
		     private static WebElement itemUnitsHeaderFifthRowDeleteBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[6]/td[1]/i[2]")
		     private static WebElement itemUnitsHeaderSixthRowDeleteBtn;
		     
		     @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[7]/td[1]/i[2]")
		     private static WebElement itemUnitsHeaderSeventhRowDeleteBtn;
		     

		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[1]/a/span")
		private static WebElement itemUnitsHeaderFieldDetailsBtn;   
	
	
		@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
		private static WebElement itemUnitsHeaderEditFieldDetailsCaption;   
	
		@FindBy(xpath="//*[@id='ExtraField_FieldName']")
		private static WebElement itemUnitsHeaderEditFieldDetailsNameText;  
	
		@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
		private static WebElement itemUnitsHeaderEditFieldDetailsDataTypeDropdown;  
	


		@FindBy(xpath="//*[@id='ExtraField_BannerText']")
		private static WebElement itemUnitsHeaderEditFieldDetailsBannerText;  
	
		@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
		private static WebElement itemUnitsHeaderEditFieldDetailsMaxSizeText;  
	
		@FindBy(xpath="//*[@id='ExtraField_ControlType']")
		private static WebElement itemUnitsHeaderEditFieldDetailsControlTypeDropdown;  
	
		@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
		private static WebElement itemUnitsHeaderEditFieldDetailsToolTipText;
	
		@FindBy(xpath="//*[@id='ExtraField_IncludeGroups']")
		private static WebElement itemUnitsHeaderInclideGroupDropdown;
	
		@FindBy(xpath="//*[@id='ExtraField_MasterToLink']")
		private static WebElement itemUnitsHeaderMasterToLinkDropdown;
	
		@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_image']/span")
		private static WebElement itemUnitsHeaderMasterToLinkExpansionBtn;
	
		@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_settings']/span")
		private static WebElement itemUnitsHeaderMasterToLinkSettingBtn;

			@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_container']")
			private static WebElement itemUnitsMasterToLink_Expansion_Scaption;
			
			  @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[1]")
			  private static WebElement MasterToLink_StandardFieldsBtn;

                  //Pop up
   
			     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_list']")
			     private static WebElement MasterToLink_StandardField_Fielddropdown;
			
			     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_header']")
			     private static WebElement MasterToLink_StandardField_HeaderText;
			
			     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_alignment']")
			     private static WebElement MasterToLink_StandardField_AlignmentDropdown;
			
			     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_width']")
			     private static WebElement MasterToLink_StandardField_WidthText;
			
			     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
			     private static WebElement itemUnitsMasterToLink_StandardField_OkBtn;
			
			     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
			     private static WebElement itemUnitsMasterToLink_StandardField_CanceBtn;

					     
		  @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[2]")
		  private static WebElement itemUnitsMasterToLink_DeleteColoumnBtn;
		 
		  @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
		  private static WebElement itemUnitsMasterToLink_OkBtn;
		 
		  @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
		  private static WebElement itemUnitsMasterToLink_CancelBtn;
		 

		@FindBy(xpath="//*[@id='ExtraField_MandatoryFields']")
		private static WebElement itemUnitsHeaderMandatoryFields;
	
		////Grid Filter Criteria-----First Row
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-1']/span")
		private static WebElement itemUnitsHeaderFilterDeleteFirstColoumn;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-2']")
		private static WebElement itemUnitsHeaderFilterFirstOnColoumnDropdown;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-3']")
		private static WebElement itemUnitsHeaderFilterFirstOperator;
	
		@FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_1-4;]")
		private static WebElement itemUnitsHeaderFilterFirstCompareWith;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-5']")
		private static WebElement itemUnitsHeaderFilterFirstFilterValueAndFiled;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-6']")
		private static WebElement itemUnitsHeaderFilterFirstLinkFlied;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-7']")
		private static WebElement itemUnitsHeaderFilterFirstConjuction;



		////Grid Filter Criteria-----Second Row
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-1']/span")
		private static WebElement itemUnitsHeaderFilterDeleteSecondColoumn;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-2']")
		private static WebElement itemUnitsHeaderFilterSecondFilterOnColoumnDropdown;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-3']")
		private static WebElement itemUnitsHeaderFilterSecondOperator;
	
		@FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_2-4;]")
		private static WebElement itemUnitsHeaderFilterSecondCompareWith;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-5']")
		private static WebElement itemUnitsHeaderFilterSecondFilterValueAndFiled;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-6']")
		private static WebElement itemUnitsHeaderFilterSecondLinkFlied;
	
		@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-7']")
		private static WebElement itemUnitsHeaderFilterSecondConjuction;
	
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
		private static WebElement itemUnitsHeaderFeildDetailsOkBtn;
	
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
		private static WebElement itemUnitsHeaderFeildDetailsCancelBtn;



		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
		private static WebElement itemUnitsHeaderPropertiesBtn;		     
	
			@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
			private static WebElement itemUnitsHeaderProperties_PartOfDeliveryAddressCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
			private static WebElement itemUnitsHeaderProperties_PartOfBillingAddressCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
			private static WebElement itemUnitsHeaderProperties_MandatoryCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
			private static WebElement itemUnitsHeaderProperties_AllowAsParameterCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
			private static WebElement itemUnitsHeaderProperties_HiddenCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
			private static WebElement itemUnitsHeaderProperties_HiddenInGroupCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
			private static WebElement itemUnitsHeaderProperties_SpellCheckCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
			private static WebElement itemUnitsHeaderProperties_MandatoryInGroupCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
			private static WebElement itemUnitsHeaderProperties_AuditTrialCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
			private static WebElement itemUnitsHeaderProperties_NotAvailableForReportsCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
			private static WebElement itemUnitsHeaderProperties_MergeFieldCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
			private static WebElement itemUnitsHeaderProperties_MassUpdateCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
			private static WebElement itemUnitsHeaderProperties_IncludeInQuickCreateCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
			private static WebElement itemUnitsHeaderProperties_CannotBeExportedCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
			private static WebElement itemUnitsHeaderProperties_CannotBeImportedCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
			private static WebElement itemUnitsHeaderProperties_CopyFromParentCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
			private static WebElement itemUnitsHeaderProperties_ReadOnlyCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
			private static WebElement itemUnitsHeaderProperties_InformationFieldCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
			private static WebElement itemUnitsHeaderProperties_IsMandatoryInRevisionCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
			private static WebElement itemUnitsHeaderProperties_AvailableinCustomerPortalCheckBox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
			private static WebElement itemUnitsHeaderProperties_EditableinCustomerPortalCheckBox;
			
			@FindBy(xpath="//*[@id='Behaviour']")
			private static WebElement itemUnitsHeaderProperties_BehaviourDropdown;
	
	


		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
		private static WebElement  itemUnitscustomizeHeaderFormattingBtn ;
	
		@FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
		private static WebElement itemUnitsHeaderFormattingColumnSpanText ;
	
		@FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
		private static WebElement itemUnitsHeaderFormattingRowSpanText ;
	
		@FindBy(xpath="//*[@id='CharacterCasing']")
		private static WebElement itemUnitsHeaderFormattingCharacterCasingDropdown ;
	
		@FindBy(xpath="//*[@id='TextAlign']")
		private static WebElement itemUnitsHeaderFormattingTextAlignDropdown ;
	
		@FindBy(xpath="//*[@id='FieldsDetails_Font']")
		private static WebElement HeaderFormattingFieldsDetailsFontText;
	
		@FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
		private static WebElement HeaderFormattingFieldsDetailsFontExpansionBtn;
	
		@FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
		private static WebElement itemUnitsHeaderFormattingBackColor ;
	
		@FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
		private static WebElement itemUnitsHeaderFormattingFieldsDetailsFont_Btn ;
	
		//Elements are used for font edit option pop in field details and rules 
	
		@FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderFontAreialDropdown ;
	
		@FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderFontStyleDropdown;
	
		@FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderFontWeightDropdown;
	
		@FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderFontSizeDropdown ;
	
		@FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderForeColourDropdown;
	
		@FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderBackColorDropdown;
	
		@FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderBaselineChekbox;
	
		@FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderOverLineChekbox;
	
		@FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderStrikeThroughChekbox ;
	
		@FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderUnderlineChekbox;
	
		@FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderEnableFontChekbox;
	
		@FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
		private static WebElement itemUnitsHeaderFrontPriveiw ;
	
		@FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
		private static WebElement itemUnitsHeaderFrontSaveBtn ;
	
		@FindBy(xpath="//*[@id='myFontControl_IF_Close']")
		private static WebElement itemUnitsHeaderFrontCloseBtn ;
	
		@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
		private static WebElement itemUnitsHeaderForMatFieldDeatailsOkBtn ;
	
		@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
		private static WebElement itemUnitsHeaderForMatFieldDeatailsCanceBtn ;
	
	
	
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
		private static WebElement itemUnitsHeaderrulesBtn ;
	
		@FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
		private static WebElement itemUnitsHeaderrulesClickHereAddRuleButtonBtn ;
	
		@FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
		private static WebElement itemUnitsHeaderrulesRuleNameDropdown ;
	
		@FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
		private static WebElement itemUnitsHeaderrulesRuleNameSetingBtn ;
	
		@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
		private static WebElement itemUnitsHeaderrulesSaveBtn ;
	
		@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
		private static WebElement itemUnitsHeaderrulesNewBtn ;
	
		@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
		private static WebElement itemUnitsHeaderrulesDeleteBtn ;
	
		@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		private static WebElement itemUnitsHeaderrulesCloseBtn ;
	
		@FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
		private static WebElement itemUnitsHeaderrulesCreatingGroupChekbox ;
	
		@FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
		private static WebElement itemUnitsHeaderrulesNewRecordChekbox;
	
		@FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
		private static WebElement itemUnitsHeaderrulesEditChekbox;
	
		@FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
		private static WebElement itemUnitsHeaderrulesLoadChekbox;
	
		@FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
		private static WebElement itemUnitsHeaderrulesBeforeSaveChekbox ;
	
		@FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
		private static WebElement itemUnitsHeaderrulesOnLeaveChekbox;
	
		@FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
		private static WebElement itemUnitsHeaderrulesBeforeDeleteChekbox ;
	
		@FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
		private static WebElement itemUnitsHeaderrulesOnEnterChekbox;
	
		@FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
		private static WebElement itemUnitsHeaderrulesActiveChekbox;
	
		@FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
		private static WebElement itemUnitsHeaderrulesNoConditionChekbox;
	
		@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
				+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
				+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
		private static WebElement itemUnitsHeaderrulesIfBtn ;
	
		@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
				+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
				+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
		private static WebElement itemUnitsHeaderrulesElseBtn ;
	
	
		// if 
		
	    @FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
		private static WebElement itemUnitsHeaderrulesIfSelectFieldDropdown ;
	   
	    @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
		private static WebElement itemUnitsHeaderrulesIfOPerationTypeDropdown ;
	   
	    @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
		private static WebElement itemUnitsHeaderrulesIfCompareTypeDropdown;          //Value,Field,Formula---Related
	   
	    @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
		private static WebElement itemUnitsHeaderrulesIfValueType;
	   
	    @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
		private static WebElement itemUnitsHeaderrulesIfConnterDropdown;          //Only,And,Or--RelatedDD

	  
		
		//IF  Formatting
		
		@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
		private static WebElement itemUnitsHeaderrulesIFFormatting ;
	   
	    @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridFieldName ;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridChangeValue ;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridField ;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridValue ;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridCaption ;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridRegularExpression ;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridErrorMesage ;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridBannerText ;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridToolTip;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridMandatoryChekbox;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridHiddenChekbox;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridDisableChekbox;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridSpellCheckChekbox;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridAligementDropdown;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridCharacterCasting;
	   
	    @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
		private static WebElement itemUnitsHeaderrulesIFFormattingGridSelectFont;
	   
	    @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
		private static WebElement itemUnitsHeaderrulesIFMessage ;
	   
	    @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
		private static WebElement itemUnitsHeaderrulesIFMessagesInformationRadioBtn;
	   
	    @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
		private static WebElement itemUnitsHeaderrulesIFMessagesGeneralInformation;
	   
	    @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
		private static WebElement itemUnitsHeaderrulesIFMessagesWarnAndProceddRadioBtn;
	   
	    @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
		private static WebElement itemUnitsHeaderrulesIFMessagesWarnAndStopRadioBtn;
	   
	    @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
		private static WebElement itemUnitsHeaderrulesIFAlertMessage;
	   
	    @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
	    private static WebElement itemUnitsHeaderrulesIFCustmizeTemplateDropdown;

	   // IF Alerts Grid Elements
	   
	   @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
	   private static WebElement itemUnitsHeaderrulesIFAlert ;

	   @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesIfAlertMessage;

	   @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesIfCustmizeTemplateDropdown;
	   
	   @FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesIFAlertsGridTypeDropdown;
	   
	   @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
	   private static WebElement itemUnitsHeaderrulesIFAlertsGridToWhomDropdown;
	   
	   @FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesIFAlertsGridSmsDropdown;
	   
	   @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
	   private static WebElement itemUnitsHeaderrulesIFAlertsGridEmail;
	   
	   @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesIFAlertsGridDashBoardDropdown;
	   
	   @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
	   private static WebElement itemUnitsHeaderrulesIFAlertsGridPopDropdown;
	   
	   @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesIFAlertsGridGTalkDropdown;
	   
	   @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
	   private static WebElement itemUnitsHeaderrulesIFAlertsGridSendSpecficMessageDropdown;
	   
	   @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesIFAlertsGridSpecificMessage;
	  
	   //Grid Elements Formatting Else Module
	   
	   @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
	   private static WebElement itemUnitsHeaderrulesElseFormatting ;
	   
	   @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridFieldName ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridChangeValue ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridField ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridValue ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridCaption ;

	   @FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridRegularExpression ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridErrorMesage ;

	   @FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridBannerText ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridToolTip;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridMandatoryChekbox;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridHiddenChekbox;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridDisableChekbox;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridSpellCheckChekbox;

	   @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridAligementDropdown;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridCharacterCasting;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
	   private static WebElement itemUnitsHeaderrulesElseFormattingGridSelectFont;


        // else message
	   
	    @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
	  	private static WebElement itemUnitsHeaderrulesElsetMessage ;

	    @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
		private static WebElement itemUnitsHeaderrulesElseMessagesInformationRadioBtn;

	    @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
		private static WebElement itemUnitsHeaderrulesElseMessagesGeneralMessage;

	    @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
		private static WebElement itemUnitsHeaderrulesElseMessagesWarnAndProceddRadioBtn;

	    @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
		private static WebElement itemUnitsHeaderrulesElseMessagesWarnAndStopRadioBtn;

	   
	   
	    //Else Alert Grid Elements
	   
	   
	    @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
	  	private static WebElement itemUnitsHeaderrulesElseAlert ;

	   
	    @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
		private static WebElement itemUnitsHeaderrulesElseAlertMessage;

	    @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
		private static WebElement itemUnitsHeaderrulesElseCustmizeTemplateDropdown;



	    @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
		private static WebElement itemUnitsHeaderrulesElseAlertsGridTypeDropdown;

	    @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
		private static WebElement itemUnitsHeaderrulesElseAlertsGridToWhomDropdown;

	    @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
		private static WebElement itemUnitsHeaderrulesElseAlertsGridSmsDropdown;

	    @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
		private static WebElement itemUnitsHeaderrulesElseAlertsGridEmail;

	    @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
		private static WebElement itemUnitsHeaderrulesElseAlertsGridDashBoardDropdown;

	    @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
		private static WebElement itemUnitsHeaderrulesElseAlertsGridPopDropdown;

	    @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
		private static WebElement itemUnitsHeaderrulesElseAlertsGridGTalkDropdown;

	    @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
		private static WebElement itemUnitsHeaderrulesElseAlertsGridSendSpecficMessageDropdown;

	    @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
		private static WebElement itemUnitsHeaderrulesElseAlertsGridSpecificMessage;
	   
	   
	   // Header
	   
	    @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
		private static WebElement itemUnitsHeaderrulesElseAlertsSaveBtn;

	    @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
		private static WebElement itemUnitsHeaderrulesElseAlertsNewBtn;

	    @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
		private static WebElement itemUnitsHeaderrulesElseAlertsDeleteBtn;

	    @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		private static WebElement itemUnitsHeaderrulesElseAlertsCloseBtn;


	    // General Main *** External modules

		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
		private static WebElement itemUnitsHeaderExternalModules;			     
			     
			@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
			private static WebElement itemUnitsHeaderExternalModulesOnEventDropdown;	
			
			@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
			private static WebElement itemUnitsHeaderExternalModulesButtonCaption;
			
			@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
			private static WebElement itemUnitsHeaderExternalModules_ModuleTypeBtn;
			
			@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
			private static WebElement itemUnitsHeaderExternalModules_ModuleNameDropdown;
			
			@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
			private static WebElement itemUnitsHeaderExternalModulesClassNameDropdown;
			
			@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
			private static WebElement itemUnitsHeaderExternalModulesFuctionalNameDropdown;
			
			@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
			private static WebElement itemUnitsHeaderExternalModulesAvabileInDropdown;
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
			private static WebElement itemUnitsHeaderExternalModulesUpdateBtn;
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
			private static WebElement itemUnitsHeaderExternalModulesSaveBtn;
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
			private static WebElement itemUnitsHeaderExternalModulesEditBtn;
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
			private static WebElement itemUnitsHeaderExternalModulesDeleteBtn;
			
			@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
			private static WebElement itemUnitsHeaderExternalModulesCloseBtn;

		//Item CustomizeMaster Units Body Details Elements
	
		@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[1]/span")
		private static WebElement masterFieldUnitBodyDetailsSaveBtn;
	
		@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
		private static WebElement masterFieldUnitBodyDetailsAddBtn;
	
		@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
		private static WebElement masterFieldUnitBodyDetailsPreviewBtn;
	
		@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		private static WebElement MasterFieldUnitBodyDetailsCloseBtn;

							     
							     
	 //Item CustomizeMaster Settings			     
							     
	 @FindBy(xpath="//*[@id='masterFields_list']/li[3]/span")
	 private static WebElement masterFieldItemSettingsBtn;						     
							     
	   //Settings  Header details	     
							    	     
		@FindBy(xpath="//*[@id='tabId_72']/ul/li[1]/a/span")
		private static WebElement itemitemSettingsHeaderDetailsBtn;	
		
		@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
		private static WebElement itemitemSettingsHeaderDetailsSaveBtn;	
		
		@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/div[2]")
		private static WebElement itemitemSettingsHeaderDetailsMoveFieldBtn;	
		
		@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
		private static WebElement itemsettingsHeaderDetailAddBtn;	
		
		@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
		private static WebElement itemsettingsHeaderDetailPreviewBtn;	
		
		@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		private static WebElement itemsettingsHeaderDetailCloseBtn;	
		
							
							
							
							
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[1]/td[1]/i[1]")
		private static WebElement itemitemSettingFirstEditBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[2]/td[1]/i[1]")
		private static WebElement itemSettingSecondEditBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[3]/td[1]/i[1]")
		private static WebElement itemSettingThirdEditBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[4]/td[1]/i[1]")
		private static WebElement itemSettingFourthEditBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[5]/td[1]/i[1]")
		private static WebElement itemSettingFifthEditBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[6]/td[1]/i[1]")
		private static WebElement itemSettingSixthEditBtn;	
		     
							
							
							
							
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[1]/td[1]/i[2]")
		private static WebElement itemSettingFirstDeleteBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[2]/td[1]/i[2]")
		private static WebElement itemSettingSecondDeleteBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[3]/td[1]/i[2]")
		private static WebElement itemSettingThirdDeleteBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[4]/td[1]/i[2]")
		private static WebElement itemSettingFourthDeleteEditBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[5]/td[1]/i[2]")
		private static WebElement itemSettingFifthDeleteBtn;	
		
		@FindBy(xpath="//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[6]/td[1]/i[2]")
		private static WebElement itemSettingSixthDeleteBtn;	
			
							
							
							
	    @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[1]/a/span")
		private static WebElement itemSettingsHeaderDetails_FieldDetailsBtn;  
		
		@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
	    private static WebElement itemSettingsHeaderDetailsFieldDetails_Caption;
		
		@FindBy(xpath="//*[@id='ExtraField_FieldName']")
		private static WebElement itemSettingsHeaderDetailsFieldDetails_Name; 
		
		
	    @FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
	    private static WebElement itemSettingsHeaderDetailsFieldDetails_DatTypeDropdown;  
		
		@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
		private static WebElement itemSettingsHeaderDetailsFieldDetails_DefaultValue;  
		     
	    @FindBy(xpath="//*[@id='ExtraField_BannerText']")
	    private static WebElement itemSettingsHeaderDetailsFieldDetails_BannerText;  
		     
	    @FindBy(xpath="//*[@id='ExtraField_MaxSize']")
	    private static WebElement itemSettingsHeaderDetailsFieldDetails_MaxSize;  
		     
		 @FindBy(xpath="//*[@id='ExtraField_ControlType']")
		 private static WebElement itemSettingsHeaderDetailsFieldDetails_ControlTypeDropdown;  
		     
		 @FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
		 private static WebElement itemSettingsHeaderDetailsEditFieldDetails_ToolTipText;  
		     
		 @FindBy(xpath="//*[@id='ExtraField_RegularExpression']")
		 private static WebElement itemSettingsHeaderDetailsEditFieldDetails_RegularExpressionText;  
		 
		 @FindBy(xpath=" //*[@id='btnLoad_RExp']")
	     private static WebElement itemSettingsHeaderDetailsRegularExperssionLoad_ExpansionBtn;
		
							
							
	     @FindBy(xpath="//*[@id='txtRExpression_RExp']")
	     private static WebElement itemSettingsHeaderDetailsregExper_RegularExpression; 
	     
	     @FindBy(xpath="//*[@id='btnTestRExp']")
	     private static WebElement itemSettingsHeaderDetailsregrExper_TestBtn;
	     
	     @FindBy(xpath="//*[@id='txtTestExpression_RExp']")
	     private static WebElement itemSettingsHeaderDetailsregExper_TestString;
	     
	     @FindBy(xpath="//*[@id='txtNameExpression_RExp']")
	     private static WebElement itemSettingsHeaderDetailsregExper_Name;
	     
	     @FindBy(xpath="//*[@id='txtDescriptionExpression_RExp']")
	     private static WebElement itemSettingsHeaderDetailsregExper_Description;
	     
	     @FindBy(xpath="//*[@id='btnClearREFields']")
	     private static WebElement itemSettingsHeaderDetailsregExper_ClearBtn;
	     
	     @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[3]/button[1]")
	     private static WebElement itemSettingsHeaderDetailsregExper_OkBtn;
     
	     @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[3]/button[2]")
	     private static WebElement itemSettingsHeaderDetailsregExper_CancelBtn;
	     
	     @FindBy(xpath="//*[@id='txtGroupsAndOptions']")
	     private static WebElement itemSettingsHeaderDetailsregExper_SearchTextBox;
	     
	   @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[1]/a")
	   private static WebElement itemSettingsHeaderDetailsregExperCharactersAndRepetitionsBtn;
	    
		     @FindBy(xpath="//*[@id='chkMatchIfAbsent_Regex']")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_MatchOnlyIfAbsentChekbox;
		     
		     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[2]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_AnyCharcterRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[3]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_AlphanumericRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[4]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_DigitRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[5]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_WhiteSpaceRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[6]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_SpecificCharcterRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[7]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_NamedClassRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[9]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_SpecifiedSetRadioBtn;
		     
		     @FindBy(xpath="//*[@id='chkRepetition_RegEx']")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_AsFewAsPossibleChekbox;
		     
		     @FindBy(xpath="//*[@id='expRepetitions']/div[2]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_JustOnceRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expRepetitions']/div[3]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_AnyNumberRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expRepetitions']/div[4]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_ONeOrMoreRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expRepetitions']/div[4]/div/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_ZeroOrOneRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expRepetitions_Extra']/div[1]/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_ExactlyRadioBtn;
		     
		     @FindBy(xpath="//*[@id='expRepetitions_Extra']/div[3]/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_AtleastnRadioBtn;
		     
		     @FindBy(xpath="//*[@id=expRepetitions_Extra']/div[5]/label/input")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_BetweenmAndmRadioBtn;
	     
		     @FindBy(xpath=" //*[@id='CharsAndRepetitions_RExp']/div[1]/div/button")
		     private static WebElement itemSettingsHeaderDetailsCharactersAndRepetitions_InsertBtn;
					 					     
					 					     
      @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[2]/a")
      private static WebElement itemSettingsHeaderDetailsregExperGroupsAndOptionsBtn;
				 				     
           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[1]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_NumberCaptureRadioBtn;
           
           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[2]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_NonCapturingGroupRadioBtn;
           
           @FindBy(xpath="//*[@id='chkMatchGroupName1']")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_Name1RadioBtn;
           
           @FindBy(xpath="//*[@id='txtMatchGroupName1']")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_Name1;
           
           @FindBy(xpath="//*[@id='txtMatchGroupName2']")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_Name2;
           
           @FindBy(xpath="//*[@id='chkMatchGroupName2']")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_Name2RadioBtn;
           
           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[5]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_MatchSufficButExcludeItRadioBtn;
           
           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[6]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_LessThanRadioBtn;
           
           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[7]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_LessThanEqualRadioBtn;
           
           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[8]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_MatchIfPrefixIsNotPresentRadioBtn;
           
           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[9]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_GreddySubExpressionRadioBtn;
           
           @FindBy(xpath="//*[@id='chkMatchGroupComment']")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_CommentRadioBtn;
           
           @FindBy(xpath="//*[@id='txtMatchGroupComment']")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_Comment;
           
           @FindBy(xpath="//*[@id='chkNonCapturingGroup']")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_NonCapturingGroupChekbox;
           
           @FindBy(xpath="//*[@id='chkEnclosingGroup']")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_EnclosingGroupChekbox;
           
           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[1]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_IgnoreCaseiChekbox;
           
           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[2]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_MultilinemChekbox;
           
           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[3]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_SingleLineChekbox;
           
           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[4]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_ExplictCaptureChekbox;
           
           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[5]/div/label/input")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_IgnorepatternwhitespaceChekbox;
           
           @FindBy(xpath="//*[@id='GroupsAndOptions_RExp']/div[1]/div/button")
           private static WebElement itemSettingsHeaderDetailsgroupAndOption_InsertBtn;
					 	            	          
         @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[3]/a")
         private static WebElement itemSettingsHeaderDetailsregExperSpecialCharacters;               

		   @FindBy(xpath=" //*[@id='SpecialCharacters_RExp']/div[1]/div/button")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_InsertBtn;
		   
		   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[1]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_BellRadioBtn;
	       
		   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[2]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_BackSpaceRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[3]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_TabRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[4]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_CarriageReturnRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[5]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_VerticalTabRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[5]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_FormFeedRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[7]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_NewLineRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[8]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_EscapeRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[1]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_BenningStringOrLineRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[2]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_EndOfStringOrLineRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[3]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_AlterNationRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[1]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_BenningOfString;
		   
		   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[2]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_EndOfStringOrBeforNewLineAtEnd;
		   
		   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[3]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_EndOfStringRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[4]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_BenningOfCurrentSearchRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[5]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_FirstOrLastCharcterInWordRadioBtn;
		   
		   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[6]/div/label/input")
		   private static WebElement itemSettingsHeaderDetailsSpecialCharacters_NotFirstOrLastCharcterInWordRadioBtn;
   			 					     
      @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[4]/a")
      private static WebElement itemSettingsHeaderDetailsregExperExistingRegexBtn;
				     
	  @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[5]/a")
	  private static WebElement itemSettingsHeaderDetailsregExperHelp;
					 				  
		  @FindBy(xpath="//*[@id='Help_SyntaxElements']")
		  private static WebElement itemSettingsHeaderDetailsHelp_SyntaxElementsRadioBtn;
		  
		  @FindBy(xpath="//*[@id='Help_Characters']")
		  private static WebElement itemSettingsHeaderDetailsHelp_CharactersRadioBtn;
		  
		  @FindBy(xpath="//*[@id='Help_Quantifier']")
		  private static WebElement itemSettingsHeaderDetailsHelp_QuantifierRadioBtn;
		  
		  @FindBy(xpath="//*[@id='Help_Anchors']")
		  private static WebElement itemSettingsHeaderDetailsHelp_AnchorsRadioBtn;
		  
		  @FindBy(xpath="//*[@id='Help_CharacterClass']")
		  private static WebElement itemSettingsHeaderDetailsHelp_CharacterClassRadioBtn;
		  
		  @FindBy(xpath="//*[@id='Help_ExtendedGroups']")
		  private static WebElement itemSettingsHeaderDetailsHelp_ExtendedGroupsRadioBtn;
		  
		  @FindBy(xpath="//*[@id='Help_BackReference']")
		  private static WebElement itemSettingsHeaderDetailsHelp_BackReferenceRadioBtn;
		  
		  @FindBy(xpath="//*[@id='Help_SubexpCall']")
		  private static WebElement itemSettingsHeaderDetailsHelp_SubexpCallRadioBtn;
		  
		  @FindBy(xpath="//*[@id='Help_CapturedGroup']")
		  private static WebElement itemSettingsHeaderDetailsHelp_CapturedGroupRadioBtn;
			     
      @FindBy(xpath="//*[@id='ExtraField_ErrorMessage']")
      private static WebElement itemSettingsHeaderDetailsEditFieldDetailsErrorMessageTextBox; 
      				     
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
		private static WebElement itemSettingsHeaderDetailsPropertiesBtn;		     
					     
			@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
			private static WebElement itemSettingsHeaderDetailsProperties_PartOfDeliveryAddressChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
			private static WebElement itemSettingsHeaderDetailsProperties_PartOfBillingAddressChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
			private static WebElement itemSettingsHeaderDetailsProperties_MandatoryChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
			private static WebElement itemSettingsHeaderDetailsProperties_AllowAsParameterChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
			private static WebElement itemSettingsHeaderDetailsProperties_HiddenChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
			private static WebElement itemSettingsHeaderDetailsProperties_HiddenInGroupChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
			private static WebElement itemSettingsHeaderDetailsProperties_SpellCheckChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
			private static WebElement itemSettingsHeaderDetailsProperties_MandatoryInGroupChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
			private static WebElement itemSettingsHeaderDetailsProperties_AuditTrialChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
			private static WebElement itemSettingsHeaderDetailsProperties_NotAvailableForReportsChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
			private static WebElement itemSettingsHeaderDetailsProperties_MergeFieldChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
			private static WebElement itemSettingsHeaderDetailsProperties_MassUpdateChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
			private static WebElement itemSettingsHeaderDetailsProperties_IncludeInQuickCreateChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
			private static WebElement itemSettingsHeaderDetailsProperties_CannotBeExportedChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
			private static WebElement itemSettingsHeaderDetailsProperties_CannotBeImportedChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
			private static WebElement itemSettingsHeaderDetailsProperties_CopyFromParentChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
			private static WebElement itemSettingsHeaderDetailsProperties_ReadOnlyChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
			private static WebElement itemSettingsHeaderDetailsProperties_InformationFieldChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
			private static WebElement itemSettingsHeaderDetailsProperties_IsMandatoryInRevisionChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
			private static WebElement itemSettingsHeaderDetailsProperties_AvailableinCustomerPortalChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
			private static WebElement itemSettingsHeaderDetailsProperties_EditableinCustomerPortalChekbox;
			
			@FindBy(xpath="//*[@id='Behaviour']")
			private static WebElement itemSettingsHeaderDetailsProperties_BehaviourDropdown;
								
        @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
		private static WebElement  itemSettingsHeaderDetailsFormattingBtn ;
			        
	        @FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
			private static WebElement itemSettingsHeaderDetailsFormattingColumnSpan ;
	        
	        @FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
			private static WebElement itemSettingsHeaderDetailsFormattingRowSpan ;
	        
	        @FindBy(xpath="//*[@id='CharacterCasing']")
			private static WebElement itemSettingsHeaderDetailsFormattingCharacterCasingDropdown ;
	        
	        @FindBy(xpath="//*[@id='TextAlign']")
			private static WebElement itemSettingsHeaderDetailsFormattingTextAlignDropdown ;
	        
	        @FindBy(xpath="//*[@id='FieldsDetails_Font']")
			private static WebElement itemSettingsHeaderDetailsFormattingFieldsDetailsFont ;
	        
	        @FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
	        private static WebElement itemSettingsHeaderDetailsFormattingBackColor ;
	        
	        @FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
			private static WebElement itemSettingsHeaderDetailsFormattingFieldsDetailsFont_Btn ;
					        
            //Elements are used for font edit option pop in field details and rules 

	        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsFontAreialDropdown ;
	        
	        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsFontStyleDropdown ;
	        
	        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsFontWeightDropdown ;

	        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsFontSizeDropdown ;
	        
	        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsForeColourDropdown ;
	        
	        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsBackColorDropdown ;
	        
	        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsBaselineChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsOverLineChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsStrikeThroughChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsUnderlineChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsEnableFontChekbox ;
	        
	        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
			private static WebElement itemSettingsHeaderDetailsFrontPriveiw ;
	        
	        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
			private static WebElement itemSettingsHeaderDetailsFrontSaveBtn ;
	        
	        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
			private static WebElement itemSettingsHeaderDetailsFrontCloseBtn ;
	        
	    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
	    private static WebElement itemSettingsHeaderDetailsForMatFieldDeatailsOkBtn ;
	        
	    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
	    private static WebElement itemSettingsHeaderDetailsForMatFieldDeatailsCanceBtn ;								        
									       
    @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
	private static WebElement itemSettingsHeaderDetailsrulesBtn ;
					        
        @FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
		private static WebElement itemSettingsHeaderDetailsrulesClickHereAddRuleButtonBtn ;
        
	        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesRuleNameDropdown ;
	        
	        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
			private static WebElement itemSettingsHeaderDetailsrulesRuleNameSetingBtn ;
	        
	        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
			private static WebElement itemSettingsHeaderDetailsrulesSaveBtn ;
	        
	        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
			private static WebElement itemSettingsHeaderDetailsrulesNewBtn ;
	        
	        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
			private static WebElement itemSettingsHeaderDetailsrulesDeleteBtn ;
	        
	        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
			private static WebElement itemSettingsHeaderDetailsrulesCloseBtn ;
	        
	        @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesCreatingGroupChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesNewRecordChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesEditChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesLoadChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesBeforeSaveChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesOnLeaveChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesBeforeDeleteChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesOnEnterChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesActiveChekbox ;
	        
	        @FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
			private static WebElement itemSettingsHeaderDetailsrulesNoConditionChekbox;
	        
	        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
	        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
	        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
			private static WebElement itemSettingsHeaderDetailsrulesIfBtn ;
	        
	        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
	        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
	        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
			private static WebElement itemSettingsHeaderDetailsrulesElseBtn ;
	        
	        
									        
									        
	        // if 
	    	
	        @FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIfSelectFieldDropdown ;
	        
	        @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIfOPerationTypeDropdown ;
	        
	        @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIfCompareTypeDropdown;          //Value,Field,Formula---Related
	        
	        @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIfValueType;
	        
	        @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIfConnterDropdown;          //Only,And,Or--RelatedDD
									       
									    	
	    	//IF **** Formatting
	    	
	    	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormatting ;
	        
	        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridFieldName ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridChangeValue ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridField ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridValue ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridCaption ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridRegularExpression ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridErrorMesage ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridBannerText ;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridToolTip;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridMandatoryChekbox;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridHiddenChekbox;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridDisableChekbox;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridSpellCheckChekbox;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridAligementDropdown;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridCharacterCasting;
	        
	        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
	    	private static WebElement itemSettingsHeaderDetailsrulesIFFormattingGridSelectFont;
	        							      
									        
		        @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
		    	private static WebElement itemSettingsHeaderDetailsrulesIFMessage ;						        
		        
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
		    	private static WebElement itemSettingsHeaderDetailsrulesIFMessagesInformationRadioBtn;
		        
		        @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
		    	private static WebElement itemSettingsHeaderDetailsrulesIFMessagesGeneralInformation;
		        
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
		    	private static WebElement itemSettingsHeaderDetailsrulesIFMessagesWarnAndProceddRadioBtn;
		        
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
		    	private static WebElement itemSettingsHeaderDetailsrulesIFMessagesWarnAndStopRadioBtn;
		        
		        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
		    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertMessage;
		        
		        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
		    	private static WebElement itemSettingsHeaderDetailsrulesIFCustmizeTemplateDropdown;

		        ///// IF ****Alerts-----Grid Elements
		        
		        @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
		    	private static WebElement itemSettingsHeaderDetailsrulesIFAlert ;
		        

		        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
		    	private static WebElement itemSettingsHeaderDetailsrulesIfAlertMessage;
		     
		        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
		    	private static WebElement itemSettingsHeaderDetailsrulesIfCustmizeTemplateDropdown;
		        				        
			        @FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertsGridTypeDropdown;
			        
			        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
			    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertsGridToWhomDropdown;
			        
			        @FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertsGridSmsDropdown;
			        
			        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
			    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertsGridEmail;
			        
			        @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertsGridDashBoardDropdown;
			        
			        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
			    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertsGridPopDropdown;
			        
			        @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertsGridGTalkDropdown;
			        
			        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
			    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertsGridSendSpecficMessageDropdown;
			        
			        @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesIFAlertsGridSpecificMessage;
			        
			        // alert over
			        
			        //Grid Elements------Formatting------Else Module
			        
			        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
			       	private static WebElement itemSettingsHeaderDetailsrulesElseFormatting ;
			        
			        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridFieldName ;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridChangeValue ;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridField ;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridValue ;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridCaption ;
			     
			        @FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridRegularExpression ;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridErrorMesage ;
			     
			        @FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridBannerText ;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridToolTip;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridMandatoryChekbox;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridHiddenChekbox;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridDisableChekbox;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridSpellCheckChekbox;
			     
			        @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridAligementDropdown;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridCharacterCasting;
			     
			        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseFormattingGridSelectFont;
			     

			        // else message
			     
			        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
			       	private static WebElement itemSettingsHeaderDetailsrulesElsetMessage ;
			     
			        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseMessagesInformationRadioBtn;
			     
			        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseMessagesGeneralMessage;
			     
			        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseMessagesWarnAndProceddRadioBtn;
			     
			        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseMessagesWarnAndStopRadioBtn;
			     
			        					        
			        // Else Alerts Grid Elements
			        
			        
			        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
			       	private static WebElement itemSettingsHeaderDetailsrulesElseAlert ;
			     	        
			        @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertMessage;
			     
			        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseCustmizeTemplateDropdown;
     
			        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsGridTypeDropdown;
			     
			        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsGridToWhomDropdown;
			     
			        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsGridSmsDropdown;
			     
			        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsGridEmail;
			     
			        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
			     	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsGridDashBoardDropdown;
			     
			        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsGridPopDropdown;
			     
			        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsGridGTalkDropdown;
			     
			        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsGridSendSpecficMessageDropdown;
			     
			        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsGridSpecificMessage;
			        
		
			        // Header
			     
			        
			        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsSaveBtn;
			     
			        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsNewBtn;
			     
			        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsDeleteBtn;
			     
			        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
			    	private static WebElement itemSettingsHeaderDetailsrulesElseAlertsCloseBtn;
									     
									     
				    //  *** External modules
				     
				    @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
				    private static WebElement itemSettingsHeaderDetailsExternalModules;			     
				     
				    @FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesOnEventDropdown;	

				    @FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesButtonCaption;

				    @FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
				    private static WebElement itemSettingsHeaderDetailsExternalModules_ModuleTypeBtn;

				    @FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
				    private static WebElement itemSettingsHeaderDetailsExternalModules_ModuleNameDropdown;

				    @FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesClassNameDropdown;

				    @FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesFuctionalNameDropdown;

				    @FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesAvabileInDropdown;
			
				    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[1]")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesUpdateBtn;
				  
				    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[1]")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesSaveBtn;
				
				    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[1]")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesEditBtn;
				 
				    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[1]")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesDeleteBtn;
				  		
				    @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[1]")
				    private static WebElement itemSettingsHeaderDetailsExternalModulesCloseBtn;

									    
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[1]/span")
		private static WebElement itemSettingsHeaderDetailsCloseBtn;	
											
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
		private static WebElement itemSettingsHeaderDetailsCanceleBtn;			 
								 
							 
	    //Item------Customize Master---MasterField ----Setting-----BodyDetails						 
							 
		@FindBy(xpath="//*[@id='tabId_72']/ul/li[2]/a/span")
		private static WebElement masterFieldItemSettingsBodyDetailsSaveBtn;
	
	
		@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
		private static WebElement masterFieldItemSettingsBodyDetailsAddBtn;
	
		@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
		private static WebElement masterFieldSettingsBodyDetailsPreviewBtn;
	
	
		@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		private static WebElement MasterFieldItemSettingsBodyDetailsCloseBtn;						 
							 

		//Item------Customize View---MasterField-----Classification-----	******************************					 
								 
		/////Header details screen related elements
		 
		@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
		private static WebElement masterFielditemClassificationBodySaveBtn;
				     
		@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/div[2]")
		private static WebElement masterFielditemClassificationBodyMoveFiledBtn;
				     
		@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
		private static WebElement masterFielditemClassificationBodyAddBtn;
				     
		@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
		private static WebElement masterFielditemClassificationBodyPreview;
				     
		@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		private static WebElement masterFielditemClassificationBodyCloseBtn;

		//Grid Elements						 
								 
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[1]/td[1]/i[1]")
		private static WebElement masterFielditemClassificationBodyFirstRowEditBtn;
			   
			     
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[2]/td[1]/i[1]")
		private static WebElement masterFielditemClassificationBodySecondRowEditBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[3]/td[1]/i[1]")
		private static WebElement masterFielditemClassificationBodyThirdRowEditBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[4]/td[1]/i[1]")
		private static WebElement masterFielditemClassificationBodyFourthRowEditBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[5]/td[1]/i[1]")
		private static WebElement masterFielditemClassificationBodyFifthRowEditBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[6]/td[1]/i[1]")
		private static WebElement masterFielditemClassificationBodySixthRowEditBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[7]/td[1]/i[1]")
		private static WebElement masterFielditemClassificationBodySeventhRowEditBtn;
	
		///Row Delete Elements------->>>>>>>---HeaderDetails----Classification
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[1]/td[1]/i[2]")
		private static WebElement masterFielditemClassificationBodyFirstRowDeleteBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[2]/td[1]/i[2]")
		private static WebElement masterFielditemClassificationBodySecondRowDeleteBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[3]/td[1]/i[2]")
		private static WebElement masterFielditemClassificationBodyThirdRowDeleteBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[4]/td[1]/i[2]")
		private static WebElement masterFielditemClassificationBodyFourthRowDeleteBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[5]/td[1]/i[2]")
		private static WebElement masterFielditemClassificationBodyFifthRowDeleteBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[6]/td[1]/i[2]")
		private static WebElement masterFielditemClassificationBodySixthRowDeleteBtn;
	
		@FindBy(xpath="//*[@id='HeaderDetails_3']/div/div/table/tbody/tr[7]/td[1]/i[2]")
		private static WebElement masterFielditemClassificationBodySeventhRowDeleteBtn;
					 
								 
		@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
		private static WebElement itemClassificationHeaderEditFieldDetailsCaption;   
	
		@FindBy(xpath="//*[@id='ExtraField_FieldName']")
		private static WebElement itemClassificationHeaderEditFieldDetailsName;  
	
		@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
		private static WebElement itemClassificationHeaderEditFieldDetailsDatTypeDropdown;  
	
		@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
		private static WebElement itemClassificationHeaderEditFieldDetailsDefaultValue;  
	
		@FindBy(xpath="//*[@id='ExtraField_BannerText']")
		private static WebElement itemClassificationHeaderEditFieldDetailsBannerText;  
	
		@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
		private static WebElement itemClassificationHeaderEditFieldDetailsMaxSize;  
	
		@FindBy(xpath="//*[@id='ExtraField_ControlType']")
		private static WebElement itemClassificationHeaderEditFieldDetailsControlTypeDropdown;  
	
		@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
		private static WebElement itemClassificationHeaderEditFieldDetailsToolTipText;
	
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
		private static WebElement itemClassificationHeaderPropertiesBtn;		     
		     
			@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
			private static WebElement itemClassificationHeaderProperties_PartOfDeliveryAddressCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
			private static WebElement itemClassificationHeaderProperties_PartOfBillingAddresCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
			private static WebElement itemClassificationHeaderProperties_MandatoryCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
			private static WebElement itemClassificationHeaderProperties_AllowAsParameterCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
			private static WebElement itemClassificationHeaderProperties_HiddenCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
			private static WebElement itemClassificationHeaderProperties_HiddenInGroupCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
			private static WebElement itemClassificationHeaderProperties_SpellCheckCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
			private static WebElement itemClassificationHeaderProperties_MandatoryInGroupCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
			private static WebElement itemClassificationHeaderProperties_AuditTrialCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
			private static WebElement itemClassificationHeaderProperties_NotAvailableForReportCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
			private static WebElement itemClassificationHeaderProperties_MergeFieldCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
			private static WebElement itemClassificationHeaderProperties_MassUpdateCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
			private static WebElement itemClassificationHeaderProperties_IncludeInQuickCreateCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
			private static WebElement itemClassificationHeaderProperties_CannotBeExportedCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
			private static WebElement itemClassificationHeaderProperties_CannotBeImportedCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
			private static WebElement itemClassificationHeaderProperties_CopyFromParentCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
			private static WebElement itemClassificationHeaderProperties_ReadOnlyCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
			private static WebElement itemClassificationHeaderProperties_InformationFieldCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
			private static WebElement itemClassificationHeaderProperties_IsMandatoryInRevisionCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
			private static WebElement itemClassificationHeaderProperties_AvailableinCustomerPortalCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
			private static WebElement itemClassificationHeaderProperties_EditableinCustomerPortalCheckbox;
			
			@FindBy(xpath="//*[@id='Behaviour']")
			private static WebElement itemClassificationHeaderProperties_BehaviourDropdown;

		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
		private static WebElement  itemClassificationHeaderFormattingBtn ;
		
		@FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
		private static WebElement itemClassificationHeaderFormattingColumnSpan ;
		
		@FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
		private static WebElement itemClassificationHeaderFormattingRowSpan ;
		
		@FindBy(xpath="//*[@id='CharacterCasing']")
		private static WebElement itemClassificationHeaderFormattingCharacterCasingDropdown ;
		
		@FindBy(xpath="//*[@id='TextAlign']")
		private static WebElement itemClassificationHeaderFormattingTextAlignDropdown;
		
		@FindBy(xpath="//*[@id='FieldsDetails_Font']")
		private static WebElement ItemClassificationHeaderFormattingFieldsDetailsFont ;
		
		@FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
		private static WebElement itemClassificationHeaderFormattingBackColor ;
		
		@FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
		private static WebElement itemClassificationHeaderFormattingFieldsDetailsFont_Btn ;

	    //Elements are used for font edit option pop in field details and rules 

	        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderFontAreialDropdown ;
	        
	        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderFontStyleDropdown;
	        
	        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderFontWeightDropdown;

	        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderFontSizeDropdown;
	        
	        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderForeColourDropdown ;
	        
	        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderBackColorDropdown ;
	        
	        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderBaselineCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderOverLineCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderStrikeThroughCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderUnderlineCheckbox;
	        
	        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderEnableFontCheckbox;
	        
	        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
			private static WebElement itemClassificationHeaderFrontPriveiw ;
	        
	        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
			private static WebElement itemClassificationHeaderFrontSaveBtn ;
	        
	        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
			private static WebElement itemClassificationHeaderFrontCloseBtn ;
	        
	    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
	    private static WebElement itemClassificationHeaderForMatFieldDeatailsOkBtn ;
	        
	    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
	    private static WebElement itemClassificationHeaderForMatFieldDeatailsCanceBtn ;
					  
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
		private static WebElement itemClassificationHeaderRulesBtn ;

	        @FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
			private static WebElement itemClassificationHeaderRulesClickHereAddRuleButtonBtn ;
	      
		        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
				private static WebElement itemClassificationHeaderRulesRuleNameDropdown;
		        
		        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
				private static WebElement itemClassificationHeaderRulesRuleNameSetingBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
				private static WebElement itemClassificationHeaderRulesSaveBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
				private static WebElement itemClassificationHeaderRulesNewBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
				private static WebElement itemClassificationHeaderRulesDeleteBtn ;
		        
		        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
				private static WebElement itemClassificationHeaderRulesCloseBtn ;
		        
		        @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
				private static WebElement itemClassificationHeaderRulesCreatingGroupCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
				private static WebElement itemClassificationHeaderRulesNewRecordCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
				private static WebElement itemClassificationHeaderRulesEditCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
				private static WebElement itemClassificationHeaderRulesCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
				private static WebElement itemClassificationHeaderRulesBeforeSaveCheckbox ;
		        
		        @FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
				private static WebElement itemClassificationHeaderRulesOnLeaveCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
				private static WebElement itemClassificationHeaderRulesBeforeDeleteCheckbox ;
		        
		        @FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
				private static WebElement itemClassificationHeaderRulesOnEnterCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
				private static WebElement itemClassificationHeaderRulesActiveCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
				private static WebElement itemClassificationHeaderRulesNoConditionCheckbox;
		        
		        @FindBy(xpath="/html/HeaderDetails/section/div[2]/div/section[1]/div[1]/div/div[1]"
		        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
		        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
				private static WebElement itemClassificationHeaderRulesIfBtn ;
		        
		        @FindBy(xpath="/html/HeaderDetails/section/div[2]/div/section[1]/div[1]/div/div[1]"
		        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
		        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
				private static WebElement itemClassificationHeaderRulesElseBtn ;
		        

		        // if 
		       	
		        @FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesIfSelectFieldDropdown ;
		           
		        @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesIfOPerationTypeDropdown ;
		           
		        @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesIfCompareTypeDropdown;          //Value,Field,Formula---Related
		           
		        @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesIfValueType;
		           
		        @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesIfConnterDropdown;          //Only,And,Or--RelatedDD

		          
		       	
		       	//IF **** Formatting
		       	
		       	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
		       	private static WebElement itemClassificationHeaderRulesIFFormatting ;
		           
		        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesIFFormattingGridFieldName ;
		           
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
		       	private static WebElement itemClassificationHeaderRulesIFFormattingGridChangeValue ;
		           
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
		       	private static WebElement itemClassificationHeaderRulesIFFormattingGridField ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridValue ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridCaption ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridRegularExpression ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridErrorMesage ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridBannerText ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridToolTip;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridMandatoryChekbox;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridHiddenChekbox;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridDisableChekbox;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridSpellCheckChekbox;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridAligementDropdown;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
		       	   private static WebElement itemClassificationHeaderRulesIFFormattingGridCharacterCasting;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
		           private static WebElement itemClassificationHeaderRulesIFFormattingGridSelectFont;
		           
		           
		           /// done
		         
		           
		           @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
		       	   private static WebElement itemClassificationHeaderRulesIFMessage ;
		           
		           
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
		       	   private static WebElement itemClassificationHeaderRulesIFMessagesInformationRadioBtn;
		           
		           @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
		       	   private static WebElement itemClassificationHeaderRulesIFMessagesGeneralInformation;
		           
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
		       	   private static WebElement itemClassificationHeaderRulesIFMessagesWarnAndProceddRadioBtn;
		           
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
		       	   private static WebElement itemClassificationHeaderRulesIFMessagesWarnAndStopRadioBtn;
		           
		           @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
		       	   private static WebElement itemClassificationHeaderRulesIFAlertMessage;
		           
		           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
		           private static WebElement itemClassificationHeaderRulesIFCustmizeTemplateDropdown;
		           
		           @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
		       	   private static WebElement itemClassificationHeaderRulesIFAlert ;		           

		           @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
		       	   private static WebElement itemClassificationHeaderRulesIfAlertMessage;
		        
		           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
		       	   private static WebElement itemClassificationHeaderRulesIfCustmizeTemplateDropdown;
		           
		           @FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
		       	   private static WebElement itemClassificationHeaderRulesIFAlertsGridTypeDropdown;
		           
		           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
		       	   private static WebElement itemClassificationHeaderRulesIFAlertsGridToWhomDropdown;
		           
		           @FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
		       	   private static WebElement itemClassificationHeaderRulesIFAlertsGridSmsDropdown;
		           
		           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
		       	   private static WebElement itemClassificationHeaderRulesIFAlertsGridEmail;
		           
		           @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
		       	   private static WebElement itemClassificationHeaderRulesIFAlertsGridDashBoardDropdown;
		           
		           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
		           private static WebElement itemClassificationHeaderRulesIFAlertsGridPopDropdown;
		           
		           @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
		       	   private static WebElement itemClassificationHeaderRulesIFAlertsGridGTalkDropdown;
		           
		           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
		       	   private static WebElement itemClassificationHeaderRulesIFAlertsGridSendSpecficMessageDropdown;
		           
		           @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
		       	   private static WebElement itemClassificationHeaderRulesIFAlertsGridSpecificMessage;
		           
		           // alert over
		           
		           
		           
		           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
		          	private static WebElement itemClassificationHeaderRulesElseFormatting ;
		           
		           @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridFieldName ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridChangeValue ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridField ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridValue ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridCaption ;
		        
		           @FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridRegularExpression ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridErrorMesage ;
		        
		           @FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridBannerText ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridToolTip;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridMandatoryChekbox;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridHiddenChekbox;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridDisableChekbox;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridSpellCheckChekbox;
		        
		           @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridAligementDropdown;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridCharacterCasting;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
		       	private static WebElement itemClassificationHeaderRulesElseFormattingGridSelectFont;
		        

		        // else message
		           
		           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
		          	private static WebElement itemClassificationHeaderRulesElsetMessage ;
		        
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
		       	private static WebElement itemClassificationHeaderRulesElseMessagesInformationRadioBtn;
		        
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
		       	private static WebElement itemClassificationHeaderRulesElseMessagesGeneralMessage;
		        
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
		       	private static WebElement itemClassificationHeaderRulesElseMessagesWarnAndProceddRadioBtn;
		        
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
		       	private static WebElement itemClassificationHeaderRulesElseMessagesWarnAndStopRadioBtn;
		        
		           
		           
		           
		           
		           
		           /////  Else*****Alerts-----Grid Elements
		           
		           
		           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
		          	private static WebElement itemClassificationHeaderRulesElseAlert ;
		        
		           
		           @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesElseAlertMessage;
		        
		           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
		       	private static WebElement itemClassificationHeaderRulesElseCustmizeTemplateDropdown;


		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsGridTypeDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsGridToWhomDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsGridSmsDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsGridEmail;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
		        	private static WebElement itemClassificationHeaderRulesElseAlertsGridDashBoardDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsGridPopDropdown;
		        
		          @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsGridGTalkDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsGridSendSpecficMessageDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsGridSpecificMessage;
		           
		           
		           // Alert over
		        
		           
		           // Header
		           
		           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsSaveBtn;
		        
		           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsNewBtn;
		        
		           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsDeleteBtn;
		        
		           @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		       	private static WebElement itemClassificationHeaderRulesElseAlertsCloseBtn;
		        
		        
		         // General Main *** External modules
		        
		        
		    		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
		    		private static WebElement itemClassificationHeaderExternalModules;			     
		    			     
		    						@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationHeaderExternalModulesOnEventDropdown;	
		    						
		    						@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationHeaderExternalModulesButtonCaption;
		    						
		    						@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationHeaderExternalModules_ModuleTypeBtn;
		    						
		    						@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationHeaderExternalModules_ModuleNameDropdown;
		    						
		    						@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationHeaderExternalModulesClassNameDropdown;
		    						
		    						@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationHeaderExternalModulesFuctionalNameDropdown;
		    						
		    						@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationHeaderExternalModulesAvabileInDropdown;
		    						
		    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
		    						private static WebElement itemClassificationHeaderExternalModulesUpdateBtn;
		    						
		    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
		    						private static WebElement itemClassificationHeaderExternalModulesSaveBtn;
		    						
		    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
		    						private static WebElement itemClassificationHeaderExternalModulesEditBtn;
		    						
		    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
		    						private static WebElement itemClassificationHeaderExternalModulesDeleteBtn;
		    						
		    						@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
		    						private static WebElement itemClassificationHeaderExternalModulesCloseBtn;		  

	           
								    
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[1]/span")
	private static WebElement itemClassificationHeaderCloseBtn;	
		    															
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement itemClassificationHeaderCanceleBtn;		
			    						
			    						
			    												 































	///////Item------Customize Master---MasterField ----Classification-----BodyDetails		    						

	///Edit 

	@FindBy(xpath="//*[@id='BodyDetails_3']/div/div/table/tbody/tr[1]/td[1]/i[1]")
	private static WebElement itemClassificationBodyFieldDetailsFirstEditBtn;   	
	              
	@FindBy(xpath="//*[@id='BodyDetails_3']/div/div/table/tbody/tr[2]/td[1]/i[1]")
	private static WebElement itemClassificationBodyFieldDetailsSecondEditBtn; 

	@FindBy(xpath="//*[@id='BodyDetails_3']/div/div/table/tbody/tr[3]/td[1]/i[1]")
	private static WebElement itemClassificationBodyFieldDetailsThirdEditBtn; 

	@FindBy(xpath="//*[@id='BodyDetails_3']/div/div/table/tbody/tr[4]/td[1]/i[1]")
	private static WebElement itemClassificationBodyFieldDetailsFourthEditBtn; 


	//////Delete
	            
	@FindBy(xpath="//*[@id='BodyDetails_3']/div/div/table/tbody/tr[1]/td[1]/i[2]")
	private static WebElement itemClassificationBodyFieldDetailsFirstDeleteBtn;   	
	              
	@FindBy(xpath="//*[@id='BodyDetails_3']/div/div/table/tbody/tr[2]/td[1]/i[2]")
	private static WebElement itemClassificationBodyFieldDetailsSecondDeleteBtn; 

	@FindBy(xpath="//*[@id='BodyDetails_3']/div/div/table/tbody/tr[3]/td[1]/i[3]")
	private static WebElement itemClassificationBodyFieldDetailsThirdDeleteBtn; 

	@FindBy(xpath="//*[@id='BodyDetails_3']/div/div/table/tbody/tr[4]/td[1]/i[4]")
	private static WebElement itemClassificationBodyFieldDetailsFourthDeleteBtn; 


	@FindBy(xpath="//*[@id='tabId_73']/ul/li[2]/a/span")
	private static WebElement itemClassificationBodyFieldDetailsBtn;   		    						
			    						
	@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
	private static WebElement itemClassificationBodyEditFieldDetailsCaption;   

	@FindBy(xpath="//*[@id='ExtraField_FieldName']")
	private static WebElement itemClassificationBodyEditFieldDetailsName;  

	@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
	private static WebElement itemClassificationBodyEditFieldDetailsDatTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
	private static WebElement itemClassificationBodyEditFieldDetailsDefaultValue;  

	@FindBy(xpath="//*[@id='ExtraField_BannerText']")
	private static WebElement itemClassificationBodyEditFieldDetailsBannerText;  

	@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
	private static WebElement itemClassificationBodyEditFieldDetailsMaxSize;  

	@FindBy(xpath="//*[@id='ExtraField_ControlType']")
	private static WebElement itemClassificationBodyEditFieldDetailsControlTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
	private static WebElement itemClassificationBodyEditFieldDetailsToolTipText;

	@FindBy(xpath="//*[@id='ExtraField_IncludeGroups']")
	private static WebElement itemClassificationBodyInclideGroupDropdown;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink']")
	private static WebElement itemClassificationBodyMasterToLinkDropdown;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_image']/span")
	private static WebElement itemClassificationBodyMasterToLinkExpansionBtn;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_settings']/span")
	private static WebElement itemClassificationBodyMasterToLinkSettingBtn;


	//Pop Up

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_container']")
	private static WebElement itemClassificationMasterToLink_Expansion_ScaptionText;

	   @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[1]")
	   private static WebElement itemClassificationMasterToLink_StandardFieldsBtn;

		     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_list']")
		     private static WebElement itemClassificationMasterToLink_StandardField_FieldDropdown;
		
		     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_header']")
		     private static WebElement itemClassificationMasterToLink_StandardField_HeaderText;
		
		     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_alignment']")
		     private static WebElement itemClassificationMasterToLink_StandardField_AlignmentDropdown;
		
		     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_width']")
		     private static WebElement itemClassificationMasterToLink_StandardField_WidthText;
		
		     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
		     private static WebElement itemClassificationMasterToLink_StandardField_OkBtn;
		
		     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
		     private static WebElement itemClassificationMasterToLink_StandardField_CanceBtn;

				     
	  @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[2]")
	  private static WebElement itemClassificationMasterToLink_DeleteColoumnBtn;
	 
	  @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
	  private static WebElement itemClassificationMasterToLink_OkBtn;
	 
	  @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
	  private static WebElement itemClassificationMasterToLink_CancelBtn;

	  @FindBy(xpath="//*[@id='ExtraField_MandatoryFields']")
	  private static WebElement itemClassificationBodyMandatoryFieldsText;



	//Grid Filter Criteria-----First Row

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-1']/span")
	private static WebElement itemClassificationBodyFilterDeleteFirstColoumn;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-2']")
	private static WebElement itemClassificationBodyFilterFirstOnColoumnDropdown;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-3']")
	private static WebElement itemClassificationBodyFilterFirstOperator;

	@FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_1-4;]")
	private static WebElement itemClassificationBodyFilterFirstCompareWith;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-5']")
	private static WebElement itemClassificationBodyFilterFirstFilterValueAndFiled;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-6']")
	private static WebElement itemClassificationBodyFilterFirstLinkFlied;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-7']")
	private static WebElement itemClassificationBodyFilterFirstConjuction;



	//Grid Filter Criteria-----Second Row

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-1']/span")
	private static WebElement itemClassificationBodyFilterDeleteSecondColoumn;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-2']")
	private static WebElement itemClassificationBodyFilterSecondFilterOnColoumnDropdown;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-3']")
	private static WebElement itemClassificationBodyFilterSecondOperator;

	@FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_2-4;]")
	private static WebElement itemClassificationBodyFilterSecondCompareWith;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-5']")
	private static WebElement itemClassificationBodyFilterSecondFilterValueAndFiled;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-6']")
	private static WebElement itemClassificationBodyFilterSecondLinkFlied;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-7']")
	private static WebElement itemClassificationBodyFilterSecondConjuction;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
	private static WebElement itemClassificationBodyFeildDetailsOkBtn;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement itemClassificationBodyFeildDetailsCancelBtn;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
	private static WebElement itemClassificationBodyPropertiesBtn;		     
		     
			@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
			private static WebElement itemClassificationBodyProperties_PartOfDeliveryAddressCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
			private static WebElement itemClassificationBodyProperties_PartOfBillingAddresCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
			private static WebElement itemClassificationBodyProperties_MandatoryCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
			private static WebElement itemClassificationBodyProperties_AllowAsParameterCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
			private static WebElement itemClassificationBodyProperties_HiddenCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
			private static WebElement itemClassificationBodyProperties_HiddenInGroupCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
			private static WebElement itemClassificationBodyProperties_SpellCheckCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
			private static WebElement itemClassificationBodyProperties_MandatoryInGroupCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
			private static WebElement itemClassificationBodyProperties_AuditTrialCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
			private static WebElement itemClassificationBodyProperties_NotAvailableForReportCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
			private static WebElement itemClassificationBodyProperties_MergeFieldCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
			private static WebElement itemClassificationBodyProperties_MassUpdateCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
			private static WebElement itemClassificationBodyProperties_IncludeInQuickCreateCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
			private static WebElement itemClassificationBodyProperties_CannotBeExportedCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
			private static WebElement itemClassificationBodyProperties_CannotBeImportedCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
			private static WebElement itemClassificationBodyProperties_CopyFromParentCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
			private static WebElement itemClassificationBodyProperties_ReadOnlyCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
			private static WebElement itemClassificationBodyProperties_InformationFieldCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
			private static WebElement itemClassificationBodyProperties_IsMandatoryInRevisionCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
			private static WebElement itemClassificationBodyProperties_AvailableinCustomerPortalCheckbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
			private static WebElement itemClassificationBodyProperties_EditableinCustomerPortalCheckbox;
			
			@FindBy(xpath="//*[@id='Behaviour']")
			private static WebElement itemClassificationBodyProperties_BehaviourDropdown;

		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
		private static WebElement  itemClassificationBodyFormattingBtn ;
	
		@FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
		private static WebElement itemClassificationBodyFormattingColumnSpan ;
	
		@FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
		private static WebElement itemClassificationBodyFormattingRowSpan ;
	
		@FindBy(xpath="//*[@id='CharacterCasing']")
		private static WebElement itemClassificationBodyFormattingCharacterCasingDropdown ;
	
		@FindBy(xpath="//*[@id='TextAlign']")
		private static WebElement itemClassificationBodyFormattingTextAlignDropdown;
	
		@FindBy(xpath="//*[@id='FieldsDetails_Font']")
		private static WebElement ItemClassificationBodyFormattingFieldsDetailsFont ;
	
		@FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
		private static WebElement itemClassificationBodyFormattingBackColor ;
	
		@FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
		private static WebElement itemClassificationBodyFormattingFieldsDetailsFont_Btn ;
	
		//Elements are used for font edit option pop in field details and rules 

		        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyFontAreialDropdown ;
		        
		        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyFontStyleDropdown;
		        
		        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyFontWeightDropdown;

		        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyFontSizeDropdown;
		        
		        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyForeColourDropdown ;
		        
		        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyBackColorDropdown ;
		        
		        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyBaselineCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyOverLineCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyStrikeThroughCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyUnderlineCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyEnableFontCheckbox;
		        
		        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
				private static WebElement itemClassificationBodyFrontPriveiw ;
		        
		        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
				private static WebElement itemClassificationBodyFrontSaveBtn ;
		        
		        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
				private static WebElement itemClassificationBodyFrontCloseBtn ;
		        
		    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
		    private static WebElement itemClassificationBodyForMatFieldDeatailsOkBtn ;
		        
		    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
		    private static WebElement itemClassificationBodyForMatFieldDeatailsCanceBtn ;
				
		    

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
	private static WebElement itemClassificationBodyRulesBtn ;

	      @FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
			private static WebElement itemClassificationBodyRulesClickHereAddRuleButtonBtn ;
	      
		        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
				private static WebElement itemClassificationBodyRulesRuleNameDropdown;
		        
		        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
				private static WebElement itemClassificationBodyRulesRuleNameSetingBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
				private static WebElement itemClassificationBodyRulesSaveBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
				private static WebElement itemClassificationBodyRulesNewBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
				private static WebElement itemClassificationBodyRulesDeleteBtn ;
		        
		        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
				private static WebElement itemClassificationBodyRulesCloseBtn ;
		        
		        @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
				private static WebElement itemClassificationBodyRulesCreatingGroupCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
				private static WebElement itemClassificationBodyRulesNewRecordCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
				private static WebElement itemClassificationBodyRulesEditCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
				private static WebElement itemClassificationBodyRulesCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
				private static WebElement itemClassificationBodyRulesBeforeSaveCheckbox ;
		        
		        @FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
				private static WebElement itemClassificationBodyRulesOnLeaveCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
				private static WebElement itemClassificationBodyRulesBeforeDeleteCheckbox ;
		        
		        @FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
				private static WebElement itemClassificationBodyRulesOnEnterCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
				private static WebElement itemClassificationBodyRulesActiveCheckbox;
		        
		        @FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
				private static WebElement itemClassificationBodyRulesNoConditionCheckbox;
		        
		        @FindBy(xpath="/html/HeaderDetails/section/div[2]/div/section[1]/div[1]/div/div[1]"
		        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
		        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
				private static WebElement itemClassificationBodyRulesIfBtn ;
		        
		        @FindBy(xpath="/html/HeaderDetails/section/div[2]/div/section[1]/div[1]/div/div[1]"
		        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
		        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
				private static WebElement itemClassificationBodyRulesElseBtn ;
		        

		        // if 
		       	
		           @FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIfSelectFieldDropdown ;
		           
		           @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIfOPerationTypeDropdown ;
		           
		           @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIfCompareTypeDropdown;          //Value,Field,Formula---Related
		           
		           @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIfValueType;
		           
		           @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIfConnterDropdown;          //Only,And,Or--RelatedDD

		          
		       	
		       	//IF **** Formatting
		       	
		       	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
		       	private static WebElement itemClassificationBodyRulesIFFormatting ;
		           
		           @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridFieldName ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridChangeValue ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridField ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridValue ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridCaption ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridRegularExpression ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridErrorMesage ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridBannerText ;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridToolTip;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridMandatoryChekbox;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridHiddenChekbox;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridDisableChekbox;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridSpellCheckChekbox;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridAligementDropdown;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridCharacterCasting;
		           
		           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
		       	private static WebElement itemClassificationBodyRulesIFFormattingGridSelectFont;
		           
		           
		           /// done
		         
		           
		           @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
		       	private static WebElement itemClassificationBodyRulesIFMessage ;
		           
		           
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
		       	private static WebElement itemClassificationBodyRulesIFMessagesInformationRadioBtn;
		           
		           @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIFMessagesGeneralInformation;
		           
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
		       	private static WebElement itemClassificationBodyRulesIFMessagesWarnAndProceddRadioBtn;
		           
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
		       	private static WebElement itemClassificationBodyRulesIFMessagesWarnAndStopRadioBtn;
		           
		           @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIFAlertMessage;
		           
		           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIFCustmizeTemplateDropdown;

		           ///// IF ****Alerts-----Grid Elements
		           
		           @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
		       	private static WebElement itemClassificationBodyRulesIFAlert ;
		           

		           @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIfAlertMessage;
		        
		           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIfCustmizeTemplateDropdown;
		           
		           
		           
		           
		           @FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIFAlertsGridTypeDropdown;
		           
		           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
		       	private static WebElement itemClassificationBodyRulesIFAlertsGridToWhomDropdown;
		           
		           @FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIFAlertsGridSmsDropdown;
		           
		           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
		       	private static WebElement itemClassificationBodyRulesIFAlertsGridEmail;
		           
		           @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIFAlertsGridDashBoardDropdown;
		           
		           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
		       	private static WebElement itemClassificationBodyRulesIFAlertsGridPopDropdown;
		           
		           @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIFAlertsGridGTalkDropdown;
		           
		           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
		       	private static WebElement itemClassificationBodyRulesIFAlertsGridSendSpecficMessageDropdown;
		           
		           @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesIFAlertsGridSpecificMessage;
		           
		           // alert over
		           
		           ///////Grid Elements------Formatting------Else Module
		           
		           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
		          	private static WebElement itemClassificationBodyRulesElseFormatting ;
		           
		           @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridFieldName ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridChangeValue ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridField ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridValue ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridCaption ;
		        
		           @FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridRegularExpression ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridErrorMesage ;
		        
		           @FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridBannerText ;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridToolTip;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridMandatoryChekbox;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridHiddenChekbox;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridDisableChekbox;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridSpellCheckChekbox;
		        
		           @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridAligementDropdown;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridCharacterCasting;
		        
		           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
		       	private static WebElement itemClassificationBodyRulesElseFormattingGridSelectFont;
		        

		        // else message
		           
		           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
		          	private static WebElement itemClassificationBodyRulesElsetMessage ;
		        
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
		       	private static WebElement itemClassificationBodyRulesElseMessagesInformationRadioBtn;
		        
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
		       	private static WebElement itemClassificationBodyRulesElseMessagesGeneralMessage;
		        
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
		       	private static WebElement itemClassificationBodyRulesElseMessagesWarnAndProceddRadioBtn;
		        
		           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
		       	private static WebElement itemClassificationBodyRulesElseMessagesWarnAndStopRadioBtn;
		        
		           
		           
		           
		           
		           
		           /////  Else*****Alerts-----Grid Elements
		           
		           
		           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
		          	private static WebElement itemClassificationBodyRulesElseAlert ;
		        
		           
		           @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesElseAlertMessage;
		        
		           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
		       	private static WebElement itemClassificationBodyRulesElseCustmizeTemplateDropdown;


		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
		       	private static WebElement itemClassificationBodyRulesElseAlertsGridTypeDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
		       	private static WebElement itemClassificationBodyRulesElseAlertsGridToWhomDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
		       	private static WebElement itemClassificationBodyRulesElseAlertsGridSmsDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
		       	private static WebElement itemClassificationBodyRulesElseAlertsGridEmail;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
		        	private static WebElement itemClassificationBodyRulesElseAlertsGridDashBoardDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
		       	private static WebElement itemClassificationBodyRulesElseAlertsGridPopDropdown;
		        
		          @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
		       	private static WebElement itemClassificationBodyRulesElseAlertsGridGTalkDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
		       	private static WebElement itemClassificationBodyRulesElseAlertsGridSendSpecficMessageDropdown;
		        
		           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
		       	private static WebElement itemClassificationBodyRulesElseAlertsGridSpecificMessage;
		           
		           
		           // Alert over
		        
		           
		           // Header
		           
		           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
		       	private static WebElement itemClassificationBodyRulesElseAlertsSaveBtn;
		        
		           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
		       	private static WebElement itemClassificationBodyRulesElseAlertsNewBtn;
		        
		           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
		       	private static WebElement itemClassificationBodyRulesElseAlertsDeleteBtn;
		        
		           @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		       	private static WebElement itemClassificationBodyRulesElseAlertsCloseBtn;
		        
		        
		         // General Main *** External modules
		        
		        
		    		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
		    		private static WebElement itemClassificationBodyExternalModules;			     
		    			     
		    						@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationBodyExternalModulesOnEventDropdown;	
		    						
		    						@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationBodyExternalModulesButtonCaption;
		    						
		    						@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationBodyExternalModules_ModuleTypeBtn;
		    						
		    						@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationBodyExternalModules_ModuleNameDropdown;
		    						
		    						@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationBodyExternalModulesClassNameDropdown;
		    						
		    						@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationBodyExternalModulesFuctionalNameDropdown;
		    						
		    						@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
		    						private static WebElement itemClassificationBodyExternalModulesAvabileInDropdown;
		    						
		    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
		    						private static WebElement itemClassificationBodyExternalModulesUpdateBtn;
		    						
		    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
		    						private static WebElement itemClassificationBodyExternalModulesSaveBtn;
		    						
		    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
		    						private static WebElement itemClassificationBodyExternalModulesEditBtn;
		    						
		    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
		    						private static WebElement itemClassificationBodyExternalModulesDeleteBtn;
		    						
		    						@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
		    						private static WebElement itemClassificationBodyExternalModulesCloseBtn;		  

	           
								    
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[1]/span")
	private static WebElement itemClassificationBodyCloseBtn;	
		    															
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement itemClassificationBodyCanceleBtn;		 



	///////Item------Customize Master---MasterField --Other Details-----Header details

	@FindBy(xpath="//*[@id='masterFields_list']/li[5]/span")
	private static WebElement MasterFieldOtherDetailsBtn;


	@FindBy(xpath="//*[@id='tabId_74']/ul/li[1]/a/span")
	private static WebElement MasterFieldOtherDetailsHeaderBtn;


	//////Edit Row Elements

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[1]/td[1]/i[1]")
	private static WebElement MasterFieldOtherDetailsHeaderEditFirstRowBtn;
	                
	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[2]/td[1]/i[1]")
	private static WebElement MasterFieldOtherDetailsHeaderEditSecondRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[3]/td[1]/i[1]")
	private static WebElement MasterFieldOtherDetailsHeaderEditThirdRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[4]/td[1]/i[1]")
	private static WebElement MasterFieldOtherDetailsHeaderEditFourthRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[5]/td[1]/i[1]")
	private static WebElement MasterFieldOtherDetailsHeaderEditFifthRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[6]/td[1]/i[1]")
	private static WebElement MasterFieldOtherDetailsHeaderEditSixthRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[7]/td[1]/i[1]")
	private static WebElement MasterFieldOtherDetailsHeaderEditSeventhRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[8]/td[1]/i[1]")
	private static WebElement MasterFieldOtherDetailsHeaderEditEighthRowBtn;




	//////Delete Row Elements



	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[1]/td[1]/i[2]")
	private static WebElement MasterFieldOtherDetailsHeaderDeleteFirstRowBtn;
	              
	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[2]/td[1]/i[2]")
	private static WebElement MasterFieldOtherDetailsHeaderDeleteSecondRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[3]/td[1]/i[2]")
	private static WebElement MasterFieldOtherDetailsHeaderDeleteThirdRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[4]/td[1]/i[2]")
	private static WebElement MasterFieldOtherDetailsHeaderDeleteFourthRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[5]/td[1]/i[2]")
	private static WebElement MasterFieldOtherDetailsHeaderDeleteFifthRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[6]/td[1]/i[2]")
	private static WebElement MasterFieldOtherDetailsHeaderDeleteSixthRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[7]/td[1]/i[2]")
	private static WebElement MasterFieldOtherDetailsHeaderDeleteSeventhRowBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_4']/div/div/table/tbody/tr[8]/td[1]/i[2]")
	private static WebElement MasterFieldOtherDetailsHeaderDeleteEighthRowBtn;







	@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
	private static WebElement itemOtherDetailsHeaderEditFieldDetailsCaption;   

	@FindBy(xpath="//*[@id='ExtraField_FieldName']")
	private static WebElement itemOtherDetailsHeaderEditFieldDetailsName;  

	@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
	private static WebElement itemOtherDetailsHeaderEditFieldDetailsDatTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
	private static WebElement itemOtherDetailsHeaderEditFieldDetailsDefaultValue;  

	@FindBy(xpath="//*[@id='ExtraField_BannerText']")
	private static WebElement itemOtherDetailsHeaderEditFieldDetailsBannerText;  

	@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
	private static WebElement itemOtherDetailsHeaderEditFieldDetailsMaxSize;  

	@FindBy(xpath="//*[@id='ExtraField_ControlType']")
	private static WebElement itemOtherDetailsHeaderEditFieldDetailsControlTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
	private static WebElement itemOtherDetailsHeaderEditFieldDetailsToolTipText;

	@FindBy(xpath="//*[@id='ExtraField_IncludeGroups']")
	private static WebElement itemOtherDetailsHeaderInclideGroupDropdown;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink']")
	private static WebElement itemOtherDetailsHeaderMasterToLinkDropdown;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_image']/span")
	private static WebElement itemOtherDetailsHeaderMasterToLinkExpansionBtn;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_settings']/span")
	private static WebElement itemOtherDetailsHeaderMasterToLinkSettingBtn;


	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_container']")
	private static WebElement itemOtherDetailsMasterToLink_Expansion_ScaptionText;

	////////////*****************pop
	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[1]")
	private static WebElement itemOtherDetailsMasterToLink_StandardFieldsBtn;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_list']")
	private static WebElement itemOtherDetailsMasterToLink_StandardField_FieldDropdown;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_header']")
	private static WebElement itemOtherDetailsMasterToLink_StandardField_HeaderText;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_alignment']")
	private static WebElement itemOtherDetailsMasterToLink_StandardField_AlignmentDropdown;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_width']")
	private static WebElement itemOtherDetailsMasterToLink_StandardField_WidthText;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
	private static WebElement itemOtherDetailsMasterToLink_StandardField_OkBtn;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
	private static WebElement itemOtherDetailsMasterToLink_StandardField_CanceBtn;


	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[2]")
	private static WebElement itemOtherDetailsMasterToLink_DeleteColoumnBtn;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
	private static WebElement itemOtherDetailsMasterToLink_OkBtn;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
	private static WebElement itemOtherDetailsMasterToLink_CancelBtn;


	@FindBy(xpath="//*[@id='ExtraField_MandatoryFields']")
	private static WebElement itemOtherDetailsHeaderMandatoryFieldsText;

	////Grid Filter Criteria-----First Row

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-1']/span")
	private static WebElement itemOtherDetailsHeaderFilterDeleteFirstColoumn;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-2']")
	private static WebElement itemOtherDetailsHeaderFilterFirstOnColoumnDropdown;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-3']")
	private static WebElement itemOtherDetailsHeaderFilterFirstOperator;

	@FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_1-4;]")
	private static WebElement itemOtherDetailsHeaderFilterFirstCompareWith;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-5']")
	private static WebElement itemOtherDetailsHeaderFilterFirstFilterValueAndFiled;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-6']")
	private static WebElement itemOtherDetailsHeaderFilterFirstLinkFlied;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-7']")
	private static WebElement itemOtherDetailsHeaderFilterFirstConjuction;



	////Grid Filter Criteria-----Second Row

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-1']/span")
	private static WebElement itemOtherDetailsHeaderFilterDeleteSecondColoumn;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-2']")
	private static WebElement itemOtherDetailsHeaderFilterSecondFilterOnColoumnDropdown;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-3']")
	private static WebElement itemOtherDetailsHeaderFilterSecondOperator;

	@FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_2-4;]")
	private static WebElement itemOtherDetailsHeaderFilterSecondCompareWith;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-5']")
	private static WebElement itemOtherDetailsHeaderFilterSecondFilterValueAndFiled;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-6']")
	private static WebElement itemOtherDetailsHeaderFilterSecondLinkFlied;

	@FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-7']")
	private static WebElement itemOtherDetailsHeaderFilterSecondConjuction;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
	private static WebElement itemOtherDetailsHeaderFeildDetailsOkBtn;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement itemOtherDetailsHeaderFeildDetailsCancelBtn;



	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
	private static WebElement itemOtherDetailsHeaderPropertiesBtn;		     

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
	private static WebElement itemOtherDetailsHeaderProperties_PartOfDeliveryAddressCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
	private static WebElement itemOtherDetailsHeaderProperties_PartOfBillingAddresCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
	private static WebElement itemOtherDetailsHeaderProperties_MandatoryCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
	private static WebElement itemOtherDetailsHeaderProperties_AllowAsParameterCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
	private static WebElement itemOtherDetailsHeaderProperties_HiddenCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
	private static WebElement itemOtherDetailsHeaderProperties_HiddenInGroupCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
	private static WebElement itemOtherDetailsHeaderProperties_SpellCheckCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
	private static WebElement itemOtherDetailsHeaderProperties_MandatoryInGroupCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
	private static WebElement itemOtherDetailsHeaderProperties_AuditTrialCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
	private static WebElement itemOtherDetailsHeaderProperties_NotAvailableForReportCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
	private static WebElement itemOtherDetailsHeaderProperties_MergeFieldCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
	private static WebElement itemOtherDetailsHeaderProperties_MassUpdateCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
	private static WebElement itemOtherDetailsHeaderProperties_IncludeInQuickCreateCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
	private static WebElement itemOtherDetailsHeaderProperties_CannotBeExportedCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
	private static WebElement itemOtherDetailsHeaderProperties_CannotBeImportedCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
	private static WebElement itemOtherDetailsHeaderProperties_CopyFromParentCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
	private static WebElement itemOtherDetailsHeaderProperties_ReadOnlyCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
	private static WebElement itemOtherDetailsHeaderProperties_InformationFieldCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
	private static WebElement itemOtherDetailsHeaderProperties_IsMandatoryInRevisionCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
	private static WebElement itemOtherDetailsHeaderProperties_AvailableinCustomerPortalCheckbox;

	@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
	private static WebElement itemOtherDetailsHeaderProperties_EditableinCustomerPortalCheckbox;

	@FindBy(xpath="//*[@id='Behaviour']")
	private static WebElement itemOtherDetailsHeaderProperties_BehaviourDropdown;




	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
	private static WebElement  ItemOtherDetailscustomizeHeaderFormattingBtn ;

	@FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
	private static WebElement itemOtherDetailsHeaderFormattingColumnSpan ;

	@FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
	private static WebElement itemOtherDetailsHeaderFormattingRowSpan ;

	@FindBy(xpath="//*[@id='CharacterCasing']")
	private static WebElement itemOtherDetailsHeaderFormattingCharacterCasingDropdown ;

	@FindBy(xpath="//*[@id='TextAlign']")
	private static WebElement itemOtherDetailsHeaderFormattingTextAlignDropdown;

	@FindBy(xpath="//*[@id='FieldsDetails_Font']")
	private static WebElement itemOtherDetailsHeaderFormattingFieldsDetailsFont ;

	@FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
	private static WebElement itemOtherDetailsHeaderFormattingBackColor ;

	@FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
	private static WebElement itemOtherDetailsHeaderFormattingFieldsDetailsFont_Btn ;

	//Elements are used for font edit option pop in field details and rules 

	@FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderFontAreialDropdown ;

	@FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderFontStyleDropdown;

	@FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderFontWeightDropdown;

	@FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderFontSizeDropdown;

	@FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderForeColourDropdown ;

	@FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderBackColorDropdown ;

	@FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderBaselineCheckbox;

	@FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderOverLineCheckbox;

	@FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderStrikeThroughCheckbox;

	@FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderUnderlineCheckbox;

	@FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderEnableFontCheckbox;

	@FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
	private static WebElement itemOtherDetailsHeaderFrontPriveiw ;

	@FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
	private static WebElement itemOtherDetailsHeaderFrontSaveBtn ;

	@FindBy(xpath="//*[@id='myFontControl_IF_Close']")
	private static WebElement itemOtherDetailsHeaderFrontCloseBtn ;

	@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
	private static WebElement itemOtherDetailsHeaderForMatFieldDeatailsOkBtn ;

	@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
	private static WebElement itemOtherDetailsHeaderForMatFieldDeatailsCanceBtn ;



	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
	private static WebElement itemOtherDetailsHeaderrulesBtn ;

	@FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
	private static WebElement itemOtherDetailsHeaderrulesClickHereAddRuleButtonBtn ;

	@FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesRuleNameDropdown;

	@FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
	private static WebElement itemOtherDetailsHeaderrulesRuleNameSetingBtn ;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
	private static WebElement itemOtherDetailsHeaderrulesSaveBtn ;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
	private static WebElement itemOtherDetailsHeaderrulesNewBtn ;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
	private static WebElement itemOtherDetailsHeaderrulesDeleteBtn ;

	@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	private static WebElement itemOtherDetailsHeaderrulesCloseBtn ;

	@FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesCreatingGroupCheckbox;

	@FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesNewRecordCheckbox;

	@FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesEditCheckbox;

	@FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesCheckbox;

	@FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesBeforeSaveCheckbox ;

	@FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesOnLeaveCheckbox;

	@FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesBeforeDeleteCheckbox ;

	@FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesOnEnterCheckbox;

	@FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesActiveCheckbox;

	@FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesNoConditionCheckbox;

	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
	+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
	+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
	private static WebElement itemOtherDetailsHeaderrulesIfBtn ;

	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
	+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
	+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
	private static WebElement itemOtherDetailsHeaderrulesElseBtn ;


	// if 

	@FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIfSelectFieldDropdown ;

	@FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIfOPerationTypeDropdown ;

	@FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIfCompareTypeDropdown;          //Value,Field,Formula---Related

	@FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIfValueType;

	@FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIfConnterDropdown;          //Only,And,Or--RelatedDD



	//IF **** Formatting

	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
	private static WebElement itemOtherDetailsHeaderrulesIFFormatting ;

	@FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridFieldName ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridChangeValue ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridField ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridValue ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridCaption ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridRegularExpression ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridErrorMesage ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridBannerText ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridToolTip;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridMandatoryChekbox;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridHiddenChekbox;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridDisableChekbox;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridSpellCheckChekbox;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridAligementDropdown;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridCharacterCasting;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
	private static WebElement itemOtherDetailsHeaderrulesIFFormattingGridSelectFont;


	/// done


	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
	private static WebElement itemOtherDetailsHeaderrulesIFMessage ;


	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
	private static WebElement itemOtherDetailsHeaderrulesIFMessagesInformationRadioBtn;

	@FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIFMessagesGeneralInformation;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
	private static WebElement itemOtherDetailsHeaderrulesIFMessagesWarnAndProceddRadioBtn;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
	private static WebElement itemOtherDetailsHeaderrulesIFMessagesWarnAndStopRadioBtn;

	@FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertMessage;

	@FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIFCustmizeTemplateDropdown;

	///// IF ****Alerts-----Grid Elements

	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
	private static WebElement itemOtherDetailsHeaderrulesIFAlert ;


	@FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIfAlertMessage;

	@FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIfCustmizeTemplateDropdown;




	@FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertsGridTypeDropdown;

	@FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertsGridToWhomDropdown;

	@FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertsGridSmsDropdown;

	@FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertsGridEmail;

	@FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertsGridDashBoardDropdown;

	@FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertsGridPopDropdown;

	@FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertsGridGTalkDropdown;

	@FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertsGridSendSpecficMessageDropdown;

	@FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesIFAlertsGridSpecificMessage;

	// alert over

	///////Grid Elements------Formatting------Else Module

	@FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
	private static WebElement itemOtherDetailsHeaderrulesElseFormatting ;

	@FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridFieldName ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridChangeValue ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridField ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridValue ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridCaption ;

	@FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridRegularExpression ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridErrorMesage ;

	@FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridBannerText ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridToolTip;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridMandatoryChekbox;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridHiddenChekbox;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridDisableChekbox;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridSpellCheckChekbox;

	@FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridAligementDropdown;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridCharacterCasting;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
	private static WebElement itemOtherDetailsHeaderrulesElseFormattingGridSelectFont;


	// else message

	@FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
	private static WebElement itemOtherDetailsHeaderrulesElsetMessage ;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
	private static WebElement itemOtherDetailsHeaderrulesElseMessagesInformationRadioBtn;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
	private static WebElement itemOtherDetailsHeaderrulesElseMessagesGeneralMessage;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
	private static WebElement itemOtherDetailsHeaderrulesElseMessagesWarnAndProceddRadioBtn;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
	private static WebElement itemOtherDetailsHeaderrulesElseMessagesWarnAndStopRadioBtn;






	/////  Else*****Alerts-----Grid Elements


	@FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
	private static WebElement itemOtherDetailsHeaderrulesElseAlert ;


	@FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertMessage;

	@FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
	private static WebElement itemOtherDetailsHeaderrulesElseCustmizeTemplateDropdown;



	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsGridTypeDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsGridToWhomDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsGridSmsDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsGridEmail;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsGridDashBoardDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsGridPopDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsGridGTalkDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsGridSendSpecficMessageDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsGridSpecificMessage;


	// Alert over


	// Header

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsSaveBtn;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsNewBtn;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsDeleteBtn;

	@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	private static WebElement itemOtherDetailsHeaderrulesElseAlertsCloseBtn;


	// General Main *** External modules


	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
	private static WebElement itemOtherDetailsHeaderExternalModules;			     

			@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
			private static WebElement itemOtherDetailsHeaderExternalModulesOnEventDropdown;	
			
			@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
			private static WebElement itemOtherDetailsHeaderExternalModulesButtonCaption;
			
			@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
			private static WebElement itemOtherDetailsHeaderExternalModules_ModuleTypeBtn;
			
			@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
			private static WebElement itemOtherDetailsHeaderExternalModules_ModuleNameDropdown;
			
			@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
			private static WebElement itemOtherDetailsHeaderExternalModulesClassNameDropdown;
			
			@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
			private static WebElement itemOtherDetailsHeaderExternalModulesFuctionalNameDropdown;
			
			@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
			private static WebElement itemOtherDetailsHeaderExternalModulesAvabileInDropdown;
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
			private static WebElement itemOtherDetailsHeaderExternalModulesUpdateBtn;
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
			private static WebElement itemOtherDetailsHeaderExternalModulesSaveBtn;
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
			private static WebElement itemOtherDetailsHeaderExternalModulesEditBtn;
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
			private static WebElement itemOtherDetailsHeaderExternalModulesDeleteBtn;
			
			@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
			private static WebElement itemOtherDetailsHeaderExternalModulesCloseBtn;		  
			
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[1]/span")
	private static WebElement itemOtherDetailsHeaderOkBtn;


	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement itemOtherDetailsHeaderCloseBtn;


	///////Item------Customize Master---MasterField --Other Details-----Body details*********************************


	@FindBy(xpath="//*[@id='tabId_74']/ul/li[2]/a/span")
	private static WebElement MasterFieldOtherDetailsBodyDetailsBtn;


	/////Body main screen related elements---------------------------------------------------
							     
					  @FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
					  private static WebElement masterFielditemOtherDetailsBodySaveBtn;
							     
					  @FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
					  private static WebElement masterFielditemOtherDetailsBodyAddBtn;
							     
					  @FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
					  private static WebElement masterFielditemOtherDetailsBodyPreview;
							     
					 @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
					 private static WebElement masterFielditemOtherDetailsBodyCloseBtn;

	///////Edit   Elements***********************************************************
						
	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[1]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditFirstRowBtn;						
			
	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[2]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditSecondRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[3]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditThirdRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[4]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditFourthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[5]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditFifthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[6]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditSixthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[7]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditSeventhRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[8]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditEightRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[9]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditNineRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[10]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyTenFirstRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[11]/td[1]/i[1]")
	private static WebElement masterFielditemOtherDetailsBodyEditElevenRowBtn;	


	/////////////////////Delete ELements------------------------------------------





	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[1]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteFirstRowBtn;						

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[2]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteSecondRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[3]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteThirdRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[4]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteFourthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[5]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteFifthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[6]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteSixthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[7]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteSeventhRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[8]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteEightRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[9]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteNineRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[10]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyTenRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_4']/div/div/table/tbody/tr[11]/td[1]/i[2]")
	private static WebElement masterFielditemOtherDetailsBodyDeleteElevenRowBtn;	


	///////Field Details


	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]")
	public static WebElement binsFirstLevelMastersDisplay;


	@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
	private static WebElement itemOtherDetailsBodyFieldDetailsCaption;   

	@FindBy(xpath="//*[@id='ExtraField_FieldName']")
	private static WebElement itemOtherDetailsBodyFieldDetailsName;  

	@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
	private static WebElement itemOtherDetailsBodyFieldDetailsDatTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
	private static WebElement itemOtherDetailsBodyFieldDetailsDefaultValue;  

	@FindBy(xpath="//*[@id='ExtraField_BannerText']")
	private static WebElement itemOtherDetailsBodyFieldDetailsBannerText;  

	@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
	private static WebElement itemOtherDetailsBodyFieldDetailsMaxSize;  

	@FindBy(xpath="//*[@id='ExtraField_ControlType']")
	private static WebElement itemOtherDetailsBodyFieldDetailsControlTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
	private static WebElement itemOtherDetailsBodyFieldDetailsToolTipText;

	@FindBy(xpath="//*[@id='ExtraField_RegularExpression']")
	private static WebElement itemOtherDetailsBodyDetails_RegularExpressionText;  


	@FindBy(xpath=" //*[@id='btnLoad_RExp']")
	private static WebElement   itemOtherDetailsBodyFieldDetailsRegularExperssionLoad_ExpansionBtn;


		     @FindBy(xpath="//*[@id='txtRExpression_RExp']")
		     private static WebElement   itemOtherDetailsBodyFieldDetailsregExper_RegularExpression; 
		     
		     @FindBy(xpath="//*[@id='btnTestRExp']")
		     private static WebElement   itemOtherDetailsBodyFieldDetailsregrExper_TestBtn;
		     
		     @FindBy(xpath="//*[@id='txtTestExpression_RExp']")
		     private static WebElement   itemOtherDetailsBodyFieldDetailsregExper_TestString;
		     
		     @FindBy(xpath="//*[@id='txtNameExpression_RExp']")
		     private static WebElement   itemOtherDetailsBodyFieldDetailsregExper_Name;
		     
		     @FindBy(xpath="//*[@id='txtDescriptionExpression_RExp']")
		     private static WebElement   itemOtherDetailsBodyFieldDetailsregExper_Description;
		     
		     @FindBy(xpath="//*[@id='btnClearREFields']")
		     private static WebElement   itemOtherDetailsBodyFieldDetailsregExper_ClearBtn;
		     
		     @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[3]/button[1]")
		     private static WebElement   itemOtherDetailsBodyFieldDetailsregExper_OkBtn;
	    
		     @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[3]/button[2]")
		     private static WebElement   itemOtherDetailsBodyFieldDetailsregExper_CancelBtn;
		     
		     @FindBy(xpath="//*[@id='txtGroupsAndOptions']")
		     private static WebElement   itemOtherDetailsBodyFieldDetailsregExper_SearchTextBox;
		     
				   @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[1]/a")
				   private static WebElement   itemOtherDetailsBodyFieldDetailsregExperCharactersAndRepetitionsBtn;
				    
					     @FindBy(xpath="//*[@id='chkMatchIfAbsent_Regex']")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_MatchOnlyIfAbsentChekbox;
					     
					     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[2]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_AnyCharcterRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[3]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_AlphanumericRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[4]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_DigitRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[5]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_WhiteSpaceRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[6]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_SpecificCharcterRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[7]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_NamedClassRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[9]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_SpecifiedSetRadioBtn;
					     
					     @FindBy(xpath="//*[@id='chkRepetition_RegEx']")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_AsFewAsPossibleChekbox;
					     
					     @FindBy(xpath="//*[@id='expRepetitions']/div[2]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_JustOnceRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expRepetitions']/div[3]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_AnyNumberRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expRepetitions']/div[4]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_ONeOrMoreRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expRepetitions']/div[4]/div/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_ZeroOrOneRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expRepetitions_Extra']/div[1]/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_ExactlyRadioBtn;
					     
					     @FindBy(xpath="//*[@id='expRepetitions_Extra']/div[3]/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_AtleastnRadioBtn;
					     
					     @FindBy(xpath="//*[@id=expRepetitions_Extra']/div[5]/label/input")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_BetweenmAndmRadioBtn;
				     
					     @FindBy(xpath=" //*[@id='CharsAndRepetitions_RExp']/div[1]/div/button")
					     private static WebElement   itemOtherDetailsBodyFieldDetailsCharactersAndRepetitions_InsertBtn;
					     
					     
	             @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[2]/a")
	             private static WebElement   itemOtherDetailsBodyFieldDetailsregExperGroupsAndOptionsBtn;
				     
					           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[1]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_NumberCaptureRadioBtn;
					           
					           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[2]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_NonCapturingGroupRadioBtn;
					           
					           @FindBy(xpath="//*[@id='chkMatchGroupName1']")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_Name1RadioBtn;
					           
					           @FindBy(xpath="//*[@id='txtMatchGroupName1']")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_Name1;
					           
					           @FindBy(xpath="//*[@id='txtMatchGroupName2']")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_Name2;
					           
					           @FindBy(xpath="//*[@id='chkMatchGroupName2']")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_Name2RadioBtn;
					           
					           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[5]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_MatchSufficButExcludeItRadioBtn;
					           
					           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[6]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_LessThanRadioBtn;
					           
					           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[7]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_LessThanEqualRadioBtn;
					           
					           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[8]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_MatchIfPrefixIsNotPresentRadioBtn;
					           
					           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[9]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_GreddySubExpressionRadioBtn;
					           
					           @FindBy(xpath="//*[@id='chkMatchGroupComment']")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_CommentRadioBtn;
					           
					           @FindBy(xpath="//*[@id='txtMatchGroupComment']")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_Comment;
					           
					           @FindBy(xpath="//*[@id='chkNonCapturingGroup']")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_NonCapturingGroupChekbox;
					           
					           @FindBy(xpath="//*[@id='chkEnclosingGroup']")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_EnclosingGroupChekbox;
					           
					           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[1]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_IgnoreCaseiChekbox;
					           
					           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[2]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_MultilinemChekbox;
					           
					           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[3]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_SingleLineChekbox;
					           
					           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[4]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_ExplictCaptureChekbox;
					           
					           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[5]/div/label/input")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_IgnorepatternwhitespaceChekbox;
					           
					           @FindBy(xpath="//*[@id='GroupsAndOptions_RExp']/div[1]/div/button")
				               private static WebElement   itemOtherDetailsBodyFieldDetailsgroupAndOption_InsertBtn;
	          
	         
	            @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[3]/a")
	            private static WebElement   itemOtherDetailsBodyFieldDetailsregExperSpecialCharacters;               

					   @FindBy(xpath=" //*[@id='SpecialCharacters_RExp']/div[1]/div/button")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_InsertBtn;
					   
					   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[1]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_BellRadioBtn;
				       
					   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[2]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_BackSpaceRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[3]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_TabRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[4]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_CarriageReturnRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[5]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_VerticalTabRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[5]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_FormFeedRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[7]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_NewLineRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[8]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_EscapeRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[1]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_BenningStringOrLineRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[2]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_EndOfStringOrLineRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[3]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_AlterNationRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[1]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_BenningOfString;
					   
					   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[2]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_EndOfStringOrBeforNewLineAtEnd;
					   
					   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[3]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_EndOfStringRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[4]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_BenningOfCurrentSearchRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[5]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_FirstOrLastCharcterInWordRadioBtn;
					   
					   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[6]/div/label/input")
					   private static WebElement   itemOtherDetailsBodyFieldDetailsSpecialCharacters_NotFirstOrLastCharcterInWordRadioBtn;
	  
					     
	             @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[4]/a")
	             private static WebElement   itemOtherDetailsBodyFieldDetailsregExperExistingRegexBtn;
							     
				  @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[5]/a")
				  private static WebElement   itemOtherDetailsBodyFieldDetailsregExperHelp;
				  
							  @FindBy(xpath="//*[@id='Help_SyntaxElements']")
							  private static WebElement   itemOtherDetailsBodyFieldDetailsHelp_SyntaxElementsRadioBtn;
							  
							  @FindBy(xpath="//*[@id='Help_Characters']")
							  private static WebElement   itemOtherDetailsBodyFieldDetailsHelp_CharactersRadioBtn;
							  
							  @FindBy(xpath="//*[@id='Help_Quantifier']")
							  private static WebElement   itemOtherDetailsBodyFieldDetailsHelp_QuantifierRadioBtn;
							  
							  @FindBy(xpath="//*[@id='Help_Anchors']")
							  private static WebElement   itemOtherDetailsBodyFieldDetailsHelp_AnchorsRadioBtn;
							  
							  @FindBy(xpath="//*[@id='Help_CharacterClass']")
							  private static WebElement   itemOtherDetailsBodyFieldDetailsHelp_CharacterClassRadioBtn;
							  
							  @FindBy(xpath="//*[@id='Help_ExtendedGroups']")
							  private static WebElement   itemOtherDetailsBodyFieldDetailsHelp_ExtendedGroupsRadioBtn;
							  
							  @FindBy(xpath="//*[@id='Help_BackReference']")
							  private static WebElement   itemOtherDetailsBodyFieldDetailsHelp_BackReferenceRadioBtn;
							  
							  @FindBy(xpath="//*[@id='Help_SubexpCall']")
							  private static WebElement   itemOtherDetailsBodyFieldDetailsHelp_SubexpCallRadioBtn;
							  
							  @FindBy(xpath="//*[@id='Help_CapturedGroup']")
							  private static WebElement   itemOtherDetailsBodyFieldDetailsHelp_CapturedGroupRadioBtn;
							  
			     
			      @FindBy(xpath="//*[@id='ExtraField_ErrorMessage']")
			      private static WebElement   itemOtherDetailsBodyFieldDetailsMainEditFieldDetailsErrorMessage;  


	/////Properties<----Body details<-------OtherDetails

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
	private static WebElement   itemOtherDetailsBodyFieldDetailsPropertiesBtn;

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
	private static WebElement  itemOtherDetailsBodyFieldDetails_PartOfDeliveryAddressChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_PartOfBillingAddressChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_MandatoryChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_AllowAsParameterChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_HiddenChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_HiddenInGroupChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_SpellCheckChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_MandatoryInGroupChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_AuditTrialChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_NotAvailableForReportsChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_MergeFieldChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_MassUpdateChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_IncludeInQuickCreateChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_CannotBeExportedChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_CannotBeImportedChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_CopyFromParentChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_ReadOnlyChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_InformationFieldChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_IsMandatoryInRevisionChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_AvailableinCustomerPortalChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_EditableinCustomerPortalChekbox;

	@FindBy(xpath="//*[@id='Behaviour']")
	private static WebElement  itemOtherDetailsBodyFieldDetails_BehaviourDropdown;


	///////Formatting Elements--------------------------------------------------------------------

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
	private static WebElement  itemOtherDetailsBodyFormattingBtn ;




	@FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
	private static WebElement  itemOtherDetailsBodyFormattingColumnSpan ;

	@FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
	private static WebElement  itemOtherDetailsBodyFormattingRowSpan ;

	@FindBy(xpath="//*[@id='CharacterCasing']")
	private static WebElement  itemOtherDetailsBodyFormattingCharacterCasingDropdown ;

	@FindBy(xpath="//*[@id='TextAlign']")
	private static WebElement  itemOtherDetailsBodyFormattingTextAlignDropdown ;

	@FindBy(xpath="//*[@id='FieldsDetails_Font']")
	private static WebElement  itemOtherDetailsBodyFormattingFieldsDetailsFont ;

	@FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
	private static WebElement  itemOtherDetailsBodyFormattingBackColor ;

	@FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
	private static WebElement  itemOtherDetailsBodyFormattingFieldsDetailsFont_Btn ;

	//Elements are used for font edit option pop in field details and rules 

		        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyFontAreialDropdown ;
		        
		        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyFontStyleDropdown ;
		        
		        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyFontWeightDropdown ;

		        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyFontSizeDropdown ;
		        
		        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyForeColourDropdown ;
		        
		        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyBackColorDropdown ;
		        
		        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyBaselineChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyOverLineChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyStrikeThroughChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyUnderlineChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyEnableFontChekbox ;
		        
		        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
				private static WebElement  itemOtherDetailsBodyFrontPriveiw ;
		        
		        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
				private static WebElement  itemOtherDetailsBodyFrontSaveBtn ;
		        
		        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
				private static WebElement  itemOtherDetailsBodyFrontCloseBtn ;
		        
		    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
		    private static WebElement  itemOtherDetailsBodyForMatFieldDeatailsOkBtn ;
		        
		    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
		    private static WebElement  itemOtherDetailsBodyForMatFieldDeatailsCanceBtn ;
		        
		        

		      
	  
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
	private static WebElement  itemOtherDetailsBodyrulesBtn ;

	            @FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
			    private static WebElement  itemOtherDetailsBodyrulesClickHereAddRuleButtonBtn ;
	        
		        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesRuleNameDropdown ;
		        
		        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
				private static WebElement  itemOtherDetailsBodyrulesRuleNameSetingBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
				private static WebElement  itemOtherDetailsBodyrulesSaveBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
				private static WebElement  itemOtherDetailsBodyrulesNewBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
				private static WebElement  itemOtherDetailsBodyrulesDeleteBtn ;
		        
		        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
				private static WebElement  itemOtherDetailsBodyrulesCloseBtn ;
		        
		        @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesCreatingGroupChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesNewRecordChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesEditChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesLoadChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesBeforeSaveChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesOnLeaveChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesBeforeDeleteChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesOnEnterChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesActiveChekbox ;
		        
		        @FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
				private static WebElement  itemOtherDetailsBodyrulesNoConditionChekbox;
		        
		        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
		        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
		        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
				private static WebElement  itemOtherDetailsBodyrulesIfBtn ;
		        
		        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
		        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
		        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
				private static WebElement  itemOtherDetailsBodyrulesElseBtn ;
		        
		        
		        
		        
		     // if 
		    	
		        @FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIfSelectFieldDropdown ;
		        
		        @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIfOPerationTypeDropdown ;
		        
		        @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIfCompareTypeDropdown;          //Value,Field,Formula---Related
		        
		        @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIfValueType;
		        
		        @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIfConnterDropdown;          //Only,And,Or--RelatedDD

		       
		    	
		    	//IF **** Formatting
		    	
		    	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormatting ;
		        
		        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridFieldName ;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridChangeValue ;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridField ;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridValue ;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridCaption ;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridRegularExpression ;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridErrorMesage ;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridBannerText ;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridToolTip;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridMandatoryChekbox;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridHiddenChekbox;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridDisableChekbox;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridSpellCheckChekbox;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridAligementDropdown;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridCharacterCasting;
		        
		        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFFormattingGridSelectFont;
		        
		        
		        /// done
		      
		        
		        @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
		    	private static WebElement  itemOtherDetailsBodyrulesIFMessage ;
		        
		        
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
		    	private static WebElement  itemOtherDetailsBodyrulesIFMessagesInformationRadioBtn;
		        
		        @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFMessagesGeneralInformation;
		        
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
		    	private static WebElement  itemOtherDetailsBodyrulesIFMessagesWarnAndProceddRadioBtn;
		        
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
		    	private static WebElement  itemOtherDetailsBodyrulesIFMessagesWarnAndStopRadioBtn;
		        
		        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertMessage;
		        
		        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFCustmizeTemplateDropdown;

		        ///// IF ****Alerts-----Grid Elements
		        
		        @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlert ;
		        

		        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIfAlertMessage;
		     
		        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIfCustmizeTemplateDropdown;
		        
		        
		        
		        
		        @FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertsGridTypeDropdown;
		        
		        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertsGridToWhomDropdown;
		        
		        @FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertsGridSmsDropdown;
		        
		        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertsGridEmail;
		        
		        @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertsGridDashBoardDropdown;
		        
		        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertsGridPopDropdown;
		        
		        @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertsGridGTalkDropdown;
		        
		        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertsGridSendSpecficMessageDropdown;
		        
		        @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesIFAlertsGridSpecificMessage;
		        
		        // alert over
		        
		        ///////Grid Elements------Formatting------Else Module
		        
		        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
		       	private static WebElement  itemOtherDetailsBodyrulesElseFormatting ;
		        
		        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridFieldName ;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridChangeValue ;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridField ;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridValue ;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridCaption ;
		     
		        @FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridRegularExpression ;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridErrorMesage ;
		     
		        @FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridBannerText ;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridToolTip;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridMandatoryChekbox;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridHiddenChekbox;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridDisableChekbox;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridSpellCheckChekbox;
		     
		        @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridAligementDropdown;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridCharacterCasting;
		     
		        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseFormattingGridSelectFont;
		     

		     // else message
		        
		        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
		       	private static WebElement  itemOtherDetailsBodyrulesElsetMessage ;
		     
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
		    	private static WebElement  itemOtherDetailsBodyrulesElseMessagesInformationRadioBtn;
		     
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
		    	private static WebElement  itemOtherDetailsBodyrulesElseMessagesGeneralMessage;
		     
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
		    	private static WebElement  itemOtherDetailsBodyrulesElseMessagesWarnAndProceddRadioBtn;
		     
		        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
		    	private static WebElement  itemOtherDetailsBodyrulesElseMessagesWarnAndStopRadioBtn;
		     
		        
		        
		        
		        
		        
		        /////  Else*****Alerts-----Grid Elements
		        
		        
		        @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
		       	private static WebElement  itemOtherDetailsBodyrulesElseAlert ;
		     
		        
		        @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertMessage;
		     
		        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseCustmizeTemplateDropdown;


		     
		        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsGridTypeDropdown;
		     
		        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsGridToWhomDropdown;
		     
		        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsGridSmsDropdown;
		     
		        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsGridEmail;
		     
		        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
		     	private static WebElement  itemOtherDetailsBodyrulesElseAlertsGridDashBoardDropdown;
		     
		        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsGridPopDropdown;
		     
		       @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsGridGTalkDropdown;
		     
		        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsGridSendSpecficMessageDropdown;
		     
		        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsGridSpecificMessage;
		        
		        
		        // Alert over
		     
		        
		        // Header
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsSaveBtn;
		     
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsNewBtn;
		     
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsDeleteBtn;
		     
		        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		    	private static WebElement  itemOtherDetailsBodyrulesElseAlertsCloseBtn;
		     
		     
		      // General Main *** External modules
		        
		    @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
		    private static WebElement  itemOtherDetailsBodyExternalModules;			     
		     
		    @FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
		    private static WebElement  itemOtherDetailsBodyExternalModulesOnEventDropdown;	

		    @FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
		    private static WebElement  itemOtherDetailsBodyExternalModulesButtonCaption;

		    @FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
		    private static WebElement  itemOtherDetailsBodyExternalModules_ModuleTypeBtn;

		    @FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
		    private static WebElement  itemOtherDetailsBodyExternalModules_ModuleNameDropdown;

		    @FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
		    private static WebElement  itemOtherDetailsBodyExternalModulesClassNameDropdown;

		    @FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
		    private static WebElement  itemOtherDetailsBodyExternalModulesFuctionalNameDropdown;

		    @FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
		    private static WebElement  itemOtherDetailsBodyExternalModulesAvabileInDropdown;

		    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
		    private static WebElement  itemOtherDetailsBodyExternalModulesUpdateBtn;

		    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
		    private static WebElement  itemOtherDetailsBodyExternalModulesSaveBtn;

		    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
		    private static WebElement  itemOtherDetailsBodyExternalModulesEditBtn;

		    @FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
		    private static WebElement  itemOtherDetailsBodyExternalModulesDeleteBtn;

		    @FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
		    private static WebElement  itemOtherDetailsBodyExternalModulesCloseBtn;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
	private static WebElement  itemOtherDetailsBodyOkBtn;		     
					     
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement  itemOtherDetailsBodyCancelBtn;	






	/////////////Item-------Customize Master------Replenishment


	@FindBy(xpath="//*[@id='masterFields_list']/li[6]/span")
	private static WebElement MasterFieldReplenishmentBtn;

	@FindBy(xpath="//*[@id='tabId_75']/ul/li[1]/a/span")
	private static WebElement masterFielditemReplenishmentHeaderDetailsTab;

	////Header main screen related elements

	@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
	private static WebElement masterFielditemReplenishmentBodySaveBtn;
			     
	@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/div[2]")
	private static WebElement masterFielditemReplenishmentBodyMoveFiledBtn;
			     
	@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
	private static WebElement masterFielditemReplenishmentBodyAddBtn;
			     
	@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
	private static WebElement masterFielditemReplenishmentBodyPreview;
			     
	@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	private static WebElement masterFielditemReplenishmentBodyCloseBtn;


	/////Edit Elements

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[1]/td[1]/i[1]")
	private static WebElement itemReplenishmentHeaderFirstRowBtn;						
			
	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[2]/td[1]/i[1]")
	private static WebElement itemReplenishmentHeaderSecondRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[3]/td[1]/i[1]")
	private static WebElement itemReplenishmentHeaderThirdRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[4]/td[1]/i[1]")
	private static WebElement itemReplenishmentHeaderFourthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[5]/td[1]/i[1]")
	private static WebElement itemReplenishmentHeaderFifthRowBtn;	



	///Delete Elements


	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[1]/td[1]/i[2]")
	private static WebElement itemReplenishmentHeaderDeleteFirstRowBtn;						

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[2]/td[1]/i[2]")
	private static WebElement itemReplenishmentHeaderDeleteSecondRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[3]/td[1]/i[2]")
	private static WebElement itemReplenishmentHeaderDeleteThirdRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[4]/td[1]/i[2]")
	private static WebElement itemReplenishmentHeaderDeleteFourthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[5]/td[1]/i[2]")
	private static WebElement itemReplenishmentHeaderDeleteFifthRowBtn;	





	@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
	private static WebElement itemReplenishmentHeaderFeildDetailsCaption;   

	@FindBy(xpath="//*[@id='ExtraField_FieldName']")
	private static WebElement itemReplenishmentHeaderFeildDetailsName;  

	@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
	private static WebElement itemReplenishmentHeaderFeildDetailsDatTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
	private static WebElement itemReplenishmentHeaderFeildDetailsDefaultValue;  

	@FindBy(xpath="//*[@id='ExtraField_BannerText']")
	private static WebElement itemReplenishmentHeaderFeildDetailsBannerText;  

	@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
	private static WebElement itemReplenishmentHeaderFeildDetailsMaxSize;  

	@FindBy(xpath="//*[@id='ExtraField_ControlType']")
	private static WebElement itemReplenishmentHeaderFeildDetailsControlTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
	private static WebElement itemReplenishmentHeaderFeildDetailsToolTipText;




	/////Properties<----Body details<-------OtherDetails

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
	private static WebElement   itemReplenishmentHeaderFeildDetailsPropertiesBtn;

	@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
	private static WebElement  itemReplenishmentHeaderFeildDetails_PartOfDeliveryAddressChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_PartOfBillingAddressChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_MandatoryChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_AllowAsParameterChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_HiddenChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_HiddenInGroupChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_SpellCheckChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_MandatoryInGroupChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_AuditTrialChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_NotAvailableForReportsChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_MergeFieldChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_MassUpdateChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_IncludeInQuickCreateChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_CannotBeExportedChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_CannotBeImportedChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_CopyFromParentChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_ReadOnlyChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_InformationFieldChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_IsMandatoryInRevisionChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_AvailableinCustomerPortalChekbox;

	@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_EditableinCustomerPortalChekbox;

	@FindBy(xpath="//*[@id='Behaviour']")
	private static WebElement  itemReplenishmentHeaderFeildDetails_BehaviourDropdown;



	///////Formatting Elements--------------------------------------------------------------------

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
	private static WebElement  itemReplenishmentHeaderFormattingBtn ;




	@FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
	private static WebElement  itemReplenishmentHeaderFormattingColumnSpan ;

	@FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
	private static WebElement  itemReplenishmentHeaderFormattingRowSpan ;

	@FindBy(xpath="//*[@id='CharacterCasing']")
	private static WebElement  itemReplenishmentHeaderFormattingCharacterCasingDropdown ;

	@FindBy(xpath="//*[@id='TextAlign']")
	private static WebElement  itemReplenishmentHeaderFormattingTextAlignDropdown ;

	@FindBy(xpath="//*[@id='FieldsDetails_Font']")
	private static WebElement  itemReplenishmentHeaderFormattingFieldsDetailsFont ;

	@FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
	private static WebElement  itemReplenishmentHeaderFormattingBackColor ;

	@FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
	private static WebElement  itemReplenishmentHeaderFormattingFieldsDetailsFont_Btn ;

	//Elements are used for font edit option pop in field details and rules 

	@FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderFontAreialDropdown ;

	@FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderFontStyleDropdown ;

	@FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderFontWeightDropdown ;

	@FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderFontSizeDropdown ;

	@FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderForeColourDropdown ;

	@FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderBackColorDropdown ;

	@FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderBaselineChekbox ;

	@FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderOverLineChekbox ;

	@FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderStrikeThroughChekbox ;

	@FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderUnderlineChekbox ;

	@FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderEnableFontChekbox ;

	@FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
	private static WebElement  itemReplenishmentHeaderFrontPriveiw ;

	@FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
	private static WebElement  itemReplenishmentHeaderFrontSaveBtn ;

	@FindBy(xpath="//*[@id='myFontControl_IF_Close']")
	private static WebElement  itemReplenishmentHeaderFrontCloseBtn ;

	@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
	private static WebElement  itemReplenishmentHeaderForMatFieldDeatailsOkBtn ;

	@FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
	private static WebElement  itemReplenishmentHeaderForMatFieldDeatailsCanceBtn ;





	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
	private static WebElement  itemReplenishmentHeaderrulesBtn ;

	@FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
	private static WebElement  itemReplenishmentHeaderrulesClickHereAddRuleButtonBtn ;

	@FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesRuleNameDropdown ;

	@FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
	private static WebElement  itemReplenishmentHeaderrulesRuleNameSetingBtn ;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
	private static WebElement  itemReplenishmentHeaderrulesSaveBtn ;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
	private static WebElement  itemReplenishmentHeaderrulesNewBtn ;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
	private static WebElement  itemReplenishmentHeaderrulesDeleteBtn ;

	@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	private static WebElement  itemReplenishmentHeaderrulesCloseBtn ;

	@FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesCreatingGroupChekbox ;

	@FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesNewRecordChekbox ;

	@FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesEditChekbox ;

	@FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesLoadChekbox ;

	@FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesBeforeSaveChekbox ;

	@FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesOnLeaveChekbox ;

	@FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesBeforeDeleteChekbox ;

	@FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesOnEnterChekbox ;

	@FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesActiveChekbox ;

	@FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesNoConditionChekbox;

	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
	private static WebElement  itemReplenishmentHeaderrulesIfBtn ;

	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
	private static WebElement  itemReplenishmentHeaderrulesElseBtn ;




	// if 

	@FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIfSelectFieldDropdown ;

	@FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIfOPerationTypeDropdown ;

	@FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIfCompareTypeDropdown;          //Value,Field,Formula---Related

	@FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIfValueType;

	@FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIfConnterDropdown;          //Only,And,Or--RelatedDD



	//IF **** Formatting

	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
	private static WebElement  itemReplenishmentHeaderrulesIFFormatting ;

	@FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridFieldName ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridChangeValue ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridField ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridValue ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridCaption ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridRegularExpression ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridErrorMesage ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridBannerText ;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridToolTip;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridMandatoryChekbox;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridHiddenChekbox;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridDisableChekbox;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridSpellCheckChekbox;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridAligementDropdown;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridCharacterCasting;

	@FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
	private static WebElement  itemReplenishmentHeaderrulesIFFormattingGridSelectFont;


	/// done


	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
	private static WebElement  itemReplenishmentHeaderrulesIFMessage ;


	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
	private static WebElement  itemReplenishmentHeaderrulesIFMessagesInformationRadioBtn;

	@FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIFMessagesGeneralInformation;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
	private static WebElement  itemReplenishmentHeaderrulesIFMessagesWarnAndProceddRadioBtn;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
	private static WebElement  itemReplenishmentHeaderrulesIFMessagesWarnAndStopRadioBtn;

	@FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertMessage;

	@FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIFCustmizeTemplateDropdown;

	///// IF ****Alerts-----Grid Elements

	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
	private static WebElement  itemReplenishmentHeaderrulesIFAlert ;


	@FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIfAlertMessage;

	@FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIfCustmizeTemplateDropdown;




	@FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertsGridTypeDropdown;

	@FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertsGridToWhomDropdown;

	@FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertsGridSmsDropdown;

	@FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertsGridEmail;

	@FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertsGridDashBoardDropdown;

	@FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertsGridPopDropdown;

	@FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertsGridGTalkDropdown;

	@FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertsGridSendSpecficMessageDropdown;

	@FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesIFAlertsGridSpecificMessage;

	// alert over

	///////Grid Elements------Formatting------Else Module

	@FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
	private static WebElement  itemReplenishmentHeaderrulesElseFormatting ;

	@FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridFieldName ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridChangeValue ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridField ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridValue ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridCaption ;

	@FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridRegularExpression ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridErrorMesage ;

	@FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridBannerText ;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridToolTip;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridMandatoryChekbox;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridHiddenChekbox;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridDisableChekbox;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridSpellCheckChekbox;

	@FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridAligementDropdown;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridCharacterCasting;

	@FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
	private static WebElement  itemReplenishmentHeaderrulesElseFormattingGridSelectFont;


	// else message

	@FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
	private static WebElement  itemReplenishmentHeaderrulesElsetMessage ;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
	private static WebElement  itemReplenishmentHeaderrulesElseMessagesInformationRadioBtn;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
	private static WebElement  itemReplenishmentHeaderrulesElseMessagesGeneralMessage;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
	private static WebElement  itemReplenishmentHeaderrulesElseMessagesWarnAndProceddRadioBtn;

	@FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
	private static WebElement  itemReplenishmentHeaderrulesElseMessagesWarnAndStopRadioBtn;






	/////  Else*****Alerts-----Grid Elements


	@FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
	private static WebElement  itemReplenishmentHeaderrulesElseAlert ;


	@FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertMessage;

	@FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
	private static WebElement  itemReplenishmentHeaderrulesElseCustmizeTemplateDropdown;



	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsGridTypeDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsGridToWhomDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsGridSmsDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsGridEmail;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsGridDashBoardDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsGridPopDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsGridGTalkDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsGridSendSpecficMessageDropdown;

	@FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsGridSpecificMessage;


	// Alert over


	// Header

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsSaveBtn;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsNewBtn;

	@FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsDeleteBtn;

	@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	private static WebElement  itemReplenishmentHeaderrulesElseAlertsCloseBtn;


	// General Main *** External modules

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
	private static WebElement  itemReplenishmentHeaderExternalModules;			     

	@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
	private static WebElement  itemReplenishmentHeaderExternalModulesOnEventDropdown;	

	@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
	private static WebElement  itemReplenishmentHeaderExternalModulesButtonCaption;

	@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
	private static WebElement  itemReplenishmentHeaderExternalModules_ModuleTypeBtn;

	@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
	private static WebElement  itemReplenishmentHeaderExternalModules_ModuleNameDropdown;

	@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
	private static WebElement  itemReplenishmentHeaderExternalModulesClassNameDropdown;

	@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
	private static WebElement  itemReplenishmentHeaderExternalModulesFuctionalNameDropdown;

	@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
	private static WebElement  itemReplenishmentHeaderExternalModulesAvabileInDropdown;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
	private static WebElement  itemReplenishmentHeaderExternalModulesUpdateBtn;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
	private static WebElement  itemReplenishmentHeaderExternalModulesSaveBtn;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
	private static WebElement  itemReplenishmentHeaderExternalModulesEditBtn;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
	private static WebElement  itemReplenishmentHeaderExternalModulesDeleteBtn;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement  itemReplenishmentHeaderExternalModulesCloseBtn;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
	private static WebElement  itemReplenishmentHeaderOkBtn;		     
	     
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement  itemReplenishmentHeaderCancelBtn;	


	/////////////////Item------CustomizeMaster-----Replenishment----Body Details


	@FindBy(xpath="//*[@id='tabId_75']/ul/li[2]/a/span")
	private static WebElement masterFielditemReplenishmentBodyDetailsTab;

	/////Edit   Elements***********************************************************





	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[1]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditFirstRowBtn;						
		
	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[2]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditSecondRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[3]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditThirdRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[4]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditFourthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[5]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditFifthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[6]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditSixthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[7]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditSeventhRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[8]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditEightRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[9]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditNineRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[10]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyTenFirstRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[11]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditElevenRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[12]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditTwleveRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[13]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditThirteenRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[14]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditFourteenRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[15]/td[1]/i[1]")
	private static WebElement     Replenishment_BodyEditFifteenRowBtn;	



	/////////////////////Delete ELements------------------------------------------

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[1]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteFirstRowBtn;						

	@FindBy(xpath="//*[@id='BodyDetails_']/div/div/table/tbody/tr[2]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteSecondRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[3]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteThirdRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[4]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteFourthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[5]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteFifthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[6]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteSixthRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[7]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteSeventhRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[8]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteEightRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[9]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteNineRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[10]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyTenRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[11]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteElevenRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[12]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteTweleveRowBtn;	
	 
	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[13]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteThirteenRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[14]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteFourteenRowBtn;	

	@FindBy(xpath="//*[@id='BodyDetails_5']/div/div/table/tbody/tr[15]/td[1]/i[2]")
	private static WebElement     Replenishment_BodyDeleteFifteenRowBtn;	
	 
	 
	 
	@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
	private static WebElement itemReplenishmnentBodyFieldDeatilsCaption;   

	@FindBy(xpath="//*[@id='ExtraField_FieldName']")
	private static WebElement itemReplenishmnentBodyFieldDeatilsName;  

	@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
	private static WebElement itemReplenishmnentBodyFieldDeatilsDatTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
	private static WebElement itemReplenishmnentBodyFieldDeatilsDefaultValue;  

	@FindBy(xpath="//*[@id='ExtraField_BannerText']")
	private static WebElement itemReplenishmnentBodyFieldDeatilsBannerText;  

	@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
	private static WebElement itemReplenishmnentBodyFieldDeatilsMaxSize;  

	@FindBy(xpath="//*[@id='ExtraField_ControlType']")
	private static WebElement itemReplenishmnentBodyFieldDeatilsControlTypeDropdown;  

	@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
	private static WebElement itemReplenishmnentBodyFieldDeatilsToolTipText;

	@FindBy(xpath="//*[@id='ExtraField_IncludeGroups']")
	private static WebElement itemReplenishmentBody_InclideGroupDropdown;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink']")
	private static WebElement itemReplenishmentBody_MasterToLinkDropdown;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_image']/span")
	private static WebElement itemReplenishmentBody_MasterToLinkExpansionBtn;

	@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_settings']/span")
	private static WebElement itemReplenishmentBody_MasterToLinkSettingBtn;


	     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_container']")
	     private static WebElement itemReplenishment_MasterToLink_Expansion_SCaptionText;

	////////////*****************pop
			     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[1]")
			     private static WebElement itemReplenishment_MasterToLink_StandardFieldsBtn;
			
						     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_list']")
						     private static WebElement itemReplenishment_MasterToLink_StandardField_FieldDropdown;
						
						     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_header']")
						     private static WebElement itemReplenishment_MasterToLink_StandardField_HeaderText;
						
						     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_alignment']")
						     private static WebElement itemReplenishment_MasterToLink_StandardField_AlignmentDropdown;
						
						     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_width']")
						     private static WebElement itemReplenishment_MasterToLink_StandardField_WidthText;
						
						     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
						     private static WebElement itemReplenishment_MasterToLink_StandardField_OkBtn;
						
						     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
						     private static WebElement itemReplenishment_MasterToLink_StandardField_CanceBtn;
			
						     
			    @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[2]")
				private static WebElement itemReplenishment_MasterToLink_DeleteColoumnBtn;
			   
			    @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
				private static WebElement itemReplenishment_MasterToLink_OkBtn;
			   
			    @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
				private static WebElement itemReplenishment_MasterToLink_CancelBtn;
			
			   
	@FindBy(xpath="//*[@id='ExtraField_MandatoryFields']")
	private static WebElement itemReplenishmentBody_MandatoryFieldsText;

	////Grid Filter Criteria-----First Row

	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-1']/span")
	    private static WebElement itemReplenishmentBody_FilterDeleteFirstColoumn;
	    
	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-2']")
	    private static WebElement itemReplenishmentBody_FilterFirstOnColoumnDropdown;

	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-3']")
	    private static WebElement itemReplenishmentBody_FilterFirstOperator;

	    @FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_1-4;]")
	    private static WebElement itemReplenishmentBody_FilterFirstCompareWith;

	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-5']")
	    private static WebElement itemReplenishmentBody_FilterFirstFilterValueAndFiled;

	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-6']")
	    private static WebElement itemReplenishmentBody_FilterFirstLinkFlied;
	    
	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-7']")
	    private static WebElement itemReplenishmentBody_FilterFirstConjuction;

	    
	    
	    ////Grid Filter Criteria-----Second Row
	    
	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-1']/span")
	    private static WebElement itemReplenishmentBody_FilterDeleteSecondColoumn;
	    
	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-2']")
	    private static WebElement itemReplenishmentBody_FilterSecondFilterOnColoumnDropdown;

	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-3']")
	    private static WebElement itemReplenishmentBody_FilterSecondOperator;

	    @FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_2-4;]")
	    private static WebElement itemReplenishmentBody_FilterSecondCompareWith;

	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-5']")
	    private static WebElement itemReplenishmentBody_FilterSecondFilterValueAndFiled;

	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-6']")
	    private static WebElement itemReplenishmentBody_FilterSecondLinkFlied;
	    
	    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-7']")
	    private static WebElement itemReplenishmentBody_FilterSecondConjuction;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
	private static WebElement itemReplenishmentBody_FeildDetailsOkBtn;
	    
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement itemReplenishmentBody_FeildDetailsCancelBtn;
	    
	  

		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
		private static WebElement itemReplenishmentBody_PropertiesBtn;		     
				     
							@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
							private static WebElement itemReplenishmentBody_Properties_PartOfDeliveryAddressCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
							private static WebElement itemReplenishmentBody_Properties_PartOfBillingAddresCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
							private static WebElement itemReplenishmentBody_Properties_MandatoryCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
							private static WebElement itemReplenishmentBody_Properties_AllowAsParameterCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
							private static WebElement itemReplenishmentBody_Properties_HiddenCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
							private static WebElement itemReplenishmentBody_Properties_HiddenInGroupCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
							private static WebElement itemReplenishmentBody_Properties_SpellCheckCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
							private static WebElement itemReplenishmentBody_Properties_MandatoryInGroupCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
							private static WebElement itemReplenishmentBody_Properties_AuditTrialCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
							private static WebElement itemReplenishmentBody_Properties_NotAvailableForReportCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
							private static WebElement itemReplenishmentBody_Properties_MergeFieldCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
							private static WebElement itemReplenishmentBody_Properties_MassUpdateCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
							private static WebElement itemReplenishmentBody_Properties_IncludeInQuickCreateCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
							private static WebElement itemReplenishmentBody_Properties_CannotBeExportedCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
							private static WebElement itemReplenishmentBody_Properties_CannotBeImportedCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
							private static WebElement itemReplenishmentBody_Properties_CopyFromParentCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
							private static WebElement itemReplenishmentBody_Properties_ReadOnlyCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
							private static WebElement itemReplenishmentBody_Properties_InformationFieldCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
							private static WebElement itemReplenishmentBody_Properties_IsMandatoryInRevisionCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
							private static WebElement itemReplenishmentBody_Properties_AvailableinCustomerPortalCheckbox;
							
							@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
							private static WebElement itemReplenishmentBody_Properties_EditableinCustomerPortalCheckbox;
							
							@FindBy(xpath="//*[@id='Behaviour']")
							private static WebElement itemReplenishmentBody_Properties_BehaviourDropdown;




	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
	private static WebElement  ItemReplenishmentBodyFormattingBtn ;

	   @FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
		private static WebElement itemReplenishmentBody_FormattingColumnSpan ;
	   
	   @FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
		private static WebElement itemReplenishmentBody_FormattingRowSpan ;
	   
	   @FindBy(xpath="//*[@id='CharacterCasing']")
		private static WebElement itemReplenishmentBody_FormattingCharacterCasingDropdown ;
	   
	   @FindBy(xpath="//*[@id='TextAlign']")
		private static WebElement itemReplenishmentBody_FormattingTextAlignDropdown;
	   
	   @FindBy(xpath="//*[@id='FieldsDetails_Font']")
		private static WebElement itemReplenishmentBody_FormattingFieldsDetailsFont ;
	   
	   @FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
	   private static WebElement itemReplenishmentBody_FormattingBackColor ;
	   
	   @FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
		private static WebElement itemReplenishmentBody_FormattingFieldsDetailsFont_Btn ;
	   
	   //Elements are used for font edit option pop in field details and rules 
	   
				        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_FontAreialDropdown ;
				        
				        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_FontStyleDropdown;
				        
				        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_FontWeightDropdown;

				        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_FontSizeDropdown;
				        
				        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_ForeColourDropdown ;
				        
				        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_BackColorDropdown ;
				        
				        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_BaselineCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_OverLineCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_StrikeThroughCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_UnderlineCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_EnableFontCheckbox;
				        
				        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
						private static WebElement itemReplenishmentBody_FrontPriveiw ;
				        
				        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
						private static WebElement itemReplenishmentBody_FrontSaveBtn ;
				        
				        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
						private static WebElement itemReplenishmentBody_FrontCloseBtn ;
				        
				    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
				    private static WebElement itemReplenishmentBody_ForMatFieldDeatailsOkBtn ;
				        
				    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
				    private static WebElement itemReplenishmentBody_ForMatFieldDeatailsCanceBtn ;
						
				    

		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
		private static WebElement itemReplenishmentBody_rulesBtn ;
	   
			        @FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
					private static WebElement itemReplenishmentBody_rulesClickHereAddRuleButtonBtn ;
			        
				        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesRuleNameDropdown;
				        
				        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
						private static WebElement itemReplenishmentBody_rulesRuleNameSetingBtn ;
				        
				        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
						private static WebElement itemReplenishmentBody_rulesSaveBtn ;
				        
				        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
						private static WebElement itemReplenishmentBody_rulesNewBtn ;
				        
				        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
						private static WebElement itemReplenishmentBody_rulesDeleteBtn ;
				        
				        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
						private static WebElement itemReplenishmentBody_rulesCloseBtn ;
				        
				        @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesCreatingGroupCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesNewRecordCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesEditCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesBeforeSaveCheckbox ;
				        
				        @FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesOnLeaveCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesBeforeDeleteCheckbox ;
				        
				        @FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesOnEnterCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesActiveCheckbox;
				        
				        @FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
						private static WebElement itemReplenishmentBody_rulesNoConditionCheckbox;
				        
				        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
				        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
				        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
						private static WebElement itemReplenishmentBody_rulesIfBtn ;
				        
				        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
				        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
				        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
						private static WebElement itemReplenishmentBody_rulesElseBtn ;
				        

				        // if 
				       	
				           @FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIfSelectFieldDropdown ;
				           
				           @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
				           private static WebElement itemReplenishmentBody_rulesIfOPerationTypeDropdown ;
				           
				           @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIfCompareTypeDropdown;          //Value,Field,Formula---Related
				           
				           @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIfValueType;
				           
				           @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIfConnterDropdown;          //Only,And,Or--RelatedDD

				          
				       	
				       	//IF **** Formatting
				       	
				       	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
				       	private static WebElement itemReplenishmentBody_rulesIFFormatting ;
				           
				           @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridFieldName ;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridChangeValue ;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridField ;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridValue ;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
				           private static WebElement itemReplenishmentBody_rulesIFFormattingGridCaption ;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridRegularExpression ;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
				           private static WebElement itemReplenishmentBody_rulesIFFormattingGridErrorMesage ;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridBannerText ;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridToolTip;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridMandatoryChekbox;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridHiddenChekbox;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridDisableChekbox;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
				       	   private static WebElement itemReplenishmentBody_rulesIFFormattingGridSpellCheckChekbox;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
				           private static WebElement itemReplenishmentBody_rulesIFFormattingGridAligementDropdown;
				           
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
				           private static WebElement itemReplenishmentBody_rulesIFFormattingGridCharacterCasting;
				            
				           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
				           private static WebElement itemReplenishmentBody_rulesIFFormattingGridSelectFont;
				           
				           
				           /// done
				         
				           
				           @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
				           private static WebElement itemReplenishmentBody_rulesIFMessage ;
				           
				           
				           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
				       	   private static WebElement itemReplenishmentBody_rulesIFMessagesInformationRadioBtn;
				           
				           @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIFMessagesGeneralInformation;
				           
				           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
				       	   private static WebElement itemReplenishmentBody_rulesIFMessagesWarnAndProceddRadioBtn;
				           
				           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
				       	   private static WebElement itemReplenishmentBody_rulesIFMessagesWarnAndStopRadioBtn;
				           
				           @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertMessage;
				           
				           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIFCustmizeTemplateDropdown;

				           ///// IF ****Alerts-----Grid Elements
				           
				           @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlert ;
				           

				           @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIfAlertMessage;
				        
				           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIfCustmizeTemplateDropdown;
				           
				           
				           
				           
				           @FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertsGridTypeDropdown;
				           
				           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertsGridToWhomDropdown;
				           
				           @FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertsGridSmsDropdown;
				           
				           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertsGridEmail;
				           
				           @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertsGridDashBoardDropdown;
				           
				           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertsGridPopDropdown;
				           
				           @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertsGridGTalkDropdown;
				           
				           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertsGridSendSpecficMessageDropdown;
				           
				           @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesIFAlertsGridSpecificMessage;
				           
				           // alert over
				           
				           ///////Grid Elements------Formatting------Else Module
				           
				           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
				          	private static WebElement itemReplenishmentBody_rulesElseFormatting ;
				           
				           @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridFieldName ;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridChangeValue ;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
				           private static WebElement itemReplenishmentBody_rulesElseFormattingGridField ;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
				           private static WebElement itemReplenishmentBody_rulesElseFormattingGridValue ;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridCaption ;
				        
				           @FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
				           private static WebElement itemReplenishmentBody_rulesElseFormattingGridRegularExpression ;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridErrorMesage ;
				        
				           @FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridBannerText ;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridToolTip;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridMandatoryChekbox;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridHiddenChekbox;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridDisableChekbox;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridSpellCheckChekbox;
				        
				           @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridAligementDropdown;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridCharacterCasting;
				        
				           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
				       	   private static WebElement itemReplenishmentBody_rulesElseFormattingGridSelectFont;
				        

				        // else message
				           
				           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
				          	private static WebElement itemReplenishmentBody_rulesElsetMessage ;
				        
				           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
				       	   private static WebElement itemReplenishmentBody_rulesElseMessagesInformationRadioBtn;
				        
				           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
				           private static WebElement itemReplenishmentBody_rulesElseMessagesGeneralMessage;
				        
				           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
				       	   private static WebElement itemReplenishmentBody_rulesElseMessagesWarnAndProceddRadioBtn;
				        
				           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
				       	   private static WebElement itemReplenishmentBody_rulesElseMessagesWarnAndStopRadioBtn;
				        
				           
				           
				           
				           
				           
				           /////  Else*****Alerts-----Grid Elements
				           
				           
				           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
				          	private static WebElement itemReplenishmentBody_rulesElseAlert ;
				        
				           
				           @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesElseAlertMessage;
				        
				           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
				       	   private static WebElement itemReplenishmentBody_rulesElseCustmizeTemplateDropdown;


				        
				           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
				       	   private static WebElement itemReplenishmentBody_rulesElseAlertsGridTypeDropdown;
				        
				           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
				       	   private static WebElement itemReplenishmentBody_rulesElseAlertsGridToWhomDropdown;
				        
				           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
				       	   private static WebElement itemReplenishmentBody_rulesElseAlertsGridSmsDropdown;
				        
				           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
				       	   private static WebElement itemReplenishmentBody_rulesElseAlertsGridEmail;
				        
				           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
				           private static WebElement itemReplenishmentBody_rulesElseAlertsGridDashBoardDropdown;
				        
				           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
				       	   private static WebElement itemReplenishmentBody_rulesElseAlertsGridPopDropdown;
				        
				          @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
				       	  private static WebElement itemReplenishmentBody_rulesElseAlertsGridGTalkDropdown;
				        
				           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
				       	   private static WebElement itemReplenishmentBody_rulesElseAlertsGridSendSpecficMessageDropdown;
				        
				           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
				           private static WebElement itemReplenishmentBody_rulesElseAlertsGridSpecificMessage;
				            
				           
				           // Alert over
				        
				           
				           // Header
				           
				           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
				       	   private static WebElement itemReplenishmentBody_rulesElseAlertsSaveBtn;
				        
				           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
				           private static WebElement itemReplenishmentBody_rulesElseAlertsNewBtn;
				        
				           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
				           private static WebElement itemReplenishmentBody_rulesElseAlertsDeleteBtn;
				        
				           @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
				       	   private static WebElement itemReplenishmentBody_rulesElseAlertsCloseBtn;
				        
				        
				         // General Main *** External modules
				        
				        
				    		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
				    		private static WebElement itemReplenishmentBody_ExternalModules;			     
				    			     
				    						@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
				    						private static WebElement itemReplenishmentBody_ExternalModulesOnEventDropdown;	
				    						
				    						@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
				    						private static WebElement itemReplenishmentBody_ExternalModulesButtonCaption;
				    						
				    						@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
				    						private static WebElement itemReplenishmentBody_ExternalModules_ModuleTypeBtn;
				    						
				    						@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
				    						private static WebElement itemReplenishmentBody_ExternalModules_ModuleNameDropdown;
				    						
				    						@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
				    						private static WebElement itemReplenishmentBody_ExternalModulesClassNameDropdown;
				    						
				    						@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
				    						private static WebElement itemReplenishmentBody_ExternalModulesFuctionalNameDropdown;
				    						
				    						@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
				    						private static WebElement itemReplenishmentBody_ExternalModulesAvabileInDropdown;
				    						
				    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
				    						private static WebElement itemReplenishmentBody_ExternalModulesUpdateBtn;
				    						
				    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
				    						private static WebElement itemReplenishmentBody_ExternalModulesSaveBtn;
				    						
				    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
				    						private static WebElement itemReplenishmentBody_ExternalModulesEditBtn;
				    						
				    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
				    						private static WebElement itemReplenishmentBody_ExternalModulesDeleteBtn;
				    						
				    						@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
				    						private static WebElement itemReplenishmentBody_ExternalModulesCloseBtn;		  


	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
	private static WebElement  itemReplenishmentBodyOkBtn;		     
				    										     
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement  itemReplenishmentBodyCancelBtn;	
	       


	////////////////Item-----CustomizeMaster-------Reorder


	@FindBy(xpath="//*[@id='masterFields_list']/li[7]/span")
	private static WebElement MasterFieldReorder;

	///Header Elements

	@FindBy(xpath="//*[@id='tabId_76']/ul/li[1]/a/span")
	private static WebElement masterFielditemReorderHeaderDetailsTab;

	@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
	private static WebElement masterFielditemReorderHeaderSaveBtn;

	@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
	private static WebElement masterFielditemReorderHeaderAddBtn;
			     
	@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
	private static WebElement masterFielditemReorderHeaderPreview;
			     
	@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	private static WebElement masterFielditemReorderHeaderCloseBtn;

	///Body Elements

	@FindBy(xpath="//*[@id='tabId_76']/ul/li[2]/a/span")
	private static WebElement masterFielditemReorderBodyDetailsTab;
	 
	@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
	private static WebElement masterFielditemReorderBodySaveBtn;
			     
	@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/div[2]")
	private static WebElement masterFielditemReorderBodyMoveFiledBtn;
			     
	@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
	private static WebElement masterFielditemReorderBodyAddBtn;
			     
	@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
	private static WebElement masterFielditemReorderBodyPreview;
			     
	@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	private static WebElement masterFielditemReorderBodyCloseBtn;




	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[1]/td[1]/i[1]")
	private static WebElement itemreorderBodyFirstRowEditBtn;
		   
		     
	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[2]/td[1]/i[1]")
	private static WebElement itemreorderBodySecondRowEditBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[3]/td[1]/i[1]")
	private static WebElement itemreorderBodyThirdRowEditBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[4]/td[1]/i[1]")
	private static WebElement itemreorderBodyFourthRowEditBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[5]/td[1]/i[1]")
	private static WebElement itemreorderBodyFifthRowEditBtn;


	///Row Delete Elements------->>>>>>>General---HeaderDetails

	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[1]/td[1]/i[2]")
	private static WebElement itemreorderBodyFirstRowDeleteBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[2]/td[1]/i[2]")
	private static WebElement itemreorderBodySecondRowDeleteBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[3]/td[1]/i[2]")
	private static WebElement itemreorderBodyThirdRowDeleteBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[4]/td[1]/i[2]")
	private static WebElement itemreorderBodyFourthRowDeleteBtn;

	@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr[5]/td[1]/i[2]")
	private static WebElement itemreorderBodyFifthRowDeleteBtn;

	     
		 



		@FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
		private static WebElement  itemReorderBodyFieldDeatilsCaption;   

		@FindBy(xpath="//*[@id='ExtraField_FieldName']")
		private static WebElement  itemReorderBodyFieldDeatilsName;  

		@FindBy(xpath="//*[@id='ddlDatatype_ExtraField']")
		private static WebElement  itemReorderBodyFieldDeatilsDatTypeDropdown;  

		@FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
		private static WebElement  itemReorderBodyFieldDeatilsDefaultValue;  

		@FindBy(xpath="//*[@id='ExtraField_BannerText']")
		private static WebElement  itemReorderBodyFieldDeatilsBannerText;  

		@FindBy(xpath="//*[@id='ExtraField_MaxSize']")
		private static WebElement  itemReorderBodyFieldDeatilsMaxSize;  

		@FindBy(xpath="//*[@id='ExtraField_ControlType']")
		private static WebElement  itemReorderBodyFieldDeatilsControlTypeDropdown;  

		@FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
		private static WebElement  itemReorderBodyFieldDeatilsToolTipText;

		@FindBy(xpath="//*[@id='ExtraField_IncludeGroups']")
		private static WebElement  itemReorderBody_InclideGroupDropdown;

		@FindBy(xpath="//*[@id='ExtraField_MasterToLink']")
		private static WebElement  itemReorderBody_MasterToLinkDropdown;

		@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_image']/span")
		private static WebElement  itemReorderBody_MasterToLinkExpansionBtn;

		@FindBy(xpath="//*[@id='ExtraField_MasterToLink_input_settings']/span")
		private static WebElement  itemReorderBody_MasterToLinkSettingBtn;


		     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_container']")
		     private static WebElement itemReorder_MasterToLink_Expansion_SCaptionText;

		////////////*****************pop
				     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[1]")
				     private static WebElement itemReorder_MasterToLink_StandardFieldsBtn;
				
							     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_list']")
							     private static WebElement itemReorder_MasterToLink_StandardField_FieldDropdown;
							
							     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_header']")
							     private static WebElement itemReorder_MasterToLink_StandardField_HeaderText;
							
							     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_alignment']")
							     private static WebElement itemReorder_MasterToLink_StandardField_AlignmentDropdown;
							
							     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_standardfields_width']")
							     private static WebElement itemReorder_MasterToLink_StandardField_WidthText;
							
							     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
							     private static WebElement itemReorder_MasterToLink_StandardField_OkBtn;
							
							     @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
							     private static WebElement itemReorder_MasterToLink_StandardField_CanceBtn;
				
							     
				    @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[2]")
					private static WebElement itemReorder_MasterToLink_DeleteColoumnBtn;
				   
				    @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[3]")
					private static WebElement itemReorder_MasterToLink_OkBtn;
				   
				    @FindBy(xpath="//*[@id='ExtraField_MasterToLink_customize_popup_footer']/div/div/input[4]")
					private static WebElement itemReorder_MasterToLink_CancelBtn;
				
				   
		@FindBy(xpath="//*[@id='ExtraField_MandatoryFields']")
		private static WebElement  itemReorderBody_MandatoryFieldsText;

		////Grid Filter Criteria-----First Row

		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-1']/span")
		    private static WebElement  itemReorderBody_FilterDeleteFirstColoumn;
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-2']")
		    private static WebElement  itemReorderBody_FilterFirstOnColoumnDropdown;

		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-3']")
		    private static WebElement  itemReorderBody_FilterFirstOperator;

		    @FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_1-4;]")
		    private static WebElement  itemReorderBody_FilterFirstCompareWith;

		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-5']")
		    private static WebElement  itemReorderBody_FilterFirstFilterValueAndFiled;

		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-6']")
		    private static WebElement  itemReorderBody_FilterFirstLinkFlied;
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_1-7']")
		    private static WebElement  itemReorderBody_FilterFirstConjuction;

		    
		    
		    ////Grid Filter Criteria-----Second Row
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-1']/span")
		    private static WebElement  itemReorderBody_FilterDeleteSecondColoumn;
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-2']")
		    private static WebElement  itemReorderBody_FilterSecondFilterOnColoumnDropdown;

		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-3']")
		    private static WebElement  itemReorderBody_FilterSecondOperator;

		    @FindBy(xpath="//*[@id=;tblFilterCriteria_MasterField_col_2-4;]")
		    private static WebElement  itemReorderBody_FilterSecondCompareWith;

		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-5']")
		    private static WebElement  itemReorderBody_FilterSecondFilterValueAndFiled;

		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-6']")
		    private static WebElement  itemReorderBody_FilterSecondLinkFlied;
		    
		    @FindBy(xpath="//*[@id='tblFilterCriteria_MasterField_col_2-7']")
		    private static WebElement  itemReorderBody_FilterSecondConjuction;

		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
		private static WebElement  itemReorderBody_FeildDetailsOkBtn;
		    
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
		private static WebElement  itemReorderBody_FeildDetailsCancelBtn;
		    
		  

			@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
			private static WebElement  itemReorderBody_PropertiesBtn;		     
					     
								@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
								private static WebElement  itemReorderBody_Properties_PartOfDeliveryAddressCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
								private static WebElement  itemReorderBody_Properties_PartOfBillingAddresCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
								private static WebElement  itemReorderBody_Properties_MandatoryCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
								private static WebElement  itemReorderBody_Properties_AllowAsParameterCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
								private static WebElement  itemReorderBody_Properties_HiddenCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
								private static WebElement  itemReorderBody_Properties_HiddenInGroupCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
								private static WebElement  itemReorderBody_Properties_SpellCheckCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
								private static WebElement  itemReorderBody_Properties_MandatoryInGroupCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
								private static WebElement  itemReorderBody_Properties_AuditTrialCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
								private static WebElement  itemReorderBody_Properties_NotAvailableForReportCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
								private static WebElement  itemReorderBody_Properties_MergeFieldCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
								private static WebElement  itemReorderBody_Properties_MassUpdateCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
								private static WebElement  itemReorderBody_Properties_IncludeInQuickCreateCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
								private static WebElement  itemReorderBody_Properties_CannotBeExportedCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
								private static WebElement  itemReorderBody_Properties_CannotBeImportedCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
								private static WebElement  itemReorderBody_Properties_CopyFromParentCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
								private static WebElement  itemReorderBody_Properties_ReadOnlyCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
								private static WebElement  itemReorderBody_Properties_InformationFieldCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
								private static WebElement  itemReorderBody_Properties_IsMandatoryInRevisionCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
								private static WebElement  itemReorderBody_Properties_AvailableinCustomerPortalCheckbox;
								
								@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
								private static WebElement  itemReorderBody_Properties_EditableinCustomerPortalCheckbox;
								
								@FindBy(xpath="//*[@id='Behaviour']")
								private static WebElement  itemReorderBody_Properties_BehaviourDropdown;




		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
		private static WebElement  itemReorderHeaderFormattingBtn ;

		   @FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
			private static WebElement  itemReorderBody_FormattingColumnSpan ;
		   
		   @FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
			private static WebElement  itemReorderBody_FormattingRowSpan ;
		   
		   @FindBy(xpath="//*[@id='CharacterCasing']")
			private static WebElement  itemReorderBody_FormattingCharacterCasingDropdown ;
		   
		   @FindBy(xpath="//*[@id='TextAlign']")
			private static WebElement  itemReorderBody_FormattingTextAlignDropdown;
		   
		   @FindBy(xpath="//*[@id='FieldsDetails_Font']")
			private static WebElement  itemReorderBody_FormattingFieldsDetailsFont ;
		   
		   @FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
		   private static WebElement  itemReorderBody_FormattingBackColor ;
		   
		   @FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
			private static WebElement  itemReorderBody_FormattingFieldsDetailsFont_Btn ;
		   
		   //Elements are used for font edit option pop in field details and rules 
		   
					        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_FontAreialDropdown ;
					        
					        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_FontStyleDropdown;
					        
					        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_FontWeightDropdown;

					        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_FontSizeDropdown;
					        
					        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_ForeColourDropdown ;
					        
					        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_BackColorDropdown ;
					        
					        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_BaselineCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_OverLineCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_StrikeThroughCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_UnderlineCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_EnableFontCheckbox;
					        
					        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
							private static WebElement  itemReorderBody_FrontPriveiw ;
					        
					        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
							private static WebElement  itemReorderBody_FrontSaveBtn ;
					        
					        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
							private static WebElement  itemReorderBody_FrontCloseBtn ;
					        
					    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
					    private static WebElement  itemReorderBody_ForMatFieldDeatailsOkBtn ;
					        
					    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
					    private static WebElement  itemReorderBody_ForMatFieldDeatailsCanceBtn ;
							
					    

			@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
			private static WebElement  itemReorderBody_rulesBtn ;
		   
				        @FindBy(xpath="//*[@id='lnkRule_div_FieldRules']/input")
						private static WebElement  itemReorderBody_rulesClickHereAddRuleButtonBtn ;
				        
					        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules']")
							private static WebElement  itemReorderBody_rulesRuleNameDropdown;
					        
					        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
							private static WebElement  itemReorderBody_rulesRuleNameSetingBtn ;
					        
					        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
							private static WebElement  itemReorderBody_rulesSaveBtn ;
					        
					        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
							private static WebElement  itemReorderBody_rulesNewBtn ;
					        
					        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
							private static WebElement  itemReorderBody_rulesDeleteBtn ;
					        
					        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
							private static WebElement  itemReorderBody_rulesCloseBtn ;
					        
					        @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_FieldRules']")
							private static WebElement  itemReorderBody_rulesCreatingGroupCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkNewRecord_Rule_FieldRules']")
							private static WebElement  itemReorderBody_rulesNewRecordCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkEdit_Rule_FieldRules']")
							private static WebElement  itemReorderBody_rulesEditCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkLoad_Rule_FieldRules']")
							private static WebElement  itemReorderBody_rulesCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkBeforeSave_Rule_FieldRules']")
							private static WebElement  itemReorderBody_rulesBeforeSaveCheckbox ;
					        
					        @FindBy(xpath="//*[@id='chkOnLeave_Rule_FieldRules']")
							private static WebElement  itemReorderBody_rulesOnLeaveCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_FieldRules']")
							private static WebElement  itemReorderBody_rulesBeforeDeleteCheckbox ;
					        
					        @FindBy(xpath="//*[@id='chkOnEnter_Rule_FieldRules']")
							private static WebElement  itemReorderBody_rulesOnEnterCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_FieldRules']")
							private static WebElement  itemReorderBody_rulesActiveCheckbox;
					        
					        @FindBy(xpath="//*[@id='chkNoRuleCondition_FieldRules']")
							private static WebElement  itemReorderBody_rulesNoConditionCheckbox;
					        
					        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
					        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
					        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
							private static WebElement  itemReorderBody_rulesIfBtn ;
					        
					        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
					        		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
					        		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
							private static WebElement  itemReorderBody_rulesElseBtn ;
					        

					        // if 
					       	
					           @FindBy(xpath="//*[@id='txtField_RC_1_1_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIfSelectFieldDropdown ;
					           
					           @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIfOPerationTypeDropdown ;
					           
					           @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIfCompareTypeDropdown;          //Value,Field,Formula---Related
					           
					           @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIfValueType;
					           
					           @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIfConnterDropdown;          //Only,And,Or--RelatedDD

					          
					       	
					       	//IF **** Formatting
					       	
					       	@FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[1]/a/span")
					       	private static WebElement  itemReorderBody_rulesIFFormatting ;
					           
					           @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridFieldName ;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-2']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridChangeValue ;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-3']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridField ;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-4']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridValue ;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_1-5']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridCaption ;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-6']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridRegularExpression ;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-7']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridErrorMesage ;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-8']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridBannerText ;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-9']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridToolTip;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-10']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridMandatoryChekbox;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-11']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridHiddenChekbox;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-12']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridDisableChekbox;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-13']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridSpellCheckChekbox;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-14']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridAligementDropdown;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-15']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridCharacterCasting;
					           
					           @FindBy(xpath="//*[@id='tblFormating_IF_Rule_FieldRules_col_3-16']")
					       	private static WebElement  itemReorderBody_rulesIFFormattingGridSelectFont;
					           
					           
					           /// done
					         
					           
					           @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[2]/a/span")
					       	private static WebElement  itemReorderBody_rulesIFMessage ;
					           
					           
					           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[1]/div[2]/label/input")
					       	private static WebElement  itemReorderBody_rulesIFMessagesInformationRadioBtn;
					           
					           @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIFMessagesGeneralInformation;
					           
					           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[2]/div[2]/label/input")
					       	private static WebElement  itemReorderBody_rulesIFMessagesWarnAndProceddRadioBtn;
					           
					           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_FieldRules']/div[3]/div[2]/label/input")
					       	private static WebElement  itemReorderBody_rulesIFMessagesWarnAndStopRadioBtn;
					           
					           @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIFAlertMessage;
					           
					           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIFCustmizeTemplateDropdown;

					           ///// IF ****Alerts-----Grid Elements
					           
					           @FindBy(xpath="//*[@id='Rule_IF_FieldRules']/div[2]/div[1]/ul/li[3]/a/span")
					       	private static WebElement  itemReorderBody_rulesIFAlert ;
					           

					           @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIfAlertMessage;
					        
					           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIfCustmizeTemplateDropdown;
					           
					           
					           
					           
					           @FindBy(xpath="//*[@id='ddlTypeAlert_IF_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIFAlertsGridTypeDropdown;
					           
					           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-2']")
					       	private static WebElement  itemReorderBody_rulesIFAlertsGridToWhomDropdown;
					           
					           @FindBy(xpath="//*[@id='ddlUsersAlert_IF_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIFAlertsGridSmsDropdown;
					           
					           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-4']")
					       	private static WebElement  itemReorderBody_rulesIFAlertsGridEmail;
					           
					           @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIFAlertsGridDashBoardDropdown;
					           
					           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-6']")
					       	private static WebElement  itemReorderBody_rulesIFAlertsGridPopDropdown;
					           
					           @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIFAlertsGridGTalkDropdown;
					           
					           @FindBy(xpath="//*[@id='tblAlert_IF_Rule_FieldRules_col_1-8']")
					       	private static WebElement  itemReorderBody_rulesIFAlertsGridSendSpecficMessageDropdown;
					           
					           @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesIFAlertsGridSpecificMessage;
					           
					           // alert over
					           
					           ///////Grid Elements------Formatting------Else Module
					           
					           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[1]/a/span")
					          	private static WebElement  itemReorderBody_rulesElseFormatting ;
					           
					           @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridFieldName ;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-2']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridChangeValue ;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-3']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridField ;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-4']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridValue ;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-5']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridCaption ;
					        
					           @FindBy(xpath="//*[@id='txtRegExFormat_Else_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridRegularExpression ;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-7']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridErrorMesage ;
					        
					           @FindBy(xpath="//*[@id='txtBannertextFormat_Else_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridBannerText ;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-9']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridToolTip;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-10']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridMandatoryChekbox;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-11']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridHiddenChekbox;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-12']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridDisableChekbox;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-13']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridSpellCheckChekbox;
					        
					           @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridAligementDropdown;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_34-15']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridCharacterCasting;
					        
					           @FindBy(xpath="//*[@id='tblFormating_Else_Rule_FieldRules_col_1-16']")
					       	private static WebElement  itemReorderBody_rulesElseFormattingGridSelectFont;
					        

					        // else message
					           
					           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[2]/a/span")
					          	private static WebElement  itemReorderBody_rulesElsetMessage ;
					        
					           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
					       	private static WebElement  itemReorderBody_rulesElseMessagesInformationRadioBtn;
					        
					           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[1]/div[2]/label/input")
					       	private static WebElement  itemReorderBody_rulesElseMessagesGeneralMessage;
					        
					           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[2]/div[2]/label/input")
					       	private static WebElement  itemReorderBody_rulesElseMessagesWarnAndProceddRadioBtn;
					        
					           @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_FieldRules']/div[3]/div[2]/label/input")
					       	private static WebElement  itemReorderBody_rulesElseMessagesWarnAndStopRadioBtn;
					        
					           
					           
					           
					           
					           
					           /////  Else*****Alerts-----Grid Elements
					           
					           
					           @FindBy(xpath=" //*[@id='Rule_Else_FieldRules']/div/div[1]/ul/li[3]/a/span")
					          	private static WebElement  itemReorderBody_rulesElseAlert ;
					        
					           
					           @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesElseAlertMessage;
					        
					           @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_FieldRules']")
					       	private static WebElement  itemReorderBody_rulesElseCustmizeTemplateDropdown;


					        
					           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-1']")
					       	private static WebElement  itemReorderBody_rulesElseAlertsGridTypeDropdown;
					        
					           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-2']")
					       	private static WebElement  itemReorderBody_rulesElseAlertsGridToWhomDropdown;
					        
					           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-3']")
					       	private static WebElement  itemReorderBody_rulesElseAlertsGridSmsDropdown;
					        
					           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-4']")
					       	private static WebElement  itemReorderBody_rulesElseAlertsGridEmail;
					        
					           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-5']")
					        	private static WebElement  itemReorderBody_rulesElseAlertsGridDashBoardDropdown;
					        
					           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-6']")
					       	private static WebElement  itemReorderBody_rulesElseAlertsGridPopDropdown;
					        
					          @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-7']")
					       	private static WebElement  itemReorderBody_rulesElseAlertsGridGTalkDropdown;
					        
					           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-8']")
					       	private static WebElement  itemReorderBody_rulesElseAlertsGridSendSpecficMessageDropdown;
					        
					           @FindBy(xpath="//*[@id='tblAlert_Else_Rule_FieldRules_col_1-9']")
					       	private static WebElement  itemReorderBody_rulesElseAlertsGridSpecificMessage;
					           
					           
					           // Alert over
					        
					           
					           // Header
					           
					           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[1]")
					       	private static WebElement  itemReorderBody_rulesElseAlertsSaveBtn;
					        
					           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[1]/span")
					       	private static WebElement  itemReorderBody_rulesElseAlertsNewBtn;
					        
					           @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
					       	private static WebElement  itemReorderBody_rulesElseAlertsDeleteBtn;
					        
					           @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
					       	private static WebElement  itemReorderBody_rulesElseAlertsCloseBtn;
					        
					        
					         // General Main *** External modules
					        
					        
					    		@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
					    		private static WebElement  itemReorderBody_ExternalModules;			     
					    			     
					    						@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
					    						private static WebElement  itemReorderBody_ExternalModulesOnEventDropdown;	
					    						
					    						@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
					    						private static WebElement  itemReorderBody_ExternalModulesButtonCaption;
					    						
					    						@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
					    						private static WebElement  itemReorderBody_ExternalModules_ModuleTypeBtn;
					    						
					    						@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
					    						private static WebElement  itemReorderBody_ExternalModules_ModuleNameDropdown;
					    						
					    						@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
					    						private static WebElement  itemReorderBody_ExternalModulesClassNameDropdown;
					    						
					    						@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
					    						private static WebElement  itemReorderBody_ExternalModulesFuctionalNameDropdown;
					    						
					    						@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
					    						private static WebElement  itemReorderBody_ExternalModulesAvabileInDropdown;
					    						
					    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
					    						private static WebElement  itemReorderBody_ExternalModulesUpdateBtn;
					    						
					    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
					    						private static WebElement  itemReorderBody_ExternalModulesSaveBtn;
					    						
					    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
					    						private static WebElement  itemReorderBody_ExternalModulesEditBtn;
					    						
					    						@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
					    						private static WebElement  itemReorderBody_ExternalModulesDeleteBtn;
					    						
					    						@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
					    						private static WebElement  itemReorderBody_ExternalModulesCloseBtn;		  


		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[1]/div[2]")
		private static WebElement  itemReorderBodyOkBtn;		     
					    										     
		@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
		private static WebElement  itemReorderBodyCancelBtn;





	////////Item----Customize master----Outlet----Header Details
		 

	@FindBy(xpath="//*[@id='masterFields_list']/li[8]/span")
	private static WebElement MasterFieldOutletBtn;
	    	
		

	//Header Elements

	@FindBy(xpath="//*[@id='tabId_76']/ul/li[1]/a/span")
	private static WebElement masterFielditemOutletHeaderDetailsTab;

	@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
	private static WebElement masterFielditemOutletHeaderSaveBtn;

	@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
	private static WebElement masterFielditemOutletHeaderAddBtn;
			     
	@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
	private static WebElement masterFielditemOutletHeaderPreview;
			     
	@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	private static WebElement masterFielditemOutletHeaderCloseBtn;	
		


	///Body Elements

		@FindBy(xpath="//*[@id='tabId_76']/ul/li[2]/a/span")
		private static WebElement masterFielditemOutletBodyDetailsTab;
		
		
		//////Edit Option Is Not Working 
		 
		@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[1]/div[2]")
		private static WebElement masterFielditemOutletBodySaveBtn;
				     
		@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/div[2]")
		private static WebElement masterFielditemOutletBodyMoveFiledBtn;
				     
		@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[2]")
		private static WebElement masterFielditemOutletBodyAddBtn;
				     
		@FindBy(xpath="//*[@id='all_TabsField']/div[9]/div[4]/div[2]")
		private static WebElement masterFielditemOutletBodyPreview;
				     
		@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		private static WebElement masterFielditemOutletBodyCloseBtn;

			     
		
	////////////////////Item----Customize Master--------Unique Constraints	
		
	  @FindBy(xpath="//*[@id='allMasterCustTabs']/li[2]/span")
	  private static WebElement TabUniqueConstraints;
			     
				 @FindBy(xpath="//*[@id='tabContent_UConstraints_MasterCust']/div[1]/div/div[1]/div[1]")
				 private static WebElement UniqueConstraintsAddBtn;
						     
				 @FindBy(xpath="//*[@id='tabContent_UConstraints_MasterCust']/div[1]/div/div[2]/div[2]")
				 private static WebElement UniqueConstraintsDeleteBtn;
						     
						     
				 @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
				 private static WebElement UniqueConstraintsCloseBtn;
						     
						     
				 @FindBy(xpath="//*[@id='txtConstraintName']")
				 private static WebElement UniqueConstraints_ConstraintNameText;
						     
				 @FindBy(xpath="//*[@id='txtConstraintName_input_image']/span")
				 private static WebElement UniqueConstraints_ConstraintNameExpansionBtn;
						     
				 @FindBy(xpath="//*[@id='txtConstraintName_input_settings']/span")
				 private static WebElement UniqueConstraints_ConstraintNameSettingBtn;
						     
						 @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_heading']")
						 private static WebElement UniqueConstraints_CustomizeDisplayColoumnPopLabel;
								     
						 @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_container']")
						 private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_NameText;
								     
					     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[1]")
						 private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_StandaredFieldBtn;
								     
												     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_heading']")
												     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributesLabel;
												     
												     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_standardfields_list']")
												     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_FeildDropdown;
												     
												     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_standardfields_header']")
												     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_HeadereText;
												     
												     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_standardfields_alignment']")
												     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_AlignmentDropdown;
												     
												     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_standardfields_width']")
												     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_Widthtext;
												     
												     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[3]")
												     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_OkBtn;
												     
												     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[4]")
												     private static WebElement UniqueConstraintsPop_StandaredField_ColumnAttributes_CancelBtn;
												     
								     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[2]")
								     private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_DeleteColoumnBtn;
								     
								     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[3]")
								     private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_OkBtn;
								     
								     @FindBy(xpath="//*[@id='txtConstraintName_customize_popup_footer']/div/div/input[4]")
								     private static WebElement UniqueConstraints_CustomizeDisplayColoumnPop_CancelBtn;
						     
						     @FindBy(xpath="//*[@id='ddlConstraintTabList']")
						     private static WebElement UniqueConstraints_TabsDropdown;
						     
						     
						     /////Main 
						     
						     @FindBy(xpath="//*[@id='tab_Main_UcFields']/i")
						     private static WebElement UniqueConstraints_MainExpansionBtn;
						     
						     
						   
						     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[1]/label/input")
						     private static WebElement UniqueConstraints_Main_NameChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[2]/label/input")
						     private static WebElement UniqueConstraints_Main_CodeChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[3]/label/input")
						     private static WebElement UniqueConstraints_Main_ItemTypeChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[4]/label/input")
						     private static WebElement UniqueConstraints_Main_RorderLevelChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[5]/label/input")
						     private static WebElement UniqueConstraints_Main_BinCapacityChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_MainFields_2']/div[6]/label/input")
						     private static WebElement UniqueConstraints_Main_ValuationMethodChekbox;
						     
						     
						     
						     ///Header
						     
						     @FindBy(xpath="//*[@id='tab_Header_UcFields']/i")
						     private static WebElement UniqueConstraints_HeaderExpansionBtn;
						     
						     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[1]/label/input")
						     private static WebElement UniqueConstraints_Header_CategoryChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[2]/label/input")
						     private static WebElement UniqueConstraints_Header_PrinterChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[3]/label/input")
						     private static WebElement UniqueConstraints_Header_AlternateCategoryChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[4]/label/input")
						     private static WebElement UniqueConstraints_Header_DescriptionChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[5]/label/input")
						     private static WebElement UniqueConstraints_Header_PerishableItemChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[6]/label/input")
						     private static WebElement UniqueConstraints_Header_BinChekbox;
						     
						     @FindBy(xpath="//*[@id='chkList_HeaderFields_2']/div[7]/label/input")
						     private static WebElement UniqueConstraints_Header_ImageChekbox;
						     
						     
						     //////Body
						     
						     
						     @FindBy(xpath="//*[@id='tab_Body_UcFields']/i")
						     private static WebElement UniqueConstraints_BodyExpansionBtn;
						     
						   
						     
		///////////Master Field ----Rules*/************************************************************				     
			     
		@FindBy(xpath="//*[@id='allMasterCustTabs']/li[3]/span")
	    private static WebElement TabRules;		     
			     

		 @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[1]/div[2]")
		 private static WebElement itemRules_SaveBtn ;
	     
	     @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[2]/div[2]")
	     private static WebElement itemRules_NewBtn ;
	     
	     @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[3]/div[2]")
		 private static WebElement itemRules_DeleteBtn ;
	     
	     @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		 private static WebElement itemRules_CloseBtn ;



	    @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules']")
		private static WebElement Rules_RuleNameText ;
	   
	    @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_input_image']/span")
		private static WebElement Rules_RuleNameExpansionBtn ;
	   
	    @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_input_settings']/span")
		private static WebElement Rules_RuleNameSettingBtn ;
	    
	    @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_heading']")
		private static WebElement Rules_RuleName_CustomizeDisplayColoumnPopLabel;
				     
				 @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_container']")
				 private static WebElement itemRules_RuleName_CustomizeDisplayColoumnPop_NameText;
						     
			     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_footer']/div/div/input[1]")
				 private static WebElement itemRules_RuleName_CustomizeDisplayColoumnPop_StandaredFieldBtn;
						     
										     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_heading']")
										     private static WebElement itemRules_RuleNamePop_StandaredField_ColumnAttributesLabel;
										     
										     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_standardfields_list']")
										     private static WebElement itemRules_RuleNamePop_StandaredField_ColumnAttributes_FeildDropdown;
										     
										     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_standardfields_header']")
										     private static WebElement itemRules_RuleNamePop_StandaredField_ColumnAttributes_HeadereText;
										     
										     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_standardfields_alignment']")
										     private static WebElement itemRules_RuleNamePop_StandaredField_ColumnAttributes_AlignmentDropdown;
										     
										     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_standardfields_width']")
										     private static WebElement itemRules_RuleNamePop_StandaredField_ColumnAttributes_Widthtext;
										     
										     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_footer']/div/div/input[3]")
										     private static WebElement itemRules_RuleNamePop_StandaredField_ColumnAttributes_OkBtn;
										     
										     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_footer']/div/div/input[4]")
										     private static WebElement itemRules_RuleNamePop_StandaredField_ColumnAttributes_CancelBtn;
										     
						     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_footer']/div/div/input[2]")
						     private static WebElement itemRules_RuleName_CustomizeDisplayColoumnPop_DeleteColoumnBtn;
						     
						     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_footer']/div/div/input[3]")
						     private static WebElement itemRules_RuleName_CustomizeDisplayColoumnPop_OkBtn;
						     
						     @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules_customize_popup_footer']/div/div/input[4]")
						     private static WebElement itemRules_RuleName_CustomizeDisplayColoumnPop_CancelBtn;
						

	    @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_MasterRules']")
		private static WebElement itemRules_CreatingGroupChekbox ;
	   
	    @FindBy(xpath="//*[@id='chkNewRecord_Rule_MasterRules']")
		private static WebElement itemRules_NewRecordChekbox ;
	   
	    @FindBy(xpath="//*[@id='chkEdit_Rule_MasterRules']")
		private static WebElement itemRules_EditChekbox ;
	   
	   @FindBy(xpath="//*[@id='chkLoad_Rule_MasterRules']")
		private static WebElement itemRules_LoadChekbox ;
	   
	   @FindBy(xpath="//*[@id='chkBeforeSave_Rule_MasterRules']")
		private static WebElement itemRules_BeforeSaveChekbox ;
	   
	   @FindBy(xpath="//*[@id='chkOnLeave_Rule_MasterRules']")
		private static WebElement itemRules_OnLeaveChekbox ;
	   
	   @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_MasterRules']")
		private static WebElement itemRules_BeforeDeleteChekbox ;
	   
	   @FindBy(xpath="//*[@id='chkOnEnter_Rule_MasterRules']")
		private static WebElement itemRules_OnEnterChekbox ;
	   
	   @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_MasterRules']")
		private static WebElement itemRules_ActiveChekbox ;
	   
	   @FindBy(xpath="//*[@id='chkNoRuleCondition_MasterRules']")
		private static WebElement itemRules_NoConditionChekbox;
	   
	   @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
	   		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
	   		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a/span")
		private static WebElement itemRules_IfBtn ;
	   
	   @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]"
	   		+ "/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]"
	   		+ "/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/i")
		private static WebElement itemRules_ElseBtn ;
	   
	   
	   
	   
	// if 
	               
	   
	   @FindBy(xpath="//*[@id='txtField_RC_1_1_MasterRules']")
		private static WebElement itemRules_IfSelectFieldDropdown ;
	   
	   @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_MasterRules']")
		private static WebElement itemRules_IfOPerationTypeDropdown ;
	   
	   @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_MasterRules']")
		private static WebElement itemRules_IfCompareTypeDropdown;          //Value,Field,Formula---Related
	   
	   @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_MasterRules']")
		private static WebElement itemRules_IfValueType;
	   
	   @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_MasterRules]")
		private static WebElement itemRules_IfConnterDropdown;          //Only,And,Or--RelatedDD

	  
		
		//IF **** Formatting
		
		@FindBy(xpath="//*[@id='Rule_IF_MasterRules']/div[2]/div[1]/ul/li[1]/a/span")
		private static WebElement itemRules_IFFormatting ;
	   
	   @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_MasterRules']")
		private static WebElement itemRules_IFFormattingGridFieldName ;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_1-2']")
		private static WebElement itemRules_IFFormattingGridChangeValue ;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_1-3']")
		private static WebElement itemRules_IFFormattingGridField ;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRule_col_1-4']")
		private static WebElement itemRules_IFFormattingGridValue ;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRule_col_1-5']")
		private static WebElement itemRules_IFFormattingGridCaption ;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRule_col_3-6']")
		private static WebElement itemRules_IFFormattingGridRegularExpression ;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRule_col_3-7']")
		private static WebElement itemRules_IFFormattingGridErrorMesage ;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRule_col_3-8']")
		private static WebElement itemRules_IFFormattingGridBannerText ;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_3-9']")
		private static WebElement itemRules_IFFormattingGridToolTip;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_3-10']")
		private static WebElement itemRules_IFFormattingGridMandatoryChekbox;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_3-11']")
		private static WebElement itemRules_IFFormattingGridHiddenChekbox;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_3-12']")
		private static WebElement itemRules_IFFormattingGridDisableChekbox;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_3-13']")
		private static WebElement itemRules_IFFormattingGridSpellCheckChekbox;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_3-14']")
		private static WebElement itemRules_IFFormattingGridAligementDropdown;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_3-15']")
		private static WebElement itemRules_IFFormattingGridCharacterCasting;
	   
	   @FindBy(xpath="//*[@id='tblFormating_IF_Rule_MasterRules_col_3-16']")
		private static WebElement itemRules_IFFormattingGridSelectFont;
	   
	   
	   /// done
	 
	   
	   @FindBy(xpath="//*[@id='Rule_IF_MasterRules']/div[2]/div[1]/ul/li[2]/a/span")
		private static WebElement itemRules_IFMessage ;
	   
	   
	   @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_MasterRules']/div[1]/div[2]/label/input")
		private static WebElement itemRules_IFMessagesInformationRadioBtn;
	   
	   @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_MasterRules']")
		private static WebElement itemRules_IFMessagesGeneralInformation;
	   
	   @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_MasterRules']/div[2]/div[2]/label/input")
		private static WebElement itemRules_IFMessagesWarnAndProceddRadioBtn;
	   
	   @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_MasterRules']/div[3]/div[2]/label/input")
		private static WebElement itemRules_IFMessagesWarnAndStopRadioBtn;
	   
	   @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_MasterRules']")
		private static WebElement itemRules_IFAlertMessage;
	   
	   @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_MasterRules']")
		private static WebElement itemRules_IFCustmizeTemplateDropdown;

	   ///// IF ****Alerts-----Grid Elements
	   
	   @FindBy(xpath="//*[@id='Rule_IF_MasterRules']/div[2]/div[1]/ul/li[3]/a/span")
		private static WebElement itemRules_IFAlert ;
	   

	   @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_MasterRules']")
		private static WebElement itemRules_IfAlertMessage;

	   @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_MasterRules']")
		private static WebElement itemRules_IfCustmizeTemplateDropdown;
	   
	   
	   
	   
	   @FindBy(xpath="//*[@id='ddlTypeAlert_IF_MasterRules']")
		private static WebElement itemRules_IFAlertsGridTypeDropdown;
	   
	   @FindBy(xpath="//*[@id='tblAlert_IF_Rule_MasterRules_col_1-2']")
		private static WebElement itemRules_IFAlertsGridToWhomDropdown;
	   
	   @FindBy(xpath="//*[@id='ddlUsersAlert_IF_MasterRules']")
		private static WebElement itemRules_IFAlertsGridSmsDropdown;
	   
	   @FindBy(xpath="//*[@id='tblAlert_IF_Rule_MasterRules_col_1-4']")
		private static WebElement itemRules_IFAlertsGridEmail;
	   
	   @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_MasterRules']")
		private static WebElement itemRules_IFAlertsGridDashBoardDropdown;
	   
	   @FindBy(xpath="//*[@id='tblAlert_IF_Rule_MasterRules_col_1-6']")
		private static WebElement itemRules_IFAlertsGridPopDropdown;
	   
	   @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_MasterRules']")
		private static WebElement itemRules_IFAlertsGridGTalkDropdown;
	   
	   @FindBy(xpath="//*[@id='tblAlert_IF_Rule_MasterRules_col_1-8']")
		private static WebElement itemRules_IFAlertsGridSendSpecficMessageDropdown;
	   
	   @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_MasterRules']")
		private static WebElement itemRules_IFAlertsGridSpecificMessage;
	   
	   // alert over
	   
	   ///////Grid Elements------Formatting------Else Module
	   
	   @FindBy(xpath=" //*[@id='Rule_Else_MasterRules']/div/div[1]/ul/li[1]/a/span")
	  	private static WebElement itemRules_ElseFormatting ;
	   
	   @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_MasterRules']")
		private static WebElement itemRules_ElseFormattingGridFieldName ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-2']")
		private static WebElement itemRules_ElseFormattingGridChangeValue ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-3']")
		private static WebElement itemRules_ElseFormattingGridField ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-4']")
		private static WebElement itemRules_ElseFormattingGridValue ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-5']")
		private static WebElement itemRules_ElseFormattingGridCaption ;

	   @FindBy(xpath="//*[@id='txtRegExFormat_Else_MasterRules']")
		private static WebElement itemRules_ElseFormattingGridRegularExpression ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-7']")
		private static WebElement itemRules_ElseFormattingGridErrorMesage ;

	   @FindBy(xpath="//*[@id='txtBannertextFormat_Else_MasterRules']")
		private static WebElement itemRules_ElseFormattingGridBannerText ;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_34-9']")
		private static WebElement itemRules_ElseFormattingGridToolTip;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_34-10']")
		private static WebElement itemRules_ElseFormattingGridMandatoryChekbox;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_34-11']")
		private static WebElement itemRules_ElseFormattingGridHiddenChekbox;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_34-12']")
		private static WebElement itemRules_ElseFormattingGridDisableChekbox;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_34-13']")
		private static WebElement itemRules_ElseFormattingGridSpellCheckChekbox;

	   @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_MasterRules']")
		private static WebElement itemRules_ElseFormattingGridAligementDropdown;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_34-15']")
		private static WebElement itemRules_ElseFormattingGridCharacterCasting;

	   @FindBy(xpath="//*[@id='tblFormating_Else_Rule_MasterRules_col_1-16']")
		private static WebElement itemRules_ElseFormattingGridSelectFont;


	// else message
	   
	   @FindBy(xpath=" //*[@id='Rule_Else_MasterRules']/div/div[1]/ul/li[2]/a/span")
	  	private static WebElement itemRules_ElsetMessage ;

	   @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_MasterRules']/div[1]/div[2]/label/input")
		private static WebElement itemRules_ElseMessagesInformationRadioBtn;

	   @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_MasterRules']/div[1]/div[2]/label/input")
		private static WebElement itemRules_ElseMessagesGeneralMessage;

	   @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_MasterRules']/div[2]/div[2]/label/input")
		private static WebElement itemRules_ElseMessagesWarnAndProceddRadioBtn;

	   @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_MasterRules']/div[3]/div[2]/label/input")
		private static WebElement itemRules_ElseMessagesWarnAndStopRadioBtn;

	   
	   
	   
	   
	   
	   /////  Else*****Alerts-----Grid Elements
	   
	   
	   @FindBy(xpath=" //*[@id='Rule_Else_MasterRules']/div/div[1]/ul/li[3]/a/span")
	  	private static WebElement itemRules_ElseAlert ;

	   
	   @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_MasterRules']")
		private static WebElement itemRules_ElseAlertMessage;

	   @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_MasterRules']")
		private static WebElement itemRules_ElseCustmizeTemplateDropdown;



	   @FindBy(xpath="//*[@id='tblAlert_Else_Rule_MasterRules_col_1-1']")
		private static WebElement itemRules_ElseAlertsGridTypeDropdown;

	   @FindBy(xpath="//*[@id='tblAlert_Else_Rule_MasterRules_col_1-2']")
		private static WebElement itemRules_ElseAlertsGridToWhomDropdown;

	   @FindBy(xpath="//*[@id='tblAlert_Else_Rule_MasterRules_col_1-3']")
		private static WebElement itemRules_ElseAlertsGridSmsDropdown;

	   @FindBy(xpath="//*[@id='tblAlert_Else_Rule_MasterRules_col_1-4']")
		private static WebElement itemRules_ElseAlertsGridEmail;

	   @FindBy(xpath="//*[@id='tblAlert_Else_Rule_MasterRules_col_1-5']")
		private static WebElement itemRules_ElseAlertsGridDashBoardDropdown;

	   @FindBy(xpath="//*[@id='tblAlert_Else_Rule_MasterRules_col_1-6']")
		private static WebElement itemRules_ElseAlertsGridPopDropdown;

	  @FindBy(xpath="//*[@id='tblAlert_Else_Rule_MasterRules_col_1-7']")
		private static WebElement itemRules_ElseAlertsGridGTalkDropdown;

	   @FindBy(xpath="//*[@id='tblAlert_Else_Rule_MasterRules_col_1-8']")
		private static WebElement itemRules_ElseAlertsGridSendSpecficMessageDropdown;

	   @FindBy(xpath="//*[@id='tblAlert_Else_Rule_MasterRules_col_1-9']")
		private static WebElement itemRules_ElseAlertsGridSpecificMessage;
	   
	   
	   // Alert over

	   
	   // Header
	   
	   @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[1]/div[1]")
		private static WebElement itemRules_ElseAlertsSaveBtn;

	   @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[2]/div[1]/span")
		private static WebElement itemRules_ElseAlertsNewBtn;

	   @FindBy(xpath="//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[3]/div[2]")
		private static WebElement itemRules_ElseAlertsDeleteBtn;

	   @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
		private static WebElement itemRules_ElseAlertsCloseBtn;


	 // General Main *** External modules
	   
	@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a")
	private static WebElement itemRules_ExternalModules;			     

	@FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
	private static WebElement itemRules_ExternalModulesOnEventDropdown;	

	@FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
	private static WebElement itemRules_ExternalModulesButtonCaption;

	@FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
	private static WebElement itemRules_ExternalModules_ModuleTypeBtn;

	@FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
	private static WebElement itemRules_ExternalModules_ModuleNameDropdown;

	@FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
	private static WebElement itemRules_ExternalModulesClassNameDropdown;

	@FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
	private static WebElement itemRules_ExternalModulesFuctionalNameDropdown;

	@FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
	private static WebElement itemRules_ExternalModulesAvabileInDropdown;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[1]/div[2]")
	private static WebElement itemRules_ExternalModulesUpdateBtn;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[2]/div[2]")
	private static WebElement itemRules_ExternalModulesSaveBtn;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[3]/div[2]")
	private static WebElement itemRules_ExternalModulesEditBtn;

	@FindBy(xpath="//*[@id='ExternalModulesDiv_mExtraFieldExternalModule']/div[1]/div/div[4]/div[2]")
	private static WebElement itemRules_ExternalModulesDeleteBtn;

	@FindBy(xpath="//*[@id='extraFieldContainer_div']/div[1]/div[2]/div[2]")
	private static WebElement itemRules_ExternalModulesCloseBtn;	     
			     
			
	////////////ExternalModules************************************************************


	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[4]/span")
	private static WebElement ItemExternalModulesBtn;
		     
			@FindBy(xpath="//*[@id='ExternalModulesDiv_MasterExternalModule']/div[1]/label")
			private static WebElement ItemExternalModules_ExternalModulesLabel;     
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_MasterExternalModule']/div[1]/div/div[1]/div[2]")
			private static WebElement ItemExternalModules_UpdateBtn;   
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_MasterExternalModule']/div[1]/div/div[2]/div[2]")
			private static WebElement ItemExternalModules_SaveBtn;   
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_MasterExternalModule']/div[1]/div/div[3]/div[2]")
			private static WebElement ItemExternalModules_EditBtn;   
			
			@FindBy(xpath="//*[@id='ExternalModulesDiv_MasterExternalModule']/div[1]/div/div[4]/div[2]")
			private static WebElement ItemExternalModules_DeleteBtn;   
			
			@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
			private static WebElement ItemExternalModules_Close;   
			
			@FindBy(xpath="//*[@id='ddlOnEvent_MasterExternalModule']")
			private static WebElement ItemExternalModules_OnEventsDropdown;   
			
			@FindBy(xpath="//*[@id='txtbuttonCaption_MasterExternalModule']")
			private static WebElement ItemExternalModules_ButtonCaptionText;   
			
			@FindBy(xpath="//*[@id='ddlModuleType_MasterExternalModule']")
			private static WebElement ItemExternalModules_ModuleTypeDropdown;   
			
			@FindBy(xpath="//*[@id='ddlAllDllFiles_MasterExternalModule']")
			private static WebElement ItemExternalModules_ModuleNameDropdown;   
			
			@FindBy(xpath="//*[@id='ddlClassNames_MasterExternalModule']")
			private static WebElement ItemExternalModules_ClassNameDropdown;   
			
			@FindBy(xpath="//*[@id='ddlClassMethods_MasterExternalModule']")
			private static WebElement ItemExternalModules_FunctionNameDropdown;   
			
			@FindBy(xpath="//*[@id='ddlAvailability_MasterExternalModule']")
			private static WebElement ItemExternalModules_AvaialbleInDropdown;   


	//////////////////////////******InfoPanelCustomization****************************

			     
	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[5]/span")
	private static WebElement TabInfoPanelCustomization;
		     
	@FindBy(xpath="//*[@id='btnAddOrEdit_UniqueConstraints']")
	private static WebElement InfoPanelCust_AddBtn;		     
						     
						@FindBy(xpath="//*[@id='infoPanelSetting_modal']/div/div/div[1]/div[1]/h4")
						private static WebElement InfoPanelCust_PopInfoPanelSettingLabel;	
						
						@FindBy(xpath="//*[@id='txt_InfoPanel_PanelName']")
						private static WebElement InfoPanelCust_PopPanelNameText;	
						
						@FindBy(xpath="//*[@id='txt_InfoPanel_Description']")
						private static WebElement InfoPanelCust_PopInfoPanelDescription;	
						
						@FindBy(xpath="//*[@id='ddl_infoPanel_panelType']")
						private static WebElement InfoPanelCust_PopPanelTypeLabel;	
						
						@FindBy(xpath="//*[@id='chk_InfoPanel_RefreshOn']")
						private static WebElement InfoPanelCust_PopRecordCheckbox;	
						
						@FindBy(xpath="//*[@id='ddl_infoPanel_RowSpan']")
						private static WebElement InfoPanelCust_PopRowSpanDropdown;	
						
						@FindBy(xpath="//*[@id='Buildfrom']")
						private static WebElement InfoPanelCust_PopMasterRadioBtn;	
						
						@FindBy(xpath="//*[@id='id_buildFrom_query']")
						private static WebElement InfoPanelCust_PopQuarryRadioBtn;	
						
						@FindBy(xpath="//*[@id='Buildfrom']")
						private static WebElement InfoPanelCust_PopVariablesRadioBtn;	
						
						@FindBy(xpath="//*[@id='id_tblBuildFrom_master']/tbody/tr[1]/td[1]/span")
						private static WebElement InfoPanelCust_PopGridDeleteFirstRowBtn;	
						
						@FindBy(xpath="//*[@id='id_tblBuildFrom_master']/tbody/tr[2]/td[1]/span")
						private static WebElement InfoPanelCust_PopGridDeleteSecondRowBtn;	
						
						@FindBy(xpath="//*[@id='id_tblBuildFrom_master']/tbody/tr[1]/td[2]/input")
						private static WebElement InfoPanelCust_PopFirstRowFieldnameText;	
						
						@FindBy(xpath="//*[@id='id_tblBuildFrom_master']/tbody/tr[1]/td[3]/input")
						private static WebElement InfoPanelCust_PopGridFirstRowCaptionText;	
						
						@FindBy(xpath="//*[@id='id_tblBuildFrom_master']/tbody/tr[2]/td[2]/input")
						private static WebElement InfoPanelCust_PopGridSecondRowFieldNameText;	
						
						@FindBy(xpath="//*[@id='id_tblBuildFrom_master']/tbody/tr[2]/td[3]/input")
						private static WebElement InfoPanelCust_PopGridSecondRowCaptionText;	
						
						@FindBy(xpath="//*[@id='id_panelType_Preview_div']/fieldset/div")
						private static WebElement InfoPanelCust_PopPreviewDescrpitionText;	
						
						@FindBy(xpath="//*[@id='infoPanelSetting_save']")
						private static WebElement InfoPanelCust_PopInfoPanelSetting_SaveBtn;	
								     
						@FindBy(xpath="//*[@id='infoPanelSetting_Cancel']")
						private static WebElement InfoPanelCust_PopInfoPanelSetting_CancelBtn;
						
						@FindBy(xpath="//*[@id='btnCancel']/i")
						private static WebElement InfoPanelCust_PopInfoPanelSetting_ClosePopBtn;

	@FindBy(xpath="//*[@id='tabContent_IPCust_MasterCust']/div[1]/div/div[2]/div[2]")
	private static WebElement InfoPanelCust_DeleteBtn;

	@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	private static WebElement InfoPanelCust_CloseBtn;



	///////Item-------Customize Master-------------------Reports************************************************
			     
	@FindBy(xpath="//*[@id='allMasterCustTabs']/li[6]/span")
	private static WebElement TabReports;
			     
	@FindBy(xpath="//*[@id='tabContent_Reports_MasterCust']/div[1]/label")
	private static WebElement ItemReportsLabel;
		     
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[1]/label/input")
				private static WebElement ItemReports_UnitconversionreportChekbox;
						     
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[2]/label/input")
				private static WebElement ItemReports_RetailsalesItemChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[3]/label/input")
				private static WebElement ItemReports_StockInAndOutChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[4]/label/input")
				private static WebElement ItemReports_SummarySalesByAmountChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[5]/label/input")
				private static WebElement ItemReports_SummarySalesByItemChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[6]/label/input")
				private static WebElement ItemReports_SummarySalesByQtyAndAmtChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[7]/label/input")
				private static WebElement ItemReports_SummarySalesByQuantityChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[8]/label/input")
				private static WebElement ItemReports_ABCAnalaysisChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[9]/label/input")
				private static WebElement ItemReports_AgingAnalysisByBatchChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[10]/label/input")
				private static WebElement ItemReports_AgingAnalaysisByRMAChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[11]/label/input")
				private static WebElement ItemReports_AgingByItemByBinsChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[12]/label/input")
				private static WebElement ItemReports_ExpiredStockByBinsChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[13]/label/input")
				private static WebElement ItemReports_FastMovingItemsChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[14]/label/input")
				private static WebElement ItemReports_MultiLevelStockMovementChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[15]/label/input")
				private static WebElement ItemReports_PeakAndLowBalancesChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[16]/label/input")
				private static WebElement ItemReports_ReordereReportChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[17]/label/input")
				private static WebElement ItemReports_SerialNoWiseStockChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[18]/label/input")
				private static WebElement ItemReports_SlowMovingItemsChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[19]/label/input")
				private static WebElement ItemReports_StockAgingAnalysisChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[20]/label/input")
				private static WebElement ItemReports_StockAnalysisByBatchChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[21]/label/input")
				private static WebElement ItemReports_StockBalanceByItemsByBinsChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[22]/label/input")
				private static WebElement ItemReports_StockdetailByBinsChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[23]/label/input")
				private static WebElement ItemReports_StockLedgerChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[24]/label/input")
				private static WebElement ItemReports_StockMovementChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[25]/label/input")
				private static WebElement ItemReports_StockReportingByTagChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[26]/label/input")
				private static WebElement ItemReports_StockReservationRegisterChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[27]/label/input")
				private static WebElement ItemReports_StockstatementChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[28]/label/input")
				private static WebElement ItemReports_StockTransferRegisterChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[29]/label/input")
				private static WebElement ItemReports_StockValuationChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[30]/label/input")
				private static WebElement ItemReports_TransactionTypeWiswStocktReportChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[31]/label/input")
				private static WebElement ItemReports_VirtualStockAnalaysisChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[32]/label/input")
				private static WebElement ItemReports_ConsumptionSummaryChekbox;	
				
				@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[33]/label/input")
				private static WebElement ItemReports_ProductionSummaryChekbox;	
				
				
				
	     @FindBy(xpath="//*[@id='tabContent_Reports_MasterCust']/div[1]/div/div[1]/div[2]")
	     private static WebElement ItemReports_SaveBtn;	
			     
	     @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
	     private static WebElement ItemReports_CloseBtn;		     
			     
			
	     ///////////////**************Completed Master Tab Elements*********************
	     
	     
	@FindBy(xpath="//*[@id='btnCreateTab_MCust']")
	private static WebElement ItemCustomizeMaster_CreateTabDropDown;			     
			     
			@FindBy(xpath="//*[@id='masterCustomizingTabList']/div[2]/div/ul/li[1]/a")
			private static WebElement ItemCustomize_createTab_TreeTabBtn;	   
			
			////Tree Tab Butoon Pop Elements
			
							@FindBy(xpath="//*[@id='txtNewTreeTabCaption']")
							private static WebElement Item_TreeTab_TabCaptionTextbox; 
							
							@FindBy(xpath="//*[@id='txtNewTreeTabName']")
							private static WebElement Item_TreeTab_TabNameTextbox; 
							
							@FindBy(xpath="//*[@id='fOption_tab_masterName']")
							private static WebElement Item_TreeTab_NewMastwerTextbox; 
							
							@FindBy(xpath="//*[@id='fOption_tab_masterName_input_image']/span")
							private static WebElement Item_TreeTab_NewMasterExpansionBtn; 
							
								@FindBy(xpath="//*[@id='fOption_tab_masterName_input_settings']/span")
								private static WebElement Item_TreeTab_NewMasterSettingBtn; 
								
					               
								       @FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div/div/div[1]/h4")
								       private static WebElement Item_TreeTab_TabDetailsPopLabel; 
								
										@FindBy(xpath="//*[@id='fOption_tab_masterName_customize_popup_heading']")
										private static WebElement Item_TreeTab_NewMasterSetting_PopCustomizeDisplayColumnsLabel; 
										
										@FindBy(xpath="//*[@id='fOption_tab_masterName_customize_popup_container']")
										private static WebElement Item_TreeTab_NewMasterSetting_Pop_SMasterNameTextBox; 
										
										@FindBy(xpath="//*[@id='fOption_tab_masterName_customize_popup_footer']/div/div/input[1]")
										private static WebElement Item_TreeTab_NewMasterSetting_Pop_StanadardFieldsBtn; 
										
										/////Elements are not Stable to Identify the Web elements
										
										
									/////***************************************************************//	
										
								@FindBy(xpath="//*[@id='txtNewTreeTabFieldCaption']")
								private static WebElement Item_TreeTab_Pop_FieldCaptionTextbox; 
										
								@FindBy(xpath="//*[@id='txtNewTreeTabFieldName']")
								private static WebElement Item_TreeTab_pop_Fieldnametextbox; 
										
								@FindBy(xpath="//*[@id='bIsTreeHiddenTab']")
								private static WebElement Item_TreeTab_Pop_HiddenCheckbox; 
										
								@FindBy(xpath="//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[1]")
								private static WebElement Item_TreeTab_Pop_OkBtn; 
						
								@FindBy(xpath="//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[2]")
								private static WebElement Item_TreeTab_pop_CancelBtn; 
										
										
			@FindBy(xpath="//*[@id='masterCustomizingTabList']/div[2]/div/ul/li[2]/a")
			private static WebElement ItemCustomize_createTab_DocumenttaBtn;	
			                              
							@FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div/div/div[1]/h4")
							private static WebElement Item_DocumentTab_TabDetailsPopLabel; 
							
							@FindBy(xpath="//*[@id='txtNewDocTabCaption']")
							private static WebElement Item_DocumentTab_Pop_TabCaptionTextbox; 
					   
							@FindBy(xpath="//*[@id='txtNewDocTabName']")
							private static WebElement Item_DocumentTab_Pop_TabNameTextbox; 
							
							@FindBy(xpath="//*[@id='bIsDocHiddenTab']")
							private static WebElement Item_DocumentTab_Pop_HiddenCheckBox; 
							
							@FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div/div/div[3]/button[1]")
							private static WebElement Item_DocumentTab_Pop_OkBtn; 
			
							@FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div/div/div[3]/button[2]")
							private static WebElement Item_DocumentTab_Pop_CanceBtn; 
			
							 
					     
			@FindBy(xpath="//*[@id='masterCustomizingTabList']/div[2]/div/ul/li[3]/a")
			private static WebElement ItemCustomize_createTab_createTabBtn; 
			
							
							@FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div/div/div[1]/h4")
							private static WebElement Item_createTab_TabDetailsPopLabel; 
							
							@FindBy(xpath="//*[@id='txtNewDocTabCaption']")
							private static WebElement Item_CreateTab_Pop_TabCaptionTextbox; 
					   
							@FindBy(xpath="//*[@id='txtNewDocTabName']")
							private static WebElement Item_CreateTab_Pop_TabNameTextbox; 
							
							@FindBy(xpath="//*[@id='bIsDocHiddenTab']")
							private static WebElement Item_CreateTab_Pop_HiddenCheckBox; 
							
							@FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div/div/div[3]/button[1]")
							private static WebElement Item_CreateTab_Pop_OkBtn; 
			
							@FindBy(xpath="//*[@id='MCustomize_CreateDocTab_Modal']/div/div/div[3]/button[2]")
							private static WebElement Item_CreateTab_Pop_CanceBtn; 
			
			
			
	@FindBy(xpath="//*[@id='btnDeleteTab_MCust']")
	private static WebElement Item_CustomizeMaster_DeleteTabBtn; 	
			
	//*********************************************************************************************************//		
			
		/////Item-----Customize View ----------------------------------					
			
			
	@FindBy(xpath="//*[@id='btnCustomizeView']")
	private static WebElement ItemCustomizeViewBtn;			     

	@FindBy(xpath="//*[@id='MViewCustomizationTabs']/ul/li[1]/span")
	private static WebElement ItemCustomizeViewMasterFieldBtn;
	                
			@FindBy(xpath="//*[@id='MViewFields_list']/li[1]/span")
			private static WebElement ItemCustViewMasterFieldGeneralBtn;
					     
			
			/////General-----------------Main Tab
			                 
		       @FindBy(xpath="//*[@id='mvTabId_2']/ul/li[1]/a/span")
		       private static WebElement ItemCustViewItemCustViewGeneralMainTab;
					     
					     @FindBy(xpath="//*[@id='tabContent_ViewFields_MViewCust']/div[9]/div[1]/div[2]")
					     private static WebElement ItemCustViewItemCustViewGeneralMain_EditBtn;
					     
					     @FindBy(xpath="//*[@id='tabContent_ViewFields_MViewCust']/div[9]/div[2]/div[2]")
					     private static WebElement ItemCustViewItemCustViewGeneralMain_PreviewBtn;
					     
					     @FindBy(xpath="//*[@id='tabContent_ViewFields_MViewCust']/div[9]/div[3]/div[2]")
					     private static WebElement ItemCustViewItemCustViewGeneralMain_CloseBtn;
					                  
					     @FindBy(xpath="//*[@id='mvMainTab_0']/div/div/table/tbody/tr[1]/td[1]/i")
					     private static WebElement ItemCustViewItemCustViewGeneralMainGridFirstRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mvMainTab_0']/div/div/table/tbody/tr[2]/td[1]/i")
					     private static WebElement ItemCustViewItemCustViewGeneralMainGridSecondRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mvMainTab_0']/div/div/table/tbody/tr[3]/td[1]/i")
					     private static WebElement ItemCustViewItemCustViewGeneralMainThirdRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mvMainTab_0']/div/div/table/tbody/tr[4]/td[1]/i")
					     private static WebElement ItemCustViewItemCustViewGeneralMainGridFourthRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mvMainTab_0']/div/div/table/tbody/tr[5]/td[1]/i")
					     private static WebElement ItemCustViewItemCustViewGeneralMainGridFifthRow_EditBtn;
					     
					     @FindBy(xpath="//*[@id='mvMainTab_0']/div/div/table/tbody/tr[6]/td[1]/i")
					     private static WebElement ItemCustViewItemCustViewGeneralMainGridSixthRow_EditBtn;
					    
		
					     
					                     
					     @FindBy(xpath="//*[@id='extraFieldContainerViews_div']/ul/li[1]/a/span")
					     private static WebElement ItemCustViewGeneralMain_FieldDetailsBtn;   
					     
					     @FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
					     private static WebElement ItemCustViewGeneralMainFieldDetails_Caption;   
					     
					     @FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
					     private static WebElement ItemCustViewGeneralMainFieldDetails_DefaultValue;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
					     private static WebElement ItemCustViewGeneralMainFieldDetails_ToolTipText;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_BannerText']")
					     private static WebElement ItemCustViewGeneralMainFieldDetails_BannerText;  
					     
					     @FindBy(xpath="//*[@id='ExtraField_RegularExpression']")
					     private static WebElement ItemCustViewGeneralMainFieldDetails_RegularExpressionText;  
					     
					     
					     @FindBy(xpath=" //*[@id='btnLoad_RExp']")
					     private static WebElement ItemCustViewGeneralRegularExperssionLoad_ExpansionBtn;
					     
							     @FindBy(xpath="//*[@id='txtRExpression_RExp']")
							     private static WebElement ItemCustViewGeneralregExper_RegularExpression; 
							     
							     @FindBy(xpath="//*[@id='btnTestRExp']")
							     private static WebElement ItemCustViewGeneralregExper_TestBtn;
							     
							     @FindBy(xpath="//*[@id='txtTestExpression_RExp']")
							     private static WebElement ItemCustViewGeneralregExper_TestString;
							     
							     @FindBy(xpath="//*[@id='txtNameExpression_RExp']")
							     private static WebElement ItemCustViewGeneralregExper_Name;
							     
							     @FindBy(xpath="//*[@id='txtDescriptionExpression_RExp']")
							     private static WebElement ItemCustViewGeneralregExper_Description;
							     
							     @FindBy(xpath="//*[@id='btnClearREFields']")
							     private static WebElement ItemCustViewGeneralregExper_ClearBtn;
							     
							     @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[3]/button[1]")
							     private static WebElement ItemCustViewGeneralregExper_OkBtn;
						     
							     @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[3]/button[2]")
							     private static WebElement ItemCustViewGeneralregExper_CancelBtn;
							     
							     @FindBy(xpath="//*[@id='txtGroupsAndOptions']")
							     private static WebElement ItemCustViewGeneralregExper_SearchTextBox;
							     
									   @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[1]/a")
									   private static WebElement ItemCustViewGeneralregExperCharactersAndRepetitionsBtn;
									    
										     @FindBy(xpath="//*[@id='chkMatchIfAbsent_Regex']")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_MatchOnlyIfAbsentChekbox;
										     
										     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[2]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_AnyCharcterRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[3]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_AlphanumericRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[4]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_DigitRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[5]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_WhiteSpaceRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[6]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_SpecificCharcterRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[7]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_NamedClassRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expCharacterClass']/fieldset/div[9]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_SpecifiedSetRadioBtn;
										     
										     @FindBy(xpath="//*[@id='chkRepetition_RegEx']")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_AsFewAsPossibleChekbox;
										     
										     @FindBy(xpath="//*[@id='expRepetitions']/div[2]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_JustOnceRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expRepetitions']/div[3]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_AnyNumberRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expRepetitions']/div[4]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_ONeOrMoreRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expRepetitions']/div[4]/div/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_ZeroOrOneRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expRepetitions_Extra']/div[1]/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_ExactlyRadioBtn;
										     
										     @FindBy(xpath="//*[@id='expRepetitions_Extra']/div[3]/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_AtleastnRadioBtn;
										     
										     @FindBy(xpath="//*[@id=expRepetitions_Extra']/div[5]/label/input")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_BetweenmAndmRadioBtn;
									     
										     @FindBy(xpath=" //*[@id='CharsAndRepetitions_RExp']/div[1]/div/button")
										     private static WebElement ItemCustViewGeneralCharactersAndRepetitions_InsertBtn;
										     
										     
						              @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[2]/a")
						              private static WebElement ItemCustViewGeneralregExperGroupsAndOptionsBtn;
									     
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[1]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_NumberCaptureRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[2]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_NonCapturingGroupRadioBtn;
										           
										           @FindBy(xpath="//*[@id='chkMatchGroupName1']")
									               private static WebElement ItemCustViewGeneralGroupAndOption_Name1RadioBtn;
										           
										           @FindBy(xpath="//*[@id='txtMatchGroupName1']")
									               private static WebElement ItemCustViewGeneralGroupAndOption_Name1;
										           
										           @FindBy(xpath="//*[@id='txtMatchGroupName2']")
									               private static WebElement ItemCustViewGeneralGroupAndOption_Name2;
										           
										           @FindBy(xpath="//*[@id='chkMatchGroupName2']")
									               private static WebElement ItemCustViewGeneralGroupAndOption_Name2RadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[5]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_MatchSufficButExcludeItRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[6]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_LessThanRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[7]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_LessThanEqualRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[8]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_MatchIfPrefixIsNotPresentRadioBtn;
										           
										           @FindBy(xpath="//*[@id='expDefineMatchGroup']/fieldset/div[9]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_GreddySubExpressionRadioBtn;
										           
										           @FindBy(xpath="//*[@id='chkMatchGroupComment']")
									               private static WebElement ItemCustViewGeneralGroupAndOption_CommentRadioBtn;
										           
										           @FindBy(xpath="//*[@id='txtMatchGroupComment']")
									               private static WebElement ItemCustViewGeneralGroupAndOption_Comment;
										           
										           @FindBy(xpath="//*[@id='chkNonCapturingGroup']")
									               private static WebElement ItemCustViewGeneralGroupAndOption_NonCapturingGroupChekbox;
										           
										           @FindBy(xpath="//*[@id='chkEnclosingGroup']")
									               private static WebElement ItemCustViewGeneralGroupAndOption_EnclosingGroupChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[1]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_IgnoreCaseiChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[2]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_MultilinemChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[3]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_SingleLineChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[4]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_ExplictCaptureChekbox;
										           
										           @FindBy(xpath="//*[@id='ChangeOpt_Field2']/div[5]/div/label/input")
									               private static WebElement ItemCustViewGeneralGroupAndOption_IgnorepatternwhitespaceChekbox;
										           
										           @FindBy(xpath="//*[@id='GroupsAndOptions_RExp']/div[1]/div/button")
									               private static WebElement ItemCustViewGeneralGroupAndOption_InsertBtn;
						           
						          
						             @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[3]/a")
						             private static WebElement ItemCustViewGeneralregExperSpecialCharacters;               
						
										   @FindBy(xpath=" //*[@id='SpecialCharacters_RExp']/div[1]/div/button")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_InsertBtn;
										   
										   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[1]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_BellRadioBtn;
									       
										   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[2]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_BackSpaceRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[3]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_TabRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[4]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_CarriageReturnRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[5]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_VerticalTabRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[5]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_FormFeedRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[7]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_NewLineRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expSpecialCharacters']/div[8]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_EscapeRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[1]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_BenningStringOrLineRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[2]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_EndOfStringOrLineRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expDependsOnMultiline']/div[3]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_AlterNationRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[1]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_BenningOfString;
										   
										   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[2]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_EndOfStringOrBeforNewLineAtEnd;
										   
										   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[3]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_EndOfStringRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[4]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_BenningOfCurrentSearchRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[5]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_FirstOrLastCharcterInWordRadioBtn;
										   
										   @FindBy(xpath="//*[@id='expIgnoreMultiline']/div[6]/div/label/input")
										   private static WebElement ItemCustViewGeneralSpecialCharacters_NotFirstOrLastCharcterInWordRadioBtn;
						   
										     
		                              @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[4]/a")
						              private static WebElement ItemCustViewGeneralregExperExistingRegexBtn;
												     
									  @FindBy(xpath="//*[@id='RegularExpressions_ExtraField']/div/div/div[2]/div/ul/li[5]/a")
									  private static WebElement ItemCustViewGeneralregExperHelp;
									  
												  @FindBy(xpath="//*[@id='Help_SyntaxElements']")
												  private static WebElement ItemCustViewGeneralhelp_SyntaxElementsRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_Characters']")
												  private static WebElement ItemCustViewGeneralhelp_CharactersRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_Quantifier']")
												  private static WebElement ItemCustViewGeneralhelp_QuantifierRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_Anchors']")
												  private static WebElement ItemCustViewGeneralhelp_AnchorsRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_CharacterClass']")
												  private static WebElement ItemCustViewGeneralhelp_CharacterClassRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_ExtendedGroups']")
												  private static WebElement ItemCustViewGeneralhelp_ExtendedGroupsRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_BackReference']")
												  private static WebElement ItemCustViewGeneralhelp_BackReferenceRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_SubexpCall']")
												  private static WebElement ItemCustViewGeneralhelp_SubexpCallRadioBtn;
												  
												  @FindBy(xpath="//*[@id='Help_CapturedGroup']")
												  private static WebElement ItemCustViewGeneralhelp_CapturedGroupRadioBtn;
												  
								     
								      @FindBy(xpath="//*[@id='ExtraField_ErrorMessage']")
								      private static WebElement ItemCustViewGeneralMainEditFieldDetailsErrorMessage;  
								     
			@FindBy(xpath="//*[@id='extraFieldContainerViews_div']/ul/li[2]/a/span")
			private static WebElement ItemCustViewGeneralMainPropertiesBtn;	
			
			@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
			private static WebElement ItemCustViewGeneralMainProperties_ReadOnlyChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatory']")
			private static WebElement ItemCustViewGeneralMainProperties_MandatoryChekbox;
			
			@FindBy(xpath="//*[@id='ExtraField_IsRemoved']")
			private static WebElement ItemCustViewGeneralMainProperties_IsRemovedChekbox;
			
			@FindBy(xpath="//*[@id='ExtraField_IsHidden']")
			private static WebElement ItemCustViewGeneralMainProperties_HideLeftPanelChekbox;
			
			
			@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
			private static WebElement ItemCustViewGeneralMainProperties_HiddenInGroupChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
			private static WebElement ItemCustViewGeneralMainProperties_MandatoryInGroupChekbox;
			
			@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
			private static WebElement ItemCustViewGeneralMainProperties_IsMandatoryInRevisionChekbox;
			
			        @FindBy(xpath="//*[@id='extraFieldContainerViews_div']/ul/li[3]/a/span")
					private static WebElement  ItemCustViewGeneralMainFormattingBtn ;
		
					        @FindBy(xpath="//*[@id='ExtraField_ColumnSpan']")
							private static WebElement ItemCustViewGeneralMainFormattingColumnSpan ;
					        
					        @FindBy(xpath="//*[@id='ExtraField_RowSpan']")
							private static WebElement ItemCustViewGeneralMainFormattingRowSpan ;
					        
					        @FindBy(xpath="//*[@id='ExtraField_CharacterCasing']")
							private static WebElement ItemCustViewGeneralMainFormattingCharacterCasingDropdown ;
					        
					        @FindBy(xpath="//*[@id='ExtraField_TextAlign']")
							private static WebElement ItemCustViewGeneralMainFormattingTextAlignDropdown ;
					        
					        @FindBy(xpath="//*[@id='ExtraField_Font']")
							private static WebElement ItemCustViewGeneralMainFormattingFont ;
					        
					        @FindBy(xpath="//*[@id='btnOpenFont']")
							private static WebElement ItemCustViewGeneralMainFormattingFontExpansionBtn ;
					        
					        //Elements are used for font edit option pop in field details and rules 
					        
									        @FindBy(xpath="//*[@id='fontFamily_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopFontAreialDropdown ;
									        
									        @FindBy(xpath="//*[@id='fontStyle_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopFontStyleDropdown ;
									        
									        @FindBy(xpath="//*[@id='fontWeight_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopFontWeightDropdown ;
			
									        @FindBy(xpath="//*[@id='fontSizes_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopFontSizeDropdown ;
									        
									        @FindBy(xpath="//*[@id='fontForeColor_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopForeColourDropdown ;
									        
									        @FindBy(xpath="//*[@id='fontBackColor_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopBackColorDropdown ;
									        
									        @FindBy(xpath="//*[@id='chkBaseline_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopBaselineChekbox ;
									        
									        @FindBy(xpath="//*[@id='chkOverLine_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopOverLineChekbox ;
									        
									        @FindBy(xpath="//*[@id='chkStrikeThrough_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopStrikeThroughChekbox ;
									        
									        @FindBy(xpath="//*[@id='chkUnderline_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopUnderlineChekbox ;
									        
									        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
											private static WebElement ItemCustViewGeneralMainFormattingPopEnableFontChekbox ;
									        
									        @FindBy(xpath="//*[@id='previewfont_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopFrontPriveiw ;
									        
									        @FindBy(xpath="//*[@id='chkEnableFont_ctrlFontControl_View']")
											private static WebElement ItemCustViewGeneralMainFormattingPopEnableChekbox ;//to write in customize master General Code
									        
									        @FindBy(xpath="//*[@id='myFontControl_View_Save']/i")
											private static WebElement ItemCustViewGeneralMainFrontSaveBtn ;
									        
									        @FindBy(xpath="//*[@id='myFontControl_View_Close']")
											private static WebElement ItemCustViewGeneralMainFrontCloseBtn ;
									        
									   @FindBy(xpath="//*[@id='ExtraField_BackColor']")
									   private static WebElement ItemCustViewGeneralMainBackColour ;		        
									        
									   @FindBy(xpath="//*[@id='extraFieldContainerViews_div']/div[1]/div[1]/div[2]]")
									   private static WebElement ItemCustViewGeneralMainForMatFieldDeatailsOkBtn ;
									        
									   @FindBy(xpath="//*[@id='extraFieldContainerViews_div']/div[1]/div[2]/div[2]")
									   private static WebElement ItemCustViewGeneralMainForMatFieldDeatailsCanceBtn ;
									       
									        


									   @FindBy(xpath="//*[@id='extraFieldContainerViews_div']/ul/li[4]/a/span")
										 private static WebElement ItemCustViewGeneralMainBtn ;
												        
															            @FindBy(xpath="//*[@id='lnkRule_div_VFieldRules']/input")
																	    private static WebElement ItemCustViewGeneralMainClickHereAddRuleButtonBtn ;
															          
																        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainRuleNameTextbox;
																        
																        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_input_image']/span")
																		private static WebElement ItemCustViewGeneralMainRuleNameDropdown;
																      
																        
																        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_input_settings']/span")
																		private static WebElement ItemCustViewGeneralMainRuleNameSetingBtn ;
																        
																		        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_heading']")
																				private static WebElement ItemCustViewGeneralMainNamePop_CustomizeDisplayColoumnLABEL ;
																		        
																		        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_container']")
																				private static WebElement ItemCustViewGeneralMainNamePop_SNameTextBox ;
																		        
																		        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_footer']/div/div/input[1]")
																				private static WebElement ItemCustViewGeneralMainNamePop_StandandFieldBtn ;
																		        
																						        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_standardfields_list']")
																								private static WebElement ItemCustViewGeneralMainNamePop_StandaredField_FieldDropdown ;
																						        
																						        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_standardfields_header']")
																								private static WebElement ItemCustViewGeneralMainNamePop_StandardField_HeaderText ;
																						        
																						        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_standardfields_alignment']")
																								private static WebElement ItemCustViewGeneralMainNamePop_StandardField_AlignmentDropdown ;
																						        
																						        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_standardfields_width']")
																								private static WebElement ItemCustViewGeneralMainNamePop_StandardField_WidthTextBox ;
																						        
																						        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_footer']/div/div/input[3]")
																								private static WebElement ItemCustViewGeneralMainNamePop_StandardField_OkBtn ;
																						        
																						        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_footer']/div/div/input[4]")
																								private static WebElement ItemCustViewGeneralMainNamePop_StandardField_CancelBtn ;
																        
																		        
																		        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_footer']/div/div/input[2]")
																				private static WebElement ItemCustViewGeneralMainNamePop_DeleteColoumnBtn ;
																		        
																		        @FindBy(xpath="//*[@id='txtMasterRuleName_VFieldRules_customize_popup_footer']/div/div/input[4]")
																				private static WebElement ItemCustViewGeneralMainNamePop_CancelBtn ;
																		        
																		    
																		      
																        @FindBy(xpath="//*[@id='newRuleTab_div_VFieldRules']/div[1]/div/div[1]/div[1]/span")
																		private static WebElement ItemCustViewGeneralMainSaveBtn ;
																        
																        @FindBy(xpath="//*[@id='newRuleTab_div_VFieldRules']/div[1]/div/div[2]/div[2]")
																		private static WebElement ItemCustViewGeneralMainNewBtn ;
																        
																        @FindBy(xpath="//*[@id='newRuleTab_div_VFieldRules']/div[1]/div/div[3]/div[2]")
																		private static WebElement ItemCustViewGeneralMainDeleteBtn ;
																        
																        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
																		private static WebElement ItemCustViewGeneralMainCloseBtn ;
																                      
																        @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainCreatingGroupChekbox ;
																        
																        @FindBy(xpath="//*[@id='chkNewRecord_Rule_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainNewRecordChekbox ;
																        
																        @FindBy(xpath="//*[@id='chkEdit_Rule_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainEditChekbox ;
																        
																        @FindBy(xpath="//*[@id='chkLoad_Rule_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainLoadChekbox ;
																        
																        @FindBy(xpath="//*[@id='chkBeforeSave_Rule_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainBeforeSaveChekbox ;
																        
																        @FindBy(xpath="//*[@id='chkOnLeave_Rule_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainOnLeaveChekbox ;
																        
																        @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainBeforeDeleteChekbox ;
																        
																        @FindBy(xpath="//*[@id='chkOnEnter_Rule_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainOnEnterChekbox ;
																        
																        @FindBy(xpath="//*[@id='chkIsRuleActive_Rule_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainActiveChekbox ;
																        
																        @FindBy(xpath="//*[@id='chkNoRuleCondition_VFieldRules']")
																		private static WebElement ItemCustViewGeneralMainNoConditionChekbox;
																        
																        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]"
																        		+ "/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[4]"
																        		+ "/div[2]/div[2]/div[1]/div[3]/ul/li[1]/a")
																		private static WebElement ItemCustViewGeneralMainIfBtn ;
																        
																        @FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/"
																        		+ "div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/"
																        		+ "div[3]/div[1]/div[2]/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/ul/li[2]/a/span")
																		private static WebElement ItemCustViewGeneralMainElseBtn ;
																        
																        
																        
																        
																     // if 
																    	
																        @FindBy(xpath="//*[@id='txtField_RC_1_1_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIfSelectFieldDropdown ;
																        
																        @FindBy(xpath="//*[@id='ddlOperators_RC_1_1_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIfOPerationTypeDropdown ;
																        
																        @FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIfCompareTypeDropdown;          //Value,Field,Formula---Related
																        
																        @FindBy(xpath="//*[@id='txtCompareType_RC_1_1_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIfValueType;
																        
																        @FindBy(xpath="//*[@id='ddlConjunction_RC_1_1_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIfConnterDropdown;          //Only,And,Or--RelatedDD

																       
																    	
																    	//IF **** Formatting
																    	
																    	@FindBy(xpath="//*[@id='Rule_IF_VFieldRules']/div[2]/div[1]/ul/li[1]/a/span")
																    	private static WebElement ItemCustViewGeneralMainIFFormatting ;
																        
																        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_IF_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridFieldName ;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_1-2']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridChangeValue ;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_1-3']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridField ;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_1-4']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridValue ;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_1-5']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridCaption ;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-6']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridRegularExpression ;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-7']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridErrorMesage ;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-8']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridBannerText ;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-9']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridToolTip;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-10']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridMandatoryChekbox;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-11']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridHiddenChekbox;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-12']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridDisableChekbox;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-13']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridSpellCheckChekbox;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-14']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridAligementDropdown;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-15']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridCharacterCasting;
																        
																        @FindBy(xpath="//*[@id='tblFormating_IF_Rule_VFieldRules_col_3-16']")
																    	private static WebElement ItemCustViewGeneralMainIFFormattingGridSelectFont;
																        
																        
																        /// done
																        
																        
																        @FindBy(xpath="//*[@id='Rule_IF_VFieldRules']/div[2]/div[1]/ul/li[2]/a/span")
																    	private static WebElement ItemCustViewGeneralMainIFMessageTabBtn ;
																        
																        
																        @FindBy(id="txtGeneralMsg_RuleIfMsg_VFieldRules")
																    	private static WebElement ItemCustViewGeneralMainIFMessageTextBox ;
																        
																        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_VFieldRules']/div[1]/div[2]/label/input")
																    	private static WebElement ItemCustViewGeneralMainIFMessagesInformationRadioBtn;
																        
																        @FindBy(xpath="//*[@id='txtGeneralMsg_RuleIfMsg_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIFMessagesGeneralInformation;
																        
																        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_VFieldRules']/div[2]/div[2]/label/input")
																    	private static WebElement ItemCustViewGeneralMainIFMessagesWarnAndProceddRadioBtn;
																        
																        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleIF_VFieldRules']/div[3]/div[2]/label/input")
																    	private static WebElement ItemCustViewGeneralMainIFMessagesWarnAndStopRadioBtn;
																        
																        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertMessage;
																        
																        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIFCustmizeTemplateDropdown;

																        ///// IF ****Alerts-----Grid Elements
																        
																        @FindBy(xpath="//*[@id='Rule_IF_VFieldRules']/div[2]/div[1]/ul/li[3]/a/span")
																    	private static WebElement ItemCustViewGeneralMainIFAlert ;
																        

																        @FindBy(xpath="//*[@id='txtAlertMsg_RuleIfAlert_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIfAlertMessage;
																     
																        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleIF_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIfCustmizeTemplateDropdown;
																        
																        
																        
																        
																        @FindBy(xpath="//*[@id='ddlTypeAlert_IF_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertsGridTypeDropdown;
																        
																        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_VFieldRules_col_1-2']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertsGridToWhomDropdown;
																        
																        @FindBy(xpath="//*[@id='ddlUsersAlert_IF_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertsGridSmsDropdown;
																        
																        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_VFieldRules_col_1-4']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertsGridEmail;
																        
																        @FindBy(xpath="//*[@id='ddlDashboardAlert_IF_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertsGridDashBoardDropdown;
																        
																        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_VFieldRules_col_1-6']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertsGridPopDropdown;
																        
																        @FindBy(xpath="//*[@id='ddlGTalkAlert_IF_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertsGridGTalkDropdown;
																        
																        @FindBy(xpath="//*[@id='tblAlert_IF_Rule_VFieldRules_col_1-8']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertsGridSendSpecficMessageDropdown;
																        
																        @FindBy(xpath="//*[@id='txtSpecificMsgAlert_IF_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainIFAlertsGridSpecificMessage;
																        
																        // alert over
																        
																        ///////Grid Elements------Formatting------Else Module
																        
																        @FindBy(xpath=" //*[@id='Rule_Else_VFieldRules']/div/div[1]/ul/li[1]/a/span")
																       	private static WebElement ItemCustViewGeneralMainElseFormatting ;
																        
																        @FindBy(xpath="//*[@id='ddlFieldsDiv_Rule_ELSE_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridFieldName ;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_1-2']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridChangeValue ;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_1-3']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridField ;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_1-4']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridValue ;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_1-5']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridCaption ;
																     
																        @FindBy(xpath="//*[@id='txtRegExFormat_Else_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridRegularExpression ;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_1-7']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridErrorMesage ;
																     
																        @FindBy(xpath="//*[@id='txtBannertextFormat_Else_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridBannerText ;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_34-9']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridToolTip;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_34-10']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridMandatoryChekbox;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_34-11']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridHiddenChekbox;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_34-12']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridDisableChekbox;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_34-13']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridSpellCheckChekbox;
																     
																        @FindBy(xpath="//*[@id='ddlAlignmentFormat_Else_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridAligementDropdown;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_34-15']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridCharacterCasting;
																     
																        @FindBy(xpath="//*[@id='tblFormating_Else_Rule_VFieldRules_col_1-16']")
																    	private static WebElement ItemCustViewGeneralMainElseFormattingGridSelectFont;
																     

																     // else message
																        
																        @FindBy(xpath=" //*[@id='Rule_Else_VFieldRules']/div/div[1]/ul/li[2]/a/span")
																       	private static WebElement ItemCustViewGeneralMainElsetMessage ;
																     
																        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_VFieldRules']/div[1]/div[2]/label/input")
																    	private static WebElement ItemCustViewGeneralMainElseMessagesInformationRadioBtn;
																     
																        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_VFieldRules']/div[1]/div[2]/label/input")
																    	private static WebElement ItemCustViewGeneralMainElseMessagesGeneralMessage;
																     
																        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_VFieldRules']/div[2]/div[2]/label/input")
																    	private static WebElement ItemCustViewGeneralMainElseMessagesWarnAndProceddRadioBtn;
																     
																        @FindBy(xpath="//*[@id='lstRdoMessageType_RuleElse_VFieldRules']/div[3]/div[2]/label/input")
																    	private static WebElement ItemCustViewGeneralMainElseMessagesWarnAndStopRadioBtn;
																     
																        
																        
																        
																        
																        
																        /////  Else*****Alerts-----Grid Elements
																        
																        
																        @FindBy(xpath=" //*[@id='Rule_Else_VFieldRules']/div/div[1]/ul/li[3]/a/span")
																       	private static WebElement ItemCustViewGeneralMainElseAlert ;
																     
																        
																        @FindBy(xpath="//*[@id='txtAlertMsg_RuleElseAlert_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainElseAlertMessage;
																     
																        @FindBy(xpath="//*[@id='custmizeAlertTemplate_RuleELse_VFieldRules']")
																    	private static WebElement ItemCustViewGeneralMainElseCustmizeTemplateDropdown;


																     
																        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_VFieldRules_col_1-1']")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsGridTypeDropdown;
																     
																        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_VFieldRules_col_1-2']")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsGridToWhomDropdown;
																     
																        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_VFieldRules_col_1-3']")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsGridSmsDropdown;
																     
																        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_VFieldRules_col_1-4']")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsGridEmail;
																     
																        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_VFieldRules_col_1-5']")
																     	private static WebElement ItemCustViewGeneralMainElseAlertsGridDashBoardDropdown;
																     
																        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_VFieldRules_col_1-6']")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsGridPopDropdown;
																     
																       @FindBy(xpath="//*[@id='tblAlert_Else_Rule_VFieldRules_col_1-7']")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsGridGTalkDropdown;
																     
																        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_VFieldRules_col_1-8']")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsGridSendSpecficMessageDropdown;
																     
																        @FindBy(xpath="//*[@id='tblAlert_Else_Rule_VFieldRules_col_1-9']")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsGridSpecificMessage;
																        
																        
																        // Alert over
																     
																        
																        // Header
																        
																        @FindBy(xpath="//*[@id='newRuleTab_div_VFieldRules']/div[1]/div/div[1]/div[1]")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsSaveBtn;
																     
																        @FindBy(xpath="//*[@id='newRuleTab_div_VFieldRules']/div[1]/div/div[2]/div[1]/span")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsNewBtn;
																     
																        @FindBy(xpath="//*[@id='newRuleTab_div_VFieldRules']/div[1]/div/div[3]/div[2]")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsDeleteBtn;
																     
																        @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
																    	private static WebElement ItemCustViewGeneralMainElseAlertsCloseBtn;
																     
																     
																      // General Main *** External modules
																                   
																    @FindBy(xpath="//*[@id='extraFieldContainerViews_div']/ul/li[5]/a/span")
																    private static WebElement generalMainTabExternalModulesBtn;			     
																                     
																    @FindBy(xpath="//*[@id='ddlOnEvent_mViewExtraExternalModule']")
																    private static WebElement ItemCustViewGeneralMainExternalModules_OnEventDropdown;	

																    @FindBy(xpath="//*[@id='txtbuttonCaption_mViewExtraExternalModule']")
																    private static WebElement ItemCustViewGeneralMainExternalModules_ButtonCaption;

																    @FindBy(xpath="//*[@id='ddlClassNames_mViewExtraExternalModule']")
																    private static WebElement ItemCustViewGeneralMainExternalModules__ModuleTypeDropdown;

																    @FindBy(xpath="//*[@id='mViewExtraExternalModule']")
																    private static WebElement ItemCustViewGeneralMainExternalModules__ModuleNameDropdown;

																    @FindBy(xpath="//*[@id='ddlClassNames_mViewExtraExternalModule']")
																    private static WebElement ItemCustViewGeneralMainExternalModules_ClassNameDropdown;

																    @FindBy(xpath="//*[@id='ddlClassMethods_mViewExtraExternalModule']")
																    private static WebElement ItemCustViewGeneralMainExternalModules_FuctionalNameDropdown;

																    @FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
																    private static WebElement ItemCustViewGeneralMainExternalModules_AvabileInDropdown;

																    @FindBy(xpath="///*[@id='ExternalModulesDiv_mViewExtraExternalModule']/div[1]/div/div[1]/div[2]")
																    private static WebElement ItemCustViewGeneralMainExternalModules_UpdateBtn;

																    @FindBy(xpath="//*[@id='ExternalModulesDiv_mViewExtraExternalModule']/div[1]/div/div[2]/div[2]")
																    private static WebElement ItemCustViewGeneralMainExternalModules_SaveBtn;

																    @FindBy(xpath="//*[@id='ExternalModulesDiv_mViewExtraExternalModule']/div[1]/div/div[3]/div[2]")
																    private static WebElement ItemCustViewGeneralMainExternalModules_EditBtn;

																    @FindBy(xpath="//*[@id='ExternalModulesDiv_mViewExtraExternalModule']/div[1]/div/div[4]/div[2]")
																    private static WebElement ItemCustViewGeneralMainExternalModules_DeleteBtn;

																    @FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[2]")
																    private static WebElement ItemCustViewGeneralMainExternalModules_CloseBtn;

			    
			     //////Customize view -------General---main is Completed.

				@FindBy(xpath="//button[@id='btnOkForDelete']")
				public static WebElement clickOnOkInDelete;											    
				
				@FindBy(xpath="//*[@id='btnDelete']/i")
				public static WebElement deleteBtn;
				
				@FindBy(xpath="//div[@id='idGlobalError']")
				public static WebElement validationConfirmationMessage;

				@FindBy(xpath="//div[@class='theme_color font-6']")
				public static WebElement validationUpdatingConfirmationMessage;
				
				@FindBy(xpath="//div[@id='idGlobalError']//td[3]")
				public static WebElement closeValidationConfirmationMessage;
				
				@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
				public static WebElement accountCreation;
				
				/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[12]")
				public static WebElement itemNewCreationName;*/
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
				public static WebElement accountNewCreationNameOfLane;               
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement accountFirstCheckBoxToSelection;

				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[2]/span[1]")
				public static WebElement accountGroupTitleDisplay;
			    
																  													    

     //Customize view-----General------Header to start.....

     @FindBy(xpath="//span[@id='btnCustomizeTree']")
     private static WebElement itemCustomizeTreeBtn;
       
    /* @FindBy(xpath="//span[@id='btnAlternateProduct']")
     private static WebElement itemAlternateProductBtn;
     
     @FindBy(xpath="//span[@id='btnRelatedProduct']")
     private static WebElement itembtnRelatedProductBtn;
    
     @FindBy(xpath="//span[@id='btnLedger']")
     private static WebElement itemLedgerBtn;*/
     
     @FindBy(xpath="//span[@id='btnBudget']")
     private static WebElement itemBudgetBtn;
  
     @FindBy(xpath="//span[@id='btnBackTrack']")
     private static WebElement itemBackTrackBtn;
  
     /*@FindBy(xpath="//span[@id='btnTransfer']")
     private static WebElement itemTransferBtn;*/
    
     @FindBy(xpath="//*[@id='Main']/div/div/div/a[2]")
     private static WebElement ItemToggleBarMoveRightSideBtn;
     
     @FindBy(xpath="//*[@id='Main']/div/div/div/a[1]")
     private static WebElement ItemToggleBarMoveLeftSideBtn;

     @FindBy(xpath="//*[@id='txtsrch-term']")
     private static WebElement ItemSearchBarBtn;

     @FindBy(xpath="//*[@id='cmbUserTypeMaster']")
     private static WebElement ItemAdvanceSearchBarBtn;
 
     @FindBy(xpath="//*[@id='li_moveup']/div/div[1]/a[1]/span")
     private static WebElement ItemMoveTheSelectionToTheNextBookMarkBtn;
     
     @FindBy(xpath="//*[@id='li_moveup']/div/div[1]/a[2]/span")
     private static WebElement  ItemMoveTheSelectionToThePreviousBookMarkBtn;

     @FindBy(xpath="//*[@id='li_moveup']/div/div[1]/a[3]/span")
     private static WebElement ItemShowAllRecordsBtn;

     @FindBy(xpath="//*[@id='id_showAllUnAuth']/span")
     private static WebElement ItemshowAllUnAuthroisedRecordsBtn;

     @FindBy(xpath="//*[@id='id_ShowAllClosed']/span")
     private static WebElement ItemShowAllClosedRecordsBtn;

     @FindBy(xpath="//*[@id='chkResizeGrid']/span")
     private static WebElement ItemAutoAdjustColoumnsBtn;

     @FindBy(xpath="//*[@id='chkRetainSelection']")
     private static WebElement ItemRetainSelectionCheckBoxBtn;

     @FindBy(xpath="//*[@id='btnsideBar']")
     private static WebElement ItemSideBarBtn;

     @FindBy(xpath="//*[@id='divSidebarHeader']/div[2]/span/i[1]")
     private static WebElement ItemOpenInfoPannelSettingsBtn;

     @FindBy(xpath="//*[@id='id_InfoPanelEdit']")
     private static WebElement ItemInfoPannelEditBtn;

     @FindBy(xpath="//*[@id='infopanelCloseButton']")
     private static WebElement ItemIInfoPannelCloseBtn;
     
 
     //TreeId WebElements
     
     @FindBy(id="iTreeId")
     private static WebElement  ItemiTreeIdBtn;
     
     @FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/button")
     private static WebElement  ItemiTreeIdHiddenBtn;
     
     @FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[1]/a")
     private static WebElement  ItemiTreeIdHiddenCreateTreeBtn;
     
     @FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[2]/a")
     private static WebElement  ItemiTreeIdHiddenEditBtn;
     
     @FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[3]/a")
     private static WebElement  ItemiTreeIdHiddenDeleteBtn;
     
     @FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[4]/a")
     private static WebElement  ItemiTreeIdHiddenSetDefaultBtn;
   
   
     @FindBy(id="iTreeViewId")
     private static WebElement  ItemiTreeViewIdBtn;
     
     @FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/button")
     private static WebElement  ItemiTreeViewIdHiddenBtn;
     
     @FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[1]/a")
     private static WebElement  ItemiTreeViewIdHiddenCreateViewBtn;
     
     @FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[2]/a")
     private static WebElement  ItemiTreeViewIdHiddenEditBtn;
     
     @FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[3]/a")
     private static WebElement  ItemiTreeViewIdHiddenDeleteBtn;

    
     @FindBy(xpath="//*[@id='oncheckaccorderan']")
 	 private static WebElement  ItemiTreeViewAutoHideBtn;

   
     @FindBy(xpath="//input[@id='txtsrch-term']")
     private static WebElement itemScreenSearchitemBtn;

     @FindBy(xpath="//button[@id='btnSearchAcc1']")
     private static WebElement itemScreenSearchitemIconBtn;
     
   
     @FindBy(xpath="//input[@id='cmbUserTypeMaster']")
     private static WebElement itemScreencmbUserTypeMasterBtn;
     
     @FindBy(xpath="//div[@id='divSecondsub']//a[3]")
     private static WebElement itemScreenShowAllRecordsBtn;
     
     @FindBy(xpath="//a[@id='id_showAllUnAuth']")
     private static WebElement itemScreenShowAllUnauthorisedRecordsBtn ;
     
     @FindBy(xpath="//a[@id='id_ShowAllClosed']")
     private static WebElement itemScreenShowAllClosedRecordsBtn;
     
     @FindBy(xpath="//a[@id='chkResizeGrid']")
     private static WebElement itemScreenAutoAdjustColumnsBtn;
     
     @FindBy(xpath="//input[@id='chkRetainSelection']")
     private static WebElement itemScreenRetainSelectionChkbox;
     
     
     @FindBy(xpath="//input[@id='liSelectAllMasters']")
     private static WebElement itemDisplayGridArea;


		@FindBy(xpath="//*[@id='iTreeId']")
		public static WebElement masterTreeIdDropdown; 

		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/button/span")
		public static WebElement masterTreeIDToggleBtn; 

		@FindBy(xpath="//select[@id='iTreeViewId']")
		public static WebElement masterTreeViewIDDropdown; 

		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/button/span")
		public static WebElement masterTreeViewIDToggleBtn;

		@FindBy(xpath="//*[@id='oncheckaccorderan']")
		public static WebElement masterOptionToHideItemGroupTree;
       
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")
		public static WebElement getMsgOnDelete;
		
		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[1]/a")
		public static WebElement masterTreeIDToggle_CreateTreeBtn; 

		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[2]")
		public static WebElement masterTreeIDToggle_EditBtn; 
							
		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[3]")
		public static WebElement masterTreeIDToggle_DeleteBtn; 
							
		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[4]")
		public static WebElement masterTreeIDToggle_setDefaultBtn;


		/*@FindBy(xpath="//input[@id='liSelectAllMasters']")
		public static WebElement itemMasterSelect;
*/
		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[1]")
		public static WebElement masterTreeViewIdCreateViewBtn; 

		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[2]/a")
		public static WebElement masterTreeeViewIdEditBtn; 
							
		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[3]/a")
		public static WebElement masterTreeViewIdDeleteBtn; 
							
		@FindBy(xpath="//div[@id='divTreeMenu']")
		public static WebElement masterTreeDisplayMenuItemGroups; 		
							
		@FindBy(xpath="//*[@id='oncheckaccorderan']")
		public static WebElement masterOptionToHideItemGroupDisplay; //To hide TreeId and TreeViewId Elements From HomeScreen
		
		@FindBy(xpath="//*[@id='btnMasterSaveClick']")
		public static WebElement saveBtn;

		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement closeBtn;

		@FindBy(xpath="//a[@class='clsMasterName']")
		public static WebElement masterItemDisplayLeftSidePane; 
		
		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
		public static WebElement editcloseBtn;
		
		@FindBy(xpath="//i[@class='icon-font6 icon-paste-clipboard']")
		public static WebElement pasteBtn;
		
		@FindBy(xpath="//button[@id='btnMasterClone']")
		public static WebElement editcloneBtn;
		
		@FindBy(xpath="//*[@id='btnMasterCopy']")
		public static WebElement copyBtn;
		
		@FindBy(xpath="//*[@id='btnSearchAcc1']/i")
		public static WebElement masterSearchBtn; 

		@FindBy(xpath="//a[contains(text(),'Search on')]")
		public static WebElement masterSearchTxtBtn_SearchOnBtn; 

		@FindBy(xpath="//a[contains(text(),'Advance Search')]")
		public static WebElement masterSearchTxtBtn_AdvanceSearchBtn; 


		
		/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement itemFirstCheckBox;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement itemSecondCheckBox;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement itemThirdCheckBox;*/
		
	/*	@FindBy(xpath="//i[@class='icon-font6 icon-edit']")
		public static WebElement masterEditBtn; 

*/

		@FindBy(xpath="//label[@class='msgInfo']")
		public static WebElement clickOnEmptyGroup;
		
		
		
		//Dash board Page
		@FindBy(xpath="//*[@id='dashName']")
	    private static WebElement labelDashboard ;
		
		@FindBy(xpath="//*[@id='Select_dash']")
		private static WebElement selectDashboard ;
			
		@FindBy(xpath="//*[@id='Dashboard_AddDash']")
	    private static WebElement newAddDashBoard;
		 
	    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
	    private static WebElement dashboardCustomizationSettings;
		
        //Logout and Login Screen
		
		@FindBy(xpath="//*[@id='txtUsername']")
		private static WebElement username;

		@FindBy(id="txtPassword")
		private static WebElement password;

		@FindBy(id="btnSignin")
		private static WebElement signIn;

	    @FindBy(id="ddlCompany")
	    private static WebElement companyDropDownList;

	    @FindBy(xpath="//span[@class='hidden-xs']")
		private static WebElement userNameDisplay;

	    
	   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
		private static WebElement userNameDisplay;*/

		@FindBy(xpath="//*[@id='companyLogo']")
		private static WebElement companyLogo;

		@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
		private static WebElement companyName;

	    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
		private static WebElement logoutOption;	
	     
	    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
		private static WebElement noIn;
	    
	    
	 private static String xlfile;
	 private static String resPass="Pass";
	 private static String resFail="Fail";
	 private static ExcelReader excelReader;

	     
	public boolean checkLoginToCheckItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		LoginPage lp=new LoginPage(getDriver()); 
		
		String unamelt="su";
				      
		String pawslt="su";
				      
		LoginPage.enterUserName(unamelt);
				
		LoginPage.enterPassword(pawslt);
				  
		LoginPage.clickOnSignInBtn();
				        
		Thread.sleep(9000);
				          	
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(noIn));
		noIn.click();
		
		Thread.sleep(4003);
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		String userInfo=userNameDisplay.getText();
				    	
		System.out.println("User Info : "+userInfo);
				    	
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
				    	
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
				    	
		companyLogo.click();
				    	
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogo.click();
				    	
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
				    	
		String getDashboard=labelDashboard.getText();
	   
		System.out.println("getDashboard"+getDashboard);
		
		if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") && getDashboard.equalsIgnoreCase("Dashboard"))
		{

			System.out.println("Test Pass : Login The Application Successfully");
			excelReader.setCellData(xlfile, "Sheet1", 7, 9, resPass);
			return true;
			
		}
		else
		{
			System.out.println("Test Fail : Login The Application Successfully");
			excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
			return false;

		}
	
	}     
 
 
	     
	     
	  //ITEMS MATER PAGE STARTS

		@FindBy(xpath = "//i[@class='icon-convert icon-font6']")
		private static WebElement itemUnitConversionBtn;

		@FindBy(xpath = "//span[@id='btnAlternateProduct']")
		private static WebElement itemAlternateProductBtn;

		@FindBy(xpath = "//span[@id='btnRelatedProduct']")
		private static WebElement itembtnRelatedProductBtn;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[12]")
		public static WebElement itemNewCreationName;

		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[12]")
		public static WebElement itemNewCreationNameR2;

		@FindBy(xpath = "//span[@id='btnLedger']")
		private static WebElement itemLedgerBtn;

		@FindBy(xpath = "//a[contains(text(),'Create Tab')]")
		public static WebElement itemNewCreateTab;

		@FindBy(xpath = "//input[@id='ExtraFieldOne']")
		public static WebElement itemExtraFieldOne;

		@FindBy(xpath = "//*[@id='ExtraFieldTwo']")
		public static WebElement itemExtraFieldTwo;

		@FindBy(xpath = "//i[@class='icon-font6 icon-transfer']")
		private static WebElement itemTransferBtn;
		
		@FindBy(xpath = "//*[@id='ulCommonlyUsedRibbon']/li/span")
		private static List<WebElement> itemRibbonControlList;
	  
		 //Masters Menu	
		@FindBy (xpath="//*[@id='1000']/span")
	    private static WebElement mastersMenu;
		
		// Items Menu
		@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]")
		public static WebElement itemsMenu;
	  
		// Item
		@FindBy(xpath = "//*[@id='1105']/span")
		private static WebElement homeMasterItemMainMenuItem;
		
		@FindBy(xpath = "//*[@id='spnHeaderText']")
		private static WebElement itemLabel;
		
		@FindBy(xpath = "//i[@class='icon-font6 icon-new']")
		public static WebElement masterNewBtn;
		
		@FindBy(xpath = "//i[@class='icon-font6 icon-add-group']")
		public static WebElement masterAddGroupBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-edit']")
		public static WebElement masterEditBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-clone']")
		public static WebElement masterCloneBtn;

		@FindBy(xpath = "//i[@class='icon-properties icon-font6']")
		public static WebElement masterPropertiesBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-delete']")
		public static WebElement masterDeleteBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-close']")
		public static WebElement masterCloseBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-group']")
		public static WebElement masterGroupBtn;

		@FindBy(xpath = "//*[@id='toggle_ribbon']")
		public static WebElement masterRibbonToExpandOptions;

		/*@FindBy(xpath = "//i[@class='icon-font6 icon-delete-all']")
		public static WebElement masterDeleteAllBtn;*/

		@FindBy(xpath = "//i[@class='icon-font6 icon-closed-account']")
		public static WebElement masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity;

		@FindBy(xpath = "//i[@class='icon-font6 icon-open-close-account']")
		public static WebElement masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState;

		@FindBy(xpath = "//i[@class='icon-font6 icon-import']")
		public static WebElement masterAdvanceMasterImportORExportBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-info']")
		public static WebElement masterAuthorInfoBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-up-arrow']")
		public static WebElement masterMoveUpBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-down-arrow']")
		public static WebElement masterMoveDownBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-sort']")
		public static WebElement masterSortBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-mass-update']")
		public static WebElement masterMassUpdateBtn;

		@FindBy(xpath = "//a[@class='lSNext']")
		public static WebElement masterRibbonControlNextBtn;

		@FindBy(xpath = "//*[@id='btnXMLImport']")
		public static WebElement masterImportFromXmlBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-xmlexport']")
		public static WebElement masterExportFormatToXmlBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-custamize']")
		public static WebElement masterCustamizeMasterBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-options']")
		public static WebElement masterCustamizeViewBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-tree']")
		public static WebElement mastercustamizeTreeBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-stock-ledger']")
		public static WebElement masterLedgerBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-financial-1']")
		public static WebElement masterManageCreditBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-department-appropriation']")
		public static WebElement masterDepartmentAppropriationBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-budget']")
		public static WebElement masterBudgetBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-backtrack']")
		public static WebElement masterBackTrackBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-transfer']")
		public static WebElement masterTranferBtn;

		@FindBy(xpath = "//*[@id='btnNewSets']")
		public static WebElement masterNewSetBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-modifier']")
		public static WebElement masterModifierBtn;

		@FindBy(xpath = "//*[@id='btnSetType']")
		public static WebElement masterSetTypeBtn;

		@FindBy(xpath = "//i[@class='icon-convert icon-font6']")
		public static WebElement masterUnitConversionBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-alternate-product-1']")
		public static WebElement masterAlternateItemBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-related-product']")
		public static WebElement masterRelatedItemBtn;

		@FindBy(xpath = "//i[@class='icon-font6 icon-stock-ledger']")
		public static WebElement masterStockLedgerBtn;
		
		
		
		

		@FindBy(xpath="//*[@id='navigation_menu']/li/a/div/div")
		private static List<WebElement> menusList;
		
		
		
		
		
		
		public boolean checkSignToCheckItemMastersPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	    {
	      excelReader = new ExcelReader(POJOUtility.getExcelPath());
	      xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    
	      System.out.println("***************** checkSignToCheckCurrencyMastersPage Method Executes.............  *********************");
	      
	 	 try
	 	 {
	 		 
	 		 getDriver().navigate().refresh();
	 		 Thread.sleep(1999);
	 		 
	 		 getDriver().navigate().refresh();
	 		 Thread.sleep(1999);
	 		 	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	 	    	 
	 		 LoginPage lp = new LoginPage(getDriver());
	 		 
	 		 String unamelt =excelReader.getCellData(xlSheetName, 8, 6);
	 		 String pawslt  =excelReader.getCellData(xlSheetName, 8, 6);
	 		 
	 		 LoginPage.enterUserName(unamelt);
	 		 LoginPage.enterPassword(pawslt);
	 		 
	 		 LoginPage.clickOnSignInBtn();
	 		 
	 		 Thread.sleep(5000);
	 		
	 		 
	 		 int actMenusCount	= menusList.size();
	 		 
	 		 ArrayList<String> actMenusArray=new ArrayList<String>();
	 		 
	 		 for (int i = 0; i < actMenusCount; i++) 
	 		 {
	 			 String data = menusList.get(i).getText();
	 			 actMenusArray.add(data);
	 		 }	
	 				
	 		 String actMenus 	=actMenusArray.toString();
	 		 String expMenus	= excelReader.getCellData(xlSheetName, 8, 7);
	 		 
	 		 System.out.println("Menus Display Value Actual        : " + actMenus);
	 		 System.out.println("Menus Display Value Expected      : " + expMenus);
	 		 
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	 		 String actUserInfo = userNameDisplay.getText();
	 		 String expUserInfo = excelReader.getCellData(xlSheetName, 9, 7);	
	 		 
	 		 System.out.println("User Name Display Value Actual    : " + actUserInfo            + " Value Expected : " + expUserInfo);
	 		 
	
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
	 		 companyLogo.click();
	 		 
	 
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyName));
	 		 String actGetLoginCompanyNameInformation = companyName.getText();
	 		 String actGetLoginCompanyName   = actGetLoginCompanyNameInformation.substring(0, 19);
	 		 String expGetLoginCompanyName   = excelReader.getCellData(xlSheetName, 10, 7);
	 		
	 		 System.out.println("Company Name Display Value Actual : " + actGetLoginCompanyName + " Value Expected : " + expGetLoginCompanyName);
	 		 
	 		 companyLogo.click();
	 		 
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
	 		 String actDashboardLabel        = labelDashboard.getText();
	 		 String expDashboardLabel        = excelReader.getCellData(xlSheetName, 11, 7);
	 		 
	 		 excelReader.setCellData(xlfile, xlSheetName, 8, 8, actMenus);
	 		 excelReader.setCellData(xlfile, xlSheetName, 9, 8, actUserInfo);
	 		 excelReader.setCellData(xlfile, xlSheetName, 10, 8, actGetLoginCompanyName);
	 		 excelReader.setCellData(xlfile, xlSheetName, 11, 8, actDashboardLabel);
	 		

	 		 System.out.println("Dashboard Label Value Actual      : " + actDashboardLabel      + " Value Expected : " + expDashboardLabel);
	 		 
	 		 if (actUserInfo.equalsIgnoreCase(expUserInfo) && actGetLoginCompanyName.equalsIgnoreCase(expGetLoginCompanyName)
	 				 && actDashboardLabel.equalsIgnoreCase(expDashboardLabel) && actMenus.equalsIgnoreCase(expMenus)) 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 7, 9, resPass);
	 			 return true;
	 		 }	 
	 		 else 
	 		 {
	 			 excelReader.setCellData(xlfile, xlSheetName, 7, 9, resFail);
	 			 return false;
	 		 }
	 	 }
	 	 catch (Exception e) 
	      {
	          excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
	          System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	          return false;
	      }
	    }	
		
		
		
		
	 public boolean checkClickOnItemFromItemMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {

		  excelReader = new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		  System.out.println("********************************************** checkClickOnItemFromItemMenu  ********************************************");
		
		  try
		  {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
			mastersMenu.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemsMenu));
			itemsMenu.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMasterItemMainMenuItem));
			homeMasterItemMainMenuItem.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
			
			String actItemLabel                   = itemLabel.getText();
			boolean actAccountMasterNewBtn        = masterNewBtn.isDisplayed();
			boolean actAccountMasterAddGroupBtn   = masterAddGroupBtn.isDisplayed();
			boolean actAccountMasterEditBtn       = masterEditBtn.isDisplayed();
			boolean actAccountMasterCloneBtn      = masterCloneBtn.isDisplayed();
			boolean actAccountMasterPropertiesBtn = masterPropertiesBtn.isDisplayed();
			boolean actAccountMasterDeleteBtn     = masterDeleteBtn.isDisplayed();
			boolean actAccountMasterCloseBtn      = masterCloseBtn.isDisplayed();
			boolean actAccountMasterExpandBtn     = masterRibbonToExpandOptions.isDisplayed();
		
			String expItemLabel                   = excelReader.getCellData(xlSheetName, 427, 7);
			boolean expAccountMasterNewBtn        = true;
			boolean expAccountMasterAddGroupBtn   = true;
			boolean expAccountMasterEditBtn       = true;
			boolean expAccountMasterCloneBtn      = true;
			boolean expAccountMasterPropertiesBtn = true;
			boolean expAccountMasterDeleteBtn     = true;
			boolean expAccountMasterCloseBtn      = true;
			boolean expAccountMasterExpandBtn     = true;
			
			Set<String> actRibbonControl= new HashSet<String>();
			
			int count = itemRibbonControlList.size();
			
			System.err.println(" Ribbon :   "+count);
			
			for (int i=1;i<count;i++)
			{
				String data=itemRibbonControlList.get(i).getText();
				actRibbonControl.add(data);
			}
			
			String actItemRibbon = actRibbonControl.toString();
			
			String expItemRibbon = excelReader.getCellData(xlSheetName, 428, 7);
			
		
			System.out.println("New Value Actual        : " + actItemLabel                  + "  Value Expected : " + expItemLabel);
			System.out.println("New Value Actual        : " + actAccountMasterNewBtn        + "  Value Expected : " + expAccountMasterNewBtn);
			System.out.println("Add Group Value Actual  : " + actAccountMasterAddGroupBtn   + "  Value Expected : " + expAccountMasterAddGroupBtn);
			System.out.println("Edit Value Actual       : " + actAccountMasterEditBtn       + "  Value Expected : " + expAccountMasterEditBtn);
			System.out.println("Clone Value Actual      : " + actAccountMasterCloneBtn      + "  Value Expected : " + expAccountMasterCloneBtn);
			System.out.println("Properties Value Actual : " + actAccountMasterPropertiesBtn + "  Value Expected : " + expAccountMasterPropertiesBtn);
			System.out.println("Delete Value Actual     : " + actAccountMasterDeleteBtn     + "  Value Expected : " + expAccountMasterDeleteBtn);
			System.out.println("Close Value Actual      : " + actAccountMasterCloseBtn      + "  Value Expected : " + expAccountMasterCloseBtn);
			System.out.println("Expand Value Actual     : " + actAccountMasterExpandBtn     + "  Value Expected : " + expAccountMasterExpandBtn);
			
			System.out.println("ItemRibbon  Acutal   : "+actItemRibbon);
			System.out.println("ItemRibbon  Expected : "+expItemRibbon);
			
			
			excelReader.setCellData(xlfile, xlSheetName, 427, 8, actItemLabel);
			excelReader.setCellData(xlfile, xlSheetName, 428, 8, actItemRibbon);
		
				
			if (actItemLabel.equalsIgnoreCase(expItemLabel) 
					&&  actAccountMasterNewBtn == expAccountMasterNewBtn 
					&& actAccountMasterAddGroupBtn == expAccountMasterAddGroupBtn
					&& actAccountMasterEditBtn == expAccountMasterEditBtn
					&& actAccountMasterCloneBtn == expAccountMasterCloneBtn
					&& actAccountMasterPropertiesBtn == actAccountMasterPropertiesBtn
					&& actAccountMasterDeleteBtn == expAccountMasterDeleteBtn
					&& actAccountMasterCloseBtn == expAccountMasterCloseBtn
					&& actAccountMasterExpandBtn == expAccountMasterExpandBtn
					
					&& actItemRibbon.equalsIgnoreCase(expItemRibbon))
			{
				
				excelReader.setCellData(xlfile, xlSheetName, 426, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 426, 9, resFail);
				return false;
			}
				
		  }
		  catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 426, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 
	 }
			
		@FindBy(xpath ="//*[@id='ulRibbonControl']/li/span/i/parent::span")
		private static List<WebElement> itemRibbonControlExpandList;
	 
		@FindBy(xpath = "//i[@class='icon-font6 icon-delete-all']")
		public static WebElement masterDeleteAllBtn;
	 
	 public boolean checkToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {

		  excelReader = new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		  System.out.println("***************************************************** checkToolsOptionsInItemMenu  *****************************************************************");
		
		  try
		  {
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));
			masterRibbonToExpandOptions.click();
		
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));
		
			boolean actAccountMasterGroupBtn              = masterGroupBtn.isDisplayed();
			boolean actAccountMasterDeleteAllBtn          = masterDeleteAllBtn.isDisplayed();
			boolean actAccountMasterCloseAccountBtn       = masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity.isDisplayed();
			boolean actAccountMasterOpenCloseAccountBtn   = masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState.isDisplayed();
			boolean actAccountMasterAdvanceImortExportBtn = masterAdvanceMasterImportORExportBtn.isDisplayed();
			boolean actUnitConversionBtn                  = itemUnitConversionBtn.isDisplayed();
			boolean actAccountMasterAuthorInfoBtn         = masterAuthorInfoBtn.isDisplayed();
			boolean actAccountMasterMoveUpBtn             = masterMoveUpBtn.isDisplayed();
			boolean actAccountMasterMoveDownBtn           = masterMoveDownBtn.isDisplayed();
			boolean actAccountMasterSortBtn               = masterSortBtn.isDisplayed();
			boolean actAccountMasterMassUpdateBtn         = masterMassUpdateBtn.isDisplayed();
			boolean actAccountMasterImportFromXMLBtn      = masterImportFromXmlBtn.isDisplayed();
		
			boolean expAccountMasterGroupBtn              = true;
			boolean expAccountMasterDeleteAllBtn          = true;
			boolean expAccountMasterCloseAccountBtn       = true;
			boolean expAccountMasterOpenCloseAccountBtn   = true;
			boolean expAccountMasterAdvanceImortExportBtn = true;
			boolean expUnitConversionBtn                  = true;
			boolean expAccountMasterAuthorInfoBtn         = true;
			boolean expAccountMasterMoveUpBtn             = true;
			boolean expAccountMasterMoveDownBtn           = true;
			boolean expAccountMasterSortBtn               = true;
			boolean expAccountMasterMassUpdateBtn         = true;
			boolean expAccountMasterImportFromXMLBtn      = true;
				
	        ArrayList<String> actRibbonControlExpandList= new ArrayList<String>();
			
			int count = itemRibbonControlExpandList.size();
			
			System.err.println("count   :"+count);
			
			for (int i=0;i<count;i++)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
				masterRibbonControlNextBtn.click();
				
				String data=itemRibbonControlExpandList.get(i).getText();
				actRibbonControlExpandList.add(data);
			}
			
			String actItemRibbonExpand = actRibbonControlExpandList.toString();
			
			String expItemRibbonExpand = "[Group, Modifier, Set Type, Delete All, Close Item, Open Close Item, Advance Master Import/Export, Unit Conversion, Auth Info, Move Up, Move Down, Sort, Mass Update, Export Format To XML, Customize Master, Customize View, Customize Tree, Alternate Item, Related Item, Stock Ledger, Budget, Back Track, Transfer, Print]";
						
			System.out.println("actItemRibbonExpand   : "+ actItemRibbonExpand);
			
			System.out.println("expItemRibbonExpand   : "+ expItemRibbonExpand);		
			
			System.out.println("Group Value Actual                    : " + actAccountMasterGroupBtn +             "  Value Expected : " + expAccountMasterGroupBtn);
		    System.out.println("Delete All Value Actual               : " + actAccountMasterDeleteAllBtn+          "  Value Expected : " + expAccountMasterDeleteAllBtn);
			System.out.println("Close Value Actual                    : " + actAccountMasterCloseAccountBtn+       "  Value Expected : " + expAccountMasterCloseAccountBtn);
			System.out.println("Advance Import Export Value Actual    : " + actAccountMasterAdvanceImortExportBtn+ "  Value Expected : " + expAccountMasterAdvanceImortExportBtn);
			System.out.println("Unit Conversion Value Actual          : " + actUnitConversionBtn +                 "  Value Expected : " + expUnitConversionBtn);
			System.out.println("Authorize Info Value Actual           : " + actAccountMasterAuthorInfoBtn+         "  Value Expected : " + expAccountMasterAuthorInfoBtn);
			System.out.println("Move Down Value Actual                : " + actAccountMasterMoveDownBtn+           "  Value Expected : " + expAccountMasterMoveDownBtn);
			System.out.println("Move Up Value Acttual                 : " + actAccountMasterMoveUpBtn+             "  Value Expected : " + expAccountMasterMoveUpBtn);
			System.out.println("Sort Value Actual                     : " + actAccountMasterSortBtn +              "  Value Expected : " + expAccountMasterSortBtn);
			System.out.println("Import XML Value Actual               : " + actAccountMasterImportFromXMLBtn+      "  Value Expected : " + expAccountMasterImportFromXMLBtn);

			System.out.println(" Item Ribbon Expand Get Text          : " + actItemRibbonExpand+                   "  Value Expected : " + expItemRibbonExpand);

			excelReader.setCellData(xlfile, xlSheetName, 430, 8, actItemRibbonExpand);
			
			if ( actAccountMasterGroupBtn == expAccountMasterGroupBtn
					&& actAccountMasterDeleteAllBtn == expAccountMasterDeleteAllBtn
					&& actAccountMasterCloseAccountBtn == expAccountMasterCloseAccountBtn
					&& actAccountMasterOpenCloseAccountBtn == expAccountMasterOpenCloseAccountBtn
					&& actAccountMasterAdvanceImortExportBtn == expAccountMasterAdvanceImortExportBtn
					&& actAccountMasterAuthorInfoBtn == expAccountMasterAuthorInfoBtn
					&& actAccountMasterMoveUpBtn == expAccountMasterMoveUpBtn
					&& actAccountMasterMoveDownBtn == expAccountMasterMoveDownBtn
					&& actAccountMasterSortBtn == expAccountMasterSortBtn
					&& actAccountMasterMassUpdateBtn == expAccountMasterMassUpdateBtn
					&& actAccountMasterImportFromXMLBtn == expAccountMasterImportFromXMLBtn
					
					&& actItemRibbonExpand.equalsIgnoreCase(expItemRibbonExpand))
			{
				
				excelReader.setCellData(xlfile, xlSheetName, 429, 9, resPass);
				return true;
			}
			else
			{
				
				excelReader.setCellData(xlfile, xlSheetName, 429, 9, resFail);
				return false;
			}
				
		  }
		  catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 429, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 
	 }
		
	 public boolean checkOtherToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {

	  excelReader = new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  System.out.println("***************************************************** checkOtherToolsOptionsOnClickMasterExpandOptionsInItemMasterPageu  *****************************************************************");

	  try
	  {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));
		masterRibbonControlNextBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterCustamizeMasterBtn));

		boolean actAccountMasterExportFormatToXMLBtn = masterExportFormatToXmlBtn.isDisplayed();
		boolean actAccountMasterCustomizeMasterBtn   = masterCustamizeMasterBtn.isDisplayed();
		boolean actAccountMasterCustomizeViewBtn     = masterCustamizeViewBtn.isDisplayed();
		boolean actAccountMasterCustomizeTreeBtn     = mastercustamizeTreeBtn.isDisplayed();
		boolean actAccountMasterLedgerBtn            = itemLedgerBtn.isDisplayed();
		boolean actAlertnateProductBtn               = itemAlternateProductBtn.isDisplayed();
		boolean actRelatedProduct                    = itembtnRelatedProductBtn.isDisplayed();
		boolean actAccountMasterBudgetBtn            = masterBudgetBtn.isDisplayed();
		boolean actAccountMasterBacktrackBtn         = masterBackTrackBtn.isDisplayed();
		boolean actAccountMasterTransferBtn          = itemTransferBtn.isDisplayed();

		boolean expAccountMasterExportFormatToXMLBtn = true;
		boolean expAccountMasterCustomizeMasterBtn   = true;
		boolean expAccountMasterCustomizeViewBtn     = true;
		boolean expAccountMasterCustomizeTreeBtn     = true;
		boolean expAccountMasterLedgerBtn            = true;
		boolean expAlertnateProductBtn               = true;
		boolean expRelatedProduct                    = true;
		boolean expAccountMasterBudgetBtn            = true;
		boolean expAccountMasterBacktrackBtn         = true;
		boolean expAccountMasterTransferBtn          = true;

		   ArrayList<String> actRibbonControlExpandList= new ArrayList<String>();
			
			int count = itemRibbonControlExpandList.size();
			System.err.println("count   :"+count);
			
			for (int i=0;i<count;i++)
			{
				String data=itemRibbonControlExpandList.get(i).getText();
				actRibbonControlExpandList.add(data);
			}
			
			String actItemRibbonExpand = actRibbonControlExpandList.toString();
			
			String expItemRibbonExpand = excelReader.getCellData(xlSheetName, 432, 7);
			
			
			
			System.out.println("actItemRibbonExpand   : "+actItemRibbonExpand);
			
			System.out.println("expItemRibbonExpand   : "+expItemRibbonExpand);		
		
		
			System.out.println("Export XML Value Actual                     : " + actAccountMasterExportFormatToXMLBtn+ " Value Expected : " + expAccountMasterExportFormatToXMLBtn);
			System.out.println("Customize Master Option Value Actual        : " + actAccountMasterCustomizeMasterBtn+   " Value Expected : " + expAccountMasterCustomizeMasterBtn);
			System.out.println("Customize View Option Value Actual          : " + actAccountMasterCustomizeViewBtn+     " Value Expected : " + expAccountMasterCustomizeViewBtn);
			System.out.println("Customize Tree Option Value Actual          : " + actAccountMasterCustomizeTreeBtn+     " Value Expected : " + expAccountMasterCustomizeTreeBtn);
			System.out.println("Legder Option Value Actual                  : " + actAccountMasterLedgerBtn+            " Value Expected : " + expAccountMasterLedgerBtn);
			System.out.println("Manage Credit Option Value Actual           : " + actAlertnateProductBtn+               " Value Expected : " + expAlertnateProductBtn);
			System.out.println("Department Approriation Option Value Actual : " + actRelatedProduct +                   " Value Expected : " + expRelatedProduct);
			System.out.println("Budget Option Value Actual                  : " + actAccountMasterBudgetBtn+            " Value Expected : " + expAccountMasterBudgetBtn);
			System.out.println("BackTrack Option Value Actual               : " + actAccountMasterBacktrackBtn+         " Value Expected : " + expAccountMasterBacktrackBtn);
			System.out.println("Transfer Option Value Actual                : " + actAccountMasterTransferBtn+          " Value Expected : " + expAccountMasterTransferBtn);
		
			System.out.println(" Item Ribbon Expand Get Text          : " + actItemRibbonExpand+                   "  Value Expected : " + expItemRibbonExpand);

		excelReader.setCellData(xlfile, xlSheetName, 432, 8, actItemRibbonExpand);
		
		
		if(actAccountMasterCustomizeMasterBtn == expAccountMasterCustomizeMasterBtn
				&& actAccountMasterCustomizeViewBtn == expAccountMasterCustomizeViewBtn
				&& actAccountMasterCustomizeTreeBtn == expAccountMasterCustomizeTreeBtn
				&& actAccountMasterLedgerBtn == expAccountMasterLedgerBtn
				&& actAlertnateProductBtn == expAlertnateProductBtn && actRelatedProduct == expRelatedProduct
				&& actAccountMasterBudgetBtn == expAccountMasterBudgetBtn
				&& actAccountMasterBacktrackBtn == expAccountMasterBacktrackBtn
				&& actAccountMasterTransferBtn == expAccountMasterTransferBtn)
		{
			
			excelReader.setCellData(xlfile, xlSheetName, 431, 9, resPass);
			return true;
		}
		else
		{
			
			excelReader.setCellData(xlfile, xlSheetName, 431, 9, resPass);
			return false;
		}
	  }
	  catch (Exception e) 
	  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 431, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	  }
	 }
			
	 @FindBy(xpath = "//*[@id='oncheckaccorderan']")
	 public static WebElement masterOptionToHideAccountsGroupTree; 
			
			
	  public static boolean checkTreeViewOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  excelReader = new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  
		 System.out.println("***********  checkTreeViewOptionsAvailableInItemMastersPage Method Executes............ ********************");

		 try
		 {
			 
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));
			boolean actAccountMasterTreeIdDropdownIsDisplay        = masterTreeIdDropdown.isDisplayed();
			
			Select MasterId=new Select(masterTreeIdDropdown);
			String actAccountMasterTreeIdDropdownGetText           = MasterId.getFirstSelectedOption().getText();
			
			boolean actAccountMasterTreeIDToggleBtnIsDisplay       = masterTreeIDToggleBtn.isDisplayed();
			boolean actAccountMasterTreeViewIDDropdownIsDisplay    = masterTreeViewIDDropdown.isDisplayed();
			
			Select MasterTreeViewId=new Select(masterTreeViewIDDropdown);
			String actAccountMasterTreeViewIDDropdownGetText          = MasterTreeViewId.getFirstSelectedOption().getText();
			
			boolean actAccountMasterTreeViewIDToggleBtnIsDisplay   = masterTreeViewIDToggleBtn.isDisplayed();
			boolean actAccountMasterHideAccountsGroupTreeIsDisplay = masterOptionToHideAccountsGroupTree.isDisplayed();

			boolean expAccountMasterTreeIdDropdownIsDisplay        = true;
			String expAccountMasterTreeIdDropdownGetText           = excelReader.getCellData(xlSheetName, 434, 7);
			                                                        
			boolean expAccountMasterTreeIDToggleBtnIsDisplay       = true;
			boolean expAccountMasterTreeViewIDDropdownIsDisplay    = true;
			String expAccountMasterTreeViewIDDropdownGetText       = excelReader.getCellData(xlSheetName, 435, 7);
			
			boolean expAccountMasterTreeViewIDToggleBtnIsDisplay   = true;
			boolean expAccountMasterHideAccountsGroupTreeIsDisplay = true;
			

			System.out.println("Tree ID Dropdown Option Value Actual      : " +actAccountMasterTreeIdDropdownIsDisplay+       " Value Expected : " + expAccountMasterTreeIdDropdownIsDisplay);
			System.out.println("Tree ID Dropdown Option Value Actual      : " +actAccountMasterTreeIdDropdownGetText+         " Value Expected : " + expAccountMasterTreeIdDropdownGetText);
			
			System.out.println("Tree ID Toggle Option Value Actual        : " +actAccountMasterTreeIDToggleBtnIsDisplay+      " Value Expected : " + expAccountMasterTreeIDToggleBtnIsDisplay);
		
			
			System.out.println("Tree View ID Option Value Actual          : " +actAccountMasterTreeViewIDDropdownIsDisplay+    " Value Expected : " + expAccountMasterTreeViewIDDropdownIsDisplay);
			System.out.println("Tree View ID Option Value Actual          : " +actAccountMasterTreeViewIDDropdownGetText+      " Value Expected : " + expAccountMasterTreeViewIDDropdownGetText);
			
			System.out.println("Tree View ID Toggle Value Actual          : " +actAccountMasterTreeViewIDToggleBtnIsDisplay +  " Value Expected : " + expAccountMasterTreeViewIDToggleBtnIsDisplay);
			
			
			System.out.println("Hide Accounts Group Tree Value Actual     : " +actAccountMasterHideAccountsGroupTreeIsDisplay+ " Value Expected : " + expAccountMasterHideAccountsGroupTreeIsDisplay);
			
	        excelReader.setCellData(xlfile, xlSheetName, 434, 8, actAccountMasterTreeIdDropdownGetText);
			
			excelReader.setCellData(xlfile, xlSheetName, 435, 8, actAccountMasterTreeViewIDDropdownGetText);
			
			
			if ( actAccountMasterTreeIdDropdownIsDisplay == expAccountMasterTreeIdDropdownIsDisplay
					&& actAccountMasterTreeIDToggleBtnIsDisplay == expAccountMasterTreeIDToggleBtnIsDisplay
					&& actAccountMasterTreeViewIDDropdownIsDisplay == expAccountMasterTreeViewIDDropdownIsDisplay
					&& actAccountMasterTreeViewIDToggleBtnIsDisplay == expAccountMasterTreeViewIDToggleBtnIsDisplay
					&& actAccountMasterHideAccountsGroupTreeIsDisplay == expAccountMasterHideAccountsGroupTreeIsDisplay && 
					
					actAccountMasterTreeIdDropdownGetText.equalsIgnoreCase(expAccountMasterTreeIdDropdownGetText) && 
					 
					actAccountMasterTreeViewIDDropdownGetText.equalsIgnoreCase(expAccountMasterTreeViewIDDropdownGetText))
					 
					
			{
				excelReader.setCellData(xlfile, xlSheetName, 433, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 433, 9, resFail);
				return false;
			}
		  }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 433, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
		
	  
		@FindBy(xpath = "//*[@id='0']/a")
		private static WebElement accountRootAccount;
	  
	  
	  public static boolean checkDisplayOfGroupAvailableTreeStructureLeftPaneInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("**************************  checkDisplayOfGroupAvailableInAccountMastersPage Method Executes............  *******************************");
	     
	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));

	 		boolean actUnitsMasterRoot                = accountRootAccount.isDisplayed();
	 		boolean expUnitsMasterRoot                = true;
	 		
	 		String actUnitRootName=accountRootAccount.getText();
	 		String expUnitRootName=excelReader.getCellData(xlSheetName, 436, 7);
	 		
	 		System.out.println("UnitRootName   " +actUnitRootName+" Value Expected  : "+expUnitRootName);
	 		System.out.println("Open Units Master Unit Root Is Display Value Actual  : " +actUnitsMasterRoot+ " Value Expected : " +expUnitsMasterRoot);
	 		System.out.println("Root Units Text Display Value Actual          : " +actUnitRootName+            " Value Expected : " +expUnitRootName);
	 			
	 		excelReader.setCellData(xlfile, xlSheetName, 436, 8, actUnitRootName);
	 		
	 		if (actUnitsMasterRoot == expUnitsMasterRoot
	 				&& actUnitRootName.equalsIgnoreCase(expUnitRootName))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 436, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 436, 9, resFail);
	 			return false;
	 		}
	 	  }
	 	  catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 436, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	   }

	  
	  
	  @FindBy(xpath = "//span[@class='icon-reject2 theme_color']")
	  public static WebElement newErrorMessageCloseBtn;
	  
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
				newErrorMessageCloseBtn.click();
				return false;
			}
			
		 } 
		 catch (NoSuchElementException nse)
		 {
			System.err.println("CATCH BLOCK : NO SUCH ELEMENT MESSAGE IS DISPLAY  :   "+ nse.getMessage());
			return false;
		 }
	  }
	  
	  
	  @FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li")
	  private static List<WebElement> mastertreeIdList;
	  
	  

	  public static boolean checkCreateTreeToggleOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	 
	 	 System.out.println("********************* checkCreateTreeToggleOptionsAvailableInAccountMastersPage Method Executes............ *******************************");
	     
	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggleBtn)); 
	 		masterTreeIDToggleBtn.click();
	 		
	 		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		boolean expSummaryErrorMessage  = true;

	 	    System.out.println("Click on Create Tree Toggle Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	 		
	 	   ArrayList<String> actMasterIDListList= new ArrayList<String>();
			
			int count = mastertreeIdList.size();
			System.err.println("count   :"+count);
			
			for (int i=0;i<count;i++)
			{
				String data=mastertreeIdList.get(i).getText();
				actMasterIDListList.add(data);
			}
			
			String actMasterIDExpand = actMasterIDListList.toString();
			String expMasterIDExpand = excelReader.getCellData(xlSheetName, 437, 7);
			
			System.out.println("actMasterIDExpand   : "+actMasterIDExpand);
			System.out.println("expMasterIDExpand   : "+expMasterIDExpand);	
	 	    
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggle_setDefaultBtn));

	 		boolean actAccountMasterTreeCreateTreeBtn = masterTreeIDToggle_CreateTreeBtn.isDisplayed();
	 		boolean actAccountMasterTreeEditBtn       = masterTreeIDToggle_EditBtn.isDisplayed();
	 		boolean actAccountMasterTreeDeleteBtn     = masterTreeIDToggle_DeleteBtn.isDisplayed();
	 		boolean actAccountMasterTreeSetDefaultBtn = masterTreeIDToggle_setDefaultBtn.isDisplayed();

	 		boolean expAccountMasterTreeCreateTreeBtn = true;
	 		boolean expAccountMasterTreeEditBtn       = true;
	 		boolean expAccountMasterTreeDeleteBtn     = true;
	 		boolean expAccountMasterTreeSetDefaultBtn = true;

	 		System.out.println("Tree ID Dropdown Option Value Actual  : " + actAccountMasterTreeCreateTreeBtn+ " Value Expected : " + expAccountMasterTreeCreateTreeBtn);
	 		System.out.println("Tree ID Toggle Option Value Actual    : " + actAccountMasterTreeEditBtn+       " Value Expected : " + expAccountMasterTreeEditBtn);
	 		System.out.println("Tree View ID Option Value Actual      : " + actAccountMasterTreeDeleteBtn+     " Value Expected : " + expAccountMasterTreeDeleteBtn);
	 		System.out.println("Tree View ID Toggle Value Actual      : " + actAccountMasterTreeSetDefaultBtn+ " Value Expected : " + expAccountMasterTreeDeleteBtn);
	 		
	 		
	 		System.out.println("Master Item Tree ID       : " + actMasterIDExpand+ " Value Expected : " + expMasterIDExpand);
	 		 
	 		excelReader.setCellData(xlfile, xlSheetName, 437, 8, actMasterIDExpand);
	 		
	 		if (actSummaryErrorMessage==actSummaryErrorMessage
	 				&& actAccountMasterTreeCreateTreeBtn == expAccountMasterTreeCreateTreeBtn
	 				&& actAccountMasterTreeEditBtn == expAccountMasterTreeEditBtn
	 				&& actAccountMasterTreeDeleteBtn == expAccountMasterTreeDeleteBtn
	 				&& actAccountMasterTreeSetDefaultBtn==expAccountMasterTreeSetDefaultBtn && actMasterIDExpand.equalsIgnoreCase(expMasterIDExpand))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 437, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 437, 9, resFail);
	 			return false;
	 		}
	 	  }
	 	 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 437, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	 	
	  @FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li")
	  private static List<WebElement> mastertreeViewIdList;
	  

	  
	  
	  public static boolean checkCreateViewToggleOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********************** checkCreateViewToggleOptionsAvailableInUnitsMastersPage Method Executes............***********************************");

	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIDToggleBtn));
	 		masterTreeViewIDToggleBtn.click();

	  	   ArrayList<String> actMasterViewIDListList= new ArrayList<String>();
			
	 		int count = mastertreeViewIdList.size();
	 		System.err.println("count   :"+count);
	 		
	 		for (int i=0;i<count;i++)
	 		{
	 			String data=mastertreeViewIdList.get(i).getText();
	 			actMasterViewIDListList.add(data);
	 		}
	 		
	 		String actMasterViewIDExpand = actMasterViewIDListList.toString();
	 		String expMasterViewIDExpand = excelReader.getCellData(xlSheetName, 438, 7);
	 		
	 		System.out.println("actMasterViewIDExpand   : "+actMasterViewIDExpand);
	 		System.out.println("expMasterViewIDExpand   : "+expMasterViewIDExpand);	
	 		
	 		
	 		
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIdCreateViewBtn));

	 		boolean actAccountMasterTreeViewCreateViewBtn = masterTreeViewIdCreateViewBtn.isDisplayed();
	 		boolean actAccountMasterTreeViewEditViewBtn   = masterTreeeViewIdEditBtn.isDisplayed();
	 		boolean actAccountMasterTreeViewDeleteBtn     = masterTreeViewIdDeleteBtn.isDisplayed();

	 		boolean expAccountMasterTreeViewCreateViewBtn = true;
	 		boolean expAccountMasterTreeViewEditViewBtn   = true;
	 		boolean expAccountMasterTreeViewDeleteBtn     = true;

	 		System.out.println("Tree View Create View Option Value Actual : " + actAccountMasterTreeViewCreateViewBtn+ " Value Expected : " + expAccountMasterTreeViewCreateViewBtn);
	 		System.out.println("Tree View Edit View Option Value Actual   : " + actAccountMasterTreeViewEditViewBtn+   " Value Expected : " + expAccountMasterTreeViewEditViewBtn);
	 		System.out.println("Tree View Delete View Option Value Actual : " + actAccountMasterTreeViewDeleteBtn+     " Value Expected : " + expAccountMasterTreeViewDeleteBtn);

	 		excelReader.setCellData(xlfile, xlSheetName, 438, 8, actMasterViewIDExpand);
	 		
	 		if (actAccountMasterTreeViewCreateViewBtn == expAccountMasterTreeViewCreateViewBtn
	 				&& actAccountMasterTreeViewEditViewBtn == expAccountMasterTreeViewEditViewBtn
	 				&& actAccountMasterTreeViewDeleteBtn == expAccountMasterTreeViewDeleteBtn && 
	 				
	 				actMasterViewIDExpand.equalsIgnoreCase(expMasterViewIDExpand))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 438, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 438, 9, resPass);
	 			return false;
	 		}
	 	  }
	 	  catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 438, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	 	
	 
	  @FindBy(xpath = "//div[@id='divTreeMenu']")
	  private static WebElement treeUnitsDisplay;
	  
	  public static boolean checkHideUnitGroupOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********************* checkHideUnitGroupOptionsAvailableInUnitMastersPage Method Executes............*************************");

	 	 try
	 	 {
	 	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
	 	   masterOptionToHideAccountsGroupTree.click();
	 	   
	 	   boolean actSummaryErrorMessage    = checkErrorMessageIsDisplayingOrNotDisplaying();
	 	   boolean expSummaryErrorMessage    = true;

	 	   System.out.println("Click on Hide Units Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);  

	 	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeUnitsDisplay));

	 	   boolean actAccountMasterTreeUnits = treeUnitsDisplay.isDisplayed();
	 	   boolean expAccountMasterTreeUnits = true;
	 		
	 	   System.out.println("Tree View Create View Option Value Actual : " + actAccountMasterTreeUnits+ " Value Expected : " + expAccountMasterTreeUnits);

	 	   boolean actTestResult=actSummaryErrorMessage==actSummaryErrorMessage 
	 			                  && actSummaryErrorMessage == expAccountMasterTreeUnits && masterOptionToHideAccountsGroupTree.isDisplayed()==true;
	 	   
	 	   String actValue = Boolean.toString(actTestResult);
	 	   String expValue = excelReader.getCellData(xlSheetName, 439, 7);
	 	   
	 	   System.err.println(" Actual; Value : "+actValue +"  Value Expected : "+expValue);
	 	  
	 	   
	 	  excelReader.setCellData(xlfile, xlSheetName, 439, 8, actValue.toUpperCase());
	 	  
	 	   if (actValue.equalsIgnoreCase(expValue))
	 	   {
	 		    excelReader.setCellData(xlfile, xlSheetName, 439, 9, resPass);
	 			return true;
	 	   } 
	 	   else 
	 	   {
	 		  excelReader.setCellData(xlfile, xlSheetName, 439, 9, resFail);
	 			return false;
	 	   }
	 	 }
	 	 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 439, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	 	
	 	
	  public static boolean checkUnHideUnitsGroupOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********************** checkUnHideUnitsGroupOptionsAvailableInItemMastersPage Method Executes............ ******************************");
	    
	 	 try
	 	 {
	 		  
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
		    masterOptionToHideAccountsGroupTree.click();
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));
		    
			boolean actUnitsMasterRoot                = accountRootAccount.isDisplayed();
			
			boolean expUnitsMasterRoot                = true;
			
			String actUnitRootName=accountRootAccount.getText();
			
			String expUnitRootName=excelReader.getCellData(xlSheetName, 440, 7);	

			
			
			System.out.println("Open Units Master Unit Root Is Display Value Actual  : " + actUnitsMasterRoot+ " Value Expected : " + expUnitsMasterRoot);
			System.out.println("Root Units Text Display Value Actual          : " + actUnitRootName+            " Value Expected : " + expUnitRootName);
				
			excelReader.setCellData(xlfile, xlSheetName, 440, 8, actUnitRootName);
			
			if (actUnitsMasterRoot == expUnitsMasterRoot
					&& actUnitRootName.equalsIgnoreCase(expUnitRootName))
			{
				 excelReader.setCellData(xlfile, xlSheetName, 440, 9, resPass);
				 return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 440, 9, resFail);
				return false;
			}
		  }
	 	 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 440, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
		   
	 	 }
	 	
	 	
	  @FindBy(xpath="//*[@id='divSearchControls']/div//div/a")
	  private static List<WebElement> masterItemSearchControlList;
	  
	  @FindBy(xpath = "//*[@id='txtsrch-term']")
		public static WebElement masterSearchTxt;
	  
	  @FindBy(xpath = "//input[@id='cmbUserTypeMaster']")
		public static WebElement mastercmbMasterTxt;
	  
	  @FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_image']/span")
		public static WebElement masterCmbMasterExpansionBtn;
	  
	  @FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_settings']/span")
		public static WebElement masterCumMasterSettingBtn;


		@FindBy(xpath = "//input[@id='chkRetainSelection']")
		public static WebElement masterRetainSelectionCheckBox;

		@FindBy(xpath = "//*[@id='btnsideBar']")
		public static WebElement masterSideBarBtn;
		
	  public static boolean checkHeaderFieldsOptionsAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("********************** checkHeaderFieldsOptionsAvailableInItemMastersPage Method Executes............ **********************************");

	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));

	 		
	 		String actAccountMasterSearchGetText               = masterSearchTxt.getAttribute("placeholder");
	 		
	 		String expAccountMasterSearchGetText               = excelReader.getCellData(xlSheetName, 441, 7);
	 		
	 		boolean actAccountMasterSearchBtn                  = masterSearchBtn.isDisplayed();
	 		boolean actAccountMasterCmbMasterTxt               = mastercmbMasterTxt.isDisplayed();
	 		boolean actAccountMasterCmbMasterExpansionBtn      = masterCmbMasterExpansionBtn.isDisplayed();
	 		boolean actAccountMasterCmbMasterSettingsBtn       = masterCumMasterSettingBtn.isDisplayed();
	 		boolean actAccountMasterRetainSelectionCheckbox    = masterRetainSelectionCheckBox.isDisplayed();
	 		boolean actAccountMasterSideBarBtn                 = masterSideBarBtn.isDisplayed();
	 		
	 		ArrayList<String> actmasterItemSearchControlList= new ArrayList<String>();
	 		
	  		int count = masterItemSearchControlList.size();
	  		System.err.println("count   :"+count);
	  		
	  		for (int i=0;i<count;i++)
	  		{
	  			String data=masterItemSearchControlList.get(i).getAttribute("title");
	  			actmasterItemSearchControlList.add(data);
	  		}
	  		
	  		String actControlList = actmasterItemSearchControlList.toString();
	  		String expControlList = excelReader.getCellData(xlSheetName, 442, 7);
	  		
	  		System.out.println("actControlList   : "+actControlList);
	  		System.out.println("expControlList   : "+expControlList);

	 		
	 		boolean expAccountMasterSearchBtn                  = true;
	 		boolean expAccountMasterCmbMasterTxt               = true;
	 		boolean expAccountMasterCmbMasterExpansionBtn      = true;
	 		boolean expAccountMasterCmbMasterSettingsBtn       = true;
	 		boolean expAccountMasterRetainSelectionCheckbox    = true;
	 		boolean expAccountMasterSideBarBtn                 = true;

	 		
	 		System.out.println("Search Button Value Actual           : "+ actAccountMasterSearchBtn+                  " Value Expected : " + expAccountMasterSearchBtn);
	 		System.out.println("Comb Box Value Actual                : "+ actAccountMasterCmbMasterTxt+               " Value Expected : " + expAccountMasterCmbMasterTxt);
	 		System.out.println("Combo Box Expansion Value Actual     : "+ actAccountMasterCmbMasterExpansionBtn+      " Value Expected : " + expAccountMasterCmbMasterExpansionBtn);
	 		System.out.println("Combo Box Settings Value Actual      : "+ actAccountMasterCmbMasterSettingsBtn+       " Value Expected : " + expAccountMasterCmbMasterSettingsBtn);
	 		System.out.println("Selection Check Box Value Actual     : "+ actAccountMasterRetainSelectionCheckbox+    " Value Expected : " + expAccountMasterRetainSelectionCheckbox);
	 		System.out.println("Side Bar Value Actual                : "+ actAccountMasterSideBarBtn+                 " Value Expected : " + expAccountMasterSideBarBtn);
	 		
	 		System.out.println("AccountMasterSearchGetText          : "+actAccountMasterSearchGetText +"  Value Expected  : "+expAccountMasterSearchGetText);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 441, 8, actAccountMasterSearchGetText);
	 		excelReader.setCellData(xlfile, xlSheetName, 442, 8, actControlList);
	 		
	 		
	 		boolean actTestResult= actAccountMasterSearchBtn == expAccountMasterSearchBtn
					 				&& actAccountMasterCmbMasterTxt == expAccountMasterCmbMasterTxt
					 				&& actAccountMasterCmbMasterExpansionBtn == expAccountMasterCmbMasterExpansionBtn
					 				&& actAccountMasterCmbMasterSettingsBtn == expAccountMasterCmbMasterSettingsBtn
			 						&& actAccountMasterRetainSelectionCheckbox == expAccountMasterRetainSelectionCheckbox
			 		 				&& actAccountMasterSideBarBtn == expAccountMasterSideBarBtn;
	 		
	 		String actDispalyResult=Boolean.toString(actTestResult);
	 		String expDispalyResult=excelReader.getCellData(xlSheetName, 443, 7);	
	 		
	 		System.err.println("DispalyResult  "+actDispalyResult +" Value Expected : "+expDispalyResult);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 443, 8, actDispalyResult);
	 		
	 		
	 		if(actDispalyResult.equalsIgnoreCase(expDispalyResult) && actControlList.equalsIgnoreCase(expControlList) 
	 				&& actAccountMasterSearchGetText.equalsIgnoreCase(expAccountMasterSearchGetText)) 
	 		
	 		{
	 			 excelReader.setCellData(xlfile, xlSheetName, 441, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			 excelReader.setCellData(xlfile, xlSheetName, 441, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 441, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	 	
	 	


		
	@FindBy(xpath="//*[@id='btnSearchAcc']/ol/li")
	private static List<WebElement> masterSearchList;  
	  
	  
	  public static boolean checkSearchOptionAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  
	 	 System.out.println("*************************** checkSearchOptionAvailableInItemMastersPage Method Executes............ ********************************");

	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));
	 		masterSearchBtn.click();

	 		boolean actSummaryErrorMessage                      = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		boolean expSummaryErrorMessage                      = true;

	 		System.out.println("Click on Search Button Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	 		
	        ArrayList<String> actmasterSearchList= new ArrayList<String>();
	 		
	  		int count = masterSearchList.size();
	  		System.err.println("count   :"+count);
	  		
	  		for (int i=0;i<count;i++)
	  		{
	  			String data=masterSearchList.get(i).getText();
	  			actmasterSearchList.add(data);
	  		}
	  		
	  		String actSearchList = actmasterSearchList.toString();
	  		String expSearchList = excelReader.getCellData(xlSheetName, 444, 7);
	  		
	  		System.out.println("actSearchList   : "+actSearchList);
	  		System.out.println("expSearchList   : "+expSearchList);
	 		
	  		excelReader.setCellData(xlfile, xlSheetName, 444, 8, actSearchList);
	  		
	 		if (actSearchList.equalsIgnoreCase(expSearchList) && actSummaryErrorMessage==expSummaryErrorMessage)
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 444, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			 excelReader.setCellData(xlfile, xlSheetName, 444, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 444, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	 	

		@FindBy(xpath = "//*[@id='landgridData']/thead/tr/th[2]")
		public static WebElement masterItemGridHeader_SelectAll;

		@FindBy(xpath = "//*[@id='landgridData']/thead/tr/th[3]")
		public static WebElement masterItemGridHeader_MasterId;

		@FindBy(xpath = "//*[@id='landgridData']/thead/tr/th[4]")
		public static WebElement masterItemGridHeader_Name;
		
		@FindBy(xpath = "//*[@id='landgridData']/thead/tr/th[5]")
		public static WebElement masterItemGridHeader_Code;
		
		@FindBy(xpath ="//*[@id='landgridData']/thead/tr/th")
		public static List<WebElement> masterItemHeaderList;
		
		
		@FindBy(xpath = "//th[2]//span[1]")
		public static WebElement masterGrid_Header_SelectTxt;
	  public static boolean checkItemDisplayTableColumnNamesAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  		 
	 	 System.out.println("************************* checkItemDisplayTableColumnNamesAvailableInItemMastersPage Method Executes............ *************************");
	 		
	 	 try
	 	 {
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGrid_Header_SelectTxt));
	 		boolean actAccountMasterGridSelectTxt = masterGrid_Header_SelectTxt.isDisplayed();
	 		masterGrid_Header_SelectTxt.click();

	 		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
	 		boolean expSummaryErrorMessage  = true;

	 		System.out.println("Click on Master Grid Header Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
	 		
	 		
	 		ArrayList<String> actmasterItemHeaderList=new ArrayList<String>();
	 		
	 		int HeaderCount =masterItemHeaderList.size();
	 		
	 		System.err.println("HeaderCount   :  "+HeaderCount);
	 		
	 		for (int i = 0; i < HeaderCount; i++) 
	 		{
				String data=masterItemHeaderList.get(i).getText();
				actmasterItemHeaderList.add(data);
			}
	 		
	 	
	 		String actMasterItemHeaderTextList=actmasterItemHeaderList.toString();
	 		String expMasterItemHeaderTextList=excelReader.getCellData(xlSheetName, 445, 7);
	 		
	 		System.out.println("actMasterItemHeaderTextList"+actMasterItemHeaderTextList);
	 		System.out.println("expMasterItemHeaderTextList"+expMasterItemHeaderTextList);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 445, 8, actMasterItemHeaderTextList);
	 		
	 		if (actSummaryErrorMessage==expSummaryErrorMessage && actMasterItemHeaderTextList.equalsIgnoreCase(expMasterItemHeaderTextList))
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 445, 9, resPass);
	 			return true;
	 		} 
	 		else 
	 		{
	 			excelReader.setCellData(xlfile, xlSheetName, 445, 9, resFail);
	 			return false;
	 		}
	 	 }
	 	 catch (Exception e) 
	 	  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 445, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	 	

		@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[12]")
		public static List<WebElement> masterItemNameList;

		@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[13]")
		public static List<WebElement> masterItemCodeList;
	  

		
		@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[10]")
		public static List<WebElement> masterDepNameList;
		
		@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[11]")
		public static List<WebElement> masterDepCodeList;

		
		
		
	  
	  public static boolean checkItemDisplayTableColumnValuesAvailableInItemMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		  		 
	    System.out.println("********************** checkItemDisplayTableColumnValuesAvailableInItemMastersPage Method Executes............ **************************");
	 	
	    try
	    {
	       String actmasterGridBodyList=clickOnEmptyGroup.getText();
	  	   	
	   	   String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 341, 7);
	   	   	
	   	   excelReader.setCellData(xlfile, xlSheetName, 341, 8, actmasterGridBodyList);
	   	   	
	   	   System.out.println("masterGridBodyList Actual   : "+actmasterGridBodyList);
	   	   System.out.println("masterGridBodyList Expected : "+expmasterGridBodyList);
	   	   	
	   	   if(actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList))
		   {
		    		excelReader.setCellData(xlfile, xlSheetName, 446, 9, resPass);
		 		return true;
		   } 
		   else 
		   {
		 		excelReader.setCellData(xlfile, xlSheetName, 446, 9, resFail);
		 		return false;
		   }
	    }
	    catch (Exception e) 
		{
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 446, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			  return false;
	    }
	  }
	   
	   	
		

		@FindBy(xpath ="//*[@id='GenerateNewMasterModel']/div/div[2]/div[1]/ul/li")
		public static List<WebElement> itemNewHeaderTabList;
	  
	 public boolean checkNewButtonOnClickToDisplayItemCreationPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	   excelReader=new ExcelReader(POJOUtility.getExcelPath());
	   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	 
	   System.out.println("***************************** checkClickOnNewButtonToDisplayItemCreationPageInTheItemMasterPage  ********************************************");
		
	   try
	   {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
			itemNewBtn.click();
			

	        ArrayList<String> actitemNewHeaderTabList=new ArrayList<String>();
	 		
	 		int NewTabList =itemNewHeaderTabList.size();
	 		
	 		System.err.println("NewTabList   :  "+NewTabList);
	 		
	 		for (int i = 0; i < NewTabList; i++) 
	 		{
				String data=itemNewHeaderTabList.get(i).getText();
				actitemNewHeaderTabList.add(data);
			}
	 		
	 	
	 		String actMasterItemNewTabList=actitemNewHeaderTabList.toString();
	 		String expMasterItemNewTabList=excelReader.getCellData(xlSheetName, 450, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 450, 8, actMasterItemNewTabList);
	    	
	    	System.err.println("  Actual MasterItemNewTabList : "+actMasterItemNewTabList);
	    	System.err.println("  Expected  MasterItemNewTabList : "+expMasterItemNewTabList);
			
			
			if(actMasterItemNewTabList.equalsIgnoreCase(expMasterItemNewTabList))
			{
				excelReader.setCellData(xlfile, xlSheetName, 449, 9, resPass);
				return true;
			}
		    else 
		    {
		    	excelReader.setCellData(xlfile, xlSheetName, 449, 9, resFail);
				return false;
			}
	   }
	   catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 449, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }	
	  }
		     
		     

	 

		@FindBy(xpath ="//*[@id='newMasterDiv0']/div/div/div[2]/parent::div/div[1]")
		public static List<WebElement> itemNewBodyFieldsList;
		     
	 public boolean checkGeneralTabInItemMasterCreationPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		System.out.println("******************************** checkGeneralTabInItemMasterCreationPage  *******************************************************");
		
		try
		{
			
	        ArrayList<String> actitemNewBodyFieldsList=new ArrayList<String>();
	 		
	 		int BodyFielddList =itemNewBodyFieldsList.size();
	 		
	 		System.err.println("BodyFielddList   :  "+BodyFielddList);
	 		
	 		for (int i = 0; i < BodyFielddList; i++) 
	 		{
				String data=itemNewBodyFieldsList.get(i).getText();
				actitemNewBodyFieldsList.add(data);
			}
	 		
	 	
	 		String actMasterItemNewFieldList=actitemNewBodyFieldsList.toString();
	 		String expMasterItemNewFieldList=excelReader.getCellData(xlSheetName, 452, 7);
	 		
	 		excelReader.setCellData(xlfile, xlSheetName, 452, 8, actMasterItemNewFieldList);
	    	
	    	System.err.println("  Actual MasterItemNewFieldList : "+actMasterItemNewFieldList);
	    	System.err.println("  Expected  MasterItemNewTabList : "+expMasterItemNewFieldList);
			
			
			if(actMasterItemNewFieldList.equalsIgnoreCase(expMasterItemNewFieldList))
			{
				excelReader.setCellData(xlfile, xlSheetName, 451, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 451, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 451, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }	
	 }

	 
	 @FindBy(xpath ="//*[@id='newMasterDiv1']/div/div/div/label")
	 public static List<WebElement> itemNewUnitBodyFieldsList;
	 
	 
	  public boolean checkUnitsTabInItemMasterCreationPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    	 
		 System.out.println("****************************************************** checkUnitsTabInItemMasterCreationPage  **********************************************************");
		 
		 try
		 {
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewUnitsBtn));
			ItemNewUnitsBtn.click();
		
			Thread.sleep(2000);
			
			ArrayList<String> actitemNewUnitBodyFieldsList=new ArrayList<String>();
		 		
	 		int BodyFielddList =itemNewUnitBodyFieldsList.size();
		 		
		 	System.err.println("BodyFielddList   :  "+BodyFielddList);
		 		
		 	for (int i = 1; i < BodyFielddList; i++) 
		 	{
				String data=itemNewUnitBodyFieldsList.get(i).getText();
				actitemNewUnitBodyFieldsList.add(data);
			}
		 		
		 	
		 	String actMasterItemNewUnitFieldList=actitemNewUnitBodyFieldsList.toString();
		 	String expMasterItemNewUnitFieldList=excelReader.getCellData(xlSheetName, 454, 7);
		 		
		 	excelReader.setCellData(xlfile, xlSheetName, 454, 8, actMasterItemNewUnitFieldList);
		    	
		    System.err.println("  Actual MasterItemNewFieldList : "+actMasterItemNewUnitFieldList);
		    System.err.println("  Expected  MasterItemNewTabList : "+expMasterItemNewUnitFieldList);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultPurchaseUnitSettingsBtn));
			boolean actUnitsBaseUnit              = itemUnitsDefaultBaseUnitDropdown.isDisplayed();
			boolean actUnitBaseUnitSettings       = itemUnitsDefaultBaseUnitSetting.isDisplayed();
			boolean actUnitSalesUnit              = itemUnitsDefaultSalesUnitDropdown.isDisplayed();
			boolean actUnitSalesUnitSettings      = itemUnitsDefaultSalesUnitSettingsBtn.isDisplayed();
			boolean actUnitsPurchase              = itemUnitsDefaultPurchaseUnitDropDown.isDisplayed();
			boolean actUnitsPurchaseSettings      = itemUnitsDefaultPurchaseUnitSettingsBtn.isDisplayed();
			boolean actUnitsLength                = itemUnitsLength.isDisplayed();
			boolean actUnitsWidth                 = itemUnitswidth.isDisplayed();
			boolean actUnitHeight                 = itemUnitsHeight.isDisplayed();
			boolean actUnitsWeight                = itemUnitsWeight.isDisplayed();

			boolean expUnitsBaseUnit              = true;
			boolean expUnitBaseUnitSettings       = true;
			boolean expUnitSalesUnit              = true;
			boolean expUnitSalesUnitSettings      = true;
			boolean expUnitsPurchase              = true;
			boolean expUnitsPurchaseSettings      = true;
			boolean expUnitsLength                = true;
			boolean expUnitsWidth                 = true;
			boolean expUnitHeight                 = true;
			boolean expUnitsWeight                = true;
			
			System.out.println("Base Unit Value Actual              :  " + actUnitsBaseUnit +         " Value Expected :  " + expUnitsBaseUnit);
			System.out.println("Base Unit Settings Value Actual     :  " + actUnitBaseUnitSettings +  " Value Expected :  " + expUnitBaseUnitSettings);
			System.out.println("Sale Unit Value Actual              :  " + actUnitSalesUnit +         " Value Expected :  " + expUnitSalesUnit);
			System.out.println("Sale Unit Settings Value Actual     :  " + actUnitSalesUnitSettings + " Value Expected :  " + expUnitSalesUnitSettings);
			System.out.println("Purchase Unit Value Actual          :  " + actUnitsPurchase +         " Value Expected :  " + expUnitsPurchase);
			System.out.println("Purchase Unit Settings Value Actual :  " + actUnitsPurchaseSettings + " Value Expected :  " + expUnitsPurchaseSettings);
			System.out.println("Unis Length Value Actual            :  " + actUnitsLength +           " Value Expected :  " + expUnitsLength);
			System.out.println("Units Width Value Actual            :  " + actUnitsWidth +            " Value Expected :  " + expUnitsWidth);
			System.out.println("Units Height Value Actual           :  " + actUnitHeight +            " Value Expected :  " + expUnitHeight);
			System.out.println("Units Weight Value Actual           :  " + actUnitsWeight +           " Value Expected :  " + expUnitsWeight);
			
			boolean TestResult=actUnitsBaseUnit == actUnitsBaseUnit && actUnitBaseUnitSettings == expUnitBaseUnitSettings
								&& actUnitSalesUnit == expUnitSalesUnit && actUnitSalesUnitSettings == expUnitSalesUnitSettings
								&& actUnitsPurchase == expUnitsPurchase && actUnitsPurchaseSettings == expUnitsPurchaseSettings
								&& actUnitsLength == expUnitsLength && actUnitsWidth == expUnitsWidth && actUnitHeight == expUnitHeight
								&& actUnitsWeight == expUnitsWeight;
			
			
			String actNewUnitBodyFileds=Boolean.toString(TestResult);
			String expNewUnitBodyFileds=excelReader.getCellData(xlSheetName, 455, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 455, 8, actNewUnitBodyFileds.toUpperCase());
					
		    System.err.println("Actual NewUnitBodyFileds       : "+actNewUnitBodyFileds);
		    System.err.println("Expected NewUnitBodyFileds       : "+expNewUnitBodyFileds);
			
			if (actNewUnitBodyFileds.equalsIgnoreCase(expNewUnitBodyFileds) && 
					actMasterItemNewUnitFieldList.equalsIgnoreCase(expMasterItemNewUnitFieldList))
			{
				excelReader.setCellData(xlfile, xlSheetName, 453, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 453, 9, resPass);
				return false;
			}
		 }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 453, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }	
		
	 }
			

	  @FindBy(xpath ="//*[@id='newMasterDiv2']/div/div/div/label")
	  public static List<WebElement> itemNewSettingsBodyFieldsList;

		
	  public boolean checkSettingTabInItemMasterCreationPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		  
	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	    	
	  	System.out.println("****************************************************** checkSettingsTabsOptions  **********************************************************");
	    
	  	try
	  	{
	      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewSettingsBtn));
		  ItemNewSettingsBtn.click();
			
		  Thread.sleep(2000);
		  
		  
		  
		   ArrayList<String> actitemNewSettingsBodyFieldsList=new ArrayList<String>();
			
			int SettingsBodyFielddList =itemNewSettingsBodyFieldsList.size();
		 		
		 	System.err.println("SettingsBodyFielddList   :  "+SettingsBodyFielddList);
		 		
			 	for (int i = 1; i < SettingsBodyFielddList; i++) 
			 	{
					String data=itemNewSettingsBodyFieldsList.get(i).getText();
					actitemNewSettingsBodyFieldsList.add(data);
				}
			 		
			 	String actMasterItemNewSettingsFieldList=actitemNewSettingsBodyFieldsList.toString();
			 	String expMasterItemNewSettingsFieldList=excelReader.getCellData(xlSheetName, 457, 7);
			 		
			 	excelReader.setCellData(xlfile, xlSheetName, 457, 8, actMasterItemNewSettingsFieldList);
			    	
			    System.err.println("  Actual MasterItemNewFieldList : "+actMasterItemNewSettingsFieldList);
			    System.err.println("  Expected  MasterItemNewTabList : "+expMasterItemNewSettingsFieldList);
			
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(NewSettingsOverheadCost));

		  boolean actStandardCost               = NewSettingsStandardCost.isDisplayed();
		  boolean actOverheadCost               = NewSettingsOverheadCost.isDisplayed();
		  boolean actIndirectCost               = NewSettingsIndirectCost.isDisplayed();
		  boolean actProfit                     = NewSettingsProfit.isDisplayed();
		  boolean actDoNotShowProductExpiryDays = NewSettingsDontshowproductexpireddays.isDisplayed();
		  boolean actTaxCode                    = NewSettingsTaxCode.isDisplayed();

		  boolean expStandardCost               = true;
		  boolean expOverheadCost               = true;
		  boolean expIndirectCost               = true;
		  boolean expProfit                     = true;
		  boolean expDoNotShowProductExpiryDays = true;
		  boolean expTaxCode                    = true;


		 System.out.println("General Tab Value Actual         :  " + actStandardCost +              " Value Expected :  " + expStandardCost);
		 System.out.println("Unit Tab Value Actual            :  " + actOverheadCost +              " Value Expected :  " + expOverheadCost);
		 System.out.println("Settings Tab Value Actual        :  " + actIndirectCost +              " Value Expected :  " + expIndirectCost);
		 System.out.println("Classification Tab Value Actual  :  " + actProfit +                    " Value Expected :  " + expProfit);
		 System.out.println("Other Details Tab Value Actual   :  " + actDoNotShowProductExpiryDays+ " Value Expected :  " + expDoNotShowProductExpiryDays);
		 System.out.println("Replenishment Tab Value Actual   :  " + actTaxCode +                   " Value Expected :  " + expTaxCode);
		
		 
		 boolean testResult=actStandardCost == expStandardCost && actOverheadCost == actOverheadCost
								&&  actIndirectCost == expIndirectCost && actProfit == expProfit
								&& actDoNotShowProductExpiryDays == expDoNotShowProductExpiryDays && actTaxCode == expTaxCode;
		 
		 String actSettingBodyFileds=Boolean.toString(testResult);
		 String expSettingBodyFileds=excelReader.getCellData(xlSheetName, 458, 7);
		 
		excelReader.setCellData(xlfile, xlSheetName, 458, 8, actSettingBodyFileds);
		 
		 System.err.println("actSettingBodyFileds  : "+actSettingBodyFileds);
		 System.err.println("expSettingBodyFileds   : "+expSettingBodyFileds);
		 
		 
		 if (actSettingBodyFileds.equalsIgnoreCase(expSettingBodyFileds) && 
				 actMasterItemNewSettingsFieldList.equalsIgnoreCase(expMasterItemNewSettingsFieldList))
		 {
			 
			 excelReader.setCellData(xlfile, xlSheetName, 456, 9, resPass);
			return true;
		 }
		 else
		 {
			 
			 excelReader.setCellData(xlfile, xlSheetName, 456, 9, resFail);
			 return false;
		 }
	  	}
	  	catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 456, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }	
	 }
				  
	  
	  @FindBy(xpath ="//*[@id='newMasterDiv3']/div/div/div/label")
	  public static List<WebElement> itemNewClassificationBodyFieldsList;

					     
	  public boolean checkClassificationTabInItemMasterCreationPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {

	    excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  
		System.out.println("************************ checkClassificationTabInItemMasterCreationPage  ************************************");
	  
		try
		{
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewClassificationBtn));
	  	    ItemNewClassificationBtn.click();
			
	  	    Thread.sleep(1000);
	  	    
	  	    
	  	   ArrayList<String> actitemNewClassificationBodyFieldsList=new ArrayList<String>();
			
			int ClassificationBodyFielddList =itemNewClassificationBodyFieldsList.size();
		 		
		 	System.err.println("ClassificationBodyFielddList   :  "+ClassificationBodyFielddList);
		 		
			 	for (int i = 1; i < ClassificationBodyFielddList; i++) 
			 	{
					String data=itemNewClassificationBodyFieldsList.get(i).getText();
					actitemNewClassificationBodyFieldsList.add(data);
				}
			 		
			 	String actMasterItemNewClassificationFieldList=actitemNewClassificationBodyFieldsList.toString();
			 	String expMasterItemNewClassificationFieldList=excelReader.getCellData(xlSheetName, 460, 7);
			 		
			 	excelReader.setCellData(xlfile, xlSheetName, 460, 8, actMasterItemNewClassificationFieldList);
			    	
			    System.err.println("  Actual MasterItemNewClassificationFieldList : "+actMasterItemNewClassificationFieldList);
			    System.err.println("  Expected  MasterItemClassificationNewTabList : "+expMasterItemNewClassificationFieldList);
	  	    
	  	    
	  	    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newItemClassificationABC_CodeValueDropdown));

			boolean actCodeValue        = newItemClassificationABC_CodeValueDropdown.isDisplayed();
			boolean actCodeMargin       = newItemClassificationABC_CodeMarginDropdOwn.isDisplayed();
			boolean actCodeRevenue      = newItemClassificationABCCodeRevenueDropdown.isDisplayed();
			boolean actCodeCarryingCost = newItemClassificationABCCodeCarryingCostDropdown.isDisplayed();
			boolean actBarcode1         = newItemClassificationBarcode1.isDisplayed();
			boolean actBarcode2         = newItemClassificationBarcode2.isDisplayed();
			boolean actBarcode3         = newItemClassificationBarcode3.isDisplayed();
			boolean actGridUnit         = newItemgridFirstrowUnit.isDisplayed();
			boolean actGridBarcode      = newItemgridFirstrowBarcode.isDisplayed();

			boolean expCodeValue        = true;
			boolean expCodeMargin       = true;
			boolean expCodeRevenue      = true;
			boolean expCodeCarryingCost = true;
			boolean expBarcode1         = true;
			boolean expBarcode2         = true;
			boolean expBarcode3         = true;
			boolean expGridUnit         = true; 
			boolean expGridBarcode      = true;

		
			System.out.println("Code Value Value Actual          :  " + actCodeValue +        " Value Expected :  " + expCodeValue);
			System.out.println("Code Margin Value Actual         :  " + actCodeMargin +       " Value Expected :  " + expCodeMargin);
			System.out.println("CodeRevenue  Value Actual        :  " + actCodeRevenue +      " Value Expected :  " + expCodeRevenue);
			System.out.println("Classification Tab Value Actual  :  " + actCodeCarryingCost + " Value Expected :  "+ expCodeCarryingCost);
			System.out.println("CodeCarryingCost Value Actual    :  " + actBarcode1 +         " Value Expected :  " + expBarcode1);
			System.out.println("Barcode1 Value Actual            :  " + actBarcode2 +         " Value Expected :  " + expBarcode2);
			System.out.println("Barcode2 Value Actual            :  " + actBarcode3 +         " Value Expected :  " + expBarcode3);
			System.out.println("Barcode3 Value Actual            :  " + actGridUnit +         " Value Expected :  " + expGridUnit);
			System.out.println("GridBarcode Value Actual         :  " + actGridBarcode +      " Value Expected :  " + expGridBarcode);

			
			boolean TestResult =actCodeValue == expCodeValue && actCodeMargin == expCodeMargin && actCodeRevenue == expCodeRevenue
								&& actCodeCarryingCost == expCodeCarryingCost  && actBarcode1 == expBarcode1 && actBarcode2 == expBarcode2
								&& actBarcode3 == expBarcode3 && actGridUnit == expGridUnit && actGridBarcode == expGridBarcode;
			
			
			String actClassficationTab=Boolean.toString(TestResult);
			String expClassification=excelReader.getCellData(xlSheetName, 461, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 461, 8, actClassficationTab);
			
			System.err.println("actClassficationTab  : "+actClassficationTab);
			System.err.println("expClassification    : "+expClassification);
			
			
			if (actClassficationTab.equalsIgnoreCase(expClassification) && 
					actMasterItemNewClassificationFieldList.equalsIgnoreCase(expMasterItemNewClassificationFieldList))
			{
				
				 excelReader.setCellData(xlfile, xlSheetName, 459, 9, resPass);
				return true;
			}
			else
			{
				 excelReader.setCellData(xlfile, xlSheetName, 459, 9, resPass);
				return false;
			}
	    }
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 459, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }	
					
	  }
				
	  
	  @FindBy(xpath ="//*[@id='newMasterDiv4']/div/div/div/label")
	  public static List<WebElement> itemNewOtherDetailsBodyFieldsList;
	  
	  public boolean checkOtherDeailsTabInMasterCreationPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
		 System.out.println("****************************************************** checkOtherDeailsTabInMasterCreationPage  **********************************************************");

		 try
		 {  
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewOtherDetailsBtn));
	  		ItemNewOtherDetailsBtn.click();

	  		
	  		Thread.sleep(2000);
	  		
	        ArrayList<String> actitemNewOtherDetailsBodyFieldsList=new ArrayList<String>();
			
			int OtherDeailsBodyFielddList =itemNewOtherDetailsBodyFieldsList.size();
		 		
		 	System.err.println("OtherDeailsBodyFielddList   :  "+OtherDeailsBodyFielddList);
		 		
			 	for (int i = 1; i < OtherDeailsBodyFielddList; i++) 
			 	{
					String data=itemNewOtherDetailsBodyFieldsList.get(i).getText();
					actitemNewOtherDetailsBodyFieldsList.add(data);
				}
			 		
			 	String actMasterItemNewOtherDeailsFieldList=actitemNewOtherDetailsBodyFieldsList.toString();
			 	String expMasterItemNewOtherDeailsFieldList=excelReader.getCellData(xlSheetName, 463, 7);
			 		
			 	excelReader.setCellData(xlfile, xlSheetName, 463, 8, actMasterItemNewOtherDeailsFieldList);
			    	
			    System.err.println("  Actual MasterItemNewOtherDeailsFieldList : "+actMasterItemNewOtherDeailsFieldList);
			    System.err.println("  Expected  MasterItemOtherDeailsNewTabList : "+expMasterItemNewOtherDeailsFieldList);
	  		
	  		
	  		
	  		
	  		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newOtherDetailsCostOfIssueitem));

	  		boolean actCostofIssue           = newOtherDetailsCostOfIssueitem.isDisplayed();
	  		boolean actStockAccount          = newOtherDetailsStocksitem.isDisplayed();
	  		boolean actSalesAccount          = newOtherDetailsSalesAccount.isDisplayed();
	  		boolean actWIPAccount            = newOtherDetailsWIPitem.isDisplayed();
	  		boolean actShortagesStockAccount = newOtherDetailsCostofShortageStockAC.isDisplayed();
	  		boolean actExcessAccount         = newOtherDetailsCostofExcessStockAC.isDisplayed();
	  		boolean actReturnAccount         = OtherDetailsCostofSaleReturnAC.isDisplayed();
	  		boolean actPurchaseVariance      = OtherDetailsPurchaseVarianceAC.isDisplayed();
	  		boolean actGridWarehouse         = newOtherDetailsgridFirstrowWareHouse.isDisplayed();

	  		boolean expCostofIssue           = true;
	  		boolean expStockAccount          = true;
	  		boolean expSalesAccount          = true;
	  		boolean expWIPAccount            = true;
	  		boolean expShortagesStockAccount = true;
	  		boolean expExcessAccount         = true;
	  		boolean expReturnAccount         = true;
	  		boolean expPurchaseVariance      = true;
	  		boolean expGridWarehouse         = true;

	  		
	  		System.out.println("Cost Of Issue Value Actual            :  " + actCostofIssue +          " Value Expected :  " + expCostofIssue);
	  		System.out.println("StockAccount Value Actual             :  " + actStockAccount +         " Value Expected :  " + expStockAccount);
	  		System.out.println("Sale sAccount Value Actual            :  " + actSalesAccount +         " Value Expected :  " + expSalesAccount);
	  		System.out.println("WIPAccount Value Actual               :  " + actWIPAccount +           " Value Expected :  " + expWIPAccount);
	  		System.out.println("ShortagesStockAccount Value Actual    :  " + actShortagesStockAccount+ " Value Expected :  " + expShortagesStockAccount);
	  		System.out.println("ExcessAccount Value Actual            :  " + actExcessAccount +        " Value Expected :  " + expExcessAccount);
	  		System.out.println("ReturnAccount Value Actual            :  " + actReturnAccount +        " Value Expected :  " + expReturnAccount);
	  		System.out.println("PurchaseVariance Value Actual         :  " + actPurchaseVariance +     " Value Expected :  " + expPurchaseVariance);
	  		System.out.println("GridWarehouse Value Actual            :  " + actGridWarehouse +        " Value Expected :  " + expGridWarehouse);
	  		
	  		
	  		boolean testResult=actCostofIssue == expCostofIssue && actStockAccount == expStockAccount
											&& actSalesAccount == expSalesAccount && actWIPAccount == expWIPAccount
											&& actShortagesStockAccount == expShortagesStockAccount && actExcessAccount == expExcessAccount
											&& actReturnAccount == expReturnAccount && actPurchaseVariance == expPurchaseVariance
											&& actGridWarehouse == expGridWarehouse;
	  		
	  		
	  		String actOtherDetailsResult=Boolean .toString(testResult);
	  		String expOtherDetailsResult=excelReader.getCellData(xlSheetName, 464, 7);
	  		
	  		excelReader.setCellData(xlfile, xlSheetName, 464, 8, actOtherDetailsResult);
	  		
	  		if (actOtherDetailsResult.equalsIgnoreCase(expOtherDetailsResult) && 
	  				actMasterItemNewOtherDeailsFieldList.equalsIgnoreCase(expMasterItemNewOtherDeailsFieldList))
			{
	  			
	  			excelReader.setCellData(xlfile, xlSheetName, 462, 9, resPass);
				return true;
			}
			else
			{
				 excelReader.setCellData(xlfile, xlSheetName, 462, 9, resFail);
				return false;
			}
		 }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 462, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }	
	  }


			
	  
	  @FindBy(xpath ="//*[@id='newMasterDiv5']/div/div/div/label")
	  public static List<WebElement> itemNewReplenishmentTabBodyFieldsList;
	  
	 public boolean checkReplenishmentTabInItemMasterCreationPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	  System.out.println("************************************** checkReplenishmentTabInItemMasterCreationPage  *******************************************");
		
	  try
	  {
	   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewReplenishmentBtn));
		ItemNewReplenishmentBtn.click();

		
		Thread.sleep(2000);
		
		ArrayList<String> actitemNewReplenishmentTabBodyFieldsList=new ArrayList<String>();
			
		int ReplenishmentBodyFielddList =itemNewReplenishmentTabBodyFieldsList.size();
		 		
		System.err.println("ReplenishmentBodyFielddList   :  "+ReplenishmentBodyFielddList);
		 		
		     for (int i = 1; i < ReplenishmentBodyFielddList; i++) 
			 {
				String data=itemNewReplenishmentTabBodyFieldsList.get(i).getText();
				actitemNewReplenishmentTabBodyFieldsList.add(data);
			 }
			 		
		String actMasterItemNewReplenishmentFieldList=actitemNewReplenishmentTabBodyFieldsList.toString();
		String expMasterItemNewReplenishmentFieldList=excelReader.getCellData(xlSheetName, 466, 7);
			 		
		excelReader.setCellData(xlfile, xlSheetName, 466, 8, actMasterItemNewReplenishmentFieldList);
			    	
	    System.err.println("  Actual MasterItemNewReplenishmentFieldList : "+actMasterItemNewReplenishmentFieldList);
	    System.err.println("  Expected  MasterItemReplenishmentNewTabList : "+expMasterItemNewReplenishmentFieldList);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newreplenishmentDefaultReplenishment));

		boolean actDefaultReplenishment      = newreplenishmentDefaultReplenishment.isDisplayed();
		boolean actManufacturePolicy         = newreplenishmentManufacturePolicy.isDisplayed();
		boolean actPackingBOM                = newreplenishmentPackingBOM.isDisplayed();
		boolean actBOM                       = newreplenishmentBOM.isDisplayed();
		boolean actFlushing                  = newreplenishmentFlushing.isDisplayed();
		boolean actGridFirstRowWarehouse     = newreplenishmentGridFirstRowWarehouse.isDisplayed();
		boolean actGridFirstRowStartDate     = newreplenishmentGridFirstRowStartDate.isDisplayed();
		boolean actGridFirstRowEndDate       = newreplenishmentGridFirstRowEndDate.isDisplayed();
		boolean actGridFirstRowReplenishqty  = newreplenishmentGridFirstRowReplenishqty.isDisplayed();
		boolean actGridFirstRowReorderPolicy = newreplenishmentGridFirstRowReorderPolicy.isDisplayed();
		boolean actGridFirstRowSafetyStock   = newreplenishmentGridFirstRowSafetyStock.isDisplayed();
		boolean actFirstRowSafetyLeadTime    = newreplenishmentFirstRowSafetyLeadTime.isDisplayed();
		boolean actFirstRowReordercycle      = newreplenishmentFirstRowReordercycle.isDisplayed();
		boolean actFirstRowReorderPoint      = newreplenishmentFirstRowReorderPoint.isDisplayed();
		boolean actFirstRowReorderQuantity   = newreplenishmentFirstRowReorderQuantity.isDisplayed();
		boolean actFirstRowMaxInventoryLevel = newreplenishmentFirstRowMaxInventoryLevel.isDisplayed();
		boolean actFirstRowDefaultVendor     = newreplenishmentFirstRowDefaultVendor.isDisplayed();
		boolean actFirstRowMinOrderQuantity  = newreplenishmentFirstRowMinOrderQuantity.isDisplayed();
		boolean actFirstRowMaxOrderQuantity1 = newreplenishmentFirstRowMaxOrderQuantity1.isDisplayed();
		boolean actFirstRowOrderMultiple     = newreplenishmentFirstRowOrderMultiple.isDisplayed();

		boolean expDefaultReplenishment      = true;
		boolean expManufacturePolicy         = true;
		boolean expPackingBOM                = true;
		boolean expBOM                       = true;
		boolean expFlushing                  = true;
		boolean expGridFirstRowWarehouse     = true;
		boolean expGridFirstRowStartDate     = true;
		boolean expGridFirstRowEndDate       = true;
		boolean expGridFirstRowReplenishqty  = true;
		boolean expGridFirstRowReorderPolicy = true;
		boolean expGridFirstRowSafetyStock   = true;
		boolean expFirstRowSafetyLeadTime    = true;
		boolean expFirstRowReordercycle      = true;
		boolean expFirstRowReorderPoint      = true;
		boolean expFirstRowReorderQuantity   = true;
		boolean expFirstRowMaxInventoryLevel = true;
		boolean expFirstRowDefaultVendor     = true;
		boolean expFirstRowMinOrderQuantity  = true;
		boolean expFirstRowMaxOrderQuantity1 = true;
		boolean expFirstRowOrderMultiple     = true;

		System.out.println("Default Replenishment              :  " + actDefaultReplenishment +     "  Value Expected :  " + expDefaultReplenishment);
		System.out.println("Manufacture Policy             	   :  " + actManufacturePolicy +        "  Value Expected :  " + expManufacturePolicy);
		System.out.println("Packing BOM                        :  " + actPackingBOM +               "  Value Expected :  " + expPackingBOM);
		System.out.println("BOM                                :  " + actBOM +                      "  Value Expected :  " + expBOM);
		System.out.println("Flushing                           :  " + actFlushing +                 "  Value Expected :  " + expFlushing);
		System.out.println("Grid First Row Warehouse           :  " + actGridFirstRowWarehouse +    "  Value Expected :  " + expGridFirstRowWarehouse);
		System.out.println("Grid First Row Start Date          :  " + actGridFirstRowStartDate +    "  Value Expected :  " + expGridFirstRowStartDate);
		System.out.println("Grid First Row End Date            :  " + actGridFirstRowEndDate +      "  Value Expected :  " + expGridFirstRowEndDate);
		System.out.println("Grid First Row Replenishqty        :  " + actGridFirstRowReplenishqty+  "  Value Expected :  " + expGridFirstRowReplenishqty);
		System.out.println("Grid First Row Reorder Policy      :  " + actGridFirstRowReorderPolicy+ "  Value Expected :  " + expGridFirstRowReorderPolicy);
		System.out.println("Grid First Row Safety Stock        :  " + actGridFirstRowSafetyStock+   "  Value Expected :  " + expGridFirstRowSafetyStock);
		System.out.println("First Row Safety Lead Time         :  " + actFirstRowSafetyLeadTime +   "  Value Expected :  " + expFirstRowSafetyLeadTime);
		System.out.println("First Row Reorder cycle            :  " + actFirstRowReordercycle +     "  Value Expected :  " + expFirstRowReordercycle);
		System.out.println("First Row Reorder Point            :  " + actFirstRowReorderPoint +     "  Value Expected :  " + expFirstRowReorderPoint);
		System.out.println("First Row Reorder Quantity         :  " + actFirstRowReorderQuantity+   "  Value Expected :  " + expFirstRowReorderQuantity);
		System.out.println("First Row Max Inventory Level      :  " + actFirstRowMaxInventoryLevel+ "  Value Expected :  " + expFirstRowMaxInventoryLevel);
		System.out.println("First Row Default Vendor           :  " + actFirstRowDefaultVendor +    "  Value Expected :  " + expFirstRowDefaultVendor);
		System.out.println("First Row Min Order Quantity       :  " + actFirstRowMinOrderQuantity+  "  Value Expected :  " + expFirstRowMinOrderQuantity);
		System.out.println("First Row Max Order Quantity1      :  " + actFirstRowMaxOrderQuantity1+ "  Value Expected :  " + expFirstRowMaxOrderQuantity1);
		System.out.println("First Row Order Multiple           :  " + actFirstRowOrderMultiple +    "  Value Expected :  " + expFirstRowOrderMultiple);
		
		
		boolean testResult=actDefaultReplenishment == actDefaultReplenishment && actManufacturePolicy == expManufacturePolicy
							&& actPackingBOM == expPackingBOM && actBOM == expBOM && actFlushing == expFlushing
							&& actGridFirstRowWarehouse == expGridFirstRowWarehouse
							&& actGridFirstRowStartDate == expGridFirstRowStartDate
							&& actGridFirstRowEndDate == expGridFirstRowEndDate
							&& actGridFirstRowReplenishqty == expGridFirstRowReplenishqty
							&& actGridFirstRowReorderPolicy == expGridFirstRowReorderPolicy
							&& actGridFirstRowSafetyStock == expGridFirstRowSafetyStock
							&& actFirstRowSafetyLeadTime == expFirstRowSafetyLeadTime
							&& actFirstRowReordercycle == expFirstRowReordercycle
							&& actFirstRowReorderPoint == expFirstRowReorderPoint
							&& actFirstRowReorderQuantity == expFirstRowReorderQuantity
							&& actFirstRowMaxInventoryLevel == expFirstRowMaxInventoryLevel
							&& actFirstRowDefaultVendor == expFirstRowDefaultVendor
							&& actFirstRowMinOrderQuantity == expFirstRowMinOrderQuantity
							&& actFirstRowMaxOrderQuantity1 == expFirstRowMaxOrderQuantity1
							&& actFirstRowOrderMultiple == expFirstRowOrderMultiple;
		
		String actReplenishmentResult=Boolean.toString(testResult);
		String expReplenishmentResult=excelReader.getCellData(xlSheetName, 467, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 467, 8, actReplenishmentResult);
		
		
		if (actMasterItemNewReplenishmentFieldList.equalsIgnoreCase(expMasterItemNewReplenishmentFieldList) &&
				actReplenishmentResult.equalsIgnoreCase(expReplenishmentResult))
		{
			excelReader.setCellData(xlfile, xlSheetName, 465, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 465, 9, resFail);
			return false;
		}
	  }
	  catch (Exception e) 
	  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 465, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	  }	
	}
			    


	 public boolean checkOutletTabInItemMasterCreationPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
			
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
	  System.out.println("***************************************** checkOutletTabInItemMasterCreationPage  ****************************************************");
		
	   try
	   {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewOutletBtn));
			ItemNewOutletBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newOutletSearchOutlet));

			boolean actOutletSearchIsDisplayed                  = newOutletSearchOutlet.isDisplayed();
			
			String actOutletSearchGetText   = newOutletSearchOutlet.getAttribute("placeholder");
			String expOutletSearchGetText  =excelReader.getCellData(xlSheetName, 469, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 469, 8, actOutletSearchGetText);
			
			boolean actOutletAdvanceSearch           = newOutletAdvanceSearch.isDisplayed();
			boolean actOutletResizeBtn               = newOutletResizeBtn.isDisplayed();
			boolean actOutletRetainSelectionCheckbox = newOutletRetainSelctionCheckBox.isDisplayed();

			boolean expOutletSearch                  = true;
			boolean expOutletAdvanceSearch           = true;
			boolean expOutletResizeBtn               = true;
			boolean expOutletRetainSelectionCheckbox = true;		

			System.out.println("Outlet Search                 :  " + actOutletSearchIsDisplayed +      "  Value Expected :  " + expOutletSearch);
			System.out.println("Advance Search             	  :  " + actOutletAdvanceSearch +          "  Value Expected :  " + expOutletAdvanceSearch);
			System.out.println("Resize Btn                    :  " + actOutletResizeBtn +              "  Value Expected :  " + expOutletResizeBtn);
			System.out.println("Retain Selection              :  " + actOutletRetainSelectionCheckbox+ "  Value Expected :  " + expOutletRetainSelectionCheckbox);
					
			
			
			boolean TestResult=actOutletSearchIsDisplayed == expOutletSearch && actOutletAdvanceSearch == expOutletAdvanceSearch
					           && actOutletResizeBtn == actOutletResizeBtn && actOutletRetainSelectionCheckbox == expOutletRetainSelectionCheckbox;
			
			String actOutletResult=Boolean.toString(TestResult);
			String expOutletResult=excelReader.getCellData(xlSheetName, 470, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 470, 8, actOutletResult);
			
			if (actOutletResult.equalsIgnoreCase(expOutletResult) &&
					actOutletSearchGetText.equalsIgnoreCase(expOutletSearchGetText))
					
			{
				excelReader.setCellData(xlfile, xlSheetName, 468, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 468, 9, resFail);
				return false;
			}
	  }
	   catch (Exception e) 
	   {
	 	  String exception =e.getMessage();
	 	  excelReader.setExceptionInExcel(xlfile, xlSheetName, 468, 10, exception);
	 	  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 	  return false;
	   }	
	}

		@FindBy (xpath="//*[@id='newMasterDiv8']/div/div[2]/div[1]/label")
	    private static WebElement itemNewCreateTabList;
		

	 
	 public boolean checkCreateTabInItemMasterCreationPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
			
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
	  System.out.println("***************************************** checkCreateTabInItemMasterCreationPage  ****************************************************");
		
	  try
	  { 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewCreateTab));
		itemNewCreateTab.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExtraFieldOne));

		boolean actItemExtraFieldIsDisplayed = itemExtraFieldOne.isDisplayed();
		boolean expItemExtraFieldIsDisplayed = true;

		String actItemExtraFieldGetText = itemNewCreateTabList.getText();;
		String expItemExtraFieldGetText = excelReader.getCellData(xlSheetName, 471, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 471, 8, actItemExtraFieldGetText);
		
		System.out.println("Create Tab Tab              :  " + actItemExtraFieldIsDisplayed + "  Value Expected :  " + expItemExtraFieldIsDisplayed);

		System.err.println("actItemExtraFieldGetText   : "+actItemExtraFieldGetText);
		System.err.println("expItemExtraFieldGetText   : "+expItemExtraFieldGetText);
		
		if ( actItemExtraFieldIsDisplayed == expItemExtraFieldIsDisplayed && 
				actItemExtraFieldGetText.equalsIgnoreCase(expItemExtraFieldGetText))
		{
			excelReader.setCellData(xlfile, xlSheetName, 471, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 471, 9, resFail);
			return false;
		}
	  }
	  catch (Exception e) 
	  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 471, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	  }
	 }
		
	 
	 
	 public static boolean checkSaveButtonByInputInProductCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkSaveButtonByInputInProductCreationPage *************************");

		try
		{
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewnewGeneralBtn));
			ItemNewnewGeneralBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
			newGeneralName.sendKeys(excelReader.getCellData(xlSheetName, 473, 6));

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
			newGeneralCode.sendKeys(excelReader.getCellData(xlSheetName, 474, 6));

			getAction().moveToElement(newGeneralCode).sendKeys(Keys.TAB).perform();
			newGeneralItemTypeDropDown.sendKeys(excelReader.getCellData(xlSheetName, 475, 6));
			newGeneralItemTypeDropDown.sendKeys(Keys.TAB);

			newGeneralBinCapacity.click();
			newGeneralBinCapacity.sendKeys(excelReader.getCellData(xlSheetName, 476, 6));
			newGeneralBinCapacity.sendKeys(Keys.TAB);
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewUnitsBtn));
			ItemNewUnitsBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultBaseUnitDropdown));
			itemUnitsDefaultBaseUnitDropdown.sendKeys(excelReader.getCellData(xlSheetName, 477, 6));
			itemUnitsDefaultBaseUnitDropdown.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultSalesUnitDropdown));
			itemUnitsDefaultSalesUnitDropdown.sendKeys(excelReader.getCellData(xlSheetName, 478, 6));
			itemUnitsDefaultSalesUnitDropdown.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultPurchaseUnitDropDown));
			itemUnitsDefaultPurchaseUnitDropDown.sendKeys(excelReader.getCellData(xlSheetName, 479, 6));
			itemUnitsDefaultPurchaseUnitDropDown.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));

			String actItemSaveMessage = validationConfirmationMessage.getText();
			String expItemSaveMessage = excelReader.getCellData(xlSheetName, 472, 7);

			excelReader.setCellData(xlfile, xlSheetName, 472, 8, actItemSaveMessage);
			
			
			System.err.println(" actItemSaveMessage : "+actItemSaveMessage);
			System.err.println(" expItemSaveMessage : "+expItemSaveMessage);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
			closeValidationConfirmationMessage.click();

			System.out.println("Input and Click on Save Button : " + actItemSaveMessage + " Value Expected :  " + expItemSaveMessage);

			if (actItemSaveMessage.equalsIgnoreCase(expItemSaveMessage)) 
			{

				excelReader.setCellData(xlfile, xlSheetName, 472, 9, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 472, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 472, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }
	 


	  public static boolean checkClickOnCloseAndCreatedMasterItemDisplayInGrid()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("************************************* checkClickOnCloseAndCreatedMasterItemDisplayInGrid ****************************");
			
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();

			
			ArrayList<String> actmasterItemNameList=new ArrayList<String>();
		 		
		 	int HeaderCount =masterItemNameList.size();
		 		
		 	System.err.println("HeaderCount   :  "+HeaderCount);
		 		
		 	for (int i = 0; i < HeaderCount; i++) 
		 	{
				String data=masterItemNameList.get(i).getText();
				
				
				if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 480, 6)))
				{
					break;
				}
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewCreationName));

			String actGetItemNewCreationOfLane = itemNewCreationName.getText();
			String expGetItemNewCreationOfLane = excelReader.getCellData(xlSheetName, 480, 7);

			System.out.println("Item Name Display : " + actGetItemNewCreationOfLane + " Value Expected :  " + expGetItemNewCreationOfLane);

			excelReader.setCellData(xlfile, xlSheetName, 480, 8, actGetItemNewCreationOfLane);
			
			if (actGetItemNewCreationOfLane.equalsIgnoreCase(actGetItemNewCreationOfLane)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 480, 9, resPass);
				return true;
			}
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 480, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 480, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }

	  @FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
	  public static WebElement itemFirstCheckBox;

	  @FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/label[1]/input[1]")
	  public static WebElement itemSecondCheckBox;

	  @FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[8]/div[1]/label[1]/input[1]")
	  public static WebElement itemThirdCheckBox;

	  //Editing the Account in the Accounts Master
	  public static boolean checkCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("******************** checkCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster Method Executes............  ********************");
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCheckBox));
			itemFirstCheckBox.click();
			
			boolean SelectedMasterSearchCheckbox = firstRowSelect.isSelected();
			
			String actSelectedMasterSearchCheckbox=Boolean.toString(SelectedMasterSearchCheckbox);
			
			String expSelectedMasterSearchCheckbox = excelReader.getCellData(xlSheetName, 481, 7);

			excelReader.setCellData(xlfile, xlSheetName, 481, 8, actSelectedMasterSearchCheckbox);
			
			
			System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);
			
			boolean actSummaryErrorMessage         = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessage         = true;

			System.out.println("Click on Check Box Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
			

			if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox 
					&& actSummaryErrorMessage==expSummaryErrorMessage) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 481, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 481, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 481, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	  
	  
	  
	  public static boolean checkEditOptionForNewlyCreatedItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************* checkEditOptionForNewlyCreatedItem ****************************");
			
	    try
	    {
	      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		  masterEditBtn.click();
		  
		  boolean actSummaryErrorMessage         = checkErrorMessageIsDisplayingOrNotDisplaying();
		  boolean expSummaryErrorMessage         = true;

		  System.out.println("Click on Check Box Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
			
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
		  String actItemName                    = newGeneralName.getAttribute("value");
		  String actItemCode                    = newGeneralCode.getAttribute("value");

		  Select itemType                       = new Select(newGeneralItemTypeDropDown);
		  String actItemType                    = itemType.getFirstSelectedOption().getText();
		  String actBinCapacity                 = newGeneralBinCapacity.getAttribute("value");

		  String expItemName                    = excelReader.getCellData(xlSheetName, 483, 7);
		  String expItemCode                    = excelReader.getCellData(xlSheetName, 484, 7);
		  String expItemType                    = excelReader.getCellData(xlSheetName, 485, 7);
		  String expBinCapacity                 = excelReader.getCellData(xlSheetName, 486, 7);

		  excelReader.setCellData(xlfile, xlSheetName, 483, 8, actItemName);
		  excelReader.setCellData(xlfile, xlSheetName, 484, 8, actItemCode);
		  excelReader.setCellData(xlfile, xlSheetName, 485, 8, actItemType);
		  excelReader.setCellData(xlfile, xlSheetName, 486, 8, actBinCapacity);
		  
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
		  newGeneralName.click();
		  newGeneralName.sendKeys(Keys.END);
		  newGeneralName.sendKeys(Keys.SHIFT, Keys.HOME);
		  newGeneralName.sendKeys(excelReader.getCellData(xlSheetName, 491, 6));
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
		  newGeneralCode.click();
		  newGeneralCode.sendKeys(Keys.END);
		  newGeneralCode.sendKeys(Keys.SHIFT, Keys.HOME);
		  newGeneralCode.sendKeys(excelReader.getCellData(xlSheetName, 492, 6));
		  Thread.sleep(2000);

		  getAction().moveToElement(newGeneralCode).sendKeys(Keys.TAB).perform();
		  newGeneralItemTypeDropDown.sendKeys(excelReader.getCellData(xlSheetName, 493, 6));
		  newGeneralItemTypeDropDown.sendKeys(Keys.TAB);

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewUnitsBtn));
		  ItemNewUnitsBtn.click();
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultSalesUnitDropdown));
		  String actBaseUnit               = itemUnitsDefaultBaseUnitDropdown.getAttribute("value");
		  String actSalesUnit              = itemUnitsDefaultSalesUnitDropdown.getAttribute("value");
		  String actPurchaseUnit           = itemUnitsDefaultPurchaseUnitDropDown.getAttribute("value");

		  String expBaseUnit               = excelReader.getCellData(xlSheetName, 487, 7);
		  String expSalesUnit              = excelReader.getCellData(xlSheetName, 488, 7);
		  String expPurchaseUnit           = excelReader.getCellData(xlSheetName, 489, 7);
		  
		  
		  excelReader.setCellData(xlfile, xlSheetName, 487, 8, actBaseUnit);
		  excelReader.setCellData(xlfile, xlSheetName, 488, 8, actSalesUnit);
		  excelReader.setCellData(xlfile, xlSheetName, 489, 8, actPurchaseUnit);

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultBaseUnitDropdown));
		  itemUnitsDefaultBaseUnitDropdown.click();
		  itemUnitsDefaultBaseUnitDropdown.sendKeys(Keys.TAB);

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultSalesUnitDropdown));
		  itemUnitsDefaultSalesUnitDropdown.sendKeys(Keys.TAB);

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultPurchaseUnitDropDown));
		  itemUnitsDefaultPurchaseUnitDropDown.click();
		  
		  itemUnitsDefaultPurchaseUnitDropDown.sendKeys(Keys.END);
		  
		  itemUnitsDefaultPurchaseUnitDropDown.sendKeys(Keys.SHIFT, Keys.HOME);
		 
		  itemUnitsDefaultPurchaseUnitDropDown.sendKeys(excelReader.getCellData(xlSheetName, 494, 6));
		  Thread.sleep(2000);
		  itemUnitsDefaultPurchaseUnitDropDown.sendKeys(Keys.TAB);

		  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		  saveBtn.click();

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));

		  String actItemSaveMessage           = validationConfirmationMessage.getText();
		  String expItemSaveMessage           = excelReader.getCellData(xlSheetName, 491, 7);
	 
		  excelReader.setCellData(xlfile, xlSheetName, 491, 8, actItemSaveMessage);
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
		  closeValidationConfirmationMessage.click();
		 	  

		  String actUpdatedItem               = itemNewCreationName.getText();
		  String expUpdatedItem               =  excelReader.getCellData(xlSheetName, 495, 7);

		  excelReader.setCellData(xlfile, xlSheetName, 495, 8, actUpdatedItem);
		  
		  
		  System.out.println("Item Name Display                : " + actItemName +        " Value Expected :  " + expItemName);
		  System.out.println("Item Code Display                : " + actItemCode +        " Value Expected :  " + expItemCode);
		  System.out.println("Item Type Display                : " + actItemType +        " Value Expected :  " + expItemType);
		  System.out.println("Item BUnit Display               : " + actBaseUnit +        " Value Expected :  " + expBaseUnit);
		  System.out.println("Item SUnit Display               : " + actSalesUnit +       " Value Expected :  " + expSalesUnit);
		  System.out.println("Item PUnit Display               : " + actPurchaseUnit +    " Value Expected :  " + expPurchaseUnit);
		  System.out.println("Bin Capacity                     : " + actBinCapacity +     " Value Expected :  " + expBinCapacity);
		  System.out.println("Update and Click on Save Button  : " + actItemSaveMessage + " Value Expected :  " + expItemSaveMessage);
		  System.out.println("Updated Item Name Display        : " + actUpdatedItem +     " Value Expected :  " + expUpdatedItem);

		  if (actSummaryErrorMessage==actSummaryErrorMessage && expItemName.equalsIgnoreCase(expItemName) 
				&& actItemCode.equalsIgnoreCase(expItemCode) && actItemType.equalsIgnoreCase(expItemType) 
				&& actBaseUnit.equalsIgnoreCase(expBaseUnit) && actSalesUnit.equalsIgnoreCase(expSalesUnit) 
				&& actPurchaseUnit.equalsIgnoreCase(expPurchaseUnit) && actBinCapacity.equalsIgnoreCase(expBinCapacity)
				&& actItemSaveMessage.equalsIgnoreCase(expItemSaveMessage) && actUpdatedItem.equalsIgnoreCase(expUpdatedItem))
		  {
			  excelReader.setCellData(xlfile, xlSheetName, 482, 9, resPass);
			return true;
		  }
		  else
		  {
			  excelReader.setCellData(xlfile, xlSheetName, 482, 9, resFail);
			return false;
		  }
	     }
	     catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 482, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }

	  @FindBy(xpath = "/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[8]/div[1]/label/input")
		public static WebElement firstRowSelect;
	   
	  //Editing the Account in the Accounts Master
	  public static boolean checkUnCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("******************** checkUnCheckBoxOfSavedMasterItemIsCheckedByClickingOnItemMaster Method Executes............  ********************");
		
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCheckBox));
			itemFirstCheckBox.click();
			
			boolean SelectedMasterSearchCheckbox = firstRowSelect.isSelected();
			
	        String actSelectedMasterSearchCheckbox=Boolean.toString(SelectedMasterSearchCheckbox);
			
			String expSelectedMasterSearchCheckbox = excelReader.getCellData(xlSheetName, 496, 7);

			excelReader.setCellData(xlfile, xlSheetName, 496, 8, actSelectedMasterSearchCheckbox);

			System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);
			
			
			
			boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessage  = true;

			System.out.println("Click on Check Box Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);

			if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox 
					&& actSummaryErrorMessage==expSummaryErrorMessage) 
			{
				 excelReader.setCellData(xlfile, xlSheetName, 496, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 496, 9, resPass);
				return false;
			}
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 496, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	  }
	  
	  
	  
	  
	  
	 public static boolean checkUpdatedItemInformation()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkUpdatedItemInformation *************************");
			
		try
		{
		  Thread.sleep(4000);
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCheckBox));
		  itemFirstCheckBox.click();

		  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		  masterEditBtn.click();

		  getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
		  String actItemName    = newGeneralName.getAttribute("value");
		  String actItemCode    = newGeneralCode.getAttribute("value");

		  Select itemType       = new Select(newGeneralItemTypeDropDown);
		  String actItemType    = itemType.getFirstSelectedOption().getText();
		  String actBinCapacity = newGeneralBinCapacity.getAttribute("value");

		  excelReader.setCellData(xlfile, xlSheetName, 498, 8, actItemName);
		  excelReader.setCellData(xlfile, xlSheetName, 499, 8, actItemCode);
		  excelReader.setCellData(xlfile, xlSheetName, 500, 8, actItemType);
		  excelReader.setCellData(xlfile, xlSheetName, 501, 8, actBinCapacity);
		  
		  String expItemName    = excelReader.getCellData(xlSheetName, 498, 7);
	  	  String expItemCode    = excelReader.getCellData(xlSheetName, 499, 7);
		  String expItemType    = excelReader.getCellData(xlSheetName, 500, 7);
		  String expBinCapacity = excelReader.getCellData(xlSheetName, 501, 7);

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewUnitsBtn));
		  ItemNewUnitsBtn.click();
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultPurchaseUnitDropDown));
		  String actBaseUnit     = itemUnitsDefaultBaseUnitDropdown.getAttribute("value");
		  String actSalesUnit    = itemUnitsDefaultSalesUnitDropdown.getAttribute("value");
		  String actPurchaseUnit = itemUnitsDefaultPurchaseUnitDropDown.getAttribute("value");

		  excelReader.setCellData(xlfile, xlSheetName, 502, 8, actBaseUnit);
		  excelReader.setCellData(xlfile, xlSheetName, 503, 8, actSalesUnit);
		  excelReader.setCellData(xlfile, xlSheetName, 504, 8, actPurchaseUnit);
		  
		  String expBaseUnit     = excelReader.getCellData(xlSheetName, 502, 7);
		  String expSalesUnit    = excelReader.getCellData(xlSheetName, 503, 7);
		  String expPurchaseUnit = excelReader.getCellData(xlSheetName, 504, 7);

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editcloseBtn));
		  editcloseBtn.click();

		  System.out.println("Item Name Display                : " + actItemName +     " Value Expected :  " + expItemName);
		  System.out.println("Item Code Display                : " + actItemCode +     " Value Expected :  " + expItemCode);
		  System.out.println("Item Type Display                : " + actItemType +     " Value Expected :  " + expItemType);
		  System.out.println("Item BUnit Display               : " + actBaseUnit +     " Value Expected :  " + expBaseUnit);
		  System.out.println("Item SUnit Display               : " + actSalesUnit +    " Value Expected :  " + expSalesUnit);
		  System.out.println("Item PUnit Display               : " + actPurchaseUnit + " Value Expected :  " + expPurchaseUnit);
		  System.out.println("Bin Capacity                     : " + actBinCapacity +  " Value Expected :  " + expBinCapacity);

		  if (actItemName.equalsIgnoreCase(expItemName) && actItemCode.equalsIgnoreCase(expItemCode)
				&& actItemType.equalsIgnoreCase(expItemType) && actBaseUnit.equalsIgnoreCase(expBaseUnit)
				&& actSalesUnit.equalsIgnoreCase(expSalesUnit) && actPurchaseUnit.equalsIgnoreCase(expPurchaseUnit)
				&& actBinCapacity.equalsIgnoreCase(expBinCapacity)) 
		  {
			  excelReader.setCellData(xlfile, xlSheetName, 497, 9, resPass);
			  return true;
		  }
		  else
		  {
			  excelReader.setCellData(xlfile, xlSheetName, 497, 9, resFail);
			return false;
		  }
		}
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 497, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }

	 @FindBy(xpath = "//input[@id='liSelectAllMasters']")
	 public static WebElement itemMasterSelect;

	 public static boolean checkDeleteItemFromItemMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	 {
		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkDeleteItemFromItemMasterPage *************************");
			
	    try
	    {
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterSelect));
			itemMasterSelect.click();
			
			boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessage  = true;

			System.out.println("Click on Check Box Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMasterSelect));
			itemMasterSelect.click();
			
			
			boolean actSummaryErrorMessageClick  = checkErrorMessageIsDisplayingOrNotDisplaying();
			boolean expSummaryErrorMessageClick  = true;

			System.out.println("Click on Check Box Is Any Error Message Value Actual : " + actSummaryErrorMessageClick + " Value Expected : " + expSummaryErrorMessageClick);

			Thread.sleep(3000);
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCheckBox));
			itemFirstCheckBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
			masterDeleteBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
			String actGetMsgOnDelete = getMsgOnDelete.getText();
			String expGetMsgOnDelete = excelReader.getCellData(xlSheetName, 506, 7);
		
			excelReader.setCellData(xlfile, xlSheetName, 506, 8, actGetMsgOnDelete);
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
			clickOnOkInDelete.click();

			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
			String actGetMsgOnClickOnOkButtonInDeleteMessage = validationConfirmationMessage.getText();
			String expGetMsgOnClickOnOkButtonInDeleteMessage = excelReader.getCellData(xlSheetName, 507, 7);

			
			excelReader.setCellData(xlfile, xlSheetName, 507, 8, actGetMsgOnClickOnOkButtonInDeleteMessage);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
			closeValidationConfirmationMessage.click();
		

			System.out.println("Item Name Display : " + actGetMsgOnDelete + " Value Expected :  " + expGetMsgOnDelete);
			System.out.println("Item Code Display : " + actGetMsgOnClickOnOkButtonInDeleteMessage + " Value Expected :  "+ expGetMsgOnClickOnOkButtonInDeleteMessage);

			if (actGetMsgOnDelete.equalsIgnoreCase(expGetMsgOnDelete) && actGetMsgOnClickOnOkButtonInDeleteMessage.equalsIgnoreCase(expGetMsgOnClickOnOkButtonInDeleteMessage)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 505, 9, resPass);
				return true;
			} 
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 505, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 505, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	 }

	 public static boolean checkDeleteItemDisplayInMasterDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	 {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkDeleteItemDisplayInMasterDisplay *************************");
			
	  
	    	try
	        {
	           String actmasterGridBodyList=clickOnEmptyGroup.getText();
	      	   	
	       	   String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 509, 7);
	       	   	
	       	   excelReader.setCellData(xlfile, xlSheetName, 509, 8, actmasterGridBodyList);
	       	   	
	       	   System.out.println("masterGridBodyList Actual   : "+actmasterGridBodyList);
	       	   System.out.println("masterGridBodyList Expected : "+expmasterGridBodyList);
	       	   	
	       	   if(actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList))
	    	   {
	    	    		excelReader.setCellData(xlfile, xlSheetName, 508, 9, resPass);
	    	 		return true;
	    	   } 
	    	   else 
	    	   {
	    	 		excelReader.setCellData(xlfile, xlSheetName, 508, 9, resFail);
	    	 		return false;
			   }
	       }
	       catch (Exception e) 
		   {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 508, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		   }
	  }

	 
	 @FindBy(xpath="//*[@id='btnAddGroup']")
	 private static WebElement itemAddGroupBtn;
	 
	 //Create Group
	 public static boolean checkItemsAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemAddGroupBtn));
	 	
	 	 itemAddGroupBtn.click();
	 	 
	 	 Thread.sleep(4999);
	 	 
	 	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewnewGeneralBtn));
	 	 if (ItemNewnewGeneralBtn.isDisplayed() && ItemNewUnitsBtn.isDisplayed() && 
	 			 ItemNewSettingsBtn.isDisplayed() && ItemNewClassificationBtn.isDisplayed() &&
	 			 ItemNewOtherDetailsBtn.isDisplayed() && ItemNewReplenishmentBtn.isDisplayed() &&
	 			 ItemNewOutletBtn.isDisplayed() ) 
	 	 {
	 		System.out.println("***Pass: New Screen Creation In Item Screen");
	 		excelReader.setCellData(xlfile, "Sheet1", 748, 9, resPass);
	 		return true;
	 	 } 
	 	 else 
	 	 {
	 		System.out.println("***Fail: New Screen Creation In Item Screen");
	 		excelReader.setCellData(xlfile, "Sheet1", 748, 9, resFail);
	 		return false;
	 	}
	 }


	public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		

		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
		 
		 newGeneralName.sendKeys("ITEM GROUP");
		 
		 getAction().moveToElement(newGeneralName).sendKeys(Keys.TAB).perform();
		 
		 
		 
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
			 
	     newGeneralCode.click();
	       
	     newGeneralCode.sendKeys("ITEM GROUP");
	      
	     newGeneralCode.sendKeys(Keys.TAB);
	     
	     
	     newGeneralItemTypeDropDown.sendKeys("Raw Material");
	     
	     newGeneralItemTypeDropDown.sendKeys(Keys.TAB);
	     
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 
		 saveBtn.click();
		 
		 Thread.sleep(2000);
		 
		 getWebDriverWait().until(ExpectedConditions.visibilityOf(validationConfirmationMessage));
		 
		 String getValidationConfirmationMessage=validationConfirmationMessage.getText();
		 
		 System.out.println(getValidationConfirmationMessage);
		 
		 System.out.println("validationConfirmationMessage"+validationConfirmationMessage.getText());
		 
		 System.out.println("validationConfirmationMessage"+validationConfirmationMessage.getAttribute("Value"));
		 
		 if(validationConfirmationMessage.getText().equalsIgnoreCase("Saved Successfully"))
		 {
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 751, 9, resPass);
			 return true;
		 }
		 else
		 {
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 751, 9, resFail);
			 return false;
		 }
	}



	public static boolean checkItemAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 

		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
		 
		 newGeneralName.click();
		 
		 Thread.sleep(5000);
		 
		 boolean checkgroupscreen=ItemNewnewGeneralBtn.isDisplayed() && ItemNewUnitsBtn.isDisplayed() && 
				 ItemNewSettingsBtn.isDisplayed() && ItemNewClassificationBtn.isDisplayed() &&
				 ItemNewOtherDetailsBtn.isDisplayed() && ItemNewReplenishmentBtn.isDisplayed() &&
				 ItemNewOutletBtn.isDisplayed();
		 
	      getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 
		 closeBtn.click();
		 
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewCreationName));
	     
	     System.out.println("itemNewCreationName"+itemNewCreationName.getText());
		 

		 if (checkgroupscreen==true && itemNewCreationName.getText().equalsIgnoreCase("ITEM GROUP")) 
		 {
			System.out.println("***Pass: New Screen Creation In Item Screen");
			excelReader.setCellData(xlfile, "Sheet1", 752, 9, resPass);
			return true;
		 } 
		 else 
		 {
			System.out.println("***Fail: New Screen Creation In Item Screen");
			excelReader.setCellData(xlfile, "Sheet1", 752, 9, resFail);
			return false;
		}
	}



	public static boolean checkEditOptionForItemGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCheckBox));
		 
		 itemFirstCheckBox.click();
		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 
		 masterEditBtn.click();
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
		 
		 System.out.println("nameTxt"+newGeneralName.getText());
		 
		 System.out.println("nameTxt"+newGeneralName.getAttribute("Value"));
		 
		 System.out.println("codeTxt"+newGeneralCode.getText());
		 
		 System.out.println("codeTxt"+newGeneralCode.getAttribute("Value"));
		 
		 if(newGeneralName.getAttribute("Value").equalsIgnoreCase("ITEM GROUP"))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 754, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 754, 9, resFail);
			 return false;
		 }
	}


	public static boolean checkUpateForGroupItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
		 
		 newGeneralName.click();
		
		 newGeneralName.clear();

		 newGeneralName.sendKeys("ITEMS GROUP");
		 
		 getAction().moveToElement(newGeneralName).sendKeys(Keys.TAB).perform();
		 
		 Thread.sleep(3000);
		
		 newGeneralCode.click();
		 
		 newGeneralCode.clear();

		 newGeneralCode.sendKeys("ITEMS GROUP");
		 		 
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 
		 saveBtn.click();
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
		 
		 String getvalidationConfirmationMessage=validationConfirmationMessage.getText();
		 
		 System.out.println("getvalidationConfirmationMessage"+getvalidationConfirmationMessage);
		 
		 if(validationConfirmationMessage.getText().equalsIgnoreCase("Updated Successfully"))
		 {
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 755, 9, resPass);
			 return true;
		 }
		 else
		 {
			 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
			 excelReader.setCellData(xlfile, "Sheet1", 755, 9, resFail);
			 return false;
		 }
	}


	public static boolean checkSaveOnUpdateItemGroupDisplayInItemGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewCreationName));
		 
		 System.out.println("New"+itemNewCreationName.getText());
	 
		 if(itemNewCreationName.getText().equalsIgnoreCase("ITEMS GROUP"))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 756, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 756, 9, resFail);
			 return false;
		 }
	}




		public static boolean checkClickOnGroupItemToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCheckBox));
		  
	     itemFirstCheckBox.click();
		 		 
		 getAction().doubleClick(itemFirstCheckBox).perform();
		 
		 Thread.sleep(4004);
		 
		
		
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnEmptyGroup));
		
		 if( clickOnEmptyGroup.getText().equalsIgnoreCase("No record found"))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 757, 9, resPass);
			 return true;
		 }
		 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 757, 9, resFail);
			 return false;
		 }
	   }


	 
	 
		public static boolean checkSaveItemInItemGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 Thread.sleep(3040);
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewBtn));
			
		 itemNewBtn.click();

		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralName));
		 		 
		 newGeneralName.sendKeys("RMA STITEM");
		 
	     getWebDriverWait().until(ExpectedConditions.elementToBeClickable(newGeneralCode));
		 
	     newGeneralCode.sendKeys("RMA FSITEM");
	   
	     newGeneralCode.sendKeys(Keys.TAB);
	     
	     newGeneralItemTypeDropDown.sendKeys("Raw Material");
	     
	     newGeneralItemTypeDropDown.sendKeys(Keys.TAB);
	     
	     Thread.sleep(3000);
	     
	   	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemNewUnitsBtn));
	   	 ItemNewUnitsBtn.click();
	         
	   	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultBaseUnitDropdown));
	   	 itemUnitsDefaultBaseUnitDropdown.sendKeys("Pcs");
	   	 itemUnitsDefaultBaseUnitDropdown.sendKeys( Keys.TAB);

	   	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultSalesUnitDropdown));
	   	 itemUnitsDefaultSalesUnitDropdown.sendKeys("Pcs");
	   	 itemUnitsDefaultSalesUnitDropdown.sendKeys( Keys.TAB);
	   	 
	   	 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemUnitsDefaultPurchaseUnitDropDown));
	   	 itemUnitsDefaultPurchaseUnitDropDown.sendKeys("Dozs");
	   	 itemUnitsDefaultPurchaseUnitDropDown.sendKeys( Keys.TAB);
	   	 
	     Thread.sleep(3040);     
	   
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 
		 saveBtn.click();
		 
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
		 String actdata=validationConfirmationMessage.getText();
		 String expdata="Saved Successfully";
			
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeValidationConfirmationMessage));
		 closeValidationConfirmationMessage.click();
		 
		 Thread.sleep(3000);
		 
		 
		
		
		 
		 
		 
		 if(actdata.equalsIgnoreCase(expdata))
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 758, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 758, 9, resFail);
			 return false;
		 }
	   }







	public static boolean checkCloseOptionInItemCreationInItemCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 Thread.sleep(5040);
		 
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstCheckBox));
		 itemFirstCheckBox.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemPropertiesBtn));
			itemPropertiesBtn.click();
			
			Thread.sleep(2000);
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesDontMaintainStockbyBatchChekbox));
			PropertiesDontMaintainStockbyBatchChekbox.click();
				
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesDontinputBinChekbox));
			ItemPropertiesDontinputBinChekbox.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesReserverByRadioBtn));
			ItemPropertiesReserverByRadioBtn.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesRMAChekbox));
			ItemPropertiesRMAChekbox.click();
			
			getWebDriverWait().until(ExpectedConditions.elementToBeClickable(ItemPropertiesOkBtn));
			ItemPropertiesOkBtn.click(); 
		 
		
		 
		 System.out.println("New"+itemNewCreationName.getText());
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewCreationName));
	 
		 if(itemNewCreationName.getText().equalsIgnoreCase("RMA STITEM"))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 759, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 759, 9, resFail);
			 return false;
		 }
	 }


	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]")
	public static WebElement itemFirstLevelMastersDisplayInItemUnderG;

	 public static boolean checkItemFirstLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemFirstLevelMastersDisplayInItemUnderG));
		 
		 itemFirstLevelMastersDisplayInItemUnderG.click();
		 
		 
		 Thread.sleep(9000);
		 
		 getWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNewCreationName));
		 
		 if(itemNewCreationName.getText().equalsIgnoreCase("ITEMS GROUP"))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 760, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 760, 9, resFail);
			 return false;
	     }
		 
	}

	  	 
	 
	 public static boolean checkCloseItemMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	  {

		excelReader = new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		System.out.println("********************************** checkCloseItemMaster ********************************");

	    try
	    {	
	    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCloseBtn));
			itemCloseBtn.click();
	       
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));

			boolean actLoadDashboard          = labelDashboard.isDisplayed();
			boolean actSelectDashboard        = selectDashboard.isDisplayed();
			boolean actNewDashboard           = newAddDashBoard.isDisplayed();
			boolean actDashboardCustomization = dashboardCustomizationSettings.isDisplayed();

			boolean expLoadDashboard          = true;
			boolean expSelectDashboard        = true;
			boolean expNewDashboard           = true;
			boolean expDashboardCustomization = true;

			System.out.println("Load Dashbord Value Actual          : " + actLoadDashboard +         " Value Expected : " + expLoadDashboard);
			System.out.println("Select Dashbord Value Actual        : " + actSelectDashboard +       " Value Expected : " + expSelectDashboard);
			System.out.println("New Dashbord Value Actual           : " + actNewDashboard +          " Value Expected : " + expNewDashboard);
			System.out.println("Dashbord Customization Value Actual : " + actDashboardCustomization+ " Value Expected : " + expDashboardCustomization);

			if (actLoadDashboard == expLoadDashboard && actSelectDashboard == expSelectDashboard
					&& actNewDashboard == expNewDashboard && actDashboardCustomization == expDashboardCustomization) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 573, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 573, 9, resFail);
				return false;
			}
	    }
	    catch (Exception e) 
	 	{
	 	 String exception =e.getMessage();
	 	 excelReader.setExceptionInExcel(xlfile, xlSheetName, 573, 10, exception);
	 	 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	 	 return false;
	 	}
	  }
	  
	 
	 
	 
	  	
	 
	  public boolean checkLogoutInCurrencyMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
	 	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 	 
	 	 try
	 	 {
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		  userNameDisplay.click();
		 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
  	      logoutOption.click();
		  Thread.sleep(2000);
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
		  
		  boolean actUserLoginPage              = username.isDisplayed() && username.isEnabled()
                                                 && password.isDisplayed() && password.isEnabled();
                                        
		  boolean expUserLoginPage              = true;
		  
		  if(actUserLoginPage==expUserLoginPage)  
	      {
			System.out.println("***Test Pass: Login Successfull***");
			excelReader.setCellData(xlfile, xlSheetName, 285, 9, resPass);
			return true;
		  }
	      else
	      {
			System.out.println("***Test Fail: Login Not Successfull***");
			excelReader.setCellData(xlfile, xlSheetName, 285, 9, resFail);
			return false;
		  }
		}
		catch (Exception e)
		{
		 	excelReader.setCellData(xlfile, xlSheetName, 285, 10, e.getMessage());	
			return false;
		}
	 }
	   

	  
	  
	 
	 
	 
		 
	     public SmokeItemPage(WebDriver driver)
	     {
	    	PageFactory.initElements(driver, this);
	    	
	     }

    }
