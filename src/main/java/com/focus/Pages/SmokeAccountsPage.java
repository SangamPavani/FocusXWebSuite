package com.focus.Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import com.focus.base.BaseEngine;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SmokeAccountsPage extends BaseEngine
{

	// Home Menu
	@FindBy(xpath = "//*[@id='1']/div/span")
	public static WebElement homeMenu;

	//Financial Menu
	@FindBy (xpath="//span[@class='icon-financial icon-font1']")
    private static WebElement financialMenu;
	
	//Inventory Menu
	@FindBy (xpath="//span[@class='icon-inventory icon-font1']")
    private static WebElement inventoryMenu;
	
	//Fixed Assets Menu
	@FindBy (xpath="//span[@class='icon-assets icon-font1']")
    private static WebElement fixedAssetsMenu;
	
	//Production Menu
	@FindBy (xpath="//span[@class='icon-production icon-font1']")
    private static WebElement productionMenu;
	
	//Point Of Sale Menu
	@FindBy (xpath="//div[contains(text(),'Point of Sale')]")
    private static WebElement pointOfSaleMenu;
	
	//Quality Of Control Menu
	@FindBy (xpath="//span[@class='icon-quotationanalysis icon-font1']")
    private static WebElement qualityControlMenu;
	
	//Settings Menu
	@FindBy (xpath="//span[@class='icon-settings icon-font1']")
	private static WebElement SettingsMenu;
	
	
        //Company Menu
		@FindBy (xpath="//*[@id='2']/span")
	    private static WebElement companyMenu;

	    //Security Menu	
		@FindBy (xpath="//*[@id='6']/span")
	    private static WebElement securityMenu;

        //Masters Menu	
		@FindBy (xpath="//*[@id='1000']/span")
	    private static WebElement mastersMenu;

        //DataManagement menu
		@FindBy (xpath="//*[@id='25']/span")
	    private static WebElement dataMangementMenu;

        //Utilities Menu		
		@FindBy (xpath="//*[@id='20']/span")
	    private static WebElement utilities;
	
	
		//In Masters Menu
		
		// Accounts
		@FindBy(xpath = "//a[@id='1104']//span[contains(text(),'Account')]")
		public static WebElement accounts;

        @FindBy (xpath="//*[@id='220']/span")
		private static WebElement currency;

        @FindBy (xpath="//*[@id='221']/span")
		private static WebElement products;

        @FindBy (xpath="//*[@id='224']/span")
		private static WebElement mrp;

        @FindBy (xpath="//a[@id='225']//span[contains(text(),'QC')]")
		private static WebElement qc;

        @FindBy (xpath="//*[@id='251']/span")
		private static WebElement maintainance;

        @FindBy (xpath="//*[@id='8001']/span")
		private static WebElement pointOfSale;

        @FindBy (xpath="//*[@id='1106']/span")
		private static WebElement departments;

		@FindBy (xpath="//*[@id='1107']/span")
		private static WebElement warehouse;

		@FindBy (xpath="//*[@id='1108']/span")
		private static WebElement costcenter;

		@FindBy (xpath="//*[@id='1109']/span")
		private static WebElement location;

		@FindBy (xpath="//*[@id='1110']/span")
		private static WebElement region;

		@FindBy (xpath="//*[@id='1111']/span")
		private static WebElement country;

		@FindBy (xpath="//*[@id='1112']/span")
		private static WebElement state;

		@FindBy (xpath="//*[@id='1113']/span")
		private static WebElement city;

		@FindBy (xpath="//*[@id='1115']/span")
		private static WebElement bins;

		@FindBy (xpath="//*[@id='1126']/span")
		private static WebElement insurance;

		@FindBy (xpath="//*[@id='1127']/span")
		private static WebElement fixedassets;
		
		@FindBy (xpath="//*[@id='1161']/span")
		private static WebElement taxCode;
		
        @FindBy (xpath="//*[@id='1103']/span")
		private static WebElement payroll;
	
        @FindBy (xpath="//*[@id='8002']/span")
  		private static WebElement schemes;
		
		


	// Currency Menu
	@FindBy(xpath = "//a[@id='220']//span[contains(text(),'Currency')]")
	private static WebElement currencyMenu;

	@FindBy(xpath = "//span[contains(text(),'Currency Master')]")
	private static WebElement currencyMasterMenu;

	@FindBy(xpath = "//a[@id='71']//span[contains(text(),'Exchange Rate')]")
	private static WebElement exchangeRateMenu;

	@FindBy(xpath = "//span[contains(text(),'Exchange Rate History')]")
	private static WebElement exchangeRateHistoryMenu;

	// Items Menu
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]/span[1]")
	public static WebElement itemsMenu;

	// Item
	@FindBy(xpath = "//*[@id='1105']/span")
	private static WebElement homeMasterItemMainMenuItem;

	@FindBy(xpath = "//span[contains(text(),'Seller Price Book')]")
	private static WebElement sellerPriceBookMenu;

	@FindBy(xpath = "//*[@id='80']/span")
	private static WebElement buyerPriceBookMenu;

	// Units
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[1]")
	public static WebElement unitsMenu;

	// Units Conversion
	@FindBy(xpath = "//a[@id='72']//span[contains(text(),'Unit Conversion')]")
	private static WebElement unitsConversionMenu;

	// Units Conversion Title
	@FindBy(xpath = "//div[@class='navText']//span[contains(text(),'Unit Conversion')]")
	public static WebElement unitsConversionTitle;

	// Department Menu
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[10]/a[1]/span[1]")
	public static WebElement departmentMenu;

	// Bins Menu
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[18]/a[1]/span[1]")
	public static WebElement binsMenu;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/aside[1]/section[1]/ul[1]/li[1]/ul[1]/li[3]/ul[1]/li[11]/a[1]/span[1]")
	public static WebElement warehouseMenu;

	// Accounts Title
	@FindBy(xpath = "//span[@id='spnHeaderText']")
	public static WebElement accountsTitle;

	// Master Main Header Fields
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

	@FindBy(xpath = "//i[@class='icon-font6 icon-delete-all']")
	public static WebElement masterDeleteAllBtn;

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

	// Master Left panel TreeID Elements
	@FindBy(xpath = "//*[@id='iTreeId']")
	public static WebElement masterTreeIdDropdown;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/button/span")
	public static WebElement masterTreeIDToggleBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[1]/a")
	public static WebElement masterTreeIDToggle_CreateTreeBtn;

	@FindBy(xpath = "//h4[contains(text(),'Create Tree')]")
	public static WebElement treeID_CreateTreeLabel;

	@FindBy(xpath = "//*[@id='btnCancel']")
	public static WebElement treeID_CloseBtn;

	@FindBy(xpath = "//input[@id='txtTreeName']")
	public static WebElement treeID_TreeTxt;

	@FindBy(xpath = "//input[@id='rbtManual']")
	public static WebElement treeID_ManualRadioBtn;

	@FindBy(xpath = "//input[@id='rbtAuto']")
	public static WebElement treeID_AutoRadioBtn;

	@FindBy(xpath = "//select[@id='cmbTreeList']")
	public static WebElement treeID_SelectTreeDropdown;

	@FindBy(xpath = "//input[@id='chkIncludeGroup']")
	public static WebElement treeID_IncludeGroupsCheckBox;

	@FindBy(xpath = "//input[@id='chkAddLeaveAtZeroLevel']")
	public static WebElement treeID_AddLeafAlwaysAtTheZerolevelOnCreationCheckbox;

	@FindBy(xpath = "//*[@id='MasterTreeTable_SelectFields']")
	public static WebElement treeID_GridFirstSelectFields;

	@FindBy(xpath = "//*[@id='MasterTreeTable_col_2-1']")
	public static WebElement treeID_GridSecondSelectFields;

	@FindBy(xpath = "//input[@id='chkAutoGroup']")
	public static WebElement treeID_AlwaysAutoGroupOnCreationCheckbox;

	@FindBy(xpath = "//input[@id='chkAlwaysSorted']")
	public static WebElement treeID_AlwaysSortedCheckbox;

	@FindBy(xpath = "//*[@id='btnOk']")
	public static WebElement treeID_PopOkBtn;

	@FindBy(xpath = "//*[@id='btnCancel']")
	public static WebElement treeID_PopCancelBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[2]")
	public static WebElement masterTreeIDToggle_EditBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[3]")
	public static WebElement masterTreeIDToggle_DeleteBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[4]")
	public static WebElement masterTreeIDToggle_setDefaultBtn;

	// TreeViewID Elements
	@FindBy(xpath = "//select[@id='iTreeViewId']")
	public static WebElement masterTreeViewIDDropdown;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/button/span")
	public static WebElement masterTreeViewIDToggleBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[1]")
	public static WebElement masterTreeViewIdCreateViewBtn;

	@FindBy(xpath = "//*[@id='createViewDiv']/div/div[1]/div[1]/h4")
	public static WebElement CreateView_Label;

	@FindBy(xpath = "//*[@id='btnCancel']/i")
	public static WebElement CreateView_CloseBtn;

	@FindBy(xpath = "//*[@id='ctrlCreateMasterViewH']")
	public static WebElement CreateView_CreateViewTxt;

	@FindBy(xpath = "//*[@id='ctrlCreateMasterViewH_input_image']/span")
	public static WebElement CreateView_ExpansionBtn;

	@FindBy(xpath = "//*[@id='ctrlCreateMasterViewH_input_settings']/span")
	public static WebElement CreateView_SettingBtn;

	@FindBy(xpath = "//input[@id='chkAvailbleonMobileApp']")
	public static WebElement CreateView_AvailbleonMobileAppCheckbox;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[1]/select")
	public static WebElement CreateView_Conjuction1Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[2]/select")
	public static WebElement CreateView_AccountType1Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[3]/select")
	public static WebElement CreateView_EqaulTo1Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[4]/select")
	public static WebElement CreateView_Value1Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[5]/input")
	public static WebElement CreateView_Customer1Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[6]/span")
	public static WebElement CreateView_CloseFirstrow;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[7]/span")
	public static WebElement CreateView_AddRowBtn;

	// Creation For Second Row
	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[1]/select")
	public static WebElement CreateView_Conjuction2Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[2]/select")
	public static WebElement CreateView_AccountType2Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[3]/select")
	public static WebElement CreateView_EqaulTo2Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[4]/select")
	public static WebElement CreateView_Value2Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[5]/input")
	public static WebElement CreateView_Customer2Dropdown;

	@FindBy(xpath = "//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[6]/span")
	public static WebElement CreateView_CloseSecondrow;

	@FindBy(xpath = "//button[@id='btnMasterViewDelete']")
	public static WebElement CreateView_DeleteBtn;

	@FindBy(xpath = "//button[@id='btnSave']")
	public static WebElement CreateView_SaveBtn;

	@FindBy(xpath = "//*[@id='btnCancel']")
	public static WebElement CreateView_CancelBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[2]/a")
	public static WebElement masterTreeeViewIdEditBtn;

	@FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[3]/a")
	public static WebElement masterTreeViewIdDeleteBtn;

	@FindBy(xpath = "//div[@id='divTreeMenu']")
	public static WebElement masterTreeDisplayMenuAccountGroups;

	@FindBy(xpath = "//*[@id='oncheckaccorderan']")
	public static WebElement masterOptionToHideAccountsGroupTree; 

	@FindBy(xpath = "//*[@id='0']/a")
	private static WebElement accountRootAccount;
	
	@FindBy(xpath = "//*[@id='12']/a[2]")
	private static WebElement itemUnderRootAccount;

	@FindBy(xpath = "//*[@id='18']/a[2]")
	private static WebElement accountAssestsGroup;

	@FindBy(xpath = "//*[@id='17']/a[2]")
	private static WebElement accountFixedAssestsGroup;

	@FindBy(xpath = "//*[@id='23']/a[2]")
	private static WebElement accountCurrentAssetsGroup;

	@FindBy(xpath = "//*[@id='8']/a[2]")
	private static WebElement accountCAshAndBankGroup;

	@FindBy(xpath = "//*[@id='13']/a[2]")
	private static WebElement accountInventoriesGroup;

	@FindBy(xpath = "//*[@id='22']/a[2]")
	private static WebElement accountAccountsReceivableGroup;

	@FindBy(xpath = "//*[@id='72']/a[2]")
	private static WebElement accountInvestmentsGroup;

	@FindBy(xpath = "//*[@id='25']/a[2]")
	private static WebElement accountExpensesGroup;

	@FindBy(xpath = "//*[@id='24']/a[2]")
	private static WebElement accountDirectExpensesGroup;

	@FindBy(xpath = "//*[@id='73']/a[2]")
	private static WebElement accountIndirectExpensesGroup;

	@FindBy(xpath = "//*[@id='54']/a[2]")
	private static WebElement accountAdministrativeExpensesGroup;

	@FindBy(xpath = "//*[@id='60']/a[2]")
	private static WebElement accountEmployeeBenefitsGroup;

	@FindBy(xpath = "//*[@id='64']/a[2]")
	private static WebElement accountFinancialChargesGroup;

	@FindBy(xpath = "//*[@id='69']/a[2]")
	private static WebElement accountGainAndLossGroup;

	@FindBy(xpath = "//*[@id='26']/a[2]")
	private static WebElement accountControlAccountsGroup;

	@FindBy(xpath = "//*[@id='29']/a[2]")
	private static WebElement accountRevenueGroup;

	@FindBy(xpath = "//*[@id='28']/a[2]")
	private static WebElement accountSalesGroup;

	@FindBy(xpath = "//*[@id='33']/a[2]")
	private static WebElement accountEqitiesGroup;

	@FindBy(xpath = "//*[@id='32']/a[2]")
	private static WebElement accountCapitalGroup;

	@FindBy(xpath = "//*[@id='39']/a[2]")
	private static WebElement accountLiabilitiesGroup;

	@FindBy(xpath = "//*[@id='38']/a[2]")
	private static WebElement accountLoanAndBorrowingGroup;

	@FindBy(xpath = "//*[@id='37']/a[2]")
	private static WebElement accountLoansGroup;

	@FindBy(xpath = "//*[@id='42']/a[2]")
	private static WebElement accountAccruedLiabilitiesGroup;

	@FindBy(xpath = "//*[@id='45']/a[2]")
	private static WebElement accountTradePayableGroup;

	@FindBy(xpath = "//*[@id='48']/a[2]")
	private static WebElement accountProvisionsGroup;

	// Header Elements of Master MainLanding
	@FindBy(xpath = "//*[@id='txtsrch-term']")
	public static WebElement masterSearchTxt;

	@FindBy(xpath = "//*[@id='btnSearchAcc1']/i")
	public static WebElement masterSearchBtn;

	@FindBy(xpath = "//a[contains(text(),'Search on')]")
	public static WebElement masterSearchTxtBtn_SearchOnBtn;

	@FindBy(xpath = "//label[@class='form-group']")
	public static WebElement searchOn_SelectFilterLabel;

	@FindBy(xpath = "//select[@id='ddlSelectFilter']")
	public static WebElement searchOn_SelectFilterDropdown;

	@FindBy(xpath = "//input[@id='chkSearchSelectAll']")
	public static WebElement searchOn_SelectAllCheckBox;

	@FindBy(xpath = "//*[@id='0']")
	public static WebElement searchOn_NameCheckbox;

	@FindBy(xpath = "//input[@id='1']")
	public static WebElement searchOn_AliasCheckbox;

	@FindBy(xpath = "//input[@id='2']")
	public static WebElement searchOn_COdeCheckbox;

	@FindBy(xpath = "//input[@id='3']")
	public static WebElement searchOn_AccountTypeCheckbox;

	@FindBy(xpath = "//input[@id='4']")
	public static WebElement searchOn_CreditLimitCheckbox;

	@FindBy(xpath = "//input[@id='5']")
	public static WebElement searchOn_CreditDaysCheckbox;

	@FindBy(xpath = "//input[@id='6']")
	public static WebElement searchOn_CreatedByCheckbox;

	@FindBy(xpath = "//input[@id='7']")
	public static WebElement searchOn_ModifiedByCheckbox;

	@FindBy(xpath = "//input[@id='8']")
	public static WebElement searchOn_CreatedDateCheckbox;

	@FindBy(xpath = "//input[@id='9']")
	public static WebElement searchOn_ModifiedDate;

	@FindBy(xpath = "//input[@id='10']")
	public static WebElement searchOn_AllowOtherCompaniesToViewTheRecordCheckbox;

	@FindBy(xpath = "//input[@id='11']")
	public static WebElement searchOn_SyscReceiverDateCheckbox;

	@FindBy(xpath = "//input[@id='12']")
	public static WebElement searchOn_EditingLocationCheckbox;

	@FindBy(xpath = "//input[@id='13']")
	public static WebElement searchOn_ChequeDiscountLimitCheckbox;

	@FindBy(xpath = "//input[@id='14']")
	public static WebElement searchOn_RateOfInterestCheckbox;

	@FindBy(xpath = "//input[@id='15']")
	public static WebElement searchOn_BankACCheckbox;

	@FindBy(xpath = "//input[@id='16']")
	public static WebElement searchOn_PDCDIscountedAC;

	@FindBy(xpath = "//input[@id='17']")
	public static WebElement searchOn_DebitCreditProposalCheckbox;

	@FindBy(xpath = "//input[@id='18']")
	public static WebElement searchOn_DebitCreditRequiredCheckbox;

	@FindBy(xpath = "//input[@id='19']")
	public static WebElement searchOn_ExchangeAdjustmentGainACCheckbox;

	@FindBy(xpath = "//input[@id='20']")
	public static WebElement searchOn_ExchangeAdjustmentLossACCheckbox;

	@FindBy(xpath = "//input[@id='21']")
	public static WebElement searchOn_PrimaryAccountCheckbox;

	@FindBy(xpath = "//input[@id='22']")
	public static WebElement searchOn_DefaultCurrencyCheckbox;

	@FindBy(xpath = "//input[@id='23']")
	public static WebElement searchOn_ConsolidationMethodCheckbox;

	@FindBy(xpath = "//input[@id='24']")
	public static WebElement searchOn_PaymentTermsCheckbox;

	@FindBy(xpath = "//input[@id='25']")
	public static WebElement searchOn_RemainderTermsCheckbox;

	@FindBy(xpath = "//input[@id='26']")
	public static WebElement searchOn_FinanceChargeTermsCheckbox;

	@FindBy(xpath = "//input[@id='27']")
	public static WebElement searchOn_AddressCheckbox;

	@FindBy(xpath = "//input[@id='28']")
	public static WebElement searchOn_City1Checkbox;

	@FindBy(xpath = "//input[@id='29']")
	public static WebElement searchOn_Pin1Checkbox;

	@FindBy(xpath = "//input[@id='30']")
	public static WebElement searchOn_DeliveryAddreddCheckbox;

	@FindBy(xpath = "//input[@id='31']")
	public static WebElement searchOn_City2Checkbox;

	@FindBy(xpath = "//input[@id='32']")
	public static WebElement searchOn_Pin2Checkbox;

	@FindBy(xpath = "//input[@id='33']")
	public static WebElement searchOn_SendEmailToCustomerCheckbox;

	@FindBy(xpath = "//input[@id='34']")
	public static WebElement searchOn_AllowCustomerPortalCheckbox;

	@FindBy(xpath = "//input[@id='35']")
	public static WebElement searchOn_EmailCheckbox;

	@FindBy(xpath = "//input[@id='36']")
	public static WebElement searchOn_PasswordCheckbox;

	@FindBy(xpath = "//input[@id='37']")
	public static WebElement searchOn_TelNOCheckbox;

	@FindBy(xpath = "//input[@id='38']")
	public static WebElement searchOn_FaxNoCheckbox;

	@FindBy(xpath = "//input[@id='39']")
	public static WebElement searchOn_BankAccountNameCheckbox;

	@FindBy(xpath = "//input[@id='40']")
	public static WebElement searchOn_BankAccountNumberCheckbox;

	@FindBy(xpath = "//input[@id='41']")
	public static WebElement searchOn_IFSCCodeCheckbox;

	@FindBy(xpath = "//input[@id='42']")
	public static WebElement searchOn_PaymentTypeCheckbox;

	@FindBy(xpath = "//input[@id='43']")
	public static WebElement searchOn_FinanceEmailCheckbox;

	@FindBy(xpath = "//input[@id='44']")
	public static WebElement searchOn_PortalEmailCheckbox;

	@FindBy(xpath = "//input[@id='45']")
	public static WebElement searchOn_NetbalanceCheckbox;

	@FindBy(xpath = "//input[@id='46']")
	public static WebElement searchOn_DRBalanceCheckbox;

	@FindBy(xpath = "//input[@id='47']")
	public static WebElement searchOn_CRbalanceCheckbox;

	@FindBy(xpath = "//*[@id='divSearchMenu']/div[4]/button")
	public static WebElement searchOn_OkBtn;

	@FindBy(xpath = "//a[contains(text(),'Advance Search')]")
	public static WebElement masterSearchTxtBtn_AdvanceSearchBtn;

	// First Row Fields
	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[1]/select")
	public static WebElement advanceSearch_Conjuction1Dropdown;

	@FindBy(xpath = "//tbody//input[@placeholder='Select Field']")
	public static WebElement advanceSearch_SelectField1Dropdown;

	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[3]/select")
	public static WebElement advanceSearch_SelectOperator1Dropdown;

	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[4]/select")
	public static WebElement advanceSearch_CompareWith1Dropdown;

	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[5]/input")
	public static WebElement advanceSearch_Value1Txt;

	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[6]/span")
	public static WebElement advanceSearch_CloseRow1Btn;

	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[7]/span")
	public static WebElement advanceSearch_AddRowBtn;

	// Second Row Fields
	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[1]/select")
	public static WebElement advanceSearch_ConjuctionDropdown;

	@FindBy(xpath = "//tbody//input[@placeholder='Select Field']")
	public static WebElement advanceSearch_SelectFieldDropdown;

	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[3]/select")
	public static WebElement advanceSearch_SelectOperatorDropdown;

	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[4]/select")
	public static WebElement advanceSearch_CompareWithDropdown;

	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[5]/input")
	public static WebElement advanceSearch_ValueTxt;

	@FindBy(xpath = "//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[6]/span")
	public static WebElement advanceSearch_CloseRow2Btn;

	@FindBy(xpath = "//*[@id='divCreateNewTreeModalBody']/div[2]/div[2]/input")
	public static WebElement advanceSearch_GenerateQueryBtn;

	@FindBy(xpath = "//div[@id='divStrQuery']")
	public static WebElement advanceSearch_QueryDescriptionTxt;

	@FindBy(xpath = "//button[@id='btnOk']")
	public static WebElement advanceSearch_OkBtn;

	@FindBy(xpath = "//*[@id='btnCancel']")
	public static WebElement advanceSearch_CancelBtn;

	@FindBy(xpath = "//*[@id='btnCancel']/i") /// Both Has Same ID But But
												/// Different in Fields
	public static WebElement advanceSearch_CloseBtn;

	@FindBy(xpath = "//input[@id='cmbUserTypeMaster']")
	public static WebElement mastercmbMasterTxt;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_image']/span")
	public static WebElement masterCmbMasterExpansionBtn;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_input_settings']/span")
	public static WebElement masterCumMasterSettingBtn;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_container']")
	public static WebElement masterCumMaster_Pop_sNameTxt;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[1]")
	public static WebElement masterCumMaster_StandardFieldsBtn;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_heading']")
	public static WebElement masterCumMaster_PopCustomizeDispalyColumnsLabel;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_standardfields_list']")
	public static WebElement masterCumMaster_Pop_StandardFields_Filedsdropdown;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_standardfields_header']")
	public static WebElement masterCumMaster_Pop_StandardFields_HeaderTxt;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_standardfields_alignment']")
	public static WebElement masterCumMaster_Pop_StandardFields_Allignmentdropdown;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_standardfields_width']")
	public static WebElement masterCumMaster_Pop_StandardFields_WidthTxt;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[3]")
	public static WebElement masterCumMaster_Pop_StandardFields_OkBtn;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[4]")
	public static WebElement masterCumMaster_Pop_StandardFields_CancelBtn;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[2]")
	public static WebElement masterCumMaster_Pop_DeleteColumnBtn;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[3]")
	public static WebElement masterCumMaster_Pop_OkBtn;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[4]")
	public static WebElement masterCumMaster_Pop_CancelBtn;

	@FindBy(xpath = "//*[@id='li_moveup']/div/div[1]/a[1]/span")
	public static WebElement masterMoveTheSelectionToNextBookMarkBtn;

	@FindBy(xpath = "//span[@class='icon-font6 icon-bookmarkdown theme_icon-color']")
	public static WebElement masterMoveTheSelectionToPrevoiusBookmarkBtn;

	@FindBy(xpath = "//span[@class='theme_icon-color icon-font6 icon-show-all-records']")
	public static WebElement masterShowAllRecordsBtn;

	@FindBy(xpath = "//span[@class='icon-font6 icon-missmatched-entries theme_icon-color']")
	public static WebElement masterShowAllUnauthorisedRecords;

	@FindBy(xpath = "//span[@class='icon-font6 icon-closed-records theme_icon-color']")
	public static WebElement masterShowAllClosedRecordsBtn;

	@FindBy(xpath = "//span[@class='icon-font6 icon-external-module theme_icon-color']")
	public static WebElement masterAutoAdjustColoumnsBtn;

	@FindBy(xpath = "//input[@id='chkRetainSelection']")
	public static WebElement masterRetainSelectionCheckBox;

	@FindBy(xpath = "//*[@id='btnsideBar']")
	public static WebElement masterSideBarBtn;

	// InfoPanel
	@FindBy(xpath = "//label[contains(text(),'Info Panel')]")
	public static WebElement masterInfoPanelLabel;

	@FindBy(xpath = "//i[@class='icon-custamize theme_icon-color']")
	public static WebElement masterInfoPanelCustammizeBtn;

	@FindBy(xpath = "//h4[contains(text(),'Customize InfoPanel')]")
	public static WebElement infoPanel_CustomizeInfoPanelLabel;

	@FindBy(xpath = "//*[@id='Customize_AddNew_InfoPanel']/div[1]/span")
	public static WebElement infoPanel_PopAddBtn;

	@FindBy(xpath = "//*[@id='Customize_RemoveOne_InfoPanel']/div[1]/span")
	public static WebElement infoPanel_PopRemoveBtn;

	@FindBy(xpath = "//*[@id='btnShowPanelNames_CustomizeInfoPanel']/div/span")
	public static WebElement infoPanel_PopAllIcon;

	@FindBy(xpath = "//*[@id='btnShowPanelDetails_CustomizeInfoPanel']/div/span")
	public static WebElement infoPanel_PopDetailsIcon;

	@FindBy(xpath = "//*[@id='tbl_infoPanel_names']/tbody/tr[1]/td[4]/i")
	public static WebElement infoPane_PopGridCreditHistoryAddBtn;

	@FindBy(xpath = "//*[@id='tbl_infoPanel_names']/tbody/tr[2]/td[4]/i")
	public static WebElement infoPane_PopGridAgingAnalysisAddBtn;

	@FindBy(xpath = "//*[@id='tbl_infoPanel_names']/tbody/tr[3]/td[4]/i")
	public static WebElement infoPane_PopGridAgingAnlaysisBaseAddBtn;

	@FindBy(xpath = "//*[@id='tbl_infoPanel_names']/tbody/tr[4]/td[4]/i")
	public static WebElement infoPane_PopGridAuthorizationAddBtn;

	@FindBy(xpath = "//a[@class='Fbutton previous_link']")
	public static WebElement infoPane_PopDetailsPreviousBtn;

	@FindBy(xpath = "//*[@id='page_navigation']/a[2]")
	public static WebElement infoPane_PopDeailsOneBtn;

	@FindBy(xpath = "//*[@id='customize_InfoPanel_btnSave']")
	public static WebElement infoPane_PopDeatilsSaveBtn;

	@FindBy(xpath = "//*[@id='customize_InfoPanel_btnCancel']")
	public static WebElement infoPane_PopDetailsCloseBtn;

	@FindBy(xpath = "//*[@id='btnCancel']/i")
	public static WebElement infoPane_PopCloseBtn;

	@FindBy(xpath = "//i[@id='id_InfoPanelEdit']")
	public static WebElement masterInfoPanelEditBtn;

	@FindBy(xpath = "//i[@id='infopanelCloseButton']")
	public static WebElement masterInfoPanelCloseBtn;

	// Grid Elements
	// Body Elements

	@FindBy(xpath = "//th[2]//span[1]")
	public static WebElement masterGrid_Header_SelectTxt;

	@FindBy(xpath = "//input[@id='liSelectAllMasters']")
	public static WebElement masterGridHeader_SelectAllRowsCheckBox;

	@FindBy(xpath = "//section[@id='page_Content']//th[3]")
	public static WebElement masterGridHeader_MasterId;

	@FindBy(xpath = "//section[@id='page_Content']//th[4]]")
	public static WebElement masterGridHeader_Name;
	
	
	@FindBy(xpath = "//th[contains(@class,'OverFlowHidden text-center')]//span[contains(text(),'Name')]")
	public static WebElement masterGridHeader_UnitsName;
	
	@FindBy(xpath = "//th[contains(@class,'OverFlowHidden text-center')]//span[contains(text(),'Code')]")
	public static WebElement masterGridHeader_Code;
	
	@FindBy(xpath = "//th[contains(@class,'OverFlowHidden text-center')]//span[contains(text(),'No of decimals')]")
	public static WebElement masterGridHeader_NoOfDecimal;
	
	@FindBy(xpath = "//th[contains(@class,'OverFlowHidden text-center')]//span[contains(text(),'Rounding Type')]")
	public static WebElement masterGridHeader_UnitsRoundingType;

	@FindBy(xpath = "//td[contains(text(),'ASSETS')]")
	public static WebElement masterAssets;

	@FindBy(xpath = "//td[contains(text(),'EXPENSES')]")
	public static WebElement masterExpenses;

	@FindBy(xpath = "//td[contains(text(),'CONTROL ACCOUNTS')]")
	public static WebElement masterControlAccounts;

	@FindBy(xpath = "//td[contains(text(),'REVENUE')]")
	public static WebElement masterRevenue;

	@FindBy(xpath = "//td[contains(text(),'EQUITIES')]")
	public static WebElement masterEquities;

	@FindBy(xpath = "//td[contains(text(),'LIABILITIES')]")
	public static WebElement masterLiabilities;

	@FindBy(xpath = "//section[@id='page_Content']//th[6]")
	public static WebElement masterGridHeader_ReorderLevel;

	@FindBy(xpath = "//section[@id='page_Content']//th[7]")
	public static WebElement masterGridHeader_BinCapacity;

	@FindBy(xpath = "//section[@id='page_Content']//th[8]")
	public static WebElement masterGridHeader_ISAttribute;

	@FindBy(xpath = "//section[@id='page_Content']//th[9]")
	public static WebElement masterGridHeader_ProducyType;

	@FindBy(xpath = "//th[contains(text(),'Valuation Method')]")
	public static WebElement masterGridHeader_ValuationMethod;

	@FindBy(xpath = "//th[@class='OverFlowHidden text-center']//span[contains(text(),'No of decimals')]")
	public static WebElement masterGridHeader_NoOfDecimals;

	@FindBy(xpath = "//section[@id='page_Content']//th[7]")
	public static WebElement masterGridHeader_RoundingType;

	@FindBy(xpath = "//td[contains(text(),'Customer A')]")
	public static WebElement masterCustomerA;

	@FindBy(xpath = "//td[contains(text(),'Customer B')]")
	public static WebElement masterCustomerB;

	@FindBy(xpath = "//td[contains(text(),'Customer B')]")
	public static WebElement masterCustomerC;

	// Row Selecting
	@FindBy(xpath = "//*[@id='lblnchecked']/input")
	public static WebElement masterGrid_SelectFirstRow;

	// Footer Fields
	@FindBy(xpath = "//*[@id='id_PageButtonsMasterLanding']/div/div[1]/div/input")
	public static WebElement masterFirstBtn;

	@FindBy(xpath = "//*[@id='id_PageButtonsMasterLanding']/div/div[2]/div/input")
	public static WebElement masterPreviousBtn;

	@FindBy(xpath = "//*[@id='btn1']")
	public static WebElement masterOneBtn;

	@FindBy(xpath = "//*[@id='id_PageButtonsMasterLanding']/div/div[4]/div/input")
	public static WebElement masterNextBtn;

	@FindBy(xpath = "//*[@id='id_PageButtonsMasterLanding']/div/div[5]/div/input")
	public static WebElement masterEndBtn;

	// Accounts Creation Page

	// Header tab Fields
	@FindBy(xpath = "//*[@id='divBtnGroup0']/div/a")
	public static WebElement headerGeneralTab;
	
	@FindBy(xpath = "//*[@id='divBtnGroup1']/div/a")
	public static WebElement headerAccountSettingTab;

	@FindBy(xpath = "//*[@id='divBtnGroup2']/div/a")
	public static WebElement headerDetailsTab;

	@FindBy(xpath = "//*[@id='divBtnGroup3']/div/a")
	public static WebElement headerPrintLayoutTab;

	@FindBy(xpath = "//*[@id='divBtnGroup1']/div/a")
	public static WebElement headerUnitsTab;

	@FindBy(xpath = "//*[@id='divBtnGroup2']/div/a")
	public static WebElement headerItemSettingsTab;

	@FindBy(xpath = "//*[@id='divBtnGroup3']/div/a")
	public static WebElement headerClassificationTab;

	@FindBy(xpath = "//*[@id='divBtnGroup4']/div/a")
	public static WebElement headerCreatetabUpdateTab;
	
	@FindBy(xpath = "//*[@id='ExtraFieldOne']")
	public static WebElement extraFieldCreateUpdateTab;

	@FindBy(xpath = "//*[@id='divBtnGroup5']/div/a")
	public static WebElement headerReplenishmentTab;

	@FindBy(xpath = "//*[@id='divBtnGroup6']/div/a")
	public static WebElement headerOutletTab;

	
	
	
	// Header Section Fields
	@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
	public static WebElement saveBtn;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	public static WebElement closeBtn;

	
	@FindBy(xpath="//i[@class='icon-close icon-font6']")
	private static WebElement  closeBtnInDocumentCustmization;
	
	// Edit option Fields
	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
	public static WebElement editcloseBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-paste-clipboard']")
	public static WebElement pasteBtn;

	@FindBy(xpath = "//button[@id='btnMasterClone']")
	public static WebElement editcloneBtn;

	@FindBy(xpath = "//*[@id='btnMasterCopy']")
	public static WebElement copyBtn;

	// New General Elements
	// Name
	@FindBy(xpath = "//input[@id='sName']")
	public static WebElement nameTxt;

	// Code
	@FindBy(xpath = "//input[@id='sCode']")
	public static WebElement codeTxt;

	// AccountType
	@FindBy(xpath = "//select[@id='iAccountType']")
	public static WebElement accountTypeDropdown;

	// CreditLimit
	@FindBy(xpath = "//input[@id='fCreditLimit']")
	public static WebElement creditLimitTxt;

	// CreditDays
	@FindBy(xpath = "//input[@id='iCreditDays']")
	public static WebElement creditdaysTxt;

	// ChequeDiscountLimit
	@FindBy(xpath = "//input[@id='fChequeDiscountLimit']")
	public static WebElement chequeDiscountLimitTxt;

	// Rate Of Interest
	@FindBy(xpath = "//input[@id='fRateofinterest']")
	public static WebElement rateofinterestTxt;

	// BankAccount
	@FindBy(xpath = "//input[@id='iBankAc']")
	public static WebElement bankAccountTxt;

	@FindBy(xpath = "//*[@id='iBankAc_input_image']/span")
	public static WebElement bankAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='iBankAc_input_settings']/span")
	public static WebElement bankAccount_SettingBtn;

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
	@FindBy(xpath = "//input[@id='iDefaultCurrency']")
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
	private static WebElement itemLabel;

	@FindBy(xpath = "//*[@id='btnNew']")
	private static WebElement itemNewBtn;

	// Item General Tab
	@FindBy(xpath = "//*[@id='divBtnGroup0']/div/a")
	private static WebElement ItemNewnewGeneralBtn;

	@FindBy(xpath = "//input[@id='sName']")
	private static WebElement newGeneralName;

	@FindBy(xpath = "//input[@id='sCode']")
	private static WebElement newGeneralCode;

	@FindBy(xpath = "//select[@id='iProductType']")
	private static WebElement newGeneralItemTypeDropDown;

	@FindBy(xpath = "//input[@id='fReorderLevel']")
	private static WebElement newGeneralReorderLevel;

	@FindBy(xpath = "//input[@id='iBinCapacity']")
	private static WebElement newGeneralBinCapacity;

	@FindBy(xpath = "//select[@id='iValuationMethod']")
	private static WebElement newGeneralValuationMethodDropDown;

	@FindBy(xpath = "//input[@id='iCategory']")
	private static WebElement newGeneralCategoryDropDown;

	@FindBy(xpath = "//td[@id='iCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement newGeneralCategorySettingBtn;

	@FindBy(xpath = "//select[@id='iProductMake']")
	private static WebElement newGeneralItemMakeDropDown;

	@FindBy(xpath = "//input[@id='Printer']")
	private static WebElement newGeneralPrint;

	@FindBy(xpath = "//input[@id='iAlternateCategory']")
	private static WebElement newGeneralAlternativeCategoryDropdown;

	@FindBy(xpath = "//td[@id='iAlternateCategory_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement newGeneralAlternativeCategoryDropdownSettingBtn;

	@FindBy(xpath = "//textarea[@id='sDescription']")
	private static WebElement newGeneralDescription;

	@FindBy(xpath = "//input[@id='bPerishableItem']")
	private static WebElement newGeneralPerishableItemCheckBox;

	@FindBy(xpath = "//input[@id='iBin']")
	private static WebElement newGeneralBinDropdown;

	@FindBy(xpath = "//td[@id='iBin_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement newGeneralBinDropdownSettingBtn;

	@FindBy(xpath = "//input[@id='pImage']")
	private static WebElement newGeneralUploadImageOrFileBtn;

	@FindBy(xpath = "//*[@id='btnMasterSaveClick']/i")
	private static WebElement newGeneralSaveBtn;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	private static WebElement newGeneralCLoseBtn;

	// Item Units Tab
	@FindBy(xpath = "//*[@id='divBtnGroup1']/div/a")
	private static WebElement ItemNewUnitsBtn;

	@FindBy(xpath = "//input[@id='iDefaultBaseUnit']")
	private static WebElement itemUnitsDefaultBaseUnitDropdown;

	@FindBy(xpath = "//td[@id='iDefaultBaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement itemUnitsDefaultBaseUnitSetting;

	@FindBy(xpath = "//input[@id='iDefaultSalesUnit']")
	private static WebElement itemUnitsDefaultSalesUnitDropdown;

	@FindBy(xpath = "//td[@id='iDefaultSalesUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement itemUnitsDefaultSalesUnitSettingsBtn;

	@FindBy(xpath = "//input[@id='iDefaultPurchaseUnit']")
	private static WebElement itemUnitsDefaultPurchaseUnitDropDown;

	@FindBy(xpath = "//td[@id='iDefaultPurchaseUnit_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement itemUnitsDefaultPurchaseUnitSettingsBtn;

	@FindBy(xpath = "//input[@id='fLength']")
	private static WebElement itemUnitsLength;

	@FindBy(xpath = "//input[@id='fWidth']")
	private static WebElement itemUnitswidth;

	@FindBy(xpath = "//input[@id='fHeight']")
	private static WebElement itemUnitsHeight;

	@FindBy(xpath = "//*[@id='fCBM']")
	private static WebElement itemUnitsCBM;

	@FindBy(xpath = "//input[@id='fWeight']")
	private static WebElement itemUnitsWeight;

	@FindBy(xpath = "//input[@id='iPalletUnit']")
	private static WebElement itemUnitsPalletUnitTxt;

	@FindBy(xpath = "//input[@id='fPalletQty']")
	private static WebElement itemUnitsPalletQtyTxt;

	@FindBy(xpath = "//input[@id='fPalletLength']")
	private static WebElement itemUnitsPalletLengthTXt;

	@FindBy(xpath = "//input[@id='fPalletWidth']")
	private static WebElement itemUnitsPalletWidthTxt;

	@FindBy(xpath = "//input[@id='fPalletHeight']")
	private static WebElement itemUnitsPalletHeightTxt;

	// Master Item Settings
	@FindBy(xpath = "//*[@id='divBtnGroup2']/div/a")
	private static WebElement ItemNewSettingsBtn;

	@FindBy(xpath = "//*[@id='fStandardCost']")
	private static WebElement NewSettingsStandardCost;

	@FindBy(xpath = "//*[@id='fOverheadCost']")
	private static WebElement NewSettingsOverheadCost;

	@FindBy(xpath = "//*[@id='fIndirectCost']")
	private static WebElement NewSettingsIndirectCost;

	@FindBy(xpath = "//*[@id='fProfit']")
	private static WebElement NewSettingsProfit;

	@FindBy(xpath = "//*[@id='iDontshowproductexpireddays']")
	private static WebElement NewSettingsDontshowproductexpireddays;

	@FindBy(xpath = "//*[@id='iTaxCode']")
	private static WebElement NewSettingsTaxCode;

	@FindBy(xpath = "//*[@id='iTaxCode_input_settings']/span")
	private static WebElement NewSettingsTaxCodeSttingsBtn;

	@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
	private static WebElement NewSettingsSaveBtn;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	private static WebElement NewSettingsCloseBtn;

	// Master Item Classification
	@FindBy(xpath = "//*[@id='divBtnGroup3']/div/a")
	private static WebElement ItemNewClassificationBtn;

	@FindBy(xpath = "//*[@id='iABCCodeValue']")
	private static WebElement newItemClassificationABC_CodeValueDropdown;

	@FindBy(xpath = "//*[@id='iABCCodeMargin']")
	private static WebElement newItemClassificationABC_CodeMarginDropdOwn;

	@FindBy(xpath = "//*[@id='iABCCodeRevenue']")
	private static WebElement newItemClassificationABCCodeRevenueDropdown;

	@FindBy(xpath = "//*[@id='iABCCodeCarryingCost']")
	private static WebElement newItemClassificationABCCodeCarryingCostDropdown;

	@FindBy(xpath = "//*[@id='sBarcode1']")
	private static WebElement newItemClassificationBarcode1;

	@FindBy(xpath = "//*[@id='sBarcode2']")
	private static WebElement newItemClassificationBarcode2;

	@FindBy(xpath = "//*[@id='sBarcode3']")
	private static WebElement newItemClassificationBarcode3;

	@FindBy(xpath = "//*[@id='iUnit1']")
	private static WebElement newItemgridFirstrowUnit;

	@FindBy(xpath = "//*[@id='sBarcode1']")
	private static WebElement newItemgridFirstrowBarcode;

	// Grid element
	@FindBy(xpath = "//*[@id='sBatch1']")
	private static WebElement newItemClassificationgridFirstrowBatch;

	@FindBy(xpath = "//*[@id='iUnit2']")
	private static WebElement newItemClassificationgridSecondrowUnit;

	@FindBy(xpath = "//*[@id='sBarcode2']")
	private static WebElement newItemClassificationgridSecondrowBarcode;

	@FindBy(xpath = "//*[@id='sBatch2']")
	private static WebElement newItemClassificationgridSecondrowBatch;

	@FindBy(xpath = "//*[@id='iUnit3']")
	private static WebElement newItemClassificationgridThridrowUnit;

	@FindBy(xpath = "//*[@id='sBarcode3']")
	private static WebElement newItemClassificationgridThridrowBarcode;

	@FindBy(xpath = "//*[@id='sBatch3']")
	private static WebElement newItemClassificationgridThridrowBatch;

	@FindBy(xpath = "//*[@id='iUnit_input_settings']")
	private static WebElement newItemClassificationgridUnitSettings;

	@FindBy(xpath = "//div[@id='divTreeMenu']")
	private static WebElement treeUnitsDisplay;

	// Master Item Other Details
	@FindBy(xpath = "//*[@id='divBtnGroup4']/div/a")
	private static WebElement ItemNewOtherDetailsBtn;

	@FindBy(xpath = "//input[@id='iCostOfIssueAccount']")
	private static WebElement newOtherDetailsCostOfIssueitem;

	@FindBy(xpath = "//td[@id='iCostOfIssueAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement newOtherDetailsCostOfIssueitemsettingsBtn;

	@FindBy(xpath = "//input[@id='iStocksAccount']")
	private static WebElement newOtherDetailsStocksitem;

	@FindBy(xpath = "//td[@id='iStocksAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement newOtherDetailsiStocksitemsettingsBtn;

	@FindBy(xpath = "//input[@id='iSalesAccount']")
	private static WebElement newOtherDetailsSalesAccount;

	@FindBy(xpath = "//td[@id='iSalesAccount_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement newOtherDetailsSalesitemsettingsBtn;

	@FindBy(xpath = "//input[@id='iWIPAccount']")
	private static WebElement newOtherDetailsWIPitem;

	@FindBy(xpath = "//td[@id='iWIPAccount_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
	private static WebElement newOtherDetailsWIPitemsettingsBtn;

	@FindBy(xpath = "//input[@id='iCostofShortageStockAC']")
	private static WebElement newOtherDetailsCostofShortageStockAC;

	@FindBy(xpath = "//td[@id='iCostofShortageStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
	private static WebElement newOtherDetailsCostofShortageStockACsettingsBtn;

	@FindBy(xpath = "//input[@id='iCostofExcessStockAC']")
	private static WebElement newOtherDetailsCostofExcessStockAC;

	@FindBy(xpath = "//td[@id='iCostofExcessStockAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
	private static WebElement OtherDetailsCostofExcessStockACsettingsBtn;

	@FindBy(xpath = "//input[@id='iCostofSaleReturnAC']")
	private static WebElement OtherDetailsCostofSaleReturnAC;

	@FindBy(xpath = "//td[@id='iCostofSaleReturnAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
	private static WebElement OtherDetailsCostofSaleReturnACsettingsBtn;

	@FindBy(xpath = "//input[@id='iPurchaseVarianceAC']")
	private static WebElement OtherDetailsPurchaseVarianceAC;

	@FindBy(xpath = "//td[@id='iPurchaseVarianceAC_input_settings']//span[contains(@class,'icon-settings optioncontrol_settings_margin')]")
	private static WebElement OtherDetailsPurchaseVarianceACsettingsBtn;

	@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
	private static WebElement newOtherDetailsSaveBtn;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	private static WebElement newOtherDetailsCloseBtn;

	// Grid Elements
	@FindBy(xpath = "//*[@id='ioWarehouse1']")
	private static WebElement newOtherDetailsgridFirstrowWareHouse;

	@FindBy(xpath = "//*[@id='ioWarehouse_input_settings']/span")
	private static WebElement newGridWarehouseSettingBtn;

	@FindBy(xpath = "//*[@id='1']")
	private static WebElement newOtherDetailsgridFirstrowSupplier;

	@FindBy(xpath = "//*[@id='iSupplier_input_settings']/span")
	private static WebElement newGridSupplierSettingBtn;

	@FindBy(xpath = "//*[@id='sSupCode1']")
	private static WebElement newOtherDetailsgridFirstrowCode;

	@FindBy(xpath = "//*[@id='iStartDate1']")
	private static WebElement newOtherDetailsgridFirstrowStartDate;

	@FindBy(xpath = "//*[@id='iEndDate1']")
	private static WebElement newOtherDetailsgridFirstrowEnddate;

	@FindBy(xpath = "//*[@id='fRate1']")
	private static WebElement newOtherDetailsgridFirstrowRate;

	@FindBy(xpath = "//*[@id='iTolerance1']")
	private static WebElement newOtherDetailsgridFirstTolerance;

	@FindBy(xpath = "//*[@id='iLeadTime1']")
	private static WebElement newOtherDetailsgridFirstrowLeadTime;

	@FindBy(xpath = "//*[@id='iCreditDays1']")
	private static WebElement newOtherDetailsgridFirstrowUnitCreditDays;

	@FindBy(xpath = "//*[@id='iCreditLimit1']")
	private static WebElement newOtherDetailsgridFirstrowCreditLimit;

	@FindBy(xpath = "//*[@id='LeastDeliveryDate1']")
	private static WebElement newOtherDetailsgridFirstrowLastDeliveryDate;

	// Master Item Replenishment
	@FindBy(xpath = "//*[@id='divBtnGroup5']/div/a")
	private static WebElement ItemNewReplenishmentBtn;

	@FindBy(xpath = "//*[@id='iDefaultReplenishment']")
	private static WebElement newreplenishmentDefaultReplenishment;

	@FindBy(xpath = "//*[@id='iManufacturePolicy']")
	private static WebElement newreplenishmentManufacturePolicy;

	@FindBy(xpath = "//*[@id='iPackingBOM']")
	private static WebElement newreplenishmentPackingBOM;

	@FindBy(xpath = "//*[@id='iPackingBOM_input_settings']/span")
	private static WebElement newreplenishmentPackingBOMsettingsBtn;

	@FindBy(xpath = "//*[@id='iBOM']")
	private static WebElement newreplenishmentBOM;

	@FindBy(xpath = "//*[@id='iFlushing']")
	private static WebElement newreplenishmentFlushing;

	@FindBy(xpath = "//*[@id='btnMasterSaveClick']")
	private static WebElement newreplenishmentSaveBtn;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	private static WebElement newreplenishmentCloseBtn;

	// Grid
	@FindBy(xpath = "//*[@id='irWarehouse1']")
	private static WebElement newreplenishmentGridFirstRowWarehouse;

	@FindBy(xpath = "//*[@id='irStartdate1']")
	private static WebElement newreplenishmentGridFirstRowStartDate;

	@FindBy(xpath = "//*[@id='irEnddate1']")
	private static WebElement newreplenishmentGridFirstRowEndDate;

	@FindBy(xpath = "//*[@id='iReplenishqty1']")
	private static WebElement newreplenishmentGridFirstRowReplenishqty;

	@FindBy(xpath = "//*[@id='iReorderPolicy1']")
	private static WebElement newreplenishmentGridFirstRowReorderPolicy;

	@FindBy(xpath = "//*[@id='fSafetyStock1']")
	private static WebElement newreplenishmentGridFirstRowSafetyStock;

	@FindBy(xpath = "//*[@id='iSafetyLeadTime1']")
	private static WebElement newreplenishmentFirstRowSafetyLeadTime;

	@FindBy(xpath = "//*[@id='fReordercycle1']")
	private static WebElement newreplenishmentFirstRowReordercycle;

	@FindBy(xpath = "//*[@id='fReorderPoint1']")
	private static WebElement newreplenishmentFirstRowReorderPoint;

	@FindBy(xpath = "//*[@id='fReorderQuantity1']")
	private static WebElement newreplenishmentFirstRowReorderQuantity;

	@FindBy(xpath = "//*[@id='fMaxInventoryLevel1']")
	private static WebElement newreplenishmentFirstRowMaxInventoryLevel;

	@FindBy(xpath = "//*[@id='iDefaultVendor1']")
	private static WebElement newreplenishmentFirstRowDefaultVendor;

	@FindBy(xpath = "//*[@id='fMinOrderQuantity1']")
	private static WebElement newreplenishmentFirstRowMinOrderQuantity;

	@FindBy(xpath = "//*[@id='fMaxOrderQuantity1']")
	private static WebElement newreplenishmentFirstRowMaxOrderQuantity1;

	@FindBy(xpath = "//*[@id='fOrderMultiple1']")
	private static WebElement newreplenishmentFirstRowOrderMultiple;

	// OutLet Elements
	@FindBy(xpath = "//*[@id='divBtnGroup7']/div/a")
	private static WebElement ItemNewOutletBtn;

	@FindBy(xpath = "//*[@id='txtsrch-term0']")
	private static WebElement newOutletSearchOutlet;

	@FindBy(xpath = "//*[@id='cmbUserTypeMaster']")
	private static WebElement newOutletAdvanceSearch;

	@FindBy(xpath = "//*[@id='chkResizeGrid0']/span")
	private static WebElement newOutletResizeBtn;

	@FindBy(xpath = "//*[@id='chkRetainSelection']")
	private static WebElement newOutletRetainSelctionCheckBox;

	@FindBy(xpath = "//a[contains(text(),'Tariff')]")
	private static WebElement tariffTab;

	@FindBy(xpath = "//input[@id='iTariffCode1']")
	private static WebElement tariffGridTariffCode;

	@FindBy(xpath = "//input[@id='iAffectedDate1']")
	private static WebElement tariffGridAffecteddate;

	@FindBy(xpath = "//*[@id='btnMasterSaveClick']/i")
	private static WebElement itemCreationScreenSaveBtn;

	@FindBy(xpath = "//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
	private static WebElement itemCreationScreenCloseBtn;

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

	@FindBy(xpath = "//div[@id='idGlobalError']")
	public static WebElement validationConfirmationMessage;

	@FindBy(xpath = "//div[@class='theme_color font-6']")
	public static WebElement validationUpdatingConfirmationMessage;

	@FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[3]/span")
	public static WebElement closeValidationConfirmationMessage;

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
	private static WebElement plusBtn;

	@FindBy(xpath = "//i[@class='icon-collepse']")
	private static WebElement minusBtn;

	@FindBy(xpath = "//span[contains(text(),'Master Fields')]")
	private static WebElement masterFieldsOption;

	@FindBy(xpath = "//*[@id='masterFields_list']/li[1]/span")
	private static WebElement generalTab;

	@FindBy(xpath = "//span[@class='font-5'][contains(text(),'Main')]")
	private static WebElement generalMainTab;

	@FindBy(xpath = "//div[@id='mainTab_0']//tbody//tr[1]//td[4]")
	private static WebElement accountCustomizeName;

	@FindBy(xpath = "//div[@id='mainTab_0']//tr[2]//td[4]")
	private static WebElement accountCustomizeCode;

	@FindBy(xpath = "//div[@id='mainTab_0']//tr[3]//td[4]")
	private static WebElement accountCustomizeAccountType;

	@FindBy(xpath = "//div[@id='mainTab_0']//tr[4]//td[4]")
	private static WebElement accountCustomizeCreditLimit;

	@FindBy(xpath = "//div[@id='mainTab_0']//tr[5]//td[4]")
	private static WebElement accountCustomizeCreditDays;

	@FindBy(xpath = "//*[@id='tabId_4']/ul/li[2]/a")
	private static WebElement generalHeaderDetailsTab;

	@FindBy(xpath = "//div[@id='tabId_1']//tbody[contains(@class,'ui-sortable')]//tr[1]//td[4]")
	private static WebElement accountCustomizeChequeDiscountLimit;

	@FindBy(xpath = "//div[@id='HeaderDetails_0']//tr[2]//td[4]")
	private static WebElement accountCustomizeRateOfInterest;

	@FindBy(xpath = "//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[3]/td[4]")
	private static WebElement accountCustomizeBankAc;

	@FindBy(xpath = "//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[4]/td[4]")
	private static WebElement accountCustomizePDCDiscountedAccount;

	@FindBy(xpath = "//*[@id='btnMove_Field_MasterCust']/div[1]/span")
	private static WebElement accountHeaderMoveFiledBtn;

	@FindBy(xpath = "//div[contains(text(),'Preview')]")
	private static WebElement accountHeaderPreview;

	@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
	private static WebElement accountSaveBtn;

	@FindBy(xpath = "//*[@id='btnAdd_Field_MasterCust']/div[1]/span")
	private static WebElement accountAddBtn;

	@FindBy(xpath = "//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[1]/span")
	private static WebElement accountCloseBtn;

	@FindBy(xpath = "//span[@class='Flabel theme_icon-color'][contains(text(),'Settings')]")
	private static WebElement settingOption;

	@FindBy(xpath = "//div[@id='tabId_68']//span[@class='font-5'][contains(text(),'Header Details')]")
	private static WebElement settingsHeaderDetailsTab;

	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[1]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditFirstRowBtn;

	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[2]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditSecondRowBtn;

	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[3]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditThirdRowBtn;

	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[4]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditFourthRowBtn;

	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[5]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditFifthRowBtn;

	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[6]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditSixthRowBtn;

	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[7]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditSeventhRowBtn;

	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[8]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditEighthRowBtn;

	@FindBy(xpath = "//div[contains(text(),'Move Field')]")
	private static WebElement accountSettingsHeaderMoveFiledBtn;

	@FindBy(xpath = "//div[contains(text(),'Preview')]")
	private static WebElement accountSettingsHeaderPreview;

	@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
	private static WebElement accountSettingsSaveBtn;

	@FindBy(xpath = "//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
	private static WebElement accountSettingsAddBtn;

	@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
	private static WebElement accountSettingsCloseBtn;

	@FindBy(xpath = "//div[@id='tabId_68']//span[@class='font-5'][contains(text(),'Body Details')]")
	private static WebElement settingsBodyDetailsTab;

	@FindBy(xpath = "//div[@id='BodyDetails_1']//div[@class='scrollable tbl-emptyfields-mastercust']")
	private static WebElement settingsBodyDetailsEmptyTab;

	@FindBy(xpath = "//span[@class='Flabel theme_icon-color'][contains(text(),'Details')]")
	private static WebElement accountMasterFieldDetailsOption;

	@FindBy(xpath = "//div[@id='tabId_69']//span[@class='font-5'][contains(text(),'Header Details')]")
	private static WebElement detailsHeaderDetailsTab;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[1]/td[4]")
	private static WebElement detailsHeaderAddress;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[2]/td[4]")
	private static WebElement detailsHeaderCity;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[3]/td[4]")
	private static WebElement detailsHeaderPin;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[4]/td[4]")
	private static WebElement detailsHeaderDeliveryAddress;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[5]/td[4]")
	private static WebElement detailsHeaderCityOne;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[6]/td[4]")
	private static WebElement detailsHeaderPinOne;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[7]/td[4]")
	private static WebElement detailsHeaderSendEmailToCustomer;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[8]/td[4]")
	private static WebElement detailsHeaderAllowCustomerPortal;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[9]/td[4]")
	private static WebElement detailsHeaderEmail;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[10]/td[4]")
	private static WebElement detailsHeaderPassword;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[11]/td[4]")
	private static WebElement detailsHeaderTelNo;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[12]/td[4]")
	private static WebElement detailsHeaderFaxNo;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[13]/td[4]")
	private static WebElement detailsHeaderBankAccountName;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[14]/td[4]")
	private static WebElement detailsHeaderBankAccountNumber;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[15]/td[4]")
	private static WebElement detailsHeaderIFSCCode;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[16]/td[4]")
	private static WebElement detailsHeaderPaymentType;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[17]/td[4]")
	private static WebElement detailsHeaderFinanceEmail;

	@FindBy(xpath = "//*[@id='HeaderDetails_2']/div/div/table/tbody/tr[18]/td[4]")
	private static WebElement detailsHeaderPortalEmail;

	@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
	private static WebElement detailsHeaderBankSaveBtn;

	@FindBy(xpath = "//div[contains(text(),'Move Field')]")
	private static WebElement detailsHeaderMoveFieldBtn;

	@FindBy(xpath = "//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
	private static WebElement detailsHeaderAddBtn;

	@FindBy(xpath = "//div[contains(text(),'Preview')]")
	private static WebElement detailsHeaderPreviewBtn;

	@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
	private static WebElement detailsHeaderCloseBtn;

	@FindBy(xpath = "//div[@id='tabId_69']//span[@class='font-5'][contains(text(),'Body Details')]")
	private static WebElement detailsBodyDetailsTab;

	@FindBy(xpath = "//div[@id='BodyDetails_2']//div[@class='scrollable tbl-emptyfields-mastercust']")
	private static WebElement detailsBodyDetailsEmptyTab;

	@FindBy(xpath = "//*[@id='masterFields_list']/li[4]/span")
	private static WebElement accountMasterFieldPrintLayoutOption;

	@FindBy(xpath = "//div[@id='tabId_70']//span[@class='font-5'][contains(text(),'Header Details')]")
	private static WebElement printlayoutHeaderDetailsTab;

	@FindBy(xpath = "//div[@id='HeaderDetails_3']//div[@class='scrollable tbl-emptyfields-mastercust']")
	private static WebElement printLayoutHeaderDetailsEmpty;

	@FindBy(xpath = "//div[@id='tabId_70']//li[2]//a[1]")
	private static WebElement printLayouBodyDetailsTab;

	@FindBy(xpath = "//*[@id='BodyDetails_3']/div/div/table/tbody/tr[1]/td[4]")
	private static WebElement printlayoutBodyVoucherType;

	@FindBy(xpath = "//*[@id='BodyDetails_3']/div/div/table/tbody/tr[2]/td[4]")
	private static WebElement printLayoutBodyPrintlayout;

	@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
	private static WebElement printLayoutSaveBtn;

	@FindBy(xpath = "//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
	private static WebElement printLayoutAddBtn;

	@FindBy(xpath = "//div[contains(text(),'Preview')]")
	private static WebElement printLayoutPreviewBtn;

	@FindBy(xpath = "//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
	private static WebElement printLayoutCloseBtn;

	@FindBy(xpath = "//span[contains(text(),'Unique Constraints')]")
	private static WebElement accountMasterFieldsUniqueConstraintsOption;

	@FindBy(xpath = "//div[@id='tabContent_UConstraints_MasterCust']//div[@id='btnAddOrEdit_UniqueConstraints']")
	private static WebElement UniqueConstraintsAddBtn;

	@FindBy(xpath = "//div[@id='tabContent_UConstraints_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
	private static WebElement UniqueConstraintsDeleteBtn;

	@FindBy(xpath = "//div[@id='tabContent_UConstraints_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
	private static WebElement UniqueConstraintsCloseBtn;

	@FindBy(xpath = "//input[@id='txtConstraintName']")
	private static WebElement ConstraintNameTxt;

	@FindBy(xpath = "//select[@id='ddlConstraintTabList']")
	private static WebElement UniqueConstraints_TabsDropdown;

	@FindBy(xpath = "//*[@id='tab_Main_UcFields']/i")
	private static WebElement UniqueConstraints_MainExpansionBtn;

	@FindBy(xpath = "//*[@id='chkList_MainFields_1']/div[1]")
	private static WebElement accountUniqueConstraints_Main_NameChekbox;

	@FindBy(xpath = "//div[@id='chkList_MainFields_1']//div[2]")
	private static WebElement accountUniqueConstraints_Main_CodeChekbox;

	@FindBy(xpath = "//div[@id='chkList_MainFields_1']//div[3]")
	private static WebElement accountUniqueConstraints_Main_AccountTypeCheckbox;

	@FindBy(xpath = "//div[@id='chkList_MainFields_1']//div[4]")
	private static WebElement accountUniqueConstraints_Main_CreditLimitCheckBox;

	@FindBy(xpath = "//div[@id='chkList_MainFields_1']//div[5]")
	private static WebElement accountUniqueConstraints_Main_CreditDays;

	@FindBy(xpath = "//div[@id='tab_Header_UcFields']//i[@class='pull-right icon-expand theme_icon-color']")
	private static WebElement UniqueConstraints_HeaderExpansionBtn;

	@FindBy(xpath = "//*[@id='chkList_HeaderFields_1']/div[1]")
	private static WebElement UniqueConstraints_Header_ChequeDiscountLimitChekbox;

	@FindBy(xpath = "//*[@id='chkList_HeaderFields_1']/div[2]")
	private static WebElement UniqueConstraints_Header_RateOfInterestChekbox;

	@FindBy(xpath = "//*[@id='chkList_HeaderFields_1']/div[3]")
	private static WebElement UniqueConstraints_Header_BankAcChekbox;

	@FindBy(xpath = "//*[@id='chkList_HeaderFields_1']/div[4]")
	private static WebElement UniqueConstraints_Header_PDCDiscountedChekbox;

	@FindBy(xpath = "//*[@id='tab_Body_UcFields']/i")
	private static WebElement UniqueConstraints_BodyExpansionBtn;

	@FindBy(xpath = "//span[contains(text(),'Rules')]")
	private static WebElement RulesOption;

	@FindBy(xpath = "//*[@id='newRuleTab_div_MasterRules']/div[1]/div/div[1]/div[1]")
	private static WebElement accountRules_SaveBtn;

	@FindBy(xpath = "//div[contains(text(),'New')]")
	private static WebElement accountRules_NewBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]")
	private static WebElement accountRules_DeleteBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]")
	private static WebElement accountRules_CloseBtn;

	@FindBy(xpath = "//*[@id='txtMasterRuleName_MasterRules']")
	private static WebElement Rules_RuleNameText;

	@FindBy(xpath = "//*[@id='chkCreatingGroup_Rule_MasterRules']")
	private static WebElement Rules_CreatingGroupChekbox;

	@FindBy(xpath = "//*[@id='chkNewRecord_Rule_MasterRules']")
	private static WebElement Rules_NewRecordChekbox;

	@FindBy(xpath = "//*[@id='chkEdit_Rule_MasterRules']")
	private static WebElement Rules_EditChekbox;

	@FindBy(xpath = "//*[@id='chkLoad_Rule_MasterRules']")
	private static WebElement Rules_LoadChekbox;

	@FindBy(xpath = "//*[@id='chkBeforeSave_Rule_MasterRules']")
	private static WebElement Rules_BeforeSaveChekbox;

	@FindBy(xpath = "//*[@id='chkOnLeave_Rule_MasterRules']")
	private static WebElement Rules_OnLeaveChekbox;

	@FindBy(xpath = "//*[@id='chkBeforeDelete_Rule_MasterRules']")
	private static WebElement Rules_BeforeDeleteChekbox;

	@FindBy(xpath = "//*[@id='chkOnEnter_Rule_MasterRules']")
	private static WebElement Rules_OnEnterChekbox;

	@FindBy(xpath = "//label[contains(text(),'Active')]")
	private static WebElement Rules_ActiveChekbox;

	@FindBy(xpath = "//*[@id='Conditions-Context_Menu']/li[3]")
	private static WebElement Rules_NoConditionChekbox;

	@FindBy(xpath = "//*[@id='allMasterCustTabs']/li[4]/span")
	private static WebElement rules_ExternalModules;

	@FindBy(xpath = "//select[@id='ddlOnEvent_MasterExternalModule']")
	private static WebElement rules_ExternalModulesOnEventDropdown;

	@FindBy(xpath = "//input[@id='txtbuttonCaption_MasterExternalModule']")
	private static WebElement rules_ExternalModulesButtonCaption;

	@FindBy(xpath = "//select[@id='ddlModuleType_MasterExternalModule']")
	private static WebElement rules_ExternalModules_ModuleTypeBtn;

	@FindBy(xpath = "//select[@id='ddlAllDllFiles_MasterExternalModule']")
	private static WebElement rules_ExternalModules_ModuleNameDropdown;

	@FindBy(xpath = "//select[@id='ddlClassNames_MasterExternalModule']")
	private static WebElement rules_ExternalModulesClassNameDropdown;

	@FindBy(xpath = "//select[@id='ddlClassMethods_MasterExternalModule']")
	private static WebElement rules_ExternalModulesFuctionalNameDropdown;

	@FindBy(xpath = "//div[contains(text(),'Update')]")
	private static WebElement rules_ExternalModulesUpdateBtn;

	@FindBy(xpath = "//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
	private static WebElement rules_ExternalModulesSaveBtn;

	@FindBy(xpath = "//div[contains(text(),'Edit')]")
	private static WebElement rules_ExternalModulesEditBtn;

	@FindBy(xpath = "//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
	private static WebElement rules_ExternalModulesDeleteBtn;

	@FindBy(xpath = "//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
	private static WebElement rules_ExternalModulesCloseBtn;

	@FindBy(xpath = "//span[contains(text(),'Info Panel Customization')]")
	private static WebElement itemInfoPanelCustomizationTab;

	@FindBy(xpath = "//body[@class='custom_scrollbar']/section[@id='mainDiv']/div[@id='id_focus8_wrapper_default']/div[@class='content-wrapper']/section[@id='page_Content']/div[@class='container']/div[@id='mainLandingDiv']/div[@id='masterFirstDiv']/div[@class='tab-content']/div[@id='divLanding']/div[@id='divSecondsub']/div/div[@class='col-xs-12 col-sm-8 col-md-9 col-lg-9 padding-left-right5 mainDivCustomWidth']/div[@id='tabContent_IPCust_MasterCust']/div[@class='col-xs-12 col-sm-12 padding0']/div[@class='pull-right']/div[1]")
	private static WebElement iteminfoPanelCust_AddBtn;

	@FindBy(xpath = "//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
	private static WebElement infoPanelCust_DeleteBtn;

	@FindBy(xpath = "//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
	private static WebElement infoPanelCust_CloseBtn;

	@FindBy(xpath = "//strong[contains(text(),'Credit History')]")
	private static WebElement infoPanelCustCreditHistory;

	@FindBy(xpath = "//div[@id='divPanel_2']//strong[contains(text(),'Ageing Analysis')]")
	private static WebElement infoPanelCustAgeingAnalysis;

	@FindBy(xpath = "//strong[contains(text(),'Ageing Analysis Base')]")
	private static WebElement infoPanelCustAgeingAnalysisBase;

	@FindBy(xpath = "//strong[contains(text(),'Ageing Analysis Local')]")
	private static WebElement infoPanelCustAgeingAnalysisLocal;

	@FindBy(xpath = "//strong[contains(text(),'Authorization')]")
	private static WebElement infoPanelAuthorization;

	@FindBy(xpath = "//span[@class='Flabel'][contains(text(),'Reports')]")
	private static WebElement accountReportsTab;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
	private static WebElement accountReports_SaveBtn;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
	private static WebElement accountReports_CloseBtn;

	@FindBy(xpath = "//*[@id='AllReportsDiv_MasterCust']/div[1]/label/input")
	private static WebElement reports_AdvancedbudgetReportChkBox;

	@FindBy(xpath = "//div[@id='AllReportsDiv_MasterCust']//div[1]//label[1]")
	private static WebElement reports_MasterInfoChkBox;

	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-8 col-md-8 col-lg-9 padding0']//div[2]//label[1]")
	private static WebElement reports_ABCAnalysisAmountChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[3]//label[1]")
	private static WebElement reports_BankBookChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[4]//label[1]")
	private static WebElement reports_BankreconciliationstatementChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[5]//label[1]")
	private static WebElement reports_CashBookChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[6]//label[1]")
	private static WebElement reports_ComparativeAnalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[7]//label[1]")
	private static WebElement reports_CustomerAgeingDetailsAnalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[8]//label[1]")
	private static WebElement reports_CustomerageingdetailbyduedateChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[9]//label[1]")
	private static WebElement reports_CustomerageingsummaryanalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[10]//label[1]")
	private static WebElement reports_CustomerbillwisesummaryChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[11]//label[1]")
	private static WebElement reports_CustomerduedateanalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[12]//label[1]")
	private static WebElement reports_CustomerlistingofoutstandingbillsChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[13]//label[1]")
	private static WebElement reports_CustomeroverdueanalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[14]//label[1]")
	private static WebElement reports_CustomeroverduesummaryChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[15]//label[1]")
	private static WebElement reports_CustomerstatementsChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[16]//label[1]")
	private static WebElement reports_CustomersummaryageingbyduedateChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[17]//label[1]")
	private static WebElement reports_IncomeExpenseTrendChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[18]//label[1]")
	private static WebElement reports_InterestcalculationChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[19]//label[1]")
	private static WebElement reports_LedgerChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[20]//label[1]")
	private static WebElement reports_LedgerdetailChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[21]//label[1]")
	private static WebElement reports_MonthlySalesChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[22]//label[1]")
	private static WebElement reports_PeakandlowbalanceamountChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[23]//label[1]")
	private static WebElement reports_PettycashbookChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[24]//label[1]")
	private static WebElement reports_PurchaseregisterChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[25]//label[1]")
	private static WebElement reports_PurchasereturnregisterChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[26]//label[1]")
	private static WebElement reports_PurchasesgroupedbydepartmentChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[27]//label[1]")
	private static WebElement reports_PurchasesgroupedbyItemChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[28]//label[1]")
	private static WebElement reports_PurchasesgroupedbyvendorChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[29]//label[1]")
	private static WebElement reports_SalesdaybookChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[30]//label[1]")
	private static WebElement reports_SalesgroupedbycustomerChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[31]//label[1]")
	private static WebElement reports_salesgroupedbydepartmentrChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[32]//label[1]")
	private static WebElement reports_SalesgroupedbyItemChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[33]//label[1]")
	private static WebElement reports_SalesreturnregisterChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[34]//label[1]")
	private static WebElement reports_SchedulesChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[35]//label[1]")
	private static WebElement reports_SubledgerChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[36]//label[1]")
	private static WebElement reports_SummarypurchaseregisterChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[37]//label[1]")
	private static WebElement reports_SummarysalesregisterChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[38]//label[1]")
	private static WebElement reports_TopCustomersChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[39]//label[1]")
	private static WebElement reports_TradingaccountrChkBox;

	@FindBy(xpath = "//div[40]//label[1]")
	private static WebElement reports_TransactionstypeanalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[41]//label[1]")
	private static WebElement reports_VendorageingdetailanalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[42]//label[1]")
	private static WebElement reports_VendorageingdetailbyduedateChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[43]//label[1]")
	private static WebElement reports_VendorageingsummaryanalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[44]//label[1]")
	private static WebElement reports_VendorbillwisesummaryChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[45]//label[1]")
	private static WebElement reports_VendorduedateanalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[46]//label[1]")
	private static WebElement reports_VendorlistingofoutstandingbillsChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[47]//label[1]")
	private static WebElement reports_VendoroverdueanalysisChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[48]//label[1]")
	private static WebElement reports_VendoroverduesummaryChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[49]//label[1]")
	private static WebElement reports_VendorstatementsChkBox;

	@FindBy(xpath = "//div[@id='tabContent_Reports_MasterCust']//div[50]//label[1]")
	private static WebElement reports_VendorsummaryageingbyduedateChkBox;

	// Create Tabs
	@FindBy(xpath = "//button[@id='btnCreateTab_MCust']")
	private static WebElement createTab;

	@FindBy(xpath = "//a[contains(text(),'Tree Tab')]")
	private static WebElement createTabTreeTab;

	@FindBy(xpath = "//input[@id='txtNewTreeTabCaption']")
	private static WebElement treeTabCaptionTxt;

	@FindBy(xpath = "//input[@id='txtNewTreeTabName']")
	private static WebElement treeTabTabNameTxt;

	@FindBy(xpath = "//input[@id='fOption_tab_masterName']")
	private static WebElement treeTabNewMastertxt;

	@FindBy(xpath = "//*[@id='fOption_tab_masterName_input_image']/span")
	private static WebElement treeTabNewMasterdropdown;

	@FindBy(xpath = "//*[@id='fOption_tab_masterName_input_settings']/span")
	private static WebElement treeTab_NewMasterSettingsBtn;

	@FindBy(xpath = "//input[@id='txtNewTreeTabFieldCaption']")
	private static WebElement treeTab_FieldCaptiontxt;

	@FindBy(xpath = "//input[@id='txtNewTreeTabFieldName']")
	private static WebElement treeTab_FieldNameTxt;

	@FindBy(xpath = "//input[@id='bIsTreeHiddenTab']")
	private static WebElement treeTab_HiddenChkBox;

	@FindBy(xpath = "//div[@id='fOption_tab_masterName_customize_popup_container']")
	private static WebElement treeTab_NewMaster_ContainerTxt;

	@FindBy(xpath = "//div[@id='fOption_tab_masterName_customize_popup_footer']//input[1]")
	private static WebElement treeTab_NewMaster_StanadrdfieldsBtn;

	@FindBy(xpath = "//select[@id='fOption_tab_masterName_customize_popup_standardfields_list']")
	private static WebElement treeTab_NewMaster_Stanadrdfields_Fielddropdown;

	@FindBy(xpath = "//input[@id='fOption_tab_masterName_customize_popup_standardfields_header']")
	private static WebElement treeTab_NewMaster_Stanadrdfields_headerTxt;

	@FindBy(xpath = "//select[@id='fOption_tab_masterName_customize_popup_standardfields_alignment']")
	private static WebElement treeTab_NewMaster_Stanadrdfields_Allignmentdropdown;

	@FindBy(xpath = "//input[@id='fOption_tab_masterName_customize_popup_standardfields_width']")
	private static WebElement treeTab_NewMaster_Stanadrdfields_WidthTxt;

	@FindBy(xpath = "//div[@id='divSecondsub']//input[3]")
	private static WebElement treeTab_NewMaster_Stanadrdfields_OkBtn;

	@FindBy(xpath = "//div[@id='divSecondsub']//input[4]")
	private static WebElement treeTab_NewMaster_Stanadrdfields_CancelBtn;

	@FindBy(xpath = "//div[@id='fOption_tab_masterName_search_container']//input[2]")
	private static WebElement treeTab_NewMaster_deleteColumnBtn;

	@FindBy(xpath = "//div[@id='divSecondsub']//input[3]")
	private static WebElement treeTab_NewMaster_OkBtn;

	@FindBy(xpath = "//div[@id='divSecondsub']//input[4]")
	private static WebElement treeTab_NewMaster_CancelBtn;

	@FindBy(xpath = "//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[1]")
	private static WebElement treeTab_OkBtn;

	@FindBy(xpath = "//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
	private static WebElement treeTab_UpdateOkBtn;

	@FindBy(xpath = "//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[2]")
	private static WebElement treeTab_CancelBtn;

	@FindBy(xpath = "//a[contains(text(),'Document Tab')]")
	private static WebElement createTab_DocumentTab;

	@FindBy(xpath = "//input[@id='txtNewDocTabCaption']")
	private static WebElement documentTab_TabCaption;

	@FindBy(xpath = "//input[@id='txtNewDocTabName']")
	private static WebElement documentTab_TabName;

	@FindBy(xpath = "//input[@id='bIsDocHiddenTab']")
	private static WebElement documentTab_HiddenChkbox;

	@FindBy(xpath = "//div[@id='MCustomize_CreateDocTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
	private static WebElement documentTab_OkBtn;

	@FindBy(xpath = "//div[@id='MCustomize_CreateDocTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Cancel')]")
	private static WebElement documentTab_CancelBtn;

	@FindBy(xpath = "//label[@id='lblNameError_DocTab']")
	private static WebElement customizeMasterCreateTabDocumentTabMessage;

	@FindBy(xpath = "//span[contains(text(),'Document Tab')]")
	private static WebElement customizeMasterCreateDocumentTabNewlyCreate;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]/span[1]")
	private static WebElement customizeMasterCreateDocumentTabNewlyHeaderDetails;

	@FindBy(xpath = "//div[@id='HeaderDetails_5']//div[@class='scrollable tbl-emptyfields-mastercust']")
	private static WebElement customizeMasterCreateDocumentTabNewlyBlankInHeaderDetails;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]/span[1]")
	private static WebElement customizeMasterCreateDocumentTabNewlyBodyDetails;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
	private static WebElement customizeMasterCreateDocumentTabFieldName;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")
	private static WebElement customizeMasterCreateDocumentTabDocument;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")
	private static WebElement customizeMasterCreateDocumentTabCreatedDate;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]")
	private static WebElement customizeMasterCreateDocumentTabLastModified;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[4]")
	private static WebElement customizeMasterCreateDocumentFileSize;

	@FindBy(xpath = "//a[contains(text(),'Create Tab')]")
	private static WebElement createTab_CreateTab;

	@FindBy(xpath = "//div[@id='MCustomize_CreateDocTab_Modal']//h4[@class='modal-title'][contains(text(),'Tab Details')]")
	private static WebElement createTab_TabDetailsLabel;

	@FindBy(xpath = "//input[@id='txtNewTabCaption']")
	private static WebElement createTab_TabCaptionTxt;

	@FindBy(xpath = "//input[@id='txtNewTabName']")
	private static WebElement createTab_TabNameTxt;

	@FindBy(xpath = "//input[@id='bIsHiddenTab']")
	private static WebElement createTab_PopHiddenChkbox;

	@FindBy(xpath = "//*[@id='MCustomize_CreateTab_Modal']/div/div/div[3]/button[1]")
	private static WebElement createTab_PopOkBtn;

	@FindBy(xpath = "//*[@id='MCustomize_CreateTab_Modal']/div/div/div[3]/button[2]")
	private static WebElement createTab_PopCancelBtn;

	@FindBy(xpath = "//label[@id='lblNameError_NewTab']")
	private static WebElement customizeMasterCreateTabCreateTabMessage;

	// Newly Created Create Tab
	@FindBy(xpath = "//span[contains(text(),'Create Tab')]")
	private static WebElement customizeMasterCreateCreateTabNewlyCreateTabCaption;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/ul[1]/li[1]/a[1]/span[1]")
	private static WebElement customizeMasterCreateCreateTabHeaderDetails;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]")
	private static WebElement customizeMasterCreateCreateTabBlankHeaderDetails;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/ul[1]/li[2]/a[1]/span[1]")
	private static WebElement customizeMasterCreateCreateTabBodyDetails;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]")
	private static WebElement customizeMasterCreateCreateTabBlankBodyDetails;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[2]")
	private static WebElement customizeMasterCreateCreateTabNewlyCreateTabSaveButton;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[3]/div[2]")
	private static WebElement customizeMasterCreateCreateTabAddButton;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[4]/div[2]")
	private static WebElement customizeMasterCreateCreateTabPreviewButton;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[5]/div[2]")
	private static WebElement customizeMasterCreateCreateTabCloseButton;

	@FindBy(xpath = "//button[@id='btnDeleteTab_MCust']")
	private static WebElement tabs_DeleteBtn;

	@FindBy(xpath = "//label[@id='lblNameError_TreeTab']")
	private static WebElement customizeMasterCreateTabsMessage;

	@FindBy(xpath = "//label[@id='lblMasterNameError_TreeTab']")
	private static WebElement customizeMasterCreateTabsMasterNameMessage;

	@FindBy(xpath = "//span[contains(text(),'Tree Tab')]")
	private static WebElement customizeMasterCreateTreeTabNewlyCreate;

	@FindBy(xpath = "//input[@id='txtEditTabCaption']")
	private static WebElement customizeMasterCreateTreeTabNewlyCreateTabCaption;

	@FindBy(xpath = "//div[@id='MCustomize_EditTab_Modal']//label[@class='col-sm-12 col-xs-12 col-md-5 col-lg-5 form-control-static Flabel'][contains(text(),'Hidden')]")
	private static WebElement customizeMasterCreateTreeTabNewlyCreateHidden;

	@FindBy(xpath = "//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
	private static WebElement customizeMasterCreateTreeTabNewlyCreateOkButton;

	@FindBy(xpath = "//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Cancel')]")
	private static WebElement customizeMasterCreateTreeTabNewlyCreateCancelButton;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[1]/a[1]/span[1]")
	private static WebElement customizeMasterCreateTreeTabNewlyHeaderDetails;

	@FindBy(xpath = "//div[@id='HeaderDetails_4']//div[@class='scrollable tbl-emptyfields-mastercust']")
	private static WebElement customizeMasterCreateTreeTabNewlyBlankInHeaderDetails;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[2]/a[1]/span[1]")
	private static WebElement customizeMasterCreateTreeTabNewlyBodyDetails;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
	private static WebElement customizeMasterCreateTreeTabNewlyFieldInBodyDetails;

	@FindBy(xpath = "//span[contains(text(),'Tree Tab Delete')]")
	private static WebElement CustomizeCreateTreeTab;

	@FindBy(xpath = "//*[@id='lblWarnMessage_TabModal']")
	private static WebElement CustomizeDeleteTabMessage;

	@FindBy(xpath = "//div[@id='MCustomize_DeleteTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Yes')]")
	private static WebElement CustomizeDeleteTabMessageYesBtn;

	@FindBy(xpath = "//div[@id='MCustomize_DeleteTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'No')]")
	private static WebElement CustomizeDeleteTabMessageNoBtn;

	// Master Customization Extra Fields Creation On Click Add button
	@FindBy(xpath = "//input[@id='ExtraField_FieldCaption']")
	private static WebElement extraFields_FieldDetailsTab;

	@FindBy(xpath = "//span[contains(text(),'Field Details')]")
	private static WebElement extraFields_ClickOnFieldDetailsTab;

	@FindBy(xpath = "//*[@id='ExtraField_FieldCaption']")
	private static WebElement extraFields_FieldDetailsCaption;

	@FindBy(xpath = "//div[@id='tab_FieldDetails_ExtraField']//div[1]//div[2]//div[1]//input[1]")
	private static WebElement extraFields_FieldDetailsName;

	@FindBy(xpath = "//*[@id='ddlDatatype_ExtraField']")
	private static WebElement extraFields_FieldDetailsDatTypeDropdown;

	@FindBy(xpath = "//*[@id='ExtraField_DefaultValue']")
	private static WebElement extraFields_FieldDetailsDefaultValue;

	@FindBy(xpath = "//*[@id='ExtraField_BannerText']")
	private static WebElement extraFields_FieldDetailsBannerText;

	@FindBy(xpath = "//*[@id='ExtraField_MaxSize']")
	private static WebElement extraFields_FieldDetails_MaxSize;

	@FindBy(xpath = "//*[@id='ExtraField_ControlType']")
	private static WebElement extraFields_FieldDetailsControlTypeDropdown;

	@FindBy(xpath = "//*[@id='ExtraField_ToolTipText']")
	private static WebElement extraFields_FieldDetailsToolTipText;

	@FindBy(xpath = "//*[@id='ExtraField_RegularExpression']")
	private static WebElement extraFields_FieldDetailsRegularExpressionText;

	@FindBy(xpath = " //*[@id='btnLoad_RExp']")
	private static WebElement extraFields_RegularExperssionLoadExpansionBtn;

	@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
	private static WebElement extraFields_PropertiesTab;

	@FindBy(xpath = "//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
	private static WebElement extraFields_PropertiesTabPartOfDeliveryAddressChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_PartOfBillingAddress']")
	private static WebElement extraFields_PropertiesPartOfBillingAddressChekbox;

	@FindBy(xpath = "//input[@id='FieldsDetails_IsMandatory']")
	private static WebElement extraFields_PropertiesMandatoryChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_AllowAsParameter']")
	private static WebElement extraFields_PropertiesAllowAsParameterChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_IsHidden']")
	private static WebElement extraFields_PropertiesHiddenChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_HiddenInGroup']")
	private static WebElement extraFields_PropertiesHiddenInGroupChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_SpellCheck']")
	private static WebElement extraFields_PropertiesSpellCheckChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_MandatoryInGroup']")
	private static WebElement extraFields_PropertiesMandatoryInGroupChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_AuditTrial']")
	private static WebElement extraFields_PropertiesAuditTrialChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_NotAvailableForReports']")
	private static WebElement extraFields_PropertiesNotAvailableForReportsChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_MergeField']")
	private static WebElement extraFields_PropertiesMergeFieldChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_MassUpdate']")
	private static WebElement extraFields_PropertiesMassUpdateChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_IncludeInQuickCreate']")
	private static WebElement extraFields_PropertiesIncludeInQuickCreateChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_CannotBeExported']")
	private static WebElement extraFields_PropertiesCannotBeExportedChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_CannotBeImported']")
	private static WebElement extraFields_PropertiesCannotBeImportedChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_CopyFromParent']")
	private static WebElement extraFields_PropertiesCopyFromParentChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_ReadOnly']")
	private static WebElement extraFields_PropertiesReadOnlyChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_InformationField']")
	private static WebElement extraFields_PropertiesInformationFieldChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_IsMandatoryInRevision']")
	private static WebElement extraFields_PropertiesIsMandatoryInRevisionChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_AvailableinCustomerPortal']")
	private static WebElement extraFields_PropertiesAvailableinCustomerPortalChekbox;

	@FindBy(xpath = "//*[@id='FieldsDetails_EditableinCustomerPortal']")
	private static WebElement extraFields_PropertiesEditableinCustomerPortalChekbox;

	@FindBy(xpath = "//*[@id='Behaviour']")
	private static WebElement extraFields_PropertiesBehaviourDropdown;

	@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
	private static WebElement extraFields_FormattingTab;

	@FindBy(xpath = "//*[@id='FieldsDetails_ColumnSpan']")
	private static WebElement extraFields_FormattingColumnSpan;

	@FindBy(xpath = "//*[@id='FieldsDetails_RowSpan']")
	private static WebElement extraFields_FormattingRowSpan;

	@FindBy(xpath = "//*[@id='CharacterCasing']")
	private static WebElement extraFields_FormattingCharacterCasingDropdown;

	@FindBy(xpath = "//*[@id='TextAlign']")
	private static WebElement extraFields_FormattingTextAlignDropdown;

	@FindBy(xpath = "//*[@id='FieldsDetails_Font']")
	private static WebElement extraFields_FormattingFieldsDetailsFont;

	@FindBy(xpath = "//*[@id='FieldsDetails_BackColor']")
	private static WebElement extraFields_FormattingBackColor;

	@FindBy(xpath = "//*[@id='FieldsDetails_Font_Button']")
	private static WebElement extraFields_FormattingFieldsDetailsFont_Btn;

	// Elements are used for font edit option pop in field details and rules
	@FindBy(xpath = "//*[@id='fontFamily_ExtraField_FontCtrl']")
	private static WebElement FontAreialDropdown;

	@FindBy(xpath = "//*[@id='fontStyle_ExtraField_FontCtrl']")
	private static WebElement fontStyleDropdown;

	@FindBy(xpath = "//*[@id='fontWeight_ExtraField_FontCtrl']")
	private static WebElement fontWeightDropdown;

	@FindBy(xpath = "//*[@id='fontSizes_ExtraField_FontCtrl']")
	private static WebElement fontSizeDropdown;

	@FindBy(xpath = "//*[@id='fontForeColor_ExtraField_FontCtrl']")
	private static WebElement foreColourDropdown;

	@FindBy(xpath = "//*[@id='fontBackColor_ExtraField_FontCtrl']")
	private static WebElement backColorDropdown;

	@FindBy(xpath = "//*[@id='chkBaseline_ExtraField_FontCtrl']")
	private static WebElement baselineChekbox;

	@FindBy(xpath = "//*[@id='chkOverLine_ExtraField_FontCtrl']")
	private static WebElement overLineChekbox;

	@FindBy(xpath = "//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
	private static WebElement strikeThroughChekbox;

	@FindBy(xpath = "//*[@id='chkUnderline_ExtraField_FontCtrl']")
	private static WebElement underlineChekbox;

	@FindBy(xpath = "//*[@id='chkEnableFont_ExtraField_FontCtrl']")
	private static WebElement enableFontChekbox;

	@FindBy(xpath = "//*[@id='previewfont_ExtraField_FontCtrl']")
	private static WebElement frontPriveiw;

	@FindBy(xpath = "//*[@id='myFontControl_IF_Save']/i")
	private static WebElement frontSaveBtn;

	@FindBy(xpath = "//*[@id='myFontControl_IF_Close']")
	private static WebElement frontCloseBtn;

	@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
	private static WebElement extraFields_RulesTab;

	@FindBy(xpath = "//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
	private static WebElement extraFields_RulesSaveBtn;

	@FindBy(xpath = "//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
	private static WebElement extraFields_RulesNewBtn;

	@FindBy(xpath = "//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
	private static WebElement extraFields_RulesDeleteBtn;

	@FindBy(xpath = "//div[@id='newRuleTab_div_FieldRules']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
	private static WebElement extraFields_RulesCloseBtn;

	@FindBy(xpath = "//*[@id='lnkRule_div_FieldRules']/input")
	private static WebElement extraFields_RulesClickHereAddRuleButtonBtn;

	@FindBy(xpath = "//*[@id='txtMasterRuleName_FieldRules']")
	private static WebElement extraFields_RuleNameDropdown;

	@FindBy(xpath = "//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
	private static WebElement extraFields_RuleNameSetingBtn;

	@FindBy(xpath = "//*[@id='extraFieldContainer_div']/ul/li[5]/a/span")
	private static WebElement extraFields_ExternalModulesTab;

	@FindBy(xpath = "//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
	private static WebElement extraFields_ExternalModulesOnEventDropdown;

	@FindBy(xpath = "//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
	private static WebElement extraFields_ExternalModulesButtonCaption;

	@FindBy(xpath = "//*[@id='ddlModuleType_mExtraFieldExternalModule']")
	private static WebElement extraFields_ExternalModules_ModuleTypeBtn;

	@FindBy(xpath = "//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
	private static WebElement extraFields_ExternalModules_ModuleNameDropdown;

	@FindBy(xpath = "//*[@id='ddlClassNames_mExtraFieldExternalModule']")
	private static WebElement extraFields_ExternalModulesClassNameDropdown;

	@FindBy(xpath = "//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
	private static WebElement extraFields_ExternalModulesFuctionalNameDropdown;

	@FindBy(xpath = "//*[@id='ddlAvailability_mExtraFieldExternalModule']")
	private static WebElement extraFields_ExternalModulesAvabileInDropdown;

	@FindBy(xpath = "//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
	private static WebElement extraFields_ExternalModulesForMatFieldDeatailsOkBtn;

	@FindBy(xpath = "//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
	private static WebElement extraFields_externalModulesForMatFieldDeatailsCanceBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
	private static WebElement extraFields_OkBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]")
	private static WebElement extraFields_CloseBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
	private static WebElement extraFields_CreatedByUserInHeaderDetailsTab;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[1]")
	private static WebElement extraFields_EditOptionInHeaderDetailsTab;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[2]")
	private static WebElement extraFields_DeleteOptionInHeaderDetailsTab;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")
	private static WebElement extraFields_SecondFieldInHeaderDetailsTab;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[2]/div[2]")
	private static WebElement extraFields_MoveFieldOption;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
	private static WebElement extraFields_MoveFieldTabName;

	@FindBy(xpath = "//div[@id='tableType_div']//div[1]//label[1]")
	private static WebElement extraFields_MoveFieldHeader;

	@FindBy(xpath = "//div[@id='rdbBodyDiv_MoveField_Modal']//label[1]")
	private static WebElement extraFields_MoveFieldBody;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[3]/button[1]")
	private static WebElement extraFields_MoveFieldOkButton;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[3]/button[2]")
	private static WebElement extraFields_MoveFieldCancelButton;

	// Settings Tab Move Field
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/i[1]")
	private static WebElement extraFields_SettingsTab_MoveField;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
	private static WebElement extraFields_SettingsTab_First;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[2]")
	private static WebElement extraFields_SettingsTab_FirstDelete;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/i[2]")
	private static WebElement extraFields_SettingsTab_MoveFieldOptsDelete;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")
	private static WebElement extraFields_SettingsTab_DeleteMessage;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/button[2]")
	private static WebElement extraFields_SettingsTab_DeleteMessageNoOption;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/button[1]")
	private static WebElement extraFields_SettingsTab_DeleteMessageYesOption;

	@FindBy(xpath = "//a[@class='icon-font7 theme_color-inverse']")
	private static WebElement extraFields_GeneralTab;

	@FindBy(xpath = "//a[contains(text(),'Settings')]")
	private static WebElement extraFields_SettingsTab;

	@FindBy(xpath = "//a[contains(text(),'Details')]")
	private static WebElement extraFields_DetailsTab;

	@FindBy(xpath = "//a[contains(text(),'Print Layout')]")
	private static WebElement extraFields_PrintLayout;

	@FindBy(xpath = "//li[5]/div/div/a")
	private static WebElement extraFields_TreeTabUpdate;

	@FindBy(xpath = "//a[@class='icon-font7 theme_color'][contains(text(),'Document Tab')]")
	private static WebElement extraFields_DocumentTab;

	@FindBy(xpath = "//a[@class='icon-font7 theme_color'][contains(text(),'Create Tab')]")
	private static WebElement extraFields_CreateTab;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[4]/div[2]")
	private static WebElement extraFields_PreviewTab;

	@FindBy(xpath = "//input[@id='sFileName1']")
	private static WebElement extraFields_PreviewTab_DocumentTab_FileName;

	@FindBy(xpath = "//input[@id='biDocument1']")
	private static WebElement extraFields_PreviewTab_DocumentTab_Document;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[1]")
	private static WebElement extraFields_PreviewTab_DocumentTab_UploadDocument;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[2]")
	private static WebElement extraFields_PreviewTab_DocumentTab_SaveDocument;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[3]")
	private static WebElement extraFields_PreviewTab_DocumentTab_DeleteDocument;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
	private static WebElement extraFields_PreviewTab_DocumentTab_CreateDate;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/input[1]")
	private static WebElement extraFields_PreviewTab_DocumentTab_FileSize;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	private static WebElement extraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[2]/button[2]/i[1]")
	private static WebElement extraFields_PreviewTab_SaveBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[2]/button[5]")
	private static WebElement extraFields_PreviewTab_CloseBtn;

	@FindBy(xpath = "/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[8]/div[1]/label/input")
	private static WebElement selectVendorB;

	@FindBy(xpath = "//input[@id='iPDCDiscountedAC']")
	private static WebElement pdcDicountAccount;

	@FindBy(xpath = "//input[@id='uploadBtnbiDocument1']")
	private static WebElement addGroupDocumentTab_UploadDocument;

	@FindBy(xpath = "//tr[1]//td[5]//div[1]//div[1]//div[2]")
	private static WebElement addGroupDocumentTab_SaveDocument;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[3]/i[1]")
	private static WebElement addGroupDocumentTab_DeleteDocument;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	private static WebElement addGroupCreateCreateTab_ExtraFieldUpdate;

	@FindBy(xpath = "//td[contains(@class,'tdName padding0')][contains(text(),'Vendor Group')]")
	public static WebElement accountGroupCreation;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
	private static WebElement accSelect;

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

	// Dash board Page
	@FindBy(xpath = "//*[@id='dashName']")
	private static WebElement labelDashboard;

	@FindBy(xpath = "//*[@id='Select_dash']")
	private static WebElement selectDashboard;

	@FindBy(xpath = "//*[@id='Dashboard_AddDash']")
	private static WebElement newAddDashBoard;

	@FindBy(xpath = "//*[@id='Dashboard_Dash_Config']")
	private static WebElement dashboardCustomizationSettings;

	// Properties Page
	@FindBy(xpath = "//span[contains(text(),'Account Properties')]")
	public static WebElement accountPropertiesLabel;

	@FindBy(xpath = "//input[@id='rbnNormal']")
	public static WebElement normalRadioBtn;

	@FindBy(xpath = "//input[@id='rbnDisplayDebitCreditTotalForEachAccountUnderGroup']")
	private static WebElement displayDebitCreditTotalForEachAccountUnderGroup;

	@FindBy(xpath = "//input[@id='rbnClubTranOfAllAcctsUnderGrpWhenDispInLedger']")
	private static WebElement ClubTheTransactionsofAllTheAccountsUnderGroup;

	@FindBy(xpath = "//input[@id='rbnShowSummaryOfAccount']")
	private static WebElement showSummaryOfTheAccountRadioBtn;

	@FindBy(xpath = "//input[@id='chkSuspendCreditLimit']")
	private static WebElement suspendCreditLimitChkbox;

	@FindBy(xpath = "//input[@id='rbnDisplayDebitCreditTotalForEachMonth']")
	private static WebElement displayDebitCreditTotalForEachMonthRadioBtn;

	@FindBy(xpath = "//input[@id='rbnrbnDisplayDebitCreditTotalForEachDay']")
	private static WebElement displayDebitCreditTotalForEachDayRadioBtn;

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
	private static WebElement noIn;

	@FindBy(xpath = "//*[@id='dashName']")
	private static WebElement dashboard;

	@FindBy(xpath = "//div[@id='chartdiv0']")
	public static WebElement dashboardGraph;

	@FindBy(xpath = "//span[@id='btnPropOk']")
	public static WebElement dashboardLedger;

	@FindBy(xpath = "//span[@id='btnPropOk']")
	public static WebElement dashboardInfoPanel;

	// General tab
	@FindBy(xpath = "//tbody[@id='iBankAc_table_data_body']/tr/td")
	private static List<WebElement> bankAccountListCount;

	@FindBy(xpath = "//tbody[@id='iPDCDiscountedAC_table_data_body']/tr/td")
	private static List<WebElement> pdcAccountListCount;

	// Settings Tab
	@FindBy(xpath = "//tbody[@id='iExchangeAdjustmentGainAC_table_data_body']/tr/td")
	private static List<WebElement> exgGainListCount;

	@FindBy(xpath = "//tbody[@id='iExchangeAdjustmentLossAC_table_data_body']/tr/td")
	private static List<WebElement> exgLossListCount;

	@FindBy(xpath = "//tbody[@id='iPrimaryAccount_table_data_body']/tr/td")
	private static List<WebElement> primaryAccountListCount;

	@FindBy(xpath = "//tbody[@id='iReminderTerms_table_data_body']")
	private static WebElement reminderTermsEmptyList;

	@FindBy(xpath = "//tbody[@id='iDefaultCurrency_table_data_body']/tr/td")
	private static List<WebElement> defaultCurrencyListCount;

	@FindBy(xpath = "//tbody[@id='iFinanceChargeTerms_table_data_body']")
	private static WebElement financeChargeTermsEmptyList;

	@FindBy(xpath = "//tbody[@id='iPaymentTerms_table_data_body']")
	private static WebElement paymentTermsEmptyList;

	// Detail tab
	@FindBy(xpath = "//tbody[@id='iCity_table_data_body']")
	private static WebElement city1EmptyList;

	@FindBy(xpath = "//tbody[@id='iDeliveryCity_table_data_body']")
	private static WebElement city2EmptyList;

	// Tree tab
	@FindBy(xpath = "//tbody[@id='cmbUserTypeMaster_table_data_body']/tr/td")
	private static List<WebElement> mastercmbMasterListCount;

	// Currency Page
	@FindBy(xpath = "//span[@class='navText']//span[contains(text(),'Currency Master')]")
	private static WebElement currencyMasterlabel;

	@FindBy(xpath = "//*[@id='ISOCurrencyCode']")
	private static WebElement ISOCurrencyCodeTxt;

	@FindBy(xpath = "//td[@id='ISOCurrencyCode_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement ISOCurrencyCodeSettingsBtn;

	@FindBy(xpath = "//h4[@id='ISOCurrencyCode_customize_popup_heading']")
	private static WebElement ISOCurrencyCode_CustomizeDisplayColumnsLabel;

	@FindBy(xpath = "//div[@id='ISOCurrencyCode_customize_popup_container']")
	private static WebElement ISOCurrencysCodeContainerTxt;

	@FindBy(xpath = "//div[@id='ISOCurrencyCode_customize_popup_footer']//input[1]")
	private static WebElement ISOCurrencyCodeStanadrdfieldsBtn;

	@FindBy(xpath = "//select[@id='ISOCurrencyCode_customize_popup_standardfields_list']")
	private static WebElement ISOCurrencyCodeStanadrdfields_Fielddropdown;

	@FindBy(xpath = "//input[@id='ISOCurrencyCode_customize_popup_standardfields_header']")
	private static WebElement ISOCurrencyCodeStanadrdfields_headerTxt;

	@FindBy(xpath = "//select[@id='ISOCurrencyCode_customize_popup_standardfields_alignment']")
	private static WebElement ISOCurrencyCodeStanadrdfields_Allignmentdropdown;

	@FindBy(xpath = "//input[@id='ISOCurrencyCode_customize_popup_standardfields_width']")
	private static WebElement ISOCurrencyCodeStanadrdfields_WidthTxt;

	@FindBy(xpath = "//div[@id='currencyMasterWidth']//input[3]")
	private static WebElement ISOCurrencyCodeStanadrdfields_OkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement ISOCurrencyCodeStanadrdfields_CancelBtn;

	@FindBy(xpath = "//div[@id='ISOCurrencyCode_search_container']//input[2]")
	private static WebElement ISOCurrencyCodedeleteColumnBtn;

	@FindBy(xpath = "//div[@id='currencyMasterWidth']//input[3]")
	private static WebElement ISOCurrencyCodeOkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement ISOCurrencyCodeCancelBtn;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[2]/input[1]")
	private static WebElement coinsNameTxt;

	@FindBy(xpath = "//input[@id='currencyName']")
	private static WebElement currencyNameTxt;

	@FindBy(xpath = "//input[@id='GeneralRoundOff']")
	private static WebElement generalRoundOffTxt;

	@FindBy(xpath = "//select[@id='RoundingType']")
	private static WebElement roundingTypeDropdown;
	
	@FindBy(xpath = "//input[@id='CurrencyUnit']")
	private static WebElement currencyUnitTxt;

	@FindBy(xpath = "//input[@id='CurrencySubUnit']")
	private static WebElement currencySubUnitTxt;

	@FindBy(xpath = "//input[@id='connector']")
	private static WebElement connectorTxt;

	@FindBy(xpath = "//input[@id='controlSymbol']")
	private static WebElement controlSymbolDropdown;

	// Control SymbolPop Up
	@FindBy(xpath = "//td[@id='controlSymbol_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement symbolSettingsBtn;

	@FindBy(xpath = "//h4[@id='controlSymbol_customize_popup_heading']")
	private static WebElement symbol_CustomizeDisplayColumnsLabel;

	@FindBy(xpath = "//div[@id='controlSymbol_customize_popup_container']")
	private static WebElement ISOCurrencysSymbolContainerTxt;

	@FindBy(xpath = "//div[@id='controlSymbol_customize_popup_footer']//input[1]")
	private static WebElement symbolStanadrdfieldsBtn;

	@FindBy(xpath = "//select[@id='controlSymbol_customize_popup_standardfields_list']")
	private static WebElement symbolStanadrdfields_Fielddropdown;

	@FindBy(xpath = "//input[@id='controlSymbol_customize_popup_standardfields_header']")
	private static WebElement symbolStanadrdfields_headerTxt;

	@FindBy(xpath = "//select[@id='controlSymbol_customize_popup_standardfields_alignment']")
	private static WebElement symbolStanadrdfields_Allignmentdropdown;

	@FindBy(xpath = "//input[@id='controlSymbol_customize_popup_standardfields_width']")
	private static WebElement symbolStanadrdfields_WidthTxt;

	@FindBy(xpath = "//div[@id='currencyMasterWidth']//input[3]")
	private static WebElement symbolStanadrdfields_OkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement symbolStanadrdfields_CancelBtn;

	@FindBy(xpath = "//div[@id='controlSymbol_search_container']//input[2]")
	private static WebElement symboldeleteColumnBtn;

	@FindBy(xpath = "//div[@id='currencyMasterWidth']//input[3]")
	private static WebElement symbolOkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement symbolCancelBtn;

	@FindBy(xpath = "//input[@id='iNoOfDecimals']")
	private static WebElement noOfDecimalsTxt;

	@FindBy(xpath = "//input[@id='NoOfDesimals']")
	private static WebElement noOfDecimalsTxtInCurrency;
	
	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]")
	private static WebElement tableRow;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[1]")
	private static WebElement tableCol;

	// Grid Fields in Denomination Details
	@FindBy(xpath = "//td[@id='CurrencyMasterGrid_col_1-1']")
	private static WebElement denominationCode1;

	@FindBy(xpath = "//input[@id='CurrencyMasterGrid_control_heading_ctrl_2']")
	private static WebElement denominationValue1;

	@FindBy(xpath = "//td[@id='CurrencyMasterGrid_col_2-1']")
	private static WebElement denominationCode2;

	@FindBy(xpath = "//td[@id='CurrencyMasterGrid_col_2-2']")
	private static WebElement denominationValue2;

	// Pop Up Field
	@FindBy(xpath = "//span[contains(text(),'Exchange Rate Definition')]")
	private static WebElement exchangeRateDefinitionLabel;

	@FindBy(xpath = "//i[@class='icon-font7 icon-import-from-excel']")
	private static WebElement importFromExcelIcon;

	@FindBy(xpath = "//i[@class='icon-font7 icon-clear']")
	private static WebElement exchangeRateDefinitionClearIcon;

	@FindBy(xpath = "//i[@class='icon-font7 icon-save']")
	private static WebElement exchangeRateDefinitionSaveIcon;

	@FindBy(xpath = "//span[@id='btnCurrencyMasterCancel']//i[@class='icon-font7 icon-close']")
	private static WebElement exchangeRateDefinitionPopCloseIcon;

	@FindBy(xpath = "//span[@id='closeExchangeRate']")
	private static WebElement exchangeRateDefinitionPageCloseIcon;

	@FindBy(xpath = "//input[@id='id_option']")
	private static WebElement baseCurrencyTxt;

	@FindBy(xpath = "//td[@id='id_option_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement baseCurrencySettingsBtn;
	
	@FindBy(xpath = "//h4[@id='id_option_customize_popup_heading']")
	private static WebElement baseCurrency_CustomizeDisplayColumnsLabel;

	@FindBy(xpath = "//div[@id='id_option_customize_popup_container']")
	private static WebElement baseCurrencyscodeContainerTxt;

	@FindBy(xpath = "//div[@id='id_option_customize_popup_footer']//input[1]")
	private static WebElement baseCurrencyStanadrdfieldsBtn;

	@FindBy(xpath = "//select[@id='id_option_customize_popup_standardfields_list']")
	private static WebElement baseCurrencyStanadrdfields_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_option_customize_popup_standardfields_header']")
	private static WebElement baseCurrencyStanadrdfields_headerTxt;

	@FindBy(xpath = "//select[@id='id_option_customize_popup_standardfields_alignment']")
	private static WebElement baseCurrencyStanadrdfields_Allignmentdropdown;

	@FindBy(xpath = "//input[@id='id_option_customize_popup_standardfields_width']")
	private static WebElement baseCurrencyStanadrdfields_WidthTxt;

	@FindBy(xpath = "//div[@class='row']//input[3]")
	private static WebElement baseCurrencyStanadrdfields_OkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement baseCurrencyStanadrdfields_CancelBtn;

	@FindBy(xpath = "//div[@id='id_option_search_container']//input[2]")
	private static WebElement baseCurrencydeleteColumnBtn;

	@FindBy(xpath = "//div[@class='row']//input[3]")
	private static WebElement baseCurrencyOkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement baseCurrencyCancelBtn;

	// Grid Fields
	@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName']")
	private static WebElement gridcurrencyName1Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_CurrencyName_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement currencyNameSettingsBtn;

	// Pop Up
	@FindBy(xpath = "//h4[@id='ExchangeTable_CurrencyName_customize_popup_heading']")
	private static WebElement currencyName_CustomizeDisplayColumnsLabel;

	@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_customize_popup_container']")
	private static WebElement currencyNameContainerTxt;

	@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_customize_popup_footer']//input[1]")
	private static WebElement currencyNameStanadrdfieldsBtn;

	@FindBy(xpath = "//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_list']")
	private static WebElement currencyNameStanadrdfields_Fielddropdown;

	@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_header']")
	private static WebElement currencyNameStanadrdfields_headerTxt;

	@FindBy(xpath = "//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_alignment']")
	private static WebElement currencyNameStanadrdfields_Allignmentdropdown;

	@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_width']")
	private static WebElement currencyNameStanadrdfields_WidthTxt;

	@FindBy(xpath = "//table[@id='ExchangeTable']//input[3]")
	private static WebElement currencyNameStanadrdfields_OkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement currencyNameStanadrdfields_CancelBtn;

	@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_search_container']//input[2]")
	private static WebElement currencyNamedeleteColumnBtn;

	@FindBy(xpath = "//table[@id='ExchangeTable']//input[3]")
	private static WebElement currencyNameOkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement currencyNameCancelBtn;

	@FindBy(xpath = "//input[@id='EffectiveDate']")
	private static WebElement withEffectiveDateTxt;

	@FindBy(xpath = "//*[@id='EffectiveDate_input_image']/span")
	private static WebElement dOne;

	@FindBy(xpath = "//*[@id='EffectiveDate_day_today']/td/span[1]")
	private static WebElement dTwo;

	@FindBy(xpath = "//input[@id='ExchangeTable_DefinedAs']")
	private static WebElement gridDefineAsTxt;

	@FindBy(xpath = "//input[@id='ExchangeTable_Rate']")
	private static WebElement gridRateTxt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-2']")
	private static WebElement gridDefineAs1Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
	private static WebElement gridRate1Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-4']")
	private static WebElement gridDescription1Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-1']")
	private static WebElement gridcurrencyName2Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-2']")
	private static WebElement gridDefineAs2Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-3']")
	private static WebElement gridRate2Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-4']")
	private static WebElement gridDescription2Txt;
	
	@FindBy(xpath = "//td[@id='ExchangeTable_col_3-1']")
	private static WebElement gridcurrencyName3Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_3-2']")
	private static WebElement gridDefineAs3Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_3-3']")
	private static WebElement gridRate3Txt;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_3-4']")
	private static WebElement gridDescription3Txt;

	@FindBy(xpath = "//span[@id='exchange_currency']")
	private static WebElement exchangeRateIcon;

	@FindBy(xpath = "//div[contains(text(),'Clear')]")
	private static WebElement clearIcon;

	
	@FindBy(xpath = "//span[@id='btnSave']")
	private static WebElement saveIcon;

	@FindBy(xpath = "//span[@id='btnClose']")
	private static WebElement cancelIcon;

	// Exchange Rate Page

	// Header Fields
	@FindBy(xpath = "//i[@class='icon-font7 icon-delete']")
	private static WebElement exchangeRateDefinitionDeleteIcon;

	@FindBy(xpath = " //span[@id='closeExchangeRate']//i[@class='icon-font7 icon-close']")
	private static WebElement exchangeRateDefinitionCloseIcon;

	// Exchange Rate History
	@FindBy(xpath = "//div[@class='navText']//span[contains(text(),'Exchange Rate History')]")
	private static WebElement exchangeRateHistoryLabel;

	@FindBy(xpath = "//input[@id='id_option']")
	private static WebElement baseCurrencyInExchangeRateHistory;

	@FindBy(xpath = "//*[@id='DateOption']")
	private static WebElement dateOptionDropdown;

	@FindBy(xpath = "//*[@id='FromDate']")
	private static WebElement fromDateTxt;

	@FindBy(xpath = "//*[@id='ToDate']")
	private static WebElement toDateTxt;

	@FindBy(xpath = "//i[@class='icon-font7 icon-refresh']")
	private static WebElement loadIcon;

	@FindBy(xpath = "//i[@class='icon-font7 icon-clear']")
	private static WebElement exchangeRateHistoryclearIcon;

	// Grid
	@FindBy(xpath = "//input[@id='chkSelectAll']")
	private static WebElement toSelectAllChkBox;

	@FindBy(xpath = "//input[@id='ExchangeTable_chk0']")
	private static WebElement row1Chkbox;

	@FindBy(xpath = "//input[@id='//td[@id='ExchangeTable_col_1-2']")
	private static WebElement selectCurrency1;

	// PopUp
	@FindBy(xpath = "//td[@id='ExchangeTable_CurrencyName_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement selectCurrencySettingsBtn;

	@FindBy(xpath = "//h4[@id='ExchangeTable_CurrencyName_customize_popup_heading']")
	private static WebElement selectCurrency_CustomizeDisplayColumnsLabel;

	@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_customize_popup_container']")
	private static WebElement isoCurrencysselectCurrencysCodeContainerTxt;

	@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_customize_popup_footer']//input[1]")
	private static WebElement selectCurrencyStanadrdfieldsBtn;

	@FindBy(xpath = "//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_list']")
	private static WebElement selectCurrencyStanadrdfields_Fielddropdown;

	@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_header']")
	private static WebElement selectCurrencyStanadrdfields_headerTxt;

	@FindBy(xpath = "//select[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_alignment']")
	private static WebElement selectCurrencyStanadrdfields_Allignmentdropdown;

	@FindBy(xpath = "//input[@id='ExchangeTable_CurrencyName_customize_popup_standardfields_width']")
	private static WebElement selectCurrencyStanadrdfields_WidthTxt;

	@FindBy(xpath = "//section[@id='page_Content']//input[3]")
	private static WebElement selectCurrencyStanadrdfields_OkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement selectCurrencyStanadrdfields_CancelBtn;

	@FindBy(xpath = "//div[@id='ExchangeTable_CurrencyName_search_container']//input[2]")
	private static WebElement selectCurrencydeleteColumnBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[3]")
	private static WebElement selectCurrencyOkBtn;

	@FindBy(xpath = "//section[@id='page_Content']//input[4]")
	private static WebElement selectCurrencyCancelBtn;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
	private static WebElement DefineAs1Txt;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")
	private static WebElement valueUSD;

	@FindBy(xpath = "/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")
	private static WebElement valueAED;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-2']")
	private static WebElement selCurrencyOne;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-2']")
	private static WebElement selCurrecnyTwo;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
	private static WebElement defCurrecnyOne;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-3']")
	private static WebElement defCurrecnyTwo;

	// Grid Second Row
	@FindBy(xpath = "//input[@id='ExchangeTable_chk1']")
	private static WebElement Row2Chkbox;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-2']")
	private static WebElement SelectCurrency2;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-3']")
	private static WebElement DefineAs2Txt;

	@FindBy(xpath = "//i[@class='icon-font6 icon-close']")
	private static WebElement exchangeRateHistoryCloseIcon;

	@FindBy(xpath = "//span[contains(text(),'Graph')]")
	private static WebElement graphTab;

	@FindBy(xpath = "//span[@class='font-5'][contains(text(),'Table')]")
	private static WebElement tableTab;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_1-0']")
	private static WebElement selectFirstRowIndex;

	@FindBy(xpath = "//td[@id='ExchangeTable_col_2-0']")
	private static WebElement selectSecondRowIndex;

	@FindBy(xpath = "//div[contains(text(),'Delete Row')]")
	private static WebElement selectDeleteOption;

	@FindBy(xpath = "//span[@id='DeleteData']")
	private static WebElement exchnageRateDeleteOption;

	// Vouchers Home Page Ribbon Control

	@FindBy(xpath = "//div[@id='myNavbar']//span[@class='icon-new icon-font6']")
	private static WebElement newBtn;

	@FindBy(xpath = "//div[@id='id_transaction_homescreen_edit']//span[@class='icon-edit icon-font6 ImagesinArabic']")
	private static WebElement editBtn;

	@FindBy(xpath = "//span[@class='icon-print icon-font6']")
	private static WebElement printBtn;

	@FindBy(xpath = "//div[@id='id_transaction_homescreen_Delete']//span[@class='icon-delete icon-font6']")
	private static WebElement transHomePageDeleteBtn;

	@FindBy(xpath = "//span[@class='icon-authorize icon-font6']")
	private static WebElement authorizeBtn;

	@FindBy(xpath = "//span[@class='icon-suspend icon-font6']")
	private static WebElement suspendBtn;

	@FindBy(xpath = "//span[@class='icon-reject2 icon-font6']")
	private static WebElement rejectBtn;

	@FindBy(xpath = "//span[@class='icon-cheque icon-font6']")
	private static WebElement chequeReturnBtn;

	@FindBy(xpath = "//span[@class='icon-printbarcode icon-font6']")
	private static WebElement printBarCodeBtn;

	@FindBy(xpath = "//span[@class='icon-convert icon-font6']")
	private static WebElement convertBtn;

	@FindBy(xpath = "//span[@class='icon-export icon-font6']")
	private static WebElement exportToXMLBtn;

	@FindBy(xpath = "//div[@id='myNavbar']//span[@class='icon-settings icon-font6']")
	private static WebElement settingsBtn;

	@FindBy(xpath = "//div[@id='dvHomeTransClose']//span[@class='icon-close icon-font6']")
	private static WebElement homeCloseBtn;

	// Vouchers Home Page Options
	@FindBy(xpath = "//a[@class='transaction_viewname_anchor theme_color-inverse font-5']")
	private static WebElement allVouchersOption;

	@FindBy(xpath = "//a[@class='transaction_viewname_anchor font-5']")
	private static WebElement pendingBillsOption;

	@FindBy(xpath = "//input[@id='SelectDefaultView']")
	private static WebElement selectDefaultViewChkBox;

	@FindBy(xpath = "//span[@class='icon-sorting icon-font6 toolbar_button_image theme_button_color dropdown-toggle']")
	private static WebElement sortingBtn;

	@FindBy(xpath = "//div[@id='btnCreateView']//span[@class='icon-new icon-font6']")
	private static WebElement createViewBtn;

	@FindBy(xpath = "//div[@id='btnCustomize']//span[@class='icon-settings icon-font6']")
	private static WebElement customizeBtn;

	@FindBy(xpath = "//span[@class='icon-filter icon-font6']")
	private static WebElement filterBtn;

	@FindBy(xpath = "//span[@id='reportRefresh']")
	private static WebElement refreshBtn;

	@FindBy(xpath = "//i[@class='icon-font6 icon-export']")
	private static WebElement exportBtn;

	// Options Button (Display Option)
	@FindBy(xpath = "//span[@id='transOptions']")
	private static WebElement optionsBtn;

	@FindBy(xpath = "//a[contains(text(),'Auto Adjust Width')]")
	private static WebElement autoAdjustWidthBtn;

	@FindBy(xpath = "//a[contains(text(),'Fit To Screen')]")
	private static WebElement fitToScreenBtn;

	@FindBy(xpath = "//a[contains(text(),'Normal')]")
	private static WebElement normalBtn;

	// Voucher Home Page Grid Header Columns
	@FindBy(xpath = "//input[@id='HeaderChkBox']")
	private static WebElement grid_HeaderChkBox;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[3]")
	private static WebElement grid_Header_Date;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[4]")
	private static WebElement grid_Header_VoucherNumber;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[5]")
	private static WebElement grid_Header_CreatedBy;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[6]")
	private static WebElement grid_Header_ModifiedBy;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[7]")
	private static WebElement grid_Header_CreatedDate;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[8]")
	private static WebElement grid_Header_ModifiedDate;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[9]")
	private static WebElement grid_Header_CreatedTime;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[10]")
	private static WebElement grid_Header_ModifiedTime;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[11]")
	private static WebElement grid_Header_Suspended;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[12]")
	private static WebElement grid_Header_Cancelled;

	@FindBy(xpath = "//*[@id='tblHeadTransRenderRow']/th[13]")
	private static WebElement grid_Header_AuthorizationStatus;

	// Grid Voucher DetailsBtn
	@FindBy(xpath = "//tr[@id='trRender_1']//i[@class='icon-info icon-font7']")
	private static WebElement grid_VoucherDetailsBtn1;

	@FindBy(xpath = "//tr[@id='trRender_2']//i[@class='icon-info icon-font7']")
	private static WebElement grid_VoucherDetailsBtn2;

	// Grid CheckBox 1 And 2

	@FindBy(xpath = "//tr[@id='trRender_1']//td//input")
	private static WebElement grid_ChkBox1;

	@FindBy(xpath = "//tr[@id='trRender_2']//td//input")
	private static WebElement grid_ChkBox2;

	@FindBy(xpath = "//tr[@id='trRender_3']//td//input")
	private static WebElement grid_ChkBox3;

	@FindBy(xpath = "//tr[@id='trRender_4']//td//input")
	private static WebElement grid_ChkBox4;

	// Vouchers Home Page Footer
	@FindBy(xpath = "//div[@id='tblFooterReportRender']//input[@id='txtSearch']")
	private static WebElement searchField;

	@FindBy(xpath = "//button[@id='frstPage']")
	private static WebElement firstPageBtn;

	@FindBy(xpath = "//button[@id='id_previousPage']")
	private static WebElement previousPageBtn;

	@FindBy(xpath = "//button[@id='id_pagenumber']")
	private static WebElement currentPageNo;

	@FindBy(xpath = "//button[@id='id_nextPage']")
	private static WebElement nextPageBtn;

	@FindBy(xpath = "//button[@id='lstPage']")
	private static WebElement lastPageBtn;

	// Vouchers Entry Page Ribbon Control Options
	@FindBy(xpath = "//span[@class='icon-scroll icon-font6']")
	private static WebElement freeFlowBtn;

	@FindBy(xpath = "//span[@class='icon-header icon-font6']")
	private static WebElement jumpToHeaderSectionBtn;

	@FindBy(xpath = "//span[@class='icon-panel icon-font6']")
	private static WebElement jumpToBodySectionBtn;

	@FindBy(xpath = "//span[@class='icon-footer icon-font6']")
	private static WebElement jumpToFooterBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_new']")
	private static WebElement new_newBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_save']")
	private static WebElement transSaveBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_previous']")
	private static WebElement previousBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_next']")
	private static WebElement nextBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_print']")
	private static WebElement new_PrintBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_suspend']")
	private static WebElement new_SuspendBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_close']")
	private static WebElement new_CloseBtn;

	@FindBy(xpath = "//div[@id='id_transactionentry_delete']//span[contains(@class,'icon-delete icon-font6')]")
	private static WebElement new_DeleteBtn;

	@FindBy(xpath = "//span[@class='icon-menu icon-font4']")
	private static WebElement toggleBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_copydocument']")
	private static WebElement copyDocumentOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_copytoclipboard']")
	private static WebElement copyToClipBoardOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_pastefromclipboard']")
	private static WebElement pasteFromClipBoardOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_raisechequereturn']")
	private static WebElement raiseCheckReturnOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_addtostock']")
	private static WebElement addToStockOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_markconvert']")
	private static WebElement markConvertedOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_bominput']")
	private static WebElement bOMinputOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_autoallocate']")
	private static WebElement autoAllocateOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_reverseentry']")
	private static WebElement reverseEntryOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_printbarcode']")
	private static WebElement printBarCodeOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_postingdetails']")
	private static WebElement postingDetailsOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_exporttoxml']")
	private static WebElement exportToXMLOption;

	@FindBy(xpath = "//*[@id='id_transactionentry_settings']")
	private static WebElement settingsOption;

	// Voucher Entry Page Header Fields
	@FindBy(xpath = "//input[@id='id_header_1']")
	private static WebElement documentNumberTxt;

	@FindBy(xpath = "//*[@id='id_header_1_input_image']/span")
	private static WebElement documentNumberdropdown_ExpansionBtn;

	@FindBy(xpath = "//input[@id='id_header_2']")
	private static WebElement dateTxt;

	@FindBy(xpath = "//td[@id='id_header_2_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
	private static WebElement dateTxt_CalenderBtn;

	@FindBy(xpath = "//tr[@id='id_header_2_day_today']//span[@class='theme_color-inverse'][contains(text(),'Today')]")
	private static WebElement calender_TodayBtn;

	@FindBy(xpath = "//input[@id='id_header_4']")
	private static WebElement caskBankAccountTxt;

	@FindBy(xpath = "//*[@id='id_header_4_input_image']/span")
	private static WebElement caskBankAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
	private static WebElement cashBankAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
	private static WebElement cashBankAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
	private static WebElement cashBankAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
	private static WebElement cashBankAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
	private static WebElement cashBankAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	private static WebElement cashBankAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
	private static WebElement cashBankAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement cashBankAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement cashBankAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
	private static WebElement cashBankAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement cashBankAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement cashBankAccount_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_268435459']")
	private static WebElement departmentTxt;

	@FindBy(xpath = "//*[@id='id_header_268435459_input_image']/span")
	private static WebElement department_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_268435459_input_settings']/span")
	private static WebElement department_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_268435459_customize_popup_container']")
	private static WebElement department_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_268435459_customize_popup_footer']//input[1]")
	private static WebElement department_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_268435459_customize_popup_standardfields_list']")
	private static WebElement department_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_268435459_customize_popup_standardfields_header']")
	private static WebElement department_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_268435459_customize_popup_standardfields_alignment']")
	private static WebElement department_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_268435459_customize_popup_standardfields_width']")
	private static WebElement department_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement department_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement department_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_268435459_search_container']//input[2]")
	private static WebElement department_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement department_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement department_Settings_CancelBtn;

	@FindBy(xpath = "//*[@id='id_header_6']")
	private static WebElement maturityDateTxt;

	@FindBy(xpath = "//*[@id='id_header_6_input_image']/span']")
	private static WebElement maturityDateTxt_CalenderBtn;

	@FindBy(xpath = "//input[@id='id_header_3']")
	private static WebElement purchaseAccountTxt;

	@FindBy(xpath = "//*[@id='id_header_3_input_image']/span")
	private static WebElement purchaseAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_3_input_settings']/span")
	private static WebElement purchaseAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_3_customize_popup_container']")
	private static WebElement purchaseAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_3_customize_popup_footer']//input[1]")
	private static WebElement purchaseAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_list']")
	private static WebElement purchaseAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_header']")
	private static WebElement purchaseAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_alignment']")
	private static WebElement purchaseAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_width']")
	private static WebElement purchaseAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement purchaseAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement purchaseAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_3_search_container']//input[2]")
	private static WebElement purchaseAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement purchaseAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement purchaseAccount_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_4']")
	private static WebElement vendorAccountTxt;

	@FindBy(xpath = "//*[@id='id_header_4_input_image']/span")
	private static WebElement vendorAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
	private static WebElement vendorAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
	private static WebElement vendorAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
	private static WebElement vendorAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
	private static WebElement vendorAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
	private static WebElement vendorAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	private static WebElement vendorAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
	private static WebElement vendorAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement vendorAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement vendorAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
	private static WebElement vendorAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement vendorAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement vendorAccount_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_3']")
	private static WebElement salesAccountTxt;

	@FindBy(xpath = "//*[@id='id_header_3_input_image']/span")
	private static WebElement salesAccountExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_3_input_settings']/span")
	private static WebElement salesAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_3_customize_popup_container']")
	private static WebElement salesAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_3_customize_popup_footer']//input[1]")
	private static WebElement salesAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_list']")
	private static WebElement salesAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_header']")
	private static WebElement salesAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_3_customize_popup_standardfields_alignment']")
	private static WebElement salesAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_3_customize_popup_standardfields_width']")
	private static WebElement salesAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement salesAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement salesAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_3_search_container']//input[2]")
	private static WebElement salesAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement salesAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement salesAccount_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_4']")
	private static WebElement customerAccountTxt;

	@FindBy(xpath = "//*[@id='id_header_4_input_image']/span")
	private static WebElement customerAccount_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
	private static WebElement customerAccount_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
	private static WebElement customerAccount_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
	private static WebElement customerAccount_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
	private static WebElement customerAccount_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
	private static WebElement customerAccount_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	private static WebElement customerAccount_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
	private static WebElement customerAccount_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement customerAccount_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement customerAccount_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
	private static WebElement customerAccount_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement customerAccount_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement customerAccount_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_12']")
	private static WebElement accountTxt;

	@FindBy(xpath = "//*[@id='id_header_12_input_image']/span")
	private static WebElement account_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_4_input_settings']/span")
	private static WebElement account_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_container']")
	private static WebElement account_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_4_customize_popup_footer']//input[1]")
	private static WebElement account_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_list']")
	private static WebElement account_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_header']")
	private static WebElement account_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_4_customize_popup_standardfields_alignment']")
	private static WebElement account_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_4_customize_popup_standardfields_width']")
	private static WebElement account_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement account_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement account_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_4_search_container']//input[2]")
	private static WebElement account_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement account_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement account_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_header_31']")
	private static WebElement issuesReceiptsTxt;

	@FindBy(xpath = "//input[@id='id_header_268435460']")
	private static WebElement wareHouseTxt;

	@FindBy(xpath = "//*[@id='id_header_268435460_input_image']/span")
	private static WebElement wareHouse_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_header_268435460_input_settings']/span")
	private static WebElement wareHouse_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_268435460_customize_popup_container']")
	private static WebElement wareHouse_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_268435460_customize_popup_footer']//input[1]")
	private static WebElement wareHouse_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_268435460_customize_popup_standardfields_list']")
	private static WebElement wareHouse_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_268435460_customize_popup_standardfields_header']")
	private static WebElement wareHouse_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_268435460_customize_popup_standardfields_alignment']")
	private static WebElement wareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_268435460_customize_popup_standardfields_width']")
	private static WebElement wareHouse_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement wareHouse_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement wareHouse_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_268435460_search_container']//input[2]")
	private static WebElement wareHouse_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement wareHouse_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement wareHouse_Settings_CancelBtn;

	@FindBy(xpath = "//span[contains(text(),'sName')]")
	private static WebElement customize_sName;

	@FindBy(xpath = "//span[@class='vcenter'][contains(text(),'Code')]")
	private static WebElement customize_sCode;

	@FindBy(xpath = "//span[contains(text(),'Alias')]")
	private static WebElement customize_Alias;

	@FindBy(xpath = "//span[@class='vcenter'][contains(text(),'Group')]")
	private static WebElement customize_bGroup;

	@FindBy(xpath = "//span[contains(@class,'vcenter')][contains(text(),'Balance')]")
	private static WebElement customize_Balance;

	@FindBy(xpath = "//input[@id='id_header_67108920']")
	private static WebElement appropriateBasedOndropdown;

	@FindBy(xpath = "//input[@id='id_header_67108921']")
	private static WebElement additionalValueTxt;

	@FindBy(xpath = "//input[@id='id_header_21']")
	private static WebElement raiseReceiptsChkBox;

	@FindBy(xpath = "//input[@id='id_header_67108865']")
	private static WebElement receipts_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108868']")
	private static WebElement payments_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108871']")
	private static WebElement pettyCash_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108874']")
	private static WebElement postDatedReceipts_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108865']")
	private static WebElement postDatedPayments_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108880']")
	private static WebElement purchaseVouchers_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108881']")
	private static WebElement purchaseReturns_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108884']")
	private static WebElement salesInvoice_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108886']")
	private static WebElement salesOrder_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108928']")
	private static WebElement salesInvoiceNewNarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108885']")
	private static WebElement salesReturns_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108913']")
	private static WebElement cashSales_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108914']")
	private static WebElement hirePurchaseSales_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108890']")
	private static WebElement journalEntries_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108916']")
	private static WebElement forexJV_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108910']")
	private static WebElement interDepartmentalJV_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108888']")
	private static WebElement nonStandardJournalEntries_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108892']")
	private static WebElement debitNotes_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108911']")
	private static WebElement debitNotesLineWise_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108893']")
	private static WebElement creditNotes_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108912']")
	private static WebElement creditNotesLineWisePayroll_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108894']")
	private static WebElement openingBalance_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108891']")
	private static WebElement fixedAssetDepreciationVoucher_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108909']")
	private static WebElement requestForQuote_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108903']")
	private static WebElement purchasesQuotations_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108882']")
	private static WebElement purchasesOrders_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108882']")
	private static WebElement materialReceiptsNotes_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108904']")
	private static WebElement salesQuotationss_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108887']")
	private static WebElement deliveryNotes_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108917']")
	private static WebElement posSales_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108918']")
	private static WebElement productionOrder_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108886']")
	private static WebElement salesOrders_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108895']")
	private static WebElement shortagesinStock_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108896']")
	private static WebElement excessesinStocks_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108897']")
	private static WebElement stockTransfers_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108898']")
	private static WebElement openingStocks_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108923']")
	private static WebElement openingStocksNEW_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108908']")
	private static WebElement materialRequisition_NarrationTxt;

	@FindBy(xpath = "//input[@id='id_header_67108866']")
	private static WebElement receipts_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108869']")
	private static WebElement payments_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108872']")
	private static WebElement pettyCash_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108875']")
	private static WebElement postDatedReceipts_ChequeNoTxt;

	@FindBy(xpath = "//input[@id='id_header_67108878']")
	private static WebElement postDatedPayments_ChequeNoTxt;

	// Voucher Entry Page Body Fields

	@FindBy(xpath = "//input[@id='id_body_536870916']")
	private static WebElement pvWareHouseTxt;

	@FindBy(xpath = "//td[@id='id_body_536870916_input_image']//span[@class='icon-down-arrow optioncontrol_arrow_margin']")
	private static WebElement pvWareHouse_ExpansionBtn;

	@FindBy(xpath = "//td[@id='id_body_536870916_input_settings']//span[@class='icon-settings optioncontrol_settings_margin']")
	private static WebElement pvWareHouse_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_body_536870916_customize_popup_container']")
	private static WebElement pvWareHouse_Settings_Container;

	@FindBy(xpath = "//div[@id='id_body_536870916_customize_popup_footer']//input[1]")
	private static WebElement pvWareHouse_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_body_536870916_customize_popup_standardfields_list']")
	private static WebElement pvWareHouse_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_body_536870916_customize_popup_standardfields_header']")
	private static WebElement pvWareHouse_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_body_536870916_customize_popup_standardfields_alignment']")
	private static WebElement pvWareHouse_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_body_536870916_customize_popup_standardfields_width']")
	private static WebElement pvWareHouse_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement pvWareHouse_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement pvWareHouse_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_body_536870916_search_container']//input[2]")
	private static WebElement pvWareHouse_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[@class='panel']//input[3]")
	private static WebElement pvWareHouse_Settings_OkBtn;

	@FindBy(xpath = "//div[@class='panel']//input[4]")
	private static WebElement pvWareHouse_Settings_CancelBtn;

	// Grid Elements
	@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement grid_Header_Account;

	@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement grid_Header_Item;

	@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_1']")
	private static WebElement grid_Header_DebitAC;

	@FindBy(xpath = "//th[@id='id_transaction_entry_detail_table_control_heading_2']")
	private static WebElement grid_Header_CreditAC;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[1]")
	private static WebElement firstRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[1]")
	private static WebElement secondRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[1]")
	private static WebElement thirdRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[1]")
	private static WebElement fourthRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[1]")
	private static WebElement fifthRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[1]")
	private static WebElement sixthRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[1]")
	private static WebElement seventhRowIndex;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[1]")
	private static WebElement eigthRowIndex;

	@FindBy(xpath = "//span[@class='icon-delete icon-font8']")
	private static WebElement deleteRowBtn;

	@FindBy(xpath = "//span[@class='icon-insertrow icon-font8']")
	private static WebElement insertRowBtn;

	@FindBy(xpath = "//span[@class='icon-selectall icon-font8']")
	private static WebElement selectRowBtn;

	@FindBy(xpath = "//span[@class='icon-unselectall1 icon-font8']")
	private static WebElement unSelectRowBtn;

	@FindBy(xpath = "//span[@class='icon-clone icon-font8']")
	private static WebElement duplicateRowBtn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[2]")
	private static WebElement select1stRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[3]")
	private static WebElement select1stRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[4]")
	private static WebElement select1stRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
	private static WebElement select1stRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[6]")
	private static WebElement select1stRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[7]")
	private static WebElement select1stRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[8]")
	private static WebElement select1stRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[9]")
	private static WebElement select1stRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[10]")
	private static WebElement select1stRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[11]")
	private static WebElement select1stRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[12]")
	private static WebElement select1stRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[13]")
	private static WebElement select1stRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[14]")
	private static WebElement select1stRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[15]")
	private static WebElement select1stRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[16]")
	private static WebElement select1stRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[17]")
	private static WebElement select1stRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[2]")
	private static WebElement select2ndRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[3]")
	private static WebElement select2ndRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[4]")
	private static WebElement select2ndRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[5]")
	private static WebElement select2ndRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[6]")
	private static WebElement select2ndRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[7]")
	private static WebElement select2ndRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[8]")
	private static WebElement select2ndRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[9]")
	private static WebElement select2ndRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[10]")
	private static WebElement select2ndRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[12]")
	private static WebElement select2ndRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[13]")
	private static WebElement select2ndRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[11]")
	private static WebElement select2ndRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[15]")
	private static WebElement select2ndRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[16]")
	private static WebElement select2ndRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[2]/td[17]")
	private static WebElement select2ndRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[2]")
	private static WebElement select3rdRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[3]")
	private static WebElement select3rdRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[4]")
	private static WebElement select3rdRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[5]")
	private static WebElement select3rdRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[6]")
	private static WebElement select3rdRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[7]")
	private static WebElement select3rdRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[8]")
	private static WebElement select3rdRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[9]")
	private static WebElement select3rdRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[10]")
	private static WebElement select3rdRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[11]")
	private static WebElement select3rdRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[12]")
	private static WebElement select3rdRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[13]")
	private static WebElement select3rdRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[14]")
	private static WebElement select3rdRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[15]")
	private static WebElement select3rdRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[16]")
	private static WebElement select3rdRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[3]/td[17]")
	private static WebElement select3rdRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[2]")
	private static WebElement select4thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[3]")
	private static WebElement select4thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[4]")
	private static WebElement select4thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[5]")
	private static WebElement select4thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[6]")
	private static WebElement select4thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[7]")
	private static WebElement select4thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[8]")
	private static WebElement select4thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[9]")
	private static WebElement select4thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[10]")
	private static WebElement select4thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[11]")
	private static WebElement select4thRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[12]")
	private static WebElement select4thRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[13]")
	private static WebElement select4thRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[14]")
	private static WebElement select4thRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[15]")
	private static WebElement select4thRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[16]")
	private static WebElement select4thRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[4]/td[17]")
	private static WebElement select4thRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[2]")
	private static WebElement select5thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[3]")
	private static WebElement select5thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[4]")
	private static WebElement select5thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[5]")
	private static WebElement select5thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[6]")
	private static WebElement select5thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[7]")
	private static WebElement select5thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[8]")
	private static WebElement select5thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[9]")
	private static WebElement select5thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[10]")
	private static WebElement select5thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[11]")
	private static WebElement select5thRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[12]")
	private static WebElement select5thRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[13]")
	private static WebElement select5thRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[14]")
	private static WebElement select5thRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[15]")
	private static WebElement select5thRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[16]")
	private static WebElement select5thRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[5]/td[17]")
	private static WebElement select5thRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[2]")
	private static WebElement select6thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[3]")
	private static WebElement select6thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[4]")
	private static WebElement select6thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[5]")
	private static WebElement select6thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[6]")
	private static WebElement select6thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[7]")
	private static WebElement select6thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[8]")
	private static WebElement select6thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[9]")
	private static WebElement select6thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[10]")
	private static WebElement select6thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[11]")
	private static WebElement select6thRow_10thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[12]")
	private static WebElement select6thRow_11thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[13]")
	private static WebElement select6thRow_12thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[14]")
	private static WebElement select6thRow_13thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[15]")
	private static WebElement select6thRow_14thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[16]")
	private static WebElement select6thRow_15thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[6]/td[17]")
	private static WebElement select6thRow_16thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[2]")
	private static WebElement select7thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[3]")
	private static WebElement select7thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[4]")
	private static WebElement select7thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[5]")
	private static WebElement select7thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[6]")
	private static WebElement select7thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[7]")
	private static WebElement select7thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[8]")
	private static WebElement select7thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[9]")
	private static WebElement select7thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[7]/td[10]")
	private static WebElement select7thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[2]")
	private static WebElement select8thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[3]")
	private static WebElement select8thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[4]")
	private static WebElement select8thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[5]")
	private static WebElement select8thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[6]")
	private static WebElement select8thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[7]")
	private static WebElement select8thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[8]")
	private static WebElement select8thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[9]")
	private static WebElement select8thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[8]/td[10]")
	private static WebElement select8thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[2]")
	private static WebElement select9thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[3]")
	private static WebElement select9thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[4]")
	private static WebElement select9thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[5]")
	private static WebElement select9thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[6]")
	private static WebElement select9thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[7]")
	private static WebElement select9thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[8]")
	private static WebElement select9thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[9]")
	private static WebElement select9thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[9]/td[10]")
	private static WebElement select9thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[2]")
	private static WebElement select10thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[3]")
	private static WebElement select10thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[4]")
	private static WebElement select10thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[5]")
	private static WebElement select10thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[6]")
	private static WebElement select10thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[7]")
	private static WebElement select10thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[8]")
	private static WebElement select10thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[9]")
	private static WebElement select10thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[10]/td[10]")
	private static WebElement select10thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[2]")
	private static WebElement select11thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[3]")
	private static WebElement select11thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[4]")
	private static WebElement select11thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[5]")
	private static WebElement select11thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[6]")
	private static WebElement select11thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[7]")
	private static WebElement select11thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[8]")
	private static WebElement select11thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[9]")
	private static WebElement select11thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[11]/td[10]")
	private static WebElement select11thRow_9thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[2]")
	private static WebElement select12thRow_1stColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[3]")
	private static WebElement select12thRow_2ndColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[4]")
	private static WebElement select12thRow_3rdColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[5]")
	private static WebElement select12thRow_4thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[6]")
	private static WebElement select12thRow_5thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[7]")
	private static WebElement select12thRow_6thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[8]")
	private static WebElement select12thRow_7thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[9]")
	private static WebElement select12thRow_8thColumn;

	@FindBy(xpath = "//*[@id='id_transaction_entry_detail_table_body']/tr[12]/td[10]")
	private static WebElement select12thRow_9thColumn;

	@FindBy(xpath = "//input[@id='id_body_12']")
	private static WebElement enter_AccountTxt;

	@FindBy(xpath = "//*[@id='id_body_12_input_image']/span")
	private static WebElement enter_Account_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_12_input_settings']/span")
	private static WebElement enter_Account_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_12_customize_popup_container']")
	private static WebElement enter_Account_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_12_customize_popup_footer']//input[1]")
	private static WebElement enter_Account_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_list']")
	private static WebElement enter_Account_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_header']")
	private static WebElement enter_Account_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_alignment']")
	private static WebElement enter_Account_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_width']")
	private static WebElement enter_Account_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement enter_Account_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement enter_Account_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_12_search_container']//input[2]")
	private static WebElement enter_Account_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement enter_Account_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement enter_Account_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_16']")
	private static WebElement enter_Amount;

	@FindBy(xpath = "//textarea[@id='id_body_16777219']")
	private static WebElement enter_Receipts_Remarks;

	@FindBy(xpath = "//textarea[@id='id_body_16777222']")
	private static WebElement enter_Payments_Remarks;

	@FindBy(xpath = "//textarea[@id='id_body_16777225']")
	private static WebElement enter_PettyCash_Remarks;

	@FindBy(xpath = "//textarea[@id='id_body_16777228']")
	private static WebElement enter_PostDatedReceipts_Remarks;

	@FindBy(xpath = "//textarea[@id='id_body_16777231']")
	private static WebElement enter_PostDatedPaymentss_Remarks;

	@FindBy(xpath = "//input[@id='id_body_23']")
	private static WebElement enter_ItemTxt;

	@FindBy(xpath = "//*[@id='id_body_23_input_image']/span")
	private static WebElement item_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_23_input_settings']/span")
	private static WebElement item_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_body_23_customize_popup_container']")
	private static WebElement item_Settings_Container;

	@FindBy(xpath = "//div[@id='id_body_23_customize_popup_footer']//input[1]")
	private static WebElement item_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_body_23_customize_popup_standardfields_list']")
	private static WebElement item_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_body_23_customize_popup_standardfields_header']")
	private static WebElement item_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_body_23_customize_popup_standardfields_alignment']")
	private static WebElement item_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_body_23_customize_popup_standardfields_width']")
	private static WebElement item_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement item_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement item_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_body_23_search_container']//input[2]")
	private static WebElement item_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement item_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement item_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_24']")
	private static WebElement enter_UnitTxt;

	@FindBy(xpath = "//*[@id='id_body_24_input_image']/span")
	private static WebElement unit_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_24_input_settings']/span")
	private static WebElement unit_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_body_24_customize_popup_container']")
	private static WebElement unit_Settings_Container;

	@FindBy(xpath = "//div[@id='id_body_24_customize_popup_footer']//input[1]")
	private static WebElement unit_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_body_24_customize_popup_standardfields_list']")
	private static WebElement unit_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_body_24_customize_popup_standardfields_header']")
	private static WebElement unit_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_body_24_customize_popup_standardfields_alignment']")
	private static WebElement unit_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_body_24_customize_popup_standardfields_width']")
	private static WebElement unit_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement unit_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement unit_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_body_24_search_container']//input[2]")
	private static WebElement unit_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement unit_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement unit_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_26']")
	private static WebElement enter_Quantity;

	@FindBy(xpath = "//input[@id='id_body_27']")
	private static WebElement enter_Rate;

	@FindBy(xpath = "//input[@id='id_body_28']")
	private static WebElement enter_Gross;

	@FindBy(xpath = "//input[@id='id_body_13']")
	private static WebElement enter_Batch;

	@FindBy(xpath = "//input[@id='id_body_12']")
	private static WebElement enter_DebitACTxt;

	@FindBy(xpath = "//*[@id='id_body_12_input_image']/span")
	private static WebElement enter_DebitAC_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_12_input_settings']/span")
	private static WebElement enter_DebitAC_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_12_customize_popup_container']")
	private static WebElement enter_DebitAC_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_12_customize_popup_footer']//input[1]")
	private static WebElement enter_DebitAC_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_list']")
	private static WebElement enter_DebitAC_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_header']")
	private static WebElement enter_DebitAC_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_12_customize_popup_standardfields_alignment']")
	private static WebElement enter_DebitAC_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_12_customize_popup_standardfields_width']")
	private static WebElement enter_DebitAC_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement enter_DebitAC_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement enter_DebitAC_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_12_search_container']//input[2]")
	private static WebElement enter_DebitAC_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement enter_DebitAC_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement enter_DebitAC_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_39']")
	private static WebElement enter_CreditACTxt;

	@FindBy(xpath = "//*[@id='id_body_39_input_image']/span")
	private static WebElement enter_CreditAC_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_39_input_settings']/span")
	private static WebElement enter_CreditAC_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_39_customize_popup_container']")
	private static WebElement enter_CreditAC_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_39_customize_popup_footer']//input[1]")
	private static WebElement enter_CreditAC_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_39_customize_popup_standardfields_list']")
	private static WebElement enter_CreditAC_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_39_customize_popup_standardfields_header']")
	private static WebElement enter_CreditAC_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_39_customize_popup_standardfields_alignment']")
	private static WebElement enter_CreditAC_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_39_customize_popup_standardfields_width']")
	private static WebElement enter_CreditAC_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement enter_CreditAC_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement enter_CreditAC_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_39_search_container']//input[2]")
	private static WebElement enter_CreditAC_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement enter_CreditAC_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement enter_CreditAC_Settings_CancelBtn;

	@FindBy(xpath = "//input[@id='id_body_18']")
	private static WebElement enter_DebitTxt;

	@FindBy(xpath = "//input[@id='id_body_19']")
	private static WebElement enter_CreditTxt;

	@FindBy(xpath = "//textarea[@id='id_body_16777241']")
	private static WebElement enter_NonStandardJournalEntries_RemarksTxt;

	@FindBy(xpath = "//input[@id='id_body_87']")
	private static WebElement enter_Warehouse2Txt;

	@FindBy(xpath = "//*[@id='id_body_87_input_image']/span")
	private static WebElement enter_Warehouse2_ExpansionBtn;

	@FindBy(xpath = "//*[@id='id_body_87_input_settings']/span")
	private static WebElement enter_Warehouse2_SettingsBtn;

	@FindBy(xpath = "//div[@id='id_header_87_customize_popup_container']")
	private static WebElement enter_WareHouse2_Settings_Container;

	@FindBy(xpath = "//div[@id='id_header_87_customize_popup_footer']//input[1]")
	private static WebElement enter_WareHouse2_Settings_StandardFieldsBtn;

	@FindBy(xpath = "//select[@id='id_header_87_customize_popup_standardfields_list']")
	private static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_Fielddropdown;

	@FindBy(xpath = "//input[@id='id_header_87_customize_popup_standardfields_header']")
	private static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_HeaderTxt;

	@FindBy(xpath = "//select[@id='id_header_87_customize_popup_standardfields_alignment']")
	private static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_Alignmentdropdown;

	@FindBy(xpath = "//input[@id='id_header_87_customize_popup_standardfields_width']")
	private static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_WidthTxt;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement enter_WareHouse2_Settings_StandardFieldsBtn_CancelBtn;

	@FindBy(xpath = "//div[@id='id_header_87_search_container']//input[2]")
	private static WebElement enter_WareHouse2_Settings_DeleteColumnBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[3]")
	private static WebElement enter_WareHouse2_Settings_OkBtn;

	@FindBy(xpath = "//div[contains(@class,'panel')]//input[4]")
	private static WebElement enter_WareHouse2_Settings_CancelBtn;

	@FindBy(xpath = "//*[@id='ISOCurrencyCode_input_image']/span")
	private static WebElement isoCurrencyCodeComboboxButton;
	
	@FindBy(xpath = "//input[@id='sFileName1']")
	private static WebElement extraFields_DocumentTab_FileName;

	@FindBy(xpath = "//input[@id='biDocument1']")
	private static WebElement extraFields_DocumentTab_Document;

	@FindBy(xpath = "//tr[1]//td[5]//div[1]//div[1]//div[1]")
	private static WebElement extraFields_DocumentTab_UploadDocument;

	@FindBy(xpath = "//a[@id='SaveImg']")
	private static WebElement extraFields_DocumentTab_SaveDocument;

	@FindBy(xpath = "//i[@class='fa fa-eraser RemoveImg']")
	private static WebElement extraFields_DocumentTab_DeleteDocument;

	@FindBy(xpath = "//input[@id='iFileSize1']")
	private static WebElement extraFields_DocumentTab_FileSize;

	// Right Panel InfoSide Bar
	@FindBy(xpath = "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
	private static WebElement infoSideBarCustomizeBtn;

	@FindBy(xpath = "//*[@id='id_transactionentry_infopanel_container']/div[1]/div[2]/span")
	private static WebElement customizeCloseBtn;

	@FindBy(xpath = "//div[@id='id_transactionentry_infopanel_customize_container']//li[@id='Dash_Save']")
	private static WebElement customizeSaveBtn;

	@FindBy(xpath = "//div[@id='id_transactionentry_infopanel_customize_container']//li[@id='Dash_Close']")
	private static WebElement customizeCancelBtn;

	@FindBy(xpath = "//input[@id='searchBoxTrans']")
	private static WebElement customizeSearchTxt;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@class='icon-search searchicon']")
	private static WebElement customizeSearchBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='g']")
	private static WebElement graphBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='Newgraph']")
	private static WebElement newGraphOption;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='r']")
	private static WebElement reportBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewReport']")
	private static WebElement newReportOption;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='i']")
	private static WebElement infoPanelBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewInfopanel']")
	private static WebElement newInfoPanelOption;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//i[@id='w']")
	private static WebElement workFlowBtn;

	@FindBy(xpath = "//div[@id='Dashboard_Graph_panelID_Trans']//li[@id='NewWorkflow']")
	private static WebElement newWorkFlowOption;

	@FindBy(xpath = "//a[@id='DocumentInfoOption']")
	private static WebElement otherDashlets;

	@FindBy(xpath = "//*[@id='id_Dashlet0']")
	private static WebElement documentInfo;

	@FindBy(xpath = "//span[contains(@class,'icon-left-and-right-panel-icon icon-font6 no_padding_left_right')]")
	private static WebElement infoSideBarMinimizeExpandBtn;

	@FindBy(xpath = "//span[@class='icon-left-and-right-panel-icon icon-font6 no_padding_left_right']")
	private static WebElement infoSideBarExpandBtn;

	// Footer Section
	@FindBy(xpath = "//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	private static WebElement netLabel;

	@FindBy(xpath = "//*[@id='id_transactionentry_footer_panel_summary_value_net']/span[2]")
	private static WebElement netAmount;

	// Login Page
	@FindBy(xpath = "//*[@id='txtUsername']")
	private static WebElement username;

	@FindBy(id = "txtPassword")
	private static WebElement password;

	@FindBy(id = "btnSignin")
	private static WebElement signIn;

	@FindBy(id = "ddlCompany")
	private static WebElement companyDropDownList;

	@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;

    
   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
	private static WebElement userNameDisplay;*/

	@FindBy(xpath = "//*[@id='companyLogo']")
	private static WebElement companyLogo;

	@FindBy(xpath = "//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

	@FindBy(xpath = "//*[@id='userprofile']/li/span[2]")
	private static WebElement logoutOption;

	@FindBy(xpath = "//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;

	@FindBy(xpath = "//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;

	    
	// Server Error Elements
	@FindBy(xpath = "//div[@id='id_focus_msgbox_main']")
	private static WebElement serverErrorPopup;

	@FindBy(xpath = "//div[@id='id_focus_msgbox_main']/div[2]/button")
	private static WebElement serverErrorClose;


	
	// Customize Master In Accounts Master Page
	@FindBy(xpath = "//a[@href='#HeaderDetails_0']")
	private static WebElement accountsCustomizeGeneralHeaderDetailsTab;

	@FindBy(xpath = "//a[@href='#HeaderDetails_1']")
	private static WebElement accountsCustomizeSettingsHeaderDetailsTab;

	@FindBy(xpath = "//a[@href='#BodyDetails_1']")
	private static WebElement accountsCustomizeSettingsBodyDetailsTab;

	@FindBy(xpath = "//a[@href='#HeaderDetails_2']")
	private static WebElement accountsCustomizeDetailsHeaderDetailsTab;

	@FindBy(xpath = "//a[@href='#BodyDetails_2']")
	private static WebElement accountsCustomizeDetailsBodyDetailsTab;

	@FindBy(xpath = "//a[@href='#HeaderDetails_3']")
	private static WebElement accountsCustomizePrintLayoutHeaderDetailsTab;

	@FindBy(xpath = "//a[@href='#BodyDetails_3']")
	private static WebElement accountsCustomizePrintLayoutBodyDetailsTab;

	@FindBy(xpath = "//a[@href='#HeaderDetails_4']")
	private static WebElement accountsCustomizeTreeTabHeaderDetailsTab;

	@FindBy(xpath = "//a[@href='#BodyDetails_4']")
	private static WebElement accountsCustomizeTreeTabBodyDetailsTab;

	@FindBy(xpath = "//a[@href='#HeaderDetails_5']")
	private static WebElement accountCustomizeDocumetTabHeaderDetailsTab;

	@FindBy(xpath = "//a[@href='#BodyDetails_5']")
	private static WebElement accountCustomizeDocumetTabBodyDetailsTab;

	@FindBy(xpath = "//a[@href='#HeaderDetails_6']")
	private static WebElement accountCustomizeCreateTabHeaderDetailsTab;

	@FindBy(xpath = "//a[@href='#BodyDetails_6']")
	private static WebElement accountCustomizeCreateTabBodyDetailsTab;

	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[9]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditNinethRowBtn;
	
	@FindBy(xpath = "//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[10]/td[1]/i[1]")
	private static WebElement accountSettingsHeaderEditTenthRowBtn;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li/a/div/div")
	private static List<WebElement> menusList;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li/a/span")
	private static List<WebElement> homeMenuList;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li/a/span")
	private static List<WebElement> mastersMenuList;
	
	@FindBy(xpath="//*[@id='ulCommonlyUsedRibbon']/li/span")
	private static List<WebElement> mastersRibbonControlList;
	
	@FindBy(xpath ="//*[@id='ulRibbonControl']/li/span")
	private static List<WebElement> ribbonControlExpandList;
	
	private static String xlfile;
	private static String resPass = "Pass";
	private static String resFail = "Fail";
	private static ExcelReader excelReader;
	private static boolean methodReturnStatus;
	private static String xlSheetName = "SmokeMasters";
	
	private static boolean statusOfValue;

  


   public boolean checkSignToCheckAccountsMastersPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
   {
     excelReader = new ExcelReader(POJOUtility.getExcelPath());
     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
   
     System.out.println("***************** checkSignInDemoPopupPageOnClickDoNotShowAndCloseToDisplayMenusAndHomePage Method Executes.............  *********************");
     
	 try
	 {
			 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	    	 
		 LoginPage lp = new LoginPage(getDriver());
		 
		 String unamelt =excelReader.getCellData(xlSheetName, 8, 6);
		 String pawslt  =excelReader.getCellData(xlSheetName, 8, 6);
		 
		 LoginPage.enterUserName(unamelt);
		 Thread.sleep(2000);
		 LoginPage.enterPassword(pawslt);
		 
		 LoginPage.clickOnSignInBtn();
		 
		 Thread.sleep(5000);
		
		 System.out.println("1");
		 
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
		 
		 System.out.println("2");
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		 companyLogo.click();
		 
		 System.out.println("3");
		 
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
		 
		 System.out.println("4");

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
   
   
 
   // This CheckValidationMessageIsEmpty Method Used in Page Class But Not To Call in Test Class
   
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
   
	   
	   
   public boolean checkOpenAccountsMastersPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	   excelReader = new ExcelReader(POJOUtility.getExcelPath());
	   xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	   System.out.println("********************* checkAccountsMastersPageOnClickOnAccountsMenuFromMastersMenu Method Executes.............   *****************************");
	
	   try
	   {
		   
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	       homeMenu.click();

	       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu)); 
	       mastersMenu.click();
	    	
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		   accounts.click();
		
		   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));
				
		   String actAccountsTitle         = accountsTitle.getText();
		   String expAccountsTitle         = "Account";
		  			
		   System.out.println("Accounts Masters Title Display Value Actual        : " + actAccountsTitle       + " Value Expected : " + expAccountsTitle);
		   
		   if (actAccountsTitle.equalsIgnoreCase(expAccountsTitle)) 
		   {
			   excelReader.setCellData(xlfile, xlSheetName, 16, 9, resPass);
			   return true;
		   } 
		   else 
		   {
			   excelReader.setCellData(xlfile, xlSheetName, 16, 9, resFail);
			   return false;
		   }
	   }
	   catch (Exception e) 
	   {
		   excelReader.setExceptionInExcel(xlfile, xlSheetName, 16, 10, e.getMessage());
		   System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		   return false;
	   } 
   }
	 
	
   
 
  
 
  public static boolean checkTreeViewOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 System.out.println("***********  checkTreeViewOptionsAvailableInAccountMastersPage Method Executes............ ********************");

	 try
	 {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));

		Select masterTreeIdDropdownSelect=new Select(masterTreeIdDropdown);
		String actmasterTreeIdDropdownText=masterTreeIdDropdownSelect.getFirstSelectedOption().getText();
		String expmasterTreeIdDropdownText=excelReader.getCellData(xlSheetName, 25, 7);
		
		Select masterTreeViewIDDropdownSelect=new Select(masterTreeViewIDDropdown);
		String actmasterTreeViewIDDropdownText=masterTreeViewIDDropdownSelect.getFirstSelectedOption().getText();
		String expmasterTreeViewIDDropdownText=excelReader.getCellData(xlSheetName, 26, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 25, 8, actmasterTreeIdDropdownText);
		excelReader.setCellData(xlfile, xlSheetName, 26, 8, actmasterTreeViewIDDropdownText);
		
		System.out.println("masterTreeIdDropdownText      : "+actmasterTreeIdDropdownText     +" Value Expected : "+expmasterTreeIdDropdownText);
		System.out.println("masterTreeViewIDDropdownText  : "+actmasterTreeViewIDDropdownText +" Value Expected : "+expmasterTreeViewIDDropdownText);
		
		if (actmasterTreeIdDropdownText.equalsIgnoreCase(expmasterTreeIdDropdownText)
				&& actmasterTreeViewIDDropdownText.equalsIgnoreCase(expmasterTreeViewIDDropdownText))
		{
			excelReader.setCellData(xlfile, xlSheetName, 24, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 24, 9, resFail);
			return false;
		}
	  }
	 catch (Exception e) 
	 {
		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 24, 10, e.getMessage());
		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 return false;
	 } 
  }
	
  
  @FindBy(xpath="//div[@id='divTreeMenu']/ul/li/ul//li/a[2]")
  private static List<WebElement> masterTreeViewList;

  public static boolean checkDisplayOfGroupAvailableTreeStructureLeftPaneInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 System.out.println("**************************  checkDisplayOfGroupAvailableInAccountMastersPage Method Executes............  *******************************");
     
	 try
	 {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));
		
		String actaccountRootAccount=accountRootAccount.getText();
		String expaccountRootAccount=excelReader.getCellData(xlSheetName, 28, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 28, 8, actaccountRootAccount);
		
		int masterTreeViewListCount=masterTreeViewList.size();
		
		ArrayList<String> actmasterTreeViewArray=new ArrayList<String>();
		
		for(int i=0;i<masterTreeViewListCount;i++)
		{
			String data=masterTreeViewList.get(i).getText();
			actmasterTreeViewArray.add(data);
		}
		
		String actmasterTreeViewList=actmasterTreeViewArray.toString();

		String expmasterTreeViewList=excelReader.getCellData(xlSheetName, 29, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 29, 8, actmasterTreeViewList);
	    	
		System.out.println("masterTreeViewList Actual   : "+actmasterTreeViewList);
		System.out.println("masterTreeViewList Expected : "+expmasterTreeViewList);
		System.out.println("accountRootAccount Actual   : "+actaccountRootAccount);
		System.out.println("accountRootAccount Expected : "+expaccountRootAccount);
		
		if (actaccountRootAccount.equalsIgnoreCase(expaccountRootAccount) && actmasterTreeViewList.equalsIgnoreCase(expmasterTreeViewList))
		{
			excelReader.setCellData(xlfile, xlSheetName, 27, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 27, 9, resFail);
			return false;
		}
	 }
	 catch (Exception e) 
	 {
		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 27, 10, e.getMessage());
		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 return false;
	 } 
  }
 
  @FindBy(xpath = "//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li/a")
  public static List<WebElement> masterTreeIDToggleList;
 
  public static boolean checkCreateTreeToggleOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	 System.out.println("********************* checkCreateTreeToggleOptionsAvailableInAccountMastersPage Method Executes............ *******************************");
     
	 try
	 {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggleBtn)); 
		masterTreeIDToggleBtn.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggle_setDefaultBtn));

		int masterTreeIDToggleListCount=masterTreeIDToggleList.size();
		
		ArrayList<String> actmasterTreeIDToggleListArray=new ArrayList<String>();
		
		for(int i=0;i<masterTreeIDToggleListCount;i++)
		{
			String data=masterTreeIDToggleList.get(i).getText();
			actmasterTreeIDToggleListArray.add(data);
		}
		
		String actmasterTreeIDToggleList=actmasterTreeIDToggleListArray.toString();

		String expmasterTreeIDToggleList=excelReader.getCellData(xlSheetName, 31, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 31, 8, actmasterTreeIDToggleList);
		
		System.out.println("masterTreeIDToggleList Actual   : "+actmasterTreeIDToggleList);
		System.out.println("masterTreeIDToggleList Expected : "+expmasterTreeIDToggleList);
		 
		if (actmasterTreeIDToggleList.equalsIgnoreCase(expmasterTreeIDToggleList))
		{
			excelReader.setCellData(xlfile, xlSheetName, 30, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 30, 9, resFail);
			return false;
		}
	 }
	 catch (Exception e) 
	 {
		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 30, 10, e.getMessage());
		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 return false;
	 } 
  }
 	
  
  @FindBy(xpath = "//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li/a")
  public static List<WebElement> masterViewIDToggleList;
  
  public static boolean checkCreateViewToggleOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 System.out.println("********************** checkCreateViewToggleOptionsAvailableInAccountMastersPage Method Executes............***********************************");

	 try
	 {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIDToggleBtn));
		masterTreeViewIDToggleBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIdCreateViewBtn));

		int masterViewIDToggleListCount=masterViewIDToggleList.size();
		
		ArrayList<String> actmasterViewIDToggleListArray=new ArrayList<String>();
		
		for(int i=0;i<masterViewIDToggleListCount;i++)
		{
			String data=masterViewIDToggleList.get(i).getText();
			actmasterViewIDToggleListArray.add(data);
		}
		
		String actmasterViewIDToggleList=actmasterViewIDToggleListArray.toString();

		String expmasterViewIDToggleList=excelReader.getCellData(xlSheetName, 33, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 33, 8, actmasterViewIDToggleList);
		
		System.out.println("masterViewIDToggleList Actual   : "+actmasterViewIDToggleList);
		System.out.println("masterViewIDToggleList Expected : "+expmasterViewIDToggleList);
		
		if(actmasterViewIDToggleList.equalsIgnoreCase(expmasterViewIDToggleList))
		{
			excelReader.setCellData(xlfile, xlSheetName, 32, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 32, 9, resFail);
			return false;
		}
	 }
	 catch (Exception e) 
	 {
		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 32, 10, e.getMessage());
		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 return false;
	 } 
  }
	
	
  public static boolean checkHideAccountGroupOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 System.out.println("********************* checkHideAccountGroupOptionsAvailableInAccountMastersPage Method Executes............*************************");

	 try
	 {
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
	   masterOptionToHideAccountsGroupTree.click();

	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeDisplayMenuAccountGroups));

	   boolean actAccountMasterTreeDisplayMenuAccountsGroup = masterTreeDisplayMenuAccountGroups.isDisplayed();
	   boolean expAccountMasterTreeDisplayMenuAccountsGroup = true;
	   
	   String actResult = Boolean.toString(actAccountMasterTreeDisplayMenuAccountsGroup);
	   
	   excelReader.setCellData(xlfile, xlSheetName, 34, 8, actResult.toUpperCase());
			
	   System.out.println("Tree View Create View Option Value Actual : " + actAccountMasterTreeDisplayMenuAccountsGroup+ " Value Expected : " + expAccountMasterTreeDisplayMenuAccountsGroup);

	   if (actAccountMasterTreeDisplayMenuAccountsGroup == expAccountMasterTreeDisplayMenuAccountsGroup)
	   {
			excelReader.setCellData(xlfile, xlSheetName, 34, 9, resPass);
			return true;
	   } 
	   else 
	   {
			excelReader.setCellData(xlfile, xlSheetName, 34, 9, resFail);
			return false;
	   }
	 }
	 catch (Exception e) 
	 {
		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 34, 10, e.getMessage());
		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 return false;
	 } 
  }
	
	
  public static boolean checkUnHideAccountGroupOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 System.out.println("********************** checkUnHideAccountGroupOptionsAvailableInAccountMastersPage Method Executes............ ******************************");

	 try
	 {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));
		masterOptionToHideAccountsGroupTree.click();

	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRootAccount));
		
		String actaccountRootAccount=accountRootAccount.getText();
		String expaccountRootAccount=excelReader.getCellData(xlSheetName, 36, 7);
		
		int masterTreeViewListCount=masterTreeViewList.size();
		
		ArrayList<String> actmasterTreeViewArray=new ArrayList<String>();
		
		for(int i=0;i<masterTreeViewListCount;i++)
		{
			String data=masterTreeViewList.get(i).getText();
			actmasterTreeViewArray.add(data);
		}
		
		String actmasterTreeViewList=actmasterTreeViewArray.toString();

		String expmasterTreeViewList=excelReader.getCellData(xlSheetName, 37, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 36, 8, actaccountRootAccount);
		excelReader.setCellData(xlfile, xlSheetName, 37, 8, actmasterTreeViewList);
	    	
		System.out.println("masterTreeViewList Actual   : "+actmasterTreeViewList);
		System.out.println("masterTreeViewList Expected : "+expmasterTreeViewList);
		System.out.println("accountRootAccount Actual   : "+actaccountRootAccount);
		System.out.println("accountRootAccount Expected : "+expaccountRootAccount);
		
		if (actaccountRootAccount.equalsIgnoreCase(expaccountRootAccount) && actmasterTreeViewList.equalsIgnoreCase(expmasterTreeViewList))
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
	 catch (Exception e) 
	 {
		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 35, 10, e.getMessage());
		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 return false;
	 } 
  }
	
  @FindBy(xpath="//*[@id='li_moveup']/div/div[1]/a")
  private static List<WebElement> searchControlList;
	
  public static boolean checkHeaderFieldsOptionsAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 System.out.println("********************** checkHeaderFieldsOptionsAvailableInAccountMastersPage Method Executes............ **********************************");

	 try
	 {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));

		boolean actAccountMasterSearchTxt                  = masterSearchTxt.isDisplayed();
		boolean actAccountMasterSearchBtn                  = masterSearchBtn.isDisplayed();
		boolean actAccountMasterCmbMasterTxt               = mastercmbMasterTxt.isDisplayed();
		boolean actAccountMasterCmbMasterExpansionBtn      = masterCmbMasterExpansionBtn.isDisplayed();
		boolean actAccountMasterCmbMasterSettingsBtn       = masterCumMasterSettingBtn.isDisplayed();
		boolean actAccountMasterNextBookMark               = masterMoveTheSelectionToNextBookMarkBtn.isDisplayed();
		boolean actAccountMasterPrviousBookMark            = masterMoveTheSelectionToPrevoiusBookmarkBtn.isDisplayed();
		boolean actAccountMasterShowAllRecordsBtn          = masterShowAllRecordsBtn.isDisplayed();
		boolean actAccountMasterShowAllUnAuthorisedRecords = masterShowAllUnauthorisedRecords.isDisplayed();
		boolean actAccountMasterShowAllClosedRecordsBtn    = masterShowAllClosedRecordsBtn.isDisplayed();
		boolean actAccountMasterAutoAdjustColumnBtn        = masterAutoAdjustColoumnsBtn.isDisplayed();
		boolean actAccountMasterRetainSelectionCheckbox    = masterRetainSelectionCheckBox.isDisplayed();
		boolean actAccountMasterSideBarBtn                 = masterSideBarBtn.isDisplayed();

		boolean expAccountMasterSearchTxt                  = true;
		boolean expAccountMasterSearchBtn                  = true;
		boolean expAccountMasterCmbMasterTxt               = true;
		boolean expAccountMasterCmbMasterExpansionBtn      = true;
		boolean expAccountMasterCmbMasterSettingsBtn       = true;
		boolean expAccountMasterNextBookMark               = true;
		boolean expAccountMasterPrviousBookMark            = true;
		boolean expAccountMasterShowAllRecordsBtn          = true;
		boolean expAccountMasterShowAllUnAuthorisedRecords = true;
		boolean expAccountMasterShowAllClosedRecordsBtn    = true;
		boolean expAccountMasterAutoAdjustColumnBtn        = true;
		boolean expAccountMasterRetainSelectionCheckbox    = true;
		boolean expAccountMasterSideBarBtn                 = true;
		
		boolean actMethod = actAccountMasterSearchTxt == 	expAccountMasterSearchTxt && actAccountMasterSearchBtn == expAccountMasterSearchBtn
							&& actAccountMasterCmbMasterTxt == expAccountMasterCmbMasterTxt 
							&& actAccountMasterCmbMasterExpansionBtn == expAccountMasterCmbMasterExpansionBtn
							&& actAccountMasterCmbMasterSettingsBtn == expAccountMasterCmbMasterSettingsBtn 
							&& actAccountMasterNextBookMark == expAccountMasterNextBookMark
							&& actAccountMasterPrviousBookMark == expAccountMasterPrviousBookMark
							&& actAccountMasterShowAllRecordsBtn == expAccountMasterShowAllRecordsBtn
							&& actAccountMasterShowAllUnAuthorisedRecords == expAccountMasterShowAllUnAuthorisedRecords
							&& actAccountMasterShowAllClosedRecordsBtn == expAccountMasterShowAllClosedRecordsBtn 
							&& actAccountMasterAutoAdjustColumnBtn == expAccountMasterAutoAdjustColumnBtn
							&& actAccountMasterRetainSelectionCheckbox == expAccountMasterRetainSelectionCheckbox 
							&& actAccountMasterSideBarBtn == expAccountMasterSideBarBtn;
		
		String actResult=Boolean.toString(actMethod);
		
		excelReader.setCellData(xlfile, xlSheetName, 38, 8, actResult.toUpperCase());
		
		int searchControlListCount=searchControlList.size();
		
		ArrayList<String> searchControlListArray=new ArrayList<String>();
		
		for(int i=0;i<searchControlListCount;i++)
		{
			String data=searchControlList.get(i).getAttribute("title");
			searchControlListArray.add(data);
		}
		
		String actsearchControlList=searchControlListArray.toString();

		String expsearchControlList=excelReader.getCellData(xlSheetName, 39, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 39, 8, actsearchControlList);

		System.out.println("Search Txt  Value Actual             : " + actAccountMasterSearchTxt                  + " Value Expected : " + expAccountMasterSearchTxt);
		System.out.println("Search Button Value Actual           : " + actAccountMasterSearchBtn                  + " Value Expected : " + expAccountMasterSearchBtn);
		System.out.println("Comb Box Value Actual                : " + actAccountMasterCmbMasterTxt               + " Value Expected : " + expAccountMasterCmbMasterTxt);
		System.out.println("Combo Box Expansion Value Actual     : " + actAccountMasterCmbMasterExpansionBtn      + " Value Expected : " + expAccountMasterCmbMasterExpansionBtn);
		System.out.println("Combo Box Settings Value Actual      : " + actAccountMasterCmbMasterSettingsBtn       + " Value Expected : " + expAccountMasterCmbMasterSettingsBtn);
		System.out.println("Next Book Mark Value Actual          : " + actAccountMasterNextBookMark               + " Value Expected : " + expAccountMasterNextBookMark);
		System.out.println("Previous Book Mark Value Actual      : " + actAccountMasterPrviousBookMark            + " Value Expected : " + expAccountMasterPrviousBookMark);
		System.out.println("Show All Records Value Actual        : " + actAccountMasterShowAllRecordsBtn          + " Value Expected : " + expAccountMasterShowAllRecordsBtn);
		System.out.println("Show All Un Authoize Value Actual    : " + actAccountMasterShowAllUnAuthorisedRecords + " Value Expected : " + expAccountMasterShowAllUnAuthorisedRecords);
		System.out.println("Show All Closed Value Actual         : " + actAccountMasterShowAllClosedRecordsBtn    + " Value Expected : " + expAccountMasterShowAllClosedRecordsBtn);
		System.out.println("Auto Adjust Column Value Actual      : " + actAccountMasterAutoAdjustColumnBtn        + " Value Expected : " + expAccountMasterAutoAdjustColumnBtn);
		System.out.println("Selection Check Box Value Actual     : " + actAccountMasterRetainSelectionCheckbox    + " Value Expected : " + expAccountMasterRetainSelectionCheckbox);
		System.out.println("Side Bar Value Actual                : " + actAccountMasterSideBarBtn                 + " Value Expected : " + expAccountMasterSideBarBtn);
		
		System.out.println("searchControlList Actual             : "+actsearchControlList);
		System.out.println("searchControlList Axpected           : "+expsearchControlList);
		
		if (actAccountMasterSearchTxt == expAccountMasterSearchTxt
				&& actAccountMasterSearchBtn == expAccountMasterSearchBtn
				&& actAccountMasterCmbMasterTxt == expAccountMasterCmbMasterTxt
				&& actAccountMasterCmbMasterExpansionBtn == expAccountMasterCmbMasterExpansionBtn
				&& actAccountMasterCmbMasterSettingsBtn == expAccountMasterCmbMasterSettingsBtn
				&& actAccountMasterNextBookMark == expAccountMasterNextBookMark
				&& actAccountMasterPrviousBookMark == expAccountMasterPrviousBookMark
				&& actAccountMasterShowAllRecordsBtn == expAccountMasterShowAllRecordsBtn
				&& actAccountMasterShowAllUnAuthorisedRecords == expAccountMasterShowAllUnAuthorisedRecords
				&& actAccountMasterShowAllClosedRecordsBtn == expAccountMasterShowAllClosedRecordsBtn
				&& actAccountMasterAutoAdjustColumnBtn == expAccountMasterAutoAdjustColumnBtn
				&& actAccountMasterRetainSelectionCheckbox == expAccountMasterRetainSelectionCheckbox
				&& actAccountMasterSideBarBtn == expAccountMasterSideBarBtn
				
				&& actsearchControlList.equalsIgnoreCase(expsearchControlList))
		{
			excelReader.setCellData(xlfile, xlSheetName, 38, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 38, 9, resFail);
			return false;
		}
	 }
	 catch (Exception e) 
	 {
		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 38, 10, e.getMessage());
		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 return false;
	 } 
  }
	
	
  @FindBy(xpath="//*[@id='btnSearchAcc']/ol/li/a")
  private static List<WebElement> searchOnOptions;
  
  public static boolean checkSearchOptionAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 System.out.println("*************************** checkSearchOptionAvailableInAccountMastersPage Method Executes............ ********************************");

	 try
	 {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));
		masterSearchBtn.click();

		int searchOnOptionsCount=searchOnOptions.size();
		
		ArrayList<String> searchOnOptionsArray = new ArrayList<String>();
		
		for(int i=0;i<searchOnOptionsCount;i++)
		{
			String data=searchOnOptions.get(i).getText();
			searchOnOptionsArray.add(data);
		}
		
		String actsearchOnOptions=searchOnOptionsArray.toString();
		
		String expsearchOnOptions=excelReader.getCellData(xlSheetName, 41, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 41, 8, actsearchOnOptions);

		System.out.println("searchOnOptions Actual   : "+actsearchOnOptions);
		System.out.println("searchOnOptions Expected : "+expsearchOnOptions);
		
		if (actsearchOnOptions.equalsIgnoreCase(expsearchOnOptions))
		{
			excelReader.setCellData(xlfile, xlSheetName, 40, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 40, 9, resFail);
			return false;
		}
	 }
	 catch (Exception e) 
	 {
		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 40, 10, e.getMessage());
		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 return false;
	 } 
  }
  
  
  @FindBy(xpath="//*[@id='landgridData']/thead/tr/th/span")
  private static List<WebElement> masterGridHeader;
	
  public static boolean checkAccountsDisplayTableColumnNamesAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 System.out.println("************************* checkAccountsDisplayTableColumnNamesAvailableInAccountMastersPage Method Executes............ *************************");
		
	 try
	 {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGrid_Header_SelectTxt));
		boolean actAccountMasterGridSelectTxt = masterGrid_Header_SelectTxt.isDisplayed();
		masterGrid_Header_SelectTxt.click();
		
		boolean actAccountMasterGridSelectAllChkbox = masterGridHeader_SelectAllRowsCheckBox.isDisplayed();

		boolean expAccountMasterGridSelectTxt       = true;
		boolean expAccountMasterGridSelectAllChkbox = true;
		
		int masterGridHeaderCount=masterGridHeader.size();
		
		ArrayList<String> masterGridHeaderArray=new ArrayList<String>();
		
		for (int i=1;i<masterGridHeaderCount;i++)
		{
			String data=masterGridHeader.get(i).getText();
			masterGridHeaderArray.add(data);
		}
		
		String actmasterGridHeader=masterGridHeaderArray.toString();
		
		String expmasterGridHeader=excelReader.getCellData(xlSheetName, 43, 7);
		
		
		boolean actMethod = actAccountMasterGridSelectTxt == expAccountMasterGridSelectTxt && actAccountMasterGridSelectAllChkbox == expAccountMasterGridSelectAllChkbox;
		
		String actResult = Boolean.toString(actMethod);
		
		excelReader.setCellData(xlfile, xlSheetName, 43, 8, actmasterGridHeader);
		excelReader.setCellData(xlfile, xlSheetName, 42, 8, actResult.toUpperCase());
		
		System.out.println("Grid Select txt Option Value Actual  : " + actAccountMasterGridSelectTxt       + " Value Expected : " + expAccountMasterGridSelectTxt);
		System.out.println("Grid Select All Option Value Actual  : " + actAccountMasterGridSelectAllChkbox + " Value Expected : " + expAccountMasterGridSelectAllChkbox);
		System.out.println("masterGridHeader Actual              : "+actmasterGridHeader);
		System.out.println("masterGridHeader Expected            : "+expmasterGridHeader);
		
		if (actMethod==true && actmasterGridHeader.equalsIgnoreCase(expmasterGridHeader))
		{
			excelReader.setCellData(xlfile, xlSheetName, 42, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 42, 9, resFail);
			return false;
		}
	 }
	 catch (Exception e) 
	 {
		 excelReader.setExceptionInExcel(xlfile, xlSheetName, 42, 10, e.getMessage());
		 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
		 return false;
	 } 
  }
  
  @FindBy(xpath="//*[@id='LandingGridBody']/tr")
  private static List<WebElement> masterGridBodyRowCount;
  
  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
  private static List<WebElement> masterGridBodyName;
  
  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
  private static List<WebElement> masterGridBodyCode;
  
  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[13]")
  private static List<WebElement> masterGridBodyAccountType;
  

	

  public static boolean checkAccountsDisplayTableColumnValuesAvailableInAccountMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
    excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
    System.out.println("********************** checkAccountsDisplayTableColumnValuesAvailableInAccountMastersPage Method Executes............ **************************");
	
    try
    {
    	int masterGridBodyListCount=masterGridBodyRowCount.size();
    	    	
    	ArrayList<String> masterGridBodyListArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterGridBodyListCount;i++)
    	{
    		String masterGridBodyNamedata        =masterGridBodyName.get(i).getText();
    		String masterGridBodyCodedata        =masterGridBodyCode.get(i).getText();
    		String masterGridBodyAccountTypedata =masterGridBodyAccountType.get(i).getText();
    		
    		
    		masterGridBodyListArray.add(masterGridBodyNamedata);
    		masterGridBodyListArray.add(masterGridBodyCodedata);
    		masterGridBodyListArray.add(masterGridBodyAccountTypedata);
    	}
    	
    	String actmasterGridBodyList=masterGridBodyListArray.toString();
    	
    	String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 45, 7);
    	
    	excelReader.setCellData(xlfile, xlSheetName, 45, 8, actmasterGridBodyList);
    	
    	System.out.println("masterGridBodyList Actual   : "+actmasterGridBodyList);
    	System.out.println("masterGridBodyList Expected : "+expmasterGridBodyList);
    	
    	if(actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList))
    	{
    		excelReader.setCellData(xlfile, xlSheetName, 44, 9, resPass);
    		return true;
    	} 
    	else 
    	{
    		excelReader.setCellData(xlfile, xlSheetName, 44, 9, resFail);
    		return false;
    	}
    }
    catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 44, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    } 
  }
	
  
  
  
  // NEW OPTION IN ACCOUNTS MASTERS PAGE
  
  @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[2]/div[1]/ul/li/div/div/a")
  private static List<WebElement> masterNewGridHeader;
  
  @FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button")
  private static List<WebElement> masterNewGridHeaderButtons;
  
  @FindBy(xpath="//*[@id='newMasterDiv0']/div/div/div[1]/label/a")
  private static List<WebElement> masterNewGeneralTabList;
  
  public static boolean checkAccountsCreationPageAndGeneralTabFieldsAvailabilityOnClickOnNewButtonInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {

	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("************ checkAccountsCreationPageAndGeneralTabFieldsAvailabilityOnClickOnNewButtonInAccountsMasterPage Method Executes............ **********");

	try
	{		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();
			
		int masterNewGridHeaderCount=masterNewGridHeader.size();
    	
    	ArrayList<String> masterNewGridHeaderArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterNewGridHeaderCount;i++)
    	{
    		String data=masterNewGridHeader.get(i).getText();
    		masterNewGridHeaderArray.add(data);
    	}
    	
    	String actmasterNewGridHeader=masterNewGridHeaderArray.toString();
    	
    	String expmasterNewGridHeader="[General, Settings, Details, Print Layout, Create Tab Update, ]";
    	
    	int masterNewGridHeaderButtonsCount=masterNewGridHeaderButtons.size();
    	
    	ArrayList<String> masterNewGridHeaderButtonsArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterNewGridHeaderButtonsCount;i++)
    	{
    		String data=masterNewGridHeaderButtons.get(i).getText();
    		masterNewGridHeaderButtonsArray.add(data);
    	}
    	
    	String actmasterNewGridHeaderButtons=masterNewGridHeaderButtonsArray.toString();
    	
    	String expmasterNewGridHeaderButtons=excelReader.getCellData(xlSheetName, 48, 7);
    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		
		int masterNewGeneralTabListCount=masterNewGeneralTabList.size();
    	
    	ArrayList<String> masterNewGeneralTabListArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterNewGeneralTabListCount;i++)
    	{
    		String data=masterNewGeneralTabList.get(i).getText();
    		masterNewGeneralTabListArray.add(data);
    	}
    	
    	String actmasterNewGeneralTabList=masterNewGeneralTabListArray.toString();
    	
    	String expmasterNewGeneralTabList=excelReader.getCellData(xlSheetName, 49, 7);
    	
    	ArrayList<String> accountTypeDropdownArray = new ArrayList<String>();
    	
		Select oSelect = new Select(accountTypeDropdown);
		
		List<WebElement> elementCount = oSelect.getOptions();

		int accAccountTypeSize = elementCount.size();
		
		for(int i=0;i<accAccountTypeSize;i++)
		{
			String data=oSelect.getOptions().get(i).getText();
			
			accountTypeDropdownArray.add(data);
			
		}
		
		String actaccountTypeDropdown = accountTypeDropdownArray.toString();
		String expaccountTypeDropdown = "[Cash, Bank, Sales, Purchases, Customer, Vendor, Customer/Vendor, Assets, Liabilities, Income, Expenses Group, Petty cash expenses, Travel & Entertainment  expenses, Selling expenses, Manufacturing expenses, TDS, Taxes payable, General & Administration, Depreciation & Amortization, Other expenses, Control, Cost, Treasury  stock, Short term investments, Revenues not producing working capital, Sinking fund payable, Sales returns & discounts, Property plant & Equipment, Project operation expense, Preferred dividends, Prospect, Inventory, Fixed Assets, lblTradingAccount, Cash/Petty Cash Account, Employee, Assets/Liabilities, Income / Expense, Trust Receipt Account]";
		
		System.out.println("accountTypeDropdown Actual   : " + actaccountTypeDropdown);
		System.out.println("accountTypeDropdown Expected : " + expaccountTypeDropdown);
		
		String actAccountTypeSize=Integer.toString(accAccountTypeSize);	
		String expAccountTypeSize = excelReader.getCellData(xlSheetName, 50, 7);
		
		
		System.out.println("Account Type Size Value Actual : " + actAccountTypeSize + " Value Expected : " + expAccountTypeSize);
		
		
		// Bank Account (GENERAL TAB)

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bankAccountTxt));
		bankAccountTxt.click();
		bankAccountTxt.sendKeys(Keys.SPACE);

		ArrayList<String> actbankAccountTxtValues = new ArrayList<String>();

		int count = bankAccountListCount.size();

		for (int i = 0; i < count; i++) 
		{
			String data = bankAccountListCount.get(i).getText();
			actbankAccountTxtValues.add(data);
		}

		String actbankAccountList = actbankAccountTxtValues.toString();
		
		String expbankAccountList = excelReader.getCellData(xlSheetName, 51, 7);
		
		// Pdc Account (GENERAL TAB)

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pdcDicountAccount));
		pdcDicountAccount.click();

		pdcDicountAccount.sendKeys(Keys.SPACE);

		ArrayList<String> actpdcDicountAccountValues = new ArrayList<String>();

		int pdccount = pdcAccountListCount.size();

		for (int i = 0; i < pdccount; i++) 
		{
			String data = pdcAccountListCount.get(i).getText();
			actpdcDicountAccountValues.add(data);
		}

		String actpdcDicountAccountlist = actpdcDicountAccountValues.toString();
		
		String exppdcDicountAccountlist = excelReader.getCellData(xlSheetName, 52, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 47, 8, actmasterNewGridHeader);
    	excelReader.setCellData(xlfile, xlSheetName, 48, 8, actmasterNewGridHeaderButtons);
    	excelReader.setCellData(xlfile, xlSheetName, 49, 8, actmasterNewGeneralTabList);
		excelReader.setCellData(xlfile, xlSheetName, 50, 8, actAccountTypeSize); 
		excelReader.setCellData(xlfile, xlSheetName, 51, 8, actbankAccountList); 
		excelReader.setCellData(xlfile, xlSheetName, 52, 8, actpdcDicountAccountlist); 
		
		System.out.println("masterNewGridHeader Actual          : "+actmasterNewGridHeader);
    	System.out.println("masterNewGridHeader Expected        : "+expmasterNewGridHeader);
    	System.out.println("masterNewGridHeaderButtons Actual   : "+actmasterNewGridHeaderButtons);
    	System.out.println("masterNewGridHeaderButtons Expected : "+expmasterNewGridHeaderButtons);
    	System.out.println("masterNewGeneralTabList Actual      : "+actmasterNewGeneralTabList);
    	System.out.println("masterNewGeneralTabList Expected    : "+expmasterNewGeneralTabList);
		System.out.println("AccountTypeSize Actual              : "+actAccountTypeSize);
		System.out.println("AccountTypeSize Expected            : "+expAccountTypeSize);
		System.out.println("bankAccountList  Actual             : "+actbankAccountList);
		System.out.println("bankAccountList Expected            : "+expbankAccountList);
		System.out.println("pdcDicountAccountlist Actual        : "+actpdcDicountAccountlist);
		System.out.println("pdcDicountAccountlist Expected      : "+exppdcDicountAccountlist);

		if (actmasterNewGridHeader.equalsIgnoreCase(expmasterNewGridHeader)
				&& actmasterNewGridHeaderButtons.equalsIgnoreCase(expmasterNewGridHeaderButtons) && actmasterNewGeneralTabList.equalsIgnoreCase(expmasterNewGeneralTabList)
				&& actAccountTypeSize.equalsIgnoreCase(expAccountTypeSize) && actbankAccountList.equalsIgnoreCase(expbankAccountList) 
				&& actpdcDicountAccountlist.equalsIgnoreCase(exppdcDicountAccountlist)
				
				
				&& actaccountTypeDropdown.equalsIgnoreCase(expaccountTypeDropdown))
		{
			excelReader.setCellData(xlfile, xlSheetName, 46, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 46, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 46, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    } 
  }
    
  @FindBy(xpath="//*[@id='newMasterDiv1']/div/div/div[1]/label/a")
  private static List<WebElement> masterNewSettingsTabList;
  
  
  public static boolean checkSettingTabFieldsAvailabilityOnClickOnSettingsTabInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("************************ checkClickOnSettingsTabInAccountsMasterCreationPage Method Executes............  *********************************");
	////Thread.sleep(2000);

	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAccountSettingTab));
		headerAccountSettingTab.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitCreditProposalDropdown));
		
		int masterNewSettingsTabListCount=masterNewSettingsTabList.size();
    	
    	ArrayList<String> masterNewSettingsTabListArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterNewSettingsTabListCount;i++)
    	{
    		String data=masterNewSettingsTabList.get(i).getText();
    		masterNewSettingsTabListArray.add(data);
    	}
    	
    	String actmasterNewSettingsTabList=masterNewSettingsTabListArray.toString();
    	
    	String expmasterNewSettingsTabList=excelReader.getCellData(xlSheetName, 54, 7);
    	
    	// EXCHANGE ADJUSTMENT GAIN ACCOUNT
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeAdjustmentGainACTxt));
		exchangeAdjustmentGainACTxt.click();
		exchangeAdjustmentGainACTxt.sendKeys(Keys.SPACE);
	
		ArrayList<String> actexchangeAdjustmentGainACValues = new ArrayList<String>();
	
	
		int exgGaincount = exgGainListCount.size();
	
		for (int i = 0; i < exgGaincount; i++) 
		{
			String data = exgGainListCount.get(i).getText();
			actexchangeAdjustmentGainACValues.add(data);
		}	
	
		String actexchangeAdjustmentGainACListValues = actexchangeAdjustmentGainACValues.toString();
		
		String expexchangeAdjustmentGainACListValues = excelReader.getCellData(xlSheetName, 55, 7);
    	
		// EXCHANGE ADJUSTMENT LOSS
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exchangeAdjustmentLossACTxt));
		exchangeAdjustmentLossACTxt.click();
		exchangeAdjustmentLossACTxt.sendKeys(Keys.SPACE);
	
		ArrayList<String> actexchangeAdjustmentLossACValues = new ArrayList<String>();
	
		int exgLosscount = exgLossListCount.size();
	
		for (int i = 0; i < exgLosscount; i++) 
		{
			String data = exgLossListCount.get(i).getText();
			actexchangeAdjustmentLossACValues.add(data);
		}
	
		String actexchangeAdjustmentLossACListValues = actexchangeAdjustmentLossACValues.toString();
		
		String expexchangeAdjustmentLossACListValues = excelReader.getCellData(xlSheetName, 56, 7);
    	
		// PRIMARY ACCOUNT
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(primaryAccountTxt));
		primaryAccountTxt.click();
		primaryAccountTxt.sendKeys(Keys.SPACE);
	
		ArrayList<String> actPrimaryACValues = new ArrayList<String>();
	
		int primaryAccountcount = primaryAccountListCount.size();
	
		for (int i = 0; i < primaryAccountcount; i++)
		{
			String data = primaryAccountListCount.get(i).getText();
			actPrimaryACValues.add(data);
		}
	
		String actPrimaryACListValues = actPrimaryACValues.toString();
		
		String expPrimaryACListValues = excelReader.getCellData(xlSheetName, 57, 7);
	    	
		primaryAccountTxt.sendKeys(Keys.TAB);
	
		// DEFAULT CURRENCY

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(defaultCurrencyTxt));
		defaultCurrencyTxt.click();
		defaultCurrencyTxt.sendKeys(Keys.SPACE);
	
		ArrayList<String> actdefaultCurrencyValues = new ArrayList<String>();

		int defaultCurrencycountcount = defaultCurrencyListCount.size();
	
		for (int i = 0; i < defaultCurrencycountcount; i++) 
		{
			String data = defaultCurrencyListCount.get(i).getText();
			actdefaultCurrencyValues.add(data);
		}
	
		String actdefaultCurrencyListValues = actdefaultCurrencyValues.toString();
		String expdefaultCurrencyListValues = excelReader.getCellData(xlSheetName, 58, 7);
    	
		// REMINDER TERMS
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reminderTermsTxt));
		reminderTermsTxt.click();
	
		reminderTermsTxt.sendKeys(Keys.SPACE);
	
		boolean actreminderTermsEmptyList = reminderTermsEmptyList.getText().isEmpty();
		boolean expreminderTermsEmptyList = true;
		
		// FINANCE CHARGE TERMS
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financeChargeTermsTxt));
		financeChargeTermsTxt.click();
		financeChargeTermsTxt.sendKeys(Keys.SPACE);
	
		boolean actfinanceChargeTermsEmptyList = financeChargeTermsEmptyList.getText().isEmpty();
		boolean expfinanceChargeTermsEmptyList = true;
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reminderTermsTxt));
		reminderTermsTxt.click();
		
		// PAYMENT TERMS
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(paymentTermstxt));
		paymentTermstxt.click();
		paymentTermstxt.sendKeys(Keys.SPACE);
	
		boolean actpaymentTermsEmptyList = paymentTermsEmptyList.getText().isEmpty();
		boolean exppaymentTermsEmptyList = true;
	
		boolean actmethod=actpaymentTermsEmptyList==exppaymentTermsEmptyList && actfinanceChargeTermsEmptyList==expfinanceChargeTermsEmptyList &&
						  actreminderTermsEmptyList==expreminderTermsEmptyList;
		
		String actResult=Boolean.toString(actmethod);
		
		excelReader.setCellData(xlfile, xlSheetName, 54, 8, actmasterNewSettingsTabList);
    	excelReader.setCellData(xlfile, xlSheetName, 55, 8, actexchangeAdjustmentGainACListValues);
    	excelReader.setCellData(xlfile, xlSheetName, 56, 8, actexchangeAdjustmentLossACListValues);
		excelReader.setCellData(xlfile, xlSheetName, 57, 8, actPrimaryACListValues); 
		excelReader.setCellData(xlfile, xlSheetName, 58, 8, actdefaultCurrencyListValues);
		excelReader.setCellData(xlfile, xlSheetName, 53, 8, actResult.toUpperCase());
		
		System.err.println("Reminder Terms Combo Box Value Actual       : " + actreminderTermsEmptyList      + "  Value Expected : " + expreminderTermsEmptyList);
		System.err.println("Finance Chagre Terms Combo Box Value Actual : " + actfinanceChargeTermsEmptyList + "  Value Expected : " + expfinanceChargeTermsEmptyList);
		System.err.println("Payment Terms Combo Box Value Actual        : " + actpaymentTermsEmptyList       + "  Value Expected : " + exppaymentTermsEmptyList);
		System.out.println("masterNewSettingsTabList Actual             : " +actmasterNewSettingsTabList);
    	System.out.println("masterNewSettingsTabList Expected           : " +expmasterNewSettingsTabList);
    	System.out.println("exchangeAdjustmentGainACListValues Actual   : " +actexchangeAdjustmentGainACListValues);
    	System.out.println("exchangeAdjustmentGainACListValues Expected : " +expexchangeAdjustmentGainACListValues);
    	System.out.println("exchangeAdjustmentLossACListValues Actual   : " +actexchangeAdjustmentLossACListValues);
    	System.out.println("exchangeAdjustmentLossACListValues Expected : " +expexchangeAdjustmentLossACListValues);
		System.out.println("PrimaryACListValues Actual                  : " +actPrimaryACListValues);
		System.out.println("PrimaryACListValues Expected                : " +expPrimaryACListValues);
		System.out.println("defaultCurrencyListValues Actual            : " +actdefaultCurrencyListValues);
		System.out.println("defaultCurrencyListValues Expected          : " +expdefaultCurrencyListValues);
	
		if(actmasterNewSettingsTabList.equalsIgnoreCase(expmasterNewSettingsTabList)
				&& actexchangeAdjustmentGainACListValues.equalsIgnoreCase(expexchangeAdjustmentGainACListValues)
				&& actexchangeAdjustmentLossACListValues.equalsIgnoreCase(expexchangeAdjustmentLossACListValues)
				&& actPrimaryACListValues.equalsIgnoreCase(expPrimaryACListValues) && actdefaultCurrencyListValues.equalsIgnoreCase(expdefaultCurrencyListValues)
				&& actmethod==true)
		{
			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resFail);
			return false;
	    }
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 53, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    } 
  }
  
 
  @FindBy(xpath="//*[@id='newMasterDiv2']/div/div/div[1]/label/a")
  private static List<WebElement> masterNewDetailsTabList;
  
  public static boolean checkDetailsTabFieldsAvailabilityOnClickOnDetailsTabInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {

	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("************** checkDetailsTabFieldsAvailabilityOnClickOnDetailsTabInAccountsMasterCreationPage Method Executes............ *****************");
    
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsTab));
		headerDetailsTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addressTxt));

		int masterNewDetailsTabListCount=masterNewDetailsTabList.size();
    	
    	ArrayList<String> masterNewDetailsTabListArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterNewDetailsTabListCount;i++)
    	{
    		String data=masterNewDetailsTabList.get(i).getText();
    		masterNewDetailsTabListArray.add(data);
    	}
    	
    	String actmasterNewDetailsTabList=masterNewDetailsTabListArray.toString();
    	
    	String expmasterNewDetailsTabList=excelReader.getCellData(xlSheetName, 60, 7);
    	
    	excelReader.setCellData(xlfile, xlSheetName, 60, 8, actmasterNewDetailsTabList); 
    	
		// CITY 1
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cityTxt));
		cityTxt.click();
		cityTxt.sendKeys(Keys.SPACE);
	
		boolean actcity1EmptyList                        = city1EmptyList.getText().isEmpty();
		boolean expcity1EmptyList                        = true;
	
		// CITY 2
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(city2Text));
		city2Text.click();
		city2Text.sendKeys(Keys.SPACE);
	
		boolean actcity2EmptyList                       = city2EmptyList.getText().isEmpty();
		boolean expcity2EmptyList                       = true;
		
		boolean actmethod=actcity1EmptyList==expcity1EmptyList && actcity2EmptyList==expcity2EmptyList;

		String actResult=Boolean.toString(actmethod);

		excelReader.setCellData(xlfile, xlSheetName, 59, 8, actResult.toUpperCase());

		System.err.println("City 1 Value Actual              : " + actcity1EmptyList + " Value Expected : " + expcity1EmptyList);
		System.err.println("City 2 Value Actual              : " + actcity2EmptyList + " Value Expected : " + expcity2EmptyList);
		System.out.println("masterNewDetailsTabList Actual   : "+actmasterNewDetailsTabList);
    	System.out.println("masterNewDetailsTabList Expected : "+expmasterNewDetailsTabList);
	
		if (actmasterNewDetailsTabList.equalsIgnoreCase(expmasterNewDetailsTabList)
				&& actmethod==true)
		{
			excelReader.setCellData(xlfile, xlSheetName, 59, 9, resPass);
			return true;
		}
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 59, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 59, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    } 
  }
  
  
  @FindBy(xpath="//*[@id='tblNewMasterGenerator']/thead/tr/th/label")
  private static List<WebElement> masterNewprintLayoutTabList;
  

  public static boolean checkPrintLayoutTabFieldsAvailabilityOnClickOnPrintLayoutTabInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("*************** checkPrintLayoutTabFieldsAvailabilityOnClickOnPrintLayoutTabInAccountsMasterCreationPage Method Executes............ *****************");

	try
	{		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerPrintLayoutTab));
		headerPrintLayoutTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridVoucherTypeTxt));
		
		int masterNewprintLayoutTabListCount=masterNewprintLayoutTabList.size();
    	
    	ArrayList<String> masterNewprintLayoutTabListArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterNewprintLayoutTabListCount;i++)
    	{
    		String data=masterNewprintLayoutTabList.get(i).getText();
    		masterNewprintLayoutTabListArray.add(data);
    	}
    	
    	String actmasterNewprintLayoutTabList=masterNewprintLayoutTabListArray.toString();
    	
    	String expmasterNewprintLayoutTabList=excelReader.getCellData(xlSheetName, 62, 7);
    	
    	excelReader.setCellData(xlfile, xlSheetName, 62, 8, actmasterNewprintLayoutTabList); 
    	
    	System.out.println("masterNewprintLayoutTabList Actual   : "+actmasterNewprintLayoutTabList);
    	System.out.println("masterNewprintLayoutTabList Expected : "+expmasterNewprintLayoutTabList);

		if(actmasterNewprintLayoutTabList.equalsIgnoreCase(expmasterNewprintLayoutTabList)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 61, 9, resPass);
			return true;
		}
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 61, 9, resFail);
			return false;
		}
	}  
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 61, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    } 
  }
  
  public static boolean checkCreateTabUpdateTabFieldsAvailabilityInAccountsMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("*************** checkCreateTabUpdateTabFieldsAvailabilityInAccountsMasterCreationPage Method Executes............ *****************");

	try
	{			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerCreatetabUpdateTab));
		headerCreatetabUpdateTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldCreateUpdateTab));
	    boolean actExtraFieldInCreateTab = extraFieldCreateUpdateTab.isDisplayed();
	    boolean expExtraFieldInCreateTab = true;
		
    	System.out.println("masterNewprintLayoutTabList Actual   : "+actExtraFieldInCreateTab);
    	System.out.println("masterNewprintLayoutTabList Expected : "+expExtraFieldInCreateTab);

		if(actExtraFieldInCreateTab==expExtraFieldInCreateTab) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 61, 9, resPass);
			return true;
		}
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 61, 9, resFail);
			return false;
		}
	}  
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 61, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    } 
  }
  
    
  public static boolean checkAccountSaveOnInputAndClickOnSaveButtonInMasterCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("********************* checkAccountSaveOnInputAndClickOnSaveButtonInMasterCreationPage Method Executes............ *******************************");
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
		headerGeneralTab.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 71, 6));
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 72, 6));
	    codeTxt.sendKeys(Keys.TAB);
      
	    Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 73, 6));
		accountTypeDropdown.sendKeys(Keys.TAB);
		////Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
		creditLimitTxt.sendKeys(excelReader.getCellData(xlSheetName, 74, 6));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
		creditLimitTxt.sendKeys(Keys.TAB);
		////Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditdaysTxt));
		creditdaysTxt.sendKeys(excelReader.getCellData(xlSheetName, 75, 6));
		creditdaysTxt.sendKeys(Keys.TAB);
		////Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(chequeDiscountLimitTxt));
		chequeDiscountLimitTxt.sendKeys(excelReader.getCellData(xlSheetName, 76, 6));
		chequeDiscountLimitTxt.sendKeys(Keys.TAB);
		////Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateofinterestTxt));
		rateofinterestTxt.sendKeys(excelReader.getCellData(xlSheetName, 77, 6));
		nameTxt.click();

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerCreatetabUpdateTab));
		headerCreatetabUpdateTab.click();
		
		
		extraFieldCreateUpdateTab.click();
		extraFieldCreateUpdateTab.sendKeys("Extra Field Update");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		String expSaveMessage = excelReader.getCellData(xlSheetName, 72, 7);	
		boolean actSaveAccountMessage = checkValidationMessageboolean(expSaveMessage);
		boolean expSaveAccountMessage = true;
		
		String actResult = Boolean.toString(actSaveAccountMessage);

		System.out.println("Click on Save With Valid Information Value Actual : " + actSaveAccountMessage + "  Value Expected : " + expSaveAccountMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 71, 8, actResult.toUpperCase());

		if (actSaveAccountMessage==expSaveAccountMessage) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 71, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 71, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 71, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    } 
 }
  
  
  
  public static boolean checkCloseAccountsCreationPageOnClickOnCloseButtonInAccountsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {

	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("******************* checkCloseAccountsCreationPageOnClickOnCloseButtonInAccountsCreationPage Method Executes............ ************************");

	try
	{
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
	 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCreationNameOfLane1));
		 
		 int masterGridBodyListCount=masterGridBodyRowCount.size();
	    	
	    	
		 ArrayList<String> masterGridBodyListArray = new ArrayList<String>();
		 
		 for (int i=0;i<masterGridBodyListCount;i++)
		 {
			 String masterGridBodyNamedata        =masterGridBodyName.get(i).getText();
			 String masterGridBodyCodedata        =masterGridBodyCode.get(i).getText();
			 String masterGridBodyAccountTypedata =masterGridBodyAccountType.get(i).getText();
			 
			 
			 masterGridBodyListArray.add(masterGridBodyNamedata);
			 masterGridBodyListArray.add(masterGridBodyCodedata);
			 masterGridBodyListArray.add(masterGridBodyAccountTypedata);
		 }	
	    	
		 String actmasterGridBodyList=masterGridBodyListArray.toString();
		 
		 String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 80, 7);
		 
		 excelReader.setCellData(xlfile, xlSheetName, 80, 8, actmasterGridBodyList);
		 
		 System.out.println("masterGridBodyList Actual   : "+actmasterGridBodyList);
		 System.out.println("masterGridBodyList Expected : "+expmasterGridBodyList);
	    	
	     if(actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList))
		{
			excelReader.setCellData(xlfile, xlSheetName, 79, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 79, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 79, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    } 
 }

  @FindBy(xpath = "/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[8]/div[1]/label/input")
  public static WebElement firstRowSelect;
  
  //Editing the Account in the Accounts Master
  public static boolean checkClickOnAccountSavedCheckBoxToCheckInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("******************** checkAccountMasterSavedInfomationDetailsOnClickOnEditInAccountsMasterPage Method Executes............  ********************");
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBox));
		accountFirstCheckBox.click();
		
		boolean actSelectedMasterSearchCheckbox = firstRowSelect.isSelected();
		boolean expSelectedMasterSearchCheckbox = true;
		
		String actResult = Boolean.toString(actSelectedMasterSearchCheckbox);
		
		excelReader.setCellData(xlfile, xlSheetName, 81, 8, actResult.toUpperCase());

		System.out.println("Account Name Check as Checked Value Actual           :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);

		if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 81, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 81, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 81, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    } 
  }
  
  
  //Editing the Account in the Accounts Master
  public static boolean checkAccountMasterSavedInfomationDetailsOnClickOnEditInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("******************** checkAccountMasterSavedInfomationDetailsOnClickOnEditInAccountsMasterPage Method Executes............  ********************");
	
	try
	{		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		masterEditBtn.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		Select oSelect                           = new Select(accountTypeDropdown);
		String actAccountMasterType              = oSelect.getFirstSelectedOption().getText();

		String actAccountMasterName              = nameTxt.getAttribute("value");
		String actAccountMasteCode               = codeTxt.getAttribute("value");

		codeTxt.click();
		codeTxt.sendKeys(Keys.TAB);

		String actAccountMasterCreditLimit       = creditLimitTxt.getAttribute("value");
		String actAccountMasterCreditDays        = creditdaysTxt.getAttribute("value");
		String actAccountMasterChequeDiscount    = chequeDiscountLimitTxt.getAttribute("value");
		String actAccountMasterRateOfInterest    = rateofinterestTxt.getAttribute("value");


		String expAccountMasterName              = excelReader.getCellData(xlSheetName, 83, 7);
		String expAccountMasteCode               = excelReader.getCellData(xlSheetName, 84, 7);
		String expAccountMasterType              = excelReader.getCellData(xlSheetName, 85, 7);
		String expAccountMasterCreditLimit       = excelReader.getCellData(xlSheetName, 86, 7);
		String expAccountMasterCreditDays        = excelReader.getCellData(xlSheetName, 87, 7);
		String expAccountMasterChequeDiscount    = excelReader.getCellData(xlSheetName, 88, 7);
		String expAccountMasterRateOfInterest    = excelReader.getCellData(xlSheetName, 89, 7);
		//String expAccountMasterExtraFieldUpdate  = excelReader.getCellData(xlSheetName, 90, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 83, 8, actAccountMasterName);
		excelReader.setCellData(xlfile, xlSheetName, 84, 8, actAccountMasteCode);
		excelReader.setCellData(xlfile, xlSheetName, 85, 8, actAccountMasterType);
		excelReader.setCellData(xlfile, xlSheetName, 86, 8, actAccountMasterCreditLimit);
		excelReader.setCellData(xlfile, xlSheetName, 87, 8, actAccountMasterCreditDays);
		excelReader.setCellData(xlfile, xlSheetName, 88, 8, actAccountMasterChequeDiscount);
		excelReader.setCellData(xlfile, xlSheetName, 89, 8, actAccountMasterRateOfInterest);
		//excelReader.setCellData(xlfile, xlSheetName, 90, 8, actAccountMasterExtraFieldUpdate);

		System.out.println("Edit Name Value Actual                : " + actAccountMasterName+             " Value Expected : " + expAccountMasterName);
		System.out.println("Edit Code Value Actual                : " + actAccountMasteCode+              " Value Expected : " + expAccountMasteCode);
		System.out.println("Edit Type Value Actual                : " + actAccountMasterType+             " Value Expected : " + expAccountMasterType);
		System.out.println("Edit Credit Limit Value Actual        : " + actAccountMasterCreditLimit+      " Value Expected : " + expAccountMasterCreditLimit);
		System.out.println("Edit Credit Days Value Actual         : " + actAccountMasterCreditDays+       " Value Expected : " + expAccountMasterCreditDays);
        System.out.println("Edit Cheque Discount Value Actual     : " + actAccountMasterChequeDiscount+   " Value Expected : " + expAccountMasterChequeDiscount);
		System.out.println("Edit Rate Of Interest Value Actual    : " + actAccountMasterRateOfInterest+   " Value Expected : " + expAccountMasterRateOfInterest);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerCreatetabUpdateTab));
		headerCreatetabUpdateTab.click();
		
        Thread.sleep(2000);

        String actExtraFieldUpdateValue =extraFieldCreateUpdateTab.getAttribute("value");
		String expExtraFieldUpdateValue ="Extra File Update";
		System.out.println("Edit Extra Field Update Value Actual                : " + actExtraFieldUpdateValue+              " Value Expected : " + expExtraFieldUpdateValue);
		
				

		if (actAccountMasterName.equalsIgnoreCase(expAccountMasterName)
				&& actAccountMasteCode.equalsIgnoreCase(expAccountMasteCode)
				&& actAccountMasterType.equalsIgnoreCase(expAccountMasterType)
				&& actAccountMasterCreditLimit.equalsIgnoreCase(expAccountMasterCreditLimit)
				&& actAccountMasterCreditDays.equalsIgnoreCase(expAccountMasterCreditDays)
				&& actAccountMasterChequeDiscount.equalsIgnoreCase(expAccountMasterChequeDiscount)
				&& actAccountMasterRateOfInterest.equalsIgnoreCase(expAccountMasterRateOfInterest)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 82, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 82, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 82, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    }
  }
  
 
  public static boolean checkUpdatingAccountInformationOnClickSaveButtonInAccountsCreationPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("*************** checkUpdatingAccountInformationOnClickSaveButtonInAccountsCreationPage Method Executes............ *********************");
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
		headerGeneralTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 91, 6));
		nameTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.click();
		codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 92, 6));
	    codeTxt.sendKeys(Keys.TAB);
      
	    //Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 93, 6));
		accountTypeDropdown.sendKeys(Keys.TAB);
		////Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
		creditLimitTxt.sendKeys(excelReader.getCellData(xlSheetName, 94, 6));

		getAction().moveToElement(creditLimitTxt).sendKeys(Keys.TAB).perform();
		////Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditdaysTxt));
		creditdaysTxt.sendKeys(excelReader.getCellData(xlSheetName, 95, 6));
		creditdaysTxt.sendKeys(Keys.TAB);
		////Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(chequeDiscountLimitTxt));
		chequeDiscountLimitTxt.sendKeys(excelReader.getCellData(xlSheetName, 96, 6));
		chequeDiscountLimitTxt.sendKeys(Keys.TAB);
		////Thread.sleep(3000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateofinterestTxt));
		rateofinterestTxt.sendKeys(excelReader.getCellData(xlSheetName, 97, 6));

		nameTxt.click();
	
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerCreatetabUpdateTab));
		headerCreatetabUpdateTab.click();
	/*	
		String actGetTxtOfCreateTab = headerCreatetabUpdateTab.getText();
	    String expGetTxtOfCreateTab ="CreateTab";*/
		
		Thread.sleep(2000);
		extraFieldCreateUpdateTab.sendKeys("CreateTab");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();

		
		String expSaveMessage = excelReader.getCellData(xlSheetName, 92, 7);
		
		boolean actMessageOnUpdateAccount=checkValidationMessageboolean(expSaveMessage);
        boolean expMessageOnUpdateAccount=true;
        
        String actResult = Boolean .toString(actMessageOnUpdateAccount);
        
        excelReader.setCellData(xlfile, xlSheetName, 91, 8, actResult.toUpperCase());
			
		System.out.println("Click on Save With Valid Information Value Actual  : " + actMessageOnUpdateAccount + "  Value Expected : " + expMessageOnUpdateAccount);

		if (actMessageOnUpdateAccount==expMessageOnUpdateAccount) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 91, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 91, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 91, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    }
 }
  
  
  public static boolean checkAccountUpdatedInformationDisplayInMasterDisplayTableOfMastersPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("*************** checkAccountUpdatedInformationDisplayInMasterDisplayTableOfMastersPage Method Executes............ *************************");
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationNameOfLane1));

		int masterGridBodyListCount=masterGridBodyRowCount.size();
    	
    	
    	ArrayList<String> masterGridBodyListArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterGridBodyListCount;i++)
    	{
    		String masterGridBodyNamedata        =masterGridBodyName.get(i).getText();
    		String masterGridBodyCodedata        =masterGridBodyCode.get(i).getText();
    		String masterGridBodyAccountTypedata =masterGridBodyAccountType.get(i).getText();
    		
    		
    		masterGridBodyListArray.add(masterGridBodyNamedata);
    		masterGridBodyListArray.add(masterGridBodyCodedata);
    		masterGridBodyListArray.add(masterGridBodyAccountTypedata);
    	}
    	
    	String actmasterGridBodyList=masterGridBodyListArray.toString();
		 
		String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 100, 7);
		 
		excelReader.setCellData(xlfile, xlSheetName, 100, 8, actmasterGridBodyList);
	
		boolean actSelectedMasterSearchCheckbox = firstRowSelect.isSelected();
		boolean expSelectedMasterSearchCheckbox = true;
		
		String actResult = Boolean.toString(actSelectedMasterSearchCheckbox);
		
		excelReader.setCellData(xlfile, xlSheetName, 99, 8, actResult.toUpperCase());

		System.out.println("masterGridBodyList Actual   : "+actmasterGridBodyList);
		System.out.println("masterGridBodyList Expected : "+expmasterGridBodyList);
		System.out.println("Account Master Update, Account Check box as Check Value Actual :" + actSelectedMasterSearchCheckbox+ "Value Expected : " + expSelectedMasterSearchCheckbox);
		
		
		if (actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 99, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 99, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 99, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    }
 }
  
  
  //Editing the Account in the Accounts Master
  public static boolean checkClickOnSavedAccountCheckBoxToUnCheckInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("******************** checkAccountMasterSavedInfomationDetailsOnClickOnEditInAccountsMasterPage Method Executes............  ********************");
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBox));
		accountFirstCheckBox.click();
		
		boolean actSelectedMasterSearchCheckbox = firstRowSelect.isSelected();
		boolean expSelectedMasterSearchCheckbox = false;

		System.out.println("Account Name Check as Un Checked Value Actual :" + actSelectedMasterSearchCheckbox+ "     Value Expected : " + expSelectedMasterSearchCheckbox);
			
		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
		boolean expSummaryErrorMessage  = true;
		
		String actResult = Boolean.toString(actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox);
		
		excelReader.setCellData(xlfile, xlSheetName, 101, 8, actResult.toUpperCase());
		
		System.out.println("Click on Check Box Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
		
		if (actSelectedMasterSearchCheckbox==actSelectedMasterSearchCheckbox 
				&& actSummaryErrorMessage==expSummaryErrorMessage) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 101, 9, resPass);
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 101, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 101, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    }
  }
  
  

 // Editing the Update Account
 public static boolean checkUpdateAcountInformationForUpdateAccountInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
 {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("************************ checkUpdateAcountInformationForUpdateAccount Method Executes............ ***********************************");
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBox));
		accountFirstCheckBox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
		masterEditBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));

		Select oSelect                          = new Select(accountTypeDropdown);
		String actAccountMasterType             = oSelect.getFirstSelectedOption().getText();

		String actAccountMasterName             = nameTxt.getAttribute("value");
		String actAccountMasteCode              = codeTxt.getAttribute("value");

		String actAccountMasterCreditLimit      = creditLimitTxt.getAttribute("value");
		String actAccountMasterCreditDays       = creditdaysTxt.getAttribute("value");
		String actAccountMasterChequeDiscount   = chequeDiscountLimitTxt.getAttribute("value");
		String actAccountMasterRateOfInterest   = rateofinterestTxt.getAttribute("value");


		
		String expAccountMasterName              = excelReader.getCellData(xlSheetName, 103, 7);
		String expAccountMasteCode               = excelReader.getCellData(xlSheetName, 104, 7);
		String expAccountMasterType              = excelReader.getCellData(xlSheetName, 105, 7);
		String expAccountMasterCreditLimit       = excelReader.getCellData(xlSheetName, 106, 7);
		String expAccountMasterCreditDays        = excelReader.getCellData(xlSheetName, 107, 7);
		String expAccountMasterChequeDiscount    = excelReader.getCellData(xlSheetName, 108, 7);
		String expAccountMasterRateOfInterest    = excelReader.getCellData(xlSheetName, 109, 7);
	    //String expAccountMasterExtraFieldUpdate  = excelReader.getCellData(xlSheetName, 110, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 103, 8, actAccountMasterName);
		excelReader.setCellData(xlfile, xlSheetName, 104, 8, actAccountMasteCode);
		excelReader.setCellData(xlfile, xlSheetName, 105, 8, actAccountMasterType);
		excelReader.setCellData(xlfile, xlSheetName, 106, 8, actAccountMasterCreditLimit);
		excelReader.setCellData(xlfile, xlSheetName, 107, 8, actAccountMasterCreditDays);
		excelReader.setCellData(xlfile, xlSheetName, 108, 8, actAccountMasterChequeDiscount);
		excelReader.setCellData(xlfile, xlSheetName, 109, 8, actAccountMasterRateOfInterest);
		//excelReader.setCellData(xlfile, xlSheetName, 110, 8, actAccountMasterExtraFieldUpdate);

		System.out.println("Update Name Value Actual                : " + actAccountMasterName+             " Value Expected : " + expAccountMasterName);
		System.out.println("Update Code Value Actual                : " + actAccountMasteCode+              " Value Expected : " + expAccountMasteCode);
		System.out.println("Update Type Value Actual                : " + actAccountMasterType+             " Value Expected : " + expAccountMasterType);
		System.out.println("Update Credit Limit Value Actual        : " + actAccountMasterCreditLimit+      " Value Expected : " + expAccountMasterCreditLimit);
		System.out.println("Update Credit Days Value Actual         : " + actAccountMasterCreditDays+       " Value Expected : " + expAccountMasterCreditDays);
		System.out.println("Update Cheque Discount Value Actual     : " + actAccountMasterChequeDiscount+   " Value Expected : " + expAccountMasterChequeDiscount);
		System.out.println("Update Rate Of Interest Value Actual    : " + actAccountMasterRateOfInterest+   " Value Expected : " + expAccountMasterRateOfInterest);
		//System.out.println("Update Extra Field Update Value Actual  : " + actAccountMasterExtraFieldUpdate+ " Value Expected : " + expAccountMasterExtraFieldUpdate);
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerCreatetabUpdateTab));
		headerCreatetabUpdateTab.click();
		
        Thread.sleep(2000);

		String actExtraFieldUpdateValue =extraFieldCreateUpdateTab.getAttribute("value");
		String expExtraFieldUpdateValue ="Extra Field UpdateCreateTab";
		System.out.println("Edit Extra Field Update Value Actual            : " + actExtraFieldUpdateValue  +  " Value Expected : " + expExtraFieldUpdateValue);
		
	
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editcloseBtn));
		editcloseBtn.click();
		
		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
		boolean expSummaryErrorMessage  = true;

		System.out.println("Click on Close in Edit Is Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);

		int masterGridBodyListCount=masterGridBodyRowCount.size();
    	
    	
    	ArrayList<String> masterGridBodyListArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterGridBodyListCount;i++)
    	{
    		String masterGridBodyNamedata        =masterGridBodyName.get(i).getText();
    		String masterGridBodyCodedata        =masterGridBodyCode.get(i).getText();
    		String masterGridBodyAccountTypedata =masterGridBodyAccountType.get(i).getText();
    		
    		
    		masterGridBodyListArray.add(masterGridBodyNamedata);
    		masterGridBodyListArray.add(masterGridBodyCodedata);
    		masterGridBodyListArray.add(masterGridBodyAccountTypedata);
    	}
    	
    	String actmasterGridBodyList=masterGridBodyListArray.toString();
		 
		 String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 111, 7);
		 
		 excelReader.setCellData(xlfile, xlSheetName, 111, 8, actmasterGridBodyList);
		 
		 System.out.println("masterGridBodyList Actual   : " + actmasterGridBodyList);
		 System.out.println("masterGridBodyList Expected : " + expmasterGridBodyList);

		

		if (actAccountMasterName.equalsIgnoreCase(expAccountMasterName)
				&& actAccountMasteCode.equalsIgnoreCase(expAccountMasteCode)
				&& actAccountMasterType.equalsIgnoreCase(expAccountMasterType)
				&& actAccountMasterCreditLimit.equalsIgnoreCase(expAccountMasterCreditLimit)
				&& actAccountMasterCreditDays.equalsIgnoreCase(expAccountMasterCreditDays)
				&& actAccountMasterChequeDiscount.equalsIgnoreCase(expAccountMasterChequeDiscount)
				&& actAccountMasterRateOfInterest.equalsIgnoreCase(expAccountMasterRateOfInterest)
				//&& actAccountMasterExtraFieldUpdate.equalsIgnoreCase(expAccountMasterExtraFieldUpdate)
				&& actSummaryErrorMessage==expSummaryErrorMessage
				&& actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList)
				&& actExtraFieldUpdateValue.equalsIgnoreCase(expExtraFieldUpdateValue)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 102, 9, resPass);
			return true;
		} 
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 102, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 102, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    }
  }
 
  @FindBy(xpath = "//span[@class='icon-reject2 theme_color']")
  public static WebElement newErrorMessageCloseBtn;


 
  @FindBy(xpath = "/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr/td[8]/div[1]/label/input")
  public static WebElement firstRowSelectUnderGroup;
 
  // To Delete Account
  public static boolean checkSeclectAccountAndDeleteOptionInMasterPage()throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("************************** checkDeleteAccountBeforeCustomization Method Executes............  *************************************");
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
		boolean actSelectedMasterSearchCheckbox = accountFirstCheckBoxToSelection.isSelected();
		boolean expSelectedMasterSearchCheckbox = false;
		
		if(actSelectedMasterSearchCheckbox==expSelectedMasterSearchCheckbox)
		{
			accountFirstCheckBoxToSelection.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
		masterDeleteBtn.click();
		
		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
		boolean expSummaryErrorMessage  = true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
		String actGetMsgOnDeleteButton = getMsgOnDelete.getText();
		String expGetMsgOnDeleteButton = excelReader.getCellData(xlSheetName, 113, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 113, 8, actGetMsgOnDeleteButton);

		//Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
		clickOnOkInDelete.click();
		
		String actValidationDisplayMessage = validationUpdatingConfirmationMessage.getText();
      
		String expValidationDisplayMessage = excelReader.getCellData(xlSheetName, 114, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 114, 8, actValidationDisplayMessage);
		
		boolean actDeleteDisplayMessageOkIsClicked = checkValidationMessageboolean(expValidationDisplayMessage);
		boolean expDeleteDisplayMessageOkIsClicked = true;
		
		String actResult = Boolean.toString(actDeleteDisplayMessageOkIsClicked);
		
		excelReader.setCellData(xlfile, xlSheetName, 112, 8, actResult.toUpperCase());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationNameOfLane1));
		
		
		Thread.sleep(2000);
		
		int masterGridBodyListCount=masterGridBodyRowCount.size();
    	
    	
    	ArrayList<String> masterGridBodyListArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterGridBodyListCount;i++)
    	{
    		String masterGridBodyNamedata        =masterGridBodyName.get(i).getText();
    		String masterGridBodyCodedata        =masterGridBodyCode.get(i).getText();
    		String masterGridBodyAccountTypedata =masterGridBodyAccountType.get(i).getText();
    		
    		
    		masterGridBodyListArray.add(masterGridBodyNamedata);
    		masterGridBodyListArray.add(masterGridBodyCodedata);
    		masterGridBodyListArray.add(masterGridBodyAccountTypedata);
    	}
    	
    	String actmasterGridBodyList=masterGridBodyListArray.toString();
		 
		String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 115, 7);
		 
		excelReader.setCellData(xlfile, xlSheetName, 115, 8, actmasterGridBodyList);
		 
		System.out.println("masterGridBodyList Actual   : " + actmasterGridBodyList);
		System.out.println("masterGridBodyList Expected : " + expmasterGridBodyList);
		System.out.println("Check The account Check Box is Check Value Actual        : " + actSelectedMasterSearchCheckbox + " Value Expected : " + expSelectedMasterSearchCheckbox);
		System.out.println("Click On Delete Button Is Any Error Message Value Actual : " + actSummaryErrorMessage          + " Value Expected : " + expSummaryErrorMessage);
		System.out.println("Check Alert Message On Click Delete Accounts             : " + actGetMsgOnDeleteButton         + "  Value Expected : " + expGetMsgOnDeleteButton);
		System.out.println("Confirmation Message and Close Button display            : " + actValidationDisplayMessage     + "  Value Expected : " + expValidationDisplayMessage);

		if(actSummaryErrorMessage==actSummaryErrorMessage && actValidationDisplayMessage.equalsIgnoreCase(expValidationDisplayMessage)
				&& actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList))
		{
			excelReader.setCellData(xlfile, xlSheetName, 112, 9, resPass);
			return true;
		}	
		else
		{	
			excelReader.setCellData(xlfile, xlSheetName, 112, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 112, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    }
  }

  public static boolean checkDeleteAccountMasterNotDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {

	excelReader = new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	System.out.println("****************************** checkDeleteAccountMasterNotDisplayInAccountGrid Method Executes............  *********************************");
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationNameOfLane1));

		int masterGridBodyListCount=masterGridBodyRowCount.size();
    	
    	
    	ArrayList<String> masterGridBodyListArray = new ArrayList<String>();
    	
    	for (int i=0;i<masterGridBodyListCount;i++)
    	{
    		String masterGridBodyNamedata        =masterGridBodyName.get(i).getText();
    		String masterGridBodyCodedata        =masterGridBodyCode.get(i).getText();
    		String masterGridBodyAccountTypedata =masterGridBodyAccountType.get(i).getText();
    		
    		
    		masterGridBodyListArray.add(masterGridBodyNamedata);
    		masterGridBodyListArray.add(masterGridBodyCodedata);
    		masterGridBodyListArray.add(masterGridBodyAccountTypedata);
    	}
    	
    	String actmasterGridBodyList=masterGridBodyListArray.toString();
		 
		String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 117, 7);
		 
		excelReader.setCellData(xlfile, xlSheetName, 117, 8, actmasterGridBodyList);
		 
		System.out.println("masterGridBodyList Actual   : "+actmasterGridBodyList);
		System.out.println("masterGridBodyList Expected : "+expmasterGridBodyList);

		if(actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList))
		{
			excelReader.setCellData(xlfile, xlSheetName, 116, 9, resPass);
			return true;
		}	
		else
		{	
			excelReader.setCellData(xlfile, xlSheetName, 116, 9, resFail);
			return false;
		}
	}
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 116, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    }
 }
  
  
 
  public boolean checkClickOnCloseButtonInAccountMasterToCloseAccountsPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	System.out.println("******************************** checkClickOnCloseButtonInAccountMasterToCloseAccountsPage Method Executes.....  ******************************");
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
		masterCloseBtn.click();
		
		boolean actSummaryErrorMessage  = checkErrorMessageIsDisplayingOrNotDisplaying();
		boolean expSummaryErrorMessage  = true;

		System.out.println("Click On Close Button To Close Accounts MasterIs Any Error Message Value Actual : " + actSummaryErrorMessage + " Value Expected : " + expSummaryErrorMessage);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
		String actDashboardLabel = labelDashboard.getText();
		String expDashboardLabel = excelReader.getCellData(xlSheetName, 152, 7);
		
		excelReader.setCellData(xlfile, xlSheetName, 152, 8, actDashboardLabel);

		System.out.println("Click Close button In Accounts Master Value Actual  : " + actDashboardLabel+ "      Value Expected : " + expDashboardLabel);

		if (actSummaryErrorMessage==actSummaryErrorMessage
				&& actDashboardLabel.equalsIgnoreCase(expDashboardLabel)) 
		{
			excelReader.setCellData(xlfile, xlSheetName, 151, 9, resPass);
			System.out.println(" Test Pass: Close Button is working");
			return true;
		} 
		else 
		{
			excelReader.setCellData(xlfile, xlSheetName, 151, 9, resFail);
			System.out.println(" Test Fail: Close Button is not working");
			return false;
		}
	 }		
	catch (Exception e) 
    {
    	excelReader.setExceptionInExcel(xlfile, xlSheetName, 151, 10, e.getMessage());
    	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
    	return false;
    }
  }

  
  
  public boolean checkLogoutInAccountsMasterPage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
		 	String exception = e.getMessage();
		 	excelReader.setCellData(xlfile, xlSheetName, 285, 10, exception);	
			return false;
		}
	}
  

	
  public SmokeAccountsPage(WebDriver driver)
  {
	PageFactory.initElements(driver, this);
  }

}
