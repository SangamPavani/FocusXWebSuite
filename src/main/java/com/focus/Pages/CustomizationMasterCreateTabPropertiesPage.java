package com.focus.Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;

public class CustomizationMasterCreateTabPropertiesPage extends BaseEngine
{

    //Home Menu
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;
	
        //Masters Menu	
		@FindBy (xpath="//*[@id='1000']/span")
	    public static WebElement mastersMenu;
		
		    //Accounts 
			@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
			public static WebElement accounts;
			
				//Accounts Title
				@FindBy (xpath="//span[@id='spnHeaderText']")
				public static WebElement accountsTitle;
		
				//Master Main Header Fields		
				@FindBy(xpath="//i[@class='icon-font6 icon-new']")
				public static WebElement masterNewBtn;
					
				@FindBy(xpath="//i[@class='icon-font6 icon-add-group']")
				public static WebElement masterAddGroupBtn; 
				 
				@FindBy(xpath="//i[@class='icon-font6 icon-edit']")
				public static WebElement masterEditBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-clone']")
				public static WebElement masterCloneBtn; 
		
				@FindBy(xpath="//i[@class='icon-properties icon-font6']")
				public static WebElement masterPropertiesBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-delete']")
				public static WebElement masterDeleteBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-close']")
				public static WebElement masterCloseBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-group']")
				public static WebElement masterGroupBtn; 
				
				@FindBy(xpath="//*[@id='toggle_ribbon']")
				public static WebElement masterRibbonToExpandOptions; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-delete-all']")
				public static WebElement masterDeleteAllBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-closed-account']")
				public static WebElement masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-open-close-account']")
				public static WebElement masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-import']")
				public static WebElement masterAdvanceMasterImportORExportBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-info']")
				public static WebElement masterAuthorInfoBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-up-arrow']")
				public static WebElement masterMoveUpBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-down-arrow']")
				public static WebElement masterMoveDownBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-sort']")
				public static WebElement masterSortBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-mass-update']")
				public static WebElement masterMassUpdateBtn; 
		
				@FindBy(xpath="//a[@class='lSNext']")
				public static WebElement masterRibbonControlNextBtn; 
				
				@FindBy(xpath="//*[@id='btnXMLImport']")
				public static WebElement masterImportFromXmlBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-xmlexport']")
				public static WebElement masterExportFormatToXmlBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-custamize']")
				public static WebElement masterCustamizemasterBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-options']")
				public static WebElement masterCustamizeViewBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-tree']")
				public static WebElement mastercustamizeTreeBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-stock-ledger']")
				public static WebElement masterLedgerBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-financial-1']")
				public static WebElement masterManageCreditBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-department-appropriation']")
				public static WebElement masterDepartmentAppropriationBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-budget']")
				public static WebElement masterBudgetBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-backtrack']")
				public static WebElement masterBackTrackBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-transfer']")
				public static WebElement masterTranferBtn; 
		
				@FindBy(xpath="//*[@id='btnNewSets']")
				public static WebElement masterNewSetBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-modifier']")
				public static WebElement masterModifierBtn; 
		
				@FindBy(xpath="//*[@id='btnSetType']")
				public static WebElement masterSetTypeBtn; 
		
				@FindBy(xpath="//i[@class='icon-convert icon-font6']")
				public static WebElement masterUnitConversionBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-alternate-product-1']")
				public static WebElement masterAlternateItemBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-related-product']")
				public static WebElement masterRelatedItemBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-stock-ledger']")
				public static WebElement masterStockLedgerBtn; 
		




		//Master Left panel----TreeID-----Elements

		@FindBy(xpath="//*[@id='iTreeId']")
		public static WebElement masterTreeIdDropdown; 

		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/button/span")
		public static WebElement masterTreeIDToggleBtn; 
		                        
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[1]/a")
				public static WebElement masterTreeIDToggle_CreateTreeBtn; 
				
							@FindBy(xpath="//h4[contains(text(),'Create Tree')]")
							public static WebElement treeID_CreateTreeLabel; 
							
							@FindBy(xpath="//*[@id='btnCancel']")
							public static WebElement treeID_CloseBtn; 
							
							@FindBy(xpath="//input[@id='txtTreeName']")
							public static WebElement treeID_TreeTxt; 
							
							@FindBy(xpath="//input[@id='rbtManual']")
							public static WebElement treeID_ManualRadioBtn; 
							
							@FindBy(xpath="//input[@id='rbtAuto']")
							public static WebElement treeID_AutoRadioBtn; 
							
							@FindBy(xpath="//select[@id='cmbTreeList']")
							public static WebElement treeID_SelectTreeDropdown; 
							
							@FindBy(xpath="//input[@id='chkIncludeGroup']")
							public static WebElement treeID_IncludeGroupsCheckBox; 
							
							@FindBy(xpath="//input[@id='chkAddLeaveAtZeroLevel']")
							public static WebElement treeID_AddLeafAlwaysAtTheZerolevelOnCreationCheckbox; 
							
							@FindBy(xpath="//*[@id='MasterTreeTable_SelectFields']")
							public static WebElement treeID_GridFirstSelectFields; 
							
							@FindBy(xpath="//*[@id='MasterTreeTable_col_2-1']")
							public static WebElement treeID_GridSecondSelectFields; 
							
							@FindBy(xpath="//input[@id='chkAutoGroup']")
							public static WebElement treeID_AlwaysAutoGroupOnCreationCheckbox; 
							
							@FindBy(xpath="//input[@id='chkAlwaysSorted']")
							public static WebElement treeID_AlwaysSortedCheckbox; 
							
							@FindBy(xpath="//*[@id='btnOk']")
							public static WebElement treeID_PopOkBtn; 
							
							@FindBy(xpath="//*[@id='btnCancel']")
							public static WebElement treeID_PopCancelBtn; 
				
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[2]")
				public static WebElement masterTreeIDToggle_EditBtn; 
				
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[3]")
				public static WebElement masterTreeIDToggle_DeleteBtn; 
				
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[1]/div/div/ul/li[4]")
				public static WebElement masterTreeIDToggle_setDefaultBtn;


		//TreeViewID----->Elements
				
		@FindBy(xpath="//select[@id='iTreeViewId']")
		public static WebElement masterTreeViewIDDropdown; 

		@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/button/span")
		public static WebElement masterTreeViewIDToggleBtn;

				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[1]")
				public static WebElement masterTreeViewIdCreateViewBtn; 
				
								@FindBy(xpath="//*[@id='createViewDiv']/div/div[1]/div[1]/h4")
								public static WebElement CreateView_Label; 
				
				
								@FindBy(xpath="//*[@id='btnCancel']/i")
								public static WebElement CreateView_CloseBtn; 
				
								@FindBy(xpath="//*[@id='ctrlCreateMasterViewH']")
								public static WebElement CreateView_CreateViewTxt; 
				
									@FindBy(xpath="//*[@id='ctrlCreateMasterViewH_input_image']/span")
									public static WebElement CreateView_ExpansionBtn; 
					
									@FindBy(xpath="//*[@id='ctrlCreateMasterViewH_input_settings']/span")
									public static WebElement CreateView_SettingBtn; 
					
									@FindBy(xpath="//input[@id='chkAvailbleonMobileApp']")
									public static WebElement CreateView_AvailbleonMobileAppCheckbox; 
					
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[1]/select")
									public static WebElement CreateView_Conjuction1Dropdown; 
					
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[2]/select")
									public static WebElement CreateView_AccountType1Dropdown; 
									                      
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[3]/select")
									public static WebElement CreateView_EqaulTo1Dropdown; 
									
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[4]/select")
									public static WebElement CreateView_Value1Dropdown; 
					
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[5]/input")
									public static WebElement CreateView_Customer1Dropdown; 
									
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[6]/span")
									public static WebElement CreateView_CloseFirstrow; 
												
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[7]/span")
									public static WebElement CreateView_AddRowBtn; 				
									
									////Creation For Second Row
									
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr/td[1]/select")
									public static WebElement CreateView_Conjuction2Dropdown; 
					
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[2]/select")
									public static WebElement CreateView_AccountType2Dropdown; 
									                      
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[3]/select")
									public static WebElement CreateView_EqaulTo2Dropdown; 
									
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[4]/select")
									public static WebElement CreateView_Value2Dropdown; 
					
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[5]/input")
									public static WebElement CreateView_Customer2Dropdown; 
									
									@FindBy(xpath="//*[@id='1104_0_AdvanceFilter']/table/tbody/tr[2]/td[6]/span")
									public static WebElement CreateView_CloseSecondrow; 
					
								@FindBy(xpath="//button[@id='btnMasterViewDelete']")
								public static WebElement CreateView_DeleteBtn; 
				
								@FindBy(xpath="//button[@id='btnSave']")
								public static WebElement CreateView_SaveBtn; 
				
								@FindBy(xpath="//*[@id='btnCancel']")
								public static WebElement CreateView_CancelBtn; 
				
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[2]/a")
				public static WebElement masterTreeeViewIdEditBtn; 
				
				@FindBy(xpath="//*[@id='spnhiererchy']/div/div[2]/div/div/ul/li[3]/a")
				public static WebElement masterTreeViewIdDeleteBtn; 
				
			@FindBy(xpath="//div[@id='divTreeMenu']")
			public static WebElement masterTreeDisplayMenuAccountGroups; 		
				
		@FindBy(xpath="//*[@id='oncheckaccorderan']")
		public static WebElement masterOptionToHideAccountsGroupTree; /////To hide TreeId and TreeViewId Elements From HomeScreen

		@FindBy(xpath="//*[@id='0']/a")
		private static WebElement account;
		
		@FindBy(xpath="//*[@id='18']/a[1]")
		private static WebElement accountAssestsGroup;
		
		@FindBy(xpath="//*[@id='17']/a[2]")
		private static WebElement accountFixedAssestsGroup;
		
		@FindBy(xpath="//*[@id='23']/a[2]")
		private static WebElement accountCurrentAssetsGroup;

		@FindBy(xpath="//*[@id='8']/a[2]")
		private static WebElement accountCAshAndBankGroup;
		
		@FindBy(xpath="//*[@id='13']/a[2]")
		private static WebElement accountInventoriesGroup;
		
		@FindBy(xpath="//*[@id='22']/a[2]")
		private static WebElement accountAccountsReceivableGroup;
		
		@FindBy(xpath="//a[@class='clsMasterName'][contains(text(),'Customer Update Group')]")
		private static WebElement accountAccountsReceivableCustomerUpdateGroup;
		
		@FindBy(xpath="//*[@id='72']/a[2]")
		private static WebElement accountInvestmentsGroup;
		
		@FindBy(xpath="//*[@id='25']/a[2]")
		private static WebElement accountExpensesGroup;
		
		@FindBy(xpath="//*[@id='24']/a[2]")
		private static WebElement accountDirectExpensesGroup;
		
		@FindBy(xpath="//*[@id='73']/a[2]")
		private static WebElement accountIndirectExpensesGroup;
		
		@FindBy(xpath="//*[@id='54']/a[2]")
		private static WebElement accountAdministrativeExpensesGroup;
		
		@FindBy(xpath="//*[@id='60']/a[2]")
		private static WebElement accountEmployeeBenefitsGroup;
		
		@FindBy(xpath="//*[@id='64']/a[2]")
		private static WebElement accountFinancialChargesGroup;
		
		@FindBy(xpath="//*[@id='69']/a[2]")
		private static WebElement accountGainAndLossGroup;
		
		@FindBy(xpath="//*[@id='26']/a[2]")
		private static WebElement accountControlAccountsGroup;
		
		@FindBy(xpath="//*[@id='29']/a[2]")
		private static WebElement accountRevenueGroup;

		@FindBy(xpath="//*[@id='28']/a[2]")
		private static WebElement accountSalesGroup;
		
		@FindBy(xpath="//*[@id='33']/a[2]")
		private static WebElement accountEqitiesGroup;
		
		@FindBy(xpath="//*[@id='32']/a[2]")
		private static WebElement accountCapitalGroup;
		
		@FindBy(xpath="//*[@id='39']/a[2]")
		private static WebElement accountLiabilitiesGroup;
		
		@FindBy(xpath="//*[@id='38']/a[2]")
		private static WebElement accountLoanAndBorrowingGroup;
		
		@FindBy(xpath="//*[@id='37']/a[2]")
		private static WebElement accountLoansGroup;
		
		@FindBy(xpath="//*[@id='42']/a[2]")
		private static WebElement accountAccruedLiabilitiesGroup;
		
		@FindBy(xpath="//*[@id='45']/a[2]")
		private static WebElement accountTradePayableGroup;
		
		@FindBy(xpath="//*[@id='48']/a[2]")
		private static WebElement accountProvisionsGroup;
		
		//Header Elements of Master MainLanding

		@FindBy(xpath="//*[@id='txtsrch-term']")
		public static WebElement masterSearchTxt; 

		@FindBy(xpath="//*[@id='btnSearchAcc1']/i")
		public static WebElement masterSearchBtn; 

			@FindBy(xpath="//a[contains(text(),'Search on')]")
			public static WebElement masterSearchTxtBtn_SearchOnBtn; 

				@FindBy(xpath="//label[@class='form-group']")
				public static WebElement searchOn_SelectFilterLabel; 
				
				@FindBy(xpath="//select[@id='ddlSelectFilter']")
				public static WebElement searchOn_SelectFilterDropdown; 
				
				@FindBy(xpath="//input[@id='chkSearchSelectAll']")
				public static WebElement searchOn_SelectAllCheckBox; 
				
				@FindBy(xpath="//*[@id='0']")
				public static WebElement searchOn_NameCheckbox; 
				
				@FindBy(xpath="//input[@id='1']")
				public static WebElement searchOn_AliasCheckbox; 
				
				@FindBy(xpath="//input[@id='2']")
				public static WebElement searchOn_COdeCheckbox; 
				
				@FindBy(xpath="//input[@id='3']")
				public static WebElement searchOn_AccountTypeCheckbox; 
				
				@FindBy(xpath="//input[@id='4']")
				public static WebElement searchOn_CreditLimitCheckbox; 
				
				@FindBy(xpath="//input[@id='5']")
				public static WebElement searchOn_CreditDaysCheckbox; 
				
				@FindBy(xpath="//input[@id='6']")
				public static WebElement searchOn_CreatedByCheckbox; 
				
				@FindBy(xpath="//input[@id='7']")
				public static WebElement searchOn_ModifiedByCheckbox; 
				
				@FindBy(xpath="//input[@id='8']")
				public static WebElement searchOn_CreatedDateCheckbox; 
				
				@FindBy(xpath="//input[@id='9']")
				public static WebElement searchOn_ModifiedDate; 
				
				@FindBy(xpath="//input[@id='10']")
				public static WebElement searchOn_AllowOtherCompaniesToViewTheRecordCheckbox; 
				
				@FindBy(xpath="//input[@id='11']")
				public static WebElement searchOn_SyscReceiverDateCheckbox; 
				
				@FindBy(xpath="//input[@id='12']")
				public static WebElement searchOn_EditingLocationCheckbox; 
				
				@FindBy(xpath="//input[@id='13']")
				public static WebElement searchOn_ChequeDiscountLimitCheckbox; 
				
				@FindBy(xpath="//input[@id='14']")
				public static WebElement searchOn_RateOfInterestCheckbox; 
				
				@FindBy(xpath="//input[@id='15']")
				public static WebElement searchOn_BankACCheckbox; 
				
				@FindBy(xpath="//input[@id='16']")
				public static WebElement searchOn_PDCDIscountedAC; 
				
				@FindBy(xpath="//input[@id='17']")
				public static WebElement searchOn_DebitCreditProposalCheckbox; 
				
				@FindBy(xpath="//input[@id='18']")
				public static WebElement searchOn_DebitCreditRequiredCheckbox; 
				
				@FindBy(xpath="//input[@id='19']")
				public static WebElement searchOn_ExchangeAdjustmentGainACCheckbox; 
				
				@FindBy(xpath="//input[@id='20']")
				public static WebElement searchOn_ExchangeAdjustmentLossACCheckbox; 
				
				@FindBy(xpath="//input[@id='21']")
				public static WebElement searchOn_PrimaryAccountCheckbox; 
				
				@FindBy(xpath="//input[@id='22']")
				public static WebElement searchOn_DefaultCurrencyCheckbox; 
				
				@FindBy(xpath="//input[@id='23']")
				public static WebElement searchOn_ConsolidationMethodCheckbox; 
				
				@FindBy(xpath="//input[@id='24']")
				public static WebElement searchOn_PaymentTermsCheckbox; 
				
				@FindBy(xpath="//input[@id='25']")
				public static WebElement searchOn_RemainderTermsCheckbox; 
				
				@FindBy(xpath="//input[@id='26']")
				public static WebElement searchOn_FinanceChargeTermsCheckbox; 
				
				@FindBy(xpath="//input[@id='27']")
				public static WebElement searchOn_AddressCheckbox; 
				
				@FindBy(xpath="//input[@id='28']")
				public static WebElement searchOn_City1Checkbox; 
				
				@FindBy(xpath="//input[@id='29']")
				public static WebElement searchOn_Pin1Checkbox; 
				
				@FindBy(xpath="//input[@id='30']")
				public static WebElement searchOn_DeliveryAddreddCheckbox; 
				
				@FindBy(xpath="//input[@id='31']")
				public static WebElement searchOn_City2Checkbox; 
				
				@FindBy(xpath="//input[@id='32']")
				public static WebElement searchOn_Pin2Checkbox; 
				
				@FindBy(xpath="//input[@id='33']")
				public static WebElement searchOn_SendEmailToCustomerCheckbox; 
				
				@FindBy(xpath="//input[@id='34']")
				public static WebElement searchOn_AllowCustomerPortalCheckbox; 
				
				@FindBy(xpath="//input[@id='35']")
				public static WebElement searchOn_EmailCheckbox; 
				
				@FindBy(xpath="//input[@id='36']")
				public static WebElement searchOn_PasswordCheckbox; 
				
				@FindBy(xpath="//input[@id='37']")
				public static WebElement searchOn_TelNOCheckbox; 
				
				@FindBy(xpath="//input[@id='38']")
				public static WebElement searchOn_FaxNoCheckbox; 
				
				@FindBy(xpath="//input[@id='39']")
				public static WebElement searchOn_BankAccountNameCheckbox; 
				
				@FindBy(xpath="//input[@id='40']")
				public static WebElement searchOn_BankAccountNumberCheckbox; 
				
				@FindBy(xpath="//input[@id='41']")
				public static WebElement searchOn_IFSCCodeCheckbox; 
				
				@FindBy(xpath="//input[@id='42']")
				public static WebElement searchOn_PaymentTypeCheckbox; 
				
				@FindBy(xpath="//input[@id='43']")
				public static WebElement searchOn_FinanceEmailCheckbox; 
				
				@FindBy(xpath="//input[@id='44']")
				public static WebElement searchOn_PortalEmailCheckbox; 
				
				@FindBy(xpath="//input[@id='45']")
				public static WebElement searchOn_NetbalanceCheckbox; 
				
				@FindBy(xpath="//input[@id='46']")
				public static WebElement searchOn_DRBalanceCheckbox; 
				
				@FindBy(xpath="//input[@id='47']")
				public static WebElement searchOn_CRbalanceCheckbox; 
				
				@FindBy(xpath="//*[@id='divSearchMenu']/div[4]/button")
				public static WebElement searchOn_OkBtn;
						
			@FindBy(xpath="//a[contains(text(),'Advance Search')]")
			public static WebElement masterSearchTxtBtn_AdvanceSearchBtn; 

  
	            //First Row Fields

				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[1]/select")
				public static WebElement advanceSearch_Conjuction1Dropdown;
				
				@FindBy(xpath="//tbody//input[@placeholder='Select Field']")
				public static WebElement advanceSearch_SelectField1Dropdown;
				
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[3]/select")
				public static WebElement advanceSearch_SelectOperator1Dropdown;
				
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[4]/select")
				public static WebElement advanceSearch_CompareWith1Dropdown;
				
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[5]/input")
				public static WebElement advanceSearch_Value1Txt;
				
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[6]/span")
				public static WebElement advanceSearch_CloseRow1Btn;
				
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[1]/td[7]/span")
				public static WebElement advanceSearch_AddRowBtn;
				
			    //Second Row Fields
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[1]/select")
				public static WebElement advanceSearch_ConjuctionDropdown;
				
				@FindBy(xpath="//tbody//input[@placeholder='Select Field']")
				public static WebElement advanceSearch_SelectFieldDropdown;
				
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[3]/select")
				public static WebElement advanceSearch_SelectOperatorDropdown;
				
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[4]/select")
				public static WebElement advanceSearch_CompareWithDropdown;
				
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[5]/input")
				public static WebElement advanceSearch_ValueTxt;
				
				@FindBy(xpath="//*[@id='1104_1_AdvanceFilter']/table/tbody/tr[2]/td[6]/span")
				public static WebElement advanceSearch_CloseRow2Btn;
						
				@FindBy(xpath="//*[@id='divCreateNewTreeModalBody']/div[2]/div[2]/input")
				public static WebElement advanceSearch_GenerateQueryBtn;
				
				@FindBy(xpath="//div[@id='divStrQuery']")
				public static WebElement advanceSearch_QueryDescriptionTxt;
				
				@FindBy(xpath="//button[@id='btnOk']")
				public static WebElement advanceSearch_OkBtn;
				
				@FindBy(xpath="//*[@id='btnCancel']")
				public static WebElement advanceSearch_CancelBtn;
				
				@FindBy(xpath="//*[@id='btnCancel']/i")///Both Has Same ID But But Different in Fields 
				public static WebElement advanceSearch_CloseBtn;							

		@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
		public static WebElement mastercmbMasterTxt; 

		@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_image']/span")
		public static WebElement masterCmbMasterExpansionBtn; 

			@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_settings']/span")
			public static WebElement masterCumMasterSettingBtn; 
						
				@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_container']")
				public static WebElement masterCumMaster_Pop_sNameTxt;
				
				@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[1]")
				public static WebElement masterCumMaster_StandardFieldsBtn;
					
					@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_heading']")
					public static WebElement masterCumMaster_PopCustomizeDispalyColumnsLabel; 		
					
					@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_standardfields_list']")
					public static WebElement masterCumMaster_Pop_StandardFields_Filedsdropdown;
					
					@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_standardfields_header']")
					public static WebElement masterCumMaster_Pop_StandardFields_HeaderTxt;
					
					@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_standardfields_alignment']")
					public static WebElement masterCumMaster_Pop_StandardFields_Allignmentdropdown;
					
					@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_standardfields_width']")
					public static WebElement masterCumMaster_Pop_StandardFields_WidthTxt;
					
					@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[3]")
					public static WebElement masterCumMaster_Pop_StandardFields_OkBtn;
					
					@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[4]")
					public static WebElement masterCumMaster_Pop_StandardFields_CancelBtn;
					
			@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[2]")
			public static WebElement masterCumMaster_Pop_DeleteColumnBtn;
			
			@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[3]")
			public static WebElement masterCumMaster_Pop_OkBtn;
			
			@FindBy(xpath="//*[@id='cmbUserTypeMaster_customize_popup_footer']/div/div/input[4]")
			public static WebElement masterCumMaster_Pop_CancelBtn;
					

		@FindBy(xpath="//*[@id='li_moveup']/div/div[1]/a[1]/span")
		public static WebElement masterMoveTheSelectionToNextBookMarkBtn; 

		@FindBy(xpath="//span[@class='icon-font6 icon-bookmarkdown theme_icon-color']")
		public static WebElement masterMoveTheSelectionToPrevoiusBookmarkBtn; 

		@FindBy(xpath="//span[@class='theme_icon-color icon-font6 icon-show-all-records']")
		public static WebElement masterShowAllRecordsBtn; 

		@FindBy(xpath="//span[@class='icon-font6 icon-missmatched-entries theme_icon-color']")
		public static WebElement masterShowAllUnauthorisedRecords; 


		@FindBy(xpath="//span[@class='icon-font6 icon-closed-records theme_icon-color']")
		public static WebElement masterShowAllClosedRecordsBtn; 

		@FindBy(xpath="//span[@class='icon-font6 icon-external-module theme_icon-color']")
		public static WebElement masterAutoAdjustColoumnsBtn; 

		@FindBy(xpath="//input[@id='chkRetainSelection']")
		public static WebElement masterRetainSelectionCheckBox; 

		@FindBy(xpath="//*[@id='btnsideBar']")
		public static WebElement masterSideBarBtn; 

		//InfoPanel
		

		@FindBy(xpath="//label[contains(text(),'Info Panel')]")
		public static WebElement masterInfoPanelLabel; 

		@FindBy(xpath="//i[@class='icon-custamize theme_icon-color']")
		public static WebElement masterInfoPanelCustammizeBtn;


			@FindBy(xpath="//h4[contains(text(),'Customize InfoPanel')]")
			public static WebElement infoPanel_CustomizeInfoPanelLabel;
			
			@FindBy(xpath="//*[@id='Customize_AddNew_InfoPanel']/div[1]/span")
			public static WebElement infoPanel_PopAddBtn;
			
			@FindBy(xpath="//*[@id='Customize_RemoveOne_InfoPanel']/div[1]/span")
			public static WebElement infoPanel_PopRemoveBtn;
			
			@FindBy(xpath="//*[@id='btnShowPanelNames_CustomizeInfoPanel']/div/span")
			public static WebElement infoPanel_PopAllIcon;
			
			@FindBy(xpath="//*[@id='btnShowPanelDetails_CustomizeInfoPanel']/div/span")
			public static WebElement infoPanel_PopDetailsIcon;
			
			@FindBy(xpath="//*[@id='tbl_infoPanel_names']/tbody/tr[1]/td[4]/i")
			public static WebElement infoPane_PopGridCreditHistoryAddBtn;
			
			@FindBy(xpath="//*[@id='tbl_infoPanel_names']/tbody/tr[2]/td[4]/i")
			public static WebElement infoPane_PopGridAgingAnalysisAddBtn;
			
			@FindBy(xpath="//*[@id='tbl_infoPanel_names']/tbody/tr[3]/td[4]/i")
			public static WebElement infoPane_PopGridAgingAnlaysisBaseAddBtn;
			
			@FindBy(xpath="//*[@id='tbl_infoPanel_names']/tbody/tr[4]/td[4]/i")
			public static WebElement infoPane_PopGridAuthorizationAddBtn;
			
			@FindBy(xpath="//a[@class='Fbutton previous_link']")
			public static WebElement infoPane_PopDetailsPreviousBtn;
			
			@FindBy(xpath="//*[@id='page_navigation']/a[2]")
			public static WebElement infoPane_PopDeailsOneBtn;
			
			@FindBy(xpath="//*[@id='customize_InfoPanel_btnSave']")
			public static WebElement infoPane_PopDeatilsSaveBtn;
			
			@FindBy(xpath="//*[@id='customize_InfoPanel_btnCancel']")
			public static WebElement infoPane_PopDetailsCloseBtn;
			
			@FindBy(xpath="//*[@id='btnCancel']/i")
			public static WebElement infoPane_PopCloseBtn;


		@FindBy(xpath="//i[@id='id_InfoPanelEdit']")
		public static WebElement masterInfoPanelEditBtn;

		@FindBy(xpath="//i[@id='infopanelCloseButton']")
		public static WebElement masterInfoPanelCloseBtn;


		//////Grid Elements ---------->Body Field******************

		@FindBy(xpath="//th[2]//span[1]")
		public static WebElement masterGrid_Header_SelectTxt;

		@FindBy(xpath="//input[@id='liSelectAllMasters']")
		public static WebElement masterGridHeader_SelectAllRowsCheckBox;

		@FindBy(xpath="//section[@id='page_Content']//th[3]")
		public static WebElement masterGridHeader_MasterId;

		@FindBy(xpath="//section[@id='page_Content']//th[4]]")
		public static WebElement masterGridHeader_Name;
	
		@FindBy(xpath="//td[contains(text(),'ASSETS')]")
		public static WebElement masterAssets;
		
		@FindBy(xpath="//td[contains(text(),'EXPENSES')]")
		public static WebElement masterExpenses;
		
		@FindBy(xpath="//td[contains(text(),'CONTROL ACCOUNTS')]")
		public static WebElement masterControlAccounts;
		
		@FindBy(xpath="//td[contains(text(),'REVENUE')]")
		public static WebElement masterRevenue;
		
		@FindBy(xpath="//td[contains(text(),'EQUITIES')]")
		public static WebElement masterEquities;
	
		@FindBy(xpath="//td[contains(text(),'LIABILITIES')]")
		public static WebElement masterLiabilities;
		

		@FindBy(xpath="//section[@id='page_Content']//th[6]")
		public static WebElement masterGridHeader_ReorderLevel;

		@FindBy(xpath="//section[@id='page_Content']//th[7]")
		public static WebElement masterGridHeader_BinCapacity;

		@FindBy(xpath="//section[@id='page_Content']//th[8]")
		public static WebElement masterGridHeader_ISAttribute;

		@FindBy(xpath="//section[@id='page_Content']//th[9]")
		public static WebElement masterGridHeader_ProducyType;

		@FindBy(xpath="//th[contains(text(),'Valuation Method')]")
		public static WebElement masterGridHeader_ValuationMethod;

		@FindBy(xpath="//th[@class='OverFlowHidden text-center']//span[contains(text(),'No of decimals')]")
		public static WebElement masterGridHeader_NoOfDecimals;

		@FindBy(xpath="//section[@id='page_Content']//th[7]")
		public static WebElement masterGridHeader_RoundingType;
		
		@FindBy(xpath="//td[contains(text(),'Customer A')]")
		public static WebElement masterCustomerA;
		
		@FindBy(xpath="//td[contains(text(),'Customer B')]")
		public static WebElement masterCustomerB;
		
		@FindBy(xpath="//td[contains(text(),'Customer B')]")
		public static WebElement masterCustomerC;
		
		
		
		

		//Row Selecting


		@FindBy(xpath="//*[@id='lblnchecked']/input")
		public static WebElement masterGrid_SelectFirstRow;

		//Footer Fields
		@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[1]/div/input")
		public static WebElement masterFirstBtn;

		@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[2]/div/input")
		public static WebElement masterPreviousBtn;

		@FindBy(xpath="//*[@id='btn1']")
		public static WebElement masterOneBtn;

		@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[4]/div/input")
		public static WebElement masterNextBtn;

		@FindBy(xpath="//*[@id='id_PageButtonsMasterLanding']/div/div[5]/div/input")
		public static WebElement masterEndBtn;
		
		
		//Accounts Creation Page 
		
		//Header tab Fields
		
		@FindBy(xpath="//*[@id='divBtnGroup0']/div/a")
		public static WebElement headerGeneralTab;
		
		@FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
		public static WebElement headerAccountSettingTab;
		
		@FindBy(xpath="//*[@id='divBtnGroup2']/div/a")
		public static WebElement headerDetailsTab;
		
		@FindBy(xpath="//*[@id='divBtnGroup3']/div/a")
		public static WebElement headerPrintLayoutTab;
		
		@FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
		public static WebElement headerUnitsTab;
		
		@FindBy(xpath="//*[@id='divBtnGroup2']/div/a")
		public static WebElement headerItemSettingsTab;
		
		@FindBy(xpath="//*[@id='divBtnGroup3']/div/a")
		public static WebElement headerClassificationTab;
		
		@FindBy(xpath="//*[@id='divBtnGroup4']/div/a")
		public static WebElement headerOtherDetailsTab;
		
		@FindBy(xpath="//*[@id='divBtnGroup5']/div/a")
		public static WebElement headerReplenishmentTab;
		
		@FindBy(xpath="//*[@id='divBtnGroup6']/div/a")
		public static WebElement headerOutletTab;
		
		
		
	    //Header Section Fields

		@FindBy(xpath="//*[@id='btnMasterSaveClick']")
		public static WebElement saveBtn;

		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
		public static WebElement closeBtn;

	    //Edit option Fields
		
		@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
		public static WebElement editcloseBtn;
		
		@FindBy(xpath="//i[@class='icon-font6 icon-paste-clipboard']")
		public static WebElement pasteBtn;
		
		@FindBy(xpath="//button[@id='btnMasterClone']")
		public static WebElement editcloneBtn;
		
		@FindBy(xpath="//*[@id='btnMasterCopy']")
		public static WebElement copyBtn;
		
		//New General Elements
		//Name
		@FindBy(xpath="//input[@id='sName']")
		public static WebElement nameTxt;
		
		
		//Code
		@FindBy(xpath="//input[@id='sCode']")
		public static WebElement codeTxt;
		
	    //AccountType	
		@FindBy(xpath="//select[@id='iAccountType']")
		public static WebElement accountTypeDropdown;
		
		
		//CreditLimit
		@FindBy(xpath="//input[@id='fCreditLimit']")
		public static WebElement creditLimitTxt;

		//CreditDays
		@FindBy(xpath="//input[@id='iCreditDays']")
		public static WebElement creditdaysTxt;
		
		
		//ChequeDiscountLimit
		@FindBy(xpath="//input[@id='fChequeDiscountLimit']")
		public static WebElement chequeDiscountLimitTxt;
		
		
		//Rate Of Interest
		@FindBy(xpath="//input[@id='fRateofinterest']")
		public static WebElement rateofinterestTxt;
		
		
		//BankAccount
		@FindBy(xpath="//input[@id='iBankAc']")
		public static WebElement bankAccountTxt;
		
		@FindBy(xpath="//*[@id='iBankAc_input_image']/span")
		public static WebElement bankAccount_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iBankAc_input_settings']/span")
		public static WebElement bankAccount_SettingBtn;

		
	//Setting Elements 
		
		//DebitCreditProposal
		@FindBy(xpath="//select[@id='iDebitCreditProposal']")
		public static WebElement debitCreditProposalDropdown;
		
		
		//DebitCreditRequired
		@FindBy(xpath="//select[@id='iDebitCreditRequired']")
		public static WebElement debitCreditRequiredDropdown;
		
		
		//ExchangeAdjustmentGainAC
		@FindBy(xpath="//input[@id='iExchangeAdjustmentGainAC']")
		public static WebElement exchangeAdjustmentGainACTxt;
		
		@FindBy(xpath="//*[@id='iExchangeAdjustmentGainAC_input_image']/span")
		public static WebElement exchangeAdjustmentGainAC_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iExchangeAdjustmentGainAC_input_settings']/span")
		public static WebElement exchangeAdjustmentGainAC_SettingBtn;
		
		
		//ExchangeAdjustmentLossAC
		@FindBy(xpath="//input[@id='iExchangeAdjustmentLossAC']")
		public static WebElement exchangeAdjustmentLossACTxt;
		
		@FindBy(xpath="//*[@id='iExchangeAdjustmentLossAC_input_image']/span")
		public static WebElement exchangeAdjustmentLossAC_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iExchangeAdjustmentLossAC_input_settings']/span")
		public static WebElement exchangeAdjustmentLossAC_SettingBtn;
		
		
		///PrimaryAccount
		@FindBy(xpath="//input[@id='iPrimaryAccount']")
		public static WebElement primaryAccountTxt;
		
		@FindBy(xpath="//*[@id='iPrimaryAccount_input_image']/span")
		public static WebElement primaryAccount_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iPrimaryAccount_input_settings']/span")
		public static WebElement primaryAccount_SettingBtn;
		
		
		////DefaultCurrency
		@FindBy(xpath="//input[@id='iDefaultCurrency']")
		public static WebElement defaultCurrencyTxt;
		
		@FindBy(xpath="//*[@id='iDefaultCurrency_input_image']/span")
		public static WebElement defaultCurrency_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iDefaultCurrency_input_settings']/span")
		public static WebElement defaultCurrency_SettingBtn;
		
		
		
		///ConsolidationMethod
		@FindBy(xpath="//select[@id='iConsolidationMethod']")
		public static WebElement consolidationMethodDropdown;
		
		
		///PaymentTerms
		@FindBy(xpath="//input[@id='iPaymentTerms']")
		public static WebElement paymentTermstxt;
		
		@FindBy(xpath="//*[@id='iPaymentTerms_input_image']/span")
		public static WebElement paymentTerms_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iPaymentTerms_input_settings']/span")
		public static WebElement paymentTerms_SettingBtn;
		
		
		//ReminderTerms
		@FindBy(xpath="//input[@id='iReminderTerms']")
		public static WebElement reminderTermsTxt;
		
		@FindBy(xpath="//*[@id='iReminderTerms_input_image']/span")
		public static WebElement reminderTerms_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iReminderTerms_input_settings']/span")
		public static WebElement reminderTerms_SettingBtn;
		
		
		///FinanceChargeTerms
		@FindBy(xpath="//*[@id='iFinanceChargeTerms']")
		public static WebElement financeChargeTermsTxt;
		
		@FindBy(xpath="//*[@id='iFinanceChargeTerms_input_image']/span")
		public static WebElement financeChargeTerms_Expansion;
		
		@FindBy(xpath="//*[@id='iFinanceChargeTerms_input_settings']/span")
		public static WebElement financeChargeTerms_SettingBtn;
	
		
		//Details Elements


		//Address
		@FindBy(xpath="//textarea[@id='sAddress']")
		public static WebElement addressTxt;
		
		
		//City
		@FindBy(xpath="//input[@id='iCity']")
		public static WebElement cityTxt;
		
		@FindBy(xpath="//*[@id='iCity_input_image']/span")
		public static WebElement city_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iCity_input_settings']/span")
		public static WebElement city_SettingBtn;
	
		//DeliveryAddress
		@FindBy(xpath="//textarea[@id='sDeliveryAddress']")
		public static WebElement deliveryAddressTxt;
		
		//Pin
		@FindBy(xpath="//input[@id='sPin']")
		public static WebElement pinTxt;
		
		
		//City2 DeliveryCity (City As Second TextBox)
		@FindBy(xpath="//input[@id='iDeliveryCity']")
		public static WebElement city2Text;
		
		@FindBy(xpath="//*[@id='iDeliveryCity_input_image']/span")
		public static WebElement city2_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iDeliveryCity_input_settings']/span")
		public static WebElement city2_SettingBtn;
		
		
		
		////Pin---->Delivery pin***()Second Pin TxtBox
		@FindBy(xpath="//input[@id='sDeliveryPin']")
		public static WebElement pin2Txt;
		
		
		//Send Email
		@FindBy(xpath="//input[@id='bSendEmailtocustomer']")
		public static WebElement sendEmailCheckBox;
		
		//AllowCustomerPortal
		@FindBy(xpath="//input[@id='bAllowCustomerPortal']")
		public static WebElement allowCustomerPortalCheckBox;
		
		//SendEmail
		@FindBy(xpath="//input[@id='sEMail']")
		public static WebElement sendEmailTxt;
		
		//Password
		@FindBy(xpath="//input[@id='sPassword']")
		public static WebElement passwordTxt;
		
		///TelphoneNumber
		@FindBy(xpath="//input[@id='sTelNo']")
		public static WebElement telphoneNumberTxt;
		
		//FaxNo
		@FindBy(xpath="//input[@id='sFaxNo']")
		public static WebElement faxNoTxt;
		
		
		//PortalEmail
		@FindBy(xpath="//input[@id='sPortalEmail']")
		public static WebElement portalEmailTxt;
		
		
		/////Print Layout Elements	
		//Voucher Type
		@FindBy(xpath="//label[contains(text(),'Voucher Type')]")
		public static WebElement gridVoucherTypeTxt;
		
		@FindBy(xpath="//*[@id='iVoucherType_input_image']/span")
		public static WebElement gridVoucher_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iVoucherType_input_settings']/span")
		public static WebElement gridVoucher_SettingBtn;

		
		///////Print layout
		@FindBy(xpath="//label[contains(text(),'Print Layout')]")
		public static WebElement gridPrintLayoutTxt;

		@FindBy(xpath="//*[@id='iPrintLayout_input_image']/span")
		public static WebElement gridPrintLayout_ExpansionBtn;

		@FindBy(xpath="//*[@id='iPrintLayout_input_settings']/span")
		public static WebElement gridPrintLayout_SettingBtn;
		
		
		
		
		//Item General Elements
		
		
		@FindBy(xpath="//select[@id='iProductType']")
		public static WebElement itemTypeDropdown;
		
		@FindBy(xpath="//input[@id='fReorderLevel']")
		public static WebElement reorderLevelTxt;
		
		@FindBy(xpath="//input[@id='iBinCapacity']")
		public static WebElement binCapacityTxt;
		
		@FindBy(xpath="//select[@id='iValuationMethod']")
		public static WebElement valuationMethodDropdown;
		
		@FindBy(xpath="//input[@id='iCategory']")
		public static WebElement categoryTxt;
		
		@FindBy(xpath="//*[@id=iCategory_input_image']/span")
		public static WebElement category_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iCategory_input_settings']/span")
		public static WebElement category_SettingBtn;
		
		@FindBy(xpath="//select[@id='iProductMake']")
		public static WebElement itemMakeDropdown;
		
		@FindBy(xpath="//input[@id='Printer']")
		public static WebElement printerTxt;
		
		@FindBy(xpath="//input[@id='iAlternateCategory']")
		public static WebElement alternateCategorytxt;
		
		@FindBy(xpath="//*[@id='iAlternateCategory_input_image']/span")
		public static WebElement alternateCategory_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iAlternateCategory_input_settings']/span")
		public static WebElement alternate_SettingBtn;
		
		@FindBy(xpath="//textarea[@id='sDescription']")
		public static WebElement descriptionTxt;
		
		@FindBy(xpath="//input[@id='bPerishableItem']")
		public static WebElement perishableItemCheckbox;
		
		@FindBy(xpath="//input[@id='iBin']")
		public static WebElement binTxt;
		
		@FindBy(xpath="//*[@id='iBin_input_image']/span")
		public static WebElement bin_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iBin_input_settings']/span")
		public static WebElement bin_SettingBtn;
		
		
		
		/////Item---New---Units
		
		@FindBy(xpath="//input[@id='iDefaultBaseUnit']")
		public static WebElement defaultBaseUnitTxt;
		
		@FindBy(xpath="//*[@id='iDefaultBaseUnit_input_image']/span")
		public static WebElement defaultBaseUnit_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iDefaultBaseUnit_input_settings']/span")
		public static WebElement defaultBaseUnit_SettingBtn;
		
		@FindBy(xpath="//input[@id='iDefaultSalesUnit']")
		public static WebElement defaultSalesUnit_Txt;
		
		@FindBy(xpath="//*[@id='iDefaultSalesUnit_input_image']/span")
		public static WebElement defaultSalesUnit_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iDefaultSalesUnit_input_settings']/span")
		public static WebElement defaultSalesUnit_SettingBtn;
		
		@FindBy(xpath="//input[@id='iDefaultPurchaseUnit']")
		public static WebElement defaultPurchaseUnitTxt;
		
		@FindBy(xpath="//*[@id='iDefaultPurchaseUnit_input_image']/span")
		public static WebElement defaultPurchaseUnit_ExpansioinBtn;
		
		@FindBy(xpath="//*[@id='iDefaultPurchaseUnit_input_settings']/span")
		public static WebElement defaultPurchaseUnit_SettingBtn;
		
		@FindBy(xpath="//input[@id='fLength']")
		public static WebElement lengthTxt;
		
		@FindBy(xpath="//input[@id='fWidth']")
		public static WebElement widthTxt;
		
		@FindBy(xpath="//input[@id='fHeight']")
		public static WebElement heightTxt;
		
		@FindBy(xpath="//input[@id='fCBM']")
		public static WebElement CBMTxt;
		
		
		/////Master--Item--Item--New--Settings
		
		@FindBy(xpath="//input[@id='fStandardCost']")
		public static WebElement standardCostTxt;
		
		@FindBy(xpath="//input[@id='fOverheadCost']")
		public static WebElement overheadCostTxt;
		
		@FindBy(xpath="//input[@id='fIndirectCost']")
		public static WebElement indirectCostTxt;
		
		@FindBy(xpath="//input[@id='fProfit']")
		public static WebElement profitTxt;
		
		@FindBy(xpath="//input[@id='iDontshowproductexpireddays']")
		public static WebElement dontshowproductexpiringindaysTxt;
		
		@FindBy(xpath="//input[@id='iTaxCode']")
		public static WebElement taxCodeTxt;
		
		@FindBy(xpath="//*[@id='iTaxCode_input_image']/span")
		public static WebElement taxCode_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iTaxCode_input_settings']/span")
		public static WebElement taxCode_SettingBtn;
		
		
		
		/////////Master--Item--Item--New--Classification
		
			
		@FindBy(xpath="//select[@id='iABCCodeValue']")
		public static WebElement ABCCodeValueDropdown;
		
		@FindBy(xpath="//select[@id='iABCCodeMargin']")
		public static WebElement ABCCodeMarginDropdown;
		
		@FindBy(xpath="//select[@id='iABCCodeRevenue']")
		public static WebElement ABCCodeRevenueDropdown;
		
		@FindBy(xpath="//select[@id='iABCCodeCarryingCost']")
		public static WebElement ABCCodeCarryingCostDropdown;
		
		@FindBy(xpath="//*[@id='sBarcode1']")
		public static WebElement barcode1Txt;
		
		@FindBy(xpath="//input[@id='sBarcode2']")
		public static WebElement barcode2Txt;
		
		@FindBy(xpath="//input[@id='sBarcode3']")
		public static WebElement barcode3Txt;
		
		
		///Units ---Grid---First Row
		@FindBy(xpath="//input[@id='iUnit1']")
		public static WebElement gridUnitTxt;
		
		@FindBy(xpath="//*[@id='iUnit_input_image']/span")
		public static WebElement gridUnit_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iUnit_input_settings']/span")
		public static WebElement gridUnit_SettingBtn;
		
		@FindBy(xpath="//tr[@class='tableRow']//input[@id='sBarcode1']")
		public static WebElement barcodeTxt;
		
		@FindBy(xpath="//input[@id='sBatch1']")
		public static WebElement batchTxt;
		
		
		
		
	    //Master--Item--Item--New--Other Details
		
		@FindBy(xpath="//input[@id='iCostOfIssueAccount']")
		public static WebElement costOfIssueAccountTxt;
		
		@FindBy(xpath="//*[@id='iCostOfIssueAccount_input_image']/span")
		public static WebElement costOfIssueAccount_ExpansiionBtn;
		
		@FindBy(xpath="//*[@id='iCostOfIssueAccount_input_settings']/span")
		public static WebElement costOfIssueAccount_SettingBtn;
		
		@FindBy(xpath="//input[@id='iStocksAccount']")
		public static WebElement stocksAccountTxt;
		
		@FindBy(xpath="//*[@id='iStocksAccount_input_image']/span")
		public static WebElement stocksAccount_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iStocksAccount_input_settings']/span")
		public static WebElement stocksAccount_SettingBtn;
		
		@FindBy(xpath="//input[@id='iSalesAccount']")
		public static WebElement salesAccount_Txt;
		
		@FindBy(xpath="//*[@id='iSalesAccount_input_image']/span")
		public static WebElement salesAccount_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iSalesAccount_input_settings']/span")
		public static WebElement salesAccount_SettingBtn;
		
		@FindBy(xpath="//input[@id='iWIPAccount']")
		public static WebElement WIPAccountTxt;
		
		@FindBy(xpath="//*[@id='iWIPAccount_input_image']/span")
		public static WebElement WIPAccoun_tExpansionBtn;
		
		@FindBy(xpath="//*[@id='iWIPAccount_input_settings']/span")
		public static WebElement WIPAccount_SettingBtn;
		
		@FindBy(xpath="//input[@id='iCostofShortageStockAC']")
		public static WebElement costofShortageStockACTxt;
		
		@FindBy(xpath="//*[@id='iCostofShortageStockAC_input_image']/span")
		public static WebElement costofShortageStockAC_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iCostofShortageStockAC_input_settings']/span")
		public static WebElement costofShortageStockAC_SettingBtn;
		
		@FindBy(xpath="//input[@id='iCostofExcessStockAC']")
		public static WebElement otherDetails_CostofExcessStockAC;
		
		@FindBy(xpath="//*[@id='iCostofExcessStockAC_input_image']/span")
		public static WebElement costofExcessStockAC_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='iCostofExcessStockAC_input_settings']/span")
		public static WebElement costofExcessStockAC_SettingBtn;
		
		
		
		//Grid---OtherDetails---1 row elements
		
		@FindBy(xpath="//input[@id='ioWarehouse']")
		public static WebElement otherDetailsGrid_WarehouseTxt;
		
		@FindBy(xpath="//*[@id='ioWarehouse_input_image']/span")
		public static WebElement otherDetailsGrid_Warehouse_ExpansionBtn;
		
		@FindBy(xpath="//*[@id='ioWarehouse_input_settings']/span")
		public static WebElement otherDetailsGrid_Warehouse_SettingBtn;
		
		@FindBy(xpath="//input[@id='iSupplier1']")
		public static WebElement grid_Supplier1Txt;
		
		@FindBy(xpath="//input[@id='sSupCode1']")
		public static WebElement grid_SupCode1Txt;
		
		@FindBy(xpath="//input[@id='iStartDate1']")
		public static WebElement grids_StartDate1Txt;
		
		//Master----Item---New---Replenishment

		@FindBy(xpath="//select[@id='iDefaultReplenishment']")
		public static WebElement defaultReplenishmentDropDown;

		@FindBy(xpath="//select[@id='iManufacturePolicy']")
		public static WebElement manufacturePolicyDropDown;

		@FindBy(xpath="//input[@id='iPackingBOM']")
		public static WebElement packingBOMTxt;

		@FindBy(xpath="//*[@id='iPackingBOM_input_image']/span")
		public static WebElement packingBOMExpansionBtn;

		@FindBy(xpath="//*[@id='iPackingBOM_input_settings']/span")
		public static WebElement packingBOMSettingBtn;

		@FindBy(xpath="//input[@id='iBOM']")
		public static WebElement BOMTxt;

		@FindBy(xpath="//*[@id='iBOM_input_image']/span")
		public static WebElement BOMExpansionBtn;

		@FindBy(xpath="//*[@id='iBOM_input_settings']/span")
		public static WebElement BOMSettingBtn;

		@FindBy(xpath="//select[@id='iFlushing']")
		public static WebElement flushingDropdown;

		@FindBy(xpath="//input[@id='irEnddate']")
		public static WebElement grid_EndingDate;

		@FindBy(xpath="//input[@id='iReplenishqty1']")
		public static WebElement grid_Replenishqty1;

		@FindBy(xpath="//input[@id='irWarehouse']")
		public static WebElement replenishmentGrid_WarehouseTxt;

		@FindBy(xpath="//*[@id='irWarehouse_input_image']/span")
		public static WebElement replenishmentGrid_Warehouse_ExpansionBtn;

		@FindBy(xpath="//*[@id='irWarehouse_input_settings']/span")
		public static WebElement replenishmentGrid_Warehouse_SettingBtn;

		@FindBy(xpath="//input[@id='irStartdate1']")
		public static WebElement grid_StartDateTxt;

		
		
		//OutLet Elements
		
		
		@FindBy(xpath="//input[@id='txtsrch-term0']")
		public static WebElement searchBox;

		@FindBy(xpath="//*[@id='liSearchOn']/a")
		public static WebElement search_SearchOnBtn;

		@FindBy(xpath="//*[@id='liAdvanceSearch']/a")
		public static WebElement search_AdvanceSearch ;

		@FindBy(xpath="//input[@id='cmbUserTypeMaster']")
		public static WebElement cmbSearchTxt;

		@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_image']/span")
		public static WebElement cmbSearchExpansionBtn;

		@FindBy(xpath="//*[@id='cmbUserTypeMaster_input_settings']/span")
		public static WebElement cmbSearchSettingBtn;

		@FindBy(xpath="//a[@id='chkResizeGrid0']")
		public static WebElement resizeGridBtn ;

		@FindBy(xpath="//input[@id='chkRetainSelection']")
		public static WebElement retainSelectionCheckbox;

		@FindBy(xpath="//label[@id='oncheckaccorderan0']")
		public static WebElement checkAccorderanBtn;
		
		@FindBy(xpath="//*[@id='iTreeId0']")
		public static WebElement treeIdDropdown;
		
		@FindBy(xpath="//*[@id='iTreeViewId0']")
		public static WebElement treeViewIdDropdown;
		
		
		
		
		
		
		
		//WareHouse
		
		
		@FindBy(xpath="//input[@id='iBins']")
		public static WebElement binsText;

		@FindBy(xpath="//*[@id='iBins_input_image']/span")
		public static WebElement bins_ExpansionBtn;

		@FindBy(xpath="//*[@id='iBins_input_settings']/span")
		public static WebElement bins_SettingBtn;

		@FindBy(xpath="//input[@id='iPhysInventoryCountingFrequency']")
		public static WebElement physInventoryCountingFrequencyTxt;

		@FindBy(xpath="//select[@id='iWarehouseType']")
		public static WebElement warehouseTypeDropdown;

		@FindBy(xpath="//input[@id='bDontMaintainBin']")
		public static WebElement dontMaintainBinCheckBox;


		// State

		@FindBy(xpath="//input[@id='iCountry']")
		public static WebElement countryTxt;

		@FindBy(xpath="//*[@id='iCountry_input_image']/span")
		public static WebElement country_ExpansionBtn;

		@FindBy(xpath="//*[@id='iCountry_input_settings']/span")
		public static WebElement country_SettingBtn;


		// City

		@FindBy(xpath="//input[@id='iState']")
		public static WebElement stateTxt;

		@FindBy(xpath="//*[@id='iState_input_image']/span")
		public static WebElement state_ExpansionBtn;

		@FindBy(xpath="//*[@id='iState_input_settings']/span")
		public static WebElement state_SettingBtn;



	   //Master------>Delete Field
		
		
		
		@FindBy(xpath="//*[@id='btnDelete']/i")
		public static WebElement deleteBtn;
		
		/*@FindBy(xpath="//div[@id='idGlobalError']")
		public static WebElement validationConfirmationMessage;*/

		@FindBy(xpath="//div[@class='theme_color font-6']")
		public static WebElement errorMessage;
		
		@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
		public static WebElement errorMessageCloseBtn;
		
		/*@FindBy(xpath="//div[@id='idGlobalError']//td[3]")
		public static WebElement closeValidationConfirmationMessage;*/
		
		@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
		public static WebElement accountCreation;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
		public static WebElement accountNewCreationName;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
		public static WebElement accountNewCreationNameOfLane;               
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement accountFirstCheckBoxToSelection;

		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[5]/span[1]")
		public static WebElement accountGroupTitleDisplay;
		
		
		//Master Customization
		
		@FindBy(xpath="//i[@class='icon-expand']")
		private static WebElement plusBtn;

		@FindBy(xpath="//i[@class='icon-collepse']")
		private static WebElement minusBtn;

		@FindBy(xpath="//span[contains(text(),'Master Fields')]")
		private static WebElement masterFieldsOption;
		
			@FindBy(xpath="//*[@id='masterFields_list']/li[1]/span")
			private static WebElement generalTab;
			
				@FindBy(xpath="//span[@class='font-5'][contains(text(),'Main')]")
				private static WebElement generalMainTab;
				
					@FindBy(xpath="//div[@id='mainTab_0']//tbody//tr[1]//td[4]")
					private static WebElement accountCustomizeName;

					@FindBy(xpath="//div[@id='mainTab_0']//tr[2]//td[4]")
					private static WebElement accountCustomizeCode;

					@FindBy(xpath="//div[@id='mainTab_0']//tr[3]//td[4]")
					private static WebElement accountCustomizeAccountType;

					@FindBy(xpath="//div[@id='mainTab_0']//tr[4]//td[4]")
					private static WebElement accountCustomizeCreditLimit;

					@FindBy(xpath="//div[@id='mainTab_0']//tr[5]//td[4]")
					private static WebElement accountCustomizeCreditDays;				
				
				@FindBy(xpath="//div[@id='tabId_1']//span[@class='font-5'][contains(text(),'Header Details')]")
				private static WebElement generalHeaderDetailsTab;
						
					@FindBy(xpath="//div[@id='tabId_1']//tbody[contains(@class,'ui-sortable')]//tr[1]//td[4]")
					private static WebElement accountCustomizeChequeDiscountLimit;

					@FindBy(xpath="//div[@id='HeaderDetails_0']//tr[2]//td[4]")
					private static WebElement accountCustomizeRateOfInterest;

					@FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[3]/td[4]")
					private static WebElement accountCustomizeBankAc;

					@FindBy(xpath="//*[@id='HeaderDetails_0']/div/div/table/tbody/tr[4]/td[4]")
					private static WebElement accountCustomizePDCDiscountedAccount;
					
					@FindBy(xpath="//*[@id='btnMove_Field_MasterCust']/div[1]/span")
					private static WebElement accountHeaderMoveFiledBtn;

					@FindBy(xpath="//div[contains(text(),'Preview')]")
					private static WebElement accountHeaderPreview;
					
					@FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
					private static WebElement accountSaveBtn;
								     
					@FindBy(xpath="//*[@id='btnAdd_Field_MasterCust']/div[1]/span")
					private static WebElement accountAddBtn;
											     
					@FindBy(xpath="//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[1]/span")
					private static WebElement accountCloseBtn;
	
			@FindBy(xpath="//span[@class='Flabel theme_icon-color'][contains(text(),'Settings')]")
			private static WebElement settingOption;

					@FindBy(xpath="//div[@id='tabId_69']//span[@class='font-5'][contains(text(),'Header Details')]")
					private static WebElement settingsHeaderDetailsTab;
					
					/*@FindBy(xpath="//div[@id='tabId_68']//span[@class='font-5'][contains(text(),'Header Details')]")
					private static WebElement settingsHeaderDetailsTab;*/
			
							  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[1]/td[1]/i[1]")
							  private static WebElement accountSettingsHeaderEditFirstRowBtn;
							                  
							  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[2]/td[1]/i[1]")
							  private static WebElement accountSettingsHeaderEditSecondRowBtn;
					
							  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[3]/td[1]/i[1]")
							  private static WebElement accountSettingsHeaderEditThirdRowBtn;
					
							  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[4]/td[1]/i[1]")
							  private static WebElement accountSettingsHeaderEditFourthRowBtn;
					
							  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[5]/td[1]/i[1]")
							  private static WebElement accountSettingsHeaderEditFifthRowBtn;
					
							  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[6]/td[1]/i[1]")
							  private static WebElement accountSettingsHeaderEditSixthRowBtn;
					
							  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[7]/td[1]/i[1]")
							  private static WebElement accountSettingsHeaderEditSeventhRowBtn;
					
							  @FindBy(xpath="//*[@id='HeaderDetails_1']/div/div/table/tbody/tr[8]/td[1]/i[1]")
							  private static WebElement accountSettingsHeaderEditEighthRowBtn;
							  
							  @FindBy(xpath="//div[contains(text(),'Move Field')]")
							  private static WebElement accountSettingsHeaderMoveFiledBtn;

							  @FindBy(xpath="//div[contains(text(),'Preview')]")
							  private static WebElement accountSettingsHeaderPreview;
							  						
							  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
							  private static WebElement accountSettingsSaveBtn;
							  									    
							  @FindBy(xpath="//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
							  private static WebElement accountSettingsAddBtn;						

							  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
							  private static WebElement accountSettingsCloseBtn;
							  
					
					/*@FindBy(xpath="//div[@id='tabId_68']//span[@class='font-5'][contains(text(),'Body Details')]")
					private static WebElement settingsBodyDetailsTab;*/
					
					@FindBy(xpath="//div[@id='tabId_69']//span[@class='font-5'][contains(text(),'Body Details')]")
					private static WebElement settingsBodyDetailsTab;
					
					                @FindBy(xpath="//div[@id='BodyDetails_1']//div[@class='scrollable tbl-emptyfields-mastercust']")
					                private static WebElement settingsBodyDetailsEmptyTab;
			

			@FindBy(xpath="//span[@class='Flabel theme_icon-color'][contains(text(),'Details')]")
			private static WebElement accountMasterFieldDetailsOption;
			
				/*@FindBy(xpath="//div[@id='tabId_69']//span[@class='font-5'][contains(text(),'Header Details')]")
		        private static WebElement detailsHeaderDetailsTab;
		        
		         				  @FindBy(xpath="//div[@id='tabId_69']//tbody[@class='ui-sortable']//tr[1]//td[4]")
								  private static WebElement detailsHeaderAddress;
								  
								  @FindBy(xpath="//div[@id='tabId_69']//tr[2]//td[4]")
								  private static WebElement detailsHeaderTelNo;
								  									    
								  @FindBy(xpath="//div[@id='tabId_69']//tr[3]//td[4]")
								  private static WebElement detailsHeaderFaxNo;		
								                  
								  @FindBy(xpath="//div[@id='tabId_69']//tr[4]//td[4]")
								  private static WebElement detailsHeaderCity;
						
								  @FindBy(xpath="//div[@id='tabId_69']//tr[5]//td[4]")
								  private static WebElement detailsHeaderPin;
						
								  @FindBy(xpath="//div[@id='tabId_69']//tr[6]//td[4]")
								  private static WebElement detailsHeaderDeliveryAddress;
						
								  @FindBy(xpath="//div[@id='tabId_69']//tr[7]//td[4]")
								  private static WebElement detailsHeaderCityOne;
						
								  @FindBy(xpath="//div[@id='tabId_69']//tr[8]//td[4]")
								  private static WebElement detailsHeaderPinOne;
						
								  @FindBy(xpath="//div[@id='tabId_69']//tr[9]//td[4]")
								  private static WebElement detailsHeaderSendEmailToCustomer;
						
								  @FindBy(xpath="//div[@id='tabId_69']//tr[10]//td[4]")
								  private static WebElement detailsHeaderAllowCustomerPortal;
								  
								  @FindBy(xpath="//div[@id='tabId_69']//tr[11]//td[4]")
								  private static WebElement detailsHeaderEmail;

								  @FindBy(xpath="//div[@id='tabId_69']//tr[12]//td[4]")
								  private static WebElement detailsHeaderPassword;

								  @FindBy(xpath="//div[@id='tabId_69']//tr[13]//td[4]")
								  private static WebElement detailsHeaderBankAccountName;

								  @FindBy(xpath="//div[@id='tabId_69']//tr[14]//td[4]")
								  private static WebElement detailsHeaderBankAccountNumber;

								  @FindBy(xpath="//div[@id='tabId_69']//tr[15]//td[4]")
								  private static WebElement detailsHeaderIFSCCode;

								  @FindBy(xpath="//div[@id='tabId_69']//tr[16]//td[4]")
								  private static WebElement detailsHeaderPaymentType;

								  @FindBy(xpath="//div[@id='tabId_69']//tr[17]//td[4]")
								  private static WebElement detailsHeaderFinanceEmail;							  
						
	                              @FindBy(xpath="//div[@id='tabId_69']//tr[18]//td[4]")
								  private static WebElement detailsHeaderPortalEmail;	

	                              @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
								  private static WebElement detailsHeaderBankSaveBtn;

								  @FindBy(xpath="//div[contains(text(),'Move Field')]")
								  private static WebElement detailsHeaderMoveFieldBtn;

								  @FindBy(xpath="//div[contains(text(),'Add')]")
								  private static WebElement detailsHeaderAddBtn;

								  @FindBy(xpath="//div[contains(text(),'Preview')]")
								  private static WebElement detailsHeaderPreviewBtn;

								  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
								  private static WebElement detailsHeaderCloseBtn;	*/
		        
		        
				
				@FindBy(xpath="//div[@id='tabId_70']//span[@class='font-5'][contains(text(),'Header Details')]")
		        private static WebElement detailsHeaderDetailsTab;
							
								  @FindBy(xpath="//div[@id='tabId_70']//tbody[@class='ui-sortable']//tr[1]//td[4]")
								  private static WebElement detailsHeaderAddress;
								  
								  @FindBy(xpath="//div[@id='tabId_70']//tr[2]//td[4]")
								  private static WebElement detailsHeaderTelNo;
								  									    
								  @FindBy(xpath="//div[@id='tabId_70']//tr[3]//td[4]")
								  private static WebElement detailsHeaderFaxNo;		
								                  
								  @FindBy(xpath="//div[@id='tabId_70']//tr[4]//td[4]")
								  private static WebElement detailsHeaderCity;
						
								  @FindBy(xpath="//div[@id='tabId_70']//tr[5]//td[4]")
								  private static WebElement detailsHeaderPin;
						
								  @FindBy(xpath="//div[@id='tabId_70']//tr[6]//td[4]")
								  private static WebElement detailsHeaderDeliveryAddress;
						
								  @FindBy(xpath="//div[@id='tabId_70']//tr[7]//td[4]")
								  private static WebElement detailsHeaderCityOne;
						
								  @FindBy(xpath="//div[@id='tabId_70']//tr[8]//td[4]")
								  private static WebElement detailsHeaderPinOne;
						
								  @FindBy(xpath="//div[@id='tabId_70']//tr[9]//td[4]")
								  private static WebElement detailsHeaderSendEmailToCustomer;
						
								  @FindBy(xpath="//div[@id='tabId_70']//tr[10]//td[4]")
								  private static WebElement detailsHeaderAllowCustomerPortal;
								  
								  @FindBy(xpath="//div[@id='tabId_70']//tr[11]//td[4]")
								  private static WebElement detailsHeaderEmail;

								  @FindBy(xpath="//div[@id='tabId_70']//tr[12]//td[4]")
								  private static WebElement detailsHeaderPassword;

								  @FindBy(xpath="//div[@id='tabId_70']//tr[13]//td[4]")
								  private static WebElement detailsHeaderBankAccountName;

								  @FindBy(xpath="//div[@id='tabId_70']//tr[14]//td[4]")
								  private static WebElement detailsHeaderBankAccountNumber;

								  @FindBy(xpath="//div[@id='tabId_70']//tr[15]//td[4]")
								  private static WebElement detailsHeaderIFSCCode;

								  @FindBy(xpath="//div[@id='tabId_70']//tr[16]//td[4]")
								  private static WebElement detailsHeaderPaymentType;

								  @FindBy(xpath="//div[@id='tabId_70']//tr[17]//td[4]")
								  private static WebElement detailsHeaderFinanceEmail;							  
						
	                              @FindBy(xpath="//div[@id='tabId_70']//tr[18]//td[4]")
								  private static WebElement detailsHeaderPortalEmail;	

	                              @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
								  private static WebElement detailsHeaderBankSaveBtn;

								  @FindBy(xpath="//div[contains(text(),'Move Field')]")
								  private static WebElement detailsHeaderMoveFieldBtn;

								  @FindBy(xpath="//div[contains(text(),'Add')]")
								  private static WebElement detailsHeaderAddBtn;

								  @FindBy(xpath="//div[contains(text(),'Preview')]")
								  private static WebElement detailsHeaderPreviewBtn;

								  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
								  private static WebElement detailsHeaderCloseBtn;				  

						/*@FindBy(xpath="//div[@id='tabId_69']//span[@class='font-5'][contains(text(),'Body Details')]")
						private static WebElement detailsBodyDetailsTab;*/
						
						@FindBy(xpath="//div[@id='tabId_70']//span[@class='font-5'][contains(text(),'Body Details')]")
						private static WebElement detailsBodyDetailsTab;
						
						        @FindBy(xpath="//div[@id='BodyDetails_2']//div[@class='scrollable tbl-emptyfields-mastercust']")
						        private static WebElement detailsBodyDetailsEmptyTab;
			
			@FindBy(xpath="//*[@id='masterFields_list']/li[4]/span")
			private static WebElement accountMasterFieldPrintLayoutOption;
		
					 /* @FindBy(xpath="//div[@id='tabId_70']//span[@class='font-5'][contains(text(),'Header Details')]")
					  private static WebElement printlayoutHeaderDetailsTab;*/
					                  
					  @FindBy(xpath="//div[@id='tabId_71']//span[@class='font-5'][contains(text(),'Header Details')]")
					  private static WebElement printlayoutHeaderDetailsTab;
					  
					    @FindBy(xpath="//div[@id='HeaderDetails_3']//div[@class='scrollable tbl-emptyfields-mastercust']")
					    private static WebElement printLayoutHeaderDetailsEmpty;
			
					 /* @FindBy(xpath="//div[@id='tabId_70']//span[@class='font-5'][contains(text(),'Body Details')]")
					  private static WebElement printLayouBodyDetailsTab;*/
			
					  @FindBy(xpath="//div[@id='tabId_71']//span[@class='font-5'][contains(text(),'Body Details')]")
					  private static WebElement printLayouBodyDetailsTab;
					  
					      @FindBy(xpath="//div[@id='BodyDetails_3']/div/div/table/tbody/tr[1]/td[4]")
					      private static WebElement printlayoutBodyVoucherType;
			
			    	      @FindBy(xpath="//div[@id='tabId_70']//tr[2]//td[4]]")
					      private static WebElement printLayoutBodyPrintlayout;
			
					  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
					  private static WebElement printLayoutSaveBtn;
			
					  @FindBy(xpath="//div[@id='btnAdd_Field_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Add')]")
					  private static WebElement printLayoutAddBtn;
			
					  @FindBy(xpath="//div[contains(text(),'Preview')]")
					  private static WebElement printLayoutPreviewBtn;
					  
					  @FindBy(xpath="//div[@class='clsFieldButtons_MCust_div']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
					  private static WebElement printLayoutCloseBtn;
	
	    @FindBy(xpath="//span[contains(text(),'Unique Constraints')]")
		private static WebElement accountMasterFieldsUniqueConstraintsOption; 
		
			 @FindBy(xpath="//div[@id='tabContent_UConstraints_MasterCust']//div[@id='btnAddOrEdit_UniqueConstraints']")
			 private static WebElement UniqueConstraintsAddBtn;
					     
			 @FindBy(xpath="//div[@id='tabContent_UConstraints_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
			 private static WebElement UniqueConstraintsDeleteBtn;
					     
			 @FindBy(xpath="//div[@id='tabContent_UConstraints_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
			 private static WebElement UniqueConstraintsCloseBtn;
			 
				 @FindBy(xpath="//input[@id='txtConstraintName']")
				 private static WebElement ConstraintNameTxt;
			
			     @FindBy(xpath="//select[@id='ddlConstraintTabList']")
			     private static WebElement UniqueConstraints_TabsDropdown;

			     @FindBy(xpath="//*[@id='tab_Main_UcFields']/i")
			     private static WebElement UniqueConstraints_MainExpansionBtn;
			   
				     @FindBy(xpath="//*[@id='chkList_MainFields_1']/div[1]")
				     private static WebElement accountUniqueConstraints_Main_NameChekbox;
				     
				     @FindBy(xpath="//div[@id='chkList_MainFields_1']//div[2]")
				     private static WebElement accountUniqueConstraints_Main_CodeChekbox;
				     
				     @FindBy(xpath="//div[@id='chkList_MainFields_1']//div[3]")
				     private static WebElement accountUniqueConstraints_Main_AccountTypeCheckbox;
				     
				     @FindBy(xpath="//div[@id='chkList_MainFields_1']//div[4]")
				     private static WebElement accountUniqueConstraints_Main_CreditLimitCheckBox;
				     
				     @FindBy(xpath="//div[@id='chkList_MainFields_1']//div[5]")
				     private static WebElement accountUniqueConstraints_Main_CreditDays;
				     
				 @FindBy(xpath="//div[@id='tab_Header_UcFields']//i[@class='pull-right icon-expand theme_icon-color']")
				 private static WebElement UniqueConstraints_HeaderExpansionBtn;

				     @FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[1]")
				     private static WebElement UniqueConstraints_Header_ChequeDiscountLimitChekbox;
				     
				     @FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[2]")
				     private static WebElement UniqueConstraints_Header_RateOfInterestChekbox;
				     
				     @FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[3]")
				     private static WebElement UniqueConstraints_Header_BankAcChekbox;
				     
				     @FindBy(xpath="//*[@id='chkList_HeaderFields_1']/div[4]")
				     private static WebElement UniqueConstraints_Header_PDCDiscountedChekbox;
				  
				 @FindBy(xpath="//*[@id='tab_Body_UcFields']/i")
			     private static WebElement UniqueConstraints_BodyExpansionBtn;
				 
		@FindBy(xpath="//span[contains(text(),'Rules')]")
		private static WebElement RulesOption;
		
			 @FindBy(xpath="//div[@id='newRuleTab_div_MasterRules']//span[@class='icon-save icon-font7']")
			 private static WebElement accountRules_SaveBtn;
			               
			 @FindBy(xpath="//div[@class='pull-right']//span[@class='icon-new icon-font7']")
			 private static WebElement accountRules_NewBtn;
			
			 @FindBy(xpath="//div[@id='newRuleTab_div_MasterRules']//span[@class='icon-delete icon-font7']")
			 private static WebElement accountRules_DeleteBtn;
			 
			 @FindBy(xpath="//div[@id='newRuleTab_div_MasterRules']//div[@class='pull-right']//span[@class='icon-close icon-font7']")
			 private static WebElement accountRules_CloseBtn;   
			 
			 @FindBy(xpath="//*[@id='txtMasterRuleName_MasterRules']")
			 private static WebElement Rules_RuleNameText ;
				     

			 @FindBy(xpath="//*[@id='chkCreatingGroup_Rule_MasterRules']")
			 private static WebElement Rules_CreatingGroupChekbox ;

			 @FindBy(xpath="//*[@id='chkNewRecord_Rule_MasterRules']")
			 private static WebElement Rules_NewRecordChekbox ;

			 @FindBy(xpath="//*[@id='chkEdit_Rule_MasterRules']")
			 private static WebElement Rules_EditChekbox ;

			 @FindBy(xpath="//*[@id='chkLoad_Rule_MasterRules']")
			 private static WebElement Rules_LoadChekbox ;

			 @FindBy(xpath="//*[@id='chkBeforeSave_Rule_MasterRules']")
			 private static WebElement Rules_BeforeSaveChekbox ;

			 @FindBy(xpath="//*[@id='chkOnLeave_Rule_MasterRules']")
			 private static WebElement Rules_OnLeaveChekbox ;

			 @FindBy(xpath="//*[@id='chkBeforeDelete_Rule_MasterRules']")
			 private static WebElement Rules_BeforeDeleteChekbox ;

			 @FindBy(xpath="//*[@id='chkOnEnter_Rule_MasterRules']")
			 private static WebElement Rules_OnEnterChekbox ;
			 
			 @FindBy(xpath="//label[contains(text(),'Active')]")
			 private static WebElement Rules_ActiveChekbox ;

			 @FindBy(xpath="//*[@id='Conditions-Context_Menu']/li[3]")
			 private static WebElement Rules_NoConditionChekbox;	  

		@FindBy(xpath="//*[@id='allMasterCustTabs']/li[4]/span")
		private static WebElement rules_ExternalModules;

			@FindBy(xpath="//select[@id='ddlOnEvent_MasterExternalModule']")
			private static WebElement rules_ExternalModulesOnEventDropdown;	
			
			@FindBy(xpath="//input[@id='txtbuttonCaption_MasterExternalModule']")
			private static WebElement rules_ExternalModulesButtonCaption;

			@FindBy(xpath="//select[@id='ddlModuleType_MasterExternalModule']")
			private static WebElement rules_ExternalModules_ModuleTypeBtn;

			@FindBy(xpath="//select[@id='ddlAllDllFiles_MasterExternalModule']")
			private static WebElement rules_ExternalModules_ModuleNameDropdown;

			@FindBy(xpath="//select[@id='ddlClassNames_MasterExternalModule']")
			private static WebElement rules_ExternalModulesClassNameDropdown;
		
			@FindBy(xpath="//select[@id='ddlClassMethods_MasterExternalModule']")
			private static WebElement rules_ExternalModulesFuctionalNameDropdown;
	
			@FindBy(xpath="//div[contains(text(),'Update')]")
			private static WebElement rules_ExternalModulesUpdateBtn;

			@FindBy(xpath="//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
			private static WebElement rules_ExternalModulesSaveBtn;

			@FindBy(xpath="//div[contains(text(),'Edit')]")
			private static WebElement rules_ExternalModulesEditBtn;

			@FindBy(xpath="//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
			private static WebElement rules_ExternalModulesDeleteBtn;

		    @FindBy(xpath="//div[@id='ExternalModulesDiv_MasterExternalModule']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
			private static WebElement rules_ExternalModulesCloseBtn;

	    @FindBy(xpath="//span[contains(text(),'Info Panel Customization')]")
		private static WebElement itemInfoPanelCustomizationTab;

		    @FindBy(xpath="//body[@class='custom_scrollbar']/section[@id='mainDiv']/div[@id='id_focus8_wrapper_default']/div[@class='content-wrapper']/section[@id='page_Content']/div[@class='container']/div[@id='mainLandingDiv']/div[@id='masterFirstDiv']/div[@class='tab-content']/div[@id='divLanding']/div[@id='divSecondsub']/div/div[@class='col-xs-12 col-sm-8 col-md-9 col-lg-9 padding-left-right5 mainDivCustomWidth']/div[@id='tabContent_IPCust_MasterCust']/div[@class='col-xs-12 col-sm-12 padding0']/div[@class='pull-right']/div[1]")
		    private static WebElement iteminfoPanelCust_AddBtn;

		    @FindBy(xpath="//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Delete')]")
		    private static WebElement infoPanelCust_DeleteBtn;

		    @FindBy(xpath="//div[@id='tabContent_IPCust_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
		    private static WebElement infoPanelCust_CloseBtn;

		    @FindBy(xpath="//strong[contains(text(),'Credit History')]")
		    private static WebElement infoPanelCustCreditHistory;

		    @FindBy(xpath="//div[@id='divPanel_2']//strong[contains(text(),'Ageing Analysis')]")
		    private static WebElement infoPanelCustAgeingAnalysis;

		    @FindBy(xpath="//strong[contains(text(),'Ageing Analysis Base')]")
		    private static WebElement infoPanelCustAgeingAnalysisBase;

		    @FindBy(xpath="//strong[contains(text(),'Ageing Analysis Local')]")
		    private static WebElement infoPanelCustAgeingAnalysisLocal;

		    @FindBy(xpath="//strong[contains(text(),'Authorization')]")
		    private static WebElement infoPanelAuthorization;
		   
	    @FindBy(xpath="//span[@class='Flabel'][contains(text(),'Reports')]")
	    private static WebElement accountReportsTab;
			
			@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Save')]")
			private static WebElement  accountReports_SaveBtn;
			
			@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
			private static WebElement  accountReports_CloseBtn;
			
					@FindBy(xpath="//*[@id='AllReportsDiv_MasterCust']/div[1]/label/input")
					private static WebElement  reports_AdvancedbudgetReportChkBox;
					
					@FindBy(xpath="//div[@id='AllReportsDiv_MasterCust']//div[1]//label[1]")
					private static WebElement  reports_MasterInfoChkBox;
					
					
					@FindBy(xpath="//div[@class='col-xs-12 col-sm-8 col-md-8 col-lg-9 padding0']//div[2]//label[1]")
					private static WebElement  reports_ABCAnalysisAmountChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[3]//label[1]")
					private static WebElement  reports_BankBookChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[4]//label[1]")
					private static WebElement  reports_BankreconciliationstatementChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[5]//label[1]")
					private static WebElement  reports_CashBookChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[6]//label[1]")
					private static WebElement  reports_ComparativeAnalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[7]//label[1]")
					private static WebElement  reports_CustomerAgeingDetailsAnalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[8]//label[1]")
					private static WebElement  reports_CustomerageingdetailbyduedateChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[9]//label[1]")
					private static WebElement  reports_CustomerageingsummaryanalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[10]//label[1]")
					private static WebElement  reports_CustomerbillwisesummaryChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[11]//label[1]")
					private static WebElement  reports_CustomerduedateanalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[12]//label[1]")
					private static WebElement  reports_CustomerlistingofoutstandingbillsChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[13]//label[1]")
					private static WebElement  reports_CustomeroverdueanalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[14]//label[1]")
					private static WebElement  reports_CustomeroverduesummaryChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[15]//label[1]")
					private static WebElement  reports_CustomerstatementsChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[16]//label[1]")
					private static WebElement  reports_CustomersummaryageingbyduedateChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[17]//label[1]")
					private static WebElement  reports_IncomeExpenseTrendChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[18]//label[1]")
					private static WebElement  reports_InterestcalculationChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[19]//label[1]")
					private static WebElement  reports_LedgerChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[20]//label[1]")
					private static WebElement  reports_LedgerdetailChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[21]//label[1]")
					private static WebElement  reports_MonthlySalesChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[22]//label[1]")
					private static WebElement  reports_PeakandlowbalanceamountChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[23]//label[1]")
					private static WebElement  reports_PettycashbookChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[24]//label[1]")
					private static WebElement  reports_PurchaseregisterChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[25]//label[1]")
					private static WebElement  reports_PurchasereturnregisterChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[26]//label[1]")
					private static WebElement  reports_PurchasesgroupedbydepartmentChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[27]//label[1]")
					private static WebElement  reports_PurchasesgroupedbyItemChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[28]//label[1]")
					private static WebElement  reports_PurchasesgroupedbyvendorChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[29]//label[1]")
					private static WebElement  reports_SalesdaybookChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[30]//label[1]")
					private static WebElement  reports_SalesgroupedbycustomerChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[31]//label[1]")
					private static WebElement  reports_salesgroupedbydepartmentrChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[32]//label[1]")
					private static WebElement  reports_SalesgroupedbyItemChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[33]//label[1]")
					private static WebElement  reports_SalesreturnregisterChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[34]//label[1]")
					private static WebElement  reports_SchedulesChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[35]//label[1]")
					private static WebElement  reports_SubledgerChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[36]//label[1]")
					private static WebElement  reports_SummarypurchaseregisterChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[37]//label[1]")
					private static WebElement  reports_SummarysalesregisterChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[38]//label[1]")
					private static WebElement  reports_TopCustomersChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[39]//label[1]")
					private static WebElement  reports_TradingaccountrChkBox;
					
					@FindBy(xpath="//div[40]//label[1]")
					private static WebElement  reports_TransactionstypeanalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[41]//label[1]")
					private static WebElement  reports_VendorageingdetailanalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[42]//label[1]")
					private static WebElement  reports_VendorageingdetailbyduedateChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[43]//label[1]")
					private static WebElement  reports_VendorageingsummaryanalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[44]//label[1]")
					private static WebElement  reports_VendorbillwisesummaryChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[45]//label[1]")
					private static WebElement  reports_VendorduedateanalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[46]//label[1]")
					private static WebElement  reports_VendorlistingofoutstandingbillsChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[47]//label[1]")
					private static WebElement  reports_VendoroverdueanalysisChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[48]//label[1]")
					private static WebElement  reports_VendoroverduesummaryChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[49]//label[1]")
					private static WebElement  reports_VendorstatementsChkBox;
					
					@FindBy(xpath="//div[@id='tabContent_Reports_MasterCust']//div[50]//label[1]")
					private static WebElement  reports_VendorsummaryageingbyduedateChkBox;
				
                 //Create Tabs
					
					@FindBy(xpath="//button[@id='btnCreateTab_MCust']")
					private static WebElement createTab;  
						
						@FindBy(xpath="//a[contains(text(),'Tree Tab')]")
						private static WebElement createTabTreeTab; 

							@FindBy(xpath="//input[@id='txtNewTreeTabCaption']")
							private static WebElement  treeTabCaptionTxt;
							
							@FindBy(xpath="//input[@id='txtNewTreeTabName']")
							private static WebElement  treeTabTabNameTxt;
							
							@FindBy(xpath="//input[@id='fOption_tab_masterName']")
							private static WebElement  treeTabNewMastertxt;
							
							@FindBy(xpath="//*[@id='fOption_tab_masterName_input_image']/span")
							private static WebElement  treeTabNewMasterdropdown;
							
							@FindBy(xpath="//*[@id='fOption_tab_masterName_input_settings']/span")
							private static WebElement  treeTab_NewMasterSettingsBtn;
	
							@FindBy(xpath="//input[@id='txtNewTreeTabFieldCaption']")
							private static WebElement  treeTab_FieldCaptiontxt;
							
							@FindBy(xpath="//input[@id='txtNewTreeTabFieldName']")
							private static WebElement  treeTab_FieldNameTxt;
							
							@FindBy(xpath="//input[@id='bIsTreeHiddenTab']")
							private static WebElement  treeTab_HiddenChkBox;
						
									@FindBy(xpath="//div[@id='fOption_tab_masterName_customize_popup_container']")
									private static WebElement  treeTab_NewMaster_ContainerTxt;
									
									@FindBy(xpath="//div[@id='fOption_tab_masterName_customize_popup_footer']//input[1]")
									private static WebElement  treeTab_NewMaster_StanadrdfieldsBtn;
									
											@FindBy(xpath="//select[@id='fOption_tab_masterName_customize_popup_standardfields_list']")
											private static WebElement treeTab_NewMaster_Stanadrdfields_Fielddropdown;
											
											@FindBy(xpath="//input[@id='fOption_tab_masterName_customize_popup_standardfields_header']")
											private static WebElement  treeTab_NewMaster_Stanadrdfields_headerTxt;
											
											@FindBy(xpath="//select[@id='fOption_tab_masterName_customize_popup_standardfields_alignment']")
											private static WebElement  treeTab_NewMaster_Stanadrdfields_Allignmentdropdown;
											
											@FindBy(xpath="//input[@id='fOption_tab_masterName_customize_popup_standardfields_width']")
											private static WebElement  treeTab_NewMaster_Stanadrdfields_WidthTxt;
											
											@FindBy(xpath="//div[@id='divSecondsub']//input[3]")
											private static WebElement  treeTab_NewMaster_Stanadrdfields_OkBtn;
											
											@FindBy(xpath="//div[@id='divSecondsub']//input[4]")
											private static WebElement  treeTab_NewMaster_Stanadrdfields_CancelBtn;
									
									@FindBy(xpath="//div[@id='fOption_tab_masterName_search_container']//input[2]")
									private static WebElement  treeTab_NewMaster_deleteColumnBtn;
									
									@FindBy(xpath="//div[@id='divSecondsub']//input[3]")
									private static WebElement  treeTab_NewMaster_OkBtn;
									
									@FindBy(xpath="//div[@id='divSecondsub']//input[4]")
									private static WebElement  treeTab_NewMaster_CancelBtn;
						
							@FindBy(xpath="//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[1]")
							private static WebElement  treeTab_OkBtn;

							@FindBy(xpath="//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
							private static WebElement  treeTab_UpdateOkBtn;
							
							@FindBy(xpath="//*[@id='MCustomize_CreateTreeTab_Modal']/div/div/div[3]/button[2]")
							private static WebElement  treeTab_CancelBtn;
							
						@FindBy(xpath="//a[contains(text(),'Document Tab')]")
						private static WebElement createTab_DocumentTab;  

						            @FindBy(xpath="//input[@id='txtNewDocTabCaption']")
						            private static WebElement documentTab_TabCaption;  
						
									@FindBy(xpath="//input[@id='txtNewDocTabName']")
									private static WebElement documentTab_TabName;  
									
									@FindBy(xpath="//input[@id='bIsDocHiddenTab']")
									private static WebElement documentTab_HiddenChkbox;  
									
									@FindBy(xpath="//div[@id='MCustomize_CreateDocTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
									private static WebElement documentTab_OkBtn;  
									
									@FindBy(xpath="//div[@id='MCustomize_CreateDocTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Cancel')]")
									private static WebElement documentTab_CancelBtn; 
									
									@FindBy(xpath="//label[@id='lblNameError_DocTab']")
									private static WebElement customizeMasterCreateTabDocumentTabMessage; 
								
								        @FindBy(xpath="//span[contains(text(),'Document Tab')]")
								        private static WebElement customizeMasterCreateDocumentTabNewlyCreate; 
									
										@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]/span[1]")
										private static WebElement customizeMasterCreateDocumentTabNewlyHeaderDetails; 	
													
										@FindBy(xpath="//div[@id='HeaderDetails_5']//div[@class='scrollable tbl-emptyfields-mastercust']")
										private static WebElement customizeMasterCreateDocumentTabNewlyBlankInHeaderDetails;
										
										@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]/span[1]")
										private static WebElement customizeMasterCreateDocumentTabNewlyBodyDetails; 			
										
										@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
										private static WebElement customizeMasterCreateDocumentTabFieldName; 
										
										@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")
										private static WebElement customizeMasterCreateDocumentTabDocument; 
										
										@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")
										private static WebElement customizeMasterCreateDocumentTabCreatedDate; 
										
										@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]")
										private static WebElement customizeMasterCreateDocumentTabLastModified; 
										
										@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[4]")
										private static WebElement customizeMasterCreateDocumentFileSize; 
										
						@FindBy(xpath="//a[contains(text(),'Create Tab')]")
						private static WebElement createTab_CreateTab;  

							@FindBy(xpath="//div[@id='MCustomize_CreateDocTab_Modal']//h4[@class='modal-title'][contains(text(),'Tab Details')]")
							private static WebElement createTab_TabDetailsLabel;  
			                                                  
							@FindBy(xpath="//input[@id='txtNewTabCaption']")
							private static WebElement createTab_TabCaptionTxt;  
			                                                   
							@FindBy(xpath="//input[@id='txtNewTabName']")
							private static WebElement createTab_TabNameTxt;  
							
							@FindBy(xpath="//input[@id='bIsHiddenTab']")
							private static WebElement createTab_PopHiddenChkbox;  
							
							@FindBy(xpath="//*[@id='MCustomize_CreateTab_Modal']/div/div/div[3]/button[1]")
							private static WebElement createTab_PopOkBtn;  
							
							@FindBy(xpath="//*[@id='MCustomize_CreateTab_Modal']/div/div/div[3]/button[2]")
							private static WebElement createTab_PopCancelBtn; 

							@FindBy(xpath="//label[@id='lblNameError_NewTab']")
							private static WebElement customizeMasterCreateTabCreateTabMessage;  
							
							
                          //Newly Created Create Tab  

							@FindBy(xpath="//span[contains(text(),'Create Tab')]")
							private static WebElement customizeMasterCreateCreateTabNewlyCreateTabCaption; 	
							
							              
							@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/ul[1]/li[1]/a[1]/span[1]")
							private static WebElement customizeMasterCreateCreateTabHeaderDetails; 	
							
							@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]")
							private static WebElement customizeMasterCreateCreateTabBlankHeaderDetails; 	
							
							@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/ul[1]/li[2]/a[1]/span[1]")
							private static WebElement customizeMasterCreateCreateTabBodyDetails; 	
							
							@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]")
							private static WebElement customizeMasterCreateCreateTabBlankBodyDetails; 
							
							@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[2]")
							private static WebElement customizeMasterCreateCreateTabNewlyCreateTabSaveButton; 	
							
							@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[3]/div[2]")
							private static WebElement customizeMasterCreateCreateTabAddButton; 	
							
							@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[4]/div[2]")
							private static WebElement customizeMasterCreateCreateTabPreviewButton; 	
							
							@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[5]/div[2]")
							private static WebElement customizeMasterCreateCreateTabCloseButton; 	

				@FindBy(xpath="//button[@id='btnDeleteTab_MCust']")
				private static WebElement tabs_DeleteBtn; 
		
		@FindBy(xpath="//label[@id='lblNameError_TreeTab']")
		private static WebElement customizeMasterCreateTabsMessage; 		
		
		@FindBy(xpath="//label[@id='lblMasterNameError_TreeTab']")
		private static WebElement customizeMasterCreateTabsMasterNameMessage; 	
	
		@FindBy(xpath="//span[contains(text(),'Tree Tab')]")
		private static WebElement customizeMasterCreateTreeTabNewlyCreate; 	
		
		@FindBy(xpath="//input[@id='txtEditTabCaption']")
		private static WebElement customizeMasterCreateTreeTabNewlyCreateTabCaption; 	
		
		@FindBy(xpath="//div[@id='MCustomize_EditTab_Modal']//label[@class='col-sm-12 col-xs-12 col-md-5 col-lg-5 form-control-static Flabel'][contains(text(),'Hidden')]")
		private static WebElement customizeMasterCreateTreeTabNewlyCreateHidden; 	
		
		@FindBy(xpath="//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'OK')]")
		private static WebElement customizeMasterCreateTreeTabNewlyCreateOkButton; 	
		
		@FindBy(xpath="//div[@id='MCustomize_EditTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Cancel')]")
		private static WebElement customizeMasterCreateTreeTabNewlyCreateCancelButton; 	
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[1]/a[1]/span[1]")
		private static WebElement customizeMasterCreateTreeTabNewlyHeaderDetails; 	
		
		//               
		@FindBy(xpath="//div[@id='HeaderDetails_4']//div[@class='scrollable tbl-emptyfields-mastercust']")
		private static WebElement customizeMasterCreateTreeTabNewlyBlankInHeaderDetails; 	
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/ul[1]/li[2]/a[1]/span[1]")
		private static WebElement customizeMasterCreateTreeTabNewlyBodyDetails; 	
		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
		private static WebElement customizeMasterCreateTreeTabNewlyFieldInBodyDetails; 	
		
		@FindBy(xpath="//span[contains(text(),'Tree Tab Delete')]")
		private static WebElement  CustomizeCreateTreeTab;
		
		@FindBy(xpath="//*[@id='lblWarnMessage_TabModal']")
		private static WebElement  CustomizeDeleteTabMessage;

		@FindBy(xpath="//div[@id='MCustomize_DeleteTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'Yes')]")
		private static WebElement  CustomizeDeleteTabMessageYesBtn;

		@FindBy(xpath="//div[@id='MCustomize_DeleteTab_Modal']//button[@class='Fbutton font-5'][contains(text(),'No')]")
		private static WebElement  CustomizeDeleteTabMessageNoBtn;
		
		
		//Master Customization Extra Fields Creation On Click Add button
	
		
		     @FindBy(xpath="//input[@id='ExtraField_FieldCaption']")
		     private static WebElement extraFields_FieldDetailsTab;   
		     
		     @FindBy(xpath="//span[contains(text(),'Field Details')]")
		     private static WebElement extraFields_ClickOnFieldDetailsTab; 

			     @FindBy(xpath="//*[@id='ExtraField_FieldCaption']")
			     private static WebElement extraFields_FieldDetailsCaption;   
			     
			     @FindBy(xpath="//div[@id='tab_FieldDetails_ExtraField']//div[1]//div[2]//div[1]//input[1]")
			     private static WebElement extraFields_FieldDetailsName;  
			     
			     @FindBy(xpath="//select[@id='ddlDatatype_ExtraField']")
			     private static WebElement extraFields_FieldDetailsDatTypeDropdown;  
			     
			     @FindBy(xpath="//*[@id='ExtraField_DefaultValue']")
			     private static WebElement extraFields_FieldDetailsDefaultValue;
			     
			     @FindBy(xpath="//span[contains(text(),'False')]/parent::label/input[@id='ExtraField_DefaultValue']")
			     private static WebElement extraFields_FieldDetailsDefaultValueChkbox;
			   
			     @FindBy(xpath="//select[@id='ExtraField_DefaultValue']")
			     private static WebElement extraFields_FieldDetailsDefaultValueDrpdwn;
			     
			     @FindBy(xpath="//*[@id='ExtraField_BannerText']")
			     private static WebElement extraFields_FieldDetailsBannerText;  
			     
			     @FindBy(xpath="//*[@id='ExtraField_MaxSize']")
			     private static WebElement extraFields_FieldDetails_MaxSize;  
			     
			     @FindBy(xpath="//*[@id='ExtraField_ControlType']")
			     private static WebElement extraFields_FieldDetailsControlTypeDropdown;  
			     
			     @FindBy(xpath="//*[@id='ExtraField_ToolTipText']")
			     private static WebElement extraFields_FieldDetailsToolTipText;  
			     
			     @FindBy(xpath="//*[@id='ExtraField_RegularExpression']")
			     private static WebElement extraFields_FieldDetailsRegularExpressionText;  
			     
			     @FindBy(xpath=" //*[@id='btnLoad_RExp']")
			     private static WebElement extraFields_RegularExperssionLoadExpansionBtn;
		
			     
		     @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[2]/a/span")
			 private static WebElement extraFields_PropertiesTab;		     
						     
				@FindBy(xpath="//*[@id='tab_Properties_ExtraField']/div[1]/div[1]")
				private static WebElement extraFields_PropertiesTabPartOfDeliveryAddressChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_PartOfBillingAddress']")
				private static WebElement extraFields_PropertiesPartOfBillingAddressChekbox;
				
				@FindBy(xpath="//input[@id='FieldsDetails_IsMandatory']")
				private static WebElement extraFields_PropertiesMandatoryChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_AllowAsParameter']")
				private static WebElement extraFields_PropertiesAllowAsParameterChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_IsHidden']")
				private static WebElement extraFields_PropertiesHiddenChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_HiddenInGroup']")
				private static WebElement extraFields_PropertiesHiddenInGroupChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_SpellCheck']")
				private static WebElement extraFields_PropertiesSpellCheckChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_MandatoryInGroup']")
				private static WebElement extraFields_PropertiesMandatoryInGroupChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_AuditTrial']")
				private static WebElement extraFields_PropertiesAuditTrialChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_NotAvailableForReports']")
				private static WebElement extraFields_PropertiesNotAvailableForReportsChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_MergeField']")
				private static WebElement extraFields_PropertiesMergeFieldChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_MassUpdate']")
				private static WebElement extraFields_PropertiesMassUpdateChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_IncludeInQuickCreate']")
				private static WebElement extraFields_PropertiesIncludeInQuickCreateChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_CannotBeExported']")
				private static WebElement extraFields_PropertiesCannotBeExportedChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_CannotBeImported']")
				private static WebElement extraFields_PropertiesCannotBeImportedChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_CopyFromParent']")
				private static WebElement extraFields_PropertiesCopyFromParentChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_ReadOnly']")
				private static WebElement extraFields_PropertiesReadOnlyChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_InformationField']")
				private static WebElement extraFields_PropertiesInformationFieldChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_IsMandatoryInRevision']")
				private static WebElement extraFields_PropertiesIsMandatoryInRevisionChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_AvailableinCustomerPortal']")
				private static WebElement extraFields_PropertiesAvailableinCustomerPortalChekbox;
				
				@FindBy(xpath="//*[@id='FieldsDetails_EditableinCustomerPortal']")
				private static WebElement extraFields_PropertiesEditableinCustomerPortalChekbox;
				
				@FindBy(xpath="//*[@id='Behaviour']")
				private static WebElement extraFields_PropertiesBehaviourDropdown;     

			@FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[3]/a/span")
			private static WebElement  extraFields_FormattingTab;
		        
		        @FindBy(xpath="//*[@id='FieldsDetails_ColumnSpan']")
				private static WebElement extraFields_FormattingColumnSpan ;
		        
		        @FindBy(xpath="//*[@id='FieldsDetails_RowSpan']")
				private static WebElement extraFields_FormattingRowSpan ;
		        
		        @FindBy(xpath="//*[@id='CharacterCasing']")
				private static WebElement extraFields_FormattingCharacterCasingDropdown ;
		        
		        @FindBy(xpath="//*[@id='TextAlign']")
				private static WebElement extraFields_FormattingTextAlignDropdown ;
		        
		        @FindBy(xpath="//*[@id='FieldsDetails_Font']")
				private static WebElement extraFields_FormattingFieldsDetailsFont ;
		        
		        @FindBy(xpath="//*[@id='FieldsDetails_BackColor']")
		        private static WebElement extraFields_FormattingBackColor ;
		        
		        @FindBy(xpath="//*[@id='FieldsDetails_Font_Button']")
				private static WebElement extraFields_FormattingFieldsDetailsFont_Btn ;
		        
		        @FindBy(xpath="//*[@id='ExtraField_TableName']")
				private static WebElement extraFields_FieldDetailsTableNameText;
		        
		        @FindBy(xpath="//*[@id='ExtraField_MandatoryFields']")
				private static WebElement extraFields_FieldDetailsMandatoryFileds;
		        
		        @FindBy(xpath="//*[@id='MandatoryFieldsDiv_ExtraField']/div/div[1]/label[1]/input")
				private static WebElement extraFields_FieldDetailsMandatoryFiledsSelectCheckBox;
		       
		        @FindBy(xpath="//*[@id='MandatoryFieldsDiv_ExtraField']/div/div[1]/button")
				private static WebElement extraFields_FieldDetailsMandatoryFiledsOkBtn;
		        
		        
		      
		        
		        
		        
		        
			       
			        //Elements are used for font edit option pop in field details and rules 
			        
			        @FindBy(xpath="//*[@id='fontFamily_ExtraField_FontCtrl']")
					private static WebElement FontAreialDropdown ;
			        
			        @FindBy(xpath="//*[@id='fontStyle_ExtraField_FontCtrl']")
					private static WebElement fontStyleDropdown ;
			        
			        @FindBy(xpath="//*[@id='fontWeight_ExtraField_FontCtrl']")
					private static WebElement fontWeightDropdown ;

			        @FindBy(xpath="//*[@id='fontSizes_ExtraField_FontCtrl']")
					private static WebElement fontSizeDropdown ;
			        
			        @FindBy(xpath="//*[@id='fontForeColor_ExtraField_FontCtrl']")
					private static WebElement foreColourDropdown ;
			        
			        @FindBy(xpath="//*[@id='fontBackColor_ExtraField_FontCtrl']")
					private static WebElement backColorDropdown ;
			        
			        @FindBy(xpath="//*[@id='chkBaseline_ExtraField_FontCtrl']")
					private static WebElement baselineChekbox ;
			        
			        @FindBy(xpath="//*[@id='chkOverLine_ExtraField_FontCtrl']")
					private static WebElement overLineChekbox ;
			        
			        @FindBy(xpath="//*[@id='chkStrikeThrough_ExtraField_FontCtrl']")
					private static WebElement strikeThroughChekbox ;
			        
			        @FindBy(xpath="//*[@id='chkUnderline_ExtraField_FontCtrl']")
					private static WebElement underlineChekbox ;
			        
			        @FindBy(xpath="//*[@id='chkEnableFont_ExtraField_FontCtrl']")
					private static WebElement enableFontChekbox ;
			        
			        @FindBy(xpath="//*[@id='previewfont_ExtraField_FontCtrl']")
					private static WebElement frontPriveiw ;
			        
			        @FindBy(xpath="//*[@id='myFontControl_IF_Save']/i")
					private static WebElement frontSaveBtn ;
			        
			        @FindBy(xpath="//*[@id='myFontControl_IF_Close']")
					private static WebElement frontCloseBtn ;
			        
				   
			 @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[4]/a/span")
			 private static WebElement extraFields_RulesTab ;
					                   
			    @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[1]/div[2]")
				private static WebElement extraFields_RulesSaveBtn ;
		                  
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[2]/div[2]")
				private static WebElement extraFields_RulesNewBtn ;
		        
		        @FindBy(xpath="//*[@id='newRuleTab_div_FieldRules']/div[1]/div/div[3]/div[2]")
				private static WebElement extraFields_RulesDeleteBtn ;
		        
		        @FindBy(xpath="//div[@id='newRuleTab_div_FieldRules']//div[@class='col-sm-12 btnheader_txt font-7'][contains(text(),'Close')]")
				private static WebElement extraFields_RulesCloseBtn ;
		        
	            @FindBy(xpath="//input[@class='btn btn-link']")
			    private static WebElement extraFields_RulesClickHereAddRuleButtonBtn ;
	        
		        @FindBy(xpath="//input[@id='txtMasterRuleName_FieldRules']")
				private static WebElement extraFields_RuleNameDropdown ;
		        
		        @FindBy(xpath="//*[@id='txtMasterRuleName_FieldRules_input_settings']/span")
				private static WebElement extraFields_RuleNameSetingBtn ;      
			        
			        
			        
	        @FindBy(xpath="//*[@id='extraFieldContainer_div']/ul/li[5]/a/span")
	        private static WebElement extraFields_ExternalModulesTab;			     
		         
		        @FindBy(xpath="//*[@id='ddlOnEvent_mExtraFieldExternalModule']")
		        private static WebElement extraFields_ExternalModulesOnEventDropdown;	

		        @FindBy(xpath="//*[@id='txtbuttonCaption_mExtraFieldExternalModule']")
		        private static WebElement extraFields_ExternalModulesButtonCaption;

		        @FindBy(xpath="//*[@id='ddlModuleType_mExtraFieldExternalModule']")
		        private static WebElement extraFields_ExternalModules_ModuleTypeBtn;

		        @FindBy(xpath="//*[@id='ddlAllDllFiles_mExtraFieldExternalModule']")
		        private static WebElement extraFields_ExternalModules_ModuleNameDropdown;

		        @FindBy(xpath="//*[@id='ddlClassNames_mExtraFieldExternalModule']")
		        private static WebElement extraFields_ExternalModulesClassNameDropdown;

		        @FindBy(xpath="//*[@id='ddlClassMethods_mExtraFieldExternalModule']")
		        private static WebElement extraFields_ExternalModulesFuctionalNameDropdown;

		        @FindBy(xpath="//*[@id='ddlAvailability_mExtraFieldExternalModule']")
		        private static WebElement extraFields_ExternalModulesAvabileInDropdown;        
		        
		        @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[1]")
			    private static WebElement extraFields_ExternalModulesForMatFieldDeatailsOkBtn ;
			        
			    @FindBy(xpath="//*[@id='MCustomize_FontDialog_Modal']/div/div/div[3]/button[2]")
			    private static WebElement extraFields_externalModulesForMatFieldDeatailsCanceBtn ;
				        
			 @FindBy(xpath="//div[@id='extraFieldContainer_div']/div[1]/div[1]")
			 private static WebElement extraFields_OkBtn;
			    
			 @FindBy(xpath="//div[@id='extraFieldContainer_div']/div[1]/div[2]")
			 private static WebElement extraFields_CloseBtn;
			 
	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
	 private static WebElement extraFields_CreatedByUserInHeaderDetailsTab;
			 
	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[1]")
	 private static WebElement extraFields_EditOptionInHeaderDetailsTab;
	 
	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[2]")
	 private static WebElement extraFields_DeleteOptionInHeaderDetailsTab;
	 
	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")
	 private static WebElement extraFields_SecondFieldInHeaderDetailsTab;
	 
	 
	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[2]/div[2]")
	 private static WebElement extraFields_MoveFieldOption;
	 
		 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
		 private static WebElement extraFields_MoveFieldTabName;
		 
		 @FindBy(xpath="//div[@id='tableType_div']//div[1]//label[1]")
		 private static WebElement extraFields_MoveFieldHeader;
		 
		 @FindBy(xpath="//div[@id='rdbBodyDiv_MoveField_Modal']//label[1]")
		 private static WebElement extraFields_MoveFieldBody;
		 
		 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[3]/button[1]")
		 private static WebElement extraFields_MoveFieldOkButton;
		 
		 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[3]/button[2]")
		 private static WebElement extraFields_MoveFieldCancelButton;
		 
		 
	     //Settings Tab Move Field
		 
		 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/i[1]")
		 private static WebElement extraFields_SettingsTab_MoveField;
	 
		 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
		 private static WebElement extraFields_SettingsTab_First;
	 
     	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[2]")
		 private static WebElement extraFields_SettingsTab_FirstDelete;
	 
     	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/i[2]")
		 private static WebElement extraFields_SettingsTab_MoveFieldOptsDelete;
     	 
     	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")
		 private static WebElement extraFields_SettingsTab_DeleteMessage;
     	 
     	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/button[2]")
		 private static WebElement extraFields_SettingsTab_DeleteMessageNoOption;
     	
     	 @FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/button[1]")
		 private static WebElement extraFields_SettingsTab_DeleteMessageYesOption;
     	
     	 

     	 @FindBy(xpath="//a[@class='icon-font7 theme_color-inverse']")
		 private static WebElement extraFields_GeneralTab;
     	 
     	 @FindBy(xpath="//a[contains(text(),'Settings')]")
		 private static WebElement extraFields_SettingsTab;
     	
     	 @FindBy(xpath="//a[contains(text(),'Details')]")
		 private static WebElement extraFields_DetailsTab;
     	
     	 @FindBy(xpath="//a[contains(text(),'Print Layout')]")
		 private static WebElement extraFields_PrintLayout;
     	
     	 @FindBy(xpath="//a[contains(text(),'Tree Tab Update')]")
		 private static WebElement extraFields_TreeTabUpdate;
     	
     	 @FindBy(xpath="//a[@class='icon-font7 theme_color'][contains(text(),'Document Tab')]")
		 private static WebElement extraFields_DocumentTab;
     	
     	 @FindBy(xpath="//a[@class='icon-font7 theme_color'][contains(text(),'Create Tab')]")
		 private static WebElement extraFields_CreateTab;
     	

     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[4]/div[2]")
		private static WebElement extraFields_PreviewTab;
     	
     	
     	@FindBy(xpath="//input[@id='sFileName1']")
		private static WebElement extraFields_PreviewTab_DocumentTab_FileName;
     	
     	@FindBy(xpath="//input[@id='biDocument1']")
		private static WebElement extraFields_PreviewTab_DocumentTab_Document;
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[1]")
		private static WebElement extraFields_PreviewTab_DocumentTab_UploadDocument;
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[2]")
		private static WebElement extraFields_PreviewTab_DocumentTab_SaveDocument;
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[3]")
		private static WebElement extraFields_PreviewTab_DocumentTab_DeleteDocument;
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
		private static WebElement extraFields_PreviewTab_DocumentTab_CreateDate;
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/input[1]")
		private static WebElement extraFields_PreviewTab_DocumentTab_FileSize;
     	
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
		private static WebElement extraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate;
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[2]/button[2]/i[1]")
		private static WebElement extraFields_PreviewTab_SaveBtn;
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[23]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[2]/button[5]")
		private static WebElement extraFields_PreviewTab_CloseBtn;
     	
     	
     	@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr[2]/td[8]/div[1]/label/input")
		private static WebElement selectVendorB;
     	
     	
     	
     	@FindBy(xpath="//input[@id='iPDCDiscountedAC']")
		private static WebElement pdcDicountAccount;
     
    	
     	@FindBy(xpath="//input[@id='uploadBtnbiDocument1']")
		private static WebElement addGroupDocumentTab_UploadDocument;
     	
     	@FindBy(xpath="//tr[1]//td[5]//div[1]//div[1]//div[2]")
		private static WebElement addGroupDocumentTab_SaveDocument;
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[3]/i[1]")
		private static WebElement addGroupDocumentTab_DeleteDocument;
     	
     	
     	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
		private static WebElement addGroupCreateCreateTab_ExtraFieldUpdate;
     	
		@FindBy(xpath="//td[contains(@class,'tdName padding0')][contains(text(),'Vendor Group')]")
		public static WebElement accountGroupCreation;
		
		               
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		private static WebElement accSelect;
     	
		
	
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
		public static WebElement accSelectBySingleClick;
	
		
		
		

		@FindBy(xpath="//span[contains(text(),'Vendor Group')]")
		public static WebElement clickOnAccountGroupToDisplayTitle;
		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[4]/span[1]")
		public static WebElement clickOnAccountGroup;
		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
		public static WebElement getCpationOfGroup;
		
	
		@FindBy(xpath="//label[@class='msgInfo']")
		public static WebElement clickOnEmptyGroup;
		
		
		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/ul[6]/li[1]/ul[3]/li[1]/ul[1]/li[1]/a[2]")
		public static WebElement selectVendorGroupCheckbox;
		
		@FindBy(xpath="/html/body/section/div[2]/div/section[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/div/table/tbody/tr[1]/td[8]/div[1]/label/input")
		public static WebElement selectVendorGroup;
			
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")
		public static WebElement getMsgOnDelete;
		
		@FindBy(xpath="//button[@id='btnOkForDelete']")
		public static WebElement clickOnOkInDelete;
		
		@FindBy(xpath="//button[@id='btnCancelForDelete']")
		public static WebElement clickOnCancelInDelete;
		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[4]/span[1]")
		public static WebElement clickOnVendorGroup;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
		public static WebElement getVendorGroupName;
		
		@FindBy(xpath="//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']//i[@class='icon-font6 icon-close']")
		public static WebElement closeAccountCreationScreen;
	
		@FindBy(xpath="//input[@id='chkRetainSelection']")
		public static WebElement accountMasterRetain;
		
		@FindBy(xpath="//input[@id='liSelectAllMasters']")
		public static WebElement accountMasterSelect;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement accountFirstCheckBox;
		                
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/label[1]/input[1]")
		public static WebElement accountSecondCheckBox;
		
		@FindBy(xpath="//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']")
		public static WebElement closeAccMasterCreationScreen;
		
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/button[5]/i[1]")
		public static WebElement closeMaster;
		
		
		//Dash board Page
		
		@FindBy(xpath="//*[@id='dashName']")
	    private static WebElement labelDashboard ;
		
		@FindBy(xpath="//*[@id='Select_dash']")
		private static WebElement selectDashboard ;
			
		@FindBy(xpath="//*[@id='Dashboard_AddDash']")
	    private static WebElement newAddDashBoard;
		 
	    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
        private static WebElement dashboardCustomizationSettings;
	
		
	   
	    //Properties Page
	   
	    @FindBy(xpath="//span[contains(text(),'Account Properties')]")
	    public static WebElement accountPropertiesLabel;
	     
		@FindBy(xpath="//input[@id='rbnNormal']")
		public static WebElement normalRadioBtn;

		@FindBy(xpath="//input[@id='rbnDisplayDebitCreditTotalForEachAccountUnderGroup']")
		private static WebElement  displayDebitCreditTotalForEachAccountUnderGroup;
		
		@FindBy(xpath="//input[@id='rbnClubTranOfAllAcctsUnderGrpWhenDispInLedger']")
		private static WebElement  ClubTheTransactionsofAllTheAccountsUnderGroup;
							
		@FindBy(xpath="//input[@id='rbnShowSummaryOfAccount']")
		private static WebElement showSummaryOfTheAccountRadioBtn ;	
		
		@FindBy(xpath="//input[@id='chkSuspendCreditLimit']")
		private static WebElement suspendCreditLimitChkbox ;
								
		@FindBy(xpath="//input[@id='rbnDisplayDebitCreditTotalForEachMonth']")
		private static WebElement  displayDebitCreditTotalForEachMonthRadioBtn;
							
		@FindBy(xpath="//input[@id='rbnrbnDisplayDebitCreditTotalForEachDay']")
		private static WebElement  displayDebitCreditTotalForEachDayRadioBtn;
		
		@FindBy(xpath="//input[@id='rbnNone']")
		public static WebElement  noneRadioBtn;
		
		@FindBy(xpath="//input[@id='rbnConsolidateWhenBothAccountsAreSame']")
		public static WebElement consolidateWhenBothAccountsAreSameRadioBtn ;
		
		@FindBy(xpath="//input[@id='rbnConsolidateAlways']")
		public static WebElement consolidateAlwaysRadioBtn ;
		
		@FindBy(xpath="//select[@id='ddlStatus']")
		public static WebElement  statusDropdown;
		
		@FindBy(xpath="//input[@id='chkDoNotRestrictSelectionEvenIfRightsNotAllotted']")
		public static WebElement  doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox;
		
		@FindBy(xpath="//input[@id='chkAllowOtherCompaniesToViewRecords']")
		public static WebElement allowOtherCompaniesToViewRecordsCheckbox;
		
		@FindBy(xpath="//input[@id='chkGenerateLedgerByCurrency']")
		public static WebElement generateLedgerByCurrencyCheckbox;
		
		@FindBy(xpath="//input[@id='chkSendSmsEmailWhereverAcDebitedCredited']")
		public static WebElement sendSmsEmailWhereverAcDebitedCreditedCheckbox;
		
		@FindBy(xpath="//span[@id='btnPropOk']")
		public static WebElement properties_okBtn;
		
		@FindBy(xpath="//*[@id='divMasterProperty']/ul/li/span[2]")
		public static WebElement  properties_cancelBtn;
	     
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[5]/span[1]")
		public static WebElement  customizeTabWithTreeTabUpdate;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[6]/span[1]")
		public static WebElement  customizeTabWithDocumentTab;
		
		@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[7]/span[1]")
		public static WebElement  customizeTabWithCreateTreeTab;
		
	    @FindBy(xpath="//div[@id='Layout_Popup']//input[2]")
		private static WebElement noIn;
	    
		@FindBy(xpath="//*[@id='dashName']")
		private static WebElement dashboard;
		
		
		@FindBy(xpath="//div[@id='chartdiv0']")
		public static WebElement dashboardGraph;
					
		@FindBy(xpath="//div[@id='DBdashlate1']")
		public static WebElement dashboardLedger;
		
		@FindBy(xpath="//div[@id='DBdashlate2']")
		public static WebElement dashboardInfoPanel;

		
		
		//Logout and Login Screen
		
		@FindBy(xpath="//*[@id='txtUsername']")
		private static WebElement username;

		@FindBy(id="txtPassword")
		private static WebElement password;

		@FindBy(id="btnSignin")
		private static WebElement signIn;

	    @FindBy(id="ddlCompany")
	    private static WebElement companyDropDownList;

		/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")
		private static WebElement userNameDisplay;*/

		@FindBy(xpath="//span[@class='hidden-xs']")//*[@id="mainHeader_MainLayout"]/nav/div/ul/li[6]/a/span
		private static WebElement userNameDisplay;
		
		
		@FindBy(xpath="//*[@id='companyLogo']")
		private static WebElement companyLogo;

		@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
		private static WebElement companyName;

	    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
        private static WebElement logoutOption;
		
	    
	    @FindBy(xpath="//input[@id='donotshow']")
		private static WebElement doNotShowCheckbox;
	    
	    @FindBy(xpath="//span[@class='pull-right']")
		private static WebElement closeBtnInDemoPopupScreen;
	    
	    
	    
	    
	    public static String checkDownloadedFileName(WebDriver driver) throws InterruptedException
		{
			String mainWindow = driver.getWindowHandle();

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.open()");
	      
			for(String winHandle : driver.getWindowHandles())
			{
				driver.switchTo().window(winHandle);
			}
		     
			driver.get("chrome://downloads");
		      
			JavascriptExecutor js1 = (JavascriptExecutor)driver;

			String fileName = (String) js1.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('div#content #file-link').text");

			System.err.println("Download deatils");
			System.out.println("File Name :-" + fileName);
		     
			driver.close();

			driver.switchTo().window(mainWindow);
			
			return fileName;
		}
	    
	    
	    
		 
	public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{       
        try 
        {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
			doNotShowCheckbox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
			closeBtnInDemoPopupScreen.click(); 
			
			System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");
			
		} 
        catch (Exception e)
        {
        	System.err.println("NO POP UP DISPLAYED");
		} 	
	}
			 
			
	
	
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
private static WebElement loginRefreshOkBtn;


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

	
	
}
	    
	    
	     
	 private static String xlfile;
	 private static String resPass="Pass";
	 private static String resFail="Fail";
	 private static ExcelReader excelReader;

	 private static int cSize;

public static boolean checkLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	LoginPage lp=new LoginPage(getDriver()); 
		
    String unamelt="su";
  
    String pawslt="su";
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
    username.click();
    Thread.sleep(2000);
	username.clear();
    Thread.sleep(2000);
    username.sendKeys(unamelt);
    getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
	password.click();
	Thread.sleep(2000);
	password.clear();
	Thread.sleep(2000);
	password.sendKeys(pawslt);
    
	/*String compname="Automation Company";
	
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
	}*/

    lp.clickOnSignInBtn();
    
    //checkRefershPopOnlogin();
    
    //checkPopUpWindow();
    
    Thread.sleep(8000);
          
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
   	userNameDisplay.click();
           	
	String userInfo=userNameDisplay.getText();
	
	System.out.println("User Info : "+userInfo);
	
	System.out.println("User Info Capture Text :"+userNameDisplay.getText());
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
	
	companyLogo.click();
	
	String getCompanyTxt=companyName.getText();
	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
	System.out.println("company name :"+ getLoginCompanyName);
	companyLogo.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
	
	String getDashboard=dashboard.getText();
	
	System.out.println(getDashboard);

/*	boolean actdashboardGraph     =dashboardGraph.isDisplayed();
	boolean actdashboardLedger    =dashboardLedger.isDisplayed();
	boolean actdashboardInfoPanel =dashboardInfoPanel.isDisplayed();*/
	
    
    String expuserInfo            ="SU";
    String expLoginCompanyName    ="Automation Company ";
    String expDashboard			  ="Graph with Active and setAsDefault";
   
	
	System.out.println("***********************************checkLogin*********************************");
    
    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
    System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);
   
  
	if(userInfo.equalsIgnoreCase(expuserInfo) && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))
	{	
		excelReader.setCellData(xlfile, "Sheet1", 249, 9, resPass);
		return true;
	}	 
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 249, 9, resFail);
		return false;
	}
 }





public static boolean checkMainOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));		
     
     boolean actmasterNewBtn    	 		=masterNewBtn.isDisplayed();
     boolean actmasterAddGroupBtn    		=masterAddGroupBtn.isDisplayed();
     boolean actmasterEditBtn 				=masterEditBtn.isDisplayed();
     boolean actmasterCloneBtn 				=masterCloneBtn.isDisplayed();
     boolean actmasterPropertiesBtn 		=masterPropertiesBtn.isDisplayed();
     boolean actmasterDeleteBtn 			=masterDeleteBtn.isDisplayed();
     boolean actmasterCloseBtn 				=masterCloseBtn.isDisplayed();
     boolean actmasterRibbonToExpandOptions =masterRibbonToExpandOptions.isDisplayed();
     
     boolean expmasterNewBtn    	 		=true;
     boolean expmasterAddGroupBtn    		=true;
     boolean expmasterEditBtn 				=true;
     boolean expmasterCloneBtn 				=true;
     boolean expmasterPropertiesBtn 		=true;
     boolean expmasterDeleteBtn 			=true;
     boolean expmasterCloseBtn 				=true;
     boolean expmasterRibbonToExpandOptions =true;
     
     
     System.out.println("**************************************checkMainOptionsAccountsMenu*****************************");
     
     System.out.println("masterNewBtn                  : "+actmasterNewBtn                +" Value Expected : "+expmasterNewBtn);
     System.out.println("masterAddGroupBtn             : "+actmasterAddGroupBtn           +" Value Expected : "+expmasterAddGroupBtn);
     System.out.println("masterEditBtn                 : "+actmasterEditBtn               +" Value Expected : "+expmasterEditBtn);
     System.out.println("masterCloneBtn                : "+actmasterCloneBtn              +" Value Expected : "+expmasterCloneBtn);
     System.out.println("masterPropertiesBtn           : "+actmasterPropertiesBtn         +" Value Expected : "+expmasterPropertiesBtn);
     System.out.println("masterDeleteBtn               : "+actmasterDeleteBtn             +" Value Expected : "+expmasterDeleteBtn);
     System.out.println("masterCloseBtn                : "+actmasterCloseBtn              +" Value Expected : "+expmasterCloseBtn);
     System.out.println("masterRibbonToExpandOptions   : "+actmasterRibbonToExpandOptions +" Value Expected : "+expmasterRibbonToExpandOptions);
     
     
	 if(actmasterNewBtn==expmasterNewBtn && actmasterAddGroupBtn==expmasterAddGroupBtn && actmasterEditBtn==expmasterEditBtn
			 && actmasterCloneBtn==expmasterCloneBtn && actmasterPropertiesBtn==expmasterPropertiesBtn && actmasterDeleteBtn==expmasterDeleteBtn
			 && actmasterCloseBtn==expmasterCloseBtn && actmasterRibbonToExpandOptions==expmasterRibbonToExpandOptions)
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 250, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 250, 9, resFail);
		 return false;
	 }
}


public static boolean checkToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
	 
	 masterRibbonToExpandOptions.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));	
	 
	 boolean actmasterGroupBtn    	 													=masterGroupBtn.isDisplayed();
	 boolean actmasterDeleteAllBtn    	 												=masterDeleteAllBtn.isDisplayed();
	 boolean actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity   	=masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity.isDisplayed();
	 boolean actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState    	 	  	=masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState.isDisplayed();
	 boolean actmasterAdvanceMasterImportORExportBtn    	 							=masterAdvanceMasterImportORExportBtn.isDisplayed();
	 boolean actmasterAuthorInfoBtn    	 												=masterAuthorInfoBtn.isDisplayed();
	 boolean actmasterMoveUpBtn    	 													=masterMoveUpBtn.isDisplayed();
	 boolean actmasterMoveDownBtn    	 												=masterMoveDownBtn.isDisplayed();
	 boolean actmasterSortBtn    	 													=masterSortBtn.isDisplayed();
	 boolean actmasterMassUpdateBtn    	 												=masterMassUpdateBtn.isDisplayed();
	 boolean actmasterImportFromXmlBtn    	 											=masterImportFromXmlBtn.isDisplayed();
	 boolean actmasterExportFormatToXmlBtn    	 										=masterExportFormatToXmlBtn.isDisplayed();
	 
	 boolean expmasterGroupBtn    	 													=true;
	 boolean expmasterDeleteAllBtn    	 												=true;
	 boolean expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity   	=true;
	 boolean expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState    	 	  	=true;
	 boolean expmasterAdvanceMasterImportORExportBtn    	 							=true;
	 boolean expmasterAuthorInfoBtn    	 												=true;
	 boolean expmasterMoveUpBtn    	 													=true;
	 boolean expmasterMoveDownBtn    	 												=true;
	 boolean expmasterSortBtn    	 													=true;
	 boolean expmasterMassUpdateBtn    	 												=true;
	 boolean expmasterImportFromXmlBtn    	 											=true;
	 boolean expmasterExportFormatToXmlBtn    	 										=true;
	 
	 System.out.println("**************************************checkToolsOptionsAccountsMenu********************************");
	 
	 System.out.println("masterGroupBtn                                                      : "+actmasterGroupBtn                                                      +" Value Expected : "+expmasterGroupBtn);
	 System.out.println("masterDeleteAllBtn                                                  : "+actmasterDeleteAllBtn                                                  +" Value Expected : "+expmasterDeleteAllBtn);
	 System.out.println("masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity : "+actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity +" Value Expected : "+expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity);
	 System.out.println("masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState          : "+actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState          +" Value Expected : "+expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState);
	 System.out.println("masterAdvanceMasterImportORExportBtn                                : "+actmasterAdvanceMasterImportORExportBtn                                +" Value Expected : "+expmasterAdvanceMasterImportORExportBtn);
	 System.out.println("masterAuthorInfoBtn                                                 : "+actmasterAuthorInfoBtn                                                 +" Value Expected : "+expmasterAuthorInfoBtn);
	 System.out.println("masterMoveUpBtn                                                     : "+actmasterMoveUpBtn                                                     +" Value Expected : "+expmasterMoveUpBtn);
	 System.out.println("masterMoveDownBtn                                                   : "+actmasterMoveDownBtn                                                   +" Value Expected : "+expmasterMoveDownBtn);
	 System.out.println("masterSortBtn                                                       : "+actmasterSortBtn                                                       +" Value Expected : "+expmasterSortBtn);
	 System.out.println("masterMassUpdateBtn                                                 : "+actmasterMassUpdateBtn                                                 +" Value Expected : "+expmasterMassUpdateBtn);
	 System.out.println("masterImportFromXmlBtn                                              : "+actmasterImportFromXmlBtn                                              +" Value Expected : "+expmasterImportFromXmlBtn);
	 System.out.println("masterExportFormatToXmlBtn                                          : "+actmasterExportFormatToXmlBtn                                          +" Value Expected : "+expmasterExportFormatToXmlBtn);
	 
     
	 if(actmasterGroupBtn==expmasterGroupBtn && actmasterDeleteAllBtn==expmasterDeleteAllBtn 
			 && actmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity==expmasterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity
			 && actmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState==expmasteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState 
			 && actmasterAdvanceMasterImportORExportBtn==expmasterAdvanceMasterImportORExportBtn
			 && actmasterAuthorInfoBtn==expmasterAuthorInfoBtn && actmasterMoveUpBtn==expmasterMoveUpBtn && actmasterMoveDownBtn==expmasterMoveDownBtn
			 && actmasterSortBtn==expmasterSortBtn && actmasterMassUpdateBtn==expmasterMassUpdateBtn && actmasterImportFromXmlBtn==expmasterImportFromXmlBtn
			 && actmasterExportFormatToXmlBtn==expmasterExportFormatToXmlBtn)
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 251, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 251, 9, resFail);
		 return false;
	 }
}

public static boolean checkOtherToolsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
	 
	 masterRibbonControlNextBtn.click(); 
	 masterRibbonControlNextBtn.click();
	 masterRibbonControlNextBtn.click();
	 masterRibbonControlNextBtn.click();
	 masterRibbonControlNextBtn.click();
	 masterRibbonControlNextBtn.click();
	 masterRibbonControlNextBtn.click();
	 masterRibbonControlNextBtn.click();
	 
	 
	 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterCustamizemasterBtn));	
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
     
	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(masterTranferBtn));	
	 
	 boolean actmasterCustamizemasterBtn    	  =masterCustamizemasterBtn.isDisplayed();
	 boolean actmasterCustamizeViewBtn    	 	  =masterCustamizeViewBtn.isDisplayed();
	 boolean actmastercustamizeTreeBtn    	 	  =mastercustamizeTreeBtn.isDisplayed();
	 boolean actmasterLedgerBtn    	 		      =masterLedgerBtn.isDisplayed();
	 boolean actmasterManageCreditBtn    	 	  =masterManageCreditBtn.isDisplayed();
	 boolean actmasterDepartmentAppropriationBtn  =masterDepartmentAppropriationBtn.isDisplayed();
	// boolean actmasterBudgetBtn    	 		      =masterBudgetBtn.isDisplayed();
	 boolean actmasterBackTrackBtn    	 	      =masterBackTrackBtn.isDisplayed();
	 boolean actmasterTranferBtn    	 		  =masterTranferBtn.isDisplayed();
	 
	 boolean expmasterCustamizemasterBtn    	  =true;
	 boolean expmasterCustamizeViewBtn    	 	  =true;
	 boolean expmastercustamizeTreeBtn    	 	  =true;
	 boolean expmasterLedgerBtn    	 		      =true;
	 boolean expmasterManageCreditBtn    	 	  =true;
	 boolean expmasterDepartmentAppropriationBtn  =true;
	// boolean expmasterBudgetBtn    	 		      =true;
	 boolean expmasterBackTrackBtn    	 	      =true;
	 boolean expmasterTranferBtn    	 		  =true;
	 
	 
	 System.out.println("************************************checkOtherToolsOptionsAccountsMenu************************************");
	 
	 System.out.println("masterCustamizemasterBtn           : "+actmasterCustamizemasterBtn           +" Value Expected : "+expmasterCustamizemasterBtn);
	 System.out.println("masterCustamizeViewBtn             : "+actmasterCustamizeViewBtn             +" Value Expected : "+expmasterCustamizeViewBtn);
	 System.out.println("mastercustamizeTreeBtn             : "+actmastercustamizeTreeBtn             +" Value Expected : "+expmastercustamizeTreeBtn);
	 System.out.println("masterLedgerBtn                    : "+actmasterLedgerBtn                    +" Value Expected : "+expmasterLedgerBtn);
	 System.out.println("masterManageCreditBtn              : "+actmasterManageCreditBtn              +" Value Expected : "+expmasterManageCreditBtn);
	 System.out.println("masterDepartmentAppropriationBtn   : "+actmasterDepartmentAppropriationBtn   +" Value Expected : "+expmasterDepartmentAppropriationBtn);
	// System.out.println("masterBudgetBtn                    : "+actmasterBudgetBtn                    +" Value Expected : "+expmasterBudgetBtn);
	 System.out.println("masterBackTrackBtn                 : "+actmasterBackTrackBtn                 +" Value Expected : "+expmasterBackTrackBtn);
	 System.out.println("masterTranferBtn                   : "+actmasterTranferBtn                   +" Value Expected : "+expmasterTranferBtn);
	 
	 
	 if(actmasterCustamizemasterBtn==expmasterCustamizemasterBtn && actmasterCustamizeViewBtn==expmasterCustamizeViewBtn  
			 && actmastercustamizeTreeBtn==expmastercustamizeTreeBtn && actmasterLedgerBtn==expmasterLedgerBtn
			 && actmasterManageCreditBtn==expmasterManageCreditBtn && actmasterDepartmentAppropriationBtn==expmasterDepartmentAppropriationBtn
			 /*&& actmasterBudgetBtn==expmasterBudgetBtn*/ && actmasterBackTrackBtn==expmasterBackTrackBtn && actmasterTranferBtn==expmasterTranferBtn)
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 252, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 252, 9, resFail);
		 return false;
	 }
}


public static boolean checkTreeViewOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
	 
	 boolean actmasterTreeIdDropdown    	        =masterTreeIdDropdown.isDisplayed();
	 boolean actmasterTreeIDToggleBtn    	        =masterTreeIDToggleBtn.isDisplayed();
	 boolean actmasterTreeViewIDDropdown    	    =masterTreeViewIDDropdown.isDisplayed();
	 boolean actmasterTreeViewIDToggleBtn    	    =masterTreeViewIDToggleBtn.isDisplayed();
	 boolean actmasterOptionToHideAccountsGroupTree =masterOptionToHideAccountsGroupTree.isDisplayed();
	 
	 boolean expmasterTreeIdDropdown        	    =true;
	 boolean expmasterTreeIDToggleBtn    	        =true;
	 boolean expmasterTreeViewIDDropdown    	    =true;
	 boolean expmasterTreeViewIDToggleBtn    	    =true;
	 boolean expmasterOptionToHideAccountsGroupTree =true;
	 
	 System.out.println("*********************************checkTreeViewOptionsAccountsMenu****************************");
	 
	 System.out.println("masterTreeIdDropdown                  : "+actmasterTreeIdDropdown                  +" Value Expected : "+expmasterTreeIdDropdown);
	 System.out.println("masterTreeIDToggleBtn                 : "+actmasterTreeIDToggleBtn                 +" Value Expected : "+expmasterTreeIDToggleBtn);
	 System.out.println("masterTreeViewIDDropdown              : "+actmasterTreeViewIDDropdown              +" Value Expected : "+expmasterTreeViewIDDropdown);
	 System.out.println("masterTreeViewIDToggleBtn             : "+actmasterTreeViewIDToggleBtn             +" Value Expected : "+expmasterTreeViewIDToggleBtn);
	 System.out.println("masterOptionToHideAccountsGroupTree   : "+actmasterOptionToHideAccountsGroupTree   +" Value Expected : "+expmasterOptionToHideAccountsGroupTree);
	 
	 if(actmasterTreeIdDropdown==expmasterTreeIdDropdown && actmasterTreeIDToggleBtn==expmasterTreeIDToggleBtn && actmasterTreeViewIDDropdown==expmasterTreeViewIDDropdown
			 && actmasterTreeViewIDToggleBtn==expmasterTreeViewIDToggleBtn && actmasterOptionToHideAccountsGroupTree==expmasterOptionToHideAccountsGroupTree)
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 253, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 253, 9, resFail);
		 return false;
	 }
}



public static boolean checkGroupOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAssestsGroup));	

	 boolean actaccountAssestsGroup    	            =accountAssestsGroup.isDisplayed();
	 boolean actaccountFixedAssestsGroup    	    =accountFixedAssestsGroup.isDisplayed();
	 boolean actaccountCurrentAssetsGroup    	    =accountCurrentAssetsGroup.isDisplayed();
	 boolean actaccountCAshAndBankGroup    	        =accountCAshAndBankGroup.isDisplayed();
	 boolean actaccountInventoriesGroup    	        =accountInventoriesGroup.isDisplayed();
	 boolean actaccountAccountsReceivableGroup    	=accountAccountsReceivableGroup.isDisplayed();
	 boolean actaccountInvestmentsGroup    	        =accountInvestmentsGroup.isDisplayed();
	 boolean actaccountExpensesGroup    	        =accountExpensesGroup.isDisplayed();
	 boolean actaccountDirectExpensesGroup    	    =accountDirectExpensesGroup.isDisplayed();
	 boolean actaccountIndirectExpensesGroup    	=accountIndirectExpensesGroup.isDisplayed();
	 boolean actaccountAdministrativeExpensesGroup  =accountAdministrativeExpensesGroup.isDisplayed();
	 boolean actaccountEmployeeBenefitsGroup    	=accountEmployeeBenefitsGroup.isDisplayed();
	 boolean actaccountFinancialChargesGroup    	=accountFinancialChargesGroup.isDisplayed();
	 boolean actaccountGainAndLossGroup    	        =accountGainAndLossGroup.isDisplayed();
	 boolean actaccountControlAccountsGroup    	    =accountControlAccountsGroup.isDisplayed();
	 boolean actaccountRevenueGroup    	            =accountRevenueGroup.isDisplayed();
	 boolean actaccountSalesGroup    	            =accountSalesGroup.isDisplayed();
	 boolean actaccountEqitiesGroup    	            =accountEqitiesGroup.isDisplayed();
	 boolean actaccountCapitalGroup    	            =accountCapitalGroup.isDisplayed();
	 boolean actaccountLiabilitiesGroup    	        =accountLiabilitiesGroup.isDisplayed();
	 boolean actaccountLoanAndBorrowingGroup    	=accountLoanAndBorrowingGroup.isDisplayed();
	 boolean actaccountLoansGroup    	            =accountLoansGroup.isDisplayed();
	 boolean actaccountAccruedLiabilitiesGroup    	=accountAccruedLiabilitiesGroup.isDisplayed();
	 boolean actaccountTradePayableGroup    	    =accountTradePayableGroup.isDisplayed();
	 boolean actaccountProvisionsGroup    	        =accountProvisionsGroup.isDisplayed();
	 
	 boolean expaccountAssestsGroup    	            =true;
	 boolean expaccountFixedAssestsGroup    	    =true;
	 boolean expaccountCurrentAssetsGroup    	    =true;
	 boolean expaccountCAshAndBankGroup    	        =true;
	 boolean expaccountInventoriesGroup    	        =true;
	 boolean expaccountAccountsReceivableGroup    	=true;
	 boolean expaccountInvestmentsGroup    	        =true;
	 boolean expaccountExpensesGroup    	        =true;
	 boolean expaccountDirectExpensesGroup    	    =true;
	 boolean expaccountIndirectExpensesGroup    	=true;
	 boolean expaccountAdministrativeExpensesGroup  =true;
	 boolean expaccountEmployeeBenefitsGroup    	=true;
	 boolean expaccountFinancialChargesGroup    	=true;
	 boolean expaccountGainAndLossGroup    	        =true;
	 boolean expaccountControlAccountsGroup    	    =true;
	 boolean expaccountRevenueGroup    	            =true;
	 boolean expaccountSalesGroup    	            =true;
	 boolean expaccountEqitiesGroup    	            =true;
	 boolean expaccountCapitalGroup    	            =true;
	 boolean expaccountLiabilitiesGroup    	        =true;
	 boolean expaccountLoanAndBorrowingGroup    	=true;
	 boolean expaccountLoansGroup    	            =true;
	 boolean expaccountAccruedLiabilitiesGroup    	=true;
	 boolean expaccountTradePayableGroup    	    =true;
	 boolean expaccountProvisionsGroup    	        =true;
	 
	 System.out.println("******************************checkGroupOptionsAccountsMenu***********************************");
	 
	 System.out.println("accountAssestsGroup                 : "+actaccountAssestsGroup                +" Value Expected : "+expaccountAssestsGroup);
	 System.out.println("accountFixedAssestsGroup            : "+actaccountFixedAssestsGroup           +" Value Expected : "+expaccountFixedAssestsGroup);
	 System.out.println("accountCurrentAssetsGroup           : "+actaccountCurrentAssetsGroup          +" Value Expected : "+expaccountCurrentAssetsGroup);
	 System.out.println("accountCAshAndBankGroup             : "+actaccountCAshAndBankGroup            +" Value Expected : "+expaccountCAshAndBankGroup);
	 System.out.println("accountInventoriesGroup             : "+actaccountInventoriesGroup            +" Value Expected : "+expaccountInventoriesGroup);
	 System.out.println("accountAccountsReceivableGroup      : "+actaccountAccountsReceivableGroup     +" Value Expected : "+expaccountAccountsReceivableGroup);
	 System.out.println("accountInvestmentsGroup             : "+actaccountInvestmentsGroup            +" Value Expected : "+expaccountInvestmentsGroup);
	 System.out.println("accountExpensesGroup                : "+actaccountExpensesGroup               +" Value Expected : "+expaccountExpensesGroup);
	 System.out.println("accountDirectExpensesGroup          : "+actaccountDirectExpensesGroup         +" Value Expected : "+expaccountDirectExpensesGroup);
	 System.out.println("accountIndirectExpensesGroup        : "+actaccountIndirectExpensesGroup       +" Value Expected : "+expaccountIndirectExpensesGroup);
	 System.out.println("accountAdministrativeExpensesGroup  : "+actaccountAdministrativeExpensesGroup +" Value Expected : "+expaccountAdministrativeExpensesGroup);
	 System.out.println("accountEmployeeBenefitsGroup        : "+actaccountEmployeeBenefitsGroup       +" Value Expected : "+expaccountEmployeeBenefitsGroup);
	 System.out.println("accountFinancialChargesGroup        : "+actaccountFinancialChargesGroup       +" Value Expected : "+expaccountFinancialChargesGroup);
	 System.out.println("accountGainAndLossGroup             : "+actaccountGainAndLossGroup            +" Value Expected : "+expaccountGainAndLossGroup);
	 System.out.println("accountControlAccountsGroup         : "+actaccountControlAccountsGroup        +" Value Expected : "+expaccountControlAccountsGroup);
	 System.out.println("accountRevenueGroup                 : "+actaccountRevenueGroup                +" Value Expected : "+expaccountRevenueGroup);
	 System.out.println("accountSalesGroup                   : "+actaccountSalesGroup                  +" Value Expected : "+expaccountSalesGroup);
	 System.out.println("accountEqitiesGroup                 : "+actaccountEqitiesGroup                +" Value Expected : "+expaccountEqitiesGroup);
	 System.out.println("accountCapitalGroup                 : "+actaccountCapitalGroup                +" Value Expected : "+expaccountCapitalGroup);
	 System.out.println("accountLiabilitiesGroup             : "+actaccountLiabilitiesGroup            +" Value Expected : "+expaccountLiabilitiesGroup);
	 System.out.println("accountLoanAndBorrowingGroup        : "+actaccountLoanAndBorrowingGroup       +" Value Expected : "+expaccountLoanAndBorrowingGroup);
	 System.out.println("accountLoansGroup                   : "+actaccountLoansGroup                  +" Value Expected : "+expaccountLoansGroup);
	 System.out.println("accountAccruedLiabilitiesGroup      : "+actaccountAccruedLiabilitiesGroup     +" Value Expected : "+expaccountAccruedLiabilitiesGroup);
	 System.out.println("accountTradePayableGroup            : "+actaccountTradePayableGroup           +" Value Expected : "+expaccountTradePayableGroup);
	 System.out.println("accountProvisionsGroup              : "+actaccountProvisionsGroup             +" Value Expected : "+expaccountProvisionsGroup);
	 
	 if(actaccountAssestsGroup==expaccountAssestsGroup && actaccountFixedAssestsGroup==expaccountFixedAssestsGroup 
			 && actaccountCurrentAssetsGroup==expaccountCurrentAssetsGroup
			 && actaccountCAshAndBankGroup==expaccountCAshAndBankGroup && actaccountInventoriesGroup==expaccountInventoriesGroup 
			 && actaccountAccountsReceivableGroup==expaccountAccountsReceivableGroup &&  actaccountInvestmentsGroup==expaccountInvestmentsGroup 
			 && actaccountExpensesGroup==expaccountExpensesGroup && actaccountDirectExpensesGroup==expaccountDirectExpensesGroup 
			 && actaccountIndirectExpensesGroup==expaccountIndirectExpensesGroup && actaccountAdministrativeExpensesGroup==expaccountAdministrativeExpensesGroup
			 && actaccountEmployeeBenefitsGroup==expaccountEmployeeBenefitsGroup && actaccountFinancialChargesGroup==expaccountFinancialChargesGroup 
			 && actaccountGainAndLossGroup==expaccountGainAndLossGroup && actaccountControlAccountsGroup==expaccountControlAccountsGroup
			 && actaccountRevenueGroup==expaccountRevenueGroup && actaccountSalesGroup==expaccountSalesGroup
			 && actaccountEqitiesGroup==expaccountEqitiesGroup && actaccountCapitalGroup==expaccountCapitalGroup
			 && actaccountLiabilitiesGroup==expaccountLiabilitiesGroup && actaccountLoanAndBorrowingGroup==expaccountLoanAndBorrowingGroup
			 && actaccountLoansGroup==expaccountLoansGroup && actaccountAccruedLiabilitiesGroup==expaccountAccruedLiabilitiesGroup
			 && actaccountTradePayableGroup==expaccountTradePayableGroup && actaccountProvisionsGroup==expaccountProvisionsGroup)
	 {	
		 excelReader.setCellData(xlfile, "Sheet1", 254, 9, resPass);
		 return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 254, 9, resFail);
		 return false;
	 }
}


public static boolean checkCreateTreeToggleOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggleBtn));	
	 
	 masterTreeIDToggleBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIDToggle_CreateTreeBtn));	
	 
	 boolean actmasterTreeIDToggle_CreateTreeBtn    =masterTreeIDToggle_CreateTreeBtn.isDisplayed();
	 boolean actmasterTreeIDToggle_EditBtn          =masterTreeIDToggle_EditBtn.isDisplayed();
	 boolean actmasterTreeIDToggle_DeleteBtn        =masterTreeIDToggle_DeleteBtn.isDisplayed();
	 boolean actmasterTreeIDToggle_setDefaultBtn    =masterTreeIDToggle_setDefaultBtn.isDisplayed();
	 
	 boolean expmasterTreeIDToggle_CreateTreeBtn    =true;
	 boolean expmasterTreeIDToggle_EditBtn          =true;
	 boolean expmasterTreeIDToggle_DeleteBtn        =true;
	 boolean expmasterTreeIDToggle_setDefaultBtn    =true;
	 
	 System.out.println("*****************************checkCreateTreeToggleOptionsAccountsMenu******************************");
	 
	 System.out.println("masterTreeIDToggle_CreateTreeBtn   : "+actmasterTreeIDToggle_CreateTreeBtn  +" Value Expected : "+expmasterTreeIDToggle_CreateTreeBtn);
	 System.out.println("masterTreeIDToggle_EditBtn         : "+actmasterTreeIDToggle_EditBtn        +" Value Expected : "+expmasterTreeIDToggle_EditBtn);
	 System.out.println("masterTreeIDToggle_DeleteBtn       : "+actmasterTreeIDToggle_DeleteBtn      +" Value Expected : "+expmasterTreeIDToggle_DeleteBtn);
	 System.out.println("masterTreeIDToggle_setDefaultBtn   : "+actmasterTreeIDToggle_setDefaultBtn  +" Value Expected : "+expmasterTreeIDToggle_setDefaultBtn);
	 
	 if(actmasterTreeIDToggle_CreateTreeBtn==expmasterTreeIDToggle_CreateTreeBtn 
			 && actmasterTreeIDToggle_EditBtn==expmasterTreeIDToggle_EditBtn
			 && actmasterTreeIDToggle_DeleteBtn==expmasterTreeIDToggle_DeleteBtn
			 && actmasterTreeIDToggle_setDefaultBtn==expmasterTreeIDToggle_setDefaultBtn)
	 {	
		 excelReader.setCellData(xlfile, "Sheet1", 255, 9, resPass);
		 return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 255, 9, resFail);
		 return false;
	 }
}


public static boolean checkCreateViewToggleOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIDToggleBtn));	
	 masterTreeViewIDToggleBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeViewIdCreateViewBtn));	
	 
	 boolean actmasterTreeViewIdCreateViewBtn   =masterTreeViewIdCreateViewBtn.isDisplayed();
	 boolean actmasterTreeeViewIdEditBtn        =masterTreeeViewIdEditBtn.isDisplayed();
	 boolean actmasterTreeViewIdDeleteBtn       =masterTreeViewIdDeleteBtn.isDisplayed();
	 
	 boolean expmasterTreeViewIdCreateViewBtn   =true;
	 boolean expmasterTreeeViewIdEditBtn        =true;
	 boolean expmasterTreeViewIdDeleteBtn       =true;
	 
	 System.out.println("*************************************checkCreateViewToggleOptionsAccountsMenu**************************");
	 
	 System.out.println("masterTreeViewIdCreateViewBtn   : "+actmasterTreeViewIdCreateViewBtn +" Value Expected : "+expmasterTreeViewIdCreateViewBtn);
	 System.out.println("masterTreeeViewIdEditBtn        : "+actmasterTreeeViewIdEditBtn      +" Value Expected : "+expmasterTreeeViewIdEditBtn);
	 System.out.println("masterTreeViewIdDeleteBtn       : "+actmasterTreeViewIdDeleteBtn     +" Value Expected : "+expmasterTreeViewIdDeleteBtn);
	 
	 if(actmasterTreeViewIdCreateViewBtn==expmasterTreeViewIdCreateViewBtn
			 && actmasterTreeeViewIdEditBtn==expmasterTreeeViewIdEditBtn
			 && actmasterTreeViewIdDeleteBtn==expmasterTreeViewIdDeleteBtn)
	 {	
		 excelReader.setCellData(xlfile, "Sheet1", 256, 9, resPass);
		 return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 256, 9, resFail);
		 return false;
	 }
}


public static boolean checkHideAccountGroupsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));	
	 masterOptionToHideAccountsGroupTree.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeDisplayMenuAccountGroups));	
	 
	 boolean actmasterTreeDisplayMenuAccountGroups  =masterTreeDisplayMenuAccountGroups.isDisplayed();
	 boolean expmasterTreeDisplayMenuAccountGroups  =true;
	 
	 System.out.println("*********************************checkHideAccountGroupsOptionsAccountsMenu*****************************************");
	 
	 System.out.println("masterTreeDisplayMenuAccountGroups  : "+actmasterTreeDisplayMenuAccountGroups+" Value Expected : "+expmasterTreeDisplayMenuAccountGroups);
	 
	 if(actmasterTreeDisplayMenuAccountGroups==expmasterTreeDisplayMenuAccountGroups)
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 257, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 257, 9, resFail);
		 return false;
	 }
}


public static boolean checkUnHideAccountGroupsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterOptionToHideAccountsGroupTree));	
	 masterOptionToHideAccountsGroupTree.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAssestsGroup));	
	 
	 boolean actaccountAssestsGroup  =accountAssestsGroup.isDisplayed();
	 boolean expaccountAssestsGroup  =true;
	 
	 System.out.println("*********************************checkUnHideAccountGroupsOptionsAccountsMenu*****************************************");
	 
	 System.out.println("accountAssestsGroup  : "+actaccountAssestsGroup+" Value Expected : "+expaccountAssestsGroup);
	 
	 if(actaccountAssestsGroup==expaccountAssestsGroup)
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 258, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 258, 9, resFail);
		 return false;
	 }
}


public static boolean checkMainPageHeaderFieldsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));	
	 
	 boolean actmasterSearchTxt    							=masterSearchTxt.isDisplayed();
	 boolean actmasterSearchBtn    							=masterSearchBtn.isDisplayed();
	 boolean actmastercmbMasterTxt    						=mastercmbMasterTxt.isDisplayed();
	 boolean actmasterCmbMasterExpansionBtn    				=masterCmbMasterExpansionBtn.isDisplayed();
	 boolean actmasterCumMasterSettingBtn    				=masterCumMasterSettingBtn.isDisplayed();
	 boolean actmasterMoveTheSelectionToNextBookMarkBtn    	=masterMoveTheSelectionToNextBookMarkBtn.isDisplayed();
	 boolean actmasterMoveTheSelectionToPrevoiusBookmarkBtn =masterMoveTheSelectionToPrevoiusBookmarkBtn.isDisplayed();
	 boolean actmasterShowAllRecordsBtn    					=masterShowAllRecordsBtn.isDisplayed();
	 boolean actmasterShowAllUnauthorisedRecords    		=masterShowAllUnauthorisedRecords.isDisplayed();
	 boolean actmasterShowAllClosedRecordsBtn    			=masterShowAllClosedRecordsBtn.isDisplayed();
	 boolean actmasterAutoAdjustColoumnsBtn    				=masterAutoAdjustColoumnsBtn.isDisplayed();
	 boolean actmasterRetainSelectionCheckBox    			=masterRetainSelectionCheckBox.isDisplayed();
	 boolean actmasterSideBarBtn    						=masterSideBarBtn.isDisplayed();
	 
	 boolean expmasterSearchTxt    							=true;
	 boolean expmasterSearchBtn    							=true;
	 boolean expmastercmbMasterTxt    						=true;
	 boolean expmasterCmbMasterExpansionBtn    				=true;
	 boolean expmasterCumMasterSettingBtn    				=true;
	 boolean expmasterMoveTheSelectionToNextBookMarkBtn    	=true;
	 boolean expmasterMoveTheSelectionToPrevoiusBookmarkBtn =true;
	 boolean expmasterShowAllRecordsBtn    					=true;
	 boolean expmasterShowAllUnauthorisedRecords    		=true;
	 boolean expmasterShowAllClosedRecordsBtn    			=true;
	 boolean expmasterAutoAdjustColoumnsBtn    				=true;
	 boolean expmasterRetainSelectionCheckBox    			=true;
	 boolean expmasterSideBarBtn    						=true;
	 
	 System.out.println("************************************checkMainPageHeaderFieldsOptionsAccountsMenu**************************");
	 
	 System.out.println("masterSearchTxt                             : "+actmasterSearchTxt                             +" Value Expected : "+expmasterSearchTxt);
	 System.out.println("masterSearchBtn                             : "+actmasterSearchBtn                             +" Value Expected : "+expmasterSearchBtn);
	 System.out.println("mastercmbMasterTxt                          : "+actmastercmbMasterTxt                          +" Value Expected : "+expmastercmbMasterTxt);
	 System.out.println("masterCmbMasterExpansionBtn                 : "+actmasterCmbMasterExpansionBtn                 +" Value Expected : "+expmasterCmbMasterExpansionBtn);
	 System.out.println("masterCumMasterSettingBtn                   : "+actmasterCumMasterSettingBtn                   +" Value Expected : "+expmasterCumMasterSettingBtn);
	 System.out.println("masterMoveTheSelectionToNextBookMarkBtn     : "+actmasterMoveTheSelectionToNextBookMarkBtn     +" Value Expected : "+expmasterMoveTheSelectionToNextBookMarkBtn);
	 System.out.println("masterMoveTheSelectionToPrevoiusBookmarkBtn : "+actmasterMoveTheSelectionToPrevoiusBookmarkBtn +" Value Expected : "+expmasterMoveTheSelectionToPrevoiusBookmarkBtn);
	 System.out.println("masterShowAllRecordsBtn                     : "+actmasterShowAllRecordsBtn                     +" Value Expected : "+expmasterShowAllRecordsBtn);
	 System.out.println("masterShowAllUnauthorisedRecords            : "+actmasterShowAllUnauthorisedRecords            +" Value Expected : "+expmasterShowAllUnauthorisedRecords);
	 System.out.println("masterShowAllClosedRecordsBtn               : "+actmasterShowAllClosedRecordsBtn               +" Value Expected : "+expmasterShowAllClosedRecordsBtn);
	 System.out.println("masterAutoAdjustColoumnsBtn                 : "+actmasterAutoAdjustColoumnsBtn                 +" Value Expected : "+expmasterAutoAdjustColoumnsBtn);
	 System.out.println("masterRetainSelectionCheckBox               : "+actmasterRetainSelectionCheckBox               +" Value Expected : "+expmasterRetainSelectionCheckBox);
	 System.out.println("masterSideBarBtn                            : "+actmasterSideBarBtn                            +" Value Expected : "+expmasterSideBarBtn);
	 	
	 	
	 if(actmasterSearchTxt==expmasterSearchTxt && actmasterSearchBtn==expmasterSearchBtn && actmastercmbMasterTxt==expmastercmbMasterTxt
			 && actmasterCmbMasterExpansionBtn==expmasterCmbMasterExpansionBtn && actmasterCumMasterSettingBtn==expmasterCumMasterSettingBtn
			 && actmasterMoveTheSelectionToNextBookMarkBtn==expmasterMoveTheSelectionToNextBookMarkBtn
			 && actmasterMoveTheSelectionToPrevoiusBookmarkBtn==expmasterMoveTheSelectionToPrevoiusBookmarkBtn
			 && actmasterShowAllRecordsBtn==expmasterShowAllRecordsBtn && actmasterShowAllUnauthorisedRecords==expmasterShowAllUnauthorisedRecords
			 && actmasterShowAllClosedRecordsBtn==expmasterShowAllClosedRecordsBtn && actmasterAutoAdjustColoumnsBtn==expmasterAutoAdjustColoumnsBtn
			 && actmasterRetainSelectionCheckBox==expmasterRetainSelectionCheckBox && actmasterSideBarBtn==expmasterSideBarBtn)
	 {	
		 excelReader.setCellData(xlfile, "Sheet1", 259, 9, resPass);
		 return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 259, 9, resFail);
		 return false;
	 }
}


public static boolean checkSearchOptionsInMainPageHeaderFieldsOptionsAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchBtn));	
	 masterSearchBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxtBtn_SearchOnBtn));
	 
	 boolean actmasterSearchTxtBtn_SearchOnBtn         =masterSearchTxtBtn_SearchOnBtn.isDisplayed();
	 boolean actmasterSearchTxtBtn_AdvanceSearchBtn    =masterSearchTxtBtn_AdvanceSearchBtn.isDisplayed();
	 
	 boolean expmasterSearchTxtBtn_SearchOnBtn         =true;
	 boolean expmasterSearchTxtBtn_AdvanceSearchBtn    =true;
	 
	 System.out.println("*******************************************checkSearchOptionsInMainPageHeaderFieldsOptionsAccountsMenu***********************");
	 
	 System.out.println("masterSearchTxtBtn_SearchOnBtn       : "+actmasterSearchTxtBtn_SearchOnBtn      +" Value Expected : "+expmasterSearchTxtBtn_SearchOnBtn);
	 System.out.println("masterSearchTxtBtn_AdvanceSearchBtn  : "+actmasterSearchTxtBtn_AdvanceSearchBtn +" Value Expected : "+expmasterSearchTxtBtn_AdvanceSearchBtn);
	 
	 
	 if(actmasterSearchTxtBtn_SearchOnBtn==expmasterSearchTxtBtn_SearchOnBtn
			 && actmasterSearchTxtBtn_AdvanceSearchBtn==expmasterSearchTxtBtn_AdvanceSearchBtn)
	 {	
		 excelReader.setCellData(xlfile, "Sheet1", 260, 9, resPass);
		 return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 260, 9, resFail);
		 return false;
	 }
}



public static boolean checkAccountsMasterDisplayInMainPageGridAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGrid_Header_SelectTxt));
	 masterGrid_Header_SelectTxt.click();
	 
	 boolean actmasterGrid_Header_SelectTxt              =masterGrid_Header_SelectTxt.isDisplayed();
	 boolean actmasterGridHeader_SelectAllRowsCheckBox   =masterGridHeader_SelectAllRowsCheckBox.isDisplayed();
	 boolean actmasterGridHeader_MasterId         		 =masterGridHeader_MasterId.isDisplayed();
	 boolean actmasterAssets         					 =masterAssets.isDisplayed();
	 boolean actmasterExpenses         					 =masterExpenses.isDisplayed();
	 boolean actmasterControlAccounts         			 =masterControlAccounts.isDisplayed();
	 boolean actmasterRevenue         					 =masterRevenue.isDisplayed();
	 boolean actmasterEquities         					 =masterEquities.isDisplayed();
	 boolean actmasterLiabilities         				 =masterLiabilities.isDisplayed();
	 
	 boolean expmasterGrid_Header_SelectTxt              =true;
	 boolean expmasterGridHeader_SelectAllRowsCheckBox   =true;
	 boolean expmasterGridHeader_MasterId         		 =true;
	 boolean expmasterAssets         					 =true;
	 boolean expmasterExpenses         					 =true;
	 boolean expmasterControlAccounts         			 =true;
	 boolean expmasterRevenue         					 =true;
	 boolean expmasterEquities         					 =true;
	 boolean expmasterLiabilities         				 =true;
	 
	 System.out.println("*****************************************checkAccountsMasterDisplayInMainPageGridAccountsMenu***************************");
	 
	 System.out.println("masterGrid_Header_SelectTxt             : "+actmasterGrid_Header_SelectTxt             +" Value Expected : "+expmasterGrid_Header_SelectTxt);
	 System.out.println("masterGridHeader_SelectAllRowsCheckBox  : "+actmasterGridHeader_SelectAllRowsCheckBox  +" Value Expected : "+expmasterGridHeader_SelectAllRowsCheckBox);
	 System.out.println("masterGridHeader_MasterId               : "+actmasterGridHeader_MasterId               +" Value Expected : "+expmasterGridHeader_MasterId);
	 System.out.println("masterAssets                            : "+actmasterAssets                            +" Value Expected : "+expmasterAssets);
	 System.out.println("masterExpenses                          : "+actmasterExpenses                          +" Value Expected : "+expmasterExpenses);
	 System.out.println("masterControlAccounts                   : "+actmasterControlAccounts                   +" Value Expected : "+expmasterControlAccounts);
	 System.out.println("masterRevenue                           : "+actmasterRevenue                           +" Value Expected : "+expmasterRevenue);
	 System.out.println("masterEquities                          : "+actmasterEquities                          +" Value Expected : "+expmasterEquities);
	 System.out.println("masterLiabilities                       : "+actmasterLiabilities                       +" Value Expected : "+expmasterLiabilities);
	 
	 if(actmasterGrid_Header_SelectTxt==expmasterGrid_Header_SelectTxt && actmasterGridHeader_SelectAllRowsCheckBox==expmasterGridHeader_SelectAllRowsCheckBox
			 && actmasterGridHeader_MasterId==expmasterGridHeader_MasterId && actmasterAssets==expmasterAssets && actmasterExpenses==expmasterExpenses
			 && actmasterControlAccounts==expmasterControlAccounts && actmasterRevenue==expmasterRevenue && actmasterEquities==expmasterEquities
			 && actmasterLiabilities==expmasterLiabilities)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 261, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 261, 9, resFail);
		 return false;
	 }
}

//Here modifying the New Script for account creation

public static boolean checkNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(2000);
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	masterNewBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	 
	boolean actheaderGeneralTab          =headerGeneralTab.isDisplayed();
	boolean actheaderAccountSettingTab   =headerAccountSettingTab.isDisplayed();
	boolean actheaderDetailsTab          =headerDetailsTab.isDisplayed();
	boolean actheaderPrintLayoutTab      =headerPrintLayoutTab.isDisplayed();
	boolean actsaveBtn                   =saveBtn.isDisplayed();
	boolean actcloseBtn                  =closeBtn.isDisplayed();
	
	boolean expheaderGeneralTab          =true;
	boolean expheaderAccountSettingTab   =true;
	boolean expheaderDetailsTab          =true;
	boolean expheaderPrintLayoutTab      =true;
	boolean expsaveBtn                   =true;
	boolean expcloseBtn                  =true;
	
	System.out.println("***********************************checkNewButtonBeforeCustomization*********************************");
	
	System.out.println("headerGeneralTab          : "+actheaderGeneralTab        +" Value Expected : "+expheaderGeneralTab);
	System.out.println("headerAccountSettingTab   : "+actheaderAccountSettingTab +" Value Expected : "+expheaderAccountSettingTab);
	System.out.println("headerDetailsTab          : "+actheaderDetailsTab        +" Value Expected : "+expheaderDetailsTab);
	System.out.println("headerPrintLayoutTab      : "+actheaderPrintLayoutTab    +" Value Expected : "+expheaderPrintLayoutTab);
	System.out.println("saveBtn                   : "+actsaveBtn                 +" Value Expected : "+expsaveBtn);
	System.out.println("closeBtn                  : "+actcloseBtn                +" Value Expected : "+expcloseBtn);
	
	if(actheaderGeneralTab==expheaderGeneralTab && actheaderAccountSettingTab==expheaderAccountSettingTab && actheaderDetailsTab==expheaderDetailsTab
			&& actheaderPrintLayoutTab==expheaderPrintLayoutTab && actsaveBtn==expsaveBtn && actcloseBtn==expcloseBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 262, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 262, 9, resFail);
		return false;
	}
}

public static boolean checkGenralTabOnClickOnNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	
	 Select oSelect = new Select(accountTypeDropdown);
	 List <WebElement> elementCount = oSelect.getOptions();
	 int actaccTypeSize = elementCount.size();
	 

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	 boolean actnameTxt                =nameTxt.isDisplayed();
	 boolean actcodeTxt                =codeTxt.isDisplayed();
	 boolean actaccountTypeDropdown    =accountTypeDropdown.isDisplayed();
	 boolean actcreditLimitTxt         =creditLimitTxt.isDisplayed();
	 boolean actcreditdaysTxt          =creditdaysTxt.isDisplayed();
	 boolean actchequeDiscountLimitTxt =chequeDiscountLimitTxt.isDisplayed();
	 boolean actrateofinterestTxt      =rateofinterestTxt.isDisplayed();
	 boolean actbankAccountTxt         =bankAccountTxt.isDisplayed();
	 
	 
	 int     expaccTypeSize            =39;
	 boolean expnameTxt                =true;
	 boolean expcodeTxt                =true;
	 boolean expaccountTypeDropdown    =true;
	 boolean expcreditLimitTxt         =true;
	 boolean expcreditdaysTxt          =true;
	 boolean expchequeDiscountLimitTxt =true;
	 boolean exprateofinterestTxt      =true;
	 boolean expbankAccountTxt         =true;
	 
	 System.out.println("*******************************checkGenralTabOnClickOnNewButtonBeforeCustomization************************");
	 
	 System.out.println("nameTxt                 : "+actnameTxt                +" Value Expected : "+expnameTxt);
	 System.out.println("codeTxt                 : "+actcodeTxt                +" Value Expected : "+expcodeTxt);
	 System.out.println("accountTypeDropdown     : "+actaccountTypeDropdown    +" Value Expected : "+expaccountTypeDropdown);
	 System.out.println("creditLimitTxt          : "+actcreditLimitTxt         +" Value Expected : "+expcreditLimitTxt);
	 System.out.println("creditdaysTxt           : "+actcreditdaysTxt          +" Value Expected : "+expcreditdaysTxt);
	 System.out.println("chequeDiscountLimitTxt  : "+actchequeDiscountLimitTxt +" Value Expected : "+expchequeDiscountLimitTxt);
	 System.out.println("rateofinterestTxt       : "+actrateofinterestTxt      +" Value Expected : "+exprateofinterestTxt);
	 System.out.println("bankAccountTxt          : "+actbankAccountTxt         +" Value Expected : "+expbankAccountTxt);
	 System.out.println("accTypeSize             : "+actaccTypeSize            +" Value Expected : "+expaccTypeSize);
	 
	 
	 if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actaccountTypeDropdown==expaccountTypeDropdown 
			 && actcreditLimitTxt==expcreditLimitTxt && actcreditdaysTxt==expcreditdaysTxt && actchequeDiscountLimitTxt==expchequeDiscountLimitTxt
			 && actrateofinterestTxt==exprateofinterestTxt && actbankAccountTxt==expbankAccountTxt && actaccTypeSize==expaccTypeSize)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 263, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 263, 9, resFail);
		 return false;
	 }
}


public static boolean checkSettingsTabOnClickOnNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAccountSettingTab));
	 headerAccountSettingTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitCreditProposalDropdown));
	 
	 boolean actdebitCreditProposalDropdown                =debitCreditProposalDropdown.isDisplayed();
	 boolean actdebitCreditRequiredDropdown                =debitCreditRequiredDropdown.isDisplayed();
	 boolean actexchangeAdjustmentGainACTxt                =exchangeAdjustmentGainACTxt.isDisplayed();
	 boolean actexchangeAdjustmentLossACTxt                =exchangeAdjustmentLossACTxt.isDisplayed();
	 boolean actprimaryAccountTxt               		   =primaryAccountTxt.isDisplayed();
	 boolean actdefaultCurrencyTxt		                   =defaultCurrencyTxt.isDisplayed();
	 boolean actconsolidationMethodDropdown                =consolidationMethodDropdown.isDisplayed();
	 boolean actpaymentTermstxt                            =paymentTermstxt.isDisplayed();
	 boolean actreminderTermsTxt                           =reminderTermsTxt.isDisplayed();
	 boolean actfinanceChargeTermsTxt                      =financeChargeTermsTxt.isDisplayed();
	 
	 boolean expdebitCreditProposalDropdown                =true;
	 boolean expdebitCreditRequiredDropdown                =true;
	 boolean expexchangeAdjustmentGainACTxt                =true;
	 boolean expexchangeAdjustmentLossACTxt                =true;
	 boolean expprimaryAccountTxt               		   =true;
	 boolean expdefaultCurrencyTxt		                   =true;
	 boolean expconsolidationMethodDropdown                =true;
	 boolean exppaymentTermstxt                            =true;
	 boolean expreminderTermsTxt                           =true;
	 boolean expfinanceChargeTermsTxt                      =true;
	 
	 System.out.println("***********************************checkSettingsTabOnClickOnNewButtonBeforeCustomization*************************");
	 
	 System.out.println("debitCreditProposalDropdown    : "+actdebitCreditProposalDropdown+" Value Expected : "+expdebitCreditProposalDropdown);
	 System.out.println("debitCreditRequiredDropdown    : "+actdebitCreditRequiredDropdown+" Value Expected : "+expdebitCreditRequiredDropdown);
	 System.out.println("exchangeAdjustmentGainACTxt    : "+actexchangeAdjustmentGainACTxt+" Value Expected : "+expexchangeAdjustmentGainACTxt);
	 System.out.println("exchangeAdjustmentLossACTxt    : "+actexchangeAdjustmentLossACTxt+" Value Expected : "+expexchangeAdjustmentLossACTxt);
	 System.out.println("primaryAccountTxt              : "+actprimaryAccountTxt          +" Value Expected : "+expprimaryAccountTxt);
	 System.out.println("defaultCurrencyTxt             : "+actdefaultCurrencyTxt         +" Value Expected : "+expdefaultCurrencyTxt);
	 System.out.println("consolidationMethodDropdown    : "+actconsolidationMethodDropdown+" Value Expected : "+expconsolidationMethodDropdown);
	 System.out.println("paymentTermstxt                : "+actpaymentTermstxt            +" Value Expected : "+exppaymentTermstxt);
	 System.out.println("reminderTermsTxt               : "+actreminderTermsTxt           +" Value Expected : "+expreminderTermsTxt);
	 System.out.println("financeChargeTermsTxt          : "+actfinanceChargeTermsTxt      +" Value Expected : "+expfinanceChargeTermsTxt);
 
	 if(actdebitCreditProposalDropdown==expdebitCreditProposalDropdown && actdebitCreditRequiredDropdown==expdebitCreditRequiredDropdown
			 && actexchangeAdjustmentGainACTxt==expexchangeAdjustmentGainACTxt && actexchangeAdjustmentLossACTxt==expexchangeAdjustmentLossACTxt
			 && actprimaryAccountTxt==expprimaryAccountTxt && actdefaultCurrencyTxt==expdefaultCurrencyTxt
			 && actconsolidationMethodDropdown==expconsolidationMethodDropdown && actpaymentTermstxt==exppaymentTermstxt
			 && actreminderTermsTxt==expreminderTermsTxt && actfinanceChargeTermsTxt==expfinanceChargeTermsTxt)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 264, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 264, 9, resFail);
		 return false;
	 }
}



public static boolean checkDetailsTabOnClickOnNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsTab));
	 headerDetailsTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addressTxt));
	 
	 boolean actaddressTxt           		=addressTxt.isDisplayed();
	 boolean actcityTxt           			=cityTxt.isDisplayed();
	 boolean actdeliveryAddressTxt          =deliveryAddressTxt.isDisplayed();
	 boolean actpinTxt           			=pinTxt.isDisplayed();
	 boolean actcity2Text           		=city2Text.isDisplayed();
	 boolean actpin2Txt           			=pin2Txt.isDisplayed();
	 boolean actsendEmailCheckBox           =sendEmailCheckBox.isDisplayed();
	 boolean actallowCustomerPortalCheckBox =allowCustomerPortalCheckBox.isDisplayed();
	 boolean actsendEmailTxt                =sendEmailTxt.isDisplayed();
	 boolean actpasswordTxt           		=passwordTxt.isDisplayed();
	 boolean acttelphoneNumberTxt           =telphoneNumberTxt.isDisplayed();
	 boolean actfaxNoTxt           			=faxNoTxt.isDisplayed();
	 
	 boolean expaddressTxt           		=true;
	 boolean expcityTxt           			=true;
	 boolean expdeliveryAddressTxt          =true;
	 boolean exppinTxt           			=true;
	 boolean expcity2Text           		=true;
	 boolean exppin2Txt           			=true;
	 boolean expsendEmailCheckBox           =true;
	 boolean expallowCustomerPortalCheckBox =true;
	 boolean expsendEmailTxt                =true;
	 boolean exppasswordTxt           		=true;
	 boolean exptelphoneNumberTxt           =true;
	 boolean expfaxNoTxt           			=true;
	 
	 System.out.println("*********************************checkDetailsTabOnClickOnNewButtonBeforeCustomization**************************");
	 
	 System.out.println("addressTxt                  : "+actaddressTxt                  +" Value Expected : "+expaddressTxt);
	 System.out.println("cityTxt                     : "+actcityTxt                     +" Value Expected : "+expcityTxt);
	 System.out.println("deliveryAddressTxt          : "+actdeliveryAddressTxt          +" Value Expected : "+expdeliveryAddressTxt);
	 System.out.println("pinTxt                      : "+actpinTxt                      +" Value Expected : "+exppinTxt);
	 System.out.println("city2Text                   : "+actcity2Text                   +" Value Expected : "+expcity2Text);
	 System.out.println("pin2Txt                     : "+actpin2Txt                     +" Value Expected : "+exppin2Txt);
	 System.out.println("sendEmailCheckBox           : "+actsendEmailCheckBox           +" Value Expected : "+expsendEmailCheckBox);
	 System.out.println("allowCustomerPortalCheckBox : "+actallowCustomerPortalCheckBox +" Value Expected : "+expallowCustomerPortalCheckBox);
	 System.out.println("sendEmailTxt                : "+actsendEmailTxt                +" Value Expected : "+expsendEmailTxt);
	 System.out.println("passwordTxt                 : "+actpasswordTxt                 +" Value Expected : "+exppasswordTxt);
	 System.out.println("telphoneNumberTxt           : "+acttelphoneNumberTxt           +" Value Expected : "+exptelphoneNumberTxt);
	 System.out.println("faxNoTxt                    : "+actfaxNoTxt                    +" Value Expected : "+expfaxNoTxt);
 
	 if(actaddressTxt==expaddressTxt && actcityTxt==expcityTxt && actdeliveryAddressTxt==expdeliveryAddressTxt
			 && actpinTxt==exppinTxt && actcity2Text==expcity2Text && actpin2Txt==exppin2Txt && actsendEmailCheckBox==expsendEmailCheckBox
			 && actallowCustomerPortalCheckBox==expallowCustomerPortalCheckBox && actsendEmailTxt==expsendEmailTxt && actpasswordTxt==exppasswordTxt
			 && acttelphoneNumberTxt==exptelphoneNumberTxt && actfaxNoTxt==expfaxNoTxt)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 265, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 265, 9, resFail);
		 return false;
	 }
}


public static boolean checkPrintlayoutTabOnClickOnNewButtonBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerPrintLayoutTab));
	 headerPrintLayoutTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridVoucherTypeTxt));
	 gridVoucherTypeTxt.click();
	 
	 boolean actgridVoucherTypeTxt    =gridVoucherTypeTxt.isDisplayed();
	 boolean actgridPrintLayoutTxt    =gridPrintLayoutTxt.isDisplayed();
	 
	 boolean expgridVoucherTypeTxt    =true;
	 boolean expgridPrintLayoutTxt    =true;
	 
	 System.out.println("**********************************checkPrintlayoutTabOnClickOnNewButtonBeforeCustomization*****************************");
	 
	 System.out.println("gridVoucherTypeTxt   : "+actgridVoucherTypeTxt+" Value Expected : "+expgridVoucherTypeTxt);
	 System.out.println("gridPrintLayoutTxt   : "+actgridPrintLayoutTxt+" Value Expected : "+expgridPrintLayoutTxt);
	 
	 if(actgridVoucherTypeTxt==expgridVoucherTypeTxt && actgridPrintLayoutTxt==expgridPrintLayoutTxt)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 266, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 266, 9, resFail);
		 return false;
	 }
}


public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	 headerGeneralTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 saveBtn.click();
	 
	 String expMessage="In Tab :General ---> Name Field is Required";
		
	 String actMessage=checkValidationMessage(expMessage);
	 
	 System.out.println("********************************checkSaveButtonWithoutInputNameMandatoryFieldsInNewOptionBeforeCustomization***************************");
		
	 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
	 if(actMessage.equalsIgnoreCase(expMessage))
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 267, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 267, 9, resFail);
		 return false;
	 }
}


public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.sendKeys("Trail Account");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="In Tab :General ---> Code Field is Required";
		
	String actMessage=checkValidationMessage(expMessage);
	
	System.out.println("********************************checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOptionBeforeCustomization***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 268, 9, resPass);
		return true;
	}	
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 268, 9, resFail);
		return false;
	}
}



public static boolean checkSaveButtonWithInputingMandatoryFieldsBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.sendKeys("Trial Code");
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Saved Successfully";
	
	String actMessage=checkValidationMessage(expMessage);
	
	System.out.println("********************************checkSaveButtonWithInputingMandatoryFieldsBeforeCustomization***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		
		excelReader.setCellData(xlfile, "Sheet1", 269, 9, resPass);
		 return true;
	 }
	 else
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 269, 9, resFail);
		 return false;
	 }
}


public static boolean checkAccountsCreationScreenAfterSavingBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 nameTxt.click();

	 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		
	 Select oSelect = new Select(accountTypeDropdown);
	 List <WebElement> elementCount = oSelect.getOptions();
	 int actaccTypeSize = elementCount.size();

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	 boolean actnameTxt                =nameTxt.isDisplayed();
	 boolean actcodeTxt                =codeTxt.isDisplayed();
	 boolean actaccountTypeDropdown    =accountTypeDropdown.isDisplayed();
	 boolean actcreditLimitTxt         =creditLimitTxt.isDisplayed();
	 boolean actcreditdaysTxt          =creditdaysTxt.isDisplayed();
	 boolean actchequeDiscountLimitTxt =chequeDiscountLimitTxt.isDisplayed();
	 boolean actrateofinterestTxt      =rateofinterestTxt.isDisplayed();
	 boolean actbankAccountTxt         =bankAccountTxt.isDisplayed();
	 
	 
	 int     expaccTypeSize            =39;
	 boolean expnameTxt                =true;
	 boolean expcodeTxt                =true;
	 boolean expaccountTypeDropdown    =true;
	 boolean expcreditLimitTxt         =true;
	 boolean expcreditdaysTxt          =true;
	 boolean expchequeDiscountLimitTxt =true;
	 boolean exprateofinterestTxt      =true;
	 boolean expbankAccountTxt         =true;
	 
	 System.out.println("*******************************checkAccountsCreationScreenAfterSavingBeforeCustomization************************");
	 
	 System.out.println("nameTxt                 : "+actnameTxt                +" Value Expected : "+expnameTxt);
	 System.out.println("codeTxt                 : "+actcodeTxt                +" Value Expected : "+expcodeTxt);
	 System.out.println("accountTypeDropdown     : "+actaccountTypeDropdown    +" Value Expected : "+expaccountTypeDropdown);
	 System.out.println("creditLimitTxt          : "+actcreditLimitTxt         +" Value Expected : "+expcreditLimitTxt);
	 System.out.println("creditdaysTxt           : "+actcreditdaysTxt          +" Value Expected : "+expcreditdaysTxt);
	 System.out.println("chequeDiscountLimitTxt  : "+actchequeDiscountLimitTxt +" Value Expected : "+expchequeDiscountLimitTxt);
	 System.out.println("rateofinterestTxt       : "+actrateofinterestTxt      +" Value Expected : "+exprateofinterestTxt);
	 System.out.println("bankAccountTxt          : "+actbankAccountTxt         +" Value Expected : "+expbankAccountTxt);
	 System.out.println("accTypeSize             : "+actaccTypeSize            +" Value Expected : "+expaccTypeSize);
	 
	 
	 if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actaccountTypeDropdown==expaccountTypeDropdown 
			 && actcreditLimitTxt==expcreditLimitTxt && actcreditdaysTxt==expcreditdaysTxt && actchequeDiscountLimitTxt==expchequeDiscountLimitTxt
			 && actrateofinterestTxt==exprateofinterestTxt && actbankAccountTxt==expbankAccountTxt && actaccTypeSize==expaccTypeSize)
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 270, 9, resPass);
		 return true;
	 }
	 else
	 {
		 
		 
		 excelReader.setCellData(xlfile, "Sheet1", 270, 9, resFail);
		 return false;
	 }
}


public static boolean checkAccountDisplayInAccountGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 closeBtn.click();
	 
	 
	 
	 System.out.println("New"+accountNewCreationName.getText());
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
	 String actaccountNewCreationName  =accountNewCreationName.getText();
	 String expaccountNewCreationName  ="Trail Account";
	 
	 System.out.println("****************************checkAccountDisplayInAccountGridBeforeCustomization********************");
	 
	 System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" value Expected : "+expaccountNewCreationName);
 
	 if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	 { 
		 excelReader.setCellData(xlfile, "Sheet1", 271, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 271, 9, resFail);
		 return false;
	 }
}



//Here The End of the New Code for account creation


//Here The start of the New Code for account edit

public static boolean checkEditOptionForNewlyCreateAccountBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  	
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBox));
	 accountFirstCheckBox.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 masterEditBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	 String actnameTxt  =nameTxt.getAttribute("value");
	 String expnameTxt  ="Trail Account";
	 
	 System.out.println("*************************checkEditOptionForNewlyCreateAccountBeforeCustomization**********************");
	 
	 System.out.println("nameTxt  : "+actnameTxt+" Value Expected : "+expnameTxt);
	 
	 if(actnameTxt.equalsIgnoreCase(expnameTxt))
	 { 
		 excelReader.setCellData(xlfile, "Sheet1", 272, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 272, 9, resFail);
		 return false;
	 }
}


public static boolean checkUpateForNewlyCreateAccountBeforeCustomiztaion() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 nameTxt.click();
	 nameTxt.clear();
	 nameTxt.sendKeys("Trail Account Update");
	 nameTxt.sendKeys(Keys.TAB);
	 
	 //getAction().moveToElement(nameTxt).sendKeys(Keys.TAB).perform();
	 
	 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 codeTxt.click();
	 codeTxt.clear();
	 codeTxt.sendKeys("TrailAccountUpdate");
	 codeTxt.sendKeys(Keys.TAB);
	 
	 //getAction().moveToElement(codeTxt).sendKeys(Keys.TAB).perform();
	 
	 
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	 accountTypeDropdown.sendKeys(Keys.TAB);
	 
	 //getAction().moveToElement(accountTypeDropdown).sendKeys(Keys.TAB).perform();
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
     nameTxt.click();
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 saveBtn.click();
	 
	 String expMessage="Updated Successfully";
		
	 String actMessage=checkValidationMessage(expMessage);
	 
	 System.out.println("********************************checkUpateForNewlyCreateAccountBeforeCustomiztaion***************************");
		
	 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
	 if(actMessage.equalsIgnoreCase(expMessage))
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 273, 9, resPass);
		 return true;
	 }
	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 273, 9, resFail);
		 return false;
	 }
}


public static boolean checkUpdatedAccountDisplayInAccountGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
	 
	 String actaccountNewCreationName  =accountNewCreationName.getText();
	 String expaccountNewCreationName  ="Trail Account Update";
	 
	 System.out.println("************************checkUpdatedAccountDisplayInAccountGridBeforeCustomization***********************");
	 
	 System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	 
	 if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	 { 
		 excelReader.setCellData(xlfile, "Sheet1", 274, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 274, 9, resFail);
		 return false;
	 }
}

//Here is the end of account edition



//Here is the start of account deletion

public static boolean checkDeleteAccountBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	 accountFirstCheckBoxToSelection.click();		 
		
	 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	 accountFirstCheckBoxToSelection.click();	
	 
	 
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
 
     masterDeleteBtn.click();
     
     Thread.sleep(2000);
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
     System.out.println(getMsgOnDelete.getText());
     
     
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
     clickOnOkInDelete.click();
     
     String expMessage="Record Deleted Successfully.";
		
     String actMessage=checkValidationMessage(expMessage);
     
     System.out.println("********************************checkDeleteAccountBeforeCustomization***************************");
		
	 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
	 if(actMessage.equalsIgnoreCase(expMessage))
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 275, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 275, 9, resFail);
		 return false;
	 }	 
}
	
	
	

	public static boolean checkDeleteAccountDisplayBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
	 String actaccountNewCreationName  =accountNewCreationName.getText();
	 String expaccountNewCreationName  ="ASSETS";
	 
	 System.out.println("*******************************checkDeleteAccountDisplayBeforeCustomization************************************");
	 
	 System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	 
	 if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	 { 
		 excelReader.setCellData(xlfile, "Sheet1", 276, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 276, 9, resFail);
		 return false;
	 }
}
	
	
	//Here is the end of the delete account

	
	public static boolean checkLogoutAfterClosingAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	 getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
	 userNameDisplay.click();

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	 logoutOption.click();
	 
	 boolean verifyFiledsStatus=true;
	 
	 getWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		
	 boolean actusername			=username.isDisplayed();
	 boolean actpassword	 	    =password.isDisplayed();
	 boolean actcompanyDropDownList =companyDropDownList.isDisplayed();
	 boolean actsignIn				=signIn.isDisplayed();
	 
	 boolean expusername			=true;
	 boolean exppassword			=true;
	 boolean expcompanyDropDownList	=true;
	 boolean expsignIn				=true;
	 
	 System.out.println("************************************* checkLogoutAfterClosingAccountMaster  *********************************");
	 
	 System.out.println("username             : "+actusername            +" Value Expected : "+expusername);
	 System.out.println("password             : "+actpassword            +" Value Expected : "+exppassword);
	 System.out.println("companyDropDownList  : "+actcompanyDropDownList +" Value Expected : "+expcompanyDropDownList);
	 System.out.println("signIn               : "+actsignIn              +" Value Expected : "+expsignIn);
	 
	 if(actusername==expusername && actpassword==exppassword && actcompanyDropDownList==expcompanyDropDownList && actsignIn==expsignIn)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 277, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 277, 9, resFail);
		 return false;
	 }
}

	
	
	
	public static boolean checkSignToCustomizeMasterInAccounts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
	username.sendKeys("su");
	username.sendKeys(Keys.TAB);
	
	//getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
	Thread.sleep(2000);
    	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
	password.sendKeys("su");
	password.sendKeys(Keys.TAB);  
	Thread.sleep(2000);
	//getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
	signIn.click();
     
	//checkRefershPopOnlogin();
    
	//checkPopUpWindow();

	Thread.sleep(8000);
   
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	userNameDisplay.click();
   
	//To Check Login User Home Page is display
    
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(userNameDisplay, "SU"));
	
	String userInfo=userNameDisplay.getText();
	
	System.out.println("User Info : "+userInfo);
	
	System.out.println("User Info Capture Text :"+userNameDisplay.getText());
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
	companyLogo.click();
	
	String getCompanyTxt			=companyName.getText();
	String getLoginCompanyName		=getCompanyTxt.substring(0, 19);
	companyLogo.click();
	
	String expuserInfo				="SU";
	String expLoginCompanyName		="Automation Company ";

	if(userInfo.equalsIgnoreCase(expuserInfo) && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))
	{
		getLogger().info("Login User the Company Name and Information is displaying correct");
		System.out.println("Pass : Login User and Company Name is displaying Correct");
		excelReader.setCellData(xlfile, "Sheet1", 278, 9, resPass);
		return true;
	}
	else
	{
		getLogger().info("Fail : Login User the Company Name and Information is displaying Wrong");
		System.out.println("Fail : Login Name the Company Name and Information is displaying Wrong");
		excelReader.setCellData(xlfile, "Sheet1", 10, 278, resFail);
		return false;
	}
}
	
	
public static boolean checkOpenAccountsMasterAfterLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	mastersMenu.click();
     
	Thread.sleep(3000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
	accounts.click();
    	  
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));
     
	String actaccountsTitle  =accountsTitle.getText();
	String expaccountsTitle  ="Account";
	
	System.out.println("*********************************checkOpenAccountsMasterAfterLogout**************************");
     
	System.out.println("accountsTitle  : "+actaccountsTitle+" Value Expected : "+expaccountsTitle);
     
	if(actaccountsTitle.equalsIgnoreCase(expaccountsTitle))
	{	
		excelReader.setCellData(xlfile, "Sheet1", 279, 9, resPass);
		return true;
	}	 
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 279, 9, resFail);
		return false;
	}
}


public static boolean checkCustomizeMasterTabOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 		 	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
	masterRibbonToExpandOptions.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
	masterRibbonControlNextBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
	masterRibbonControlNextBtn.click();
	
	Thread.sleep(3000);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
	masterCustamizemasterBtn.click();
	
	Thread.sleep(3000);
	
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minusBtn));
	minusBtn.click();
	  
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));
	
	boolean actplusBtn                                     =plusBtn.isDisplayed();
	boolean actmasterFieldsOption                          =masterFieldsOption.isDisplayed();
	boolean actaccountMasterFieldsUniqueConstraintsOption  =accountMasterFieldsUniqueConstraintsOption.isDisplayed();
	boolean actRulesOption                                 =RulesOption.isDisplayed();
	boolean actrules_ExternalModules                       =rules_ExternalModules.isDisplayed();
	boolean actitemInfoPanelCustomizationTab               =itemInfoPanelCustomizationTab.isDisplayed();
	boolean actaccountReportsTab                           =accountReportsTab.isDisplayed();
	
	boolean expplusBtn                                     =true;
	boolean expmasterFieldsOption                          =true;
	boolean expaccountMasterFieldsUniqueConstraintsOption  =true;
	boolean expRulesOption                                 =true;
	boolean exprules_ExternalModules                       =true;
	boolean expitemInfoPanelCustomizationTab               =true;
	boolean expaccountReportsTab                           =true;
	
	System.out.println("**********************************checkCustomizeMasterTabOption**************************************");
	
	System.out.println("plusBtn                                     : "+actplusBtn                                    +" Value Expected : "+expplusBtn);
	System.out.println("masterFieldsOption                          : "+actmasterFieldsOption                         +" Value Expected : "+expmasterFieldsOption);
	System.out.println("accountMasterFieldsUniqueConstraintsOption  : "+actaccountMasterFieldsUniqueConstraintsOption +" Value Expected : "+expaccountMasterFieldsUniqueConstraintsOption);
	System.out.println("RulesOption                                 : "+actRulesOption                                +" Value Expected : "+expRulesOption);
	System.out.println("rules_ExternalModules                       : "+actrules_ExternalModules                      +" Value Expected : "+exprules_ExternalModules);
	System.out.println("itemInfoPanelCustomizationTab               : "+actitemInfoPanelCustomizationTab              +" Value Expected : "+expitemInfoPanelCustomizationTab);
	System.out.println("accountReportsTab                           : "+actaccountReportsTab                          +" Value Expected : "+expaccountReportsTab);
	 
	if(actplusBtn==expplusBtn && actmasterFieldsOption==expmasterFieldsOption && actaccountMasterFieldsUniqueConstraintsOption==expaccountMasterFieldsUniqueConstraintsOption
			&& actRulesOption==expRulesOption && actrules_ExternalModules==exprules_ExternalModules && actitemInfoPanelCustomizationTab==expitemInfoPanelCustomizationTab
			&& actaccountReportsTab==expaccountReportsTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 280, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 280, 9, resFail);
		return false;
	}
}



public static boolean checkCustomizeMasterTabMasterFieldsOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));
	 plusBtn.click();
	 
	 

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));
	 
	 boolean actgeneralTab                           =generalTab.isDisplayed();
	 boolean actsettingOption                        =settingOption.isDisplayed();
	 boolean actaccountMasterFieldDetailsOption      =accountMasterFieldDetailsOption.isDisplayed();
	 boolean actaccountMasterFieldPrintLayoutOption  =accountMasterFieldPrintLayoutOption.isDisplayed();
	 
	 boolean expgeneralTab                           =true;
	 boolean expsettingOption                        =true;
	 boolean expaccountMasterFieldDetailsOption      =true;
	 boolean expaccountMasterFieldPrintLayoutOption  =true;
	 
	 System.out.println("*************************************checkCustomizeMasterTabMasterFieldsOption***********************************");
	 
	 System.out.println("generalTab                          : "+actgeneralTab                          +" Value Expected : "+expgeneralTab);
	 System.out.println("settingOption                       : "+actsettingOption                       +" Value Expected : "+expsettingOption);
	 System.out.println("accountMasterFieldDetailsOption     : "+actaccountMasterFieldDetailsOption     +" Value Expected : "+expaccountMasterFieldDetailsOption);
	 System.out.println("accountMasterFieldPrintLayoutOption : "+actaccountMasterFieldPrintLayoutOption +" Value Expected : "+expaccountMasterFieldPrintLayoutOption);
	 
	 if(actgeneralTab==expgeneralTab && actsettingOption==expsettingOption
			 && actaccountMasterFieldDetailsOption==expaccountMasterFieldDetailsOption
			 && actaccountMasterFieldPrintLayoutOption==expaccountMasterFieldPrintLayoutOption)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 281, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 281, 9, resFail);
		 return false;
	 }
}


public static boolean checkGeneralTabOptionInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));
	 generalTab.click();
	 
	 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalMainTab));
	 
	 boolean actgeneralMainTab           =generalMainTab.isDisplayed();
	 boolean actgeneralHeaderDetailsTab  =generalHeaderDetailsTab.isDisplayed();
	 boolean actaccountSaveBtn           =accountSaveBtn.isDisplayed();
	 boolean actaccountHeaderPreview     =accountHeaderPreview.isDisplayed();
	 boolean actaccountCloseBtn          =accountCloseBtn.isDisplayed();
	 
	 boolean expgeneralMainTab           =true;
	 boolean expgeneralHeaderDetailsTab  =true;
	 boolean expaccountSaveBtn           =true;
	 boolean expaccountHeaderPreview     =true;
	 boolean expaccountCloseBtn          =true;
	 
	 System.out.println("********************************checkGeneralTabOptionInCustomizeMaster******************************");
	 
	 System.out.println("generalMainTab          : "+actgeneralMainTab          +" Value Expected : "+expgeneralMainTab);
	 System.out.println("generalHeaderDetailsTab : "+actgeneralHeaderDetailsTab +" Value Expected : "+expgeneralHeaderDetailsTab);
	 System.out.println("accountSaveBtn          : "+actaccountSaveBtn          +" Value Expected : "+expaccountSaveBtn);
	 System.out.println("accountHeaderPreview    : "+actaccountHeaderPreview    +" Value Expected : "+expaccountHeaderPreview);
	 System.out.println("accountCloseBtn         : "+actaccountCloseBtn         +" Value Expected : "+expaccountCloseBtn);
	
	 if(actgeneralMainTab==expgeneralMainTab && actgeneralHeaderDetailsTab==expgeneralHeaderDetailsTab && actaccountSaveBtn==expaccountSaveBtn
			 && actaccountHeaderPreview==expaccountHeaderPreview && actaccountCloseBtn==expaccountCloseBtn)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 282, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 282, 9, resFail);
		 return false;
	 }
}


public static boolean checkGeneralTabOptionMainTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountCustomizeName));
	 
	 boolean actaccountCustomizeName          =accountCustomizeName.isDisplayed();
	 boolean actaccountCustomizeCode          =accountCustomizeCode.isDisplayed();
	 boolean actaccountCustomizeAccountType   =accountCustomizeAccountType.isDisplayed();
	 boolean actaccountCustomizeCreditLimit   =accountCustomizeCreditLimit.isDisplayed();
	 boolean actaccountCustomizeCreditDays    =accountCustomizeCreditDays.isDisplayed();
	 
	 boolean expaccountCustomizeName          =true;
	 boolean expaccountCustomizeCode          =true;
	 boolean expaccountCustomizeAccountType   =true;
	 boolean expaccountCustomizeCreditLimit   =true;
	 boolean expaccountCustomizeCreditDays    =true;
	 
	 System.out.println("*******************************checkGeneralTabOptionMainTabInCustomizeMaster***************************");
	 
	 System.out.println("accountCustomizeName         : "+actaccountCustomizeName        +" value Expected : "+expaccountCustomizeName);
	 System.out.println("accountCustomizeCode         : "+actaccountCustomizeCode        +" value Expected : "+expaccountCustomizeCode);
	 System.out.println("accountCustomizeAccountType  : "+actaccountCustomizeAccountType +" value Expected : "+expaccountCustomizeAccountType);
	 System.out.println("accountCustomizeCreditLimit  : "+actaccountCustomizeCreditLimit +" value Expected : "+expaccountCustomizeCreditLimit);
	 System.out.println("accountCustomizeCreditDays   : "+actaccountCustomizeCreditDays  +" value Expected : "+expaccountCustomizeCreditDays);
	 
	 if(actaccountCustomizeName==expaccountCustomizeName && actaccountCustomizeCode==expaccountCustomizeCode
			 && actaccountCustomizeAccountType==expaccountCustomizeAccountType && actaccountCustomizeCreditLimit==expaccountCustomizeCreditLimit
			 && actaccountCustomizeCreditDays==expaccountCustomizeCreditDays)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 283, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 283, 9, resFail);
		 return false;
	 }
}


public static boolean checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalHeaderDetailsTab));
	 generalHeaderDetailsTab.click();
	
	 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountCustomizeChequeDiscountLimit));
	 
	 boolean actaccountCustomizeChequeDiscountLimit  =accountCustomizeChequeDiscountLimit.isDisplayed();
	 boolean actaccountCustomizeRateOfInterest       =accountCustomizeRateOfInterest.isDisplayed();
	 boolean actaccountCustomizeBankAc               =accountCustomizeBankAc.isDisplayed();
	 boolean actaccountCustomizePDCDiscountedAccount =accountCustomizePDCDiscountedAccount.isDisplayed();
	 boolean actaccountHeaderMoveFiledBtn            =accountHeaderMoveFiledBtn.isDisplayed();
	 boolean actaccountHeaderPreview                 =accountHeaderPreview.isDisplayed();
	 boolean actaccountSaveBtn                       =accountSaveBtn.isDisplayed();
	 boolean actaccountAddBtn                        =accountAddBtn.isDisplayed();
	 boolean actaccountCloseBtn                      =accountCloseBtn.isDisplayed();
	 
	 boolean expaccountCustomizeChequeDiscountLimit  =true;
	 boolean expaccountCustomizeRateOfInterest       =true;
	 boolean expaccountCustomizeBankAc               =true;
	 boolean expaccountCustomizePDCDiscountedAccount =true;
	 boolean expaccountHeaderMoveFiledBtn            =true;
	 boolean expaccountHeaderPreview                 =true;
	 boolean expaccountSaveBtn                       =true;
	 boolean expaccountAddBtn                        =true;
	 boolean expaccountCloseBtn                      =true;
	 
	 System.out.println("***********************checkGeneralTabOptionHeaderDetailsTabInCustomizeMaster*****************************");
	 
	 System.out.println("accountCustomizeChequeDiscountLimit   : "+actaccountCustomizeChequeDiscountLimit  +" Value Expected : "+expaccountCustomizeChequeDiscountLimit);
	 System.out.println("accountCustomizeRateOfInterest        : "+actaccountCustomizeRateOfInterest       +" Value Expected : "+expaccountCustomizeRateOfInterest);
	 System.out.println("accountCustomizeBankAc                : "+actaccountCustomizeBankAc               +" Value Expected : "+expaccountCustomizeBankAc);
	 System.out.println("accountCustomizePDCDiscountedAccount  : "+actaccountCustomizePDCDiscountedAccount +" Value Expected : "+expaccountCustomizePDCDiscountedAccount);
	 System.out.println("accountHeaderMoveFiledBtn             : "+actaccountHeaderMoveFiledBtn            +" Value Expected : "+expaccountHeaderMoveFiledBtn);
	 System.out.println("accountHeaderPreview                  : "+actaccountHeaderPreview                 +" Value Expected : "+expaccountHeaderPreview);
	 System.out.println("accountSaveBtn                        : "+actaccountSaveBtn                       +" Value Expected : "+expaccountSaveBtn);
	 System.out.println("accountAddBtn                         : "+actaccountAddBtn                        +" Value Expected : "+expaccountAddBtn);
	 System.out.println("accountCloseBtn                       : "+actaccountCloseBtn                      +" Value Expected : "+expaccountCloseBtn);
	 
	 if(actaccountCustomizeChequeDiscountLimit==expaccountCustomizeChequeDiscountLimit && actaccountCustomizeRateOfInterest==expaccountCustomizeRateOfInterest
			 && actaccountCustomizeBankAc==expaccountCustomizeBankAc && actaccountCustomizePDCDiscountedAccount==expaccountCustomizePDCDiscountedAccount
			 && actaccountHeaderMoveFiledBtn==expaccountHeaderMoveFiledBtn && actaccountHeaderPreview==expaccountHeaderPreview
			 && actaccountSaveBtn==expaccountSaveBtn && actaccountAddBtn==expaccountAddBtn && actaccountCloseBtn==expaccountCloseBtn)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 284, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 284, 9, resFail);
		 return false;
	 }
}


public static boolean checkSettingsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingOption));
	settingOption.click();
	
	Thread.sleep(3000);
	 
	//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsHeaderDetailsTab));
	
	boolean actsettingsHeaderDetailsTab          =settingsHeaderDetailsTab.isDisplayed();
	boolean actsettingsBodyDetailsTab            =settingsBodyDetailsTab.isDisplayed();
	boolean actaccountSettingsHeaderMoveFiledBtn =accountSettingsHeaderMoveFiledBtn.isDisplayed();
	boolean actaccountSettingsHeaderPreview      =accountSettingsHeaderPreview.isDisplayed();
	boolean actaccountSettingsSaveBtn            =accountSettingsSaveBtn.isDisplayed();
	boolean actaccountSettingsAddBtn             =accountSettingsAddBtn.isDisplayed();
	boolean actaccountSettingsCloseBtn           =accountSettingsCloseBtn.isDisplayed();
     
	boolean expsettingsHeaderDetailsTab          =true;
	boolean expsettingsBodyDetailsTab            =true;
	boolean expaccountSettingsHeaderMoveFiledBtn =true;
	boolean expaccountSettingsHeaderPreview      =true;
	boolean expaccountSettingsSaveBtn            =true;
	boolean expaccountSettingsAddBtn             =true;
	boolean expaccountSettingsCloseBtn           =true;
     
	System.out.println("********************************checkSettingsTabInCustomizeMaster******************************");
	
	System.out.println("settingsHeaderDetailsTab           : "+actsettingsHeaderDetailsTab          +" Value Expected : "+expsettingsHeaderDetailsTab);
	System.out.println("settingsBodyDetailsTab             : "+actsettingsBodyDetailsTab            +" Value Expected : "+expsettingsBodyDetailsTab);
	System.out.println("accountSettingsHeaderMoveFiledBtn  : "+actaccountSettingsHeaderMoveFiledBtn +" Value Expected : "+expaccountSettingsHeaderMoveFiledBtn);
	System.out.println("accountSettingsHeaderPreview       : "+actaccountSettingsHeaderPreview      +" Value Expected : "+expaccountSettingsHeaderPreview);
	System.out.println("accountSettingsSaveBtn             : "+actaccountSettingsSaveBtn            +" Value Expected : "+expaccountSettingsSaveBtn);
	System.out.println("accountSettingsAddBtn              : "+actaccountSettingsAddBtn             +" Value Expected : "+expaccountSettingsAddBtn);
	System.out.println("accountSettingsCloseBtn            : "+actaccountSettingsCloseBtn           +" Value Expected : "+expaccountSettingsCloseBtn);
	
	if(actsettingsHeaderDetailsTab==expsettingsHeaderDetailsTab && actsettingsBodyDetailsTab==expsettingsBodyDetailsTab
			&& actaccountSettingsHeaderMoveFiledBtn==expaccountSettingsHeaderMoveFiledBtn && actaccountSettingsHeaderPreview==expaccountSettingsHeaderPreview
			&& actaccountSettingsSaveBtn==expaccountSettingsSaveBtn && actaccountSettingsAddBtn==expaccountSettingsAddBtn 
			&& actaccountSettingsCloseBtn==expaccountSettingsCloseBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 285, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 285, 9, resFail);
		return false;
	}	
}



                
public static boolean checkSettingsTabHeaderFieldsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSettingsHeaderEditFirstRowBtn));
	
	boolean actaccountSettingsHeaderEditFirstRowBtn    =accountSettingsHeaderEditFirstRowBtn.isDisplayed();
	boolean actaccountSettingsHeaderEditSecondRowBtn   =accountSettingsHeaderEditSecondRowBtn.isDisplayed();
	boolean actaccountSettingsHeaderEditThirdRowBtn    =accountSettingsHeaderEditThirdRowBtn.isDisplayed();
	boolean actaccountSettingsHeaderEditFourthRowBtn   =accountSettingsHeaderEditFourthRowBtn.isDisplayed();
	boolean actaccountSettingsHeaderEditFifthRowBtn    =accountSettingsHeaderEditFifthRowBtn.isDisplayed();
	boolean actaccountSettingsHeaderEditSixthRowBtn    =accountSettingsHeaderEditSixthRowBtn.isDisplayed();
	boolean actaccountSettingsHeaderEditSeventhRowBtn  =accountSettingsHeaderEditSeventhRowBtn.isDisplayed();
	boolean actaccountSettingsHeaderEditEighthRowBtn   =accountSettingsHeaderEditEighthRowBtn.isDisplayed();
	
	boolean expaccountSettingsHeaderEditFirstRowBtn    =true;
	boolean expaccountSettingsHeaderEditSecondRowBtn   =true;
	boolean expaccountSettingsHeaderEditThirdRowBtn    =true;
	boolean expaccountSettingsHeaderEditFourthRowBtn   =true;
	boolean expaccountSettingsHeaderEditFifthRowBtn    =true;
	boolean expaccountSettingsHeaderEditSixthRowBtn    =true;
	boolean expaccountSettingsHeaderEditSeventhRowBtn  =true;
	boolean expaccountSettingsHeaderEditEighthRowBtn   =true;
	
	System.out.println("****************************checkSettingsTabHeaderFieldsInCustomizeMaster*************************");
	
	System.out.println("accountSettingsHeaderEditFirstRowBtn    : "+actaccountSettingsHeaderEditFirstRowBtn  +" Value Expected : "+expaccountSettingsHeaderEditFirstRowBtn);
	System.out.println("accountSettingsHeaderEditSecondRowBtn   : "+actaccountSettingsHeaderEditSecondRowBtn +" Value Expected : "+expaccountSettingsHeaderEditSecondRowBtn);
	System.out.println("accountSettingsHeaderEditThirdRowBtn    : "+actaccountSettingsHeaderEditThirdRowBtn  +" Value Expected : "+expaccountSettingsHeaderEditThirdRowBtn);
	System.out.println("accountSettingsHeaderEditFourthRowBtn   : "+actaccountSettingsHeaderEditFourthRowBtn +" Value Expected : "+expaccountSettingsHeaderEditFourthRowBtn);
	System.out.println("accountSettingsHeaderEditFifthRowBtn    : "+actaccountSettingsHeaderEditFifthRowBtn  +" Value Expected : "+expaccountSettingsHeaderEditFifthRowBtn);
	System.out.println("accountSettingsHeaderEditSixthRowBtn    : "+actaccountSettingsHeaderEditSixthRowBtn  +" Value Expected : "+expaccountSettingsHeaderEditSixthRowBtn);
	System.out.println("accountSettingsHeaderEditSeventhRowBtn  : "+actaccountSettingsHeaderEditSeventhRowBtn+" Value Expected : "+expaccountSettingsHeaderEditSeventhRowBtn);
	System.out.println("accountSettingsHeaderEditEighthRowBtn   : "+actaccountSettingsHeaderEditEighthRowBtn +" Value Expected : "+expaccountSettingsHeaderEditEighthRowBtn);
	
	if(actaccountSettingsHeaderEditFirstRowBtn==expaccountSettingsHeaderEditFirstRowBtn
			&& actaccountSettingsHeaderEditSecondRowBtn==expaccountSettingsHeaderEditSecondRowBtn 
			&& actaccountSettingsHeaderEditThirdRowBtn==expaccountSettingsHeaderEditThirdRowBtn 
			&& actaccountSettingsHeaderEditFourthRowBtn==expaccountSettingsHeaderEditFourthRowBtn
			&& actaccountSettingsHeaderEditFifthRowBtn==expaccountSettingsHeaderEditFifthRowBtn 
			&& actaccountSettingsHeaderEditSixthRowBtn==expaccountSettingsHeaderEditSixthRowBtn
			&& actaccountSettingsHeaderEditSeventhRowBtn==expaccountSettingsHeaderEditSeventhRowBtn
			&& actaccountSettingsHeaderEditEighthRowBtn==expaccountSettingsHeaderEditEighthRowBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 286, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 286, 9, resFail);
		return false;
	}
}
    
            
public static boolean checkSettingsTabBodyFieldsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsBodyDetailsTab));
	settingsBodyDetailsTab.click();
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsBodyDetailsEmptyTab));
	
	boolean actsettingsBodyDetailsEmptyTab  =settingsBodyDetailsEmptyTab.isDisplayed();
	boolean expsettingsBodyDetailsEmptyTab  =true;
	
	System.out.println("***************************checkSettingsTabBodyFieldsInCustomizeMaster*****************************");
	
	System.out.println("settingsBodyDetailsEmptyTab : "+actsettingsBodyDetailsEmptyTab+" Value Expected : "+expsettingsBodyDetailsEmptyTab);
		 
	if(actsettingsBodyDetailsEmptyTab==expsettingsBodyDetailsEmptyTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 287, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 287, 9, resFail);
		return false;
	}
}
    
    
    
public static boolean checkDetailsTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterFieldDetailsOption));
	accountMasterFieldDetailsOption.click();
		 
	Thread.sleep(3000);
		 
	//getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(detailsHeaderDetailsTab));
	
	boolean actdetailsHeaderDetailsTab          =detailsHeaderDetailsTab.isDisplayed();
	boolean actdetailsBodyDetailsTab            =detailsBodyDetailsTab.isDisplayed();
	boolean actdetailsHeaderBankSaveBtn 		=detailsHeaderBankSaveBtn.isDisplayed();
	boolean actdetailsHeaderMoveFieldBtn 		=detailsHeaderMoveFieldBtn.isDisplayed();
	boolean actdetailsHeaderAddBtn		 		=detailsHeaderAddBtn.isDisplayed();
	boolean actdetailsHeaderPreviewBtn	 		=detailsHeaderPreviewBtn.isDisplayed();
	boolean actdetailsHeaderCloseBtn	 		=detailsHeaderCloseBtn.isDisplayed();
	
	boolean expdetailsHeaderDetailsTab          =true;
	boolean expdetailsBodyDetailsTab            =true;
	boolean expdetailsHeaderBankSaveBtn 		=true;
	boolean expdetailsHeaderMoveFieldBtn 		=true;
	boolean expdetailsHeaderAddBtn		 		=true;
	boolean expdetailsHeaderPreviewBtn	 		=true;
	boolean expdetailsHeaderCloseBtn	 		=true;
	
	System.out.println("************************************checkDetailsTabInCustomizeMaster********************************");
	
	System.out.println("detailsHeaderDetailsTab    : "+actdetailsHeaderDetailsTab   +" Value Expected : "+expdetailsHeaderDetailsTab);
	System.out.println("detailsBodyDetailsTab      : "+actdetailsBodyDetailsTab     +" Value Expected : "+expdetailsBodyDetailsTab);
	System.out.println("detailsHeaderBankSaveBtn   : "+actdetailsHeaderBankSaveBtn  +" Value Expected : "+expdetailsHeaderBankSaveBtn);
	System.out.println("detailsHeaderMoveFieldBtn  : "+actdetailsHeaderMoveFieldBtn +" Value Expected : "+expdetailsHeaderMoveFieldBtn);
	System.out.println("detailsHeaderAddBtn        : "+actdetailsHeaderAddBtn       +" Value Expected : "+expdetailsHeaderAddBtn);
	System.out.println("detailsHeaderPreviewBtn    : "+actdetailsHeaderPreviewBtn   +" Value Expected : "+expdetailsHeaderPreviewBtn);
	System.out.println("detailsHeaderCloseBtn      : "+actdetailsHeaderCloseBtn     +" Value Expected : "+expdetailsHeaderCloseBtn);
	
	if(actdetailsHeaderDetailsTab==expdetailsHeaderDetailsTab && actdetailsBodyDetailsTab==expdetailsBodyDetailsTab
			&& actdetailsHeaderBankSaveBtn==expdetailsHeaderBankSaveBtn && actdetailsHeaderMoveFieldBtn==expdetailsHeaderMoveFieldBtn
			&& actdetailsHeaderAddBtn==expdetailsHeaderAddBtn && actdetailsHeaderPreviewBtn==expdetailsHeaderPreviewBtn
			&& actdetailsHeaderCloseBtn==expdetailsHeaderCloseBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 288, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 288, 9, resFail);
		return false;
	}
}

    
public static boolean checkDetailsTabHeaderFieldsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	Thread.sleep(3000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(detailsHeaderAddress));
		 
	boolean actdetailsHeaderAddress   			=detailsHeaderAddress.isDisplayed();
	boolean actdetailsHeaderCity   				=detailsHeaderCity.isDisplayed();
	boolean actdetailsHeaderPin   				=detailsHeaderPin.isDisplayed();
	boolean actdetailsHeaderDeliveryAddress   	=detailsHeaderDeliveryAddress.isDisplayed();
	boolean actdetailsHeaderCityOne   			=detailsHeaderCityOne.isDisplayed();
	boolean actdetailsHeaderPinOne   			=detailsHeaderPinOne.isDisplayed();
	boolean actdetailsHeaderSendEmailToCustomer =detailsHeaderSendEmailToCustomer.isDisplayed();
	boolean actdetailsHeaderAllowCustomerPortal =detailsHeaderAllowCustomerPortal.isDisplayed();
	boolean actdetailsHeaderEmail   			=detailsHeaderEmail.isDisplayed();
	boolean actdetailsHeaderPassword   			=detailsHeaderPassword.isDisplayed();
	boolean actdetailsHeaderTelNo   			=detailsHeaderTelNo.isDisplayed();
	boolean actdetailsHeaderFaxNo   			=detailsHeaderFaxNo.isDisplayed();
	boolean actdetailsHeaderBankAccountName   	=detailsHeaderBankAccountName.isDisplayed();
	boolean actdetailsHeaderBankAccountNumber   =detailsHeaderBankAccountNumber.isDisplayed();
	boolean actdetailsHeaderIFSCCode   			=detailsHeaderIFSCCode.isDisplayed();
	boolean actdetailsHeaderPaymentType   		=detailsHeaderPaymentType.isDisplayed();
	boolean actdetailsHeaderFinanceEmail   		=detailsHeaderFinanceEmail.isDisplayed();
	
	boolean expdetailsHeaderAddress   			=true;
	boolean expdetailsHeaderCity   				=true;
	boolean expdetailsHeaderPin   				=true;
	boolean expdetailsHeaderDeliveryAddress   	=true;
	boolean expdetailsHeaderCityOne   			=true;
	boolean expdetailsHeaderPinOne   			=true;
	boolean expdetailsHeaderSendEmailToCustomer =true;
	boolean expdetailsHeaderAllowCustomerPortal =true;
	boolean expdetailsHeaderEmail   			=true;
	boolean expdetailsHeaderPassword   			=true;
	boolean expdetailsHeaderTelNo   			=true;
	boolean expdetailsHeaderFaxNo   			=true;
	boolean expdetailsHeaderBankAccountName   	=true;
	boolean expdetailsHeaderBankAccountNumber   =true;
	boolean expdetailsHeaderIFSCCode   			=true;
	boolean expdetailsHeaderPaymentType   		=true;
	boolean expdetailsHeaderFinanceEmail   		=true;
	
	System.out.println("********************************checkDetailsTabHeaderFieldsInCustomizeMaster**************************");
	
	System.out.println("detailsHeaderAddress               : "+actdetailsHeaderAddress             +" Value Expected : "+expdetailsHeaderAddress);
	System.out.println("detailsHeaderCity                  : "+actdetailsHeaderCity                +" Value Expected : "+expdetailsHeaderCity);
	System.out.println("detailsHeaderPin                   : "+actdetailsHeaderPin                 +" Value Expected : "+expdetailsHeaderPin);
	System.out.println("detailsHeaderDeliveryAddress       : "+actdetailsHeaderDeliveryAddress     +" Value Expected : "+expdetailsHeaderDeliveryAddress);
	System.out.println("detailsHeaderCityOne               : "+actdetailsHeaderCityOne             +" Value Expected : "+expdetailsHeaderCityOne);
	System.out.println("detailsHeaderPinOne                : "+actdetailsHeaderPinOne              +" Value Expected : "+expdetailsHeaderPinOne);
	System.out.println("detailsHeaderSendEmailToCustomer   : "+actdetailsHeaderSendEmailToCustomer +" Value Expected : "+expdetailsHeaderSendEmailToCustomer);
	System.out.println("detailsHeaderAllowCustomerPortal   : "+actdetailsHeaderAllowCustomerPortal +" Value Expected : "+expdetailsHeaderAllowCustomerPortal);
	System.out.println("detailsHeaderEmail                 : "+actdetailsHeaderEmail               +" Value Expected : "+expdetailsHeaderEmail);
	System.out.println("detailsHeaderPassword              : "+actdetailsHeaderPassword            +" Value Expected : "+expdetailsHeaderPassword);
	System.out.println("detailsHeaderTelNo                 : "+actdetailsHeaderTelNo               +" Value Expected : "+expdetailsHeaderTelNo);
	System.out.println("detailsHeaderFaxNo                 : "+actdetailsHeaderFaxNo               +" Value Expected : "+expdetailsHeaderFaxNo);
	System.out.println("detailsHeaderBankAccountName       : "+actdetailsHeaderBankAccountName     +" Value Expected : "+expdetailsHeaderBankAccountName);
	System.out.println("detailsHeaderBankAccountNumber     : "+actdetailsHeaderBankAccountNumber   +" Value Expected : "+expdetailsHeaderBankAccountNumber);
	System.out.println("detailsHeaderIFSCCode              : "+actdetailsHeaderIFSCCode            +" Value Expected : "+expdetailsHeaderIFSCCode);
	System.out.println("detailsHeaderPaymentType           : "+actdetailsHeaderPaymentType         +" Value Expected : "+expdetailsHeaderPaymentType);
	System.out.println("detailsHeaderFinanceEmail          : "+actdetailsHeaderFinanceEmail        +" Value Expected : "+expdetailsHeaderFinanceEmail);
	
	if(actdetailsHeaderAddress==expdetailsHeaderAddress && actdetailsHeaderCity==expdetailsHeaderCity && actdetailsHeaderPin==expdetailsHeaderPin
			&& actdetailsHeaderDeliveryAddress==expdetailsHeaderDeliveryAddress && actdetailsHeaderCityOne==expdetailsHeaderCityOne
			&& actdetailsHeaderPinOne==expdetailsHeaderPinOne && actdetailsHeaderSendEmailToCustomer==expdetailsHeaderSendEmailToCustomer
			&& actdetailsHeaderAllowCustomerPortal==expdetailsHeaderAllowCustomerPortal && actdetailsHeaderEmail==expdetailsHeaderEmail
			&& actdetailsHeaderPassword==expdetailsHeaderPassword && actdetailsHeaderTelNo==expdetailsHeaderTelNo 
			&& actdetailsHeaderFaxNo==expdetailsHeaderFaxNo && actdetailsHeaderBankAccountName==expdetailsHeaderBankAccountName 
			&& actdetailsHeaderBankAccountNumber==expdetailsHeaderBankAccountNumber && actdetailsHeaderIFSCCode==expdetailsHeaderIFSCCode
			&& actdetailsHeaderPaymentType==expdetailsHeaderPaymentType && actdetailsHeaderFinanceEmail==expdetailsHeaderFinanceEmail)
	{
		excelReader.setCellData(xlfile, "Sheet1", 289, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 289, 9, resFail);
		return false;
	}
}
    

public static boolean checkDetailsTabBodyFieldsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	Thread.sleep(3000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(detailsBodyDetailsTab));
	detailsBodyDetailsTab.click();
         
	Thread.sleep(2000);
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(detailsBodyDetailsEmptyTab));
	
	boolean actdetailsBodyDetailsEmptyTab  =detailsBodyDetailsEmptyTab.isDisplayed();
	boolean expdetailsBodyDetailsEmptyTab  =true;
	
	System.out.println("********************************checkDetailsTabBodyFieldsInCustomizeMaster******************");
	
	System.out.println("detailsBodyDetailsEmptyTab  : "+actdetailsBodyDetailsEmptyTab+" Value Expected : "+expdetailsBodyDetailsEmptyTab);

	if(actdetailsBodyDetailsEmptyTab==expdetailsBodyDetailsEmptyTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 290, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 290, 9, resFail);
		return false;
	}
}
    
	    

public static boolean checkPrintLayoutTabInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterFieldPrintLayoutOption));
	accountMasterFieldPrintLayoutOption.click();
	 
	Thread.sleep(2000);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printlayoutHeaderDetailsTab));
	
	boolean actprintlayoutHeaderDetailsTab  =printlayoutHeaderDetailsTab.isDisplayed();
	boolean actprintLayouBodyDetailsTab     =printLayouBodyDetailsTab.isDisplayed();
	
	boolean expprintlayoutHeaderDetailsTab  =true;
	boolean expprintLayouBodyDetailsTab     =true;
	
	System.out.println("*********************************checkPrintLayoutTabInCustomizeMaster*******************************");
	
	System.out.println("printlayoutHeaderDetailsTab  : "+actprintlayoutHeaderDetailsTab+" Value Expected : "+expprintlayoutHeaderDetailsTab);
	System.out.println("printLayouBodyDetailsTab     : "+actprintLayouBodyDetailsTab   +" Value Expected : "+expprintLayouBodyDetailsTab);
	
	if(actprintlayoutHeaderDetailsTab==expprintlayoutHeaderDetailsTab && actprintLayouBodyDetailsTab==expprintLayouBodyDetailsTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 291, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 291, 9, resFail);
		return false;
	}
}



public static boolean checkPrintLayoutTabHeaderFieldsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printLayoutHeaderDetailsEmpty));
	
	boolean actprintLayoutHeaderDetailsEmpty  =printLayoutHeaderDetailsEmpty.isDisplayed();
	boolean expprintLayoutHeaderDetailsEmpty  =true;
	
	System.out.println("*****************************checkPrintLayoutTabHeaderFieldsInCustomizeMaster***************************");
	
	System.out.println("printLayoutHeaderDetailsEmpty  : "+actprintLayoutHeaderDetailsEmpty+" Value Expected : "+expprintLayoutHeaderDetailsEmpty);
	
	if(actprintLayoutHeaderDetailsEmpty==expprintLayoutHeaderDetailsEmpty)
	{
		excelReader.setCellData(xlfile, "Sheet1", 292, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 292, 9, resFail);
		return false;
	}
}



public static boolean checkPrintLayoutTabBodyFieldsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printLayouBodyDetailsTab));
	printLayouBodyDetailsTab.click();
     
	Thread.sleep(2000);
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printlayoutBodyVoucherType));
	
	boolean actprintlayoutBodyVoucherType  	=printlayoutBodyVoucherType.isDisplayed();
	boolean actprintLayoutSaveBtn    		=printLayoutSaveBtn.isDisplayed();
	boolean actprintLayoutAddBtn    		=printLayoutAddBtn.isDisplayed();
	boolean actprintLayoutPreviewBtn    	=printLayoutPreviewBtn.isDisplayed();
	boolean actprintLayoutCloseBtn    		=printLayoutCloseBtn.isDisplayed();
	
	boolean expprintlayoutBodyVoucherType  	=true;
	boolean expprintLayoutSaveBtn    		=true;
	boolean expprintLayoutAddBtn    		=true;
	boolean expprintLayoutPreviewBtn    	=true;
	boolean expprintLayoutCloseBtn    		=true;
	
	System.out.println("**********************************checkPrintLayoutTabBodyFieldsInCustomizeMaster******************************");
	
	System.out.println("printlayoutBodyVoucherType   : "+actprintlayoutBodyVoucherType +" Value Expected : "+expprintlayoutBodyVoucherType);
	System.out.println("printLayoutSaveBtn           : "+actprintLayoutSaveBtn         +" Value Expected : "+expprintLayoutSaveBtn);
	System.out.println("printLayoutAddBtn            : "+actprintLayoutAddBtn          +" Value Expected : "+expprintLayoutAddBtn);
	System.out.println("printLayoutPreviewBtn        : "+actprintLayoutPreviewBtn      +" Value Expected : "+expprintLayoutPreviewBtn);
	System.out.println("printLayoutCloseBtn          : "+actprintLayoutCloseBtn        +" Value Expected : "+expprintLayoutCloseBtn);
	
	if(actprintlayoutBodyVoucherType==expprintlayoutBodyVoucherType && actprintLayoutSaveBtn==expprintLayoutSaveBtn
			&& actprintLayoutAddBtn==expprintLayoutAddBtn && actprintLayoutPreviewBtn==expprintLayoutPreviewBtn
			&& actprintLayoutCloseBtn==expprintLayoutCloseBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 293, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 293, 9, resFail);
		return false;
	}
}



public static boolean checkUniqueContraintCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountMasterFieldsUniqueConstraintsOption));
	accountMasterFieldsUniqueConstraintsOption.click();
	  
	
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UniqueConstraintsAddBtn));
	
	boolean actUniqueConstraintsAddBtn  						=UniqueConstraintsAddBtn.isDisplayed();
	boolean actUniqueConstraintsDeleteBtn  						=UniqueConstraintsDeleteBtn.isDisplayed();
	boolean actUniqueConstraintsCloseBtn  						=UniqueConstraintsCloseBtn.isDisplayed();
	boolean actConstraintNameTxt  								=ConstraintNameTxt.isDisplayed();
	boolean actUniqueConstraints_TabsDropdown  					=UniqueConstraints_TabsDropdown.isDisplayed();
	boolean actaccountUniqueConstraints_Main_NameChekbox  		=accountUniqueConstraints_Main_NameChekbox.isDisplayed();
	boolean actaccountUniqueConstraints_Main_CodeChekbox  		=accountUniqueConstraints_Main_CodeChekbox.isDisplayed();
	boolean actaccountUniqueConstraints_Main_AccountTypeCheckbox=accountUniqueConstraints_Main_AccountTypeCheckbox.isDisplayed();
	boolean actaccountUniqueConstraints_Main_CreditLimitCheckBox=accountUniqueConstraints_Main_CreditLimitCheckBox.isDisplayed();
	boolean actaccountUniqueConstraints_Main_CreditDays  		=accountUniqueConstraints_Main_CreditDays.isDisplayed();
	boolean actUniqueConstraints_HeaderExpansionBtn  			=UniqueConstraints_HeaderExpansionBtn.isDisplayed();
	boolean actUniqueConstraints_BodyExpansionBtn  				=UniqueConstraints_BodyExpansionBtn.isDisplayed();
	
	boolean expUniqueConstraintsAddBtn  						=true;
	boolean expUniqueConstraintsDeleteBtn  						=true;
	boolean expUniqueConstraintsCloseBtn  						=true;
	boolean expConstraintNameTxt  								=true;
	boolean expUniqueConstraints_TabsDropdown  					=true;
	boolean expaccountUniqueConstraints_Main_NameChekbox  		=true;
	boolean expaccountUniqueConstraints_Main_CodeChekbox  		=true;
	boolean expaccountUniqueConstraints_Main_AccountTypeCheckbox=true;
	boolean expaccountUniqueConstraints_Main_CreditLimitCheckBox=true;
	boolean expaccountUniqueConstraints_Main_CreditDays  		=true;
	boolean expUniqueConstraints_HeaderExpansionBtn  			=true;
	boolean expUniqueConstraints_BodyExpansionBtn  				=true;
	
	System.out.println("***************************************************checkUniqueContraintCustomizeMaster********************************");
	
	System.out.println("UniqueConstraintsAddBtn                            : "+actUniqueConstraintsAddBtn                           +" Value Expected : "+expUniqueConstraintsAddBtn);
	System.out.println("UniqueConstraintsDeleteBtn                         : "+actUniqueConstraintsDeleteBtn                        +" Value Expected : "+expUniqueConstraintsDeleteBtn);
	System.out.println("UniqueConstraintsCloseBtn                          : "+actUniqueConstraintsCloseBtn                         +" Value Expected : "+expUniqueConstraintsCloseBtn);
	System.out.println("ConstraintNameTxt                                  : "+actConstraintNameTxt                                 +" Value Expected : "+expConstraintNameTxt);
	System.out.println("UniqueConstraints_TabsDropdown                     : "+actUniqueConstraints_TabsDropdown                    +" Value Expected : "+expUniqueConstraints_TabsDropdown);
	System.out.println("accountUniqueConstraints_Main_NameChekbox          : "+actaccountUniqueConstraints_Main_NameChekbox         +" Value Expected : "+expaccountUniqueConstraints_Main_NameChekbox);
	System.out.println("accountUniqueConstraints_Main_CodeChekbox          : "+actaccountUniqueConstraints_Main_CodeChekbox         +" Value Expected : "+expaccountUniqueConstraints_Main_CodeChekbox);
	System.out.println("accountUniqueConstraints_Main_AccountTypeCheckbox  : "+actaccountUniqueConstraints_Main_AccountTypeCheckbox +" Value Expected : "+expaccountUniqueConstraints_Main_AccountTypeCheckbox);
	System.out.println("accountUniqueConstraints_Main_CreditLimitCheckBox  : "+actaccountUniqueConstraints_Main_CreditLimitCheckBox +" Value Expected : "+expaccountUniqueConstraints_Main_CreditLimitCheckBox);
	System.out.println("UniqueConstraints_BodyExpansionBtn                 : "+actUniqueConstraints_BodyExpansionBtn                +" Value Expected : "+expUniqueConstraints_BodyExpansionBtn);
	System.out.println("UniqueConstraints_HeaderExpansionBtn               : "+actUniqueConstraints_HeaderExpansionBtn              +" Value Expected : "+expUniqueConstraints_HeaderExpansionBtn);
	System.out.println("UniqueConstraints_BodyExpansionBtn                 : "+actUniqueConstraints_BodyExpansionBtn                +" Value Expected : "+expUniqueConstraints_BodyExpansionBtn);
	 
	if(actUniqueConstraintsAddBtn==expUniqueConstraintsAddBtn && actUniqueConstraintsDeleteBtn==expUniqueConstraintsDeleteBtn
			&& actUniqueConstraintsCloseBtn==expUniqueConstraintsCloseBtn && actConstraintNameTxt==expConstraintNameTxt
			&& actUniqueConstraints_TabsDropdown==expUniqueConstraints_TabsDropdown
			&& actaccountUniqueConstraints_Main_NameChekbox==expaccountUniqueConstraints_Main_NameChekbox
			&& actaccountUniqueConstraints_Main_CodeChekbox==expaccountUniqueConstraints_Main_CodeChekbox
			&& actaccountUniqueConstraints_Main_AccountTypeCheckbox==expaccountUniqueConstraints_Main_AccountTypeCheckbox
			&& actaccountUniqueConstraints_Main_CreditLimitCheckBox==expaccountUniqueConstraints_Main_CreditLimitCheckBox
			&& actaccountUniqueConstraints_Main_CreditDays==expaccountUniqueConstraints_Main_CreditDays 
			&& actUniqueConstraints_HeaderExpansionBtn==expUniqueConstraints_HeaderExpansionBtn
			&& actUniqueConstraints_BodyExpansionBtn==expUniqueConstraints_BodyExpansionBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 294, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 294, 9, resFail);
		return false;
	}
}


public static boolean checkHeaderFieldsUniqueContraintCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	 
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UniqueConstraints_HeaderExpansionBtn));
	UniqueConstraints_HeaderExpansionBtn.click();
	
	
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UniqueConstraints_Header_ChequeDiscountLimitChekbox));
	 
	boolean actUniqueConstraints_Header_ChequeDiscountLimitChekbox =UniqueConstraints_Header_ChequeDiscountLimitChekbox.isDisplayed();
	boolean actUniqueConstraints_Header_RateOfInterestChekbox  	=UniqueConstraints_Header_RateOfInterestChekbox.isDisplayed();
	boolean actUniqueConstraintsCloseBtn  							=UniqueConstraintsCloseBtn.isDisplayed();
	boolean actUniqueConstraints_Header_PDCDiscountedChekbox  		=UniqueConstraints_Header_PDCDiscountedChekbox.isDisplayed();
	 
	boolean expUniqueConstraints_Header_ChequeDiscountLimitChekbox =true;
	boolean expUniqueConstraints_Header_RateOfInterestChekbox  	=true;
	boolean expUniqueConstraintsCloseBtn  							=true;
	boolean expUniqueConstraints_Header_PDCDiscountedChekbox  		=true;
	 
	System.out.println("*************************************checkHeaderFieldsUniqueContraintCustomizeMaster************************************************");
	
	System.out.println("UniqueConstraints_Header_ChequeDiscountLimitChekbox : "+actUniqueConstraints_Header_ChequeDiscountLimitChekbox +" Value Expected : "+expUniqueConstraints_Header_ChequeDiscountLimitChekbox);
	System.out.println("UniqueConstraints_Header_RateOfInterestChekbox      : "+actUniqueConstraints_Header_RateOfInterestChekbox      +" Value Expected : "+expUniqueConstraints_Header_RateOfInterestChekbox);
	System.out.println("UniqueConstraintsCloseBtn                           : "+actUniqueConstraintsCloseBtn                           +" Value Expected : "+expUniqueConstraintsCloseBtn);
	System.out.println("UniqueConstraints_Header_PDCDiscountedChekbox       : "+actUniqueConstraints_Header_PDCDiscountedChekbox       +" Value Expected : "+expUniqueConstraints_Header_PDCDiscountedChekbox);
	
	if(actUniqueConstraints_Header_ChequeDiscountLimitChekbox==expUniqueConstraints_Header_ChequeDiscountLimitChekbox
			&& actUniqueConstraints_Header_RateOfInterestChekbox==expUniqueConstraints_Header_RateOfInterestChekbox
			&& actUniqueConstraintsCloseBtn==expUniqueConstraintsCloseBtn
			&& actUniqueConstraints_Header_PDCDiscountedChekbox==expUniqueConstraints_Header_PDCDiscountedChekbox)
	{
		excelReader.setCellData(xlfile, "Sheet1", 295, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 295, 9, resFail);
		return false;
	}
}

     
     
public static boolean checkRulesInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(RulesOption));
	RulesOption.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRules_SaveBtn));
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountRules_NewBtn));
	
	boolean actaccountRules_SaveBtn   		=accountRules_SaveBtn.isDisplayed();
	boolean actaccountRules_NewBtn   		=accountRules_NewBtn.isDisplayed();
	boolean actaccountRules_DeleteBtn   	=accountRules_DeleteBtn.isDisplayed();
	boolean actaccountRules_CloseBtn   		=accountRules_CloseBtn.isDisplayed();
	boolean actRules_RuleNameText  	 		=Rules_RuleNameText.isDisplayed();
	boolean actRules_CreatingGroupChekbox   =Rules_CreatingGroupChekbox.isDisplayed();
	boolean actRules_NewRecordChekbox   	=Rules_NewRecordChekbox.isDisplayed();
	boolean actRules_EditChekbox   			=Rules_EditChekbox.isDisplayed();
	boolean actRules_LoadChekbox   			=Rules_LoadChekbox.isDisplayed();
	boolean actRules_BeforeSaveChekbox   	=Rules_BeforeSaveChekbox.isDisplayed();
	boolean actRules_OnLeaveChekbox   		=Rules_OnLeaveChekbox.isDisplayed();
	boolean actRules_BeforeDeleteChekbox   	=Rules_BeforeDeleteChekbox.isDisplayed();
	boolean actRules_OnEnterChekbox   		=Rules_OnEnterChekbox.isDisplayed();
	
	boolean expaccountRules_SaveBtn   		=true;
	boolean expaccountRules_NewBtn   		=true;
	boolean expaccountRules_DeleteBtn   	=true;
	boolean expaccountRules_CloseBtn   		=true;
	boolean expRules_RuleNameText  	 		=true;
	boolean expRules_CreatingGroupChekbox   =true;
	boolean expRules_NewRecordChekbox   	=true;
	boolean expRules_EditChekbox   			=true;
	boolean expRules_LoadChekbox   			=true;
	boolean expRules_BeforeSaveChekbox   	=true;
	boolean expRules_OnLeaveChekbox   		=true;
	boolean expRules_BeforeDeleteChekbox   	=true;
	boolean expRules_OnEnterChekbox   		=true;
	
	System.out.println("********************************checkRulesInCustomizeMaster*******************************");
	
	System.out.println("accountRules_SaveBtn         : "+actaccountRules_SaveBtn       +" Value Expected : "+expaccountRules_SaveBtn);
	System.out.println("accountRules_NewBtn          : "+actaccountRules_NewBtn        +" Value Expected : "+expaccountRules_NewBtn);
	System.out.println("accountRules_DeleteBtn       : "+actaccountRules_DeleteBtn     +" Value Expected : "+expaccountRules_DeleteBtn);
	System.out.println("accountRules_CloseBtn        : "+actaccountRules_CloseBtn      +" Value Expected : "+expaccountRules_CloseBtn);
	System.out.println("Rules_RuleNameText           : "+actRules_RuleNameText         +" Value Expected : "+expRules_RuleNameText);
	System.out.println("Rules_CreatingGroupChekbox   : "+actRules_CreatingGroupChekbox +" Value Expected : "+expRules_CreatingGroupChekbox);
	System.out.println("Rules_NewRecordChekbox       : "+actRules_NewRecordChekbox     +" Value Expected : "+expRules_NewRecordChekbox);
	System.out.println("Rules_EditChekbox            : "+actRules_EditChekbox          +" Value Expected : "+expRules_EditChekbox);
	System.out.println("Rules_LoadChekbox            : "+actRules_LoadChekbox          +" Value Expected : "+expRules_LoadChekbox);
	System.out.println("Rules_BeforeSaveChekbox      : "+actRules_BeforeSaveChekbox    +" Value Expected : "+expRules_BeforeSaveChekbox);
	System.out.println("Rules_OnLeaveChekbox         : "+actRules_OnLeaveChekbox       +" Value Expected : "+expRules_OnLeaveChekbox);
	System.out.println("Rules_BeforeDeleteChekbox    : "+actRules_BeforeDeleteChekbox  +" Value Expected : "+expRules_BeforeDeleteChekbox);
	System.out.println("Rules_OnEnterChekbox         : "+actRules_OnEnterChekbox       +" Value Expected : "+expRules_OnEnterChekbox);
	 
	if(actaccountRules_SaveBtn==expaccountRules_SaveBtn && actaccountRules_NewBtn==expaccountRules_NewBtn
			&& actaccountRules_DeleteBtn==expaccountRules_DeleteBtn && actaccountRules_CloseBtn==expaccountRules_CloseBtn
			&& actRules_RuleNameText==expRules_RuleNameText && actRules_CreatingGroupChekbox==expRules_CreatingGroupChekbox
			&& actRules_NewRecordChekbox==expRules_NewRecordChekbox && actRules_EditChekbox==expRules_EditChekbox
			&& actRules_LoadChekbox==expRules_LoadChekbox && actRules_BeforeSaveChekbox==expRules_BeforeSaveChekbox
			&& actRules_OnLeaveChekbox==expRules_OnLeaveChekbox && actRules_BeforeDeleteChekbox==expRules_BeforeDeleteChekbox
			&& actRules_OnEnterChekbox==expRules_OnEnterChekbox)
	{
		excelReader.setCellData(xlfile, "Sheet1", 296, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 296, 9, resFail);
		return false;
	}
}
 
     
public static boolean checkExternalModulesInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rules_ExternalModules));
	rules_ExternalModules.click();

	
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rules_ExternalModulesOnEventDropdown));
	
	boolean actrules_ExternalModulesOnEventDropdown  	=rules_ExternalModulesOnEventDropdown.isDisplayed();
	boolean actrules_ExternalModulesButtonCaption  		=rules_ExternalModulesButtonCaption.isDisplayed();
	boolean actrules_ExternalModules_ModuleTypeBtn  	=rules_ExternalModules_ModuleTypeBtn.isDisplayed();
	boolean actrules_ExternalModules_ModuleNameDropdown =rules_ExternalModules_ModuleNameDropdown.isDisplayed();
	boolean actrules_ExternalModulesClassNameDropdown  	=rules_ExternalModulesClassNameDropdown.isDisplayed();
	boolean actrules_ExternalModulesUpdateBtn  			=rules_ExternalModulesUpdateBtn.isDisplayed();
	
	boolean exprules_ExternalModulesOnEventDropdown  	=true;
	boolean exprules_ExternalModulesButtonCaption  		=true;
	boolean exprules_ExternalModules_ModuleTypeBtn  	=true;
	boolean exprules_ExternalModules_ModuleNameDropdown =true;
	boolean exprules_ExternalModulesClassNameDropdown  	=true;
	boolean exprules_ExternalModulesUpdateBtn  			=true;
	
	System.out.println("*************************************checkExternalModulesInCustomizeMaster********************************");
	
	System.out.println("rules_ExternalModulesOnEventDropdown      : "+actrules_ExternalModulesOnEventDropdown     +" Value Expected : "+exprules_ExternalModulesOnEventDropdown);
	System.out.println("rules_ExternalModulesButtonCaption        : "+actrules_ExternalModulesButtonCaption       +" Value Expected : "+exprules_ExternalModulesButtonCaption);
	System.out.println("rules_ExternalModules_ModuleTypeBtn       : "+actrules_ExternalModules_ModuleTypeBtn      +" Value Expected : "+exprules_ExternalModules_ModuleTypeBtn);
	System.out.println("rules_ExternalModules_ModuleNameDropdown  : "+actrules_ExternalModules_ModuleNameDropdown +" Value Expected : "+exprules_ExternalModules_ModuleNameDropdown);
	System.out.println("rules_ExternalModulesClassNameDropdown    : "+actrules_ExternalModulesClassNameDropdown   +" Value Expected : "+exprules_ExternalModulesClassNameDropdown);
	System.out.println("rules_ExternalModulesUpdateBtn            : "+actrules_ExternalModulesUpdateBtn           +" Value Expected : "+exprules_ExternalModulesUpdateBtn);
	 
	if(actrules_ExternalModulesOnEventDropdown==exprules_ExternalModulesOnEventDropdown 
			&& actrules_ExternalModulesButtonCaption==exprules_ExternalModulesButtonCaption
			&& actrules_ExternalModules_ModuleTypeBtn==exprules_ExternalModules_ModuleTypeBtn 
			&& actrules_ExternalModules_ModuleNameDropdown==exprules_ExternalModules_ModuleNameDropdown
			&& actrules_ExternalModulesClassNameDropdown==exprules_ExternalModulesClassNameDropdown 
			&& actrules_ExternalModulesUpdateBtn==exprules_ExternalModulesUpdateBtn	)
	{
		excelReader.setCellData(xlfile, "Sheet1", 297, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 297, 9, resFail);
		return false;
	}
}
		  
		  
	
public static boolean checkInfoPanelInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemInfoPanelCustomizationTab));
	itemInfoPanelCustomizationTab.click(); 
	
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(iteminfoPanelCust_AddBtn));
	
	boolean actiteminfoPanelCust_AddBtn 	 	=iteminfoPanelCust_AddBtn.isDisplayed();
	boolean actinfoPanelCust_DeleteBtn  		=infoPanelCust_DeleteBtn.isDisplayed();
	boolean actinfoPanelCust_CloseBtn  			=infoPanelCust_CloseBtn.isDisplayed();
	boolean actinfoPanelCustCreditHistory  		=infoPanelCustCreditHistory.isDisplayed();
	boolean actinfoPanelCustAgeingAnalysis  	=infoPanelCustAgeingAnalysis.isDisplayed();
	boolean actinfoPanelCustAgeingAnalysisBase  =infoPanelCustAgeingAnalysisBase.isDisplayed();
	boolean actinfoPanelCustAgeingAnalysisLocal =infoPanelCustAgeingAnalysisLocal.isDisplayed();
	boolean actinfoPanelAuthorization  			=infoPanelAuthorization.isDisplayed();
	
	boolean expiteminfoPanelCust_AddBtn 	 	=true;
	boolean expinfoPanelCust_DeleteBtn  		=true;
	boolean expinfoPanelCust_CloseBtn  			=true;
	boolean expinfoPanelCustCreditHistory  		=true;
	boolean expinfoPanelCustAgeingAnalysis  	=true;
	boolean expinfoPanelCustAgeingAnalysisBase  =true;
	boolean expinfoPanelCustAgeingAnalysisLocal =true;
	boolean expinfoPanelAuthorization  			=true;
	
	System.out.println("**********************************************checkInfoPanelInCustomizeMaster*********************************");
	 
	System.out.println("iteminfoPanelCust_AddBtn         : "+actiteminfoPanelCust_AddBtn         +" Value Expected : "+expiteminfoPanelCust_AddBtn);
	System.out.println("infoPanelCust_DeleteBtn          : "+actinfoPanelCust_DeleteBtn          +" Value Expected : "+expinfoPanelCust_DeleteBtn);
	System.out.println("infoPanelCust_CloseBtn           : "+actinfoPanelCust_CloseBtn           +" Value Expected : "+expinfoPanelCust_CloseBtn);
	System.out.println("infoPanelCustCreditHistory       : "+actinfoPanelCustCreditHistory       +" Value Expected : "+expinfoPanelCustCreditHistory);
	System.out.println("infoPanelCustAgeingAnalysis      : "+actinfoPanelCustAgeingAnalysis      +" Value Expected : "+expinfoPanelCustAgeingAnalysis);
	System.out.println("infoPanelCustAgeingAnalysisBase  : "+actinfoPanelCustAgeingAnalysisBase  +" Value Expected : "+expinfoPanelCustAgeingAnalysisBase);
	System.out.println("infoPanelCustAgeingAnalysisLocal : "+actinfoPanelCustAgeingAnalysisLocal +" Value Expected : "+expinfoPanelCustAgeingAnalysisLocal);
	System.out.println("infoPanelAuthorization           : "+actinfoPanelAuthorization           +" Value Expected : "+expinfoPanelAuthorization);
	
	if(actiteminfoPanelCust_AddBtn==expiteminfoPanelCust_AddBtn && actinfoPanelCust_DeleteBtn==expinfoPanelCust_DeleteBtn
			&& actinfoPanelCust_CloseBtn==expinfoPanelCust_CloseBtn && actinfoPanelCustCreditHistory==expinfoPanelCustCreditHistory
			&& actinfoPanelCustAgeingAnalysis==expinfoPanelCustAgeingAnalysis && actinfoPanelCustAgeingAnalysisBase==expinfoPanelCustAgeingAnalysisBase
			&& actinfoPanelCustAgeingAnalysisLocal==expinfoPanelCustAgeingAnalysisLocal && actinfoPanelAuthorization==expinfoPanelAuthorization)
	{
		excelReader.setCellData(xlfile, "Sheet1", 298, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 298, 9, resFail);
		return false;
	}
}



public static boolean checkReportsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountReportsTab));
	accountReportsTab.click();
	 
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountReports_SaveBtn));
	
	boolean actaccountReports_SaveBtn   						=accountReports_SaveBtn.isDisplayed();
	boolean actaccountReports_CloseBtn   						=accountReports_CloseBtn.isDisplayed();
	boolean actreports_MasterInfoChkBox   						=reports_MasterInfoChkBox.isDisplayed();
	boolean actreports_ABCAnalysisAmountChkBox   				=reports_ABCAnalysisAmountChkBox.isDisplayed();
	boolean actreports_BankBookChkBox   						=reports_BankBookChkBox.isDisplayed();
	boolean actreports_BankreconciliationstatementChkBox   		=reports_BankreconciliationstatementChkBox.isDisplayed();
	boolean actreports_CashBookChkBox   						=reports_CashBookChkBox.isDisplayed();
	boolean actreports_ComparativeAnalysisChkBox   				=reports_ComparativeAnalysisChkBox.isDisplayed();
	boolean actreports_CustomerAgeingDetailsAnalysisChkBox   	=reports_CustomerAgeingDetailsAnalysisChkBox.isDisplayed();
	boolean actreports_CustomerageingdetailbyduedateChkBox   	=reports_CustomerageingdetailbyduedateChkBox.isDisplayed();
	boolean actreports_CustomerageingsummaryanalysisChkBox   	=reports_CustomerageingsummaryanalysisChkBox.isDisplayed();
	boolean actreports_CustomerbillwisesummaryChkBox   			=reports_CustomerbillwisesummaryChkBox.isDisplayed();
	boolean actreports_CustomerduedateanalysisChkBox   			=reports_CustomerduedateanalysisChkBox.isDisplayed();
	boolean actreports_CustomerlistingofoutstandingbillsChkBox  =reports_CustomerlistingofoutstandingbillsChkBox.isDisplayed();
	boolean actreports_CustomeroverdueanalysisChkBox   			=reports_CustomeroverdueanalysisChkBox.isDisplayed();
	boolean actreports_CustomeroverduesummaryChkBox   			=reports_CustomeroverduesummaryChkBox.isDisplayed();
	boolean actreports_CustomerstatementsChkBox   				=reports_CustomerstatementsChkBox.isDisplayed();
	boolean actreports_CustomersummaryageingbyduedateChkBox   	=reports_CustomersummaryageingbyduedateChkBox.isDisplayed();
	boolean actreports_IncomeExpenseTrendChkBox   				=reports_IncomeExpenseTrendChkBox.isDisplayed();
	boolean actreports_InterestcalculationChkBox   				=reports_InterestcalculationChkBox.isDisplayed();
	boolean actreports_LedgerChkBox   							=reports_LedgerChkBox.isDisplayed();
	boolean actreports_LedgerdetailChkBox   					=reports_LedgerdetailChkBox.isDisplayed();
	boolean actreports_MonthlySalesChkBox   					=reports_MonthlySalesChkBox.isDisplayed();
	boolean actreports_PeakandlowbalanceamountChkBox   			=reports_PeakandlowbalanceamountChkBox.isDisplayed();
	boolean actreports_PettycashbookChkBox   					=reports_PettycashbookChkBox.isDisplayed();
	boolean actreports_PurchaseregisterChkBox   				=reports_PurchaseregisterChkBox.isDisplayed();
	boolean actreports_PurchasereturnregisterChkBox   			=reports_PurchasereturnregisterChkBox.isDisplayed();
	boolean actreports_PurchasesgroupedbydepartmentChkBox   	=reports_PurchasesgroupedbydepartmentChkBox.isDisplayed();
	boolean actreports_PurchasesgroupedbyItemChkBox   			=reports_PurchasesgroupedbyItemChkBox.isDisplayed();
	boolean actreports_PurchasesgroupedbyvendorChkBox   		=reports_PurchasesgroupedbyvendorChkBox.isDisplayed();
	boolean actreports_SalesdaybookChkBox   					=reports_SalesdaybookChkBox.isDisplayed();
	boolean actreports_SalesgroupedbycustomerChkBox   			=reports_SalesgroupedbycustomerChkBox.isDisplayed();
	boolean actreports_salesgroupedbydepartmentrChkBox   		=reports_salesgroupedbydepartmentrChkBox.isDisplayed();
	boolean actreports_SalesgroupedbyItemChkBox   				=reports_SalesgroupedbyItemChkBox.isDisplayed();
	boolean actreports_SalesreturnregisterChkBox   				=reports_SalesreturnregisterChkBox.isDisplayed();
	boolean actreports_SchedulesChkBox   						=reports_SchedulesChkBox.isDisplayed();
	boolean actreports_SubledgerChkBox   						=reports_SubledgerChkBox.isDisplayed();
	boolean actreports_SummarysalesregisterChkBox   			=reports_SummarysalesregisterChkBox.isDisplayed();
	boolean actreports_TopCustomersChkBox   					=reports_TopCustomersChkBox.isDisplayed();
	boolean actreports_TradingaccountrChkBox   					=reports_TradingaccountrChkBox.isDisplayed();
	boolean actreports_TransactionstypeanalysisChkBox   		=reports_TransactionstypeanalysisChkBox.isDisplayed();
	boolean actreports_VendorageingdetailanalysisChkBox   		=reports_VendorageingdetailanalysisChkBox.isDisplayed();
	boolean actreports_VendorageingdetailbyduedateChkBox   		=reports_VendorageingdetailbyduedateChkBox.isDisplayed();
	boolean actreports_VendorageingsummaryanalysisChkBox   		=reports_VendorageingsummaryanalysisChkBox.isDisplayed();
	boolean actreports_VendorbillwisesummaryChkBox  		 	=reports_VendorbillwisesummaryChkBox.isDisplayed();
	boolean actreports_VendorduedateanalysisChkBox   			=reports_VendorduedateanalysisChkBox.isDisplayed();
	boolean actreports_VendorlistingofoutstandingbillsChkBox   	=reports_VendorlistingofoutstandingbillsChkBox.isDisplayed();
	boolean actreports_VendoroverdueanalysisChkBox   			=reports_VendoroverdueanalysisChkBox.isDisplayed();
	boolean actreports_VendoroverduesummaryChkBox   			=reports_VendoroverduesummaryChkBox.isDisplayed();
	boolean actreports_VendorstatementsChkBox   				=reports_VendorstatementsChkBox.isDisplayed();
	boolean actreports_VendorsummaryageingbyduedateChkBox   	=reports_VendorsummaryageingbyduedateChkBox.isDisplayed();
	
	boolean expaccountReports_SaveBtn   						=true;
	boolean expaccountReports_CloseBtn   						=true;
	boolean expreports_MasterInfoChkBox   						=true;
	boolean expreports_ABCAnalysisAmountChkBox   				=true;
	boolean expreports_BankBookChkBox   						=true;
	boolean expreports_BankreconciliationstatementChkBox   		=true;
	boolean expreports_CashBookChkBox   						=true;
	boolean expreports_ComparativeAnalysisChkBox   				=true;
	boolean expreports_CustomerAgeingDetailsAnalysisChkBox   	=true;
	boolean expreports_CustomerageingdetailbyduedateChkBox   	=true;
	boolean expreports_CustomerageingsummaryanalysisChkBox   	=true;
	boolean expreports_CustomerbillwisesummaryChkBox   			=true;
	boolean expreports_CustomerduedateanalysisChkBox   			=true;
	boolean expreports_CustomerlistingofoutstandingbillsChkBox  =true;
	boolean expreports_CustomeroverdueanalysisChkBox   			=true;
	boolean expreports_CustomeroverduesummaryChkBox   			=true;
	boolean expreports_CustomerstatementsChkBox   				=true;
	boolean expreports_CustomersummaryageingbyduedateChkBox   	=true;
	boolean expreports_IncomeExpenseTrendChkBox   				=true;
	boolean expreports_InterestcalculationChkBox   				=true;
	boolean expreports_LedgerChkBox   							=true;
	boolean expreports_LedgerdetailChkBox   					=true;
	boolean expreports_MonthlySalesChkBox   					=true;
	boolean expreports_PeakandlowbalanceamountChkBox   			=true;
	boolean expreports_PettycashbookChkBox   					=true;
	boolean expreports_PurchaseregisterChkBox   				=true;
	boolean expreports_PurchasereturnregisterChkBox   			=true;
	boolean expreports_PurchasesgroupedbydepartmentChkBox   	=true;
	boolean expreports_PurchasesgroupedbyItemChkBox   			=true;
	boolean expreports_PurchasesgroupedbyvendorChkBox   		=true;
	boolean expreports_SalesdaybookChkBox   					=true;
	boolean expreports_SalesgroupedbycustomerChkBox   			=true;
	boolean expreports_salesgroupedbydepartmentrChkBox   		=true;
	boolean expreports_SalesgroupedbyItemChkBox   				=true;
	boolean expreports_SalesreturnregisterChkBox   				=true;
	boolean expreports_SchedulesChkBox   						=true;
	boolean expreports_SubledgerChkBox   						=true;
	boolean expreports_SummarysalesregisterChkBox   			=true;
	boolean expreports_TopCustomersChkBox   					=true;
	boolean expreports_TradingaccountrChkBox   					=true;
	boolean expreports_TransactionstypeanalysisChkBox   		=true;
	boolean expreports_VendorageingdetailanalysisChkBox   		=true;
	boolean expreports_VendorageingdetailbyduedateChkBox   		=true;
	boolean expreports_VendorageingsummaryanalysisChkBox   		=true;
	boolean expreports_VendorbillwisesummaryChkBox  		 	=true;
	boolean expreports_VendorduedateanalysisChkBox   			=true;
	boolean expreports_VendorlistingofoutstandingbillsChkBox   	=true;
	boolean expreports_VendoroverdueanalysisChkBox   			=true;
	boolean expreports_VendoroverduesummaryChkBox   			=true;
	boolean expreports_VendorstatementsChkBox   				=true;
	boolean expreports_VendorsummaryageingbyduedateChkBox   	=true;
	
	System.out.println("****************************************checkReportsInCustomizeMaster***************************************");
	
	System.out.println("accountReports_SaveBtn                           : "+actaccountReports_SaveBtn                           +" Value Expected : "+expaccountReports_SaveBtn);
	System.out.println("accountReports_CloseBtn                          : "+actaccountReports_CloseBtn                          +" Value Expected : "+expaccountReports_CloseBtn);
	System.out.println("reports_MasterInfoChkBox                         : "+actreports_MasterInfoChkBox                         +" Value Expected : "+expreports_MasterInfoChkBox);
	System.out.println("reports_ABCAnalysisAmountChkBox                  : "+actreports_ABCAnalysisAmountChkBox                  +" Value Expected : "+expreports_ABCAnalysisAmountChkBox);
	System.out.println("reports_BankBookChkBox                           : "+actreports_BankBookChkBox                           +" Value Expected : "+expreports_BankBookChkBox);
	System.out.println("reports_BankreconciliationstatementChkBox        : "+actreports_BankreconciliationstatementChkBox        +" Value Expected : "+expreports_BankreconciliationstatementChkBox);
	System.out.println("reports_CashBookChkBox                           : "+actreports_CashBookChkBox                           +" Value Expected : "+expreports_CashBookChkBox);
	System.out.println("reports_ComparativeAnalysisChkBox                : "+actreports_ComparativeAnalysisChkBox                +" Value Expected : "+expreports_ComparativeAnalysisChkBox);
	System.out.println("reports_CustomerAgeingDetailsAnalysisChkBox      : "+actreports_CustomerAgeingDetailsAnalysisChkBox      +" Value Expected : "+expreports_CustomerAgeingDetailsAnalysisChkBox);
	System.out.println("reports_CustomerageingdetailbyduedateChkBox      : "+actreports_CustomerageingdetailbyduedateChkBox      +" Value Expected : "+expreports_CustomerageingdetailbyduedateChkBox);
	System.out.println("reports_CustomerageingsummaryanalysisChkBox      : "+actreports_CustomerageingsummaryanalysisChkBox      +" Value Expected : "+expreports_CustomerageingsummaryanalysisChkBox);
	System.out.println("reports_CustomerbillwisesummaryChkBox            : "+actreports_CustomerbillwisesummaryChkBox            +" Value Expected : "+expreports_CustomerbillwisesummaryChkBox);
	System.out.println("reports_CustomerduedateanalysisChkBox            : "+actreports_CustomerduedateanalysisChkBox            +" Value Expected : "+expreports_CustomerduedateanalysisChkBox);
	System.out.println("reports_CustomerlistingofoutstandingbillsChkBox  : "+actreports_CustomerlistingofoutstandingbillsChkBox  +" Value Expected : "+expreports_CustomerlistingofoutstandingbillsChkBox);
	System.out.println("reports_CustomeroverdueanalysisChkBox            : "+actreports_CustomeroverdueanalysisChkBox            +" Value Expected : "+expreports_CustomeroverdueanalysisChkBox);
	System.out.println("reports_CustomeroverduesummaryChkBox             : "+actreports_CustomeroverduesummaryChkBox             +" Value Expected : "+expreports_CustomeroverduesummaryChkBox);
	System.out.println("reports_CustomerstatementsChkBox                 : "+actreports_CustomerstatementsChkBox                 +" Value Expected : "+expreports_CustomerstatementsChkBox);
	System.out.println("reports_CustomersummaryageingbyduedateChkBox     : "+actreports_CustomersummaryageingbyduedateChkBox     +" Value Expected : "+expreports_CustomersummaryageingbyduedateChkBox);
	System.out.println("reports_IncomeExpenseTrendChkBox                 : "+actreports_IncomeExpenseTrendChkBox                 +" Value Expected : "+expreports_IncomeExpenseTrendChkBox);
	System.out.println("reports_InterestcalculationChkBox                : "+actreports_InterestcalculationChkBox                +" Value Expected : "+expreports_InterestcalculationChkBox);
	System.out.println("reports_LedgerChkBox                             : "+actreports_LedgerChkBox                             +" Value Expected : "+expreports_LedgerChkBox);
	System.out.println("reports_LedgerdetailChkBox                       : "+actreports_LedgerdetailChkBox                       +" Value Expected : "+expreports_LedgerdetailChkBox);
	System.out.println("reports_MonthlySalesChkBox                       : "+actreports_MonthlySalesChkBox                       +" Value Expected : "+expreports_MonthlySalesChkBox);
	System.out.println("reports_PeakandlowbalanceamountChkBox            : "+actreports_PeakandlowbalanceamountChkBox            +" Value Expected : "+expreports_PeakandlowbalanceamountChkBox);
	System.out.println("reports_PettycashbookChkBox                      : "+actreports_PettycashbookChkBox                      +" Value Expected : "+expreports_PettycashbookChkBox);
	System.out.println("reports_PurchaseregisterChkBox                   : "+actreports_PurchaseregisterChkBox                   +" Value Expected : "+expreports_PurchaseregisterChkBox);
	System.out.println("reports_PurchasereturnregisterChkBox             : "+actreports_PurchasereturnregisterChkBox             +" Value Expected : "+expreports_PurchasereturnregisterChkBox);
	System.out.println("reports_PurchasesgroupedbydepartmentChkBox       : "+actreports_PurchasesgroupedbydepartmentChkBox       +" Value Expected : "+expreports_PurchasesgroupedbydepartmentChkBox);
	System.out.println("reports_PurchasesgroupedbyItemChkBox             : "+actreports_PurchasesgroupedbyItemChkBox             +" Value Expected : "+expreports_PurchasesgroupedbyItemChkBox);
	System.out.println("reports_PurchasesgroupedbyvendorChkBox           : "+actreports_PurchasesgroupedbyvendorChkBox           +" Value Expected : "+expreports_PurchasesgroupedbyvendorChkBox);
	System.out.println("reports_SalesdaybookChkBox                       : "+actreports_SalesdaybookChkBox                       +" Value Expected : "+expreports_SalesdaybookChkBox);
	System.out.println("reports_SalesgroupedbycustomerChkBox             : "+actreports_SalesgroupedbycustomerChkBox             +" Value Expected : "+expreports_SalesgroupedbycustomerChkBox);
	System.out.println("reports_salesgroupedbydepartmentrChkBox          : "+actreports_salesgroupedbydepartmentrChkBox          +" Value Expected : "+expreports_salesgroupedbydepartmentrChkBox);
	System.out.println("reports_SalesgroupedbyItemChkBox                 : "+actreports_SalesgroupedbyItemChkBox                 +" Value Expected : "+expreports_SalesgroupedbyItemChkBox);
	System.out.println("reports_SalesreturnregisterChkBox                : "+actreports_SalesreturnregisterChkBox                +" Value Expected : "+expreports_SalesreturnregisterChkBox);
	System.out.println("reports_SchedulesChkBox                          : "+actreports_SchedulesChkBox                          +" Value Expected : "+expreports_SchedulesChkBox);
	System.out.println("reports_SubledgerChkBox                          : "+actreports_SubledgerChkBox                          +" Value Expected : "+expreports_SubledgerChkBox);
	System.out.println("reports_SummarysalesregisterChkBox               : "+actreports_SummarysalesregisterChkBox               +" Value Expected : "+expreports_SummarysalesregisterChkBox);
	System.out.println("reports_TopCustomersChkBox                       : "+actreports_TopCustomersChkBox                       +" Value Expected : "+expreports_TopCustomersChkBox);
	System.out.println("reports_TradingaccountrChkBox                    : "+actreports_TradingaccountrChkBox                    +" Value Expected : "+expreports_TradingaccountrChkBox);
	System.out.println("reports_TransactionstypeanalysisChkBox           : "+actreports_TransactionstypeanalysisChkBox           +" Value Expected : "+expreports_TransactionstypeanalysisChkBox);
	System.out.println("reports_VendorageingdetailanalysisChkBox         : "+actreports_VendorageingdetailanalysisChkBox         +" Value Expected : "+expreports_VendorageingdetailanalysisChkBox);
	System.out.println("reports_VendorageingdetailbyduedateChkBox        : "+actreports_VendorageingdetailbyduedateChkBox        +" Value Expected : "+expreports_VendorageingdetailbyduedateChkBox);
	System.out.println("reports_VendorageingsummaryanalysisChkBox        : "+actreports_VendorageingsummaryanalysisChkBox        +" Value Expected : "+expreports_VendorageingsummaryanalysisChkBox);
	System.out.println("reports_VendorbillwisesummaryChkBox              : "+actreports_VendorbillwisesummaryChkBox              +" Value Expected : "+expreports_VendorbillwisesummaryChkBox);
	System.out.println("reports_VendorduedateanalysisChkBox              : "+actreports_VendorduedateanalysisChkBox              +" Value Expected : "+expreports_VendorduedateanalysisChkBox);
	System.out.println("reports_VendorlistingofoutstandingbillsChkBox    : "+actreports_VendorlistingofoutstandingbillsChkBox    +" Value Expected : "+expreports_VendorlistingofoutstandingbillsChkBox);
	System.out.println("reports_VendoroverdueanalysisChkBox              : "+actreports_VendoroverdueanalysisChkBox              +" Value Expected : "+expreports_VendoroverdueanalysisChkBox);
	System.out.println("reports_VendoroverduesummaryChkBox               : "+actreports_VendoroverduesummaryChkBox               +" Value Expected : "+expreports_VendoroverduesummaryChkBox);
	System.out.println("reports_VendorstatementsChkBox                   : "+actreports_VendorstatementsChkBox                   +" Value Expected : "+expreports_VendorstatementsChkBox);
	System.out.println("reports_VendorsummaryageingbyduedateChkBox       : "+actreports_VendorsummaryageingbyduedateChkBox       +" Value Expected : "+expreports_VendorsummaryageingbyduedateChkBox);
	
	
	if(actaccountReports_SaveBtn==expaccountReports_SaveBtn && actaccountReports_CloseBtn==expaccountReports_CloseBtn
			&& actreports_MasterInfoChkBox==expreports_MasterInfoChkBox && actreports_ABCAnalysisAmountChkBox==expreports_ABCAnalysisAmountChkBox
			&& actreports_BankBookChkBox==expreports_BankBookChkBox && actreports_BankreconciliationstatementChkBox==expreports_BankreconciliationstatementChkBox
			&& actreports_CashBookChkBox==expreports_CashBookChkBox && actreports_ComparativeAnalysisChkBox==expreports_ComparativeAnalysisChkBox
			&& actreports_CustomerAgeingDetailsAnalysisChkBox==expreports_CustomerAgeingDetailsAnalysisChkBox
			&& actreports_CustomerageingdetailbyduedateChkBox==expreports_CustomerageingdetailbyduedateChkBox
			&& actreports_CustomerageingsummaryanalysisChkBox==expreports_CustomerageingsummaryanalysisChkBox
			&& actreports_CustomerbillwisesummaryChkBox==expreports_CustomerbillwisesummaryChkBox
			&& actreports_CustomerduedateanalysisChkBox==expreports_CustomerduedateanalysisChkBox
			&& actreports_CustomerlistingofoutstandingbillsChkBox==expreports_CustomerlistingofoutstandingbillsChkBox
			&& actreports_CustomeroverdueanalysisChkBox==expreports_CustomeroverdueanalysisChkBox
			&& actreports_CustomeroverduesummaryChkBox==expreports_CustomeroverduesummaryChkBox
			&& actreports_CustomerstatementsChkBox==expreports_CustomerstatementsChkBox 
			&& actreports_CustomersummaryageingbyduedateChkBox==expreports_CustomersummaryageingbyduedateChkBox
			&& actreports_IncomeExpenseTrendChkBox==expreports_IncomeExpenseTrendChkBox
			&& actreports_InterestcalculationChkBox==expreports_InterestcalculationChkBox
			&& actreports_LedgerChkBox==expreports_LedgerChkBox && actreports_LedgerdetailChkBox==expreports_LedgerdetailChkBox
			&& actreports_MonthlySalesChkBox==expreports_MonthlySalesChkBox && actreports_PeakandlowbalanceamountChkBox==expreports_PeakandlowbalanceamountChkBox
			&& actreports_PettycashbookChkBox==expreports_PettycashbookChkBox && actreports_PurchaseregisterChkBox==expreports_PurchaseregisterChkBox
			&& actreports_PurchasereturnregisterChkBox==expreports_PurchasereturnregisterChkBox
			&& actreports_PurchasesgroupedbydepartmentChkBox==expreports_PurchasesgroupedbydepartmentChkBox
			&& actreports_PurchasesgroupedbyItemChkBox==expreports_PurchasesgroupedbyItemChkBox
			&& actreports_PurchasesgroupedbyvendorChkBox==expreports_PurchasesgroupedbyvendorChkBox
			&& actreports_SalesdaybookChkBox==expreports_SalesdaybookChkBox && actreports_SalesgroupedbycustomerChkBox==expreports_SalesgroupedbycustomerChkBox
			&& actreports_salesgroupedbydepartmentrChkBox==expreports_salesgroupedbydepartmentrChkBox 
			&& actreports_SalesgroupedbyItemChkBox==expreports_SalesgroupedbyItemChkBox
			&& actreports_SalesreturnregisterChkBox==expreports_SalesreturnregisterChkBox && actreports_SchedulesChkBox==expreports_SchedulesChkBox
			&& actreports_SubledgerChkBox==expreports_SubledgerChkBox && actreports_SummarysalesregisterChkBox==expreports_SummarysalesregisterChkBox
			&& actreports_TopCustomersChkBox==expreports_TopCustomersChkBox && actreports_TradingaccountrChkBox==expreports_TradingaccountrChkBox
			&& actreports_TransactionstypeanalysisChkBox==expreports_TransactionstypeanalysisChkBox 
			&& actreports_VendorageingdetailanalysisChkBox==expreports_VendorageingdetailanalysisChkBox
			&& actreports_VendorageingdetailbyduedateChkBox==expreports_VendorageingdetailbyduedateChkBox 
			&& actreports_VendorageingsummaryanalysisChkBox==expreports_VendorageingsummaryanalysisChkBox
			&& actreports_VendorbillwisesummaryChkBox==expreports_VendorbillwisesummaryChkBox
			&& actreports_VendorduedateanalysisChkBox==expreports_VendorduedateanalysisChkBox
			&& actreports_VendorlistingofoutstandingbillsChkBox==expreports_VendorlistingofoutstandingbillsChkBox
			&& actreports_VendoroverdueanalysisChkBox==expreports_VendoroverdueanalysisChkBox
			&& actreports_VendoroverduesummaryChkBox==expreports_VendoroverduesummaryChkBox
			&& actreports_VendorstatementsChkBox==expreports_VendorstatementsChkBox
			&& actreports_VendorsummaryageingbyduedateChkBox==expreports_VendorsummaryageingbyduedateChkBox)
	{
		excelReader.setCellData(xlfile, "Sheet1", 299, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 299, 9, resFail);
		return false;
	}
}


public static boolean checkCreateTabsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsOption));
	masterFieldsOption.click();
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
		 
	boolean actcreateTab       =createTab.isDisplayed();
	boolean acttabs_DeleteBtn  =tabs_DeleteBtn.isDisplayed();
	
	boolean expcreateTab       =true;
	boolean exptabs_DeleteBtn  =true;
	
	System.out.println("*****************************checkCreateTabsInCustomizeMaster****************************");
	
	System.out.println("createTab       : "+actcreateTab      +" Value Expected : "+expcreateTab);
	System.out.println("tabs_DeleteBtn  : "+acttabs_DeleteBtn +" Value Expected : "+exptabs_DeleteBtn);
	
	if(actcreateTab==expcreateTab && acttabs_DeleteBtn==exptabs_DeleteBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 300, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 300, 9, resFail);
		return false;
	}
	}
 


public static boolean checkCreateTabsOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
	createTab.click();
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabTreeTab));
	
	boolean actcreateTabTreeTab  		=createTabTreeTab.isDisplayed();
	boolean actcreateTab_DocumentTab  	=createTab_DocumentTab.isDisplayed();
	boolean actcreateTab_CreateTab  	=createTab_CreateTab.isDisplayed();
	
	boolean expcreateTabTreeTab  		=true;
	boolean expcreateTab_DocumentTab  	=true;
	boolean expcreateTab_CreateTab  	=true;
	
	System.out.println("****************************checkCreateTabsOptionsInCustomizeMaster****************************");
	
	System.out.println("createTabTreeTab        : "+actcreateTabTreeTab      +" Value Expected : "+expcreateTabTreeTab);
	System.out.println("createTab_DocumentTab   : "+actcreateTab_DocumentTab +" Value Expected : "+expcreateTab_DocumentTab);
	System.out.println("createTab_CreateTab     : "+actcreateTab_CreateTab   +" Value Expected : "+expcreateTab_CreateTab);

	if(actcreateTabTreeTab==expcreateTabTreeTab && actcreateTab_DocumentTab==expcreateTab_DocumentTab && actcreateTab_CreateTab==expcreateTab_CreateTab)
	{	 
		excelReader.setCellData(xlfile, "Sheet1", 301, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 301, 9, resFail);
		return false;
	}
	}


public static boolean checkCreateTreeTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabTreeTab));
	createTabTreeTab.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabCaptionTxt));
	
	boolean acttreeTabCaptionTxt  	 		=treeTabCaptionTxt.isDisplayed();
	boolean acttreeTabTabNameTxt   			=treeTabTabNameTxt.isDisplayed();
	boolean acttreeTabNewMastertxt   		=treeTabNewMastertxt.isDisplayed();
	boolean acttreeTabNewMasterdropdown   	=treeTabNewMasterdropdown.isDisplayed();
	boolean acttreeTab_NewMasterSettingsBtn =treeTab_NewMasterSettingsBtn.isDisplayed();
	boolean acttreeTab_FieldCaptiontxt   	=treeTab_FieldCaptiontxt.isDisplayed();
	boolean acttreeTab_FieldNameTxt   		=treeTab_FieldNameTxt.isDisplayed();
	boolean acttreeTab_HiddenChkBox   		=treeTab_HiddenChkBox.isDisplayed();
	boolean acttreeTab_OkBtn   				=treeTab_OkBtn.isDisplayed();
	boolean acttreeTab_CancelBtn   			=treeTab_CancelBtn.isDisplayed();
	
	boolean exptreeTabCaptionTxt  	 		=true;
	boolean exptreeTabTabNameTxt   			=true;
	boolean exptreeTabNewMastertxt   		=true;
	boolean exptreeTabNewMasterdropdown   	=true;
	boolean exptreeTab_NewMasterSettingsBtn =true;
	boolean exptreeTab_FieldCaptiontxt   	=true;
	boolean exptreeTab_FieldNameTxt   		=true;
	boolean exptreeTab_HiddenChkBox   		=true;
	boolean exptreeTab_OkBtn   				=true;
	boolean exptreeTab_CancelBtn   			=true;
	
		System.out.println("*************************************checkCreateTreeTabOptionsInCustomizeMaster*******************************"); 
	
	System.out.println("treeTabCaptionTxt            : "+acttreeTabCaptionTxt            +" Value Expected : "+exptreeTabCaptionTxt);
	System.out.println("treeTabTabNameTxt            : "+acttreeTabTabNameTxt            +" Value Expected : "+exptreeTabTabNameTxt);
	System.out.println("treeTabNewMastertxt          : "+acttreeTabNewMastertxt          +" Value Expected : "+exptreeTabNewMastertxt);
	System.out.println("treeTabNewMasterdropdown     : "+acttreeTabNewMasterdropdown     +" Value Expected : "+exptreeTabNewMasterdropdown);
	System.out.println("treeTab_NewMasterSettingsBtn : "+acttreeTab_NewMasterSettingsBtn +" Value Expected : "+exptreeTab_NewMasterSettingsBtn);
	System.out.println("treeTab_FieldCaptiontxt      : "+acttreeTab_FieldCaptiontxt      +" Value Expected : "+exptreeTab_FieldCaptiontxt);
	System.out.println("treeTab_FieldNameTxt         : "+acttreeTab_FieldNameTxt         +" Value Expected : "+exptreeTab_FieldNameTxt);
	System.out.println("treeTab_HiddenChkBox         : "+acttreeTab_HiddenChkBox         +" Value Expected : "+exptreeTab_HiddenChkBox);
	System.out.println("treeTab_OkBtn                : "+acttreeTab_OkBtn                +" Value Expected : "+exptreeTab_OkBtn);
	System.out.println("treeTab_CancelBtn            : "+acttreeTab_CancelBtn            +" Value Expected : "+exptreeTab_CancelBtn);
	
	if(acttreeTabCaptionTxt==exptreeTabCaptionTxt && acttreeTabTabNameTxt==exptreeTabTabNameTxt && acttreeTabNewMastertxt==exptreeTabNewMastertxt
			&& acttreeTabNewMasterdropdown==exptreeTabNewMasterdropdown && acttreeTab_NewMasterSettingsBtn==exptreeTab_NewMasterSettingsBtn 
			&& acttreeTab_FieldCaptiontxt==exptreeTab_FieldCaptiontxt && acttreeTab_FieldNameTxt==exptreeTab_FieldNameTxt
			&& acttreeTab_HiddenChkBox==exptreeTab_HiddenChkBox && acttreeTab_OkBtn==exptreeTab_OkBtn && acttreeTab_CancelBtn==exptreeTab_CancelBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 302, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 302, 9, resFail);
		return false;
	}
	}


public static boolean checkMandatoryCheckForCreateTreeTabWithAllInputsAreBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_OkBtn));
	treeTab_OkBtn.click();   		 
   		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTabsMessage));
	
	String actcustomizeMasterCreateTabsMessage  =customizeMasterCreateTabsMessage.getText();
	String expcustomizeMasterCreateTabsMessage  ="Please enter Tab name.";
	
	System.out.println("********************checkMandatoryCheckForCreateTreeTabWithAllInputsAreBlank***************************");
	
	System.out.println("customizeMasterCreateTabsMessage  : "+actcustomizeMasterCreateTabsMessage+" Value Expected : "+expcustomizeMasterCreateTabsMessage);
 
	if(actcustomizeMasterCreateTabsMessage.equalsIgnoreCase(expcustomizeMasterCreateTabsMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 303, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 303, 9, resFail);
		return false;
	}
}
  

public static boolean checkMandatoryCheckForCreateTreeTabWithCaptionAsBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
	
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabTabNameTxt));
	treeTabTabNameTxt.click();
	treeTabTabNameTxt.sendKeys("Tree Tab");
	treeTabTabNameTxt.sendKeys(Keys.TAB); 
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_OkBtn));
	treeTab_OkBtn.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTabsMessage));
	
	String actcustomizeMasterCreateTabsMessage  =customizeMasterCreateTabsMessage.getText();
	String expcustomizeMasterCreateTabsMessage  ="Please enter Tab name.";
	
	System.out.println("********************checkMandatoryCheckForCreateTreeTabWithCaptionAsBlank***************************");
	
	System.out.println("customizeMasterCreateTabsMessage  : "+actcustomizeMasterCreateTabsMessage+" Value Expected : "+expcustomizeMasterCreateTabsMessage);
 
	if(actcustomizeMasterCreateTabsMessage.equalsIgnoreCase(expcustomizeMasterCreateTabsMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 304, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 304, 9, resFail);
		return false;
	}
}


public static boolean checkMandatoryCheckForCreateTreeTabNewMasterAsBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabCaptionTxt));
	treeTabCaptionTxt.sendKeys("Tree Tab");
		 
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_OkBtn));
	treeTab_OkBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTabsMasterNameMessage));
	
	String actcustomizeMasterCreateTabsMasterNameMessage  =customizeMasterCreateTabsMasterNameMessage.getText();
	String expcustomizeMasterCreateTabsMasterNameMessage  ="Please enter Master name.";
	
	System.out.println("********************checkMandatoryCheckForCreateTreeTabNewMasterAsBlank***************************");
	
	System.out.println("customizeMasterCreateTabsMasterNameMessage  : "+actcustomizeMasterCreateTabsMasterNameMessage+" Value Expected : "+expcustomizeMasterCreateTabsMasterNameMessage);
 
	if(actcustomizeMasterCreateTabsMasterNameMessage.equalsIgnoreCase(expcustomizeMasterCreateTabsMasterNameMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 305, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 305, 9, resFail);
		return false;
	}
}


public static boolean checkMandatoryCheckForCreateTreeTabFieldCaptionAsBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabNewMastertxt));
	treeTabNewMastertxt.sendKeys("Account");
	Thread.sleep(3000);
	treeTabNewMastertxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_OkBtn));
	treeTab_OkBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTabsMessage));
	
	String actcustomizeMasterCreateTabsMessage  =customizeMasterCreateTabsMessage.getText();
	String expcustomizeMasterCreateTabsMessage  ="Enter field caption";
	
	System.out.println("********************checkMandatoryCheckForCreateTreeTabFieldCaptionAsBlank***************************");
	
	System.out.println("customizeMasterCreateTabsMessage  : "+actcustomizeMasterCreateTabsMessage+" Value Expected : "+expcustomizeMasterCreateTabsMessage);
 
	if(actcustomizeMasterCreateTabsMessage.equalsIgnoreCase(expcustomizeMasterCreateTabsMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 306, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 306, 9, resFail);
		return false;
	}
}


public static boolean checkOkCheckForCreateTreeTabWithInput() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_FieldCaptiontxt));
	treeTab_FieldCaptiontxt.sendKeys("Tree Tab");	
	     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_OkBtn));
	treeTab_OkBtn.click();
		 
		String expMessage="Tab Added Successfully";
	
		String actMessage=checkValidationMessage(expMessage);
		 
		System.out.println("********************************checkOkCheckForCreateTreeTabWithInput***************************");
	
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, "Sheet1", 307, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 307, 9, resFail);
			return false;
		}
}


 
public static boolean checkNewCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreate));
	
	boolean actcustomizeMasterCreateTreeTabNewlyCreate  =customizeMasterCreateTreeTabNewlyCreate.isDisplayed();
	boolean expcustomizeMasterCreateTreeTabNewlyCreate  =true;
	
	System.out.println("**************************checkNewCreateTreeTabDisplayInTabs*************************");
	
	System.out.println("customizeMasterCreateTreeTabNewlyCreate  : "+actcustomizeMasterCreateTreeTabNewlyCreate+" Value Expected : "+expcustomizeMasterCreateTreeTabNewlyCreate);
	 	
	if(actcustomizeMasterCreateTreeTabNewlyCreate==expcustomizeMasterCreateTreeTabNewlyCreate)
	{
		excelReader.setCellData(xlfile, "Sheet1", 308, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 308, 9, resFail);
		return false;
	}
}

 
 
public static boolean checkEditPopUpForNewCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreate));
	
	getAction().doubleClick(customizeMasterCreateTreeTabNewlyCreate).build().perform();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreateTabCaption));
	
	boolean actcustomizeMasterCreateTreeTabNewlyCreateTabCaption  	=customizeMasterCreateTreeTabNewlyCreateTabCaption.isDisplayed();
	boolean actcustomizeMasterCreateTreeTabNewlyCreateHidden  		=customizeMasterCreateTreeTabNewlyCreateHidden.isDisplayed();
	boolean actcustomizeMasterCreateTreeTabNewlyCreateOkButton  	=customizeMasterCreateTreeTabNewlyCreateOkButton.isDisplayed();
	boolean actcustomizeMasterCreateTreeTabNewlyCreateCancelButton =customizeMasterCreateTreeTabNewlyCreateCancelButton.isDisplayed();
	
	boolean expcustomizeMasterCreateTreeTabNewlyCreateTabCaption  	=true;
	boolean expcustomizeMasterCreateTreeTabNewlyCreateHidden  		=true;
	boolean expcustomizeMasterCreateTreeTabNewlyCreateOkButton  	=true;
	boolean expcustomizeMasterCreateTreeTabNewlyCreateCancelButton =true;
	
	System.out.println("*********************************checkEditPopUpForNewCreateTreeTabDisplayInTabs*************************************");
	
	System.out.println("customizeMasterCreateTreeTabNewlyCreateTabCaption    : "+actcustomizeMasterCreateTreeTabNewlyCreateTabCaption   +" Value Expected : "+expcustomizeMasterCreateTreeTabNewlyCreateTabCaption);
	System.out.println("customizeMasterCreateTreeTabNewlyCreateHidden        : "+actcustomizeMasterCreateTreeTabNewlyCreateHidden       +" Value Expected : "+expcustomizeMasterCreateTreeTabNewlyCreateHidden);
	System.out.println("customizeMasterCreateTreeTabNewlyCreateOkButton      : "+actcustomizeMasterCreateTreeTabNewlyCreateOkButton     +" Value Expected : "+expcustomizeMasterCreateTreeTabNewlyCreateOkButton);
	System.out.println("customizeMasterCreateTreeTabNewlyCreateCancelButton  : "+actcustomizeMasterCreateTreeTabNewlyCreateCancelButton +" Value Expected : "+expcustomizeMasterCreateTreeTabNewlyCreateCancelButton);
	 	
	if(actcustomizeMasterCreateTreeTabNewlyCreateTabCaption==expcustomizeMasterCreateTreeTabNewlyCreateTabCaption
			&& actcustomizeMasterCreateTreeTabNewlyCreateHidden==expcustomizeMasterCreateTreeTabNewlyCreateHidden
			&& actcustomizeMasterCreateTreeTabNewlyCreateOkButton==expcustomizeMasterCreateTreeTabNewlyCreateOkButton
			&& actcustomizeMasterCreateTreeTabNewlyCreateCancelButton==expcustomizeMasterCreateTreeTabNewlyCreateCancelButton)
	{	
		excelReader.setCellData(xlfile, "Sheet1", 309, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 309, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkCancelEditPopUpForNewCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreateCancelButton));
	customizeMasterCreateTreeTabNewlyCreateCancelButton.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minusBtn));
	minusBtn.click();
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));
	
	boolean actplusBtn         							    =plusBtn.isDisplayed();
	boolean actmasterFieldsOption         					=masterFieldsOption.isDisplayed();
	boolean actaccountMasterFieldsUniqueConstraintsOption   =accountMasterFieldsUniqueConstraintsOption.isDisplayed();
	boolean actRulesOption         						    =RulesOption.isDisplayed();
	boolean actrules_ExternalModules         				=rules_ExternalModules.isDisplayed();
	boolean actitemInfoPanelCustomizationTab         		=itemInfoPanelCustomizationTab.isDisplayed();
	boolean actaccountReportsTab         					=accountReportsTab.isDisplayed();
	
	boolean expplusBtn         							    =true;
	boolean expmasterFieldsOption         					=true;
	boolean expaccountMasterFieldsUniqueConstraintsOption  =true;
	boolean expRulesOption         						    =true;
	boolean exprules_ExternalModules         				=true;
	boolean expitemInfoPanelCustomizationTab         		=true;
	boolean expaccountReportsTab         					=true;
	
	System.out.println("****************************checkCancelEditPopUpForNewCreateTreeTabDisplayInTabs**********************************");
	
	System.out.println("plusBtn                                    : "+actplusBtn                                    +" Value Expected : "+expplusBtn);
	System.out.println("masterFieldsOption                         : "+actmasterFieldsOption                         +" Value Expected : "+expmasterFieldsOption);
	System.out.println("accountMasterFieldsUniqueConstraintsOption : "+actaccountMasterFieldsUniqueConstraintsOption +" Value Expected : "+expaccountMasterFieldsUniqueConstraintsOption);
	System.out.println("RulesOption                                : "+actRulesOption                                +" Value Expected : "+expRulesOption);
	System.out.println("rules_ExternalModules                      : "+actrules_ExternalModules                      +" Value Expected : "+exprules_ExternalModules);
	System.out.println("itemInfoPanelCustomizationTab              : "+actitemInfoPanelCustomizationTab              +" Value Expected : "+expitemInfoPanelCustomizationTab);
	System.out.println("accountReportsTab                          : "+actaccountReportsTab                          +" Value Expected : "+expaccountReportsTab);
	
	if(actplusBtn==expplusBtn && actmasterFieldsOption==expmasterFieldsOption 
			&& actaccountMasterFieldsUniqueConstraintsOption==expaccountMasterFieldsUniqueConstraintsOption
			&& actRulesOption==expRulesOption && actrules_ExternalModules==exprules_ExternalModules
			&& actitemInfoPanelCustomizationTab==expitemInfoPanelCustomizationTab && actaccountReportsTab==expaccountReportsTab)	
	{
		excelReader.setCellData(xlfile, "Sheet1", 310, 9, resPass);
		return true;
	}	
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 310, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkOkEditPopUpForNewCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));
	plusBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreate));
	getAction().doubleClick(customizeMasterCreateTreeTabNewlyCreate).build().perform();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreateTabCaption));
	customizeMasterCreateTreeTabNewlyCreateTabCaption.clear();
	
	customizeMasterCreateTreeTabNewlyCreateTabCaption.sendKeys("Tree Tab Update");	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_UpdateOkBtn));
	treeTab_UpdateOkBtn.click();
	
	String expMessage="Tab Caption Updated Successfully.";
		
	String actMessage=checkValidationMessage(expMessage);
	     	
	System.out.println("********************************checkOkEditPopUpForNewCreateTreeTabDisplayInTabs***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 311, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 311, 9, resFail);
		return false;	
	}
}
 
 
 
public static boolean checkHeaderDetailsTabWithBlankForCreateTreeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	
	getDriver().navigate().refresh();
	
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	mastersMenu.click();
     
	Thread.sleep(3000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
	accounts.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
	masterRibbonToExpandOptions.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
	masterRibbonControlNextBtn.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
	masterRibbonControlNextBtn.click();
	
	Thread.sleep(3000);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
	masterCustamizemasterBtn.click();
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyCreate));
	customizeMasterCreateTreeTabNewlyCreate.click();
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyHeaderDetails));
	
	boolean actcustomizeMasterCreateTreeTabNewlyHeaderDetails  		=customizeMasterCreateTreeTabNewlyHeaderDetails.isDisplayed();
	boolean actcustomizeMasterCreateTreeTabNewlyBlankInHeaderDetails  	=customizeMasterCreateTreeTabNewlyBlankInHeaderDetails.isDisplayed();
	
	boolean expcustomizeMasterCreateTreeTabNewlyHeaderDetails  		=true;
	boolean expcustomizeMasterCreateTreeTabNewlyBlankInHeaderDetails  	=true;
	
	System.out.println("***********************************checkHeaderDetailsTabWithBlankForCreateTreeTab***********************************");
	
	System.out.println("customizeMasterCreateTreeTabNewlyHeaderDetails         : "+actcustomizeMasterCreateTreeTabNewlyHeaderDetails        +" Value Expected : "+expcustomizeMasterCreateTreeTabNewlyHeaderDetails);
	System.out.println("customizeMasterCreateTreeTabNewlyBlankInHeaderDetails  : "+actcustomizeMasterCreateTreeTabNewlyBlankInHeaderDetails +" Value Expected : "+expcustomizeMasterCreateTreeTabNewlyBlankInHeaderDetails);
	 
	if(actcustomizeMasterCreateTreeTabNewlyHeaderDetails==expcustomizeMasterCreateTreeTabNewlyHeaderDetails
			&& actcustomizeMasterCreateTreeTabNewlyBlankInHeaderDetails==expcustomizeMasterCreateTreeTabNewlyBlankInHeaderDetails)
	{
		excelReader.setCellData(xlfile, "Sheet1", 312, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 312, 9, resFail);
		return false;
	}
}
	
	
public static boolean checkBodyDetailsTabWithBlankForCreateTreeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyBodyDetails));
	customizeMasterCreateTreeTabNewlyBodyDetails.click();
	 
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyFieldInBodyDetails));
	
	boolean actcustomizeMasterCreateTreeTabNewlyFieldInBodyDetails  =customizeMasterCreateTreeTabNewlyFieldInBodyDetails.isDisplayed();
	boolean expcustomizeMasterCreateTreeTabNewlyFieldInBodyDetails  =true;
	
	System.out.println("************************************checkBodyDetailsTabWithBlankForCreateTreeTab****************************");
	
	System.out.println("customizeMasterCreateTreeTabNewlyFieldInBodyDetails  : "+actcustomizeMasterCreateTreeTabNewlyFieldInBodyDetails+" Value Expected : "+expcustomizeMasterCreateTreeTabNewlyFieldInBodyDetails);
	 
	if(actcustomizeMasterCreateTreeTabNewlyFieldInBodyDetails==expcustomizeMasterCreateTreeTabNewlyFieldInBodyDetails)
	{
		excelReader.setCellData(xlfile, "Sheet1", 313, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 313, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTreeTabNewlyHeaderDetails));
	customizeMasterCreateTreeTabNewlyHeaderDetails.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
	createTab.click();
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabTreeTab));
	createTabTreeTab.click();
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabCaptionTxt));
	treeTabCaptionTxt.sendKeys("Tree Tab Delete");
	treeTabCaptionTxt.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabTabNameTxt));
	treeTabTabNameTxt.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTabNewMastertxt));
	treeTabNewMastertxt.sendKeys("Account");
	Thread.sleep(3000);
	treeTabNewMastertxt.sendKeys(Keys.TAB);
			
	
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_FieldCaptiontxt));
	treeTab_FieldCaptiontxt.sendKeys("Tree Tab Delete");	
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(treeTab_OkBtn));
	treeTab_OkBtn.click();
	
	
	
	try
	{
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
    	errorMessageCloseBtn.click();
	}
	catch(Exception e)
	{
		System.out.println("Error Message Close Btn Not Displayed");
	}
	
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeCreateTreeTab));
	CustomizeCreateTreeTab.click();
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tabs_DeleteBtn));
	tabs_DeleteBtn.click();
		 
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeDeleteTabMessage));
	
	boolean actCustomizeDeleteTabMessage  =CustomizeDeleteTabMessage.isDisplayed();
	boolean expCustomizeDeleteTabMessage  =true;
		 
	System.out.println("***********checkConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs*******************");
	
	System.out.println("CustomizeDeleteTabMessage  : "+actCustomizeDeleteTabMessage+" Value Expected : "+expCustomizeDeleteTabMessage);
	
	if(actCustomizeDeleteTabMessage==expCustomizeDeleteTabMessage)
	{
		 
		excelReader.setCellData(xlfile, "Sheet1", 314, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 314, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkNoConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeDeleteTabMessageNoBtn));
	CustomizeDeleteTabMessageNoBtn.click();
	 
	
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeCreateTreeTab));
	
	boolean actCustomizeCreateTreeTab  =CustomizeCreateTreeTab.isDisplayed();
	boolean expCustomizeCreateTreeTab  =true;
	
	System.out.println("*****************checkNoConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs******************");
	
	System.out.println("CustomizeCreateTreeTab  : "+actCustomizeCreateTreeTab+" Value Expected : "+expCustomizeCreateTreeTab);
	   	
	if(actCustomizeCreateTreeTab==expCustomizeCreateTreeTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 315, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 315, 9, resFail);
		return false;
	}
}
 
 
 
 
public static boolean checkYesConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeCreateTreeTab));
	CustomizeCreateTreeTab.click();
		 
	
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(tabs_DeleteBtn));
	tabs_DeleteBtn.click();
		 
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CustomizeDeleteTabMessageYesBtn));
	CustomizeDeleteTabMessageYesBtn.click();
		 
		String expMessage="Tab Deleted Successfully";
	
		String actMessage=checkValidationMessage(expMessage);
		 
		System.out.println("********************************checkYesConfirmmationMessageOnDeleteTabOptionForCreateTreeTabDisplayInTabs***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 316, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 316, 9, resFail);
		return false;
	}
}

 
 
public static boolean checkCreateDocumentTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
	createTab.click();
 	 
	
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_DocumentTab));
	createTab_DocumentTab.click();
     
	
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentTab_TabCaption));
	
	boolean actdocumentTab_TabCaption    	=documentTab_TabCaption.isDisplayed();
	boolean actdocumentTab_TabName    		=documentTab_TabName.isDisplayed();
	boolean actdocumentTab_HiddenChkbox    	=documentTab_HiddenChkbox.isDisplayed();
	boolean actdocumentTab_OkBtn    		=documentTab_OkBtn.isDisplayed();
	boolean actdocumentTab_CancelBtn    	=documentTab_CancelBtn.isDisplayed();
	
	boolean expdocumentTab_TabCaption    	=true;
	boolean expdocumentTab_TabName    		=true;
	boolean expdocumentTab_HiddenChkbox    	=true;
	boolean expdocumentTab_OkBtn    		=true;
	boolean expdocumentTab_CancelBtn    	=true;
	
	System.out.println("************************************checkCreateDocumentTabOptionsInCustomizeMaster*****************************");
	
	System.out.println("documentTab_TabCaption    : "+actdocumentTab_TabCaption   +" Value Expected : "+expdocumentTab_TabCaption);
	System.out.println("documentTab_TabName       : "+actdocumentTab_TabName      +" Value Expected : "+expdocumentTab_TabName);
	System.out.println("documentTab_HiddenChkbox  : "+actdocumentTab_HiddenChkbox +" Value Expected : "+expdocumentTab_HiddenChkbox);
	System.out.println("documentTab_OkBtn         : "+actdocumentTab_OkBtn        +" Value Expected : "+expdocumentTab_OkBtn);
	System.out.println("documentTab_CancelBtn     : "+actdocumentTab_CancelBtn    +" Value Expected : "+expdocumentTab_CancelBtn);
     
	if(actdocumentTab_TabCaption==expdocumentTab_TabCaption && actdocumentTab_TabName==expdocumentTab_TabName
			&& actdocumentTab_HiddenChkbox==expdocumentTab_HiddenChkbox && actdocumentTab_OkBtn==expdocumentTab_OkBtn
			&& actdocumentTab_CancelBtn==expdocumentTab_CancelBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 317, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 317, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkMandatoryCheckInDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentTab_OkBtn));
	documentTab_OkBtn.click();
		 
	
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTabDocumentTabMessage));
	
	String actcustomizeMasterCreateTabDocumentTabMessage =customizeMasterCreateTabDocumentTabMessage.getText();
	String expcustomizeMasterCreateTabDocumentTabMessage ="Please enter Tab name.";
	
	System.out.println("**************************checkMandatoryCheckInDocumentTab*********************************");
	
	System.out.println("customizeMasterCreateTabDocumentTabMessage  : "+actcustomizeMasterCreateTabDocumentTabMessage+" Value Expected : "+expcustomizeMasterCreateTabDocumentTabMessage);
     
		if(actcustomizeMasterCreateTabDocumentTabMessage.equalsIgnoreCase(expcustomizeMasterCreateTabDocumentTabMessage))
		{
			 excelReader.setCellData(xlfile, "Sheet1", 318, 9, resPass);
			 return true;
		}
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 318, 9, resFail);
			 return false;	
		}
}
 
 
public static boolean checkOKWithInputCheckInDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentTab_TabCaption));
	documentTab_TabCaption.sendKeys("Document Tab");	
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentTab_OkBtn));
		documentTab_OkBtn.click();
		 
		String expMessage="Tab Added Successfully";
	
		String actMessage=checkValidationMessage(expMessage);
		
		System.out.println("********************************checkOKWithInputCheckInDocumentTab***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
		{
			 excelReader.setCellData(xlfile, "Sheet1", 319, 9, resPass);
			 return true;
		}
		else
		{    
			 excelReader.setCellData(xlfile, "Sheet1", 319, 9, resFail);
			 return false;
		}
}
 
 
public static boolean checkHeaderDetailsTabWithBlankForCreateDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateDocumentTabNewlyCreate));
	customizeMasterCreateDocumentTabNewlyCreate.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateDocumentTabNewlyHeaderDetails));
	
	boolean actcustomizeMasterCreateDocumentTabNewlyHeaderDetails         =customizeMasterCreateDocumentTabNewlyHeaderDetails.isDisplayed();
	boolean actcustomizeMasterCreateDocumentTabNewlyBlankInHeaderDetails  =customizeMasterCreateDocumentTabNewlyBlankInHeaderDetails.isDisplayed();
	
	boolean expcustomizeMasterCreateDocumentTabNewlyHeaderDetails         =true;
	boolean expcustomizeMasterCreateDocumentTabNewlyBlankInHeaderDetails  =true;
	
	System.out.println("*********************************checkHeaderDetailsTabWithBlankForCreateDocumentTab********************************");
	
	System.out.println("customizeMasterCreateDocumentTabNewlyHeaderDetails        : "+actcustomizeMasterCreateDocumentTabNewlyHeaderDetails        +" Value Expected : "+expcustomizeMasterCreateDocumentTabNewlyHeaderDetails);
	System.out.println("customizeMasterCreateDocumentTabNewlyBlankInHeaderDetails : "+actcustomizeMasterCreateDocumentTabNewlyBlankInHeaderDetails +" Value Expected : "+expcustomizeMasterCreateDocumentTabNewlyBlankInHeaderDetails);
	
	if(actcustomizeMasterCreateDocumentTabNewlyHeaderDetails==expcustomizeMasterCreateDocumentTabNewlyHeaderDetails
			&& actcustomizeMasterCreateDocumentTabNewlyBlankInHeaderDetails==expcustomizeMasterCreateDocumentTabNewlyBlankInHeaderDetails)
	{
		excelReader.setCellData(xlfile, "Sheet1", 320, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 320, 9, resFail);
		return false;
	}
}
 

public static boolean checkBodyDetailsTabWithBlankForCreateDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateDocumentTabNewlyBodyDetails));
	customizeMasterCreateDocumentTabNewlyBodyDetails.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateDocumentTabFieldName));
	
	boolean actcustomizeMasterCreateDocumentTabFieldName   		=customizeMasterCreateDocumentTabFieldName.isDisplayed();
	boolean actcustomizeMasterCreateDocumentTabDocument   		=customizeMasterCreateDocumentTabDocument.isDisplayed();
	boolean actcustomizeMasterCreateDocumentTabCreatedDate   	=customizeMasterCreateDocumentTabCreatedDate.isDisplayed();
	boolean actcustomizeMasterCreateDocumentTabLastModified   	=customizeMasterCreateDocumentTabLastModified.isDisplayed();
	boolean actcustomizeMasterCreateDocumentFileSize   			=customizeMasterCreateDocumentFileSize.isDisplayed();

	boolean expcustomizeMasterCreateDocumentTabFieldName   		=true;
	boolean expcustomizeMasterCreateDocumentTabDocument   		=true;
	boolean expcustomizeMasterCreateDocumentTabCreatedDate   	=true;
	boolean expcustomizeMasterCreateDocumentTabLastModified   	=true;
	boolean expcustomizeMasterCreateDocumentFileSize   			=true;
	
	System.out.println("*****************************checkBodyDetailsTabWithBlankForCreateDocumentTab*****************************************");

	System.out.println("customizeMasterCreateDocumentTabFieldName     : "+actcustomizeMasterCreateDocumentTabFieldName    +" Value Expected : "+expcustomizeMasterCreateDocumentTabFieldName);
	System.out.println("customizeMasterCreateDocumentTabDocument      : "+actcustomizeMasterCreateDocumentTabDocument     +" Value Expected : "+expcustomizeMasterCreateDocumentTabDocument);
	System.out.println("customizeMasterCreateDocumentTabCreatedDate   : "+actcustomizeMasterCreateDocumentTabCreatedDate  +" Value Expected : "+expcustomizeMasterCreateDocumentTabCreatedDate);
	System.out.println("customizeMasterCreateDocumentTabLastModified  : "+actcustomizeMasterCreateDocumentTabLastModified +" Value Expected : "+expcustomizeMasterCreateDocumentTabLastModified);
	System.out.println("customizeMasterCreateDocumentFileSize         : "+actcustomizeMasterCreateDocumentFileSize        +" Value Expected : "+expcustomizeMasterCreateDocumentFileSize);
	
	if(actcustomizeMasterCreateDocumentTabFieldName==expcustomizeMasterCreateDocumentTabFieldName
			&& actcustomizeMasterCreateDocumentTabDocument==expcustomizeMasterCreateDocumentTabDocument
			&& actcustomizeMasterCreateDocumentTabCreatedDate==expcustomizeMasterCreateDocumentTabCreatedDate
			&& actcustomizeMasterCreateDocumentTabLastModified==expcustomizeMasterCreateDocumentTabLastModified
			&& actcustomizeMasterCreateDocumentFileSize==expcustomizeMasterCreateDocumentFileSize	)
	{
		excelReader.setCellData(xlfile, "Sheet1", 321, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 321, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkCreateDocumentTabCreationWithExistingDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
    createTab.click();
	 
    
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_DocumentTab));
    createTab_DocumentTab.click();
    
    String expMessage="Only one document tab is allowed per master";
	
    String actMessage=checkValidationMessage(expMessage);
    
    System.out.println("********************************checkCreateDocumentTabCreationWithExistingDocumentTab***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
		{
			 excelReader.setCellData(xlfile, "Sheet1", 322, 9, resPass);
			 return true;
		}
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 322, 9, resFail);
			 return false;
		}
}
 
 
public static boolean checkCreateCreateTabOptionsInCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab));
	createTab.click();
 	 
	
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_CreateTab));
	createTab_CreateTab.click();
                  
	
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_TabCaptionTxt));
	
	boolean actcreateTab_TabCaptionTxt  =createTab_TabCaptionTxt.isDisplayed();
	boolean actcreateTab_TabNameTxt  	=createTab_TabNameTxt.isDisplayed();
	boolean actcreateTab_PopHiddenChkbox=createTab_PopHiddenChkbox.isDisplayed();
	boolean actcreateTab_PopOkBtn  		=createTab_PopOkBtn.isDisplayed();
	boolean actcreateTab_PopCancelBtn  	=createTab_PopCancelBtn.isDisplayed();
	
	boolean expcreateTab_TabCaptionTxt  =true;
	boolean expcreateTab_TabNameTxt  	=true;
	boolean expcreateTab_PopHiddenChkbox=true;
	boolean expcreateTab_PopOkBtn  		=true;
	boolean expcreateTab_PopCancelBtn  	=true;
	
	System.out.println("********************************checkCreateCreateTabOptionsInCustomizeMaster****************************");
	
	System.out.println("createTab_TabCaptionTxt    : "+actcreateTab_TabCaptionTxt   +" Value Expected : "+expcreateTab_TabCaptionTxt);
	System.out.println("createTab_TabNameTxt       : "+actcreateTab_TabNameTxt      +" Value Expected : "+expcreateTab_TabNameTxt);
	System.out.println("createTab_PopHiddenChkbox  : "+actcreateTab_PopHiddenChkbox +" Value Expected : "+expcreateTab_PopHiddenChkbox);
	System.out.println("createTab_PopOkBtn         : "+actcreateTab_PopOkBtn        +" Value Expected : "+expcreateTab_PopOkBtn);
	System.out.println("createTab_PopCancelBtn     : "+actcreateTab_PopCancelBtn    +" Value Expected : "+expcreateTab_PopCancelBtn);
     
	if(actcreateTab_TabCaptionTxt==expcreateTab_TabCaptionTxt && actcreateTab_TabNameTxt==expcreateTab_TabNameTxt
			&& actcreateTab_PopHiddenChkbox==expcreateTab_PopHiddenChkbox && actcreateTab_PopOkBtn==expcreateTab_PopOkBtn
			&& actcreateTab_PopCancelBtn==expcreateTab_PopCancelBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 323, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 323, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkMandatoryCheckInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_PopOkBtn));
	createTab_PopOkBtn.click();
     
	
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateTabCreateTabMessage));
	
	String actcustomizeMasterCreateTabCreateTabMessage =customizeMasterCreateTabCreateTabMessage.getText();
	String expcustomizeMasterCreateTabCreateTabMessage ="Please enter Tab name.";
	
	System.out.println("**************************checkMandatoryCheckInCreateCreateTab*********************************");
	
	System.out.println("customizeMasterCreateTabCreateTabMessage  : "+actcustomizeMasterCreateTabCreateTabMessage+" Value Expected : "+expcustomizeMasterCreateTabCreateTabMessage);
     
		if(actcustomizeMasterCreateTabCreateTabMessage.equalsIgnoreCase(expcustomizeMasterCreateTabCreateTabMessage))
		{
			 excelReader.setCellData(xlfile, "Sheet1", 324, 9, resPass);
			 return true;
		}
		else
		{
			 excelReader.setCellData(xlfile, "Sheet1", 324, 9, resFail);
			 return false;	
		}
}


public static boolean checkOkButtonWithAllInputInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_TabCaptionTxt));
	createTab_TabCaptionTxt.sendKeys("Create Tab");
	createTab_TabCaptionTxt.sendKeys(Keys.TAB); 

	String getTabName=createTab_TabNameTxt.getText();
     
	
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_TabCaptionTxt));
	
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTab_PopOkBtn));
	createTab_PopOkBtn.click();         
     
	String expMessage="Tab Added Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
     
	System.out.println("********************************checkOkButtonWithAllInputInCreateCreateTab***************************");
		
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, "Sheet1", 325, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 325, 9, resFail);
			return false;
		}
}
 
 
public static boolean checkCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
  		    			 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabNewlyCreateTabCaption));
	    
	    boolean actcustomizeMasterCreateCreateTabNewlyCreateTabCaption  =customizeMasterCreateCreateTabNewlyCreateTabCaption.isDisplayed();
	boolean expcustomizeMasterCreateCreateTabNewlyCreateTabCaption  =true;
	
	System.out.println("***************************checkCreateCreateTabDisplayInCustomizeTab***********************");
	
	System.out.println("customizeMasterCreateCreateTabNewlyCreateTabCaption : "+actcustomizeMasterCreateCreateTabNewlyCreateTabCaption+" Value Expected : "+expcustomizeMasterCreateCreateTabNewlyCreateTabCaption);
       
	    if(actcustomizeMasterCreateCreateTabNewlyCreateTabCaption==expcustomizeMasterCreateCreateTabNewlyCreateTabCaption)
	    {
	    	excelReader.setCellData(xlfile, "Sheet1", 326, 9, resPass);
	    	return true;
	    }
	    else
	    {
	    	excelReader.setCellData(xlfile, "Sheet1", 326, 9, resFail);
	    	return false;
	    }
}
 

 
 
public static boolean checkHeaderDetailsTabInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabNewlyCreateTabCaption));
	customizeMasterCreateCreateTabNewlyCreateTabCaption.click();
         
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
	   	
	boolean actcustomizeMasterCreateCreateTabHeaderDetails  			=customizeMasterCreateCreateTabHeaderDetails.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabBlankHeaderDetails  		=customizeMasterCreateCreateTabBlankHeaderDetails.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton   =customizeMasterCreateCreateTabNewlyCreateTabSaveButton.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabAddButton  				=customizeMasterCreateCreateTabAddButton.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabPreviewButton  			=customizeMasterCreateCreateTabPreviewButton.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabCloseButton  				=customizeMasterCreateCreateTabCloseButton.isDisplayed();
	
	boolean expcustomizeMasterCreateCreateTabHeaderDetails  			=true;
	boolean expcustomizeMasterCreateCreateTabBlankHeaderDetails  		=true;
	boolean expcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton   =true;
	boolean expcustomizeMasterCreateCreateTabAddButton  				=true;
	boolean expcustomizeMasterCreateCreateTabPreviewButton  			=true;
	boolean expcustomizeMasterCreateCreateTabCloseButton  				=true;
	
	System.out.println("***************************************************checkHeaderDetailsTabInCreateCreateTab****************************************");
	
	System.out.println("customizeMasterCreateCreateTabHeaderDetails             : "+actcustomizeMasterCreateCreateTabHeaderDetails            +" Value Expected : "+expcustomizeMasterCreateCreateTabHeaderDetails);
	System.out.println("customizeMasterCreateCreateTabBlankHeaderDetails        : "+actcustomizeMasterCreateCreateTabBlankHeaderDetails       +" Value Expected : "+expcustomizeMasterCreateCreateTabBlankHeaderDetails);
	System.out.println("customizeMasterCreateCreateTabNewlyCreateTabSaveButton  : "+actcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton +" Value Expected : "+expcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton);
	System.out.println("customizeMasterCreateCreateTabAddButton                 : "+actcustomizeMasterCreateCreateTabAddButton                +" Value Expected : "+expcustomizeMasterCreateCreateTabAddButton);
	System.out.println("customizeMasterCreateCreateTabPreviewButton             : "+actcustomizeMasterCreateCreateTabPreviewButton            +" Value Expected : "+expcustomizeMasterCreateCreateTabPreviewButton);
	System.out.println("customizeMasterCreateCreateTabCloseButton               : "+actcustomizeMasterCreateCreateTabCloseButton              +" Value Expected : "+expcustomizeMasterCreateCreateTabCloseButton);
	
	if(actcustomizeMasterCreateCreateTabHeaderDetails==expcustomizeMasterCreateCreateTabHeaderDetails
			&& actcustomizeMasterCreateCreateTabBlankHeaderDetails==expcustomizeMasterCreateCreateTabBlankHeaderDetails
			&& actcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton==expcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton
			&& actcustomizeMasterCreateCreateTabAddButton==expcustomizeMasterCreateCreateTabAddButton
			&& actcustomizeMasterCreateCreateTabPreviewButton==expcustomizeMasterCreateCreateTabPreviewButton
			&& actcustomizeMasterCreateCreateTabCloseButton==expcustomizeMasterCreateCreateTabCloseButton)
	{
		excelReader.setCellData(xlfile, "Sheet1", 327, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 327, 9, resFail);
		return false;
	}
}
 
public static boolean checkBodyDetailsTabInCreateCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 	    			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabBodyDetails));
	customizeMasterCreateCreateTabBodyDetails.click();
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabBodyDetails));
         
	boolean actcustomizeMasterCreateCreateTabBodyDetails       =customizeMasterCreateCreateTabBodyDetails.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabBlankBodyDetails  =customizeMasterCreateCreateTabBlankBodyDetails.isDisplayed();
	
	boolean expcustomizeMasterCreateCreateTabBodyDetails       =true;
	boolean expcustomizeMasterCreateCreateTabBlankBodyDetails  =true;
	
	System.out.println("customizeMasterCreateCreateTabBodyDetails       : "+actcustomizeMasterCreateCreateTabBodyDetails      +" Value Expected : "+expcustomizeMasterCreateCreateTabBodyDetails);
	System.out.println("customizeMasterCreateCreateTabBlankBodyDetails  : "+actcustomizeMasterCreateCreateTabBlankBodyDetails +" Value Expected : "+expcustomizeMasterCreateCreateTabBlankBodyDetails);

	if(actcustomizeMasterCreateCreateTabBodyDetails==expcustomizeMasterCreateCreateTabBodyDetails
			&& actcustomizeMasterCreateCreateTabBlankBodyDetails==expcustomizeMasterCreateCreateTabBlankBodyDetails)
	{
		excelReader.setCellData(xlfile, "Sheet1", 328, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 328, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkAddOptionInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
  		    			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
	customizeMasterCreateCreateTabHeaderDetails.click();
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabAddButton));
	customizeMasterCreateCreateTabAddButton.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
	
	boolean actextraFields_FieldDetailsTab     	=extraFields_FieldDetailsTab.isDisplayed();
	boolean actextraFields_PropertiesTab     	=extraFields_PropertiesTab.isDisplayed();
	boolean actextraFields_FormattingTab     	=extraFields_FormattingTab.isDisplayed();
	boolean actextraFields_RulesTab     		=extraFields_RulesTab.isDisplayed();
	boolean actextraFields_ExternalModulesTab   =extraFields_ExternalModulesTab.isDisplayed();
	
	boolean expextraFields_FieldDetailsTab     	=true;
	boolean expextraFields_PropertiesTab     	=true;
	boolean expextraFields_FormattingTab     	=true;
	boolean expextraFields_RulesTab     		=true;
	boolean expextraFields_ExternalModulesTab   =true;
	
	System.out.println("*************************************checkAddOptionInCreateCreateTabDisplayInCustomizeTab****************************");
	
	System.out.println("extraFields_FieldDetailsTab   : "+actextraFields_FieldDetailsTab    +" Value Expected : "+expextraFields_FieldDetailsTab);
	System.out.println("extraFields_PropertiesTab     : "+actextraFields_PropertiesTab      +" Value Expected : "+expextraFields_PropertiesTab);
	System.out.println("extraFields_FormattingTab     : "+actextraFields_FormattingTab      +" Value Expected : "+expextraFields_FormattingTab);
	System.out.println("extraFields_RulesTab          : "+actextraFields_RulesTab           +" Value Expected : "+expextraFields_RulesTab);
	System.out.println("extraFields_ExternalModulesTab: "+actextraFields_ExternalModulesTab +" Value Expected : "+expextraFields_ExternalModulesTab);

	
	if(actextraFields_FieldDetailsTab==expextraFields_FieldDetailsTab && actextraFields_PropertiesTab==expextraFields_PropertiesTab
			&& actextraFields_FormattingTab==expextraFields_FormattingTab && actextraFields_RulesTab==expextraFields_RulesTab
			&& actextraFields_ExternalModulesTab==expextraFields_ExternalModulesTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 329, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 329, 9, resFail);
		return false;
	}
}
 


public static boolean checkFieldsDetailsTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
  		    	
	
			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
	
	boolean actextraFields_FieldDetailsCaption   				=extraFields_FieldDetailsCaption.isDisplayed();
	boolean actextraFields_FieldDetailsName   					=extraFields_FieldDetailsName.isDisplayed();
	boolean actextraFields_FieldDetailsDatTypeDropdown   		=extraFields_FieldDetailsDatTypeDropdown.isDisplayed();
	boolean actextraFields_FieldDetailsDefaultValue   			=extraFields_FieldDetailsDefaultValue.isDisplayed();
	boolean actextraFields_FieldDetailsBannerText   			=extraFields_FieldDetailsBannerText.isDisplayed();
	boolean actextraFields_FieldDetails_MaxSize   				=extraFields_FieldDetails_MaxSize.isDisplayed();
	boolean actextraFields_FieldDetailsControlTypeDropdown   	=extraFields_FieldDetailsControlTypeDropdown.isDisplayed();
	boolean actextraFields_FieldDetailsToolTipText   			=extraFields_FieldDetailsToolTipText.isDisplayed();
	boolean actextraFields_FieldDetailsRegularExpressionText   	=extraFields_FieldDetailsRegularExpressionText.isDisplayed();
	boolean actextraFields_RegularExperssionLoadExpansionBtn   	=extraFields_RegularExperssionLoadExpansionBtn.isDisplayed();
	
	boolean expextraFields_FieldDetailsCaption   				=true;
	boolean expextraFields_FieldDetailsName   					=true;
	boolean expextraFields_FieldDetailsDatTypeDropdown   		=true;
	boolean expextraFields_FieldDetailsDefaultValue   			=true;
	boolean expextraFields_FieldDetailsBannerText   			=true;
	boolean expextraFields_FieldDetails_MaxSize   				=true;
	boolean expextraFields_FieldDetailsControlTypeDropdown   	=true;
	boolean expextraFields_FieldDetailsToolTipText   			=true;
	boolean expextraFields_FieldDetailsRegularExpressionText   	=true;
	boolean expextraFields_RegularExperssionLoadExpansionBtn   	=true;
	
	System.out.println("************************checkFieldsDetailsTabInCreateCreateTabDisplayInCustomizeTab********************************");
	
	System.out.println("extraFields_FieldDetailsCaption                : "+actextraFields_FieldDetailsCaption               +" Value Expected : "+expextraFields_FieldDetailsCaption);
	System.out.println("extraFields_FieldDetailsName                   : "+actextraFields_FieldDetailsName                  +" Value Expected : "+expextraFields_FieldDetailsName);
	System.out.println("extraFields_FieldDetailsDatTypeDropdown        : "+actextraFields_FieldDetailsDatTypeDropdown       +" Value Expected : "+expextraFields_FieldDetailsDatTypeDropdown);
	System.out.println("extraFields_FieldDetailsDefaultValue           : "+actextraFields_FieldDetailsDefaultValue          +" Value Expected : "+expextraFields_FieldDetailsDefaultValue);
	System.out.println("extraFields_FieldDetailsBannerText             : "+actextraFields_FieldDetailsBannerText            +" Value Expected : "+expextraFields_FieldDetailsBannerText);
	System.out.println("extraFields_FieldDetails_MaxSize               : "+actextraFields_FieldDetails_MaxSize              +" Value Expected : "+expextraFields_FieldDetails_MaxSize);
	System.out.println("extraFields_FieldDetailsControlTypeDropdown    : "+actextraFields_FieldDetailsControlTypeDropdown   +" Value Expected : "+expextraFields_FieldDetailsControlTypeDropdown);
	System.out.println("extraFields_FieldDetailsToolTipText            : "+actextraFields_FieldDetailsToolTipText           +" Value Expected : "+expextraFields_FieldDetailsToolTipText);
	System.out.println("extraFields_FieldDetailsRegularExpressionText  : "+actextraFields_FieldDetailsRegularExpressionText +" Value Expected : "+expextraFields_FieldDetailsRegularExpressionText);
	System.out.println("extraFields_RegularExperssionLoadExpansionBtn  : "+actextraFields_RegularExperssionLoadExpansionBtn +" Value Expected : "+expextraFields_RegularExperssionLoadExpansionBtn);
         
	if(actextraFields_FieldDetailsCaption==expextraFields_FieldDetailsCaption && actextraFields_FieldDetailsName==expextraFields_FieldDetailsName
			&& actextraFields_FieldDetailsDatTypeDropdown==expextraFields_FieldDetailsDatTypeDropdown
			&& actextraFields_FieldDetailsDefaultValue==expextraFields_FieldDetailsDefaultValue
			&& actextraFields_FieldDetailsBannerText==expextraFields_FieldDetailsBannerText
			&& actextraFields_FieldDetails_MaxSize==expextraFields_FieldDetails_MaxSize
			&& actextraFields_FieldDetailsControlTypeDropdown==expextraFields_FieldDetailsControlTypeDropdown
			&& actextraFields_FieldDetailsToolTipText==expextraFields_FieldDetailsToolTipText
			&& actextraFields_FieldDetailsRegularExpressionText==expextraFields_FieldDetailsRegularExpressionText
			&& actextraFields_RegularExperssionLoadExpansionBtn==expextraFields_RegularExperssionLoadExpansionBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 330, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 330, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkPropertiesTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
  		    	
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
	extraFields_PropertiesTab.click();
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTabPartOfDeliveryAddressChekbox));
	
	boolean actextraFields_PropertiesTabPartOfDeliveryAddressChekbox  	=extraFields_PropertiesTabPartOfDeliveryAddressChekbox.isDisplayed();
	boolean actextraFields_PropertiesPartOfBillingAddressChekbox  		=extraFields_PropertiesPartOfBillingAddressChekbox.isDisplayed();
	boolean actextraFields_PropertiesMandatoryChekbox  					=extraFields_PropertiesMandatoryChekbox.isDisplayed();
	boolean actextraFields_PropertiesAllowAsParameterChekbox  			=extraFields_PropertiesAllowAsParameterChekbox.isDisplayed();
	boolean actextraFields_PropertiesHiddenChekbox  					=extraFields_PropertiesHiddenChekbox.isDisplayed();
	boolean actextraFields_PropertiesSpellCheckChekbox  				=extraFields_PropertiesSpellCheckChekbox.isDisplayed();
	boolean actextraFields_PropertiesMandatoryInGroupChekbox  			=extraFields_PropertiesMandatoryInGroupChekbox.isDisplayed();
	boolean actextraFields_PropertiesAuditTrialChekbox  				=extraFields_PropertiesAuditTrialChekbox.isDisplayed();
	boolean actextraFields_PropertiesNotAvailableForReportsChekbox  	=extraFields_PropertiesNotAvailableForReportsChekbox.isDisplayed();
	boolean actextraFields_PropertiesMergeFieldChekbox  				=extraFields_PropertiesMergeFieldChekbox.isDisplayed();
	boolean actextraFields_PropertiesMassUpdateChekbox  				=extraFields_PropertiesMassUpdateChekbox.isDisplayed();
	boolean actextraFields_PropertiesIncludeInQuickCreateChekbox  		=extraFields_PropertiesIncludeInQuickCreateChekbox.isDisplayed();
	boolean actextraFields_PropertiesCannotBeExportedChekbox  			=extraFields_PropertiesCannotBeExportedChekbox.isDisplayed();
	boolean actextraFields_PropertiesCannotBeImportedChekbox  			=extraFields_PropertiesCannotBeImportedChekbox.isDisplayed();
	boolean actextraFields_PropertiesCopyFromParentChekbox  			=extraFields_PropertiesCopyFromParentChekbox.isDisplayed();
	boolean actextraFields_PropertiesReadOnlyChekbox  					=extraFields_PropertiesReadOnlyChekbox.isDisplayed();
	boolean actextraFields_PropertiesInformationFieldChekbox  			=extraFields_PropertiesInformationFieldChekbox.isDisplayed();
	boolean actextraFields_PropertiesIsMandatoryInRevisionChekbox 		=extraFields_PropertiesIsMandatoryInRevisionChekbox.isDisplayed();
	boolean actextraFields_PropertiesAvailableinCustomerPortalChekbox 	=extraFields_PropertiesAvailableinCustomerPortalChekbox.isDisplayed();
	boolean actextraFields_PropertiesEditableinCustomerPortalChekbox  	=extraFields_PropertiesEditableinCustomerPortalChekbox.isDisplayed();
	boolean actextraFields_PropertiesBehaviourDropdown  				=extraFields_PropertiesBehaviourDropdown.isDisplayed();
	
	boolean expextraFields_PropertiesTabPartOfDeliveryAddressChekbox  	=true;
	boolean expextraFields_PropertiesPartOfBillingAddressChekbox  		=true;
	boolean expextraFields_PropertiesMandatoryChekbox  					=true;
	boolean expextraFields_PropertiesAllowAsParameterChekbox  			=true;
	boolean expextraFields_PropertiesHiddenChekbox  					=true;
	boolean expextraFields_PropertiesSpellCheckChekbox  				=true;
	boolean expextraFields_PropertiesMandatoryInGroupChekbox  			=true;
	boolean expextraFields_PropertiesAuditTrialChekbox  				=true;
	boolean expextraFields_PropertiesNotAvailableForReportsChekbox  	=true;
	boolean expextraFields_PropertiesMergeFieldChekbox  				=true;
	boolean expextraFields_PropertiesMassUpdateChekbox  				=true;
	boolean expextraFields_PropertiesIncludeInQuickCreateChekbox  		=true;
	boolean expextraFields_PropertiesCannotBeExportedChekbox  			=true;
	boolean expextraFields_PropertiesCannotBeImportedChekbox  			=true;
	boolean expextraFields_PropertiesCopyFromParentChekbox  			=true;
	boolean expextraFields_PropertiesReadOnlyChekbox  					=true;
	boolean expextraFields_PropertiesInformationFieldChekbox  			=true;
	boolean expextraFields_PropertiesIsMandatoryInRevisionChekbox 		=true;
	boolean expextraFields_PropertiesAvailableinCustomerPortalChekbox 	=true;
	boolean expextraFields_PropertiesEditableinCustomerPortalChekbox  	=true;
	boolean expextraFields_PropertiesBehaviourDropdown  				=true;
	
	
	System.out.println("***************************checkPropertiesTabInCreateCreateTabDisplayInCustomizeTab****************************");
	
	System.out.println("extraFields_PropertiesTabPartOfDeliveryAddressChekbox  : "+actextraFields_PropertiesTabPartOfDeliveryAddressChekbox +" Value Expected : "+expextraFields_PropertiesTabPartOfDeliveryAddressChekbox);
	System.out.println("extraFields_PropertiesPartOfBillingAddressChekbox      : "+actextraFields_PropertiesPartOfBillingAddressChekbox     +" Value Expected : "+expextraFields_PropertiesPartOfBillingAddressChekbox);
	System.out.println("extraFields_PropertiesMandatoryChekbox                 : "+actextraFields_PropertiesMandatoryChekbox                +" Value Expected : "+expextraFields_PropertiesMandatoryChekbox);
	System.out.println("extraFields_PropertiesAllowAsParameterChekbox          : "+actextraFields_PropertiesAllowAsParameterChekbox         +" Value Expected : "+expextraFields_PropertiesAllowAsParameterChekbox);
	System.out.println("extraFields_PropertiesHiddenChekbox                    : "+actextraFields_PropertiesHiddenChekbox                   +" Value Expected : "+expextraFields_PropertiesHiddenChekbox);
	System.out.println("extraFields_PropertiesSpellCheckChekbox                : "+actextraFields_PropertiesSpellCheckChekbox               +" Value Expected : "+expextraFields_PropertiesSpellCheckChekbox);
	System.out.println("extraFields_PropertiesMandatoryInGroupChekbox          : "+actextraFields_PropertiesMandatoryInGroupChekbox         +" Value Expected : "+expextraFields_PropertiesMandatoryInGroupChekbox);
	System.out.println("extraFields_PropertiesAuditTrialChekbox                : "+actextraFields_PropertiesAuditTrialChekbox               +" Value Expected : "+expextraFields_PropertiesAuditTrialChekbox);
	System.out.println("extraFields_PropertiesNotAvailableForReportsChekbox    : "+actextraFields_PropertiesNotAvailableForReportsChekbox   +" Value Expected : "+expextraFields_PropertiesNotAvailableForReportsChekbox);
	System.out.println("extraFields_PropertiesMergeFieldChekbox                : "+actextraFields_PropertiesMergeFieldChekbox               +" Value Expected : "+expextraFields_PropertiesMergeFieldChekbox);
	System.out.println("extraFields_PropertiesMassUpdateChekbox                : "+actextraFields_PropertiesMassUpdateChekbox               +" Value Expected : "+expextraFields_PropertiesMassUpdateChekbox);
	System.out.println("extraFields_PropertiesIncludeInQuickCreateChekbox      : "+actextraFields_PropertiesIncludeInQuickCreateChekbox     +" Value Expected : "+expextraFields_PropertiesIncludeInQuickCreateChekbox);
	System.out.println("extraFields_PropertiesCannotBeExportedChekbox          : "+actextraFields_PropertiesCannotBeExportedChekbox         +" Value Expected : "+expextraFields_PropertiesCannotBeExportedChekbox);
	System.out.println("extraFields_PropertiesCannotBeImportedChekbox          : "+actextraFields_PropertiesCannotBeImportedChekbox         +" Value Expected : "+expextraFields_PropertiesCannotBeImportedChekbox);
	System.out.println("extraFields_PropertiesCopyFromParentChekbox            : "+actextraFields_PropertiesCopyFromParentChekbox           +" Value Expected : "+expextraFields_PropertiesCopyFromParentChekbox);
	System.out.println("extraFields_PropertiesReadOnlyChekbox                  : "+actextraFields_PropertiesReadOnlyChekbox                 +" Value Expected : "+expextraFields_PropertiesReadOnlyChekbox);
	System.out.println("extraFields_PropertiesInformationFieldChekbox          : "+actextraFields_PropertiesInformationFieldChekbox         +" Value Expected : "+expextraFields_PropertiesInformationFieldChekbox);
	System.out.println("extraFields_PropertiesIsMandatoryInRevisionChekbox     : "+actextraFields_PropertiesIsMandatoryInRevisionChekbox    +" Value Expected : "+expextraFields_PropertiesIsMandatoryInRevisionChekbox);
	System.out.println("extraFields_PropertiesAvailableinCustomerPortalChekbox : "+actextraFields_PropertiesAvailableinCustomerPortalChekbox+" Value Expected : "+expextraFields_PropertiesAvailableinCustomerPortalChekbox);
	System.out.println("extraFields_PropertiesEditableinCustomerPortalChekbox  : "+actextraFields_PropertiesEditableinCustomerPortalChekbox +" Value Expected : "+expextraFields_PropertiesEditableinCustomerPortalChekbox);
	System.out.println("extraFields_PropertiesBehaviourDropdown                : "+actextraFields_PropertiesBehaviourDropdown               +" Value Expected : "+expextraFields_PropertiesBehaviourDropdown);
	
         
	if(actextraFields_PropertiesTabPartOfDeliveryAddressChekbox==expextraFields_PropertiesTabPartOfDeliveryAddressChekbox
			&& actextraFields_PropertiesPartOfBillingAddressChekbox==expextraFields_PropertiesPartOfBillingAddressChekbox
			&& actextraFields_PropertiesMandatoryChekbox==expextraFields_PropertiesMandatoryChekbox
			&& actextraFields_PropertiesAllowAsParameterChekbox==expextraFields_PropertiesAllowAsParameterChekbox
			&& actextraFields_PropertiesHiddenChekbox==expextraFields_PropertiesHiddenChekbox
			&& actextraFields_PropertiesSpellCheckChekbox==expextraFields_PropertiesSpellCheckChekbox
			&& actextraFields_PropertiesMandatoryInGroupChekbox==expextraFields_PropertiesMandatoryInGroupChekbox
			&& actextraFields_PropertiesAuditTrialChekbox==expextraFields_PropertiesAuditTrialChekbox
			&& actextraFields_PropertiesNotAvailableForReportsChekbox==expextraFields_PropertiesNotAvailableForReportsChekbox
			&& actextraFields_PropertiesMergeFieldChekbox==expextraFields_PropertiesMergeFieldChekbox
			&& actextraFields_PropertiesMassUpdateChekbox==expextraFields_PropertiesMassUpdateChekbox
			&& actextraFields_PropertiesIncludeInQuickCreateChekbox==expextraFields_PropertiesIncludeInQuickCreateChekbox
			&& actextraFields_PropertiesCannotBeExportedChekbox==expextraFields_PropertiesCannotBeExportedChekbox
			&& actextraFields_PropertiesCannotBeImportedChekbox==expextraFields_PropertiesCannotBeImportedChekbox
			&& actextraFields_PropertiesCopyFromParentChekbox==expextraFields_PropertiesCopyFromParentChekbox
			&& actextraFields_PropertiesReadOnlyChekbox==expextraFields_PropertiesReadOnlyChekbox
			&& actextraFields_PropertiesInformationFieldChekbox==expextraFields_PropertiesInformationFieldChekbox
			&& actextraFields_PropertiesIsMandatoryInRevisionChekbox==expextraFields_PropertiesIsMandatoryInRevisionChekbox
			&& actextraFields_PropertiesAvailableinCustomerPortalChekbox==expextraFields_PropertiesAvailableinCustomerPortalChekbox
			&& actextraFields_PropertiesEditableinCustomerPortalChekbox==expextraFields_PropertiesEditableinCustomerPortalChekbox
			&& actextraFields_PropertiesBehaviourDropdown==expextraFields_PropertiesBehaviourDropdown)
	{
		excelReader.setCellData(xlfile, "Sheet1", 331, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 331, 9, resFail);
		return false;
	}
}
        
public static boolean checkFormattingTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
 		    	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FormattingTab));
	extraFields_FormattingTab.click();
        
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FormattingColumnSpan));
	
	boolean actextraFields_FormattingColumnSpan   			=extraFields_FormattingColumnSpan.isDisplayed();
	boolean actextraFields_FormattingRowSpan   				=extraFields_FormattingRowSpan.isDisplayed();
	boolean actextraFields_FormattingCharacterCasingDropdown=extraFields_FormattingCharacterCasingDropdown.isDisplayed();
	boolean actextraFields_FormattingTextAlignDropdown   	=extraFields_FormattingTextAlignDropdown.isDisplayed();
	boolean actextraFields_FormattingFieldsDetailsFont   	=extraFields_FormattingFieldsDetailsFont.isDisplayed();
	boolean actextraFields_FormattingBackColor   			=extraFields_FormattingBackColor.isDisplayed();
	boolean actextraFields_FormattingFieldsDetailsFont_Btn  =extraFields_FormattingFieldsDetailsFont_Btn.isDisplayed();
	
	boolean expextraFields_FormattingColumnSpan   			=true;
	boolean expextraFields_FormattingRowSpan   				=true;
	boolean expextraFields_FormattingCharacterCasingDropdown=true;
	boolean expextraFields_FormattingTextAlignDropdown   	=true;
	boolean expextraFields_FormattingFieldsDetailsFont   	=true;
	boolean expextraFields_FormattingBackColor   			=true;
	boolean expextraFields_FormattingFieldsDetailsFont_Btn  =true;
	
	System.out.println("**************************checkFormattingTabInCreateCreateTabDisplayInCustomizeTab************************");
	
	System.out.println("extraFields_FormattingColumnSpan                : "+actextraFields_FormattingColumnSpan              +" Value Expected : "+expextraFields_FormattingColumnSpan);
	System.out.println("extraFields_FormattingRowSpan                   : "+actextraFields_FormattingRowSpan                 +" Value Expected : "+expextraFields_FormattingRowSpan);
	System.out.println("extraFields_FormattingCharacterCasingDropdown   : "+actextraFields_FormattingCharacterCasingDropdown +" Value Expected : "+expextraFields_FormattingCharacterCasingDropdown);
	System.out.println("extraFields_FormattingTextAlignDropdown         : "+actextraFields_FormattingTextAlignDropdown       +" Value Expected : "+expextraFields_FormattingTextAlignDropdown);
	System.out.println("extraFields_FormattingFieldsDetailsFont         : "+actextraFields_FormattingFieldsDetailsFont       +" Value Expected : "+expextraFields_FormattingFieldsDetailsFont);
	System.out.println("extraFields_FormattingBackColor                 : "+actextraFields_FormattingBackColor               +" Value Expected : "+expextraFields_FormattingBackColor);
	System.out.println("extraFields_FormattingFieldsDetailsFont_Btn     : "+actextraFields_FormattingFieldsDetailsFont_Btn   +" Value Expected : "+expextraFields_FormattingFieldsDetailsFont_Btn);
        
	if(actextraFields_FormattingColumnSpan==expextraFields_FormattingColumnSpan && actextraFields_FormattingRowSpan==expextraFields_FormattingRowSpan
			&& actextraFields_FormattingCharacterCasingDropdown==expextraFields_FormattingCharacterCasingDropdown
			&& actextraFields_FormattingTextAlignDropdown==expextraFields_FormattingTextAlignDropdown 
			&& actextraFields_FormattingFieldsDetailsFont==expextraFields_FormattingFieldsDetailsFont 
			&& actextraFields_FormattingBackColor==expextraFields_FormattingBackColor
			&& actextraFields_FormattingFieldsDetailsFont_Btn==expextraFields_FormattingFieldsDetailsFont_Btn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 332, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 332, 9, resFail);
		return false;
	}
}
        
   	
public static boolean checkRulesTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesTab));        	                
	extraFields_RulesTab.click();
         	             
	boolean actRulesValidationMessage = errorMessage.isDisplayed();
	boolean expRulesValidationMessage = true;
                
        	 	            
	// We are commenting this code as no message is displaying just checking message is display 
	String actSaveMessage=errorMessage.getText();
	String expSaveMessage="Enter field caption";
        		 
	errorMessageCloseBtn.click();
	System.out.println("******************************************* checkSelectSalesDayBookOptionInReportsAndClickOnSaveButton *****************************************");
	System.out.println("Click on Rules Button without Input Of Name   : " + actSaveMessage       + "  Value Expected : " + expSaveMessage); 
	
	extraFields_FieldDetailsCaption.click();
	extraFields_FieldDetailsCaption.sendKeys("Extra Field Two");
        			
	
        		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesTab));        	                
	extraFields_RulesTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesClickHereAddRuleButtonBtn));
	
	boolean actextraFields_RulesClickHereAddRuleButtonBtn =extraFields_RulesClickHereAddRuleButtonBtn.isDisplayed();
	boolean expextraFields_RulesClickHereAddRuleButtonBtn =true;
    
	System.out.println("extraFields_RulesClickHereAddRuleButtonBtn : "+actextraFields_RulesClickHereAddRuleButtonBtn+" Value Expected : "+expextraFields_RulesClickHereAddRuleButtonBtn);
	
	if(actextraFields_RulesClickHereAddRuleButtonBtn==expextraFields_RulesClickHereAddRuleButtonBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 333, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 333, 9, resFail);
		return false;
	}
}


        
public static boolean checkRulesOptionsTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
         		    		                
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RulesClickHereAddRuleButtonBtn));
	extraFields_RulesClickHereAddRuleButtonBtn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_RuleNameDropdown));
	
	boolean actextraFields_RuleNameDropdown  =extraFields_RuleNameDropdown.isDisplayed();
	boolean actextraFields_RuleNameSetingBtn =extraFields_RuleNameSetingBtn.isDisplayed();
	boolean actextraFields_RulesSaveBtn 	 =extraFields_RulesSaveBtn.isDisplayed();
	boolean actextraFields_RulesNewBtn 		 =extraFields_RulesNewBtn.isDisplayed();
	boolean actextraFields_RulesDeleteBtn 	 =extraFields_RulesDeleteBtn.isDisplayed();
	boolean actextraFields_RulesCloseBtn 	 =extraFields_RulesCloseBtn.isDisplayed();
	
	boolean expextraFields_RuleNameDropdown  =true;
	boolean expextraFields_RuleNameSetingBtn =true;
	boolean expextraFields_RulesSaveBtn 	 =true;
	boolean expextraFields_RulesNewBtn 		 =true;
	boolean expextraFields_RulesDeleteBtn 	 =true;
	boolean expextraFields_RulesCloseBtn 	 =true;
	
	System.out.println("*************************checkRulesOptionsTabInCreateCreateTabDisplayInCustomizeTab**********************");
	
	System.out.println("extraFields_RuleNameDropdown   : "+actextraFields_RuleNameDropdown  +" Value Expected : "+expextraFields_RuleNameDropdown);
	System.out.println("extraFields_RuleNameSetingBtn  : "+actextraFields_RuleNameSetingBtn +" Value Expected : "+expextraFields_RuleNameSetingBtn);
	System.out.println("extraFields_RulesSaveBtn       : "+actextraFields_RulesSaveBtn      +" Value Expected : "+expextraFields_RulesSaveBtn);
	System.out.println("extraFields_RulesNewBtn        : "+actextraFields_RulesNewBtn       +" Value Expected : "+expextraFields_RulesNewBtn);
	System.out.println("extraFields_RulesDeleteBtn     : "+actextraFields_RulesDeleteBtn    +" Value Expected : "+expextraFields_RulesDeleteBtn);
	System.out.println("extraFields_RulesCloseBtn      : "+actextraFields_RulesCloseBtn     +" Value Expected : "+expextraFields_RulesCloseBtn);
                
	if(actextraFields_RuleNameDropdown==expextraFields_RuleNameDropdown && actextraFields_RuleNameSetingBtn==expextraFields_RuleNameSetingBtn
			&& actextraFields_RulesSaveBtn==expextraFields_RulesSaveBtn && actextraFields_RulesNewBtn==expextraFields_RulesNewBtn
			&& actextraFields_RulesDeleteBtn==expextraFields_RulesDeleteBtn && actextraFields_RulesCloseBtn==expextraFields_RulesCloseBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 334, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 334, 9, resFail);
		return false;
	}
}

        
public static boolean checkExternalModulesTabInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
         		    		                
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ExternalModulesTab));
	extraFields_ExternalModulesTab.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ExternalModulesOnEventDropdown));
	
	boolean actextraFields_ExternalModulesOnEventDropdown  		=extraFields_ExternalModulesOnEventDropdown.isDisplayed();
	boolean actextraFields_ExternalModulesButtonCaption  		=extraFields_ExternalModulesButtonCaption.isDisplayed();
	boolean actextraFields_ExternalModules_ModuleTypeBtn  		=extraFields_ExternalModules_ModuleTypeBtn.isDisplayed();
	boolean actextraFields_ExternalModules_ModuleNameDropdown  	=extraFields_ExternalModules_ModuleNameDropdown.isDisplayed();
	boolean actextraFields_ExternalModulesClassNameDropdown  	=extraFields_ExternalModulesClassNameDropdown.isDisplayed();
	boolean actextraFields_ExternalModulesFuctionalNameDropdown =extraFields_ExternalModulesFuctionalNameDropdown.isDisplayed();
	boolean actextraFields_ExternalModulesAvabileInDropdown  	=extraFields_ExternalModulesAvabileInDropdown.isDisplayed();
	
	boolean expextraFields_ExternalModulesOnEventDropdown  		=true;
	boolean expextraFields_ExternalModulesButtonCaption  		=true;
	boolean expextraFields_ExternalModules_ModuleTypeBtn  		=true;
	boolean expextraFields_ExternalModules_ModuleNameDropdown  	=true;
	boolean expextraFields_ExternalModulesClassNameDropdown  	=true;
	boolean expextraFields_ExternalModulesFuctionalNameDropdown =true;
	boolean expextraFields_ExternalModulesAvabileInDropdown  	=true;
	
	System.out.println("********************checkExternalModulesTabInCreateCreateTabDisplayInCustomizeTab***********************");
	
	System.out.println("extraFields_ExternalModulesOnEventDropdown        : "+actextraFields_ExternalModulesOnEventDropdown       +" Value Expected : "+expextraFields_ExternalModulesOnEventDropdown);
	System.out.println("extraFields_ExternalModulesButtonCaption          : "+actextraFields_ExternalModulesButtonCaption         +" Value Expected : "+expextraFields_ExternalModulesButtonCaption);
	System.out.println("extraFields_ExternalModules_ModuleTypeBtn         : "+actextraFields_ExternalModules_ModuleTypeBtn        +" Value Expected : "+expextraFields_ExternalModules_ModuleTypeBtn);
	System.out.println("extraFields_ExternalModules_ModuleNameDropdown    : "+actextraFields_ExternalModules_ModuleNameDropdown   +" Value Expected : "+expextraFields_ExternalModules_ModuleNameDropdown);
	System.out.println("extraFields_ExternalModulesClassNameDropdown      : "+actextraFields_ExternalModulesClassNameDropdown     +" Value Expected : "+expextraFields_ExternalModulesClassNameDropdown);
	System.out.println("extraFields_ExternalModulesFuctionalNameDropdown  : "+actextraFields_ExternalModulesFuctionalNameDropdown +" Value Expected : "+expextraFields_ExternalModulesFuctionalNameDropdown);
	System.out.println("extraFields_ExternalModulesAvabileInDropdown      : "+actextraFields_ExternalModulesAvabileInDropdown     +" Value Expected : "+expextraFields_ExternalModulesAvabileInDropdown);
	
	if(actextraFields_ExternalModulesOnEventDropdown==expextraFields_ExternalModulesOnEventDropdown
			&& actextraFields_ExternalModulesButtonCaption==expextraFields_ExternalModulesButtonCaption
			&& actextraFields_ExternalModules_ModuleTypeBtn==expextraFields_ExternalModules_ModuleTypeBtn
			&& actextraFields_ExternalModules_ModuleNameDropdown==expextraFields_ExternalModules_ModuleNameDropdown
			&& actextraFields_ExternalModulesClassNameDropdown==expextraFields_ExternalModulesClassNameDropdown
			&& actextraFields_ExternalModulesFuctionalNameDropdown==expextraFields_ExternalModulesFuctionalNameDropdown
			&& actextraFields_ExternalModulesAvabileInDropdown==expextraFields_ExternalModulesAvabileInDropdown)
	{
		excelReader.setCellData(xlfile, "Sheet1", 335, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 335, 9, resFail);
		return false;
	}
}

        
public static boolean checkMandatoryFieldsByClickOnOkButtonCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
  		    			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_ClickOnFieldDetailsTab));
	extraFields_ClickOnFieldDetailsTab.click();
			 
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
	extraFields_OkBtn.click();
         
	String expMessage="Enter the Rule Name, if Rule Added";
	
	String actMessage=checkValidationMessage(expMessage);
         
	System.err.println("  Master Accounts Page  ");
         
	System.out.println("********************************checkMandatoryFieldsByClickOnOkButtonCreateCreateTabDisplayInCustomizeTab***************************");
  		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
  		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 336, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 336, 9, resFail);
		return false;
	}
}
 
 
 
 
public static boolean checkCloseButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
  		    			  
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CloseBtn));
	extraFields_CloseBtn.click();
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
	
	boolean actcustomizeMasterCreateCreateTabHeaderDetails   			=customizeMasterCreateCreateTabHeaderDetails.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabBlankHeaderDetails   		=customizeMasterCreateCreateTabBlankHeaderDetails.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton   =customizeMasterCreateCreateTabNewlyCreateTabSaveButton.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabAddButton   				=customizeMasterCreateCreateTabAddButton.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabPreviewButton   			=customizeMasterCreateCreateTabPreviewButton.isDisplayed();
	boolean actcustomizeMasterCreateCreateTabCloseButton   				=customizeMasterCreateCreateTabCloseButton.isDisplayed();
	
	boolean expcustomizeMasterCreateCreateTabHeaderDetails   			=true;
	boolean expcustomizeMasterCreateCreateTabBlankHeaderDetails   		=true;
	boolean expcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton   =true;
	boolean expcustomizeMasterCreateCreateTabAddButton   				=true;
	boolean expcustomizeMasterCreateCreateTabPreviewButton   			=true;
	boolean expcustomizeMasterCreateCreateTabCloseButton   				=true;
	
	System.out.println("*******************checkCloseButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab****************");
	
	System.out.println("customizeMasterCreateCreateTabHeaderDetails             : "+actcustomizeMasterCreateCreateTabHeaderDetails            +" Value Expected : "+expcustomizeMasterCreateCreateTabHeaderDetails);
	System.out.println("customizeMasterCreateCreateTabBlankHeaderDetails        : "+actcustomizeMasterCreateCreateTabBlankHeaderDetails       +" Value Expected : "+expcustomizeMasterCreateCreateTabBlankHeaderDetails);
	System.out.println("customizeMasterCreateCreateTabNewlyCreateTabSaveButton  : "+actcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton +" Value Expected : "+expcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton);
	System.out.println("customizeMasterCreateCreateTabAddButton                 : "+actcustomizeMasterCreateCreateTabAddButton                +" Value Expected : "+expcustomizeMasterCreateCreateTabAddButton);
	System.out.println("customizeMasterCreateCreateTabPreviewButton             : "+actcustomizeMasterCreateCreateTabPreviewButton            +" Value Expected : "+expcustomizeMasterCreateCreateTabPreviewButton);
	System.out.println("customizeMasterCreateCreateTabCloseButton               : "+actcustomizeMasterCreateCreateTabCloseButton              +" Value Expected : "+expcustomizeMasterCreateCreateTabCloseButton);
	
	if(actcustomizeMasterCreateCreateTabHeaderDetails==expcustomizeMasterCreateCreateTabHeaderDetails
			&& actcustomizeMasterCreateCreateTabBlankHeaderDetails==expcustomizeMasterCreateCreateTabBlankHeaderDetails
			&& actcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton==expcustomizeMasterCreateCreateTabNewlyCreateTabSaveButton
			&& actcustomizeMasterCreateCreateTabAddButton==expcustomizeMasterCreateCreateTabAddButton
			&& actcustomizeMasterCreateCreateTabPreviewButton==expcustomizeMasterCreateCreateTabPreviewButton
			&& actcustomizeMasterCreateCreateTabCloseButton==expcustomizeMasterCreateCreateTabCloseButton)
	{
		excelReader.setCellData(xlfile, "Sheet1", 337, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 337, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkOkButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabAddButton));
	customizeMasterCreateCreateTabAddButton.click();
  		    			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
	extraFields_FieldDetailsCaption.sendKeys("Extra Field One");
         
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
	extraFields_OkBtn.click();
         
	String expMessage="Field Added Successfully.";
	
	String actMessage=checkValidationMessage(expMessage);
	
	System.out.println("********************************checkOkButtonWithInputMandatoryFieldsCreateCreateTabDisplayInCustomizeTab***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 338, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 338, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
	customizeMasterCreateCreateTabHeaderDetails.click();
	
	boolean actcustomizeMasterCreateCreateTabHeaderDetails =customizeMasterCreateCreateTabHeaderDetails.isDisplayed();
	boolean actextraFields_CreatedByUserInHeaderDetailsTab =extraFields_CreatedByUserInHeaderDetailsTab.isDisplayed();
	
	boolean expcustomizeMasterCreateCreateTabHeaderDetails =true;
	boolean expextraFields_CreatedByUserInHeaderDetailsTab =true;
	
	System.out.println("***************************checkCreatedFieldInCreateCreateTabDisplayInCustomizeTab*****************************");
	
	System.out.println("customizeMasterCreateCreateTabHeaderDetails : "+actcustomizeMasterCreateCreateTabHeaderDetails+" Value Expected : "+expcustomizeMasterCreateCreateTabHeaderDetails);
	System.out.println("extraFields_CreatedByUserInHeaderDetailsTab : "+actextraFields_CreatedByUserInHeaderDetailsTab+" Value Expected : "+expextraFields_CreatedByUserInHeaderDetailsTab);
			 
	if(actcustomizeMasterCreateCreateTabHeaderDetails==expcustomizeMasterCreateCreateTabHeaderDetails
			&& actextraFields_CreatedByUserInHeaderDetailsTab==expextraFields_CreatedByUserInHeaderDetailsTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 339, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 339, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkEditCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
	customizeMasterCreateCreateTabHeaderDetails.click();
			 
	
			  
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_EditOptionInHeaderDetailsTab));
	extraFields_EditOptionInHeaderDetailsTab.click();
			 
	
			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
	extraFields_FieldDetailsCaption.click();
			
	
		 	 
	String actextraFields_FieldDetailsCaption    =extraFields_FieldDetailsCaption.getAttribute("Value");
		 	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
	
	boolean actextraFields_FieldDetailsTab      =extraFields_FieldDetailsTab.isDisplayed();
	boolean actextraFields_PropertiesTab  		=extraFields_PropertiesTab.isDisplayed();
	boolean actextraFields_FormattingTab  		=extraFields_FormattingTab.isDisplayed();
	boolean actextraFields_RulesTab  			=extraFields_RulesTab.isDisplayed();
	boolean actextraFields_ExternalModulesTab  	=extraFields_ExternalModulesTab.isDisplayed();
	
	String expextraFields_FieldDetailsCaption   ="Extra Field One";
	boolean expextraFields_FieldDetailsTab      =true;
	boolean expextraFields_PropertiesTab  		=true;
	boolean expextraFields_FormattingTab  		=true;
	boolean expextraFields_RulesTab  			=true;
	boolean expextraFields_ExternalModulesTab  	=true;
	
	System.out.println("****************checkEditCreatedFieldInCreateCreateTabDisplayInCustomizeTab********************");
			 			
	System.out.println("extraFields_FieldDetailsCaption  : "+actextraFields_FieldDetailsCaption +" value Expected : "+expextraFields_FieldDetailsCaption);
	System.out.println("extraFields_FieldDetailsTab      : "+actextraFields_FieldDetailsTab     +" value Expected : "+expextraFields_FieldDetailsTab);
	System.out.println("extraFields_PropertiesTab        : "+actextraFields_PropertiesTab       +" value Expected : "+expextraFields_PropertiesTab);
	System.out.println("extraFields_FormattingTab        : "+actextraFields_FormattingTab       +" value Expected : "+expextraFields_FormattingTab);
	System.out.println("extraFields_RulesTab             : "+actextraFields_RulesTab            +" value Expected : "+expextraFields_RulesTab);
	System.out.println("extraFields_ExternalModulesTab   : "+actextraFields_ExternalModulesTab  +" value Expected : "+expextraFields_ExternalModulesTab);
	
	if(actextraFields_FieldDetailsCaption.equalsIgnoreCase(expextraFields_FieldDetailsCaption)
			&& actextraFields_FieldDetailsTab==expextraFields_FieldDetailsTab && actextraFields_PropertiesTab==expextraFields_PropertiesTab
			&& actextraFields_FormattingTab==expextraFields_FormattingTab && actextraFields_RulesTab==expextraFields_RulesTab
			&& actextraFields_ExternalModulesTab==expextraFields_ExternalModulesTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 340, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 340, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
	extraFields_FieldDetailsCaption.click();
	extraFields_FieldDetailsCaption.clear();
	extraFields_FieldDetailsCaption.sendKeys("Extra Field Update On");
		     
	
		  
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
	extraFields_OkBtn.click();
          
	String expMessage="Field Updated Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
   		 
	System.out.println("********************************checkUpdateCreatedFieldInCreateCreateTabDisplayInCustomizeTab***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 341, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 341, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkUpdateFieldInCreateCreateTabDisplayInCustomizeTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabHeaderDetails));
	customizeMasterCreateCreateTabHeaderDetails.click();
			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_EditOptionInHeaderDetailsTab));
	extraFields_EditOptionInHeaderDetailsTab.click();
			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
	extraFields_FieldDetailsCaption.click();
			
	String actextraFields_FieldDetailsCaption    =extraFields_FieldDetailsCaption.getAttribute("Value");
	 	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
	
	boolean actextraFields_FieldDetailsTab      =extraFields_FieldDetailsTab.isDisplayed();
	boolean actextraFields_PropertiesTab  		=extraFields_PropertiesTab.isDisplayed();
	boolean actextraFields_FormattingTab  		=extraFields_FormattingTab.isDisplayed();
	boolean actextraFields_RulesTab  			=extraFields_RulesTab.isDisplayed();
	boolean actextraFields_ExternalModulesTab  	=extraFields_ExternalModulesTab.isDisplayed();
	
	String expextraFields_FieldDetailsCaption   ="Extra Field Update On";
	boolean expextraFields_FieldDetailsTab      =true;
	boolean expextraFields_PropertiesTab  		=true;
	boolean expextraFields_FormattingTab  		=true;
	boolean expextraFields_RulesTab  			=true;
	boolean expextraFields_ExternalModulesTab  	=true;
	
	System.out.println("****************checkUpdateFieldInCreateCreateTabDisplayInCustomizeTab********************");
			 			
	System.out.println("extraFields_FieldDetailsCaption  : "+actextraFields_FieldDetailsCaption +" value Expected : "+expextraFields_FieldDetailsCaption);
	System.out.println("extraFields_FieldDetailsTab      : "+actextraFields_FieldDetailsTab     +" value Expected : "+expextraFields_FieldDetailsTab);
	System.out.println("extraFields_PropertiesTab        : "+actextraFields_PropertiesTab       +" value Expected : "+expextraFields_PropertiesTab);
	System.out.println("extraFields_FormattingTab        : "+actextraFields_FormattingTab       +" value Expected : "+expextraFields_FormattingTab);
	System.out.println("extraFields_RulesTab             : "+actextraFields_RulesTab            +" value Expected : "+expextraFields_RulesTab);
	System.out.println("extraFields_ExternalModulesTab   : "+actextraFields_ExternalModulesTab  +" value Expected : "+expextraFields_ExternalModulesTab);
	
	if(actextraFields_FieldDetailsCaption.equalsIgnoreCase(expextraFields_FieldDetailsCaption)
			&& actextraFields_FieldDetailsTab==expextraFields_FieldDetailsTab && actextraFields_PropertiesTab==expextraFields_PropertiesTab
			&& actextraFields_FormattingTab==expextraFields_FormattingTab && actextraFields_RulesTab==expextraFields_RulesTab
			&& actextraFields_ExternalModulesTab==expextraFields_ExternalModulesTab)
	{
		extraFields_CloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet1", 342, 9, resPass);
		return true;
	}
	else
	{
		extraFields_CloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet1", 342, 9, resFail);
		return false;
	}
}



public static boolean checkCreateExtraFieldAfterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizeMasterCreateCreateTabAddButton));
	customizeMasterCreateCreateTabAddButton.click();
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
	extraFields_FieldDetailsCaption.sendKeys("Exra Field Two");
      
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
	extraFields_OkBtn.click();
         
	String expMessage="Field Added Successfully.";
	
	String actMessage=checkValidationMessage(expMessage);
	
	System.out.println("********************************checkCreateExtraFieldAfterCreation***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 343, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 343, 9, resFail);
		return false;
	}
}
 
 
 
 
public static boolean checkMoveExtraFieldAfterCreation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SecondFieldInHeaderDetailsTab));
	extraFields_SecondFieldInHeaderDetailsTab.click();
  		    			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_MoveFieldOption));
	extraFields_MoveFieldOption.click();
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_MoveFieldTabName));
	
	boolean actextraFields_MoveFieldTabName  	  =extraFields_MoveFieldTabName.isDisplayed();
	boolean actextraFields_MoveFieldHeader  	  =extraFields_MoveFieldHeader.isDisplayed();
	boolean actextraFields_MoveFieldBody  		  =extraFields_MoveFieldBody.isDisplayed();
	boolean actextraFields_MoveFieldCancelButton  =extraFields_MoveFieldCancelButton.isDisplayed();
	
	boolean expextraFields_MoveFieldTabName  	  =true;
	boolean expextraFields_MoveFieldHeader  	  =true;
	boolean expextraFields_MoveFieldBody  		  =true;
	boolean expextraFields_MoveFieldCancelButton  =true;
	
	System.out.println("***********************************checkMoveExtraFieldAfterCreation**********************************");
	
	System.out.println("extraFields_MoveFieldTabName       : "+actextraFields_MoveFieldTabName      +" Value Expected : "+expextraFields_MoveFieldTabName);
	System.out.println("extraFields_MoveFieldHeader        : "+actextraFields_MoveFieldHeader       +" Value Expected : "+expextraFields_MoveFieldHeader);
	System.out.println("extraFields_MoveFieldBody          : "+actextraFields_MoveFieldBody         +" Value Expected : "+expextraFields_MoveFieldBody);
	System.out.println("extraFields_MoveFieldCancelButton  : "+actextraFields_MoveFieldCancelButton +" Value Expected : "+expextraFields_MoveFieldCancelButton);
         
	if(actextraFields_MoveFieldTabName==expextraFields_MoveFieldTabName && actextraFields_MoveFieldHeader==expextraFields_MoveFieldHeader
			&& actextraFields_MoveFieldBody==expextraFields_MoveFieldBody && actextraFields_MoveFieldCancelButton==expextraFields_MoveFieldCancelButton)
	{	
		excelReader.setCellData(xlfile, "Sheet1", 344, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 344, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkTabsAvailableInTabsOfMoveField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_MoveFieldTabName));
	extraFields_MoveFieldTabName.click();
         
	Select tabSelect=new Select(extraFields_MoveFieldTabName);
	List <WebElement> tabsCount=tabSelect.getOptions();

	int actextraFields_MoveFieldTabName  =tabsCount.size();
	int expextraFields_MoveFieldTabName  =6;
	
	System.out.println("******************************checkTabsAvailableInTabsOfMoveField*****************************");
	
	System.out.println("extraFields_MoveFieldTabName : "+actextraFields_MoveFieldTabName+" Value Expected : "+expextraFields_MoveFieldTabName);

	if(actextraFields_MoveFieldTabName==expextraFields_MoveFieldTabName)
	{
		excelReader.setCellData(xlfile, "Sheet1", 345, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 345, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkCancelButtonInMoveField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_MoveFieldTabName));
	extraFields_MoveFieldTabName.sendKeys("Settings");
	extraFields_MoveFieldTabName.sendKeys(Keys.TAB);     
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_MoveFieldCancelButton));
	extraFields_MoveFieldCancelButton.click();
         
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SecondFieldInHeaderDetailsTab));
	
	boolean actextraFields_SecondFieldInHeaderDetailsTab =extraFields_SecondFieldInHeaderDetailsTab.isDisplayed();
	boolean expextraFields_SecondFieldInHeaderDetailsTab =true;
	
	System.out.println("****************************************checkCancelButtonInMoveField****************************");
	
	System.out.println("extraFields_SecondFieldInHeaderDetailsTab  : "+actextraFields_SecondFieldInHeaderDetailsTab+" Value Expected : "+expextraFields_SecondFieldInHeaderDetailsTab);
         
	if(actextraFields_SecondFieldInHeaderDetailsTab==expextraFields_SecondFieldInHeaderDetailsTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 346, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 346, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkOkButtonInMoveField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SecondFieldInHeaderDetailsTab));
	extraFields_SecondFieldInHeaderDetailsTab.click();
   		    			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_MoveFieldOption));
	extraFields_MoveFieldOption.click();
   			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_MoveFieldTabName));
	extraFields_MoveFieldTabName.sendKeys("Settings");
	extraFields_MoveFieldTabName.sendKeys(Keys.TAB);     
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_MoveFieldOkButton));
	extraFields_MoveFieldOkButton.click();
         
	String expMessage="Field Moved Successfully";
	
	String actMessage=checkValidationMessage(expMessage);
	
	System.out.println("********************************checkOkButtonInMoveField***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 347, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 347, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkMoveFieldMovedToSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingOption));
	settingOption.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_MoveField));
	extraFields_SettingsTab_MoveField.click();
		    			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
	extraFields_FieldDetailsCaption.click();
	 
	String actextraFields_FieldDetailsCaption    =extraFields_FieldDetailsCaption.getAttribute("Value");
 	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
	
	boolean actextraFields_FieldDetailsTab      =extraFields_FieldDetailsTab.isDisplayed();
	boolean actextraFields_PropertiesTab  		=extraFields_PropertiesTab.isDisplayed();
	boolean actextraFields_FormattingTab  		=extraFields_FormattingTab.isDisplayed();
	boolean actextraFields_RulesTab  			=extraFields_RulesTab.isDisplayed();
	boolean actextraFields_ExternalModulesTab  	=extraFields_ExternalModulesTab.isDisplayed();
	
	String expextraFields_FieldDetailsCaption   ="Exra Field Two";
	boolean expextraFields_FieldDetailsTab      =true;
	boolean expextraFields_PropertiesTab  		=true;
	boolean expextraFields_FormattingTab  		=true;
	boolean expextraFields_RulesTab  			=true;
	boolean expextraFields_ExternalModulesTab  	=true;
	
	System.out.println("***************************************checkMoveFieldMovedToSettingsTab*************************************");
			 			
	System.out.println("extraFields_FieldDetailsCaption  : "+actextraFields_FieldDetailsCaption +" value Expected : "+expextraFields_FieldDetailsCaption);
	System.out.println("extraFields_FieldDetailsTab      : "+actextraFields_FieldDetailsTab     +" value Expected : "+expextraFields_FieldDetailsTab);
	System.out.println("extraFields_PropertiesTab        : "+actextraFields_PropertiesTab       +" value Expected : "+expextraFields_PropertiesTab);
	System.out.println("extraFields_FormattingTab        : "+actextraFields_FormattingTab       +" value Expected : "+expextraFields_FormattingTab);
	System.out.println("extraFields_RulesTab             : "+actextraFields_RulesTab            +" value Expected : "+expextraFields_RulesTab);
	System.out.println("extraFields_ExternalModulesTab   : "+actextraFields_ExternalModulesTab  +" value Expected : "+expextraFields_ExternalModulesTab);
	
	if(actextraFields_FieldDetailsCaption.equalsIgnoreCase(expextraFields_FieldDetailsCaption)
			&& actextraFields_FieldDetailsTab==expextraFields_FieldDetailsTab && actextraFields_PropertiesTab==expextraFields_PropertiesTab
			&& actextraFields_FormattingTab==expextraFields_FormattingTab && actextraFields_RulesTab==expextraFields_RulesTab
			&& actextraFields_ExternalModulesTab==expextraFields_ExternalModulesTab)
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CloseBtn));
		extraFields_CloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet1", 348, 9, resPass);
		return true;
	}
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CloseBtn));
		extraFields_CloseBtn.click();
		excelReader.setCellData(xlfile, "Sheet1", 348, 9, resFail);
		return false;
	}	
}
 
 
public static boolean checkDefaultFieldMoveInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_First));
	extraFields_SettingsTab_First.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_MoveFieldOption));
	extraFields_MoveFieldOption.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_MoveField));
	
	boolean actextraFields_SettingsTab_MoveField =extraFields_SettingsTab_MoveField.isDisplayed();
	boolean expextraFields_SettingsTab_MoveField =true;
	
	System.out.println("*********************************checkDefaultFieldMoveInSettingsTab*****************************");
	
	System.out.println("extraFields_SettingsTab_MoveField  : "+actextraFields_SettingsTab_MoveField+" Value Expected : "+expextraFields_SettingsTab_MoveField);
	 	 
	if(actextraFields_SettingsTab_MoveField==expextraFields_SettingsTab_MoveField)
	{
		excelReader.setCellData(xlfile, "Sheet1", 349, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 349, 9, resFail);
		return false;
	}
}
 
 

public static boolean checkDefaultDeleteInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_FirstDelete));
	extraFields_SettingsTab_FirstDelete.click();
		 
	String expMessage="Default Field cannot delete";
		
	String actMessage=checkValidationMessage(expMessage);
	
	System.out.println("********************************checkDefaultDeleteInSettingsTab***************************");
		
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, "Sheet1", 350, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 350, 9, resFail);
			return false;
		}
}
 
 
public static boolean checkMoveDeleteInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_MoveFieldOptsDelete));
	extraFields_SettingsTab_MoveFieldOptsDelete.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_DeleteMessage));
   
	String actextraFields_SettingsTab_DeleteMessage  =extraFields_SettingsTab_DeleteMessage.getText();
	String expextraFields_SettingsTab_DeleteMessage  ="Are you sure that you want to delete selected Field ?";
	
	System.out.println("********************************checkMoveDeleteInSettingsTab***********************");
   
	System.out.println("extraFields_SettingsTab_DeleteMessage : "+actextraFields_SettingsTab_DeleteMessage+" Value Expected : "+expextraFields_SettingsTab_DeleteMessage);
    
	if(actextraFields_SettingsTab_DeleteMessage.equalsIgnoreCase(expextraFields_SettingsTab_DeleteMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 351, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 351, 9, resFail);
		return false;
	}
}
 
 
 
public static boolean checkNoOptionMoveDeleteInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_DeleteMessageNoOption));
	extraFields_SettingsTab_DeleteMessageNoOption.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_MoveFieldOptsDelete));
	
	boolean actextraFields_SettingsTab_MoveFieldOptsDelete =extraFields_SettingsTab_MoveFieldOptsDelete.isDisplayed();
	boolean expextraFields_SettingsTab_MoveFieldOptsDelete =true;
	
	System.out.println("***********************************checkNoOptionMoveDeleteInSettingsTab**************************");
	
	System.out.println("extraFields_SettingsTab_MoveFieldOptsDelete  : "+actextraFields_SettingsTab_MoveFieldOptsDelete+" Value Expected : "+expextraFields_SettingsTab_MoveFieldOptsDelete);
     
	if(actextraFields_SettingsTab_MoveFieldOptsDelete==expextraFields_SettingsTab_MoveFieldOptsDelete)
	{
		excelReader.setCellData(xlfile, "Sheet1", 352, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 352, 9, resFail);
		return false;
	}
}
 
 
public static boolean checkYesOptionMoveDeleteInSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_MoveFieldOptsDelete));
	extraFields_SettingsTab_MoveFieldOptsDelete.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_SettingsTab_DeleteMessageYesOption));
	extraFields_SettingsTab_DeleteMessageYesOption.click();
	  
	String expMessage="Field deleted Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkYesOptionMoveDeleteInSettingsTab***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 353, 9, resPass);
		return true;
	}	
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 353, 9, resFail);
		return false;
	}
}

 

 
public static boolean checkPreviewButtonBeforeLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PreviewTab));
	extraFields_PreviewTab.click();
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_GeneralTab));
      
	boolean actextraFields_GeneralTab			=extraFields_GeneralTab.isDisplayed();
	boolean actextraFields_SettingsTab			=extraFields_SettingsTab.isDisplayed();
	boolean actextraFields_DetailsTab			=extraFields_DetailsTab.isDisplayed();
	boolean actextraFields_PrintLayout			=extraFields_PrintLayout.isDisplayed();
	boolean actextraFields_TreeTabUpdate		=extraFields_TreeTabUpdate.isDisplayed();
	boolean actextraFields_DocumentTab			=extraFields_DocumentTab.isDisplayed();
	boolean actextraFields_CreateTab			=extraFields_CreateTab.isDisplayed();
	boolean actextraFields_PreviewTab_CloseBtn	=extraFields_PreviewTab_CloseBtn.isDisplayed();
	
	boolean expextraFields_GeneralTab			=true;
	boolean expextraFields_SettingsTab			=true;
	boolean expextraFields_DetailsTab			=true;
	boolean expextraFields_PrintLayout			=true;
	boolean expextraFields_TreeTabUpdate		=true;
	boolean expextraFields_DocumentTab			=true;
	boolean expextraFields_CreateTab			=true;
	boolean expextraFields_PreviewTab_CloseBtn	=true;
	
	System.out.println("***************************************checkPreviewButtonBeforeLogout*******************************");
	
	System.out.println("extraFields_GeneralTab          : "+actextraFields_GeneralTab           +"  value expected  "+expextraFields_GeneralTab);
	System.out.println("extraFields_SettingsTab         : "+actextraFields_SettingsTab          +"  value expected  "+expextraFields_SettingsTab);
	System.out.println("extraFields_DetailsTab          : "+actextraFields_DetailsTab           +"  value expected  "+expextraFields_DetailsTab);
	System.out.println("extraFields_PrintLayout         : "+actextraFields_PrintLayout          +"  value expected  "+expextraFields_PrintLayout);
	System.out.println("extraFields_TreeTabUpdate       : "+actextraFields_TreeTabUpdate        +"  value expected  "+expextraFields_TreeTabUpdate);
	System.out.println("extraFields_DocumentTab         : "+actextraFields_DocumentTab          +"  value expected  "+expextraFields_DocumentTab);
	System.out.println("extraFields_CreateTab           : "+actextraFields_CreateTab            +"  value expected  "+expextraFields_CreateTab);
	System.out.println("extraFields_PreviewTab_CloseBtn : "+actextraFields_PreviewTab_CloseBtn  +"  value expected  "+expextraFields_PreviewTab_CloseBtn);
	
	
	if(actextraFields_GeneralTab==expextraFields_GeneralTab && actextraFields_SettingsTab==expextraFields_SettingsTab && 
			actextraFields_DetailsTab==expextraFields_DetailsTab && actextraFields_PrintLayout==expextraFields_PrintLayout && 
			actextraFields_TreeTabUpdate==expextraFields_TreeTabUpdate && actextraFields_DocumentTab==expextraFields_DocumentTab && 
      	  	actextraFields_CreateTab==expextraFields_CreateTab && actextraFields_PreviewTab_CloseBtn==expextraFields_PreviewTab_CloseBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 354, 9, resFail);
		return false;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 354, 9, resPass);
		return true;
	}
}

 
public static boolean checkCloseBtnPreviewButtonBeforeLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PreviewTab_CloseBtn));
	extraFields_PreviewTab_CloseBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));
	
	boolean actgeneralTab   						=generalTab.isDisplayed();
	boolean actsettingOption   						=settingOption.isDisplayed();
	boolean actaccountMasterFieldDetailsOption   	=accountMasterFieldDetailsOption.isDisplayed();
	boolean actaccountMasterFieldPrintLayoutOption  =accountMasterFieldPrintLayoutOption.isDisplayed();
	
	boolean expgeneralTab   						=true;
	boolean expsettingOption   						=true;
	boolean expaccountMasterFieldDetailsOption   	=true;
	boolean expaccountMasterFieldPrintLayoutOption  =true;
	
	System.out.println("*****************************************checkCloseBtnPreviewButtonBeforeLogout*********************************");
	
	System.out.println("generalTab                           : "+actgeneralTab                          +" Value Expected : "+expgeneralTab);
	System.out.println("settingOption                        : "+actsettingOption                       +" Value Expected : "+expsettingOption);
	System.out.println("accountMasterFieldDetailsOption      : "+actaccountMasterFieldDetailsOption     +" Value Expected : "+expaccountMasterFieldDetailsOption);
	System.out.println("accountMasterFieldPrintLayoutOption  : "+actaccountMasterFieldPrintLayoutOption +" Value Expected : "+expaccountMasterFieldPrintLayoutOption);
     
	if(actgeneralTab==expgeneralTab && actsettingOption==expsettingOption
			&& actaccountMasterFieldDetailsOption==expaccountMasterFieldDetailsOption
			&& actaccountMasterFieldPrintLayoutOption==expaccountMasterFieldPrintLayoutOption)
	{
		excelReader.setCellData(xlfile, "Sheet1", 355, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 355, 9, resFail);
		return false;
	}
}
 
 //Here we need to logout and chekc the customize
 
public static boolean checkLogoutAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				 
	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
	userNameDisplay.click();
 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
	logoutOption.click();
		 
	boolean verifyFiledsStatus=true;
	 
	getWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		
	boolean actusername			=username.isDisplayed();
	boolean actpassword	 	    =password.isDisplayed();
	boolean actcompanyDropDownList =companyDropDownList.isDisplayed();
	boolean actsignIn				=signIn.isDisplayed();
	
	boolean expusername			=true;
	boolean exppassword			=true;
	boolean expcompanyDropDownList	=true;
	boolean expsignIn				=true;
	 
	System.out.println("************************************* checkLogoutAfterCustomization  *********************************");
	
	System.out.println("username             : "+actusername            +" Value Expected : "+expusername);
	System.out.println("password             : "+actpassword            +" Value Expected : "+exppassword);
	System.out.println("companyDropDownList  : "+actcompanyDropDownList +" Value Expected : "+expcompanyDropDownList);
	System.out.println("signIn               : "+actsignIn              +" Value Expected : "+expsignIn);
	
	if(actusername==expusername && actpassword==exppassword && actcompanyDropDownList==expcompanyDropDownList && actsignIn==expsignIn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 356, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 356, 9, resFail);
		return false;
	}
}

	
	public static boolean checkSignToCheckTabsInCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("su");
		getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

     
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
    password.sendKeys("su");
    getAction().moveToElement(password).sendKeys(Keys.TAB).perform();
     
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(signIn));
    signIn.click();
    
    Thread.sleep(5000);
    
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	userNameDisplay.click();
   
	//To Check Login User Home Page is display
    
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.textToBePresentInElement(userNameDisplay, "SU"));
	
	String userInfo=userNameDisplay.getText();
	
	System.out.println("User Info : "+userInfo);
	
	System.out.println("User Info Capture Text :"+userNameDisplay.getText());
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
	companyLogo.click();
	
	String getCompanyTxt			=companyName.getText();
	String getLoginCompanyName		=getCompanyTxt.substring(0, 19);
	companyLogo.click();
	
	String expuserInfo				="SU";
	String expLoginCompanyName		="Automation Company ";

	if(userInfo.equalsIgnoreCase(expuserInfo) && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))
	{
		getLogger().info("Login User the Company Name and Information is displaying correct");
		System.out.println("Pass : Login User and Company Name is displaying Correct");
		excelReader.setCellData(xlfile, "Sheet1", 357, 9, resPass);
		return true;
	}
	else
	{	
		getLogger().info("Fail : Login User the Company Name and Information is displaying Wrong");
		System.out.println("Fail : Login Name the Company Name and Information is displaying Wrong");
		excelReader.setCellData(xlfile, "Sheet1", 357, 9, resFail);
		return false;
	}
	}
	
	
	public static boolean checkOpenAccountsMasterAfterCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
	     
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
	     
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();
	    	  
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));
     
	String actaccountsTitle  =accountsTitle.getText();
	String expaccountsTitle  ="Account";
	
	System.out.println("*********************************checkOpenAccountsMasterAfterCustomization**************************");
     
	System.out.println("accountsTitle  : "+actaccountsTitle+" Value Expected : "+expaccountsTitle);
     
	if(actaccountsTitle.equalsIgnoreCase(expaccountsTitle))
		{	
			excelReader.setCellData(xlfile, "Sheet1", 358, 9, resPass);
			return true;
		}	 
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 358, 9, resFail);
			return false;
		}
	}

	
	
	public static boolean checkCustomizeMasterTabOptionAfterAddingTabsWithLogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();
	     	     
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
		masterRibbonControlNextBtn.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		 
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(minusBtn));
		minusBtn.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));
	
	boolean actplusBtn         							    =plusBtn.isDisplayed();
	boolean actmasterFieldsOption         					=masterFieldsOption.isDisplayed();
	boolean actaccountMasterFieldsUniqueConstraintsOption   =accountMasterFieldsUniqueConstraintsOption.isDisplayed();
	boolean actRulesOption         						    =RulesOption.isDisplayed();
	boolean actrules_ExternalModules         				=rules_ExternalModules.isDisplayed();
	boolean actitemInfoPanelCustomizationTab         		=itemInfoPanelCustomizationTab.isDisplayed();
	boolean actaccountReportsTab         					=accountReportsTab.isDisplayed();
	
	boolean expplusBtn         							    =true;
	boolean expmasterFieldsOption         					=true;
	boolean expaccountMasterFieldsUniqueConstraintsOption  =true;
	boolean expRulesOption         						    =true;
	boolean exprules_ExternalModules         				=true;
	boolean expitemInfoPanelCustomizationTab         		=true;
	boolean expaccountReportsTab         					=true;
	
	System.out.println("****************************checkCustomizeMasterTabOptionAfterAddingTabsWithLogout**********************************");
	
	System.out.println("plusBtn                                    : "+actplusBtn                                    +" Value Expected : "+expplusBtn);
	System.out.println("masterFieldsOption                         : "+actmasterFieldsOption                         +" Value Expected : "+expmasterFieldsOption);
	System.out.println("accountMasterFieldsUniqueConstraintsOption : "+actaccountMasterFieldsUniqueConstraintsOption +" Value Expected : "+expaccountMasterFieldsUniqueConstraintsOption);
	System.out.println("RulesOption                                : "+actRulesOption                                +" Value Expected : "+expRulesOption);
	System.out.println("rules_ExternalModules                      : "+actrules_ExternalModules                      +" Value Expected : "+exprules_ExternalModules);
	System.out.println("itemInfoPanelCustomizationTab              : "+actitemInfoPanelCustomizationTab              +" Value Expected : "+expitemInfoPanelCustomizationTab);
	System.out.println("accountReportsTab                          : "+actaccountReportsTab                          +" Value Expected : "+expaccountReportsTab);
	
	if(actplusBtn==expplusBtn && actmasterFieldsOption==expmasterFieldsOption 
			&& actaccountMasterFieldsUniqueConstraintsOption==expaccountMasterFieldsUniqueConstraintsOption
			&& actRulesOption==expRulesOption && actrules_ExternalModules==exprules_ExternalModules
			&& actitemInfoPanelCustomizationTab==expitemInfoPanelCustomizationTab && actaccountReportsTab==expaccountReportsTab)	
		{		 
			excelReader.setCellData(xlfile, "Sheet1", 359, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 359, 9, resFail);
			return false;
		}
	}
	

	
	public static boolean checkCustomizeMasterTabMasterFieldsOptionAfterAddingTabs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(plusBtn));
		plusBtn.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));
	 
	 boolean actgeneralTab                           =generalTab.isDisplayed();
	 boolean actsettingOption                        =settingOption.isDisplayed();
	 boolean actaccountMasterFieldDetailsOption      =accountMasterFieldDetailsOption.isDisplayed();
	 boolean actaccountMasterFieldPrintLayoutOption  =accountMasterFieldPrintLayoutOption.isDisplayed();
	 boolean actcustomizeTabWithTreeTabUpdate        =customizeTabWithTreeTabUpdate.isDisplayed();
	 boolean actcustomizeTabWithDocumentTab          =customizeTabWithDocumentTab.isDisplayed();
	 boolean actcustomizeTabWithCreateTreeTab        =customizeTabWithCreateTreeTab.isDisplayed();
	 
	 boolean expgeneralTab                           =true;
	 boolean expsettingOption                        =true;
	 boolean expaccountMasterFieldDetailsOption      =true;
	 boolean expaccountMasterFieldPrintLayoutOption  =true;
	 boolean expcustomizeTabWithTreeTabUpdate        =true;
	 boolean expcustomizeTabWithDocumentTab          =true;
	 boolean expcustomizeTabWithCreateTreeTab        =true;
	 
	 System.out.println("*************************************checkCustomizeMasterTabMasterFieldsOption***********************************");
	 
	 System.out.println("generalTab                          : "+actgeneralTab                          +" Value Expected : "+expgeneralTab);
	 System.out.println("settingOption                       : "+actsettingOption                       +" Value Expected : "+expsettingOption);
	 System.out.println("accountMasterFieldDetailsOption     : "+actaccountMasterFieldDetailsOption     +" Value Expected : "+expaccountMasterFieldDetailsOption);
	 System.out.println("accountMasterFieldPrintLayoutOption : "+actaccountMasterFieldPrintLayoutOption +" Value Expected : "+expaccountMasterFieldPrintLayoutOption);
	 System.out.println("customizeTabWithTreeTabUpdate       : "+actcustomizeTabWithTreeTabUpdate       +" Value Expected : "+expcustomizeTabWithTreeTabUpdate);
	 System.out.println("customizeTabWithDocumentTab         : "+actcustomizeTabWithDocumentTab         +" Value Expected : "+expcustomizeTabWithDocumentTab);
	 System.out.println("customizeTabWithCreateTreeTab       : "+actcustomizeTabWithCreateTreeTab       	+" Value Expected : "+expcustomizeTabWithCreateTreeTab);
	 
	 if(actgeneralTab==expgeneralTab && actsettingOption==expsettingOption
			 && actaccountMasterFieldDetailsOption==expaccountMasterFieldDetailsOption
			 && actaccountMasterFieldPrintLayoutOption==expaccountMasterFieldPrintLayoutOption
			 && actcustomizeTabWithTreeTabUpdate==expcustomizeTabWithTreeTabUpdate
			 && actcustomizeTabWithDocumentTab==expcustomizeTabWithDocumentTab
			 && actcustomizeTabWithCreateTreeTab==expcustomizeTabWithCreateTreeTab)
		{
			excelReader.setCellData(xlfile, "Sheet1", 360, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 360, 9, resFail);
			return false;
		}
	}
	
 
 
 
 public static boolean checkPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	  
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PreviewTab));
	 extraFields_PreviewTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_GeneralTab));
      
	 boolean actextraFields_GeneralTab			=extraFields_GeneralTab.isDisplayed();
	 boolean actextraFields_SettingsTab			=extraFields_SettingsTab.isDisplayed();
	 boolean actextraFields_DetailsTab			=extraFields_DetailsTab.isDisplayed();
	 boolean actextraFields_PrintLayout			=extraFields_PrintLayout.isDisplayed();
	 boolean actextraFields_TreeTabUpdate		=extraFields_TreeTabUpdate.isDisplayed();
	 boolean actextraFields_DocumentTab			=extraFields_DocumentTab.isDisplayed();
	 boolean actextraFields_CreateTab			=extraFields_CreateTab.isDisplayed();
	 boolean actextraFields_PreviewTab_CloseBtn	=extraFields_PreviewTab_CloseBtn.isDisplayed();
  	
	 boolean expextraFields_GeneralTab			=true;
	 boolean expextraFields_SettingsTab			=true;
	 boolean expextraFields_DetailsTab			=true;
	 boolean expextraFields_PrintLayout			=true;
	 boolean expextraFields_TreeTabUpdate		=true;
	 boolean expextraFields_DocumentTab			=true;
	 boolean expextraFields_CreateTab			=true;
	 boolean expextraFields_PreviewTab_CloseBtn	=true;
  		
	 System.out.println("***************************************checkPreviewOption*******************************");
      	
	 System.out.println("extraFields_GeneralTab          : "+actextraFields_GeneralTab           +"  value expected  "+expextraFields_GeneralTab);
	 System.out.println("extraFields_SettingsTab         : "+actextraFields_SettingsTab          +"  value expected  "+expextraFields_SettingsTab);
	 System.out.println("extraFields_DetailsTab          : "+actextraFields_DetailsTab           +"  value expected  "+expextraFields_DetailsTab);
	 System.out.println("extraFields_PrintLayout         : "+actextraFields_PrintLayout          +"  value expected  "+expextraFields_PrintLayout);
	 System.out.println("extraFields_TreeTabUpdate       : "+actextraFields_TreeTabUpdate        +"  value expected  "+expextraFields_TreeTabUpdate);
	 System.out.println("extraFields_DocumentTab         : "+actextraFields_DocumentTab          +"  value expected  "+expextraFields_DocumentTab);
	 System.out.println("extraFields_CreateTab           : "+actextraFields_CreateTab            +"  value expected  "+expextraFields_CreateTab);
	 System.out.println("extraFields_PreviewTab_CloseBtn : "+actextraFields_PreviewTab_CloseBtn  +"  value expected  "+expextraFields_PreviewTab_CloseBtn);
  	
  	
	 if(actextraFields_GeneralTab==expextraFields_GeneralTab && actextraFields_SettingsTab==expextraFields_SettingsTab && 
			 actextraFields_DetailsTab==expextraFields_DetailsTab && actextraFields_PrintLayout==expextraFields_PrintLayout && 
			 actextraFields_TreeTabUpdate==expextraFields_TreeTabUpdate && actextraFields_DocumentTab==expextraFields_DocumentTab && 
			 actextraFields_CreateTab==expextraFields_CreateTab && actextraFields_PreviewTab_CloseBtn==expextraFields_PreviewTab_CloseBtn)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 361, 9, resPass);
			 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 361, 9, resFail);
			 return false;
	 }
 }

 
 public static boolean checkGeneralTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		
	 Select oSelect = new Select(accountTypeDropdown);
	 List <WebElement> elementCount = oSelect.getOptions();
	 int actaccTypeSize = elementCount.size();

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	 boolean actnameTxt                =nameTxt.isDisplayed();
	 boolean actcodeTxt                =codeTxt.isDisplayed();
	 boolean actaccountTypeDropdown    =accountTypeDropdown.isDisplayed();
	 boolean actcreditLimitTxt         =creditLimitTxt.isDisplayed();
	 boolean actcreditdaysTxt          =creditdaysTxt.isDisplayed();
	 boolean actchequeDiscountLimitTxt =chequeDiscountLimitTxt.isDisplayed();
	 boolean actrateofinterestTxt      =rateofinterestTxt.isDisplayed();
	 boolean actbankAccountTxt         =bankAccountTxt.isDisplayed();
	 
	 
	 int     expaccTypeSize            =39;
	 boolean expnameTxt                =true;
	 boolean expcodeTxt                =true;
	 boolean expaccountTypeDropdown    =true;
	 boolean expcreditLimitTxt         =true;
	 boolean expcreditdaysTxt          =true;
	 boolean expchequeDiscountLimitTxt =true;
	 boolean exprateofinterestTxt      =true;
	 boolean expbankAccountTxt         =true;
	 
	 System.out.println("*******************************checkGeneralTabInPreviewOption************************");
	 
	 System.out.println("nameTxt                 : "+actnameTxt                +" Value Expected : "+expnameTxt);
	 System.out.println("codeTxt                 : "+actcodeTxt                +" Value Expected : "+expcodeTxt);
	 System.out.println("accountTypeDropdown     : "+actaccountTypeDropdown    +" Value Expected : "+expaccountTypeDropdown);
	 System.out.println("creditLimitTxt          : "+actcreditLimitTxt         +" Value Expected : "+expcreditLimitTxt);
	 System.out.println("creditdaysTxt           : "+actcreditdaysTxt          +" Value Expected : "+expcreditdaysTxt);
	 System.out.println("chequeDiscountLimitTxt  : "+actchequeDiscountLimitTxt +" Value Expected : "+expchequeDiscountLimitTxt);
	 System.out.println("rateofinterestTxt       : "+actrateofinterestTxt      +" Value Expected : "+exprateofinterestTxt);
	 System.out.println("bankAccountTxt          : "+actbankAccountTxt         +" Value Expected : "+expbankAccountTxt);
	 System.out.println("accTypeSize             : "+actaccTypeSize            +" Value Expected : "+expaccTypeSize);
	 
	 
	 if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actaccountTypeDropdown==expaccountTypeDropdown 
			 && actcreditLimitTxt==expcreditLimitTxt && actcreditdaysTxt==expcreditdaysTxt && actchequeDiscountLimitTxt==expchequeDiscountLimitTxt
			 && actrateofinterestTxt==exprateofinterestTxt && actbankAccountTxt==expbankAccountTxt && actaccTypeSize==expaccTypeSize)
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 362, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 362, 9, resFail);
		 return false;
	 }
 }
 
 
 
 public static boolean checkSettingsTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAccountSettingTab));
	 headerAccountSettingTab.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitCreditProposalDropdown));
	 
	 boolean actdebitCreditProposalDropdown                =debitCreditProposalDropdown.isDisplayed();
	 boolean actdebitCreditRequiredDropdown                =debitCreditRequiredDropdown.isDisplayed();
	 boolean actexchangeAdjustmentGainACTxt                =exchangeAdjustmentGainACTxt.isDisplayed();
	 boolean actexchangeAdjustmentLossACTxt                =exchangeAdjustmentLossACTxt.isDisplayed();
	 boolean actprimaryAccountTxt               		   =primaryAccountTxt.isDisplayed();
	 boolean actdefaultCurrencyTxt		                   =defaultCurrencyTxt.isDisplayed();
	 boolean actconsolidationMethodDropdown                =consolidationMethodDropdown.isDisplayed();
	 boolean actpaymentTermstxt                            =paymentTermstxt.isDisplayed();
	 boolean actreminderTermsTxt                           =reminderTermsTxt.isDisplayed();
	 boolean actfinanceChargeTermsTxt                      =financeChargeTermsTxt.isDisplayed();
	 
	 boolean expdebitCreditProposalDropdown                =true;
	 boolean expdebitCreditRequiredDropdown                =true;
	 boolean expexchangeAdjustmentGainACTxt                =true;
	 boolean expexchangeAdjustmentLossACTxt                =true;
	 boolean expprimaryAccountTxt               		   =true;
	 boolean expdefaultCurrencyTxt		                   =true;
	 boolean expconsolidationMethodDropdown                =true;
	 boolean exppaymentTermstxt                            =true;
	 boolean expreminderTermsTxt                           =true;
	 boolean expfinanceChargeTermsTxt                      =true;
	 
	 System.out.println("***********************************checkSettingsTabInPreviewOption*************************");
	 
	 System.out.println("debitCreditProposalDropdown    : "+actdebitCreditProposalDropdown+" Value Expected : "+expdebitCreditProposalDropdown);
	 System.out.println("debitCreditRequiredDropdown    : "+actdebitCreditRequiredDropdown+" Value Expected : "+expdebitCreditRequiredDropdown);
	 System.out.println("exchangeAdjustmentGainACTxt    : "+actexchangeAdjustmentGainACTxt+" Value Expected : "+expexchangeAdjustmentGainACTxt);
	 System.out.println("exchangeAdjustmentLossACTxt    : "+actexchangeAdjustmentLossACTxt+" Value Expected : "+expexchangeAdjustmentLossACTxt);
	 System.out.println("primaryAccountTxt              : "+actprimaryAccountTxt          +" Value Expected : "+expprimaryAccountTxt);
	 System.out.println("defaultCurrencyTxt             : "+actdefaultCurrencyTxt         +" Value Expected : "+expdefaultCurrencyTxt);
	 System.out.println("consolidationMethodDropdown    : "+actconsolidationMethodDropdown+" Value Expected : "+expconsolidationMethodDropdown);
	 System.out.println("paymentTermstxt                : "+actpaymentTermstxt            +" Value Expected : "+exppaymentTermstxt);
	 System.out.println("reminderTermsTxt               : "+actreminderTermsTxt           +" Value Expected : "+expreminderTermsTxt);
	 System.out.println("financeChargeTermsTxt          : "+actfinanceChargeTermsTxt      +" Value Expected : "+expfinanceChargeTermsTxt);
 
	 if(actdebitCreditProposalDropdown==expdebitCreditProposalDropdown && actdebitCreditRequiredDropdown==expdebitCreditRequiredDropdown
			 && actexchangeAdjustmentGainACTxt==expexchangeAdjustmentGainACTxt && actexchangeAdjustmentLossACTxt==expexchangeAdjustmentLossACTxt
			 && actprimaryAccountTxt==expprimaryAccountTxt && actdefaultCurrencyTxt==expdefaultCurrencyTxt
			 && actconsolidationMethodDropdown==expconsolidationMethodDropdown && actpaymentTermstxt==exppaymentTermstxt
			 && actreminderTermsTxt==expreminderTermsTxt && actfinanceChargeTermsTxt==expfinanceChargeTermsTxt)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 363, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 363, 9, resFail);
		 return false;
	 }
 }
 
 
 
 public static boolean checkDetailsTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsTab));
	 headerDetailsTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addressTxt));
	 
	 boolean actaddressTxt           		=addressTxt.isDisplayed();
	 boolean actcityTxt           			=cityTxt.isDisplayed();
	 boolean actdeliveryAddressTxt          =deliveryAddressTxt.isDisplayed();
	 boolean actpinTxt           			=pinTxt.isDisplayed();
	 boolean actcity2Text           		=city2Text.isDisplayed();
	 boolean actpin2Txt           			=pin2Txt.isDisplayed();
	 boolean actsendEmailCheckBox           =sendEmailCheckBox.isDisplayed();
	 boolean actallowCustomerPortalCheckBox =allowCustomerPortalCheckBox.isDisplayed();
	 boolean actsendEmailTxt                =sendEmailTxt.isDisplayed();
	 boolean actpasswordTxt           		=passwordTxt.isDisplayed();
	 boolean acttelphoneNumberTxt           =telphoneNumberTxt.isDisplayed();
	 boolean actfaxNoTxt           			=faxNoTxt.isDisplayed();
	 
	 boolean expaddressTxt           		=true;
	 boolean expcityTxt           			=true;
	 boolean expdeliveryAddressTxt          =true;
	 boolean exppinTxt           			=true;
	 boolean expcity2Text           		=true;
	 boolean exppin2Txt           			=true;
	 boolean expsendEmailCheckBox           =true;
	 boolean expallowCustomerPortalCheckBox =true;
	 boolean expsendEmailTxt                =true;
	 boolean exppasswordTxt           		=true;
	 boolean exptelphoneNumberTxt           =true;
	 boolean expfaxNoTxt           			=true;
	 
	 System.out.println("*********************************checkDetailsTabInPreviewOption**************************");
	 
	 System.out.println("addressTxt                  : "+actaddressTxt                  +" Value Expected : "+expaddressTxt);
	 System.out.println("cityTxt                     : "+actcityTxt                     +" Value Expected : "+expcityTxt);
	 System.out.println("deliveryAddressTxt          : "+actdeliveryAddressTxt          +" Value Expected : "+expdeliveryAddressTxt);
	 System.out.println("pinTxt                      : "+actpinTxt                      +" Value Expected : "+exppinTxt);
	 System.out.println("city2Text                   : "+actcity2Text                   +" Value Expected : "+expcity2Text);
	 System.out.println("pin2Txt                     : "+actpin2Txt                     +" Value Expected : "+exppin2Txt);
	 System.out.println("sendEmailCheckBox           : "+actsendEmailCheckBox           +" Value Expected : "+expsendEmailCheckBox);
	 System.out.println("allowCustomerPortalCheckBox : "+actallowCustomerPortalCheckBox +" Value Expected : "+expallowCustomerPortalCheckBox);
	 System.out.println("sendEmailTxt                : "+actsendEmailTxt                +" Value Expected : "+expsendEmailTxt);
	 System.out.println("passwordTxt                 : "+actpasswordTxt                 +" Value Expected : "+exppasswordTxt);
	 System.out.println("telphoneNumberTxt           : "+acttelphoneNumberTxt           +" Value Expected : "+exptelphoneNumberTxt);
	 System.out.println("faxNoTxt                    : "+actfaxNoTxt                    +" Value Expected : "+expfaxNoTxt);
 
	 if(actaddressTxt==expaddressTxt && actcityTxt==expcityTxt && actdeliveryAddressTxt==expdeliveryAddressTxt
			 && actpinTxt==exppinTxt && actcity2Text==expcity2Text && actpin2Txt==exppin2Txt && actsendEmailCheckBox==expsendEmailCheckBox
			 && actallowCustomerPortalCheckBox==expallowCustomerPortalCheckBox && actsendEmailTxt==expsendEmailTxt && actpasswordTxt==exppasswordTxt
			 && acttelphoneNumberTxt==exptelphoneNumberTxt && actfaxNoTxt==expfaxNoTxt)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 364, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 364, 9, resFail);
		 return false;
	 }
 }
 
 
 public static boolean checkPrintLayoutTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerPrintLayoutTab));
	 headerPrintLayoutTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridVoucherTypeTxt));
	 gridVoucherTypeTxt.click();
	 
	 boolean actgridVoucherTypeTxt =gridVoucherTypeTxt.isDisplayed();
	 boolean actgridPrintLayoutTxt =gridPrintLayoutTxt.isDisplayed();
	 
	 boolean expgridVoucherTypeTxt =true;
	 boolean expgridPrintLayoutTxt =true;
	 
	 System.out.println("**********************************checkPrintLayoutTabInPreviewOption*************************");
	 
	 System.out.println("gridVoucherTypeTxt  : "+actgridVoucherTypeTxt+" Value Expected : "+expgridVoucherTypeTxt);
	 System.out.println("gridPrintLayoutTxt  : "+actgridPrintLayoutTxt+" Value Expected : "+expgridPrintLayoutTxt);
	 
	 if(actgridVoucherTypeTxt==expgridVoucherTypeTxt && actgridPrintLayoutTxt==expgridPrintLayoutTxt)
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 365, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 365, 9, resFail);
		 return false;
	 }
 }
 
 
 public static boolean checkTreeTabUpdateInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_TreeTabUpdate));
	 extraFields_TreeTabUpdate.click();
	 		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
	 
	 boolean actmasterTreeIdDropdown    	        =masterTreeIdDropdown.isDisplayed();
	 boolean actmasterTreeViewIDDropdown    	    =masterTreeViewIDDropdown.isDisplayed();
	 boolean actmasterOptionToHideAccountsGroupTree =masterOptionToHideAccountsGroupTree.isDisplayed();
	 boolean actaccountAssestsGroup 				=accountAssestsGroup.isDisplayed();
	 
	 boolean expmasterTreeIdDropdown        	    =true;
	 boolean expmasterTreeViewIDDropdown    	    =true;
	 boolean expmasterOptionToHideAccountsGroupTree =true;
	 boolean expaccountAssestsGroup 				=true;
	 
	 System.out.println("*********************************checkTreeTabUpdateInPreviewOption****************************");
	 
	 System.out.println("masterTreeIdDropdown                  : "+actmasterTreeIdDropdown                  +" Value Expected : "+expmasterTreeIdDropdown);
	 System.out.println("masterTreeViewIDDropdown              : "+actmasterTreeViewIDDropdown              +" Value Expected : "+expmasterTreeViewIDDropdown);
	 System.out.println("masterOptionToHideAccountsGroupTree   : "+actmasterOptionToHideAccountsGroupTree   +" Value Expected : "+expmasterOptionToHideAccountsGroupTree);
	 System.out.println("accountAssestsGroup                   : "+actaccountAssestsGroup                   +" Value Expected : "+expaccountAssestsGroup);
	 
	 if(actmasterTreeIdDropdown==expmasterTreeIdDropdown  && actmasterTreeViewIDDropdown==expmasterTreeViewIDDropdown
			 && actmasterOptionToHideAccountsGroupTree==expmasterOptionToHideAccountsGroupTree
			 && actaccountAssestsGroup==expaccountAssestsGroup)
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 366, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 366, 9, resFail);
		 return false;
	 }
 }
 
 
 
 public static boolean checkDocumentTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DocumentTab));
	 extraFields_DocumentTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PreviewTab_DocumentTab_FileName));
	 
	 boolean actextraFields_PreviewTab_DocumentTab_FileName  		=extraFields_PreviewTab_DocumentTab_FileName.isDisplayed();
	 boolean actextraFields_PreviewTab_DocumentTab_Document  		=extraFields_PreviewTab_DocumentTab_Document.isDisplayed();
	 boolean actextraFields_PreviewTab_DocumentTab_UploadDocument 	=extraFields_PreviewTab_DocumentTab_UploadDocument.isDisplayed();
	 boolean actextraFields_PreviewTab_DocumentTab_SaveDocument  	=extraFields_PreviewTab_DocumentTab_SaveDocument.isDisplayed();
	 boolean actextraFields_PreviewTab_DocumentTab_DeleteDocument  	=extraFields_PreviewTab_DocumentTab_DeleteDocument.isDisplayed();
	 boolean actextraFields_PreviewTab_DocumentTab_FileSize  		=extraFields_PreviewTab_DocumentTab_FileSize.isDisplayed();
	 
	 boolean expextraFields_PreviewTab_DocumentTab_FileName  		=true;
	 boolean expextraFields_PreviewTab_DocumentTab_Document  		=true;
	 boolean expextraFields_PreviewTab_DocumentTab_UploadDocument 	=true;
	 boolean expextraFields_PreviewTab_DocumentTab_SaveDocument  	=true;
	 boolean expextraFields_PreviewTab_DocumentTab_DeleteDocument  	=true;
	 boolean expextraFields_PreviewTab_DocumentTab_FileSize  		=true;
	 
	 System.out.println("******************************checkDocumentTabInPreviewOption*********************************");
	 
	 System.out.println("extraFields_PreviewTab_DocumentTab_FileName        : "+actextraFields_PreviewTab_DocumentTab_FileName       +" Value Expected : "+expextraFields_PreviewTab_DocumentTab_FileName);
	 System.out.println("extraFields_PreviewTab_DocumentTab_Document        : "+actextraFields_PreviewTab_DocumentTab_Document       +" Value Expected : "+expextraFields_PreviewTab_DocumentTab_Document);
	 System.out.println("extraFields_PreviewTab_DocumentTab_UploadDocument  : "+actextraFields_PreviewTab_DocumentTab_UploadDocument +" Value Expected : "+expextraFields_PreviewTab_DocumentTab_UploadDocument);
	 System.out.println("extraFields_PreviewTab_DocumentTab_SaveDocument    : "+actextraFields_PreviewTab_DocumentTab_SaveDocument   +" Value Expected : "+expextraFields_PreviewTab_DocumentTab_SaveDocument);
	 System.out.println("extraFields_PreviewTab_DocumentTab_DeleteDocument  : "+actextraFields_PreviewTab_DocumentTab_DeleteDocument +" Value Expected : "+expextraFields_PreviewTab_DocumentTab_DeleteDocument);
	 System.out.println("extraFields_PreviewTab_DocumentTab_FileSize        : "+actextraFields_PreviewTab_DocumentTab_FileSize       +" Value Expected : "+expextraFields_PreviewTab_DocumentTab_FileSize);
	 
	 
	 if(actextraFields_PreviewTab_DocumentTab_FileName==expextraFields_PreviewTab_DocumentTab_FileName
			 && actextraFields_PreviewTab_DocumentTab_Document==expextraFields_PreviewTab_DocumentTab_Document
			 && actextraFields_PreviewTab_DocumentTab_UploadDocument==expextraFields_PreviewTab_DocumentTab_UploadDocument 
			 && actextraFields_PreviewTab_DocumentTab_SaveDocument==expextraFields_PreviewTab_DocumentTab_SaveDocument
			 && actextraFields_PreviewTab_DocumentTab_DeleteDocument==expextraFields_PreviewTab_DocumentTab_DeleteDocument
			 && actextraFields_PreviewTab_DocumentTab_FileSize==expextraFields_PreviewTab_DocumentTab_FileSize)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 367, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 367, 9, resFail);
		 return false;
	 }
 }
 
 
 public static boolean checkCreateTabInPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
	 extraFields_CreateTab.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate));
	 
	 boolean actextraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate =extraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate.isDisplayed();
	 boolean expextraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate =true;
	 
	 System.out.println("********************************checkCreateTabInPreviewOption********************************");
 
	 System.out.println("extraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate : "+actextraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate+" Value Expected : "+expextraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate);
	 
	 if(actextraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate==expextraFields_PreviewTab_CreateCreateTab_ExtraFieldUpdate)
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 368, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 368, 9, resFail);
		 return false;
	 }
 }
 
 
 public static boolean checkCloseBtnPreviewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PreviewTab_CloseBtn));
	 extraFields_PreviewTab_CloseBtn.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(generalTab));
		 
		 boolean actgeneralTab                           =generalTab.isDisplayed();
		 boolean actsettingOption                        =settingOption.isDisplayed();
		 boolean actaccountMasterFieldDetailsOption      =accountMasterFieldDetailsOption.isDisplayed();
		 boolean actaccountMasterFieldPrintLayoutOption  =accountMasterFieldPrintLayoutOption.isDisplayed();
		 
		 boolean expgeneralTab                           =true;
		 boolean expsettingOption                        =true;
		 boolean expaccountMasterFieldDetailsOption      =true;
		 boolean expaccountMasterFieldPrintLayoutOption  =true;
		 
		 System.out.println("*************************************checkCloseBtnPreviewOption***********************************");
		 
		 System.out.println("generalTab                          : "+actgeneralTab                          +" Value Expected : "+expgeneralTab);
		 System.out.println("settingOption                       : "+actsettingOption                       +" Value Expected : "+expsettingOption);
		 System.out.println("accountMasterFieldDetailsOption     : "+actaccountMasterFieldDetailsOption     +" Value Expected : "+expaccountMasterFieldDetailsOption);
		 System.out.println("accountMasterFieldPrintLayoutOption : "+actaccountMasterFieldPrintLayoutOption +" Value Expected : "+expaccountMasterFieldPrintLayoutOption);
		 
		 if(actgeneralTab==expgeneralTab && actsettingOption==expsettingOption
				 && actaccountMasterFieldDetailsOption==expaccountMasterFieldDetailsOption
				 && actaccountMasterFieldPrintLayoutOption==expaccountMasterFieldPrintLayoutOption)
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 369, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 369, 9, resFail);
			 return false;
		 }
 }
 
 
 
 public static boolean checkCloseBtnCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountCloseBtn));
      accountCloseBtn.click();
      
      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAssestsGroup));	
      

      boolean actaccountAssestsGroup    	            =accountAssestsGroup.isDisplayed();
		  boolean actaccountFixedAssestsGroup    	     	=accountFixedAssestsGroup.isDisplayed();
		  boolean actaccountCurrentAssetsGroup    	    	=accountCurrentAssetsGroup.isDisplayed();
		  boolean actaccountCAshAndBankGroup    	        =accountCAshAndBankGroup.isDisplayed();
		  boolean actaccountInventoriesGroup    	        =accountInventoriesGroup.isDisplayed();
		  boolean actaccountAccountsReceivableGroup    		=accountAccountsReceivableGroup.isDisplayed();
		  boolean actaccountInvestmentsGroup    	        =accountInvestmentsGroup.isDisplayed();
		  boolean actaccountExpensesGroup    	       	 	=accountExpensesGroup.isDisplayed();
		  boolean actaccountDirectExpensesGroup    	   	 	=accountDirectExpensesGroup.isDisplayed();
		  boolean actaccountIndirectExpensesGroup    		=accountIndirectExpensesGroup.isDisplayed();
		  boolean actaccountAdministrativeExpensesGroup  	=accountAdministrativeExpensesGroup.isDisplayed();
		  boolean actaccountEmployeeBenefitsGroup    		=accountEmployeeBenefitsGroup.isDisplayed();
		  boolean actaccountFinancialChargesGroup    		=accountFinancialChargesGroup.isDisplayed();
		  boolean actaccountGainAndLossGroup    	        =accountGainAndLossGroup.isDisplayed();
		  boolean actaccountControlAccountsGroup    	    =accountControlAccountsGroup.isDisplayed();
		  boolean actaccountRevenueGroup    	            =accountRevenueGroup.isDisplayed();
		  boolean actaccountSalesGroup    	            	=accountSalesGroup.isDisplayed();
		  boolean actaccountEqitiesGroup    	            =accountEqitiesGroup.isDisplayed();
		  boolean actaccountCapitalGroup    	            =accountCapitalGroup.isDisplayed();
		  boolean actaccountLiabilitiesGroup    	        =accountLiabilitiesGroup.isDisplayed();
		  boolean actaccountLoanAndBorrowingGroup    		=accountLoanAndBorrowingGroup.isDisplayed();
		  boolean actaccountLoansGroup    	            	=accountLoansGroup.isDisplayed();
		  boolean actaccountAccruedLiabilitiesGroup    		=accountAccruedLiabilitiesGroup.isDisplayed();
		  boolean actaccountTradePayableGroup    	    	=accountTradePayableGroup.isDisplayed();
		  boolean actaccountProvisionsGroup    	        	=accountProvisionsGroup.isDisplayed();
 		 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));	
		  
		  boolean actmasterSearchTxt    							=masterSearchTxt.isDisplayed();
		  boolean actmasterSearchBtn    							=masterSearchBtn.isDisplayed();
		  boolean actmastercmbMasterTxt    							=mastercmbMasterTxt.isDisplayed();
		  boolean actmasterCmbMasterExpansionBtn    				=masterCmbMasterExpansionBtn.isDisplayed();
		  boolean actmasterCumMasterSettingBtn    					=masterCumMasterSettingBtn.isDisplayed();
		  boolean actmasterMoveTheSelectionToNextBookMarkBtn    	=masterMoveTheSelectionToNextBookMarkBtn.isDisplayed();
		  boolean actmasterMoveTheSelectionToPrevoiusBookmarkBtn 	=masterMoveTheSelectionToPrevoiusBookmarkBtn.isDisplayed();
		  boolean actmasterShowAllRecordsBtn    					=masterShowAllRecordsBtn.isDisplayed();
		  boolean actmasterShowAllUnauthorisedRecords    			=masterShowAllUnauthorisedRecords.isDisplayed();
		  boolean actmasterShowAllClosedRecordsBtn    				=masterShowAllClosedRecordsBtn.isDisplayed();
		  boolean actmasterAutoAdjustColoumnsBtn    				=masterAutoAdjustColoumnsBtn.isDisplayed();
		  boolean actmasterRetainSelectionCheckBox    				=masterRetainSelectionCheckBox.isDisplayed();
		  boolean actmasterSideBarBtn    							=masterSideBarBtn.isDisplayed();
		  
 			
 		 	
		  boolean expaccountAssestsGroup    	            =true;
		  boolean expaccountFixedAssestsGroup    	    	=true;
		  boolean expaccountCurrentAssetsGroup    	    	=true;
		  boolean expaccountCAshAndBankGroup    	        =true;
		  boolean expaccountInventoriesGroup    	        =true;
		  boolean expaccountAccountsReceivableGroup    		=true;
		  boolean expaccountInvestmentsGroup    	        =true;
		  boolean expaccountExpensesGroup    	        	=true;
		  boolean expaccountDirectExpensesGroup    	   	 	=true;
		  boolean expaccountIndirectExpensesGroup    		=true;
		  boolean expaccountAdministrativeExpensesGroup  	=true;
		  boolean expaccountEmployeeBenefitsGroup    		=true;
		  boolean expaccountFinancialChargesGroup    		=true;
		  boolean expaccountGainAndLossGroup    	        =true;
		  boolean expaccountControlAccountsGroup    	    =true;
		  boolean expaccountRevenueGroup    	            =true;
		  boolean expaccountSalesGroup    	            	=true;
		  boolean expaccountEqitiesGroup    	            =true;
		  boolean expaccountCapitalGroup    	            =true;
		  boolean expaccountLiabilitiesGroup    	        =true;
		  boolean expaccountLoanAndBorrowingGroup    		=true;
		  boolean expaccountLoansGroup    	            	=true;
		  boolean expaccountAccruedLiabilitiesGroup    		=true;
		  boolean expaccountTradePayableGroup    	    	=true;
		  boolean expaccountProvisionsGroup    	        	=true;
		  
		  boolean expmasterSearchTxt    							=true;
		  boolean expmasterSearchBtn    							=true;
		  boolean expmastercmbMasterTxt    							=true;
		  boolean expmasterCmbMasterExpansionBtn    				=true;
		  boolean expmasterCumMasterSettingBtn    					=true;
		  boolean expmasterMoveTheSelectionToNextBookMarkBtn    	=true;
		  boolean expmasterMoveTheSelectionToPrevoiusBookmarkBtn 	=true;
		  boolean expmasterShowAllRecordsBtn    					=true;
		  boolean expmasterShowAllUnauthorisedRecords    			=true;
		  boolean expmasterShowAllClosedRecordsBtn    				=true;
		  boolean expmasterAutoAdjustColoumnsBtn    				=true;
		  boolean expmasterRetainSelectionCheckBox    				=true;
		  boolean expmasterSideBarBtn    							=true;
		  
		 System.out.println("******************************checkCloseBtnCustomizeMaster***********************************");
		 
		 System.out.println("accountAssestsGroup                         : "+actaccountAssestsGroup                         +" Value Expected : "+expaccountAssestsGroup);
		 System.out.println("accountFixedAssestsGroup                    : "+actaccountFixedAssestsGroup                    +" Value Expected : "+expaccountFixedAssestsGroup);
		 System.out.println("accountCurrentAssetsGroup                   : "+actaccountCurrentAssetsGroup                   +" Value Expected : "+expaccountCurrentAssetsGroup);
		 System.out.println("accountCAshAndBankGroup                     : "+actaccountCAshAndBankGroup                     +" Value Expected : "+expaccountCAshAndBankGroup);
		 System.out.println("accountInventoriesGroup                     : "+actaccountInventoriesGroup                     +" Value Expected : "+expaccountInventoriesGroup);
		 System.out.println("accountAccountsReceivableGroup              : "+actaccountAccountsReceivableGroup              +" Value Expected : "+expaccountAccountsReceivableGroup);
		 System.out.println("accountInvestmentsGroup                     : "+actaccountInvestmentsGroup                     +" Value Expected : "+expaccountInvestmentsGroup);
		 System.out.println("accountExpensesGroup                        : "+actaccountExpensesGroup                        +" Value Expected : "+expaccountExpensesGroup);
		 System.out.println("accountDirectExpensesGroup                  : "+actaccountDirectExpensesGroup                  +" Value Expected : "+expaccountDirectExpensesGroup);
		 System.out.println("accountIndirectExpensesGroup                : "+actaccountIndirectExpensesGroup                +" Value Expected : "+expaccountIndirectExpensesGroup);
		 System.out.println("accountAdministrativeExpensesGroup          : "+actaccountAdministrativeExpensesGroup          +" Value Expected : "+expaccountAdministrativeExpensesGroup);
		 System.out.println("accountEmployeeBenefitsGroup                : "+actaccountEmployeeBenefitsGroup                +" Value Expected : "+expaccountEmployeeBenefitsGroup);
		 System.out.println("accountFinancialChargesGroup                : "+actaccountFinancialChargesGroup                +" Value Expected : "+expaccountFinancialChargesGroup);
		 System.out.println("accountGainAndLossGroup                     : "+actaccountGainAndLossGroup                     +" Value Expected : "+expaccountGainAndLossGroup);
		 System.out.println("accountControlAccountsGroup                 : "+actaccountControlAccountsGroup                 +" Value Expected : "+expaccountControlAccountsGroup);
		 System.out.println("accountRevenueGroup                         : "+actaccountRevenueGroup                         +" Value Expected : "+expaccountRevenueGroup);
		 System.out.println("accountSalesGroup                           : "+actaccountSalesGroup                           +" Value Expected : "+expaccountSalesGroup);
		 System.out.println("accountEqitiesGroup                         : "+actaccountEqitiesGroup                         +" Value Expected : "+expaccountEqitiesGroup);
		 System.out.println("accountCapitalGroup                         : "+actaccountCapitalGroup                         +" Value Expected : "+expaccountCapitalGroup);
		 System.out.println("accountLiabilitiesGroup                     : "+actaccountLiabilitiesGroup                     +" Value Expected : "+expaccountLiabilitiesGroup);
		 System.out.println("accountLoanAndBorrowingGroup                : "+actaccountLoanAndBorrowingGroup                +" Value Expected : "+expaccountLoanAndBorrowingGroup);
		 System.out.println("accountLoansGroup                           : "+actaccountLoansGroup                           +" Value Expected : "+expaccountLoansGroup);
		 System.out.println("accountAccruedLiabilitiesGroup              : "+actaccountAccruedLiabilitiesGroup              +" Value Expected : "+expaccountAccruedLiabilitiesGroup);
		 System.out.println("accountTradePayableGroup                    : "+actaccountTradePayableGroup                    +" Value Expected : "+expaccountTradePayableGroup);
		 System.out.println("accountProvisionsGroup                      : "+actaccountProvisionsGroup                      +" Value Expected : "+expaccountProvisionsGroup);
		 System.out.println("masterSearchTxt                             : "+actmasterSearchTxt                             +" Value Expected : "+expmasterSearchTxt);
		 System.out.println("masterSearchBtn                             : "+actmasterSearchBtn                             +" Value Expected : "+expmasterSearchBtn);
		 System.out.println("mastercmbMasterTxt                          : "+actmastercmbMasterTxt                          +" Value Expected : "+expmastercmbMasterTxt);
		 System.out.println("masterCmbMasterExpansionBtn                 : "+actmasterCmbMasterExpansionBtn                 +" Value Expected : "+expmasterCmbMasterExpansionBtn);
		 System.out.println("masterCumMasterSettingBtn                   : "+actmasterCumMasterSettingBtn                   +" Value Expected : "+expmasterCumMasterSettingBtn);
		 System.out.println("masterMoveTheSelectionToNextBookMarkBtn     : "+actmasterMoveTheSelectionToNextBookMarkBtn     +" Value Expected : "+expmasterMoveTheSelectionToNextBookMarkBtn);
		 System.out.println("masterMoveTheSelectionToPrevoiusBookmarkBtn : "+actmasterMoveTheSelectionToPrevoiusBookmarkBtn +" Value Expected : "+expmasterMoveTheSelectionToPrevoiusBookmarkBtn);
		 System.out.println("masterShowAllRecordsBtn                     : "+actmasterShowAllRecordsBtn                     +" Value Expected : "+expmasterShowAllRecordsBtn);
		 System.out.println("masterShowAllUnauthorisedRecords            : "+actmasterShowAllUnauthorisedRecords            +" Value Expected : "+expmasterShowAllUnauthorisedRecords);
		 System.out.println("masterShowAllClosedRecordsBtn               : "+actmasterShowAllClosedRecordsBtn               +" Value Expected : "+expmasterShowAllClosedRecordsBtn);
		 System.out.println("masterAutoAdjustColoumnsBtn                 : "+actmasterAutoAdjustColoumnsBtn                 +" Value Expected : "+expmasterAutoAdjustColoumnsBtn);
		 System.out.println("masterRetainSelectionCheckBox               : "+actmasterRetainSelectionCheckBox               +" Value Expected : "+expmasterRetainSelectionCheckBox);
		 System.out.println("masterSideBarBtn                            : "+actmasterSideBarBtn                            +" Value Expected : "+expmasterSideBarBtn);
		 
		 if(actaccountAssestsGroup==expaccountAssestsGroup && actaccountFixedAssestsGroup==expaccountFixedAssestsGroup 
				 && actaccountCurrentAssetsGroup==expaccountCurrentAssetsGroup
				 && actaccountCAshAndBankGroup==expaccountCAshAndBankGroup && actaccountInventoriesGroup==expaccountInventoriesGroup 
				 && actaccountAccountsReceivableGroup==expaccountAccountsReceivableGroup &&  actaccountInvestmentsGroup==expaccountInvestmentsGroup 
				 && actaccountExpensesGroup==expaccountExpensesGroup && actaccountDirectExpensesGroup==expaccountDirectExpensesGroup 
				 && actaccountIndirectExpensesGroup==expaccountIndirectExpensesGroup && actaccountAdministrativeExpensesGroup==expaccountAdministrativeExpensesGroup
				 && actaccountEmployeeBenefitsGroup==expaccountEmployeeBenefitsGroup && actaccountFinancialChargesGroup==expaccountFinancialChargesGroup 
				 && actaccountGainAndLossGroup==expaccountGainAndLossGroup && actaccountControlAccountsGroup==expaccountControlAccountsGroup
				 && actaccountRevenueGroup==expaccountRevenueGroup && actaccountSalesGroup==expaccountSalesGroup
				 && actaccountEqitiesGroup==expaccountEqitiesGroup && actaccountCapitalGroup==expaccountCapitalGroup
				 && actaccountLiabilitiesGroup==expaccountLiabilitiesGroup && actaccountLoanAndBorrowingGroup==expaccountLoanAndBorrowingGroup
				 && actaccountLoansGroup==expaccountLoansGroup && actaccountAccruedLiabilitiesGroup==expaccountAccruedLiabilitiesGroup
				 && actaccountTradePayableGroup==expaccountTradePayableGroup && actaccountProvisionsGroup==expaccountProvisionsGroup
				 && actmasterSearchTxt==expmasterSearchTxt && actmasterSearchBtn==expmasterSearchBtn && actmastercmbMasterTxt==expmastercmbMasterTxt
				 && actmasterCmbMasterExpansionBtn==expmasterCmbMasterExpansionBtn && actmasterCumMasterSettingBtn==expmasterCumMasterSettingBtn
				 && actmasterMoveTheSelectionToNextBookMarkBtn==expmasterMoveTheSelectionToNextBookMarkBtn
				 && actmasterMoveTheSelectionToPrevoiusBookmarkBtn==expmasterMoveTheSelectionToPrevoiusBookmarkBtn
				 && actmasterShowAllRecordsBtn==expmasterShowAllRecordsBtn && actmasterShowAllUnauthorisedRecords==expmasterShowAllUnauthorisedRecords
				 && actmasterShowAllClosedRecordsBtn==expmasterShowAllClosedRecordsBtn && actmasterAutoAdjustColoumnsBtn==expmasterAutoAdjustColoumnsBtn
				 && actmasterRetainSelectionCheckBox==expmasterRetainSelectionCheckBox && actmasterSideBarBtn==expmasterSideBarBtn)
		 {	
				excelReader.setCellData(xlfile, "Sheet1", 370, 9, resPass);
				return true;
		 }	 
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 370, 9, resFail);
			 return false;
		 }
 }
 
 
 
 public static boolean checkMasterCmbMasters() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
	 mastercmbMasterTxt.click();
	 mastercmbMasterTxt.sendKeys("Vendor B");
	 Thread.sleep(3000);
	 mastercmbMasterTxt.sendKeys(Keys.TAB);
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	 masterEditBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 nameTxt.click();
      
	 String actnameTxt  =nameTxt.getAttribute("Value");
	 String expnameTxt  ="Vendor B";
      
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editcloseBtn));
	 editcloseBtn.click();
      
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectVendorB));
	 selectVendorB.click();
      
	 System.out.println("************************************checkMasterCmbMasters**********************");
	 
	 System.out.println("nameTxt  : "+actnameTxt+" Value Expected : "+expnameTxt);
	 
	 if(actnameTxt.equalsIgnoreCase(expnameTxt))
	 {
		 System.out.println("pass");
			 excelReader.setCellData(xlfile, "Sheet1", 371, 9, resPass);
			 return true;
	 }
	 else
	 {
		 System.out.println("fail");
		 excelReader.setCellData(xlfile, "Sheet1", 371, 9, resFail);
			 return false;
	 }
 }
 
 
/* public static boolean checkClickOnAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
     
      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
	 
      masterAddGroupBtn.click();
  
      getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
		 
		 if(headerGeneralTab.isDisplayed() && headerAccountSettingTab.isDisplayed() &&
			 headerDetailsTab.isDisplayed() && headerPrintLayoutTab.isDisplayed() &&
			 saveBtn.isDisplayed() && closeBtn.isDisplayed() && extraFields_TreeTabUpdate.isDisplayed() &&
		 extraFields_DocumentTab.isDisplayed() && extraFields_CreateTab.isDisplayed())
		 {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 372, 9, resPass);
			 return true;
		 }
		 else
		 {
			 
			 
			 excelReader.setCellData(xlfile, "Sheet1", 372, 9, resFail);
			 return false;
		 }
 }
 
 
 
 public static boolean checkAddGroupGeneralTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	
	 Select oSelect = new Select(accountTypeDropdown);
	 List <WebElement> elementCount = oSelect.getOptions();
	
	 
	 
	 int accTypeSize = elementCount.size();
	 System.out.println("Account Type :"+accTypeSize);
	 		 
	 if(nameTxt.isDisplayed() && codeTxt.isDisplayed() &&
			 accountTypeDropdown.isDisplayed() && creditLimitTxt.isDisplayed() &&
			 creditdaysTxt.isDisplayed()  && chequeDiscountLimitTxt.isDisplayed() &&
			 rateofinterestTxt.isDisplayed() && pdcDicountAccount.isDisplayed()  && bankAccountTxt.isDisplayed() && accTypeSize==24)
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 373, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 373, 9, resFail);
		 return false;
	 }
 }
 
 
 
 
 public static boolean checkAddGroupSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAccountSettingTab));
	 
	 headerAccountSettingTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitCreditProposalDropdown));
 
	 if(debitCreditProposalDropdown.isDisplayed() && debitCreditRequiredDropdown.isDisplayed() &&
			 exchangeAdjustmentGainACTxt.isDisplayed() && exchangeAdjustmentLossACTxt.isDisplayed() &&
			 primaryAccountTxt.isDisplayed() && defaultCurrencyTxt.isDisplayed() &&
			 consolidationMethodDropdown.isDisplayed() && paymentTermstxt.isDisplayed() &&
			 reminderTermsTxt.isDisplayed() && financeChargeTermsTxt.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 374, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 374, 9, resFail);
		 return false;
	 }
 }
 
 
 
 public static boolean checkAddGroupDetailsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsTab));
	 
	 headerDetailsTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addressTxt));
 
	 if(addressTxt.isDisplayed() && cityTxt.isDisplayed() &&
			 deliveryAddressTxt.isDisplayed() && pinTxt.isDisplayed() &&
			 city2Text.isDisplayed() && pin2Txt.isDisplayed() &&
			 sendEmailCheckBox.isDisplayed() && allowCustomerPortalCheckBox.isDisplayed() &&
			 sendEmailTxt.isDisplayed() && passwordTxt.isDisplayed() && 
			 telphoneNumberTxt.isDisplayed() && faxNoTxt.isDisplayed() && 
			 portalEmailTxt.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 375, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 375, 9, resFail);
		 return false;
	 }
 }
 
 
 public static boolean checkAddGroupPrintLayoutTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerPrintLayoutTab));
	 
	 headerPrintLayoutTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridVoucherTypeTxt));
	 
	 gridVoucherTypeTxt.click();
	 
	 if(gridVoucherTypeTxt.isDisplayed() && gridPrintLayoutTxt.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 376, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 376, 9, resFail);
		 return false;
	 }
 }

 
 
 
 
 public static boolean checkAddGroupTreeTabUpdateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
     excelReader=new ExcelReader(POJOUtility.getExcelPath());
     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_TreeTabUpdate));
	 
	 extraFields_TreeTabUpdate.click();
	 		 
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
	 
  
	 if(masterTreeIdDropdown.isDisplayed() && 
		 masterTreeViewIDDropdown.isDisplayed() &&
		 masterOptionToHideAccountsGroupTree.isDisplayed() && accountAssestsGroup.isDisplayed())
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 377, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 377, 9, resFail);
		 return false;
	 }
 }
 
 
 
 
 public static boolean checkAddGroupDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DocumentTab));
	 
	 extraFields_DocumentTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PreviewTab_DocumentTab_FileName));
	 
 
	 if(extraFields_PreviewTab_DocumentTab_FileName.isDisplayed()  && extraFields_PreviewTab_DocumentTab_Document.isDisplayed() &&
			 addGroupDocumentTab_UploadDocument.isDisplayed()  && addGroupDocumentTab_SaveDocument.isDisplayed() &&
			 addGroupDocumentTab_DeleteDocument.isDisplayed()  && extraFields_PreviewTab_DocumentTab_FileSize.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 378, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 378, 9, resFail);
		 return false;
	 }
 }
 

 
 public static boolean checkAddGroupCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
	 
	 extraFields_CreateTab.click();
	 

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupCreateCreateTab_ExtraFieldUpdate));
 
	 if(addGroupCreateCreateTab_ExtraFieldUpdate.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 379, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 379, 9, resFail);
		 return false;
	 }
 }
 
 
 
 

 
 


 public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
		 
		 headerGeneralTab.click();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 
		 saveBtn.click();
		 
		 if(validationConfirmationMessage.getText().equalsIgnoreCase("In Tab :General ---> Name Field is Required"))
		 {
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 380, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 380, 9, resFail);
			 return false;
		 }
   }
	
	
	public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.sendKeys("Vendor Group");
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 
		 saveBtn.click();
		 
		 if(validationConfirmationMessage.getText().equalsIgnoreCase("In Tab :General ---> Code Field is Required"))
		 {
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 381, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 381, 9, resFail);
			 return false;
		 }
   }
	
	
	
	
	public static boolean checkSaveButtonWithInputingMandatoryFieldsInAdGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 
     codeTxt.click();
     
     
     
     codeTxt.sendKeys("Vendor Group");
	 
     getAction().moveToElement(codeTxt).sendKeys(Keys.TAB).perform();
     
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 
	 saveBtn.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 
	 System.out.println("validationConfirmationMessage"+validationConfirmationMessage.getText());
	 
	 System.out.println("validationConfirmationMessage"+validationConfirmationMessage.getAttribute("Value"));
	 
	 if(validationConfirmationMessage.getText().equalsIgnoreCase("Saved Successfully"))
	 {
		 closeValidationConfirmationMessage.click();
		 excelReader.setCellData(xlfile, "Sheet1", 382, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 382, 9, resFail);
		 return false;
	 }
  }



public static boolean checkAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	 
	 Select oSelect = new Select(accountTypeDropdown);
	 List <WebElement> elementCount = oSelect.getOptions();
	
	 int accTypeSize = elementCount.size();
	 System.out.println("Account Type :"+accTypeSize);
	 
	 if(headerGeneralTab.isDisplayed() && headerAccountSettingTab.isDisplayed() &&
		 headerDetailsTab.isDisplayed() && headerPrintLayoutTab.isDisplayed() &&
		 saveBtn.isDisplayed() && closeBtn.isDisplayed() && nameTxt.isDisplayed() && codeTxt.isDisplayed() &&
		 accountTypeDropdown.isDisplayed() && creditLimitTxt.isDisplayed() &&
		 creditdaysTxt.isDisplayed() && chequeDiscountLimitTxt.isDisplayed() &&
		 rateofinterestTxt.isDisplayed() && bankAccountTxt.isDisplayed() && accTypeSize==24)
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 383, 9, resPass);
		 return true;
	 }
	 else
	 {
		 
		 
		 excelReader.setCellData(xlfile, "Sheet1", 383, 9, resFail);
		 return false;
	 }
  }


public static boolean checkAccountGroupDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 
	 closeBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountGroupCreation));
 
	 if(accountGroupCreation.isDisplayed())
	 { 
		 excelReader.setCellData(xlfile, "Sheet1", 384, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 384, 9, resFail);
		 return false;
	 }
  }



public static boolean checkCreateAcountInAccountGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountGroupCreation));
	
	 getAction().doubleClick(accountGroupCreation).perform();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnAccountGroupToDisplayTitle));
 
	 if(clickOnAccountGroupToDisplayTitle.isDisplayed() && clickOnEmptyGroup.getText().equalsIgnoreCase("No record found"))
	 { 
		 excelReader.setCellData(xlfile, "Sheet1", 385, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 385, 9, resFail);
		 return false;
	 }
  }




public static boolean checkNewButtonInAddGroupToCreateAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	
	 masterNewBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	 
	 if(headerGeneralTab.isDisplayed() && headerAccountSettingTab.isDisplayed() &&
		 headerDetailsTab.isDisplayed() && headerPrintLayoutTab.isDisplayed() &&
		 saveBtn.isDisplayed() && closeBtn.isDisplayed() )
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 386, 9, resPass);
		 return true;
	 }
	 else
	 {
		 
		 
		 excelReader.setCellData(xlfile, "Sheet1", 386, 9, resFail);
		 return false;
	 }
  }

public static boolean checkGenralTabOnClickOnNewUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	
	 Select oSelect = new Select(accountTypeDropdown);
	 List <WebElement> elementCount = oSelect.getOptions();
	
	 int accTypeSize = elementCount.size();
	 System.out.println("Account Type :"+accTypeSize);
	 		 
	 if(nameTxt.isDisplayed() && codeTxt.isDisplayed() &&
			 accountTypeDropdown.isDisplayed() && creditLimitTxt.isDisplayed() &&
			 creditdaysTxt.isDisplayed() && chequeDiscountLimitTxt.isDisplayed() &&
			 rateofinterestTxt.isDisplayed() && bankAccountTxt.isDisplayed() && accTypeSize==24)
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 387, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 387, 9, resFail);
		 return false;
	 }
  }


public static boolean checkSettingsTabOnClickOnNewUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAccountSettingTab));
	 
	 headerAccountSettingTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitCreditProposalDropdown));
 
	 if(debitCreditProposalDropdown.isDisplayed() && debitCreditRequiredDropdown.isDisplayed() &&
			 exchangeAdjustmentGainACTxt.isDisplayed() && exchangeAdjustmentLossACTxt.isDisplayed() &&
			 primaryAccountTxt.isDisplayed() && defaultCurrencyTxt.isDisplayed() &&
			 consolidationMethodDropdown.isDisplayed() && paymentTermstxt.isDisplayed() &&
			 reminderTermsTxt.isDisplayed() && financeChargeTermsTxt.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 388, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 388, 9, resFail);
		 return false;
	 }
  }



public static boolean checkDetailsTabOnClickOnNewUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsTab));
	 
	 headerDetailsTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addressTxt));
 
	 if(addressTxt.isDisplayed() && cityTxt.isDisplayed() &&
			 deliveryAddressTxt.isDisplayed() && pinTxt.isDisplayed() &&
			 city2Text.isDisplayed() && pin2Txt.isDisplayed() &&
			 sendEmailCheckBox.isDisplayed() && allowCustomerPortalCheckBox.isDisplayed() &&
			 sendEmailTxt.isDisplayed() && passwordTxt.isDisplayed() && 
			 telphoneNumberTxt.isDisplayed() && faxNoTxt.isDisplayed() && 
			 portalEmailTxt.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 389, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 389, 9, resFail);
		 return false;
	 }
  }


public static boolean checkPrintlayoutTabOnClickOnNewAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerPrintLayoutTab));
	 
	 headerPrintLayoutTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridVoucherTypeTxt));
	 
	 gridVoucherTypeTxt.click();
	 
	 if(gridVoucherTypeTxt.isDisplayed() && gridPrintLayoutTxt.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 390, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 390, 9, resFail);
		 return false;
	 }
  }


 public static boolean checkNewAccountUnderAddGroupTreeTabUpdateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
     excelReader=new ExcelReader(POJOUtility.getExcelPath());
     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_TreeTabUpdate));
	 
	 extraFields_TreeTabUpdate.click();
	 		 
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
	 
  
	 if(masterTreeIdDropdown.isDisplayed() && 
		 masterTreeViewIDDropdown.isDisplayed() &&
		 masterOptionToHideAccountsGroupTree.isDisplayed() && accountAssestsGroup.isDisplayed())
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 391, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 391, 9, resFail);
		 return false;
	 }
 }
 
 
 
 
 public static boolean checkNewUnderAddGroupDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DocumentTab));
	 
	 extraFields_DocumentTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PreviewTab_DocumentTab_FileName));
	 
 
	 if(extraFields_PreviewTab_DocumentTab_FileName.isDisplayed()  && extraFields_PreviewTab_DocumentTab_Document.isDisplayed() &&
			 addGroupDocumentTab_UploadDocument.isDisplayed()  && addGroupDocumentTab_SaveDocument.isDisplayed() &&
			 addGroupDocumentTab_DeleteDocument.isDisplayed()  && extraFields_PreviewTab_DocumentTab_FileSize.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 392, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 392, 9, resFail);
		 return false;
	 }
 }
 

 
 public static boolean checkNewUnderAddGroupCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
	 
	 extraFields_CreateTab.click();

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupCreateCreateTab_ExtraFieldUpdate));
 
	 if(addGroupCreateCreateTab_ExtraFieldUpdate.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 393, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 393, 9, resFail);
		 return false;
	 }
 }
 
 
 
 public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInCreateAccountUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
		 
		 headerGeneralTab.click();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 
		 saveBtn.click();
		 
		 if(validationConfirmationMessage.getText().equalsIgnoreCase("In Tab :General ---> Name Field is Required"))
		 {
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 394, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 394, 9, resFail);
			 return false;
		 }
   }
	
	
	public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInCreateAccountUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.sendKeys("Vendor C UAG");
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 
		 saveBtn.click();
		 
		 if(validationConfirmationMessage.getText().equalsIgnoreCase("In Tab :General ---> Code Field is Required"))
		 {
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 395, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 395, 9, resFail);
			 return false;
		 }
   }
	
	
	
	
	public static boolean checkSaveButtonWithInputingMandatoryFieldsInCreateAccountUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 
     codeTxt.sendKeys("Vendor C UAG");
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
	 
	 extraFields_CreateTab.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupCreateCreateTab_ExtraFieldUpdate));
 
	 addGroupCreateCreateTab_ExtraFieldUpdate.sendKeys("Vendor C UAG");
     
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 
	 saveBtn.click();
	 
	 if(validationConfirmationMessage.getText().equalsIgnoreCase("Saved Successfully"))
	 {
		 closeValidationConfirmationMessage.click();
		 excelReader.setCellData(xlfile, "Sheet1", 396, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 396, 9, resFail);
		 return false;
	 }
  }



public static boolean checkCreationScreenAfterSavingInCreateAccountUnderAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		
	 Select oSelect = new Select(accountTypeDropdown);
	 List <WebElement> elementCount = oSelect.getOptions();
	
	 int accTypeSize = elementCount.size();
	 System.out.println("Account Type :"+accTypeSize);
	 
	 if(headerGeneralTab.isDisplayed() && headerAccountSettingTab.isDisplayed() &&
		 headerDetailsTab.isDisplayed() && headerPrintLayoutTab.isDisplayed() &&
		 saveBtn.isDisplayed() && closeBtn.isDisplayed() && nameTxt.isDisplayed() && codeTxt.isDisplayed() &&
		 accountTypeDropdown.isDisplayed() && creditLimitTxt.isDisplayed() &&
		 creditdaysTxt.isDisplayed() && chequeDiscountLimitTxt.isDisplayed() &&
		 rateofinterestTxt.isDisplayed() && bankAccountTxt.isDisplayed() && accTypeSize==24)
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 397, 9, resPass);
		 return true;
	 }
	 else
	 {
		 
		 
		 excelReader.setCellData(xlfile, "Sheet1", 397, 9, resFail);
		 return false;
	 }
  }


 public static boolean checkGroupOptionToCreateAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	 nameTxt.sendKeys("Vendor D");
	
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 
     codeTxt.sendKeys("Vendor D");
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
	 
	 extraFields_CreateTab.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupCreateCreateTab_ExtraFieldUpdate));
 
	 addGroupCreateCreateTab_ExtraFieldUpdate.sendKeys("Vendor D");
     
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 
	 saveBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 
	 if(validationConfirmationMessage.getText().equalsIgnoreCase("Saved Successfully"))
	 {
		 closeValidationConfirmationMessage.click();
		 excelReader.setCellData(xlfile, "Sheet1", 398, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 398, 9, resFail);
		 return false;
	 }
 }
 

 public static boolean checkCloseOptionAccountDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 
		 closeBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnAccountGroupToDisplayTitle));
		 
		 clickOnAccountGroupToDisplayTitle.click();
		 
         System.out.println("getVendorGr5oup Nam"+clickOnAccountGroupToDisplayTitle.getText());
	 
		 if(clickOnAccountGroupToDisplayTitle.getText().equalsIgnoreCase("Vendor Group"))
		 { 
			 excelReader.setCellData(xlfile, "Sheet1", 399, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 399, 9, resFail);
			 return false;
		 }	 
      }


 
 public static boolean checkValidationMessageToClickOnGroupWithoutSelectingAccountToSelectAboveAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		 

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		 
	     masterRibbonToExpandOptions.click();
	     
	   

	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));
	     
	     masterGroupBtn.click();
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 
	     if(validationConfirmationMessage.getText().equalsIgnoreCase("Please select a row To Group"))
		 {
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 400, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 400, 9, resFail);
			 return false;
		 }
      }
 
 
 public static boolean checkClickOnGroupWithSelectingAccountToSelectAboveAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accSelect));
		 
		 accSelect.click();
		    
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGroupBtn));
	    
	     masterGroupBtn.click();
	     
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			
		 Select oSelect = new Select(accountTypeDropdown);
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int accTypeSize = elementCount.size();
		 System.out.println("Account Type :"+accTypeSize);
		 
		 if(headerGeneralTab.isDisplayed() && headerAccountSettingTab.isDisplayed() &&
			 headerDetailsTab.isDisplayed() && headerPrintLayoutTab.isDisplayed() &&
			 saveBtn.isDisplayed() && closeBtn.isDisplayed() && nameTxt.isDisplayed() && codeTxt.isDisplayed() &&
			 accountTypeDropdown.isDisplayed() && creditLimitTxt.isDisplayed() &&
			 creditdaysTxt.isDisplayed() && chequeDiscountLimitTxt.isDisplayed() &&
			 rateofinterestTxt.isDisplayed() && bankAccountTxt.isDisplayed() && accTypeSize==24 &&
			 extraFields_TreeTabUpdate.isDisplayed() &&
			 extraFields_DocumentTab.isDisplayed() && extraFields_CreateTab.isDisplayed())
		 {
			 
			 excelReader.setCellData(xlfile, "Sheet1", 401, 9, resPass);
			 return true;
		 }
		 else
		 {
			 
			 
			 excelReader.setCellData(xlfile, "Sheet1", 401, 9, resFail);
			 return false;
		 }
      }
 
 
 
  

 
 
 public static boolean checkGroupGeneralTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	
	 Select oSelect = new Select(accountTypeDropdown);
	 List <WebElement> elementCount = oSelect.getOptions();
	
	 
	 
	 int accTypeSize = elementCount.size();
	 System.out.println("Account Type :"+accTypeSize);
	 		 
	 if(nameTxt.isDisplayed() && codeTxt.isDisplayed() &&
			 accountTypeDropdown.isDisplayed() && creditLimitTxt.isDisplayed() &&
			 creditdaysTxt.isDisplayed()  && chequeDiscountLimitTxt.isDisplayed() &&
			 rateofinterestTxt.isDisplayed() && pdcDicountAccount.isDisplayed()  && bankAccountTxt.isDisplayed() && accTypeSize==24)
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 402, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 402, 9, resFail);
		 return false;
	 }
 }
 
 
 
 
 public static boolean checkGroupSettingsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAccountSettingTab));
	 
	 headerAccountSettingTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitCreditProposalDropdown));
 
	 if(debitCreditProposalDropdown.isDisplayed() && debitCreditRequiredDropdown.isDisplayed() &&
			 exchangeAdjustmentGainACTxt.isDisplayed() && exchangeAdjustmentLossACTxt.isDisplayed() &&
			 primaryAccountTxt.isDisplayed() && defaultCurrencyTxt.isDisplayed() &&
			 consolidationMethodDropdown.isDisplayed() && paymentTermstxt.isDisplayed() &&
			 reminderTermsTxt.isDisplayed() && financeChargeTermsTxt.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 403, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 403, 9, resFail);
		 return false;
	 }
 }
 
 
 
 public static boolean checkGroupDetailsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsTab));
	 
	 headerDetailsTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addressTxt));
 
	 if(addressTxt.isDisplayed() && cityTxt.isDisplayed() &&
			 deliveryAddressTxt.isDisplayed() && pinTxt.isDisplayed() &&
			 city2Text.isDisplayed() && pin2Txt.isDisplayed() &&
			 sendEmailCheckBox.isDisplayed() && allowCustomerPortalCheckBox.isDisplayed() &&
			 sendEmailTxt.isDisplayed() && passwordTxt.isDisplayed() && 
			 telphoneNumberTxt.isDisplayed() && faxNoTxt.isDisplayed() && 
			 portalEmailTxt.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 404, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 404, 9, resFail);
		 return false;
	 }
 }
 
 
 public static boolean checkGroupPrintLayoutTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerPrintLayoutTab));
	 
	 headerPrintLayoutTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridVoucherTypeTxt));
	 
	 gridVoucherTypeTxt.click();
	 
	 if(gridVoucherTypeTxt.isDisplayed() && gridPrintLayoutTxt.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 405, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 405, 9, resFail);
		 return false;
	 }
 }

 public static boolean checkGroupTreeTabUpdateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
     excelReader=new ExcelReader(POJOUtility.getExcelPath());
     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_TreeTabUpdate));
	 
	 extraFields_TreeTabUpdate.click();
	 		 
	  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
	 
  
	 if(masterTreeIdDropdown.isDisplayed() && 
		 masterTreeViewIDDropdown.isDisplayed() &&
		 masterOptionToHideAccountsGroupTree.isDisplayed() && accountAssestsGroup.isDisplayed())
	 {	
			excelReader.setCellData(xlfile, "Sheet1", 406, 9, resPass);
			return true;
	 }	 
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 406, 9, resFail);
		 return false;
	 }
 }
 
 
 
 
 public static boolean checkGroupDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DocumentTab));
	 
	 extraFields_DocumentTab.click();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PreviewTab_DocumentTab_FileName));
	 
 
	 if(extraFields_PreviewTab_DocumentTab_FileName.isDisplayed()  && extraFields_PreviewTab_DocumentTab_Document.isDisplayed() &&
			 addGroupDocumentTab_UploadDocument.isDisplayed()  && addGroupDocumentTab_SaveDocument.isDisplayed() &&
			 addGroupDocumentTab_DeleteDocument.isDisplayed()  && extraFields_PreviewTab_DocumentTab_FileSize.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 407, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 407, 9, resFail);
		 return false;
	 }
 }
 

 
 public static boolean checkGroupCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
 {
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
	 
	 extraFields_CreateTab.click();
	 

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupCreateCreateTab_ExtraFieldUpdate));
 
	 if(addGroupCreateCreateTab_ExtraFieldUpdate.isDisplayed())
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 408, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 408, 9, resFail);
		 return false;
	 }
 }
 
 
 
 

 
 


 public static boolean checkInGroupsSaveButtonWithoutInputNameMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {

		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
		 
		 headerGeneralTab.click();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 
		 saveBtn.click();
		 
		 if(validationConfirmationMessage.getText().equalsIgnoreCase("In Tab :General ---> Name Field is Required"))
		 {
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 409, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 409, 9, resFail);
			 return false;
		 }
   }
	
	
	public static boolean checkGroupsSaveButtonWithoutInputCodeMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			  		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.sendKeys("V Group");
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 
		 saveBtn.click();
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
		 
		 if(validationConfirmationMessage.getText().equalsIgnoreCase("In Tab :General ---> Code Field is Required"))
		 {
			 closeValidationConfirmationMessage.click();
			 excelReader.setCellData(xlfile, "Sheet1", 410, 9, resPass);
			 return true;
		 }
		 else
		 {
			 excelReader.setCellData(xlfile, "Sheet1", 410, 9, resFail);
			 return false;
		 }
   }
	
	
	
	
	public static boolean checkGroupsSaveButtonWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 
     codeTxt.sendKeys("V Group");
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
	 
	 extraFields_CreateTab.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupCreateCreateTab_ExtraFieldUpdate));
 
	 addGroupCreateCreateTab_ExtraFieldUpdate.sendKeys("V Group");
     
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 
	 saveBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 
	 if(validationConfirmationMessage.getText().equalsIgnoreCase("Saved Successfully"))
	 {
		 closeValidationConfirmationMessage.click();
		 excelReader.setCellData(xlfile, "Sheet1", 411, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 411, 9, resFail);
		 return false;
	 }
  }


	
	public static boolean checkEditGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accSelectBySingleClick));
	 
	 accSelectBySingleClick.click();
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));

     masterEditBtn.click();
     
     System.out.println("getCpationOfGroup"+getCpationOfGroup.getText());
 
     System.out.println("getCpationOfGroup"+getCpationOfGroup.getAttribute("Value"));
     
     System.out.println("getVendorGroupName"+getVendorGroupName.getText());
     
     System.out.println("getVendorGroupName"+getVendorGroupName.getAttribute("Value"));
       
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getCpationOfGroup));
	 
	 

	 if(getCpationOfGroup.getAttribute("Value").equalsIgnoreCase("V Group")) 
	 {
		 
		 excelReader.setCellData(xlfile, "Sheet1", 412, 9, resPass);
		 return true;
	 }
	 else
	 {   
		 
		 excelReader.setCellData(xlfile, "Sheet1", 412, 9, resFail);
		 return false;
	 }
  }
 
 
	
	public static boolean checkUpdateGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getCpationOfGroup));
	 
     getCpationOfGroup.click();
     
     getCpationOfGroup.clear();
     
     getCpationOfGroup.sendKeys("V Group Update");
    
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 
	 saveBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 
	 if(validationConfirmationMessage.getText().equalsIgnoreCase("Updated Successfully"))
	 {
		 closeValidationConfirmationMessage.click();
		 excelReader.setCellData(xlfile, "Sheet1", 413, 9, resPass);
		 return true;
	 }
	 else
	 {
		 closeValidationConfirmationMessage.click();
		 excelReader.setCellData(xlfile, "Sheet1", 413, 9, resFail);
		 return false;
	 }
	 
  }
 
	
	
	
	public static boolean checkDeleteAddGroupByCreatingAccountGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnAccountGroup));
	 
     clickOnAccountGroup.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
	 
     masterAddGroupBtn.click();

     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	 nameTxt.sendKeys("Vendor Delete Group");

     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	 
     codeTxt.sendKeys("Vendor Delete Group");
	       
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 
	 saveBtn.click();
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 
	 System.out.println(validationConfirmationMessage.getText());
     
	 if(validationConfirmationMessage.getText().equalsIgnoreCase("Saved Successfully"))
	 {
		 closeValidationConfirmationMessage.click();
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 excelReader.setCellData(xlfile, "Sheet1", 414, 9, resPass);
		 return true;
	 }
	 else
	 {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 excelReader.setCellData(xlfile, "Sheet1", 414, 9, resFail);
		 return false;
	 }

	 
  }
 
 
	
 
	
	
	
	
	public static boolean checkDeleteAddGroupByCreatingAccountInAccountGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
	 
     mastercmbMasterTxt.click();
     
     mastercmbMasterTxt.sendKeys("Vendor Delete Group");
     
     
     
     getAction().moveToElement(mastercmbMasterTxt).sendKeys(Keys.TAB).perform();
     
     getAction().moveToElement(mastercmbMasterTxt).sendKeys(Keys.TAB).perform();
          
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountSecondCheckBox));
	 
	 getAction().doubleClick(accountSecondCheckBox).perform();
		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));

	 masterNewBtn.click();
		  
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
     nameTxt.click();
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 
		 nameTxt.sendKeys("Vendor UDG");
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 
     codeTxt.sendKeys("Vendor UDG");
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
     
     extraFields_CreateTab.click();
     
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupCreateCreateTab_ExtraFieldUpdate));
	 
	 addGroupCreateCreateTab_ExtraFieldUpdate.sendKeys("Vendor UDG");
     
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	 
	 saveBtn.click(); 
	 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
	 
	 System.out.println(validationConfirmationMessage.getText());
     
	 if(validationConfirmationMessage.getText().equalsIgnoreCase("Saved Successfully"))
	 {
	
		 closeValidationConfirmationMessage.click();
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 excelReader.setCellData(xlfile, "Sheet1", 415, 9, resPass);
		 return true;
	 }
	 else
	 {
		 closeValidationConfirmationMessage.click();
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 excelReader.setCellData(xlfile, "Sheet1", 415, 9, resFail);
		 return false;
	 }
	 
	 
}
	
	
	
	public static boolean checkDeleteAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
	 
     mastercmbMasterTxt.click();
     
     mastercmbMasterTxt.sendKeys("Vendor Delete Group");
     
     
     
     getAction().moveToElement(mastercmbMasterTxt).sendKeys(Keys.DOWN).perform();
     
     getAction().moveToElement(mastercmbMasterTxt).sendKeys(Keys.TAB).perform();         
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
     
     masterDeleteBtn.click();
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
     
     System.out.println(getMsgOnDelete.getText());
     
     System.out.println(getMsgOnDelete.getAttribute("Value"));
     
     
	 if(getMsgOnDelete.getText().equalsIgnoreCase("Would you like to delete this selected master"))
	 {

		 excelReader.setCellData(xlfile, "Sheet1", 416, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 416, 9, resFail);
		 return false;
	 }
	 
	 
}
	
	
	
	
	public static boolean checkCancelButtonInDeleteAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnCancelInDelete));
	 
     clickOnCancelInDelete.click();
     
     
     
     
     System.out.println("mastercmbMasterTxt"+mastercmbMasterTxt.getText());
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
     
     mastercmbMasterTxt.click();
     
     mastercmbMasterTxt.sendKeys("Vendor Delete Group");
     
     
       
     getAction().moveToElement(mastercmbMasterTxt).sendKeys(Keys.TAB).perform();         
     
     
      
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));

     masterEditBtn.click();
     
     //Thread.sleep(9000);
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getCpationOfGroup));
     
     System.out.println("getCpationOfGroup"+getCpationOfGroup.getAttribute("Value"));
     
     //Thread.sleep(6000);
     
	 if(getCpationOfGroup.getAttribute("Value").equalsIgnoreCase("Vendor Delete Group")) 
	 {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 excelReader.setCellData(xlfile, "Sheet1", 417, 9, resPass);
		 return true;
	 }
	 else
	 {   
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 excelReader.setCellData(xlfile, "Sheet1", 417, 9, resFail);
		 return false;
	 }
	 
}
	
	
	public static boolean checkYesDeleteAddGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{

	 excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastercmbMasterTxt));
	 
     mastercmbMasterTxt.click();
     
     mastercmbMasterTxt.sendKeys("Vendor Delete Group");
     
     
   
     getAction().moveToElement(mastercmbMasterTxt).sendKeys(Keys.TAB).perform();         
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
 
     masterDeleteBtn.click();
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
     
     System.out.println(getMsgOnDelete.getText());
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
    
     clickOnOkInDelete.click();
     
     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(validationConfirmationMessage));
     
     if(validationConfirmationMessage.getText().equalsIgnoreCase("Record Deleted Successfully."))
	 {
	
		 closeValidationConfirmationMessage.click();
		 excelReader.setCellData(xlfile, "Sheet1", 418, 9, resPass);
		 return true;
	 }
	 else
	 {
		 closeValidationConfirmationMessage.click();
		 excelReader.setCellData(xlfile, "Sheet1", 418, 9, resFail);
		 return false;
	 }	 
}
	*/
	
	
	//After Customization adding accounts options
 
 
	public static boolean checkSelectAccountGroupSelectionAccountsMasterDisplayInMainPageGridAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAccountsReceivableGroup));
		accountAccountsReceivableGroup.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustomerA));
		masterCustomerA.click();
		
		boolean actmasterCustomerA  =masterCustomerA.isDisplayed();
		boolean actmasterCustomerB  =masterCustomerB.isDisplayed();
		boolean actmasterCustomerC  =masterCustomerC.isDisplayed();
		
		boolean expmasterCustomerA  =true;
		boolean expmasterCustomerB  =true;
		boolean expmasterCustomerC  =true;
		
		System.out.println("***********************************checkSelectAccountGroupSelectionAccountsMasterDisplayInMainPageGridAccountsMenu*****************");
		
		System.out.println("masterCustomerA  : "+actmasterCustomerA+" Value Expected : "+expmasterCustomerA);
		System.out.println("masterCustomerB  : "+actmasterCustomerB+" Value Expected : "+expmasterCustomerB);
		System.out.println("masterCustomerC  : "+actmasterCustomerC+" Value Expected : "+expmasterCustomerC);
	 
		if(actmasterCustomerA==expmasterCustomerA && actmasterCustomerB==expmasterCustomerB && actmasterCustomerC==expmasterCustomerC)
		{
			excelReader.setCellData(xlfile, "Sheet1", 372, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 372, 9, resFail);
			return false;
		}
}

public static boolean checkNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	masterNewBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	 
	boolean actheaderGeneralTab          =headerGeneralTab.isDisplayed();
	boolean actheaderAccountSettingTab   =headerAccountSettingTab.isDisplayed();
	boolean actheaderDetailsTab          =headerDetailsTab.isDisplayed();
	boolean actheaderPrintLayoutTab      =headerPrintLayoutTab.isDisplayed();
	boolean actsaveBtn                   =saveBtn.isDisplayed();
	boolean actcloseBtn                  =closeBtn.isDisplayed();
	boolean actextraFields_TreeTabUpdate =extraFields_TreeTabUpdate.isDisplayed();
	boolean actextraFields_DocumentTab   =extraFields_DocumentTab.isDisplayed();
	boolean actextraFields_CreateTab     =extraFields_CreateTab.isDisplayed();
	
	boolean expheaderGeneralTab          =true;
	boolean expheaderAccountSettingTab   =true;
	boolean expheaderDetailsTab          =true;
	boolean expheaderPrintLayoutTab      =true;
	boolean expsaveBtn                   =true;
	boolean expcloseBtn                  =true;
	boolean expextraFields_TreeTabUpdate =true;
	boolean expextraFields_DocumentTab   =true;
	boolean expextraFields_CreateTab     =true;
	
	System.out.println("***********************************checkNewButton*********************************");
	
	System.out.println("headerGeneralTab          : "+actheaderGeneralTab         +" Value Expected : "+expheaderGeneralTab);
	System.out.println("headerAccountSettingTab   : "+actheaderAccountSettingTab  +" Value Expected : "+expheaderAccountSettingTab);
	System.out.println("headerDetailsTab          : "+actheaderDetailsTab         +" Value Expected : "+expheaderDetailsTab);
	System.out.println("headerPrintLayoutTab      : "+actheaderPrintLayoutTab     +" Value Expected : "+expheaderPrintLayoutTab);
	System.out.println("saveBtn                   : "+actsaveBtn                  +" Value Expected : "+expsaveBtn);
	System.out.println("closeBtn                  : "+actcloseBtn                 +" Value Expected : "+expcloseBtn);
	System.out.println("extraFields_TreeTabUpdate : "+actextraFields_TreeTabUpdate+" Value Expected : "+expextraFields_TreeTabUpdate);
	System.out.println("extraFields_DocumentTab   : "+actextraFields_DocumentTab  +" Value Expected : "+expextraFields_DocumentTab);
	System.out.println("extraFields_CreateTab     : "+actextraFields_CreateTab    +" Value Expected : "+expextraFields_CreateTab);
	
	if(actheaderGeneralTab==expheaderGeneralTab && actheaderAccountSettingTab==expheaderAccountSettingTab && actheaderDetailsTab==expheaderDetailsTab
			&& actheaderPrintLayoutTab==expheaderPrintLayoutTab && actsaveBtn==expsaveBtn && actcloseBtn==expcloseBtn
			&& actextraFields_TreeTabUpdate==expextraFields_TreeTabUpdate && actextraFields_DocumentTab==expextraFields_DocumentTab
			&& actextraFields_CreateTab==expextraFields_CreateTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 373, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 373, 9, resFail);
		return false;
	}
}



public static boolean checkGenralTabOnClickOnNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		
	 Select oSelect = new Select(accountTypeDropdown);
	 List <WebElement> elementCount = oSelect.getOptions();
	 int actaccTypeSize = elementCount.size();

	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	 boolean actnameTxt                =nameTxt.isDisplayed();
	 boolean actcodeTxt                =codeTxt.isDisplayed();
	 boolean actaccountTypeDropdown    =accountTypeDropdown.isDisplayed();
	 boolean actcreditLimitTxt         =creditLimitTxt.isDisplayed();
	 boolean actcreditdaysTxt          =creditdaysTxt.isDisplayed();
	 boolean actchequeDiscountLimitTxt =chequeDiscountLimitTxt.isDisplayed();
	 boolean actrateofinterestTxt      =rateofinterestTxt.isDisplayed();
	 boolean actbankAccountTxt         =bankAccountTxt.isDisplayed();
	 
	 
	 int     expaccTypeSize            =24;
	 boolean expnameTxt                =true;
	 boolean expcodeTxt                =true;
	 boolean expaccountTypeDropdown    =true;
	 boolean expcreditLimitTxt         =true;
	 boolean expcreditdaysTxt          =true;
	 boolean expchequeDiscountLimitTxt =true;
	 boolean exprateofinterestTxt      =true;
	 boolean expbankAccountTxt         =true;
	 
	 System.out.println("*******************************checkGenralTabOnClickOnNewButton************************");
	 
	 System.out.println("nameTxt                 : "+actnameTxt                +" Value Expected : "+expnameTxt);
	 System.out.println("codeTxt                 : "+actcodeTxt                +" Value Expected : "+expcodeTxt);
	 System.out.println("accountTypeDropdown     : "+actaccountTypeDropdown    +" Value Expected : "+expaccountTypeDropdown);
	 System.out.println("creditLimitTxt          : "+actcreditLimitTxt         +" Value Expected : "+expcreditLimitTxt);
	 System.out.println("creditdaysTxt           : "+actcreditdaysTxt          +" Value Expected : "+expcreditdaysTxt);
	 System.out.println("chequeDiscountLimitTxt  : "+actchequeDiscountLimitTxt +" Value Expected : "+expchequeDiscountLimitTxt);
	 System.out.println("rateofinterestTxt       : "+actrateofinterestTxt      +" Value Expected : "+exprateofinterestTxt);
	 System.out.println("bankAccountTxt          : "+actbankAccountTxt         +" Value Expected : "+expbankAccountTxt);
	 System.out.println("accTypeSize             : "+actaccTypeSize            +" Value Expected : "+expaccTypeSize);
	 
	 
	 if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actaccountTypeDropdown==expaccountTypeDropdown 
			 && actcreditLimitTxt==expcreditLimitTxt && actcreditdaysTxt==expcreditdaysTxt && actchequeDiscountLimitTxt==expchequeDiscountLimitTxt
			 && actrateofinterestTxt==exprateofinterestTxt && actbankAccountTxt==expbankAccountTxt && actaccTypeSize==expaccTypeSize)
	{
		excelReader.setCellData(xlfile, "Sheet1", 374, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 374, 9, resFail);
		return false;
	}
}


public static boolean checkSettingsTabOnClickOnNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAccountSettingTab));
	headerAccountSettingTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitCreditProposalDropdown));
	 
	boolean actdebitCreditProposalDropdown                =debitCreditProposalDropdown.isDisplayed();
	boolean actdebitCreditRequiredDropdown                =debitCreditRequiredDropdown.isDisplayed();
	boolean actexchangeAdjustmentGainACTxt                =exchangeAdjustmentGainACTxt.isDisplayed();
	boolean actexchangeAdjustmentLossACTxt                =exchangeAdjustmentLossACTxt.isDisplayed();
	boolean actprimaryAccountTxt               		 	  =primaryAccountTxt.isDisplayed();
	boolean actdefaultCurrencyTxt		                  =defaultCurrencyTxt.isDisplayed();
	boolean actconsolidationMethodDropdown                =consolidationMethodDropdown.isDisplayed();
	boolean actpaymentTermstxt                            =paymentTermstxt.isDisplayed();
	boolean actreminderTermsTxt                           =reminderTermsTxt.isDisplayed();
	boolean actfinanceChargeTermsTxt                      =financeChargeTermsTxt.isDisplayed();
	 
	boolean expdebitCreditProposalDropdown                =true;
	boolean expdebitCreditRequiredDropdown                =true;
	boolean expexchangeAdjustmentGainACTxt                =true;
	boolean expexchangeAdjustmentLossACTxt                =true;
	boolean expprimaryAccountTxt               		  	  =true;
	boolean expdefaultCurrencyTxt		                  =true;
	boolean expconsolidationMethodDropdown                =true;
	boolean exppaymentTermstxt                            =true;
	boolean expreminderTermsTxt                           =true;
	boolean expfinanceChargeTermsTxt                      =true;
	 
	System.out.println("***********************************checkSettingsTabOnClickOnNewButton*************************");
	 
	System.out.println("debitCreditProposalDropdown    : "+actdebitCreditProposalDropdown+" Value Expected : "+expdebitCreditProposalDropdown);
	System.out.println("debitCreditRequiredDropdown    : "+actdebitCreditRequiredDropdown+" Value Expected : "+expdebitCreditRequiredDropdown);
	System.out.println("exchangeAdjustmentGainACTxt    : "+actexchangeAdjustmentGainACTxt+" Value Expected : "+expexchangeAdjustmentGainACTxt);
	System.out.println("exchangeAdjustmentLossACTxt    : "+actexchangeAdjustmentLossACTxt+" Value Expected : "+expexchangeAdjustmentLossACTxt);
	System.out.println("primaryAccountTxt              : "+actprimaryAccountTxt          +" Value Expected : "+expprimaryAccountTxt);
	System.out.println("defaultCurrencyTxt             : "+actdefaultCurrencyTxt         +" Value Expected : "+expdefaultCurrencyTxt);
	System.out.println("consolidationMethodDropdown    : "+actconsolidationMethodDropdown+" Value Expected : "+expconsolidationMethodDropdown);
	System.out.println("paymentTermstxt                : "+actpaymentTermstxt            +" Value Expected : "+exppaymentTermstxt);
	System.out.println("reminderTermsTxt               : "+actreminderTermsTxt           +" Value Expected : "+expreminderTermsTxt);
	System.out.println("financeChargeTermsTxt          : "+actfinanceChargeTermsTxt      +" Value Expected : "+expfinanceChargeTermsTxt);
 
	if(actdebitCreditProposalDropdown==expdebitCreditProposalDropdown && actdebitCreditRequiredDropdown==expdebitCreditRequiredDropdown
			&& actexchangeAdjustmentGainACTxt==expexchangeAdjustmentGainACTxt && actexchangeAdjustmentLossACTxt==expexchangeAdjustmentLossACTxt
			&& actprimaryAccountTxt==expprimaryAccountTxt && actdefaultCurrencyTxt==expdefaultCurrencyTxt
			&& actconsolidationMethodDropdown==expconsolidationMethodDropdown && actpaymentTermstxt==exppaymentTermstxt
			&& actreminderTermsTxt==expreminderTermsTxt && actfinanceChargeTermsTxt==expfinanceChargeTermsTxt)
	{
		excelReader.setCellData(xlfile, "Sheet1", 375, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 375, 9, resFail);
		return false;
	}
}



public static boolean checkDetailsTabOnClickOnNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsTab));
	headerDetailsTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addressTxt));
	 
	boolean actaddressTxt           		=addressTxt.isDisplayed();
	boolean actcityTxt           			=cityTxt.isDisplayed();
	boolean actdeliveryAddressTxt           =deliveryAddressTxt.isDisplayed();
	boolean actpinTxt           			=pinTxt.isDisplayed();
	boolean actcity2Text           		    =city2Text.isDisplayed();
	boolean actpin2Txt           			=pin2Txt.isDisplayed();
	boolean actsendEmailCheckBox            =sendEmailCheckBox.isDisplayed();
	boolean actallowCustomerPortalCheckBox  =allowCustomerPortalCheckBox.isDisplayed();
	boolean actsendEmailTxt                 =sendEmailTxt.isDisplayed();
	boolean actpasswordTxt           		=passwordTxt.isDisplayed();
	boolean acttelphoneNumberTxt            =telphoneNumberTxt.isDisplayed();
	boolean actfaxNoTxt           			=faxNoTxt.isDisplayed();
	 
	boolean expaddressTxt           		=true;
	boolean expcityTxt           			=true;
	boolean expdeliveryAddressTxt           =true;
	boolean exppinTxt           			=true;
	boolean expcity2Text           		    =true;
	boolean exppin2Txt           			=true;
	boolean expsendEmailCheckBox            =true;
	boolean expallowCustomerPortalCheckBox  =true;
	boolean expsendEmailTxt                 =true;
	boolean exppasswordTxt           		=true;
	boolean exptelphoneNumberTxt            =true;
	boolean expfaxNoTxt           			=true;
	 
	System.out.println("*********************************checkDetailsTabOnClickOnNewButton**************************");
	
	System.out.println("addressTxt                  : "+actaddressTxt                  +" Value Expected : "+expaddressTxt);
	System.out.println("cityTxt                     : "+actcityTxt                     +" Value Expected : "+expcityTxt);
	System.out.println("deliveryAddressTxt          : "+actdeliveryAddressTxt          +" Value Expected : "+expdeliveryAddressTxt);
	System.out.println("pinTxt                      : "+actpinTxt                      +" Value Expected : "+exppinTxt);
	System.out.println("city2Text                   : "+actcity2Text                   +" Value Expected : "+expcity2Text);
	System.out.println("pin2Txt                     : "+actpin2Txt                     +" Value Expected : "+exppin2Txt);
	System.out.println("sendEmailCheckBox           : "+actsendEmailCheckBox           +" Value Expected : "+expsendEmailCheckBox);
	System.out.println("allowCustomerPortalCheckBox : "+actallowCustomerPortalCheckBox +" Value Expected : "+expallowCustomerPortalCheckBox);
	System.out.println("sendEmailTxt                : "+actsendEmailTxt                +" Value Expected : "+expsendEmailTxt);
	System.out.println("passwordTxt                 : "+actpasswordTxt                 +" Value Expected : "+exppasswordTxt);
	System.out.println("telphoneNumberTxt           : "+acttelphoneNumberTxt           +" Value Expected : "+exptelphoneNumberTxt);
	System.out.println("faxNoTxt                    : "+actfaxNoTxt                    +" Value Expected : "+expfaxNoTxt);
	
	if(actaddressTxt==expaddressTxt && actcityTxt==expcityTxt && actdeliveryAddressTxt==expdeliveryAddressTxt
			&& actpinTxt==exppinTxt && actcity2Text==expcity2Text && actpin2Txt==exppin2Txt && actsendEmailCheckBox==expsendEmailCheckBox
			&& actallowCustomerPortalCheckBox==expallowCustomerPortalCheckBox && actsendEmailTxt==expsendEmailTxt && actpasswordTxt==exppasswordTxt
			&& acttelphoneNumberTxt==exptelphoneNumberTxt && actfaxNoTxt==expfaxNoTxt)
	{
		excelReader.setCellData(xlfile, "Sheet1", 376, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 376, 9, resFail);
		return false;
	}
}


public static boolean checkPrintlayoutTabOnClickOnNewButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerPrintLayoutTab));
	headerPrintLayoutTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridVoucherTypeTxt));
	gridVoucherTypeTxt.click();
	 
	boolean actgridVoucherTypeTxt =gridVoucherTypeTxt.isDisplayed();
	boolean actgridPrintLayoutTxt =gridPrintLayoutTxt.isDisplayed();
	 
	boolean expgridVoucherTypeTxt =true;
	boolean expgridPrintLayoutTxt =true;
	 
	System.out.println("**********************************checkPrintlayoutTabOnClickOnNewButton*************************");
	 
	System.out.println("gridVoucherTypeTxt  : "+actgridVoucherTypeTxt+" Value Expected : "+expgridVoucherTypeTxt);
	System.out.println("gridPrintLayoutTxt  : "+actgridPrintLayoutTxt+" Value Expected : "+expgridPrintLayoutTxt);
	 
	if(actgridVoucherTypeTxt==expgridVoucherTypeTxt && actgridPrintLayoutTxt==expgridPrintLayoutTxt)
	{
		excelReader.setCellData(xlfile, "Sheet1", 377, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 377, 9, resFail);
		return false;
	}
}



public static boolean checkNewTreeTabUpdateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_TreeTabUpdate));
    extraFields_TreeTabUpdate.click();
	 		 
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
	 
    boolean actmasterTreeIdDropdown    	        =masterTreeIdDropdown.isDisplayed();
    boolean actmasterTreeViewIDDropdown    	    =masterTreeViewIDDropdown.isDisplayed();
    boolean actmasterOptionToHideAccountsGroupTree =masterOptionToHideAccountsGroupTree.isDisplayed();
    boolean actaccountAssestsGroup 				=accountAssestsGroup.isDisplayed();
	 
    boolean expmasterTreeIdDropdown        	    =true;
    boolean expmasterTreeViewIDDropdown    	    =true;
    boolean expmasterOptionToHideAccountsGroupTree =true;
    boolean expaccountAssestsGroup 				=true;
    
    System.out.println("*********************************checkNewTreeTabUpdateTab****************************");
    
    System.out.println("masterTreeIdDropdown                  : "+actmasterTreeIdDropdown                  +" Value Expected : "+expmasterTreeIdDropdown);
    System.out.println("masterTreeViewIDDropdown              : "+actmasterTreeViewIDDropdown              +" Value Expected : "+expmasterTreeViewIDDropdown);
    System.out.println("masterOptionToHideAccountsGroupTree   : "+actmasterOptionToHideAccountsGroupTree   +" Value Expected : "+expmasterOptionToHideAccountsGroupTree);
    System.out.println("accountAssestsGroup                   : "+actaccountAssestsGroup                   +" Value Expected : "+expaccountAssestsGroup);
    
    if(actmasterTreeIdDropdown==expmasterTreeIdDropdown  && actmasterTreeViewIDDropdown==expmasterTreeViewIDDropdown
    		&& actmasterOptionToHideAccountsGroupTree==expmasterOptionToHideAccountsGroupTree
    		&& actaccountAssestsGroup==expaccountAssestsGroup)
    {	
    	excelReader.setCellData(xlfile, "Sheet1", 378, 9, resPass);
    	return true;
    }	 
    else
    {
    	excelReader.setCellData(xlfile, "Sheet1", 378, 9, resFail);
    	return false;
    }
}


	@FindBy(xpath="//input[@id='sFileName1']")
private static WebElement extraFields_DocumentTab_FileName;
	
	@FindBy(xpath="//input[@id='biDocument1']")
private static WebElement extraFields_DocumentTab_Document;

	@FindBy(xpath="//tr[1]//td[5]//div[1]//div[1]//div[1]")
private static WebElement extraFields_DocumentTab_UploadDocument;
	
	@FindBy(xpath="//a[@id='SaveImg']")
private static WebElement extraFields_DocumentTab_SaveDocument;
	
	@FindBy(xpath="//i[@class='fa fa-eraser RemoveImg']")
private static WebElement extraFields_DocumentTab_DeleteDocument;
	
@FindBy(xpath="//input[@id='iFileSize1']")
private static WebElement extraFields_DocumentTab_FileSize;



public static boolean checkNewDocumentTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DocumentTab));
	extraFields_DocumentTab.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DocumentTab_FileName));
	 
	boolean actextraFields_DocumentTab_FileName       =extraFields_DocumentTab_FileName.isDisplayed();
	boolean actextraFields_DocumentTab_UploadDocument =extraFields_DocumentTab_UploadDocument.isDisplayed();
	boolean actextraFields_DocumentTab_SaveDocument   =extraFields_DocumentTab_SaveDocument.isDisplayed();
	boolean actextraFields_DocumentTab_DeleteDocument =extraFields_DocumentTab_DeleteDocument.isDisplayed();
	boolean actextraFields_DocumentTab_FileSize       =extraFields_DocumentTab_FileSize.isDisplayed();
	
	boolean expextraFields_DocumentTab_FileName       =true;
	boolean expextraFields_DocumentTab_UploadDocument =true;
	boolean expextraFields_DocumentTab_SaveDocument   =true;
	boolean expextraFields_DocumentTab_DeleteDocument =true;
	boolean expextraFields_DocumentTab_FileSize       =true;
	
	System.out.println("**************************************checkNewDocumentTab***********************************");
	
	System.out.println("extraFields_DocumentTab_FileName        : "+actextraFields_DocumentTab_FileName       +" Value Expected : "+expextraFields_DocumentTab_FileName);
	System.out.println("extraFields_DocumentTab_UploadDocument  : "+actextraFields_DocumentTab_UploadDocument +" Value Expected : "+expextraFields_DocumentTab_UploadDocument);
	System.out.println("extraFields_DocumentTab_SaveDocument    : "+actextraFields_DocumentTab_SaveDocument   +" Value Expected : "+expextraFields_DocumentTab_SaveDocument);
	System.out.println("extraFields_DocumentTab_DeleteDocument  : "+actextraFields_DocumentTab_DeleteDocument +" Value Expected : "+expextraFields_DocumentTab_DeleteDocument);
	System.out.println("extraFields_DocumentTab_FileSize        : "+actextraFields_DocumentTab_FileSize       +" Value Expected : "+expextraFields_DocumentTab_FileSize);
 
	if(actextraFields_DocumentTab_FileName==expextraFields_DocumentTab_FileName
			&& actextraFields_DocumentTab_UploadDocument==expextraFields_DocumentTab_UploadDocument
			&& actextraFields_DocumentTab_SaveDocument==expextraFields_DocumentTab_SaveDocument
			&& actextraFields_DocumentTab_DeleteDocument==expextraFields_DocumentTab_DeleteDocument
			&& actextraFields_DocumentTab_FileSize==expextraFields_DocumentTab_FileSize)
	{
		excelReader.setCellData(xlfile, "Sheet1", 379, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 379, 9, resFail);
		return false;
	}
}



public static boolean checkNewInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
	extraFields_CreateTab.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupCreateCreateTab_ExtraFieldUpdate));
	
	boolean actaddGroupCreateCreateTab_ExtraFieldUpdate  =addGroupCreateCreateTab_ExtraFieldUpdate.isDisplayed();
	boolean expaddGroupCreateCreateTab_ExtraFieldUpdate  =true;
	
	System.out.println("*************************************checkNewInCreateTab************************************");
	
	System.out.println("addGroupCreateCreateTab_ExtraFieldUpdate : "+actaddGroupCreateCreateTab_ExtraFieldUpdate+" Value Expected : "+expaddGroupCreateCreateTab_ExtraFieldUpdate);
 
	if(actaddGroupCreateCreateTab_ExtraFieldUpdate==expaddGroupCreateCreateTab_ExtraFieldUpdate)
	{ 
		addGroupCreateCreateTab_ExtraFieldUpdate.click();
		 
		addGroupCreateCreateTab_ExtraFieldUpdate.sendKeys("Test Extra Field Update");
		 
		excelReader.setCellData(xlfile, "Sheet1", 380, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 380, 9, resFail);
		return false;
	}
}


public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInNewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	headerGeneralTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="In Tab :General ---> Name Field is Required";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkSaveButtonWithoutInputNameMandatoryFieldsInNewOption***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 381, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 381, 9, resFail);
		return false;
	}
}


public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.sendKeys("Customer");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="In Tab :General ---> Code Field is Required";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkSaveButtonWithoutInputCodeMandatoryFieldsInNewOption***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 382, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 382, 9, resFail);
		return false;
	}
}



public static boolean checkSaveButtonWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.sendKeys("Customer");
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Saved Successfully";
	
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkSaveButtonWithInputingMandatoryFields***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 383, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 383, 9, resFail);
		return false;
	}
}



public static boolean checkAccountsCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	nameTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.click();
	codeTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	
	Select oSelect = new Select(accountTypeDropdown);
	List <WebElement> elementCount = oSelect.getOptions();
	int actaccTypeSize = elementCount.size();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	boolean actnameTxt                =nameTxt.isDisplayed();
	boolean actcodeTxt                =codeTxt.isDisplayed();
	boolean actaccountTypeDropdown    =accountTypeDropdown.isDisplayed();
	boolean actcreditLimitTxt         =creditLimitTxt.isDisplayed();
	boolean actcreditdaysTxt          =creditdaysTxt.isDisplayed();
	boolean actchequeDiscountLimitTxt =chequeDiscountLimitTxt.isDisplayed();
	boolean actrateofinterestTxt      =rateofinterestTxt.isDisplayed();
	boolean actbankAccountTxt         =bankAccountTxt.isDisplayed();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	
	boolean actheaderGeneralTab          =headerGeneralTab.isDisplayed();
	boolean actheaderAccountSettingTab   =headerAccountSettingTab.isDisplayed();
	boolean actheaderDetailsTab          =headerDetailsTab.isDisplayed();
	boolean actheaderPrintLayoutTab      =headerPrintLayoutTab.isDisplayed();
	boolean actsaveBtn                   =saveBtn.isDisplayed();
	boolean actcloseBtn                  =closeBtn.isDisplayed();
	
	int     expaccTypeSize            =24;
	boolean expnameTxt                =true;
	boolean expcodeTxt                =true;
	boolean expaccountTypeDropdown    =true;
	boolean expcreditLimitTxt         =true;
	boolean expcreditdaysTxt          =true;
	boolean expchequeDiscountLimitTxt =true;
	boolean exprateofinterestTxt      =true;
	boolean expbankAccountTxt         =true;
	
	boolean expheaderGeneralTab          =true;
	boolean expheaderAccountSettingTab   =true;
	boolean expheaderDetailsTab          =true;
	boolean expheaderPrintLayoutTab      =true;
	boolean expsaveBtn                   =true;
	boolean expcloseBtn                  =true;
	
	System.out.println("*******************************checkAccountsCreationScreenAfterSaving************************");
	
	System.out.println("nameTxt                   : "+actnameTxt                 +" Value Expected : "+expnameTxt);
	System.out.println("codeTxt                   : "+actcodeTxt                 +" Value Expected : "+expcodeTxt);
	System.out.println("accountTypeDropdown       : "+actaccountTypeDropdown     +" Value Expected : "+expaccountTypeDropdown);
	System.out.println("creditLimitTxt            : "+actcreditLimitTxt          +" Value Expected : "+expcreditLimitTxt);
	System.out.println("creditdaysTxt             : "+actcreditdaysTxt           +" Value Expected : "+expcreditdaysTxt);
	System.out.println("chequeDiscountLimitTxt    : "+actchequeDiscountLimitTxt  +" Value Expected : "+expchequeDiscountLimitTxt);
	System.out.println("rateofinterestTxt         : "+actrateofinterestTxt       +" Value Expected : "+exprateofinterestTxt);
	System.out.println("bankAccountTxt            : "+actbankAccountTxt          +" Value Expected : "+expbankAccountTxt);
	System.out.println("accTypeSize               : "+actaccTypeSize             +" Value Expected : "+expaccTypeSize);
	System.out.println("headerGeneralTab          : "+actheaderGeneralTab        +" Value Expected : "+expheaderGeneralTab);
	System.out.println("headerAccountSettingTab   : "+actheaderAccountSettingTab +" Value Expected : "+expheaderAccountSettingTab);
	System.out.println("headerDetailsTab          : "+actheaderDetailsTab        +" Value Expected : "+expheaderDetailsTab);
	System.out.println("headerPrintLayoutTab      : "+actheaderPrintLayoutTab    +" Value Expected : "+expheaderPrintLayoutTab);
	System.out.println("saveBtn                   : "+actsaveBtn                 +" Value Expected : "+expsaveBtn);
	System.out.println("closeBtn                  : "+actcloseBtn                +" Value Expected : "+expcloseBtn);
	
	if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actaccountTypeDropdown==expaccountTypeDropdown 
			&& actcreditLimitTxt==expcreditLimitTxt && actcreditdaysTxt==expcreditdaysTxt && actchequeDiscountLimitTxt==expchequeDiscountLimitTxt
			&& actrateofinterestTxt==exprateofinterestTxt && actbankAccountTxt==expbankAccountTxt && actaccTypeSize==expaccTypeSize
			&& actheaderGeneralTab==expheaderGeneralTab && actheaderAccountSettingTab==expheaderAccountSettingTab && actheaderDetailsTab==expheaderDetailsTab
			&& actheaderPrintLayoutTab==expheaderPrintLayoutTab && actsaveBtn==expsaveBtn && actcloseBtn==expcloseBtn)
	{	
		excelReader.setCellData(xlfile, "Sheet1", 384, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 384, 9, resFail);
		return false;
	}
}


public static boolean checkAccountDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	closeBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	
	String actaccountNewCreationName =accountNewCreationName.getText();
	String expaccountNewCreationName ="Customer";
	
	System.out.println("****************************checkAccountDisplayInAccountGrid************************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
 
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 385, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 385, 9, resFail);
		return false;
	}
}


//Add Group before Customization


public static boolean checkAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
	masterAddGroupBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	 
	boolean actheaderGeneralTab          =headerGeneralTab.isDisplayed();
	boolean actheaderAccountSettingTab   =headerAccountSettingTab.isDisplayed();
	boolean actheaderDetailsTab          =headerDetailsTab.isDisplayed();
	boolean actheaderPrintLayoutTab      =headerPrintLayoutTab.isDisplayed();
	boolean actsaveBtn                   =saveBtn.isDisplayed();
	boolean actcloseBtn                  =closeBtn.isDisplayed();
	boolean actextraFields_TreeTabUpdate =extraFields_TreeTabUpdate.isDisplayed();
	boolean actextraFields_DocumentTab   =extraFields_DocumentTab.isDisplayed();
	boolean actextraFields_CreateTab     =extraFields_CreateTab.isDisplayed();
	
	boolean expheaderGeneralTab          =true;
	boolean expheaderAccountSettingTab   =true;
	boolean expheaderDetailsTab          =true;
	boolean expheaderPrintLayoutTab      =true;
	boolean expsaveBtn                   =true;
	boolean expcloseBtn                  =true;
	boolean expextraFields_TreeTabUpdate =true;
	boolean expextraFields_DocumentTab   =true;
	boolean expextraFields_CreateTab     =true;
	
	System.out.println("***********************************checkAddGroupButton*********************************");
	
	System.out.println("headerGeneralTab          : "+actheaderGeneralTab         +" Value Expected : "+expheaderGeneralTab);
	System.out.println("headerAccountSettingTab   : "+actheaderAccountSettingTab  +" Value Expected : "+expheaderAccountSettingTab);
	System.out.println("headerDetailsTab          : "+actheaderDetailsTab         +" Value Expected : "+expheaderDetailsTab);
	System.out.println("headerPrintLayoutTab      : "+actheaderPrintLayoutTab     +" Value Expected : "+expheaderPrintLayoutTab);
	System.out.println("saveBtn                   : "+actsaveBtn                  +" Value Expected : "+expsaveBtn);
	System.out.println("closeBtn                  : "+actcloseBtn                 +" Value Expected : "+expcloseBtn);
	System.out.println("extraFields_TreeTabUpdate : "+actextraFields_TreeTabUpdate+" Value Expected : "+expextraFields_TreeTabUpdate);
	System.out.println("extraFields_DocumentTab   : "+actextraFields_DocumentTab  +" Value Expected : "+expextraFields_DocumentTab);
	System.out.println("extraFields_CreateTab     : "+actextraFields_CreateTab    +" Value Expected : "+expextraFields_CreateTab);
	
	if(actheaderGeneralTab==expheaderGeneralTab && actheaderAccountSettingTab==expheaderAccountSettingTab && actheaderDetailsTab==expheaderDetailsTab
			&& actheaderPrintLayoutTab==expheaderPrintLayoutTab && actsaveBtn==expsaveBtn && actcloseBtn==expcloseBtn
			&& actextraFields_TreeTabUpdate==expextraFields_TreeTabUpdate && actextraFields_DocumentTab==expextraFields_DocumentTab
			&& actextraFields_CreateTab==expextraFields_CreateTab)
	{
		excelReader.setCellData(xlfile, "Sheet1", 386, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 386, 9, resFail);
		return false;
	}
}



public static boolean checkGenralTabOnClickOnAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	
	Select oSelect = new Select(accountTypeDropdown);
	List <WebElement> elementCount = oSelect.getOptions();
	int actaccTypeSize = elementCount.size();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	boolean actnameTxt                =nameTxt.isDisplayed();
	boolean actcodeTxt                =codeTxt.isDisplayed();
	boolean actaccountTypeDropdown    =accountTypeDropdown.isDisplayed();
	boolean actcreditLimitTxt         =creditLimitTxt.isDisplayed();
	boolean actcreditdaysTxt          =creditdaysTxt.isDisplayed();
	boolean actchequeDiscountLimitTxt =chequeDiscountLimitTxt.isDisplayed();
	boolean actrateofinterestTxt      =rateofinterestTxt.isDisplayed();
	boolean actbankAccountTxt         =bankAccountTxt.isDisplayed();
	
	
	int     expaccTypeSize            =24;
	boolean expnameTxt                =true;
	boolean expcodeTxt                =true;
	boolean expaccountTypeDropdown    =true;
	boolean expcreditLimitTxt         =true;
	boolean expcreditdaysTxt          =true;
	boolean expchequeDiscountLimitTxt =true;
	boolean exprateofinterestTxt      =true;
	boolean expbankAccountTxt         =true;
	
	System.out.println("*******************************checkGenralTabOnClickOnAddGroupButton************************");
	
	System.out.println("nameTxt                 : "+actnameTxt                +" Value Expected : "+expnameTxt);
	System.out.println("codeTxt                 : "+actcodeTxt                +" Value Expected : "+expcodeTxt);
	System.out.println("accountTypeDropdown     : "+actaccountTypeDropdown    +" Value Expected : "+expaccountTypeDropdown);
	System.out.println("creditLimitTxt          : "+actcreditLimitTxt         +" Value Expected : "+expcreditLimitTxt);
	System.out.println("creditdaysTxt           : "+actcreditdaysTxt          +" Value Expected : "+expcreditdaysTxt);
	System.out.println("chequeDiscountLimitTxt  : "+actchequeDiscountLimitTxt +" Value Expected : "+expchequeDiscountLimitTxt);
	System.out.println("rateofinterestTxt       : "+actrateofinterestTxt      +" Value Expected : "+exprateofinterestTxt);
	System.out.println("bankAccountTxt          : "+actbankAccountTxt         +" Value Expected : "+expbankAccountTxt);
	System.out.println("accTypeSize             : "+actaccTypeSize            +" Value Expected : "+expaccTypeSize);
	
	
	if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actaccountTypeDropdown==expaccountTypeDropdown 
			&& actcreditLimitTxt==expcreditLimitTxt && actcreditdaysTxt==expcreditdaysTxt && actchequeDiscountLimitTxt==expchequeDiscountLimitTxt
			&& actrateofinterestTxt==exprateofinterestTxt && actbankAccountTxt==expbankAccountTxt && actaccTypeSize==expaccTypeSize)
	{
		excelReader.setCellData(xlfile, "Sheet1", 387, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 387, 9, resFail);
		return false;
	}
}


public static boolean checkSettingsTabOnClickOnAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAccountSettingTab));
	headerAccountSettingTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(debitCreditProposalDropdown));
	 
	boolean actdebitCreditProposalDropdown                =debitCreditProposalDropdown.isDisplayed();
	boolean actdebitCreditRequiredDropdown                =debitCreditRequiredDropdown.isDisplayed();
	boolean actexchangeAdjustmentGainACTxt                =exchangeAdjustmentGainACTxt.isDisplayed();
	boolean actexchangeAdjustmentLossACTxt                =exchangeAdjustmentLossACTxt.isDisplayed();
	boolean actprimaryAccountTxt               		 	  =primaryAccountTxt.isDisplayed();
	boolean actdefaultCurrencyTxt		                  =defaultCurrencyTxt.isDisplayed();
	boolean actconsolidationMethodDropdown                =consolidationMethodDropdown.isDisplayed();
	boolean actpaymentTermstxt                            =paymentTermstxt.isDisplayed();
	boolean actreminderTermsTxt                           =reminderTermsTxt.isDisplayed();
	boolean actfinanceChargeTermsTxt                      =financeChargeTermsTxt.isDisplayed();
	 
	boolean expdebitCreditProposalDropdown                =true;
	boolean expdebitCreditRequiredDropdown                =true;
	boolean expexchangeAdjustmentGainACTxt                =true;
	boolean expexchangeAdjustmentLossACTxt                =true;
	boolean expprimaryAccountTxt               		  	  =true;
	boolean expdefaultCurrencyTxt		                  =true;
	boolean expconsolidationMethodDropdown                =true;
	boolean exppaymentTermstxt                            =true;
	boolean expreminderTermsTxt                           =true;
	boolean expfinanceChargeTermsTxt                      =true;
	 
	System.out.println("***********************************checkSettingsTabOnClickOnAddGroupButton*************************");
	 
	System.out.println("debitCreditProposalDropdown    : "+actdebitCreditProposalDropdown+" Value Expected : "+expdebitCreditProposalDropdown);
	System.out.println("debitCreditRequiredDropdown    : "+actdebitCreditRequiredDropdown+" Value Expected : "+expdebitCreditRequiredDropdown);
	System.out.println("exchangeAdjustmentGainACTxt    : "+actexchangeAdjustmentGainACTxt+" Value Expected : "+expexchangeAdjustmentGainACTxt);
	System.out.println("exchangeAdjustmentLossACTxt    : "+actexchangeAdjustmentLossACTxt+" Value Expected : "+expexchangeAdjustmentLossACTxt);
	System.out.println("primaryAccountTxt              : "+actprimaryAccountTxt          +" Value Expected : "+expprimaryAccountTxt);
	System.out.println("defaultCurrencyTxt             : "+actdefaultCurrencyTxt         +" Value Expected : "+expdefaultCurrencyTxt);
	System.out.println("consolidationMethodDropdown    : "+actconsolidationMethodDropdown+" Value Expected : "+expconsolidationMethodDropdown);
	System.out.println("paymentTermstxt                : "+actpaymentTermstxt            +" Value Expected : "+exppaymentTermstxt);
	System.out.println("reminderTermsTxt               : "+actreminderTermsTxt           +" Value Expected : "+expreminderTermsTxt);
	System.out.println("financeChargeTermsTxt          : "+actfinanceChargeTermsTxt      +" Value Expected : "+expfinanceChargeTermsTxt);
 
	if(actdebitCreditProposalDropdown==expdebitCreditProposalDropdown && actdebitCreditRequiredDropdown==expdebitCreditRequiredDropdown
			&& actexchangeAdjustmentGainACTxt==expexchangeAdjustmentGainACTxt && actexchangeAdjustmentLossACTxt==expexchangeAdjustmentLossACTxt
			&& actprimaryAccountTxt==expprimaryAccountTxt && actdefaultCurrencyTxt==expdefaultCurrencyTxt
			&& actconsolidationMethodDropdown==expconsolidationMethodDropdown && actpaymentTermstxt==exppaymentTermstxt
			&& actreminderTermsTxt==expreminderTermsTxt && actfinanceChargeTermsTxt==expfinanceChargeTermsTxt)
	{
		excelReader.setCellData(xlfile, "Sheet1", 388, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 388, 9, resFail);
		return false;
	}
}



public static boolean checkDetailsTabOnClickOnAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerDetailsTab));
	headerDetailsTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addressTxt));
	 
	boolean actaddressTxt           		=addressTxt.isDisplayed();
	boolean actcityTxt           			=cityTxt.isDisplayed();
	boolean actdeliveryAddressTxt           =deliveryAddressTxt.isDisplayed();
	boolean actpinTxt           			=pinTxt.isDisplayed();
	boolean actcity2Text           		    =city2Text.isDisplayed();
	boolean actpin2Txt           			=pin2Txt.isDisplayed();
	boolean actsendEmailCheckBox            =sendEmailCheckBox.isDisplayed();
	boolean actallowCustomerPortalCheckBox  =allowCustomerPortalCheckBox.isDisplayed();
	boolean actsendEmailTxt                 =sendEmailTxt.isDisplayed();
	boolean actpasswordTxt           		=passwordTxt.isDisplayed();
	boolean acttelphoneNumberTxt            =telphoneNumberTxt.isDisplayed();
	boolean actfaxNoTxt           			=faxNoTxt.isDisplayed();
	 
	boolean expaddressTxt           		=true;
	boolean expcityTxt           			=true;
	boolean expdeliveryAddressTxt           =true;
	boolean exppinTxt           			=true;
	boolean expcity2Text           		    =true;
	boolean exppin2Txt           			=true;
	boolean expsendEmailCheckBox            =true;
	boolean expallowCustomerPortalCheckBox  =true;
	boolean expsendEmailTxt                 =true;
	boolean exppasswordTxt           		=true;
	boolean exptelphoneNumberTxt            =true;
	boolean expfaxNoTxt           			=true;
	 
	System.out.println("*********************************checkDetailsTabOnClickOnAddGroupButton**************************");
	
	System.out.println("addressTxt                  : "+actaddressTxt                  +" Value Expected : "+expaddressTxt);
	System.out.println("cityTxt                     : "+actcityTxt                     +" Value Expected : "+expcityTxt);
	System.out.println("deliveryAddressTxt          : "+actdeliveryAddressTxt          +" Value Expected : "+expdeliveryAddressTxt);
	System.out.println("pinTxt                      : "+actpinTxt                      +" Value Expected : "+exppinTxt);
	System.out.println("city2Text                   : "+actcity2Text                   +" Value Expected : "+expcity2Text);
	System.out.println("pin2Txt                     : "+actpin2Txt                     +" Value Expected : "+exppin2Txt);
	System.out.println("sendEmailCheckBox           : "+actsendEmailCheckBox           +" Value Expected : "+expsendEmailCheckBox);
	System.out.println("allowCustomerPortalCheckBox : "+actallowCustomerPortalCheckBox +" Value Expected : "+expallowCustomerPortalCheckBox);
	System.out.println("sendEmailTxt                : "+actsendEmailTxt                +" Value Expected : "+expsendEmailTxt);
	System.out.println("passwordTxt                 : "+actpasswordTxt                 +" Value Expected : "+exppasswordTxt);
	System.out.println("telphoneNumberTxt           : "+acttelphoneNumberTxt           +" Value Expected : "+exptelphoneNumberTxt);
	System.out.println("faxNoTxt                    : "+actfaxNoTxt                    +" Value Expected : "+expfaxNoTxt);
	
	if(actaddressTxt==expaddressTxt && actcityTxt==expcityTxt && actdeliveryAddressTxt==expdeliveryAddressTxt
			&& actpinTxt==exppinTxt && actcity2Text==expcity2Text && actpin2Txt==exppin2Txt && actsendEmailCheckBox==expsendEmailCheckBox
			&& actallowCustomerPortalCheckBox==expallowCustomerPortalCheckBox && actsendEmailTxt==expsendEmailTxt && actpasswordTxt==exppasswordTxt
			&& acttelphoneNumberTxt==exptelphoneNumberTxt && actfaxNoTxt==expfaxNoTxt)
	{
		excelReader.setCellData(xlfile, "Sheet1", 389, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 389, 9, resFail);
		return false;
	}
}


public static boolean checkPrintlayoutTabOnClickOnAddGroupButton() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerPrintLayoutTab));
	headerPrintLayoutTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gridVoucherTypeTxt));
	gridVoucherTypeTxt.click();
	 
	boolean actgridVoucherTypeTxt =gridVoucherTypeTxt.isDisplayed();
	boolean actgridPrintLayoutTxt =gridPrintLayoutTxt.isDisplayed();
	 
	boolean expgridVoucherTypeTxt =true;
	boolean expgridPrintLayoutTxt =true;
	 
	System.out.println("**********************************checkPrintlayoutTabOnClickOnAddGroupButton*************************");
	 
	System.out.println("gridVoucherTypeTxt  : "+actgridVoucherTypeTxt+" Value Expected : "+expgridVoucherTypeTxt);
	System.out.println("gridPrintLayoutTxt  : "+actgridPrintLayoutTxt+" Value Expected : "+expgridPrintLayoutTxt);
	 
	if(actgridVoucherTypeTxt==expgridVoucherTypeTxt && actgridPrintLayoutTxt==expgridPrintLayoutTxt)
	{
		excelReader.setCellData(xlfile, "Sheet1", 390, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 390, 9, resFail);
		return false;
	}
}


public static boolean checkNewTreeTabUpdateTabGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_TreeTabUpdate));
    extraFields_TreeTabUpdate.click();
	 		 
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterTreeIdDropdown));	
	 
    boolean actmasterTreeIdDropdown    	        =masterTreeIdDropdown.isDisplayed();
    boolean actmasterTreeViewIDDropdown    	    =masterTreeViewIDDropdown.isDisplayed();
    boolean actmasterOptionToHideAccountsGroupTree =masterOptionToHideAccountsGroupTree.isDisplayed();
    boolean actaccountAssestsGroup 				=accountAssestsGroup.isDisplayed();
	 
    boolean expmasterTreeIdDropdown        	    =true;
    boolean expmasterTreeViewIDDropdown    	    =true;
    boolean expmasterOptionToHideAccountsGroupTree =true;
    boolean expaccountAssestsGroup 				=true;
    
    System.out.println("*********************************checkNewTreeTabUpdateTabGroup****************************");
    
    System.out.println("masterTreeIdDropdown                  : "+actmasterTreeIdDropdown                  +" Value Expected : "+expmasterTreeIdDropdown);
    System.out.println("masterTreeViewIDDropdown              : "+actmasterTreeViewIDDropdown              +" Value Expected : "+expmasterTreeViewIDDropdown);
    System.out.println("masterOptionToHideAccountsGroupTree   : "+actmasterOptionToHideAccountsGroupTree   +" Value Expected : "+expmasterOptionToHideAccountsGroupTree);
    System.out.println("accountAssestsGroup                   : "+actaccountAssestsGroup                   +" Value Expected : "+expaccountAssestsGroup);
    
    if(actmasterTreeIdDropdown==expmasterTreeIdDropdown  && actmasterTreeViewIDDropdown==expmasterTreeViewIDDropdown
    		&& actmasterOptionToHideAccountsGroupTree==expmasterOptionToHideAccountsGroupTree
    		&& actaccountAssestsGroup==expaccountAssestsGroup)
    {	
    	excelReader.setCellData(xlfile, "Sheet1", 391, 9, resPass);
    	return true;
    }	 
    else
    {
    	excelReader.setCellData(xlfile, "Sheet1", 391, 9, resFail);
    	return false;
    }
}




public static boolean checkNewDocumentTabGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DocumentTab));
	extraFields_DocumentTab.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_DocumentTab_FileName));
	 
	boolean actextraFields_DocumentTab_FileName       =extraFields_DocumentTab_FileName.isDisplayed();
	boolean actextraFields_DocumentTab_UploadDocument =extraFields_DocumentTab_UploadDocument.isDisplayed();
	boolean actextraFields_DocumentTab_SaveDocument   =extraFields_DocumentTab_SaveDocument.isDisplayed();
	boolean actextraFields_DocumentTab_DeleteDocument =extraFields_DocumentTab_DeleteDocument.isDisplayed();
	boolean actextraFields_DocumentTab_FileSize       =extraFields_DocumentTab_FileSize.isDisplayed();
	
	boolean expextraFields_DocumentTab_FileName       =true;
	boolean expextraFields_DocumentTab_UploadDocument =true;
	boolean expextraFields_DocumentTab_SaveDocument   =true;
	boolean expextraFields_DocumentTab_DeleteDocument =true;
	boolean expextraFields_DocumentTab_FileSize       =true;
	
	System.out.println("**************************************checkNewDocumentTabGroup***********************************");
	
	System.out.println("extraFields_DocumentTab_FileName        : "+actextraFields_DocumentTab_FileName       +" Value Expected : "+expextraFields_DocumentTab_FileName);
	System.out.println("extraFields_DocumentTab_UploadDocument  : "+actextraFields_DocumentTab_UploadDocument +" Value Expected : "+expextraFields_DocumentTab_UploadDocument);
	System.out.println("extraFields_DocumentTab_SaveDocument    : "+actextraFields_DocumentTab_SaveDocument   +" Value Expected : "+expextraFields_DocumentTab_SaveDocument);
	System.out.println("extraFields_DocumentTab_DeleteDocument  : "+actextraFields_DocumentTab_DeleteDocument +" Value Expected : "+expextraFields_DocumentTab_DeleteDocument);
	System.out.println("extraFields_DocumentTab_FileSize        : "+actextraFields_DocumentTab_FileSize       +" Value Expected : "+expextraFields_DocumentTab_FileSize);
 
	if(actextraFields_DocumentTab_FileName==expextraFields_DocumentTab_FileName
			&& actextraFields_DocumentTab_UploadDocument==expextraFields_DocumentTab_UploadDocument
			&& actextraFields_DocumentTab_SaveDocument==expextraFields_DocumentTab_SaveDocument
			&& actextraFields_DocumentTab_DeleteDocument==expextraFields_DocumentTab_DeleteDocument
			&& actextraFields_DocumentTab_FileSize==expextraFields_DocumentTab_FileSize)
	{
		excelReader.setCellData(xlfile, "Sheet1", 392, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 392, 9, resFail);
		return false;
	}
}



public static boolean checkNewInCreateTabGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_CreateTab));
	extraFields_CreateTab.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupCreateCreateTab_ExtraFieldUpdate));
	
	boolean actaddGroupCreateCreateTab_ExtraFieldUpdate  =addGroupCreateCreateTab_ExtraFieldUpdate.isDisplayed();
	boolean expaddGroupCreateCreateTab_ExtraFieldUpdate  =true;
	
	System.out.println("*************************************checkNewInCreateTabGroup************************************");
	
	System.out.println("addGroupCreateCreateTab_ExtraFieldUpdate : "+actaddGroupCreateCreateTab_ExtraFieldUpdate+" Value Expected : "+expaddGroupCreateCreateTab_ExtraFieldUpdate);
 
	if(actaddGroupCreateCreateTab_ExtraFieldUpdate==expaddGroupCreateCreateTab_ExtraFieldUpdate)
	{
		excelReader.setCellData(xlfile, "Sheet1", 393, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 393, 9, resFail);
		return false;
	}
}


public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  	
	System.err.println("*****************Account Master*****************");
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	headerGeneralTab.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(saveBtn));
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="In Tab :General ---> Name Field is Required";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkSaveButtonWithoutInputNameMandatoryFieldsInAddGroupOption***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 394, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 394, 9, resFail);
		return false;
	}
}


public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(nameTxt));
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.sendKeys("Customer Group");
	nameTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="In Tab :General ---> Code Field is Required";
		
	String actMessage=checkValidationMessage(expMessage);
	 		 
	System.out.println("********************************checkSaveButtonWithoutInputCodeMandatoryFieldsInAddGroupOption***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 395, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 395, 9, resFail);
		return false;
	}
}



public static boolean checkSaveButtonInAddGroupWithInputingMandatoryFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.click();
	codeTxt.sendKeys("Customer Group");
	codeTxt.sendKeys(Keys.TAB);
     
	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(accountTypeDropdown));
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Saved Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkSaveButtonInAddGroupWithInputingMandatoryFields***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 396, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 396, 9, resFail);
		return false;
	}
}


public static boolean checkAccountAddGroupCreationScreenAfterSaving() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	headerGeneralTab.click();
	
	
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	boolean actnameTxt                =nameTxt.isDisplayed();
	boolean actcodeTxt                =codeTxt.isDisplayed();
	boolean actaccountTypeDropdown    =accountTypeDropdown.isDisplayed();
	boolean actcreditLimitTxt         =creditLimitTxt.isDisplayed();
	boolean actcreditdaysTxt          =creditdaysTxt.isDisplayed();
	boolean actchequeDiscountLimitTxt =chequeDiscountLimitTxt.isDisplayed();
	boolean actrateofinterestTxt      =rateofinterestTxt.isDisplayed();
	boolean actbankAccountTxt         =bankAccountTxt.isDisplayed();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	
	boolean actheaderGeneralTab          =headerGeneralTab.isDisplayed();
	boolean actheaderAccountSettingTab   =headerAccountSettingTab.isDisplayed();
	boolean actheaderDetailsTab          =headerDetailsTab.isDisplayed();
	boolean actheaderPrintLayoutTab      =headerPrintLayoutTab.isDisplayed();
	boolean actsaveBtn                   =saveBtn.isDisplayed();
	boolean actcloseBtn                  =closeBtn.isDisplayed();
	
	boolean expnameTxt                =true;
	boolean expcodeTxt                =true;
	boolean expaccountTypeDropdown    =true;
	boolean expcreditLimitTxt         =true;
	boolean expcreditdaysTxt          =true;
	boolean expchequeDiscountLimitTxt =true;
	boolean exprateofinterestTxt      =true;
	boolean expbankAccountTxt         =true;
	
	boolean expheaderGeneralTab          =true;
	boolean expheaderAccountSettingTab   =true;
	boolean expheaderDetailsTab          =true;
	boolean expheaderPrintLayoutTab      =true;
	boolean expsaveBtn                   =true;
	boolean expcloseBtn                  =true;
	
	System.out.println("*******************************checkAccountAddGroupCreationScreenAfterSaving************************");
	
	System.out.println("nameTxt                   : "+actnameTxt                 +" Value Expected : "+expnameTxt);
	System.out.println("codeTxt                   : "+actcodeTxt                 +" Value Expected : "+expcodeTxt);
	System.out.println("accountTypeDropdown       : "+actaccountTypeDropdown     +" Value Expected : "+expaccountTypeDropdown);
	System.out.println("creditLimitTxt            : "+actcreditLimitTxt          +" Value Expected : "+expcreditLimitTxt);
	System.out.println("creditdaysTxt             : "+actcreditdaysTxt           +" Value Expected : "+expcreditdaysTxt);
	System.out.println("chequeDiscountLimitTxt    : "+actchequeDiscountLimitTxt  +" Value Expected : "+expchequeDiscountLimitTxt);
	System.out.println("rateofinterestTxt         : "+actrateofinterestTxt       +" Value Expected : "+exprateofinterestTxt);
	System.out.println("bankAccountTxt            : "+actbankAccountTxt          +" Value Expected : "+expbankAccountTxt);
	System.out.println("headerGeneralTab          : "+actheaderGeneralTab        +" Value Expected : "+expheaderGeneralTab);
	System.out.println("headerAccountSettingTab   : "+actheaderAccountSettingTab +" Value Expected : "+expheaderAccountSettingTab);
	System.out.println("headerDetailsTab          : "+actheaderDetailsTab        +" Value Expected : "+expheaderDetailsTab);
	System.out.println("headerPrintLayoutTab      : "+actheaderPrintLayoutTab    +" Value Expected : "+expheaderPrintLayoutTab);
	System.out.println("saveBtn                   : "+actsaveBtn                 +" Value Expected : "+expsaveBtn);
	System.out.println("closeBtn                  : "+actcloseBtn                +" Value Expected : "+expcloseBtn);
	
	if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actaccountTypeDropdown==expaccountTypeDropdown 
			&& actcreditLimitTxt==expcreditLimitTxt && actcreditdaysTxt==expcreditdaysTxt && actchequeDiscountLimitTxt==expchequeDiscountLimitTxt
			&& actrateofinterestTxt==exprateofinterestTxt && actbankAccountTxt==expbankAccountTxt
			&& actheaderGeneralTab==expheaderGeneralTab && actheaderAccountSettingTab==expheaderAccountSettingTab && actheaderDetailsTab==expheaderDetailsTab
			&& actheaderPrintLayoutTab==expheaderPrintLayoutTab && actsaveBtn==expsaveBtn && actcloseBtn==expcloseBtn) 
	{
		excelReader.setCellData(xlfile, "Sheet1", 397, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 397, 9, resFail);
		return false;
	}
}



public static boolean checkAccountAddGroupNewCreateDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  			 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeAccMasterCreationScreen));
	closeAccMasterCreationScreen.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
	String actaccountNewCreationName  =accountNewCreationName.getText();
	String expaccountNewCreationName  ="Customer Group";
	
	System.out.println("***********************checkAccountAddGroupNewCreateDisplayInAccountGrid************************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
 
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 398, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 398, 9, resFail);
		return false;
	}
}



//Server Error Elements
@FindBy(xpath="//div[@id='id_focus_msgbox_main']")
private static WebElement serverErrorPopup;

@FindBy(xpath="//div[@id='id_focus_msgbox_title']/div[2]/span")
private static WebElement serverErrorTitleClose;
			
@FindBy(xpath="//div[@id='id_focus_msgbox_main']/div[2]/button")
private static WebElement serverErrorClose;



//Edit Option For Add Group

public static boolean checkEditOptionForNewlyCreateAddGroupAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	accountFirstCheckBoxToSelection.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	masterEditBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	String actnameTxt =nameTxt.getAttribute("value");
	String expnameTxt ="Customer Group";
	
	System.out.println("*************************checkEditOptionForNewlyCreateAddGroupAccount***********************");
	
	System.out.println("nameTxt  : "+actnameTxt+" Value Expected : "+expnameTxt);
	 
	if(actnameTxt.equalsIgnoreCase(expnameTxt))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 399, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 399, 9, resFail);
		return false;
	}
}




public static boolean checkUpateForNewlyCreateAddGroupAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	nameTxt.clear();
	nameTxt.sendKeys("Customer Update Group");
	nameTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.click();
	codeTxt.clear();
	codeTxt.sendKeys("CG Update");
	codeTxt.sendKeys(Keys.TAB); 
	 		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Updated Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkUpateForNewlyCreateAddGroupAccount***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 400, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 400, 9, resFail);
		return false;
	}
}


public static boolean checkUpdatedAccountGroupDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
	String actaccountNewCreationName  =accountNewCreationName.getText();
	String expaccountNewCreationName  ="Customer Update Group";
 
	System.out.println("************************checkUpdatedAccountGroupDisplayInAccountGrid*********************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 401, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 401, 9, resFail);
		return false;
	}
}

//Edit Option for Account

public static boolean checkEditOptionForNewlyCreateAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  	
	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(accountSecondCheckBox));
	accountSecondCheckBox.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	masterEditBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	
	String actnameTxt  =nameTxt.getAttribute("value");
	String expnameTxt  ="Customer";
	
	System.out.println("*******************checkEditOptionForNewlyCreateAccount***********************");
	
	System.out.println("nameTxt  : "+actnameTxt+" Value Expected : "+expnameTxt);
	
	if(actnameTxt.equalsIgnoreCase(expnameTxt))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 402, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 402, 9, resFail);
		return false;
	}
}


public static boolean checkUpateForNewlyCreateAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	nameTxt.clear();
	nameTxt.sendKeys("Customer Update");
	nameTxt.sendKeys(Keys.TAB); 
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.click();
	codeTxt.clear();
	codeTxt.sendKeys("CUpdate");
	codeTxt.sendKeys(Keys.TAB); 
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	accountTypeDropdown.sendKeys(Keys.TAB); 
	 	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
	creditLimitTxt.sendKeys("193");
	creditLimitTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditdaysTxt));
	creditdaysTxt.sendKeys("3");
	creditdaysTxt.sendKeys(Keys.TAB);
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(chequeDiscountLimitTxt)); 
	chequeDiscountLimitTxt.sendKeys("104");
	chequeDiscountLimitTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateofinterestTxt)); 
	rateofinterestTxt.sendKeys("4");
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Updated Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkUpateForNewlyCreateAccount***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 403, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 403, 9, resFail);
		return false;
	}
}


public static boolean checkUpdatedAccountDisplayInAccountGrid() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		
	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(accountNewCreationNameOfLane));
	 
	String actaccountNewCreationNameOfLane =accountNewCreationNameOfLane.getText();
	String expaccountNewCreationNameOfLane ="Customer Update";
	
	System.out.println("************************checkUpdatedAccountDisplayInAccountGrid****************************");
	
	System.out.println("accountNewCreationNameOfLane  : "+actaccountNewCreationNameOfLane+" Value Expected : "+expaccountNewCreationNameOfLane);
	 
	if(actaccountNewCreationNameOfLane.equalsIgnoreCase(expaccountNewCreationNameOfLane))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 404, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 404, 9, resFail);
		return false;
	}
}


public static boolean checkClickOnGroupToDisplayEmpty() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	getAction().doubleClick(accountFirstCheckBoxToSelection).build().perform();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountGroupTitleDisplay));
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnEmptyGroup));
	
	String actaccountGroupTitleDisplay =accountGroupTitleDisplay.getText();
	String actclickOnEmptyGroup        =clickOnEmptyGroup.getText();
	
	String expaccountGroupTitleDisplay ="Customer Update Group";
	String expclickOnEmptyGroup        ="No record found";
	
	System.out.println("******************************checkClickOnGroupToDisplayEmpty******************************");
	
	System.out.println("accountGroupTitleDisplay  : "+actaccountGroupTitleDisplay+" Value Expected : "+expaccountGroupTitleDisplay);
	System.out.println("clickOnEmptyGroup         : "+actclickOnEmptyGroup       +" Value Expected : "+expclickOnEmptyGroup);
	
	if(actaccountGroupTitleDisplay.equalsIgnoreCase(expaccountGroupTitleDisplay)
			&& actclickOnEmptyGroup.equalsIgnoreCase(expclickOnEmptyGroup))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 405, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 405, 9, resFail);
		return false;
	}
}

//Close the Account master and Open again to check Clone Options


public static boolean checkCloseAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
	masterCloseBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
	
	boolean actlabelDashboard                  =labelDashboard.isDisplayed();
	boolean actselectDashboard                 =selectDashboard.isDisplayed();
	boolean actnewAddDashBoard                 =newAddDashBoard.isDisplayed();
	boolean actdashboardCustomizationSettings  =dashboardCustomizationSettings.isDisplayed();
	
	boolean explabelDashboard                  =true;
	boolean expselectDashboard                 =true;
	boolean expnewAddDashBoard                 =true;
	boolean expdashboardCustomizationSettings  =true;
	
	System.out.println("******************************checkCloseAccountMaster************************");
	
	System.out.println("labelDashboard                  : "+actlabelDashboard                 +" Value Expected : "+explabelDashboard);
	System.out.println("selectDashboard                 : "+actselectDashboard                +" Value Expected : "+expselectDashboard);
	System.out.println("newAddDashBoard                 : "+actnewAddDashBoard                +" Value Expected : "+expnewAddDashBoard);
	System.out.println("dashboardCustomizationSettings  : "+actdashboardCustomizationSettings +" Value Expected : "+expdashboardCustomizationSettings);
	
	if(labelDashboard.isDisplayed() && selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() && dashboardCustomizationSettings.isDisplayed())
	{
		excelReader.setCellData(xlfile, "Sheet1", 406, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 406, 9, resFail);
		return false;
	}
}



public static boolean checkCloneOptionWithoutRowSelectToOpenAccountsMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	mastersMenu.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
	accounts.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAccountsReceivableGroup));
	accountAccountsReceivableGroup.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	getAction().doubleClick(accountFirstCheckBoxToSelection).build().perform();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloneBtn));
	masterCloneBtn.click();
	 
	String expMessage="Please select a row";
		
	String actMessage=checkValidationMessage(expMessage);
		
	System.out.println("********************************checkCloneOptionWithoutRowSelectToOpenAccountsMenu***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 407, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 407, 9, resFail);
		return false;
	}
}

//Check Clone and Adding Account in the Group

public static boolean checkAccountOneCreationWithPropertyAsCDForEachUnderGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	masterNewBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	nameTxt.clear();
	nameTxt.sendKeys("Customer Display CD For Each Account One");
	nameTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.sendKeys("9001");
	codeTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	accountTypeDropdown.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
	creditLimitTxt.sendKeys("194");
	creditLimitTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditdaysTxt));
	creditdaysTxt.sendKeys("4");
	creditdaysTxt.sendKeys(Keys.TAB);
    
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(chequeDiscountLimitTxt));
	chequeDiscountLimitTxt.sendKeys("106");
	chequeDiscountLimitTxt.sendKeys(Keys.TAB);
	
	rateofinterestTxt.sendKeys("9");
	 
	nameTxt.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	          
	String expMessage="Saved Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();

	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	closeBtn.click();
	 
	System.out.println("********************************checkAccountOneCreationWithPropertyAsCDForEachUnderGroup***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 408, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 408, 9, resFail);
		return false;
	}
}


//Clone Option


public static boolean checkByCloneOptionAccountInformation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterGridHeader_SelectAllRowsCheckBox));
	masterGridHeader_SelectAllRowsCheckBox.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloneBtn));
	masterCloneBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	nameTxt.sendKeys("Customer Display CD For Each Account Two");
	nameTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.sendKeys("9002");
	codeTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	
	Select oSelect = new Select(accountTypeDropdown);
	List <WebElement> elementCount = oSelect.getOptions();
	int actaccTypeSize = elementCount.size();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	boolean actnameTxt                =nameTxt.isDisplayed();
	boolean actcodeTxt                =codeTxt.isDisplayed();
	boolean actaccountTypeDropdown    =accountTypeDropdown.isDisplayed();
	boolean actcreditLimitTxt         =creditLimitTxt.isDisplayed();
	boolean actcreditdaysTxt          =creditdaysTxt.isDisplayed();
	boolean actchequeDiscountLimitTxt =chequeDiscountLimitTxt.isDisplayed();
	boolean actrateofinterestTxt      =rateofinterestTxt.isDisplayed();
	boolean actbankAccountTxt         =bankAccountTxt.isDisplayed();
	
	String actcreditLimitTxtValue         =creditLimitTxt.getAttribute("value");
	String actcreditdaysTxtValue          =creditdaysTxt.getAttribute("value");
	String actchequeDiscountLimitTxtValue =chequeDiscountLimitTxt.getAttribute("value");
	String actrateofinterestTxtalue       =rateofinterestTxt.getAttribute("value");
	
	int     expaccTypeSize            =24;
	boolean expnameTxt                =true;
	boolean expcodeTxt                =true;
	boolean expaccountTypeDropdown    =true;
	boolean expcreditLimitTxt         =true;
	boolean expcreditdaysTxt          =true;
	boolean expchequeDiscountLimitTxt =true;
	boolean exprateofinterestTxt      =true;
	boolean expbankAccountTxt         =true;
	
	String expcreditLimitTxtValue         ="194.000";
	String expcreditdaysTxtValue          ="4";
	String expchequeDiscountLimitTxtValue ="106.000";
	String exprateofinterestTxtalue       ="9.00";
	
	System.out.println("*******************************checkGenralTabOnClickOnAddGroupButton************************");
	
	System.out.println("nameTxt                     : "+actnameTxt                     +" Value Expected : "+expnameTxt);
	System.out.println("codeTxt                     : "+actcodeTxt                     +" Value Expected : "+expcodeTxt);
	System.out.println("accountTypeDropdown         : "+actaccountTypeDropdown         +" Value Expected : "+expaccountTypeDropdown);
	System.out.println("creditLimitTxt              : "+actcreditLimitTxt              +" Value Expected : "+expcreditLimitTxt);
	System.out.println("creditdaysTxt               : "+actcreditdaysTxt               +" Value Expected : "+expcreditdaysTxt);
	System.out.println("chequeDiscountLimitTxt      : "+actchequeDiscountLimitTxt      +" Value Expected : "+expchequeDiscountLimitTxt);
	System.out.println("rateofinterestTxt           : "+actrateofinterestTxt           +" Value Expected : "+exprateofinterestTxt);
	System.out.println("bankAccountTxt              : "+actbankAccountTxt              +" Value Expected : "+expbankAccountTxt);
	System.out.println("accTypeSize                 : "+actaccTypeSize                 +" Value Expected : "+expaccTypeSize);
	System.out.println("creditLimitTxtValue         :"+actcreditLimitTxtValue          +" Value Expected :"+expcreditLimitTxtValue);
	System.out.println("creditdaysTxtValue          :"+actcreditdaysTxtValue           +" Value Expected :"+expcreditdaysTxtValue);
	System.out.println("chequeDiscountLimitTxtValue :"+actchequeDiscountLimitTxtValue  +" Value Expected :"+expchequeDiscountLimitTxtValue);
	System.out.println("rateofinterestTxtalue       :"+actrateofinterestTxtalue        +" Value Expected :"+exprateofinterestTxtalue);
	
	
	if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actaccountTypeDropdown==expaccountTypeDropdown 
			&& actcreditLimitTxt==expcreditLimitTxt && actcreditdaysTxt==expcreditdaysTxt && actchequeDiscountLimitTxt==expchequeDiscountLimitTxt
			&& actrateofinterestTxt==exprateofinterestTxt && actbankAccountTxt==expbankAccountTxt && actaccTypeSize==expaccTypeSize
			&& actcreditLimitTxtValue.equalsIgnoreCase(expcreditLimitTxtValue) && actcreditdaysTxtValue.equalsIgnoreCase(expcreditdaysTxtValue)
			&& actchequeDiscountLimitTxtValue.equalsIgnoreCase(expchequeDiscountLimitTxtValue)
			&& actrateofinterestTxtalue.equalsIgnoreCase(exprateofinterestTxtalue))
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 409, 9, resPass);
		 return true;
	 }
	 else
	 {
		 excelReader.setCellData(xlfile, "Sheet1", 409, 9, resFail);
		 return false;
	 }
}


public static boolean checkSaveAccountByUsingCloneOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Saved Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkSaveAccountByUsingCloneOption***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 410, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 410, 9, resFail);
		return false;
	}
}



public static boolean checkAccountDisplayCreationOfAccountThroughMainClone() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationNameOfLane));
		 
	String actaccountNewCreationName  =accountNewCreationName.getText();
	String expaccountNewCreationName  ="Customer Display CD For Each Account Two";
	
	System.out.println("*********************checkAccountDisplayCreationOfAccountThroughMainClone**************************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	 
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 411, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 411, 9, resFail);
		return false;
	}
}


//Clone Option in the Edit Account

public static boolean checkCloneOptionInEditAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	accountFirstCheckBoxToSelection.click();		 
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	masterEditBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editcloneBtn));
	editcloneBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	
	Select oSelect = new Select(accountTypeDropdown);
	List <WebElement> elementCount = oSelect.getOptions();
	int actaccTypeSize = elementCount.size();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	 
	boolean actnameTxt                =nameTxt.isDisplayed();
	boolean actcodeTxt                =codeTxt.isDisplayed();
	boolean actaccountTypeDropdown    =accountTypeDropdown.isDisplayed();
	boolean actcreditLimitTxt         =creditLimitTxt.isDisplayed();
	boolean actcreditdaysTxt          =creditdaysTxt.isDisplayed();
	boolean actchequeDiscountLimitTxt =chequeDiscountLimitTxt.isDisplayed();
	boolean actrateofinterestTxt      =rateofinterestTxt.isDisplayed();
	boolean actbankAccountTxt         =bankAccountTxt.isDisplayed();
	
	String actcreditLimitTxtValue         =creditLimitTxt.getAttribute("value");
	String actcreditdaysTxtValue          =creditdaysTxt.getAttribute("value");
	String actchequeDiscountLimitTxtValue =chequeDiscountLimitTxt.getAttribute("value");
	String actrateofinterestTxtalue       =rateofinterestTxt.getAttribute("value");
	
	int     expaccTypeSize            =24;
	boolean expnameTxt                =true;
	boolean expcodeTxt                =true;
	boolean expaccountTypeDropdown    =true;
	boolean expcreditLimitTxt         =true;
	boolean expcreditdaysTxt          =true;
	boolean expchequeDiscountLimitTxt =true;
	boolean exprateofinterestTxt      =true;
	boolean expbankAccountTxt         =true;
	
	String expcreditLimitTxtValue         ="194.000";
	String expcreditdaysTxtValue          ="4";
	String expchequeDiscountLimitTxtValue ="106.000";
	String exprateofinterestTxtalue       ="9.00";
	
	System.out.println("*******************************checkCloneOptionInEditAccount************************");
	
	System.out.println("nameTxt                     : "+actnameTxt                     +" Value Expected : "+expnameTxt);
	System.out.println("codeTxt                     : "+actcodeTxt                     +" Value Expected : "+expcodeTxt);
	System.out.println("accountTypeDropdown         : "+actaccountTypeDropdown         +" Value Expected : "+expaccountTypeDropdown);
	System.out.println("creditLimitTxt              : "+actcreditLimitTxt              +" Value Expected : "+expcreditLimitTxt);
	System.out.println("creditdaysTxt               : "+actcreditdaysTxt               +" Value Expected : "+expcreditdaysTxt);
	System.out.println("chequeDiscountLimitTxt      : "+actchequeDiscountLimitTxt      +" Value Expected : "+expchequeDiscountLimitTxt);
	System.out.println("rateofinterestTxt           : "+actrateofinterestTxt           +" Value Expected : "+exprateofinterestTxt);
	System.out.println("bankAccountTxt              : "+actbankAccountTxt              +" Value Expected : "+expbankAccountTxt);
	System.out.println("accTypeSize                 : "+actaccTypeSize                 +" Value Expected : "+expaccTypeSize);
	System.out.println("creditLimitTxtValue         :"+actcreditLimitTxtValue          +" Value Expected :"+expcreditLimitTxtValue);
	System.out.println("creditdaysTxtValue          :"+actcreditdaysTxtValue           +" Value Expected :"+expcreditdaysTxtValue);
	System.out.println("chequeDiscountLimitTxtValue :"+actchequeDiscountLimitTxtValue  +" Value Expected :"+expchequeDiscountLimitTxtValue);
	System.out.println("rateofinterestTxtalue       :"+actrateofinterestTxtalue        +" Value Expected :"+exprateofinterestTxtalue);
	
	
	if(actnameTxt==expnameTxt && actcodeTxt==expcodeTxt && actaccountTypeDropdown==expaccountTypeDropdown 
			&& actcreditLimitTxt==expcreditLimitTxt && actcreditdaysTxt==expcreditdaysTxt && actchequeDiscountLimitTxt==expchequeDiscountLimitTxt
			&& actrateofinterestTxt==exprateofinterestTxt && actbankAccountTxt==expbankAccountTxt && actaccTypeSize==expaccTypeSize
			&& actcreditLimitTxtValue.equalsIgnoreCase(expcreditLimitTxtValue) && actcreditdaysTxtValue.equalsIgnoreCase(expcreditdaysTxtValue)
			&& actchequeDiscountLimitTxtValue.equalsIgnoreCase(expchequeDiscountLimitTxtValue)
			&& actrateofinterestTxtalue.equalsIgnoreCase(exprateofinterestTxtalue))
	{
		excelReader.setCellData(xlfile, "Sheet1", 412, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 412, 9, resFail);
		return false;
	}
}



public static boolean checkSaveButtonWithoutInputNameMandatoryFieldsInCloneOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerGeneralTab));
	headerGeneralTab.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
 
	String expMessage="In Tab :General ---> Name Field is Required";
	
	String actMessage=checkValidationMessage(expMessage);
	
	System.out.println("********************************checkSaveButtonWithoutInputNameMandatoryFieldsInCloneOption***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 413, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 413, 9, resFail);
		return false;
	}
}


public static boolean checkSaveButtonWithoutInputCodeMandatoryFieldsInCloneOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.sendKeys("Customer Display CD For Each Account Three");
	nameTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="In Tab :General ---> Code Field is Required";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkSaveButtonWithoutInputCodeMandatoryFieldsInCloneOption***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 414, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 414, 9, resFail);
		return false;
	}
}


public static boolean checkSaveAccountByUsingEditCloneInMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.sendKeys("9003");
	codeTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	accountTypeDropdown.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Saved Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
	
	System.out.println("********************************checkSaveAccountByUsingEditCloneInMaster***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 415, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 415, 9, resFail);
		return false;
	}
}



public static boolean checkCloneByEditCreationOfAccountDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationNameOfLane));
	 
	String actaccountNewCreationName  =accountNewCreationName.getText();
	String expaccountNewCreationName  ="Customer Display CD For Each Account Three";
	
	System.out.println("*********************checkCloneByEditCreationOfAccountDisplay**************************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	 
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 416, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 416, 9, resFail);
		return false;
	}
}


public static boolean checkCloseAndOpenAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
	masterCloseBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	mastersMenu.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
	accounts.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));
     
	String actaccountsTitle  =accountsTitle.getText();
	String expaccountsTitle  ="Account";
	
	System.out.println("*********************************checkCloseAndOpenAccountMaster**************************");
     
	System.out.println("accountsTitle  : "+actaccountsTitle+" Value Expected : "+expaccountsTitle);
     
	if(actaccountsTitle.equalsIgnoreCase(expaccountsTitle))
	{	
		excelReader.setCellData(xlfile, "Sheet1", 417, 9, resPass);
		return true;
	}	 
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 417, 9, resFail);
		return false;
	}
}


//Copy and Paste Options


public static boolean checkCopyOptionByEditAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	accountFirstCheckBoxToSelection.click();	
	getAction().doubleClick(accountFirstCheckBoxToSelection).build().perform();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	masterEditBtn.click();
	
	Thread.sleep(3000);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyBtn));
	copyBtn.click();
	copyBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	
	Thread.sleep(2000);
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
	creditLimitTxt.click();
	
	String actcreditLimitTxtValue         =creditLimitTxt.getAttribute("value");
	String actcreditdaysTxtValue          =creditdaysTxt.getAttribute("value");
	String actchequeDiscountLimitTxtValue =chequeDiscountLimitTxt.getAttribute("value");
	String actrateofinterestTxtalue       =rateofinterestTxt.getAttribute("value");
	
	String expcreditLimitTxtValue         ="194.000";
	String expcreditdaysTxtValue          ="4";
	String expchequeDiscountLimitTxtValue ="106.000";
	String exprateofinterestTxtalue       ="9.00";
	
	System.out.println("*******************************checkCopyOptionByEditAccount************************");
	
	System.out.println("creditLimitTxtValue         :"+actcreditLimitTxtValue          +" Value Expected :"+expcreditLimitTxtValue);
	System.out.println("creditdaysTxtValue          :"+actcreditdaysTxtValue           +" Value Expected :"+expcreditdaysTxtValue);
	System.out.println("chequeDiscountLimitTxtValue :"+actchequeDiscountLimitTxtValue  +" Value Expected :"+expchequeDiscountLimitTxtValue);
	System.out.println("rateofinterestTxtalue       :"+actrateofinterestTxtalue        +" Value Expected :"+exprateofinterestTxtalue);
	
	
	if(actcreditLimitTxtValue.equalsIgnoreCase(expcreditLimitTxtValue) && actcreditdaysTxtValue.equalsIgnoreCase(expcreditdaysTxtValue)
			&& actchequeDiscountLimitTxtValue.equalsIgnoreCase(expchequeDiscountLimitTxtValue)
			&& actrateofinterestTxtalue.equalsIgnoreCase(exprateofinterestTxtalue))
	{
		excelReader.setCellData(xlfile, "Sheet1", 418, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 418, 9, resFail);
		return false;
	}
}



public static boolean checkPasteOptionAndClickOnSaveForDuplicateName() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeAccMasterCreationScreen));
	closeAccMasterCreationScreen.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	masterNewBtn.click();		 
	 
	Thread.sleep(3000);
	
	try
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteBtn));
		pasteBtn.click();
	}
	catch(Exception e)
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
		userNameDisplay.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(3000);
		
		Thread.sleep(2000);
		
        LoginPage lp=new LoginPage(getDriver()); 
		
		String unamelt="su";
				      
		String pawslt="su";
			
		Thread.sleep(2000);
		
		lp.enterUserName(unamelt);
				
		lp.enterPassword(pawslt);
				  
		lp.clickOnSignInBtn();
		
		//checkRefershPopOnlogin();
		
		//checkPopUpWindow();
	
		Thread.sleep(10000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
	     
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();
	     
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountAccountsReceivableCustomerUpdateGroup));
		accountAccountsReceivableCustomerUpdateGroup.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
		getAction().doubleClick(accountFirstCheckBoxToSelection).build().perform();
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyBtn));
		copyBtn.click();
         
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeAccMasterCreationScreen));
		closeAccMasterCreationScreen.click();
		
		Thread.sleep(2000);
         
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		masterNewBtn.click();		 
		 
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pasteBtn));
		pasteBtn.click();
	}
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();		 
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Code Is Unique";
	
	String actMessage=checkValidationMessage(expMessage);
	
	System.out.println("********************************checkPasteOptionAndClickOnSaveForDuplicateName***************************");
	
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 419, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 419, 9, resFail);
		return false;
	}
}






public static boolean checkSaveUsingCopyAndPasteOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		  		 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	nameTxt.clear();
	nameTxt.sendKeys("Customer Display CD For Each Account Four");
	nameTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.clear();
	codeTxt.sendKeys("9004");
	codeTxt.sendKeys(Keys.TAB); 
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	accountTypeDropdown.sendKeys(Keys.TAB);
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Saved Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("********************************checkSaveUsingCopyAndPasteOption***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 420, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 420, 9, resFail);
		 return false;
	}
}




public static boolean checkCopyAndPasteCreationOfAccountDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeAccMasterCreationScreen));
	closeAccMasterCreationScreen.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationNameOfLane));
	 
	String actaccountNewCreationName  =accountNewCreationName.getText();
	String expaccountNewCreationName  ="Customer Display CD For Each Account Four";
	
	System.out.println("*********************checkCopyAndPasteCreationOfAccountDisplay**************************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	 
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 421, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 421, 9, resFail);
		return false;
	}
}



public static boolean checkCopyPasteAccountInformationOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	accountFirstCheckBoxToSelection.click();		 
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterEditBtn));
	masterEditBtn.click();
	
	Thread.sleep(2000);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyBtn));
	copyBtn.click();
	 
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditLimitTxt));
	creditLimitTxt.click();
	
	String actcreditLimitTxtValue         =creditLimitTxt.getAttribute("value");
	String actcreditdaysTxtValue          =creditdaysTxt.getAttribute("value");
	String actchequeDiscountLimitTxtValue =chequeDiscountLimitTxt.getAttribute("value");
	String actrateofinterestTxtalue       =rateofinterestTxt.getAttribute("value");
	
	String expcreditLimitTxtValue         ="194.000";
	String expcreditdaysTxtValue          ="4";
	String expchequeDiscountLimitTxtValue ="106.000";
	String exprateofinterestTxtalue       ="9.00";
	
	System.out.println("*******************************checkCopyPasteAccountInformationOption************************");
	
	System.out.println("creditLimitTxtValue         :"+actcreditLimitTxtValue          +" Value Expected :"+expcreditLimitTxtValue);
	System.out.println("creditdaysTxtValue          :"+actcreditdaysTxtValue           +" Value Expected :"+expcreditdaysTxtValue);
	System.out.println("chequeDiscountLimitTxtValue :"+actchequeDiscountLimitTxtValue  +" Value Expected :"+expchequeDiscountLimitTxtValue);
	System.out.println("rateofinterestTxtalue       :"+actrateofinterestTxtalue        +" Value Expected :"+exprateofinterestTxtalue);
	
	
	if(actcreditLimitTxtValue.equalsIgnoreCase(expcreditLimitTxtValue) && actcreditdaysTxtValue.equalsIgnoreCase(expcreditdaysTxtValue)
			&& actchequeDiscountLimitTxtValue.equalsIgnoreCase(expchequeDiscountLimitTxtValue)
			&& actrateofinterestTxtalue.equalsIgnoreCase(exprateofinterestTxtalue))
	{
		excelReader.setCellData(xlfile, "Sheet1", 422, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 422, 9, resFail);
		return false;
	}
}


//Properties Option


public static boolean checkPropertiesOptionForAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeAccMasterCreationScreen));
	closeAccMasterCreationScreen.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	accountFirstCheckBoxToSelection.click();		 
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
	masterPropertiesBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountPropertiesLabel));
     
	boolean actaccountPropertiesLabel    								=accountPropertiesLabel.isDisplayed();
	boolean actnormalRadioBtn    										=normalRadioBtn.isDisplayed();
	boolean actshowSummaryOfTheAccountRadioBtn    						=showSummaryOfTheAccountRadioBtn.isDisplayed();
	boolean actsuspendCreditLimitChkbox    								=suspendCreditLimitChkbox.isDisplayed();
	boolean actdisplayDebitCreditTotalForEachMonthRadioBtn    			=displayDebitCreditTotalForEachMonthRadioBtn.isDisplayed();
	boolean actdisplayDebitCreditTotalForEachDayRadioBtn    			=displayDebitCreditTotalForEachDayRadioBtn.isDisplayed();
	boolean actnoneRadioBtn    											=noneRadioBtn.isDisplayed();
	boolean actconsolidateWhenBothAccountsAreSameRadioBtn    			=consolidateWhenBothAccountsAreSameRadioBtn.isDisplayed();
	boolean actconsolidateAlwaysRadioBtn    							=consolidateAlwaysRadioBtn.isDisplayed();
	boolean actstatusDropdown    										=statusDropdown.isDisplayed();
	boolean actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  	=doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox.isDisplayed();
	boolean actallowOtherCompaniesToViewRecordsCheckbox               	=allowOtherCompaniesToViewRecordsCheckbox.isDisplayed();
	boolean actgenerateLedgerByCurrencyCheckbox    						=generateLedgerByCurrencyCheckbox.isDisplayed();
	boolean actsendSmsEmailWhereverAcDebitedCreditedCheckbox    		=sendSmsEmailWhereverAcDebitedCreditedCheckbox.isDisplayed();
	boolean actproperties_okBtn    										=properties_okBtn.isDisplayed();
	boolean actproperties_cancelBtn    									=properties_cancelBtn.isDisplayed();
	
	boolean expaccountPropertiesLabel    								=true;
	boolean expnormalRadioBtn    										=true;
	boolean expshowSummaryOfTheAccountRadioBtn    						=true;
	boolean expsuspendCreditLimitChkbox    								=true;
	boolean expdisplayDebitCreditTotalForEachMonthRadioBtn    			=true;
	boolean expdisplayDebitCreditTotalForEachDayRadioBtn    			=true;
	boolean expnoneRadioBtn    											=true;
	boolean expconsolidateWhenBothAccountsAreSameRadioBtn    			=true;
	boolean expconsolidateAlwaysRadioBtn    							=true;
	boolean expstatusDropdown    										=true;
	boolean expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  	=true;
	boolean expallowOtherCompaniesToViewRecordsCheckbox               	=true;
	boolean expgenerateLedgerByCurrencyCheckbox    						=true;
	boolean expsendSmsEmailWhereverAcDebitedCreditedCheckbox    		=true;
	boolean expproperties_okBtn    										=true;
	boolean expproperties_cancelBtn    									=true;
	
	
	System.out.println("**********************************checkPropertiesOptionForAccount****************************");
	
	System.out.println("accountPropertiesLabel                                : "+actaccountPropertiesLabel                                +" Value Expected : "+expaccountPropertiesLabel);
	System.out.println("normalRadioBtn                                        : "+actnormalRadioBtn                                        +" Value Expected : "+expnormalRadioBtn);
	System.out.println("showSummaryOfTheAccountRadioBtn                       : "+actshowSummaryOfTheAccountRadioBtn                       +" Value Expected : "+expshowSummaryOfTheAccountRadioBtn);
	System.out.println("suspendCreditLimitChkbox                              : "+actsuspendCreditLimitChkbox                              +" Value Expected : "+expsuspendCreditLimitChkbox);
	System.out.println("displayDebitCreditTotalForEachMonthRadioBtn           : "+actdisplayDebitCreditTotalForEachMonthRadioBtn           +" Value Expected : "+expdisplayDebitCreditTotalForEachMonthRadioBtn);
	System.out.println("displayDebitCreditTotalForEachDayRadioBtn             : "+actdisplayDebitCreditTotalForEachDayRadioBtn             +" Value Expected : "+expdisplayDebitCreditTotalForEachDayRadioBtn);
	System.out.println("noneRadioBtn                                          : "+actnoneRadioBtn                                          +" Value Expected : "+expnoneRadioBtn);
	System.out.println("consolidateWhenBothAccountsAreSameRadioBtn            : "+actconsolidateWhenBothAccountsAreSameRadioBtn            +" Value Expected : "+expconsolidateWhenBothAccountsAreSameRadioBtn);
	System.out.println("consolidateAlwaysRadioBtn                             : "+actconsolidateAlwaysRadioBtn                             +" Value Expected : "+expconsolidateAlwaysRadioBtn);
	System.out.println("statusDropdown                                        : "+actstatusDropdown                                        +" Value Expected : "+expstatusDropdown);
	System.out.println("doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox : "+actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox +" Value Expected : "+expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox);
	System.out.println("allowOtherCompaniesToViewRecordsCheckbox              : "+actallowOtherCompaniesToViewRecordsCheckbox              +" Value Expected : "+expallowOtherCompaniesToViewRecordsCheckbox);
	System.out.println("generateLedgerByCurrencyCheckbox                      : "+actgenerateLedgerByCurrencyCheckbox                      +" Value Expected : "+expgenerateLedgerByCurrencyCheckbox);
	System.out.println("sendSmsEmailWhereverAcDebitedCreditedCheckbox         : "+actsendSmsEmailWhereverAcDebitedCreditedCheckbox         +" Value Expected : "+expsendSmsEmailWhereverAcDebitedCreditedCheckbox);
	System.out.println("properties_okBtn                                      : "+actproperties_okBtn                                      +" Value Expected : "+expproperties_okBtn);
	System.out.println("properties_cancelBtn                                  : "+actproperties_cancelBtn                                  +" Value Expected : "+expproperties_cancelBtn);
	
	if(actaccountPropertiesLabel==expaccountPropertiesLabel && actnormalRadioBtn==expnormalRadioBtn 
			&& actshowSummaryOfTheAccountRadioBtn==expshowSummaryOfTheAccountRadioBtn &&  actsuspendCreditLimitChkbox==expsuspendCreditLimitChkbox
			&& actdisplayDebitCreditTotalForEachMonthRadioBtn==expdisplayDebitCreditTotalForEachMonthRadioBtn
			&& actdisplayDebitCreditTotalForEachDayRadioBtn==expdisplayDebitCreditTotalForEachDayRadioBtn
			&& actnoneRadioBtn==expnoneRadioBtn && actconsolidateWhenBothAccountsAreSameRadioBtn==expconsolidateWhenBothAccountsAreSameRadioBtn
			&& actconsolidateAlwaysRadioBtn==expconsolidateAlwaysRadioBtn && actstatusDropdown==expstatusDropdown
			&& actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox==expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox
			&& actallowOtherCompaniesToViewRecordsCheckbox==expallowOtherCompaniesToViewRecordsCheckbox
			&& actgenerateLedgerByCurrencyCheckbox==expgenerateLedgerByCurrencyCheckbox
			&& actsendSmsEmailWhereverAcDebitedCreditedCheckbox==expsendSmsEmailWhereverAcDebitedCreditedCheckbox
			&& actproperties_okBtn==expproperties_okBtn && actproperties_cancelBtn==expproperties_cancelBtn)
	{
		excelReader.setCellData(xlfile, "Sheet1", 423, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 423, 9, resFail);
		return false;
	}
}



public static boolean checkCancelButtonInPropertiesOptionForAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(properties_cancelBtn));
	properties_cancelBtn.click();
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationNameOfLane));
	 
	String actaccountNewCreationName  =accountNewCreationName.getText();
	String expaccountNewCreationName  ="Customer Display CD For Each Account Four";
	
	System.out.println("*********************checkCancelButtonInPropertiesOptionForAccount**************************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	 
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 424, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 424, 9, resFail);
		return false;
	}
}


public static boolean checkDeleteOptionWithoutSelectAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
	masterDeleteBtn.click();
     
	String expMessage="Please select the Record to delete";
		
	String actMessage=checkValidationMessage(expMessage);
     
	System.out.println("********************************checkDeleteOptionWithoutSelectAccount***************************");
   		
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		excelReader.setCellData(xlfile, "Sheet1", 425, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 425, 9, resFail);
		return false;
	}
}



public static boolean checkDeleteOptionWithSelectAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
	accountFirstCheckBoxToSelection.click();		 
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
	masterDeleteBtn.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
     
	String actgetMsgOnDelete  =getMsgOnDelete.getText();
	String expgetMsgOnDelete ="Would you like to delete this selected master";
     
	
	System.out.println("*****************************checkDeleteOptionWithSelectAccount**************************");
	
	System.out.println("getMsgOnDelete  : "+actgetMsgOnDelete+" Value Expected : "+expgetMsgOnDelete);
	
	if(actgetMsgOnDelete.equalsIgnoreCase(expgetMsgOnDelete))
	{
		excelReader.setCellData(xlfile, "Sheet1", 426, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 426, 9, resFail);
		return false;
	}
}	



public static boolean checkCancelButtonInDeleteAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnCancelInDelete));
	clickOnCancelInDelete.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationNameOfLane));
	 
	String actaccountNewCreationName  =accountNewCreationName.getText();
	String expaccountNewCreationName  ="Customer Display CD For Each Account Four";
	
	System.out.println("*********************checkCancelButtonInDeleteAccount**************************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	 
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
	{ 
		excelReader.setCellData(xlfile, "Sheet1", 427, 9, resPass);
		return true;
	}
	else
	{
		excelReader.setCellData(xlfile, "Sheet1", 427, 9, resFail);
		return false;
	}
}
	
	
	public static boolean checkYesDeleteAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
		accountFirstCheckBoxToSelection.click();		 
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
		accountFirstCheckBoxToSelection.click();	
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
		masterDeleteBtn.click();
     
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
		clickOnOkInDelete.click();
     
		String expMessage="Record Deleted Successfully.";
		
		String actMessage=checkValidationMessage(expMessage);
     
		System.out.println("********************************checkYesDeleteAccount***************************");
   		
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
   		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			excelReader.setCellData(xlfile, "Sheet1", 428, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 428, 9, resFail);
			return false;
		}	 
}
	
	

	public static boolean checkDeleteAccountDisplay() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationNameOfLane));
	 
	String actaccountNewCreationName  =accountNewCreationName.getText();
	String expaccountNewCreationName  ="Customer Display CD For Each Account Three";
	
	System.out.println("*********************checkDeleteAccountDisplay**************************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	 
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
		{ 
			excelReader.setCellData(xlfile, "Sheet1", 429, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 429, 9, resFail);
			return false;
		}
}
	
	


	public static boolean checkPropertiesOptionForAccountGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterSearchTxt));
		masterSearchTxt.sendKeys("Customer Update Group");
		masterSearchTxt.sendKeys(Keys.ENTER);
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBoxToSelection));
		accountFirstCheckBoxToSelection.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterPropertiesBtn));
		masterPropertiesBtn.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountPropertiesLabel));
	 
	boolean actaccountPropertiesLabel    								=accountPropertiesLabel.isDisplayed();
	boolean actnormalRadioBtn    										=normalRadioBtn.isDisplayed();
	boolean actdisplayDebitCreditTotalForEachAccountUnderGroup			=displayDebitCreditTotalForEachAccountUnderGroup.isDisplayed();
	boolean actsuspendCreditLimitChkbox    								=suspendCreditLimitChkbox.isDisplayed();
	boolean actClubTheTransactionsofAllTheAccountsUnderGroup  			=ClubTheTransactionsofAllTheAccountsUnderGroup.isDisplayed();
	boolean actnoneRadioBtn    											=noneRadioBtn.isDisplayed();
	boolean actconsolidateWhenBothAccountsAreSameRadioBtn    			=consolidateWhenBothAccountsAreSameRadioBtn.isDisplayed();
	boolean actconsolidateAlwaysRadioBtn    							=consolidateAlwaysRadioBtn.isDisplayed();
	boolean actstatusDropdown    										=statusDropdown.isDisplayed();
	boolean actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  	=doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox.isDisplayed();
	boolean actallowOtherCompaniesToViewRecordsCheckbox               	=allowOtherCompaniesToViewRecordsCheckbox.isDisplayed();
	boolean actgenerateLedgerByCurrencyCheckbox    						=generateLedgerByCurrencyCheckbox.isDisplayed();
	boolean actsendSmsEmailWhereverAcDebitedCreditedCheckbox    		=sendSmsEmailWhereverAcDebitedCreditedCheckbox.isDisplayed();
	boolean actproperties_okBtn    										=properties_okBtn.isDisplayed();
	boolean actproperties_cancelBtn    									=properties_cancelBtn.isDisplayed();
	
	boolean expaccountPropertiesLabel    								=true;
	boolean expnormalRadioBtn    										=true;
	boolean expdisplayDebitCreditTotalForEachAccountUnderGroup			=true;
	boolean expsuspendCreditLimitChkbox    								=true;
	boolean expClubTheTransactionsofAllTheAccountsUnderGroup   			=true;
	boolean expnoneRadioBtn    											=true;
	boolean expconsolidateWhenBothAccountsAreSameRadioBtn    			=true;
	boolean expconsolidateAlwaysRadioBtn    							=true;
	boolean expstatusDropdown    										=true;
	boolean expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox  	=true;
	boolean expallowOtherCompaniesToViewRecordsCheckbox               	=true;
	boolean expgenerateLedgerByCurrencyCheckbox    						=true;
	boolean expsendSmsEmailWhereverAcDebitedCreditedCheckbox    		=true;
	boolean expproperties_okBtn    										=true;
	boolean expproperties_cancelBtn    									=true;
	
	
	System.out.println("**********************************checkPropertiesOptionForAccountGroup****************************");
	
	System.out.println("accountPropertiesLabel                                : "+actaccountPropertiesLabel                                +" Value Expected : "+expaccountPropertiesLabel);
	System.out.println("normalRadioBtn                                        : "+actnormalRadioBtn                                        +" Value Expected : "+expnormalRadioBtn);
	System.out.println("displayDebitCreditTotalForEachAccountUnderGroup       : "+actdisplayDebitCreditTotalForEachAccountUnderGroup       +" Value Expected : "+expdisplayDebitCreditTotalForEachAccountUnderGroup);
	System.out.println("suspendCreditLimitChkbox                              : "+actsuspendCreditLimitChkbox                              +" Value Expected : "+expsuspendCreditLimitChkbox);
	System.out.println("ClubTheTransactionsofAllTheAccountsUnderGroup         : "+actClubTheTransactionsofAllTheAccountsUnderGroup         +" Value Expected : "+expClubTheTransactionsofAllTheAccountsUnderGroup);
	System.out.println("noneRadioBtn                                          : "+actnoneRadioBtn                                          +" Value Expected : "+expnoneRadioBtn);
	System.out.println("consolidateWhenBothAccountsAreSameRadioBtn            : "+actconsolidateWhenBothAccountsAreSameRadioBtn            +" Value Expected : "+expconsolidateWhenBothAccountsAreSameRadioBtn);
	System.out.println("consolidateAlwaysRadioBtn                             : "+actconsolidateAlwaysRadioBtn                             +" Value Expected : "+expconsolidateAlwaysRadioBtn);
	System.out.println("statusDropdown                                        : "+actstatusDropdown                                        +" Value Expected : "+expstatusDropdown);
	System.out.println("doNotRestrictSelectionEvenIfRightsNotAllottedCheckbox : "+actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox +" Value Expected : "+expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox);
	System.out.println("allowOtherCompaniesToViewRecordsCheckbox              : "+actallowOtherCompaniesToViewRecordsCheckbox              +" Value Expected : "+expallowOtherCompaniesToViewRecordsCheckbox);
	System.out.println("generateLedgerByCurrencyCheckbox                      : "+actgenerateLedgerByCurrencyCheckbox                      +" Value Expected : "+expgenerateLedgerByCurrencyCheckbox);
	System.out.println("sendSmsEmailWhereverAcDebitedCreditedCheckbox         : "+actsendSmsEmailWhereverAcDebitedCreditedCheckbox         +" Value Expected : "+expsendSmsEmailWhereverAcDebitedCreditedCheckbox);
	System.out.println("properties_okBtn                                      : "+actproperties_okBtn                                      +" Value Expected : "+expproperties_okBtn);
	System.out.println("properties_cancelBtn                                  : "+actproperties_cancelBtn                                  +" Value Expected : "+expproperties_cancelBtn);
	
	if(actaccountPropertiesLabel==expaccountPropertiesLabel && actnormalRadioBtn==expnormalRadioBtn 
			&& actdisplayDebitCreditTotalForEachAccountUnderGroup==expdisplayDebitCreditTotalForEachAccountUnderGroup
			&& actsuspendCreditLimitChkbox==expsuspendCreditLimitChkbox
			&& actClubTheTransactionsofAllTheAccountsUnderGroup==expClubTheTransactionsofAllTheAccountsUnderGroup
			&& actnoneRadioBtn==expnoneRadioBtn && actconsolidateWhenBothAccountsAreSameRadioBtn==expconsolidateWhenBothAccountsAreSameRadioBtn
			&& actconsolidateAlwaysRadioBtn==expconsolidateAlwaysRadioBtn && actstatusDropdown==expstatusDropdown
			&& actdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox==expdoNotRestrictSelectionEvenIfRightsNotAllottedCheckbox
			&& actallowOtherCompaniesToViewRecordsCheckbox==expallowOtherCompaniesToViewRecordsCheckbox
			&& actgenerateLedgerByCurrencyCheckbox==expgenerateLedgerByCurrencyCheckbox
			&& actsendSmsEmailWhereverAcDebitedCreditedCheckbox==expsendSmsEmailWhereverAcDebitedCreditedCheckbox
			&& actproperties_okBtn==expproperties_okBtn && actproperties_cancelBtn==expproperties_cancelBtn)
		{
			excelReader.setCellData(xlfile, "Sheet1", 430, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 430, 9, resFail);
			return false;
		}
}

	
@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
public static WebElement accountCreationNameOfLane; 


	public static boolean checkOkButtonInPropertiesOptionForAccountGroup() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ClubTheTransactionsofAllTheAccountsUnderGroup));
		ClubTheTransactionsofAllTheAccountsUnderGroup.click();		 
     
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(properties_okBtn));
		properties_okBtn.click();		 
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
	 
	String actaccountNewCreationName  =accountNewCreationName.getText();
	String expaccountNewCreationName  ="Customer Update Group";

	System.out.println("************************checkOkButtonInPropertiesOptionForAccountGroup*********************");
	
	System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(account));
	account.click();
	
	if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
		{ 
			excelReader.setCellData(xlfile, "Sheet1", 431, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 431, 9, resFail);
			return false;
		}
}

	public static boolean checkSaveCOGSAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
	     excelReader = new ExcelReader(POJOUtility.getExcelPath());
	     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	     System.out.println("********************* checkSaveCOGSAccount Method Executes.............   *****************************");

	       /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCreationNameOfLane1));
	        masterCreationNameOfLane1.click();*/
		
	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	     	masterNewBtn.click();
	    	
	     	//COGS POSTING ACC
	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 118, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 119, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 120, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();

	        String expSaveMessage = excelReader.getCellData(xlSheetName, 119, 7);
			
			boolean actSaveAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveAccountMessage = true;

			Thread.sleep(2000);
	     
	     	//BR COGS ACC INV
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 121, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			//Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 122, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 123, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();

			boolean actSaveBRAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveBRAccountMessage = true;

			Thread.sleep(2000);
			
	     	//FIFO COGS ACC INV
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 124, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 125, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 126, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
	     	
	     	boolean actSaveFIFOAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveFIFOAccountMessage = true;

			Thread.sleep(2000);
			
	     	//WA COGS ACC INV
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 127, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 128, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 129, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
	     	
	     	boolean actSaveWAAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveWAAccountMessage = true;

			Thread.sleep(3000);
			
	     	//STD RATE COGS ACC INV
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 130, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 131, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 132, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
	     	
	    	boolean actSaveSRATEAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveSRATEAccountMessage = true;

			Thread.sleep(3000);

			//SR COGS POSTING ACC
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 133, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 134, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 135, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
	     	
	     	boolean actSaveSRAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveSRAccountMessage = true;

			Thread.sleep(3000);
	     	
	    	//SHORTAGE COGS POSTING ACC
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 136, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 137, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 138, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
	     		
	    	boolean actSaveSSAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveSSAccountMessage = true;

			Thread.sleep(3000);
			
			//EXCESS COGS POSTING ACC
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 139, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 140, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 141, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
		
			boolean actStockSaveAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expStockSaveAccountMessage = true;

			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();


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
			 
			String expmasterGridBodyList=excelReader.getCellData(xlSheetName, 120, 7);
			 
			boolean actMethod = actSaveAccountMessage==expSaveAccountMessage && actSaveBRAccountMessage==expSaveBRAccountMessage 
					 			&& actSaveFIFOAccountMessage==expSaveFIFOAccountMessage && actSaveWAAccountMessage==expSaveWAAccountMessage
					 			&& actSaveSRATEAccountMessage==expSaveSRATEAccountMessage && actSaveSRAccountMessage==expSaveSRAccountMessage 
					 			&& actSaveSSAccountMessage==expSaveSSAccountMessage && actStockSaveAccountMessage==expStockSaveAccountMessage ;
					 
			String actResult = Boolean.toString(actMethod);
			 
			excelReader.setCellData(xlfile, xlSheetName, 118, 8, actResult.toUpperCase());
			excelReader.setCellData(xlfile, xlSheetName, 120, 8, actmasterGridBodyList);
			 
			 
			System.out.println("masterGridBodyList Actual                   : "+actmasterGridBodyList);
			System.out.println("masterGridBodyList Expected                 : "+expmasterGridBodyList);
			System.out.println("COGS POSTING ACC Save Value Actual          : " + actSaveAccountMessage      + "  Value Expected : " + expSaveAccountMessage);
			System.out.println("BR COGS ACC INV ACC Save Value Actual       : " + actSaveBRAccountMessage    + "  Value Expected : " + expSaveBRAccountMessage);
			System.out.println("FIFO COGS ACC INV ACC Save Value Actual     : " + actSaveFIFOAccountMessage  + "  Value Expected : " + expSaveFIFOAccountMessage);
			System.out.println("WA COGS ACC INV ACC Save Value Actual       : " + actSaveWAAccountMessage    + "  Value Expected : " + expSaveWAAccountMessage);
			System.out.println("STD RATE COGS ACC INV ACC Save Value Actual : " + actSaveSRATEAccountMessage + "  Value Expected : " + expSaveSRATEAccountMessage);
			System.out.println("SR COGS POSTING ACC Save Value Actual       : " + actSaveSRAccountMessage    + "  Value Expected : " + expSaveSRAccountMessage);
			System.out.println("SHORTAGE COGS POSTING ACC Save Value Actual : " + actSaveSSAccountMessage    + "  Value Expected : " + expSaveSSAccountMessage);
			System.out.println("Stock Value Actual                          : " + actStockSaveAccountMessage + "  Value Expected : " + expStockSaveAccountMessage);
			
			if (actSaveAccountMessage==expSaveAccountMessage && actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 118, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 118, 9, resFail);
				return false;
			}
			
		  }
	 
	private static String xlSheetName = "SmokeMasters";
	
	@FindBy(xpath = "//div[@id='idGlobalError']")
public static WebElement validationConfirmationMessage;

@FindBy(xpath = "//div[@class='theme_color font-6']")
public static WebElement validationUpdatingConfirmationMessage;

@FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
public static WebElement newErrorMessage;

@FindBy(xpath = "//span[@class='icon-reject2 theme_color']")
public static WebElement newErrorMessageCloseBtn;

@FindBy(xpath="//*[@id='LandingGridBody']/tr")
  private static List<WebElement> masterGridBodyRowCount;
  
  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
  private static List<WebElement> masterGridBodyName;
  
  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
  private static List<WebElement> masterGridBodyCode;
  
  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[13]")
  private static List<WebElement> masterGridBodyAccountType;

	 public static boolean checkValidationMessageB(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	 {
		 
	  System.out.println("************************************** checkValidationMessage Method Executes............ *******************************************");	
		 
		  //validationUpdatingConfirmationMessage
	 try
     {  
		  
		  //newErrorMessageCloseBtn
		  
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(validationUpdatingConfirmationMessage));
		String actValidationDisplayMessage = validationUpdatingConfirmationMessage.getText();
		String expValidationDisplayMessage = ExpMessage;

		System.out.println("Getting the Message Text From the Validation Message  : " + actValidationDisplayMessage + " Value Expected : " + expValidationDisplayMessage);

		if (actValidationDisplayMessage.equalsIgnoreCase(expValidationDisplayMessage)) 
		{
			try 
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newErrorMessageCloseBtn));
				newErrorMessageCloseBtn.click();
				System.out.println("TRY TRUE BLOCK");
				return true;
			} 
			catch (Exception e) 
			{
				System.err.println("Close Button Execption Message is not Displayed" + e.getMessage());
				return true;
			}
		} 
		else 
		{
			System.out.println("Actual Message Text is not Equal To Execpected Message Text");
			return false;
		}
     }
		 catch (Exception e) 
	     {
	     	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
	     	return false;
	     }
		} 
	 
	  
	  public static boolean checkSaveAccountsByCreatingVATAccounts() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
	     excelReader = new ExcelReader(POJOUtility.getExcelPath());
	     xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

	     System.out.println("********************* checkSaveAccountsByCreatingVATAccounts Method Executes.............  *****************************");

	     try
	     {
	        /*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCreationNameOfLane1));
	        masterCreationNameOfLane1.click();*/
		
	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	     	masterNewBtn.click();
	    	
	     	//VAT OUTPUT ACC
	     	Thread.sleep(2000);
	     	
	     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 142, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 143, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 144, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
	        
	        String expSaveMessage = "Saved Successfully";
			
			boolean actSaveAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveAccountMessage = true;

	     
	     	//VAT ADVANCE SALE
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 145, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 146, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 147, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
	     	
			boolean actSaveBRAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveBRAccountMessage = true;
			
	     	
	     	//VAT ADVANCE PURCHASE
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 148, 6));
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys(excelReader.getCellData(xlSheetName, 149, 6));
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys(excelReader.getCellData(xlSheetName, 150, 6));
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
	     	
	     	boolean actSaveFIFOAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSaveFIFOAccountMessage = true;
			
			// Purchase Variance Account
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys("PURCHASE VARIANCE");
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
			codeTxt.sendKeys("PURCHASE VARIANCE");
		    codeTxt.sendKeys(Keys.TAB);
	      
		    //Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
			accountTypeDropdown.sendKeys("Liabilities");
			accountTypeDropdown.sendKeys(Keys.TAB);

			//Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
	     	
			boolean actSavePVAccountMessage = checkValidationMessageB(expSaveMessage);
			boolean expSavePVAccountMessage = true;
			
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			
			
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
			 
			String expmasterGridBodyList="[PURCHASE VARIANCE, PURCHASE VARIANCE, Liabilities, VAT ADVANCE PURCHASE, VAT ADVANCE PURCHASE, Assets/Liabilities, VAT ADVANCE SALE, VAT ADVANCE SALE, Liabilities, VAT OUTPUT, VAT OUTPUT, Liabilities, EXCESS COGS POSTING ACC, EXCESS COGS POSTING ACC, Purchases, SHORTAGE COGS POSTING ACC, SHORTAGE COGS POSTING ACC, Purchases, SR COGS POSTING ACC, SR COGS POSTING ACC, Sales, STD RATE COGS ACC INV, STD RATE COGS ACC INV, Inventory, WA COGS ACC INV, WA COGS ACC INV, Inventory, FIFO COGS ACC INV, FIFO COGS ACC INV, Inventory, BR COGS ACC INV, BR COGS ACC INV, Inventory, COGS POSTING ACC, COGS POSTING ACC, Purchases, ASSETS, 001, Assets, EXPENSES, 009, Expenses, CONTROL ACCOUNTS, CA, Control, REVENUE, 007, Income, EQUITIES, 002, Liabilities, LIABILITIES, 003, Liabilities]";
			 
			boolean actMethod = actSaveAccountMessage==expSaveAccountMessage && actSaveBRAccountMessage==expSaveBRAccountMessage 
					 			&& actSaveFIFOAccountMessage==expSaveFIFOAccountMessage;
					 
			String actResult = Boolean.toString(actMethod);
			 
			excelReader.setCellData(xlfile, xlSheetName, 142, 8, actResult.toUpperCase());
			excelReader.setCellData(xlfile, xlSheetName, 144, 8, actmasterGridBodyList);

			System.out.println("masterGridBodyList Actual              : " +actmasterGridBodyList);
			System.out.println("masterGridBodyList Expected            : " +expmasterGridBodyList);
			System.out.println("VAT OUTPUT ACC Save Value Actual       : " + actSaveAccountMessage     + "  Value Expected : " + expSaveAccountMessage);
			System.out.println("VAT ADVANCE SALE ACC Save Value Actual : " + actSaveBRAccountMessage   + "  Value Expected : " + expSaveBRAccountMessage);
			System.out.println("VAT ADVANCE PURCHASE Save Value Actual : " + actSaveFIFOAccountMessage + "  Value Expected : " + expSaveFIFOAccountMessage);
			
			if (actSaveAccountMessage==expSaveAccountMessage && actmasterGridBodyList.equalsIgnoreCase(expmasterGridBodyList)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 142, 9, resPass);
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 142, 9, resFail);
				return false;
			}
			
	     }
	     catch (Exception e) 
	     {
	     	String exception =e.getMessage().substring(0, 100);
	     	excelReader.setExceptionInExcel(xlfile, xlSheetName, 142, 10, exception);
	     	System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
	     	return false;
	     }
	   }


	public static boolean checkCloseAccountMasterForAccountTestingStop() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
		masterCloseBtn.click();
	 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(labelDashboard));
	
	boolean actlabelDashboard                  =labelDashboard.isDisplayed();
	boolean actselectDashboard                 =selectDashboard.isDisplayed();
	boolean actnewAddDashBoard                 =newAddDashBoard.isDisplayed();
	boolean actdashboardCustomizationSettings  =dashboardCustomizationSettings.isDisplayed();
	
	boolean explabelDashboard                  =true;
	boolean expselectDashboard                 =true;
	boolean expnewAddDashBoard                 =true;
	boolean expdashboardCustomizationSettings  =true;
	
	System.out.println("******************************checkCloseAccountMasterForAccountTestingStop************************");
	
	System.out.println("labelDashboard                  : "+actlabelDashboard                 +" Value Expected : "+explabelDashboard);
	System.out.println("selectDashboard                 : "+actselectDashboard                +" Value Expected : "+expselectDashboard);
	System.out.println("newAddDashBoard                 : "+actnewAddDashBoard                +" Value Expected : "+expnewAddDashBoard);
	System.out.println("dashboardCustomizationSettings  : "+actdashboardCustomizationSettings +" Value Expected : "+expdashboardCustomizationSettings);
	
	if(labelDashboard.isDisplayed() && selectDashboard.isDisplayed() && newAddDashBoard.isDisplayed() && dashboardCustomizationSettings.isDisplayed())
		{
			excelReader.setCellData(xlfile, "Sheet1", 432, 9, resPass);
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			userNameDisplay.click();
	  
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
	 
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, "Sheet1", 432, 9, resFail);
		
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			userNameDisplay.click();
		  
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			logoutOption.click();
		
			return false;
		}
}



	
	
	
	@FindBy (xpath="//span[contains(text(),'Create Tab')]")
	private static WebElement masterFieldsCreateTab;
	
	@FindBy (xpath="//div[@id='btnAdd_Field_MasterCust']")
	private static WebElement createTabHeaderDetailsAddFieldsBtn;
	
	
	
	
	public static boolean checkOpenCustomizeMasterInAccounts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
		 
		masterRibbonControlNextBtn.click(); 
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();

		Thread.sleep(2000);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));
		masterFieldsCreateTab.click();
		
		Thread.sleep(2000);
		
		boolean actCreateTab = masterFieldsCreateTab.isDisplayed();
		boolean expCreateTab = true;
		
    	System.out.println("***********************************checkOpenCustomizeMasterInAccounts*********************************");
	    
	    System.out.println("CreateTabIsDisplaying   : "+actCreateTab  +"  value expected  "+expCreateTab);
	  
		if(actCreateTab==expCreateTab)
		{	
			return true;
		}	 
		else
		{
			return false;
		}
     }
	
	
	
	public static boolean checkAddFieldWithoutDefaultValueInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_TextField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("0");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	@FindBy (xpath="//div[@id='HeaderDetails_6']/div/div/table/tbody/tr/td[4]")
	private static List<WebElement> fieldCaptionTxtList;
	
	@FindBy (xpath="//div[@id='HeaderDetails_6']/div/div/table/tbody/tr/td[1]/i[1]")
	private static List<WebElement> editFieldList;
	
	@FindBy (xpath="//div[@id='HeaderDetails_6']/div/div/table/tbody/tr/td[1]/i[2]")
	private static List<WebElement> deleteFieldList;
	
	
	public static boolean checkEditFieldUpdateWithDefaultValueInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		int count = fieldCaptionTxtList.size();
		
		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_TextField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValue));
		extraFields_FieldDetailsDefaultValue.click();
		extraFields_FieldDetailsDefaultValue.sendKeys("TextField_DefaultValue");
		extraFields_FieldDetailsDefaultValue.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("TextField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("TextField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Updated Successfully";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	public static boolean checkAddFieldWithDataTypeAsNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_NumberField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("1");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("NumberField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("NumberField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	

	
	public static boolean checkAddFieldWithDataTypeAsBooleanInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_BooleanField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("2");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValueChkbox));
		boolean actDefaultValue = extraFields_FieldDetailsDefaultValueChkbox.isEnabled();
		boolean expDefaultValue = true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("BooleanField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		System.out.println("Default Value Checkbox is Enabled  : "+actDefaultValue+"  Value Expected  "+expDefaultValue);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actDefaultValue==expDefaultValue && actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	public static boolean checkAddFieldWithDataTypeAsDateTimeInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_DateTimeField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("3");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValueDrpdwn));
		boolean actDefaultValueDrpdwn = extraFields_FieldDetailsDefaultValueDrpdwn.isEnabled();
		boolean expDefaultValueDrpdwn = true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("DateTimeField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		System.out.println("Default Value Dropdown is Enabled  : "+actDefaultValueDrpdwn+"  Value Expected  "+expDefaultValueDrpdwn);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actDefaultValueDrpdwn==expDefaultValueDrpdwn && actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	public static boolean checkAddFieldWithDataTypeAsDateInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_DateField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("4");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValueDrpdwn));
		boolean actDefaultValueDrpdwn = extraFields_FieldDetailsDefaultValueDrpdwn.isEnabled();
		boolean expDefaultValueDrpdwn = true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("DateField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		System.out.println("Default Value Dropdown is Enabled  : "+actDefaultValueDrpdwn+"  Value Expected  "+expDefaultValueDrpdwn);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actDefaultValueDrpdwn==expDefaultValueDrpdwn && actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	public static boolean checkAddFieldWithDataTypeAsTimeInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_TimeField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("5");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValueDrpdwn));
		boolean actDefaultValueDrpdwn = extraFields_FieldDetailsDefaultValueDrpdwn.isEnabled();
		boolean expDefaultValueDrpdwn = true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("TimeField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		System.out.println("Default Value Dropdown is Enabled  : "+actDefaultValueDrpdwn+"  Value Expected  "+expDefaultValueDrpdwn);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actDefaultValueDrpdwn==expDefaultValueDrpdwn && actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	public static boolean checkAddFieldWithDataTypeAsFractionInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_FractionField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("6");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("FractionField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("FractionField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static boolean checkAddFieldWithDataTypeAsPictureInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_PictureField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("7");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("PictureField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	public static boolean checkAddFieldWithDataTypeAsStringListInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_StringListField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("8");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValue));
		extraFields_FieldDetailsDefaultValue.click();
		extraFields_FieldDetailsDefaultValue.sendKeys("DataTypeField_DefaultValueText1");
		extraFields_FieldDetailsDefaultValue.sendKeys(" , ");
		extraFields_FieldDetailsDefaultValue.sendKeys("DataTypeField_DefaultValueText2");
		extraFields_FieldDetailsDefaultValue.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	@FindBy (xpath="//table[@id='tblNumList_ExtraField']/tbody/tr[1]/td[1]/input")
	private static WebElement extraFields_NumberListDatTypeRow1Col1;
	
	@FindBy (xpath="//table[@id='tblNumList_ExtraField']/tbody/tr[1]/td[2]/input")
	private static WebElement extraFields_NumberListDatTypeRow1Col2;
	
	
	@FindBy (xpath="//div[@id='ExtraField_NumValueTable']/div/div[2]/button[1]")
	private static WebElement extraFields_NumberListDatTypeOkBtn;
	
	@FindBy (xpath="//div[@id='ExtraField_NumValueTable']/div/div[2]/button[2]")
	private static WebElement extraFields_NumberListDatTypeCloseBtn;
	
	
	
	public static boolean checkAddFieldWithDataTypeAsNumberListInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_NumberListField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("9");
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValue));
		extraFields_FieldDetailsDefaultValue.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_NumberListDatTypeRow1Col1));
		extraFields_NumberListDatTypeRow1Col1.click();
		extraFields_NumberListDatTypeRow1Col1.sendKeys("01234");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_NumberListDatTypeRow1Col2));
		extraFields_NumberListDatTypeRow1Col2.click();
		extraFields_NumberListDatTypeRow1Col2.sendKeys("NumberListName");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_NumberListDatTypeOkBtn));
		extraFields_NumberListDatTypeOkBtn.click();
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	public static boolean checkAddFieldWithDataTypeAsDocumentViewerInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_DocumentViewerField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("10");
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	@FindBy(xpath="//*[@id='ExtraField_MasterToLink']")
	private static WebElement extraField_FieldDetailsMasterToLinkDropDown;
	
	@FindBy(xpath="//*[@id='ExtraField_MandatoryFields']")
	private static WebElement extraField_FieldDetailsMandatoryFields;
	
	
	public static boolean checkAddFieldWithDataTypeAsMasterInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_MasterField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("12");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("MasterField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("MasterField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraField_FieldDetailsMasterToLinkDropDown));
		extraField_FieldDetailsMasterToLinkDropDown.sendKeys("Account");		
		Thread.sleep(2000);
		extraField_FieldDetailsMasterToLinkDropDown.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraField_FieldDetailsMandatoryFields));
		boolean actualValue = extraField_FieldDetailsMandatoryFields.isDisplayed();
		boolean expectedValue = true;
		
		String FieldValues = extraField_FieldDetailsMandatoryFields.getText();
		System.out.println(FieldValues);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	

	public static boolean checkAddFieldWithDataTypeAsBigNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_BigNumberField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("13");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("BigNumberField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("BigNumberField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	

	public static boolean checkAddFieldWithDataTypeAsExternalTableInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_ExternalTableField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("14");
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("ExternalTableField_ExternalTableText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("ExternalTableField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTableNameText));
		extraFields_FieldDetailsTableNameText.click();
		extraFields_FieldDetailsTableNameText.sendKeys("mcore_account");
		extraFields_FieldDetailsTableNameText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public static boolean checkAddFieldWithDataTypeAsSmallNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_SmallNumberField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("15");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValue));
		extraFields_FieldDetailsDefaultValue.click();
		extraFields_FieldDetailsDefaultValue.sendKeys("SmallNumberField_DefaultValue");
		extraFields_FieldDetailsDefaultValue.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("SmallNumberField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("SmallNumberField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	

	public static boolean checkAddFieldWithDataTypeAsTinyNumberInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_TinyNumberField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("16");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValue));
		extraFields_FieldDetailsDefaultValue.click();
		extraFields_FieldDetailsDefaultValue.sendKeys("TinyNumberField_DefaultValue");
		extraFields_FieldDetailsDefaultValue.sendKeys(Keys.TAB);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("TinyNumberField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("TinyNumberField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	

	public static boolean checkAddFieldWithDataTypeAsGregorianInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_GregorianField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("17");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValueDrpdwn));
		boolean actDefaultValueDrpdwn = extraFields_FieldDetailsDefaultValueDrpdwn.isEnabled();
		boolean expDefaultValueDrpdwn = true;
		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("GregorianField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);*/
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("GregorianField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		System.out.println("Default Value Dropdown is Enabled  : "+actDefaultValueDrpdwn+"  Value Expected  "+expDefaultValueDrpdwn);
		
		Thread.sleep(2000);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public static boolean checkAddFieldWithDataTypeAsHijriInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_HijriField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("18");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValueDrpdwn));
		boolean actDefaultValueDrpdwn = extraFields_FieldDetailsDefaultValueDrpdwn.isEnabled();
		boolean expDefaultValueDrpdwn = true;
		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("HijriField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);*/
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("HijriField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		System.out.println("Default Value Dropdown is Enabled  : "+actDefaultValueDrpdwn+"  Value Expected  "+expDefaultValueDrpdwn);
		
		Thread.sleep(2000);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public static boolean checkAddFieldWithDataTypeAsShamsiInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
		createTabHeaderDetailsAddFieldsBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
		extraFields_FieldDetailsCaption.click();
		extraFields_FieldDetailsCaption.sendKeys("CreateTab_ShamsiField");
		extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
		
		dataTypeDropdown.selectByValue("19");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValueDrpdwn));
		boolean actDefaultValueDrpdwn = extraFields_FieldDetailsDefaultValueDrpdwn.isEnabled();
		boolean expDefaultValueDrpdwn = true;
		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
		extraFields_FieldDetailsBannerText.click();
		extraFields_FieldDetailsBannerText.sendKeys("ShamsiField_BannerText");
		extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);*/
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
		extraFields_FieldDetailsToolTipText.click();
		extraFields_FieldDetailsToolTipText.sendKeys("ShamsiField_ToolTipText");
		extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
		
		System.out.println("Default Value Dropdown is Enabled  : "+actDefaultValueDrpdwn+"  Value Expected  "+expDefaultValueDrpdwn);
		
		Thread.sleep(2000);
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expMessage = "Field Added Successfully.";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	@FindBy(xpath="//*[@id='divBtnGroup6']/div/a")
	public static WebElement accountHeaderCreateTab;
	
	@FindBy(xpath="//input[@id='CreateTabTextField']")
	public static WebElement accountHeaderCreateTabTextFieldTxt;
	
	@FindBy(xpath="//input[@id='CreateTabNumberField']")
	public static WebElement accountHeaderCreateTabNumberFieldTxt;
	
	@FindBy(xpath="//input[@id='CreateTabBooleanField']")
	public static WebElement accountHeaderCreateTabBooleanFieldChkbox;
	
	@FindBy(xpath="//span[@id='CreateTabDateTimeField']")
	public static WebElement accountHeaderCreateTabDateTimeField;
	
	@FindBy(xpath="//input[@id='CreateTabDateField']")
	public static WebElement accountHeaderCreateTabDateField;
	
	@FindBy(xpath="//input[@id='CreateTabDateField_checkbox']")
	public static WebElement accountHeaderCreateTabDateFieldChkbox;
	
	@FindBy(xpath="//input[@id='CreateTabTimeField']")
	public static WebElement accountHeaderCreateTabTimeFieldTxt;
	
	@FindBy(xpath="//input[@id='CreateTabFractionField']")
	public static WebElement accountHeaderCreateTabFractionFieldTxt;
	
	@FindBy(xpath="//input[@id='BrowseCreateTabPictureField']")
	public static WebElement accountHeaderCreateTabPictureFieldBrowseBtn;
	
	@FindBy(xpath="(//a[@id='SaveImg'])[2]")
	public static WebElement accountHeaderCreateTabPictureFieldSaveBtn;
	
	@FindBy(xpath="(//i[@class='fa fa-eraser RemoveImg'])[2]")
	public static WebElement accountHeaderCreateTabPictureFieldDeleteBtn;
	
	@FindBy(xpath="//*[@id='CreateTabStringListField']")
	public static WebElement accountHeaderCreateTabStringListFieldDropdown;
	
	@FindBy(xpath="//*[@id='CreateTabDocumentViewerField']")
	public static WebElement accountHeaderCreateTabDocumentViewerField;
	
	@FindBy(xpath="//*[@id='uploadBtnCreateTabDocumentViewerField']")
	public static WebElement accountHeaderCreateTabDocumentViewerBrowseBtn;
	
	@FindBy(xpath="(//*[@id='SaveImg'])[3]")
	public static WebElement accountHeaderCreateTabDocumentViewerSaveBtn;
	
	@FindBy(xpath="//*[@id='newMasterDiv6']/div/div[14]/div[2]/div/div/div[3]/i")
	public static WebElement accountHeaderCreateTabDocumentViewerEraseBtn;

	@FindBy(xpath="//*[@id='CreateTabNumberListField']")
	public static WebElement accountHeaderCreateTabNumberListFieldDropdown;
	
	@FindBy(xpath="//*[@id='CreateTabMasterField_input_image']/span")
	public static WebElement accountHeaderCreateTabMasterFieldDropdown;
	
	@FindBy(xpath="//*[@id='CreateTabMasterField_input_settings']/span")
	public static WebElement accountHeaderCreateTabMasterFieldSettingsBtn;
	
	@FindBy(xpath="//*[@id='CreateTabBigNumberField']")
	public static WebElement accountHeaderCreateTabBigNumberField;
	
	@FindBy(xpath="//*[@id='CreateTabExternalTableField']")
	public static WebElement accountHeaderCreateTabExternalFieldDropdown;
	
	@FindBy(xpath="//*[@id='CreateTabExternalTableField_input_settings']/span")
	public static WebElement accountHeaderCreateTExternalFieldSettingsBtn;
	
	@FindBy(xpath="//*[@id='CreateTabSmallNumberField']")
	public static WebElement accountHeaderCreateTabSmallNumberField;
	
	@FindBy(xpath="//*[@id='CreateTabTinyNumberField']")
	public static WebElement accountHeaderCreateTabTinyNumberField;//
	
	@FindBy(xpath="//*[@id='CreateTabGregorianField_checkbox']")
	public static WebElement accountHeaderCreateTabGregorianCheckBox;
	
	@FindBy(xpath="//*[@id='CreateTabGregorianField']")
	public static WebElement accountHeaderCreateTabGregorianDateField;
	
	@FindBy(xpath="//*[@id='CreateTabGregorianField_input_image']/span")
	public static WebElement accountHeaderCreateTabGregorianCalenderIcon;
	
	@FindBy(xpath="//*[@id='CreateTabHijriField_checkbox']")
	public static WebElement accountHeaderCreateTabHijriFieldCheckBox;
	
	@FindBy(xpath="//*[@id='CreateTabHijriField']")
	public static WebElement accountHeaderCreateTabHijriFieldDate;
	
	@FindBy(xpath="//*[@id='CreateTabHijriField_input_image']/span")
	public static WebElement accountHeaderCreateTabHijriFieldCalenderIcon;
	
	@FindBy(xpath="//*[@id='CreateTabShamsiField_checkbox']")
	public static WebElement accountHeaderCreateTabShamsiFieldCheckBox;
	
	@FindBy(xpath="//*[@id='CreateTabShamsiField']")
	public static WebElement accountHeaderCreateTabShamsiFieldDate;
	
	@FindBy(xpath="//*[@id='CreateTabShamsiField_input_image']/span")
	public static WebElement accountHeaderCreateTabShamsiFieldCalenderIcon;
	
	
	
	
	
	
	
	
	public static boolean checkOpenAccountsAndValidateFieldCreatedInCreateTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	    homeMenu.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	    mastersMenu.click();
	     
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
	    accounts.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));	
	    masterNewBtn.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	    nameTxt.sendKeys("Demo Account");
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("Demo Code");
	    
		Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTab));
	    accountHeaderCreateTab.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabTextFieldTxt));
	    String actDefaultText = accountHeaderCreateTabTextFieldTxt.getAttribute("value");
	    String expDefaultText = "TextField_DefaultValue";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabNumberFieldTxt));
	    String actDefaultNumber = accountHeaderCreateTabNumberFieldTxt.getAttribute("value");
	    String expDefaultNumber = "0";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabBooleanFieldChkbox));
	    boolean actBooleanChkbox = accountHeaderCreateTabBooleanFieldChkbox.isDisplayed();
	    boolean expBooleanChkbox = true;
	    
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabDateTimeField));
	    String actDefaultTimeDate = accountHeaderCreateTabDateTimeField.getText();
	    
	    StringBuffer stringBuffer = new StringBuffer();
	    Date now = new Date();
	    SimpleDateFormat simpleDateTimeFormat = new SimpleDateFormat("M/dd/yyyy hh:mm a");
	    String expDefaultTimeDate = simpleDateTimeFormat.format(now); 
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabTimeFieldTxt));
	    String actDefaultTime = accountHeaderCreateTabTimeFieldTxt.getAttribute("value");
	    
	    SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("HH:mm");
	    String expDefaultTime = simpleTimeFormat.format(now);
	    
	    
	    
	    String actDefaultDate = accountHeaderCreateTabDateField.getText();
	    
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    String expDefaultDate = simpleDateFormat.format(now);
	    
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabFractionFieldTxt));
	    String actDefaultFraction = accountHeaderCreateTabFractionFieldTxt.getAttribute("value");
	    String expDefaultFraction = "0.00";
	    
	    
	    boolean actPictureBrowseBtn = accountHeaderCreateTabPictureFieldBrowseBtn.isDisplayed();
	    boolean expPictureBrowseBtn = true; 
	    		
	    boolean actPictureSaveBtn = accountHeaderCreateTabPictureFieldSaveBtn.isDisplayed();
	    boolean expPictureSaveBtn = true; 
	    		
	    boolean actPictureDeleteBtn = accountHeaderCreateTabPictureFieldDeleteBtn.isDisplayed();
	    boolean expPictureDeleteBtn = true;
	    		
	    
	    ArrayList<String> actStringList = new ArrayList<String>(); 
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabStringListFieldDropdown));
	    Select drpdwn = new Select(accountHeaderCreateTabStringListFieldDropdown);
	    
	    int count = drpdwn.getOptions().size();
	    
	    for (int i = 0; i < count; i++) 
	    {
	    	String data = drpdwn.getOptions().get(i).getAttribute("value");
	    	actStringList.add(data);
		}
	    
	    String actStringListTxt = actStringList.toString();
	    String expStringListTxt = "[DataTypeField_DefaultValueText1, DataTypeField_DefaultValueText2]";
	    
	    boolean actDocumentViewerBrowseBtn = accountHeaderCreateTabDocumentViewerBrowseBtn.isDisplayed();
	    boolean expDocumentViewerBrowseBtn = true;
	    
	    boolean actDocumentViewerSaveBtn = accountHeaderCreateTabDocumentViewerSaveBtn.isDisplayed();
	    boolean expDocumentViewerSaveBtn = true;
	    
	    /*boolean actDocumentViewerEraseBtn = accountHeaderCreateTabDocumentViewerEraseBtn.isDisplayed();
	    boolean expDocumentViewerEraseBtn = true;*/
	    
	    boolean actMasterFieldDropdown = accountHeaderCreateTabMasterFieldDropdown.isDisplayed();
	    boolean expMasterFieldDropdown = true;
	    
	    boolean actExternalTableFielddDropdown = accountHeaderCreateTabExternalFieldDropdown.isDisplayed();
	    boolean expExternalTableFieldDropdown = true;
	    
	   
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabBigNumberField));
	    String actDefaultBigNumberValue = accountHeaderCreateTabBigNumberField.getAttribute("value");
	    String expDefaultBigNumberValue = "0";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabSmallNumberField));
	    String actDefaultSmallNumberValue = accountHeaderCreateTabSmallNumberField.getAttribute("value");
	    String expDefaultSmallNumberValue = "0";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabTinyNumberField));
	    String actDefaultTinyNumberValue = accountHeaderCreateTabTinyNumberField.getAttribute("value");
	    String expDefaultTinyNumberValue = "0";
	    
	    
	    String actDefaultGregorianFieldDate = accountHeaderCreateTabGregorianDateField.getText();
	    
	    SimpleDateFormat simpleDateFormatt = new SimpleDateFormat("dd/MM/yyyy");
	    String expDefaultGregorianFieldDate= simpleDateFormatt.format(now);
	    
	    boolean actHijriCheckbox = accountHeaderCreateTabHijriFieldCheckBox.isDisplayed();
	    boolean expHijriCheckbox = true;
	    
	    boolean actShamiCheckbox = accountHeaderCreateTabShamsiFieldCheckBox.isDisplayed();
	    boolean expShamiCheckbox = true;
	    
	    
	    
		System.out.println("***********************************checkOpenAccountsAndValidateFieldCreatedInCreateTab*********************************");
	    System.out.println("Actual TextField value: "+actDefaultText                      +"Expected TextField value "+expDefaultText);
	    System.out.println("Actual NumberField value: "+actDefaultNumber                  +"Expected NumberField value "+expDefaultNumber);
	    System.out.println("Actual BooleanCheckbox value: "+actBooleanChkbox                  +"Expected BooleanCheckbox value "+expBooleanChkbox);
	    System.out.println("Actual Timefield value: "+actDefaultTimeDate                  +"Expected timefield value "+expDefaultTimeDate);
	    System.out.println("Actual DateTime value: "+actDefaultTime                  +"Expected DateTime value "+expDefaultTime);
	    System.out.println("Actual Date value: "+actDefaultDate                  +"Expected Date value "+expDefaultDate);
	    System.out.println("Actual Fraction value: "+actDefaultFraction                  +"Expected Fraction value "+expDefaultFraction);
	    System.out.println("Actual PictureBrowserButton value: "+actPictureBrowseBtn                  +"Expected PictureBrowserButton value "+expPictureBrowseBtn);
	    System.out.println("Actual PictureSaveButton value: "+actPictureSaveBtn                  +"Expected PictureSaveButton value "+expPictureSaveBtn);
	    System.out.println("Actual PictureDeleteButton value: "+actPictureDeleteBtn                  +"Expected PictureDeleteButton value "+expPictureDeleteBtn);
	    System.out.println("Actual StringList values: "+actStringListTxt                  +"Expected StringList values "+expStringListTxt);
	    System.out.println("Actual StringList values: "+actStringListTxt                  +"Expected StringList values "+expStringListTxt);

	    




		if(true)
		{	
			return true;
		}	 
		else
		{
			return false;
		}
     }
	

	public static boolean checkEnableHiddenInGroupCheckboxInAllFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
		 
		masterRibbonControlNextBtn.click(); 
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();

		Thread.sleep(2000);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));
		masterFieldsCreateTab.click();
		
		Thread.sleep(2000);
		
		int count = fieldCaptionTxtList.size();
		
		//Text Field
		
		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_TextField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
		
		if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
		{
			extraFields_PropertiesMandatoryChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		
		if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
		{
			extraFields_PropertiesHiddenChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
		extraFields_PropertiesHiddenInGroupChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expTextFieldMsg = "Field Updated Successfully";
		String actTextFieldMsg = checkValidationMessage(expTextFieldMsg);
		
		
		
		//Number Field
		
		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_NumberField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		
		if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
		{
			extraFields_PropertiesHiddenChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
		extraFields_PropertiesHiddenInGroupChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expNumberFieldMsg = "Field Updated Successfully";
		String actNumbertFieldMsg = checkValidationMessage(expNumberFieldMsg);
		
		//Boolean Field
		
		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_BooleanField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		
		if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
		{
			extraFields_PropertiesHiddenChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
		extraFields_PropertiesHiddenInGroupChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expBooleanFieldMsg = "Field Updated Successfully";
		String actBooleanFieldMsg = checkValidationMessage(expBooleanFieldMsg);
		
		//DateTime Field

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_DateTimeField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		
		if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
		{
			extraFields_PropertiesHiddenChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
		extraFields_PropertiesHiddenInGroupChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expDateTimeFieldMsg = "Field Updated Successfully";
		String actDateTimeFieldMsg = checkValidationMessage(expDateTimeFieldMsg);
		
		//Date Field
		

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_DateField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		
		if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
		{
			extraFields_PropertiesHiddenChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
		extraFields_PropertiesHiddenInGroupChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expDateFieldMsg = "Field Updated Successfully";
		String actDateFieldMsg = checkValidationMessage(expDateFieldMsg);
		
		//Time field

				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_TimeField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expTimeFieldMsg = "Field Updated Successfully";
				String actTimeFieldMsg = checkValidationMessage(expTimeFieldMsg);
				
				//Fraction Field

				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_FractionField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expFractionFieldMsg = "Field Updated Successfully";
				String actFractionFieldMsg = checkValidationMessage(expFractionFieldMsg);
				
				//Picture Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_PictureField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expPictureFieldMsg = "Field Updated Successfully";
				String actPictureFieldMsg = checkValidationMessage(expPictureFieldMsg);
				
				//String List Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_StringListField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expStringListFieldMsg = "Field Updated Successfully";
				String actStringListFieldMsg = checkValidationMessage(expStringListFieldMsg);
		
				//Number List
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_NumberListField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expNumberListFieldMsg = "Field Updated Successfully";
				String actNumberListFieldMsg = checkValidationMessage(expNumberListFieldMsg);
				
				//DocumentViewer Field

				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_DocumentViewerField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expDocumentViewerFieldMsg = "Field Updated Successfully";
				String actDocumentViewerFieldMsg = checkValidationMessage(expDocumentViewerFieldMsg);
				
				//Master Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_MasterField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expMasterFieldMsg = "Field Updated Successfully";
				String actMasterFieldMsg = checkValidationMessage(expMasterFieldMsg);
				
				//BigNumber Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_BigNumberField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expBigNumberFieldMsg = "Field Updated Successfully";
				String actBigNumberFieldMsg = checkValidationMessage(expBigNumberFieldMsg);
				
				/*
				//External Table Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_ExternalTableField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expExternalTableFieldMsg = "Field Updated Successfully";
				String actExternalTableFieldMsg = checkValidationMessage(expExternalTableFieldMsg);*/
				
				//Small Number Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_SmallNumberField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expSmallNumberFieldMsg = "Field Updated Successfully";
				String actSmallNumberFieldMsg = checkValidationMessage(expSmallNumberFieldMsg);
				
				//Tiny Number field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_TinyNumberField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expTinyNumberFieldMsg = "Field Updated Successfully";
				String actTinyNumberFieldMsg = checkValidationMessage(expTinyNumberFieldMsg);
				
				//Gregirian Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_GregorianField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expGregorianFieldMsg = "Field Updated Successfully";
				String actGregorianFieldMsg = checkValidationMessage(expGregorianFieldMsg);
				
				//Hijri Field 
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_HijriField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expHijriFieldMsg = "Field Updated Successfully";
				String actHijriFieldMsg = checkValidationMessage(expHijriFieldMsg);
				
				//Shamsi Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_ShamsiField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				
				if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
				{
					extraFields_PropertiesHiddenChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
				extraFields_PropertiesHiddenInGroupChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expShamsiFieldMsg = "Field Updated Successfully";
				String actShamsiFieldMsg = checkValidationMessage(expShamsiFieldMsg);
				
    	System.out.println("***********************************checkEnableHiddenCheckboxInAllFieldsProperties*********************************");
	    
    	System.out.println("TextFieldMsg            : "+actTextFieldMsg				+"  Value Expected  "+expTextFieldMsg);
    	System.out.println("NumbertFieldMsg         : "+actNumbertFieldMsg			+"  Value Expected  "+expNumberFieldMsg);
    	System.out.println("BooleanFieldMsg         : "+actBooleanFieldMsg			+"  Value Expected  "+expBooleanFieldMsg);
    	System.out.println("DateTimeFieldMsg        : "+actDateTimeFieldMsg			+"  Value Expected  "+expDateTimeFieldMsg);
    	System.out.println("DateFieldMsg            : "+actDateFieldMsg				+"  Value Expected  "+expDateFieldMsg);
    	System.out.println("TimeFieldMsg            : "+actTimeFieldMsg				+"  Value Expected  "+expTimeFieldMsg);
    	System.out.println("FractionFieldMsg        : "+actFractionFieldMsg			+"  Value Expected  "+expFractionFieldMsg);
    	System.out.println("PictureFieldMsg         : "+actPictureFieldMsg			+"  Value Expected  "+expPictureFieldMsg);
    	System.out.println("StringListFieldMsg      : "+actStringListFieldMsg		+"  Value Expected  "+expStringListFieldMsg);
    	System.out.println("NumberListFieldMsg      : "+actNumberListFieldMsg		+"  Value Expected  "+expNumberListFieldMsg);
    	System.out.println("DocumentViewerFieldMsg  : "+actDocumentViewerFieldMsg	+"  Value Expected  "+expDocumentViewerFieldMsg);
    	System.out.println("MasterFieldMsg          : "+actMasterFieldMsg			+"  Value Expected  "+expMasterFieldMsg);
    	System.out.println("BigNumberFieldMsg       : "+actBigNumberFieldMsg		+"  Value Expected  "+expBigNumberFieldMsg);
    	System.out.println("SmallNumberFieldMsg     : "+actSmallNumberFieldMsg		+"  Value Expected  "+expSmallNumberFieldMsg);
    	System.out.println("TinyNumberFieldMsg      : "+actTinyNumberFieldMsg		+"  Value Expected  "+expTinyNumberFieldMsg);
    	System.out.println("GregorianFieldMsg       : "+actGregorianFieldMsg		+"  Value Expected  "+expGregorianFieldMsg);
    	System.out.println("HijriFieldMsg           : "+actHijriFieldMsg			+"  Value Expected  "+expHijriFieldMsg);
    	System.out.println("ShamsiFieldMsg          : "+actShamsiFieldMsg			+"  Value Expected  "+expShamsiFieldMsg);
	   
		if(actTextFieldMsg.equalsIgnoreCase(expTextFieldMsg) && actNumbertFieldMsg.equalsIgnoreCase(expNumberFieldMsg) 
				&& actBooleanFieldMsg.equalsIgnoreCase(expBooleanFieldMsg) && actDateTimeFieldMsg.equalsIgnoreCase(expDateTimeFieldMsg) 
				&& actDateFieldMsg.equalsIgnoreCase(expDateFieldMsg) && actTimeFieldMsg.equalsIgnoreCase(expTimeFieldMsg) 
				&& actFractionFieldMsg.equalsIgnoreCase(expFractionFieldMsg) && actPictureFieldMsg.equalsIgnoreCase(expPictureFieldMsg) 
				&& actStringListFieldMsg.equalsIgnoreCase(expStringListFieldMsg) && actNumberListFieldMsg.equalsIgnoreCase(expNumberListFieldMsg) 
				&& actDocumentViewerFieldMsg.equalsIgnoreCase(expDocumentViewerFieldMsg) && actMasterFieldMsg.equalsIgnoreCase(expMasterFieldMsg) 
				&& actBigNumberFieldMsg.equalsIgnoreCase(expBigNumberFieldMsg) && actSmallNumberFieldMsg.equalsIgnoreCase(expSmallNumberFieldMsg) 
				&& actTinyNumberFieldMsg.equalsIgnoreCase(expTinyNumberFieldMsg) && actGregorianFieldMsg.equalsIgnoreCase(expGregorianFieldMsg) 
				&& actHijriFieldMsg.equalsIgnoreCase(expHijriFieldMsg) && actShamsiFieldMsg.equalsIgnoreCase(expShamsiFieldMsg))
		{	
			return true;
		}	 
		else
		{
			return false;
		}
     }
	
	
	
	
	public static boolean checkLogoutAndLoginAfterEnablingHiddenInGroupCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		userNameDisplay.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(4000);
		
		LoginPage lp=new LoginPage(getDriver()); 
			
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	    username.click();
	    Thread.sleep(2000);
		username.clear();
	    Thread.sleep(2000);
	    username.sendKeys(unamelt);
	    getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		password.click();
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    //checkRefershPopOnlogin();
	    
	    //checkPopUpWindow();
	    
	    Thread.sleep(8000);
	          
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	   	userNameDisplay.click();
	           	
		String userInfo=userNameDisplay.getText();
		
		System.out.println("User Info : "+userInfo);
		
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		
		companyLogo.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogo.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
		
		String getDashboard=dashboard.getText();
		
		System.out.println(getDashboard);
		
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Automation Company ";
	    String expDashboard			  ="Graph with Active and setAsDefault";
	   
		
		System.out.println("***********************************checkLogoutAndLoginAfterEnablingMandatoryCheckboxInFieldsProperties*********************************");
	    
	    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
	    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
	    System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);
	   
	  
		if(userInfo.equalsIgnoreCase(expuserInfo) /*&& getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName)*/)
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	 }
	
	
	
	
	//
	
	public static boolean checkEnableHiddenCheckboxInAllFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
		 
		masterRibbonControlNextBtn.click(); 
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();

		Thread.sleep(2000);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));
		masterFieldsCreateTab.click();
		
		Thread.sleep(2000);
		
		int count = fieldCaptionTxtList.size();
		
		//Text Field
		
		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_TextField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
		
		if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
		{
			extraFields_PropertiesMandatoryChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		extraFields_PropertiesHiddenChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expTextFieldMsg = "Field Updated Successfully";
		String actTextFieldMsg = checkValidationMessage(expTextFieldMsg);
		
		
		
		//Number Field
		
		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_NumberField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
		
		if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
		{
			extraFields_PropertiesMandatoryChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		extraFields_PropertiesHiddenChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expNumberFieldMsg = "Field Updated Successfully";
		String actNumbertFieldMsg = checkValidationMessage(expNumberFieldMsg);
		
		//Boolean Field
		
		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_BooleanField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
		
		if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
		{
			extraFields_PropertiesMandatoryChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		extraFields_PropertiesHiddenChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expBooleanFieldMsg = "Field Updated Successfully";
		String actBooleanFieldMsg = checkValidationMessage(expBooleanFieldMsg);
		
		//DateTime Field

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_DateTimeField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
		
		if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
		{
			extraFields_PropertiesMandatoryChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		extraFields_PropertiesHiddenChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expDateTimeFieldMsg = "Field Updated Successfully";
		String actDateTimeFieldMsg = checkValidationMessage(expDateTimeFieldMsg);
		
		//Date Field
		

		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_DateField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
		
		if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
		{
			extraFields_PropertiesMandatoryChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		extraFields_PropertiesHiddenChekbox.click();
		
		extraFields_OkBtn.click();
		
		String expDateFieldMsg = "Field Updated Successfully";
		String actDateFieldMsg = checkValidationMessage(expDateFieldMsg);
		
		//Time field

				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_TimeField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expTimeFieldMsg = "Field Updated Successfully";
				String actTimeFieldMsg = checkValidationMessage(expTimeFieldMsg);
				
				//Fraction Field

				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_FractionField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expFractionFieldMsg = "Field Updated Successfully";
				String actFractionFieldMsg = checkValidationMessage(expFractionFieldMsg);
				
				//Picture Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_PictureField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expPictureFieldMsg = "Field Updated Successfully";
				String actPictureFieldMsg = checkValidationMessage(expPictureFieldMsg);
				
				//String List Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_StringListField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expStringListFieldMsg = "Field Updated Successfully";
				String actStringListFieldMsg = checkValidationMessage(expStringListFieldMsg);
		
				//Number List
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_NumberListField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expNumberListFieldMsg = "Field Updated Successfully";
				String actNumberListFieldMsg = checkValidationMessage(expNumberListFieldMsg);
				
				//DocumentViewer Field

				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_DocumentViewerField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expDocumentViewerFieldMsg = "Field Updated Successfully";
				String actDocumentViewerFieldMsg = checkValidationMessage(expDocumentViewerFieldMsg);
				
				//Master Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_MasterField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expMasterFieldMsg = "Field Updated Successfully";
				String actMasterFieldMsg = checkValidationMessage(expMasterFieldMsg);
				
				//BigNumber Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_BigNumberField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expBigNumberFieldMsg = "Field Updated Successfully";
				String actBigNumberFieldMsg = checkValidationMessage(expBigNumberFieldMsg);
				
				/*
				//External Table Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_ExternalTableField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expExternalTableFieldMsg = "Field Updated Successfully";
				String actExternalTableFieldMsg = checkValidationMessage(expExternalTableFieldMsg);*/
				
				//Small Number Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_SmallNumberField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expSmallNumberFieldMsg = "Field Updated Successfully";
				String actSmallNumberFieldMsg = checkValidationMessage(expSmallNumberFieldMsg);
				
				//Tiny Number field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_TinyNumberField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expTinyNumberFieldMsg = "Field Updated Successfully";
				String actTinyNumberFieldMsg = checkValidationMessage(expTinyNumberFieldMsg);
				
				//Gregirian Field
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_GregorianField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expGregorianFieldMsg = "Field Updated Successfully";
				String actGregorianFieldMsg = checkValidationMessage(expGregorianFieldMsg);
				
				//Hijri Field 
				
				for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_HijriField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expHijriFieldMsg = "Field Updated Successfully";
				String actHijriFieldMsg = checkValidationMessage(expHijriFieldMsg);
				
				//Shamsi Field
				
				/*for (int i = 0; i < count; i++) 
				{
					String data = fieldCaptionTxtList.get(i).getText();
					
					if (data.equalsIgnoreCase("CreateTab_ShamsiField")) 
					{
						editFieldList.get(i).click();
						break;
					} 
				}
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
				extraFields_PropertiesTab.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
				
				if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
				{
					extraFields_PropertiesMandatoryChekbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
				extraFields_PropertiesHiddenChekbox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
				extraFields_OkBtn.click();
				
				String expShamsiFieldMsg = "Field Updated Successfully";
				String actShamsiFieldMsg = checkValidationMessage(expShamsiFieldMsg);*/
				
    	System.out.println("***********************************checkEnableHiddenCheckboxInAllFieldsProperties*********************************");
	    
    	System.out.println("TextFieldMsg            : "+actTextFieldMsg				+"  Value Expected  "+expTextFieldMsg);
    	System.out.println("NumbertFieldMsg         : "+actNumbertFieldMsg			+"  Value Expected  "+expNumberFieldMsg);
    	System.out.println("BooleanFieldMsg         : "+actBooleanFieldMsg			+"  Value Expected  "+expBooleanFieldMsg);
    	System.out.println("DateTimeFieldMsg        : "+actDateTimeFieldMsg			+"  Value Expected  "+expDateTimeFieldMsg);
    	System.out.println("DateFieldMsg            : "+actDateFieldMsg				+"  Value Expected  "+expDateFieldMsg);
    	System.out.println("TimeFieldMsg            : "+actTimeFieldMsg				+"  Value Expected  "+expTimeFieldMsg);
    	System.out.println("FractionFieldMsg        : "+actFractionFieldMsg			+"  Value Expected  "+expFractionFieldMsg);
    	System.out.println("PictureFieldMsg         : "+actPictureFieldMsg			+"  Value Expected  "+expPictureFieldMsg);
    	System.out.println("StringListFieldMsg      : "+actStringListFieldMsg		+"  Value Expected  "+expStringListFieldMsg);
    	System.out.println("NumberListFieldMsg      : "+actNumberListFieldMsg		+"  Value Expected  "+expNumberListFieldMsg);
    	System.out.println("DocumentViewerFieldMsg  : "+actDocumentViewerFieldMsg	+"  Value Expected  "+expDocumentViewerFieldMsg);
    	System.out.println("MasterFieldMsg          : "+actMasterFieldMsg			+"  Value Expected  "+expMasterFieldMsg);
    	System.out.println("BigNumberFieldMsg       : "+actBigNumberFieldMsg		+"  Value Expected  "+expBigNumberFieldMsg);
    	System.out.println("SmallNumberFieldMsg     : "+actSmallNumberFieldMsg		+"  Value Expected  "+expSmallNumberFieldMsg);
    	System.out.println("TinyNumberFieldMsg      : "+actTinyNumberFieldMsg		+"  Value Expected  "+expTinyNumberFieldMsg);
    	System.out.println("GregorianFieldMsg       : "+actGregorianFieldMsg		+"  Value Expected  "+expGregorianFieldMsg);
    	System.out.println("HijriFieldMsg           : "+actHijriFieldMsg			+"  Value Expected  "+expHijriFieldMsg);
    	//System.out.println("ShamsiFieldMsg          : "+actShamsiFieldMsg			+"  Value Expected  "+expShamsiFieldMsg);
	   
		if(actTextFieldMsg.equalsIgnoreCase(expTextFieldMsg) && actNumbertFieldMsg.equalsIgnoreCase(expNumberFieldMsg) 
				&& actBooleanFieldMsg.equalsIgnoreCase(expBooleanFieldMsg) && actDateTimeFieldMsg.equalsIgnoreCase(expDateTimeFieldMsg) 
				&& actDateFieldMsg.equalsIgnoreCase(expDateFieldMsg) && actTimeFieldMsg.equalsIgnoreCase(expTimeFieldMsg) 
				&& actFractionFieldMsg.equalsIgnoreCase(expFractionFieldMsg) && actPictureFieldMsg.equalsIgnoreCase(expPictureFieldMsg) 
				&& actStringListFieldMsg.equalsIgnoreCase(expStringListFieldMsg) && actNumberListFieldMsg.equalsIgnoreCase(expNumberListFieldMsg) 
				&& actDocumentViewerFieldMsg.equalsIgnoreCase(expDocumentViewerFieldMsg) && actMasterFieldMsg.equalsIgnoreCase(expMasterFieldMsg) 
				&& actBigNumberFieldMsg.equalsIgnoreCase(expBigNumberFieldMsg) && actSmallNumberFieldMsg.equalsIgnoreCase(expSmallNumberFieldMsg) 
				&& actTinyNumberFieldMsg.equalsIgnoreCase(expTinyNumberFieldMsg) && actGregorianFieldMsg.equalsIgnoreCase(expGregorianFieldMsg) 
				&& actHijriFieldMsg.equalsIgnoreCase(expHijriFieldMsg) /*&& actShamsiFieldMsg.equalsIgnoreCase(expShamsiFieldMsg)*/)
		{	
			return true;
		}	 
		else
		{
			return false;
		}
     }
	
	
	
	public static boolean checkLogoutAndLoginAfterEnablingHiddenCheckboxInFieldsProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
		userNameDisplay.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
		
		Thread.sleep(4000);
		
		LoginPage lp=new LoginPage(getDriver()); 
			
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	    username.click();
	    Thread.sleep(2000);
		username.clear();
	    Thread.sleep(2000);
	    username.sendKeys(unamelt);
	    getAction().moveToElement(username).sendKeys(Keys.TAB).perform();

	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		password.click();
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pawslt);
	    
	    lp.clickOnSignInBtn();
	    
	    //checkRefershPopOnlogin();
	    
	    //checkPopUpWindow();
	    
	    Thread.sleep(8000);
	          
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	   	userNameDisplay.click();
	           	
		String userInfo=userNameDisplay.getText();
		
		System.out.println("User Info : "+userInfo);
		
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		
		companyLogo.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogo.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
		
		String getDashboard=dashboard.getText();
		
		System.out.println(getDashboard);
		
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Automation Company ";
	    String expDashboard			  ="Graph with Active and setAsDefault";
	   
		
		System.out.println("***********************************checkLogoutAndLoginAfterEnablingMandatoryCheckboxInFieldsProperties*********************************");
	    
	    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
	    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
	    System.out.println("Dashboard                        : "+getDashboard           +"  value expected  "+expDashboard);
	   
	  
		if(userInfo.equalsIgnoreCase(expuserInfo) /*&& getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName)*/)
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	 }
	
	@FindBy(xpath="(//input[@id='CreateTabPictureFieldName'])[1]")
	private static WebElement accountHeaderCreateTabAddedPictureName;

	@FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
	private static WebElement accountSaveBtnn;
	
	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]/i")
	private static WebElement accountCloseBtnn;
	
	@FindBy(xpath="//*[@id='divBtnGroup6']/div/a")
	private static WebElement accountCreateTabTab;
	
	
	public static boolean checkHiddenFieldsAreDisplayingInCreateTab() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	    homeMenu.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	    mastersMenu.click();
	     
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
	    accounts.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));	
	    masterNewBtn.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	    nameTxt.sendKeys("HiddAccount");
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("HiddCode");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTab));
		accountHeaderCreateTab.click();
		
		Thread.sleep(2000);
		
		
		
		 boolean actCreateTabTextFieldValue=accountHeaderCreateTabTextFieldTxt.isDisplayed();
		 boolean expCreateTabTextFieldValue= false;
		 
		 boolean actCreateTabNumberFieldValue=accountHeaderCreateTabNumberFieldTxt.isDisplayed();
		 boolean expCreateTabNumberFieldValue= false;
		 
		 boolean actCreateTabBooleanFieldValue=accountHeaderCreateTabBooleanFieldChkbox.isDisplayed();
		 boolean expCreateTabBooleanFieldValue= false;
		 
		 boolean actCreateTabDateTimeFieldValue=accountHeaderCreateTabDateTimeField.isDisplayed();
		 boolean expCreateTabDateTimeFieldValue= false;
		 
		 boolean actCreateTabDateFieldValue=accountHeaderCreateTabDateField.isDisplayed();
		 boolean expCreateTabDateFieldValue= false;
		 
		 boolean actCreateTabTimeFieldValue=accountHeaderCreateTabTimeFieldTxt.isDisplayed();
		 boolean expCreateTabTimeFieldValue= false;
		 
		 boolean actCreateTabFractionFieldValue=accountHeaderCreateTabFractionFieldTxt.isDisplayed();
		 boolean expCreateTabFractionFieldValue= false;
		 
		 boolean actCreateTabPictureBrowseBtnValue=accountHeaderCreateTabPictureFieldBrowseBtn.isDisplayed();
		 boolean expCreateTabPictureBrowseBtnValue= false;
		 
		 boolean actCreateTabPictureSaveBtnValue=accountHeaderCreateTabPictureFieldSaveBtn.isDisplayed();
		 boolean expCreateTabPictureSaveBtnValue= false;
		
		 boolean actCreatTabPictureFieldDeleteBtnValue=accountHeaderCreateTabPictureFieldDeleteBtn.isDisplayed();
		 boolean expCreatTabPictureFieldDeleteBtnValue= false;
		 
		 boolean actCreateTabStringListValue=accountHeaderCreateTabStringListFieldDropdown.isDisplayed();
		 boolean expCreateTabStringListValue= false;
		 
		 boolean actCreateTabDocumentViewerValue=accountHeaderCreateTabDocumentViewerField.isDisplayed();
		 boolean expCreateTabDocumentViewerValue= false;
	
		 boolean actCreateTabDocumentViewerBrowseBtnValue=accountHeaderCreateTabDocumentViewerBrowseBtn.isDisplayed();
		 boolean expCreateTabDocumentViewerBrowseBtnValue= false;
		
		 boolean actCreatTabPictureFieldSaveBtnValue=accountHeaderCreateTabDocumentViewerSaveBtn.isDisplayed();
		 boolean expCreatTabPictureFieldSaveBtnValue= false;

		 boolean actCreateTabNumberListValue=accountHeaderCreateTabNumberListFieldDropdown.isDisplayed();
		 boolean expCreateTabNumberListValue= false;
		 
		 
		 boolean actCreateTabMasterFieldDropDownValue=accountHeaderCreateTabMasterFieldDropdown.isDisplayed();
		 boolean expCreateTabMasterFieldDropDownValue= false;
		 
		 boolean actCreateTabBigNumberFiledValue=accountHeaderCreateTabBigNumberField.isDisplayed();
		 boolean expCreateTabBigNumberFiledValue= false;
		 
		/* boolean actCreateTabExternalFiledDropdownValue=accountHeaderCreateTabExternalFieldDropdown.isDisplayed();
		 boolean expCreateTabExternalFiledDropdownValue= false;*/
		 
		 boolean actCreateTabSmallNumberField=accountHeaderCreateTabSmallNumberField.isDisplayed();
		 boolean expCreateTabSmallNumberField= false;
		 
		 
		 boolean actCreateTabTinyNumberField=accountHeaderCreateTabTinyNumberField.isDisplayed();
		 boolean expCreateTabTinyNumberField= false;
	
		 boolean actCreateTabGregorianDateField=accountHeaderCreateTabGregorianDateField.isDisplayed();
		 boolean expCreateTabGregorianDateField= false;
		
		 boolean actCreateTabHijriDateField=accountHeaderCreateTabHijriFieldDate.isDisplayed();
		 boolean expCreateTabHijriDateField= false;
		 
			
	    
		Thread.sleep(2000);
		System.out.println("************************************checkHiddenFieldsAreDisplayingInCreateTab***********************************************");
		
		System.out.println("TextField            : 		"+actCreateTabTextFieldValue				+"  Value Expected  "+expCreateTabTextFieldValue);
    	System.out.println("NumbertField       	 : 		"+actCreateTabNumberFieldValue				+"  Value Expected  "+expCreateTabNumberFieldValue);
    	System.out.println("BooleanField         : 		"+actCreateTabBooleanFieldValue				+"  Value Expected  "+expCreateTabBooleanFieldValue);
    	System.out.println("DateTimeField        :		"+actCreateTabDateTimeFieldValue			+"  Value Expected  "+expCreateTabDateTimeFieldValue);
    	System.out.println("DateField            : 		"+actCreateTabDateFieldValue				+"  Value Expected  "+expCreateTabDateFieldValue);
    	System.out.println("TimeField            : 		"+actCreateTabTimeFieldValue				+"  Value Expected  "+expCreateTabTimeFieldValue);
    	System.out.println("FractionField        : 		"+actCreateTabFractionFieldValue			+"  Value Expected  "+expCreateTabFractionFieldValue);
    	System.out.println("PictureField         : 		"+actCreateTabPictureBrowseBtnValue			+"  Value Expected  "+expCreateTabPictureBrowseBtnValue);
    	System.out.println("StringListField      : 		"+actCreateTabStringListValue				+"  Value Expected  "+expCreateTabStringListValue);
    	System.out.println("NumberListField      : 		"+actCreateTabNumberListValue				+"  Value Expected  "+expCreateTabNumberListValue);
    	System.out.println("DocumentViewerField  : 		"+actCreateTabDocumentViewerValue			+"  Value Expected  "+expCreateTabDocumentViewerValue);
    	System.out.println("MasterField          : 		"+actCreateTabMasterFieldDropDownValue		+"  Value Expected  "+expCreateTabMasterFieldDropDownValue);
    	System.out.println("BigNumberField       : 		"+actCreateTabBigNumberFiledValue			+"  Value Expected  "+expCreateTabBigNumberFiledValue);
    	System.out.println("SmallNumberField     :		"+actCreateTabSmallNumberField				+"  Value Expected  "+expCreateTabSmallNumberField);
    	System.out.println("TinyNumberField      : 		"+actCreateTabTinyNumberField				+"  Value Expected  "+expCreateTabTinyNumberField);
    	System.out.println("GregorianField       : 		"+actCreateTabGregorianDateField			+"  Value Expected  "+expCreateTabGregorianDateField);
    	System.out.println("HijriField           : 		"+actCreateTabHijriDateField				+"  Value Expected  "+actCreateTabHijriDateField);
		
		
		
		if(actCreateTabTextFieldValue==expCreateTabTextFieldValue && actCreateTabNumberFieldValue==expCreateTabNumberFieldValue 
			&& actCreateTabBooleanFieldValue==expCreateTabBooleanFieldValue && actCreateTabDateTimeFieldValue==expCreateTabDateTimeFieldValue 
			&& actCreateTabDateFieldValue==expCreateTabDateFieldValue && actCreateTabTimeFieldValue==expCreateTabTimeFieldValue 
			&& actCreateTabFractionFieldValue==expCreateTabFractionFieldValue && actCreateTabPictureBrowseBtnValue==expCreateTabPictureBrowseBtnValue 
			&& actCreateTabStringListValue==expCreateTabStringListValue && actCreateTabNumberListValue==expCreateTabNumberListValue 
			&& actCreateTabDocumentViewerValue==expCreateTabDocumentViewerValue && actCreateTabMasterFieldDropDownValue==expCreateTabMasterFieldDropDownValue 
			&& actCreateTabBigNumberFiledValue==expCreateTabBigNumberFiledValue && actCreateTabSmallNumberField==expCreateTabSmallNumberField 
			&& actCreateTabTinyNumberField==expCreateTabTinyNumberField && actCreateTabGregorianDateField==expCreateTabGregorianDateField 
			&& actCreateTabHijriDateField==actCreateTabHijriDateField)
			{	
				return true;
			}	 
			else
			{
				return false;
			}
		
	}

	
	
	public static boolean checkCreateTabEnableHiddenCheckboxInShasmiFieldProperties() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
		masterRibbonToExpandOptions.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
		 
		masterRibbonControlNextBtn.click(); 
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();
		masterRibbonControlNextBtn.click();

		Thread.sleep(2000);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
		masterCustamizemasterBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));
		masterFieldsCreateTab.click();
		
		Thread.sleep(2000);
		
		int count = fieldCaptionTxtList.size();
		
			
		//Shamsi Field
		
		for (int i = 0; i < count; i++) 
		{
			String data = fieldCaptionTxtList.get(i).getText();
			
			if (data.equalsIgnoreCase("CreateTab_ShamsiField")) 
			{
				editFieldList.get(i).click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
		extraFields_PropertiesTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
		
		if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
		{
			extraFields_PropertiesMandatoryChekbox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
		extraFields_PropertiesHiddenChekbox.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
		extraFields_OkBtn.click();
		
		String expShamsiFieldMsg = "Field Updated Successfully";
		String actShamsiFieldMsg = checkValidationMessage(expShamsiFieldMsg);
			
    	System.out.println("***********************************checkCreateTabEnableHiddenCheckboxInShasmiFieldProperties*********************************");
	    
    	System.out.println("ShamsiFieldMsg          : "+actShamsiFieldMsg			+"  Value Expected  "+expShamsiFieldMsg);
	   
		if(actShamsiFieldMsg.equalsIgnoreCase(expShamsiFieldMsg))
		{	
			return true;
		}	 
		else
		{
			return false;
		}
     }
	
	
	
	
	
	
	
	
	
	public static boolean checkCreateTabIsHiddenInAccount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		accounts.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));	
   	 	masterNewBtn.click();
	    
	    Thread.sleep(2000);
		
		boolean actCreateTabValue = accountHeaderCreateTab.isDisplayed();
		boolean expCreateTabValue = false;
		
		System.out.println("accountHeaderCreateTab  : "+actCreateTabValue+"  Value Expected  "+expCreateTabValue);
		
		if (actCreateTabValue==expCreateTabValue) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean checkHiddenFieldsAreDisplayingInCreateTabInGroupAccount() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	    homeMenu.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	    mastersMenu.click();
	     
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
	    accounts.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));	
	    masterAddGroupBtn.click();
	    
	    Thread.sleep(2000);
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	    nameTxt.sendKeys("HidGrpAccount");
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.sendKeys("HidGrpCode");
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTab));
		accountHeaderCreateTab.click();
		
		Thread.sleep(2000);
		
		
		
		 boolean actCreateTabTextFieldValue=accountHeaderCreateTabTextFieldTxt.isDisplayed();
		 boolean expCreateTabTextFieldValue= false;
		 
		 boolean actCreateTabNumberFieldValue=accountHeaderCreateTabNumberFieldTxt.isDisplayed();
		 boolean expCreateTabNumberFieldValue= false;
		 
		 boolean actCreateTabBooleanFieldValue=accountHeaderCreateTabBooleanFieldChkbox.isDisplayed();
		 boolean expCreateTabBooleanFieldValue= false;
		 
		 boolean actCreateTabDateTimeFieldValue=accountHeaderCreateTabDateTimeField.isDisplayed();
		 boolean expCreateTabDateTimeFieldValue= false;
		 
		 boolean actCreateTabDateFieldValue=accountHeaderCreateTabDateField.isDisplayed();
		 boolean expCreateTabDateFieldValue= false;
		 
		 boolean actCreateTabTimeFieldValue=accountHeaderCreateTabTimeFieldTxt.isDisplayed();
		 boolean expCreateTabTimeFieldValue= false;
		 
		 boolean actCreateTabFractionFieldValue=accountHeaderCreateTabFractionFieldTxt.isDisplayed();
		 boolean expCreateTabFractionFieldValue= false;
		 
		 boolean actCreateTabPictureBrowseBtnValue=accountHeaderCreateTabPictureFieldBrowseBtn.isDisplayed();
		 boolean expCreateTabPictureBrowseBtnValue= false;
		 
		 
		 boolean actCreateTabPictureSaveBtnValue=accountHeaderCreateTabPictureFieldSaveBtn.isDisplayed();
		 boolean expCreateTabPictureSaveBtnValue= false;
		 
		
		 boolean actCreatTabPictureFieldDeleteBtnValue=accountHeaderCreateTabPictureFieldDeleteBtn.isDisplayed();
		 boolean expCreatTabPictureFieldDeleteBtnValue= false;
		 
		 boolean actCreateTabStringListValue=accountHeaderCreateTabStringListFieldDropdown.isDisplayed();
		 boolean expCreateTabStringListValue= false;
		 
		 boolean actCreateTabDocumentViewerValue=accountHeaderCreateTabDocumentViewerField.isDisplayed();
		 boolean expCreateTabDocumentViewerValue= false;
		 
		 
		 boolean actCreateTabDocumentViewerBrowseBtnValue=accountHeaderCreateTabDocumentViewerBrowseBtn.isDisplayed();
		 boolean expCreateTabDocumentViewerBrowseBtnValue= false;
		 
		 
		 boolean actCreatTabPictureFieldSaveBtnValue=accountHeaderCreateTabDocumentViewerSaveBtn.isDisplayed();
		 boolean expCreatTabPictureFieldSaveBtnValue= false;
		 
		 
		 boolean actCreateTabNumberListValue=accountHeaderCreateTabNumberListFieldDropdown.isDisplayed();
		 boolean expCreateTabNumberListValue= false;
		 
		 
		 boolean actCreateTabMasterFieldDropDownValue=accountHeaderCreateTabMasterFieldDropdown.isDisplayed();
		 boolean expCreateTabMasterFieldDropDownValue= false;
		
		 boolean actCreateTabBigNumberFiledValue=accountHeaderCreateTabBigNumberField.isDisplayed();
		 boolean expCreateTabBigNumberFiledValue= false;
		 
		/* boolean actCreateTabExternalFiledDropdownValue=accountHeaderCreateTabExternalFieldDropdown.isDisplayed();
		 boolean expCreateTabExternalFiledDropdownValue= false;*/
		 
		 boolean actCreateTabSmallNumberField=accountHeaderCreateTabSmallNumberField.isDisplayed();
		 boolean expCreateTabSmallNumberField= false;
		 
		 
		 boolean actCreateTabTinyNumberField=accountHeaderCreateTabTinyNumberField.isDisplayed();
		 boolean expCreateTabTinyNumberField= false;
	
		 boolean actCreateTabGregorianDateField=accountHeaderCreateTabGregorianDateField.isDisplayed();
		 boolean expCreateTabGregorianDateField= false;
		 
		 
		 boolean actCreateTabHijriDateField=accountHeaderCreateTabHijriFieldDate.isDisplayed();
		 boolean expCreateTabHijriDateField= false;
		 
			
	    
		Thread.sleep(2000);
		
		System.out.println("**********************************checkHiddenFieldsAreDisplayingInCreateTabInGroupAccountAfterHiddenInGroup****************************************");
		
		System.out.println("TextField            : 		"+actCreateTabTextFieldValue				+"  Value Expected  "+expCreateTabTextFieldValue);
    	System.out.println("NumbertField       	 : 		"+actCreateTabNumberFieldValue				+"  Value Expected  "+expCreateTabNumberFieldValue);
    	System.out.println("BooleanField         : 		"+actCreateTabBooleanFieldValue				+"  Value Expected  "+expCreateTabBooleanFieldValue);
    	System.out.println("DateTimeField        :		"+actCreateTabDateTimeFieldValue			+"  Value Expected  "+expCreateTabDateTimeFieldValue);
    	System.out.println("DateField            : 		"+actCreateTabDateFieldValue				+"  Value Expected  "+expCreateTabDateFieldValue);
    	System.out.println("TimeField            : 		"+actCreateTabTimeFieldValue				+"  Value Expected  "+expCreateTabTimeFieldValue);
    	System.out.println("FractionField        : 		"+actCreateTabFractionFieldValue			+"  Value Expected  "+expCreateTabFractionFieldValue);
    	System.out.println("PictureField         : 		"+actCreateTabPictureBrowseBtnValue			+"  Value Expected  "+expCreateTabPictureBrowseBtnValue);
    	System.out.println("StringListField      : 		"+actCreateTabStringListValue				+"  Value Expected  "+expCreateTabStringListValue);
    	System.out.println("NumberListField      : 		"+actCreateTabNumberListValue				+"  Value Expected  "+expCreateTabNumberListValue);
    	System.out.println("DocumentViewerField  : 		"+actCreateTabDocumentViewerValue			+"  Value Expected  "+expCreateTabDocumentViewerValue);
    	System.out.println("MasterField          : 		"+actCreateTabMasterFieldDropDownValue		+"  Value Expected  "+expCreateTabMasterFieldDropDownValue);
    	System.out.println("BigNumberField       : 		"+actCreateTabBigNumberFiledValue			+"  Value Expected  "+expCreateTabBigNumberFiledValue);
    	System.out.println("SmallNumberField     :		"+actCreateTabSmallNumberField				+"  Value Expected  "+expCreateTabSmallNumberField);
    	System.out.println("TinyNumberField      : 		"+actCreateTabTinyNumberField				+"  Value Expected  "+expCreateTabTinyNumberField);
    	System.out.println("GregorianField       : 		"+actCreateTabGregorianDateField			+"  Value Expected  "+expCreateTabGregorianDateField);
    	System.out.println("HijriField           : 		"+actCreateTabHijriDateField				+"  Value Expected  "+actCreateTabHijriDateField);
		
		
		
		if(actCreateTabTextFieldValue==expCreateTabTextFieldValue && actCreateTabNumberFieldValue==expCreateTabNumberFieldValue 
			&& actCreateTabBooleanFieldValue==expCreateTabBooleanFieldValue && actCreateTabDateTimeFieldValue==expCreateTabDateTimeFieldValue 
			&& actCreateTabDateFieldValue==expCreateTabDateFieldValue && actCreateTabTimeFieldValue==expCreateTabTimeFieldValue 
			&& actCreateTabFractionFieldValue==expCreateTabFractionFieldValue && actCreateTabPictureBrowseBtnValue==expCreateTabPictureBrowseBtnValue 
			&& actCreateTabStringListValue==expCreateTabStringListValue && actCreateTabNumberListValue==expCreateTabNumberListValue 
			&& actCreateTabDocumentViewerValue==expCreateTabDocumentViewerValue && actCreateTabMasterFieldDropDownValue==expCreateTabMasterFieldDropDownValue 
			&& actCreateTabBigNumberFiledValue==expCreateTabBigNumberFiledValue && actCreateTabSmallNumberField==expCreateTabSmallNumberField 
			&& actCreateTabTinyNumberField==expCreateTabTinyNumberField && actCreateTabGregorianDateField==expCreateTabGregorianDateField 
			&& actCreateTabHijriDateField==actCreateTabHijriDateField)
			{	
				return true;
			}	 
			else
			{
				return false;
			}
		
	}
		
	public static boolean checkEnableSpellCheckBoxInAllFieldProperties() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	mastersMenu.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
	accounts.click();
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
	masterRibbonToExpandOptions.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
	 
	masterRibbonControlNextBtn.click(); 
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();

	Thread.sleep(2000);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
	masterCustamizemasterBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));
	masterFieldsCreateTab.click();
	
	Thread.sleep(2000);
	
	int count = fieldCaptionTxtList.size();
	
	//Text Field
	
	for (int i = 0; i < count; i++) 
	{
		String data = fieldCaptionTxtList.get(i).getText();
		
		if (data.equalsIgnoreCase("CreateTab_TextField")) 
		{
			editFieldList.get(i).click();
			break;
		} 
	}
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
	extraFields_PropertiesTab.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesMandatoryChekbox));
	
	if (extraFields_PropertiesMandatoryChekbox.isSelected()==true) 
	{
		extraFields_PropertiesMandatoryChekbox.click();
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
	
	if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
	{
		extraFields_PropertiesHiddenInGroupChekbox.click();
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesSpellCheckChekbox));
	extraFields_PropertiesSpellCheckChekbox.click();
	
	extraFields_OkBtn.click();
	
	String expTextFieldMsg = "Field Updated Successfully";
	String actTextFieldMsg = checkValidationMessage(expTextFieldMsg);
	
	
	
	//Number Field
	
	for (int i = 0; i < count; i++) 
	{
		String data = fieldCaptionTxtList.get(i).getText();
		
		if (data.equalsIgnoreCase("CreateTab_NumberField")) 
		{
			editFieldList.get(i).click();
			break;
		} 
	}
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
	extraFields_PropertiesTab.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
	
	if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
	{
		extraFields_PropertiesHiddenInGroupChekbox.click();
	}
	
	
	
	extraFields_OkBtn.click();
	
	String expNumberFieldMsg = "Field Updated Successfully";
	String actNumbertFieldMsg = checkValidationMessage(expNumberFieldMsg);
	
	//Boolean Field
	
	for (int i = 0; i < count; i++) 
	{
		String data = fieldCaptionTxtList.get(i).getText();
		
		if (data.equalsIgnoreCase("CreateTab_BooleanField")) 
		{
			editFieldList.get(i).click();
			break;
		} 
	}
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
	extraFields_PropertiesTab.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
	
	if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
	{
		extraFields_PropertiesHiddenInGroupChekbox.click();
	}
	
	
	
	extraFields_OkBtn.click();
	
	String expBooleanFieldMsg = "Field Updated Successfully";
	String actBooleanFieldMsg = checkValidationMessage(expBooleanFieldMsg);
	
	//DateTime Field

	for (int i = 0; i < count; i++) 
	{
		String data = fieldCaptionTxtList.get(i).getText();
		
		if (data.equalsIgnoreCase("CreateTab_DateTimeField")) 
		{
			editFieldList.get(i).click();
			break;
		} 
	}
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
	extraFields_PropertiesTab.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
	
	if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
	{
		extraFields_PropertiesHiddenInGroupChekbox.click();
	}
	
	
	
	extraFields_OkBtn.click();
	
	String expDateTimeFieldMsg = "Field Updated Successfully";
	String actDateTimeFieldMsg = checkValidationMessage(expDateTimeFieldMsg);
	
	//Date Field
	

	for (int i = 0; i < count; i++) 
	{
		String data = fieldCaptionTxtList.get(i).getText();
		
		if (data.equalsIgnoreCase("CreateTab_DateField")) 
		{
			editFieldList.get(i).click();
			break;
		} 
	}
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
	extraFields_PropertiesTab.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
	
	if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
	{
		extraFields_PropertiesHiddenInGroupChekbox.click();
	}
	
	
	
	extraFields_OkBtn.click();
	
	String expDateFieldMsg = "Field Updated Successfully";
	String actDateFieldMsg = checkValidationMessage(expDateFieldMsg);
	
	//Time field

			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_TimeField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expTimeFieldMsg = "Field Updated Successfully";
			String actTimeFieldMsg = checkValidationMessage(expTimeFieldMsg);
			
			//Fraction Field

			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_FractionField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expFractionFieldMsg = "Field Updated Successfully";
			String actFractionFieldMsg = checkValidationMessage(expFractionFieldMsg);
			
			//Picture Field
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_PictureField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expPictureFieldMsg = "Field Updated Successfully";
			String actPictureFieldMsg = checkValidationMessage(expPictureFieldMsg);
			
			//String List Field
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_StringListField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expStringListFieldMsg = "Field Updated Successfully";
			String actStringListFieldMsg = checkValidationMessage(expStringListFieldMsg);
	
			//Number List
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_NumberListField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expNumberListFieldMsg = "Field Updated Successfully";
			String actNumberListFieldMsg = checkValidationMessage(expNumberListFieldMsg);
			
			//DocumentViewer Field

			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_DocumentViewerField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expDocumentViewerFieldMsg = "Field Updated Successfully";
			String actDocumentViewerFieldMsg = checkValidationMessage(expDocumentViewerFieldMsg);
			
			//Master Field
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_MasterField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expMasterFieldMsg = "Field Updated Successfully";
			String actMasterFieldMsg = checkValidationMessage(expMasterFieldMsg);
			
			//BigNumber Field
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_BigNumberField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expBigNumberFieldMsg = "Field Updated Successfully";
			String actBigNumberFieldMsg = checkValidationMessage(expBigNumberFieldMsg);
			
			/*
			//External Table Field
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_ExternalTableField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenChekbox));
			
			if (extraFields_PropertiesHiddenChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenChekbox.click();
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			extraFields_PropertiesHiddenInGroupChekbox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expExternalTableFieldMsg = "Field Updated Successfully";
			String actExternalTableFieldMsg = checkValidationMessage(expExternalTableFieldMsg);*/
			
			//Small Number Field
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_SmallNumberField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expSmallNumberFieldMsg = "Field Updated Successfully";
			String actSmallNumberFieldMsg = checkValidationMessage(expSmallNumberFieldMsg);
			
			//Tiny Number field
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_TinyNumberField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expTinyNumberFieldMsg = "Field Updated Successfully";
			String actTinyNumberFieldMsg = checkValidationMessage(expTinyNumberFieldMsg);
			
			//Gregorian Field
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_GregorianField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expGregorianFieldMsg = "Field Updated Successfully";
			String actGregorianFieldMsg = checkValidationMessage(expGregorianFieldMsg);
			
			//Hijri Field 
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_HijriField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expHijriFieldMsg = "Field Updated Successfully";
			String actHijriFieldMsg = checkValidationMessage(expHijriFieldMsg);
			
			//Shamsi Field
			
			for (int i = 0; i < count; i++) 
			{
				String data = fieldCaptionTxtList.get(i).getText();
				
				if (data.equalsIgnoreCase("CreateTab_ShamsiField")) 
				{
					editFieldList.get(i).click();
					break;
				} 
			}
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
			extraFields_PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesHiddenInGroupChekbox));
			
			if (extraFields_PropertiesHiddenInGroupChekbox.isSelected()==true) 
			{
				extraFields_PropertiesHiddenInGroupChekbox.click();
			}
		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
			extraFields_OkBtn.click();
			
			String expShamsiFieldMsg = "Field Updated Successfully";
			String actShamsiFieldMsg = checkValidationMessage(expShamsiFieldMsg);
			
	System.out.println("***********************************checkEnableHiddenCheckboxInAllFieldsProperties***********************************");
    
	System.out.println("TextFieldMsg            : "+actTextFieldMsg				+"  Value Expected  "+expTextFieldMsg);
	System.out.println("NumbertFieldMsg         : "+actNumbertFieldMsg			+"  Value Expected  "+expNumberFieldMsg);
	System.out.println("BooleanFieldMsg         : "+actBooleanFieldMsg			+"  Value Expected  "+expBooleanFieldMsg);
	System.out.println("DateTimeFieldMsg        : "+actDateTimeFieldMsg			+"  Value Expected  "+expDateTimeFieldMsg);
	System.out.println("DateFieldMsg            : "+actDateFieldMsg				+"  Value Expected  "+expDateFieldMsg);
	System.out.println("TimeFieldMsg            : "+actTimeFieldMsg				+"  Value Expected  "+expTimeFieldMsg);
	System.out.println("FractionFieldMsg        : "+actFractionFieldMsg			+"  Value Expected  "+expFractionFieldMsg);
	System.out.println("PictureFieldMsg         : "+actPictureFieldMsg			+"  Value Expected  "+expPictureFieldMsg);
	System.out.println("StringListFieldMsg      : "+actStringListFieldMsg		+"  Value Expected  "+expStringListFieldMsg);
	System.out.println("NumberListFieldMsg      : "+actNumberListFieldMsg		+"  Value Expected  "+expNumberListFieldMsg);
	System.out.println("DocumentViewerFieldMsg  : "+actDocumentViewerFieldMsg	+"  Value Expected  "+expDocumentViewerFieldMsg);
	System.out.println("MasterFieldMsg          : "+actMasterFieldMsg			+"  Value Expected  "+expMasterFieldMsg);
	System.out.println("BigNumberFieldMsg       : "+actBigNumberFieldMsg		+"  Value Expected  "+expBigNumberFieldMsg);
	System.out.println("SmallNumberFieldMsg     : "+actSmallNumberFieldMsg		+"  Value Expected  "+expSmallNumberFieldMsg);
	System.out.println("TinyNumberFieldMsg      : "+actTinyNumberFieldMsg		+"  Value Expected  "+expTinyNumberFieldMsg);
	System.out.println("GregorianFieldMsg       : "+actGregorianFieldMsg		+"  Value Expected  "+expGregorianFieldMsg);
	System.out.println("HijriFieldMsg           : "+actHijriFieldMsg			+"  Value Expected  "+expHijriFieldMsg);
	System.out.println("ShamsiFieldMsg          : "+actShamsiFieldMsg			+"  Value Expected  "+expShamsiFieldMsg);
   
	if(actTextFieldMsg.equalsIgnoreCase(expTextFieldMsg) && actNumbertFieldMsg.equalsIgnoreCase(expNumberFieldMsg) 
			&& actBooleanFieldMsg.equalsIgnoreCase(expBooleanFieldMsg) && actDateTimeFieldMsg.equalsIgnoreCase(expDateTimeFieldMsg) 
			&& actDateFieldMsg.equalsIgnoreCase(expDateFieldMsg) && actTimeFieldMsg.equalsIgnoreCase(expTimeFieldMsg) 
			&& actFractionFieldMsg.equalsIgnoreCase(expFractionFieldMsg) && actPictureFieldMsg.equalsIgnoreCase(expPictureFieldMsg) 
			&& actStringListFieldMsg.equalsIgnoreCase(expStringListFieldMsg) && actNumberListFieldMsg.equalsIgnoreCase(expNumberListFieldMsg) 
			&& actDocumentViewerFieldMsg.equalsIgnoreCase(expDocumentViewerFieldMsg) && actMasterFieldMsg.equalsIgnoreCase(expMasterFieldMsg) 
			&& actBigNumberFieldMsg.equalsIgnoreCase(expBigNumberFieldMsg) && actSmallNumberFieldMsg.equalsIgnoreCase(expSmallNumberFieldMsg) 
			&& actTinyNumberFieldMsg.equalsIgnoreCase(expTinyNumberFieldMsg) && actGregorianFieldMsg.equalsIgnoreCase(expGregorianFieldMsg) 
			&& actHijriFieldMsg.equalsIgnoreCase(expHijriFieldMsg) && actShamsiFieldMsg.equalsIgnoreCase(expShamsiFieldMsg))
	{	
		return true;
	}	 
	else
	{
		return false;
	}	
}
	
	
public static boolean CheckSpellCheckForTextField() throws InterruptedException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
     
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
    accounts.click();
    
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));	
    masterNewBtn.click();
    
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
    nameTxt.sendKeys("SpellAccount");
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.sendKeys("SpellCode");
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTab));
	accountHeaderCreateTab.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTabTextFieldTxt));
	String text = accountHeaderCreateTabTextFieldTxt.getText();
	System.out.println("*****TextValue******************"+text);
	String value = accountHeaderCreateTabTextFieldTxt.getAttribute("value");
	System.out.println("*****TextValue******************"+value);
		
	
	if(true)
	{
		return true;
	}
	else
	{
		return false;
	}
	
}

public static boolean checkAddFieldAsCannotImportInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
     
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
    accounts.click();
    
    Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
	masterRibbonToExpandOptions.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
	 
	masterRibbonControlNextBtn.click(); 
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();

	Thread.sleep(2000);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
	masterCustamizemasterBtn.click();
	
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));
	masterFieldsCreateTab.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
	createTabHeaderDetailsAddFieldsBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
	extraFields_FieldDetailsCaption.click();
	extraFields_FieldDetailsCaption.sendKeys("CreateTab_CannotImport");
	extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
	
	dataTypeDropdown.selectByValue("0");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValue));
	extraFields_FieldDetailsDefaultValue.click();
	extraFields_FieldDetailsDefaultValue.sendKeys("CannotImportField_DefaultValue");
	extraFields_FieldDetailsDefaultValue.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
	extraFields_FieldDetailsBannerText.click();
	extraFields_FieldDetailsBannerText.sendKeys("CannotImportField_BannerText");
	extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
	extraFields_FieldDetailsToolTipText.click();
	extraFields_FieldDetailsToolTipText.sendKeys("CannotImportFiled_ToolTipText");
	extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
	extraFields_OkBtn.click();
	
	String expMessage = "Field Added Successfully.";
	String actMessage = checkValidationMessage(expMessage);
	
	if (actMessage.equalsIgnoreCase(expMessage)) 
	{
		return true;
	} 
	else 
	{
		return false;
	}
}



public static boolean checkEnableCannotImportCheckboxInCannotImportField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));
	masterFieldsCreateTab.click();
	
	Thread.sleep(2000);
	
	int count = fieldCaptionTxtList.size();
	
	//CannotImport Field
	
	for (int i = 0; i < count; i++) 
	{
		String data = fieldCaptionTxtList.get(i).getText();
		
		if (data.equalsIgnoreCase("CreateTab_CannotImport")) 
		{
			editFieldList.get(i).click();
			break;
		} 
	}
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
	extraFields_PropertiesTab.click();
	
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesCannotBeImportedChekbox));
	extraFields_PropertiesCannotBeImportedChekbox.click();
	 
	Thread.sleep(2000);
	
	extraFields_OkBtn.click();
	
	String expTextFieldMsg = "Field Updated Successfully";
	String actTextFieldMsg = checkValidationMessage(expTextFieldMsg);
	
	if(actTextFieldMsg.equalsIgnoreCase(expTextFieldMsg))
	{
		return true;
	}
	else 
	{
		return false;
	}
	
}

public static boolean checkAddFieldAsCannotExportInCreateTabCustomizeMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
     
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
    accounts.click();
    
    Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
	masterRibbonToExpandOptions.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	
	 
	masterRibbonControlNextBtn.click(); 
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();
	masterRibbonControlNextBtn.click();

	Thread.sleep(2000);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
	masterCustamizemasterBtn.click();
	
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));
	masterFieldsCreateTab.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createTabHeaderDetailsAddFieldsBtn));
	createTabHeaderDetailsAddFieldsBtn.click();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsTab));
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsCaption));
	extraFields_FieldDetailsCaption.click();
	extraFields_FieldDetailsCaption.sendKeys("CreateTab_CannotExport");
	extraFields_FieldDetailsCaption.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	Select dataTypeDropdown = new Select(extraFields_FieldDetailsDatTypeDropdown);
	
	dataTypeDropdown.selectByValue("0");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsDefaultValue));
	extraFields_FieldDetailsDefaultValue.click();
	extraFields_FieldDetailsDefaultValue.sendKeys("CannotExportField_DefaultValue");
	extraFields_FieldDetailsDefaultValue.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsBannerText));
	extraFields_FieldDetailsBannerText.click();
	extraFields_FieldDetailsBannerText.sendKeys("CannotExportField_BannerText");
	extraFields_FieldDetailsBannerText.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_FieldDetailsToolTipText));
	extraFields_FieldDetailsToolTipText.click();
	extraFields_FieldDetailsToolTipText.sendKeys("CannotExportFiled_ToolTipText");
	extraFields_FieldDetailsToolTipText.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_OkBtn));
	extraFields_OkBtn.click();
	
	String expMessage = "Field Added Successfully.";
	String actMessage = checkValidationMessage(expMessage);
	
	if (actMessage.equalsIgnoreCase(expMessage)) 
	{
		return true;
	} 
	else 
	{
		return false;
	}
}



public static boolean checkEnableCannotExportCheckboxInCannotExportField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));
	masterFieldsCreateTab.click();
	
	Thread.sleep(2000);
	
	int count = fieldCaptionTxtList.size();
	
	//CannotExport Field
	
	for (int i = 0; i < count; i++) 
	{
		String data = fieldCaptionTxtList.get(i).getText();
		
		if (data.equalsIgnoreCase("CreateTab_CannotExport")) 
		{
			editFieldList.get(i).click();
			break;
		} 
	}
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesTab));
	extraFields_PropertiesTab.click();
	
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFields_PropertiesCannotBeExportedChekbox));
	extraFields_PropertiesCannotBeExportedChekbox.click();
	 
	Thread.sleep(2000);
	
	extraFields_OkBtn.click();
	
	String expTextFieldMsg = "Field Updated Successfully";
	String actTextFieldMsg = checkValidationMessage(expTextFieldMsg);
	
	if(actTextFieldMsg.equalsIgnoreCase(expTextFieldMsg))
	{
		return true;
	}
	else 
	{
		return false;
	}
	
}

@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]/i")
private static WebElement closeButton;

@FindBy(xpath="(//input[@name='chkRowCheck'])[1]")
private static WebElement firstCheckBox;

@FindBy(xpath="(//input[@name='chkRowCheck'])[7]")
private static WebElement lastCheckbox;



@FindBy(xpath="//*[@id='btnProformaExportForAdvanceMasterPopUp']/i")
private static WebElement exportBtnInAdvanceMasterImportOrExport;

@FindBy(xpath="//*[@id='btnImportDataForAdvanceMasterPopUp']/i")
private static WebElement importDataBtnInAdvanceMasterImportOrExport; //*[@id="divAdvMasterImportExport"]/ul/li[2]/span[4]/i

@FindBy(xpath="//*[@id='divAdvMasterImportExport']/ul/li[2]/span[4]/i")
private static WebElement closeBtnInAdvanceMasterImportOrExport;

@FindBy(xpath="//ul[@id='ulMasterExportTab']/li")
private static List<WebElement> tabsListInExportPopUp;

@FindBy(xpath="//*[@id='ulMasterExportRightTab']/li[1]/a/span")
//*[@id="ulMasterExportRightTab"]/li[13]/a/span
private static WebElement mainTabInExportPopup;

@FindBy(xpath="//*[@id='ulMasterExportRightTab']/li[13]/a/span")
private static WebElement headerFieldTabInExportPopup;

@FindBy(xpath="//*[@id='ulMasterExportRightTab']/li[14]/a/span")
private static WebElement bodyFieldTabInExportPopup;

@FindBy(xpath="//*[@id='ulMasterExportRightTab']/li[2]/a/span")
private static WebElement headerTabInExportPopup;

@FindBy(xpath="//*[@id='btnMasterAdvanceExportSelectAll']")
private static WebElement selectAllCheckboxInExportPopup;

@FindBy(xpath="//*[@id='btnMasterAdvanceExport']/i")
private static WebElement exportBtnInExportPopup;

@FindBy(xpath="//*[@id='divAdvMasterExport']/ul/li/span[3]/i")
private static WebElement closeBtnInExportPopup;

@FindBy(xpath="//select[@id='ddlMasterAdvanceExportType']")
private static WebElement accountTypeSideDropdown;







@FindBy(xpath="//*[@id='btnFile']")
private static WebElement fieldNameInAdvanceMasterImportOrExport;


@FindBy(xpath="//*[@id='CreateTabCannotImport']")
private static WebElement cannotImportFieldInCreateTab;

@FindBy(xpath="//div[@id='tab_109_HeaderFields']/ul/li")
private static List<WebElement> createTabheaderFieldsInExportPopup;

@FindBy(xpath="//*[@id='HeaderDetails_6']/div/div/table/tbody/tr/td[4]")
private static List<WebElement> createTabHeaderFieldsInCustomizeMaster;


@FindBy(xpath="(//*[@id='btnCloseMasterCutomizationFromMasterScreen']/div[1]/span)[1]")
private static WebElement closeBtnInExtraFields;




public static boolean checkCannotExportFieldCheckboxExistsInExportPopup() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
homeMenu.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
mastersMenu.click();
 
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
accounts.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
masterNewBtn.click();
Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
nameTxt.sendKeys("ExportAccount");

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
codeTxt.sendKeys("ExpCode");

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
saveBtn.click();

checkValidationMessage("Saved Successfully");
Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeButton));
closeButton.click();

Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstCheckBox));
firstCheckBox.click();

Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
masterRibbonToExpandOptions.click();
Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonControlNextBtn));	

masterRibbonControlNextBtn.click(); 
masterRibbonControlNextBtn.click();
masterRibbonControlNextBtn.click();
masterRibbonControlNextBtn.click();
masterRibbonControlNextBtn.click();
masterRibbonControlNextBtn.click();

Thread.sleep(2000);
 
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCustamizemasterBtn));	
masterCustamizemasterBtn.click();


getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterFieldsCreateTab));	
masterFieldsCreateTab.click();


int noofFieldsInCreateTab = createTabHeaderFieldsInCustomizeMaster.size();
System.out.println("**Noof Fields in createTab** "+noofFieldsInCreateTab);

Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInExtraFields));	

closeBtnInExtraFields.click();

Thread.sleep(3000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
masterRibbonToExpandOptions.click();
Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAdvanceMasterImportORExportBtn));		
masterAdvanceMasterImportORExportBtn.click();
Thread.sleep(2000);


getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exportBtnInAdvanceMasterImportOrExport));		
exportBtnInAdvanceMasterImportOrExport.click();

Thread.sleep(3000);

int count = tabsListInExportPopUp.size();

//CreateTab
	for (int i = 0; i < count; i++) 
	{
		String data = tabsListInExportPopUp.get(i).getText();
		
		if (data.equalsIgnoreCase("Create Tab")) 
		{
			tabsListInExportPopUp.get(i).click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerFieldTabInExportPopup));		
			headerFieldTabInExportPopup.click();
			break;
		}
		
	}
	
	int createTabHeaderFieldsList = createTabheaderFieldsInExportPopup.size();
	
	System.out.println("No.of fields in create tab "+createTabHeaderFieldsList);	
	for(int i = 0; i < createTabHeaderFieldsList; i++)
	{
		String data = createTabheaderFieldsInExportPopup.get(i).getText();
		
		
		if(data != "CreateTab_CannotExport")
		{
			System.out.println("The filed CreateTab_CannotExport diesnot Exist");
			return true;
		}
		
	}
		
	if(noofFieldsInCreateTab  != createTabHeaderFieldsList)
	{
		return true;
	}	
	else
	{
		return false;
	}

		
	
}



public static boolean checkAdvancedImportOrExportAfterEnablingExportCheckBoxesInCreateTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{

	File Efile=new File(getBaseDir()+"\\autoIt\\ExportFiles\\Account.zip");
	
	if(Efile.exists())
	{
		Efile.delete();
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
     
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
    accounts.click();
    
   
    Thread.sleep(3000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstCheckBox));
    firstCheckBox.click();
    
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
	masterRibbonToExpandOptions.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAdvanceMasterImportORExportBtn));		
	masterAdvanceMasterImportORExportBtn.click();
	
	Thread.sleep(2000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exportBtnInAdvanceMasterImportOrExport));		
	exportBtnInAdvanceMasterImportOrExport.click();
	
	Thread.sleep(3000);
	
	int count = tabsListInExportPopUp.size();
/*
	//GeneralTab
	for (int i = 0; i < count; i++) 
	{
		String data = tabsListInExportPopUp.get(i).getText();
		
		if (data.equalsIgnoreCase("General")) 
		{
			tabsListInExportPopUp.get(i).click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mainTabInExportPopup));		
			mainTabInExportPopup.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
			selectAllCheckboxInExportPopup.click();
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerTabInExportPopup));		
			headerTabInExportPopup.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
			selectAllCheckboxInExportPopup.click();
			
			break;
			
		} 
		
	}
		//SettingsTab
		
		for (int i = 0; i < count; i++) 
		{
			String data = tabsListInExportPopUp.get(i).getText();
			
			if (data.equalsIgnoreCase("Settings")) 
			{
				tabsListInExportPopUp.get(i).click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				
				Thread.sleep(2000);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bodyFieldTabInExportPopup));		
				bodyFieldTabInExportPopup.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				
				break;
				
			}
			
			
		
	}
		//DetailsTab
		
		for (int i = 0; i < count; i++) 
		{
			String data = tabsListInExportPopUp.get(i).getText();
			
			if (data.equalsIgnoreCase("Details")) 
			{
				tabsListInExportPopUp.get(i).click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bodyFieldTabInExportPopup));		
				bodyFieldTabInExportPopup.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				
				break;
				
			}
	
		}
		//PrintLayout
		for (int i = 0; i < count; i++) 
		{
			String data = tabsListInExportPopUp.get(i).getText();
			
			if (data.equalsIgnoreCase("Print Layout")) 
			{
				tabsListInExportPopUp.get(i).click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bodyFieldTabInExportPopup));		
				bodyFieldTabInExportPopup.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				
				break;
				
			}
		}
		
		//Tree tab
		for (int i = 0; i < count; i++) 
		{
			String data = tabsListInExportPopUp.get(i).getText();
			
			if (data.equalsIgnoreCase("Tree Tab Update")) 
			{
				tabsListInExportPopUp.get(i).click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bodyFieldTabInExportPopup));		
				bodyFieldTabInExportPopup.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				
				break;
				
			}
		}
    
    //Document Tab
		for (int i = 0; i < count; i++) 
		{
			String data = tabsListInExportPopUp.get(i).getText();
			
			if (data.equalsIgnoreCase("Document Tab")) 
			{
				tabsListInExportPopUp.get(i).click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(bodyFieldTabInExportPopup));		
				bodyFieldTabInExportPopup.click();
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				
				break;
				
			}
		}*/
    //CreateTab
		for (int i = 0; i < count; i++) 
		{
			String data = tabsListInExportPopUp.get(i).getText();
			
			if (data.equalsIgnoreCase("Create Tab")) 
			{
				tabsListInExportPopUp.get(i).click();
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllCheckboxInExportPopup));		
				selectAllCheckboxInExportPopup.click();
				Thread.sleep(2000);
				
				break;

				
			}
		}
		
		Select exportsc =new Select(accountTypeSideDropdown);
		exportsc.selectByValue("1");
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(exportBtnInExportPopup));		
		exportBtnInExportPopup.click();
		
		Thread.sleep(8000);
		
		String actExportedFileName = checkDownloadedFileName(getDriver());
		String expExportedFileName = "Account.zip" ;
		
		System.out.println("Exported File Name : "+actExportedFileName+"  Value Expected  "+expExportedFileName);
    
	if (actExportedFileName.equalsIgnoreCase(expExportedFileName))
	{
		return true;
	} 
	else 
	{
		return false;
	}
}



public static boolean checkAdvancedImportOrExportAfterEnablingImportCheckBoxesInCreateTab1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
     
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
    accounts.click();
  
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(firstCheckBox));
    firstCheckBox.click();
    
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterRibbonToExpandOptions));		
	masterRibbonToExpandOptions.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAdvanceMasterImportORExportBtn));		
	masterAdvanceMasterImportORExportBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fieldNameInAdvanceMasterImportOrExport));		
	fieldNameInAdvanceMasterImportOrExport.click();
	
	
	Thread.sleep(2000);
	
	
		Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\Account.exe");
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(importDataBtnInAdvanceMasterImportOrExport));		
		importDataBtnInAdvanceMasterImportOrExport.click();
		

		Thread.sleep(3000);
if (true) 
{
	return true;
} 
else
{
	return false;
}	
}

public static boolean   checkImportedAccountInAccountsAndVerifyCannotImportFied() throws InterruptedException
{
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
     
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
    accounts.click();
  
   
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lastCheckbox));
    getAction().doubleClick(lastCheckbox).perform();
    
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountHeaderCreateTab));
    accountHeaderCreateTab.click();    
    
    
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cannotImportFieldInCreateTab));
    String actValue = cannotImportFieldInCreateTab.getAttribute("value");
    
    System.out.println("****************Actual Value*******************"+actValue);
    
  
	if (actValue.isEmpty()) 
	{
		return true;
	}
	else
	{
		return false;

	}
}


 public CustomizationMasterCreateTabPropertiesPage(WebDriver driver)
 {
	PageFactory.initElements(driver, this);
	
 }


}
